gx.evt.autoSkip=!1;
gx.define("tam02_menu",!1,function(){this.ServerClass="tam02_menu";this.PackageName="";this.setObjectType("trn");this.setOnAjaxSessionTimeout("Warn");this.hasEnterEvent=true;this.skipOnEnter=false;this.SetStandaloneVars=function(){this.A275TAM02_UPD_CNT=gx.fn.getIntegerValue("TAM02_UPD_CNT",",");this.Gx_BScreen=gx.fn.getIntegerValue("vGXBSCREEN",",");this.AV14Pgmname=gx.fn.getControlValue("vPGMNAME");this.Gx_mode=gx.fn.getControlValue("vMODE")};this.Valid_Tam01_sys_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam01_sys_id",
["gx.O.A1TAM01_SYS_ID"],[]);return true};this.Valid_Tam02_menu_id_tree_1=function(){try{var a=gx.util.balloon.getNew("TAM02_MENU_ID_TREE_1");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_menu_id_tree_2=function(){try{var a=gx.util.balloon.getNew("TAM02_MENU_ID_TREE_2");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_menu_id_tree_3=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam02_menu_id_tree_3",
["gx.O.A1TAM01_SYS_ID","gx.O.A2TAM02_MENU_ID_TREE_1","gx.O.A3TAM02_MENU_ID_TREE_2","gx.O.A4TAM02_MENU_ID_TREE_3",'gx.date.urlDateTime(gx.O.A225TAM02_CRT_DATETIME,"Y4MD")',"gx.O.A262TAM02_CRT_USER_ID",'gx.date.urlDateTime(gx.O.A227TAM02_UPD_DATETIME,"Y4MD")',"gx.O.A263TAM02_UPD_USER_ID","gx.O.A275TAM02_UPD_CNT","gx.O.A211TAM02_MENU_NM","gx.O.A212TAM02_DEL_FLG","gx.O.A226TAM02_CRT_PROG_NM","gx.O.A228TAM02_UPD_PROG_NM","gx.O.A5TAM02_APP_ID"],["A225TAM02_CRT_DATETIME","A262TAM02_CRT_USER_ID","A227TAM02_UPD_DATETIME",
"A263TAM02_UPD_USER_ID","A275TAM02_UPD_CNT","A211TAM02_MENU_NM","A5TAM02_APP_ID","A212TAM02_DEL_FLG","A226TAM02_CRT_PROG_NM","A228TAM02_UPD_PROG_NM","AV14Pgmname","A318TAM02_APP_NM","Gx_mode","Z1TAM01_SYS_ID","Z2TAM02_MENU_ID_TREE_1","Z3TAM02_MENU_ID_TREE_2","Z4TAM02_MENU_ID_TREE_3","Z225TAM02_CRT_DATETIME","Z262TAM02_CRT_USER_ID","Z227TAM02_UPD_DATETIME","Z263TAM02_UPD_USER_ID","Z275TAM02_UPD_CNT","Z211TAM02_MENU_NM","Z5TAM02_APP_ID","Z212TAM02_DEL_FLG","Z226TAM02_CRT_PROG_NM","Z228TAM02_UPD_PROG_NM",
"ZV14Pgmname","Z318TAM02_APP_NM","O275TAM02_UPD_CNT",["A1TAM01_SYS_ID","Enabled"],["A2TAM02_MENU_ID_TREE_1","Enabled"],["A3TAM02_MENU_ID_TREE_2","Enabled"],["A4TAM02_MENU_ID_TREE_3","Enabled"],["A225TAM02_CRT_DATETIME","Visible"],["A226TAM02_CRT_PROG_NM","Visible"],["A227TAM02_UPD_DATETIME","Visible"],["A228TAM02_UPD_PROG_NM","Visible"],["BTN_DELETE2","Enabled"],["BTN_ENTER2","Enabled"],["BTN_CANCEL","Enabled"]]);return true};this.Valid_Tam02_app_id=function(){gx.ajax.validSrvEvt("dyncall","valid_Tam02_app_id",
["gx.O.A5TAM02_APP_ID","gx.O.A318TAM02_APP_NM"],["A318TAM02_APP_NM"]);return true};this.Valid_Tam02_menu_nm=function(){try{var a=gx.util.balloon.getNew("TAM02_MENU_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_del_flg=function(){try{var a=gx.util.balloon.getNew("TAM02_DEL_FLG");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_crt_datetime=function(){try{var a=gx.util.balloon.getNew("TAM02_CRT_DATETIME");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_crt_user_id=function(){try{var a=gx.util.balloon.getNew("TAM02_CRT_USER_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_crt_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAM02_CRT_PROG_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_upd_datetime=function(){try{var a=gx.util.balloon.getNew("TAM02_UPD_DATETIME");
this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_upd_user_id=function(){try{var a=gx.util.balloon.getNew("TAM02_UPD_USER_ID");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.Valid_Tam02_upd_prog_nm=function(){try{var a=gx.util.balloon.getNew("TAM02_UPD_PROG_NM");this.AnyError=0}catch(b){}try{return a==null?true:a.show()}catch(c){}return true};this.e12022_client=function(){this.executeServerEvent("'BTN_SELECT'",
true)};this.e13022_client=function(){this.executeServerEvent("'BTN_CLER'",true)};this.e14022_client=function(){this.executeServerEvent("ENTER",true)};this.e15022_client=function(){this.executeServerEvent("CANCEL",true)};var b=this.GXValidFnc=[];this.GXCtrlIds=[2,5,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,27,28,34,37,38,40,43,44,46,49,50,52,55,56,58,61,62,64,67,70,74,77,79,82,83,85,91,93,99,101,104,106,109,111,114,116,119,121,124,126,132,135,138,141];this.GXLastCtrlId=141;b[2]={fld:"TABLEMAIN",
grid:0};b[5]={fld:"TABLETOOLBAR",grid:0};b[8]={fld:"",grid:0};b[9]={fld:"BTN_FIRST",grid:0};b[10]={fld:"BTN_FIRST_SEPARATOR",grid:0};b[11]={fld:"BTN_PREVIOUS",grid:0};b[12]={fld:"BTN_PREVIOUS_SEPARATOR",grid:0};b[13]={fld:"BTN_NEXT",grid:0};b[14]={fld:"BTN_NEXT_SEPARATOR",grid:0};b[15]={fld:"BTN_LAST",grid:0};b[16]={fld:"BTN_LAST_SEPARATOR",grid:0};b[17]={fld:"BTN_SELECT",grid:0};b[18]={fld:"BTN_SELECT_SEPARATOR",grid:0};b[19]={fld:"BTN_ENTER2",grid:0};b[20]={fld:"BTN_ENTER2_SEPARATOR",grid:0};b[21]=
{fld:"BTN_CANCEL2",grid:0};b[22]={fld:"BTN_CANCEL2_SEPARATOR",grid:0};b[23]={fld:"BTN_DELETE2",grid:0};b[24]={fld:"BTN_DELETE2_SEPARATOR",grid:0};b[27]={fld:"GROUPDATA",grid:0};b[28]={fld:"TABLE1",grid:0};b[34]={fld:"TABLE2",grid:0};b[37]={fld:"IMAGE19",grid:0};b[38]={fld:"TEXTBLOCKTAM01_SYS_ID",format:0,grid:0};b[40]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam01_sys_id,isvalid:null,rgrid:[],fld:"TAM01_SYS_ID",gxz:"Z1TAM01_SYS_ID",gxold:"O1TAM01_SYS_ID",
gxvar:"A1TAM01_SYS_ID",ucs:[],op:[],ip:[40],nacdep:[],ctrltype:"dyncombo",v2v:function(a){gx.O.A1TAM01_SYS_ID=a},v2z:function(a){gx.O.Z1TAM01_SYS_ID=a},v2c:function(){gx.fn.setComboBoxValue("TAM01_SYS_ID",gx.O.A1TAM01_SYS_ID)},c2v:function(){gx.O.A1TAM01_SYS_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM01_SYS_ID")},nac:gx.falseFn};b[43]={fld:"IMAGE20",grid:0};b[44]={fld:"TEXTBLOCKTAM02_MENU_ID_TREE_1",format:0,grid:0};b[46]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,
gxgrid:null,fnc:this.Valid_Tam02_menu_id_tree_1,isvalid:null,rgrid:[],fld:"TAM02_MENU_ID_TREE_1",gxz:"Z2TAM02_MENU_ID_TREE_1",gxold:"O2TAM02_MENU_ID_TREE_1",gxvar:"A2TAM02_MENU_ID_TREE_1",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A2TAM02_MENU_ID_TREE_1=a},v2z:function(a){gx.O.Z2TAM02_MENU_ID_TREE_1=a},v2c:function(){gx.fn.setControlValue("TAM02_MENU_ID_TREE_1",gx.O.A2TAM02_MENU_ID_TREE_1,0)},c2v:function(){gx.O.A2TAM02_MENU_ID_TREE_1=this.val()},val:function(){return gx.fn.getControlValue("TAM02_MENU_ID_TREE_1")},
nac:gx.falseFn};b[49]={fld:"IMAGE21",grid:0};b[50]={fld:"TEXTBLOCKTAM02_MENU_ID_TREE_2",format:0,grid:0};b[52]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam02_menu_id_tree_2,isvalid:null,rgrid:[],fld:"TAM02_MENU_ID_TREE_2",gxz:"Z3TAM02_MENU_ID_TREE_2",gxold:"O3TAM02_MENU_ID_TREE_2",gxvar:"A3TAM02_MENU_ID_TREE_2",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A3TAM02_MENU_ID_TREE_2=a},v2z:function(a){gx.O.Z3TAM02_MENU_ID_TREE_2=a},v2c:function(){gx.fn.setControlValue("TAM02_MENU_ID_TREE_2",
gx.O.A3TAM02_MENU_ID_TREE_2,0)},c2v:function(){gx.O.A3TAM02_MENU_ID_TREE_2=this.val()},val:function(){return gx.fn.getControlValue("TAM02_MENU_ID_TREE_2")},nac:gx.falseFn};b[55]={fld:"IMAGE22",grid:0};b[56]={fld:"TEXTBLOCKTAM02_MENU_ID_TREE_3",format:0,grid:0};b[58]={lvl:0,type:"svchar",len:2,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam02_menu_id_tree_3,isvalid:null,rgrid:[],fld:"TAM02_MENU_ID_TREE_3",gxz:"Z4TAM02_MENU_ID_TREE_3",gxold:"O4TAM02_MENU_ID_TREE_3",gxvar:"A4TAM02_MENU_ID_TREE_3",
ucs:[],op:[67,126,111,93,85,121,116,106,101],ip:[67,126,111,93,85,121,116,106,101,58,52,46,40],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A4TAM02_MENU_ID_TREE_3=a},v2z:function(a){gx.O.Z4TAM02_MENU_ID_TREE_3=a},v2c:function(){gx.fn.setControlValue("TAM02_MENU_ID_TREE_3",gx.O.A4TAM02_MENU_ID_TREE_3,0)},c2v:function(){gx.O.A4TAM02_MENU_ID_TREE_3=this.val()},val:function(){return gx.fn.getControlValue("TAM02_MENU_ID_TREE_3")},nac:gx.falseFn};b[61]={fld:"IMAGE23",grid:0};b[62]={fld:"TEXTBLOCKTAM02_APP_ID",
format:0,grid:0};b[64]={fld:"TABLE3",grid:0};b[67]={lvl:0,type:"svchar",len:7,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam02_app_id,isvalid:null,rgrid:[],fld:"TAM02_APP_ID",gxz:"Z5TAM02_APP_ID",gxold:"O5TAM02_APP_ID",gxvar:"A5TAM02_APP_ID",ucs:[],op:[70],ip:[70,67],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A5TAM02_APP_ID=a},v2z:function(a){gx.O.Z5TAM02_APP_ID=a},v2c:function(){gx.fn.setControlValue("TAM02_APP_ID",gx.O.A5TAM02_APP_ID,0)},c2v:function(){gx.O.A5TAM02_APP_ID=this.val()},
val:function(){return gx.fn.getControlValue("TAM02_APP_ID")},nac:gx.falseFn};b[70]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:null,isvalid:null,rgrid:[],fld:"TAM02_APP_NM",gxz:"Z318TAM02_APP_NM",gxold:"O318TAM02_APP_NM",gxvar:"A318TAM02_APP_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A318TAM02_APP_NM=a},v2z:function(a){gx.O.Z318TAM02_APP_NM=a},v2c:function(){gx.fn.setControlValue("TAM02_APP_NM",gx.O.A318TAM02_APP_NM,0)},c2v:function(){gx.O.A318TAM02_APP_NM=
this.val()},val:function(){return gx.fn.getControlValue("TAM02_APP_NM")},nac:gx.falseFn};b[74]={fld:"TABLE5",grid:0};b[77]={fld:"TEXTBLOCK2",format:0,grid:0};b[79]={fld:"TEXTBLOCK1",format:1,grid:0};b[82]={fld:"IMAGE24",grid:0};b[83]={fld:"TEXTBLOCKTAM02_MENU_NM",format:0,grid:0};b[85]={lvl:0,type:"svchar",len:50,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam02_menu_nm,isvalid:null,rgrid:[],fld:"TAM02_MENU_NM",gxz:"Z211TAM02_MENU_NM",gxold:"O211TAM02_MENU_NM",gxvar:"A211TAM02_MENU_NM",
ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A211TAM02_MENU_NM=a},v2z:function(a){gx.O.Z211TAM02_MENU_NM=a},v2c:function(){gx.fn.setControlValue("TAM02_MENU_NM",gx.O.A211TAM02_MENU_NM,0)},c2v:function(){gx.O.A211TAM02_MENU_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM02_MENU_NM")},nac:gx.falseFn};b[91]={fld:"TEXTBLOCKTAM01_DEL_FLG",format:0,grid:0};b[93]={lvl:0,type:"svchar",len:1,dec:0,sign:false,ro:0,grid:0,gxgrid:null,fnc:this.Valid_Tam02_del_flg,isvalid:null,
rgrid:[],fld:"TAM02_DEL_FLG",gxz:"Z212TAM02_DEL_FLG",gxold:"O212TAM02_DEL_FLG",gxvar:"A212TAM02_DEL_FLG",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"radio",v2v:function(a){gx.O.A212TAM02_DEL_FLG=a},v2z:function(a){gx.O.Z212TAM02_DEL_FLG=a},v2c:function(){gx.fn.setRadioValue("TAM02_DEL_FLG",gx.O.A212TAM02_DEL_FLG);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A212TAM02_DEL_FLG=this.val()},val:function(){return gx.fn.getControlValue("TAM02_DEL_FLG")},nac:gx.falseFn};this.declareDomainHdlr(93,
function(){});b[99]={fld:"TEXTBLOCKTAM02_CRT_DATETIME",format:0,grid:0};b[101]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam02_crt_datetime,isvalid:null,rgrid:[],fld:"TAM02_CRT_DATETIME",gxz:"Z225TAM02_CRT_DATETIME",gxold:"O225TAM02_CRT_DATETIME",gxvar:"A225TAM02_CRT_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A225TAM02_CRT_DATETIME=gx.fn.toDatetimeValue(a)},
v2z:function(a){gx.O.Z225TAM02_CRT_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM02_CRT_DATETIME",gx.O.A225TAM02_CRT_DATETIME,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A225TAM02_CRT_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAM02_CRT_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(101,function(){});b[104]={fld:"TEXTBLOCKTAM02_CRT_USER_ID",format:0,grid:0};b[106]={lvl:0,type:"svchar",
len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam02_crt_user_id,isvalid:null,rgrid:[],fld:"TAM02_CRT_USER_ID",gxz:"Z262TAM02_CRT_USER_ID",gxold:"O262TAM02_CRT_USER_ID",gxvar:"A262TAM02_CRT_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A262TAM02_CRT_USER_ID=a},v2z:function(a){gx.O.Z262TAM02_CRT_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM02_CRT_USER_ID",gx.O.A262TAM02_CRT_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A262TAM02_CRT_USER_ID=
this.val()},val:function(){return gx.fn.getControlValue("TAM02_CRT_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(106,function(){});b[109]={fld:"TEXTBLOCKTAM02_CRT_PROG_NM",format:0,grid:0};b[111]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam02_crt_prog_nm,isvalid:null,rgrid:[],fld:"TAM02_CRT_PROG_NM",gxz:"Z226TAM02_CRT_PROG_NM",gxold:"O226TAM02_CRT_PROG_NM",gxvar:"A226TAM02_CRT_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A226TAM02_CRT_PROG_NM=
a},v2z:function(a){gx.O.Z226TAM02_CRT_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM02_CRT_PROG_NM",gx.O.A226TAM02_CRT_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A226TAM02_CRT_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM02_CRT_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(111,function(){});b[114]={fld:"TEXTBLOCKTAM02_UPD_DATETIME",format:0,grid:0};b[116]={lvl:0,type:"dtime",len:10,dec:8,sign:false,ro:1,grid:0,gxgrid:null,
fnc:this.Valid_Tam02_upd_datetime,isvalid:null,rgrid:[],fld:"TAM02_UPD_DATETIME",gxz:"Z227TAM02_UPD_DATETIME",gxold:"O227TAM02_UPD_DATETIME",gxvar:"A227TAM02_UPD_DATETIME",dp:{f:0,st:true,wn:false,mf:false,pic:"99/99/9999 99:99:99",dec:8},ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A227TAM02_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2z:function(a){gx.O.Z227TAM02_UPD_DATETIME=gx.fn.toDatetimeValue(a)},v2c:function(){gx.fn.setControlValue("TAM02_UPD_DATETIME",gx.O.A227TAM02_UPD_DATETIME,
0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A227TAM02_UPD_DATETIME=gx.fn.toDatetimeValue(this.val())},val:function(){return gx.fn.getDateTimeValue("TAM02_UPD_DATETIME")},nac:gx.falseFn};this.declareDomainHdlr(116,function(){});b[119]={fld:"TEXTBLOCKTAM02_UPD_USER_ID",format:0,grid:0};b[121]={lvl:0,type:"svchar",len:128,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam02_upd_user_id,isvalid:null,rgrid:[],fld:"TAM02_UPD_USER_ID",gxz:"Z263TAM02_UPD_USER_ID",
gxold:"O263TAM02_UPD_USER_ID",gxvar:"A263TAM02_UPD_USER_ID",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A263TAM02_UPD_USER_ID=a},v2z:function(a){gx.O.Z263TAM02_UPD_USER_ID=a},v2c:function(){gx.fn.setControlValue("TAM02_UPD_USER_ID",gx.O.A263TAM02_UPD_USER_ID,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A263TAM02_UPD_USER_ID=this.val()},val:function(){return gx.fn.getControlValue("TAM02_UPD_USER_ID")},nac:gx.falseFn};this.declareDomainHdlr(121,
function(){});b[124]={fld:"TEXTBLOCKTAM02_UPD_PROG_NM",format:0,grid:0};b[126]={lvl:0,type:"svchar",len:40,dec:0,sign:false,ro:1,grid:0,gxgrid:null,fnc:this.Valid_Tam02_upd_prog_nm,isvalid:null,rgrid:[],fld:"TAM02_UPD_PROG_NM",gxz:"Z228TAM02_UPD_PROG_NM",gxold:"O228TAM02_UPD_PROG_NM",gxvar:"A228TAM02_UPD_PROG_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A228TAM02_UPD_PROG_NM=a},v2z:function(a){gx.O.Z228TAM02_UPD_PROG_NM=a},v2c:function(){gx.fn.setControlValue("TAM02_UPD_PROG_NM",
gx.O.A228TAM02_UPD_PROG_NM,0);typeof this.dom_hdl=="function"&&this.dom_hdl.call(gx.O)},c2v:function(){gx.O.A228TAM02_UPD_PROG_NM=this.val()},val:function(){return gx.fn.getControlValue("TAM02_UPD_PROG_NM")},nac:gx.falseFn};this.declareDomainHdlr(126,function(){});b[132]={fld:"TABLE4",grid:0};b[135]={fld:"TEXTBLOCK44",format:0,grid:0};b[138]={fld:"TEXTBLOCK45",format:0,grid:0};b[141]={fld:"BTN_CANCEL",format:0,grid:0};this.O212TAM02_DEL_FLG=this.Z212TAM02_DEL_FLG=this.A212TAM02_DEL_FLG=this.O211TAM02_MENU_NM=
this.Z211TAM02_MENU_NM=this.A211TAM02_MENU_NM=this.O318TAM02_APP_NM=this.Z318TAM02_APP_NM=this.A318TAM02_APP_NM=this.O5TAM02_APP_ID=this.Z5TAM02_APP_ID=this.A5TAM02_APP_ID=this.O4TAM02_MENU_ID_TREE_3=this.Z4TAM02_MENU_ID_TREE_3=this.A4TAM02_MENU_ID_TREE_3=this.O3TAM02_MENU_ID_TREE_2=this.Z3TAM02_MENU_ID_TREE_2=this.A3TAM02_MENU_ID_TREE_2=this.O2TAM02_MENU_ID_TREE_1=this.Z2TAM02_MENU_ID_TREE_1=this.A2TAM02_MENU_ID_TREE_1=this.O1TAM01_SYS_ID=this.Z1TAM01_SYS_ID=this.A1TAM01_SYS_ID="";this.A225TAM02_CRT_DATETIME=
gx.date.nullDate();this.Z225TAM02_CRT_DATETIME=gx.date.nullDate();this.O225TAM02_CRT_DATETIME=gx.date.nullDate();this.O226TAM02_CRT_PROG_NM=this.Z226TAM02_CRT_PROG_NM=this.A226TAM02_CRT_PROG_NM=this.O262TAM02_CRT_USER_ID=this.Z262TAM02_CRT_USER_ID=this.A262TAM02_CRT_USER_ID="";this.A227TAM02_UPD_DATETIME=gx.date.nullDate();this.Z227TAM02_UPD_DATETIME=gx.date.nullDate();this.O227TAM02_UPD_DATETIME=gx.date.nullDate();this.A4TAM02_MENU_ID_TREE_3=this.A3TAM02_MENU_ID_TREE_2=this.A2TAM02_MENU_ID_TREE_1=
this.A1TAM01_SYS_ID=this.AV12W_MSG=this.AV14Pgmname=this.AV7C_TAM02_APP_ID=this.O228TAM02_UPD_PROG_NM=this.Z228TAM02_UPD_PROG_NM=this.A228TAM02_UPD_PROG_NM=this.O263TAM02_UPD_USER_ID=this.Z263TAM02_UPD_USER_ID=this.A263TAM02_UPD_USER_ID="";this.A225TAM02_CRT_DATETIME=gx.date.nullDate();this.A262TAM02_CRT_USER_ID="";this.A227TAM02_UPD_DATETIME=gx.date.nullDate();this.A263TAM02_UPD_USER_ID="";this.Gx_BScreen=this.A275TAM02_UPD_CNT=0;this.A228TAM02_UPD_PROG_NM=this.A226TAM02_CRT_PROG_NM=this.A212TAM02_DEL_FLG=
this.A318TAM02_APP_NM=this.A5TAM02_APP_ID=this.A211TAM02_MENU_NM="";this.Events={e12022_client:["'BTN_SELECT'",true],e13022_client:["'BTN_CLER'",true],e14022_client:["ENTER",true],e15022_client:["CANCEL",true]};this.EnterCtrl=["BTN_ENTER2","BTN_ENTER2_SEPARATOR","TEXTBLOCK44"];this.CheckCtrl=["BTN_CANCEL"];this.setVCMap("A275TAM02_UPD_CNT","TAM02_UPD_CNT",0,"int");this.setVCMap("Gx_BScreen","vGXBSCREEN",0,"int");this.setVCMap("AV14Pgmname","vPGMNAME",0,"char");this.setVCMap("Gx_mode","vMODE",0,"char");
this.InitStandaloneVars();this.LvlOlds[2]=["O275TAM02_UPD_CNT"]});gx.setParentObj(new tam02_menu);