gx.evt.autoSkip=false;function tbt13_crf_res_his(){this.ServerClass="TBT13_CRF_RES_HIS";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbt13_study_id=function(){try{var a=gx.util.balloon.getNew("TBT13_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_subject_id=function(){try{var a=gx.util.balloon.getNew("TBT13_SUBJECT_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_crf_id=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_crf_version=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_VERSION");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_crf_item_grp_div=function(){try{var a=gx.util.balloon.getNew("TBT13_CRF_ITEM_GRP_DIV");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_crf_item_grp_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbt13_crf_item_grp_cd",["gx.O.A496TBT13_STUDY_ID","gx.O.A497TBT13_SUBJECT_ID","gx.O.A498TBT13_CRF_ID","gx.O.A499TBT13_CRF_VERSION","gx.O.A500TBT13_CRF_ITEM_GRP_DIV","gx.O.A501TBT13_CRF_ITEM_GRP_CD",'gx.date.urlDateTime(gx.O.A504TBT13_CRT_DATETIME,"Y4MD")',"gx.O.A505TBT13_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A507TBT13_UPD_DATETIME,"Y4MD")',"gx.O.A508TBT13_UPD_USER_ID","gx.O.A510TBT13_UPD_CNT","gx.O.A502TBT13_CRF_VALUE","gx.O.A588TBT13_EDIT_FLG","gx.O.A503TBT13_DEL_FLG","gx.O.A506TBT13_CRT_PROG_NM","gx.O.A509TBT13_UPD_PROG_NM"],["A504TBT13_CRT_DATETIME","A505TBT13_CRT_USER_ID","A507TBT13_UPD_DATETIME","A508TBT13_UPD_USER_ID","A510TBT13_UPD_CNT","A502TBT13_CRF_VALUE","A588TBT13_EDIT_FLG","A503TBT13_DEL_FLG","A506TBT13_CRT_PROG_NM","A509TBT13_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z496TBT13_STUDY_ID","Z497TBT13_SUBJECT_ID","Z498TBT13_CRF_ID","Z499TBT13_CRF_VERSION","Z500TBT13_CRF_ITEM_GRP_DIV","Z501TBT13_CRF_ITEM_GRP_CD","Z504TBT13_CRT_DATETIME","Z505TBT13_CRT_USER_ID","Z507TBT13_UPD_DATETIME","Z508TBT13_UPD_USER_ID","Z510TBT13_UPD_CNT","Z502TBT13_CRF_VALUE","Z588TBT13_EDIT_FLG","Z503TBT13_DEL_FLG","Z506TBT13_CRT_PROG_NM","Z509TBT13_UPD_PROG_NM","ZV9Pgmname","O510TBT13_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbt13_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBT13_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A504TBT13_CRT_DATETIME)==0)||new gx.date.gxdate(this.A504TBT13_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBT13_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A507TBT13_UPD_DATETIME)==0)||new gx.date.gxdate(this.A507TBT13_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbt13_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBT13_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e12122_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e131237_client=function(){this.executeServerEvent("ENTER",true)};this.e141237_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93,96,98,101,103,106,108,111,113];this.GXLastCtrlId=113;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};
this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};
this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBT13_STUDY_ID",format:0,grid:0};
this.GXValidFnc[38]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_study_id,isvalid:null,rgrid:[],fld:"TBT13_STUDY_ID",gxz:"Z496TBT13_STUDY_ID",gxold:"O496TBT13_STUDY_ID",gxvar:"A496TBT13_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A496TBT13_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z496TBT13_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_STUDY_ID",gx.O.A496TBT13_STUDY_ID,0)},c2v:function(){gx.O.A496TBT13_STUDY_ID=this.val()
},val:function(){return gx.fn.getIntegerValue("TBT13_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBT13_SUBJECT_ID",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_subject_id,isvalid:null,rgrid:[],fld:"TBT13_SUBJECT_ID",gxz:"Z497TBT13_SUBJECT_ID",gxold:"O497TBT13_SUBJECT_ID",gxvar:"A497TBT13_SUBJECT_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A497TBT13_SUBJECT_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z497TBT13_SUBJECT_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_SUBJECT_ID",gx.O.A497TBT13_SUBJECT_ID,0)},c2v:function(){gx.O.A497TBT13_SUBJECT_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBT13_SUBJECT_ID",",")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBT13_CRF_ID",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_id,isvalid:null,rgrid:[],fld:"TBT13_CRF_ID",gxz:"Z498TBT13_CRF_ID",gxold:"O498TBT13_CRF_ID",gxvar:"A498TBT13_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A498TBT13_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z498TBT13_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ID",gx.O.A498TBT13_CRF_ID,0)},c2v:function(){gx.O.A498TBT13_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBT13_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBT13_CRF_VERSION",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_version,isvalid:null,rgrid:[],fld:"TBT13_CRF_VERSION",gxz:"Z499TBT13_CRF_VERSION",gxold:"O499TBT13_CRF_VERSION",gxvar:"A499TBT13_CRF_VERSION",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A499TBT13_CRF_VERSION=gx.num.intval(a)
},v2z:function(a){gx.O.Z499TBT13_CRF_VERSION=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRF_VERSION",gx.O.A499TBT13_CRF_VERSION,0)},c2v:function(){gx.O.A499TBT13_CRF_VERSION=this.val()},val:function(){return gx.fn.getIntegerValue("TBT13_CRF_VERSION",",")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBT13_CRF_ITEM_GRP_DIV",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_item_grp_div,isvalid:null,fld:"TBT13_CRF_ITEM_GRP_DIV",gxz:"Z500TBT13_CRF_ITEM_GRP_DIV",gxold:"O500TBT13_CRF_ITEM_GRP_DIV",gxvar:"A500TBT13_CRF_ITEM_GRP_DIV",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A500TBT13_CRF_ITEM_GRP_DIV=a
},v2z:function(a){gx.O.Z500TBT13_CRF_ITEM_GRP_DIV=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ITEM_GRP_DIV",gx.O.A500TBT13_CRF_ITEM_GRP_DIV,0)},c2v:function(){gx.O.A500TBT13_CRF_ITEM_GRP_DIV=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_ITEM_GRP_DIV")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBT13_CRF_ITEM_GRP_CD",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crf_item_grp_cd,isvalid:null,fld:"TBT13_CRF_ITEM_GRP_CD",gxz:"Z501TBT13_CRF_ITEM_GRP_CD",gxold:"O501TBT13_CRF_ITEM_GRP_CD",gxvar:"A501TBT13_CRF_ITEM_GRP_CD",ucs:[],op:[108,93,78,73,68,113,103,98,88,83],ip:[108,93,78,73,68,113,103,98,88,83,63,58,53,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A501TBT13_CRF_ITEM_GRP_CD=a
},v2z:function(a){gx.O.Z501TBT13_CRF_ITEM_GRP_CD=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_ITEM_GRP_CD",gx.O.A501TBT13_CRF_ITEM_GRP_CD,0)},c2v:function(){gx.O.A501TBT13_CRF_ITEM_GRP_CD=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_ITEM_GRP_CD")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBT13_CRF_VALUE",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:2000,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_CRF_VALUE",gxz:"Z502TBT13_CRF_VALUE",gxold:"O502TBT13_CRF_VALUE",gxvar:"A502TBT13_CRF_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A502TBT13_CRF_VALUE=a
},v2z:function(a){gx.O.Z502TBT13_CRF_VALUE=a},v2c:function(){gx.fn.setControlValue("TBT13_CRF_VALUE",gx.O.A502TBT13_CRF_VALUE,0)},c2v:function(){gx.O.A502TBT13_CRF_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRF_VALUE")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBT13_EDIT_FLG",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_EDIT_FLG",gxz:"Z588TBT13_EDIT_FLG",gxold:"O588TBT13_EDIT_FLG",gxvar:"A588TBT13_EDIT_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A588TBT13_EDIT_FLG=a
},v2z:function(a){gx.O.Z588TBT13_EDIT_FLG=a},v2c:function(){gx.fn.setControlValue("TBT13_EDIT_FLG",gx.O.A588TBT13_EDIT_FLG,0)},c2v:function(){gx.O.A588TBT13_EDIT_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT13_EDIT_FLG")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBT13_DEL_FLG",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_DEL_FLG",gxz:"Z503TBT13_DEL_FLG",gxold:"O503TBT13_DEL_FLG",gxvar:"A503TBT13_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A503TBT13_DEL_FLG=a
},v2z:function(a){gx.O.Z503TBT13_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBT13_DEL_FLG",gx.O.A503TBT13_DEL_FLG,0)},c2v:function(){gx.O.A503TBT13_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBT13_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBT13_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_crt_datetime,isvalid:null,fld:"TBT13_CRT_DATETIME",gxz:"Z504TBT13_CRT_DATETIME",gxold:"O504TBT13_CRT_DATETIME",gxvar:"A504TBT13_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[83],ip:[83],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A504TBT13_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z504TBT13_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT13_CRT_DATETIME",gx.O.A504TBT13_CRT_DATETIME,0)},c2v:function(){gx.O.A504TBT13_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBT13_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_CRT_USER_ID",gxz:"Z505TBT13_CRT_USER_ID",gxold:"O505TBT13_CRT_USER_ID",gxvar:"A505TBT13_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A505TBT13_CRT_USER_ID=a
},v2z:function(a){gx.O.Z505TBT13_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT13_CRT_USER_ID",gx.O.A505TBT13_CRT_USER_ID,0)},c2v:function(){gx.O.A505TBT13_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBT13_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_CRT_PROG_NM",gxz:"Z506TBT13_CRT_PROG_NM",gxold:"O506TBT13_CRT_PROG_NM",gxvar:"A506TBT13_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A506TBT13_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z506TBT13_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT13_CRT_PROG_NM",gx.O.A506TBT13_CRT_PROG_NM,0)},c2v:function(){gx.O.A506TBT13_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT13_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[96]={fld:"TEXTBLOCKTBT13_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[98]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_upd_datetime,isvalid:null,fld:"TBT13_UPD_DATETIME",gxz:"Z507TBT13_UPD_DATETIME",gxold:"O507TBT13_UPD_DATETIME",gxvar:"A507TBT13_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[98],ip:[98],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A507TBT13_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z507TBT13_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBT13_UPD_DATETIME",gx.O.A507TBT13_UPD_DATETIME,0)},c2v:function(){gx.O.A507TBT13_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBT13_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[101]={fld:"TEXTBLOCKTBT13_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[103]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_UPD_USER_ID",gxz:"Z508TBT13_UPD_USER_ID",gxold:"O508TBT13_UPD_USER_ID",gxvar:"A508TBT13_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A508TBT13_UPD_USER_ID=a
},v2z:function(a){gx.O.Z508TBT13_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBT13_UPD_USER_ID",gx.O.A508TBT13_UPD_USER_ID,0)},c2v:function(){gx.O.A508TBT13_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBT13_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[106]={fld:"TEXTBLOCKTBT13_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[108]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBT13_UPD_PROG_NM",gxz:"Z509TBT13_UPD_PROG_NM",gxold:"O509TBT13_UPD_PROG_NM",gxvar:"A509TBT13_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A509TBT13_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z509TBT13_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBT13_UPD_PROG_NM",gx.O.A509TBT13_UPD_PROG_NM,0)},c2v:function(){gx.O.A509TBT13_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBT13_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[111]={fld:"TEXTBLOCKTBT13_UPD_CNT",format:0,grid:0};this.GXValidFnc[113]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbt13_upd_cnt,isvalid:null,rgrid:[],fld:"TBT13_UPD_CNT",gxz:"Z510TBT13_UPD_CNT",gxold:"O510TBT13_UPD_CNT",gxvar:"A510TBT13_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A510TBT13_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z510TBT13_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBT13_UPD_CNT",gx.O.A510TBT13_UPD_CNT,0)},c2v:function(){gx.O.A510TBT13_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBT13_UPD_CNT",",")},nac:function(){return false}};this.A496TBT13_STUDY_ID=0;this.Z496TBT13_STUDY_ID=0;this.O496TBT13_STUDY_ID=0;this.A497TBT13_SUBJECT_ID=0;this.Z497TBT13_SUBJECT_ID=0;this.O497TBT13_SUBJECT_ID=0;this.A498TBT13_CRF_ID=0;this.Z498TBT13_CRF_ID=0;this.O498TBT13_CRF_ID=0;
this.A499TBT13_CRF_VERSION=0;this.Z499TBT13_CRF_VERSION=0;this.O499TBT13_CRF_VERSION=0;this.A500TBT13_CRF_ITEM_GRP_DIV="";this.Z500TBT13_CRF_ITEM_GRP_DIV="";this.O500TBT13_CRF_ITEM_GRP_DIV="";this.A501TBT13_CRF_ITEM_GRP_CD="";this.Z501TBT13_CRF_ITEM_GRP_CD="";this.O501TBT13_CRF_ITEM_GRP_CD="";this.A502TBT13_CRF_VALUE="";this.Z502TBT13_CRF_VALUE="";this.O502TBT13_CRF_VALUE="";this.A588TBT13_EDIT_FLG="";this.Z588TBT13_EDIT_FLG="";this.O588TBT13_EDIT_FLG="";this.A503TBT13_DEL_FLG="";this.Z503TBT13_DEL_FLG="";
this.O503TBT13_DEL_FLG="";this.A504TBT13_CRT_DATETIME=gx.date.nullDate();this.Z504TBT13_CRT_DATETIME=gx.date.nullDate();this.O504TBT13_CRT_DATETIME=gx.date.nullDate();this.A505TBT13_CRT_USER_ID="";this.Z505TBT13_CRT_USER_ID="";this.O505TBT13_CRT_USER_ID="";this.A506TBT13_CRT_PROG_NM="";this.Z506TBT13_CRT_PROG_NM="";this.O506TBT13_CRT_PROG_NM="";this.A507TBT13_UPD_DATETIME=gx.date.nullDate();this.Z507TBT13_UPD_DATETIME=gx.date.nullDate();this.O507TBT13_UPD_DATETIME=gx.date.nullDate();this.A508TBT13_UPD_USER_ID="";
this.Z508TBT13_UPD_USER_ID="";this.O508TBT13_UPD_USER_ID="";this.A509TBT13_UPD_PROG_NM="";this.Z509TBT13_UPD_PROG_NM="";this.O509TBT13_UPD_PROG_NM="";this.A510TBT13_UPD_CNT=0;this.Z510TBT13_UPD_CNT=0;this.O510TBT13_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e12122_client","e131237_client","e141237_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};
this.SetStandaloneVars();this.LvlOlds[37]=["O510TBT13_UPD_CNT"]}tbt13_crf_res_his.prototype=new gx.GxObject;gx.setParentObj(new tbt13_crf_res_his());