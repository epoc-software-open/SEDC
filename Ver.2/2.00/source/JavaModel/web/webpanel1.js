gx.evt.autoSkip=!1;
gx.define("webpanel1",!1,function(){this.ServerClass="webpanel1";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.skipOnEnter=this.hasEnterEvent=false;this.autoRefresh=true;this.SetStandaloneVars=function(){};this.e112c2_client=function(){this.executeServerEvent("'TEST'",false)};this.e142c2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e152c2_client=function(a){this.executeServerEvent("CANCEL",true,a)};var c=this.GXValidFnc=[];this.GXCtrlIds=
[2,5,7,10,12,19,21,25,28,30,32,36,38,40,45,48];this.GXLastCtrlId=48;var b=this.Grid1Container=new gx.grid.grid(this,3,"WbpLvl3",42,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"webpanel1",[],true,200,true,true,0,false,false,false,"CollB716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem",0,"px","\u884c\u8ffd\u52a0",false,false,false,null,null,false,"AV5B716_SD3_DATA_GRP",false,[1,1,1,1]);b.startRow("","","","","","");b.startCell("","","","","","","","","","");b.addSingleLineEdit("GXV6",45,
"CTLDOM_VAR_NM","","","GXV6","svchar",50,"chr",50,50,"left",null,[],"GXV6","GXV6",true,0,false,false,"Attribute",1,"");b.endCell();b.endRow();b.startRow("","","","","","");b.startCell("","","","","","","","","","");b.addSingleLineEdit("GXV7",48,"CTLCRF_ITEM_GRP_CD","","","GXV7","svchar",50,"chr",50,50,"left",null,[],"GXV7","GXV7",true,0,false,false,"Attribute",1,"");b.endCell();b.endRow();b=this.Grid3Container=new gx.grid.grid(this,2,"WbpLvl2",33,"Grid3","Grid3","Grid3Container",this.CmpContext,this.IsMasterPage,
"webpanel1",[],true,1,true,true,0,false,false,false,"CollB716_SD2_DOM_MAP.B716_SD2_DOM_MAPItem",0,"px","\u884c\u8ffd\u52a0",false,false,false,null,null,false,"AV5B716_SD3_DATA_GRP",false,[1,1,1,1]);b.startRow("","","","","","");b.startCell("","","","","","","100px","","","");b.addSingleLineEdit("GXV2",36,"CTLVISIT_NO1","","","VISIT_NO","int",6,"chr",6,6,"right",null,[],"GXV2","GXV2",true,0,false,false,"Attribute",1,"");b.endCell();b.startCell("","","","","","","100px","","","");b.addSingleLineEdit("GXV3",
38,"CTLDOM_ITM_GRP_OID1","","","DOM_ITM_GRP_OID","svchar",50,"chr",50,50,"left",null,[],"GXV3","GXV3",true,0,false,false,"Attribute",1,"");b.endCell();b.startCell("","","","","","","100px","","","");b.addSingleLineEdit("GXV4",40,"CTLDOM_ITM_GRP_ROWNO1","","","DOM_ITM_GRP_ROWNO","int",4,"chr",4,4,"right",null,[],"GXV4","GXV4",true,0,false,false,"Attribute",1,"");b.endCell();b.startCell("","","","","","","","","","");b.addGrid(this.Grid1Container);b.endCell();b.endRow();this.setGrid(b);c[2]={fld:"TABLE1",
grid:0};c[5]={fld:"TEXTBLOCK2",format:0,grid:0};c[7]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_STUDY_ID",gxz:"ZV7D_STUDY_ID",gxold:"OV7D_STUDY_ID",gxvar:"AV7D_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7D_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.ZV7D_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vD_STUDY_ID",gx.O.AV7D_STUDY_ID,0);typeof this.dom_hdl=="function"&&
this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV7D_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vD_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(7,function(){});c[10]={fld:"TEXTBLOCK1",format:0,grid:0};c[12]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vD_DOM_CD",gxz:"ZV6D_DOM_CD",gxold:"OV6D_DOM_CD",gxvar:"AV6D_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV6D_DOM_CD=
a},v2z:function(a){gx.O.ZV6D_DOM_CD=a},v2c:function(){gx.fn.setControlValue("vD_DOM_CD",gx.O.AV6D_DOM_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.AV6D_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("vD_DOM_CD")},nac:gx.falseFn};this.declareDomainHdlr(12,function(){});c[19]={fld:"TEXTBLOCK5",format:0,grid:0};c[21]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"vW_SEQ_POS",gxz:"ZV8W_SEQ_POS",
gxold:"OV8W_SEQ_POS",gxvar:"AV8W_SEQ_POS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8W_SEQ_POS=gx.num.intval(a)},v2z:function(a){gx.O.ZV8W_SEQ_POS=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("vW_SEQ_POS",gx.O.AV8W_SEQ_POS,0)},c2v:function(){gx.O.AV8W_SEQ_POS=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("vW_SEQ_POS",",")},nac:gx.falseFn};c[25]={fld:"TABLE2",grid:0};c[28]={fld:"TEXTBLOCK3",format:0,grid:0};c[30]={fld:"TEXTBLOCK4",format:0,
grid:0};c[32]={fld:"TEXTBLOCK8",format:0,grid:0};c[36]={lvl:2,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,isacc:0,grid:33,gxgrid:this.Grid3Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLVISIT_NO1",gxz:"ZV12GXV2",gxold:"OV12GXV2",gxvar:"GXV2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV2=gx.num.intval(a)},v2z:function(a){gx.O.ZV12GXV2=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("CTLVISIT_NO1",a||gx.fn.currentGridRowImpl(33),gx.O.GXV2,
0)},c2v:function(){gx.O.GXV2=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("CTLVISIT_NO1",a||gx.fn.currentGridRowImpl(33),",")},nac:gx.falseFn};c[38]={lvl:2,type:"svchar",len:50,dec:0,sign:false,ro:1,isacc:0,grid:33,gxgrid:this.Grid3Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLDOM_ITM_GRP_OID1",gxz:"ZV13GXV3",gxold:"OV13GXV3",gxvar:"GXV3",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.GXV3=a},v2z:function(a){gx.O.ZV13GXV3=
a},v2c:function(a){gx.fn.setGridControlValue("CTLDOM_ITM_GRP_OID1",a||gx.fn.currentGridRowImpl(33),gx.O.GXV3,0)},c2v:function(){gx.O.GXV3=this.val()},val:function(a){return gx.fn.getGridControlValue("CTLDOM_ITM_GRP_OID1",a||gx.fn.currentGridRowImpl(33))},nac:gx.falseFn};c[40]={lvl:2,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:1,isacc:0,grid:33,gxgrid:this.Grid3Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLDOM_ITM_GRP_ROWNO1",gxz:"ZV14GXV4",gxold:"OV14GXV4",gxvar:"GXV4",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.GXV4=gx.num.intval(a)},v2z:function(a){gx.O.ZV14GXV4=gx.num.intval(a)},v2c:function(a){gx.fn.setGridControlValue("CTLDOM_ITM_GRP_ROWNO1",a||gx.fn.currentGridRowImpl(33),gx.O.GXV4,0)},c2v:function(){gx.O.GXV4=gx.num.intval(this.val())},val:function(a){return gx.fn.getGridIntegerValue("CTLDOM_ITM_GRP_ROWNO1",a||gx.fn.currentGridRowImpl(33),",")},nac:gx.falseFn};c[45]={lvl:3,type:"svchar",len:50,dec:0,sign:false,ro:1,isacc:0,grid:42,gxgrid:this.Grid1Container,
fnc:null,isvalid:null,rgrid:[],fld:"CTLDOM_VAR_NM",gxz:"ZV16GXV6",gxold:"OV16GXV6",gxvar:"GXV6",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.GXV6=a},v2z:function(a){gx.O.ZV16GXV6=a},v2c:function(a){gx.fn.setGridControlValue("CTLDOM_VAR_NM",a||gx.fn.currentGridRowImpl(42),gx.O.GXV6,0)},c2v:function(){gx.O.GXV6=this.val()},val:function(a){return gx.fn.getGridControlValue("CTLDOM_VAR_NM",a||gx.fn.currentGridRowImpl(42))},nac:gx.falseFn};c[48]={lvl:3,
type:"svchar",len:50,dec:0,sign:false,ro:1,isacc:0,grid:42,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"CTLCRF_ITEM_GRP_CD",gxz:"ZV17GXV7",gxold:"OV17GXV7",gxvar:"GXV7",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.GXV7=a},v2z:function(a){gx.O.ZV17GXV7=a},v2c:function(a){gx.fn.setGridControlValue("CTLCRF_ITEM_GRP_CD",a||gx.fn.currentGridRowImpl(42),gx.O.GXV7,0)},c2v:function(){gx.O.GXV7=this.val()},val:function(a){return gx.fn.getGridControlValue("CTLCRF_ITEM_GRP_CD",
a||gx.fn.currentGridRowImpl(42))},nac:gx.falseFn};this.OV7D_STUDY_ID=this.ZV7D_STUDY_ID=this.AV7D_STUDY_ID=0;this.OV6D_DOM_CD=this.ZV6D_DOM_CD=this.AV6D_DOM_CD="";this.OV12GXV2=this.ZV12GXV2=this.OV8W_SEQ_POS=this.ZV8W_SEQ_POS=this.AV8W_SEQ_POS=0;this.OV13GXV3=this.ZV13GXV3="";this.OV14GXV4=this.ZV14GXV4=0;this.OV17GXV7=this.ZV17GXV7=this.OV16GXV6=this.ZV16GXV6="";this.AV7D_STUDY_ID=0;this.AV6D_DOM_CD="";this.GXV2=this.AV8W_SEQ_POS=0;this.GXV3="";this.GXV4=0;this.GXV7=this.GXV6="";this.Events={e112c2_client:["'TEST'",
true],e142c2_client:["ENTER",true],e152c2_client:["CANCEL",true]};this.addGridBCProperty("B716_sd3_data_grp",["VISIT_NO"],this.GXValidFnc[36],"AV5B716_SD3_DATA_GRP");this.addGridBCProperty("B716_sd3_data_grp",["DOM_ITM_GRP_OID"],this.GXValidFnc[38],"AV5B716_SD3_DATA_GRP");this.addGridBCProperty("B716_sd3_data_grp",["DOM_ITM_GRP_ROWNO"],this.GXValidFnc[40],"AV5B716_SD3_DATA_GRP");this.addGridBCProperty("B716_sd3_data_grp",["DOM_VAR","DOM_VAR_NM"],this.GXValidFnc[45],"AV5B716_SD3_DATA_GRP");this.addGridBCProperty("B716_sd3_data_grp",
["DOM_VAR","CRF_ITEM_GRP_CD"],this.GXValidFnc[48],"AV5B716_SD3_DATA_GRP");this.InitStandaloneVars()});gx.setParentObj(new webpanel1);