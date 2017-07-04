/*
               File: SdtB402_SD02_STUDY_STAFF
        Description: B402_SD02_STUDY_STAFF
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

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
                  gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = new GxObjectCollection(SdtB402_SD03_STUDY_STAFF_AUTH.class, "B402_SD03_STUDY_STAFF_AUTH", "tablet-EDC_GXXEV3U3", remoteHandle);
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
         sName = "B402_SD02_STUDY_STAFF" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB402_SD02_STUDY_STAFF_Check)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD02_STUDY_STAFF_Study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("STUDY_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SITE_ID", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Site_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SITE_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("USER_ID", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_User_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("USER_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_User_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("STYDY_AUTH_CD", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("AUTH_NM", GXutil.rtrim( gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth != null )
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
         gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.writexmlcollection(oWriter, "SEL_AUTH", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CHECK", gxTv_SdtB402_SD02_STUDY_STAFF_Check, false);
      AddObjectProperty("STUDY_ID", gxTv_SdtB402_SD02_STUDY_STAFF_Study_id, false);
      AddObjectProperty("STUDY_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm, false);
      AddObjectProperty("SITE_ID", gxTv_SdtB402_SD02_STUDY_STAFF_Site_id, false);
      AddObjectProperty("SITE_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm, false);
      AddObjectProperty("USER_ID", gxTv_SdtB402_SD02_STUDY_STAFF_User_id, false);
      AddObjectProperty("USER_NM", gxTv_SdtB402_SD02_STUDY_STAFF_User_nm, false);
      AddObjectProperty("STYDY_AUTH_CD", gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd, false);
      AddObjectProperty("AUTH_NM", gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm, false);
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth != null )
      {
         AddObjectProperty("SEL_AUTH", gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth, false);
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

   public long getgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_id( long value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_id = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Study_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Study_nm = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_id = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Site_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Site_nm = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_User_id( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_id ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_id( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_id = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_User_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_User_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_User_nm = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Stydy_auth_cd = value ;
   }

   public String getgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( )
   {
      return gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm ;
   }

   public void setgxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm( String value )
   {
      gxTv_SdtB402_SD02_STUDY_STAFF_Auth_nm = value ;
   }

   public GxObjectCollection getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth( )
   {
      if ( gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth == null )
      {
         gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = new GxObjectCollection(SdtB402_SD03_STUDY_STAFF_AUTH.class, "B402_SD03_STUDY_STAFF_AUTH", "tablet-EDC_GXXEV3U3", remoteHandle);
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
      GxObjectCollection gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux1 = new GxObjectCollection();
      gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux1.setStruct(struct.getSel_auth());
      for (int i = 0; i < gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux1.size(); i++)
      {
         gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux.add(new SdtB402_SD03_STUDY_STAFF_AUTH((StructSdtB402_SD03_STUDY_STAFF_AUTH)gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux1.elementAt(i)));
      }
      setgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth(gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth_aux);
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
      Vector aux_vectorgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = getgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth().getStruct();
      Vector aux_vector1gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.size(); i++)
      {
         aux_vector1gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.addElement(((SdtB402_SD03_STUDY_STAFF_AUTH)aux_vectorgxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth.elementAt(i)).getStruct());
      }
      struct.setSel_auth(aux_vector1gxTv_SdtB402_SD02_STUDY_STAFF_Sel_auth);
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

