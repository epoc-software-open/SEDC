/*
               File: SdtTBM45_CRF_FILETR
        Description: CRF�t�B���^�[�}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:25.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM45_CRF_FILETR extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM45_CRF_FILETR( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM45_CRF_FILETR.class));
   }

   public SdtTBM45_CRF_FILETR( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTBM45_CRF_FILETR");
      initialize( remoteHandle) ;
   }

   public SdtTBM45_CRF_FILETR( int remoteHandle ,
                               StructSdtTBM45_CRF_FILETR struct )
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

   public void Load( long AV977TBM45_STUDY_ID ,
                     short AV978TBM45_FILTER_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV977TBM45_STUDY_ID),new Short(AV978TBM45_FILTER_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM45_STUDY_ID", long.class}, new Object[]{"TBM45_FILTER_NO", short.class}}) ;
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
      metadata.set("Name", "TBM45_CRF_FILETR");
      metadata.set("BT", "TBM45_CRF_FILETR");
      metadata.set("PK", "[ \"TBM45_STUDY_ID\",\"TBM45_FILTER_NO\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_STUDY_ID") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_FILTER_NO") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_FILETR_NM") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_IN_CRF_ID") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_DEL_FLG") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_USER_ID") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_PROG_NM") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_USER_ID") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_PROG_NM") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_CNT") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_STUDY_ID_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_FILTER_NO_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_FILETR_NM_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_IN_CRF_ID_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_DEL_FLG_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_CNT_Z") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_FILETR_NM_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_IN_CRF_ID_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_DEL_FLG_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM45_UPD_CNT_N") )
            {
               gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM45_CRF_FILETR" ;
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
      oWriter.writeElement("TBM45_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_FILTER_NO", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_FILETR_NM", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_IN_CRF_ID", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime) )
      {
         oWriter.writeStartElement("TBM45_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM45_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM45_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime) )
      {
         oWriter.writeStartElement("TBM45_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM45_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM45_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM45_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_FILTER_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_FILETR_NM_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_IN_CRF_ID_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM45_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM45_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM45_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM45_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM45_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM45_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_FILETR_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_IN_CRF_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM45_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBM45_STUDY_ID", gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id, false);
      AddObjectProperty("TBM45_FILTER_NO", gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no, false);
      AddObjectProperty("TBM45_FILETR_NM", gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm, false);
      AddObjectProperty("TBM45_IN_CRF_ID", gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id, false);
      AddObjectProperty("TBM45_DEL_FLG", gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg, false);
      datetime_STZ = gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime ;
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
      AddObjectProperty("TBM45_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM45_CRT_USER_ID", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id, false);
      AddObjectProperty("TBM45_CRT_PROG_NM", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime ;
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
      AddObjectProperty("TBM45_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM45_UPD_USER_ID", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id, false);
      AddObjectProperty("TBM45_UPD_PROG_NM", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm, false);
      AddObjectProperty("TBM45_UPD_CNT", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM45_CRF_FILETR_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM45_CRF_FILETR_Initialized, false);
         AddObjectProperty("TBM45_STUDY_ID_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z, false);
         AddObjectProperty("TBM45_FILTER_NO_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z, false);
         AddObjectProperty("TBM45_FILETR_NM_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z, false);
         AddObjectProperty("TBM45_IN_CRF_ID_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z, false);
         AddObjectProperty("TBM45_DEL_FLG_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z ;
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
         AddObjectProperty("TBM45_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM45_CRT_USER_ID_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z, false);
         AddObjectProperty("TBM45_CRT_PROG_NM_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z ;
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
         AddObjectProperty("TBM45_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM45_UPD_USER_ID_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z, false);
         AddObjectProperty("TBM45_UPD_PROG_NM_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z, false);
         AddObjectProperty("TBM45_UPD_CNT_Z", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z, false);
         AddObjectProperty("TBM45_FILETR_NM_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N, false);
         AddObjectProperty("TBM45_IN_CRF_ID_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N, false);
         AddObjectProperty("TBM45_DEL_FLG_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N, false);
         AddObjectProperty("TBM45_CRT_DATETIME_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N, false);
         AddObjectProperty("TBM45_CRT_USER_ID_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N, false);
         AddObjectProperty("TBM45_CRT_PROG_NM_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N, false);
         AddObjectProperty("TBM45_UPD_DATETIME_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N, false);
         AddObjectProperty("TBM45_UPD_USER_ID_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N, false);
         AddObjectProperty("TBM45_UPD_PROG_NM_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N, false);
         AddObjectProperty("TBM45_UPD_CNT_N", gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id( long value )
   {
      if ( gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id != value )
      {
         gxTv_SdtTBM45_CRF_FILETR_Mode = "INS" ;
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id = value ;
   }

   public short getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no( short value )
   {
      if ( gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no != value )
      {
         gxTv_SdtTBM45_CRF_FILETR_Mode = "INS" ;
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no = value ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt( long value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Mode( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Mode ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Mode( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Mode = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Mode_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM45_CRF_FILETR_Initialized( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Initialized ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Initialized( short value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Initialized = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Initialized_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z( long value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z( short value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N( )
   {
      return gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm45_crf_filetr_bc obj ;
      obj = new tbm45_crf_filetr_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Mode = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z = "" ;
      gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM45_CRF_FILETR Clone( )
   {
      SdtTBM45_CRF_FILETR sdt ;
      tbm45_crf_filetr_bc obj ;
      sdt = (SdtTBM45_CRF_FILETR)(clone()) ;
      obj = (tbm45_crf_filetr_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM45_CRF_FILETR struct )
   {
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id(struct.getTbm45_study_id());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no(struct.getTbm45_filter_no());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm(struct.getTbm45_filetr_nm());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id(struct.getTbm45_in_crf_id());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg(struct.getTbm45_del_flg());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime(struct.getTbm45_crt_datetime());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id(struct.getTbm45_crt_user_id());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm(struct.getTbm45_crt_prog_nm());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime(struct.getTbm45_upd_datetime());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id(struct.getTbm45_upd_user_id());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm(struct.getTbm45_upd_prog_nm());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt(struct.getTbm45_upd_cnt());
      setgxTv_SdtTBM45_CRF_FILETR_Mode(struct.getMode());
      setgxTv_SdtTBM45_CRF_FILETR_Initialized(struct.getInitialized());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z(struct.getTbm45_study_id_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z(struct.getTbm45_filter_no_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z(struct.getTbm45_filetr_nm_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z(struct.getTbm45_in_crf_id_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z(struct.getTbm45_del_flg_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z(struct.getTbm45_crt_datetime_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z(struct.getTbm45_crt_user_id_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z(struct.getTbm45_crt_prog_nm_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z(struct.getTbm45_upd_datetime_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z(struct.getTbm45_upd_user_id_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z(struct.getTbm45_upd_prog_nm_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z(struct.getTbm45_upd_cnt_Z());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N(struct.getTbm45_filetr_nm_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N(struct.getTbm45_in_crf_id_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N(struct.getTbm45_del_flg_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N(struct.getTbm45_crt_datetime_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N(struct.getTbm45_crt_user_id_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N(struct.getTbm45_crt_prog_nm_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N(struct.getTbm45_upd_datetime_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N(struct.getTbm45_upd_user_id_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N(struct.getTbm45_upd_prog_nm_N());
      setgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N(struct.getTbm45_upd_cnt_N());
   }

   public StructSdtTBM45_CRF_FILETR getStruct( )
   {
      StructSdtTBM45_CRF_FILETR struct = new StructSdtTBM45_CRF_FILETR ();
      struct.setTbm45_study_id(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id());
      struct.setTbm45_filter_no(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no());
      struct.setTbm45_filetr_nm(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm());
      struct.setTbm45_in_crf_id(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id());
      struct.setTbm45_del_flg(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg());
      struct.setTbm45_crt_datetime(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime());
      struct.setTbm45_crt_user_id(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id());
      struct.setTbm45_crt_prog_nm(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm());
      struct.setTbm45_upd_datetime(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime());
      struct.setTbm45_upd_user_id(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id());
      struct.setTbm45_upd_prog_nm(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm());
      struct.setTbm45_upd_cnt(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt());
      struct.setMode(getgxTv_SdtTBM45_CRF_FILETR_Mode());
      struct.setInitialized(getgxTv_SdtTBM45_CRF_FILETR_Initialized());
      struct.setTbm45_study_id_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z());
      struct.setTbm45_filter_no_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z());
      struct.setTbm45_filetr_nm_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z());
      struct.setTbm45_in_crf_id_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z());
      struct.setTbm45_del_flg_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z());
      struct.setTbm45_crt_datetime_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z());
      struct.setTbm45_crt_user_id_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z());
      struct.setTbm45_crt_prog_nm_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z());
      struct.setTbm45_upd_datetime_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z());
      struct.setTbm45_upd_user_id_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z());
      struct.setTbm45_upd_prog_nm_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z());
      struct.setTbm45_upd_cnt_Z(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z());
      struct.setTbm45_filetr_nm_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N());
      struct.setTbm45_in_crf_id_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N());
      struct.setTbm45_del_flg_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N());
      struct.setTbm45_crt_datetime_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N());
      struct.setTbm45_crt_user_id_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N());
      struct.setTbm45_crt_prog_nm_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N());
      struct.setTbm45_upd_datetime_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N());
      struct.setTbm45_upd_user_id_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N());
      struct.setTbm45_upd_prog_nm_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N());
      struct.setTbm45_upd_cnt_N(getgxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_N ;
   private byte gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_N ;
   private short gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no ;
   private short gxTv_SdtTBM45_CRF_FILETR_Initialized ;
   private short gxTv_SdtTBM45_CRF_FILETR_Tbm45_filter_no_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id ;
   private long gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt ;
   private long gxTv_SdtTBM45_CRF_FILETR_Tbm45_study_id_Z ;
   private long gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_cnt_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime ;
   private java.util.Date gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime ;
   private java.util.Date gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_filetr_nm_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_in_crf_id_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_del_flg_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_user_id_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_crt_prog_nm_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_user_id_Z ;
   private String gxTv_SdtTBM45_CRF_FILETR_Tbm45_upd_prog_nm_Z ;
}

