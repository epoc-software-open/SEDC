gx.evt.autoSkip=!1;
gx.define("tbt14_crf_memo",!1,function(){this.ServerClass="tbt14_crf_memo";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbt14_study_id=function(){try{var a=gx.util.balloon.getNew("TBT14_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt14_subject_id=
function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt14_subject_id",["gx.O.A140TBT14_STUDY_ID","gx.O.A142TBT14_SUBJECT_ID"],[]);return true};this.Valid_Tbt14_memo_no=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt14_memo_no",["gx.O.A140TBT14_STUDY_ID","gx.O.A142TBT14_SUBJECT_ID","gx.O.A198TBT14_MEMO_NO",'gx.date.urlDateTime(gx.O.A480TBT14_CRT_DATETIME,"Y4MD")',"gx.O.A481TBT14_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A483TBT14_UPD_DATETIME,"Y4MD")',"gx.O.A484TBT14_UPD_USER_ID","gx.O.A486TBT14_UPD_CNT",
"gx.O.A474TBT14_CRF_ID","gx.O.A941TBT14_CRF_EDA_NO","gx.O.A475TBT14_CRF_VERSION","gx.O.A901TBT14_MEMO_KBN","gx.O.A477TBT14_MEMO","gx.O.A929TBT14_REQUEST_SITE_ID","gx.O.A930TBT14_REQUEST_AUTH_CD","gx.O.A931TBT14_CRT_AUTH_CD","gx.O.A927TBT14_KAKUNIN_FLG","gx.O.A928TBT14_KAKUNIN_USER_ID","gx.O.A934TBT14_KAKUNIN_COMMENT","gx.O.A902TBT14_KANRYO_FLG","gx.O.A479TBT14_DEL_FLG","gx.O.A482TBT14_CRT_PROG_NM","gx.O.A485TBT14_UPD_PROG_NM"],["A480TBT14_CRT_DATETIME","A481TBT14_CRT_USER_ID","A483TBT14_UPD_DATETIME",
"A484TBT14_UPD_USER_ID","A486TBT14_UPD_CNT","A474TBT14_CRF_ID","A941TBT14_CRF_EDA_NO","A475TBT14_CRF_VERSION","A901TBT14_MEMO_KBN","A477TBT14_MEMO","A929TBT14_REQUEST_SITE_ID","A930TBT14_REQUEST_AUTH_CD","A931TBT14_CRT_AUTH_CD","A927TBT14_KAKUNIN_FLG","A928TBT14_KAKUNIN_USER_ID","A934TBT14_KAKUNIN_COMMENT","A902TBT14_KANRYO_FLG","A479TBT14_DEL_FLG","A482TBT14_CRT_PROG_NM","A485TBT14_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z140TBT14_STUDY_ID","Z142TBT14_SUBJECT_ID","Z198TBT14_MEMO_NO","Z480TBT14_CRT_DATETIME",
"Z481TBT14_CRT_USER_ID","Z483TBT14_UPD_DATETIME","Z484TBT14_UPD_USER_ID","Z486TBT14_UPD_CNT","Z474TBT14_CRF_ID","Z941TBT14_CRF_EDA_NO","Z475TBT14_CRF_VERSION","Z901TBT14_MEMO_KBN","Z477TBT14_MEMO","Z929TBT14_REQUEST_SITE_ID","Z930TBT14_REQUEST_AUTH_CD","Z931TBT14_CRT_AUTH_CD","Z927TBT14_KAKUNIN_FLG","Z928TBT14_KAKUNIN_USER_ID","Z934TBT14_KAKUNIN_COMMENT","Z902TBT14_KANRYO_FLG","Z479TBT14_DEL_FLG","Z482TBT14_CRT_PROG_NM","Z485TBT14_UPD_PROG_NM","ZV9Pgmname","O486TBT14_UPD_CNT",["BTN_DELETE2","Enabled"],
["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbt14_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBT14_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A480TBT14_CRT_DATETIME)==0||(new gx.date.gxdate(this.A480TBT14_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};
this.Valid_Tbt14_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBT14_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A483TBT14_UPD_DATETIME)==0||(new gx.date.gxdate(this.A483TBT14_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt14_upd_cnt=
function(){try{var a=gx.util.balloon.getNew("TBT14_UPD_CNT");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e120s2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130s27_client=function(){this.executeServerEvent("ENTER",true)};this.e140s27_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,
72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119,122,124,127,129,132,134,137,139,142,144,147,149];this.GXLastCtrlId=149;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",
grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBT14_STUDY_ID",format:0,grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",
ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_study_id,isvalid:null,rgrid:[],fld:"TBT14_STUDY_ID",gxz:"Z140TBT14_STUDY_ID",gxold:"O140TBT14_STUDY_ID",gxvar:"A140TBT14_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A140TBT14_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z140TBT14_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_STUDY_ID",gx.O.A140TBT14_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A140TBT14_STUDY_ID=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBT14_SUBJECT_ID",format:0,grid:0};b[44]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_subject_id,isvalid:null,rgrid:[],fld:"TBT14_SUBJECT_ID",gxz:"Z142TBT14_SUBJECT_ID",gxold:"O142TBT14_SUBJECT_ID",gxvar:"A142TBT14_SUBJECT_ID",ucs:[],op:[],ip:[44,39],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A142TBT14_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z142TBT14_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_SUBJECT_ID",gx.O.A142TBT14_SUBJECT_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A142TBT14_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_SUBJECT_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBT14_MEMO_NO",format:0,
grid:0};b[49]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_memo_no,isvalid:null,rgrid:[],fld:"TBT14_MEMO_NO",gxz:"Z198TBT14_MEMO_NO",gxold:"O198TBT14_MEMO_NO",gxvar:"A198TBT14_MEMO_NO",ucs:[],op:[144,129,114,109,104,99,94,89,84,79,74,69,64,59,54,149,139,134,124,119],ip:[144,129,114,109,104,99,94,89,84,79,74,69,64,59,54,149,139,134,124,119,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A198TBT14_MEMO_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z198TBT14_MEMO_NO=
gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_MEMO_NO",gx.O.A198TBT14_MEMO_NO,0)},c2v:function(){gx.O.A198TBT14_MEMO_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_MEMO_NO",",")},nac:gx.falseFn};b[52]={fld:"TEXTBLOCKTBT14_CRF_ID",format:0,grid:0};b[54]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRF_ID",gxz:"Z474TBT14_CRF_ID",gxold:"O474TBT14_CRF_ID",gxvar:"A474TBT14_CRF_ID",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A474TBT14_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z474TBT14_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRF_ID",gx.O.A474TBT14_CRF_ID,0)},c2v:function(){gx.O.A474TBT14_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_CRF_ID",",")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBT14_CRF_EDA_NO",format:0,grid:0};b[59]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,
gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRF_EDA_NO",gxz:"Z941TBT14_CRF_EDA_NO",gxold:"O941TBT14_CRF_EDA_NO",gxvar:"A941TBT14_CRF_EDA_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A941TBT14_CRF_EDA_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z941TBT14_CRF_EDA_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRF_EDA_NO",gx.O.A941TBT14_CRF_EDA_NO,0)},c2v:function(){gx.O.A941TBT14_CRF_EDA_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_CRF_EDA_NO",
",")},nac:gx.falseFn};b[62]={fld:"TEXTBLOCKTBT14_CRF_VERSION",format:0,grid:0};b[64]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRF_VERSION",gxz:"Z475TBT14_CRF_VERSION",gxold:"O475TBT14_CRF_VERSION",gxvar:"A475TBT14_CRF_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A475TBT14_CRF_VERSION=gx.num.intval(a)},v2z:function(a){gx.O.Z475TBT14_CRF_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRF_VERSION",
gx.O.A475TBT14_CRF_VERSION,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A475TBT14_CRF_VERSION=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_CRF_VERSION",",")},nac:gx.falseFn};this.declareDomainHdlr(64,function(){});b[67]={fld:"TEXTBLOCKTBT14_MEMO_KBN",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_MEMO_KBN",gxz:"Z901TBT14_MEMO_KBN",gxold:"O901TBT14_MEMO_KBN",
gxvar:"A901TBT14_MEMO_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A901TBT14_MEMO_KBN=a},v2z:function(a){gx.O.Z901TBT14_MEMO_KBN=a},v2c:function(){gx.fn.setControlValue("TBT14_MEMO_KBN",gx.O.A901TBT14_MEMO_KBN,0)},c2v:function(){gx.O.A901TBT14_MEMO_KBN=this.val()},val:function(){return gx.fn.getControlValue("TBT14_MEMO_KBN")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTBT14_MEMO",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:2E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBT14_MEMO",gxz:"Z477TBT14_MEMO",gxold:"O477TBT14_MEMO",gxvar:"A477TBT14_MEMO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A477TBT14_MEMO=a},v2z:function(a){gx.O.Z477TBT14_MEMO=a},v2c:function(){gx.fn.setControlValue("TBT14_MEMO",gx.O.A477TBT14_MEMO,0)},c2v:function(){gx.O.A477TBT14_MEMO=this.val()},val:function(){return gx.fn.getControlValue("TBT14_MEMO")},nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBT14_REQUEST_SITE_ID",format:0,grid:0};b[79]=
{lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_REQUEST_SITE_ID",gxz:"Z929TBT14_REQUEST_SITE_ID",gxold:"O929TBT14_REQUEST_SITE_ID",gxvar:"A929TBT14_REQUEST_SITE_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A929TBT14_REQUEST_SITE_ID=a},v2z:function(a){gx.O.Z929TBT14_REQUEST_SITE_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_REQUEST_SITE_ID",gx.O.A929TBT14_REQUEST_SITE_ID,0);typeof this.dom_hdl=="function"&&
this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A929TBT14_REQUEST_SITE_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_REQUEST_SITE_ID")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBT14_REQUEST_AUTH_CD",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_REQUEST_AUTH_CD",gxz:"Z930TBT14_REQUEST_AUTH_CD",gxold:"O930TBT14_REQUEST_AUTH_CD",gxvar:"A930TBT14_REQUEST_AUTH_CD",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A930TBT14_REQUEST_AUTH_CD=a},v2z:function(a){gx.O.Z930TBT14_REQUEST_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT14_REQUEST_AUTH_CD",gx.O.A930TBT14_REQUEST_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A930TBT14_REQUEST_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT14_REQUEST_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBT14_CRT_AUTH_CD",
format:0,grid:0};b[89]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRT_AUTH_CD",gxz:"Z931TBT14_CRT_AUTH_CD",gxold:"O931TBT14_CRT_AUTH_CD",gxvar:"A931TBT14_CRT_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A931TBT14_CRT_AUTH_CD=a},v2z:function(a){gx.O.Z931TBT14_CRT_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_AUTH_CD",gx.O.A931TBT14_CRT_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A931TBT14_CRT_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});b[92]={fld:"TEXTBLOCKTBT14_KAKUNIN_FLG",format:0,grid:0};b[94]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_KAKUNIN_FLG",gxz:"Z927TBT14_KAKUNIN_FLG",gxold:"O927TBT14_KAKUNIN_FLG",gxvar:"A927TBT14_KAKUNIN_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A927TBT14_KAKUNIN_FLG=
a},v2z:function(a){gx.O.Z927TBT14_KAKUNIN_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_FLG",gx.O.A927TBT14_KAKUNIN_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A927TBT14_KAKUNIN_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_FLG")},nac:gx.falseFn};this.declareDomainHdlr(94,function(){});b[97]={fld:"TEXTBLOCKTBT14_KAKUNIN_USER_ID",format:0,grid:0};b[99]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBT14_KAKUNIN_USER_ID",gxz:"Z928TBT14_KAKUNIN_USER_ID",gxold:"O928TBT14_KAKUNIN_USER_ID",gxvar:"A928TBT14_KAKUNIN_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A928TBT14_KAKUNIN_USER_ID=a},v2z:function(a){gx.O.Z928TBT14_KAKUNIN_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_USER_ID",gx.O.A928TBT14_KAKUNIN_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A928TBT14_KAKUNIN_USER_ID=
this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(99,function(){});b[102]={fld:"TEXTBLOCKTBT14_KAKUNIN_COMMENT",format:0,grid:0};b[104]={lvl:0,type:"svchar",len:2E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_KAKUNIN_COMMENT",gxz:"Z934TBT14_KAKUNIN_COMMENT",gxold:"O934TBT14_KAKUNIN_COMMENT",gxvar:"A934TBT14_KAKUNIN_COMMENT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A934TBT14_KAKUNIN_COMMENT=
a},v2z:function(a){gx.O.Z934TBT14_KAKUNIN_COMMENT=a},v2c:function(){gx.fn.setControlValue("TBT14_KAKUNIN_COMMENT",gx.O.A934TBT14_KAKUNIN_COMMENT,0)},c2v:function(){gx.O.A934TBT14_KAKUNIN_COMMENT=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KAKUNIN_COMMENT")},nac:gx.falseFn};b[107]={fld:"TEXTBLOCKTBT14_KANRYO_FLG",format:0,grid:0};b[109]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_KANRYO_FLG",gxz:"Z902TBT14_KANRYO_FLG",
gxold:"O902TBT14_KANRYO_FLG",gxvar:"A902TBT14_KANRYO_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A902TBT14_KANRYO_FLG=a},v2z:function(a){gx.O.Z902TBT14_KANRYO_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_KANRYO_FLG",gx.O.A902TBT14_KANRYO_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A902TBT14_KANRYO_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_KANRYO_FLG")},nac:gx.falseFn};this.declareDomainHdlr(109,function(){});
b[112]={fld:"TEXTBLOCKTBT14_DEL_FLG",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_DEL_FLG",gxz:"Z479TBT14_DEL_FLG",gxold:"O479TBT14_DEL_FLG",gxvar:"A479TBT14_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A479TBT14_DEL_FLG=a},v2z:function(a){gx.O.Z479TBT14_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT14_DEL_FLG",gx.O.A479TBT14_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A479TBT14_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT14_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTBT14_CRT_DATETIME",format:0,grid:0};b[119]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_crt_datetime,isvalid:null,rgrid:[],fld:"TBT14_CRT_DATETIME",gxz:"Z480TBT14_CRT_DATETIME",gxold:"O480TBT14_CRT_DATETIME",gxvar:"A480TBT14_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,
pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[119],ip:[119],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A480TBT14_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z480TBT14_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT14_CRT_DATETIME",gx.O.A480TBT14_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A480TBT14_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT14_CRT_DATETIME")},
nac:gx.falseFn};this.declareDomainHdlr(119,function(){});b[122]={fld:"TEXTBLOCKTBT14_CRT_USER_ID",format:0,grid:0};b[124]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRT_USER_ID",gxz:"Z481TBT14_CRT_USER_ID",gxold:"O481TBT14_CRT_USER_ID",gxvar:"A481TBT14_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A481TBT14_CRT_USER_ID=a},v2z:function(a){gx.O.Z481TBT14_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_USER_ID",
gx.O.A481TBT14_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A481TBT14_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(124,function(){});b[127]={fld:"TEXTBLOCKTBT14_CRT_PROG_NM",format:0,grid:0};b[129]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_CRT_PROG_NM",gxz:"Z482TBT14_CRT_PROG_NM",gxold:"O482TBT14_CRT_PROG_NM",
gxvar:"A482TBT14_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A482TBT14_CRT_PROG_NM=a},v2z:function(a){gx.O.Z482TBT14_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT14_CRT_PROG_NM",gx.O.A482TBT14_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A482TBT14_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT14_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(129,function(){});b[132]={fld:"TEXTBLOCKTBT14_UPD_DATETIME",
format:0,grid:0};b[134]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_upd_datetime,isvalid:null,rgrid:[],fld:"TBT14_UPD_DATETIME",gxz:"Z483TBT14_UPD_DATETIME",gxold:"O483TBT14_UPD_DATETIME",gxvar:"A483TBT14_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[134],ip:[134],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A483TBT14_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z483TBT14_UPD_DATETIME=gx.fn.toDatetimeValue(a)},
v2c:function(){gx.fn.setControlValue("TBT14_UPD_DATETIME",gx.O.A483TBT14_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A483TBT14_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT14_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(134,function(){});b[137]={fld:"TEXTBLOCKTBT14_UPD_USER_ID",format:0,grid:0};b[139]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBT14_UPD_USER_ID",gxz:"Z484TBT14_UPD_USER_ID",gxold:"O484TBT14_UPD_USER_ID",gxvar:"A484TBT14_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A484TBT14_UPD_USER_ID=a},v2z:function(a){gx.O.Z484TBT14_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT14_UPD_USER_ID",gx.O.A484TBT14_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A484TBT14_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT14_UPD_USER_ID")},
nac:gx.falseFn};this.declareDomainHdlr(139,function(){});b[142]={fld:"TEXTBLOCKTBT14_UPD_PROG_NM",format:0,grid:0};b[144]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT14_UPD_PROG_NM",gxz:"Z485TBT14_UPD_PROG_NM",gxold:"O485TBT14_UPD_PROG_NM",gxvar:"A485TBT14_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A485TBT14_UPD_PROG_NM=a},v2z:function(a){gx.O.Z485TBT14_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT14_UPD_PROG_NM",
gx.O.A485TBT14_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A485TBT14_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT14_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(144,function(){});b[147]={fld:"TEXTBLOCKTBT14_UPD_CNT",format:0,grid:0};b[149]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt14_upd_cnt,isvalid:null,rgrid:[],fld:"TBT14_UPD_CNT",gxz:"Z486TBT14_UPD_CNT",
gxold:"O486TBT14_UPD_CNT",gxvar:"A486TBT14_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A486TBT14_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z486TBT14_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT14_UPD_CNT",gx.O.A486TBT14_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A486TBT14_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT14_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(149,
function(){});this.O475TBT14_CRF_VERSION=this.Z475TBT14_CRF_VERSION=this.A475TBT14_CRF_VERSION=this.O941TBT14_CRF_EDA_NO=this.Z941TBT14_CRF_EDA_NO=this.A941TBT14_CRF_EDA_NO=this.O474TBT14_CRF_ID=this.Z474TBT14_CRF_ID=this.A474TBT14_CRF_ID=this.O198TBT14_MEMO_NO=this.Z198TBT14_MEMO_NO=this.A198TBT14_MEMO_NO=this.O142TBT14_SUBJECT_ID=this.Z142TBT14_SUBJECT_ID=this.A142TBT14_SUBJECT_ID=this.O140TBT14_STUDY_ID=this.Z140TBT14_STUDY_ID=this.A140TBT14_STUDY_ID=0;this.O479TBT14_DEL_FLG=this.Z479TBT14_DEL_FLG=
this.A479TBT14_DEL_FLG=this.O902TBT14_KANRYO_FLG=this.Z902TBT14_KANRYO_FLG=this.A902TBT14_KANRYO_FLG=this.O934TBT14_KAKUNIN_COMMENT=this.Z934TBT14_KAKUNIN_COMMENT=this.A934TBT14_KAKUNIN_COMMENT=this.O928TBT14_KAKUNIN_USER_ID=this.Z928TBT14_KAKUNIN_USER_ID=this.A928TBT14_KAKUNIN_USER_ID=this.O927TBT14_KAKUNIN_FLG=this.Z927TBT14_KAKUNIN_FLG=this.A927TBT14_KAKUNIN_FLG=this.O931TBT14_CRT_AUTH_CD=this.Z931TBT14_CRT_AUTH_CD=this.A931TBT14_CRT_AUTH_CD=this.O930TBT14_REQUEST_AUTH_CD=this.Z930TBT14_REQUEST_AUTH_CD=
this.A930TBT14_REQUEST_AUTH_CD=this.O929TBT14_REQUEST_SITE_ID=this.Z929TBT14_REQUEST_SITE_ID=this.A929TBT14_REQUEST_SITE_ID=this.O477TBT14_MEMO=this.Z477TBT14_MEMO=this.A477TBT14_MEMO=this.O901TBT14_MEMO_KBN=this.Z901TBT14_MEMO_KBN=this.A901TBT14_MEMO_KBN="";this.A480TBT14_CRT_DATETIME=gx.date.nullDate();this.Z480TBT14_CRT_DATETIME=gx.date.nullDate();this.O480TBT14_CRT_DATETIME=gx.date.nullDate();this.O482TBT14_CRT_PROG_NM=this.Z482TBT14_CRT_PROG_NM=this.A482TBT14_CRT_PROG_NM=this.O481TBT14_CRT_USER_ID=
this.Z481TBT14_CRT_USER_ID=this.A481TBT14_CRT_USER_ID="";this.A483TBT14_UPD_DATETIME=gx.date.nullDate();this.Z483TBT14_UPD_DATETIME=gx.date.nullDate();this.O483TBT14_UPD_DATETIME=gx.date.nullDate();this.O485TBT14_UPD_PROG_NM=this.Z485TBT14_UPD_PROG_NM=this.A485TBT14_UPD_PROG_NM=this.O484TBT14_UPD_USER_ID=this.Z484TBT14_UPD_USER_ID=this.A484TBT14_UPD_USER_ID="";this.O486TBT14_UPD_CNT=this.Z486TBT14_UPD_CNT=this.A486TBT14_UPD_CNT=0;this.AV9Pgmname=this.AV8W_BC_FLG="";this.A198TBT14_MEMO_NO=this.A142TBT14_SUBJECT_ID=
this.A140TBT14_STUDY_ID=0;this.A480TBT14_CRT_DATETIME=gx.date.nullDate();this.A481TBT14_CRT_USER_ID="";this.A483TBT14_UPD_DATETIME=gx.date.nullDate();this.A484TBT14_UPD_USER_ID="";this.A475TBT14_CRF_VERSION=this.A941TBT14_CRF_EDA_NO=this.A474TBT14_CRF_ID=this.A486TBT14_UPD_CNT=0;this.A485TBT14_UPD_PROG_NM=this.A482TBT14_CRT_PROG_NM=this.A479TBT14_DEL_FLG=this.A902TBT14_KANRYO_FLG=this.A934TBT14_KAKUNIN_COMMENT=this.A928TBT14_KAKUNIN_USER_ID=this.A927TBT14_KAKUNIN_FLG=this.A931TBT14_CRT_AUTH_CD=this.A930TBT14_REQUEST_AUTH_CD=
this.A929TBT14_REQUEST_SITE_ID=this.A477TBT14_MEMO=this.A901TBT14_MEMO_KBN="";this.Events={e120s2_client:["AFTER TRN",true],e130s27_client:["ENTER",true],e140s27_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[27]=["O486TBT14_UPD_CNT"]});gx.setParentObj(new tbt14_crf_memo);
