gx.evt.autoSkip=!1;
gx.define("b402_wp07_crf_list",!1,function(){this.ServerClass="b402_wp07_crf_list";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("2","e110z2_client");this.addKeyListener("3","e120z2_client");this.addKeyListener("5","e130z2_client");this.addKeyListener("6","e140z2_client");this.addKeyListener("7","e150z2_client");this.addKeyListener("8","e160z2_client");this.addKeyListener("11","e170z2_client");this.SetStandaloneVars=
function(){this.AV18P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV40Pgmname=gx.fn.getControlValue("vPGMNAME");this.AV5C_APP_ID=gx.fn.getControlValue("vC_APP_ID");this.A63TBM21_STUDY_ID=gx.fn.getIntegerValue("TBM21_STUDY_ID",",");this.A367TBM21_STUDY_NM=gx.fn.getControlValue("TBM21_STUDY_NM");this.AV17P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",");this.AV10H_A_PAGING_SDT=gx.fn.getControlValue("vH_A_PAGING_SDT");this.AV30W_REG_ENABEL=gx.fn.getControlValue("vW_REG_ENABEL");this.AV24W_A821_JS=
gx.fn.getControlValue("vW_A821_JS");this.AV28W_ERRFLG=gx.fn.getControlValue("vW_ERRFLG");this.A944TBM31_REPEAT_MAX=gx.fn.getIntegerValue("TBM31_REPEAT_MAX",",");this.A945TBM44_STUDY_ID=gx.fn.getIntegerValue("TBM44_STUDY_ID",",");this.A946TBM44_CRF_ID=gx.fn.getIntegerValue("TBM44_CRF_ID",",");this.A948TBM44_VISIT_NO=gx.fn.getIntegerValue("TBM44_VISIT_NO",",");this.A947TBM44_CRF_EDA_NO=gx.fn.getIntegerValue("TBM44_CRF_EDA_NO",",")};this.Valid_Tbm31_crf_id=function(){try{if(gx.fn.currentGridRowImpl(183)===
0)return true;var a=gx.util.balloon.getNew("TBM31_CRF_ID",gx.fn.currentGridRowImpl(183));this.AnyError=0;this.StandaloneModal();this.StandaloneNotModal()}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbm31_study_id=function(){try{if(gx.fn.currentGridRowImpl(183)===0)return true;var a=gx.util.balloon.getNew("TBM31_STUDY_ID",gx.fn.currentGridRowImpl(183));this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.s122_client=function(){this.AV9D_STATUS=
this.AV7D_CRF_NM="";this.AV8D_DEL_FLG="0";this.AV16H_STATUS=this.AV11H_CRF_NM="";this.AV12H_DEL_FLG="0";this.AV10H_A_PAGING_SDT.PAGE_NO=1;this.AV15H_SRCH_FLG="0";this.AV23W_A819_JS=""};this.s212_client=function(){this.AV11H_CRF_NM=this.AV7D_CRF_NM;this.AV16H_STATUS=this.AV9D_STATUS;this.AV12H_DEL_FLG=this.AV8D_DEL_FLG};this.s172_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",
gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");if(""!=this.AV24W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV24W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+
"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e110z2_client=function(){this.executeServerEvent("'BTN_CHK'",true)};this.e120z2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e130z2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e140z2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e150z2_client=function(){this.executeServerEvent("'BTN_LSIT_IMPORT'",true)};this.e160z2_client=function(){this.executeServerEvent("'BTN_PART_IMPORT'",
true)};this.e170z2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e350z2_client=function(a){this.executeServerEvent("'BTN_SEL'",true,a)};this.e360z2_client=function(a){this.executeServerEvent("'BTN_CRF_COPY'",true,a)};this.e180z2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e190z2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e200z2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e210z2_client=function(){this.executeServerEvent("'PAGE_NEXT'",
true)};this.e220z2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e230z2_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e240z2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e250z2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e260z2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e270z2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e280z2_client=function(){this.executeServerEvent("'PAGE07'",
true)};this.e290z2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e300z2_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e310z2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e370z2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e380z2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,19,21,23,26,29,32,35,37,40,42,44,46,48,50,53,56,59,65,68,71,74,77,80,83,86,89,92,
95,98,101,104,107,110,113,116,119,122,125,128,131,134,137,140,143,146,149,152,155,158,164,168,170,172,174,176,178,186,189,191,193,194,195,197,200,202,204,205,207,209,211,213,214,219,222,223,224,225,226,229,231,234,236,239,241,242];this.GXLastCtrlId=242;var c=this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",183,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp07_crf_list",[],true,1,true,true,10,false,false,false,"",935,"px","\u884c\u8ffd\u52a0",true,false,false,null,
null,false,"",false,[1,1,1,1]);c.startRow("","","","","","");c.startCell("","","","","","","","","","");c.startTable("Tbl_grid",186,"1035px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("","center","","","","","45px","","","");c.addTextBlock("BTN_SEL","e350z2_client");c.endCell();c.startCell("","right","","","","","50px","","","");c.addSingleLineEdit(395,191,"TBM31_ORDER","","","TBM31_ORDER","int",5,"chr",5,5,"right",null,[],395,"TBM31_ORDER",true,0,false,false,"ReadonlyAttribute",
1,"");c.endCell();c.startCell("","","","","","","","","","");c.addSingleLineEdit(69,193,"TBM31_CRF_ID","","","TBM31_CRF_ID","int",4,"chr",4,4,"right",null,[],69,"TBM31_CRF_ID",true,0,false,false,"ReadonlyAttribute",1,"");c.addSingleLineEdit("D_space",194,"vD_SPACE","","","D_SPACE","char",1,"chr",1,1,"left",null,[],"D_space","D_SPACE",true,0,false,false,"ReadonlyAttribute",1,"");c.addSingleLineEdit(393,195,"TBM31_CRF_NM","","","TBM31_CRF_NM","svchar",80,"chr",100,80,"left",null,[],393,"TBM31_CRF_NM",
true,0,false,false,"ReadonlyAttribute",1,"");c.endCell();c.startCell("","center","","","","","90px","","","");c.startTable("Table5",197,"0px");c.addHtmlCode("<tbody>");c.startRow("","","","","","");c.startCell("","","","","","","","","","");c.addComboBox(943,200,"TBM31_REPEAT_FLG","","TBM31_REPEAT_FLG","int",null,0,true,false,1,"chr","");c.endCell();c.startCell("","","","","","","","","","");c.addSingleLineEdit("D_grd_repeat",202,"vD_GRD_REPEAT","","","D_GRD_REPEAT","svchar",10,"chr",10,10,"left",
null,[],"D_grd_repeat","D_GRD_REPEAT",true,0,false,false,"Attribute",1,"");c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();c.endCell();c.startCell("","","","","","","100px","","","");c.startDiv("Section1","0px","98px");c.addSingleLineEdit("D_grd_visit_no",205,"vD_GRD_VISIT_NO","","","D_GRD_VISIT_NO","svchar",40,"chr",40,40,"left",null,[],"D_grd_visit_no","D_GRD_VISIT_NO",true,0,false,false,"Attribute",1,"");c.endDiv();c.endCell();c.startCell("","","","","","","70px","","","");c.addComboBox(643,
207,"TBM31_STATUS","","TBM31_STATUS","svchar",null,0,true,false,1,"chr","");c.endCell();c.startCell("","","","","","","70px","","","");c.addComboBox(397,209,"TBM31_DEL_FLG","","TBM31_DEL_FLG","svchar",null,0,true,false,1,"chr","");c.endCell();c.startCell("","center","","","","","60px","","","");c.addTextBlock("TXT_CRF_COPY","e360z2_client");c.endCell();c.startCell("","center","","","","","40px","","","");c.addTextBlock("TXT_BTN_EDIT",null);c.endCell();c.endRow();c.addHtmlCode("</tbody>");c.endTable();
c.addSingleLineEdit(68,214,"TBM31_STUDY_ID","","","TBM31_STUDY_ID","int",10,"chr",10,10,"right",null,[],68,"TBM31_STUDY_ID",true,0,false,false,"Attribute",1,"");c.endCell();c.endRow();this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TBL_UPD_BTNSET",grid:0};b[15]={fld:"TXT_BTN_CHK",format:0,grid:0};b[17]={fld:"TXT_BTN_REG",format:0,grid:0};b[19]={fld:"TXT_BTN_LSIT_IMPORT",format:0,grid:0};b[21]={fld:"TXT_BTN_PART_IMPORT",format:0,grid:0};b[23]={fld:"TXT_BTN_CAN",format:0,
grid:0};b[26]={fld:"TABLE3",grid:0};b[29]={fld:"TABLE4",grid:0};b[32]={fld:"TABLE10",grid:0};b[35]={fld:"TEXTBLOCK16",format:0,grid:0};b[37]={fld:"TXT_STUDY",format:0,grid:0};b[40]={fld:"TEXTBLOCK18",format:0,grid:0};b[42]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRF_NM",gxz:"ZV7D_CRF_NM",gxold:"OV7D_CRF_NM",gxvar:"AV7D_CRF_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7D_CRF_NM=a},v2z:function(a){gx.O.ZV7D_CRF_NM=
a},v2c:function(){gx.fn.setControlValue("vD_CRF_NM",gx.O.AV7D_CRF_NM,0)},c2v:function(){gx.O.AV7D_CRF_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_CRF_NM")},nac:gx.falseFn};b[44]={fld:"TEXTBLOCK33",format:0,grid:0};b[46]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_STATUS",gxz:"ZV9D_STATUS",gxold:"OV9D_STATUS",gxvar:"AV9D_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.AV9D_STATUS=a},v2z:function(a){gx.O.ZV9D_STATUS=
a},v2c:function(){gx.fn.setRadioValue("vD_STATUS",gx.O.AV9D_STATUS)},c2v:function(){gx.O.AV9D_STATUS=this.val()},val:function(){return gx.fn.getControlValue("vD_STATUS")},nac:gx.falseFn};b[48]={fld:"TEXTBLOCK34",format:0,grid:0};b[50]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_DEL_FLG",gxz:"ZV8D_DEL_FLG",gxold:"OV8D_DEL_FLG",gxvar:"AV8D_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.AV8D_DEL_FLG=a},v2z:function(a){gx.O.ZV8D_DEL_FLG=
a},v2c:function(){gx.fn.setRadioValue("vD_DEL_FLG",gx.O.AV8D_DEL_FLG)},c2v:function(){gx.O.AV8D_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("vD_DEL_FLG")},nac:gx.falseFn};b[53]={fld:"TABLE9",grid:0};b[56]={fld:"TEXTBLOCK45",format:0,grid:0};b[59]={fld:"TEXTBLOCK46",format:0,grid:0};b[65]={fld:"TBL_LIST",grid:0};b[68]={fld:"TBL_PAGE_AREA",grid:0};b[71]={fld:"TXT_REC_CNT",format:0,grid:0};b[74]={fld:"TBL_PAGE",grid:0};b[77]={fld:"TBL_FIRST",grid:0};b[80]={fld:"TXT_FIRST",format:0,
grid:0};b[83]={fld:"TBL_BACK",grid:0};b[86]={fld:"TXT_BACK",format:0,grid:0};b[89]={fld:"TBL_PAGE01",grid:0};b[92]={fld:"TXT_PAGE01",format:0,grid:0};b[95]={fld:"TBL_PAGE02",grid:0};b[98]={fld:"TXT_PAGE02",format:0,grid:0};b[101]={fld:"TBL_PAGE03",grid:0};b[104]={fld:"TXT_PAGE03",format:0,grid:0};b[107]={fld:"TBL_PAGE04",grid:0};b[110]={fld:"TXT_PAGE04",format:0,grid:0};b[113]={fld:"TBL_PAGE05",grid:0};b[116]={fld:"TXT_PAGE05",format:0,grid:0};b[119]={fld:"TBL_PAGE06",grid:0};b[122]={fld:"TXT_PAGE06",
format:0,grid:0};b[125]={fld:"TBL_PAGE07",grid:0};b[128]={fld:"TXT_PAGE07",format:0,grid:0};b[131]={fld:"TBL_PAGE08",grid:0};b[134]={fld:"TXT_PAGE08",format:0,grid:0};b[137]={fld:"TBL_PAGE09",grid:0};b[140]={fld:"TXT_PAGE09",format:0,grid:0};b[143]={fld:"TBL_PAGE10",grid:0};b[146]={fld:"TXT_PAGE10",format:0,grid:0};b[149]={fld:"TBL_NEXT",grid:0};b[152]={fld:"TXT_NEXT",format:0,grid:0};b[155]={fld:"TBL_LAST",grid:0};b[158]={fld:"TXT_LAST",format:0,grid:0};b[164]={fld:"TBL_IN_GRID_HEADER",grid:0};b[168]=
{fld:"TEXTBLOCK41",format:0,grid:0};b[170]={fld:"TEXTBLOCK13",format:0,grid:0};b[172]={fld:"TEXTBLOCK39",format:0,grid:0};b[174]={fld:"TEXTBLOCK42",format:1,grid:0};b[176]={fld:"TEXTBLOCK35",format:0,grid:0};b[178]={fld:"TEXTBLOCK47",format:0,grid:0};b[186]={fld:"TBL_GRID",grid:183};b[189]={fld:"BTN_SEL",format:0,grid:183};b[191]={lvl:2,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM31_ORDER",gxz:"Z395TBM31_ORDER",
gxold:"O395TBM31_ORDER",gxvar:"A395TBM31_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A395TBM31_ORDER=gx.num.intval(a)},v2z:function(a){gx.O.Z395TBM31_ORDER=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("TBM31_ORDER",a||gx.fn.currentGridRowImpl(183),gx.O.A395TBM31_ORDER,0)},c2v:function(){gx.O.A395TBM31_ORDER=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBM31_ORDER",a||gx.fn.currentGridRowImpl(183),",")},nac:gx.falseFn};
b[193]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:this.Valid_Tbm31_crf_id,isvalid:null,rgrid:[],fld:"TBM31_CRF_ID",gxz:"Z69TBM31_CRF_ID",gxold:"O69TBM31_CRF_ID",gxvar:"A69TBM31_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A69TBM31_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z69TBM31_CRF_ID=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("TBM31_CRF_ID",a||gx.fn.currentGridRowImpl(183),
gx.O.A69TBM31_CRF_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A69TBM31_CRF_ID=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBM31_CRF_ID",a||gx.fn.currentGridRowImpl(183),",")},nac:gx.falseFn};b[194]={lvl:2,type:"char",len:1,dec:0,sign:false,ro:0,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_SPACE",gxz:"ZV33D_SPACE",gxold:"OV33D_SPACE",gxvar:"AV33D_SPACE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV33D_SPACE=a},v2z:function(a){gx.O.ZV33D_SPACE=a},v2c:function(a){gx.fn.setGridControlValue("vD_SPACE",a||gx.fn.currentGridRowImpl(183),gx.O.AV33D_SPACE,0)},c2v:function(){gx.O.AV33D_SPACE=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_SPACE",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};b[195]={lvl:2,type:"svchar",len:100,dec:0,sign:false,ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM31_CRF_NM",
gxz:"Z393TBM31_CRF_NM",gxold:"O393TBM31_CRF_NM",gxvar:"A393TBM31_CRF_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A393TBM31_CRF_NM=a},v2z:function(a){gx.O.Z393TBM31_CRF_NM=a},v2c:function(a){gx.fn.setGridControlValue("TBM31_CRF_NM",a||gx.fn.currentGridRowImpl(183),gx.O.A393TBM31_CRF_NM,0)},c2v:function(){gx.O.A393TBM31_CRF_NM=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM31_CRF_NM",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};
b[197]={fld:"TABLE5",grid:183};b[200]={lvl:2,type:"int",len:1,dec:0,sign:false,pic:"9",ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM31_REPEAT_FLG",gxz:"Z943TBM31_REPEAT_FLG",gxold:"O943TBM31_REPEAT_FLG",gxvar:"A943TBM31_REPEAT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(a){gx.O.A943TBM31_REPEAT_FLG=gx.num.intval(a)},v2z:function(a){gx.O.Z943TBM31_REPEAT_FLG=gx.num.intval(a)},v2c:function(a){gx.fn.setGridComboBoxValue("TBM31_REPEAT_FLG",
a||gx.fn.currentGridRowImpl(183),gx.O.A943TBM31_REPEAT_FLG)},c2v:function(){gx.O.A943TBM31_REPEAT_FLG=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBM31_REPEAT_FLG",a||gx.fn.currentGridRowImpl(183),",")},nac:gx.falseFn};b[202]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:0,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_REPEAT",gxz:"ZV34D_GRD_REPEAT",gxold:"OV34D_GRD_REPEAT",gxvar:"AV34D_GRD_REPEAT",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV34D_GRD_REPEAT=a},v2z:function(a){gx.O.ZV34D_GRD_REPEAT=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_REPEAT",a||gx.fn.currentGridRowImpl(183),gx.O.AV34D_GRD_REPEAT,0)},c2v:function(){gx.O.AV34D_GRD_REPEAT=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_REPEAT",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};b[204]={fld:"SECTION1",grid:183};b[205]={lvl:2,type:"svchar",len:40,dec:0,sign:false,ro:0,
isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_VISIT_NO",gxz:"ZV35D_GRD_VISIT_NO",gxold:"OV35D_GRD_VISIT_NO",gxvar:"AV35D_GRD_VISIT_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV35D_GRD_VISIT_NO=a},v2z:function(a){gx.O.ZV35D_GRD_VISIT_NO=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_VISIT_NO",a||gx.fn.currentGridRowImpl(183),gx.O.AV35D_GRD_VISIT_NO,0)},c2v:function(){gx.O.AV35D_GRD_VISIT_NO=this.val()},
val:function(a){return gx.fn.getGridControlValue("vD_GRD_VISIT_NO",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};b[207]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM31_STATUS",gxz:"Z643TBM31_STATUS",gxold:"O643TBM31_STATUS",gxvar:"A643TBM31_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:"text",v2v:function(a){gx.O.A643TBM31_STATUS=a},v2z:function(a){gx.O.Z643TBM31_STATUS=a},v2c:function(a){gx.fn.setGridComboBoxValue("TBM31_STATUS",
a||gx.fn.currentGridRowImpl(183),gx.O.A643TBM31_STATUS)},c2v:function(){gx.O.A643TBM31_STATUS=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM31_STATUS",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};b[209]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM31_DEL_FLG",gxz:"Z397TBM31_DEL_FLG",gxold:"O397TBM31_DEL_FLG",gxvar:"A397TBM31_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",inputType:"text",
v2v:function(a){gx.O.A397TBM31_DEL_FLG=a},v2z:function(a){gx.O.Z397TBM31_DEL_FLG=a},v2c:function(a){gx.fn.setGridComboBoxValue("TBM31_DEL_FLG",a||gx.fn.currentGridRowImpl(183),gx.O.A397TBM31_DEL_FLG);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A397TBM31_DEL_FLG=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM31_DEL_FLG",a||gx.fn.currentGridRowImpl(183))},nac:gx.falseFn};b[211]={fld:"TXT_CRF_COPY",format:0,grid:183};b[213]={fld:"TXT_BTN_EDIT",format:0,
grid:183};b[214]={lvl:2,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:1,isacc:0,grid:183,gxgrid:this.Grid1Container,fnc:this.Valid_Tbm31_study_id,isvalid:null,rgrid:[],fld:"TBM31_STUDY_ID",gxz:"Z68TBM31_STUDY_ID",gxold:"O68TBM31_STUDY_ID",gxvar:"A68TBM31_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A68TBM31_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z68TBM31_STUDY_ID=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("TBM31_STUDY_ID",
a||gx.fn.currentGridRowImpl(183),gx.O.A68TBM31_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A68TBM31_STUDY_ID=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBM31_STUDY_ID",a||gx.fn.currentGridRowImpl(183),",")},nac:gx.falseFn};b[219]={fld:"TBL_HIDDEN",grid:0};b[222]={fld:"TXT_JS_EVENT",format:1,grid:0};b[223]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",
gxz:"ZV13H_INIT_FLG",gxold:"OV13H_INIT_FLG",gxvar:"AV13H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_INIT_FLG=a},v2z:function(a){gx.O.ZV13H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV13H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV13H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(223,function(){});b[224]={lvl:0,type:"svchar",
len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_SRCH_FLG",gxz:"ZV15H_SRCH_FLG",gxold:"OV15H_SRCH_FLG",gxvar:"AV15H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV15H_SRCH_FLG=a},v2z:function(a){gx.O.ZV15H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV15H_SRCH_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV15H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(224,function(){});b[225]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV14H_KNGN_FLG",gxold:"OV14H_KNGN_FLG",gxvar:"AV14H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV14H_KNGN_FLG=a},v2z:function(a){gx.O.ZV14H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV14H_KNGN_FLG,0)},c2v:function(){gx.O.AV14H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},
nac:gx.falseFn};b[226]={fld:"TABLE7",grid:0};b[229]={fld:"TEXTBLOCK36",format:0,grid:0};b[231]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_CRF_NM",gxz:"ZV11H_CRF_NM",gxold:"OV11H_CRF_NM",gxvar:"AV11H_CRF_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_CRF_NM=a},v2z:function(a){gx.O.ZV11H_CRF_NM=a},v2c:function(){gx.fn.setControlValue("vH_CRF_NM",gx.O.AV11H_CRF_NM,0)},c2v:function(){gx.O.AV11H_CRF_NM=
this.val()},val:function(){return gx.fn.getControlValue("vH_CRF_NM")},nac:gx.falseFn};b[234]={fld:"TEXTBLOCK37",format:0,grid:0};b[236]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_STATUS",gxz:"ZV16H_STATUS",gxold:"OV16H_STATUS",gxvar:"AV16H_STATUS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_STATUS=a},v2z:function(a){gx.O.ZV16H_STATUS=a},v2c:function(){gx.fn.setControlValue("vH_STATUS",gx.O.AV16H_STATUS,
0)},c2v:function(){gx.O.AV16H_STATUS=this.val()},val:function(){return gx.fn.getControlValue("vH_STATUS")},nac:gx.falseFn};b[239]={fld:"TEXTBLOCK38",format:0,grid:0};b[241]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_DEL_FLG",gxz:"ZV12H_DEL_FLG",gxold:"OV12H_DEL_FLG",gxvar:"AV12H_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_DEL_FLG=a},v2z:function(a){gx.O.ZV12H_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("vH_DEL_FLG",
gx.O.AV12H_DEL_FLG,0)},c2v:function(){gx.O.AV12H_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_DEL_FLG")},nac:gx.falseFn};b[242]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV38GXV1",gxold:"OV38GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV38GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",
gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:gx.falseFn};this.OV8D_DEL_FLG=this.ZV8D_DEL_FLG=this.AV8D_DEL_FLG=this.OV9D_STATUS=this.ZV9D_STATUS=this.AV9D_STATUS=this.OV7D_CRF_NM=this.ZV7D_CRF_NM=this.AV7D_CRF_NM="";this.O69TBM31_CRF_ID=this.Z69TBM31_CRF_ID=this.O395TBM31_ORDER=this.Z395TBM31_ORDER=0;this.O393TBM31_CRF_NM=this.Z393TBM31_CRF_NM=this.OV33D_SPACE=this.ZV33D_SPACE="";this.O943TBM31_REPEAT_FLG=this.Z943TBM31_REPEAT_FLG=
0;this.O397TBM31_DEL_FLG=this.Z397TBM31_DEL_FLG=this.O643TBM31_STATUS=this.Z643TBM31_STATUS=this.OV35D_GRD_VISIT_NO=this.ZV35D_GRD_VISIT_NO=this.OV34D_GRD_REPEAT=this.ZV34D_GRD_REPEAT="";this.O68TBM31_STUDY_ID=this.Z68TBM31_STUDY_ID=0;this.OV12H_DEL_FLG=this.ZV12H_DEL_FLG=this.AV12H_DEL_FLG=this.OV16H_STATUS=this.ZV16H_STATUS=this.AV16H_STATUS=this.OV11H_CRF_NM=this.ZV11H_CRF_NM=this.AV11H_CRF_NM=this.OV14H_KNGN_FLG=this.ZV14H_KNGN_FLG=this.AV14H_KNGN_FLG=this.OV15H_SRCH_FLG=this.ZV15H_SRCH_FLG=this.AV15H_SRCH_FLG=
this.OV13H_INIT_FLG=this.ZV13H_INIT_FLG=this.AV13H_INIT_FLG="";this.OV38GXV1=this.ZV38GXV1=this.GXV1=0;this.AV12H_DEL_FLG=this.AV16H_STATUS=this.AV11H_CRF_NM=this.AV14H_KNGN_FLG=this.AV15H_SRCH_FLG=this.AV13H_INIT_FLG=this.AV8D_DEL_FLG=this.AV9D_STATUS=this.AV7D_CRF_NM="";this.A69TBM31_CRF_ID=this.A395TBM31_ORDER=this.A944TBM31_REPEAT_MAX=this.AV18P_STUDY_ID=this.AV17P_MOVE_KBN=this.GXV1=0;this.A393TBM31_CRF_NM=this.AV33D_SPACE="";this.A943TBM31_REPEAT_FLG=0;this.A397TBM31_DEL_FLG=this.A643TBM31_STATUS=
this.AV35D_GRD_VISIT_NO=this.AV34D_GRD_REPEAT="";this.A63TBM21_STUDY_ID=this.A68TBM31_STUDY_ID=0;this.A367TBM21_STUDY_NM="";this.A947TBM44_CRF_EDA_NO=this.A948TBM44_VISIT_NO=this.A946TBM44_CRF_ID=this.A945TBM44_STUDY_ID=this.A71TBM32_CRF_ID=this.A70TBM32_STUDY_ID=this.A77TBM33_CRF_ID=this.A76TBM33_STUDY_ID=this.A29TBM34_CRF_ID=this.A28TBM34_STUDY_ID=this.A32TBM35_CRF_ID=this.A31TBM35_STUDY_ID=this.A36TBM36_CRF_ID=this.A35TBM36_STUDY_ID=this.A80TBM37_CRF_ID=this.A79TBM37_STUDY_ID=this.A20TBM41_CRF_ID=
this.A19TBM41_STUDY_ID=0;this.AV5C_APP_ID=this.AV40Pgmname="";this.AV10H_A_PAGING_SDT={};this.AV30W_REG_ENABEL=false;this.AV24W_A821_JS="";this.AV28W_ERRFLG=false;this.AV23W_A819_JS="";this.Events={e110z2_client:["'BTN_CHK'",true],e120z2_client:["'BTN_REG'",true],e130z2_client:["'BTN_SRCH'",true],e140z2_client:["'BTN_CLER'",true],e150z2_client:["'BTN_LSIT_IMPORT'",true],e160z2_client:["'BTN_PART_IMPORT'",true],e170z2_client:["'BTN_CAN'",true],e350z2_client:["'BTN_SEL'",true],e360z2_client:["'BTN_CRF_COPY'",
true],e180z2_client:["'PAGE_FIRST'",true],e190z2_client:["'PAGE_LAST'",true],e200z2_client:["'PAGE_BACK'",true],e210z2_client:["'PAGE_NEXT'",true],e220z2_client:["'PAGE01'",true],e230z2_client:["'PAGE02'",true],e240z2_client:["'PAGE03'",true],e250z2_client:["'PAGE04'",true],e260z2_client:["'PAGE05'",true],e270z2_client:["'PAGE06'",true],e280z2_client:["'PAGE07'",true],e290z2_client:["'PAGE08'",true],e300z2_client:["'PAGE09'",true],e310z2_client:["'PAGE10'",true],e370z2_client:["ENTER",true],e380z2_client:["CANCEL",
true]};this.setVCMap("AV18P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV40Pgmname","vPGMNAME",0,"char");this.setVCMap("AV5C_APP_ID","vC_APP_ID",0,"svchar");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV17P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV10H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("AV30W_REG_ENABEL","vW_REG_ENABEL",0,"boolean");this.setVCMap("AV24W_A821_JS",
"vW_A821_JS",0,"svchar");this.setVCMap("AV28W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A944TBM31_REPEAT_MAX","TBM31_REPEAT_MAX",0,"int");this.setVCMap("A945TBM44_STUDY_ID","TBM44_STUDY_ID",0,"int");this.setVCMap("A946TBM44_CRF_ID","TBM44_CRF_ID",0,"int");this.setVCMap("A948TBM44_VISIT_NO","TBM44_VISIT_NO",0,"int");this.setVCMap("A947TBM44_CRF_EDA_NO","TBM44_CRF_EDA_NO",0,"int");this.setVCMap("AV18P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV40Pgmname","vPGMNAME",0,"char");this.setVCMap("AV5C_APP_ID",
"vC_APP_ID",0,"svchar");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV17P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV10H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("AV30W_REG_ENABEL","vW_REG_ENABEL",0,"boolean");this.setVCMap("AV24W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV28W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A944TBM31_REPEAT_MAX","TBM31_REPEAT_MAX",0,
"int");this.setVCMap("A945TBM44_STUDY_ID","TBM44_STUDY_ID",0,"int");this.setVCMap("A946TBM44_CRF_ID","TBM44_CRF_ID",0,"int");this.setVCMap("A948TBM44_VISIT_NO","TBM44_VISIT_NO",0,"int");this.setVCMap("A947TBM44_CRF_EDA_NO","TBM44_CRF_EDA_NO",0,"int");c.addRefreshingVar(this.GXValidFnc[224]);c.addRefreshingVar(this.GXValidFnc[231]);c.addRefreshingVar(this.GXValidFnc[236]);c.addRefreshingVar(this.GXValidFnc[241]);c.addRefreshingVar({rfrVar:"AV18P_STUDY_ID"});c.addRefreshingVar({rfrVar:"AV33D_SPACE",
rfrProp:"Value",gxAttId:"D_space"});c.addRefreshingVar(this.GXValidFnc[223]);c.addRefreshingVar({rfrVar:"AV40Pgmname"});c.addRefreshingVar({rfrVar:"AV5C_APP_ID"});c.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});c.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});c.addRefreshingVar({rfrVar:"AV17P_MOVE_KBN"});c.addRefreshingVar({rfrVar:"AV10H_A_PAGING_SDT"});c.addRefreshingVar({rfrVar:"AV30W_REG_ENABEL"});c.addRefreshingVar({rfrVar:"AV24W_A821_JS"});c.addRefreshingVar({rfrVar:"AV28W_ERRFLG"});c.addRefreshingVar(this.GXValidFnc[225]);
c.addRefreshingVar(this.GXValidFnc[42]);c.addRefreshingVar(this.GXValidFnc[46]);c.addRefreshingVar(this.GXValidFnc[50]);c.addRefreshingVar({rfrVar:"A943TBM31_REPEAT_FLG",rfrProp:"Value",gxAttId:"943"});c.addRefreshingVar({rfrVar:"A944TBM31_REPEAT_MAX"});c.addRefreshingVar({rfrVar:"A945TBM44_STUDY_ID"});c.addRefreshingVar({rfrVar:"A68TBM31_STUDY_ID",rfrProp:"Value",gxAttId:"68"});c.addRefreshingVar({rfrVar:"A946TBM44_CRF_ID"});c.addRefreshingVar({rfrVar:"A69TBM31_CRF_ID",rfrProp:"Value",gxAttId:"69"});
c.addRefreshingVar({rfrVar:"A948TBM44_VISIT_NO"});c.addRefreshingVar({rfrVar:"A947TBM44_CRF_EDA_NO"});c.addRefreshingVar({rfrVar:"A643TBM31_STATUS",rfrProp:"Value",gxAttId:"643"});c.addRefreshingVar({rfrVar:"A397TBM31_DEL_FLG",rfrProp:"Value",gxAttId:"397"});this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[242],"AV10H_A_PAGING_SDT");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0217",
lvl:1})});gx.setParentObj(new b402_wp07_crf_list);