gx.evt.autoSkip=!1;
gx.define("b402_wp08_crf_reg",!1,function(){this.ServerClass="b402_wp08_crf_reg";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111b2_client");this.addKeyListener("4","e121b2_client");this.addKeyListener("6","e131b2_client");this.addKeyListener("11","e141b2_client");this.SetStandaloneVars=function(){this.AV61Pgmname=gx.fn.getControlValue("vPGMNAME");this.AV6C_APP_ID=gx.fn.getControlValue("vC_APP_ID");this.AV14P_STUDY_ID=
gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV13P_CRF_ID=gx.fn.getControlValue("vP_CRF_ID");this.A55TAM07_USER_ID=gx.fn.getControlValue("TAM07_USER_ID");this.A205TAM07_USER_NM=gx.fn.getControlValue("TAM07_USER_NM");this.A945TBM44_STUDY_ID=gx.fn.getIntegerValue("TBM44_STUDY_ID",",");this.A946TBM44_CRF_ID=gx.fn.getIntegerValue("TBM44_CRF_ID",",");this.A947TBM44_CRF_EDA_NO=gx.fn.getIntegerValue("TBM44_CRF_EDA_NO",",");this.A948TBM44_VISIT_NO=gx.fn.getIntegerValue("TBM44_VISIT_NO",",");this.AV34SD_B402_SD07_CRF_VISIT_C=
gx.fn.getControlValue("vSD_B402_SD07_CRF_VISIT_C");this.AV5BC_CRF=gx.fn.getControlValue("vBC_CRF");this.A63TBM21_STUDY_ID=gx.fn.getIntegerValue("TBM21_STUDY_ID",",");this.A367TBM21_STUDY_NM=gx.fn.getControlValue("TBM21_STUDY_NM");this.AV21W_A821_JS=gx.fn.getControlValue("vW_A821_JS");this.AV20W_A819_JS=gx.fn.getControlValue("vW_A819_JS");this.AV29W_REG_ENABEL=gx.fn.getControlValue("vW_REG_ENABEL");this.AV30W_UPD_ENABEL=gx.fn.getControlValue("vW_UPD_ENABEL");this.AV24W_DLT_ENABEL=gx.fn.getControlValue("vW_DLT_ENABEL")};
this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");if(""!=this.AV21W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV21W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");""!=this.AV20W_A819_JS&&
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV20W_A819_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s192_client=function(){gx.fn.setCtrlProperty("CTLTBM31_CRF_ID",
"Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM31_CRF_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM31_CRF_SNM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM31_ORDER","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM31_NOTE","Backcolor",gx.color.rgb(255,255,255))};this.s202_client=function(){for(this.AV66GXV22=1;this.AV66GXV22<=this.AV15W_A_CHK_RESULT_SDT.length;){this.AV16W_A_CHK_RESULT_SDT_ITEM=this.AV15W_A_CHK_RESULT_SDT[this.AV66GXV22-
1];this.s212_client();this.AV66GXV22=this.AV66GXV22+1}};this.s212_client=function(){if(this.AV16W_A_CHK_RESULT_SDT_ITEM.ID=="TBM31_CRF_ID"){gx.fn.setCtrlProperty("CTLTBM31_CRF_ID","Backcolor",gx.color.rgb(255,192,203));this.AV16W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM31_CRF_ID")}else if(this.AV16W_A_CHK_RESULT_SDT_ITEM.ID=="TBM31_CRF_NM"){gx.fn.setCtrlProperty("CTLTBM31_CRF_NM","Backcolor",gx.color.rgb(255,192,203));this.AV16W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM31_CRF_NM")}else if(this.AV16W_A_CHK_RESULT_SDT_ITEM.ID==
"TBM31_CRF_SNM"){gx.fn.setCtrlProperty("CTLTBM31_CRF_SNM","Backcolor",gx.color.rgb(255,192,203));this.AV16W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM31_CRF_SNM")}else if(this.AV16W_A_CHK_RESULT_SDT_ITEM.ID=="TBM31_ORDER"){gx.fn.setCtrlProperty("CTLTBM31_ORDER","Backcolor",gx.color.rgb(255,192,203));this.AV16W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM31_ORDER")}else if(this.AV16W_A_CHK_RESULT_SDT_ITEM.ID=="TBM31_NOTE"){gx.fn.setCtrlProperty("CTLTBM31_NOTE","Backcolor",
gx.color.rgb(255,192,203));this.AV16W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM31_NOTE")}};this.e111b2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e151b2_client=function(){this.executeServerEvent("'BTN_REG_EXEC'",true)};this.e121b2_client=function(){this.executeServerEvent("'BTN_UPD'",true)};this.e161b2_client=function(){this.executeServerEvent("'BTN_UPD_EXEC'",true)};this.e131b2_client=function(){this.executeServerEvent("'BTN_DLT'",true)};this.e171b2_client=
function(){this.executeServerEvent("'BTN_DLT_EXEC'",true)};this.e141b2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e211b2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e221b2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,18,21,24,30,35,36,38,39,40,41,43,44,46,49,50,52,54,55,57,60,62,64,66,69,71,74,76,78,80,81,86,88,90,92,95,97,98,101,103,106,109,112,114,118,121,124,127,130,135,137,139,141,
144,146,148,150,153,155,157,159,164,167,168,169,170,171,172,173];this.GXLastCtrlId=173;var c=this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",115,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp08_crf_reg",[],true,0,true,true,0,false,false,false,"CollB402_SD07_CRF_VISIT.B402_SD07_CRF_VISITItem",0,"px","\u884c\u8ffd\u52a0",false,false,false,null,null,false,"AV34SD_B402_SD07_CRF_VISIT_C",false,[1,1,1,1]);c.startRow("","","","","","");c.startCell("","center","","","",
"","","","","");c.startTable("Table9",118,"67px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("","center","","","","28px","","","","");c.addSingleLineEdit("GXV13",121,"CTLTBM44_CRF_EDA_NO","","","TBM44_CRF_EDA_NO","int",2,"chr",2,2,"right",null,[],"GXV13","GXV13",true,0,false,false,"Attribute",1,"");c.endCell();c.endRow();c.startRow("","","","","","");c.startCell("","center","","","","28px","","","","");c.addSingleLineEdit("GXV14",124,"CTLTBM44_VISIT_NO","","","TBM44_VISIT_NO",
"int",6,"chr",6,6,"right",null,[],"GXV14","GXV14",true,0,false,false,"AttributeNum",1,"");c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();c.endCell();c.endRow();this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TBL_UPD_BTNSET",grid:0};b[15]={fld:"TXT_BTN_REG",format:0,grid:0};b[16]={fld:"TXT_BTN_UPD",format:0,grid:0};b[18]={fld:"TXT_BTN_DLT",format:0,grid:0};b[21]={fld:"TXT_BTN_CAN",format:0,grid:0};b[24]={fld:"TABLE4",grid:0};b[30]={fld:"TABLE5",grid:0};
b[35]={fld:"IMAGE6",grid:0};b[36]={fld:"TEXTBLOCK63",format:0,grid:0};b[38]={fld:"SECTION1",grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_STUDY_ID",gxz:"ZV42GXV1",gxold:"OV42GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV42GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_STUDY_ID",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM31_STUDY_ID",",")},nac:gx.falseFn};b[40]={fld:"TEXTBLOCK1",format:2,grid:0};b[41]={fld:"TXT_STUDY",format:0,grid:0};b[43]={fld:"IMAGE8",grid:0};b[44]={fld:"TEXTBLOCK68",format:0,grid:0};b[46]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_CRF_ID",gxz:"ZV43GXV2",gxold:"OV43GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=
gx.num.intval(a)},v2z:function(a){gx.O.ZV43GXV2=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_CRF_ID",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM31_CRF_ID",",")},nac:gx.falseFn};b[49]={fld:"IMAGE7",grid:0};b[50]={fld:"TEXTBLOCK65",format:0,grid:0};b[52]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_CRF_NM",gxz:"ZV44GXV3",gxold:"OV44GXV3",
gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV44GXV3=a},v2c:function(){gx.fn.setControlValue("CTLTBM31_CRF_NM",gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_CRF_NM")},nac:gx.falseFn};b[54]={fld:"IMAGE9",grid:0};b[55]={fld:"TEXTBLOCK69",format:0,grid:0};b[57]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_CRF_SNM",
gxz:"ZV45GXV4",gxold:"OV45GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV4=a},v2z:function(a){gx.O.ZV45GXV4=a},v2c:function(){gx.fn.setControlValue("CTLTBM31_CRF_SNM",gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_CRF_SNM")},nac:gx.falseFn};b[60]={fld:"TEXTBLOCK79",format:0,grid:0};b[62]={lvl:0,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_ORDER",
gxz:"ZV46GXV5",gxold:"OV46GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=gx.num.intval(a)},v2z:function(a){gx.O.ZV46GXV5=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_ORDER",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM31_ORDER",",")},nac:gx.falseFn};b[64]={fld:"TEXTBLOCK80",format:0,grid:0};b[66]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_STATUS",gxz:"ZV47GXV6",gxold:"OV47GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV6=a},v2z:function(a){gx.O.ZV47GXV6=a},v2c:function(){gx.fn.setRadioValue("CTLTBM31_STATUS",gx.O.GXV6)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_STATUS")},nac:gx.falseFn};b[69]={fld:"TEXTBLOCK81",format:0,grid:0};b[71]={lvl:0,type:"svchar",len:1E3,dec:0,sign:false,ro:0,multiline:true,
grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_NOTE",gxz:"ZV48GXV7",gxold:"OV48GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV7=a},v2z:function(a){gx.O.ZV48GXV7=a},v2c:function(){gx.fn.setControlValue("CTLTBM31_NOTE",gx.O.GXV7,0)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_NOTE")},nac:gx.falseFn};b[74]={fld:"TEXTBLOCK85",format:0,grid:0};b[76]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,
grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_DM_EXCP_NO_DISP_FLG",gxz:"ZV49GXV8",gxold:"OV49GXV8",gxvar:"GXV8",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(a){gx.O.GXV8=a},v2z:function(a){gx.O.ZV49GXV8=a},v2c:function(){gx.fn.setCheckBoxValue("CTLTBM31_DM_EXCP_NO_DISP_FLG",gx.O.GXV8,"1")},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getCheckBoxValue("CTLTBM31_DM_EXCP_NO_DISP_FLG","1","0")},nac:gx.falseFn};b[78]={fld:"TEXTBLOCK84",format:0,grid:0};
b[80]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_DEL_FLG",gxz:"ZV50GXV9",gxold:"OV50GXV9",gxvar:"GXV9",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV9=a},v2z:function(a){gx.O.ZV50GXV9=a},v2c:function(){gx.fn.setRadioValue("CTLTBM31_DEL_FLG",gx.O.GXV9)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_DEL_FLG")},nac:gx.falseFn};b[81]={fld:"TABLE10",grid:0};b[86]={fld:"TEXTBLOCK82",
format:0,grid:0};b[88]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_REPEAT_FLG",gxz:"ZV51GXV10",gxold:"OV51GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV10=gx.num.intval(a)},v2z:function(a){gx.O.ZV51GXV10=gx.num.intval(a)},v2c:function(){gx.fn.setRadioValue("CTLTBM31_REPEAT_FLG",gx.O.GXV10)},c2v:function(){gx.O.GXV10=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM31_REPEAT_FLG",
",")},nac:gx.falseFn};b[90]={fld:"TEXTBLOCK83",format:0,grid:0};b[92]={fld:"TABLE6",grid:0};b[95]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_REPEAT_MAX",gxz:"ZV52GXV11",gxold:"OV52GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=gx.num.intval(a)},v2z:function(a){gx.O.ZV52GXV11=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_REPEAT_MAX",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM31_REPEAT_MAX",",")},nac:gx.falseFn};b[97]={fld:"TEXTBLOCK2",format:0,grid:0};b[98]={fld:"TABLE7",grid:0};b[101]={fld:"TEXTBLOCK89",format:1,grid:0};b[103]={fld:"TABLE8",grid:0};b[106]={fld:"TEXTBLOCK4",format:0,grid:0};b[109]={fld:"TEXTBLOCK3",format:0,grid:0};b[112]={fld:"TEXTBLOCK86",format:0,grid:0};b[114]={fld:"SECTION2",grid:0};b[118]={fld:"TABLE9",grid:115};b[121]={lvl:2,type:"int",len:2,dec:0,sign:false,pic:"Z9",
ro:1,isacc:0,grid:115,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM44_CRF_EDA_NO",gxz:"ZV54GXV13",gxold:"OV54GXV13",gxvar:"GXV13",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV13=gx.num.intval(a)},v2z:function(a){gx.O.ZV54GXV13=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("CTLTBM44_CRF_EDA_NO",a||gx.fn.currentGridRowImpl(115),gx.O.GXV13,0)},c2v:function(){gx.O.GXV13=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("CTLTBM44_CRF_EDA_NO",
a||gx.fn.currentGridRowImpl(115),",")},nac:gx.falseFn};b[124]={lvl:2,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,isacc:0,grid:115,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM44_VISIT_NO",gxz:"ZV55GXV14",gxold:"OV55GXV14",gxvar:"GXV14",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV14=gx.num.intval(a)},v2z:function(a){gx.O.ZV55GXV14=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("CTLTBM44_VISIT_NO",a||gx.fn.currentGridRowImpl(115),
gx.O.GXV14,0)},c2v:function(){gx.O.GXV14=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("CTLTBM44_VISIT_NO",a||gx.fn.currentGridRowImpl(115),",")},nac:gx.falseFn};b[127]={fld:"TEXTBLOCK87",format:0,grid:0};b[130]={fld:"TABLE3",grid:0};b[135]={fld:"TEXTBLOCK67",format:0,grid:0};b[137]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_CRT_DATETIME",gxz:"ZV56GXV15",gxold:"OV56GXV15",gxvar:"GXV15",dp:{f:0,st:true,
wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV15=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV56GXV15=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_CRT_DATETIME",gx.O.GXV15,0)},c2v:function(){gx.O.GXV15=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("CTLTBM31_CRT_DATETIME")},nac:gx.falseFn};b[139]={fld:"TEXTBLOCK72",format:0,grid:0};b[141]={lvl:0,type:"dtime",
len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_UPD_DATETIME",gxz:"ZV57GXV16",gxold:"OV57GXV16",gxvar:"GXV16",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV16=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV57GXV16=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM31_UPD_DATETIME",gx.O.GXV16,0)},c2v:function(){gx.O.GXV16=gx.fn.toDatetimeValue(this.val())},
val:function(){return gx.fn.getDateTimeValue("CTLTBM31_UPD_DATETIME")},nac:gx.falseFn};b[144]={fld:"TEXTBLOCK70",format:0,grid:0};b[146]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRT_USER_NM",gxz:"ZV8D_CRT_USER_NM",gxold:"OV8D_CRT_USER_NM",gxvar:"AV8D_CRT_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8D_CRT_USER_NM=a},v2z:function(a){gx.O.ZV8D_CRT_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_CRT_USER_NM",
gx.O.AV8D_CRT_USER_NM,1)},c2v:function(){gx.O.AV8D_CRT_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_CRT_USER_NM")},nac:gx.falseFn};b[148]={fld:"TEXTBLOCK73",format:0,grid:0};b[150]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_UPD_USER_NM",gxz:"ZV9D_UPD_USER_NM",gxold:"OV9D_UPD_USER_NM",gxvar:"AV9D_UPD_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_UPD_USER_NM=a},v2z:function(a){gx.O.ZV9D_UPD_USER_NM=
a},v2c:function(){gx.fn.setControlValue("vD_UPD_USER_NM",gx.O.AV9D_UPD_USER_NM,1)},c2v:function(){gx.O.AV9D_UPD_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_UPD_USER_NM")},nac:gx.falseFn};b[153]={fld:"TEXTBLOCK71",format:0,grid:0};b[155]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_CRT_PROG_NM",gxz:"ZV58GXV17",gxold:"OV58GXV17",gxvar:"GXV17",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV17=
a},v2z:function(a){gx.O.ZV58GXV17=a},v2c:function(){gx.fn.setControlValue("CTLTBM31_CRT_PROG_NM",gx.O.GXV17,0)},c2v:function(){gx.O.GXV17=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_CRT_PROG_NM")},nac:gx.falseFn};b[157]={fld:"TEXTBLOCK74",format:0,grid:0};b[159]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM31_UPD_PROG_NM",gxz:"ZV59GXV18",gxold:"OV59GXV18",gxvar:"GXV18",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.GXV18=a},v2z:function(a){gx.O.ZV59GXV18=a},v2c:function(){gx.fn.setControlValue("CTLTBM31_UPD_PROG_NM",gx.O.GXV18,0)},c2v:function(){gx.O.GXV18=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM31_UPD_PROG_NM")},nac:gx.falseFn};b[164]={fld:"TBL_HIDDEN",grid:0};b[167]={fld:"TXT_JS_EVENT",format:1,grid:0};b[168]={fld:"BTN_REG_EXEC",format:0,grid:0};b[169]={fld:"BTN_UPD_EXEC",format:0,grid:0};b[170]={fld:"BTN_DLT_EXEC",format:0,grid:0};b[171]={lvl:0,type:"svchar",len:1,
dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV10H_INIT_FLG",gxold:"OV10H_INIT_FLG",gxvar:"AV10H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10H_INIT_FLG=a},v2z:function(a){gx.O.ZV10H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV10H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV10H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(171,function(){});b[172]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_MODE",gxz:"ZV12H_MODE",gxold:"OV12H_MODE",gxvar:"AV12H_MODE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_MODE=a},v2z:function(a){gx.O.ZV12H_MODE=a},v2c:function(){gx.fn.setControlValue("vH_MODE",gx.O.AV12H_MODE,0)},c2v:function(){gx.O.AV12H_MODE=this.val()},val:function(){return gx.fn.getControlValue("vH_MODE")},
nac:gx.falseFn};b[173]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV11H_KNGN_FLG",gxold:"OV11H_KNGN_FLG",gxvar:"AV11H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_KNGN_FLG=a},v2z:function(a){gx.O.ZV11H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV11H_KNGN_FLG,0)},c2v:function(){gx.O.AV11H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},
nac:gx.falseFn};this.OV43GXV2=this.ZV43GXV2=this.GXV2=this.OV42GXV1=this.ZV42GXV1=this.GXV1=0;this.OV45GXV4=this.ZV45GXV4=this.GXV4=this.OV44GXV3=this.ZV44GXV3=this.GXV3="";this.OV46GXV5=this.ZV46GXV5=this.GXV5=0;this.OV50GXV9=this.ZV50GXV9=this.GXV9=this.OV49GXV8=this.ZV49GXV8=this.GXV8=this.OV48GXV7=this.ZV48GXV7=this.GXV7=this.OV47GXV6=this.ZV47GXV6=this.GXV6="";this.OV55GXV14=this.ZV55GXV14=this.OV54GXV13=this.ZV54GXV13=this.OV52GXV11=this.ZV52GXV11=this.GXV11=this.OV51GXV10=this.ZV51GXV10=this.GXV10=
0;this.GXV15=gx.date.nullDate();this.ZV56GXV15=gx.date.nullDate();this.OV56GXV15=gx.date.nullDate();this.GXV16=gx.date.nullDate();this.ZV57GXV16=gx.date.nullDate();this.OV57GXV16=gx.date.nullDate();this.OV11H_KNGN_FLG=this.ZV11H_KNGN_FLG=this.AV11H_KNGN_FLG=this.OV12H_MODE=this.ZV12H_MODE=this.AV12H_MODE=this.OV10H_INIT_FLG=this.ZV10H_INIT_FLG=this.AV10H_INIT_FLG=this.OV59GXV18=this.ZV59GXV18=this.GXV18=this.OV58GXV17=this.ZV58GXV17=this.GXV17=this.OV9D_UPD_USER_NM=this.ZV9D_UPD_USER_NM=this.AV9D_UPD_USER_NM=
this.OV8D_CRT_USER_NM=this.ZV8D_CRT_USER_NM=this.AV8D_CRT_USER_NM="";this.GXV2=this.GXV1=0;this.GXV4=this.GXV3="";this.GXV5=0;this.GXV9=this.GXV8=this.GXV7=this.GXV6="";this.GXV11=this.GXV10=0;this.GXV15=gx.date.nullDate();this.GXV16=gx.date.nullDate();this.AV11H_KNGN_FLG=this.AV12H_MODE=this.AV10H_INIT_FLG=this.GXV18=this.GXV17=this.AV9D_UPD_USER_NM=this.AV8D_CRT_USER_NM="";this.AV14P_STUDY_ID=0;this.AV13P_CRF_ID="";this.A63TBM21_STUDY_ID=this.GXV14=this.GXV13=0;this.A367TBM21_STUDY_NM="";this.A948TBM44_VISIT_NO=
this.A947TBM44_CRF_EDA_NO=this.A945TBM44_STUDY_ID=this.A946TBM44_CRF_ID=0;this.AV6C_APP_ID=this.AV61Pgmname=this.A205TAM07_USER_NM=this.A55TAM07_USER_ID="";this.AV34SD_B402_SD07_CRF_VISIT_C=[];this.AV5BC_CRF={};this.AV20W_A819_JS=this.AV21W_A821_JS="";this.AV24W_DLT_ENABEL=this.AV30W_UPD_ENABEL=this.AV29W_REG_ENABEL=false;this.AV16W_A_CHK_RESULT_SDT_ITEM={};this.AV15W_A_CHK_RESULT_SDT=[];this.AV66GXV22=0;this.Events={e111b2_client:["'BTN_REG'",true],e151b2_client:["'BTN_REG_EXEC'",true],e121b2_client:["'BTN_UPD'",
true],e161b2_client:["'BTN_UPD_EXEC'",true],e131b2_client:["'BTN_DLT'",true],e171b2_client:["'BTN_DLT_EXEC'",true],e141b2_client:["'BTN_CAN'",true],e211b2_client:["ENTER",true],e221b2_client:["CANCEL",true]};this.setVCMap("AV61Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_APP_ID","vC_APP_ID",0,"svchar");this.setVCMap("AV14P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV13P_CRF_ID","vP_CRF_ID",0,"svchar");this.setVCMap("A55TAM07_USER_ID","TAM07_USER_ID",0,"svchar");this.setVCMap("A205TAM07_USER_NM",
"TAM07_USER_NM",0,"svchar");this.setVCMap("A945TBM44_STUDY_ID","TBM44_STUDY_ID",0,"int");this.setVCMap("A946TBM44_CRF_ID","TBM44_CRF_ID",0,"int");this.setVCMap("A947TBM44_CRF_EDA_NO","TBM44_CRF_EDA_NO",0,"int");this.setVCMap("A948TBM44_VISIT_NO","TBM44_VISIT_NO",0,"int");this.setVCMap("AV34SD_B402_SD07_CRF_VISIT_C","vSD_B402_SD07_CRF_VISIT_C",0,"CollB402_SD07_CRF_VISIT.B402_SD07_CRF_VISITItem");this.setVCMap("AV5BC_CRF","vBC_CRF",0,"TBM31_CRF");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,
"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV21W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV20W_A819_JS","vW_A819_JS",0,"svchar");this.setVCMap("AV29W_REG_ENABEL","vW_REG_ENABEL",0,"boolean");this.setVCMap("AV30W_UPD_ENABEL","vW_UPD_ENABEL",0,"boolean");this.setVCMap("AV24W_DLT_ENABEL","vW_DLT_ENABEL",0,"boolean");this.setVCMap("AV61Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_APP_ID","vC_APP_ID",0,"svchar");this.setVCMap("AV14P_STUDY_ID","vP_STUDY_ID",
0,"int");this.setVCMap("AV13P_CRF_ID","vP_CRF_ID",0,"svchar");this.setVCMap("A55TAM07_USER_ID","TAM07_USER_ID",0,"svchar");this.setVCMap("A205TAM07_USER_NM","TAM07_USER_NM",0,"svchar");this.setVCMap("A945TBM44_STUDY_ID","TBM44_STUDY_ID",0,"int");this.setVCMap("A946TBM44_CRF_ID","TBM44_CRF_ID",0,"int");this.setVCMap("A947TBM44_CRF_EDA_NO","TBM44_CRF_EDA_NO",0,"int");this.setVCMap("A948TBM44_VISIT_NO","TBM44_VISIT_NO",0,"int");this.setVCMap("AV34SD_B402_SD07_CRF_VISIT_C","vSD_B402_SD07_CRF_VISIT_C",
0,"CollB402_SD07_CRF_VISIT.B402_SD07_CRF_VISITItem");this.setVCMap("AV5BC_CRF","vBC_CRF",0,"TBM31_CRF");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV21W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV20W_A819_JS","vW_A819_JS",0,"svchar");this.setVCMap("AV29W_REG_ENABEL","vW_REG_ENABEL",0,"boolean");this.setVCMap("AV30W_UPD_ENABEL","vW_UPD_ENABEL",0,"boolean");this.setVCMap("AV24W_DLT_ENABEL","vW_DLT_ENABEL",
0,"boolean");c.addRefreshingVar(this.GXValidFnc[171]);c.addRefreshingVar({rfrVar:"AV61Pgmname"});c.addRefreshingVar({rfrVar:"AV6C_APP_ID"});c.addRefreshingVar({rfrVar:"AV14P_STUDY_ID"});c.addRefreshingVar({rfrVar:"AV13P_CRF_ID"});c.addRefreshingVar({rfrVar:"A55TAM07_USER_ID"});c.addRefreshingVar({rfrVar:"A205TAM07_USER_NM"});c.addRefreshingVar({rfrVar:"A945TBM44_STUDY_ID"});c.addRefreshingVar({rfrVar:"A946TBM44_CRF_ID"});c.addRefreshingVar({rfrVar:"A947TBM44_CRF_EDA_NO"});c.addRefreshingVar({rfrVar:"A948TBM44_VISIT_NO"});
c.addRefreshingVar({rfrVar:"AV34SD_B402_SD07_CRF_VISIT_C"});c.addRefreshingVar({rfrVar:"AV5BC_CRF"});c.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});c.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});c.addRefreshingVar({rfrVar:"AV21W_A821_JS"});c.addRefreshingVar({rfrVar:"AV20W_A819_JS"});c.addRefreshingVar({rfrVar:"AV29W_REG_ENABEL"});c.addRefreshingVar({rfrVar:"AV30W_UPD_ENABEL"});c.addRefreshingVar({rfrVar:"AV24W_DLT_ENABEL"});c.addRefreshingVar(this.GXValidFnc[173]);c.addRefreshingVar(this.GXValidFnc[172]);
this.addBCProperty("Bc_crf",["TBM31_STUDY_ID"],this.GXValidFnc[39],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_CRF_ID"],this.GXValidFnc[46],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_CRF_NM"],this.GXValidFnc[52],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_CRF_SNM"],this.GXValidFnc[57],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_ORDER"],this.GXValidFnc[62],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_STATUS"],this.GXValidFnc[66],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_NOTE"],
this.GXValidFnc[71],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_DM_EXCP_NO_DISP_FLG"],this.GXValidFnc[76],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_DEL_FLG"],this.GXValidFnc[80],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_REPEAT_FLG"],this.GXValidFnc[88],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_REPEAT_MAX"],this.GXValidFnc[95],"AV5BC_CRF");this.addGridBCProperty("Sd_b402_sd07_crf_visit_c",["TBM44_CRF_EDA_NO"],this.GXValidFnc[121],"AV34SD_B402_SD07_CRF_VISIT_C");this.addGridBCProperty("Sd_b402_sd07_crf_visit_c",
["TBM44_VISIT_NO"],this.GXValidFnc[124],"AV34SD_B402_SD07_CRF_VISIT_C");this.addBCProperty("Bc_crf",["TBM31_CRT_DATETIME"],this.GXValidFnc[137],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_UPD_DATETIME"],this.GXValidFnc[141],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_CRT_PROG_NM"],this.GXValidFnc[155],"AV5BC_CRF");this.addBCProperty("Bc_crf",["TBM31_UPD_PROG_NM"],this.GXValidFnc[159],"AV5BC_CRF");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});
this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0162",lvl:1})});gx.setParentObj(new b402_wp08_crf_reg);