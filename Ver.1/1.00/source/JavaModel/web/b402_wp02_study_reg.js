gx.evt.autoSkip=false;function b402_wp02_study_reg(){this.ServerClass="B402_WP02_STUDY_REG";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e110v2_client");this.addKeyListener("4","e120v2_client");this.addKeyListener("5","e130v2_client");this.addKeyListener("6","e140v2_client");this.addKeyListener("11","e150v2_client");this.SetStandaloneVars=function(){this.AV13P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",")};this.s162_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"ST_CLICK_SPACE();");if(!(""==this.AV20W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV20W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")}if(!(""==this.AV19W_A819_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV19W_A819_JS)}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s182_client=function(){gx.fn.setCtrlProperty("CTLTBM21_STUDY_ID","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM21_OUTER_STUDY_ID","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM21_STUDY_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM21_PROC_NM","Backcolor",gx.color.rgb(255,255,255));gx.fn.setCtrlProperty("CTLTBM21_NOTE","Backcolor",gx.color.rgb(255,255,255))
};this.s192_client=function(){this.AV48GXV13=1;while(this.AV48GXV13<=this.AV14W_A_CHK_RESULT_SDT.length){this.AV15W_A_CHK_RESULT_SDT_ITEM=this.AV14W_A_CHK_RESULT_SDT[this.AV48GXV13-1];this.s202_client();this.AV48GXV13=this.AV48GXV13+1}};this.s202_client=function(){if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_STUDY_ID"){gx.fn.setCtrlProperty("CTLTBM21_STUDY_ID","Backcolor",gx.color.rgb(255,192,203));if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_STUDY_ID")}}else{if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_STUDY_NM"){gx.fn.setCtrlProperty("CTLTBM21_STUDY_NM","Backcolor",gx.color.rgb(255,192,203));
if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_STUDY_NM")}}else{if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_OUTER_STUDY_ID"){gx.fn.setCtrlProperty("CTLTBM21_OUTER_STUDY_ID","Backcolor",gx.color.rgb(255,192,203));if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_OUTER_STUDY_ID")}}else{if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_PROC_NM"){gx.fn.setCtrlProperty("CTLTBM21_PROC_NM","Backcolor",gx.color.rgb(255,192,203));if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_PROC_NM")
}}else{if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_NOTE"){gx.fn.setCtrlProperty("CTLTBM21_NOTE","Backcolor",gx.color.rgb(255,192,203));if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_NOTE")}}else{if(this.AV15W_A_CHK_RESULT_SDT_ITEM.ID=="TBM21_STATUS"){if(this.AV15W_A_CHK_RESULT_SDT_ITEM.FOCUS==true){gx.fn.usrSetFocus("CTLTBM21_STATUS")}}}}}}}};this.e110v2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e180v2_client=function(){this.executeServerEvent("'BTN_REG_EXEC'",true)
};this.e120v2_client=function(){this.executeServerEvent("'BTN_UPD'",true)};this.e190v2_client=function(){this.executeServerEvent("'BTN_UPD_EXEC'",true)};this.e130v2_client=function(){this.executeServerEvent("'BTN_CSV'",true)};this.e140v2_client=function(){this.executeServerEvent("'BTN_DLT'",true)};this.e200v2_client=function(){this.executeServerEvent("'BTN_DLT_EXEC'",true)};this.e150v2_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e210v2_client=function(){this.executeServerEvent("'BTN_STAFF'",true)
};this.e220v2_client=function(){this.executeServerEvent("'BTN_CRF_DETAIL'",true)};this.e230v2_client=function(){this.executeServerEvent("'BTN_SITE'",true)};this.e240v2_client=function(){this.executeServerEvent("'BTN_CRF_COND'",true)};this.e250v2_client=function(){this.executeServerEvent("'BTN_CRF_DOMAIN'",true)};this.e270v2_client=function(){this.executeServerEvent("ENTER",true)};this.e280v2_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,19,21,23,26,32,37,38,40,42,44,47,48,50,53,55,57,59,62,64,67,69,70,75,77,80,82,84,86,89,91,94,96,99,101,103,105,109,112,114,117,119,124,126,128,130,133,135,137,139,142,144,146,148,153,156,157,158,159,160,161,162];
this.GXLastCtrlId=162;this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TBL_UPD_BTNSET",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_REG",format:0,grid:0};this.GXValidFnc[17]={fld:"TXT_BTN_UPD",format:0,grid:0};this.GXValidFnc[19]={fld:"TXT_BTN_CSV",format:0,grid:0};this.GXValidFnc[21]={fld:"TXT_BTN_DLT",format:0,grid:0};this.GXValidFnc[23]={fld:"TXT_BTN_CAN",format:0,grid:0};this.GXValidFnc[26]={fld:"TABLE4",grid:0};this.GXValidFnc[32]={fld:"TABLE5",grid:0};
this.GXValidFnc[37]={fld:"IMAGE6",grid:0};this.GXValidFnc[38]={fld:"TEXTBLOCK63",format:0,grid:0};this.GXValidFnc[40]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLTBM21_STUDY_ID",gxz:"ZV33GXV1",gxold:"OV33GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)},v2z:function(a){gx.O.ZV33GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLTBM21_STUDY_ID",gx.O.GXV1,0)
},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getIntegerValue("CTLTBM21_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[42]={fld:"TEXTBLOCK68",format:0,grid:0};this.GXValidFnc[44]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_OUTER_STUDY_ID",gxz:"ZV34GXV2",gxold:"OV34GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=a},v2z:function(a){gx.O.ZV34GXV2=a},v2c:function(){gx.fn.setControlValue("CTLTBM21_OUTER_STUDY_ID",gx.O.GXV2,0)
},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_OUTER_STUDY_ID")},nac:function(){return false}};this.GXValidFnc[47]={fld:"IMAGE7",grid:0};this.GXValidFnc[48]={fld:"TEXTBLOCK64",format:0,grid:0};this.GXValidFnc[50]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_STUDY_NM",gxz:"ZV35GXV3",gxold:"OV35GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV35GXV3=a
},v2c:function(){gx.fn.setControlValue("CTLTBM21_STUDY_NM",gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_STUDY_NM")},nac:function(){return false}};this.GXValidFnc[53]={fld:"TEXTBLOCK65",format:0,grid:0};this.GXValidFnc[55]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_STATUS",gxz:"ZV36GXV4",gxold:"OV36GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV4=a
},v2z:function(a){gx.O.ZV36GXV4=a},v2c:function(){gx.fn.setRadioValue("CTLTBM21_STATUS",gx.O.GXV4)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_STATUS")},nac:function(){return false}};this.GXValidFnc[57]={fld:"TEXTBLOCK69",format:0,grid:0};this.GXValidFnc[59]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_PROC_NM",gxz:"ZV37GXV5",gxold:"OV37GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=a
},v2z:function(a){gx.O.ZV37GXV5=a},v2c:function(){gx.fn.setControlValue("CTLTBM21_PROC_NM",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_PROC_NM")},nac:function(){return false}};this.GXValidFnc[62]={fld:"TEXTBLOCK79",format:0,grid:0};this.GXValidFnc[64]={lvl:0,type:"svchar",len:1000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_NOTE",gxz:"ZV38GXV6",gxold:"OV38GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=a
},v2z:function(a){gx.O.ZV38GXV6=a},v2c:function(){gx.fn.setControlValue("CTLTBM21_NOTE",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_NOTE")},nac:function(){return false}};this.GXValidFnc[67]={fld:"TEXTBLOCK84",format:0,grid:0};this.GXValidFnc[69]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_DEL_FLG",gxz:"ZV39GXV7",gxold:"OV39GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.GXV7=a
},v2z:function(a){gx.O.ZV39GXV7=a},v2c:function(){gx.fn.setRadioValue("CTLTBM21_DEL_FLG",gx.O.GXV7)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[70]={fld:"TABLE3",grid:0};this.GXValidFnc[75]={fld:"TEXTBLOCK85",format:0,grid:0};this.GXValidFnc[77]={fld:"TABLE6",grid:0};this.GXValidFnc[80]={fld:"TXT_SITE_INFO",format:0,grid:0};this.GXValidFnc[82]={fld:"TXT_BTN_SITE",format:0,grid:0};this.GXValidFnc[84]={fld:"TEXTBLOCK76",format:0,grid:0};
this.GXValidFnc[86]={fld:"TABLE7",grid:0};this.GXValidFnc[89]={fld:"TXT_USER_INFO",format:0,grid:0};this.GXValidFnc[91]={fld:"TXT_BTN_STAFF",format:0,grid:0};this.GXValidFnc[94]={fld:"TEXTBLOCK77",format:0,grid:0};this.GXValidFnc[96]={fld:"TABLE8",grid:0};this.GXValidFnc[99]={fld:"TXT_CRF_INFO",format:0,grid:0};this.GXValidFnc[101]={fld:"TXT_BTN_CRF_DETAIL",format:0,grid:0};this.GXValidFnc[103]={fld:"TEXTBLOCK78",format:0,grid:0};this.GXValidFnc[105]={fld:"TABLE9",grid:0};this.GXValidFnc[109]={fld:"TXT_BTN_CRF_COND",format:0,grid:0};
this.GXValidFnc[112]={fld:"TEXTBLOCK80",format:0,grid:0};this.GXValidFnc[114]={fld:"TABLE10",grid:0};this.GXValidFnc[117]={fld:"TXT_DOMAIN_INFO",format:0,grid:0};this.GXValidFnc[119]={fld:"TXT_BTN_DOMAIN",format:0,grid:0};this.GXValidFnc[124]={fld:"TEXTBLOCK67",format:0,grid:0};this.GXValidFnc[126]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_CRT_DATETIME",gxz:"ZV40GXV8",gxold:"OV40GXV8",gxvar:"GXV8",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=gx.fn.toDatetimeValue(a,"Y4MD")
},v2z:function(a){gx.O.ZV40GXV8=gx.fn.toDatetimeValue(a,"Y4MD")},v2c:function(){gx.fn.setControlValue("CTLTBM21_CRT_DATETIME",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[128]={fld:"TEXTBLOCK72",format:0,grid:0};this.GXValidFnc[130]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_UPD_DATETIME",gxz:"ZV41GXV9",gxold:"OV41GXV9",gxvar:"GXV9",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=gx.fn.toDatetimeValue(a,"Y4MD")
},v2z:function(a){gx.O.ZV41GXV9=gx.fn.toDatetimeValue(a,"Y4MD")},v2c:function(){gx.fn.setControlValue("CTLTBM21_UPD_DATETIME",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[133]={fld:"TEXTBLOCK70",format:0,grid:0};this.GXValidFnc[135]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_CRT_USER_NM",gxz:"ZV8D_CRT_USER_NM",gxold:"OV8D_CRT_USER_NM",gxvar:"AV8D_CRT_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8D_CRT_USER_NM=a
},v2z:function(a){gx.O.ZV8D_CRT_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_CRT_USER_NM",gx.O.AV8D_CRT_USER_NM,1)},c2v:function(){gx.O.AV8D_CRT_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_CRT_USER_NM")},nac:function(){return false}};this.GXValidFnc[137]={fld:"TEXTBLOCK73",format:0,grid:0};this.GXValidFnc[139]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_UPD_USER_NM",gxz:"ZV9D_UPD_USER_NM",gxold:"OV9D_UPD_USER_NM",gxvar:"AV9D_UPD_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_UPD_USER_NM=a
},v2z:function(a){gx.O.ZV9D_UPD_USER_NM=a},v2c:function(){gx.fn.setControlValue("vD_UPD_USER_NM",gx.O.AV9D_UPD_USER_NM,1)},c2v:function(){gx.O.AV9D_UPD_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("vD_UPD_USER_NM")},nac:function(){return false}};this.GXValidFnc[142]={fld:"TEXTBLOCK71",format:0,grid:0};this.GXValidFnc[144]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_CRT_PROG_NM",gxz:"ZV42GXV10",gxold:"OV42GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=a
},v2z:function(a){gx.O.ZV42GXV10=a},v2c:function(){gx.fn.setControlValue("CTLTBM21_CRT_PROG_NM",gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[146]={fld:"TEXTBLOCK74",format:0,grid:0};this.GXValidFnc[148]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"CTLTBM21_UPD_PROG_NM",gxz:"ZV43GXV11",gxold:"OV43GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=a
},v2z:function(a){gx.O.ZV43GXV11=a},v2c:function(){gx.fn.setControlValue("CTLTBM21_UPD_PROG_NM",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=this.val()},val:function(){return gx.fn.getControlValue("CTLTBM21_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[153]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[156]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[157]={fld:"BTN_UPD_EXEC",format:0,grid:0};this.GXValidFnc[158]={fld:"BTN_REG_EXEC",format:0,grid:0};this.GXValidFnc[159]={fld:"BTN_DLT_EXEC",format:0,grid:0};
this.GXValidFnc[160]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV10H_INIT_FLG",gxold:"OV10H_INIT_FLG",gxvar:"AV10H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10H_INIT_FLG=a},v2z:function(a){gx.O.ZV10H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV10H_INIT_FLG,0)},c2v:function(){gx.O.AV10H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false
}};this.GXValidFnc[161]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_MODE",gxz:"ZV12H_MODE",gxold:"OV12H_MODE",gxvar:"AV12H_MODE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12H_MODE=a},v2z:function(a){gx.O.ZV12H_MODE=a},v2c:function(){gx.fn.setControlValue("vH_MODE",gx.O.AV12H_MODE,0)},c2v:function(){gx.O.AV12H_MODE=this.val()},val:function(){return gx.fn.getControlValue("vH_MODE")},nac:function(){return false}};this.GXValidFnc[162]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV11H_KNGN_FLG",gxold:"OV11H_KNGN_FLG",gxvar:"AV11H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV11H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV11H_KNGN_FLG,0)},c2v:function(){gx.O.AV11H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.GXV1=0;this.ZV33GXV1=0;this.OV33GXV1=0;this.GXV2="";this.ZV34GXV2="";this.OV34GXV2="";this.GXV3="";this.ZV35GXV3="";this.OV35GXV3="";this.GXV4="";this.ZV36GXV4="";this.OV36GXV4="";this.GXV5="";this.ZV37GXV5="";this.OV37GXV5="";this.GXV6="";this.ZV38GXV6="";
this.OV38GXV6="";this.GXV7="";this.ZV39GXV7="";this.OV39GXV7="";this.GXV8=gx.date.nullDate();this.ZV40GXV8=gx.date.nullDate();this.OV40GXV8=gx.date.nullDate();this.GXV9=gx.date.nullDate();this.ZV41GXV9=gx.date.nullDate();this.OV41GXV9=gx.date.nullDate();this.AV8D_CRT_USER_NM="";this.ZV8D_CRT_USER_NM="";this.OV8D_CRT_USER_NM="";this.AV9D_UPD_USER_NM="";this.ZV9D_UPD_USER_NM="";this.OV9D_UPD_USER_NM="";this.GXV10="";this.ZV42GXV10="";this.OV42GXV10="";this.GXV11="";this.ZV43GXV11="";this.OV43GXV11="";
this.AV10H_INIT_FLG="";this.ZV10H_INIT_FLG="";this.OV10H_INIT_FLG="";this.AV12H_MODE="";this.ZV12H_MODE="";this.OV12H_MODE="";this.AV11H_KNGN_FLG="";this.ZV11H_KNGN_FLG="";this.OV11H_KNGN_FLG="";this.AV13P_STUDY_ID=0;this.A887TBM42_DEL_FLG="";this.A886TBM42_STUDY_ID=0;this.A223TBM31_DEL_FLG="";this.A217TBM31_STUDY_ID=0;this.A147TAM07_SITE_ID="";this.A16TAM07_DEL_FLG="";this.A209TBM23_DEL_FLG="";this.A207TBM23_STUDY_ID=0;this.A208TBM23_USER_ID="";this.A198TBM22_SITE_ID="";this.A139TAM08_DEL_FLG="";
this.A199TBM22_DEL_FLG="";this.A197TBM22_STUDY_ID=0;this.A8TAM07_USER_ID="";this.A2TAM07_USER_NM="";this.A766VBM01_TBM32_CRF_ID=0;this.A767VBM01_TBM31_CRF_SNM="";this.A768VBM01_TBM32_CRF_ITEM_CD="";this.A769VBM01_TBM32_CRF_ITEM_NM="";this.A770VBM01_TBM32_CRF_ITEM_DIV="";this.A771VBM01_TBM32_CRF_ITEM_GRP_CD="";this.A772VBM01_TBM32_CRF_ITEM_GRP_ORDER=0;this.A773VBM01_TBM32_LOCATION_X=0;this.A774VBM01_TBM32_LOCATION_Y=0;this.A775VBM01_TBM32_LOCATION_X2=0;this.A776VBM01_TBM32_LOCATION_Y2=0;this.A777VBM01_TBM32_TEXT_ALIGN_DIV="";
this.A778VBM01_TBM32_TEXT_MAXROWS=0;this.A779VBM01_TBM32_TEXT_MAXLENGTH=0;this.A780VBM01_TBM32_DECIMAL_DIGITS=0;this.A781VBM01_TBM32_CHK_TRUE_INNER_VAL="";this.A782VBM01_TBM32_CHK_FALSE_INNER_VA="";this.A783VBM01_TBM32_FIXED_VALUE="";this.A784VBM01_TBM32_LIST_CD="";this.A785VBM01_TBM25_LIST_NM="";this.A786VBM01_TBM32_IMAGE_CD="";this.A787VBM01_TBM32_TEXT="";this.A788VBM01_TBM32_FONT_SIZE=0;this.A789VBM01_TBM32_FONT_UL_FLG="";this.A790VBM01_TBM32_FONT_COLOR_DIV=0;this.A791VBM01_TBM32_LINE_SIZE_DIV=0;
this.A792VBM01_TBM32_LINE_COLOR_DIV=0;this.A793VBM01_TBM32_LINE_START_POINT_D="";this.A794VBM01_TBM32_LINE_END_POINT_DIV="";this.A795VBM01_TBM32_LINE_ANGLE=0;this.A796VBM01_TBM32_AUTH_LVL_MIN=0;this.A797VBM01_TBM32_ZORDER=0;this.A798VBM01_TBM32_TAB_ORDER=0;this.A799VBM01_TBM32_TABSTOP_FLG="";this.A800VBM01_TBM32_REQUIRED_INPUT_FLG="";this.A801VBM01_TBM32_MIN_VALUE="";this.A802VBM01_TBM32_MAX_VALUE="";this.A803VBM01_TBM32_CRF_ITEM_NOTE="";this.A804VBM01_TBM32_REF_CRF_ID=0;this.A805VBM01_TBM32_REF_CRF_ITEM_CD="";
this.A806VBM01_TBM37_VISIT_NO=0;this.A807VBM01_TBM37_DOM_CD="";this.A808VBM01_TBM37_DOM_VAR_NM="";this.A809VBM01_TBM37_DOM_ITM_GRP_OID="";this.A810VBM01_TBM37_DOM_ITM_GRP_ATTR_S=0;this.A811VBM01_TBM37_DOM_ITM_GRP_ROWNO=0;this.A812VBM01_TBM41_NCM_METADATA_ID="";this.A765VBM01_TBM32_STUDY_ID=0;this.AV19W_A819_JS="";this.AV20W_A821_JS="";this.AV15W_A_CHK_RESULT_SDT_ITEM={};this.AV14W_A_CHK_RESULT_SDT=[];this.AV48GXV13=0;this.ServerEvents=["e110v2_client","e180v2_client","e120v2_client","e190v2_client","e130v2_client","e140v2_client","e200v2_client","e150v2_client","e210v2_client","e220v2_client","e230v2_client","e240v2_client","e250v2_client","e270v2_client","e280v2_client"];
this.VarControlMap.AV13P_STUDY_ID={id:"vP_STUDY_ID",grid:0,type:"int"};this.addBCProperty("Bc_study",["TBM21_STUDY_ID"],this.GXValidFnc[40],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_OUTER_STUDY_ID"],this.GXValidFnc[44],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_STUDY_NM"],this.GXValidFnc[50],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_STATUS"],this.GXValidFnc[55],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_PROC_NM"],this.GXValidFnc[59],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_NOTE"],this.GXValidFnc[64],"AV5BC_STUDY");
this.addBCProperty("Bc_study",["TBM21_DEL_FLG"],this.GXValidFnc[69],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_CRT_DATETIME"],this.GXValidFnc[126],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_UPD_DATETIME"],this.GXValidFnc[130],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_CRT_PROG_NM"],this.GXValidFnc[144],"AV5BC_STUDY");this.addBCProperty("Bc_study",["TBM21_UPD_PROG_NM"],this.GXValidFnc[148],"AV5BC_STUDY");this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});
this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0151",lvl:1})}b402_wp02_study_reg.prototype=new gx.GxObject;gx.setParentObj(new b402_wp02_study_reg());