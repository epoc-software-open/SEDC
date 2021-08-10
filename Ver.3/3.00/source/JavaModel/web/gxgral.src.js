/* START OF FILE - ..\js\gxapi.js - */
var gx = (function ($) {
	var VAR_PREFIX_REGEX_1 = /^(?:gx\.O\.)(.+)$/,
		VAR_PREFIX_REGEX_2 = /^(?:.+)?\((?:gx\.O\.)([a-zA-Z0-9_]+)(?:,)?(?:.*)\)$/;
		
	var GX_THEME_CSS_ELEMENT = 'gxtheme_css_reference';

	var trueFn = function () { return true; };
	var falseFn = function () { return false; };

	return {
		// Members whose value is the same when navigating through different pages, 
		// can be initialized here. If the value of the member changes
		// between pages, it must be initialized inside the _init function, so SPA can
		// re-initialize it when the user navigates.
		$:$.noConflict(),
		O: null,
		pO: null,
		languageCode: 'eng',
		dateFormat: 'MDY',
		timeFormat: 12,
		blankWhenEmpty: false,
		centuryFirstYear: 40,
		decimalPoint: '.',
		thousandSeparator: ',',
		staticDirectory: '/',
		basePath: '',
		datepickerImage: null,
		clientImages: {},
		blankImage: null,
		ascImage: null,
		descImage: null,
		expandImage: null,
		collapseImage: null,
		downloadImage: null,
		indicatorImage: null,
		resizeImage: null,
		msg: {},
		NULL_TIMEZONEOFFSET: 0,
		emptyFn: function () { },
		falseFn: falseFn,
		trueFn: trueFn,

		define: function (Name, IsComponent, Ctr) {
			var i = 0;
			var fn = (window || this);
			var arr = Name.split(".");
			var len = arr.length;
			for (i = 0; i < len - 1; i++) {
				if (typeof (fn[arr[i]]) == "undefined") {
					fn[arr[i]] = {};
				}
				fn = fn[arr[i]];
			}
			fn[arr[len - 1]] = Ctr;
			if (!IsComponent) {
				fn[arr[len - 1]].prototype = new gx.GxObject();
			}
		},

		setParentObj: function (GxObj) {
			gx.pO = GxObj;
			gx.O = gx.pO;
			gx.AjaxSecurity = gx.pO.AjaxSecurity;
			gx.OnSessionTimeout = gx.pO.OnSessionTimeout;
		},

		createParentObj: function (GxObjClass) {
			var GxObj;
			if (!gx.spa.started) {
				if (!(GxObjClass instanceof gx.GxObject)) {
					GxObj = new GxObjClass();
				}
				
				if (GxObj) {
					this.setParentObj(GxObj);
				}
			}
			return GxObj;
		},

		setExecutableComponent: function (ObjType) {
			gx.fx.obs.addObserver('gx.onready', this, function () {
				if (gx.pO == null) {
					gx.setParentObj(gx.createComponent(ObjType, ""));
				}
			}, { single: true });
		},

		setMasterPage: function (MPage) {
			if (gx.pO != null) {
				gx.pO.MasterPage = MPage;
			}
		},

		addComponent: function (gxComp) {
			if (gx.pO != null) {
				gx.pO.setWebComponent(gxComp);
			}
		},

		createComponent: function (CmpType, CmpCtx, CmpContainer) {
			var webComp = null, cmpClass, tCmp;
			cmpClass = gx.lang.getType(CmpType);
			if (cmpClass != null) {
				cmpClass.prototype = new gx.GxObject();
				tCmp = gx.csv.cmpCtx;
				gx.csv.cmpCtx = CmpCtx;
				webComp = new cmpClass(CmpCtx);
				if (CmpContainer) {
					webComp.setContainer(CmpContainer);
				}
				gx.csv.cmpCtx = tCmp;
			}
			return webComp;
		},

		getObj: function (CmpContext, IsMasterPage) {
			if (CmpContext == '') {
				if (IsMasterPage == true)
					return gx.pO.MasterPage;
				else
					return gx.pO;
			}
			else
				return gx.pO.getWebComponent(CmpContext);
		},

		setGxO: function () {
			var CmpContext, 
				IsMasterPage;

			if (arguments.length == 1 && typeof arguments[0] == 'object') {
				CmpContext = arguments[0].CmpContext;
				IsMasterPage = arguments[0].IsMasterPage;
			}
			else {
				CmpContext = arguments[0];
				IsMasterPage = arguments[1];
			}
			gx.csv.cmpCtx = CmpContext;
			gx.O = this.getObj(CmpContext, IsMasterPage) || gx.pO;
			return gx.O;
		},

		setVar: function (VarName, Value) {
			gx.O.setVariable(VarName, Value);
		},

		getVar: function (VarName) {
			return gx.O.getVariable(VarName);
		},

		prefixVar: function (VarName) {
			return 'gx.O.' + VarName;
		},

		unprefixVar: function (pVarName) {
			var varRE = VAR_PREFIX_REGEX_1;
			var isMatch = varRE.exec(pVarName);
			if (isMatch != null && isMatch[1]) {
				pVarName = isMatch[1];
			}
			else {
				varRE = VAR_PREFIX_REGEX_2;
				isMatch = varRE.exec(pVarName);
				if (isMatch != null && isMatch[1]) {
					pVarName = isMatch[1];
				}
			}
			return pVarName;
		},

		getMessage: function (code) {
			if (gx.msg[code] == undefined)
				return code;
			else
				return gx.msg[code];
		},

		setLanguageCode: function (value) {
			gx.languageCode = value;
		},

		setDateFormat: function (value) {
			gx.dateFormat = value;
		},

		setTimeFormat: function (value) {
			gx.timeFormat = value;
		},

		setCenturyFirstYear: function (value) {
			gx.centuryFirstYear = value;
		},

		setBlankWhenEmptyDate: function (value) {
			gx.blankWhenEmpty = value;
		},

		setDecimalPoint: function (value) {
			gx.decimalPoint = value;
		},

		setThousandSeparator: function (value) {
			gx.thousandSeparator = value;
		},

		setStaticDirectory: function (value) {
			gx.staticDirectory = value;
			if (gx.staticDirectory == '') {
				gx.staticDirectory = '/';
			}
			else {
				var len = gx.staticDirectory.length;
				var addFBar = (gx.staticDirectory.charAt(0) != '/');
				var addLBar = (gx.staticDirectory.charAt(len - 1) != '/');

				gx.staticDirectory = ((addFBar ? '/' : '') + gx.staticDirectory + (addLBar ? '/' : ''));
			}
		},

		getThemeElement: function () {
			return gx.dom.byId(GX_THEME_CSS_ELEMENT);
		},

		updateTheme: function () {
			var newTheme = gx.fn.getHidden('GX_THEME');
			if (newTheme && newTheme != this.theme) {
				this.theme = newTheme;
				var theme_el = gx.getThemeElement();
				if (theme_el)
					theme_el.href = theme_el.href.replace(new RegExp("[^/]*\.css"), this.theme + '.css');
			}
		},

		setTheme: function (root) {
			var browser = gx.util.browser,
				isIE = browser.isIE(),
				ieVersion = browser.ieVersion(),
				gxDomFixes = gx.dom.fixes;

			this.theme = gx.fn.getHidden('GX_THEME');
			if (!this.theme) {
				this.theme = '';
			}
			try {
				if (gx.HTML5) {
					gxDomFixes.html5(root);
				}

				if (root === undefined) {
					if (isIE) {
						$(document.documentElement).addClass("ie");
						$(document.documentElement).addClass("ie" + ieVersion);
					}

					// WA for IE10 bug: https://connect.microsoft.com/IE/feedback/details/776537/
					if (isIE && ieVersion == 10) {
						var styleEl = document.createElement("style");
						styleEl.innerHTML = "input::-ms-clear {display: none;}";
						document.body.appendChild(styleEl);
					}

					gxDomFixes.popupMinWidth();
				}

				gxDomFixes.fixTableResets(root);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxapi.js', 'setTheme');
			}
		},

		SetOld: function (Fld, Ctrl, Var) {
			var ctrlId = Ctrl;
			var GridId = gx.fn.controlGridId(Fld);
			if (GridId > 0) {
				ctrlId = Ctrl + '_' + gx.fn.currentGridRow(GridId);
			}
			gx.fn.setHidden(ctrlId, gx.getVar(Var));
		},

		Old: function (Fld, Ctrl) {
			try {
				var ctrlId = Ctrl;
				var GridId = gx.fn.controlGridId(Fld);
				if (GridId > 0) {
					ctrlId = Ctrl + '_' + gx.fn.currentGridRow(GridId);
				}
				var oldValue = gx.fn.getHidden(ctrlId);
				if (typeof (oldValue) == 'undefined' && (gx.O.CmpContext != '')) {
					oldValue = gx.fn.getHidden(gx.O.CmpContext + ctrlId);
				}
				return oldValue;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxapi.js', 'Old');
			}
			return '';
		},

		OldInteger: function (Fld, Var) {
			var nIntVal = parseInt(gx.Old(Fld, Var), 10);
			return isNaN(nIntVal) ? 0 : nIntVal;
		},

		OldDecimal: function (Fld, Var) {
			var nDecVal = gx.num.parseFloat(gx.Old(Fld, Var), gx.thousandSeparator, gx.decimalPoint);
			return isNaN(nDecVal) ? 0 : nDecVal;
		},

		OldDate: function (Fld, Var) {
			var gxD = new gx.date.gxdate(gx.Old(Fld, Var), 'Y4MD');
			return gxD.getStringWithFmt(gx.dateFormat);
		},

		OldDateTime: function (Fld, Var) {
			var gxD = new gx.date.gxdate(gx.Old(Fld, Var), 'Y4MD');
			return gxD.getStringWithFmt(gx.dateFormat) + ' ' + gxD.getTimeString(true, true);
		},

		typedOld: function (ctrlName, varName, type) {
			switch (type) {
				case 'int':
					return this.OldInteger(ctrlName, varName);
				case 'decimal':
					return this.OldDecimal(ctrlName, varName, true);
				case 'date':
					return this.OldDate(ctrlName, varName);
				case 'dtime':
					return this.OldDateTime(ctrlName, varName);
				default:
					return this.Old(ctrlName, varName);
			}
		},

		types: {
			numeric: 0,
			character: 1,
			date: 2,
			dateTime: 3,
			blob: 4,
			varChar: 5,
			longVarChar: 6,
			bool: 7,
			geolocation: 8
		},
		domains: {
			url: "Url",
			email: "Email",
			phone: "Phone",
			address: "Address",
			geolocation: "Geolocation",
			component: "Component",
			feed: "Feed"
		},

		gen: {
			net: false,

			isDotNet: function () {
				return this.net;
			},
			isRuby: falseFn,
			isJava: function () {
				return !this.net;
			}
		},

		dom: {
			_form: null,
			_avoidLeaksDiv: null,

			id: function (Control) {
				return ((Control.id == undefined || Control.id == '') ? Control.name : Control.id);
			},

			byId: function (id, root) {
				root = root || document;
				return root.getElementById(id);
			},

			byName: function (name) {
				return document.getElementsByName(name);
			},

			byTag: function (name, root) {
				root = root || document;
				return root.getElementsByTagName(name);
			},

			byClass: function (name, tag, root) {
				return $((tag || "") + "." + name, root).toArray();
			},

			el: function (id) {
				//Critical function, changes here impact performance
				if (!id) {
					return null;
				}
				else if (typeof id == 'object' && id.tagName) {
					return id;
				}
				else {
					var ctrl = this.byId(id);
					if (ctrl != null) {
						return ctrl;
					}
					ctrl = this.byId("span_" + id);
					if (ctrl != null) {
						return ctrl;
					}
					ctrl = this.byName(id);
					if (ctrl != null && ctrl.length > 0) {
						return ctrl[0];
					}
					return null;
				}
			},

			hasAttribute: function(el, attrName) {
				return el.hasAttribute ? el.hasAttribute(attrName): el[attrName] !== undefined;
			},
			
			hasClass: function (id, className) {
				var el = gx.dom.el(id);
				if (el) {
					return className && (' ' + el.className + ' ').indexOf(' ' + className + ' ') != -1;
				}
			},

			addPrefixClass: function (el, prefixClass) {
				if (el) {
					var $el = $(el);
					if (el.className && !$el.attr('data-gx-unprefixed-class')) {
						$el.attr('data-gx-unprefixed-class', el.className);
						var classes = el.className.split(" ");
						classes.splice(0, 0, "");
						el.className += classes.join(" " + prefixClass);
					}
				}
			},

			removePrefixClass: function (el, prefixClass) {
				if (el) {
					var $el = $(el);
					if (el.className.search(new RegExp("(^|\\s)" + prefixClass)) >= 0) {
						var oldClassName = $el.attr('data-gx-unprefixed-class');
						$el.removeAttr('data-gx-unprefixed-class');
						el.className = oldClassName || el.className.substring(prefixClass.length);
					}
				}
			},

			addClass: function (id, className) {
				var el = gx.dom.el(id);
				if (el) {
					if (className && !this.hasClass(id, className)) {
						el.className = el.className + " " + className;
					}
				}
			},

			classReCache: {},
			removeClass: function (id, className) {
				var el = gx.dom.el(id);
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

			hasTransition: function (el) {
				if (el && Modernizr.csstransitions) {
					var browser = gx.util.browser;
					var property = "transitionDuration";
					if (browser.isIE())
						property = "msTransitionDuration";
					if (browser.isWebkit())
						property = "webkitTransitionDuration";
					else if (browser.isFirefox())
						property = "MozTransitionDuration";
					else if (browser.isOpera())
						property = "OTransitionDuration";

					var value = parseFloat(gx.dom.getComputedStyle(el)[property], 10);
					return value !== 0 && !isNaN(value);
				}
				return false;
			},

			hasAnimation: function (el) {
				if (el && Modernizr.csstransitions)
				{
					var browser = gx.util.browser;
					var property = "animationName";
					if (browser.isIE())
						property = "msAnimationName";
					if (browser.isWebkit())
						property = "webkitAnimationName";
					else if (browser.isFirefox())
						property = "MozAnimationName";
					else if (browser.isOpera())
						property = "OAnimationName";

					var value = gx.dom.getComputedStyle(el)[property];
					return value && value != 'none';
				}
				return false;
			},

			isMultimediaElement: function (el) {
				return el.tagName == 'SPAN' && (gx.dom.hasClass(el, "gx-video-placeholder") || gx.dom.hasClass(el, "gx-audio-placeholder"))
			},

			purgeElement: function (d, atts) {
				var a = atts || d.attributes, i, l, n;
				if (a) {
					l = a.length;
					for (i = 0; i < l; i += 1) {
						n = a[i].name || a[i];
						if (typeof d[n] === 'function') {
							d[n] = null;
						}
					}
				}
			},

			purge: function (d, onlyChildNodes) {
				if (!onlyChildNodes) {
					this.purgeElement(d);
				}

				var childNodes = d.childNodes;
				if (childNodes) {
					for (var i = 0, l = childNodes.length; i < l; i++) {
						gx.dom.purge(childNodes[i], false);
					}
				}
			},

			shouldPurge: function () {
				return gx.purgeElements && gx.util.browser.isIE() && gx.util.browser.ieVersion() <= 8;
			},

			form: function () {
				if (this._form == null) {
					this._form = document.forms["MAINFORM"];
					if (!this._form)
						this._form = document.forms[0];
				}
				return this._form;
			},

			indexElements: function () {
				if (!document.all) {
					var els = this.form().elements;
					var len = els.length;
					for (var i = 0; i < len; i++) {
						els[i].gxIndex = i;
					}
				}
			},

			setAttribute: function (Control, AttName, AttValue) {
				var doSetAtt = function () {
					try {
						var Ctrls = gx.dom.byName(Control);
						if (Ctrls != null && Ctrls.length > 0) {
							var rLen = Ctrls.length;
							for (var i = 0; i < rLen; i++) {
								Ctrls[i].setAttribute(AttName, AttValue);
							}
						} else {
							var Ctrl = gx.dom.byId(Control);
							if (Ctrl != null)
								Ctrl.setAttribute(AttName, AttValue);
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'setAttribute');
					}
				};

				if (document.gxReadyState == 'loading') {
					gx.fx.obs.addObserver('gx.onload', this, doSetAtt, { single: true });
				}
				else {
					doSetAtt.apply(this);
				}
			},

			createInput: function (ControlId, Type) {
				var newH = document.createElement("input");
				newH.type = Type;
				newH.id = ControlId;
				newH.name = ControlId;
				gx.dom.form().appendChild(newH);
				return newH;
			},

			
			hasSelectedFile: function () {
				var inputs = $('input[type="file"]');
				var len = inputs.length;
				if (!len)
					return false;
				for (var i = 0; i < len; i++) {
					if (!gx.lang.emptyObject(inputs[i].value)) {
						return true;
					}
				}
				return false;			
			},
		
			hasSubmitControl: function () {
				var inputs = this.byTag("input");
				var len = inputs.length;
				if (!len)
					return false;
				for (var i = 0; i < len; i++) {
					var iType = inputs[i].getAttribute('type');
					if ((iType == 'submit') || (iType == 'image'))
						return true;
				}
				return false;
			},

			scripts: function () {
				var docScripts = document.scripts;
				if (!docScripts)
					docScripts = document.getElementsByTagName("script");
				if (typeof (docScripts) != 'undefined') {
					var scripts = [];
					var len = docScripts.length;
					for (var i = 0; i < len; i++) {
						var docScript = docScripts[i].attributes['src'];
						if (docScript && docScript.value) {
							docScript = docScript.value;
							if (docScript != '//:')
								scripts.push(docScript);
						}
					}
					return scripts;
				}
				return [];
			},

			styles: function () {
				var sheets = document.styleSheets;
				if (typeof (sheets) != 'undefined') {
					var styles = [];
					var len = sheets.length;
					for (var i = 0; i < len; i++) {
						var sheet = sheets[i].href;
						if (!gx.lang.emptyObject(sheet))
							styles.push(sheet);
					}
					return styles;
				}
				return [];
			},

			getComputedStyle: function (el) {
				try {
					if (el == document)
						return null;
					else if (typeof (window['getComputedStyle']) == 'function')
						return window.getComputedStyle(el);
					else if (typeof (el.currentStyle) != 'undefined')
						return el.currentStyle;
					else return el.style;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'getComputedStyle');
					return null;
				}
			},

			getStyle: function (ctrl, key) {
				var value = '';
				try {
					if (typeof (window['getComputedStyle']) == 'function')
						value = window.getComputedStyle(ctrl, null)[key];
					else if (typeof (ctrl.currentStyle) != 'undefined')
						value = ctrl.currentStyle[key];
					else
						value = ctrl.style[key];
					var nValue = parseInt(value);
					if (!isNaN(nValue))
						value = nValue;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'getStyle');
				}
				return value;
			},

			CSS_URL_REGEXP: /url\(["\']?(?!(?:https?:|\/))([^"\)]+)["\']?\)/ig,
			CSS_BASE_URL_REGEXP: /(.+\/)[^\/]+$/ig,
			cssRules: null,
			cacheStyleSheet: function(ss, fixUrls) {
				var cssText,
					baseUrl = ss.href ? ss.href.replace(this.CSS_BASE_URL_REGEXP, "$1") : document.location.href,
					ssRules;

				if(!this.cssRules){
					this.cssRules = [];
				}

				try {
					ssRules = ss.cssRules || ss.rules;
					if (ssRules) {
						for (var i = 0, len = ssRules.length; i < len; i++) {
							cssText = ssRules[i].cssText;
							if (fixUrls) {
								cssText = cssText.replace(this.CSS_URL_REGEXP, 'url("' + baseUrl + '$1")');
							}
							this.cssRules.push(cssText);
						}
					}
				}
				catch(e) {}
			},

			getCssRules: function(refreshCache, fixUrls) {
				var ds = document.styleSheets;
				if (this.cssRules === null || refreshCache) {
					this.cssRules = [];
					for (var i=0, len=ds.length; i < len; i++) {
						try {
							if (!ds[i].disabled) {
								this.cacheStyleSheet(ds[i], fixUrls);
							}
						} catch(e) {}
					}
				}
				return this.cssRules;
			},

			isButton: function (Ctrl) {
				if (Ctrl != undefined && Ctrl != null)
					return (Ctrl.type == 'submit') || (Ctrl.type == 'button');
				return false;
			},

			editControls: {
				'text': true,
				'password': true,
				'color': true,
				'date': true,
				'datetime': true,
				'datetime-local': true,
				'email': true,
				'number': true,
				'search': true,
				'url': true,
				'tel': true
			},

			isEditControl: function (Ctrl) {
				if (Ctrl && Ctrl.tagName == "INPUT") {
					return this.editControls[Ctrl.type] || false;
				}
				return false;
			},

			isDateControl: function (Ctrl) {
				return Ctrl.type == "date" || Ctrl.type == "datetime" || Ctrl.type == "datetime-local";
			},

			isButtonLike: function (Ctrl) {
				if (this.isButton(Ctrl))
					return true;
				if (Ctrl != undefined && Ctrl != null)
					return (Ctrl.nodeName == 'INPUT' && (Ctrl.type == 'image' || Ctrl.type == 'checkbox') && typeof (Ctrl.onclick) == "function")
				return false;
			},

			iFrameDoc: function (iFrame) {
				try {
					if (iFrame.contentDocument)
						return iFrame.contentDocument;
					if (iFrame.contentWindow) {
						return iFrame.contentWindow.document;
					}
				}
				catch (e) {
				}
				return null;
			},

			forEachChild: function (control, ctx, func) {
				if (control && control.childNodes && typeof (func) == 'function') {
					var len = control.childNodes.length;
					for (var i = 0; i < len; i++) {
						if (func.call(ctx, control.childNodes[i]) === false) {
							break;
						}
					}
				}
			},

			isTextWithLink: function (Control) {
				if (Control != null) {
					if ((Control.tagName == 'A') && Control.childNodes && (Control.childNodes.length > 0)) {
						var childNode = Control.firstChild;
						if (this.innerChildIsText(childNode))
							return true;

					}
				}
				return false;
			},

			isChildNode: function (Child, Parent) {
				if (Child.frameElement)
					Child = Child.frameElement;
				if (Child == Parent)
					return true;
				while (Child.parentNode) {
					if (Child == Parent)
						return true;
					if (Child.parentNode == Parent)
						return true;
					Child = Child.parentNode;
				}
				return false;
			},

			findParentByTagName: function (el, tagName, max) {
				var parent = el.parentNode;
				tagName = tagName.toUpperCase();
				i = 0;
				while (parent) {
					if (max && i == max)
						return;
					i++;
					if (parent.tagName == tagName)
						return parent;
					parent = parent.parentNode;
				}
			},

			innerChildIsText: function (childNode) {
				while (childNode != null) {
					if (childNode.nodeName && (childNode.nodeName == '#text'))
						return true;
					childNode = childNode.firstChild;
				}
				return false;
			},

			allChildrenAreText: function (parentNode) {
				var childNode = parentNode.firstChild;
				while (childNode) {
					if (childNode.nodeName != '#text')
						return false;
					childNode = childNode.nextSibling;
				}
				return true;
			},

			position: function (el) {
				var offset = $(el).offset();	
				return { x: Math.floor(offset.left), y: Math.floor(offset.top) };
			},

			dimensions: function (el) {
				var ctrl = $(el);
				return { w: ctrl.outerWidth(), h: ctrl.outerHeight() };
			},

			windowDimensions: function (frameDoc) {
				var doc = frameDoc.documentElement;
				var body = frameDoc.body;
				if (doc && doc.scrollHeight) {
					var sH = Math.max(doc.scrollHeight, body.scrollHeight);
					var sW = Math.max(doc.scrollWidth, body.scrollWidth);
					var cH = Math.max(doc.clientHeight, body.clientHeight);
					var cW = Math.max(doc.clientWidth, body.clientWidth);
					return { scrollWidth: sW, scrollHeight: sH, clientHeight: cH, clientWidth: cW };
				} else {
					return {
						scrollWidth: body.scrollWidth, scrollHeight: body.scrollHeight,
						clientHeight: body.clientHeight, clientWidth: body.clientWidth
					};
				}
			},

			documentScroll: function (doc) {
				var doc = doc || document;
				var sTop = (doc.documentElement.scrollTop || doc.body.scrollTop);
				var sLeft = (doc.documentElement.scrollLeft || doc.body.scrollLeft);
				return { scrollTop: sTop, scrollLeft: sLeft };
			},

			autofitIFrame: function (evt) {
				var loadEvt = window.event || evt;
				var frameCtrl = gx.evt.source(loadEvt);
				var frameDoc = window.frames[frameCtrl.name].document;
				if (!frameDoc || frameCtrl.width != '' || frameCtrl.height != '')
					return;
				var dims = gx.dom.windowDimensions(frameDoc);
				var docW = dims.scrollWidth ? (dims.scrollWidth + 10) : null;
				var docH = dims.scrollHeight ? (dims.scrollHeight + 10) : null;
				if (docW && docH) {
					frameCtrl.style.width = docW + 'px';
					frameCtrl.style.height = docH + 'px';
				}
			},

			fitToParent: function (ctrl) {
				if (!gx.util.browser.isIE()) {
					if (ctrl && ctrl.childNodes) {
						var firstTable = null;
						var len = ctrl.childNodes.length;
						for (var i = 0; i < len; i++) {
							var elem = ctrl.childNodes[i];
							if (elem.nodeName == 'TABLE') {
								firstTable = elem;
								break;
							}
						}
						if (firstTable != null) {
							if (firstTable.style.width.indexOf('%') != -1)
								ctrl.style.width = gx.dom.addUnits(firstTable.style.width);
							if (firstTable.style.height.indexOf('%') != -1)
								ctrl.style.height = gx.dom.addUnits(firstTable.style.height);
						}
					}
				}
			},

			redrawControl: function (Control) {
				if (!gx.util.browser.isIE() || (gx.util.browser.ieVersion() >= 6))
					gx.html.setOuterHtml(Control, Control.outerHTML);
				else
					setTimeout(function () { gx.html.setOuterHtml(Control, Control.outerHTML); }, 100);
			},

			setCaretPosition: function (ctrl, pos) {
				if (ctrl != null) {
					if (ctrl.createTextRange) {
						var range = ctrl.createTextRange();
						range.move('character', pos);
						range.select();
					}
					else {
						if (ctrl.selectionStart) {
							ctrl.focus();
							ctrl.setSelectionRange(pos, pos);
						}
						else {
							ctrl.focus();
						}
					}
				}
			},

			replaceAtCaretPosition: function (ctrl, text) {
				var selStart = ctrl.selectionStart;
				var selEnd = ctrl.selectionEnd;
				if (document.selection) {
					var bookmark = document.selection.createRange().getBookmark();
					ctrl.selection = ctrl.createTextRange();
					ctrl.selection.moveToBookmark(bookmark);
					ctrl.selectLeft = ctrl.createTextRange();
					ctrl.selectLeft.collapse(true);
					ctrl.selectLeft.setEndPoint("EndToStart", ctrl.selection);
					selStart = ctrl.selectLeft.text.length + 1;
					selEnd = ctrl.selectLeft.text.length + ((ctrl.selection.text.length == 0) ? 1 : ctrl.selection.text.length);
				}  
				else
				{
					selStart = ctrl.selectionStart;
					selEnd = ctrl.selectionEnd;
				}
				if (ctrl.setRangeText) {
					ctrl.setRangeText( text, selStart, selEnd);
				}
				else {
					ctrl.value = ctrl.value.substr( 0, selStart) + text + ctrl.value.substr( selStart, ctrl.value.length)
				}
				gx.dom.setCaretPosition(ctrl, selStart);
			},

			spanValue: function (el) {
				var val = el.nodeValue;
				if (gx.lang.emptyObject(val))
					val = el.innerText || el.textContent;
				if (gx.lang.emptyObject(val))
					val = '';
				return val;
			},

			removeControlSafe: function (ctrl) {
				if (!this._avoidLeaksDiv) {
					this._avoidLeaksDiv = document.createElement('DIV');
					this._avoidLeaksDiv.style.display = 'none';
					document.body.appendChild(this._avoidLeaksDiv);
				}
				this._avoidLeaksDiv.appendChild(ctrl);
				if (gx.dom.shouldPurge())
					gx.dom.purge(this._avoidLeaksDiv);
				this._avoidLeaksDiv.innerHTML = '';
			},

			removeControl: function (ctrl) {
				if (document.createRange == null)
					ctrl.removeNode(true);
				else {
					var range = document.createRange();
					if (ctrl) {
						range.selectNode(ctrl);
						range.deleteContents();
					}
				}
			},

			comboBoxToObj: function (Ctrl, value) {
				try {
					var obj = { s: '', v: [] }
					if (!Ctrl)
						return obj;
					if (Ctrl.tagName == 'SELECT') {
						obj.s = Ctrl.value;
						var len = Ctrl.options.length;
						for (var i = 0; i < len; i++) {
							var descText = '';
							if (typeof (Ctrl.options[i].innerText) != 'undefined')
								descText = Ctrl.options[i].innerText;
							else
								descText = Ctrl.options[i].text;
							obj.v.push([Ctrl.options[i].value, descText]);
						}
					}
					else if (Ctrl.tagName == 'SPAN' && typeof (value) == 'string')//Combo readonly
					{
						obj.v.push([value, value]);
						obj.s = value;
					}
					return obj;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'comboBoxToObj');
				}
				return null;
			},

			unitPattern: /\d+(px|em|%|en|ex|pt|in|cm|mm|pc|s)$/i,
			addUnits: function (dim, defaultUnit) {
				if (dim === "" || dim == "auto")
					return dim;

				if (dim === undefined)
					return '';

				if (typeof dim == "number" || !this.unitPattern.test(dim))
					return dim + (defaultUnit || 'px');

				return dim;
			},

			getActiveElement: function () {
				var activeEl = null;
				try {
					activeEl = document.activeElement;
				}
				catch (e) {
				}

				return activeEl;
			},

			write: function (data, doc) {
				doc = doc || document;
				doc.write(data);
			},

			MASK_CLASS: "gx-mask",
			UNMASK_CLASS: "gx-unmask",
			MASK_RELATIVE_CLASS: "gx-masked-relative",
			MASKED_CLASS: "gx-masked",
			mask: function (el) {
				el = this.el(el);

				if (!this.hasClass(el, this.MASK_RELATIVE_CLASS)) {
					var maskEl,
						browser = gx.util.browser,
						ieVersion = browser.ieVersion(),
						fixHeight = (ieVersion == 6 || (browser.isIE && browser.isCompatMode())),
						setExpressionSupported = !!el.style.setExpression;

					if (el.tagName != 'body' || this.getComputedStyle(el)['position'] != 'static') {
						this.addClass(el, this.MASK_RELATIVE_CLASS);
					}

					maskEl = document.createElement("div");
					maskEl.className = this.MASK_CLASS;

					el.appendChild(maskEl);

					this.addClass(el, this.MASKED_CLASS);

					if (fixHeight && setExpressionSupported) {
						try {
							maskEl.style.setExpression('height', 'this.parentNode.' + (el == document.body ? 'scrollHeight' : 'offsetHeight') + ' + "px"');
						} catch (e) { }
					}
					else {
						var heightValue = this.getComputedStyle(el)['height'];
						if (browser.isIE && !(browser.ieVersion == 7 && !browser.isCompatMode()) && heightValue == 'auto') {
							maskEl.style.height = heightValue;
						}
					}
					return maskEl;
				}
			},

			unmask: function (el) {
				el = this.el(el);
				var maskEl;

				for (var i = 0, len = el.childNodes.length; i < len; i++) {
					if (el.childNodes[i].tagName == 'DIV' && this.hasClass(el.childNodes[i], this.MASK_CLASS)) {
						maskEl = el.childNodes[i];
						break;
					}
				}

				if (maskEl && !maskEl.removed) {
					maskEl.removed = true;
					if (maskEl.style.clearExpression) {
						maskEl.style.clearExpression('width');
						maskEl.style.clearExpression('height');
					}
					this.removeClass(el, this.MASKED_CLASS);
					var fxEventName = (gx.dom.hasTransition(maskEl) ? gx.dom.TRANSITION_END_EVENT : gx.dom.hasAnimation(maskEl) ? gx.dom.ANIMATION_END_EVENT : false);
					var fnc = (function() {
						el.removeChild(maskEl);
						gx.dom.removeClass(el, this.MASK_RELATIVE_CLASS);
					}).closure(this);
					if (fxEventName)
						gx.evt.attach(maskEl, fxEventName, fnc, false, { single: true, useCapture: true, timeout: 300 });
					else
						fnc();
					this.addClass(maskEl, this.UNMASK_CLASS);
				}
				else {
					this.removeClass(el, this.MASKED_CLASS);
					this.removeClass(el, this.MASK_RELATIVE_CLASS);
				}
			},

			replaceWithFx: function(oldEl, newEl, options) {
				var options = options || {},
				    enteringClass = options.enteringClass || 'entering',
					leavingClass = options.leavingClass || 'leaving',
					enterDurationClass = options.enterDurationClass || 'enter-fx-duration',
					leaveDurationClass = options.leaveDurationClass || 'leave-fx-duration',
					transitioningClass = options.transitioningClass || 'transitioning',
					transitionTimeout = options.transitionTimeout || 1500;

				var useFx = function (el) {
					return (gx.dom.hasAnimation(el) || gx.dom.hasTransition(el)) && !gx.dom.hasClass(el.parentNode, transitioningClass);
				};
				
				var getFxEventName = function (el) {
					return gx.dom.hasAnimation(el) ? gx.dom.ANIMATION_END_EVENT : (gx.dom.hasTransition(el) ? gx.dom.TRANSITION_END_EVENT : false);
				};

				if (oldEl.tagName == 'BODY') {
					gx.dom.addClass(oldEl, oldEl.className + "-fx");
					oldEl.style.position = 'static';
				}

				if (newEl.tagName == 'BODY') {
					gx.dom.addClass(newEl, newEl.className + "-fx");
				}

				var parentNode = oldEl.parentNode,
					useLeavingFx = useFx(oldEl),
					useEnteringFx = useFx(newEl)
					useParallelFx = oldEl.tagName != 'BODY';

				if (useLeavingFx || useEnteringFx) {
					var iframe = document.createElement('iframe'),
						iframeCt = document.createElement('div'),
						iframeDoc,
						rule,
						styleSheet,
						cssRules,
						oldElStyle = this.getComputedStyle(oldEl),
						oldElWidth = oldElStyle['width'],
						oldElHeight = oldElStyle['height'],
						i,
						len,
						leavingFxEventName = getFxEventName(oldEl),
						enteringFxEventName = getFxEventName(newEl),
						leavingTransFn,
						enteringTransFn,
						transitionEndFn,
						leavingTransTimeoutHdlr,
						enteringTransTimeoutHdlr,
						transStatus = 0;

					gx.dom.addClass(parentNode, transitioningClass);

					if (oldEl.tagName != 'BODY' && newEl.tagName != 'BODY') {
						if (useLeavingFx) {
							// A temporal iframe is created to be able to have in the same page the old and new content, 
							// regardless of repeated element ids.
							// All the CSS rules of the document must be copied to the temp iframe, as well as the document type, so there
							// are no visual differences.
							iframe.setAttribute("scrolling", "no");
							iframe.setAttribute("frameborder", "0");
							iframe.style.width = gx.dom.addUnits(window.innerWidth);
							iframe.style.height = gx.dom.addUnits(window.innerHeight);
							iframe.style.display = 'none';

							iframeCt.appendChild(iframe);
							iframeCt.style.width = oldElWidth;
							iframeCt.style.height = oldElHeight;
							iframeCt.style.overflow = 'hidden';

							oldEl.insertBefore(iframeCt, oldEl.firstChild);

							iframeDoc = iframe.contentDocument;
							try {
								iframeDoc.open();
								iframeDoc.write(this.getDocTypeDeclaration(document));
								iframeDoc.write("<html>");
								iframeDoc.write("<head></head>");
								iframeDoc.write("<body><div></div></body>");
								iframeDoc.write("</html>");
								iframeDoc.close();
							}
							catch (e) {
								gx.dbg.logEx(e, 'gxapi.js', 'replaceWithFx');
								var aDiv = iframeDoc.createElement('div');
								iframeDoc.body.appendChild(aDiv);
							}

							iframeDoc.body.style.margin = '0';
							iframeDoc.body.className = gx.dom.form().className;

							iframeDoc.head.appendChild(document.createElement('style'));
							styleSheet = iframeDoc.styleSheets[0];
							cssRules = gx.dom.getCssRules(true, true);
							for (i=0, len=cssRules.length; i<len; i++) {
								styleSheet.insertRule(cssRules[i], i);
							}

							iframeDoc.body.firstChild.style.width = oldElWidth;
							iframeDoc.body.firstChild.style.height = oldElHeight;
							while (oldEl.childNodes[1]) {
								iframeDoc.body.firstChild.appendChild(oldEl.childNodes[1]);
							}

							iframe.style.display = 'block';
						}
						else {
							if (useEnteringFx) {
								oldEl.style.display = 'none';
							}
						}
					}

					gx.dom.addClass(newEl, enteringClass);
					gx.dom.addClass(newEl, enterDurationClass);
					gx.dom.addClass(oldEl, leaveDurationClass);
					if (options.domAdd !== false) {
						parentNode.appendChild(newEl);
					}

					var applyTransFn = function() {
						// Fire transitionEndCallback when both transitions ended
						transitionEndFn = function() {
							if (transStatus === 2) {
								gx.dom.removeClass(parentNode, transitioningClass);
								if (useParallelFx) {
									if (options.transitionEndCallback) {
										newEl = options.transitionEndCallback(oldEl, newEl);
									}
									
									if (options.domRemove !== false) {
										parentNode.removeChild(oldEl);
									}
								}
								gx.dom.removeClass(newEl, enterDurationClass);
							}
							else {
								if (!useParallelFx) {
									if (options.transitionEndCallback) {
										newEl = options.transitionEndCallback(oldEl, newEl);
									}
									gx.dom.removeClass(newEl, enteringClass);
									if (useEnteringFx) {
										enteringTransTimeoutHdlr = setTimeout(enteringTransFn, transitionTimeout);
									}
								}
							}
						};

						if (useLeavingFx) {
							// Leaving element transition end callback
							leavingTransFn = function(){
								clearTimeout(leavingTransTimeoutHdlr);
								transStatus++;
								if (options.leavingTransCallback) {
									options.leavingTransCallback(oldEl, newEl);
								}
								transitionEndFn();
							};
							gx.evt.attach(oldEl, leavingFxEventName, leavingTransFn, false, { single: true, useCapture: true });
						}
						else {
							transStatus++;
							transitionEndFn();
						}

						if (useEnteringFx) {
							// Entering element transition end callback
							enteringTransFn = function(){
								// WA for Webkit: The handler kept firing after removing the element 
								// from the DOM (only when BODY is replaced). This way, if it's fired
								// more than once, the handler is manually detached.
								if (transStatus >= 2) {
									gx.evt.detach(newEl, enteringFxEventName, enteringTransFn);
									return;
								}
								clearTimeout(enteringTransTimeoutHdlr);
								transStatus++;
								if (options.enteringTransCallback) {
									options.enteringTransCallback(oldEl, newEl);
								}
								transitionEndFn();
							};
							gx.evt.attach(newEl, enteringFxEventName, enteringTransFn, false, { single: true, useCapture: true });
						}
						else {
							transStatus++;
							transitionEndFn();
						}

						setTimeout(function() {
							gx.dom.addClass(oldEl, leavingClass);
							if (useParallelFx) {
								gx.dom.removeClass(newEl, enteringClass);
								if (useEnteringFx) {
									enteringTransTimeoutHdlr = setTimeout(enteringTransFn, transitionTimeout);
								}
							}

							// A timeout is setup in case the transition doesn't work
							if (useLeavingFx) {
								leavingTransTimeoutHdlr = setTimeout(leavingTransFn, transitionTimeout);
							}
						}, 100);
					};

					if (options.beforeTransitionStart) {
						// If options.beforeTransitionStart returns true, it means it executed applyTransFn (thus applying the transition)
						// so it is not called.
						if (options.beforeTransitionStart(applyTransFn) !== true) {
							applyTransFn();
						}
					}
					else {
						applyTransFn();
					}
				}
				else {
					if (options.domRemove !== false) {
						parentNode.removeChild(oldEl);
					}
					if (options.domAdd !== false) {
						parentNode.appendChild(newEl);
					}

					if (options.beforeTransitionStart) {
						options.beforeTransitionStart();
					}
					
					if (options.leavingTransCallback) {
						options.leavingTransCallback(oldEl, newEl);
					}
					
					if (options.enteringTransCallback) {
						options.enteringTransCallback(oldEl, newEl);
					}
					
					if (options.transitionEndCallback) {
						newEl = options.transitionEndCallback(oldEl, newEl);
					}
					
				}
			},
			
			getDocTypeDeclaration: function(doc) {
				doc = doc || document;
				var doctype = doc.doctype;
					parts = ["!DOCTYPE"];

				if (!doctype) {
					return "";
				}

				parts.push(doctype.name || "html");
				if (doctype.publicId) {
					parts.push('PUBLIC');
					parts.push('"' + doctype.publicId + '"');
				}
				if (doctype.systemId) {
					parts.push('"' + doctype.systemId + '"');
				}
				
				return "<" + parts.join(" ") + ">";
			},

			createShadowRoot: function (el) {
				el = this.el(el);
				if (el.createShadowRoot) {
					return el.createShadowRoot();
				}
				else if (el.webkitCreateShadowRoot) {
					return el.webkitCreateShadowRoot();
				}
				
				return false;
			},

			fixes: (function () {
				var DOM_FIXES_STYLE_ID = "gx-dom-fixes",
					TABLE_PADDING_CLASS_PREFIX = "gx-tab-padding-fix-",
					TABLE_SPACING_CLASS_PREFIX = "gx-tab-spacing-fix-",
					TABLE_PADDING_CLASS_REGEX = new RegExp(TABLE_PADDING_CLASS_PREFIX + "\\d+", "ig"),
					TABLE_SPACING_CLASS_REGEX = new RegExp(TABLE_SPACING_CLASS_PREFIX + "\\d+", "ig");

				var allCellPaddings = {},
					allCellSpacings = {},
					cellPaddingsTemplate,
					cellSpacingsTemplate;

				var alignmentTemplate,
					alignmentProperties = {
						"center": {
							marginLeft: 'auto',
							marginRight: 'auto',
							className: "gx-center-align",
							alignment: "center"
						},
						"right": {
							marginLeft: 'auto',
							marginRight: 0,
							className: "gx-right-align",
							alignment: "right"
						},
						"left": {
							marginLeft: 0,
							marginRight: 'auto',
							className: "gx-left-align",
							alignment: "left"
						}
					};

				return {
					getFixesStyleElement: function () {
						var styleEl = $("#" + DOM_FIXES_STYLE_ID)[0];
						if (!styleEl) {
							styleEl = document.createElement("style");
							styleEl.id = DOM_FIXES_STYLE_ID;
							document.head.insertBefore(styleEl, gx.getThemeElement());
						}
						return styleEl;
					},

					html5: function (root) {
						var browser = gx.util.browser,
							isIE = browser.isIE(),
							i,
							styleBuffer = [],
							styleEl;

						$("TABLE", root || document.body).each(function () {
							var $table = $(this);
							$table.attr({
								"cellpadding": $table.data("cellpadding"),
								"cellspacing": $table.data("cellspacing"),
								"align": $table.data("align")
							})
						});

						if (!root) {
							if (!alignmentTemplate) {
								for (var alignment in alignmentProperties) {
									gx.lang.apply(alignmentProperties[alignment], {
										wcClassName: gx.GxObject.WEBCOMPONENT_CLASS_NAME,
										wcBodyClassName: gx.GxObject.WEBCOMPONENT_BODY_CLASS_NAME,
										contHolderClassName: 'gx-content-placeholder',
										contHolderBodyClassName: 'gx-ct-body',
										elements: [ { el: 'p' }, { el: 'table' }, { el: 'div' }, { el: 'fieldset', last: true } ]
									});
								}

								alignmentTemplate =  Mustache.compile([
									".{{className}} \{",
										"text-align:{{alignment}};",
									"\}",
									'{{#elements}}',
										".{{className}} > {{el}},",
										".{{className}} > div.{{contHolderClassName}} > div.{{contHolderBodyClassName}} > {{el}}, ",
										".{{className}} > div.{{wcClassName}} > div.{{wcBodyClassName}} > {{el}}{{^last}},{{/last}}",
									'{{/elements}}', 
									'\{',
										"margin-left:{{marginLeft}};",
										"margin-right:{{marginRight}};",
									"\}"
									].join(""));
							}
							for (var alignment in alignmentProperties) {
								styleBuffer.push(alignmentTemplate(alignmentProperties[alignment]));
							}
							styleEl = this.getFixesStyleElement();
							styleEl.innerHTML += styleBuffer.join("");
						}

						if (isIE || browser.isOpera()) {
							$("td[data-align]", root || document.body).each(function () {
								var $cell = $(this),
									dataAlign = $cell.attr("data-align"),
									newClass = alignmentProperties[dataAlign].className,
									classAttr = $cell.attr("class") || "";

								if (classAttr) {
									classAttr = " " + classAttr;
								}

								$cell.attr("align", dataAlign);
								if (!$cell.hasClass(newClass)) {
									$cell.attr("class", newClass + classAttr)
								}
								
								$cell.children("div." + alignmentProperties[dataAlign].contHolderClassName).children('div.' + alignmentProperties[dataAlign].contHolderBodyClassName).addClass(newClass);
								$cell.children("div." + alignmentProperties[dataAlign].wcClassName).children('div.' + alignmentProperties[dataAlign].wcBodyClassName).addClass(newClass);
							});
						}
					},
					
					popupMinWidth: function () {
						var currentPopup = gx.popup.getPopup()
						if (currentPopup && gx.runtimeTemplates) {
							var SMALL_MIN_SIZE = 600,
								MEDIUM_MIN_SIZE = 800,
								LARGE_MIN_SIZE = 900,
								EXTRA_SMALL_SIZE_DELTA = 20,
								EXTRA_SMALL_BREAK_SIZE = 768,
								SMALL_BREAK_SIZE = 992,
								MEDIUM_BREAK_SIZE = 1200;

							var windowWidth = $(currentPopup.window).width(),
								minWidth = MEDIUM_MIN_SIZE;

							if (windowWidth >= MEDIUM_BREAK_SIZE) {
								minWidth = LARGE_MIN_SIZE;
							}
							if (windowWidth >= EXTRA_SMALL_BREAK_SIZE && windowWidth < SMALL_BREAK_SIZE) {
								minWidth = SMALL_MIN_SIZE;
							}
							if (windowWidth < EXTRA_SMALL_BREAK_SIZE) {
								minWidth = windowWidth - EXTRA_SMALL_SIZE_DELTA;
							}

							$(document.documentElement).css("min-width", gx.dom.addUnits(minWidth));
						}
					},

					fixTableResets: function (root) {
						if (!gx.runtimeTemplates)
							return;

						var styleEl = this.getFixesStyleElement();

						if (!cellPaddingsTemplate) {
							cellPaddingsTemplate = Mustache.compile("{{#.}}." + TABLE_PADDING_CLASS_PREFIX + "{{.}}\{padding:{{.}}px\}{{/.}}");
						}
						if (!cellSpacingsTemplate) {
							cellSpacingsTemplate = Mustache.compile("{{#.}}." + TABLE_SPACING_CLASS_PREFIX + "{{.}}\{border-collapse:separate; border-spacing:{{.}}px\}{{/.}}");
						}

						var $tables = $("table[cellpadding!=0], table[cellspacing!=0]", root || document.body);
						
						$tables.each(function () {
							var cellPadding = parseInt(this.getAttribute("cellpadding") || 0, 10);
							var cellSpacing = parseInt(this.getAttribute("cellspacing") || 0, 10);
							if (cellPadding != 0) {
								allCellPaddings[cellPadding] = cellPadding;
								$("tbody > tr > td, tbody > tr > th, tr > td, tr > th", this).each(function () {
									this.className = TABLE_PADDING_CLASS_PREFIX + cellPadding + " " + this.className.replace(TABLE_PADDING_CLASS_REGEX, "");
								});
							}
							if (cellSpacing != 0) {
								allCellSpacings[cellSpacing] = cellSpacing;
								this.className = TABLE_SPACING_CLASS_PREFIX + cellSpacing + " " + this.className.replace(TABLE_SPACING_CLASS_REGEX, "");
							}
						});

						var cellPaddingsArray = gx.lang.objToArray(allCellPaddings);
						var cellSpacingArray = gx.lang.objToArray(allCellSpacings);

						styleEl.innerHTML += cellPaddingsTemplate(cellPaddingsArray) + cellSpacingsTemplate(cellSpacingArray);
					}
				};
			})(),

			_init: function () {
				Function.prototype.closure = function (obj, args, appendArgs) {
					var browser = gx.util.browser;
					if (browser.isIE() && browser.ieVersion() < 8) {
						if (!window.__objs) {
							window.__objs = [];
							window.__funs = [];
							window.__args = [];
						}
						var fun = this;
						var objId = obj.__objId;
						if (!objId)
							__objs[objId = obj.__objId = __objs.length] = obj;
						var funId = fun.__funId;
						if (!funId)
							__funs[funId = fun.__funId = __funs.length] = fun;
						if (!args)
							args = [];
						var argsId = args.__argsId;
						if (!argsId)
							__args[argsId = args.__argsId = __args.length] = args;
						obj = null;
						fun = null;
						args = null;
						return function () {
							if (!__funs)
								return;
							var funcArgs = __args[argsId];
							if (appendArgs === true) {
								funcArgs = Array.prototype.slice.call(arguments, 0);
								funcArgs = funcArgs.concat(__args[argsId]);
							}
							if (funcArgs.length == 0 && arguments.length > 0)
								funcArgs = arguments;
							var ret = __funs[funId].apply(__objs[objId], funcArgs);
							if (__objs) {
								try { delete __objs[objId]['__objId']; }
								catch (e)
								{ __objs[objId]['__objId'] = null; }
							}
							if (__funs)
								delete __funs[funId]['__funId'];
							if (__args)
								delete __args[argsId]['__argsId'];
							return ret;
						};
					}
					else {
						var fun = this;
						return function () {
							var funcArgs = args || arguments;
							if (appendArgs === true) {
								funcArgs = Array.prototype.slice.call(arguments, 0);
								funcArgs = funcArgs.concat(args);
							}
							return fun.apply(obj || window, funcArgs);
						};
					}
				};

				gx.evt.on_ready(this, function () {
					// Set autocomplete='off' to hidden inputs in Webkit browsers.
					// This is a WA for a bug that restores hidden inputs values when back button is hit.
					var i, len,
						browser = gx.util.browser;
					if (browser.isWebkit()) {
						var hiddenInputs = [];
						if (document.querySelectorAll)
							hiddenInputs = document.querySelectorAll("input[type='hidden']");
						else {
							var inputs = gx.dom.byTag('input');
							for (i = 0, len = inputs.length; i < len; i++)
								if (inputs[i].getAttribute('type') == 'hidden')
									hiddenInputs.push(inputs[i]);
						}

						for (i = 0, len = hiddenInputs.length; i < len; i++)
							hiddenInputs[i].setAttribute('autocomplete', 'off');
					}
					if (browser.isChrome()) {
						var selectEls = document.querySelectorAll('select');
						for (i = 0, len = selectEls.length; i < len; i++) {
							if (!selectEls[i].value) {
								var selOptionEl = selectEls[i].querySelectorAll('option[selected]');
								if (selOptionEl && selOptionEl.length) {
									selectEls[i].value = selOptionEl[0].value;
								}
							}
						}
					}
				});
				this.TRANSITION_END_EVENT = gx.util.browser.isWebkit() ? 'webkitTransitionEnd' : gx.util.browser.isOpera() ? 'oTransitionEnd' : 'transitionend';
				this.ANIMATION_END_EVENT = gx.util.browser.isWebkit() ? 'webkitAnimationEnd' : gx.util.browser.isOpera() ? 'oAnimationEnd' : 'animationend';
			},

			_deinit: function () {
				this._form = null;
				if (this._avoidLeaksDiv != null) {
					if (gx.dom.shouldPurge())
						gx.dom.purge(this._avoidLeaksDiv);
					this._avoidLeaksDiv.parentNode.removeChild(this._avoidLeaksDiv);
					this._avoidLeaksDiv = null;
				}
				if (window) {
					window.__objs = null;
					window.__funs = null;
					window.__args = null;
				}
			}
		},

		util: {
			contentTypes: {
				"txt": "text/plain",
				"rtx": "text/richtext",
				"htm": "text/html",
				"html": "text/html",
				"xml": "text/xml",
				"aif": "audio/x-aiff",
				"au": "audio/basic",
				"wav": "audio/wav",
				"bmp": "image/bmp",
				"gif": "image/gif",
				"jpe": "image/jpeg",
				"jpeg": "image/jpeg",
				"jpg": "image/jpeg",
				"jfif": "image/pjpeg",
				"tif": "image/tiff",
				"tiff": "image/tiff",
				"png": "image/x-png",
				"mpg": "video/mpeg",
				"mpeg": "video/mpeg",
				"mov": "video/quicktime",
				"qt": "video/quicktime",
				"avi": "video/x-msvideo",
				"exe": "application/octet-stream",
				"dll": "application/x-msdownload",
				"ps": "application/postscript",
				"pdf": "application/pdf",
				"tgz": "application/x-compressed",
				"zip": "application/x-zip-compressed",
				"gz": "application/x-gzip"
			},

			isKnownContentType: function (cType) {
				for (var ext in this.contentTypes) {
					if (this.contentTypes[ext] == cType)
						return true;
				}
				return false;
			},

			getContentTypeFromExt: function (ext) {
				var dotIdx = ext.lastIndexOf('.');
				if (dotIdx != -1)
					ext = ext.substring(dotIdx + 1);
				if (ext)
					return this.getContentType(ext);
				return "";
			},

			getContentType: function (ext) {
				if (gx.lang.emptyObject(ext))
					return 'text/html';
				ext = ext.toLowerCase();
				ext = gx.text.trim(ext);
				if (this.isKnownContentType(ext))
					return ext;
				var dotIdx = ext.lastIndexOf('.');
				if (dotIdx != -1)
					ext = ext.substring(dotIdx + 1);
				var cType = this.contentTypes[ext];
				if (gx.lang.emptyObject(cType))
					return 'text/html';
				return cType;
			},

			getFileName: function(file) {
				var slashIndexOf = file.lastIndexOf('/'),
					backSlashIndexOf = file.lastIndexOf('\\'),
					start = slashIndexOf > backSlashIndexOf ? slashIndexOf : backSlashIndexOf,
					end = file.lastIndexOf('.');

				if (!file) {
					return file;
				}

				if (end < 0 || start > end) {
					end = file.length;
				}
			
				return file.substring(start+1, end);
			},

			getFileType: function(file) {
				var slashIndexOf = file.lastIndexOf('/'),
					backSlashIndexOf = file.lastIndexOf('\\'),
					indexOf = file.lastIndexOf('.');
			
				if	(indexOf < 0 || indexOf < slashIndexOf || indexOf < backSlashIndexOf)
					return "";
				return file.substring(indexOf + 1);
			},

			getWindowInfo: function() {
				var id = "";
				var accessFrame = true;
				var isInIframe = false;
				try {
					// Test wether the frameElement can be accessed					
					isInIframe = (window.location != window.parent.location) ? true : false;
					if (isInIframe) {
						try {
							accessFrame = window.frameElement.id || window.top.document.body;
							id = window.name;
						}
						catch (e) {
							accessFrame = false;					
						}
					}
				}
				catch (e) {
					
				}
				return {insideIframe: isInIframe, canAccessFrame: accessFrame, frameId: id};
			},
	
			browser: (function () {
				var ua = navigator.userAgent;
				return {
					w3c: true,
					ns4: false,
					ie5: true,
					ns6: false,
					ie: (ua.indexOf("MSIE") != -1|| ua.indexOf("Trident") != -1),
					ff: (ua.indexOf("Firefox") != -1),
					winCE: (ua.indexOf("Windows CE") != -1),
					iphone: (ua.indexOf("iPhone") != -1),
					ipad: (ua.indexOf("iPad") != -1),
					blackBerry: (ua.indexOf("BlackBerry") != -1),
					operaMini: (ua.indexOf("Opera Mini") != -1),
					opera: (ua.indexOf("Opera") != -1),
					chrome: (ua.indexOf("Chrome") != -1),
					webkit: (ua.search(/webkit/ig) != -1),

					isIE: function () {
						return this.ie;
					},

					isFirefox: function () {
						return this.ff;
					},

					isChrome: function () {
						return this.chrome;
					},

					isWinCE: function () {
						return this.winCE;
					},

					isIPhone: function () {
						return this.iphone;
					},

					isIPad: function () {
						return this.ipad;
					},

					isBlackBerry: function () {
						return this.blackBerry;
					},
					isOperaMini: function () {
						return this.operaMini;
					},

					isOpera: function () {
						return this.opera;
					},

					isWebkit: function () {
						return this.webkit;
					},

					isSmartDevice: function () {
						return this.isWinCE() || this.isIPhone() || this.isBlackBerry() || this.isOperaMini();
					},

					isCompatMode: function () {
						return document.compatMode == "BackCompat";
					},

					ieVersion: function () {
						if (this.isIE()) {
							try {
								var ieIdx = ua.indexOf('MSIE');
								if (ieIdx >= 0) {
									var cIdx = ua.indexOf(';', ieIdx);
									var version = ua.substring(ieIdx + 5, cIdx);
									return parseFloat(version, 10);
								}
								else {
									var matches = ua.match(/; rv.([0-9]+)/);
									if (matches.length > 1) {
										return parseFloat(matches[1], 10);
									}
								}
							}
							catch (e) {
								gx.dbg.logEx(e, 'gxapi.js', 'ieVersion');
							}
						}
						return -1;
					},

					chromeVersion: function () {
						if (this.isChrome()) {
							var matches = ua.match(/Chrome\/([0-9]+)/);
							if (matches.length > 1) {
								return parseFloat(matches[1], 10);
							}
						}
					},

					setupIE: function () {
						if (this.ieVersion() >= 9 && !this.isCompatMode()) {
							if ((typeof Range !== "undefined") && !Range.prototype.createContextualFragment) {
								Range.prototype.createContextualFragment = function (html) {
									var frag = document.createDocumentFragment(),
									div = document.createElement("div");
									frag.appendChild(div);
									div.outerHTML = html;
									return frag;
								};
							}
						}
					},

					_init: function () {
						if (!this.isWinCE()) {
							this.w3c = (document.getElementById) ? true : false;
							this.ns4 = (document.layers) ? true : false;
							this.ie5 = (this.ie && document.getElementById && document.all) ? true : false;
							this.ns6 = (document.getElementById && !document.all) ? true : false;
						}
						this.setupIE();
					}
				};
			})(),

			addOnce: function (O, Element, Key) {
				if (O[Key] == undefined)
					O[Key] = Element;
			},

			inArray: function (obj, arr) {
				if ((obj == null) || !(arr instanceof Array))
					return false;
				if (typeof(arr.indexOf) == 'function')
					return arr.indexOf( obj) != -1;
				var len = arr.length;
				for (var i = 0; i < len; i++) {
					if (arr[i] == obj)
						return true;
				}
				return false;
			},

			lastArray: function( arr) {				
				return arr.length > 0 ? arr[arr.length - 1] : null;
			},
		
			noParmsUrl: function (url) {
				var qIdx = url.indexOf('?');
				if (qIdx != -1)
					url = url.substring(0, qIdx);
				return url;
			},

			resolveUrl : function (url) {
				if (!url)
					return url;
				if (gx.ajax.isabsoluteurl(url)) {
					return url;
				}
				else {
					if (gx.ajax.isRelativeToHost(url)) {
						if (url.toLowerCase().indexOf("/" + gx.basePath.toLowerCase()) != 0)
							return gx.util.resourceUrl(gx.basePath + url, false);
						return url;
					}
					else
						return gx.util.resourceUrl(gx.basePath + gx.staticDirectory + url, false);
				}
			},
		
			resourceUrl: function () {
				var BASE_PATH_REGEX;

				return function (path, notRelative) {
					if (!BASE_PATH_REGEX) {
						BASE_PATH_REGEX = new RegExp(gx.basePath + '(/|$)', 'i');
					}

					if (typeof (path) == 'undefined')
						return '';
					if (path.indexOf('://') != -1 || path.charAt(0) == '.')
						return path;
					var len = gx.basePath.length;
					var addlBar = (gx.basePath.charAt(len - 1) != '/');
					var pathIdx = (gx.basePath == '') ? 0 : path.search(BASE_PATH_REGEX);
					if (pathIdx == 0 && !notRelative)
						return ((path.charAt(0) == '/') ? '' : '/') + path;
					if ((pathIdx != -1) || notRelative) {
						var urlSuffix = '';
						if (pathIdx != -1 && gx.basePath.length>0)
							urlSuffix = gx.text.replaceAll(path.substring(pathIdx + gx.basePath.length), "\\", "/");
						else
							urlSuffix = path;

						if (path.charAt(0) == '/') {
							return location.protocol + "//" + location.host + path;
						}
						else {
						    var addfBar = (gx.basePath.length>0 && gx.basePath.charAt(0) != '/');
							addlBar = (addlBar && (urlSuffix.charAt(0) != '/'));

							return location.protocol + "//" + location.host + (addfBar ? "/" : "") + gx.basePath + (addlBar ? "/" : "") + urlSuffix;
						}
					}
					return path;
				};
			}(),

			sameAppUrl: function (url) {
				url = new this.Url(url);
				if (url.isRelative()) {
					return true;
				}
				return url.isSameApp(location.href);
			},

			removeBaseUrl: function (url) {
			    var len = gx.staticDirectory.length;
			    var staticDir;
			    var addlBar = (gx.staticDirectory.charAt(len - 1) != '/');
			    if (gx.staticDirectory.charAt(0) == '/') {
			        staticDir = (gx.basePath.length == 0) ? gx.staticDirectory.substring(1) : gx.staticDirectory;
			    } else {
			        staticDir = '/' + gx.staticDirectory;
			    }
			    var urlRegex = new RegExp('(?:/)?(?:' + gx.basePath + staticDir + (addlBar ? '/' : '') + ')?((?:[\\S]*))');
			    var realUrl = urlRegex.exec(url);
			    if (realUrl != null && realUrl[1]) {
			        url = realUrl[1];
			    }
			    return url;
			},

			getIFrameEmptySrc: function () {
				if (location.protocol == 'https:' && gx.util.browser.isIE() && gx.util.browser.ieVersion() <= 6)
					return 'gx_blank.html'
				else
					return 'about:blank';
			},

			Url: (function () {
				var URL_REGEX = /^(([^\:\/\?#]+)\:)?(\/\/([^\/\?#]*))?([^\?#]*)(\?([^#]*))?(#(.*))?$/,
					URL_REGEX_USER_HOST_PORT = /^(([^@]+)@)?([^\:]+)(:(.+))?$/;

				return function (url) {
					this.url = url;
					this.protocol = '';
					this.host = '';
					this.port = '';
					this.path = '';
					this.query = '';
					this.hash = '';
					this.user = '';

					function init(obj, url) {
						var urlRegex = URL_REGEX,
							urlParts = urlRegex.exec(url),
							isMatch = !gx.lang.emptyObject(urlParts);
						if (isMatch) {
							obj.protocol = (urlParts[2] ? urlParts[2] : '');
							var auth = (urlParts[4] ? urlParts[4] : '');
							obj.path = (urlParts[5] ? urlParts[5] : '');
							obj.query = (urlParts[7] ? urlParts[7] : '');
							obj.hash = (urlParts[9] ? urlParts[9] : '');
							urlRegex = URL_REGEX_USER_HOST_PORT;
							urlParts = urlRegex.exec(auth);
							isMatch = !gx.lang.emptyObject(urlParts);
							if (isMatch) {
								obj.user = (urlParts[2] ? urlParts[2] : '');
								obj.host = (urlParts[3] ? urlParts[3] : '');
								obj.port = (urlParts[5] ? urlParts[5] : '');
							}
						}
					}

					this.isRelative = function () {
						return gx.lang.emptyObject(this.host);
					}

					this.isSameApp = function (url) {
						url = new gx.util.Url(url);
						return ((this.protocol == url.protocol) && (this.host == url.host));
					}

					init(this, url);
				};
			})(),

			regExp: {
				isMatch: function (str, rex) {
					var ret = new RegExp(rex).exec(str);
					return (ret !== null);
				},

				replace: function (str, rex, repl) {
					return str.replace(rex, repl);
				},

				split: function (str, rex) {
					return str.split(rex);
				},

				matches: function (str, rex) {
					var ret = new RegExp(rex).exec(str);
					if (ret !== null)
						return ret;
					else
						return [];
				}
			},

			autoRefresh: {
				arTimer: null,

				getProps: function () {
					var rfrTimeout = gx.fn.getHidden("_GxRefreshTimeout");
					if (rfrTimeout != null) {
						rfrTimeout = gx.json.evalJSON(rfrTimeout);
						rfrTimeout.Time = parseInt(rfrTimeout.Time);
					}
					return rfrTimeout;
				},

				install: function () {
					var rfrTimeout = this.getProps();
					if (rfrTimeout != null) {
						this.create();
						if (rfrTimeout.Type == "focus")
							gx.evt.attach(window, "blur", this.destroy);
					}
				},

				create: function () {
					if (this.arTimer == null) {
						var rfrTimeout = this.getProps();
						if (rfrTimeout != null)
							this.arTimer = setTimeout(function () { gx.http.reload(); }, rfrTimeout.Time * 1000);
					}
				},

				destroy: function () {
					if (gx.util.autoRefresh.arTimer != null) {
						window.clearTimeout(gx.util.autoRefresh.arTimer);
						gx.util.autoRefresh.arTimer = null;
					}
				}
			},

			accessKey: function (caption) {
				var aKey = '';
				if (caption.indexOf('&') != -1) {
					var len = caption.length;
					for (var i = 0; i < len - 1; i++) {
						if (caption[i] == '&' && caption[i + 1] != '&') {
							aKey = aKey + caption[i + 1];
							break;
						}
					}
				}
				return aKey;
			},

			accessKeyCaption: function (caption) {
				var dCapt = '';
				if (caption.indexOf('&') == -1)
					return caption;
				var len = caption.length;
				for (var i = 0; i < len - 1; i++) {
					if (caption[i] == '&' && caption[i + 1] != '&') {
						dCapt += caption.substring(i + 1);
						break;
					}
					else
						dCapt += caption[i];
				}
				return dCapt;
			},

			invalidFunc: function (strCode) {
				throw "gxInvalidFunc: " + strCode;
			},

			urlValue: function (ctrl) {
				var value = ctrl;
				if (typeof (value) != 'string')
					value = gx.fn.getControlValueInt(ctrl);
				return encodeURIComponent(value);
			},

			help: function (urlfile) {
				open(urlfile, 'gxHelpWindow', 'toolbar=no,location=no,directories=no,status=yes,menubar=no,scrollbars=yes,resizable=yes,copyhistory=no');
			},

			_init: function () {
				this.browser._init();
				Array.prototype.removeAt = function (idx) {
					this.splice(idx, 1);
				};
			}
		},

		lang: {
			inherits: function (subclass, superclass, mergeConstructors) {
				var oldProt = subclass.prototype;
				subclass.prototype = new superclass();
				for (var pName in oldProt) {
					if (typeof (subclass.prototype[pName]) == 'undefined')
						subclass.prototype[pName] = oldProt[pName];
				}
				if (typeof (subclass.prototype.base) == 'undefined')
					subclass.prototype.base = superclass;

				if (mergeConstructors === true) {
					subclass.prototype.constructor = function () {
						superclass.prototype.constructor.apply(this, arguments);
						oldProt.constructor.apply(this, arguments);
					};
				}
			},

			apply: function (obj, cfg) {
				if (obj && cfg && typeof cfg === 'object') {
					for (var pName in cfg) {
						obj[pName] = cfg[pName];
					}
				}

				return obj;
			},

			instanceOf: function (obj, objClass) {
				if ((obj == null) || (objClass == null))
					return false;
				if (obj instanceof objClass)
					return true;
				if ((objClass == String) && (typeof (obj) == 'string'))
					return true;
				if ((objClass == Number) && (typeof (obj) == 'number' || (typeof (gx.num.dec) != "undefined" && obj instanceof gx.num.dec.bigDecimal)))
					return true;
				if ((objClass == Array) && (typeof (obj) == 'array'))
					return true;
				if ((objClass == Function) && (typeof (obj) == 'function'))
					return true;
				if ((typeof (obj) == 'string') || (typeof (obj) == 'number') || (typeof (obj) == 'array'))
					return false;
				var base = obj.base;
				while (typeof (base) != 'undefined') {
					if (base == objClass)
						return true;
					base = base.base;
				}
				return false;
			},

			clone: function (obj) {
				var newObj = {};
				for (var prop in obj) {
					newObj[prop] = obj[prop];
				}
				return newObj;
			},

			isNumericType: function (type) {
				return type == 'int' || type == 'decimal';
			},

			isBooleanType: function (type) {
				return type == 'boolean' || type == 'bool';
			},

			isArray: function (obj) {
				return obj && typeof obj.length == 'number' && typeof obj.splice == 'function';
			},

			booleanValue: function (obj) {
				if (obj == true || obj == false) {
					return obj;
				}
				else if (typeof (obj) == 'string') {
					if (obj.toLowerCase() == 'true')
						return true;
					else
						return false;
				}
				return false;
			},

			gxBoolean: function (obj) {
				if (typeof (obj) == 'undefined') {
					return false;
				}
				else if (typeof (obj) == 'boolean') {
					return obj;
				}
				else if (typeof (obj) == 'number') {
					if (obj == 0)
						return false;
				}
				else if (typeof (obj) == 'string') {
					if (obj == '')
						return false;
					if (obj.toLowerCase() == 'false')
						return false;
					else if (obj.replace(/^ */, '').replace(/ *$/, '') == '0')
						return false;
				}
				return true;
			},

			arrayToSource: function (Arr) {
				if (Arr.toSource != null)
					return Arr.toSource();
				var Result = "[";
				var len = Arr.length;
				var size = len - 1;
				for (var i = 0; i < len; i++) {
					Result += this.objectToSource(Arr[i]);
					if (i < size)
						Result += ',';
				}
				Result += ']';
				return Result;
			},

			objectToSource: function (Obj) {
				if (this.isArray(Obj))
					return this.arrayToSource(Obj);
				if (typeof (Obj) == "object") {
					var Result = '{';
					var Sep = '';
					for (var i in Obj) {
						var stri = i;
						if (stri == "") {
							stri = "\'\'";
						}
						else if (typeof (stri) == "string") {
							stri = "\'" + stri + "\'";
						}
						Result += Sep;
						if (typeof (Obj[i]) == "object")
							Result += stri + ':' + this.objectToSource(Obj[i]);
						else if (typeof (Obj[i]) == "string")
							Result += stri + ":\'" + this.encodeValue(Obj[i]) + "\'";
						else
							Result += stri + ':' + Obj[i];
						Sep = ',';
					}
					Result += '}';
					return Result;
				}
				return '\'' + this.encodeValue(Obj.toString()) + '\'';
			},

			emptyNum: function (obj) {
				return (obj && obj === 0) || !obj
			},

			emptyObj: function (obj) {
				if (obj) {
					for (var prop in obj)
						if (obj.hasOwnProperty(prop))
							return false;
					return true;
				} else
					return true;
			},

			/*Returns true for undefined, null, empty string, zero, and NaN*/
			emptyObject: function (obj) {
				if ((obj === undefined) || (obj == null) || (obj == '') || (typeof (obj) == 'number' && isNaN(obj)))
					return true;
				return false;
			},

			supEval: function (obj, arr) {
				var fcn = null;
				if (arr instanceof String || typeof (arr) == 'string')
					fcn = obj[arr];
				else
					fcn = arr;
				return function () {
					return fcn.apply(obj, arguments);
				};
			},

			getType: function (typeName) {
				var typeObj = null;
				try {
					var i = 0;
					var fn = window;
					var arr = typeName.split(".");
					var len = arr.length;
					for (i = 0; i < len; i++) {
						if (fn[arr[i]]) {
							fn = fn[arr[i]];
						}
					}
					if (fn && fn != window)
						typeObj = fn;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'getType');
				}
				return typeObj;
			},

			doEval: function (src, scope) {
				scope = scope || window;
				if (scope.execScript)
					return scope.execScript(src);
				else if (eval.call)
					return eval.call(scope, src);
				else
					return eval(src);
			},

			doCall: function () {
				try {
					var func = arguments[0];
					var args = [];
					var len = arguments.length;
					for (var i = 1; i < len; i++) {
						args.push(arguments[i]);
					}
					return func.apply(this, args);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'doCall');
				}
			},

			doExecTimeout: function (obj) {
				clearTimeout(obj.t);
				obj.f.call();
			},

			doCallTimeout: function (func, ctx, args, to) {
				var _function = func.closure(ctx, args);
				var timer = setTimeout(_function, to);
				return { f: _function, t: timer };
			},

			encodeValue: function (Value) {
				return gx.text.charReplace(Value, ['"', "'", '\r', '\n'], ['\\042', '\\047', '\\015', '\\012']);
			},

			decodeValue: function (Value) {
				Value = gx.text.replaceAll(Value, "\\042", "\"");
				return gx.text.replaceAll(Value, "\\015\\012", "\r\n");
			},

			htmlDecode:  (function() {
				// Remove HTML Entities
				var element = document.createElement('div');

				function decodeHTMLEntities (str) {
					if (str && typeof str === 'string') {
						// Escape HTML before decoding for HTML Entities
						str = escape(str).replace(/%26/g,'&').replace(/%23/g,'#').replace(/%3B/g,';');

						element.innerHTML = str;
						str = $(element).text();
						$(element).text('')
					}
					return unescape(str);
				}
				return decodeHTMLEntities;
			})(),

			arrayUnique: function (array) {
				var a = array.concat();
				for(var i=0; i<a.length; ++i) {
					for(var j=i+1; j<a.length; ++j) {
						if(a[i] === a[j]) {
							a.splice(j--, 1);
						}
					}
				}

				return a;
			},
			
			objToArray: function () {
				var fnObjToArray = function (value) {
					return [value];
				};

				return function (obj) {
					return $.map(obj, fnObjToArray)
				}
			}()
		},

		cache: (function () {
			var initialized = false;

			return {
				exceptionsRegEx: false,
				remoteFiles: {},
				inlineCode: {},

				isCacheable: function (file) {
					if (!this.exceptionsRegEx)
						return true;

					return !!file && file.search(this.exceptionsRegEx) == -1;
				},

				addRemoteFile: function (file) {
					if (this.isCacheable(file)) {
						file = gx.util.noParmsUrl(file);
						var fileUrl = gx.util.resourceUrl(file, true);
						this.remoteFiles[fileUrl] = true;
					}
				},

				addLoadedFile: function (file) {
					if (this.isCacheable(file)) {
						file = gx.util.noParmsUrl(file);
						var fileUrl = gx.util.resourceUrl(file, true);
						this.remoteFiles[fileUrl] = true;
					}
				},

				removeAllRemoteFiles: function () {
					this.remoteFiles = {};
				},

				removeRemoteFiles: function (pattern) {
					var remoteFile;
					if (pattern) {
						for (remoteFile in this.remoteFiles) {
							if (pattern.exec(remoteFile)) {
								this.remoteFiles[remoteFile] = false;
							}
						}
					}
				},

				removeRemoteFile: function (file) {
					file = gx.util.noParmsUrl(file);
					var fileUrl = gx.util.resourceUrl(file, true);
					this.remoteFiles[fileUrl] = false;
				},

				fileLoaded: function (file) {
					file = gx.util.noParmsUrl(file);
					var fileUrl = gx.util.resourceUrl(file, true);
					if (this.remoteFiles[fileUrl])
						return true;
					return false;
				},

				updateStyles: function (olds, news) {
					var deleted = [];
					var len = olds.length;
					for (var i = 0; i < len; i++) {
						var sheet = olds[i];
						if (!gx.lang.emptyObject(sheet)) {
							var found = false;
							var len1 = news.length;
							for (var j = 0; j < len1; j++) {
								if (sheet == news[j]) {
									found = true;
									break;
								}
							}
							if (!found)
								deleted.push(sheet);
						}
					}
					var imgsDir = gx.staticDirectory;
					if (imgsDir.charAt(0) == '/')
						imgsDir = imgsDir.substring(1);
					len = deleted.length;
					for (var i = 0; i < len; i++) {
						var sheet = deleted[i];
						if (sheet.charAt(0) != '/')
							sheet = imgsDir + sheet;
						this.removeRemoteFile(sheet);
					}
				},

				addInlineCode: function (obj) {
					this.inlineCode[obj] = true;
				},

				deleteInlineCode: function (obj) {
					delete this.inlineCode[obj];
				},

				codeLoaded: function (obj) {
					if (this.inlineCode[obj])
						return true;
					return false;
				},

				_init: function () {
					if (gx.pO.fullAjax && gx.spa.started) {
						gx.cache.exceptionsRegEx = /messages\..+\.js/;
					}
					if (!initialized) {
						initialized = true;
						var imgsDir = gx.staticDirectory;
						if (imgsDir.charAt(0) == '/')
							imgsDir = imgsDir.substring(1);
						var scripts = gx.dom.scripts();
						var len = scripts.length;
						for (var i = 0; i < len; i++) {
							var docScript = scripts[i];
							if (!gx.lang.emptyObject(docScript)) {
								if (docScript.charAt(0) != '/' && !gx.ajax.isabsoluteurl(docScript))
									docScript = imgsDir + docScript;
								this.addRemoteFile(docScript);
							}
						}
						var styles = gx.dom.styles();
						var len = styles.length;
						for (var i = 0; i < len; i++) {
							var sheet = styles[i];
							if (!gx.lang.emptyObject(sheet)) {
								if (sheet.charAt(0) != '/' && !gx.ajax.isabsoluteurl(sheet))
									sheet = imgsDir + sheet;
								this.addRemoteFile(sheet);
							}
						}
					}
				}
			}
		})(),

		evt: {
			enter: false,
			lastKey: -1,
			lastControl: null,
			lastEvent: null,
			dummyCtrl: {},
			keyListeners: {},
			shiftPressed: false,
			execLoad: true,
			autoSkip: false,
			hooks: [],
			controlKeys: [0x03, 0x06, 0x08, 0x09, 0x0C, 0x0D, 0x0E, 0x10, 0x11, 0x12, 0x13, 0x14, 0x1B, 0x20, 0x21, 0x22, 0x23, 0x24, 0x25, 0x26, 0x27, 0x28, 0x2C, 0x2D, 0x2E],
			triggerKeys: [13, 32],
			processing: true,
			userReady: false,
			skipPromptCtrl: true,

			addHook: function (obj, evt, handler) {
				this.hooks[this.hooks.length] = { c: obj, e: evt, f: handler };
			},

			waitGridRefresh:function( toDoFnc) {
				if ( gx.evt.refreshGridCallback instanceof Array)
					gx.evt.refreshGridCallback.push( toDoFnc)
				else
					toDoFnc.call();
			},

			notifyRefreshGrid:function( ) {
				if ( gx.evt.refreshGridCallback && gx.evt.refreshGridCallback instanceof Array)	{
					while (gx.evt.refreshGridCallback.length > 0) {
						var toDocFnc = gx.evt.refreshGridCallback.pop();
						if (typeof (toDocFnc) == 'function')
							toDocFnc.call();
					}
					gx.evt.refreshGridCallback = undefined;
				}
			},

			clearHooks: function () {
				var len = this.hooks.length;
				for (var i = 0; i < len; i++) {
					var hook = this.hooks[i];
					try {
						this.detach(hook.c, hook.e, hook.f);
						hook.c = null;
						hook.f = null;
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'clearHooks');
					}
					this.hooks[i] = null;
					hook = null;
				}
				this.hooks = [];
			},

			source: function (evt) {
				return (evt.target || evt.currentTarget || evt.srcElement);
			},

			attach: function (obj, evt, unScopedHandler, scope, options) {
				options = options || {};
				if (typeof (evt) == "string") {
					var handler = unScopedHandler;
					if (scope) {
						handler = unScopedHandler.closure(scope);
					}

					if (options.single) {
						var originalHandler = handler,
							handlerRan = false,
							handlerTimeout;

						handler = function () {
							// Altough the handler is detached to have a single execution of the handler, the mechanism is reinforced by 
							// using a flag to know if the handler was ran. This is because FF has issues with transitions and 'transitionend'
							// event handlers get fired more than once, even if the handler was detached, when more than one property has transitions.
							if (!handlerRan) {
								if (handlerTimeout) {
									clearTimeout(handlerTimeout);
								}
								gx.evt.detach(obj, evt, originalHandler, options);
								originalHandler.apply(this, arguments);
								handlerRan = true;
							}
						};
						
						if (options.timeout) {
							handlerTimeout = setTimeout(handler, options.timeout)
						}
					}

					if (obj.addEventListener) {
						obj.addEventListener(evt, handler, options.useCapture || false);
					}
					else if (obj.attachEvent) {
						obj.attachEvent('on' + evt, handler);
					}
					else {
						obj['on' + evt] = handler;
					}
					this.addHook(obj, evt, handler);
				}
				else if (gx.lang.isArray(evt)) {
					for (var i = 0, len = evt.length; i < len; i++) {
						this.attach(obj, evt[i], unScopedHandler, scope, options);
					}
				}
			},

			detach: function (obj, evt, handler, options) {
				try {
					options = options || {};
					if (typeof (evt) == "string") {
						if (obj.removeEventListener) {
							obj.removeEventListener(evt, handler, options.useCapture || false);
						}
						else if (obj.detachEvent) {
							obj.detachEvent('on' + evt, handler);
						}
						else {
							obj['on' + evt] = null;
						}
					}
					else if (gx.lang.isArray(evt)) {
						for (var i = 0, len = evt.length; i < len; i++) {
							this.detach(obj, evt[i], handler, options);
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'detach');
				}
			},

			cancel: function (evt, cancel) {
				if (cancel && gx.util.browser.isIE() && typeof (evt.keyCode != 'undefined')) {
					try { evt.keyCode = 0; } catch (e) { }
				}
				if (typeof (evt.preventDefault) == 'undefined') {
					evt.cancelBubble = cancel;
					evt.returnValue = !cancel;
				}
				else {
					if (cancel) {
						evt.preventDefault();
						evt.stopPropagation();
					}
				}
			},


			checkCtrlFocus: function (Control) {
				try {
					if (gx.evt.fixWebKitOnFocus() && Control.type == 'button') {
						if (gx.fn.isAccepted(Control)) {
							if (Control.onfocus != undefined) { Control.onfocus(); }
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'checkCtrlFocus');
				}
			},

			doClick: function (ControlId, Event) {
				if (gx.evt.processing && !gx.csv.validating)
					return;
				var eventSource = gx.evt.source(Event);
				if (eventSource.type != 'button' && eventSource.type != 'submit') {
					var Control = gx.dom.el(ControlId);
					if (gx.fn.isAccepted(Control)) {
						if (Control.onfocus != undefined) { Control.onfocus(); }
						if (Control.onclick != undefined) { Control.onclick(); }
						if (Control.nodeName == 'INPUT' && Control.type == 'submit') {
							gx.dom.form().submit();
						}
					}
				}
			},

			executeOnblur: function (gxCurrentFocusControl) {
				var gxLastFocusCtrl = gx.csv.lastId;
				var gxFocusCtrl = gx.O.focusControl;

				gx.O.focusControl = gxCurrentFocusControl;
				this.onblur(gx.O.focusControl);

				gx.O.focusControl = gxFocusCtrl;
				gx.csv.lastId = gxLastFocusCtrl;
			},

			onblur: function (gxLastFocusCtrl) {
				if (!gx.O || gx.csv.IgnoreBlur === true)
					return;
				gx.csv.lastId = gxLastFocusCtrl;
				try {
					var vStruct = gx.fn.validStruct(gxLastFocusCtrl);
					if (vStruct && vStruct.gxgrid != null)
						vStruct.gxgrid.updateControlValue(vStruct, false);
					var Elem = gx.csv.lastControl;
					var MaxLength = Elem.getAttribute("maxlength");
					if (MaxLength > 0 && Elem.value.length >= MaxLength)
						Elem.value = Elem.value.substring(0, MaxLength);
					if (vStruct && vStruct.type == 'bits' && vStruct.ro == 0) {
						var fileInput = gx.fn.getControlGridRef(vStruct.fld, vStruct.gxgrid ? vStruct.gxgrid.gridId : "");
						// WA: Webkit browsers don't set focus on input='file' controls when clicked.
						if (gx.util.browser.isWebkit() && Elem.id.indexOf(vStruct.fld) < 0)
							Elem = fileInput;
						var multimediaCt = gx.html.multimediaUpload.getContainer(fileInput);
						gx.html.multimediaUpload.refreshPreviewImg(multimediaCt, Elem);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'onblur');
				}
			},

			onfocus: function () {
				var fun = function () {
					gx.fx.obs.notify('gx.onbeforevalidate');
					gx.evt.onfocus_impl.apply(gx.evt, arguments);
					gx.fx.obs.notify('gx.onaftervalidate');
				}
				if (gx.evt.is_button_mouse_event === true || gx.fx.suggestProcessing)
					gx.fx.obs.addObserver('gx.validation', this, fun.closure(this, arguments), { single: true });
				else
					fun.apply(gx.evt, arguments);
			},

			onfocus_impl: function (Ctrl, gxFocusCtrl, gxWCP, gxInMasterPage, gxCurrentRow, gxCurrentGrid, gxAddLines) {
				try {
					gx.evt.setReady(false);
					if (!gx.fn.checkPopupFocus(Ctrl)) {
						gx.evt.setReady(true);
						return false;
					}
					var NewComponentContext = false;
					if (gx.csv.cmpCtx != gxWCP) {
						NewComponentContext = true;
						gx.O.fromValid = 0;
					}
					gx.setGxO(gxWCP, gxInMasterPage);
					if (NewComponentContext)
						gx.fn.changeCmpContext();
					gx.fn.initOld(Ctrl);
					try {
						if (gx.grid.lastFocusCtrl != null) {
							gx.csv.lastId = gx.grid.lastFocusCtrl;
							gx.grid.lastFocusCtrl = null;
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'onfocus');
					}
					gx.csv.rowChanged = false;
					gx.csv.lastControl = Ctrl;
					if (gxCurrentGrid == 0 || gxCurrentRow != '') {
						gx.fn.setCurrentGridRow(gxCurrentGrid, gxCurrentRow);
					}
					gx.fx.installSuggest(Ctrl);
					var gridChange = false;
					if (gx.csv.lastGrid != gxCurrentGrid) {
						gx.csv.lastRow[gxCurrentGrid] = null;
						if (!gxAddLines) {
							if (gx.csv.lastGrid < gxCurrentGrid) {
								var firstGridCtrl = gx.fn.firstGridControl(gxCurrentGrid);
								if (gx.O.fromValid > firstGridCtrl)
									gx.O.fromValid = firstGridCtrl;
							}
							gx.csv.lastGrid = gxCurrentGrid;
						}
						gridChange = true;
					}
					gx.O.focusControl = gxFocusCtrl;
					if (!gx.csv.onloadFocus) {
						try { gx.fx.ctx.notify(Ctrl); }
						catch (e) {
							gx.dbg.logEx(e, 'gxapi.js', 'onfocus');
						}
					}
					if (gx.csv.disableFocus) {
						gx.csv.disableFocus = false;
						gx.evt.setReady(true);
						return true;
					}
					try {
						var cMode = gx.fn.getControlValue("Mode");
						if (cMode == 'DLT' || cMode == 'DSP') {
							gx.evt.setReady(true);
							return true;
						}
						if (gx.O.isTransaction() && gx.dom.isButton(Ctrl) && !gx.evt.isEnterEvtCtrl(Ctrl) && !gx.evt.isCheckEvtCtrl(Ctrl) && !gxAddLines) {
							gx.evt.setReady(true);
							return true;
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'onfocus');
					}

					if (gx.O.isTransaction()) {
						if (Ctrl.gxdisabled && gx.csv.lastControl != null) {
							cn = gx.fn.getControlIndex(Ctrl) + 1;
							if (cn != -1) {
								NextFocus = gx.fn.searchFocusFwd(cn);
								if (NextFocus != null) {
									gx.fn.setFocus(NextFocus);
									gx.evt.setReady(true);
									return true;
								}
							}
							gx.fn.setFocus(gx.csv.lastControl);
							gx.evt.setReady(true);
							return true;
						}
					}

					if (gx.csv.invalidForcedCtrl) {
						gx.fn.setFocusOnError(gx.csv.invalidForcedCtrl.id)
						gx.csv.invalidForcedCtrl = null;
						gx.evt.setReady(true);
						return true;
					}
					if (gx.csv.invalidControl != null && gx.csv.invalidControl != Ctrl && gx.O.focusControl >= gx.csv.invalidId) {
						if (gx.csv.invalidControl == Ctrl) {
							gx.csv.validate(gx.csv.invalidControl, gx.csv.invalidId, false).done(function (isValid) {
								if (isValid) {
									gx.csv.invalidControl = null;
									gx.evt.setReady(true);
								}
							});
							return true;
						}
					}
					if (gxAddLines) {
						gx.O.fromValid = gx.fn.firstGridControl(gx.csv.lastGrid);
						gx.O.toValid = gx.fn.firstCtrlAfterGrid(gx.O.fromValid, gx.csv.lastGrid);
						gx.O.focusControl = gx.O.toValid;
					}
					else {
						gx.O.toValid = gx.O.focusControl;
						if (gx.O.focusControl < gx.O.fromValid) {
							gx.O.fromValid = gx.O.focusControl;
						}
					}
					if ((gx.csv.lastRow[gxCurrentGrid] != undefined) && (gx.csv.lastRow[gxCurrentGrid] != gxCurrentRow) && !gridChange) {
						if (gx.O.fromValid == gx.O.toValid)
							gx.csv.lastId = gx.O.fromValid;
					}
					var allIds = gx.fn.controlIds();
					if (allIds.length > 0) {
						if (gx.O.fromValid < allIds[0])
							gx.O.fromValid = allIds[0];
					}
					if (gx.lang.emptyObject(gx.csv.lastRow[gxCurrentGrid]) && gxCurrentGrid != 0) {
						gx.csv.rowChanged = true;
						gx.csv.lastRow[gxCurrentGrid] = gxCurrentRow;
					}
					var gxO = gx.O,						
						lastId = gx.csv.lastId;
					var vStruct = gx.fn.validStruct(lastId, gxO);	
					if (vStruct) {
						var lastRow = gx.csv.lastRow[vStruct.grid];
					}
					gx.csv.checkRowChange(lastId, gridChange, gxO, lastRow).done(function (rowValidated) {
					    var goForwardInGrids = false;
					    var goBackwardInGridRows = false;
					    var afterValidateFn = function () {
							if (gx.csv.invalidControl == null) {
								if (Ctrl.nodeName == 'SELECT') {
									if (!gx.util.browser.isIE() || gx.util.browser.ieVersion() >= 7) {
										gx.fn.setSelection(Ctrl);
									}
								}
								else {
									gx.fn.setSelection(Ctrl);
								}
							}
							gx.csv.disableFocusCondition();
							gx.evt.setReady(true);
						};
						
						if (!gx.lang.emptyObject(lastRow) && !gx.lang.emptyObject(gxCurrentRow) && lastRow.length > gxCurrentRow.length) {
							var currRowLen = gxCurrentRow.length;
							var lastRowParent = lastRow.substring((lastRow).length - currRowLen);
							goForwardInGrids = parseInt(lastRowParent) < parseInt(gxCurrentRow);
						}
						if (gx.csv.backwardGridValidation) {
						    //Go to an upper row 
						    if (!gx.lang.emptyObject(lastRow) && !gx.lang.emptyObject(gxCurrentRow) && lastRow.length == gxCurrentRow.length && parseInt(lastRow) > parseInt(gxCurrentRow)) {
						        goBackwardInGridRows = gxO.focusControl > gx.fn.firstGridControl(gxCurrentGrid);
						    }
						    //Go to a lower row AND ControlId is lower than lastId
						    if (!gx.lang.emptyObject(lastRow) && !gx.lang.emptyObject(gxCurrentRow) && lastRow.length == gxCurrentRow.length && parseInt(lastRow) < parseInt(gxCurrentRow)) {
						        goBackwardInGridRows = (gxO.focusControl < lastId) && (gxO.focusControl > gx.fn.firstGridControl(gxCurrentGrid));
						    }
						}

						if (gx.csv.backwardGridValidation && rowValidated && gx.csv.invalidControl == null && goBackwardInGridRows) {
							gxO.fromValid = gx.fn.firstGridControl(gxCurrentGrid);
							gx.csv.validControls(gxO.fromValid, gxO.focusControl, true, gx.O);
						}
						else if ((!rowValidated || gridChange) && (gxO.focusControl >= lastId || goForwardInGrids)) {
							if (gx.fn.lastMainLevelCtrlId(lastId, gxCurrentGrid)) {
								var lastIdCtrl = gx.fn.getControlRefById(lastId)
								if (lastIdCtrl && lastIdCtrl.getAttribute("gxvalid") === 1)
									gxO.fromValid = lastId + 1;
							}
							gx.csv.validateAll(gxO).done(afterValidateFn);
						}
						else {
							gxO.toValid = gxO.focusControl;
							afterValidateFn();
						}
					});
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'onfocus');
				}
				return false;
			},

			userOnload: function () {
				try {
					if (typeof (window['GXOnloadUsr']) == 'function') {
						GXOnloadUsr();
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'userOnload');
				}
			},

			onload: function () {
				gx.objectLoad().done( function () {
					gx.spa.start({
						listeners: {
							'onnavigatestart': function () {
								gx.dom.addClass(document.body, 'gx-spa-navigating');
							},
							'onnavigate': function () {
								gx.dom.removeClass(document.body, 'gx-spa-navigating');
							},
							'onbeforesend': function (eventObject, spaRequestHeader, mpRequestHeader) {
								if (gx.pO.MasterPage)
									eventObject.req.setRequestHeader(mpRequestHeader, gx.pO.MasterPage.ServerClass);
							},
							'onbeforeprocessresponse': function (eventObject, responseText, gxObjectClass, sourceMpClass, targetMpClass, sameMp) {
								gx.reinit(!sameMp);
							},
							'oncontentreplace': function (eventObject, responseText, contents, objectName, sourceMpObj, sourceMpName, targetMpName, sameMp) {
								var objectClass = gx.lang.getType(objectName),
									mpName = (sourceMpName == targetMpName ? sourceMpName : targetMpName),
									mpClass = mpName ? gx.lang.getType(mpName.toLowerCase()) : false,
									jsonResponse = gx.ajax.getJsonResponse();

								if (jsonResponse)
									gx.fn.setJsonHiddens(jsonResponse.gxHiddens, false);
								objectClass.prototype = new gx.GxObject;
								gx.setParentObj(new objectClass());
								if (sameMp) {
									gx.setMasterPage(sourceMpObj);
								}
								else {
									if (mpClass)
										gx.setMasterPage(new mpClass());
								}

								gx.ajax.clearJsonResponse();
								if (jsonResponse) {
									gx.ajax.setJsonResponse(jsonResponse, false, function () {
										gx.objectLoad(jsonResponse.gxGrids).done( function() {
											// Hiddens are restored as gx.objectLoad cleans web component
											// related hiddens before loading them.
											gx.fn.setJsonHiddens(jsonResponse.gxHiddens, false);
											gx.pO.SetStandaloneVars();
										});
									}, gx.O);
								}
								else {
									gx.objectLoad();
								}
							}
						}
					});
				});
			},

			onready: function (event) {
				if (gx.lang.emptyObject(event)) {
					if (document.readyState == 'complete')
						gx.evt.onload();
					else
						setTimeout(function () { gx.evt.onready(null); }, 250);
				}
				else if (gx.util.browser.isIE()) {
					if (document.readyState == 'complete')
						gx.evt.onload();
				}
			},

			on_ready: function (context, fnc) {
				gx.fx.obs.addObserver('gx.onload', context, fnc);
			},

			onunload: function (unloadMasterPage) {
				gx.objectUnload(unloadMasterPage);
				gx.spa.stop();
			},

			onclick: function (evt) {
				gx.evt.setReady(false);
				if (gx.evt.processing && !gx.csv.validating) {
					gx.evt.cancel(evt, true);
				}
				gx.evt.mouse.update(evt);
				setTimeout(function () {
					gx.fx.ctx.notify();
				}, 10);
				gx.evt.setReady(true);
			},

			onmousedown: function (evt) {
				var evtObj = window.event || evt,
					sourceEl = gx.evt.source(evtObj);

				if (sourceEl && gx.util.browser.ieVersion() <= 8 && sourceEl.tagName.toUpperCase() === 'SHAPE') {
					return false;
				}

				gx.evt.is_button_mouse_event = gx.dom.isButtonLike(sourceEl);
				gx.evt.mouse.update(evt);
				var dnd = gx.fx.dnd;
				dnd.deleteClonControl();
				var dragSource = dnd.getSource(evtObj);
				if (dragSource != null) {
					gx.evt.cancel(evtObj, true);
					gx.setGxO(dragSource.obj);
					dnd.drag(dragSource.obj, dragSource.types, dragSource.hdl);
				}
			},

			onmousemove: function (evt) {
				gx.evt.mouse.update(evt);
				var dnd = gx.fx.dnd;
				var isIE = gx.util.browser.isIE();
				if (gx.popup.ispopup()) {
					var pExt = gx.popup.ext;
					pExt.movepopup();
					if ((pExt.currIDb != null) || (pExt.currRS != null)) {
						return false;
					}
				}
				if (dnd.obj != null) {
					var evtObj = window.event || evt;
					gx.evt.cancel(evtObj, true);
					var dropTarget = gx.fx.dnd.getTarget(evtObj, dnd.obj.gxDragTypes);
					if (dropTarget != null)
						dnd.over();
					dnd.moveControl(dnd.dragCtrl);
				}
			},

			onmouseup: function (evt) {
				gx.evt.is_button_mouse_event = false;
				gx.evt.mouse.update(evt);
				var dnd = gx.fx.dnd;
				if (dnd.dragCtrl != null) {
					var evtObj = window.event || evt;
					var dropTarget = dnd.getTarget(evtObj, dnd.obj.gxDragTypes);
					if (dropTarget != null) {
						dnd.deleteClonControl();
						gx.setGxO(dropTarget.obj);
						dnd.drop(dnd.dropCtrl, dropTarget.obj, dropTarget.hdl);
					}
					else {
						dnd.restoreControl();
					}
					var evtObj = window.event || evt;
					gx.evt.cancel(evtObj, true);
				}
				dnd.out();
				dnd.dragCtrl = null;
				dnd.obj = null;
				if (gx.popup.ispopup()) {
					gx.popup.ext.currRS = null;
				}
			},

			ondblclick: function (evt) {
				gx.evt.mouse.update(evt);
				var evtObj = window.event || evt;
				gx.fx.dom.raiseEvent('dblclick', evtObj);
			},

			onwindowblur: function (evt) {
				gx.fx.dnd.deleteClonControl();
			},

			checkMaxLength: function (Ctrl, MaxLength, event) {
				var Evt = window.event || event,
					isIE = gx.util.browser.isIE(),
					keyCode = Evt.keyCode;
				if (isIE) {
					if (Evt.type == "keydown" && keyCode == 229) {
						if (Ctrl.value.length <= MaxLength) {
							Ctrl.ImeKey = true;
							return true;
						} else {
							return false;
						}
					}
					else if (Evt.type == "keyup" && keyCode == 8 && Ctrl.ImeKey && Ctrl.value.length + 1 >= MaxLength) {
						Ctrl.value = Ctrl.value.substring(0, Ctrl.value.length - 1);
						Ctrl.ImeKey = false;
						return true;
					}
				}
				if (Evt.type == "keyup" || isIE) {
					return (Ctrl.value.length + 1 <= MaxLength) || (keyCode == 8 || keyCode == 9 || keyCode == 46 || (keyCode >= 35 && keyCode <= 40));
				}
			},

			onkeypress: function (xevent, hasenter, skiponenter) {
				if ((xevent == null) && (!window.event)) { return; }
				if ((xevent != null) && (window.event)) { return; }
				var event = (xevent == null ? window.event : xevent);
				
				var fn = gx.fn, 
					browser = gx.util.browser;

				var eventObject = {
					event: event,
					hasEnter: hasenter,
					skipOnEnter: skiponenter,
					cancel: false
				};
				gx.fx.obs.notify("gx.keypress", [eventObject]);
				if (eventObject.cancel) {
					return;
				}

				if (event.keyCode == 27) //ESC
				{
					if (gx.popup.ispopup()) {
						fn.closeWindow();
						return;
					}
				}
				if (event.keyCode == 13 && gx.evt.processing && !gx.csv.validating) {
					this.cancel(event, true);
				}
				if (!gx.O || (gx.O.isTransaction() && gx.O.Gx_mode == 'DSP' && this.invalidDSPKey(event))) {
					this.cancel(event, true);
					return false;
				}

				this.lastKey = event.keyCode;
				this.shiftPressed = event.shiftKey;
				var ctrlPressed = event.ctrlKey;

				var Ctrl = gx.evt.source(event) || gx.dom.getActiveElement() || gx.csv.lastControl;

				gx.csv.invalidateCtrl(Ctrl, event);

				if (this.isEnterEvtCtrl(Ctrl) && this.isTriggerKey(event)) {
					if (this.cancelAndRefresh(event))
						return;
				}

				this.checkFuncKey(event, Ctrl);

				if (event.charCode == 32 || event.keyCode == 32 || (event.keyCode == 13 && !skiponenter)) {
					if (gx.dom.hasClass(Ctrl, 'gx_newrow')) {
						var gridCt = gx.dom.findParentByTagName(Ctrl, 'DIV');
						if (gridCt) {
							var grid = gx.O.getGridById(gridCt.getAttribute('gxgridid'));
							if (grid)
								grid.getNewRows(1, event);
						}
					}
				}

				if (event.keyCode == 13) {
					var triggersEvt = this.triggersEvt(Ctrl);
					if (skiponenter) {
						if (fn.enterHasFocus())
							return;
						if (this.shiftPressed && (Ctrl.nodeName == 'TEXTAREA') && browser.isIE())
							return;
						if (ctrlPressed && (Ctrl.nodeName == 'TEXTAREA')) {
							if (!browser.isIE())
								gx.dom.replaceAtCaretPosition(Ctrl, '\n');
								return;
						}
						else {
							if (browser.isIE() && Ctrl.type != 'file') {
								if (gx.evt.isEnterEvtCtrl(Ctrl))
									gx.O.executeEnterEvent(event, Ctrl);
								event.keyCode = 9;
								this.lastKey = event.keyCode;
								if (browser.ieVersion() >= 11) {
									event.preventDefault();
									fn.setFocus(fn.searchFocus(fn.getControlIndex(Ctrl) + 1, true));
								}
							}
							else {
								if (Ctrl.value && browser.isIE() && Ctrl.tagName != 'SELECT') {
									var tmpValue = Ctrl.value;
									Ctrl.value = "";
									Ctrl.value = tmpValue;
								}
								fn.skipFocus(skiponenter);
								this.cancel(event, true);
							}
							this.enter = false;
						}
					}
					else if (!triggersEvt) {
						gx.O.executeEnterEvent(event, Ctrl);
					}
				}
			},

			onkeyup: function (domevent) {
				var event = window.event ? window.event : domevent;
				var evel = gx.evt.source(event);
				var maxlen = evel.getAttribute("maxlength");
				var value = typeof (evel.value) == "undefined" ? "" : evel.value;
				if ((evel.type == "" && this.lastKey == 9) || (this.autoSkip && evel.type != "" && !this.isControlKey(this.lastKey) && value.length >= maxlen)) {
					if (!this.skipPromptCtrl)
						return;

					if (gx.dom.isTextWithLink(evel)) {
						var controlId = evel.id || (evel.tagName == 'A' && evel.parentNode ? evel.parentNode.id : "");
						if (controlId) {
							var vStructId = gx.O.getValidStructId(controlId);
							gx.evt.onfocus(evel, vStructId, '', false, '', 0)
						}
						return;
					}
					var ctrlFocuseable = evel.getAttribute('gxfocusable');
					if (ctrlFocuseable != null && ctrlFocuseable == '1') {
						return;
					}
					var el = gx.fn.getControlIndex(gx.csv.invalidControl ? gx.csv.invalidControl : gx.csv.lastControl);
					if (el == -1)
						return true;
					var Control = gx.fn.searchFocus(this.shiftPressed ? el - 1 : el + 1, !this.shiftPressed);
					gx.fn.setFocus(Control);
				}
			},

			setEventRow: function (GxObj, Control) {
				var ctrlGrid = gx.fn.rowGridId(Control);
				var ctrlRow = gx.fn.controlRowId(Control) || gx.fn.currentGridRowImpl(ctrlGrid) || '0001';
				if ((ctrlGrid != null) && (ctrlRow != null)) {
					if (Control.gxGridName != undefined) {
						gx.fn.setHidden(GxObj.CmpContext + Control.gxGridName.toUpperCase() + "_ROW", ctrlRow);
					}
					gx.csv.lastEvtRow = ctrlRow;
					gx.fn.setCurrentGridRow(ctrlGrid, ctrlRow);
				}
			},

			ctrlOnchange: function (Mode, IsConfirmed, IsKey, Button, sIdiom) {
				gx.csv.pkDirty = IsKey;
				if (Mode.value == "UPD") {
					if (IsConfirmed.value == "1") {
						if (IsKey) {
							if (Button != null)
								Button.value = gx.getMessage("GXM_captionadd");
						}
						else {
							if (Button != null)
								Button.value = gx.getMessage("GXM_captionupdate");
						}
						IsConfirmed.value = "0";
					}
					else {
						if (IsKey) {
							if (Button != null)
								Button.value = gx.getMessage("GXM_captionadd");
						}
					}
				}
				else if (Mode.value == "INS") {
					if (IsConfirmed.value == "1") {
						if (Button != null)
							Button.value = gx.getMessage("GXM_captionadd");
						IsConfirmed.value = "0";
					}
				}
			},

			onchange: function () {
				var fun = function () {
					gx.evt.onchange_impl.apply(gx.evt, arguments);
				}
				if (gx.fx.suggestProcessing)
					gx.fx.obs.addObserver('gx.validation', this, fun.closure(this, arguments), { single: true });
				else
					fun.apply(gx.evt, arguments);
			},

			onchange_impl: function (Ctrl) {
				gx.evt.setReady(false);
				gx.evt.lastControl = Ctrl;
				var CtrlValue = gx.fn.getControlValue(gx.dom.id(Ctrl));			

				var fixWebKitOnfocus = (gx.evt.fixWebKitOnFocus() && Ctrl.type == "radio");
				if (fixWebKitOnfocus)
					Ctrl.onfocus();
				var vStruct;
				var changed = false;				
				if (Ctrl.getAttribute(gx.csv.GX_OLD_VALUE_ATTRIBUTE) != CtrlValue) {
					changed = true;
					gx.fn.setControlValue("IsModified", "1");
					gx.fn.setControlValue("IsConfirmed", "0");
					var jsCode = '',
						execOnChange = true;
					vStruct = gx.O.getValidStructFld(Ctrl.id);
					if (vStruct) {
						if (typeof (vStruct.c2v) == 'function')
							vStruct.c2v();
						if (typeof (vStruct.v2bc) == 'function')
							vStruct.v2bc.call(gx.O);
					}
					if (Ctrl.type == "select-one" || Ctrl.type == "checkbox" || Ctrl.type == "radio") {
						execOnChange = false;
						gx.csv.validate(Ctrl, gx.O.focusControl, true, gx.O).done(function (isValid) {
							if (isValid) {
								if (gx.csv.invalidControl == Ctrl) {
									gx.csv.invalidControl = null;
								}
							}
							gx.evt.execOnchange(Ctrl, isValid);
						});
					}
					gx.fn.setControlOldValue(Ctrl, CtrlValue);
					if (execOnChange) {
						gx.evt.execOnchange(Ctrl, false);
					}
				}
				var usrChg = gx.evt.execUsrOnchange(Ctrl);
				gx.evt.setReady(true);

				var fireOnblur = (gx.util.browser.isWebkit() && (Ctrl.type == "radio" || Ctrl.type == "checkbox" || Ctrl.type == "file")), doValidControls = false;

				if (changed && vStruct && (gx.fn.lastMainLevelCtrlId(gx.O.focusControl, vStruct.grid) || vStruct.gxsgprm)) {
					fireOnblur = true;
					doValidControls = true;
				}

				if (fireOnblur && Ctrl.onblur)
					Ctrl.onblur();
				if (doValidControls && (typeof (Ctrl.GXFormatError) == 'undefined' || Ctrl.GXFormatError == false))//doValidControls solo si onblur valida ok
					gx.csv.validControls(gx.O.focusControl, gx.O.focusControl + 1, true, gx.O);

				return usrChg;
			},

			execOnchange: function (Ctrl, validated) {
				var jsCode = '';
				if (Ctrl.attributes["gxoch1"]) {
					try { jsCode += Ctrl.attributes["gxoch1"].value + ';'; }
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'execOnchange');
					}
				}
				if (gx.fn.isAccepted(Ctrl) && Ctrl.attributes["gxoch2"]) {
					try { jsCode += Ctrl.attributes["gxoch2"].value + ';'; }
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'execOnchange');
					}
				}
				try {
					if (jsCode != '')
						eval(jsCode);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'execOnchange');
				}
				if (!validated)
					Ctrl.setAttribute("gxvalid", "0");
				Ctrl.setAttribute("gxctrlchanged", '1');
				gx.fn.setControlValue("IsModified", "1");
				gx.fn.setControlValue("IsConfirmed", "0");
			},

			execUsrOnchange: function (Ctrl) {
				var jsCode = '';
				try { jsCode = Ctrl.attributes["gxoch0"].value; }
				catch (e) {
					return true;
				}
				var fnc = new Function(jsCode);
				var ret = fnc.call(Ctrl);
				return ret;
			},

			jsEvent: function (ctrl) {
				if (gx.evt.processing && !gx.csv.validating)
					return false;
				var evtCode = ctrl.getAttribute ? ctrl.getAttribute('jsevent') : ctrl.jsevent;
				if (!gx.lang.emptyObject(evtCode)) {
					return eval(evtCode);
				}
				return true;
			},

			isEnterEvtCtrl: function (ctrl) {
				if (gx.O.EnterCtrl) {
					var ctrlName = gx.dom.id(ctrl);
					if (!ctrlName && ctrl.tagName == 'A')
						ctrlName = ctrl.parentNode.id;
					if (ctrlName && ctrlName.indexOf('span_') == 0)
						ctrlName = ctrlName.substring(5);

					if (!ctrlName)
						return false;

					var enterCtrls = gx.O.EnterCtrl,
						gridId = gx.fn.rowGridId(ctrl);
					for (var i = 0, len = enterCtrls.length; i < len; i++) {
						var enterCt = gx.csv.ctxControlId(enterCtrls[i]);
						// If the control is inside a grid, consider the row number for matching
						// gx.fn.currentGridRow is not used because the current row is set when a control with onfocus event
						// is focused, and sometimes no control inside a grid has this event.
						if (gridId && ctrlName.search(new RegExp(".*" + enterCt + "_[0-9]{4}$")) != -1)
							return true;
						if (enterCt == ctrlName)
							return true;
					}
				}
				return false;
			},

			isCheckEvtCtrl: function (ctrl) {
				if (!gx.lang.emptyObject(gx.O.CheckCtrl)) {
					var ctrlName = gx.dom.id(ctrl);
					for (var c in gx.O.CheckCtrl) {
						if (gx.O.CheckCtrl[c] == ctrlName)
							return true;
						if ((gx.O.CmpContext + gx.O.CheckCtrl[c]) == ctrlName)
							return true;
					}
				}
				return false;
			},

			isTriggerKey: function (event) {
				var len = this.triggerKeys.length;
				for (var i = 0; i < len; i++) {
					if ((event.keyCode == this.triggerKeys[i]) || (event.charCode == this.triggerKeys[i]))
						return true;
				}
				return false;
			},

			isControlKey: function (key) {
				var len = this.controlKeys.length;
				for (var i = 0; i < len; i++) {
					if (key == this.controlKeys[i])
						return true;
				}
				return false;
			},

			invalidDSPKey: function (evt) {
				var fKey = evt.keyCode - 111;
				if (evt.shiftKey)
					fKey += 12;
				if (this.keyListeners[fKey] && this.keyListeners[fKey][gx.O.CmpContext] == 'ENTER')
					return true;
				if (evt.keyCode == 13)
					return true;
				return false;
			},

			addKeyListener: function (cmpCtx, key, evt) {
				if (key == 1)
					document.body.onhelp = gx.falseFn
				if (this.keyListeners[key] == undefined)
					this.keyListeners[key] = [];
				this.keyListeners[key][cmpCtx] = evt;
			},

			setEvtName: function (evt, ctrl) {
				gx.fn.setHidden("_EventName", evt);
			},

			cancelAndRefresh: function (evt) { //Will execute async refresh. 
				if (gx.O.conditionsChanged) {
					this.cancel(evt, true);
					gx.O.executeServerEvent('RFR', false);
					return true;
				}
				return false;
			},

			setGridEvt: function (gridId, rowId) {
				if (gx.evt.processing && !gx.csv.validating)
					return;
				if (!gx.lang.emptyObject(gridId)) {
					if (gx.lang.emptyObject(rowId)) {
						var gridObj = gx.fn.getGridObj(gridId);
						if (gridObj) {
							rowId = gx.fn.getHidden(gx.O.CmpContext + gridObj.gridName.toUpperCase() + "_ROW");
						}
					}
					gx.fn.setHidden("_EventGridId", gridId);
					gx.fn.setHidden("_EventRowId", rowId);
					if (rowId !== undefined) {
						gx.fn.setCurrentGridRow(gridId, rowId);
					}
				}
			},

			checkFuncKey: function (evt, el) {
				var fKey = this.lastKey - 111;
				if (evt.shiftKey) {
					fKey += 12;
				}
				if (fKey > 0 && fKey <= 24 && (this.keyListeners[fKey] != undefined)) {
					var gxEvent = this.keyListeners[fKey][gx.O.CmpContext];
					if (typeof (gxEvent) != 'undefined') {
						this.execFnKeyEvt(evt, gx.O, gxEvent, el);
					}
					else {
						for (var cmpCtx in this.keyListeners[fKey]) {
							gxEvent = this.keyListeners[fKey][cmpCtx];
							if (typeof (gxEvent) != 'undefined') {
								var gxObj = gx.getObj(cmpCtx, false);
								if (gxObj != null) {
									this.execFnKeyEvt(evt, gxObj, gxEvent, el);
									break;
								}
							}
						}
					}
				}
			},

			execFnKeyEvt: function (evt, gxObj, gxEvent, el) {
				if (gx.evt.processing)
					return;
				this.cancel(evt, true);
				if (typeof (gxObj[gxEvent]) == 'function') {
					var isServerEvent = gxObj.isServerEvent(gxEvent);
					gx.evt.setProcessing(true, !isServerEvent);
					gxObj[gxEvent].call(gxObj);
					if (typeof(gx) != 'undefined')							
						gx.evt.setProcessing(false, !isServerEvent);
				}
				else if (gxEvent == "PROMPT") {
					var vStruct = gxObj.getValidStructFld(el);
					if (vStruct && vStruct.attachedCtrls) {
						var attCtrls = vStruct.attachedCtrls;
						for (var i = 0, len = attCtrls.length; i < len; i++) {
							var ctrl = attCtrls[i];
							if (ctrl && ctrl.info && ctrl.info.isPrompt) {
								var ctrlId = attCtrls[i].id;
								if (typeof (gxObj.promptKeyHandlers[ctrlId]) == 'function') {
									var rowId = (vStruct.grid > 0) ? "_" + gx.fn.currentGridRowImpl(vStruct.grid) : "";
									var el = gx.dom.el(gxObj.CmpContext + ctrlId + rowId);
									gxObj.promptKeyHandlers[ctrlId].call(gxObj, el);
								}
							}
						}
					}
				}
				else if (gxObj.isTransaction() && gxEvent == 'SELECT') {
					var selectBtn = gx.dom.el(gxObj.CmpContext + "BTN_SELECT");
					if (selectBtn && typeof (selectBtn.onclick) == 'function') {
						selectBtn.onclick();
					}
				}
				else {
					gx.evt.execEvt(gxObj.CmpContext, gxObj.IsMasterPage, gxObj.CmpContext + 'E' + gxEvent + '.', gx.evt.dummyCtrl);
				}
			},

			keyModifiesValue: function (evt) {
				var keyCode = (window.event) ? evt.keyCode : evt.which;
				if ((keyCode>= 32 && keyCode <= 127) || keyCode == 229) {
					return true;
				}
				return false;
			},

			triggersEvt: function (ctrl) {
				if (!gx.lang.emptyObject(ctrl)) {
					if (ctrl == gx.evt.dummyCtrl)
						return true;
					if (ctrl.nodeName == 'A' || ctrl.nodeName == 'TEXTAREA')
						return true;
					else if (ctrl.nodeName == 'INPUT') {
						if (ctrl.type == 'button' || ctrl.type == 'image')
							return true;
					}
				}
				return false;
			},

			setProcessing: function (value, cond) {
				if ((typeof (cond) == 'undefined') || cond) {
					if (!gx.evt.redirecting) {
						gx.evt.processing = value;
						gx.evt.setReady(!gx.evt.processing);
					}
				}
			},
			
			endValidation: function () {
				gx.csv.validatingGrid = null;
				gx.csv.validating = false;
				gx.evt.setProcessing(false);
				gx.fx.obs.notify('gx.onvalidationend');
			},

			setReady: function (isReady) {
				gx.evt.userReadyCnt += isReady ? -1 : 1;
				gx.evt.userReadyCnt = (gx.evt.userReadyCnt < 0) ? 0 : gx.evt.userReadyCnt;
				gx.evt.userReady = (gx.evt.userReadyCnt == 0);
				if (isNaN(gx.evt.userReadyCnt))
					gx.evt.userReadyCnt = 0;
			},

			EVT_ROW_ID_REGEXP: /\.([0-9]{4})$/,

			execEvt: function ( cmpCtx, inMaster, evt, ctrl, gridId, sync, srvCommand, disableForm, callback, force) {
				gx.dbg.logPerf('execEvt');
				if (!force && (gx.lang.emptyObject(evt) || (gx.evt.processing && !gx.csv.validating) || !gx.ajax.isFormEnabled() || gx.csv.anyFormatError()))
					return;
				if (gx.evt.fixWebKitOnFocus() && gx.dom.isButtonLike(ctrl) && ctrl != gx.csv.lastControl && ctrl.onfocus != undefined)
					ctrl.onfocus();
				gx.fx.obs.notify('gx.validation');

				var gxObj;
				if (cmpCtx != undefined)	{
					gxObj = gx.getObj(cmpCtx, inMaster);
					if (gxObj)
						gx.setGxO(cmpCtx, inMaster);
				}
				var rowGridId = gridId;
				var rowId_res = this.EVT_ROW_ID_REGEXP.exec(evt);
				var rowId = (rowId_res && rowId_res.length == 2) ? rowId_res[1] : null;
				if (! rowId)
					rowId = gx.fn.currentGridRowImpl(rowGridId);
				if (srvCommand) {
					gx.evt.srvCommand = true;
					if (ctrl) {
						rowGridId = gx.fn.rowGridId(ctrl);
						rowId = gx.fn.controlRowId(ctrl);
						if (!gx.lang.emptyObject(rowGridId) && !gx.lang.emptyObject(rowId)) {
							gx.csv.lastGrid = rowGridId;
							gx.fn.setCurrentGridRow(rowGridId, rowId);
						}
					}
				}
				if (gx.csv.lastId > 0) {
					var vStruct = gx.O.getValidStruct(gx.csv.lastId);
					var CtrlId = (gx.evt.isEnterEvtCtrl(ctrl) && ctrl.id>0) ? gx.O.getValidStructId(ctrl.id) : gx.O.focusControl;
					var goForward = CtrlId < gx.csv.lastId; 
					if ((goForward && (gx.evt.isEnterEvtCtrl(ctrl) || (vStruct && vStruct.isuc)))  || gx.evt.enter)
					{
					    gx.O.fromValid = gx.csv.lastId;
					    gx.O.toValid = gx.csv.lastId + 1;
					    gx.csv.validateAll();
					}
				}
				this.setEvtName(evt, ctrl);
				this.lastEvent = evt;
				if (!srvCommand && (gx.grid.drawAtServer || (ctrl && ctrl.nodeName == 'INPUT' && ctrl.type == 'submit'))) {
					this.execEvtSubmit(evt, ctrl);
				}
				else {
					var oldDoPost = function() {
						gx.ajax.doPost(gx.ajax.encryptParms(gx.pO, 'gxajaxEvt'), sync, disableForm, callback);
					};
					if (gx.pO.supportAjaxEvents && !gx.dom.hasSelectedFile()) {
						gx.evt.dispatcher.dispatch(evt, gx.O, rowGridId, rowId, true).done(callback).fail(oldDoPost);
					}
					else
						oldDoPost();
				}
			},

			execEvtSubmit: function (evt, ctrl) {
				if (gx.evt.processing && !gx.csv.validating)
					return;
				gx.evt.setProcessing(true);
				gx.O.startFeedback();
				gx.fx.obs.notify('gx.onbeforeevent', [evt, ctrl]);
				gx.fn.objectOnpost();
				gx.http.saveState();
				gx.fn.forceEnableControls(false);
				var form = gx.dom.form();
				var currentPopup = gx.popup.getPopup();
				if (currentPopup != null) {
					var url = form.action;
					var currentLvl = currentPopup.window.gx.popup.lvl;
					if (currentLvl != -1) {
						var text = (url.indexOf('?') != -1) ? ',' : '?';
						text += encodeURIComponent('gxPopupLevel=' + currentLvl + ';');
						url += text;
						form.action = url;
					}
				}
				form.submit();
			},

			execCliEvt: function (cmpCtx, inMaster, evtName, evtGridName, gridRow, parms) {
				if ((gx.evt.processing && !gx.csv.validating) || !gx.ajax.isFormEnabled() || gx.csv.anyFormatError())
					return;
				gx.fx.obs.notify('gx.validation');				
				parms = (parms != undefined) ? parms : [];
				var gxObj = gx.getObj(cmpCtx, inMaster),
					gridId;
				if (gxObj != null) {
					gx.setGxO(cmpCtx, inMaster);
					if (typeof (evtGridName) == 'string' && evtGridName != '' && (arguments.length > 4)) {
						var grid = gxObj.getGrid(evtGridName)
						grid.instanciateRow(gridRow);
						gridId = grid.gridId;
					}
					var isServerEvent = gxObj.isServerEvent(evtName);
					gx.evt.setProcessing(true, !isServerEvent);
					gxObj.execC2VFunctions();
					var callback = function () {
							gx.popup.waitCallback(function () {
								gx.evt.setProcessing(false, (!gx.csv.validating && !isServerEvent));
							});
							if (gxObj.conditionsChanged) {
								gxObj.executeServerEvent('RFR', true);
							}
						},
						oldCall = function() {
							gxObj[evtName](parms);
							callback();
						};

					if (gx.pO.supportAjaxEvents) {
						gx.evt.dispatcher.dispatch(gxObj.getServerEventName(evtName), gxObj, gridId, gridRow, false, parms).done(callback).fail(oldCall);
					}
					else {
						oldCall();
					}
				}
			},

			fixWebKitOnFocus: function () {
				var browser = gx.util.browser;
				if (browser.isWebkit() && !browser.isChrome())
					return true;

				if (browser.isChrome() && browser.chromeVersion() < 30)
					return true;

				return false;
			},

			dispatcher: function () {
				var MAPPED_EVENTS = {
					"RFR": "REFRESH"
				};

				var EXECUTION_TIMEOUT = 50;

				return {
					dispatchedEvents: {},
					getContextKey: function (gxO, grid, row) {
						return (gxO.CmpContext || "PARENT_OBJECT") + (grid || "") + (row || "");
					},
					cleanEventName: function(dirtyEventName, gxO) {
						dirtyEventName = dirtyEventName.replace(new RegExp('^' + gxO.CmpContext), '');
						var exp = /^E('?(\w+)\.?([^\.]*)'?)/;
						var tmpName = exp.exec(dirtyEventName);
						var cleanName = (tmpName && tmpName.length && tmpName.length > 1) ? tmpName[1].replace(/\.\d*$/,'') : dirtyEventName;
						return MAPPED_EVENTS[cleanName] || cleanName;
					},
					getEventParmsMetadata: function (eventName, gxO, type) {
						return gxO.EvtParms[eventName][type == "input" ? 0 : 1];
					},
					eventDepends: function(dependantEvent, dependencieEvent, gxO) {
						var dependencies = this.getEventParmsMetadata(dependencieEvent, gxO, "output"),
							dependants = this.getEventParmsMetadata(dependantEvent, gxO, "input"),
							dependencieKey,
							dependantKey;
						for (var i=0, ilen=dependencies.length; i<ilen; i++) {
							dependencieKey = gx.ajax.resolveParmKey(dependencies[i]);
							for (var j=0, jlen=dependants.length; j<jlen; j++) {
								dependantKey = gx.ajax.resolveParmKey(dependants[j]);
								if (dependencieKey == dependantKey) {
									return true;
								}
							}
						}
						return false;
					},
					dispatch: function(dirtyEventName, gxO, grid, row, serverSide, evtArguments) {
						serverSide = (serverSide === undefined) || serverSide;
						var deferred = $.Deferred();
						var cleanEventName = this.cleanEventName(dirtyEventName, gxO);
						var clientSideEventName = gxO.getClientEventName(dirtyEventName);
						if (!gxO.EvtParms[cleanEventName]) {
							deferred.reject();
							return deferred.promise();
						}
						var contextKey = this.getContextKey(gxO, grid, row),
							dispatchedEvts = this.dispatchedEvents[contextKey],
							cleanEventName = cleanEventName,
							eventObj = {
								eventName: cleanEventName,
								dirtyEventName: dirtyEventName,
								clientSideEventName: clientSideEventName,
								serverSide: serverSide,
								deferred: deferred,
								arguments: evtArguments
							};

						if (dispatchedEvts) {
							dispatchedEvts.events.push(eventObj);
						}
						else {
							dispatchedEvts = {
								gxO: gxO,
								grid: grid,
								row: row,
								events: [eventObj]
							};
							this.dispatchedEvents[contextKey] = dispatchedEvts;
							setTimeout(this.dispatchTimeoutCallback.closure(this, [contextKey]), EXECUTION_TIMEOUT);
						}
						
						return deferred.promise();
					},
					dispatchTimeoutCallback: function(contextKey) {
						var dispatchedEvts = this.dispatchedEvents[contextKey],
							gxO = dispatchedEvts.gxO,
							grid = dispatchedEvts.grid,
							row = dispatchedEvts.row,
							clientSideIndependentEvents = [],
							restOfEvents = [],
							eventsToRun,
							eventObj,
							isIndependent,
							messages = [],
							message,
							previousIsServerSide,
							eventsDeferreds = {};

						delete this.dispatchedEvents[contextKey];

						// Order events according to dependencies. Independent client side events go first. The rest are executed
						// in the same order as they were dispatched.
						for (var i=0, len=dispatchedEvts.events.length; i<len; i++) {
							eventObj = dispatchedEvts.events[i];
							if (!eventObj.serverSide) {
								isIndependent = true;
								for (var j=0; j<i; j++) {
									if (this.eventDepends(eventObj.eventName, dispatchedEvts.events[j].eventName, gxO)) {
										isIndependent = false;
										break;
									}
								}
								if (isIndependent) {
									clientSideIndependentEvents.push(eventObj);
								}
								else {
									restOfEvents.push(eventObj);
								}
							}
							else {
								restOfEvents.push(eventObj);
							}
						}
						eventsToRun = clientSideIndependentEvents.concat(restOfEvents);

						// Create event blocks
						previousIsServerSide = false;
						for (var i=0, len=eventsToRun.length; i<len; i++) {
							eventsDeferreds[eventsToRun[i].eventName] = eventsToRun[i].deferred;
							if (previousIsServerSide && eventsToRun[i].serverSide) {
								message.addMethod(eventsToRun[i].eventName);
							}
							else {
								message = new gx.ajax.message(eventsToRun[i].eventName, gxO, grid, row, eventsToRun[i].serverSide);
								if (!eventsToRun[i].serverSide) {
									message.callback = gxO[eventsToRun[i].clientSideEventName].closure(gxO, eventsToRun[i].evtArguments || []);
								}
								messages.push(message);
							}
							previousIsServerSide = eventsToRun[i].serverSide;
						}

						var endMessage = function (message, success, isLastMsg) {
							for (var i=0, len=message.methods.length; i<len; i++) {
								var deferred = eventsDeferreds[message.methods[i]];
								if (deferred) {
									success ? deferred.resolve(isLastMsg) : deferred.reject(isLastMsg);
								}
							}
						};

						// Run each block after the previous has finished
						runCount = 0;
						var runner = function(){
							if (runCount < messages.length) {
								var message = messages[runCount++],
									isLastMsg = runCount == messages.length;
								message.call().done(function () {
									endMessage(message, true, isLastMsg);
									runner();
								}).fail(function () {
									endMessage(message, false, isLastMsg);
								});
							}
						};
						runner();
					}
				};
			}(),

			mouse: {
				x: -1,
				y: -1,

				update: function (evt) {
					try {
						if (gx.util.browser.isIE()) {
							this.x = event.clientX + gx.dom.documentScroll().scrollLeft;
							this.y = event.clientY + gx.dom.documentScroll().scrollTop;
						} else {
							this.x = evt.pageX;
							this.y = evt.pageY;
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'mouse update');
					}
				}
			},

			_init: function () {
				document.gxReadyState = 'loading';
				if (gx.util.browser.isIE() && (gx.util.browser.isCompatMode() || document.documentMode <= 8 || gx.util.browser.ieVersion() <= 8 && !gx.util.browser.isWinCE())) {
					this.attach(document, 'readystatechange', this.onready);
				}
				else if ((gx.util.browser.ieVersion() >= 9 && !gx.util.browser.isWinCE()) || gx.util.browser.isFirefox() || gx.util.browser.isWebkit() || gx.util.browser.isOperaMini()) {
					this.attach(document, 'DOMContentLoaded', this.onload);
				}
				else if (gx.util.browser.isBlackBerry())
					this.attach(window, 'load', this.onload);
				else
					this.onready(null);
				this.attach(document, "mousedown", this.onmousedown);
				this.attach(document, "mousemove", this.onmousemove);
				this.attach(document, "mouseup", this.onmouseup);
				this.attach(document, "click", this.onclick);
				this.attach(document, "dblclick", this.ondblclick);
				this.attach(window, "blur", this.onwindowblur);
				if (gx.dbg.performance && !gx.util.browser.isBlackBerry())
					this.attach(window, 'load', function () { gx.dbg.logPerf('onload', 'Page Loaded'); gx.dbg.printPerformanceLog(); });
			},

			_deinit: function () {
				this.lastControl = null;
				this.lastEvent = null;
				this.dummyCtrl = {};
				this.keyListeners = {};
				this.hooks = [];
			}
		},

		csv: {
			GX_OLD_VALUE_ATTRIBUTE: 'gxOldValue',
			pkDirty: false,
			validating: false,
			lastRow: [],
			rowChanged: false,
			currentId: 0,
			lastId: 0,
			lastControl: null,
			lastActiveControl: null,
			lastGrid: 0,
			cmpCtx: '',
			anyError: false,
			userFocus: null,
			focusControl: null,
			invalidControl: null,
			invalidForcedCtrl: null,
			validActivatedControl: null,
			disableFocus: false,
			validatingUC: null,
			validatingGrid: null,
			lastEvtResponse: null,
			lastEvtRow: null,
			invalidId: 0,
			stopOnError: false,
			dismissSeconds: 0,
			messagePosition: 'right',
			oneAtAtime: true,
			gxFormatErrors: [],
			
			validateAll: function (gxO) {
				var deferred = $.Deferred();
				gxO = gxO || gx.O;

				this.validControls(gxO.fromValid, gxO.toValid, false, gxO).done((function () {
					try {
						if ((this.invalidControl == null || !gx.csv.stopOnError) && !(this.rowChanged && !this.targetRowIsMod(this.toValid)))
							gxO.fromValid = gxO.toValid;
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'validateAll');
					}
					deferred.resolve();
				}).closure(this));

				return deferred.promise();
			},

			validControls: function (FromControl, TargetControl, bForceCheck, gxO) {
				var deferred = $.Deferred(),
					bRet = true,
					bFailedCtrl = -1,
					validationPromises = [],
					lvlFrom=0, lvlTarget=0, isValid, lvlCtrl=0, ret,
					validFullGrid = gx.csv.fullGridValidation && (TargetControl - FromControl) >=1 && gx.O.isTransaction();
				
				var setFocusResolver = function (bRet, bFailedCtrl) {
					if (gx.csv.stopOnError) {
						if (bFailedCtrl != -1) {
							var _GXValidStruct = gx.fn.validStruct(bFailedCtrl, gxO);
							var Control = gx.fn.getControlGridRef(_GXValidStruct.fld, _GXValidStruct.grid);
							gx.csv.disableFocus = true;
							if (gx.fn.isAccepted(Control, gxO))
								gx.fn.setFocus(Control);
							else
								gx.fn.setFocus(gx.evt.lastControl);
						}
						else if (!gx.dom.isButton(gx.csv.lastControl) && gx.csv.validActivatedControl != null) {
							gx.fn.setFocus(gx.csv.validActivatedControl);
						}
					}
				};

				try {
					gx.csv.validActivatedControl = null;
					gx.csv.invalidControl = null;
					gx.csv.invalidId = 0;
					if (TargetControl > FromControl) {
						if (validFullGrid)
						{
							validStruct = gx.fn.validStruct(FromControl);
							if (validStruct != undefined && validStruct.lvl != undefined)
								lvlFrom = validStruct.lvl;
								
							validStruct = gx.fn.validStruct(TargetControl);
							if (validStruct != undefined && validStruct.lvl != undefined)
								lvlTarget = validStruct.lvl;
						}

						for (var i = FromControl; i < TargetControl; i++) {
							validationPromises.push(this.validControl(i, bForceCheck, gxO));

							//Valid Full Grid							
							if (validFullGrid && i > FromControl && i < TargetControl)
							{
								validStruct = gx.fn.validStruct(i);
								if (validStruct != undefined && validStruct.lvl != undefined)
								{
									lvlCtrl = validStruct.lvl;
									if (lvlCtrl != lvlFrom && lvlCtrl != lvlTarget && validStruct && validStruct.grid)
									{
										var gridObj = gx.fn.getGridObj(validStruct.grid);
										var len = gridObj.grid.rows.length;
										var gridCurrentRow = gx.fn.currentGridRowImpl(validStruct.grid);
										//Si se esta validando el ultimo control de una row, y TargetControl esta fuera del grid, entonces se dispara la validacion de las demas rows
										var lastGridCtrl = gx.fn.lastGridControl(validStruct.grid);
										if (i==lastGridCtrl)
										{
											var firstGridCtrl = gx.fn.firstGridControl(validStruct.grid);

											for (var rowIdx = 0; rowIdx < len; rowIdx++) { 
												var rowObj = gridObj.grid.rows[rowIdx];
												var IsRemoved = rowObj.gxDeleted();
												var RecordExists = rowObj.gxExists();
												var RecordIsMod = rowObj.gxIsMod();
												if (!IsRemoved && (RecordExists || RecordIsMod) && rowObj.gxId != gridCurrentRow) {
													for (var colIdx = firstGridCtrl; colIdx <= lastGridCtrl; colIdx++) { 
														validationPromises.push(this.validControl(colIdx, bForceCheck, gxO, rowObj.gxId));
													}
												}
											}
										}
									}
								}
							}
						}
						if (validationPromises.length > 0) {
							$.when.apply($, validationPromises).done(function () {
								var bRet = true,
									bFailedCtrl = -1;
								for (var i=0, len=arguments.length; i < len; i++) {
									var isValid = arguments[i].ret;
									if (bRet && !isValid) {
										bFailedCtrl = arguments[i].ctrl;
										bRet = false;
										break;
									}
								}
								setFocusResolver(bRet, bFailedCtrl);
								deferred.resolve(bRet);
							});
							return deferred.promise();
						}
						else {
							setFocusResolver(bRet, bFailedCtrl);
							deferred.resolve(bRet);
						}
					}
					else {
						setFocusResolver(bRet, bFailedCtrl);
						deferred.resolve(bRet);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'validControls');
				}
				return deferred.promise();
			},

			validControl: function (Id, bForceCheck, gxO, gridRow) {
				var deferred = $.Deferred(),
					gxO = gxO || gx.O,
					bRet = true,
					bFailedCtrl = -1,
					validStruct = gx.fn.validStruct(Id, gxO);

				if (validStruct != undefined) {
					if (validStruct.grid != 0) {
						var GXValidRow = gridRow ? gridRow : gx.fn.currentGridRow(validStruct.grid);
						if (GXValidRow != undefined)
							gx.fn.setCurrentGridRow(validStruct.grid, GXValidRow);
					}
					if (validStruct.isuc == true)
						validStruct.uc.execC2VFunctions();
					else {
						if (typeof (validStruct.c2v) == 'function')
							validStruct.c2v();
					}
					if (typeof (validStruct.v2bc) == 'function')
						validStruct.v2bc.call(gxO);
					try {
						if (validStruct.lvl == 0 || ((validStruct.grid != 0) && gx.fn.gridRowIsMod(validStruct.lvl, gx.fn.currentGridRow(validStruct.grid))) || !gxO.isTransaction()) {
							var Control = null;
							if (validStruct.isuc == true)
								Control = validStruct.uc.getRealControl();
							else
								Control = gx.fn.getControlGridRef(validStruct.fld, validStruct.grid);
							if (Control) {
								this.validate(Control, Id, bForceCheck, gxO).done(function (bValid) {
									try {
										var rowIsRemoved = false,
											bRet = true,
											bFailedCtrl = -1;
										if (validStruct.grid != 0)
											rowIsRemoved = gx.fn.rowIsRemoved(validStruct.grid, gx.fn.currentGridRow(validStruct.grid));
										if (!bValid && !rowIsRemoved) {
											gx.csv.invalidControl = Control;
											gx.csv.invalidId = Id;
											bRet = false;
											bFailedCtrl = Id;
										}

										gx.csv.lastId = Id;
										if (gx.fn.isAccepted(Control) == false) {
											gx.evt.executeOnblur(Id);

											if (Control.getAttribute("gxhiddenonchange") != Control.value) {
												Control.setAttribute("gxhiddenonchange", Control.value);
												gx.evt.execOnchange(Control);
											}
										}
									}
									catch (e) {
										gx.dbg.logEx(e, 'gxapi.js', 'validControl - callback');
									}

									deferred.resolve({ ret: bRet, ctrl: bFailedCtrl});
									return deferred.promise();
								});
								return deferred.promise();
							}
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'validControl');
					}
				}
				deferred.resolve({ ret: bRet, ctrl: bFailedCtrl});
				return deferred.promise();
			},

			validate: function (Ctrl, i, bForceCheck, gxO) {
				var deferred = $.Deferred(),
					gxO = gxO || gx.O;
				gx.csv.anyError = false;
				var validStruct = gx.fn.validStruct(i, gxO);
				if (validStruct == undefined) {
					deferred.resolve(true);
					return deferred.promise();
				}
				gx.csv.refreshVars(validStruct, gxO);
				if ((validStruct.fnc == null) && (validStruct.isvalid == null)) {
					//numeric grid filters refresh on lostfocus
					if (Ctrl.tagName != "SELECT" && Ctrl.type != "checkbox" && gx.lang.isNumericType(validStruct.type) && !gx.lang.emptyObject(validStruct.rgrid)) {
						var len = validStruct.rgrid.length;
						for (var i = 0; i < len; i++) {
							validStruct.rgrid[i].filterVarChanged();
						}
					}
					deferred.resolve(true);
					return deferred.promise();
				}

				try {
					var jsCode = '';
					if (i != -1 && (bForceCheck || (Ctrl.getAttribute("gxvalid") != "1"))) {
						gx.evt.setProcessing(true);
						gx.csv.currentId = i;
						gx.csv.validatingGrid = validStruct.gxgrid;
						gx.csv.validating = true;
						gx.csv.refreshVars(validStruct);
						var validRet = false;
						if (validStruct.isuc == true)
							validRet = validStruct.fnc.call(validStruct.uc);
						else if (validStruct.fnc != null)
							validRet = validStruct.fnc.call(gxO); 	//call FieldValidation
						else
							validRet = true;
						if (gxO.AnyError == 1) {
							if (gx.lang.emptyObject(gx.csv.invalidControl))
								gx.csv.invalidControl = Ctrl;
							gx.csv.anyError = true;
							gxO.AnyError = 0;
						}
						if (gx.csv.anyError == true)
							validRet = !gx.csv.anyError;
						if (validRet == false) {
							gx.evt.endValidation();
							deferred.resolve(false);
							return deferred.promise();
						}
						gx.csv.refreshControls(validStruct, gxO);
						gx.csv.invalidateDeps(i, gxO);
						if (!gx.lang.emptyObject(validStruct.rgrid) && !gx.lang.emptyObject(validStruct.hc)) {
							var len = validStruct.rgrid.length;
							for (var i = 0; i < len; i++) {
								validStruct.rgrid[i].filterVarChanged();
							}
						}
						if (!gx.csv.validateLostFocusOnly || gxO.fromValid === i) {
						    var ctrlIsAccepted = gx.fn.isAccepted(Ctrl, gxO);
							var callback = function () {
								deferred.resolve(true);
								try {
									if (ctrlIsAccepted) {
										Ctrl.setAttribute("gxvalid", "1");
									}
									else {
										Ctrl.setAttribute("gxvalid", "0");
									}
									gx.evt.endValidation();
								}
								catch (e) {
									gx.dbg.logEx(e, 'gxapi.js', 'validate');
								}
							};

							if (validStruct.isvalid != null && ctrlIsAccepted) {
								if (gx.pO.supportAjaxEvents) {
									var evtName = validStruct.isvalid,
										gridId = validStruct.gxgrid ? validStruct.gxgrid.gridId : false,
										row = gridId ? gx.fn.currentGridRowImpl(gridId) : '',
										serverEvent = gxO.isServerEvent(evtName);

									if (evtName) {
										gx.evt.dispatcher.dispatch(gxO.getServerEventName(evtName), gxO, gridId, row, serverEvent).done(callback).fail(callback);
									}
									else {
										gxO[validStruct.isvalid]();
										callback();
									}
									return deferred.promise();
								}
								else {
									gxO[validStruct.isvalid]();
									callback();
								}
							}
							else
								callback();
						}
						else {
							gx.evt.endValidation();
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'validate');
				}
				deferred.resolve(true);
				return deferred.promise();
			},

			invalidateForm: function () {
				if (gx.O.AnyError == 1) {
					return;
				}
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (var i = 0; i < len; i++) {
					var validStruct = gx.fn.validStruct(ctrlIds[i]);
					var ctrl = gx.fn.getControlGridRef(validStruct.fld, validStruct.grid);
					this.invalidateGXCtrl(ctrl);
				}
			},

			invalidateGXCtrl: function (Ctrl) {
				if (Ctrl) {
					var gxOldValue = Ctrl.getAttribute(gx.csv.GX_OLD_VALUE_ATTRIBUTE);
					if ((Ctrl.getAttribute("gxvalid") == 1) && (gxOldValue != Ctrl.value)) {
						Ctrl.setAttribute("gxvalid", "0");
					}
				}
			},


			invalidateCtrl: function (Ctrl, keyEvt) {
				try {
					this.invalidateGXCtrl(Ctrl);
					var validStruct = gx.fn.validStruct(gx.O.focusControl);
					if (validStruct && validStruct.grid != 0 && gx.evt.keyModifiesValue(keyEvt)) {						
						var ctrlRow = gx.fn.controlRowId(Ctrl) || gx.fn.currentGridRowImpl(validStruct.grid) || '0001';
						validStruct.gxgrid.setRowModified(ctrlRow);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'invalidateCtrl');
				}
			},

			invalidateDeps: function (id, gxO) {
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (var i = 0; i < len; i++) {
					var cId = ctrlIds[i];
					if (cId > id) {
						var validStruct = gx.fn.validStruct(cId, gxO);
						var len1 = validStruct.ip ? validStruct.ip.length : 0;
						for (var j = 0; j < len1; j++) {
							if (validStruct.ip[j] == id) {
								if (validStruct.grid == 0) {
									var ctrl = gx.fn.getControlGridRef(validStruct.fld, validStruct.grid);
									if (ctrl) {
										ctrl.setAttribute('gxvalid', '0');
									}
								}
								else {
									var gridObj = gx.fn.getGridObj(validStruct.grid);
									if (gridObj) {
										var len2 = gridObj.grid.rows.length;
										for (var k = 0; k < len2; k++) {
											var row = gridObj.grid.rows[k];
											var rowRemoved = row.gxDeleted();
											var rowExists = row.gxExists();
											if (!rowRemoved && rowExists) {
												gridObj.setRowModified(row.gxId);
												var ctrl = gx.fn.getControlRef(validStruct.fld + '_' + row.gxId);
												if (ctrl) {
													ctrl.setAttribute('gxvalid', '0');
												}
											}
										}
									}
								}
							}
						}
					}
				}
			},

			setFormatError: function(Ctrl, error) {
				if (Ctrl.id) {
					if (error || typeof(error) == 'undefined') {
						this.gxFormatErrors[Ctrl.id] = true;		
						Ctrl.GXFormatError = true;
					}
					else {
						delete this.gxFormatErrors[Ctrl.id];
						Ctrl.GXFormatError = false;
					}
				}
			},
			
			
			anyFormatError: function() {
				return gx.lang.emptyObj(this.gxFormatErrors) === false;
			},
			
			disableFocusCondition: function () {
				if (typeof (gx.fn.validStruct(gx.O.focusControl)) == "undefined")
					return false;
				try {
					var sMode = gx.getVar("Gx_mode");
					if (gx.csv.lastGrid > 0)
						gx.setVar("Gx_mode", gx.fn.getGridRowMode(gx.fn.gridLvl(gx.csv.lastGrid), gx.csv.lastGrid));
					var vStruct = gx.fn.validStruct(gx.O.focusControl);
					if (vStruct && vStruct.nac && vStruct.nac.call(gx.O) == true) {
						cn = gx.fn.getControlIndex(gx.csv.lastControl) + 1;
						var NextFocus = gx.fn.searchFocusFwd(cn);
						if (NextFocus != null)
							gx.fn.setFocus(NextFocus);
						gx.setVar("Gx_mode", sMode);
						return true;
					}
					gx.setVar("Gx_mode", sMode);
				}
				catch (e) { }
				return false;
			},

			loadScreen: function () {
				try {
					if (gx.csv.pkDirty) {
						gx.csv.pkDirty = false;
						gx.fn.clearOldKeys();
						gx.evt.execEvt(gx.csv.cmpCtx, false, gx.csv.cmpCtx + 'ELSCR.', gx.evt.dummyCtrl, null, true);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'loadScreen');
				}
			},

			CTRL_ROW_INDEX_REGEXP: /(.*)_([0-9]{4})+$/,

			ctxControlId: function (ControlId, gxO) {
				if (gx.O && gx.O.IsMasterPage && ControlId.indexOf('MP') != 0) {
					//MasterPage grid controls 
					var rowId_res = this.CTRL_ROW_INDEX_REGEXP.exec(ControlId);
					if (rowId_res && rowId_res.length > 1) {
						var fldId = rowId_res[1], row_id = (rowId_res.length > 2) ? '_' + rowId_res[2] : '';
						return fldId + '_MPAGE' + row_id ;
					}
				}
				gxO = gxO || this;
				if (ControlId.indexOf(gxO.cmpCtx) == 0)
					return ControlId;
				return gxO.cmpCtx + ControlId;
			},

			isProperty: function (Target) {
				if (Target instanceof Array && Target.length == 2)
					return true;
				if (typeof (Target) == 'object') {
					if (typeof (Target[0]) != 'undefined' && typeof (Target[1]) != 'undefined')
						return true;
				}
				return false;
			},

			checkRowChange: function (Ctrl, gridChange, gxO, lastRow) {
				var deferred = $.Deferred();
				try {
					var vStruct = gx.fn.validStruct(Ctrl, gxO);
					if (typeof (vStruct) != 'undefined') {
						var GridId = vStruct.grid;
						if (GridId != 0) {
							var GXValidRow = gx.fn.currentGridRowImpl(GridId);
							if (GXValidRow && (GXValidRow != lastRow || gridChange) && GXValidRow.length > 1 && lastRow && lastRow.length > 1) {
								gx.csv.rowChanged = true;
								var bkpBScreen = gxO.Gx_BScreen;
								gxO.Gx_BScreen = 1;
								gx.csv.validGridRowChange(GridId, GXValidRow, gxO, lastRow).done(function (isValid) {
									if (isValid) {
										var gridObj = gxO.getGridById(GridId, lastRow);
										if (gridObj)
											gridObj.instanciateRow(GXValidRow); //setCurrentGridRow and instanciate variables
									}
									gxO.Gx_BScreen = bkpBScreen;
									deferred.resolve(true);
								});
							}
							else {
								deferred.resolve(false);
							}
							if (GXValidRow != undefined)
								gx.fn.setCurrentGridRow(GridId, GXValidRow);
						}
						else {
							deferred.resolve(false);
						}
					}
					else {
						deferred.resolve(false);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'checkRowChange');
				}
				return deferred.promise();
			},

			validGridRow: function (GridId, GXValidRow) {
				if (GXValidRow != undefined)
					gx.fn.setCurrentGridRow(GridId, GXValidRow);
				var firstGridCtrl = gx.fn.firstGridControl(GridId);
				var lastGridCtrl = gx.fn.lastGridControl(GridId);
				gx.csv.validControls(firstGridCtrl, lastGridCtrl + 1, true, gx.O);
			},

			validGridRowChange: function (GridId, GXValidRow, gxO, lastRow) {
				var deferred = $.Deferred();
				if (lastRow != undefined)
					gx.fn.setCurrentGridRow(GridId, lastRow);
				var firstGridCtrl = gx.fn.firstGridControl(GridId, gxO),
					lastGridCtrl = gx.fn.lastGridControl(GridId, gxO);
				gx.csv.validControls(firstGridCtrl, lastGridCtrl + 1, true, gxO).done(function (bRet) {
					if (bRet || !gx.csv.stopOnError)
						gx.csv.changeGridRow(GridId, firstGridCtrl, GXValidRow);
					deferred.resolve(bRet);
				});
				return deferred.promise();
			},

			changeGridRow: function (GridId, firstGridCtrl, GXValidRow) {
				gx.csv.lastId = firstGridCtrl;
				if (gx.O.fromValid > firstGridCtrl)
					gx.O.fromValid = firstGridCtrl;
				gx.csv.lastRow[GridId] = GXValidRow;
				Gx_BScreen = 1;
			},

			targetRowIsMod: function (vStructId) {
				var vStruct = gx.fn.validStruct(vStructId);
				if (vStruct) {
					return gx.fn.gridRowIsMod(vStruct.lvl, gx.fn.currentGridRow(vStruct.grid));
				}
				return false;
			},

			refreshVars: function (validStruct, gxO) {
				var len = validStruct.ip ? validStruct.ip.length : 0;
				for (var i = 0; i < len; i++) {
					try {
						if (typeof (gx.fn.validStruct(validStruct.ip[i], gxO).c2v) == 'function')
							gx.fn.validStruct(validStruct.ip[i], gxO).c2v();
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'refreshVars');
					}
				}
			},

			refreshControls: function (validStruct, gxO) {
				var len = validStruct.op ? validStruct.op.length : 0;
				for (var i = 0; i < len; i++) {
					try {
						var VStr = gx.fn.validStruct(validStruct.op[i], gxO);
						VStr.v2c();
						var Ctrl = null;
						if (VStr.grid == 0)
							Ctrl = gx.dom.el(gx.csv.ctxControlId(VStr.fld));
						else
							Ctrl = gx.fn.getControlGridRef(VStr.fld, VStr.grid);
						if (Ctrl)
							Ctrl.setAttribute("gxvalid", "0");
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'refreshControls');
					}
				}
				len = validStruct.ucs ? validStruct.ucs.length : 0;
				for (var i = 0; i < len; i++) {
					try {
						gx.fn.validStruct(validStruct.ucs[i], gxO).uc.execV2CFunctions(true);
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'refreshControls');
					}
				}
			},

			setValidValues: function (InputArr, OutputArr, ValuesArr) {
				var msgArray = gx.json.evalJSON(ValuesArr[ValuesArr.length - 1]);
				var msgs = {};
				var msgItem = {
					fields: InputArr,
					msgs: msgArray
				};
				if (gx.O.cmpCtx)
					msgs[gx.O.cmpCtx] = msgItem
				else
					msgs["MAIN"] = msgItem;
				gx.fn.setErrorViewer(msgs);
				if (!gx.O.AnyError) {
					var anyGrid = false;
					var len = OutputArr.length;
					for (var i = 0; i < len; i++) {
						var Target = OutputArr[i];
						var Value = ValuesArr[i];

						if (this.isProperty(Target))//Property
						{
							var validStruct = gx.fn.vStructForVar(Target[0]) || gx.O.getValidStructFld(Target[0]);
							if (validStruct != null) {
								gx.fn.setCtrlProperty(validStruct.fld, Target[1], Value);
							}
						}
						else {
							//Hide Code
							var validStruct = gx.fn.validStruct(this.currentId);
							if (!gx.lang.emptyObject(validStruct) && !gx.lang.emptyObject(validStruct.hc)) {
								if (validStruct.hc == Target) {
									gx.O[validStruct.hc] = Value;
									gx.fn.setHidden(this.cmpCtx + "GXH_" + validStruct.fld, Value);
								}
								else if (validStruct.hd == Target) {
									gx.O[validStruct.hd] = Value;
								}
							}
							//Attribute or Grid
							validStruct = gx.fn.vStructForVarWId(Target, this.currentId);
							if (!gx.lang.emptyObject(validStruct)) {
								var Ctrl = gx.fn.screen_CtrlRef(validStruct.fld);
								if (!gx.lang.emptyObject(Ctrl)) {
									if (Value instanceof Object) {
										if (Ctrl.tagName == "SELECT") {
											if (Ctrl.selectedIndex != -1 && gx.fn.invalidEmptyValue(Value))
												Value.s = Ctrl.options[Ctrl.selectedIndex].value;
											var comboId = gx.dom.id(Ctrl);
											gx.fn.loadComboBox(comboId, Value.v);
											gx.fn.setComboBoxValue(comboId, Value.s);
										}
										else if (!gx.lang.emptyObject(Value.s)) {
											Value.s = gx.fn.trimSelectValue(Value.s, validStruct.type);
										}
										var valueDesc = gx.fn.selectedDescription(Value, validStruct.type);
										if (gx.lang.emptyObject(Value.s) && !gx.lang.emptyObject(Ctrl.value))
											Value = Ctrl.value;
										else if (Ctrl.tagName == "SPAN" && !gx.lang.emptyObject(Value.s) && !gx.lang.emptyObject(valueDesc))
											Value = valueDesc;
										else
											Value = Value.s;
										gx.fn.setControlValue_span_safe(this.cmpCtx + validStruct.fld, Value, 0);
									}
								}

								if (validStruct.v2v) {
									validStruct.v2v(Value);
									validStruct.v2c();
								}
							}
							else {
								//HC en grid
								validStruct = gx.fn.vStructForHC(Target);
								if (validStruct != null) {
									var gRow = '';
									if (validStruct.grid != 0)
										gRow = '_' + gx.fn.currentGridRow(validStruct.grid);
									gx.fn.setHidden(this.cmpCtx + "GXHC" + validStruct.fld + gRow, Value);
								}

								var Grid = gx.fn.gridObjFromGxO(Target);
								if (Grid != undefined) {
									anyGrid = true;
									Grid.loadGrid(Value);
								}
								else {
									if (!gx.fn.saveLvlOldParm(Target, Value)) {
										continue;
									}
									gx.setVar(Target, Value);
									gx.fn.setGridHidden(Target, Value);
								}
							}
						}
					}
				}
				gx.O.refreshOlds();
				gx.fn.enableDisableDelete();
				if (anyGrid) {
					gx.dom.indexElements();
				}
			},

			_deinit: function () {
				this.lastRow = [];
				this.lastControl = null;
				this.lastActiveControl = null;
				this.userFocus = null;
				this.focusControl = null;
				this.invalidControl = null;
				this.invalidForcedCtrl = null;
				this.validActivatedControl = null;
				this.validatingUC = null;
				this.validatingGrid = null;
				this.lastEvtResponse = null;
				this.lastEvtRow = null;
			}
		},

		json: {
			_nonSerializables: [],

			setNonSerializable: function (ctrlName) {
				if (!this.isNonSerializable(ctrlName))
					this._nonSerializables.push(ctrlName);
			},

			isNonSerializable: function (ctrlName) {
				var len = this._nonSerializables.length;
				for (var i = 0; i < len; i++) {
					if (this._nonSerializables[i] == ctrlName)
						return true;
				}
				return false;
			},

			evalJSON: function (value) {
				try {
					return eval('(' + value + ')');
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxapi.js', 'evalJSON');
				}
				return value;
			},

			serializeJson: function (obj, allFields) {
				var objJson = this.objToJson(obj);
				if (objJson === null)
					objJson = this.arrayToJson(obj);
				else
					return objJson;
				if (objJson === null) {
					if (typeof (obj) == 'function')
						return null;
					var tmp = [];
					for (var prop in obj) {
						if (!allFields && this.isNonSerializable(prop))
							continue;
						var key = this.objToJson(prop, true);
						if (key === null)
							continue;
						var value = this.serializeJson(obj[prop]);
						if (typeof (value) != 'string')
							continue;
						tmp.push(key + ':' + value);
					}
					return '{' + tmp.join(',') + '}';
				}
				else
					return objJson;
			},

			objToJson: function (obj, isKey) {
				var type = typeof (obj);
				if (isKey) {
					if (!gx.lang.emptyObject(obj)) {
						if (type == 'string')
							return gx.text.escapeString(obj);
						else if (type == 'number')
							return '"' + obj + '"';
					}
				}
				else {
					if (type == 'undefined')
						return type;
					else if (type == 'string')
						return gx.text.escapeString(obj);
					else if ((type == 'number') || (type == 'boolean'))
						return obj.toString();
					else if (obj === null)
						return 'null';
					else if (typeof (obj.json) == 'function') {
						var tmp = obj.json();
						if (obj !== tmp)
							return this.serializeJson(tmp);
					}
				}
				return null;
			},

			arrayToJson: function (arr) {
				if (typeof (arr) != 'function' && typeof (arr.length) == 'number') {
					var res = [];
					var len = arr.length;
					for (var i = 0; i < len; i++) {
						var val = this.serializeJson(arr[i]);
						if (typeof (val) != 'string')
							val = 'undefined';
						res.push(val);
					}
					return '[' + res.join(',') + ']';
				}
				return null;
			},

			objFromJson: function (obj, value) {
				var jObj = this.evalJSON(value);
				if (obj instanceof Array && jObj instanceof Array) {
					while (obj.length > jObj.length) obj.shift();
				}
				else {
					for (var prop in obj) {
						if (typeof (obj[prop]) != 'function') {
							delete obj[prop];
						}
					}
				}
				for (var prop in jObj) {
					obj[prop] = jObj[prop];
				}
			}
		},

		dbg: {
			lastTime: 0,
			enabled: false,
			performance: false,
			dbgWin: null,
			outputFunc: null,
			hshTimes: null,
			performanceLog: [],
			_init: function () {
				this.hshTimes = [];
				this.hshTimes['onload'] = new Date().getTime();
			},

			logDebug: function (msg) {
				if (this.enabled) {
					this.write(msg);
				}
			},
			
			logMsg: function (msg) {
				if (this.enabled || window['console']) {
					this.write(msg);
				}
			},

			logEx: function (ex, file, func) {
				if (this.enabled || window['console']) {
					var msg = '';
					if (ex && ex instanceof Error) {
						msg = '[' + ex.name + ': ' + this.exTxt(ex);
						msg += (file ? ', file: ' + file : '');
						msg += (func ? ', func: ' + func : '') + ']';
						if (ex.fileName)
							msg += ' FileName:' + ex.fileName;
						if (ex.lineNumber)
							msg += ' ln:' + ex.lineNumber;
					}
					else {
						try {
							msg = String(ex);
						}
						catch (e) {
							msg = '[Unknown Error]';
						}
					}
					this.write(msg, true);
				}
			},

			exTxt: function (ex) {
				if (!ex)
					return 'Unknown Error';
				if (ex.message)
					return ex.message;
				else if (ex.description)
					return ex.description;
				else
					return ex.toString();
			},

			write: function (txt, isError) {
				if (this.enabled) {
					try {
						if (this.dbgWin == null)
							this.dbgWin = window.open("", "debug", "scrollbars=1,height=900,width=900");
						gx.dom.write(txt + '<BR>', this.dbgWin.document);
					}
					catch (e) { }
				}
				if (window['console']) {
					if (isError)
						console.error(txt);
					else
						console.log(txt);
				}
			},

			writeT: function (txt) {
				var now = new Date();
				var nt = now.getTime();
				var st = this.lastTime;
				if (this.lastTime > 0) {
					st = (nt - this.lastTime) / 1000;
				}
				this.lastTime = nt;
				txt = now.toString() + ' (+' + st + 'seg): ' + txt;
				this.write(txt);
			},

			logPerf: function (id, txt) {
				if (this.performance) {
					if (this.hshTimes[id] === undefined) {
						this.hshTimes[id] = new Date().getTime();
					}
					else {
						var st = (new Date().getTime() - this.hshTimes[id]) / 1000;
						delete this.hshTimes[id];
						if (st > 0) {
							var label = (txt == undefined) ? id : txt;
							var txt = label + ':(' + st + 'seg)';
							this.performanceLog.push(txt);
						}
					}
				}
			},
			printPerformanceLog: function () {
				if (this.performance) {
					for (msg in this.performanceLog) {
						if (typeof (this.performanceLog[msg]) == 'string') {
							if (this.outputFunc)
								this.outputFunc(this.performanceLog[msg]);
							this.write(this.performanceLog[msg]);
						}
					}
					this.performanceLog = [];
				}
			}
		},

		http: (function () {
			var GX_STATE_ELEMENT_ID = "GXState";

			return {
				STATE_UNSENT: 0,
				STATE_DONE: 4,
				STATUS_OK: 200,
				STATUS_UNAUTHORIZED: 401,
				STATUS_FORBIDDEN: 403,
				STATUS_SESSION_TO: 440,
				iframeName: 'gxPostIFrame',
				viewState: null,
				viewStateLoaded: false,
				oldState: null,
				useBase64State: false,
				useStateSignature: false,
				lastStatus: 0,
				lastResponse: '',

				modes: {
					none: 0,
					full: 1,
					call: 2,
					retval: 3
				},

				clearState: function () {
					this.viewState = null;
					this.viewStateLoaded = false;
					$(gx.dom.el(GX_STATE_ELEMENT_ID)).val('{}');
				},

				loadState: function () {
					gx.dbg.logPerf('loadState');
					this.viewState = {};
					this.viewStateLoaded = false;
					var gxState = gx.dom.el(GX_STATE_ELEMENT_ID);
					if (gxState) {
						var hiddenValues = gxState.value;
						var decoded = hiddenValues;
						if (this.useBase64State) {
							decoded = gx.base64.decode(hiddenValues);
						}
						this.viewState = gx.json.evalJSON(decoded);
						this.viewStateLoaded = true;
					}
					gx.dbg.logPerf('loadState', 'GXState Loaded');
				},

				saveState: function (allFields) {
					if (!this.viewState) {
						return;
					}
					var hiddenValues = gx.json.serializeJson(this.viewState, allFields);
					var hiddenValue = hiddenValues;
					if (this.useBase64State) {
						hiddenValue = gx.base64.encode(hiddenValues);
					}
					var Control = gx.dom.el(GX_STATE_ELEMENT_ID);
					if (Control == null) {
						gx.dom.createInput(GX_STATE_ELEMENT_ID, "hidden");
					}
					else {
						this.oldState = Control.value;
					}
					gx.fn.setControlValue_impl(GX_STATE_ELEMENT_ID, hiddenValue);
					if (this.useStateSignature) {
						gx.http.setStateHsh(hiddenValue);
						gx.http.setHsh();
					}
				},
				setStateHsh: function (state) {
					var hshId = "GXHSH12";
					var Control = gx.dom.el(hshId);
					if (Control == null) {
						gx.dom.createInput(hshId, "hidden");
					}
					var res = gx.MD5.getHsh(state);
					gx.fn.setControlValue_impl(hshId, res);
				},
				setHsh: function () {
					var len = gx.pO.WebComponents.length;
					var objFound = false;
					for (var i = 0; i < len; i++) {
						gx.http.setObjectHsh(gx.pO.WebComponents[i]);
					}
					gx.http.setObjectHsh(gx.pO);
				},
				setObjectHsh: function (obj) {
					var ctrlIds = obj.getControlIdsh();
					if (ctrlIds == null) {
						return;
					}
					var pfx = '';
					if (obj.IsComponent && obj.CmpContext != null) {
						pfx = obj.CmpContext;
					}
					var tgt = "";
					for (var i = 0; i < ctrlIds.length; i++) {
						validStruct = obj.getValidStruct(ctrlIds[i]);
						if (validStruct && typeof (validStruct.val) == 'function') {
							var fldVal = gx.fn.getControlValue_impl(pfx + validStruct.fld);
							if (validStruct.ctrltype == 'checkbox' && gx.text.trim(fldVal) == '') {
								tgt = tgt + validStruct.val();
							}
							else {
								tgt = tgt + fldVal;
							}
						}
					}
					gx.http.createHsh(pfx + 'GXHSH11', tgt);
				},
				createHsh: function (hshId, toHshStr) {
					var Control = gx.dom.el(hshId);
					if (Control == null) {
						gx.dom.createInput(hshId, "hidden");
					}
					var res = gx.MD5.getHsh(toHshStr);
					gx.fn.setControlValue_impl(hshId, res);
				},
				refreshState: function () {
					if (this.oldState != null) {
						var stateCtrl = gx.dom.el('GXState');
						stateCtrl.value = this.oldState;
						this.oldState = null;
					}
				},

				notification: (function () {
					var DISABLED_FORM_CLASS = 'gx-form-disabled',
						SHOW_DELAY = 200;

					var node = null,
						moveInterval = null,
						closeLink = null;

					return {
						getDelay: function () {
							return SHOW_DELAY;
						},

						isVisible: function () {
							var node = gx.http.notification.node();
							return (node != null && node.style.display != 'none')
						},

						node: function () {
							if (!node) {
								node = gx.dom.byId("gx_ajax_notification");
								if (!node) {
									var indicator = gx.ajax.getImageUrl(gx, 'indicatorImage', true);
									var nodeHtml = '<div id="gx_ajax_notification" style="display:none;position:absolute;text-align:center;vertical-align:top;top:0px;left:0px;">';
									nodeHtml += '<div style="background-color:#BEBEBE;filter:alpha(opacity=50);opacity:0.5;position:absolute;top:0px;left:0px;width:100%;height:100%;">';
									if (gx.grid.drawAtServer) {
										nodeHtml += '<div onclick="gx.ajax.enableForm()" style="display:none;cursor:hand;font-size:9;position:absolute;top:0px;left:0px;"><u>Enable Form</u></div>';
									}
									nodeHtml += '</div>';
									nodeHtml += '<img id="gx_ajax_indicator" src="' + indicator + '" width="16px" height="16px" align="absmiddle"/></div>';
									node = gx.html.nodesFromText(nodeHtml)[0];
									document.body.appendChild(node);
									gx.popup.setZIndex(node);
									if (gx.grid.drawAtServer) {
										closeLink = node.firstChild.firstChild;
									}
								}
							}
							return node;
						},

						show: function () {
							gx.dom.addClass(document.body, DISABLED_FORM_CLASS);
							var node = gx.http.notification.node();
							node.style.width = gx.html.viewportWidth() + 'px';
							node.style.height = gx.html.viewportHeight() + 'px';
							node.style.display = 'block';
							moveInterval = setInterval(gx.http.notification.move, 50);
							gx.evt.attach(window, 'resize', gx.http.notification.resize);
							if (gx.grid.drawAtServer) {
								setTimeout(gx.http.notification.showCloseLink, 5000);
							}
						},

						hide: function () {
							gx.http.notification.node().style.display = 'none';
							clearInterval(moveInterval);
							moveInterval = null;
							gx.evt.detach(window, 'resize', gx.http.notification.resize);
							if (gx.grid.drawAtServer) {
								gx.http.notification.hideCloseLink();
							}
							gx.dom.removeClass(document.body, DISABLED_FORM_CLASS);
						},

						move: function () {
							var node = gx.http.notification.node();
							var y = parseInt(node.style.top);
							var sy = gx.dom.documentScroll().scrollTop;
							var newY = ((sy - y - 10) / 3 + 3) + y;
							node.style.top = newY + 'px';
						},

						resize: function () {
							var node = gx.http.notification.node();
							node.style.width = gx.html.viewportWidth() + 'px';
							node.style.height = gx.html.viewportHeight() + 'px';
						},

						showCloseLink: function () {
							if (closeLink) {
								closeLink.style.display = 'block';
							}
						},

						hideCloseLink: function () {
							if (closeLink) {
								closeLink.style.display = 'none';
							}
						},

						cleanup: function () {
							if (node) {
								gx.dom.removeControlSafe(node);
							}
							node = null;
							closeLink = null;
							moveInterval = null;
						}
					};
				}()),

				getCookie: function (name) {
					name = name + '=';
					var cookies = document.cookie.split(';');
					var len = cookies.length;
					for (var i = 0; i < len; i++) {
						var cook = cookies[i];
						while (cook.charAt(0) == ' ')
							cook = cook.substring(1, cook.length);
						if (cook.indexOf(name) == 0)
							return cook.substring(name.length, cook.length);
					}
					return null;
				},

				setCookie: function (name, value, nDays) {
					nDays = nDays || 1;
					var exp = new Date(new Date().getTime() + 3600000 * 24 * nDays);
					document.cookie = name + '=' + escape(value) + '; expires=' + exp.toGMTString();
					return (this.getCookie(name) == value);
				},

				checkResponseStatus: function (req) {
					if (req.status == this.STATUS_FORBIDDEN)
						return false;
					if (req.status == this.STATUS_SESSION_TO || this.isBadResponse(req)) {
						gx.http.reloadOnTimeout();
						return true;
					}
					else if (req.status == this.STATUS_UNAUTHORIZED) {
						if (gx.pO.OnSessionTimeout == gx.ajax.timeoutActions.ignore) {
							gx.http.reload();
						}
						else if (gx.pO.OnSessionTimeout == gx.ajax.timeoutActions.warn) {
							gx.http.reloadOnTimeout();
						}
						return true;
					}
					return false;
				},

				isSessionTimeoutError: function (req, exc) {
					if (!gx.gen.isDotNet() && (exc && req) && gx.pO.AjaxSecurity) {
						if (req.readyState == this.STATE_DONE) {
							if (exc.name == 'NS_ERROR_FAILURE' && exc.result == 2147500037) //FF
							{
								return true;
							}
							else if (exc.name == 'Error' && exc.number == -2146697209) //IE
							{
								return true;
							}
							else if (exc.name == 'NETWORK_ERR' && exc.code == 101) //CHR
							{
								return true;
							}
						}
					}
					return false;
				},

				reloadOnTimeout: function () {
					if (gx.pO.AjaxSecurity && confirm(gx.getMessage("GXM_sessionexpired"))) {
						gx.http.reload();
						return true;
					}
					else {
						gx.ajax.enableForm();
						return false;
					}
				},

				reload: function (forceFullGet) {
					if (document.location.hash == "") {
						this.redirect(location.href, false, forceFullGet);
					}
					else {
						document.location.reload();
					}
				},

				redirect: function (url, disableFrm, forceFullGet, gxO) {
					gxO = gxO || gx.O;
					gx.evt.setProcessing(true);				
					var currentPopup = gx.popup.getPopup();
					if (currentPopup != null) {
						var currentLvl = currentPopup.window.gx.popup.lvl;
						if (currentLvl != -1) {
							var text = (url.indexOf('?') != -1) ? ',' : '?';
							text += encodeURIComponent('gxPopupLevel=' + currentLvl + ';');
							url += text;
						}
					}
					if (!gx.ajax.isabsoluteurl(url)) {
						url = gx.ajax.absoluteurl(url);
					}
					
					if (disableFrm) {
						gx.evt.redirecting = true;					
					}
					else {					
						setTimeout(function () {
							if (gx.pO != gxO)
								gxO.endFeedback();
							else
								gx.ajax.enableForm();
						}, 200);
					}
						
					if (gx.spa.started && !forceFullGet) {
						gx.spa.redirect(url);	
						gx.ajax.enableForm();				
					}
					else {					
						location.href = url;
					}
				},

				getRequest: function () {
					var req = null;
					if (window.XMLHttpRequest) {
						req = new XMLHttpRequest();
					}
					if (!req) {
						try {
							req = new ActiveXObject('Msxml2.XMLHTTP');
						}
						catch (e) {
							try {
								req = new ActiveXObject('Microsoft.XMLHTTP');
							}
							catch (e) { }
						}
					}
					return req;
				},
				
				postDataFormat: {	HTTP: 0, JSON: 1},

				getPostData: function (info, dataFormat) {
					dataFormat = dataFormat || gx.http.postDataFormat.HTTP;
					var postData = dataFormat == gx.http.postDataFormat.HTTP ? [] : {};
					if (info.reqData) {
						postData = info.reqData;
					}
					else {
						var frm = info.formNode,
							elements = (frm.tagName == 'Form') ? frm.elements : $('input,textarea,select'),
							len = elements.length;
						for (var i = 0; i < len; i++) {
							var data = gx.http.elementPostData(elements[i], dataFormat);
							if (data != null) {
								if (dataFormat == gx.http.postDataFormat.HTTP)
									postData.push(data);
								else
									postData[data[0]] = data[1];
							}
						}
					}
					if (gx.lang.isArray(postData) && dataFormat == gx.http.postDataFormat.HTTP)
							postData = postData.join('&') + '&';
					return postData;
				},

				elementPostData: function (el, dataFormat) {
					if (gx.json.isNonSerializable(el.name))
						return null;
					if (el.tagName == 'FIELDSET')
						return null;
					var value = '';
					if (el.type == 'select-multiple') {
						var len = el.options.length;
						for (var j = 0; j < len; j++) {
							if (el.options[j].selected)
								value = el.options[j].value;
						}
					}
					else if (el.type == 'radio' || el.type == 'checkbox') {
						if (el.checked)
							value = el.value;
						else if (el.type == 'radio')
							return null;
					}
					else
						value = this.element_gxvalue(el);
					return (dataFormat == gx.http.postDataFormat.HTTP) ? encodeURIComponent(el.name) + '=' + encodeURIComponent(value) : [el.name, value];
				},

				element_gxvalue: function (el) {
					if (el.gxtype && el.gxtype.type == 'dtime') {
						dt = new gx.date.gxdate(el.value, gx.dateFormat);
						dt.HasTimePart = (el.gxtype.dec > 0);
						dt.HasDatePart = (el.gxtype.len > 0);
						return gx.date.dttoc(dt, el.gxtype.len, el.gxtype.dec);
					}
					return el.value;
				},

				// Precondition req != null, we should use some Assert function
				doHandleRequest: function (req, info) {
					if (req.readyState == this.STATE_DONE) {
						gx.evt.setReady(false);
						gx.evt.setProcessing(false, !gx.csv.validating);
						if (req.status == this.STATUS_OK || info.handleAllStatusCodes) {
							this.doCallHandler(req, info);
						}
						else {
							if (!gx.http.checkResponseStatus(req)) //Check for session timeout or forbidden status code.
								gx.lang.doCallTimeout(gx.dom.write, document, [req.responseText], 50);
						}
						if (info.always) {
							info.always.call(info.obj || window, req, info);
						}
						// WA: Internet Explorer throws an exception when the window is closed in a server-side user event
						if (window.gx) {
							gx.evt.setReady(true);
							gx.dbg.logPerf('execEvt', 'Event Executed');
							gx.dbg.printPerformanceLog();
						}
					}
				},

				onRequestError: function (req, info) {
					if (info.error)
						info.error.call(info.obj || window, req, info);
					if (info.always) {
						info.always.call(info.obj || window, req, info);
					}
					gx.evt.setProcessing(false, !gx.csv.validating);
					if (req.readyState == this.STATE_DONE) {
						gx.http.checkResponseStatus(req);
					}
					else if (this.isBadResponse(req)) {
						gx.http.reloadOnTimeout();
					}
				},

				isBadResponse: function (req) {
					if (req.status == this.STATE_UNSENT && gx.lang.emptyObject(req.responseText))
						return true;
					return false;
				},

				doCall: function (info) {
					if (!info.handler && typeof (info.load) == 'function')
						info.handler = info.load;
					if (typeof (info.sync) != 'boolean')
						info.sync = false;
					if (!info.method)
						info.method = 'POST';
					if (info.multipart && info.method == 'POST') {
						this.doMultipartPost(info);
					}
					else {
						var req = this.getRequest();
						if (req != null) {
							if ((typeof (info.handler) == 'function') && !info.sync) {
								var onreadyFunc = gx.http.doHandleRequest.closure(this, [req, info]);
								var onerrorFunc = gx.http.onRequestError.closure(this, [req, info]);
								if (gx.util.browser.isIE()) {
									req.onreadystatechange = onreadyFunc;
								}
								else {
									req.onload = onreadyFunc;
									req.onerror = onerrorFunc;
								}
							}
							var reqData = null;
							if (info.method == 'POST')
								reqData = gx.http.getPostData(info);
							var url = (info.avoidCache !== false) ? this.uncache(info.url) : info.url;
							req.open(info.method, url, !info.sync);
							if (info.ajaxHeader !== false)
								req.setRequestHeader(gx.ajax.reqHeader, '1');
							if (info.method == 'POST')
								req.setRequestHeader('Content-Type', info.contentType ? info.contentType : 'application/x-www-form-urlencoded');
							if (gx.sec.secToken && gx.AjaxSecurity && gx.OnSessionTimeout == gx.ajax.timeoutActions.ignore)
								req.setRequestHeader(gx.sec.secTokenName, gx.sec.secToken);

							this.setSecurityToken(req, info.gxO);										

							if (info.beforeSend)
								info.beforeSend.call(info.obj || window, req);
							try {
								req.send(reqData);
							}
							catch (e) {
								gx.dbg.logEx(e, 'gxapi.js', 'doCall');
							}

							if ((typeof (info.handler) == 'function') && info.sync) {
								gx.http.doHandleRequest(req, info);
							}

							return req;
						}
					}

					return null;
				},

				doCallHandler: function (req, info) {
					if (info.obj)
						info.handler.call(info.obj, null, req.responseText, req);
					else
						info.handler(null, req.responseText, req);
					// WA: Internet Explorer throws an exception when the window is closed in a server-side user event
					if (window.gx) {
						if (typeof (info.onReady) === 'function')
							info.onReady();
					}
				},

				doMultipartPost: function (info) {
					var iFrame = this.getPostIFrame();
					iFrame.gxPostInfo = info;
					var frm = info.formNode;
					info.oldAction = frm.getAttribute('action');
					frm.setAttribute('action', info.url);
					info.oldTarget = frm.getAttribute('target');
					frm.setAttribute('target', this.iframeName);
					frm.submit();
				},

				setSecurityToken: function (req, gxO) {
					if (gxO && gxO.ajaxSecurityToken) {
						var cmpCtx = (gxO.CmpContext)? gxO.CmpContext: "";
						var secId = "GX_AUTH_" + cmpCtx + gxO.ServerClass;
						secId = secId.toUpperCase();
						req.setRequestHeader("X-GXAUTH-TOKEN", gx.fn.getHidden(secId));		
					}
				},
				
				useReadyStateEvent: function () {
					return gx.util.browser.isIE() && gx.util.browser.ieVersion() < 11;
				},

				iFrameloadEventName: function () {
					return this.useReadyStateEvent() ? 'readystatechange' : 'load';
				},

				getPostIFrame: function () {
					var name = this.iframeName;
					var iFrame = gx.dom.el(name);
					if (iFrame && iFrame.frameElement) {
						iFrame = iFrame.frameElement;
					}
					if (!iFrame) {
						var div = document.createElement('div');
						div.innerHTML = '<iframe name="' + name + '" src="about:blank">';
						document.body.appendChild(div);
						iFrame = div.firstChild;
						document.body.appendChild(iFrame);
						window[name] = iFrame;
						iFrame.name = name;
						iFrame.setAttribute('name', name);
						iFrame.id = name;
						iFrame.style.position = 'absolute';
						iFrame.style.left = '0px';
						iFrame.style.top = '0px';
						iFrame.style.height = '1px';
						iFrame.style.width = '1px';
						iFrame.style.visibility = 'hidden';
					}
					gx.evt.attach(iFrame, this.iFrameloadEventName(), gx.http.iframeOnload);
					return iFrame;
				},

				iframeOnload: function () {
					var iFrame = gx.dom.el(gx.http.iframeName);

					if (gx.http.useReadyStateEvent()) {
						if (iFrame.readyState != 'complete') {
							return;
						}
					}

					gx.evt.setProcessing(false, !gx.csv.validating);
					if (!iFrame)
						iFrame = window.frames[gx.http.iframeName];
					if (iFrame && iFrame.frameElement) {
						iFrame = iFrame.frameElement;
					}
					if (iFrame) {
						if (gx.http.useReadyStateEvent()) {
							iFrame.src = "about:blank";
							gx.evt.detach(iFrame, gx.http.iFrameloadEventName(), gx.http.iframeOnload);
						}
						var info = iFrame.gxPostInfo;
						var frm = info.formNode;
						frm.setAttribute('action', info.oldAction);
						frm.setAttribute('target', info.oldTarget);
						var frameDoc = iFrame.contentDocument ? iFrame.contentDocument : iFrame.contentWindow.document;
						if (frameDoc) {
							var frameBody = frameDoc.body;
							if (gx.dom.allChildrenAreText(frameBody)) {
								var response = gx.base64.decode(gx.http.multipartResponse(frameBody));
								info.handler(null, response, info);
							}
							else {
								document.write(frameDoc.documentElement.innerHTML);
							}
						}
					}
				},

				multipartResponse: function (body) {
					try {
						var node = body.childNodes[0];
						while (node.nodeName != '#text') {
							node = node.childNodes[0];
						}
						var txt = node.nodeValue;
						if (!gx.util.browser.isIE()) {
							node = node.nextSibling;
							while (node) {
								txt += node.nodeValue;
								node = node.nextSibling;
							}
						}
						return txt;
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'multipartResponse');
						return '';
					}
				},

				uncache: function (url) {
					var date = new Date();
					var time = date.getTime();
					var indexOfQuery = url.indexOf('?');
					return url + (indexOfQuery > 0 ? (indexOfQuery < url.length - 1 ? ',' : '') : '?') + 'gx-no-cache=' + time
				},

				callBackend: function (backcall, sURL, sufix, ExecAtFail, Mode, AvoidFormDisable, Method, PostData, AvoidUncache, Async, Headers) {
					var _xmlHttp = this.getRequest();
					var Headers = Headers || {};
					if (_xmlHttp) {
						try {
							var gxO = gx.O;
							if (!AvoidFormDisable) {
								gxO.startFeedback();
							}
							var reqMethod = (typeof (Method) != 'undefined') ? Method : 'GET';
							var reqData = (typeof (PostData) != 'undefined') ? PostData : null;
							var async = (typeof (Async) != 'undefined') ? Async : false;
							if (!AvoidUncache) {
								sURL = this.uncache(sURL);
							}
							_xmlHttp.open(reqMethod, sURL, async);
							_xmlHttp.setRequestHeader(gx.ajax.reqHeader, '2');
							for (var H in Headers)
								_xmlHttp.setRequestHeader(H, Headers[H]);
							if (reqMethod == 'POST')
								_xmlHttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
							else if (gx.sec.secToken && gx.O.AjaxSecurity && gx.pO.OnSessionTimeout == gx.ajax.timeoutActions.ignore)
								_xmlHttp.setRequestHeader(gx.sec.secTokenName, gx.sec.secToken);
							_xmlHttp.send(reqData);
							if (!AvoidFormDisable) {
								gxO.endFeedback();
							}
							this.lastStatus = _xmlHttp.status;
							this.lastResponse = _xmlHttp.responseText;
						}
						catch (e) {
							window.status = 'GXAjax HTTP error: ' + e.message;
						}
						window.status = '';
						if ((_xmlHttp.readyState != this.STATE_DONE) || (_xmlHttp.status != this.STATUS_OK)) //Firefox and Chrome will go with onerror handler. 
						{
							if (!gx.http.checkResponseStatus(_xmlHttp)) //Check for session timeout or forbidden status code. If not, will not refresh page, so continue with error. 
							{
								window.status = 'GXAjax HTTP error: (' + _xmlHttp.status + ') - ' + _xmlHttp.statusText;
								gx.dbg.logEx(_xmlHttp.responseText);
							}
						}
						else {
							if (Mode != this.modes.none) {
								if (this.lastResponse && this.lastResponse.length > 0 && this.lastResponse.charAt(0) != '<') {
									this.lastStatus = 0;

									try {
										if (Mode == this.modes.full)
											this.handleFull(this.lastResponse, backcall, sufix)
										else
											if (Mode == this.modes.call)
												return this.handleCall(this.lastResponse, backcall, sufix)
										return this.handleRetVal(this.lastResponse, backcall, sufix, ExecAtFail)
									}
									catch (e) {
										gx.dbg.logEx(e, 'gxapi.js', 'callBackend');
									}
								}
								else
									window.status = 'GXAjax HTTP error: (bad response format)';
							}
						}
					}
				},

				handleFull: function (Response, backcall, sufix) {
					var event = {};
					event.status = 200;
					event.responseText = "";
					gx.http.postHandler(null, Response, event);
				},

				handleCall: function (ResponseText, backcall, sufix) {
					if (backcall) {
						return eval(backcall + ResponseText + sufix);
					}
				},

				handleRetVal: function (ResponseText, backcall, sufix, ExecAtFail) {
					var Response = gx.json.evalJSON(ResponseText);
					var result = Response[0];
					this.lastStatus = Response[1];
					if (this.lastStatus == undefined)
						this.lastStatus = 0;
					if (backcall && (ExecAtFail || this.lastStatus == null || this.lastStatus == 0)) {
						return eval(backcall + gx.lang.arrayToSource(result) + sufix);
					}
				},

				postHandler: function (type, data, event) {
					try {
						gx.evt.enter = false;
						gx.csv.lastEvtResponse = null;

						if (event.status < 200 || event.status > 299) {
							gx.dom.write(event.responseText);
						}
						else {
							var DataObj = gx.json.evalJSON(data);
							if (DataObj == null)
								gx.dom.write(data.toString());
							else {
								gx.http.refreshState();
								gx.csv.lastEvtResponse = DataObj;
								gx.fn.forceEnableControls(true);
								var willLeavePage = gx.ajax.setPostResponse(DataObj);
								if (!willLeavePage) {
									gx.fx.obs.notify('gx.onafterevent', [DataObj]);
								}
							}
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxapi.js', 'postHandler');
					}
				},

				formatLink: function (url, parms) {
					url = gx.ajax.objectUrl(url);
					if (parms && parms.length > 0) {
						url += '?';
						var len = parms.length;
						for (var i = 0; i < len; i++) {
							if (i > 0) {
								url += ',';
							}
							url += encodeURIComponent( typeof(parms[i].getUrlVal) == 'function' ? parms[i].getUrlVal() : parms[i]);
						}
					}
					return url;
				},

				loadScripts: function (scripts, callback, i) {
					if (typeof (i) == 'undefined') {
						i = 0;
					}
					if (i >= scripts.length) {
						callback();
					}
					else {
						gx.http.loadScript(scripts[i], (function (scripts, callback, i) {
							gx.http.loadScripts(scripts, callback, i + 1);
						}).closure(this, [scripts, callback, i]));
					}
				},

				loadScript: function (url, callback) {
					var head = gx.dom.byTag('head')[0];
					var script = document.createElement('script');
					script.type = 'text/javascript';
					script.src = url;
					if (typeof (callback) == 'function') {
						if (script.addEventListener)
							script.addEventListener('load', callback, false);
						else {
							script.onreadystatechange = function () {
								if (script.readyState == 'loaded' || script.readyState == 'complete') {
									callback();
								}
							};
						}
					}
					head.appendChild(script);
				},

				loadStyle: function (url, callback, beforeTheme, id) {
					var style = id ? gx.dom.el(id) : null;
					if (style) {
						style.href = url;
					}
					else {
						var head = gx.dom.byTag('head')[0];
						style = document.createElement("link");
						style.rel = 'stylesheet';
						style.type = 'text/css'
						style.href = url;
						if (typeof (callback) == 'function') {
							style.onload = callback;
						}
						if (beforeTheme) {
							var themeEl = gx.getThemeElement();
							head.insertBefore(style, themeEl);
						}
						else {
							head.appendChild(style);
						}
					}
				},

				loadStyles: function () {
					var styles = gx.fn.getHidden('GX_STYLE_FILES');
					if (!gx.lang.emptyObject(styles)) {
						for (var i = 0; i < styles.length; i++) {
							var style = styles[i];
							var styleUrl = new gx.util.Url(style);
							if (styleUrl.isRelative()) {
								style = gx.util.resourceUrl(gx.basePath + gx.staticDirectory + style, false);
							}
							if (!gx.cache.fileLoaded(style)) {
								gx.cache.addRemoteFile(style);
								this.loadStyle(style);
							}
						}
					}
				},

				doCommands: function () {
					var cmds = gx.fn.getHidden('GX_SRV_COMMANDS');
					if (!gx.lang.emptyObject(cmds)) {
						gx.ajax.dispatchCommands(cmds);
					}
				}
			};
		})(),

		stackId: function(lvl) {			
			return 'stack_' + gx.util.getWindowInfo().frameId + lvl;
		},
		
		stackSupported: function() {
			return (gx.evt.clinav || gx.fn.getHidden('GX_CLI_NAV') == 'true') && gx.call_stack_storage.supported;
		},
		
		storage: function (prefix) {
			this._store = window.sessionStorage;
			this._prefix = prefix;	
			this.supported = false;
			
			this.set_string = function (key, value) {	
				if (this.supported)			
					this._store[this._prefix + key] = value;	
			}

			this.get_string = function (key) {
				if (this.supported)	
					return this._store[this._prefix + key];
				return null;
			}

			this.set = function (key, value) {
				this.set_string(key, gx.json.serializeJson(value));
			}

			this.get = function (key) {
				var val = this.get_string(key);
				return val ? gx.json.evalJSON(val) : null;
			}

			this.remove = function (key) {
				if (this.supported)	
					this._store.removeItem(this._prefix + key);
			}			
			
			// Initialize
			if (typeof (window.sessionStorage) != 'undefined') {
				try {
					window.sessionStorage.setItem('storage.test',true);
					window.sessionStorage.removeItem('storage.test');
					this.supported = true;
				} 
				catch (e) {
					gx.http.setCookie('GXLocalStorageSupport', 'false', 1);					
				}					
			}							
		},

		_setBasePath: function () {
			var scripts = gx.dom.scripts(),
				gxgral = null;

			for (var i = 0, len = scripts.length; i < len; i++) {
				if (scripts[i].indexOf("gxgral.js") >= 0 || scripts[i].indexOf("gxapiSD.js") >= 0) {
					gxgral = scripts[i];
					break;
				}
			}

			var path = "";
			if (!gx.ajax.isRelativeToHost(gxgral) || gx.ajax.isabsoluteurl(gxgral)) {
				var lastIdx = location.pathname.lastIndexOf("/");
				path = lastIdx > 1 ? location.pathname.substring(1, lastIdx) : "";
			}
			else {
				var gxgralParts = gxgral.split('/'),
					locationParts = location.pathname.split('/');

				gxgralParts.splice(gxgralParts.length - 1, 1);
				locationParts.splice(locationParts.length - 1, 1);

				for (var i = 0, len = locationParts.length; i < len; i++) {
					if (locationParts[i] == gxgralParts[i] || gxgralParts[i] === undefined)
						path = path + ((path == '') ? '' : '/') + locationParts[i];
					else
						break;
				}
			}

			gx.basePath = path;
		},

		objectLoad: function (gxGrids) {
			var deferred = $.Deferred();
			
			if (!gx.evt.execLoad) {	
				deferred.resolve();
				return deferred.promise();
			}

			if (gx.runtimeTemplates === undefined) {
				gx.runtimeTemplates = ($('div[data-abstract-form]').length > 0);
			}

			gx.plugdesign.init().done(function() {
				var loadingObject = true;
				gx.fx.obs.notify('gx.onready');
				if (typeof(gx.StorageTimeZone) != 'undefined' && gx.StorageTimeZone != gx.NULL_TIMEZONEOFFSET) {
					var timezone = jstz.determine().name();
					if (!gx.lang.emptyObject(timezone) && gx.http.getCookie('GxTZOffset') != timezone  && gx.http.setCookie('GxTZOffset', timezone, 30))
						gx.http.reload();
				}
				gx.sec.loadKey();
				gx.setTheme();
				gx.fx.obs.addObserver('webcom.render', this, function (gxComponent) {
					var container = gxComponent.getContainer();
					if (container) {
						gx.setTheme(container);
						if (!loadingObject) {
							gx.plugdesign.applyTemplateObject("#" + container.id);
						}
					}
				});
				gx.fx.obs.addObserver('grid.onafterrender', this, function (grid) {
					if (!grid.ownerGrid.parentGrid) {
						gx.dom.fixes.fixTableResets(grid.container);
					}
				});
				delete gx.evt.redirecting;
				gx.ajax._init();
				gx.grid._init();
				gx.evt.attach(window, 'unload', gx.evt.onunload);
				gx.fn.setFocusInit();
				gx.http.notification.node();
				gx.cache._init();
				gx.fn.installComponents(true);
				gx.http.loadStyles();
				if (gxGrids) {
					gx.fn.loadJsonGrids(gxGrids, false);
				}
				gx.fn.objectOnload();
				gx.dom.indexElements();
				gx.fn.doAttachs();
				document.gxReadyState = 'complete';
				gx.util.autoRefresh.install();
				if (!gx.util.browser.isIE() || gx.util.browser.ieVersion() > 8) {
					gx.fn.setOpacity("reset", 'body');
				}
				gx.evt.setProcessing(false);
				gx.fx.obs.notify('gx.onload');
				gx.evt.userOnload();
				gx.fn.setFocusOnload();
				gx.fx.delayedSuggest();
				gx.http.doCommands();
				gx.evt.setReady(true);
				gx.evt.userReadyCnt = 0;
				loadingObject = false;
				deferred.resolve();
			});
			return deferred.promise();
		},

		objectUnload: function (unloadMasterPage) {
			gx.fx.obs.notify('gx.onunload');
			gx.http.saveState(true);
			gx.evt.clearHooks();
			gx.fx.obs.removeAll();
			gx.http.notification.cleanup();
			gx.util.autoRefresh.destroy();
			gx.fn.objectOnUnload(unloadMasterPage);
			gx._deinit();
		},

		_init: function () {
			gx.lang.apply(this, {
				oldValues: [],
				oldKeyValues: [],
				newRows: [],
				suggestControls: [],
				disabledControls: [],
				usrPtys: [],
				usrFocusControl: '',
				currentRows: [],
				attachedControls: [],
				theme: ''
			});
			gx.dbg._init();
			gx.dom._init();
			gx.base64._init();
			gx.sec._init();
			gx.util._init();
			gx.evt._init();
			gx._setBasePath();
			gx.date._init();
			gx.html.controls._init();
			gx.popup._init();
			gx.geolocation._init();
			gx.call_stack_storage = new gx.storage('gx_call_stack');
		},

		_deinit: function () {
			if ((gx.popup.ispopup() && gx.evt.execLoad) || gx.dom.shouldPurge()) {
				gx.dom.purgeElement(document.body);
				gx.dom.purgeElement(gx.dom.form());
				var events = ['onblur', 'onclick', 'onfocus', 'onchange'];
				var formEls = gx.dom.form().elements;
				for (var i = 0, len = formEls.length; i < len; i++)
					gx.dom.purgeElement(formEls[i], events);
				var spans = gx.dom.byTag('span');
				for (var i = 0, len = spans.length; i < len; i++)
					gx.dom.purgeElement(spans[i], events);
				var imgs = gx.dom.byTag('img');
				for (var i = 0, len = imgs.length; i < len; i++)
					gx.dom.purgeElement(imgs[i], events);
			}
			gx.dom._deinit();
			gx.csv._deinit();
			gx.evt._deinit();
			gx.grid._deinit();
			gx.O = null;
			gx.pO = null;
		},

		reinit: function (unloadMasterPage) {
			gx.pO.clean(unloadMasterPage);
			gx.objectUnload(unloadMasterPage);
			gx._init();
		}
	};
})(jQuery);
/* END OF FILE - ..\js\gxapi.js - */
/* START OF FILE - ..\js\plugdesign.js - */
/*global Mustache:true */
/*global jQuery:true */
gx.plugdesign = (function($) {
	var registeredTemplates = {};
	
	var templatesLoaded = false,
		templates,
		class_maps,
		templatesNamesCounter = 1;

	return {
		init:function()
		{
			return gx.plugdesign.applyTemplateObject();
		},

		getDOMContext:function(el, context, outerHTML, innerHTML, setContextFn) {
			context = {};
			context.text = $(el).text();
			$.each(el.attributes, function( i, a) {
				context[a.name] = a.value;
			});
			if (outerHTML) {
				context.outerHTML = el.outerHTML;
			}
			if (innerHTML) {
				context.innerHTML = el.innerHTML;
			}
			if (setContextFn) {
				context = setContextFn.call(this, context, el) || context;
			}
			return context;
		},
		
		assingUserAPI:function(t, el) {
			el.fnc_isRO = t.fnc_isRO;
		},

		getElements: function (t, selector) {
			if (typeof t.selector == "function")
			{
				return t.selector(selector || "");
			}
			else
			{
				selector = selector && !t.global ? selector + " " + t.selector : t.selector;
				return $(selector);
			}
		},

		applyTemplateOnElement: function (t, el) {
			if (typeof t == "string") {
				t = registeredTemplates[t];
				if (!t)
					return;
			}
			var context = gx.plugdesign.getDOMContext(el, context, t.outerHTML, t.innerHTML, t.setContext);
			if (!t.compiledTemplate && t.template)
				t.compiledTemplate = Mustache.compile(t.template);
			if (t.compiledTemplate) {
				var outputHtml = t.compiledTemplate(context);
				if (t.applyTo == "inner") {
					el.innerHTML = outputHtml;
				}
				else {
					el.outerHTML = outputHtml;
				}
			}
			if (t.initialize) {
				t.initialize(context);
			}
			if (t.listeners) {
				var listeners = t.listeners;
				if (listeners.before) {
					gx.fx.obs.addObserver('gx.control.onbeforepropertychange', this, function (eventObject) {
						var controlId = (typeof listeners.control == "function") ? listeners.control(context) : listeners.control;
						if (!(eventObject.control.id == controlId || (eventObject.control.tagName == "INPUT" && eventObject.control.type == "radio" && eventObject.control.name == controlId)))
							return;

						if (typeof listeners.before[eventObject.property] == "function") {
							var cancel = listeners.before[eventObject.property].call(t, eventObject.control, eventObject.value) === true;
							eventObject.cancel = cancel;
							return;
						}
					});
				}
				if (listeners.after) {
					gx.fx.obs.addObserver('gx.control.onafterpropertychange', this, function (eventObject) {
						var controlId = (typeof listeners.control == "function") ? listeners.control(context) : listeners.control;
						if (!(eventObject.control.id == controlId || (eventObject.control.tagName == "INPUT" && eventObject.control.type == "radio" && eventObject.control.name == controlId)))
							return;

						if (typeof listeners.after[eventObject.property] == "function") {
							listeners.after[eventObject.property].call(t, eventObject.control, eventObject.value);
						}
					});
				}
			}
		},

		applyTemplateSelection:function (t, selector) {
			$.each(this.getElements(t, selector), function(i, el) {
				if (el) 
					gx.plugdesign.applyTemplateOnElement(t, el);
			});
		},

		applyClassMapOnElement: function (t, el) {
			var context;
			context = gx.plugdesign.getDOMContext(el, context, false, false, t.setContext);
			if (t.first) {
				var className = $(el).attr('class') || "";
				$(el).attr('class', t.cssClass + " " + className.replace(t.cssClass, ""));
			}
			else {
				gx.dom.addClass(el, t.cssClass);
			}
			if (t.initialize) {
				t.initialize(context);
			}
		},

		applyClassSelection: function (t, selector) {
			$.each(this.getElements(t, selector), function(i, el) {
				if (el) 
				{
					gx.plugdesign.applyClassMapOnElement(t, el);
					gx.plugdesign.assingUserAPI(t,el);
					gx.fx.obs.addObserver('gx.control.onafterpropertychange', this, function (eventObject) {
						if (eventObject.property == "Class") {
							if ($(eventObject.control).is(t.selector)) {
								gx.plugdesign.applyClassMapOnElement(t, eventObject.control);
							}
						}
					});
				}
			});
		},
		
		applyControlValue:function(ctrl, value) {
			// TODO: Este metodo debe pasar al api de gx
			gx.fn.setControlValue( ctrl.id, value);
			gx.html.onchange(ctrl, value);
		},

		applyTemplates: function (templates, selector) {
			$.each(templates, function( i, t) {
				if (typeof t == "string") {
					t = registeredTemplates[t];
				}
				else {
					t.name = t.name || ('auto-generated-' + templatesNamesCounter++);
					t = new gx.plugdesign.Template(t);
				}
				gx.plugdesign.applyTemplateSelection(t, selector);
			});
		},

		applyClassMaps: function (class_maps, selector) {
			$.each(class_maps, function( i, m) {
				gx.plugdesign.applyClassSelection(m, selector);
			});
		},

		applyTemplateObject:function(selector) {
			var deferred = $.Deferred();

			if (!gx.runtimeTemplates)
				return deferred.resolve().promise();

			if (!templatesLoaded) {
				var fnc = function(type, responseText) {
					var response = gx.json.evalJSON(responseText);
					if (response.css) {
						$.each(response.css, function(i, css) {
							gx.http.loadStyle(gx.util.resourceUrl(gx.basePath + gx.staticDirectory + css, false), false, true); 
						});
					}
					var ajs = [];
					if (response.js) {
						$.each(response.js, function(i, js) {
							ajs.push(gx.util.resourceUrl(gx.basePath + gx.staticDirectory + js, false))
						});
					}
					var oldJQuery = jQuery;
					jQuery = gx.$;
					gx.http.loadScripts(ajs, (function() {
						templatesLoaded = true;
						templates = response.templates || [];
						class_maps = response.class_maps || [];
						
						this.applyTemplates(templates, selector);
						this.applyClassMaps(class_maps, selector);
						jQuery = oldJQuery;
						deferred.resolve();
					}).closure(this));
				};
				gx.http.doCall({ avoidCache:false, sync:true,  method: 'GET', url: gx.util.resourceUrl(gx.basePath + gx.staticDirectory + 'gxtemplate.json', false), handler: fnc, obj: this});
			}
			else {
				this.applyTemplates(templates, selector);
				this.applyClassMaps(class_maps, selector);
				deferred.resolve();
			}
			return deferred.promise();
		},

		/**
		* @class gx.plugdesign.Template
		* Base class for creating Templates to be applied in runtime, to change and enhance GeneXus controls
		*/
		Template: (function () {
			var template = function (opts) {
				opts = opts || {};
				if (!opts.name) {
					gx.dbg.write("A name must be specified", true);
					return;
				}
				if (!opts.selector) {
					gx.dbg.write("A selector must be specified", true);
					return;
				}
				if (opts.listeners) {
					var listeners = opts.listeners;
					if (!listeners.control && (listeners.before || listeners.after)) {
						gx.dbg.write("If a visible or enabled handler is specified, a control must be specified too", true);
						return;
					}
				}
				gx.lang.apply(this, opts);
				// Register the template, so it can be referenced by name
				registeredTemplates[opts.name] = this;
				return this;
			};

			template.prototype = {
				/**
				* @property {String}
				* Template name, used to reference the template from de gxtemplate.json file (required)
				*/
				name: "",
				/**
				* @property {String}{Function}
				* A valid JQuery selector or function, used to match the elements that will be transformed with the template (required).
				*/
				selector: "",
				/**
				* @property {String}
				* A Mustache template that will be used to replace the matched elements. The template will be applied to replace each matched element.
				* A default context object is created with all the attributes of the matched element. For example, given a matched element like 
				*		<a href="http://www.genexus.com" target="_blank" id="some-id">Hello</a>
				* The context object will look like this:
				*		{
				*			href: "http://www.genexus.com",
				*			target: "_blank",
				*			id: "some-id"
				*		}
				*/
				template: "",
				/**
				* @property {String} [applyTo="outer"]
				* Set to 'outer' if you want the HTML to be applied to the matched elements outerHTML. Set to 'inner' to apply the HTML to the matched elements innerHTML.
				*/
				applyTo: "outer",
				/**
				* @property {Boolean}
				* Set to true if you want to add the the matched element's outerHTML set as a context property.
				*/
				outerHTML: false,
				/**
				* @property {Boolean}
				* Set to true if you want to add the the matched element's innerHTML set as a context property.
				*/
				innerHTML: false,
				/**
				* @property {Boolean}
				* Set to true if you want the selector to be always applied globally. In some cases, the templates are only applied to 
				* the children elements of a given element, for example, when a grid is redrawn, the templates are only applied inside the grid.
				*/
				global: false,
				/**
				* @property {Function}
				* An optional function that enables you to change the default context or even create a new one. This function is called 
				* after creating the deafult context and before applying the template. To create a new context, the function must return a new object.
				* @param setContext.context The deafult context.
				* @param setContext.el The matched element.
				*/
				setContext: gx.emptyFn,
				/**
				* @property {Function}
				* An optional function that is called after applying the template, to let you do some initialization work.
				* @param initialize.context The deafult context.
				*/
				initialize: gx.emptyFn,
				/**
				* @property listeners {Object}
				* A config object containing event handlers that are fired before and after every time a property of the control specified in the control property
				* is changed. The handler functions that are fired before the property change are specified in the listeners.before config object. 
				* If one of these handlers returns false, the default property change behaviour is cancelled.
				* The handler functions that are fired after the property change are specified in the listeners.after config object. 
				* The name of the functions in the listeners.before and listeners.after config object
				* must map with the name of the changed property. For example: Visible, Enabled, Caption, Class (see gx.fn.setCtrlPropertyImpl function for a complete list).
				* @property listeners.control {String}{Function}
				* The id of the control whose events will be handled. A string containing the id or a function that returns id of the control can be specified.
				* @property listeners.before {Object)
				* A config object where the event handlers are specified.
				* @property listeners.before.Property {Function)
				* A function fired before GX standard property change routines. It handles changes made on a property named "Property". If it returns false,
				* the default behaviour is cancelled.
				* @param listeners.before.Property.control {HTMLElement}
				* Control element
				* @param listeners.before.Property.value {Boolean}
				* The value that will be set to the property named "Property" of the control.
				* @property listeners.after {Object)
				* A config object where the event handlers are specified.
				* @property listeners.after.Property {Function)
				* A function fired after GX standard property change routines. It handles changes made on a property named "Property". 
				* @param listeners.after.Property.control {HTMLElement}
				* Control element
				* @param listeners.after.Property.value {Boolean}
				* The value that has been set to the property named "Property" of the control.
				*/
				listeners: {}
			};

			return template;
		})()
	}
})(gx.$);
/* END OF FILE - ..\js\plugdesign.js - */
/* START OF FILE - ..\js\gxhtml.js - */
gx.html = (function ($) {
	var STYLE_ELEMENT_PATTERN = "<style[^>]*>([\\s\\S]*?)<\/style>",
		STYLE_ELEMENT_REGEX = new RegExp(STYLE_ELEMENT_PATTERN, "i"),
		STYLE_ELEMENT_REGEX_GLOBAL = new RegExp(STYLE_ELEMENT_PATTERN, "ig"),
		LINK_ELEMENT_PATTERN = "<link ([^>]*rel=['\"]?stylesheet['\"]?[^>]*)>",
		LINK_ELEMENT_REGEX = new RegExp(LINK_ELEMENT_PATTERN, "i"),
		LINK_ELEMENT_REGEX_GLOBAL = new RegExp(LINK_ELEMENT_PATTERN, "ig"),
		SCRIPT_ELEMENT_PATTERN = "<script([^>]*)>([\\s\\S]*?)<\/script>",
		SCRIPT_ELEMENT_REGEX = new RegExp(SCRIPT_ELEMENT_PATTERN, "i"),
		SCRIPT_ELEMENT_REGEX_GLOBAL = new RegExp(SCRIPT_ELEMENT_PATTERN, "ig"),
		HREF_ELEMENT_ATT_REGEX = /href=(['"]?)([^'">]*)\1/i,
		ID_ELEMENT_ATT_REGEX = /id=(['"]?)([^'">]*)\1/i,
		SRC_ELEMENT_ATT_REGEX_1 = /src=(['"]?)([\s\S]*)\?([^"']*)\1/i,
		SRC_ELEMENT_ATT_REGEX_2 = /src=(['"]?)([^"']*)\1/i;

	return {
		encodeCaseFormat: function (Value, nFormat, multiline) {
			if ((nFormat == gx.html.controls.formats.TEXT))
				Value = gx.html.encode(Value, false, multiline);
			else if ((nFormat == gx.html.controls.formats.TEXT_W_SPACES))
				Value = gx.html.encode(Value, true, multiline);
			return Value;
		},

		encode: function (Value, encodeWhiteSpace, encodeEnter) {
			var oldChars = ['<', '>', '&'];
			var newChars = ['&lt;', '&gt;', '&amp;'];
			if (encodeWhiteSpace) {
				oldChars.push(' ');
				newChars.push('&nbsp;');
			}
			if (encodeEnter) {
				oldChars.push('\n');
				newChars.push('<br/>');
			}
			return gx.text.charReplace(Value, oldChars, newChars);
		},

		getHidden: function (id, value) {
			return '<input type="hidden" id="' + id + '" name="' + id + '" value="' + value + '">';
		},

		viewportWidth: function () {
			var doc = document.documentElement;
			if (doc && doc.clientHeight)
				return Math.max(doc.clientWidth, document.body.clientWidth);
			else
				return document.body.clientWidth;
		},

		viewportHeight: function () {
			var doc = document.documentElement;
			if (doc && doc.clientHeight)
				return Math.max(doc.clientHeight, document.body.clientHeight) - 5;
			else
				return document.body.clientHeight - 5;
		},

		cleanHtmlRefs: function (html, removeStyles) {
			removeStyles = (removeStyles === undefined || removeStyles);
			if (removeStyles) {
				html = html.replace(STYLE_ELEMENT_REGEX_GLOBAL, '');
			}
			html = html.replace(LINK_ELEMENT_REGEX_GLOBAL, '');
			html = html.replace(SCRIPT_ELEMENT_REGEX_GLOBAL, '');
			return html;
		},

		setOuterHtml: function (Control, Html) {
			Control.outerHTML = Html;
		},

		setInnerHtml: function (control, html, process, transition, removeStyles) {
			var styles = gx.dom.styles();
			if (gx.dom.shouldPurge())
				gx.dom.purge(control, true);
			var bodyEl = control.children[0];
			if (!bodyEl && transition) {
				bodyEl = document.createElement('div');
				gx.dom.addClass(bodyEl, gx.GxObject.WEBCOMPONENT_BODY_CLASS_NAME);
				gx.dom.addClass(bodyEl, "Form-fx");
				control.appendChild(bodyEl);
			}
			if (transition && gx.pO.fullAjax && bodyEl && gx.dom.hasClass(bodyEl, gx.GxObject.WEBCOMPONENT_BODY_CLASS_NAME) && !gx.dom.hasClass(control, 'transitioning')) {
				var tempDiv = document.createElement('div');
				tempDiv.innerHTML = this.cleanHtmlRefs(html, removeStyles);
				gx.dom.replaceWithFx(bodyEl, tempDiv.children[0]);
			}
			else {
				$(control).html(this.cleanHtmlRefs(html, removeStyles));
			}
			if (gx.util.browser.isIE())
				gx.cache.updateStyles(styles, gx.dom.styles());
			if (process == true)
				this.processCode(html, false);
		},

		setInnerText: function (control, text, format, multiline) {
			var $control = $(control);
			if (control.nodeValue != null)
				control.nodeValue = text;
			else if (!gx.util.browser.isChrome() && control.innerText != null)
				control.innerText = text;
			else if (gx.util.browser.isFirefox() || gx.util.browser.isChrome())
				$control.html(gx.html.encodeCaseFormat(text, format, multiline));
			else if (control.tagName == 'TEXT' && control.innerHTML != null)
				$control.html(text);
			else
				$control.html('<text>' + text + '</text>');
		},

		nodesFromText: function (text) {
			var node = document.createElement('div');
			node.style.visibility = 'hidden';
			node.style.display = 'none';
			document.body.appendChild(node);
			if (gx.dom.shouldPurge())
				gx.dom.purge(node, true);
			node.innerHTML = text;
			var nodes = [];
			var len = node.childNodes.length;
			for (var i = 0; i < len; i++) {
				nodes.push(node.childNodes[i].cloneNode(true));
			}
			gx.dom.removeControlSafe(node);
			return nodes;
		},

		onTypeAvailable: function (cName, callback, callbackParms) {
			try {
				var typeObj = eval(cName);
				if (callbackParms instanceof Array)
					callback.apply(this, callbackParms);
				else
					callback();
			}
			catch (e) {
				setTimeout(function () { gx.html.onTypeAvailable(cName, callback, callbackParms); }, 250);
			}
		},

		processCode: function (html, avoidEval, callback, callbackParms, cName, moveInlineStyles) {
			var origHtml = html;
			var remoteScripts = [];
			var checkTypeLoaded = false;
			var scripts = [];
			var remoteStyles = [];
			var styles = [];

			moveInlineStyles = (moveInlineStyles === undefined || moveInlineStyles);

			if (html == '')
				return;

			var match = [];
			if (moveInlineStyles) {
				while (match) // Parse inline styles
				{
					match = html.match(STYLE_ELEMENT_REGEX);
					if (!match)
						break;
					else {
						var lastIndex = match.lastIndex;
						if (!lastIndex)
							lastIndex = match.index + match[0].length;
						html = html.substring(lastIndex);
					}
					styles.push(match[1]);
				}
			}
			html = origHtml;
			match = [];
			while (match) // Parse links to stylesheets
			{
				match = html.match(LINK_ELEMENT_REGEX);
				if (!match)
					break;
				else {
					var lastIndex = match.lastIndex;
					if (!lastIndex)
						lastIndex = match.index + match[0].length;
					html = html.substring(lastIndex);
				}
				attr = match[1].match(HREF_ELEMENT_ATT_REGEX);
				idAttr = match[1].match(ID_ELEMENT_ATT_REGEX);
				if (attr && !gx.cache.fileLoaded(attr[2])) {
					remoteStyles.push({
						href: attr[2],
						id: (idAttr && idAttr.length > 2) ? idAttr[2] : null
					});
					gx.cache.addRemoteFile(attr[2]);
				}
			}
			html = origHtml;
			match = [];
			while (match) // Parse scripts
			{
				match = html.match(SCRIPT_ELEMENT_REGEX);
				if (!match)
					break;
				else {
					var lastIndex = match.lastIndex;
					if (!lastIndex)
						lastIndex = match.index + match[0].length;
					html = html.substring(lastIndex);
				}
				if ((match[1] != undefined) && (match[1] != '')) // Remote scripts
				{
					var attr = match[1].match(SRC_ELEMENT_ATT_REGEX_1);
					if (attr == null)
						attr = match[1].match(SRC_ELEMENT_ATT_REGEX_2);
					if (attr && !gx.cache.fileLoaded(attr[2])) {
						var fullUrl = attr[2];
						if (!gx.lang.emptyObject(attr[3])) {
							fullUrl += '?' + attr[3];
						}
						remoteScripts.push(fullUrl);
						gx.cache.addRemoteFile(attr[2]);
					}
					else if (attr && gx.cache.fileLoaded(attr[2])) {
						checkTypeLoaded = true;
					}
					else if (!attr && match[2]) // Inline scripts
						scripts.push(match[2]);
				}
				else if (match[2]) // Inline scripts
					scripts.push(match[2]);
			}
			if (avoidEval == true)
				return;
			//Eval Embedded script before calling async callback
			var evalStr = '';
			scrQty = scripts.length;
			for (var i = 0; i < scrQty; i++) {
				evalStr += scripts[i];
			}
			if (evalStr != '')
				gx.lang.doEval(evalStr); // Evaluate scripts code

			var remoteFilesStr = [];
			if (typeof (callback) == 'function') {
				gx.http.loadScripts(remoteScripts, (function (callback, callbackParms) {
					if (callbackParms instanceof Array)
						callback.apply(this, callbackParms);
					else
						callback();
				}).closure(this, [callback, callbackParms]));
			}
			else {
				var getInfo = {};
				getInfo.method = 'GET';
				getInfo.useCash = true;
				getInfo.load = (function (type, scriptStr) {
					gx.lang.supEval(this, remoteFilesStr.push(scriptStr));
				}).closure(this);
				getInfo.mimetype = "text/plain";
				getInfo.sync = true;
				var scrRemoteQty = remoteScripts.length;
				for (var i = 0; i < scrRemoteQty; i++) {
					getInfo.url = remoteScripts[i]; // GET remote scripts from server
					gx.http.doCall(getInfo);
				}
			}
			evalStr = '';
			var scrQty = remoteFilesStr.length;
			for (var i = 0; i < scrQty; i++) {
				evalStr += remoteFilesStr[i];
			}
			if (evalStr != '')
				gx.lang.doEval(evalStr); // Evaluate scripts code

			var styleCtrls = document.getElementsByTagName("style");
			scrQty = remoteStyles.length;
			for (var i = 0; i < scrQty; i++) {
				var exists = false;
				var stQty = styleCtrls.length;
				for (var j = 0; j < stQty; j++) {
					if (styleCtrls[i]) {
						var cssUrl = (styleCtrls[j].styleSheet && styleCtrls[j].styleSheet.cssText) ? styleCtrls[j].styleSheet.cssText : styleCtrls[j].innerHTML;
						if (remoteStyles[i].href == cssUrl)
							exists = true;
					}
				}
				if (!exists) {
					var styleEl = gx.dom.el(remoteStyles[i].id);
					if (styleEl) {
						styleEl.href = remoteStyles[i].href;
					}
					else {
						gx.http.loadStyle(remoteStyles[i].href, gx.emptyFn, false, remoteStyles[i].id); // GET remote stylesheets from server
					}
				}
			}
			var evalStr = '';
			scrQty = styles.length;
			for (var i = 0; i < scrQty; i++) {
				evalStr += styles[i];
			}
			if (evalStr != '') {
				// Put styles into html head
				var styleCtrl = document.createElement("style");
				styleCtrl.setAttribute("type", "text/css");
				var domHead = document.getElementsByTagName("head")[0];
				domHead.appendChild(styleCtrl);
				if (styleCtrl.styleSheet)
					styleCtrl.styleSheet.cssText = evalStr;
				else {
					var textNode = document.createTextNode(evalStr);
					styleCtrl.appendChild(textNode);
				}
			}
			if ((scrRemoteQty == 0) && (typeof (callback) == 'function')) {
				if (checkTypeLoaded && cName)
					gx.html.onTypeAvailable(cName, callback, callbackParms);
				else
					if (callbackParms instanceof Array)
						callback.apply(this, callbackParms);
					else
						callback();
			}
		},

		multimediaUpload: {

			getInputFileEl: function(id) {
				return $("#" + id + "[type='file']")[0];
			},

			resolveFileName: function(file, uri) {
				return file || uri || "";
			},

			onOptionChange: function (el) {
				var elements = this.getElements(el),
					uriOpt = elements.uriOption,
					file = elements.fileField,
					uri = elements.uriField;

				if (uriOpt.checked) {
					gx.dom.removeClass(file, "field-selected");
					gx.dom.addClass(uri, "field-selected");
				}
				else {
					gx.dom.removeClass(uri, "field-selected");
					gx.dom.addClass(file, "field-selected");
				}
			},

			imageLoadHandler: function (prevImg, prevLink) {
				var isEmpty = function (el) {
					var att = el.tagName == 'IMG' ? 'src' : 'href';
					return (!el[att] || el[att] == document.location.href || el[att].charAt(el[att].length - 1) == '/')
				};

				if (!prevImg || isEmpty(prevImg))
					gx.dom.addClass(prevLink, "gx-multimedia-empty");
				else
					gx.dom.removeClass(prevLink, "gx-multimedia-empty");

				if (prevLink && !isEmpty(prevLink))
					gx.dom.removeClass(prevLink, "gx-multimedia-empty");

				if (gx.util.browser.isIE()) {
					if (prevImg && prevImg.tagName == 'IMG') {
						var maxWidth = parseInt(prevImg.currentStyle.maxWidth);
						if (maxWidth < prevImg.width) {
							prevImg.style.height = gx.dom.addUnits(maxWidth * prevImg.height / prevImg.width);
							prevImg.style.width = gx.dom.addUnits(maxWidth);
						}
						var maxHeight = parseInt(prevImg.currentStyle.maxHeight);
						if (maxHeight < prevImg.height) {
							prevImg.style.width = gx.dom.addUnits(maxHeight * prevImg.width / prevImg.height);
							prevImg.style.height = gx.dom.addUnits(maxHeight);
						}
					}
				}
			},

			dialogCloseHandler: function (el, fieldsCt, btn) {
				var elements = this.getElements(el);

				fieldsCt.style.display = 'none';
				el.appendChild(fieldsCt);

				if (elements.uriOption.checked) {
					this.refreshPreviewImg(el, elements.uriField);
				}
				else {
					this.refreshPreviewImg(el, elements.fileField);
				}
			
				elements.action.focus();
			},

			actionClickHandler: function (evt, el) {
				evt = evt || event;
				if (evt.preventDefault)
					evt.preventDefault();
				else
					evt.returnValue = false;

				var elements = this.getElements(el),
					btn = elements.button;
				elements.fieldsCt.style.display = 'block';

				var height = 130,
					width = 500,
					resizable = true;
				if (gx.util.browser.isIE() && gx.util.browser.isCompatMode()) {
					el.style.position = 'static';
					elements.fileField.style.marginTop = '0';
					elements.uriField.style.marginTop = '0';
					height = 230;
				}

				if (gx.runtimeTemplates) {
					resizable = false;
					if ($(window).width() < width) {
						width = $(window).width() - 20;
						height = 170;
					}
				}

				var dialog = gx.popup.openDialog({
					parentElement: el,
					w: width,
					h: height,
					contentHtml: elements.fieldsCt,
					title: "",
					showParentPopups: false,
					showCloseButton: true,
					resizable: resizable,
					callbacks: {
						beforeClose: this.dialogCloseHandler.closure(this, [el, elements.fieldsCt, btn])
					}
				});

				elements.fileOption.focus();
				gx.evt.attach(btn, 'click', dialog.close, dialog, { single: true});
				gx.fx.obs.addObserver('gx.keypress', this, this.keypressHandler);
			},

			clearActionHandler: function (evt, el) {
				evt = evt || event;
				if (evt.preventDefault)
					evt.preventDefault();
				else
					evt.returnValue = false;

				var elements = this.getElements(el);
				elements.uriField.value = "";
				elements.fileField.value = "";
				elements.uriOption.checked = false;
				elements.fileOption.checked = true;

				gx.fx.obs.notify('gx.multimedia.clear', [el]);

				this.refreshPreviewImg(el, elements.fileField);
			},
		
			keypressHandler: function(eventObject){
				var evt = eventObject.event;
				if (evt.keyCode == 13)
				{
					eventObject.cancel = true;
					gx.popup.currentPopup.close();
					gx.fx.obs.deleteObserver('gx.keypress', this, this.keypressHandler);
				}
			},

			tapHandler: function (el) {
				var elements = this.getElements(el);
				elements.action.focus();
			},

			getElements: function (el) {
				el = gx.dom.el(el);
				var $el = $(el),
					action = $el.find('.change-action')[0],
					clearAction = $el.find('.clear-action')[0],
					previewLink = null,
					prevImg = $(clearAction).next()[0],
					$fieldsCt = $el.find('.fields-ct');

				if (prevImg.tagName == "A") {
					previewLink = prevImg;
					prevImg = prevImg.firstChild;
				}
				else if (prevImg.tagName != "IMG") {
					prevImg = null;
				}

				return {
					previewLink: previewLink,
					action: action,
					clearAction: clearAction,
					previewImg: prevImg,
					fieldsCt: $fieldsCt[0],
					uriField: $fieldsCt.find("input[type='text']")[0],
					fileField: $fieldsCt.find("input[type='file']")[0],
					uriOption: $fieldsCt.find("input[type='radio'][value='uri']")[0],
					fileOption: $fieldsCt.find("input[type='radio'][value='file']")[0],
					button: $fieldsCt.find("input[type='button']")[0]
				};
			},

			getContainer: function (el) {
				var parent = gx.dom.el(el);
				while (parent) {
					if (gx.dom.hasClass(parent, 'gx-multimedia-upload'))
						return parent;
					parent = parent.parentNode;
				}
				return null;
			},

			setPreviewImage: function (el, link) {
				el = gx.dom.el(el);
				var elements = this.getElements(el);

				if (elements.previewImg) {
					if (elements.previewImg.tagName == 'IMG')
						elements.previewImg.src = link;
					this.imageLoadHandler(elements.previewImg, elements.previewLink);
				}
			},

			setPreviewLink: function (el, link) {
				el = gx.dom.el(el);
				var elements = this.getElements(el);
				if (elements.previewLink) {
					if (link && (!elements.previewImg || elements.previewImg.tagName != 'IMG'))
						elements.previewLink.href = link;
					else
						elements.previewLink.removeAttribute('href');
				}

				this.imageLoadHandler(elements.previewImg, elements.previewLink);
			},

			refreshPreviewImg: function (el, input) {
				el = gx.dom.el(el);
				var elements = this.getElements(el);

				if (elements.previewImg) {
					if (input.tagName == 'INPUT') {
						if (input == elements.fileField) {
							var file;
							if (input.files) {
								file = input.files[0];
								if (file) {
									if (file.type.match(/image.*/)) {
										var reader = new FileReader();
										reader.onload = (function (e, aImg, aLink) {
											aImg.src = e.target.result;
											aLink.href = "";
										}).closure(this, [elements.previewImg, elements.previewLink], true);
										reader.readAsDataURL(file);
									}
									else {
										elements.previewLink.href = "#";
									}
								}
							}
							if ((!file && input.getAttribute("gxctrlchanged") == "1") || input.gxctrldeleted) {
								elements.previewImg.src = "";
								elements.previewLink.href = "";
							}
						}
						else if (input == elements.uriField) {
							elements.previewImg.src = input.value;
							elements.previewLink.href = input.value;
						}
						this.imageLoadHandler(elements.previewImg, elements.previewLink);
					}
				}
			},

			setType: function (el, isBlob) {
				el = gx.dom.el(el);
				var elements = this.getElements(el);

				elements.fileOption.checked = isBlob;
				elements.uriOption.checked = !isBlob;
				if (isBlob)
					elements.uriField.value = "";

				this.onOptionChange(el);
			},

			getOptionValue: function (el) {
				el = gx.dom.el(el);
				var elements = this.getElements(el);
				return (elements.fileOption.checked) ? "file" : "uri";
			},

			createControl: function (el) {
				el = gx.dom.el(el);

				if (!el._created) {
					el._created = true;

					var elements = this.getElements(el);
					gx.dom.addClass(elements.fileField, "field-selected");
					elements.action.setAttribute("gxfocusable", '1');

					var btn = document.createElement('input');
					btn.type = 'button';
					btn.className = 'BtnEnter';
					btn.value = gx.getMessage('GXM_uploadconfirmoption');
					elements.fieldsCt.appendChild(btn);

					var imageLoadHandler = this.imageLoadHandler.closure(this, [elements.previewImg, elements.previewLink]);

					var optionChangeHandler = this.onOptionChange.closure(this, [el]);

					imageLoadHandler();
					if (elements.previewImg)
						gx.evt.attach(elements.previewImg, 'load', imageLoadHandler);
					optionChangeHandler();
					gx.evt.attach(elements.uriOption, 'click', optionChangeHandler);
					gx.evt.attach(elements.fileOption, 'click', optionChangeHandler);
					gx.evt.attach(elements.action, 'click', this.actionClickHandler.closure(this, [el], true));
					gx.evt.attach(elements.clearAction, 'click', this.clearActionHandler.closure(this, [el], true));
					gx.evt.attach(el, 'touchstart', this.tapHandler.closure(this, [el]));
				}
			}
		},

		controls: {
			types: {
				singleLineEdit: 1,
				multipleLineEdit: 2,
				blob: 3,
				radio: 4,
				comboBox: 5,
				listBox: 6,
				checkBox: 7,
				image: 8,
				textBlock: 9,
				button: 10,
				grid: 11,
				userControl: 12,
				userControlContainer: 13,
				webComponent: 14,
				embeddedPage: 15,
				table: 16,
				row: 17,
				cell: 18,
				group: 19,
				multimedia: 20,
				video: 21,
				audio: 22,
				div: 23,
				responsiveRow: 24,
				responsiveCell: 25
			},

			formats: {
				TEXT: 0,
				HTML: 1,
				RAW_HTML: 2,
				TEXT_W_SPACES: 3
			},

			isMultiSelection: function (ctrlType) {
				if (ctrlType == 'combo' || ctrlType == 'dyncombo'
					|| ctrlType == 'listbx' || ctrlType == 'dynlistbx') {
					return true;
				}
				return false;
			},

			eventJSCode: function (jsScrCode, eventName, jsDynCode, gridObj, rowObj) {
				var sEventJsCode = '';
				if (jsScrCode == 4 && jsDynCode)
					sEventJsCode = jsDynCode;
				else if (jsScrCode == 1)
					sEventJsCode = 'gx.fn.closeWindow();';
				else if (jsScrCode == 7) {
					var gridInfo = '';
					if (gridObj && rowObj)
						gridInfo = ',\'' + gridObj.gridName + '\',\'' + rowObj.gxId + '\'';
					sEventJsCode = 'gx.evt.execCliEvt(' + eventName + gridInfo + ',this);';
				}
				else if (jsScrCode == 6 || jsScrCode == 5)
					sEventJsCode = "gx.evt.execEvt(" + eventName + ",this," + gridObj.gridId + ");";
				return sEventJsCode;
			},

			startAnchor: function (parentCtrl, sGXOnClickCode, sUserOnClickCode, sLinkURL, sLinkTarget) {
				if (sUserOnClickCode != '') {
					if (sGXOnClickCode != '')
						parentCtrl.append('<a href="javascript:if( ' + sUserOnClickCode + ') {' + sGXOnClickCode + '}">');
					else
						parentCtrl.append('<a href="javascript:' + sUserOnClickCode + '">');
				}
				else {
					if (sGXOnClickCode != '')
						parentCtrl.append('<a href="javascript:' + sGXOnClickCode + '">');
					else {
						if (sLinkURL != '') {
							parentCtrl.append('<a href="' + sLinkURL + '"');
							if (sLinkTarget != '')
								parentCtrl.append(' target="' + sLinkTarget + '"');
							parentCtrl.append('>');
						}
					}
				}
			},

			endAnchor: function (parentCtrl, sGXOnClickCode, sUserOnClickCode, sLinkURL) {
				if (sGXOnClickCode != '' || sUserOnClickCode != '' || sLinkURL != '')
					parentCtrl.append('</a>');
			},

			onJSEvent: function (parentCtrl, sEventName, sEventJsCode, sUserOnClickCode) {
				parentCtrl.append(' ');
				if (sUserOnClickCode != '')
					parentCtrl.append('jsevent="' + sUserOnClickCode + '" ');
				parentCtrl.append(sEventName + '="if( ');
				if (sEventJsCode != '')
					parentCtrl.append('gx.evt.jsEvent(this)) {' + sEventJsCode + '} else return false;"');
				else
					parentCtrl.append('!gx.evt.jsEvent(this)) return false;"');
			},

			htmlControl: function (id, width, height, cssClass, title) {
				this.id = id || '';
				this.width = width || 0;
				this.widthUnit = 'px';
				this.height = height || 0;
				this.heightUnit = 'px';
				this.cssClass = cssClass || '';
				this.roClass = '';
				this.ownCssClass = '';
				this.style = '';
				this.title = title || '';
				this.value = '';
				this.type = -1;
				this.dataType = '';
				this.visible = true;
				this.enabled = true;
				this.rtEnabled = false;
				this.link = '';
				this.linkTarget = '';
				this.jsEvent = '';
				this.hasJsLink = false;
				this.extraAttributes = '';
				this.grid = null;
				this.row = null;
				this.column = null;
				this.gridId = '';
				this.gridRow = '';
				this.buffer = new gx.text.stringBuffer();
				
				this.getHtml = function () {
					this.buffer.clear();
					this._getHtml();
					return this.buffer.toString();
				}

				this.append = function (value) {
					return this.buffer.append(value);
				}

				this.tagAtt = function (name, value) {
					return this.buffer.append(' ' + name + '="' + value.toString().replace(/\"/g, '&quot;') + '"');
				}

				this.persistValue = function () {
					var vStruct = this.grid.parentObject.GXValidFnc[this.column.gxId];
					if (!gx.lang.emptyNum(this.column.gxId) && vStruct) {
						if (this._persistValue)
							this._persistValue();
						else {
							if (vStruct.v2v)
								vStruct.v2v(this.value);
						}
					}
				}

				this.setIndividualProp = function (ptyName, ptyValue) {
					if (ptyName == 'enabled' || ptyName == 'visible' || ptyName == 'isPassword' || ptyName == 'autoComplete' || ptyName == 'hasJsLink')
						this[ptyName] = gx.lang.gxBoolean(ptyValue);
					else
						this[ptyName] = ptyValue;
				}

				this.setGridData = function (data) {
					this.grid = data.grid;
					this.row = data.row;
					this.gridId = data.gridId;
					this.gridRow = data.gridRow;
				}

				this.getGridData = function () {
					return {
						grid: this.grid,
						row: this.row,
						gridId: this.gridId,
						gridRow: this.gridRow
					};
				}
			},

			singleLineEdit: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.singleLineEdit;
				this.maxLength = '';
				this.isPassword = false;
				//this.valueIndex = 1;
				this.setProperties = function (sCtrlName, sFormatedValue, sTags, sEventName, sLinkURL, sLinkTarget, sTooltipText, sPlaceholder, sUserOnClickCode, nJScriptCode, sClassString, sStyleString, sROClassString, sColumnClass, nVisible, nEnabled, nRTEnabled, sType, sStep, nWidth, nWidthUnit, nHeight, nHeightUnit, nLength, nIsPassword, nFormat, nParentId, bHasTheme,
								 nAutoComplete, nAutoCorrection, bSendHidden, sDomType, sAlign, sValue) {
					this.id = sCtrlName;
					this.inputType = sType;
					this.step = sStep;
					this.title = sTooltipText;
					this.placeholder = sPlaceholder;
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight == 17 ? 0 : nHeight;
					this.heightUnit = nHeightUnit;
					this.maxLength = nLength;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.rtEnabled = (nRTEnabled != 0);
					this.isPassword = (nIsPassword != 0);
					this.format = nFormat;
					this.link = sLinkURL;
					this.linkTarget = sLinkTarget;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.roClass = sROClassString;
					this.columnClass = sColumnClass;
					this.vStruct = gx.O.getValidStructFld(this.column.htmlName);
					this.formattedValue = (!gx.lang.emptyObject(sFormatedValue)) ? gx.html.encodeCaseFormat(sFormatedValue, nFormat) : this.applyPicture(gx.html.encodeCaseFormat(sValue, nFormat));
					this.extraAttributes = sTags;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.parentId = nParentId;
					this.hasTheme = bHasTheme;
					this.autoComplete = (nAutoComplete != 0);
					this.autoCorrection = (nAutoCorrection != 0);
					this.value = sValue;
					this.domainName = sDomType;
				}

				this.applyPicture = function (value) {
					var vStruct = this.vStruct;
					if (!gx.lang.emptyObject(vStruct) && !gx.lang.emptyObject(vStruct.pic) && !gx.lang.emptyObject(vStruct.type)) {
						switch (vStruct.type) {
							case 'int':
								return gx.num.formatNumber(value, vStruct.dec, vStruct.pic, vStruct.len, vStruct.sign, true);
							case 'decimal':
								return gx.num.formatNumber(value, vStruct.dec, vStruct.pic, vStruct.len, vStruct.sign, true);
							case 'char':
								return value;
								//case 'date':
								//	return this.OldDate( ctrlName, varName);
								//case 'dtime':
								//	return this.OldDateTime( ctrlName, varName);
							default:
								return value;
						}
					}
					else
						return value;
				}

				this._getHtml = function () {
					var sSize = '';
					var sOStyle = '';
					if (this.width == 0) {
						if (this.colSize)
							this.width = this.colSize;
						else
							this.width = this.maxLength;
						this.widthUnit = 'chr';
					}
					if (this.width > 0) {
						if (this.widthUnit == 'chr')
							sSize = ' size="' + this.width + '"';
						else
							this.style = this.style + ';width: ' + this.width + this.widthUnit + ';';
					}
					if (this.height > 0 && this.heightUnit != 'row')
						this.style = this.style + ';height: ' + this.height + this.heightUnit + ';';
					sOStyle = this.style;
					this.style = this.style + (!this.visible ? ';display:none;' : '');
					if (this.rtEnabled || this.enabled) {
						if ((this.dataType == gx.types.date) || (this.dataType == gx.types.dateTime)) {
							this.append('<div');
							this.tagAtt('id', this.id + '_dp_container');
							this.tagAtt('class', 'dp_container');
							if (this.style != '')
								this.tagAtt('style', 'white-space:nowrap;display:inline;width:auto;');
							this.append('>');
						}
						this.append('<input');
						if (this.isPassword == true)
							this.tagAtt('type', 'password');
						else {
							this.tagAtt('type', this.inputType);
							if (this.step && (this.inputType == 'number' || this.inputType == 'range')) {
								this.tagAtt('step', this.step);
								if (this.inputType == 'search')
									this.extraAttributes += ' onsearch="this.onchange();"';
							}
						}
						this.tagAtt('id', this.id)
						this.tagAtt('name', this.id);
						this.tagAtt('value', (this.dataType == gx.types.numeric) ? gx.text.ltrim(this.formattedValue) : this.formattedValue);
						this.append(sSize);
						if (this.title != '')
							this.tagAtt('title', this.title);
						if (this.placeholder != '')
							this.tagAtt('placeholder', this.placeholder);
						if (!this.autoComplete)
							this.tagAtt('autocomplete', 'off');
						this.tagAtt('spellcheck', this.autoCorrection.toString());
						if (this.inputType != 'date' && this.inputType != 'datetime' && this.inputType != 'datetime-local')
							this.tagAtt('maxlength', this.maxLength);
						if (this.cssClass != '')
							this.tagAtt('class', this.cssClass);
						var rowStyle = this.style;
						if (this.column.align != '')
							rowStyle += ";text-align:" + this.column.align;
						var displayProperty = (!this.enabled && this.rtEnabled) ? ';display:none;' : '';
						rowStyle += displayProperty;
						if (rowStyle != '')
							this.tagAtt('style', rowStyle);
						this.append(this.extraAttributes);
						this.append('>');
						if ((this.dataType == gx.types.date) || (this.dataType == gx.types.dateTime)) {
							var validStruct = this.grid.parentObject.getValidStructFld(this.id);
							if (validStruct.dp != undefined) {
                                if (validStruct.dp.f == 0) {
                                    this.append('<img');
                                    this.tagAtt('src', gx.ajax.getImageUrl(gx, 'datepickerImage'));
                                    this.tagAtt('id', this.id + '_dp_trigger');
                                    displayProperty = (!this.enabled && this.rtEnabled || !this.visible) ? ';display:none;' : '';
                                    this.tagAtt('style', 'cursor: pointer' + displayProperty);
                                    this.tagAtt('title', 'Date selector');
                                    this.append('>');
                                }
                                this.append('</div>');
								this.grid.addDatepickerToSetup({ CtrlId: this.id, Grid: this.gridId, Row: this.gridRow });
							}
						} else
							gx.html.controls.specificDomainCtrls(this);
					}
					if (!this.enabled) {
						var ClassHTML = '';
						if (!this.rtEnabled)
							this.grid.addHiddenControl(this.id, this.value);
						if (!this.hasTheme)
							ClassHTML = this.cssClass;
						else {
							if (this.parentId == 0) {
								if (this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
									ClassHTML = 'Readonly' + this.cssClass;
								else
									ClassHTML = this.cssClass;
							}
							else {
								if (this.roClass != '' && this.roClass.indexOf('Readonly') != 0)
									ClassHTML = 'Readonly' + this.roClass;
								else
									ClassHTML = this.roClass;
							}
						}
						var sEventJsCode = '';
						if (this.format != gx.html.controls.formats.RAW_HTML) {
							sOStyle = sOStyle + ((!this.visible) ? ';display:none;' : '');
							this.append('<span');
							this.append(this.extraAttributes);
							if (ClassHTML != '')
								this.tagAtt('class', ClassHTML);
							if (sOStyle != '')
								this.tagAtt('style', sOStyle);
							if (this.title != '')
								this.tagAtt('title', this.title);
							this.tagAtt('id', 'span_' + this.id);
							this.append('>');
							sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, null, this.grid, this.row);
							gx.html.controls.startAnchor(this, sEventJsCode, this.usrOnclick, this.link, this.linkTarget);
						}
						if (!this.isPassword) {
							this.append(this.formattedValue);
						}
						else {
							var maxLen = gx.lang.emptyObject(this.maxLength) ? 3 : parseInt(this.maxLength);
							for (var i = 0; i < maxLen; i++)
								this.append('*');
						}
						if (this.format != gx.html.controls.formats.RAW_HTML) {
							gx.html.controls.endAnchor(this, sEventJsCode, this.usrOnclick, this.link);
							this.append('</span>');
						}
						if (this.format == gx.html.controls.formats.RAW_HTML)
							gx.html.processCode(this.buffer.toString(), false);

						gx.html.controls.specificDomainCtrls(this);
					}
				}
			},

			multipleLineEdit: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.multipleLineEdit;

				this.setProperties = function (sCtrlName, sLinkURL, sTags, nFormat, nVisible, nEnabled, nRTEnabled, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sColumnClass, nLength, nAutoresize, sLinkTarget, sPlaceholder, nAutoCorrection, bSendHidden, sDomType, sValue) {
					this.id = sCtrlName;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.rtEnabled = (nRTEnabled != 0);
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.maxLength = nLength;
					this.extraAttributes = sTags;
					this.autoresize = (nAutoresize != 0);
					this.format = nFormat;
					this.link = sLinkURL;
					this.linkTarget = sLinkTarget;
					this.placeholder = sPlaceholder;
					this.value = sValue;
					this.autoCorrection = (nAutoCorrection != 0);
					this.domainName = sDomType;
				}


				this._getHtml = function () {
					this.style = this.style + ((!this.visible || (!this.enabled && this.rtEnabled)) ? ';display:none;' : '');
					if (this.rtEnabled || this.enabled) {
						this.append('<textarea');
						if (this.placeholder != '')
							this.tagAtt('placeholder', this.placeholder);
						this.tagAtt('spellcheck', this.autoCorrection.toString());
						if (this.widthUnit == 'chr')
							this.tagAtt('cols', this.width);
						else
							this.style = this.style + ';width: ' + this.width + this.widthUnit;
						if (this.heightUnit == 'row')
							this.tagAtt('rows', this.height);
						else
							this.style = this.style + ';height: ' + this.height + this.heightUnit;
						this.tagAtt('id', this.id);
						this.tagAtt('name', this.id);
						this.tagAtt('maxlength', this.maxLength);
						this.append('onkeyup = "return gx.evt.checkMaxLength(this,' + this.maxLength + ',event);"');
						this.append('onkeydown = "return gx.evt.checkMaxLength(this,' + this.maxLength + ',event);"');
						if (this.cssClass != '')
							this.tagAtt('class', this.cssClass);
						if (this.style != '')
							this.tagAtt('style', this.style);
						if (this.title != '')
							this.tagAtt('title', this.title);
						this.append(this.extraAttributes);
						this.append('>');
						this.append(this.value);
						this.append('</textarea>');
					}
					if (!this.enabled) {
						var sOStyle = (!this.visible ? 'display:none;' : '');
						if (!this.autoresize)
							sOStyle += 'overflow="hidden";';
						if (!this.rtEnabled)
							this.grid.addHiddenControl(this.id, this.value);
						if (this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
							this.cssClass = 'Readonly' + this.cssClass;
						this.append('<span ');
						this.append(this.extraAttributes);
						if (this.cssClass != '')
							this.tagAtt('class', this.cssClass);
						if (sOStyle != '')
							this.tagAtt('style', sOStyle);
						if (this.title != '')
							this.tagAtt('title', this.title);
						this.tagAtt('id', 'span_' + this.id);
						this.append('>');
						gx.html.controls.startAnchor(this, '', '', this.link, this.linkTarget);
						this.append(gx.html.encodeCaseFormat(this.value, this.format, true));
						gx.html.controls.endAnchor(this, '', '', this.link);
						gx.html.controls.specificDomainCtrls(this);

						this.append('</span>');
					}
				}


			},

			blob: function (id, width, height, cssClass, title, dislplay, contentType) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.blob;
				this.display = dislplay || 0;
				this.contentType = contentType || 'text/html';
				this.url = '';
				this.parameters = '';

				this.setProperties = function (sInternalName, sValue, sContenttype, bHasFiletypeatt, sLinkTarget, sObjecttagparameters, nDisplay, nEnabled, nVisible, sAlternateText, sTooltipText, nBorderWidth,
									   nAutoresize, nWidth, nWidthUnit, nHeight, nHeightUnit, nVerticalSpace, nHorizontalSpace, nJScriptCode, sUserOnClickCode, sEventName, sStyleString, sClassString, sColumnClass,
									   sInputTags, sDisplayTags, sJsDynCode, sURL) {
					this.id = sInternalName;
					this.value = sValue;
					this.contentType = sContenttype || 'text/html';
					this.linkTarget = sLinkTarget;
					this.parameters = sObjecttagparameters;
					this.display = nDisplay;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.alt = sAlternateText;
					this.title = sTooltipText;
					this.borderWidth = nBorderWidth;
					this.autoresize = (nAutoresize != 0);
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.vSpace = nVerticalSpace;
					this.hSpace = nHorizontalSpace;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.extraAttributes = sInputTags;
					this.extraDisplayAttributes = sDisplayTags;
					this.jsDynCode = sJsDynCode;
					this.url = gx.util.resolveUrl(sURL);
				}

				this._getHtml = function () {
					var ClassHTML = '';
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					this.append('<table');
					this.tagAtt('border', 0);
					this.tagAtt('cellpadding', 0);
					this.tagAtt('cellspacing', 0);
					this.tagAtt('style', 'margin:' + this.vSpace + 'px ' + this.hSpace + 'px;');
					if (this.title != '')
						this.tagAtt('title', this.title);
					this.append('><tr><td>');
					var imgType = (this.contentType.toLowerCase().indexOf('image/') != -1);
					if (this.display == 0) {
						if (imgType) {
							this.append('<img');
							if (this.alt != '')
								this.tagAtt('alt', this.alt);
							if (this.url == '' || this.url == gx.util.resourceUrl(gx.basePath + gx.staticDirectory))
								this.url = gx.ajax.getImageUrl(gx, 'blankImage');
							this.tagAtt('src', this.url);
						}
						else {
							this.append('<object');
							this.tagAtt('type', this.contentType);
							if (this.url == '')
								this.url = 'about:blank';
							this.tagAtt('data', this.url);
						}
						this.tagAtt('id', 'Object_' + this.id);
						this.style = this.style + 'display:block;';
						if (this.width != 0 && !this.autoresize)
							this.style = this.style + 'width:' + this.width + this.widthUnit + ';';
						if (this.height != 0 && !this.autoresize)
							this.style = this.style + 'height:' + this.height + this.heightUnit + ';';
						this.tagAtt('style', this.style);
						if (this.cssClass != '')
							ClassHTML = 'BlobContent' + this.cssClass;
						else
							ClassHTML = this.cssClass;
						if (!this.enabled && this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
							ClassHTML = 'Readonly' + ClassHTML;
						this.tagAtt('class', ClassHTML);
						this.append(this.extraDisplayAttributes);
						this.append('>');
						if (imgType)
							this.append('</img>');
						else {
							this.append(this.parameters);
							this.append('</object>');
						}
					}
					else if (this.display == 1) {
						this.append('<a');
						this.tagAtt('id', 'Link_' + this.id);
						if (this.url != '')
							this.style = this.style + 'display:block;';
						else
							this.style = this.style + 'display:none;';
						this.tagAtt('style', this.style);
						this.tagAtt('href', this.url);
						this.tagAtt('type', this.contentType);
						if (this.linkTarget != '')
							this.tagAtt('target', this.linkTarget);
						this.append('><img');
						this.tagAtt('border', '0');
						this.tagAtt('src', gx.ajax.getImageUrl(gx, 'downloadImage'));
						this.append('></a>');
					}
					this.append('</td></tr><tr><td>');
					if (this.enabled) {
						var inputStyle = '';
						if (!gx.lang.emptyObject(this.value))
							gx.dom.form().encoding = 'multipart/form-data';
						// File inputs inside grids must be reused between refreshes if we want to keep the selected value, as it cannot
						// be assigned programatically for security reasons.
						// This is specially important in transactions, where the user can select a value in a row and then add another row.
						// As the grid is completely refreshed with each added row, if we want to remember the value the user selected in a
						// previous row, we must reuse the original input element.
						var inputEl = gx.dom.el(this.id);
						if (this.grid && this.grid.parentObject.isTransaction() && inputEl && this.value === inputEl.value) {
							var hookId = this.id + "_hook";
							this.append('<div');
							this.tagAtt('id', hookId);
							this.append('>');
							this.append('</div>');
							this.grid.addControlToReuse({ el: inputEl, hookId: hookId });
						}
						else {
							this.append('<input');
							this.tagAtt('type', 'file');
							this.tagAtt('id', this.id);
							this.tagAtt('name', this.id);
							if (!this.visible)
								inputStyle = inputStyle + 'display:none;';
							if (this.width != 0)
								inputStyle = inputStyle + 'width:' + this.width + ';';
							this.tagAtt('style', inputStyle);
							this.tagAtt('value', this.value);
							if (this.cssClass != '')
								ClassHTML = 'BlobInput' + this.cssClass;
							else
								ClassHTML = this.cssClass;
							if (!this.enabled && this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
								ClassHTML = 'Readonly' + ClassHTML;
							this.tagAtt('class', ClassHTML);
							if (imgType)
								this.tagAtt('accept', this.contentType);
							this.append(this.extraAttributes);
							this.append('>');
						}
					}
					this.append('</td></tr></table>');
				}
			},

			radio: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.radio;
				this.vertical = true;
				this.possibleValues = [];
				//this.valueIndex = 2;
				this.setProperties = function (radRObjCtrl, sCtrlName, sTooltipText, nVisible, nEnabled, nRadioColumns, nOrientation, sStyleString, sClassString, sColumnClass, nJScriptCode, sUserOnClickCode, sEventName, sTags, sValue) {
					this.possibleValues = radRObjCtrl.v || [];
					this.id = sCtrlName;
					this.title = sTooltipText;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.columns = nRadioColumns;
					this.orientation = nOrientation;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.extraAttributes = sTags;
					this.value = sValue;
				}

				this._getHtml = function () {
					if (this.dataType == gx.types.numeric)
						this.value = gx.text.trim(this.value.toString());
					var ClassHTML = 'gx-radio-button ';
					if (!this.enabled && this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
						ClassHTML += 'Readonly' + this.cssClass;
					else
						ClassHTML += this.cssClass;
					var sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, null, this.grid, this.row);
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					if (this.orientation == 1)
						this.append('<table');
					else
						this.append('<span ');
					this.tagAtt('class', ClassHTML);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.append('>');
					var idxCol = 0;
					var len = this.possibleValues.length;
					for (var i = 0; i < len; i++) {
						var item = this.possibleValues[i];
						var itemValue = item[0];
						var itemDesc = item[1];
						if (this.orientation == 1) {
							if (this.columns > 1)
								idxCol = (idxCol + 1) % this.columns;
							if (idxCol == 0)
								this.append('<tr>');
							this.append('<td>');
						}
						var sId = this.id + "_" + i;
						
						this.append('<label>');						
						this.append('<input');
						this.tagAtt('type', 'radio');
						this.tagAtt('id', sId);
						this.tagAtt('name', this.id);
						this.tagAtt('value', itemValue);
						if (this.title != '')
							this.tagAtt('title', this.title);
						var isChecked = (gx.text.trim(this.value.toString()) == gx.text.trim(itemValue.toString()));
						if (isChecked)
							this.append(' checked');
						if (!this.enabled)
							this.append(' disabled');
						this.append(this.extraAttributes);
						gx.html.controls.onJSEvent(this, 'gxoch0', sEventJsCode, this.usrOnclick);
						this.append('>');						
						this.append(itemDesc);
						this.append('</label>');						
						if (this.orientation == 1) {
							this.append('</td>');
							if (idxCol == 0)
								this.append('</tr>');
						}
					}
					if (this.orientation == 1)
						this.append('</table>');
					else
						this.append('</span>');
				}
			},

			comboBox: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.comboBox;
				this.rows = 1;
				this.possibleValues = [];

				this.setProperties = function (cmbCObjCtrl, sCtrlName, nRows, sUserOnClickCode, nJScriptCode, sEventName, sType, sTooltipText, nVisible, nEnabled, nRTEnabled, nFormat, nWidth, nWidthUnit, nHeight, nHeightUnit, sStyleString, sClassString, sColumnClass, sTags, sFormatedValue, bSendHidden, sValue) {
					this.possibleValues = cmbCObjCtrl.v || [];
					this.id = sCtrlName;
					this.title = sTooltipText;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.rtEnabled = (nRTEnabled != 0);
					this.rows = nRows;
					this.format = nFormat;
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.formattedValue = sFormatedValue;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.extraAttributes = sTags;
					this.value = sValue;
				}

				this._getHtml = function () {
					if (this.dataType == gx.types.numeric)
						this.value = gx.text.trim(this.value.toString());
					if (this.width > 0)
						this.style = this.style + ';width: ' + this.width + this.widthUnit;
					if (this.height > 0)
						this.style = this.style + ';height: ' + this.height + this.heightUnit;
					var sOStyle = this.style + ' ;overflow:hidden;';
					this.style = this.style + ((!this.visible || !this.enabled && this.rtEnabled) ? ';display:none;' : '');
					if (this.enabled || this.rtEnabled) {
						var sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, null, this.grid, this.row);
						this.append('<select');
						if (this.rows > 1)
							this.tagAtt('size', this.rows);
						this.tagAtt('id', this.id);
						this.tagAtt('name', this.id);
						if (this.title != '')
							this.tagAtt('title', this.title);
						if (this.cssClass != '')
							this.tagAtt('class', this.cssClass);
						if (this.style != '')
							this.tagAtt('style', this.style);
						if (!this.enabled) {
							this.append(' disabled');
							gx.util.addOnce(gx.disabledControls, this.id, this.id);
						}
						this.append(this.extraAttributes);
						gx.html.controls.onJSEvent(this, 'gxoch0', sEventJsCode, this.usrOnclick);
						this.append('>');
						var len = this.possibleValues.length;
						for (var i = 0; i < len; i++) {
							var item = this.possibleValues[i];
							this.append('<option');
							this.tagAtt('value', item[0]);
							if (gx.text.trim(item[0].toString()) == gx.text.trim(gx.lang.htmlDecode(this.value.toString())))
								this.append(' selected');
							this.append('>');
							this.append(item[1]);
							this.append('</option>');
						}
						this.append('</select>');
					}
					if (!this.enabled) {
						if (!this.rtEnabled)
							this.grid.addHiddenControl(this.id, this.value);
						var ClassHTML = '';
						if (this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
							ClassHTML = 'Readonly' + this.cssClass;
						else
							ClassHTML = this.cssClass;
						sOStyle = sOStyle + ((!this.visible) ? ';display:none;' : '');
						this.append('<span ');
						this.tagAtt('id', 'span_' + this.id);
						if (this.title != '')
							this.tagAtt('title', this.title);
						if (ClassHTML != '')
							this.tagAtt('class', ClassHTML);
						if (sOStyle != '')
							this.tagAtt('style', sOStyle);
						this.append(this.extraAttributes);
						this.append('>');
						var len = this.possibleValues.length;
						for (var i = 0; i < len; i++) {
							var item = this.possibleValues[i];
							if (gx.text.trim(item[0].toString()) == gx.text.trim(gx.lang.htmlDecode(this.value.toString()))) {
								this.append(item[1]);
								break;
							}
						}
						this.append('</span>');
					}
				}
			},

			listBox: function (id, width, height, cssClass, title, rows) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.listBox;
				this.rows = rows;
			},

			checkBox: function (id, width, height, cssClass, title, caption, checkedValue, uncheckedValue) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.checkBox;
				this.caption = caption || '';
				this.checkedValue = checkedValue;
				this.uncheckedValue = uncheckedValue;

				this.setProperties = function (sCtrlName, sTooltipText, nVisible, nEnabled, sCheked, sCaption, sStyleString, sClassString, sColumnClass, sTags, sValue) {
					this.id = sCtrlName;
					this.title = sTooltipText;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.checkedValue = sCheked;
					this.caption = sCaption;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.extraAttributes = sTags;
					this.value = sValue;
				}

				this._getHtml = function () {
					if (this.dataType == gx.types.numeric) {
						this.value = gx.text.trim(this.value.toString());
						this.checkedValue = gx.text.trim(this.checkedValue.toString());
					}
					var ClassHTML = this.cssClass;
					if (!this.enabled && this.cssClass != '' && this.cssClass.indexOf('Readonly') != 0)
						ClassHTML = 'Readonly' + this.cssClass;
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					this.append('<label>');					
					this.append('<span ');
					if (ClassHTML != '')
						this.tagAtt('class', ClassHTML);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.append('><input');
					this.tagAtt('id', this.id);
					this.tagAtt('type', 'checkbox');					
					this.tagAtt('name', this.id);
					var isChecked = (this.value.toString() == this.checkedValue.toString());
					if (isChecked) {
						this.append(' checked');
						this.tagAtt('value', this.checkedValue);
					}
					else
						this.tagAtt('value', this.uncheckedValue);
					if (this.title != '')
						this.tagAtt('title', this.title);
					if (!this.enabled)
						this.append(' disabled');
					this.append(this.extraAttributes);
					this.append('>');										
					this.append(this.caption);									
					this.append('</span>');
					this.append('</label>');
				}
			},

			imageReadOnly: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.image;
				this.alt = '';

				this.setProperties = function (sInternalName, sLinkURL, sLinkTarget, sAccesskey, sThemeName, nVisible, nEnabled, sAlternateText, sTooltipText, nBorderWidth, nAutoresize, nWidth, nWidthUnit, nHeight, nHeightUnit, nVerticalSpace,
									   nHorizontalSpace, nJScriptCode, sUserOnClickCode, sEventName, sStyleString, sClassString, sColumnClass, sAlign, sTags, sUseMap, sJsDynCode, sImageURL) {
					this.id = sInternalName;
					this.accessKey = sAccesskey;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.alt = sAlternateText;
					this.title = sTooltipText;
					this.borderWidth = nBorderWidth;
					this.autoresize = (nAutoresize != 0);
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.vSpace = nVerticalSpace;
					this.hSpace = nHorizontalSpace;
					this.link = sLinkURL;
					this.linkTarget = sLinkTarget;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.align = sAlign;
					this.extraAttributes = sTags;
					this.useMap = sUseMap;
					this.jsDynCode = sJsDynCode;
					this.imageUrl = sImageURL;
					this.value = sImageURL;
				}

				this._getHtml = function () {
					this.grid.addHiddenControl(this.id, this.imageUrl);
					if (this.eventName != '' && gx.text.endsWith(this.eventName, ".'"))
						this.eventName = this.eventName.replace(".'", "."+this.gridRow+"'");
					var sCapAKey = gx.util.accessKey(this.title);
					this.title = gx.util.accessKeyCaption(this.title);
					if (sCapAKey != '')
						this.accessKey = sCapAKey;
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					var sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, this.jsDynCode, this.grid, this.row);
					if (sEventJsCode != '') {
						this.append('<input');
						this.tagAtt('type', 'image');
						this.tagAtt('src', this.value);
						this.tagAtt('name', this.id);
						gx.html.controls.onJSEvent(this, 'onclick', sEventJsCode + 'return false;', this.usrOnclick);
					}
					else {
						if (this.enabled && this.link != '')
							gx.html.controls.startAnchor(this, sEventJsCode, this.usrOnclick, this.link, this.linkTarget);
						this.append('<img');
						this.tagAtt('src', this.value);
					}
					if (!this.enabled)
						this.append(' disabled');
					if (this.accessKey != '')
						this.tagAtt('accesskey', this.accessKey);
					this.tagAtt('id', this.id);
					if (this.vSpace != 0)
						this.tagAtt('vspace', this.vSpace);
					if (this.hSpace != 0)
						this.tagAtt('hspace', this.hSpace);
					if (this.align != '')
						this.tagAtt('align', this.align);
					if (this.cssClass == '' || this.borderWidth > 0) {
						this.tagAtt('border', this.borderWidth);
						if (this.cssClass != '')
							this.style = this.style + ';border-width: ' + this.borderWidth;
					}
					if (this.alt != '')
						this.tagAtt('alt', this.alt);
					if (this.title != '')
						this.tagAtt('title', this.title);
					if (this.width > 0)
						this.style = this.style + ';width: ' + this.width + this.widthUnit;
					if (this.height > 0)
						this.style = this.style + ';height: ' + this.height + this.heightUnit;
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					if (this.style != '')
						this.tagAtt('style', this.style);
					if (this.useMap != '')
						this.tagAtt('usemap', this.useMap);
					if (this.extraAttributes)
						this.append(this.extraAttributes);
					this.append('>');
					if (this.enabled && this.link != '' && sEventJsCode == '')
						gx.html.controls.endAnchor(this, sEventJsCode, this.usrOnclick, this.link);
				},

				this._persistValue = function () {
					if (this.grid.parentObject.GXValidFnc[this.column.gxId].v2v)
						this.grid.parentObject.GXValidFnc[this.column.gxId].v2v(this.imageUrl);
				}
			},

			multimedia: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.multimedia;
				this.setProperties = function (sInternalName, nDisplay, nVisible, nEnabled, nAutoresize, nWidth, nWidthUnit, nHeight, nHeightUnit, nJScriptCode, sUserOnClickCode, sEventName, sStyleString, sClassString, sColumnClass, sInputTags, sVideoTags, sJsDynCode, nReadOnly, bIsBlob, sMultimediaURL) {
					this.id = sInternalName;
					this.display = (nDisplay != 0);
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.autoresize = (nAutoresize != 0);
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.extraInputAttributes = sInputTags;
					this.jsDynCode = sJsDynCode;
					this.readOnly = (nReadOnly != 0);
					this.isBlob = gx.lang.gxBoolean(bIsBlob);
					this.multimediaUrl = sMultimediaURL;
					this.value = gx.util.resolveUrl(sMultimediaURL);
				};

			

				this.startMultimediaUploadControl = function (id, visible, width, style) {
					var styleAtt = (style || "") + (visible ? "" : "display:none;");
					if (width > 0)
						style += "width:" + width;
					var html = ['<div id="', id, '_ct" class="gx-multimedia-upload" style="', styleAtt, '">'];
					return html.join('');
				};

				this.endMultimediaUploadControl = function (id, url, tooltip, width, widthUnit, height, heightUnit, userOnClick, eventName, style, cssClass, align, inputAttributes, readOnly, isBlob, accept) {
					var buffer = [],
						fileInputEl = gx.html.multimediaUpload.getInputFileEl(this.id),
						uriChecked = 'checked', 
						fileChecked = '', 
						uriValue = url,
						idParts = id.match(/([\w]+)(_\d{4})$/),
						gxiId = idParts[1] + "_GXI" + idParts[2];
				
					if (isBlob || isBlob === undefined) {
						uriChecked = ''
						fileChecked = 'checked';
						uriValue = '';
					}
					var html = [
								'<div id="', id, '_ct_fields" class="fields-ct">',
									'<label class="option">',
										'<input name="', id, 'Option" type="radio" value="file" ', fileChecked, '/>',
										gx.getMessage("GXM_uploadfileoption"),
									'</label>',
									'<label class="option">',
										'<input name="', id, 'Option" type="radio" value="uri" ', uriChecked, '/>',
										gx.getMessage("GXM_uploadurioption"),
									'</label>',
									'<input type="text" class="field ', cssClass, '" id="', gxiId, '" name="', gxiId, '" value="', uriValue, '" ', inputAttributes, ' />'
					];
					buffer.push(html.join(''));

					if (fileInputEl)
						html = ['<div id="', id, '_hook"></div>'];
					else
						html = ['<input type="file" class="field ', cssClass, '" id="', id, '" name="', id, '" accept="', accept, '" ', inputAttributes, '/>'];
					buffer.push(html.join(''));

					html = ['</div>',
							'</div>'
					];
					buffer.push(html.join(''));

					return buffer.join('');
				};

				this.getPreviewHtml = function () {
					var className = this.cssClass ? "Readonly" + this.cssClass : "",
						href = this.value ? ' href="' + this.value + '"' : "",
						id = this.readOnly || !this.enabled ? this.id : "";
					var html = ['<a target="_blank"', href, '>',
									'<span id="', id, '" class="', className, ' ', this.placeHolderClass, '" title="', gx.getMessage("GXM_multimediaalttext"), '"></span>',
								'</a>'];
					return html.join('');
				};

				this._getHtml = function () {
					if (!this.readOnly && this.enabled) {
						this.append(this.startMultimediaUploadControl(this.id, this.visible, this.width, this.style));
						this.append('<a class="action change-action" gxfocusable="1" href=""' + this.extraInputAttributes + '>' + gx.getMessage("GXM_multimediachange") + '</a>');
						this.append('<a gxfocusable="1" href="" class="action clear-action"></a>');
					}
					else {
						this.grid.addHiddenControl(this.id, this.multimediaUrl);
					}

					this.append(this.getPreviewHtml());

					if (!this.readOnly && this.enabled) {
						this.append(this.endMultimediaUploadControl(this.id, this.value, "", this.width, this.widthUnit, this.height, this.heightUnit, this.usrOnclick, this.eventName, this.style, this.cssClass, "", this.extraInputAttributes, this.readOnly, this.isBlob, this.accept));

						var fileInputEl = gx.html.multimediaUpload.getInputFileEl(this.id);
						if (this.grid && this.grid.parentObject.isTransaction() && fileInputEl)
							this.grid.addControlToReuse({ el: fileInputEl, hookId: this.id + "_hook" });
					}
				};

				this._persistValue = function () {
					if (this.grid.parentObject.GXValidFnc[this.column.gxId].v2v)
						this.grid.parentObject.GXValidFnc[this.column.gxId].v2v(this.multimediaUrl);
				};
			},

			image: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.image;
				this.alt = '';
				this.innerImage = new gx.html.controls.imageReadOnly();
				this.placeHolderClass = 'gx-image-placeholder';

				this.setProperties = function (sInternalName, sLinkURL, sLinkTarget, sAccesskey, sThemeName, nVisible, nEnabled, sAlternateText, sTooltipText, nBorderWidth, nAutoresize, nWidth, nWidthUnit, nHeight, nHeightUnit, nVerticalSpace,
					nHorizontalSpace, nJScriptCode, sUserOnClickCode, sEventName, sStyleString, sClassString, sColumnClass, sAlign, sInputTags, sImageTags, sUseMap, sJsDynCode, nReadOnly, bIsBlob, bIsAttribute, sImageURL) {
					this.id = sInternalName;
					this.accessKey = sAccesskey;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.alt = sAlternateText;
					this.title = sTooltipText;
					this.borderWidth = nBorderWidth;
					this.autoresize = (nAutoresize != 0);
					this.width = nWidth;
					this.widthUnit = nWidthUnit;
					this.height = nHeight;
					this.heightUnit = nHeightUnit;
					this.vSpace = nVerticalSpace;
					this.hSpace = nHorizontalSpace;
					this.link = sLinkURL;
					this.linkTarget = sLinkTarget;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.columnClass = sColumnClass;
					this.align = sAlign;
					this.extraInputAttributes = sInputTags;
					this.extraImageAttributes = sImageTags;
					this.useMap = sUseMap;
					this.jsDynCode = sJsDynCode;
					this.readOnly = (nReadOnly != 0);
					this.isBlob = gx.lang.gxBoolean(bIsBlob);
					this.isAttribute = gx.lang.gxBoolean(bIsAttribute);
					this.multimediaUrl = sImageURL;
					this.value = gx.util.resolveUrl(sImageURL);
					this.themeName = sThemeName;
					this.className = bIsAttribute && sClassString ? "Readonly" + sClassString : sClassString;
					var gridData = this.getGridData();
					this.updateinnerImageProperties();
					this.innerImage.setGridData(gridData);
					this.innerImage.column = this.column;
				};

				this.updateinnerImageProperties = function () {
					this.innerImage.setProperties(this.id, this.link, this.linkTarget, this.accessKey, this.themeName, this.visible,
					this.enabled, this.alt, this.title, this.borderWidth, this.autoresize, this.width, this.heightUnit,
					this.height, this.heightUnit, this.vSpace,
					this.hSpace, this.jsScrCode, this.usrOnclick, this.eventName, this.style, this.className, this.columnClass, 
					this.align, this.extraImageAttributes, this.useMap, this.jsDynCode, this.value);
				}

				this.getPreviewHtml = function () {
					var imgUrl = this.value;
					var className = this.cssClass ? "Readonly" + this.cssClass : "",
						href = this.value ? ' href="' + this.value + '"' : "";
					var html = ['<a target="_blank"', /*href,*/'>',
									'<img id="Object_', this.id, '" class="', className, '" alt="', this.alt, '" src="', imgUrl, '" />',
									'<span class="', this.placeHolderClass, '"></span>',
								'</a>'];
					return html.join('');
				};

				this._getHtml = function () {
					if (this.readOnly || !this.enabled) {
						this.buffer = this.innerImage.buffer;
						this.updateinnerImageProperties();
						this.innerImage._getHtml();
					}
					else {
						this.append(this.startMultimediaUploadControl(this.id, this.visible, this.width, this.style));

						this.append('<a class="action change-action" gxfocusable="1" href=""' + this.extraInputAttributes + '>' + gx.getMessage("GXM_multimediachange") + '</a>');
						this.append('<a gxfocusable="1" href="" class="action clear-action"></a>');

						this.append(this.getPreviewHtml());

						this.append(this.endMultimediaUploadControl(this.id, this.value, this.title, this.width, this.widthUnit, this.height, this.heightUnit, this.usrOnclick, this.eventName, this.style, this.cssClass, this.align, this.extraInputAttributes, this.readOnly, this.isBlob, "image/*"));

						var fileInputEl = gx.html.multimediaUpload.getInputFileEl(this.id);
						if (this.grid && this.grid.parentObject.isTransaction() && fileInputEl)
							this.grid.addControlToReuse({ el: fileInputEl, hookId: this.id + "_hook" });
					}
				};
			},

			video: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.video;
				this.accept = "video/*";
				this.placeHolderClass = 'gx-video-placeholder';
			},

			audio: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.audio;
				this.accept = "audio/*";
				this.placeHolderClass = 'gx-audio-placeholder';
			},

			textBlock: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.textBlock;

				this.setProperties = function (sInternalName, sLinkURL, sLinkTarget, sUserOnClickCode, sEventName, sTags, sClassString, nJScriptCode, sTooltipText, nVisible, nEnabled, nFormat, sCaption) {
					this.id = sInternalName;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.format = nFormat;
					this.title = sTooltipText;
					this.link = sLinkURL;
					this.linkTarget = sLinkTarget;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName;
					this.extraAttributes = sTags;
					this.cssClass = sClassString;
					this.value = gx.text.replaceAll(sCaption, '�', "'");
				}

				this._getHtml = function () {
					var sStyle;
					if (this.format != gx.html.controls.formats.RAW_HTML) {
						if (this.format == gx.html.controls.formats.HTML) {
							sStyle = ((this.visible) ? ';display:inline;' : ';display:none;') + this.extraAttributes;
							this.append('<div ');
						} else {
							sStyle = ((this.visible) ? '' : ';display:none;') + this.extraAttributes;
							this.append('<span ');
						}
						this.tagAtt('id', this.id);
						if (this.cssClass != '')
							this.tagAtt('class', this.cssClass);
						this.tagAtt('gxformat', this.format);
						if (sStyle != '')
							this.tagAtt('style', sStyle);
						if (this.title != '')
							this.tagAtt('title', this.title);
						this.append('>');
					}
					var sEventJsCode = '';
					if (this.enabled) {
						sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, null, this.grid, this.row);
						gx.html.controls.startAnchor(this, sEventJsCode, this.usrOnclick, this.link, this.linkTarget);
					}
					else
						sEventJsCode = '';
					this.append(gx.html.encodeCaseFormat(this.value, this.format));
					if (this.enabled)
						gx.html.controls.endAnchor(this, sEventJsCode, this.usrOnclick, this.link);
					if (this.format == gx.html.controls.formats.HTML)
						this.append('</div>');
					else if (this.format != gx.html.controls.formats.RAW_HTML)
						this.append('</span>');
					if (this.format == gx.html.controls.formats.RAW_HTML)
						gx.html.processCode(this.buffer.toString(), false);
				}
			},

			button: function (id, width, height, cssClass, title, buttonStyle) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.button;
				this.caption = '';
				this.buttonStyle = buttonStyle || 'rounded';

				this.setProperties = function (sCtrlName, sJsCode, sUserOnClickCode, nJScriptCode, sTooltipText, sAccesskey, sStyleString, sClassString, nVisible, nEnabled, sBorderStyle, sEventName,
									   sTags, sJsDynCode, nReset, sCaption) {
					this.reset = nReset;
					this.id = sCtrlName;
					this.title = sTooltipText;
					this.accessKey = sAccesskey;
					this.style = sStyleString;
					this.cssClass = sClassString;
					this.visible = (nVisible != 0);
					this.enabled = (nEnabled != 0);
					this.buttonStyle = sBorderStyle;
					this.jsScrCode = nJScriptCode;
					this.usrOnclick = sUserOnClickCode;
					this.eventName = sEventName + (this.jsScrCode == 5 ? "+'" + this.gridRow + "'": "");
					this.extraAttributes = sTags;
					this.jsCode = sJsCode;
					this.jsDynCode = sJsDynCode;
					this.caption = sCaption;
				}

				this._getHtml = function () {
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					var sClassRoundedBtn = 'BaseRBtn ' + 'R' + this.cssClass;
					if (this.buttonStyle == 'rounded') {
						this.cssClass = 'BtnText';
						this.append('<span ');
						this.tagAtt('onclick', 'gx.evt.doClick(\'' + this.id + '\', event);');
						if (this.style != '')
							this.tagAtt('style', this.style);
						this.tagAtt('class', sClassRoundedBtn);
						this.append('><span class="BtnLeft"><span class="BtnRight"><span class="BtnBackground">');
					}
					this.append('<input');
					var inputType = 'button';
					if (this.reset == 1)
						inputType = 'submit';
					else if (this.reset == 0)
						inputType = 'reset';
					this.tagAtt('type', inputType);
					var sCapAKey = gx.util.accessKey(this.caption);
					this.caption = gx.util.accessKeyCaption(this.caption);
					if (sCapAKey == '') {
						sCapAKey = gx.util.accessKey(this.title);
						this.title = gx.util.accessKeyCaption(this.title);
					}
					if (sCapAKey != '')
						this.accessKey = sCapAKey;
					this.tagAtt('name', this.id);
					this.tagAtt('value', this.caption);
					if (this.title != '')
						this.tagAtt('title', this.title);
					if (this.accessKey != '')
						this.tagAtt('accesskey', this.accessKey);
					this.tagAtt('class', this.cssClass);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.tagAtt('gxevent', this.eventName);
					if (!this.enabled)
						this.append(' disabled');
					var sEventJsCode = gx.html.controls.eventJSCode(this.jsScrCode, this.eventName, this.jsDynCode, this.grid, this.row);
					sEventJsCode = this.jsCode + sEventJsCode;
					gx.html.controls.onJSEvent(this, 'onclick', sEventJsCode + 'return false;', this.usrOnclick);
					this.append(this.extraAttributes);
					this.append('>');
					if (this.buttonStyle == 'rounded')
						this.append('</span></span></span></span>');
				}
			},

			grid: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.grid;
				this.containerName = '';

				this.setProperties = function (sContainerName) {
					this.containerName = sContainerName;
					this.id = this.grid.gxComponentContext + this.containerName + 'Div_' + this.gridRow;
				}

				this._getHtml = function () {
					this.append('<div');
					this.tagAtt('id', this.id);
					this.append('></div>');
				}
			},

			userControl: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.userControl;
				this.containerName = '';

				this.setProperties = function (sContainerName, nVisible) {
					this.containerName = sContainerName;
					this.id = this.containerName;
					this.visible = (nVisible != 0);
				}

				this._getHtml = function () {
					this.append('<div');
					this.tagAtt('id', this.id);
					this.tagAtt('class', 'gx_usercontrol');
					this.append('></div>');
					this.grid.addUsercontrolToDraw({ r: this.gridRow, c: this.column });
				}
			},

			userControlContainer: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.userControlContainer;
				this.parentName = '';
				this.containerName = '';

				this.setProperties = function (sParentName, sContainerName) {
					this.parentName = sParentName;
					this.containerName = sContainerName;
					this.id = this.parentName + this.containerName + '_' + this.gridRow;
				}

				this._getHtml = function () {
					this.append('<div');
					this.tagAtt('id', this.id);
					this.tagAtt('style', 'display:none;');
					this.tagAtt('class', 'gx_usercontrol_child');
					this.append('>');
				}
			},

			webComponent: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.webComponent;
				this.controlName = '';
				this.content = '';

				this.setProperties = function (sControlName) {
					this.controlName = sControlName;
					var cmpData = this.grid.parentObject.getComponentData(this.controlName);
					var cmpPrefix = cmpData.Prefix
					var cmpCtrlId = this.grid.gxComponentContext + 'gxHTMLWrp' + cmpPrefix + this.gridRow;
					var cmpCtrl = gx.dom.el(cmpCtrlId);
					var cmpHtml = '';
					this.grid.addOldComponent(this.gridRow, this.grid.gxComponentContext + cmpPrefix + this.gridRow);
					if (cmpCtrl != null) {
						var hookId = cmpCtrlId + '_hook';
						this.grid.addComponentToDraw({ create: false, existingEl: hookId, el: cmpCtrlId });
						cmpCtrlId = hookId;
					}
					else {
						if (!gx.lang.emptyObject(gx.csv.lastEvtResponse) && !gx.lang.emptyObject(gx.csv.lastEvtResponse.gxComponents)) {
							var tmpHtml = gx.csv.lastEvtResponse.gxComponents[cmpCtrlId];
							if (!gx.lang.emptyObject(tmpHtml)) {
								cmpHtml = gx.html.cleanHtmlRefs(tmpHtml);
								var cmpName = gx.fn.getHidden(this.grid.gxComponentContext + cmpPrefix + this.gridRow);
								if (!cmpName)
									cmpName = cmpData.GXClass;
								if (!gx.lang.emptyObject(cmpName))
									this.grid.addComponentToDraw({ load: true, n: cmpName.toLowerCase(), p: this.grid.gxComponentContext + cmpPrefix + this.gridRow, c: tmpHtml });
							}
							else
								cmpHtml = '';
						}
					}
					this.id = cmpCtrlId;
					this.content = cmpHtml;
				}

				this._getHtml = function () {
					this.append('<div');
					this.tagAtt('id', this.id);
					this.tagAtt('class', gx.GxObject.WEBCOMPONENT_CLASS_NAME);
					this.append('>');
					this.append(this.content);
					this.append('</div>');
				}
			},

			embeddedPage: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.embeddedPage;
				this.align = 'center';
				this.scrollbars = 'auto';
				this.borderStyle = '1';

				this.setProperties = function (sControlName, sSrc, nVisible, nWidth, sWidthUnit, nHeight, sHeightUnit, nBorderStyle, sAlign, sTooltipText, sScroll) {
					this.id = sControlName;
					this.value = sSrc;
					this.visible = (nVisible != 0);
					this.width = nWidth;
					this.widthUnit = sWidthUnit;
					this.height = nHeight;
					this.heightUnit = sHeightUnit;
					this.borderStyle = nBorderStyle;
					this.align = sAlign;
					this.title = sTooltipText;
					this.scrollbars = sScroll;
				}

				this._getHtml = function () {
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					this.append('<iframe');
					this.tagAtt('frameborder', this.borderStyle);
					this.tagAtt('align', this.align);
					this.tagAtt('scrolling', this.scrollbars);
					if (this.height > 0)
						this.tagAtt('height', this.height + this.heightUnit);
					if (this.width > 0)
						this.tagAtt('width', this.width + this.widthUnit);
					if (this.title != '')
						this.tagAtt('title', this.title);
					if (this.id != '') {
						this.tagAtt('id', this.id);
						this.tagAtt('name', this.id);
					}
					if (this.value != '')
						this.tagAtt('src', this.value);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.append('>');
					this.append('</iframe>');
				}
			},

			table: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.table;
				this.cellSpacing = '';
				this.cellPadding = '';
				this.backColor = '';

				this.setProperties = function (sCtrlName, nVisible, sClassString, sBackground, nBackcolor, nBordercolor, sAlign, sTooltiptext,
																	nBorderwidth, nCellpadding, nCellspacing, nHeight, nWidth, sRules, sHeightUnit, sWidthUnit) {
					this.id = sCtrlName;
					this.visible = (nVisible != 0);
					this.cssClass = sClassString;
					this.background = sBackground;
					this.backColor = nBackcolor;
					this.borderColor = nBordercolor;
					this.align = sAlign;
					this.title = sTooltiptext;
					this.borderWidth = nBorderwidth;
					this.cellPadding = nCellpadding;
					this.cellSpacing = nCellspacing;
					this.height = nHeight;
					this.width = nWidth;
					this.rules = sRules;
					this.heightUnit = sHeightUnit;
					this.widthUnit = sWidthUnit;
					this.style = "";
				}

				this._getHtml = function () {
					this.style = this.style + ((this.visible) ? '' : ';display:none;');
					if (this.background != '') {
						this.background = gx.util.resourceUrl(gx.basePath + gx.staticDirectory + this.background, true);
						this.style = this.style + 'background-image: url(' + this.background + ');';
					}
					if (this.backColor != '') {
						var col = parseInt(this.backColor);
						if (!isNaN(col))
							col = gx.color.html(col).Html;
						else
							col = this.backColor;
						this.style = this.style + 'background-color: ' + col + ';';
					}
					if (this.borderColor != '') {
						var col = parseInt(this.borderColor);
						if (!isNaN(col))
							col = gx.color.html(col).Html;
						else
							col = this.borderColor;
						this.style = this.style + 'border-color: ' + col + ';';
					}
					if (this.borderWidth != '')
						this.style = this.style + 'border-width: ' + this.borderWidth + ';';
					if (this.height != '')
						this.style = this.style + 'height: ' + this.height + this.heightUnit + ';';
					if (this.width != '')
						this.style = this.style + 'width: ' + this.width + this.widthUnit + ';';
					this.append('<table');
					this.tagAtt('id', this.id);
					this.tagAtt('align', this.align);
					if (this.borderWidth != '')
						this.tagAtt('border', this.borderWidth);
					if (this.cellSpacing !== '')
						this.tagAtt('cellspacing', this.cellSpacing);
					if (this.cellPadding !== '')
						this.tagAtt('cellpadding', this.cellPadding);
					if (this.rules != '' && this.rules != 'none')
						this.tagAtt('rules', this.rules);
					if (this.title != '')
						this.tagAtt('title', this.title);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.append('>');
				}
			},

			row: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.row;
				this.backColor = '';
				this.borderColor = '';
				this.align = '';
				this.verticalAlign = '';
				this.isFreestyleRow = false;
				this.oncontextmenu = '';

				this.setProperties = function (sCtrlName, sClassString, sStyleString) {
					if (sClassString) {
						if (this.ownCssClass) {
							this.cssClass = sClassString + (this.ownCssClass ? (' ' + this.ownCssClass) : '');
						}
						else {
							this.cssClass = sClassString;
						}
					}
					this.style = sStyleString;
				}

				this._getHtml = function () {
					this.append('<tr');
					if (this.id != '')
						this.tagAtt('id', this.id);
					if (this.isFreestyleRow)
						this.tagAtt('gxrow', this.gridRow);
					if (this.backColor != '')
						this.style = this.style + 'background-color:' + this.backColor + ';';
					if (this.borderColor != '')
						this.tagAtt('bordercolor', this.borderColor);
					if (this.align != '')
						this.tagAtt('align', this.align);
					if (this.verticalAlign != '')
						this.tagAtt('valign', this.verticalAlign);
					if (this.style != '')
						this.tagAtt('style', this.style);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					if (this.oncontextmenu != '')
						this.tagAtt('oncontextmenu', this.oncontextmenu);
					this.append('>');
				}
			},

			cell: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.cell;
				this.style = '';
				this.background = '';
				this.backColor = '';
				this.borderColor = '';
				this.align = '';
				this.verticalAlign = '';
				this.colSpan = '';
				this.rowSpan = '';

				this.setProperties = function (sBackground, sStyleString) {
					this.background = sBackground;
					if (sStyleString && sStyleString != "") {
						var idx = sStyleString.indexOf('style=');
						if (idx > 0) {
							this.style = sStyleString.substring(8);
							this.style = this.style.substring(0, this.style.length - 1) + ';';
						}
					}
				}

				this._getHtml = function () {
					this.append('<td');
					if ((typeof (this.width) != 'undefined') && (this.width != 0))
						this.tagAtt('width', this.width);
					if ((typeof (this.height) != 'undefined') && (this.height != 0))
						this.tagAtt('height', this.height);
					if (this.background != '')
						this.tagAtt('background', this.background);
					if (this.backColor != '')
						this.style += 'background-color:' + this.backColor + ';';
					if (this.style != '')
						this.tagAtt('style', this.style);
					if (this.borderColor != '')
						this.tagAtt('bordercolor', this.borderColor);
					if (this.align != '')
						this.tagAtt('align', this.align);
					if (this.verticalAlign != '')
						this.tagAtt('valign', this.verticalAlign);
					if (this.colSpan != '')
						this.tagAtt('colspan', this.colSpan);
					if (this.rowSpan != '')
						this.tagAtt('rowspan', this.rowSpan);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					this.append('>');
				}
			},

			responsiveRow: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this._getHtml = function () {
					this.append('<div');
					if (this.id != '')
						this.tagAtt('id', this.id);
					if (this.isFreestyleRow)
						this.tagAtt('gxrow', this.gridRow);
					if (this.backColor != '')
						this.style = this.style + 'background-color:' + this.backColor + ';';
					if (this.borderColor != '')
						this.tagAtt('bordercolor', this.borderColor);
					if (this.align != '')
						this.tagAtt('align', this.align);
					if (this.verticalAlign != '')
						this.tagAtt('valign', this.verticalAlign);
					if (this.style != '')
						this.tagAtt('style', this.style);
					this.tagAtt('class', "row " + (this.cssClass || ""));
					if (this.oncontextmenu != '')
						this.tagAtt('oncontextmenu', this.oncontextmenu);
					this.append('>');
				}
			},

			responsiveCell: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this._getHtml = function () {
					this.append('<div');
					if ((typeof (this.width) != 'undefined') && (this.width != 0))
						this.tagAtt('width', this.width);
					if ((typeof (this.height) != 'undefined') && (this.height != 0))
						this.tagAtt('height', this.height);
					if (this.background != '')
						this.tagAtt('background', this.background);
					if (this.backColor != '')
						this.style += 'background-color:' + this.backColor + ';';
					if (this.style != '')
						this.tagAtt('style', this.style);
					if (this.borderColor != '')
						this.tagAtt('bordercolor', this.borderColor);
					if (this.align != '')
						this.tagAtt('align', this.align);
					if (this.verticalAlign != '')
						this.tagAtt('valign', this.verticalAlign);
					if (this.colSpan != '')
						this.tagAtt('colspan', this.colSpan);
					if (this.rowSpan != '')
						this.tagAtt('rowspan', this.rowSpan);
					this.tagAtt('class', "col-xs-12 " + (this.cssClass || ""));
					this.append('>');
				}
			},

			group: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.group;
				this.caption = '';

				this.setProperties = function (sCtrlName, sCaption, nVisible, nWidth, sWidthUnit, nHeight, sHeightUnit, sClassString, sTags) {
					this.id = sCtrlName;
					this.caption = sCaption;
					this.visible = (nVisible != 0);
					this.width = nWidth;
					this.widthUnit = sWidthUnit;
					this.height = nHeight;
					this.heightUnit = sHeightUnit;
					this.cssClass = sClassString;
					this.extraAtts = sTags;
				}


				this._getHtml = function () {
					this.append('<fieldset');
					this.tagAtt('id', this.id);
					this.tagAtt('name', this.id);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					var styleStr = '-moz-border-radius:3pt;';
					if (this.width != '0')
						styleStr += 'width: ' + this.width + this.widthUnit + ';';
					if (this.height != '0')
						styleStr += 'height: ' + this.height + this.heightUnit + ';';
					if (!this.visible)
						styleStr += 'display:none;';
					this.tagAtt('style', styleStr);
					if (this.extraAtts != '')
						this.append(this.extraAtts);
					this.append('>');
					this.append('<legend');
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass + 'Title');
					this.append('>');
					this.append(gx.getMessage(this.caption));
					this.append('</legend>');
				};
			},

			div: function (id, width, height, cssClass, title) {
				this.base(id, width, height, cssClass, title);

				this.type = gx.html.controls.types.div;

				this.setProperties = function (sCtrlName, nVisible, nWidth, sWidthUnit, nHeight, sHeightUnit, sClassString, sTags) {
					this.id = sCtrlName;
					this.visible = (nVisible != 0);
					this.width = nWidth;
					this.widthUnit = sWidthUnit;
					this.height = nHeight;
					this.heightUnit = sHeightUnit;
					this.cssClass = sClassString;
					this.extraAtts = sTags;
				}

				this._getHtml = function () {
					var style = ((this.visible) ? '' : ';display:none;');
					if (this.height != '')
						style = style + 'height: ' + this.height + this.heightUnit + ';';
					if (this.width != '')
						style = style + 'width: ' + this.width + this.widthUnit + ';';
					this.append('<div');
					this.tagAtt('id', this.id);
					if (this.cssClass != '')
						this.tagAtt('class', this.cssClass);
					if (style != '')
						this.tagAtt('style', style);
					if (this.extraAtts != '')
						this.append(this.extraAtts);
					this.append('>');
				}
			},

			specificDomainCtrls: function (Ctrl) {
				if (Ctrl.domainName == gx.domains.component && Ctrl.enabled == 0) {
					var displayProperty = (Ctrl.enabled) ? ';display:none;' : '';
					var compId = Ctrl.id + '_comp_trigger';
					var componentImg = gx.util.resourceUrl(gx.basePath + gx.staticDirectory + "Resources\\" + gx.theme + "\\Select.png", false);
					Ctrl.append('<img');
					Ctrl.tagAtt('src', componentImg);
					Ctrl.tagAtt('id', compId);
					Ctrl.tagAtt('class', '');
					Ctrl.tagAtt('style', displayProperty + " margin-left:2px; cursor:pointer;");
					Ctrl.tagAtt('onclick', "gx.popup.openUrl('" + Ctrl.value + "')");
					Ctrl.append('/>');

					var Deps = [];
					Deps.push(Ctrl.column.gxId);
					//gx.fn.attachCtrl(compId, {isPrompt:false, wc:gx.O.CmpContext, mp:gx.O.IsMasterPage, controls:Deps} );
				}
				else {
					if (Ctrl.dataType == gx.types.geolocation) {
						var displayProperty = (!Ctrl.enabled) ? ';display:none;' : '';
						var geoImg = gx.util.resourceUrl(gx.basePath + gx.staticDirectory + "Resources\\locateMe.png", true);
						var geoLocMeId = Ctrl.id + '_geoLocMe';
						Ctrl.append('<img');
						Ctrl.tagAtt('src', geoImg);
						Ctrl.tagAtt('id', geoLocMeId);
						Ctrl.tagAtt('class', 'GeoLocOption');
						Ctrl.tagAtt('style', displayProperty);
						Ctrl.tagAtt('onclick', 'gx.geolocation.getMyPosition(this)');
						Ctrl.append('>');

						var Deps = [];
						Deps.push(Ctrl.column.gxId);
						//gx.fn.attachCtrl(geoLocMeId, {isPrompt:false, wc:gx.O.CmpContext, mp:gx.O.IsMasterPage, controls:Deps} );
						/*this.append('<img');
						this.tagAtt('src', 'Resources\\locatePoint.png');
						this.tagAtt('id', this.id + '_geoLocPoint');
						this.tagAtt('class', 'GeoLocOption');	
						this.tagAtt('onclick', 'gx.geolocation.locatePoint(this,"' + this.id + '")');
						this.append('>') ;*/
					}
				}
			},

			_init: function () {
				gx.lang.inherits(this.singleLineEdit, this.htmlControl);
				gx.lang.inherits(this.multipleLineEdit, this.singleLineEdit);
				gx.lang.inherits(this.blob, this.htmlControl);
				gx.lang.inherits(this.radio, this.htmlControl);
				gx.lang.inherits(this.comboBox, this.htmlControl);
				gx.lang.inherits(this.listBox, this.comboBox);
				gx.lang.inherits(this.checkBox, this.htmlControl);
				gx.lang.inherits(this.imageReadOnly, this.htmlControl);
				gx.lang.inherits(this.textBlock, this.htmlControl);
				gx.lang.inherits(this.button, this.htmlControl);
				gx.lang.inherits(this.grid, this.htmlControl);
				gx.lang.inherits(this.userControl, this.htmlControl);
				gx.lang.inherits(this.userControlContainer, this.htmlControl);
				gx.lang.inherits(this.webComponent, this.htmlControl);
				gx.lang.inherits(this.embeddedPage, this.htmlControl);
				gx.lang.inherits(this.table, this.htmlControl);
				gx.lang.inherits(this.row, this.htmlControl);
				gx.lang.inherits(this.cell, this.htmlControl);
				gx.lang.inherits(this.group, this.htmlControl);
				gx.lang.inherits(this.multimedia, this.htmlControl);
				gx.lang.inherits(this.image, this.multimedia);
				gx.lang.inherits(this.video, this.multimedia);
				gx.lang.inherits(this.audio, this.multimedia);
				gx.lang.inherits(this.div, this.htmlControl);
				gx.lang.inherits(this.responsiveRow, this.row);
				gx.lang.inherits(this.responsiveCell, this.cell);
			}
		}
	};
})(gx.$);
/* END OF FILE - ..\js\gxhtml.js - */
/* START OF FILE - ..\GenCommon\js\util\observable.js - */
gx.util.Observable = function(){
	return {
		observers: [],
		
		addObserver: function( evtName, obj, func, cfg) {
			new gx.thread.Mutex( this, this.addObserverSync, arguments);
		},
		
		addObserverSync: function( evtName, obj, func, cfg) {
			if (this.indexOf( evtName, obj, func) < 0)
			{
				this.observers.push({e:evtName, o:obj, f:func, cfg: cfg});
			}
		},
		
		deleteObserver: function( evtName, obj, func) {
			new gx.thread.Mutex( this, this.deleteObserverSync, [evtName, obj, func]);
		},
		
		deleteObserverSync: function( evtName, obj, func) {
			var idx = this.indexOf( evtName, obj, func);
			if (idx >= 0)
			{
				this.observers.removeAt(idx);
			}
		},
		
		removeAll: function() {
			this.observers = [];
		},
		
		indexOf: function( evtName, obj, func) {
			var len = this.observers.length;
			for (var i=0; i<len; i++)
			{
				var obs = this.observers[i];
				if (obs.e == evtName && obs.o == obj && obs.f == func)
				{
					return i;
				}
			}
			return -1;
		},
		
		notify: function( evtName, parms) {
			if (!parms)
			{
				parms = [];
			}
			var len = this.observers.length;
			var toRemove = [];
			for (var i=0; i<len; i++)
			{
				var obs = this.observers[i];
				if (obs.e == evtName && !obs.removed)
				{
					try
					{
						if (obs.cfg && obs.cfg.single)
						{
							obs.removed = true;
							toRemove.push(i);	
						}
						obs.f.apply( obs.o, parms);
					}
					catch(e)
					{
						gx.dbg.logEx(e, 'gxfx.js', 'gx.obs.notify');
					}
				}
			}
			if (toRemove.length > 0)
			{
				for (var i=toRemove.length-1; i>=0;i--)
				{
					this.observers.removeAt(toRemove[i]);
				}
			}
		}
	};
};
/* END OF FILE - ..\GenCommon\js\util\observable.js - */
/* START OF FILE - ..\js\gxfx.js - */
gx.fx = {
	delayedSuggest: function () {
		var len = gx.suggestControls.length;
		for (var C = 0; C < len; C++)
			this.installSuggest(gx.suggestControls[C], true);
	},

	installSuggest: function (Ctrl, force) {
		if (!force && document.readyState && document.readyState != "complete") {
			gx.suggestControls.push(Ctrl);
			return;
		}
		try {
			var vStruct = gx.O.getValidStructFld(Ctrl.id);
			if (vStruct && !gx.lang.emptyObject(vStruct.gxsgprm)) {
				var rowId = (vStruct.grid > 0) ? gx.fn.currentGridRowImpl(vStruct.grid) : 'main';
				var gxsgprm = vStruct.gxsgprm;
				if (!gxsgprm.installed) {
					gxsgprm.installed = {};
				}
				if (!gxsgprm.installed[rowId]) {
					gx.ajax.suggest(gxsgprm[1], Ctrl.id, gxsgprm[0], gxsgprm[3], gxsgprm[2]);
					gxsgprm.installed[rowId] = true;
				}
			}
		}
		catch (e) {
			gx.dbg.logEx(e, 'gxfx.js', 'installSuggest');
		}
	},

	updateSuggestParms: function (suggestParms) {
		if (suggestParms) {
			var len = suggestParms.length;
			for (var i = 0; i < len; i++) {
				var validStruct = gx.fn.validStruct(suggestParms[i]);
				if (validStruct && typeof (validStruct.c2v) == 'function')
					validStruct.c2v();
			}
		}
	},

	firesuggest: function (context, provider, typeahead, suggestParms) {
		this.updateSuggestParms(suggestParms);
		if (context.textbox.value) {
			provider.requestSuggestions(context.sdtParms, function () {
				if (provider.values)
					context.autosuggest(provider.values, typeahead);
				else
					context.hideSuggestions();
			});
		}
		delete gx.fx.suggestProcessing;
		gx.fx.obs.notify('gx.validation');
	},

	autoSuggestControl: function (oTextbox, oProvider, ControlRefresh, typeahead, suggestParms, sdtparms) {
		this.cur = -1;
		this.IFrameControl = null;
		this.layer = null;
		this.provider = oProvider;
		this.textbox = oTextbox;
		if (typeof (this.textbox.GXonblur) == 'undefined') this.textbox.GXonblur = oTextbox.onblur;
		this.ControlRefresh = ControlRefresh;
		this.typeahead = typeahead;
		this.suggestParms = suggestParms || [];
		this.sdtParms = sdtparms || [];

		this.requestSuggestions = function (context, provider, typeahead) {
			gx.fx.suggestProcessing = true;
			var suggestParms = this.suggestParms;
			if (this.timer)
				window.clearTimeout(this.timer);
			this.timer = window.setTimeout(function () { gx.fx.firesuggest(context, provider, typeahead, suggestParms) }, 400);
		}

		this.hideSuggestions = function () {
			if (this.IFrameControl)
				this.IFrameControl.style.visibility = 'hidden';
			this.layer.style.visibility = 'hidden';
		}

		this.highlightSuggestion = function (oSuggestionNode) {
			var len = this.layer.childNodes.length;
			for (var i = 0; i < len; i++) {
				var oNode = this.layer.childNodes[i];
				if (oNode == oSuggestionNode) {
					oNode.className = 'current';
				}
				else if (oNode.className == 'current') {
					oNode.className = '';
				}
			}
		}

		this.init = function () {
			var onkeyup = function (oEvent) {
				if (!oEvent) {
					oEvent = window.event;
				}
				this.handleKeyUp(oEvent);
			};

			var onkeydown = function (oEvent) {
				if (!oEvent) {
					oEvent = window.event;
				}
				this.handleKeyDown(oEvent);
			};

			var onblur = function () {
				this.hideSuggestions();
				this.textbox.GXonblur();
			};

			gx.evt.attach(this.textbox, "keyup", onkeyup.closure(this));
			gx.evt.attach(this.textbox, "keydown", onkeydown.closure(this));
			gx.evt.attach(this.textbox, "blur", onblur.closure(this));

			// This is a WA for a Firefox bug: https://bugzilla.mozilla.org/show_bug.cgi?id=354358
			if (gx.util.browser.isFirefox()) {
				gx.evt.attach(this.textbox, "input", onkeyup.closure(this));
			}

			this.createDropDown();
		}

		this.nextSuggestion = function () {
			var cSuggestionNodes = this.layer.childNodes;
			if (cSuggestionNodes.length > 0) {
				this.cur = (this.cur < cSuggestionNodes.length - 1) ? this.cur + 1 : 0;
				var oNode = cSuggestionNodes[this.cur];
				this.highlightSuggestion(oNode);
				this.pickvalue(oNode.firstChild.nodeValue);
			}
		}

		this.previousSuggestion = function () {
			var cSuggestionNodes = this.layer.childNodes;
			if (cSuggestionNodes.length > 0) {
				this.cur = (this.cur > 0) ? this.cur - 1 : cSuggestionNodes.length - 1;
				var oNode = cSuggestionNodes[this.cur];
				this.highlightSuggestion(oNode);
				this.pickvalue(oNode.firstChild.nodeValue);
			}
		}

		this.selectRange = function (iStart /*:int*/, iLength /*:int*/) {
			if (this.textbox.createTextRange) {
				var oRange = this.textbox.createTextRange();
				oRange.moveStart('character', iStart);
				oRange.moveEnd('character', iLength - this.textbox.value.length);
				oRange.select();
			}
			else if (this.textbox.setSelectionRange) {
				this.textbox.setSelectionRange(iStart, iLength);
			}
			if (gx.csv.stopOnError)
				this.textbox.focus();
		}

		this.showSuggestions = function (aSuggestions) {
			this.cur = -1;
			var oDiv = null;

			this.setupLayer();
			if (gx.dom.shouldPurge())
				gx.dom.purge(this.layer, true);
			this.layer.innerHTML = '';

			if (!this.IFrameControl) {
				var justCreated = false;
				var ifrId = 'gxAutosuggestIFrame';
				this.IFrameControl = gx.dom.byId(ifrId);
				if (!this.IFrameControl) {
					justCreated = true;
					this.IFrameControl = document.createElement('IFRAME');
					this.IFrameControl.src = 'about:blank';
					this.IFrameControl.id = ifrId;
				}
				this.IFrameControl.style.zIndex = 1;
				this.IFrameControl.style.visibility = 'hidden';
				this.IFrameControl.style.position = 'absolute';
				this.IFrameControl.frameBorder = '0';
				if (justCreated) {
					document.body.appendChild(this.IFrameControl);
				}
			}
			var len = aSuggestions.length;
			for (var i = 0; i < len; i++) {
				oDiv = document.createElement('div');
				oDiv.appendChild(document.createTextNode(aSuggestions[i].d));
				oDiv.style.width = this.textbox.offsetWidth;
				this.layer.appendChild(oDiv);
			}
			this.layer.style.left = this.getLeft() + 'px';
			this.layer.style.top = (this.getTop() + this.textbox.offsetHeight) + 'px';
			this.layer.style.visibility = 'visible';
			this.layer.style.zIndex = 2;
			this.IFrameControl.style.top = this.layer.style.top;
			this.IFrameControl.style.left = this.layer.style.left;
			this.IFrameControl.style.height = this.layer.offsetHeight;
			this.IFrameControl.style.width = this.layer.offsetWidth;
			this.IFrameControl.style.visibility = 'visible';
		}

		this.typeAhead = function (sSuggestion) {
			if (this.textbox.createTextRange || this.textbox.setSelectionRange) {
				var iLen = this.textbox.value.length;
				this.pickvalue(sSuggestion);
				var sLen = sSuggestion.length;
				if (iLen < sLen)
					this.selectRange(iLen, sLen);
			}
		}

		this.pickvalue = function (Value) {
			var len = this.aSuggestions.length;
			for (var i = 0; i < len; i++) {
				if (this.aSuggestions[i].d == Value) {
					this.textbox.value = Value;
					gx.evt.onchange_impl(this.textbox);
					return;
				}
			}
		}

		this.autosuggest = function (aSuggestions, bTypeAhead) {
			this.aSuggestions = aSuggestions;
			var sLen = this.aSuggestions.length;
			if (bTypeAhead && this.aSuggestions != null && sLen == 1) {
				this.typeAhead(this.aSuggestions[0].d);
				this.hideSuggestions();
			}
			else {
				if (this.textbox == gx.csv.lastControl && this.aSuggestions != null && sLen > 0) {
					if ((sLen == 1) && (this.aSuggestions[0].d != this.textbox) || (sLen > 1)) {
						this.showSuggestions(this.aSuggestions);
						return;
					}
				}
				this.hideSuggestions();
			}
		}

		this.createDropDown = function () {
			var ddId = 'gxAutosuggestElement';
			var justCreated = false;

			this.layer = gx.dom.byId(ddId);
			if (!this.layer) {
				justCreated = true;
				this.layer = document.createElement('div');
				this.layer.className = 'suggestions';
				this.layer.id = ddId;
			}
			this.setupLayer();
			if (justCreated) {
				document.body.appendChild(this.layer);
			}
		}

		this.setupLayer = function () {
			this.layer.style.visibility = 'hidden';
			this.layer.style.width = this.textbox.offsetWidth;

			this.layer.onmousedown =
			this.layer.onmouseup =
			this.layer.onmouseover = (function (oEvent) {
				oEvent = oEvent || window.event;
				var oTarget = gx.evt.source(oEvent);

				if (oEvent.type == 'mousedown') {
					gx.evt.cancel(oEvent, true);
					this.pickvalue(oTarget.firstChild.nodeValue);
					this.hideSuggestions();
					window.setTimeout(function () { gx.fn.setFocus(this.textbox) }, 100);
				}
				else if (oEvent.type == 'mouseover') {
					this.highlightSuggestion(oTarget);
				}
				else {
					this.textbox.focus();
				}
			}).closure(this);
		}

		this.getLeft = function () {
			var oNode = this.textbox;
			var iLeft = 0;

			while (oNode.tagName != 'BODY') {
				iLeft += oNode.offsetLeft;
				oNode = oNode.offsetParent;
			}
			oNode = this.textbox;
			while (oNode.tagName != 'BODY') {
				iLeft -= oNode.scrollLeft;
				oNode = oNode.parentNode;
			}
			return iLeft;
		}

		this.getTop = function () {
			var oNode = this.textbox;
			var iTop = 0;

			while (oNode.tagName != 'BODY') {
				iTop += oNode.offsetTop;
				oNode = oNode.offsetParent;
			}
			oNode = this.textbox;
			while (oNode.tagName != 'BODY') {
				iTop -= oNode.scrollTop;
				oNode = oNode.parentNode;
			}
			return iTop;
		}

		this.handleKeyDown = function (oEvent) {
			switch (oEvent.keyCode) {
			case 38://up arrow
				this.previousSuggestion();
				break;
			case 40: //down arrow 
				this.nextSuggestion();
				break;
			case 13: //enter
				this.hideSuggestions();
				break;
			}
		}

		this.handleKeyUp = function (oEvent /*:Event*/) {
			var iKeyCode = oEvent.keyCode;

			if (iKeyCode == 9) {
				this.hideSuggestions();
			}
			else {
				if (iKeyCode == 8 || iKeyCode == 46) {
					this.requestSuggestions(this, this.provider, false);
				}
				else {
					if (!(iKeyCode < 32 || (iKeyCode >= 33 && iKeyCode < 46) || (iKeyCode >= 112 && iKeyCode <= 123))) {
						this.requestSuggestions(this, this.provider, this.typeahead);
					}
				}
			}
		}

		this.init();
	},

	suggestProvider: function (ControlId, ControlRefresh, CtrlSvc) {
		this.requestSuggestions = function (sdtParms, callback, failCallback, query) {
			var i,
				sURL = gx.ajax.objectUrl() + '?',
				sParms = 'gxajaxSuggest_' + CtrlSvc,
				len = ControlId.length;

			for (i = 0; i < len; i++)
			{
				sParms += ',' + encodeURIComponent(eval(ControlId[i]));
			}
			sParms += ',' + encodeURIComponent(query === undefined ? gx.fn.getControlValue_impl(ControlRefresh) : query);
			len = sdtParms.length;
			for (i = 0; i < len; i++)
			{
				sParms += ',' + encodeURIComponent(eval(sdtParms[i]));
			}
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			
			gx.http.doCall({
				method: 'GET',
				url: sURL,
				handler: function(type, responseText) {
					var response = gx.json.evalJSON(responseText);
					this.values = gx.fx.returnSuggestValues(this.VarRefresh, response[0]);
					callback();
				},
				error: failCallback,
				obj: this
			});
		}
	},

	returnSuggestValues: function (Var, adata) {
		return adata;
	},

	addElement: function (arr, el, mindTypes) {
		if (this.elementExists(arr, el, mindTypes))
			return;
		var hashId = el.id;
		if (mindTypes === true)
			hashId += el.types.sort().join('');
		arr.splice(0, 0, el);
		arr[hashId] = el;
	},

	elementExists: function (arr, el, mindTypes) {
		var hashId = el.id;
		if (mindTypes === true)
			hashId += el.types.sort().join('');
		if (arr[hashId])
			return true;
		return false;
	},

	deleteElement: function (arr, ctrlId, types) {
		var hashId = ctrlId;
		if (types)
			hashId += types.sort().join('');
		var element = arr[hashId];
		if (element)
			delete arr[hashId];
		var len = arr.length;
		for (var i = 0; i < len; i++) {
			var curElem = arr[i];
			if (curElem.id == ctrlId) {
				if (types) {
					if (this.matchingTypes(types, curElem.types)) {
						arr.removeAt(i);
						break;
					}
				}
				else {
					arr.removeAt(i);
					break;
				}
			}
		}
		return arr;
	},

	matchingTypes: function (src, tgt) {
		var tLen = tgt.length;
		for (var i = 0; i < tLen; i++) {
			var found = false;
			var sLen = src.length;
			for (var j = 0; j < sLen; j++) {
				if (tgt[i].toLowerCase() == src[j].toLowerCase())
					found = true;
			}
			if (!found)
				return false;
		}
		return true;
	},

	findControl: function (evtCtrl, gxObj, ctrlId) {
		var ctrl = gx.dom.el(ctrlId);
		if (ctrl != null)
			return ctrl;
		ctrl = gx.dom.el('gxHTMLWrp' + ctrlId);
		if (ctrl != null)
			return ctrl;
		var cRegex = new RegExp('^' + ctrlId + '_(?:(?:[0-9]){4})+$');
		if (evtCtrl != null && cRegex.test(evtCtrl.id))
			return evtCtrl;
		return null;
	},

	isUnderMouse: function (Control) {
		var mx = gx.evt.mouse.x;
		var my = gx.evt.mouse.y;
		var targPos = gx.dom.position(Control);
		var targDims = gx.dom.dimensions(Control);
		if ((mx >= targPos.x) && (mx <= (targPos.x + targDims.w)) && (my >= targPos.y) && (my <= (targPos.y + targDims.h)))
			return true;
		else if (Control.tagName == "DIV" && targDims.w === 0 && targDims.h === 0 && Control.firstChild)//Textblocks with HTML Format are in a inline div
		{
			targPos = gx.dom.position(Control.firstChild);
			targDims = gx.dom.dimensions(Control.firstChild);
			if ((mx >= targPos.x) && (mx <= (targPos.x + targDims.w)) && (my >= targPos.y) && (my <= (targPos.y + targDims.h)))
				return true;
		}
		return false;
	},

	dom: {
		generics: [],
		dblclicks: [],

		getEventHandlers: function (evtType) {
			if (evtType == 'dblclick') {
				return this.dblclicks;
			}
			return this.generics;
		},

		addEventHandler: function (gxObj, evtType, ctrlId, handler) {
			ctrlId = gx.lang.emptyObject(gxObj) ? ctrlId : gxObj.CmpContext + ctrlId;
			var evtHandler = {
				id: evtType + ctrlId,
				cId: ctrlId,
				type: evtType,
				obj: gxObj,
				hdl: handler
			};
			var handlers = this.getEventHandlers(evtType);
			gx.fx.addElement(handlers, evtHandler, false);
		},

		raiseEvent: function (evtType, evtObj) {
			var evtCtrl = gx.evt.source(evtObj);
			var handlers = this.getEventHandlers(evtType);
			var len = handlers.length;
			for (var i = 0; i < len; i++) {
				var evtHandler = handlers[i];
				var ctrl = gx.fx.findControl(evtCtrl, evtHandler.obj, evtHandler.cId);
				if (ctrl != null) {
					if (gx.fx.isUnderMouse(ctrl)) {
						evtHandler.hdl.call(evtHandler.obj);
					}
				}
			}
		},

		highlight: function (control, color, time) {
			var gxColor = gx.color.fromRGB(color[0], color[1], color[2]);
			var oldColor = gx.dom.getStyle(control, 'backgroundColor');
			var wasTransparent = (oldColor == 'transparent' || oldColor == 'rgba(0, 0, 0, 0)');
			return {
				play: function () {
					control.style.backgroundColor = gxColor.Html;
					setTimeout(this.end, time);
				},

				end: function () {
					var endColor = oldColor;
					if (wasTransparent) {
						endColor = 'transparent';
					}
					control.style.backgroundColor = endColor;
				}
			};
		}
	},

	obs: new gx.util.Observable(),

	dnd: {
		obj: null,
		dragCtrl: null,
		clonCtrl: null,
		sources: [],
		targets: [],
		dropCtrl: null,
		noDropCtrl: null,
		toHdl: null,

		drag: function (gxObj, types, handler) {
			if (handler) {
				gx.evt.setEventRow(gxObj, this.dragCtrl);
				this.obj = handler.call(gxObj, this.dragCtrl);
				this.obj.gxDragTypes = types;
			}
		},

		drop: function (ctrl, gxObj, handler) {
			if (handler)
				handler.call(gxObj, ctrl, this.dragCtrl, this.obj);
		},

		noDrop: function () {
			var ctrl = this.noDropCtrl;
			if (ctrl != null) {
				if (ctrl.gxDndClassName)
					ctrl.className = ctrl.gxDndClassName + 'NoAcceptDrag';
			}
		},

		out: function () {
			var ctrl = this.dropCtrl;
			if (ctrl) {
				if (ctrl.gxClassName)
					ctrl.className = ctrl.gxClassName;
			}
			this.dropCtrl = null;
			ctrl = this.noDropCtrl;
			if (ctrl != null) {
				if (ctrl.gxClassName)
					ctrl.className = ctrl.gxClassName;
			}
			this.noDropCtrl = null;
		},

		over: function () {
			var ctrl = this.dropCtrl;
			if (ctrl != null) {
				if (ctrl.gxDndClassName)
					ctrl.className = ctrl.gxDndClassName + 'AcceptDrag';
			}
		},

		deleteClonControl: function () {
			if (this.clonCtrl != null)
				gx.dom.removeControlSafe(this.clonCtrl);
			this.clonCtrl = null;
		},

		restoreControl: function () {
			var ctrl = this.clonCtrl;
			if (ctrl != null) {
				if (this.toHdl == null) {
					ctrl.dropLeft = parseFloat(ctrl.style.left || '0');
					ctrl.dropTop = parseFloat(ctrl.style.top || '0');
					this.toHdl = setInterval('gx.fx.dnd.restoreControl()', 2);
				}
				if (this.controlRestored()) {
					clearInterval(this.toHdl);
					this.toHdl = null;
					this.deleteClonControl();
				}
				else {
					var newCoords = this.nextCoords();
					this.moveDragControl(newCoords.X, newCoords.Y);
				}
			}
		},

		nextCoords: function () {
			var ctrl = this.clonCtrl;
			var X = parseFloat(ctrl.style.left || '0');
			var Y = parseFloat(ctrl.style.top || '0');
			var diffX = 0;
			var diffY = 0;
			if (X >= Y) {
				diffX = X - 1;
				diffY = ctrl.dropTop - (((ctrl.dropTop - ctrl.originalTop) * (ctrl.dropLeft - diffX)) / (ctrl.dropLeft - ctrl.originalLeft));
			}
			else {
				diffY = Y - 1;
				diffX = ctrl.dropLeft - (((ctrl.dropTop - diffY) * (ctrl.dropLeft - ctrl.originalLeft)) / (ctrl.dropTop - ctrl.originalTop));
			}
			if (diffX <= ctrl.originalLeft)
				diffX = ctrl.originalLeft;
			if (diffY <= ctrl.originalTop)
				diffY = ctrl.originalTop;
			return { X: diffX, Y: diffY };
		},

		moveControl: function (Control) {
			if (this.clonCtrl == null) {
				var offset = 10;
				var ctrl = document.createElement("DIV");
				ctrl.style.position = "absolute";
				if (Control.gxDndClassName)
					ctrl.className = Control.gxDndClassName + 'Dragging';
				if (gx.dom.shouldPurge())
					gx.dom.purge(ctrl, true);
				ctrl.innerHTML = this.dragInfo();
				gx.fn.setOpacity(50, ctrl);
				document.body.appendChild(ctrl);
				ctrl.originalLeft = gx.evt.mouse.x - offset;
				ctrl.originalTop = gx.evt.mouse.y - offset;
				ctrl.diffLeft = offset;
				ctrl.diffTop = offset;
				this.clonCtrl = ctrl;
			}
			this.moveDragControl(gx.evt.mouse.x, gx.evt.mouse.y);
		},

		controlRestored: function () {
			var ctrl = this.clonCtrl;
			if (ctrl == null)
				return true;
			var X = parseFloat(ctrl.style.left || '0');
			var Y = parseFloat(ctrl.style.top || '0');
			var diffX = X - ctrl.originalLeft;
			var diffY = Y - ctrl.originalTop;
			if ((diffX <= 0) && (diffY <= 0))
				return true;
			return false;
		},

		moveDragControl: function (X, Y) {
			try {
				var ctrl = this.clonCtrl;
				if (ctrl != null) {
					ctrl.style.left = (X - ctrl.diffLeft) + 'px';
					ctrl.style.top = (Y - ctrl.diffTop) + 'px';
				}
			}
			catch (e) {
				this.deleteClonControl();
			}
		},

		dragInfo: function () {
			if (this.obj != null) {
				var lines = '';
				var dragStr = '';
				for (var prop in this.obj) {
					if (prop != "gxDragTypes") {
						var Lines = [lines];
						if (typeof (this.obj[prop]) == 'function')
							continue;
						dragStr += prop + ': ' + this.obj[prop] + '</br>';
						lines = Lines[0];
					}
					if (lines >= 5) {
						dragStr += '...';
						break;
					}
					lines++;
				}
				return dragStr;
			}
			return '';
		},

		deleteHandlers: function (gxObj) {
			gx.thread.Mutex(this, this.deleteHandlersSync, [gxObj]);
		},

		deleteHandlersSync: function (gxObj) {
			var tmp = [];
			var i;
			var len = this.sources.length;
			for (i = 0; i < len; i++) {
				var source = this.sources[i];
				if (source.obj != gxObj)
					tmp.push(source);
			}
			this.sources = tmp;
			tmp = [];
			len = this.targets.length;
			for (i = 0; i < len; i++) {
				var target = this.targets[i];
				if (target.obj != gxObj)
					tmp.push(target);
			}
			this.targets = tmp;
		},

		addSource: function (gxObj, ctrlId, cClass, dTypes, handler) {
			gx.thread.Mutex(this, this.addSourceSync, [gxObj, ctrlId, cClass, dTypes, handler]);
		},

		addSourceSync: function (gxObj, ctrlId, cClass, dTypes, handler) {
			ctrlId = gx.lang.emptyObject(gxObj) ? ctrlId : gxObj.CmpContext + ctrlId;
			var dragSource = {
				id: ctrlId,
				cssClass: cClass,
				types: dTypes,
				obj: gxObj,
				hdl: handler
			};
			gx.fx.addElement(this.sources, dragSource, false);
		},

		addTarget: function (gxObj, ctrlId, cClass, dTypes, handler) {
			gx.thread.Mutex(this, this.addTargetSync, [gxObj, ctrlId, cClass, dTypes, handler]);
		},

		addTargetSync: function (gxObj, ctrlId, cClass, dTypes, handler) {
			ctrlId = gx.lang.emptyObject(gxObj) ? ctrlId : gxObj.CmpContext + ctrlId;
			var dropTarget = {
				id: ctrlId,
				cssClass: cClass,
				types: dTypes,
				obj: gxObj,
				hdl: handler
			};
			gx.fx.addElement(this.targets, dropTarget, true);
		},

		deleteSource: function (ctrlId) {
			gx.thread.Mutex(this, this.deleteSourceSync, [ctrlId]);
		},

		deleteSourceSync: function (ctrlId) {
			this.sources = gx.fx.deleteElement(this.sources, ctrlId);
		},

		getSource: function (evtObj) {
			var evtCtrl = gx.evt.source(evtObj);
			var len = this.sources.length;
			for (var i = 0; i < len; i++) {
				var curSource = this.sources[i];
				this.dragCtrl = gx.fx.findControl(evtCtrl, curSource.obj, curSource.id);
				var ctrl = this.dragCtrl;
				if (ctrl != null) {
					ctrl.gxClassName = ctrl.className;
					ctrl.gxDndClassName = curSource.cssClass;
					if (gx.fx.isUnderMouse(ctrl))
						return curSource;
				}
			}
			this.dragCtrl = null;
			this.obj = null;
			return null;
		},

		getTarget: function (evtObj, types) {
			var evtCtrl = gx.evt.source(evtObj);
			var len = this.targets.length;
			for (var i = 0; i < len; i++) {
				var curTarget = this.targets[i];
				var Control = gx.fx.findControl(evtCtrl, curTarget.obj, curTarget.id);
				if (Control != null) {
					Control.gxClassName = Control.className;
					Control.gxDndClassName = curTarget.cssClass;
					if (gx.fx.isUnderMouse(Control)) {
						if (gx.fx.matchingTypes(types, curTarget.types)) {
							this.noDropCtrl = null;
							this.dropCtrl = Control;
							return curTarget;
						}
						else {
							this.out();
							this.noDropCtrl = Control;
							this.noDrop();
							return null;
						}
					}
				}
			}
			this.out();
			return null;
		}
	},

	notifications: {			
		queuedEvents: [],
		addTracker: function (gxObj, groupName, evtName, sTypes, handler, noWait) {		
			if (!gxObj.notifications) {
				gxObj.notifications = [];				
				gx.fx.obs.addObserver('gx.ws.onMessage', gxObj, gx.fx.notifications.notify.closure(gxObj), { single: false });
				gx.fx.obs.addObserver('gx.onafterevent', gxObj, gx.fx.notifications.fireQueuedEvents.closure(gxObj), { single: false });
			}
			gxObj.notifications[groupName || ""] = { gxO: gxObj, handler: handler, eventName: evtName, type: sTypes, noWait: noWait };
			gx.webSocket._init();
		},

		notify: function (msg) {			
			var data = gx.json.evalJSON(msg);	
			var groupName = data.GroupName || "";
			var obj = this.notifications[groupName];
			if (obj){
				gx.fx.notifications.queuedEvents.push({notifObj:obj, data:data});
				if (!obj.noWait && gx.evt.processing && !gx.csv.validating) {
					//'gx.onafterevent' will be called when postHandlerFullAjax is completed.
				} else {
					gx.fx.notifications.fireQueuedEvents();
				}
			}
		},
		
		fireQueuedEvents: function() {
			for (var i = 0; i <gx.fx.notifications.queuedEvents.length; i++) {
				var obj = gx.fx.notifications.queuedEvents[i];							
				if (!obj.executed) {
					gx.fx.notifications.queuedEvents.splice(i--, 1);
					var gxO = obj.notifObj.gxO;	
					obj.executed = true;
					if (!gx.lang.emptyObject(obj.data.Object) && obj.data.Object.toUpperCase() != gxO.ServerClass.toUpperCase()) {
						//Ignore notification for current object
						continue;
					}					
					var type = obj.notifObj.type;
					var evtName = obj.notifObj.eventName;
					if (evtName) {
						var isServerEvent = gxO.isServerEvent(evtName);
						var parm = {}; parm[type[0][0]] = obj.data;
						gxO.setEventParameters(obj.notifObj.type, parm);
						gx.evt.dispatcher.dispatch(gxO.getServerEventName(evtName), gxO, 0, 0, isServerEvent);
					}
					else {
						obj.notifObj.handler(obj.data);
					}
				}
			}			
		}				
	},

	ctx: {
		setters: [],
		trackers: [],

		deleteHandlers: function (gxObj) {
			gx.thread.Mutex(this, this.deleteHandlersSync, [gxObj]);
		},

		deleteHandlersSync: function (gxObj) {
			var i;
			var tmp = [];
			var len = this.setters.length;
			for (i = 0; i < len; i++) {
				var setter = this.setters[i];
				if (setter.obj != gxObj)
					tmp.push(setter);
			}
			this.setters = tmp;
			tmp = [];
			len = this.trackers.length;
			for (i = 0; i < len; i++) {
				var tracker = this.trackers[i];
				if (tracker.obj != gxObj)
					tmp.push(tracker);
			}
			this.trackers = tmp;
		},

		addSetter: function (gxObj, ctrlId, cClass, sTypes, handler) {
			gx.thread.Mutex(this, this.addSetterSync, [gxObj, ctrlId, cClass, sTypes, handler]);
		},

		addSetterSync: function (gxObj, ctrlId, cClass, sTypes, handler) {
			ctrlId = gx.lang.emptyObject(gxObj) ? ctrlId : gxObj.CmpContext + ctrlId;
			var setter = {
				id: ctrlId,
				cssClass: cClass,
				types: sTypes,
				obj: gxObj,
				hdl: handler
			};
			gx.fx.addElement(this.setters, setter, false);
		},

		addTracker: function (gxObj, sTypes, handler) {
			gx.thread.Mutex(this, this.addTrackerSync, [gxObj, sTypes, handler]);
		},

		addTrackerSync: function (gxObj, sTypes, handler) {
			var ctrlId = gxObj.CmpContext + gxObj.IsMasterPage.toString();
			var tracker = {
				id: ctrlId,
				cssClass: '',
				types: sTypes,
				obj: gxObj,
				hdl: handler
			};
			gx.fx.addElement(this.trackers, tracker, true);
		},

		deleteSetter: function (ctrlId) {
			gx.thread.Mutex(this, this.deleteSetterSync, [ctrlId]);
		},

		deleteSetterSync: function (ctrlId) {
			this.setters = gx.fx.deleteElement(this.setters, ctrlId);
		},

		notify: function (Control, setterTypes, ctxObj) {
			gx.thread.Mutex(this, this.notifySync, [Control, setterTypes, ctxObj]);
		},

		notifySync: function (Control, setterTypes, ctxObj) {
			if (Control && Control.forcedFocus) {
				Control.forcedFocus = false;
				return;
			}
			var i;
			var eo = gx.lang.emptyObject;			
			var callCtxScope = function(objContext, callback) {
				var gxOld = gx.O;
				gx.setGxO(objContext);	
				callback();
				gx.setGxO(gxOld);
			};
	
			var setterCtrl = null;
			if (eo(setterTypes) || eo(ctxObj)) {
				var settersQty = this.setters.length;
				for (i = 0; i < settersQty; i++) {
					var curSetter = this.setters[i];
					if (!eo(Control)) {
						if (Control.id == curSetter.id) {							
							callCtxScope.apply(this, [curSetter.obj, 
								function() {
									setterCtrl = Control;
									gx.evt.setEventRow(curSetter.obj, setterCtrl);
									setterTypes = curSetter.types;
									ctxObj = curSetter.hdl.call(curSetter.obj, setterCtrl);												
							}]);
							break;
						}
					}
					else {
						setterCtrl = gx.fx.findControl(null, curSetter.obj, curSetter.id);
						if (setterCtrl != null) {
							if (eo(setterCtrl.onfocus)) {
								if (gx.fx.isUnderMouse(setterCtrl)) {
									callCtxScope.apply(this, [curSetter.obj, 
										function() {
											gx.evt.setEventRow(curSetter.obj, setterCtrl);
											setterTypes = curSetter.types;
											ctxObj = curSetter.hdl.call(curSetter.obj, setterCtrl);
									}]);
									break;
								}
							}
						}
					}
				}
			}
			if (!eo(setterTypes) && (ctxObj || ctxObj === '')) {
				var trackersQty = this.trackers.length;
				for (i = 0; i < trackersQty; i++) {
					var curTracker = this.trackers[i];
					if (gx.fx.matchingTypes(setterTypes, curTracker.types)) {
						callCtxScope.apply(this, [curTracker.obj, 
							function() {						
								curTracker.hdl.call(curTracker.obj, null, setterCtrl, ctxObj);						
							}]);
					}
				}
			}
		}
	}
};

/* END OF FILE - ..\js\gxfx.js - */
/* START OF FILE - ..\js\gxtypes.js - */
gx.date = (function () {
	var ANSI_DATETIME_REGEX = /([0-9]{1,4})\/?-?([0-9]{1,2})\/?-?([0-9]{1,4})\s?T?([0-9]{1,2})?:?([0-9]{1,2})?:?([0-9]{1,2})?:?([0-9]{1,2})?\s?(AM|PM)?/i,
		ANSI_TIME_REGEX = /([0-9]{1,2}):?([0-9]{1,2})?:?([0-9]{1,2})?:?([0-9]{1,2})?\s?(AM|PM)?/i,
		ANSI_DATE_REGEX = new RegExp("^[0-9]{4}[\/-]{1}[0-9]{2}[\/-]{1}[0-9]{2}$"),
		EMPTY_DATE_REGEX = /^([ ]*([\/|\-][ ]*[\/|\-][ ]*((00|12)(:00(:00)?)?[ ]*(a|am)?)?)?)?[ ]*$/i;

	var EMPTY_DATE_VALUE = new Date(0, 0, 0, 0, 0, 0, 0);

	return {
		UTC_Offset: new Date().getTimezoneOffset(),

		clone: function () {
			return new Date(this.getTime());
		},

		equalsNoTime: function (d2) {
			if (this.getDay() == d2.getDay() && this.getMonth() == d2.getMonth() && this.getFullYear() == d2.getFullYear())
				return true;
			return false;
		},

		toJson: function () {
			var newdate = new gx.date.gxdate("");
			newdate.assign_date(this);
			return newdate.json();
		},

		gxdate: function (SDate, XSFmt) {
			this.json = function () {
				var oldTFmt = this.TimeFmt;
				this.TimeFmt = 24;
				var oldHTime = this.HasTimePart;
				var oldDTime = this.HasDatePart;
				this.HasTimePart = true;
				this.HasDatePart = true;
				var jsonDate = this.getStringWithFmt("Y4MD") + ' ' + this.getTimeString(true, true);
				this.TimeFmt = oldTFmt;
				this.HasTimePart = oldHTime;
				this.HasDatePart = oldDTime;
				return jsonDate;
			}

			this.mapCTODFormatToPattern = function (nFormat) {
				if (nFormat == "ANSI")
					return "Y4MD";
				else return nFormat;
			}

			this.emptyDateString = function (sDateFormat) {
				if (sDateFormat.indexOf("Y4") == -1)
					if (gx.blankWhenEmpty)
						return '        ';
					else
						return '  /  /  ';
				else
					if (gx.blankWhenEmpty)
						return '          ';
					else
						if (sDateFormat == "Y4MD")
							return '    /  /  ';
						else
							return '  /  /    ';
			}

			this.getStringWithFmt = function (sDateFormat) {
				sDateFormat = this.mapCTODFormatToPattern(sDateFormat);
				if (this.Value - EMPTY_DATE_VALUE === 0)
					return this.emptyDateString(sDateFormat);
				var sDate = sDateFormat;
				var sDay = gx.text.padr(this.Value.getDate().toString(), 2, '0');
				var sMonth = gx.text.padr((this.Value.getMonth() + 1).toString(), 2, '0');
				var sYear = gx.text.padr(this.Value.getFullYear().toString(), 4, '0');
				var Pos = this.FormatPos(sDateFormat);
				sDate = sDate.replace('D', sDay + ((Pos.DPos < 3) ? '/' : ''));
				sDate = sDate.replace('M', sMonth + ((Pos.MPos < 3) ? '/' : ''));
				if (sDateFormat.indexOf("Y4") == -1) {
					sYear = sYear.slice(2, 4);
					sDate = sDate.replace('Y', sYear + ((Pos.YPos < 3) ? '/' : ''));
				}
				else
					sDate = sDate.replace('Y4', sYear + ((Pos.YPos < 3) ? '/' : ''));
				return sDate;
			}

			this.getString = function (dFormat) {
				if (gx.lang.emptyObject(dFormat)) {
					dFormat = gx.dateFormat;
				}
				return this.getStringWithFmt(dFormat);
			}

			this.toString = function () {
				return this.getString();
			}

			this.gxdtoc = function (nDateFormat, sSeparator) {
				var sDate = this.getStringWithFmt(this.mapCTODFormatToPattern(nDateFormat));
				return sDate.replace('/', sSeparator);
			}

			this.getUrlVal = function () {
				var sDay, sMonth, sYear;
				if (gx.date.isNullDate(this))
					return '';
				if (!this.HasDatePart)
				{
					sDay = '01';
					sMonth = '01';
					sYear = '0001';
				}
				else
				{
					sDay = gx.text.padr(this.Value.getDate().toString(), 2, '0');
					sMonth = gx.text.padr((this.Value.getMonth() + 1).toString(), 2, '0');
					sYear = gx.text.padr(this.Value.getFullYear().toString(), 4, '0');
				}
				var sHour = this.HasTimePart ? gx.text.padr(this.Value.getHours().toString(), 2, '0') : '';
				var sMin = this.HasTimePart ? gx.text.padr(this.Value.getMinutes().toString(), 2, '0') : '';
				var sSec = this.HasTimePart ? gx.text.padr(this.Value.getSeconds().toString(), 2, '0') : '';
				return sYear + sMonth + sDay + sHour + sMin + sSec;
			}

			this.getTimeString = function (WithMin, WithSec, WithHour) {
				if (gx.date.isNullDate(this) && gx.blankWhenEmpty) {
					var timeString = "";
					if (WithHour)
						timeString += "  ";
					if (WithMin)
						timeString += "   ";
					if (WithSec)
						timeString += "   ";
					return timeString;
				}
				else {
					var amPm = "";
					var iHour = this.Value.getHours();
					WithHour = WithHour || true;
					if ((this.TimeFmt == 12) && (iHour >= 12)) {
						if (iHour > 12)
							iHour = iHour - 12;
						amPm = " PM";
					}
					else if (this.TimeFmt == 12)
						amPm = " AM";
					var sHour = this.HasTimePart ? gx.text.padr(iHour.toString(), 2, '0') : '';
					var sMin = this.HasTimePart ? gx.text.padr(this.Value.getMinutes().toString(), 2, '0') : '';
					var sSec = this.HasTimePart ? gx.text.padr(this.Value.getSeconds().toString(), 2, '0') : '';
					if (iHour === 0 && (amPm !== "")) {	//It shows 12:00 AM not 00:00 AM (and Null datetime is / / 12:00 AM, not  / / 00:00 AM)
						sHour = '12';
					}
					var sHourRet = "";
					if (WithHour)
						sHourRet = sHour;
					if (WithMin)
						sHourRet = sHourRet + ':' + sMin;
					if (WithSec)
						sHourRet = sHourRet + ':' + sSec;
					return sHourRet + amPm;
				}
			}

			this.FormatPos = function (SFmt) {
				var YPos, MPos, DPos, Y4Pos;
				if (SFmt == "ANSI") {
					YPos = 1;
					MPos = 2;
					DPos = 3;
				}
				else {
					Y4Pos = SFmt.indexOf("Y4");
					YPos = (Y4Pos == -1) ? SFmt.indexOf("Y") + 1 : Y4Pos + 1;
					MPos = SFmt.indexOf("M");
					if (Y4Pos !== 0) MPos++;
					DPos = SFmt.indexOf("D");
					if (Y4Pos !== 0) DPos++;
				}
				return { YPos: YPos, MPos: MPos, DPos: DPos };
			}

			this.assign_date = function (DateValue) {
				if (DateValue instanceof gx.date.gxdate) {
					this.Value = DateValue.Value;
					this.HasTimePart = DateValue.HasTimePart;
					this.HasDatePart = DateValue.HasDatePart;
				}
				else {
					if (DateValue === undefined) {
						this.Value = EMPTY_DATE_VALUE;
					}
					else {
						this.Value = DateValue;
					}
				}
			}

			this.toUTC = function () {
				if (gx.date.isNullDate(this) || (typeof (gx.StorageTimeZone) == 'undefined') || gx.StorageTimeZone == gx.NULL_TIMEZONEOFFSET)
					return this;
				var xdate = new gx.date.gxdate('');
				xdate.Value.setTime(this.Value.getTime() + this.Value.getTimezoneOffset() * 60000);
				xdate.HasTimePart = this.HasTimePart;
				xdate.HasDatePart = this.HasDatePart;
				return xdate;
			}

			this.fromUTC = function () {
				if (gx.date.isNullDate(this) || (typeof (gx.StorageTimeZone) == 'undefined') || gx.StorageTimeZone == gx.NULL_TIMEZONEOFFSET)
					return this;
				var xdate = new gx.date.gxdate('');
				xdate.Value.setTime(this.Value.getTime() - this.Value.getTimezoneOffset() * 60000);
				xdate.HasTimePart = this.HasTimePart;
				xdate.HasDatePart = this.HasDatePart;
				return xdate;
			}

			this.assign_string = function (SDate, SFmt, IgnoreTime, ThrowExc) {
				var ANSIDateExp = ANSI_DATETIME_REGEX,
					DateParts = ANSIDateExp.exec(SDate),
					datePartsLen = 0;
				if (DateParts == null) {
					if (SDate.indexOf("  /  /  ") != -1)
						IgnoreTime = true;
				}
				else {
					var len = DateParts.length;
					for (var i = 1; i < len; i++) {
						if (!gx.lang.emptyObject(DateParts[i])) datePartsLen++;
					}
				}
				var Pos = this.FormatPos(SFmt);
				var YY = 0, MM = 0, DD = 0, Ho = 0, Mi = 0, Se = 0, Ce = 0;
				try {
					this.HasDatePart = true;
					if ((Pos.DPos + Pos.MPos + Pos.YPos == 6) && (DateParts != null) && (datePartsLen >= 3)) {
						if (DateParts[Pos.YPos] != null)
							YY = parseInt(DateParts[Pos.YPos], 10);
						if (isNaN(YY))
							throw "InvalidDate";
						if (YY < this.FYearOfCentury)
							YY += 2000;
						else if (YY < 100)
							YY += 1900;
						else if (YY < 1000)
							YY += 1000;
						if (DateParts[Pos.MPos] != null)
							MM = parseInt(DateParts[Pos.MPos], 10) - 1;
						if (isNaN(MM) || (MM < 0) || (MM > 11)) throw "InvalidDate";
						if (DateParts[Pos.DPos] != null)
							DD = parseInt(DateParts[Pos.DPos], 10);
						if (isNaN(DD) || (DD < 0) || (DD > gx.date.maxDays(MM, YY))) throw "InvalidDate";
					} else {
						this.HasDatePart = false;
					}
					this.HasTimePart = false;
					var TimeOffSet = 0;
					if (DateParts == null) {
						ANSIDateExp = ANSI_TIME_REGEX;
						DateParts = ANSIDateExp.exec(SDate);
						if (DateParts != null) {
							TimeOffSet = 1;
							//Has time part
							this.HasTimePart = true;
						}
					}
					else {
						if (datePartsLen > 3) {
							TimeOffSet = 4;
							//Has time part
							this.HasTimePart = true;
						}
					}
					if (this.HasTimePart && !IgnoreTime) {
						if (DateParts[TimeOffSet] != null)
							Ho = parseInt(DateParts[TimeOffSet], 10);
						if (gx.lang.emptyObject(DateParts[TimeOffSet]) || isNaN(Ho)) {
							this.HasTimePart = false;
							throw "InvalidHour";
						}
						if (DateParts[TimeOffSet + 1] != null)
							Mi = parseInt(DateParts[TimeOffSet + 1], 10);
						if (isNaN(Mi)) Mi = 0;
						if (DateParts[TimeOffSet + 2] != null)
							Se = parseInt(DateParts[TimeOffSet + 2], 10);
						if (isNaN(Se)) Se = 0;
						if (DateParts[TimeOffSet + 3] != null)
							Ce = parseInt(DateParts[TimeOffSet + 3], 10);
						if (isNaN(Ce)) Ce = 0;

						if (!this.validTime((SDate.toLowerCase().indexOf("m") != -1), Ho, Mi, Se, Ce))
							throw "InvalidHour";
						if ((SDate.indexOf("PM") != -1 || SDate.indexOf("pm") != -1) && (Ho < 12))
							Ho += 12;
						if ((SDate.indexOf("AM") != -1 || SDate.indexOf("am") != -1) && (Ho == 12))
							Ho = 0;
					}
				}
				catch (E) {
					if (ThrowExc) {
						throw E;
					}
					else {
						if (E == "InvalidDate") {
							YY = 0;
							MM = 0;
							DD = 0;
							Ho = 0;
							Mi = 0;
							Se = 0;
							Ce = 0;
						}
						if (E == "InvalidHour") {
							Ho = 0;
							Mi = 0;
							Se = 0;
							Ce = 0;
						}
					}
				}
				this.Value = new Date(YY, MM, DD, Ho, Mi, Se, Ce);
				if ((YY + MM + DD + Ho + Mi + Se + Ce) > 0 && (!this.HasTimePart || IgnoreTime) && this.Value.getDate() != DD) {
					this.Value = new Date(Date.UTC(YY, MM, DD, Ho + 12, Mi, Se, Ce));
				}
			}

			this.validTime = function (AMPM, Hour, Min, Sec, Ce) {
				if (AMPM && Hour > 12)
					return false;
				if (!AMPM && (Hour > 24 || (Hour == 24 && (Min + Sec) > 0)))
					return false;
				return ((Min <= 59) || (Sec <= 59) || (Ce <= 59));
			}

			this.compare = function (DateValue) {
				if (typeof (DateValue) == "string")
					return this.compare_string(DateValue);
				return this.compare_date(DateValue);
			}

			this.compare_string = function (SDate) {
				var DateValue = new gx.date.gxdate(SDate);
				return this.compare_date(DateValue.Value);
			}

			this.compare_date = function (DateValue) {
				var Val;
				if (DateValue instanceof gx.date.gxdate)
					Val = DateValue.Value;
				else
					Val = DateValue;
				if (this.HasTimePart)
					return this.Value - Val;
				else {
					if (this.Value.getFullYear() > Val.getFullYear())
						return 1;
					else if (this.Value.getFullYear() < Val.getFullYear())
						return -1;
					else {
						if (this.Value.getMonth() > Val.getMonth())
							return 1;
						else if (this.Value.getMonth() < Val.getMonth())
							return -1;
						else {
							if (this.Value.getDate() > Val.getDate())
								return 1;
							else if (this.Value.getDate() < Val.getDate())
								return -1;
							else
								return 0;
						}
					}
				}
			}
			
			this.TimeFmt = gx.timeFormat || 12;
			this.SFmt = XSFmt || gx.dateFormat;
			this.FYearOfCentury = gx.centuryFirstYear || 40;
			if (typeof (SDate) == "string")
				this.assign_string(SDate, this.SFmt);
			else
				this.assign_date(SDate);
		},

		isANSIDateTime: function (sdate) {
			if (typeof (sdate) == "string") {
				var ansiRE = ANSI_DATETIME_REGEX;
				if (ansiRE.test(sdate)) {
					return true;
				}
			}
			return false;
		},

		isANSIDate: function (sdate) {
			if (typeof (sdate) == "string") {
				var ansiRE = ANSI_DATE_REGEX;
				if (ansiRE.test(sdate)) {
					return true;
				}
			}
			return false;
		},

		isLeapYear: function (year) {
			if (year % 400 === 0)
				return true;
			if (year % 100 === 0)
				return false;
			if (year % 4 === 0)
				return true;
			return false;
		},

		dateObject: function (date) {
			if (date instanceof this.gxdate)
				return date.Value;
			if (typeof (date) == "string")
				return new this.gxdate(date, (this.isANSIDate(date) ? 'Y4MD' : undefined)).Value;
			if (date instanceof Date)
				return date;
			return new Date();
		},

		gxdateObject: function (date) {
			if (date instanceof this.gxdate)
				return date;
			if (typeof (date) == "string")
				return new this.gxdate(date, (this.isANSIDate(date) ? 'Y4MD' : undefined));
			if (date instanceof Date) {
				var newDate = new this.gxdate("");
				newDate.assign_date(date);
				return newDate;
			}
			return new this.gxdate("");
		},

		clonedDate: function (gxDateObj, realDateObj) {
			var newdate = new this.gxdate("");
			newdate.assign_date(realDateObj);
			if (gxDateObj instanceof this.gxdate) {
				newdate.SFmt = gxDateObj.SFmt;
				newdate.HasTimePart = gxDateObj.HasTimePart;
				newdate.HasDatePart = gxDateObj.HasDatePart;
			}
			return newdate;
		},

		nullDate: function () {
			return new this.gxdate("").Value;
		},

		now: function () {
			var ret = this.today();
			ret.HasTimePart = true;
			ret.HasDatePart = true;
			return ret;
		},

		today: function () {
			var day = new this.gxdate('');
			day.assign_date(new Date());
			return day;
		},

		ctot: function (date, fmt) {
			return new this.gxdate(date, fmt);
		},

		ctod: function (date, fmt) {
			var day = new this.gxdate(date, fmt);
			day.Value.setHours(0, 0, 0, 0);
			return day;
		},

		ymdtod: function (Y, M, D) {
			var day = new this.gxdate(Y + '/' + M + '/' + D, 'ANSI');
			day.Value.setHours(0, 0, 0, 0);
			return day;
		},

		ymdhmstot: function (Y, M, D, H, Mi, S) {
			var day = new this.gxdate(Y + '/' + M + '/' + D + ' ' + H + ':' + Mi + ':' + S, 'ANSI');
			return day;
		},

		hour: function (SDate) {
			return (new this.gxdate(SDate)).Value.getHours();
		},

		minute: function (SDate) {
			return (new this.gxdate(SDate)).Value.getMinutes();
		},

		second: function (SDate) {
			return (new this.gxdate(SDate)).Value.getSeconds();
		},

		millisec: function (Days) {
			return Days * 24 * 60 * 60 * 1000;
		},

		day: function (SDate) {
			return (new this.gxdate(SDate)).Value.getDate();
		},

		month: function (SDate) {
			return (new this.gxdate(SDate)).Value.getMonth() + 1;
		},

		year: function (SDate) {
			return (new this.gxdate(SDate)).Value.getFullYear();
		},

		addDays: function (sdate, inc) {
			return this.addMill(sdate, this.dayToMillisec(inc));
		},

		addSec: function (sdate, inc) {
			return this.addMill(sdate, this.secToMillisec(inc));
		},

		addMill: function (sdate, inc) {
			var date = this.dateObject(sdate).clone();
			var xdate = new this.gxdate();
			xdate.assign_date(date);
			var mill = date.getMilliseconds();
			date.setMilliseconds(mill + inc);
			return xdate.getString((this.isANSIDate(sdate) ? 'Y4MD' : undefined));
		},

		secDiff: function (date1, date2) {
			var val = this.millisecToSec(this.milliDiff(date1, date2));
			return val;
		},

		daysDiff: function (date1, date2) {
			var val = this.millisecToDay(this.milliDiff(date1, date2));
			return val;
		},

		milliDiff: function (date1, date2) {
			var xdate1 = this.gxdateObject(date1);
			var xdate2 = this.gxdateObject(date2);
			date1 = xdate1.Value.valueOf();
			date2 = xdate2.Value.valueOf();
			return date1 - date2;
		},

		dayToMillisec: function (Days) {
			return Days * 24 * 60 * 60 * 1000;
		},

		secToMillisec: function (Sec) {
			return Sec * 1000;
		},

		millisecToDay: function (Mill) {
			return Mill / 24 / 60 / 60 / 1000;
		},

		millisecToSec: function (Mill) {
			return Mill / 1000;
		},

		dateParm: function (sdate) {
			if (typeof (sdate) == "string")
				return new this.gxdate(sdate);
			return sdate;
		},

		urlDate: function (Control, sFmt) {
			var value;
			if (typeof (Control.value) != 'undefined')
				value = Control.value;
			else
				value = gx.dom.spanValue(Control) || Control;
			var date = new this.gxdate(value, sFmt);
			if (!this.isNullDate(date)) {
				return date.Value.getFullYear().toString() +
						gx.text.padr((date.Value.getMonth() + 1).toString(), 2, '0') +
						gx.text.padr(date.Value.getDate().toString(), 2, '0');
			}
			return '';
		},

		urlDateTime: function (Control, sFmt) {
			var value;
			if (typeof(Control.value) != 'undefined')
				value = Control.value;
			else
				value = gx.dom.spanValue(Control) || Control;
			var date = new this.gxdate(value, sFmt);
			if (!date.HasDatePart)
			{
				return '00010101' +
						gx.text.padr(date.Value.getHours().toString(), 2, '0') +
						gx.text.padr(date.Value.getMinutes().toString(), 2, '0') +
						gx.text.padr(date.Value.getSeconds().toString(), 2, '0');
			}
			else if (!this.isNullDate(date)) {

				return date.Value.getFullYear().toString() +
						gx.text.padr((date.Value.getMonth() + 1).toString(), 2, '0') +
						gx.text.padr(date.Value.getDate().toString(), 2, '0') +
						gx.text.padr(date.Value.getHours().toString(), 2, '0') +
						gx.text.padr(date.Value.getMinutes().toString(), 2, '0') +
						gx.text.padr(date.Value.getSeconds().toString(), 2, '0');
			}
			return '';
		},

		isNullDate: function (date) {
			if (date instanceof this.gxdate)
				date = date.Value;
			var nullD = this.nullDate();
			if (nullD.getFullYear() != date.getFullYear())
				return false;
			if (nullD.getMonth() != date.getMonth())
				return false;
			if (nullD.getDate() != date.getDate())
				return false;
			if (nullD.getHours() != date.getHours())
				return false;
			if (nullD.getMinutes() != date.getMinutes())
				return false;
			if (nullD.getSeconds() != date.getSeconds())
				return false;
			return true;
		},

		dtoc: function (SDate, nDateFormat, sSeparator) {
			var d = new this.gxdate(SDate, (this.isANSIDate(SDate) ? 'Y4MD' : undefined));
			return d.gxdtoc(nDateFormat, sSeparator);
		},

		dttoc: function (SDate, nLen, nDec) {
			var date = new this.gxdate(SDate, (this.isANSIDateTime(SDate) ? 'Y4MD' : undefined));
			var sFmt = gx.dateFormat;
			var DatePart = '';
			if (nLen > 0) {
				if ((nLen > 8) && (sFmt.indexOf("Y4") == -1))
					sFmt = sFmt.replace('Y', 'Y4');
				DatePart = date.getStringWithFmt(sFmt) + ' ';
			}
			if (nDec > 0)
				return DatePart + date.getTimeString(nDec > 3, nDec == 8, nDec > 1);
			return DatePart;
		},

		nulldate_toc: function (nLen, nDec) {
			var Date = new this.gxdate('');
			Date.HasTimePart = true;
			Date.HasDatePart = true;
			var sFmt = gx.dateFormat;
			var DatePart = "";
			if (nLen > 0) {
				if ((nLen > 8) && (sFmt.indexOf("Y4") == -1))
					sFmt = sFmt.replace('Y', 'Y4');
				DatePart = Date.getStringWithFmt(sFmt) + ' ';
			}
			if (nDec > 0 && !gx.blankWhenEmpty)
				return DatePart + Date.getTimeString(nDec > 1, nDec == 8, nDec > 3);
			return DatePart;
		},


		addyr: function (date, inc) {
			return this.addmth(date, 12 * inc);
		},

		addmth: function (date, inc) {
			var origDate = this.gxdateObject(date);
			date = this.dateObject(date);
			date = new Date(date.getTime());	
			var datePart = date.getDate();
			date.setDate(1);
			date.setMonth(date.getMonth() + inc * 1);
			date.setDate(Math.min(datePart, this.maxDays(date.getMonth(), date.getFullYear())));
			return this.clonedDate(origDate, date);
		},		

		dtadd: function (date, inc) {
			var origDate = this.gxdateObject(date);
			date = new Date(date.getTime());
			inc = inc * 1000;
			date = this.dateObject(date);
			var millis = date.getMilliseconds();
			date.setMilliseconds(millis + inc);
			return this.clonedDate(origDate, date);
		},

		dtdiff: function (date1, date2) {
			date1 = this.dateObject(date1);
			date2 = this.dateObject(date2);
			return (date1 - date2) / 1000;
		},

		maxDays: function (month, year) {
			return [31, (this.isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31][month];
		},

		eom: function (date) {
			var origDate = this.gxdateObject(date);
			date = this.dateObject(date);
			date = new Date(date.getTime());
			var lastDay = this.maxDays(date.getMonth(), date.getFullYear());
			date.setDate(lastDay);
			return this.clonedDate(origDate, date);
		},

		dow: function (date) {
			date = this.dateObject(date);
			if (date.equalsNoTime(this.nullDate()))
				return 0;
			return date.getDay() + 1;
		},

		age: function (date1, date2) {
			var dtAsOfDate;
			var dtBirth;
			var dtAnniversary;
			var intSpan;
			var intYears;
			var intMonths;

			dtBirth = this.dateObject(date1);
			dtAsOfDate = this.dateObject(date2);

			var nullDate = this.nullDate();
			if (dtBirth.equalsNoTime(nullDate) || dtAsOfDate.equalsNoTime(nullDate) || dtBirth.equalsNoTime(dtAsOfDate))
				return 0;

			// if as of date is on or after born date
			if (dtAsOfDate >= dtBirth) {
				// get time span between as of time and birth time
				intSpan = (dtAsOfDate.getUTCHours() * 3600000 +
					dtAsOfDate.getUTCMinutes() * 60000 +
					dtAsOfDate.getUTCSeconds() * 1000) -
					(dtBirth.getUTCHours() * 3600000 +
					dtBirth.getUTCMinutes() * 60000 +
					dtBirth.getUTCSeconds() * 1000)
				// start at as of date and look backwards for anniversary 

				// if as of day (date) is after birth day (date) or
				//    as of day (date) is birth day (date) and
				//    as of time is on or after birth time
				if (dtAsOfDate.getUTCDate() > dtBirth.getUTCDate() ||
					(dtAsOfDate.getUTCDate() == dtBirth.getUTCDate() && intSpan >= 0)) {
					// most recent day (date) anniversary is in as of month
					dtAnniversary = new Date(Date.UTC(dtAsOfDate.getUTCFullYear(),
						dtAsOfDate.getUTCMonth(),
						dtBirth.getUTCDate(),
						dtBirth.getUTCHours(),
						dtBirth.getUTCMinutes(),
						dtBirth.getUTCSeconds()));

				}
					// if as of day (date) is before birth day (date) or
					//    as of day (date) is birth day (date) and
					//    as of time is before birth time
				else {
					// most recent day (date) anniversary is in month before as of month
					dtAnniversary = new Date(Date.UTC(dtAsOfDate.getUTCFullYear(),
						dtAsOfDate.getUTCMonth() - 1,
						dtBirth.getUTCDate(),
						dtBirth.getUTCHours(),
						dtBirth.getUTCMinutes(),
						dtBirth.getUTCSeconds()));

					// get previous month
					intMonths = dtAsOfDate.getUTCMonth() - 1;
					if (intMonths == -1)
						intMonths = 11;

					// while month is not what it is supposed to be (it will be higher)
					while (dtAnniversary.getUTCMonth() != intMonths)
						// move back one day
						dtAnniversary.setUTCDate(dtAnniversary.getUTCDate() - 1);
				}
				// if anniversary month is on or after birth month
				if (dtAnniversary.getUTCMonth() >= dtBirth.getUTCMonth()) {
					// years elapsed is anniversary year - birth year
					intYears = dtAnniversary.getUTCFullYear() - dtBirth.getUTCFullYear();
				}
					// if birth month is after anniversary month
				else {
					// years elapsed is year before anniversary year - birth year
					intYears = (dtAnniversary.getUTCFullYear() - 1) - dtBirth.getUTCFullYear();
				}
				return intYears;
			}
			return 0;
		},

		valid_date: function (Elem, nDateLen, nDateFmt, nTimeLen, nTimeFmt, sIdiom, pMandatoryCentury, nBlankWhenEmpty) {
			var bMandatoryCentury = pMandatoryCentury || false,
				reEmpty = EMPTY_DATE_REGEX,
				reVDTime,
				wasEmpty = false,
				elemValue = '',
				nDateFmtStr = nDateFmt,
				controlValue = "",
				sVDTime = "^[ ]*(";
			var invalidDateMsg = nDateLen > 0 ? 'GXM_invaliddate' : 'GXM_invalidtime';

			elemValue = Elem.value;

			elemValue = elemValue.split('\n')[0];

			if (nDateFmt == "YMD") nDateFmt = 1;
			else nDateFmt = 0;

			if (nTimeFmt == 12) nTimeFmt = 1;
			else nTimeFmt = 0;

			if (reEmpty.test(elemValue)) {
				wasEmpty = true;
				elemValue = "";
			}

			if (nDateLen > 0) {
				if (nDateLen == 8)
					sVDTime = sVDTime + "([0-9]{1,2})[\/|-]?([0-9]{1,2})[\/|-]?([0-9]{2})";
				else {
					if (nDateFmt === 0) {
						if (bMandatoryCentury)
							sVDTime = sVDTime + "([0-9]{1,2})[\/|-]?([0-9]{1,2})[\/|-]?([0-9]{4})";
						else
							sVDTime = sVDTime + "([0-9]{1,2})[\/|-]?([0-9]{1,2})[\/|-]?([0-9]{2,4})";
					}
					else {
						if (bMandatoryCentury)
							sVDTime = sVDTime + "([0-9]{4})[\/|-]?([0-9]{1,2})[\/|-]?([0-9]{1,2})";
						else
							sVDTime = sVDTime + "([0-9]{2,4})[\/|-]?([0-9]{1,2})[\/|-]?([0-9]{1,2})";
					}
				}
			}
			else
				/* Extra parenthesis are added to maintain parameter numbers */
				sVDTime = sVDTime + "( )?( )?( )?";

			if (nTimeLen > 0) {
				sVDTime = sVDTime + "(";
				if (nDateLen > 0)
					sVDTime = sVDTime + "[ ]*";
				sVDTime = sVDTime + "([0-9]{1,2})";

				if (nTimeLen > 2)
					sVDTime = sVDTime + "(:?([0-9]{1,2}))?";
				else
					sVDTime = sVDTime + "(( )?)?";

				if (nTimeLen > 5)
					sVDTime = sVDTime + "(:?([0-9]{1,2}))?";
				else
					sVDTime = sVDTime + "(( )?)?";

				if (nTimeFmt == 1)
					sVDTime = sVDTime + "[ ]*(a|am|p|pm)?";
				else
					sVDTime = sVDTime + "(( )?)?";

				sVDTime = sVDTime + ")?";
			}
			sVDTime = sVDTime + ")?[ ]*$";
			reVDTime = new RegExp(sVDTime, "i");

			if (reVDTime.test(elemValue)) {
				var sTokArr = elemValue.match(reVDTime);

				if (nDateLen > 0) {
					var dateSep = '/';
					if (elemValue.indexOf('-') > 0)
						dateSep = '-';
					if (!sTokArr[2]) {
						if (nBlankWhenEmpty == 1)
							controlValue = "        ";
						else
							controlValue = "  " + dateSep + "  " + dateSep + "  ";
						if (nDateLen == 10)
							controlValue += "  ";
					}
					else {
						controlValue = sTokArr[2] + dateSep + sTokArr[3] + dateSep + sTokArr[4];
					}
				}
				else
					controlValue = "";

				if (nTimeLen > 0) {
					if (nDateLen > 0)
						controlValue = controlValue + " ";
					if (nBlankWhenEmpty == 1 && (!sTokArr[6]) && (!sTokArr[8]) && (!sTokArr[10])) {
						controlValue = controlValue + "        ";
					}
					else {

						if (!sTokArr[6]) {
							if (wasEmpty) {
								var emptTokArr = elemValue.match(reEmpty);
								if (emptTokArr[4])
									controlValue = controlValue + emptTokArr[4];
								else
									controlValue = controlValue + ((nTimeFmt == 1) ? "12" : "00");
							}
							else
								controlValue = controlValue + ((nTimeFmt == 1) ? "12" : "00");
						}
						else
							controlValue = controlValue + sTokArr[6];

						if (nTimeLen > 2) {
							if (!sTokArr[8])
								controlValue = controlValue + ":00";
							else
								controlValue = controlValue + ":" + sTokArr[8];
						}

						if (nTimeLen > 5) {
							if (!sTokArr[10])
								controlValue = controlValue + ":00";
							else
								controlValue = controlValue + ":" + sTokArr[10];
						}

						if (nTimeFmt == 1) {
							var x;
							if (!sTokArr[11])
								x = "a";
							else
								x = sTokArr[11].substr(0, 1);
							if (x.toLowerCase() == "p") {
								controlValue = controlValue + " PM";
							}
							else {
								controlValue = controlValue + " AM";
							}
						}
					}
				}

				var testDate = new this.gxdate('', nDateFmtStr);
				try {
					testDate.assign_string(controlValue, nDateFmtStr, (nTimeLen <= 0), true);
					if (gx.text.trim(controlValue) !== '')//if not Blanwhenempty
					{
						controlValue = this.formatDateTime(nTimeLen, nDateLen, nDateFmtStr, testDate);
					}
				}
				catch (E) {
					gx.fn.alert(Elem, gx.getMessage(invalidDateMsg));
					gx.csv.setFormatError(Elem);
					return false;
				}

				if (controlValue != elemValue) {
					Elem.value = controlValue;
					if (navigator.userAgent.indexOf("Firefox/2") != -1) {
						//WA For FF 2.0 bug (https://bugzilla.mozilla.org/show_bug.cgi?id=357684)
						Elem.onchange();
					}
					var vStruct = gx.O.getValidStructFld(Elem);
					if (vStruct) {
						gx.O.refreshDependantGrids(vStruct);
					}
				}
				gx.csv.setFormatError(Elem, false);
				return true;
			}
			gx.fn.alert(Elem, gx.getMessage(invalidDateMsg));
			gx.csv.setFormatError(Elem);
			return false;
		},

		formatDateTime: function (nTimeLen, nDateLen, nDateFmt, Value) {
			var timeString = '';
			var ret;
			if (nTimeLen > 0 && Value.HasTimePart)
				timeString = Value.getTimeString(nTimeLen >= 4, nTimeLen >= 8);
			var Fmt = nDateFmt;
			if (nDateLen > 8 && Fmt.indexOf("Y4") == -1)
				Fmt = Fmt.replace('Y', 'Y4');
			if (nDateLen > 0)
				ret = Value.getStringWithFmt(Fmt) + ((Value.HasTimePart) ? " " + timeString : "");
			else
				ret = (Value.HasTimePart) ? timeString : "";
			return ret;
		},

		_init: function () {
			Date.prototype.equalsNoTime = this.equalsNoTime;
			Date.prototype.clone = this.clone;
			Date.prototype.json = this.toJson;
		}
	};
})();

gx.text = {
	stringBuffer: function (capacity) {
		this.capacity = capacity || 10;
		this.buffer = [];

		this.append = function (value) {
			this.buffer.push(value);
			return this;
		}

		this.clear = function () {
			delete this.buffer;
			this.buffer = [];
		}

		this.toString = function () {
			if (this.buffer.length === 0)
				return '';
			return this.buffer.join('');
		}

		this.length = function () {
			return this.toString().length;
		}
	},

	format: function () {
		var msg = arguments[0];
		var len = arguments.length;
		for (var i = 1; i < len; i++)
			msg = msg.replace('%' + i, gx.text.trim(arguments[i].toString()));
		return msg;
	},

	formatString: function (str, len, isPwd) {
		if (isPwd)
			return gx.text.padl('', len, "*");
		else
			return str;
	},

	replaceAll: function (value, toReplace, replaceWith) {
		if (value.toString().indexOf(toReplace) != -1) {
			return String(value).split(toReplace).join(replaceWith);
		}
		return value;
	},

	charReplace: function (Value, Chars, Repls) {
		var Ret = '';
		var len = Value.length;
		for (var i = 0; i < len; i++) {
			var bFixed = false;
			var len1 = Chars.length;
			for (var c = 0; c < len1; c++) {
				if (Value.charAt(i) == Chars[c]) {
					if (c < Repls.length) {
						Ret += Repls[c];
						bFixed = true;
						break;
					}
				}
			}
			if (bFixed === false)
				Ret += Value.charAt(i);
		}
		return Ret;
	},

	endsWith: function (str, suffix) {
		return str.indexOf(suffix, str.length - suffix.length) !== -1;
	},

	length: function (str) {
		return str.length;
	},

	upper: function (str) {
		return str.toUpperCase();
	},

	lower: function (str) {
		return str.toLowerCase();
	},

	padr: function (val, len, padc) {
		var xlen = val.length;
		var diff = len - xlen;
		if (diff < 1)
			return val;
		var xval = '';
		for (var i = 0; i < diff; i++)
			xval += padc;
		xval += val;
		return xval;
	},

	padl: function (val, len, padc) {
		var xlen = val.length;
		var diff = len - xlen;
		if (diff < 1)
			return val;
		var xval = '';
		for (var i = 0; i < diff; i++)
			xval += padc;
		xval = xval + val;
		return xval;
	},
	ltrim: function (str) {
		return str.toString().replace(/^ */, '');
	},

	rtrim: function (str) {
		return str.toString().replace(/ *$/, '');
	},

	trim: function (str) {
		return this.rtrim(this.ltrim(str));
	},

	chr: function (num) {
		return String.fromCharCode(num);
	},

	concat: function (str1, str2, sep) {
		return this.rtrim(str1) + sep + str2;
	},

	space: function (n) {
		var buffer = '';
		for (var i = 0; i < n; i++) { buffer += ' '; }
		return buffer;
	},

	substring: function (str, from, len) {
		return str.toString().substring(from - 1, from - 1 + len);
	},

	tostring: function (str) {
		return str.toString();
	},

	toformattedstring: function (str) {
		return str.toString();
	},

	newline: function () {
		return '\n';
	},

	escapeMapping: {
		"\b": '\\b',
		"\t": '\\t',
		"\n": '\\n',
		"\f": '\\f',
		"\r": '\\r',
		'"': '\\"',
		"\\": '\\\\'
	},

	escapeRegex: {
		start: /["\\\x00-\x1f]/,
		end: /([\x00-\x1f\\"])/g
	},

	escapeFn: function (a, b) {
		var c = gx.text.escapeMapping[b];
		if (c) {
			return c;
		}
		c = b.charCodeAt();
		return "\\u00" +
			Math.floor(c / 16).toString(16) + (c % 16).toString(16);
	},

	escapeString: function (s) {
		if (this.escapeRegex.start.test(s)) {
			return '"' + s.replace(this.escapeRegex.end, this.escapeFn) + '"';
		}
		return '"' + s + '"';
	},

	indexOf: function (str, value, fromIdx) {
		if (fromIdx > str.length)
			return 0;
		if (fromIdx <= 0)
			fromIdx = 1;
		return str.indexOf(value, fromIdx - 1) + 1;
	},

	lastIndexOf: function (str, value, fromIdx) {
		if (fromIdx > str.length)
			return 0;
		if (fromIdx <= 0)
			fromIdx = str.length;
		return str.lastIndexOf(value, fromIdx - 1) + 1;
	}
};

gx.num = function () {
	var operation = function (name, defaultOp, a, b) {
		var io = gx.lang.instanceOf,
			dec = typeof (gx.num.dec) == "undefined" ? null : gx.num.dec.bigDecimal,
			thSep = gx.thousandSeparator,
			decPoint = gx.decimalPoint;

		if (typeof(a) == "string")
			a = gx.num.parseFloat(a, thSep, decPoint);
		if (typeof(b) == "string")
			b = gx.num.parseFloat(b, thSep, decPoint);

		if (io(a, dec) && io(b, Number))
			return a[name](new dec(b.toString())).toString();
		else if (io(a, Number) && io(b, dec))
			return new dec(a.toString())[name](b).toString();
		if (io(a, Number) && io(b, Number) || typeof (gx.num.dec) == "undefined")
			return defaultOp(a, b);
		else
			return a[name](b);
	};

	return {
		str: function (num, len, dec) {
			var sNum;
			if (typeof (len) == 'undefined')
				len = 10;
			if (typeof (dec) == 'undefined' || (len - 1 <= dec))
				dec = 0;
			num = this.round(num, dec);
			if (dec === 0) {
				sNum = num.toString();

				if (sNum.length > len)
					return gx.text.padr('', len, '*');
				else
					return gx.text.padr(sNum, len, ' ');
			}
			sNum = num.toString();
			var decIdx = sNum.indexOf('.');
			if (dec > 0) {
				if (decIdx < 0) {
					sNum += '.' + gx.text.padr('', dec, '0');
				}
				else {
					sNum = (decIdx === 0 ? '0' : sNum.substring(0, decIdx)) + gx.text.padr(sNum.substring(decIdx), dec + 1, '0');
				}
			}
			if (sNum.length <= len) {
				return gx.text.padr(sNum, len, ' ');
			}
			decIdx = sNum.indexOf('.');
			if (decIdx > 0) {
				var intPart = sNum.substring(0, decIdx);
				if (intPart.length <= len) {
					return gx.num.str(gx.num.val(sNum), len, 0);
				}
			}
			return gx.text.padr('', len, '*');
		},

		maxNumericPrecision: function () {
			return 15;
		},

		extractValue: function (picture, strnum) {
			if (gx.lang.instanceOf(strnum, Number) || this.overflowNumber(strnum))
				return strnum;
			var pchars,
				value = (strnum === undefined ? '' : strnum);
			if (picture) {
				if (picture.charAt(0) == '+' || picture.charAt(0) == '-')
					pchars = picture.replace(/[\+\-\d,*\.*Z*\s]+/, '');
				else
					pchars = picture.replace(/[\d,*\.*Z*\s]+/g, '');

				if (picture.lastIndexOf('.') != picture.indexOf('.'))
					value = gx.text.replaceAll(value, '.', '');

				for (var i = 0; i < pchars.length; i++)
					value = value.replace(pchars.charAt(i), '');
			}
			return gx.text.trim(value);
		},

		formatNumber: function (number, decimals, picture, digits, sign, errorOnBadNumber) {
			if (gx.lang.emptyObject(number))
				number = '0';
			var thSep = picture.indexOf(',') != -1 ? gx.thousandSeparator : '';
			var decSep = gx.decimalPoint;
			var psplit;
			var blankWhenZero = false;

			if (typeof (number) == "string" && thSep)
				number = gx.text.replaceAll(number, thSep, '');
			if (typeof (number) == "string")
				number = number.replace(decSep, '.');

			if (gx.num.overflowNumber(number))
				return number;
			try {
				number = gx.num.setScale(number, decimals);
			} catch (e) { number = number.toString(); }
			var f = number.split('.');
			var i, j;
			if (!f[0]) f[0] = '0';
			if (!f[1]) f[1] = '';

			if (errorOnBadNumber) {
				if (f[1].length > decimals && f[1].replace(/0*$/, '').length > decimals) {
					throw "InvalidNumber";
				}
				else {
					var totalDigits = (decimals === 0) ? digits : (digits - decimals - 1);
					if ((sign && f[0].charAt(0) == '-' && f[0].replace(/0*/, '').length > totalDigits) ||
						(!sign && f[0].charAt(0) == '-') ||
						(f[0].replace(/[+]?0*/, '').length > totalDigits))
						throw "InvalidNumber";
				}
			}
			if (number < 0)
				sign = true;
			if (f[1].length < decimals) {
				var g = f[1];
				for (i = f[1].length + 1; i <= decimals; i++) {
					g += '0';
				}
				f[1] = g;
			}
			var signChar = '';
			if (sign && f[0].charAt(0) == '-') {
				signChar = '-';
				f[0] = f[0].substring(1);
			}
			if (thSep && f[0].length > 3) {
				var h = f[0];
				f[0] = '';
				for (j = 3; j < h.length; j += 3) {
					i = h.slice(h.length - j, h.length - j + 3);
					f[0] = thSep + i + f[0] + '';
				}
				j = h.substr(0, (h.length % 3 === 0) ? 3 : (h.length % 3));
				f[0] = j + f[0];
			}
			decSep = (!f[1]) ? '' : decSep;

			if (decimals > 0) {
				psplit = picture.split('.');
				if (psplit[1] == gx.text.padr('', decimals, 'Z'))
					blankWhenZero = true;
			}
			else {
				psplit = new Array(picture);
				if (psplit.length > 0 && gx.text.replaceAll(gx.text.replaceAll(psplit[0], ',', ''), 'Z', '').length === 0)
					blankWhenZero = true;
			}

			//parte decimal
			var nidx = 0;
			var decPart = '';
			if (psplit.length > 1) {
				var dpic = psplit[1];
				for (i = 0; i < dpic.length; i++) {
					var chd = dpic.charAt(i);
					if (chd == '9' || chd == 'Z')
						if (f[1].length > nidx) {
							decPart = decPart + f[1].charAt(nidx);
							nidx++;
						}
						else
							decPart = decPart + '0';
					else if (chd != '.' && chd != ',')
						decPart = decPart + chd;
				}
			}

			//parte entera
			var intPart = '';
			var epic = psplit[0];
			nidx = f[0].length - 1;
			for (i = epic.length - 1; i >= 0; i--) {
				var ch = epic.charAt(i);
				if (ch == '9' || ch == 'Z')
					if (nidx >= 0) {
						intPart = f[0].charAt(nidx) + intPart;
						nidx--;
					}
					else
						intPart = (ch == '9' ? '0' : '') + intPart;
				else if (ch != 'Z' && ch != ',')
					intPart = ch + intPart;
				else if (ch == ',' && f[0].charAt(nidx) == thSep) {
					intPart = f[0].charAt(nidx) + intPart;
					nidx--;
				}
			}
			if (blankWhenZero && intPart == '0' && decPart.replace(/0+$/, '').length === 0)
				return '';
			else
				return signChar + intPart + (!decPart ? '' : (decSep + decPart));
		},

		add: function (a, b) {
			return operation('add', function (a, b) { return a + b; }, a, b);
		},

		subtract: function (a, b) {
			return operation('substract', function (a, b) { return a - b; }, a, b);
		},

		multiply: function (a, b) {
			return operation('multiply', function (a, b) { return a * b; }, a, b);
		},

		divide: function (a, b) {
			return operation('divide', function (a, b) { return a / b; }, a, b);
		},

		negate: function (a) {
			if (gx.lang.instanceOf(a, Number) || typeof (gx.num.dec) == "undefined")
				return -a;
			else
				return a.negate();
		},

		pow: function (a, b) {
			/*jshint bitwise:false */
			return operation('pow', function (a, b) { return a ^ b; }, a, b);
		},

		mod: function (a, b) {
			return operation('remainder', function (a, b) { return a % b; }, a, b);
		},

		setScale: function (SVal, Dec) {
			if (gx.lang.instanceOf(SVal, Number))
				return SVal.toFixed(Dec);

			if (typeof (SVal) == "string")
				SVal = gx.text.trim(SVal);
			if (SVal.length < this.maxNumericPrecision() || typeof (gx.num.dec) == "undefined") {
				if (SVal.length === 0 && Dec === 0) {
					return '0';
				}
				else {
					var f = SVal.split('.');
					var i;
					if (!f[1]) f[1] = '';

					if (f[1].length < Dec) {
						var g = f[1];
						for (i = f[1].length + 1; i <= Dec; i++) {
							g += '0';
						}
						f[1] = g;
						return f[0] + ((f[1] === '') ? '' : '.') + f[1];
					}
					else {
						return Number(parseFloat(SVal)).toFixed(Dec);
					}
				}
			}
			else
				return new gx.num.dec.bigDecimal(SVal).setScale(Dec, gx.num.dec.ROUND_UP).toString();
		},

		parseFloat: function (S, ThSep, DecPoint) {
			if (gx.lang.instanceOf(S, Number) || this.overflowNumber(S))
				return S;
			var N = this.toInvariant(S, ThSep, DecPoint);
			if (N.length > this.maxNumericPrecision() && typeof (gx.num.dec) != "undefined")
				return new gx.num.dec.bigDecimal(N);
			else
				return parseFloat(N);
		},

		toInvariant: function (S, ThSep, DecPoint) {
			if (typeof (S) == 'number' || (typeof (gx.num.dec) != "undefined" && S instanceof gx.num.dec.bigDecimal))
				return S;
			else
				return gx.text.replaceAll(S, ThSep, '').replace(DecPoint, '.');
		},

		parseInt: function (S, Radix, ThSep) {
			if (typeof (S) == 'number')
				return S;
			var N = S;
			N = gx.text.replaceAll(S, ThSep, '');
			return parseInt(N, Radix);
		},

		overflowNumber: function (S) {
			var regExp = /\*(\**)/;
			return regExp.test(S);
		},

		urlDecimal: function (Control, ThSep, DecPoint) {
			if (typeof(Control) != 'undefined') {
				var value = (typeof (Control.value) != 'undefined') ? Control.value : Control;
				value = this.parseFloat(value, ThSep, DecPoint);
				return value.toString();
			} else {
				return '';
			}
		},

		random: function () {
			return Math.random();
		},

		intval: function (num) {
			var result = 0;
			if (typeof (num) != 'undefined') {
				num = num.toString();
			}
			else {
				num = '';
			}
			if (num.length < gx.num.maxNumericPrecision() || typeof (gx.num.dec) == 'undefined') {
				result = parseInt(num, 0);
			}
			else {
				result = new gx.num.dec.bigDecimal(num).setScale(0, gx.num.dec.ROUND_UP);
			}
			if (isNaN(result))
				result = 0;
			return result;
		},

		val: function (str) {
			str = gx.text.trim(str).replace(',', '.');
			var result = this.parseFloat(str);
			if (isNaN(result))
				result = 0;
			return result;
		},

		trunc: function (num, dec) {
			var result = num;
			num = num.toString();

			var len = num.length;

			var decSep = num.indexOf('.');

			if (decSep != -1) {
				var intPart = num.substring(0, decSep);

				if (dec === 0)
					return intPart;

				var floatPart = "";
				if (decSep + dec <= len)
					floatPart = num.substring(decSep + 1, decSep + 1 + dec);

				num = intPart + '.' + floatPart;

				result = gx.num.parseFloat(num);
				if (isNaN(result))
					result = 0;
			}
			return result;
		},

		round: function (n, d) {
			n = n.toString();
			var xx = n.indexOf('.');
			var zstr = '0000000000000000000000';
			var theInt = '';
			var theFrac = '';
			var theNo = '';
			var nx = 0;
			var xt = parseInt(d, 0) + 1;
			var rstr = '' + zstr.substring(1, xt);
			var rfac = '.' + rstr + '5';
			var rfacx = parseFloat(rfac);
			var result;
			if (xx == -1) {
				theFrac = zstr;
				theInt = "" + n;
			}
			else if (xx === 0) {
				theInt = '0';
				nx = 0 + parseFloat(n) + parseFloat(rfacx);
				n = nx + zstr;
				theFrac = '' + n.substring(1, n.length);
			}
			else {
				if (d === 0) {
					theInt = n.substring(0, xx);
					result = parseInt(theInt, 0);
					var firstFrac = parseInt(n.substring(xx + 1, xx + 2), 0);
					if (isNaN(result))
						return 0;
					if (!isNaN(firstFrac) && firstFrac >= 5)
						result++;
					return result;
				}
				nx = parseFloat(n) + rfacx;
				theInt = nx.toString().substring(0, xx);
				n = '' + nx + zstr;
				theFrac = '' + n.substring(xx + 1, xx + 1 + parseInt(d, 0));
			}
			theFrac = theFrac.substring(0, parseInt(d, 0));
			theNo = theInt + '.' + theFrac;
			result = parseFloat(theNo);
			if (isNaN(result))
				result = 0;
			return result;
		},

		valid_decimal: function (Elem, ThSep, DecPoint, Dec) {
			var ctrlValue = Elem.value;
			var pointIdx = ctrlValue.lastIndexOf(DecPoint);
			var validNumber = true;
			if (DecPoint == ',' && pointIdx == -1 && ctrlValue.lastIndexOf('.') == ctrlValue.indexOf('.')) {
				ctrlValue = ctrlValue.replace('.', DecPoint);
			}

			var validStruct = gx.O.getValidStructFld(Elem);
			if (!gx.lang.emptyObject(validStruct))
				ctrlValue = gx.num.extractValue(validStruct.pic, ctrlValue);

			var gx_DecRegExp = new RegExp("^[ ]*([+-]?[0-9]*(\\" + ThSep + "[0-9]{3})*(\\" + DecPoint + "[0-9]*)?)?[ ]*$");
			if (ctrlValue) {
				if (gx_DecRegExp.test(ctrlValue)) {
					pointIdx = ctrlValue.lastIndexOf(DecPoint);
					var newvalue = ctrlValue;
					if (pointIdx != -1)
						newvalue = ctrlValue.slice(0, pointIdx + parseInt(Dec, 10) + 1);
					try {
						if (!gx.lang.emptyObject(validStruct))
							newvalue = gx.num.formatNumber(newvalue, validStruct.dec, validStruct.pic, validStruct.len, validStruct.sign, true);
						if (DecPoint != '.' && Elem.tagName == 'SELECT')
							newvalue = gx.num.toInvariant(newvalue, ThSep, DecPoint);
					} catch (e) { validNumber = false; }
					if (validNumber && newvalue != gx.text.trim(Elem.value)) {
						Elem.value = newvalue;
						if (navigator.userAgent.indexOf("Firefox/2") != -1)
							//WA For FF 2.0 bug (https://bugzilla.mozilla.org/show_bug.cgi?id=357684)
							Elem.onchange();
					}
				}
				else {
					validNumber = false;
				}
			}
			else
				validNumber = true;
			if (!validNumber) {
				gx.csv.setFormatError(Elem);
				gx.fn.alert(Elem, gx.getMessage("GXM_badnum"));
			} else {
				gx.csv.setFormatError(Elem, false);
			}
		},

		valid_integer: function (Elem, ThSep) {
			var gx_IntRegExp, ctrlValue, validNumber;
			var vStruct = gx.O.getValidStructFld(Elem);
			var vStructEO = gx.lang.emptyObject(vStruct);
			ctrlValue = Elem.value;
			if (!vStructEO)
				ctrlValue = gx.num.extractValue(vStruct.pic, ctrlValue);
				
			if (!vStructEO && vStruct.pic.indexOf(',') != -1)
				gx_IntRegExp = new RegExp("^[ ]*([+-]?[0-9]*(\\" + ThSep + "[0-9]{3})*)?[ ]*$");
			else
				gx_IntRegExp = new RegExp("^[ ]*([+-]?[0-9]*([0-9]{3})*)?[ ]*$");
				
			validNumber = true;				
			if (ctrlValue) {
				if (gx_IntRegExp.test(ctrlValue)) {
					try {
						if (!vStructEO)
							ctrlValue = gx.num.formatNumber(ctrlValue, vStruct.dec, vStruct.pic, vStruct.len, vStruct.sign, true);
					} catch (e) { validNumber = false; }
					if (ctrlValue != gx.text.trim(Elem.value)) {
						Elem.value = ctrlValue;
						if (navigator.userAgent.indexOf("Firefox/2") != -1)
							//WA For FF 2.0 bug (https://bugzilla.mozilla.org/show_bug.cgi?id=357684)
							Elem.onchange();
					}
				}
				else {
					validNumber = false;
				}
			}
			else
				validNumber = true;
			if (!validNumber) {
				gx.csv.setFormatError(Elem);
				gx.fn.alert(Elem, gx.getMessage("GXM_badnum"));
			} else {
				gx.csv.setFormatError(Elem, false);
			}
		}
	};
}();

gx.color = {
	rgb: function (r, g, b) {
		return (r * 256 * 256) + g * 256 + b;
	},

	css: function (Color) {
		if (Color.substring(0, 3) == 'rgb')
			return eval(Color);
		return (Color.charAt(0) == '#') ? parseInt(Color.substring(1), 16) : 0;
	},

	html: function (num) {
		var hexColor = this.toHex(num);
		if (gx.lang.emptyObject(hexColor)) {
			hexColor = "000000";
		}
		hexColor = gx.text.padr(hexColor, 6, "0");
		var htmlColor = {};
		htmlColor.Hexa = hexColor;
		htmlColor.Html = '#' + hexColor;
		htmlColor.R = parseInt(hexColor.substring(0, 2), 16);
		htmlColor.G = parseInt(hexColor.substring(2, 4), 16);
		htmlColor.B = parseInt(hexColor.substring(4, 6), 16);
		return htmlColor;
	},

	fromRGB: function (R, G, B) {
		var htmlColor = {};
		if ((typeof(R) != 'undefined') && (typeof(G) != 'undefined') && (typeof(B) != 'undefined')) {
			htmlColor.Hexa = this.toHex(R) + this.toHex(G) + this.toHex(B);
			htmlColor.Html = '#' + htmlColor.Hexa;
			htmlColor.R = R;
			htmlColor.G = G;
			htmlColor.B = B;
		}
		return htmlColor;
	},

	ARGBToHex: function (argb) {
		/*jshint bitwise:false */
		//var A = this.toHex((argb >> 24) & 0xFF);
		var R = this.toHex((argb >> 16) & 0xFF);
		var G = this.toHex((argb >> 8) & 0xFF);
		var B = this.toHex(argb & 0xFF);
		return R + G + B;
	},

	toHex: function (num) {
		if (num === undefined)
			return "000000";
		if (num < 0) {
			return gx.color.ARGBToHex(num);
		}
		var hexChars = "0123456789ABCDEF";
		if (num === 0)
			return num + '0';
		var j = 0;
		var hexStr = "";
		while (num !== 0) {
			j = num % 16;
			num = (num - j) / 16;
			hexStr = hexChars.charAt(j) + hexStr;
		}
		if ((hexStr.length % 2) !== 0)
			hexStr = '0' + hexStr;
		return hexStr;
	}
};
/* END OF FILE - ..\js\gxtypes.js - */
/* START OF FILE - ..\js\gxpopup.js - */
gx.popup = (function () {
	var MAX_CHECK_LOADED_TIMES_PDF = 10;

	return {
		lvl: -1,
		currentPopup: null,
		currentPrompt: null,
		showParentPopups: false,

		Dialog: function () {
			this.id = '';
			this.autoresize = 1;
			this.width = 0;
			this.height = 0;
			this.position = 0;
			this.top = 0;
			this.left = 0;
			this.zindex = 1000;
			this.lvl = -1;
			this.parentPopup = null;
			this.window = null;
			this.document = null;
			this.Opener = null;
			this.InternalPopup = null;
			this.state = 'created';
			this.callbacks = {};

			this.open = function (cfg) {
				this.state = 'opening';
				this.id = cfg.id || "gxdialog";
				this.callbacks = cfg.callbacks;
				var resizable = cfg.resizable === undefined || cfg.resizable;
				gx.popup.ext.window(this, false, 0, 0, cfg.w, cfg.h, cfg.contentHtml, "white", cfg.title, "black", "black", "black", "black", true, true, true, resizable, false, gx.ajax.getImageUrl(gx, 'resizeImage'), "PopupHeader", "PopupHeaderButton", "PopupContent", "PopupBorder", "PopupShadow", cfg.showParentPopups, false, cfg.callbacks, cfg.parentElement);
				gx.popup.ext.win.gx.popup.setPopup(this);
				this.state = 'opened'
			};

			this.close = function () {
				this.state = 'closing'
				gx.popup.ext.close(this, this.callbacks.beforeClose);
				this.cleanup();
				this.state = 'closed'
			};

			this.cleanup = function () {
				delete this.InternalPopup;
				delete this.window;
				delete this.document;
				delete this.Opener;
				delete this.parentPopup;
				delete this.InternalPopup;
				delete this.callbacks;
			};

			this.isActive = function () {
				return !(this.state == 'closed' || this.state == 'closing');
			};
			
			this.getEl = function() {
				return gx.dom.byId(this.id + '_b');
			};
		},

		Popup: function (popupData, IsPrompt) {
			this.url = '';
			this.frameDocument = null;
			this.frameWindow = null;
			this.ReturnParms = [];
			this.RawReturnedParms = [];
			this.ModifCtrl = null;
			this.IsPrompt = (IsPrompt) ? IsPrompt : false;
			this.PromptIsGet = false;
			this.OncloseCmds = [];
			this.CustomRenderGrid = null;

			this.setPopupData = function () {
				if (gx.lang.isArray(popupData)) {
					this.url = popupData[0];
					this.autoresize = popupData[1];
					this.width = popupData[2];
					this.height = popupData[3];
					this.position = popupData[4];
					this.top = popupData[5];
					this.left = popupData[6];
					this.OncloseCmds = popupData[7] || [];
					this.ReturnParms = popupData[8] || [];
				}
				else if (popupData && popupData.Url) {
					this.url = popupData.Url;
					if (typeof (popupData.Autoresize) != 'undefined')
						this.autoresize = popupData.Autoresize;
					if (typeof (popupData.Width) != 'undefined')
						this.width = popupData.Width;
					if (typeof (popupData.Height) != 'undefined')
						this.height = popupData.Height;
					if (typeof (popupData.Position) != 'undefined')
						this.position = popupData.Position;
					if (typeof (popupData.Top) != 'undefined')
						this.top = popupData.Top;
					if (typeof (popupData.Left) != 'undefined')
						this.left = popupData.Left;
					if (typeof (popupData.OncloseCmds) != 'undefined')
						this.OncloseCmds = popupData.OncloseCmds;
					if (typeof (popupData.ReturnParms) != 'undefined')
						this.ReturnParms = popupData.ReturnParms;
				}
			}

			this.open = function () {
				this.state = 'opening';
				var pOpener = gx.popup.gxOpener();
				this.lvl = -1;
				if (pOpener && pOpener.gx && pOpener.gx.popup.ext.win && pOpener.gx.popup.ext.win.gx) {
					this.lvl = pOpener.gx.popup.ext.win.gx.popup.lvl;
				}
				else {
					this.lvl = gx.popup.lvl;
				}
				if (document.gxPopup != null) {
					this.parentPopup = document.gxPopup;
					this.zindex = gx.popup.ext.zdx + document.gxPopup.zindex;
				}
				else {
					this.zindex = gx.popup.ext.zdx;
				}
				var sUrl = this.url;
				if (this.IsPrompt) {
					gx.popup.currentPrompt = this;
					var sParms = "?";
					var parm = "";
					var parmValue = "";
					var len = this.ReturnParms.length;
					for (var i = 0; i < len; i++) {
						if (!gx.lang.emptyObject(this.ReturnParms[i].Ctrl))
							parm = gx.util.urlValue(this.ReturnParms[i].Ctrl) + ",";
						else if (typeof this.ReturnParms[i] == "string")
							parm = gx.util.urlValue(this.ReturnParms[i]) + ",";
						else if (typeof this.ReturnParms[i] == "number")
							parm = gx.util.urlValue(this.ReturnParms[i].toString()) + ",";
						else if (this.CustomRenderGrid) {
							parmValue = this.CustomRenderGrid.grid.getCellValue(this.ReturnParms[i].id);
							if (!gx.lang.emptyObject(parmValue))
								parm = gx.util.urlValue(parmValue + "") + ",";
						}
						else if (!gx.lang.emptyObject(this.ReturnParms[i].id)){
							parmValue = gx.fn.getHidden(this.ReturnParms[i].id);
							if (!gx.lang.emptyObject(parmValue)){
								parm = gx.util.urlValue(parmValue);
							}
							parm += ",";
						}
						else
							continue;

						if (this.ReturnParms[i].IOType == 'out')
							sParms += ",";
						else
							sParms += parm;
						if ((this.ReturnParms[i].isLastKey) && (gx.fn.isOutputParm(this.ReturnParms[i])) && (!this.PromptIsGet)) {
							gx.fn.setControlValue('_EventName', this.Opener.CmpContext);
							this.PromptIsGet = true;
						}
					}
					if (this.ModifCtrl != null)
						this.ModifCtrl.value = 1;
					sUrl += sParms;
				}
				var activeElement = document.activeElement;
				if (activeElement == document.body && gx.csv.lastControl) {
					activeElement = gx.csv.lastControl;
				}
				if (activeElement) {
					if (activeElement) {
						this.callerActiveElement = activeElement;
					}
					if (activeElement.blur) {
						activeElement.blur();
					}
				}
				this.InternalPopup = gx.popup.Impl(this, sUrl, this.autoresize, this.width, this.height, this.position, this.top, this.left);
			}

			this.getOutputParms = function () {
				var outputParms = [];
				if (this.IsPrompt) {
					var len = this.ReturnParms.length;
					for (var i = 0; i < len; i++) {
						var promptParm = this.ReturnParms[i];
						if (gx.fn.isOutputParm(promptParm))
							outputParms.push(promptParm);
					}
				}
				else {
					return this.ReturnParms;
				}
				return outputParms;
			}

			this.close = function (cParms) {
				var i;
				this.state = 'closing';
				if (cParms) {
					this.RawReturnedParms = cParms;
				}
				var win = window;
				if (gx.popup.ext.win) {
					win = gx.popup.ext.win;
					gx.ajax.windowClosed(gx.popup.ext.win.gx.popup.lvl);
					gx.popup.ext.win.gx.popup.lvl--;
				}
				else {
					gx.ajax.windowClosed(gx.popup.lvl);
					gx.popup.lvl--;
				}

				var close_impl = function () {
					if (!this.isPdf && this.frameWindow && this.frameWindow.gx) {
						if (this.IsPrompt) {
							if (this.parentPopup == null)
								gx.popup.currentPrompt = null;
							else
								this.parentPopup.frameWindow.gx.popup.currentPrompt = null;
						}
						this.frameWindow.gx.evt.onunload.call(this.frameWindow);
						this.frameDocument.gxPopup = null;
						this.frameDocument = null;
						this.frameWindow = null;
					}
					gx.popup.ext.close(this);
					var returnParms = this.getOutputParms();
					if ((cParms != null) && (this.IsPrompt)) {
						var len = cParms.length;
						var func = gx.popup.assignPromptField;
						var scope = gx.popup;
						if (!gx.lang.emptyObject(this.CustomRenderGrid)) {
							func = this.CustomRenderGrid.grid.setCellValue;
							scope = this.CustomRenderGrid.grid;
						}
						for (i = 0; i < len; i++) {
							func.apply(scope, [returnParms[i], cParms[i]]);
						}
						var edtCtrl = null;
						len = returnParms.length;
						for (i = 0; i < len; i++) {
							var ctrl = returnParms[i].Ctrl;
							if (gx.fn.isAccepted(ctrl)) {
								edtCtrl = ctrl;
							}
						}
						if (edtCtrl && gx.TabOnPrompSelect) {
							var el = gx.fn.getControlIndex(edtCtrl);
							if (el != -1) {
								edtCtrl = gx.fn.searchFocus(el + 1, true);
							}
						}
						gx.fn.setFocus(edtCtrl);

						if (this.PromptIsGet) {
							gx.csv.loadScreen();
							gx.fn.setFocus(edtCtrl); // setFocus before loadScreen does not always work
						} else {
							try {
								gx.evt.ctrlOnchange(gx.fn.getControlValue(this.Opener.CmpContext + 'Mode'),
								gx.fn.getControlValue(this.Opener.CmpContext + 'IsConfirmed'), (typeof (window.GXPkIsDirty) == "undefined" ? false : window.GXPkIsDirty), null, 'eng');
							}
							catch (e) {
								gx.dbg.logEx(e, 'gxpopup.js', 'close');
							}
						}
					}
					else if (cParms) {
						if (returnParms && returnParms instanceof Array && returnParms.length > 0) {
							gx.fn.setReturnParms(this.Opener, returnParms, cParms);
						}
					}
					gx.ajax.dispatchCommands(this.OncloseCmds);
					this.cleanup();
					this.state = 'closed';
				};

				if (gx.util.browser.isFirefox()) {
					win.setTimeout(close_impl.closure(this), 10);
				}
				else {
					close_impl.call(this);
				}
			};

			this.setFocusFirst = function () {
				if (this.frameWindow.gx) {
					this.frameWindow.gx.fn.setFocusOnload();
				}
			}

			this.cleanup = function () {
				try {
					this.OncloseCmds = [];
					this.ReturnParms = [];
					this.PromptIsGet = false;
					this.InternalPopup = null;
					this.window = null;
					this.document = null;
					this.Opener = null;
					this.parentPopup = null;
					this.RawReturnedParms = [];
					this.ModifCtrl = null;
					this.InternalPopup = null;
					this.CustomRenderGrid = null;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxpopup.js', 'popupObj.cleanup');
				}
			}

			this.setPopupData();
		},

		gxOpener: function () {
			var pOpener = null;
			try {
				parent.gxTestAvailable = 1;
				pOpener = parent;
			}
			catch (e) {
			}
			return pOpener;
		},

		setFocus: function () {
			var popUp = this.getPopup();
			if (popUp) {
				popUp.window.frames[0].focus();
			}
		},

		ispopup: function () {
			return (this.getPopup() != null);
		},

		popupurl: function () {
			return this.getPopup().url;
		},

		waitCallback: function (callback) {
			var popup = gx.popup.getPopup();
			if (popup) {
				if (popup.state == 'opened') {
					callback();
				}
				else {
					gx.lang.doCallTimeout(gx.popup.waitCallback, gx.popup, [callback], 50);
				}
			}
			else {
				callback();
			}
		},

		getPopup: function () {
			var pOpener = this.gxOpener();
			try {
				if (!gx.lang.emptyObject(pOpener) && !gx.lang.emptyObject(pOpener.gx)) {
					return pOpener.gx.popup.currentPopup;
				}
			}
			catch (e) {
			}
			return null;
		},

		setPopup: function (gxP) {
			this.currentPopup = gxP;
		},

		open: function (popupData) {
			return this.openPopup(popupData);
		},

		openUrl: function (url, returnParms, props) {
			var az = 1;
			var w = 0;
			var h = 0;
			var p = 0;
			var t = 0;
			var l = 0;
			if (props) {
				az = props[0];
				w = props[1];
				h = props[2];
				p = props[3];
				t = props[4];
				l = props[5];
			}
			return this.openPopup([url, az, w, h, p, t, l, [], returnParms]);
		},

		openPopup: function (popupData) {
			var popup = new this.Popup(popupData, false);
			popup.Opener = gx.O;
			popup.open();
			return popup;
		},

		openDialog: function (dialogCfg) {
			var dialog = new this.Dialog();
			dialog.Opener = gx.O;

			dialog.open(dialogCfg);
			return dialog;
		},

		openPrompt: function (PgmName, PgmParms, IsMod, CmpCtx, InMasterPage, IsAuto) {
			if (gx.popup.currentPrompt == null) {
				var Ctrl = PgmParms[0].Ctrl;
				var isUserControl = false;
				var rowGridId;
				var rowId;
				var grid;
				if (Ctrl) {
					rowGridId = gx.fn.rowGridId(Ctrl);
					rowId = gx.fn.controlRowId(Ctrl);
					if (!gx.lang.emptyObject(rowGridId) && !gx.lang.emptyObject(rowId)) {
						gx.csv.lastGrid = rowGridId;
						gx.fn.setCurrentGridRow(rowGridId, rowId);
					}
				}
				else {
					var vStruct = gx.O.getValidStructFld(PgmParms[0].id);
					if (!gx.lang.emptyObject(vStruct)) {
						grid = gx.O.getGridById(vStruct.grid);
						if (grid) {
							isUserControl = grid.isUsercontrol;
							if (isUserControl) {
								rowGridId = grid.gridId + "";
								rowId = (!gx.lang.emptyObject(grid.grid.getSelectedRow)) ? gx.text.padl(grid.grid.getSelectedRow() + "", 4, "0") : undefined;
								if (!gx.lang.emptyObject(rowGridId) && !gx.lang.emptyObject(rowId)) {
									gx.csv.lastGrid = rowGridId;
									gx.fn.setCurrentGridRow(rowGridId, rowId);
								}
							}
						}
					}
				}
				if (!IsAuto && !this.outParmsAccepted(PgmParms) && !isUserControl)
					return;
				var popup = new this.Popup([PgmName, 1, 0, 0, 0, 0, 0, [], PgmParms], true);
				popup.IsMod = IsMod;
				popup.Opener = gx.getObj(CmpCtx, InMasterPage);
				popup.CustomRenderGrid = grid;
				popup.open();
			}
		},

		outParmsAccepted: function (Parms) {
			var len = Parms.length;
			var anyOut = false;
			for (var i = 0; i < len; i++) {
				var parm = Parms[i];
				if (gx.fn.isOutputParm(parm))
					anyOut = true;
				if (gx.fn.isOutputParm(parm) && parm.Ctrl && gx.fn.isAccepted(parm.Ctrl))
					return true;
			}
			return !anyOut;
		},

		gxReturn: function (Parms) {
			gx.fn.closeWindow(Parms);
		},

		parmId: function (Ctrl) {
			var id = gx.dom.id(Ctrl);
			if (id.indexOf('span_') === 0) {
				id = id.substring(5);
			}
			return id;
		},

		popuplvl: function() {
			var popup = gx.popup.getPopup();
			if (!popup || !popup.window)
				return -1;
			return popup.window.gx.popup.lvl;
		},
		
		assignPromptField: function (Parms, PValue) {
			if (gx.lang.emptyObject(Parms))
				return;
			gx.csv.pkDirty = (Parms.isKey);
			if (!Parms.Ctrl)
				return;
			if (Parms.Ctrl.type == "checkbox" && Parms.Ctrl.value != PValue)
				Parms.Ctrl.checked = !Parms.Ctrl.checked;
			if (Parms.Ctrl.value != PValue && (Parms.isKey))
				gx.popup.gxOpener().GXPkIsDirty = true;
			var ControlId = gx.csv.ctxControlId(this.parmId(Parms.Ctrl));
			var validStruct = gx.O.getValidStructFld(ControlId);
			var toValid;
			if (!gx.lang.emptyObject(validStruct)) {
				toValid = gx.O.getValidStructId(validStruct.fld);
				if (toValid) {
					//Validate previous controls
					if (toValid > gx.O.toValid)
						gx.O.toValid = toValid;
					gx.csv.validateAll()
				}
			}
			if (!gx.lang.emptyObject(validStruct) && !gx.lang.emptyObject(validStruct.v2c) && (validStruct.type == 'date' || validStruct.type == 'dtime')) {
				validStruct.v2v(PValue);
				validStruct.v2c();
			}
			else {
				gx.fn.setControlValue(this.parmId(Parms.Ctrl), PValue, 0);
			}
			Parms.Ctrl.setAttribute("gxvalid", "0");
			gx.evt.execOnchange(Parms.Ctrl);
			var spanObj = gx.dom.byId('span_' + Parms.Ctrl.name);
			if (spanObj != null) {
				if (spanObj.childNodes.length === 0)
					spanObj.appendChild(gx.popup.gxOpener().document.createTextNode(""));
				var spanChild = spanObj.childNodes[0];
				spanChild.nodeValue = PValue;
			}
			if (validStruct && validStruct.gxgrid) {
				validStruct.gxgrid.updateControlValue(validStruct, false);
			}
			gx.util.balloon.clear(ControlId);
			if (toValid) {
				//Validate Parms.Ctrl
				gx.O.toValid = toValid;
				gx.csv.validateAll();
				if (!gx.lang.emptyObject(validStruct.rgrid)) {
					var len = validStruct.rgrid.length;
					for (var i = 0; i < len; i++) {
						validStruct.rgrid[i].filterVarChanged();
					}
				}
			}
		},

		autofit: function () {
			var popup = this.getPopup();
			if (!gx.lang.emptyObject(popup) && popup.state == 'opened') {
				this.ext.autofit(popup, null, false);
			}
		},

		Impl: function (popupObj, url, autoresize, width, height, position, top, left) {
			var headerClass = 'PopupHeader';
			var buttonClass = 'PopupHeaderButton';
			var contentClass = 'PopupContent';
			var borderClass = 'PopupBorder';
			var shadowClass = 'PopupShadow';
			return new this.ext.popUp(popupObj, autoresize, position, left, top, width, height, "gxp", url, "white", "#00385c", "16pt serif", "GxPopup", "#00385c", "white", "lightgrey", "#00568c", "black", true, false, true, true, true, true, false, 'min.gif', 'max.gif', 'close.gif', gx.ajax.getImageUrl(gx, 'resizeImage'), headerClass, buttonClass, contentClass, borderClass, shadowClass, undefined);
		},

		setZIndex: function (ctrl) {
			var zIndex = gx.dom.getStyle(ctrl, 'zIndex');
			if (isNaN(zIndex))
				zIndex = 999;
			zIndex++;
			this.zindex = zIndex;
			this.ext.zdx = zIndex;
		},

		ext: {
			w3c: gx.util.browser.w3c,
			ns4: gx.util.browser.ns4,
			ie5: gx.util.browser.ie5,
			ns6: gx.util.browser.ns6,
			isFF: gx.util.browser.isFirefox(),
			currIDb: null,
			xoff: 0,
			yoff: 0,
			currRS: null,
			rsxoff: 0,
			rsyoff: 0,
			zdx: 1000,
			sdiff: 5,
			win: null,
			doc: null,

			hide: function (id) {
				if (this.w3c) {
					var byId = gx.dom.byId;
					byId(id + '_t').style.visibility = "hidden";
					byId(id + '_c').style.visibility = "hidden";
					byId(id + '_rs').style.visibility = "hidden";
					byId(id + '_b').style.visibility = "hidden";
					byId(id + '_s').style.visibility = "hidden";
				}
			},

			show: function (id) {
				var byId = gx.dom.byId;
				byId(id + '_t').style.visibility = "visible";
				byId(id + '_c').style.visibility = "visible";
				byId(id + '_rs').style.visibility = "visible";
				byId(id + '_b').style.visibility = "visible";
				byId(id + '_s').style.visibility = "visible";
			},

			close: function (popupObj, beforeClose) {
				if (beforeClose && typeof (beforeClose) == 'function' && beforeClose() === false)
					return;
				gx.popup.ext.win = null;
				gx.popup.ext.doc = null;
				gx.popup.ext.currIDb = null;
				gx.popup.ext.currIDs = null;
				gx.popup.ext.currRS = null;
				var id = popupObj.id;
				var shadow = document.getElementById(id + '_s');
				var container = document.getElementById(id + '_b');
				gx.dom.removeControlSafe(shadow);
				var iFrame = document.getElementById(id + '_ifrm');			
				gx.popup.ext.deinitmodal(popupObj);
				gx.popup.setPopup(popupObj.parentPopup);
				var callerActiveElement = popupObj.callerActiveElement;
				if (callerActiveElement && callerActiveElement.focus) {
					callerActiveElement.focus();
				}
				if (popupObj.parentPopup) {
					popupObj.parentPopup.frameWindow.gx.fx.obs.notify("popup.close", [popupObj]);
				}
				else {
					gx.fx.obs.notify("popup.close", [popupObj]);
				}
				if (iFrame)
					iFrame.src = gx.util.getIFrameEmptySrc(); //avoid iframe reloading FFox
				if (gx.util.browser.isIE() && gx.util.browser.ieVersion() == 7) // IE7 bug
				{
					container.parentNode.removeChild(container);
				}
				else {
					gx.dom.removeControlSafe(container);
				}
			},

			move: function (ids, x, y) {
				if (this.w3c) {
					var byId = gx.dom.byId;
					var idb = byId(ids + '_b');
					var idc = byId(ids + '_c');
					ids = byId(ids + '_s');
					idb.style.left = x + 'px';
					ids.style.left = x + this.sdiff + 'px';
					idb.style.top = y + 'px';
					ids.style.top = y + this.sdiff + 'px';
					idc.style.overflow = "hidden";
				}
			},

			resize: function (ids, rx, ry) {
				if (this.w3c) {
					var byId = gx.dom.byId;
					if (byId(ids + '_rs').rsEnable) {
						var waEl = byId(ids + "_extWA");
						var rsEl = byId(ids + "_rs");
						var bEl = byId(ids + "_b");
						var tEl = byId(ids + "_t");
						var sEl = byId(ids + "_s");
						var cEl = byId(ids + "_c");

						var ie5 = this.ie5;
						waEl.style.display = "block";
						rsEl.style.left = Math.max(rx, ((ie5) ? 88 : 92)) + 'px';
						rsEl.style.top = Math.max(ry, ((ie5) ? 68 : 72)) + 'px';
						bEl.style.width = Math.max(rx + ((ie5) ? 12 : 8), 100) + 'px';
						bEl.style.height = Math.max(ry + ((ie5) ? 12 : 8), 80) + 'px';
						tEl.style.width = Math.max(rx + ((ie5) ? 4 : 3), ((this.ns6) ? 95 : 92)) + 'px';
						sEl.style.width = Math.max(rx + 12, ((ie5) ? 100 : 104)) + 'px';
						sEl.style.height = Math.max(ry + ((ie5) ? 12 : 13), ((ie5) ? 80 : 86)) + 'px';
						cEl.style.width = Math.max(rx - ((ie5) ? -5 : 5), ((ie5) ? 92 : 87)) + 'px';
						cEl.style.height = Math.max(ry - ((ie5) ? 24 : 28), 44) + 'px';
						cEl.style.overflow = "hidden";
					}
				}
			},

			ns6bugfix: function () {
				if (navigator.userAgent.indexOf("Netscape/6") > 0) {
					setTimeout('self.resizeBy(0,1); self.resizeBy(0,-1);', 100);
				}
			},

			movepopup: function () {
				if ((this.currIDb != null) && this.w3c) {
					this.move(this.currIDb.cid, gx.evt.mouse.x + this.xoff, gx.evt.mouse.y + this.yoff);
				}
				if ((this.currRS != null) && this.w3c) {
					this.resize(this.currRS.cid, gx.evt.mouse.x + this.rsxoff, gx.evt.mouse.y + this.rsyoff);
				}
				return false;
			},

			stopRS: function (evt, el) {
				document.getElementById(el.cid + "_extWA").style.display = "none";
				gx.popup.ext.currRS = null;
			},

			startRS: function (evt, el) {
				var pExt = gx.popup.ext;
				var ex = (pExt.ie5) ? event.clientX + gx.dom.documentScroll().scrollLeft : evt.pageX;
				var ey = (pExt.ie5) ? event.clientY + gx.dom.documentScroll().scrollTop : evt.pageY;
				pExt.rsxoff = parseInt(el.style.left, 0) - ex;
				pExt.rsyoff = parseInt(el.style.top, 0) - ey;
				pExt.currRS = el;
				if (pExt.ns6) {
					document.getElementById(el.cid + "_c").style.overflow = 'hidden';
				}
				return false;
			},

			changez: function (v) {
				var th = (v != null) ? v : this;
				var pExt = gx.popup.ext;
				var byId = gx.dom.byId;
				if (pExt.ns6) {
					byId(th.cid + "_c").style.overflow = 'hidden';
				}
				byId(th.cid + "_s").style.zIndex = ++pExt.zdx;
				th.style.zIndex = ++pExt.zdx;
				byId(th.cid + "_rs").style.zIndex = ++pExt.zdx;
			},

			stopdrag: function (evt, el) {
				var pExt = gx.popup.ext;
				pExt.currIDb = null;
				document.getElementById(el.cid + "_extWA").style.display = "none";
				pExt.ns6bugfix();
			},

			grab_id: function (evt, el) {
				var pExt = gx.popup.ext,
					byId = gx.dom.byId,
					browser = gx.util.browser;
				gx.evt.mouse.update(evt);
				var ex = gx.evt.mouse.x;
				var ey = gx.evt.mouse.y;
				pExt.xoff = parseInt(byId(el.cid + "_b").style.left, 0) - ex;
				pExt.yoff = parseInt(byId(el.cid + "_b").style.top, 0) - ey;
				pExt.currIDb = byId(el.cid + "_b");
				pExt.currIDs = byId(el.cid + "_s");
				if (browser.isIE() && browser.ieVersion() < 10) {
					byId(el.cid + "_extWA").style.display = "block";
				}
				return false;
			},

			subBox: function (x, y, w, h, bgc, id) {
				var v = document.createElement('div');
				v.setAttribute('id', id);
				v.style.position = 'absolute';
				v.style.left = x + 'px';
				v.style.top = y + 'px';
				v.style.width = w + 'px';
				v.style.height = h + 'px';
				v.style.visibility = 'visible';
				v.style.padding = '0px';
				return v;
			},

			window: function (popupObj, autoSize, x, y, w, h, contentHtml, bgcolor, title, titlecolor, bordercolor, scrollcolor, shadowcolor, ismodal, showonstart, isdrag, isresize, isExt, rsImg, headCls, btnCls, cntCls, brdCls, shdwCls, showParentPopups, swallowKeys, callbacks, parentElement) {
				showParentPopups = (showParentPopups !== undefined) ? showParentPopups : gx.popup.showParentPopups;
				var cid = popupObj.id

				if (!this.win)
					this.win = window;
				if (!this.doc)
					this.doc = this.win.document;

				var byId = this.win.gx.dom.byId.closure(this.win.gx.dom);

				var initialWidth = 100;
				w = Math.max(w, initialWidth);
				h = Math.max(h, 80);
				var rdiv = new this.subBox(w - ((this.ie5) ? 12 : 8), h - ((this.ie5) ? 12 : 8), 7, 7, '', cid + '_rs');
				if (isresize) {
					rdiv.innerHTML = '<img src="' + rsImg + '" width="7" height="7">';
					rdiv.style.cursor = 'se-resize';
				}
				rdiv.rsEnable = isresize;
				var tw = (this.ie5) ? w : w + 4;
				var th = (this.ie5) ? h : h + 6;
				var shadow = new this.subBox(x + this.sdiff, y + this.sdiff, tw, th, shadowcolor, cid + '_s');
				shadow.className = shdwCls;
				if (this.ie5) {
					shadow.style.filter = "alpha(opacity=50)";
				}
				else {
					shadow.style.MozOpacity = 0.5;
				}
				shadow.style.zIndex = ++this.zdx;
				if (!showonstart) {
					shadow.style.visibility = "hidden";
				}
				var outerdiv = new this.subBox(x, y, w, h, bordercolor, cid + '_b');
				outerdiv.className = brdCls;
				outerdiv.style.display = "block";
				outerdiv.style.zIndex = ++this.zdx;
				if (!showonstart) {
					outerdiv.style.visibility = "hidden";
				}
				tw = (this.ie5) ? w - 8 : w - 5;
				th = (this.ie5) ? h + 4 : h - 4;
				var titlebar = new this.subBox(2, 2, tw, 20, titlecolor, cid + '_t');
				titlebar.style.overflow = "hidden";
				titlebar.className = headCls;
				if (!showonstart) {
					titlebar.style.visibility = "hidden";
				}
				titlebar.innerHTML = '<span id="' + cid + '_gxtitle" class="PopupTitle" style="white-space:nowrap;position:absolute;padding: 2px;">' + title + '</span><span class="' + btnCls + '" style="z-index:' + (++this.zdx) + ';" id="' + cid + '_cls"></span>';
				tw = (this.ie5) ? w - 7 : w - 13;
				var content = new this.subBox(2, 24, tw, h - 36, bgcolor, cid + '_c');
				content.className = cntCls;
				if (typeof (contentHtml) == 'string')
					content.innerHTML = contentHtml;
				else
					content.appendChild(contentHtml);

				content.style.overflow = "hidden";
				if (!showonstart) {
					content.style.visibility = "hidden";
				}
				if (!showonstart) {
					outerdiv.style.visibility = "hidden";
				}
				var extWA = new this.subBox(2, 24, 0, 0, '', cid + '_extWA');
				extWA.style.display = "none";
				extWA.style.width = '100%';
				extWA.style.height = '100%';
				outerdiv.appendChild(titlebar);
				outerdiv.appendChild(content);
				outerdiv.appendChild(extWA);
				outerdiv.appendChild(rdiv);
				parentElement = gx.dom.el(parentElement) || this.doc.body;
				parentElement.appendChild(shadow);
				parentElement.appendChild(outerdiv);
				if (!showonstart) {
					this.hide(cid);
				}
				var wB = byId(cid + '_b');
				wB.cid = cid;
				wB.isExt = (isExt) ? true : false;
				var wT = byId(cid + '_t');
				wT.cid = cid;
				if (isresize) {
					var wRS = byId(cid + '_rs');
					wRS.cid = cid;
					gx.evt.attach(wRS, 'mousedown', this.startRS.closure(this, [wRS], true));
					gx.evt.attach(wRS, 'mouseup', this.stopRS.closure(this, [wRS], true));
				}
				var wCLS = byId(cid + '_cls');
				wB.activecolor = titlecolor;
				wB.inactivecolor = scrollcolor;
				gx.evt.attach(wCLS, 'click', callbacks.close || this.close.closure(this, [popupObj, callbacks.beforeClose]));
				if (isdrag) {
					gx.evt.attach(wT, 'mousedown', this.grab_id.closure(this, [wT], true));
					gx.evt.attach(wT, 'mouseup', this.stopdrag.closure(this, [wT], true));
					if (isresize) {
						gx.evt.attach(rdiv.firstChild, 'dragstart', function(e) {
							gx.evt.cancel(e, true);
						}, true);
					}
				}
				if (ismodal || showParentPopups) {
					this.initmodal(popupObj, showParentPopups, swallowKeys);
				}
			},

			popUp: function (popupObj, autoSize, popCentered, x, y, w, h, cid, text, bgcolor, textcolor, fontstyleset, title, titlecolor, titletextcolor, bordercolor, scrollcolor, shadowcolor, ismodal, showonstart, isdrag, isresize, oldOK, isExt, popOnce, minImg, maxImg, clsImg, rsImg, headCls, btnCls, cntCls, brdCls, shdwCls, showParentPopups) {
				var pExt = gx.popup.ext;
				var win;
				if (popupObj.parentPopup != null) {
					win = popupObj.parentPopup.window;
					pExt = win.gx.popup.ext;
					pExt.win = win;
					pExt.doc = win.document;
					gx.popup.ext = pExt;
				}
				else {
					pExt.win = window;
					pExt.doc = pExt.win.document;
				}

				pExt.win.gx.popup.setPopup(popupObj);

				popupObj.window = pExt.win;
				popupObj.document = pExt.doc;

				pExt.win.gx.popup.lvl++;

				cid = cid + pExt.win.gx.popup.lvl;
				popupObj.id = cid;

				if (!popupObj.IsPrompt && !gx.util.sameAppUrl(text)) {
					ismodal = false;
					gx.popup.setPopup(null);
					var ctr = new Date();
					ctr = ctr.getTime();
					var t = (isExt) ? text : '';
					var posn = '';
					if (popCentered == 1) {
						posn = (pExt.ns4) ? 'screenX=' + x + ',screenY=' + y : 'left=' + x + ',top=' + y;
					}
					var pdims = '';
					if (!autoSize) { //autoSize ==0
						pdims = ",width=" + w + ",height=" + h;
					}
					win = window.open(t, "gx" + ctr, "status=no,menubar=no" + pdims + ",resizable=" + ((isresize) ? "yes" : "no") + ",scrollbars=yes," + posn);
				}
				else {
					text += (text.indexOf('?') != -1) ? ',' : '?';
					text += encodeURIComponent('gxPopupLevel=' + pExt.win.gx.popup.lvl + ';');
					var overflow = "auto";
					var scrolling = (gx.HTML5)? '': 'scrolling="off"';
					var contentHtml = '<iframe id="' + cid + '_ifrm" src="' + text + '" width="100%" height="100%" frameborder="0" ' + scrolling + ' style="overflow:' + overflow + ';"></iframe>';

					var callbacks = {
						close: popupObj.close.closure(popupObj)
					};
					pExt.window(popupObj, autoSize, x, y, w, h, contentHtml, bgcolor, title, titlecolor, bordercolor, scrollcolor, shadowcolor, ismodal, showonstart, isdrag, isresize, isExt, rsImg, headCls, btnCls, cntCls, brdCls, shdwCls, showParentPopups, true, callbacks);
					var iFrame = pExt.win.gx.dom.el(cid + '_ifrm');
					gx.lang.doCallTimeout(pExt.showIfLoaded, pExt, [popupObj, iFrame, 1], 50);
				}
			},

			initmodal: function (popupObj, showParentPopups, swallowKeys) {
				popupObj.showParentPopups = showParentPopups;
				if (popupObj.parentPopup == null) {
					gx.ajax.disableForm(swallowKeys);
				}
				else {
					if (showParentPopups) {
						var node = gx.http.notification.node();
						var bEl = gx.dom.el(popupObj.id + "_b");
						if (node && bEl)
							node.style.zIndex = parseInt(bEl.style.zIndex, 0) - 1;
					}
					else
						this.hide(popupObj.parentPopup.id);
				}
			},

			deinitmodal: function (popupObj) {
				if (popupObj.parentPopup == null) {
					gx.ajax.enableForm();
				}
				else {
					if (popupObj.showParentPopups) {
						var node = gx.http.notification.node();
						var bEl = gx.dom.el(popupObj.parentPopup.id + "_b");
						if (node && bEl)
							node.style.zIndex = parseInt(bEl.style.zIndex, 0) - 1;
					}
					this.show(popupObj.parentPopup.id);
					var frame = popupObj.parentPopup.frameWindow;
					if (frame && frame.gx) {
						popupObj.parentPopup.frameWindow.gx.ajax.enableForm();
					}
				}
			},

			isPDFPopup: function (iFrame, popupObj) {
				if (popupObj.isPdf === undefined) {				
					//Hack for IE and FF PDF Plugin. Document cannot be accessed when PDF inside iframe.
					var src = iFrame.src;
					if (gx.util.getContentTypeFromExt(src) == gx.util.contentTypes.pdf) {
						popupObj.isPdf = true;
						return true;
					}

					var doc = true;
					try {
						doc = iFrame.contentDocument;
						doc = iFrame.contentWindow.document;
						if (doc.contentType == gx.util.contentTypes.pdf) {
							popupObj.isPdf = true;
							return true;
						}
					}
					catch (e) {
						doc = false;
					}
					
					if (doc === false) {
						var lastResponseHeader;
						var headInfo = {};
						headInfo.url = src;
						headInfo.method = 'HEAD';
						headInfo.sync = true;
						headInfo.handler = function (type, data, req) { lastResponseHeader = req.getResponseHeader('Content-Type'); };
						headInfo.obj = true;
						gx.http.doCall(headInfo);
						if (lastResponseHeader && lastResponseHeader.indexOf(gx.util.contentTypes.pdf) >= 0) {
							popupObj.isPdf = true;
							return true;
						}
					}
					return false;
				}
				else {
					return popupObj.isPdf;
				}
				
			},

			showIfLoaded: function (popupObj, iFrame, times) {
				try {
					if (popupObj.isActive()) {
						if (this.docReady(iFrame, times) || (times > MAX_CHECK_LOADED_TIMES_PDF && this.isPDFPopup(iFrame, popupObj))) {
							var frameDoc = gx.dom.iFrameDoc(iFrame),
								frameDocLoaded = false;
							try {
								frameDocLoaded = (frameDoc && frameDoc.URL != 'about:blank');
							}
							catch (e) {
							}
							var isPdf = this.isPDFPopup(iFrame, popupObj);
							if (frameDocLoaded || isPdf) {
								popupObj.state = 'opened';
								this.autofit(popupObj, frameDoc, true);
								return;
							}
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxpopup.js', 'showIfLoaded');
				}
				times++;
				gx.lang.doCallTimeout(gx.popup.ext.showIfLoaded, gx.popup.ext, [popupObj, iFrame, times], times * 50);
			},

			docReady: function (iFrame, times) {
				if (iFrame.readyState == 'complete')
					return true;
				var frameDoc = gx.dom.iFrameDoc(iFrame);
				if (frameDoc) {
					var readyState;
					try {
						readyState = (typeof (frameDoc.gxReadyState) != 'undefined') ? frameDoc.gxReadyState : frameDoc.readyState;
					}
					catch(e) {
						return true;
					}
					if (readyState == 'complete')
						return true;
				}
				if (!gx.util.browser.isIE() && times >= 10 && frameDoc && frameDoc.body && frameDoc.body.childNodes.length !== 0) {
					return true;
				}
				return false;
			},

			autofit: function (popupObj, frameDoc, doShow) {
				if (gx.lang.emptyObject(popupObj))
					return;

				var pDoc = document;
				if (pDoc.gxPopup != null)
					popupObj.zindex = this.zdx + pDoc.gxPopup.zindex;
				else
					popupObj.zindex = this.zdx;

				var id = popupObj.id;
				var isPDFPopup = popupObj.isPdf;
				
				if (!this.doc)
					this.doc = popupObj.document;
				pDoc = this.doc;
				var iFrame = pDoc.getElementById(id + '_ifrm');
				if (!frameDoc && gx.popup.ispopup()) {
					frameDoc = gx.dom.iFrameDoc(iFrame);
				}
				popupObj.frameDocument = frameDoc;
				popupObj.frameWindow = iFrame.contentWindow;
				if (frameDoc && !isPDFPopup)
					frameDoc.gxPopup = popupObj;

				var rsEl = pDoc.getElementById(id + '_rs');
				var sEl = pDoc.getElementById(id + '_s');
				var tEl = pDoc.getElementById(id + '_t');
				var bEl = pDoc.getElementById(id + '_b');
				var cEl = pDoc.getElementById(id + '_c');
				var titleEl = pDoc.getElementById(id + '_gxtitle');

				var cElComputedStyle = gx.dom.getComputedStyle(cEl);
				var tElComputedStyle = gx.dom.getComputedStyle(tEl);
				var bElComputedStyle = gx.dom.getComputedStyle(bEl);
				var rsElComputedStyle = gx.dom.getComputedStyle(rsEl);

				var cH = parseInt(cElComputedStyle.height, 0);
				var cW = parseInt(cElComputedStyle.width, 0);

				var vWidth;
				var vHeight;
				var scrollTop;
				var scrollLeft;
				var framePositionX = 0;
				var framePositionY = 0;
				
				var windowInfo = gx.util.getWindowInfo();
				var accessFrame = windowInfo.canAccessFrame;

				titleEl.innerHTML = frameDoc && !isPDFPopup ? frameDoc.title : '';
				
				if (!accessFrame || window == window.top || gx.lang.emptyObject(window.top)) {
					vWidth = window.innerWidth || pDoc.documentElement.clientWidth || pDoc.body.offsetWidth;
					vHeight = window.innerHeight || pDoc.documentElement.clientHeight || pDoc.body.offsetHeight;
					scrollTop = gx.dom.documentScroll(pDoc).scrollTop;
					scrollLeft = gx.dom.documentScroll(pDoc).scrollLeft;
				}
				else {
					var framePosition = gx.dom.position(window.frameElement);
					if (window.top.document.body.clientHeight > pDoc.body.clientHeight) {
						vHeight = pDoc.body.clientHeight;
					}
					else {
						vHeight = window.top.document.body.clientHeight;
						framePositionY = framePosition.y;
					}
					scrollTop = pDoc.body.scrollTop;
					scrollLeft = pDoc.body.scrollLeft;
					
					vWidth = Math.min(window.top.document.body.clientWidth, pDoc.body.clientWidth);
					if (window.top.document.body.clientWidth > pDoc.body.clientWidth) {
						vWidth = pDoc.body.clientWidth;
					}
					else {
						vWidth = window.top.document.body.clientWidth;
						framePositionX = framePosition.x;
					}
				}

				var dims = gx.dom.dimensions(bEl);

				if (!popupObj.autoresize) { //autoresize==0
					cH = popupObj.height - cH + dims.h;
					cW = popupObj.width - cW + dims.w;
				}

				var diffW = popupObj.width - cW;
				var diffH = popupObj.height - cH;

				if (popupObj.autoresize) { //autresize != 0
					if (!isPDFPopup && frameDoc) {
						if (frameDoc.body) {
							var dW = frameDoc.body.scrollWidth + 30 - vWidth;
							var dH = frameDoc.body.scrollHeight + 30 - vHeight;
							var wOffset = 0;
							if (frameDoc.body.scrollWidth > vWidth) {
								var extra = frameDoc.body.scrollWidth - frameDoc.body.clientWidth;
								wOffset += (doShow && extra > 0) ? extra : 0;
							}

							diffW = Math.max(frameDoc.body.scrollWidth, titleEl.clientWidth + 15) - cW - ((dW > 0) ? dW : 0) + wOffset;
							diffH = frameDoc.body.scrollHeight - cH - ((dH > 0) ? dH : 0);
						}
						else if (gx.util.browser.isIE()) {
							if (diffW < 0) diffW = 0;
							if (diffH < 0) diffH = 0;
						}
					}
					else {
						if (isPDFPopup) {
							//Default value when autoresize is enabled and could not get iframe document body height and width. Example: PDF + IE + Popup.
							diffW = pDoc.body.clientWidth / 2;
							diffH = pDoc.body.clientHeight / 2;
						}
					}
				}

				var top = parseInt(popupObj.top, 0);
				var left = parseInt(popupObj.left, 0);

				if (!popupObj.position) { //position  == 0
					top = (vHeight - diffH) / 2 - (dims.h / 2) + scrollTop - framePositionY;
					left = (vWidth - diffW) / 2 - (dims.w / 2) + scrollLeft - framePositionX;

					if (top < 0) {
						top = 5;
						diffH = diffH - 5;
					}
					if (left < 0) {
						left = 5;
						diffW = diffW - 5;
					}
				}

				bEl.style.top = parseInt(top, 0) + "px";
				bEl.style.left = parseInt(left, 0) + "px";
				sEl.style.top = parseInt(top, 0) + this.sdiff + "px";
				sEl.style.left = parseInt(left, 0) + this.sdiff + "px";

				if (!popupObj.autoresize) {//autoresize == 0
					cH = popupObj.height;
					cW = popupObj.width;

					var ie5 = this.ie5;

					rsEl.style.left = Math.max(cW, ((ie5) ? 88 : 92)) + 'px';
					rsEl.style.top = Math.max(cH, ((ie5) ? 68 : 72)) + 'px';

					bEl.style.width = Math.max(cW + ((ie5) ? 12 : 8), 100) + 'px';
					bEl.style.height = Math.max(cH + ((ie5) ? 12 : 8), 80) + 'px';

					tEl.style.width = Math.max(cW + ((ie5) ? 4 : 3), ((this.ns6) ? 95 : 92)) + 'px';

					sEl.style.width = Math.max(cW + 12, ((ie5) ? 100 : 104)) + 'px';
					sEl.style.height = Math.max(cH + ((ie5) ? 12 : 13), ((ie5) ? 80 : 86)) + 'px';

					cEl.style.width = Math.max(cW - ((ie5) ? -5 : 5), ((ie5) ? 92 : 87)) + 'px';
					cEl.style.height = Math.max(cH - ((ie5) ? 24 : 28), 44) + 'px';
				}
				else {
					var resolveValue = function (a, b) {
						var value = parseInt(a, 0) + b;
						return value > 0 ? value : a;
					};
					tEl.style.width = resolveValue(tElComputedStyle.width, diffW) + "px";

					bEl.style.height = resolveValue(bElComputedStyle.height, diffH) + "px";
					bEl.style.width = resolveValue(bElComputedStyle.width, diffW) + "px";

					cEl.style.height = resolveValue(cElComputedStyle.height, diffH) + "px";
					cEl.style.width = resolveValue(cElComputedStyle.width, diffW) + "px";

					var offset = gx.util.browser.isIE() ? 0 : 4;
					sEl.style.height = (parseInt(bElComputedStyle.height, 0) + offset) + "px";
					sEl.style.width = (parseInt(bElComputedStyle.width, 0) + offset) + "px";

					offset = gx.util.browser.isIE() ? 4 : 2;
					rsEl.style.top = (parseInt(bElComputedStyle.height, 0) - parseInt(rsElComputedStyle.height, 0) - offset) + "px";
					rsEl.style.left = (parseInt(bElComputedStyle.width, 0) - parseInt(rsElComputedStyle.width, 0) - offset) + "px";
				}

				if (gx.util.browser.isIPad() || gx.util.browser.isIPhone()) {				
					cEl.style["overflow-y"] = "auto";
					cEl.style["-webkit-overflow-scrolling"] = "touch";
				}
				else
					cEl.style.overflow = "hidden";

				if (doShow)
					this.show(id);
			},

			_init: function () {
				this.w3c = gx.util.browser.w3c;
				this.ns4 = gx.util.browser.ns4;
				this.ie5 = gx.util.browser.ie5;
				this.ns6 = gx.util.browser.ns6;
				setInterval(gx.popup.ext.movepopup.closure(gx.popup.ext), 40);
			}
		},

		_init: function () {
			gx.lang.inherits(this.Popup, this.Dialog)
			this.ext._init();
			var popup = this.getPopup();
			if (popup) {
				try {
					if (popup.frameDocument) {
						popup.frameDocument.gxPopup = popup;
					}
				}
				catch (e) {
					popup.frameDocument = popup.frameWindow.document;
					gx.dbg.logEx(e, 'gxpopup.js', '_init');
				}
				var popupExt = popup.window.gx.popup;
				gx.fx.obs.addObserver('gx.onload', popupExt, function () { this.autofit(); }.closure(popupExt));
				gx.fx.obs.addObserver('grid.onafterrefresh', popupExt, function (gridObj, rows1, rows2) {
					if (rows1 < rows2) {
						this.autofit();
					}
				}.closure(popupExt));
				gx.fx.obs.addObserver('gx.onafterevent', popupExt, function () { this.autofit(); }.closure(popupExt));
			}
		}
	}
})(gx.$);
/* END OF FILE - ..\js\gxpopup.js - */
/* START OF FILE - ..\js\gxcallrpc.js - */
gx.ajax = (function ($) {
	var VAR_QUERYSTRING_REGEX = /\?(.*)/;
	return {
		reqHeader: 'GxAjaxRequest',
		resourceProvider: '',
		dfTimer: null,
		resolveParmKey: function (parm) {
			var key = false;
			if (parm.av) {
				key = parm.av;
			}
			else if (parm.ctrl && parm.prop) {
				key = parm.ctrl + parm.prop;
			}
			else if (parm.ctrl) {
				key = parm.ctrl;
			}
			return key
		},
		
		serviceUrl: function (gxO, ParmString) {
			var url = gx.ajax.selfUrl();
			if (ParmString)
			{					
				if (VAR_QUERYSTRING_REGEX.test(url))
					url = url.replace(VAR_QUERYSTRING_REGEX, '?' + ParmString + ',$1');
				else
					url += '?' + ParmString;
			}
			return url;
		},
		
		message: function (method, gxO, grid, row, serverSide) {
			var deferred;

			return {
				gxO: gxO,
				grid: grid,
				row: row,
				methods: [method],
				addMethod: function (method) {
					this.methods.push(method)
				},
				gridsData: function () {
					var grid = this.gxO.getGridById( this.grid, this.row);
					var pgrid = grid;
					var grids = {};
					if (grid) {
						var fnc = function( grid, grids, ctx) {
							$.each( grid.childGrids, function( i, cgrid) {
								var xgrid = ctx.gxO.getGridById( cgrid.gridId, ctx.row);
								grids[xgrid.gridName] = {id:xgrid.gridId, lastRow:xgrid.lastRowId};
								return fnc( xgrid, grids);});
						}
						fnc( grid, grids, this);
					}
					else {
						$.each( this.gxO.Grids, function( i, cgrid) {
							grids[cgrid.gridName] = {id:cgrid.gridId, lastRow:cgrid.lastRowId};});
						while (pgrid) {
							grids[grid.gridName] = {id:grid.gridId, lastRow:grid.lastRowId};
							pgrid = pgrid.parentGrid;
						}
					}
					return grids;
				},
				to_json: function () {
					var o = {
						MPage: this.gxO.IsMasterPage, 
						cmpCtx: this.gxO.CmpContext, 
						parms: this.parms,
						hsh: this.hashedParms,
						objClass: this.gxO.ServerClass,
						pkgName: this.gxO.PackageName || "", 
						events: this.methods
					};
					if (this.fullPost)
						o.fullPost = this.fullPost;
					this.addGXStateParms(o);
					if (this.grid) {
						o.grid = this.grid;
					}
					o.grids = this.gridsData();
					if (this.row) {
						o.row = this.row.substring(this.row.length - 4);
					}
					return gx.json.serializeJson(o);
				},
				getParmsMetadata: function (type) {
					var parms = [],
						parmsHash = {};
					for (var j = 0, len = this.methods.length; j < len; j++) {
						var method = this.methods[j];
						if (!this.gxO.EvtParms[method])
							continue;
						var methodParms = this.gxO.EvtParms[method][type == "input" ? 0 : 1];
						for (var i = 0; i < methodParms.length; i++) {
							if (methodParms[i].postForm || methodParms[i].sPrefix || methodParms[i].sSFPrefix || methodParms[i].sCompEvt)
								parms.push(methodParms[i]);
							else  {
								var key = gx.ajax.resolveParmKey(methodParms[i]);
								if (key) {
									if (parmsHash[key] === undefined) {
										parmsHash[key] = parms.length;
										parms.push(methodParms[i]);
									}
									else {
										if (parms[parmsHash[key]].grid === undefined && methodParms[i].grid !== undefined) {
											parms[parmsHash[key]] = methodParms[i];
										}
									}
								}
							}
						}
					}
					return parms;
				},
				getInputParms: function () {
					var parmsMetadata = this.getParmsMetadata("input"),
						inputParms = [],
						hashedParms = [],
						parm,
						value,
						vStruct,
						bkpCurrentRow,
						ctrl,
						ctrlJSON;
					for (var i = 0, len = parmsMetadata.length; i < len; i++) {
						parm = parmsMetadata[i];
						if (parm.postForm)	{
							var postInfo = {};
							postInfo.formNode = this.gxO.getContainer() || gx.dom.form();
							this.fullPost = gx.http.getPostData( postInfo, gx.http.postDataFormat.JSON);
							for (var h in gx.http.viewState) {
								if (!this.fullPost[h]) {
									this.fullPost[h] = gx.http.viewState[h];
								}
							}
						}
						else if (parm.prop == 'Referrer') {
							inputParms.push(gx.referrer ? gx.referrer : document.referrer);
						}
						else if (parm.sPrefix) {
							inputParms.push(this.gxO.sPrefix());
						}
						else if (parm.sSFPrefix) {
							inputParms.push('');
						}
						else if (parm.sCompEvt) {
							inputParms.push(gx.fn.getHidden("_EventName").replace(this.gxO.sPrefix(),''));
						}
						else if (parm.ctrl) {
							if (parm.prop) {
								value = gx.fn.getCtrlProperty(parm.ctrl, parm.prop);
							} 
							else {
									vStruct = this.gxO.getValidStructFld(parm.ctrl);
									if (vStruct != null && gx.html.controls.isMultiSelection(vStruct.ctrltype)) {
										ctrl = gx.fn.getControlGridRef(vStruct.fld, vStruct.grid);
										ctrlJSON = gx.dom.comboBoxToObj(ctrl, value);
										if (ctrlJSON) {
											value = ctrlJSON;
										}
									}
								}
							inputParms.push(value);
						}
						else {
							vStruct = parm.fld ? this.gxO.getValidStructFld(parm.fld) : null;
							if (vStruct && typeof (vStruct.c2v) == 'function') {
								vStruct.c2v();
							}

							if (typeof (this.gxO[parm.av]) == 'function') {
								value = this.gxO[parm.av](this.row);
							}
							else if (this.gxO[parm.av] === undefined){
								value = '';
							}
							else {
								value = this.gxO[parm.av];
							}

							if (parm.grid !== undefined) {
								if (vStruct) {
									value = {
										c: [],
										v: value
									};
									bkpCurrentRow = gx.fn.currentGridRowImpl(vStruct.grid);
									for (var j = 1; j <= vStruct.gxgrid.lastRowId; j++) {
										gx.fn.setCurrentGridRow(vStruct.grid, vStruct.gxgrid.getPaddedRowId(j));
										value.c.push(vStruct.val());
									}
									gx.fn.setCurrentGridRow(vStruct.grid, bkpCurrentRow);
								}
								else
								{ 
									if (gx.lang.isArray(value)) { //Collection based grid
										value = {
											c: value,
											v: value[Number(gx.fn.currentGridRowImpl(parm.grid)) - 1]
										};
									}
								}
							}
							inputParms.push(value);
							if (parm.hsh)
								hashedParms.push(gx.fn.getHash(this.gxO.CmpContext, parm.fld));
						}
					}
					return {input:inputParms, hashed: hashedParms};
				},
				addGXStateParms: function (obj) {
					var gxstate = {};
										
					if (gx.webSocket.initialized && gx.fn.getHidden("GX_WEBSOCKET_ID"))
					{
						gxstate.GX_WEBSOCKET_ID = gx.fn.getHidden("GX_WEBSOCKET_ID");
					}
										
					if (!gx.lang.emptyObj(gxstate)) {
						obj.gxstate = gxstate;
					}
				},				
				call: function () {
					deferred = $.Deferred();
					var gxOld = gx.O;
					gx.setGxO(this.gxO);
					var oldRow;
					if (this.grid && this.row) {
						oldRow = gx.fn.currentGridRowImpl(this.grid);
						gx.fn.setCurrentGridRow(this.grid, this.row);
					}
					if (serverSide) {
						var parms = this.getInputParms();
						this.parms = parms.input;
						this.hashedParms = parms.hashed;
						this.doFullAjaxCall(false);
					}
					else {
						this.doClientSideCall();
					}
					if (this.grid && this.row) {
						gx.fn.setCurrentGridRow(this.grid, oldRow);
					}
					gx.setGxO(gxOld);
					return deferred.promise();
				},
				doFullAjaxCall: function (Synch) {
					var ParmString = this.to_json();
					gx.evt.setProcessing(true);
					this.gxO.startFeedback();
					gx.fx.obs.notify('gx.onbeforeevent', [ParmString, Synch]);
					var postInfo = gx.ajax.getPostInfo(this.gxO, ParmString, Synch);
					postInfo.handler = this.postHandlerFullAjax.closure(this);
					postInfo.handleAllStatusCodes = true;
					postInfo.url = gx.ajax.serviceUrl(gx.pO, gx.ajax.encryptParms(this.gxO, 'gxfullajaxEvt'));
					postInfo.reqData = ParmString;
					postInfo.always = this.callback;
					postInfo.contentType = 'application/json';
					gx.http.doCall(postInfo);
				},
				doClientSideCall: function () {
					this.callback();
					deferred.resolve();
				},
				postHandlerFullAjax: function (type, data, event) {
					gx.evt.enter = false;
					gx.csv.lastEvtResponse = null;
					var DataObj;
					if (event.status == gx.http.STATUS_FORBIDDEN) {
						alert( gx.getMessage("GXM_runtimeappsrv") + ' (' + event.status + ')');
					}
					else {
						if (event.status < 200 || event.status > 299) {
							gx.dom.write(event.responseText);
						}
						else {
							DataObj = gx.json.evalJSON(data);
							if (DataObj == null)
								gx.dom.write(data.toString());
							else {
								gx.csv.lastEvtResponse = DataObj;
								gx.ajax.setJsonResponse(DataObj, true, null, this.gxO, this.grid, this.row);
							}
						}
					}
					gx.evt.setProcessing(false);
					deferred.resolve();
					gx.fx.obs.notify('gx.onafterevent', [DataObj]);					
				}
			};
		},

		timeoutActions: {
			ignore: 0,
			warn: 1
		},

		maxGETLength: function (gxObj) {
			// Max GET length varies according to Ajax security level. Parameters after encrypting are much longer than without encryption.
			// The returned value must be compared to unencrypted parameters.
			return (gxObj.AjaxSecurity) ? 600 : 1350;
		},

		getImageUrl: function (_this, imageVar) {
			var imageId = _this[imageVar];
			if (gx.lang.emptyObject(imageId))
				return "";
			if (typeof (imageId) == 'object')
				_this[imageVar] = gx.ajax.imageGuidToUrl(imageId.guid);
			return gx.util.resourceUrl(gx.basePath + gx.staticDirectory + _this[imageVar], true);
		},

		imageGuidToUrl: function (imgId) {
			try {
				if (!gx.lang.emptyObject(this.resourceProvider)) {
					var sUrl = gx.ajax.objectUrl(this.resourceProvider) + '?image,' + encodeURIComponent(imgId) + ',,' + encodeURIComponent(gx.theme);
					gx.http.callBackend('', sUrl, ')', true, gx.http.modes.none, true, 'GET', null, true);
					return gx.http.lastResponse;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxcallrpc.js', 'getImageUrl');
			}
			return imgId;
		},

		sendHeader: function (Headers) {
			try {
				if (!gx.lang.emptyObject(this.resourceProvider)) {
					var sUrl = location.href;
					gx.http.callBackend('', sUrl, ')', true, gx.http.modes.none, true, 'HEAD', null, true, true, Headers);
					return true;
				}
			}
			catch (e) { }
			return false;
		},

		encryptParms: function (gxObj, parms) {
			return (gxObj.AjaxSecurity) ? gx.sec.encrypt(parms) : parms;
		},

		doPost: function (ParmString, Synch, disableForm, callback) {
			if (gx.evt.processing && !gx.csv.validating)
				return;
			gx.evt.setProcessing(true);
			if (disableForm !== false) {
				gx.O.startFeedback();
			}
			gx.fx.obs.notify('gx.onbeforeevent', [ParmString, Synch]);
			gx.fn.objectOnpost();
			gx.http.saveState();
			gx.fn.forceEnableControls(false);
			var postInfo = this.getPostInfo(gx.O, ParmString, Synch);	
			postInfo.url = gx.ajax.serviceUrl(gx.O, ParmString);		
			postInfo.onReady = function () { gx.evt.setProcessing(false); };
			postInfo.always = callback;
			gx.http.doCall(postInfo);
		},

		getPostInfo: function (gxO, ParmString, Synch) {
			var postInfo = {};			
			postInfo.formNode = gx.dom.form();
			postInfo.method = 'POST';
			postInfo.encoding = 'UTF-8';
			postInfo.useCash = false;
			postInfo.gxO = gxO;			
			if (Synch === true)
				postInfo.sync = true;
			postInfo.handler = gx.http.postHandler;
			this.multipartInfo(postInfo);
			return postInfo;
		},	
		
		multipartInfo: function (postInfo) {
			var hasFile = gx.dom.hasSelectedFile();
			if (hasFile) {
				postInfo.multipart = true;
				postInfo.mimetype = "text/html";
				postInfo.formNode.encoding = "multipart/form-data";
			}
		},
	

		dispatchCommands: function (Commands, gxO) {
			gxO = gxO || gx.O;
			if (Commands && Commands.length > 0) {
				var len = Commands.length;
				for (var i = 0; i < len; i++) {
					var Command = Commands[i];
					if (Command.set_focus) {
						gx.fn.usrSetFocus(Command.set_focus, true);
					}
					if (Command.print) {
						gx.printing.print(Command.print);
					}
					if (Command.close) {
						var returnParms = [];
						if (Command.close instanceof Array) {
							returnParms = Command.close;
						}
						gx.fn.closeWindow(returnParms);
					}
					if (typeof (Command.refresh) != 'undefined') {
						if (Command.refresh == 'GET') {
							gx.http.reload(true);
						}
						else {
							var rfrName = 'RFR';
							if (gxO.IsMasterPage)
								rfrName = rfrName + '_MPAGE';
							gx.pO.executeServerEvent(rfrName, true, null, true);
						}
					}
					if (Command.redirect) {						
						Command.redirect.url = gx.ajax.removeGXParms(Command.redirect.url);
						gx.http.redirect(Command.redirect.url, Command.redirect.forceDisableFrm, false, gxO);
					}
					if (Command.cmp_refresh) {
						var cmp = gx.pO.getWebComponent(Command.cmp_refresh);
						gx.evt.dispatcher.dispatch('REFRESH', cmp);
					}
					if (Command.popup) {
						gxO.endFeedback();
						if (Commands.length > i + 1) {
							Command.popup[7] = Commands.slice(i + 1);
						}
						gx.popup.open(Command.popup);
						break;
					}
					if (Command.ucmethod) {
						var ucgxO = gx.getObj(Command.ucmethod.CmpContext, Command.ucmethod.IsMasterPage);
						if (ucgxO) {
							var oldgxO = gx.O;
							gx.setGxO(ucgxO);
							var uc = gx.O.getUserControl(Command.ucmethod.Control);
							if (uc) {
								if (typeof (uc[Command.ucmethod.Method]) == 'function') {
									uc[Command.ucmethod.Method].apply(uc, Command.ucmethod.Parms);
								}
							}
							gx.setGxO(oldgxO);
						}
					}
				}
			}
		},

		ROW_ID_REGEXP: /[0-9]{4}$/,
		
		dispatchPreCommands: function (Commands, gxO, gxComponents, gxHiddens, gxValues, gxGrids, gxProps, row) {
			gxO = gxO || gx.O;
			if (Commands && Commands.length > 0) {
				var len = Commands.length;
				var grid;
				for (var i = 0; i < len; i++) {
					var Command = Commands[i];
					if (Command.load) {
						grid = gxO.getGridById(Command.load.grid, row)
						if (grid) {
							Command.load.props.values = Command.load.values;
							grid.loadNewRows(Command.load.props);
						}
					}
					else if (Command.addlines) {
						grid = gxO.getGridById(Command.addlines.grid, row)
						if (grid)
							grid.getNewRows(Command.addlines.count);
					}
				}
			}
		},

		willLeavePage: function (Commands) {
			if (Commands) {
				var len = Commands.length;
				for (var i = 0; i < len; i++) {
					var Command = Commands[i];
					if (Command.close)
						return true;
				}
			}
			return false;
		},

		hasRedirectCommand: function (Commands) {
			if (Commands) {
				var len = Commands.length;
				for (var i = 0; i < len; i++) {
					var Command = Commands[i];
					if (Command.popup) {
						return false;
					}
					if (Command.redirect) {
						return true;
					}
				}
			}
			return false;
		},

		saveJsonResponse: function (response) {
			this.lastJsonResponse = response;
		},

		clearJsonResponse: function () {
			delete this.lastJsonResponse;
		},

		getJsonResponse: function () {
			return this.lastJsonResponse;
		},

		setPostResponse: function (response) {
			return this.setJsonResponse(response, true, null, gx.O);
		},

		setJsonResponse: function (response, isPostback, afterCmpLoaded, gxO, gridId, row) {
			var fn = gx.fn,
				doFunc = gx.lang.doCall,
				oldGxO,
				oldRow,
				willLeavePage = this.willLeavePage(response.gxCommands);

			var endFeedbackFnc = function(gxO) { 
				if (!gx.popup.currentPopup) {
					gxO.endFeedback();
				}
			};

			if (gxO) {
				oldGxO = gx.O;
				gx.O = gxO;
			}

			if (gridId && row) {
				oldRow = gx.fn.currentGridRow(gridId);
				gx.fn.setCurrentGridRow(gridId, row);
			}
			if (gx.evt.srvCommand) {
				gx.evt.srvCommand = false;
				doFunc(gx.ajax.dispatchCommands, response.gxCommands, gxO);
			}
			else if (this.hasRedirectCommand(response.gxCommands)) {
				doFunc(gx.ajax.dispatchCommands, response.gxCommands, gxO);			
			}
			else if (willLeavePage) {
				doFunc(gx.ajax.dispatchCommands, response.gxCommands, gxO);
			}
			else {
				doFunc(gx.ajax.dispatchPreCommands, response.gxCommands, gxO, response.gxComponents, response.gxHiddens, response.gxValues, response.gxGrids, response.gxProps, row);
				doFunc(fn.clearCompontHiddens, response.gxComponents);
				doFunc(fn.setJsonHiddens, response.gxHiddens);
				doFunc(fn.setJsonComponents, response.gxComponents, response.DynComponentMap, response.gxHiddens, function (newComponents) {
					gx.http.loadStyles();
					gx.updateTheme();
					if (isPostback) {
						gx.fn.installComponents(false);
					}
					if (typeof (afterCmpLoaded) == 'function') {
						afterCmpLoaded();
					}
					if (oldGxO) {
						gx.O = oldGxO;
					}
					var valuesUCs = doFunc(fn.setJsonValues, response.gxValues);
					var propUCs = doFunc(fn.setJsonProperties, response.gxProps, row);
					var newCompUCs = $.map(newComponents, function (comp) {
						var cmpCtx = fn.cmpContextFromCtrl(comp),
							gxWcObj = gx.pO.WebComponents[cmpCtx];
						if (gxWcObj) {
							return gx.lang.objToArray(gxWcObj.UserControls).concat(gxWcObj.getUserControlGrids());
						}
					});
					gx.util.balloon.clearAll();
					fn.enableDisableDelete();
					if (isPostback) {
						doFunc(fn.loadJsonGrids, response.gxGrids, isPostback);
					}
					doFunc(fn.setErrorViewer, response.gxMessages);
					if (isPostback) {
						var userControls;
						if (gx.pO.supportAjaxEvents) {
							userControls = gx.lang.arrayUnique(propUCs.concat(valuesUCs, newCompUCs));
						}
						fn.objectPostback(userControls);
						fn.setFocusAfterLoad(true);
						gx.dom.indexElements();
					}
					endFeedbackFnc(gxO);
					doFunc(gx.ajax.dispatchCommands, response.gxCommands, gxO);
					if (oldRow) {
						gx.fn.setCurrentGridRow(gridId, oldRow);
					}
				}, isPostback);
			}
			return willLeavePage;
		},

		swallowKeys: function (eventObject) {
			eventObject.cancel = true;
		},

		disableForm: function (swallowKeys) {
			swallowKeys = (swallowKeys === undefined) || swallowKeys;
			gx.pO.startFeedback();
			if (swallowKeys) {
				gx.fx.obs.addObserver('gx.keypress', this, this.swallowKeys);
			}
		},

		enableForm: function () {
			if (gx.pO)
				gx.pO.endFeedback();
			gx.fx.obs.deleteObserver('gx.keypress', this, this.swallowKeys);
		},

		isFormEnabled: function () {
			return !gx.http.notification.isVisible();
		},

		executeCliEvent: function (EvtName, Ctrl) {
			try {
				var ctrlRow;
				var eo = gx.lang.emptyObject;
				if (!eo(Ctrl)) {
					var ctrlGrid = gx.fn.rowGridId(Ctrl);
					if (!eo(ctrlGrid)) {
						var gridObj = gx.fn.getGridObj(ctrlGrid);
						if (!eo(gridObj)) {
							ctrlRow = gx.fn.controlRowId(Ctrl) || gx.fn.currentGridRowImpl(ctrlGrid) || '0001';
							gridObj.instanciateRow(ctrlRow);
						}
					}
				}
				gx.O[EvtName].call(gx.O, ctrlRow);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxcallrpc.js', 'executeCliEvent');
			}
		},

		suggest: function (ControlId, ControlRefresh, CtrlSvc, bTypeAhead, suggParms, sdtParms) {
			var CtrlId = ControlRefresh;
			var SuggestProvider = new gx.fx.suggestProvider(ControlId, ControlRefresh, CtrlSvc);
			return new gx.fx.autoSuggestControl(gx.fn.screen_CtrlRef(ControlRefresh), SuggestProvider, CtrlId, bTypeAhead, suggParms, sdtParms);
		},

		hideCode: function (InputParms, ControlId, ControlRefresh) {
			var backcall = "gx.fn.setVarValues(" + gx.lang.arrayToSource(ControlRefresh) + ",";
			var sURL = this.objectUrl() + '?';
			var sParms = 'gxajaxHideCode_' + ControlId;
			var len = InputParms.length;
			for (var i = 0; i < len; i++)
				sParms += ',' + encodeURIComponent(eval(InputParms[i]));
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.retval);
			return this.lastStatus;
		},

		callCrl: function (ActionParameters, ControlRefresh, RefreshGrid) {
			var funcCall = RefreshGrid ? "gx.fn.setGridComboValues" : "gx.fn.setComboValues";
			var ctrlName = RefreshGrid ? ControlRefresh : gx.fn.screen_CtrlRef(ControlRefresh).name;
			var backcall = funcCall + "('" + ctrlName + "',";
			var sURL = this.objectUrl() + '?';
			var sParms = 'gxajaxCallCrl_' + ControlRefresh + ",";
			sParms += this.arrayToUrl(ActionParameters);
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.retval);
		},

		refreshGrid: function (GxGrid, refreshParms) {
			var gxOld = gx.O;
			gx.setGxO(GxGrid.parentObject);

			var method = 'GET',
				sURL = this.objectUrl() + '?',
				allParms = 'gxajaxGridRefresh_' + GxGrid.gridName + ',' + refreshParms,
				postData;

			gx.fx.obs.notify('grid.onbeforerefresh', [GxGrid]);
			// Check parameters length. If too long, send a POST with parameters as form variables.
			GxGrid.autoRefreshing = true;
			gx.csv.autoRefreshing = GxGrid;
			var rowsLen1 = GxGrid.grid.rows.length;
			GxGrid.setPagingVars(0, 0);
			if (allParms.length > gx.ajax.maxGETLength(gx.O)) {
				method = 'POST';

				postData = ["GXEvent=" + gx.ajax.encryptParms(gx.O, "gxajaxGridRefresh_" + GxGrid.gridName)];
				var parmsList = refreshParms.split(',');
				for (var i = 0, len = parmsList.length; i < len; i++)
					postData.push("GXParm" + i + "=" + parmsList[i]);
			}
			else {
				sURL += gx.ajax.encryptParms(gx.O, allParms);
			}
			GxGrid.grid.mask();
			gx.http.doCall({
				method: method,
				url: sURL,
				reqData: postData,
				handler: function (type, responseText) {
					var event = {};
					event.status = 200;
					event.responseText = "";
					gx.http.postHandler(type, responseText, event);
					var rowsLen2 = GxGrid.grid.rows.length;
					gx.fx.obs.notify('grid.onafterrefresh', [GxGrid, rowsLen1, rowsLen2]);
				},
				always: function () {
					gx.csv.autoRefreshing = null;
					GxGrid.autoRefreshing = false;
					GxGrid.grid.unmask();
					gx.setGxO(gxOld);
				}
			});
		},

		newRows: function (CmpCtx, InMasterPage, GridName, gxRows, gxRowIndex, gxRowId, gxParentRow, gHandler) {
			var backcall = "gx.fn.gridObj('" + CmpCtx + "','" + GridName + "'," + InMasterPage.toString() + "').setNewRows(";
			var sURL = this.objectUrl() + '?';
			var sParms = 'gxajaxNewRow_' + GridName + ',' + gxRows + ',' + gxRowIndex + ',' + gxRowId;
			GridName = (gxParentRow) ? (GridName + '_' + gxParentRow) : GridName;
			var gridObj = gx.fn.gridObj(CmpCtx, GridName, InMasterPage);

			if (gx.O.IsComponent)
				sParms += ',' + gx.O.CmpContext;
				
			for (var i = 0; i < gridObj.postingVariables.length; i++) {
				sParms += "," + encodeURIComponent(gridObj.parentObject[gridObj.postingVariables[i]]);
			}
			
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.none);
			var response = gx.http.lastResponse;
			if (response) {
				var newRowsInfo = gx.json.evalJSON(response);
				gHandler.call(gridObj, newRowsInfo);
				gx.dom.indexElements();
			}
		},

		loadCrl: function (GXAction, ActionParameters, ActionResults) {
			if (gx.fn.getControlValue("IsConfirmed") == "1") {
				this.lastStatus = 0;
				return;
			}
			var backcall = "gx.fn.setVarValues(" + gx.lang.arrayToSource(ActionResults) + ",";
			var sURL = this.objectUrl() + '?';
			var sParms = 'gxajaxExecAct_' + GXAction + ',';
			sParms += this.arrayToUrl(ActionParameters);
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.retval);
		},

		udp: function (GXAction, InputParameters, OutputParameters) {
			var backcall = "gx.fn.setVarValues(" + gx.lang.arrayToSource(OutputParameters) + ",";
			var sURL = this.objectUrl() + '?';
			var sParms = GXAction + ',';
			sParms += this.arrayToUrl(InputParameters);
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.retval);
		},

		srvEvt: function (GXEvent, GXAction, InputParameters, OutputParameters) {
			var backcall = "gx.fn.setVarValues(" + gx.lang.arrayToSource(OutputParameters) + ",";
			var sURL = this.objectUrl() + '?';
			var sParms = GXEvent + ',' + GXAction + ',';
			sParms += this.arrayToUrl(InputParameters);
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.full);
		},

		validSrvEvt: function (GXEvent, GXAction, InputParameters, OutputParameters) {
			var backcall = "gx.csv.setValidValues(" + gx.lang.arrayToSource(InputParameters) + "," + gx.lang.arrayToSource(OutputParameters) + ",";
			var sURL = this.objectUrl();
			var sParms = GXEvent + ',' + GXAction + ',' + this.arrayToUrl(InputParameters, true);
			if (sParms.length > this.maxGETLength(gx.O)) {
				this.validAsPost(sURL, backcall, GXEvent, GXAction, InputParameters);
			}
			else {
				sURL += '?' + gx.ajax.encryptParms(gx.O, sParms);
				gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.call, !gx.ajax.isFormEnabled());
			}
		},

		validAsPost: function (sURL, backcall, GXEvent, GXAction, InputParameters) {
			var postData = 'GXEvent=' + gx.ajax.encryptParms(gx.O, GXEvent) + '&GXAction=' + GXAction;
			if (InputParameters.length > 0) {
				postData += '&' + this.getParmsPostData(InputParameters);
			}
			gx.http.callBackend(backcall, sURL, ')', true, gx.http.modes.call, false, 'POST', postData);
		},

		getParmsPostData: function (Parms) {
			var sURL = '';
			for (var i = 0; i < Parms.length; i++) {
				if (i > 0)
					sURL += '&';
				sURL += 'GXParm' + i + '=' + this.parmToUrl(Parms[i], true);
			}
			return sURL;
		},

		getCallerUrl: function (Lvl) {
			if (gx.stackSupported()) {
				var stack = gx.call_stack_storage.get(gx.stackId(Lvl));
				stack = stack || []; //En el stack SIEMPRE hay al menos un elemento que es la url en la que estoy. Por lo tanto pido la anterior. 
				var url = (stack.length == 1 && stack[0] != gx.ajax.selfUrl()) ? stack[0] : "";
				url = (stack.length > 1) ? stack[stack.length - 2] : url;
				return url;
			}
			else {
				return gx.fn.getControlValue("sCallerURL");
			}
		},

		pushReferer: function (PopupLevel, url) {
			if (typeof (url) == 'undefined') {
				url = location.href;
			}
			else {
				url = gx.ajax.absoluteurl(url);
			}
			if (gx.stackSupported()) {
				if (typeof (PopupLevel) == 'undefined') {
					PopupLevel = gx.popup.popuplvl();
				}
				var stack = gx.call_stack_storage.get(gx.stackId(PopupLevel));
				stack = stack || [];
				if (url != gx.util.lastArray(stack))
					stack.push(url);
				gx.call_stack_storage.set(gx.stackId(PopupLevel), stack);
			}
			else {
				var sURL = this.objectUrl() + '?';
				var sParms = "dyncall,PushReferer," + encodeURIComponent(url);
				sURL += gx.ajax.encryptParms(gx.O, sParms);
				gx.http.callBackend('', sURL, '', true, gx.http.modes.none, true);
			}
		},


		windowClosed: function (PopupLevel) {
			if (gx.stackSupported()) {
				if (PopupLevel == -1) {
					var key = gx.stackId(gx.popup.popuplvl());
					var stack = gx.call_stack_storage.get(key);
					stack = stack || [];
					stack.pop();
					gx.call_stack_storage.set(key, stack);
				}
				else {
					gx.call_stack_storage.remove(gx.stackId(PopupLevel));
				}
			} else {
				var serverFunc = '';
				if (PopupLevel == -1)
					serverFunc = ',PopReferer';
				else
					serverFunc = ',DeleteReferer,' + PopupLevel.toString();
				var sURL = this.objectUrl() + '?';
				var sParms = "dyncall" + serverFunc;
				sURL += gx.ajax.encryptParms(gx.O, sParms);
				gx.http.callBackend('', sURL, '', true, gx.http.modes.none, true);
			}
		},

		aggSel: function (ControlId, Act, ActionParameters) {
			var sURL = this.objectUrl() + '?';
			var sParms = 'gxajaxAggSel' + Act + '_' + ControlId + ",";
			sParms += this.arrayToUrl(ActionParameters);
			sURL += gx.ajax.encryptParms(gx.O, sParms);
			var res = gx.http.callBackend(null, sURL, '', false, gx.http.modes.retval);
			return res[0];
		},

		aggSelDecimal: function (ControlId, Act, ThSep, DecPoint, ActionParameters) {
			return gx.num.parseFloat(this.aggSel(ControlId, Act, ActionParameters), ThSep, DecPoint);
		},

		aggSelInteger: function (ControlId, Act, ActionParameters) {
			return parseInt(this.aggSel(ControlId, Act, ActionParameters), 10);
		},

		dynComponent: function (Name, Parms, Prefix, Row) {
			var deferred = $.Deferred();
			Name = Name.toLowerCase();
			var fullName = Name;
			if (gx.gen.isDotNet())
				fullName += '.aspx';
			var sURL = gx.ajax.objectUrl(fullName);
			var GXEvent = 'dyncomponent';
			var postData = 'GXEvent=' + gx.ajax.encryptParms(gx.O, GXEvent) + '&GXAction=' + encodeURIComponent(Prefix) + '&GXParm0=' + encodeURIComponent(Row);
			for (var i = 0; i < Parms.length; i++)
				postData += '&GXParm' + (i + 1).toString() + '=' + encodeURIComponent(typeof(Parms[i].getUrlVal) == 'function' ? Parms[i].getUrlVal() : Parms[i]);

			gx.http.doCall({
				method: 'POST',
				url: sURL,
				reqData: postData,
				handler: function(type, responseText) {
					deferred.resolve(gx.json.evalJSON(responseText));
				},
				error: function() {
					deferred.reject();
				}
			});
			return deferred.promise();
		},

		selfUrl: function () {
			return location.href.replace(/#[\s\S]*$/, '');
		},

		removeGXParms: function (url) {
			return url.replace(/\?gxajaxEvt,?|\?gxportlet,?/, '?');
		},

		arrayToUrl: function (Parameters, serializeControls) {
			var sURL = '';
			var len = Parameters.length;
			for (var i = 0; i < len; i++) {
				sURL += this.parmToUrl(Parameters[i], serializeControls) + ',';
			}
			return sURL;
		},

		parmToUrl: function (Parm, serializeControls) {
			var value = eval(Parm);
			if (value instanceof Array && value.length == 2 && typeof (value[0]) == 'string' && typeof (value[1]) == 'string') // Property
			{
				var validStruct = gx.fn.vStructForVar(value[0]);
				if (validStruct != null) {
					value = gx.fn.getGridCtrlProperty(validStruct.grid, validStruct.fld, value[1]);
				}
			}
			if (serializeControls) {
				var vStruct = gx.fn.vStructForVar(gx.unprefixVar(Parm));
				if (vStruct != null) {
					if (gx.html.controls.isMultiSelection(vStruct.ctrltype)) {
						var ctrl = gx.fn.getControlGridRef(vStruct.fld, vStruct.grid);
						var ctrlJSON = gx.dom.comboBoxToObj(ctrl, value);
						if (ctrlJSON) {
							value = ctrlJSON;
						}
					}
				}
			}
			if (typeof (value) == 'object') {
				value = gx.json.serializeJson(value);
			}
			if (typeof (value) == 'undefined' || value == null) {
				var setted = false;
				if (Parm) {
					var gxoIdx = Parm.indexOf('gx.O.');
					if (gxoIdx === 0) {
						Parm = gx.unprefixVar(Parm);
						var hidVal = gx.fn.getHidden(gx.O.CmpContext + Parm);
						if (hidVal != null && typeof (hidVal) != 'undefined') {
							value = hidVal;
							setted = true;
						}
					}
				}
				if (!setted) {
					value = '';
				}
			}
			return encodeURIComponent(value);
		},

		objectUrl: function (Obj) {
			var ObjUrl = '';
			if (Obj)
				ObjUrl = Obj;
			else {
				if (gx.csv.cmpCtx) //string with length >= 1
					ObjUrl = gx.fn.getControlValue(gx.csv.cmpCtx + '_CMPPGM');
				else
					ObjUrl = gx.ajax.selfUrl();
				if (ObjUrl != null) {
					ObjUrl = ObjUrl.replace(/\?.*/, '');
					ObjUrl = ObjUrl.replace(/#[\s\S]*$/, '');
				}
				ObjUrl = this.objnameFromUrl(ObjUrl);
			}
			return this.absoluteurl(this.objToRelativeUrl(ObjUrl));
		},

		objToRelativeUrl: function (ObjName) {
			if (!this.isabsoluteurl(ObjName)) {
				var pathname = location.pathname;
				if (ObjName != null) {
					var parts = location.pathname.split('/');
					pathname = '';
					var len = parts.length;
					for (var i = 1; i < len - 1; i++)
						pathname += '/' + parts[i];
					pathname += '/' + ObjName;
				}
				return pathname;
			}
			else {
				return ObjName;
			}
		},

		isabsoluteurl: function (url) {
			return (url.search('://') !== -1);
		},

		isRelativeToHost: function (url) {
			return url.substr(0, 1) == '/';
		},

		absoluteurl: function (url) {
			if (!this.isabsoluteurl(url)) {
				if (url.charAt(0) !== '/') {
					var path = '';
					var parts = location.pathname.split('/');

					for (var i = 1; i < parts.length - 1; i++) {
						path += '/' + parts[i];
					}

					return location.protocol + '//' + location.host + path + '/' + url;
				} else {
					return location.protocol + '//' + location.host + url;
				}
			}
			return url;
		},

		objnameFromUrl: function (url) {
			if (url.indexOf('?') >= 0)
				url = url.split('?')[0];
			var parts = url.split('/');
			var len = parts.length;
			if (len === 0)
				return url;
			return parts[len - 1];
		},

		_init: function () {
			this.resourceProvider = gx.fn.getHidden('GX_RES_PROVIDER');
			if (gx.stackSupported()) {
				var nav = gx.json.evalJSON(gx.fn.getHidden("GX_NAV"));
				if (nav) {
					for (var i = 0; i < nav.length; i++) {
						gx.ajax.pushReferer(gx.popup.popuplvl(), nav[i]);
					}
				}
				gx.ajax.pushReferer(gx.popup.popuplvl(), window.location.toString());
			}
		}
	};
})(gx.$);
/* END OF FILE - ..\js\gxcallrpc.js - */
/* START OF FILE - ..\js\gxballoon.js - */
gx.util.balloon = {
	balloons: {},
	timerOn: false,
	lastLbl: null,

	impl: function () {
		this.init = function (id, sourceElements) {
			this.id = id;
			this.balloonid = id + "_Balloon";
			this.hasMessage = false;
			this.messageErr = '';
			this.messageWar = '';
			this.isError = false;
			this.active = true;
			this.errorValue = null;
			this.quirksCompatMode = (gx.csv.compatibleOverlapMode && gx.csv.overlap && (gx.csv.messagePosition == "top" || gx.csv.messagePosition == "bottom"));
			this.sourceElements = sourceElements || [];
		}

		this.clear = function () {
			this.hasMessage = false;
			this.messageErr = '';
			this.messageWar = '';
			this.active = false;
			this.errorValue = null;
			gx.util.balloon.lastLbl = null;
		}

		this.setMessage = function (message) {
			if (!this.hasMessage) {
				this.messageWar = message;
				this.hasMessage = true;
			}
		}

		this.setError = function (message) {
			if (!this.hasMessage) {
				this.messageErr = message;
				this.isError = true;
				this.hasMessage = true;
			}
		}

		this.create = function (id, Control, Class, Msg) {
			var div, txt1, dp, dp1, label;
			var shadowWidth = 2;
			label = document.createElement("span");
			label.id = id;
			label.className = Class;
			div = document.createElement("div");
			if (this.quirksCompatMode) {
				var verticalMargin = 2;
				var Coord = gx.dom.position(Control);
				if (Coord.x === 0 && Coord.y === 0 && Control.parentNode)
					Coord = gx.dom.position(Control.parentNode);
				var CoordLeft = parseInt(Coord.x, 10);
				var CoordTop = parseInt(Coord.y, 10);
				if (CoordLeft <= 0)
					CoordLeft = 10;
				if (CoordTop <= 0)
					CoordTop = 20;
				div.style.position = "absolute";
				
				if (gx.csv.messagePosition == "top") {
					div.style.top = (CoordTop - gx.dom.dimensions(Control).h - (shadowWidth * 2) - verticalMargin) + "px";
					div.style.left = (CoordLeft) + "px";
				}
				if (gx.csv.messagePosition == "bottom") {
					div.style.top = (CoordTop + gx.dom.dimensions(Control).h + verticalMargin) + "px";
					div.style.left = (CoordLeft) + "px";
				}
				div.style.zIndex = 1;
			}
			else {
				div.style.position = "relative";
			}
			label.style.display = "none";
			label.style.className = Class;
			txt1 = document.createTextNode(Msg);
			label.appendChild(txt1);
			div.appendChild(label);
			if (this.quirksCompatMode) {
				document.body.appendChild(div);
			}
			else {
				if (gx.csv.messagePosition == "right" || gx.csv.messagePosition == "bottom") {
					dp = Control.nextSibling;
					dp1 = dp ? dp.firstChild : null;

					if (dp && dp.id && dp.id == 'span_' + this.id)
						dp = dp.nextSibling;

					if (dp && dp.id && dp.id.indexOf("dp_trigger") > 0) {
						Control = dp;
					} else if (dp && dp.nodeName == 'A' && dp1 && dp1.nodeName == 'IMG' && dp1.id && dp1.id.indexOf("PROMPT_") === 0) {
						Control = dp;
					}
					Control.parentNode.insertBefore(div, Control.nextSibling);
				}
				else {
					Control.parentNode.insertBefore(div, Control);
				}
				if (gx.csv.overlap === true) {
					label.style.position = "absolute";
					label.style.zIndex = "1";
				}
				else {
					label.style.position = "relative";
				}
			}
			return label;
		}

		this.getControlValue = function () {
			var values = [gx.fn.getControlValue(this.id)];
			for (var i = 0, len = this.sourceElements.length; i < len; i++) {
				values.push(gx.fn.getControlValue(this.sourceElements[i]));
			}
			return values.join(";");
		};

		this.groupControl = function (id) {
			var Control = gx.dom.el(id);
			if (Control.nodeName === 'INPUT' && Control.type === 'radio') {
				if (Control.parentNode && Control.parentNode.tagName == 'SPAN')
					Control = Control.parentNode;
				else {
					Control = gx.dom.findParentByTagName(Control, 'table');
				}
			}
			return Control;
		}

		this.hideBalloon = function (label) {
			try {
				if (label) {
					label.style.display = "none";
					label.parentNode.style.display = "none";
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxballoon.js', 'hideBalloon');
			}
		}

		this.showBalloon = function (label) {
			try {
				var Control = gx.dom.el(this.id);
				var verticalMargin = 2;

				if (this.quirksCompatMode) {
					label.style.display = "block";
					if (gx.csv.messagePosition == "top" && !this.quirksCompatMode && gx.csv.overlap === true)
						label.style.top = (0 - gx.dom.dimensions(label).h) + "px";
					label.parentNode.style.display = "inline";
				}
				else {
					label.style.display = "inline";
					if (!this.quirksCompatMode) {
						if (gx.csv.messagePosition == "right" || gx.csv.messagePosition == "left") {

							label.parentNode.style.display = "inline";
							if (gx.csv.messagePosition == "left" && gx.csv.overlap === true)
								label.parentNode.style.left = (0 - gx.dom.dimensions(label).w) + "px";
						}
						else {
							if (gx.csv.messagePosition == "bottom" && gx.csv.overlap === true) {
								label.parentNode.style.display = "inline";
								if (!label.parentNode.style.left) {
									var xleft = 0 - (gx.dom.position(label).x - gx.dom.position(Control).x);
									label.parentNode.style.left = (xleft - 1) + "px";
								}
								label.parentNode.style.top = (gx.dom.dimensions(Control).h) + "px";
								label.style.top = "0px"; //FF
							}
							if (gx.csv.messagePosition == "top" && gx.csv.overlap === true)
								label.style.top = (0 - gx.dom.dimensions(label).h - verticalMargin) + "px";
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxballoon.js', 'showBalloon');
			}
		}

		this.show = function (batch) {
			var spanControl, 
				Control, 
				prefix, 
				text, 
				created, 
				label, 
				ControlBalloon, 
				ControlList, 
				i,
				len;
			if (document.readyState !== undefined && document.readyState != 'complete')
				return;
			try {
				if (this.hasMessage === false)
					return true;
				Control = gx.dom.el(this.id);
				if ((Control === null) && (gx.csv.validatingUC !== null))
					Control = gx.csv.validatingUC.getContainerControl();
				if (Control.type == 'hidden') {
					spanControl = gx.dom.el('span_' + this.id);
					if (spanControl !== null)
						Control = spanControl;
				}
				else if (Control.nodeName === 'INPUT' && Control.type === 'radio')
				{
					ControlList = gx.dom.byName(gx.dom.id(Control));
					if (Control.parentNode && Control.parentNode.tagName == 'SPAN')
						Control = Control.parentNode;
					else
					{
						ControlBalloon = ControlList[0];
						Control = gx.dom.findParentByTagName(Control, 'table');
					}
				}
				if (!ControlList) {
					ControlList = [Control];
					for (i = 0, len = this.sourceElements.length; i < len; i++) {
						ControlList.push(gx.dom.el(this.sourceElements[i]));
					}
				}
				else {
					var controls = [];
					for (i = 0, len = ControlList.length; i < len; i++) {
						controls.push(ControlList[i])
					}
					ControlList = controls;
				}

				created = true;
				this.active = true;
				if (this.messageErr.length > 0) {
					prefix = "Error";
					text = this.messageErr;
				}
				else if (this.messageWar.length > 0) {
					prefix = "Warning";
					text = gx.html.encode(this.messageWar);
				}

				if (prefix !== "") {
					var cssClass = prefix + "Messages";
					gx.dom.addPrefixClass(Control, prefix);
					label = gx.dom.byId(this.balloonid);
					if (label) {
						label.innerHTML = text;
						label.className = cssClass;
						created = false;
					}
					else
						label = this.create(this.balloonid, ControlBalloon ? ControlBalloon : Control, cssClass, text);
				}
				if (gx.util.balloon.lastLbl && gx.csv.oneAtAtime)
					this.hideBalloon(gx.util.balloon.lastLbl);
				gx.util.balloon.lastLbl = label;

				if (batch === true) {
					if (!gx.csv.oneAtAtime)
						this.showBalloon(label);
				} else {
					this.showBalloon(label);
				}
				if (gx.util.balloon.timerOn === false && gx.csv.dismissSeconds > 0) {
					gx.util.balloon.timerOn = true;
					this.timerId = setTimeout(function () { gx.util.balloon.clearAll(); }, gx.csv.dismissSeconds * 1000);
				} else if (created) {
					if (gx.csv.oneAtAtime) {
						gx.evt.attach(Control, "mouseout", gx.util.balloon.cvsMouseOutHandler.closure(this));
						gx.evt.attach(Control, "mouseover", gx.util.balloon.cvsMouseOverHandler.closure(this));
					}
					len = ControlList.length;
					for (i = 0; i < len; i++) {
						if (ControlList[i].nodeName === 'INPUT' && ControlList[i].type === 'radio')
							gx.evt.attach(ControlList[i], "change", gx.util.balloon.cvsHide, this);
						else
							gx.evt.attach(ControlList[i], "blur", gx.util.balloon.cvsHide, this);
					}
				}
				this.errorValue = this.getControlValue();
			}
			catch (E) {
				gx.dbg.logEx(E, 'gxballoon.js', 'show');
			}
			return !this.isError;
		}
	},

	cvsHide: function () {
		var Control, ctrl, ctrlValue;
		try {
			Control = this.groupControl(this.id);
			ctrlValue = this.getControlValue();
			if (ctrlValue == this.errorValue) {
				return;
			}
			this.errorValue = ctrlValue;
			ctrl = gx.dom.byId(this.balloonid);
			if (ctrl != null) {
				gx.dom.removePrefixClass(Control, "Error");
				gx.dom.removePrefixClass(Control, "Warning");
				this.hideBalloon(ctrl);
				this.active = false;
			}
		}
		catch (e) { }
	},

	cvsMouseOutHandler: function () {
		if (!this.active) return;
		var label = gx.dom.byId(this.balloonid);
		if (label != null) {
			if (gx.util.balloon.lastLbl) {
				if (gx.util.balloon.lastLbl.id != label.id)
					this.hideBalloon(label);
			} else
				this.hideBalloon(label);
		}
	},

	cvsMouseOverHandler: function () {
		if (!this.active) return;
		var label = gx.dom.byId(this.balloonid);
		if (label != null)
			this.showBalloon(label);
	},

	clearAll: function () {
		var b, hide, index;
		this.timerOn = false;
		for (index in this.balloons) {
			b = this.balloons[index];
			hide = gx.util.balloon.cvsHide.closure(b);
			b.clear();
			hide();
		}
	},

	clear: function (ctrlId) {
		var Id, b, hide;
		try {
			Id = gx.csv.ctxControlId(ctrlId);
			if (this.balloons[Id]) {
				b = this.balloons[Id];
				hide = gx.util.balloon.cvsHide.closure(b);
				b.clear();
				hide();
			}
		}
		catch (e) {
			gx.dbg.logEx(e, 'gxballoon.js', 'clear');
		}
	},

	getNew: function (Id, RowId, SourceElements) {
		SourceElements = SourceElements || [];
		var Ctrl, ctrlId, b, i, len = SourceElements.length;
		if (typeof (RowId) != 'undefined')
			Id = Id + '_' + RowId;
		try {
			Ctrl = gx.fn.screen_CtrlRef(Id);
			ctrlId = gx.dom.id(Ctrl);
			Id = gx.csv.ctxControlId(ctrlId);
			for (i = 0; i < len; i++) {
				Ctrl = gx.fn.screen_CtrlRef(SourceElements[i]);
				ctrlId = gx.dom.id(Ctrl);
				SourceElements[i] = gx.csv.ctxControlId(ctrlId);
			}
		}
		catch (e) {
			gx.dbg.logEx(e, 'gxballoon.js', 'getNew');
		}
		if (this.balloons[Id]) {
			b = this.balloons[Id];
			b.sourceElements = SourceElements || [];
			b.clear();
		}
		else {
			b = new this.impl();
			this.balloons[Id] = b;
			b.init(Id, SourceElements);
		}
		return b;
	}
};
/* END OF FILE - ..\js\gxballoon.js - */
/* START OF FILE - ..\js\gxgrid.js - */
gx.grid = {
	drawAtServer: false,

	deleteMethods: {
		images: 0,
		menu: 1,
		none: 2
	},

	deletePositions: {
		left: 0,
		right: 1,
		bottomR: 2,
		bottomL: 3,
		topR: 4,
		topL: 5
	},

	deleteMethod: null,
	deleteImage: null,
	undeleteImage: null,
	deletePosition: null,
	deletePositionFree: null,
	deleteTooltip: null,
	deleteTitle: null,
	lastFocusCtrl: null,

	styles: {
		none: 0,
		uniform: 1,
		header: 2,
		report: 3
	},

	getImplClass: function (gridObj, implClass) {
		if (implClass) {
			gx.lang.inherits(gx.ui.grid, gx.uc.UserControl, true);
			gx.lang.inherits(gx.ui.grid, gx.grid.impl, true);
			gx.lang.inherits(implClass, gx.ui.grid, true);
			var implObj = new implClass();
			if (gridObj) {
				implObj.ParentObject = gridObj.parentObject;
				implObj.ControlName = gridObj.gridName;
				gridObj.parentObject.setUserControl(implObj);
			}
			return implObj;
		}
		if (gridObj.isResponsive) {
			return new gx.grid.responsiveGrid('gx');
		}
		return new gx.grid.impl('gx');
	},

	validGridColsValue: function (gCols) {
		var validValue = gCols;
		if (gCols != undefined)
			validValue = gCols;
		else
			validValue = 1;
		return (validValue != 0) ? validValue : 9999;
	},

	grid: function (parentObj, gLvl, gLvlName, gId, gName, rgName, cName, gCmpCtx, gIsInMaster, pName, gKey, gFreestyle, gCols, aSelect, aHover, gRows, gPaging, gDragable, gSetsCtx, gBondColl, gWidth, gWidthUnit, newRowtext, pageSizeParm, gHasAddlines, gHasFEL, gImplClass, gOnLineActEvt, aCollap, gBondCollName, gResponsive, gResponsiveCols) {
		var GRID_CLASS = "gx-grid",
			STANDARD_GRID_CLASS = "gx-standard-grid",
			FREESTYLE_GRID_CLASS = "gx-freestyle-grid";

		var propertyValueResolverFnName = function (propName) {
			return rgName.toUpperCase() + (gIsInMaster ? '_MPAGE' : '') + "_" + propName;
		};
		var propertyValueResolverFunction = (function (propertyFn) {
			return (function (parentGridRow) {
				var ownerGrid = this.parentObject.getGridById(gId, parentGridRow || gx.fn.currentGridRow(gId));
				return propertyFn.call(this, ownerGrid || this);
			}).closure(this);
		}).closure(this);
		this.parentObject = parentObj;
		this.parentObject['sub' + gName + '_Rows'] = propertyValueResolverFunction(function (ownerGrid) {
			return ownerGrid.grid.pageSize / ownerGrid.grid.gxGridCols
		});
		this.parentObject[propertyValueResolverFnName('nFirstRecordOnPage')] = propertyValueResolverFunction(function (ownerGrid) {
			return ownerGrid.grid.firstRecordOnPage;
		});
		this.parentObject[propertyValueResolverFnName('nEOF')] = propertyValueResolverFunction(function (ownerGrid) {
			return ownerGrid.grid.eof;
		});
		this.gridLvl = gLvl;
		this.gridLvlName = gLvlName;
		this.gridId = gId;
		this.gridName = gName;
		this.realGridName = rgName;
		this.containerName = cName || this.gridName + "Container";
		this.parentName = pName || "";
		this.pagingParms = [];
		this.lvlKey = gKey || [];
		this.isFreestyle = gFreestyle || false;
		this.isResponsive = gResponsive || false;
		this.allowSelection = aSelect || false;
		this.allowHovering = this.allowSelection && aHover || false;
		this.allowCollapsing = aCollap || false;
		this.collapsed = false;
		this.sortable = true;
		this.selectionColor = null;
		this.hoverColor = null;
		this.visible = true;
		this.refreshTimer = null;
		this.pageSizeParm = pageSizeParm || false;
		this.hasAddlines = gHasAddlines || false;
		this.hasForEachLine = gHasFEL || false;
		this.width = (gWidth != undefined) ? gWidth : 0;
		this.widthUnit = gWidthUnit || '';
		this.gridCols = (gCols != undefined) ? gCols : 1;
		this.gridCols = (this.gridCols != 0) ? this.gridCols : 9999;
		this.gridRows = (gRows != undefined) ? gRows : 5;
		this.gridResponsiveCols = gResponsiveCols || [1, 1, 1, 1];
		this.usePaging = gPaging || false;
		this.usePaging = this.usePaging && !this.isFreestyle;
		this.eof = 1;
		this.firstRecordOnPage = 0;
		this.defaultDragable = gDragable || false;
		this.defaultSetsContext = gSetsCtx || false;
		this.boundedCollType = gBondColl || '';
		this.boundedCollName = gBondCollName || '';
		this.contextMenu = null;
		this.gxContainerCtrl = null;
		this.lastRefreshParms = "";
		this.gxComponentContext = gCmpCtx;
		this.isMasterPageGrid = gIsInMaster;
		this.htmlTags = "";
		this.onLineActivate = gOnLineActEvt;
		this.addingRows = false;
		this.deleteMethod = gx.grid.deleteMethod;
		this.DatePickersControls = [];
		this.GridUserControls = [];
		this.GridComponents = [];
		this.GridControls = [];
		this.implClass = gImplClass;
		this.grid = gx.grid.getImplClass(this, gImplClass);
		this.grid.ownerGrid = this;
		this.grid.parentGxObject = this.parentObject;
		this.grid.gxLvl = this.gridLvl;
		this.grid.gxId = this.gridId;
		this.grid.gxGridName = this.gridName;
		this.grid.gxGridObject = this.containerName;
		this.grid.gxParentName = this.parentName;
		this.grid.gxIsFreestyle = this.isFreestyle;
		this.grid.gxWidth = this.width;
		this.grid.gxWidthUnit = this.widthUnit;
		this.grid.gxHeight = 0;
		this.grid.gxAllowSelection = this.allowSelection;
		this.grid.gxAllowHovering = this.allowHovering;
		this.grid.gxAllowCollapsing = this.allowCollapsing;
		this.grid.gxCollapsed = this.collapsed;
		this.grid.gxSortable = this.sortable;
		this.grid.gxSelectionColor = this.selectionColor;
		this.grid.gxHoverColor = this.hoverColor;
		this.grid.gxVisible = this.visible;
		this.grid.gxGridCols = this.gridCols;
		this.grid.gxGridResponsiveCols = this.gridResponsiveCols;
		this.grid.gxCmpContext = this.gxComponentContext;
		this.grid.gxHtmlTags = this.htmlTags;
		this.grid.gxIsMasterPageGrid = this.isMasterPageGrid;
		this.grid.gxDragable = this.defaultDragable;
		this.grid.gxHasAddlines = this.hasAddlines;
		this.grid.gxHasForEachLine = this.hasForEachLine;
		this.grid.gxOnLineActivate = this.onLineActivate;
		this.grid.gxNewRowText = (newRowtext != undefined) ? newRowtext : "New Row";
		this.currentBuffer = this.grid.gxBuffer;
		this.parentGrid = null;
		this.childGrids = [];
		this.hiddens = [];
		this.oldCmps = {};
		this.ColumnPropertiesAfterRender = [];
		this.isUsercontrol = gx.lang.instanceOf(this.grid, gx.uc.UserControl);
		this.gxCreateGridCode = (function (pRowId) {
			return new gx.grid.grid(this.parentObject, this.gridLvl, this.gridLvlName, this.gridId, this.gridName + '_' + pRowId, this.gridName, this.containerName + '_' + pRowId, this.gxComponentContext, this.isMasterPageGrid, this.parentName, this.lvlKey, this.isFreestyle, this.gridCols, this.allowSelection, this.allowHovering, this.gridRows, this.usePaging, this.defaulDragable, this.defaulSetsContext, this.boundedCollType, this.width, this.widthUnit, this.grid.gxNewRowText, this.pageSizeParm, this.hasAddlines, this.hasForEachLine, this.implClass, this.onLineActivate, this.allowCollapsing);
		}).closure(this);
		this.gxAddColumnsCode = [];
		this.grid.usePaging = this.usePaging;
		this.grid.eof = this.eof;
		this.grid.firstRecordOnPage = this.firstRecordOnPage;
		this.postingVariables = [];

		this.getPaddedRowId = function (nRowId) {
			var str = "" + nRowId;
			var pad = "0000";
			return pad.substring(0, pad.length - str.length) + str;
		};

		this.addColumnDinCode = function (func, args) {
			this.gxAddColumnsCode.push(function () { func.apply(this, args); });
		}

		this.addSingleLineEdit = function (colAttId, colId, colHtmlName, colTitle, colTooltip, colAttName, colType, colWidth, colWidthUnit, colMLength, colSize, colAlign, hasClick, suggestInfo, hcAttId, hcAttName, colVisible, colDecimals, setCtx, isPassword, cssClass, hasTheme, columnClass) {
			this.addColumnDinCode(this.addSingleLineEdit, arguments);
			var newCol = this.newColumn(colTitle, colType, colAlign, colWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxTooltip = colTooltip;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxColSize = colSize;
			newCol.gxSetsContext = setCtx;
			newCol.gxCssClass = cssClass;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.singleLineEdit();
			newCol.gxControl.column = newCol;
			newCol.gxControl.isPassword = isPassword;
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addPostingVar = function (varName) {
			this.postingVariables.push(varName);
		}

		this.addMultipleLineEdit = function (colAttId, colId, colHtmlName, colTitle, colAttName, colType, colWidth, colWidthUnit, colHeight, colHeightUnit, colMLength, colSize, colAlign, hasClick, colVisible, setCtx, colFormat, columnClass) {
			this.addColumnDinCode(this.addMultipleLineEdit, arguments);
			var newCol = this.newColumn(colTitle, colType, colAlign, colWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxSetsContext = setCtx;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.multipleLineEdit();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.heightUnit = colHeightUnit;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addBlob = function (colAttId, colId, colHtmlName, colTitle, colAttName, colType, bDisplay, cHeight, cWidth, cHUnit, cWUnit, colVisible, setCtx, columnClass) {
			this.addColumnDinCode(this.addBlob, arguments);
			var newCol = this.newColumn(colTitle, colType, "left", cWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxWidthUnit = cWUnit;
			newCol.gxSetsContext = setCtx;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.blob();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.height = cHeight;
			newCol.gxControl.width = cWidth;
			this.grid.addColumn(newCol);
		}

		this.addRadioButton = function (colAttId, colId, colHtmlName, colTitle, colAttName, colType, hasClick, colVertical, colVisible, setCtx, columnClass) {
			this.addColumnDinCode(this.addRadioButton, arguments);
			var newCol = this.newColumn(colTitle, colType, "left", '');
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxSetsContext = setCtx;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.radio();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.vertical = colVertical;
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addComboBox = function (colAttId, colId, colHtmlName, colTitle, colAttName, colType, hasClick, rtEnabled, colVisible, setCtx, colWidth, colWidthUnit, columnClass) {
			this.addColumnDinCode(this.addComboBox, arguments);
			var newCol = this.newColumn(colTitle, colType, "left", colWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxSetsContext = setCtx;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.comboBox();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.rtEnabled = (rtEnabled == 1);
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addListBox = function (colAttId, colId, colHtmlName, colTitle, colAttName, colType, hasClick, rtEnabled, colVisible, setCtx, colWidth, colWidthUnit, columnClass, colRows) {
			this.addColumnDinCode(this.addListBox, arguments);
			var newCol = this.newColumn(colTitle, colType, "left", colWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxSetsContext = setCtx;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.listBox();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.rows = (colRows !== undefined ? colRows : 4);
			newCol.gxControl.rtEnabled = (rtEnabled == 1);
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addCheckBox = function (colAttId, colId, colHtmlName, colTitle, colCaption, colAttName, colType, checkedVal, unCheckedVal, hasClick, colVisible, setCtx, colWidth, colWidthUnit, columnClass) {
			this.addColumnDinCode(this.addCheckBox, arguments);
			var newCol = this.newColumn(colTitle, colType, "left", colWidth);
			newCol.visible = colVisible;
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxAttName = colAttName;
			newCol.gxChecked = checkedVal;
			newCol.gxUnChecked = unCheckedVal;
			newCol.gxSetsContext = setCtx;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxColumnClass = columnClass;
			newCol.gxControl = new gx.html.controls.checkBox();
			newCol.gxControl.column = newCol;
			newCol.gxControl.checkedValue = checkedVal;
			newCol.gxControl.uncheckedValue = unCheckedVal;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.visible = newCol.visible;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addBitmap = function (colAttId, colHtmlName, colId, colWidth, colWidthUnit, colHeight, colHeightUnit, hasClick, jsCode, colTitle, cssClass, columnClass) {
			this.addColumnDinCode(this.addBitmap, arguments);
			var newCol = this.newColumn(colTitle, "", "left", colWidth);
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxControl = new gx.html.controls.image();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.width = colWidth;
			newCol.gxControl.widthUnit = colWidthUnit;
			newCol.gxControl.height = colHeight;
			newCol.gxControl.heightUnit = colHeightUnit;
			newCol.gxControl.clickEvent = hasClick;
			newCol.gxCssClass = cssClass;
			newCol.gxColumnClass = columnClass;
			this.grid.addColumn(newCol);
		}

		this.addVideo = function (colAttId, colHtmlName, colId, colWidth, colWidthUnit, colHeight, colHeightUnit, hasClick, jsCode, colTitle, cssClass, columnClass) {
			this.addColumnDinCode(this.addVideo, arguments);
			var newCol = this.newColumn(colTitle, "", "left", colWidth);
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxControl = new gx.html.controls.video();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.width = colWidth;
			newCol.gxControl.widthUnit = colWidthUnit;
			newCol.gxControl.height = colHeight;
			newCol.gxControl.heightUnit = colHeightUnit;
			newCol.gxControl.clickEvent = hasClick;
			newCol.gxCssClass = cssClass;
			newCol.gxColumnClass = columnClass;
			this.grid.addColumn(newCol);
		}

		this.addAudio = function (colAttId, colHtmlName, colId, colWidth, colWidthUnit, colHeight, colHeightUnit, hasClick, jsCode, colTitle, cssClass, columnClass) {
			this.addColumnDinCode(this.addAudio, arguments);
			var newCol = this.newColumn(colTitle, "", "left", colWidth);
			newCol.htmlName = colHtmlName;
			newCol.gxId = colId;
			newCol.gxAttId = colAttId;
			newCol.gxWidthUnit = colWidthUnit;
			newCol.gxControl = new gx.html.controls.audio();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.width = colWidth;
			newCol.gxControl.widthUnit = colWidthUnit;
			newCol.gxControl.height = colHeight;
			newCol.gxControl.heightUnit = colHeightUnit;
			newCol.gxControl.clickEvent = hasClick;
			newCol.gxCssClass = cssClass;
			newCol.gxColumnClass = columnClass;
			this.grid.addColumn(newCol);
		}

		this.addTextBlock = function (colHtmlName, hasClick) {
			this.addColumnDinCode(this.addTextBlock, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = colHtmlName;
			newCol.gxControl = new gx.html.controls.textBlock();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			newCol.gxControl.clickEvent = hasClick;
			this.grid.addColumn(newCol);
		}

		this.addButton = function (ControlId, HtmlName, BorderStyle, GxEvent, EventName) {
			this.addColumnDinCode(this.addButton, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = HtmlName;
			newCol.gxId = ControlId;
			newCol.gxControl = new gx.html.controls.button();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.addGrid = function (GridCtrl) {
			this.addColumnDinCode(this.addGrid, arguments);
			this.childGrids.push(GridCtrl);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = GridCtrl.getContainerControlId();
			newCol.gxControl = new gx.html.controls.grid();
			newCol.gxControl.column = newCol;
			this.grid.addColumn(newCol);
		}

		this.addUsercontrol = function (ControlId, LastId, ClassName, ContainerName, ControlName, ShowFunc, C2VFuncs, V2CFuncs, ColVisible) {
			this.addColumnDinCode(this.addUsercontrol, arguments);
			var colTitle = "",
				gxO = this.parentObject;
			if (gxO.GridUCsProps && gxO.GridUCsProps[ControlName]) {
				colTitle = gxO.GridUCsProps[ControlName].title || "";
			}
			var newCol = this.newColumn(colTitle, "", "left");
			newCol.gxUCId = ControlId;
			newCol.gxUCLastId = LastId;
			newCol.gxUCClassName = ClassName;
			newCol.gxUCContainerName = ContainerName;
			newCol.gxUCControlName = ControlName;
			newCol.gxShowFunc = ShowFunc;
			newCol.gxC2VFuncs = C2VFuncs;
			newCol.gxV2CFuncs = V2CFuncs;
			newCol.visible = ColVisible
			newCol.gxControl = new gx.html.controls.userControl();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.startContainer = function () {
			this.addColumnDinCode(this.startContainer, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.gxControl = new gx.html.controls.userControlContainer();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endContainer = function () {
			this.addColumnDinCode(this.endContainer, arguments);
			this.currentBuffer.append("</div>");
		}

		this.addWebComponent = function (ControlName) {
			this.addColumnDinCode(this.addWebComponent, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.gxControl = new gx.html.controls.webComponent();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.addEmbeddedPage = function (ControlName) {
			this.addColumnDinCode(this.addEmbeddedPage, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.gxControl = new gx.html.controls.embeddedPage();
			newCol.gxControl.column = newCol;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.addHtmlCode = function (Code) {
			this.addColumnDinCode(this.addHtmlCode, arguments);
			this.currentBuffer.append(Code);
		}

		this.startTable = function (CtrlName, TId, Width) {
			this.addColumnDinCode(this.startTable, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = CtrlName + '_' + TId;
			newCol.gxControl = new gx.html.controls.table();
			newCol.gxControl.column = newCol;
			newCol.gxControl.width = Width;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endTable = function () {
			this.addColumnDinCode(this.endTable, arguments);
			this.currentBuffer.append("</table>");
		}

		this.startRow = function (Title, Align, Valign, Bgcolor, Bordercolor, Class) {
			this.addColumnDinCode(this.startRow, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.gxControl = new gx.html.controls.row();
			newCol.gxControl.column = newCol;
			newCol.gxControl.title = Title;
			newCol.gxControl.align = Align;
			newCol.gxControl.verticalAlign = Valign;
			newCol.gxControl.backColor = Bgcolor;
			newCol.gxControl.borderColor = Bordercolor;
			newCol.gxControl.cssClass = Class;
			newCol.gxControl.ownCssClass = Class;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endRow = function () {
			this.addColumnDinCode(this.endRow, arguments);
			this.currentBuffer.append("</tr>");
		}

		this.startCell = function (Title, Align, Valign, Bgcolor, Bordercolor, Height, Width, Colspan, Rowspan, Class) {
			this.addColumnDinCode(this.startCell, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.gxControl = new gx.html.controls.cell();
			newCol.gxControl.column = newCol;
			newCol.gxControl.title = Title;
			newCol.gxControl.align = Align;
			newCol.gxControl.verticalAlign = Valign;
			newCol.gxControl.backColor = Bgcolor;
			newCol.gxControl.borderColor = Bordercolor;
			newCol.gxControl.height = Height;
			newCol.gxControl.width = Width;
			newCol.gxControl.colSpan = Colspan;
			newCol.gxControl.rowSpan = Rowspan;
			newCol.gxControl.cssClass = Class;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endCell = function () {
			this.addColumnDinCode(this.endCell, arguments);
			if (this.isResponsive) {
				this.currentBuffer.append("</div>");
			}
			else {
				this.currentBuffer.append("</td>");
			}
		}

		this.startGroup = function (Id, Caption, Height, Width, ClassName) {
			this.addColumnDinCode(this.startGroup, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = Id;
			newCol.gxControl = new gx.html.controls.group();
			newCol.gxControl.column = newCol;
			newCol.gxControl.id = Id;
			newCol.gxControl.caption = Caption;
			newCol.gxControl.height = Height;
			newCol.gxControl.width = Width;
			newCol.gxControl.cssClass = ClassName;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endGroup = function () {
			this.addColumnDinCode(this.endGroup, arguments);
			this.currentBuffer.append("</fieldset>");
		}

		this.startDiv = function (CtrlName, TId, Height, Width) {
			this.addColumnDinCode(this.startDiv, arguments);
			var newCol = this.newColumn("", "", "left");
			newCol.htmlName = CtrlName + '_' + TId;
			newCol.gxControl = new gx.html.controls.div();
			newCol.gxControl.column = newCol;
			newCol.gxControl.width = Width;
			newCol.gxControl.height = Height;
			newCol.gxControl.dataType = newCol.type;
			this.grid.addColumn(newCol);
		}

		this.endDiv = function () {
			this.addColumnDinCode(this.endDiv, arguments);
			this.currentBuffer.append("</div>");
		}

		this.newColumn = function (colTitle, colType, colAlign, colWidth) {
			var columnType = this.getColumnType(colType);
			var newCol = new gx.grid.column(colTitle, columnType, colWidth, colAlign);
			this.currentBuffer = newCol.buffer;
			newCol.htmlName = '';
			newCol.gxId = '';
			newCol.gxAttId = '';
			newCol.gxAttName = '';
			return newCol;
		}

		this.getColumnType = function (colType) {
			var columnType;
			switch (colType) {
				case 'decimal':
				case 'int':
					columnType = gx.types.numeric;
					break;
				case 'date':
					columnType = gx.types.date;
					break;
				case 'dtime':
					columnType = gx.types.dateTime;
					break;
				case 'boolean':
					columnType = gx.types.bool;
					break;
				case 'Geolocation':
					columnType = gx.types.geolocation;
					break;
				default:
					columnType = gx.types.character;
					break;
			}
			return columnType;
		}

		this.addOldComponent = function (rowId, ctrlId) {
			if (typeof (this.oldCmps[rowId]) == 'undefined') {
				this.oldCmps[rowId] = [];
			}
			this.oldCmps[rowId].push(ctrlId);
		}

		this.updateOldComponents = function () {
			var len = this.grid.rows.length;
			for (var i = 0; i < len; i++) {
				delete this.oldCmps[this.grid.rows[i].gxId];
			}
			for (var rowId in this.oldCmps) {
				var rowCmps = this.oldCmps[rowId];
				while (rowCmps.length > 0) {
					var ctrlName = rowCmps.shift();
					gx.fn.deleteHidden(ctrlName);
				}
				delete this.oldCmps[rowId];
			}
		}

		this.addHidden = function (CtrlName) {
			this.hiddens.push(CtrlName);
		}

		this.addHiddenControl = function (CtrlName, CtrlValue, Persistent) {
			gx.fn.setHidden(CtrlName, CtrlValue);
			if (Persistent != true)
				this.addHidden(CtrlName);
		}

		this.clearHiddens = function () {
			while (this.hiddens.length > 0) {
				var ctrlName = this.hiddens.shift();
				gx.fn.deleteHidden(ctrlName);
			}
		}

		var gridAttributes = {};
		this.setHtmlTags = function (GridProps) {
			gx.lang.apply(gridAttributes, GridProps);

			var HtmlTags = "";
			var HtmlTagsStyle = " style=\"";
			HtmlTagsStyle += gridAttributes.Visible == "0" ? "display:none;" : "";
			HtmlTags += " class=\"" + gridAttributes.Class + "\"";

			var eo = gx.lang.emptyObject;

			HtmlTagsStyle += !eo(gridAttributes.Background) ? ("background:" + gridAttributes.Background + ";") : "";
			HtmlTagsStyle += !eo(gridAttributes.Backcolor) && gridAttributes.Backcolor != "0" ? ("background-color:" + gx.color.html(gridAttributes.Backcolor).Html + ";") : "";
			HtmlTagsStyle += !eo(gridAttributes.Bordercolor) && gridAttributes.Bordercolor != "0" ? ("border-color:" + gx.color.html(gridAttributes.Bordercolor).Html + ";") : "";
			HtmlTags += !eo(gridAttributes.Align) ? (" align=\"" + gridAttributes.Align + "\"") : "";
			HtmlTags += !eo(gridAttributes.Tooltiptext) ? (" title=\"" + gridAttributes.Tooltiptext + "\"") : "";
			HtmlTagsStyle += !eo(gridAttributes.Borderwidth) && gridAttributes.Borderwidth != "0" ? (" border-width:" + gridAttributes.Borderwidth + ";") : "";
			HtmlTags += !eo(gridAttributes.Cellpadding) ? (" cellpadding=\"" + gridAttributes.Cellpadding + "\"") : "";
			HtmlTags += !eo(gridAttributes.Cellspacing) ? (" cellspacing=\"" + gridAttributes.Cellspacing + "\"") : "";
			HtmlTags += !eo(gridAttributes.Height) && gridAttributes.Height != "0" ? (" height=\"" + gridAttributes.Height + "\"") : "";
			HtmlTags += !eo(gridAttributes.Width) && gridAttributes.Width != "0" ? (" width=\"" + gridAttributes.Width + "\"") : "";

			HtmlTags += HtmlTagsStyle + "\"";

			this.htmlTags = gx.text.trim(HtmlTags);
			this.grid.gxHtmlTags = this.htmlTags;

			if (!eo(gridAttributes.Width)) {
				this.grid.gxWidth = gridAttributes.Width;
			}
			if (!eo(gridAttributes.Height)) {
				this.grid.gxHeight = gridAttributes.Height;
			}
		}

		var gridStyles = {};
		this.setGridStyles = function (props) {
			gx.lang.apply(gridStyles, props);

			this.visible = (gridStyles.Visible != undefined) ? gx.lang.gxBoolean(gridStyles.Visible) : true;
			this.setSortable(((gridStyles.Sortable != undefined) ? gx.lang.gxBoolean(gridStyles.Sortable) : true));
			this.background = (gridStyles.Background != undefined) ? gridStyles.Background : '';
			this.cssClass = (gridStyles.Class != undefined) ? gridStyles.Class : '';
			this.titleBackstyle = (gridStyles.Backcolorstyle != undefined) ? gridStyles.Backcolorstyle : gx.grid.styles.none;
			this.titleFont = (gridStyles.Titlefont != undefined) ? gridStyles.Titlefont : '';
			this.linesFont = (gridStyles.Linesfont != undefined) ? gridStyles.Linesfont : '';
			this.borderWidth = (gridStyles.Borderwidth != undefined) ? gridStyles.Borderwidth : '';
			this.toolTipText = (gridStyles.Tooltiptext != undefined) ? gridStyles.Tooltiptext : '';
			try {
				this.backcolor = (gridStyles.Backcolor != undefined) ? gx.color.html(gridStyles.Backcolor).Html : '';
				this.titleBackcolor = (gridStyles.Titlebackcolor != undefined) ? gx.color.html(gridStyles.Titlebackcolor).Html : '';
				this.titleForecolor = (gridStyles.Titleforecolor != undefined) ? gx.color.html(gridStyles.Titleforecolor).Html : '';
				this.linesBackcolorOdd = (gridStyles.Backcolorodd != undefined) ? gx.color.html(gridStyles.Backcolorodd).Html : '';
				this.linesBackcolorEven = (gridStyles.Backcoloreven != undefined) ? gx.color.html(gridStyles.Backcoloreven).Html : '';
				this.bordercolor = (gridStyles.Bordercolor != undefined) ? gx.color.html(gridStyles.Bordercolor).Html : '';
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'setGridStyles');
			}
			this.borderWidth = (gridStyles.Borderwidth != undefined) ? gridStyles.Borderwidth : '';
			this.toolTipText = (gridStyles.Tooltiptext != undefined) ? gridStyles.Tooltiptext : '';

			this.grid.gxCssClass = "";
			this.grid.gxTitleClass = "";
			this.grid.gxFooterClass = "";
			this.grid.gxOddLlinesClass = "";
			this.grid.gxEvenLinesClass = "";

			this.grid.gxBackColor = this.backcolor;
			this.grid.gxTitleBackColor = this.titleBackcolor;
			this.grid.gxTitleForeColor = this.titleForecolor;
			this.grid.gxTitleBackstyle = this.titleBackstyle;
			this.grid.gxTitleFont = this.titleFont;
			this.grid.gxLinesFont = this.linesFont;
			this.grid.gxBackground = this.background;
			this.grid.gxLinesBackcolorOdd = this.linesBackcolorOdd;
			this.grid.gxLinesBackcolorEven = this.linesBackcolorEven;
			this.grid.gxBorderWidth = this.borderWidth;
			this.grid.gxBordercolor = this.bordercolor;
			this.grid.gxToolTipText = this.toolTipText;
			this.grid.gxVisible = this.visible;

			if (this.cssClass != "") {
				this.grid.gxCssClass = this.cssClass;
				this.grid.gxTitleClass = this.cssClass + "Title";
				this.grid.gxFooterClass = this.cssClass + "Footer";
				if (this.titleBackstyle == gx.grid.styles.none) {
					this.grid.gxOddLlinesClass = this.cssClass + "Odd";
					this.grid.gxEvenLinesClass = this.grid.gxOddLlinesClass;
				}
				else if (this.titleBackstyle == gx.grid.styles.uniform) {
					this.grid.gxOddLlinesClass = this.cssClass + "Uniform";
					this.grid.gxEvenLinesClass = this.grid.gxOddLlinesClass;
				}
				else if (this.titleBackstyle == gx.grid.styles.header) {
					this.grid.gxOddLlinesClass = this.cssClass + "Odd";
					this.grid.gxEvenLinesClass = this.grid.gxOddLlinesClass;
				}
				else if (this.titleBackstyle == gx.grid.styles.report) {
					if (this.isFreestyle && (this.gridCols <= 0)) {
						this.grid.gxOddLlinesClass = this.cssClass + "Odd";
						this.grid.gxEvenLinesClass = this.grid.gxOddLlinesClass;
					}
					else {
						this.grid.gxOddLlinesClass = this.cssClass + "Odd";
						this.grid.gxEvenLinesClass = this.cssClass + "Even";
					}
				}
			}
		}

		this.setSortable = function (sortable) {
			if (this.sortable != sortable) {
				this.sortable = sortable;
				var len = this.grid.columns.length;
				for (var i = 0; i < len; i++) {
					this.grid.columns[i].sortable = sortable;
				}
			}
		}

		this.lastRowId = 0;
		this.addRow = function (rowProps) {
			var z, length, lenAux, commonProps;
			var rowId = this.lastRowId++;
			var gxRowIdx = gx.grid.rowId(rowId + 1);
			var row = new gx.grid.row(rowId, rowProps, gxRowIdx, this.grid.gxParentRowId);
			row.gxCmpContext = this.gxComponentContext;
			row.Grids = rowProps.Grids;
			row.ownerGrid = this;
			row.gxLvl = this.gridLvl;
			this.setRowHiddens(rowProps.Hiddens);
			var columns = this.grid.columns;						
			var len = columns.length;
			for (var i = 0; i < len; i++) {
				var column = columns[i];
				if (rowId !== 0) {
					commonProps = this.grid.rows[0].gxProps[i];
					length = rowProps.Props[i].length;
					lenAux = (this.grid.rowsValues)? commonProps.length - 1:commonProps.length;
					for (z = length; z < lenAux; z++) {
						row.gxProps[i].push(commonProps[z]);
					}
				}
				var colProps = rowProps.Props[i];
				var colValue = colProps[colProps.length - 1];
				if (this.grid.rowsValues && !this.autoRefreshing) {
					if (this.grid.rowsValues[rowId] !== undefined)
						colValue = this.grid.rowsValues[rowId][i];
					else
						this.grid.rowsValues[rowId] = colProps;
				}

				row.values[i] = colValue;
				if (this.grid.rowsValues) {
					row.gxProps[i].push(colValue);
				}
				if (this.parentObject.isTransaction()) {
					var idxInKey = this.columnIndexInKey(column.gxAttId);
					if (idxInKey != -1) {
						row.gxKeyValues[idxInKey] = colValue;
					}
				}
			}
			if (this.isFreestyle) {
				row.IsNew = true;
				this.installChildGrids(row);
			}
			this.grid.addRow(row);
			return row;
		}

		this.installChildGrids = function (row) {
			var len = this.childGrids.length;
			for (var i = 0; i < len; i++) {
				var gxChildGrid = this.childGrids[i];
				var rowGrid = gxChildGrid.gxCreateGridCode(row.gxId);
				rowGrid.grid.parentGxObject = this.parentObject;
				var cntName = ((!rowGrid.isMasterPageGrid) ? this.grid.gxCmpContext : 'MP') + rowGrid.realGridName + 'Container';
				rowGrid.gxContainerDivName = cntName + 'Div_' + row.gxId;
				rowGrid.gxContainerDataName = cntName + 'Data_' + row.gxId;
				rowGrid.gxContainerValuesName = cntName + 'DataV_' + row.gxId;
				row.gxGrids.push(rowGrid);
				rowGrid.parentGrid = this;
				rowGrid.parentRow = row;
				this.parentObject.setGrid(rowGrid);
				gxChildGrid.copyPropertiesTo(rowGrid);
				rowGrid.grid.gxCmpContext = this.grid.gxCmpContext;
				rowGrid.grid.gxParentRowId = row.gxId;
				this.installChildGridColumns(rowGrid, gxChildGrid);
			}
		}

		this.installChildGridColumns = function (Grid, gxChildGrid) {
			var len = gxChildGrid.gxAddColumnsCode.length;
			for (var i = 0; i < len; i++) {
				gxChildGrid.gxAddColumnsCode[i].call(Grid);
			}
		}

		this.copyPropertiesTo = function (RowGrid) {
			RowGrid.cssClass = this.cssClass;
			RowGrid.titleBackstyle = this.titleBackstyle;
			RowGrid.titleBackcolor = this.titleBackcolor;
			RowGrid.linesBackcolorOdd = this.linesBackcolorOdd;
			RowGrid.linesBackcolorEven = this.linesBackcolorEven;
			RowGrid.grid.gxCssClass = this.grid.gxCssClass;
			RowGrid.grid.gxTitleClass = this.grid.gxTitleClass;
			RowGrid.grid.gxOddLlinesClass = this.grid.gxOddLlinesClass;
			RowGrid.grid.gxEvenLinesClass = this.grid.gxEvenLinesClass;
			RowGrid.grid.gxAllowCollapsing = this.grid.gxAllowCollapsing;
			RowGrid.grid.gxCollapsed = this.grid.gxCollapsed;
		}

		this.setRowHiddens = function (hiddens) {
			if (hiddens && this.parentObject.isTransaction()) {
				for (var name in hiddens)
					gx.fn.setHidden(name, hiddens[name]);
			}
		}

		this.executeEvent = function (EventName, rowId) {
			gx.evt.setGridEvt(this.gridId.toString(), rowId);
			this.instanciateRow(rowId);
			this.parentObject[EventName].call(this.parentObject, rowId);
		}

		this.getHiddenName = function (HiddenName) {
			var gridRow = '';
			if (this.parentRow) {
				gridRow = '_' + this.parentRow.gxId;
			}
			return this.grid.gxCmpContext + this.realGridName.toUpperCase() + (this.isMasterPageGrid ? '_MPAGE' : '') + "_" + HiddenName + gridRow;
		}

		this.updatePagingVars = function (Eof, FirstRecordOnPage) {
			if (Eof == undefined && FirstRecordOnPage == undefined) {
				this.grid.eof = gx.fn.getHidden(this.getHiddenName("nEOF"));
				this.grid.firstRecordOnPage = gx.fn.getHidden(this.getHiddenName("nFirstRecordOnPage"));
			}
			else {
				this.grid.eof = Eof;
				this.grid.firstRecordOnPage = FirstRecordOnPage;
			}
		}

		this.setPagingVars = function (Eof, FirstRecordOnPage) {
			this.grid.eof = Eof;
			this.grid.firstRecordOnPage = FirstRecordOnPage;
			gx.fn.setHidden(this.getHiddenName("nEOF"), Eof);
			gx.fn.setHidden(this.getHiddenName("nFirstRecordOnPage"), FirstRecordOnPage);
		}

		this.clearDefaultEventHandlers = function () {
			var len = 0;
			if (this.defaultDragable || this.defaultSetsContext) {
				len = this.grid.rows.length;
				for (var i = 0; i < len; i++) {
					var trId = this.containerName + 'Row_' + this.grid.rows[i].gxId;
					if (this.defaultDragable)
						gx.fx.dnd.deleteSource(trId);
					if (this.defaultSetsContext)
						gx.fx.ctx.deleteSetter(trId);
				}
			}
			len = this.grid.columns.length;
			for (var i = 0; i < len; i++) {
				var currCol = this.grid.columns[i];
				if (currCol.gxSetsContext == true) {
					var len1 = this.grid.rows.length;
					for (var j = 0; j < len1; j++) {
						gx.fx.ctx.deleteSetter(currCol.htmlName + '_' + this.grid.rows[j].gxId);
					}
				}
			}
		}

		this.setDefaultEventHandlers = function () {
			var len = 0;
			if (this.defaultDragable || this.defaultSetsContext) {
				if (!gx.lang.emptyObject(this.boundedCollType)) {
					var divId = this.grid.gxCmpContext + this.containerName + "Div";
					var callback = (function () {
						return this.returnGridData();
					}).closure(this);
					if (this.defaultDragable)
						gx.fx.dnd.addSource(this.parentObject, divId, this.cssClass, [this.boundedCollType], callback);
					if (this.defaultSetsContext)
						gx.fx.ctx.addSetter(this.parentObject, divId, this.cssClass, [this.boundedCollType], callback);
				}
				else {
					var evtTypes = this.getRowAsTypes();
					len = this.grid.rows.length;
					for (var i = 0; i < len; i++) {
						var trId = this.gxComponentContext + this.containerName + 'Row_' + this.grid.rows[i].gxId;
						var rowCtrl = gx.dom.el(trId);
						if (rowCtrl != null) {
							rowCtrl.gxGrid = this.containerName;
							rowCtrl.gxGridName = this.gridName;
							rowCtrl.gxId = this.grid.rows[i].gxId;
						}
						trId = this.containerName + 'Row_' + this.grid.rows[i].gxId;
						var callback = (function (rCtrl) {
							return this.returnRowData(rCtrl);
						}).closure(this);
						if (this.defaultDragable)
							gx.fx.dnd.addSource(this.parentObject, trId, this.cssClass, evtTypes, callback);
						if (this.defaultSetsContext)
							gx.fx.ctx.addSetter(this.parentObject, trId, this.cssClass, evtTypes, callback);
					}
				}
			}
			len = this.grid.columns.length;
			for (var i = 0; i < len; i++) {
				var currCol = this.grid.columns[i];
				if (currCol.gxSetsContext == true) {
					var len1 = this.grid.rows.length;
					for (var j = 0; j < len1; j++) {
						var cellCtrl = gx.dom.el(this.gxComponentContext + currCol.htmlName + '_' + this.grid.rows[j].gxId);
						if (cellCtrl != null) {
							cellCtrl.gxHtmlName = currCol.htmlName;
							gx.fx.ctx.addSetter(this.parentObject, currCol.htmlName + '_' + this.grid.rows[j].gxId, "", [currCol.gxAttName], this.returnColumnContext);
						}
					}
				}
			}
		}

		this.returnColumnContext = function (colControl) {
			var Value = '';
			if (colControl.nodeName == "SPAN")
				Value = gx.dom.spanValue(colControl);
			else
				Value = gx.fn.getControlValue_impl(colControl.id);
			if (Value != null)
				return Value;
			return "";
		}

		this.returnRowData = function (rowCtrl) {
			var dragObj = {};
			var row = this.grid.getRowByGxId(rowCtrl.gxId);
			if (row) {
				var len = this.grid.columns.length;
				for (var i = 0; i < len; i++) {
					var colAttName = this.grid.columns[i].gxAttName;
					if (colAttName != "")
						dragObj[colAttName] = row.values[i];
				}
			}
			return dragObj;
		}

		this.returnGridData = function () {
			var gridData = [];
			var len = this.grid.rows.length;
			for (var i = 0; i < len; i++) {
				var dragObj = {};
				gridData[i] = dragObj;
				var row = this.grid.rows[i];
				var len1 = this.grid.columns.length;
				for (var j = 0; j < len1; j++) {
					var colAttName = this.grid.columns[j].gxAttName;
					if (colAttName != "")
						dragObj[colAttName] = row.values[j];
				}
			}
			return gridData;
		}

		this.doDrop = function (dropObj) {
			var rowsQty = (dropObj.length != undefined) ? ropObj.length : 1;
			this.getNewRows(rowsQty, null, function (rows) { this.addDropedRows(rows, dropObj); });
		}

		this.addDropedRows = function (rowsProps, dropObj) {
			var len = dropObj.length;
			if (len != undefined) {
				for (var i = 0; i < len; i++)
					this.setDroppedRow(rowsProps[i], dropObj[i]);
			}
			else
				this.setDroppedRow(rowsProps[0], dropObj);
			this.setNewRows(rowsProps);
		}

		this.setDroppedRow = function (rowProps, dropRow) {
			var len = this.grid.columns.length;
			for (var i = 0; i < len; i++) {
				var colProps = rowProps.Props[i];
				var colAttName = this.grid.columns[i].gxAttName;
				var droppedValue = '';
				if ((colAttName != "") && (dropRow[colAttName] != undefined))
					droppedValue = dropRow[colAttName];
				colProps.Value = droppedValue;
				colProps.FormattedValue = droppedValue;
			}
		}

		this.getRowAsTypes = function () {
			var types = [];
			var len = this.grid.columns.length;
			for (var i = 0; i < len; i++) {
				var colAttName = this.grid.columns[i].gxAttName;
				if (colAttName != "")
					types.push(colAttName);
			}
			return types;
		}

		this.addRows = function (rowsProps) {
			var len = rowsProps.Count;
			this.grid.rowsValues = rowsProps.values;
			for (var i = 0; i < len; i++) {
				var rowProps = rowsProps[i];
				this.addRow(rowProps);
			}
		}

		this.lastRowIsModified = function () {
			if (this.grid.rows.length == 0)
				return false;
			var lastRow = this.grid.rows[this.grid.rows.length - 1];
			if (lastRow.gxExists())
				return true;
			if (!lastRow.gxIsMod())
				return false;
			else
				return true;
		}

		this.getNewRows = function (rows, event, handler) {
			var newRowHdl = (handler != undefined) ? handler : this.setNewRows;
			var keyEvent = gx.util.browser.isFirefox() ? 'keypress' : 'keydown';
			if (event == null || (((event.type == keyEvent && (event.charCode == 32 || event.keyCode == 32 || event.keyCode == 13)) || event.type == 'click') && (this.grid.rows.length == 0 || this.lastRowIsModified()))) {
				gx.csv.pkDirty = false;
				gx.ajax.newRows(this.gxComponentContext, this.isMasterPageGrid, this.realGridName, rows + this.lastRowId, this.lastRowId + 1, (gx.grid.rowId(this.lastRowId + 1) + this.grid.gxParentRowId), this.grid.gxParentRowId, newRowHdl);
				gx.csv.pkDirty = false;
				if (event != null)
					gx.evt.cancel(event, true);
			}
			else if ((event != null) && ((event.keyCode == 32) || (event.keyCode == 13))) {
				gx.evt.cancel(event, true);
			}
		}

		this.setNewRows = function (rowProps) {
			return this.setNewRows_impl(rowProps, function(rowProps) { this.refreshGrid( false);});
		}

		this.loadNewRows = function (rowProps) {
			return this.setNewRows_impl(rowProps, function(rowProps) { this.loadGrid( rowProps, true, true);});
		}

		this.setNewRows_impl = function (rowProps, loadGridfn) {
			var row;
			if (rowProps.Count != undefined) {
				var i = 0;
				if (!this.grid.rowsValues)
					this.grid.rowsValues = [];
				this.grid.rowsValues = this.grid.rowsValues.concat(rowProps.values);
				for (i = 0; i < rowProps.Count; i++) {
					row = this.addRow(rowProps[i]);
					gx.fn.setCurrentGridRow(this.gridId, row.gxId);
				}
				if (rowProps.Count > 0) {
					this.addingRows = true;
					loadGridfn.call( this, rowProps);
					this.addingRows = false;
					this.setFocusFirstControl(rowProps[0]);
				}
			}
			return row;
		}

		this.gxNewRowFocused = function (Ctrl) {
			Ctrl.style.textDecoration = 'underline';
			var firstGridCtrl = gx.fn.firstGridControl(this.gridId);
			gx.evt.onfocus(Ctrl, firstGridCtrl, this.gxComponentContext, this.isMasterPageGrid, '9999', this.gridId);
		}

		this.rowKeyPressed = function (keyEvent) {
			var eventSource = gx.evt.source(keyEvent);
			if (eventSource != undefined) {
				if (keyEvent.ctrlKey && keyEvent.keyCode == 46/*DEL*/) {
					this.setRowDeleted(eventSource);
					gx.evt.cancel(keyEvent, true);
				}
			}
		}

		this.gxHasDuplicateKey = function () {
			var keys = [];
			var rows = this.grid.rows;
			var len = rows.length;
			for (var i = 0; i < len; i++) {
				var row = rows[i];
				if ((row.gxExists() || row.gxIsMod()) && !row.gxDeleted()) {
					var rowKey = "";
					var len1 = row.gxKeyValues.length;
					for (var j = 0; j < len1; j++) {
						rowKey += row.gxKeyValues[j].toString();
					}
					if (keys[rowKey] != undefined)
						return true;
					keys[rowKey] = 1;
				}
			}
			return false;
		}

		this.columnIndexInKey = function (colIdx) {
			var len = this.lvlKey.length;
			for (var i = 0; i < len; i++) {
				if (this.lvlKey[i] == colIdx)
					return i;
			}
			return -1;
		}

		this.refreshVars = [];
		this.addRefreshingVar = function (validStruct) {
			if (gx.lang.emptyObject(validStruct))
				return;
			var eventName = "";
			this.refreshVars[this.refreshVars.length] = validStruct;
			if (validStruct.fld) {
				var varCtrl = gx.dom.el(this.gxComponentContext + validStruct.fld);
				if (varCtrl != undefined) {
					if (gx.lang.emptyObject(validStruct.hc)) {
						if (varCtrl.type == "radio" || (varCtrl.type == "checkbox" && gx.util.browser.isIE() && gx.util.browser.ieVersion() <= 8))
							eventName = "click";
						else if (varCtrl.tagName == "SELECT" || varCtrl.type == "checkbox" )
							eventName = "change";
						else if (!gx.lang.isNumericType(validStruct.type))
							eventName = ["keyup", "input"];
						else if (gx.lang.isNumericType(validStruct.type))
							eventName = "blur";

						if (eventName != "") {
							if (varCtrl.type == "radio") {
								var radioGroup = gx.dom.byName(this.gxComponentContext + validStruct.fld);
								var len = radioGroup.length;
								for (var i = 0; i < len; i++) {
									gx.evt.attach(radioGroup[i], eventName, function () {
										this.filterVarChanged();
									}, this);
								}
							}
							else {
								if (varCtrl.type == "search")
									eventName = [eventName, "search"];
								gx.evt.attach(varCtrl, eventName, function () {
									this.filterVarChanged();
								}, this);
							}
						}
					}
				}
			}
		}
		
		this.doRefresh = function() {
			var refreshParms = this.getRefreshParmsUrl();
			this.callAsyncRefresh(refreshParms);
		}
		
		this.filterVarChanged = function () {
			if (this.parentObject.autoRefresh && !gx.grid.drawAtServer) {
				var refreshParms = this.getRefreshParmsUrl();
				if (this.lastRefreshParms != refreshParms) {
					this.lastRefreshParms = refreshParms;
					this.callAsyncRefresh();
				}
			}
			else {
				this.parentObject.conditionsChanged = this.conditionsChanged();
			}
		}

		this.conditionsChanged = function () {
			var varsLen = this.refreshVars.length;
			for (var i = 0; i < varsLen; i++) {
				var vStruct = this.refreshVars[i];
				if (typeof (vStruct.rfrVar) == 'undefined') {
					var oldValue = gx.fn.getHidden(this.gxComponentContext + 'GXH_' + vStruct.fld);
					var newValue = vStruct.val();
					if (oldValue != newValue) {
						return true;
					}
				}
			}
			return false;
		}

		this.getRefreshParmsUrl = function () {
			var refreshParms = "";
			if (this.pageSizeParm)
				refreshParms = this.grid.pageSize + ",";
			var varsLen = this.refreshVars.length;
			for (var i = 0; i < varsLen; i++) {
				var vStruct = this.refreshVars[i];
				if (typeof (vStruct.rfrVar) != 'undefined') {
					var filterValue = undefined;
					var ctrlName = undefined;
					if (typeof (vStruct.rfrProp) != 'undefined') {
						var col;
						if (typeof (vStruct.gxAttId) != 'undefined')
							col = this.grid.getColumnByGxAttId(vStruct.gxAttId);
						if (!col) {
							col = this.grid.getColumnForVar(vStruct.rfrVar);
						}

						if (col) {
							var propName = vStruct.rfrProp.toLowerCase();
							filterValue = col[propName];
							if (propName == 'value' && col.gxControl.type == gx.html.controls.types.image)
								filterValue = gx.util.removeBaseUrl(filterValue);
						}
						else {
							filterValue = "";
						}
					}
					else {
						if (typeof (this.parentObject.VarControlMap[vStruct.rfrVar]) != 'undefined') {
							ctrlName = this.parentObject.VarControlMap[vStruct.rfrVar].id;
						}
			                        if (!gx.lang.emptyObject(this.parentObject[vStruct.rfrVar])) {
                        			    filterValue = this.parentObject[vStruct.rfrVar];
			                        }
			                        else
			                 		if (typeof(filterValue) == 'undefined' && typeof(ctrlName) != 'undefined') {
                        			    filterValue = gx.fn.getHidden(this.gxComponentContext + ctrlName);
			                        }
                        			if (typeof(filterValue) == 'object') {
			                            filterValue = gx.json.serializeJson(filterValue);
						}
					}
					refreshParms += encodeURIComponent(filterValue) + ",";
				}
				else {
					if (!gx.lang.emptyObject(vStruct.hc))
						refreshParms += encodeURIComponent(this.parentObject[vStruct.hc]) + ",";
					else
						refreshParms += this.getFormattedParm(vStruct) + ",";
					gx.fn.setHidden(this.gxComponentContext + 'GXH_' + vStruct.fld, vStruct.val());
				}
			}
			if (this.parentObject.IsComponent) {
				refreshParms += encodeURIComponent(this.parentObject.CmpContext) + ",";
			}
			return refreshParms;
		}

		this.initRefreshParms = function () {
			if (this.parentObject.autoRefresh) {
				this.lastRefreshParms = this.getRefreshParmsUrl();
			}
		}

		this.getFormattedParm = function (vStruct) {
			if (vStruct.type == 'date') {
				var ctrl = gx.dom.el(this.gxComponentContext + vStruct.fld);
				return encodeURIComponent(gx.date.urlDate(ctrl, gx.dateFormat));
			}
			else if (vStruct.type == 'dtime') {
				var ctrl = gx.dom.el(this.gxComponentContext + vStruct.fld);
				return encodeURIComponent(gx.date.urlDateTime(ctrl, gx.dateFormat));
			}
			return encodeURIComponent(vStruct.val());
		}

		this.callAsyncRefresh = function (refreshParms, timeout) {			
			if (!gx.evt.refreshGridCallback)
				gx.evt.refreshGridCallback = [];
			if (this.refreshTimer != null) {
				window.clearTimeout(this.refreshTimer);
				this.refreshTimer = null;
				gx.evt.setReady(true);
			}
			gx.evt.setReady(false);
			this.refreshTimer = window.setTimeout((function () {
				if (this.autoRefreshing) {
					this.callAsyncRefresh(refreshParms);
				}
				else {
					gx.fx.obs.addObserver('grid.onafterrefresh', gx.evt, gx.evt.notifyRefreshGrid, {single:true});
					if (typeof(refreshParms) === 'undefined') {
						refreshParms = this.getRefreshParmsUrl();
					}
					gx.ajax.refreshGrid(this, refreshParms);
					gx.evt.setReady(true);
				}
			}).closure(this), timeout || 400);
		}

		this.updatePropsHidden = function (newProps) {
			var propsCtrlName = this.getDataHiddenName();
			gx.fn.setHidden(propsCtrlName, newProps);
		}

		this.updatePagingVarsAfterRefresh = function (gridRows) {
			if (this.usePaging) {
				var eof = this.grid.gxGridName.toUpperCase() + "_nEOF";
				var firstPage = this.grid.gxGridName.toUpperCase() + "_nFirstRecordOnPage";
				this.setPagingVars(gridRows[eof], gridRows[firstPage]);
			}
		}
		this.getSelection = function () {
			if (this.allowSelection) {
				var len = this.grid.rows.length;
				for (var i = 0; i < len; i++) {
					var row = this.grid.rows[i];
					if (row.selected) {
						return i;
					}
				}
			}
			return -1;
		}

		this.setSelection = function (idx) {
			if (this.allowSelection && idx >= 0) {
				var cRow = gx.grid.rowId(idx + 1);
				var rowCtrl = gx.dom.el(this.grid.gxCmpContext + this.grid.gxGridObject + "Row_" + cRow);
				if (rowCtrl)
					this.grid.setRowSelected(rowCtrl, cRow);
			}
		}

		this.blankGridRows = function () {
			this.lastRowId = 0;
			this.grid.rows = [];
			delete this.grid.rowsValues;
		}

		this.setRowDeleted = function (rowCtrl) {
			var row = null;
			if (typeof (rowCtrl) == 'string') {
				row = this.grid.getRowByGxId(rowCtrl);
			}
			else {
				row = (rowCtrl.gxId == undefined) ? this.getRowFromHtmlCtrl(rowCtrl) : rowCtrl;
			}
			row.setDeleted(!row.gxDeleted());
			this.setRowModified(row.gxId);
			gx.fn.removeGridRow(row.gxId, this.gridId.toString());
			this.refreshGrid(false);
		}

		this.setFocusFirstControl = function (rowProps) {
			for (var i = 0; i < rowProps.Count; i++) {
				var row = this.grid.getRowByGxId(gx.grid.rowId(this.lastRowId) + this.grid.gxParentRowId);
				if (row) {
					var focusCtrl = gx.dom.el(this.grid.gxCmpContext + this.grid.columns[i].htmlName + "_" + row.gxId);
					if (focusCtrl != undefined && gx.fn.isAccepted(focusCtrl)) {
						gx.grid.lastFocusCtrl = this.grid.columns[i].gxId;
						gx.fn.setFocus(focusCtrl);
						break;
					}
				}
			}
		}

		this.instanciateRow = function (cRow) {
			var bkpObj = gx.O;
			gx.setGxO(this.parentObject);
			try {
				var row = cRow;
				if (typeof (row) == "string")
					row = this.grid.getRowByGxId(cRow);
				if (row != null) {
					gx.fn.setCurrentGridRow(this.gridId, row.gxId);
					var len = row.values.length;
					for (var i = 0; i < len; i++) {
						var column = this.grid.columns[i];
						if (column.gxId != '') {
							var validStruct = this.parentObject.getValidStruct(column.gxId);
							if (validStruct) {
								if (this.isUsercontrol) {
									if (validStruct.v2v) {
										validStruct.v2v(this.grid.properties[row.id][column.index].value);
										gx.fn.setHidden(this.grid.properties[row.id][column.index].id, this.grid.properties[row.id][column.index].value);
									}
								}
								else {
									if (typeof (validStruct.c2v) == 'function')
										validStruct.c2v();
								}
							}
						}
					}
				}
				else {
					gx.fn.setCurrentGridRow(this.gridId, cRow);
					var len = this.grid.columns.length;
					for (var i = 0; i < len; i++) {
						var column = this.grid.columns[i];
						if (column.gxId != '') {
							var validStruct = this.parentObject.getValidStruct(column.gxId);
							if (validStruct && typeof (validStruct.c2v) == 'function') {
								validStruct.c2v();
							}
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'instanciateRow');
			}
			gx.setGxO(bkpObj);
			return true;
		}

		this.setRenderProp = function (PropName, HiddenName, PropValue, PropType) {
			this.grid.setProp(PropName, HiddenName, PropValue, PropType);
		}

		this.setRenderDynProp = function (PropName, HiddenName, PropValue, PropType) {
			this.grid.setDynProp(PropName, HiddenName, PropValue, PropType);
		}

		this.addRenderEventHandler = function (EventName, Handler) {
			this.grid.addEventHandler(EventName, Handler);
		}

		this.cleanup = function () {
			this.parentObject = null;
			this.parentGrid = null;
			this.grid.ownerGrid = null;
			this.grid.parentGxObject = null;
			this.grid.container = null;
			this.grid.ascLabel = null;
			this.grid.descLabel = null;
			this.grid.columns = null;
			this.grid.rows = null;
			this.grid = null;
		}

		this.loadGrid = function (postProps, isPostback, addRows) {			
			gx.dbg.logPerf('loadGrid_' + this.gridName);
			var bkpObj = gx.O;
			gx.setGxO(this.parentObject);
			this.isLoading = true;
			var isTrn = this.parentObject.isTransaction();
			if (isTrn && this.contextMenu == null)
				this.contextMenu = new gx.grid.contextMenu(this);
			if (postProps != undefined) {
				var divCtrl = this.getContainerControl();
				if (divCtrl != null) {
					if (isPostback) {
						if (!addRows)
							postProps.values = this.getValuesFromHidden();
						if (this.isFreestyle && gx.lang.emptyObject(this.parentRow)) {
							this.backupComponents();
						}
					}
					this.deleteGridData();
					this.grid.setContainerDelayed(divCtrl);
					this.clearHiddens();
					this.setRowsProperty();
					var sel = this.getSelection();
					if (!addRows)
						this.blankGridRows();
					this.setHtmlTags(postProps);
					this.setGridStyles(postProps);
					this.setDeleteMethod(postProps.DeleteMethod);
					this.setSelectionAndHover(postProps.Allowselection, postProps.Selectioncolor, postProps.Allowhover, postProps.Hovercolor);
					this.setCollapsing(postProps.Allowcollapsing, postProps.Collapsed);
					this.setSflColumns(postProps.SflColumns);
					this.setColumnsProperties(postProps.Columns);
					if (this.autoRefreshing)
						this.updatePagingVarsAfterRefresh(postProps);
					else
						this.updatePagingVars();
					if (!addRows)
						this.addRows(postProps);
					this.updateOldComponents();
					this.initRefreshParms();
					this.refreshGrid(null, this.autoRefreshing);
					this.setSelection(sel);
				}
			}
			else {
				this.clearHiddens();
				this.setRowsProperty();
				this.grid.pageSize = (isTrn || this.isFreestyle) ? 9999 : this.gridRows;
				var divCtrl = this.getContainerControl();
				if (divCtrl != null) {
					this.grid.setContainerDelayed(divCtrl);
					var rowsProps = this.getRowsFromHidden();
					if (rowsProps != null) {
						rowsProps.values = this.getValuesFromHidden();
						this.blankGridRows();
						this.setHtmlTags(rowsProps);
						this.setGridStyles(rowsProps);
						this.setDeleteMethod(rowsProps.DeleteMethod);
						this.setSelectionAndHover(rowsProps.Allowselection, rowsProps.Selectioncolor, rowsProps.Allowhover, rowsProps.Hovercolor);
						this.setCollapsing(rowsProps.Allowcollapsing, rowsProps.Collapsed);
						this.setSflColumns(rowsProps.SflColumns);
						this.setColumnsProperties(rowsProps.Columns);
						this.updatePagingVars();
						this.addRows(rowsProps);
						this.initRefreshParms();
						this.addingRows = true;
						this.refreshGrid();
						this.addingRows = false;
					}
					else {
						this.blankGridRows();
						this.updatePagingVars();
						this.initRefreshParms();
						this.refreshGrid();
					}
				}
				else {
					this.loadWrappedGridChilds();
				}
			}
			this.isLoading = false;
			gx.setGxO(bkpObj);
			gx.dbg.logPerf('loadGrid_' + this.gridName, "Grid '" + this.gridName + "' loaded");
		}

		this.loadWrappedGridChilds = function () {
			try {
				var rows = gx.fn.getHidden(this.grid.gxCmpContext + "nRC_GXsfl_" + this.gridId);
				if (typeof (rows) != 'undefined') {
					rows = parseInt(rows);
					for (var i = 0; i < rows; i++) {
						var len = this.grid.columns.length;
						for (var j = 0; j < len; j++) {
							var column = this.grid.columns[j];
							if (column.gxControl.type == gx.html.controls.types.userControl) {
								this.addUsercontrolToDraw({ r: gx.grid.rowId(i + 1), c: column });
							}
						}
					}
					this.setupGridUsercontrols(this.GridUserControls);
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'loadWrappedGridChilds');
			}
		}

		this.getRowsFromHidden = function () {
			var propsCtrlName = this.getDataHiddenName();
			var ctrlsProps = gx.fn.getHidden(propsCtrlName);
			var rowsProps = null;
			gx.json.setNonSerializable(propsCtrlName);
			if (typeof(ctrlsProps) == "string") {
				return gx.json.evalJSON(ctrlsProps);
			}
			if (typeof(ctrlsProps) == "object") {
				return ctrlsProps;
			}
			return null;
		}

		this.deleteGridData = function () {
			var propsCtrlName = this.getDataHiddenName();
			gx.json.setNonSerializable(propsCtrlName);
		}

		this.getValuesFromHidden = function () {
			var valCtrlId = this.getValuesHiddenName();
			var ctrlsValues = gx.fn.getHidden(valCtrlId);
			if (gx.lang.emptyObject(ctrlsValues))
				ctrlsValues = gx.fn.getControlValue(valCtrlId);
			gx.json.setNonSerializable(valCtrlId);
			var rowsValues = null;
			if (ctrlsValues != null && ctrlsValues != "")
				rowsValues = gx.json.evalJSON(ctrlsValues);
			return rowsValues;
		}

		this.getContainerControlId = function () {
			if (this.gxContainerDivName != undefined)
				return this.gxContainerDivName
			return this.grid.gxCmpContext + this.containerName + "Div";
		};

		this.getContainerControl = function () {
			var divCtrl = gx.dom.byId(this.getContainerControlId());
			if (divCtrl) {
				this.gxContainerCtrl = divCtrl;
				divCtrl.setAttribute("gxgridid", this.gridId.toString());
				gx.dom.addClass(divCtrl, GRID_CLASS + " " + (this.isFreestyle ? FREESTYLE_GRID_CLASS : STANDARD_GRID_CLASS));
				divCtrl.gxGridName = this.grid.gxGridName;
			}
			return divCtrl;
		}

		this.getHiddenSuffix = function () {
			return (this.grid.gxParentRowId == '') ? '' : '_' + this.grid.gxParentRowId;
		};

		this.getDataHiddenName = function () {
			if (this.gxContainerDataName != undefined)
				return this.gxContainerDataName;
			return this.grid.gxCmpContext + this.containerName + 'Data' + this.getHiddenSuffix();
		}

		this.getValuesHiddenName = function () {
			if (this.gxContainerValuesName != undefined)
				return this.gxContainerValuesName;
			return this.grid.gxCmpContext + this.containerName + "DataV" + this.getHiddenSuffix();
		}

		this.setColumnsProperties = function (props) {
			try {
				var len = props.length;
				for (var i = 0; i < len; i++) {
					var col = this.grid.columns[i];
					for (var prop in props[i]) {
						var pValue = props[i][prop];
						prop = this.fixColumnPropName(prop);
						if (this.isUsercontrol) {
							col[prop] = pValue;
						}
						col[prop.toLowerCase()] = pValue;
					}
					this.checkPromptColumn(col);
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'setColumnsProperties');
			}
		}

		this.checkPromptColumn = function (col) {
			try {
				if (this.isPromptColumn(col)) {
					var ctrl = gx.fn.getAttachedCtrl(col.htmlName);
					if (ctrl && ctrl.info && ctrl.info.controls) {
						var anyVisible = false;
						var anyEnabled = false;
						var depLen = ctrl.info.controls.length;
						for (var j = 0; j < depLen; j++) {
							var depId = ctrl.info.controls[j];
							var depCol = this.grid.getColumnByGxId(depId);
							var enabled = gx.lang.gxBoolean(depCol.enabled);
							var visible = gx.lang.gxBoolean(depCol.visible);
							if (enabled)
								anyEnabled = true;
							if (visible)
								anyVisible = true;
						}
						if (!anyEnabled)
							col.enabled = '0';
						if (!anyVisible)
							col.visible = '0';
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'checkPromptColumn');
			}
		}

		this.fixColumnPropName = function (propName) {
			if (propName == 'Horizontalalignment') {
				return 'align';
			}
			return propName;
		}

		this.setDeleteMethod = function (deleteMethod) {
			var isTrn = this.parentObject.isTransaction();
			if (isTrn) {
				var disableDelete = (this.parentObject.Gx_mode == 'DSP');
				if (!disableDelete && deleteMethod && (deleteMethod == 'none')) {
					disableDelete = true;
				}
				if (disableDelete) {
					this.deleteMethod = gx.grid.deleteMethods.none;
				}
				else {
					this.deleteMethod = gx.grid.deleteMethod;
				}
			}
		}

		this.setSelectionAndHover = function (Allowselection, Selectioncolor, Allowhover, Hovercolor) {
			try {
				if (typeof(Allowselection) != 'undefined')
					this.allowSelection = gx.lang.gxBoolean(Allowselection);
				if (typeof (Selectioncolor) != 'undefined')
					this.selectionColor = null;
				if (typeof (Hovercolor) != 'undefined')
					this.hoverColor = null;
				if (this.allowSelection && typeof(Selectioncolor) != 'undefined') {
					if (typeof (Allowhover) != 'undefined')
						this.allowHovering = gx.lang.gxBoolean(Allowhover);
					Selectioncolor = eval(Selectioncolor);
					if (typeof (Selectioncolor[0]) != 'undefined')
						this.selectionColor = gx.color.fromRGB(Selectioncolor[0], Selectioncolor[1], Selectioncolor[2]);
					else
						this.selectionColor = gx.color.html(Selectioncolor);
					if (this.allowHovering && typeof(Hovercolor) != 'undefined') {
						Hovercolor = eval(Hovercolor);
						if (typeof (Hovercolor[0]) != 'undefined')
							this.hoverColor = gx.color.fromRGB(Hovercolor[0], Hovercolor[1], Hovercolor[2]);
						else
							this.hoverColor = gx.color.html(Hovercolor);
					}
				}
				this.grid.gxAllowSelection = this.allowSelection;
				this.grid.gxSelectionColor = this.selectionColor;
				this.grid.gxAllowHovering = this.allowHovering;
				this.grid.gxHoverColor = this.hoverColor;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'setSelectionAndHover');
			}
		}

		this.setCollapsing = function (Allowcollapsing, Collapsed) {
			try {
				this.allowCollapsing = gx.lang.gxBoolean(Allowcollapsing);
				this.collapsed = gx.lang.gxBoolean(Collapsed);

				this.grid.gxAllowCollapsing = this.allowCollapsing;
				this.grid.gxCollapsed = this.collapsed;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'setCollapsing');
			}
		}

		this.setSflColumns = function (sflColumns) {
			try {
				if (!gx.lang.emptyObject(sflColumns) || sflColumns === 0) {
					this.gridCols = gx.grid.validGridColsValue(parseInt(sflColumns));
					this.grid.gxGridCols = this.gridCols;
					if (this.gridCols > 1 && this.gridRows > 0)
						this.grid.pageSize = (this.gridRows ? this.gridRows : 1) * this.gridCols;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'setSflColumns');
			}
		}

		this.isPromptColumn = function (column) {
			if (column.gxAttId.indexOf && column.gxAttId.indexOf("prompt_") != -1)
				return true;
			return false;
		}

		this.setRowsProperty = function () {
			var rowsHiddenValue = gx.fn.getHidden(this.getHiddenName("Rows"));
			if (rowsHiddenValue != null) {
				try { this.gridRows = parseInt(rowsHiddenValue, 10); }
				catch (e) {
					gx.dbg.logEx(e, 'gxgrid.js', 'setRowsProperty');
				}
				this.grid.pageSize = this.gridRows * (this.gridCols > 1 ? this.gridCols : 1);
			}
		}

		this.crearInstalledSuggests = function () {
			var len = this.grid.columns.length;
			for (var i = 0; i < len; i++) {
				var column = this.grid.columns[i];
				var vStruct = this.parentObject.getValidStruct(column.gxId);
				if (vStruct && vStruct.gxsgprm && vStruct.gxsgprm.installed) {
					vStruct.gxsgprm.installed = {};
				}
			}
		}

		this.refreshCollection = function (coll) {
			try {
				this.blankGridRows();
				this.updatePagingVars();
				this.initRefreshParms();
				var cLen = coll.length;
				for (var i = 0; i < cLen; i++) {
					var rowProps = { Props: [] };
					var collItem = coll[i];
					var len = this.grid.columns.length;
					for (var j = 0; j < len; j++) {
						var column = this.grid.columns[j];
						rowProps.Props[column.index] = [collItem[column.gxAttName]];
					}
					this.addRow(rowProps);
				}
				this.refreshGrid(false, false, true);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'refreshCollection');
			}
		}

		this.refreshGrid = function (loadChildGrids, fromAutoRefresh, fromCollection) {
			this.DatePickersControls = [];
			this.GridUserControls = [];
			this.GridComponents = [];
			this.GridControls = [];

			this.clearDefaultEventHandlers();
			this.clearHiddens();
			this.crearInstalledSuggests();
			this.setRowsProperty();
			if ((this.parentRow != undefined) && (!gx.lang.emptyObj(this.parentRow.Grids))) {
				var gridProps = this.parentRow.Grids[this.realGridName];
				if (gridProps != null) {
					this.setHtmlTags(gridProps);
					this.setGridStyles(gridProps);
					this.setColumnsProperties(gridProps.Columns);
					if (!this.addingRows) {
						if (this.parentRow.IsNew) {
							this.addRows(gridProps);
						}
					}
				}
			}
			var firstTime = false;
			var afterRender = function () {
				this.setupGridControls(this.GridControls);
				this.setupFixedColumnProperties();
				this.setupGridComponents(this.GridComponents);
				this.setupGridUsercontrols(this.GridUserControls);
				gx.plugdesign.applyTemplateObject("#" + this.getContainerControl().id);
				this.triggerDatePickersSetup(this.DatePickersControls);
				this.installImageControls();
				if (this.isFreestyle) {
					this.loadRowsGrids(firstTime);
				}
				this.updateRcdCount();
				this.setDefaultEventHandlers();
			};
			afterRender = afterRender.closure(this);
			this.grid.doSort();
			if (loadChildGrids == false) {
				this.grid.render(firstTime, false, fromCollection, afterRender);
			}
			else {
				firstTime = true;
				this.grid.render(firstTime, fromAutoRefresh, fromCollection, afterRender);
			}
		}

		var CMP_BACKUP_CONTAINER_ID = 'gx-wc-bkp_' + gCmpCtx + "_" + gName;
		this.getComponentsBackupContainer = function () {
			var bkpCt = gx.dom.el(CMP_BACKUP_CONTAINER_ID);
			if (!bkpCt) {
				bkpCt = document.createElement('div');
				bkpCt.id = CMP_BACKUP_CONTAINER_ID;
				bkpCt.style.display = 'none';
				document.body.appendChild(bkpCt);
			}
			return bkpCt;
		};

		this.destroyComponentsBackup = function () {
			var bkpCt = gx.dom.el(CMP_BACKUP_CONTAINER_ID);
			if (bkpCt) {
				var parent = bkpCt.parentNode;
				if (parent)
					gx.dom.removeControlSafe(bkpCt);
			}
		};

		this.backupComponents = function () {
			try {
				var len1 = this.grid.rows.length;
				for (var i = 0; i < len1; i++) {
					var row = this.grid.rows[i];
					var len2 = this.grid.columns.length;
					for (var j = 0; j < len2; j++) {
						var column = this.grid.columns[j];
						if (column.gxControl.type == gx.html.controls.types.webComponent) {
							var cmpProps = row.gxProps[j];
							var controlName = cmpProps[0];
							var cmpPrefix = this.parentObject.getComponentPrefix(controlName);
							var cmpCtrlId = this.gxComponentContext + 'gxHTMLWrp' + cmpPrefix + row.gxId;
							var cmpCtrl = gx.dom.el(cmpCtrlId);
							if (cmpCtrl) {
								cmpCtrl.parentNode.removeChild(cmpCtrl); //remove in order to change its parent (not to destroy)
								var bkpCt = this.getComponentsBackupContainer();
								bkpCt.appendChild(cmpCtrl);
							}
						}
					}
					var len3 = row.gxGrids.length;
					for (var k = 0; k < len3; k++) {
						var rowGrid = row.gxGrids[k];
						if (rowGrid && rowGrid.isFreestyle) {
							rowGrid.backupComponents();
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'backupComponents');
			}
		}

		this.getEntireGridColumn = function (colIndex) {
			var container = this.getContainerControl();
			if (!container )
				return [];
			var r = container.firstChild,
				cells = [];
			if (r.querySelectorAll) {
				cells = gx.fn.toArray(r.querySelectorAll("td[colindex='" + colIndex + "'], th[colindex='" + colIndex + "']"));
			} else {
				var candidateCells = gx.dom.byTag('TD', r),
					candidateHeaders = gx.dom.byTag('TH', r);
				for (var i=0, len=candidateCells.length; i<len; i++) {
					if (candidateCells[i].getAttribute('colindex') == colIndex) {
						cells.push(candidateCells[i]);
					}
				}
				for (var i=0, len=candidateHeaders.length; i<len; i++) {
					if (candidateHeaders[i].getAttribute('colindex') == colIndex) {
						cells.push(candidateHeaders[i]);
					}
				}
			}
			return cells;
		}
		this.applyPropEntireColumn = function (colIndex, ptyName, ptyValue) {
			var controls = this.getEntireGridColumn(colIndex)
			for (var j = 0; j < controls.length; j++) {
				gx.fn.setCtrlPropertyImpl(controls[j], ptyName, ptyValue);
			}
		}
		this.setupFixedColumnProperties = function () {
			for (var i = 0; i < this.ColumnPropertiesAfterRender.length; i++) {
				var colPtyStruct = this.ColumnPropertiesAfterRender[i];
				this.applyPropEntireColumn(colPtyStruct.colIndex, colPtyStruct.ptyName, colPtyStruct.ptyValue);
			}
		}
		this.addColPropertyAfterRender = function (colIndex, ptyName, ptyValue) {
			var struct = { 'colIndex': colIndex, 'ptyName': ptyName, 'ptyValue': ptyValue };
			this.ColumnPropertiesAfterRender.push(struct);
		}
		this.setupGridControls = function (GridControls) {
			for (var i = 0, len = GridControls.length; i < len; i++) {
				var ctrl = GridControls[i];
				var hook = gx.dom.el(ctrl.hookId);
				var parent = hook.parentNode;
				if (parent) {
					parent.insertBefore(ctrl.el, hook);
					gx.dom.removeControlSafe(hook);
				}
			}
		}

		this.setupGridComponents = function (GridComponents) {
			var len = GridComponents.length;
			for (var i = 0; i < len; i++) {
				var cmp = GridComponents[i];
				if (cmp.create === false) {
					var hook = gx.dom.el(cmp.existingEl);
					var parent = hook.parentNode;
					var el = gx.dom.el(cmp.el);
					gx.dom.removeControlSafe(hook);
					parent.appendChild(el);
				}
				else {
					gx.html.processCode(cmp.c, false, function (obj) {
						var gxComp = gx.createComponent(obj.n, obj.p);
						if (gxComp != null) {
							gx.addComponent(gxComp);
							gxComp.readServerVars();
							if (obj.load)
								gxComp.onload();
						}
					}, [cmp]);
				}
			}
			this.destroyComponentsBackup();
		}

		this.setupGridUsercontrols = function (GridUserControls) {
			var len = GridUserControls.length;
			for (var i = 0; i < len; i++) {
				var rowId = GridUserControls[i].r;
				var col = GridUserControls[i].c;
				var userControl = gx.uc.getNew(this.parentObject, col.gxUCId, col.gxUCLastId, col.gxUCClassName, col.gxUCContainerName + '_' + rowId, col.gxUCControlName, this.gridLvl, this.gridId, rowId);
				userControl.DesignContainerName = col.gxUCContainerName;
				userControl.setC2ShowFunction(col.gxShowFunc);
				var len1 = col.gxC2VFuncs.length;
				for (var j = 0; j < len1; j++) { userControl.addC2VFunction(col.gxC2VFuncs[j]); };
				var len2 = col.gxV2CFuncs.length;
				for (var j = 0; j < len2; j++) { userControl.addV2CFunction(col.gxV2CFuncs[j]); };
				userControl.setGridProperties();
				userControl.setGridEventHandlers();
				this.parentObject.setUserControl(userControl);
				userControl.execV2CFunctions(true);
				userControl.execShowFunction();
			}
		}

		this.triggerDatePickersSetup = function (DatePickersControls) {
			var len = DatePickersControls.length;
			for (var j = 0; j < len; j++) {
				var controlId = DatePickersControls[j].CtrlId;
				var controlGrid = DatePickersControls[j].Grid;
				var controlRow = DatePickersControls[j].Row;
				var currentObject = gx.O;
				var validStruct = null;
				var ctrlIds = gx.fn.controlIds();
				var len1 = ctrlIds.length;
				for (var i = 0; i < len1; i++) {
					validStruct = gx.fn.validStruct(ctrlIds[i]);
					if (validStruct.grid == controlGrid) {
						var vControlId = currentObject.CmpContext + validStruct.fld + "_" + controlRow;
						if (vControlId == controlId)
							break;
					}
				}
				if ((validStruct != null) && (validStruct.dp != undefined)) {
					gx.fn.installDatePicker(controlId, validStruct.dp.f, validStruct.dp.st, validStruct.dp.wn, validStruct.dp.mf, gx.fn.datePickerFormat(validStruct.dp.pic, validStruct.dp.dec, validStruct.len));
				}
			}
		}

		this.installImageControls = function () {
			var containers = gx.dom.byClass('gx-multimedia-upload', '', this.gxContainerCtrl)
			for (var i = 0, len = containers.length; i < len; i++) {
				gx.html.multimediaUpload.createControl(containers[i]);
			}
		}

		this.addComponentToDraw = function (cmpObj) {
			this.GridComponents.push(cmpObj);
		}

		this.addUsercontrolToDraw = function (ucObj) {
			this.GridUserControls.push(ucObj);
		}

		this.addDatepickerToSetup = function (dpObj) {
			this.DatePickersControls.push(dpObj);
		}

		this.addControlToReuse = function (ctrl) {
			var parent = ctrl.el.parentNode;
			if (parent) {
				gx.dom.removeControlSafe(ctrl.el);
			}
			this.GridControls.push(ctrl);
		}

		this.loadRowsGrids = function (firstTime) {
			var len = this.grid.rows.length;
			for (var i = 0; i < len; i++) {
				this.loadRowGrids(this.grid.rows[i], firstTime);
			}
		}

		this.loadRowGrids = function (row, firstTime) {
			var len = row.gxGrids.length;
			for (var i = 0; i < len; i++) {
				var rowGrid = row.gxGrids[i];
				rowGrid.grid.setContainerDelayed(gx.dom.el(rowGrid.gxContainerDivName));
				if (firstTime) {
					if ((rowGrid.parentRow != undefined) && (!gx.lang.emptyObj(rowGrid.parentRow.Grids))) {
						var propsCtrlName = rowGrid.getDataHiddenName();
						var gridProps = rowGrid.parentRow.Grids[rowGrid.realGridName];
						gx.fn.setHidden(propsCtrlName, gx.json.serializeJson(gridProps));
					}
					rowGrid.loadGrid();
				}
				else {
					rowGrid.refreshGrid();
				}
				row.IsNew = false;
			}
		}

		this.updateRcdCount = function () {
			if (this.hasForEachLine || this.parentObject.isTransaction()) {
				var gridSuffix = (this.grid.gxParentRowId == "") ? "" : "_" + this.grid.gxParentRowId;				
				gx.fn.setHidden(this.grid.gxCmpContext + "nRC_GXsfl_" + this.gridId + gridSuffix, this.lastRowId.toString());
			}
			var rowId = gx.fn.getHidden(this.grid.gxCmpContext + this.gridName.toUpperCase() + "_ROW");
			if (parseInt(rowId, 10) > this.lastRowId)
				this.grid.instanciateSelectionVars('0000')
		}

		this.updateControlValue = function (vStruct, modifRow) {
			try {
				var gxgrid = this;
				var cRow = gx.fn.currentGridRow(vStruct.grid).toString();
				var iRow = cRow;
				var rLen = cRow.length;
				if (rLen > 4) {
					var pRow = cRow.substring(4, rLen);
					gxgrid = gx.fn.gridObj(this.gxComponentContext, this.gridName + '_' + pRow, this.isMasterPageGrid);
					if (!gxgrid)
						return;
					iRow = cRow.substring(0, 4);
				}
				var gridRow = parseInt(iRow, 10) - 1;
				if (modifRow == true)
					gxgrid.setRowModified(cRow);
				var colIdx = gxgrid.getColumnIndexByName(vStruct.fld);
				var ctrl = gx.dom.el(this.gxComponentContext + vStruct.fld + "_" + cRow);
				gxgrid.updateRowValue(colIdx, gridRow, ctrl);
				return gxgrid;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxgrid.js', 'updateControlValue');
			}
			return null;
		}

		this.persistControlValue = function (ControlId, Value, validStruct) {
			var _Idx = ControlId.lastIndexOf("_");
			if (_Idx != -1) {
				var htmlName = ControlId.substring(0, _Idx);
				var rowGxId = ControlId.substring(_Idx + 1);
				var row = this.grid.getRowByGxId(rowGxId);
				if (row) {
					var column = this.grid.getColumnByHtmlName(htmlName);
					if (column) {
						var pValue = this.parentObject[validStruct.gxvar];
						if (validStruct.type == "decimal" && gx.lang.instanceOf(pValue, Number))
							pValue = pValue.toFixed(validStruct.dec);
						row.values[column.index] = pValue;
						if (!row.gxProps[column.index])
							row.gxProps[column.index] = {};
						var cellCtrl = gx.dom.el(ControlId);
						if (cellCtrl && cellCtrl.tagName == 'SELECT') {
							row.gxProps[column.index].Values = gx.dom.comboBoxToObj(cellCtrl);
						}
						row.gxProps[column.index].Value = pValue;
						row.gxProps[column.index].FormattedValue = Value;
					}
				}
			}
		}

		this.getColumnIndexByName = function (htmlName) {
			var cols = this.grid.columns;
			var len = cols.length;
			for (var i = 0; i < len; i++) {
				if (cols[i].htmlName == htmlName)
					return i;
			}
			return -1;
		}

		this.setRowModified = function (cRow) {
			gx.fn.setHidden(this.grid.gxCmpContext + "nIsMod_" + this.gridLvl.toString() + "_" + cRow, 1);
			if (this.parentGrid != null) {
				this.parentGrid.setRowModified(this.grid.gxParentRowId);
			}
			this.grid.showDeleteImage(cRow);
		}

		this.validateRow = function (eventCtrl) {
			if (eventCtrl) {
				try {
					gx.fn.setCurrentGridRow(eventCtrl.gxgridid, eventCtrl.gxrow);
					var lastGridCtrl = gx.fn.lastGridControl(eventCtrl.gxgridid);
					gx.csv.validControls(gx.csv.lastId, lastGridCtrl + 1, true, gx.O);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxgrid.js', 'validateRow');
				}
			}
		}

		this.updateRowValue = function (colIdx, rowId, ctrl) {
			var row = this.grid.getRowById(rowId);
			var column = this.grid.columns[colIdx];
			if (ctrl.type == "checkbox") {
				if (ctrl.checked) ctrl.value = column.gxChecked;
				else ctrl.value = column.gxUnChecked;
			}
			var ctrlVal = gx.fn.getControlValue(this.grid.columns[colIdx].htmlName + "_" + row.gxId);
			var validStruct = this.parentObject.getValidStruct(this.grid.columns[colIdx].gxId);
			var pValue = validStruct.val();
			row.values[colIdx] = pValue;
			if (!gx.lang.emptyObject(row.gxProps[colIdx])) {
				row.gxProps[colIdx].Value = pValue;
				row.gxProps[colIdx].FormattedValue = ctrlVal;
			}
			if (this.parentObject.isTransaction()) {
				var idxInKey = this.columnIndexInKey(column.gxAttId);
				if (idxInKey != -1) {
					row.gxKeyValues[idxInKey] = pValue;
				}
			}
			if (column.gxControl.type == gx.html.controls.types.blob) {
				gx.fn.setControlValue(this.grid.gxCmpContext + column.htmlName + "_" + row.gxId + "_gxBlob", pValue);
			}
		}

		this.expandCollapse = function (imgCtrl, event) {
			gx.evt.cancel(event, true);
			var gridTbl = gx.dom.el(this.gxComponentContext + this.containerName + "Tbl");
			if (gridTbl != null) {
				if (this.collapsed) {
					gridTbl.style.display = 'block';
					imgCtrl.src = gx.ajax.getImageUrl(gx, 'collapseImage');
				}
				else {
					gridTbl.style.display = 'none';
					imgCtrl.src = gx.ajax.getImageUrl(gx, 'expandImage');
				}
				this.collapsed = !this.collapsed;
				this.grid.gxCollapsed = this.collapsed;
				var gridNameCollapse;
				if (this.parentGrid) {
					var lastIndex = this.gridName.lastIndexOf("_");
					var gridNumber = this.gridName.substring(lastIndex);
					gridNameCollapse = this.gxComponentContext + this.realGridName.toUpperCase() + "_Collapsed" + gridNumber;
				}
				else
					gridNameCollapse = this.gxComponentContext + this.realGridName.toUpperCase() + "_Collapsed";
				gx.fn.setHidden(gridNameCollapse, (this.collapsed) ? "1" : "0");
			}
		}

		this.getRowFromHtmlCtrl = function (rowCtrl) {
			var rowId = rowCtrl.gxrow;
			if (gx.lang.emptyObject(rowId)) {
				var _Idx = rowCtrl.id.lastIndexOf("_");
				rowId = rowCtrl.id.substring(_Idx + 1);
			}
			return this.grid.getRowByGxId(rowId);
		}

		this.showContextMenu = function (rowCtrl, contextEvent) {
			this.contextMenu.show(rowCtrl, contextEvent);
		}
	},

	contextMenu: function (parentGrid) {
		this.gxgrid = parentGrid;
		this.controlName = this.gxgrid.containerName + "ContextMenu"
		this.rowClicked = null;
		this.contextEvent = null;
		this.eventSource = null;
		var buffer = new gx.text.stringBuffer();

		this.show = function (eventCtrl, cEvent) {
			this.gxgrid.validateRow(eventCtrl);
			this.contextEvent = cEvent;
			this.eventSource = gx.evt.source(this.contextEvent);
			gx.evt.cancel(cEvent, true);

			this.rowClicked = eventCtrl;
			this.startMenu();

			buffer.append("<div class=\"").append("menuItem").append("\" id=\"").append("deleteRow").append("\" align=\"center\">").append(gx.getMessage("GXM_deleterow")).append("</div>");
			//buffer.append("<div class=\"").append("menuItem").append("\" id=\"").append("undeleteRow").append("\" align=\"center\">").append("Undelete row").append("</div>");

			this.endMenu();
		}

		this.startMenu = function () {
			buffer.clear();

			var menuCoords = this.getMenuCoords();

			buffer.append("<div onclick=\"").append(this.gxgrid.grid.gridObject() + ".contextMenu.contextMenuClicked(event);").append("\" onmouseover=\"");
			buffer.append(this.gxgrid.grid.gridObject() + ".contextMenu.switchContextMenu();").append("\" onmouseout=\"").append(this.gxgrid.grid.gridObject() + ".contextMenu.switchContextMenu();").append("\" oncontextmenu=\"gx.evt.cancel(event, true);");
			buffer.append("\" style=\"").append("position:absolute;width:100;background-Color:menu; border: outset 1px gray;");
			buffer.append("top:" + menuCoords.top + "; left:" + menuCoords.left + ";").append("\">");
		}

		this.endMenu = function () {
			buffer.append("</div>");

			var ContextControl = gx.dom.byId(this.controlName);
			if (ContextControl == null) {
				ContextControl = document.createElement("SPAN");
				ContextControlShadow = document.createElement("SPAN");
				ContextControlShadow2 = document.createElement("SPAN");
				IFrameControl = document.createElement("IFRAME");
				ContextControl.id = this.controlName;
				ContextControlShadow.id = this.controlName + "Shadow";
				ContextControlShadow2.id = this.controlName + "Shadow2";
				IFrameControl.id = this.controlName + "GXiFrameIEHack";
				IFrameControl.src = "about:blank";
				IFrameControl.style.zIndex = 1;
				IFrameControl.style.visibility = "hidden";
				IFrameControl.style.position = "absolute";
				IFrameControl.frameBorder = "0";

				document.body.appendChild(ContextControl);
				document.body.appendChild(ContextControlShadow);
				document.body.appendChild(ContextControlShadow2);
				document.body.appendChild(IFrameControl);
			}
			if (gx.dom.shouldPurge())
				gx.dom.purge(ContextControl, true);
			ContextControl.innerHTML = buffer.toString();
		}

		this.hide = function () {
			this.rowClicked = null;
			this.contextEvent = null;
			gx.dom.removeControl(gx.dom.byId(this.controlName));
		}

		this.getMenuCoords = function () {
			var posx = 0;
			var posy = 0;
			var e = this.contextEvent;
			if (e.pageX || e.pageY) {
				posx = e.pageX;
				posy = e.pageY;
			}
			else if (e.clientX || e.clientY) {
				posx = e.clientX + document.body.scrollLeft + document.documentElement.scrollLeft;
				posy = e.clientY + document.body.scrollTop + document.documentElement.scrollTop;
			}

			return { left: posx, top: posy };
		}

		this.contextMenuClicked = function (mouseEvent) {
			var eSource = gx.evt.source(mouseEvent);
			this.handleContextMenuAction(eSource.id);
			this.hide();
		}

		this.handleContextMenuAction = function (actionId) {
			switch (actionId) {
				case "deleteRow":
					this.gxgrid.setRowDeleted(this.rowClicked);
					break;
				case "undeleteRow":
					this.gxgrid.setRowDeleted(this.rowClicked);
					break;
				default:
					break;
			}
		}

		this.switchContextMenu = function () {
			//Cambia la clase del elemento seleccionado para hacerle un highlight
		}
	},

	rowId: function (idx) {
		var strIdx = idx.toString();
		while (strIdx.length < 4) {
			strIdx = "0" + strIdx;
		}
		return strIdx;
	},

	_init: function () {
		if (!this.deleteMethod) {
			this.deleteMethod = this.deleteMethods.images;
		}

		if (!this.baseDeleteImage) {
			this.baseDeleteImage = this.deleteImage;
		}

		if (this.deleteImage && (this.deleteMethod == this.deleteMethods.images)) {
			this.deleteImage = gx.ajax.getImageUrl(this, 'baseDeleteImage');
		}
		else {
			this.deleteImage = gx.util.resourceUrl(gx.basePath + gx.staticDirectory + 'delete_16x.jpg', true);
		}

		if (!this.baseUndeleteImage) {
			this.baseUndeleteImage = this.undeleteImage;
		}

		if (this.undeleteImage && (this.deleteMethod == this.deleteMethods.images)) {
			this.undeleteImage = gx.ajax.getImageUrl(this, 'baseUndeleteImage');
		}
		else {
			this.undeleteImage = this.deleteImage;
		}

		if (!this.deletePosition) {
			this.deletePosition = this.deletePositions.left;
		}

		if (!this.deletePositionFree) {
			this.deletePositionFree = this.deletePositions.topL;
		}

		if (this.deleteTooltip) {
			this.deleteTooltip = gx.getMessage(this.deleteTooltip);
		}
		else {
			this.deleteTooltip = '';
		}

		if (this.deleteTitle) {
			this.deleteTitle = gx.getMessage(this.deleteTitle);
		}
		else {
			this.deleteTitle = '';
		}
	},

	_deinit: function () {
		this.lastFocusCtrl = null;
	}
};
/* END OF FILE - ..\js\gxgrid.js - */
/* START OF FILE - ..\js\JavaScripTable.js - */
gx.grid.impl = (function ($) {
	return function (id) {
		var STYLE_ELEMENT_ATT_REGEX = /style="([^"]*)"/ig;

		this.basePath = gx.basePath;
		this.imgsDir = gx.staticDirectory;

		this.columns = [];
		this.columnsHtmlName = [];
		this.columnsGxId = [];
		this.columnsGxAttId = [];
		this.rows = [];
		this.rowsById = [];
		this.rowsByGxId = [];
		this.fixedValues = [];
		this.width = '';
		this.align = '';
		this.border = '0';
		this.padding = '1';
		this.spacing = '0';
		this.sortColumn = -1;
		this.ascSort = true;
		this.usePaging = true;
		this.eof = 1;
		this.firstRecordOnPage = 0;
		this.pageSize = 9999;
		this.currentPage = 1;
		this.gxLvl = 0;
		this.gxGridName = "";
		this.gxGridObject = null;
		this.gxBuffer = new gx.text.stringBuffer();
		this.gxParentRowId = "";

		this.tableClass = '';
		this.headerClass = '';
		this.footerClass = '';
		this.editControlClass = '';
		this.navigationClass = '';
		this.navigationLinkClass = '';
		this.highlightedNavigationLinkClass = '';
		this.columnHeaderClass = '';
		this.columnHeaderTextClass = '';
		this.oddRowClass = '';
		this.oddRowCellClass = '';
		this.evenRowClass = '';
		this.evenRowCellClass = '';
		this.rowsValues = [];
		this.pagingButtonFirstClass = "PagingButtonsFirst";
		this.pagingButtonPreviousClass = "PagingButtonsPrevious";
		this.pagingButtonNextClass = "PagingButtonsNext";
		this.pagingButtonLastClass = "PagingButtonsLast";
		this.pagingButtonDisabled = "gx-grid-paging-disabled";
		this.pagingBarClass = "gx-grid-paging-bar";
		this.selectedRowClass = "gx-row-selected";
		
		this.rendered = false;

		if (typeof (Image) != 'undefined') {
			this.ascLabel = new Image();
			this.descLabel = new Image();
		} else {
			this.ascLabel = null;
			this.descLabel = null;
		}

		this.id = id;
		this.container = null;

		this.setContainerDelayed = function (gxContainer) {
			this.container = gxContainer;
		}

		this.addColumn = function (column) {
			if (column.isGxRemove()) {
				column.visible = false;
			}
			var len = this.columns.length;
			column.index = len;
			column.table = this;
			this.columns[len] = column;
			if (typeof (column.htmlName) != 'undefined')
				this.columnsHtmlName[column.htmlName] = column;
			if (typeof (column.gxId) != 'undefined')
				this.columnsGxId[column.gxId] = column;
			if (typeof (column.gxAttId) != 'undefined')
				this.columnsGxAttId[column.gxAttId] = column;
			return column;
		}

		this.getColumnByIndex = function (index) {
			return this.columns[index];
		}

		this.getColumnByCtrlType = function (ctrlType) {
			return $.map(this.columns, function( col) {
				return col.gxControl.type == ctrlType ? col : null;
			});
		}

		this.addRow = function (row, refresh) {
			row.table = this;
			if (row == null) {
				return;
			}

			this.rows[this.rows.length] = row;
			if (typeof (row.id) != 'undefined')
				this.rowsById[row.id] = row;
			if (typeof (row.gxId) != 'undefined')
				this.rowsByGxId[row.gxId] = row;
			if (gx.lang.booleanValue(refresh)) {
				this.render();
			}
			return row;
		}

		this.getColumnByHtmlName = function (htmlName) {
			var column, varCxt;
			column = this.columnsHtmlName[htmlName];
			if (typeof (column) == 'undefined' && typeof (this.gxCmpContext) != 'undefined' && this.gxCmpContext.length < htmlName.length) {
				varCxt = htmlName.substring(0, this.gxCmpContext.length);
				if (varCxt == this.gxCmpContext) {
					htmlName = htmlName.substring(this.gxCmpContext.length, htmlName.length);
					column = this.columnsHtmlName[htmlName];
				}
			}
			return column;
		}

		this.getColumnByGxId = function (id) {
			return this.columnsGxId[id];
		}
		this.getColumnByGxAttId = function (id) {
			return this.columnsGxAttId[id];
		}

		this.getColumnForVar = function (varName) {
			for (var i = 0; i < this.columns.length; i++) {
				var vStruct = this.parentGxObject.getValidStruct(this.columns[i].gxId);
				if (vStruct) {
					if (vStruct.gxvar == varName) {
						return this.columns[i];
					}
				}
			}
			return null;
		},

		this.getRowById = function (id) {
			return this.rowsById[id];
		}

		this.getRowByGxId = function (gxId) {
			return this.rowsByGxId[gxId];
		}

		this.setSort = function (column, asc) {
			if (column == this.sortColumn) {
				if (asc == null) {
					this.ascSort = !this.ascSort;
				} else {
					this.ascSort = gx.lang.booleanValue(asc);
				}
			} else {
				this.sortColumn = column;
				this.ascSort = (asc == null ? true : gx.lang.booleanValue(asc));
			}
			this.doSort();
			this.ownerGrid.refreshGrid();
		}

		this.doSort = function () {
			if (this.sortColumn != -1) {
				this.rows.sort(this.sort);
			}
		}

		this.getControlName = function (row, column) {
			return this.gxCmpContext + column.htmlName + '_' + row.gxId;
		}

		this.getControlId = function (row, column) {
			return this.getControlName(row, column);
		}

		this.getRowCount = function () {
			return this.rows.length;
		}

		this.getMaxPage = function () {
			return Math.ceil(this.getRowCount() / this.pageSize);
		}

		this.isGxTrn = function () {
			return this.parentGxObject.isTransaction();
		}

		this.gridObject = function () {
			return "gx.fn.gridObj('" + this.gxCmpContext + "','" + this.gxGridName + "'," + this.gxIsMasterPageGrid.toString() + ")";
		}

		this.deleteImgId = function (rowId) {
			return this.gxCmpContext + 'delete' + this.gxGridName + '_' + rowId;
		}

		this.showDeleteImage = function (rowId) {
			if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images) {
				var isGxTrn = this.isGxTrn();
				if (isGxTrn) {
					var imgCtrl = gx.dom.el(this.deleteImgId(rowId));
					if (imgCtrl) {
						if (!gx.fn.isVisible(imgCtrl)) {
							imgCtrl.style.display = 'inline';
							if (imgCtrl.parentNode.nodeName == 'A') {
								imgCtrl.parentNode.style.display = 'inline';
							}
						}
					}
				}
			}
		}

		this.appendDeleteHeader = function (buffer, position) {
			if (!this.gxIsFreestyle && (this.ownerGrid.deleteMethod != gx.grid.deleteMethods.none)) {
				var isGxTrn = this.isGxTrn();
				var correctPosition = false;
				if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu) {
					if (position == gx.grid.deletePositions.left) {
						correctPosition = true;
					}
					else {
						return;
					}
				}
				else if (gx.grid.deletePosition == position) {
					correctPosition = true;
				}
				if (isGxTrn && correctPosition) {
					var text = '&nbsp;';
					if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images) {
						text = gx.grid.deleteTitle;
					}
					buffer.append('<th class="' + this.columnHeaderClass + '">' + text + '</th>');
				}
			}
		}

		this.appendDeleteImage = function (buffer, row, position) {
			if (this.ownerGrid.deleteMethod != gx.grid.deleteMethods.none) {
				var isGxTrn = this.isGxTrn();
				if (isGxTrn) {
					var isDeleted = false;
					var canDelete = false;
					if ((this.parentGxObject.Gx_mode != 'DSP') && (this.parentGxObject.Gx_mode != 'DLT')) {
						isDeleted = row.gxDeleted();
						canDelete = (row.gxIsMod() || row.gxExists());
					}
					var imgId = this.deleteImgId(row.gxId);
					var correctPosition = false;
					if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu) {
						if (position == gx.grid.deletePositions.left) {
							correctPosition = true;
						}
						else {
							return;
						}
					}
					else {
						if (!this.gxIsFreestyle && (gx.grid.deletePosition == position)) {
							correctPosition = true;
						}
						else if (this.gxIsFreestyle) {
							var posFree = gx.grid.deletePositionFree;
							if (position == gx.grid.deletePositions.left) {
								correctPosition = ((posFree == gx.grid.deletePositions.topL) || (posFree == gx.grid.deletePositions.bottomL));
							}
							else if (position == gx.grid.deletePositions.right) {
								correctPosition = ((posFree == gx.grid.deletePositions.topR) || (posFree == gx.grid.deletePositions.bottomR));
							}
							position = posFree;
						}
					}
					if (correctPosition) {
						var tagStart = '<td style="text-align:' + this.deleteImageAlign(position) + ';vertical-align:' + this.deleteVerticalAlign(position) + '">';
						var tagEnd = '</td>';
						var imgSrc = '';
						var showHidden = false;
						if (isDeleted && (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images)) {
							imgSrc = gx.grid.undeleteImage;
						}
						else if (canDelete && (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images)) {
							imgSrc = gx.grid.deleteImage;
						}
						else if (isDeleted && (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu)) {
							imgSrc = gx.grid.deleteImage;
						}
						else {
							imgSrc = gx.grid.deleteImage;
							showHidden = true;
						}
						var tooltip = '';
						buffer.append(tagStart);
						if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images) {
							var firstGridCtrl = gx.fn.firstGridControl(this.ownerGrid.gridId);
							tooltip = gx.grid.deleteTooltip;
							buffer.append("<a gxfocusable=\"1\" href=\"javascript:" + this.gridObject() + ".setRowDeleted('" + row.gxId + "');\"");
							buffer.append(" onfocus=\"gx.evt.onfocus(this," + firstGridCtrl + ",'" + this.ownerGrid.gxComponentContext + "'," + this.ownerGrid.isMasterPageGrid + ",'" + row.gxId + "'," + this.ownerGrid.gridId + ")\"");
							var aStyle = '';
							if (showHidden) {
								aStyle += 'display:none;';
							}
							if (aStyle) {
								buffer.append(" style=\"" + aStyle + "\"");
							}
							buffer.append(">");
						}
						buffer.append('<img id="' + imgId + '" src="' + imgSrc + '"');
						if (tooltip) {
							buffer.append(' title="' + tooltip + '"');
						}
						buffer.append(' style="border-style: none;');
						if (showHidden) {
							buffer.append('display:none;');
						}
						buffer.append('"');
						buffer.append('/>');
						if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.images) {
							buffer.append('</a>');
						}
						buffer.append(tagEnd);
					}
				}
			}
		}

		this.deleteVerticalAlign = function (position) {
			if (this.gxIsFreestyle) {
				if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu) {
					return 'middle';
				}
				var styleAlign = 'top';
				if ((position == gx.grid.deletePositions.bottomL) || (position == gx.grid.deletePositions.bottomR)) {
					styleAlign = 'bottom';
				}
				return styleAlign;
			}
			return 'middle';
		}

		this.deleteImageAlign = function (position) {
			if (this.gxIsFreestyle) {
				if (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu) {
					return 'left';
				}
				var styleAlign = 'right';
				if ((position == gx.grid.deletePositions.bottomL) || (position == gx.grid.deletePositions.topL)) {
					styleAlign = 'left';
				}
				return styleAlign;
			}
			return 'center';
		}

		this.ROW_TAG = "tr";
		this.CELL_TAG = "td";
		this.ROW_BASE_CLASS = "";

		this.getRowRenderingProps = function (even, rowDeleted) {
			var gxRowTag = this.ROW_TAG;
			var baseRowClass = this.ROW_BASE_CLASS;
			if (this.gxIsFreestyle) {
				gxRowTag = this.CELL_TAG;
			}

			var rowClass = baseRowClass;
			if (!this.gxIsFreestyle) {
				rowClass += " " + (even ? this.evenRowClass : this.oddRowClass) + (rowDeleted ? ' RowDeleted' : '');
			}

			return {
				cls: rowClass,
				tag: gxRowTag
			};
		};

		this.simpleAppendFn = function (tag) {
			return function (buffer) {
				buffer.append(tag);
			};
		};

		this.appendGridStyle = function (buffer) {
			var styleRegex = STYLE_ELEMENT_ATT_REGEX;
			var styleMatches = styleRegex.exec(this.gxHtmlTags);
			if (styleMatches && styleMatches.length > 1) {
				buffer.append(styleMatches[1]);
			}

			if (!gx.lang.emptyObject(this.gxBackground)) {
				buffer.append(";background-image:url('" + gx.util.resourceUrl(this.gxBackground, true) + "');");
			}
			if (!gx.lang.emptyObject(this.gxBorderWidth)) {
				buffer.append(";border: solid " + this.gxBorderWidth + "px ");
			}
			if (!gx.lang.emptyObject(this.gxBordercolor)) {
				buffer.append(this.gxBordercolor + ";");
			}
			else
				buffer.append(";");

			if (this.ownerGrid.width > 0) {
				buffer.append("width:" + this.ownerGrid.width + this.ownerGrid.widthUnit + ";");
			}

			if (this.gxAllowCollapsing) {
				if (this.gxCollapsed) {
					buffer.append(";display:none");
				}
			}
		};

		this.appendGridAttributes = function (buffer) {
			buffer.append(this.gxHtmlTags.replace(STYLE_ELEMENT_ATT_REGEX, ""));
		};

		this.appendGridClassAttribute = function (buffer) {
			if (this.gxHtmlTags.indexOf("class=") == -1)
				buffer.append(" class=\"" + this.gxCssClass + "\"");
		};

		this.appendCollapsingWrapperStart = function (buffer) {
			buffer.append("<table><tr valign=\"top\"><td>");
			buffer.append("<img class=\"collapse-icon\" style=\"cursor:pointer;\" src=\"");
			if (this.gxCollapsed) {
				buffer.append(gx.ajax.getImageUrl(gx, 'expandImage'));
			}
			else {
				buffer.append(gx.ajax.getImageUrl(gx, 'collapseImage'));
			}
			buffer.append("\" onclick=\"" + this.gridObject() + ".expandCollapse(this, event);" + "\"></td><td width=\"100%\">");
		};

		this.appendCollapsingWrapperEnd = function (buffer) {
			buffer.append("</td></tr></table>");
		};

		this.appendContainerStart = function(tableId, buffer) {
			buffer.append("<table ");
			this.appendGridClassAttribute(buffer);
			buffer.append(" id=\"" + tableId + "\" ");
			if (!gx.lang.emptyObject(this.gxToolTipText)) {
				buffer.append("title=\"" + this.gxToolTipText + "\" ");
			}

			buffer.append("style=\"");
			this.appendGridStyle(buffer);
			buffer.append("\" ");
			this.appendGridAttributes(buffer);
			buffer.append(">");
		};

		this.appendContainerEnd = this.simpleAppendFn("</table>");

		this.appendHeaderText = function (columnCount, buffer) {
			if (!gx.lang.emptyObject(this.headerText)) {
				buffer.append("<tr><td colspan=\"" + columnCount + "\" class=\"" + this.headerClass + "\">" + this.headerText + "</td></tr>");
			}
		};

		this.appendFooterText = function (renderedColumnCount, buffer) {
			if (!gx.lang.emptyObject(this.footerText)) {
				buffer.append("<tr><td colspan=\"" + renderedColumnCount + "\" class=\"" + this.footerClass + "\">" + this.footerText + "</td></tr>");
			}
		};

		this.appendHeader = function (visibleColumnsArray, buffer) {
			var colsLen = visibleColumnsArray.length;
			var cursorPointer = "cursor:" + (document.createTextRange ? "hand" : "pointer") + ";";
			var images = [];
			var ascLabelSrc = gx.ajax.getImageUrl(gx, 'ascImage');
			var descLabelSrc = gx.ajax.getImageUrl(gx, 'descImage');
			var cHIndex = 0;
			var headerStyle;

			buffer.append("<thead>");
			buffer.append("<tr>");

			this.appendDeleteHeader(buffer, gx.grid.deletePositions.left);

			for (var i = 0; i < colsLen; i++) {
				var column = visibleColumnsArray[i],
					columnClass = [this.columnHeaderClass, column.gxColumnClass].join(" ");

				buffer.append("<th nowrap=\"nowrap\" class=\"" + columnClass + "\"");
				headerStyle = '';
				if (!gx.lang.gxBoolean(column.visible))
					headerStyle += 'display:none;';
				if (column.width) {
					if (!column.gxWidthUnit)
						column.gxWidthUnit = 'px';
					headerStyle += "width:" + column.width + column.gxWidthUnit + ";";
				}
				if (column.align)
					headerStyle += "text-align:" + column.align + ";";
				if (!gx.lang.emptyObject(this.gxTitleBackColor) && (this.gxTitleBackstyle == gx.grid.styles.header || this.gxTitleBackstyle == gx.grid.styles.report)) {
					headerStyle += "background-color:" + this.gxTitleBackColor + ";";
					this.gxRealTitleBackColor = this.gxTitleBackColor;
				}
				if (!gx.lang.emptyObject(this.gxBackColor) && (this.gxTitleBackstyle == gx.grid.styles.uniform)) {
					headerStyle += "background-color:" + this.gxBackColor + ";";
					this.gxRealTitleBackColor = this.gxBackColor;
				}
				if (!gx.lang.emptyObject(this.gxTitleForeColor)) {
					headerStyle += "color:" + this.gxTitleForeColor + ";";
				}
				if (!gx.lang.emptyObject(this.gxTitleFont)) {
					headerStyle += this.gxTitleFont;
				}
				buffer.append(" style=\"" + headerStyle + ";\"");
				buffer.append(" colindex=\"" + cHIndex + "\"");
				buffer.append(">");

				cHIndex++;

				if (gx.lang.emptyObject(gx.text.trim(column.title))) {
					buffer.append("&nbsp;");
				}
				else {
					buffer.append("<span");
					if (column.gxTooltip) {
						buffer.append(" title=\"" + column.gxTooltip + "\"");
					}
					headerStyle = "";
					if (column.sortable) {
						headerStyle = cursorPointer;
						buffer.append(" onclick=\"" + this.gridObject() + ".grid.setSort(" + column.index + ");\" onMouseOver=\"window.status='" + this.sortMessage + "';return true;\" onMouseOut=\"window.status='';return true;\"");
					}
					buffer.append("\">");

					buffer.append(column.title);

					if (this.ascLabel != null && this.descLabel != null) {
						this.ascLabel.src = ascLabelSrc;
						this.descLabel.src = descLabelSrc;
						if (column.sortable && this.sortColumn == column.index) {
							buffer.append("&nbsp;" + this.handleLabel(((this.ascSort) ? this.ascLabel : this.descLabel), images));
						}
					}
					buffer.append("</span>");
				}
				buffer.append("</th>");
			}

			this.appendDeleteHeader(buffer, gx.grid.deletePositions.right);

			buffer.append("</tr>");
			buffer.append("</thead>");
		};

		this.appendBodyWrapperStart = this.simpleAppendFn("<tbody>");

		this.appendBodyWrapperEnd = this.simpleAppendFn("</tbody>");

		this.appendFooterWrapperStart = this.simpleAppendFn("<tfoot>");

		this.appendFooterWrapperEnd = this.simpleAppendFn("</tfoot>");

		this.appendRowStart = this.simpleAppendFn("<tr>");

		this.appendRowEnd = this.simpleAppendFn("</tr>");

		this.appendRowBreaksWrapperStart = this.simpleAppendFn("<table width='100%' cellspacing='0' cellpadding='0'><tbody>");

		this.appendRowBreaksWrapperEnd = this.simpleAppendFn("</tbody></table></td>");

		this.appendRowPrefix = gx.emptyFn;

		this.appendCellPrefixStart = gx.emptyFn;

		this.appendCellPrefixEnd = gx.emptyFn;

		this.beforeRender = function () {
			this.tableClass = this.gxCssClass;
			this.evenRowClass = this.gxEvenLinesClass;
			this.oddRowClass = this.gxOddLlinesClass;
			this.headerClass = this.gxTitleClass;
			this.columnHeaderClass = this.headerClass;
			this.columnHeaderTextClass = this.headerClass;
			this.evenRowCellClass = this.evenRowClass;
			this.oddRowCellClass = this.oddRowClass;
		};

		this.render = function (firstTime, fromAutoRefresh, fromCollection, afterRenderCallback) {
			firstTime = !!firstTime;

			var tableId = this.gxCmpContext + this.gxGridObject + "Tbl";
			var len, i;

			this.beforeRender();

			var gridHtml = this.drawGrid(tableId, firstTime, fromAutoRefresh, fromCollection);

			if (gx.dom.shouldPurge()) {
				var events = ['onblur', 'onclick', 'onfocus', 'onchange'];
				var inputs = gx.dom.byTag('input', this.container);
				for (i = 0, len = inputs.length; i < len; i++)
					gx.dom.purgeElement(inputs[i], events);
				var textAreas = gx.dom.byTag('textarea', this.container);
				for (i = 0, len = textAreas.length; i < len; i++)
					gx.dom.purgeElement(textAreas[i], events);
				var selects = gx.dom.byTag('select', this.container);
				for (i = 0, len = selects.length; i < len; i++)
					gx.dom.purgeElement(selects[i], events);
				var spans = gx.dom.byTag('span', this.container);
				for (i = 0, len = spans.length; i < len; i++)
					gx.dom.purgeElement(spans[i], events);
				var imgs = gx.dom.byTag('img', this.container);
				for (i = 0, len = imgs.length; i < len; i++)
					gx.dom.purgeElement(imgs[i], events);
			}

			var activeEl = gx.dom.getActiveElement(),
				restoreActiveEl = activeEl && (activeEl.id || activeEl.name) && gx.dom.isChildNode(activeEl, this.container);

			gx.csv.IgnoreBlur = true;
			this.container.innerHTML = gridHtml;
			gx.csv.IgnoreBlur = false;

			if (restoreActiveEl) {
				setTimeout(function () {
					var newActiveEl = gx.dom.el(activeEl.id || activeEl.name);
					if (newActiveEl) {
						gx.csv.disableFocus = true;
						if (newActiveEl.offsetWidth > 0 && newActiveEl.offsetHeight > 0) {
							newActiveEl.focus();
						}
					}
				}, 10);
			}

			this.afterRender(tableId);

			gx.fx.obs.notify('grid.onafterrender', [this]);

			// Call after render callback
			afterRenderCallback();

			this.rendered = true;
		};

		this.afterRender = function () {
			if (!this.rendered) {
				this.defineEventHandlers();
			}

		};

		this.drawGrid = function (tableId, firstTime, fromAutoRefresh, fromCollection) {
			var isGxTrn = this.isGxTrn();
			var hasRowBreaks = this.gxIsFreestyle && (this.gxGridCols > 1);

			var buffer = new gx.text.stringBuffer();
			var visibleColumnsArray = this.columns;
			var renderedColumnCount = visibleColumnsArray.length;
			var i, column, colHtmlCode, vAlign;

			if (!this.gxIsFreestyle && isGxTrn) {
				renderedColumnCount++;
			}

			var firstRow, lastRow, maxPage;
			if (Number(this.pageSize) !== 0) { //pageSize != 0
				maxPage = this.getMaxPage();
				if (this.currentPage <= 0) {
					this.currentPage = 1;
				}
				else if (this.currentPage > maxPage) {
					this.currentPage = maxPage;
				}
				firstRow = Math.max(this.pageSize * (this.currentPage - 1), 0);
				lastRow = Math.min(firstRow + this.pageSize, this.rows.length);
			}
			else {
				firstRow = 0;
				lastRow = this.rows.length;
			}

			if (this.gxAllowCollapsing) {
				this.appendCollapsingWrapperStart(buffer);
			}

			this.appendContainerStart(tableId, buffer);
			this.appendHeaderText(renderedColumnCount, buffer);

			var colsLen = visibleColumnsArray.length;
			if (!this.gxIsFreestyle) {
				this.appendHeader(visibleColumnsArray, buffer);
			}

			this.appendBodyWrapperStart(buffer);
			var even = true;
			for (i = firstRow; i < lastRow; i++) {
				even = !even;
				var row = this.rows[i];
				if (firstTime && i === firstRow && !gx.fn.currentGridRowImpl(this.gxId)) {
					gx.fn.setCurrentGridRow(this.gxId, row.gxId);
				}
				var rowDeleted = row.gxDeleted();
				var rowHtml = new gx.text.stringBuffer();
				var rowProps = this.getRowRenderingProps(even, rowDeleted, i, firstRow, lastRow);

				var freestyleRowBreak = hasRowBreaks && this.gxIsFreestyle && (((i > 0) && (i % this.gxGridCols === 0)) || ((i === 0) && (this.gxGridCols > 0)));
				if (freestyleRowBreak) {
					if (i > 0) {
						this.appendRowEnd(buffer, i, firstRow, lastRow);
					}
					this.appendRowStart(buffer, i, firstRow, lastRow);
				}
				// Resolve row backcolor
				var backColor = "";
				if (this.gxTitleBackstyle == gx.grid.styles.report)
					backColor = (even) ? this.gxLinesBackcolorEven : this.gxLinesBackcolorOdd;
				if (this.gxTitleBackstyle == gx.grid.styles.header)
					backColor = this.gxLinesBackcolorOdd;
				if (this.gxTitleBackstyle == gx.grid.styles.uniform)
					backColor = this.gxBackColor;

				if (!this.gxIsFreestyle || (this.gxIsFreestyle && hasRowBreaks)) {
					this.appendRowPrefix(rowHtml, i, firstRow, lastRow);
					rowHtml.append("<" + rowProps.tag + " id='" + this.gxCmpContext + this.gxGridObject + "Row_" + row.gxId + "'");
					if (this.gxIsFreestyle && hasRowBreaks) {
						rowHtml.append(" gxrow=\"" + row.gxId.toString() + "\"");
						vAlign = this.columns[1].gxControl.verticalAlign;
						if (vAlign) {
							rowHtml.append(" valign=\"" + vAlign + "\"");
						}
					}
					else
						rowHtml.append(" gxrow=\"" + row.gxId.toString() + "\"");
					rowHtml.append(" class=\"" + rowProps.cls + "\"");

					if (row.selected) {
						rowHtml.append(" data-selected=\"1\"");
					}

					var rStyle = "";
					if (backColor) {
						rStyle = "background-color:" + backColor + ";";
					}
					if (!gx.lang.emptyObject(this.gxLinesFont)) {
						rStyle += this.gxLinesFont;
					}
					if (rStyle) {
						rowHtml.append(" style=\"" + rStyle + "\" ");
					}
					rowHtml.append(">");
					buffer.append(rowHtml.toString());
				}

				if (this.gxIsFreestyle) {
					if (hasRowBreaks) {
						this.appendRowBreaksWrapperStart(buffer);
					}
					colHtmlCode = this.gxBuffer.toString();
					buffer.append(colHtmlCode);
				}

				if (!this.gxIsFreestyle)
					this.appendDeleteImage(buffer, row, gx.grid.deletePositions.left);

				this.appendCellPrefixStart(buffer, i, firstRow, lastRow);
				for (var j = 0; j < colsLen; j++) {
					column = visibleColumnsArray[j];
					var columnDefaultVisible = gx.lang.gxBoolean(column.visible);
					var columnProps = row.gxProps[column.index];
					var columnValue = row.values[column.index];

					var gxCtrl = column.gxControl;
					if (this.gxIsFreestyle && gxCtrl.type == gx.html.controls.types.row) {
						if (column.index === 0) {
							gxCtrl.isFreestyleRow = true;
						}
					}
					gxCtrl.setGridData({
						grid: this.ownerGrid,
						row: row,
						gridId: this.gxId,
						gridRow: row.gxId
					});
					if (!fromCollection) {
						gxCtrl.setProperties.apply(gxCtrl, columnProps);
					}
					else {
						delete gxCtrl.formattedValue;
						gxCtrl.value = columnValue;
						gxCtrl.id = column.htmlName + "_" + gxCtrl.gridRow;
						//Set all column properties (design and runtime properties)
					}
					
					if (firstTime)
						delete gx.usrPtys[gxCtrl.id];
					else {
						if (gx.usrPtys[gxCtrl.id] !== undefined) {
							var Pty;
							for (Pty in gx.usrPtys[gxCtrl.id]) {
								if (Pty == 'enabled')
									gxCtrl.rtEnabled = true;
								gxCtrl.setIndividualProp(Pty, gx.usrPtys[gxCtrl.id][Pty]);
							}
						}
					}
					if (rowDeleted) {
						gxCtrl.rtEnabled = true;
						gxCtrl.enabled = false;
					}
					if (columnProps.Value)//Column Value is invariant, but gxCtrl.value is language dependant.
					{
						var vStruct = this.parentGxObject.getValidStruct(column.gxId);
						if (gx.decimalPoint != '.' && vStruct && vStruct.type == "decimal" && typeof (columnProps.Value) == "string")
							gxCtrl.value = columnProps.Value.replace('.', gx.decimalPoint);
						else
							gxCtrl.value = columnProps.Value;
					}
					if (columnProps.FormattedValue)
						gxCtrl.formattedValue = columnProps.FormattedValue;
					if (columnProps.Values)
						gxCtrl.possibleValues = columnProps.Values.v;
					if (this.gxIsFreestyle && gxCtrl.type == gx.html.controls.types.row) {
						if (column.index === 0) {
							gxCtrl.id = this.gxCmpContext + this.gxGridObject + "Row_" + row.gxId;
							if (isGxTrn && (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu)) {
								gxCtrl.oncontextmenu = this.gridObject() + ".showContextMenu(this, event);";
							}
							if (backColor)
								gxCtrl.style += "background-color:" + backColor + ";";
						}
					}
					if (!this.gxIsFreestyle) {
						buffer.append('<' + this.CELL_TAG + ' class="gx-attribute ' + (gxCtrl.columnClass || '') + '" valign="' + column.valign + '"');
						buffer.append(' colindex="' + j + '"');
						var rowStyle = '';
						if (!columnDefaultVisible) {
							rowStyle += 'display:none;';
							if (gxCtrl.visible && !column.isGxRemove() && !this.ownerGrid.isPromptColumn(column))
								this.ownerGrid.addColPropertyAfterRender(j, "Visible", 1);
						}
						if (column.width) {
							if (!column.gxWidthUnit)
								column.gxWidthUnit = 'px';
							rowStyle += "width:" + column.width + column.gxWidthUnit + ";";
						} else if (column.gxColSize) {
							gxCtrl.colSize = column.gxColSize;
						}
						if (column.align)
							rowStyle += "text-align:" + column.align + ";";
						if (gxCtrl.style)
							rowStyle += gxCtrl.style;
						if (rowStyle)
							buffer.append(" style=\"" + rowStyle + "\" ");
						buffer.append(">");
					}
					buffer.append(gxCtrl.getHtml());
					if (this.gxIsFreestyle && gxCtrl.type == gx.html.controls.types.row && column.index === 0) {
						this.appendDeleteImage(buffer, row, gx.grid.deletePositions.left);
					}
					gxCtrl.persistValue();

					if (!this.gxIsFreestyle) {
						buffer.append("</" + this.CELL_TAG + ">");
					}
					if (this.gxIsFreestyle) {
						if (column.index == this.columns.length - 1)
							this.appendDeleteImage(buffer, row, gx.grid.deletePositions.right);
						colHtmlCode = column.buffer.toString();
						buffer.append(colHtmlCode);
					}
				}
				this.appendCellPrefixEnd(buffer, i, firstRow, lastRow);

				if (this.gxIsFreestyle && hasRowBreaks) {
					this.appendRowBreaksWrapperEnd(buffer);
				}
				else
					this.appendDeleteImage(buffer, row, gx.grid.deletePositions.right);
			}

			if (this.gxIsFreestyle && (this.gxGridCols > 0) && hasRowBreaks) {
				this.appendRowEnd(buffer);
			}
			this.appendBodyWrapperEnd(buffer);

			this.appendFooterWrapperStart(buffer);
			var gxShowNavBar = (isGxTrn || this.hasPagingButtons());
			if (gxShowNavBar) {
				this.appendNavigationBar(renderedColumnCount, buffer);
			}

			this.appendFooterText(renderedColumnCount, buffer);

			this.appendFooterWrapperEnd(buffer);
			this.appendContainerEnd(buffer);

			if (this.gxAllowCollapsing) {
				this.appendCollapsingWrapperEnd(buffer);
			}

			var gridHtml = buffer.toString();
			buffer.clear();
			buffer = null;

			return gridHtml;
		};

		this.defineEventHandlers = function () {
			if (this.gxAllowHovering && !this.gxIsFreestyle)
				gx.evt.attach(this.container, 'mouseover', this.mouseOverHandler, this);

			if (this.gxAllowHovering && !this.gxIsFreestyle)
				gx.evt.attach(this.container, 'mouseout', this.mouseOutHandler, this);

			if (this.isGxTrn() && (this.ownerGrid.deleteMethod == gx.grid.deleteMethods.menu))
				gx.evt.attach(this.container, 'contextmenu', this.contextMenuHandler, this);

			gx.evt.attach(this.container, 'mousedown', this.mouseDownHandler.closure(this, [(this.gxAllowSelection && !this.gxIsFreestyle)], true), this);
			
			gx.evt.attach(this.container, 'click', this.clickHandler, this);

			if (this.isGxTrn())
				gx.evt.attach(this.container, 'keydown', this.keyDownHandler, this);
		};

		this.isGridRow = function (el) {
			return el && el.tagName == 'TR' && el.getAttribute("gxrow") && gx.dom.findParentByTagName(el, 'DIV') == this.container;
		};

		this.getTargetRow = function (el, parent) {
			var row = el;
			if (!this.isGridRow(row))
				row = gx.dom.findParentByTagName(el, 'TR');
			while (row && gx.dom.isChildNode(row, this.container)) {
				if (this.isGridRow(row) && (!parent || (parent == "body" && row.parentNode.tagName == "TBODY") || (parent == "header" && row.parentNode.tagName == "THEAD")))
					return row;
				row = gx.dom.findParentByTagName(row, 'TR');
			}
		};

		this.mouseOverHandler = function (event) {
			var row = this.getTargetRow(gx.evt.source(event), 'body');
			if (row && row.getAttribute('data-selected') != '1')
				this.startRowHover(row, parseInt(row.getAttribute('gxrow').substring(0,4), 10) - 1);
		};

		this.mouseOutHandler = function (event) {
			var row = this.getTargetRow(gx.evt.source(event), 'body');
			if (row && row.getAttribute('data-selected') != '1')
				this.endRowHover(row, parseInt(row.getAttribute('gxrow').substring(0,4), 10) - 1);
		};

		this.contextMenuHandler = function (event) {
			var row = this.getTargetRow(gx.evt.source(event), 'body');
			if (row)
				this.ownerGrid.showContextMenu(row, event);
		};

		this.mouseDownHandler = function (event, updateUI) {
			var row = this.getTargetRow(gx.evt.source(event), 'body');
			if (row)
				this.setRowSelected(row, row.getAttribute('gxrow'), true, updateUI);
		};

		this.keyDownHandler = function (event) {
			var row = this.getTargetRow(gx.evt.source(event), 'body');
			if (row)
				this.ownerGrid.rowKeyPressed(event);
		};

		this.clickHandler = function (event) {
			var source = gx.evt.source(event);
			if (source.parentNode && gx.dom.hasClass(source.parentNode, this.pagingBarClass)) {
				gx.evt.waitGridRefresh( function() { this.pagingHandler(source, event)}.closure(this));
			}
		};

		this.pagingHandler = function(source, event) {
			var pagingDirection = '';

			gx.evt.cancel(event, true);
			if (!gx.dom.hasClass(source, this.pagingButtonDisabled)) {
				if (gx.dom.hasClass(source, this.pagingButtonFirstClass)) {
					pagingDirection = 'FIRST';
				}
				else if (gx.dom.hasClass(source, this.pagingButtonPreviousClass)) {
					pagingDirection = 'PREV';
				}
				else if (gx.dom.hasClass(source, this.pagingButtonNextClass)) {
					pagingDirection = 'NEXT';
				}
				else if (gx.dom.hasClass(source, this.pagingButtonLastClass)) {
					pagingDirection = 'LAST';
				}
				
				this.changeGridPage(pagingDirection);
			}
		};

		this.changeGridPage = function (pagingDirection) {
			var hiddenName = this.gxGridName.toUpperCase() + "PAGING",
				ownerGrid = this.ownerGrid,
				eventName = '',
				gridId;
			if (pagingDirection) {
				this.mask();
				if (gx.pO.fullAjax) {
					gx.setGxO(this.parentGxObject);
					eventName = "E" + ownerGrid.realGridName.toUpperCase() + "_" + pagingDirection + "PAGE" + (ownerGrid.isMasterPageGrid ? "_MPAGE" : "");
					if (ownerGrid.parentGrid) {
						gridId = ownerGrid.parentGrid.gridId;
					}
				}
				else {
					gx.fn.setHidden(this.gxCmpContext + hiddenName, pagingDirection);
					eventName = this.gxCmpContext + "E" + hiddenName + '.';
				}
				gx.evt.execEvt( undefined, undefined, eventName, gx.evt.dummyCtrl, gridId, undefined, undefined, false, this.unmask.closure(this));
			}
		}

		this.setRowSelected = function (rowCtrl, cRow, defer, updateUI) {
			updateUI = (updateUI === undefined) || updateUI;

			var doSelect = function () {
				var oldGxO = gx.O;
				if (gx.lang.emptyObject(this.parentGxObject))
					return;
				if (updateUI) {
					if (rowCtrl.gxOriginalBackcolor === undefined)
						rowCtrl.gxOriginalBackcolor = rowCtrl.style.backgroundColor;
					gx.dom.forEachChild(rowCtrl, this, function (cellCtrl) {
						if (rowCtrl.gxOriginalBackcolor === undefined)
							cellCtrl.gxOriginalBackcolor = cellCtrl.style.backgroundColor;
					});
				}
				this.instanciateSelectionVars(cRow);
				var even = false,
					len = this.rows.length,
					i,
					selectedRows = [];

				for (i = 0; i < len; i++) {
					var row = this.rows[i];
					row.selected = (row.gxId == cRow);
					if (!row.selected) {
						if (updateUI) {
							var currRowCtrl = gx.dom.el(this.gxCmpContext + this.gxGridObject + "Row_" + row.gxId);
							if ((currRowCtrl != null) && (currRowCtrl.gxSBackcolor !== undefined)) {
								currRowCtrl.style.backgroundColor = currRowCtrl.gxSBackcolor;
								if (gx.util.browser.isIE()) {
									gx.dom.forEachChild(currRowCtrl, this, function (cellCtrl) {
										if ((cellCtrl != null) && (cellCtrl.gxSBackcolor !== undefined)) {
											cellCtrl.style.backgroundColor = cellCtrl.gxSBackcolor;
										}
									});
								}
								gx.dom.removeClass(currRowCtrl, this.selectedRowClass);
							}
						}
					}
					else {
						if (updateUI) {
							rowCtrl.gxSBackcolor = (rowCtrl.gxOriginalBackcolor !== undefined) ? rowCtrl.gxOriginalBackcolor : rowCtrl.style.backgroundColor;
							rowCtrl.style.backgroundColor = this.gxSelectionColor.Html;
							gx.dom.addClass(rowCtrl, this.selectedRowClass);
						}
						selectedRows.push(row);
					}
					even = !even;
				}

				for (i = 0; i < selectedRows.length; i++) {
					this.instanciateSelectedRow(selectedRows[i]);
					if (updateUI) {
						if (gx.util.browser.isIE()) {
							gx.dom.forEachChild(rowCtrl, this, function (cellCtrl) {
								cellCtrl.gxSBackcolor = (cellCtrl.gxOriginalBackcolor !== undefined) ? cellCtrl.gxOriginalBackcolor : cellCtrl.style.backgroundColor;
								cellCtrl.style.backgroundColor = this.gxSelectionColor.Html;
							});
						}
					}
				}
				gx.setGxO(oldGxO);
			};

			if (defer && (updateUI || gx.O.isTransaction()))
				setTimeout(doSelect.closure(this), 100);
			else
				doSelect.call(this);
		}

		this.instanciateSelectionVars = function (rowId) {			
			gx.setGxO(this.parentGxObject);
			gx.fn.setCurrentGridRow(this.gxId, rowId);
			gx.fn.setHidden(this.gxCmpContext + this.gxGridName.toUpperCase() + "_ROW", rowId.substring(0, 4));			
		}

		this.instanciateSelectedRow = function (row) {
			this.setSelectedRowVars(row);
			if (this.gxOnLineActivate && !this.ownerGrid.isLoading) {
				this.parentGxObject[this.gxOnLineActivate].call(this.parentGxObject, row.gxId);
			}
		}

		this.setSelectedRowVars = function (row) {
			var gxObj = this.parentGxObject;
			var len = this.columns.length;
			for (var i = 0; i < len; i++) {
				var column = this.columns[i];
				var validStruct = gxObj.GXValidFnc[column.gxId];
				if (validStruct != null) {
					var varValue = row.values[i];
					if (this.ownerGrid.isUsercontrol) {
						varValue = this.properties[row.id][column.index].value;
					}
					if (validStruct.v2v)
						validStruct.c2v(varValue);
				}
			}
		}

		this.startRowHover = function (rowCtrl, rowId) {
			if (rowCtrl.gxOriginalBackcolor === undefined)
				rowCtrl.gxOriginalBackcolor = rowCtrl.style.backgroundColor;
			gx.dom.forEachChild(rowCtrl, this, function (cellCtrl) {
				if (cellCtrl.gxOriginalBackcolor === undefined)
					cellCtrl.gxOriginalBackcolor = cellCtrl.style.backgroundColor;
			});
			var row = this.getRowById(rowId);
			if (this.gxAllowHovering && this.gxHoverColor && !row.selected) {
				rowCtrl.gxHBackcolor = rowCtrl.style.backgroundColor;
				rowCtrl.style.backgroundColor = this.gxHoverColor.Html;
				if (gx.util.browser.isIE()) {
					gx.dom.forEachChild(rowCtrl, this, function (cellCtrl) {
						cellCtrl.gxHBackcolor = cellCtrl.style.backgroundColor;
						cellCtrl.style.backgroundColor = this.gxHoverColor.Html;
					});
				}
			}
		}

		this.endRowHover = function (rowCtrl, rowId) {
			var row = this.getRowById(rowId);
			if (this.gxAllowHovering && !row.selected) {
				if (rowCtrl.gxHBackcolor !== undefined) {
					rowCtrl.style.backgroundColor = rowCtrl.gxHBackcolor;
					if (gx.util.browser.isIE()) {
						gx.dom.forEachChild(rowCtrl, this, function (cellCtrl) {
							if (cellCtrl.gxHBackcolor !== undefined) {
								cellCtrl.style.backgroundColor = cellCtrl.gxHBackcolor;
							}
						});
					}
				}
			}
		}

		this.hasPagingButtons = function () {
			return (this.usePaging && (!this.isFirstPage() || !this.isLastPage()));
		}

		this.appendNavBarRowStart = function (navColSpan, buffer) {
			if (gx.lang.emptyObject(this.gxRealTitleBackColor))
				buffer.append('<tr><td colspan="' + navColSpan + '" class="' + this.navigationClass + '" style="text-align: center;">');
			else
				buffer.append('<tr><td colspan="' + navColSpan + '" class="' + this.navigationClass + '" style="text-align: center;background-color:' + this.gxRealTitleBackColor + ';">');
		};

		this.appendNavBarRowEnd = function (buffer) {
			buffer.append("</td></tr>");
		};

		this.appendNavigationBar = function (renderedColumnCount, buffer) {
			var rowCount = this.getRowCount();
			var navColSpan = renderedColumnCount;
			this.navigationClass = this.gxFooterClass;
			if (this.gxIsFreestyle && this.gxGridCols > 1) {
				navColSpan = this.gxGridCols;
			}
			this.appendNavBarRowStart(navColSpan, buffer);

			if (rowCount > 0 || (rowCount === 0 && !this.isFirstPage())) {
				if (this.usePaging) {
					buffer.append('<div class="' + this.pagingBarClass + '" style="padding-bottom:5px;">');

					if (this.currentPage <= 0) {
						this.currentPage = 1;
					}

					buffer.append(this.buildPagingButton(this.pagingButtonFirstClass, !this.isFirstPage(), gx.getMessage("GXM_first")));
					buffer.append(this.buildPagingButton(this.pagingButtonPreviousClass, !this.isFirstPage(), gx.getMessage("GXM_previous")));
					buffer.append(this.buildPagingButton(this.pagingButtonNextClass, !this.isLastPage(), gx.getMessage("GXM_next")));
					buffer.append(this.buildPagingButton(this.pagingButtonLastClass, !this.isLastPage(), gx.getMessage("GXM_last")));
					buffer.append("</div>");
				}
			}
			if (this.isGxTrn() && !this.gxHasAddlines && (this.parentGxObject.Gx_mode != 'DSP')) {
				buffer.append(this.buildLink("[" + this.gxNewRowText + "]", this.gridObject() + ".getNewRows(1,event);", this.gxNewRowText, this.gxGridObject + "_NewRow", this.gridObject() + ".gxNewRowFocused(this);"));
			}
			this.appendNavBarRowEnd(buffer);
		};

		this.buildPagingButton = function(CSSClass, Visible, Title) {
			var btnStyle = 'padding-left:20px;padding-bottom:5px;', //It is in the default Themes now. It is here just for older kbs.
				style = 'style="' + btnStyle + (Visible ? '' : 'opacity:.7;cursor:default') + '"',
				disabledClass = (Visible ? '' : ' ' +  this.pagingButtonDisabled);
			return "<span class=\"" + CSSClass + disabledClass + "\"" + style + " title=\"" + Title + "\">&nbsp;&nbsp;</span>";
		};

		this.buildLink = function(text, onclick, statusMsg, linkId, onfocusCode) {
			var cursorPointer = "cursor:" + (document.createTextRange ? "hand" : "pointer") + ";",
				linkClass = this.navigationLinkClass,
				highlightedLinkClass = this.highlightedNavigationLinkClass,
				linkStr = (linkId !== undefined) ? "id=\"" + linkId + "\"" : "";
			return "<a class='gx_newrow' type='gxlink' style='text-decoration:none;' tabindex='0' onfocus=\"" + onfocusCode + "\" onblur=\"this.style.textDecoration = 'none';\"><span " + linkStr +
						" style=\"" + cursorPointer + "\" class=\"" + linkClass + "\" onclick=\"" + onclick + "\" " +
						"onMouseOver=\"this.className='" + highlightedLinkClass + "';window.status='" + statusMsg + "';return true;\" " +
						"onMouseOut=\"this.className='" + linkClass + "';window.status='';return true;\">" + text + "</span></a>";
		};

		this.isLastPage = function () {
			var isEOF = this.eof;
			return (isEOF != "0");
		}

		this.isFirstPage = function () {
			var isFirst = gx.lang.emptyObject(this.firstRecordOnPage) ? "0" : this.firstRecordOnPage;
			return (isFirst == "0");
		}

		this.getWebImageTag = function (source) {
			return "<img border=\"0\" src=\"/" + this.basePath + this.imgsDir + source.toString() + "\"/>";
		}

		var imgId = 0;
		this.handleLabel = function (label) {
			if (label.src) {
				var id = "img" + imgId;
				imgId++;
				return "<img name='" + id + "' border='0' src='" + label.src + "'>";
			} else {
				return label;
			}
		}

		this.sort = function (row1, row2) {

			if (row1.table.isGxTrn()) {
				if ((!row1.gxExists() && !row2.gxExists()) && (!row1.gxIsMod() && !row2.gxIsMod())) {
					return 0;
				}
				else if ((!row1.gxExists() && row2.gxExists()) || (!row1.gxIsMod() && row2.gxIsMod())) {
					return 1;
				}
				else if ((row1.gxExists() && !row2.gxExists()) || (row1.gxIsMod() && !row2.gxIsMod())) {
					return -1;
				}
			}

			var theGrid = row1.table;
			var column = theGrid.getColumnByIndex(theGrid.sortColumn);
			var values1, values2;

			values1 = row1.values[theGrid.sortColumn];
			values2 = row2.values[theGrid.sortColumn];

			if (!gx.lang.instanceOf(values1, Array)) {
				values1 = [values1];
			}
			if (!gx.lang.instanceOf(values2, Array)) {
				values2 = [values2];
			}

			var prepare;
			switch (column.type) {
			case gx.types.numeric:
				prepare = function (value) {
						value = gx.num.parseFloat(value, gx.thousandSeparator, gx.decimalPoint);
						if (isNaN(value)) {
							value = 0;
						}
						return value;
					}
				break;
			case gx.types.date:
			case gx.types.dateTime:
				prepare = function (value) {
						try { value = new gx.date.gxdate(value).Value; }
						catch (e) {
							gx.dbg.logEx(e, 'JSTable.js', 'sort');
						}
						return value.valueOf();
					}
				break;
			case gx.types.bool:
				prepare = function (value) {
						return gx.lang.booleanValue(value) ? 1 : 0;
					}
				break;
			default:
				prepare = function (value) {
						return String(value).replace(/<[^\>]*\>/g, "").toUpperCase();
					}
				break;
			}

			var maxIndex = Math.max(values1.length, values2.length);
			var comp = 0;
			for (var i = 0; (comp === 0) && (i < maxIndex) ; i++) {
				var var1 = values1[i];
				if (var1 == null) {
					comp = -1;
				}
				var var2 = values2[i];
				if (var2 == null) {
					comp = 1;
				}
				if (comp === 0) {
					var1 = prepare(var1);
					var2 = prepare(var2);
					if (typeof var1.localeCompare == 'function')
						comp = (var1 == var2) ? 0 : var1.localeCompare(var2);
					else
						comp = (var1 == var2) ? 0 : (var1 > var2) ? 1 : -1;
				}
				if (comp !== 0) {
					comp *= (theGrid.ascSort ? 1 : -1);
				}
			}
			return comp;
		};
		
		this.mask = function() {
			var container = this.container || this.getContainerControl();
			if (container.firstChild) {
				gx.dom.mask(container.firstChild);
			}
		};
		
		this.unmask = function() {
			var container = this.container || this.getContainerControl();
			if (container.firstChild) {
				gx.dom.unmask(container.firstChild);
			}
		};
	};
})(gx.$);

gx.grid.column = function (title, type, width, align, valign) {
	this.table = null;
	this.index = -1;
	this.title = title || "";
	this.type = (typeof (type) != 'undefined') ? type : gx.types.character;
	this.width = width || "";
	this.align = align || 'left';
	this.valign = valign || 'middle';
	this.htmlName = null;
	this.visible = true;
	this.enabled = true;
	this.sortable = true;
	this.colspan = 1;
	this.rowspan = 1;
	this.gxId = -1;
	this.gxAttId = -1;
	this.gxAttName = "";
	this.gxWidthUnit = '';
	this.gxChecked = undefined;
	this.gxUnChecked = undefined;
	this.buffer = new gx.text.stringBuffer();
	this.isGxRemove = function () {
		if (this.gxAttName)
			return (this.gxAttName.indexOf("GxRemove") != -1) || (this.gxAttName.indexOf("nRcdDeleted") != -1);
		else
			return false;
	}
};

gx.grid.row = function (id, rowProps, rowId, parentRowId) {
	this.table = null;
	this.id = id;
	this.gxParentRowId = parentRowId || "";
	this.gxId = rowId + this.gxParentRowId;
	this.gxCmpContext = "";
	this.values = [];
	this.selected = false;
	this.gxLvl = 0;
	this.gxProps = rowProps.Props || [];
	this.gxRenderProps = rowProps.RenderProps || [];
	this.gxGrids = [];
	this.gxKeyValues = [];

	this.gxExists = function () {
		var rowExistCtrlValue = gx.fn.getHidden(this.gxCmpContext + "nRcdExists_" + this.gxLvl + "_" + this.gxId);
		if (rowExistCtrlValue != null) {
			return (Number(rowExistCtrlValue) !== 0); //rowExistCtrlValue!=0
		}
		return false;
	}

	this.gxIsMod = function () {
		var rowIsModCtrlValue = gx.fn.getHidden(this.gxCmpContext + "nIsMod_" + this.gxLvl + "_" + this.gxId);
		if (rowIsModCtrlValue != null) {
			return (Number(rowIsModCtrlValue) !== 0);//rowIsModCtrlValue!=0
		}
		return false;
	}

	this.gxDeleted = function () {
		var rowDeletedCtrlValue = gx.fn.getHidden(this.gxCmpContext + "nRcdDeleted_" + this.gxLvl + "_" + this.gxId);
		if (rowDeletedCtrlValue != null) {
			return (Number(rowDeletedCtrlValue) !== 0);//rowDeletedCtrlValue!=0
		}
		return false;
	}

	this.setDeleted = function (boolDel) {
		var intDel = (boolDel ? 1 : 0);
		gx.fn.setHidden(this.gxCmpContext + "nRcdDeleted_" + this.gxLvl + "_" + this.gxId, intDel);
	}
};
/* END OF FILE - ..\js\JavaScripTable.js - */
/* START OF FILE - ..\js\ResponsiveGrid.js - */
gx.grid.responsiveGrid = (function ($) {
	var SIZES = ["xs", "sm", "md", "lg"],
		ROW_CLASS = "row";

	return function (id) {
		var grid = new gx.grid.impl(id);

		grid.appendContainerStart = function (tableId, buffer) {
			buffer.append("<div ");
			this.appendGridClassAttribute(buffer);
			buffer.append(' id="' + tableId + '" ');
			if (!gx.lang.emptyObject(this.gxToolTipText)) {
				buffer.append('title="' + this.gxToolTipText + '" ');
			}

			buffer.append('style="');
			this.appendGridStyle(buffer);
			buffer.append('" ');
			buffer.append(">");
		};

		
		grid.ROW_TAG = "div";
		grid.CELL_TAG = "div";
		grid.ROW_BASE_CLASS = "row";

		grid.getRowRenderingProps = function (even, rowDeleted) {
			var gxRowTag = this.ROW_TAG,
				baseRowClass = this.ROW_BASE_CLASS,
				gridResponsiveCols = this.gxGridResponsiveCols;
			if (this.gxIsFreestyle) {
				gxRowTag = this.CELL_TAG;
				baseRowClass = $.map(SIZES, function (size, i) {
					return ["col-", size, "-", (Math.floor(12 / (gridResponsiveCols[i] || 12)) || 1)].join("");
				}).join(" ");
			}

			var rowClass = baseRowClass;
			if (!this.gxIsFreestyle) {
				rowClass += " " + (even ? this.evenRowClass : this.oddRowClass) + (rowDeleted ? ' RowDeleted' : '');
			}

			return {
				cls: rowClass,
				tag: gxRowTag
			};
		};

		grid.appendGridClassAttribute = function (buffer) {
			buffer.append(" class=\"" + this.gxCssClass + "\"");
		};

		grid.appendContainerEnd = grid.simpleAppendFn("</div>");

		grid.appendHeaderText = gx.emptyFn;

		grid.appendFooterText = gx.emptyFn;

		grid.appendHeader = gx.emptyFn;

		grid.appendBodyWrapperStart = gx.emptyFn;

		grid.appendBodyWrapperEnd = gx.emptyFn;

		grid.appendFooterWrapperStart = grid.simpleAppendFn("<div>");

		grid.appendFooterWrapperEnd = grid.simpleAppendFn("</div>");

		grid.appendRowStart = function (buffer, i, firstRow) {
			if (i == firstRow) {
				buffer.append('<div class="' + ROW_CLASS + '">');
			}
		};

		grid.appendRowEnd = function (buffer, i, firstRow, lastRow) {
			if (i == lastRow) {
				buffer.append('</div>');
			}
		};

		grid.appendRowBreaksWrapperStart = grid.simpleAppendFn("<div>");

		grid.appendRowBreaksWrapperEnd = grid.simpleAppendFn("</div></div>");

		grid.appendRowPrefix = function (buffer, i, firstRow) {
			if (i == firstRow) {
				return;
			}

			var gridResponsiveCols = this.gxGridResponsiveCols;
			var useClearfix = false;
			var visibleSizes = $.map(SIZES, function (size, j) { 
				if ((gridResponsiveCols[j] != 1 && (i % gridResponsiveCols[j] === 0)) || (gridResponsiveCols[j] === 0 && (i % 12 === 0))) {
					useClearfix = true;
					return "visible-" + size;
				}
				else {
					return "";
				}
			}).join(" ");

			if (useClearfix) {
				buffer.append('<div class="clearfix ' + visibleSizes + '"></div>');
			}
		};

		grid.appendCellPrefixStart = function (buffer) {
			if (this.gxGridCols == 1) {
				buffer.append('<div class="row"><div class="col-xs-12">');
			}
		};

		grid.appendCellPrefixEnd = function (buffer) {
			if (this.gxGridCols == 1) {
				buffer.append('</div></div>');
			}
		};


		grid.appendNavigationBar = gx.emptyFn;

		return grid;
	};
})(gx.$);
/* END OF FILE - ..\js\ResponsiveGrid.js - */
/* START OF FILE - ..\js\gxfrmutl.js - */
gx.GxObject = (function($) {
	var gxObject = function () {
		this._isTrn = null;
		this.Gx_mode = "";
		this.ServerClass = "";
		this.ReadonlyForm = false;
		this.ObjectType = "web";
		this.MasterPage = null;
		this.IsMasterPage = false;
		this.IsComponent = false;
		this.AjaxSecurity = true;
		this.OnSessionTimeout = gx.ajax.timeoutActions.ignore;
		this.JustCreated = false;
		this.CmpContext = "";
		this.WebComponents = [];
		this.Grids = [];
		this.UserControls = {};
		this.GridUCsProps = {};
		this.GridUCsEvts = {};
		this.UCBindings = [];
		this.GXValidFnc = [];
		this.GXLastCtrlId = 0;
		this.GXCtrlIds = [];
		this.MsgList = [];
		this.CmpControls = {};
		this.VarControlMap = {};
		this.FormBCs = {};
		this.GridBCs = {};
		this.LvlOlds = [];
		this.Events = {};
		this.EvtParms = {};
		this.hasEnterEvent = false;
		this.focusOnlyNEmb = false;
		this.autoRefresh = false;
		this.conditionsChanged = false;
		this.fromValid = 0;
		this.toValid = 0;
		this.getValidStructFld_cache = {};
		this.cmpRegex = /((?:(?:MP)?W[0-9]{4})*)((?:MP)?W[0-9]{4})/;
		this.sPrefix = function() { 
			return this.CmpContext;
		};

		this.declareDomainHdlr = function( id, fnc) {
			this.GXValidFnc[id].dom_hdl = fnc;
		},

		this.setVCMap = function (ctrlName, id, grid, type) {
			this.VarControlMap[ctrlName] = {
				id: id,
				grid: grid,
				type: type
			};
		};

		this.InitStandaloneVars = function () {			
			var oldGxo = gx.O;
			gx.setGxO(this);
			this.SetStandaloneVars();
			if (oldGxo != null) {
				gx.setGxO(oldGxo);			
			}			
		};

		this.getContainer = function () {
			if (this.containerControl) {
				return gx.dom.el(this.containerControl);
			}

			var cmpCtrl,
				cmpType = this.cmpRegex.exec(this.CmpContext);

			if (cmpType)
				cmpCtrl = gx.dom.el(cmpType[1] + "gxHTMLWrp" + cmpType[2]);
			if (cmpCtrl)
				return cmpCtrl;
		};

		this.setContainer = function (container) {
			this.containerControl = container;
		};

		this.setObjectType = function (Type) {
			this.ObjectType = Type;
		};

		this.getObjectType = function () {
			return this.ObjectType;
		};

		this.isTransaction = function () {
			if (this._isTrn != null) {
				return this._isTrn;
			}
			this._isTrn = (this.getObjectType() == 'trn');
			return this._isTrn;
		};

		this.setAjaxSecurity = function (enabled) {
			this.AjaxSecurity = enabled;
		};

		this.setOnAjaxSessionTimeout = function (action) {
			switch (action) {
				case 'Warn':
					this.OnSessionTimeout = gx.ajax.timeoutActions.warn;
					break;
				case 'CallObj':
					this.OnSessionTimeout = gx.ajax.timeoutActions.callObj;
			}
		}
		this.addKeyListener = function (fKey, evt) {
			gx.evt.addKeyListener(this.CmpContext, fKey, evt);
		};

		this.clearMessages = function () {
			this.MsgList.length = 0;
		};

		this.addMessage = function (Msg) {
			this.MsgList.push(Msg);
		};

		this.showMessages = function () {
			var msgsArr = [];
			var len = this.MsgList.length;
			for (var i = 0; i < len; i++) {
				msgsArr.push({ att: '', type: 2, text: this.MsgList[i] });
			}
			var msgs = {};
			var msgsKey = (this.CmpContext == '') ? 'MAIN' : this.CmpContext;
			msgs[msgsKey] = msgsArr;
			gx.fn.setErrorViewer(msgs);
			this.clearMessages();
		};

		this.setPrompt = function (CtrlId, Deps) {
			gx.fn.attachCtrl(CtrlId, { isPrompt: true, wc: this.CmpContext, mp: this.IsMasterPage, controls: Deps, obj: this });
			if (!this.promptKeyHandlers)
				this.promptKeyHandlers = {};
			this.promptKeyHandlers[CtrlId] = function (ctrl) {
				var el = ctrl || gx.dom.el(this.CmpContext + CtrlId);
				var anchor = el.parentNode;
				if (anchor && anchor.href) {
					var match = anchor.href.match("javascript:(.+)");
					if (match && match.length > 1) {
						var code = decodeURIComponent(match[1]);
						try {
							eval(code);
						}
						catch (e) {
							gx.dbg.logEx(e, 'gxfrmutl.js', 'setPrompt');
						}
					}
				}
			};
		};

		this.readServerVars = function () {
			if (!gx.lang.emptyObject(gx.csv.lastEvtResponse)) {
				var objValues = [];
				var vals = gx.csv.lastEvtResponse.gxValues;
				var len = vals.length;
				for (var i = 0; i < len; i++) {
					var objV = vals[i];
					if (objV.CmpContext == this.CmpContext && gx.lang.booleanValue(objV.IsMasterPage) == this.IsMasterPage) {
						objValues.push(objV);
						break;
					}
				}
				gx.fn.setJsonValues(objValues);
			}
		};

		this.refreshInputs = function (Inputs) {
			var len = Inputs.length;
			for (var i = 0; i < len; i++) {
				var inObj = Inputs[i];
				var validStruct = this.getValidStructFld(inObj[1]);
				if (validStruct != null && typeof (validStruct.c2v) == 'function')
					validStruct.c2v();
			}
		};

		this.refreshOutputs_impl = function (Outputs) {
			var controls = [];
			for (var i = 0, len = Outputs.length; i < len; i++) {
				var outObj = Outputs[i];
				if (outObj.fld) {
					var validStruct = this.getValidStructFld(outObj.fld);
					if (validStruct != null) {
						validStruct.v2c();
						var ctrl = gx.fn.getControlGridRef(validStruct.fld, validStruct.grid);						
						gx.fn.setControlOldValue(ctrl, validStruct.val());
					}
					else {
						var varValue = this.getVariable(outObj.av);
						if (varValue != null && typeof (varValue) == 'object') {
							var formBC = this.getFormBCForVar(outObj.av);
							if (formBC != null) {
								this.bcToScreen(formBC, varValue);
							}
							var boundGrid = this.getGridForColl(outObj.av);
							if (boundGrid) {
								boundGrid.refreshCollection(varValue);
							}
						}
						gx.fn.setHidden(gx.csv.ctxControlId(outObj.fld, this), varValue);
					}
				}
				else if (outObj.ctrl) {
					controls.push(outObj);
				}
			}
			for (var i = 0, len = controls.length; i < len; i++) {
				var outObj = controls[i];
				if (gx.uc.isUserControl(outObj.ctrl)) {
					outObj.ctrl.execV2CFunctions(false);
					outObj.ctrl.execShowFunction();
				}
			}
		};

		this.refreshOutputs = function (Outputs) {
			this.refreshOutputs_impl(Outputs);
			this.showMessages();
		};

		this.refreshRowOutputs = function (Outputs) {
			this.refreshOutputs_impl(Outputs);
		};

		this.refreshServerOutputs = function (Outputs) {
			var len = Outputs.length;
			for (var i = 0; i < len; i++) {
				var outObj = Outputs[i];
				var hiddenValue = gx.fn.getHidden(this.CmpContext + outObj.fld);
				if (hiddenValue != undefined) {
					var vStruct = this.getValidStructFld(outObj.fld);
					if (vStruct && vStruct.v2v) {
						vStruct.v2v(hiddenValue);
						vStruct.v2c();
					}
					else {
						this.setVariable(Outputs[i].av, hiddenValue);
					}
				}
			}
		}

		this.getContextObject = function (ControlId) {
			var validStruct = this.getValidStructFld(ControlId);
			if (validStruct != null) {
				var Value = gx.fn.getControlValue_impl(this.CmpContext + ControlId);
				if (Value != null)
					return Value;
			}
			return "";
		};

		this.getValidStructId = function (Fld) {
			if (!gx.lang.emptyObject(Fld)) {
				var ctrlIds = this.getControlIds();
				for (var i = 0; i < ctrlIds.length; i++) {
					var validStruct = this.getValidStruct(ctrlIds[i]);
					if (this.isSameField(validStruct, Fld))
						return ctrlIds[i];
				}
			}
			return -1;
		};

		this.getValidStructFld = function (Fld) {
			if (typeof Fld == 'object' && Fld.tagName) {
				Fld = gx.dom.id(Fld);
			}
			if (this.getValidStructFld_cache[Fld])
				return this.getValidStructFld_cache[Fld];
			if (!gx.lang.emptyObject(Fld)) {
				var ctrlIds = this.getControlIds();
				var len = ctrlIds.length;
				for (var i = 0; i < len; i++) {
					var validStruct = this.getValidStruct(ctrlIds[i]);
					if (this.isSameField(validStruct, Fld)) {
						this.getValidStructFld_cache[Fld] = validStruct;
						return validStruct;
					}
				}
			}
			this.getValidStructFld_cache[Fld] = null;
			return null;
		};

		this.isSameField = function (validStruct, TestFld) {
			var Fld = validStruct.fld;
			if (Fld == TestFld) {
				return true;
			}
			if (this.IsComponent) {
				var ctxIdx = TestFld.indexOf(this.CmpContext);
				if (ctxIdx == 0)
					TestFld = TestFld.substring(this.CmpContext.length);
			}
			if (validStruct.grid != 0) {
				TestFld = TestFld.replace(/_([0-9]{4})*$/, '')
			}
			return (Fld == TestFld);
		};

		this.getUserFocus = function () {
			var usrFocusId = gx.fn.getHidden(this.CmpContext + 'GX_FocusControl');
			if (!gx.lang.emptyObject(usrFocusId) && usrFocusId != 'notset') {
				var Control = gx.dom.byId(usrFocusId);
				if (!gx.lang.emptyObject(Control) && !gx.fn.isAccepted(Control)) {
					var tCmp = gx.csv.cmpCtx;
					gx.csv.cmpCtx = this.CmpContext;
					var tgxo = gx.O;
					gx.O = this;
					Control = gx.fn.firstAcceptedControl(gx.popup.ispopup());
					gx.O = tgxo;
					gx.csv.cmpCtx = tCmp;
					if (!gx.lang.emptyObject(Control))
						usrFocusId = Control.id;
					else
						usrFocusId = "";
				}
			}
			if (gx.lang.emptyObject(usrFocusId)) {
				if (this.hasMasterPage()) {
					usrFocusId = this.MasterPage.getUserFocus();
					if (!gx.lang.emptyObject(usrFocusId))
						return usrFocusId;
				}
				var mpComponents = [];
				for (var i = 0; i < this.WebComponents.length; i++) {
					//Components in the current object first
					if (this.WebComponents[i].CmpContext.indexOf('MP') == 0)
						mpComponents.push(this.WebComponents[i]);
					else {
						usrFocusId = this.WebComponents[i].getUserFocus();
						if (!gx.lang.emptyObject(usrFocusId))
							return usrFocusId;
					}
				}
				for (var j = 0; j < mpComponents.length; j++) {
					//Components in the master page
					usrFocusId = mpComponents[j].getUserFocus();
					if (!gx.lang.emptyObject(usrFocusId))
						return usrFocusId;
				}
			}
			return usrFocusId;
		};

		this.hasMasterPage = function () {
			return (this.MasterPage != null);
		};

		this.setComponent = function (CmpCtrl) {
			this.CmpControls[CmpCtrl.id.toLowerCase()] = CmpCtrl;
		};

		this.refreshGrid = function(GridCtrl)
		{
			var grid = this.getGrid(GridCtrl);
			if (grid) {
				grid.doRefresh();
			}
		}

		this.refreshComponent = function ( CmpCtrl) {
			var cmp = this.getWebComponent(this.CmpContext + this.getComponentData(CmpCtrl).Prefix);
			if (cmp) {
				gx.evt.dispatcher.dispatch('REFRESH', cmp);
			}
			else {
				var gridId = gx.fn.controlGridId(CmpCtrl);
				if (gridId !== 0) {
					cmp = gx.pO.getWebComponent(this.CmpContext + this.getComponentData(CmpCtrl).Prefix + gx.fn.currentGridRow(gridId));
					if (cmp)
						gx.evt.dispatcher.dispatch('REFRESH', cmp);
				}
			}
		};

		this.getComponentPrefix = function (CtrlName) {
			var wc = this.getComponentData(CtrlName);
			if (wc) {
				return (wc.Prefix || '');
			}
			return '';
		};

		this.getComponentData = function (CtrlName) {
			return this.CmpControls[CtrlName.toLowerCase()];
		};

		this.createWebComponent = function (CtrlName, PgmName, Parms, gRow, TargetCtrlId, CmpPrefix) {
			var gridId;
			CmpPrefix = CmpPrefix || this.getComponentPrefix(CtrlName);
			if (!gRow)
			{
				gridId = gx.fn.controlGridId(CtrlName);
				gRow = (gridId !== 0) ? gx.fn.currentGridRow(gridId) : '';
			}
			TargetCtrlId = TargetCtrlId || this.CmpContext + 'gxHTMLWrp' + CmpPrefix + gRow;
			CmpPrefix = this.CmpContext + CmpPrefix;
			var gxO = gx.getObj(CmpPrefix, false);
			if (gxO) {
				gxO.startFeedback();
			}
			else {
				gx.dom.mask(TargetCtrlId);
			}
			var javaPackage = (gx.gen.isJava() && gx.pO.PackageName) ? gx.pO.PackageName + '.' : "";
			gx.ajax.dynComponent(javaPackage + PgmName, Parms, CmpPrefix, gRow).done(function (srvResponse) {
				if (!srvResponse.DynComponentMap) {
					srvResponse.DynComponentMap = {};
				}
				srvResponse.DynComponentMap[CmpPrefix + gRow] = TargetCtrlId;
				gx.ajax.setPostResponse(srvResponse);
				if (gxO) {
					gxO.endFeedback();
				}
				else {
					gx.dom.unmask(TargetCtrlId);
				}
			});
		};

		this.setWebComponent = function (gxComponent) {
			this.deleteComponent(gxComponent.CmpContext, gxComponent, false);
			this.WebComponents[gxComponent.CmpContext] = gxComponent;
			this.WebComponents.push(gxComponent);
			gxComponent.JustCreated = true;
			gx.fn.setHidden(gxComponent.CmpContext, gxComponent.ServerClass);
			gx.fx.obs.notify('webcom.render', [gxComponent]);
		};

		this.getWebComponent = function (cmpCtx) {
			return this.WebComponents[cmpCtx];
		};

		this.deleteComponent = function (cmpCtx, newCompObj, deleteHiddens) {
			deleteHiddens = typeof(deleteHiddens) == 'undefined' ? true : deleteHiddens;
			var cmpObj = this.getWebComponent(cmpCtx);
			if (cmpObj) {
				gx.cache.deleteInlineCode(cmpCtx + cmpObj.ServerClass.toLowerCase());
				if (deleteHiddens)
					this.deleteComponentHiddens(cmpCtx);
				if (!gx.lang.emptyObject(newCompObj))
					gx.fn.setHidden(newCompObj.CmpContext, newCompObj.ServerClass);
				cmpObj.ondestroy();
				delete this.WebComponents[cmpCtx];
				var len = this.WebComponents.length;
				for (var i = 0; i < len; i++) {
					if (this.WebComponents[i].CmpContext == cmpCtx) {
						this.WebComponents.removeAt(i);
						break;
					}
				}
				var localArray = this.WebComponents;
				for (var currentCtx in localArray) {
					if (isNaN(parseInt(currentCtx))) {
						if (currentCtx.indexOf(cmpCtx) === 0) {
							this.deleteComponent(currentCtx);
						}
					}
				}
			}
		};

		this.deleteComponentHiddens = function (cmpCtx) {
			var hiddens = gx.fn.filterHiddens(new RegExp("^" + cmpCtx), gx.http.viewState);
			for (var hiddenName in hiddens) {
				if (hiddenName)
					gx.fn.deleteHidden(hiddenName);
			}
		};

		this.setCmpContext = function (cmpCtx) {
			if (cmpCtx != undefined) {
				if (cmpCtx !== '')
					this.IsComponent = true;
				this.CmpContext = cmpCtx;
			}
		};

		this.getOldLvl = function (Name) {
			for (var lvl in this.LvlOlds) {
				var lvlOlds = this.LvlOlds[lvl];
				var len = lvlOlds.length;
				for (var i = 0; i < len; i++) {
					if (lvlOlds[i] == Name)
						return lvl;
				}
			}
			return -1;
		};

		this.refreshDependantGrids = function (validStruct) {
			var len = this.Grids.length;
			for (var i = 0; i < len; i++) {
				var gxGrid = this.Grids[i];
				var refreshVars = gxGrid.refreshVars;
				var len1 = refreshVars.length;
				for (var j = 0; j < len1; j++) {
					if (refreshVars[j].fld == validStruct.fld) {
						gxGrid.filterVarChanged();
						break;
					}
				}
			}
		};

		this.setGrid = function (gxGrid) {
			this.Grids[gxGrid.gridName] = gxGrid;
			var gridIdx = this.getGridIdxByName(gxGrid.gridName);
			if (gridIdx != -1) {
				this.Grids[gridIdx] = gxGrid;
			}
			else {
				this.Grids.push(gxGrid);
			}
		};

		this.getGrid = function (gridName) {
			return this.Grids[gridName];
		};

		this.getGridIdxByName = function (gridName) {
			var len = this.Grids.length;
			for (var i = 0; i < len; i++) {
				var gxGrid = this.Grids[i];
				if (gxGrid.gridName == gridName)
					return i;
			}
			return -1;
		};

		this.getGridIdx = function (gridId) {
			var len = this.Grids.length;
			for (var i = 0; i < len; i++) {
				var gxGrid = this.Grids[i];
				if (gxGrid.gridId == gridId)
					return i;
			}
			return -1;
		};

		this.getGridById = function (gridId, row) {
			var row = row || '';
			var len = this.Grids.length;
			for (var i = 0; i < len; i++) {
				var gxGrid = this.Grids[i];
				if (gxGrid.gridId == gridId && (!gxGrid.parentRow || gx.text.endsWith(row, gxGrid.parentRow.gxId)))
					return gxGrid;
			}
			return null;
		};

		this.getGridForColl = function (collVarName) {
			var len = this.Grids.length;
			for (var i = 0; i < len; i++) {
				var gxGrid = this.Grids[i];
				if (gxGrid.boundedCollName == collVarName)
					return gxGrid;
			}
			return null;
		};

		this.getFormBCForVar = function (varName) {
			for (var bcName in this.FormBCs) {
				var bc = this.FormBCs[bcName];
				if (bc && bc.gxvar == varName)
					return bc;
			}
			return null;
		};

		this.getGridBC = function (bcName) {
			var bcName1 = bcName;
			if (this.IsComponent) {
				var ctxIdx = bcName.indexOf(this.CmpContext);
				if (ctxIdx === 0)
					bcName1 = bcName.substring(this.CmpContext.length);
			}
			return this.GridBCs[bcName1];
		};

		this.getFormBC = function (bcName) {
			var bcName1 = bcName;
			if (this.IsComponent) {
				var ctxIdx = bcName.indexOf(this.CmpContext);
				if (ctxIdx === 0)
					bcName1 = bcName.substring(this.CmpContext.length);
			}
			return this.FormBCs[bcName1];
		};

		this.addGridBCProperty = function (bcName, bcProp, vStruct, bcVarName) {
			var bc = this.getGridBC(bcName);
			if (typeof (bc) == 'undefined') {
				bc = {};
				bc.gxvar = bcVarName;
				this.GridBCs[bcName] = bc;
			}
			this.addBCProperties(bc, bcProp, vStruct, bcVarName);
		};

		this.addBCProperty = function (bcName, bcProp, vStruct, bcVarName) {
			var bc = this.getFormBC(bcName);
			if (typeof (bc) == 'undefined') {
				bc = {};
				bc.gxvar = bcVarName;
				this.FormBCs[bcName] = bc;
			}
			this.addBCProperties(bc, bcProp, vStruct, bcVarName);
		};

		this.addBCProperties = function (bc, bcProp, vStruct, bcVarName) {
		    if(bc){
			    if (bcProp instanceof Array) {
				    var obj = bc;
				    var len = bcProp.length;
				    var v2bcFunc = function () {
					    var propValue = this[vStruct.gxvar];
					    if (vStruct.type == 'date') {
						    var dateObj = new gx.date.gxdate(propValue);
						    propValue = dateObj.getString('Y4MD');
					    }
					    this.valueToBCProp(this[bcVarName], bcProp, vStruct, propValue);
				    };
				    for (var i = 0; i < len; i++) {
					    if (typeof (obj[bcProp[i]]) == 'undefined') {
						    if (i < len - 1) {
							    obj[bcProp[i]] = {};
						    }
						    else {
							    obj[bcProp[i]] = vStruct;
							    if (typeof (this[bcVarName]) == 'object') {
								    vStruct.v2bc = v2bcFunc;
							    }
							    break;
						    }
					    }
					    obj = obj[bcProp[i]];
				    }
			    }
			    else if (typeof (bcProp) == 'string') {
				    bc[bcProp] = vStruct;
			    }
			}
		};

		this.valueToBCProp = function (bc, bcProp, vStruct, pValue) {
			try {
		        if(bc){
				    var obj = bc;
				    var len = bcProp.length;
				    for (var i = 0; i < len; i++) {
						if (gx.lang.isArray(obj) && vStruct && vStruct.grid) {
							obj = obj[Number(gx.fn.currentGridRow(vStruct.grid)) - 1];
						}
						if (len > 1 && i < len - 1 && obj[bcProp[i]] === undefined) {
							obj[bcProp[i]] = {};
						}
						if (typeof (obj[bcProp[i]]) == 'object') {
							obj = obj[bcProp[i]];
						}
						else {
							obj[bcProp[i]] = pValue;
							break;
						}
				    }
			    }
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'valueToBCProp');
			}
		};

		this.bcToScreen = function (bc, data) {
			for (var prop in bc) {
				if (prop == 'gxvar') {
					continue;
				}
				try {
					if (typeof (data[prop]) == 'object') {
						this.bcToScreen(bc[prop], data[prop]);
					}
					else {
						var vStruct = bc[prop];
						if ((vStruct.grid == 0 || (gx.csv.validatingGrid && vStruct.grid == gx.csv.validatingGrid.gridId)) && gx.lang.emptyObject(vStruct.hc)) {
							if (vStruct.v2v) {
								vStruct.v2v(data[prop]);
								vStruct.v2c();
							}
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'bcToScreen');
				}
			}
		};

		this.addGridUCEventHandler = function (CtrlName, EvtName, EvtHandler) {
			if (gx.lang.emptyObject(this.GridUCsEvts[CtrlName]))
				this.GridUCsEvts[CtrlName] = [];
			this.GridUCsEvts[CtrlName].push({ e: EvtName, h: EvtHandler });
		};

		this.getGridUCEventHandlers = function (CtrlName) {
			var handlers = this.GridUCsEvts[CtrlName];
			if (gx.lang.emptyObject(handlers))
				return [];
			return handlers;
		};

		this.setGridUCDynProp = function (CtrlName, PropName, HiddenName, Value, PropType) {
			this.setGridUCProp(CtrlName, PropName, HiddenName, undefined, PropType);
		};

		this.setGridUCProp = function (CtrlName, PropName, HiddenName, Value, PropType) {
			if (gx.lang.emptyObject(this.GridUCsProps[CtrlName]))
				this.GridUCsProps[CtrlName] = [];
			this.GridUCsProps[CtrlName].push({ p: PropName, h: HiddenName, v: Value, t: PropType });
			if (PropName == "InternalTitle") {
				this.GridUCsProps[CtrlName].title = Value;
			}
		};

		this.getGridUCProperties = function (CtrlName) {
			var props = this.GridUCsProps[CtrlName];
			if (gx.lang.emptyObject(props))
				return [];
			return props;
		};

		this.addUsercontrolBinding = function (VarName, CtrlName, UC) {
			if (!this.UCBindings[VarName]) {
				this.UCBindings[VarName] = {
					fld: CtrlName,
					uc: []
				};
			}
			if (!gx.util.inArray(UC, this.UCBindings[VarName].uc)) {
				this.UCBindings[VarName].uc.push(UC);
			}
		};

		this.setUserControl = function (gxUC) {
			if (!gxUC.ContainerName)
				return;
			this.UserControls[gxUC.ContainerName] = gxUC;
		};

		this.getUserControl = function (cName) {
			var uc = this.UserControls[cName];
			if (!uc && this.CmpContext != '') {
				uc = this.UserControls[this.CmpContext + cName];
			}
			return uc;
		};
 
		this.getUserControlGrids = function () {
			return $.map(this.Grids, function (item) {
			  if (item.grid && item.isUsercontrol)
				return item.grid;
			});
		};

		this.execV2CFunctions = function (Show, userControls) {
			if (!userControls || (gx.lang.isArray(userControls) && userControls.length == 0)) {
				userControls = this.UserControls
			}
			var gxO = this;
			$.each(userControls, function (i, uc) {
				if (gxO == uc.ParentObject) {
					uc.updateAndShow(Show);
				}
			});
		};

		this.execC2VFunctions = function () {			
			$.each(this.UserControls, function (i, uc) {
				try { uc.execC2VFunctions(); }
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'execC2VFunctions');
				}
				try { uc.saveProperties(); }
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'execC2VFunctions');
				}
			});
		};

		this.setMode = function () {
			gx.fn.setHidden(this.CmpContext + "_MODE", this.Gx_mode);
			gx.fn.setHidden(this.CmpContext + "Mode", this.Gx_mode);
		};

		this.setVariable = function (VarName, Value) {
			this[VarName] = Value;
			var FormattedValue = Value;
			if (VarName.indexOf(this.CmpContext) != 0)
				gx.fn.setHidden(this.CmpContext + VarName, Value);
			if (this.VarControlMap[VarName] != undefined) {
				var type = this.VarControlMap[VarName].type;
				if (type == "date" || type == "dtime") {
					if (typeof (Value) == "string") {
						Value = new gx.date.gxdate(Value);
						this[VarName] = Value;
					}
					if (type == "date")
						FormattedValue = Value.getStringWithFmt('Y4MD');
					else
						FormattedValue = Value.getStringWithFmt('Y4MD') + ' ' + Value.getTimeString(true, true);
				}
				if (type == "decimal" && gx.decimalPoint != '.') {
					FormattedValue = Value.toString().replace('.', gx.decimalPoint);
					if (typeof (Value) == "string")
						this[VarName] = gx.num.parseFloat(Value);
				}
				else if (type == "int" && typeof (Value) == "string") {
					this[VarName] = gx.num.parseInt(Value);
				}
				gx.fn.setHidden(this.CmpContext + this.VarControlMap[VarName].id, FormattedValue);
			}
			if (VarName == "Gx_mode")
				this.setMode();
			if (this.UCBindings[VarName] != undefined)
				gx.fn.setHidden(this.CmpContext + this.UCBindings[VarName].fld, Value);
		};

		this.getVariable = function (VarName) {
			return this[VarName];
		};

		this.isServerEvent = function (ClientEvtName) {
			return this.Events[ClientEvtName][1] || false;
		};
		
		this.getServerEventName = function (ClientEvtName) {
			return this.Events[ClientEvtName][0] || "";
		};
		
		this.getClientEventName = function (ServerEvtName) {
			for (var evtName in this.Events) {
				if (this.Events[evtName][0] == ServerEvtName) {
					return evtName;
				}
			}
			return "";
		};

		this.setEventParameters = function (ParmsData, Values) {
			gx.csv.lastEvtRow = null;
			gx.O = this;
			var allSameGrid = true;
			var pGrid = -1;
			gx.csv.cmpCtx = this.CmpContext;
			var len = ParmsData.length;
			for (var i = 0; i < len; i++) {
				var ParmName = ParmsData[i][0];
				var CtrlName = ParmsData[i][1];
				var VarName = ParmsData[i][2];
				var found = false;
				for (var valProp in Values) {
					if (valProp.toLowerCase() == ParmName.toLowerCase()) {
						this.setVariable(VarName, Values[valProp]);
						found = true;
						break;
					}
				}
				if (!found)
					this.setVariable(VarName, Values);
				var validStruct = this.getValidStructFld(CtrlName);
				if (validStruct != null) {
					if ((validStruct.grid != 0) && (pGrid == -1))
						pGrid = validStruct.grid;
					else if ((validStruct.grid != 0) && (validStruct.grid != pGrid))
						allSameGrid = false;
					validStruct.v2c();
				}
				else
					gx.fn.setHidden(this.CmpContext + CtrlName, this.getVariable(VarName));
			}
			if (allSameGrid)
				gx.csv.lastEvtRow = gx.fn.currentGridRowImpl(pGrid);
		};

		this.executeServerEvent = function (EvtName, Synch, EvtRow, Force) {
			gx.O = this;
			gx.csv.cmpCtx = this.CmpContext;
			var synchReq = true;
			if ((Synch != undefined) && (Synch == false))
				synchReq = false;
			var row = (typeof (EvtRow) == 'string') ? EvtRow : '';
			if (!gx.lang.emptyObject(gx.csv.lastEvtRow))
				row = gx.csv.lastEvtRow;
			var gridId = !gx.lang.emptyObject(gx.csv.validatingGrid) ? gx.csv.validatingGrid.gridId : false;
			if (row == '' && gridId)
				row = gx.csv.lastRow[gridId];
			if (typeof (row) == 'undefined')
			    row = gx.fn.currentGridRowImpl(gx.csv.validatingGrid.gridId);
			var evtName = this.CmpContext + "E" + EvtName + "." + row;
			gx.evt.execEvt(this.CmpContext, this.IsMasterPage, evtName, gx.evt.dummyCtrl, gridId, synchReq, null, null, null, Force);
		};

		this.executeEnterEvent = function (evt, ctrl) {
		    //gx.evt.onchange_impl(ctrl, true); CM: Do not call onchange_impl here, see blame
			if (ctrl && ctrl.onblur)
				ctrl.onblur();
			if (gx.evt.cancelAndRefresh(evt)) {
				return;
			}
			if (gx.dom.hasSubmitControl()) {
				gx.evt.cancel(evt, true);
			}
			if (ctrl && ctrl.nodeName == 'INPUT' && gx.dom.isEditControl(ctrl)) {
				gx.evt.cancel(evt, true);
			}
			var gxOEnter = this.gxOWithEnter();
			if (gxOEnter != null) {
				gx.evt.enter = true;
				var enterName = 'ENTER';
				if (gxOEnter.IsMasterPage)
					enterName = enterName + '_MPAGE';
				enterName = gxOEnter.CmpContext + 'E' + enterName + '.';
				var gridId;
				if (gx.evt.isEnterEvtCtrl(ctrl)) {
					var rowId = gx.fn.controlRowId(ctrl),
						gridId = gx.fn.controlGridId(ctrl.id);
					if (rowId)
						enterName += rowId;
				}
				gx.evt.execEvt(gxOEnter.CmpContext, gxOEnter.IsMasterPage, enterName, gx.evt.dummyCtrl, gridId);
				gx.evt.enter = false;
				gx.evt.cancel(evt, true);
			}
		};

		this.gxOWithEnter = function () {
			if (this.hasEnterEvent) {
				return this;
			}
			else if (this.IsComponent) {
				var cmpType = this.cmpRegex.exec(this.CmpContext);
				var isMPage = ((cmpType[1] == '') && (cmpType[0].indexOf('MP') == 0));
				var parent = gx.getObj(cmpType[1], isMPage);
				if (!gx.lang.emptyObject(parent)) {
					return parent.gxOWithEnter();
				}
			}
			else if (this.hasMasterPage()) {
				return this.MasterPage.gxOWithEnter();
			}
			return null;
		};

		this.getLastControlId = function () {
			return this.GXLastCtrlId;
		};

		this.getValidStruct = function (ctrlId) {
			return this.GXValidFnc[ctrlId];
		};

		this.getControlIds = function () {
			return this.GXCtrlIds;
		};

		this.getControlIdsh = function () {
			return this.GXCtrlIdsh;
		};

		this.getUsercontrolFromChild = function (Child) {			
			$.each(this.UserControls, function (i, uc) {
				var ctrl = uc.getContainerControl();
				if (gx.dom.isChildNode(Child, ctrl))
					return uc;
			});
			return null;
		};

		this.installFlatLevelDatePickers = function () {
			var validStruct = null;
			var ctrlIds = this.getControlIds();
			var len = ctrlIds.length;
			for (var i = 0; i < len; i++) {
				validStruct = this.getValidStruct(ctrlIds[i]);
				if ((validStruct != undefined) && (validStruct.grid == 0) && (validStruct.dp != undefined)) {
					var controlId = this.CmpContext + validStruct.fld;
					gx.fn.installDatePicker(controlId, validStruct.dp.f, validStruct.dp.st, validStruct.dp.wn, validStruct.dp.mf, gx.fn.datePickerFormat(validStruct.dp.pic, validStruct.dp.dec, validStruct.len));
				}
			}
		};

		this.installImageControls = function () {
			var containers = gx.dom.byClass('gx-multimedia-upload');
			for (var i = 0, len = containers.length; i < len; i++) {
				gx.html.multimediaUpload.createControl(containers[i]);
			}
			gx.fx.obs.addObserver('gx.multimedia.clear', this, this.clearMultimediaValue);
		};


		this.initControlsEnabledFlag = function () {
			$.each(gx.O.GXValidFnc, function (i, vStruct) {
				if (vStruct && vStruct.fld && vStruct.type != 'bits' && vStruct.type != 'audio' && vStruct.type != 'video') {
					var el = gx.fn.getControlRef(vStruct.fld);
					if (el) {
						var isEnabled = gx.http.viewState[gx.dom.id(el) + "_Enabled"];
						if (isEnabled !== undefined) {
							gx.fn.setEnabledProperty(el, gx.lang.gxBoolean(isEnabled), false);
						}
					}
				}
			});
		};

		this.clearMultimediaValue = function (el) {
			var elements = gx.html.multimediaUpload.getElements(el);
			elements.fileField.onchange(elements.fileField);
			gx.fn.setHidden(elements.fileField.id, "");
			gx.fn.setHidden(elements.uriField.id, "");
			gx.fn.setHidden(elements.fileField.id + "_gxBlob", "");
		};

		this.refreshOlds = function () {
			for (var lvl in this.LvlOlds) {
				var lvlOlds = this.LvlOlds[lvl];
				if (typeof (lvlOlds) != 'function') {
					var gridId = gx.fn.lvlGrid(parseInt(lvl, 10));
					var gridRow;
					if (gridId != 0)
						gridRow = gx.fn.currentGridRow(gridId);

					var len = lvlOlds.length;
					for (var i = 0; i < len; i++) {
						var name = lvlOlds[i];
						var varName = name;
						var oldVal = '';
						var vStruct = gx.fn.vStructForOld(varName);
						if (vStruct) {
							if (!vStruct.gxgrid || vStruct.gxgrid.grid.rows.length > 0)
								oldVal = gx.typedOld(vStruct.fld, varName, vStruct.type);
						}
						else {
							if (!gx.lang.emptyObject(gridRow))
								name += '_' + gridRow;
							oldVal = gx.fn.getHidden(name);
						}
						if (typeof (oldVal) != 'undefined') {
							if (!vStruct) {
								window[varName] = oldVal;
							}
							this[varName] = oldVal;
						}
					}
				}
			}
		};

		this.deleteEventHandlers = function () {
			try {
				gx.fx.ctx.deleteHandlers(this);
				gx.fx.dnd.deleteHandlers(this);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'deleteEventHandlers');
			}
		};

		this.ondestroy = function () {
			try {
				this.endFeedback();
				this.deleteEventHandlers();
				$.each(this.UserControls, function (i, uc) {
					if (!gx.lang.emptyObject(uc.destroy)) {
						try {
							uc.destroy();
						}
						catch (e) {
							gx.dbg.logEx(e, 'gxfrmutl.js', 'ondestroy');
						}
					}
				});
				delete this.containerControl;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'ondestroy');
			}
		};

		this.onpost = function () {
			var gxO = gx.O;
			gx.setGxO(this);
			if (this.hasMasterPage())
				this.MasterPage.onpost();
			var len = this.WebComponents.length;
			for (var i = 0; i < len; i++) {
				this.WebComponents[i].onpost();
			}
			if (this.ReadonlyForm && this.IsComponent && gxO != this) {
				this.roControlsAsHidden();
			}
			this.execC2VFunctions();
			gx.setGxO(gxO);
		};

		this.roControlsAsHidden = function () {
			var ctrlIds = this.getControlIds();
			var len = ctrlIds.length;
			for (var i = 0; i < len; i++) {
				var validStruct = this.getValidStruct(ctrlIds[i]);
				if (validStruct.grid == 0 && typeof (validStruct.val) == 'function') {
					var ctrlId = this.CmpContext + validStruct.fld;
					var ctrl = gx.dom.el(ctrlId);
					if (ctrl && !gx.fn.isAccepted(ctrl))
						gx.fn.setHidden(ctrlId, gx.fn.getControlValue(ctrlId));
				}
			}
		};

		this.onload = function (loadGrids) {
			gx.dbg.logPerf('objectOnload_' + this.CmpContext + this.ServerClass);
			gx.setGxO(this);
			this.screenToVars();
			if (this.hasMasterPage()) {
				this.MasterPage.onload();
				gx.setGxO(this);
			}

			var len = this.Grids.length;
			if (loadGrids !== false) {
				for (var i = 0; i < len; i++) {
					this.Grids[i].loadGrid();
				}
			}

			len = this.WebComponents.length;
			for (var i = 0; i < len; i++) {
				this.WebComponents[i].onload(loadGrids);
			}
			gx.setGxO(this);
			this.installFlatLevelDatePickers();
			this.installImageControls();
			this.refreshOlds();
			this.initControlsEnabledFlag();
			this.execV2CFunctions(true);
			this.JustCreated = false;
			gx.dbg.logPerf('objectOnload_' + this.CmpContext + this.ServerClass);
		};

		this.onunload = function (unloadMasterPage) {
			if (this.hasMasterPage() && unloadMasterPage !== false)
				this.MasterPage.onunload();
			var len = this.Grids.length;
			for (var i = len - 1; i >= 0; i--) {
				delete this.Grids[this.Grids[i].gridName];
				this.Grids[i].cleanup();
				this.Grids.splice(i, 1);
			}
			len = this.WebComponents.length;
			for (var i = len - 1; i >= 0; i--) {
				delete this.WebComponents[this.WebComponents[i].CmpContext];
				this.WebComponents[i].onunload();
				this.WebComponents.splice(i, 1);
			}
			this.getValidStructFld_cache = {};
			gx.fn.cleanAttachedCtrls();
			this.ondestroy();
		};

		this.clean = function (unloadMasterPage) {
			this.cleanHiddens();
			this.onunload(unloadMasterPage);
		};

		this.cleanHiddens = function () {
			gx.http.clearState();
		};

		this.screenToVars = function () {
			try {
				var ctrlIds = this.getControlIds();
				var len = ctrlIds.length;
				for (var i = 0; i < len; i++) {
					var validStruct = this.getValidStruct(ctrlIds[i]);
					if (validStruct && validStruct.lvl == 0 && typeof (validStruct.c2v) == 'function')
						validStruct.c2v();
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'screenToVars');
			}
		};

		this.postbackLoad = function (userControls) {
			if (this.hasMasterPage())
				this.MasterPage.postbackLoad(userControls);
			var len = this.WebComponents.length;
			for (var i = 0; i < len; i++) {
				this.WebComponents[i].postbackLoad(userControls);
			}
			if (this.IsComponent && this.JustCreated) {
				this.installImageControls();
				this.installFlatLevelDatePickers();
			}
			this.execV2CFunctions(true, userControls);
			this.JustCreated = false;
			this.conditionsChanged = false;
		};

		this.addDragSource = function (ControlId, CSSClass, Types, Handler) {
			gx.fx.dnd.addSource(this, ControlId, CSSClass, Types, Handler);
		};

		this.addDropTarget = function (ControlId, CSSClass, Types, Handler) {
			gx.fx.dnd.addTarget(this, ControlId, CSSClass, Types, Handler);
		};

		this.addContextSetter = function (ControlId, CSSClass, Types, Handler) {
			gx.fx.ctx.addSetter(this, ControlId, CSSClass, Types, Handler);
		};

		this.addContextTracker = function (ControlId, CSSClass, Types, Handler) {
			gx.fx.ctx.addTracker(this, Types, Handler);
		};
		this.addOnMessage = function (GroupName, EventName, Types, Handler, NoWait) {
		    gx.fx.notifications.addTracker(this, GroupName, EventName, Types, Handler, NoWait);
		};

		this.addEventHandler = function (EvtType, ControlId, Handler) {
			gx.fx.dom.addEventHandler(this, EvtType, ControlId, Handler);
		};

		this.updateBitmapValue = function (controlId, blobProperty, uriProperty, value) {
			var multimediaCt = gx.html.multimediaUpload.getContainer(controlId);
			var type = gx.html.multimediaUpload.getOptionValue(multimediaCt);
			if (type == "file")
				this[blobProperty] = value;
			else
				this[uriProperty] = value;
		};

		var feedbackTimeoutId,
			feedbackCallCounter = 0,
			FEEDBACK_MASK_DELAY = 200;

		 this.getFeedbackContainer = function() {
            return (gx.pO && !gx.pO.fullAjax || this == gx.pO) ? document.body : this.getContainer();
        };

        this.startFeedback = function() {
            feedbackCallCounter++;
            if (feedbackTimeoutId)
                return;
            var timeoutObj = gx.lang.doCallTimeout(function() {
                var container = this.getFeedbackContainer();
                if (container) {
                    gx.dom.mask(container);
                }
            }, this, arguments, FEEDBACK_MASK_DELAY);
            feedbackTimeoutId = timeoutObj.t;
        };

        this.endFeedback = function() {
            if (feedbackCallCounter > 0)
                feedbackCallCounter--;
            if (feedbackCallCounter == 0) {
                if (feedbackTimeoutId) {
                    clearTimeout(feedbackTimeoutId);
                    feedbackTimeoutId = false;
                }

                var container = this.getFeedbackContainer();
                if (container) {
                    gx.dom.unmask(container);
                }

            }

        };
	};
	
	gxObject.WEBCOMPONENT_CLASS_NAME = 'gxwebcomponent';
	gxObject.WEBCOMPONENT_BODY_CLASS_NAME = 'gxwebcomponent-body';
	
	return gxObject;
})(gx.$);

gx.uc = (function ($) {
	return {
		getNew: function (ParentObject, ControlId, LastId, ClassName, ContainerName, ControlName, GridLvl, GridId, GridRow) {
			var subclass = eval(ClassName);
			gx.lang.inherits(subclass, gx.uc.UserControl, true);
			var userCtrl = new subclass($);
			userCtrl.ContainerName = ContainerName;
			userCtrl.DesignContainerName = ContainerName;
			userCtrl.setupControl(ParentObject, ControlName, ControlId, LastId, GridLvl, GridId, GridRow);
			return userCtrl;
		},

		fromChild: function (Child) {
			var gxUC = gx.pO.getUsercontrolFromChild(Child);
			if (gxUC != null)
				return gxUC;
			if (gx.pO.hasMasterPage()) {
				gxUC = gx.pO.MasterPage.getUsercontrolFromChild(Child);
				if (gxUC != null)
					return gxUC;
			}
			var len = gx.pO.WebComponents.length;
			for (var i = 0; i < len; i++) {
				gxUC = gx.pO.WebComponents[i].getUsercontrolFromChild(Child);
				if (gxUC != null)
					return gxUC;
			}
			return null;
		},

		getUserControlObj: function (ContainerName) {
			var uc = gx.O.getUserControl(ContainerName);
			if (gx.lang.emptyObject(uc)) {
				if (gx.pO.hasMasterPage()) {
					uc = gx.pO.MasterPage.getUserControl(ContainerName);
					if (!gx.lang.emptyObject(uc))
						return uc;
				}
				var len = gx.pO.WebComponents.length;
				for (var i = 0; i < len; i++) {
					uc = gx.pO.WebComponents[i].getUserControl(ContainerName);
					if (!gx.lang.emptyObject(uc))
						return uc;
				}
			}
			return uc;
		},

		userControlContainerId: function (ControlId) {
			var _Idx = ControlId.lastIndexOf("_");
			if (_Idx != -1) {
				var gridCtrlContainerId = ControlId.substring(0, _Idx) + "Container" + ControlId.substring(_Idx);
				if (gx.dom.byId(gridCtrlContainerId) != null)
					return gridCtrlContainerId;
			}
			return ControlId + "Container";
		},

		setProperties: function (ControlId, Properties) {
			var UC = gx.uc.getUserControlObj(gx.uc.userControlContainerId(ControlId));
			if (UC != null) {
				if (Properties.length != undefined) {
					var len = Properties.length;
					for (var i = 0; i < len; i++) {
						for (var Prop in Properties[i]) {
							var PropValue = Properties[i][Prop];
							UC[Prop] = PropValue;
						}
					}
				}
				else {
					for (var Prop in Properties) {
						var PropValue = Properties[Prop];
						UC[Prop] = PropValue;
					}
				}
			}
		},

		isUserControl: function (ControlId) {
			if (gx.lang.emptyObj(gx.O.UserControls))
				return false;
			if (ControlId instanceof gx.uc.UserControl)
				return true;
			else {
				var ctrlContainer = gx.dom.byId(gx.uc.userControlContainerId(ControlId));
				if (ctrlContainer != null) {
					if (ctrlContainer.tagName == "DIV")
						return true;
				}
			}
			return false;
		},

		UserControl: function () {
			this.ParentObject = null;
			this.GridId = ""
			this.GridRow = "";
			this.ControlId = 0;
			this.ControlLvl = 0;
			this.ContainerName = "";
			this.ControlName = "";
			this.LastIdBefore = 0;
			this.Properties = [];
			this.DynProperties = [];
			this.PropTypes = [];
			this.ValidFunctions = [];
			this.V2CFunctions = [];
			this.C2VFunctions = [];
			this.C2ShowFunction = null;
			this.RealControl = null;
			this.IsPostBack = false;

			this.clearFunctions = function () {
				this.ValidFunctions = [];
				this.V2CFunctions = [];
				this.C2VFunctions = [];
				this.C2ShowFunction = null;
			}

			this.me = function () {
				return "gx.getObj('" + this.ParentObject.CmpContext + "', " + this.ParentObject.IsMasterPage.toString() + ").getUserControl('" + this.ContainerName + "')";
			}

			this.getChildContainer = function (Name) {
				var rowSuffix = (this.GridRow != '') ? ('_' + this.GridRow) : '';
				return gx.dom.byId(this.DesignContainerName + Name + rowSuffix);
			}

			this.getContainerControl = function () {
				return gx.dom.byId(this.ContainerName);
			}

			this.getRealControl = function () {
				if (this.RealControl)
					return this.RealControl;
				else 
					return this.getContainerControl();
			}

			this.setupControl = function (ParentObject, ControlName, ControlId, LastId, GridLvl, GridId, GridRow) {
				this.ParentObject = ParentObject;
				this.ControlName = ControlName;
				this.ControlId = ControlId;
				this.LastIdBefore = LastId;
				this.ControlLvl = (GridLvl != undefined) ? GridLvl : 0;
				this.GridId = (GridId != undefined) ? GridId : 0;
				this.GridRow = (GridRow != undefined) ? GridRow : "";
				this.ParentObject.GXValidFnc[this.ControlId] = { lvl: this.ControlLvl, grid: this.GridId, op: [], ip: [], isuc: true, uc: this, fnc: this.validateControl };
			}

			this.addValidFunction = function (Func, VarName, CtrlName) {
				this.ValidFunctions.push(Func);
				var rowSuffix = (this.GridRow == "") ? "" : "_" + this.GridRow;
				this.ParentObject.addUsercontrolBinding(VarName, CtrlName + rowSuffix, this);
			}

			this.validateControl = function () {
				gx.csv.validatingUC = this;
				var len = this.ValidFunctions.length;
				for (var i = 0; i < len; i++) {
					var bRet = this.ValidFunctions[i].call(gx.O);
					if (!bRet) {
						gx.O.AnyError = 1;
						gx.csv.validatingUC = null;
						return false;
					}
				}
				gx.csv.validatingUC = null;
				return true;
			}

			this.attachEvents = function () {
				try {
					var ctrl = this.getContainerControl();
					if (!gx.lang.emptyObject(document.frames)) {
						var docFrames = document.frames.length;
						if (docFrames > 0) {
							var i = 0;
							for (i = 0; i < docFrames; i++) {
								var frame = document.frames[i];
								if (gx.dom.isChildNode(frame, ctrl) == true) {
									frame.frameElement.onfocus = this.onfocus;
									this.RealControl = frame.frameElement;
									return;
								}
							}
						}
					}
					else {
						ctrl.onfocus = this.onfocus;
						this.RealControl = ctrl;
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'attachEvents');
				}
			}

			this.onfocus = function () {
				gx.evt.onfocus(this.getRealControl(), this.ControlId, this.ParentObject.CmpContext, this.ParentObject.IsMasterPage, this.GridRow, this.GridId);
				gx.csv.lastId = this.ControlId;
				//this.execShowFunction(); No dibuja nuevamente user control.
				if (!gx.csv.anyError)
					this.setFocusBase();
			}

			this.onchange = function () {
				if (this.GridId > 0) {
					gx.fn.getGridObj(this.GridId).setRowModified(gx.fn.currentGridRow(this.GridId));
				}
			};

			this.setFocusBase = function () {
				if (typeof (this.setFocus) == 'function') {
					this.setFocus();
				}
			}

			this.setHtml = function (InnerHtml) {
				if (gx.dom.shouldPurge())
					gx.dom.purge(this.getContainerControl(), true);
				this.getContainerControl().innerHTML = InnerHtml;
			}

			this.createWebComponent = function (CtrlName, PgmName, Parms, TargetCtrlId, CmpPrefix) {
				this.ParentObject.createWebComponent(CtrlName, PgmName, Parms, this.GridRow, TargetCtrlId, CmpPrefix);
			}

			this.deleteWebComponent = function (CtrlName) {
				var cmpCtx = gx.fn.cmpContextFromCtrl(CtrlName);
				this.ParentObject.deleteComponent(cmpCtx);
			}

			this.notifyContext = function (Types, Obj) {
				gx.fx.ctx.notify(null, Types, Obj);
			}

			this.addV2CFunction = function () {
				if (arguments.length == 1 && typeof(arguments[0]) == "function") {
					this.V2CFunctions.push(arguments[0]);
				}
				else {
					var varName = arguments[0],
						ctrlName = arguments[1],
						method = arguments[2];
					this.ParentObject.addUsercontrolBinding(varName, ctrlName, this);
					this.V2CFunctions.push(function(UC, gRow, readControlValue){
						var control = ctrlName;
						if (readControlValue) {
							if (gRow) {
								control = ctrlName + "_" + gRow;
							}
							UC.ParentObject[varName] = gx.fn.getControlValue(control);
						}
						UC[method](UC.ParentObject[varName]);
					});
				}
			}

			this.addC2VFunction = function (Func) {
				this.C2VFunctions.push(Func);
			}

			this.setC2ShowFunction = function (ShowFunc) {
				this.C2ShowFunction = ShowFunc;
			}

			this.execV2CFunctions = function (readControlValue) {
				var tCmp = gx.csv.cmpCtx;
				gx.csv.cmpCtx = this.ParentObject.CmpContext;
				var i = 0;
				var funcs = this.V2CFunctions;
				var len = funcs.length;
				for (i = 0; i < len; i++) {
					try {
						funcs[i](this, this.GridRow, readControlValue);
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxfrmutl.js', 'execV2CFunctions');
					}
				}
				gx.csv.cmpCtx = tCmp;
			}

			this.execC2VFunctions = function () {
				var tCmp = gx.csv.cmpCtx;
				gx.csv.cmpCtx = this.ParentObject.CmpContext;
				var i = 0;
				var funcs = this.C2VFunctions;
				var len = funcs.length;
				for (i = 0; i < len; i++) {
					try { funcs[i](this, this.GridRow); }
					catch (e) {
						gx.dbg.logEx(e, 'gxfrmutl.js', 'execC2VFunctions');
					}
				}
				gx.csv.cmpCtx = tCmp;
			}

			this.execShowFunction = function () {
				try {
					if (this.C2ShowFunction != null && this.getContainerControl()) {
						this.C2ShowFunction(this);
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'execShowFunction');
				} 	
				this.IsPostBack = true;
			}
			
			this.updateAndShow = function (show) {
				try {
					this.execV2CFunctions(show);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'updateAndShow');
				}

				if (show) {
					this.execShowFunction();
				}
			};

			this.getEventRow = function () {
				return this.GridRow;
			}

			this.eventHandler = function (gridId, gridRow, Handler) {
				gx.evt.setReady(false);
				gx.setGxO(this.ParentObject);
				if (gridId > 0) {
					var objVarName = this.DesignContainerName;
					var cRegex = new RegExp('^(?:' + this.ParentObject.CmpContext + ')?(.+)$');
					var isMatch = cRegex.exec(this.DesignContainerName);
					if (isMatch && isMatch[1]) {
						objVarName = isMatch[1];
					}
					this.ParentObject[objVarName] = this;
					var gridObj = this.ParentObject.getGridById(gridId);
					if (gridObj) {
						gridObj.instanciateRow(gridRow);
					}
				}
				this.execC2VFunctions();
				Handler.call(this.ParentObject, this.getEventRow());
				gx.evt.setReady(true);
			}

			this.addEventHandler = function (EventName, Handler) {
				this[EventName] = this.eventHandler.closure(this, [this.GridId, this.GridRow, Handler]);
			}

			this.addProperty = function (PropName, HiddenName) {
				this.Properties[PropName] = HiddenName;
			}

			this.setProp = function (PropName, HiddenName, PropValue, PropType) {
				this.addProperty(PropName, HiddenName);
				this.PropTypes[PropName] = PropType;
				if (gx.lang.isBooleanType(PropType))
					this[PropName] = gx.lang.gxBoolean(PropValue);
				else if (PropType == 'color') {
					if (!gx.lang.emptyObject(PropValue))
						this[PropName] = (typeof (PropValue) == 'number' || typeof (PropValue) == 'string') ? gx.color.html(PropValue) : PropValue;
				}
				else if (gx.lang.isNumericType(PropType)) {
					if (!gx.lang.emptyObject(PropValue)) {
						this[PropName] = gx.num.parseFloat(PropValue);
					}
				}
				else
					this[PropName] = PropValue;
			}

			this.setDynProp = function (PropName, HiddenName, PropValue, PropType) {
				this.DynProperties.push(PropName);
				var doSetDynProp = function () {
					var value = this.getDynPropertyValueFromHidden(PropName, HiddenName);
					if (value === undefined) {
						value = PropValue;
					}
					this.setProp(PropName, HiddenName, value, PropType);
				};

				if (this.ParentObject.CmpContext) {
					var webComRenderHandler = function (gxComponent) {
						if (gxComponent === this.ParentObject) {
							doSetDynProp.call(this);
						}
					};
					gx.fx.obs.addObserver('webcom.render', this, webComRenderHandler);
				}
				else {
					gx.fx.obs.addObserver('gx.onready', this, doSetDynProp, { single: true });
				}
			}

			this.refreshDynProperties = function () {
				for (var i = 0, len = this.DynProperties.length; i < len; i++) {
					var propName = this.DynProperties[i],
						hiddenName = this.Properties[propName];
					this[propName] = this.getDynPropertyValueFromHidden(propName, hiddenName);
				}
			}
			
			this.getDynPropertyValueFromHidden = function(PropName, HiddenName) {
				var value = gx.fn.getHidden(this.getHiddenName(HiddenName));
				if (value === undefined) {
					value = gx.fn.getHidden(this.getHiddenName(PropName));
				}
				return value;
			};

			this.setGridProperties = function () {
				var props = this.ParentObject.getGridUCProperties(this.ControlName);
				var len = props.length;
				for (var i = 0; i < len; i++) {
					var prop = props[i];
					var propValue = prop.v;
					if (typeof (propValue) == 'undefined') {
						var hiddenName = this.getHiddenName(prop.h);
						propValue = gx.fn.getHidden(hiddenName);
						if (prop.t == 'color') {
							propValue = gx.color.html(propValue);
						}
					}
					this.setProp(prop.p, prop.h, propValue, prop.t);
				}
			}

			this.setGridEventHandlers = function () {
				var handlers = this.ParentObject.getGridUCEventHandlers(this.ControlName);
				var len = handlers.length;
				for (var i = 0; i < len; i++) {
					var hdlr = handlers[i];
					this.addEventHandler(hdlr.e, hdlr.h);
				}
			}

			this.getHiddenName = function (HiddenName) {
				var gridRow = '';
				if (this.GridRow != '') {
					gridRow = '_' + this.GridRow;
				}
				return this.ParentObject.CmpContext + this.ControlName.toUpperCase() + (this.ParentObject.IsMasterPage ? '_MPAGE' : '') + "_" + HiddenName + gridRow;
			}

			this.saveProperties = function () {
				for (var prop in this.Properties) {
					var propValue = this[prop];
					if (typeof (this.Properties[prop]) != 'function') {
						if (typeof (propValue) != 'undefined' && typeof (propValue.R) != 'undefined' && typeof (propValue.G) != 'undefined' && typeof (propValue.B) != 'undefined') {
							propValue = gx.color.rgb(propValue.R, propValue.G, propValue.B);
						}
						if (gx.lang.isBooleanType(this.PropTypes[prop])) {
							propValue = (propValue ? 1 : 0);
						}
						gx.fn.setHidden(this.getHiddenName(this.Properties[prop]), propValue);
					}
				}
			}
		}
	};
})(gx.$);

gx.printing = {
	loaded: false,
	tries: 0,
	waitInterval: 100,
    IFrameId: 'gxprintHelper_Iframe',

	print: function (printInfo) {
        if (printInfo && gx.lang.emptyObject(printInfo.printerRule))
            this.printDirect(printInfo);
        else {
		if (!this.loaded) {
			var fileUrl = gx.util.resourceUrl("printingappletsigned.jar", true);
			var html = '<applet name="GeneXusPrintAppletForWindows" archive="' + fileUrl + '" code="com/genexus/printing/Printer.class" width="0" height="0">';
			html += '<param name="path" value="' + gx.util.resourceUrl(gx.basePath, true) + '">'
			html += '<p>No java plugin detected. Click <a href="http://java.com/en/download/" target="new">here</a> to download it.</p>';
			html += '</applet>';
			document.body.appendChild(gx.html.nodesFromText(html)[0]);
			this.loaded = true;
		}
		if (this.tries == 0) {
			this.printWhenReady(printInfo);
            } else {
			gx.dbg.logMsg('Already trying to print a document.');
		}
        }
	},

    printDirect: function(printInfo) {
        var IFrameControl = gx.dom.byId(gx.printing.IFrameId);
        if (!IFrameControl) {
            IFrameControl = document.createElement('IFRAME');
            IFrameControl.id = gx.printing.IFrameId;
            IFrameControl.style.visibility = 'hidden';
            document.body.appendChild(IFrameControl);
        }
        IFrameControl.src = printInfo.reportFile;
        IFrameControl.onload = function() {
            this.contentWindow.print();
            this.onload = null;
            this.src = '';
        }
    },

	printWhenReady: function (printInfo) {
		if (this.tries >= (this.waitInterval * 60)) {
			this.tries = 0;
			gx.dbg.logMsg('The printing applet was not loaded.');
			return;
		}
		this.tries++;
		if (this.isReady()) {
			document.GeneXusPrintAppletForWindows.printReport(printInfo.reportFile, printInfo.printerRule, 'GXPRN.INI');
			this.tries = 0;
		}
		else {
			setTimeout(function () { gx.printing.printWhenReady(printInfo); }, this.waitInterval);
		}
	},

	isReady: function () {
		var printingApplet = document.GeneXusPrintAppletForWindows;
		if (printingApplet) {
			if (typeof (printingApplet.isReady) == 'function' || typeof (printingApplet.isReady) == 'unknown') {
				return printingApplet.isReady();
			}
		}
		return false;
	}
};

gx.fn = (function($) {
	var CMP_CTRL_REGEX = /((?:(?:MP)?W[0-9a-zA-Z\-]{4}[\S]*)*)gxHTMLWrp((?:MP)?W[0-9]{4}[\S]*)*/;

	var cleanComponentName = function (name) {
		name = name.replace(/\\/g, ".");
		if (gx.gen.isDotNet()) {
			return name.replace(/\.aspx$/, "");
		}
		return name;
	};

	return {
		attachedControls: function () {
			return gx.attachedControls;
		},

		closeWindow: function (Parms) {
			if (typeof (Parms) == 'string') {
				if (this.closeFromServer(Parms)) {
					return;
				}
				Parms = [];
			}
			if (!Parms) {
				Parms = [];
			}
			if (gx.popup.ispopup()) {
				var popupObj = gx.popup.getPopup();
				var popupurl = popupObj.url ? gx.util.noParmsUrl(popupObj.url) : "";
				if (!popupObj.frameWindow || (popupObj.frameWindow.location.href.search(popupurl + "(\\?.*)?$") != -1) || gx.grid.drawAtServer) {
					popupObj.close(Parms);
					return;
				}
			}
			if (location.href.indexOf('gxCalledAsPopup') != -1) {
				this.closeWindowImpl();
				return;
			}
			var sCaller = gx.ajax.getCallerUrl(gx.popup.popuplvl());

			if (!gx.lang.emptyObject(sCaller)) {
				gx.ajax.windowClosed(-1);
				var url = gx.ajax.absoluteurl(sCaller);
				if (gx.spa.started) {
					gx.spa.redirect(url);
					gx.ajax.enableForm();
				}
				else
					location.href = url;
			}
			else {
				this.closeWindowImpl();
			}
		},

		closeWindowImpl: function () {
			if (gx.util.browser.isIE()) {
				window.close();
			}
			else {
				if (history.length > 0)
					history.back();
				else
					window.location.assign("about:blank");
			}
		},

		closeFromServer: function (Parms) {
			try {
				if (window.parent && window.parent.gx) {
					if (gx.popup.ispopup() && !(gx.grid.drawAtServer || window.parent.gx.grid.drawAtServer))
						gx.fn.closeWindow(gx.json.evalJSON(Parms));
					else
						window.parent.gx.fn.closeWindow(gx.json.evalJSON(Parms));
					return true;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'closeFromServer');
			}
			return false;
		},

		closeWindowServerScript: function (cliNavSupported, Parms) {	
			gx.evt.execLoad=false;
			if (cliNavSupported) {
				gx.evt.clinav = true;
				gx.ajax.pushReferer(gx.popup.popuplvl());		
			}
			this.closeWindow(Parms);
		},
		
		invalidEmptyValue: function (Values) {
			if (gx.lang.emptyObject(Values.s)) {
				var len = Values.v.length;
				for (var i = 0; i < len; i++) {
					if (Values.v[i][0] === Values.s) {
						return false;
					}
				}
				return true;
			}
			return false;
		},

		trimSelectValue: function (Value, Type) {
			if (Type == 'int')
				return gx.text.trim(Value);
			else
				return gx.text.rtrim(Value);
		},

		selectedDescription: function (Values, Type) {
			var len = Values.v.length;
			for (var i = 0; i < len; i++) {
				if (this.trimSelectValue(Values.v[i][0], Type) === Values.s) {
					return Values.v[i][1];
				}
			}
			return null;
		},

		setGridCheckBoxValue: function (ControlId, sRow, Value, Checked) {
			this.setCheckBoxValue(ControlId + "_" + sRow, Value, Checked)
		},

		setGridDecimalValue: function (ControlId, sRow, Value, Dec, DecPoint) {
			return this.setGridControlValue(ControlId, sRow, Value);
		},

		setGridControlValue: function (ControlId, sRow, PValue, GXCtrlFormat) {
			if (sRow !== undefined)
				return this.setControlValue(ControlId + "_" + sRow, PValue, GXCtrlFormat);
		},

		setVarValues: function (VarIds, VarValues) {
			var len = VarIds.length;
			for (var i = 0; i < len; i++) {
				var validStruct = gx.fn.vStructForVar(VarIds[i]);
				if (validStruct && validStruct.v2v) {
					validStruct.v2v(VarValues[i]);
				}
				else {
					eval(VarIds[i] + '="' + VarValues[i] + '"');
				}
			}
		},

		setControlOldValue: function (Ctrl, Value) {
			if (Ctrl) {
				if (Ctrl.type == 'radio') {
					var radios = gx.dom.byName(gx.dom.id(Ctrl));
					var rLen = radios.length;
					for (var i = 0; i < rLen; i++) {
						radios[i].setAttribute(gx.csv.GX_OLD_VALUE_ATTRIBUTE, Value);
					}
				}
				else {
					Ctrl.setAttribute(gx.csv.GX_OLD_VALUE_ATTRIBUTE, Value);
				}			
			}
		},

		setControlValue: function (ControlId, Value, GXCtrlFormat) {
			ControlId = gx.csv.ctxControlId(ControlId);
			this.setControlValueAny(ControlId, Value, GXCtrlFormat);
		},

		setControlValueAny: function (ControlId, Value, GXCtrlFormat) {
			var validStruct = gx.O.getValidStructFld(ControlId);
			var Control = gx.dom.el(ControlId);
			if (validStruct && (validStruct.type == 'dtime' || validStruct.type == 'date')) {
				if (Value === '')
					Value = gx.date.nulldate_toc(validStruct.len, validStruct.dec);
				else {
					if (typeof (Value) == 'string')
						Value = new gx.date.gxdate(Value);
				}
			}
			if (Value instanceof gx.date.gxdate) {
				if (!gx.lang.emptyObject(validStruct))
					Value = gx.date.formatDateTime(validStruct.dec, validStruct.len, gx.dateFormat, Value);
			} else if (gx.lang.instanceOf(Value, Number) || (typeof (gx.num.dec) != "undefined" && Value instanceof gx.num.dec.bigDecimal)) {
				if (!gx.lang.emptyObject(validStruct) && validStruct.pic != undefined) {
					Value = gx.num.formatNumber(Value, validStruct.dec, validStruct.pic, validStruct.len, validStruct.sign, false);
				}
			} else if (typeof (Value) == 'string' && Control != null && Control.nodeName == "SPAN") {
				if (!gx.lang.emptyObject(validStruct) && validStruct.isPwd != undefined) {
					Value = gx.text.formatString(Value, validStruct.len, validStruct.isPwd);
				}
			}
			this.persistGridControlValue(ControlId, Value);
			var CtrlFormat = GXCtrlFormat || 0;
			if ((Control != null) && (Control.nodeName != "SPAN"))
				this.setControlValue_impl(Control, Value, GXCtrlFormat);
			else
				gx.fn.setHidden(ControlId, Value);
			var spanCtrl = ControlId;
			if ((Control != null) && (Control.nodeName == "SPAN")) {
				spanCtrl = Control;
			}
			var isMultiline = false;
			if (validStruct)
				isMultiline = validStruct.multiline;
			else
				isMultiline = ((Control != null) && (Control.tagName == 'TEXTAREA'));
			this.setControlValue_span_safe(spanCtrl, Value, GXCtrlFormat, isMultiline);
		},

		setDecimalValue: function (ControlId, Value, Dec, DecPoint) {
			this.setControlValue(ControlId, Value);
		},

		toDecimalValue: function (Value, ThSep, DecPoint) {
			return gx.num.parseFloat(Value, ThSep, DecPoint);
		},

		toDatetimeValue: function (Value, sFmt) {
			return new gx.date.gxdate(Value, sFmt);
		},

		setCheckBoxValue: function (ControlId, Value, Checked) {
			try {
				ControlId = gx.csv.ctxControlId(ControlId);
				var Control = gx.dom.byId(ControlId);
				if (!Control)
					Control = gx.dom.form()[ControlId];
				if (Control) {
					Control.checked = (Value.toString() == Checked.toString());
					Control.value = Value;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setCheckBoxValue');
			}
		},

		persistGridControlValue: function (ControlId, Value, vStruct) {
			var _Idx = ControlId.lastIndexOf("_");
			if (_Idx != -1) {
				var validStruct;
				if (vStruct)
					validStruct = vStruct;
				else
					validStruct = gx.O.getValidStructFld(ControlId.substring(0, _Idx));

				if (validStruct && validStruct.gxgrid) {
					var rowGxId = ControlId.substring(_Idx + 1);
					if (rowGxId.length > 4) {
						var pRow = rowGxId.substring(4, rowGxId.length);
						var grid = gx.O.getGrid(validStruct.gxgrid.gridName + '_' + pRow);
						if (grid)
							grid.persistControlValue(ControlId, Value, validStruct);
					}
					else {
						validStruct.gxgrid.persistControlValue(ControlId, Value, validStruct);
					}
				}
			}
		},

		setControlValue_span_safe: function (Control, Value, GXCtrlFormat, Multiline) {
			if (typeof (Control) == 'string')
				Control = gx.dom.el('span_' + Control);
			if (Control != null) {
				if (Control.nodeName != "SPAN") {
					var controlId = "span_";
					if (typeof (Control) == 'string')
						controlId += Control;
					else
						controlId += gx.dom.id(Control);
					Control = gx.dom.byId(controlId);
				}
				this.setControlValue_fmt(Control, Value, GXCtrlFormat, Multiline);
			}
		},

		setControlValue_fmt: function (Control, Value, GXCtrlFormat, Multiline) {
			try {
				if (Control != null) {
					if (GXCtrlFormat == 1) {
						var gxlink = Control.getAttribute('gxlink');
						if (!gx.lang.emptyObject(gxlink)) {
							//HTML textblock con evento asociado
							if (Control.firstChild != null && Control.firstChild.nodeName == 'A')
								Control = Control.firstChild;
						}
						gx.html.setInnerHtml(Control, Value, true);
					}
					else {
						if (GXCtrlFormat == 0 && typeof (Value) == 'string')
							Value = Value.replace(/ +/g, ' ');
						var ParentControl = Control;
						while (Control.firstChild != null && Control.firstChild.nodeName != '#text')
							Control = Control.firstChild;
						if (GXCtrlFormat == 0 && (Control.firstChild == null || Control.firstChild.nodeName != '#text') && Control.nodeName != 'A')
							gx.html.setInnerText(ParentControl, Value, GXCtrlFormat, Multiline);
						else
							gx.html.setInnerText(Control, Value, GXCtrlFormat, Multiline);
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setControlValue_fmt');
			}

		},

		setControlValue_impl: function (Control, Value, GXCtrlFormat) {
			if (typeof (Control) == 'string')
				Control = gx.dom.el(Control);
			if (Value instanceof gx.date.gxdate) {
				Value = Value.getString();
			}
			if (Control != null) {
				if (Control.type === 'radio') {
					this.setRadioValue(Control.name, Value);
					return;
				}
				if (gx.dom.isEditControl(Control) || Control.type == "textarea")
					Control.value = gx.lang.decodeValue(Value);
				else {
					if (Control.value != undefined)
						Control.value = Value;
					else {
						this.setControlValue_span_safe(Control, Value, GXCtrlFormat);
					}
				}
			}
		},

		setGridComboBoxValue: function (ControlId, sRow, Value) {
			this.setComboBoxValue(ControlId + "_" + sRow, Value);
		},

		setComboBoxValue: function (ControlId, Value) {
			var isIE = gx.util.browser.isIE();
			ControlId = gx.csv.ctxControlId(ControlId);
			var Ctrl = gx.dom.byId(ControlId);
			if (!Ctrl)
				return;
			var sType = '';
			var vStruct = gx.O.getValidStructFld(ControlId);
			if (!gx.lang.emptyObject(vStruct))
				sType = vStruct.type;
			if (sType == 'int')
				Value = gx.text.trim(Value);
			else if (sType == 'date' && Value instanceof gx.date.gxdate)
				Value = Value.getStringWithFmt("Y4MD");
			else if (sType != 'decimal')
				Value = gx.text.rtrim(Value);
			var descText = Value;
			var selected = false;
			try {
				var len = Ctrl.options.length;
				var selectedopt;
				for (var i = 0; i < len; i++) {
					var opt = Ctrl.options[i];					
					var isSelected = gx.lang.isNumericType(sType) ? (Number(opt.value) == Number(Value)) : (gx.text.trim(opt.value) == gx.text.trim(Value));
					if (isSelected) {
						if (typeof (opt.innerText) != 'undefined')
							descText = opt.innerText;
						else
							descText = opt.text;
						Ctrl.selectedIndex = i;
						selected = true;
						opt.setAttribute('selected', 'selected');
						selectedopt = opt;
						if (isIE) {
							break;
						}
					}
					else if (!isIE) {
						opt.removeAttribute('selected');
					}
				}
				if (selectedopt && selectedopt.value != Ctrl.value && gx.util.browser.isFirefox()) {
					gx.dom.redrawControl(Ctrl);
				}
				if (!selected)
					Ctrl.selectedIndex = 0;
				if (vStruct.grid > 0)
					this.persistGridControlValue(ControlId, Value, vStruct);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setComboBoxValue');
			}
			this.setControlValue_span_safe(ControlId, descText, 0);
		},

		loadComboBox: function (ctrlId, values) {
			this.setComboValues(ctrlId, values);
		},

		setGridComboValues: function (ControlId, adata) {
			var ctrlGrid = this.controlGridId(ControlId);
			if (ctrlGrid == 0)
				this.setComboValues(ControlId, adata);
			else {
				for (var i = 1; i < 999; i++) {
					var currentRowStr = gx.text.padr(i.toString(), 4, '0');
					var Control = gx.dom.el(ControlId + "_" + currentRowStr);
					if (Control == null)
						break;
					this.setComboValues(Control.name, adata);
				}
			}
		},

		setComboValues: function (ControlId, adata) {
			var Ctrl = gx.dom.el(ControlId),
				browser = gx.util.browser;
			if (Ctrl == null)
				return;
			var currValue = '';
			if (Ctrl.selectedIndex != -1)
				currValue = Ctrl.options[Ctrl.selectedIndex].value;
			while (Ctrl.options.length > adata.length)
				Ctrl.remove(Ctrl.options.length - 1);
			while (adata.length > Ctrl.options.length) {
				var E = document.createElement("OPTION");
				Ctrl.options.add(E);
			}
			var len = adata.length;
			for (var i = 0; i < len; i++) {
				var E = Ctrl.options[i];
				E.value = adata[i][0];
				if (browser.isIE() && browser.ieVersion() >= 9) {
					if (E.innerText != adata[i][1])
						E.innerText = adata[i][1];
				}
				else {
					if (E.text != adata[i][1])
						E.text = adata[i][1];
				}
				if ( Number(E.value) ? (Number(E.value) == Number(currValue)) : gx.text.trim(E.value) == gx.text.trim(currValue))
					Ctrl.selectedIndex = i;
			}
			if (Ctrl.options.length == 0)
				Ctrl.selectedIndex = -1;
			else {
				if (Ctrl.selectedIndex == -1 || Ctrl.selectedIndex > Ctrl.options.length - 1) {
					Ctrl.options[0].selected = true;
				}
			}
		},

		getControlRefById: function (id) {
			var VStr = this.validStruct(id);
			if (VStr) {
				if (VStr.grid == 0)
					return this.getControlRef(VStr.fld, false);
				else
					return this.getControlGridRef(VStr.fld, VStr.grid);
			}
			return null;
		},

		getControlRef: function (ControlId, avoidPref) {
			//Critical function, changes here impact performance
			if (!avoidPref)
				ControlId = gx.csv.ctxControlId(ControlId);
			if (ControlId == 'FORM')
				return document;
			var Control = gx.dom.el(ControlId);
			if (Control != null)
				return Control;
			return null;
		},

		getControlRef_list: function (ControlId) {
			var ControlList = gx.dom.byName(ControlId);
			if (ControlList != null)
				return ControlList;
			var Control = gx.dom.byId(ControlId);
			if (Control != null)
				return [Control];
			return null;
		},

		screen_CtrlRef: function (ControlId) {
			var Control = this.getControlGridRef(ControlId, this.controlGridId(ControlId));
			if (!gx.lang.emptyObject(Control)) {
				if (Control.type == 'hidden')
					Control = gx.dom.el("span_" + gx.dom.id(Control));
				return Control;
			}
			return null;
		},

		screen_CtrlId: function (ControlId) {
			return this.getControlGridId(ControlId, this.controlGridId(ControlId));
		},

		getControlGridId: function (ControlId, GridId, CurrentRow) {
			ControlId = gx.csv.ctxControlId(ControlId);
			var el = gx.dom.el(ControlId);
			if (el)
				return ControlId;
			try {
				if (GridId == 0)
					return ControlId;
				if (CurrentRow == undefined)
					CurrentRow = this.currentGridRow(GridId);
				return ControlId + "_" + CurrentRow;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getControlGridId');
			}
		},

		getControlGridRef: function (ControlId, GridId, CurrentRow) {
			ControlId = gx.csv.ctxControlId(ControlId);
			var el = gx.dom.el(ControlId);
			if (el)
				return el;
			try {
				if (GridId == 0)
					return gx.dom.el(ControlId);
				if (CurrentRow == undefined)
					CurrentRow = this.currentGridRow(GridId);
				el = gx.dom.el(ControlId + "_" + CurrentRow);
				if (el)
					return el;
				else {
					var cmpData = gx.O.getComponentData(ControlId);
					if (cmpData) {
						return gx.dom.el('gxHTMLWrp' + cmpData.Prefix + CurrentRow);
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getControlGridRef');
			}
		},

		setCurrentGridRow: function (GridId, Row) {
			if (Row != '0000') {
				try {
					return gx.currentRows[GridId] = Row;
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'setCurrentGridRow');
				}
			}
			return undefined;
		},

		currentGridRowImpl: function (GridId) {
			try {
				return gx.currentRows[GridId];
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'currentGridRowImpl');
			}
			return undefined;
		},

		currentGridRow: function (GridId) {
			var Ret = this.currentGridRowImpl(GridId);
			return (Ret == undefined) ? '0001' : Ret;
		},

		gridDuplicateKey: function (CtrlId) {
			var _GXValidStruct = gx.fn.validStruct(CtrlId);
			if (_GXValidStruct != undefined) {
				var gxgrid = _GXValidStruct.gxgrid;
				if (gxgrid != null) {
					gxgrid = gxgrid.updateControlValue(_GXValidStruct, true);
					if (gxgrid)
						return gxgrid.gxHasDuplicateKey();
				}
			}
			return false;
		},

		firstGridControl: function (GridId, gxO) {
			var ctrlIds = gx.fn.controlIds();
			var len = ctrlIds.length;
			for (i = 0; i < len; i++) {
				var _GXValidStruct = gx.fn.validStruct(ctrlIds[i], gxO);
				if (_GXValidStruct != undefined && _GXValidStruct.grid == GridId)
					return ctrlIds[i];
			}
			return -1;
		},

		lastGridControl: function (GridId, gxO) {
			var ctrlIds = gx.fn.controlIds();
			for (i = ctrlIds.length - 1; i >= 0; i--) {
				var _GXValidStruct = gx.fn.validStruct(ctrlIds[i], gxO);
				if (_GXValidStruct != undefined && _GXValidStruct.grid == GridId)
					return ctrlIds[i];
			}
			return -1;
		},

		getGridDateTimeValue: function (ControlId, sRow, ThSep, DecPoint) {
			var ctrlVal = this.getControlValue(ControlId + "_" + sRow);
			return new gx.date.gxdate(ctrlVal, gx.dateFormat);
		},

		getGridDecimalValue: function (ControlId, sRow, ThSep, DecPoint) {
			return this.getDecimalValue(ControlId + "_" + sRow, ThSep, DecPoint);
		},

		getGridIntegerValue: function (ControlId, sRow, ThSep) {
			return this.getIntegerValue(ControlId + "_" + sRow, ThSep);
		},

		getGridControlValue: function (ControlId, sRow) {
			return this.getControlValue(ControlId + "_" + sRow);
		},

		getGridCheckBoxValue: function (ControlId, sRow, Checked, Unchecked) {
			return this.getCheckBoxValue(ControlId + "_" + sRow, Checked, Unchecked)
		},

		getCheckBoxValue: function (ControlId, Checked, Unchecked) {
			ControlId = gx.csv.ctxControlId(ControlId);
			var Control = gx.dom.byId(ControlId);
			if (!Control)
				Control = gx.dom.form()[ControlId];
			if (!Control) {
				ControlList = gx.dom.byName(ControlId);
				if (ControlList != null)
					Control = ControlList[0];
			}
			if (!Control)
				return 0;
			if (Control.checked)
				return Checked;
			return Unchecked;
		},

		getControlValue: function (ControlId, mode) {
			return this.getControlValue_impl(gx.csv.ctxControlId(ControlId), mode);
		},

		getControlValue_impl: function (ControlId, mode) {
			try {
				var vStruct = gx.O && gx.O.getValidStructFld(ControlId),
					value;
				if ((vStruct && vStruct.gxgrid && !vStruct.gxgrid.isUsercontrol) || !vStruct || !vStruct.gxgrid)
				{
					var Control = gx.dom.el(ControlId);
					if (Control != null && gx.O) {
						if (vStruct && !Control.gxtype) {
							Control.gxtype = { type: vStruct.type, len: vStruct.len, dec: vStruct.dec };
						}

						if ((Control.type == "hidden") || (Control.type == "text") || (Control.type == "textarea") || (Control.type == "checkbox"))
							value = Control.value;
						else {
							if (Control.type == 'radio')
								value = gx.fn.getRadioValue(gx.dom.byName(ControlId));
							else {

								if (Control.nodeName == 'SELECT' && Control.options.length > 0) {
									if (Control.selectedIndex != -1)
										value = (mode == 'screen') ? Control.options[Control.selectedIndex].text : Control.options[Control.selectedIndex].value;
									else
										value = (mode == 'screen') ? Control.options[0].text : Control.options[0].value;
								}
								else {
									if (vStruct && (vStruct.type != 'date') && (vStruct.type != 'dtime') && (vStruct.type != 'bits') && (vStruct.type != 'audio') && (vStruct.type != 'video'))
										value = Control.value;
								}
								if (Control.nodeName == 'IMG' || (Control.nodeName == 'INPUT' && Control.type == 'image'))
									value = Control.getAttribute('src');
							}
						}
						if (value !== undefined)
							return (vStruct && vStruct.type == 'boolean') ? gx.lang.gxBoolean(value) : value
					}

					Control = gx.dom.el("span_" + ControlId);
					if (Control != null) {
						var hidVal = gx.fn.getHidden(ControlId);
						if (hidVal != undefined)
							return hidVal;
						else
							return gx.fn.getControlValue_span(Control);
					}

					Control = gx.dom.form()[ControlId];
					if (Control != null)
						return this.getControlValueInt(Control);

					Control = gx.dom.byId("_" + ControlId);
					if (Control != null)
						return Control.value;

					ControlList = gx.dom.byName(ControlId);
					if (ControlList && ControlList.length == 0)
						ControlList = gx.dom.byName("_" + ControlId);

					if (ControlList != null) {
						var len = ControlList.length;
						for (var i = 0; i < len; i++) {
							Control = ControlList[i];
							if (Control != null)
								return this.getControlValueInt(Control);
						}
						Control = ControlList[0];
						if (Control)
							return Control.value;
					}
				}
				if (Control == null)
					return (mode === 'nohidden') ? null : gx.fn.getHidden(ControlId);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getControlValue_impl');
			}
			return "";
		},

		setRadioValue: function (ControlId, Value) {
			ControlId = gx.csv.ctxControlId(ControlId);
			var Control = gx.dom.byName(ControlId);
			if (Control == null)
				return;
			var len = Control.length;
			for (var i = 0; i < len; i++) {
				if (gx.text.ltrim(Control[i].value) == gx.text.ltrim(Value)) {
					Control[i].checked = true;
					return;
				}
			}
		},

		getRadioValue: function (Control) {
			var len = Control.length;
			for (var i = 0; i < len; i++) {
				if (Control[i].checked)
					return Control[i].value;
			}
			return '';
		},

		getControlValueInt: function (Control) {
			if (Control.length != undefined && Control.tagName != "SELECT" && typeof (Control[0]) != 'undefined' && Control[0].type == 'radio')
				return this.getRadioValue(Control);
			if (Control.type == "checkbox")
				return Control.checked;
			if (Control.tagName == "SPAN") {
				var hidVal = gx.fn.getHidden(gx.dom.id(Control));
				if (hidVal != undefined)
					return hidVal;
				else
					return gx.fn.getControlValue_span(Control);
			}
			if (Control.tagName == "INPUT" && Control.type == "text") {
				var CtrlId = gx.dom.id(Control);
				if (gx.O) {
					var vStruct = gx.O.getValidStructFld(CtrlId);
					if (vStruct && typeof (vStruct.pic) != 'undefined') {
						if (vStruct.type == 'int')
							return this.getIntegerValue(CtrlId, vStruct.pic.indexOf(',') != -1 ? gx.thousandSeparator : '');
						if (vStruct.type == 'decimal')
							return this.getDecimalValue(CtrlId, vStruct.pic.indexOf(',') != -1 ? gx.thousandSeparator : '', gx.decimalPoint);
					}
				}
			}
			return Control.value;
		},

		getControlValue_span: function (Control) {
			while (Control && !Control.nodeValue) {
				Control = Control.childNodes[0];
			}
			if (Control && Control.nodeValue)
				return Control.nodeValue;
			return '';
		},
		
		getDateTimeArrayValue: function (ControlId) {
			try {
				var dt;
				var initDate = function(value, dtFormat) {
					if (!gx.lang.emptyObject(value)) {						
						$.each(value, function( i, dateStr) {
							value[i] = new gx.date.gxdate(dateStr, dtFormat);
						});						
					}
					return "";
				}
				
				var ctrlVal = this.getControlValue(ControlId, 'nohidden');
				dt = initDate(ctrlVal, gx.dateFormat);
				if (!dt) {
					ctrlVal = gx.fn.getHidden(gx.csv.ctxControlId(ControlId));
					dt = initDate(ctrlVal, "Y4MD");
				}
				return dt;
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getDateTimeArrayValue');
			}
			return "";
		},
		
		getDateValue: function (ControlId) {
			return this.getDateTimeValue(ControlId);
		},

		getDateTimeValue: function (ControlId) {
			try {
				var ctrlVal = this.getControlValue(ControlId, 'nohidden');
				if (!gx.lang.emptyObject(ctrlVal))
					return new gx.date.gxdate(ctrlVal, gx.dateFormat);
				ctrlVal = gx.fn.getHidden(gx.csv.ctxControlId(ControlId));
				return new gx.date.gxdate(ctrlVal, "Y4MD");
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getDateValue');
			}
			return "";
		},

		getIntegerValue: function (ControlId, ThSep) {
			var nIntVal = 0;
			var validStruct = gx.O ? gx.O.getValidStructFld(ControlId) : null;
			var controlValue = this.getControlValue(ControlId);
			if (validStruct && controlValue)
				controlValue = gx.num.extractValue(validStruct.pic, controlValue);
			if ( gx.lang.isArray(controlValue))
				return controlValue;
			if (typeof (controlValue) != 'undefined') {
				controlValue = controlValue.toString();
			}
			else {
				controlValue = '';
			}
			if (controlValue.length < gx.num.maxNumericPrecision() || typeof (gx.num.dec) == "undefined") {
				nIntVal = gx.num.parseInt(controlValue, 10, ThSep);
			}
			else {
				nIntVal = new gx.num.dec.bigDecimal(gx.text.replaceAll(controlValue, ThSep, '')).setScale(0, gx.num.dec.ROUND_UP).toString();
			}
			return isNaN(nIntVal) ? 0 : nIntVal;
		},

		getDecimalValue: function (ControlId, ThSep, DecPoint) {
			var validStruct = gx.O ? gx.O.getValidStructFld(ControlId) : null;
			var ctrlValue = this.getControlValue(ControlId);
			if (validStruct && ctrlValue)
				ctrlValue = gx.num.extractValue(validStruct.pic, ctrlValue);
			if ( gx.lang.isArray(ctrlValue))
				return ctrlValue;
			var nDecVal = gx.num.parseFloat(ctrlValue || "", ThSep, DecPoint);
			return isNaN(nDecVal) ? 0 : nDecVal;
		},

		getBlobValue: function (ControlId) {
			var blobCtrl = gx.dom.el("Object_" + ControlId);
			if (blobCtrl != null) {
			    if (blobCtrl.data && !gx.text.endsWith(blobCtrl.data, 'about:blank'))
					return blobCtrl.data;
			}
			else {
				blobCtrl = gx.dom.el("Link_" + ControlId);
				if (blobCtrl != null)
					return blobCtrl.href;
			}
			return "";
		},

		getVarControlMap: function (ctrlName) {
			for (var varName in gx.O.VarControlMap) {
				if (typeof (varName) != 'function') {
					var mapping = gx.O.VarControlMap[varName];
					if (mapping.id == ctrlName || (gx.O.CmpContext + mapping.id) == ctrlName)
						return varName;
				}
			}
			return null;
		},

		getVarControlMapForVar: function (varName) {
			for (var objVar in gx.O.VarControlMap) {
				if (typeof (objVar) == 'string' && objVar == varName) {
					return gx.O.VarControlMap[objVar];
				}
			}
			return null;
		},

		v2cMap: function (VarName) {
			var mapping = this.getVarControlMapForVar(VarName);
			if (mapping != null) {
				var mapSuffix = '';
				if (typeof (mapping.grid) == 'number' && mapping.grid != 0) {
					mapSuffix = '_' + gx.fn.currentGridRowImpl(mapping.grid);
				}
				gx.fn.setHidden(gx.O.CmpContext + mapping.id + mapSuffix, gx.O[VarName]);
			}
		},

		c2vMap: function (VarName) {
			var mapping = this.getVarControlMapForVar(VarName);
			if (mapping != null) {
				var mapSuffix = '';
				if (typeof (mapping.grid) == 'number' && mapping.grid != 0) {
					mapSuffix = '_' + gx.fn.currentGridRowImpl(mapping.grid);
				}
				gx.O[VarName] = gx.fn.getHidden(gx.O.CmpContext + mapping.id + mapSuffix);
			}
		},

		depsToVars: function (Deps) {
			for (var i = 0; i < Deps.length; i++) {
				var varName = Deps[i];
				var validStruct = gx.fn.vStructForVar(varName);
				if (!gx.lang.emptyObject(validStruct) && typeof (validStruct.c2v) == 'function')
					validStruct.c2v();
				else
					this.c2vMap(varName);
			}
		},

		verticalFormula: function (VarName, Default, GridId, CondsFunc, RowFunc, Deps) {
			var validStruct = gx.fn.vStructForVar(VarName);
			if (!gx.lang.emptyObject(validStruct))
				validStruct.v2c();
			else
				this.v2cMap(VarName);
			var oldRow = gx.fn.currentGridRowImpl(GridId);
			var gridObj = gx.fn.getGridObj(GridId);
			var retVal = 0;
			var anyWithCond = false;
			var len = gridObj.grid.rows.length;
			for (var i = 0; i < len; i++) {
				var rowObj = gridObj.grid.rows[i];
				var IsRemoved = rowObj.gxDeleted();
				var RecordExists = rowObj.gxExists();
				var RecordIsMod = rowObj.gxIsMod();
				if (!IsRemoved && (RecordExists || RecordIsMod)) {
					gx.fn.setCurrentGridRow(GridId, rowObj.gxId);
					if (Deps && Deps.length > 0)
						this.depsToVars(Deps);
					else if (!gx.lang.emptyObject(validStruct) && typeof (validStruct.c2v) == 'function')
						validStruct.c2v();
					else
						this.c2vMap(VarName);
					if (CondsFunc.call(gx.O)) {
						anyWithCond = true;
						retVal = RowFunc(i, retVal);
					}
				}
			}
			gx.fn.setCurrentGridRow(GridId, oldRow);
			if (Deps && Deps.length > 0)
				this.depsToVars(Deps);
			else if (!gx.lang.emptyObject(validStruct) && typeof (validStruct.c2v) == 'function')
				validStruct.c2v();
			else
				this.c2vMap(VarName);
			if (!anyWithCond)
				retVal = Default;
			return retVal;
		},

		sumFrm: function (VarName, Default, ThSep, DecPoint, GridId, CondsFunc, Deps) {
			return gx.fn.verticalFormula(VarName, Default, GridId, CondsFunc, function (row, val) { var v = gx.num.parseFloat(gx.O[VarName], ThSep, DecPoint); if (row == 0) return v; else return val + v; }, Deps);
		},

		maxFrm: function (VarName, Default, ThSep, DecPoint, GridId, CondsFunc, Deps) {
			return gx.fn.verticalFormula(VarName, Default, GridId, CondsFunc, function (row, val) { var v = gx.num.parseFloat(gx.O[VarName], ThSep, DecPoint); if (row == 0) return v; else return (v > val) ? v : val; }, Deps);
		},

		minFrm: function (VarName, Default, ThSep, DecPoint, GridId, CondsFunc, Deps) {
			return gx.fn.verticalFormula(VarName, Default, GridId, CondsFunc, function (row, val) { var v = gx.num.parseFloat(gx.O[VarName], ThSep, DecPoint); if (row == 0) return v; else return (v < val) ? v : val; }, Deps);
		},

		averageFrm: function (VarName, Default, ThSep, DecPoint, GridId, CondsFunc, Deps) {
			return gx.fn.verticalFormula(VarName, Default, GridId, CondsFunc, function (row, val) { var v = gx.num.parseFloat(gx.O[VarName], ThSep, DecPoint); if (row == 0) return v; else return ((val * row) + v) / (row + 1); }, Deps);
		},

		countFrm: function (VarName, Default, GridId, CondsFunc, Deps) {
			return gx.fn.verticalFormula(VarName, Default, GridId, CondsFunc, function (row, val) { if (row == 0) return 1; else return val + 1; }, Deps);
		},

		serialRule: function (LastCountAtt, CountAtt, GridId, Inc, scope) {
			scope = scope || gx.O;			
			var rowMode = gx.fn.getGridRowMode(gx.fn.gridLvl(GridId), GridId)
			if (rowMode != 'INS') {
				return scope[LastCountAtt];
			}
			else {			
				if (gx.lang.emptyObject(scope[CountAtt]) ) {
					scope[CountAtt] = scope[LastCountAtt] + Inc;

					var validStruct = gx.fn.vStructForVar(CountAtt);
					if (validStruct)
						validStruct.v2c();

					var vMap = scope.VarControlMap[LastCountAtt];
					if (vMap)
						gx.fn.setControlValue(vMap.id, scope[CountAtt]);
				}
			}
			return scope[CountAtt];
		},

		setReturnParms: function (gxObj, objVars, returnParms) {
			try {
				if (gxObj && objVars && returnParms) {
					var len = objVars.length;
					if (len == returnParms.length) {
						gx.setGxO(gxObj);
						var lastCtrl = null;
						for (var i = 0; i < len; i++) {
							var varName = objVars[i];
							if (varName) {
								var varValue = returnParms[i];
								var vStruct = gx.fn.vStructForVar(varName);
								if (gx.lang.emptyObject(vStruct)) {
									vStruct = gx.fn.vStructForHC(varName);
								}
								if (vStruct) {
									var ctrl = gx.fn.screen_CtrlRef(gx.csv.ctxControlId(vStruct.fld));
									if (gx.fn.isAccepted(ctrl)) {
										lastCtrl = ctrl;
										gx.evt.execOnchange(ctrl);
									}
									if (vStruct.v2v) {
										vStruct.v2v(varValue);
										vStruct.v2c();
									}
									gxObj.refreshDependantGrids(vStruct);
								}
								else {
									gxObj.setVariable(varName, varValue);
								}
							}
						}
						if (lastCtrl) {
							gx.fn.setFocus(lastCtrl);
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setReturnParms');
			}
		},

		isOutputParm: function (parm) {
			if (parm && parm.IOType && (parm.IOType == 'out' || parm.IOType == 'inout')) {
				return true;
			}
			return false;
		},

		checkPopupFocus: function (Ctrl) {
			if (gx.popup.ispopup()) {
				var popup = gx.popup.getPopup();
				if (popup && popup.frameDocument) {
					var ctrlDoc = (Ctrl.ownerDocument ? Ctrl.ownerDocument : Ctrl.document);
					if (ctrlDoc.URL != popup.frameWindow.location.href) {
						popup.setFocusFirst();
						return false;
					}
				}
			}
			return true;
		},

		persistControlProperty: function (ControlId, Property, PValue) {
			var Id = gx.fn.screen_CtrlId(gx.csv.ctxControlId(ControlId));
			if (!gx.usrPtys[Id])
				gx.usrPtys[Id] = {};
			gx.usrPtys[Id][Property.toLowerCase()] = PValue;
		},

		setCtrlProperty: function (ControlId, Property, PValue) {
			if (!gx.O) {
				gx.fx.obs.addObserver('gx.onready', this, gx.fn.setCtrlProperty.closure(this, arguments), { single: true });
				return;
			}
			var Control = null;
			if (ControlId == 'FORM')
				Control = document;
			else
				Control = gx.fn.screen_CtrlRef(gx.csv.ctxControlId(ControlId));
			if (Control == null)
				return;
			this.persistControlProperty(ControlId, Property, PValue);
			this.setCtrlPropertyImpl(Control, Property, PValue);
		},

		setGridCtrlProperty: function (ControlId, Property, PValue) {
			var Control = gx.fn.screen_CtrlRef(ControlId);
			if (Control == null)
				return;
			this.setCtrlPropertyImpl(Control, Property, PValue);
			var Cell = Control.parentElement;
			if (Cell.tagName != 'TD')
				return;
			this.persistControlProperty(ControlId, Property, PValue);
			this.setCtrlPropertyImpl(Cell, Property, PValue);
		},

		setCtrlPropertyImpl: function (Control, Property, PValue) {
			if (Control == null)
				return;
			if (Control == document) {
				if (Property == 'Class' || Property == 'Backcolor') {
					Control = document.body;
				}
			}
			var vStruct = gx.O.getValidStructFld(Control.id);
			if ((Property === "Enabled" || Property === "Visible") && vStruct && vStruct.grid > 0 && gx.fn.rowIsRemoved(vStruct.grid, gx.fn.controlRowId(Control)))
				return;

			var eventControl = Control;
			var onBeforeEventObject = {
				control: eventControl,
				property: Property,
				value: PValue
			};
			gx.fx.obs.notify("gx.control.onbeforepropertychange", [onBeforeEventObject]);
			if (onBeforeEventObject.cancel) {
				return;
			}

			switch (Property) {
				case "Caption":
					this.setCtrlCaption(Control, PValue);
					break;
				case "Tooltiptext":
					Control.title = PValue;
					break;
				case "Invitemessage":
					Control.placeholder = PValue;
					break;
				case "Visible":
					if (Control.nodeName == 'INPUT' && Control.type == 'button') {
						this.setButtonVisibility(Control, !this.propertyValueFalse(PValue));
					}
					else {
						if (Control.nodeName == 'INPUT') {
							if (Control.type == 'checkbox' && Control.parentNode.nodeName == 'SPAN')
								Control = Control.parentNode;
							else if (Control.type == 'radio') {
								var $parent = $(Control).parents('.gx-radio-button');
								if ($parent.length > 0) {
									Control = $parent[0];
								}
							}
							var multimediaControl = gx.html.multimediaUpload.getContainer(Control);
							if (multimediaControl) {
								Control = multimediaControl;
							}
						}
						var pValueFalse = this.propertyValueFalse(PValue);
						var disabled = (Control.gxusrdisabled) ? Control.gxusrdisabled : false;
						if (pValueFalse) {
							var spanVal = gx.dom.el('span_' + Control.id);
							this.setVisible(Control, !pValueFalse);
							if (spanVal)
								this.setVisible(spanVal, !pValueFalse);
						}
						else {
							
							var spanVal = this.getRONode(Control.id, disabled);
							if (spanVal)
								this.setVisible(spanVal, disabled);
							this.setVisible(Control, !disabled);
						}
						gx.fn.setDateCtrlProperties(Control, !disabled, !pValueFalse );
					}
					gx.fn.checkAttachedProperty(Control.id, Property, PValue);
					break;
				case "Enabled":
					var pValueFalse = this.propertyValueFalse(PValue);
					if (Control.type === "hidden")
						return;
					if (Control.tagName === "SPAN" && pValueFalse)
						return;
					if (Control.nodeName === 'INPUT' && Control.type === 'radio') {
						var allRadios = gx.dom.byName(Control.name);
						var len = allRadios.length;
						for (var i = 0; i < len; i++) {
							this.setEnabledProperty(allRadios[i], !pValueFalse);
						}
						return;
					}
					if ((gx.dom.isEditControl(Control) || Control.type === "textarea" || Control.type === "file" || Control.tagName === "SELECT") && Control.type !== "password") {
						var spanVal = this.getRONode(Control.id, pValueFalse);
						if (gx.fn.isVisible(Control, 0) || (spanVal && gx.fn.isVisible(spanVal, 0))) {
							if (spanVal) this.setVisible(spanVal, pValueFalse);
							this.setEnabledProperty(Control, !pValueFalse);//Debe ejecutarse antes de la setVisible(Control, !pValueFalse), caso textarea multiline que pasa a disabled en el cliente.
							this.setVisible(Control, !pValueFalse);
						}
						else {
							this.setEnabledProperty(Control, !pValueFalse);
						}
						gx.fn.setDateCtrlProperties(Control, !pValueFalse, true );
						gx.fn.checkAttachedProperty(Control.id, Property, PValue);
					} else
						this.setEnabledProperty(Control, !pValueFalse);
					break;
				case "Class":
					this.setCtrlClass(Control, PValue);
					break;
				case "Columnclass":
					var parentNode = Control.parentNode;
					if (parentNode && parentNode.tagName == "TD") {
						this.setCtrlClass(parentNode, "gx-attribute " + PValue);
					}
					break;
				case "Link":
					this.setCtrlLink(Control, PValue);
					break;
				case "Linktarget":
					this.setCtrlLinkTarget(Control, PValue);
					break;
				case "Backcolor":
					var htmlColor = gx.color.html(PValue);
					if (htmlColor && Control.gxGridName == undefined) {
						Control.style.backgroundColor = htmlColor.Html;
					}
					break;
				case "Background":
					Control.style.backgroundImage='url('+PValue+')';
					break;
				case "Forecolor":
					var htmlColor = gx.color.html(PValue);
					if (htmlColor) {
						Control.style.color = htmlColor.Html;
					}
					break;
				case "Fontbold":
					var pValueFalse = this.propertyValueFalse(PValue);
					Control.style.fontWeight = (pValueFalse ? 'normal' : 'bold');
					break;
				case "Fontitalic":
					var pValueFalse = this.propertyValueFalse(PValue);
					Control.style.fontStyle = (pValueFalse ? 'normal' : 'italic');
					break;
				case "Fontunderline":
					var pValueFalse = this.propertyValueFalse(PValue);
					Control.style.textDecoration = (pValueFalse ? 'none' : 'underline');
					break;
				case "Fontstrikethru":
					var pValueFalse = this.propertyValueFalse(PValue);
					Control.style.textDecoration = (pValueFalse ? 'none' : 'line-through');
					break;
				case "Fontname":
					Control.style.fontFamily = PValue;
					break;
				case "Fontsize":
					Control.style.fontSize = PValue + 'pt';
					break;
				case "Filename":
					this.setBlobFilename(Control, PValue);
					break;
				case "Filetype":
					this.setBlobFiletype(Control, PValue);
					break;
				case "URL":
					this.setBlobUrl(Control, PValue);
					break;
				case "IsBlob":
					this.setMultimediaType(Control, PValue);
					break;
				case "Bitmap":
					Control.src = PValue;
					break;
				case "Multimedia":
					this.setMultimediaValue(Control, PValue);
					break;
				case "Jsonclick":
					Control.jsevent = PValue;
					break;
				case "Source":
					var testValue = PValue;
					var qIdx = testValue.indexOf('?');
					if (qIdx > 0)
						testValue = testValue.substring(0, qIdx);
					if (testValue.indexOf(':') == -1 && testValue.indexOf('/') == -1)
						Control.src = gx.ajax.objectUrl(PValue);
					else
						Control.src = gx.util.resourceUrl(PValue, true);
					gx.evt.attach(Control, "load", gx.dom.autofitIFrame);
					break;
				case "Values":
					if ((Control.tagName == 'SELECT') || (Control.tagName == 'SPAN')) {
						PValue = gx.json.evalJSON(PValue);
						if (Control.tagName == 'SELECT') {
							if (PValue.isset != false) {
								gx.fn.loadComboBox(Control.id, PValue.v);
								gx.fn.setComboBoxValue(Control.id, PValue.s);
							}
						}
						else {
							var ControlId = Control.id.substring(5);
							var sType = '';
							var Value = PValue.s;
							var vStruct = gx.O.getValidStructFld(ControlId);
							if (!gx.lang.emptyObject(vStruct))
								sType = vStruct.type;
							Value = gx.fn.trimSelectValue(Value, sType);
							PValue.s = Value;
							gx.fn.setControlValue_span_safe(ControlId, gx.fn.selectedDescription(PValue, sType));
						}
					}
					break;
				case "Width":
					if (Control.width)
						Control.width = PValue;
					Control.style.width = gx.dom.addUnits(PValue);
					break;
				case "Height":
					if (Control.height)
						Control.height = PValue;
					Control.style.height = gx.dom.addUnits(PValue);
					break;
			}
			var ctrlId = gx.dom.id(Control);
			if (ctrlId) {
				var propHidden = ctrlId + '_' + Property;
				if (gx.fn.isHidden(propHidden)) {
					gx.fn.setHidden(propHidden, PValue);
				}
			}

			gx.fx.obs.notify("gx.control.onafterpropertychange", [{
				control: eventControl,
				property: Property,
				value: PValue
			}]);
		},

		setEnabledProperty: function (Control, Enabled, updateDOM) {
			var ctrlId = gx.dom.id(Control);
			if (gx.lang.gxBoolean(Enabled) && gx.fn.isAccepted(Control, false))
				return;
			if (gx.csv.validating == true) {
				if (Enabled && gx.csv.validActivatedControl == null && Control != gx.csv.lastControl) {
					var vStructId = gx.O.getValidStructId(ctrlId);
					if (vStructId > gx.O.fromValid && vStructId <= gx.O.toValid) {
						gx.csv.validActivatedControl = Control;
					}
				}
			}
			if (!Enabled)
				gx.util.addOnce(gx.disabledControls, Control, ctrlId);
			else
				delete gx.disabledControls[ctrlId];
			Control.gxusrdisabled = (!Enabled);
			if (Control.gxdisabled) {
				if (Control.gxdisabled == true)
					Control.disabled = true;
				else
					Control.disabled = Control.gxusrdisabled;
			}
			else
				Control.disabled = Control.gxusrdisabled;
			if (updateDOM === undefined || updateDOM) {
				this.setEnabled(Control, Enabled);
			}
		},

		setEnabled: function (el, Value) {
			if (this.disabledAsSpan(el)) {
				var roel;
				var dp_el;
				var parent;
				try {
					if (el.type == 'checkbox')
						parent = el.parentNode;
					if (el.type == 'radio') {
						var $parent = $(el).parents('.gx-radio-button');
						parent = $parent[0];
					}
				} catch (e) { }
				if (gx.lang.booleanValue(Value)) {
					//Enable
					if (parent && parent.className.indexOf("Readonly") == 0)
						parent.className = parent.className.substring(8);
					if (this.isVisible(el)) {
						this.setVisible(el, 1);
						roel = this.getRONode(el.id, true);
						if (roel)
							this.setVisible(roel, 0);
					}
				}
				else {
					//Disable
					if (parent && parent.className.indexOf("Readonly") < 0)
						parent.className = "Readonly" + parent.className;

					if (this.isVisible(el) && el.type != 'password' && el.type != 'image' && el.type != 'checkbox' && el.type !== 'radio') {
						roel = this.getRONode(el.id, true);
						if (roel) {
							this.setVisible(el, 0);
							this.setVisible(roel, 1);
							var validStruct = gx.O.getValidStructFld(el);
							var GXCtrlFormat = 0;
							if (!gx.lang.emptyObject(validStruct) && validStruct.format)
								GXCtrlFormat = validStruct.format;
							this.setControlValue_span_safe(roel, gx.fn.getControlValue(gx.dom.id(el), 'screen') || el.value, GXCtrlFormat, (el.type == "textarea"));
						}
					}
				}
			}
		},

		disabledAsSpan: function (el) {
			return (el.tagName != 'IMG')
		},

		setVisible: function (el, Value) {
			el.style.display = (Value == 0) ? "none" : this.displayByType(el.nodeName);
			var vStruct = gx.O.getValidStructFld(el);
			var parent = el.parentNode;
			if (Value && vStruct && vStruct.gxgrid && !vStruct.gxgrid.grid.gxIsFreestyle && parent.getAttribute('colindex') != null) {
				vStruct.gxgrid.applyPropEntireColumn(parent.getAttribute('colindex'), "Visible", Value);
			}
			else { //GridCtrl
				var ctrlGrid = gx.fn.rowGridId(el);
				if (ctrlGrid) {
					var elTable = $(el).find('table')[0]
					if (elTable)
						this.setVisible( elTable, Value);
				}
			}

		},

		getRONode: function (id, create) {
			if (gx.lang.emptyObject(id))
				return null;
			var el = gx.dom.byId(id);
			var roelid = 'span_' + id;
			var roel = gx.dom.byId(roelid);
			if (roel != null)
				return roel;
			if (!create || el == null)
				return null;
			var span = document.createElement('SPAN')
			span.setAttribute('id', roelid);
			this.setVisible(span, false);
			span.className = 'Readonly' + el.className;
			span.appendChild(document.createTextNode(el.value || ''));
			el.parentNode.insertBefore(span, el);
			return span;
		},

		setDateCtrlProperties: function (Control, Enabled, Visible) {
			var dpTrigger = gx.dom.el(gx.dom.id(Control) + '_dp_trigger');
			if (dpTrigger)
				$(dpTrigger).toggle(Enabled);				
						
			var dpContainer = $(gx.dom.el(gx.dom.id(Control) + '_dp_container'));
			if (dpContainer) {
				if (Control.Flat)
					$(Control).hide();
				
				var calendar = $( ".calendar", dpContainer);			
				dpContainer.toggle((Enabled && Visible) || (!Enabled && Visible));								
				if (calendar)
					calendar.toggle((Enabled && Visible));				
			}			
		},

		getGridCtrlProperty: function (gridId, ctrlId, prop) {
			try {
				if (gridId != 0) {
					var gridObj = this.getGridObj(gridId);
					if (gridObj) {
						var col = gridObj.grid.getColumnByHtmlName(ctrlId);
						if (col) {
							return col[prop.toLowerCase()];
						}
					}
				}
				else {
					return this.getCtrlProperty(ctrlId, prop);
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getGridCtrlProperty');
			}
			return '';
		},

		getCtrlProperty: function (ControlId, Property) {
			var UC = gx.uc.getUserControlObj(gx.uc.userControlContainerId(ControlId));
			if (UC != null)
				return UC[Property];
			var Control = this.screen_CtrlRef(ControlId);
			if (Control == null)
				return;
			if (Property == "Text")
				return this.getControlValue(ControlId, "screen");
			else
				return this.getCtrlProperty_impl(Control, Property);
		},

		getCtrlProperty_impl: function (Control, Property) {
			if (Control == null)
				return "";
			switch (Property) {
				case "Tooltiptext": return Control.title;
				case "Invitemessage": return Control.placeholder;
				case "Visible": return Control.style.display != "none";
				case "Enabled": return gx.lang.emptyObject(Control.disabled) != 0;
				case "Class": return Control.className;
				case "Backcolor": return gx.color.css(Control.style.backgroundColor);
				case "Forecolor": return gx.color.css(Control.style.color);
				case "Width": return gx.dom.dimensions(Control).w;
				case "Height": return gx.dom.dimensions(Control).h;
				case "Caption": return this.getCtrlCaption(Control);
				case "Fontbold": return (Control.style.fontWeight == 'bold');
				case "Fontitalic": return (Control.style.fontStyle == 'italic');
				case "Fontunderline": return (Control.style.textDecoration == 'underline');
				case "Fontstrikethru": return (Control.style.textDecoration == 'line-through');
				case "Fontname": return Control.style.fontFamily;
				case "Fontsize":
					{
						var size = parseInt(Control.style.fontSize);
						if (isNaN(size))
							return 12;
						return size;
					}
			}
		},

		displayByType: function (NodeName) {
			switch (NodeName) {
				case 'TABLE':
					{
						if (!gx.util.browser.isIE() || (gx.util.browser.ieVersion() >= 8))
							return 'table';
						return 'block';
					}
				case 'P':
				case 'DIV': return 'block';
			}
			return '';
		},

		setCtrlCaption: function (Control, PValue) {
			try {
				switch (Control.tagName) {
					case 'SPAN':
					case 'DIV':
					case 'FIELDSET':
						var ctrlFormat = Control.getAttribute('gxformat');
						var validStruct = gx.O.getValidStructFld(Control);
						if (ctrlFormat == null) {
						    if (!gx.lang.emptyObject(validStruct) && validStruct.format)
						        ctrlFormat = validStruct.format;
						    else
						        ctrlFormat = 0;
						}
						var isMultiline = false;
						if (validStruct)
							isMultiline = validStruct.ctrltype ? validStruct.multiline : true;
						gx.fn.setControlValue_fmt(Control, PValue, ctrlFormat, isMultiline);
						return;
					case 'INPUT':
						if (Control.type != 'checkbox')
							Control.value = PValue;
						return;
				}
				if (Control.nodeName == '#document') {
					Control.title = PValue;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setCtrlCaption');
			}
		},

		getCtrlCaption: function (Control) {
			switch (Control.tagName) {
				case 'SPAN':
				case 'DIV':
				case 'FIELDSET':
					var ctrlFormat = Control.getAttribute('gxformat');
					if (ctrlFormat != null && ctrlFormat == '1')
						return Control.innerHTML;
					else {
						while (Control.firstChild != null && Control.firstChild.nodeName != '#text')
							Control = Control.firstChild;
						if (typeof (Control.innerText) != 'undefined')
							return Control.innerText;
						return Control.textContent || Control.text;
					}
				case 'INPUT':
					if (Control.type != 'checkbox')
						return Control.value;
					break;
				default:
					return '';
			}
		},

		propertyValueFalse: function (Value) {
			if (typeof (Value) == "string") {
				Value = Value.toLowerCase();
				if ((Value == 'false') || (gx.num.parseFloat(Value) == 0))
					return true;
			}
			return (Value == 0);
		},

		setButtonVisibility: function (Control, Visible) {
			var displayProp = Visible ? '' : 'none';
			var buttonBackground = Control.parentNode;
			if (!gx.lang.emptyObject(buttonBackground) && buttonBackground.nodeName == 'SPAN') {

				buttonBackground.style.display = displayProp;
				var buttonRight = buttonBackground.parentNode;
				if (!gx.lang.emptyObject(buttonRight) && buttonRight.nodeName == 'SPAN') {
					buttonRight.style.display = displayProp;
					var buttonLeft = buttonRight.parentNode;
					if (!gx.lang.emptyObject(buttonLeft) && buttonLeft.nodeName == 'SPAN') {
						buttonLeft.style.display = displayProp;
						var buttonRBtn = buttonLeft.parentNode;
						if (!gx.lang.emptyObject(buttonRBtn) && buttonRBtn.nodeName == 'SPAN')
							buttonRBtn.style.display = displayProp;
					}
				}
			}
			Control.style.display = displayProp;
		},

		setBlobValue: function (ControlId, Value) {
			var Control = gx.dom.el(ControlId) || gx.dom.el("Object_" + ControlId);
			this.setBlobUrl(Control, Value);
		},

		setBlobFilename: function (Control, PValue) {
			if (Control != null) {
				var vStruct = gx.O.getValidStructFld(Control);
				if (vStruct) {
					gx.fn.setHidden(vStruct.fld + "_Filename", gx.text.trim(PValue));
				}
			}
		},

		setBlobFiletype: function (Control, PValue) {
			if (Control != null) {
				var vStruct = gx.O.getValidStructFld(Control);
				if (vStruct) {
					gx.fn.setHidden(vStruct.fld + "_Filetype", gx.text.trim(PValue));
				}
				var blobCtrl = Control;
				if (blobCtrl.nodeName == 'INPUT' && blobCtrl.type == 'file')
					blobCtrl = gx.dom.el("Object_" + Control.id);
				if (blobCtrl != null) {
					PValue = gx.util.getContentType(PValue);
					this.setObjectCtrlType(blobCtrl, PValue);
					gx.fn.setVisible(blobCtrl, true);
				}
			}
		},

		resolveResourceUrl: function (resource, useBlank) {
			if (resource == '')
				return useBlank ? gx.ajax.getImageUrl(gx, 'blankImage') : "";
			else {
				if (!gx.ajax.isabsoluteurl(resource)) {
					if (gx.ajax.isRelativeToHost(resource)) {
						if (resource.toLowerCase().indexOf("/" + gx.basePath.toLowerCase()) != 0)
							return gx.util.resourceUrl(gx.basePath + resource, false);
					}
					else
						return gx.util.resourceUrl(gx.basePath + gx.staticDirectory + resource, false);
				}
			}
			return resource;
		},

		setBlobUrl: function (Control, PValue) {
			var multimediaCt = gx.html.multimediaUpload.getContainer(Control);
			if (multimediaCt) {
				var link = this.resolveResourceUrl(PValue, false);
				gx.html.multimediaUpload.setPreviewImage(multimediaCt, link);
				gx.html.multimediaUpload.setPreviewLink(multimediaCt, link);
			}
			else {
				if (!PValue.match(/^[a-z]:[\S]*/i)) {
					if (Control != null) {
						var blobCtrl = Control;
						var isInputFile = blobCtrl.nodeName == 'INPUT' && blobCtrl.type == 'file';
						if (PValue === '') {	
							if (isInputFile && gx.util.browser.isIE()) { //Hack. IE Security policy does not allow to set value property by js. 
								var parent = blobCtrl.parentNode;
								var auxContainer = document.createElement('div');
								auxContainer.innerHTML = blobCtrl.outerHTML;
								parent.removeChild(blobCtrl);								
								blobCtrl = parent.appendChild(auxContainer.firstChild);
							}
							else {
								blobCtrl.value = "";
							}
						}
						if (isInputFile)
							blobCtrl = gx.dom.el("Object_" + Control.id);
						if (blobCtrl != null) {
							var cType = gx.util.getContentTypeFromExt(PValue);
							blobCtrl = this.setObjectCtrlType(blobCtrl, cType);
						}
						if (blobCtrl != null) {
							if (blobCtrl.tagName == 'IMG') {
								PValue = this.resolveResourceUrl(PValue, true);
								blobCtrl.src = PValue;
							}
							else {
								PValue = PValue || "about:blank";
								blobCtrl.data = PValue;
								gx.fn.setVisible(blobCtrl, true);
								this.resizeObject(blobCtrl);
								gx.dom.redrawControl(blobCtrl);
							}
						}
						else {
							blobCtrl = gx.dom.el("Link_" + Control.id);
							if (blobCtrl != null) {
								if (PValue != '')
									blobCtrl.style.display = "block";
								else
									blobCtrl.style.display = "none";
								blobCtrl.href = PValue;
							}
						}
					}
				}
			}
		},

		setGridMultimediaValue: function (ControlId, sRow, file, uri) {
			if (sRow !== undefined)
				return this.setMultimediaValue(ControlId + "_" + sRow, file, uri);
		},

		setMultimediaValue: function (ControlId, file, uri) {
			var Control = gx.dom.el(ControlId);
			if (Control) {
				var multimediaCt = gx.html.multimediaUpload.getContainer(Control);
				var link = this.resolveResourceUrl(file || uri || "", false);
				if (multimediaCt) {
					gx.html.multimediaUpload.setPreviewImage(multimediaCt, link);
					var isBlob = (file == "" && uri == "") || file != "";
					if (!isBlob) {
						var gxiEl = gx.dom.el(Control.id + "_GXI");
						if (gxiEl)
							gxiEl.value = uri;
					}
					var inputEl = gx.dom.el(ControlId);
					if (inputEl && file == "")
						inputEl.value = "";
					this.setMultimediaType(Control, isBlob);
					gx.html.multimediaUpload.setPreviewLink(multimediaCt, link);
				}
				else {
					if (Control.tagName == 'IMG' || (Control.tagName == 'INPUT' && Control.type == "image"))
						Control.src = link;
					var parent = Control.parentNode;
					if (parent && parent.tagName == 'A' && gx.dom.isMultimediaElement(Control)) {
						if (link)
							parent.href = link;
						else
							parent.removeAttribute('href')
					}
				}
			}
		},

		setMultimediaType: function (Control, PValue) {
			if (Control) {
				var multimediaCt = gx.html.multimediaUpload.getContainer(Control);
				if (multimediaCt)
					gx.html.multimediaUpload.setType(multimediaCt, gx.lang.gxBoolean(PValue));
			}
		},

		setObjectCtrlType: function (objCtrl, type) {
			var newCtrl = objCtrl;
			if (objCtrl.nodeName == 'IMG' && (!type || type.indexOf('image/') == 0))
				return newCtrl;
			if ((objCtrl.type != type) || (objCtrl.nodeName == 'OBJECT' && type.indexOf('image/') == 0)) {
				if (type.indexOf('image/') == 0)
					newCtrl = gx.html.nodesFromText('<img id="' + objCtrl.id + '">')[0];
				else
					newCtrl = gx.html.nodesFromText('<object style="display:none;" id="' + objCtrl.id + '" type="' + type + '">')[0];
				if (newCtrl) {
					try {
						for (var att in objCtrl.attributes) {
							if (att != "id" && att != "type" && att != "implementation") {
								if (objCtrl[att]) {
									try { newCtrl[att] = objCtrl[att]; }
									catch (e) {
										gx.dbg.logEx(e, 'gxfrmutl.js', 'setObjectCtrlType');
									}
								}
							}
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxfrmutl.js', 'setObjectCtrlType');
					}
					var pN = objCtrl.parentNode;
					if (pN) {
						var sibling = null;
						var childs = pN.childNodes.length;
						for (i = 0; i < childs; i++) {
							if (pN.childNodes[i] == objCtrl) {
								if (i < childs - 1)
									sibling = pN.childNodes[i + 1];
								break;
							}
						}
						gx.dom.removeControlSafe(objCtrl);
						if (sibling != null)
							pN.insertBefore(newCtrl, sibling);
						else
							pN.appendChild(newCtrl);
					}
				}
			}
			return newCtrl;
		},

		resizeObject: function (oCtrl) {
			var eo = gx.lang.emptyObject;
			if (!eo(oCtrl.data) && oCtrl.data != 'about:blank') {
				if (eo(oCtrl.width) && eo(oCtrl.height) && eo(oCtrl.style.width) && eo(oCtrl.style.height)) {
					oCtrl.style.width = '200px';
					oCtrl.style.height = '200px';
				}
			}
		},

		recoverLostCtrlOnGridRefresh: function (Control) {
			//When isValid is fired and grid is re-rendered, control handler is lost. We try to recover it.
			if (Control.form == null) {
				var ctrlId = gx.dom.id(Control);
				var vStruct = gx.O.getValidStructId(ctrlId);
				if (vStruct != undefined) {
					if (Control.type == 'checkbox') {
						var ctrlChecked = Control.checked;
						Control = gx.dom.el(Control.id) || gx.dom.el(Control.name);
						Control.checked = ctrlChecked;
					}
				}
			}
			return Control;
		},

		checkboxClick: function (Id, Control, Checked, UnChecked) {
			gx.fx.obs.notify('gx.validation'); //Calls pending validations.			

			if (gx.evt.fixWebKitOnFocus())
				Control.onfocus();

			Control = this.recoverLostCtrlOnGridRefresh(Control);

			if (Control.checked)
				Control.value = Checked;
			else
				Control.value = UnChecked;
			var vStruct = gx.fn.validStruct(Id);
			if (vStruct && typeof (vStruct.c2v) == 'function')
				vStruct.c2v();
			if (typeof (vStruct.v2bc) == 'function')
				vStruct.v2bc.call(gx.O);
		},

		setCtrlClass: function (Control, Class) {
			if (Control == null)
				return;
			Control.className = Class;
		},

		setCtrlLink: function (Control, Link) {
			if (Control == null)
				return;
			if (Link == "") {
				this.unsetCtrlLink(Control);
				return;
			}
			var childCtrl = Control.firstChild;
			if (childCtrl && childCtrl.tagName == "A") {
				childCtrl.href = Link;
			}
			else {
				var ParentTag = Control.parentNode;
				if (ParentTag.tagName == "A") {
					ParentTag.href = Link;
				}
				else {
					var newA = document.createElement("A");
					newA.href = Link;
					if (childCtrl && childCtrl.nodeName == "#text") {
						if (gx.dom.shouldPurge())
							gx.dom.purge(newA, true);
						newA.innerHTML = childCtrl.nodeValue;
						Control.replaceChild(newA, childCtrl);
					}
					else {
						ParentTag.replaceChild(newA, Control);
						newA.appendChild(Control);
					}
				}
			}
		},

		unsetCtrlLink: function (Control) {
			if (Control == null)
				return;
			var ParentTag = Control.parentNode;
			if (ParentTag.tagName == "A") {
				var ChildNode = ParentTag.firstChild;
				ParentTag2 = ParentTag.parentNode;
				if (ParentTag2 != null) {
					while (ChildNode != null) {
						ParentTag2.insertBefore(ChildNode, ParentTag);
						ChildNode = ParentTag.firstChild;
					}
					gx.dom.removeControlSafe(ParentTag);
				}
			}
		},

		setCtrlLinkTarget: function (Control, target) {
			if (Control == null)
				return;
			if (Control.nodeName == 'SPAN' && Control.firstChild) {
				Control = Control.firstChild;
			}
			if (Control.nodeName == 'A') {
				if (Control.setAttribute) {
					Control.setAttribute('target', target);
				}
				else {
					Control.target = target;
				}
			}
		},

		isVisible: function (Control, searchUpLevels) {
			try {
				var style;
				while (Control && (typeof (searchUpLevels) == 'undefined' || searchUpLevels >= 0)) {
					style = gx.dom.getComputedStyle(Control);
					if (style && (style["visibility"] == 'hidden' || style["display"] == 'none'))
						return false;
					Control = Control.parentNode;
					if (typeof (searchUpLevels) != 'undefined')
						searchUpLevels--;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'isVisible');
			}
			return true;
		},

		gridRowIsMod: function (Lvl, Row) {
			var gxGrid = this.gridObjByLvl(Lvl);
			var row = null;
			if (gxGrid) {	
				gxGrid = gx.O.getGridById( gxGrid.gridId, Row) || gxGrid;			
				var row = gxGrid.grid.getRowByGxId(Row);
				if (row)
					return row.gxIsMod();
				return true;
			}
			var bRet = false;
			try {
				var isMod = this.getControlValue("nIsMod_" + Lvl + "_" + Row);
				bRet = (isMod == 1);
			}
			catch (e) {
				bRet = false;
			}
			return bRet;
		},

		gridObjByLvl: function (Lvl) {
			var objGrids = gx.O.Grids;
			var len = objGrids.length;
			for (var i = 0; i < len; i++) {
				if (objGrids[i].gridLvl == Lvl)
					return objGrids[i];
			}
			return null;
		},

		forceEnableControls: function (Bool) {
			for (var Ctrl in gx.disabledControls) {
				Ctrl = this.getControlRef_list(Ctrl);
				var len = Ctrl.length;
				for (var i = 0; i < len; i++) {
					try {
						if (Ctrl[i].type != 'button' && Ctrl[i].type != 'submit')
							Ctrl[i].disabled = Bool;
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxfrmutl.js', 'forceEnableControls');
					}
				}
			}
		},

		alert: function (Ctrl, Message) {
			try {
				var gxballoon = gx.util.balloon.getNew(Ctrl.id);
				gxballoon.setError(Message);
				gxballoon.show();
				gx.csv.invalidForcedCtrl = Ctrl;
			}
			catch (e) {
				alert(Message);
			}
		},

		getGridRowMode: function (GXLvl, GridId) {
			var CurrentRow = this.currentGridRow(GridId);
			var IsRemoved = this.rowIsRemoved(GridId, CurrentRow);
			var RecordExists = this.getControlValue("nRcdExists_" + GXLvl + '_' + CurrentRow);
			if (IsRemoved == "1")
				return "DLT";
			if (RecordExists == "0")
				return "INS";
			return "UPD";
		},

		rowIsRemoved: function (GridId, CurrentRow) {
			var gridCtrl = this.getGridObj(GridId);
			if (gridCtrl != null) {
				var gridCtrlRow = gridCtrl.grid.getRowByGxId(CurrentRow);
				if (gridCtrlRow)
					return gridCtrlRow.gxDeleted();
			}
			return false;
		},

		getGridObj: function (GridId) {
			return gx.O.getGridById(GridId);
		},

		changeCmpContext: function () {
			try {
				gx.O.SetStandaloneVars();
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'changeCmpContext');
			}
		},

		initOld: function (Ctrl) {
			if (gx.oldValues[Ctrl.id] == undefined)
				gx.oldValues[Ctrl.id] = Ctrl.value;
		},

		setFocusOnError: function (ControlId) {
			var ctrlGrid = gx.fn.controlGridId(ControlId);
			var ctrlCmpId = gx.csv.ctxControlId(ControlId);
			var domCtrl = null;
			if (ctrlGrid == 0)
				domCtrl = gx.dom.el(ctrlCmpId);
			else
				domCtrl = gx.fn.getControlGridRef(ctrlCmpId, ctrlGrid);
			if (domCtrl != null) {
				gx.O.AnyError = 1;
				gx.csv.anyError = true;
				domCtrl.setAttribute("gxvalid", "0");
				if (gx.csv.stopOnError)
					gx.fn.setFocus(domCtrl);
			}
		},

		usrSetFocus: function (ControlId, deferIfValidating) {
			if (deferIfValidating === undefined)
				deferIfValidating = true;

			ControlId = gx.csv.ctxControlId(ControlId);
			if (gx.csv.validating == true) {
				if (deferIfValidating) {
					gx.fx.obs.addObserver('gx.onvalidationend', this, gx.fn.usrSetFocus.closure(gx.fn, [ControlId, false]), { single: true });
				}
				else {
					gx.usrFocusControl = ControlId;
				}
			}
			else {
				var Control = gx.dom.el(ControlId);
				if (Control != null)
					gx.fn.setFocus(Control);
			}
		},

		setFocus: function (Control, callback) {
			if (Control) {
				try {
					if (gx.popup.ispopup()) {
						if (gx.util.browser.isIE() && window.parent.document.selection) {
							window.parent.document.selection.empty();
						}
						else if (window.parent.gx.csv.lastControl && window.parent.gx.csv.lastControl.blur) {
							window.parent.gx.csv.lastControl.blur();
						}
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'setFocus');
				}
				try {
					if (!gx.lang.emptyObject(Control.id)) {
						Control = gx.dom.byId(Control.id);
						if (!Control)
							return;
					}
					gx.fn.setFocusSafe(Control, function(Control) { 
						if (gx.util.browser.isIE())
							gx.fn.setSelection( Control);
						Control.forcedFocus = true;
						if (callback)
							callback();
					}); 
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'setFocus');
				}				
			}
		},

		setFocusSafe: function( Control, callback) {
			if (Control)
			{
				var doSetFocus = function(Control, callback) {
					try {
						if (setFocusOnload && callback) {
							gx.fx.obs.addObserver('gx.onaftervalidate', this, callback.closure(this, [Control]), { single: true });											
						}
						Control.focus();
					}
					catch(e) {}
					if (!setFocusOnload && callback) {
						callback(Control);
					}
				};
				var setFocusOnload = gx.csv.setFocusOnload;
				if (setFocusOnload || !gx.util.browser.isIE()) {
					var timeout = setFocusOnload ? 500 : 0;
					gx.lang.doCallTimeout(doSetFocus, this, [Control, callback], timeout);
				}
				else {
					doSetFocus(Control, callback);
				}
			} 
		},

		setFocusInit: function () {
			try {
				gx.csv.lastActiveControl = window.document.activeElement;
			}
			catch (e) { }
			if (!gx.csv.lastActiveControl)
				gx.csv.lastActiveControl = gx.csv.lastControl;
		},

		setFocusOnload: function () {
			if (gx.pO.focusOnlyNEmb && top !== self && !gx.popup.ispopup())
				return;

			var Control = null;
			var usrFocusId = gx.pO.getUserFocus();
			if (!gx.lang.emptyObject(usrFocusId)) {
				if (usrFocusId == 'notset')
					return;
				var userControl = gx.pO.getUserControl(gx.uc.userControlContainerId(usrFocusId));
				if (!gx.lang.emptyObject(userControl)) {
					userControl.setFocusBase();
					return;
				}
				else {
					gx.csv.userFocus = gx.fn.getControlRef(usrFocusId);
				}
			}
			if (gx.csv.userFocus == 'notset') {
				return;
			}
			Control = gx.csv.userFocus;
			if (!gx.fn.isAccepted(Control)) {
				if (gx.csv.lastActiveControl && gx.fn.isAccepted(gx.csv.lastActiveControl)) {
					Control = gx.csv.lastActiveControl;
				}
				else {
					var frmFirstEl = gx.fn.firstAcceptedControl(gx.popup.ispopup());
					Control = frmFirstEl;
				}
			}

			try {
				if (Control) {
					var disableFocusonLoad = function() {
						gx.csv.setFocusOnload = false;
					}
					gx.csv.lastControl = Control;
					gx.csv.setFocusOnload = true;
					if (gx.fn.isAccepted(Control))
						gx.fn.setFocus(Control, disableFocusonLoad);
					else {
						gx.popup.setFocus();					
						disableFocusonLoad();
					}
				}
				else {
					gx.popup.setFocus();
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setFocusOnload');
			}
		},

		setSelection: function (Control) {
			if (Control && gx.fn.isVisible(Control)) {
				try {
					gx.csv.lastControl = Control;
					if ((gx.dom.isEditControl(Control) || Control.type == "file") && Control.select)
						Control.select();
					else if (Control.nodeName == "TEXTAREA" || Control.nodeName == "SELECT") {
						Control.focus();
						if (Control.select)
							Control.select();
					}
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'setSelection');
				}
			}
		},

		isAccepted: function (Control, triggerNac, gxO) {
			var triggerNac = triggerNac == undefined || triggerNac,
				accepted = true,
				gxO = gxO || gx.O;
			var notAccNodeName = ['FIELDSET'];
			if (Control != null && Control.type != undefined && !gx.util.inArray(Control.nodeName, notAccNodeName) && Control.type != "hidden" && gx.fn.isVisible(Control)
					&& Control.disabled == false && (Control.readOnly == null || Control.readOnly == false)) {
				if (triggerNac) {
					var ControlId = gx.dom.id(Control),
						vStruct = gxO.getValidStructFld(ControlId),
						sMode = gxO.getVariable("Gx_mode");
					if (gx.csv.lastGrid > 0)
						gxO.setVariable("Gx_mode", gx.fn.getGridRowMode(gx.fn.gridLvl(gx.csv.lastGrid), gx.csv.lastGrid));
					if (!gx.lang.emptyObject(vStruct) && vStruct.nac)
						accepted = (vStruct.nac.call(gxO) == false);
					else
						accepted = true;
					gxO.setVariable("Gx_mode", sMode);
				}
			}
			else {
				accepted = false;
			}
			return accepted;
		},

		enterHasFocus: function () {
			if (gx.csv.lastControl == null)
				return false;
			return gx.evt.isEnterEvtCtrl(gx.csv.lastControl);
		},

		skipFocus: function (skiponenter) {
			var lastControl = gx.csv.lastControl;
			var startEl = gx.fn.getControlIndex(lastControl), el = startEl;
			var gridId = this.controlGridId(lastControl.id || lastControl.name);

			var avoidNewRowBtn = false;
			if (skiponenter && gx.dom.hasClass(lastControl, 'gx_newrow')) {
				el = lastControl.gxControlIdx;
				avoidNewRowBtn = true;
			}

			if (el == -1)
				return true;
			var Control = null;
			for (Control = gx.fn.searchFocus(++el, true) ; ; Control = gx.fn.searchFocus(++el, true)) {
				if (Control == null || el == gx.dom.form().elements.length)
					el = -1;
				else {
					if (skiponenter)
						break;
					if (gx.evt.isEnterEvtCtrl(Control))
						break;
					if (Control.nodeName == 'INPUT' && Control.type != 'submit' && Control.type != 'button' && Control.type != 'image')
						break;
				}
			}

			if (!avoidNewRowBtn && gridId && gx.O.isTransaction()) {
				if (this.controlGridId(Control.id || Control.name) != gridId) {
					var grid = gx.O.getGridById(gridId);
					var newRowEl = gx.dom.el(grid.containerName + "_NewRow");
					Control = newRowEl.parentNode;
					// Remember the control index of the last editable field in the grid, so it is used when Enter is pressed on NewRow button
					Control.gxControlIdx = startEl;
				}
			}

			gx.fn.setFocus(Control);
		},

		getControlIndex: function (Ctrl) {
			var i_max = gx.dom.form().elements.length - 1;
			var i_min = 0;
			el = this.controlIndex(Ctrl, i_min, i_max);
			return el;
		},

		controlIndex: function (Ctrl, i_min, i_max) {
			if (!document.all) {
				return Ctrl.gxIndex;
			}
			else {
				var frm = gx.dom.form();
				var i_minsi = frm.elements[i_min].sourceIndex;
				var i_maxsi = frm.elements[i_max].sourceIndex;
				var i_med = parseInt(i_min + ((i_max - i_min) / 2)) + 1;
				var i_medsi = frm.elements[i_med].sourceIndex;
				if ((i_min == i_max) && (Ctrl.sourceIndex == i_minsi) && (Ctrl.sourceIndex == i_maxsi))
					return i_min;

				if (Ctrl.sourceIndex == i_minsi)
					return i_min;
				if (Ctrl.sourceIndex == i_maxsi)
					return i_max;
				if (Ctrl.sourceIndex == i_medsi)
					return i_med;

				if ((Ctrl.sourceIndex > i_medsi) && (Ctrl.sourceIndex < i_maxsi))
					return this.controlIndex(Ctrl, i_med + 1, i_max - 1);

				if ((Ctrl.sourceIndex > i_minsi) && (Ctrl.sourceIndex < i_medsi))
					return this.controlIndex(Ctrl, i_min + 1, i_med - 1);
			}
		},

		searchFocus: function (el, Forward) {
			if (Forward)
				return this.searchFocusFwd(el);
			return this.searchFocusBack(el);
		},

		searchFocusBack: function (el) {
			var frm = gx.dom.form();
			for (var i = el; i >= 0; i--) {
				if (gx.fn.isAccepted(frm.elements[i]))
					return frm.elements[i];
			}
			return null;
		},

		searchFocusFwd: function (el) {
			var frm = gx.dom.form();
			var len = frm.elements.length;
			for (var i = el; i < len; i++) {
				if (gx.fn.isAccepted(frm.elements[i]))
					return frm.elements[i];
			}
			return null;
		},

		rowGridId: function (ctrl) {
			if (!ctrl || !ctrl.getAttribute)
				return null;
			var id = ctrl.getAttribute("gxgridid");
			if (id != null)
				return id;
			return gx.fn.rowGridId(ctrl.parentNode);
		},

		controlRowId: function (ctrl) {
			if (!ctrl || !ctrl.getAttribute)
				return null;
			var id = ctrl.getAttribute("gxrow");
			if (id != null)
				return id;
			return gx.fn.controlRowId(ctrl.parentNode);
		},

		controlGridId: function (Fld) {
			try {
				var ctrlIds,
					i,
					grids = gx.O.Grids;

				if (grids) {
					for (i = 0, len=grids.length; i < len; i++) {
						if (grids[i].grid.columnsHtmlName[Fld]) {
							return grids[i].gridId;
						}
					}
				}

				ctrlIds = gx.fn.controlIds()
				for (i = 0, len = ctrlIds.length; i < len; i++) {
					var _GXValidStruct = gx.fn.validStruct(ctrlIds[i]);
					if (gx.O.isSameField(_GXValidStruct, Fld))
						return _GXValidStruct.grid;
				}

				var cData = gx.O.getComponentData(Fld);
				if (cData) {
					var gridObj = gx.fn.gridObjByLvl(cData.lvl);
					if (gridObj)
						return gridObj.gridId;
				}
			}
			catch (e) { }
			return 0;
		},

		oldGridId: function (Name) {
			try {
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					var _GXValidStruct = gx.fn.validStruct(ctrlIds[i]);
					if (_GXValidStruct != undefined && _GXValidStruct.gxold == Name)
						return _GXValidStruct.grid;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'oldGridId');
			}
			return 0;
		},

		saveLvlOldParm: function (Name, Value) {
			var gxMode = 'no_mode';
			if (gx.csv.validatingGrid != null) {
				if (this.isLvlParmOld(gx.csv.lastGrid, Name)) {
					gxMode = gx.fn.getGridRowMode(gx.fn.gridLvl(gx.csv.lastGrid), gx.csv.lastGrid);
				}
			}
			else if (this.isLvlParmOld(0, Name)) {
				gxMode = gx.O.Gx_mode;
			}
			if (gxMode == 'no_mode')
				return true;
			if ((gxMode == "UPD") || (gx.csv.validatingGrid == null)) {
				window[Name] = Value;
				return true;
			}
			return false;
		},

		isLvlParmOld: function (GridId, Name) {
			try {
				var oldLvl = gx.O.getOldLvl(Name);
				if (oldLvl >= 0) {
					if (GridId > 0) {
						var gridLvl = gx.fn.gridLvl(GridId);
						return (oldLvl < gridLvl);
					}
					return true;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'isLvlParmOld');
			}
			return false;
		},

		gridLvl: function (GridId) {
			try {
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					var _GXValidStruct = gx.fn.validStruct(ctrlIds[i]);
					if (_GXValidStruct != undefined && _GXValidStruct.lvl != undefined && _GXValidStruct.grid == GridId)
						return _GXValidStruct.lvl;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'gridLvl');
			}
			return 0;
		},

		lvlGrid: function (Lvl) {
			try {
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					var _GXValidStruct = gx.fn.validStruct(ctrlIds[i]);
					if (_GXValidStruct != undefined && _GXValidStruct.lvl == Lvl)
						return _GXValidStruct.grid;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'lvlGrid');
			}
			return 0;
		},

		vStructId: function (CtrlId) {
			try {
				var ctrlIds = gx.fn.controlIds();
				for (i = 0; i < ctrlIds.length; i++) {
					var validStruct = gx.fn.validStruct(ctrlIds[i]);
					if (validStruct != undefined && validStruct.fld == CtrlId)
						return ctrlIds[i];
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'vStructId');
			}
			return 0;
		},

		getVStruct: function (condFunc, allWCond) {
			try {
				var ret = null;
				if (allWCond) {
					ret = [];
				}
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					var vStruct = gx.fn.validStruct(ctrlIds[i]);
					if (vStruct != undefined && condFunc(vStruct)) {
						vStruct.id = ctrlIds[i];
						if (allWCond) {
							ret.push(vStruct);
						}
						else {
							return vStruct;
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'getVStruct');
			}
			return ret;
		},

		vStructForOld: function (GXVarName) {
			return gx.fn.getVStruct(function (vStruct) {
				return vStruct.gxold == GXVarName;
			});
		},

		vStructForVar: function (GXVarName) {
			return gx.fn.getVStruct(function (vStruct) {
				return vStruct.gxvar == GXVarName;
			});
		},

		vStructForVarWId: function (GXVarName, Id) {
			var vStructs = gx.fn.getVStruct(function (vStruct) {
				return vStruct.gxvar == GXVarName;
			}, true);
			var vStruct = vStructs[0];
			var len = vStructs.length;
			if (len > 1) {
				for (var i = 0; i < len; i++) {
					vStruct = vStructs[i];
					if (vStruct.id == Id) {
						break;
					}
				}
			}
			return vStruct;
		},

		vStructForHC: function (GXVarName) {
			return gx.fn.getVStruct(function (vStruct) {
				return vStruct.hc == GXVarName;
			});
		},

		firstCtrlAfterGrid: function (fromCtrl, gridId) {
			var lastCtrl = gx.fn.lastCtrlId();
			for (var i = fromCtrl; i < lastCtrl; i++) {
				var validStruct = gx.fn.validStruct(i);
				if (validStruct != undefined && validStruct.grid != gridId)
					return i;
			}
			return lastCtrl;
		},

		clearOldKeys: function () {
			gx.oldKeyValues = [];
		},

		oldKey: function (Fld) {
			try {
				return gx.oldKeyValues[Fld];
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'oldKey');
			}
			return '';
		},

		oldGridKey: function (Fld, GridId) {
			try {
				return gx.oldKeyValues[Fld + gx.fn.currentGridRow(GridId)];
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'oldGridKey');
			}
			return '';
		},

		setKey: function (Fld, Var) {
			if (Fld != null) {
				gx.oldKeyValues[Fld] = Var;
			}
		},

		unsetKey: function (Fld) {
			if (Fld != null) {
				gx.oldKeyValues[Fld] = undefined;
			}
		},

		setGridKey: function (Fld, GridId, Var) {
			if (Fld != null) {
				gx.oldKeyValues[Fld + gx.fn.currentGridRow(GridId)] = Var;
			}
		},

		unsetGridKey: function (Fld, GridId) {
			if (Fld != null) {
				gx.oldKeyValues[Fld + gx.fn.currentGridRow(GridId)] = undefined;
			}
		},

		removeGridRow: function (CurrentRow, GridId) {
			var IsRemoved = gx.fn.rowIsRemoved(GridId, CurrentRow);
			try {
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					var _GXValidStruct = gx.fn.validStruct(ctrlIds[i]);
					if (_GXValidStruct != undefined && _GXValidStruct.grid == GridId) {
						var Ctrl = gx.dom.el(_GXValidStruct.fld + "_" + CurrentRow);
						if (Ctrl != null) {
							Ctrl.gxdisabled = IsRemoved;
							Ctrl.disabled = IsRemoved;
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'removeGridRow');
			}
			gx.csv.validGridRow(GridId, CurrentRow);
		},

		controlIds: function () {
			return gx.O.getControlIds();
		},

		validStruct: function (Ctrl, gxO) {
			gxO = gxO || gx.O;
			return gxO.getValidStruct(Ctrl);
		},

		lastCtrlId: function (filterValidatable) {
			if (filterValidatable === true) {
				// Get the last validatable control
				var controlIds = this.controlIds();
				for (var i = controlIds.length - 1; i >= 0; i--) {
					var vStruct = this.validStruct(controlIds[i]);
					if (vStruct.v2v)
						return controlIds[i];
				}
			}
			else
				return gx.O.getLastControlId();
		},

		lastMainLevelCtrlId: function (CtrlId, GridId) {
			return (GridId == 0 && CtrlId == this.lastCtrlId(true));
		},

		vStructsArray: function () {
			return gx.O.GXValidFnc;
		},

		firstAcceptedControl: function (mindButtons) {
			try {
				var vStructs = gx.fn.vStructsArray();
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (var i = 0; i < len; i++) {
					var vStruct = vStructs[ctrlIds[i]];
					if (vStruct != null) {
						var control = gx.fn.getControlGridRef(vStruct.fld, vStruct.grid);
						if (control && gx.fn.isAccepted(control))
							if (mindButtons || (control.type != 'submit' && control.type != 'image' && control.type != 'button' && control.type != 'fieldset'))
								return control;
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'firstAcceptedControl');
			}
			return null;
		},

		enableDisableDelete: function () {
			var btnDelete = gx.dom.el(gx.csv.cmpCtx + "BTN_DELETE");
			if (btnDelete != null)
				gx.fn.setCtrlPropertyImpl(btnDelete, "Enabled", (gx.getVar("Gx_mode") == 'INS') ? 0 : 1);
		},

		setFocusAfterLoad: function (invalidateForm) {
			if (gx.csv.validating == true || !gx.lang.emptyObject(gx.csv.autoRefreshing))
				return;
			if (invalidateForm)
				gx.csv.invalidateForm();
			gx.csv.onloadFocus = true;
			if (!gx.lang.emptyObject(gx.usrFocusControl)) {
				gx.fn.setFocus(gx.dom.byId(gx.usrFocusControl));
				gx.O.fromValid = gx.csv.lastId;
				gx.usrFocusControl = '';
			}
			gx.csv.onloadFocus = false;
		},

		disableCtrl: function (ControlId) {
			var fn = function (ctrl) {
				try {
					var len = ctrl.length;
					for (var i = 0; i < len; i++)
						gx.fn.setCtrlPropertyImpl(ctrl[i], "Enabled", 0);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'disableCtrl');
				}
			};

			var Control = gx.fn.getControlRef_list(ControlId);
			if (Control == null)
				return;
			if (document.gxReadyState == 'complete')
				fn(Control);
			else
				gx.evt.on_ready(this, fn.closure(this, [Control]));
		},

		refreshGridRowBC: function (bcName, bcData) {
			try {
				var bc = gx.O.getGridBC(bcName);
				if (bc) {
					var boundGrid = gx.pO.getGridForColl(bc.gxvar);
					if (gx.csv.validatingGrid && boundGrid && gx.csv.validatingGrid.gridId == boundGrid.gridId) //Validating current grid
					{
						gx.fn.setGridHidden(bcName, bcData);
						bcData = bcData[parseInt(gx.fn.currentGridRow(boundGrid.gridId)) - 1]; //Gets only current row for updating
						gx.O.bcToScreen(bc, bcData);
						return true;
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'refreshGridRowBC');
			}
			return false;
		},

		refreshBC: function (bcName, bcData) {
			return this.refreshFormBC(bcName, bcData) || this.refreshGridRowBC(bcName, bcData);
		},

		refreshFormBC: function (bcName, bcData) {
			try {
				var bc = gx.O.getFormBC(bcName) || gx.O.getFormBCForVar(bcName);
				if (bc) {
					gx.setVar(bcName, bcData);
					gx.fn.setGridHidden(bcName, bcData);
					gx.O.bcToScreen(bc, bcData);
					return true;
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'refreshFormBC');
			}
			return false;
		},

		isHidden: function (HiddenName) {
			if (!gx.http.viewStateLoaded) {
				gx.http.loadState();
			}
			return (typeof (gx.http.viewState[HiddenName]) != 'undefined');
		},

		GX_HASH_PREFIX: 'gxhash_',

		getHash: function (cmpCtx,FldName) {
			return gx.fn.getHidden( cmpCtx + gx.fn.GX_HASH_PREFIX + FldName)
		},

		getHidden: function (HiddenName) {
			if (!gx.http.viewStateLoaded) {
				gx.http.loadState();
			}
			return gx.http.viewState[HiddenName];
		},

		setHidden: function (HiddenName, Value) {
			if (!gx.http.viewStateLoaded) {
				gx.http.loadState();
			}
			gx.http.viewState[HiddenName] = Value;
		},

		setGridHidden: function (HiddenName, Value) {
			var GridHiddenName = HiddenName;
			var GridId = gx.fn.oldGridId(HiddenName);
			if (GridId > 0) {
				GridHiddenName = HiddenName + '_' + gx.fn.currentGridRowImpl(GridId);
			}
			gx.fn.setHidden(GridHiddenName, Value);
		},

		deleteHidden: function (HiddenName) {
			if (gx.http.viewState)
				delete gx.http.viewState[HiddenName];
		},

		setJsonHiddens: function (gxHiddens, resolveCurrentRow) {
			resolveCurrentRow = (resolveCurrentRow === undefined) || resolveCurrentRow;
			for (var CtrlName in gxHiddens) {
				if (resolveCurrentRow)
					gx.fn.setGridHidden(CtrlName, gxHiddens[CtrlName]);
				else
					gx.fn.setHidden(CtrlName, gxHiddens[CtrlName]);
			}
		},

		filterHiddens: function (match, gxHiddens) {
			var hiddens = {};
			for (var h in gxHiddens) {
				if (h && h.search(match) == 0)
					hiddens[h] = gxHiddens[h];
			}
			return hiddens;
		},

		autoRefreshingControl: function (ControlId, cmpCtx) {
			return !gx.lang.emptyObject(gx.csv.autoRefreshing) && (gx.csv.lastControl != null && gx.csv.lastControl.id == (cmpCtx + ControlId));
		},

		setJsonValues: function (gxValuesArr) {
			if (!gxValuesArr)
				return [];
			var oldObj = gx.O,
				len = gxValuesArr.length,
				updatedUCs = [], row;
			for (var i = 0; i < len; i++) {
				var gxValues = gxValuesArr[i];
				var cmpCtx = gxValues.CmpContext;
				var isMPage = gx.lang.booleanValue(gxValues.IsMasterPage);						
				gx.setGxO(cmpCtx, isMPage);
				if (!gx.lang.emptyObject(gx.O)) {
					for (var Property in gxValues) {
						
						if (Property == 'CmpContext' || Property == 'IsMasterPage')
							continue;
						if (typeof (gxValues[Property]) == 'object') {
							if (gx.fn.refreshBC(Property, gxValues[Property]))
								continue;
						}
						if (typeof (gxValues[Property]) != "function") {
							var validStruct = gx.fn.vStructForVar(Property) || gx.O.getValidStructFld(Property);
							if (validStruct) {
								if (validStruct.v2v && !gx.fn.autoRefreshingControl(validStruct.fld, cmpCtx)) {
									row = undefined;
									if (validStruct.grid != 0 ) {
										row = gx.fn.controlRowId(gx.dom.el(Property));
									}
									validStruct.v2v(gxValues[Property]);
									validStruct.v2c(row);									
								}
							}
							else if (Property == "GX_FocusControl") {
								if ((oldObj.CmpContext == cmpCtx) && (oldObj.IsMasterPage == isMPage))
									gx.usrFocusControl = gxValues[Property];
							}
							else {
								var ctrlMap = gx.fn.getVarControlMap(Property);
								if (!gx.lang.emptyObject(ctrlMap))
									gx.setVar(ctrlMap, gxValues[Property]);
								else
									gx.setVar(Property, gxValues[Property]);
								gx.fn.setGridHidden(Property, gxValues[Property]);

								if (gx.O.UCBindings[Property]) {
									updatedUCs.concat(gx.O.UCBindings[Property].uc);
								}
							}
						}
					}
				}
			}
			gx.setGxO(oldObj);
			return updatedUCs;
		},

		getPropertyControlRef: function(Control, rowId) {
			var domCtrl = gx.fn.getControlRef(Control, true);
			domCtrl = (domCtrl == null) ? gx.dom.el("Object_" + Control) : domCtrl; //Blob field
			if (domCtrl == null) {
				domCtrl = gx.fn.screen_CtrlRef(gx.csv.ctxControlId(Control));
			}
			if (domCtrl == null && rowId) {
				domCtrl = gx.dom.el(Control + "_" + rowId);
			}
			return domCtrl;
		},

		setJsonProperties: function (gxPropertiesArr, rowId) {
			//Critical function, changes here impact performance
			if (!gxPropertiesArr)
				return [];
			var oldObj = gx.O,
				len = gxPropertiesArr.length,
				updatedUCs = [];
			for (var i = 0; i < len; i++) {
				var gxProperties = gxPropertiesArr[i],
					cmpCtx = gxProperties.CmpContext,
					isMPage = gx.lang.booleanValue(gxProperties.IsMasterPage),
					isWebComp = !!cmpCtx && !isMPage,
					gxO = gx.setGxO(cmpCtx, isMPage);
				if (!gx.lang.emptyObject(gx.O)) {
					for (var Control in gxProperties) {
						if (Control == 'CmpContext' || Control == 'IsMasterPage' || Control === '')
							continue;
						if (typeof (gxProperties[Control]) != "function") {
							var domCtrl = gx.fn.getPropertyControlRef(Control, rowId);
							if (domCtrl == null) {
								if (gx.uc.isUserControl(Control)) {
									gx.uc.setProperties(Control, gxProperties[Control]);
									updatedUCs.push(gx.uc.getUserControlObj(gx.uc.userControlContainerId(Control)));
								}
							}
							else {
								for (var Property in gxProperties[Control]) {
									if (!domCtrl.parentElement)
										domCtrl = gx.fn.getPropertyControlRef(Control, rowId);
									if (typeof (gxProperties[Control][Property]) == "object") {
										for (var InProperty in gxProperties[Control][Property]) {
											gx.fn.setCtrlPropertyImpl(domCtrl, InProperty, gxProperties[Control][Property][InProperty]);
										}
									}
									else {
										gx.fn.setCtrlPropertyImpl(domCtrl, Property, gxProperties[Control][Property]);
									}
								}
							}
						}
					}
				}
			}
			gx.setGxO(oldObj);
			return updatedUCs;
		},

		loadJsonGrids: function (PostGrids, isPostback) {
			if (PostGrids) {
				var len = PostGrids.length,
					grid;
				for (var i = 0; i < len; i++) {
					try {
						var gGridProps = PostGrids[i];
						if (gGridProps.Count != undefined) {
							var cmpCtx = gGridProps.CmpContext;
							var gridName = gGridProps.GridName;
							var vGrid = gx.csv.validatingGrid;
							if (gx.lang.emptyObject(vGrid) || ((vGrid.gxComponentContext != cmpCtx) && (vGrid.gridName != gridName))) {
								var inMasterPage = (gGridProps.InMasterPage == "true") ? true : false;
								grid = gx.fn.gridObj(cmpCtx, gridName, inMasterPage);
								if (grid) {
									if (isPostback) {
										grid.loadGrid(gGridProps, isPostback);
									}
									else {
										grid.updatePropsHidden(gGridProps);
									}
								}
							}
						}
					}
					catch (e) {
						gx.dbg.logEx(e, 'gxfrmutl.js', 'loadJsonGrids');
					}
				}
			}
		},

		getErrorViewerCtrls: function () {
			var gxErrorViewers = gx.dom.byName("gxErrorViewer");
			if (gxErrorViewers.length == 0) {
				gxErrorViewers = [];
				var spans = gx.dom.byTag("span");
				var len = spans.length;
				for (var i = 0; i < len; i++) {
					if (spans[i].name == "gxErrorViewer")
						gxErrorViewers.push(spans[i]);
				}
			}
			return gxErrorViewers;
		},

		setErrorViewer: function (Messages) {
			gx.O.AnyError = 0;
			if (!Messages)
				return;
			try {
				gx.fx.obs.notify('gx.onmessages', [Messages]);
				var errViewers = gx.dom.byClass('gx_ev', 'span');
				var vLen = errViewers.length;
				for (var cmpCtx in Messages) {
					var sourceFields;
					var locMessages = Messages[cmpCtx];
					if (!gx.lang.isArray(locMessages)) {
						sourceFields = locMessages.fields;
						locMessages = locMessages.msgs;
					}
					var sourceElements = [];
					if (sourceFields) {
						for (var i = 0, len = sourceFields.length; i < len; i++) {
							var vStruct = gx.fn.vStructForVar(sourceFields[i].replace(/^gx\.O\./, ""));
							if (vStruct) {
								sourceElements.push(vStruct.fld);
							}
						}
					}
					if (cmpCtx == 'MAIN') {
						cmpCtx = '';
					}
					if (typeof (locMessages) != 'undefined') {
						for (var i = 0; i < vLen; i++) {
							var errViewer = errViewers[i];
							if (errViewer && errViewer.id == (cmpCtx + 'gxErrorViewer')) {
								var html = gx.csv.setFocusOnload ? errViewer.innerHTML : '';
								break;
							}
						}						

						var balloons = {};
						for (var Property in locMessages) {
							var ObjMessage = locMessages[Property];
							if (ObjMessage && ObjMessage.type == 1) {
								gx.O.AnyError = 1;
							}
							if (!gx.lang.emptyObject(ObjMessage.text)) {
								if (typeof (ObjMessage) != "function") {
									if (ObjMessage.att != "" && gx.fn.isVisible(gx.fn.screen_CtrlRef(ObjMessage.att))) {
										var b = balloons[ObjMessage.att];
										if (!b) {
											b = gx.util.balloon.getNew(ObjMessage.att, undefined, sourceElements);
											balloons[ObjMessage.att] = b;
										}
										if (ObjMessage.type == 1)
											b.setError(ObjMessage.text);
										else
											b.setMessage(ObjMessage.text);
									}
									else {
										var className = (ObjMessage.type == 1) ? "gx-error-message" : "gx-warning-message";
										html += '<div class="' + className + '">' + gx.html.encode(ObjMessage.text) + '</div>';

									}
								}
							}
						}
						for (var att in balloons) {
							var b = balloons[att];
							if (b.show() == false) {
								gx.fn.setFocusOnError(att);
								break;
							}
						}
						for (var i = 0; i < vLen; i++) {
							var errViewer = errViewers[i];
							if (errViewer && errViewer.id == (cmpCtx + 'gxErrorViewer')) {
								if (errViewer.innerHTML != html) {
									if (gx.dom.shouldPurge())
										gx.dom.purge(errViewer, true);
									errViewer.innerHTML = html;
									if (html != '') {
										var ef = gx.fx.dom.highlight(errViewer, [255, 255, 165], 2500);
										ef.play();
									}
								}
							}
						}
					}
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setErrorViewer');
			}
		},

		cmpContextFromCtrl: function (CtrlName) {
			var cmpRegex = CMP_CTRL_REGEX,
				cmpType = cmpRegex.exec(CtrlName);
			if (cmpType) {
				return cmpType[1] + cmpType[2];
			}
			return CtrlName;
		},

		clearCompontHiddens: function (gxComponents) {
			for (var Component in gxComponents) {
				if (typeof (gxComponents[Component]) != "function") {
					try {
							var cmpType = gx.fn.cmpContextFromCtrl(Component);
							gx.O.deleteComponentHiddens(cmpType);
						}
						catch (e) {
							except = true;
							gx.dbg.logEx(e, 'gxfrmutl.js', 'clearCompontHiddens');
						}
				}
			}
		},
		
		setJsonComponents: function (gxComponents, gxComponentsMap, gxHiddens, callback, isPostback) {
			try {
				var toCreate = [];
				var except = false;
				var isDotNet = gx.gen.isDotNet();
				var newComponents = [];
				for (var Component in gxComponents) {
					if (!gx.pO.getWebComponent(Component)) {
						newComponents.push(Component);
					}
					if (typeof (gxComponents[Component]) != "function") {
						try {
							var cmpHtml = gxComponents[Component];
							if (cmpHtml) {
								var Cmp = gx.dom.el(Component);
								if (!Cmp && gxComponentsMap) {
									Cmp = gx.dom.el(gxComponentsMap[Component]);
								}
								if (!gx.lang.emptyObject(Cmp)) {
									gx.html.setInnerHtml(Cmp, cmpHtml, false, isPostback);
									var cmpType = gx.fn.cmpContextFromCtrl(Component);
									var cmpName = cleanComponentName(gx.fn.getHidden(cmpType + '_CMPPGM'));
									toCreate.push({ type: cmpType, name: cmpName, html: cmpHtml, container: Cmp });
								}
							}
						}
						catch (e) {
							except = true;
							gx.dbg.logEx(e, 'gxfrmutl.js', 'setJsonComponents');
						}
					}
				}
			}
			catch (e) {
				except = true;
				gx.dbg.logEx(e, 'gxfrmutl.js', 'setJsonComponents');
			}
			if ((toCreate.length == 0 || except) && typeof (callback) == 'function') {
				callback(newComponents);
			}
			else {
				var component = null;
				var nextCmp = function () {
					if (toCreate.length > 0) {
						component = toCreate.shift();
						gx.fn.createComponentAsync(component, gxHiddens, nextCmp);
					}
					else if (typeof (callback) == 'function') {
						callback(newComponents);
					}
				};
				component = toCreate.shift();
				gx.fn.createComponentAsync(component, gxHiddens, nextCmp);
			}
		},

		createComponentAsync: function (cmp, hiddens, callback) {
			var cmpType = cmp.type;
			var cmpName = cmp.name;
			var cmpHtml = cmp.html;
			var cmpContainer = cmp.container;

			function handleCallback () {
				if (typeof (callback) == 'function') {
					callback();
					gx.fx.obs.notify('gx.onafterevent', [gx.csv.lastEvtResponse]);
				}
			};

			try {
				var cmpHiddens = gx.fn.filterHiddens(new RegExp("^" + cmpType), hiddens);
				if (!gx.cache.codeLoaded(cmpType + cmpName)) {
					gx.cache.addInlineCode(cmpType + cmpName);
					gx.html.processCode(cmpHtml, false, function (cName, cType, cHiddens) {
						gx.fn.createComponentObj(cName, cType, cmpContainer);
						gx.fn.setJsonHiddens(cHiddens);
						handleCallback()
					}, [cmpName, cmpType, cmpHiddens], cmpName);
				}
				else {
					gx.fn.createComponentObj(cmpName, cmpType, cmpContainer);
					gx.fn.setJsonHiddens(cmpHiddens);
					handleCallback();
				}
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'createComponentAsync');
				handleCallback();
			}
		},

		createComponentObj: function (cmpName, cmpType, cmpContainer) {
			var gxComp = gx.createComponent(cmpName, cmpType, cmpContainer);
			if (gxComp != null) {
				gx.addComponent(gxComp);
			}
		},

		cleanAttachedCtrls: function (gxObject) {
			gx.attachedControls = [];
		},

		getAttachedCtrl: function (ControlId) {
			var len = gx.attachedControls.length;
			for (var j = 0; j < len; j++) {
				var aCtrl = gx.attachedControls[j];
				if (aCtrl.id == ControlId)
					return aCtrl;
			}
			return null;
		},

		attachCtrl: function (ControlId, CtrlInfo) {
			var ctrl = gx.fn.getAttachedCtrl(ControlId);
			if (ctrl == null)
				gx.attachedControls.push({ id: ControlId, info: CtrlInfo });
		},

		doAttachs: function () {
			var attachedControls = gx.fn.attachedControls();
			var len = attachedControls.length;
			var gxO = gx.O;
			for (var j = 0; j < len; j++) {
				var aCtrl = attachedControls[j];
				gx.setGxO(aCtrl.info.wc, aCtrl.info.mp);
				if (aCtrl.info.isPrompt && gx.O.isTransaction() && gx.O.Gx_mode == 'DSP') {
					gx.fn.setCtrlPropertyImpl(gx.dom.el(aCtrl.info.wc + aCtrl.id), 'Visible', false);
				}
				else {
					var ArrCtrl = aCtrl.info.controls;
					var len1 = ArrCtrl.length;
					for (var i = 0; i < len1; i++) {
						gx.fn.addAttach(ArrCtrl[i], aCtrl);
						var validStruct = gx.fn.validStruct(ArrCtrl[i]);
						gx.fn.checkAttachedPropertyVS(validStruct, "Visible", false);
						gx.fn.checkAttachedPropertyVS(validStruct, "Enabled", false);
					}
				}
			}
			gx.setGxO(gxO);
		},

		addAttach: function (i, ref) {
			var validStruct = gx.fn.validStruct(i);
			if (validStruct.attachedCtrls == undefined)
				validStruct.attachedCtrls = [];
			validStruct.attachedCtrls.push(ref);
		},

		checkAttachedProperty: function (FieldId, Property, Enable) {
			gx.fn.checkAttachedPropertyVS(gx.O.getValidStructFld(FieldId), Property, Enable);
		},

		checkAttachedPropertyVS: function (validStruct, Property, Enable) {
			if (validStruct == undefined)
				return;
			var attachedCtrls = validStruct.attachedCtrls;
			if (attachedCtrls == undefined)
				return;
			var len = attachedCtrls.length;
			for (var i = 0; i < len; i++)
				gx.fn.checkAttachedControlProperty(attachedCtrls[i], Property, Enable)
		},

		checkAttachedControlProperty: function (attachedCtrls, Property, Enable) {
			var ControlId = attachedCtrls.id;
			attachedCtrls = attachedCtrls.info;
			var ok = false;
			var ArrCtrl = attachedCtrls.controls;
			var WC = attachedCtrls.wc;
			var len = ArrCtrl.length;
			for (var i = 0; i < len && !ok; i++) {
				if (gx.fn.getCtrlProperty_impl(gx.dom.el(WC + gx.fn.validStruct(ArrCtrl[i]).fld), Property) == Enable) {
					ok = ((Enable == true) || (i == len - 1));
				}
			}
			if (ok) {
				var propName = (attachedCtrls.isPrompt) ? "Visible" : Property;
				gx.fn.setCtrlPropertyImpl(gx.dom.el(WC + ControlId), propName, Enable);
			}
		},

		changeControlOpacity: function (Control, OpacStart, OpacEnd, Milliseconds) {
			var fadeSpeed = Math.round(Milliseconds);
			var controlId = "";
			if (typeof (Control) == 'string')
				controlId = Control;
			else
				controlId = Control.id;
			if (OpacStart > OpacEnd) {
				gx.fn.setOpacity(OpacStart, controlId);
				setTimeout(function () {
					gx.fn.changeControlOpacity(Control, OpacStart - 10, OpacEnd, Milliseconds);
				}, fadeSpeed);
			}
			else if (OpacStart < OpacEnd) {
				gx.fn.setOpacity(OpacStart, controlId);
				setTimeout(function () {
					gx.fn.changeControlOpacity(Control, OpacStart + 10, OpacEnd, Milliseconds);
				}, fadeSpeed);
			}
			else {
				gx.fn.setOpacity(OpacEnd, controlId);
			}
		},

		setOpacity: function (Opacity, ControlId) {
			var control = ControlId;
			if (typeof (ControlId) == "string") {
				if (ControlId == "body")
					control = document.body;
				else
					control = gx.dom.el(ControlId);
			}
			if (control != null) {
				var styleObj = control.style,
					opacityValue = (Opacity == "reset" ? "" : Opacity / 100);
				styleObj.opacity = opacityValue;
				styleObj.MozOpacity = opacityValue;
				styleObj.filter = "alpha(opacity=" + (Opacity == "reset" ? 100 : Opacity) + ")";
			}
		},

		fadeControl: function (Control, Direction, Milliseconds) {
			if (Direction == "in")
				gx.fn.changeControlOpacity(Control, 0, 100, Milliseconds);
			else
				gx.fn.changeControlOpacity(Control, 100, 0, Milliseconds);
		},

		fadeIn: function (Control, Milliseconds) {
			gx.fn.fadeControl(Control, "in", Milliseconds);
		},

		statusMsg: function (Txt) {
			window.status = Txt;
		},

		objectOnload: function (loadGrids) {
			if (gx.pO != null) {
				gx.pO.onload(loadGrids);
				gx.setGxO(gx.pO);
			}
		},

		objectOnUnload: function (unloadMasterPage) {
			if (gx.pO != null) {
				gx.pO.onunload(unloadMasterPage);
			}
		},

		objectOnpost: function () {
			if (gx.pO != null) {
				gx.pO.onpost();
			}
		},

		objectPostback: function (userControls) {
			if (gx.pO != null) {
				gx.pO.postbackLoad(userControls);
			}
		},

		gridObjFromGxO: function (GridName) {
			return gx.fn.gridObj(gx.O.CmpContext, GridName, gx.O.IsMasterPage);
		},

		gridObj: function (CmpCtx, GridName, InMasterPage) {
			var obj = gx.getObj(CmpCtx, InMasterPage);
			return obj ? obj.getGrid(GridName) : null;			
		},

		installComponents: function (replace) {
			var cmpObjs = gx.fn.getHidden("GX_CMP_OBJS");
			if (cmpObjs != undefined) {
				var isDotNet = gx.gen.isDotNet();
				for (var cmpCtx in cmpObjs) {
					if (replace || !gx.pO.getWebComponent(cmpCtx)) {
						var cmpType = cleanComponentName(cmpObjs[cmpCtx].toLowerCase());
						var gxComp = gx.createComponent(cmpType, cmpCtx);
						if (gxComp != null) {
							gx.addComponent(gxComp);
							setTimeout((function (cmp) {
								this.addComponentRemoteFiles(cmp);
							}).closure(this, [gxComp]), 1);
						}
					}
				}
			}
		},

		addComponentRemoteFiles: function (gxComp) {
			var cmpCtrl = gxComp.getContainer();
			if (cmpCtrl) {
				gx.html.processCode(cmpCtrl.innerHTML, true);
				gx.dom.fitToParent(cmpCtrl);
			}
		},

		datePickerFormat: function (Picture, Dec, Len) {
			var dateFmt = gx.dateFormat;
			var D1 = dateFmt.substr(0, 1);
			var D2 = dateFmt.substr(1, 1);
			var D3 = dateFmt.substr(2, 1);

			var DD1 = gx.fn.datePickerDateFormat(D1, Picture);
			var DD2 = gx.fn.datePickerDateFormat(D2, Picture);
			var DD3 = gx.fn.datePickerDateFormat(D3, Picture);
			var DT = gx.fn.datePickerTimeFormat(Dec);
			if (Len > 0 && Dec > 0)
				return DD1 + '/' + DD2 + '/' + DD3 + ' ' + DT;
			else if (Len > 0)
				return DD1 + '/' + DD2 + '/' + DD3;
			else
				return DT;
		},

		datePickerDateFormat: function (FormatPart, Picture) {
			if (FormatPart == 'Y' && Picture.substr(0, 10) == '99/99/9999')
				return '%Y';
			else if (FormatPart == 'Y')
				return '%y';
			else if (FormatPart == 'M')
				return '%m';
			else if (FormatPart == 'D')
				return '%d';
			else return '';
		},

		datePickerTimeFormat: function (Dec) {
			var timeFmt = gx.timeFormat;
			var DPTF, AMPM, TimeFmt;
			if (timeFmt == 12) {
				DPTF = '%I';
				AMPM = ' %p';
			} else if (timeFmt == 24) {
				DPTF = '%H';
				AMPM = '';
			} else {
				DPTF = '';
				AMPM = '';
			}
			if (Dec == 2)
				TimeFmt = '';
			else if (Dec == 5)
				TimeFmt = ':%M';
			else if (Dec == 8)
				TimeFmt = ':%M:%S';
			else
				return '';

			return DPTF + TimeFmt + AMPM;
		},

		installDatePicker: function (ControlId, Flat, ShowsTime, WeekNumbers, MondayFirst, Format) {
			gx.html.onTypeAvailable('Calendar', gx.fn.installDatePickerIfReady, [ControlId, Flat, ShowsTime, WeekNumbers, MondayFirst, Format]);
		},

		installDatePickerIfReady: function (ControlId, Flat, ShowsTime, WeekNumbers, MondayFirst, Format) {
			var dpCtrl = gx.dom.el(ControlId);
			if (!gx.lang.emptyObject(dpCtrl) && dpCtrl.nodeName == 'SELECT')
				return;
			if (Flat == 0) {
				var triggerId = ControlId  + "_dp_trigger",
					trigger = gx.dom.el(triggerId),
					triggerStyle = gx.dom.getComputedStyle(trigger),
					dpCtrlStyle = gx.dom.getComputedStyle(dpCtrl);
				if ((trigger && dpCtrlStyle['display'] != 'none' && dpCtrlStyle['visibility'] != 'hidden' && (triggerStyle['display'] == 'none' || triggerStyle['visibility'] == 'hidden')) || !trigger) {
					triggerId = ControlId;
				}
				var parentNode = $(dpCtrl).parents('.dp_container')[0];
				var displayRight = false;
				Calendar.setup({ inputField: ControlId, parentNode: parentNode, showsTime: ShowsTime, weekNumbers: WeekNumbers, mondayFirst: MondayFirst, ifFormat: Format, button: triggerId, onSelect: gx.fn.datePickerChanged, align: "Bl", singleClick: true, displayRight: displayRight });
			}
			else {
				if (!gx.lang.emptyObject(dpCtrl))
					dpCtrl.style.display = 'none';
				Calendar.setup({ inputField: ControlId, showsTime: ShowsTime, weekNumbers: WeekNumbers, mondayFirst: MondayFirst, ifFormat: Format, flat: ControlId + "_dp_container", flatCallback: gx.fn.datePickerChanged, align: "Bl", singleClick: true });
			}
		},

		datePickerChanged: function (calendar, date, control) {
			if (calendar && calendar.dateClicked) {
				if (!control)
					control = calendar.params.inputField;
				var currentObject = gx.O;
				var validStruct = null;
				var ctrlIds = gx.fn.controlIds();
				var len = ctrlIds.length;
				for (i = 0; i < len; i++) {
					validStruct = gx.fn.validStruct(ctrlIds[i]);
					var sRow = (validStruct.grid != 0) ? '_' + gx.fn.currentGridRow(validStruct.grid) : '';
					var controlId = currentObject.CmpContext + validStruct.fld + sRow;
					if (control.id == controlId)
						break;
				}
				if ((validStruct != null) && (validStruct.dp != undefined)) {
					var newValue = calendar.dateIsEmpty ? gx.date.nulldate_toc(validStruct.len, validStruct.dec) : calendar.date.print(gx.fn.datePickerFormat(validStruct.dp.pic, validStruct.dp.dec, validStruct.len));
					if (newValue != control.value) {
						control.setAttribute("gxvalid", "0");
						control.value = newValue;
						control.onchange();
						calendar.callCloseHandler();
						if (validStruct.grid > 0) {
							gx.fn.getGridObj(validStruct.grid).setRowModified(gx.fn.currentGridRow(validStruct.grid));
						}
						currentObject.refreshDependantGrids(validStruct);
					}
				}
			}
		},

		toArray: function (obj) {
			if (gx.util.browser.isIE() && gx.util.browser.ieVersion() <= 8)
			{
				var array = [];
				for (var i = 0, len= obj.length; i < len; i++) {
					array[i] = obj[i];
				}
				return array;
			}
			return Array.prototype.slice.call(obj);
		}
	};
})(gx.$);

gx.thread = {
	Map: function () {
		this.map = {};

		this.add = function (k, o) {
			this.map[k] = o;
		}

		this.remove = function (k) {
			delete this.map[k];
		}

		this.get = function (k) {
			return k == null ? null : this.map[k];
		}

		this.first = function () {
			return this.get(this.nextKey());
		}

		this.next = function (k) {
			return this.get(this.nextKey(k));
		}

		this.nextKey = function (k) {
			for (i in this.map) {
				if (!k) {
					return i;
				}
				if (k == i) {
					k = null;
				}
			}
			return null;
		}
	},

	Command: function (obj, func, args) {
		if (!gx.thread.Command.LastID) {
			gx.thread.Command.LastID = 0;
		}

		this.id = ++gx.thread.Command.LastID;

		this.execute = function () {
			func.apply(obj, args);
		}

		this.syncExecute = function () {
			new gx.thread.Mutex(this, 'execute');
		}
	},

	Mutex: function (obj, func, args, callback) {
		if (!gx.thread.Mutex.Wait) {
			gx.thread.Mutex.Wait = new gx.thread.Map();
		}

		gx.thread.Mutex.SLICE = function (cmdID, startID) {
			gx.thread.Mutex.Wait.get(cmdID).attempt(gx.thread.Mutex.Wait.get(startID));
		}

		this.attempt = function (start) {
			for (var j = start; j; j = gx.thread.Mutex.Wait.next(j.c.id)) {
				if (j.enter || (j.number && (j.number < this.number || (j.number == this.number && j.c.id < this.c.id))))
					return setTimeout('gx.thread.Mutex.SLICE(' + this.c.id + ',' + j.c.id + ')', 10);
			}
			try {
				retVal = this.c.execute();
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxfrmutl.js', 'Mutex Call');
			}
			this.number = 0;
			gx.thread.Mutex.Wait.remove(this.c.id);
			if (typeof (callback) == 'function') {
				try {
					callback.call(obj, retVal);
				}
				catch (e) {
					gx.dbg.logEx(e, 'gxfrmutl.js', 'Mutex CallBack');
				}
			}
		}

		this.c = new gx.thread.Command(obj, func, args);
		gx.thread.Mutex.Wait.add(this.c.id, this);
		this.enter = true;
		this.number = (new Date()).getTime();
		this.enter = false;
		this.attempt(gx.thread.Mutex.Wait.first());
	}
};

gx.sec = {
	key: null,
	keyName: 'GX_AJAX_KEY',
	secToken: null,
	secTokenName: 'AJAX_SECURITY_TOKEN',

	loadKey: function () {
		var k = gx.fn.getHidden(this.keyName);
		if (gx.lang.emptyObject(k))
			this.key = null;
		else
			this.key = k;
		if (this.key != null) {
			this.loadSecToken();
		}
	},

	loadSecToken: function () {
		var t = gx.fn.getHidden(this.secTokenName);
		if (gx.lang.emptyObject(t))
			this.secToken = null;
		else
			this.secToken = t;
	},

	encrypt: function (Value, Key) {
		try {
			Key = (Key == null) ? this.key : Key;
			if (Key != null) {
				var alg = this.rijndael;
				Key = alg.hexToByteArray(Key);
				var encrypted = alg.rijndaelEncrypt(Value, Key);
				var encoded = alg.byteArrayToHex(encrypted);
				return encoded;
			}
		}
		catch (e) {
			gx.dbg.logEx(e, 'gxfrmutl.js', 'encrypt');
		}
		return Value;
	},

	decrypt: function (Value, Key) {
		try {
			Key = (Key == null) ? this.key : Key;
			if (Key != null) {
				var alg = this.rijndael;
				Key = alg.hexToByteArray(Key);
				var decoded = alg.hexToByteArray(Value);
				var decrypted = alg.rijndaelDecrypt(decoded, Key);
				return alg.byteArrayToString(decrypted);
			}
		}
		catch (e) {
			gx.dbg.logEx(e, 'gxfrmutl.js', 'decrypt');
		}
		return Value;
	},

	_init: function () {
		this.rijndael._init();
	}
};

gx.MD5 = {
	RotateLeft: function (lValue, iShiftBits) {
		return (lValue << iShiftBits) | (lValue >>> (32 - iShiftBits));
	},

	AddUnsigned: function (lX, lY) {
		var lX4, lY4, lX8, lY8, lResult;
		lX8 = (lX & 0x80000000);
		lY8 = (lY & 0x80000000);
		lX4 = (lX & 0x40000000);
		lY4 = (lY & 0x40000000);
		lResult = (lX & 0x3FFFFFFF) + (lY & 0x3FFFFFFF);
		if (lX4 & lY4) {
			return (lResult ^ 0x80000000 ^ lX8 ^ lY8);
		}
		if (lX4 | lY4) {
			if (lResult & 0x40000000) {
				return (lResult ^ 0xC0000000 ^ lX8 ^ lY8);
			} else {
				return (lResult ^ 0x40000000 ^ lX8 ^ lY8);
			}
		} else {
			return (lResult ^ lX8 ^ lY8);
		}
	},

	F: function (x, y, z) { return (x & y) | ((~x) & z); },
	G: function (x, y, z) { return (x & z) | (y & (~z)); },
	H: function (x, y, z) { return (x ^ y ^ z); },
	I: function (x, y, z) { return (y ^ (x | (~z))); },

	FF: function (a, b, c, d, x, s, ac) {
		a = gx.MD5.AddUnsigned(a, gx.MD5.AddUnsigned(gx.MD5.AddUnsigned(gx.MD5.F(b, c, d), x), ac));
		return gx.MD5.AddUnsigned(gx.MD5.RotateLeft(a, s), b);
	},

	GG: function (a, b, c, d, x, s, ac) {
		a = gx.MD5.AddUnsigned(a, gx.MD5.AddUnsigned(gx.MD5.AddUnsigned(gx.MD5.G(b, c, d), x), ac));
		return gx.MD5.AddUnsigned(gx.MD5.RotateLeft(a, s), b);
	},

	HH: function (a, b, c, d, x, s, ac) {
		a = gx.MD5.AddUnsigned(a, gx.MD5.AddUnsigned(gx.MD5.AddUnsigned(gx.MD5.H(b, c, d), x), ac));
		return gx.MD5.AddUnsigned(gx.MD5.RotateLeft(a, s), b);
	},

	II: function (a, b, c, d, x, s, ac) {
		a = gx.MD5.AddUnsigned(a, gx.MD5.AddUnsigned(gx.MD5.AddUnsigned(gx.MD5.I(b, c, d), x), ac));
		return gx.MD5.AddUnsigned(gx.MD5.RotateLeft(a, s), b);
	},

	ConvertToWordArray: function (string) {
		var lWordCount;
		var lMessageLength = string.length;
		var lNumberOfWords_temp1 = lMessageLength + 8;
		var lNumberOfWords_temp2 = (lNumberOfWords_temp1 - (lNumberOfWords_temp1 % 64)) / 64;
		var lNumberOfWords = (lNumberOfWords_temp2 + 1) * 16;
		var lWordArray = Array(lNumberOfWords - 1);
		var lBytePosition = 0;
		var lByteCount = 0;
		while (lByteCount < lMessageLength) {
			lWordCount = (lByteCount - (lByteCount % 4)) / 4;
			lBytePosition = (lByteCount % 4) * 8;
			lWordArray[lWordCount] = (lWordArray[lWordCount] | (string.charCodeAt(lByteCount) << lBytePosition));
			lByteCount++;
		}
		lWordCount = (lByteCount - (lByteCount % 4)) / 4;
		lBytePosition = (lByteCount % 4) * 8;
		lWordArray[lWordCount] = lWordArray[lWordCount] | (0x80 << lBytePosition);
		lWordArray[lNumberOfWords - 2] = lMessageLength << 3;
		lWordArray[lNumberOfWords - 1] = lMessageLength >>> 29;
		return lWordArray;
	},

	WordToHex: function (lValue) {
		var WordToHexValue = "", WordToHexValue_temp = "", lByte, lCount;
		for (lCount = 0; lCount <= 3; lCount++) {
			lByte = (lValue >>> (lCount * 8)) & 255;
			WordToHexValue_temp = "0" + lByte.toString(16);
			WordToHexValue = WordToHexValue + WordToHexValue_temp.substr(WordToHexValue_temp.length - 2, 2);
		}
		return WordToHexValue;
	},

	Utf8Encode: function (string) {
		string = string.replace(/\r\n/g, "\n");
		var utftext = "";

		for (var n = 0; n < string.length; n++) {

			var c = string.charCodeAt(n);

			if (c < 128) {
				utftext += String.fromCharCode(c);
			}
			else if ((c > 127) && (c < 2048)) {
				utftext += String.fromCharCode((c >> 6) | 192);
				utftext += String.fromCharCode((c & 63) | 128);
			}
			else {
				utftext += String.fromCharCode((c >> 12) | 224);
				utftext += String.fromCharCode(((c >> 6) & 63) | 128);
				utftext += String.fromCharCode((c & 63) | 128);
			}
		}
		return utftext;
	},
	getHsh: function (string) {
		var x = Array();
		var k, AA, BB, CC, DD, a, b, c, d;
		var S11 = 7, S12 = 12, S13 = 17, S14 = 22;
		var S21 = 5, S22 = 9, S23 = 14, S24 = 20;
		var S31 = 4, S32 = 11, S33 = 16, S34 = 23;
		var S41 = 6, S42 = 10, S43 = 15, S44 = 21;

		string = gx.MD5.Utf8Encode(string);

		x = gx.MD5.ConvertToWordArray(string);

		a = 0x67452301; b = 0xEFCDAB89; c = 0x98BADCFE; d = 0x10325476;

		for (k = 0; k < x.length; k += 16) {
			AA = a; BB = b; CC = c; DD = d;
			a = gx.MD5.FF(a, b, c, d, x[k + 0], S11, 0xD76AA478);
			d = gx.MD5.FF(d, a, b, c, x[k + 1], S12, 0xE8C7B756);
			c = gx.MD5.FF(c, d, a, b, x[k + 2], S13, 0x242070DB);
			b = gx.MD5.FF(b, c, d, a, x[k + 3], S14, 0xC1BDCEEE);
			a = gx.MD5.FF(a, b, c, d, x[k + 4], S11, 0xF57C0FAF);
			d = gx.MD5.FF(d, a, b, c, x[k + 5], S12, 0x4787C62A);
			c = gx.MD5.FF(c, d, a, b, x[k + 6], S13, 0xA8304613);
			b = gx.MD5.FF(b, c, d, a, x[k + 7], S14, 0xFD469501);
			a = gx.MD5.FF(a, b, c, d, x[k + 8], S11, 0x698098D8);
			d = gx.MD5.FF(d, a, b, c, x[k + 9], S12, 0x8B44F7AF);
			c = gx.MD5.FF(c, d, a, b, x[k + 10], S13, 0xFFFF5BB1);
			b = gx.MD5.FF(b, c, d, a, x[k + 11], S14, 0x895CD7BE);
			a = gx.MD5.FF(a, b, c, d, x[k + 12], S11, 0x6B901122);
			d = gx.MD5.FF(d, a, b, c, x[k + 13], S12, 0xFD987193);
			c = gx.MD5.FF(c, d, a, b, x[k + 14], S13, 0xA679438E);
			b = gx.MD5.FF(b, c, d, a, x[k + 15], S14, 0x49B40821);
			a = gx.MD5.GG(a, b, c, d, x[k + 1], S21, 0xF61E2562);
			d = gx.MD5.GG(d, a, b, c, x[k + 6], S22, 0xC040B340);
			c = gx.MD5.GG(c, d, a, b, x[k + 11], S23, 0x265E5A51);
			b = gx.MD5.GG(b, c, d, a, x[k + 0], S24, 0xE9B6C7AA);
			a = gx.MD5.GG(a, b, c, d, x[k + 5], S21, 0xD62F105D);
			d = gx.MD5.GG(d, a, b, c, x[k + 10], S22, 0x2441453);
			c = gx.MD5.GG(c, d, a, b, x[k + 15], S23, 0xD8A1E681);
			b = gx.MD5.GG(b, c, d, a, x[k + 4], S24, 0xE7D3FBC8);
			a = gx.MD5.GG(a, b, c, d, x[k + 9], S21, 0x21E1CDE6);
			d = gx.MD5.GG(d, a, b, c, x[k + 14], S22, 0xC33707D6);
			c = gx.MD5.GG(c, d, a, b, x[k + 3], S23, 0xF4D50D87);
			b = gx.MD5.GG(b, c, d, a, x[k + 8], S24, 0x455A14ED);
			a = gx.MD5.GG(a, b, c, d, x[k + 13], S21, 0xA9E3E905);
			d = gx.MD5.GG(d, a, b, c, x[k + 2], S22, 0xFCEFA3F8);
			c = gx.MD5.GG(c, d, a, b, x[k + 7], S23, 0x676F02D9);
			b = gx.MD5.GG(b, c, d, a, x[k + 12], S24, 0x8D2A4C8A);
			a = gx.MD5.HH(a, b, c, d, x[k + 5], S31, 0xFFFA3942);
			d = gx.MD5.HH(d, a, b, c, x[k + 8], S32, 0x8771F681);
			c = gx.MD5.HH(c, d, a, b, x[k + 11], S33, 0x6D9D6122);
			b = gx.MD5.HH(b, c, d, a, x[k + 14], S34, 0xFDE5380C);
			a = gx.MD5.HH(a, b, c, d, x[k + 1], S31, 0xA4BEEA44);
			d = gx.MD5.HH(d, a, b, c, x[k + 4], S32, 0x4BDECFA9);
			c = gx.MD5.HH(c, d, a, b, x[k + 7], S33, 0xF6BB4B60);
			b = gx.MD5.HH(b, c, d, a, x[k + 10], S34, 0xBEBFBC70);
			a = gx.MD5.HH(a, b, c, d, x[k + 13], S31, 0x289B7EC6);
			d = gx.MD5.HH(d, a, b, c, x[k + 0], S32, 0xEAA127FA);
			c = gx.MD5.HH(c, d, a, b, x[k + 3], S33, 0xD4EF3085);
			b = gx.MD5.HH(b, c, d, a, x[k + 6], S34, 0x4881D05);
			a = gx.MD5.HH(a, b, c, d, x[k + 9], S31, 0xD9D4D039);
			d = gx.MD5.HH(d, a, b, c, x[k + 12], S32, 0xE6DB99E5);
			c = gx.MD5.HH(c, d, a, b, x[k + 15], S33, 0x1FA27CF8);
			b = gx.MD5.HH(b, c, d, a, x[k + 2], S34, 0xC4AC5665);
			a = gx.MD5.II(a, b, c, d, x[k + 0], S41, 0xF4292244);
			d = gx.MD5.II(d, a, b, c, x[k + 7], S42, 0x432AFF97);
			c = gx.MD5.II(c, d, a, b, x[k + 14], S43, 0xAB9423A7);
			b = gx.MD5.II(b, c, d, a, x[k + 5], S44, 0xFC93A039);
			a = gx.MD5.II(a, b, c, d, x[k + 12], S41, 0x655B59C3);
			d = gx.MD5.II(d, a, b, c, x[k + 3], S42, 0x8F0CCC92);
			c = gx.MD5.II(c, d, a, b, x[k + 10], S43, 0xFFEFF47D);
			b = gx.MD5.II(b, c, d, a, x[k + 1], S44, 0x85845DD1);
			a = gx.MD5.II(a, b, c, d, x[k + 8], S41, 0x6FA87E4F);
			d = gx.MD5.II(d, a, b, c, x[k + 15], S42, 0xFE2CE6E0);
			c = gx.MD5.II(c, d, a, b, x[k + 6], S43, 0xA3014314);
			b = gx.MD5.II(b, c, d, a, x[k + 13], S44, 0x4E0811A1);
			a = gx.MD5.II(a, b, c, d, x[k + 4], S41, 0xF7537E82);
			d = gx.MD5.II(d, a, b, c, x[k + 11], S42, 0xBD3AF235);
			c = gx.MD5.II(c, d, a, b, x[k + 2], S43, 0x2AD7D2BB);
			b = gx.MD5.II(b, c, d, a, x[k + 9], S44, 0xEB86D391);
			a = gx.MD5.AddUnsigned(a, AA);
			b = gx.MD5.AddUnsigned(b, BB);
			c = gx.MD5.AddUnsigned(c, CC);
			d = gx.MD5.AddUnsigned(d, DD);
		}
		var temp = gx.MD5.WordToHex(a) + gx.MD5.WordToHex(b) + gx.MD5.WordToHex(c) + gx.MD5.WordToHex(d);
		return temp.toLowerCase();
	}
};

gx.base64 = {
	b64: [],
	f64: [],

	decode: function (encStr) {
		return this.bytesToString(this.bytesFromUTF8Bytes(this.decodeImpl(encStr)));
	},

	encode: function (decStr) {
		return this.encodeImpl(this.UTF8BytesFromString(decStr));
	},

	bytesFromUTF8Bytes: function (Arr) {
		var outArr = [];
		var i = 0;
		var c = c1 = c2 = 0;
		var len = Arr.length;
		while (i < len) {
			c = Arr[i];
			if (c < 128) {
				outArr.push(c);
				i++;
			}
			else if ((c > 191) && (c < 224)) {
				c2 = Arr[i + 1];
				outArr.push(((c & 31) << 6) | (c2 & 63));
				i += 2;
			}
			else {
				c2 = Arr[i + 1];
				c3 = Arr[i + 2];
				outArr.push(((c & 15) << 12) | ((c2 & 63) << 6) | (c3 & 63));
				i += 3;
			}
		}
		return outArr;
	},

	UTF8BytesFromString: function (Str) {
		Str = Str.replace(/\r\n/g, "\n");

		var utf8Arr = [];
		var len = Str.length;
		for (var n = 0; n < len; n++) {
			var c = Str.charCodeAt(n);
			if (c < 128) {
				utf8Arr.push(c);
			}
			else if ((c > 127) && (c < 2048)) {
				utf8Arr.push((c >> 6) | 192);
				utf8Arr.push(((c & 63) | 128));
			}
			else {
				utf8Arr.push(((c >> 12) | 224));
				utf8Arr.push((((c >> 6) & 63) | 128));
				utf8Arr.push(((c & 63) | 128));
			}
		}
		return utf8Arr;
	},

	bytesToString: function (Arr) {
		var BUFFER_SIZE = gx.util.browser.isChrome() ? 32765 : 50000;
		var strOut = [];
		while (Arr.length >= BUFFER_SIZE) {
			strOut.push(eval("String.fromCharCode(" + Arr.slice(0, BUFFER_SIZE).join(",") + ");"));
			Arr = Arr.slice(BUFFER_SIZE);
		}
		if (Arr.length != 0) {
			strOut.push(eval("String.fromCharCode(" + Arr.join(",") + ");"));
		}
		return strOut.join("");
	},

	decodeImpl: function (t) {
		var f64 = this.f64;
		var d = [];
		var i = 0;
		t = t.replace(/\n|\r/g, ""); t = t.replace(/=/g, "");
		var len = t.length;
		while (i < len) {
			d[d.length] = (f64[t.charAt(i)] << 2) | (f64[t.charAt(i + 1)] >> 4);
			d[d.length] = (((f64[t.charAt(i + 1)] & 15) << 4) | (f64[t.charAt(i + 2)] >> 2));
			d[d.length] = (((f64[t.charAt(i + 2)] & 3) << 6) | (f64[t.charAt(i + 3)]));
			i += 4;
		}
		if (t.length % 4 == 2)
			d = d.slice(0, d.length - 2);
		if (t.length % 4 == 3)
			d = d.slice(0, d.length - 1);
		return d;
	},

	encodeImpl: function (d) {
		var b64 = this.b64;
		var r = [];
		var i = 0;
		var dl = d.length;
		if ((dl % 3) == 1) {
			d[d.length] = 0;
			d[d.length] = 0;
		}
		if ((dl % 3) == 2)
			d[d.length] = 0;
		var len = d.length;
		while (i < len) {
			r[r.length] = b64[d[i] >> 2];
			r[r.length] = b64[((d[i] & 3) << 4) | (d[i + 1] >> 4)];
			r[r.length] = b64[((d[i + 1] & 15) << 2) | (d[i + 2] >> 6)];
			r[r.length] = b64[d[i + 2] & 63];
			i += 3;
		}
		if ((dl % 3) == 1)
			r[r.length - 1] = r[r.length - 2] = "=";
		if ((dl % 3) == 2)
			r[r.length - 1] = "=";
		var t = r.join("");
		return t;
	},

	_init: function () {
		var b64s = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
		var len = b64s.length;
		for (var i = 0; i < len; i++) {
			var c = b64s.charAt(i);
			this.b64[i] = c;
			this.f64[c] = i;
		}
	}
};

gx.webSocket = (function () {
	var opened = false;	
	var initialized = false;
	var maxRetries = 3;	
	var retryCount = 0;
	var retryDelay = 10000;	

	var doRetry = function() {
		opened = false;
		initialized = false;
		if (gx.webSocket.reconnect && retryCount < maxRetries) {
			retryCount++;				
			gx.lang.doCallTimeout(gx.webSocket._init, gx.webSocket, [], retryDelay);	
		}			
	};

	var create = function(wsUrl) {
		var ws = new WebSocket(wsUrl);
		ws.onopen = function () {
			opened = true;
			retryCount = 0;
		};
		
		ws.onmessage = function (msg) {			
			gx.dbg.logDebug("gx.webSocket - New Message: " + msg.data);
			gx.fx.obs.notify('gx.ws.onMessage', [msg.data]);
		};

		ws.onclose = function () {
			gx.dbg.logDebug("gx.webSocket - OnClose");
			doRetry();
		};

		window.onbeforeunload = function () {
			if (opened) {
				ws.close();
			}
		};
	};
	
	
	return {
		reconnect: true,

		_init: function () {					
			if (!initialized && this.supported()) {	
				var port = gx.fn.getHidden("GX_WEBSOCKET_PORT");			
				var clientId = gx.fn.getHidden("GX_WEBSOCKET_ID");
				var wsProtocol = (location.protocol === 'https:')? "wss://": "ws://";
				var host = (port)? location.hostname + ":" + port + "/" : location.host + "/";
				var resourceUrl = (gx.gen.isDotNet())? "/gxwebsocket.svc?": "/gxwebsocket?";
				try {
					create(wsProtocol + host + gx.basePath + resourceUrl + clientId);
					initialized = true;
				}
				catch (e) {					
					gx.dbg.logEx(e, 'gxfrmutl.js', 'Could not initialize WebSocket');
				}
			}
		},
		
		supported: function () {
			return "WebSocket" in window;
		}
	};
	
})();

gx.geolocation = (function ($) {
	return {
		attachedCtrls: null,

		_init: function () {
			attachedCtrls = [];
		},

		getMyPosition: function (Ctrl) {
			Ctrl.attachedCtrl = $("#" + Ctrl.id.replace(/_geoLocMe$/, ""))[0];
			attachedCtrls.push(Ctrl);
			if (navigator.geolocation)
				navigator.geolocation.getCurrentPosition(this.positionHandler, this.handle_errors);
			else {
				msg = "Your browser does not support HTML5 Geolocalization";
				gx.pO.clearMessages();
				gx.pO.addMessage(msg);
				gx.pO.refreshOutputs([]);
			}
		},

		positionHandler: function (a) {
			var Ctrl = attachedCtrls.shift();
			var d = gx.fn.validStruct(gx.O.getValidStructId(Ctrl.attachedCtrl.id));
			var c = a.coords.latitude + "," + a.coords.longitude;
			gx.evt.setEventRow(gx.pO, Ctrl.attachedCtrl);
			if (d.v2v) {
				d.v2v(c);
				d.v2c()
			}
			if (d.gxgrid)
				d.gxgrid.updateControlValue(d, true);
		},

		handle_errors: function (a) {
			var b = attachedCtrls.shift();
			var msg;
			switch (a.code) {
				case a.PERMISSION_DENIED:
					msg = "user did not share geolocation data";
					break;
				case a.POSITION_UNAVAILABLE:
					msg = "could not detect current position";
					break;
				case a.TIMEOUT:
					msg = "retrieving position timed out";
					break;
				default:
					msg = "unknown error";
			}
			gx.pO.clearMessages();
			gx.pO.addMessage(msg);
			gx.pO.refreshOutputs([]);
		}

	};
})(gx.$);
/* END OF FILE - ..\js\gxfrmutl.js - */
/* START OF FILE - ..\js\rijndael.js - */
/* rijndael.js      Rijndael Reference Implementation
   Copyright (c) 2001 Fritz Schneider
 
 This software is provided as-is, without express or implied warranty.  
 Permission to use, copy, modify, distribute or sell this software, with or
 without fee, for any purpose and by any individual or organization, is hereby
 granted, provided that the above copyright notice and this paragraph appear 
 in all copies. Distribution as a part of an application or binary must
 include the above copyright notice in the documentation and/or other materials
 provided with the application or distribution.


   As the above disclaimer notes, you are free to use this code however you
   want. However, I would request that you send me an email 
   (fritz /at/ cs /dot/ ucsd /dot/ edu) to say hi if you find this code useful
   or instructional. Seeing that people are using the code acts as 
   encouragement for me to continue development. If you *really* want to thank
   me you can buy the book I wrote with Thomas Powell, _JavaScript:
   _The_Complete_Reference_ :)

   This code is an UNOPTIMIZED REFERENCE implementation of Rijndael. 
   If there is sufficient interest I can write an optimized (word-based, 
   table-driven) version, although you might want to consider using a 
   compiled language if speed is critical to your application. As it stands,
   one run of the monte carlo test (10,000 encryptions) can take up to 
   several minutes, depending upon your processor. You shouldn't expect more
   than a few kilobytes per second in throughput.

   Also note that there is very little error checking in these functions. 
   Doing proper error checking is always a good idea, but the ideal 
   implementation (using the instanceof operator and exceptions) requires
   IE5+/NS6+, and I've chosen to implement this code so that it is compatible
   with IE4/NS4. 

   And finally, because JavaScript doesn't have an explicit byte/char data 
   type (although JavaScript 2.0 most likely will), when I refer to "byte" 
   in this code I generally mean "32 bit integer with value in the interval 
   [0,255]" which I treat as a byte.

   See http://www-cse.ucsd.edu/~fritz/rijndael.html for more documentation
   of the (very simple) API provided by this code.

                                               Fritz Schneider
                                               fritz at cs.ucsd.edu
 
*/

gx.sec.rijndael = {
	// Rijndael parameters --  Valid values are 128, 192, or 256

	keySizeInBits: 128,
	blockSizeInBits: 128,

	// The number of rounds for the cipher, indexed by [Nk][Nb]
	roundsArray: [, , , , [, , , , 10, , 12, , 14], ,
	                   [, , , , 12, , 12, , 14], ,
	                   [, , , , 14, , 14, , 14]],

	///////  You shouldn't have to modify anything below this line except for
	///////  the function getRandomBytes().
	//
	// Note: in the following code the two dimensional arrays are indexed as
	//       you would probably expect, as array[row][column]. The state arrays
	//       are 2d arrays of the form state[4][Nb].

	// The number of bytes to shift by in shiftRow, indexed by [Nb][row]
	shiftOffsets: [, , , , [, 1, 2, 3], , [, 1, 2, 3], , [, 1, 3, 4]],

	// The round constants used in subkey expansion
	Rcon: [0x01, 0x02, 0x04, 0x08, 0x10, 0x20,
					0x40, 0x80, 0x1b, 0x36, 0x6c, 0xd8,
					0xab, 0x4d, 0x9a, 0x2f, 0x5e, 0xbc,
					0x63, 0xc6, 0x97, 0x35, 0x6a, 0xd4,
					0xb3, 0x7d, 0xfa, 0xef, 0xc5, 0x91],

	// Precomputed lookup table for the SBox
	SBox: [99, 124, 119, 123, 242, 107, 111, 197, 48, 1, 103, 43, 254, 215, 171,
				 118, 202, 130, 201, 125, 250, 89, 71, 240, 173, 212, 162, 175, 156, 164,
				 114, 192, 183, 253, 147, 38, 54, 63, 247, 204, 52, 165, 229, 241, 113,
				 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, 154, 7, 18, 128, 226,
				 235, 39, 178, 117, 9, 131, 44, 26, 27, 110, 90, 160, 82, 59, 214,
				 179, 41, 227, 47, 132, 83, 209, 0, 237, 32, 252, 177, 91, 106, 203,
				 190, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, 133, 69,
				 249, 2, 127, 80, 60, 159, 168, 81, 163, 64, 143, 146, 157, 56, 245,
				 188, 182, 218, 33, 16, 255, 243, 210, 205, 12, 19, 236, 95, 151, 68,
				  23, 196, 167, 126, 61, 100, 93, 25, 115, 96, 129, 79, 220, 34, 42,
				 144, 136, 70, 238, 184, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73,
				   6, 36, 92, 194, 211, 172, 98, 145, 149, 228, 121, 231, 200, 55, 109,
				 141, 213, 78, 169, 108, 86, 244, 234, 101, 122, 174, 8, 186, 120, 37,
				  46, 28, 166, 180, 198, 232, 221, 116, 31, 75, 189, 139, 138, 112, 62,
				 181, 102, 72, 3, 246, 14, 97, 53, 87, 185, 134, 193, 29, 158, 225,
				 248, 152, 17, 105, 217, 142, 148, 155, 30, 135, 233, 206, 85, 40, 223,
				 140, 161, 137, 13, 191, 230, 66, 104, 65, 153, 45, 15, 176, 84, 187,
				  22],

	// Precomputed lookup table for the inverse SBox
	SBoxInverse: [82, 9, 106, 213, 48, 54, 165, 56, 191, 64, 163, 158, 129, 243, 215,
								251, 124, 227, 57, 130, 155, 47, 255, 135, 52, 142, 67, 68, 196, 222,
								233, 203, 84, 123, 148, 50, 166, 194, 35, 61, 238, 76, 149, 11, 66,
								250, 195, 78, 8, 46, 161, 102, 40, 217, 36, 178, 118, 91, 162, 73,
								109, 139, 209, 37, 114, 248, 246, 100, 134, 104, 152, 22, 212, 164, 92,
								204, 93, 101, 182, 146, 108, 112, 72, 80, 253, 237, 185, 218, 94, 21,
								 70, 87, 167, 141, 157, 132, 144, 216, 171, 0, 140, 188, 211, 10, 247,
								228, 88, 5, 184, 179, 69, 6, 208, 44, 30, 143, 202, 63, 15, 2,
								193, 175, 189, 3, 1, 19, 138, 107, 58, 145, 17, 65, 79, 103, 220,
								234, 151, 242, 207, 206, 240, 180, 230, 115, 150, 172, 116, 34, 231, 173,
								 53, 133, 226, 249, 55, 232, 28, 117, 223, 110, 71, 241, 26, 113, 29,
								 41, 197, 137, 111, 183, 98, 14, 170, 24, 190, 27, 252, 86, 62, 75,
								198, 210, 121, 32, 154, 219, 192, 254, 120, 205, 90, 244, 31, 221, 168,
								 51, 136, 7, 199, 49, 177, 18, 16, 89, 39, 128, 236, 95, 96, 81,
								127, 169, 25, 181, 74, 13, 45, 229, 122, 159, 147, 201, 156, 239, 160,
								224, 59, 77, 174, 42, 245, 176, 200, 235, 187, 60, 131, 83, 153, 97,
								 23, 43, 4, 126, 186, 119, 214, 38, 225, 105, 20, 99, 85, 33, 12,
								125],

	// This method circularly shifts the array left by the number of elements
	// given in its parameter. It returns the resulting array and is used for 
	// the ShiftRow step. Note that shift() and push() could be used for a more 
	// elegant solution, but they require IE5.5+, so I chose to do it manually. 

	cyclicShiftLeft: function (theArray, positions) {
		var temp = theArray.slice(0, positions);
		theArray = theArray.slice(positions).concat(temp);
		return theArray;
	},

	// Multiplies the element "poly" of GF(2^8) by x. See the Rijndael spec.

	xtime: function (poly) {
		poly <<= 1;
		return ((poly & 0x100) ? (poly ^ 0x11B) : (poly));
	},

	// Multiplies the two elements of GF(2^8) together and returns the result.
	// See the Rijndael spec, but should be straightforward: for each power of
	// the indeterminant that has a 1 coefficient in x, add y times that power
	// to the result. x and y should be bytes representing elements of GF(2^8)

	mult_GF256: function (x, y) {
		var bit, result = 0;

		for (bit = 1; bit < 256; bit *= 2, y = this.xtime(y)) {
			if (x & bit)
				result ^= y;
		}
		return result;
	},

	// Performs the substitution step of the cipher. State is the 2d array of
	// state information (see spec) and direction is string indicating whether
	// we are performing the forward substitution ("encrypt") or inverse 
	// substitution (anything else)

	byteSub: function (state, direction) {
		var S;
		if (direction == "encrypt")           // Point S to the SBox we're using
			S = this.SBox;
		else
			S = this.SBoxInverse;
		for (var i = 0; i < 4; i++)           // Substitute for every byte in state
			for (var j = 0; j < this.Nb; j++)
				state[i][j] = S[state[i][j]];
	},

	// Performs the row shifting step of the cipher.

	shiftRow: function (state, direction) {
		for (var i = 1; i < 4; i++)               // Row 0 never shifts
			if (direction == "encrypt")
				state[i] = this.cyclicShiftLeft(state[i], this.shiftOffsets[this.Nb][i]);
			else
				state[i] = this.cyclicShiftLeft(state[i], this.Nb - this.shiftOffsets[this.Nb][i]);
	},

	// Performs the column mixing step of the cipher. Most of these steps can
	// be combined into table lookups on 32bit values (at least for encryption)
	// to greatly increase the speed. 

	mixColumn: function (state, direction) {
		var b = [];                            // Result of matrix multiplications
		for (var j = 0; j < this.Nb; j++) {    // Go through each column...
			for (var i = 0; i < 4; i++) {        // and for each row in the column...
				if (direction == "encrypt")
					b[i] = this.mult_GF256(state[i][j], 2) ^          // perform mixing
						   this.mult_GF256(state[(i + 1) % 4][j], 3) ^
						   state[(i + 2) % 4][j] ^
						   state[(i + 3) % 4][j];
				else
					b[i] = this.mult_GF256(state[i][j], 0xE) ^
						   this.mult_GF256(state[(i + 1) % 4][j], 0xB) ^
						   this.mult_GF256(state[(i + 2) % 4][j], 0xD) ^
						   this.mult_GF256(state[(i + 3) % 4][j], 9);
			}
			for (var i = 0; i < 4; i++)          // Place result back into column
				state[i][j] = b[i];
		}
	},

	// Adds the current round key to the state information. Straightforward.

	addRoundKey: function (state, roundKey) {
		for (var j = 0; j < this.Nb; j++) {            // Step through columns...
			state[0][j] ^= (roundKey[j] & 0xFF);         // and XOR
			state[1][j] ^= ((roundKey[j] >> 8) & 0xFF);
			state[2][j] ^= ((roundKey[j] >> 16) & 0xFF);
			state[3][j] ^= ((roundKey[j] >> 24) & 0xFF);
		}
	},

	// This function creates the expanded key from the input (128/192/256-bit)
	// key. The parameter key is an array of bytes holding the value of the key.
	// The returned value is an array whose elements are the 32-bit words that 
	// make up the expanded key.

	keyExpansion: function (key) {
		var expandedKey = [];
		var temp;

		// in case the key size or parameters were changed...
		this.Nk = this.keySizeInBits / 32;
		this.Nb = this.blockSizeInBits / 32;
		this.Nr = this.roundsArray[this.Nk][this.Nb];

		for (var j = 0; j < this.Nk; j++)     // Fill in input key first
			expandedKey[j] =
			  (key[4 * j]) | (key[4 * j + 1] << 8) | (key[4 * j + 2] << 16) | (key[4 * j + 3] << 24);

		// Now walk down the rest of the array filling in expanded key bytes as
		// per Rijndael's spec
		for (j = this.Nk; j < this.Nb * (this.Nr + 1) ; j++) {    // For each word of expanded key
			temp = expandedKey[j - 1];
			if (j % this.Nk == 0)
				temp = ((this.SBox[(temp >> 8) & 0xFF]) |
						 (this.SBox[(temp >> 16) & 0xFF] << 8) |
						 (this.SBox[(temp >> 24) & 0xFF] << 16) |
						 (this.SBox[temp & 0xFF] << 24)) ^ this.Rcon[Math.floor(j / this.Nk) - 1];
			else if (this.Nk > 6 && j % this.Nk == 4)
				temp = (this.SBox[(temp >> 24) & 0xFF] << 24) |
					   (this.SBox[(temp >> 16) & 0xFF] << 16) |
					   (this.SBox[(temp >> 8) & 0xFF] << 8) |
					   (this.SBox[temp & 0xFF]);
			expandedKey[j] = expandedKey[j - this.Nk] ^ temp;
		}
		return expandedKey;
	},

	// Rijndael's round functions... 

	Round: function (state, roundKey) {
		this.byteSub(state, "encrypt");
		this.shiftRow(state, "encrypt");
		this.mixColumn(state, "encrypt");
		this.addRoundKey(state, roundKey);
	},

	InverseRound: function (state, roundKey) {
		this.addRoundKey(state, roundKey);
		this.mixColumn(state, "decrypt");
		this.shiftRow(state, "decrypt");
		this.byteSub(state, "decrypt");
	},

	FinalRound: function (state, roundKey) {
		this.byteSub(state, "encrypt");
		this.shiftRow(state, "encrypt");
		this.addRoundKey(state, roundKey);
	},

	InverseFinalRound: function (state, roundKey) {
		this.addRoundKey(state, roundKey);
		this.shiftRow(state, "decrypt");
		this.byteSub(state, "decrypt");
	},

	// encrypt is the basic encryption function. It takes parameters
	// block, an array of bytes representing a plaintext block, and expandedKey,
	// an array of words representing the expanded key previously returned by
	// keyExpansion(). The ciphertext block is returned as an array of bytes.

	encrypt: function (block, expandedKey) {
		var i;
		if (!block || block.length * 8 != this.blockSizeInBits)
			return;
		if (!expandedKey)
			return;

		block = this.packBytes(block);
		this.addRoundKey(block, expandedKey);
		for (i = 1; i < this.Nr; i++)
			this.Round(block, expandedKey.slice(this.Nb * i, this.Nb * (i + 1)));
		this.FinalRound(block, expandedKey.slice(this.Nb * this.Nr));
		return this.unpackBytes(block);
	},

	// decrypt is the basic decryption function. It takes parameters
	// block, an array of bytes representing a ciphertext block, and expandedKey,
	// an array of words representing the expanded key previously returned by
	// keyExpansion(). The decrypted block is returned as an array of bytes.

	decrypt: function (block, expandedKey) {
		var i;
		if (!block || block.length * 8 != this.blockSizeInBits)
			return;
		if (!expandedKey)
			return;

		block = this.packBytes(block);
		this.InverseFinalRound(block, expandedKey.slice(this.Nb * this.Nr));
		for (i = this.Nr - 1; i > 0; i--)
			this.InverseRound(block, expandedKey.slice(this.Nb * i, this.Nb * (i + 1)));
		this.addRoundKey(block, expandedKey);
		return this.unpackBytes(block);
	},

	// This method takes a byte array (byteArray) and converts it to a string by
	// applying String.fromCharCode() to each value and concatenating the result.
	// The resulting string is returned. Note that this function SKIPS zero bytes
	// under the assumption that they are padding added in formatPlaintext().
	// Obviously, do not invoke this method on raw data that can contain zero
	// bytes. It is really only appropriate for printable ASCII/Latin-1 
	// values. Roll your own function for more robust functionality :)

	byteArrayToString: function (byteArray) {
		var result = "";
		var len = byteArray.length;
		for (var i = 0; i < len; i++)
			if (byteArray[i] != 0)
				result += String.fromCharCode(byteArray[i]);
		return result;
	},

	stringToByteArray: function (strText) {
		var result = [];
		var len = strText.length;
		for (var i = 0; i < len; i++)
			result[result.length] = strText.charCodeAt();
		return result;
	},

	// This function takes an array of bytes (byteArray) and converts them
	// to a hexadecimal string. Array element 0 is found at the beginning of 
	// the resulting string, high nibble first. Consecutive elements follow
	// similarly, for example [16, 255] --> "10ff". The function returns a 
	// string.

	byteArrayToHex: function (byteArray) {
		var result = "";
		if (!byteArray)
			return;
		var len = byteArray.length;
		for (var i = 0; i < len; i++)
			result += ((byteArray[i] < 16) ? "0" : "") + byteArray[i].toString(16);

		return result;
	},

	// This function converts a string containing hexadecimal digits to an 
	// array of bytes. The resulting byte array is filled in the order the
	// values occur in the string, for example "10FF" --> [16, 255]. This
	// function returns an array. 

	hexToByteArray: function (hexString) {
		var byteArray = [];
		if (hexString.length % 2)             // must have even length
			return;
		if (hexString.indexOf("0x") == 0 || hexString.indexOf("0X") == 0)
			hexString = hexString.substring(2);
		var len = hexString.length;
		for (var i = 0; i < len; i += 2)
			byteArray[Math.floor(i / 2)] = parseInt(hexString.slice(i, i + 2), 16);
		return byteArray;
	},

	// This function packs an array of bytes into the four row form defined by
	// Rijndael. It assumes the length of the array of bytes is divisible by
	// four. Bytes are filled in according to the Rijndael spec (starting with
	// column 0, row 0 to 3). This function returns a 2d array.

	packBytes: function (octets) {
		var state = [];
		if (!octets || octets.length % 4)
			return;

		state[0] = [];
		state[1] = [];
		state[2] = [];
		state[3] = [];
		var len = octets.length;
		for (var j = 0; j < len; j += 4) {
			state[0][j / 4] = octets[j];
			state[1][j / 4] = octets[j + 1];
			state[2][j / 4] = octets[j + 2];
			state[3][j / 4] = octets[j + 3];
		}
		return state;
	},

	// This function unpacks an array of bytes from the four row format preferred
	// by Rijndael into a single 1d array of bytes. It assumes the input "packed"
	// is a packed array. Bytes are filled in according to the Rijndael spec. 
	// This function returns a 1d array of bytes.

	unpackBytes: function (packed) {
		var result = [];
		var len = packed[0].length;
		for (var j = 0; j < len; j++) {
			result[result.length] = packed[0][j];
			result[result.length] = packed[1][j];
			result[result.length] = packed[2][j];
			result[result.length] = packed[3][j];
		}
		return result;
	},

	// This function takes a prospective plaintext (string or array of bytes)
	// and pads it with zero bytes if its length is not a multiple of the block 
	// size. If plaintext is a string, it is converted to an array of bytes
	// in the process. The type checking can be made much nicer using the 
	// instanceof operator, but this operator is not available until IE5.0 so I 
	// chose to use the heuristic below. 

	formatPlaintext: function (plaintext) {
		var bpb = this.blockSizeInBits / 8;			// bytes per block
		var i;

		// if primitive string or String instance
		if (typeof plaintext == "string" || plaintext.indexOf) {
			plaintext = plaintext.split("");
			// Unicode issues here (ignoring high byte)
			var len = plaintext.length;
			for (i = 0; i < len; i++)
				plaintext[i] = plaintext[i].charCodeAt(0) & 0xFF;
		}

		for (i = bpb - (plaintext.length % bpb) ; i > 0 && i < bpb; i--)
			plaintext[plaintext.length] = 0;

		return plaintext;
	},

	// Returns an array containing "howMany" random bytes. YOU SHOULD CHANGE THIS
	// TO RETURN HIGHER QUALITY RANDOM BYTES IF YOU ARE USING THIS FOR A "REAL"
	// APPLICATION.

	getRandomBytes: function (howMany) {
		var i;
		var bytes = [];
		for (i = 0; i < howMany; i++)
			bytes[i] = Math.round(Math.random() * 255);
		return bytes;
	},

	// rijndaelEncrypt(plaintext, key, mode)
	// Encrypts the plaintext using the given key and in the given mode. 
	// The parameter "plaintext" can either be a string or an array of bytes. 
	// The parameter "key" must be an array of key bytes. If you have a hex 
	// string representing the key, invoke hexToByteArray() on it to convert it 
	// to an array of bytes. The third parameter "mode" is a string indicating
	// the encryption mode to use, either "ECB" or "CBC". If the parameter is
	// omitted, ECB is assumed.
	// 
	// An array of bytes representing the cihpertext is returned. To convert 
	// this array to hex, invoke byteArrayToHex() on it. If you are using this 
	// "for real" it is a good idea to change the function getRandomBytes() to 
	// something that returns truly random bits.

	rijndaelEncrypt: function (plaintext, key, mode) {
		var expandedKey, i, aBlock;
		var bpb = this.blockSizeInBits / 8;     // bytes per block
		var ct;                                 // ciphertext

		if (!plaintext || !key)
			return;
		if (key.length * 8 != this.keySizeInBits)
			return;
		if (mode == "CBC")
			ct = this.getRandomBytes(bpb);        // get IV
		else {
			mode = "ECB";
			ct = [];
		}

		// convert plaintext to byte array and pad with zeros if necessary. 
		plaintext = this.formatPlaintext(plaintext);

		expandedKey = this.keyExpansion(key);

		for (var block = 0; block < plaintext.length / bpb; block++) {
			aBlock = plaintext.slice(block * bpb, (block + 1) * bpb);
			if (mode == "CBC")
				for (var i = 0; i < bpb; i++)
					aBlock[i] ^= ct[block * bpb + i];
			ct = ct.concat(this.encrypt(aBlock, expandedKey));
		}

		return ct;
	},

	// rijndaelDecrypt(ciphertext, key, mode)
	// Decrypts the using the given key and mode. The parameter "ciphertext" 
	// must be an array of bytes. The parameter "key" must be an array of key 
	// bytes. If you have a hex string representing the ciphertext or key, 
	// invoke hexToByteArray() on it to convert it to an array of bytes. The
	// parameter "mode" is a string, either "CBC" or "ECB".
	// 
	// An array of bytes representing the plaintext is returned. To convert 
	// this array to a hex string, invoke byteArrayToHex() on it. To convert it 
	// to a string of characters, you can use byteArrayToString().

	rijndaelDecrypt: function (ciphertext, key, mode) {
		var expandedKey;
		var bpb = this.blockSizeInBits / 8;     // bytes per block
		var pt = [];                   					// plaintext array
		var aBlock;                             // a decrypted block
		var block;                              // current block number

		if (!ciphertext || !key || typeof ciphertext == "string")
			return;
		if (key.length * 8 != this.keySizeInBits)
			return;
		if (!mode)
			mode = "ECB";                         // assume ECB if mode omitted

		expandedKey = this.keyExpansion(key);

		// work backwards to accomodate CBC mode 
		for (block = (ciphertext.length / bpb) - 1; block > 0; block--) {
			aBlock =
			 this.decrypt(ciphertext.slice(block * bpb, (block + 1) * bpb), expandedKey);
			if (mode == "CBC")
				for (var i = 0; i < bpb; i++)
					pt[(block - 1) * bpb + i] = aBlock[i] ^ ciphertext[(block - 1) * bpb + i];
			else
				pt = aBlock.concat(pt);
		}

		// do last block if ECB (skips the IV in CBC)
		if (mode == "ECB")
			pt = this.decrypt(ciphertext.slice(0, bpb), expandedKey).concat(pt);

		return pt;
	},

	_init: function () {
		// Cipher parameters ... do not change these
		this.Nk = this.keySizeInBits / 32;
		this.Nb = this.blockSizeInBits / 32;
		this.Nr = this.roundsArray[this.Nk][this.Nb];
	}
};
/* END OF FILE - ..\js\rijndael.js - */
/* START OF FILE - ..\js\gxui.js - */
gx.ui = (function ($) {
	return {
		grid: function () {
			this.gridContainer = null;
			this.firstTime = true;
			this.autoRefreshing = false;
			this.loadingCollection = false;
			this.properties = [];

			this.setContainerDelayed = function (container) {
				this.gridContainer = container;
				this.ContainerName = gx.dom.id(container);
				this.DesignContainerName = this.ContainerName;
				this.ParentObject.setUserControl(this);
			};

			this.getContainerControl = function () {
				return this.gridContainer;
			};

			this.me = function () {
				return this.gridObject() + '.grid';
			};

			this.render = function (firstTime, fromAutoRefresh, fromCollection, afterRenderCallback) {
				this.clearFunctions();
				this.refreshDynProperties();
				this.properties = [];
				for (var i = 0; i < this.rows.length; i++) {
					this.properties[i] = [];
					var row = this.rows[i];
					for (var j = 0; j < this.columns.length; j++) {
						var column = this.columns[j];
						var columnProps = row.gxProps[column.index];
						var gxCtrl = column.gxControl;
						gxCtrl.grid = this.ownerGrid;
						gxCtrl.row = row;
						gxCtrl.gridId = this.gxId;
						gxCtrl.gridRow = row.gxId;
						if (!fromCollection) {						
							gxCtrl.setProperties.apply(gxCtrl, columnProps);
						}
						else
							gxCtrl.value = columnProps[0];
						this.setRenderProperties(row.gxRenderProps[j], gxCtrl);
						if (!gxCtrl.enabled && gxCtrl.type <= gx.html.controls.types.checkBox) {
							if (gxCtrl.cssClass !== '' && gxCtrl.cssClass.indexOf('Readonly') !== 0)
								gxCtrl.cssClass = 'Readonly' + gxCtrl.cssClass;
						}
						this.properties[i][j] = gx.lang.clone(gxCtrl);
						this.addC2V(column, this.properties[i][j]);
					}
				}
				this.firstTime = firstTime;
				this.autoRefreshing = (fromAutoRefresh ? true : false);
				this.loadingCollection = (fromCollection ? true : false);
				if (this.show) {
					this.setC2ShowFunction(function (othis) {
						othis.show();
						// Call after render callback
						afterRenderCallback();
					});
					if (this.autoRefreshing) {
						this.show();
						// Call after render callback
						afterRenderCallback();
					}
				}
				this.autoRefreshing = false;
			};

			this.addC2V = function (column, cellCtrl) {
				this.addC2VFunction(function (othis) {
					if (column.gxAttName !== '') {
						var validStruct = othis.ParentObject.getValidStruct(column.gxId);
						if (validStruct) {
							othis.ParentObject[validStruct.gxvar] = cellCtrl.value;
						}
						gx.fn.setHidden(cellCtrl.id, cellCtrl.value);
					}
				});
			};

			this.setRenderProperties = function (props, gxCtrl) {
				if (props) {
					for (var prop in props) {
						gxCtrl[prop] = props[prop];
					}
				}
			};

			this.selectRow = function (index) {
				var row = this.rows[index];
				if (row) {
					this.instanciateSelectionVars(row.gxId);
					this.instanciateSelectedRow(row);
				}
			};

			this.getEventRow = function () {
				if (!gx.lang.emptyObject(this.GridRow)) {
					return this.GridRow;
				}
				return '0001';
			};

			this.executeEvent = function (x, y) {
				/*jshint evil:true*/
				if (x < this.columns.length && y < this.rows.length) {
					var gxCtrl = this.properties[y][x];
					var sEventJsCode = gx.html.controls.eventJSCode(gxCtrl.jsScrCode, gxCtrl.eventName, gxCtrl.jsDynCode, gxCtrl.grid, gxCtrl.row);
					if (sEventJsCode !== '') {
						if (!gx.lang.emptyObject(gxCtrl.usrOnclick)) {
							sEventJsCode = 'if(' + gxCtrl.usrOnclick + ') { ' + sEventJsCode + ' }';
						}
						var evtFnc = new Function(sEventJsCode);
						if (typeof (evtFnc) == 'function') {
							evtFnc();
						}
					}
					else {
						if (gxCtrl.clickEvent) {
							var gxO = this.parentGxObject;
							var ctrlRow = gxCtrl.row.gxId;
							this.ownerGrid.instanciateRow(ctrlRow);
							gxO[gxCtrl.clickEvent].call(gxO, ctrlRow);
						}
					}
				}
			};

			this.executeIsValid = function (x, y) {
				if (x < this.columns.length && y < this.rows.length) {
					var gxO = this.parentGxObject,
						gxCtrl = this.properties[y][x],
						vStruct = gxCtrl.vStruct || gxO.GXValidFnc[gxCtrl.column.gxId],
						ctrlRow = gxCtrl.row.gxId;
					if (vStruct && vStruct.isvalid) {
						this.ownerGrid.instanciateRow(ctrlRow);
						gxO[vStruct.isvalid].call(gxO);
					}
				}
			};

			this.addEventHandler = function (EventName, Handler) {
				this[EventName] = (function () {
					var gridRow = gx.fn.currentGridRow(this.GridId);
					this.eventHandler(this.GridId, gridRow, Handler);
				}).closure(this);
			};
			
			var suggestProviders = {};
			
			this.requestSuggest = function (x, y, query) {
				var deferred = $.Deferred();
				if (x < this.columns.length && y < this.rows.length) {
					var gxO = this.parentGxObject,
						gxCtrl = this.properties[y][x],
						vStruct = gxCtrl.vStruct || gxO.GXValidFnc[gxCtrl.column.gxId],
						ctrlRow = gxCtrl.row.gxId,
						provider = suggestProviders[ctrlRow + "_" + vStruct.id];

					if (!provider) {
						if (vStruct && vStruct.gxsgprm) {
							this.ownerGrid.instanciateRow(ctrlRow);
							provider = new gx.fx.suggestProvider(vStruct.gxsgprm[1], null, vStruct.gxsgprm[0]);
							suggestProviders[ctrlRow + "_" + vStruct.id] = provider;
						}
					}
					
					if (provider) {
						gx.fx.updateSuggestParms(vStruct.gxsgprm[2]);
						provider.requestSuggestions([], function () {
							deferred.resolve(provider.values);
						},
						function () {
							deferred.reject();
						}, query);
					}
					else {
						deferred.reject();
					}
				}
				else {
					deferred.reject();
				}
				return deferred.promise();
			};

			this.executeValidate = function (x, y) {
				if (x < this.columns.length && y < this.rows.length) {
					var gxO = this.parentGxObject,
						gxCtrl = this.properties[y][x],
						vStruct = gxCtrl.vStruct || gxO.GXValidFnc[gxCtrl.column.gxId],
						ctrlRow = gxCtrl.row.gxId;
					if (vStruct && vStruct.fnc) {
						this.ownerGrid.instanciateRow(ctrlRow);
						vStruct.fnc.call(gxO);
					}
				}
			};
		}
	};
})(gx.$);
/* END OF FILE - ..\js\gxui.js - */
/* START OF FILE - ..\js\gxlast.js - */
gx._init();
if (window.$)
	gx.dbg.write('Warning: Using custom $ version.');
else {
	window.$ = gx.$
	gx.dbg.write('Using jquery from GX distr.');
}
if (!window.$.fn || !window.$.fn.jquery)
	gx.dbg.write('Warning: $ is not a jQuery object instance');
else
	gx.dbg.write('global $ is jquery' + window.$.fn.jquery);
	
/* END OF FILE - ..\js\gxlast.js - */
/* START OF FILE - ..\GenCommon\js\modernizr.js - */
/* Modernizr 2.6.1 (Custom Build) | MIT & BSD
 * Build: http://modernizr.com/download/#-csstransitions-history-testprop-testallprops-domprefixes
 */
;



window.Modernizr = (function( window, document, undefined ) {

    var version = '2.6.1',

    Modernizr = {},


    docElement = document.documentElement,

    mod = 'modernizr',
    modElem = document.createElement(mod),
    mStyle = modElem.style,

    inputElem  ,


    toString = {}.toString,    omPrefixes = 'Webkit Moz O ms',

    cssomPrefixes = omPrefixes.split(' '),

    domPrefixes = omPrefixes.toLowerCase().split(' '),


    tests = {},
    inputs = {},
    attrs = {},

    classes = [],

    slice = classes.slice,

    featureName,



    _hasOwnProperty = ({}).hasOwnProperty, hasOwnProp;

    if ( !is(_hasOwnProperty, 'undefined') && !is(_hasOwnProperty.call, 'undefined') ) {
      hasOwnProp = function (object, property) {
        return _hasOwnProperty.call(object, property);
      };
    }
    else {
      hasOwnProp = function (object, property) { 
        return ((property in object) && is(object.constructor.prototype[property], 'undefined'));
      };
    }


    if (!Function.prototype.bind) {
      Function.prototype.bind = function bind(that) {

        var target = this;

        if (typeof target != "function") {
            throw new TypeError();
        }

        var args = slice.call(arguments, 1),
            bound = function () {

            if (this instanceof bound) {

              var F = function(){};
              F.prototype = target.prototype;
              var self = new F();

              var result = target.apply(
                  self,
                  args.concat(slice.call(arguments))
              );
              if (Object(result) === result) {
                  return result;
              }
              return self;

            } else {

              return target.apply(
                  that,
                  args.concat(slice.call(arguments))
              );

            }

        };

        return bound;
      };
    }

    function setCss( str ) {
        mStyle.cssText = str;
    }

    function setCssAll( str1, str2 ) {
        return setCss(prefixes.join(str1 + ';') + ( str2 || '' ));
    }

    function is( obj, type ) {
        return typeof obj === type;
    }

    function contains( str, substr ) {
        return !!~('' + str).indexOf(substr);
    }

    function testProps( props, prefixed ) {
        for ( var i in props ) {
            var prop = props[i];
            if ( !contains(prop, "-") && mStyle[prop] !== undefined ) {
                return prefixed == 'pfx' ? prop : true;
            }
        }
        return false;
    }

    function testDOMProps( props, obj, elem ) {
        for ( var i in props ) {
            var item = obj[props[i]];
            if ( item !== undefined) {

                            if (elem === false) return props[i];

                            if (is(item, 'function')){
                                return item.bind(elem || obj);
                }

                            return item;
            }
        }
        return false;
    }

    function testPropsAll( prop, prefixed, elem ) {

        var ucProp  = prop.charAt(0).toUpperCase() + prop.slice(1),
            props   = (prop + ' ' + cssomPrefixes.join(ucProp + ' ') + ucProp).split(' ');

            if(is(prefixed, "string") || is(prefixed, "undefined")) {
          return testProps(props, prefixed);

            } else {
          props = (prop + ' ' + (domPrefixes).join(ucProp + ' ') + ucProp).split(' ');
          return testDOMProps(props, prefixed, elem);
        }
    }    tests['history'] = function() {
      return !!(window.history && history.pushState);
    };


    tests['csstransitions'] = function() {
        return testPropsAll('transition');
    };



    for ( var feature in tests ) {
        if ( hasOwnProp(tests, feature) ) {
                                    featureName  = feature.toLowerCase();
            Modernizr[featureName] = tests[feature]();

            classes.push((Modernizr[featureName] ? '' : 'no-') + featureName);
        }
    }



     Modernizr.addTest = function ( feature, test ) {
       if ( typeof feature == 'object' ) {
         for ( var key in feature ) {
           if ( hasOwnProp( feature, key ) ) {
             Modernizr.addTest( key, feature[ key ] );
           }
         }
       } else {

         feature = feature.toLowerCase();

         if ( Modernizr[feature] !== undefined ) {
                                              return Modernizr;
         }

         test = typeof test == 'function' ? test() : test;

         if (enableClasses) {
           docElement.className += ' ' + (test ? '' : 'no-') + feature;
         }
         Modernizr[feature] = test;

       }

       return Modernizr; 
     };


    setCss('');
    modElem = inputElem = null;


    Modernizr._version      = version;

    Modernizr._domPrefixes  = domPrefixes;
    Modernizr._cssomPrefixes  = cssomPrefixes;



    Modernizr.testProp      = function(prop){
        return testProps([prop]);
    };

    Modernizr.testAllProps  = testPropsAll;


    return Modernizr;

})(this, this.document);
;
/* END OF FILE - ..\GenCommon\js\modernizr.js - */
/* START OF FILE - ..\GenCommon\js\mustache.js - */
/*!
 * mustache.js - Logic-less {{mustache}} templates with JavaScript
 * http://github.com/janl/mustache.js
 */

/*global define: false*/

(function (root, factory) {
  if (typeof exports === "object" && exports) {
    factory(exports); // CommonJS
  } else {
    var mustache = {};
    factory(mustache);
    if (typeof define === "function" && define.amd) {
      define(mustache); // AMD
    } else {
      root.Mustache = mustache; // <script>
    }
  }
}(this, function (mustache) {

  var whiteRe = /\s*/;
  var spaceRe = /\s+/;
  var nonSpaceRe = /\S/;
  var eqRe = /\s*=/;
  var curlyRe = /\s*\}/;
  var tagRe = /#|\^|\/|>|\{|&|=|!/;

  // Workaround for https://issues.apache.org/jira/browse/COUCHDB-577
  // See https://github.com/janl/mustache.js/issues/189
  var RegExp_test = RegExp.prototype.test;
  function testRegExp(re, string) {
    return RegExp_test.call(re, string);
  }

  function isWhitespace(string) {
    return !testRegExp(nonSpaceRe, string);
  }

  var Object_toString = Object.prototype.toString;
  var isArray = Array.isArray || function (obj) {
    return Object_toString.call(obj) === '[object Array]';
  };

  function escapeRegExp(string) {
    return string.replace(/[\-\[\]{}()*+?.,\\\^$|#\s]/g, "\\$&");
  }

  var entityMap = {
    "&": "&amp;",
    "<": "&lt;",
    ">": "&gt;",
    '"': '&quot;',
    "'": '&#39;',
    "/": '&#x2F;'
  };

  function escapeHtml(string) {
    return String(string).replace(/[&<>"'\/]/g, function (s) {
      return entityMap[s];
    });
  }

  function Scanner(string) {
    this.string = string;
    this.tail = string;
    this.pos = 0;
  }

  /**
   * Returns `true` if the tail is empty (end of string).
   */
  Scanner.prototype.eos = function () {
    return this.tail === "";
  };

  /**
   * Tries to match the given regular expression at the current position.
   * Returns the matched text if it can match, the empty string otherwise.
   */
  Scanner.prototype.scan = function (re) {
    var match = this.tail.match(re);

    if (match && match.index === 0) {
      this.tail = this.tail.substring(match[0].length);
      this.pos += match[0].length;
      return match[0];
    }

    return "";
  };

  /**
   * Skips all text until the given regular expression can be matched. Returns
   * the skipped string, which is the entire tail if no match can be made.
   */
  Scanner.prototype.scanUntil = function (re) {
    var match, pos = this.tail.search(re);

    switch (pos) {
    case -1:
      match = this.tail;
      this.pos += this.tail.length;
      this.tail = "";
      break;
    case 0:
      match = "";
      break;
    default:
      match = this.tail.substring(0, pos);
      this.tail = this.tail.substring(pos);
      this.pos += pos;
    }

    return match;
  };

  function Context(view, parent) {
    this.view = view || {};
    this.parent = parent;
    this._cache = {};
  }

  Context.make = function (view) {
    return (view instanceof Context) ? view : new Context(view);
  };

  Context.prototype.push = function (view) {
    return new Context(view, this);
  };

  Context.prototype.lookup = function (name) {
    var value = this._cache[name];

    if (!value) {
      if (name == '.') {
        value = this.view;
      } else {
        var context = this;

        while (context) {
          if (name.indexOf('.') > 0) {
            value = context.view;
            var names = name.split('.'), i = 0;
            while (value && i < names.length) {
              value = value[names[i++]];
            }
          } else {
            value = context.view[name];
          }

          if (value != null) break;

          context = context.parent;
        }
      }

      this._cache[name] = value;
    }

    if (typeof value === 'function') value = value.call(this.view);

    return value;
  };

  function Writer() {
    this.clearCache();
  }

  Writer.prototype.clearCache = function () {
    this._cache = {};
    this._partialCache = {};
  };

  Writer.prototype.compile = function (template, tags) {
    var fn = this._cache[template];

    if (!fn) {
      var tokens = mustache.parse(template, tags);
      fn = this._cache[template] = this.compileTokens(tokens, template);
    }

    return fn;
  };

  Writer.prototype.compilePartial = function (name, template, tags) {
    var fn = this.compile(template, tags);
    this._partialCache[name] = fn;
    return fn;
  };

  Writer.prototype.getPartial = function (name) {
    if (!(name in this._partialCache) && this._loadPartial) {
      this.compilePartial(name, this._loadPartial(name));
    }

    return this._partialCache[name];
  };

  Writer.prototype.compileTokens = function (tokens, template) {
    var self = this;
    return function (view, partials) {
      if (partials) {
        if (typeof partials === 'function') {
          self._loadPartial = partials;
        } else {
          for (var name in partials) {
            self.compilePartial(name, partials[name]);
          }
        }
      }

      return renderTokens(tokens, self, Context.make(view), template);
    };
  };

  Writer.prototype.render = function (template, view, partials) {
    return this.compile(template)(view, partials);
  };

  /**
   * Low-level function that renders the given `tokens` using the given `writer`
   * and `context`. The `template` string is only needed for templates that use
   * higher-order sections to extract the portion of the original template that
   * was contained in that section.
   */
  function renderTokens(tokens, writer, context, template) {
    var buffer = '';

    var token, tokenValue, value;
    for (var i = 0, len = tokens.length; i < len; ++i) {
      token = tokens[i];
      tokenValue = token[1];

      switch (token[0]) {
      case '#':
        value = context.lookup(tokenValue);

        if (typeof value === 'object') {
          if (isArray(value)) {
            for (var j = 0, jlen = value.length; j < jlen; ++j) {
              buffer += renderTokens(token[4], writer, context.push(value[j]), template);
            }
          } else if (value) {
            buffer += renderTokens(token[4], writer, context.push(value), template);
          }
        } else if (typeof value === 'function') {
          var text = template == null ? null : template.slice(token[3], token[5]);
          value = value.call(context.view, text, function (template) {
            return writer.render(template, context);
          });
          if (value != null) buffer += value;
        } else if (value) {
          buffer += renderTokens(token[4], writer, context, template);
        }

        break;
      case '^':
        value = context.lookup(tokenValue);

        // Use JavaScript's definition of falsy. Include empty arrays.
        // See https://github.com/janl/mustache.js/issues/186
        if (!value || (isArray(value) && value.length === 0)) {
          buffer += renderTokens(token[4], writer, context, template);
        }

        break;
      case '>':
        value = writer.getPartial(tokenValue);
        if (typeof value === 'function') buffer += value(context);
        break;
      case '&':
        value = context.lookup(tokenValue);
        if (value != null) buffer += value;
        break;
      case 'name':
        value = context.lookup(tokenValue);
        if (value != null) buffer += mustache.escape(value);
        break;
      case 'text':
        buffer += tokenValue;
        break;
      }
    }

    return buffer;
  }

  /**
   * Forms the given array of `tokens` into a nested tree structure where
   * tokens that represent a section have two additional items: 1) an array of
   * all tokens that appear in that section and 2) the index in the original
   * template that represents the end of that section.
   */
  function nestTokens(tokens) {
    var tree = [];
    var collector = tree;
    var sections = [];

    var token;
    for (var i = 0, len = tokens.length; i < len; ++i) {
      token = tokens[i];
      switch (token[0]) {
      case '#':
      case '^':
        sections.push(token);
        collector.push(token);
        collector = token[4] = [];
        break;
      case '/':
        var section = sections.pop();
        section[5] = token[2];
        collector = sections.length > 0 ? sections[sections.length - 1][4] : tree;
        break;
      default:
        collector.push(token);
      }
    }

    return tree;
  }

  /**
   * Combines the values of consecutive text tokens in the given `tokens` array
   * to a single token.
   */
  function squashTokens(tokens) {
    var squashedTokens = [];

    var token, lastToken;
    for (var i = 0, len = tokens.length; i < len; ++i) {
      token = tokens[i];
      if (token) {
        if (token[0] === 'text' && lastToken && lastToken[0] === 'text') {
          lastToken[1] += token[1];
          lastToken[3] = token[3];
        } else {
          lastToken = token;
          squashedTokens.push(token);
        }
      }
    }

    return squashedTokens;
  }

  function escapeTags(tags) {
    return [
      new RegExp(escapeRegExp(tags[0]) + "\\s*"),
      new RegExp("\\s*" + escapeRegExp(tags[1]))
    ];
  }

  /**
   * Breaks up the given `template` string into a tree of token objects. If
   * `tags` is given here it must be an array with two string values: the
   * opening and closing tags used in the template (e.g. ["<%", "%>"]). Of
   * course, the default is to use mustaches (i.e. Mustache.tags).
   */
  function parseTemplate(template, tags) {
    template = template || '';
    tags = tags || mustache.tags;

    if (typeof tags === 'string') tags = tags.split(spaceRe);
    if (tags.length !== 2) throw new Error('Invalid tags: ' + tags.join(', '));

    var tagRes = escapeTags(tags);
    var scanner = new Scanner(template);

    var sections = [];     // Stack to hold section tokens
    var tokens = [];       // Buffer to hold the tokens
    var spaces = [];       // Indices of whitespace tokens on the current line
    var hasTag = false;    // Is there a {{tag}} on the current line?
    var nonSpace = false;  // Is there a non-space char on the current line?

    // Strips all whitespace tokens array for the current line
    // if there was a {{#tag}} on it and otherwise only space.
    function stripSpace() {
      if (hasTag && !nonSpace) {
        while (spaces.length) {
          delete tokens[spaces.pop()];
        }
      } else {
        spaces = [];
      }

      hasTag = false;
      nonSpace = false;
    }

    var start, type, value, chr, token;
    while (!scanner.eos()) {
      start = scanner.pos;

      // Match any text between tags.
      value = scanner.scanUntil(tagRes[0]);
      if (value) {
        for (var i = 0, len = value.length; i < len; ++i) {
          chr = value.charAt(i);

          if (isWhitespace(chr)) {
            spaces.push(tokens.length);
          } else {
            nonSpace = true;
          }

          tokens.push(['text', chr, start, start + 1]);
          start += 1;

          // Check for whitespace on the current line.
          if (chr == '\n') stripSpace();
        }
      }

      // Match the opening tag.
      if (!scanner.scan(tagRes[0])) break;
      hasTag = true;

      // Get the tag type.
      type = scanner.scan(tagRe) || 'name';
      scanner.scan(whiteRe);

      // Get the tag value.
      if (type === '=') {
        value = scanner.scanUntil(eqRe);
        scanner.scan(eqRe);
        scanner.scanUntil(tagRes[1]);
      } else if (type === '{') {
        value = scanner.scanUntil(new RegExp('\\s*' + escapeRegExp('}' + tags[1])));
        scanner.scan(curlyRe);
        scanner.scanUntil(tagRes[1]);
        type = '&';
      } else {
        value = scanner.scanUntil(tagRes[1]);
      }

      // Match the closing tag.
      if (!scanner.scan(tagRes[1])) throw new Error('Unclosed tag at ' + scanner.pos);

      token = [type, value, start, scanner.pos];
      tokens.push(token);

      if (type === '#' || type === '^') {
        sections.push(token);
      } else if (type === '/') {
        // Check section nesting.
        if (sections.length === 0) throw new Error('Unopened section "' + value + '" at ' + start);
        var openSection = sections.pop();
        if (openSection[1] !== value) throw new Error('Unclosed section "' + openSection[1] + '" at ' + start);
      } else if (type === 'name' || type === '{' || type === '&') {
        nonSpace = true;
      } else if (type === '=') {
        // Set the tags for the next time around.
        tags = value.split(spaceRe);
        if (tags.length !== 2) throw new Error('Invalid tags at ' + start + ': ' + tags.join(', '));
        tagRes = escapeTags(tags);
      }
    }

    // Make sure there are no open sections when we're done.
    var openSection = sections.pop();
    if (openSection) throw new Error('Unclosed section "' + openSection[1] + '" at ' + scanner.pos);

    tokens = squashTokens(tokens);

    return nestTokens(tokens);
  }

  mustache.name = "mustache.js";
  mustache.version = "0.7.2";
  mustache.tags = ["{{", "}}"];

  mustache.Scanner = Scanner;
  mustache.Context = Context;
  mustache.Writer = Writer;

  mustache.parse = parseTemplate;

  // Export the escaping function so that the user may override it.
  // See https://github.com/janl/mustache.js/issues/244
  mustache.escape = escapeHtml;

  // All Mustache.* functions use this writer.
  var defaultWriter = new Writer();

  /**
   * Clears all cached templates and partials in the default writer.
   */
  mustache.clearCache = function () {
    return defaultWriter.clearCache();
  };

  /**
   * Compiles the given `template` to a reusable function using the default
   * writer.
   */
  mustache.compile = function (template, tags) {
    return defaultWriter.compile(template, tags);
  };

  /**
   * Compiles the partial with the given `name` and `template` to a reusable
   * function using the default writer.
   */
  mustache.compilePartial = function (name, template, tags) {
    return defaultWriter.compilePartial(name, template, tags);
  };

  /**
   * Compiles the given array of tokens (the output of a parse) to a reusable
   * function using the default writer.
   */
  mustache.compileTokens = function (tokens, template) {
    return defaultWriter.compileTokens(tokens, template);
  };

  /**
   * Renders the `template` with the given `view` and `partials` using the
   * default writer.
   */
  mustache.render = function (template, view, partials) {
    return defaultWriter.render(template, view, partials);
  };

  // This is here for backwards compatibility with 0.4.x.
  mustache.to_html = function (template, view, partials, send) {
    var result = mustache.render(template, view, partials);

    if (typeof send === "function") {
      send(result);
    } else {
      return result;
    }
  };

}));
/* END OF FILE - ..\GenCommon\js\mustache.js - */
/* START OF FILE - ..\GenCommon\js\spa.js - */
// jshint options
/*global _gaq:true, Modernizr:true */

gx.spa = (function ($) {
	var CONTENT_PLACEHOLDER_CLASS = 'gx-content-placeholder',
		GX_SPA_REQUEST_HEADER = 'X-SPA-REQUEST',
		GX_SPA_MASTERPAGE_HEADER = 'X-SPA-MP',
		GX_SPA_GXOBJECT_RESPONSE_HEADER = 'X-GXOBJECT',
		GX_SPA_REDIRECT_URL = 'X-SPA-REDIRECT-URL',
		GX_SPA_RETURN = 'X-SPA-RETURN',
		SERVER_REQUEST_DEFAULT_TIMEOUT = 5000,
		TRANSITION_TIMEOUT = 800,
		SPA_NOT_SUPPORTED_STATUS_CODE = 530,
		ENTERING_FX_CLASS = 'entering',
		LEAVING_FX_CLASS = 'leaving',
		ENTER_FX_DURATION_CLASS = 'enter-fx-duration',
		LEAVE_FX_DURATION_CLASS = 'leave-fx-duration',
		HEAD_ELEMENT_PATTERN = "<head[^>]*>([\\s\\S]*?)<\/head>",
		HEAD_ELEMENT_REGEX = new RegExp(HEAD_ELEMENT_PATTERN, "i"),
		BODY_ELEMENT_PATTERN = "(<body[^>]*>[\\s\\S]*?<\/body>)",
		BODY_ELEMENT_REGEX = new RegExp(BODY_ELEMENT_PATTERN, "i"),
		TITLE_ELEMENT_PATTERN = "<title[^>]*>([\\s\\S]*?)<\/title>",
		TITLE_ELEMENT_REGEX = new RegExp(TITLE_ELEMENT_PATTERN, "i");
		
	var navigating = false,
		transitioning = false,
		initialUrl = window.location.href,
		initialPop = true;

	// Used to keep a reference to click and popstate handles.
	var handleClick, handlePopState;

	if ('state' in window.history) {
		initialPop = false;
	}
	
	return {
		// Default server request timeout
		timeout: SERVER_REQUEST_DEFAULT_TIMEOUT,

		isSameApp: function (location, parsedUrl) {
			var samePort = location.port === parsedUrl.port;
			samePort = samePort || (location.port === "" && location.protocol === "http:" && parsedUrl.port === "80");
			samePort = samePort || (location.port === "" && location.protocol === "https:" && parsedUrl.port === "443");
			return location.protocol === parsedUrl.protocol && location.hostname === parsedUrl.hostname && samePort;
		},

		handleClick: function (event) {
			var link = this.getTarget(event);

			if (!link)
				return;

			if (link.tagName.toUpperCase() !== 'A')
				return;

			if (link.getAttribute('href') === null || link.getAttribute('href') === undefined)
				return;

			// Ignore _blank, _parent, _top and named targets when they are different from the current browsing context.
			if (link.target && (link.target == '_blank' || (link.target == '_parent' && window.parent != window) || (link.target == '_top' && window.top != window) || (link.target.substr(0, 1) != '_' && window.name != link.target)))
				return;

			// Middle click, cmd click, and ctrl click should open
			// links in a new tab as normal.
			if (event.which > 1 || event.metaKey || event.ctrlKey)
				return;

			var parsedUrl = this.parseUrl(link.href);
			// Ignore cross origin links
			if (!this.isSameApp(location, parsedUrl)) 
				return;

			// Ignore links to resources outside current path (images or other static resources are ignored)
			var targetPath = (parsedUrl.pathname.charAt(0) == '/' ? parsedUrl.pathname : '/' + parsedUrl.pathname);
			if (location.pathname.substring(0, location.pathname.lastIndexOf('/')) !== targetPath.substring(0, targetPath.lastIndexOf('/')))
				return;

			// Ignore anchors on the same page and empty anchor "foo.html#"
			if (parsedUrl.href.replace( /#.*/,'') === location.href.replace( /#.*/,''))
				return;

			// Ignore empty href
			if (link.getAttribute('href') === '')
				return;

			// Ignore javascript: anchors
			if (link.href.indexOf('javascript:') === 0)
				return;
			
			// Hack for ignore Click. Used for HistoryManager
			if (this.ignoreClick) {
				this.ignoreClick = false;
				return;
			}
			
			this.navigate({
				url: link.href,
				push: true,
				scrollTo: true,
				direction: 'forward'
			});

			event.preventDefault();
		},

		redirect: function (url, push) {
			delete(gx.referrer);
			push = (push === undefined) || push;
			var parsedUrl = this.parseUrl(url),
				targetPath = (parsedUrl.pathname.charAt(0) == '/' ? parsedUrl.pathname : '/' + parsedUrl.pathname);
			// Ignore cross origin links
			if (!this.isSameApp(location, parsedUrl)) {
				window.location = url;
			}
			// Ignore links to resources outside current path (images or other static resources are ignored)
			else if (location.pathname.substring(0, location.pathname.lastIndexOf('/')) !== targetPath.substring(0, targetPath.lastIndexOf('/'))) {
				window.location = url;
			}
			else {
				gx.referrer = location.href;
				this.navigate({
					url: url,
					push: push,
					scrollTo: true,
					direction: 'forward'
				});
			}
		},

		setLocation: function (url) {
			if (gx.util.browser.isFirefox()) {
				// This is to avoid a FF bug. If location is set in a callback of an AJAX request to the same url,
				// the AJAX response is loaded, instead of the server response to the standard request.
				setTimeout(function () {
					window.location.href = url;
				}, 100);
			}
			else {
				window.location = url;
			}
		},

		canNavigate: function () {
			return !navigating && !transitioning;
		},

		navigate: function (options) {
			var timeoutTimer,
				request,
				url = options.url;

			if (!this.canNavigate()) {
				this.setLocation(url);
				return;
			}
			navigating = true;

			this.notify('onbeforenavigate', [url]);

			request = this.request;

			// Current request is cancelled if we're already retrieving a page.
			if (request && request.readyState < 4) {
				request.onreadystatechange = gx.emptyFn;
				gx.dbg.logMsg('Request cancelled as data ir already being retrieved: ' + request.readyState);
				request.abort();
			}

			request = gx.http.doCall({
				method: 'GET',
				url: url,
				handler: function (type, responseText, req) {
					var redirectUrl = req.getResponseHeader(GX_SPA_REDIRECT_URL),
						gxObjectClass = req.getResponseHeader(GX_SPA_GXOBJECT_RESPONSE_HEADER);

					if (timeoutTimer)
						clearTimeout(timeoutTimer)

					if (req.status == SPA_NOT_SUPPORTED_STATUS_CODE) {
						this.setLocation(url);
						return;
					}

					if (redirectUrl) {
						navigating = false;
						setTimeout(gx.spa.redirect.closure(gx.spa, [redirectUrl]), 100);
						return;
					}

					// If the response does not support SPA, do not push the new URL (for example, a PDF)
					if (options.push && request.readyState > 0 && gxObjectClass) {
						this.updateState();
						this.state = this.createState(options);
						// Replace history entry
						window.history.pushState(null, "", url)
					}

					this.processResponse.call(this, responseText, req, options);
				},
				beforeSend: function (req) {
					this.notify('onbeforesend', [this.createEvent(req, url), GX_SPA_REQUEST_HEADER, GX_SPA_MASTERPAGE_HEADER]);
					timeoutTimer = setTimeout(this.timeoutHandler.closure(this, [req, url]), this.timeout);
					req.setRequestHeader(GX_SPA_REQUEST_HEADER, '1');
				},
				error: function (req) {
					var eventObject = this.createEvent(req, url);
					eventObject.cancel = true; // Cancel by default
					this.notify('onerror', [eventObject]);
					if (eventObject.cancel) {
						this.setLocation(url);
					}
				},
				ajaxHeader: false,
				avoidCache: false,
				handleAllStatusCodes: true,
				obj: this
			});

			this.request = request;

			this.notify('onnavigatestart', [url]);
		},

		processResponse: function (responseText, req, options) {
			try {
				var url = options.url,
					parsedUrl = this.parseUrl(url),
					hash = parsedUrl.hash,
					direction = options.direction,
					gxObjectClass = req.getResponseHeader(GX_SPA_GXOBJECT_RESPONSE_HEADER),
					gxReturnCmd = req.getResponseHeader(GX_SPA_RETURN),
					eventObject = this.createEvent(req, url),
					sourceMpObj = gx.pO.MasterPage,
					sourceMpClass = gx.pO.MasterPage ? gx.pO.MasterPage.ServerClass : "",
					targetMpClass = req.getResponseHeader(GX_SPA_MASTERPAGE_HEADER) || "",
					sameMp = !(sourceMpClass === "" || sourceMpClass.toLowerCase() != targetMpClass.toLowerCase()),
					placeholder = this.getContentPlaceholder(),
					processCodeCallback;

				if (gxReturnCmd != null) {
					gx.evt.clinav = true;
					gx.fn.closeWindow(gxReturnCmd);	
					return;
				}

				// If the response does not support SPA, redirect (for example, a PDF)
				if (!gxObjectClass) {
					this.setLocation(url);
					return;
				}

				this.notify('onbeforeprocessresponse', [eventObject, responseText, gxObjectClass, sourceMpClass, targetMpClass, sameMp]);

				var contents = this.extractContents(req, !sameMp),
					oldContent = sameMp ? placeholder.firstChild : document.body,
					newContent = contents.body;

				if (!contents.body) {
					this.setLocation(url);
					return;
				}

				this.state = this.createState(options);

				if (options.push) {
					window.history.replaceState(this.state, '', url)
				}

				if (contents.title) {
					document.title = contents.title;
				}

				this.notify('onbeforecontentreplace', [req, url, contents]);

				gx.cache.removeRemoteFile(gx.getThemeElement().href);
				gx.dom.replaceWithFx(oldContent, newContent, {
					domRemove: false,
					domAdd: sameMp,
					enteringClass: (direction == 'forward' ? ENTERING_FX_CLASS : LEAVING_FX_CLASS),
					leavingClass: (direction == 'forward' ? LEAVING_FX_CLASS : ENTERING_FX_CLASS),
					enterDurationClass: (direction == 'forward' ? ENTER_FX_DURATION_CLASS : LEAVE_FX_DURATION_CLASS),
					leaveDurationClass: (direction == 'forward' ? LEAVE_FX_DURATION_CLASS : ENTER_FX_DURATION_CLASS),
					transitionTimeout: TRANSITION_TIMEOUT,
					transitionEndCallback: (function () {
						newContent = this.replaceContentCallback(req, url, hash, responseText, placeholder, contents, oldContent, newContent, options, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp);
						if (!sameMp) {
							gx.html.processCode(contents.head.innerHTML + contents.body.innerHTML, false, this.processCodeCallback.closure(this, [req, url, hash, responseText, placeholder, contents, oldContent, newContent, options, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp]), null, null, false);
						}
						transitioning = false;
						this.recoverScrollPosition(options);
						return newContent;
					}).closure(this),
					beforeTransitionStart: (function (applyTransFn) {
						transitioning = true;
						if (sameMp) {
							gx.html.processCode(responseText, false, (function () {
								if (applyTransFn) {
									applyTransFn();
								}
								this.processCodeCallback(req, url, hash, responseText, placeholder, contents, oldContent, newContent, options, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp);
							}).closure(this), null, null, false);
							return true;
						}
					}).closure(this)
				});

			}
			catch (e) {
				gx.dbg.logEx(e, 'gxspa.js', 'processResponse');
				this.setLocation(url);
			}
		},

		replaceContentCallback: function (req, url, hash, responseText, placeholder, contents, oldContent, newContent, options, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp) {
			if (sameMp) {
				if (oldContent.parentNode) {
					oldContent.parentNode.removeChild(oldContent);
				}
			}
			else {
				if (gx.util.browser.isWebkit()) {
					document.body.parentNode.removeChild(document.body);
					var newBody = document.createElement('body');
					var attributes = $(newContent).prop("attributes");
					$.each(attributes, function() {
						$(newBody).attr(this.name, this.value);
					});
					document.documentElement.appendChild(newBody);
					newBody.innerHTML = newContent.innerHTML;
					newContent = newBody;
				}
				else {
					document.body = newContent;
					newContent = document.body; // WA for WebKit: After setting document.body, newContent reference is different from document.body
				}
				document.head = contents.head;
			}
			return newContent;
		},

		processCodeCallback: function (req, url, hash, responseText, placeholder, contents, oldContent, newContent, options, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp) {
			var eventObject = this.createEvent(req, url);

			try {
				this.notify('oncontentreplace', [eventObject, responseText, contents, gxObjectClass, sourceMpObj, sourceMpClass, targetMpClass, sameMp]);
			}
			catch (e) {
				gx.dbg.logEx(e, 'gxspa.js', 'processCodeCallback');
				this.setLocation(url);
			}

			var recoverScrollPosition = true;
			if (options.scrollTo) {
				window.scrollTo(0, 0);
				recoverScrollPosition = false;
			}

			// Google Analytics support
			if (options.push && window._gaq)
				_gaq.push(['_trackPageview']);

			// If the URL has a hash in it, make sure the browser
			// knows to navigate to the hash.
			if (hash !== '') {
				// Avoid using simple hash set here. Will add another history
				// entry. Replace the url with replaceState and scroll to target
				// by hand.
				//
				//   window.location.hash = hash
				var parsedUrl = this.parseUrl(url)
				parsedUrl.hash = hash
				window.history.replaceState(this.state, "", parsedUrl.href)

				var target = gx.dom.el(parsedUrl.hash)
				if (target) {
					target.scrollIntoView(true);
					recoverScrollPosition = false;
				}
			}

			this.notify('onnavigate', [url]);
			navigating = false;

			if (recoverScrollPosition) {
				this.recoverScrollPosition(options);
			}
		},

		timeoutHandler: function (req, url) {
			var eventObject = this.createEvent(req, url);
			eventObject.cancel = true; // Cancel by default
			this.notify('ontimeout', [eventObject]);
			if (eventObject.cancel) {
				req.abort();
				gx.dbg.logMsg('Request cancelled - timeout expired: ' + req.readyState);
				this.setLocation(url);
			}
		},

		getContentPlaceholder: function () {
			return gx.dom.byClass(CONTENT_PLACEHOLDER_CLASS)[0];
		},

		extractContents: function (req, isDocument) {
			var div = document.createElement('div'),
				contents = {},
				result;
			var headHTML,
				bodyHTML,
				iframe,
				iframeHead;


			if (isDocument) {
				iframe = document.createElement('iframe');
				iframe.src = 'about:blank';
				iframe.style.display = 'none';
				document.body.appendChild(iframe);
				var match = req.responseText.match(HEAD_ELEMENT_REGEX);
				if (match.length > 1) {
					headHTML = match[1];
				}
				match = req.responseText.match(BODY_ELEMENT_REGEX);
				if (match.length > 0) {
					bodyHTML = match[0];
				}
				match = req.responseText.match(TITLE_ELEMENT_REGEX);
				if (match.length > 1) {
					contents.title = match[1];
				}
				iframe.contentDocument.body.outerHTML = bodyHTML;
				iframeHead = iframe.contentDocument.head;
				iframeHead.innerHTML = headHTML;
				$('head script').each(function (i, script) {
					$(iframeHead).find('script').each(function (j, iframeScript) {
						if (script.src == iframeScript.src)
							iframeHead.removeChild(iframeScript);
					});
				});
				contents.body = iframe.contentDocument.body;
				contents.head = iframeHead;
			}
			else {
				gx.html.setInnerHtml(div, req.responseText, false, false, false);

				result = gx.dom.byClass(CONTENT_PLACEHOLDER_CLASS, 'div', div);
				if (result.length === 0)
					return contents;

				contents.body = result[0].firstChild;

				result = gx.dom.byTag('title', div);
				if (result.length > 0)
					contents.title = result[0].innerText || result[0].textContent;
			}
			return contents;
		},

		handlePopState: function (event) {
			var state = event.state,
				placeholder = this.getContentPlaceholder();

			if (state && state.source == "gx-spa") {
				// When coming forward from a separate history session, will get an
				// initial pop with a state we are already at. Skip reloading the current
				// page.
				if (initialPop && initialURL == state.url)
					return;

				var direction = this.state.id < state.id ? 'forward' : 'back';

				this.navigate({
					id: state.id,
					url: state.url,
					push: false,
					scrollPosition: state.scrollPosition,
					direction: direction
				});

				// Force reflow/relayout before the browser tries to restore the
				// scroll position.
				if (placeholder) {
					void (placeholder.offsetHeight);
				}
			}
		},

		parseUrl: function (url) {
			var a = document.createElement('a');
			a.href = url;
			return a;
		},

		createEvent: function (req, url) {
			return {
				req: req,
				url: url,
				cancel: false
			};
		},

		recoverScrollPosition: function (options) {
			// Recover scroll position when transitions and navigation have ended (this.canNavigate() === true)
			var scrollPos = options.scrollPosition;
			if (this.canNavigate() && !options.scrollTo && scrollPos) {
				window.scrollTo(scrollPos.x, scrollPos.y);
			}
		},

		updateState: function () {
			var state = this.state;
			state.scrollPosition = {
				x: window.scrollX,
				y: window.scrollY
			};
			window.history.replaceState(state, '', state.url)
		},

		createState: function (options) {
			options = options || {};
			return {
				id: options.id || (new Date()).getTime(),
				source: "gx-spa",
				url: options.url
			};
		},

		getTarget: function (evt) {
			if (evt.target && evt.target.tagName == 'A') {
				return evt.target;
			}
			return gx.dom.findParentByTagName(evt.target, 'A');
		},

		applyConfig: function (config) {
			if (config) {
				if (config.listeners) {
					for (var eventName in config.listeners) {
						var fn = config.listeners[eventName];
						if (typeof (fn) == 'function')
							this.addObserver(eventName, config.listeners.scope || this, fn);
					}
				}
			}
		},

		setBodyClass: function () {
			var className = "Form",
				body = document.body;
			if (body.className) {
				className = body.className.split(" ")[0];
			}
			if (!gx.dom.hasClass(body, className + '-fx')) {
				gx.dom.addClass(body, className + '-fx');
			}
		},

		isSupported: function () {
			// SPA is not enabled when:
			// - FullAjax is disabled
			// - History API is not supported by the browser
			// - The browser is Chrome and the webpage is running inside an iframe (Chrome bug)
			return gx.pO.fullAjax && Modernizr.history && !(gx.util.browser.isChrome() && window.parent != window);
		},

		start: function (config) {
			if (this.isSupported() && !this.started) {
				this.applyConfig(config);
				handleClick = this.handleClick.closure(this);
				handlePopState = this.handlePopState.closure(this);
				document.addEventListener('click', handleClick, false);
				window.addEventListener('popstate', handlePopState, false);
				this.state = this.createState({
					url: location.href
				});
				window.history.replaceState(this.state, document.title);
				this.setBodyClass();
				this.started = true;
			}
		},

		stop: function () {
			if (this.started) {
				document.removeEventListener('click', handleClick, false);
				window.removeEventListener('popstate', handlePopState, false);
				this.started = false;
			}
		}
	};
})(gx.$);

// Mixin with gx.util.Observable
gx.lang.apply(gx.spa, new gx.util.Observable());
/* END OF FILE - ..\GenCommon\js\spa.js - */
