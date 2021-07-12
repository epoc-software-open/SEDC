/*
               File: SdtTBM26_SEL_LIST_ITEM
        Description: 選択リスト項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:41.36
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM26_SEL_LIST_ITEM extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM26_SEL_LIST_ITEM( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM26_SEL_LIST_ITEM.class));
   }

   public SdtTBM26_SEL_LIST_ITEM( int remoteHandle ,
                                  ModelContext context )
   {
      super( context, "SdtTBM26_SEL_LIST_ITEM");
      initialize( remoteHandle) ;
   }

   public SdtTBM26_SEL_LIST_ITEM( int remoteHandle ,
                                  StructSdtTBM26_SEL_LIST_ITEM struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void Load( long AV25TBM26_STUDY_ID ,
                     String AV26TBM26_LIST_CD ,
                     short AV27TBM26_LIST_ITEM_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV25TBM26_STUDY_ID),AV26TBM26_LIST_CD,new Short(AV27TBM26_LIST_ITEM_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM26_STUDY_ID", long.class}, new Object[]{"TBM26_LIST_CD", String.class}, new Object[]{"TBM26_LIST_ITEM_NO", short.class}}) ;
   }

   public GxObjectCollection GetMessages( )
   {
      short item = 1 ;
      GxObjectCollection msgs = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle) ;
      SdtMessages_Message m1 ;
      IGxSilentTrn trn = getTransaction() ;
      com.genexus.internet.MsgList msgList = trn.GetMessages() ;
      while ( item <= msgList.getItemCount() )
      {
         m1 = new SdtMessages_Message(remoteHandle, context) ;
         m1.setgxTv_SdtMessages_Message_Id( msgList.getItemValue(item) );
         m1.setgxTv_SdtMessages_Message_Description( msgList.getItemText(item) );
         m1.setgxTv_SdtMessages_Message_Type( (byte)(msgList.getItemType(item)) );
         msgs.add(m1, 0);
         item = (short)(item+1) ;
      }
      return msgs ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "TBM26_SEL_LIST_ITEM");
      metadata.set("BT", "TBM26_SEL_LIST_ITEM");
      metadata.set("PK", "[ \"TBM26_STUDY_ID\",\"TBM26_LIST_CD\",\"TBM26_LIST_ITEM_NO\" ]");
      metadata.set("PKAssigned", "[ \"TBM26_LIST_CD\",\"TBM26_STUDY_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TBM25_STUDY_ID\",\"TBM25_LIST_CD\" ],\"FKMap\":[ \"TBM26_STUDY_ID-TBM25_STUDY_ID\",\"TBM26_LIST_CD-TBM25_LIST_CD\" ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_STUDY_ID") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_CD") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_ITEM_NO") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_ITEM_NAME") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_INNER_VALUE") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_DEL_FLG") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_USER_ID") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_PROG_NM") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_USER_ID") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_PROG_NM") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_CNT") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_STUDY_ID_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_CD_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_ITEM_NO_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_ITEM_NAME_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_INNER_VALUE_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_DEL_FLG_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_CNT_Z") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_LIST_ITEM_NAME_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_INNER_VALUE_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_DEL_FLG_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM26_UPD_CNT_N") )
            {
               gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( readOk == 0 )
            {
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg = context.globals.sSOAPErrMsg + "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TBM26_SEL_LIST_ITEM" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("TBM26_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_LIST_CD", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_LIST_ITEM_NO", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_LIST_ITEM_NAME", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_INNER_VALUE", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime) )
      {
         oWriter.writeStartElement("TBM26_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM26_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM26_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime) )
      {
         oWriter.writeStartElement("TBM26_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM26_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM26_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM26_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_LIST_CD_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_LIST_ITEM_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_LIST_ITEM_NAME_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_INNER_VALUE_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM26_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM26_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM26_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM26_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM26_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM26_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_LIST_ITEM_NAME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_INNER_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM26_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TBM26_STUDY_ID", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id, false);
      AddObjectProperty("TBM26_LIST_CD", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd, false);
      AddObjectProperty("TBM26_LIST_ITEM_NO", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no, false);
      AddObjectProperty("TBM26_LIST_ITEM_NAME", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name, false);
      AddObjectProperty("TBM26_INNER_VALUE", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value, false);
      AddObjectProperty("TBM26_DEL_FLG", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg, false);
      datetime_STZ = gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM26_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM26_CRT_USER_ID", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id, false);
      AddObjectProperty("TBM26_CRT_PROG_NM", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM26_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM26_UPD_USER_ID", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id, false);
      AddObjectProperty("TBM26_UPD_PROG_NM", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm, false);
      AddObjectProperty("TBM26_UPD_CNT", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM26_SEL_LIST_ITEM_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized, false);
         AddObjectProperty("TBM26_STUDY_ID_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z, false);
         AddObjectProperty("TBM26_LIST_CD_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z, false);
         AddObjectProperty("TBM26_LIST_ITEM_NO_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z, false);
         AddObjectProperty("TBM26_LIST_ITEM_NAME_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z, false);
         AddObjectProperty("TBM26_INNER_VALUE_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z, false);
         AddObjectProperty("TBM26_DEL_FLG_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("TBM26_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM26_CRT_USER_ID_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z, false);
         AddObjectProperty("TBM26_CRT_PROG_NM_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         AddObjectProperty("TBM26_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM26_UPD_USER_ID_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z, false);
         AddObjectProperty("TBM26_UPD_PROG_NM_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z, false);
         AddObjectProperty("TBM26_UPD_CNT_Z", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z, false);
         AddObjectProperty("TBM26_LIST_ITEM_NAME_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N, false);
         AddObjectProperty("TBM26_INNER_VALUE_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N, false);
         AddObjectProperty("TBM26_DEL_FLG_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N, false);
         AddObjectProperty("TBM26_CRT_DATETIME_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N, false);
         AddObjectProperty("TBM26_CRT_USER_ID_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N, false);
         AddObjectProperty("TBM26_CRT_PROG_NM_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N, false);
         AddObjectProperty("TBM26_UPD_DATETIME_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N, false);
         AddObjectProperty("TBM26_UPD_USER_ID_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N, false);
         AddObjectProperty("TBM26_UPD_PROG_NM_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N, false);
         AddObjectProperty("TBM26_UPD_CNT_N", gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id( long value )
   {
      if ( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id != value )
      {
         gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id = value ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd, value) != 0 )
      {
         gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd = value ;
   }

   public short getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no( short value )
   {
      if ( gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no != value )
      {
         gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "INS" ;
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no = value ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Mode ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized( short value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z( short value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N( )
   {
      return gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm26_sel_list_item_bc obj ;
      obj = new tbm26_sel_list_item_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Mode = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z = "" ;
      gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM26_SEL_LIST_ITEM Clone( )
   {
      SdtTBM26_SEL_LIST_ITEM sdt ;
      tbm26_sel_list_item_bc obj ;
      sdt = (SdtTBM26_SEL_LIST_ITEM)(clone()) ;
      obj = (tbm26_sel_list_item_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM26_SEL_LIST_ITEM struct )
   {
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id(struct.getTbm26_study_id());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd(struct.getTbm26_list_cd());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no(struct.getTbm26_list_item_no());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name(struct.getTbm26_list_item_name());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value(struct.getTbm26_inner_value());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg(struct.getTbm26_del_flg());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime(struct.getTbm26_crt_datetime());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id(struct.getTbm26_crt_user_id());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm(struct.getTbm26_crt_prog_nm());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime(struct.getTbm26_upd_datetime());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id(struct.getTbm26_upd_user_id());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm(struct.getTbm26_upd_prog_nm());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt(struct.getTbm26_upd_cnt());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Mode(struct.getMode());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized(struct.getInitialized());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z(struct.getTbm26_study_id_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z(struct.getTbm26_list_cd_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z(struct.getTbm26_list_item_no_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z(struct.getTbm26_list_item_name_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z(struct.getTbm26_inner_value_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z(struct.getTbm26_del_flg_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z(struct.getTbm26_crt_datetime_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z(struct.getTbm26_crt_user_id_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z(struct.getTbm26_crt_prog_nm_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z(struct.getTbm26_upd_datetime_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z(struct.getTbm26_upd_user_id_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z(struct.getTbm26_upd_prog_nm_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z(struct.getTbm26_upd_cnt_Z());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N(struct.getTbm26_list_item_name_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N(struct.getTbm26_inner_value_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N(struct.getTbm26_del_flg_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N(struct.getTbm26_crt_datetime_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N(struct.getTbm26_crt_user_id_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N(struct.getTbm26_crt_prog_nm_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N(struct.getTbm26_upd_datetime_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N(struct.getTbm26_upd_user_id_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N(struct.getTbm26_upd_prog_nm_N());
      setgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N(struct.getTbm26_upd_cnt_N());
   }

   public StructSdtTBM26_SEL_LIST_ITEM getStruct( )
   {
      StructSdtTBM26_SEL_LIST_ITEM struct = new StructSdtTBM26_SEL_LIST_ITEM ();
      struct.setTbm26_study_id(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id());
      struct.setTbm26_list_cd(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd());
      struct.setTbm26_list_item_no(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no());
      struct.setTbm26_list_item_name(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name());
      struct.setTbm26_inner_value(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value());
      struct.setTbm26_del_flg(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg());
      struct.setTbm26_crt_datetime(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime());
      struct.setTbm26_crt_user_id(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id());
      struct.setTbm26_crt_prog_nm(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm());
      struct.setTbm26_upd_datetime(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime());
      struct.setTbm26_upd_user_id(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id());
      struct.setTbm26_upd_prog_nm(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm());
      struct.setTbm26_upd_cnt(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt());
      struct.setMode(getgxTv_SdtTBM26_SEL_LIST_ITEM_Mode());
      struct.setInitialized(getgxTv_SdtTBM26_SEL_LIST_ITEM_Initialized());
      struct.setTbm26_study_id_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z());
      struct.setTbm26_list_cd_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z());
      struct.setTbm26_list_item_no_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z());
      struct.setTbm26_list_item_name_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z());
      struct.setTbm26_inner_value_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z());
      struct.setTbm26_del_flg_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z());
      struct.setTbm26_crt_datetime_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z());
      struct.setTbm26_crt_user_id_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z());
      struct.setTbm26_crt_prog_nm_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z());
      struct.setTbm26_upd_datetime_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z());
      struct.setTbm26_upd_user_id_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z());
      struct.setTbm26_upd_prog_nm_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z());
      struct.setTbm26_upd_cnt_Z(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z());
      struct.setTbm26_list_item_name_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N());
      struct.setTbm26_inner_value_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N());
      struct.setTbm26_del_flg_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N());
      struct.setTbm26_crt_datetime_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N());
      struct.setTbm26_crt_user_id_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N());
      struct.setTbm26_crt_prog_nm_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N());
      struct.setTbm26_upd_datetime_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N());
      struct.setTbm26_upd_user_id_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N());
      struct.setTbm26_upd_prog_nm_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N());
      struct.setTbm26_upd_cnt_N(getgxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_N ;
   private byte gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_N ;
   private short gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no ;
   private short gxTv_SdtTBM26_SEL_LIST_ITEM_Initialized ;
   private short gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_no_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_study_id_Z ;
   private long gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_cnt_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_cd_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_list_item_name_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_inner_value_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_del_flg_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_user_id_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_crt_prog_nm_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_user_id_Z ;
   private String gxTv_SdtTBM26_SEL_LIST_ITEM_Tbm26_upd_prog_nm_Z ;
}

