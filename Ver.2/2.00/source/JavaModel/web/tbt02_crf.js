gx.evt.autoSkip=!1;
gx.define("tbt02_crf",!1,function(){this.ServerClass="tbt02_crf";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbt02_study_id=function(){try{var a=gx.util.balloon.getNew("TBT02_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt02_subject_id=
function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt02_subject_id",["gx.O.A89TBT02_STUDY_ID","gx.O.A90TBT02_SUBJECT_ID"],[]);return true};this.Valid_Tbt02_crf_id=function(){try{var a=gx.util.balloon.getNew("TBT02_CRF_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbt02_crf_eda_no=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt02_crf_eda_no",["gx.O.A89TBT02_STUDY_ID","gx.O.A90TBT02_SUBJECT_ID","gx.O.A91TBT02_CRF_ID","gx.O.A935TBT02_CRF_EDA_NO",
'gx.date.urlDateTime(gx.O.A450TBT02_CRT_DATETIME,"Y4MD")',"gx.O.A451TBT02_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A453TBT02_UPD_DATETIME,"Y4MD")',"gx.O.A454TBT02_UPD_USER_ID","gx.O.A456TBT02_UPD_CNT","gx.O.A498TBT02_CRF_LATEST_VERSION","gx.O.A499TBT02_CRF_INPUT_LEVEL","gx.O.A648TBT02_LOCK_FLG",'gx.date.urlDateTime(gx.O.A649TBT02_LOCK_DATETIME,"Y4MD")',"gx.O.A650TBT02_LOCK_USER_ID","gx.O.A651TBT02_LOCK_AUTH_CD",'gx.date.urlDateTime(gx.O.A652TBT02_UPLOAD_DATETIME,"Y4MD")',"gx.O.A653TBT02_UPLOAD_USER_ID",
"gx.O.A654TBT02_UPLOAD_AUTH_CD","gx.O.A655TBT02_DM_ARRIVAL_FLG",'gx.date.urlDateTime(gx.O.A656TBT02_DM_ARRIVAL_DATETIME,"Y4MD")',"gx.O.A657TBT02_APPROVAL_FLG",'gx.date.urlDateTime(gx.O.A658TBT02_APPROVAL_DATETIME,"Y4MD")',"gx.O.A659TBT02_APPROVAL_USER_ID","gx.O.A660TBT02_APPROVAL_AUTH_CD","gx.O.A661TBT02_INPUT_END_FLG",'gx.date.urlDateTime(gx.O.A662TBT02_INPUT_END_DATETIME,"Y4MD")',"gx.O.A663TBT02_INPUT_END_USER_ID","gx.O.A664TBT02_INPUT_END_AUTH_CD","gx.O.A449TBT02_DEL_FLG","gx.O.A452TBT02_CRT_PROG_NM",
"gx.O.A455TBT02_UPD_PROG_NM"],["A450TBT02_CRT_DATETIME","A451TBT02_CRT_USER_ID","A453TBT02_UPD_DATETIME","A454TBT02_UPD_USER_ID","A456TBT02_UPD_CNT","A498TBT02_CRF_LATEST_VERSION","A499TBT02_CRF_INPUT_LEVEL","A648TBT02_LOCK_FLG","A649TBT02_LOCK_DATETIME","A650TBT02_LOCK_USER_ID","A651TBT02_LOCK_AUTH_CD","A652TBT02_UPLOAD_DATETIME","A653TBT02_UPLOAD_USER_ID","A654TBT02_UPLOAD_AUTH_CD","A655TBT02_DM_ARRIVAL_FLG","A656TBT02_DM_ARRIVAL_DATETIME","A657TBT02_APPROVAL_FLG","A658TBT02_APPROVAL_DATETIME",
"A659TBT02_APPROVAL_USER_ID","A660TBT02_APPROVAL_AUTH_CD","A661TBT02_INPUT_END_FLG","A662TBT02_INPUT_END_DATETIME","A663TBT02_INPUT_END_USER_ID","A664TBT02_INPUT_END_AUTH_CD","A449TBT02_DEL_FLG","A452TBT02_CRT_PROG_NM","A455TBT02_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z89TBT02_STUDY_ID","Z90TBT02_SUBJECT_ID","Z91TBT02_CRF_ID","Z935TBT02_CRF_EDA_NO","Z450TBT02_CRT_DATETIME","Z451TBT02_CRT_USER_ID","Z453TBT02_UPD_DATETIME","Z454TBT02_UPD_USER_ID","Z456TBT02_UPD_CNT","Z498TBT02_CRF_LATEST_VERSION","Z499TBT02_CRF_INPUT_LEVEL",
"Z648TBT02_LOCK_FLG","Z649TBT02_LOCK_DATETIME","Z650TBT02_LOCK_USER_ID","Z651TBT02_LOCK_AUTH_CD","Z652TBT02_UPLOAD_DATETIME","Z653TBT02_UPLOAD_USER_ID","Z654TBT02_UPLOAD_AUTH_CD","Z655TBT02_DM_ARRIVAL_FLG","Z656TBT02_DM_ARRIVAL_DATETIME","Z657TBT02_APPROVAL_FLG","Z658TBT02_APPROVAL_DATETIME","Z659TBT02_APPROVAL_USER_ID","Z660TBT02_APPROVAL_AUTH_CD","Z661TBT02_INPUT_END_FLG","Z662TBT02_INPUT_END_DATETIME","Z663TBT02_INPUT_END_USER_ID","Z664TBT02_INPUT_END_AUTH_CD","Z449TBT02_DEL_FLG","Z452TBT02_CRT_PROG_NM",
"Z455TBT02_UPD_PROG_NM","ZV9Pgmname","O456TBT02_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbt02_lock_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_LOCK_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A649TBT02_LOCK_DATETIME)==0||(new gx.date.gxdate(this.A649TBT02_LOCK_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30ed\u30c3\u30af\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_upload_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_UPLOAD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A652TBT02_UPLOAD_DATETIME)==0||(new gx.date.gxdate(this.A652TBT02_UPLOAD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30a2\u30c3\u30d7\u30ed\u30fc\u30c9\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_dm_arrival_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_DM_ARRIVAL_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A656TBT02_DM_ARRIVAL_DATETIME)==0||(new gx.date.gxdate(this.A656TBT02_DM_ARRIVAL_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000DM\u5230\u7740\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_approval_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_APPROVAL_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A658TBT02_APPROVAL_DATETIME)==0||(new gx.date.gxdate(this.A658TBT02_APPROVAL_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u627f\u8a8d\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_input_end_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_INPUT_END_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A662TBT02_INPUT_END_DATETIME)==0||(new gx.date.gxdate(this.A662TBT02_INPUT_END_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u30c7\u30fc\u30bf\u56fa\u5b9a\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A450TBT02_CRT_DATETIME)==0||(new gx.date.gxdate(this.A450TBT02_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=
1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBT02_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A453TBT02_UPD_DATETIME)==0||(new gx.date.gxdate(this.A453TBT02_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==
null?true:a.show()}catch(d){}return true};this.Valid_Tbt02_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBT02_UPD_CNT");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e120p2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130p55_client=function(){this.executeServerEvent("ENTER",true)};this.e140p55_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,
20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,117,119,122,124,127,129,132,134,137,139,142,144,147,149,152,154,157,159,162,164,167,169,172,174,177,179,182,184,187,189];this.GXLastCtrlId=189;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",
grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};
b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBT02_STUDY_ID",format:0,grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_study_id,isvalid:null,rgrid:[],fld:"TBT02_STUDY_ID",gxz:"Z89TBT02_STUDY_ID",gxold:"O89TBT02_STUDY_ID",gxvar:"A89TBT02_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A89TBT02_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z89TBT02_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_STUDY_ID",
gx.O.A89TBT02_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A89TBT02_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT02_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBT02_SUBJECT_ID",format:0,grid:0};b[44]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_subject_id,isvalid:null,rgrid:[],fld:"TBT02_SUBJECT_ID",gxz:"Z90TBT02_SUBJECT_ID",
gxold:"O90TBT02_SUBJECT_ID",gxvar:"A90TBT02_SUBJECT_ID",ucs:[],op:[],ip:[44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A90TBT02_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z90TBT02_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_SUBJECT_ID",gx.O.A90TBT02_SUBJECT_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A90TBT02_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT02_SUBJECT_ID",",")},
nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBT02_CRF_ID",format:0,grid:0};b[49]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_crf_id,isvalid:null,rgrid:[],fld:"TBT02_CRF_ID",gxz:"Z91TBT02_CRF_ID",gxold:"O91TBT02_CRF_ID",gxvar:"A91TBT02_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A91TBT02_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z91TBT02_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_CRF_ID",
gx.O.A91TBT02_CRF_ID,0)},c2v:function(){gx.O.A91TBT02_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT02_CRF_ID",",")},nac:gx.falseFn};b[52]={fld:"TEXTBLOCKTBT02_CRF_EDA_NO",format:0,grid:0};b[54]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_crf_eda_no,isvalid:null,rgrid:[],fld:"TBT02_CRF_EDA_NO",gxz:"Z935TBT02_CRF_EDA_NO",gxold:"O935TBT02_CRF_EDA_NO",gxvar:"A935TBT02_CRF_EDA_NO",ucs:[],op:[184,169,154,149,144,139,
134,129,124,119,114,109,104,99,94,89,84,79,74,69,64,59,189,179,174,164,159],ip:[184,169,154,149,144,139,134,129,124,119,114,109,104,99,94,89,84,79,74,69,64,59,189,179,174,164,159,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A935TBT02_CRF_EDA_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z935TBT02_CRF_EDA_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_CRF_EDA_NO",gx.O.A935TBT02_CRF_EDA_NO,0)},c2v:function(){gx.O.A935TBT02_CRF_EDA_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT02_CRF_EDA_NO",
",")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBT02_CRF_LATEST_VERSION",format:0,grid:0};b[59]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_CRF_LATEST_VERSION",gxz:"Z498TBT02_CRF_LATEST_VERSION",gxold:"O498TBT02_CRF_LATEST_VERSION",gxvar:"A498TBT02_CRF_LATEST_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A498TBT02_CRF_LATEST_VERSION=gx.num.intval(a)},v2z:function(a){gx.O.Z498TBT02_CRF_LATEST_VERSION=
gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_CRF_LATEST_VERSION",gx.O.A498TBT02_CRF_LATEST_VERSION,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A498TBT02_CRF_LATEST_VERSION=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBT02_CRF_LATEST_VERSION",",")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTBT02_CRF_INPUT_LEVEL",format:0,grid:0};b[64]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",
ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_CRF_INPUT_LEVEL",gxz:"Z499TBT02_CRF_INPUT_LEVEL",gxold:"O499TBT02_CRF_INPUT_LEVEL",gxvar:"A499TBT02_CRF_INPUT_LEVEL",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A499TBT02_CRF_INPUT_LEVEL=gx.num.intval(a)},v2z:function(a){gx.O.Z499TBT02_CRF_INPUT_LEVEL=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_CRF_INPUT_LEVEL",gx.O.A499TBT02_CRF_INPUT_LEVEL,0)},c2v:function(){gx.O.A499TBT02_CRF_INPUT_LEVEL=gx.num.intval(this.val())},
val:function(){return gx.fn.getIntegerValue("TBT02_CRF_INPUT_LEVEL",",")},nac:gx.falseFn};b[67]={fld:"TEXTBLOCKTBT02_LOCK_FLG",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_LOCK_FLG",gxz:"Z648TBT02_LOCK_FLG",gxold:"O648TBT02_LOCK_FLG",gxvar:"A648TBT02_LOCK_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A648TBT02_LOCK_FLG=a},v2z:function(a){gx.O.Z648TBT02_LOCK_FLG=a},v2c:function(){gx.fn.setControlValue("TBT02_LOCK_FLG",
gx.O.A648TBT02_LOCK_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A648TBT02_LOCK_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT02_LOCK_FLG")},nac:gx.falseFn};this.declareDomainHdlr(69,function(){});b[72]={fld:"TEXTBLOCKTBT02_LOCK_DATETIME",format:0,grid:0};b[74]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_lock_datetime,isvalid:null,rgrid:[],fld:"TBT02_LOCK_DATETIME",gxz:"Z649TBT02_LOCK_DATETIME",
gxold:"O649TBT02_LOCK_DATETIME",gxvar:"A649TBT02_LOCK_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[74],ip:[74],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A649TBT02_LOCK_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z649TBT02_LOCK_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_LOCK_DATETIME",gx.O.A649TBT02_LOCK_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A649TBT02_LOCK_DATETIME=
gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_LOCK_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTBT02_LOCK_USER_ID",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_LOCK_USER_ID",gxz:"Z650TBT02_LOCK_USER_ID",gxold:"O650TBT02_LOCK_USER_ID",gxvar:"A650TBT02_LOCK_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A650TBT02_LOCK_USER_ID=
a},v2z:function(a){gx.O.Z650TBT02_LOCK_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT02_LOCK_USER_ID",gx.O.A650TBT02_LOCK_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A650TBT02_LOCK_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_LOCK_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBT02_LOCK_AUTH_CD",format:0,grid:0};b[84]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBT02_LOCK_AUTH_CD",gxz:"Z651TBT02_LOCK_AUTH_CD",gxold:"O651TBT02_LOCK_AUTH_CD",gxvar:"A651TBT02_LOCK_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A651TBT02_LOCK_AUTH_CD=a},v2z:function(a){gx.O.Z651TBT02_LOCK_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT02_LOCK_AUTH_CD",gx.O.A651TBT02_LOCK_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A651TBT02_LOCK_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT02_LOCK_AUTH_CD")},
nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBT02_UPLOAD_DATETIME",format:0,grid:0};b[89]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_upload_datetime,isvalid:null,rgrid:[],fld:"TBT02_UPLOAD_DATETIME",gxz:"Z652TBT02_UPLOAD_DATETIME",gxold:"O652TBT02_UPLOAD_DATETIME",gxvar:"A652TBT02_UPLOAD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[89],ip:[89],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A652TBT02_UPLOAD_DATETIME=
gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z652TBT02_UPLOAD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_UPLOAD_DATETIME",gx.O.A652TBT02_UPLOAD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A652TBT02_UPLOAD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_UPLOAD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(89,function(){});b[92]={fld:"TEXTBLOCKTBT02_UPLOAD_USER_ID",
format:0,grid:0};b[94]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_UPLOAD_USER_ID",gxz:"Z653TBT02_UPLOAD_USER_ID",gxold:"O653TBT02_UPLOAD_USER_ID",gxvar:"A653TBT02_UPLOAD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A653TBT02_UPLOAD_USER_ID=a},v2z:function(a){gx.O.Z653TBT02_UPLOAD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT02_UPLOAD_USER_ID",gx.O.A653TBT02_UPLOAD_USER_ID,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A653TBT02_UPLOAD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_UPLOAD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(94,function(){});b[97]={fld:"TEXTBLOCKTBT02_UPLOAD_AUTH_CD",format:0,grid:0};b[99]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_UPLOAD_AUTH_CD",gxz:"Z654TBT02_UPLOAD_AUTH_CD",gxold:"O654TBT02_UPLOAD_AUTH_CD",gxvar:"A654TBT02_UPLOAD_AUTH_CD",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A654TBT02_UPLOAD_AUTH_CD=a},v2z:function(a){gx.O.Z654TBT02_UPLOAD_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT02_UPLOAD_AUTH_CD",gx.O.A654TBT02_UPLOAD_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A654TBT02_UPLOAD_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT02_UPLOAD_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(99,function(){});b[102]={fld:"TEXTBLOCKTBT02_DM_ARRIVAL_FLG",
format:0,grid:0};b[104]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_DM_ARRIVAL_FLG",gxz:"Z655TBT02_DM_ARRIVAL_FLG",gxold:"O655TBT02_DM_ARRIVAL_FLG",gxvar:"A655TBT02_DM_ARRIVAL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A655TBT02_DM_ARRIVAL_FLG=a},v2z:function(a){gx.O.Z655TBT02_DM_ARRIVAL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT02_DM_ARRIVAL_FLG",gx.O.A655TBT02_DM_ARRIVAL_FLG,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A655TBT02_DM_ARRIVAL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT02_DM_ARRIVAL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(104,function(){});b[107]={fld:"TEXTBLOCKTBT02_DM_ARRIVAL_DATETIME",format:0,grid:0};b[109]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_dm_arrival_datetime,isvalid:null,rgrid:[],fld:"TBT02_DM_ARRIVAL_DATETIME",gxz:"Z656TBT02_DM_ARRIVAL_DATETIME",gxold:"O656TBT02_DM_ARRIVAL_DATETIME",
gxvar:"A656TBT02_DM_ARRIVAL_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[109],ip:[109],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A656TBT02_DM_ARRIVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z656TBT02_DM_ARRIVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_DM_ARRIVAL_DATETIME",gx.O.A656TBT02_DM_ARRIVAL_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A656TBT02_DM_ARRIVAL_DATETIME=
gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_DM_ARRIVAL_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(109,function(){});b[112]={fld:"TEXTBLOCKTBT02_APPROVAL_FLG",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_APPROVAL_FLG",gxz:"Z657TBT02_APPROVAL_FLG",gxold:"O657TBT02_APPROVAL_FLG",gxvar:"A657TBT02_APPROVAL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A657TBT02_APPROVAL_FLG=
a},v2z:function(a){gx.O.Z657TBT02_APPROVAL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT02_APPROVAL_FLG",gx.O.A657TBT02_APPROVAL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A657TBT02_APPROVAL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT02_APPROVAL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTBT02_APPROVAL_DATETIME",format:0,grid:0};b[119]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,
gxgrid:null,fnc:this.Valid_Tbt02_approval_datetime,isvalid:null,rgrid:[],fld:"TBT02_APPROVAL_DATETIME",gxz:"Z658TBT02_APPROVAL_DATETIME",gxold:"O658TBT02_APPROVAL_DATETIME",gxvar:"A658TBT02_APPROVAL_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[119],ip:[119],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A658TBT02_APPROVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z658TBT02_APPROVAL_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_APPROVAL_DATETIME",
gx.O.A658TBT02_APPROVAL_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A658TBT02_APPROVAL_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_APPROVAL_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(119,function(){});b[122]={fld:"TEXTBLOCKTBT02_APPROVAL_USER_ID",format:0,grid:0};b[124]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_APPROVAL_USER_ID",
gxz:"Z659TBT02_APPROVAL_USER_ID",gxold:"O659TBT02_APPROVAL_USER_ID",gxvar:"A659TBT02_APPROVAL_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A659TBT02_APPROVAL_USER_ID=a},v2z:function(a){gx.O.Z659TBT02_APPROVAL_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT02_APPROVAL_USER_ID",gx.O.A659TBT02_APPROVAL_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A659TBT02_APPROVAL_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_APPROVAL_USER_ID")},
nac:gx.falseFn};this.declareDomainHdlr(124,function(){});b[127]={fld:"TEXTBLOCKTBT02_APPROVAL_AUTH_CD",format:0,grid:0};b[129]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_APPROVAL_AUTH_CD",gxz:"Z660TBT02_APPROVAL_AUTH_CD",gxold:"O660TBT02_APPROVAL_AUTH_CD",gxvar:"A660TBT02_APPROVAL_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A660TBT02_APPROVAL_AUTH_CD=a},v2z:function(a){gx.O.Z660TBT02_APPROVAL_AUTH_CD=
a},v2c:function(){gx.fn.setControlValue("TBT02_APPROVAL_AUTH_CD",gx.O.A660TBT02_APPROVAL_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A660TBT02_APPROVAL_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT02_APPROVAL_AUTH_CD")},nac:gx.falseFn};this.declareDomainHdlr(129,function(){});b[132]={fld:"TEXTBLOCKTBT02_INPUT_END_FLG",format:0,grid:0};b[134]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBT02_INPUT_END_FLG",gxz:"Z661TBT02_INPUT_END_FLG",gxold:"O661TBT02_INPUT_END_FLG",gxvar:"A661TBT02_INPUT_END_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A661TBT02_INPUT_END_FLG=a},v2z:function(a){gx.O.Z661TBT02_INPUT_END_FLG=a},v2c:function(){gx.fn.setControlValue("TBT02_INPUT_END_FLG",gx.O.A661TBT02_INPUT_END_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A661TBT02_INPUT_END_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT02_INPUT_END_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(134,function(){});b[137]={fld:"TEXTBLOCKTBT02_INPUT_END_DATETIME",format:0,grid:0};b[139]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_input_end_datetime,isvalid:null,rgrid:[],fld:"TBT02_INPUT_END_DATETIME",gxz:"Z662TBT02_INPUT_END_DATETIME",gxold:"O662TBT02_INPUT_END_DATETIME",gxvar:"A662TBT02_INPUT_END_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[139],ip:[139],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.A662TBT02_INPUT_END_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z662TBT02_INPUT_END_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_INPUT_END_DATETIME",gx.O.A662TBT02_INPUT_END_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A662TBT02_INPUT_END_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_INPUT_END_DATETIME")},nac:gx.falseFn};
this.declareDomainHdlr(139,function(){});b[142]={fld:"TEXTBLOCKTBT02_INPUT_END_USER_ID",format:0,grid:0};b[144]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_INPUT_END_USER_ID",gxz:"Z663TBT02_INPUT_END_USER_ID",gxold:"O663TBT02_INPUT_END_USER_ID",gxvar:"A663TBT02_INPUT_END_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A663TBT02_INPUT_END_USER_ID=a},v2z:function(a){gx.O.Z663TBT02_INPUT_END_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT02_INPUT_END_USER_ID",
gx.O.A663TBT02_INPUT_END_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A663TBT02_INPUT_END_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_INPUT_END_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(144,function(){});b[147]={fld:"TEXTBLOCKTBT02_INPUT_END_AUTH_CD",format:0,grid:0};b[149]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_INPUT_END_AUTH_CD",gxz:"Z664TBT02_INPUT_END_AUTH_CD",
gxold:"O664TBT02_INPUT_END_AUTH_CD",gxvar:"A664TBT02_INPUT_END_AUTH_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A664TBT02_INPUT_END_AUTH_CD=a},v2z:function(a){gx.O.Z664TBT02_INPUT_END_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBT02_INPUT_END_AUTH_CD",gx.O.A664TBT02_INPUT_END_AUTH_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A664TBT02_INPUT_END_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT02_INPUT_END_AUTH_CD")},
nac:gx.falseFn};this.declareDomainHdlr(149,function(){});b[152]={fld:"TEXTBLOCKTBT02_DEL_FLG",format:0,grid:0};b[154]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_DEL_FLG",gxz:"Z449TBT02_DEL_FLG",gxold:"O449TBT02_DEL_FLG",gxvar:"A449TBT02_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A449TBT02_DEL_FLG=a},v2z:function(a){gx.O.Z449TBT02_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT02_DEL_FLG",gx.O.A449TBT02_DEL_FLG,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A449TBT02_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT02_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(154,function(){});b[157]={fld:"TEXTBLOCKTBT02_CRT_DATETIME",format:0,grid:0};b[159]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_crt_datetime,isvalid:null,rgrid:[],fld:"TBT02_CRT_DATETIME",gxz:"Z450TBT02_CRT_DATETIME",gxold:"O450TBT02_CRT_DATETIME",
gxvar:"A450TBT02_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[159],ip:[159],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A450TBT02_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z450TBT02_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_CRT_DATETIME",gx.O.A450TBT02_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A450TBT02_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},
val:function(){return gx.fn.getDateTimeValue("TBT02_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(159,function(){});b[162]={fld:"TEXTBLOCKTBT02_CRT_USER_ID",format:0,grid:0};b[164]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_CRT_USER_ID",gxz:"Z451TBT02_CRT_USER_ID",gxold:"O451TBT02_CRT_USER_ID",gxvar:"A451TBT02_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A451TBT02_CRT_USER_ID=a},v2z:function(a){gx.O.Z451TBT02_CRT_USER_ID=
a},v2c:function(){gx.fn.setControlValue("TBT02_CRT_USER_ID",gx.O.A451TBT02_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A451TBT02_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(164,function(){});b[167]={fld:"TEXTBLOCKTBT02_CRT_PROG_NM",format:0,grid:0};b[169]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_CRT_PROG_NM",
gxz:"Z452TBT02_CRT_PROG_NM",gxold:"O452TBT02_CRT_PROG_NM",gxvar:"A452TBT02_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A452TBT02_CRT_PROG_NM=a},v2z:function(a){gx.O.Z452TBT02_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT02_CRT_PROG_NM",gx.O.A452TBT02_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A452TBT02_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT02_CRT_PROG_NM")},nac:gx.falseFn};
this.declareDomainHdlr(169,function(){});b[172]={fld:"TEXTBLOCKTBT02_UPD_DATETIME",format:0,grid:0};b[174]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt02_upd_datetime,isvalid:null,rgrid:[],fld:"TBT02_UPD_DATETIME",gxz:"Z453TBT02_UPD_DATETIME",gxold:"O453TBT02_UPD_DATETIME",gxvar:"A453TBT02_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[174],ip:[174],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A453TBT02_UPD_DATETIME=
gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z453TBT02_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT02_UPD_DATETIME",gx.O.A453TBT02_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A453TBT02_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBT02_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(174,function(){});b[177]={fld:"TEXTBLOCKTBT02_UPD_USER_ID",format:0,grid:0};
b[179]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_UPD_USER_ID",gxz:"Z454TBT02_UPD_USER_ID",gxold:"O454TBT02_UPD_USER_ID",gxvar:"A454TBT02_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A454TBT02_UPD_USER_ID=a},v2z:function(a){gx.O.Z454TBT02_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT02_UPD_USER_ID",gx.O.A454TBT02_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A454TBT02_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT02_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(179,function(){});b[182]={fld:"TEXTBLOCKTBT02_UPD_PROG_NM",format:0,grid:0};b[184]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBT02_UPD_PROG_NM",gxz:"Z455TBT02_UPD_PROG_NM",gxold:"O455TBT02_UPD_PROG_NM",gxvar:"A455TBT02_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A455TBT02_UPD_PROG_NM=
a},v2z:function(a){gx.O.Z455TBT02_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT02_UPD_PROG_NM",gx.O.A455TBT02_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A455TBT02_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT02_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(184,function(){});b[187]={fld:"TEXTBLOCKTBT02_UPD_CNT",format:0,grid:0};b[189]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,
gxgrid:null,fnc:this.Valid_Tbt02_upd_cnt,isvalid:null,rgrid:[],fld:"TBT02_UPD_CNT",gxz:"Z456TBT02_UPD_CNT",gxold:"O456TBT02_UPD_CNT",gxvar:"A456TBT02_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A456TBT02_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z456TBT02_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT02_UPD_CNT",gx.O.A456TBT02_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A456TBT02_UPD_CNT=gx.num.intval(this.val())},
val:function(){return gx.fn.getIntegerValue("TBT02_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(189,function(){});this.O499TBT02_CRF_INPUT_LEVEL=this.Z499TBT02_CRF_INPUT_LEVEL=this.A499TBT02_CRF_INPUT_LEVEL=this.O498TBT02_CRF_LATEST_VERSION=this.Z498TBT02_CRF_LATEST_VERSION=this.A498TBT02_CRF_LATEST_VERSION=this.O935TBT02_CRF_EDA_NO=this.Z935TBT02_CRF_EDA_NO=this.A935TBT02_CRF_EDA_NO=this.O91TBT02_CRF_ID=this.Z91TBT02_CRF_ID=this.A91TBT02_CRF_ID=this.O90TBT02_SUBJECT_ID=this.Z90TBT02_SUBJECT_ID=
this.A90TBT02_SUBJECT_ID=this.O89TBT02_STUDY_ID=this.Z89TBT02_STUDY_ID=this.A89TBT02_STUDY_ID=0;this.O648TBT02_LOCK_FLG=this.Z648TBT02_LOCK_FLG=this.A648TBT02_LOCK_FLG="";this.A649TBT02_LOCK_DATETIME=gx.date.nullDate();this.Z649TBT02_LOCK_DATETIME=gx.date.nullDate();this.O649TBT02_LOCK_DATETIME=gx.date.nullDate();this.O651TBT02_LOCK_AUTH_CD=this.Z651TBT02_LOCK_AUTH_CD=this.A651TBT02_LOCK_AUTH_CD=this.O650TBT02_LOCK_USER_ID=this.Z650TBT02_LOCK_USER_ID=this.A650TBT02_LOCK_USER_ID="";this.A652TBT02_UPLOAD_DATETIME=
gx.date.nullDate();this.Z652TBT02_UPLOAD_DATETIME=gx.date.nullDate();this.O652TBT02_UPLOAD_DATETIME=gx.date.nullDate();this.O655TBT02_DM_ARRIVAL_FLG=this.Z655TBT02_DM_ARRIVAL_FLG=this.A655TBT02_DM_ARRIVAL_FLG=this.O654TBT02_UPLOAD_AUTH_CD=this.Z654TBT02_UPLOAD_AUTH_CD=this.A654TBT02_UPLOAD_AUTH_CD=this.O653TBT02_UPLOAD_USER_ID=this.Z653TBT02_UPLOAD_USER_ID=this.A653TBT02_UPLOAD_USER_ID="";this.A656TBT02_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.Z656TBT02_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.O656TBT02_DM_ARRIVAL_DATETIME=
gx.date.nullDate();this.O657TBT02_APPROVAL_FLG=this.Z657TBT02_APPROVAL_FLG=this.A657TBT02_APPROVAL_FLG="";this.A658TBT02_APPROVAL_DATETIME=gx.date.nullDate();this.Z658TBT02_APPROVAL_DATETIME=gx.date.nullDate();this.O658TBT02_APPROVAL_DATETIME=gx.date.nullDate();this.O661TBT02_INPUT_END_FLG=this.Z661TBT02_INPUT_END_FLG=this.A661TBT02_INPUT_END_FLG=this.O660TBT02_APPROVAL_AUTH_CD=this.Z660TBT02_APPROVAL_AUTH_CD=this.A660TBT02_APPROVAL_AUTH_CD=this.O659TBT02_APPROVAL_USER_ID=this.Z659TBT02_APPROVAL_USER_ID=
this.A659TBT02_APPROVAL_USER_ID="";this.A662TBT02_INPUT_END_DATETIME=gx.date.nullDate();this.Z662TBT02_INPUT_END_DATETIME=gx.date.nullDate();this.O662TBT02_INPUT_END_DATETIME=gx.date.nullDate();this.O449TBT02_DEL_FLG=this.Z449TBT02_DEL_FLG=this.A449TBT02_DEL_FLG=this.O664TBT02_INPUT_END_AUTH_CD=this.Z664TBT02_INPUT_END_AUTH_CD=this.A664TBT02_INPUT_END_AUTH_CD=this.O663TBT02_INPUT_END_USER_ID=this.Z663TBT02_INPUT_END_USER_ID=this.A663TBT02_INPUT_END_USER_ID="";this.A450TBT02_CRT_DATETIME=gx.date.nullDate();
this.Z450TBT02_CRT_DATETIME=gx.date.nullDate();this.O450TBT02_CRT_DATETIME=gx.date.nullDate();this.O452TBT02_CRT_PROG_NM=this.Z452TBT02_CRT_PROG_NM=this.A452TBT02_CRT_PROG_NM=this.O451TBT02_CRT_USER_ID=this.Z451TBT02_CRT_USER_ID=this.A451TBT02_CRT_USER_ID="";this.A453TBT02_UPD_DATETIME=gx.date.nullDate();this.Z453TBT02_UPD_DATETIME=gx.date.nullDate();this.O453TBT02_UPD_DATETIME=gx.date.nullDate();this.O455TBT02_UPD_PROG_NM=this.Z455TBT02_UPD_PROG_NM=this.A455TBT02_UPD_PROG_NM=this.O454TBT02_UPD_USER_ID=
this.Z454TBT02_UPD_USER_ID=this.A454TBT02_UPD_USER_ID="";this.O456TBT02_UPD_CNT=this.Z456TBT02_UPD_CNT=this.A456TBT02_UPD_CNT=0;this.AV9Pgmname=this.AV8W_BC_FLG="";this.A935TBT02_CRF_EDA_NO=this.A91TBT02_CRF_ID=this.A90TBT02_SUBJECT_ID=this.A89TBT02_STUDY_ID=0;this.A450TBT02_CRT_DATETIME=gx.date.nullDate();this.A451TBT02_CRT_USER_ID="";this.A453TBT02_UPD_DATETIME=gx.date.nullDate();this.A454TBT02_UPD_USER_ID="";this.A499TBT02_CRF_INPUT_LEVEL=this.A498TBT02_CRF_LATEST_VERSION=this.A456TBT02_UPD_CNT=
0;this.A648TBT02_LOCK_FLG="";this.A649TBT02_LOCK_DATETIME=gx.date.nullDate();this.A651TBT02_LOCK_AUTH_CD=this.A650TBT02_LOCK_USER_ID="";this.A652TBT02_UPLOAD_DATETIME=gx.date.nullDate();this.A655TBT02_DM_ARRIVAL_FLG=this.A654TBT02_UPLOAD_AUTH_CD=this.A653TBT02_UPLOAD_USER_ID="";this.A656TBT02_DM_ARRIVAL_DATETIME=gx.date.nullDate();this.A657TBT02_APPROVAL_FLG="";this.A658TBT02_APPROVAL_DATETIME=gx.date.nullDate();this.A661TBT02_INPUT_END_FLG=this.A660TBT02_APPROVAL_AUTH_CD=this.A659TBT02_APPROVAL_USER_ID=
"";this.A662TBT02_INPUT_END_DATETIME=gx.date.nullDate();this.A455TBT02_UPD_PROG_NM=this.A452TBT02_CRT_PROG_NM=this.A449TBT02_DEL_FLG=this.A664TBT02_INPUT_END_AUTH_CD=this.A663TBT02_INPUT_END_USER_ID="";this.Events={e120p2_client:["AFTER TRN",true],e130p55_client:["ENTER",true],e140p55_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[55]=
["O456TBT02_UPD_CNT"]});gx.setParentObj(new tbt02_crf);
