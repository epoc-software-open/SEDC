gx.evt.autoSkip=!1;
gx.define("b402_wp11_crf_designer",!1,function(){this.ServerClass="b402_wp11_crf_designer";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.SetStandaloneVars=function(){this.AV10P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV9P_CRF_ID=gx.fn.getIntegerValue("vP_CRF_ID",",")};this.s122_client=function(){};this.e141a2_client=function(){this.executeServerEvent("ENTER",true)};this.e151a2_client=function(){this.executeServerEvent("CANCEL",
true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,6,7];this.GXLastCtrlId=7;b[2]={fld:"TBL_HIDDEN",grid:0};b[5]={fld:"TXT_JS_EVENT",format:1,grid:0};b[6]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV7H_INIT_FLG",gxold:"OV7H_INIT_FLG",gxvar:"AV7H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7H_INIT_FLG=a},v2z:function(a){gx.O.ZV7H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",
gx.O.AV7H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV7H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(6,function(){});b[7]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV8H_KNGN_FLG",gxold:"OV8H_KNGN_FLG",gxvar:"AV8H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8H_KNGN_FLG=
a},v2z:function(a){gx.O.ZV8H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV8H_KNGN_FLG,0)},c2v:function(){gx.O.AV8H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};this.AV8H_KNGN_FLG=this.AV7H_INIT_FLG=this.OV8H_KNGN_FLG=this.ZV8H_KNGN_FLG=this.AV8H_KNGN_FLG=this.OV7H_INIT_FLG=this.ZV7H_INIT_FLG=this.AV7H_INIT_FLG="";this.AV9P_CRF_ID=this.AV10P_STUDY_ID=0;this.Events={e141a2_client:["ENTER",true],e151a2_client:["CANCEL",true]};
this.setVCMap("AV10P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV9P_CRF_ID","vP_CRF_ID",0,"int");this.InitStandaloneVars()});gx.setParentObj(new b402_wp11_crf_designer);