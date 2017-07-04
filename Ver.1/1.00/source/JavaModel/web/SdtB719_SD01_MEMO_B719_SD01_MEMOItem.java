import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

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
         sName = "B719_SD01_MEMO.B719_SD01_MEMOItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO_KBN", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("REQUEST_SITE_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("REQUEST_AUTH_CD", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KAKUNIN_FLG", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KAKUNIN_USER_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KANRYO_FLG", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
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
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("CRT_USER_ID", GXutil.rtrim( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("SEL_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg);
      AddObjectProperty("SUBJECT_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id);
      AddObjectProperty("MEMO_NO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no);
      AddObjectProperty("CRF_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd);
      AddObjectProperty("MEMO_KBN", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn);
      AddObjectProperty("MEMO", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo);
      AddObjectProperty("REQUEST_SITE_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id);
      AddObjectProperty("REQUEST_AUTH_CD", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd);
      AddObjectProperty("KAKUNIN_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg);
      AddObjectProperty("KAKUNIN_USER_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id);
      AddObjectProperty("KANRYO_FLG", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg);
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
      AddObjectProperty("CRT_DATETIME", sDateCnv);
      AddObjectProperty("CRT_USER_ID", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id);
      AddObjectProperty("UPD_CNT", gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt);
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg( boolean value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg = false ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id( int value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id = 0 ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no = (short)(0) ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime( java.util.Date value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = "" ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt( long value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt = value ;
   }

   public void setgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt_SetNull( )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt_IsNull( )
   {
      return false ;
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

   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   protected long gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
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

