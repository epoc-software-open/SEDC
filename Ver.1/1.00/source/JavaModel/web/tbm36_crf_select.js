gx.evt.autoSkip=false;function tbm36_crf_select(){this.ServerClass="TBM36_CRF_SELECT";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm36_study_id=function(){try{var a=gx.util.balloon.getNew("TBM36_STUDY_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm36_crf_id=function(){try{var a=gx.util.balloon.getNew("TBM36_CRF_ID");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm36_cond_no=function(){try{var a=gx.util.balloon.getNew("TBM36_COND_NO");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm36_select_crf_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm36_select_crf_id",["gx.O.A484TBM36_STUDY_ID","gx.O.A485TBM36_CRF_ID","gx.O.A486TBM36_COND_NO","gx.O.A487TBM36_SELECT_CRF_ID",'gx.date.urlDateTime(gx.O.A489TBM36_CRT_DATETIME,"Y4MD")',"gx.O.A490TBM36_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A492TBM36_UPD_DATETIME,"Y4MD")',"gx.O.A493TBM36_UPD_USER_ID","gx.O.A495TBM36_UPD_CNT","gx.O.A488TBM36_DEL_FLG","gx.O.A491TBM36_CRT_PROG_NM","gx.O.A494TBM36_UPD_PROG_NM"],["A489TBM36_CRT_DATETIME","A490TBM36_CRT_USER_ID","A492TBM36_UPD_DATETIME","A493TBM36_UPD_USER_ID","A495TBM36_UPD_CNT","A488TBM36_DEL_FLG","A491TBM36_CRT_PROG_NM","A494TBM36_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z484TBM36_STUDY_ID","Z485TBM36_CRF_ID","Z486TBM36_COND_NO","Z487TBM36_SELECT_CRF_ID","Z489TBM36_CRT_DATETIME","Z490TBM36_CRT_USER_ID","Z492TBM36_UPD_DATETIME","Z493TBM36_UPD_USER_ID","Z495TBM36_UPD_CNT","Z488TBM36_DEL_FLG","Z491TBM36_CRT_PROG_NM","Z494TBM36_UPD_PROG_NM","ZV9Pgmname","O495TBM36_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbm36_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM36_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A489TBM36_CRT_DATETIME)==0)||new gx.date.gxdate(this.A489TBM36_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm36_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM36_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A492TBM36_UPD_DATETIME)==0)||new gx.date.gxdate(this.A492TBM36_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm36_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM36_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e12112_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e131136_client=function(){this.executeServerEvent("ENTER",true)};this.e141136_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93];this.GXLastCtrlId=93;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};
this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};
this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBM36_STUDY_ID",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_study_id,isvalid:null,rgrid:[],fld:"TBM36_STUDY_ID",gxz:"Z484TBM36_STUDY_ID",gxold:"O484TBM36_STUDY_ID",gxvar:"A484TBM36_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A484TBM36_STUDY_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z484TBM36_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM36_STUDY_ID",gx.O.A484TBM36_STUDY_ID,0)},c2v:function(){gx.O.A484TBM36_STUDY_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBM36_STUDY_ID",",")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBM36_CRF_ID",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_crf_id,isvalid:null,rgrid:[],fld:"TBM36_CRF_ID",gxz:"Z485TBM36_CRF_ID",gxold:"O485TBM36_CRF_ID",gxvar:"A485TBM36_CRF_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A485TBM36_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z485TBM36_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM36_CRF_ID",gx.O.A485TBM36_CRF_ID,0)},c2v:function(){gx.O.A485TBM36_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBM36_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBM36_COND_NO",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_cond_no,isvalid:null,rgrid:[],fld:"TBM36_COND_NO",gxz:"Z486TBM36_COND_NO",gxold:"O486TBM36_COND_NO",gxvar:"A486TBM36_COND_NO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A486TBM36_COND_NO=gx.num.intval(a)
},v2z:function(a){gx.O.Z486TBM36_COND_NO=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM36_COND_NO",gx.O.A486TBM36_COND_NO,0)},c2v:function(){gx.O.A486TBM36_COND_NO=this.val()},val:function(){return gx.fn.getIntegerValue("TBM36_COND_NO",",")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBM36_SELECT_CRF_ID",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_select_crf_id,isvalid:null,rgrid:[],fld:"TBM36_SELECT_CRF_ID",gxz:"Z487TBM36_SELECT_CRF_ID",gxold:"O487TBM36_SELECT_CRF_ID",gxvar:"A487TBM36_SELECT_CRF_ID",ucs:[],op:[88,73,58,93,83,78,68,63],ip:[88,73,58,93,83,78,68,63,53,48,43,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A487TBM36_SELECT_CRF_ID=gx.num.intval(a)
},v2z:function(a){gx.O.Z487TBM36_SELECT_CRF_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM36_SELECT_CRF_ID",gx.O.A487TBM36_SELECT_CRF_ID,0)},c2v:function(){gx.O.A487TBM36_SELECT_CRF_ID=this.val()},val:function(){return gx.fn.getIntegerValue("TBM36_SELECT_CRF_ID",",")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBM36_DEL_FLG",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM36_DEL_FLG",gxz:"Z488TBM36_DEL_FLG",gxold:"O488TBM36_DEL_FLG",gxvar:"A488TBM36_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A488TBM36_DEL_FLG=a
},v2z:function(a){gx.O.Z488TBM36_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM36_DEL_FLG",gx.O.A488TBM36_DEL_FLG,0)},c2v:function(){gx.O.A488TBM36_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM36_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBM36_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_crt_datetime,isvalid:null,fld:"TBM36_CRT_DATETIME",gxz:"Z489TBM36_CRT_DATETIME",gxold:"O489TBM36_CRT_DATETIME",gxvar:"A489TBM36_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[63],ip:[63],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A489TBM36_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z489TBM36_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM36_CRT_DATETIME",gx.O.A489TBM36_CRT_DATETIME,0)},c2v:function(){gx.O.A489TBM36_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM36_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBM36_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM36_CRT_USER_ID",gxz:"Z490TBM36_CRT_USER_ID",gxold:"O490TBM36_CRT_USER_ID",gxvar:"A490TBM36_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A490TBM36_CRT_USER_ID=a
},v2z:function(a){gx.O.Z490TBM36_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM36_CRT_USER_ID",gx.O.A490TBM36_CRT_USER_ID,0)},c2v:function(){gx.O.A490TBM36_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM36_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBM36_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM36_CRT_PROG_NM",gxz:"Z491TBM36_CRT_PROG_NM",gxold:"O491TBM36_CRT_PROG_NM",gxvar:"A491TBM36_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A491TBM36_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z491TBM36_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM36_CRT_PROG_NM",gx.O.A491TBM36_CRT_PROG_NM,0)},c2v:function(){gx.O.A491TBM36_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM36_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBM36_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_upd_datetime,isvalid:null,fld:"TBM36_UPD_DATETIME",gxz:"Z492TBM36_UPD_DATETIME",gxold:"O492TBM36_UPD_DATETIME",gxvar:"A492TBM36_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[78],ip:[78],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A492TBM36_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z492TBM36_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM36_UPD_DATETIME",gx.O.A492TBM36_UPD_DATETIME,0)},c2v:function(){gx.O.A492TBM36_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM36_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBM36_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM36_UPD_USER_ID",gxz:"Z493TBM36_UPD_USER_ID",gxold:"O493TBM36_UPD_USER_ID",gxvar:"A493TBM36_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A493TBM36_UPD_USER_ID=a
},v2z:function(a){gx.O.Z493TBM36_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM36_UPD_USER_ID",gx.O.A493TBM36_UPD_USER_ID,0)},c2v:function(){gx.O.A493TBM36_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM36_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBM36_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM36_UPD_PROG_NM",gxz:"Z494TBM36_UPD_PROG_NM",gxold:"O494TBM36_UPD_PROG_NM",gxvar:"A494TBM36_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A494TBM36_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z494TBM36_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM36_UPD_PROG_NM",gx.O.A494TBM36_UPD_PROG_NM,0)},c2v:function(){gx.O.A494TBM36_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM36_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBM36_UPD_CNT",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm36_upd_cnt,isvalid:null,rgrid:[],fld:"TBM36_UPD_CNT",gxz:"Z495TBM36_UPD_CNT",gxold:"O495TBM36_UPD_CNT",gxvar:"A495TBM36_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A495TBM36_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z495TBM36_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM36_UPD_CNT",gx.O.A495TBM36_UPD_CNT,0)},c2v:function(){gx.O.A495TBM36_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBM36_UPD_CNT",",")},nac:function(){return false}};this.A484TBM36_STUDY_ID=0;this.Z484TBM36_STUDY_ID=0;this.O484TBM36_STUDY_ID=0;this.A485TBM36_CRF_ID=0;this.Z485TBM36_CRF_ID=0;this.O485TBM36_CRF_ID=0;this.A486TBM36_COND_NO=0;this.Z486TBM36_COND_NO=0;this.O486TBM36_COND_NO=0;
this.A487TBM36_SELECT_CRF_ID=0;this.Z487TBM36_SELECT_CRF_ID=0;this.O487TBM36_SELECT_CRF_ID=0;this.A488TBM36_DEL_FLG="";this.Z488TBM36_DEL_FLG="";this.O488TBM36_DEL_FLG="";this.A489TBM36_CRT_DATETIME=gx.date.nullDate();this.Z489TBM36_CRT_DATETIME=gx.date.nullDate();this.O489TBM36_CRT_DATETIME=gx.date.nullDate();this.A490TBM36_CRT_USER_ID="";this.Z490TBM36_CRT_USER_ID="";this.O490TBM36_CRT_USER_ID="";this.A491TBM36_CRT_PROG_NM="";this.Z491TBM36_CRT_PROG_NM="";this.O491TBM36_CRT_PROG_NM="";this.A492TBM36_UPD_DATETIME=gx.date.nullDate();
this.Z492TBM36_UPD_DATETIME=gx.date.nullDate();this.O492TBM36_UPD_DATETIME=gx.date.nullDate();this.A493TBM36_UPD_USER_ID="";this.Z493TBM36_UPD_USER_ID="";this.O493TBM36_UPD_USER_ID="";this.A494TBM36_UPD_PROG_NM="";this.Z494TBM36_UPD_PROG_NM="";this.O494TBM36_UPD_PROG_NM="";this.A495TBM36_UPD_CNT=0;this.Z495TBM36_UPD_CNT=0;this.O495TBM36_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e12112_client","e131136_client","e141136_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];
this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[36]=["O495TBM36_UPD_CNT"]}tbm36_crf_select.prototype=new gx.GxObject;gx.setParentObj(new tbm36_crf_select());