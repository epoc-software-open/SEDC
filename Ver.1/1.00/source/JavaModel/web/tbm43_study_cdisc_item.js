gx.evt.autoSkip=false;function tbm43_study_cdisc_item(){this.ServerClass="TBM43_STUDY_CDISC_ITEM";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm43_study_id=function(){try{var a=gx.util.balloon.getNew("TBM43_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm43_dom_cd=function(){try{var a=gx.util.balloon.getNew("TBM43_DOM_CD");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm43_dom_var_nm=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm43_dom_var_nm",["gx.O.A894TBM43_STUDY_ID","gx.O.A895TBM43_DOM_CD","gx.O.A896TBM43_DOM_VAR_NM",'gx.date.urlDateTime(gx.O.A919TBM43_CRT_DATETIME,"Y4MD")',"gx.O.A912TBM43_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A920TBM43_UPD_DATETIME,"Y4MD")',"gx.O.A914TBM43_UPD_USER_ID","gx.O.A921TBM43_UPD_CNT","gx.O.A897TBM43_VAR_DESC","gx.O.A898TBM43_SDTM_FLG","gx.O.A899TBM43_CDASH_FLG","gx.O.A900TBM43_INPUT_TYPE_DIV","gx.O.A901TBM43_REQUIRED_FLG","gx.O.A902TBM43_SAS_FIELD_NM","gx.O.A903TBM43_ODM_DATA_TYPE","gx.O.A904TBM43_NOTE","gx.O.A905TBM43_ORDER","gx.O.A907TBM43_VERSION","gx.O.A906TBM43_DEL_FLG","gx.O.A913TBM43_CRT_PROG_NM","gx.O.A915TBM43_UPD_PROG_NM"],["A919TBM43_CRT_DATETIME","A912TBM43_CRT_USER_ID","A920TBM43_UPD_DATETIME","A914TBM43_UPD_USER_ID","A921TBM43_UPD_CNT","A897TBM43_VAR_DESC","A898TBM43_SDTM_FLG","A899TBM43_CDASH_FLG","A900TBM43_INPUT_TYPE_DIV","A901TBM43_REQUIRED_FLG","A902TBM43_SAS_FIELD_NM","A903TBM43_ODM_DATA_TYPE","A904TBM43_NOTE","A905TBM43_ORDER","A907TBM43_VERSION","A906TBM43_DEL_FLG","A913TBM43_CRT_PROG_NM","A915TBM43_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z894TBM43_STUDY_ID","Z895TBM43_DOM_CD","Z896TBM43_DOM_VAR_NM","Z919TBM43_CRT_DATETIME","Z912TBM43_CRT_USER_ID","Z920TBM43_UPD_DATETIME","Z914TBM43_UPD_USER_ID","Z921TBM43_UPD_CNT","Z897TBM43_VAR_DESC","Z898TBM43_SDTM_FLG","Z899TBM43_CDASH_FLG","Z900TBM43_INPUT_TYPE_DIV","Z901TBM43_REQUIRED_FLG","Z902TBM43_SAS_FIELD_NM","Z903TBM43_ODM_DATA_TYPE","Z904TBM43_NOTE","Z905TBM43_ORDER","Z907TBM43_VERSION","Z906TBM43_DEL_FLG","Z913TBM43_CRT_PROG_NM","Z915TBM43_UPD_PROG_NM","ZV9Pgmname","O921TBM43_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbm43_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM43_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A919TBM43_CRT_DATETIME)==0)||new gx.date.gxdate(this.A919TBM43_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm43_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM43_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A920TBM43_UPD_DATETIME)==0)||new gx.date.gxdate(this.A920TBM43_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm43_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM43_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e121j2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e131j54_client=function(){this.executeServerEvent("ENTER",true)};this.e141j54_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98,101,103,106,108,111,113,116,118,121,123,126,128,131,133,136,138];this.GXLastCtrlId=138;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};
this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};
this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBM43_STUDY_ID",format:0,grid:0};
this.GXValidFnc[38]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_study_id,isvalid:null,rgrid:[],fld:"TBM43_STUDY_ID",gxz:"Z894TBM43_STUDY_ID",gxold:"O894TBM43_STUDY_ID",gxvar:"A894TBM43_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A894TBM43_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z894TBM43_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM43_STUDY_ID",gx.O.A894TBM43_STUDY_ID,0)},c2v:function(){gx.O.A894TBM43_STUDY_ID=this.val()
},val:function(){return gx.fn.getIntegerValue("TBM43_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBM43_DOM_CD",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_dom_cd,isvalid:null,fld:"TBM43_DOM_CD",gxz:"Z895TBM43_DOM_CD",gxold:"O895TBM43_DOM_CD",gxvar:"A895TBM43_DOM_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A895TBM43_DOM_CD=a},v2z:function(a){gx.O.Z895TBM43_DOM_CD=a
},v2c:function(){gx.fn.setControlValue("TBM43_DOM_CD",gx.O.A895TBM43_DOM_CD,0)},c2v:function(){gx.O.A895TBM43_DOM_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM43_DOM_CD")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBM43_DOM_VAR_NM",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_dom_var_nm,isvalid:null,fld:"TBM43_DOM_VAR_NM",gxz:"Z896TBM43_DOM_VAR_NM",gxold:"O896TBM43_DOM_VAR_NM",gxvar:"A896TBM43_DOM_VAR_NM",ucs:[],op:[133,118,103,98,93,88,83,78,73,68,63,58,53,138,128,123,113,108],ip:[133,118,103,98,93,88,83,78,73,68,63,58,53,138,128,123,113,108,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A896TBM43_DOM_VAR_NM=a
},v2z:function(a){gx.O.Z896TBM43_DOM_VAR_NM=a},v2c:function(){gx.fn.setControlValue("TBM43_DOM_VAR_NM",gx.O.A896TBM43_DOM_VAR_NM,0)},c2v:function(){gx.O.A896TBM43_DOM_VAR_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM43_DOM_VAR_NM")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBM43_VAR_DESC",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_VAR_DESC",gxz:"Z897TBM43_VAR_DESC",gxold:"O897TBM43_VAR_DESC",gxvar:"A897TBM43_VAR_DESC",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A897TBM43_VAR_DESC=a
},v2z:function(a){gx.O.Z897TBM43_VAR_DESC=a},v2c:function(){gx.fn.setControlValue("TBM43_VAR_DESC",gx.O.A897TBM43_VAR_DESC,0)},c2v:function(){gx.O.A897TBM43_VAR_DESC=this.val()},val:function(){return gx.fn.getControlValue("TBM43_VAR_DESC")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBM43_SDTM_FLG",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_SDTM_FLG",gxz:"Z898TBM43_SDTM_FLG",gxold:"O898TBM43_SDTM_FLG",gxvar:"A898TBM43_SDTM_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A898TBM43_SDTM_FLG=a
},v2z:function(a){gx.O.Z898TBM43_SDTM_FLG=a},v2c:function(){gx.fn.setControlValue("TBM43_SDTM_FLG",gx.O.A898TBM43_SDTM_FLG,0)},c2v:function(){gx.O.A898TBM43_SDTM_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM43_SDTM_FLG")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBM43_CDASH_FLG",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_CDASH_FLG",gxz:"Z899TBM43_CDASH_FLG",gxold:"O899TBM43_CDASH_FLG",gxvar:"A899TBM43_CDASH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A899TBM43_CDASH_FLG=a
},v2z:function(a){gx.O.Z899TBM43_CDASH_FLG=a},v2c:function(){gx.fn.setControlValue("TBM43_CDASH_FLG",gx.O.A899TBM43_CDASH_FLG,0)},c2v:function(){gx.O.A899TBM43_CDASH_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM43_CDASH_FLG")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBM43_INPUT_TYPE_DIV",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_INPUT_TYPE_DIV",gxz:"Z900TBM43_INPUT_TYPE_DIV",gxold:"O900TBM43_INPUT_TYPE_DIV",gxvar:"A900TBM43_INPUT_TYPE_DIV",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A900TBM43_INPUT_TYPE_DIV=a
},v2z:function(a){gx.O.Z900TBM43_INPUT_TYPE_DIV=a},v2c:function(){gx.fn.setControlValue("TBM43_INPUT_TYPE_DIV",gx.O.A900TBM43_INPUT_TYPE_DIV,0)},c2v:function(){gx.O.A900TBM43_INPUT_TYPE_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBM43_INPUT_TYPE_DIV")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBM43_REQUIRED_FLG",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_REQUIRED_FLG",gxz:"Z901TBM43_REQUIRED_FLG",gxold:"O901TBM43_REQUIRED_FLG",gxvar:"A901TBM43_REQUIRED_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A901TBM43_REQUIRED_FLG=a
},v2z:function(a){gx.O.Z901TBM43_REQUIRED_FLG=a},v2c:function(){gx.fn.setControlValue("TBM43_REQUIRED_FLG",gx.O.A901TBM43_REQUIRED_FLG,0)},c2v:function(){gx.O.A901TBM43_REQUIRED_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM43_REQUIRED_FLG")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBM43_SAS_FIELD_NM",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_SAS_FIELD_NM",gxz:"Z902TBM43_SAS_FIELD_NM",gxold:"O902TBM43_SAS_FIELD_NM",gxvar:"A902TBM43_SAS_FIELD_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A902TBM43_SAS_FIELD_NM=a
},v2z:function(a){gx.O.Z902TBM43_SAS_FIELD_NM=a},v2c:function(){gx.fn.setControlValue("TBM43_SAS_FIELD_NM",gx.O.A902TBM43_SAS_FIELD_NM,0)},c2v:function(){gx.O.A902TBM43_SAS_FIELD_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM43_SAS_FIELD_NM")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBM43_ODM_DATA_TYPE",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_ODM_DATA_TYPE",gxz:"Z903TBM43_ODM_DATA_TYPE",gxold:"O903TBM43_ODM_DATA_TYPE",gxvar:"A903TBM43_ODM_DATA_TYPE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A903TBM43_ODM_DATA_TYPE=a
},v2z:function(a){gx.O.Z903TBM43_ODM_DATA_TYPE=a},v2c:function(){gx.fn.setControlValue("TBM43_ODM_DATA_TYPE",gx.O.A903TBM43_ODM_DATA_TYPE,0)},c2v:function(){gx.O.A903TBM43_ODM_DATA_TYPE=this.val()},val:function(){return gx.fn.getControlValue("TBM43_ODM_DATA_TYPE")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBM43_NOTE",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:1000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_NOTE",gxz:"Z904TBM43_NOTE",gxold:"O904TBM43_NOTE",gxvar:"A904TBM43_NOTE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A904TBM43_NOTE=a
},v2z:function(a){gx.O.Z904TBM43_NOTE=a},v2c:function(){gx.fn.setControlValue("TBM43_NOTE",gx.O.A904TBM43_NOTE,0)},c2v:function(){gx.O.A904TBM43_NOTE=this.val()},val:function(){return gx.fn.getControlValue("TBM43_NOTE")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBM43_ORDER",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"int",len:5,dec:0,sign:false,pic:"ZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM43_ORDER",gxz:"Z905TBM43_ORDER",gxold:"O905TBM43_ORDER",gxvar:"A905TBM43_ORDER",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A905TBM43_ORDER=gx.num.intval(a)
},v2z:function(a){gx.O.Z905TBM43_ORDER=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM43_ORDER",gx.O.A905TBM43_ORDER,0)},c2v:function(){gx.O.A905TBM43_ORDER=this.val()},val:function(){return gx.fn.getIntegerValue("TBM43_ORDER",",")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTBM43_VERSION",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_VERSION",gxz:"Z907TBM43_VERSION",gxold:"O907TBM43_VERSION",gxvar:"A907TBM43_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A907TBM43_VERSION=a
},v2z:function(a){gx.O.Z907TBM43_VERSION=a},v2c:function(){gx.fn.setControlValue("TBM43_VERSION",gx.O.A907TBM43_VERSION,0)},c2v:function(){gx.O.A907TBM43_VERSION=this.val()},val:function(){return gx.fn.getControlValue("TBM43_VERSION")},nac:function(){return false}};this.GXValidFnc[101]={fld:"TEXTBLOCKTBM43_DEL_FLG",format:0,grid:0};this.GXValidFnc[103]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_DEL_FLG",gxz:"Z906TBM43_DEL_FLG",gxold:"O906TBM43_DEL_FLG",gxvar:"A906TBM43_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A906TBM43_DEL_FLG=a
},v2z:function(a){gx.O.Z906TBM43_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM43_DEL_FLG",gx.O.A906TBM43_DEL_FLG,0)},c2v:function(){gx.O.A906TBM43_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM43_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[106]={fld:"TEXTBLOCKTBM43_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[108]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_crt_datetime,isvalid:null,fld:"TBM43_CRT_DATETIME",gxz:"Z919TBM43_CRT_DATETIME",gxold:"O919TBM43_CRT_DATETIME",gxvar:"A919TBM43_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[108],ip:[108],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A919TBM43_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z919TBM43_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM43_CRT_DATETIME",gx.O.A919TBM43_CRT_DATETIME,0)},c2v:function(){gx.O.A919TBM43_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM43_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[111]={fld:"TEXTBLOCKTBM43_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[113]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_CRT_USER_ID",gxz:"Z912TBM43_CRT_USER_ID",gxold:"O912TBM43_CRT_USER_ID",gxvar:"A912TBM43_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A912TBM43_CRT_USER_ID=a
},v2z:function(a){gx.O.Z912TBM43_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM43_CRT_USER_ID",gx.O.A912TBM43_CRT_USER_ID,0)},c2v:function(){gx.O.A912TBM43_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM43_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[116]={fld:"TEXTBLOCKTBM43_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[118]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_CRT_PROG_NM",gxz:"Z913TBM43_CRT_PROG_NM",gxold:"O913TBM43_CRT_PROG_NM",gxvar:"A913TBM43_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A913TBM43_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z913TBM43_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM43_CRT_PROG_NM",gx.O.A913TBM43_CRT_PROG_NM,0)},c2v:function(){gx.O.A913TBM43_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM43_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[121]={fld:"TEXTBLOCKTBM43_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[123]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_upd_datetime,isvalid:null,fld:"TBM43_UPD_DATETIME",gxz:"Z920TBM43_UPD_DATETIME",gxold:"O920TBM43_UPD_DATETIME",gxvar:"A920TBM43_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[123],ip:[123],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A920TBM43_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z920TBM43_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM43_UPD_DATETIME",gx.O.A920TBM43_UPD_DATETIME,0)},c2v:function(){gx.O.A920TBM43_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM43_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[126]={fld:"TEXTBLOCKTBM43_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[128]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_UPD_USER_ID",gxz:"Z914TBM43_UPD_USER_ID",gxold:"O914TBM43_UPD_USER_ID",gxvar:"A914TBM43_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A914TBM43_UPD_USER_ID=a
},v2z:function(a){gx.O.Z914TBM43_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM43_UPD_USER_ID",gx.O.A914TBM43_UPD_USER_ID,0)},c2v:function(){gx.O.A914TBM43_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM43_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[131]={fld:"TEXTBLOCKTBM43_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[133]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM43_UPD_PROG_NM",gxz:"Z915TBM43_UPD_PROG_NM",gxold:"O915TBM43_UPD_PROG_NM",gxvar:"A915TBM43_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A915TBM43_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z915TBM43_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM43_UPD_PROG_NM",gx.O.A915TBM43_UPD_PROG_NM,0)},c2v:function(){gx.O.A915TBM43_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM43_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[136]={fld:"TEXTBLOCKTBM43_UPD_CNT",format:0,grid:0};this.GXValidFnc[138]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm43_upd_cnt,isvalid:null,rgrid:[],fld:"TBM43_UPD_CNT",gxz:"Z921TBM43_UPD_CNT",gxold:"O921TBM43_UPD_CNT",gxvar:"A921TBM43_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A921TBM43_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z921TBM43_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM43_UPD_CNT",gx.O.A921TBM43_UPD_CNT,0)},c2v:function(){gx.O.A921TBM43_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBM43_UPD_CNT",",")},nac:function(){return false}};this.A894TBM43_STUDY_ID=0;this.Z894TBM43_STUDY_ID=0;this.O894TBM43_STUDY_ID=0;this.A895TBM43_DOM_CD="";this.Z895TBM43_DOM_CD="";this.O895TBM43_DOM_CD="";this.A896TBM43_DOM_VAR_NM="";this.Z896TBM43_DOM_VAR_NM="";this.O896TBM43_DOM_VAR_NM="";
this.A897TBM43_VAR_DESC="";this.Z897TBM43_VAR_DESC="";this.O897TBM43_VAR_DESC="";this.A898TBM43_SDTM_FLG="";this.Z898TBM43_SDTM_FLG="";this.O898TBM43_SDTM_FLG="";this.A899TBM43_CDASH_FLG="";this.Z899TBM43_CDASH_FLG="";this.O899TBM43_CDASH_FLG="";this.A900TBM43_INPUT_TYPE_DIV="";this.Z900TBM43_INPUT_TYPE_DIV="";this.O900TBM43_INPUT_TYPE_DIV="";this.A901TBM43_REQUIRED_FLG="";this.Z901TBM43_REQUIRED_FLG="";this.O901TBM43_REQUIRED_FLG="";this.A902TBM43_SAS_FIELD_NM="";this.Z902TBM43_SAS_FIELD_NM="";this.O902TBM43_SAS_FIELD_NM="";
this.A903TBM43_ODM_DATA_TYPE="";this.Z903TBM43_ODM_DATA_TYPE="";this.O903TBM43_ODM_DATA_TYPE="";this.A904TBM43_NOTE="";this.Z904TBM43_NOTE="";this.O904TBM43_NOTE="";this.A905TBM43_ORDER=0;this.Z905TBM43_ORDER=0;this.O905TBM43_ORDER=0;this.A907TBM43_VERSION="";this.Z907TBM43_VERSION="";this.O907TBM43_VERSION="";this.A906TBM43_DEL_FLG="";this.Z906TBM43_DEL_FLG="";this.O906TBM43_DEL_FLG="";this.A919TBM43_CRT_DATETIME=gx.date.nullDate();this.Z919TBM43_CRT_DATETIME=gx.date.nullDate();this.O919TBM43_CRT_DATETIME=gx.date.nullDate();
this.A912TBM43_CRT_USER_ID="";this.Z912TBM43_CRT_USER_ID="";this.O912TBM43_CRT_USER_ID="";this.A913TBM43_CRT_PROG_NM="";this.Z913TBM43_CRT_PROG_NM="";this.O913TBM43_CRT_PROG_NM="";this.A920TBM43_UPD_DATETIME=gx.date.nullDate();this.Z920TBM43_UPD_DATETIME=gx.date.nullDate();this.O920TBM43_UPD_DATETIME=gx.date.nullDate();this.A914TBM43_UPD_USER_ID="";this.Z914TBM43_UPD_USER_ID="";this.O914TBM43_UPD_USER_ID="";this.A915TBM43_UPD_PROG_NM="";this.Z915TBM43_UPD_PROG_NM="";this.O915TBM43_UPD_PROG_NM="";
this.A921TBM43_UPD_CNT=0;this.Z921TBM43_UPD_CNT=0;this.O921TBM43_UPD_CNT=0;this.AV7W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e121j2_client","e131j54_client","e141j54_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[54]=["O921TBM43_UPD_CNT"]}tbm43_study_cdisc_item.prototype=new gx.GxObject;gx.setParentObj(new tbm43_study_cdisc_item());