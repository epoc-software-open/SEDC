gx.evt.autoSkip=!1;
gx.define("tam07_user",!1,function(){this.ServerClass="tam07_user";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tam07_user_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam07_user_id",["gx.O.A55TAM07_USER_ID",'gx.date.urlDateTime(gx.O.A229TAM07_CRT_DATETIME,"Y4MD")',"gx.O.A264TAM07_CRT_USER_ID",
'gx.date.urlDateTime(gx.O.A231TAM07_UPD_DATETIME,"Y4MD")',"gx.O.A265TAM07_UPD_USER_ID","gx.O.A299TAM07_UPD_CNT","gx.O.A205TAM07_USER_NM","gx.O.A313TAM07_USER_KANA_NM","gx.O.A210TAM07_PWD","gx.O.A333TAM07_SITE_ID","gx.O.A683TAM07_EMAIL","gx.O.A996TAM07_ADMIN_AUTH_FLG","gx.O.A997TAM07_NC_FLG","gx.O.A998TAM07_NOTE","gx.O.A214TAM07_DEL_FLG","gx.O.A230TAM07_CRT_PROG_NM","gx.O.A232TAM07_UPD_PROG_NM","gx.O.A56TAM07_AUTH_CD"],["A229TAM07_CRT_DATETIME","A264TAM07_CRT_USER_ID","A231TAM07_UPD_DATETIME","A265TAM07_UPD_USER_ID",
"A299TAM07_UPD_CNT","A205TAM07_USER_NM","A313TAM07_USER_KANA_NM","A210TAM07_PWD","A56TAM07_AUTH_CD","A333TAM07_SITE_ID","A683TAM07_EMAIL","A996TAM07_ADMIN_AUTH_FLG","A997TAM07_NC_FLG","A998TAM07_NOTE","A214TAM07_DEL_FLG","A230TAM07_CRT_PROG_NM","A232TAM07_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z55TAM07_USER_ID","Z229TAM07_CRT_DATETIME","Z264TAM07_CRT_USER_ID","Z231TAM07_UPD_DATETIME","Z265TAM07_UPD_USER_ID","Z299TAM07_UPD_CNT","Z205TAM07_USER_NM","Z313TAM07_USER_KANA_NM","Z210TAM07_PWD","Z56TAM07_AUTH_CD",
"Z333TAM07_SITE_ID","Z683TAM07_EMAIL","Z996TAM07_ADMIN_AUTH_FLG","Z997TAM07_NC_FLG","Z998TAM07_NOTE","Z214TAM07_DEL_FLG","Z230TAM07_CRT_PROG_NM","Z232TAM07_UPD_PROG_NM","ZV9Pgmname","O299TAM07_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tam07_auth_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam07_auth_cd",["gx.O.A56TAM07_AUTH_CD"],[]);return true};this.Valid_Tam07_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAM07_CRT_DATETIME");this.AnyError=
0;if(!((new gx.date.gxdate("")).compare(this.A229TAM07_CRT_DATETIME)==0||(new gx.date.gxdate(this.A229TAM07_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tam07_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAM07_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A231TAM07_UPD_DATETIME)==
0||(new gx.date.gxdate(this.A231TAM07_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tam07_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TAM07_UPD_CNT");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e120a2_client=function(){this.executeServerEvent("AFTER TRN",
true)};this.e130a10_client=function(){this.executeServerEvent("ENTER",true)};this.e140a10_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119,122,124];this.GXLastCtrlId=124;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",
grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",
grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTAM07_USER_ID",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_user_id,isvalid:null,rgrid:[],fld:"TAM07_USER_ID",gxz:"Z55TAM07_USER_ID",gxold:"O55TAM07_USER_ID",gxvar:"A55TAM07_USER_ID",ucs:[],op:[59,119,104,89,84,79,74,69,64,54,49,44,124,114,109,99,94],ip:[59,119,104,89,84,79,
74,69,64,54,49,44,124,114,109,99,94,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A55TAM07_USER_ID=a},v2z:function(a){gx.O.Z55TAM07_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_USER_ID",gx.O.A55TAM07_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A55TAM07_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTAM07_USER_NM",format:0,grid:0};
b[44]={lvl:0,type:"svchar",len:30,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_USER_NM",gxz:"Z205TAM07_USER_NM",gxold:"O205TAM07_USER_NM",gxvar:"A205TAM07_USER_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A205TAM07_USER_NM=a},v2z:function(a){gx.O.Z205TAM07_USER_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_USER_NM",gx.O.A205TAM07_USER_NM,0)},c2v:function(){gx.O.A205TAM07_USER_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_NM")},
nac:gx.falseFn};b[47]={fld:"TEXTBLOCKTAM07_USER_KANA_NM",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_USER_KANA_NM",gxz:"Z313TAM07_USER_KANA_NM",gxold:"O313TAM07_USER_KANA_NM",gxvar:"A313TAM07_USER_KANA_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A313TAM07_USER_KANA_NM=a},v2z:function(a){gx.O.Z313TAM07_USER_KANA_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_USER_KANA_NM",gx.O.A313TAM07_USER_KANA_NM,
0)},c2v:function(){gx.O.A313TAM07_USER_KANA_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_USER_KANA_NM")},nac:gx.falseFn};b[52]={fld:"TEXTBLOCKTAM07_PWD",format:0,grid:0};b[54]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_PWD",gxz:"Z210TAM07_PWD",gxold:"O210TAM07_PWD",gxvar:"A210TAM07_PWD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A210TAM07_PWD=a},v2z:function(a){gx.O.Z210TAM07_PWD=a},v2c:function(){gx.fn.setControlValue("TAM07_PWD",
gx.O.A210TAM07_PWD,0)},c2v:function(){gx.O.A210TAM07_PWD=this.val()},val:function(){return gx.fn.getControlValue("TAM07_PWD")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTAM07_AUTH_CD",format:0,grid:0};b[59]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_auth_cd,isvalid:null,rgrid:[],fld:"TAM07_AUTH_CD",gxz:"Z56TAM07_AUTH_CD",gxold:"O56TAM07_AUTH_CD",gxvar:"A56TAM07_AUTH_CD",ucs:[],op:[],ip:[59],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A56TAM07_AUTH_CD=a},
v2z:function(a){gx.O.Z56TAM07_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TAM07_AUTH_CD",gx.O.A56TAM07_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A56TAM07_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TAM07_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTAM07_SITE_ID",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],
fld:"TAM07_SITE_ID",gxz:"Z333TAM07_SITE_ID",gxold:"O333TAM07_SITE_ID",gxvar:"A333TAM07_SITE_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A333TAM07_SITE_ID=a},v2z:function(a){gx.O.Z333TAM07_SITE_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_SITE_ID",gx.O.A333TAM07_SITE_ID,0)},c2v:function(){gx.O.A333TAM07_SITE_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_SITE_ID")},nac:gx.falseFn};b[67]={fld:"TEXTBLOCKTAM07_EMAIL",format:0,grid:0};b[69]={lvl:0,type:"svchar",
len:256,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_EMAIL",gxz:"Z683TAM07_EMAIL",gxold:"O683TAM07_EMAIL",gxvar:"A683TAM07_EMAIL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A683TAM07_EMAIL=a},v2z:function(a){gx.O.Z683TAM07_EMAIL=a},v2c:function(){gx.fn.setControlValue("TAM07_EMAIL",gx.O.A683TAM07_EMAIL,0)},c2v:function(){gx.O.A683TAM07_EMAIL=this.val()},val:function(){return gx.fn.getControlValue("TAM07_EMAIL")},nac:gx.falseFn};
b[72]={fld:"TEXTBLOCKTAM07_ADMIN_AUTH_FLG",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_ADMIN_AUTH_FLG",gxz:"Z996TAM07_ADMIN_AUTH_FLG",gxold:"O996TAM07_ADMIN_AUTH_FLG",gxvar:"A996TAM07_ADMIN_AUTH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A996TAM07_ADMIN_AUTH_FLG=a},v2z:function(a){gx.O.Z996TAM07_ADMIN_AUTH_FLG=a},v2c:function(){gx.fn.setControlValue("TAM07_ADMIN_AUTH_FLG",gx.O.A996TAM07_ADMIN_AUTH_FLG,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A996TAM07_ADMIN_AUTH_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM07_ADMIN_AUTH_FLG")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTAM07_NC_FLG",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_NC_FLG",gxz:"Z997TAM07_NC_FLG",gxold:"O997TAM07_NC_FLG",gxvar:"A997TAM07_NC_FLG",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A997TAM07_NC_FLG=a},v2z:function(a){gx.O.Z997TAM07_NC_FLG=a},v2c:function(){gx.fn.setControlValue("TAM07_NC_FLG",gx.O.A997TAM07_NC_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A997TAM07_NC_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM07_NC_FLG")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTAM07_NOTE",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:1E3,dec:0,
sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_NOTE",gxz:"Z998TAM07_NOTE",gxold:"O998TAM07_NOTE",gxvar:"A998TAM07_NOTE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A998TAM07_NOTE=a},v2z:function(a){gx.O.Z998TAM07_NOTE=a},v2c:function(){gx.fn.setControlValue("TAM07_NOTE",gx.O.A998TAM07_NOTE,0)},c2v:function(){gx.O.A998TAM07_NOTE=this.val()},val:function(){return gx.fn.getControlValue("TAM07_NOTE")},nac:gx.falseFn};b[87]={fld:"TEXTBLOCKTAM07_DEL_FLG",
format:0,grid:0};b[89]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_DEL_FLG",gxz:"Z214TAM07_DEL_FLG",gxold:"O214TAM07_DEL_FLG",gxvar:"A214TAM07_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A214TAM07_DEL_FLG=a},v2z:function(a){gx.O.Z214TAM07_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TAM07_DEL_FLG",gx.O.A214TAM07_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A214TAM07_DEL_FLG=
this.val()},val:function(){return gx.fn.getControlValue("TAM07_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});b[92]={fld:"TEXTBLOCKTAM07_CRT_DATETIME",format:0,grid:0};b[94]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_crt_datetime,isvalid:null,rgrid:[],fld:"TAM07_CRT_DATETIME",gxz:"Z229TAM07_CRT_DATETIME",gxold:"O229TAM07_CRT_DATETIME",gxvar:"A229TAM07_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},
ucs:[],op:[94],ip:[94],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A229TAM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z229TAM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM07_CRT_DATETIME",gx.O.A229TAM07_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A229TAM07_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAM07_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(94,
function(){});b[97]={fld:"TEXTBLOCKTAM07_CRT_USER_ID",format:0,grid:0};b[99]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_CRT_USER_ID",gxz:"Z264TAM07_CRT_USER_ID",gxold:"O264TAM07_CRT_USER_ID",gxvar:"A264TAM07_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A264TAM07_CRT_USER_ID=a},v2z:function(a){gx.O.Z264TAM07_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_CRT_USER_ID",gx.O.A264TAM07_CRT_USER_ID,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A264TAM07_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(99,function(){});b[102]={fld:"TEXTBLOCKTAM07_CRT_PROG_NM",format:0,grid:0};b[104]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_CRT_PROG_NM",gxz:"Z230TAM07_CRT_PROG_NM",gxold:"O230TAM07_CRT_PROG_NM",gxvar:"A230TAM07_CRT_PROG_NM",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A230TAM07_CRT_PROG_NM=a},v2z:function(a){gx.O.Z230TAM07_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_CRT_PROG_NM",gx.O.A230TAM07_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A230TAM07_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(104,function(){});b[107]={fld:"TEXTBLOCKTAM07_UPD_DATETIME",
format:0,grid:0};b[109]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_upd_datetime,isvalid:null,rgrid:[],fld:"TAM07_UPD_DATETIME",gxz:"Z231TAM07_UPD_DATETIME",gxold:"O231TAM07_UPD_DATETIME",gxvar:"A231TAM07_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[109],ip:[109],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A231TAM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z231TAM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)},
v2c:function(){gx.fn.setControlValue("TAM07_UPD_DATETIME",gx.O.A231TAM07_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A231TAM07_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAM07_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(109,function(){});b[112]={fld:"TEXTBLOCKTAM07_UPD_USER_ID",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TAM07_UPD_USER_ID",gxz:"Z265TAM07_UPD_USER_ID",gxold:"O265TAM07_UPD_USER_ID",gxvar:"A265TAM07_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A265TAM07_UPD_USER_ID=a},v2z:function(a){gx.O.Z265TAM07_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM07_UPD_USER_ID",gx.O.A265TAM07_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A265TAM07_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM07_UPD_USER_ID")},
nac:gx.falseFn};this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTAM07_UPD_PROG_NM",format:0,grid:0};b[119]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM07_UPD_PROG_NM",gxz:"Z232TAM07_UPD_PROG_NM",gxold:"O232TAM07_UPD_PROG_NM",gxvar:"A232TAM07_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A232TAM07_UPD_PROG_NM=a},v2z:function(a){gx.O.Z232TAM07_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM07_UPD_PROG_NM",
gx.O.A232TAM07_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A232TAM07_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM07_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(119,function(){});b[122]={fld:"TEXTBLOCKTAM07_UPD_CNT",format:0,grid:0};b[124]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam07_upd_cnt,isvalid:null,rgrid:[],fld:"TAM07_UPD_CNT",gxz:"Z299TAM07_UPD_CNT",
gxold:"O299TAM07_UPD_CNT",gxvar:"A299TAM07_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A299TAM07_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z299TAM07_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TAM07_UPD_CNT",gx.O.A299TAM07_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A299TAM07_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TAM07_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(124,
function(){});this.O214TAM07_DEL_FLG=this.Z214TAM07_DEL_FLG=this.A214TAM07_DEL_FLG=this.O998TAM07_NOTE=this.Z998TAM07_NOTE=this.A998TAM07_NOTE=this.O997TAM07_NC_FLG=this.Z997TAM07_NC_FLG=this.A997TAM07_NC_FLG=this.O996TAM07_ADMIN_AUTH_FLG=this.Z996TAM07_ADMIN_AUTH_FLG=this.A996TAM07_ADMIN_AUTH_FLG=this.O683TAM07_EMAIL=this.Z683TAM07_EMAIL=this.A683TAM07_EMAIL=this.O333TAM07_SITE_ID=this.Z333TAM07_SITE_ID=this.A333TAM07_SITE_ID=this.O56TAM07_AUTH_CD=this.Z56TAM07_AUTH_CD=this.A56TAM07_AUTH_CD=this.O210TAM07_PWD=
this.Z210TAM07_PWD=this.A210TAM07_PWD=this.O313TAM07_USER_KANA_NM=this.Z313TAM07_USER_KANA_NM=this.A313TAM07_USER_KANA_NM=this.O205TAM07_USER_NM=this.Z205TAM07_USER_NM=this.A205TAM07_USER_NM=this.O55TAM07_USER_ID=this.Z55TAM07_USER_ID=this.A55TAM07_USER_ID="";this.A229TAM07_CRT_DATETIME=gx.date.nullDate();this.Z229TAM07_CRT_DATETIME=gx.date.nullDate();this.O229TAM07_CRT_DATETIME=gx.date.nullDate();this.O230TAM07_CRT_PROG_NM=this.Z230TAM07_CRT_PROG_NM=this.A230TAM07_CRT_PROG_NM=this.O264TAM07_CRT_USER_ID=
this.Z264TAM07_CRT_USER_ID=this.A264TAM07_CRT_USER_ID="";this.A231TAM07_UPD_DATETIME=gx.date.nullDate();this.Z231TAM07_UPD_DATETIME=gx.date.nullDate();this.O231TAM07_UPD_DATETIME=gx.date.nullDate();this.O232TAM07_UPD_PROG_NM=this.Z232TAM07_UPD_PROG_NM=this.A232TAM07_UPD_PROG_NM=this.O265TAM07_UPD_USER_ID=this.Z265TAM07_UPD_USER_ID=this.A265TAM07_UPD_USER_ID="";this.O299TAM07_UPD_CNT=this.Z299TAM07_UPD_CNT=this.A299TAM07_UPD_CNT=0;this.A55TAM07_USER_ID=this.AV9Pgmname=this.AV8W_BC_FLG="";this.A229TAM07_CRT_DATETIME=
gx.date.nullDate();this.A264TAM07_CRT_USER_ID="";this.A231TAM07_UPD_DATETIME=gx.date.nullDate();this.A265TAM07_UPD_USER_ID="";this.A299TAM07_UPD_CNT=0;this.A232TAM07_UPD_PROG_NM=this.A230TAM07_CRT_PROG_NM=this.A214TAM07_DEL_FLG=this.A998TAM07_NOTE=this.A997TAM07_NC_FLG=this.A996TAM07_ADMIN_AUTH_FLG=this.A683TAM07_EMAIL=this.A333TAM07_SITE_ID=this.A56TAM07_AUTH_CD=this.A210TAM07_PWD=this.A313TAM07_USER_KANA_NM=this.A205TAM07_USER_NM="";this.Events={e120a2_client:["AFTER TRN",true],e130a10_client:["ENTER",
true],e140a10_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[10]=["O299TAM07_UPD_CNT"]});gx.setParentObj(new tam07_user);