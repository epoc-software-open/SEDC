gx.evt.autoSkip=!1;
gx.define("tbm26_sel_list_item",!1,function(){this.ServerClass="tbm26_sel_list_item";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.AV9Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tbm26_study_id=function(){try{var a=gx.util.balloon.getNew("TBM26_STUDY_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};
this.Valid_Tbm26_list_cd=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm26_list_cd",["gx.O.A25TBM26_STUDY_ID","gx.O.A26TBM26_LIST_CD"],[]);return true};this.Valid_Tbm26_list_item_no=function(){gx.ajax.validSrvEvt("dyncall","valid_Tbm26_list_item_no",["gx.O.A25TBM26_STUDY_ID","gx.O.A26TBM26_LIST_CD","gx.O.A27TBM26_LIST_ITEM_NO",'gx.date.urlDateTime(gx.O.A564TBM26_CRT_DATETIME,"Y4MD")',"gx.O.A565TBM26_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A567TBM26_UPD_DATETIME,"Y4MD")',"gx.O.A568TBM26_UPD_USER_ID",
"gx.O.A570TBM26_UPD_CNT","gx.O.A561TBM26_LIST_ITEM_NAME","gx.O.A562TBM26_INNER_VALUE","gx.O.A563TBM26_DEL_FLG","gx.O.A566TBM26_CRT_PROG_NM","gx.O.A569TBM26_UPD_PROG_NM"],["A564TBM26_CRT_DATETIME","A565TBM26_CRT_USER_ID","A567TBM26_UPD_DATETIME","A568TBM26_UPD_USER_ID","A570TBM26_UPD_CNT","A561TBM26_LIST_ITEM_NAME","A562TBM26_INNER_VALUE","A563TBM26_DEL_FLG","A566TBM26_CRT_PROG_NM","A569TBM26_UPD_PROG_NM","AV9Pgmname","Gx_mode","Z25TBM26_STUDY_ID","Z26TBM26_LIST_CD","Z27TBM26_LIST_ITEM_NO","Z564TBM26_CRT_DATETIME",
"Z565TBM26_CRT_USER_ID","Z567TBM26_UPD_DATETIME","Z568TBM26_UPD_USER_ID","Z570TBM26_UPD_CNT","Z561TBM26_LIST_ITEM_NAME","Z562TBM26_INNER_VALUE","Z563TBM26_DEL_FLG","Z566TBM26_CRT_PROG_NM","Z569TBM26_UPD_PROG_NM","ZV9Pgmname","O570TBM26_UPD_CNT",["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"]]);return true};this.Valid_Tbm26_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TBM26_CRT_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A564TBM26_CRT_DATETIME)==0||(new gx.date.gxdate(this.A564TBM26_CRT_DATETIME)).compare(gx.date.ymdhmstot(1E3,
1,1,0,0,0))>=0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u4f5c\u6210\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbm26_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TBM26_UPD_DATETIME");this.AnyError=0;if(!((new gx.date.gxdate("")).compare(this.A567TBM26_UPD_DATETIME)==0||(new gx.date.gxdate(this.A567TBM26_UPD_DATETIME)).compare(gx.date.ymdhmstot(1E3,1,1,0,0,0))>=
0))try{a.setError("\u30d5\u30a3\u30fc\u30eb\u30c9\u3000\u66f4\u65b0\u65e5\u6642 \u306f\u7bc4\u56f2\u5916\u3067\u3059");this.AnyError=1}catch(b){}}catch(c){}try{return a==null?true:a.show()}catch(d){}return true};this.Valid_Tbm26_upd_cnt=function(){try{var a=gx.util.balloon.getNew("TBM26_UPD_CNT");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e120y2_client=function(){this.executeServerEvent("AFTER TRN",true)};this.e130y33_client=function(){this.executeServerEvent("ENTER",
true)};this.e140y33_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,39,42,44,47,49,52,54,57,59,62,64,67,69,72,74,77,79,82,84,87,89,92,94,97,99];this.GXLastCtrlId=99;b[2]={fld:"TABLEMAIN",grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"SECTIONTOOLBAR",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",
grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]={fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};
b[34]={fld:"TABLE2",grid:0};b[37]={fld:"TEXTBLOCKTBM26_STUDY_ID",format:0,grid:0};b[39]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_study_id,isvalid:null,rgrid:[],fld:"TBM26_STUDY_ID",gxz:"Z25TBM26_STUDY_ID",gxold:"O25TBM26_STUDY_ID",gxvar:"A25TBM26_STUDY_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A25TBM26_STUDY_ID=gx.num.intval(a)},v2z:function(a){gx.O.Z25TBM26_STUDY_ID=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM26_STUDY_ID",
gx.O.A25TBM26_STUDY_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A25TBM26_STUDY_ID=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM26_STUDY_ID",",")},nac:gx.falseFn};this.declareDomainHdlr(39,function(){});b[42]={fld:"TEXTBLOCKTBM26_LIST_CD",format:0,grid:0};b[44]={lvl:0,type:"svchar",len:20,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_list_cd,isvalid:null,rgrid:[],fld:"TBM26_LIST_CD",gxz:"Z26TBM26_LIST_CD",gxold:"O26TBM26_LIST_CD",
gxvar:"A26TBM26_LIST_CD",ucs:[],op:[],ip:[44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A26TBM26_LIST_CD=a},v2z:function(a){gx.O.Z26TBM26_LIST_CD=a},v2c:function(){gx.fn.setControlValue("TBM26_LIST_CD",gx.O.A26TBM26_LIST_CD,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A26TBM26_LIST_CD=this.val()},val:function(){return gx.fn.getControlValue("TBM26_LIST_CD")},nac:gx.falseFn};this.declareDomainHdlr(44,function(){});b[47]={fld:"TEXTBLOCKTBM26_LIST_ITEM_NO",
format:0,grid:0};b[49]={lvl:0,type:"int",len:3,dec:0,sign:false,pic:"ZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_list_item_no,isvalid:null,rgrid:[],fld:"TBM26_LIST_ITEM_NO",gxz:"Z27TBM26_LIST_ITEM_NO",gxold:"O27TBM26_LIST_ITEM_NO",gxvar:"A27TBM26_LIST_ITEM_NO",ucs:[],op:[94,79,64,59,54,99,89,84,74,69],ip:[94,79,64,59,54,99,89,84,74,69,49,44,39],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A27TBM26_LIST_ITEM_NO=gx.num.intval(a)},v2z:function(a){gx.O.Z27TBM26_LIST_ITEM_NO=gx.num.intval(a)},
v2c:function(){gx.fn.setControlValue("TBM26_LIST_ITEM_NO",gx.O.A27TBM26_LIST_ITEM_NO,0)},c2v:function(){gx.O.A27TBM26_LIST_ITEM_NO=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM26_LIST_ITEM_NO",",")},nac:gx.falseFn};b[52]={fld:"TEXTBLOCKTBM26_LIST_ITEM_NAME",format:0,grid:0};b[54]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_LIST_ITEM_NAME",gxz:"Z561TBM26_LIST_ITEM_NAME",gxold:"O561TBM26_LIST_ITEM_NAME",
gxvar:"A561TBM26_LIST_ITEM_NAME",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A561TBM26_LIST_ITEM_NAME=a},v2z:function(a){gx.O.Z561TBM26_LIST_ITEM_NAME=a},v2c:function(){gx.fn.setControlValue("TBM26_LIST_ITEM_NAME",gx.O.A561TBM26_LIST_ITEM_NAME,0)},c2v:function(){gx.O.A561TBM26_LIST_ITEM_NAME=this.val()},val:function(){return gx.fn.getControlValue("TBM26_LIST_ITEM_NAME")},nac:gx.falseFn};b[57]={fld:"TEXTBLOCKTBM26_INNER_VALUE",format:0,grid:0};b[59]={lvl:0,type:"svchar",len:100,
dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_INNER_VALUE",gxz:"Z562TBM26_INNER_VALUE",gxold:"O562TBM26_INNER_VALUE",gxvar:"A562TBM26_INNER_VALUE",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A562TBM26_INNER_VALUE=a},v2z:function(a){gx.O.Z562TBM26_INNER_VALUE=a},v2c:function(){gx.fn.setControlValue("TBM26_INNER_VALUE",gx.O.A562TBM26_INNER_VALUE,0)},c2v:function(){gx.O.A562TBM26_INNER_VALUE=this.val()},val:function(){return gx.fn.getControlValue("TBM26_INNER_VALUE")},
nac:gx.falseFn};b[62]={fld:"TEXTBLOCKTBM26_DEL_FLG",format:0,grid:0};b[64]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_DEL_FLG",gxz:"Z563TBM26_DEL_FLG",gxold:"O563TBM26_DEL_FLG",gxvar:"A563TBM26_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A563TBM26_DEL_FLG=a},v2z:function(a){gx.O.Z563TBM26_DEL_FLG=a},v2c:function(){gx.fn.setControlValue("TBM26_DEL_FLG",gx.O.A563TBM26_DEL_FLG,0);typeof this.dom_hdl=="function"&&
this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A563TBM26_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TBM26_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(64,function(){});b[67]={fld:"TEXTBLOCKTBM26_CRT_DATETIME",format:0,grid:0};b[69]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_crt_datetime,isvalid:null,rgrid:[],fld:"TBM26_CRT_DATETIME",gxz:"Z564TBM26_CRT_DATETIME",gxold:"O564TBM26_CRT_DATETIME",gxvar:"A564TBM26_CRT_DATETIME",dp:{f:0,
st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[69],ip:[69],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A564TBM26_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z564TBM26_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TBM26_CRT_DATETIME",gx.O.A564TBM26_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A564TBM26_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM26_CRT_DATETIME")},
nac:gx.falseFn};this.declareDomainHdlr(69,function(){});b[72]={fld:"TEXTBLOCKTBM26_CRT_USER_ID",format:0,grid:0};b[74]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_CRT_USER_ID",gxz:"Z565TBM26_CRT_USER_ID",gxold:"O565TBM26_CRT_USER_ID",gxvar:"A565TBM26_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A565TBM26_CRT_USER_ID=a},v2z:function(a){gx.O.Z565TBM26_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM26_CRT_USER_ID",
gx.O.A565TBM26_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A565TBM26_CRT_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM26_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(74,function(){});b[77]={fld:"TEXTBLOCKTBM26_CRT_PROG_NM",format:0,grid:0};b[79]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_CRT_PROG_NM",gxz:"Z566TBM26_CRT_PROG_NM",gxold:"O566TBM26_CRT_PROG_NM",
gxvar:"A566TBM26_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A566TBM26_CRT_PROG_NM=a},v2z:function(a){gx.O.Z566TBM26_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM26_CRT_PROG_NM",gx.O.A566TBM26_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A566TBM26_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM26_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(79,function(){});b[82]={fld:"TEXTBLOCKTBM26_UPD_DATETIME",
format:0,grid:0};b[84]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_upd_datetime,isvalid:null,rgrid:[],fld:"TBM26_UPD_DATETIME",gxz:"Z567TBM26_UPD_DATETIME",gxold:"O567TBM26_UPD_DATETIME",gxvar:"A567TBM26_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[84],ip:[84],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A567TBM26_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z567TBM26_UPD_DATETIME=gx.fn.toDatetimeValue(a)},
v2c:function(){gx.fn.setControlValue("TBM26_UPD_DATETIME",gx.O.A567TBM26_UPD_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A567TBM26_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TBM26_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(84,function(){});b[87]={fld:"TEXTBLOCKTBM26_UPD_USER_ID",format:0,grid:0};b[89]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,
rgrid:[],fld:"TBM26_UPD_USER_ID",gxz:"Z568TBM26_UPD_USER_ID",gxold:"O568TBM26_UPD_USER_ID",gxvar:"A568TBM26_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A568TBM26_UPD_USER_ID=a},v2z:function(a){gx.O.Z568TBM26_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TBM26_UPD_USER_ID",gx.O.A568TBM26_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A568TBM26_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TBM26_UPD_USER_ID")},
nac:gx.falseFn};this.declareDomainHdlr(89,function(){});b[92]={fld:"TEXTBLOCKTBM26_UPD_PROG_NM",format:0,grid:0};b[94]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TBM26_UPD_PROG_NM",gxz:"Z569TBM26_UPD_PROG_NM",gxold:"O569TBM26_UPD_PROG_NM",gxvar:"A569TBM26_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A569TBM26_UPD_PROG_NM=a},v2z:function(a){gx.O.Z569TBM26_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TBM26_UPD_PROG_NM",
gx.O.A569TBM26_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A569TBM26_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TBM26_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(94,function(){});b[97]={fld:"TEXTBLOCKTBM26_UPD_CNT",format:0,grid:0};b[99]={lvl:0,type:"int",len:10,dec:0,sign:false,pic:"ZZZZZZZZZ9",ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tbm26_upd_cnt,isvalid:null,rgrid:[],fld:"TBM26_UPD_CNT",gxz:"Z570TBM26_UPD_CNT",
gxold:"O570TBM26_UPD_CNT",gxvar:"A570TBM26_UPD_CNT",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A570TBM26_UPD_CNT=gx.num.intval(a)},v2z:function(a){gx.O.Z570TBM26_UPD_CNT=gx.num.intval(a)},v2c:function(){gx.fn.setControlValue("TBM26_UPD_CNT",gx.O.A570TBM26_UPD_CNT,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A570TBM26_UPD_CNT=gx.num.intval(this.val())},val:function(){return gx.fn.getIntegerValue("TBM26_UPD_CNT",",")},nac:gx.falseFn};this.declareDomainHdlr(99,
function(){});this.O25TBM26_STUDY_ID=this.Z25TBM26_STUDY_ID=this.A25TBM26_STUDY_ID=0;this.O26TBM26_LIST_CD=this.Z26TBM26_LIST_CD=this.A26TBM26_LIST_CD="";this.O27TBM26_LIST_ITEM_NO=this.Z27TBM26_LIST_ITEM_NO=this.A27TBM26_LIST_ITEM_NO=0;this.O563TBM26_DEL_FLG=this.Z563TBM26_DEL_FLG=this.A563TBM26_DEL_FLG=this.O562TBM26_INNER_VALUE=this.Z562TBM26_INNER_VALUE=this.A562TBM26_INNER_VALUE=this.O561TBM26_LIST_ITEM_NAME=this.Z561TBM26_LIST_ITEM_NAME=this.A561TBM26_LIST_ITEM_NAME="";this.A564TBM26_CRT_DATETIME=
gx.date.nullDate();this.Z564TBM26_CRT_DATETIME=gx.date.nullDate();this.O564TBM26_CRT_DATETIME=gx.date.nullDate();this.O566TBM26_CRT_PROG_NM=this.Z566TBM26_CRT_PROG_NM=this.A566TBM26_CRT_PROG_NM=this.O565TBM26_CRT_USER_ID=this.Z565TBM26_CRT_USER_ID=this.A565TBM26_CRT_USER_ID="";this.A567TBM26_UPD_DATETIME=gx.date.nullDate();this.Z567TBM26_UPD_DATETIME=gx.date.nullDate();this.O567TBM26_UPD_DATETIME=gx.date.nullDate();this.O569TBM26_UPD_PROG_NM=this.Z569TBM26_UPD_PROG_NM=this.A569TBM26_UPD_PROG_NM=this.O568TBM26_UPD_USER_ID=
this.Z568TBM26_UPD_USER_ID=this.A568TBM26_UPD_USER_ID="";this.O570TBM26_UPD_CNT=this.Z570TBM26_UPD_CNT=this.A570TBM26_UPD_CNT=0;this.AV9Pgmname=this.AV8W_BC_FLG="";this.A25TBM26_STUDY_ID=0;this.A26TBM26_LIST_CD="";this.A27TBM26_LIST_ITEM_NO=0;this.A564TBM26_CRT_DATETIME=gx.date.nullDate();this.A565TBM26_CRT_USER_ID="";this.A567TBM26_UPD_DATETIME=gx.date.nullDate();this.A568TBM26_UPD_USER_ID="";this.A570TBM26_UPD_CNT=0;this.A569TBM26_UPD_PROG_NM=this.A566TBM26_CRT_PROG_NM=this.A563TBM26_DEL_FLG=this.A562TBM26_INNER_VALUE=
this.A561TBM26_LIST_ITEM_NAME="";this.Events={e120y2_client:["AFTER TRN",true],e130y33_client:["ENTER",true],e140y33_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","BTN_ENTER"];this.setVCMap("AV9Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");this.InitStandaloneVars();this.LvlOlds[33]=["O570TBM26_UPD_CNT"]});gx.setParentObj(new tbm26_sel_list_item);