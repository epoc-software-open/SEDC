gx.evt.autoSkip=!1;
gx.define("tbw07_crf_memo_loc",!1,function(){this.ServerClass="tbw07_crf_memo_loc";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV8Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw07_session_id=function(){try{var a=gx.util.balloon.getNew("TBW07_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Tbw07_app_id=function(){try{var a=gx.util.balloon.getNew("TBW07_APP_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_disp_datetime=function(){try{var a=gx.util.balloon.getNew("TBW07_DISP_DATETIME");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_study_id=function(){try{var a=gx.util.balloon.getNew("TBW07_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Tbw07_subject_id=function(){try{var a=gx.util.balloon.getNew("TBW07_SUBJECT_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_ins_no=function(){try{var a=gx.util.balloon.getNew("TBW07_INS_NO");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_crf_id=function(){try{var a=gx.util.balloon.getNew("TBW07_CRF_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Tbw07_crf_version=function(){try{var a=gx.util.balloon.getNew("TBW07_CRF_VERSION");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_x=function(){try{var a=gx.util.balloon.getNew("TBW07_X");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tbw07_y=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbw07_y",["gx.O.A146TBW07_SESSION_ID","gx.O.A147TBW07_APP_ID","gx.O.A148TBW07_DISP_DATETIME","gx.O.A150TBW07_STUDY_ID",
"gx.O.A152TBW07_SUBJECT_ID","gx.O.A154TBW07_INS_NO","gx.O.A156TBW07_CRF_ID","gx.O.A158TBW07_CRF_VERSION","gx.O.A160TBW07_X","gx.O.A162TBW07_Y","gx.O.A768TBW07_EDIT_REQUEST_FLG","gx.O.A769TBW07_COLOR_DIV"],["A768TBW07_EDIT_REQUEST_FLG","A769TBW07_COLOR_DIV","AV8Pgmname","Gx_mode","Z146TBW07_SESSION_ID","Z147TBW07_APP_ID","Z148TBW07_DISP_DATETIME","Z150TBW07_STUDY_ID","Z152TBW07_SUBJECT_ID","Z154TBW07_INS_NO","Z156TBW07_CRF_ID","Z158TBW07_CRF_VERSION","Z160TBW07_X","Z162TBW07_Y","Z768TBW07_EDIT_REQUEST_FLG",
"Z769TBW07_COLOR_DIV","ZV8Pgmname",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.e121a45_client=function(){this.executeServerEvent("ENTER",true)};this.e131a45_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94];this.GXLastCtrlId=94;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};
b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};
b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBW07_SESSION_ID",format:0,grid:0};b[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_session_id,isvalid:null,rgrid:[],fld:"TBW07_SESSION_ID",gxz:"Z146TBW07_SESSION_ID",gxold:"O146TBW07_SESSION_ID",gxvar:"A146TBW07_SESSION_ID",ucs:[],
op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A146TBW07_SESSION_ID=a},v2z:function(a){gx.O.Z146TBW07_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW07_SESSION_ID",gx.O.A146TBW07_SESSION_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A146TBW07_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW07_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBW07_APP_ID",format:0,grid:0};b[44]=
{lvl:0,type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_app_id,isvalid:null,rgrid:[],fld:"TBW07_APP_ID",gxz:"Z147TBW07_APP_ID",gxold:"O147TBW07_APP_ID",gxvar:"A147TBW07_APP_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A147TBW07_APP_ID=a},v2z:function(a){gx.O.Z147TBW07_APP_ID=a},v2c:function(){gx.fn.setControlValue("TBW07_APP_ID",gx.O.A147TBW07_APP_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A147TBW07_APP_ID=
this.val()},val:function(){return gx.fn.getControlValue("TBW07_APP_ID")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBW07_DISP_DATETIME",format:0,grid:0};b[49]={lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_disp_datetime,isvalid:null,rgrid:[],fld:"TBW07_DISP_DATETIME",gxz:"Z148TBW07_DISP_DATETIME",gxold:"O148TBW07_DISP_DATETIME",gxvar:"A148TBW07_DISP_DATETIME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A148TBW07_DISP_DATETIME=
a},v2z:function(a){gx.O.Z148TBW07_DISP_DATETIME=a},v2c:function(){gx.fn.setControlValue("TBW07_DISP_DATETIME",gx.O.A148TBW07_DISP_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A148TBW07_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBW07_DISP_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});b[52]={fld:"TEXTBLOCKTBW07_STUDY_ID",format:0,grid:0};b[54]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,
grid:0,gxgrid:null,fnc:this.Valid_Tbw07_study_id,isvalid:null,rgrid:[],fld:"TBW07_STUDY_ID",gxz:"Z150TBW07_STUDY_ID",gxold:"O150TBW07_STUDY_ID",gxvar:"A150TBW07_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A150TBW07_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z150TBW07_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_STUDY_ID",gx.O.A150TBW07_STUDY_ID,0)},c2v:function(){gx.O.A150TBW07_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_STUDY_ID",
",")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBW07_SUBJECT_ID",format:0,grid:0};b[59]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_subject_id,isvalid:null,rgrid:[],fld:"TBW07_SUBJECT_ID",gxz:"Z152TBW07_SUBJECT_ID",gxold:"O152TBW07_SUBJECT_ID",gxvar:"A152TBW07_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A152TBW07_SUBJECT_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z152TBW07_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_SUBJECT_ID",
gx.O.A152TBW07_SUBJECT_ID,0)},c2v:function(){gx.O.A152TBW07_SUBJECT_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_SUBJECT_ID",",")},nac:gx.falseFn};b[62]={fld:"TEXTBLOCKTBW07_INS_NO",format:0,grid:0};b[64]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_ins_no,isvalid:null,rgrid:[],fld:"TBW07_INS_NO",gxz:"Z154TBW07_INS_NO",gxold:"O154TBW07_INS_NO",gxvar:"A154TBW07_INS_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A154TBW07_INS_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z154TBW07_INS_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_INS_NO",gx.O.A154TBW07_INS_NO,0)},c2v:function(){gx.O.A154TBW07_INS_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_INS_NO",",")},nac:gx.falseFn};b[67]={fld:"TEXTBLOCKTBW07_CRF_ID",format:0,grid:0};b[69]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_crf_id,isvalid:null,
rgrid:[],fld:"TBW07_CRF_ID",gxz:"Z156TBW07_CRF_ID",gxold:"O156TBW07_CRF_ID",gxvar:"A156TBW07_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A156TBW07_CRF_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z156TBW07_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_CRF_ID",gx.O.A156TBW07_CRF_ID,0)},c2v:function(){gx.O.A156TBW07_CRF_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_CRF_ID",",")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTBW07_CRF_VERSION",
format:0,grid:0};b[74]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_crf_version,isvalid:null,rgrid:[],fld:"TBW07_CRF_VERSION",gxz:"Z158TBW07_CRF_VERSION",gxold:"O158TBW07_CRF_VERSION",gxvar:"A158TBW07_CRF_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A158TBW07_CRF_VERSION=gx.num.intval(a)},v2z:function(a){gx.O.Z158TBW07_CRF_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_CRF_VERSION",gx.O.A158TBW07_CRF_VERSION,
0)},c2v:function(){gx.O.A158TBW07_CRF_VERSION=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_CRF_VERSION",",")},nac:gx.falseFn};b[77]={fld:"TEXTBLOCKTBW07_X",format:0,grid:0};b[79]={lvl:0,type:"int",len:4,dec:0,sign:true,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_x,isvalid:null,rgrid:[],fld:"TBW07_X",gxz:"Z160TBW07_X",gxold:"O160TBW07_X",gxvar:"A160TBW07_X",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A160TBW07_X=gx.num.intval(a)},v2z:function(a){gx.O.Z160TBW07_X=
gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_X",gx.O.A160TBW07_X,0)},c2v:function(){gx.O.A160TBW07_X=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_X",",")},nac:gx.falseFn};b[82]={fld:"TEXTBLOCKTBW07_Y",format:0,grid:0};b[84]={lvl:0,type:"int",len:4,dec:0,sign:true,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw07_y,isvalid:null,rgrid:[],fld:"TBW07_Y",gxz:"Z162TBW07_Y",gxold:"O162TBW07_Y",gxvar:"A162TBW07_Y",ucs:[],op:[94,89],ip:[94,89,84,79,74,
69,64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A162TBW07_Y=gx.num.intval(a)},v2z:function(a){gx.O.Z162TBW07_Y=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW07_Y",gx.O.A162TBW07_Y,0)},c2v:function(){gx.O.A162TBW07_Y=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW07_Y",",")},nac:gx.falseFn};b[87]={fld:"TEXTBLOCKTBW07_EDIT_REQUEST_FLG",format:0,grid:0};b[89]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBW07_EDIT_REQUEST_FLG",gxz:"Z768TBW07_EDIT_REQUEST_FLG",gxold:"O768TBW07_EDIT_REQUEST_FLG",gxvar:"A768TBW07_EDIT_REQUEST_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A768TBW07_EDIT_REQUEST_FLG=a},v2z:function(a){gx.O.Z768TBW07_EDIT_REQUEST_FLG=a},v2c:function(){gx.fn.setControlValue("TBW07_EDIT_REQUEST_FLG",gx.O.A768TBW07_EDIT_REQUEST_FLG,0)},c2v:function(){gx.O.A768TBW07_EDIT_REQUEST_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBW07_EDIT_REQUEST_FLG")},
nac:gx.falseFn};b[92]={fld:"TEXTBLOCKTBW07_COLOR_DIV",format:0,grid:0};b[94]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW07_COLOR_DIV",gxz:"Z769TBW07_COLOR_DIV",gxold:"O769TBW07_COLOR_DIV",gxvar:"A769TBW07_COLOR_DIV",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A769TBW07_COLOR_DIV=a},v2z:function(a){gx.O.Z769TBW07_COLOR_DIV=a},v2c:function(){gx.fn.setControlValue("TBW07_COLOR_DIV",gx.O.A769TBW07_COLOR_DIV,0)},c2v:function(){gx.O.A769TBW07_COLOR_DIV=
this.val()},val:function(){return gx.fn.getControlValue("TBW07_COLOR_DIV")},nac:gx.falseFn};this.O148TBW07_DISP_DATETIME=this.Z148TBW07_DISP_DATETIME=this.A148TBW07_DISP_DATETIME=this.O147TBW07_APP_ID=this.Z147TBW07_APP_ID=this.A147TBW07_APP_ID=this.O146TBW07_SESSION_ID=this.Z146TBW07_SESSION_ID=this.A146TBW07_SESSION_ID="";this.O162TBW07_Y=this.Z162TBW07_Y=this.A162TBW07_Y=this.O160TBW07_X=this.Z160TBW07_X=this.A160TBW07_X=this.O158TBW07_CRF_VERSION=this.Z158TBW07_CRF_VERSION=this.A158TBW07_CRF_VERSION=
this.O156TBW07_CRF_ID=this.Z156TBW07_CRF_ID=this.A156TBW07_CRF_ID=this.O154TBW07_INS_NO=this.Z154TBW07_INS_NO=this.A154TBW07_INS_NO=this.O152TBW07_SUBJECT_ID=this.Z152TBW07_SUBJECT_ID=this.A152TBW07_SUBJECT_ID=this.O150TBW07_STUDY_ID=this.Z150TBW07_STUDY_ID=this.A150TBW07_STUDY_ID=0;this.A148TBW07_DISP_DATETIME=this.A147TBW07_APP_ID=this.A146TBW07_SESSION_ID=this.AV8Pgmname=this.AV7W_BC_FLG=this.O769TBW07_COLOR_DIV=this.Z769TBW07_COLOR_DIV=this.A769TBW07_COLOR_DIV=this.O768TBW07_EDIT_REQUEST_FLG=
this.Z768TBW07_EDIT_REQUEST_FLG=this.A768TBW07_EDIT_REQUEST_FLG="";this.A162TBW07_Y=this.A160TBW07_X=this.A158TBW07_CRF_VERSION=this.A156TBW07_CRF_ID=this.A154TBW07_INS_NO=this.A152TBW07_SUBJECT_ID=this.A150TBW07_STUDY_ID=0;this.A769TBW07_COLOR_DIV=this.A768TBW07_EDIT_REQUEST_FLG="";this.Events={e121a45_client:["ENTER",true],e131a45_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV8Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",
0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbw07_crf_memo_loc);