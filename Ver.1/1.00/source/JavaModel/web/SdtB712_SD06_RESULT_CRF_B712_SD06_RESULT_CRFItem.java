import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem( )
   {
      this(  new ModelContext(SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem.class));
   }

   public SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem( ModelContext context )
   {
      super( context, "SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem");
   }

   public SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem");
   }

   public SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem( StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem struct )
   {
      this();
      setStruct(struct);
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SEL_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SUBJECT_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_LATEST_VERSION") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_INPUT_LEVEL") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_USER_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPLOAD_AUTH_CD") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_INPUT_END_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_DM_ARRIVAL_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SITE_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_SNM") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_ORDER") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_CNT") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_UPD_USER_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UPD_USER_DISP_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "B712_SD06_RESULT_CRF.B712_SD06_RESULT_CRFItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPLOAD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPLOAD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPLOAD_USER_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime) )
      {
         oWriter.writeStartElement("TBT02_DM_ARRIVAL_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_DM_ARRIVAL_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT01_SITE_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_SNM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM31_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBT02_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime) )
      {
         oWriter.writeStartElement("TBT02_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBT02_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("UPD_USER_DISP_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("SEL_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg);
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPLOAD_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_UPLOAD_USER_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id);
      AddObjectProperty("TBT02_UPLOAD_AUTH_CD", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd);
      AddObjectProperty("TBT02_INPUT_END_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME", sDateCnv);
      AddObjectProperty("TBT01_SITE_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id);
      AddObjectProperty("TAM08_SITE_SNM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm);
      AddObjectProperty("TBM31_CRF_SNM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm);
      AddObjectProperty("TBM31_ORDER", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm);
      AddObjectProperty("TBT02_UPD_CNT", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT02_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBT02_UPD_USER_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id);
      AddObjectProperty("UPD_USER_DISP_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg);
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg = false ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id = 0 ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version = (short)(0) ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level = (byte)(0) ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order = 0 ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( long value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg = value ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg_SetNull( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg = false ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem Clone( )
   {
      return (SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem struct )
   {
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id(struct.getTbt02_subject_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id(struct.getTbt02_crf_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(struct.getTbt02_crf_latest_version());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level(struct.getTbt02_crf_input_level());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime(struct.getTbt02_upload_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id(struct.getTbt02_upload_user_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd(struct.getTbt02_upload_auth_cd());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(struct.getTbt02_input_end_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(struct.getTbt02_dm_arrival_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime(struct.getTbt02_dm_arrival_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id(struct.getTbt01_site_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm(struct.getTam08_site_snm());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm(struct.getTbm31_crf_snm());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order(struct.getTbm31_order());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm(struct.getTam07_user_nm());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt(struct.getTbt02_upd_cnt());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime(struct.getTbt02_upd_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id(struct.getTbt02_upd_user_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg(struct.getUpd_user_disp_flg());
   }

   public StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem getStruct( )
   {
      StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem struct = new StructSdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem ();
      struct.setSel_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg());
      struct.setTbt02_subject_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id());
      struct.setTbt02_crf_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id());
      struct.setTbt02_crf_latest_version(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version());
      struct.setTbt02_crf_input_level(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level());
      struct.setTbt02_upload_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime());
      struct.setTbt02_upload_user_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id());
      struct.setTbt02_upload_auth_cd(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd());
      struct.setTbt02_input_end_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg());
      struct.setTbt02_dm_arrival_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg());
      struct.setTbt02_dm_arrival_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime());
      struct.setTbt01_site_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id());
      struct.setTam08_site_snm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm());
      struct.setTbm31_crf_snm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm());
      struct.setTbm31_order(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order());
      struct.setTam07_user_nm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm());
      struct.setTbt02_upd_cnt(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt());
      struct.setTbt02_upd_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime());
      struct.setTbt02_upd_user_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id());
      struct.setUpd_user_disp_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg());
      return struct ;
   }

   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   protected long gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
}

