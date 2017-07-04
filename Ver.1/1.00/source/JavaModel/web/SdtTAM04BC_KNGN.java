import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTAM04BC_KNGN extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTAM04BC_KNGN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTAM04BC_KNGN.class));
   }

   public SdtTAM04BC_KNGN( int remoteHandle ,
                           ModelContext context )
   {
      super( context, "SdtTAM04BC_KNGN");
      initialize( remoteHandle) ;
   }

   public SdtTAM04BC_KNGN( int remoteHandle ,
                           StructSdtTAM04BC_KNGN struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( String AV17TAM04_AUTH_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV17TAM04_AUTH_CD});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_CD") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_NM") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_LVL") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_DEL_FLG") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_USER_ID") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_PROG_NM") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_USER_ID") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_PROG_NM") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_CNT") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_APPLI") )
            {
               if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli == null )
               {
                  gxTv_SdtTAM04BC_KNGN_Tam05_appli = new GxSilentTrnGridCollection(SdtTAM04BC_KNGN_TAM05_APPLI.class, "TAM04BC_KNGN.TAM05_APPLI", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtTAM04BC_KNGN_Tam05_appli.readxml(oReader, "TAM05_APPLI") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTAM04BC_KNGN_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTAM04BC_KNGN_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_CD_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_NM_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_LVL_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_DEL_FLG_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_USER_ID_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_USER_ID_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_CNT_Z") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_NM_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_LVL_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_DEL_FLG_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_DATETIME_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_USER_ID_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_CRT_PROG_NM_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_DATETIME_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_USER_ID_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_PROG_NM_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_UPD_CNT_N") )
            {
               gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TAM04BC_KNGN" ;
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
      oWriter.writeElement("TAM04_AUTH_CD", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_NM", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_LVL", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_DEL_FLG", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime) )
      {
         oWriter.writeStartElement("TAM04_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM04_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM04_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime) )
      {
         oWriter.writeStartElement("TAM04_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM04_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM04_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SmartEDC_SHIZUOKA" ;
         }
         else
         {
            sNameSpace1 = "SmartEDC_SHIZUOKA" ;
         }
         gxTv_SdtTAM04BC_KNGN_Tam05_appli.writexml(oWriter, "TAM05_APPLI", sNameSpace1);
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_NM_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_LVL_Z", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TAM04_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM04_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM04_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TAM04_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM04_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM04_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_AUTH_LVL_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM04_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TAM04_AUTH_CD", gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd);
      AddObjectProperty("TAM04_AUTH_NM", gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm);
      AddObjectProperty("TAM04_AUTH_LVL", gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl);
      AddObjectProperty("TAM04_DEL_FLG", gxTv_SdtTAM04BC_KNGN_Tam04_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM04_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TAM04_CRT_USER_ID", gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id);
      AddObjectProperty("TAM04_CRT_PROG_NM", gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM04_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TAM04_UPD_USER_ID", gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id);
      AddObjectProperty("TAM04_UPD_PROG_NM", gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm);
      AddObjectProperty("TAM04_UPD_CNT", gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt);
      if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli != null )
      {
         AddObjectProperty("TAM05_APPLI", gxTv_SdtTAM04BC_KNGN_Tam05_appli);
      }
      AddObjectProperty("Mode", gxTv_SdtTAM04BC_KNGN_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTAM04BC_KNGN_Initialized);
      AddObjectProperty("TAM04_AUTH_CD_Z", gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z);
      AddObjectProperty("TAM04_AUTH_NM_Z", gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z);
      AddObjectProperty("TAM04_AUTH_LVL_Z", gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z);
      AddObjectProperty("TAM04_DEL_FLG_Z", gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM04_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM04_CRT_USER_ID_Z", gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z);
      AddObjectProperty("TAM04_CRT_PROG_NM_Z", gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM04_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM04_UPD_USER_ID_Z", gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z);
      AddObjectProperty("TAM04_UPD_PROG_NM_Z", gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z);
      AddObjectProperty("TAM04_UPD_CNT_Z", gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z);
      AddObjectProperty("TAM04_AUTH_NM_N", gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N);
      AddObjectProperty("TAM04_AUTH_LVL_N", gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N);
      AddObjectProperty("TAM04_DEL_FLG_N", gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N);
      AddObjectProperty("TAM04_CRT_DATETIME_N", gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N);
      AddObjectProperty("TAM04_CRT_USER_ID_N", gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N);
      AddObjectProperty("TAM04_CRT_PROG_NM_N", gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N);
      AddObjectProperty("TAM04_UPD_DATETIME_N", gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N);
      AddObjectProperty("TAM04_UPD_USER_ID_N", gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N);
      AddObjectProperty("TAM04_UPD_PROG_NM_N", gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N);
      AddObjectProperty("TAM04_UPD_CNT_N", gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N);
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd, value) != 0 )
      {
         gxTv_SdtTAM04BC_KNGN_Mode = "INS" ;
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z_SetNull( );
         if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli != null )
         {
            GxSilentTrnGridCollection collectionTam05_appli = gxTv_SdtTAM04BC_KNGN_Tam05_appli ;
            SdtTAM04BC_KNGN_TAM05_APPLI currItemTam05_appli ;
            short idx = 1 ;
            while ( idx <= collectionTam05_appli.size() )
            {
               currItemTam05_appli = (SdtTAM04BC_KNGN_TAM05_APPLI)((SdtTAM04BC_KNGN_TAM05_APPLI)collectionTam05_appli.elementAt(-1+idx));
               currItemTam05_appli.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Mode( "INS" );
               currItemTam05_appli.setgxTv_SdtTAM04BC_KNGN_TAM05_APPLI_Modified( (short)(1) );
               idx = (short)(idx+1) ;
            }
         }
      }
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd = value ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_del_flg ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt( long value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_IsNull( )
   {
      return false ;
   }

   public GxSilentTrnGridCollection getgxTv_SdtTAM04BC_KNGN_Tam05_appli( )
   {
      if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli == null )
      {
         gxTv_SdtTAM04BC_KNGN_Tam05_appli = new GxSilentTrnGridCollection(SdtTAM04BC_KNGN_TAM05_APPLI.class, "TAM04BC_KNGN.TAM05_APPLI", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtTAM04BC_KNGN_Tam05_appli ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam05_appli( GxSilentTrnGridCollection value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam05_appli = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam05_appli_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam05_appli = null ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam05_appli_IsNull( )
   {
      if ( gxTv_SdtTAM04BC_KNGN_Tam05_appli == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Mode( )
   {
      return gxTv_SdtTAM04BC_KNGN_Mode ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Mode( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Mode = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Mode_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Mode = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTAM04BC_KNGN_Initialized( )
   {
      return gxTv_SdtTAM04BC_KNGN_Initialized ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Initialized( short value )
   {
      gxTv_SdtTAM04BC_KNGN_Initialized = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Initialized_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N( )
   {
      return gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tam04bc_kngn_bc obj ;
      obj = new tam04bc_kngn_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm = "" ;
      gxTv_SdtTAM04BC_KNGN_Mode = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z = "" ;
      gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTAM04BC_KNGN Clone( )
   {
      SdtTAM04BC_KNGN sdt ;
      tam04bc_kngn_bc obj ;
      sdt = (SdtTAM04BC_KNGN)(clone()) ;
      obj = (tam04bc_kngn_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTAM04BC_KNGN struct )
   {
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd(struct.getTam04_auth_cd());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm(struct.getTam04_auth_nm());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl(struct.getTam04_auth_lvl());
      setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg(struct.getTam04_del_flg());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime(struct.getTam04_crt_datetime());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id(struct.getTam04_crt_user_id());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm(struct.getTam04_crt_prog_nm());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime(struct.getTam04_upd_datetime());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id(struct.getTam04_upd_user_id());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm(struct.getTam04_upd_prog_nm());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt(struct.getTam04_upd_cnt());
      setgxTv_SdtTAM04BC_KNGN_Tam05_appli(new GxSilentTrnGridCollection(SdtTAM04BC_KNGN_TAM05_APPLI.class, "TAM04BC_KNGN.TAM05_APPLI", "SmartEDC_SHIZUOKA", struct.getTam05_appli(), remoteHandle));
      setgxTv_SdtTAM04BC_KNGN_Mode(struct.getMode());
      setgxTv_SdtTAM04BC_KNGN_Initialized(struct.getInitialized());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z(struct.getTam04_auth_cd_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z(struct.getTam04_auth_nm_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z(struct.getTam04_auth_lvl_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z(struct.getTam04_del_flg_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z(struct.getTam04_crt_datetime_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z(struct.getTam04_crt_user_id_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z(struct.getTam04_crt_prog_nm_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z(struct.getTam04_upd_datetime_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z(struct.getTam04_upd_user_id_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z(struct.getTam04_upd_prog_nm_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z(struct.getTam04_upd_cnt_Z());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N(struct.getTam04_auth_nm_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N(struct.getTam04_auth_lvl_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N(struct.getTam04_del_flg_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N(struct.getTam04_crt_datetime_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N(struct.getTam04_crt_user_id_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N(struct.getTam04_crt_prog_nm_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N(struct.getTam04_upd_datetime_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N(struct.getTam04_upd_user_id_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N(struct.getTam04_upd_prog_nm_N());
      setgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N(struct.getTam04_upd_cnt_N());
   }

   public StructSdtTAM04BC_KNGN getStruct( )
   {
      StructSdtTAM04BC_KNGN struct = new StructSdtTAM04BC_KNGN ();
      struct.setTam04_auth_cd(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd());
      struct.setTam04_auth_nm(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm());
      struct.setTam04_auth_lvl(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl());
      struct.setTam04_del_flg(getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg());
      struct.setTam04_crt_datetime(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime());
      struct.setTam04_crt_user_id(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id());
      struct.setTam04_crt_prog_nm(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm());
      struct.setTam04_upd_datetime(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime());
      struct.setTam04_upd_user_id(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id());
      struct.setTam04_upd_prog_nm(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm());
      struct.setTam04_upd_cnt(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt());
      struct.setTam05_appli(getgxTv_SdtTAM04BC_KNGN_Tam05_appli().getStruct());
      struct.setMode(getgxTv_SdtTAM04BC_KNGN_Mode());
      struct.setInitialized(getgxTv_SdtTAM04BC_KNGN_Initialized());
      struct.setTam04_auth_cd_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z());
      struct.setTam04_auth_nm_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z());
      struct.setTam04_auth_lvl_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z());
      struct.setTam04_del_flg_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z());
      struct.setTam04_crt_datetime_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z());
      struct.setTam04_crt_user_id_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z());
      struct.setTam04_crt_prog_nm_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z());
      struct.setTam04_upd_datetime_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z());
      struct.setTam04_upd_user_id_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z());
      struct.setTam04_upd_prog_nm_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z());
      struct.setTam04_upd_cnt_Z(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z());
      struct.setTam04_auth_nm_N(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N());
      struct.setTam04_auth_lvl_N(getgxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N());
      struct.setTam04_del_flg_N(getgxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N());
      struct.setTam04_crt_datetime_N(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N());
      struct.setTam04_crt_user_id_N(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N());
      struct.setTam04_crt_prog_nm_N(getgxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N());
      struct.setTam04_upd_datetime_N(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N());
      struct.setTam04_upd_user_id_N(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N());
      struct.setTam04_upd_prog_nm_N(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N());
      struct.setTam04_upd_cnt_N(getgxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_Z ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_auth_lvl_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_N ;
   private byte gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_N ;
   private short gxTv_SdtTAM04BC_KNGN_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt ;
   private long gxTv_SdtTAM04BC_KNGN_Tam04_upd_cnt_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM04BC_KNGN_Tam04_upd_datetime_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_del_flg ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_cd_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_auth_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_del_flg_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_crt_prog_nm_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_user_id_Z ;
   private String gxTv_SdtTAM04BC_KNGN_Tam04_upd_prog_nm_Z ;
   private GxSilentTrnGridCollection gxTv_SdtTAM04BC_KNGN_Tam05_appli=null ;
}

