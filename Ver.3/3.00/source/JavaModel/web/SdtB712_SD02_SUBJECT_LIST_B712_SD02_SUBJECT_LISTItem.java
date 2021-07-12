/*
               File: SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem
        Description: B712_SD02_SUBJECT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem( )
   {
      this(  new ModelContext(SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem.class));
   }

   public SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem( ModelContext context )
   {
      super( context, "SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem");
   }

   public SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem");
   }

   public SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem( StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "SEL_FLG") )
            {
               gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SUBJECT_ID") )
            {
               gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_STUDY_ID") )
            {
               gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT01_SITE_ID") )
            {
               gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id = oReader.getValue() ;
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
         sName = "B712_SD02_SUBJECT_LIST.B712_SD02_SUBJECT_LISTItem" ;
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
      oWriter.writeElement("SEL_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT01_SITE_ID", GXutil.rtrim( gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id));
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
      AddObjectProperty("SEL_FLG", gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg, false);
      AddObjectProperty("TBT01_SUBJECT_ID", gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id, false);
      AddObjectProperty("TBT01_STUDY_ID", gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id, false);
      AddObjectProperty("TBT01_SITE_ID", gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id, false);
   }

   public boolean getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg ;
   }

   public void setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg( boolean value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg = value ;
   }

   public int getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id ;
   }

   public void setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id( int value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id = value ;
   }

   public long getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id ;
   }

   public void setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id( long value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id = value ;
   }

   public String getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id( )
   {
      return gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id ;
   }

   public void setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id( String value )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id = "" ;
      sTagName = "" ;
   }

   public SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem Clone( )
   {
      return (SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem struct )
   {
      setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg(struct.getSel_flg());
      setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id(struct.getTbt01_subject_id());
      setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id(struct.getTbt01_study_id());
      setgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id(struct.getTbt01_site_id());
   }

   public StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem getStruct( )
   {
      StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem struct = new StructSdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem ();
      struct.setSel_flg(getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg());
      struct.setTbt01_subject_id(getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id());
      struct.setTbt01_study_id(getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id());
      struct.setTbt01_site_id(getgxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_subject_id ;
   protected long gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_study_id ;
   protected String sTagName ;
   protected boolean gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD02_SUBJECT_LIST_B712_SD02_SUBJECT_LISTItem_Tbt01_site_id ;
}

