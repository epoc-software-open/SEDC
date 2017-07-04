/*
               File: SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem
        Description: A_RESULT_MSG_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem( )
   {
      this(  new ModelContext(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class));
   }

   public SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem( ModelContext context )
   {
      super( context, "SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem");
   }

   public SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem");
   }

   public SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem( StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_MSG") )
            {
               gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg = oReader.getValue() ;
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
         sName = "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem" ;
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
      oWriter.writeElement("RESULT_MSG", GXutil.rtrim( gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("RESULT_MSG", gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg, false);
   }

   public String getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( )
   {
      return gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg ;
   }

   public void setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( String value )
   {
      gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg = "" ;
      sTagName = "" ;
   }

   public SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem Clone( )
   {
      return (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)(clone()) ;
   }

   public void setStruct( StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem struct )
   {
      setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg(struct.getResult_msg());
   }

   public StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem getStruct( )
   {
      StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem struct = new StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem ();
      struct.setResult_msg(getgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg ;
}

