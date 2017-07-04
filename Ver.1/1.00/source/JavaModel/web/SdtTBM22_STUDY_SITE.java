import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBM22_STUDY_SITE extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM22_STUDY_SITE( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM22_STUDY_SITE.class));
   }

   public SdtTBM22_STUDY_SITE( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTBM22_STUDY_SITE");
      initialize( remoteHandle) ;
   }

   public SdtTBM22_STUDY_SITE( int remoteHandle ,
                               StructSdtTBM22_STUDY_SITE struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( long AV197TBM22_STUDY_ID ,
                     String AV198TBM22_SITE_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV197TBM22_STUDY_ID),AV198TBM22_SITE_ID});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_STUDY_ID") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_SITE_ID") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_DEL_FLG") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_USER_ID") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_PROG_NM") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_USER_ID") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_PROG_NM") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_CNT") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_STUDY_ID_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_SITE_ID_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_DEL_FLG_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_CNT_Z") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_DEL_FLG_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM22_UPD_CNT_N") )
            {
               gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "TBM22_STUDY_SITE" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
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
      oWriter.writeElement("TBM22_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_SITE_ID", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime) )
      {
         oWriter.writeStartElement("TBM22_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM22_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM22_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime) )
      {
         oWriter.writeStartElement("TBM22_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM22_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM22_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TBM22_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM22_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM22_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TBM22_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM22_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM22_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM22_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM22_STUDY_ID", gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id);
      AddObjectProperty("TBM22_SITE_ID", gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id);
      AddObjectProperty("TBM22_DEL_FLG", gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM22_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TBM22_CRT_USER_ID", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id);
      AddObjectProperty("TBM22_CRT_PROG_NM", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM22_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBM22_UPD_USER_ID", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id);
      AddObjectProperty("TBM22_UPD_PROG_NM", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm);
      AddObjectProperty("TBM22_UPD_CNT", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTBM22_STUDY_SITE_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBM22_STUDY_SITE_Initialized);
      AddObjectProperty("TBM22_STUDY_ID_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z);
      AddObjectProperty("TBM22_SITE_ID_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z);
      AddObjectProperty("TBM22_DEL_FLG_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM22_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM22_CRT_USER_ID_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z);
      AddObjectProperty("TBM22_CRT_PROG_NM_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM22_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM22_UPD_USER_ID_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z);
      AddObjectProperty("TBM22_UPD_PROG_NM_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z);
      AddObjectProperty("TBM22_UPD_CNT_Z", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z);
      AddObjectProperty("TBM22_DEL_FLG_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N);
      AddObjectProperty("TBM22_CRT_DATETIME_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N);
      AddObjectProperty("TBM22_CRT_USER_ID_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N);
      AddObjectProperty("TBM22_CRT_PROG_NM_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N);
      AddObjectProperty("TBM22_UPD_DATETIME_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N);
      AddObjectProperty("TBM22_UPD_USER_ID_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N);
      AddObjectProperty("TBM22_UPD_PROG_NM_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N);
      AddObjectProperty("TBM22_UPD_CNT_N", gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N);
   }

   public long getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id( long value )
   {
      if ( gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id != value )
      {
         gxTv_SdtTBM22_STUDY_SITE_Mode = "INS" ;
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id = value ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id, value) != 0 )
      {
         gxTv_SdtTBM22_STUDY_SITE_Mode = "INS" ;
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id = value ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Mode( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Mode ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Mode( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Mode = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Mode_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM22_STUDY_SITE_Initialized( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Initialized ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Initialized( short value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Initialized = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Initialized_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N( )
   {
      return gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm22_study_site_bc obj ;
      obj = new tbm22_study_site_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Mode = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z = "" ;
      gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTBM22_STUDY_SITE Clone( )
   {
      SdtTBM22_STUDY_SITE sdt ;
      tbm22_study_site_bc obj ;
      sdt = (SdtTBM22_STUDY_SITE)(clone()) ;
      obj = (tbm22_study_site_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM22_STUDY_SITE struct )
   {
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id(struct.getTbm22_study_id());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id(struct.getTbm22_site_id());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg(struct.getTbm22_del_flg());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime(struct.getTbm22_crt_datetime());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id(struct.getTbm22_crt_user_id());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm(struct.getTbm22_crt_prog_nm());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime(struct.getTbm22_upd_datetime());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id(struct.getTbm22_upd_user_id());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm(struct.getTbm22_upd_prog_nm());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt(struct.getTbm22_upd_cnt());
      setgxTv_SdtTBM22_STUDY_SITE_Mode(struct.getMode());
      setgxTv_SdtTBM22_STUDY_SITE_Initialized(struct.getInitialized());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z(struct.getTbm22_study_id_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z(struct.getTbm22_site_id_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z(struct.getTbm22_del_flg_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z(struct.getTbm22_crt_datetime_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z(struct.getTbm22_crt_user_id_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z(struct.getTbm22_crt_prog_nm_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z(struct.getTbm22_upd_datetime_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z(struct.getTbm22_upd_user_id_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z(struct.getTbm22_upd_prog_nm_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z(struct.getTbm22_upd_cnt_Z());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N(struct.getTbm22_del_flg_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N(struct.getTbm22_crt_datetime_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N(struct.getTbm22_crt_user_id_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N(struct.getTbm22_crt_prog_nm_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N(struct.getTbm22_upd_datetime_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N(struct.getTbm22_upd_user_id_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N(struct.getTbm22_upd_prog_nm_N());
      setgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N(struct.getTbm22_upd_cnt_N());
   }

   public StructSdtTBM22_STUDY_SITE getStruct( )
   {
      StructSdtTBM22_STUDY_SITE struct = new StructSdtTBM22_STUDY_SITE ();
      struct.setTbm22_study_id(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id());
      struct.setTbm22_site_id(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id());
      struct.setTbm22_del_flg(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg());
      struct.setTbm22_crt_datetime(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime());
      struct.setTbm22_crt_user_id(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id());
      struct.setTbm22_crt_prog_nm(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm());
      struct.setTbm22_upd_datetime(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime());
      struct.setTbm22_upd_user_id(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id());
      struct.setTbm22_upd_prog_nm(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm());
      struct.setTbm22_upd_cnt(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt());
      struct.setMode(getgxTv_SdtTBM22_STUDY_SITE_Mode());
      struct.setInitialized(getgxTv_SdtTBM22_STUDY_SITE_Initialized());
      struct.setTbm22_study_id_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z());
      struct.setTbm22_site_id_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z());
      struct.setTbm22_del_flg_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z());
      struct.setTbm22_crt_datetime_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z());
      struct.setTbm22_crt_user_id_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z());
      struct.setTbm22_crt_prog_nm_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z());
      struct.setTbm22_upd_datetime_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z());
      struct.setTbm22_upd_user_id_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z());
      struct.setTbm22_upd_prog_nm_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z());
      struct.setTbm22_upd_cnt_Z(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z());
      struct.setTbm22_del_flg_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N());
      struct.setTbm22_crt_datetime_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N());
      struct.setTbm22_crt_user_id_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N());
      struct.setTbm22_crt_prog_nm_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N());
      struct.setTbm22_upd_datetime_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N());
      struct.setTbm22_upd_user_id_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N());
      struct.setTbm22_upd_prog_nm_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N());
      struct.setTbm22_upd_cnt_N(getgxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_N ;
   private byte gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_N ;
   private short gxTv_SdtTBM22_STUDY_SITE_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_study_id_Z ;
   private long gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_cnt_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_datetime_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_site_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_del_flg_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_user_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_crt_prog_nm_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_user_id_Z ;
   private String gxTv_SdtTBM22_STUDY_SITE_Tbm22_upd_prog_nm_Z ;
}

