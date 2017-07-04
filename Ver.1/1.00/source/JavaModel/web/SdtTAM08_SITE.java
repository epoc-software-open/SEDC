import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTAM08_SITE extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTAM08_SITE( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTAM08_SITE.class));
   }

   public SdtTAM08_SITE( int remoteHandle ,
                         ModelContext context )
   {
      super( context, "SdtTAM08_SITE");
      initialize( remoteHandle) ;
   }

   public SdtTAM08_SITE( int remoteHandle ,
                         StructSdtTAM08_SITE struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( String AV132TAM08_SITE_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV132TAM08_SITE_ID});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_ID") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_NM") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_SNM") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_OUTER_SITE_ID") )
            {
               gxTv_SdtTAM08_SITE_Tam08_outer_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_DEL_FLG") )
            {
               gxTv_SdtTAM08_SITE_Tam08_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM08_SITE_Tam08_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM08_SITE_Tam08_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_USER_ID") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_PROG_NM") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM08_SITE_Tam08_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM08_SITE_Tam08_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_USER_ID") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_PROG_NM") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_CNT") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTAM08_SITE_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTAM08_SITE_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_ID_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_NM_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_SNM_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_snm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_OUTER_SITE_ID_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_DEL_FLG_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_USER_ID_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_USER_ID_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_CNT_Z") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_NM_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_SITE_SNM_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_site_snm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_OUTER_SITE_ID_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_DEL_FLG_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_DATETIME_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_USER_ID_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_CRT_PROG_NM_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_DATETIME_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_USER_ID_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_PROG_NM_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM08_UPD_CNT_N") )
            {
               gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TAM08_SITE" ;
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
      oWriter.writeElement("TAM08_SITE_ID", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_NM", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_SNM", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_snm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_OUTER_SITE_ID", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_outer_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_DEL_FLG", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM08_SITE_Tam08_crt_datetime) )
      {
         oWriter.writeStartElement("TAM08_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM08_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM08_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM08_SITE_Tam08_upd_datetime) )
      {
         oWriter.writeStartElement("TAM08_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM08_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM08_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTAM08_SITE_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_NM_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_SNM_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_site_snm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_OUTER_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TAM08_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM08_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM08_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TAM08_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM08_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM08_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_site_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_SITE_SNM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_site_snm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_OUTER_SITE_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM08_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TAM08_SITE_ID", gxTv_SdtTAM08_SITE_Tam08_site_id);
      AddObjectProperty("TAM08_SITE_NM", gxTv_SdtTAM08_SITE_Tam08_site_nm);
      AddObjectProperty("TAM08_SITE_SNM", gxTv_SdtTAM08_SITE_Tam08_site_snm);
      AddObjectProperty("TAM08_OUTER_SITE_ID", gxTv_SdtTAM08_SITE_Tam08_outer_site_id);
      AddObjectProperty("TAM08_DEL_FLG", gxTv_SdtTAM08_SITE_Tam08_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM08_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TAM08_CRT_USER_ID", gxTv_SdtTAM08_SITE_Tam08_crt_user_id);
      AddObjectProperty("TAM08_CRT_PROG_NM", gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM08_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TAM08_UPD_USER_ID", gxTv_SdtTAM08_SITE_Tam08_upd_user_id);
      AddObjectProperty("TAM08_UPD_PROG_NM", gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm);
      AddObjectProperty("TAM08_UPD_CNT", gxTv_SdtTAM08_SITE_Tam08_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTAM08_SITE_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTAM08_SITE_Initialized);
      AddObjectProperty("TAM08_SITE_ID_Z", gxTv_SdtTAM08_SITE_Tam08_site_id_Z);
      AddObjectProperty("TAM08_SITE_NM_Z", gxTv_SdtTAM08_SITE_Tam08_site_nm_Z);
      AddObjectProperty("TAM08_SITE_SNM_Z", gxTv_SdtTAM08_SITE_Tam08_site_snm_Z);
      AddObjectProperty("TAM08_OUTER_SITE_ID_Z", gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z);
      AddObjectProperty("TAM08_DEL_FLG_Z", gxTv_SdtTAM08_SITE_Tam08_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM08_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM08_CRT_USER_ID_Z", gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z);
      AddObjectProperty("TAM08_CRT_PROG_NM_Z", gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM08_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM08_UPD_USER_ID_Z", gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z);
      AddObjectProperty("TAM08_UPD_PROG_NM_Z", gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z);
      AddObjectProperty("TAM08_UPD_CNT_Z", gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z);
      AddObjectProperty("TAM08_SITE_NM_N", gxTv_SdtTAM08_SITE_Tam08_site_nm_N);
      AddObjectProperty("TAM08_SITE_SNM_N", gxTv_SdtTAM08_SITE_Tam08_site_snm_N);
      AddObjectProperty("TAM08_OUTER_SITE_ID_N", gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N);
      AddObjectProperty("TAM08_DEL_FLG_N", gxTv_SdtTAM08_SITE_Tam08_del_flg_N);
      AddObjectProperty("TAM08_CRT_DATETIME_N", gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N);
      AddObjectProperty("TAM08_CRT_USER_ID_N", gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N);
      AddObjectProperty("TAM08_CRT_PROG_NM_N", gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N);
      AddObjectProperty("TAM08_UPD_DATETIME_N", gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N);
      AddObjectProperty("TAM08_UPD_USER_ID_N", gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N);
      AddObjectProperty("TAM08_UPD_PROG_NM_N", gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N);
      AddObjectProperty("TAM08_UPD_CNT_N", gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N);
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_id( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_id ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAM08_SITE_Tam08_site_id, value) != 0 )
      {
         gxTv_SdtTAM08_SITE_Mode = "INS" ;
         this.setgxTv_SdtTAM08_SITE_Tam08_site_id_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_site_nm_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_site_snm_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_del_flg_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTAM08_SITE_Tam08_site_id = value ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_nm( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_nm ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_site_nm = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_site_nm = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_snm( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_snm ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_site_snm = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_site_snm = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_snm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_outer_site_id( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_outer_site_id ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_del_flg( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_del_flg ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_del_flg = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_del_flg = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM08_SITE_Tam08_crt_datetime( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_datetime ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_crt_user_id( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_user_id ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM08_SITE_Tam08_upd_datetime( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_datetime ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_upd_user_id( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_user_id ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM08_SITE_Tam08_upd_cnt( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_cnt ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt( long value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Mode( )
   {
      return gxTv_SdtTAM08_SITE_Mode ;
   }

   public void setgxTv_SdtTAM08_SITE_Mode( String value )
   {
      gxTv_SdtTAM08_SITE_Mode = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Mode_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Mode = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTAM08_SITE_Initialized( )
   {
      return gxTv_SdtTAM08_SITE_Initialized ;
   }

   public void setgxTv_SdtTAM08_SITE_Initialized( short value )
   {
      gxTv_SdtTAM08_SITE_Initialized = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Initialized_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_id_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_id_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_id_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_id_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_id_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_nm_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_nm_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_site_snm_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_snm_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_snm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_del_flg_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_del_flg_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_site_nm_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_nm_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_nm_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_site_snm_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_site_snm_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_site_snm_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_snm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_site_snm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_del_flg_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_del_flg_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_del_flg_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N( )
   {
      return gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tam08_site_bc obj ;
      obj = new tam08_site_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTAM08_SITE_Tam08_site_id = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_nm = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_snm = "" ;
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id = "" ;
      gxTv_SdtTAM08_SITE_Tam08_del_flg = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm = "" ;
      gxTv_SdtTAM08_SITE_Mode = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_nm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_site_snm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_del_flg_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z = "" ;
      gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTAM08_SITE Clone( )
   {
      SdtTAM08_SITE sdt ;
      tam08_site_bc obj ;
      sdt = (SdtTAM08_SITE)(clone()) ;
      obj = (tam08_site_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTAM08_SITE struct )
   {
      setgxTv_SdtTAM08_SITE_Tam08_site_id(struct.getTam08_site_id());
      setgxTv_SdtTAM08_SITE_Tam08_site_nm(struct.getTam08_site_nm());
      setgxTv_SdtTAM08_SITE_Tam08_site_snm(struct.getTam08_site_snm());
      setgxTv_SdtTAM08_SITE_Tam08_outer_site_id(struct.getTam08_outer_site_id());
      setgxTv_SdtTAM08_SITE_Tam08_del_flg(struct.getTam08_del_flg());
      setgxTv_SdtTAM08_SITE_Tam08_crt_datetime(struct.getTam08_crt_datetime());
      setgxTv_SdtTAM08_SITE_Tam08_crt_user_id(struct.getTam08_crt_user_id());
      setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm(struct.getTam08_crt_prog_nm());
      setgxTv_SdtTAM08_SITE_Tam08_upd_datetime(struct.getTam08_upd_datetime());
      setgxTv_SdtTAM08_SITE_Tam08_upd_user_id(struct.getTam08_upd_user_id());
      setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm(struct.getTam08_upd_prog_nm());
      setgxTv_SdtTAM08_SITE_Tam08_upd_cnt(struct.getTam08_upd_cnt());
      setgxTv_SdtTAM08_SITE_Mode(struct.getMode());
      setgxTv_SdtTAM08_SITE_Initialized(struct.getInitialized());
      setgxTv_SdtTAM08_SITE_Tam08_site_id_Z(struct.getTam08_site_id_Z());
      setgxTv_SdtTAM08_SITE_Tam08_site_nm_Z(struct.getTam08_site_nm_Z());
      setgxTv_SdtTAM08_SITE_Tam08_site_snm_Z(struct.getTam08_site_snm_Z());
      setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z(struct.getTam08_outer_site_id_Z());
      setgxTv_SdtTAM08_SITE_Tam08_del_flg_Z(struct.getTam08_del_flg_Z());
      setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z(struct.getTam08_crt_datetime_Z());
      setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z(struct.getTam08_crt_user_id_Z());
      setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z(struct.getTam08_crt_prog_nm_Z());
      setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z(struct.getTam08_upd_datetime_Z());
      setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z(struct.getTam08_upd_user_id_Z());
      setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z(struct.getTam08_upd_prog_nm_Z());
      setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z(struct.getTam08_upd_cnt_Z());
      setgxTv_SdtTAM08_SITE_Tam08_site_nm_N(struct.getTam08_site_nm_N());
      setgxTv_SdtTAM08_SITE_Tam08_site_snm_N(struct.getTam08_site_snm_N());
      setgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N(struct.getTam08_outer_site_id_N());
      setgxTv_SdtTAM08_SITE_Tam08_del_flg_N(struct.getTam08_del_flg_N());
      setgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N(struct.getTam08_crt_datetime_N());
      setgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N(struct.getTam08_crt_user_id_N());
      setgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N(struct.getTam08_crt_prog_nm_N());
      setgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N(struct.getTam08_upd_datetime_N());
      setgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N(struct.getTam08_upd_user_id_N());
      setgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N(struct.getTam08_upd_prog_nm_N());
      setgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N(struct.getTam08_upd_cnt_N());
   }

   public StructSdtTAM08_SITE getStruct( )
   {
      StructSdtTAM08_SITE struct = new StructSdtTAM08_SITE ();
      struct.setTam08_site_id(getgxTv_SdtTAM08_SITE_Tam08_site_id());
      struct.setTam08_site_nm(getgxTv_SdtTAM08_SITE_Tam08_site_nm());
      struct.setTam08_site_snm(getgxTv_SdtTAM08_SITE_Tam08_site_snm());
      struct.setTam08_outer_site_id(getgxTv_SdtTAM08_SITE_Tam08_outer_site_id());
      struct.setTam08_del_flg(getgxTv_SdtTAM08_SITE_Tam08_del_flg());
      struct.setTam08_crt_datetime(getgxTv_SdtTAM08_SITE_Tam08_crt_datetime());
      struct.setTam08_crt_user_id(getgxTv_SdtTAM08_SITE_Tam08_crt_user_id());
      struct.setTam08_crt_prog_nm(getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm());
      struct.setTam08_upd_datetime(getgxTv_SdtTAM08_SITE_Tam08_upd_datetime());
      struct.setTam08_upd_user_id(getgxTv_SdtTAM08_SITE_Tam08_upd_user_id());
      struct.setTam08_upd_prog_nm(getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm());
      struct.setTam08_upd_cnt(getgxTv_SdtTAM08_SITE_Tam08_upd_cnt());
      struct.setMode(getgxTv_SdtTAM08_SITE_Mode());
      struct.setInitialized(getgxTv_SdtTAM08_SITE_Initialized());
      struct.setTam08_site_id_Z(getgxTv_SdtTAM08_SITE_Tam08_site_id_Z());
      struct.setTam08_site_nm_Z(getgxTv_SdtTAM08_SITE_Tam08_site_nm_Z());
      struct.setTam08_site_snm_Z(getgxTv_SdtTAM08_SITE_Tam08_site_snm_Z());
      struct.setTam08_outer_site_id_Z(getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z());
      struct.setTam08_del_flg_Z(getgxTv_SdtTAM08_SITE_Tam08_del_flg_Z());
      struct.setTam08_crt_datetime_Z(getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z());
      struct.setTam08_crt_user_id_Z(getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z());
      struct.setTam08_crt_prog_nm_Z(getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z());
      struct.setTam08_upd_datetime_Z(getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z());
      struct.setTam08_upd_user_id_Z(getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z());
      struct.setTam08_upd_prog_nm_Z(getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z());
      struct.setTam08_upd_cnt_Z(getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z());
      struct.setTam08_site_nm_N(getgxTv_SdtTAM08_SITE_Tam08_site_nm_N());
      struct.setTam08_site_snm_N(getgxTv_SdtTAM08_SITE_Tam08_site_snm_N());
      struct.setTam08_outer_site_id_N(getgxTv_SdtTAM08_SITE_Tam08_outer_site_id_N());
      struct.setTam08_del_flg_N(getgxTv_SdtTAM08_SITE_Tam08_del_flg_N());
      struct.setTam08_crt_datetime_N(getgxTv_SdtTAM08_SITE_Tam08_crt_datetime_N());
      struct.setTam08_crt_user_id_N(getgxTv_SdtTAM08_SITE_Tam08_crt_user_id_N());
      struct.setTam08_crt_prog_nm_N(getgxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N());
      struct.setTam08_upd_datetime_N(getgxTv_SdtTAM08_SITE_Tam08_upd_datetime_N());
      struct.setTam08_upd_user_id_N(getgxTv_SdtTAM08_SITE_Tam08_upd_user_id_N());
      struct.setTam08_upd_prog_nm_N(getgxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N());
      struct.setTam08_upd_cnt_N(getgxTv_SdtTAM08_SITE_Tam08_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTAM08_SITE_Tam08_site_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_site_snm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_outer_site_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_del_flg_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_datetime_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_user_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_datetime_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_user_id_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_N ;
   private byte gxTv_SdtTAM08_SITE_Tam08_upd_cnt_N ;
   private short gxTv_SdtTAM08_SITE_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTAM08_SITE_Tam08_upd_cnt ;
   private long gxTv_SdtTAM08_SITE_Tam08_upd_cnt_Z ;
   private String gxTv_SdtTAM08_SITE_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_crt_datetime ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_upd_datetime ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM08_SITE_Tam08_upd_datetime_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_id ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_nm ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_snm ;
   private String gxTv_SdtTAM08_SITE_Tam08_outer_site_id ;
   private String gxTv_SdtTAM08_SITE_Tam08_del_flg ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_user_id ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_user_id ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_nm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_site_snm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_outer_site_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_del_flg_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_user_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_crt_prog_nm_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_user_id_Z ;
   private String gxTv_SdtTAM08_SITE_Tam08_upd_prog_nm_Z ;
}

