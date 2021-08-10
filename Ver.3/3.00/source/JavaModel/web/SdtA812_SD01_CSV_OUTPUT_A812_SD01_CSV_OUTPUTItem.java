/*
               File: SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem
        Description: A812_SD01_CSV_OUTPUT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:41.18
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem( )
   {
      this(  new ModelContext(SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem.class));
   }

   public SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem( ModelContext context )
   {
      super( context, "SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem");
   }

   public SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem");
   }

   public SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem( StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CSV_DATA") )
            {
               if ( gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data == null )
               {
                  gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data = new GxObjectCollection(String.class, "internal", "");
               }
               if ( oReader.getIsSimple() == 0 )
               {
                  GXSoapError = gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data.readxmlcollection(oReader, "CSV_DATA", "Item") ;
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
         sName = "A812_SD01_CSV_OUTPUT.A812_SD01_CSV_OUTPUTItem" ;
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
      if ( gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data != null )
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
         gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data.writexmlcollection(oWriter, "CSV_DATA", sNameSpace1, "Item", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      if ( gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data != null )
      {
         AddObjectProperty("CSV_DATA", gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data, false);
      }
   }

   public GxObjectCollection getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data( )
   {
      if ( gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data == null )
      {
         gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data = new GxObjectCollection(String.class, "internal", "");
      }
      return gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data ;
   }

   public void setgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data( GxObjectCollection value )
   {
      gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data = value ;
   }

   public void setgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data_SetNull( )
   {
      gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data = null ;
   }

   public boolean getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data_IsNull( )
   {
      if ( gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data == null )
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
      sTagName = "" ;
   }

   public SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem Clone( )
   {
      return (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)(clone()) ;
   }

   public void setStruct( StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem struct )
   {
      setgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data(new GxObjectCollection(String.class, "internal", "", struct.getCsv_data()));
   }

   public StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem getStruct( )
   {
      StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem struct = new StructSdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem ();
      struct.setCsv_data(getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().getStruct());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected GxObjectCollection gxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data=null ;
}

