/*
               File: SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem
        Description: B402_SD05_IMPORT_CSV_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:56.19
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem( )
   {
      this(  new ModelContext(SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem.class));
   }

   public SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem( ModelContext context )
   {
      super( context, "SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem");
   }

   public SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem");
   }

   public SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem( StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_NO") )
            {
               gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_FILE_NM") )
            {
               gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_FILE_NM") )
            {
               gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_IMPORT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT16_DEL_FLG") )
            {
               gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg = oReader.getValue() ;
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
         sName = "B402_SD05_IMPORT_CSV_LIST.B402_SD05_IMPORT_CSV_LISTItem" ;
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
      oWriter.writeElement("TBT16_IMPORT_NO", GXutil.trim( GXutil.str( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_IMPORT_FILE_NM", GXutil.rtrim( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT16_FILE_NM", GXutil.rtrim( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime) )
      {
         oWriter.writeStartElement("TBT16_IMPORT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT16_IMPORT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT16_DEL_FLG", GXutil.rtrim( gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg));
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
      AddObjectProperty("TBT16_IMPORT_NO", gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no, false);
      AddObjectProperty("TBT16_IMPORT_FILE_NM", gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm, false);
      AddObjectProperty("TBT16_FILE_NM", gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm, false);
      datetime_STZ = gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime ;
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( datetime_STZ), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBT16_IMPORT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT16_DEL_FLG", gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg, false);
   }

   public long getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no ;
   }

   public void setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no( long value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no = value ;
   }

   public String getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm ;
   }

   public void setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm = value ;
   }

   public String getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm ;
   }

   public void setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm = value ;
   }

   public java.util.Date getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime ;
   }

   public void setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime( java.util.Date value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = value ;
   }

   public String getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg ;
   }

   public void setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm = "" ;
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm = "" ;
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem Clone( )
   {
      return (SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem struct )
   {
      setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no(struct.getTbt16_import_no());
      setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm(struct.getTbt16_import_file_nm());
      setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm(struct.getTbt16_file_nm());
      setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime(struct.getTbt16_import_datetime());
      setgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg(struct.getTbt16_del_flg());
   }

   public StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem getStruct( )
   {
      StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem struct = new StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem ();
      struct.setTbt16_import_no(getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no());
      struct.setTbt16_import_file_nm(getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm());
      struct.setTbt16_file_nm(getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm());
      struct.setTbt16_import_datetime(getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime());
      struct.setTbt16_del_flg(getgxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg ;
}

