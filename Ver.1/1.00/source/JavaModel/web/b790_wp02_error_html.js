gx.evt.autoSkip=false;function b790_wp02_error_html(){this.ServerClass="B790_WP02_ERROR_HTML";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("12","e111m2_client");this.autoRefresh=true;this.SetStandaloneVars=function(){};this.e111m2_client=function(){this.executeServerEvent("'BTN_END'",true)};this.e151m2_client=function(){this.executeServerEvent("ENTER",true)};this.e161m2_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,9,17,20,23,26,30];
this.GXLastCtrlId=30;this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[5]={fld:"TABLE2",grid:0};this.GXValidFnc[9]={fld:"TABLE3",grid:0};this.GXValidFnc[17]={fld:"TABLE4",grid:0};this.GXValidFnc[20]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_NONE",gxz:"ZV7D_NONE",gxold:"OV7D_NONE",gxvar:"AV7D_NONE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7D_NONE=a},v2z:function(a){gx.O.ZV7D_NONE=a},v2c:function(){gx.fn.setControlValue("vD_NONE",gx.O.AV7D_NONE,0)
},c2v:function(){gx.O.AV7D_NONE=this.val()},val:function(){return gx.fn.getControlValue("vD_NONE")},nac:function(){return false}};this.GXValidFnc[23]={fld:"TBL_ERRMSG",format:1,grid:0};this.GXValidFnc[26]={fld:"TABLE10",grid:0};this.GXValidFnc[30]={fld:"TXT_BTN_END",format:0,grid:0};this.AV7D_NONE="";this.ZV7D_NONE="";this.OV7D_NONE="";this.ServerEvents=["e111m2_client","e151m2_client","e161m2_client"];this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0012",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0033",lvl:1})
}b790_wp02_error_html.prototype=new gx.GxObject;gx.setParentObj(new b790_wp02_error_html());