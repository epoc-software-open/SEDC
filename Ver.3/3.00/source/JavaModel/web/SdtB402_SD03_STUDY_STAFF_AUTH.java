/*
               File: SdtB402_SD03_STUDY_STAFF_AUTH
        Description: B402_SD03_STUDY_STAFF_AUTH
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: February 2, 2021 16:30:26.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB402_SD03_STUDY_STAFF_AUTH extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD03_STUDY_STAFF_AUTH( )
   {
      this(  new ModelContext(SdtB402_SD03_STUDY_STAFF_AUTH.class));
   }

   public SdtB402_SD03_STUDY_STAFF_AUTH( ModelContext context )
   {
      super( context, "SdtB402_SD03_STUDY_STAFF_AUTH");
   }

   public SdtB402_SD03_STUDY_STAFF_AUTH( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD03_STUDY_STAFF_AUTH");
   }

   public SdtB402_SD03_STUDY_STAFF_AUTH( StructSdtB402_SD03_STUDY_STAFF_AUTH struct )
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
               gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_CD") )
            {
               gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "AUTH_NM") )
            {
               gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
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
         sName = "B402_SD03_STUDY_STAFF_AUTH" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("AUTH_CD", GXutil.rtrim( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("AUTH_NM", GXutil.rtrim( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime) )
      {
         oWriter.writeStartElement("UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("CHECK", gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check, false);
      AddObjectProperty("AUTH_CD", gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd, false);
      AddObjectProperty("AUTH_NM", gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm, false);
      datetime_STZ = gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime ;
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
      AddObjectProperty("UPD_DATETIME", sDateCnv, false);
   }

   public boolean getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check ;
   }

   public void setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check( boolean value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check = value ;
   }

   public String getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd ;
   }

   public void setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd( String value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd = value ;
   }

   public String getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm ;
   }

   public void setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm( String value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm = value ;
   }

   public java.util.Date getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime( )
   {
      return gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime ;
   }

   public void setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime( java.util.Date value )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd = "" ;
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm = "" ;
      gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtB402_SD03_STUDY_STAFF_AUTH Clone( )
   {
      return (SdtB402_SD03_STUDY_STAFF_AUTH)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD03_STUDY_STAFF_AUTH struct )
   {
      setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check(struct.getCheck());
      setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd(struct.getAuth_cd());
      setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm(struct.getAuth_nm());
      setgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime(struct.getUpd_datetime());
   }

   public StructSdtB402_SD03_STUDY_STAFF_AUTH getStruct( )
   {
      StructSdtB402_SD03_STUDY_STAFF_AUTH struct = new StructSdtB402_SD03_STUDY_STAFF_AUTH ();
      struct.setCheck(getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check());
      struct.setAuth_cd(getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd());
      struct.setAuth_nm(getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm());
      struct.setUpd_datetime(getgxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Upd_datetime ;
   protected java.util.Date datetime_STZ ;
   protected boolean gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Check ;
   protected String gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_cd ;
   protected String gxTv_SdtB402_SD03_STUDY_STAFF_AUTH_Auth_nm ;
}

