gx.evt.autoSkip=!1;
gx.define("a213_wp01_cdisc_item_mst",!1,function(){this.ServerClass="a213_wp01_cdisc_item_mst";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.addKeyListener("3","e111y2_client");this.addKeyListener("4","e121y2_client");this.addKeyListener("6","e131y2_client");this.addKeyListener("11","e141y2_client");this.SetStandaloneVars=function(){this.AV17P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",");this.AV15P_DOM_CD=gx.fn.getControlValue("vP_DOM_CD");
this.AV16P_DOM_VAR_NM=gx.fn.getControlValue("vP_DOM_VAR_NM")};this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",
gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"\twindow.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT",
"Caption")+"ST_CLICK_SPACE();");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");""!=this.AV25W_A821_JS&&gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV25W_A821_JS);
""!=this.AV24W_A819_JS&&gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV24W_A819_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s192_client=function(){gx.fn.setCtrlProperty("CTLTBM03_DOM_CD",
"Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_DOM_VAR_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_VAR_DESC","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_INPUT_TYPE_DIV","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_SAS_FIELD_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_ODM_DATA_TYPE","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_NOTE","Backcolor",
gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_ORDER","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM03_VERSION","Backcolor",gx.color.rgb(255,255,255))};this.s202_client=function(){for(this.AV53GXV19=1;this.AV53GXV19<=this.AV19W_A_CHK_RESULT_SDT.length;){this.AV20W_A_CHK_RESULT_SDT_ITEM=this.AV19W_A_CHK_RESULT_SDT[this.AV53GXV19-1];this.s212_client();this.AV53GXV19=this.AV53GXV19+1}};this.s212_client=function(){if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_DOM_CD"){gx.fn.setCtrlProperty("CTLTBM03_DOM_CD",
"Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_DOM_CD")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_DOM_VAR_NM"){gx.fn.setCtrlProperty("CTLTBM03_DOM_VAR_NM","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_DOM_VAR_NM")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_VAR_DESC"){gx.fn.setCtrlProperty("CTLTBM03_VAR_DESC","Backcolor",gx.color.rgb(255,192,203));
this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_VAR_DESC")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_INPUT_TYPE_DIV"){gx.fn.setCtrlProperty("CTLTBM03_INPUT_TYPE_DIV","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_INPUT_TYPE_DIV")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_SAS_FIELD_NM"){gx.fn.setCtrlProperty("CTLTBM03_SAS_FIELD_NM","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==
true&&gx.fn.usrSetFocus("CTLTBM03_SAS_FIELD_NM")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_ODM_DATA_TYPE"){gx.fn.setCtrlProperty("CTLTBM03_ODM_DATA_TYPE","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_ODM_DATA_TYPE")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_NOTE"){gx.fn.setCtrlProperty("CTLTBM03_NOTE","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_NOTE")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID==
"TBM03_ORDER"){gx.fn.setCtrlProperty("CTLTBM03_ORDER","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_ORDER")}else if(this.AV20W_A_CHK_RESULT_SDT_ITEM.ID=="TBM03_VERSION"){gx.fn.setCtrlProperty("CTLTBM03_VERSION","Backcolor",gx.color.rgb(255,192,203));this.AV20W_A_CHK_RESULT_SDT_ITEM.FOCUS==true&&gx.fn.usrSetFocus("CTLTBM03_VERSION")}};this.e111y2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e171y2_client=function(){this.executeServerEvent("'BTN_REG_EXEC'",
true)};this.e121y2_client=function(){this.executeServerEvent("'BTN_UPD'",true)};this.e181y2_client=function(){this.executeServerEvent("'BTN_UPD_EXEC'",true)};this.e131y2_client=function(){this.executeServerEvent("'BTN_DLT'",true)};this.e191y2_client=function(){this.executeServerEvent("'BTN_DLT_EXEC'",true)};this.e141y2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e211y2_client=function(){this.executeServerEvent("ENTER",true)};this.e221y2_client=function(){this.executeServerEvent("CANCEL",
true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,19,20,23,24,27,28,31,34,40,45,47,50,52,56,60,63,67,70,72,75,79,83,87,90,92,95,99,105,108,112,115,119,122,123,126,127,128,129];this.GXLastCtrlId=129;b[2]={fld:"TABLE2",grid:0};b[6]={fld:"TABLE3",grid:0};b[12]={fld:"TBL_INS_BTNSET",grid:0};b[15]={fld:"TXT_BTN_REG",format:0,grid:0};b[16]={fld:"TXT_BTN_REG2",format:0,grid:0};b[19]={fld:"TEXTBLOCK44",format:0,grid:0};b[20]={fld:"TBL_UPD_BTNSET",grid:0};b[23]={fld:"TXT_BTN_UPD",format:0,grid:0};
b[24]={fld:"TXT_BTN_UPD2",format:0,grid:0};b[27]={fld:"TXT_BTN_DLT",format:0,grid:0};b[28]={fld:"TXT_BTN_DLT2",format:0,grid:0};b[31]={fld:"TEXTBLOCK46",format:0,grid:0};b[34]={fld:"TABLE5",grid:0};b[40]={fld:"TABLE4",grid:0};b[45]={fld:"IMAGE1",grid:0};b[47]={lvl:0,type:"svchar",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_DOM_CD",gxz:"ZV31GXV1",gxold:"OV31GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"combo",v2v:function(a){gx.O.GXV1=a},
v2z:function(a){gx.O.ZV31GXV1=a},v2c:function(){gx.fn.setComboBoxValue("CTLTBM03_DOM_CD",gx.O.GXV1)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_DOM_CD")},nac:gx.falseFn};b[50]={fld:"IMAGE3",grid:0};b[52]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_DOM_VAR_NM",gxz:"ZV32GXV2",gxold:"OV32GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=a},v2z:function(a){gx.O.ZV32GXV2=
a},v2c:function(){gx.fn.setControlValue("CTLTBM03_DOM_VAR_NM",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_DOM_VAR_NM")},nac:gx.falseFn};b[56]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_VAR_DESC",gxz:"ZV33GXV3",gxold:"OV33GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV33GXV3=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_VAR_DESC",
gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_VAR_DESC")},nac:gx.falseFn};b[60]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_SDTM_FLG",gxz:"ZV34GXV4",gxold:"OV34GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV4=a},v2z:function(a){gx.O.ZV34GXV4=a},v2c:function(){gx.fn.setRadioValue("CTLTBM03_SDTM_FLG",gx.O.GXV4)},c2v:function(){gx.O.GXV4=
this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_SDTM_FLG")},nac:gx.falseFn};b[63]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_CDASH_FLG",gxz:"ZV35GXV5",gxold:"OV35GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV5=a},v2z:function(a){gx.O.ZV35GXV5=a},v2c:function(){gx.fn.setRadioValue("CTLTBM03_CDASH_FLG",gx.O.GXV5)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_CDASH_FLG")},
nac:gx.falseFn};b[67]={fld:"TABLE1",grid:0};b[70]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_INPUT_TYPE_DIV",gxz:"ZV36GXV6",gxold:"OV36GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=a},v2z:function(a){gx.O.ZV36GXV6=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_INPUT_TYPE_DIV",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_INPUT_TYPE_DIV")},
nac:gx.falseFn};b[72]={fld:"TEXTBLOCK1",format:0,grid:0};b[75]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_REQUIRED_FLG",gxz:"ZV37GXV7",gxold:"OV37GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV7=a},v2z:function(a){gx.O.ZV37GXV7=a},v2c:function(){gx.fn.setRadioValue("CTLTBM03_REQUIRED_FLG",gx.O.GXV7)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_REQUIRED_FLG")},
nac:gx.falseFn};b[79]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_SAS_FIELD_NM",gxz:"ZV38GXV8",gxold:"OV38GXV8",gxvar:"GXV8",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=a},v2z:function(a){gx.O.ZV38GXV8=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_SAS_FIELD_NM",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_SAS_FIELD_NM")},nac:gx.falseFn};b[83]=
{lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_ODM_DATA_TYPE",gxz:"ZV39GXV9",gxold:"OV39GXV9",gxvar:"GXV9",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=a},v2z:function(a){gx.O.ZV39GXV9=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_ODM_DATA_TYPE",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_ODM_DATA_TYPE")},nac:gx.falseFn};b[87]={lvl:0,type:"svchar",
len:1E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_NOTE",gxz:"ZV40GXV10",gxold:"OV40GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=a},v2z:function(a){gx.O.ZV40GXV10=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_NOTE",gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_NOTE")},nac:gx.falseFn};b[90]={fld:"IMAGE4",grid:0};b[92]={lvl:0,type:"int",
len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_ORDER",gxz:"ZV41GXV11",gxold:"OV41GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=gx.num.intval(a)},v2z:function(a){gx.O.ZV41GXV11=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM03_ORDER",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("CTLTBM03_ORDER",",")},nac:gx.falseFn};
b[95]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_VERSION",gxz:"ZV42GXV12",gxold:"OV42GXV12",gxvar:"GXV12",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV12=a},v2z:function(a){gx.O.ZV42GXV12=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_VERSION",gx.O.GXV12,0)},c2v:function(){gx.O.GXV12=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_VERSION")},nac:gx.falseFn};b[99]={lvl:0,type:"svchar",
len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_DEL_FLG",gxz:"ZV43GXV13",gxold:"OV43GXV13",gxvar:"GXV13",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV13=a},v2z:function(a){gx.O.ZV43GXV13=a},v2c:function(){gx.fn.setRadioValue("CTLTBM03_DEL_FLG",gx.O.GXV13)},c2v:function(){gx.O.GXV13=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_DEL_FLG")},nac:gx.falseFn};b[105]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,
grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_CRT_DATETIME",gxz:"ZV44GXV14",gxold:"OV44GXV14",gxvar:"GXV14",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV14=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV44GXV14=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM03_CRT_DATETIME",gx.O.GXV14,0)},c2v:function(){gx.O.GXV14=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("CTLTBM03_CRT_DATETIME")},
nac:gx.falseFn};b[108]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_UPD_DATETIME",gxz:"ZV45GXV15",gxold:"OV45GXV15",gxvar:"GXV15",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV15=gx.fn.toDatetimeValue(a,"Y4MD")},v2z:function(a){gx.O.ZV45GXV15=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("CTLTBM03_UPD_DATETIME",gx.O.GXV15,0)},
c2v:function(){gx.O.GXV15=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("CTLTBM03_UPD_DATETIME")},nac:gx.falseFn};b[112]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_CRT_USER_NM",gxz:"ZV10D_CRT_USER_NM",gxold:"OV10D_CRT_USER_NM",gxvar:"AV10D_CRT_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_CRT_USER_NM=a},v2z:function(a){gx.O.ZV10D_CRT_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_CRT_USER_NM",
gx.O.AV10D_CRT_USER_NM,1)},c2v:function(){gx.O.AV10D_CRT_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_CRT_USER_NM")},nac:gx.falseFn};b[115]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_UPD_USER_NM",gxz:"ZV11D_UPD_USER_NM",gxold:"OV11D_UPD_USER_NM",gxvar:"AV11D_UPD_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11D_UPD_USER_NM=a},v2z:function(a){gx.O.ZV11D_UPD_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_UPD_USER_NM",
gx.O.AV11D_UPD_USER_NM,1)},c2v:function(){gx.O.AV11D_UPD_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_UPD_USER_NM")},nac:gx.falseFn};b[119]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_CRT_PROG_NM",gxz:"ZV46GXV16",gxold:"OV46GXV16",gxvar:"GXV16",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV16=a},v2z:function(a){gx.O.ZV46GXV16=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_CRT_PROG_NM",
gx.O.GXV16,0)},c2v:function(){gx.O.GXV16=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_CRT_PROG_NM")},nac:gx.falseFn};b[122]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM03_UPD_PROG_NM",gxz:"ZV47GXV17",gxold:"OV47GXV17",gxvar:"GXV17",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV17=a},v2z:function(a){gx.O.ZV47GXV17=a},v2c:function(){gx.fn.setControlValue("CTLTBM03_UPD_PROG_NM",gx.O.GXV17,0)},
c2v:function(){gx.O.GXV17=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM03_UPD_PROG_NM")},nac:gx.falseFn};b[123]={fld:"TBL_HIDDEN",grid:0};b[126]={fld:"TXT_JS_EVENT",format:1,grid:0};b[127]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_INIT_FLG",gxz:"ZV12H_INIT_FLG",gxold:"OV12H_INIT_FLG",gxvar:"AV12H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_INIT_FLG=a},v2z:function(a){gx.O.ZV12H_INIT_FLG=
a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV12H_INIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV12H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(127,function(){});b[128]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_MODE",gxz:"ZV14H_MODE",gxold:"OV14H_MODE",gxvar:"AV14H_MODE",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.AV14H_MODE=a},v2z:function(a){gx.O.ZV14H_MODE=a},v2c:function(){gx.fn.setControlValue("vH_MODE",gx.O.AV14H_MODE,0)},c2v:function(){gx.O.AV14H_MODE=this.val()},val:function(){return gx.fn.getControlValue("vH_MODE")},nac:gx.falseFn};b[129]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vH_KNGN_FLG",gxz:"ZV13H_KNGN_FLG",gxold:"OV13H_KNGN_FLG",gxvar:"AV13H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.AV13H_KNGN_FLG=a},v2z:function(a){gx.O.ZV13H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV13H_KNGN_FLG,0)},c2v:function(){gx.O.AV13H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:gx.falseFn};this.OV40GXV10=this.ZV40GXV10=this.GXV10=this.OV39GXV9=this.ZV39GXV9=this.GXV9=this.OV38GXV8=this.ZV38GXV8=this.GXV8=this.OV37GXV7=this.ZV37GXV7=this.GXV7=this.OV36GXV6=this.ZV36GXV6=this.GXV6=this.OV35GXV5=this.ZV35GXV5=this.GXV5=
this.OV34GXV4=this.ZV34GXV4=this.GXV4=this.OV33GXV3=this.ZV33GXV3=this.GXV3=this.OV32GXV2=this.ZV32GXV2=this.GXV2=this.OV31GXV1=this.ZV31GXV1=this.GXV1="";this.OV41GXV11=this.ZV41GXV11=this.GXV11=0;this.OV43GXV13=this.ZV43GXV13=this.GXV13=this.OV42GXV12=this.ZV42GXV12=this.GXV12="";this.GXV14=gx.date.nullDate();this.ZV44GXV14=gx.date.nullDate();this.OV44GXV14=gx.date.nullDate();this.GXV15=gx.date.nullDate();this.ZV45GXV15=gx.date.nullDate();this.OV45GXV15=gx.date.nullDate();this.GXV10=this.GXV9=this.GXV8=
this.GXV7=this.GXV6=this.GXV5=this.GXV4=this.GXV3=this.GXV2=this.GXV1=this.OV13H_KNGN_FLG=this.ZV13H_KNGN_FLG=this.AV13H_KNGN_FLG=this.OV14H_MODE=this.ZV14H_MODE=this.AV14H_MODE=this.OV12H_INIT_FLG=this.ZV12H_INIT_FLG=this.AV12H_INIT_FLG=this.OV47GXV17=this.ZV47GXV17=this.GXV17=this.OV46GXV16=this.ZV46GXV16=this.GXV16=this.OV11D_UPD_USER_NM=this.ZV11D_UPD_USER_NM=this.AV11D_UPD_USER_NM=this.OV10D_CRT_USER_NM=this.ZV10D_CRT_USER_NM=this.AV10D_CRT_USER_NM="";this.GXV11=0;this.GXV13=this.GXV12="";this.GXV14=
gx.date.nullDate();this.GXV15=gx.date.nullDate();this.AV13H_KNGN_FLG=this.AV14H_MODE=this.AV12H_INIT_FLG=this.GXV17=this.GXV16=this.AV11D_UPD_USER_NM=this.AV10D_CRT_USER_NM="";this.AV17P_MOVE_KBN=0;this.A59TBM03_DOM_CD=this.A60TBM03_DOM_VAR_NM=this.A205TAM07_USER_NM=this.A55TAM07_USER_ID=this.AV16P_DOM_VAR_NM=this.AV15P_DOM_CD="";this.A363TBM03_UPD_DATETIME=gx.date.nullDate();this.A49TBM02_DOM_CD=this.A611TBM02_DOM_JNM=this.A615TBM02_DEL_FLG="";this.A614TBM02_ORDER=0;this.AV25W_A821_JS=this.AV24W_A819_JS=
"";this.AV20W_A_CHK_RESULT_SDT_ITEM={};this.AV19W_A_CHK_RESULT_SDT=[];this.AV53GXV19=0;this.Events={e111y2_client:["'BTN_REG'",true],e171y2_client:["'BTN_REG_EXEC'",true],e121y2_client:["'BTN_UPD'",true],e181y2_client:["'BTN_UPD_EXEC'",true],e131y2_client:["'BTN_DLT'",true],e191y2_client:["'BTN_DLT_EXEC'",true],e141y2_client:["'BTN_CAN'",true],e211y2_client:["ENTER",true],e221y2_client:["CANCEL",true]};this.setVCMap("AV17P_MOVE_KBN","vP_MOVE_KBN",0,"int");this.setVCMap("AV15P_DOM_CD","vP_DOM_CD",
0,"svchar");this.setVCMap("AV16P_DOM_VAR_NM","vP_DOM_VAR_NM",0,"svchar");this.addBCProperty("Bc_cdisc_item",["TBM03_DOM_CD"],this.GXValidFnc[47],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_DOM_VAR_NM"],this.GXValidFnc[52],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_VAR_DESC"],this.GXValidFnc[56],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_SDTM_FLG"],this.GXValidFnc[60],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_CDASH_FLG"],
this.GXValidFnc[63],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_INPUT_TYPE_DIV"],this.GXValidFnc[70],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_REQUIRED_FLG"],this.GXValidFnc[75],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_SAS_FIELD_NM"],this.GXValidFnc[79],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_ODM_DATA_TYPE"],this.GXValidFnc[83],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_NOTE"],this.GXValidFnc[87],
"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_ORDER"],this.GXValidFnc[92],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_VERSION"],this.GXValidFnc[95],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_DEL_FLG"],this.GXValidFnc[99],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_CRT_DATETIME"],this.GXValidFnc[105],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_UPD_DATETIME"],this.GXValidFnc[108],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",
["TBM03_CRT_PROG_NM"],this.GXValidFnc[119],"AV5BC_CDISC_ITEM");this.addBCProperty("Bc_cdisc_item",["TBM03_UPD_PROG_NM"],this.GXValidFnc[122],"AV5BC_CDISC_ITEM");this.InitStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0132",lvl:1})});gx.setParentObj(new a213_wp01_cdisc_item_mst);
