gx.evt.autoSkip=false;function tbw14_crf_sdt_work(){this.ServerClass="TBW14_CRF_SDT_WORK";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw14_session_id=function(){try{var a=gx.util.balloon.getNew("TBW14_SESSION_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw14_disp_datetime=function(){try{var a=gx.util.balloon.getNew("TBW14_DISP_DATETIME");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw14_study_id=function(){try{var a=gx.util.balloon.getNew("TBW14_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw14_subject_id=function(){try{var a=gx.util.balloon.getNew("TBW14_SUBJECT_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw14_crf_id=function(){try{var a=gx.util.balloon.getNew("TBW14_CRF_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbw14_crf_latest_version=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbw14_crf_latest_version",["gx.O.A875TBW14_SESSION_ID","gx.O.A876TBW14_DISP_DATETIME","gx.O.A878TBW14_STUDY_ID","gx.O.A883TBW14_SUBJECT_ID","gx.O.A880TBW14_CRF_ID","gx.O.A881TBW14_CRF_LATEST_VERSION","gx.O.A882TBW14_SDT_SAVE"],["A882TBW14_SDT_SAVE","Gx_mode","Z875TBW14_SESSION_ID","Z876TBW14_DISP_DATETIME","Z878TBW14_STUDY_ID","Z883TBW14_SUBJECT_ID","Z880TBW14_CRF_ID","Z881TBW14_CRF_LATEST_VERSION","Z882TBW14_SDT_SAVE",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.e111h52_client=function(){this.executeServerEvent("ENTER",true)};this.e121h52_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68];this.GXLastCtrlId=68;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};
this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};
this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBW14_SESSION_ID",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_session_id,isvalid:null,fld:"TBW14_SESSION_ID",gxz:"Z875TBW14_SESSION_ID",gxold:"O875TBW14_SESSION_ID",gxvar:"A875TBW14_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A875TBW14_SESSION_ID=a
},v2z:function(a){gx.O.Z875TBW14_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW14_SESSION_ID",gx.O.A875TBW14_SESSION_ID,0)},c2v:function(){gx.O.A875TBW14_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW14_SESSION_ID")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBW14_DISP_DATETIME",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_disp_datetime,isvalid:null,fld:"TBW14_DISP_DATETIME",gxz:"Z876TBW14_DISP_DATETIME",gxold:"O876TBW14_DISP_DATETIME",gxvar:"A876TBW14_DISP_DATETIME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A876TBW14_DISP_DATETIME=a
},v2z:function(a){gx.O.Z876TBW14_DISP_DATETIME=a},v2c:function(){gx.fn.setControlValue("TBW14_DISP_DATETIME",gx.O.A876TBW14_DISP_DATETIME,0)},c2v:function(){gx.O.A876TBW14_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBW14_DISP_DATETIME")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBW14_STUDY_ID",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_study_id,isvalid:null,rgrid:[],fld:"TBW14_STUDY_ID",gxz:"Z878TBW14_STUDY_ID",gxold:"O878TBW14_STUDY_ID",gxvar:"A878TBW14_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A878TBW14_STUDY_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z878TBW14_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW14_STUDY_ID",gx.O.A878TBW14_STUDY_ID,0)},c2v:function(){gx.O.A878TBW14_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBW14_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBW14_SUBJECT_ID",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_subject_id,isvalid:null,rgrid:[],fld:"TBW14_SUBJECT_ID",gxz:"Z883TBW14_SUBJECT_ID",gxold:"O883TBW14_SUBJECT_ID",gxvar:"A883TBW14_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A883TBW14_SUBJECT_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z883TBW14_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW14_SUBJECT_ID",gx.O.A883TBW14_SUBJECT_ID,0)},c2v:function(){gx.O.A883TBW14_SUBJECT_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBW14_SUBJECT_ID",",")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBW14_CRF_ID",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_crf_id,isvalid:null,rgrid:[],fld:"TBW14_CRF_ID",gxz:"Z880TBW14_CRF_ID",gxold:"O880TBW14_CRF_ID",gxvar:"A880TBW14_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A880TBW14_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z880TBW14_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW14_CRF_ID",gx.O.A880TBW14_CRF_ID,0)},c2v:function(){gx.O.A880TBW14_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBW14_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBW14_CRF_LATEST_VERSION",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw14_crf_latest_version,isvalid:null,rgrid:[],fld:"TBW14_CRF_LATEST_VERSION",gxz:"Z881TBW14_CRF_LATEST_VERSION",gxold:"O881TBW14_CRF_LATEST_VERSION",gxvar:"A881TBW14_CRF_LATEST_VERSION",ucs:[],op:[68],ip:[68,63,58,53,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A881TBW14_CRF_LATEST_VERSION=gx.num.intval(a)
},v2z:function(a){gx.O.Z881TBW14_CRF_LATEST_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW14_CRF_LATEST_VERSION",gx.O.A881TBW14_CRF_LATEST_VERSION,0)},c2v:function(){gx.O.A881TBW14_CRF_LATEST_VERSION=this.val()},val:function(){return gx.fn.getIntegerValue("TBW14_CRF_LATEST_VERSION",",")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBW14_SDT_SAVE",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"vchar",len:2097152,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBW14_SDT_SAVE",gxz:"Z882TBW14_SDT_SAVE",gxold:"O882TBW14_SDT_SAVE",gxvar:"A882TBW14_SDT_SAVE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A882TBW14_SDT_SAVE=a
},v2z:function(a){gx.O.Z882TBW14_SDT_SAVE=a},v2c:function(){gx.fn.setControlValue("TBW14_SDT_SAVE",gx.O.A882TBW14_SDT_SAVE,0)},c2v:function(){gx.O.A882TBW14_SDT_SAVE=this.val()},val:function(){return gx.fn.getControlValue("TBW14_SDT_SAVE")},nac:function(){return false}};this.A875TBW14_SESSION_ID="";this.Z875TBW14_SESSION_ID="";this.O875TBW14_SESSION_ID="";this.A876TBW14_DISP_DATETIME="";this.Z876TBW14_DISP_DATETIME="";this.O876TBW14_DISP_DATETIME="";this.A878TBW14_STUDY_ID=0;this.Z878TBW14_STUDY_ID=0;
this.O878TBW14_STUDY_ID=0;this.A883TBW14_SUBJECT_ID=0;this.Z883TBW14_SUBJECT_ID=0;this.O883TBW14_SUBJECT_ID=0;this.A880TBW14_CRF_ID=0;this.Z880TBW14_CRF_ID=0;this.O880TBW14_CRF_ID=0;this.A881TBW14_CRF_LATEST_VERSION=0;this.Z881TBW14_CRF_LATEST_VERSION=0;this.O881TBW14_CRF_LATEST_VERSION=0;this.A882TBW14_SDT_SAVE="";this.Z882TBW14_SDT_SAVE="";this.O882TBW14_SDT_SAVE="";this.ServerEvents=["e111h52_client","e121h52_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};
this.SetStandaloneVars()}tbw14_crf_sdt_work.prototype=new gx.GxObject;gx.setParentObj(new tbw14_crf_sdt_work());