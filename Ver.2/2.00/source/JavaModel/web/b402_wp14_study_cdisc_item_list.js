gx.evt.autoSkip=!1;
gx.define("b402_wp14_study_cdisc_item_list",!1,function(){this.ServerClass="b402_wp14_study_cdisc_item_list";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111s2_client");this.addKeyListener("4","e121s2_client");this.addKeyListener("5","e131s2_client");this.addKeyListener("6","e141s2_client");this.SetStandaloneVars=function(){this.AV23P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV38Pgmname=
gx.fn.getControlValue("vPGMNAME");this.AV6C_TAM02_APP_ID=gx.fn.getControlValue("vC_TAM02_APP_ID");this.A63TBM21_STUDY_ID=gx.fn.getIntegerValue("TBM21_STUDY_ID",",");this.A367TBM21_STUDY_NM=gx.fn.getControlValue("TBM21_STUDY_NM");this.AV33P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",");this.AV22P_DOM_CD=gx.fn.getControlValue("vP_DOM_CD");this.AV15H_A_PAGING_SDT=gx.fn.getControlValue("vH_A_PAGING_SDT");this.A204TBM42_DOM_CD=gx.fn.getControlValue("TBM42_DOM_CD");this.A203TBM42_STUDY_ID=gx.fn.getIntegerValue("TBM42_STUDY_ID",
",");this.A906TBM42_DOM_JNM=gx.fn.getControlValue("TBM42_DOM_JNM");this.AV26W_A821_JS=gx.fn.getControlValue("vW_A821_JS");this.AV28W_ERRFLG=gx.fn.getControlValue("vW_ERRFLG");this.A919TBM43_DEL_FLG=gx.fn.getControlValue("TBM43_DEL_FLG")};this.s122_client=function(){this.AV7D_DOM_CD=this.AV22P_DOM_CD;this.AV14D_VAR_DESC=this.AV9D_DOM_VAR_NM="";this.AV16H_DOM_CD=this.AV22P_DOM_CD;this.AV21H_VAR_DESC=this.AV17H_DOM_VAR_NM="";this.AV15H_A_PAGING_SDT.PAGE_NO=1;this.AV20H_SRCH_FLG="0";this.AV25W_A819_JS=
"";this.s252_client()};this.s252_client=function(){};this.s212_client=function(){this.AV16H_DOM_CD=this.AV7D_DOM_CD;this.AV17H_DOM_VAR_NM=this.AV9D_DOM_VAR_NM;this.AV21H_VAR_DESC=this.AV14D_VAR_DESC};this.s172_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");if(""!=this.AV26W_A821_JS){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV26W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT",
"Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s202_client=function(){this.s252_client()};this.e111s2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e121s2_client=function(){this.executeServerEvent("'BTN_CSV'",true)};
this.e131s2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e141s2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e331s2_client=function(a){this.executeServerEvent("'BTN_SEL'",true,a)};this.e151s2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e161s2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e171s2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e181s2_client=function(){this.executeServerEvent("'PAGE_BACK'",
true)};this.e191s2_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e201s2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e211s2_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e221s2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e231s2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e241s2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e251s2_client=function(){this.executeServerEvent("'PAGE06'",
true)};this.e261s2_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e271s2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e281s2_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e291s2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e341s2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e351s2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,18,20,23,
26,29,33,37,41,45,48,51,54,60,63,66,69,72,75,78,81,84,87,90,93,96,99,102,105,108,111,114,117,120,123,126,129,132,135,138,141,144,147,150,156,159,163,165,167,169,171,173,179,181,183,185,187,189,191,198,201,202,203,204,205,206,207,208,211,213];this.GXLastCtrlId=213;var c=this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",176,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp14_study_cdisc_item_list",[],true,1,true,true,10,false,false,false,"",0,"px","\u884c\u8ffd\u52a0",
true,false,false,null,null,false,"",false,[1,1,1,1]);c.startRow("","","","","","");c.startCell("","center","","","","","45px","","","");c.addTextBlock("BTN_SEL","e331s2_client");c.endCell();c.startCell("","center","","","","","85px","","","");c.addSingleLineEdit(201,181,"TBM43_DOM_CD","","","TBM43_DOM_CD","svchar",2,"chr",2,2,"left",null,[],201,"TBM43_DOM_CD",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","","","","","","200px","","","");c.addSingleLineEdit(202,183,"TBM43_DOM_VAR_NM",
"","","TBM43_DOM_VAR_NM","svchar",50,"chr",50,50,"left",null,[],202,"TBM43_DOM_VAR_NM",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","","","","","","300px","","","");c.addSingleLineEdit(910,185,"TBM43_VAR_DESC","","","TBM43_VAR_DESC","svchar",80,"chr",100,80,"left",null,[],910,"TBM43_VAR_DESC",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","right","","","","","50px","","","");c.addSingleLineEdit(918,187,"TBM43_ORDER","","","TBM43_ORDER","int",5,"chr",5,5,"right",
null,[],918,"TBM43_ORDER",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","center","","","","","65px","","","");c.addSingleLineEdit(933,189,"TBM43_VERSION","","","TBM43_VERSION","svchar",20,"chr",20,20,"left",null,[],933,"TBM43_VERSION",true,0,false,false,"Attribute",1,"");c.endCell();c.startCell("","center","","","","","100px","","","");c.addSingleLineEdit("D_grd_del",191,"vD_GRD_DEL","","","D_GRD_DEL","svchar",10,"chr",10,10,"left",null,[],"D_grd_del","D_GRD_DEL",true,0,false,false,
"ReadonlyAttribute",1,"");c.endCell();c.endRow();this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[6]={fld:"TABLE2",grid:0};b[12]={fld:"TABLE8",grid:0};b[15]={fld:"TXT_BTN_REG",format:0,grid:0};b[16]={fld:"TXT_BTN_REG2",format:0,grid:0};b[18]={fld:"TXT_BTN_CSV",format:0,grid:0};b[20]={fld:"BTN_CAN",format:0,grid:0};b[23]={fld:"TABLE3",grid:0};b[26]={fld:"TABLE4",grid:0};b[29]={fld:"TABLE5",grid:0};b[33]={fld:"TXT_STUDY",format:0,grid:0};b[37]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"vD_DOM_CD",gxz:"ZV7D_DOM_CD",gxold:"OV7D_DOM_CD",gxvar:"AV7D_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.AV7D_DOM_CD=a},v2z:function(a){gx.O.ZV7D_DOM_CD=a},v2c:function(){gx.fn.setComboBoxValue("vD_DOM_CD",gx.O.AV7D_DOM_CD)},c2v:function(){gx.O.AV7D_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_CD")},nac:gx.falseFn};b[41]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"vD_DOM_VAR_NM",gxz:"ZV9D_DOM_VAR_NM",gxold:"OV9D_DOM_VAR_NM",gxvar:"AV9D_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_DOM_VAR_NM=a},v2z:function(a){gx.O.ZV9D_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("vD_DOM_VAR_NM",gx.O.AV9D_DOM_VAR_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV9D_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_VAR_NM")},nac:gx.falseFn};this.declareDomainHdlr(41,
function(){});b[45]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_VAR_DESC",gxz:"ZV14D_VAR_DESC",gxold:"OV14D_VAR_DESC",gxvar:"AV14D_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV14D_VAR_DESC=a},v2z:function(a){gx.O.ZV14D_VAR_DESC=a},v2c:function(){gx.fn.setControlValue("vD_VAR_DESC",gx.O.AV14D_VAR_DESC,0)},c2v:function(){gx.O.AV14D_VAR_DESC=this.val()},val:function(){return gx.fn.getControlValue("vD_VAR_DESC")},
nac:gx.falseFn};b[48]={fld:"TABLE9",grid:0};b[51]={fld:"TEXTBLOCK45",format:0,grid:0};b[54]={fld:"TEXTBLOCK44",format:0,grid:0};b[60]={fld:"TBL_PAGE_AREA",grid:0};b[63]={fld:"TXT_REC_CNT",format:0,grid:0};b[66]={fld:"TBL_PAGE",grid:0};b[69]={fld:"TBL_FIRST",grid:0};b[72]={fld:"TXT_FIRST",format:0,grid:0};b[75]={fld:"TBL_BACK",grid:0};b[78]={fld:"TXT_BACK",format:0,grid:0};b[81]={fld:"TBL_PAGE01",grid:0};b[84]={fld:"TXT_PAGE01",format:0,grid:0};b[87]={fld:"TBL_PAGE02",grid:0};b[90]={fld:"TXT_PAGE02",
format:0,grid:0};b[93]={fld:"TBL_PAGE03",grid:0};b[96]={fld:"TXT_PAGE03",format:0,grid:0};b[99]={fld:"TBL_PAGE04",grid:0};b[102]={fld:"TXT_PAGE04",format:0,grid:0};b[105]={fld:"TBL_PAGE05",grid:0};b[108]={fld:"TXT_PAGE05",format:0,grid:0};b[111]={fld:"TBL_PAGE06",grid:0};b[114]={fld:"TXT_PAGE06",format:0,grid:0};b[117]={fld:"TBL_PAGE07",grid:0};b[120]={fld:"TXT_PAGE07",format:0,grid:0};b[123]={fld:"TBL_PAGE08",grid:0};b[126]={fld:"TXT_PAGE08",format:0,grid:0};b[129]={fld:"TBL_PAGE09",grid:0};b[132]=
{fld:"TXT_PAGE09",format:0,grid:0};b[135]={fld:"TBL_PAGE10",grid:0};b[138]={fld:"TXT_PAGE10",format:0,grid:0};b[141]={fld:"TBL_NEXT",grid:0};b[144]={fld:"TXT_NEXT",format:0,grid:0};b[147]={fld:"TBL_LAST",grid:0};b[150]={fld:"TXT_LAST",format:0,grid:0};b[156]={fld:"TBL_GRID_HEADER",grid:0};b[159]={fld:"TBL_IN_GRID_HEADER",grid:0};b[163]={fld:"TEXTBLOCK34",format:0,grid:0};b[165]={fld:"TEXTBLOCK31",format:0,grid:0};b[167]={fld:"TEXTBLOCK32",format:0,grid:0};b[169]={fld:"TEXTBLOCK36",format:0,grid:0};
b[171]={fld:"TEXTBLOCK35",format:0,grid:0};b[173]={fld:"TEXTBLOCK33",format:0,grid:0};b[179]={fld:"BTN_SEL",format:0,grid:176};b[181]={lvl:2,type:"svchar",len:2,dec:0,sign:false,ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM43_DOM_CD",gxz:"Z201TBM43_DOM_CD",gxold:"O201TBM43_DOM_CD",gxvar:"A201TBM43_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A201TBM43_DOM_CD=a},v2z:function(a){gx.O.Z201TBM43_DOM_CD=
a},v2c:function(a){gx.fn.setGridControlValue("TBM43_DOM_CD",a||gx.fn.currentGridRowImpl(176),gx.O.A201TBM43_DOM_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A201TBM43_DOM_CD=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM43_DOM_CD",a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[183]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM43_DOM_VAR_NM",gxz:"Z202TBM43_DOM_VAR_NM",
gxold:"O202TBM43_DOM_VAR_NM",gxvar:"A202TBM43_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A202TBM43_DOM_VAR_NM=a},v2z:function(a){gx.O.Z202TBM43_DOM_VAR_NM=a},v2c:function(a){gx.fn.setGridControlValue("TBM43_DOM_VAR_NM",a||gx.fn.currentGridRowImpl(176),gx.O.A202TBM43_DOM_VAR_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A202TBM43_DOM_VAR_NM=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM43_DOM_VAR_NM",
a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[185]={lvl:2,type:"svchar",len:100,dec:0,sign:false,ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM43_VAR_DESC",gxz:"Z910TBM43_VAR_DESC",gxold:"O910TBM43_VAR_DESC",gxvar:"A910TBM43_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A910TBM43_VAR_DESC=a},v2z:function(a){gx.O.Z910TBM43_VAR_DESC=a},v2c:function(a){gx.fn.setGridControlValue("TBM43_VAR_DESC",
a||gx.fn.currentGridRowImpl(176),gx.O.A910TBM43_VAR_DESC,0)},c2v:function(){gx.O.A910TBM43_VAR_DESC=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM43_VAR_DESC",a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[187]={lvl:2,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM43_ORDER",gxz:"Z918TBM43_ORDER",gxold:"O918TBM43_ORDER",gxvar:"A918TBM43_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
inputType:"text",v2v:function(a){gx.O.A918TBM43_ORDER=gx.num.intval(a)},v2z:function(a){gx.O.Z918TBM43_ORDER=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("TBM43_ORDER",a||gx.fn.currentGridRowImpl(176),gx.O.A918TBM43_ORDER,0)},c2v:function(){gx.O.A918TBM43_ORDER=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("TBM43_ORDER",a||gx.fn.currentGridRowImpl(176),",")},nac:gx.falseFn};b[189]={lvl:2,type:"svchar",len:20,dec:0,sign:false,ro:1,isacc:0,grid:176,gxgrid:this.Grid1Container,
fnc:null,isvalid:null,rgrid:[],fld:"TBM43_VERSION",gxz:"Z933TBM43_VERSION",gxold:"O933TBM43_VERSION",gxvar:"A933TBM43_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A933TBM43_VERSION=a},v2z:function(a){gx.O.Z933TBM43_VERSION=a},v2c:function(a){gx.fn.setGridControlValue("TBM43_VERSION",a||gx.fn.currentGridRowImpl(176),gx.O.A933TBM43_VERSION,0)},c2v:function(){gx.O.A933TBM43_VERSION=this.val()},val:function(a){return gx.fn.getGridControlValue("TBM43_VERSION",
a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[191]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:0,isacc:0,grid:176,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_DEL",gxz:"ZV10D_GRD_DEL",gxold:"OV10D_GRD_DEL",gxvar:"AV10D_GRD_DEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.AV10D_GRD_DEL=a},v2z:function(a){gx.O.ZV10D_GRD_DEL=a},v2c:function(a){gx.fn.setGridControlValue("vD_GRD_DEL",a||gx.fn.currentGridRowImpl(176),
gx.O.AV10D_GRD_DEL,0)},c2v:function(){gx.O.AV10D_GRD_DEL=this.val()},val:function(a){return gx.fn.getGridControlValue("vD_GRD_DEL",a||gx.fn.currentGridRowImpl(176))},nac:gx.falseFn};b[198]={fld:"TBL_HIDDEN",grid:0};b[201]={fld:"TXT_JS_EVENT",format:1,grid:0};b[202]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV18H_INIT_FLG",gxold:"OV18H_INIT_FLG",gxvar:"AV18H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV18H_INIT_FLG=
a},v2z:function(a){gx.O.ZV18H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV18H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV18H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(202,function(){});b[203]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_SRCH_FLG",gxz:"ZV20H_SRCH_FLG",
gxold:"OV20H_SRCH_FLG",gxvar:"AV20H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV20H_SRCH_FLG=a},v2z:function(a){gx.O.ZV20H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV20H_SRCH_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV20H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:gx.falseFn};this.declareDomainHdlr(203,function(){});b[204]={lvl:0,type:"svchar",len:1,dec:0,
sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV19H_KNGN_FLG",gxold:"OV19H_KNGN_FLG",gxvar:"AV19H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV19H_KNGN_FLG=a},v2z:function(a){gx.O.ZV19H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV19H_KNGN_FLG,0)},c2v:function(){gx.O.AV19H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};b[205]={lvl:0,type:"svchar",len:2,
dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_DOM_CD",gxz:"ZV16H_DOM_CD",gxold:"OV16H_DOM_CD",gxvar:"AV16H_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_DOM_CD=a},v2z:function(a){gx.O.ZV16H_DOM_CD=a},v2c:function(){gx.fn.setControlValue("vH_DOM_CD",gx.O.AV16H_DOM_CD,0)},c2v:function(){gx.O.AV16H_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_CD")},nac:gx.falseFn};b[206]={lvl:0,type:"svchar",
len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_DOM_VAR_NM",gxz:"ZV17H_DOM_VAR_NM",gxold:"OV17H_DOM_VAR_NM",gxvar:"AV17H_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV17H_DOM_VAR_NM=a},v2z:function(a){gx.O.ZV17H_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("vH_DOM_VAR_NM",gx.O.AV17H_DOM_VAR_NM,0)},c2v:function(){gx.O.AV17H_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_VAR_NM")},
nac:gx.falseFn};b[207]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vH_VAR_DESC",gxz:"ZV21H_VAR_DESC",gxold:"OV21H_VAR_DESC",gxvar:"AV21H_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV21H_VAR_DESC=a},v2z:function(a){gx.O.ZV21H_VAR_DESC=a},v2c:function(){gx.fn.setControlValue("vH_VAR_DESC",gx.O.AV21H_VAR_DESC,0)},c2v:function(){gx.O.AV21H_VAR_DESC=this.val()},val:function(){return gx.fn.getControlValue("vH_VAR_DESC")},
nac:gx.falseFn};b[208]={fld:"TABLE7",grid:0};b[211]={fld:"TEXTBLOCK1",format:0,grid:0};b[213]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV36GXV1",gxold:"OV36GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV36GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=gx.num.intval(this.val())},
val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:gx.falseFn};this.O910TBM43_VAR_DESC=this.Z910TBM43_VAR_DESC=this.O202TBM43_DOM_VAR_NM=this.Z202TBM43_DOM_VAR_NM=this.O201TBM43_DOM_CD=this.Z201TBM43_DOM_CD=this.OV14D_VAR_DESC=this.ZV14D_VAR_DESC=this.AV14D_VAR_DESC=this.OV9D_DOM_VAR_NM=this.ZV9D_DOM_VAR_NM=this.AV9D_DOM_VAR_NM=this.OV7D_DOM_CD=this.ZV7D_DOM_CD=this.AV7D_DOM_CD="";this.O918TBM43_ORDER=this.Z918TBM43_ORDER=0;this.OV21H_VAR_DESC=this.ZV21H_VAR_DESC=this.AV21H_VAR_DESC=
this.OV17H_DOM_VAR_NM=this.ZV17H_DOM_VAR_NM=this.AV17H_DOM_VAR_NM=this.OV16H_DOM_CD=this.ZV16H_DOM_CD=this.AV16H_DOM_CD=this.OV19H_KNGN_FLG=this.ZV19H_KNGN_FLG=this.AV19H_KNGN_FLG=this.OV20H_SRCH_FLG=this.ZV20H_SRCH_FLG=this.AV20H_SRCH_FLG=this.OV18H_INIT_FLG=this.ZV18H_INIT_FLG=this.AV18H_INIT_FLG=this.OV10D_GRD_DEL=this.ZV10D_GRD_DEL=this.O933TBM43_VERSION=this.Z933TBM43_VERSION="";this.OV36GXV1=this.ZV36GXV1=this.GXV1=0;this.AV21H_VAR_DESC=this.AV17H_DOM_VAR_NM=this.AV16H_DOM_CD=this.AV19H_KNGN_FLG=
this.AV20H_SRCH_FLG=this.AV18H_INIT_FLG=this.AV14D_VAR_DESC=this.AV9D_DOM_VAR_NM=this.AV7D_DOM_CD="";this.AV23P_STUDY_ID=this.AV33P_MOVE_KBN=this.GXV1=0;this.A919TBM43_DEL_FLG=this.AV22P_DOM_CD="";this.A200TBM43_STUDY_ID=0;this.A910TBM43_VAR_DESC=this.A202TBM43_DOM_VAR_NM=this.A201TBM43_DOM_CD="";this.A918TBM43_ORDER=0;this.AV10D_GRD_DEL=this.A933TBM43_VERSION="";this.A203TBM42_STUDY_ID=0;this.A204TBM42_DOM_CD=this.A906TBM42_DOM_JNM="";this.A63TBM21_STUDY_ID=0;this.AV6C_TAM02_APP_ID=this.AV38Pgmname=
this.A367TBM21_STUDY_NM="";this.AV15H_A_PAGING_SDT={};this.AV26W_A821_JS="";this.AV28W_ERRFLG=false;this.AV25W_A819_JS="";this.Events={e111s2_client:["'BTN_REG'",true],e121s2_client:["'BTN_CSV'",true],e131s2_client:["'BTN_SRCH'",true],e141s2_client:["'BTN_CLER'",true],e331s2_client:["'BTN_SEL'",true],e151s2_client:["'BTN_CAN'",true],e161s2_client:["'PAGE_FIRST'",true],e171s2_client:["'PAGE_LAST'",true],e181s2_client:["'PAGE_BACK'",true],e191s2_client:["'PAGE_NEXT'",true],e201s2_client:["'PAGE01'",
true],e211s2_client:["'PAGE02'",true],e221s2_client:["'PAGE03'",true],e231s2_client:["'PAGE04'",true],e241s2_client:["'PAGE05'",true],e251s2_client:["'PAGE06'",true],e261s2_client:["'PAGE07'",true],e271s2_client:["'PAGE08'",true],e281s2_client:["'PAGE09'",true],e291s2_client:["'PAGE10'",true],e341s2_client:["ENTER",true],e351s2_client:["CANCEL",true]};this.setVCMap("AV23P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV38Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_TAM02_APP_ID","vC_TAM02_APP_ID",
0,"svchar");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV33P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV22P_DOM_CD","vP_DOM_CD",0,"svchar");this.setVCMap("AV15H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A204TBM42_DOM_CD","TBM42_DOM_CD",0,"svchar");this.setVCMap("A203TBM42_STUDY_ID","TBM42_STUDY_ID",0,"int");this.setVCMap("A906TBM42_DOM_JNM","TBM42_DOM_JNM",0,"svchar");this.setVCMap("AV26W_A821_JS",
"vW_A821_JS",0,"svchar");this.setVCMap("AV28W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A919TBM43_DEL_FLG","TBM43_DEL_FLG",0,"svchar");this.setVCMap("AV23P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV38Pgmname","vPGMNAME",0,"char");this.setVCMap("AV6C_TAM02_APP_ID","vC_TAM02_APP_ID",0,"svchar");this.setVCMap("A63TBM21_STUDY_ID","TBM21_STUDY_ID",0,"int");this.setVCMap("A367TBM21_STUDY_NM","TBM21_STUDY_NM",0,"svchar");this.setVCMap("AV33P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV22P_DOM_CD",
"vP_DOM_CD",0,"svchar");this.setVCMap("AV15H_A_PAGING_SDT","vH_A_PAGING_SDT",0,"A_PAGING_SDT");this.setVCMap("A204TBM42_DOM_CD","TBM42_DOM_CD",0,"svchar");this.setVCMap("A203TBM42_STUDY_ID","TBM42_STUDY_ID",0,"int");this.setVCMap("A906TBM42_DOM_JNM","TBM42_DOM_JNM",0,"svchar");this.setVCMap("AV26W_A821_JS","vW_A821_JS",0,"svchar");this.setVCMap("AV28W_ERRFLG","vW_ERRFLG",0,"boolean");this.setVCMap("A919TBM43_DEL_FLG","TBM43_DEL_FLG",0,"svchar");c.addRefreshingVar(this.GXValidFnc[203]);c.addRefreshingVar(this.GXValidFnc[205]);
c.addRefreshingVar(this.GXValidFnc[206]);c.addRefreshingVar(this.GXValidFnc[207]);c.addRefreshingVar({rfrVar:"AV23P_STUDY_ID"});c.addRefreshingVar(this.GXValidFnc[202]);c.addRefreshingVar({rfrVar:"AV38Pgmname"});c.addRefreshingVar(this.GXValidFnc[41]);c.addRefreshingVar({rfrVar:"AV6C_TAM02_APP_ID"});c.addRefreshingVar({rfrVar:"A63TBM21_STUDY_ID"});c.addRefreshingVar({rfrVar:"A367TBM21_STUDY_NM"});c.addRefreshingVar({rfrVar:"AV33P_MOVE_KBN"});c.addRefreshingVar({rfrVar:"AV22P_DOM_CD"});c.addRefreshingVar({rfrVar:"AV15H_A_PAGING_SDT"});
c.addRefreshingVar({rfrVar:"A204TBM42_DOM_CD"});c.addRefreshingVar({rfrVar:"A203TBM42_STUDY_ID"});c.addRefreshingVar({rfrVar:"A906TBM42_DOM_JNM"});c.addRefreshingVar(this.GXValidFnc[204]);c.addRefreshingVar({rfrVar:"AV26W_A821_JS"});c.addRefreshingVar({rfrVar:"AV28W_ERRFLG"});c.addRefreshingVar(this.GXValidFnc[37]);c.addRefreshingVar(this.GXValidFnc[45]);c.addRefreshingVar({rfrVar:"A919TBM43_DEL_FLG"});this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],this.GXValidFnc[213],"AV15H_A_PAGING_SDT");this.InitStandaloneVars();
this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0196",lvl:1})});gx.setParentObj(new b402_wp14_study_cdisc_item_list);
