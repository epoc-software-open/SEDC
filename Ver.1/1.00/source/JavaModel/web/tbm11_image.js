gx.evt.autoSkip=false;function tbm11_image(){this.ServerClass="TBM11_IMAGE";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm11_image_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm11_image_cd",["gx.O.A411TBM11_IMAGE_CD",'gx.date.urlDateTime(gx.O.A415TBM11_CRT_DATETIME,"Y4MD")',"gx.O.A416TBM11_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A418TBM11_UPD_DATETIME,"Y4MD")',"gx.O.A419TBM11_UPD_USER_ID","gx.O.A421TBM11_UPD_CNT","gx.O.A542TBM11_IMAGE_NM","gx.O.A412TBM11_IMAGE","gx.O.A413TBM11_FILE_NAME","gx.O.A512TBM11_STUDY_ID","gx.O.A414TBM11_DEL_FLG","gx.O.A417TBM11_CRT_PROG_NM","gx.O.A420TBM11_UPD_PROG_NM"],["A415TBM11_CRT_DATETIME","A416TBM11_CRT_USER_ID","A418TBM11_UPD_DATETIME","A419TBM11_UPD_USER_ID","A421TBM11_UPD_CNT","A542TBM11_IMAGE_NM","A412TBM11_IMAGE","A413TBM11_FILE_NAME","A512TBM11_STUDY_ID","A414TBM11_DEL_FLG","A417TBM11_CRT_PROG_NM","A420TBM11_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z411TBM11_IMAGE_CD","Z415TBM11_CRT_DATETIME","Z416TBM11_CRT_USER_ID","Z418TBM11_UPD_DATETIME","Z419TBM11_UPD_USER_ID","Z421TBM11_UPD_CNT","Z542TBM11_IMAGE_NM","Z412TBM11_IMAGE","Z413TBM11_FILE_NAME","Z512TBM11_STUDY_ID","Z414TBM11_DEL_FLG","Z417TBM11_CRT_PROG_NM","Z420TBM11_UPD_PROG_NM","ZV9Pgmname","O421TBM11_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbm11_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM11_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A415TBM11_CRT_DATETIME)==0)||new gx.date.gxdate(this.A415TBM11_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm11_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM11_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A418TBM11_UPD_DATETIME)==0)||new gx.date.gxdate(this.A418TBM11_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm11_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM11_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e120v2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130v30_client=function(){this.executeServerEvent("ENTER",true)};this.e140v30_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98];this.GXLastCtrlId=98;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};
this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};
this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBM11_IMAGE_CD",format:0,grid:0};
this.GXValidFnc[38]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm11_image_cd,isvalid:null,fld:"TBM11_IMAGE_CD",gxz:"Z411TBM11_IMAGE_CD",gxold:"O411TBM11_IMAGE_CD",gxvar:"A411TBM11_IMAGE_CD",ucs:[],op:[93,78,63,58,53,48,43,98,88,83,73,68],ip:[93,78,63,58,53,48,43,98,88,83,73,68,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A411TBM11_IMAGE_CD=a},v2z:function(a){gx.O.Z411TBM11_IMAGE_CD=a},v2c:function(){gx.fn.setControlValue("TBM11_IMAGE_CD",gx.O.A411TBM11_IMAGE_CD,0)
},c2v:function(){gx.O.A411TBM11_IMAGE_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM11_IMAGE_CD")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBM11_IMAGE_NM",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_IMAGE_NM",gxz:"Z542TBM11_IMAGE_NM",gxold:"O542TBM11_IMAGE_NM",gxvar:"A542TBM11_IMAGE_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A542TBM11_IMAGE_NM=a
},v2z:function(a){gx.O.Z542TBM11_IMAGE_NM=a},v2c:function(){gx.fn.setControlValue("TBM11_IMAGE_NM",gx.O.A542TBM11_IMAGE_NM,0)},c2v:function(){gx.O.A542TBM11_IMAGE_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM11_IMAGE_NM")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBM11_IMAGE",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"bitstr",len:1024,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_IMAGE",gxz:"Z412TBM11_IMAGE",gxold:"O412TBM11_IMAGE",gxvar:"A412TBM11_IMAGE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A412TBM11_IMAGE=a
},v2z:function(a){gx.O.Z412TBM11_IMAGE=a},v2c:function(){gx.fn.setBlobValue("TBM11_IMAGE",gx.O.A412TBM11_IMAGE)},c2v:function(){gx.O.A412TBM11_IMAGE=this.val()},val:function(){return gx.fn.getBlobValue("TBM11_IMAGE")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBM11_FILE_NAME",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"svchar",len:100,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_FILE_NAME",gxz:"Z413TBM11_FILE_NAME",gxold:"O413TBM11_FILE_NAME",gxvar:"A413TBM11_FILE_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A413TBM11_FILE_NAME=a
},v2z:function(a){gx.O.Z413TBM11_FILE_NAME=a},v2c:function(){gx.fn.setControlValue("TBM11_FILE_NAME",gx.O.A413TBM11_FILE_NAME,0)},c2v:function(){gx.O.A413TBM11_FILE_NAME=this.val()},val:function(){return gx.fn.getControlValue("TBM11_FILE_NAME")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBM11_STUDY_ID",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM11_STUDY_ID",gxz:"Z512TBM11_STUDY_ID",gxold:"O512TBM11_STUDY_ID",gxvar:"A512TBM11_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A512TBM11_STUDY_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z512TBM11_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM11_STUDY_ID",gx.O.A512TBM11_STUDY_ID,0)},c2v:function(){gx.O.A512TBM11_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBM11_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBM11_DEL_FLG",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_DEL_FLG",gxz:"Z414TBM11_DEL_FLG",gxold:"O414TBM11_DEL_FLG",gxvar:"A414TBM11_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A414TBM11_DEL_FLG=a
},v2z:function(a){gx.O.Z414TBM11_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM11_DEL_FLG",gx.O.A414TBM11_DEL_FLG,0)},c2v:function(){gx.O.A414TBM11_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM11_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBM11_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm11_crt_datetime,isvalid:null,fld:"TBM11_CRT_DATETIME",gxz:"Z415TBM11_CRT_DATETIME",gxold:"O415TBM11_CRT_DATETIME",gxvar:"A415TBM11_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[68],ip:[68],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A415TBM11_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z415TBM11_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM11_CRT_DATETIME",gx.O.A415TBM11_CRT_DATETIME,0)},c2v:function(){gx.O.A415TBM11_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM11_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBM11_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_CRT_USER_ID",gxz:"Z416TBM11_CRT_USER_ID",gxold:"O416TBM11_CRT_USER_ID",gxvar:"A416TBM11_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A416TBM11_CRT_USER_ID=a
},v2z:function(a){gx.O.Z416TBM11_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM11_CRT_USER_ID",gx.O.A416TBM11_CRT_USER_ID,0)},c2v:function(){gx.O.A416TBM11_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM11_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBM11_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_CRT_PROG_NM",gxz:"Z417TBM11_CRT_PROG_NM",gxold:"O417TBM11_CRT_PROG_NM",gxvar:"A417TBM11_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A417TBM11_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z417TBM11_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM11_CRT_PROG_NM",gx.O.A417TBM11_CRT_PROG_NM,0)},c2v:function(){gx.O.A417TBM11_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM11_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBM11_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm11_upd_datetime,isvalid:null,fld:"TBM11_UPD_DATETIME",gxz:"Z418TBM11_UPD_DATETIME",gxold:"O418TBM11_UPD_DATETIME",gxvar:"A418TBM11_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[83],ip:[83],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A418TBM11_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z418TBM11_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM11_UPD_DATETIME",gx.O.A418TBM11_UPD_DATETIME,0)},c2v:function(){gx.O.A418TBM11_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM11_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBM11_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_UPD_USER_ID",gxz:"Z419TBM11_UPD_USER_ID",gxold:"O419TBM11_UPD_USER_ID",gxvar:"A419TBM11_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A419TBM11_UPD_USER_ID=a
},v2z:function(a){gx.O.Z419TBM11_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM11_UPD_USER_ID",gx.O.A419TBM11_UPD_USER_ID,0)},c2v:function(){gx.O.A419TBM11_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM11_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBM11_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM11_UPD_PROG_NM",gxz:"Z420TBM11_UPD_PROG_NM",gxold:"O420TBM11_UPD_PROG_NM",gxvar:"A420TBM11_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A420TBM11_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z420TBM11_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM11_UPD_PROG_NM",gx.O.A420TBM11_UPD_PROG_NM,0)},c2v:function(){gx.O.A420TBM11_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM11_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTBM11_UPD_CNT",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm11_upd_cnt,isvalid:null,rgrid:[],fld:"TBM11_UPD_CNT",gxz:"Z421TBM11_UPD_CNT",gxold:"O421TBM11_UPD_CNT",gxvar:"A421TBM11_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A421TBM11_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z421TBM11_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM11_UPD_CNT",gx.O.A421TBM11_UPD_CNT,0)},c2v:function(){gx.O.A421TBM11_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBM11_UPD_CNT",",")},nac:function(){return false}};this.A411TBM11_IMAGE_CD="";this.Z411TBM11_IMAGE_CD="";this.O411TBM11_IMAGE_CD="";this.A542TBM11_IMAGE_NM="";this.Z542TBM11_IMAGE_NM="";this.O542TBM11_IMAGE_NM="";this.A412TBM11_IMAGE="";this.Z412TBM11_IMAGE="";this.O412TBM11_IMAGE="";
this.A413TBM11_FILE_NAME="";this.Z413TBM11_FILE_NAME="";this.O413TBM11_FILE_NAME="";this.A512TBM11_STUDY_ID=0;this.Z512TBM11_STUDY_ID=0;this.O512TBM11_STUDY_ID=0;this.A414TBM11_DEL_FLG="";this.Z414TBM11_DEL_FLG="";this.O414TBM11_DEL_FLG="";this.A415TBM11_CRT_DATETIME=gx.date.nullDate();this.Z415TBM11_CRT_DATETIME=gx.date.nullDate();this.O415TBM11_CRT_DATETIME=gx.date.nullDate();this.A416TBM11_CRT_USER_ID="";this.Z416TBM11_CRT_USER_ID="";this.O416TBM11_CRT_USER_ID="";this.A417TBM11_CRT_PROG_NM="";
this.Z417TBM11_CRT_PROG_NM="";this.O417TBM11_CRT_PROG_NM="";this.A418TBM11_UPD_DATETIME=gx.date.nullDate();this.Z418TBM11_UPD_DATETIME=gx.date.nullDate();this.O418TBM11_UPD_DATETIME=gx.date.nullDate();this.A419TBM11_UPD_USER_ID="";this.Z419TBM11_UPD_USER_ID="";this.O419TBM11_UPD_USER_ID="";this.A420TBM11_UPD_PROG_NM="";this.Z420TBM11_UPD_PROG_NM="";this.O420TBM11_UPD_PROG_NM="";this.A421TBM11_UPD_CNT=0;this.Z421TBM11_UPD_CNT=0;this.O421TBM11_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e120v2_client","e130v30_client","e140v30_client"];
this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[30]=["O421TBM11_UPD_CNT"]}tbm11_image.prototype=new gx.GxObject;gx.setParentObj(new tbm11_image());