/*
               File: SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem
        Description: B402_SD08_STUDY_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem( )
   {
      this(  new ModelContext(SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem.class));
   }

   public SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem( ModelContext context )
   {
      super( context, "SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem");
   }

   public SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem");
   }

   public SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem( StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_STUDY_ID") )
            {
               gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_STUDY_NM") )
            {
               gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_STATUS") )
            {
               gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_DEL_FLG") )
            {
               gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg = oReader.getValue() ;
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
         sName = "B402_SD08_STUDY_LIST.B402_SD08_STUDY_LISTItem" ;
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
      oWriter.writeElement("TBM21_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM21_STUDY_NM", GXutil.rtrim( gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM21_STATUS", GXutil.rtrim( gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM21_DEL_FLG", GXutil.rtrim( gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg));
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
      AddObjectProperty("TBM21_STUDY_ID", gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id, false);
      AddObjectProperty("TBM21_STUDY_NM", gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm, false);
      AddObjectProperty("TBM21_STATUS", gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status, false);
      AddObjectProperty("TBM21_DEL_FLG", gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg, false);
   }

   public long getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id ;
   }

   public void setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id( long value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id = value ;
   }

   public String getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm ;
   }

   public void setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm = value ;
   }

   public String getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status ;
   }

   public void setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status = value ;
   }

   public String getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg ;
   }

   public void setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm = "" ;
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status = "" ;
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg = "" ;
      sTagName = "" ;
   }

   public SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem Clone( )
   {
      return (SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem struct )
   {
      setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id(struct.getTbm21_study_id());
      setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm(struct.getTbm21_study_nm());
      setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status(struct.getTbm21_status());
      setgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg(struct.getTbm21_del_flg());
   }

   public StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem getStruct( )
   {
      StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem struct = new StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem ();
      struct.setTbm21_study_id(getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id());
      struct.setTbm21_study_nm(getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm());
      struct.setTbm21_status(getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status());
      struct.setTbm21_del_flg(getgxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id ;
   protected String sTagName ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg ;
}

