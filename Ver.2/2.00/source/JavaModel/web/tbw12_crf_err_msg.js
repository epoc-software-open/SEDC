gx.evt.autoSkip=!1;
gx.define("tbw12_crf_err_msg",!1,function(){this.ServerClass="tbw12_crf_err_msg";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV8Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbw12_session_id=function(){try{var a=gx.util.balloon.getNew("TBW12_SESSION_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Tbw12_datetime=function(){try{var a=gx.util.balloon.getNew("TBW12_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A180TBW12_DATETIME)==0||(new gx.date.gxdate(this.A180TBW12_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u5b9f\u884c\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbw12_seq=function(){gx.ajax.validSrvEvt("dyncall",
"valid_Tbw12_seq",["gx.O.A179TBW12_SESSION_ID",'gx.date.urlDateTime(gx.O.A180TBW12_DATETIME,"Y4MD")',"gx.O.A181TBW12_SEQ","gx.O.A778TBW12_ERR_CD","gx.O.A776TBW12_ERR_DIV","gx.O.A777TBW12_ERR_MSG"],["A778TBW12_ERR_CD","A776TBW12_ERR_DIV","A777TBW12_ERR_MSG","AV8Pgmname","Gx_mode","Z179TBW12_SESSION_ID","Z180TBW12_DATETIME","Z181TBW12_SEQ","Z778TBW12_ERR_CD","Z776TBW12_ERR_DIV","Z777TBW12_ERR_MSG","ZV8Pgmname",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.e121d48_client=function(){this.executeServerEvent("ENTER",
true)};this.e131d48_client=function(){this.executeServerEvent("CANCEL",true)};var a=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64];this.GXLastCtrlId=64;a[2]={fld:"TABLEMAIN",grid:0};a[5]={fld:"TABLETOOLBAR",grid:0};a[8]={fld:"SECTIONTOOLBAR",grid:0};a[9]={fld:"BTN_FIRST",grid:0};a[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};a[11]={fld:"BTN_PREVIOUS",grid:0};a[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};a[13]={fld:"BTN_NEXT",
grid:0};a[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};a[15]={fld:"BTN_LAST",grid:0};a[16]={fld:"BTN_LAST_SEPARATOR",grid:0};a[17]={fld:"BTN_SELECT",grid:0};a[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};a[19]={fld:"BTN_ENTER2",grid:0};a[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};a[21]={fld:"BTN_CANCEL2",grid:0};a[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};a[23]={fld:"BTN_DELETE2",grid:0};a[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};a[27]={fld:"GROUPDATA",grid:0};a[28]={fld:"TABLE1",grid:0};a[34]={fld:"TABLE2",grid:0};
a[37]={fld:"TEXTBLOCKTBW12_SESSION_ID",format:0,grid:0};a[39]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw12_session_id,isvalid:null,rgrid:[],fld:"TBW12_SESSION_ID",gxz:"Z179TBW12_SESSION_ID",gxold:"O179TBW12_SESSION_ID",gxvar:"A179TBW12_SESSION_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A179TBW12_SESSION_ID=a},v2z:function(a){gx.O.Z179TBW12_SESSION_ID=a},v2c:function(){gx.fn.setControlValue("TBW12_SESSION_ID",gx.O.A179TBW12_SESSION_ID,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A179TBW12_SESSION_ID=this.val()},val:function(){return gx.fn.getControlValue("TBW12_SESSION_ID")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});a[42]={fld:"TEXTBLOCKTBW12_DATETIME",format:0,grid:0};a[44]={lvl:0,type:"dtime",len:8,dec:5,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw12_datetime,isvalid:null,rgrid:[],fld:"TBW12_DATETIME",gxz:"Z180TBW12_DATETIME",gxold:"O180TBW12_DATETIME",gxvar:"A180TBW12_DATETIME",
dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/99 99:99",dec:5},ucs:[],op:[44],ip:[44],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A180TBW12_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z180TBW12_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBW12_DATETIME",gx.O.A180TBW12_DATETIME,0)},c2v:function(){gx.O.A180TBW12_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBW12_DATETIME")},nac:gx.falseFn};a[47]={fld:"TEXTBLOCKTBW12_SEQ",
format:0,grid:0};a[49]={lvl:0,type:"int",len:4,dec:0,sign:false,pic:"ZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbw12_seq,isvalid:null,rgrid:[],fld:"TBW12_SEQ",gxz:"Z181TBW12_SEQ",gxold:"O181TBW12_SEQ",gxvar:"A181TBW12_SEQ",ucs:[],op:[64,59,54],ip:[64,59,54,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A181TBW12_SEQ=gx.num.intval(a)},v2z:function(a){gx.O.Z181TBW12_SEQ=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW12_SEQ",gx.O.A181TBW12_SEQ,0)},c2v:function(){gx.O.A181TBW12_SEQ=
gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW12_SEQ",",")},nac:gx.falseFn};a[52]={fld:"TEXTBLOCKTBW12_ERR_CD",format:0,grid:0};a[54]={lvl:0,type:"int",len:2,dec:0,sign:false,pic:"Z9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW12_ERR_CD",gxz:"Z778TBW12_ERR_CD",gxold:"O778TBW12_ERR_CD",gxvar:"A778TBW12_ERR_CD",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A778TBW12_ERR_CD=gx.num.intval(a)},v2z:function(a){gx.O.Z778TBW12_ERR_CD=gx.num.intval(a)},
v2c:function(){gx.fn.setControlValue("TBW12_ERR_CD",gx.O.A778TBW12_ERR_CD,0)},c2v:function(){gx.O.A778TBW12_ERR_CD=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW12_ERR_CD",",")},nac:gx.falseFn};a[57]={fld:"TEXTBLOCKTBW12_ERR_DIV",format:0,grid:0};a[59]={lvl:0,type:"int",len:1,dec:0,sign:false,pic:"9",ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBW12_ERR_DIV",gxz:"Z776TBW12_ERR_DIV",gxold:"O776TBW12_ERR_DIV",gxvar:"A776TBW12_ERR_DIV",ucs:[],op:[],ip:[],
nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A776TBW12_ERR_DIV=gx.num.intval(a)},v2z:function(a){gx.O.Z776TBW12_ERR_DIV=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBW12_ERR_DIV",gx.O.A776TBW12_ERR_DIV,0)},c2v:function(){gx.O.A776TBW12_ERR_DIV=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBW12_ERR_DIV",",")},nac:gx.falseFn};a[62]={fld:"TEXTBLOCKTBW12_ERR_MSG",format:0,grid:0};a[64]={lvl:0,type:"svchar",len:3E3,dec:0,sign:false,ro:0,multiline:true,grid:0,gxgrid:null,
fnc:null,isvalid:null,rgrid:[],fld:"TBW12_ERR_MSG",gxz:"Z777TBW12_ERR_MSG",gxold:"O777TBW12_ERR_MSG",gxvar:"A777TBW12_ERR_MSG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A777TBW12_ERR_MSG=a},v2z:function(a){gx.O.Z777TBW12_ERR_MSG=a},v2c:function(){gx.fn.setControlValue("TBW12_ERR_MSG",gx.O.A777TBW12_ERR_MSG,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A777TBW12_ERR_MSG=this.val()},val:function(){return gx.fn.getControlValue("TBW12_ERR_MSG")},
nac:gx.falseFn};this.declareDomainHdlr(64,function(){});this.O179TBW12_SESSION_ID=this.Z179TBW12_SESSION_ID=this.A179TBW12_SESSION_ID="";this.A180TBW12_DATETIME=gx.date.nullDate();this.Z180TBW12_DATETIME=gx.date.nullDate();this.O180TBW12_DATETIME=gx.date.nullDate();this.O776TBW12_ERR_DIV=this.Z776TBW12_ERR_DIV=this.A776TBW12_ERR_DIV=this.O778TBW12_ERR_CD=this.Z778TBW12_ERR_CD=this.A778TBW12_ERR_CD=this.O181TBW12_SEQ=this.Z181TBW12_SEQ=this.A181TBW12_SEQ=0;this.A179TBW12_SESSION_ID=this.AV8Pgmname=
this.AV7W_BC_FLG=this.O777TBW12_ERR_MSG=this.Z777TBW12_ERR_MSG=this.A777TBW12_ERR_MSG="";this.A180TBW12_DATETIME=gx.date.nullDate();this.A776TBW12_ERR_DIV=this.A778TBW12_ERR_CD=this.A181TBW12_SEQ=0;this.A777TBW12_ERR_MSG="";this.Events={e121d48_client:["ENTER",true],e131d48_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV8Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars()});gx.setParentObj(new tbw12_crf_err_msg);
