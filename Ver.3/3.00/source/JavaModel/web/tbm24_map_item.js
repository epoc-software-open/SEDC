gx.evt.autoSkip=!1;
gx.define("tbm24_map_item",!1,function(){this.ServerClass="tbm24_map_item";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm24_study_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm24_study_id",["gx.O.A64TBM24_STUDY_ID"],[]);return true};this.Valid_Tbm24_dom_cd=function(){try{var a=
gx.util.balloon.getNew("TBM24_DOM_CD");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbm24_dom_var_nm=function(){try{var a=gx.util.balloon.getNew("TBM24_DOM_VAR_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbm24_crf_item_div=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm24_crf_item_div",["gx.O.A64TBM24_STUDY_ID","gx.O.A65TBM24_DOM_CD","gx.O.A66TBM24_DOM_VAR_NM","gx.O.A67TBM24_CRF_ITEM_DIV",'gx.date.urlDateTime(gx.O.A545TBM24_CRT_DATETIME,"Y4MD")',
"gx.O.A546TBM24_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A548TBM24_UPD_DATETIME,"Y4MD")',"gx.O.A549TBM24_UPD_USER_ID","gx.O.A551TBM24_UPD_CNT","gx.O.A702TBM24_DOM_ITM_GRP_OID","gx.O.A703TBM24_DOM_ITM_GRP_ATTR_SEQ","gx.O.A704TBM24_DOM_ITM_GRP_ROWNO","gx.O.A705TBM24_CRF_ITEM_NM","gx.O.A635TBM24_IDENTIFICATION_CD","gx.O.A636TBM24_TEXT_MAXLENGTH","gx.O.A637TBM24_TEXT_MAXROWS","gx.O.A638TBM24_DECIMAL_DIGITS","gx.O.A639TBM24_TEXT","gx.O.A640TBM24_FIXED_VALUE","gx.O.A641TBM24_CHK_FALSE_INNER_VALUE","gx.O.A706TBM24_REQUIRED_INPUT_FLG",
"gx.O.A707TBM24_MIN_VALUE","gx.O.A708TBM24_MAX_VALUE","gx.O.A543TBM24_ORDER","gx.O.A544TBM24_DEL_FLG","gx.O.A547TBM24_CRT_PROG_NM","gx.O.A550TBM24_UPD_PROG_NM"],["A545TBM24_CRT_DATETIME","A546TBM24_CRT_USER_ID","A548TBM24_UPD_DATETIME","A549TBM24_UPD_USER_ID","A551TBM24_UPD_CNT","A702TBM24_DOM_ITM_GRP_OID","A703TBM24_DOM_ITM_GRP_ATTR_SEQ","A704TBM24_DOM_ITM_GRP_ROWNO","A705TBM24_CRF_ITEM_NM","A635TBM24_IDENTIFICATION_CD","A636TBM24_TEXT_MAXLENGTH","A637TBM24_TEXT_MAXROWS","A638TBM24_DECIMAL_DIGITS",
"A639TBM24_TEXT","A640TBM24_FIXED_VALUE","A641TBM24_CHK_FALSE_INNER_VALUE","A706TBM24_REQUIRED_INPUT_FLG","A707TBM24_MIN_VALUE","A708TBM24_MAX_VALUE","A543TBM24_ORDER","A544TBM24_DEL_FLG","A547TBM24_CRT_PROG_NM","A550TBM24_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z64TBM24_STUDY_ID","Z65TBM24_DOM_CD","Z66TBM24_DOM_VAR_NM","Z67TBM24_CRF_ITEM_DIV","Z545TBM24_CRT_DATETIME","Z546TBM24_CRT_USER_ID","Z548TBM24_UPD_DATETIME","Z549TBM24_UPD_USER_ID","Z551TBM24_UPD_CNT","Z702TBM24_DOM_ITM_GRP_OID","Z703TBM24_DOM_ITM_GRP_ATTR_SEQ",
"Z704TBM24_DOM_ITM_GRP_ROWNO","Z705TBM24_CRF_ITEM_NM","Z635TBM24_IDENTIFICATION_CD","Z636TBM24_TEXT_MAXLENGTH","Z637TBM24_TEXT_MAXROWS","Z638TBM24_DECIMAL_DIGITS","Z639TBM24_TEXT","Z640TBM24_FIXED_VALUE","Z641TBM24_CHK_FALSE_INNER_VALUE","Z706TBM24_REQUIRED_INPUT_FLG","Z707TBM24_MIN_VALUE","Z708TBM24_MAX_VALUE","Z543TBM24_ORDER","Z544TBM24_DEL_FLG","Z547TBM24_CRT_PROG_NM","Z550TBM24_UPD_PROG_NM","ZV9Pgmname","O551TBM24_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbm24_crt_datetime=
function(){try{var a=gx.util.balloon.getNew("TBM24_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A545TBM24_CRT_DATETIME)==0||(new gx.date.gxdate(this.A545TBM24_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbm24_upd_datetime=function(){try{var a=
gx.util.balloon.getNew("TBM24_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A548TBM24_UPD_DATETIME)==0||(new gx.date.gxdate(this.A548TBM24_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbm24_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM24_UPD_CNT");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e120w2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130w31_client=function(){this.executeServerEvent("ENTER",true)};this.e140w31_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99,102,104,107,109,112,114,
117,119,122,124,127,129,132,134,137,139,142,144,147,149,152,154,157,159,162,164,167,169];this.GXLastCtrlId=169;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]=
{fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBM24_STUDY_ID",format:0,grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbm24_study_id,isvalid:null,rgrid:[],fld:"TBM24_STUDY_ID",gxz:"Z64TBM24_STUDY_ID",gxold:"O64TBM24_STUDY_ID",gxvar:"A64TBM24_STUDY_ID",ucs:[],op:[],ip:[39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A64TBM24_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z64TBM24_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_STUDY_ID",gx.O.A64TBM24_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A64TBM24_STUDY_ID=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBM24_DOM_CD",format:0,grid:0};b[44]={lvl:0,type:"svchar",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_dom_cd,isvalid:null,rgrid:[],fld:"TBM24_DOM_CD",gxz:"Z65TBM24_DOM_CD",gxold:"O65TBM24_DOM_CD",gxvar:"A65TBM24_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A65TBM24_DOM_CD=a},
v2z:function(a){gx.O.Z65TBM24_DOM_CD=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_CD",gx.O.A65TBM24_DOM_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A65TBM24_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_CD")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBM24_DOM_VAR_NM",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_dom_var_nm,
isvalid:null,rgrid:[],fld:"TBM24_DOM_VAR_NM",gxz:"Z66TBM24_DOM_VAR_NM",gxold:"O66TBM24_DOM_VAR_NM",gxvar:"A66TBM24_DOM_VAR_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A66TBM24_DOM_VAR_NM=a},v2z:function(a){gx.O.Z66TBM24_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_VAR_NM",gx.O.A66TBM24_DOM_VAR_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A66TBM24_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_VAR_NM")},
nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_OID",format:0,grid:0};b[54]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DOM_ITM_GRP_OID",gxz:"Z702TBM24_DOM_ITM_GRP_OID",gxold:"O702TBM24_DOM_ITM_GRP_OID",gxvar:"A702TBM24_DOM_ITM_GRP_OID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A702TBM24_DOM_ITM_GRP_OID=a},v2z:function(a){gx.O.Z702TBM24_DOM_ITM_GRP_OID=a},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_OID",
gx.O.A702TBM24_DOM_ITM_GRP_OID,0)},c2v:function(){gx.O.A702TBM24_DOM_ITM_GRP_OID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DOM_ITM_GRP_OID")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_ATTR_SEQ",format:0,grid:0};b[59]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DOM_ITM_GRP_ATTR_SEQ",gxz:"Z703TBM24_DOM_ITM_GRP_ATTR_SEQ",gxold:"O703TBM24_DOM_ITM_GRP_ATTR_SEQ",gxvar:"A703TBM24_DOM_ITM_GRP_ATTR_SEQ",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A703TBM24_DOM_ITM_GRP_ATTR_SEQ=gx.num.intval(a)},v2z:function(a){gx.O.Z703TBM24_DOM_ITM_GRP_ATTR_SEQ=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_ATTR_SEQ",gx.O.A703TBM24_DOM_ITM_GRP_ATTR_SEQ,0)},c2v:function(){gx.O.A703TBM24_DOM_ITM_GRP_ATTR_SEQ=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_DOM_ITM_GRP_ATTR_SEQ",",")},nac:gx.falseFn};b[62]={fld:"TEXTBLOCKTBM24_DOM_ITM_GRP_ROWNO",
format:0,grid:0};b[64]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DOM_ITM_GRP_ROWNO",gxz:"Z704TBM24_DOM_ITM_GRP_ROWNO",gxold:"O704TBM24_DOM_ITM_GRP_ROWNO",gxvar:"A704TBM24_DOM_ITM_GRP_ROWNO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A704TBM24_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2z:function(a){gx.O.Z704TBM24_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DOM_ITM_GRP_ROWNO",
gx.O.A704TBM24_DOM_ITM_GRP_ROWNO,0)},c2v:function(){gx.O.A704TBM24_DOM_ITM_GRP_ROWNO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_DOM_ITM_GRP_ROWNO",",")},nac:gx.falseFn};b[67]={fld:"TEXTBLOCKTBM24_CRF_ITEM_NM",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:200,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_CRF_ITEM_NM",gxz:"Z705TBM24_CRF_ITEM_NM",gxold:"O705TBM24_CRF_ITEM_NM",gxvar:"A705TBM24_CRF_ITEM_NM",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A705TBM24_CRF_ITEM_NM=a},v2z:function(a){gx.O.Z705TBM24_CRF_ITEM_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_CRF_ITEM_NM",gx.O.A705TBM24_CRF_ITEM_NM,0)},c2v:function(){gx.O.A705TBM24_CRF_ITEM_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRF_ITEM_NM")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTBM24_CRF_ITEM_DIV",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_crf_item_div,
isvalid:null,rgrid:[],fld:"TBM24_CRF_ITEM_DIV",gxz:"Z67TBM24_CRF_ITEM_DIV",gxold:"O67TBM24_CRF_ITEM_DIV",gxvar:"A67TBM24_CRF_ITEM_DIV",ucs:[],op:[164,149,134,129,124,119,114,109,104,99,94,89,84,79,69,64,59,54,169,159,154,144,139],ip:[164,149,134,129,124,119,114,109,104,99,94,89,84,79,69,64,59,54,169,159,154,144,139,74,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A67TBM24_CRF_ITEM_DIV=a},v2z:function(a){gx.O.Z67TBM24_CRF_ITEM_DIV=a},v2c:function(){gx.fn.setControlValue("TBM24_CRF_ITEM_DIV",
gx.O.A67TBM24_CRF_ITEM_DIV,0)},c2v:function(){gx.O.A67TBM24_CRF_ITEM_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRF_ITEM_DIV")},nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBM24_IDENTIFICATION_CD",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_IDENTIFICATION_CD",gxz:"Z635TBM24_IDENTIFICATION_CD",gxold:"O635TBM24_IDENTIFICATION_CD",gxvar:"A635TBM24_IDENTIFICATION_CD",ucs:[],op:[],ip:[],nacdep:[],
ctrltype:"edit",v2v:function(a){gx.O.A635TBM24_IDENTIFICATION_CD=a},v2z:function(a){gx.O.Z635TBM24_IDENTIFICATION_CD=a},v2c:function(){gx.fn.setControlValue("TBM24_IDENTIFICATION_CD",gx.O.A635TBM24_IDENTIFICATION_CD,0)},c2v:function(){gx.O.A635TBM24_IDENTIFICATION_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM24_IDENTIFICATION_CD")},nac:gx.falseFn};b[82]={fld:"TEXTBLOCKTBM24_TEXT_MAXLENGTH",format:0,grid:0};b[84]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBM24_TEXT_MAXLENGTH",gxz:"Z636TBM24_TEXT_MAXLENGTH",gxold:"O636TBM24_TEXT_MAXLENGTH",gxvar:"A636TBM24_TEXT_MAXLENGTH",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A636TBM24_TEXT_MAXLENGTH=gx.num.intval(a)},v2z:function(a){gx.O.Z636TBM24_TEXT_MAXLENGTH=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_TEXT_MAXLENGTH",gx.O.A636TBM24_TEXT_MAXLENGTH,0)},c2v:function(){gx.O.A636TBM24_TEXT_MAXLENGTH=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_TEXT_MAXLENGTH",
",")},nac:gx.falseFn};b[87]={fld:"TEXTBLOCKTBM24_TEXT_MAXROWS",format:0,grid:0};b[89]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_TEXT_MAXROWS",gxz:"Z637TBM24_TEXT_MAXROWS",gxold:"O637TBM24_TEXT_MAXROWS",gxvar:"A637TBM24_TEXT_MAXROWS",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A637TBM24_TEXT_MAXROWS=gx.num.intval(a)},v2z:function(a){gx.O.Z637TBM24_TEXT_MAXROWS=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_TEXT_MAXROWS",
gx.O.A637TBM24_TEXT_MAXROWS,0)},c2v:function(){gx.O.A637TBM24_TEXT_MAXROWS=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_TEXT_MAXROWS",",")},nac:gx.falseFn};b[92]={fld:"TEXTBLOCKTBM24_DECIMAL_DIGITS",format:0,grid:0};b[94]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DECIMAL_DIGITS",gxz:"Z638TBM24_DECIMAL_DIGITS",gxold:"O638TBM24_DECIMAL_DIGITS",gxvar:"A638TBM24_DECIMAL_DIGITS",ucs:[],op:[],ip:[],
nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A638TBM24_DECIMAL_DIGITS=gx.num.intval(a)},v2z:function(a){gx.O.Z638TBM24_DECIMAL_DIGITS=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_DECIMAL_DIGITS",gx.O.A638TBM24_DECIMAL_DIGITS,0)},c2v:function(){gx.O.A638TBM24_DECIMAL_DIGITS=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_DECIMAL_DIGITS",",")},nac:gx.falseFn};b[97]={fld:"TEXTBLOCKTBM24_TEXT",format:0,grid:0};b[99]={lvl:0,type:"svchar",len:200,dec:0,sign:false,
ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_TEXT",gxz:"Z639TBM24_TEXT",gxold:"O639TBM24_TEXT",gxvar:"A639TBM24_TEXT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A639TBM24_TEXT=a},v2z:function(a){gx.O.Z639TBM24_TEXT=a},v2c:function(){gx.fn.setControlValue("TBM24_TEXT",gx.O.A639TBM24_TEXT,0)},c2v:function(){gx.O.A639TBM24_TEXT=this.val()},val:function(){return gx.fn.getControlValue("TBM24_TEXT")},nac:gx.falseFn};b[102]={fld:"TEXTBLOCKTBM24_FIXED_VALUE",
format:0,grid:0};b[104]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_FIXED_VALUE",gxz:"Z640TBM24_FIXED_VALUE",gxold:"O640TBM24_FIXED_VALUE",gxvar:"A640TBM24_FIXED_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A640TBM24_FIXED_VALUE=a},v2z:function(a){gx.O.Z640TBM24_FIXED_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_FIXED_VALUE",gx.O.A640TBM24_FIXED_VALUE,0)},c2v:function(){gx.O.A640TBM24_FIXED_VALUE=
this.val()},val:function(){return gx.fn.getControlValue("TBM24_FIXED_VALUE")},nac:gx.falseFn};b[107]={fld:"TEXTBLOCKTBM24_CHK_FALSE_INNER_VALUE",format:0,grid:0};b[109]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_CHK_FALSE_INNER_VALUE",gxz:"Z641TBM24_CHK_FALSE_INNER_VALUE",gxold:"O641TBM24_CHK_FALSE_INNER_VALUE",gxvar:"A641TBM24_CHK_FALSE_INNER_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A641TBM24_CHK_FALSE_INNER_VALUE=
a},v2z:function(a){gx.O.Z641TBM24_CHK_FALSE_INNER_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_CHK_FALSE_INNER_VALUE",gx.O.A641TBM24_CHK_FALSE_INNER_VALUE,0)},c2v:function(){gx.O.A641TBM24_CHK_FALSE_INNER_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CHK_FALSE_INNER_VALUE")},nac:gx.falseFn};b[112]={fld:"TEXTBLOCKTBM24_REQUIRED_INPUT_FLG",format:0,grid:0};b[114]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_REQUIRED_INPUT_FLG",
gxz:"Z706TBM24_REQUIRED_INPUT_FLG",gxold:"O706TBM24_REQUIRED_INPUT_FLG",gxvar:"A706TBM24_REQUIRED_INPUT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A706TBM24_REQUIRED_INPUT_FLG=a},v2z:function(a){gx.O.Z706TBM24_REQUIRED_INPUT_FLG=a},v2c:function(){gx.fn.setControlValue("TBM24_REQUIRED_INPUT_FLG",gx.O.A706TBM24_REQUIRED_INPUT_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A706TBM24_REQUIRED_INPUT_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM24_REQUIRED_INPUT_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(114,function(){});b[117]={fld:"TEXTBLOCKTBM24_MIN_VALUE",format:0,grid:0};b[119]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_MIN_VALUE",gxz:"Z707TBM24_MIN_VALUE",gxold:"O707TBM24_MIN_VALUE",gxvar:"A707TBM24_MIN_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A707TBM24_MIN_VALUE=a},v2z:function(a){gx.O.Z707TBM24_MIN_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_MIN_VALUE",
gx.O.A707TBM24_MIN_VALUE,0)},c2v:function(){gx.O.A707TBM24_MIN_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_MIN_VALUE")},nac:gx.falseFn};b[122]={fld:"TEXTBLOCKTBM24_MAX_VALUE",format:0,grid:0};b[124]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_MAX_VALUE",gxz:"Z708TBM24_MAX_VALUE",gxold:"O708TBM24_MAX_VALUE",gxvar:"A708TBM24_MAX_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A708TBM24_MAX_VALUE=
a},v2z:function(a){gx.O.Z708TBM24_MAX_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM24_MAX_VALUE",gx.O.A708TBM24_MAX_VALUE,0)},c2v:function(){gx.O.A708TBM24_MAX_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM24_MAX_VALUE")},nac:gx.falseFn};b[127]={fld:"TEXTBLOCKTBM24_ORDER",format:0,grid:0};b[129]={lvl:0,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_ORDER",gxz:"Z543TBM24_ORDER",gxold:"O543TBM24_ORDER",gxvar:"A543TBM24_ORDER",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A543TBM24_ORDER=gx.num.intval(a)},v2z:function(a){gx.O.Z543TBM24_ORDER=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_ORDER",gx.O.A543TBM24_ORDER,0)},c2v:function(){gx.O.A543TBM24_ORDER=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_ORDER",",")},nac:gx.falseFn};b[132]={fld:"TEXTBLOCKTBM24_DEL_FLG",format:0,grid:0};b[134]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBM24_DEL_FLG",gxz:"Z544TBM24_DEL_FLG",gxold:"O544TBM24_DEL_FLG",gxvar:"A544TBM24_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A544TBM24_DEL_FLG=a},v2z:function(a){gx.O.Z544TBM24_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM24_DEL_FLG",gx.O.A544TBM24_DEL_FLG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A544TBM24_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM24_DEL_FLG")},
nac:gx.falseFn};this.declareDomainHdlr(134,function(){});b[137]={fld:"TEXTBLOCKTBM24_CRT_DATETIME",format:0,grid:0};b[139]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_crt_datetime,isvalid:null,rgrid:[],fld:"TBM24_CRT_DATETIME",gxz:"Z545TBM24_CRT_DATETIME",gxold:"O545TBM24_CRT_DATETIME",gxvar:"A545TBM24_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[139],ip:[139],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A545TBM24_CRT_DATETIME=
gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z545TBM24_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM24_CRT_DATETIME",gx.O.A545TBM24_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A545TBM24_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM24_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(139,function(){});b[142]={fld:"TEXTBLOCKTBM24_CRT_USER_ID",format:0,grid:0};
b[144]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_CRT_USER_ID",gxz:"Z546TBM24_CRT_USER_ID",gxold:"O546TBM24_CRT_USER_ID",gxvar:"A546TBM24_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A546TBM24_CRT_USER_ID=a},v2z:function(a){gx.O.Z546TBM24_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM24_CRT_USER_ID",gx.O.A546TBM24_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A546TBM24_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(144,function(){});b[147]={fld:"TEXTBLOCKTBM24_CRT_PROG_NM",format:0,grid:0};b[149]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_CRT_PROG_NM",gxz:"Z547TBM24_CRT_PROG_NM",gxold:"O547TBM24_CRT_PROG_NM",gxvar:"A547TBM24_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A547TBM24_CRT_PROG_NM=
a},v2z:function(a){gx.O.Z547TBM24_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_CRT_PROG_NM",gx.O.A547TBM24_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A547TBM24_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(149,function(){});b[152]={fld:"TEXTBLOCKTBM24_UPD_DATETIME",format:0,grid:0};b[154]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,
fnc:this.Valid_Tbm24_upd_datetime,isvalid:null,rgrid:[],fld:"TBM24_UPD_DATETIME",gxz:"Z548TBM24_UPD_DATETIME",gxold:"O548TBM24_UPD_DATETIME",gxvar:"A548TBM24_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[154],ip:[154],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A548TBM24_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z548TBM24_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM24_UPD_DATETIME",gx.O.A548TBM24_UPD_DATETIME,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A548TBM24_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM24_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(154,function(){});b[157]={fld:"TEXTBLOCKTBM24_UPD_USER_ID",format:0,grid:0};b[159]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_UPD_USER_ID",gxz:"Z549TBM24_UPD_USER_ID",gxold:"O549TBM24_UPD_USER_ID",
gxvar:"A549TBM24_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A549TBM24_UPD_USER_ID=a},v2z:function(a){gx.O.Z549TBM24_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM24_UPD_USER_ID",gx.O.A549TBM24_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A549TBM24_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM24_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(159,function(){});b[162]={fld:"TEXTBLOCKTBM24_UPD_PROG_NM",
format:0,grid:0};b[164]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM24_UPD_PROG_NM",gxz:"Z550TBM24_UPD_PROG_NM",gxold:"O550TBM24_UPD_PROG_NM",gxvar:"A550TBM24_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A550TBM24_UPD_PROG_NM=a},v2z:function(a){gx.O.Z550TBM24_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM24_UPD_PROG_NM",gx.O.A550TBM24_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},
c2v:function(){gx.O.A550TBM24_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM24_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(164,function(){});b[167]={fld:"TEXTBLOCKTBM24_UPD_CNT",format:0,grid:0};b[169]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm24_upd_cnt,isvalid:null,rgrid:[],fld:"TBM24_UPD_CNT",gxz:"Z551TBM24_UPD_CNT",gxold:"O551TBM24_UPD_CNT",gxvar:"A551TBM24_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A551TBM24_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z551TBM24_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM24_UPD_CNT",gx.O.A551TBM24_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A551TBM24_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM24_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(169,function(){});this.O64TBM24_STUDY_ID=this.Z64TBM24_STUDY_ID=this.A64TBM24_STUDY_ID=
0;this.O702TBM24_DOM_ITM_GRP_OID=this.Z702TBM24_DOM_ITM_GRP_OID=this.A702TBM24_DOM_ITM_GRP_OID=this.O66TBM24_DOM_VAR_NM=this.Z66TBM24_DOM_VAR_NM=this.A66TBM24_DOM_VAR_NM=this.O65TBM24_DOM_CD=this.Z65TBM24_DOM_CD=this.A65TBM24_DOM_CD="";this.O704TBM24_DOM_ITM_GRP_ROWNO=this.Z704TBM24_DOM_ITM_GRP_ROWNO=this.A704TBM24_DOM_ITM_GRP_ROWNO=this.O703TBM24_DOM_ITM_GRP_ATTR_SEQ=this.Z703TBM24_DOM_ITM_GRP_ATTR_SEQ=this.A703TBM24_DOM_ITM_GRP_ATTR_SEQ=0;this.O635TBM24_IDENTIFICATION_CD=this.Z635TBM24_IDENTIFICATION_CD=
this.A635TBM24_IDENTIFICATION_CD=this.O67TBM24_CRF_ITEM_DIV=this.Z67TBM24_CRF_ITEM_DIV=this.A67TBM24_CRF_ITEM_DIV=this.O705TBM24_CRF_ITEM_NM=this.Z705TBM24_CRF_ITEM_NM=this.A705TBM24_CRF_ITEM_NM="";this.O638TBM24_DECIMAL_DIGITS=this.Z638TBM24_DECIMAL_DIGITS=this.A638TBM24_DECIMAL_DIGITS=this.O637TBM24_TEXT_MAXROWS=this.Z637TBM24_TEXT_MAXROWS=this.A637TBM24_TEXT_MAXROWS=this.O636TBM24_TEXT_MAXLENGTH=this.Z636TBM24_TEXT_MAXLENGTH=this.A636TBM24_TEXT_MAXLENGTH=0;this.O708TBM24_MAX_VALUE=this.Z708TBM24_MAX_VALUE=
this.A708TBM24_MAX_VALUE=this.O707TBM24_MIN_VALUE=this.Z707TBM24_MIN_VALUE=this.A707TBM24_MIN_VALUE=this.O706TBM24_REQUIRED_INPUT_FLG=this.Z706TBM24_REQUIRED_INPUT_FLG=this.A706TBM24_REQUIRED_INPUT_FLG=this.O641TBM24_CHK_FALSE_INNER_VALUE=this.Z641TBM24_CHK_FALSE_INNER_VALUE=this.A641TBM24_CHK_FALSE_INNER_VALUE=this.O640TBM24_FIXED_VALUE=this.Z640TBM24_FIXED_VALUE=this.A640TBM24_FIXED_VALUE=this.O639TBM24_TEXT=this.Z639TBM24_TEXT=this.A639TBM24_TEXT="";this.O543TBM24_ORDER=this.Z543TBM24_ORDER=this.A543TBM24_ORDER=
0;this.O544TBM24_DEL_FLG=this.Z544TBM24_DEL_FLG=this.A544TBM24_DEL_FLG="";this.A545TBM24_CRT_DATETIME=gx.date.nullDate();this.Z545TBM24_CRT_DATETIME=gx.date.nullDate();this.O545TBM24_CRT_DATETIME=gx.date.nullDate();this.O547TBM24_CRT_PROG_NM=this.Z547TBM24_CRT_PROG_NM=this.A547TBM24_CRT_PROG_NM=this.O546TBM24_CRT_USER_ID=this.Z546TBM24_CRT_USER_ID=this.A546TBM24_CRT_USER_ID="";this.A548TBM24_UPD_DATETIME=gx.date.nullDate();this.Z548TBM24_UPD_DATETIME=gx.date.nullDate();this.O548TBM24_UPD_DATETIME=
gx.date.nullDate();this.O550TBM24_UPD_PROG_NM=this.Z550TBM24_UPD_PROG_NM=this.A550TBM24_UPD_PROG_NM=this.O549TBM24_UPD_USER_ID=this.Z549TBM24_UPD_USER_ID=this.A549TBM24_UPD_USER_ID="";this.O551TBM24_UPD_CNT=this.Z551TBM24_UPD_CNT=this.A551TBM24_UPD_CNT=0;this.AV9Pgmname=this.AV8W_BC_FLG="";this.A64TBM24_STUDY_ID=0;this.A67TBM24_CRF_ITEM_DIV=this.A66TBM24_DOM_VAR_NM=this.A65TBM24_DOM_CD="";this.A545TBM24_CRT_DATETIME=gx.date.nullDate();this.A546TBM24_CRT_USER_ID="";this.A548TBM24_UPD_DATETIME=gx.date.nullDate();
this.A549TBM24_UPD_USER_ID="";this.A551TBM24_UPD_CNT=0;this.A702TBM24_DOM_ITM_GRP_OID="";this.A704TBM24_DOM_ITM_GRP_ROWNO=this.A703TBM24_DOM_ITM_GRP_ATTR_SEQ=0;this.A635TBM24_IDENTIFICATION_CD=this.A705TBM24_CRF_ITEM_NM="";this.A638TBM24_DECIMAL_DIGITS=this.A637TBM24_TEXT_MAXROWS=this.A636TBM24_TEXT_MAXLENGTH=0;this.A708TBM24_MAX_VALUE=this.A707TBM24_MIN_VALUE=this.A706TBM24_REQUIRED_INPUT_FLG=this.A641TBM24_CHK_FALSE_INNER_VALUE=this.A640TBM24_FIXED_VALUE=this.A639TBM24_TEXT="";this.A543TBM24_ORDER=
0;this.A550TBM24_UPD_PROG_NM=this.A547TBM24_CRT_PROG_NM=this.A544TBM24_DEL_FLG="";this.Events={e120w2_client:["AFTER TRN",true],e130w31_client:["ENTER",true],e140w31_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[31]=["O551TBM24_UPD_CNT"]});gx.setParentObj(new tbm24_map_item);
