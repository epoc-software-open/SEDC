gx.evt.autoSkip=!1;
gx.define("tbw13_csv_record",!1,function(){this.ServerClass="tbw13_csv_record";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw13_session_id=function(){try{var a=gx.util.balloon.getNew("TBW13_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_datetime=function(){try{var a=
gx.util.balloon.getNew("TBW13_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A183TBW13_DATETIME)==0||(new gx.date.gxdate(this.A183TBW13_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u5b9f\u884c\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw13_study_id=function(){try{var a=gx.util.balloon.getNew("TBW13_STUDY_ID");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_subject_id=function(){try{var a=gx.util.balloon.getNew("TBW13_SUBJECT_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_visit_no=function(){try{var a=gx.util.balloon.getNew("TBW13_VISIT_NO");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_dom_cd=function(){try{var a=gx.util.balloon.getNew("TBW13_DOM_CD");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_dom_itm_grp_oid=function(){try{var a=gx.util.balloon.getNew("TBW13_DOM_ITM_GRP_OID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw13_dom_itm_grp_rowno=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbw13_dom_itm_grp_rowno",["gx.O.A182TBW13_SESSION_ID",'gx.date.urlDateTime(gx.O.A183TBW13_DATETIME,"Y4MD")',"gx.O.A184TBW13_STUDY_ID","gx.O.A185TBW13_SUBJECT_ID",
"gx.O.A186TBW13_VISIT_NO","gx.O.A187TBW13_DOM_CD","gx.O.A188TBW13_DOM_ITM_GRP_OID","gx.O.A189TBW13_DOM_ITM_GRP_ROWNO","gx.O.A836TBW13_VALUE"],["A836TBW13_VALUE","Gx_mode","Z182TBW13_SESSION_ID","Z183TBW13_DATETIME","Z184TBW13_STUDY_ID","Z185TBW13_SUBJECT_ID","Z186TBW13_VISIT_NO","Z187TBW13_DOM_CD","Z188TBW13_DOM_ITM_GRP_OID","Z189TBW13_DOM_ITM_GRP_ROWNO","Z836TBW13_VALUE",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.e111e49_client=function(){this.executeServerEvent("ENTER",
true)};this.e121e49_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79];this.GXLastCtrlId=79;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};
b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]=
{fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBW13_SESSION_ID",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_session_id,isvalid:null,rgrid:[],fld:"TBW13_SESSION_ID",gxz:"Z182TBW13_SESSION_ID",gxold:"O182TBW13_SESSION_ID",gxvar:"A182TBW13_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A182TBW13_SESSION_ID=a},v2z:function(a){gx.O.Z182TBW13_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW13_SESSION_ID",
gx.O.A182TBW13_SESSION_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A182TBW13_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW13_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBW13_DATETIME",format:0,grid:0};b[44]={lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_datetime,isvalid:null,rgrid:[],fld:"TBW13_DATETIME",gxz:"Z183TBW13_DATETIME",gxold:"O183TBW13_DATETIME",
gxvar:"A183TBW13_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[44],ip:[44],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A183TBW13_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z183TBW13_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW13_DATETIME",gx.O.A183TBW13_DATETIME,0)},c2v:function(){gx.O.A183TBW13_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW13_DATETIME")},nac:gx.falseFn};
b[47]={fld:"TEXTBLOCKTBW13_STUDY_ID",format:0,grid:0};b[49]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_study_id,isvalid:null,rgrid:[],fld:"TBW13_STUDY_ID",gxz:"Z184TBW13_STUDY_ID",gxold:"O184TBW13_STUDY_ID",gxvar:"A184TBW13_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A184TBW13_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z184TBW13_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_STUDY_ID",
gx.O.A184TBW13_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A184TBW13_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW13_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBW13_SUBJECT_ID",format:0,grid:0};b[54]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_subject_id,isvalid:null,rgrid:[],fld:"TBW13_SUBJECT_ID",gxz:"Z185TBW13_SUBJECT_ID",
gxold:"O185TBW13_SUBJECT_ID",gxvar:"A185TBW13_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A185TBW13_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z185TBW13_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_SUBJECT_ID",gx.O.A185TBW13_SUBJECT_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A185TBW13_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW13_SUBJECT_ID",",")},
nac:gx.falseFn};this.declareDomainHdlr(54,function(){});b[57]={fld:"TEXTBLOCKTBW13_VISIT_NO",format:0,grid:0};b[59]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_visit_no,isvalid:null,rgrid:[],fld:"TBW13_VISIT_NO",gxz:"Z186TBW13_VISIT_NO",gxold:"O186TBW13_VISIT_NO",gxvar:"A186TBW13_VISIT_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A186TBW13_VISIT_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z186TBW13_VISIT_NO=gx.num.intval(a)},
v2c:function(){gx.fn.setControlValue("TBW13_VISIT_NO",gx.O.A186TBW13_VISIT_NO,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A186TBW13_VISIT_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW13_VISIT_NO",",")},nac:gx.falseFn};this.declareDomainHdlr(59,function(){});b[62]={fld:"TEXTBLOCKTBW13_DOM_CD",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:16,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_cd,isvalid:null,rgrid:[],
fld:"TBW13_DOM_CD",gxz:"Z187TBW13_DOM_CD",gxold:"O187TBW13_DOM_CD",gxvar:"A187TBW13_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A187TBW13_DOM_CD=a},v2z:function(a){gx.O.Z187TBW13_DOM_CD=a},v2c:function(){gx.fn.setControlValue("TBW13_DOM_CD",gx.O.A187TBW13_DOM_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A187TBW13_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBW13_DOM_CD")},nac:gx.falseFn};this.declareDomainHdlr(64,
function(){});b[67]={fld:"TEXTBLOCKTBW13_DOM_ITM_GRP_OID",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_itm_grp_oid,isvalid:null,rgrid:[],fld:"TBW13_DOM_ITM_GRP_OID",gxz:"Z188TBW13_DOM_ITM_GRP_OID",gxold:"O188TBW13_DOM_ITM_GRP_OID",gxvar:"A188TBW13_DOM_ITM_GRP_OID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A188TBW13_DOM_ITM_GRP_OID=a},v2z:function(a){gx.O.Z188TBW13_DOM_ITM_GRP_OID=a},v2c:function(){gx.fn.setControlValue("TBW13_DOM_ITM_GRP_OID",
gx.O.A188TBW13_DOM_ITM_GRP_OID,0)},c2v:function(){gx.O.A188TBW13_DOM_ITM_GRP_OID=this.val()},val:function(){return gx.fn.getControlValue("TBW13_DOM_ITM_GRP_OID")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTBW13_DOM_ITM_GRP_ROWNO",format:0,grid:0};b[74]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw13_dom_itm_grp_rowno,isvalid:null,rgrid:[],fld:"TBW13_DOM_ITM_GRP_ROWNO",gxz:"Z189TBW13_DOM_ITM_GRP_ROWNO",gxold:"O189TBW13_DOM_ITM_GRP_ROWNO",gxvar:"A189TBW13_DOM_ITM_GRP_ROWNO",
ucs:[],op:[79],ip:[79,74,69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A189TBW13_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2z:function(a){gx.O.Z189TBW13_DOM_ITM_GRP_ROWNO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW13_DOM_ITM_GRP_ROWNO",gx.O.A189TBW13_DOM_ITM_GRP_ROWNO,0)},c2v:function(){gx.O.A189TBW13_DOM_ITM_GRP_ROWNO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW13_DOM_ITM_GRP_ROWNO",",")},nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBW13_VALUE",
format:0,grid:0};b[79]={lvl:0,type:"vchar",len:5E4,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW13_VALUE",gxz:"Z836TBW13_VALUE",gxold:"O836TBW13_VALUE",gxvar:"A836TBW13_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A836TBW13_VALUE=a},v2z:function(a){gx.O.Z836TBW13_VALUE=a},v2c:function(){gx.fn.setControlValue("TBW13_VALUE",gx.O.A836TBW13_VALUE,0)},c2v:function(){gx.O.A836TBW13_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBW13_VALUE")},
nac:gx.falseFn};this.O182TBW13_SESSION_ID=this.Z182TBW13_SESSION_ID=this.A182TBW13_SESSION_ID="";this.A183TBW13_DATETIME=gx.date.nullDate();this.Z183TBW13_DATETIME=gx.date.nullDate();this.O183TBW13_DATETIME=gx.date.nullDate();this.O186TBW13_VISIT_NO=this.Z186TBW13_VISIT_NO=this.A186TBW13_VISIT_NO=this.O185TBW13_SUBJECT_ID=this.Z185TBW13_SUBJECT_ID=this.A185TBW13_SUBJECT_ID=this.O184TBW13_STUDY_ID=this.Z184TBW13_STUDY_ID=this.A184TBW13_STUDY_ID=0;this.O188TBW13_DOM_ITM_GRP_OID=this.Z188TBW13_DOM_ITM_GRP_OID=
this.A188TBW13_DOM_ITM_GRP_OID=this.O187TBW13_DOM_CD=this.Z187TBW13_DOM_CD=this.A187TBW13_DOM_CD="";this.O189TBW13_DOM_ITM_GRP_ROWNO=this.Z189TBW13_DOM_ITM_GRP_ROWNO=this.A189TBW13_DOM_ITM_GRP_ROWNO=0;this.A182TBW13_SESSION_ID=this.O836TBW13_VALUE=this.Z836TBW13_VALUE=this.A836TBW13_VALUE="";this.A183TBW13_DATETIME=gx.date.nullDate();this.A186TBW13_VISIT_NO=this.A185TBW13_SUBJECT_ID=this.A184TBW13_STUDY_ID=0;this.A188TBW13_DOM_ITM_GRP_OID=this.A187TBW13_DOM_CD="";this.A189TBW13_DOM_ITM_GRP_ROWNO=
0;this.A836TBW13_VALUE="";this.Events={e111e49_client:["ENTER",true],e121e49_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbw13_csv_record);