/*
               File: SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem
        Description: B_TBM33_CRF_COND
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem( )
   {
      this(  new ModelContext(SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem.class));
   }

   public SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem( ModelContext context )
   {
      super( context, "SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem");
   }

   public SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem");
   }

   public SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem( StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_STUDY_ID") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ID") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NO") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NM") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_EXPRESSION") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_DIV") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ITEM_CD") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_PRIOR_NO") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_DIV") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_MSG") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ENABLED_FLG") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_NUMERIC_RANGE_FLG") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_DEL_FLG") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_USER_ID") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_PROG_NM") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_USER_ID") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_PROG_NM") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_CNT") )
            {
               gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt = GXutil.lval( oReader.getValue()) ;
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
         sName = "B_TBM33_CRF_COND.B_TBM33_CRF_CONDItem" ;
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
      oWriter.writeElement("TBM33_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_COND_NO", GXutil.trim( GXutil.str( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_COND_NM", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_EXPRESSION", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_COND_DIV", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_PRIOR_NO", GXutil.trim( GXutil.str( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_ERR_DIV", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_ERR_MSG", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_ENABLED_FLG", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_NUMERIC_RANGE_FLG", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_DEL_FLG", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime) )
      {
         oWriter.writeStartElement("TBM33_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM33_CRT_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime) )
      {
         oWriter.writeStartElement("TBM33_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM33_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM33_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt, 10, 0)));
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
      AddObjectProperty("TBM33_STUDY_ID", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id, false);
      AddObjectProperty("TBM33_CRF_ID", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id, false);
      AddObjectProperty("TBM33_COND_NO", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no, false);
      AddObjectProperty("TBM33_COND_NM", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm, false);
      AddObjectProperty("TBM33_EXPRESSION", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression, false);
      AddObjectProperty("TBM33_COND_DIV", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div, false);
      AddObjectProperty("TBM33_CRF_ITEM_CD", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd, false);
      AddObjectProperty("TBM33_PRIOR_NO", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no, false);
      AddObjectProperty("TBM33_ERR_DIV", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div, false);
      AddObjectProperty("TBM33_ERR_MSG", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg, false);
      AddObjectProperty("TBM33_ENABLED_FLG", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg, false);
      AddObjectProperty("TBM33_REQUIRED_INPUT_FLG", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg, false);
      AddObjectProperty("TBM33_NUMERIC_RANGE_FLG", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg, false);
      AddObjectProperty("TBM33_DEL_FLG", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg, false);
      datetime_STZ = gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime ;
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
      AddObjectProperty("TBM33_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM33_CRT_USER_ID", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id, false);
      AddObjectProperty("TBM33_CRT_PROG_NM", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime ;
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
      AddObjectProperty("TBM33_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM33_UPD_USER_ID", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id, false);
      AddObjectProperty("TBM33_UPD_PROG_NM", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm, false);
      AddObjectProperty("TBM33_UPD_CNT", gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt, false);
   }

   public long getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id( long value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id = value ;
   }

   public short getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id = value ;
   }

   public short getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd = value ;
   }

   public short getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no( short value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id = value ;
   }

   public String getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm = value ;
   }

   public long getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt( )
   {
      return gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt ;
   }

   public void setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt( long value )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id = "" ;
      gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem Clone( )
   {
      return (SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem)(clone()) ;
   }

   public void setStruct( StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem struct )
   {
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id(struct.getTbm33_study_id());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id(struct.getTbm33_crf_id());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no(struct.getTbm33_cond_no());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm(struct.getTbm33_cond_nm());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression(struct.getTbm33_expression());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div(struct.getTbm33_cond_div());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd(struct.getTbm33_crf_item_cd());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no(struct.getTbm33_prior_no());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div(struct.getTbm33_err_div());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg(struct.getTbm33_err_msg());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg(struct.getTbm33_enabled_flg());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg(struct.getTbm33_required_input_flg());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg(struct.getTbm33_numeric_range_flg());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg(struct.getTbm33_del_flg());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime(struct.getTbm33_crt_datetime());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id(struct.getTbm33_crt_user_id());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm(struct.getTbm33_crt_prog_nm());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime(struct.getTbm33_upd_datetime());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id(struct.getTbm33_upd_user_id());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm(struct.getTbm33_upd_prog_nm());
      setgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt(struct.getTbm33_upd_cnt());
   }

   public StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem getStruct( )
   {
      StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem struct = new StructSdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem ();
      struct.setTbm33_study_id(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id());
      struct.setTbm33_crf_id(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id());
      struct.setTbm33_cond_no(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no());
      struct.setTbm33_cond_nm(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm());
      struct.setTbm33_expression(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression());
      struct.setTbm33_cond_div(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div());
      struct.setTbm33_crf_item_cd(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd());
      struct.setTbm33_prior_no(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no());
      struct.setTbm33_err_div(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div());
      struct.setTbm33_err_msg(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg());
      struct.setTbm33_enabled_flg(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg());
      struct.setTbm33_required_input_flg(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg());
      struct.setTbm33_numeric_range_flg(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg());
      struct.setTbm33_del_flg(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg());
      struct.setTbm33_crt_datetime(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime());
      struct.setTbm33_crt_user_id(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id());
      struct.setTbm33_crt_prog_nm(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm());
      struct.setTbm33_upd_datetime(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime());
      struct.setTbm33_upd_user_id(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id());
      struct.setTbm33_upd_prog_nm(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm());
      struct.setTbm33_upd_cnt(getgxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt());
      return struct ;
   }

   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_id ;
   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_no ;
   protected short gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_prior_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_study_id ;
   protected long gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_datetime ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_nm ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_expression ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_cond_div ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crf_item_cd ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_div ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_err_msg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_enabled_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_required_input_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_numeric_range_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_del_flg ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_user_id ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_crt_prog_nm ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_user_id ;
   protected String gxTv_SdtB_TBM33_CRF_COND_B_TBM33_CRF_CONDItem_Tbm33_upd_prog_nm ;
}

