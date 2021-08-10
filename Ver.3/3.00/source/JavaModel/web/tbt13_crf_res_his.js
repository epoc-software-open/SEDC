gx.evt.autoSkip=!1;
gx.define("tbt13_crf_res_his",!1,function(){this.ServerClass="tbt13_crf_res_his";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbt13_study_id=function(){try{var a=gx.util.balloon.getNew("TBT13_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_subject_id=
function(){try{var a=gx.util.balloon.getNew("TBT13_SUBJECT_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_crf_id=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_crf_eda_no=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_EDA_NO");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_crf_version=
function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_VERSION");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_crf_item_grp_div=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_ITEM_GRP_DIV");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt13_crf_item_grp_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt13_crf_item_grp_cd",["gx.O.A101TBT13_STUDY_ID","gx.O.A102TBT13_SUBJECT_ID","gx.O.A103TBT13_CRF_ID",
"gx.O.A938TBT13_CRF_EDA_NO","gx.O.A104TBT13_CRF_VERSION","gx.O.A105TBT13_CRF_ITEM_GRP_DIV","gx.O.A106TBT13_CRF_ITEM_GRP_CD",'gx.date.urlDateTime(gx.O.A599TBT13_CRT_DATETIME,"Y4MD")',"gx.O.A600TBT13_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A602TBT13_UPD_DATETIME,"Y4MD")',"gx.O.A603TBT13_UPD_USER_ID","gx.O.A605TBT13_UPD_CNT","gx.O.A597TBT13_CRF_VALUE","gx.O.A680TBT13_EDIT_FLG","gx.O.A598TBT13_DEL_FLG","gx.O.A601TBT13_CRT_PROG_NM","gx.O.A604TBT13_UPD_PROG_NM"],["A599TBT13_CRT_DATETIME","A600TBT13_CRT_USER_ID",
"A602TBT13_UPD_DATETIME","A603TBT13_UPD_USER_ID","A605TBT13_UPD_CNT","A597TBT13_CRF_VALUE","A680TBT13_EDIT_FLG","A598TBT13_DEL_FLG","A601TBT13_CRT_PROG_NM","A604TBT13_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z101TBT13_STUDY_ID","Z102TBT13_SUBJECT_ID","Z103TBT13_CRF_ID","Z938TBT13_CRF_EDA_NO","Z104TBT13_CRF_VERSION","Z105TBT13_CRF_ITEM_GRP_DIV","Z106TBT13_CRF_ITEM_GRP_CD","Z599TBT13_CRT_DATETIME","Z600TBT13_CRT_USER_ID","Z602TBT13_UPD_DATETIME","Z603TBT13_UPD_USER_ID","Z605TBT13_UPD_CNT","Z597TBT13_CRF_VALUE",
"Z680TBT13_EDIT_FLG","Z598TBT13_DEL_FLG","Z601TBT13_CRT_PROG_NM","Z604TBT13_UPD_PROG_NM","ZV9Pgmname","O605TBT13_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbt13_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBT13_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A599TBT13_CRT_DATETIME)==0||(new gx.date.gxdate(this.A599TBT13_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt13_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBT13_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A602TBT13_UPD_DATETIME)==0||(new gx.date.gxdate(this.A602TBT13_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=
1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt13_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBT13_UPD_CNT");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e12122_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e131258_client=function(){this.executeServerEvent("ENTER",true)};this.e141258_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=
[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119];this.GXLastCtrlId=119;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",
grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBT13_STUDY_ID",
format:0,grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_study_id,isvalid:null,rgrid:[],fld:"TBT13_STUDY_ID",gxz:"Z101TBT13_STUDY_ID",gxold:"O101TBT13_STUDY_ID",gxvar:"A101TBT13_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A101TBT13_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z101TBT13_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_STUDY_ID",gx.O.A101TBT13_STUDY_ID,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A101TBT13_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBT13_SUBJECT_ID",format:0,grid:0};b[44]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_subject_id,isvalid:null,rgrid:[],fld:"TBT13_SUBJECT_ID",gxz:"Z102TBT13_SUBJECT_ID",gxold:"O102TBT13_SUBJECT_ID",gxvar:"A102TBT13_SUBJECT_ID",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A102TBT13_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z102TBT13_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_SUBJECT_ID",gx.O.A102TBT13_SUBJECT_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A102TBT13_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_SUBJECT_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});
b[47]={fld:"TEXTBLOCKTBT13_CRF_ID",format:0,grid:0};b[49]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_id,isvalid:null,rgrid:[],fld:"TBT13_CRF_ID",gxz:"Z103TBT13_CRF_ID",gxold:"O103TBT13_CRF_ID",gxvar:"A103TBT13_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A103TBT13_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z103TBT13_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ID",gx.O.A103TBT13_CRF_ID,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A103TBT13_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_CRF_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBT13_CRF_EDA_NO",format:0,grid:0};b[54]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_eda_no,isvalid:null,rgrid:[],fld:"TBT13_CRF_EDA_NO",gxz:"Z938TBT13_CRF_EDA_NO",gxold:"O938TBT13_CRF_EDA_NO",
gxvar:"A938TBT13_CRF_EDA_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A938TBT13_CRF_EDA_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z938TBT13_CRF_EDA_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRF_EDA_NO",gx.O.A938TBT13_CRF_EDA_NO,0)},c2v:function(){gx.O.A938TBT13_CRF_EDA_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_CRF_EDA_NO",",")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBT13_CRF_VERSION",format:0,grid:0};b[59]={lvl:0,
type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_version,isvalid:null,rgrid:[],fld:"TBT13_CRF_VERSION",gxz:"Z104TBT13_CRF_VERSION",gxold:"O104TBT13_CRF_VERSION",gxvar:"A104TBT13_CRF_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A104TBT13_CRF_VERSION=gx.num.intval(a)},v2z:function(a){gx.O.Z104TBT13_CRF_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRF_VERSION",gx.O.A104TBT13_CRF_VERSION,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A104TBT13_CRF_VERSION=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_CRF_VERSION",",")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTBT13_CRF_ITEM_GRP_DIV",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_item_grp_div,isvalid:null,rgrid:[],fld:"TBT13_CRF_ITEM_GRP_DIV",gxz:"Z105TBT13_CRF_ITEM_GRP_DIV",gxold:"O105TBT13_CRF_ITEM_GRP_DIV",
gxvar:"A105TBT13_CRF_ITEM_GRP_DIV",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A105TBT13_CRF_ITEM_GRP_DIV=a},v2z:function(a){gx.O.Z105TBT13_CRF_ITEM_GRP_DIV=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ITEM_GRP_DIV",gx.O.A105TBT13_CRF_ITEM_GRP_DIV,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A105TBT13_CRF_ITEM_GRP_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_ITEM_GRP_DIV")},nac:gx.falseFn};this.declareDomainHdlr(64,
function(){});b[67]={fld:"TEXTBLOCKTBT13_CRF_ITEM_GRP_CD",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_item_grp_cd,isvalid:null,rgrid:[],fld:"TBT13_CRF_ITEM_GRP_CD",gxz:"Z106TBT13_CRF_ITEM_GRP_CD",gxold:"O106TBT13_CRF_ITEM_GRP_CD",gxvar:"A106TBT13_CRF_ITEM_GRP_CD",ucs:[],op:[114,99,84,79,74,119,109,104,94,89],ip:[114,99,84,79,74,119,109,104,94,89,69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A106TBT13_CRF_ITEM_GRP_CD=
a},v2z:function(a){gx.O.Z106TBT13_CRF_ITEM_GRP_CD=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ITEM_GRP_CD",gx.O.A106TBT13_CRF_ITEM_GRP_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A106TBT13_CRF_ITEM_GRP_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_ITEM_GRP_CD")},nac:gx.falseFn};this.declareDomainHdlr(69,function(){});b[72]={fld:"TEXTBLOCKTBT13_CRF_VALUE",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:2E3,dec:0,sign:false,ro:0,
multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_CRF_VALUE",gxz:"Z597TBT13_CRF_VALUE",gxold:"O597TBT13_CRF_VALUE",gxvar:"A597TBT13_CRF_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A597TBT13_CRF_VALUE=a},v2z:function(a){gx.O.Z597TBT13_CRF_VALUE=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_VALUE",gx.O.A597TBT13_CRF_VALUE,0)},c2v:function(){gx.O.A597TBT13_CRF_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_VALUE")},
nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBT13_EDIT_FLG",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_EDIT_FLG",gxz:"Z680TBT13_EDIT_FLG",gxold:"O680TBT13_EDIT_FLG",gxvar:"A680TBT13_EDIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A680TBT13_EDIT_FLG=a},v2z:function(a){gx.O.Z680TBT13_EDIT_FLG=a},v2c:function(){gx.fn.setControlValue("TBT13_EDIT_FLG",gx.O.A680TBT13_EDIT_FLG,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A680TBT13_EDIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT13_EDIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBT13_DEL_FLG",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_DEL_FLG",gxz:"Z598TBT13_DEL_FLG",gxold:"O598TBT13_DEL_FLG",gxvar:"A598TBT13_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A598TBT13_DEL_FLG=a},v2z:function(a){gx.O.Z598TBT13_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT13_DEL_FLG",gx.O.A598TBT13_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A598TBT13_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT13_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBT13_CRT_DATETIME",format:0,grid:0};b[89]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crt_datetime,isvalid:null,rgrid:[],fld:"TBT13_CRT_DATETIME",gxz:"Z599TBT13_CRT_DATETIME",gxold:"O599TBT13_CRT_DATETIME",gxvar:"A599TBT13_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[89],ip:[89],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A599TBT13_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z599TBT13_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRT_DATETIME",
gx.O.A599TBT13_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A599TBT13_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT13_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});b[92]={fld:"TEXTBLOCKTBT13_CRT_USER_ID",format:0,grid:0};b[94]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_CRT_USER_ID",gxz:"Z600TBT13_CRT_USER_ID",
gxold:"O600TBT13_CRT_USER_ID",gxvar:"A600TBT13_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A600TBT13_CRT_USER_ID=a},v2z:function(a){gx.O.Z600TBT13_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT13_CRT_USER_ID",gx.O.A600TBT13_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A600TBT13_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(94,
function(){});b[97]={fld:"TEXTBLOCKTBT13_CRT_PROG_NM",format:0,grid:0};b[99]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_CRT_PROG_NM",gxz:"Z601TBT13_CRT_PROG_NM",gxold:"O601TBT13_CRT_PROG_NM",gxvar:"A601TBT13_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A601TBT13_CRT_PROG_NM=a},v2z:function(a){gx.O.Z601TBT13_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT13_CRT_PROG_NM",gx.O.A601TBT13_CRT_PROG_NM,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A601TBT13_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(99,function(){});b[102]={fld:"TEXTBLOCKTBT13_UPD_DATETIME",format:0,grid:0};b[104]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_upd_datetime,isvalid:null,rgrid:[],fld:"TBT13_UPD_DATETIME",gxz:"Z602TBT13_UPD_DATETIME",gxold:"O602TBT13_UPD_DATETIME",
gxvar:"A602TBT13_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[104],ip:[104],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A602TBT13_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z602TBT13_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT13_UPD_DATETIME",gx.O.A602TBT13_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A602TBT13_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},
val:function(){return gx.fn.getDateTimeValue("TBT13_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(104,function(){});b[107]={fld:"TEXTBLOCKTBT13_UPD_USER_ID",format:0,grid:0};b[109]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_UPD_USER_ID",gxz:"Z603TBT13_UPD_USER_ID",gxold:"O603TBT13_UPD_USER_ID",gxvar:"A603TBT13_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A603TBT13_UPD_USER_ID=a},v2z:function(a){gx.O.Z603TBT13_UPD_USER_ID=
a},v2c:function(){gx.fn.setControlValue("TBT13_UPD_USER_ID",gx.O.A603TBT13_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A603TBT13_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT13_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(109,function(){});b[112]={fld:"TEXTBLOCKTBT13_UPD_PROG_NM",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT13_UPD_PROG_NM",
gxz:"Z604TBT13_UPD_PROG_NM",gxold:"O604TBT13_UPD_PROG_NM",gxvar:"A604TBT13_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A604TBT13_UPD_PROG_NM=a},v2z:function(a){gx.O.Z604TBT13_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT13_UPD_PROG_NM",gx.O.A604TBT13_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A604TBT13_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT13_UPD_PROG_NM")},nac:gx.falseFn};
this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTBT13_UPD_CNT",format:0,grid:0};b[119]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_upd_cnt,isvalid:null,rgrid:[],fld:"TBT13_UPD_CNT",gxz:"Z605TBT13_UPD_CNT",gxold:"O605TBT13_UPD_CNT",gxvar:"A605TBT13_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A605TBT13_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z605TBT13_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_UPD_CNT",
gx.O.A605TBT13_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A605TBT13_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT13_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(119,function(){});this.O104TBT13_CRF_VERSION=this.Z104TBT13_CRF_VERSION=this.A104TBT13_CRF_VERSION=this.O938TBT13_CRF_EDA_NO=this.Z938TBT13_CRF_EDA_NO=this.A938TBT13_CRF_EDA_NO=this.O103TBT13_CRF_ID=this.Z103TBT13_CRF_ID=this.A103TBT13_CRF_ID=this.O102TBT13_SUBJECT_ID=
this.Z102TBT13_SUBJECT_ID=this.A102TBT13_SUBJECT_ID=this.O101TBT13_STUDY_ID=this.Z101TBT13_STUDY_ID=this.A101TBT13_STUDY_ID=0;this.O598TBT13_DEL_FLG=this.Z598TBT13_DEL_FLG=this.A598TBT13_DEL_FLG=this.O680TBT13_EDIT_FLG=this.Z680TBT13_EDIT_FLG=this.A680TBT13_EDIT_FLG=this.O597TBT13_CRF_VALUE=this.Z597TBT13_CRF_VALUE=this.A597TBT13_CRF_VALUE=this.O106TBT13_CRF_ITEM_GRP_CD=this.Z106TBT13_CRF_ITEM_GRP_CD=this.A106TBT13_CRF_ITEM_GRP_CD=this.O105TBT13_CRF_ITEM_GRP_DIV=this.Z105TBT13_CRF_ITEM_GRP_DIV=this.A105TBT13_CRF_ITEM_GRP_DIV=
"";this.A599TBT13_CRT_DATETIME=gx.date.nullDate();this.Z599TBT13_CRT_DATETIME=gx.date.nullDate();this.O599TBT13_CRT_DATETIME=gx.date.nullDate();this.O601TBT13_CRT_PROG_NM=this.Z601TBT13_CRT_PROG_NM=this.A601TBT13_CRT_PROG_NM=this.O600TBT13_CRT_USER_ID=this.Z600TBT13_CRT_USER_ID=this.A600TBT13_CRT_USER_ID="";this.A602TBT13_UPD_DATETIME=gx.date.nullDate();this.Z602TBT13_UPD_DATETIME=gx.date.nullDate();this.O602TBT13_UPD_DATETIME=gx.date.nullDate();this.O604TBT13_UPD_PROG_NM=this.Z604TBT13_UPD_PROG_NM=
this.A604TBT13_UPD_PROG_NM=this.O603TBT13_UPD_USER_ID=this.Z603TBT13_UPD_USER_ID=this.A603TBT13_UPD_USER_ID="";this.O605TBT13_UPD_CNT=this.Z605TBT13_UPD_CNT=this.A605TBT13_UPD_CNT=0;this.AV9Pgmname=this.AV8W_BC_FLG="";this.A104TBT13_CRF_VERSION=this.A938TBT13_CRF_EDA_NO=this.A103TBT13_CRF_ID=this.A102TBT13_SUBJECT_ID=this.A101TBT13_STUDY_ID=0;this.A106TBT13_CRF_ITEM_GRP_CD=this.A105TBT13_CRF_ITEM_GRP_DIV="";this.A599TBT13_CRT_DATETIME=gx.date.nullDate();this.A600TBT13_CRT_USER_ID="";this.A602TBT13_UPD_DATETIME=
gx.date.nullDate();this.A603TBT13_UPD_USER_ID="";this.A605TBT13_UPD_CNT=0;this.A604TBT13_UPD_PROG_NM=this.A601TBT13_CRT_PROG_NM=this.A598TBT13_DEL_FLG=this.A680TBT13_EDIT_FLG=this.A597TBT13_CRF_VALUE="";this.Events={e12122_client:["AFTER TRN",true],e131258_client:["ENTER",true],e141258_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[58]=
["O605TBT13_UPD_CNT"]});gx.setParentObj(new tbt13_crf_res_his);
