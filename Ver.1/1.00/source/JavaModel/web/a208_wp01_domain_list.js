gx.evt.autoSkip=false;function a208_wp01_domain_list(){this.ServerClass="A208_WP01_DOMAIN_LIST";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=false;this.addKeyListener("3","e111p2_client");this.addKeyListener("4","e121p2_client");this.addKeyListener("5","e131p2_client");this.addKeyListener("6","e141p2_client");this.addKeyListener("7","e151p2_client");this.addKeyListener("8","e161p2_client");this.SetStandaloneVars=function(){this.AV20P_MOVE_KBN=gx.fn.getIntegerValue("vP_MOVE_KBN",",")
};this.s252_client=function(){gx.fn.setCtrlProperty("vD_LINE","Backcolor",gx.color.rgb(255,255,255))};this.s152_client=function(){};this.s172_client=function(){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption","<script language=javascript>");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"var confirmFlg = false;");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (window.addEventListener) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"  window.addEventListener('load', function(){init();}, false);");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"} else if (window.attachEvent) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"	window.attachEvent('onload',function(){init();});");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function init() {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");
gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"function proc() {");if(!(""==this.AV23W_A821_JS)){gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"if (!confirmFlg) {");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+this.AV23W_A821_JS);gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = true;")
}else{gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"confirmFlg = false;")}gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"}");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"timerID = setTimeout('proc()', 10);");gx.fn.setCtrlProperty("TXT_JS_EVENT","Caption",gx.fn.getCtrlProperty("TXT_JS_EVENT","Caption")+"<\/script>")};this.s202_client=function(){this.s252_client()
};this.e111p2_client=function(){this.executeServerEvent("'BTN_REG'",true)};this.e121p2_client=function(){this.executeServerEvent("'BTN_CSV'",true)};this.e131p2_client=function(){this.executeServerEvent("'BTN_SRCH'",true)};this.e141p2_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e151p2_client=function(){this.executeServerEvent("'BTN_EDIT'",true)};this.e161p2_client=function(){this.executeServerEvent("'BTN_IMPORT_DOMAIN'",true)};this.e341p2_client=function(){this.executeServerEvent("'BTN_SEL'",true,arguments[0])
};this.e351p2_client=function(){this.executeServerEvent("'BTN_CDISC_ITEM'",true,arguments[0])};this.e171p2_client=function(){this.executeServerEvent("'PAGE_FIRST'",true)};this.e181p2_client=function(){this.executeServerEvent("'PAGE_LAST'",true)};this.e191p2_client=function(){this.executeServerEvent("'PAGE_BACK'",true)};this.e201p2_client=function(){this.executeServerEvent("'PAGE_NEXT'",true)};this.e211p2_client=function(){this.executeServerEvent("'PAGE01'",true)};this.e221p2_client=function(){this.executeServerEvent("'PAGE02'",true)
};this.e231p2_client=function(){this.executeServerEvent("'PAGE03'",true)};this.e241p2_client=function(){this.executeServerEvent("'PAGE04'",true)};this.e251p2_client=function(){this.executeServerEvent("'PAGE05'",true)};this.e261p2_client=function(){this.executeServerEvent("'PAGE06'",true)};this.e271p2_client=function(){this.executeServerEvent("'PAGE07'",true)};this.e281p2_client=function(){this.executeServerEvent("'PAGE08'",true)};this.e291p2_client=function(){this.executeServerEvent("'PAGE09'",true)
};this.e301p2_client=function(){this.executeServerEvent("'PAGE10'",true)};this.e361p2_client=function(){this.executeServerEvent("ENTER",true,arguments[0])};this.e371p2_client=function(){this.executeServerEvent("CANCEL",true,arguments[0])};this.GXValidFnc=[];this.GXCtrlIds=[2,6,12,15,16,19,22,25,28,31,35,38,41,44,47,53,56,59,62,65,68,71,74,77,80,83,86,89,92,95,98,101,104,107,110,113,116,119,122,125,128,131,134,137,140,143,145,148,150,153,158,161,165,167,169,171,173,180,182,184,186,188,190,192,199,202,203,204,205,206,207,208,211,213];
this.GXLastCtrlId=213;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",177,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"a208_wp01_domain_list",[],true,1,true,true,10,false,false,false,"",0,"px","行追加",true,false,true,null,null,false,"");this.Grid1Container.startRow("","","","","","");this.Grid1Container.startCell("","center","","","","","45px","","","");this.Grid1Container.addTextBlock("BTN_SEL","e341p2_client");this.Grid1Container.endCell();this.Grid1Container.startCell("","right","","","","","50px","","","");
this.Grid1Container.addSingleLineEdit("D_grd_line",182,"vD_GRD_LINE","","","D_GRD_LINE","int",4,"chr",4,4,"right",null,[],"D_grd_line","D_GRD_LINE",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","85px","","","");this.Grid1Container.addSingleLineEdit(516,184,"TBM02_DOM_CD","","","TBM02_DOM_CD","svchar",2,"chr",2,2,"left",null,[],516,"TBM02_DOM_CD",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","","","","","","370px","","","");
this.Grid1Container.addSingleLineEdit(518,186,"TBM02_DOM_JNM","","","TBM02_DOM_JNM","svchar",50,"chr",50,50,"left",null,[],518,"TBM02_DOM_JNM",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","right","","","","","50px","","","");this.Grid1Container.addSingleLineEdit(521,188,"TBM02_ORDER","","","TBM02_ORDER","int",5,"chr",5,5,"right",null,[],521,"TBM02_ORDER",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","100px","","","");
this.Grid1Container.addSingleLineEdit("D_grd_del",190,"vD_GRD_DEL","","","D_GRD_DEL","svchar",10,"chr",10,10,"left",null,[],"D_grd_del","D_GRD_DEL",true,0,false,false);this.Grid1Container.endCell();this.Grid1Container.startCell("","center","","","","","90px","","","");this.Grid1Container.addTextBlock("BTN_CDISC_ITEM","e351p2_client");this.Grid1Container.endCell();this.Grid1Container.endRow();this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[6]={fld:"TABLE2",grid:0};
this.GXValidFnc[12]={fld:"TABLE8",grid:0};this.GXValidFnc[15]={fld:"TXT_BTN_REG",format:0,grid:0};this.GXValidFnc[16]={fld:"TXT_BTN_REG2",format:0,grid:0};this.GXValidFnc[19]={fld:"TEXTBLOCK43",format:0,grid:0};this.GXValidFnc[22]={fld:"TEXTBLOCK46",format:0,grid:0};this.GXValidFnc[25]={fld:"TABLE3",grid:0};this.GXValidFnc[28]={fld:"TABLE4",grid:0};this.GXValidFnc[31]={fld:"TABLE5",grid:0};this.GXValidFnc[35]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_DOM_CD",gxz:"ZV7D_DOM_CD",gxold:"OV7D_DOM_CD",gxvar:"AV7D_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7D_DOM_CD=a
},v2z:function(a){gx.O.ZV7D_DOM_CD=a},v2c:function(){gx.fn.setControlValue("vD_DOM_CD",gx.O.AV7D_DOM_CD,0)},c2v:function(){gx.O.AV7D_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_CD")},nac:function(){return false}};this.GXValidFnc[38]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_DOM_JNM",gxz:"ZV8D_DOM_JNM",gxold:"OV8D_DOM_JNM",gxvar:"AV8D_DOM_JNM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8D_DOM_JNM=a
},v2z:function(a){gx.O.ZV8D_DOM_JNM=a},v2c:function(){gx.fn.setControlValue("vD_DOM_JNM",gx.O.AV8D_DOM_JNM,0)},c2v:function(){gx.O.AV8D_DOM_JNM=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_JNM")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TABLE9",grid:0};this.GXValidFnc[44]={fld:"TEXTBLOCK45",format:0,grid:0};this.GXValidFnc[47]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[53]={fld:"TBL_PAGE_AREA",grid:0};this.GXValidFnc[56]={fld:"TXT_REC_CNT",format:0,grid:0};
this.GXValidFnc[59]={fld:"TBL_PAGE",grid:0};this.GXValidFnc[62]={fld:"TBL_FIRST",grid:0};this.GXValidFnc[65]={fld:"TXT_FIRST",format:0,grid:0};this.GXValidFnc[68]={fld:"TBL_BACK",grid:0};this.GXValidFnc[71]={fld:"TXT_BACK",format:0,grid:0};this.GXValidFnc[74]={fld:"TBL_PAGE01",grid:0};this.GXValidFnc[77]={fld:"TXT_PAGE01",format:0,grid:0};this.GXValidFnc[80]={fld:"TBL_PAGE02",grid:0};this.GXValidFnc[83]={fld:"TXT_PAGE02",format:0,grid:0};this.GXValidFnc[86]={fld:"TBL_PAGE03",grid:0};this.GXValidFnc[89]={fld:"TXT_PAGE03",format:0,grid:0};
this.GXValidFnc[92]={fld:"TBL_PAGE04",grid:0};this.GXValidFnc[95]={fld:"TXT_PAGE04",format:0,grid:0};this.GXValidFnc[98]={fld:"TBL_PAGE05",grid:0};this.GXValidFnc[101]={fld:"TXT_PAGE05",format:0,grid:0};this.GXValidFnc[104]={fld:"TBL_PAGE06",grid:0};this.GXValidFnc[107]={fld:"TXT_PAGE06",format:0,grid:0};this.GXValidFnc[110]={fld:"TBL_PAGE07",grid:0};this.GXValidFnc[113]={fld:"TXT_PAGE07",format:0,grid:0};this.GXValidFnc[116]={fld:"TBL_PAGE08",grid:0};this.GXValidFnc[119]={fld:"TXT_PAGE08",format:0,grid:0};
this.GXValidFnc[122]={fld:"TBL_PAGE09",grid:0};this.GXValidFnc[125]={fld:"TXT_PAGE09",format:0,grid:0};this.GXValidFnc[128]={fld:"TBL_PAGE10",grid:0};this.GXValidFnc[131]={fld:"TXT_PAGE10",format:0,grid:0};this.GXValidFnc[134]={fld:"TBL_NEXT",grid:0};this.GXValidFnc[137]={fld:"TXT_NEXT",format:0,grid:0};this.GXValidFnc[140]={fld:"TBL_LAST",grid:0};this.GXValidFnc[143]={fld:"TXT_LAST",format:0,grid:0};this.GXValidFnc[145]={fld:"TBL_EDIT",grid:0};this.GXValidFnc[148]={fld:"TEXTBLOCK29",format:0,grid:0};
this.GXValidFnc[150]={lvl:0,type:"char",len:4,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vD_LINE",gxz:"ZV13D_LINE",gxold:"OV13D_LINE",gxvar:"AV13D_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV13D_LINE=a},v2z:function(a){gx.O.ZV13D_LINE=a},v2c:function(){gx.fn.setControlValue("vD_LINE",gx.O.AV13D_LINE,0)},c2v:function(){gx.O.AV13D_LINE=this.val()},val:function(){return gx.fn.getControlValue("vD_LINE")},nac:function(){return false}};this.GXValidFnc[153]={fld:"TEXTBLOCK28",format:0,grid:0};
this.GXValidFnc[158]={fld:"TBL_GRID_HEADER",grid:0};this.GXValidFnc[161]={fld:"TBL_IN_GRID_HEADER",grid:0};this.GXValidFnc[165]={fld:"TEXTBLOCK35",format:0,grid:0};this.GXValidFnc[167]={fld:"TEXTBLOCK30",format:0,grid:0};this.GXValidFnc[169]={fld:"TEXTBLOCK31",format:0,grid:0};this.GXValidFnc[171]={fld:"TEXTBLOCK34",format:0,grid:0};this.GXValidFnc[173]={fld:"TEXTBLOCK33",format:0,grid:0};this.GXValidFnc[180]={fld:"BTN_SEL",format:0,grid:177};this.GXValidFnc[182]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:177,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vD_GRD_LINE",gxz:"ZV10D_GRD_LINE",gxold:"OV10D_GRD_LINE",gxvar:"AV10D_GRD_LINE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10D_GRD_LINE=gx.num.intval(a)
},v2z:function(a){gx.O.ZV10D_GRD_LINE=gx.num.intval(a)},v2c:function(){gx.fn.setGridControlValue("vD_GRD_LINE",gx.fn.currentGridRowImpl(177),gx.O.AV10D_GRD_LINE,0)},c2v:function(){gx.O.AV10D_GRD_LINE=this.val()},val:function(){return gx.fn.getGridIntegerValue("vD_GRD_LINE",gx.fn.currentGridRowImpl(177),",")},nac:function(){return false}};this.GXValidFnc[184]={lvl:2,type:"svchar",len:2,dec:0,sign:false,ro:1,grid:177,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM02_DOM_CD",gxz:"Z516TBM02_DOM_CD",gxold:"O516TBM02_DOM_CD",gxvar:"A516TBM02_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A516TBM02_DOM_CD=a
},v2z:function(a){gx.O.Z516TBM02_DOM_CD=a},v2c:function(){gx.fn.setGridControlValue("TBM02_DOM_CD",gx.fn.currentGridRowImpl(177),gx.O.A516TBM02_DOM_CD,0)},c2v:function(){gx.O.A516TBM02_DOM_CD=this.val()},val:function(){return gx.fn.getGridControlValue("TBM02_DOM_CD",gx.fn.currentGridRowImpl(177))},nac:function(){return false}};this.GXValidFnc[186]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:1,grid:177,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TBM02_DOM_JNM",gxz:"Z518TBM02_DOM_JNM",gxold:"O518TBM02_DOM_JNM",gxvar:"A518TBM02_DOM_JNM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A518TBM02_DOM_JNM=a
},v2z:function(a){gx.O.Z518TBM02_DOM_JNM=a},v2c:function(){gx.fn.setGridControlValue("TBM02_DOM_JNM",gx.fn.currentGridRowImpl(177),gx.O.A518TBM02_DOM_JNM,0)},c2v:function(){gx.O.A518TBM02_DOM_JNM=this.val()},val:function(){return gx.fn.getGridControlValue("TBM02_DOM_JNM",gx.fn.currentGridRowImpl(177))},nac:function(){return false}};this.GXValidFnc[188]={lvl:2,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:1,grid:177,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TBM02_ORDER",gxz:"Z521TBM02_ORDER",gxold:"O521TBM02_ORDER",gxvar:"A521TBM02_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A521TBM02_ORDER=gx.num.intval(a)
},v2z:function(a){gx.O.Z521TBM02_ORDER=gx.num.intval(a)},v2c:function(){gx.fn.setGridControlValue("TBM02_ORDER",gx.fn.currentGridRowImpl(177),gx.O.A521TBM02_ORDER,0)},c2v:function(){gx.O.A521TBM02_ORDER=this.val()},val:function(){return gx.fn.getGridIntegerValue("TBM02_ORDER",gx.fn.currentGridRowImpl(177),",")},nac:function(){return false}};this.GXValidFnc[190]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:177,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vD_GRD_DEL",gxz:"ZV9D_GRD_DEL",gxold:"OV9D_GRD_DEL",gxvar:"AV9D_GRD_DEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9D_GRD_DEL=a
},v2z:function(a){gx.O.ZV9D_GRD_DEL=a},v2c:function(){gx.fn.setGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(177),gx.O.AV9D_GRD_DEL,0)},c2v:function(){gx.O.AV9D_GRD_DEL=this.val()},val:function(){return gx.fn.getGridControlValue("vD_GRD_DEL",gx.fn.currentGridRowImpl(177))},nac:function(){return false}};this.GXValidFnc[192]={fld:"BTN_CDISC_ITEM",format:0,grid:177};this.GXValidFnc[199]={fld:"TBL_HIDDEN",grid:0};this.GXValidFnc[202]={fld:"TXT_JS_EVENT",format:1,grid:0};this.GXValidFnc[203]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_INIT_FLG",gxz:"ZV17H_INIT_FLG",gxold:"OV17H_INIT_FLG",gxvar:"AV17H_INIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV17H_INIT_FLG=a
},v2z:function(a){gx.O.ZV17H_INIT_FLG=a},v2c:function(){gx.fn.setControlValue("vH_INIT_FLG",gx.O.AV17H_INIT_FLG,0)},c2v:function(){gx.O.AV17H_INIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_INIT_FLG")},nac:function(){return false}};this.GXValidFnc[204]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_SRCH_FLG",gxz:"ZV19H_SRCH_FLG",gxold:"OV19H_SRCH_FLG",gxvar:"AV19H_SRCH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV19H_SRCH_FLG=a
},v2z:function(a){gx.O.ZV19H_SRCH_FLG=a},v2c:function(){gx.fn.setControlValue("vH_SRCH_FLG",gx.O.AV19H_SRCH_FLG,0)},c2v:function(){gx.O.AV19H_SRCH_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_SRCH_FLG")},nac:function(){return false}};this.GXValidFnc[205]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_DOM_CD",gxz:"ZV15H_DOM_CD",gxold:"OV15H_DOM_CD",gxvar:"AV15H_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV15H_DOM_CD=a
},v2z:function(a){gx.O.ZV15H_DOM_CD=a},v2c:function(){gx.fn.setControlValue("vH_DOM_CD",gx.O.AV15H_DOM_CD,0)},c2v:function(){gx.O.AV15H_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_CD")},nac:function(){return false}};this.GXValidFnc[206]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_DOM_JNM",gxz:"ZV16H_DOM_JNM",gxold:"OV16H_DOM_JNM",gxvar:"AV16H_DOM_JNM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV16H_DOM_JNM=a
},v2z:function(a){gx.O.ZV16H_DOM_JNM=a},v2c:function(){gx.fn.setControlValue("vH_DOM_JNM",gx.O.AV16H_DOM_JNM,0)},c2v:function(){gx.O.AV16H_DOM_JNM=this.val()},val:function(){return gx.fn.getControlValue("vH_DOM_JNM")},nac:function(){return false}};this.GXValidFnc[207]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"vH_KNGN_FLG",gxz:"ZV18H_KNGN_FLG",gxold:"OV18H_KNGN_FLG",gxvar:"AV18H_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV18H_KNGN_FLG=a
},v2z:function(a){gx.O.ZV18H_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vH_KNGN_FLG",gx.O.AV18H_KNGN_FLG,0)},c2v:function(){gx.O.AV18H_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vH_KNGN_FLG")},nac:function(){return false}};this.GXValidFnc[208]={fld:"TABLE7",grid:0};this.GXValidFnc[211]={fld:"TEXTBLOCK1",format:0,grid:0};this.GXValidFnc[213]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"CTLMAX_ROW",gxz:"ZV34GXV1",gxold:"OV34GXV1",gxvar:"GXV1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.GXV1=gx.num.intval(a)
},v2z:function(a){gx.O.ZV34GXV1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("CTLMAX_ROW",gx.O.GXV1,0)},c2v:function(){gx.O.GXV1=this.val()},val:function(){return gx.fn.getIntegerValue("CTLMAX_ROW",",")},nac:function(){return false}};this.AV7D_DOM_CD="";this.ZV7D_DOM_CD="";this.OV7D_DOM_CD="";this.AV8D_DOM_JNM="";this.ZV8D_DOM_JNM="";this.OV8D_DOM_JNM="";this.AV13D_LINE="";this.ZV13D_LINE="";this.OV13D_LINE="";this.ZV10D_GRD_LINE=0;this.OV10D_GRD_LINE=0;this.Z516TBM02_DOM_CD="";this.O516TBM02_DOM_CD="";
this.Z518TBM02_DOM_JNM="";this.O518TBM02_DOM_JNM="";this.Z521TBM02_ORDER=0;this.O521TBM02_ORDER=0;this.ZV9D_GRD_DEL="";this.OV9D_GRD_DEL="";this.AV17H_INIT_FLG="";this.ZV17H_INIT_FLG="";this.OV17H_INIT_FLG="";this.AV19H_SRCH_FLG="";this.ZV19H_SRCH_FLG="";this.OV19H_SRCH_FLG="";this.AV15H_DOM_CD="";this.ZV15H_DOM_CD="";this.OV15H_DOM_CD="";this.AV16H_DOM_JNM="";this.ZV16H_DOM_JNM="";this.OV16H_DOM_JNM="";this.AV18H_KNGN_FLG="";this.ZV18H_KNGN_FLG="";this.OV18H_KNGN_FLG="";this.GXV1=0;this.ZV34GXV1=0;
this.OV34GXV1=0;this.AV20P_MOVE_KBN=0;this.A522TBM02_DEL_FLG="";this.AV10D_GRD_LINE=0;this.A516TBM02_DOM_CD="";this.A518TBM02_DOM_JNM="";this.A521TBM02_ORDER=0;this.AV9D_GRD_DEL="";this.AV23W_A821_JS="";this.ServerEvents=["e111p2_client","e121p2_client","e131p2_client","e141p2_client","e151p2_client","e161p2_client","e341p2_client","e351p2_client","e171p2_client","e181p2_client","e191p2_client","e201p2_client","e211p2_client","e221p2_client","e231p2_client","e241p2_client","e251p2_client","e261p2_client","e271p2_client","e281p2_client","e291p2_client","e301p2_client","e361p2_client","e371p2_client"];
this.VarControlMap.AV20P_MOVE_KBN={id:"vP_MOVE_KBN",grid:0,type:"int"};this.VarControlMap.A522TBM02_DEL_FLG={id:"TBM02_DEL_FLG",grid:0,type:"svchar"};this.VarControlMap.AV26W_F7FLG={id:"vW_F7FLG",grid:0,type:"boolean"};this.Grid1Container.addRefreshingVar(this.GXValidFnc[204]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[205]);this.Grid1Container.addRefreshingVar(this.GXValidFnc[206]);this.Grid1Container.addRefreshingVar({rfrVar:"A522TBM02_DEL_FLG"});this.Grid1Container.addRefreshingVar({rfrVar:"AV26W_F7FLG"});
this.addBCProperty("H_a_paging_sdt",["MAX_ROW"],this.GXValidFnc[213],"AV14H_A_PAGING_SDT");this.SetStandaloneVars();this.setComponent({id:"WEBCOMP1",GXClass:null,Prefix:"W0009",lvl:1});this.setComponent({id:"WEBCOMP2",GXClass:null,Prefix:"W0197",lvl:1})}a208_wp01_domain_list.prototype=new gx.GxObject;gx.setParentObj(new a208_wp01_domain_list());