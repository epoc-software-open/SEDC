import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem( )
   {
      this(  new ModelContext(SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem.class));
   }

   public SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem( ModelContext context )
   {
      super( context, "SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem");
   }

   public SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem");
   }

   public SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem( StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_STUDY_ID") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_CRF_ID") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_COND_NO") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_SELECT_CRF_ID") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_DEL_FLG") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_CRT_USER_ID") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_CRT_PROG_NM") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_UPD_USER_ID") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_UPD_PROG_NM") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM36_UPD_CNT") )
            {
               gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt = GXutil.lval( oReader.getValue()) ;
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
         sName = "B_TBM36_CRF_SELECT.B_TBM36_CRF_SELECTItem" ;
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
      oWriter.writeElement("TBM36_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_COND_NO", GXutil.trim( GXutil.str( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_SELECT_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_DEL_FLG", GXutil.rtrim( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime) )
      {
         oWriter.writeStartElement("TBM36_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM36_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM36_CRT_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime) )
      {
         oWriter.writeStartElement("TBM36_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM36_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM36_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM36_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM36_STUDY_ID", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id);
      AddObjectProperty("TBM36_CRF_ID", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id);
      AddObjectProperty("TBM36_COND_NO", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no);
      AddObjectProperty("TBM36_SELECT_CRF_ID", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id);
      AddObjectProperty("TBM36_DEL_FLG", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM36_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TBM36_CRT_USER_ID", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id);
      AddObjectProperty("TBM36_CRT_PROG_NM", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM36_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBM36_UPD_USER_ID", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id);
      AddObjectProperty("TBM36_UPD_PROG_NM", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm);
      AddObjectProperty("TBM36_UPD_CNT", gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt);
   }

   public long getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id( long value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id = 0 ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no = (short)(0) ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id( short value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = "" ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt( )
   {
      return gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt( long value )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt = value ;
   }

   public void setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt_SetNull( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id = "" ;
      gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem Clone( )
   {
      return (SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem)(clone()) ;
   }

   public void setStruct( StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem struct )
   {
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id(struct.getTbm36_study_id());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id(struct.getTbm36_crf_id());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no(struct.getTbm36_cond_no());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id(struct.getTbm36_select_crf_id());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg(struct.getTbm36_del_flg());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime(struct.getTbm36_crt_datetime());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id(struct.getTbm36_crt_user_id());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm(struct.getTbm36_crt_prog_nm());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime(struct.getTbm36_upd_datetime());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id(struct.getTbm36_upd_user_id());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm(struct.getTbm36_upd_prog_nm());
      setgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt(struct.getTbm36_upd_cnt());
   }

   public StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem getStruct( )
   {
      StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem struct = new StructSdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem ();
      struct.setTbm36_study_id(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id());
      struct.setTbm36_crf_id(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id());
      struct.setTbm36_cond_no(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no());
      struct.setTbm36_select_crf_id(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id());
      struct.setTbm36_del_flg(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg());
      struct.setTbm36_crt_datetime(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime());
      struct.setTbm36_crt_user_id(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id());
      struct.setTbm36_crt_prog_nm(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm());
      struct.setTbm36_upd_datetime(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime());
      struct.setTbm36_upd_user_id(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id());
      struct.setTbm36_upd_prog_nm(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm());
      struct.setTbm36_upd_cnt(getgxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt());
      return struct ;
   }

   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crf_id ;
   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_cond_no ;
   protected short gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_select_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_study_id ;
   protected long gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_datetime ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_del_flg ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_user_id ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_crt_prog_nm ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_user_id ;
   protected String gxTv_SdtB_TBM36_CRF_SELECT_B_TBM36_CRF_SELECTItem_Tbm36_upd_prog_nm ;
}

