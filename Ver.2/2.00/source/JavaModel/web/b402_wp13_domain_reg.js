gx.evt.autoSkip=!1;
gx.define("b402_wp13_domain_reg",!1,function(){this.ServerClass="b402_wp13_domain_reg";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("4","e111r2_client");this.addKeyListener("11","e121r2_client");this.SetStandaloneVars=function(){this.AV15P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",");this.AV14P_DOM_CD=gx.fn.getControlValue("vP_DOM_CD")};this.s122_client=function(){this.AV22W_A819_JS=this.AV23W_A821_JS=
""};this.s152_client=function(){};this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+
"ST_CLICK_SPACE();");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");""!=this.AV23W_A821_JS&&gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV23W_A821_JS);""!=this.AV22W_A819_JS&&
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV22W_A819_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s192_client=function(){gx.fn.setCtrlProperty("CTLTBM42_DOM_ENM",
"Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM42_DOM_JNM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM42_DOM_GRP_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM42_NOTE","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM42_ORDER","Backcolor",gx.color.rgb(255,255,255))};this.s202_client=function(){for(this.AV44GXV13=1;this.AV44GXV13<=this.AV17W_A_CHK_RESULT_SDT.length;){this.AV18W_A_CHK_RESULT_SDT_ITEM=this.AV17W_A_CHK_RESULT_SDT[this.AV44GXV13-
1];this.s212_client();this.AV44GXV13=this.AV44GXV13+1}};this.s212_client=function(){if(this.AV18W_A_CHK_RESULT_SDT_ITEM.ID=="TBM42_DOM_JNM"){gx.fn.setCtrlProperty("CTLTBM42_DOM_JNM","Backcolor",gx.color.rgb(255,192,203));this.AV18W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM42_DOM_JNM")}else if(this.AV18W_A_CHK_RESULT_SDT_ITEM.ID=="TBM42_DOM_ENM"){gx.fn.setCtrlProperty("CTLTBM42_DOM_ENM","Backcolor",gx.color.rgb(255,192,203));this.AV18W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM42_DOM_ENM")}else if(this.AV18W_A_CHK_RESULT_SDT_ITEM.ID==
"TBM42_DOM_GRP_NM"){gx.fn.setCtrlProperty("CTLTBM42_DOM_GRP_NM","Backcolor",gx.color.rgb(255,192,203));this.AV18W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM42_DOM_GRP_NM")}else if(this.AV18W_A_CHK_RESULT_SDT_ITEM.ID=="TBM42_NOTE"){gx.fn.setCtrlProperty("CTLTBM42_NOTE","Backcolor",gx.color.rgb(255,192,203));this.AV18W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM42_NOTE")}else if(this.AV18W_A_CHK_RESULT_SDT_ITEM.ID=="TBM42_ORDER"){gx.fn.setCtrlProperty("CTLTBM42_ORDER",
"Backcolor",gx.color.rgb(255,192,203));this.AV18W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM42_ORDER")}};this.e111r2_client=function(){this.executeServerEvent("'BTN_UPD'",true)};this.e151r2_client=function(){this.executeServerEvent("'BTN_UPD_EXEC'",true)};this.e121r2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e171r2_client=function(){this.executeServerEvent("ENTER",true)};this.e181r2_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=
[];this.GXCtrlIds=[2,6,12,15,16,19,22,25,28,30,36,41,43,46,48,51,53,57,61,64,66,69,75,78,82,85,89,92,93,96,97,98];this.GXLastCtrlId=98;b[2]={fld:"TABLE2",grid:0};b[6]={fld:"TABLE3",grid:0};b[12]={fld:"TBL_UPD_BTNSET",grid:0};b[15]={fld:"TXT_BTN_UPD",format:0,grid:0};b[16]={fld:"TXT_BTN_UPD2",format:0,grid:0};b[19]={fld:"TEXTBLOCK46",format:0,grid:0};b[22]={fld:"TABLE5",grid:0};b[25]={fld:"TABLE1",grid:0};b[28]={fld:"TEXTBLOCK16",format:0,grid:0};b[30]={fld:"TXT_STUDY",format:0,grid:0};b[36]={fld:"TABLE4",
grid:0};b[41]={fld:"IMAGE1",grid:0};b[43]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_DOM_CD",gxz:"ZV29GXV1",gxold:"OV29GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=a},v2z:function(a){gx.O.ZV29GXV1=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_DOM_CD",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_DOM_CD")},nac:gx.falseFn};
b[46]={fld:"IMAGE3",grid:0};b[48]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_DOM_JNM",gxz:"ZV30GXV2",gxold:"OV30GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=a},v2z:function(a){gx.O.ZV30GXV2=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_DOM_JNM",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_DOM_JNM")},nac:gx.falseFn};b[51]=
{fld:"IMAGE5",grid:0};b[53]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_DOM_ENM",gxz:"ZV31GXV3",gxold:"OV31GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV31GXV3=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_DOM_ENM",gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_DOM_ENM")},nac:gx.falseFn};b[57]={lvl:0,
type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_DOM_GRP_NM",gxz:"ZV32GXV4",gxold:"OV32GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV4=a},v2z:function(a){gx.O.ZV32GXV4=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_DOM_GRP_NM",gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_DOM_GRP_NM")},nac:gx.falseFn};b[61]={lvl:0,type:"svchar",len:1E3,dec:0,
sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_NOTE",gxz:"ZV33GXV5",gxold:"OV33GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=a},v2z:function(a){gx.O.ZV33GXV5=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_NOTE",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_NOTE")},nac:gx.falseFn};b[64]={fld:"IMAGE4",grid:0};b[66]={lvl:0,type:"int",len:5,dec:0,sign:false,
pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_ORDER",gxz:"ZV34GXV6",gxold:"OV34GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=gx.num.intval(a)},v2z:function(a){gx.O.ZV34GXV6=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM42_ORDER",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM42_ORDER",",")},nac:gx.falseFn};b[69]={lvl:0,type:"svchar",len:1,
dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_DEL_FLG",gxz:"ZV35GXV7",gxold:"OV35GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV7=a},v2z:function(a){gx.O.ZV35GXV7=a},v2c:function(){gx.fn.setRadioValue("CTLTBM42_DEL_FLG",gx.O.GXV7)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_DEL_FLG")},nac:gx.falseFn};b[75]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_CRT_DATETIME",gxz:"ZV36GXV8",gxold:"OV36GXV8",gxvar:"GXV8",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV36GXV8=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM42_CRT_DATETIME",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("CTLTBM42_CRT_DATETIME")},
nac:gx.falseFn};b[78]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_UPD_DATETIME",gxz:"ZV37GXV9",gxold:"OV37GXV9",gxvar:"GXV9",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV37GXV9=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM42_UPD_DATETIME",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=
gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("CTLTBM42_UPD_DATETIME")},nac:gx.falseFn};b[82]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRT_USER_NM",gxz:"ZV10D_CRT_USER_NM",gxold:"OV10D_CRT_USER_NM",gxvar:"AV10D_CRT_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_CRT_USER_NM=a},v2z:function(a){gx.O.ZV10D_CRT_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_CRT_USER_NM",
gx.O.AV10D_CRT_USER_NM,0)},c2v:function(){gx.O.AV10D_CRT_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_CRT_USER_NM")},nac:gx.falseFn};b[85]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_UPD_USER_NM",gxz:"ZV11D_UPD_USER_NM",gxold:"OV11D_UPD_USER_NM",gxvar:"AV11D_UPD_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11D_UPD_USER_NM=a},v2z:function(a){gx.O.ZV11D_UPD_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_UPD_USER_NM",
gx.O.AV11D_UPD_USER_NM,0)},c2v:function(){gx.O.AV11D_UPD_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_UPD_USER_NM")},nac:gx.falseFn};b[89]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_CRT_PROG_NM",gxz:"ZV38GXV10",gxold:"OV38GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=a},v2z:function(a){gx.O.ZV38GXV10=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_CRT_PROG_NM",
gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_CRT_PROG_NM")},nac:gx.falseFn};b[92]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM42_UPD_PROG_NM",gxz:"ZV39GXV11",gxold:"OV39GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=a},v2z:function(a){gx.O.ZV39GXV11=a},v2c:function(){gx.fn.setControlValue("CTLTBM42_UPD_PROG_NM",gx.O.GXV11,0)},
c2v:function(){gx.O.GXV11=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM42_UPD_PROG_NM")},nac:gx.falseFn};b[93]={fld:"TBL_HIDDEN",grid:0};b[96]={fld:"TXT_JS_EVENT",format:1,grid:0};b[97]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV12H_INIT_FLG",gxold:"OV12H_INIT_FLG",gxvar:"AV12H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_INIT_FLG=a},v2z:function(a){gx.O.ZV12H_INIT_FLG=
a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV12H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV12H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(97,function(){});b[98]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV13H_KNGN_FLG",gxold:"OV13H_KNGN_FLG",gxvar:"AV13H_KNGN_FLG",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13H_KNGN_FLG=a},v2z:function(a){gx.O.ZV13H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV13H_KNGN_FLG,0)},c2v:function(){gx.O.AV13H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};this.OV33GXV5=this.ZV33GXV5=this.GXV5=this.OV32GXV4=this.ZV32GXV4=this.GXV4=this.OV31GXV3=this.ZV31GXV3=this.GXV3=this.OV30GXV2=this.ZV30GXV2=this.GXV2=this.OV29GXV1=this.ZV29GXV1=this.GXV1="";
this.OV34GXV6=this.ZV34GXV6=this.GXV6=0;this.OV35GXV7=this.ZV35GXV7=this.GXV7="";this.GXV8=gx.date.nullDate();this.ZV36GXV8=gx.date.nullDate();this.OV36GXV8=gx.date.nullDate();this.GXV9=gx.date.nullDate();this.ZV37GXV9=gx.date.nullDate();this.OV37GXV9=gx.date.nullDate();this.GXV5=this.GXV4=this.GXV3=this.GXV2=this.GXV1=this.OV13H_KNGN_FLG=this.ZV13H_KNGN_FLG=this.AV13H_KNGN_FLG=this.OV12H_INIT_FLG=this.ZV12H_INIT_FLG=this.AV12H_INIT_FLG=this.OV39GXV11=this.ZV39GXV11=this.GXV11=this.OV38GXV10=this.ZV38GXV10=
this.GXV10=this.OV11D_UPD_USER_NM=this.ZV11D_UPD_USER_NM=this.AV11D_UPD_USER_NM=this.OV10D_CRT_USER_NM=this.ZV10D_CRT_USER_NM=this.AV10D_CRT_USER_NM="";this.GXV6=0;this.GXV7="";this.GXV8=gx.date.nullDate();this.GXV9=gx.date.nullDate();this.AV13H_KNGN_FLG=this.AV12H_INIT_FLG=this.GXV11=this.GXV10=this.AV11D_UPD_USER_NM=this.AV10D_CRT_USER_NM="";this.AV15P_STUDY_ID=0;this.A205TAM07_USER_NM=this.A55TAM07_USER_ID=this.AV14P_DOM_CD="";this.A63TBM21_STUDY_ID=0;this.A204TBM42_DOM_CD=this.A367TBM21_STUDY_NM=
"";this.A900TBM42_UPD_CNT=this.A203TBM42_STUDY_ID=0;this.AV23W_A821_JS=this.AV22W_A819_JS="";this.AV18W_A_CHK_RESULT_SDT_ITEM={};this.AV17W_A_CHK_RESULT_SDT=[];this.AV44GXV13=0;this.Events={e111r2_client:["'BTN_UPD'",true],e151r2_client:["'BTN_UPD_EXEC'",true],e121r2_client:["'BTN_CAN'",true],e171r2_client:["ENTER",true],e181r2_client:["CANCEL",true]};this.setVCMap("AV15P_STUDY_ID","vP_STUDY_ID",0,"int");this.setVCMap("AV14P_DOM_CD","vP_DOM_CD",0,"svchar");this.addBCProperty("Bc_study_domain",["TBM42_DOM_CD"],
this.GXValidFnc[43],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_DOM_JNM"],this.GXValidFnc[48],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_DOM_ENM"],this.GXValidFnc[53],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_DOM_GRP_NM"],this.GXValidFnc[57],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_NOTE"],this.GXValidFnc[61],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_ORDER"],this.GXValidFnc[66],
"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_DEL_FLG"],this.GXValidFnc[69],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_CRT_DATETIME"],this.GXValidFnc[75],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_UPD_DATETIME"],this.GXValidFnc[78],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_CRT_PROG_NM"],this.GXValidFnc[89],"AV5BC_STUDY_DOMAIN");this.addBCProperty("Bc_study_domain",["TBM42_UPD_PROG_NM"],this.GXValidFnc[92],
"AV5BC_STUDY_DOMAIN");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0101",lvl:1})});gx.setParentObj(new b402_wp13_domain_reg);
