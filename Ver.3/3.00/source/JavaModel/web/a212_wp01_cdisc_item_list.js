gx.evt.autoSkip=!1;
gx.define("a212_wp01_cdisc_item_list",!1,function(){this.ServerClass="a212_wp01_cdisc_item_list";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111w2_client");this.addKeyListener("4","e121w2_client");this.addKeyListener("5","e131w2_client");this.addKeyListener("6","e141w2_client");this.addKeyListener("7","e151w2_client");this.addKeyListener("8","e161w2_client");this.addKeyListener("9","e171w2_client");
this.SetStandaloneVars=function(){this.AV53Pgmname=gx.fn.getControlValue("vPGMNAME");this.AV6C_TAM02_APP_ID=gx.fn.getControlValue("vC_TAM02_APP_ID");this.AV26P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",");this.AV27P_MOVE_KBN_2=gx.fn.getIntegerValue("vP_MOVE_KBN_2",",");this.AV25P_DOM_CD=gx.fn.getControlValue("vP_DOM_CD");this.AV17H_A_PAGING_SDT=gx.fn.getControlValue("vH_A_PAGING_SDT");this.A49TBM02_DOM_CD=gx.fn.getControlValue("TBM02_DOM_CD");this.A611TBM02_DOM_JNM=gx.fn.getControlValue("TBM02_DOM_JNM");
this.AV30W_A821_JS=gx.fn.getControlValue("vW_A821_JS");this.AV44SD_A212_SD01_LIST_C=gx.fn.getControlValue("vSD_A212_SD01_LIST_C");this.AV34W_ERRFLG=gx.fn.getControlValue("vW_ERRFLG");this.A59TBM03_DOM_CD=gx.fn.getControlValue("TBM03_DOM_CD");this.A60TBM03_DOM_VAR_NM=gx.fn.getControlValue("TBM03_DOM_VAR_NM");this.A346TBM03_VAR_DESC=gx.fn.getControlValue("TBM03_VAR_DESC");this.A61TBM03_ORDER=gx.fn.getIntegerValue("TBM03_ORDER",",");this.A932TBM03_VERSION=gx.fn.getControlValue("TBM03_VERSION");this.A359TBM03_DEL_FLG=
gx.fn.getControlValue("TBM03_DEL_FLG")};this.s332_client=function(){gx.fn.setCtrlProperty("vD_LINE","Backcolor",gx.color.rgb(255,255,255))};this.s242_client=function(){this.AV18H_DOM_CD=this.AV7D_DOM_CD;this.AV19H_DOM_VAR_NM=this.AV9D_DOM_VAR_NM;this.AV24H_VAR_DESC=this.AV16D_VAR_DESC};this.s182_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");if(""!=
this.AV30W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV30W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s202_client=function(){gx.fn.setCtrlProperty("TXT_SORT01_ASC","Class","TextBlockSort");
gx.fn.setCtrlProperty("TXT_SORT01_DESC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT02_ASC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT02_DESC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT03_ASC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT03_DESC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT04_ASC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT04_DESC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT05_ASC","Class","TextBlockSort");
gx.fn.setCtrlProperty("TXT_SORT05_DESC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT06_ASC","Class","TextBlockSort");gx.fn.setCtrlProperty("TXT_SORT06_DESC","Class","TextBlockSort");this.AV48H_SORT_ITEM_KBN==1&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT01_ASC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==1&&this.AV47H_SORT_ASDC_KBN==1?gx.fn.setCtrlProperty("TXT_SORT01_DESC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==2&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT02_ASC",
"Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==2&&this.AV47H_SORT_ASDC_KBN==1?gx.fn.setCtrlProperty("TXT_SORT02_DESC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==3&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT03_ASC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==3&&this.AV47H_SORT_ASDC_KBN==1?gx.fn.setCtrlProperty("TXT_SORT03_DESC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==4&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT04_ASC","Class",
"TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==4&&this.AV47H_SORT_ASDC_KBN==1?gx.fn.setCtrlProperty("TXT_SORT04_DESC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==5&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT05_ASC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==5&&this.AV47H_SORT_ASDC_KBN==1?gx.fn.setCtrlProperty("TXT_SORT05_DESC","Class","TextBlockSortSel"):this.AV48H_SORT_ITEM_KBN==6&&this.AV47H_SORT_ASDC_KBN==0?gx.fn.setCtrlProperty("TXT_SORT06_ASC","Class","TextBlockSortSel"):
this.AV48H_SORT_ITEM_KBN==6&&this.AV47H_SORT_ASDC_KBN==1&&gx.fn.setCtrlProperty("TXT_SORT06_DESC","Class","TextBlockSortSel")};this.s232_client=function(){this.s332_client()};this.e111w2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e121w2_client=function(){this.executeServerEvent("'BTN_CSV'",true)};this.e131w2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e141w2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e151w2_client=function(){this.executeServerEvent("'BTN_EDIT'",
true)};this.e161w2_client=function(){this.executeServerEvent("'BTN_IMPORT_CDISC_ITEM'",true)};this.e171w2_client=function(){this.executeServerEvent("'BTN_DOMAIN'",true)};this.e471w2_client=function(a){this.executeServerEvent("'BTN_SEL'",true,a)};this.e181w2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e191w2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e201w2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e211w2_client=function(){this.executeServerEvent("'PAGE_NEXT'",
true)};this.e221w2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e231w2_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e241w2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e251w2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e261w2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e271w2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e281w2_client=function(){this.executeServerEvent("'PAGE07'",
true)};this.e291w2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e301w2_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e311w2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e321w2_client=function(){this.executeServerEvent("'SORT01_ASC'",true)};this.e331w2_client=function(){this.executeServerEvent("'SORT01_DESC'",true)};this.e341w2_client=function(){this.executeServerEvent("'SORT02_ASC'",true)};this.e351w2_client=function(){this.executeServerEvent("'SORT02_DESC'",
true)};this.e361w2_client=function(){this.executeServerEvent("'SORT03_ASC'",true)};this.e371w2_client=function(){this.executeServerEvent("'SORT03_DESC'",true)};this.e381w2_client=function(){this.executeServerEvent("'SORT04_ASC'",true)};this.e391w2_client=function(){this.executeServerEvent("'SORT04_DESC'",true)};this.e401w2_client=function(){this.executeServerEvent("'SORT05_ASC'",true)};this.e411w2_client=function(){this.executeServerEvent("'SORT05_DESC'",true)};this.e421w2_client=function(){this.executeServerEvent("'SORT06_ASC'",
true)};this.e431w2_client=function(){this.executeServerEvent("'SORT06_DESC'",true)};this.e481w2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e491w2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,19,22,25,28,31,34,38,42,46,49,52,55,61,64,67,70,73,76,79,82,85,88,91,94,97,100,103,106,109,112,115,118,121,124,127,130,133,136,139,142,145,148,151,153,156,158,161,167,170,174,176,177,178,180,181,182,184,185,186,188,189,
190,192,193,194,196,197,198,204,206,208,210,212,214,216,218,225,228,229,230,231,232,233,234,235,236,239,241,244,247,250];this.GXLastCtrlId=250;var c=this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",201,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"a212_wp01_cdisc_item_list",[],true,1,true,true,10,false,false,false,"",0,"px","\u884c\u8ffd\u52a0",true,false,false,null,null,false,"",false,[1,1,1,1]);c.startRow("","","","","","");c.startCell("","center","","","","","45px","",
"","");c.addTextBlock("BTN_SEL","e471w2_client");c.endCell();c.startCell("","right","","","","","50px","","","");c.addSingleLineEdit("D_grd_line",206,"vD_GRD_LINE","","","D_GRD_LINE","int",4,"chr",4,4,"right",null,[],"D_grd_line","D_GRD_LINE",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","center","","","","","160px","","","");c.addSingleLineEdit("D_grd_dom_cd",208,"vD_GRD_DOM_CD","","","D_GRD_DOM_CD","svchar",16,"chr",16,16,"left",null,[],"D_grd_dom_cd","D_GRD_DOM_CD",true,0,false,
false,"Attribute",1,"");c.endCell();c.startCell("","","","","","","150px","","","");c.addSingleLineEdit("D_grd_dom_var_nm",210,"vD_GRD_DOM_VAR_NM","","","D_GRD_DOM_VAR_NM","svchar",50,"chr",50,50,"left",null,[],"D_grd_dom_var_nm","D_GRD_DOM_VAR_NM",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","","","","","","300px","","","");c.addSingleLineEdit("D_grd_var_desc",212,"vD_GRD_VAR_DESC","","","D_GRD_VAR_DESC","svchar",80,"chr",100,80,"left",null,[],"D_grd_var_desc","D_GRD_VAR_DESC",
true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","right","","","","","100px","","","");c.addSingleLineEdit("D_grd_order",214,"vD_GRD_ORDER","","","D_GRD_ORDER","int",5,"chr",5,5,"right",null,[],"D_grd_order","D_GRD_ORDER",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","center","","","","","100px","","","");c.addSingleLineEdit("D_grd_version",216,"vD_GRD_VERSION","","","D_GRD_VERSION","svchar",20,"chr",20,20,"left",null,[],"D_grd_version","D_GRD_VERSION",true,0,false,
false,"Attribute",1,"");c.endCell();c.startCell("","center","","","","","100px","","","");c.addSingleLineEdit("D_grd_del",218,"vD_GRD_DEL","","","D_GRD_DEL","svchar",10,"chr",10,10,"left",null,[],"D_grd_del","D_GRD_DEL",true,0,false,false,"Attribute",1,"");c.endCell();c.endRow();this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TABLE8",grid:0};b[15]={fld:"TXT_BTN_REG",format:0,grid:0};b[16]={fld:"TXT_BTN_REG2",format:0,grid:0};b[19]={fld:"TEXTBLOCK43",format:0,grid:0};
b[22]={fld:"TEXTBLOCK47",format:0,grid:0};b[25]={fld:"BTN_DOMAIN",format:0,grid:0};b[28]={fld:"TABLE3",grid:0};b[31]={fld:"TABLE4",grid:0};b[34]={fld:"TABLE5",grid:0};b[38]={lvl:0,type:"svchar",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_DOM_CD",gxz:"ZV7D_DOM_CD",gxold:"OV7D_DOM_CD",gxvar:"AV7D_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV7D_DOM_CD=a},v2z:function(a){gx.O.ZV7D_DOM_CD=a},v2c:function(){gx.fn.setComboBoxValue("vD_DOM_CD",
gx.O.AV7D_DOM_CD)},c2v:function(){gx.O.AV7D_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_CD")},nac:gx.falseFn};b[42]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_DOM_VAR_NM",gxz:"ZV9D_DOM_VAR_NM",gxold:"OV9D_DOM_VAR_NM",gxvar:"AV9D_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_DOM_VAR_NM=a},v2z:function(a){gx.O.ZV9D_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("vD_DOM_VAR_NM",
gx.O.AV9D_DOM_VAR_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV9D_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_VAR_NM")},nac:gx.falseFn};this.declareDomainHdlr(42,function(){});b[46]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_VAR_DESC",gxz:"ZV16D_VAR_DESC",gxold:"OV16D_VAR_DESC",gxvar:"AV16D_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16D_VAR_DESC=
a},v2z:function(a){gx.O.ZV16D_VAR_DESC=a},v2c:function(){gx.fn.setControlValue("vD_VAR_DESC",gx.O.AV16D_VAR_DESC,0)},c2v:function(){gx.O.AV16D_VAR_DESC=this.val()},val:function(){return gx.fn.getControlValue("vD_VAR_DESC")},nac:gx.falseFn};b[49]={fld:"TABLE9",grid:0};b[52]={fld:"TEXTBLOCK45",format:0,grid:0};b[55]={fld:"TEXTBLOCK44",format:0,grid:0};b[61]={fld:"TBL_PAGE_AREA",grid:0};b[64]={fld:"TXT_REC_CNT",format:0,grid:0};b[67]={fld:"TBL_PAGE",grid:0};b[70]={fld:"TBL_FIRST",grid:0};b[73]={fld:"TXT_FIRST",
format:0,grid:0};b[76]={fld:"TBL_BACK",grid:0};b[79]={fld:"TXT_BACK",format:0,grid:0};b[82]={fld:"TBL_PAGE01",grid:0};b[85]={fld:"TXT_PAGE01",format:0,grid:0};b[88]={fld:"TBL_PAGE02",grid:0};b[91]={fld:"TXT_PAGE02",format:0,grid:0};b[94]={fld:"TBL_PAGE03",grid:0};b[97]={fld:"TXT_PAGE03",format:0,grid:0};b[100]={fld:"TBL_PAGE04",grid:0};b[103]={fld:"TXT_PAGE04",format:0,grid:0};b[106]={fld:"TBL_PAGE05",grid:0};b[109]={fld:"TXT_PAGE05",format:0,grid:0};b[112]={fld:"TBL_PAGE06",grid:0};b[115]={fld:"TXT_PAGE06",
format:0,grid:0};b[118]={fld:"TBL_PAGE07",grid:0};b[121]={fld:"TXT_PAGE07",format:0,grid:0};b[124]={fld:"TBL_PAGE08",grid:0};b[127]={fld:"TXT_PAGE08",format:0,grid:0};b[130]={fld:"TBL_PAGE09",grid:0};b[133]={fld:"TXT_PAGE09",format:0,grid:0};b[136]={fld:"TBL_PAGE10",grid:0};b[139]={fld:"TXT_PAGE10",format:0,grid:0};b[142]={fld:"TBL_NEXT",grid:0};b[145]={fld:"TXT_NEXT",format:0,grid:0};b[148]={fld:"TBL_LAST",grid:0};b[151]={fld:"TXT_LAST",format:0,grid:0};b[153]={fld:"TBL_EDIT",grid:0};b[156]={fld:"TEXTBLOCK29",
format:0,grid:0};b[158]={lvl:0,type:"char",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_LINE",gxz:"ZV14D_LINE",gxold:"OV14D_LINE",gxvar:"AV14D_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV14D_LINE=a},v2z:function(a){gx.O.ZV14D_LINE=a},v2c:function(){gx.fn.setControlValue("vD_LINE",gx.O.AV14D_LINE,0)},c2v:function(){gx.O.AV14D_LINE=this.val()},val:function(){return gx.fn.getControlValue("vD_LINE")},nac:gx.falseFn};b[161]={fld:"TEXTBLOCK28",
format:0,grid:0};b[167]={fld:"TBL_GRID_HEADER",grid:0};b[170]={fld:"TBL_IN_GRID_HEADER",grid:0};b[174]={fld:"TEXTBLOCK34",format:0,grid:0};b[176]={fld:"TEXTBLOCK30",format:0,grid:0};b[177]={fld:"TXT_SORT01_DESC",format:0,grid:0};b[178]={fld:"TXT_SORT01_ASC",format:0,grid:0};b[180]={fld:"TEXTBLOCK31",format:0,grid:0};b[181]={fld:"TXT_SORT02_DESC",format:0,grid:0};b[182]={fld:"TXT_SORT02_ASC",format:0,grid:0};b[184]={fld:"TEXTBLOCK32",format:0,grid:0};b[185]={fld:"TXT_SORT03_DESC",format:0,grid:0};
b[186]={fld:"TXT_SORT03_ASC",format:0,grid:0};b[188]={fld:"TEXTBLOCK35",format:0,grid:0};b[189]={fld:"TXT_SORT04_DESC",format:0,grid:0};b[190]={fld:"TXT_SORT04_ASC",format:0,grid:0};b[192]={fld:"TEXTBLOCK36",format:0,grid:0};b[193]={fld:"TXT_SORT05_DESC",format:0,grid:0};b[194]={fld:"TXT_SORT05_ASC",format:0,grid:0};b[196]={fld:"TEXTBLOCK33",format:0,grid:0};b[197]={fld:"TXT_SORT06_DESC",format:0,grid:0};b[198]={fld:"TXT_SORT06_ASC",format:0,grid:0};b[204]={fld:"BTN_SEL",format:0,grid:201};b[206]=
{lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_LINE",gxz:"ZV11D_GRD_LINE",gxold:"OV11D_GRD_LINE",gxvar:"AV11D_GRD_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.AV11D_GRD_LINE=gx.num.intval(a)},v2z:function(a){gx.O.ZV11D_GRD_LINE=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_LINE",a||gx.fn.currentGridRowImpl(201),gx.O.AV11D_GRD_LINE,0)},c2v:function(){gx.O.AV11D_GRD_LINE=
gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("vD_GRD_LINE",a||gx.fn.currentGridRowImpl(201),",")},nac:gx.falseFn};b[208]={lvl:2,type:"svchar",len:16,dec:0,sign:false,ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_DOM_CD",gxz:"ZV39D_GRD_DOM_CD",gxold:"OV39D_GRD_DOM_CD",gxvar:"AV39D_GRD_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV39D_GRD_DOM_CD=a},v2z:function(a){gx.O.ZV39D_GRD_DOM_CD=
a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_DOM_CD",a||gx.fn.currentGridRowImpl(201),gx.O.AV39D_GRD_DOM_CD,0)},c2v:function(){gx.O.AV39D_GRD_DOM_CD=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_DOM_CD",a||gx.fn.currentGridRowImpl(201))},nac:gx.falseFn};b[210]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_DOM_VAR_NM",gxz:"ZV40D_GRD_DOM_VAR_NM",gxold:"OV40D_GRD_DOM_VAR_NM",gxvar:"AV40D_GRD_DOM_VAR_NM",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV40D_GRD_DOM_VAR_NM=a},v2z:function(a){gx.O.ZV40D_GRD_DOM_VAR_NM=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_DOM_VAR_NM",a||gx.fn.currentGridRowImpl(201),gx.O.AV40D_GRD_DOM_VAR_NM,0)},c2v:function(){gx.O.AV40D_GRD_DOM_VAR_NM=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_DOM_VAR_NM",a||gx.fn.currentGridRowImpl(201))},nac:gx.falseFn};b[212]={lvl:2,type:"svchar",len:100,
dec:0,sign:false,ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_VAR_DESC",gxz:"ZV41D_GRD_VAR_DESC",gxold:"OV41D_GRD_VAR_DESC",gxvar:"AV41D_GRD_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV41D_GRD_VAR_DESC=a},v2z:function(a){gx.O.ZV41D_GRD_VAR_DESC=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_VAR_DESC",a||gx.fn.currentGridRowImpl(201),gx.O.AV41D_GRD_VAR_DESC,0)},c2v:function(){gx.O.AV41D_GRD_VAR_DESC=
this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_VAR_DESC",a||gx.fn.currentGridRowImpl(201))},nac:gx.falseFn};b[214]={lvl:2,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_ORDER",gxz:"ZV42D_GRD_ORDER",gxold:"OV42D_GRD_ORDER",gxvar:"AV42D_GRD_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.AV42D_GRD_ORDER=gx.num.intval(a)},v2z:function(a){gx.O.ZV42D_GRD_ORDER=
gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_ORDER",a||gx.fn.currentGridRowImpl(201),gx.O.AV42D_GRD_ORDER,0)},c2v:function(){gx.O.AV42D_GRD_ORDER=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("vD_GRD_ORDER",a||gx.fn.currentGridRowImpl(201),",")},nac:gx.falseFn};b[216]={lvl:2,type:"svchar",len:20,dec:0,sign:false,ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_VERSION",gxz:"ZV43D_GRD_VERSION",gxold:"OV43D_GRD_VERSION",
gxvar:"AV43D_GRD_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV43D_GRD_VERSION=a},v2z:function(a){gx.O.ZV43D_GRD_VERSION=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_VERSION",a||gx.fn.currentGridRowImpl(201),gx.O.AV43D_GRD_VERSION,0)},c2v:function(){gx.O.AV43D_GRD_VERSION=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_VERSION",a||gx.fn.currentGridRowImpl(201))},nac:gx.falseFn};b[218]={lvl:2,type:"svchar",
len:10,dec:0,sign:false,ro:0,isacc:0,grid:201,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_DEL",gxz:"ZV10D_GRD_DEL",gxold:"OV10D_GRD_DEL",gxvar:"AV10D_GRD_DEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV10D_GRD_DEL=a},v2z:function(a){gx.O.ZV10D_GRD_DEL=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_DEL",a||gx.fn.currentGridRowImpl(201),gx.O.AV10D_GRD_DEL,0)},c2v:function(){gx.O.AV10D_GRD_DEL=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_DEL",
a||gx.fn.currentGridRowImpl(201))},nac:gx.falseFn};b[225]={fld:"TBL_HIDDEN",grid:0};b[228]={fld:"TXT_JS_EVENT",format:1,grid:0};b[229]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV20H_INIT_FLG",gxold:"OV20H_INIT_FLG",gxvar:"AV20H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV20H_INIT_FLG=a},v2z:function(a){gx.O.ZV20H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV20H_INIT_FLG,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV20H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(229,function(){});b[230]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_SRCH_FLG",gxz:"ZV23H_SRCH_FLG",gxold:"OV23H_SRCH_FLG",gxvar:"AV23H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV23H_SRCH_FLG=a},v2z:function(a){gx.O.ZV23H_SRCH_FLG=
a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV23H_SRCH_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV23H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:gx.falseFn};this.declareDomainHdlr(230,function(){});b[231]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV21H_KNGN_FLG",gxold:"OV21H_KNGN_FLG",gxvar:"AV21H_KNGN_FLG",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV21H_KNGN_FLG=a},v2z:function(a){gx.O.ZV21H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV21H_KNGN_FLG,0)},c2v:function(){gx.O.AV21H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};b[232]={lvl:0,type:"svchar",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_DOM_CD",gxz:"ZV18H_DOM_CD",gxold:"OV18H_DOM_CD",gxvar:"AV18H_DOM_CD",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV18H_DOM_CD=a},v2z:function(a){gx.O.ZV18H_DOM_CD=a},v2c:function(){gx.fn.setControlValue("vH_DOM_CD",gx.O.AV18H_DOM_CD,0)},c2v:function(){gx.O.AV18H_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_CD")},nac:gx.falseFn};b[233]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_DOM_VAR_NM",gxz:"ZV19H_DOM_VAR_NM",gxold:"OV19H_DOM_VAR_NM",gxvar:"AV19H_DOM_VAR_NM",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV19H_DOM_VAR_NM=a},v2z:function(a){gx.O.ZV19H_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("vH_DOM_VAR_NM",gx.O.AV19H_DOM_VAR_NM,0)},c2v:function(){gx.O.AV19H_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_VAR_NM")},nac:gx.falseFn};b[234]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_VAR_DESC",gxz:"ZV24H_VAR_DESC",gxold:"OV24H_VAR_DESC",gxvar:"AV24H_VAR_DESC",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV24H_VAR_DESC=a},v2z:function(a){gx.O.ZV24H_VAR_DESC=a},v2c:function(){gx.fn.setControlValue("vH_VAR_DESC",gx.O.AV24H_VAR_DESC,0)},c2v:function(){gx.O.AV24H_VAR_DESC=this.val()},val:function(){return gx.fn.getControlValue("vH_VAR_DESC")},nac:gx.falseFn};b[235]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_SORT",gxz:"ZV22H_SORT",gxold:"OV22H_SORT",gxvar:"AV22H_SORT",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV22H_SORT=a},v2z:function(a){gx.O.ZV22H_SORT=a},v2c:function(){gx.fn.setControlValue("vH_SORT",gx.O.AV22H_SORT,0)},c2v:function(){gx.O.AV22H_SORT=this.val()},val:function(){return gx.fn.getControlValue("vH_SORT")},nac:gx.falseFn};b[236]={fld:"TABLE7",grid:0};b[239]={fld:"TEXTBLOCK1",format:0,grid:0};b[241]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV51GXV1",
gxold:"OV51GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV51GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:gx.falseFn};b[244]={fld:"TABLE6",grid:0};b[247]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],
fld:"vH_SORT_ASDC_KBN",gxz:"ZV47H_SORT_ASDC_KBN",gxold:"OV47H_SORT_ASDC_KBN",gxvar:"AV47H_SORT_ASDC_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV47H_SORT_ASDC_KBN=gx.num.intval(a)},v2z:function(a){gx.O.ZV47H_SORT_ASDC_KBN=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vH_SORT_ASDC_KBN",gx.O.AV47H_SORT_ASDC_KBN,0)},c2v:function(){gx.O.AV47H_SORT_ASDC_KBN=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vH_SORT_ASDC_KBN",",")},nac:gx.falseFn};
b[250]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_SORT_ITEM_KBN",gxz:"ZV48H_SORT_ITEM_KBN",gxold:"OV48H_SORT_ITEM_KBN",gxvar:"AV48H_SORT_ITEM_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV48H_SORT_ITEM_KBN=gx.num.intval(a)},v2z:function(a){gx.O.ZV48H_SORT_ITEM_KBN=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vH_SORT_ITEM_KBN",gx.O.AV48H_SORT_ITEM_KBN,0)},c2v:function(){gx.O.AV48H_SORT_ITEM_KBN=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vH_SORT_ITEM_KBN",",")},nac:gx.falseFn};this.OV14D_LINE=this.ZV14D_LINE=this.AV14D_LINE=this.OV16D_VAR_DESC=this.ZV16D_VAR_DESC=this.AV16D_VAR_DESC=this.OV9D_DOM_VAR_NM=this.ZV9D_DOM_VAR_NM=this.AV9D_DOM_VAR_NM=this.OV7D_DOM_CD=this.ZV7D_DOM_CD=this.AV7D_DOM_CD="";this.OV11D_GRD_LINE=this.ZV11D_GRD_LINE=0;this.OV41D_GRD_VAR_DESC=this.ZV41D_GRD_VAR_DESC=this.OV40D_GRD_DOM_VAR_NM=this.ZV40D_GRD_DOM_VAR_NM=this.OV39D_GRD_DOM_CD=
this.ZV39D_GRD_DOM_CD="";this.OV42D_GRD_ORDER=this.ZV42D_GRD_ORDER=0;this.OV22H_SORT=this.ZV22H_SORT=this.AV22H_SORT=this.OV24H_VAR_DESC=this.ZV24H_VAR_DESC=this.AV24H_VAR_DESC=this.OV19H_DOM_VAR_NM=this.ZV19H_DOM_VAR_NM=this.AV19H_DOM_VAR_NM=this.OV18H_DOM_CD=this.ZV18H_DOM_CD=this.AV18H_DOM_CD=this.OV21H_KNGN_FLG=this.ZV21H_KNGN_FLG=this.AV21H_KNGN_FLG=this.OV23H_SRCH_FLG=this.ZV23H_SRCH_FLG=this.AV23H_SRCH_FLG=this.OV20H_INIT_FLG=this.ZV20H_INIT_FLG=this.AV20H_INIT_FLG=this.OV10D_GRD_DEL=this.ZV10D_GRD_DEL=
this.OV43D_GRD_VERSION=this.ZV43D_GRD_VERSION="";this.OV48H_SORT_ITEM_KBN=this.ZV48H_SORT_ITEM_KBN=this.AV48H_SORT_ITEM_KBN=this.OV47H_SORT_ASDC_KBN=this.ZV47H_SORT_ASDC_KBN=this.AV47H_SORT_ASDC_KBN=this.OV51GXV1=this.ZV51GXV1=this.GXV1=0;this.AV22H_SORT=this.AV24H_VAR_DESC=this.AV19H_DOM_VAR_NM=this.AV18H_DOM_CD=this.AV21H_KNGN_FLG=this.AV23H_SRCH_FLG=this.AV20H_INIT_FLG=this.AV14D_LINE=this.AV16D_VAR_DESC=this.AV9D_DOM_VAR_NM=this.AV7D_DOM_CD="";this.AV27P_MOVE_KBN_2=this.AV26P_MOVE_KBN=this.AV48H_SORT_ITEM_KBN=
this.AV47H_SORT_ASDC_KBN=this.GXV1=0;this.AV25P_DOM_CD="";this.AV11D_GRD_LINE=0;this.AV41D_GRD_VAR_DESC=this.AV40D_GRD_DOM_VAR_NM=this.AV39D_GRD_DOM_CD="";this.AV42D_GRD_ORDER=0;this.A59TBM03_DOM_CD=this.A60TBM03_DOM_VAR_NM=this.A346TBM03_VAR_DESC=this.AV10D_GRD_DEL=this.AV43D_GRD_VERSION="";this.A61TBM03_ORDER=0;this.AV6C_TAM02_APP_ID=this.AV53Pgmname=this.A49TBM02_DOM_CD=this.A611TBM02_DOM_JNM=this.A359TBM03_DEL_FLG=this.A932TBM03_VERSION="";this.AV17H_A_PAGING_SDT={};this.AV30W_A821_JS="";this.AV44SD_A212_SD01_LIST_C=
[];this.AV34W_ERRFLG=false;this.Events={e111w2_client:["'BTN_REG'",true],e121w2_client:["'BTN_CSV'",true],e131w2_client:["'BTN_SRCH'",true],e141w2_client:["'BTN_CLER'",true],e151w2_client:["'BTN_EDIT'",true],e161w2_client:["'BTN_IMPORT_CDISC_ITEM'",true],e171w2_client:["'BTN_DOMAIN'",true],e471w2_client:["'BTN_SEL'",true],e181w2_client:["'PAGE_FIRST'",true],e191w2_client:["'PAGE_LAST'",true],e201w2_client:["'PAGE_BACK'",true],e211w2_client:["'PAGE_NEXT'",true],e221w2_client:["'PAGE01'",true],e231w2_client:["'PAGE02'",
true],e241w2_client:["'PAGE03'",true],e251w2_client:["'PAGE04'",true],e261w2_client:["'PAGE05'",true],e271w2_client:["'PAGE06'",true],e281w2_client:["'PAGE07'",true],e291w2_client:["'PAGE08'",true],e301w2_client:["'PAGE09'",true],e311w2_client:["'PAGE10'",true],e321w2_client:["'SORT01_ASC'",true],e331w2_client:["'SORT01_DESC'",true],e341w2_client:["'SORT02_ASC'",true],e351w2_client:["'SORT02_DESC'",true],e361w2_client:["'SORT03_ASC'",true],e371w2_client:["'SORT03_DESC'",true],e381w2_client:["'SORT04_ASC'",
true],e391w2_client:["'SORT04_DESC'",true],e401w2_client:["'SORT05_ASC'",true],e411w2_client:["'SORT05_DESC'",true],e421w2_client:["'SORT06_ASC'",true],e431w2_client:["'SORT06_DESC'",true],e481w2_client:["ENTER",true],e491w2_client:["CANCEL",true]};this.setVCMap("AV53Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_TAM02_APP_ID","vC_TAM02_APP_ID",0,"svchar");this.setVCMap("AV26P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV27P_MOVE_KBN_2","vP_MOVE_KBN_2",0,"int");this.setVCMap("AV25P_DOM_CD",
"vP_DOM_CD",0,"svchar");this.setVCMap("AV17H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A49TBM02_DOM_CD","TBM02_DOM_CD",0,"svchar");this.setVCMap("A611TBM02_DOM_JNM","TBM02_DOM_JNM",0,"svchar");this.setVCMap("AV30W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV44SD_A212_SD01_LIST_C","vSD_A212_SD01_LIST_C",0,"CollA212_SD01_LIST.A212_SD01_LISTItem");this.setVCMap("AV34W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A59TBM03_DOM_CD","TBM03_DOM_CD",0,"svchar");this.setVCMap("A60TBM03_DOM_VAR_NM",
"TBM03_DOM_VAR_NM",0,"svchar");this.setVCMap("A346TBM03_VAR_DESC","TBM03_VAR_DESC",0,"svchar");this.setVCMap("A61TBM03_ORDER","TBM03_ORDER",0,"int");this.setVCMap("A932TBM03_VERSION","TBM03_VERSION",0,"svchar");this.setVCMap("A359TBM03_DEL_FLG","TBM03_DEL_FLG",0,"svchar");this.setVCMap("AV53Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_TAM02_APP_ID","vC_TAM02_APP_ID",0,"svchar");this.setVCMap("AV26P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV27P_MOVE_KBN_2","vP_MOVE_KBN_2",0,"int");this.setVCMap("AV25P_DOM_CD",
"vP_DOM_CD",0,"svchar");this.setVCMap("AV17H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A49TBM02_DOM_CD","TBM02_DOM_CD",0,"svchar");this.setVCMap("A611TBM02_DOM_JNM","TBM02_DOM_JNM",0,"svchar");this.setVCMap("AV30W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV44SD_A212_SD01_LIST_C","vSD_A212_SD01_LIST_C",0,"CollA212_SD01_LIST.A212_SD01_LISTItem");this.setVCMap("AV34W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A59TBM03_DOM_CD","TBM03_DOM_CD",0,"svchar");this.setVCMap("A60TBM03_DOM_VAR_NM",
"TBM03_DOM_VAR_NM",0,"svchar");this.setVCMap("A346TBM03_VAR_DESC","TBM03_VAR_DESC",0,"svchar");this.setVCMap("A61TBM03_ORDER","TBM03_ORDER",0,"int");this.setVCMap("A932TBM03_VERSION","TBM03_VERSION",0,"svchar");this.setVCMap("A359TBM03_DEL_FLG","TBM03_DEL_FLG",0,"svchar");c.addRefreshingVar(this.GXValidFnc[229]);c.addRefreshingVar({rfrVar:"AV53Pgmname"});c.addRefreshingVar({rfrVar:"AV6C_TAM02_APP_ID"});c.addRefreshingVar({rfrVar:"AV26P_MOVE_KBN"});c.addRefreshingVar(this.GXValidFnc[38]);c.addRefreshingVar({rfrVar:"AV27P_MOVE_KBN_2"});
c.addRefreshingVar(this.GXValidFnc[42]);c.addRefreshingVar({rfrVar:"AV25P_DOM_CD"});c.addRefreshingVar({rfrVar:"AV17H_A_PAGING_SDT"});c.addRefreshingVar({rfrVar:"A49TBM02_DOM_CD"});c.addRefreshingVar({rfrVar:"A611TBM02_DOM_JNM"});c.addRefreshingVar(this.GXValidFnc[231]);c.addRefreshingVar({rfrVar:"AV30W_A821_JS"});c.addRefreshingVar({rfrVar:"AV44SD_A212_SD01_LIST_C"});c.addRefreshingVar(this.GXValidFnc[230]);c.addRefreshingVar({rfrVar:"AV34W_ERRFLG"});c.addRefreshingVar(this.GXValidFnc[247]);c.addRefreshingVar(this.GXValidFnc[250]);
c.addRefreshingVar(this.GXValidFnc[46]);c.addRefreshingVar(this.GXValidFnc[232]);c.addRefreshingVar(this.GXValidFnc[233]);c.addRefreshingVar(this.GXValidFnc[234]);c.addRefreshingVar({rfrVar:"A59TBM03_DOM_CD"});c.addRefreshingVar({rfrVar:"A60TBM03_DOM_VAR_NM"});c.addRefreshingVar({rfrVar:"A346TBM03_VAR_DESC"});c.addRefreshingVar({rfrVar:"A61TBM03_ORDER"});c.addRefreshingVar({rfrVar:"A932TBM03_VERSION"});c.addRefreshingVar({rfrVar:"A359TBM03_DEL_FLG"});this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],
this.GXValidFnc[241],"AV17H_A_PAGING_SDT");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0223",lvl:1})});gx.setParentObj(new a212_wp01_cdisc_item_list);