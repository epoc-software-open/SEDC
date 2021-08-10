/*
               File: SdtTBM34_CRF_AUTH
        Description: CRFå†å¿É}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:45.18
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM34_CRF_AUTH extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM34_CRF_AUTH( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM34_CRF_AUTH.class));
   }

   public SdtTBM34_CRF_AUTH( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBM34_CRF_AUTH");
      initialize( remoteHandle) ;
   }

   public SdtTBM34_CRF_AUTH( int remoteHandle ,
                             StructSdtTBM34_CRF_AUTH struct )
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

   public void Load( long AV28TBM34_STUDY_ID ,
                     short AV29TBM34_CRF_ID ,
                     String AV30TBM34_STYDY_AUTH_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV28TBM34_STUDY_ID),new Short(AV29TBM34_CRF_ID),AV30TBM34_STYDY_AUTH_CD});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM34_STUDY_ID", long.class}, new Object[]{"TBM34_CRF_ID", short.class}, new Object[]{"TBM34_STYDY_AUTH_CD", String.class}}) ;
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
      metadata.set("Name", "TBM34_CRF_AUTH");
      metadata.set("BT", "TBM34_CRF_AUTH");
      metadata.set("PK", "[ \"TBM34_STUDY_ID\",\"TBM34_CRF_ID\",\"TBM34_STYDY_AUTH_CD\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_STUDY_ID") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRF_ID") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_STYDY_AUTH_CD") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DISPLAY_FLG") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DEL_FLG") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_USER_ID") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_PROG_NM") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_USER_ID") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_PROG_NM") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_CNT") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_STUDY_ID_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRF_ID_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_STYDY_AUTH_CD_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DISPLAY_FLG_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DEL_FLG_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_CNT_Z") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DISPLAY_FLG_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_DEL_FLG_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM34_UPD_CNT_N") )
            {
               gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM34_CRF_AUTH" ;
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
      oWriter.writeElement("TBM34_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_STYDY_AUTH_CD", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_DISPLAY_FLG", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime) )
      {
         oWriter.writeStartElement("TBM34_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM34_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM34_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime) )
      {
         oWriter.writeStartElement("TBM34_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM34_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM34_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM34_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_STYDY_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_DISPLAY_FLG_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM34_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM34_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM34_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM34_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM34_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM34_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_DISPLAY_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM34_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBM34_STUDY_ID", gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id, false);
      AddObjectProperty("TBM34_CRF_ID", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id, false);
      AddObjectProperty("TBM34_STYDY_AUTH_CD", gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd, false);
      AddObjectProperty("TBM34_DISPLAY_FLG", gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg, false);
      AddObjectProperty("TBM34_DEL_FLG", gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg, false);
      datetime_STZ = gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime ;
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
      AddObjectProperty("TBM34_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM34_CRT_USER_ID", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id, false);
      AddObjectProperty("TBM34_CRT_PROG_NM", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime ;
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
      AddObjectProperty("TBM34_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM34_UPD_USER_ID", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id, false);
      AddObjectProperty("TBM34_UPD_PROG_NM", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm, false);
      AddObjectProperty("TBM34_UPD_CNT", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM34_CRF_AUTH_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM34_CRF_AUTH_Initialized, false);
         AddObjectProperty("TBM34_STUDY_ID_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z, false);
         AddObjectProperty("TBM34_CRF_ID_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z, false);
         AddObjectProperty("TBM34_STYDY_AUTH_CD_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z, false);
         AddObjectProperty("TBM34_DISPLAY_FLG_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z, false);
         AddObjectProperty("TBM34_DEL_FLG_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z ;
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
         AddObjectProperty("TBM34_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM34_CRT_USER_ID_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z, false);
         AddObjectProperty("TBM34_CRT_PROG_NM_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z ;
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
         AddObjectProperty("TBM34_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM34_UPD_USER_ID_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z, false);
         AddObjectProperty("TBM34_UPD_PROG_NM_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z, false);
         AddObjectProperty("TBM34_UPD_CNT_Z", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z, false);
         AddObjectProperty("TBM34_DISPLAY_FLG_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N, false);
         AddObjectProperty("TBM34_DEL_FLG_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N, false);
         AddObjectProperty("TBM34_CRT_DATETIME_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N, false);
         AddObjectProperty("TBM34_CRT_USER_ID_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N, false);
         AddObjectProperty("TBM34_CRT_PROG_NM_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N, false);
         AddObjectProperty("TBM34_UPD_DATETIME_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N, false);
         AddObjectProperty("TBM34_UPD_USER_ID_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N, false);
         AddObjectProperty("TBM34_UPD_PROG_NM_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N, false);
         AddObjectProperty("TBM34_UPD_CNT_N", gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id( long value )
   {
      if ( gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id != value )
      {
         gxTv_SdtTBM34_CRF_AUTH_Mode = "INS" ;
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id = value ;
   }

   public short getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id( short value )
   {
      if ( gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id != value )
      {
         gxTv_SdtTBM34_CRF_AUTH_Mode = "INS" ;
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id = value ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd, value) != 0 )
      {
         gxTv_SdtTBM34_CRF_AUTH_Mode = "INS" ;
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd = value ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt( long value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Mode( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Mode ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Mode( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Mode = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Mode_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM34_CRF_AUTH_Initialized( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Initialized ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Initialized( short value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Initialized = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Initialized_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z( long value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z( short value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N( )
   {
      return gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm34_crf_auth_bc obj ;
      obj = new tbm34_crf_auth_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Mode = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z = "" ;
      gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM34_CRF_AUTH Clone( )
   {
      SdtTBM34_CRF_AUTH sdt ;
      tbm34_crf_auth_bc obj ;
      sdt = (SdtTBM34_CRF_AUTH)(clone()) ;
      obj = (tbm34_crf_auth_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM34_CRF_AUTH struct )
   {
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id(struct.getTbm34_study_id());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id(struct.getTbm34_crf_id());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd(struct.getTbm34_stydy_auth_cd());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg(struct.getTbm34_display_flg());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg(struct.getTbm34_del_flg());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime(struct.getTbm34_crt_datetime());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id(struct.getTbm34_crt_user_id());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm(struct.getTbm34_crt_prog_nm());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime(struct.getTbm34_upd_datetime());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id(struct.getTbm34_upd_user_id());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm(struct.getTbm34_upd_prog_nm());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt(struct.getTbm34_upd_cnt());
      setgxTv_SdtTBM34_CRF_AUTH_Mode(struct.getMode());
      setgxTv_SdtTBM34_CRF_AUTH_Initialized(struct.getInitialized());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z(struct.getTbm34_study_id_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z(struct.getTbm34_crf_id_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z(struct.getTbm34_stydy_auth_cd_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z(struct.getTbm34_display_flg_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z(struct.getTbm34_del_flg_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z(struct.getTbm34_crt_datetime_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z(struct.getTbm34_crt_user_id_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z(struct.getTbm34_crt_prog_nm_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z(struct.getTbm34_upd_datetime_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z(struct.getTbm34_upd_user_id_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z(struct.getTbm34_upd_prog_nm_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z(struct.getTbm34_upd_cnt_Z());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N(struct.getTbm34_display_flg_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N(struct.getTbm34_del_flg_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N(struct.getTbm34_crt_datetime_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N(struct.getTbm34_crt_user_id_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N(struct.getTbm34_crt_prog_nm_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N(struct.getTbm34_upd_datetime_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N(struct.getTbm34_upd_user_id_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N(struct.getTbm34_upd_prog_nm_N());
      setgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N(struct.getTbm34_upd_cnt_N());
   }

   public StructSdtTBM34_CRF_AUTH getStruct( )
   {
      StructSdtTBM34_CRF_AUTH struct = new StructSdtTBM34_CRF_AUTH ();
      struct.setTbm34_study_id(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id());
      struct.setTbm34_crf_id(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id());
      struct.setTbm34_stydy_auth_cd(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd());
      struct.setTbm34_display_flg(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg());
      struct.setTbm34_del_flg(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg());
      struct.setTbm34_crt_datetime(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime());
      struct.setTbm34_crt_user_id(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id());
      struct.setTbm34_crt_prog_nm(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm());
      struct.setTbm34_upd_datetime(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime());
      struct.setTbm34_upd_user_id(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id());
      struct.setTbm34_upd_prog_nm(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm());
      struct.setTbm34_upd_cnt(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt());
      struct.setMode(getgxTv_SdtTBM34_CRF_AUTH_Mode());
      struct.setInitialized(getgxTv_SdtTBM34_CRF_AUTH_Initialized());
      struct.setTbm34_study_id_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z());
      struct.setTbm34_crf_id_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z());
      struct.setTbm34_stydy_auth_cd_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z());
      struct.setTbm34_display_flg_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z());
      struct.setTbm34_del_flg_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z());
      struct.setTbm34_crt_datetime_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z());
      struct.setTbm34_crt_user_id_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z());
      struct.setTbm34_crt_prog_nm_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z());
      struct.setTbm34_upd_datetime_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z());
      struct.setTbm34_upd_user_id_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z());
      struct.setTbm34_upd_prog_nm_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z());
      struct.setTbm34_upd_cnt_Z(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z());
      struct.setTbm34_display_flg_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N());
      struct.setTbm34_del_flg_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N());
      struct.setTbm34_crt_datetime_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N());
      struct.setTbm34_crt_user_id_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N());
      struct.setTbm34_crt_prog_nm_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N());
      struct.setTbm34_upd_datetime_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N());
      struct.setTbm34_upd_user_id_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N());
      struct.setTbm34_upd_prog_nm_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N());
      struct.setTbm34_upd_cnt_N(getgxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_N ;
   private byte gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_N ;
   private short gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id ;
   private short gxTv_SdtTBM34_CRF_AUTH_Initialized ;
   private short gxTv_SdtTBM34_CRF_AUTH_Tbm34_crf_id_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_study_id_Z ;
   private long gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_cnt_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_stydy_auth_cd_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_display_flg_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_del_flg_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_user_id_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_crt_prog_nm_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_user_id_Z ;
   private String gxTv_SdtTBM34_CRF_AUTH_Tbm34_upd_prog_nm_Z ;
}

