gx.evt.autoSkip=false;function a102_wp01_chg_pwd(){this.ServerClass="A102_WP01_CHG_PWD";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("4","e110g2_client");this.addKeyListener("9","e120g2_client");this.SetStandaloneVars=function(){};this.s132_client=function(){this.AV12D_TAM07_USER_ID=this.AV14W_A_LOGIN_SDT.TAM07_USER_ID};this.s142_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");if(!(""==this.AV15W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV15W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s162_client=function(){gx.fn.setCtrlProperty("vD_TAM07_PWD","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("vD_TAM07_PWD_NEW","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("vD_TAM07_PWD_CFM","Backcolor",gx.color.rgb(255,255,255))
};this.e110g2_client=function(){this.executeServerEvent("'BTN_UPD'",true)};this.e150g2_client=function(){this.executeServerEvent("'BTN_UPD_EXEC'",true)};this.e120g2_client=function(){this.executeServerEvent("'BTN_END'",true)};this.e170g2_client=function(){this.executeServerEvent("ENTER",true)};this.e180g2_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,9,12,15,18,20,23,28,31,33,35,37,39,41,43,46,49,53,56,57];this.GXLastCtrlId=57;this.GXValidFnc[2]={fld:"TABLE1",grid:0};
this.GXValidFnc[5]={fld:"TABLE2",grid:0};this.GXValidFnc[9]={fld:"TABLE3",grid:0};this.GXValidFnc[12]={fld:"TABLE5",grid:0};this.GXValidFnc[15]={fld:"TABLE8",grid:0};this.GXValidFnc[18]={fld:"TEXTBLOCK28",format:0,grid:0};this.GXValidFnc[20]={fld:"TABLE10",grid:0};this.GXValidFnc[23]={fld:"TEXTBLOCK43",format:0,grid:0};this.GXValidFnc[28]={fld:"TABLE4",grid:0};this.GXValidFnc[31]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_TAM07_USER_ID",gxz:"ZV12D_TAM07_USER_ID",gxold:"OV12D_TAM07_USER_ID",gxvar:"AV12D_TAM07_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12D_TAM07_USER_ID=a
},v2z:function(a){gx.O.ZV12D_TAM07_USER_ID=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_USER_ID",gx.O.AV12D_TAM07_USER_ID,0)},c2v:function(){gx.O.AV12D_TAM07_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("vD_TAM07_USER_ID")},nac:function(){return false}};this.GXValidFnc[33]={fld:"IMAGE5",grid:0};this.GXValidFnc[35]={lvl:0,type:"svchar",len:20,dec:0,sign:false,isPwd:true,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_TAM07_PWD",gxz:"ZV9D_TAM07_PWD",gxold:"OV9D_TAM07_PWD",gxvar:"AV9D_TAM07_PWD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_TAM07_PWD=a
},v2z:function(a){gx.O.ZV9D_TAM07_PWD=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_PWD",gx.O.AV9D_TAM07_PWD,0)},c2v:function(){gx.O.AV9D_TAM07_PWD=this.val()},val:function(){return gx.fn.getControlValue("vD_TAM07_PWD")},nac:function(){return false}};this.GXValidFnc[37]={fld:"IMAGE7",grid:0};this.GXValidFnc[39]={lvl:0,type:"svchar",len:20,dec:0,sign:false,isPwd:true,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_TAM07_PWD_NEW",gxz:"ZV11D_TAM07_PWD_NEW",gxold:"OV11D_TAM07_PWD_NEW",gxvar:"AV11D_TAM07_PWD_NEW",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11D_TAM07_PWD_NEW=a
},v2z:function(a){gx.O.ZV11D_TAM07_PWD_NEW=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_PWD_NEW",gx.O.AV11D_TAM07_PWD_NEW,0)},c2v:function(){gx.O.AV11D_TAM07_PWD_NEW=this.val()},val:function(){return gx.fn.getControlValue("vD_TAM07_PWD_NEW")},nac:function(){return false}};this.GXValidFnc[41]={fld:"IMAGE9",grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:20,dec:0,sign:false,isPwd:true,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_TAM07_PWD_CFM",gxz:"ZV10D_TAM07_PWD_CFM",gxold:"OV10D_TAM07_PWD_CFM",gxvar:"AV10D_TAM07_PWD_CFM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_TAM07_PWD_CFM=a
},v2z:function(a){gx.O.ZV10D_TAM07_PWD_CFM=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_PWD_CFM",gx.O.AV10D_TAM07_PWD_CFM,0)},c2v:function(){gx.O.AV10D_TAM07_PWD_CFM=this.val()},val:function(){return gx.fn.getControlValue("vD_TAM07_PWD_CFM")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TBL_UPD_BTNSET",grid:0};this.GXValidFnc[49]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[53]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[56]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[57]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV13H_INIT_FLG",gxold:"OV13H_INIT_FLG",gxvar:"AV13H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_INIT_FLG=a
},v2z:function(a){gx.O.ZV13H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV13H_INIT_FLG,0)},c2v:function(){gx.O.AV13H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.AV12D_TAM07_USER_ID="";this.ZV12D_TAM07_USER_ID="";this.OV12D_TAM07_USER_ID="";this.AV9D_TAM07_PWD="";this.ZV9D_TAM07_PWD="";this.OV9D_TAM07_PWD="";this.AV11D_TAM07_PWD_NEW="";this.ZV11D_TAM07_PWD_NEW="";this.OV11D_TAM07_PWD_NEW="";this.AV10D_TAM07_PWD_CFM="";
this.ZV10D_TAM07_PWD_CFM="";this.OV10D_TAM07_PWD_CFM="";this.AV13H_INIT_FLG="";this.ZV13H_INIT_FLG="";this.OV13H_INIT_FLG="";this.A8TAM07_USER_ID="";this.A16TAM07_DEL_FLG="";this.A7TAM07_PWD="";this.AV14W_A_LOGIN_SDT={};this.AV15W_A821_JS="";this.ServerEvents=["e110g2_client","e150g2_client","e120g2_client","e170g2_client","e180g2_client"];this.SetStandaloneVars()}a102_wp01_chg_pwd.prototype=new gx.GxObject;gx.setParentObj(new a102_wp01_chg_pwd());