/*
               File: SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem
        Description: B720_SD03_CRF_ORDER
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: December 24, 2020 16:51:17.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem( )
   {
      this(  new ModelContext(SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem.class));
   }

   public SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem( ModelContext context )
   {
      super( context, "SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem");
   }

   public SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem( int remoteHandle ,
                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem");
   }

   public SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem( StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ID") )
            {
               gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VISIT_NO") )
            {
               gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ORDER") )
            {
               gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "FILE_NO") )
            {
               gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no = (int)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B720_SD03_CRF_ORDER.B720_SD03_CRF_ORDERItem" ;
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
      oWriter.writeElement("CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ORDER", GXutil.trim( GXutil.str( gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("FILE_NO", GXutil.trim( GXutil.str( gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no, 6, 0)));
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
      AddObjectProperty("CRF_ID", gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id, false);
      AddObjectProperty("VISIT_NO", gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no, false);
      AddObjectProperty("CRF_ORDER", gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order, false);
      AddObjectProperty("FILE_NO", gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no, false);
   }

   public short getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id ;
   }

   public void setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id( short value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id = value ;
   }

   public int getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no ;
   }

   public void setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no = value ;
   }

   public int getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order ;
   }

   public void setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order = value ;
   }

   public int getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no ;
   }

   public void setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      sTagName = "" ;
   }

   public SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem Clone( )
   {
      return (SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem)(clone()) ;
   }

   public void setStruct( StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem struct )
   {
      setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id(struct.getCrf_id());
      setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no(struct.getVisit_no());
      setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order(struct.getCrf_order());
      setgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no(struct.getFile_no());
   }

   public StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem getStruct( )
   {
      StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem struct = new StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem ();
      struct.setCrf_id(getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id());
      struct.setVisit_no(getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no());
      struct.setCrf_order(getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order());
      struct.setFile_no(getgxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no());
      return struct ;
   }

   protected short gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no ;
   protected String sTagName ;
}

