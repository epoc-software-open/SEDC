gx.evt.autoSkip=!1;
gx.define("tat01_info",!1,function(){this.ServerClass="tat01_info";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.A311TAT01_UPD_CNT=gx.fn.getIntegerValue("TAT01_UPD_CNT",",");this.Gx_BScreen=gx.fn.getIntegerValue("vGXBSCREEN",",");this.AV16Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tat01_info_no=function(){gx.ajax.validSrvEvt("dyncall","valid_Tat01_info_no",
["gx.O.A11TAT01_INFO_NO",'gx.date.urlDateTime(gx.O.A305TAT01_CRT_DATETIME,"Y4MD")',"gx.O.A306TAT01_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A308TAT01_UPD_DATETIME,"Y4MD")',"gx.O.A309TAT01_UPD_USER_ID","gx.O.A311TAT01_UPD_CNT","gx.O.A880TAT01_INFO_KBN",'gx.date.urlDate(gx.O.A207TAT01_DATE_START,"Y4MD")','gx.date.urlDate(gx.O.A208TAT01_DATE_END,"Y4MD")',"gx.O.A209TAT01_INFO","gx.O.A304TAT01_DEL_FLG","gx.O.A307TAT01_CRT_PROG_NM","gx.O.A310TAT01_UPD_PROG_NM"],["A305TAT01_CRT_DATETIME","A306TAT01_CRT_USER_ID",
"A308TAT01_UPD_DATETIME","A309TAT01_UPD_USER_ID","A311TAT01_UPD_CNT","A880TAT01_INFO_KBN","A207TAT01_DATE_START","A208TAT01_DATE_END","A209TAT01_INFO","A304TAT01_DEL_FLG","A307TAT01_CRT_PROG_NM","A310TAT01_UPD_PROG_NM","AV16Pgmname","Gx_mode","Z11TAT01_INFO_NO","Z305TAT01_CRT_DATETIME","Z306TAT01_CRT_USER_ID","Z308TAT01_UPD_DATETIME","Z309TAT01_UPD_USER_ID","Z311TAT01_UPD_CNT","Z880TAT01_INFO_KBN","Z207TAT01_DATE_START","Z208TAT01_DATE_END","Z209TAT01_INFO","Z304TAT01_DEL_FLG","Z307TAT01_CRT_PROG_NM",
"Z310TAT01_UPD_PROG_NM","ZV16Pgmname","O311TAT01_UPD_CNT",["A11TAT01_INFO_NO","Visible"],["A305TAT01_CRT_DATETIME","Visible"],["A307TAT01_CRT_PROG_NM","Visible"],["A308TAT01_UPD_DATETIME","Visible"],["A310TAT01_UPD_PROG_NM","Visible"],["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"],["BTN_CANCEL","Enabled"]]);return true};this.Valid_Tat01_info_kbn=function(){try{var a=gx.util.balloon.getNew("TAT01_INFO_KBN");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_date_start=
function(){try{var a=gx.util.balloon.getNew("TAT01_DATE_START");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A207TAT01_DATE_START)==0||(new gx.date.gxdate(this.A207TAT01_DATE_START)).compare(gx.date.ymdtod(1E3,1,1))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u516c\u958b\u958b\u59cb\u65e5 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tat01_date_end=function(){try{var a=gx.util.balloon.getNew("TAT01_DATE_END");
this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A208TAT01_DATE_END)==0||(new gx.date.gxdate(this.A208TAT01_DATE_END)).compare(gx.date.ymdtod(1E3,1,1))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u516c\u958b\u7d42\u4e86\u65e5 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tat01_info=function(){try{var a=gx.util.balloon.getNew("TAT01_INFO");this.AnyError=0}catch(b){}try{return a==
null?true:a.show()}catch(c){}return true};this.Valid_Tat01_del_flg=function(){try{var a=gx.util.balloon.getNew("TAT01_DEL_FLG");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAT01_CRT_DATETIME");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_crt_user_id=function(){try{var a=gx.util.balloon.getNew("TAT01_CRT_USER_ID");this.AnyError=0}catch(b){}try{return a==
null?true:a.show()}catch(c){}return true};this.Valid_Tat01_crt_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAT01_CRT_PROG_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAT01_UPD_DATETIME");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_upd_user_id=function(){try{var a=gx.util.balloon.getNew("TAT01_UPD_USER_ID");this.AnyError=
0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tat01_upd_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAT01_UPD_PROG_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e12072_client=function(){this.executeServerEvent("'BTN_SELECT'",true)};this.e13072_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e14077_client=function(){this.executeServerEvent("ENTER",true)};this.e15077_client=function(){this.executeServerEvent("CANCEL",
true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,43,45,48,51,54,55,57,60,61,63,66,67,69,72,74,80,82,85,87,90,92,95,97,100,102,105,107,113,116,119,122];this.GXLastCtrlId=122;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};
b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]=
{fld:"TEXTBLOCKTAT01_INFO_NO",format:0,grid:0};b[39]={lvl:0,type:"int",len:6,dec:0,sign:false,pic:"ZZZZZ9",ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_info_no,isvalid:null,rgrid:[],fld:"TAT01_INFO_NO",gxz:"Z11TAT01_INFO_NO",gxold:"O11TAT01_INFO_NO",gxvar:"A11TAT01_INFO_NO",ucs:[],op:[107,92,74,69,63,57,48,102,97,87,82],ip:[107,92,74,69,63,57,48,102,97,87,82,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A11TAT01_INFO_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z11TAT01_INFO_NO=gx.num.intval(a)},
v2c:function(){gx.fn.setControlValue("TAT01_INFO_NO",gx.O.A11TAT01_INFO_NO,0)},c2v:function(){gx.O.A11TAT01_INFO_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TAT01_INFO_NO",",")},nac:gx.falseFn};b[42]={fld:"IMAGE20",grid:0};b[43]={fld:"TEXTBLOCKTAT01_INFO_KBN",format:0,grid:0};b[45]={fld:"TABLE3",grid:0};b[48]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tat01_info_kbn,isvalid:null,rgrid:[],fld:"TAT01_INFO_KBN",gxz:"Z880TAT01_INFO_KBN",
gxold:"O880TAT01_INFO_KBN",gxvar:"A880TAT01_INFO_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A880TAT01_INFO_KBN=a},v2z:function(a){gx.O.Z880TAT01_INFO_KBN=a},v2c:function(){gx.fn.setControlValue("TAT01_INFO_KBN",gx.O.A880TAT01_INFO_KBN,0)},c2v:function(){gx.O.A880TAT01_INFO_KBN=this.val()},val:function(){return gx.fn.getControlValue("TAT01_INFO_KBN")},nac:gx.falseFn};b[51]={fld:"TEXTBLOCKTAT01_INFO_KBN2",format:0,grid:0};b[54]={fld:"IMAGE23",grid:0};b[55]={fld:"TEXTBLOCKTAT01_DATE_START",
format:0,grid:0};b[57]={lvl:0,type:"date",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tat01_date_start,isvalid:null,rgrid:[],fld:"TAT01_DATE_START",gxz:"Z207TAT01_DATE_START",gxold:"O207TAT01_DATE_START",gxvar:"A207TAT01_DATE_START",dp:{f:0,st:false,wn:false,mf:false,pic:"99/99/9999",dec:0},ucs:[],op:[57],ip:[57],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A207TAT01_DATE_START=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z207TAT01_DATE_START=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAT01_DATE_START",
gx.O.A207TAT01_DATE_START,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A207TAT01_DATE_START=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getControlValue("TAT01_DATE_START")},nac:gx.falseFn};this.declareDomainHdlr(57,function(){});b[60]={fld:"IMAGE21",grid:0};b[61]={fld:"TEXTBLOCKTAT01_DATE_END",format:0,grid:0};b[63]={lvl:0,type:"date",len:10,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tat01_date_end,isvalid:null,rgrid:[],fld:"TAT01_DATE_END",
gxz:"Z208TAT01_DATE_END",gxold:"O208TAT01_DATE_END",gxvar:"A208TAT01_DATE_END",dp:{f:0,st:false,wn:false,mf:false,pic:"99/99/9999",dec:0},ucs:[],op:[63],ip:[63],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A208TAT01_DATE_END=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z208TAT01_DATE_END=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAT01_DATE_END",gx.O.A208TAT01_DATE_END,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A208TAT01_DATE_END=gx.fn.toDatetimeValue(this.val())},
val:function(){return gx.fn.getControlValue("TAT01_DATE_END")},nac:gx.falseFn};this.declareDomainHdlr(63,function(){});b[66]={fld:"IMAGE22",grid:0};b[67]={fld:"TEXTBLOCKTAT01_INFO",format:0,grid:0};b[69]={lvl:0,type:"svchar",len:2E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:this.Valid_Tat01_info,isvalid:null,rgrid:[],fld:"TAT01_INFO",gxz:"Z209TAT01_INFO",gxold:"O209TAT01_INFO",gxvar:"A209TAT01_INFO",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A209TAT01_INFO=
a},v2z:function(a){gx.O.Z209TAT01_INFO=a},v2c:function(){gx.fn.setControlValue("TAT01_INFO",gx.O.A209TAT01_INFO,0)},c2v:function(){gx.O.A209TAT01_INFO=this.val()},val:function(){return gx.fn.getControlValue("TAT01_INFO")},nac:gx.falseFn};b[72]={fld:"TEXTBLOCKTAT01_DEL_FLG",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tat01_del_flg,isvalid:null,rgrid:[],fld:"TAT01_DEL_FLG",gxz:"Z304TAT01_DEL_FLG",gxold:"O304TAT01_DEL_FLG",gxvar:"A304TAT01_DEL_FLG",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.A304TAT01_DEL_FLG=a},v2z:function(a){gx.O.Z304TAT01_DEL_FLG=a},v2c:function(){gx.fn.setRadioValue("TAT01_DEL_FLG",gx.O.A304TAT01_DEL_FLG);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A304TAT01_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAT01_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[80]={fld:"TEXTBLOCKTAT01_CRT_DATETIME",format:0,grid:0};b[82]={lvl:0,
type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_crt_datetime,isvalid:null,rgrid:[],fld:"TAT01_CRT_DATETIME",gxz:"Z305TAT01_CRT_DATETIME",gxold:"O305TAT01_CRT_DATETIME",gxvar:"A305TAT01_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A305TAT01_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z305TAT01_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAT01_CRT_DATETIME",
gx.O.A305TAT01_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A305TAT01_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAT01_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(82,function(){});b[85]={fld:"TEXTBLOCKTAT01_CRT_USER_ID",format:0,grid:0};b[87]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_crt_user_id,isvalid:null,rgrid:[],fld:"TAT01_CRT_USER_ID",
gxz:"Z306TAT01_CRT_USER_ID",gxold:"O306TAT01_CRT_USER_ID",gxvar:"A306TAT01_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A306TAT01_CRT_USER_ID=a},v2z:function(a){gx.O.Z306TAT01_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAT01_CRT_USER_ID",gx.O.A306TAT01_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A306TAT01_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAT01_CRT_USER_ID")},nac:gx.falseFn};
this.declareDomainHdlr(87,function(){});b[90]={fld:"TEXTBLOCKTAT01_CRT_PROG_NM",format:0,grid:0};b[92]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_crt_prog_nm,isvalid:null,rgrid:[],fld:"TAT01_CRT_PROG_NM",gxz:"Z307TAT01_CRT_PROG_NM",gxold:"O307TAT01_CRT_PROG_NM",gxvar:"A307TAT01_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A307TAT01_CRT_PROG_NM=a},v2z:function(a){gx.O.Z307TAT01_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAT01_CRT_PROG_NM",
gx.O.A307TAT01_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A307TAT01_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAT01_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(92,function(){});b[95]={fld:"TEXTBLOCKTAT01_UPD_DATETIME",format:0,grid:0};b[97]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_upd_datetime,isvalid:null,rgrid:[],fld:"TAT01_UPD_DATETIME",gxz:"Z308TAT01_UPD_DATETIME",
gxold:"O308TAT01_UPD_DATETIME",gxvar:"A308TAT01_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A308TAT01_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z308TAT01_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAT01_UPD_DATETIME",gx.O.A308TAT01_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A308TAT01_UPD_DATETIME=
gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAT01_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(97,function(){});b[100]={fld:"TEXTBLOCKTAT01_UPD_USER_ID",format:0,grid:0};b[102]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_upd_user_id,isvalid:null,rgrid:[],fld:"TAT01_UPD_USER_ID",gxz:"Z309TAT01_UPD_USER_ID",gxold:"O309TAT01_UPD_USER_ID",gxvar:"A309TAT01_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",
v2v:function(a){gx.O.A309TAT01_UPD_USER_ID=a},v2z:function(a){gx.O.Z309TAT01_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAT01_UPD_USER_ID",gx.O.A309TAT01_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A309TAT01_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAT01_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(102,function(){});b[105]={fld:"TEXTBLOCKTAT01_UPD_PROG_NM",format:0,grid:0};b[107]={lvl:0,type:"svchar",len:40,
dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tat01_upd_prog_nm,isvalid:null,rgrid:[],fld:"TAT01_UPD_PROG_NM",gxz:"Z310TAT01_UPD_PROG_NM",gxold:"O310TAT01_UPD_PROG_NM",gxvar:"A310TAT01_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A310TAT01_UPD_PROG_NM=a},v2z:function(a){gx.O.Z310TAT01_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAT01_UPD_PROG_NM",gx.O.A310TAT01_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A310TAT01_UPD_PROG_NM=
this.val()},val:function(){return gx.fn.getControlValue("TAT01_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(107,function(){});b[113]={fld:"TABLE4",grid:0};b[116]={fld:"TEXTBLOCK44",format:0,grid:0};b[119]={fld:"TEXTBLOCK45",format:0,grid:0};b[122]={fld:"BTN_CANCEL",format:0,grid:0};this.O11TAT01_INFO_NO=this.Z11TAT01_INFO_NO=this.A11TAT01_INFO_NO=0;this.O880TAT01_INFO_KBN=this.Z880TAT01_INFO_KBN=this.A880TAT01_INFO_KBN="";this.A207TAT01_DATE_START=gx.date.nullDate();this.Z207TAT01_DATE_START=
gx.date.nullDate();this.O207TAT01_DATE_START=gx.date.nullDate();this.A208TAT01_DATE_END=gx.date.nullDate();this.Z208TAT01_DATE_END=gx.date.nullDate();this.O208TAT01_DATE_END=gx.date.nullDate();this.O304TAT01_DEL_FLG=this.Z304TAT01_DEL_FLG=this.A304TAT01_DEL_FLG=this.O209TAT01_INFO=this.Z209TAT01_INFO=this.A209TAT01_INFO="";this.A305TAT01_CRT_DATETIME=gx.date.nullDate();this.Z305TAT01_CRT_DATETIME=gx.date.nullDate();this.O305TAT01_CRT_DATETIME=gx.date.nullDate();this.O307TAT01_CRT_PROG_NM=this.Z307TAT01_CRT_PROG_NM=
this.A307TAT01_CRT_PROG_NM=this.O306TAT01_CRT_USER_ID=this.Z306TAT01_CRT_USER_ID=this.A306TAT01_CRT_USER_ID="";this.A308TAT01_UPD_DATETIME=gx.date.nullDate();this.Z308TAT01_UPD_DATETIME=gx.date.nullDate();this.O308TAT01_UPD_DATETIME=gx.date.nullDate();this.AV14W_MSG=this.AV16Pgmname=this.AV7C_TAM02_APP_ID=this.O310TAT01_UPD_PROG_NM=this.Z310TAT01_UPD_PROG_NM=this.A310TAT01_UPD_PROG_NM=this.O309TAT01_UPD_USER_ID=this.Z309TAT01_UPD_USER_ID=this.A309TAT01_UPD_USER_ID="";this.A11TAT01_INFO_NO=0;this.A305TAT01_CRT_DATETIME=
gx.date.nullDate();this.A306TAT01_CRT_USER_ID="";this.A308TAT01_UPD_DATETIME=gx.date.nullDate();this.A309TAT01_UPD_USER_ID="";this.Gx_BScreen=this.A311TAT01_UPD_CNT=0;this.A880TAT01_INFO_KBN="";this.A207TAT01_DATE_START=gx.date.nullDate();this.A208TAT01_DATE_END=gx.date.nullDate();this.A310TAT01_UPD_PROG_NM=this.A307TAT01_CRT_PROG_NM=this.A304TAT01_DEL_FLG=this.A209TAT01_INFO="";this.Events={e12072_client:["'BTN_SELECT'",true],e13072_client:["'BTN_CLER'",true],e14077_client:["ENTER",true],e15077_client:["CANCEL",
true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","TEXTBLOCK44"];this.CheckCtrl=["BTN_CANCEL"];this.setVCMap("A311TAT01_UPD_CNT","TAT01_UPD_CNT",0,"int");this.setVCMap("Gx_BScreen","vGXBSCREEN",0,"int");this.setVCMap("AV16Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[7]=["O311TAT01_UPD_CNT"]});gx.setParentObj(new tat01_info);
