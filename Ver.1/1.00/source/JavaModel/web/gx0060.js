gx.evt.autoSkip=false;function gx0060(){this.ServerClass="Gx0060";this.PackageName="";this.setObjectType("web");this.hasEnterEvent=true;this.autoRefresh=true;this.SetStandaloneVars=function(){this.AV6pTAS02_GNGO_KBN=gx.fn.getControlValue("vPTAS02_GNGO_KBN")};this.e130f2_client=function(){this.executeServerEvent("ENTER",true,arguments[0])};this.e140f1_client=function(){this.executeServerEvent("CANCEL",true)};this.GXValidFnc=[];this.GXCtrlIds=[2,10,11,15,16,17,18,19,22];this.GXLastCtrlId=22;this.Grid1Container=new gx.grid.grid(this,2,"WbpLvl2",14,"Grid1","Grid1","Grid1Container",this.CmpContext,this.IsMasterPage,"gx0060",[],false,1,false,true,10,true,false,false,"",0,"px","行追加",true,false,false,null,null,false,"");
this.Grid1Container.addBitmap("&Linkselection","vLINKSELECTION",15,0,"px",17,"px",null,"","");this.Grid1Container.addSingleLineEdit(22,16,"TAS02_GNGO_KBN","元号区分","","TAS02_GNGO_KBN","svchar",80,"px",1,1,"left",null,[],22,"TAS02_GNGO_KBN",true,0,false,false);this.Grid1Container.addSingleLineEdit(23,17,"TAS02_GNGO_NM","元号名称","選択","TAS02_GNGO_NM","svchar",150,"px",10,10,"left",null,[],23,"TAS02_GNGO_NM",true,0,false,false);this.Grid1Container.addSingleLineEdit(24,18,"TAS02_DATE_START","開始年月日（西暦）","","TAS02_DATE_START","svchar",140,"px",8,8,"left",null,[],24,"TAS02_DATE_START",true,0,false,false);
this.Grid1Container.addSingleLineEdit(25,19,"TAS02_DATE_END","終了年月日（西暦）","","TAS02_DATE_END","svchar",140,"px",8,8,"left",null,[],25,"TAS02_DATE_END",true,0,false,false);this.setGrid(this.Grid1Container);this.GXValidFnc[2]={fld:"TABLE1",grid:0};this.GXValidFnc[10]={fld:"GROUP2",grid:0};this.GXValidFnc[11]={fld:"TABLE3",grid:0};this.GXValidFnc[15]={lvl:2,type:"bits",len:4,dec:0,sign:false,ro:1,grid:14,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"vLINKSELECTION",gxz:"ZV5LinkSelection",gxold:"OV5LinkSelection",gxvar:"AV5LinkSelection",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.AV5LinkSelection=a
},v2z:function(a){gx.O.ZV5LinkSelection=a},v2c:function(){},c2v:function(){gx.O.AV5LinkSelection=this.val()},val:function(){return gx.fn.getGridControlValue("vLINKSELECTION",gx.fn.currentGridRowImpl(14))},nac:function(){return false}};this.GXValidFnc[16]={lvl:2,type:"svchar",len:1,dec:0,sign:false,ro:1,grid:14,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TAS02_GNGO_KBN",gxz:"Z22TAS02_GNGO_KBN",gxold:"O22TAS02_GNGO_KBN",gxvar:"A22TAS02_GNGO_KBN",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A22TAS02_GNGO_KBN=a
},v2z:function(a){gx.O.Z22TAS02_GNGO_KBN=a},v2c:function(){gx.fn.setGridControlValue("TAS02_GNGO_KBN",gx.fn.currentGridRowImpl(14),gx.O.A22TAS02_GNGO_KBN,0)},c2v:function(){gx.O.A22TAS02_GNGO_KBN=this.val()},val:function(){return gx.fn.getGridControlValue("TAS02_GNGO_KBN",gx.fn.currentGridRowImpl(14))},nac:function(){return false}};this.GXValidFnc[17]={lvl:2,type:"svchar",len:10,dec:0,sign:false,ro:1,grid:14,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TAS02_GNGO_NM",gxz:"Z23TAS02_GNGO_NM",gxold:"O23TAS02_GNGO_NM",gxvar:"A23TAS02_GNGO_NM",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A23TAS02_GNGO_NM=a
},v2z:function(a){gx.O.Z23TAS02_GNGO_NM=a},v2c:function(){gx.fn.setGridControlValue("TAS02_GNGO_NM",gx.fn.currentGridRowImpl(14),gx.O.A23TAS02_GNGO_NM,0)},c2v:function(){gx.O.A23TAS02_GNGO_NM=this.val()},val:function(){return gx.fn.getGridControlValue("TAS02_GNGO_NM",gx.fn.currentGridRowImpl(14))},nac:function(){return false}};this.GXValidFnc[18]={lvl:2,type:"svchar",len:8,dec:0,sign:false,ro:1,grid:14,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TAS02_DATE_START",gxz:"Z24TAS02_DATE_START",gxold:"O24TAS02_DATE_START",gxvar:"A24TAS02_DATE_START",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A24TAS02_DATE_START=a
},v2z:function(a){gx.O.Z24TAS02_DATE_START=a},v2c:function(){gx.fn.setGridControlValue("TAS02_DATE_START",gx.fn.currentGridRowImpl(14),gx.O.A24TAS02_DATE_START,0)},c2v:function(){gx.O.A24TAS02_DATE_START=this.val()},val:function(){return gx.fn.getGridControlValue("TAS02_DATE_START",gx.fn.currentGridRowImpl(14))},nac:function(){return false}};this.GXValidFnc[19]={lvl:2,type:"svchar",len:8,dec:0,sign:false,ro:1,grid:14,gxgrid:this.Grid1Container,fnc:null,isvalid:null,fld:"TAS02_DATE_END",gxz:"Z25TAS02_DATE_END",gxold:"O25TAS02_DATE_END",gxvar:"A25TAS02_DATE_END",ucs:[],op:[],ip:[],nacdep:[],ctrltype:"edit",v2v:function(a){gx.O.A25TAS02_DATE_END=a
},v2z:function(a){gx.O.Z25TAS02_DATE_END=a},v2c:function(){gx.fn.setGridControlValue("TAS02_DATE_END",gx.fn.currentGridRowImpl(14),gx.O.A25TAS02_DATE_END,0)},c2v:function(){gx.O.A25TAS02_DATE_END=this.val()},val:function(){return gx.fn.getGridControlValue("TAS02_DATE_END",gx.fn.currentGridRowImpl(14))},nac:function(){return false}};this.GXValidFnc[22]={fld:"TABLE4",grid:0};this.ZV5LinkSelection="";this.OV5LinkSelection="";this.Z22TAS02_GNGO_KBN="";this.O22TAS02_GNGO_KBN="";this.Z23TAS02_GNGO_NM="";
this.O23TAS02_GNGO_NM="";this.Z24TAS02_DATE_START="";this.O24TAS02_DATE_START="";this.Z25TAS02_DATE_END="";this.O25TAS02_DATE_END="";this.AV6pTAS02_GNGO_KBN="";this.AV5LinkSelection="";this.A22TAS02_GNGO_KBN="";this.A23TAS02_GNGO_NM="";this.A24TAS02_DATE_START="";this.A25TAS02_DATE_END="";this.ServerEvents=["e130f2_client","e140f1_client"];this.VarControlMap.AV6pTAS02_GNGO_KBN={id:"vPTAS02_GNGO_KBN",grid:0,type:"svchar"};this.SetStandaloneVars()}gx0060.prototype=new gx.GxObject;gx.setParentObj(new gx0060());