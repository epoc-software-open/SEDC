gx.evt.autoSkip=false;function tbm07_auth_behavior(){this.ServerClass="TBM07_AUTH_BEHAVIOR";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm07_auth_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm07_auth_cd",["gx.O.A530TBM07_AUTH_CD",'gx.date.urlDateTime(gx.O.A535TBM07_CRT_DATETIME,"Y4MD")',"gx.O.A536TBM07_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A538TBM07_UPD_DATETIME,"Y4MD")',"gx.O.A539TBM07_UPD_USER_ID","gx.O.A541TBM07_UPD_CNT","gx.O.A531TBM07_CRF_INP_AUTH_FLG","gx.O.A532TBM07_CRF_EDIT_AUTH_FLG","gx.O.A533TBM07_OTHER_SITE_VIEW_FLG","gx.O.A534TBM07_DEL_FLG","gx.O.A537TBM07_CRT_PROG_NM","gx.O.A540TBM07_UPD_PROG_NM"],["A535TBM07_CRT_DATETIME","A536TBM07_CRT_USER_ID","A538TBM07_UPD_DATETIME","A539TBM07_UPD_USER_ID","A541TBM07_UPD_CNT","A531TBM07_CRF_INP_AUTH_FLG","A532TBM07_CRF_EDIT_AUTH_FLG","A533TBM07_OTHER_SITE_VIEW_FLG","A534TBM07_DEL_FLG","A537TBM07_CRT_PROG_NM","A540TBM07_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z530TBM07_AUTH_CD","Z535TBM07_CRT_DATETIME","Z536TBM07_CRT_USER_ID","Z538TBM07_UPD_DATETIME","Z539TBM07_UPD_USER_ID","Z541TBM07_UPD_CNT","Z531TBM07_CRF_INP_AUTH_FLG","Z532TBM07_CRF_EDIT_AUTH_FLG","Z533TBM07_OTHER_SITE_VIEW_FLG","Z534TBM07_DEL_FLG","Z537TBM07_CRT_PROG_NM","Z540TBM07_UPD_PROG_NM","ZV9Pgmname","O541TBM07_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);
return true};this.Valid_Tbm07_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM07_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A535TBM07_CRT_DATETIME)==0)||new gx.date.gxdate(this.A535TBM07_CRT_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　作成日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm07_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM07_UPD_DATETIME");
this.AnyError=0;if(!((new gx.date.gxdate("").compare(this.A538TBM07_UPD_DATETIME)==0)||new gx.date.gxdate(this.A538TBM07_UPD_DATETIME).compare(gx.date.ymdhmstot(1000,1,1,0,0,0))>=0)){try{a.setError("フィールド　更新日時 は範囲外です");this.AnyError=1}catch(b){}}}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tbm07_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM07_UPD_CNT");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true
};this.e12142_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e131439_client=function(){this.executeServerEvent("ENTER",true)};this.e141439_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,38,41,43,46,48,51,53,56,58,61,63,66,68,71,73,76,78,81,83,86,88,91,93];this.GXLastCtrlId=93;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};
this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};
this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"TEXTBLOCKTBM07_AUTH_CD",format:0,grid:0};this.GXValidFnc[38]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm07_auth_cd,isvalid:null,fld:"TBM07_AUTH_CD",gxz:"Z530TBM07_AUTH_CD",gxold:"O530TBM07_AUTH_CD",gxvar:"A530TBM07_AUTH_CD",ucs:[],op:[88,73,58,53,48,43,93,83,78,68,63],ip:[88,73,58,53,48,43,93,83,78,68,63,38],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A530TBM07_AUTH_CD=a
},v2z:function(a){gx.O.Z530TBM07_AUTH_CD=a},v2c:function(){gx.fn.setControlValue("TBM07_AUTH_CD",gx.O.A530TBM07_AUTH_CD,0)},c2v:function(){gx.O.A530TBM07_AUTH_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM07_AUTH_CD")},nac:function(){return false}};this.GXValidFnc[41]={fld:"TEXTBLOCKTBM07_CRF_INP_AUTH_FLG",format:0,grid:0};this.GXValidFnc[43]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_CRF_INP_AUTH_FLG",gxz:"Z531TBM07_CRF_INP_AUTH_FLG",gxold:"O531TBM07_CRF_INP_AUTH_FLG",gxvar:"A531TBM07_CRF_INP_AUTH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A531TBM07_CRF_INP_AUTH_FLG=a
},v2z:function(a){gx.O.Z531TBM07_CRF_INP_AUTH_FLG=a},v2c:function(){gx.fn.setControlValue("TBM07_CRF_INP_AUTH_FLG",gx.O.A531TBM07_CRF_INP_AUTH_FLG,0)},c2v:function(){gx.O.A531TBM07_CRF_INP_AUTH_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM07_CRF_INP_AUTH_FLG")},nac:function(){return false}};this.GXValidFnc[46]={fld:"TEXTBLOCKTBM07_CRF_EDIT_AUTH_FLG",format:0,grid:0};this.GXValidFnc[48]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_CRF_EDIT_AUTH_FLG",gxz:"Z532TBM07_CRF_EDIT_AUTH_FLG",gxold:"O532TBM07_CRF_EDIT_AUTH_FLG",gxvar:"A532TBM07_CRF_EDIT_AUTH_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A532TBM07_CRF_EDIT_AUTH_FLG=a
},v2z:function(a){gx.O.Z532TBM07_CRF_EDIT_AUTH_FLG=a},v2c:function(){gx.fn.setControlValue("TBM07_CRF_EDIT_AUTH_FLG",gx.O.A532TBM07_CRF_EDIT_AUTH_FLG,0)},c2v:function(){gx.O.A532TBM07_CRF_EDIT_AUTH_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM07_CRF_EDIT_AUTH_FLG")},nac:function(){return false}};this.GXValidFnc[51]={fld:"TEXTBLOCKTBM07_OTHER_SITE_VIEW_FLG",format:0,grid:0};this.GXValidFnc[53]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_OTHER_SITE_VIEW_FLG",gxz:"Z533TBM07_OTHER_SITE_VIEW_FLG",gxold:"O533TBM07_OTHER_SITE_VIEW_FLG",gxvar:"A533TBM07_OTHER_SITE_VIEW_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A533TBM07_OTHER_SITE_VIEW_FLG=a
},v2z:function(a){gx.O.Z533TBM07_OTHER_SITE_VIEW_FLG=a},v2c:function(){gx.fn.setControlValue("TBM07_OTHER_SITE_VIEW_FLG",gx.O.A533TBM07_OTHER_SITE_VIEW_FLG,0)},c2v:function(){gx.O.A533TBM07_OTHER_SITE_VIEW_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM07_OTHER_SITE_VIEW_FLG")},nac:function(){return false}};this.GXValidFnc[56]={fld:"TEXTBLOCKTBM07_DEL_FLG",format:0,grid:0};this.GXValidFnc[58]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_DEL_FLG",gxz:"Z534TBM07_DEL_FLG",gxold:"O534TBM07_DEL_FLG",gxvar:"A534TBM07_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A534TBM07_DEL_FLG=a
},v2z:function(a){gx.O.Z534TBM07_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM07_DEL_FLG",gx.O.A534TBM07_DEL_FLG,0)},c2v:function(){gx.O.A534TBM07_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM07_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[61]={fld:"TEXTBLOCKTBM07_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[63]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm07_crt_datetime,isvalid:null,fld:"TBM07_CRT_DATETIME",gxz:"Z535TBM07_CRT_DATETIME",gxold:"O535TBM07_CRT_DATETIME",gxvar:"A535TBM07_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[63],ip:[63],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A535TBM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z535TBM07_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM07_CRT_DATETIME",gx.O.A535TBM07_CRT_DATETIME,0)},c2v:function(){gx.O.A535TBM07_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM07_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[66]={fld:"TEXTBLOCKTBM07_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_CRT_USER_ID",gxz:"Z536TBM07_CRT_USER_ID",gxold:"O536TBM07_CRT_USER_ID",gxvar:"A536TBM07_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A536TBM07_CRT_USER_ID=a
},v2z:function(a){gx.O.Z536TBM07_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM07_CRT_USER_ID",gx.O.A536TBM07_CRT_USER_ID,0)},c2v:function(){gx.O.A536TBM07_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM07_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTBM07_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_CRT_PROG_NM",gxz:"Z537TBM07_CRT_PROG_NM",gxold:"O537TBM07_CRT_PROG_NM",gxvar:"A537TBM07_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A537TBM07_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z537TBM07_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM07_CRT_PROG_NM",gx.O.A537TBM07_CRT_PROG_NM,0)},c2v:function(){gx.O.A537TBM07_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM07_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTBM07_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm07_upd_datetime,isvalid:null,fld:"TBM07_UPD_DATETIME",gxz:"Z538TBM07_UPD_DATETIME",gxold:"O538TBM07_UPD_DATETIME",gxvar:"A538TBM07_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[78],ip:[78],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A538TBM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z538TBM07_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM07_UPD_DATETIME",gx.O.A538TBM07_UPD_DATETIME,0)},c2v:function(){gx.O.A538TBM07_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TBM07_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTBM07_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_UPD_USER_ID",gxz:"Z539TBM07_UPD_USER_ID",gxold:"O539TBM07_UPD_USER_ID",gxvar:"A539TBM07_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A539TBM07_UPD_USER_ID=a
},v2z:function(a){gx.O.Z539TBM07_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM07_UPD_USER_ID",gx.O.A539TBM07_UPD_USER_ID,0)},c2v:function(){gx.O.A539TBM07_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM07_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[86]={fld:"TEXTBLOCKTBM07_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[88]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,fld:"TBM07_UPD_PROG_NM",gxz:"Z540TBM07_UPD_PROG_NM",gxold:"O540TBM07_UPD_PROG_NM",gxvar:"A540TBM07_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A540TBM07_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z540TBM07_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM07_UPD_PROG_NM",gx.O.A540TBM07_UPD_PROG_NM,0)},c2v:function(){gx.O.A540TBM07_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM07_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[91]={fld:"TEXTBLOCKTBM07_UPD_CNT",format:0,grid:0};this.GXValidFnc[93]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm07_upd_cnt,isvalid:null,rgrid:[],fld:"TBM07_UPD_CNT",gxz:"Z541TBM07_UPD_CNT",gxold:"O541TBM07_UPD_CNT",gxvar:"A541TBM07_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A541TBM07_UPD_CNT=gx.num.intval(a)
},v2z:function(a){gx.O.Z541TBM07_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM07_UPD_CNT",gx.O.A541TBM07_UPD_CNT,0)},c2v:function(){gx.O.A541TBM07_UPD_CNT=this.val()},val:function(){return gx.fn.getIntegerValue("TBM07_UPD_CNT",",")},nac:function(){return false}};this.A530TBM07_AUTH_CD="";this.Z530TBM07_AUTH_CD="";this.O530TBM07_AUTH_CD="";this.A531TBM07_CRF_INP_AUTH_FLG="";this.Z531TBM07_CRF_INP_AUTH_FLG="";this.O531TBM07_CRF_INP_AUTH_FLG="";this.A532TBM07_CRF_EDIT_AUTH_FLG="";
this.Z532TBM07_CRF_EDIT_AUTH_FLG="";this.O532TBM07_CRF_EDIT_AUTH_FLG="";this.A533TBM07_OTHER_SITE_VIEW_FLG="";this.Z533TBM07_OTHER_SITE_VIEW_FLG="";this.O533TBM07_OTHER_SITE_VIEW_FLG="";this.A534TBM07_DEL_FLG="";this.Z534TBM07_DEL_FLG="";this.O534TBM07_DEL_FLG="";this.A535TBM07_CRT_DATETIME=gx.date.nullDate();this.Z535TBM07_CRT_DATETIME=gx.date.nullDate();this.O535TBM07_CRT_DATETIME=gx.date.nullDate();this.A536TBM07_CRT_USER_ID="";this.Z536TBM07_CRT_USER_ID="";this.O536TBM07_CRT_USER_ID="";this.A537TBM07_CRT_PROG_NM="";
this.Z537TBM07_CRT_PROG_NM="";this.O537TBM07_CRT_PROG_NM="";this.A538TBM07_UPD_DATETIME=gx.date.nullDate();this.Z538TBM07_UPD_DATETIME=gx.date.nullDate();this.O538TBM07_UPD_DATETIME=gx.date.nullDate();this.A539TBM07_UPD_USER_ID="";this.Z539TBM07_UPD_USER_ID="";this.O539TBM07_UPD_USER_ID="";this.A540TBM07_UPD_PROG_NM="";this.Z540TBM07_UPD_PROG_NM="";this.O540TBM07_UPD_PROG_NM="";this.A541TBM07_UPD_CNT=0;this.Z541TBM07_UPD_CNT=0;this.O541TBM07_UPD_CNT=0;this.AV8W_BC_FLG="";this.AV9Pgmname="";this.ServerEvents=["e12142_client","e131439_client","e141439_client"];
this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.VarControlMap.AV9Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[39]=["O541TBM07_UPD_CNT"]}tbm07_auth_behavior.prototype=new gx.GxObject;gx.setParentObj(new tbm07_auth_behavior());