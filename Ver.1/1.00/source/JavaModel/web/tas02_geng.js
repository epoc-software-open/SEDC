gx.evt.autoSkip=false;function tas02_geng(){this.ServerClass="TAS02_GENG";this.PackageName="";this.setObjectType("trn");this.hasEnterEvent=true;this.SetStandaloneVars=function(){this.A116TAS02_UPD_CNT=gx.fn.getIntegerValue("TAS02_UPD_CNT",",");this.Gx_BScreen=gx.fn.getIntegerValue("vGXBSCREEN",",");this.AV14Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tas02_gngo_kbn=function(){gx.ajax.validSrvEvt("dyncall","valid_Tas02_gngo_kbn",["gx.O.A22TAS02_GNGO_KBN",'gx.date.urlDateTime(gx.O.A57TAS02_CRT_DATETIME,"Y4MD")',"gx.O.A83TAS02_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A60TAS02_UPD_DATETIME,"Y4MD")',"gx.O.A84TAS02_UPD_USER_ID","gx.O.A116TAS02_UPD_CNT","gx.O.A23TAS02_GNGO_NM","gx.O.A56TAS02_GNGO_RYAK_NM","gx.O.A26TAS02_HNKAN_NEN","gx.O.A24TAS02_DATE_START","gx.O.A25TAS02_DATE_END","gx.O.A63TAS02_DATE_W_START","gx.O.A64TAS02_DATE_W_END","gx.O.A115TAS02_DEL_FLG","gx.O.A59TAS02_CRT_PROG_NM","gx.O.A62TAS02_UPD_PROG_NM"],["A57TAS02_CRT_DATETIME","A83TAS02_CRT_USER_ID","A60TAS02_UPD_DATETIME","A84TAS02_UPD_USER_ID","A116TAS02_UPD_CNT","A23TAS02_GNGO_NM","A56TAS02_GNGO_RYAK_NM","A26TAS02_HNKAN_NEN","A24TAS02_DATE_START","A25TAS02_DATE_END","A63TAS02_DATE_W_START","A64TAS02_DATE_W_END","A115TAS02_DEL_FLG","A59TAS02_CRT_PROG_NM","A62TAS02_UPD_PROG_NM","AV14Pgmname","Gx_mode","Z22TAS02_GNGO_KBN","Z57TAS02_CRT_DATETIME","Z83TAS02_CRT_USER_ID","Z60TAS02_UPD_DATETIME","Z84TAS02_UPD_USER_ID","Z116TAS02_UPD_CNT","Z23TAS02_GNGO_NM","Z56TAS02_GNGO_RYAK_NM","Z26TAS02_HNKAN_NEN","Z24TAS02_DATE_START","Z25TAS02_DATE_END","Z63TAS02_DATE_W_START","Z64TAS02_DATE_W_END","Z115TAS02_DEL_FLG","Z59TAS02_CRT_PROG_NM","Z62TAS02_UPD_PROG_NM","ZV14Pgmname","O116TAS02_UPD_CNT",["A22TAS02_GNGO_KBN","Enabled"],["A57TAS02_CRT_DATETIME","Visible"],["A59TAS02_CRT_PROG_NM","Visible"],["A60TAS02_UPD_DATETIME","Visible"],["A62TAS02_UPD_PROG_NM","Visible"],["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"],["BTN_CANCEL","Enabled"]]);
return true};this.Valid_Tas02_gngo_nm=function(){try{var a=gx.util.balloon.getNew("TAS02_GNGO_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_gngo_ryak_nm=function(){try{var a=gx.util.balloon.getNew("TAS02_GNGO_RYAK_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_hnkan_nen=function(){try{var a=gx.util.balloon.getNew("TAS02_HNKAN_NEN");this.AnyError=0}catch(b){}try{if(a==null){return true
}return a.show()}catch(b){}return true};this.Valid_Tas02_date_start=function(){try{var a=gx.util.balloon.getNew("TAS02_DATE_START");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_date_end=function(){try{var a=gx.util.balloon.getNew("TAS02_DATE_END");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_date_w_start=function(){try{var a=gx.util.balloon.getNew("TAS02_DATE_W_START");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_date_w_end=function(){try{var a=gx.util.balloon.getNew("TAS02_DATE_W_END");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_del_flg=function(){try{var a=gx.util.balloon.getNew("TAS02_DEL_FLG");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAS02_CRT_DATETIME");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_crt_user_id=function(){try{var a=gx.util.balloon.getNew("TAS02_CRT_USER_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_crt_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAS02_CRT_PROG_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAS02_UPD_DATETIME");
this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_upd_user_id=function(){try{var a=gx.util.balloon.getNew("TAS02_UPD_USER_ID");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.Valid_Tas02_upd_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAS02_UPD_PROG_NM");this.AnyError=0}catch(b){}try{if(a==null){return true}return a.show()}catch(b){}return true};this.e12062_client=function(){this.executeServerEvent("'BTN_CLER'",true)
};this.e13066_client=function(){this.executeServerEvent("ENTER",true)};this.e14066_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,26,27,33,36,37,39,42,43,45,48,50,53,54,56,59,60,62,65,66,68,71,73,76,78,81,83,89,91,94,96,99,101,104,106,109,111,114,116,122,125,128,131];this.GXLastCtrlId=131;this.GXValidFnc[2]={fld:"TABLEMAIN",grid:0};this.GXValidFnc[5]={fld:"TABLETOOLBAR",grid:0};this.GXValidFnc[8]={fld:"BTN_FIRST",grid:0};
this.GXValidFnc[9]={fld:"BTN_FIRST_SEPARATOR",grid:0};this.GXValidFnc[10]={fld:"BTN_PREVIOUS",grid:0};this.GXValidFnc[11]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};this.GXValidFnc[12]={fld:"BTN_NEXT",grid:0};this.GXValidFnc[13]={fld:"BTN_NEXT_SEPARATOR",grid:0};this.GXValidFnc[14]={fld:"BTN_LAST",grid:0};this.GXValidFnc[15]={fld:"BTN_LAST_SEPARATOR",grid:0};this.GXValidFnc[16]={fld:"BTN_SELECT",grid:0};this.GXValidFnc[17]={fld:"BTN_SELECT_SEPARATOR",grid:0};this.GXValidFnc[18]={fld:"BTN_ENTER2",grid:0};
this.GXValidFnc[19]={fld:"BTN_ENTER2_SEPARATOR",grid:0};this.GXValidFnc[20]={fld:"BTN_CANCEL2",grid:0};this.GXValidFnc[21]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};this.GXValidFnc[22]={fld:"BTN_DELETE2",grid:0};this.GXValidFnc[23]={fld:"BTN_DELETE2_SEPARATOR",grid:0};this.GXValidFnc[26]={fld:"GROUPDATA",grid:0};this.GXValidFnc[27]={fld:"TABLE1",grid:0};this.GXValidFnc[33]={fld:"TABLE2",grid:0};this.GXValidFnc[36]={fld:"IMAGE19",grid:0};this.GXValidFnc[37]={fld:"TEXTBLOCKTAS02_GNGO_KBN",format:0,grid:0};
this.GXValidFnc[39]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_gngo_kbn,isvalid:null,fld:"TAS02_GNGO_KBN",gxz:"Z22TAS02_GNGO_KBN",gxold:"O22TAS02_GNGO_KBN",gxvar:"A22TAS02_GNGO_KBN",ucs:[],op:[116,101,83,78,73,68,62,56,50,45,111,106,96,91],ip:[116,101,83,78,73,68,62,56,50,45,111,106,96,91,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A22TAS02_GNGO_KBN=a},v2z:function(a){gx.O.Z22TAS02_GNGO_KBN=a},v2c:function(){gx.fn.setControlValue("TAS02_GNGO_KBN",gx.O.A22TAS02_GNGO_KBN,0)
},c2v:function(){gx.O.A22TAS02_GNGO_KBN=this.val()},val:function(){return gx.fn.getControlValue("TAS02_GNGO_KBN")},nac:function(){return false}};this.GXValidFnc[42]={fld:"IMAGE20",grid:0};this.GXValidFnc[43]={fld:"TEXTBLOCKTAS02_GNGO_NM",format:0,grid:0};this.GXValidFnc[45]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_gngo_nm,isvalid:null,fld:"TAS02_GNGO_NM",gxz:"Z23TAS02_GNGO_NM",gxold:"O23TAS02_GNGO_NM",gxvar:"A23TAS02_GNGO_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A23TAS02_GNGO_NM=a
},v2z:function(a){gx.O.Z23TAS02_GNGO_NM=a},v2c:function(){gx.fn.setControlValue("TAS02_GNGO_NM",gx.O.A23TAS02_GNGO_NM,0)},c2v:function(){gx.O.A23TAS02_GNGO_NM=this.val()},val:function(){return gx.fn.getControlValue("TAS02_GNGO_NM")},nac:function(){return false}};this.GXValidFnc[48]={fld:"TEXTBLOCKTAS02_GNGO_RYAK_NM",format:0,grid:0};this.GXValidFnc[50]={lvl:0,type:"svchar",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_gngo_ryak_nm,isvalid:null,fld:"TAS02_GNGO_RYAK_NM",gxz:"Z56TAS02_GNGO_RYAK_NM",gxold:"O56TAS02_GNGO_RYAK_NM",gxvar:"A56TAS02_GNGO_RYAK_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A56TAS02_GNGO_RYAK_NM=a
},v2z:function(a){gx.O.Z56TAS02_GNGO_RYAK_NM=a},v2c:function(){gx.fn.setControlValue("TAS02_GNGO_RYAK_NM",gx.O.A56TAS02_GNGO_RYAK_NM,0)},c2v:function(){gx.O.A56TAS02_GNGO_RYAK_NM=this.val()},val:function(){return gx.fn.getControlValue("TAS02_GNGO_RYAK_NM")},nac:function(){return false}};this.GXValidFnc[53]={fld:"IMAGE21",grid:0};this.GXValidFnc[54]={fld:"TEXTBLOCKTAS02_HNKAN_NEN",format:0,grid:0};this.GXValidFnc[56]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_hnkan_nen,isvalid:null,rgrid:[],fld:"TAS02_HNKAN_NEN",gxz:"Z26TAS02_HNKAN_NEN",gxold:"O26TAS02_HNKAN_NEN",gxvar:"A26TAS02_HNKAN_NEN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A26TAS02_HNKAN_NEN=gx.num.intval(a)
},v2z:function(a){gx.O.Z26TAS02_HNKAN_NEN=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TAS02_HNKAN_NEN",gx.O.A26TAS02_HNKAN_NEN,0)},c2v:function(){gx.O.A26TAS02_HNKAN_NEN=this.val()},val:function(){return gx.fn.getIntegerValue("TAS02_HNKAN_NEN",",")},nac:function(){return false}};this.GXValidFnc[59]={fld:"IMAGE22",grid:0};this.GXValidFnc[60]={fld:"TEXTBLOCKTAS02_DATE_START",format:0,grid:0};this.GXValidFnc[62]={lvl:0,type:"svchar",len:8,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_date_start,isvalid:null,fld:"TAS02_DATE_START",gxz:"Z24TAS02_DATE_START",gxold:"O24TAS02_DATE_START",gxvar:"A24TAS02_DATE_START",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A24TAS02_DATE_START=a
},v2z:function(a){gx.O.Z24TAS02_DATE_START=a},v2c:function(){gx.fn.setControlValue("TAS02_DATE_START",gx.O.A24TAS02_DATE_START,0)},c2v:function(){gx.O.A24TAS02_DATE_START=this.val()},val:function(){return gx.fn.getControlValue("TAS02_DATE_START")},nac:function(){return false}};this.GXValidFnc[65]={fld:"IMAGE23",grid:0};this.GXValidFnc[66]={fld:"TEXTBLOCKTAS02_DATE_END",format:0,grid:0};this.GXValidFnc[68]={lvl:0,type:"svchar",len:8,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_date_end,isvalid:null,fld:"TAS02_DATE_END",gxz:"Z25TAS02_DATE_END",gxold:"O25TAS02_DATE_END",gxvar:"A25TAS02_DATE_END",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A25TAS02_DATE_END=a
},v2z:function(a){gx.O.Z25TAS02_DATE_END=a},v2c:function(){gx.fn.setControlValue("TAS02_DATE_END",gx.O.A25TAS02_DATE_END,0)},c2v:function(){gx.O.A25TAS02_DATE_END=this.val()},val:function(){return gx.fn.getControlValue("TAS02_DATE_END")},nac:function(){return false}};this.GXValidFnc[71]={fld:"TEXTBLOCKTAS02_DATE_W_START",format:0,grid:0};this.GXValidFnc[73]={lvl:0,type:"svchar",len:6,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_date_w_start,isvalid:null,fld:"TAS02_DATE_W_START",gxz:"Z63TAS02_DATE_W_START",gxold:"O63TAS02_DATE_W_START",gxvar:"A63TAS02_DATE_W_START",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A63TAS02_DATE_W_START=a
},v2z:function(a){gx.O.Z63TAS02_DATE_W_START=a},v2c:function(){gx.fn.setControlValue("TAS02_DATE_W_START",gx.O.A63TAS02_DATE_W_START,0)},c2v:function(){gx.O.A63TAS02_DATE_W_START=this.val()},val:function(){return gx.fn.getControlValue("TAS02_DATE_W_START")},nac:function(){return false}};this.GXValidFnc[76]={fld:"TEXTBLOCKTAS02_DATE_W_END",format:0,grid:0};this.GXValidFnc[78]={lvl:0,type:"svchar",len:6,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_date_w_end,isvalid:null,fld:"TAS02_DATE_W_END",gxz:"Z64TAS02_DATE_W_END",gxold:"O64TAS02_DATE_W_END",gxvar:"A64TAS02_DATE_W_END",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A64TAS02_DATE_W_END=a
},v2z:function(a){gx.O.Z64TAS02_DATE_W_END=a},v2c:function(){gx.fn.setControlValue("TAS02_DATE_W_END",gx.O.A64TAS02_DATE_W_END,0)},c2v:function(){gx.O.A64TAS02_DATE_W_END=this.val()},val:function(){return gx.fn.getControlValue("TAS02_DATE_W_END")},nac:function(){return false}};this.GXValidFnc[81]={fld:"TEXTBLOCKTAS02_DEL_FLG",format:0,grid:0};this.GXValidFnc[83]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tas02_del_flg,isvalid:null,fld:"TAS02_DEL_FLG",gxz:"Z115TAS02_DEL_FLG",gxold:"O115TAS02_DEL_FLG",gxvar:"A115TAS02_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.A115TAS02_DEL_FLG=a
},v2z:function(a){gx.O.Z115TAS02_DEL_FLG=a},v2c:function(){gx.fn.setRadioValue("TAS02_DEL_FLG",gx.O.A115TAS02_DEL_FLG)},c2v:function(){gx.O.A115TAS02_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAS02_DEL_FLG")},nac:function(){return false}};this.GXValidFnc[89]={fld:"TEXTBLOCKTAS02_CRT_DATETIME",format:0,grid:0};this.GXValidFnc[91]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_crt_datetime,isvalid:null,fld:"TAS02_CRT_DATETIME",gxz:"Z57TAS02_CRT_DATETIME",gxold:"O57TAS02_CRT_DATETIME",gxvar:"A57TAS02_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A57TAS02_CRT_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z57TAS02_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAS02_CRT_DATETIME",gx.O.A57TAS02_CRT_DATETIME,0)},c2v:function(){gx.O.A57TAS02_CRT_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAS02_CRT_DATETIME")},nac:function(){return false}};this.GXValidFnc[94]={fld:"TEXTBLOCKTAS02_CRT_USER_ID",format:0,grid:0};this.GXValidFnc[96]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_crt_user_id,isvalid:null,fld:"TAS02_CRT_USER_ID",gxz:"Z83TAS02_CRT_USER_ID",gxold:"O83TAS02_CRT_USER_ID",gxvar:"A83TAS02_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A83TAS02_CRT_USER_ID=a
},v2z:function(a){gx.O.Z83TAS02_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAS02_CRT_USER_ID",gx.O.A83TAS02_CRT_USER_ID,0)},c2v:function(){gx.O.A83TAS02_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAS02_CRT_USER_ID")},nac:function(){return false}};this.GXValidFnc[99]={fld:"TEXTBLOCKTAS02_CRT_PROG_NM",format:0,grid:0};this.GXValidFnc[101]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_crt_prog_nm,isvalid:null,fld:"TAS02_CRT_PROG_NM",gxz:"Z59TAS02_CRT_PROG_NM",gxold:"O59TAS02_CRT_PROG_NM",gxvar:"A59TAS02_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A59TAS02_CRT_PROG_NM=a
},v2z:function(a){gx.O.Z59TAS02_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAS02_CRT_PROG_NM",gx.O.A59TAS02_CRT_PROG_NM,0)},c2v:function(){gx.O.A59TAS02_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAS02_CRT_PROG_NM")},nac:function(){return false}};this.GXValidFnc[104]={fld:"TEXTBLOCKTAS02_UPD_DATETIME",format:0,grid:0};this.GXValidFnc[106]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_upd_datetime,isvalid:null,fld:"TAS02_UPD_DATETIME",gxz:"Z60TAS02_UPD_DATETIME",gxold:"O60TAS02_UPD_DATETIME",gxvar:"A60TAS02_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A60TAS02_UPD_DATETIME=gx.fn.toDatetimeValue(a)
},v2z:function(a){gx.O.Z60TAS02_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAS02_UPD_DATETIME",gx.O.A60TAS02_UPD_DATETIME,0)},c2v:function(){gx.O.A60TAS02_UPD_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAS02_UPD_DATETIME")},nac:function(){return false}};this.GXValidFnc[109]={fld:"TEXTBLOCKTAS02_UPD_USER_ID",format:0,grid:0};this.GXValidFnc[111]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_upd_user_id,isvalid:null,fld:"TAS02_UPD_USER_ID",gxz:"Z84TAS02_UPD_USER_ID",gxold:"O84TAS02_UPD_USER_ID",gxvar:"A84TAS02_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A84TAS02_UPD_USER_ID=a
},v2z:function(a){gx.O.Z84TAS02_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAS02_UPD_USER_ID",gx.O.A84TAS02_UPD_USER_ID,0)},c2v:function(){gx.O.A84TAS02_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAS02_UPD_USER_ID")},nac:function(){return false}};this.GXValidFnc[114]={fld:"TEXTBLOCKTAS02_UPD_PROG_NM",format:0,grid:0};this.GXValidFnc[116]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tas02_upd_prog_nm,isvalid:null,fld:"TAS02_UPD_PROG_NM",gxz:"Z62TAS02_UPD_PROG_NM",gxold:"O62TAS02_UPD_PROG_NM",gxvar:"A62TAS02_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A62TAS02_UPD_PROG_NM=a
},v2z:function(a){gx.O.Z62TAS02_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAS02_UPD_PROG_NM",gx.O.A62TAS02_UPD_PROG_NM,0)},c2v:function(){gx.O.A62TAS02_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAS02_UPD_PROG_NM")},nac:function(){return false}};this.GXValidFnc[122]={fld:"TABLE4",grid:0};this.GXValidFnc[125]={fld:"TEXTBLOCK44",format:0,grid:0};this.GXValidFnc[128]={fld:"TEXTBLOCK45",format:0,grid:0};this.GXValidFnc[131]={fld:"BTN_CANCEL",format:0,grid:0};this.A22TAS02_GNGO_KBN="";
this.Z22TAS02_GNGO_KBN="";this.O22TAS02_GNGO_KBN="";this.A23TAS02_GNGO_NM="";this.Z23TAS02_GNGO_NM="";this.O23TAS02_GNGO_NM="";this.A56TAS02_GNGO_RYAK_NM="";this.Z56TAS02_GNGO_RYAK_NM="";this.O56TAS02_GNGO_RYAK_NM="";this.A26TAS02_HNKAN_NEN=0;this.Z26TAS02_HNKAN_NEN=0;this.O26TAS02_HNKAN_NEN=0;this.A24TAS02_DATE_START="";this.Z24TAS02_DATE_START="";this.O24TAS02_DATE_START="";this.A25TAS02_DATE_END="";this.Z25TAS02_DATE_END="";this.O25TAS02_DATE_END="";this.A63TAS02_DATE_W_START="";this.Z63TAS02_DATE_W_START="";
this.O63TAS02_DATE_W_START="";this.A64TAS02_DATE_W_END="";this.Z64TAS02_DATE_W_END="";this.O64TAS02_DATE_W_END="";this.A115TAS02_DEL_FLG="";this.Z115TAS02_DEL_FLG="";this.O115TAS02_DEL_FLG="";this.A57TAS02_CRT_DATETIME=gx.date.nullDate();this.Z57TAS02_CRT_DATETIME=gx.date.nullDate();this.O57TAS02_CRT_DATETIME=gx.date.nullDate();this.A83TAS02_CRT_USER_ID="";this.Z83TAS02_CRT_USER_ID="";this.O83TAS02_CRT_USER_ID="";this.A59TAS02_CRT_PROG_NM="";this.Z59TAS02_CRT_PROG_NM="";this.O59TAS02_CRT_PROG_NM="";
this.A60TAS02_UPD_DATETIME=gx.date.nullDate();this.Z60TAS02_UPD_DATETIME=gx.date.nullDate();this.O60TAS02_UPD_DATETIME=gx.date.nullDate();this.A84TAS02_UPD_USER_ID="";this.Z84TAS02_UPD_USER_ID="";this.O84TAS02_UPD_USER_ID="";this.A62TAS02_UPD_PROG_NM="";this.Z62TAS02_UPD_PROG_NM="";this.O62TAS02_UPD_PROG_NM="";this.AV7C_TAM02_APP_ID="";this.AV14Pgmname="";this.AV12W_MSG="";this.A116TAS02_UPD_CNT=0;this.Gx_BScreen=0;this.ServerEvents=["e12062_client","e13066_client","e14066_client"];this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","TEXTBLOCK44"];
this.CheckCtrl=["BTN_CANCEL"];this.VarControlMap.A116TAS02_UPD_CNT={id:"TAS02_UPD_CNT",grid:0,type:"int"};this.VarControlMap.Gx_BScreen={id:"vGXBSCREEN",grid:0,type:"int"};this.VarControlMap.AV14Pgmname={id:"vPGMNAME",grid:0,type:"char"};this.VarControlMap.Gx_mode={id:"vMODE",grid:0,type:"char"};this.SetStandaloneVars();this.LvlOlds[6]=["O116TAS02_UPD_CNT"]}tas02_geng.prototype=new gx.GxObject;gx.setParentObj(new tas02_geng());