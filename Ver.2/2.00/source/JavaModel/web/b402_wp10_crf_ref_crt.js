gx.evt.autoSkip=!1;
gx.define("b402_wp10_crf_ref_crt",!1,function(){this.ServerClass="b402_wp10_crf_ref_crt";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e11152_client");this.addKeyListener("11","e12152_client");this.SetStandaloneVars=function(){this.AV15P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV13P_CRF_ID=gx.fn.getIntegerValue("vP_CRF_ID",",")};this.Validv_D_study_id=function(){try{var a=gx.util.balloon.getNew("vD_STUDY_ID");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.s122_client=function(){this.AV12H_SRCH_FLG="0";this.AV17W_A821_JS=""};this.s152_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");if(""!=this.AV17W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+this.AV17W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e11152_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e12152_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e15152_client=function(){this.executeServerEvent("VD_STUDY_ID.CLICK",true)};this.e17152_client=function(){this.executeServerEvent("ENTER",true)};
this.e18152_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,20,26,31,33,36,38,43,46,47,48,49,50,51];this.GXLastCtrlId=51;b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TBL_UPD_BTNSET",grid:0};b[15]={fld:"TEXTBLOCK42",format:0,grid:0};b[17]={fld:"TEXTBLOCK46",format:0,grid:0};b[20]={fld:"TABLE4",grid:0};b[26]={fld:"TABLE5",grid:0};b[31]={fld:"TEXTBLOCK63",format:0,grid:0};b[33]={lvl:0,type:"int",len:10,dec:0,sign:false,
pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Validv_D_study_id,isvalid:null,rgrid:[],fld:"vD_STUDY_ID",gxz:"ZV8D_STUDY_ID",gxold:"OV8D_STUDY_ID",gxvar:"AV8D_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV8D_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.ZV8D_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setComboBoxValue("vD_STUDY_ID",gx.O.AV8D_STUDY_ID);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV8D_STUDY_ID=gx.num.intval(this.val())},
val:function(){return gx.fn.getIntegerValue("vD_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(33,function(){});b[36]={fld:"TEXTBLOCK65",format:0,grid:0};b[38]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRF_ID",gxz:"ZV7D_CRF_ID",gxold:"OV7D_CRF_ID",gxvar:"AV7D_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV7D_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.ZV7D_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setComboBoxValue("vD_CRF_ID",
gx.O.AV7D_CRF_ID);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV7D_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vD_CRF_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(38,function(){});b[43]={fld:"TBL_HIDDEN",grid:0};b[46]={fld:"TXT_JS_EVENT",format:1,grid:0};b[47]={fld:"TXT_PDF",format:1,grid:0};b[48]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV9H_INIT_FLG",
gxold:"OV9H_INIT_FLG",gxvar:"AV9H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9H_INIT_FLG=a},v2z:function(a){gx.O.ZV9H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV9H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV9H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(48,function(){});b[49]={lvl:0,type:"int",len:2,dec:0,sign:false,
pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_ITEM_KBN",gxz:"ZV10H_ITEM_KBN",gxold:"OV10H_ITEM_KBN",gxvar:"AV10H_ITEM_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10H_ITEM_KBN=gx.num.intval(a)},v2z:function(a){gx.O.ZV10H_ITEM_KBN=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vH_ITEM_KBN",gx.O.AV10H_ITEM_KBN,0)},c2v:function(){gx.O.AV10H_ITEM_KBN=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vH_ITEM_KBN",",")},
nac:gx.falseFn};b[50]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_SRCH_FLG",gxz:"ZV12H_SRCH_FLG",gxold:"OV12H_SRCH_FLG",gxvar:"AV12H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_SRCH_FLG=a},v2z:function(a){gx.O.ZV12H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV12H_SRCH_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV12H_SRCH_FLG=this.val()},
val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:gx.falseFn};this.declareDomainHdlr(50,function(){});b[51]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV11H_KNGN_FLG",gxold:"OV11H_KNGN_FLG",gxvar:"AV11H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_KNGN_FLG=a},v2z:function(a){gx.O.ZV11H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV11H_KNGN_FLG,0)},
c2v:function(){gx.O.AV11H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};this.OV7D_CRF_ID=this.ZV7D_CRF_ID=this.AV7D_CRF_ID=this.OV8D_STUDY_ID=this.ZV8D_STUDY_ID=this.AV8D_STUDY_ID=0;this.OV9H_INIT_FLG=this.ZV9H_INIT_FLG=this.AV9H_INIT_FLG="";this.OV10H_ITEM_KBN=this.ZV10H_ITEM_KBN=this.AV10H_ITEM_KBN=0;this.OV11H_KNGN_FLG=this.ZV11H_KNGN_FLG=this.AV11H_KNGN_FLG=this.OV12H_SRCH_FLG=this.ZV12H_SRCH_FLG=this.AV12H_SRCH_FLG="";this.AV7D_CRF_ID=this.AV8D_STUDY_ID=
0;this.AV9H_INIT_FLG="";this.AV10H_ITEM_KBN=0;this.AV11H_KNGN_FLG=this.AV12H_SRCH_FLG="";this.AV13P_CRF_ID=this.AV15P_STUDY_ID=0;this.A367TBM21_STUDY_NM=this.A369TBM21_DEL_FLG=this.A607TBM21_STATUS="";this.A63TBM21_STUDY_ID=0;this.A397TBM31_DEL_FLG=this.A643TBM31_STATUS="";this.A68TBM31_STUDY_ID=0;this.A393TBM31_CRF_NM="";this.A69TBM31_CRF_ID=0;this.AV17W_A821_JS="";this.Events={e11152_client:["'BTN_REG'",true],e12152_client:["'BTN_CAN'",true],e15152_client:["VD_STUDY_ID.CLICK",true],e17152_client:["ENTER",
true],e18152_client:["CANCEL",true]};this.setVCMap("AV15P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV13P_CRF_ID","vP_CRF_ID",0,"int");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0041",lvl:1})});gx.setParentObj(new b402_wp10_crf_ref_crt);
