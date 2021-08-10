(function ($) {
	var editEnabledHelper = function (control, value) {
		var $span = $(control).parent().find('span');
		if (gx.lang.gxBoolean(value)) {
			$span.parent("p").hide();
		}
		else {
			$span.removeClass("form-control");
			if ($span.parent("p").length == 0) {
				gx.plugdesign.applyTemplateOnElement("readonly-atts-vars", $span[0]);
			}
			else {
				$span.parent("p").show();
			}
		}
	};

	var editVisibleHelper = function (control, value) {
		var $formGroup = $(control).parents('.gx-form-group');
		if (gx.lang.gxBoolean(value)) {
			$formGroup.show();
		}
		else {
			$formGroup.hide();
		}
	};

	// Attributes and variables
	new gx.plugdesign.Template({
		name: 'atts-vars',
		selector:'.gx-attribute > input:not(.GeoLocOption), .gx-attribute > select, .gx-attribute > textarea, .gx-attribute > img:first-child',
		initialize: function (context) {
			var el = $("#" + context.id)[0],
				spanEl = $("#span_" + el.id)[0],
				visible = gx.fn.isVisible(el, 0);

			if (el.tagName != 'IMG' && spanEl) {
				visible = visible || gx.fn.isVisible(spanEl, 0);
			}
			editVisibleHelper(el, visible);
		},
		listeners: {
			control: function (context) {
				return context.id;
			},
			after: {
				"Enabled": editEnabledHelper,
				"Visible": editVisibleHelper
			}
		}
	});

	var readonlyVisibleHelper = function (control, value) {
		var $span = $(control);
		if (gx.lang.gxBoolean(value)) {
			$span.parent("p").show();
		}
		else {
			$span.parent("p").hide();
		}
		editVisibleHelper(control, value);
	};

	// Readonly attributes/vars
	new gx.plugdesign.Template({
		name: 'readonly-atts-vars',
		selector: '.gx-attribute span[class^="Readonly"]:not(:has(input[type="checkbox"]))',
		template: '<p class="form-control-static">{{{outerHTML}}}</p>',
		outerHTML: true,
		initialize: function (context) {
			var el = $("#" + context.id)[0];
			readonlyVisibleHelper(el, gx.fn.isVisible(el, 0));
		},
		listeners: {
			control: function (context) {
				return context.id;
			},
			after: {
				"Visible": readonlyVisibleHelper
			}
		}
	});

	// Checkboxes
	new gx.plugdesign.Template({
		name: 'checkbox',
		selector: '.gx-attribute label:has(input[type="checkbox"])',
		template: '<div class="checkbox">{{{outerHTML}}}</div>',
		outerHTML: true,
		setContext: function (context, el) {
			context.id = $(el).find('input[type="checkbox"]')[0].id;
			return context;
		},
		initialize: function (context) {
			var $el = $("#" + context.id);
			editVisibleHelper($el[0], gx.fn.isVisible($el.parent()[0], 0));
		},
		listeners: {
			control: function (context) {
				return context.id;
			},
			after: {
				"Visible": function (control, value) {
					var $checkBoxCt = $(control).parents('.checkbox');
					if (gx.lang.gxBoolean(value)) {
						$checkBoxCt.show();
					}
					else {
						$checkBoxCt.hide();
					}
					editVisibleHelper.apply(this, arguments);
				}
			}
		}
	});

	// Datepickers
	var datePickerVisibleHandler = function (control, value) {
		this.visible = value;
		var $trigger = $(control).parent().find('.input-group-btn');
		if (gx.lang.gxBoolean(value) && gx.fn.isVisible(control, 0)) {
			if (this.enabled || this.enabled === undefined) {
				$trigger.show();
			}
		}
		else {
			$trigger.hide();
		}

		editVisibleHelper(control, value);
	};
	new gx.plugdesign.Template({
		name: 'datepicker',
		selector: '.dp_container:has(img):has(input)',
		template: '<div class="dp_container" id="{{datePickerCt.id}}"><div class="input-group">{{{inputEl.outerHTML}}}{{{spaneElHtml}}}<span class="input-group-btn"><a class="btn btn-default">{{{imgEl.outerHTML}}}</a></span></div></div>',
		outerHTML: true,
		setContext: function (context, el) {
			context.datePickerCt = el;
			context.inputEl = $(el).find('input')[0];
			context.imgEl = $(el).find('img')[0];
			context.inputElId = context.inputEl.id;
			var $span = $("#span_" + context.inputEl.id);
			if ($span.length > 0) {
				var pEl = $span.parent("p")[0];
				context.spaneElHtml = (pEl) ? pEl.outerHTML : $span[0].outerHTML;
			}
			return context;
		},
		initialize: function (context) {
			var $inputEl = $('#' + context.inputElId);
			var parent = $inputEl.parents('.dp_container');
			parent.find('a').click(function (evtObj) { 
				try {
					if (evtObj.target.nodeName != 'IMG') {
						parent.find('img')[0].click();
						return false;
					}
				}
				catch(e) {
					return false;
				}
			});

			var visible = gx.fn.isVisible($inputEl[0], 0);
			var $span = $("#span_" + context.inputEl.id);
			if ($span.length > 0) 
				visible = visible || gx.fn.isVisible($span[0], 0);
			datePickerVisibleHandler.call(this, $inputEl[0], visible);
		},
		listeners: {
			control: function (context) {
				return context.inputEl.id;
			},
			after: {
				"Enabled": function (control, value) {
					this.enabled = gx.lang.gxBoolean(value);
					var $trigger = $(control).parent().find('.input-group-btn');
					if (gx.lang.gxBoolean(value)) {
						if (this.visible || this.visible == undefined) {
							$trigger.show();
						}
					}
					else {
						$trigger.hide();
					}

					editEnabledHelper(control, value);
				},
				"Visible": datePickerVisibleHandler
			}
		}
	});

	// Vertical radio buttons
	new gx.plugdesign.Template({
		name: 'vertical-radio-button',
		selector: '.gx-attribute table td:has(input[type="radio"])',
		template: '<td><div class="radio">{{{innerHTML}}}</div></td>',
		innerHTML: true,
		setContext: function (context, el) {
			context.id = $(el).find('input[type="radio"]')[0].name;
			context.tableEl = $(el).parents("table.gx-radio-button")[0];
			return context;
		},
		initialize: function (context) {
			editVisibleHelper(context.tableEl, gx.fn.isVisible(context.tableEl, 0));
		},
		listeners: {
			control: function (context) {
				return context.id;
			},
			after: {
				"Visible": editVisibleHelper
			}
		}
	});

	// Horizontal radio buttons
	new gx.plugdesign.Template({
		name: 'horizontal-radio-button',
		selector: '.gx-attribute span input[type="radio"]',
		template: '{{{outerHTML}}}{{labelText}}',
		outerHTML: true,
		setContext: function (context, el) {
			var grabNextTextNode = false;
			var textNode;
			if (el) {
				$(el).parent().contents().each(function(i){
					if (grabNextTextNode && this.nodeType == 3){
						textNode = this;
						return false;
					}
					if (this == el){
						grabNextTextNode = true;
					}
				})
				context.labelText = $(textNode).remove().text().trim();
				$(el).parent().contents("script").remove();
				$(el).parent("label").addClass("radio-inline");
			}
			context.spanEl = $(el).parents('span.gx-radio-button')[0];
			return context;
		},
		initialize: function (context) {
			editVisibleHelper(context.spanEl, gx.fn.isVisible(context.spanEl, 0));
		},
		listeners: {
			control: function (context) {
				return context.name;
			},
			after: {
				"Visible": editVisibleHelper
			}
		}
	});

	// Prompts
	new gx.plugdesign.Template({
		name: 'prompt',
		selector: function (baseSelector) {
			return $(baseSelector + ' input + a img[id*="PROMPT"]').parent().prev().filter(function (i, el) {
				return gx.fn.isVisible(el, 0);
			});
		},
		template: '<div class="input-group">{{{inputEl.outerHTML}}}<span class="input-group-btn">{{{promptEl}}}</span></div>',
		setContext: function (context, el) {
			context.inputEl = el;
			context.promptEl = $(el).next().addClass("btn btn-default").remove()[0].outerHTML;
			return context;
		},
		listeners: {
			control: function (context) {
				return context.inputEl.id;
			},
			before: {
				"Visible": function (control, value) {
					var $parent = $(control).parent();
					if (gx.lang.gxBoolean(value)) {
						$parent.show();
					}
					else {
						$parent.hide();
					}
				},
				"Enabled": function (control, value) {
					var $trigger = $(control).parent().find('.input-group-btn');
					if (gx.lang.gxBoolean(value)) {
						$trigger.show();
					}
					else {
						$trigger.hide();
					}
				}
			}
		}
	});

	// GeoLocation
	var geolocationVisibleHandler = function (control, value) {
		var $parent = $(control).parent();
		if (gx.lang.gxBoolean(value)) {
			$parent.show();
		}
		else {
			$parent.hide();
		}
	};
	new gx.plugdesign.Template({
		name: 'geolocation',
		selector: 'input + input.GeoLocOption',
		template: '<div class="input-group"><div id="{{inputEl.id}}_hook"></div><span class="input-group-btn"><a class="btn btn-default"><div id="{{inputEl.id}}_trigger_hook"></div></a></span></div>',
		setContext: function (context, el) {
			context.inputEl = $(el).prev()[0];
			context.triggerEl = $(el)[0];
			return context;
		},
		initialize: function (context) {
			$("#" + context.inputEl.id + "_hook").replaceWith(context.inputEl);
			$("#" + context.inputEl.id + "_trigger_hook").replaceWith(context.triggerEl);
			geolocationVisibleHandler.call(this, context.inputEl, gx.fn.isVisible(context.inputEl, 0));
		},
		listeners: {
			control: function (context) {
				return context.inputEl.id;
			},
			before: {
				"Visible": geolocationVisibleHandler,
				"Enabled": function (control, value) {
					var $trigger = $(control).parent().find('.input-group-btn');
					if (gx.lang.gxBoolean(value)) {
						$trigger.show();
					}
					else {
						$trigger.hide();
					}
				}
			}
		}

	});

	// Multimedia upload dialog
	new gx.plugdesign.Template({
		name: 'multimedia-upload',
		selector: '.gx-multimedia-upload .fields-ct',
		template: [	'<div class="row">',
						'<div class="col-sm-4">',
							'<div class="row">',
								'<div class="col-sm-12">',
									'<div id="{{fileField.id}}_fileOption_hook"></div>',
								'</div>',
								'<div class="col-sm-12">',
									'<div id="{{fileField.id}}_uriOption_hook"></div>',
								'</div>',
							'</div>',
						'</div>',
						'<div class="col-sm-8">',
							'<div id="{{fileField.id}}_uriField_hook"></div>',
							'<div id="{{fileField.id}}_fileField_hook"></div>',
						'</div>',
					'</div>',
					'<div class="row">',
						'<div class="col-sm-12">',
							'<div id="{{fileField.id}}_button_hook"></div>',
						'</div>',
					'</div>'
		].join(""),
		applyTo: 'inner',
		setContext: function (context, el) {
			var container = $(el).parents(".gx-multimedia-upload")[0];
			var multimediaEls = gx.html.multimediaUpload.getElements(container);
			multimediaEls.fileOptionLbl = multimediaEls.fileOption.parentNode.cloneNode(true);
			multimediaEls.uriOptionLbl = multimediaEls.uriOption.parentNode.cloneNode(true);
			gx.lang.apply(context, multimediaEls);
			context.container = container;
			return context;
		},
		initialize: function (context) {
			$("#" + context.fileField.id + "_fileOption_hook").replaceWith(context.fileOptionLbl);
			$("#" + context.fileField.id + "_uriOption_hook").replaceWith(context.uriOptionLbl);
			$("#" + context.fileField.id + "_uriField_hook").replaceWith(context.uriField);
			$("#" + context.fileField.id + "_fileField_hook").replaceWith(context.fileField);
			var $button = $(context.container).find('input[type="button"]');
			$("#" + context.fileField.id + "_button_hook").replaceWith($button[0]);
			$button.attr("class", "btn btn-default Button");
			$(context.uriField).addClass('form-control');
		}
	});
}(gx.$));
