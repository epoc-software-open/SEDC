gx.evt.autoSkip=false;function b402_wp12_study_domain_list(){this.ServerClass="B402_WP12_STUDY_DOMAIN_LIST";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e11112_client");this.addKeyListener("4","e12112_client");this.addKeyListener("11","e13112_client");this.SetStandaloneVars=function(){this.AV20P_STUDY_ID=gx.fn.getIntegerValue("vP_STUDY_ID",",")};this.Valid_Tbm02_dom_cd=function(){try{if(gx.fn.currentGridRowImpl(153)===0){return true}var a=gx.util.balloon.getNew("TBM02_DOM_CD",gx.fn.currentGridRowImpl(153));
this.AnyError=0;this.StandaloneModal();this.StandaloneNotModal()}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.s172_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");if(!(""==this.AV23W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV23W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")
}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.e33112_client=function(){this.executeServerEvent("'BTN_EDIT'",true,arguments[0])
};this.e34112_client=function(){this.executeServerEvent("'BTN_ITEM_LIST'",true,arguments[0])};this.e14112_client=function(){this.executeServerEvent("VD_GRD_ALL_CHK.CLICK",true)};this.e11112_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e15112_client=function(){this.executeServerEvent("'BTN_REG_EXEC'",true)};this.e12112_client=function(){this.executeServerEvent("'BTN_CSV'",true)};this.e13112_client=function(){this.executeServerEvent("'BTN_CAN'",true)};this.e16112_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)
};this.e17112_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e18112_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e19112_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e20112_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e21112_client=function(){this.executeServerEvent("'PAGE02'",true)};this.e22112_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e23112_client=function(){this.executeServerEvent("'PAGE04'",true)
};this.e24112_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e25112_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e26112_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e27112_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e28112_client=function(){this.executeServerEvent("'PAGE09'",true)};this.e29112_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e35112_client=function(){this.executeServerEvent("ENTER",true,arguments[0])
};this.e36112_client=function(){this.executeServerEvent("CANCEL",true,arguments[0])};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,17,19,22,25,28,31,33,39,42,45,48,51,54,57,60,63,66,69,72,75,78,81,84,87,90,93,96,99,102,105,108,111,114,117,120,123,126,129,132,138,141,142,144,146,148,156,158,160,162,164,166,171,174,175,176,177,178,179,180,183,185,188,190,193,195,198,200,203,205,208,210,213,215,218,220,223,225,228,230,233,235,238,240,243,245,248,250,253,255,258,260,263,265,268,270,273,275,278,280,283,285,288,290,293,295,298,300,303,305,308,310,313,315,318,320,323,325];
this.GXLastCtrlId=325;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",153,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"b402_wp12_study_domain_list",[],true,1,true,true,10,false,false,false,"",0,"px","行追加",true,false,true,null,null,false,"");this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","center","","","","","50px","","","");this.Grid1Container.addCheckBox("D_grd_check",156,"vD_GRD_CHECK","","","D_GRD_CHECK","boolean","true","false",null,true,false,4,"chr");
this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","32px","85px","","","");this.Grid1Container.addSingleLineEdit(516,158,"TBM02_DOM_CD","","","TBM02_DOM_CD","svchar",2,"chr",2,2,"left",null,[],516,"TBM02_DOM_CD",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","370px","","","");this.Grid1Container.addSingleLineEdit(518,160,"TBM02_DOM_JNM","","","TBM02_DOM_JNM","svchar",50,"chr",50,50,"left",null,[],518,"TBM02_DOM_JNM",true,0,false,false);
this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","100px","","","");this.Grid1Container.addSingleLineEdit("D_grd_del",162,"vD_GRD_DEL","","","D_GRD_DEL","svchar",10,"chr",10,10,"left",null,[],"D_grd_del","D_GRD_DEL",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","50px","","","");this.Grid1Container.addTextBlock("BTN_EDIT","e33112_client");this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","90px","","","");
this.Grid1Container.addTextBlock("BTN_ITEM_LIST","e34112_client");this.Grid1Container.endCell();this.Grid1Container.endRow();this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};this.GXValidFnc[12]={fld:"TBL_UPD_BTNSET",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_REG",format:0,grid:0};this.GXValidFnc[17]={fld:"TXT_BTN_CSV",format:0,grid:0};this.GXValidFnc[19]={fld:"TEXTBLOCK46",format:0,grid:0};this.GXValidFnc[22]={fld:"TABLE3",grid:0};
this.GXValidFnc[25]={fld:"TABLE4",grid:0};this.GXValidFnc[28]={fld:"TABLE10",grid:0};this.GXValidFnc[31]={fld:"TEXTBLOCK16",format:0,grid:0};this.GXValidFnc[33]={fld:"TXT_STUDY",format:0,grid:0};this.GXValidFnc[39]={fld:"TBL_LIST",grid:0};this.GXValidFnc[42]={fld:"TBL_PAGE_AREA",grid:0};this.GXValidFnc[45]={fld:"TXT_REC_CNT",format:0,grid:0};this.GXValidFnc[48]={fld:"TBL_PAGE",grid:0};this.GXValidFnc[51]={fld:"TBL_FIRST",grid:0};this.GXValidFnc[54]={fld:"TXT_FIRST",format:0,grid:0};this.GXValidFnc[57]={fld:"TBL_BACK",grid:0};
this.GXValidFnc[60]={fld:"TXT_BACK",format:0,grid:0};this.GXValidFnc[63]={fld:"TBL_PAGE01",grid:0};this.GXValidFnc[66]={fld:"TXT_PAGE01",format:0,grid:0};this.GXValidFnc[69]={fld:"TBL_PAGE02",grid:0};this.GXValidFnc[72]={fld:"TXT_PAGE02",format:0,grid:0};this.GXValidFnc[75]={fld:"TBL_PAGE03",grid:0};this.GXValidFnc[78]={fld:"TXT_PAGE03",format:0,grid:0};this.GXValidFnc[81]={fld:"TBL_PAGE04",grid:0};this.GXValidFnc[84]={fld:"TXT_PAGE04",format:0,grid:0};this.GXValidFnc[87]={fld:"TBL_PAGE05",grid:0};
this.GXValidFnc[90]={fld:"TXT_PAGE05",format:0,grid:0};this.GXValidFnc[93]={fld:"TBL_PAGE06",grid:0};this.GXValidFnc[96]={fld:"TXT_PAGE06",format:0,grid:0};this.GXValidFnc[99]={fld:"TBL_PAGE07",grid:0};this.GXValidFnc[102]={fld:"TXT_PAGE07",format:0,grid:0};this.GXValidFnc[105]={fld:"TBL_PAGE08",grid:0};this.GXValidFnc[108]={fld:"TXT_PAGE08",format:0,grid:0};this.GXValidFnc[111]={fld:"TBL_PAGE09",grid:0};this.GXValidFnc[114]={fld:"TXT_PAGE09",format:0,grid:0};this.GXValidFnc[117]={fld:"TBL_PAGE10",grid:0};
this.GXValidFnc[120]={fld:"TXT_PAGE10",format:0,grid:0};this.GXValidFnc[123]={fld:"TBL_NEXT",grid:0};this.GXValidFnc[126]={fld:"TXT_NEXT",format:0,grid:0};this.GXValidFnc[129]={fld:"TBL_LAST",grid:0};this.GXValidFnc[132]={fld:"TXT_LAST",format:0,grid:0};this.GXValidFnc[138]={fld:"TBL_GRID_HEADER",grid:0};this.GXValidFnc[141]={lvl:0,type:"boolean",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_GRD_ALL_CHK",gxz:"ZV11D_GRD_ALL_CHK",gxold:"OV11D_GRD_ALL_CHK",gxvar:"AV11D_GRD_ALL_CHK",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(a){gx.O.AV11D_GRD_ALL_CHK=gx.lang.booleanValue(a)
},v2z:function(a){gx.O.ZV11D_GRD_ALL_CHK=gx.lang.booleanValue(a)},v2c:function(){gx.fn.setCheckBoxValue("vD_GRD_ALL_CHK",gx.O.AV11D_GRD_ALL_CHK,true)},c2v:function(){gx.O.AV11D_GRD_ALL_CHK=this.val()},val:function(){return gx.fn.getCheckBoxValue("vD_GRD_ALL_CHK",true,false)},nac:function(){return false}};this.GXValidFnc[142]={fld:"TEXTBLOCK33",format:0,grid:0};this.GXValidFnc[144]={fld:"TEXTBLOCK13",format:0,grid:0};this.GXValidFnc[146]={fld:"TEXTBLOCK18",format:0,grid:0};this.GXValidFnc[148]={fld:"TEXTBLOCK34",format:0,grid:0};
this.GXValidFnc[156]={lvl:2,type:"boolean",len:4,dec:0,sign:false,ro:0,grid:153,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_CHECK",gxz:"ZV12D_GRD_CHECK",gxold:"OV12D_GRD_CHECK",gxvar:"AV12D_GRD_CHECK",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"checkbox",v2v:function(a){gx.O.AV12D_GRD_CHECK=gx.lang.booleanValue(a)},v2z:function(a){gx.O.ZV12D_GRD_CHECK=gx.lang.booleanValue(a)},v2c:function(){gx.fn.setGridCheckBoxValue("vD_GRD_CHECK",gx.fn.currentGridRowImpl(153),gx.O.AV12D_GRD_CHECK,true)
},c2v:function(){gx.O.AV12D_GRD_CHECK=this.val()},val:function(){return gx.fn.getGridCheckBoxValue("vD_GRD_CHECK",gx.fn.currentGridRowImpl(153),true,false)},nac:function(){return false}};this.GXValidFnc[158]={lvl:2,type:"svchar",len:2,dec:0,sign:false,ro:1,grid:153,gxgrid:this.Grid1Container,fnc:this.Valid_Tbm02_dom_cd,isvalid:null,fld:"TBM02_DOM_CD",gxz:"Z516TBM02_DOM_CD",gxold:"O516TBM02_DOM_CD",gxvar:"A516TBM02_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A516TBM02_DOM_CD=a
},v2z:function(a){gx.O.Z516TBM02_DOM_CD=a},v2c:function(){gx.fn.setGridControlValue("TBM02_DOM_CD",gx.fn.currentGridRowImpl(153),gx.O.A516TBM02_DOM_CD,0)},c2v:function(){gx.O.A516TBM02_DOM_CD=this.val()},val:function(){return gx.fn.getGridControlValue("TBM02_DOM_CD",gx.fn.currentGridRowImpl(153))},nac:function(){return false}};this.GXValidFnc[160]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:1,grid:153,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM02_DOM_JNM",gxz:"Z518TBM02_DOM_JNM",gxold:"O518TBM02_DOM_JNM",gxvar:"A518TBM02_DOM_JNM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A518TBM02_DOM_JNM=a
},v2z:function(a){gx.O.Z518TBM02_DOM_JNM=a},v2c:function(){gx.fn.setGridControlValue("TBM02_DOM_JNM",gx.fn.currentGridRowImpl(153),gx.O.A518TBM02_DOM_JNM,0)},c2v:function(){gx.O.A518TBM02_DOM_JNM=this.val()},val:function(){return gx.fn.getGridControlValue("TBM02_DOM_JNM",gx.fn.currentGridRowImpl(153))},nac:function(){return false}};this.GXValidFnc[162]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:153,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_DEL",gxz:"ZV34D_GRD_DEL",gxold:"OV34D_GRD_DEL",gxvar:"AV34D_GRD_DEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV34D_GRD_DEL=a
},v2z:function(a){gx.O.ZV34D_GRD_DEL=a},v2c:function(){gx.fn.setGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(153),gx.O.AV34D_GRD_DEL,0)},c2v:function(){gx.O.AV34D_GRD_DEL=this.val()},val:function(){return gx.fn.getGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(153))},nac:function(){return false}};this.GXValidFnc[164]={fld:"BTN_EDIT",format:0,grid:153};this.GXValidFnc[166]={fld:"BTN_ITEM_LIST",format:0,grid:153};this.GXValidFnc[171]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[174]={fld:"TXT_JS_EVENT",format:1,grid:0};
this.GXValidFnc[175]={fld:"TXT_BTN_REG_EXEC",format:1,grid:0};this.GXValidFnc[176]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV17H_INIT_FLG",gxold:"OV17H_INIT_FLG",gxvar:"AV17H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV17H_INIT_FLG=a},v2z:function(a){gx.O.ZV17H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV17H_INIT_FLG,0)},c2v:function(){gx.O.AV17H_INIT_FLG=this.val()
},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[177]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_SRCH_FLG",gxz:"ZV19H_SRCH_FLG",gxold:"OV19H_SRCH_FLG",gxvar:"AV19H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV19H_SRCH_FLG=a},v2z:function(a){gx.O.ZV19H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV19H_SRCH_FLG,0)},c2v:function(){gx.O.AV19H_SRCH_FLG=this.val()
},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:function(){return false}};this.GXValidFnc[178]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV18H_KNGN_FLG",gxold:"OV18H_KNGN_FLG",gxvar:"AV18H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV18H_KNGN_FLG=a},v2z:function(a){gx.O.ZV18H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV18H_KNGN_FLG,0)},c2v:function(){gx.O.AV18H_KNGN_FLG=this.val()
},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.GXValidFnc[179]={lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_DISP_DATETIME",gxz:"ZV16H_DISP_DATETIME",gxold:"OV16H_DISP_DATETIME",gxvar:"AV16H_DISP_DATETIME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_DISP_DATETIME=a},v2z:function(a){gx.O.ZV16H_DISP_DATETIME=a},v2c:function(){gx.fn.setControlValue("vH_DISP_DATETIME",gx.O.AV16H_DISP_DATETIME,0)
},c2v:function(){gx.O.AV16H_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("vH_DISP_DATETIME")},nac:function(){return false}};this.GXValidFnc[180]={fld:"TABLE6",grid:0};this.GXValidFnc[183]={fld:"TEXTBLOCK1",format:0,grid:0};this.GXValidFnc[185]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV37GXV1",gxold:"OV37GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)
},v2z:function(a){gx.O.ZV37GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:function(){return false}};this.GXValidFnc[188]={fld:"TEXTBLOCK2",format:0,grid:0};this.GXValidFnc[190]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_PAGE",gxz:"ZV38GXV2",gxold:"OV38GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV2=gx.num.intval(a)
},v2z:function(a){gx.O.ZV38GXV2=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_PAGE",gx.O.GXV2,0)},c2v:function(){gx.O.GXV2=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_PAGE",",")},nac:function(){return false}};this.GXValidFnc[193]={fld:"TEXTBLOCK3",format:0,grid:0};this.GXValidFnc[195]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLREC_CNT",gxz:"ZV39GXV3",gxold:"OV39GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV3=gx.num.intval(a)
},v2z:function(a){gx.O.ZV39GXV3=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLREC_CNT",gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(){return gx.fn.getIntegerValue("CTLREC_CNT",",")},nac:function(){return false}};this.GXValidFnc[198]={fld:"TEXTBLOCK4",format:0,grid:0};this.GXValidFnc[200]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_NO",gxz:"ZV40GXV4",gxold:"OV40GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV4=gx.num.intval(a)
},v2z:function(a){gx.O.ZV40GXV4=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_NO",gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_NO",",")},nac:function(){return false}};this.GXValidFnc[203]={fld:"TEXTBLOCK5",format:0,grid:0};this.GXValidFnc[205]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE01",gxz:"ZV41GXV5",gxold:"OV41GXV5",gxvar:"GXV5",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV5=gx.num.intval(a)
},v2z:function(a){gx.O.ZV41GXV5=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE01",gx.O.GXV5,0)},c2v:function(){gx.O.GXV5=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE01",",")},nac:function(){return false}};this.GXValidFnc[208]={fld:"TEXTBLOCK6",format:0,grid:0};this.GXValidFnc[210]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE02",gxz:"ZV42GXV6",gxold:"OV42GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV6=gx.num.intval(a)
},v2z:function(a){gx.O.ZV42GXV6=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE02",gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE02",",")},nac:function(){return false}};this.GXValidFnc[213]={fld:"TEXTBLOCK7",format:0,grid:0};this.GXValidFnc[215]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE03",gxz:"ZV43GXV7",gxold:"OV43GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV7=gx.num.intval(a)
},v2z:function(a){gx.O.ZV43GXV7=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE03",gx.O.GXV7,0)},c2v:function(){gx.O.GXV7=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE03",",")},nac:function(){return false}};this.GXValidFnc[218]={fld:"TEXTBLOCK8",format:0,grid:0};this.GXValidFnc[220]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE04",gxz:"ZV44GXV8",gxold:"OV44GXV8",gxvar:"GXV8",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV8=gx.num.intval(a)
},v2z:function(a){gx.O.ZV44GXV8=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE04",gx.O.GXV8,0)},c2v:function(){gx.O.GXV8=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE04",",")},nac:function(){return false}};this.GXValidFnc[223]={fld:"TEXTBLOCK9",format:0,grid:0};this.GXValidFnc[225]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE05",gxz:"ZV45GXV9",gxold:"OV45GXV9",gxvar:"GXV9",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV9=gx.num.intval(a)
},v2z:function(a){gx.O.ZV45GXV9=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE05",gx.O.GXV9,0)},c2v:function(){gx.O.GXV9=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE05",",")},nac:function(){return false}};this.GXValidFnc[228]={fld:"TEXTBLOCK10",format:0,grid:0};this.GXValidFnc[230]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE06",gxz:"ZV46GXV10",gxold:"OV46GXV10",gxvar:"GXV10",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV10=gx.num.intval(a)
},v2z:function(a){gx.O.ZV46GXV10=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE06",gx.O.GXV10,0)},c2v:function(){gx.O.GXV10=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE06",",")},nac:function(){return false}};this.GXValidFnc[233]={fld:"TEXTBLOCK11",format:0,grid:0};this.GXValidFnc[235]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE07",gxz:"ZV47GXV11",gxold:"OV47GXV11",gxvar:"GXV11",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV11=gx.num.intval(a)
},v2z:function(a){gx.O.ZV47GXV11=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE07",gx.O.GXV11,0)},c2v:function(){gx.O.GXV11=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE07",",")},nac:function(){return false}};this.GXValidFnc[238]={fld:"TEXTBLOCK12",format:0,grid:0};this.GXValidFnc[240]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE08",gxz:"ZV48GXV12",gxold:"OV48GXV12",gxvar:"GXV12",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV12=gx.num.intval(a)
},v2z:function(a){gx.O.ZV48GXV12=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE08",gx.O.GXV12,0)},c2v:function(){gx.O.GXV12=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE08",",")},nac:function(){return false}};this.GXValidFnc[243]={fld:"TEXTBLOCK14",format:0,grid:0};this.GXValidFnc[245]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE09",gxz:"ZV49GXV13",gxold:"OV49GXV13",gxvar:"GXV13",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV13=gx.num.intval(a)
},v2z:function(a){gx.O.ZV49GXV13=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE09",gx.O.GXV13,0)},c2v:function(){gx.O.GXV13=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE09",",")},nac:function(){return false}};this.GXValidFnc[248]={fld:"TEXTBLOCK15",format:0,grid:0};this.GXValidFnc[250]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE10",gxz:"ZV50GXV14",gxold:"OV50GXV14",gxvar:"GXV14",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV14=gx.num.intval(a)
},v2z:function(a){gx.O.ZV50GXV14=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE10",gx.O.GXV14,0)},c2v:function(){gx.O.GXV14=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE10",",")},nac:function(){return false}};this.GXValidFnc[253]={fld:"TEXTBLOCK17",format:0,grid:0};this.GXValidFnc[255]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP01",gxz:"ZV51GXV15",gxold:"OV51GXV15",gxvar:"GXV15",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV15=gx.num.intval(a)
},v2z:function(a){gx.O.ZV51GXV15=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP01",gx.O.GXV15,0)},c2v:function(){gx.O.GXV15=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP01",",")},nac:function(){return false}};this.GXValidFnc[258]={fld:"TEXTBLOCK19",format:0,grid:0};this.GXValidFnc[260]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP02",gxz:"ZV52GXV16",gxold:"OV52GXV16",gxvar:"GXV16",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV16=gx.num.intval(a)
},v2z:function(a){gx.O.ZV52GXV16=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP02",gx.O.GXV16,0)},c2v:function(){gx.O.GXV16=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP02",",")},nac:function(){return false}};this.GXValidFnc[263]={fld:"TEXTBLOCK20",format:0,grid:0};this.GXValidFnc[265]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP03",gxz:"ZV53GXV17",gxold:"OV53GXV17",gxvar:"GXV17",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV17=gx.num.intval(a)
},v2z:function(a){gx.O.ZV53GXV17=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP03",gx.O.GXV17,0)},c2v:function(){gx.O.GXV17=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP03",",")},nac:function(){return false}};this.GXValidFnc[268]={fld:"TEXTBLOCK21",format:0,grid:0};this.GXValidFnc[270]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP04",gxz:"ZV54GXV18",gxold:"OV54GXV18",gxvar:"GXV18",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV18=gx.num.intval(a)
},v2z:function(a){gx.O.ZV54GXV18=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP04",gx.O.GXV18,0)},c2v:function(){gx.O.GXV18=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP04",",")},nac:function(){return false}};this.GXValidFnc[273]={fld:"TEXTBLOCK22",format:0,grid:0};this.GXValidFnc[275]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP05",gxz:"ZV55GXV19",gxold:"OV55GXV19",gxvar:"GXV19",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV19=gx.num.intval(a)
},v2z:function(a){gx.O.ZV55GXV19=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP05",gx.O.GXV19,0)},c2v:function(){gx.O.GXV19=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP05",",")},nac:function(){return false}};this.GXValidFnc[278]={fld:"TEXTBLOCK23",format:0,grid:0};this.GXValidFnc[280]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP06",gxz:"ZV56GXV20",gxold:"OV56GXV20",gxvar:"GXV20",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV20=gx.num.intval(a)
},v2z:function(a){gx.O.ZV56GXV20=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP06",gx.O.GXV20,0)},c2v:function(){gx.O.GXV20=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP06",",")},nac:function(){return false}};this.GXValidFnc[283]={fld:"TEXTBLOCK24",format:0,grid:0};this.GXValidFnc[285]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP07",gxz:"ZV57GXV21",gxold:"OV57GXV21",gxvar:"GXV21",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV21=gx.num.intval(a)
},v2z:function(a){gx.O.ZV57GXV21=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP07",gx.O.GXV21,0)},c2v:function(){gx.O.GXV21=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP07",",")},nac:function(){return false}};this.GXValidFnc[288]={fld:"TEXTBLOCK25",format:0,grid:0};this.GXValidFnc[290]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP08",gxz:"ZV58GXV22",gxold:"OV58GXV22",gxvar:"GXV22",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV22=gx.num.intval(a)
},v2z:function(a){gx.O.ZV58GXV22=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP08",gx.O.GXV22,0)},c2v:function(){gx.O.GXV22=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP08",",")},nac:function(){return false}};this.GXValidFnc[293]={fld:"TEXTBLOCK26",format:0,grid:0};this.GXValidFnc[295]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP09",gxz:"ZV59GXV23",gxold:"OV59GXV23",gxvar:"GXV23",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV23=gx.num.intval(a)
},v2z:function(a){gx.O.ZV59GXV23=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP09",gx.O.GXV23,0)},c2v:function(){gx.O.GXV23=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP09",",")},nac:function(){return false}};this.GXValidFnc[298]={fld:"TEXTBLOCK27",format:0,grid:0};this.GXValidFnc[300]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP10",gxz:"ZV60GXV24",gxold:"OV60GXV24",gxvar:"GXV24",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV24=gx.num.intval(a)
},v2z:function(a){gx.O.ZV60GXV24=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP10",gx.O.GXV24,0)},c2v:function(){gx.O.GXV24=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP10",",")},nac:function(){return false}};this.GXValidFnc[303]={fld:"TEXTBLOCK28",format:0,grid:0};this.GXValidFnc[305]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_BACK",gxz:"ZV61GXV25",gxold:"OV61GXV25",gxvar:"GXV25",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV25=gx.num.intval(a)
},v2z:function(a){gx.O.ZV61GXV25=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_BACK",gx.O.GXV25,0)},c2v:function(){gx.O.GXV25=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_BACK",",")},nac:function(){return false}};this.GXValidFnc[308]={fld:"TEXTBLOCK29",format:0,grid:0};this.GXValidFnc[310]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_NEXT",gxz:"ZV62GXV26",gxold:"OV62GXV26",gxvar:"GXV26",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV26=gx.num.intval(a)
},v2z:function(a){gx.O.ZV62GXV26=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_NEXT",gx.O.GXV26,0)},c2v:function(){gx.O.GXV26=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_NEXT",",")},nac:function(){return false}};this.GXValidFnc[313]={fld:"TEXTBLOCK30",format:0,grid:0};this.GXValidFnc[315]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_FIRST",gxz:"ZV63GXV27",gxold:"OV63GXV27",gxvar:"GXV27",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV27=gx.num.intval(a)
},v2z:function(a){gx.O.ZV63GXV27=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_FIRST",gx.O.GXV27,0)},c2v:function(){gx.O.GXV27=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_FIRST",",")},nac:function(){return false}};this.GXValidFnc[318]={fld:"TEXTBLOCK31",format:0,grid:0};this.GXValidFnc[320]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_LAST",gxz:"ZV64GXV28",gxold:"OV64GXV28",gxvar:"GXV28",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV28=gx.num.intval(a)
},v2z:function(a){gx.O.ZV64GXV28=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_LAST",gx.O.GXV28,0)},c2v:function(){gx.O.GXV28=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_LAST",",")},nac:function(){return false}};this.GXValidFnc[323]={fld:"TEXTBLOCK32",format:0,grid:0};this.GXValidFnc[325]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLPAGE_DISP_AREA",gxz:"ZV65GXV29",gxold:"OV65GXV29",gxvar:"GXV29",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV29=gx.num.intval(a)
},v2z:function(a){gx.O.ZV65GXV29=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLPAGE_DISP_AREA",gx.O.GXV29,0)},c2v:function(){gx.O.GXV29=this.val()},val:function(){return gx.fn.getIntegerValue("CTLPAGE_DISP_AREA",",")},nac:function(){return false}};this.AV11D_GRD_ALL_CHK=false;this.ZV11D_GRD_ALL_CHK=false;this.OV11D_GRD_ALL_CHK=false;this.ZV12D_GRD_CHECK=false;this.OV12D_GRD_CHECK=false;this.Z516TBM02_DOM_CD="";this.O516TBM02_DOM_CD="";this.Z518TBM02_DOM_JNM="";this.O518TBM02_DOM_JNM="";
this.ZV34D_GRD_DEL="";this.OV34D_GRD_DEL="";this.AV17H_INIT_FLG="";this.ZV17H_INIT_FLG="";this.OV17H_INIT_FLG="";this.AV19H_SRCH_FLG="";this.ZV19H_SRCH_FLG="";this.OV19H_SRCH_FLG="";this.AV18H_KNGN_FLG="";this.ZV18H_KNGN_FLG="";this.OV18H_KNGN_FLG="";this.AV16H_DISP_DATETIME="";this.ZV16H_DISP_DATETIME="";this.OV16H_DISP_DATETIME="";this.GXV1=0;this.ZV37GXV1=0;this.OV37GXV1=0;this.GXV2=0;this.ZV38GXV2=0;this.OV38GXV2=0;this.GXV3=0;this.ZV39GXV3=0;this.OV39GXV3=0;this.GXV4=0;this.ZV40GXV4=0;this.OV40GXV4=0;
this.GXV5=0;this.ZV41GXV5=0;this.OV41GXV5=0;this.GXV6=0;this.ZV42GXV6=0;this.OV42GXV6=0;this.GXV7=0;this.ZV43GXV7=0;this.OV43GXV7=0;this.GXV8=0;this.ZV44GXV8=0;this.OV44GXV8=0;this.GXV9=0;this.ZV45GXV9=0;this.OV45GXV9=0;this.GXV10=0;this.ZV46GXV10=0;this.OV46GXV10=0;this.GXV11=0;this.ZV47GXV11=0;this.OV47GXV11=0;this.GXV12=0;this.ZV48GXV12=0;this.OV48GXV12=0;this.GXV13=0;this.ZV49GXV13=0;this.OV49GXV13=0;this.GXV14=0;this.ZV50GXV14=0;this.OV50GXV14=0;this.GXV15=0;this.ZV51GXV15=0;this.OV51GXV15=0;
this.GXV16=0;this.ZV52GXV16=0;this.OV52GXV16=0;this.GXV17=0;this.ZV53GXV17=0;this.OV53GXV17=0;this.GXV18=0;this.ZV54GXV18=0;this.OV54GXV18=0;this.GXV19=0;this.ZV55GXV19=0;this.OV55GXV19=0;this.GXV20=0;this.ZV56GXV20=0;this.OV56GXV20=0;this.GXV21=0;this.ZV57GXV21=0;this.OV57GXV21=0;this.GXV22=0;this.ZV58GXV22=0;this.OV58GXV22=0;this.GXV23=0;this.ZV59GXV23=0;this.OV59GXV23=0;this.GXV24=0;this.ZV60GXV24=0;this.OV60GXV24=0;this.GXV25=0;this.ZV61GXV25=0;this.OV61GXV25=0;this.GXV26=0;this.ZV62GXV26=0;this.OV62GXV26=0;
this.GXV27=0;this.ZV63GXV27=0;this.OV63GXV27=0;this.GXV28=0;this.ZV64GXV28=0;this.OV64GXV28=0;this.GXV29=0;this.ZV65GXV29=0;this.OV65GXV29=0;this.AV20P_STUDY_ID=0;this.A521TBM02_ORDER=0;this.A522TBM02_DEL_FLG="";this.AV12D_GRD_CHECK=false;this.A516TBM02_DOM_CD="";this.A518TBM02_DOM_JNM="";this.AV34D_GRD_DEL="";this.A886TBM42_STUDY_ID=0;this.A178TBM03_DEL_FLG="";this.A162TBM03_DOM_CD="";this.A163TBM03_DOM_VAR_NM="";this.A164TBM03_VAR_DESC="";this.A165TBM03_SDTM_FLG="";this.A166TBM03_CDASH_FLG="";this.A410TBM03_INPUT_TYPE_DIV="";
this.A167TBM03_REQUIRED_FLG="";this.A602TBM03_SAS_FIELD_NM="";this.A624TBM03_ODM_DATA_TYPE="";this.A168TBM03_NOTE="";this.A169TBM03_ORDER=0;this.A885TBM03_VERSION="";this.A517TBM02_DOM_ENM="";this.A519TBM02_DOM_GRP_NM="";this.A520TBM02_NOTE="";this.A893TBM42_DOM_CD="";this.A887TBM42_DEL_FLG="";this.A186TBM21_STUDY_ID=0;this.A187TBM21_STUDY_NM="";this.A895TBM43_DOM_CD="";this.A894TBM43_STUDY_ID=0;this.A896TBM43_DOM_VAR_NM="";this.AV23W_A821_JS="";this.ServerEvents=["e33112_client","e34112_client","e14112_client","e11112_client","e15112_client","e12112_client","e13112_client","e16112_client","e17112_client","e18112_client","e19112_client","e20112_client","e21112_client","e22112_client","e23112_client","e24112_client","e25112_client","e26112_client","e27112_client","e28112_client","e29112_client","e35112_client","e36112_client"];
this.VarControlMap.AV20P_STUDY_ID={id:"vP_STUDY_ID",grid:0,type:"int"};this.VarControlMap.AV5B402_SD06_STUDY_DOMAIN_C={id:"vB402_SD06_STUDY_DOMAIN_C",grid:0,type:"CollB402_SD06_STUDY_DOMAIN.B402_SD06_STUDY_DOMAINItem"};this.Grid1Container.addRefreshingVar({rfrVar:"AV5B402_SD06_STUDY_DOMAIN_C"});this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],this.GXValidFnc[185],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["MAX_PAGE"],this.GXValidFnc[190],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["REC_CNT"],this.GXValidFnc[195],"AV15H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_NO"],this.GXValidFnc[200],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE01"],this.GXValidFnc[205],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE02"],this.GXValidFnc[210],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE03"],this.GXValidFnc[215],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE04"],this.GXValidFnc[220],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE05"],this.GXValidFnc[225],"AV15H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE06"],this.GXValidFnc[230],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE07"],this.GXValidFnc[235],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE08"],this.GXValidFnc[240],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE09"],this.GXValidFnc[245],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE10"],this.GXValidFnc[250],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP01"],this.GXValidFnc[255],"AV15H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP02"],this.GXValidFnc[260],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP03"],this.GXValidFnc[265],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP04"],this.GXValidFnc[270],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP05"],this.GXValidFnc[275],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP06"],this.GXValidFnc[280],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP07"],this.GXValidFnc[285],"AV15H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP08"],this.GXValidFnc[290],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP09"],this.GXValidFnc[295],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP10"],this.GXValidFnc[300],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_BACK"],this.GXValidFnc[305],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_NEXT"],this.GXValidFnc[310],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_FIRST"],this.GXValidFnc[315],"AV15H_A_PAGING_SDT");
this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_LAST"],this.GXValidFnc[320],"AV15H_A_PAGING_SDT");this.addBCProperty("H_a_paging_sdt",["PAGE_DISP_AREA"],this.GXValidFnc[325],"AV15H_A_PAGING_SDT");this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0169",lvl:1})}b402_wp12_study_domain_list.prototype=new gx.GxObject;gx.setParentObj(new b402_wp12_study_domain_list());