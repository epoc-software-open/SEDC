var DeveloperMenu = {
	initialize: function () {
		Function.prototype.closure = function (obj, args, appendArgs) {
			var fun = this;
			return function () {
				var funcArgs = args || arguments;
				if (appendArgs === true) {
					funcArgs = Array.prototype.slice.call(arguments, 0);
					funcArgs = funcArgs.concat(args);
				}
				return fun.apply(obj || window, funcArgs);
			};
		};

		this.Menu.initialize();
		this.Menu.loadSdApplications();
		this.Menu.attachHandlers();
	},

	Devices: {
		Android: "Android",
		BlackBerry: "BlackBerry",
		iOS: "iOS"
	},

	Dom: {
		el: function (id) {
			if (id.tagName)
				return id;
			return document.getElementById(id);
		},

		byTag: function (name, root) {
			root = root || document;
			return root.getElementsByTagName(name);
		},

		byClass: function (name, tag, root) {
			if (document.getElementsByClassName) {
				var root = root || document;
				return root.getElementsByClassName(name);
			}
			else {
				var classElements = [];
				var els = this.byTag(tag || '*', root);
				var len = els.length;
				var pattern = new RegExp("(^|\\s)" + name + "(\\s|$)");
				for (i = 0, j = 0; i < len; i++) {
					if (pattern.test(els[i].className)) {
						classElements[j] = els[i];
						j++;
					}
				}
				return classElements;
			}
		},

		hasClass: function (id, className) {
			var el = DeveloperMenu.Dom.el(id);
			if (el) {
				return className && (' ' + el.className + ' ').indexOf(' ' + className + ' ') != -1;
			}
		},

		addClass: function (id, className) {
			var el = DeveloperMenu.Dom.el(id);
			if (el) {
				if (className && !this.hasClass(id, className)) {
					el.className = el.className + " " + className;
				}
			}
		},

		classReCache: {},
		removeClass: function (id, className) {
			var el = DeveloperMenu.Dom.el(id);
			if (el) {
				if (this.hasClass(id, className)) {
					var re = this.classReCache[className];
					if (!re) {
						re = new RegExp('(?:^|\\s+)' + className + '(?:\\s+|$)', "g");
						this.classReCache[className] = re;
					}
					el.className = el.className.replace(re, " ");
				}
			}
		},

		attachEvent: function (el, evtName, handler, scope) {
			if (scope)
				handler = handler.closure(scope);
			if (el.addEventListener)
				el.addEventListener(evtName, handler, false);
			else
				el.attachEvent('on' + evtName, handler);
		},

		getComputedStyle: function (el, style) {
			var computedStyle;
			if (typeof el.currentStyle != 'undefined') {
				computedStyle = el.currentStyle;
			}
			else {
				computedStyle = document.defaultView.getComputedStyle(el, null);
			}

			return computedStyle[style];
		},

		getEventTarget: function (e, className, levels) {
			var node = e.target || e.srcElement,
				depth = levels + 1;
			while (node && depth--) {
				if (this.hasClass(node, className))
					return node;
				node = node.parentNode;
			}
		}
	},

	Util: {
		getStaticUrl: function () {
			if (this.staticUrl === undefined) {
				var req = DeveloperMenu.Ajax.getRequestObj();
				if (req) {
					req.open('GET', 'gxcfg.js?' + Math.random(), false);

					req.send();

					if (req.readyState == 4) {
						if (req.status == 200) {
							try {
								var matches = req.responseText.match(/gx\.setStaticDirectory\([^;]+\);/g);
								if (matches && matches[0])
									eval(matches[0]);
								else
									this.staticUrl = "";
							}
							catch (e) {
								this.staticUrl = "";
							}
						}
					}
				}
			}
			return this.staticUrl
		},

		getCurrentUrl: function () {
			var href = document.location.href;
			return href.substring(0, href.lastIndexOf('/'));
		},

		getAppBaseUrl: function () {
			var appBaseUrl = DeveloperMenu.Util.getCurrentUrl();
			var staticUrl = this.getStaticUrl();
			if (staticUrl)
				appBaseUrl = appBaseUrl.replace(new RegExp(staticUrl + "$"), "");

			if (appBaseUrl.substring(appBaseUrl.length - 1) == "/")
				appBaseUrl = appBaseUrl.substr(0, appBaseUrl.length - 1)

			return appBaseUrl;
		},

		QR_CODE_GENERATOR_URL: "http://sdx.genexus.com/agetqrcode.aspx?",

		getQRCodeImage: function (url) {
			return this.QR_CODE_GENERATOR_URL + url;
		}

	},

	Cookies: {
		create: function (name, value, days) {
			if (days) {
				var date = new Date();
				date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
				var expires = "; expires=" + date.toGMTString();
			}
			else var expires = "";
			document.cookie = name + "=" + value + expires + "; path=/";
		},

		read: function (name) {
			var nameEQ = name + "=";
			var ca = document.cookie.split(';');
			for (var i = 0; i < ca.length; i++) {
				var c = ca[i];
				while (c.charAt(0) == ' ') c = c.substring(1, c.length);
				if (c.indexOf(nameEQ) == 0) return c.substring(nameEQ.length, c.length);
			}
			return null;
		},

		erase: function (name) {
			createCookie(name, "", -1);
		}
	},

	Browser: {
		isIE: function () {
			return (navigator.userAgent.indexOf("MSIE") != -1 || navigator.userAgent.indexOf("Trident") != -1);
		}
	},

	Menu: {
		initialize: function () {
			var kbnBoxEl = DeveloperMenu.Dom.el('kbn-box');
			var sdAppsBoxEl = DeveloperMenu.Dom.el('sdapps-box');
			var objsBoxEl = DeveloperMenu.Dom.el('objs-box');
			// WA for IE
			setTimeout((function () {
				this.initBox(kbnBoxEl);
				this.initBox(sdAppsBoxEl);
				this.initBox(objsBoxEl);
			}).closure(this), 300);
			this.applyBoxState(kbnBoxEl);
			this.applyBoxState(sdAppsBoxEl);
			this.applyBoxState(objsBoxEl);

			// Show SD boxes only if qrcode flag is passed
			if (document.location.search.substring(1) == 'qrcode') {
				this.boxCollapse(objsBoxEl, false);
				this.boxExpand(kbnBoxEl, false);
				this.boxExpand(sdAppsBoxEl, false);
			}
		},

		initBox: function (boxEl) {
			setTimeout(function () {
				DeveloperMenu.Dom.addClass(boxEl, "box-fx");
			});
		},

		applyBoxState: function (boxEl) {
			var isCollapsed = DeveloperMenu.Cookies.read(boxEl.id + "_collapsed");
			if (isCollapsed == "1")
				DeveloperMenu.Dom.addClass(boxEl, "box-collapsed");
		},

		getBoxHeader: function (boxEl) {
			for (var i = 0, len = boxEl.childNodes.length; i < len; i++) {
				if (DeveloperMenu.Dom.hasClass(boxEl.childNodes[i], 'box-title'))
					return boxEl.childNodes[i];
			}
		},

		BOX_COLLAPSED_CLASS: 'box-collapsed',

		boxCollapse: function (boxEl, saveState) {
			DeveloperMenu.Dom.addClass(boxEl, this.BOX_COLLAPSED_CLASS);
			if (saveState !== false)
				DeveloperMenu.Cookies.create(boxEl.id + "_collapsed", "1");
		},

		boxExpand: function (boxEl, saveState) {
			DeveloperMenu.Dom.removeClass(boxEl, this.BOX_COLLAPSED_CLASS);
			if (saveState !== false)
				DeveloperMenu.Cookies.create(boxEl.id + "_collapsed", "0");
		},

		toggleBoxCollapse: function (boxEl) {
			if (DeveloperMenu.Dom.hasClass(boxEl, this.BOX_COLLAPSED_CLASS)) {
				this.boxExpand(boxEl);
			}
			else {
				this.boxCollapse(boxEl);
			}
		},

		handleBoxClick: function (el, e) {
			DeveloperMenu.Menu.toggleBoxCollapse(el.parentNode);
		},

		loadSdApplications: function () {
			var req = DeveloperMenu.Ajax.getRequestObj();
			if (req) {
				var callback = this.loadSdApplicationsCallback.closure(this, [req]);
				if (DeveloperMenu.Browser.isIE())
					req.onreadystatechange = callback;
				else {
					req.onload = callback;
					req.onerror = this.loadSdApplicationsFailureCallback.closure(this, [req]);
				}


				req.open('GET', DeveloperMenu.Util.getAppBaseUrl() + '/gxmetadata/sdapps.json?' + Math.random());

				req.send();
			}
		},

		loadSdApplicationsCallback: function (req) {
			if (req.readyState == 4) {
				if (req.status == 200) {
					var sdApps = {};
					if (req.responseText) {
						eval("sdApps = " + req.responseText);
						this.enableSDBoxes();
						this.updateKbnImage();
						this.renderMenu(sdApps);
						return;
					}
				}
				this.loadSdApplicationsFailureCallback(req);
			}
		},

		loadSdApplicationsFailureCallback: function (req) {
			this.disableSDBoxes();
		},

		ENABLED_SD_BOX_CLASS: 'box-disabled',
		enableSDBoxes: function () {
			var kbnBoxEl = DeveloperMenu.Dom.el('kbn-box');
			DeveloperMenu.Dom.removeClass(kbnBoxEl, this.ENABLED_SD_BOX_CLASS);
			var sdAppsBoxEl = DeveloperMenu.Dom.el('sdapps-box');
			DeveloperMenu.Dom.removeClass(sdAppsBoxEl, this.ENABLED_SD_BOX_CLASS);
		},

		disableSDBoxes: function () {
			var kbnBoxEl = DeveloperMenu.Dom.el('kbn-box');
			DeveloperMenu.Dom.addClass(kbnBoxEl, this.ENABLED_SD_BOX_CLASS);
			var sdAppsBoxEl = DeveloperMenu.Dom.el('sdapps-box');
			DeveloperMenu.Dom.addClass(sdAppsBoxEl, this.ENABLED_SD_BOX_CLASS);
		},

		updateKbnImage: function () {
			var appUrl = DeveloperMenu.Util.getAppBaseUrl(),
				kbnQRCodeEl = DeveloperMenu.Dom.el('kbn-qrcode'),
				kbnQRCodeUrlEl = DeveloperMenu.Dom.el('kbn-qrcode-url'),
				qrCodeUrl = DeveloperMenu.Util.getQRCodeImage(appUrl);

			kbnQRCodeEl.src = qrCodeUrl;
			kbnQRCodeUrlEl.innerHTML += appUrl;
		},

		getFileNameByDevice: function (app, device) {
			if (device == DeveloperMenu.Devices.Android)
				return app.n + '.' + "apk";
			else if (device == DeveloperMenu.Devices.BlackBerry)
				return 'blackberry/' + app.n + '_OS5.jad';
			return "";
		},

		renderQRCodeCell: function (app, buffer, device) {
			var fileName = this.getFileNameByDevice(app, device),
				fileUrl = DeveloperMenu.Util.getAppBaseUrl() + "/" + fileName,
				qrCodeUrl = DeveloperMenu.Util.getQRCodeImage(fileUrl);

			buffer.push('<td>');
			buffer.push('<div class="qrcode-box">');
			buffer.push('<a class="qrcode-link" target="_blank" href="');
			buffer.push(fileUrl);
			buffer.push('">');
			buffer.push('<img class="qrcode" src="');
			buffer.push(qrCodeUrl);
			buffer.push('" alt="');
			buffer.push(app.n);
			buffer.push(' QR code for ');
			buffer.push(device);
			buffer.push(': ');
			buffer.push(fileUrl);
			buffer.push('" title="Click to download package"/>');
			buffer.push('</a>');
			buffer.push('<a class="qrcode-zoom"');
			buffer.push('>');
			buffer.push('<img src="devmenu/zoom.png" alt="Zoom QR code" title="Click to zoom QR code" />');
			buffer.push('</a>');
			buffer.push('</div>');
			buffer.push('</td>');
		},

		renderMenu: function (sdApps) {
			if (sdApps.apps && sdApps.apps.length > 0) {
				var buffer = [];
				for (var i = 0, len = sdApps.apps.length; i < len; i++) {
					var app = sdApps.apps[i];
					buffer.push('<tr>');
					buffer.push('<td>');
					buffer.push(app.n);
					buffer.push('</td>');
					this.renderQRCodeCell(app, buffer, DeveloperMenu.Devices.Android);
					this.renderQRCodeCell(app, buffer, DeveloperMenu.Devices.BlackBerry);
					buffer.push('</tr>');
				}

				var tbody = DeveloperMenu.Dom.el("apps-matrix-body");
				if (DeveloperMenu.Browser.isIE()) {
					var table = DeveloperMenu.Dom.el("apps-matrix");
					var theadHtml = table.tHead.outerHTML;
					var ct = table.parentNode;
					ct.removeChild(table);
					ct.innerHTML += '<table id="apps-matrix">' + theadHtml + buffer.join("") + '</table>';
				}
				else {
					var tbody = DeveloperMenu.Dom.el("apps-matrix-body");
					tbody.innerHTML = buffer.join("");
				}

				this.checkSDDownloadLinks();
			}
		},

		attachHandlers: function () {
			DeveloperMenu.Dom.attachEvent(document.body, 'click', this.handleBodyClick, this);
		},

		handleBodyClick: function (e) {
			e = e || event;
			var target = DeveloperMenu.Dom.getEventTarget(e, 'qrcode-zoom', 1);
			if (target)
				this.handleZoomClick(target, e);
			else {
				target = DeveloperMenu.Dom.getEventTarget(e, 'box-title', 1);
				if (target)
					this.handleBoxClick(target, e)
			}
		},

		handleZoomClick: function (el, e) {
			var boxEl = el.parentNode;
			var qrcodeEls = DeveloperMenu.Dom.byClass('qrcode', 'img', boxEl);
			if (qrcodeEls)
				qrcodeEls[0].style.maxWidth = '200px';
			el.style.display = 'none';
		},

		checkSDDownloadLinks: function () {
			setTimeout((function () {
				var appMatrixEl = DeveloperMenu.Dom.el('apps-matrix');
				var links = DeveloperMenu.Dom.byClass('qrcode-link', 'a', appMatrixEl);
				for (var i = 0, len = links.length; i < len; i++) {
					this.checkDownloadLink(links[i]);
				}
			}).closure(this), 100);
		},

		checkDownloadLink: function (qrCodeUrlEl) {
			var req = DeveloperMenu.Ajax.getRequestObj();
			if (req) {
				var callback = this.checkDownloadLinkCallback.closure(this, [qrCodeUrlEl, req, false]);
				if (DeveloperMenu.Browser.isIE())
					req.onreadystatechange = callback;
				else {
					req.onload = callback;
					req.onerror = this.checkDownloadLinkCallback.closure(this, [qrCodeUrlEl, req, true]);
				}

				req.open('HEAD', qrCodeUrlEl.href);

				req.send();
			}
		},

		checkDownloadLinkCallback: function (qrCodeUrlEl, req, failure) {
			if (req.readyState == 4) {
				if (failure || req.status == 404) {
					qrCodeUrlEl.parentNode.style.opacity = 0.2;
					qrCodeUrlEl.firstChild.setAttribute('title', 'Package is not available for download.');
				}
			}
		}
	},

	Ajax: {
		getRequestObj: function () {
			var req = null;
			try {
				req = new ActiveXObject('Msxml2.XMLHTTP');
			}
			catch (e) {
				try {
					req = new ActiveXObject('Microsoft.XMLHTTP');
				}
				catch (e) { }
			}
			if (req == null && typeof (XMLHttpRequest) != 'undefined') {
				req = new XMLHttpRequest();
			}
			return req;
		}
	}
};

gx = {
	setStaticDirectory: function (url) {
		DeveloperMenu.Util.staticUrl = url;
	},
	text: {
		chr: function (code) {
			return String.fromCharCode(code);
		}
	}
};

// WA for older IE versions, so CSS can be applied to header elements
if (DeveloperMenu.Browser.isIE())
	document.createElement("header");
