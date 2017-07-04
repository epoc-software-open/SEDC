gx.evt.autoSkip=!1;
gx.define("tbw04_crf",!1,function(){this.ServerClass="tbw04_crf";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV8Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw04_session_id=function(){try{var a=gx.util.balloon.getNew("TBW04_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw04_app_id=
function(){try{var a=gx.util.balloon.getNew("TBW04_APP_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw04_disp_datetime=function(){try{var a=gx.util.balloon.getNew("TBW04_DISP_DATETIME");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw04_study_id=function(){try{var a=gx.util.balloon.getNew("TBW04_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw04_subject_id=
function(){try{var a=gx.util.balloon.getNew("TBW04_SUBJECT_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw04_crf_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbw04_crf_id",["gx.O.A123TBW04_SESSION_ID","gx.O.A124TBW04_APP_ID","gx.O.A125TBW04_DISP_DATETIME","gx.O.A126TBW04_STUDY_ID","gx.O.A127TBW04_SUBJECT_ID","gx.O.A128TBW04_CRF_ID","gx.O.A735TBW04_CRF_LATEST_VERSION","gx.O.A736TBW04_CRF_INPUT_LEVEL","gx.O.A737TBW04_LOCK_FLG",'gx.date.urlDateTime(gx.O.A738TBW04_LOCK_DATETIME,"Y4MD")',
"gx.O.A739TBW04_LOCK_USER_ID","gx.O.A740TBW04_LOCK_AUTH_CD",'gx.date.urlDateTime(gx.O.A741TBW04_UPLOAD_DATETIME,"Y4MD")',"gx.O.A742TBW04_UPLOAD_USER_ID","gx.O.A743TBW04_UPLOAD_AUTH_CD","gx.O.A744TBW04_DM_ARRIVAL_FLG",'gx.date.urlDateTime(gx.O.A745TBW04_DM_ARRIVAL_DATETIME,"Y4MD")',"gx.O.A746TBW04_APPROVAL_FLG",'gx.date.urlDateTime(gx.O.A747TBW04_APPROVAL_DATETIME,"Y4MD")',"gx.O.A748TBW04_APPROVAL_USER_ID","gx.O.A749TBW04_APPROVAL_AUTH_CD","gx.O.A750TBW04_INPUT_END_FLG",'gx.date.urlDateTime(gx.O.A751TBW04_INPUT_END_DATETIME,"Y4MD")',
"gx.O.A752TBW04_INPUT_END_USER_ID","gx.O.A753TBW04_INPUT_END_AUTH_CD","gx.O.A754TBW04_COMPLETION_FLG","gx.O.A755TBW04_EDIT_FLG"],["A735TBW04_CRF_LATEST_VERSION","A736TBW04_CRF_INPUT_LEVEL","A737TBW04_LOCK_FLG","A738TBW04_LOCK_DATETIME","A739TBW04_LOCK_USER_ID","A740TBW04_LOCK_AUTH_CD","A741TBW04_UPLOAD_DATETIME","A742TBW04_UPLOAD_USER_ID","A743TBW04_UPLOAD_AUTH_CD","A744TBW04_DM_ARRIVAL_FLG","A745TBW04_DM_ARRIVAL_DATETIME","A746TBW04_APPROVAL_FLG","A747TBW04_APPROVAL_DATETIME","A748TBW04_APPROVAL_USER_ID",
"A749TBW04_APPROVAL_AUTH_CD","A750TBW04_INPUT_END_FLG","A751TBW04_INPUT_END_DATETIME","A752TBW04_INPUT_END_USER_ID","A753TBW04_INPUT_END_AUTH_CD","A754TBW04_COMPLETION_FLG","A755TBW04_EDIT_FLG","AV8Pgmname","Gx_mode","Z123TBW04_SESSION_ID","Z124TBW04_APP_ID","Z125TBW04_DISP_DATETIME","Z126TBW04_STUDY_ID","Z127TBW04_SUBJECT_ID","Z128TBW04_CRF_ID","Z735TBW04_CRF_LATEST_VERSION","Z736TBW04_CRF_INPUT_LEVEL","Z737TBW04_LOCK_FLG","Z738TBW04_LOCK_DATETIME","Z739TBW04_LOCK_USER_ID","Z740TBW04_LOCK_AUTH_CD",
"Z741TBW04_UPLOAD_DATETIME","Z742TBW04_UPLOAD_USER_ID","Z743TBW04_UPLOAD_AUTH_CD","Z744TBW04_DM_ARRIVAL_FLG","Z745TBW04_DM_ARRIVAL_DATETIME","Z746TBW04_APPROVAL_FLG","Z747TBW04_APPROVAL_DATETIME","Z748TBW04_APPROVAL_USER_ID","Z749TBW04_APPROVAL_AUTH_CD","Z750TBW04_INPUT_END_FLG","Z751TBW04_INPUT_END_DATETIME","Z752TBW04_INPUT_END_USER_ID","Z753TBW04_INPUT_END_AUTH_CD","Z754TBW04_COMPLETION_FLG","Z755TBW04_EDIT_FLG","ZV8Pgmname",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbw04_lock_datetime=
function(){try{var a=gx.util.balloon.getNew("TBW04_LOCK_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A738TBW04_LOCK_DATETIME)==0||(new gx.date.gxdate(this.A738TBW04_LOCK_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30ed\u30c3\u30af\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw04_upload_datetime=function(){try{var a=
gx.util.balloon.getNew("TBW04_UPLOAD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A741TBW04_UPLOAD_DATETIME)==0||(new gx.date.gxdate(this.A741TBW04_UPLOAD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30a2\u30c3\u30d7\u30ed\u30fc\u30c9\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw04_dm_arrival_datetime=
function(){try{var a=gx.util.balloon.getNew("TBW04_DM_ARRIVAL_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A745TBW04_DM_ARRIVAL_DATETIME)==0||(new gx.date.gxdate(this.A745TBW04_DM_ARRIVAL_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000DM\u5230\u7740\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw04_approval_datetime=
function(){try{var a=gx.util.balloon.getNew("TBW04_APPROVAL_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A747TBW04_APPROVAL_DATETIME)==0||(new gx.date.gxdate(this.A747TBW04_APPROVAL_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u627f\u8a8d\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw04_input_end_datetime=
function(){try{var a=gx.util.balloon.getNew("TBW04_INPUT_END_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A751TBW04_INPUT_END_DATETIME)==0||(new gx.date.gxdate(this.A751TBW04_INPUT_END_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30c7\u30fc\u30bf\u56fa\u5b9a\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.e121742_client=
function(){this.executeServerEvent("ENTER",true)};this.e131742_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119,122,124,127,129,132,134,137,139,142,144,147,149,152,154,157,159,162,164,167,169];this.GXLastCtrlId=169;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]=
{fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]=
{fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBW04_SESSION_ID",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_session_id,isvalid:null,rgrid:[],fld:"TBW04_SESSION_ID",gxz:"Z123TBW04_SESSION_ID",gxold:"O123TBW04_SESSION_ID",gxvar:"A123TBW04_SESSION_ID",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A123TBW04_SESSION_ID=a},v2z:function(a){gx.O.Z123TBW04_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_SESSION_ID",gx.O.A123TBW04_SESSION_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A123TBW04_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW04_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBW04_APP_ID",format:0,grid:0};b[44]={lvl:0,
type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_app_id,isvalid:null,rgrid:[],fld:"TBW04_APP_ID",gxz:"Z124TBW04_APP_ID",gxold:"O124TBW04_APP_ID",gxvar:"A124TBW04_APP_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A124TBW04_APP_ID=a},v2z:function(a){gx.O.Z124TBW04_APP_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_APP_ID",gx.O.A124TBW04_APP_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A124TBW04_APP_ID=
this.val()},val:function(){return gx.fn.getControlValue("TBW04_APP_ID")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBW04_DISP_DATETIME",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_disp_datetime,isvalid:null,rgrid:[],fld:"TBW04_DISP_DATETIME",gxz:"Z125TBW04_DISP_DATETIME",gxold:"O125TBW04_DISP_DATETIME",gxvar:"A125TBW04_DISP_DATETIME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A125TBW04_DISP_DATETIME=
a},v2z:function(a){gx.O.Z125TBW04_DISP_DATETIME=a},v2c:function(){gx.fn.setControlValue("TBW04_DISP_DATETIME",gx.O.A125TBW04_DISP_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A125TBW04_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBW04_DISP_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBW04_STUDY_ID",format:0,grid:0};b[54]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbw04_study_id,isvalid:null,rgrid:[],fld:"TBW04_STUDY_ID",gxz:"Z126TBW04_STUDY_ID",gxold:"O126TBW04_STUDY_ID",gxvar:"A126TBW04_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A126TBW04_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z126TBW04_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW04_STUDY_ID",gx.O.A126TBW04_STUDY_ID,0)},c2v:function(){gx.O.A126TBW04_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW04_STUDY_ID",
",")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBW04_SUBJECT_ID",format:0,grid:0};b[59]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_subject_id,isvalid:null,rgrid:[],fld:"TBW04_SUBJECT_ID",gxz:"Z127TBW04_SUBJECT_ID",gxold:"O127TBW04_SUBJECT_ID",gxvar:"A127TBW04_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A127TBW04_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z127TBW04_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW04_SUBJECT_ID",
gx.O.A127TBW04_SUBJECT_ID,0)},c2v:function(){gx.O.A127TBW04_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW04_SUBJECT_ID",",")},nac:gx.falseFn};b[62]={fld:"TEXTBLOCKTBW04_CRF_ID",format:0,grid:0};b[64]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_crf_id,isvalid:null,rgrid:[],fld:"TBW04_CRF_ID",gxz:"Z128TBW04_CRF_ID",gxold:"O128TBW04_CRF_ID",gxvar:"A128TBW04_CRF_ID",ucs:[],op:[169,164,159,154,149,144,139,134,
129,124,119,114,109,104,99,94,89,84,79,74,69],ip:[169,164,159,154,149,144,139,134,129,124,119,114,109,104,99,94,89,84,79,74,69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A128TBW04_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z128TBW04_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW04_CRF_ID",gx.O.A128TBW04_CRF_ID,0)},c2v:function(){gx.O.A128TBW04_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW04_CRF_ID",",")},nac:gx.falseFn};
b[67]={fld:"TEXTBLOCKTBW04_CRF_LATEST_VERSION",format:0,grid:0};b[69]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_CRF_LATEST_VERSION",gxz:"Z735TBW04_CRF_LATEST_VERSION",gxold:"O735TBW04_CRF_LATEST_VERSION",gxvar:"A735TBW04_CRF_LATEST_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A735TBW04_CRF_LATEST_VERSION=gx.num.intval(a)},v2z:function(a){gx.O.Z735TBW04_CRF_LATEST_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW04_CRF_LATEST_VERSION",
gx.O.A735TBW04_CRF_LATEST_VERSION,0)},c2v:function(){gx.O.A735TBW04_CRF_LATEST_VERSION=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW04_CRF_LATEST_VERSION",",")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTBW04_CRF_INPUT_LEVEL",format:0,grid:0};b[74]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_CRF_INPUT_LEVEL",gxz:"Z736TBW04_CRF_INPUT_LEVEL",gxold:"O736TBW04_CRF_INPUT_LEVEL",gxvar:"A736TBW04_CRF_INPUT_LEVEL",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A736TBW04_CRF_INPUT_LEVEL=gx.num.intval(a)},v2z:function(a){gx.O.Z736TBW04_CRF_INPUT_LEVEL=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW04_CRF_INPUT_LEVEL",gx.O.A736TBW04_CRF_INPUT_LEVEL,0)},c2v:function(){gx.O.A736TBW04_CRF_INPUT_LEVEL=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW04_CRF_INPUT_LEVEL",",")},nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBW04_LOCK_FLG",format:0,grid:0};b[79]={lvl:0,
type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_LOCK_FLG",gxz:"Z737TBW04_LOCK_FLG",gxold:"O737TBW04_LOCK_FLG",gxvar:"A737TBW04_LOCK_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A737TBW04_LOCK_FLG=a},v2z:function(a){gx.O.Z737TBW04_LOCK_FLG=a},v2c:function(){gx.fn.setControlValue("TBW04_LOCK_FLG",gx.O.A737TBW04_LOCK_FLG,0)},c2v:function(){gx.O.A737TBW04_LOCK_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW04_LOCK_FLG")},
nac:gx.falseFn};b[82]={fld:"TEXTBLOCKTBW04_LOCK_DATETIME",format:0,grid:0};b[84]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_lock_datetime,isvalid:null,rgrid:[],fld:"TBW04_LOCK_DATETIME",gxz:"Z738TBW04_LOCK_DATETIME",gxold:"O738TBW04_LOCK_DATETIME",gxvar:"A738TBW04_LOCK_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[84],ip:[84],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A738TBW04_LOCK_DATETIME=gx.fn.toDatetimeValue(a)},
v2z:function(a){gx.O.Z738TBW04_LOCK_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW04_LOCK_DATETIME",gx.O.A738TBW04_LOCK_DATETIME,0)},c2v:function(){gx.O.A738TBW04_LOCK_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW04_LOCK_DATETIME")},nac:gx.falseFn};b[87]={fld:"TEXTBLOCKTBW04_LOCK_USER_ID",format:0,grid:0};b[89]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_LOCK_USER_ID",
gxz:"Z739TBW04_LOCK_USER_ID",gxold:"O739TBW04_LOCK_USER_ID",gxvar:"A739TBW04_LOCK_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A739TBW04_LOCK_USER_ID=a},v2z:function(a){gx.O.Z739TBW04_LOCK_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_LOCK_USER_ID",gx.O.A739TBW04_LOCK_USER_ID,0)},c2v:function(){gx.O.A739TBW04_LOCK_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW04_LOCK_USER_ID")},nac:gx.falseFn};b[92]={fld:"TEXTBLOCKTBW04_LOCK_AUTH_CD",format:0,
grid:0};b[94]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_LOCK_AUTH_CD",gxz:"Z740TBW04_LOCK_AUTH_CD",gxold:"O740TBW04_LOCK_AUTH_CD",gxvar:"A740TBW04_LOCK_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A740TBW04_LOCK_AUTH_CD=a},v2z:function(a){gx.O.Z740TBW04_LOCK_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBW04_LOCK_AUTH_CD",gx.O.A740TBW04_LOCK_AUTH_CD,0)},c2v:function(){gx.O.A740TBW04_LOCK_AUTH_CD=
this.val()},val:function(){return gx.fn.getControlValue("TBW04_LOCK_AUTH_CD")},nac:gx.falseFn};b[97]={fld:"TEXTBLOCKTBW04_UPLOAD_DATETIME",format:0,grid:0};b[99]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_upload_datetime,isvalid:null,rgrid:[],fld:"TBW04_UPLOAD_DATETIME",gxz:"Z741TBW04_UPLOAD_DATETIME",gxold:"O741TBW04_UPLOAD_DATETIME",gxvar:"A741TBW04_UPLOAD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[99],ip:[99],
nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A741TBW04_UPLOAD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z741TBW04_UPLOAD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW04_UPLOAD_DATETIME",gx.O.A741TBW04_UPLOAD_DATETIME,0)},c2v:function(){gx.O.A741TBW04_UPLOAD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW04_UPLOAD_DATETIME")},nac:gx.falseFn};b[102]={fld:"TEXTBLOCKTBW04_UPLOAD_USER_ID",format:0,grid:0};b[104]=
{lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_UPLOAD_USER_ID",gxz:"Z742TBW04_UPLOAD_USER_ID",gxold:"O742TBW04_UPLOAD_USER_ID",gxvar:"A742TBW04_UPLOAD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A742TBW04_UPLOAD_USER_ID=a},v2z:function(a){gx.O.Z742TBW04_UPLOAD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_UPLOAD_USER_ID",gx.O.A742TBW04_UPLOAD_USER_ID,0)},c2v:function(){gx.O.A742TBW04_UPLOAD_USER_ID=
this.val()},val:function(){return gx.fn.getControlValue("TBW04_UPLOAD_USER_ID")},nac:gx.falseFn};b[107]={fld:"TEXTBLOCKTBW04_UPLOAD_AUTH_CD",format:0,grid:0};b[109]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_UPLOAD_AUTH_CD",gxz:"Z743TBW04_UPLOAD_AUTH_CD",gxold:"O743TBW04_UPLOAD_AUTH_CD",gxvar:"A743TBW04_UPLOAD_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A743TBW04_UPLOAD_AUTH_CD=a},v2z:function(a){gx.O.Z743TBW04_UPLOAD_AUTH_CD=
a},v2c:function(){gx.fn.setControlValue("TBW04_UPLOAD_AUTH_CD",gx.O.A743TBW04_UPLOAD_AUTH_CD,0)},c2v:function(){gx.O.A743TBW04_UPLOAD_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW04_UPLOAD_AUTH_CD")},nac:gx.falseFn};b[112]={fld:"TEXTBLOCKTBW04_DM_ARRIVAL_FLG",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_DM_ARRIVAL_FLG",gxz:"Z744TBW04_DM_ARRIVAL_FLG",gxold:"O744TBW04_DM_ARRIVAL_FLG",gxvar:"A744TBW04_DM_ARRIVAL_FLG",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A744TBW04_DM_ARRIVAL_FLG=a},v2z:function(a){gx.O.Z744TBW04_DM_ARRIVAL_FLG=a},v2c:function(){gx.fn.setControlValue("TBW04_DM_ARRIVAL_FLG",gx.O.A744TBW04_DM_ARRIVAL_FLG,0)},c2v:function(){gx.O.A744TBW04_DM_ARRIVAL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW04_DM_ARRIVAL_FLG")},nac:gx.falseFn};b[117]={fld:"TEXTBLOCKTBW04_DM_ARRIVAL_DATETIME",format:0,grid:0};b[119]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbw04_dm_arrival_datetime,isvalid:null,rgrid:[],fld:"TBW04_DM_ARRIVAL_DATETIME",gxz:"Z745TBW04_DM_ARRIVAL_DATETIME",gxold:"O745TBW04_DM_ARRIVAL_DATETIME",gxvar:"A745TBW04_DM_ARRIVAL_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[119],ip:[119],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A745TBW04_DM_ARRIVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z745TBW04_DM_ARRIVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW04_DM_ARRIVAL_DATETIME",
gx.O.A745TBW04_DM_ARRIVAL_DATETIME,0)},c2v:function(){gx.O.A745TBW04_DM_ARRIVAL_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW04_DM_ARRIVAL_DATETIME")},nac:gx.falseFn};b[122]={fld:"TEXTBLOCKTBW04_APPROVAL_FLG",format:0,grid:0};b[124]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_APPROVAL_FLG",gxz:"Z746TBW04_APPROVAL_FLG",gxold:"O746TBW04_APPROVAL_FLG",gxvar:"A746TBW04_APPROVAL_FLG",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A746TBW04_APPROVAL_FLG=a},v2z:function(a){gx.O.Z746TBW04_APPROVAL_FLG=a},v2c:function(){gx.fn.setControlValue("TBW04_APPROVAL_FLG",gx.O.A746TBW04_APPROVAL_FLG,0)},c2v:function(){gx.O.A746TBW04_APPROVAL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW04_APPROVAL_FLG")},nac:gx.falseFn};b[127]={fld:"TEXTBLOCKTBW04_APPROVAL_DATETIME",format:0,grid:0};b[129]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_approval_datetime,
isvalid:null,rgrid:[],fld:"TBW04_APPROVAL_DATETIME",gxz:"Z747TBW04_APPROVAL_DATETIME",gxold:"O747TBW04_APPROVAL_DATETIME",gxvar:"A747TBW04_APPROVAL_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[129],ip:[129],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A747TBW04_APPROVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z747TBW04_APPROVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW04_APPROVAL_DATETIME",gx.O.A747TBW04_APPROVAL_DATETIME,
0)},c2v:function(){gx.O.A747TBW04_APPROVAL_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW04_APPROVAL_DATETIME")},nac:gx.falseFn};b[132]={fld:"TEXTBLOCKTBW04_APPROVAL_USER_ID",format:0,grid:0};b[134]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_APPROVAL_USER_ID",gxz:"Z748TBW04_APPROVAL_USER_ID",gxold:"O748TBW04_APPROVAL_USER_ID",gxvar:"A748TBW04_APPROVAL_USER_ID",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.A748TBW04_APPROVAL_USER_ID=a},v2z:function(a){gx.O.Z748TBW04_APPROVAL_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_APPROVAL_USER_ID",gx.O.A748TBW04_APPROVAL_USER_ID,0)},c2v:function(){gx.O.A748TBW04_APPROVAL_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW04_APPROVAL_USER_ID")},nac:gx.falseFn};b[137]={fld:"TEXTBLOCKTBW04_APPROVAL_AUTH_CD",format:0,grid:0};b[139]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,
isvalid:null,rgrid:[],fld:"TBW04_APPROVAL_AUTH_CD",gxz:"Z749TBW04_APPROVAL_AUTH_CD",gxold:"O749TBW04_APPROVAL_AUTH_CD",gxvar:"A749TBW04_APPROVAL_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A749TBW04_APPROVAL_AUTH_CD=a},v2z:function(a){gx.O.Z749TBW04_APPROVAL_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBW04_APPROVAL_AUTH_CD",gx.O.A749TBW04_APPROVAL_AUTH_CD,0)},c2v:function(){gx.O.A749TBW04_APPROVAL_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW04_APPROVAL_AUTH_CD")},
nac:gx.falseFn};b[142]={fld:"TEXTBLOCKTBW04_INPUT_END_FLG",format:0,grid:0};b[144]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_INPUT_END_FLG",gxz:"Z750TBW04_INPUT_END_FLG",gxold:"O750TBW04_INPUT_END_FLG",gxvar:"A750TBW04_INPUT_END_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A750TBW04_INPUT_END_FLG=a},v2z:function(a){gx.O.Z750TBW04_INPUT_END_FLG=a},v2c:function(){gx.fn.setControlValue("TBW04_INPUT_END_FLG",
gx.O.A750TBW04_INPUT_END_FLG,0)},c2v:function(){gx.O.A750TBW04_INPUT_END_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW04_INPUT_END_FLG")},nac:gx.falseFn};b[147]={fld:"TEXTBLOCKTBW04_INPUT_END_DATETIME",format:0,grid:0};b[149]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw04_input_end_datetime,isvalid:null,rgrid:[],fld:"TBW04_INPUT_END_DATETIME",gxz:"Z751TBW04_INPUT_END_DATETIME",gxold:"O751TBW04_INPUT_END_DATETIME",gxvar:"A751TBW04_INPUT_END_DATETIME",
dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[149],ip:[149],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A751TBW04_INPUT_END_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z751TBW04_INPUT_END_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW04_INPUT_END_DATETIME",gx.O.A751TBW04_INPUT_END_DATETIME,0)},c2v:function(){gx.O.A751TBW04_INPUT_END_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW04_INPUT_END_DATETIME")},
nac:gx.falseFn};b[152]={fld:"TEXTBLOCKTBW04_INPUT_END_USER_ID",format:0,grid:0};b[154]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_INPUT_END_USER_ID",gxz:"Z752TBW04_INPUT_END_USER_ID",gxold:"O752TBW04_INPUT_END_USER_ID",gxvar:"A752TBW04_INPUT_END_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A752TBW04_INPUT_END_USER_ID=a},v2z:function(a){gx.O.Z752TBW04_INPUT_END_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBW04_INPUT_END_USER_ID",
gx.O.A752TBW04_INPUT_END_USER_ID,0)},c2v:function(){gx.O.A752TBW04_INPUT_END_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW04_INPUT_END_USER_ID")},nac:gx.falseFn};b[157]={fld:"TEXTBLOCKTBW04_INPUT_END_AUTH_CD",format:0,grid:0};b[159]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_INPUT_END_AUTH_CD",gxz:"Z753TBW04_INPUT_END_AUTH_CD",gxold:"O753TBW04_INPUT_END_AUTH_CD",gxvar:"A753TBW04_INPUT_END_AUTH_CD",ucs:[],op:[],
ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A753TBW04_INPUT_END_AUTH_CD=a},v2z:function(a){gx.O.Z753TBW04_INPUT_END_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBW04_INPUT_END_AUTH_CD",gx.O.A753TBW04_INPUT_END_AUTH_CD,0)},c2v:function(){gx.O.A753TBW04_INPUT_END_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW04_INPUT_END_AUTH_CD")},nac:gx.falseFn};b[162]={fld:"TEXTBLOCKTBW04_COMPLETION_FLG",format:0,grid:0};b[164]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,
grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_COMPLETION_FLG",gxz:"Z754TBW04_COMPLETION_FLG",gxold:"O754TBW04_COMPLETION_FLG",gxvar:"A754TBW04_COMPLETION_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A754TBW04_COMPLETION_FLG=a},v2z:function(a){gx.O.Z754TBW04_COMPLETION_FLG=a},v2c:function(){gx.fn.setControlValue("TBW04_COMPLETION_FLG",gx.O.A754TBW04_COMPLETION_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A754TBW04_COMPLETION_FLG=
this.val()},val:function(){return gx.fn.getControlValue("TBW04_COMPLETION_FLG")},nac:gx.falseFn};this.declareDomainHdlr(164,function(){});b[167]={fld:"TEXTBLOCKTBW04_EDIT_FLG",format:0,grid:0};b[169]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW04_EDIT_FLG",gxz:"Z755TBW04_EDIT_FLG",gxold:"O755TBW04_EDIT_FLG",gxvar:"A755TBW04_EDIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A755TBW04_EDIT_FLG=a},v2z:function(a){gx.O.Z755TBW04_EDIT_FLG=
a},v2c:function(){gx.fn.setControlValue("TBW04_EDIT_FLG",gx.O.A755TBW04_EDIT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A755TBW04_EDIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW04_EDIT_FLG")},nac:gx.falseFn};this.declareDomainHdlr(169,function(){});this.O125TBW04_DISP_DATETIME=this.Z125TBW04_DISP_DATETIME=this.A125TBW04_DISP_DATETIME=this.O124TBW04_APP_ID=this.Z124TBW04_APP_ID=this.A124TBW04_APP_ID=this.O123TBW04_SESSION_ID=this.Z123TBW04_SESSION_ID=
this.A123TBW04_SESSION_ID="";this.O736TBW04_CRF_INPUT_LEVEL=this.Z736TBW04_CRF_INPUT_LEVEL=this.A736TBW04_CRF_INPUT_LEVEL=this.O735TBW04_CRF_LATEST_VERSION=this.Z735TBW04_CRF_LATEST_VERSION=this.A735TBW04_CRF_LATEST_VERSION=this.O128TBW04_CRF_ID=this.Z128TBW04_CRF_ID=this.A128TBW04_CRF_ID=this.O127TBW04_SUBJECT_ID=this.Z127TBW04_SUBJECT_ID=this.A127TBW04_SUBJECT_ID=this.O126TBW04_STUDY_ID=this.Z126TBW04_STUDY_ID=this.A126TBW04_STUDY_ID=0;this.O737TBW04_LOCK_FLG=this.Z737TBW04_LOCK_FLG=this.A737TBW04_LOCK_FLG=
"";this.A738TBW04_LOCK_DATETIME=gx.date.nullDate();this.Z738TBW04_LOCK_DATETIME=gx.date.nullDate();this.O738TBW04_LOCK_DATETIME=gx.date.nullDate();this.O740TBW04_LOCK_AUTH_CD=this.Z740TBW04_LOCK_AUTH_CD=this.A740TBW04_LOCK_AUTH_CD=this.O739TBW04_LOCK_USER_ID=this.Z739TBW04_LOCK_USER_ID=this.A739TBW04_LOCK_USER_ID="";this.A741TBW04_UPLOAD_DATETIME=gx.date.nullDate();this.Z741TBW04_UPLOAD_DATETIME=gx.date.nullDate();this.O741TBW04_UPLOAD_DATETIME=gx.date.nullDate();this.O744TBW04_DM_ARRIVAL_FLG=this.Z744TBW04_DM_ARRIVAL_FLG=
this.A744TBW04_DM_ARRIVAL_FLG=this.O743TBW04_UPLOAD_AUTH_CD=this.Z743TBW04_UPLOAD_AUTH_CD=this.A743TBW04_UPLOAD_AUTH_CD=this.O742TBW04_UPLOAD_USER_ID=this.Z742TBW04_UPLOAD_USER_ID=this.A742TBW04_UPLOAD_USER_ID="";this.A745TBW04_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.Z745TBW04_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.O745TBW04_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.O746TBW04_APPROVAL_FLG=this.Z746TBW04_APPROVAL_FLG=this.A746TBW04_APPROVAL_FLG="";this.A747TBW04_APPROVAL_DATETIME=gx.date.nullDate();
this.Z747TBW04_APPROVAL_DATETIME=gx.date.nullDate();this.O747TBW04_APPROVAL_DATETIME=gx.date.nullDate();this.O750TBW04_INPUT_END_FLG=this.Z750TBW04_INPUT_END_FLG=this.A750TBW04_INPUT_END_FLG=this.O749TBW04_APPROVAL_AUTH_CD=this.Z749TBW04_APPROVAL_AUTH_CD=this.A749TBW04_APPROVAL_AUTH_CD=this.O748TBW04_APPROVAL_USER_ID=this.Z748TBW04_APPROVAL_USER_ID=this.A748TBW04_APPROVAL_USER_ID="";this.A751TBW04_INPUT_END_DATETIME=gx.date.nullDate();this.Z751TBW04_INPUT_END_DATETIME=gx.date.nullDate();this.O751TBW04_INPUT_END_DATETIME=
gx.date.nullDate();this.A125TBW04_DISP_DATETIME=this.A124TBW04_APP_ID=this.A123TBW04_SESSION_ID=this.AV8Pgmname=this.AV7W_BC_FLG=this.O755TBW04_EDIT_FLG=this.Z755TBW04_EDIT_FLG=this.A755TBW04_EDIT_FLG=this.O754TBW04_COMPLETION_FLG=this.Z754TBW04_COMPLETION_FLG=this.A754TBW04_COMPLETION_FLG=this.O753TBW04_INPUT_END_AUTH_CD=this.Z753TBW04_INPUT_END_AUTH_CD=this.A753TBW04_INPUT_END_AUTH_CD=this.O752TBW04_INPUT_END_USER_ID=this.Z752TBW04_INPUT_END_USER_ID=this.A752TBW04_INPUT_END_USER_ID="";this.A736TBW04_CRF_INPUT_LEVEL=
this.A735TBW04_CRF_LATEST_VERSION=this.A128TBW04_CRF_ID=this.A127TBW04_SUBJECT_ID=this.A126TBW04_STUDY_ID=0;this.A737TBW04_LOCK_FLG="";this.A738TBW04_LOCK_DATETIME=gx.date.nullDate();this.A740TBW04_LOCK_AUTH_CD=this.A739TBW04_LOCK_USER_ID="";this.A741TBW04_UPLOAD_DATETIME=gx.date.nullDate();this.A744TBW04_DM_ARRIVAL_FLG=this.A743TBW04_UPLOAD_AUTH_CD=this.A742TBW04_UPLOAD_USER_ID="";this.A745TBW04_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.A746TBW04_APPROVAL_FLG="";this.A747TBW04_APPROVAL_DATETIME=
gx.date.nullDate();this.A750TBW04_INPUT_END_FLG=this.A749TBW04_APPROVAL_AUTH_CD=this.A748TBW04_APPROVAL_USER_ID="";this.A751TBW04_INPUT_END_DATETIME=gx.date.nullDate();this.A755TBW04_EDIT_FLG=this.A754TBW04_COMPLETION_FLG=this.A753TBW04_INPUT_END_AUTH_CD=this.A752TBW04_INPUT_END_USER_ID="";this.Events={e121742_client:["ENTER",true],e131742_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV8Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode",
"vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbw04_crf);
