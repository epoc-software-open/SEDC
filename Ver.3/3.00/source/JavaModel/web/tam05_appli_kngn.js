gx.evt.autoSkip=!1;
gx.define("tam05_appli_kngn",!1,function(){this.ServerClass="tam05_appli_kngn";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV12Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tam04_auth_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam04_auth_cd",["gx.O.A13TAM04_AUTH_CD"],[]);return true};this.Valid_Tam03_app_id=function(){gx.ajax.validSrvEvt("dyncall",
"valid_Tam03_app_id",["gx.O.A13TAM04_AUTH_CD","gx.O.A12TAM03_APP_ID",'gx.date.urlDateTime(gx.O.A290TAM05_CRT_DATETIME,"Y4MD")',"gx.O.A291TAM05_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A293TAM05_UPD_DATETIME,"Y4MD")',"gx.O.A294TAM05_UPD_USER_ID","gx.O.A296TAM05_UPD_CNT","gx.O.A288TAM05_KNGN_FLG","gx.O.A289TAM05_DEL_FLG","gx.O.A292TAM05_CRT_PROG_NM","gx.O.A295TAM05_UPD_PROG_NM"],["A290TAM05_CRT_DATETIME","A291TAM05_CRT_USER_ID","A293TAM05_UPD_DATETIME","A294TAM05_UPD_USER_ID","A296TAM05_UPD_CNT","A288TAM05_KNGN_FLG",
"A289TAM05_DEL_FLG","A292TAM05_CRT_PROG_NM","A295TAM05_UPD_PROG_NM","AV12Pgmname","Gx_mode","Z13TAM04_AUTH_CD","Z12TAM03_APP_ID","Z290TAM05_CRT_DATETIME","Z291TAM05_CRT_USER_ID","Z293TAM05_UPD_DATETIME","Z294TAM05_UPD_USER_ID","Z296TAM05_UPD_CNT","Z288TAM05_KNGN_FLG","Z289TAM05_DEL_FLG","Z292TAM05_CRT_PROG_NM","Z295TAM05_UPD_PROG_NM","ZV12Pgmname","O296TAM05_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tam05_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAM05_CRT_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A290TAM05_CRT_DATETIME)==0||(new gx.date.gxdate(this.A290TAM05_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tam05_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAM05_UPD_DATETIME");this.AnyError=
0;if(!((new gx.date.gxdate("")).compare(this.A293TAM05_UPD_DATETIME)==0||(new gx.date.gxdate(this.A293TAM05_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tam05_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TAM05_UPD_CNT");this.AnyError=0}catch(b){}try{return a==
null?true:a.show()}catch(c){}return true};this.e12092_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e13099_client=function(){this.executeServerEvent("ENTER",true)};this.e14099_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89];this.GXLastCtrlId=89;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};
b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};
b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTAM04_AUTH_CD",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam04_auth_cd,isvalid:null,rgrid:[],fld:"TAM04_AUTH_CD",gxz:"Z13TAM04_AUTH_CD",gxold:"O13TAM04_AUTH_CD",gxvar:"A13TAM04_AUTH_CD",ucs:[],op:[],ip:[39],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.A13TAM04_AUTH_CD=a},v2z:function(a){gx.O.Z13TAM04_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TAM04_AUTH_CD",gx.O.A13TAM04_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A13TAM04_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TAM04_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTAM03_APP_ID",format:0,grid:0};b[44]={lvl:0,type:"svchar",len:7,dec:0,sign:false,
ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam03_app_id,isvalid:null,rgrid:[],fld:"TAM03_APP_ID",gxz:"Z12TAM03_APP_ID",gxold:"O12TAM03_APP_ID",gxvar:"A12TAM03_APP_ID",ucs:[],op:[84,69,54,49,89,79,74,64,59],ip:[84,69,54,49,89,79,74,64,59,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A12TAM03_APP_ID=a},v2z:function(a){gx.O.Z12TAM03_APP_ID=a},v2c:function(){gx.fn.setControlValue("TAM03_APP_ID",gx.O.A12TAM03_APP_ID,0)},c2v:function(){gx.O.A12TAM03_APP_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM03_APP_ID")},
nac:gx.falseFn};b[47]={fld:"TEXTBLOCKTAM05_KNGN_FLG",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_KNGN_FLG",gxz:"Z288TAM05_KNGN_FLG",gxold:"O288TAM05_KNGN_FLG",gxvar:"A288TAM05_KNGN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A288TAM05_KNGN_FLG=a},v2z:function(a){gx.O.Z288TAM05_KNGN_FLG=a},v2c:function(){gx.fn.setControlValue("TAM05_KNGN_FLG",gx.O.A288TAM05_KNGN_FLG,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A288TAM05_KNGN_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM05_KNGN_FLG")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTAM05_DEL_FLG",format:0,grid:0};b[54]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_DEL_FLG",gxz:"Z289TAM05_DEL_FLG",gxold:"O289TAM05_DEL_FLG",gxvar:"A289TAM05_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A289TAM05_DEL_FLG=a},v2z:function(a){gx.O.Z289TAM05_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TAM05_DEL_FLG",gx.O.A289TAM05_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A289TAM05_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM05_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(54,function(){});b[57]={fld:"TEXTBLOCKTAM05_CRT_DATETIME",format:0,grid:0};b[59]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tam05_crt_datetime,isvalid:null,rgrid:[],fld:"TAM05_CRT_DATETIME",gxz:"Z290TAM05_CRT_DATETIME",gxold:"O290TAM05_CRT_DATETIME",gxvar:"A290TAM05_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[59],ip:[59],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM05_CRT_DATETIME",
gx.O.A290TAM05_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A290TAM05_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAM05_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTAM05_CRT_USER_ID",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_CRT_USER_ID",gxz:"Z291TAM05_CRT_USER_ID",
gxold:"O291TAM05_CRT_USER_ID",gxvar:"A291TAM05_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A291TAM05_CRT_USER_ID=a},v2z:function(a){gx.O.Z291TAM05_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM05_CRT_USER_ID",gx.O.A291TAM05_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A291TAM05_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM05_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(64,
function(){});b[67]={fld:"TEXTBLOCKTAM05_CRT_PROG_NM",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_CRT_PROG_NM",gxz:"Z292TAM05_CRT_PROG_NM",gxold:"O292TAM05_CRT_PROG_NM",gxvar:"A292TAM05_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A292TAM05_CRT_PROG_NM=a},v2z:function(a){gx.O.Z292TAM05_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM05_CRT_PROG_NM",gx.O.A292TAM05_CRT_PROG_NM,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A292TAM05_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM05_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(69,function(){});b[72]={fld:"TEXTBLOCKTAM05_UPD_DATETIME",format:0,grid:0};b[74]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam05_upd_datetime,isvalid:null,rgrid:[],fld:"TAM05_UPD_DATETIME",gxz:"Z293TAM05_UPD_DATETIME",gxold:"O293TAM05_UPD_DATETIME",
gxvar:"A293TAM05_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[74],ip:[74],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM05_UPD_DATETIME",gx.O.A293TAM05_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A293TAM05_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},
val:function(){return gx.fn.getDateTimeValue("TAM05_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTAM05_UPD_USER_ID",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_UPD_USER_ID",gxz:"Z294TAM05_UPD_USER_ID",gxold:"O294TAM05_UPD_USER_ID",gxvar:"A294TAM05_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A294TAM05_UPD_USER_ID=a},v2z:function(a){gx.O.Z294TAM05_UPD_USER_ID=
a},v2c:function(){gx.fn.setControlValue("TAM05_UPD_USER_ID",gx.O.A294TAM05_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A294TAM05_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM05_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTAM05_UPD_PROG_NM",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM05_UPD_PROG_NM",
gxz:"Z295TAM05_UPD_PROG_NM",gxold:"O295TAM05_UPD_PROG_NM",gxvar:"A295TAM05_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A295TAM05_UPD_PROG_NM=a},v2z:function(a){gx.O.Z295TAM05_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM05_UPD_PROG_NM",gx.O.A295TAM05_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A295TAM05_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM05_UPD_PROG_NM")},nac:gx.falseFn};
this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTAM05_UPD_CNT",format:0,grid:0};b[89]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam05_upd_cnt,isvalid:null,rgrid:[],fld:"TAM05_UPD_CNT",gxz:"Z296TAM05_UPD_CNT",gxold:"O296TAM05_UPD_CNT",gxvar:"A296TAM05_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A296TAM05_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z296TAM05_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TAM05_UPD_CNT",
gx.O.A296TAM05_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A296TAM05_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TAM05_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});this.O289TAM05_DEL_FLG=this.Z289TAM05_DEL_FLG=this.A289TAM05_DEL_FLG=this.O288TAM05_KNGN_FLG=this.Z288TAM05_KNGN_FLG=this.A288TAM05_KNGN_FLG=this.O12TAM03_APP_ID=this.Z12TAM03_APP_ID=this.A12TAM03_APP_ID=this.O13TAM04_AUTH_CD=this.Z13TAM04_AUTH_CD=
this.A13TAM04_AUTH_CD="";this.A290TAM05_CRT_DATETIME=gx.date.nullDate();this.Z290TAM05_CRT_DATETIME=gx.date.nullDate();this.O290TAM05_CRT_DATETIME=gx.date.nullDate();this.O292TAM05_CRT_PROG_NM=this.Z292TAM05_CRT_PROG_NM=this.A292TAM05_CRT_PROG_NM=this.O291TAM05_CRT_USER_ID=this.Z291TAM05_CRT_USER_ID=this.A291TAM05_CRT_USER_ID="";this.A293TAM05_UPD_DATETIME=gx.date.nullDate();this.Z293TAM05_UPD_DATETIME=gx.date.nullDate();this.O293TAM05_UPD_DATETIME=gx.date.nullDate();this.O295TAM05_UPD_PROG_NM=this.Z295TAM05_UPD_PROG_NM=
this.A295TAM05_UPD_PROG_NM=this.O294TAM05_UPD_USER_ID=this.Z294TAM05_UPD_USER_ID=this.A294TAM05_UPD_USER_ID="";this.O296TAM05_UPD_CNT=this.Z296TAM05_UPD_CNT=this.A296TAM05_UPD_CNT=0;this.A12TAM03_APP_ID=this.A13TAM04_AUTH_CD=this.AV12Pgmname=this.AV11W_BC_FLG="";this.A290TAM05_CRT_DATETIME=gx.date.nullDate();this.A291TAM05_CRT_USER_ID="";this.A293TAM05_UPD_DATETIME=gx.date.nullDate();this.A294TAM05_UPD_USER_ID="";this.A296TAM05_UPD_CNT=0;this.A295TAM05_UPD_PROG_NM=this.A292TAM05_CRT_PROG_NM=this.A289TAM05_DEL_FLG=
this.A288TAM05_KNGN_FLG="";this.Events={e12092_client:["AFTER TRN",true],e13099_client:["ENTER",true],e14099_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV12Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[9]=["O296TAM05_UPD_CNT"]});gx.setParentObj(new tam05_appli_kngn);