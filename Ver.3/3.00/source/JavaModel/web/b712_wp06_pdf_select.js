gx.evt.autoSkip=!1;
gx.define("b712_wp06_pdf_select",!1,function(){this.ServerClass="b712_wp06_pdf_select";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.SetStandaloneVars=function(){this.AV34W_SEL_PDF_CD=gx.fn.getIntegerValue("vW_SEL_PDF_CD",",")};this.s122_client=function(){this.AV8D_SEL_PDF=1};this.s132_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",
gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"function proc() {");if(""!=this.AV19W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV19W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e132m2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e142m2_client=
function(){this.executeServerEvent("'BTN_CANCEL'",true)};this.e162m2_client=function(){this.executeServerEvent("ENTER",true)};this.e172m2_client=function(){this.executeServerEvent("CANCEL",true)};var a=this.GXValidFnc=[];this.GXCtrlIds=[2,6,13,16,19,22,27,30,33,38,41];this.GXLastCtrlId=41;a[2]={fld:"TABLE1",grid:0};a[6]={fld:"TABLE2",grid:0};a[13]={fld:"TABLE3",grid:0};a[16]={fld:"TEXTBLOCK1",format:0,grid:0};a[19]={fld:"TEXTBLOCK2",format:0,grid:0};a[22]={lvl:0,type:"int",len:1,dec:0,sign:false,
pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_SEL_PDF",gxz:"ZV8D_SEL_PDF",gxold:"OV8D_SEL_PDF",gxvar:"AV8D_SEL_PDF",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.AV8D_SEL_PDF=gx.num.intval(a)},v2z:function(a){gx.O.ZV8D_SEL_PDF=gx.num.intval(a)},v2c:function(){gx.fn.setRadioValue("vD_SEL_PDF",gx.O.AV8D_SEL_PDF)},c2v:function(){gx.O.AV8D_SEL_PDF=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vD_SEL_PDF",",")},nac:gx.falseFn};a[27]=
{fld:"TABLE5",grid:0};a[30]={fld:"BTN_REG",format:0,grid:0};a[33]={fld:"BTN_CANCEL",format:0,grid:0};a[38]={fld:"TBL_HIDDEN",grid:0};a[41]={fld:"TXT_JS_EVENT",format:1,grid:0};this.AV34W_SEL_PDF_CD=this.AV8D_SEL_PDF=this.OV8D_SEL_PDF=this.ZV8D_SEL_PDF=this.AV8D_SEL_PDF=0;this.AV19W_A821_JS="";this.Events={e132m2_client:["'BTN_REG'",true],e142m2_client:["'BTN_CANCEL'",true],e162m2_client:["ENTER",true],e172m2_client:["CANCEL",true]};this.setVCMap("AV34W_SEL_PDF_CD","vW_SEL_PDF_CD",0,"int");this.InitStandaloneVars()});
gx.setParentObj(new b712_wp06_pdf_select);
