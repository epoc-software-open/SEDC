gx.evt.autoSkip=!1;
gx.define("tbw10_csv_work",!1,function(){this.ServerClass="tbw10_csv_work";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV8Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw10_session_id=function(){try{var a=gx.util.balloon.getNew("TBW10_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_datetime=
function(){try{var a=gx.util.balloon.getNew("TBW10_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A164TBW10_DATETIME)==0||(new gx.date.gxdate(this.A164TBW10_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000TBW10_DATETIME \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw10_study_id=function(){try{var a=gx.util.balloon.getNew("TBW10_STUDY_ID");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_subject_id=function(){try{var a=gx.util.balloon.getNew("TBW10_SUBJECT_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_crf_id=function(){try{var a=gx.util.balloon.getNew("TBW10_CRF_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_crf_eda_no=function(){try{var a=gx.util.balloon.getNew("TBW10_CRF_EDA_NO");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_crf_item_grp_cd=function(){try{var a=gx.util.balloon.getNew("TBW10_CRF_ITEM_GRP_CD");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_visit_no=function(){try{var a=gx.util.balloon.getNew("TBW10_VISIT_NO");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_dom_cd=function(){try{var a=gx.util.balloon.getNew("TBW10_DOM_CD");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_dom_var_nm=function(){try{var a=gx.util.balloon.getNew("TBW10_DOM_VAR_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_dom_itm_grp_oid=function(){try{var a=gx.util.balloon.getNew("TBW10_DOM_ITM_GRP_OID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw10_dom_itm_grp_rowno=function(){gx.ajax.validSrvEvt("dyncall",
"valid_Tbw10_dom_itm_grp_rowno",["gx.O.A163TBW10_SESSION_ID",'gx.date.urlDateTime(gx.O.A164TBW10_DATETIME,"Y4MD")',"gx.O.A165TBW10_STUDY_ID","gx.O.A166TBW10_SUBJECT_ID","gx.O.A167TBW10_CRF_ID","gx.O.A957TBW10_CRF_EDA_NO","gx.O.A168TBW10_CRF_ITEM_GRP_CD","gx.O.A169TBW10_VISIT_NO","gx.O.A170TBW10_DOM_CD","gx.O.A171TBW10_DOM_VAR_NM","gx.O.A172TBW10_DOM_ITM_GRP_OID","gx.O.A173TBW10_DOM_ITM_GRP_ROWNO","gx.O.A770TBW10_CHAR_1","gx.O.A771TBW10_VALUE","gx.O.A772TBW10_CRF_ITEM_DIV","gx.O.A773TBW10_LIST_CD"],
["A770TBW10_CHAR_1","A771TBW10_VALUE","A772TBW10_CRF_ITEM_DIV","A773TBW10_LIST_CD","AV8Pgmname","Gx_mode","Z163TBW10_SESSION_ID","Z164TBW10_DATETIME","Z165TBW10_STUDY_ID","Z166TBW10_SUBJECT_ID","Z167TBW10_CRF_ID","Z957TBW10_CRF_EDA_NO","Z168TBW10_CRF_ITEM_GRP_CD","Z169TBW10_VISIT_NO","Z170TBW10_DOM_CD","Z171TBW10_DOM_VAR_NM","Z172TBW10_DOM_ITM_GRP_OID","Z173TBW10_DOM_ITM_GRP_ROWNO","Z770TBW10_CHAR_1","Z771TBW10_VALUE","Z772TBW10_CRF_ITEM_DIV","Z773TBW10_LIST_CD","ZV8Pgmname",["BTN_DELETE2","Enabled"],
["BTN_ENTER2","Enabled"]]);return true};this.e121b62_client=function(){this.executeServerEvent("ENTER",true)};this.e131b62_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114];this.GXLastCtrlId=114;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};
b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",
grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBW10_SESSION_ID",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_session_id,isvalid:null,rgrid:[],fld:"TBW10_SESSION_ID",gxz:"Z163TBW10_SESSION_ID",gxold:"O163TBW10_SESSION_ID",gxvar:"A163TBW10_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A163TBW10_SESSION_ID=a},v2z:function(a){gx.O.Z163TBW10_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW10_SESSION_ID",gx.O.A163TBW10_SESSION_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A163TBW10_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW10_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBW10_DATETIME",format:0,grid:0};b[44]={lvl:0,type:"dtime",len:8,dec:5,sign:false,
ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_datetime,isvalid:null,rgrid:[],fld:"TBW10_DATETIME",gxz:"Z164TBW10_DATETIME",gxold:"O164TBW10_DATETIME",gxvar:"A164TBW10_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[44],ip:[44],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A164TBW10_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z164TBW10_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW10_DATETIME",gx.O.A164TBW10_DATETIME,0)},
c2v:function(){gx.O.A164TBW10_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW10_DATETIME")},nac:gx.falseFn};b[47]={fld:"TEXTBLOCKTBW10_STUDY_ID",format:0,grid:0};b[49]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_study_id,isvalid:null,rgrid:[],fld:"TBW10_STUDY_ID",gxz:"Z165TBW10_STUDY_ID",gxold:"O165TBW10_STUDY_ID",gxvar:"A165TBW10_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A165TBW10_STUDY_ID=
gx.num.intval(a)},v2z:function(a){gx.O.Z165TBW10_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_STUDY_ID",gx.O.A165TBW10_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A165TBW10_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBW10_SUBJECT_ID",format:0,grid:0};b[54]={lvl:0,type:"int",len:6,dec:0,sign:false,
pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_subject_id,isvalid:null,rgrid:[],fld:"TBW10_SUBJECT_ID",gxz:"Z166TBW10_SUBJECT_ID",gxold:"O166TBW10_SUBJECT_ID",gxvar:"A166TBW10_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A166TBW10_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z166TBW10_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_SUBJECT_ID",gx.O.A166TBW10_SUBJECT_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A166TBW10_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_SUBJECT_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(54,function(){});b[57]={fld:"TEXTBLOCKTBW10_CRF_ID",format:0,grid:0};b[59]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_crf_id,isvalid:null,rgrid:[],fld:"TBW10_CRF_ID",gxz:"Z167TBW10_CRF_ID",gxold:"O167TBW10_CRF_ID",gxvar:"A167TBW10_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A167TBW10_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z167TBW10_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_CRF_ID",gx.O.A167TBW10_CRF_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A167TBW10_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_CRF_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTBW10_CRF_EDA_NO",format:0,grid:0};b[64]={lvl:0,
type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_crf_eda_no,isvalid:null,rgrid:[],fld:"TBW10_CRF_EDA_NO",gxz:"Z957TBW10_CRF_EDA_NO",gxold:"O957TBW10_CRF_EDA_NO",gxvar:"A957TBW10_CRF_EDA_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A957TBW10_CRF_EDA_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z957TBW10_CRF_EDA_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_CRF_EDA_NO",gx.O.A957TBW10_CRF_EDA_NO,0);typeof this.dom_hdl=="function"&&
this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A957TBW10_CRF_EDA_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_CRF_EDA_NO",",")},nac:gx.falseFn};this.declareDomainHdlr(64,function(){});b[67]={fld:"TEXTBLOCKTBW10_CRF_ITEM_GRP_CD",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_crf_item_grp_cd,isvalid:null,rgrid:[],fld:"TBW10_CRF_ITEM_GRP_CD",gxz:"Z168TBW10_CRF_ITEM_GRP_CD",gxold:"O168TBW10_CRF_ITEM_GRP_CD",
gxvar:"A168TBW10_CRF_ITEM_GRP_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A168TBW10_CRF_ITEM_GRP_CD=a},v2z:function(a){gx.O.Z168TBW10_CRF_ITEM_GRP_CD=a},v2c:function(){gx.fn.setControlValue("TBW10_CRF_ITEM_GRP_CD",gx.O.A168TBW10_CRF_ITEM_GRP_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A168TBW10_CRF_ITEM_GRP_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW10_CRF_ITEM_GRP_CD")},nac:gx.falseFn};this.declareDomainHdlr(69,
function(){});b[72]={fld:"TEXTBLOCKTBW10_VISIT_NO",format:0,grid:0};b[74]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_visit_no,isvalid:null,rgrid:[],fld:"TBW10_VISIT_NO",gxz:"Z169TBW10_VISIT_NO",gxold:"O169TBW10_VISIT_NO",gxvar:"A169TBW10_VISIT_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A169TBW10_VISIT_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z169TBW10_VISIT_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_VISIT_NO",
gx.O.A169TBW10_VISIT_NO,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A169TBW10_VISIT_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_VISIT_NO",",")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTBW10_DOM_CD",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_dom_cd,isvalid:null,rgrid:[],fld:"TBW10_DOM_CD",gxz:"Z170TBW10_DOM_CD",gxold:"O170TBW10_DOM_CD",
gxvar:"A170TBW10_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A170TBW10_DOM_CD=a},v2z:function(a){gx.O.Z170TBW10_DOM_CD=a},v2c:function(){gx.fn.setControlValue("TBW10_DOM_CD",gx.O.A170TBW10_DOM_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A170TBW10_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW10_DOM_CD")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBW10_DOM_VAR_NM",format:0,
grid:0};b[84]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_dom_var_nm,isvalid:null,rgrid:[],fld:"TBW10_DOM_VAR_NM",gxz:"Z171TBW10_DOM_VAR_NM",gxold:"O171TBW10_DOM_VAR_NM",gxvar:"A171TBW10_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A171TBW10_DOM_VAR_NM=a},v2z:function(a){gx.O.Z171TBW10_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("TBW10_DOM_VAR_NM",gx.O.A171TBW10_DOM_VAR_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A171TBW10_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("TBW10_DOM_VAR_NM")},nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBW10_DOM_ITM_GRP_OID",format:0,grid:0};b[89]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw10_dom_itm_grp_oid,isvalid:null,rgrid:[],fld:"TBW10_DOM_ITM_GRP_OID",gxz:"Z172TBW10_DOM_ITM_GRP_OID",gxold:"O172TBW10_DOM_ITM_GRP_OID",gxvar:"A172TBW10_DOM_ITM_GRP_OID",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A172TBW10_DOM_ITM_GRP_OID=a},v2z:function(a){gx.O.Z172TBW10_DOM_ITM_GRP_OID=a},v2c:function(){gx.fn.setControlValue("TBW10_DOM_ITM_GRP_OID",gx.O.A172TBW10_DOM_ITM_GRP_OID,0)},c2v:function(){gx.O.A172TBW10_DOM_ITM_GRP_OID=this.val()},val:function(){return gx.fn.getControlValue("TBW10_DOM_ITM_GRP_OID")},nac:gx.falseFn};b[92]={fld:"TEXTBLOCKTBW10_DOM_ITM_GRP_ROWNO",format:0,grid:0};b[94]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbw10_dom_itm_grp_rowno,isvalid:null,rgrid:[],fld:"TBW10_DOM_ITM_GRP_ROWNO",gxz:"Z173TBW10_DOM_ITM_GRP_ROWNO",gxold:"O173TBW10_DOM_ITM_GRP_ROWNO",gxvar:"A173TBW10_DOM_ITM_GRP_ROWNO",ucs:[],op:[114,109,104,99],ip:[114,109,104,99,94,89,84,79,74,69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A173TBW10_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2z:function(a){gx.O.Z173TBW10_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_DOM_ITM_GRP_ROWNO",
gx.O.A173TBW10_DOM_ITM_GRP_ROWNO,0)},c2v:function(){gx.O.A173TBW10_DOM_ITM_GRP_ROWNO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_DOM_ITM_GRP_ROWNO",",")},nac:gx.falseFn};b[97]={fld:"TEXTBLOCKTBW10_CHAR_1",format:0,grid:0};b[99]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW10_CHAR_1",gxz:"Z770TBW10_CHAR_1",gxold:"O770TBW10_CHAR_1",gxvar:"A770TBW10_CHAR_1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A770TBW10_CHAR_1=gx.num.intval(a)},v2z:function(a){gx.O.Z770TBW10_CHAR_1=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW10_CHAR_1",gx.O.A770TBW10_CHAR_1,0)},c2v:function(){gx.O.A770TBW10_CHAR_1=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW10_CHAR_1",",")},nac:gx.falseFn};b[102]={fld:"TEXTBLOCKTBW10_VALUE",format:0,grid:0};b[104]={lvl:0,type:"svchar",len:2E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBW10_VALUE",gxz:"Z771TBW10_VALUE",gxold:"O771TBW10_VALUE",gxvar:"A771TBW10_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A771TBW10_VALUE=a},v2z:function(a){gx.O.Z771TBW10_VALUE=a},v2c:function(){gx.fn.setControlValue("TBW10_VALUE",gx.O.A771TBW10_VALUE,0)},c2v:function(){gx.O.A771TBW10_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBW10_VALUE")},nac:gx.falseFn};b[107]={fld:"TEXTBLOCKTBW10_CRF_ITEM_DIV",format:0,grid:0};b[109]={lvl:0,type:"svchar",
len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW10_CRF_ITEM_DIV",gxz:"Z772TBW10_CRF_ITEM_DIV",gxold:"O772TBW10_CRF_ITEM_DIV",gxvar:"A772TBW10_CRF_ITEM_DIV",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A772TBW10_CRF_ITEM_DIV=a},v2z:function(a){gx.O.Z772TBW10_CRF_ITEM_DIV=a},v2c:function(){gx.fn.setControlValue("TBW10_CRF_ITEM_DIV",gx.O.A772TBW10_CRF_ITEM_DIV,0)},c2v:function(){gx.O.A772TBW10_CRF_ITEM_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBW10_CRF_ITEM_DIV")},
nac:gx.falseFn};b[112]={fld:"TEXTBLOCKTBW10_LIST_CD",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW10_LIST_CD",gxz:"Z773TBW10_LIST_CD",gxold:"O773TBW10_LIST_CD",gxvar:"A773TBW10_LIST_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A773TBW10_LIST_CD=a},v2z:function(a){gx.O.Z773TBW10_LIST_CD=a},v2c:function(){gx.fn.setControlValue("TBW10_LIST_CD",gx.O.A773TBW10_LIST_CD,0)},c2v:function(){gx.O.A773TBW10_LIST_CD=
this.val()},val:function(){return gx.fn.getControlValue("TBW10_LIST_CD")},nac:gx.falseFn};this.O163TBW10_SESSION_ID=this.Z163TBW10_SESSION_ID=this.A163TBW10_SESSION_ID="";this.A164TBW10_DATETIME=gx.date.nullDate();this.Z164TBW10_DATETIME=gx.date.nullDate();this.O164TBW10_DATETIME=gx.date.nullDate();this.O957TBW10_CRF_EDA_NO=this.Z957TBW10_CRF_EDA_NO=this.A957TBW10_CRF_EDA_NO=this.O167TBW10_CRF_ID=this.Z167TBW10_CRF_ID=this.A167TBW10_CRF_ID=this.O166TBW10_SUBJECT_ID=this.Z166TBW10_SUBJECT_ID=this.A166TBW10_SUBJECT_ID=
this.O165TBW10_STUDY_ID=this.Z165TBW10_STUDY_ID=this.A165TBW10_STUDY_ID=0;this.O168TBW10_CRF_ITEM_GRP_CD=this.Z168TBW10_CRF_ITEM_GRP_CD=this.A168TBW10_CRF_ITEM_GRP_CD="";this.O169TBW10_VISIT_NO=this.Z169TBW10_VISIT_NO=this.A169TBW10_VISIT_NO=0;this.O172TBW10_DOM_ITM_GRP_OID=this.Z172TBW10_DOM_ITM_GRP_OID=this.A172TBW10_DOM_ITM_GRP_OID=this.O171TBW10_DOM_VAR_NM=this.Z171TBW10_DOM_VAR_NM=this.A171TBW10_DOM_VAR_NM=this.O170TBW10_DOM_CD=this.Z170TBW10_DOM_CD=this.A170TBW10_DOM_CD="";this.O770TBW10_CHAR_1=
this.Z770TBW10_CHAR_1=this.A770TBW10_CHAR_1=this.O173TBW10_DOM_ITM_GRP_ROWNO=this.Z173TBW10_DOM_ITM_GRP_ROWNO=this.A173TBW10_DOM_ITM_GRP_ROWNO=0;this.A163TBW10_SESSION_ID=this.AV8Pgmname=this.AV7W_BC_FLG=this.O773TBW10_LIST_CD=this.Z773TBW10_LIST_CD=this.A773TBW10_LIST_CD=this.O772TBW10_CRF_ITEM_DIV=this.Z772TBW10_CRF_ITEM_DIV=this.A772TBW10_CRF_ITEM_DIV=this.O771TBW10_VALUE=this.Z771TBW10_VALUE=this.A771TBW10_VALUE="";this.A164TBW10_DATETIME=gx.date.nullDate();this.A957TBW10_CRF_EDA_NO=this.A167TBW10_CRF_ID=
this.A166TBW10_SUBJECT_ID=this.A165TBW10_STUDY_ID=0;this.A168TBW10_CRF_ITEM_GRP_CD="";this.A169TBW10_VISIT_NO=0;this.A172TBW10_DOM_ITM_GRP_OID=this.A171TBW10_DOM_VAR_NM=this.A170TBW10_DOM_CD="";this.A770TBW10_CHAR_1=this.A173TBW10_DOM_ITM_GRP_ROWNO=0;this.A773TBW10_LIST_CD=this.A772TBW10_CRF_ITEM_DIV=this.A771TBW10_VALUE="";this.Events={e121b62_client:["ENTER",true],e131b62_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV8Pgmname","vPGMNAME",
0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbw10_csv_work);
