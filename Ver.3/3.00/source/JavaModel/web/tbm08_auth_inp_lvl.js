gx.evt.autoSkip=!1;
gx.define("tbm08_auth_inp_lvl",!1,function(){this.ServerClass="tbm08_auth_inp_lvl";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm08_auth_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm08_auth_cd",["gx.O.A191TBM08_AUTH_CD","gx.O.A863TBM08_DM_MICHAKU_CRF_FLG","gx.O.A864TBM08_DM_MICHAKU_MEMO_FLG","gx.O.A865TBM08_DM_MICHAKU_DM_FLG","gx.O.A866TBM08_DM_ARRI_CRF_FLG",
"gx.O.A867TBM08_DM_ARRI_MEMO_FLG","gx.O.A868TBM08_DM_ARRI_DM_FLG","gx.O.A869TBM08_DM_KAIJO_CRF_FLG","gx.O.A870TBM08_DM_KAIJO_MEMO_FLG","gx.O.A871TBM08_DM_KAIJO_DM_FLG","gx.O.A881TBM08_ICON_CAPTION","gx.O.A885TBM08_ICON_R","gx.O.A886TBM08_ICON_G","gx.O.A887TBM08_ICON_B","gx.O.A872TBM08_DEL_FLG",'gx.date.urlDateTime(gx.O.A873TBM08_CRT_DATETIME,"Y4MD")',"gx.O.A874TBM08_CRT_USER_ID","gx.O.A875TBM08_CRT_PROG_NM",'gx.date.urlDateTime(gx.O.A876TBM08_UPD_DATETIME,"Y4MD")',"gx.O.A877TBM08_UPD_USER_ID","gx.O.A878TBM08_UPD_PROG_NM",
"gx.O.A879TBM08_UPD_COUNT"],["A863TBM08_DM_MICHAKU_CRF_FLG","A864TBM08_DM_MICHAKU_MEMO_FLG","A865TBM08_DM_MICHAKU_DM_FLG","A866TBM08_DM_ARRI_CRF_FLG","A867TBM08_DM_ARRI_MEMO_FLG","A868TBM08_DM_ARRI_DM_FLG","A869TBM08_DM_KAIJO_CRF_FLG","A870TBM08_DM_KAIJO_MEMO_FLG","A871TBM08_DM_KAIJO_DM_FLG","A881TBM08_ICON_CAPTION","A885TBM08_ICON_R","A886TBM08_ICON_G","A887TBM08_ICON_B","A872TBM08_DEL_FLG","A873TBM08_CRT_DATETIME","A874TBM08_CRT_USER_ID","A875TBM08_CRT_PROG_NM","A876TBM08_UPD_DATETIME","A877TBM08_UPD_USER_ID",
"A878TBM08_UPD_PROG_NM","A879TBM08_UPD_COUNT","Gx_mode","Z191TBM08_AUTH_CD","Z863TBM08_DM_MICHAKU_CRF_FLG","Z864TBM08_DM_MICHAKU_MEMO_FLG","Z865TBM08_DM_MICHAKU_DM_FLG","Z866TBM08_DM_ARRI_CRF_FLG","Z867TBM08_DM_ARRI_MEMO_FLG","Z868TBM08_DM_ARRI_DM_FLG","Z869TBM08_DM_KAIJO_CRF_FLG","Z870TBM08_DM_KAIJO_MEMO_FLG","Z871TBM08_DM_KAIJO_DM_FLG","Z881TBM08_ICON_CAPTION","Z885TBM08_ICON_R","Z886TBM08_ICON_G","Z887TBM08_ICON_B","Z872TBM08_DEL_FLG","Z873TBM08_CRT_DATETIME","Z874TBM08_CRT_USER_ID","Z875TBM08_CRT_PROG_NM",
"Z876TBM08_UPD_DATETIME","Z877TBM08_UPD_USER_ID","Z878TBM08_UPD_PROG_NM","Z879TBM08_UPD_COUNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbm08_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM08_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A873TBM08_CRT_DATETIME)==0||(new gx.date.gxdate(this.A873TBM08_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbm08_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM08_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A876TBM08_UPD_DATETIME)==0||(new gx.date.gxdate(this.A876TBM08_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=
1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.e111g51_client=function(){this.executeServerEvent("ENTER",true)};this.e121g51_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119,122,124,127,129,132,134,137,139,142,144];this.GXLastCtrlId=144;b[2]=
{fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",
grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBM08_AUTH_CD",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm08_auth_cd,isvalid:null,rgrid:[],fld:"TBM08_AUTH_CD",gxz:"Z191TBM08_AUTH_CD",gxold:"O191TBM08_AUTH_CD",gxvar:"A191TBM08_AUTH_CD",
ucs:[],op:[144,139,134,129,124,119,114,109,104,99,94,89,84,79,74,69,64,59,54,49,44],ip:[144,139,134,129,124,119,114,109,104,99,94,89,84,79,74,69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A191TBM08_AUTH_CD=a},v2z:function(a){gx.O.Z191TBM08_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBM08_AUTH_CD",gx.O.A191TBM08_AUTH_CD,0)},c2v:function(){gx.O.A191TBM08_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM08_AUTH_CD")},nac:gx.falseFn};b[42]={fld:"TEXTBLOCKTBM08_DM_MICHAKU_CRF_FLG",
format:0,grid:0};b[44]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_MICHAKU_CRF_FLG",gxz:"Z863TBM08_DM_MICHAKU_CRF_FLG",gxold:"O863TBM08_DM_MICHAKU_CRF_FLG",gxvar:"A863TBM08_DM_MICHAKU_CRF_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A863TBM08_DM_MICHAKU_CRF_FLG=a},v2z:function(a){gx.O.Z863TBM08_DM_MICHAKU_CRF_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_MICHAKU_CRF_FLG",gx.O.A863TBM08_DM_MICHAKU_CRF_FLG,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A863TBM08_DM_MICHAKU_CRF_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_MICHAKU_CRF_FLG")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBM08_DM_MICHAKU_MEMO_FLG",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_MICHAKU_MEMO_FLG",gxz:"Z864TBM08_DM_MICHAKU_MEMO_FLG",gxold:"O864TBM08_DM_MICHAKU_MEMO_FLG",
gxvar:"A864TBM08_DM_MICHAKU_MEMO_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A864TBM08_DM_MICHAKU_MEMO_FLG=a},v2z:function(a){gx.O.Z864TBM08_DM_MICHAKU_MEMO_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_MICHAKU_MEMO_FLG",gx.O.A864TBM08_DM_MICHAKU_MEMO_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A864TBM08_DM_MICHAKU_MEMO_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_MICHAKU_MEMO_FLG")},nac:gx.falseFn};
this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBM08_DM_MICHAKU_DM_FLG",format:0,grid:0};b[54]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_MICHAKU_DM_FLG",gxz:"Z865TBM08_DM_MICHAKU_DM_FLG",gxold:"O865TBM08_DM_MICHAKU_DM_FLG",gxvar:"A865TBM08_DM_MICHAKU_DM_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A865TBM08_DM_MICHAKU_DM_FLG=a},v2z:function(a){gx.O.Z865TBM08_DM_MICHAKU_DM_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_MICHAKU_DM_FLG",
gx.O.A865TBM08_DM_MICHAKU_DM_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A865TBM08_DM_MICHAKU_DM_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_MICHAKU_DM_FLG")},nac:gx.falseFn};this.declareDomainHdlr(54,function(){});b[57]={fld:"TEXTBLOCKTBM08_DM_ARRI_CRF_FLG",format:0,grid:0};b[59]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_ARRI_CRF_FLG",gxz:"Z866TBM08_DM_ARRI_CRF_FLG",
gxold:"O866TBM08_DM_ARRI_CRF_FLG",gxvar:"A866TBM08_DM_ARRI_CRF_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A866TBM08_DM_ARRI_CRF_FLG=a},v2z:function(a){gx.O.Z866TBM08_DM_ARRI_CRF_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_ARRI_CRF_FLG",gx.O.A866TBM08_DM_ARRI_CRF_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A866TBM08_DM_ARRI_CRF_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_ARRI_CRF_FLG")},nac:gx.falseFn};
this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTBM08_DM_ARRI_MEMO_FLG",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_ARRI_MEMO_FLG",gxz:"Z867TBM08_DM_ARRI_MEMO_FLG",gxold:"O867TBM08_DM_ARRI_MEMO_FLG",gxvar:"A867TBM08_DM_ARRI_MEMO_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A867TBM08_DM_ARRI_MEMO_FLG=a},v2z:function(a){gx.O.Z867TBM08_DM_ARRI_MEMO_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_ARRI_MEMO_FLG",
gx.O.A867TBM08_DM_ARRI_MEMO_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A867TBM08_DM_ARRI_MEMO_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_ARRI_MEMO_FLG")},nac:gx.falseFn};this.declareDomainHdlr(64,function(){});b[67]={fld:"TEXTBLOCKTBM08_DM_ARRI_DM_FLG",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_ARRI_DM_FLG",gxz:"Z868TBM08_DM_ARRI_DM_FLG",
gxold:"O868TBM08_DM_ARRI_DM_FLG",gxvar:"A868TBM08_DM_ARRI_DM_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A868TBM08_DM_ARRI_DM_FLG=a},v2z:function(a){gx.O.Z868TBM08_DM_ARRI_DM_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_ARRI_DM_FLG",gx.O.A868TBM08_DM_ARRI_DM_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A868TBM08_DM_ARRI_DM_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_ARRI_DM_FLG")},nac:gx.falseFn};
this.declareDomainHdlr(69,function(){});b[72]={fld:"TEXTBLOCKTBM08_DM_KAIJO_CRF_FLG",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_KAIJO_CRF_FLG",gxz:"Z869TBM08_DM_KAIJO_CRF_FLG",gxold:"O869TBM08_DM_KAIJO_CRF_FLG",gxvar:"A869TBM08_DM_KAIJO_CRF_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A869TBM08_DM_KAIJO_CRF_FLG=a},v2z:function(a){gx.O.Z869TBM08_DM_KAIJO_CRF_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_KAIJO_CRF_FLG",
gx.O.A869TBM08_DM_KAIJO_CRF_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A869TBM08_DM_KAIJO_CRF_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_KAIJO_CRF_FLG")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTBM08_DM_KAIJO_MEMO_FLG",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_KAIJO_MEMO_FLG",gxz:"Z870TBM08_DM_KAIJO_MEMO_FLG",
gxold:"O870TBM08_DM_KAIJO_MEMO_FLG",gxvar:"A870TBM08_DM_KAIJO_MEMO_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A870TBM08_DM_KAIJO_MEMO_FLG=a},v2z:function(a){gx.O.Z870TBM08_DM_KAIJO_MEMO_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_KAIJO_MEMO_FLG",gx.O.A870TBM08_DM_KAIJO_MEMO_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A870TBM08_DM_KAIJO_MEMO_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_KAIJO_MEMO_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBM08_DM_KAIJO_DM_FLG",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DM_KAIJO_DM_FLG",gxz:"Z871TBM08_DM_KAIJO_DM_FLG",gxold:"O871TBM08_DM_KAIJO_DM_FLG",gxvar:"A871TBM08_DM_KAIJO_DM_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A871TBM08_DM_KAIJO_DM_FLG=a},v2z:function(a){gx.O.Z871TBM08_DM_KAIJO_DM_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DM_KAIJO_DM_FLG",
gx.O.A871TBM08_DM_KAIJO_DM_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A871TBM08_DM_KAIJO_DM_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DM_KAIJO_DM_FLG")},nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBM08_ICON_CAPTION",format:0,grid:0};b[89]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_ICON_CAPTION",gxz:"Z881TBM08_ICON_CAPTION",gxold:"O881TBM08_ICON_CAPTION",
gxvar:"A881TBM08_ICON_CAPTION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A881TBM08_ICON_CAPTION=a},v2z:function(a){gx.O.Z881TBM08_ICON_CAPTION=a},v2c:function(){gx.fn.setControlValue("TBM08_ICON_CAPTION",gx.O.A881TBM08_ICON_CAPTION,0)},c2v:function(){gx.O.A881TBM08_ICON_CAPTION=this.val()},val:function(){return gx.fn.getControlValue("TBM08_ICON_CAPTION")},nac:gx.falseFn};b[92]={fld:"TEXTBLOCKTBM08_ICON_R",format:0,grid:0};b[94]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",
ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_ICON_R",gxz:"Z885TBM08_ICON_R",gxold:"O885TBM08_ICON_R",gxvar:"A885TBM08_ICON_R",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A885TBM08_ICON_R=gx.num.intval(a)},v2z:function(a){gx.O.Z885TBM08_ICON_R=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM08_ICON_R",gx.O.A885TBM08_ICON_R,0)},c2v:function(){gx.O.A885TBM08_ICON_R=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM08_ICON_R",
",")},nac:gx.falseFn};b[97]={fld:"TEXTBLOCKTBM08_ICON_G",format:0,grid:0};b[99]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_ICON_G",gxz:"Z886TBM08_ICON_G",gxold:"O886TBM08_ICON_G",gxvar:"A886TBM08_ICON_G",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A886TBM08_ICON_G=gx.num.intval(a)},v2z:function(a){gx.O.Z886TBM08_ICON_G=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM08_ICON_G",gx.O.A886TBM08_ICON_G,
0)},c2v:function(){gx.O.A886TBM08_ICON_G=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM08_ICON_G",",")},nac:gx.falseFn};b[102]={fld:"TEXTBLOCKTBM08_ICON_B",format:0,grid:0};b[104]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_ICON_B",gxz:"Z887TBM08_ICON_B",gxold:"O887TBM08_ICON_B",gxvar:"A887TBM08_ICON_B",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A887TBM08_ICON_B=gx.num.intval(a)},
v2z:function(a){gx.O.Z887TBM08_ICON_B=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM08_ICON_B",gx.O.A887TBM08_ICON_B,0)},c2v:function(){gx.O.A887TBM08_ICON_B=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM08_ICON_B",",")},nac:gx.falseFn};b[107]={fld:"TEXTBLOCKTBM08_DEL_FLG",format:0,grid:0};b[109]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_DEL_FLG",gxz:"Z872TBM08_DEL_FLG",gxold:"O872TBM08_DEL_FLG",
gxvar:"A872TBM08_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A872TBM08_DEL_FLG=a},v2z:function(a){gx.O.Z872TBM08_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM08_DEL_FLG",gx.O.A872TBM08_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A872TBM08_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM08_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(109,function(){});b[112]={fld:"TEXTBLOCKTBM08_CRT_DATETIME",
format:0,grid:0};b[114]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm08_crt_datetime,isvalid:null,rgrid:[],fld:"TBM08_CRT_DATETIME",gxz:"Z873TBM08_CRT_DATETIME",gxold:"O873TBM08_CRT_DATETIME",gxvar:"A873TBM08_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[114],ip:[114],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A873TBM08_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z873TBM08_CRT_DATETIME=gx.fn.toDatetimeValue(a)},
v2c:function(){gx.fn.setControlValue("TBM08_CRT_DATETIME",gx.O.A873TBM08_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A873TBM08_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM08_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTBM08_CRT_USER_ID",format:0,grid:0};b[119]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBM08_CRT_USER_ID",gxz:"Z874TBM08_CRT_USER_ID",gxold:"O874TBM08_CRT_USER_ID",gxvar:"A874TBM08_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A874TBM08_CRT_USER_ID=a},v2z:function(a){gx.O.Z874TBM08_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM08_CRT_USER_ID",gx.O.A874TBM08_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A874TBM08_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM08_CRT_USER_ID")},
nac:gx.falseFn};this.declareDomainHdlr(119,function(){});b[122]={fld:"TEXTBLOCKTBM08_CRT_PROG_NM",format:0,grid:0};b[124]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_CRT_PROG_NM",gxz:"Z875TBM08_CRT_PROG_NM",gxold:"O875TBM08_CRT_PROG_NM",gxvar:"A875TBM08_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A875TBM08_CRT_PROG_NM=a},v2z:function(a){gx.O.Z875TBM08_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM08_CRT_PROG_NM",
gx.O.A875TBM08_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A875TBM08_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM08_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(124,function(){});b[127]={fld:"TEXTBLOCKTBM08_UPD_DATETIME",format:0,grid:0};b[129]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm08_upd_datetime,isvalid:null,rgrid:[],fld:"TBM08_UPD_DATETIME",gxz:"Z876TBM08_UPD_DATETIME",
gxold:"O876TBM08_UPD_DATETIME",gxvar:"A876TBM08_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[129],ip:[129],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A876TBM08_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z876TBM08_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM08_UPD_DATETIME",gx.O.A876TBM08_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A876TBM08_UPD_DATETIME=
gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM08_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(129,function(){});b[132]={fld:"TEXTBLOCKTBM08_UPD_USER_ID",format:0,grid:0};b[134]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_UPD_USER_ID",gxz:"Z877TBM08_UPD_USER_ID",gxold:"O877TBM08_UPD_USER_ID",gxvar:"A877TBM08_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A877TBM08_UPD_USER_ID=
a},v2z:function(a){gx.O.Z877TBM08_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM08_UPD_USER_ID",gx.O.A877TBM08_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A877TBM08_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM08_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(134,function(){});b[137]={fld:"TEXTBLOCKTBM08_UPD_PROG_NM",format:0,grid:0};b[139]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBM08_UPD_PROG_NM",gxz:"Z878TBM08_UPD_PROG_NM",gxold:"O878TBM08_UPD_PROG_NM",gxvar:"A878TBM08_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A878TBM08_UPD_PROG_NM=a},v2z:function(a){gx.O.Z878TBM08_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM08_UPD_PROG_NM",gx.O.A878TBM08_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A878TBM08_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM08_UPD_PROG_NM")},
nac:gx.falseFn};this.declareDomainHdlr(139,function(){});b[142]={fld:"TEXTBLOCKTBM08_UPD_COUNT",format:0,grid:0};b[144]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM08_UPD_COUNT",gxz:"Z879TBM08_UPD_COUNT",gxold:"O879TBM08_UPD_COUNT",gxvar:"A879TBM08_UPD_COUNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A879TBM08_UPD_COUNT=gx.num.intval(a)},v2z:function(a){gx.O.Z879TBM08_UPD_COUNT=gx.num.intval(a)},
v2c:function(){gx.fn.setControlValue("TBM08_UPD_COUNT",gx.O.A879TBM08_UPD_COUNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A879TBM08_UPD_COUNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM08_UPD_COUNT",",")},nac:gx.falseFn};this.declareDomainHdlr(144,function(){});this.O881TBM08_ICON_CAPTION=this.Z881TBM08_ICON_CAPTION=this.A881TBM08_ICON_CAPTION=this.O871TBM08_DM_KAIJO_DM_FLG=this.Z871TBM08_DM_KAIJO_DM_FLG=this.A871TBM08_DM_KAIJO_DM_FLG=
this.O870TBM08_DM_KAIJO_MEMO_FLG=this.Z870TBM08_DM_KAIJO_MEMO_FLG=this.A870TBM08_DM_KAIJO_MEMO_FLG=this.O869TBM08_DM_KAIJO_CRF_FLG=this.Z869TBM08_DM_KAIJO_CRF_FLG=this.A869TBM08_DM_KAIJO_CRF_FLG=this.O868TBM08_DM_ARRI_DM_FLG=this.Z868TBM08_DM_ARRI_DM_FLG=this.A868TBM08_DM_ARRI_DM_FLG=this.O867TBM08_DM_ARRI_MEMO_FLG=this.Z867TBM08_DM_ARRI_MEMO_FLG=this.A867TBM08_DM_ARRI_MEMO_FLG=this.O866TBM08_DM_ARRI_CRF_FLG=this.Z866TBM08_DM_ARRI_CRF_FLG=this.A866TBM08_DM_ARRI_CRF_FLG=this.O865TBM08_DM_MICHAKU_DM_FLG=
this.Z865TBM08_DM_MICHAKU_DM_FLG=this.A865TBM08_DM_MICHAKU_DM_FLG=this.O864TBM08_DM_MICHAKU_MEMO_FLG=this.Z864TBM08_DM_MICHAKU_MEMO_FLG=this.A864TBM08_DM_MICHAKU_MEMO_FLG=this.O863TBM08_DM_MICHAKU_CRF_FLG=this.Z863TBM08_DM_MICHAKU_CRF_FLG=this.A863TBM08_DM_MICHAKU_CRF_FLG=this.O191TBM08_AUTH_CD=this.Z191TBM08_AUTH_CD=this.A191TBM08_AUTH_CD="";this.O887TBM08_ICON_B=this.Z887TBM08_ICON_B=this.A887TBM08_ICON_B=this.O886TBM08_ICON_G=this.Z886TBM08_ICON_G=this.A886TBM08_ICON_G=this.O885TBM08_ICON_R=this.Z885TBM08_ICON_R=
this.A885TBM08_ICON_R=0;this.O872TBM08_DEL_FLG=this.Z872TBM08_DEL_FLG=this.A872TBM08_DEL_FLG="";this.A873TBM08_CRT_DATETIME=gx.date.nullDate();this.Z873TBM08_CRT_DATETIME=gx.date.nullDate();this.O873TBM08_CRT_DATETIME=gx.date.nullDate();this.O875TBM08_CRT_PROG_NM=this.Z875TBM08_CRT_PROG_NM=this.A875TBM08_CRT_PROG_NM=this.O874TBM08_CRT_USER_ID=this.Z874TBM08_CRT_USER_ID=this.A874TBM08_CRT_USER_ID="";this.A876TBM08_UPD_DATETIME=gx.date.nullDate();this.Z876TBM08_UPD_DATETIME=gx.date.nullDate();this.O876TBM08_UPD_DATETIME=
gx.date.nullDate();this.O878TBM08_UPD_PROG_NM=this.Z878TBM08_UPD_PROG_NM=this.A878TBM08_UPD_PROG_NM=this.O877TBM08_UPD_USER_ID=this.Z877TBM08_UPD_USER_ID=this.A877TBM08_UPD_USER_ID="";this.O879TBM08_UPD_COUNT=this.Z879TBM08_UPD_COUNT=this.A879TBM08_UPD_COUNT=0;this.A881TBM08_ICON_CAPTION=this.A871TBM08_DM_KAIJO_DM_FLG=this.A870TBM08_DM_KAIJO_MEMO_FLG=this.A869TBM08_DM_KAIJO_CRF_FLG=this.A868TBM08_DM_ARRI_DM_FLG=this.A867TBM08_DM_ARRI_MEMO_FLG=this.A866TBM08_DM_ARRI_CRF_FLG=this.A865TBM08_DM_MICHAKU_DM_FLG=
this.A864TBM08_DM_MICHAKU_MEMO_FLG=this.A863TBM08_DM_MICHAKU_CRF_FLG=this.A191TBM08_AUTH_CD="";this.A887TBM08_ICON_B=this.A886TBM08_ICON_G=this.A885TBM08_ICON_R=0;this.A872TBM08_DEL_FLG="";this.A873TBM08_CRT_DATETIME=gx.date.nullDate();this.A875TBM08_CRT_PROG_NM=this.A874TBM08_CRT_USER_ID="";this.A876TBM08_UPD_DATETIME=gx.date.nullDate();this.A878TBM08_UPD_PROG_NM=this.A877TBM08_UPD_USER_ID="";this.A879TBM08_UPD_COUNT=0;this.Events={e111g51_client:["ENTER",true],e121g51_client:["CANCEL",true]};this.EnterCtrl=
["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbm08_auth_inp_lvl);
