import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtA_LOGIN_SDT extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_LOGIN_SDT( )
   {
      this(  new ModelContext(SdtA_LOGIN_SDT.class));
   }

   public SdtA_LOGIN_SDT( ModelContext context )
   {
      super( context, "SdtA_LOGIN_SDT");
   }

   public SdtA_LOGIN_SDT( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle, context, "SdtA_LOGIN_SDT");
   }

   public SdtA_LOGIN_SDT( StructSdtA_LOGIN_SDT struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SESSION_ID") )
            {
               gxTv_SdtA_LOGIN_SDT_Session_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_ID") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_NM") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_USER_KANA_NM") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_KNGN_PTN_KBN") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_SITE_ID") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "A801_SYS_CONFIG") )
            {
               if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config == null )
               {
                  gxTv_SdtA_LOGIN_SDT_A801_sys_config = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtA_LOGIN_SDT_A801_sys_config.readxml(oReader, "A801_SYS_CONFIG") ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXTRA_SYS_CALL_FLG") )
            {
               gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = oReader.getValue() ;
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
         sName = "A_LOGIN_SDT" ;
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
      oWriter.writeElement("SESSION_ID", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Session_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_ID", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_USER_KANA_NM", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_KNGN_PTN_KBN", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TAM07_SITE_ID", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config != null )
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
         gxTv_SdtA_LOGIN_SDT_A801_sys_config.writexml(oWriter, "A801_SYS_CONFIG", sNameSpace1);
      }
      oWriter.writeElement("EXTRA_SYS_CALL_FLG", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("SESSION_ID", gxTv_SdtA_LOGIN_SDT_Session_id);
      AddObjectProperty("TAM07_USER_ID", gxTv_SdtA_LOGIN_SDT_Tam07_user_id);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtA_LOGIN_SDT_Tam07_user_nm);
      AddObjectProperty("TAM07_USER_KANA_NM", gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm);
      AddObjectProperty("TAM07_KNGN_PTN_KBN", gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn);
      AddObjectProperty("TAM07_SITE_ID", gxTv_SdtA_LOGIN_SDT_Tam07_site_id);
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config != null )
      {
         AddObjectProperty("A801_SYS_CONFIG", gxTv_SdtA_LOGIN_SDT_A801_sys_config);
      }
      AddObjectProperty("EXTRA_SYS_CALL_FLG", gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg);
   }

   public String getgxTv_SdtA_LOGIN_SDT_Session_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Session_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Session_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Session_id_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Session_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_id_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Tam07_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_site_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_site_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_site_id_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Tam07_site_id_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtA_LOGIN_SDT_A801_sys_config( )
   {
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config == null )
      {
         gxTv_SdtA_LOGIN_SDT_A801_sys_config = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtA_LOGIN_SDT_A801_sys_config ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_A801_sys_config( GxObjectCollection value )
   {
      gxTv_SdtA_LOGIN_SDT_A801_sys_config = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_A801_sys_config_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_A801_sys_config = null ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_A801_sys_config_IsNull( )
   {
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config == null )
      {
         return true ;
      }
      return false ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg( )
   {
      return gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = value ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = "" ;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = "" ;
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = "" ;
      gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg = "" ;
      sTagName = "" ;
   }

   public SdtA_LOGIN_SDT Clone( )
   {
      return (SdtA_LOGIN_SDT)(clone()) ;
   }

   public void setStruct( StructSdtA_LOGIN_SDT struct )
   {
      setgxTv_SdtA_LOGIN_SDT_Session_id(struct.getSession_id());
      setgxTv_SdtA_LOGIN_SDT_Tam07_user_id(struct.getTam07_user_id());
      setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm(struct.getTam07_user_nm());
      setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm(struct.getTam07_user_kana_nm());
      setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(struct.getTam07_kngn_ptn_kbn());
      setgxTv_SdtA_LOGIN_SDT_Tam07_site_id(struct.getTam07_site_id());
      setgxTv_SdtA_LOGIN_SDT_A801_sys_config(new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", struct.getA801_sys_config(), remoteHandle));
      setgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg(struct.getExtra_sys_call_flg());
   }

   public StructSdtA_LOGIN_SDT getStruct( )
   {
      StructSdtA_LOGIN_SDT struct = new StructSdtA_LOGIN_SDT ();
      struct.setSession_id(getgxTv_SdtA_LOGIN_SDT_Session_id());
      struct.setTam07_user_id(getgxTv_SdtA_LOGIN_SDT_Tam07_user_id());
      struct.setTam07_user_nm(getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm());
      struct.setTam07_user_kana_nm(getgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm());
      struct.setTam07_kngn_ptn_kbn(getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn());
      struct.setTam07_site_id(getgxTv_SdtA_LOGIN_SDT_Tam07_site_id());
      struct.setA801_sys_config(getgxTv_SdtA_LOGIN_SDT_A801_sys_config().getStruct());
      struct.setExtra_sys_call_flg(getgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA_LOGIN_SDT_Session_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   protected GxObjectCollection gxTv_SdtA_LOGIN_SDT_A801_sys_config=null ;
}

