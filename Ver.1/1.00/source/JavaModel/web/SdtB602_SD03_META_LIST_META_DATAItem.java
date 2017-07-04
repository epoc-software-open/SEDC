import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB602_SD03_META_LIST_META_DATAItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB602_SD03_META_LIST_META_DATAItem( )
   {
      this(  new ModelContext(SdtB602_SD03_META_LIST_META_DATAItem.class));
   }

   public SdtB602_SD03_META_LIST_META_DATAItem( ModelContext context )
   {
      super( context, "SdtB602_SD03_META_LIST_META_DATAItem");
   }

   public SdtB602_SD03_META_LIST_META_DATAItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB602_SD03_META_LIST_META_DATAItem");
   }

   public SdtB602_SD03_META_LIST_META_DATAItem( StructSdtB602_SD03_META_LIST_META_DATAItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "METADATA_ID") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NAME") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TYPE") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DISPLAY_POS") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SELECT_CONTENT") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REQUIRE_FLAG") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DISPLAY_SEQUENCE") )
            {
               gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence = GXutil.lval( oReader.getValue()) ;
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
         sName = "B602_SD03_META_LIST.META_DATAItem" ;
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
      oWriter.writeElement("METADATA_ID", GXutil.trim( GXutil.str( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("NAME", GXutil.rtrim( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TYPE", GXutil.rtrim( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DISPLAY_POS", GXutil.rtrim( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("SELECT_CONTENT", GXutil.rtrim( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("REQUIRE_FLAG", GXutil.rtrim( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DISPLAY_SEQUENCE", GXutil.trim( GXutil.str( gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("METADATA_ID", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id);
      AddObjectProperty("NAME", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name);
      AddObjectProperty("TYPE", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type);
      AddObjectProperty("DISPLAY_POS", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos);
      AddObjectProperty("SELECT_CONTENT", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content);
      AddObjectProperty("REQUIRE_FLAG", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag);
      AddObjectProperty("DISPLAY_SEQUENCE", gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence);
   }

   public long getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id( long value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id = 0 ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = "" ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = "" ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = "" ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = "" ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag( String value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = "" ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence( )
   {
      return gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence( long value )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence = value ;
   }

   public void setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence_SetNull( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence = 0 ;
   }

   public boolean getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content = "" ;
      gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag = "" ;
      sTagName = "" ;
   }

   public SdtB602_SD03_META_LIST_META_DATAItem Clone( )
   {
      return (SdtB602_SD03_META_LIST_META_DATAItem)(clone()) ;
   }

   public void setStruct( StructSdtB602_SD03_META_LIST_META_DATAItem struct )
   {
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id(struct.getMetadata_id());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name(struct.getName());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type(struct.getType());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos(struct.getDisplay_pos());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content(struct.getSelect_content());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag(struct.getRequire_flag());
      setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence(struct.getDisplay_sequence());
   }

   public StructSdtB602_SD03_META_LIST_META_DATAItem getStruct( )
   {
      StructSdtB602_SD03_META_LIST_META_DATAItem struct = new StructSdtB602_SD03_META_LIST_META_DATAItem ();
      struct.setMetadata_id(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id());
      struct.setName(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name());
      struct.setType(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type());
      struct.setDisplay_pos(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos());
      struct.setSelect_content(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content());
      struct.setRequire_flag(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag());
      struct.setDisplay_sequence(getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id ;
   protected long gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence ;
   protected String sTagName ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content ;
   protected String gxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag ;
}

