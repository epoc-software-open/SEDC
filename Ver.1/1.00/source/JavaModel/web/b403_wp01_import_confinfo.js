gx.evt.autoSkip=false;function b403_wp01_import_confinfo(){this.ServerClass="B403_WP01_IMPORT_CONFINFO";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e111e2_client");this.SetStandaloneVars=function(){this.AV21P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",")};this.s152_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");
if(!(""==this.AV13W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV13W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")
}if(!(""==this.AV12W_A819_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV12W_A819_JS)}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e111e2_client=function(){this.executeServerEvent("'BTN_IMPORT'",true)
};this.e141e2_client=function(){this.executeServerEvent("'BTN_IMPORT_EXEC'",true)};this.e161e2_client=function(){this.executeServerEvent("ENTER",true)};this.e171e2_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,18,21,24,27,29,41,44,45,46];this.GXLastCtrlId=46;this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TBL_UPD_BTNSET",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_IMPORT",format:0,grid:0};
this.GXValidFnc[18]={fld:"TABLE3",grid:0};this.GXValidFnc[21]={fld:"TABLE4",grid:0};this.GXValidFnc[24]={fld:"TABLE10",grid:0};this.GXValidFnc[27]={fld:"TEXTBLOCK16",format:0,grid:0};this.GXValidFnc[29]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_STUDY_ID",gxz:"ZV8D_STUDY_ID",gxold:"OV8D_STUDY_ID",gxvar:"AV8D_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV8D_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.ZV8D_STUDY_ID=gx.num.intval(a)
},v2c:function(){gx.fn.setComboBoxValue("vD_STUDY_ID",gx.O.AV8D_STUDY_ID)},c2v:function(){gx.O.AV8D_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("vD_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[44]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[45]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV9H_INIT_FLG",gxold:"OV9H_INIT_FLG",gxvar:"AV9H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9H_INIT_FLG=a
},v2z:function(a){gx.O.ZV9H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV9H_INIT_FLG,0)},c2v:function(){gx.O.AV9H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[46]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV10H_KNGN_FLG",gxold:"OV10H_KNGN_FLG",gxvar:"AV10H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV10H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV10H_KNGN_FLG,0)},c2v:function(){gx.O.AV10H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.AV8D_STUDY_ID=0;this.ZV8D_STUDY_ID=0;this.OV8D_STUDY_ID=0;this.AV9H_INIT_FLG="";this.ZV9H_INIT_FLG="";this.OV9H_INIT_FLG="";this.AV10H_KNGN_FLG="";this.ZV10H_KNGN_FLG="";this.OV10H_KNGN_FLG="";this.AV21P_MOVE_KBN=0;this.A189TBM21_DEL_FLG="";this.A513TBM21_STATUS="";
this.A186TBM21_STUDY_ID=0;this.A187TBM21_STUDY_NM="";this.A16TAM07_DEL_FLG="";this.A8TAM07_USER_ID="";this.A7TAM07_PWD="";this.AV12W_A819_JS="";this.AV13W_A821_JS="";this.ServerEvents=["e111e2_client","e141e2_client","e161e2_client","e171e2_client"];this.VarControlMap.AV21P_MOVE_KBN={id:"vP_MOVE_KBN",grid:0,type:"int"};this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0039",lvl:1})}b403_wp01_import_confinfo.prototype=new gx.GxObject;
gx.setParentObj(new b403_wp01_import_confinfo());