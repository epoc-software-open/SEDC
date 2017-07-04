/*
               File: SdtTBT16_IMPORT_HISTORY
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:33.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT16_IMPORT_HISTORY extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT16_IMPORT_HISTORY( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT16_IMPORT_HISTORY.class));
   }

   public SdtTBT16_IMPORT_HISTORY( int remoteHandle ,
                                   ModelContext context )
   {
      super( context, "SdtTBT16_IMPORT_HISTORY");
      initialize( remoteHandle) ;
   }

   public SdtTBT16_IMPORT_HISTORY( int remoteHandle ,
                                   StructSdtTBT16_IMPORT_HISTORY struct )
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

   public void Load( long AV190TBT16_IMPORT_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV190TBT16_IMPORT_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT16_IMPORT_NO", long.class}}) ;
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
      metadata.set("Name", "TBT16_IMPORT_HISTORY");
      metadata.set("BT", "TBT16_IMPORT_HISTORY");
      metadata.set("PK", "[ \"TBT16_IMPORT_NO\" ]");
      metadata.set("PKAssigned", "[ \"TBT16_IMPORT_NO\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_NO") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_FILE_NM") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_FILE_NM") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_DEL_FLG") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_USER_ID") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_PROG_NM") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_USER_ID") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_PROG_NM") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_CNT") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_NO_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_FILE_NM_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_FILE_NM_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_DEL_FLG_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_CNT_Z") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_FILE_NM_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_FILE_NM_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_DATETIME_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_DEL_FLG_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_UPD_CNT_N") )
            {
               gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT16_IMPORT_HISTORY" ;
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
      oWriter.writeElement("TBT16_IMPORT_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_IMPORT_FILE_NM", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_FILE_NM", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime) )
      {
         oWriter.writeStartElement("TBT16_IMPORT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT16_IMPORT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT16_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime) )
      {
         oWriter.writeStartElement("TBT16_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT16_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT16_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime) )
      {
         oWriter.writeStartElement("TBT16_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT16_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT16_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_IMPORT_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_IMPORT_FILE_NM_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_FILE_NM_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z) )
         {
            oWriter.writeStartElement("TBT16_IMPORT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT16_IMPORT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT16_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT16_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT16_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT16_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT16_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT16_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT16_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_IMPORT_FILE_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_FILE_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_IMPORT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT16_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT16_IMPORT_NO", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no, false);
      AddObjectProperty("TBT16_IMPORT_FILE_NM", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm, false);
      AddObjectProperty("TBT16_FILE_NM", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm, false);
      datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime ;
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
      AddObjectProperty("TBT16_IMPORT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT16_DEL_FLG", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg, false);
      datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime ;
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
      AddObjectProperty("TBT16_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT16_CRT_USER_ID", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id, false);
      AddObjectProperty("TBT16_CRT_PROG_NM", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime ;
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
      AddObjectProperty("TBT16_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT16_UPD_USER_ID", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id, false);
      AddObjectProperty("TBT16_UPD_PROG_NM", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm, false);
      AddObjectProperty("TBT16_UPD_CNT", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT16_IMPORT_HISTORY_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT16_IMPORT_HISTORY_Initialized, false);
         AddObjectProperty("TBT16_IMPORT_NO_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z, false);
         AddObjectProperty("TBT16_IMPORT_FILE_NM_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z, false);
         AddObjectProperty("TBT16_FILE_NM_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
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
         AddObjectProperty("TBT16_IMPORT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT16_DEL_FLG_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
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
         AddObjectProperty("TBT16_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT16_CRT_USER_ID_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z, false);
         AddObjectProperty("TBT16_CRT_PROG_NM_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
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
         AddObjectProperty("TBT16_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT16_UPD_USER_ID_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z, false);
         AddObjectProperty("TBT16_UPD_PROG_NM_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z, false);
         AddObjectProperty("TBT16_UPD_CNT_Z", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z, false);
         AddObjectProperty("TBT16_IMPORT_FILE_NM_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N, false);
         AddObjectProperty("TBT16_FILE_NM_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N, false);
         AddObjectProperty("TBT16_IMPORT_DATETIME_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N, false);
         AddObjectProperty("TBT16_DEL_FLG_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N, false);
         AddObjectProperty("TBT16_CRT_DATETIME_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N, false);
         AddObjectProperty("TBT16_CRT_USER_ID_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N, false);
         AddObjectProperty("TBT16_CRT_PROG_NM_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N, false);
         AddObjectProperty("TBT16_UPD_DATETIME_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N, false);
         AddObjectProperty("TBT16_UPD_USER_ID_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N, false);
         AddObjectProperty("TBT16_UPD_PROG_NM_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N, false);
         AddObjectProperty("TBT16_UPD_CNT_N", gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no( long value )
   {
      if ( gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no != value )
      {
         gxTv_SdtTBT16_IMPORT_HISTORY_Mode = "INS" ;
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no = value ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Mode( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Mode ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Mode( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Mode = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Mode_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT16_IMPORT_HISTORY_Initialized( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Initialized ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Initialized( short value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Initialized = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Initialized_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N( )
   {
      return gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt16_import_history_bc obj ;
      obj = new tbt16_import_history_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Mode = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z = "" ;
      gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT16_IMPORT_HISTORY Clone( )
   {
      SdtTBT16_IMPORT_HISTORY sdt ;
      tbt16_import_history_bc obj ;
      sdt = (SdtTBT16_IMPORT_HISTORY)(clone()) ;
      obj = (tbt16_import_history_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT16_IMPORT_HISTORY struct )
   {
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no(struct.getTbt16_import_no());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm(struct.getTbt16_import_file_nm());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm(struct.getTbt16_file_nm());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime(struct.getTbt16_import_datetime());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg(struct.getTbt16_del_flg());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime(struct.getTbt16_crt_datetime());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id(struct.getTbt16_crt_user_id());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm(struct.getTbt16_crt_prog_nm());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime(struct.getTbt16_upd_datetime());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id(struct.getTbt16_upd_user_id());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm(struct.getTbt16_upd_prog_nm());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt(struct.getTbt16_upd_cnt());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Mode(struct.getMode());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Initialized(struct.getInitialized());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z(struct.getTbt16_import_no_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z(struct.getTbt16_import_file_nm_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z(struct.getTbt16_file_nm_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z(struct.getTbt16_import_datetime_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z(struct.getTbt16_del_flg_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z(struct.getTbt16_crt_datetime_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z(struct.getTbt16_crt_user_id_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z(struct.getTbt16_crt_prog_nm_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z(struct.getTbt16_upd_datetime_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z(struct.getTbt16_upd_user_id_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z(struct.getTbt16_upd_prog_nm_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z(struct.getTbt16_upd_cnt_Z());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N(struct.getTbt16_import_file_nm_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N(struct.getTbt16_file_nm_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N(struct.getTbt16_import_datetime_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N(struct.getTbt16_del_flg_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N(struct.getTbt16_crt_datetime_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N(struct.getTbt16_crt_user_id_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N(struct.getTbt16_crt_prog_nm_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N(struct.getTbt16_upd_datetime_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N(struct.getTbt16_upd_user_id_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N(struct.getTbt16_upd_prog_nm_N());
      setgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N(struct.getTbt16_upd_cnt_N());
   }

   public StructSdtTBT16_IMPORT_HISTORY getStruct( )
   {
      StructSdtTBT16_IMPORT_HISTORY struct = new StructSdtTBT16_IMPORT_HISTORY ();
      struct.setTbt16_import_no(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no());
      struct.setTbt16_import_file_nm(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm());
      struct.setTbt16_file_nm(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm());
      struct.setTbt16_import_datetime(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime());
      struct.setTbt16_del_flg(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg());
      struct.setTbt16_crt_datetime(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime());
      struct.setTbt16_crt_user_id(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id());
      struct.setTbt16_crt_prog_nm(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm());
      struct.setTbt16_upd_datetime(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime());
      struct.setTbt16_upd_user_id(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id());
      struct.setTbt16_upd_prog_nm(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm());
      struct.setTbt16_upd_cnt(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt());
      struct.setMode(getgxTv_SdtTBT16_IMPORT_HISTORY_Mode());
      struct.setInitialized(getgxTv_SdtTBT16_IMPORT_HISTORY_Initialized());
      struct.setTbt16_import_no_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z());
      struct.setTbt16_import_file_nm_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z());
      struct.setTbt16_file_nm_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z());
      struct.setTbt16_import_datetime_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z());
      struct.setTbt16_del_flg_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z());
      struct.setTbt16_crt_datetime_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z());
      struct.setTbt16_crt_user_id_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z());
      struct.setTbt16_crt_prog_nm_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z());
      struct.setTbt16_upd_datetime_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z());
      struct.setTbt16_upd_user_id_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z());
      struct.setTbt16_upd_prog_nm_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z());
      struct.setTbt16_upd_cnt_Z(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z());
      struct.setTbt16_import_file_nm_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N());
      struct.setTbt16_file_nm_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N());
      struct.setTbt16_import_datetime_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N());
      struct.setTbt16_del_flg_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N());
      struct.setTbt16_crt_datetime_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N());
      struct.setTbt16_crt_user_id_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N());
      struct.setTbt16_crt_prog_nm_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N());
      struct.setTbt16_upd_datetime_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N());
      struct.setTbt16_upd_user_id_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N());
      struct.setTbt16_upd_prog_nm_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N());
      struct.setTbt16_upd_cnt_N(getgxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_N ;
   private byte gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_N ;
   private short gxTv_SdtTBT16_IMPORT_HISTORY_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_no_Z ;
   private long gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_cnt_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_datetime_Z ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_import_file_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_file_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_del_flg_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_user_id_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_crt_prog_nm_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_user_id_Z ;
   private String gxTv_SdtTBT16_IMPORT_HISTORY_Tbt16_upd_prog_nm_Z ;
}

