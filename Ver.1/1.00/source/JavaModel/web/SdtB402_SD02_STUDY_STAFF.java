import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB402_SD02_STUDY_STAFF extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD02_STUDY_STAFF( )
   {
      this(  new ModelContext(SdtB402_SD02_STUDY_STAFF.class));
   }

   public SdtB402_SD02_STUDY_STAFF( ModelContext context )
   {
      super( context, "SdtB402_SD02_STUDY_STAFF");
   }

   public SdtB402_SD02_STUDY_STAFF( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD02_STUDY_STAFF");
   }

   public SdtB402_SD02_STUDY_STAFF( StructSdtB402_SD02_STUDY_STAFF struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHECK") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "STUDY_ID") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "STUDY_NM") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SITE_ID") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SITE_NM") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "USER_ID") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_User_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "USER_NM") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "STYDY_AUTH_CD") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_NM") )
            {
               gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SEL_AUTH") )
            {
               if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth == null )
               {
                  gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = new GxObjectCollection(SdtB402_SD03_STUDY_STAFF_AUTH.class, "B402_SD03_STUDY_STAFF_AUTH", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.readxmlcollection(oReader, "SEL_AUTH", "Item") ;
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
         sName = "B402_SD02_STUDY_STAFF" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB402_SD02_STUDY_STAFF_Check)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD02_STUDY_STAFF_Study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("STUDY_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("SITE_ID", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Site_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("SITE_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("USER_ID", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_User_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("USER_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_User_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("STYDY_AUTH_CD", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("AUTH_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth != null )
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
         gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.writexmlcollection(oWriter, "SEL_AUTH", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("CHECK", gxTv_SdtB402_SD02_STUDY_STAFF_Check);
      AddObjectProperty("STUDY_ID", gxTv_SdtB402_SD02_STUDY_STAFF_Study_id);
      AddObjectProperty("STUDY_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm);
      AddObjectProperty("SITE_ID", gxTv_SdtB402_SD02_STUDY_STAFF_Site_id);
      AddObjectProperty("SITE_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm);
      AddObjectProperty("USER_ID", gxTv_SdtB402_SD02_STUDY_STAFF_User_id);
      AddObjectProperty("USER_NM", gxTv_SdtB402_SD02_STUDY_STAFF_User_nm);
      AddObjectProperty("STYDY_AUTH_CD", gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd);
      AddObjectProperty("AUTH_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm);
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth != null )
      {
         AddObjectProperty("SEL_AUTH", gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth);
      }
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Check( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Check ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Check( boolean value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Check = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Check_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Check = false ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Check_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( long value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_id = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_id = 0 ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Study_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Site_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_User_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_id_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_User_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = "" ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth( )
   {
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth == null )
      {
         gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = new GxObjectCollection(SdtB402_SD03_STUDY_STAFF_AUTH.class, "B402_SD03_STUDY_STAFF_AUTH", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth( GxObjectCollection value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = value ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_SetNull( )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = null ;
   }

   public boolean getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_IsNull( )
   {
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth == null )
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
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = "" ;
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = "" ;
      sTagName = "" ;
   }

   public SdtB402_SD02_STUDY_STAFF Clone( )
   {
      return (SdtB402_SD02_STUDY_STAFF)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD02_STUDY_STAFF struct )
   {
      setgxTv_SdtB402_SD02_STUDY_STAFF_Check(struct.getCheck());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id(struct.getStudy_id());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm(struct.getStudy_nm());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id(struct.getSite_id());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm(struct.getSite_nm());
      setgxTv_SdtB402_SD02_STUDY_STAFF_User_id(struct.getUser_id());
      setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm(struct.getUser_nm());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd(struct.getStydy_auth_cd());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm(struct.getAuth_nm());
      setgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth(new GxObjectCollection(SdtB402_SD03_STUDY_STAFF_AUTH.class, "B402_SD03_STUDY_STAFF_AUTH", "SmartEDC_SHIZUOKA", struct.getSel_auth(), remoteHandle));
   }

   public StructSdtB402_SD02_STUDY_STAFF getStruct( )
   {
      StructSdtB402_SD02_STUDY_STAFF struct = new StructSdtB402_SD02_STUDY_STAFF ();
      struct.setCheck(getgxTv_SdtB402_SD02_STUDY_STAFF_Check());
      struct.setStudy_id(getgxTv_SdtB402_SD02_STUDY_STAFF_Study_id());
      struct.setStudy_nm(getgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm());
      struct.setSite_id(getgxTv_SdtB402_SD02_STUDY_STAFF_Site_id());
      struct.setSite_nm(getgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm());
      struct.setUser_id(getgxTv_SdtB402_SD02_STUDY_STAFF_User_id());
      struct.setUser_nm(getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm());
      struct.setStydy_auth_cd(getgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd());
      struct.setAuth_nm(getgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm());
      struct.setSel_auth(getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB402_SD02_STUDY_STAFF_Study_id ;
   protected String sTagName ;
   protected boolean gxTv_SdtB402_SD02_STUDY_STAFF_Check ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Site_id ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_User_id ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_User_nm ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd ;
   protected String gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm ;
   protected GxObjectCollection gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth=null ;
}

