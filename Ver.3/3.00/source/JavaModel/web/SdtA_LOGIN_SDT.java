/*
               File: SdtA_LOGIN_SDT
        Description: A_LOGIN_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM07_ADMIN_AUTH_FLG") )
            {
               gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg = oReader.getValue() ;
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
                  gxTv_SdtA_LOGIN_SDT_A801_sys_config = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "tablet-EDC_GXXEV3U3", remoteHandle);
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "USER_STUDY_SDT") )
            {
               if ( gxTv_SdtA_LOGIN_SDT_User_study_sdt == null )
               {
                  gxTv_SdtA_LOGIN_SDT_User_study_sdt = new SdtA_USER_STUDY_SDT(remoteHandle, context);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtA_LOGIN_SDT_User_study_sdt.readxml(oReader, "USER_STUDY_SDT") ;
               }
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
         sName = "A_LOGIN_SDT" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "tablet-EDC_GXXEV3U3" ;
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
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_USER_ID", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_USER_NM", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_USER_KANA_NM", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_KNGN_PTN_KBN", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_ADMIN_AUTH_FLG", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM07_SITE_ID", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Tam07_site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtA_LOGIN_SDT_A801_sys_config.writexml(oWriter, "A801_SYS_CONFIG", sNameSpace1);
      }
      oWriter.writeElement("EXTRA_SYS_CALL_FLG", GXutil.rtrim( gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtA_LOGIN_SDT_User_study_sdt != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtA_LOGIN_SDT_User_study_sdt.writexml(oWriter, "USER_STUDY_SDT", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("SESSION_ID", gxTv_SdtA_LOGIN_SDT_Session_id, false);
      AddObjectProperty("TAM07_USER_ID", gxTv_SdtA_LOGIN_SDT_Tam07_user_id, false);
      AddObjectProperty("TAM07_USER_NM", gxTv_SdtA_LOGIN_SDT_Tam07_user_nm, false);
      AddObjectProperty("TAM07_USER_KANA_NM", gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm, false);
      AddObjectProperty("TAM07_KNGN_PTN_KBN", gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn, false);
      AddObjectProperty("TAM07_ADMIN_AUTH_FLG", gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg, false);
      AddObjectProperty("TAM07_SITE_ID", gxTv_SdtA_LOGIN_SDT_Tam07_site_id, false);
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config != null )
      {
         AddObjectProperty("A801_SYS_CONFIG", gxTv_SdtA_LOGIN_SDT_A801_sys_config, false);
      }
      AddObjectProperty("EXTRA_SYS_CALL_FLG", gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg, false);
      if ( gxTv_SdtA_LOGIN_SDT_User_study_sdt != null )
      {
         AddObjectProperty("USER_STUDY_SDT", gxTv_SdtA_LOGIN_SDT_User_study_sdt, false);
      }
   }

   public String getgxTv_SdtA_LOGIN_SDT_Session_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Session_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Session_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Session_id = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_id = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_nm ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_nm = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg = value ;
   }

   public String getgxTv_SdtA_LOGIN_SDT_Tam07_site_id( )
   {
      return gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_Tam07_site_id( String value )
   {
      gxTv_SdtA_LOGIN_SDT_Tam07_site_id = value ;
   }

   public GxObjectCollection getgxTv_SdtA_LOGIN_SDT_A801_sys_config( )
   {
      if ( gxTv_SdtA_LOGIN_SDT_A801_sys_config == null )
      {
         gxTv_SdtA_LOGIN_SDT_A801_sys_config = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "tablet-EDC_GXXEV3U3", remoteHandle);
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

   public SdtA_USER_STUDY_SDT getgxTv_SdtA_LOGIN_SDT_User_study_sdt( )
   {
      if ( gxTv_SdtA_LOGIN_SDT_User_study_sdt == null )
      {
         gxTv_SdtA_LOGIN_SDT_User_study_sdt = new SdtA_USER_STUDY_SDT(remoteHandle, context);
      }
      return gxTv_SdtA_LOGIN_SDT_User_study_sdt ;
   }

   public void setgxTv_SdtA_LOGIN_SDT_User_study_sdt( SdtA_USER_STUDY_SDT value )
   {
      gxTv_SdtA_LOGIN_SDT_User_study_sdt = value;
   }

   public void setgxTv_SdtA_LOGIN_SDT_User_study_sdt_SetNull( )
   {
      gxTv_SdtA_LOGIN_SDT_User_study_sdt = (SdtA_USER_STUDY_SDT)null;
   }

   public boolean getgxTv_SdtA_LOGIN_SDT_User_study_sdt_IsNull( )
   {
      if ( gxTv_SdtA_LOGIN_SDT_User_study_sdt == null )
      {
         return true ;
      }
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
      gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg = "" ;
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
      setgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg(struct.getTam07_admin_auth_flg());
      setgxTv_SdtA_LOGIN_SDT_Tam07_site_id(struct.getTam07_site_id());
      GxObjectCollection gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux1 = new GxObjectCollection();
      gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux1.setStruct(struct.getA801_sys_config());
      for (int i = 0; i < gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux1.size(); i++)
      {
         gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux.add(new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem((StructSdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux1.elementAt(i)));
      }
      setgxTv_SdtA_LOGIN_SDT_A801_sys_config(gxTv_SdtA_LOGIN_SDT_A801_sys_config_aux);
      setgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg(struct.getExtra_sys_call_flg());
      setgxTv_SdtA_LOGIN_SDT_User_study_sdt(new SdtA_USER_STUDY_SDT(struct.getUser_study_sdt()));
   }

   public StructSdtA_LOGIN_SDT getStruct( )
   {
      StructSdtA_LOGIN_SDT struct = new StructSdtA_LOGIN_SDT ();
      struct.setSession_id(getgxTv_SdtA_LOGIN_SDT_Session_id());
      struct.setTam07_user_id(getgxTv_SdtA_LOGIN_SDT_Tam07_user_id());
      struct.setTam07_user_nm(getgxTv_SdtA_LOGIN_SDT_Tam07_user_nm());
      struct.setTam07_user_kana_nm(getgxTv_SdtA_LOGIN_SDT_Tam07_user_kana_nm());
      struct.setTam07_kngn_ptn_kbn(getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn());
      struct.setTam07_admin_auth_flg(getgxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg());
      struct.setTam07_site_id(getgxTv_SdtA_LOGIN_SDT_Tam07_site_id());
      Vector aux_vectorgxTv_SdtA_LOGIN_SDT_A801_sys_config = getgxTv_SdtA_LOGIN_SDT_A801_sys_config().getStruct();
      Vector aux_vector1gxTv_SdtA_LOGIN_SDT_A801_sys_config = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtA_LOGIN_SDT_A801_sys_config.size(); i++)
      {
         aux_vector1gxTv_SdtA_LOGIN_SDT_A801_sys_config.addElement(((SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)aux_vectorgxTv_SdtA_LOGIN_SDT_A801_sys_config.elementAt(i)).getStruct());
      }
      struct.setA801_sys_config(aux_vector1gxTv_SdtA_LOGIN_SDT_A801_sys_config);
      struct.setExtra_sys_call_flg(getgxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg());
      struct.setUser_study_sdt(getgxTv_SdtA_LOGIN_SDT_User_study_sdt().getStruct());
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
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_admin_auth_flg ;
   protected String gxTv_SdtA_LOGIN_SDT_Tam07_site_id ;
   protected String gxTv_SdtA_LOGIN_SDT_Extra_sys_call_flg ;
   protected GxObjectCollection gxTv_SdtA_LOGIN_SDT_A801_sys_config=null ;
   protected SdtA_USER_STUDY_SDT gxTv_SdtA_LOGIN_SDT_User_study_sdt=null ;
}

