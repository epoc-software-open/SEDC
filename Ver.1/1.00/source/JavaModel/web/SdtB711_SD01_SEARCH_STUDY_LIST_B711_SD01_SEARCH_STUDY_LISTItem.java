import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem( )
   {
      this(  new ModelContext(SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem.class));
   }

   public SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem( ModelContext context )
   {
      super( context, "SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem");
   }

   public SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem( int remoteHandle ,
                                                                          ModelContext context )
   {
      super( remoteHandle, context, "SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem");
   }

   public SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem( StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem struct )
   {
      this();
      setStruct(struct);
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
               gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM21_STUDY_NM") )
            {
               gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = oReader.getValue() ;
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
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "B711_SD01_SEARCH_STUDY_LIST.B711_SD01_SEARCH_STUDY_LISTItem" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "SmartEDC_SHIZUOKA" ;
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
      oWriter.writeElement("TBM21_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM21_STUDY_NM", GXutil.rtrim( gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM21_STUDY_ID", gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id);
      AddObjectProperty("TBM21_STUDY_NM", gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm);
   }

   public long getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( )
   {
      return gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id ;
   }

   public void setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id( long value )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id = value ;
   }

   public void setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id_SetNull( )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id = 0 ;
   }

   public boolean getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm( )
   {
      return gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm ;
   }

   public void setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm( String value )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = value ;
   }

   public void setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm_SetNull( )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = "" ;
   }

   public boolean getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = "" ;
      sTagName = "" ;
   }

   public SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem Clone( )
   {
      return (SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem struct )
   {
      setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id(struct.getTbm21_study_id());
      setgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm(struct.getTbm21_study_nm());
   }

   public StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem getStruct( )
   {
      StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem struct = new StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem ();
      struct.setTbm21_study_id(getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id());
      struct.setTbm21_study_nm(getgxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id ;
   protected String sTagName ;
   protected String gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm ;
}

