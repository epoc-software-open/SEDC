/*
               File: SdtB792_SD00_HTML5_EXEC_INFO
        Description: B792_SD00_HTML5_EXEC_INFO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:59.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB792_SD00_HTML5_EXEC_INFO extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB792_SD00_HTML5_EXEC_INFO( )
   {
      this(  new ModelContext(SdtB792_SD00_HTML5_EXEC_INFO.class));
   }

   public SdtB792_SD00_HTML5_EXEC_INFO( ModelContext context )
   {
      super( context, "SdtB792_SD00_HTML5_EXEC_INFO");
   }

   public SdtB792_SD00_HTML5_EXEC_INFO( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB792_SD00_HTML5_EXEC_INFO");
   }

   public SdtB792_SD00_HTML5_EXEC_INFO( StructSdtB792_SD00_HTML5_EXEC_INFO struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXEC_DATE") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = GXutil.nullDate() ;
               }
               else
               {
                  gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (int)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXEC_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXEC_KBN") )
            {
               gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_CD") )
            {
               gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "B792_SD03_OL_DISP_INFO") )
            {
               if ( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info == null )
               {
                  gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = new GxObjectCollection(SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem.class, "B792_SD03_OL_DISP_INFO.B792_SD03_OL_DISP_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info.readxml(oReader, "B792_SD03_OL_DISP_INFO") ;
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
         sName = "B792_SD00_HTML5_EXEC_INFO" ;
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
      if ( GXutil.nullDate().equals(gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date) )
      {
         oWriter.writeStartElement("EXEC_DATE");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("EXEC_DATE", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime) )
      {
         oWriter.writeStartElement("EXEC_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("EXEC_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("EXEC_KBN", GXutil.rtrim( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("AUTH_CD", GXutil.rtrim( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info != null )
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
         gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info.writexml(oWriter, "B792_SD03_OL_DISP_INFO", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("EXEC_DATE", sDateCnv, false);
      datetime_STZ = gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime ;
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
      AddObjectProperty("EXEC_DATETIME", sDateCnv, false);
      AddObjectProperty("EXEC_KBN", gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn, false);
      AddObjectProperty("AUTH_CD", gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd, false);
      if ( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info != null )
      {
         AddObjectProperty("B792_SD03_OL_DISP_INFO", gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info, false);
      }
   }

   public java.util.Date getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date( java.util.Date value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = value ;
   }

   public java.util.Date getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime( java.util.Date value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = value ;
   }

   public String getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn( String value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn = value ;
   }

   public String getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( )
   {
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd( String value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd = value ;
   }

   public GxObjectCollection getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info( )
   {
      if ( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info == null )
      {
         gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = new GxObjectCollection(SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem.class, "B792_SD03_OL_DISP_INFO.B792_SD03_OL_DISP_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info( GxObjectCollection value )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = value ;
   }

   public void setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_SetNull( )
   {
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = null ;
   }

   public boolean getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_IsNull( )
   {
      if ( gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info == null )
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
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date = GXutil.nullDate() ;
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn = "" ;
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB792_SD00_HTML5_EXEC_INFO Clone( )
   {
      return (SdtB792_SD00_HTML5_EXEC_INFO)(clone()) ;
   }

   public void setStruct( StructSdtB792_SD00_HTML5_EXEC_INFO struct )
   {
      setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date(struct.getExec_date());
      setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime(struct.getExec_datetime());
      setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn(struct.getExec_kbn());
      setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd(struct.getAuth_cd());
      GxObjectCollection gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux1 = new GxObjectCollection();
      gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux1.setStruct(struct.getB792_sd03_ol_disp_info());
      for (int i = 0; i < gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux1.size(); i++)
      {
         gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux.add(new SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem((StructSdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux1.elementAt(i)));
      }
      setgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info(gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info_aux);
   }

   public StructSdtB792_SD00_HTML5_EXEC_INFO getStruct( )
   {
      StructSdtB792_SD00_HTML5_EXEC_INFO struct = new StructSdtB792_SD00_HTML5_EXEC_INFO ();
      struct.setExec_date(getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date());
      struct.setExec_datetime(getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime());
      struct.setExec_kbn(getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn());
      struct.setAuth_cd(getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd());
      Vector aux_vectorgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = getgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info().getStruct();
      Vector aux_vector1gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info.size(); i++)
      {
         aux_vector1gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info.addElement(((SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)aux_vectorgxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info.elementAt(i)).getStruct());
      }
      struct.setB792_sd03_ol_disp_info(aux_vector1gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_datetime ;
   protected java.util.Date datetime_STZ ;
   protected java.util.Date gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_date ;
   protected String gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Exec_kbn ;
   protected String gxTv_SdtB792_SD00_HTML5_EXEC_INFO_Auth_cd ;
   protected GxObjectCollection gxTv_SdtB792_SD00_HTML5_EXEC_INFO_B792_sd03_ol_disp_info=null ;
}

