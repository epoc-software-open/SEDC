/*
               File: SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem
        Description: B712_SD06_RESULT_CRF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

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

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_CRF_EDA_NO") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SIGNATURE_USER_ID") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SIGNATURE_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT02_SIGNATURE_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg = oReader.getValue() ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_FLG") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_MAX") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VISIT_NO") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REPEAR_MAX") )
            {
               gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B712_SD06_RESULT_CRF.B712_SD06_RESULT_CRFItem" ;
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
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_LATEST_VERSION", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_CRF_INPUT_LEVEL", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
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
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_UPLOAD_USER_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_INPUT_END_FLG", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
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
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_SIGNATURE_USER_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime) )
      {
         oWriter.writeStartElement("TBT02_SIGNATURE_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT02_SIGNATURE_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_SIGNATURE_FLG", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_SITE_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM08_SITE_SNM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_REPEAT_FLG", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_REPEAT_MAX", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REPEAR_MAX", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT02_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
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
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT02_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("UPD_USER_DISP_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("SEL_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg, false);
      AddObjectProperty("TBT02_SUBJECT_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id, false);
      AddObjectProperty("TBT02_CRF_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id, false);
      AddObjectProperty("TBT02_CRF_EDA_NO", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no, false);
      AddObjectProperty("TBT02_CRF_LATEST_VERSION", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version, false);
      AddObjectProperty("TBT02_CRF_INPUT_LEVEL", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level, false);
      datetime_STZ = gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
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
      AddObjectProperty("TBT02_UPLOAD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_UPLOAD_USER_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id, false);
      AddObjectProperty("TBT02_UPLOAD_AUTH_CD", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd, false);
      AddObjectProperty("TBT02_INPUT_END_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg, false);
      AddObjectProperty("TBT02_DM_ARRIVAL_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg, false);
      datetime_STZ = gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
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
      AddObjectProperty("TBT02_DM_ARRIVAL_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_SIGNATURE_USER_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id, false);
      datetime_STZ = gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime ;
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
      AddObjectProperty("TBT02_SIGNATURE_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_SIGNATURE_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg, false);
      AddObjectProperty("TBT01_SITE_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id, false);
      AddObjectProperty("TAM08_SITE_SNM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm, false);
      AddObjectProperty("TBM31_CRF_SNM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm, false);
      AddObjectProperty("TBM31_ORDER", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order, false);
      AddObjectProperty("TBM31_REPEAT_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg, false);
      AddObjectProperty("TBM31_REPEAT_MAX", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max, false);
      AddObjectProperty("VISIT_NO", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no, false);
      AddObjectProperty("REPEAR_MAX", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max, false);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm, false);
      AddObjectProperty("TBT02_UPD_CNT", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt, false);
      datetime_STZ = gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
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
      AddObjectProperty("TBT02_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT02_UPD_USER_ID", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id, false);
      AddObjectProperty("UPD_USER_DISP_FLG", gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg, false);
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg = value ;
   }

   public int getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id = value ;
   }

   public short getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id = value ;
   }

   public byte getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no = value ;
   }

   public short getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version = value ;
   }

   public byte getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level = value ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg = value ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id = value ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = value ;
   }

   public int getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order = value ;
   }

   public byte getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg = value ;
   }

   public byte getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max( byte value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max = value ;
   }

   public int getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no( int value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no = value ;
   }

   public short getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max( short value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = value ;
   }

   public long getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt( long value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt = value ;
   }

   public java.util.Date getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = value ;
   }

   public String getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id( String value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = value ;
   }

   public boolean getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( )
   {
      return gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   }

   public void setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg( boolean value )
   {
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg = value ;
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
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm = "" ;
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
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
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no(struct.getTbt02_crf_eda_no());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version(struct.getTbt02_crf_latest_version());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level(struct.getTbt02_crf_input_level());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime(struct.getTbt02_upload_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id(struct.getTbt02_upload_user_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd(struct.getTbt02_upload_auth_cd());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg(struct.getTbt02_input_end_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg(struct.getTbt02_dm_arrival_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime(struct.getTbt02_dm_arrival_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id(struct.getTbt02_signature_user_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime(struct.getTbt02_signature_datetime());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg(struct.getTbt02_signature_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id(struct.getTbt01_site_id());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm(struct.getTam08_site_snm());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm(struct.getTbm31_crf_snm());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order(struct.getTbm31_order());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg(struct.getTbm31_repeat_flg());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max(struct.getTbm31_repeat_max());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no(struct.getVisit_no());
      setgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max(struct.getRepear_max());
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
      struct.setTbt02_crf_eda_no(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no());
      struct.setTbt02_crf_latest_version(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version());
      struct.setTbt02_crf_input_level(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level());
      struct.setTbt02_upload_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime());
      struct.setTbt02_upload_user_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id());
      struct.setTbt02_upload_auth_cd(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd());
      struct.setTbt02_input_end_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg());
      struct.setTbt02_dm_arrival_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg());
      struct.setTbt02_dm_arrival_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime());
      struct.setTbt02_signature_user_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id());
      struct.setTbt02_signature_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime());
      struct.setTbt02_signature_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg());
      struct.setTbt01_site_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id());
      struct.setTam08_site_snm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm());
      struct.setTbm31_crf_snm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm());
      struct.setTbm31_order(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order());
      struct.setTbm31_repeat_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg());
      struct.setTbm31_repeat_max(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max());
      struct.setVisit_no(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no());
      struct.setRepear_max(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max());
      struct.setTam07_user_nm(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm());
      struct.setTbt02_upd_cnt(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt());
      struct.setTbt02_upd_datetime(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime());
      struct.setTbt02_upd_user_id(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id());
      struct.setUpd_user_disp_flg(getgxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg());
      return struct ;
   }

   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_eda_no ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_input_level ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_flg ;
   protected byte gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_repeat_max ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_id ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_crf_latest_version ;
   protected short gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Repear_max ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_subject_id ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_order ;
   protected int gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Visit_no ;
   protected long gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_datetime ;
   protected java.util.Date gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_datetime ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Sel_flg ;
   protected boolean gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Upd_user_disp_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_user_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upload_auth_cd ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_input_end_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_dm_arrival_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_user_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_signature_flg ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt01_site_id ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam08_site_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbm31_crf_snm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tam07_user_nm ;
   protected String gxTv_SdtB712_SD06_RESULT_CRF_B712_SD06_RESULT_CRFItem_Tbt02_upd_user_id ;
}

