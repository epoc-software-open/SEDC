gx.evt.autoSkip=!1;
gx.define("tam05_sel",!1,function(){this.ServerClass="tam05_sel";this.PackageName="";this.setObjectType("web");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.autoRefresh=true;this.SetStandaloneVars=function(){this.AV13pTAM04_KNGN_PTN_KBN=gx.fn.getControlValue("vPTAM04_KNGN_PTN_KBN");this.AV14pTAM03_APP_ID=gx.fn.getControlValue("vPTAM03_APP_ID")};this.Validv_Ctam05_crt_datetime=function(){try{var a=gx.util.balloon.getNew("vCTAM05_CRT_DATETIME");this.AnyError=
0;if(!((new gx.date.gxdate("")).compare(this.AV10cTAM05_CRT_DATETIME)==0||(new gx.date.gxdate(this.AV10cTAM05_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000cTAM05_CRT_DATETIME \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.e132a2_client=function(a){this.executeServerEvent("ENTER",true,a)};this.e142a1_client=function(){this.executeServerEvent("CANCEL",
true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,8,9,12,14,17,19,22,24,27,29,32,34,37,39,42,44,47,48,52,53,54,55,56,57,58,59,60,63];this.GXLastCtrlId=63;var c=this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",51,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"tam05_sel",[],false,1,false,true,10,true,false,false,"",0,"px","\u884c\u8ffd\u52a0",true,false,false,null,null,false,"",false,[1,1,1,1]);c.addBitmap("&Linkselection","vLINKSELECTION",52,0,"px",17,"px",null,"","","Image",
"");c.addSingleLineEdit(13,53,"TAM04_AUTH_CD","\u6a29\u9650\u30d1\u30bf\u30fc\u30f3\u533a\u5206","","TAM04_AUTH_CD","svchar",0,"px",2,2,"left",null,[],13,"TAM04_AUTH_CD",true,0,false,false,"Attribute",1,"");c.addSingleLineEdit(12,54,"TAM03_APP_ID","\u30a2\u30d7\u30ea\u30b1\u30fc\u30b7\u30e7\u30f3ID","","TAM03_APP_ID","svchar",0,"px",7,7,"left",null,[],12,"TAM03_APP_ID",true,0,false,false,"Attribute",1,"");c.addSingleLineEdit(288,55,"TAM05_KNGN_FLG","\u6a29\u9650\u30d5\u30e9\u30b0","\u9078\u629e",
"TAM05_KNGN_FLG","svchar",0,"px",1,1,"left",null,[],288,"TAM05_KNGN_FLG",true,0,false,false,"Attribute",1,"");c.addSingleLineEdit(289,56,"TAM05_DEL_FLG","\u524a\u9664\u30d5\u30e9\u30b0","","TAM05_DEL_FLG","svchar",0,"px",1,1,"left",null,[],289,"TAM05_DEL_FLG",true,0,false,false,"Attribute",1,"");c.addSingleLineEdit(290,57,"TAM05_CRT_DATETIME","\u4f5c\u6210\u65e5\u6642","","TAM05_CRT_DATETIME","dtime",0,"px",19,19,"right",null,[],290,"TAM05_CRT_DATETIME",true,8,false,false,"Attribute",1,"");c.addSingleLineEdit(291,
58,"TAM05_CRT_USER_ID","\u4f5c\u6210\u30e6\u30fc\u30b6\u30fcID","","TAM05_CRT_USER_ID","svchar",0,"px",128,80,"left",null,[],291,"TAM05_CRT_USER_ID",true,0,false,false,"Attribute",1,"");c.addSingleLineEdit(293,59,"TAM05_UPD_DATETIME","\u66f4\u65b0\u65e5\u6642","","TAM05_UPD_DATETIME","dtime",0,"px",19,19,"right",null,[],293,"TAM05_UPD_DATETIME",true,8,false,false,"Attribute",1,"");c.addSingleLineEdit(294,60,"TAM05_UPD_USER_ID","\u66f4\u65b0\u30e6\u30fc\u30b6\u30fcID","","TAM05_UPD_USER_ID","svchar",
0,"px",128,80,"left",null,[],294,"TAM05_UPD_USER_ID",true,0,false,false,"Attribute",1,"");this.setGrid(c);b[2]={fld:"TABLE1",grid:0};b[8]={fld:"GROUP1",grid:0};b[9]={fld:"TABLE2",grid:0};b[12]={fld:"TEXTBLOCKTAM04_KNGN_PTN_KBN",format:0,grid:0};b[14]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM04_KNGN_PTN_KBN",gxz:"ZV6cTAM04_KNGN_PTN_KBN",gxold:"OV6cTAM04_KNGN_PTN_KBN",gxvar:"AV6cTAM04_KNGN_PTN_KBN",ucs:[],op:[],ip:[],
nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV6cTAM04_KNGN_PTN_KBN=a},v2z:function(a){gx.O.ZV6cTAM04_KNGN_PTN_KBN=a},v2c:function(){gx.fn.setControlValue("vCTAM04_KNGN_PTN_KBN",gx.O.AV6cTAM04_KNGN_PTN_KBN,0)},c2v:function(){gx.O.AV6cTAM04_KNGN_PTN_KBN=this.val()},val:function(){return gx.fn.getControlValue("vCTAM04_KNGN_PTN_KBN")},nac:gx.falseFn};b[17]={fld:"TEXTBLOCKTAM03_APP_ID",format:0,grid:0};b[19]={lvl:0,type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],
fld:"vCTAM03_APP_ID",gxz:"ZV7cTAM03_APP_ID",gxold:"OV7cTAM03_APP_ID",gxvar:"AV7cTAM03_APP_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV7cTAM03_APP_ID=a},v2z:function(a){gx.O.ZV7cTAM03_APP_ID=a},v2c:function(){gx.fn.setControlValue("vCTAM03_APP_ID",gx.O.AV7cTAM03_APP_ID,0)},c2v:function(){gx.O.AV7cTAM03_APP_ID=this.val()},val:function(){return gx.fn.getControlValue("vCTAM03_APP_ID")},nac:gx.falseFn};b[22]={fld:"TEXTBLOCKTAM05_KNGN_FLG",format:0,grid:0};b[24]={lvl:0,type:"svchar",
len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM05_KNGN_FLG",gxz:"ZV8cTAM05_KNGN_FLG",gxold:"OV8cTAM05_KNGN_FLG",gxvar:"AV8cTAM05_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV8cTAM05_KNGN_FLG=a},v2z:function(a){gx.O.ZV8cTAM05_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("vCTAM05_KNGN_FLG",gx.O.AV8cTAM05_KNGN_FLG,0)},c2v:function(){gx.O.AV8cTAM05_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("vCTAM05_KNGN_FLG")},
nac:gx.falseFn};b[27]={fld:"TEXTBLOCKTAM05_DEL_FLG",format:0,grid:0};b[29]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM05_DEL_FLG",gxz:"ZV9cTAM05_DEL_FLG",gxold:"OV9cTAM05_DEL_FLG",gxvar:"AV9cTAM05_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV9cTAM05_DEL_FLG=a},v2z:function(a){gx.O.ZV9cTAM05_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("vCTAM05_DEL_FLG",gx.O.AV9cTAM05_DEL_FLG,0)},
c2v:function(){gx.O.AV9cTAM05_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("vCTAM05_DEL_FLG")},nac:gx.falseFn};b[32]={fld:"TEXTBLOCKTAM05_CRT_DATETIME",format:0,grid:0};b[34]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Validv_Ctam05_crt_datetime,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM05_CRT_DATETIME",gxz:"ZV10cTAM05_CRT_DATETIME",gxold:"OV10cTAM05_CRT_DATETIME",gxvar:"AV10cTAM05_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",
dec:8},ucs:[],op:[34],ip:[34],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV10cTAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.ZV10cTAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("vCTAM05_CRT_DATETIME",gx.O.AV10cTAM05_CRT_DATETIME,0)},c2v:function(){gx.O.AV10cTAM05_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("vCTAM05_CRT_DATETIME")},nac:gx.falseFn};b[37]={fld:"TEXTBLOCKTAM05_CRT_USER_ID",format:0,
grid:0};b[39]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM05_CRT_USER_ID",gxz:"ZV11cTAM05_CRT_USER_ID",gxold:"OV11cTAM05_CRT_USER_ID",gxvar:"AV11cTAM05_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV11cTAM05_CRT_USER_ID=a},v2z:function(a){gx.O.ZV11cTAM05_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("vCTAM05_CRT_USER_ID",gx.O.AV11cTAM05_CRT_USER_ID,0)},c2v:function(){gx.O.AV11cTAM05_CRT_USER_ID=
this.val()},val:function(){return gx.fn.getControlValue("vCTAM05_CRT_USER_ID")},nac:gx.falseFn};b[42]={fld:"TEXTBLOCKTAM05_CRT_PROG_NM",format:0,grid:0};b[44]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[this.Grid1Container],fld:"vCTAM05_CRT_PROG_NM",gxz:"ZV12cTAM05_CRT_PROG_NM",gxold:"OV12cTAM05_CRT_PROG_NM",gxvar:"AV12cTAM05_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV12cTAM05_CRT_PROG_NM=a},v2z:function(a){gx.O.ZV12cTAM05_CRT_PROG_NM=
a},v2c:function(){gx.fn.setControlValue("vCTAM05_CRT_PROG_NM",gx.O.AV12cTAM05_CRT_PROG_NM,0)},c2v:function(){gx.O.AV12cTAM05_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("vCTAM05_CRT_PROG_NM")},nac:gx.falseFn};b[47]={fld:"GROUP2",grid:0};b[48]={fld:"TABLE3",grid:0};b[52]={lvl:2,type:"bits",len:1024,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.AV5LinkSelection=a},v2z:function(a){gx.O.ZV5LinkSelection=a},v2c:function(a){gx.fn.setGridMultimediaValue("vLINKSELECTION",a||gx.fn.currentGridRowImpl(51),gx.O.AV5LinkSelection,gx.O.AV17Linkselection_GXI)},c2v:function(){gx.O.AV17Linkselection_GXI=this.val_GXI();gx.O.AV5LinkSelection=this.val()},val:function(a){return gx.fn.getGridControlValue("vLINKSELECTION",a||gx.fn.currentGridRowImpl(51))},val_GXI:function(a){return gx.fn.getGridControlValue("vLINKSELECTION_GXI",
a||gx.fn.currentGridRowImpl(51))},gxvar_GXI:"AV17Linkselection_GXI",nac:gx.falseFn};b[53]={lvl:2,type:"svchar",len:2,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM04_AUTH_CD",gxz:"Z13TAM04_AUTH_CD",gxold:"O13TAM04_AUTH_CD",gxvar:"A13TAM04_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A13TAM04_AUTH_CD=a},v2z:function(a){gx.O.Z13TAM04_AUTH_CD=a},v2c:function(a){gx.fn.setGridControlValue("TAM04_AUTH_CD",
a||gx.fn.currentGridRowImpl(51),gx.O.A13TAM04_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A13TAM04_AUTH_CD=this.val()},val:function(a){return gx.fn.getGridControlValue("TAM04_AUTH_CD",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[54]={lvl:2,type:"svchar",len:7,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM03_APP_ID",gxz:"Z12TAM03_APP_ID",gxold:"O12TAM03_APP_ID",gxvar:"A12TAM03_APP_ID",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A12TAM03_APP_ID=a},v2z:function(a){gx.O.Z12TAM03_APP_ID=a},v2c:function(a){gx.fn.setGridControlValue("TAM03_APP_ID",a||gx.fn.currentGridRowImpl(51),gx.O.A12TAM03_APP_ID,0)},c2v:function(){gx.O.A12TAM03_APP_ID=this.val()},val:function(a){return gx.fn.getGridControlValue("TAM03_APP_ID",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[55]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,
fnc:null,isvalid:null,rgrid:[],fld:"TAM05_KNGN_FLG",gxz:"Z288TAM05_KNGN_FLG",gxold:"O288TAM05_KNGN_FLG",gxvar:"A288TAM05_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A288TAM05_KNGN_FLG=a},v2z:function(a){gx.O.Z288TAM05_KNGN_FLG=a},v2c:function(a){gx.fn.setGridControlValue("TAM05_KNGN_FLG",a||gx.fn.currentGridRowImpl(51),gx.O.A288TAM05_KNGN_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A288TAM05_KNGN_FLG=
this.val()},val:function(a){return gx.fn.getGridControlValue("TAM05_KNGN_FLG",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[56]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_DEL_FLG",gxz:"Z289TAM05_DEL_FLG",gxold:"O289TAM05_DEL_FLG",gxvar:"A289TAM05_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A289TAM05_DEL_FLG=a},v2z:function(a){gx.O.Z289TAM05_DEL_FLG=
a},v2c:function(a){gx.fn.setGridControlValue("TAM05_DEL_FLG",a||gx.fn.currentGridRowImpl(51),gx.O.A289TAM05_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A289TAM05_DEL_FLG=this.val()},val:function(a){return gx.fn.getGridControlValue("TAM05_DEL_FLG",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[57]={lvl:2,type:"dtime",len:10,dec:8,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_CRT_DATETIME",gxz:"Z290TAM05_CRT_DATETIME",
gxold:"O290TAM05_CRT_DATETIME",gxvar:"A290TAM05_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(a){gx.fn.setGridControlValue("TAM05_CRT_DATETIME",a||gx.fn.currentGridRowImpl(51),gx.O.A290TAM05_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(a){return gx.fn.getGridDateTimeValue("TAM05_CRT_DATETIME",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[58]={lvl:2,type:"svchar",len:128,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_CRT_USER_ID",gxz:"Z291TAM05_CRT_USER_ID",gxold:"O291TAM05_CRT_USER_ID",gxvar:"A291TAM05_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",
autoCorrect:"1",v2v:function(a){gx.O.A291TAM05_CRT_USER_ID=a},v2z:function(a){gx.O.Z291TAM05_CRT_USER_ID=a},v2c:function(a){gx.fn.setGridControlValue("TAM05_CRT_USER_ID",a||gx.fn.currentGridRowImpl(51),gx.O.A291TAM05_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A291TAM05_CRT_USER_ID=this.val()},val:function(a){return gx.fn.getGridControlValue("TAM05_CRT_USER_ID",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[59]={lvl:2,type:"dtime",len:10,dec:8,
sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_UPD_DATETIME",gxz:"Z293TAM05_UPD_DATETIME",gxold:"O293TAM05_UPD_DATETIME",gxvar:"A293TAM05_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",v2v:function(a){gx.O.A293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(a){gx.fn.setGridControlValue("TAM05_UPD_DATETIME",
a||gx.fn.currentGridRowImpl(51),gx.O.A293TAM05_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(a){return gx.fn.getGridDateTimeValue("TAM05_UPD_DATETIME",a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[60]={lvl:2,type:"svchar",len:128,dec:0,sign:false,ro:1,isacc:0,grid:51,gxgrid:this.Grid1Container,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_UPD_USER_ID",gxz:"Z294TAM05_UPD_USER_ID",
gxold:"O294TAM05_UPD_USER_ID",gxvar:"A294TAM05_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",inputType:"text",autoCorrect:"1",v2v:function(a){gx.O.A294TAM05_UPD_USER_ID=a},v2z:function(a){gx.O.Z294TAM05_UPD_USER_ID=a},v2c:function(a){gx.fn.setGridControlValue("TAM05_UPD_USER_ID",a||gx.fn.currentGridRowImpl(51),gx.O.A294TAM05_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A294TAM05_UPD_USER_ID=this.val()},val:function(a){return gx.fn.getGridControlValue("TAM05_UPD_USER_ID",
a||gx.fn.currentGridRowImpl(51))},nac:gx.falseFn};b[63]={fld:"TABLE4",grid:0};this.OV9cTAM05_DEL_FLG=this.ZV9cTAM05_DEL_FLG=this.AV9cTAM05_DEL_FLG=this.OV8cTAM05_KNGN_FLG=this.ZV8cTAM05_KNGN_FLG=this.AV8cTAM05_KNGN_FLG=this.OV7cTAM03_APP_ID=this.ZV7cTAM03_APP_ID=this.AV7cTAM03_APP_ID=this.OV6cTAM04_KNGN_PTN_KBN=this.ZV6cTAM04_KNGN_PTN_KBN=this.AV6cTAM04_KNGN_PTN_KBN="";this.AV10cTAM05_CRT_DATETIME=gx.date.nullDate();this.ZV10cTAM05_CRT_DATETIME=gx.date.nullDate();this.OV10cTAM05_CRT_DATETIME=gx.date.nullDate();
this.O289TAM05_DEL_FLG=this.Z289TAM05_DEL_FLG=this.O288TAM05_KNGN_FLG=this.Z288TAM05_KNGN_FLG=this.O12TAM03_APP_ID=this.Z12TAM03_APP_ID=this.O13TAM04_AUTH_CD=this.Z13TAM04_AUTH_CD=this.OV5LinkSelection=this.ZV5LinkSelection=this.OV12cTAM05_CRT_PROG_NM=this.ZV12cTAM05_CRT_PROG_NM=this.AV12cTAM05_CRT_PROG_NM=this.OV11cTAM05_CRT_USER_ID=this.ZV11cTAM05_CRT_USER_ID=this.AV11cTAM05_CRT_USER_ID="";this.Z290TAM05_CRT_DATETIME=gx.date.nullDate();this.O290TAM05_CRT_DATETIME=gx.date.nullDate();this.O291TAM05_CRT_USER_ID=
this.Z291TAM05_CRT_USER_ID="";this.Z293TAM05_UPD_DATETIME=gx.date.nullDate();this.O293TAM05_UPD_DATETIME=gx.date.nullDate();this.AV9cTAM05_DEL_FLG=this.AV8cTAM05_KNGN_FLG=this.AV7cTAM03_APP_ID=this.AV6cTAM04_KNGN_PTN_KBN=this.O294TAM05_UPD_USER_ID=this.Z294TAM05_UPD_USER_ID="";this.AV10cTAM05_CRT_DATETIME=gx.date.nullDate();this.A289TAM05_DEL_FLG=this.A288TAM05_KNGN_FLG=this.A12TAM03_APP_ID=this.A13TAM04_AUTH_CD=this.AV5LinkSelection=this.A292TAM05_CRT_PROG_NM=this.AV14pTAM03_APP_ID=this.AV13pTAM04_KNGN_PTN_KBN=
this.AV12cTAM05_CRT_PROG_NM=this.AV11cTAM05_CRT_USER_ID="";this.A290TAM05_CRT_DATETIME=gx.date.nullDate();this.A291TAM05_CRT_USER_ID="";this.A293TAM05_UPD_DATETIME=gx.date.nullDate();this.A294TAM05_UPD_USER_ID="";this.Events={e132a2_client:["ENTER",true],e142a1_client:["CANCEL",true]};this.setVCMap("AV13pTAM04_KNGN_PTN_KBN","vPTAM04_KNGN_PTN_KBN",0,"svchar");this.setVCMap("AV14pTAM03_APP_ID","vPTAM03_APP_ID",0,"svchar");c.addRefreshingVar(this.GXValidFnc[14]);c.addRefreshingVar(this.GXValidFnc[19]);
c.addRefreshingVar(this.GXValidFnc[24]);c.addRefreshingVar(this.GXValidFnc[29]);c.addRefreshingVar(this.GXValidFnc[34]);c.addRefreshingVar(this.GXValidFnc[39]);c.addRefreshingVar(this.GXValidFnc[44]);this.InitStandaloneVars()});gx.setParentObj(new tam05_sel);
