gx.evt.autoSkip=false;function b791_wp01_header(a){this.ServerClass="B791_WP01_HEADER";this.PackageName="";this.setObjectType("web");this.setCmpContext(a);this.ReadonlyForm=true;this.hasEnterEvent=false;this.autoRefresh=true;this.SetStandaloneVars=function(){};this.s112_client=function(){};this.s132_client=function(){gx.fn.setCtrlProperty("TXT_TITLE","Caption",this.AV10P_PGNM);gx.fn.setCtrlProperty("TXT_KNGN","Caption",this.AV16P_AUTHNM);gx.fn.setCtrlProperty("TXT_BTN_END","Caption","試験検索・権限選択に戻る");
if(this.AV11P_TAM02_APP_ID=="B710"){gx.fn.setCtrlProperty("TXT_BTN_END","Visible",0)}else{if(this.AV11P_TAM02_APP_ID=="B711"){gx.fn.setCtrlProperty("TXT_BTN_END","Caption","ログアウト")}else{if(this.AV11P_TAM02_APP_ID=="B790"){gx.fn.setCtrlProperty("TXT_BTN_END","Visible",0)}else{}}}gx.fn.setCtrlProperty("TXT_USER","Caption",this.AV9P_A_LOGIN_SDT.TAM07_USER_ID+" "+this.AV9P_A_LOGIN_SDT.TAM07_USER_NM)};this.s142_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){inithead();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){inithead();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function inithead() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLOCK();");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function prochead() {");if(!(""==this.AV14W_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV14W_JS)}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('prochead()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")
};this.e130c2_client=function(){this.executeServerEvent("'BTN_END'",true)};this.e150c2_client=function(){this.executeServerEvent("ENTER",true)};this.e160c2_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,11,14,17,19,28,37,40,43,44];this.GXLastCtrlId=44;this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[5]={fld:"TABLE2",grid:0};this.GXValidFnc[11]={fld:"TABLE6",grid:0};this.GXValidFnc[14]={fld:"TXT_TITLE",format:0,grid:0};this.GXValidFnc[17]={fld:"TXT_KNGN",format:0,grid:0};
this.GXValidFnc[19]={fld:"TABLE5",grid:0};this.GXValidFnc[28]={fld:"TXT_USER",format:0,grid:0};this.GXValidFnc[37]={fld:"TXT_BTN_END",format:0,grid:0};this.GXValidFnc[40]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[43]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[44]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV8H_INIT_FLG",gxold:"OV8H_INIT_FLG",gxvar:"AV8H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(b){gx.O.AV8H_INIT_FLG=b
},v2z:function(b){gx.O.ZV8H_INIT_FLG=b},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV8H_INIT_FLG,0)},c2v:function(){gx.O.AV8H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.AV9P_A_LOGIN_SDT={};this.AV11P_TAM02_APP_ID="";this.AV10P_PGNM="";this.AV16P_AUTHNM="";this.AV12P_TAW01_DISP_DATETIME="";this.AV14W_JS="";this.ServerEvents=["e130c2_client","e150c2_client","e160c2_client"];this.SetStandaloneVars()};