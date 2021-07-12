gx.evt.autoSkip=!1;
gx.define("taw01_api_sdt_work",!1,function(){this.ServerClass="taw01_api_sdt_work";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV8Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Taw01_session_id=function(){try{var a=gx.util.balloon.getNew("TAW01_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Taw01_app_id=function(){try{var a=gx.util.balloon.getNew("TAW01_APP_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Taw01_disp_datetime=function(){gx.ajax.validSrvEvt("dyncall","valid_Taw01_disp_datetime",["gx.O.A14TAW01_SESSION_ID","gx.O.A15TAW01_APP_ID","gx.O.A16TAW01_DISP_DATETIME",'gx.date.urlDate(gx.O.A257TAW01_CRT_DATE,"Y4MD")',"gx.O.A258TAW01_SDT_SAVE_1","gx.O.A259TAW01_SDT_SAVE_2"],["A257TAW01_CRT_DATE","A258TAW01_SDT_SAVE_1","A259TAW01_SDT_SAVE_2",
"AV8Pgmname","Gx_mode","Z14TAW01_SESSION_ID","Z15TAW01_APP_ID","Z16TAW01_DISP_DATETIME","Z257TAW01_CRT_DATE","Z258TAW01_SDT_SAVE_1","Z259TAW01_SDT_SAVE_2","ZV8Pgmname",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Taw01_crt_date=function(){try{var a=gx.util.balloon.getNew("TAW01_CRT_DATE");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A257TAW01_CRT_DATE)==0||(new gx.date.gxdate(this.A257TAW01_CRT_DATE)).compare(gx.date.ymdtod(1E3,1,1))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u4ed8 \u306f\u7bc4\u56f2\u5916\u3067\u3059");
this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.e120b11_client=function(){this.executeServerEvent("ENTER",true)};this.e130b11_client=function(){this.executeServerEvent("CANCEL",true)};var a=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64];this.GXLastCtrlId=64;a[2]={fld:"TABLEMAIN",grid:0};a[5]={fld:"TABLETOOLBAR",grid:0};a[8]={fld:"SECTIONTOOLBAR",grid:0};a[9]={fld:"BTN_FIRST",
grid:0};a[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};a[11]={fld:"BTN_PREVIOUS",grid:0};a[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};a[13]={fld:"BTN_NEXT",grid:0};a[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};a[15]={fld:"BTN_LAST",grid:0};a[16]={fld:"BTN_LAST_SEPARATOR",grid:0};a[17]={fld:"BTN_SELECT",grid:0};a[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};a[19]={fld:"BTN_ENTER2",grid:0};a[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};a[21]={fld:"BTN_CANCEL2",grid:0};a[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};a[23]={fld:"BTN_DELETE2",
grid:0};a[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};a[27]={fld:"GROUPDATA",grid:0};a[28]={fld:"TABLE1",grid:0};a[34]={fld:"TABLE2",grid:0};a[37]={fld:"TEXTBLOCKTAW01_SESSION_ID",format:0,grid:0};a[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Taw01_session_id,isvalid:null,rgrid:[],fld:"TAW01_SESSION_ID",gxz:"Z14TAW01_SESSION_ID",gxold:"O14TAW01_SESSION_ID",gxvar:"A14TAW01_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A14TAW01_SESSION_ID=
a},v2z:function(a){gx.O.Z14TAW01_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TAW01_SESSION_ID",gx.O.A14TAW01_SESSION_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A14TAW01_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TAW01_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});a[42]={fld:"TEXTBLOCKTAW01_APP_ID",format:0,grid:0};a[44]={lvl:0,type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Taw01_app_id,
isvalid:null,rgrid:[],fld:"TAW01_APP_ID",gxz:"Z15TAW01_APP_ID",gxold:"O15TAW01_APP_ID",gxvar:"A15TAW01_APP_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A15TAW01_APP_ID=a},v2z:function(a){gx.O.Z15TAW01_APP_ID=a},v2c:function(){gx.fn.setControlValue("TAW01_APP_ID",gx.O.A15TAW01_APP_ID,0)},c2v:function(){gx.O.A15TAW01_APP_ID=this.val()},val:function(){return gx.fn.getControlValue("TAW01_APP_ID")},nac:gx.falseFn};a[47]={fld:"TEXTBLOCKTAW01_DISP_DATETIME",format:0,grid:0};a[49]=
{lvl:0,type:"svchar",len:14,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Taw01_disp_datetime,isvalid:null,rgrid:[],fld:"TAW01_DISP_DATETIME",gxz:"Z16TAW01_DISP_DATETIME",gxold:"O16TAW01_DISP_DATETIME",gxvar:"A16TAW01_DISP_DATETIME",ucs:[],op:[64,59,54],ip:[64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A16TAW01_DISP_DATETIME=a},v2z:function(a){gx.O.Z16TAW01_DISP_DATETIME=a},v2c:function(){gx.fn.setControlValue("TAW01_DISP_DATETIME",gx.O.A16TAW01_DISP_DATETIME,0);typeof this.dom_hdl==
"function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A16TAW01_DISP_DATETIME=this.val()},val:function(){return gx.fn.getControlValue("TAW01_DISP_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(49,function(){});a[52]={fld:"TEXTBLOCKTAW01_CRT_DATE",format:0,grid:0};a[54]={lvl:0,type:"date",len:8,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Taw01_crt_date,isvalid:null,rgrid:[],fld:"TAW01_CRT_DATE",gxz:"Z257TAW01_CRT_DATE",gxold:"O257TAW01_CRT_DATE",gxvar:"A257TAW01_CRT_DATE",dp:{f:0,
st:false,wn:false,mf:false,pic:"99/99/99",dec:0},ucs:[],op:[54],ip:[54],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A257TAW01_CRT_DATE=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z257TAW01_CRT_DATE=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAW01_CRT_DATE",gx.O.A257TAW01_CRT_DATE,0)},c2v:function(){gx.O.A257TAW01_CRT_DATE=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getControlValue("TAW01_CRT_DATE")},nac:gx.falseFn};a[57]={fld:"TEXTBLOCKTAW01_SDT_SAVE_1",
format:0,grid:0};a[59]={lvl:0,type:"vchar",len:2097152,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAW01_SDT_SAVE_1",gxz:"Z258TAW01_SDT_SAVE_1",gxold:"O258TAW01_SDT_SAVE_1",gxvar:"A258TAW01_SDT_SAVE_1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A258TAW01_SDT_SAVE_1=a},v2z:function(a){gx.O.Z258TAW01_SDT_SAVE_1=a},v2c:function(){gx.fn.setControlValue("TAW01_SDT_SAVE_1",gx.O.A258TAW01_SDT_SAVE_1,0)},c2v:function(){gx.O.A258TAW01_SDT_SAVE_1=
this.val()},val:function(){return gx.fn.getControlValue("TAW01_SDT_SAVE_1")},nac:gx.falseFn};a[62]={fld:"TEXTBLOCKTAW01_SDT_SAVE_2",format:0,grid:0};a[64]={lvl:0,type:"vchar",len:2097152,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAW01_SDT_SAVE_2",gxz:"Z259TAW01_SDT_SAVE_2",gxold:"O259TAW01_SDT_SAVE_2",gxvar:"A259TAW01_SDT_SAVE_2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A259TAW01_SDT_SAVE_2=a},v2z:function(a){gx.O.Z259TAW01_SDT_SAVE_2=
a},v2c:function(){gx.fn.setControlValue("TAW01_SDT_SAVE_2",gx.O.A259TAW01_SDT_SAVE_2,0)},c2v:function(){gx.O.A259TAW01_SDT_SAVE_2=this.val()},val:function(){return gx.fn.getControlValue("TAW01_SDT_SAVE_2")},nac:gx.falseFn};this.O16TAW01_DISP_DATETIME=this.Z16TAW01_DISP_DATETIME=this.A16TAW01_DISP_DATETIME=this.O15TAW01_APP_ID=this.Z15TAW01_APP_ID=this.A15TAW01_APP_ID=this.O14TAW01_SESSION_ID=this.Z14TAW01_SESSION_ID=this.A14TAW01_SESSION_ID="";this.A257TAW01_CRT_DATE=gx.date.nullDate();this.Z257TAW01_CRT_DATE=
gx.date.nullDate();this.O257TAW01_CRT_DATE=gx.date.nullDate();this.A16TAW01_DISP_DATETIME=this.A15TAW01_APP_ID=this.A14TAW01_SESSION_ID=this.AV8Pgmname=this.AV7W_BC_FLG=this.O259TAW01_SDT_SAVE_2=this.Z259TAW01_SDT_SAVE_2=this.A259TAW01_SDT_SAVE_2=this.O258TAW01_SDT_SAVE_1=this.Z258TAW01_SDT_SAVE_1=this.A258TAW01_SDT_SAVE_1="";this.A257TAW01_CRT_DATE=gx.date.nullDate();this.A259TAW01_SDT_SAVE_2=this.A258TAW01_SDT_SAVE_1="";this.Events={e120b11_client:["ENTER",true],e130b11_client:["CANCEL",true]};
this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV8Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new taw01_api_sdt_work);