import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTAM07_USER extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTAM07_USER( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTAM07_USER.class));
   }

   public SdtTAM07_USER( int remoteHandle ,
                         ModelContext context )
   {
      super( context, "SdtTAM07_USER");
      initialize( remoteHandle) ;
   }

   public SdtTAM07_USER( int remoteHandle ,
                         StructSdtTAM07_USER struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( String AV8TAM07_USER_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV8TAM07_USER_ID});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_ID") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_KANA_NM") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_kana_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_PWD") )
            {
               gxTv_SdtTAM07_USER_Tam07_pwd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_AUTH_CD") )
            {
               gxTv_SdtTAM07_USER_Tam07_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_SITE_ID") )
            {
               gxTv_SdtTAM07_USER_Tam07_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_EMAIL") )
            {
               gxTv_SdtTAM07_USER_Tam07_email = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_DEL_FLG") )
            {
               gxTv_SdtTAM07_USER_Tam07_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM07_USER_Tam07_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM07_USER_Tam07_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_USER_ID") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_PROG_NM") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM07_USER_Tam07_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM07_USER_Tam07_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_USER_ID") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_PROG_NM") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_CNT") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTAM07_USER_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTAM07_USER_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_ID_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_KANA_NM_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_PWD_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_pwd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_AUTH_CD_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_SITE_ID_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_site_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_EMAIL_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_email_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_DEL_FLG_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_USER_ID_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_USER_ID_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_CNT_Z") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_KANA_NM_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_PWD_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_pwd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_AUTH_CD_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_auth_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_SITE_ID_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_site_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_EMAIL_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_email_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_DEL_FLG_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_DATETIME_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_USER_ID_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_CRT_PROG_NM_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_DATETIME_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_USER_ID_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_PROG_NM_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_UPD_CNT_N") )
            {
               gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TAM07_USER" ;
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
      oWriter.writeElement("TAM07_USER_ID", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_KANA_NM", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_kana_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_PWD", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_pwd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_AUTH_CD", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_SITE_ID", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_EMAIL", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_email));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_DEL_FLG", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM07_USER_Tam07_crt_datetime) )
      {
         oWriter.writeStartElement("TAM07_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM07_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM07_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM07_USER_Tam07_upd_datetime) )
      {
         oWriter.writeStartElement("TAM07_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM07_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM07_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTAM07_USER_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_NM_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_KANA_NM_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_PWD_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_pwd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_auth_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_SITE_ID_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_site_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_EMAIL_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_email_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TAM07_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM07_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM07_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TAM07_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM07_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TAM07_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_user_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_KANA_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_PWD_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_pwd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_AUTH_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_auth_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_SITE_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_site_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_EMAIL_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_email_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTAM07_USER_Tam07_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TAM07_USER_ID", gxTv_SdtTAM07_USER_Tam07_user_id);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtTAM07_USER_Tam07_user_nm);
      AddObjectProperty("TAM07_USER_KANA_NM", gxTv_SdtTAM07_USER_Tam07_user_kana_nm);
      AddObjectProperty("TAM07_PWD", gxTv_SdtTAM07_USER_Tam07_pwd);
      AddObjectProperty("TAM07_AUTH_CD", gxTv_SdtTAM07_USER_Tam07_auth_cd);
      AddObjectProperty("TAM07_SITE_ID", gxTv_SdtTAM07_USER_Tam07_site_id);
      AddObjectProperty("TAM07_EMAIL", gxTv_SdtTAM07_USER_Tam07_email);
      AddObjectProperty("TAM07_DEL_FLG", gxTv_SdtTAM07_USER_Tam07_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM07_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TAM07_CRT_USER_ID", gxTv_SdtTAM07_USER_Tam07_crt_user_id);
      AddObjectProperty("TAM07_CRT_PROG_NM", gxTv_SdtTAM07_USER_Tam07_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM07_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TAM07_UPD_USER_ID", gxTv_SdtTAM07_USER_Tam07_upd_user_id);
      AddObjectProperty("TAM07_UPD_PROG_NM", gxTv_SdtTAM07_USER_Tam07_upd_prog_nm);
      AddObjectProperty("TAM07_UPD_CNT", gxTv_SdtTAM07_USER_Tam07_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTAM07_USER_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTAM07_USER_Initialized);
      AddObjectProperty("TAM07_USER_ID_Z", gxTv_SdtTAM07_USER_Tam07_user_id_Z);
      AddObjectProperty("TAM07_USER_NM_Z", gxTv_SdtTAM07_USER_Tam07_user_nm_Z);
      AddObjectProperty("TAM07_USER_KANA_NM_Z", gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z);
      AddObjectProperty("TAM07_PWD_Z", gxTv_SdtTAM07_USER_Tam07_pwd_Z);
      AddObjectProperty("TAM07_AUTH_CD_Z", gxTv_SdtTAM07_USER_Tam07_auth_cd_Z);
      AddObjectProperty("TAM07_SITE_ID_Z", gxTv_SdtTAM07_USER_Tam07_site_id_Z);
      AddObjectProperty("TAM07_EMAIL_Z", gxTv_SdtTAM07_USER_Tam07_email_Z);
      AddObjectProperty("TAM07_DEL_FLG_Z", gxTv_SdtTAM07_USER_Tam07_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM07_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM07_CRT_USER_ID_Z", gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z);
      AddObjectProperty("TAM07_CRT_PROG_NM_Z", gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TAM07_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TAM07_UPD_USER_ID_Z", gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z);
      AddObjectProperty("TAM07_UPD_PROG_NM_Z", gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z);
      AddObjectProperty("TAM07_UPD_CNT_Z", gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z);
      AddObjectProperty("TAM07_USER_NM_N", gxTv_SdtTAM07_USER_Tam07_user_nm_N);
      AddObjectProperty("TAM07_USER_KANA_NM_N", gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N);
      AddObjectProperty("TAM07_PWD_N", gxTv_SdtTAM07_USER_Tam07_pwd_N);
      AddObjectProperty("TAM07_AUTH_CD_N", gxTv_SdtTAM07_USER_Tam07_auth_cd_N);
      AddObjectProperty("TAM07_SITE_ID_N", gxTv_SdtTAM07_USER_Tam07_site_id_N);
      AddObjectProperty("TAM07_EMAIL_N", gxTv_SdtTAM07_USER_Tam07_email_N);
      AddObjectProperty("TAM07_DEL_FLG_N", gxTv_SdtTAM07_USER_Tam07_del_flg_N);
      AddObjectProperty("TAM07_CRT_DATETIME_N", gxTv_SdtTAM07_USER_Tam07_crt_datetime_N);
      AddObjectProperty("TAM07_CRT_USER_ID_N", gxTv_SdtTAM07_USER_Tam07_crt_user_id_N);
      AddObjectProperty("TAM07_CRT_PROG_NM_N", gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N);
      AddObjectProperty("TAM07_UPD_DATETIME_N", gxTv_SdtTAM07_USER_Tam07_upd_datetime_N);
      AddObjectProperty("TAM07_UPD_USER_ID_N", gxTv_SdtTAM07_USER_Tam07_upd_user_id_N);
      AddObjectProperty("TAM07_UPD_PROG_NM_N", gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N);
      AddObjectProperty("TAM07_UPD_CNT_N", gxTv_SdtTAM07_USER_Tam07_upd_cnt_N);
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_id ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAM07_USER_Tam07_user_id, value) != 0 )
      {
         gxTv_SdtTAM07_USER_Mode = "INS" ;
         this.setgxTv_SdtTAM07_USER_Tam07_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_user_nm_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_pwd_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_site_id_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_email_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_del_flg_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTAM07_USER_Tam07_user_id = value ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_user_nm = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_user_nm = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_kana_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_pwd( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_pwd = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_pwd = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_pwd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_auth_cd( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_site_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_site_id = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_site_id = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_email( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_email_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_email = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_email_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_email = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_email_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_del_flg( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_del_flg = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_del_flg = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM07_USER_Tam07_crt_datetime( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_crt_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_crt_user_id = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM07_USER_Tam07_upd_datetime( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_upd_user_id( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_upd_user_id = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM07_USER_Tam07_upd_cnt( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt( long value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTAM07_USER_Tam07_upd_cnt = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTAM07_USER_Tam07_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Mode( )
   {
      return gxTv_SdtTAM07_USER_Mode ;
   }

   public void setgxTv_SdtTAM07_USER_Mode( String value )
   {
      gxTv_SdtTAM07_USER_Mode = value ;
   }

   public void setgxTv_SdtTAM07_USER_Mode_SetNull( )
   {
      gxTv_SdtTAM07_USER_Mode = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTAM07_USER_Initialized( )
   {
      return gxTv_SdtTAM07_USER_Initialized ;
   }

   public void setgxTv_SdtTAM07_USER_Initialized( short value )
   {
      gxTv_SdtTAM07_USER_Initialized = value ;
   }

   public void setgxTv_SdtTAM07_USER_Initialized_SetNull( )
   {
      gxTv_SdtTAM07_USER_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_id_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_pwd_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_pwd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_auth_cd_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_site_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_site_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_email_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_email_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_email_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_email_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_del_flg_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_user_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_nm_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_nm_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_pwd_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_pwd_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_pwd_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_pwd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_pwd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_auth_cd_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_auth_cd_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_auth_cd_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_auth_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_auth_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_site_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_site_id_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_site_id_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_site_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_site_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_email_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_email_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_email_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_email_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_email_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_email_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_del_flg_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_del_flg_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_del_flg_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_crt_datetime_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_datetime_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_crt_user_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_user_id_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_upd_datetime_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_datetime_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_upd_user_id_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_user_id_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM07_USER_Tam07_upd_cnt_N( )
   {
      return gxTv_SdtTAM07_USER_Tam07_upd_cnt_N ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTAM07_USER_Tam07_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTAM07_USER_Tam07_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM07_USER_Tam07_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tam07_user_bc obj ;
      obj = new tam07_user_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTAM07_USER_Tam07_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_pwd = "" ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd = "" ;
      gxTv_SdtTAM07_USER_Tam07_site_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_email = "" ;
      gxTv_SdtTAM07_USER_Tam07_del_flg = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_crt_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_upd_user_id = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm = "" ;
      gxTv_SdtTAM07_USER_Mode = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_email_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTAM07_USER Clone( )
   {
      SdtTAM07_USER sdt ;
      tam07_user_bc obj ;
      sdt = (SdtTAM07_USER)(clone()) ;
      obj = (tam07_user_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTAM07_USER struct )
   {
      setgxTv_SdtTAM07_USER_Tam07_user_id(struct.getTam07_user_id());
      setgxTv_SdtTAM07_USER_Tam07_user_nm(struct.getTam07_user_nm());
      setgxTv_SdtTAM07_USER_Tam07_user_kana_nm(struct.getTam07_user_kana_nm());
      setgxTv_SdtTAM07_USER_Tam07_pwd(struct.getTam07_pwd());
      setgxTv_SdtTAM07_USER_Tam07_auth_cd(struct.getTam07_auth_cd());
      setgxTv_SdtTAM07_USER_Tam07_site_id(struct.getTam07_site_id());
      setgxTv_SdtTAM07_USER_Tam07_email(struct.getTam07_email());
      setgxTv_SdtTAM07_USER_Tam07_del_flg(struct.getTam07_del_flg());
      setgxTv_SdtTAM07_USER_Tam07_crt_datetime(struct.getTam07_crt_datetime());
      setgxTv_SdtTAM07_USER_Tam07_crt_user_id(struct.getTam07_crt_user_id());
      setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm(struct.getTam07_crt_prog_nm());
      setgxTv_SdtTAM07_USER_Tam07_upd_datetime(struct.getTam07_upd_datetime());
      setgxTv_SdtTAM07_USER_Tam07_upd_user_id(struct.getTam07_upd_user_id());
      setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm(struct.getTam07_upd_prog_nm());
      setgxTv_SdtTAM07_USER_Tam07_upd_cnt(struct.getTam07_upd_cnt());
      setgxTv_SdtTAM07_USER_Mode(struct.getMode());
      setgxTv_SdtTAM07_USER_Initialized(struct.getInitialized());
      setgxTv_SdtTAM07_USER_Tam07_user_id_Z(struct.getTam07_user_id_Z());
      setgxTv_SdtTAM07_USER_Tam07_user_nm_Z(struct.getTam07_user_nm_Z());
      setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z(struct.getTam07_user_kana_nm_Z());
      setgxTv_SdtTAM07_USER_Tam07_pwd_Z(struct.getTam07_pwd_Z());
      setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z(struct.getTam07_auth_cd_Z());
      setgxTv_SdtTAM07_USER_Tam07_site_id_Z(struct.getTam07_site_id_Z());
      setgxTv_SdtTAM07_USER_Tam07_email_Z(struct.getTam07_email_Z());
      setgxTv_SdtTAM07_USER_Tam07_del_flg_Z(struct.getTam07_del_flg_Z());
      setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z(struct.getTam07_crt_datetime_Z());
      setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z(struct.getTam07_crt_user_id_Z());
      setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z(struct.getTam07_crt_prog_nm_Z());
      setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z(struct.getTam07_upd_datetime_Z());
      setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z(struct.getTam07_upd_user_id_Z());
      setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z(struct.getTam07_upd_prog_nm_Z());
      setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z(struct.getTam07_upd_cnt_Z());
      setgxTv_SdtTAM07_USER_Tam07_user_nm_N(struct.getTam07_user_nm_N());
      setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N(struct.getTam07_user_kana_nm_N());
      setgxTv_SdtTAM07_USER_Tam07_pwd_N(struct.getTam07_pwd_N());
      setgxTv_SdtTAM07_USER_Tam07_auth_cd_N(struct.getTam07_auth_cd_N());
      setgxTv_SdtTAM07_USER_Tam07_site_id_N(struct.getTam07_site_id_N());
      setgxTv_SdtTAM07_USER_Tam07_email_N(struct.getTam07_email_N());
      setgxTv_SdtTAM07_USER_Tam07_del_flg_N(struct.getTam07_del_flg_N());
      setgxTv_SdtTAM07_USER_Tam07_crt_datetime_N(struct.getTam07_crt_datetime_N());
      setgxTv_SdtTAM07_USER_Tam07_crt_user_id_N(struct.getTam07_crt_user_id_N());
      setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N(struct.getTam07_crt_prog_nm_N());
      setgxTv_SdtTAM07_USER_Tam07_upd_datetime_N(struct.getTam07_upd_datetime_N());
      setgxTv_SdtTAM07_USER_Tam07_upd_user_id_N(struct.getTam07_upd_user_id_N());
      setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N(struct.getTam07_upd_prog_nm_N());
      setgxTv_SdtTAM07_USER_Tam07_upd_cnt_N(struct.getTam07_upd_cnt_N());
   }

   public StructSdtTAM07_USER getStruct( )
   {
      StructSdtTAM07_USER struct = new StructSdtTAM07_USER ();
      struct.setTam07_user_id(getgxTv_SdtTAM07_USER_Tam07_user_id());
      struct.setTam07_user_nm(getgxTv_SdtTAM07_USER_Tam07_user_nm());
      struct.setTam07_user_kana_nm(getgxTv_SdtTAM07_USER_Tam07_user_kana_nm());
      struct.setTam07_pwd(getgxTv_SdtTAM07_USER_Tam07_pwd());
      struct.setTam07_auth_cd(getgxTv_SdtTAM07_USER_Tam07_auth_cd());
      struct.setTam07_site_id(getgxTv_SdtTAM07_USER_Tam07_site_id());
      struct.setTam07_email(getgxTv_SdtTAM07_USER_Tam07_email());
      struct.setTam07_del_flg(getgxTv_SdtTAM07_USER_Tam07_del_flg());
      struct.setTam07_crt_datetime(getgxTv_SdtTAM07_USER_Tam07_crt_datetime());
      struct.setTam07_crt_user_id(getgxTv_SdtTAM07_USER_Tam07_crt_user_id());
      struct.setTam07_crt_prog_nm(getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm());
      struct.setTam07_upd_datetime(getgxTv_SdtTAM07_USER_Tam07_upd_datetime());
      struct.setTam07_upd_user_id(getgxTv_SdtTAM07_USER_Tam07_upd_user_id());
      struct.setTam07_upd_prog_nm(getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm());
      struct.setTam07_upd_cnt(getgxTv_SdtTAM07_USER_Tam07_upd_cnt());
      struct.setMode(getgxTv_SdtTAM07_USER_Mode());
      struct.setInitialized(getgxTv_SdtTAM07_USER_Initialized());
      struct.setTam07_user_id_Z(getgxTv_SdtTAM07_USER_Tam07_user_id_Z());
      struct.setTam07_user_nm_Z(getgxTv_SdtTAM07_USER_Tam07_user_nm_Z());
      struct.setTam07_user_kana_nm_Z(getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z());
      struct.setTam07_pwd_Z(getgxTv_SdtTAM07_USER_Tam07_pwd_Z());
      struct.setTam07_auth_cd_Z(getgxTv_SdtTAM07_USER_Tam07_auth_cd_Z());
      struct.setTam07_site_id_Z(getgxTv_SdtTAM07_USER_Tam07_site_id_Z());
      struct.setTam07_email_Z(getgxTv_SdtTAM07_USER_Tam07_email_Z());
      struct.setTam07_del_flg_Z(getgxTv_SdtTAM07_USER_Tam07_del_flg_Z());
      struct.setTam07_crt_datetime_Z(getgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z());
      struct.setTam07_crt_user_id_Z(getgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z());
      struct.setTam07_crt_prog_nm_Z(getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z());
      struct.setTam07_upd_datetime_Z(getgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z());
      struct.setTam07_upd_user_id_Z(getgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z());
      struct.setTam07_upd_prog_nm_Z(getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z());
      struct.setTam07_upd_cnt_Z(getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z());
      struct.setTam07_user_nm_N(getgxTv_SdtTAM07_USER_Tam07_user_nm_N());
      struct.setTam07_user_kana_nm_N(getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N());
      struct.setTam07_pwd_N(getgxTv_SdtTAM07_USER_Tam07_pwd_N());
      struct.setTam07_auth_cd_N(getgxTv_SdtTAM07_USER_Tam07_auth_cd_N());
      struct.setTam07_site_id_N(getgxTv_SdtTAM07_USER_Tam07_site_id_N());
      struct.setTam07_email_N(getgxTv_SdtTAM07_USER_Tam07_email_N());
      struct.setTam07_del_flg_N(getgxTv_SdtTAM07_USER_Tam07_del_flg_N());
      struct.setTam07_crt_datetime_N(getgxTv_SdtTAM07_USER_Tam07_crt_datetime_N());
      struct.setTam07_crt_user_id_N(getgxTv_SdtTAM07_USER_Tam07_crt_user_id_N());
      struct.setTam07_crt_prog_nm_N(getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N());
      struct.setTam07_upd_datetime_N(getgxTv_SdtTAM07_USER_Tam07_upd_datetime_N());
      struct.setTam07_upd_user_id_N(getgxTv_SdtTAM07_USER_Tam07_upd_user_id_N());
      struct.setTam07_upd_prog_nm_N(getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N());
      struct.setTam07_upd_cnt_N(getgxTv_SdtTAM07_USER_Tam07_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTAM07_USER_Tam07_user_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_pwd_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_auth_cd_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_site_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_email_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_del_flg_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_datetime_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_user_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_datetime_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_user_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_cnt_N ;
   private short gxTv_SdtTAM07_USER_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTAM07_USER_Tam07_upd_cnt ;
   private long gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z ;
   private String gxTv_SdtTAM07_USER_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_crt_datetime ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_upd_datetime ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_user_id ;
   private String gxTv_SdtTAM07_USER_Tam07_user_nm ;
   private String gxTv_SdtTAM07_USER_Tam07_user_kana_nm ;
   private String gxTv_SdtTAM07_USER_Tam07_pwd ;
   private String gxTv_SdtTAM07_USER_Tam07_auth_cd ;
   private String gxTv_SdtTAM07_USER_Tam07_site_id ;
   private String gxTv_SdtTAM07_USER_Tam07_email ;
   private String gxTv_SdtTAM07_USER_Tam07_del_flg ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_user_id ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_prog_nm ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_user_id ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_prog_nm ;
   private String gxTv_SdtTAM07_USER_Tam07_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_user_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_pwd_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_auth_cd_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_site_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_email_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_del_flg_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z ;
}

