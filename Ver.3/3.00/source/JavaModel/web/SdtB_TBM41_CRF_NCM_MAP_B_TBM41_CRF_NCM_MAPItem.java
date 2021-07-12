/*
               File: SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem
        Description: B_TBM41_CRF_NCM_MAP
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:47.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem( )
   {
      this(  new ModelContext(SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem.class));
   }

   public SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem( ModelContext context )
   {
      super( context, "SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem");
   }

   public SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem");
   }

   public SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem( StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_STUDY_ID") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRF_ID") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRF_ITEM_GRP_DIV") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_NCM_METADATA_ID") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_DEL_FLG") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRT_USER_ID") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_CRT_PROG_NM") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_UPD_USER_ID") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_UPD_PROG_NM") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM41_UPD_CNT") )
            {
               gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt = GXutil.lval( oReader.getValue()) ;
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
         sName = "B_TBM41_CRF_NCM_MAP.B_TBM41_CRF_NCM_MAPItem" ;
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
      oWriter.writeElement("TBM41_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_CRF_ITEM_GRP_DIV", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_NCM_METADATA_ID", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_DEL_FLG", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime) )
      {
         oWriter.writeStartElement("TBM41_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM41_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM41_CRT_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime) )
      {
         oWriter.writeStartElement("TBM41_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM41_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM41_UPD_USER_ID", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM41_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt, 10, 0)));
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
      AddObjectProperty("TBM41_STUDY_ID", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id, false);
      AddObjectProperty("TBM41_CRF_ID", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id, false);
      AddObjectProperty("TBM41_CRF_ITEM_GRP_DIV", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div, false);
      AddObjectProperty("TBM41_CRF_ITEM_GRP_CD", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd, false);
      AddObjectProperty("TBM41_NCM_METADATA_ID", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id, false);
      AddObjectProperty("TBM41_DEL_FLG", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg, false);
      datetime_STZ = gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime ;
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
      AddObjectProperty("TBM41_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM41_CRT_USER_ID", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id, false);
      AddObjectProperty("TBM41_CRT_PROG_NM", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime ;
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
      AddObjectProperty("TBM41_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM41_UPD_USER_ID", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id, false);
      AddObjectProperty("TBM41_UPD_PROG_NM", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm, false);
      AddObjectProperty("TBM41_UPD_CNT", gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt, false);
   }

   public long getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id( long value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id = value ;
   }

   public short getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id( short value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm = value ;
   }

   public java.util.Date getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime( java.util.Date value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id = value ;
   }

   public String getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm( String value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm = value ;
   }

   public long getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt( )
   {
      return gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt ;
   }

   public void setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt( long value )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id = "" ;
      gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem Clone( )
   {
      return (SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem)(clone()) ;
   }

   public void setStruct( StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem struct )
   {
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id(struct.getTbm41_study_id());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id(struct.getTbm41_crf_id());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div(struct.getTbm41_crf_item_grp_div());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd(struct.getTbm41_crf_item_grp_cd());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id(struct.getTbm41_ncm_metadata_id());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg(struct.getTbm41_del_flg());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime(struct.getTbm41_crt_datetime());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id(struct.getTbm41_crt_user_id());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm(struct.getTbm41_crt_prog_nm());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime(struct.getTbm41_upd_datetime());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id(struct.getTbm41_upd_user_id());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm(struct.getTbm41_upd_prog_nm());
      setgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt(struct.getTbm41_upd_cnt());
   }

   public StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem getStruct( )
   {
      StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem struct = new StructSdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem ();
      struct.setTbm41_study_id(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id());
      struct.setTbm41_crf_id(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id());
      struct.setTbm41_crf_item_grp_div(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div());
      struct.setTbm41_crf_item_grp_cd(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd());
      struct.setTbm41_ncm_metadata_id(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id());
      struct.setTbm41_del_flg(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg());
      struct.setTbm41_crt_datetime(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime());
      struct.setTbm41_crt_user_id(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id());
      struct.setTbm41_crt_prog_nm(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm());
      struct.setTbm41_upd_datetime(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime());
      struct.setTbm41_upd_user_id(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id());
      struct.setTbm41_upd_prog_nm(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm());
      struct.setTbm41_upd_cnt(getgxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt());
      return struct ;
   }

   protected short gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_study_id ;
   protected long gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_datetime ;
   protected java.util.Date gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_datetime ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_div ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crf_item_grp_cd ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_ncm_metadata_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_del_flg ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_user_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_crt_prog_nm ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_user_id ;
   protected String gxTv_SdtB_TBM41_CRF_NCM_MAP_B_TBM41_CRF_NCM_MAPItem_Tbm41_upd_prog_nm ;
}

