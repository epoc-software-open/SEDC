/*
               File: SdtB719_SD01_MEMO_B719_SD01_MEMOItem
        Description: B719_SD01_MEMO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB719_SD01_MEMO_B719_SD01_MEMOItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB719_SD01_MEMO_B719_SD01_MEMOItem( )
   {
      this(  new ModelContext(SdtB719_SD01_MEMO_B719_SD01_MEMOItem.class));
   }

   public SdtB719_SD01_MEMO_B719_SD01_MEMOItem( ModelContext context )
   {
      super( context, "SdtB719_SD01_MEMO_B719_SD01_MEMOItem");
   }

   public SdtB719_SD01_MEMO_B719_SD01_MEMOItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB719_SD01_MEMO_B719_SD01_MEMOItem");
   }

   public SdtB719_SD01_MEMO_B719_SD01_MEMOItem( StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem struct )
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
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SUBJECT_ID") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_NO") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ID") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_EDA_NO") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VISIT_NO") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_KBN") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REQUEST_SITE_ID") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REQUEST_AUTH_CD") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KAKUNIN_FLG") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KAKUNIN_USER_ID") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KANRYO_FLG") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRT_USER_ID") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UPD_CNT") )
            {
               gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt = GXutil.lval( oReader.getValue()) ;
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
         sName = "B719_SD01_MEMO.B719_SD01_MEMOItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO_KBN", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REQUEST_SITE_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REQUEST_AUTH_CD", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("KAKUNIN_FLG", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("KAKUNIN_USER_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("KANRYO_FLG", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime) )
      {
         oWriter.writeStartElement("CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("CRT_USER_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt, 10, 0)));
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
      AddObjectProperty("SEL_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg, false);
      AddObjectProperty("SUBJECT_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id, false);
      AddObjectProperty("MEMO_NO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no, false);
      AddObjectProperty("CRF_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id, false);
      AddObjectProperty("CRF_EDA_NO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no, false);
      AddObjectProperty("VISIT_NO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no, false);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd, false);
      AddObjectProperty("MEMO_KBN", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn, false);
      AddObjectProperty("MEMO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo, false);
      AddObjectProperty("REQUEST_SITE_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id, false);
      AddObjectProperty("REQUEST_AUTH_CD", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd, false);
      AddObjectProperty("KAKUNIN_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg, false);
      AddObjectProperty("KAKUNIN_USER_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id, false);
      AddObjectProperty("KANRYO_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg, false);
      datetime_STZ = gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
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
      AddObjectProperty("CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("CRT_USER_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id, false);
      AddObjectProperty("UPD_CNT", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt, false);
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( boolean value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg = value ;
   }

   public int getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( int value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id = value ;
   }

   public short getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no = value ;
   }

   public short getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id = value ;
   }

   public byte getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no( byte value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no = value ;
   }

   public int getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no( int value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = value ;
   }

   public java.util.Date getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( java.util.Date value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = value ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = value ;
   }

   public long getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( long value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB719_SD01_MEMO_B719_SD01_MEMOItem Clone( )
   {
      return (SdtB719_SD01_MEMO_B719_SD01_MEMOItem)(clone()) ;
   }

   public void setStruct( StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem struct )
   {
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id(struct.getSubject_id());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no(struct.getMemo_no());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id(struct.getCrf_id());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no(struct.getCrf_eda_no());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no(struct.getVisit_no());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn(struct.getMemo_kbn());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo(struct.getMemo());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id(struct.getRequest_site_id());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd(struct.getRequest_auth_cd());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg(struct.getKakunin_flg());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id(struct.getKakunin_user_id());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg(struct.getKanryo_flg());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime(struct.getCrt_datetime());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id(struct.getCrt_user_id());
      setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt(struct.getUpd_cnt());
   }

   public StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem getStruct( )
   {
      StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem struct = new StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem ();
      struct.setSel_flg(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg());
      struct.setSubject_id(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id());
      struct.setMemo_no(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no());
      struct.setCrf_id(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id());
      struct.setCrf_eda_no(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no());
      struct.setVisit_no(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no());
      struct.setCrf_item_grp_cd(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd());
      struct.setMemo_kbn(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn());
      struct.setMemo(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo());
      struct.setRequest_site_id(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id());
      struct.setRequest_auth_cd(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd());
      struct.setKakunin_flg(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg());
      struct.setKakunin_user_id(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id());
      struct.setKanryo_flg(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg());
      struct.setCrt_datetime(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime());
      struct.setCrt_user_id(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id());
      struct.setUpd_cnt(getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt());
      return struct ;
   }

   protected byte gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no ;
   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   protected int gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no ;
   protected long gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id ;
}

