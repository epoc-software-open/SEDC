gx.evt.autoSkip=!1;
gx.define("b405_wp01_kanja_crf_list",!1,function(){this.ServerClass="b405_wp01_kanja_crf_list";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111d2_client");this.addKeyListener("5","e121d2_client");this.addKeyListener("6","e131d2_client");this.SetStandaloneVars=function(){this.AV51Pgmname=gx.fn.getControlValue("vPGMNAME");this.AV8C_TAM02_APP_ID=gx.fn.getControlValue("vC_TAM02_APP_ID");this.AV24P_MOVE_KBN=
gx.fn.getIntegerValue("vP_MOVE_KBN",",");this.AV17H_A_PAGING_SDT=gx.fn.getControlValue("vH_A_PAGING_SDT");this.A63TBM21_STUDY_ID=gx.fn.getIntegerValue("TBM21_STUDY_ID",",");this.A369TBM21_DEL_FLG=gx.fn.getControlValue("TBM21_DEL_FLG");this.AV25W_A_LOGIN_SDT=gx.fn.getControlValue("vW_A_LOGIN_SDT");this.A367TBM21_STUDY_NM=gx.fn.getControlValue("TBM21_STUDY_NM");this.A88TBT01_SUBJECT_ID=gx.fn.getIntegerValue("TBT01_SUBJECT_ID",",");this.A87TBT01_STUDY_ID=gx.fn.getIntegerValue("TBT01_STUDY_ID",",");this.A647TBT01_OUTER_SUBJECT_ID=
gx.fn.getControlValue("TBT01_OUTER_SUBJECT_ID");this.A441TBT01_DEL_FLG=gx.fn.getControlValue("TBT01_DEL_FLG");this.A68TBM31_STUDY_ID=gx.fn.getIntegerValue("TBM31_STUDY_ID",",");this.A69TBM31_CRF_ID=gx.fn.getIntegerValue("TBM31_CRF_ID",",");this.A643TBM31_STATUS=gx.fn.getControlValue("TBM31_STATUS");this.A397TBM31_DEL_FLG=gx.fn.getControlValue("TBM31_DEL_FLG");this.A89TBT02_STUDY_ID=gx.fn.getIntegerValue("TBT02_STUDY_ID",",");this.A90TBT02_SUBJECT_ID=gx.fn.getIntegerValue("TBT02_SUBJECT_ID",",");this.A91TBT02_CRF_ID=
gx.fn.getIntegerValue("TBT02_CRF_ID",",");this.A935TBT02_CRF_EDA_NO=gx.fn.getIntegerValue("TBT02_CRF_EDA_NO",",");this.A498TBT02_CRF_LATEST_VERSION=gx.fn.getIntegerValue("TBT02_CRF_LATEST_VERSION",",");this.AV34W_ERR_MSG=gx.fn.getControlValue("vW_ERR_MSG");this.A642TBM31_CRF_SNM=gx.fn.getControlValue("TBM31_CRF_SNM");this.AV23P_COL_COUNT=gx.fn.getIntegerValue("vP_COL_COUNT",",")};this.s122_client=function(){this.AV16D_TBT01_OUTER_SUBJECT_ID="";this.AV11D_GRD_CHK_ALL=this.AV9W_CRF_SEL_ONLY=true;this.AV22H_SRCH_FLG=
"0";this.AV17H_A_PAGING_SDT.PAGE_NO=1};this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+
"<\/script>")};this.e111d2_client=function(){this.executeServerEvent("'BTN_AUTO_SEL'",true)};this.e121d2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e131d2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e331d2_client=function(a){this.executeServerEvent("BTN_SEL.CLICK",true,a)};this.e141d2_client=function(){this.executeServerEvent("VD_GRD_CHK_ALL.CLICK",true)};this.e151d2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e161d2_client=function(){this.executeServerEvent("'PAGE_LAST'",
true)};this.e171d2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e181d2_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e191d2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e201d2_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e211d2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e221d2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e231d2_client=function(){this.executeServerEvent("'PAGE05'",
true)};this.e241d2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e251d2_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e261d2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e271d2_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e281d2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e351d2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e361d2_client=function(a){this.executeServerEvent("CANCEL",
true,a)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,18,21,24,27,29,31,33,35,38,40,43,46,49,55,56,59,62,65,68,71,74,77,80,83,86,89,92,95,98,101,104,107,110,113,116,119,122,125,128,131,134,137,140,143,146,149,155,158,161,162,164,170,173,179,182,185,187,189,190,193,198,201,206,209,210,211,212,213,214,215];this.GXLastCtrlId=215;var d=this.Grd_titleContainer=new gx.grid.grid(this,2,"WbpLvl2",167,"Grd_title","Grd_title","Grd_titleContainer",this.CmpContext,this.IsMasterPage,"b405_wp01_kanja_crf_list",
[],true,0,true,true,0,false,false,false,"",0,"px","\u884c\u8ffd\u52a0",false,false,false,null,null,false,"",false,[1,1,1,1]);d.startRow("","","","","","");d.startCell("","","","","","","","","","");d.startTable("Tbl_in_grid_header2",170,"150px");d.addHtmlCode("<tbody>");d.startRow("","","","","","");d.startCell("","center","","","","","","","","");d.addSingleLineEdit("D_crfsnm",173,"vD_CRFSNM","","","D_CRFSNM","svchar",20,"chr",20,20,"left",null,[],"D_crfsnm","D_CRFSNM",true,0,false,false,"ReadonlyAttribute",
1,"");d.endCell();d.endRow();d.addHtmlCode("</tbody>");d.endTable();d.endCell();d.endRow();this.setGrid(d);var e=this.Grid2Container=new gx.grid.grid(this,5,"WbpLvl5",195,"Grid2","Grid2","Grid2Container",this.CmpContext,this.IsMasterPage,"b405_wp01_kanja_crf_list",[],true,0,true,true,0,false,false,false,"",0,"px","\u884c\u8ffd\u52a0",false,false,false,null,null,false,"",false,[1,1,1,1]);e.startRow("","","","","","");e.startCell("","","","","","","","","","");e.startTable("Tbl_in_grid3",198,"150px");
e.addHtmlCode("<tbody>");e.startRow("","","","","","");e.startCell("","center","","","","35px","","","","");e.addSingleLineEdit("D_grd2_crf_status",201,"vD_GRD2_CRF_STATUS","","","D_GRD2_CRF_STATUS","svchar",2,"chr",2,2,"left",null,[],"D_grd2_crf_status","D_GRD2_CRF_STATUS",true,0,false,false,"ReadonlyAttribute",1,"");e.endCell();e.endRow();e.addHtmlCode("</tbody>");e.endTable();e.endCell();e.endRow();var c=this.Grid1Container=new gx.grid.grid(this,4,"WbpLvl4",176,"Grid1","Grid1","Grid1Container",
this.CmpContext,this.IsMasterPage,"b405_wp01_kanja_crf_list",[],true,1,true,true,10,false,false,false,"",0,"px","\u884c\u8ffd\u52a0",true,false,true,null,null,false,"",false,[1,1,1,1]);c.startRow("","","","","","");c.startCell("","","","","","","","","","");c.startTable("Tbl_grid",179,"0px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("","","top","","","","","","","");c.startTable("Tbl_in_grid2",182,"0px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("",
"center","","","","31px","60px","","","");c.addCheckBox("D_grd1_check",185,"vD_GRD1_CHECK","","","D_GRD1_CHECK","boolean","true","false",null,true,false,4,"chr","");c.endCell();c.startCell("","","","","","","70px","","","");c.addSingleLineEdit("D_grd1_hikensha",187,"vD_GRD1_HIKENSHA","","","D_GRD1_HIKENSHA","svchar",6,"chr",6,6,"left",null,[],"D_grd1_hikensha","D_GRD1_HIKENSHA",true,0,false,false,"ReadonlyAttribute",1,"");c.endCell();c.startCell("","center","","","","35px","45px","","","");c.addTextBlock("BTN_SEL",
"e331d2_client");c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();c.startTable("Tbl_grd1_hidden",190,"0px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("","","","","","","","","","");c.addSingleLineEdit(54,193,"TBW01_LINE_NO","","","TBW01_LINE_NO","int",10,"chr",10,10,"right",null,[],54,"TBW01_LINE_NO",true,0,false,false,"Attribute",1,"");c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();c.endCell();c.startCell("","","","","","","","","","");c.addGrid(this.Grid2Container);
c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();c.endCell();c.endRow();this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TBL_UPD_BTNSET",grid:0};b[15]={fld:"TXT_AUTO_SEL",format:0,grid:0};b[18]={fld:"TABLE3",grid:0};b[21]={fld:"TABLE4",grid:0};b[24]={fld:"TABLE10",grid:0};b[27]={fld:"TEXTBLOCK16",format:0,grid:0};b[29]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_STUDY_ID",gxz:"ZV15D_STUDY_ID",
gxold:"OV15D_STUDY_ID",gxvar:"AV15D_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV15D_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.ZV15D_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setComboBoxValue("vD_STUDY_ID",gx.O.AV15D_STUDY_ID)},c2v:function(){gx.O.AV15D_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vD_STUDY_ID",",")},nac:gx.falseFn};b[31]={fld:"TEXTBLOCK18",format:0,grid:0};b[33]={lvl:0,type:"svchar",len:6,dec:0,sign:false,
ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_TBT01_OUTER_SUBJECT_ID",gxz:"ZV16D_TBT01_OUTER_SUBJECT_ID",gxold:"OV16D_TBT01_OUTER_SUBJECT_ID",gxvar:"AV16D_TBT01_OUTER_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16D_TBT01_OUTER_SUBJECT_ID=a},v2z:function(a){gx.O.ZV16D_TBT01_OUTER_SUBJECT_ID=a},v2c:function(){gx.fn.setControlValue("vD_TBT01_OUTER_SUBJECT_ID",gx.O.AV16D_TBT01_OUTER_SUBJECT_ID,0)},c2v:function(){gx.O.AV16D_TBT01_OUTER_SUBJECT_ID=this.val()},
val:function(){return gx.fn.getControlValue("vD_TBT01_OUTER_SUBJECT_ID")},nac:gx.falseFn};b[35]={fld:"TABLE7",grid:0};b[38]={lvl:0,type:"boolean",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vW_CRF_SEL_ONLY",gxz:"ZV9W_CRF_SEL_ONLY",gxold:"OV9W_CRF_SEL_ONLY",gxvar:"AV9W_CRF_SEL_ONLY",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(a){gx.O.AV9W_CRF_SEL_ONLY=gx.lang.booleanValue(a)},v2z:function(a){gx.O.ZV9W_CRF_SEL_ONLY=gx.lang.booleanValue(a)},v2c:function(){gx.fn.setCheckBoxValue("vW_CRF_SEL_ONLY",
gx.O.AV9W_CRF_SEL_ONLY,true)},c2v:function(){gx.O.AV9W_CRF_SEL_ONLY=gx.lang.booleanValue(this.val())},val:function(){return gx.fn.getCheckBoxValue("vW_CRF_SEL_ONLY",true,false)},nac:gx.falseFn};b[40]={fld:"TEXTBLOCK35",format:0,grid:0};b[43]={fld:"TABLE9",grid:0};b[46]={fld:"TEXTBLOCK45",format:0,grid:0};b[49]={fld:"TEXTBLOCK44",format:0,grid:0};b[55]={fld:"SECTION1",grid:0};b[56]={fld:"TBL_LIST",grid:0};b[59]={fld:"TBL_PAGE_AREA",grid:0};b[62]={fld:"TXT_REC_CNT",format:0,grid:0};b[65]={fld:"TBL_PAGE",
grid:0};b[68]={fld:"TBL_FIRST",grid:0};b[71]={fld:"TXT_FIRST",format:0,grid:0};b[74]={fld:"TBL_BACK",grid:0};b[77]={fld:"TXT_BACK",format:0,grid:0};b[80]={fld:"TBL_PAGE01",grid:0};b[83]={fld:"TXT_PAGE01",format:0,grid:0};b[86]={fld:"TBL_PAGE02",grid:0};b[89]={fld:"TXT_PAGE02",format:0,grid:0};b[92]={fld:"TBL_PAGE03",grid:0};b[95]={fld:"TXT_PAGE03",format:0,grid:0};b[98]={fld:"TBL_PAGE04",grid:0};b[101]={fld:"TXT_PAGE04",format:0,grid:0};b[104]={fld:"TBL_PAGE05",grid:0};b[107]={fld:"TXT_PAGE05",format:0,
grid:0};b[110]={fld:"TBL_PAGE06",grid:0};b[113]={fld:"TXT_PAGE06",format:0,grid:0};b[116]={fld:"TBL_PAGE07",grid:0};b[119]={fld:"TXT_PAGE07",format:0,grid:0};b[122]={fld:"TBL_PAGE08",grid:0};b[125]={fld:"TXT_PAGE08",format:0,grid:0};b[128]={fld:"TBL_PAGE09",grid:0};b[131]={fld:"TXT_PAGE09",format:0,grid:0};b[134]={fld:"TBL_PAGE10",grid:0};b[137]={fld:"TXT_PAGE10",format:0,grid:0};b[140]={fld:"TBL_NEXT",grid:0};b[143]={fld:"TXT_NEXT",format:0,grid:0};b[146]={fld:"TBL_LAST",grid:0};b[149]={fld:"TXT_LAST",
format:0,grid:0};b[155]={fld:"TBL_GRID_HEADER",grid:0};b[158]={fld:"TBL_IN_GRID_HEADER",grid:0};b[161]={lvl:0,type:"boolean",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_CHK_ALL",gxz:"ZV11D_GRD_CHK_ALL",gxold:"OV11D_GRD_CHK_ALL",gxvar:"AV11D_GRD_CHK_ALL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(a){gx.O.AV11D_GRD_CHK_ALL=gx.lang.booleanValue(a)},v2z:function(a){gx.O.ZV11D_GRD_CHK_ALL=gx.lang.booleanValue(a)},v2c:function(){gx.fn.setCheckBoxValue("vD_GRD_CHK_ALL",
gx.O.AV11D_GRD_CHK_ALL,true)},c2v:function(){gx.O.AV11D_GRD_CHK_ALL=gx.lang.booleanValue(this.val())},val:function(){return gx.fn.getCheckBoxValue("vD_GRD_CHK_ALL",true,false)},nac:gx.falseFn};b[162]={fld:"TEXTBLOCK36",format:0,grid:0};b[164]={fld:"TEXTBLOCK13",format:0,grid:0};b[170]={fld:"TBL_IN_GRID_HEADER2",grid:167};b[173]={lvl:2,type:"svchar",len:20,dec:0,sign:false,ro:1,isacc:0,grid:167,gxgrid:this.Grd_titleContainer,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRFSNM",gxz:"ZV10D_CRFSNM",gxold:"OV10D_CRFSNM",
gxvar:"AV10D_CRFSNM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV10D_CRFSNM=a},v2z:function(a){gx.O.ZV10D_CRFSNM=a},v2c:function(a){gx.fn.setGridControlValue("vD_CRFSNM",a||gx.fn.currentGridRowImpl(167),gx.O.AV10D_CRFSNM,0)},c2v:function(){gx.O.AV10D_CRFSNM=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_CRFSNM",a||gx.fn.currentGridRowImpl(167))},nac:gx.falseFn};b[179]={fld:"TBL_GRID",grid:176};b[182]={fld:"TBL_IN_GRID2",grid:176};
b[185]={lvl:4,type:"boolean",len:4,dec:0,sign:false,ro:0,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD1_CHECK",gxz:"ZV12D_GRD1_CHECK",gxold:"OV12D_GRD1_CHECK",gxvar:"AV12D_GRD1_CHECK",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",inputType:"text",v2v:function(a){gx.O.AV12D_GRD1_CHECK=gx.lang.booleanValue(a)},v2z:function(a){gx.O.ZV12D_GRD1_CHECK=gx.lang.booleanValue(a)},v2c:function(a){gx.fn.setGridCheckBoxValue("vD_GRD1_CHECK",a||gx.fn.currentGridRowImpl(176),
gx.O.AV12D_GRD1_CHECK,true)},c2v:function(){gx.O.AV12D_GRD1_CHECK=gx.lang.booleanValue(this.val())},val:function(a){return gx.fn.getGridCheckBoxValue("vD_GRD1_CHECK",a||gx.fn.currentGridRowImpl(176),true,false)},nac:gx.falseFn};b[187]={lvl:4,type:"svchar",len:6,dec:0,sign:false,ro:0,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD1_HIKENSHA",gxz:"ZV13D_GRD1_HIKENSHA",gxold:"OV13D_GRD1_HIKENSHA",gxvar:"AV13D_GRD1_HIKENSHA",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV13D_GRD1_HIKENSHA=a},v2z:function(a){gx.O.ZV13D_GRD1_HIKENSHA=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD1_HIKENSHA",a||gx.fn.currentGridRowImpl(176),gx.O.AV13D_GRD1_HIKENSHA,0)},c2v:function(){gx.O.AV13D_GRD1_HIKENSHA=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD1_HIKENSHA",a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[189]={fld:"BTN_SEL",format:0,grid:176};b[190]={fld:"TBL_GRD1_HIDDEN",grid:176};b[193]=
{lvl:4,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBW01_LINE_NO",gxz:"Z54TBW01_LINE_NO",gxold:"O54TBW01_LINE_NO",gxvar:"A54TBW01_LINE_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A54TBW01_LINE_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z54TBW01_LINE_NO=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("TBW01_LINE_NO",a||gx.fn.currentGridRowImpl(176),gx.O.A54TBW01_LINE_NO,
0)},c2v:function(){gx.O.A54TBW01_LINE_NO=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBW01_LINE_NO",a||gx.fn.currentGridRowImpl(176),",")},nac:gx.falseFn};b[198]={fld:"TBL_IN_GRID3",grid:195};b[201]={lvl:5,type:"svchar",len:2,dec:0,sign:false,ro:1,isacc:0,grid:195,gxgrid:this.Grid2Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD2_CRF_STATUS",gxz:"ZV14D_GRD2_CRF_STATUS",gxold:"OV14D_GRD2_CRF_STATUS",gxvar:"AV14D_GRD2_CRF_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV14D_GRD2_CRF_STATUS=a},v2z:function(a){gx.O.ZV14D_GRD2_CRF_STATUS=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD2_CRF_STATUS",a||gx.fn.currentGridRowImpl(195),gx.O.AV14D_GRD2_CRF_STATUS,0)},c2v:function(){gx.O.AV14D_GRD2_CRF_STATUS=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD2_CRF_STATUS",a||gx.fn.currentGridRowImpl(195))},nac:gx.falseFn};b[206]={fld:"TBL_HIDDEN",grid:0};b[209]={fld:"TXT_JS_EVENT",format:1,grid:0};
b[210]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV20H_INIT_FLG",gxold:"OV20H_INIT_FLG",gxvar:"AV20H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV20H_INIT_FLG=a},v2z:function(a){gx.O.ZV20H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV20H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV20H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(210,function(){});b[211]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_SRCH_FLG",gxz:"ZV22H_SRCH_FLG",gxold:"OV22H_SRCH_FLG",gxvar:"AV22H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV22H_SRCH_FLG=a},v2z:function(a){gx.O.ZV22H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV22H_SRCH_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.AV22H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:gx.falseFn};this.declareDomainHdlr(211,function(){});b[212]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV21H_KNGN_FLG",gxold:"OV21H_KNGN_FLG",gxvar:"AV21H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV21H_KNGN_FLG=a},v2z:function(a){gx.O.ZV21H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",
gx.O.AV21H_KNGN_FLG,0)},c2v:function(){gx.O.AV21H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};b[213]={lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_DISP_DATETIME",gxz:"ZV19H_DISP_DATETIME",gxold:"OV19H_DISP_DATETIME",gxvar:"AV19H_DISP_DATETIME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV19H_DISP_DATETIME=a},v2z:function(a){gx.O.ZV19H_DISP_DATETIME=
a},v2c:function(){gx.fn.setControlValue("vH_DISP_DATETIME",gx.O.AV19H_DISP_DATETIME,0)},c2v:function(){gx.O.AV19H_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("vH_DISP_DATETIME")},nac:gx.falseFn};b[214]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_COL_COUNT",gxz:"ZV18H_COL_COUNT",gxold:"OV18H_COL_COUNT",gxvar:"AV18H_COL_COUNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV18H_COL_COUNT=
gx.num.intval(a)},v2z:function(a){gx.O.ZV18H_COL_COUNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vH_COL_COUNT",gx.O.AV18H_COL_COUNT,0)},c2v:function(){gx.O.AV18H_COL_COUNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vH_COL_COUNT",",")},nac:gx.falseFn};b[215]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV50GXV1",gxold:"OV50GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV50GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:gx.falseFn};this.OV15D_STUDY_ID=this.ZV15D_STUDY_ID=this.AV15D_STUDY_ID=0;this.OV16D_TBT01_OUTER_SUBJECT_ID=this.ZV16D_TBT01_OUTER_SUBJECT_ID=this.AV16D_TBT01_OUTER_SUBJECT_ID="";this.OV11D_GRD_CHK_ALL=this.ZV11D_GRD_CHK_ALL=
this.AV11D_GRD_CHK_ALL=this.OV9W_CRF_SEL_ONLY=this.ZV9W_CRF_SEL_ONLY=this.AV9W_CRF_SEL_ONLY=false;this.OV10D_CRFSNM=this.ZV10D_CRFSNM="";this.OV12D_GRD1_CHECK=this.ZV12D_GRD1_CHECK=false;this.OV13D_GRD1_HIKENSHA=this.ZV13D_GRD1_HIKENSHA="";this.O54TBW01_LINE_NO=this.Z54TBW01_LINE_NO=0;this.OV19H_DISP_DATETIME=this.ZV19H_DISP_DATETIME=this.AV19H_DISP_DATETIME=this.OV21H_KNGN_FLG=this.ZV21H_KNGN_FLG=this.AV21H_KNGN_FLG=this.OV22H_SRCH_FLG=this.ZV22H_SRCH_FLG=this.AV22H_SRCH_FLG=this.OV20H_INIT_FLG=
this.ZV20H_INIT_FLG=this.AV20H_INIT_FLG=this.OV14D_GRD2_CRF_STATUS=this.ZV14D_GRD2_CRF_STATUS="";this.AV15D_STUDY_ID=this.OV50GXV1=this.ZV50GXV1=this.GXV1=this.OV18H_COL_COUNT=this.ZV18H_COL_COUNT=this.AV18H_COL_COUNT=0;this.AV16D_TBT01_OUTER_SUBJECT_ID="";this.AV11D_GRD_CHK_ALL=this.AV9W_CRF_SEL_ONLY=false;this.AV19H_DISP_DATETIME=this.AV21H_KNGN_FLG=this.AV22H_SRCH_FLG=this.AV20H_INIT_FLG="";this.AV23P_COL_COUNT=this.AV24P_MOVE_KBN=this.GXV1=this.AV18H_COL_COUNT=0;this.AV10D_CRFSNM="";this.A63TBM21_STUDY_ID=
0;this.A367TBM21_STUDY_NM=this.A607TBM21_STATUS=this.A369TBM21_DEL_FLG="";this.AV12D_GRD1_CHECK=false;this.A647TBT01_OUTER_SUBJECT_ID=this.A441TBT01_DEL_FLG=this.AV14D_GRD2_CRF_STATUS=this.AV13D_GRD1_HIKENSHA="";this.A88TBT01_SUBJECT_ID=this.A87TBT01_STUDY_ID=0;this.A643TBM31_STATUS=this.A397TBM31_DEL_FLG="";this.A498TBT02_CRF_LATEST_VERSION=this.A89TBT02_STUDY_ID=this.A90TBT02_SUBJECT_ID=this.A91TBT02_CRF_ID=this.A935TBT02_CRF_EDA_NO=this.A68TBM31_STUDY_ID=this.A69TBM31_CRF_ID=0;this.A51TBW01_SESSION_ID=
this.A52TBW01_APP_ID=this.A53TBW01_DISP_DATETIME="";this.A54TBW01_LINE_NO=0;this.A685TBW01_FREE_SAVE_1="";this.A76TBM33_STUDY_ID=0;this.A416TBM33_DEL_FLG="";this.A77TBM33_CRF_ID=this.A78TBM33_COND_NO=0;this.A414TBM33_EXPRESSION="";this.A38TBM36_SELECT_CRF_ID=this.A37TBM36_COND_NO=this.A36TBM36_CRF_ID=this.A35TBM36_STUDY_ID=this.A415TBM33_PRIOR_NO=0;this.AV8C_TAM02_APP_ID=this.AV51Pgmname=this.A642TBM31_CRF_SNM=this.A608TBM01_SYS_VALUE=this.A58TBM01_SYS_ID=this.A589TBM36_DEL_FLG="";this.AV17H_A_PAGING_SDT=
{};this.AV25W_A_LOGIN_SDT={};this.AV34W_ERR_MSG="";this.Events={e111d2_client:["'BTN_AUTO_SEL'",true],e121d2_client:["'BTN_SRCH'",true],e131d2_client:["'BTN_CLER'",true],e331d2_client:["BTN_SEL.CLICK",true],e141d2_client:["VD_GRD_CHK_ALL.CLICK",true],e151d2_client:["'PAGE_FIRST'",true],e161d2_client:["'PAGE_LAST'",true],e171d2_client:["'PAGE_BACK'",true],e181d2_client:["'PAGE_NEXT'",true],e191d2_client:["'PAGE01'",true],e201d2_client:["'PAGE02'",true],e211d2_client:["'PAGE03'",true],e221d2_client:["'PAGE04'",
true],e231d2_client:["'PAGE05'",true],e241d2_client:["'PAGE06'",true],e251d2_client:["'PAGE07'",true],e261d2_client:["'PAGE08'",true],e271d2_client:["'PAGE09'",true],e281d2_client:["'PAGE10'",true],e351d2_client:["ENTER",true],e361d2_client:["CANCEL",true]};this.setVCMap("AV51Pgmname","vPGMNAME",0,"char");this.setVCMap("AV8C_TAM02_APP_ID","vC_TAM02_APP_ID",0,"svchar");this.setVCMap("AV24P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV17H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A63TBM21_STUDY_ID",
"TBM21_STUDY_ID",0,"int");this.setVCMap("A369TBM21_DEL_FLG","TBM21_DEL_FLG",0,"svchar");this.setVCMap("AV25W_A_LOGIN_SDT","vW_A_LOGIN_SDT",0,"A_LOGIN_SDT");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("A88TBT01_SUBJECT_ID","TBT01_SUBJECT_ID",0,"int");this.setVCMap("A87TBT01_STUDY_ID","TBT01_STUDY_ID",0,"int");this.setVCMap("A647TBT01_OUTER_SUBJECT_ID","TBT01_OUTER_SUBJECT_ID",0,"svchar");this.setVCMap("A441TBT01_DEL_FLG","TBT01_DEL_FLG",0,"svchar");this.setVCMap("A68TBM31_STUDY_ID",
"TBM31_STUDY_ID",0,"int");this.setVCMap("A69TBM31_CRF_ID","TBM31_CRF_ID",0,"int");this.setVCMap("A643TBM31_STATUS","TBM31_STATUS",0,"svchar");this.setVCMap("A397TBM31_DEL_FLG","TBM31_DEL_FLG",0,"svchar");this.setVCMap("A89TBT02_STUDY_ID","TBT02_STUDY_ID",0,"int");this.setVCMap("A90TBT02_SUBJECT_ID","TBT02_SUBJECT_ID",0,"int");this.setVCMap("A91TBT02_CRF_ID","TBT02_CRF_ID",0,"int");this.setVCMap("A935TBT02_CRF_EDA_NO","TBT02_CRF_EDA_NO",0,"int");this.setVCMap("A498TBT02_CRF_LATEST_VERSION","TBT02_CRF_LATEST_VERSION",
0,"int");this.setVCMap("AV34W_ERR_MSG","vW_ERR_MSG",0,"svchar");this.setVCMap("A642TBM31_CRF_SNM","TBM31_CRF_SNM",0,"svchar");this.setVCMap("AV23P_COL_COUNT","vP_COL_COUNT",0,"int");this.setVCMap("AV51Pgmname","vPGMNAME",0,"char");this.setVCMap("AV8C_TAM02_APP_ID","vC_TAM02_APP_ID",0,"svchar");this.setVCMap("AV24P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV17H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A369TBM21_DEL_FLG",
"TBM21_DEL_FLG",0,"svchar");this.setVCMap("AV25W_A_LOGIN_SDT","vW_A_LOGIN_SDT",0,"A_LOGIN_SDT");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("A88TBT01_SUBJECT_ID","TBT01_SUBJECT_ID",0,"int");this.setVCMap("A87TBT01_STUDY_ID","TBT01_STUDY_ID",0,"int");this.setVCMap("A647TBT01_OUTER_SUBJECT_ID","TBT01_OUTER_SUBJECT_ID",0,"svchar");this.setVCMap("A441TBT01_DEL_FLG","TBT01_DEL_FLG",0,"svchar");this.setVCMap("A68TBM31_STUDY_ID","TBM31_STUDY_ID",0,"int");this.setVCMap("A69TBM31_CRF_ID",
"TBM31_CRF_ID",0,"int");this.setVCMap("A643TBM31_STATUS","TBM31_STATUS",0,"svchar");this.setVCMap("A397TBM31_DEL_FLG","TBM31_DEL_FLG",0,"svchar");this.setVCMap("A89TBT02_STUDY_ID","TBT02_STUDY_ID",0,"int");this.setVCMap("A90TBT02_SUBJECT_ID","TBT02_SUBJECT_ID",0,"int");this.setVCMap("A91TBT02_CRF_ID","TBT02_CRF_ID",0,"int");this.setVCMap("A935TBT02_CRF_EDA_NO","TBT02_CRF_EDA_NO",0,"int");this.setVCMap("A498TBT02_CRF_LATEST_VERSION","TBT02_CRF_LATEST_VERSION",0,"int");this.setVCMap("AV34W_ERR_MSG",
"vW_ERR_MSG",0,"svchar");this.setVCMap("A642TBM31_CRF_SNM","TBM31_CRF_SNM",0,"svchar");d.addRefreshingVar(this.GXValidFnc[211]);d.addRefreshingVar(this.GXValidFnc[213]);d.addRefreshingVar(this.GXValidFnc[210]);d.addRefreshingVar({rfrVar:"AV51Pgmname"});d.addRefreshingVar({rfrVar:"AV8C_TAM02_APP_ID"});d.addRefreshingVar({rfrVar:"AV24P_MOVE_KBN"});d.addRefreshingVar({rfrVar:"AV17H_A_PAGING_SDT"});d.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});d.addRefreshingVar({rfrVar:"A369TBM21_DEL_FLG"});d.addRefreshingVar({rfrVar:"AV25W_A_LOGIN_SDT"});
d.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});d.addRefreshingVar({rfrVar:"A88TBT01_SUBJECT_ID"});d.addRefreshingVar({rfrVar:"A87TBT01_STUDY_ID"});d.addRefreshingVar(this.GXValidFnc[29]);d.addRefreshingVar({rfrVar:"A647TBT01_OUTER_SUBJECT_ID"});d.addRefreshingVar(this.GXValidFnc[33]);d.addRefreshingVar({rfrVar:"A441TBT01_DEL_FLG"});d.addRefreshingVar(this.GXValidFnc[161]);d.addRefreshingVar({rfrVar:"A68TBM31_STUDY_ID"});d.addRefreshingVar({rfrVar:"A69TBM31_CRF_ID"});d.addRefreshingVar({rfrVar:"A643TBM31_STATUS"});
d.addRefreshingVar({rfrVar:"A397TBM31_DEL_FLG"});d.addRefreshingVar({rfrVar:"A89TBT02_STUDY_ID"});d.addRefreshingVar({rfrVar:"A90TBT02_SUBJECT_ID"});d.addRefreshingVar({rfrVar:"A91TBT02_CRF_ID"});d.addRefreshingVar({rfrVar:"A935TBT02_CRF_EDA_NO"});d.addRefreshingVar({rfrVar:"A498TBT02_CRF_LATEST_VERSION"});d.addRefreshingVar(this.GXValidFnc[38]);d.addRefreshingVar({rfrVar:"AV34W_ERR_MSG"});d.addRefreshingVar({rfrVar:"A642TBM31_CRF_SNM"});e.addRefreshingVar(this.GXValidFnc[211]);e.addRefreshingVar(this.GXValidFnc[213]);
e.addRefreshingVar(this.GXValidFnc[210]);e.addRefreshingVar({rfrVar:"AV51Pgmname"});e.addRefreshingVar({rfrVar:"AV8C_TAM02_APP_ID"});e.addRefreshingVar({rfrVar:"AV24P_MOVE_KBN"});e.addRefreshingVar({rfrVar:"AV17H_A_PAGING_SDT"});e.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});e.addRefreshingVar({rfrVar:"A369TBM21_DEL_FLG"});e.addRefreshingVar({rfrVar:"AV25W_A_LOGIN_SDT"});e.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});e.addRefreshingVar({rfrVar:"A88TBT01_SUBJECT_ID"});e.addRefreshingVar({rfrVar:"A87TBT01_STUDY_ID"});
e.addRefreshingVar(this.GXValidFnc[29]);e.addRefreshingVar({rfrVar:"A647TBT01_OUTER_SUBJECT_ID"});e.addRefreshingVar(this.GXValidFnc[33]);e.addRefreshingVar({rfrVar:"A441TBT01_DEL_FLG"});e.addRefreshingVar(this.GXValidFnc[161]);e.addRefreshingVar({rfrVar:"A68TBM31_STUDY_ID"});e.addRefreshingVar({rfrVar:"A69TBM31_CRF_ID"});e.addRefreshingVar({rfrVar:"A643TBM31_STATUS"});e.addRefreshingVar({rfrVar:"A397TBM31_DEL_FLG"});e.addRefreshingVar({rfrVar:"A89TBT02_STUDY_ID"});e.addRefreshingVar({rfrVar:"A90TBT02_SUBJECT_ID"});
e.addRefreshingVar({rfrVar:"A91TBT02_CRF_ID"});e.addRefreshingVar({rfrVar:"A935TBT02_CRF_EDA_NO"});e.addRefreshingVar({rfrVar:"A498TBT02_CRF_LATEST_VERSION"});e.addRefreshingVar(this.GXValidFnc[38]);e.addRefreshingVar({rfrVar:"AV34W_ERR_MSG"});e.addRefreshingVar({rfrVar:"AV27W_B405_WP01_SD01"});c.addRefreshingVar(this.GXValidFnc[211]);c.addRefreshingVar(this.GXValidFnc[213]);c.addRefreshingVar({rfrVar:"AV8C_TAM02_APP_ID"});c.addRefreshingVar(this.GXValidFnc[210]);c.addRefreshingVar({rfrVar:"AV51Pgmname"});
c.addRefreshingVar({rfrVar:"AV24P_MOVE_KBN"});c.addRefreshingVar({rfrVar:"AV17H_A_PAGING_SDT"});c.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});c.addRefreshingVar({rfrVar:"A369TBM21_DEL_FLG"});c.addRefreshingVar({rfrVar:"AV25W_A_LOGIN_SDT"});c.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});c.addRefreshingVar({rfrVar:"A88TBT01_SUBJECT_ID"});c.addRefreshingVar({rfrVar:"A87TBT01_STUDY_ID"});c.addRefreshingVar(this.GXValidFnc[29]);c.addRefreshingVar({rfrVar:"A647TBT01_OUTER_SUBJECT_ID"});c.addRefreshingVar(this.GXValidFnc[33]);
c.addRefreshingVar({rfrVar:"A441TBT01_DEL_FLG"});c.addRefreshingVar(this.GXValidFnc[161]);c.addRefreshingVar({rfrVar:"A68TBM31_STUDY_ID"});c.addRefreshingVar({rfrVar:"A69TBM31_CRF_ID"});c.addRefreshingVar({rfrVar:"A643TBM31_STATUS"});c.addRefreshingVar({rfrVar:"A397TBM31_DEL_FLG"});c.addRefreshingVar({rfrVar:"A89TBT02_STUDY_ID"});c.addRefreshingVar({rfrVar:"A90TBT02_SUBJECT_ID"});c.addRefreshingVar({rfrVar:"A91TBT02_CRF_ID"});c.addRefreshingVar({rfrVar:"A935TBT02_CRF_EDA_NO"});c.addRefreshingVar({rfrVar:"A498TBT02_CRF_LATEST_VERSION"});
c.addRefreshingVar(this.GXValidFnc[38]);c.addRefreshingVar({rfrVar:"AV34W_ERR_MSG"});c.addRefreshingVar({rfrVar:"A685TBW01_FREE_SAVE_1"});this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[215],"AV17H_A_PAGING_SDT");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0204",lvl:1})});gx.setParentObj(new b405_wp01_kanja_crf_list);
