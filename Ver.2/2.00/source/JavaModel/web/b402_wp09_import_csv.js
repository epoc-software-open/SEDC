gx.evt.autoSkip=!1;
gx.define("b402_wp09_import_csv",!1,function(){this.ServerClass="b402_wp09_import_csv";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111c2_client");this.addKeyListener("11","e121c2_client");this.SetStandaloneVars=function(){this.AV37Pgmname=gx.fn.getControlValue("vPGMNAME");this.AV6C_APP_ID=gx.fn.getControlValue("vC_APP_ID");this.AV10H_A_PAGING_SDT=gx.fn.getControlValue("vH_A_PAGING_SDT");this.A840TBT16_IMPORT_DATETIME=
gx.fn.getDateTimeValue("TBT16_IMPORT_DATETIME");this.A190TBT16_IMPORT_NO=gx.fn.getIntegerValue("TBT16_IMPORT_NO",",");this.A839TBT16_FILE_NM=gx.fn.getControlValue("TBT16_FILE_NM");this.A838TBT16_IMPORT_FILE_NM=gx.fn.getControlValue("TBT16_IMPORT_FILE_NM");this.A841TBT16_DEL_FLG=gx.fn.getControlValue("TBT16_DEL_FLG");this.AV17W_A821_JS=gx.fn.getControlValue("vW_A821_JS");this.AV16W_A819_JS=gx.fn.getControlValue("vW_A819_JS");this.AV13P_RUN_DIV=gx.fn.getIntegerValue("vP_RUN_DIV",",");this.AV18W_B402_SD05_IMPORT_CSV_LIST=
gx.fn.getControlValue("vW_B402_SD05_IMPORT_CSV_LIST");this.AV14P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",")};this.s122_client=function(){this.AV16W_A819_JS=this.AV17W_A821_JS="";this.AV10H_A_PAGING_SDT.PAGE_NO=1};this.s222_client=function(){this.AV13P_RUN_DIV==2?gx.fn.setCtrlProperty("TABLE4","Visible",true):gx.fn.setCtrlProperty("TABLE4","Visible",false)};this.s162_client=function(){};this.e111c2_client=function(){this.executeServerEvent("'BTN_UPLOAD'",true)};this.e121c2_client=function(){this.executeServerEvent("'BTN_CAN'",
true)};this.e301c2_client=function(a){this.executeServerEvent("'BTN_DOWNLOAD'",true,a)};this.e131c2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e141c2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e151c2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e161c2_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e171c2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e181c2_client=function(){this.executeServerEvent("'PAGE02'",
true)};this.e191c2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e201c2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e211c2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e221c2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e231c2_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e241c2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e251c2_client=function(){this.executeServerEvent("'PAGE09'",
true)};this.e261c2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e311c2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e321c2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var a=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,20,23,26,28,31,33,34,42,45,50,53,56,59,62,65,68,71,74,77,80,83,86,89,92,95,98,101,104,107,110,113,116,119,122,125,128,131,134,137,140,145,148,150,152,159,162,164,166,168,176,179,180,181,182,183];this.GXLastCtrlId=183;var b=
this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",156,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp09_import_csv",[],true,1,true,true,10,false,false,false,"CollB402_SD05_IMPORT_CSV_LIST.B402_SD05_IMPORT_CSV_LISTItem",0,"px","\u884c\u8ffd\u52a0",true,false,false,null,null,false,"AV18W_B402_SD05_IMPORT_CSV_LIST",false,[1,1,1,1]);b.startRow("","","","","","");b.startCell("","","top","","","","","","","");b.startTable("Tbl_grid",159,"0px");b.addHtmlCode("<tbody>");b.startRow("",
"","","","","");b.startCell("","center","","","","36px","45px","","","");b.addSingleLineEdit("GXV2",162,"CTLTBT16_IMPORT_NO","","","TBT16_IMPORT_NO","int",10,"chr",10,10,"left",null,[],"GXV2","GXV2",true,0,false,false,"Attribute",1,"");b.endCell();b.startCell("","","","","","","300px","","","");b.addSingleLineEdit("GXV3",164,"CTLTBT16_IMPORT_FILE_NM","","","TBT16_IMPORT_FILE_NM","svchar",280,"px",200,80,"left",null,[],"GXV3","GXV3",true,0,false,false,"Attribute",1,"");b.endCell();b.startCell("","",
"","","","","200px","","","");b.addSingleLineEdit("GXV4",166,"CTLTBT16_IMPORT_DATETIME","","","TBT16_IMPORT_DATETIME","dtime",19,"chr",19,19,"right",null,[],"GXV4","GXV4",true,8,false,false,"Attribute",1,"");b.endCell();b.startCell("","center","","","","","200px","","","");b.addTextBlock("TXT_BTN_CSV_DOWNLOAD","e301c2_client");b.endCell();b.endRow();b.addHtmlCode("</tbody>");b.endTable();b.endCell();b.endRow();this.setGrid(b);a[2]={fld:"TABLE1",grid:0};a[6]={fld:"TABLE2",grid:0};a[12]={fld:"TBL_UPD_BTNSET",
grid:0};a[15]={fld:"TXT_BTN_UPLOAD",format:0,grid:0};a[17]={fld:"TXT_BTN_CAN",format:0,grid:0};a[20]={fld:"TABLE3",grid:0};a[23]={fld:"TABLE10",grid:0};a[26]={fld:"TEXTBLOCK16",format:0,grid:0};a[28]={lvl:0,type:"bitstr",len:1024,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_UPLOAD_FILE",gxz:"ZV9D_UPLOAD_FILE",gxold:"OV9D_UPLOAD_FILE",gxvar:"AV9D_UPLOAD_FILE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_UPLOAD_FILE=a},v2z:function(a){gx.O.ZV9D_UPLOAD_FILE=
a},v2c:function(){gx.fn.setBlobValue("vD_UPLOAD_FILE",gx.O.AV9D_UPLOAD_FILE)},c2v:function(){gx.O.AV9D_UPLOAD_FILE=this.val()},val:function(){return gx.fn.getBlobValue("vD_UPLOAD_FILE")},nac:gx.falseFn};a[31]={fld:"TEXTBLOCK31",format:0,grid:0};a[33]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_MOJI_CD",gxz:"ZV29D_MOJI_CD",gxold:"OV29D_MOJI_CD",gxvar:"AV29D_MOJI_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV29D_MOJI_CD=
a},v2z:function(a){gx.O.ZV29D_MOJI_CD=a},v2c:function(){gx.fn.setComboBoxValue("vD_MOJI_CD",gx.O.AV29D_MOJI_CD)},c2v:function(){gx.O.AV29D_MOJI_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_MOJI_CD")},nac:gx.falseFn};a[34]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_ORIGINAL_NAME",gxz:"ZV8D_ORIGINAL_NAME",gxold:"OV8D_ORIGINAL_NAME",gxvar:"AV8D_ORIGINAL_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8D_ORIGINAL_NAME=
a},v2z:function(a){gx.O.ZV8D_ORIGINAL_NAME=a},v2c:function(){gx.fn.setControlValue("vD_ORIGINAL_NAME",gx.O.AV8D_ORIGINAL_NAME,0)},c2v:function(){gx.O.AV8D_ORIGINAL_NAME=this.val()},val:function(){return gx.fn.getControlValue("vD_ORIGINAL_NAME")},nac:gx.falseFn};a[42]={fld:"TABLE4",grid:0};a[45]={fld:"TEXTBLOCK30",format:0,grid:0};a[50]={fld:"TBL_PAGE_AREA",grid:0};a[53]={fld:"TXT_REC_CNT",format:0,grid:0};a[56]={fld:"TBL_PAGE",grid:0};a[59]={fld:"TBL_FIRST",grid:0};a[62]={fld:"TXT_FIRST",format:0,
grid:0};a[65]={fld:"TBL_BACK",grid:0};a[68]={fld:"TXT_BACK",format:0,grid:0};a[71]={fld:"TBL_PAGE01",grid:0};a[74]={fld:"TXT_PAGE01",format:0,grid:0};a[77]={fld:"TBL_PAGE02",grid:0};a[80]={fld:"TXT_PAGE02",format:0,grid:0};a[83]={fld:"TBL_PAGE03",grid:0};a[86]={fld:"TXT_PAGE03",format:0,grid:0};a[89]={fld:"TBL_PAGE04",grid:0};a[92]={fld:"TXT_PAGE04",format:0,grid:0};a[95]={fld:"TBL_PAGE05",grid:0};a[98]={fld:"TXT_PAGE05",format:0,grid:0};a[101]={fld:"TBL_PAGE06",grid:0};a[104]={fld:"TXT_PAGE06",format:0,
grid:0};a[107]={fld:"TBL_PAGE07",grid:0};a[110]={fld:"TXT_PAGE07",format:0,grid:0};a[113]={fld:"TBL_PAGE08",grid:0};a[116]={fld:"TXT_PAGE08",format:0,grid:0};a[119]={fld:"TBL_PAGE09",grid:0};a[122]={fld:"TXT_PAGE09",format:0,grid:0};a[125]={fld:"TBL_PAGE10",grid:0};a[128]={fld:"TXT_PAGE10",format:0,grid:0};a[131]={fld:"TBL_NEXT",grid:0};a[134]={fld:"TXT_NEXT",format:0,grid:0};a[137]={fld:"TBL_LAST",grid:0};a[140]={fld:"TXT_LAST",format:0,grid:0};a[145]={fld:"TBL_GRID_HEADER",grid:0};a[148]={fld:"TEXTBLOCK18",
format:0,grid:0};a[150]={fld:"TEXTBLOCK33",format:0,grid:0};a[152]={fld:"TEXTBLOCK34",format:0,grid:0};a[159]={fld:"TBL_GRID",grid:156};a[162]={lvl:2,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,isacc:0,grid:156,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBT16_IMPORT_NO",gxz:"ZV33GXV2",gxold:"OV33GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV2=gx.num.intval(a)},v2z:function(a){gx.O.ZV33GXV2=gx.num.intval(a)},
v2c:function(a){gx.fn.setGridControlValue("CTLTBT16_IMPORT_NO",a||gx.fn.currentGridRowImpl(156),gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("CTLTBT16_IMPORT_NO",a||gx.fn.currentGridRowImpl(156),",")},nac:gx.falseFn};a[164]={lvl:2,type:"svchar",len:200,dec:0,sign:false,ro:0,isacc:0,grid:156,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBT16_IMPORT_FILE_NM",gxz:"ZV34GXV3",gxold:"OV34GXV3",gxvar:"GXV3",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV34GXV3=a},v2c:function(a){gx.fn.setGridControlValue("CTLTBT16_IMPORT_FILE_NM",a||gx.fn.currentGridRowImpl(156),gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(a){return gx.fn.getGridControlValue("CTLTBT16_IMPORT_FILE_NM",a||gx.fn.currentGridRowImpl(156))},nac:gx.falseFn};a[166]={lvl:2,type:"dtime",len:10,dec:8,sign:false,ro:0,isacc:0,grid:156,gxgrid:this.Grid1Container,
fnc:null,isvalid:null,rgrid:[],fld:"CTLTBT16_IMPORT_DATETIME",gxz:"ZV35GXV4",gxold:"OV35GXV4",gxvar:"GXV4",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV4=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV35GXV4=gx.fn.toDatetimeValue(a)},v2c:function(a){gx.fn.setGridControlValue("CTLTBT16_IMPORT_DATETIME",a||gx.fn.currentGridRowImpl(156),gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=gx.fn.toDatetimeValue(this.val())},
val:function(a){return gx.fn.getGridDateTimeValue("CTLTBT16_IMPORT_DATETIME",a||gx.fn.currentGridRowImpl(156))},nac:gx.falseFn};a[168]={fld:"TXT_BTN_CSV_DOWNLOAD",format:0,grid:156};a[176]={fld:"TBL_HIDDEN",grid:0};a[179]={fld:"TXT_JS_EVENT",format:1,grid:0};a[180]={fld:"TEXT_ONCLICK",format:1,grid:0};a[181]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV11H_INIT_FLG",gxold:"OV11H_INIT_FLG",gxvar:"AV11H_INIT_FLG",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_INIT_FLG=a},v2z:function(a){gx.O.ZV11H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV11H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV11H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(181,function(){});a[182]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV12H_KNGN_FLG",gxold:"OV12H_KNGN_FLG",gxvar:"AV12H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_KNGN_FLG=a},v2z:function(a){gx.O.ZV12H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV12H_KNGN_FLG,0)},c2v:function(){gx.O.AV12H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};a[183]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV36GXV5",gxold:"OV36GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=gx.num.intval(a)},v2z:function(a){gx.O.ZV36GXV5=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:gx.falseFn};this.OV8D_ORIGINAL_NAME=this.ZV8D_ORIGINAL_NAME=this.AV8D_ORIGINAL_NAME=this.OV29D_MOJI_CD=
this.ZV29D_MOJI_CD=this.AV29D_MOJI_CD=this.OV9D_UPLOAD_FILE=this.ZV9D_UPLOAD_FILE=this.AV9D_UPLOAD_FILE="";this.OV33GXV2=this.ZV33GXV2=0;this.OV34GXV3=this.ZV34GXV3="";this.ZV35GXV4=gx.date.nullDate();this.OV35GXV4=gx.date.nullDate();this.OV12H_KNGN_FLG=this.ZV12H_KNGN_FLG=this.AV12H_KNGN_FLG=this.OV11H_INIT_FLG=this.ZV11H_INIT_FLG=this.AV11H_INIT_FLG="";this.OV36GXV5=this.ZV36GXV5=this.GXV5=0;this.AV12H_KNGN_FLG=this.AV11H_INIT_FLG=this.AV8D_ORIGINAL_NAME=this.AV29D_MOJI_CD=this.AV9D_UPLOAD_FILE=
"";this.GXV2=this.AV14P_STUDY_ID=this.AV13P_RUN_DIV=this.GXV5=0;this.GXV3="";this.GXV4=gx.date.nullDate();this.A190TBT16_IMPORT_NO=0;this.A841TBT16_DEL_FLG=this.A838TBT16_IMPORT_FILE_NM=this.A839TBT16_FILE_NM="";this.A840TBT16_IMPORT_DATETIME=gx.date.nullDate();this.AV6C_APP_ID=this.AV37Pgmname="";this.AV10H_A_PAGING_SDT={};this.AV16W_A819_JS=this.AV17W_A821_JS="";this.AV18W_B402_SD05_IMPORT_CSV_LIST=[];this.Events={e111c2_client:["'BTN_UPLOAD'",true],e121c2_client:["'BTN_CAN'",true],e301c2_client:["'BTN_DOWNLOAD'",
true],e131c2_client:["'PAGE_FIRST'",true],e141c2_client:["'PAGE_LAST'",true],e151c2_client:["'PAGE_BACK'",true],e161c2_client:["'PAGE_NEXT'",true],e171c2_client:["'PAGE01'",true],e181c2_client:["'PAGE02'",true],e191c2_client:["'PAGE03'",true],e201c2_client:["'PAGE04'",true],e211c2_client:["'PAGE05'",true],e221c2_client:["'PAGE06'",true],e231c2_client:["'PAGE07'",true],e241c2_client:["'PAGE08'",true],e251c2_client:["'PAGE09'",true],e261c2_client:["'PAGE10'",true],e311c2_client:["ENTER",true],e321c2_client:["CANCEL",
true]};this.setVCMap("AV37Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_APP_ID","vC_APP_ID",0,"svchar");this.setVCMap("AV10H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A840TBT16_IMPORT_DATETIME","TBT16_IMPORT_DATETIME",0,"dtime");this.setVCMap("A190TBT16_IMPORT_NO","TBT16_IMPORT_NO",0,"int");this.setVCMap("A839TBT16_FILE_NM","TBT16_FILE_NM",0,"svchar");this.setVCMap("A838TBT16_IMPORT_FILE_NM","TBT16_IMPORT_FILE_NM",0,"svchar");this.setVCMap("A841TBT16_DEL_FLG","TBT16_DEL_FLG",
0,"svchar");this.setVCMap("AV17W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV16W_A819_JS","vW_A819_JS",0,"svchar");this.setVCMap("AV13P_RUN_DIV","vP_RUN_DIV",0,"int");this.setVCMap("AV18W_B402_SD05_IMPORT_CSV_LIST","vW_B402_SD05_IMPORT_CSV_LIST",0,"CollB402_SD05_IMPORT_CSV_LIST.B402_SD05_IMPORT_CSV_LISTItem");this.setVCMap("AV14P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV37Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_APP_ID","vC_APP_ID",0,"svchar");this.setVCMap("AV10H_A_PAGING_SDT",
"vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A840TBT16_IMPORT_DATETIME","TBT16_IMPORT_DATETIME",0,"dtime");this.setVCMap("A190TBT16_IMPORT_NO","TBT16_IMPORT_NO",0,"int");this.setVCMap("A839TBT16_FILE_NM","TBT16_FILE_NM",0,"svchar");this.setVCMap("A838TBT16_IMPORT_FILE_NM","TBT16_IMPORT_FILE_NM",0,"svchar");this.setVCMap("A841TBT16_DEL_FLG","TBT16_DEL_FLG",0,"svchar");this.setVCMap("AV17W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV16W_A819_JS","vW_A819_JS",0,"svchar");this.setVCMap("AV13P_RUN_DIV",
"vP_RUN_DIV",0,"int");this.setVCMap("AV18W_B402_SD05_IMPORT_CSV_LIST","vW_B402_SD05_IMPORT_CSV_LIST",0,"CollB402_SD05_IMPORT_CSV_LIST.B402_SD05_IMPORT_CSV_LISTItem");b.addRefreshingVar(this.GXValidFnc[181]);b.addRefreshingVar({rfrVar:"AV37Pgmname"});b.addRefreshingVar({rfrVar:"AV6C_APP_ID"});b.addRefreshingVar({rfrVar:"AV10H_A_PAGING_SDT"});b.addRefreshingVar({rfrVar:"A840TBT16_IMPORT_DATETIME"});b.addRefreshingVar({rfrVar:"A190TBT16_IMPORT_NO"});b.addRefreshingVar({rfrVar:"A839TBT16_FILE_NM"});b.addRefreshingVar({rfrVar:"A838TBT16_IMPORT_FILE_NM"});
b.addRefreshingVar({rfrVar:"A841TBT16_DEL_FLG"});b.addRefreshingVar({rfrVar:"AV17W_A821_JS"});b.addRefreshingVar({rfrVar:"AV16W_A819_JS"});b.addRefreshingVar(this.GXValidFnc[182]);b.addRefreshingVar({rfrVar:"AV13P_RUN_DIV"});b.addRefreshingVar({rfrVar:"AV18W_B402_SD05_IMPORT_CSV_LIST"});this.addGridBCProperty("W_b402_sd05_import_csv_list",["TBT16_IMPORT_NO"],this.GXValidFnc[162],"AV18W_B402_SD05_IMPORT_CSV_LIST");this.addGridBCProperty("W_b402_sd05_import_csv_list",["TBT16_IMPORT_FILE_NM"],this.GXValidFnc[164],
"AV18W_B402_SD05_IMPORT_CSV_LIST");this.addGridBCProperty("W_b402_sd05_import_csv_list",["TBT16_IMPORT_DATETIME"],this.GXValidFnc[166],"AV18W_B402_SD05_IMPORT_CSV_LIST");this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[183],"AV10H_A_PAGING_SDT");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0174",lvl:1})});gx.setParentObj(new b402_wp09_import_csv);