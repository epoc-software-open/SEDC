/*
               File: SdtB808_SD01_EXTRA_INFO
        Description: B808_SD01_EXTRA_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:46.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB808_SD01_EXTRA_INFO extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB808_SD01_EXTRA_INFO( )
   {
      this(  new ModelContext(SdtB808_SD01_EXTRA_INFO.class));
   }

   public SdtB808_SD01_EXTRA_INFO( ModelContext context )
   {
      super( context, "SdtB808_SD01_EXTRA_INFO");
   }

   public SdtB808_SD01_EXTRA_INFO( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtB808_SD01_EXTRA_INFO");
   }

   public SdtB808_SD01_EXTRA_INFO( StructSdtB808_SD01_EXTRA_INFO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "APP_ID") )
            {
               gxTv_SdtB808_SD01_EXTRA_INFO_App_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "PARMS") )
            {
               if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
               {
                  gxTv_SdtB808_SD01_EXTRA_INFO_Parms = new GxObjectCollection(SdtB808_SD01_EXTRA_INFO_PARMSItem.class, "B808_SD01_EXTRA_INFO.PARMSItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtB808_SD01_EXTRA_INFO_Parms.readxmlcollection(oReader, "PARMS", "PARMSItem") ;
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
         sName = "B808_SD01_EXTRA_INFO" ;
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
      oWriter.writeElement("APP_ID", GXutil.rtrim( gxTv_SdtB808_SD01_EXTRA_INFO_App_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms != null )
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
         gxTv_SdtB808_SD01_EXTRA_INFO_Parms.writexmlcollection(oWriter, "PARMS", sNameSpace1, "PARMSItem", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("APP_ID", gxTv_SdtB808_SD01_EXTRA_INFO_App_id, false);
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms != null )
      {
         AddObjectProperty("PARMS", gxTv_SdtB808_SD01_EXTRA_INFO_Parms, false);
      }
   }

   public String getgxTv_SdtB808_SD01_EXTRA_INFO_App_id( )
   {
      return gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( String value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = value ;
   }

   public GxObjectCollection getgxTv_SdtB808_SD01_EXTRA_INFO_Parms( )
   {
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
      {
         gxTv_SdtB808_SD01_EXTRA_INFO_Parms = new GxObjectCollection(SdtB808_SD01_EXTRA_INFO_PARMSItem.class, "B808_SD01_EXTRA_INFO.PARMSItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB808_SD01_EXTRA_INFO_Parms ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_Parms( GxObjectCollection value )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms = value ;
   }

   public void setgxTv_SdtB808_SD01_EXTRA_INFO_Parms_SetNull( )
   {
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms = null ;
   }

   public boolean getgxTv_SdtB808_SD01_EXTRA_INFO_Parms_IsNull( )
   {
      if ( gxTv_SdtB808_SD01_EXTRA_INFO_Parms == null )
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
      gxTv_SdtB808_SD01_EXTRA_INFO_App_id = "" ;
      sTagName = "" ;
   }

   public SdtB808_SD01_EXTRA_INFO Clone( )
   {
      return (SdtB808_SD01_EXTRA_INFO)(clone()) ;
   }

   public void setStruct( StructSdtB808_SD01_EXTRA_INFO struct )
   {
      setgxTv_SdtB808_SD01_EXTRA_INFO_App_id(struct.getApp_id());
      GxObjectCollection gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux1 = new GxObjectCollection();
      gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux1.setStruct(struct.getParms());
      for (int i = 0; i < gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux1.size(); i++)
      {
         gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux.add(new SdtB808_SD01_EXTRA_INFO_PARMSItem((StructSdtB808_SD01_EXTRA_INFO_PARMSItem)gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux1.elementAt(i)));
      }
      setgxTv_SdtB808_SD01_EXTRA_INFO_Parms(gxTv_SdtB808_SD01_EXTRA_INFO_Parms_aux);
   }

   public StructSdtB808_SD01_EXTRA_INFO getStruct( )
   {
      StructSdtB808_SD01_EXTRA_INFO struct = new StructSdtB808_SD01_EXTRA_INFO ();
      struct.setApp_id(getgxTv_SdtB808_SD01_EXTRA_INFO_App_id());
      Vector aux_vectorgxTv_SdtB808_SD01_EXTRA_INFO_Parms = getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().getStruct();
      Vector aux_vector1gxTv_SdtB808_SD01_EXTRA_INFO_Parms = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB808_SD01_EXTRA_INFO_Parms.size(); i++)
      {
         aux_vector1gxTv_SdtB808_SD01_EXTRA_INFO_Parms.addElement(((SdtB808_SD01_EXTRA_INFO_PARMSItem)aux_vectorgxTv_SdtB808_SD01_EXTRA_INFO_Parms.elementAt(i)).getStruct());
      }
      struct.setParms(aux_vector1gxTv_SdtB808_SD01_EXTRA_INFO_Parms);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB808_SD01_EXTRA_INFO_App_id ;
   protected GxObjectCollection gxTv_SdtB808_SD01_EXTRA_INFO_Parms=null ;
}

