gx.evt.autoSkip=false;function b710_wp01_login(){this.ServerClass="B710_WP01_LOGIN";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.SetStandaloneVars=function(){};this.Validv_D_tam07_user_id=function(){try{var a=gx.util.balloon.getNew("vD_TAM07_USER_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.s122_client=function(){};this.s132_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s162_client=function(){gx.fn.setCtrlProperty("vD_TAM07_USER_ID","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("vD_TAM07_PWD","Backcolor",gx.color.rgb(255,255,255))
};this.e110d2_client=function(){this.executeServerEvent("'BTN_LOGIN'",true)};this.e150d2_client=function(){this.executeServerEvent("ENTER",true,arguments[0])};this.e160d2_client=function(){this.executeServerEvent("CANCEL",true,arguments[0])};this.GXValidFnc=[];this.GXCtrlIds=[2,5,9,19,22,24,27,29,32,43,46,48,55,58,59];this.GXLastCtrlId=59;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",40,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b710_wp01_login",[],true,1,true,true,0,false,false,false,"",520,"px","行追加",false,false,false,null,null,false,"");
this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","","","","","","","","","");this.Grid1Container.startTable("Table5",43,"0px");this.Grid1Container.addHtmlCode("<TBODY>");this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","","top","","","35px","110px","","","");this.Grid1Container.addSingleLineEdit(4,46,"TAT01_DATE_START","","","TAT01_DATE_START","date",10,"chr",10,10,"right",null,[],4,"TAT01_DATE_START",true,0,false,false);this.Grid1Container.endCell();
this.Grid1Container.startCell("","","top","","","","","","","");this.Grid1Container.addHtmlCode('<DIV style="WIDTH: 400px" class="SectionWordBreak" id="Section1">');this.Grid1Container.addSingleLineEdit("D_grd_tat01_info",48,"vD_GRD_TAT01_INFO","","","D_GRD_TAT01_INFO","svchar",80,"chr",2000,2000,"left",null,[],"D_grd_tat01_info","D_GRD_TAT01_INFO",true,0,false,false);this.Grid1Container.addHtmlCode("</DIV>");this.Grid1Container.endCell();this.Grid1Container.endRow();this.Grid1Container.startRow("","","","","","");
this.Grid1Container.startCell("","","","","","10px","","2","","");this.Grid1Container.endCell();this.Grid1Container.endRow();this.Grid1Container.addHtmlCode("</TBODY>");this.Grid1Container.endTable();this.Grid1Container.endCell();this.Grid1Container.endRow();this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[5]={fld:"TABLE2",grid:0};this.GXValidFnc[9]={fld:"TABLE3",grid:0};this.GXValidFnc[19]={fld:"TABLE4",grid:0};this.GXValidFnc[22]={fld:"TEXTBLOCK2",format:0,grid:0};
this.GXValidFnc[24]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Validv_D_tam07_user_id,isvalid:null,fld:"vD_TAM07_USER_ID",gxz:"ZV12D_TAM07_USER_ID",gxold:"OV12D_TAM07_USER_ID",gxvar:"AV12D_TAM07_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12D_TAM07_USER_ID=a},v2z:function(a){gx.O.ZV12D_TAM07_USER_ID=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_USER_ID",gx.O.AV12D_TAM07_USER_ID,0)},c2v:function(){gx.O.AV12D_TAM07_USER_ID=this.val()
},val:function(){return gx.fn.getControlValue("vD_TAM07_USER_ID")},nac:function(){return false}};this.GXValidFnc[27]={fld:"TEXTBLOCK3",format:0,grid:0};this.GXValidFnc[29]={lvl:0,type:"svchar",len:128,dec:0,sign:false,isPwd:true,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_TAM07_PWD",gxz:"ZV11D_TAM07_PWD",gxold:"OV11D_TAM07_PWD",gxvar:"AV11D_TAM07_PWD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11D_TAM07_PWD=a},v2z:function(a){gx.O.ZV11D_TAM07_PWD=a},v2c:function(){gx.fn.setControlValue("vD_TAM07_PWD",gx.O.AV11D_TAM07_PWD,0)
},c2v:function(){gx.O.AV11D_TAM07_PWD=this.val()},val:function(){return gx.fn.getControlValue("vD_TAM07_PWD")},nac:function(){return false}};this.GXValidFnc[32]={fld:"TEXTBLOCK1",format:0,grid:0};this.GXValidFnc[43]={fld:"TABLE5",grid:40};this.GXValidFnc[46]={lvl:2,type:"date",len:10,dec:0,sign:false,ro:1,grid:40,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TAT01_DATE_START",gxz:"Z4TAT01_DATE_START",gxold:"O4TAT01_DATE_START",gxvar:"A4TAT01_DATE_START",dp:{f:0,st:false,wn:false,mf:false,pic:"99/99/9999",dec:0},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A4TAT01_DATE_START=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z4TAT01_DATE_START=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setGridControlValue("TAT01_DATE_START",gx.fn.currentGridRowImpl(40),gx.O.A4TAT01_DATE_START,0)},c2v:function(){gx.O.A4TAT01_DATE_START=this.val()},val:function(){return gx.fn.getGridControlValue("TAT01_DATE_START",gx.fn.currentGridRowImpl(40))},nac:function(){return false}};this.GXValidFnc[48]={lvl:2,type:"svchar",len:2000,dec:0,sign:false,ro:1,grid:40,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_TAT01_INFO",gxz:"ZV10D_GRD_TAT01_INFO",gxold:"OV10D_GRD_TAT01_INFO",gxvar:"AV10D_GRD_TAT01_INFO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_GRD_TAT01_INFO=a
},v2z:function(a){gx.O.ZV10D_GRD_TAT01_INFO=a},v2c:function(){gx.fn.setGridControlValue("vD_GRD_TAT01_INFO",gx.fn.currentGridRowImpl(40),gx.O.AV10D_GRD_TAT01_INFO,1)},c2v:function(){gx.O.AV10D_GRD_TAT01_INFO=this.val()},val:function(){return gx.fn.getGridControlValue("vD_GRD_TAT01_INFO",gx.fn.currentGridRowImpl(40))},nac:function(){return false}};this.GXValidFnc[55]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[58]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[59]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV13H_INIT_FLG",gxold:"OV13H_INIT_FLG",gxvar:"AV13H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_INIT_FLG=a
},v2z:function(a){gx.O.ZV13H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV13H_INIT_FLG,0)},c2v:function(){gx.O.AV13H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.AV12D_TAM07_USER_ID="";this.ZV12D_TAM07_USER_ID="";this.OV12D_TAM07_USER_ID="";this.AV11D_TAM07_PWD="";this.ZV11D_TAM07_PWD="";this.OV11D_TAM07_PWD="";this.Z4TAT01_DATE_START=gx.date.nullDate();this.O4TAT01_DATE_START=gx.date.nullDate();this.ZV10D_GRD_TAT01_INFO="";
this.OV10D_GRD_TAT01_INFO="";this.AV13H_INIT_FLG="";this.ZV13H_INIT_FLG="";this.OV13H_INIT_FLG="";this.A117TAT01_DEL_FLG="";this.A6TAT01_INFO="";this.A867TAT01_INFO_KBN="";this.A5TAT01_DATE_END=gx.date.nullDate();this.A4TAT01_DATE_START=gx.date.nullDate();this.AV10D_GRD_TAT01_INFO="";this.A8TAM07_USER_ID="";this.A2TAM07_USER_NM="";this.A126TAM07_USER_KANA_NM="";this.A14TAM07_AUTH_CD="";this.A147TAM07_SITE_ID="";this.A16TAM07_DEL_FLG="";this.A7TAM07_PWD="";this.ServerEvents=["e110d2_client","e150d2_client","e160d2_client"];
this.VarControlMap.AV8C_SYSDATE={id:"vC_SYSDATE",grid:0,type:"date"};this.VarControlMap.A6TAT01_INFO={id:"TAT01_INFO",grid:0,type:"svchar"};this.Grid1Container.addRefreshingVar({rfrVar:"AV8C_SYSDATE"});this.Grid1Container.addRefreshingVar({rfrVar:"A6TAT01_INFO"});this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0012",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0053",lvl:1})}b710_wp01_login.prototype=new gx.GxObject;gx.setParentObj(new b710_wp01_login());