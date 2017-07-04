import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem( )
   {
      this(  new ModelContext(SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem.class));
   }

   public SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem( ModelContext context )
   {
      super( context, "SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem");
   }

   public SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem( int remoteHandle ,
                                                            ModelContext context )
   {
      super( remoteHandle, context, "SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem");
   }

   public SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem( StructSdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "UNION_COND") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "GROUP_ID") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_CD") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_VALUE") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COND") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_VAL") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KEKKA") )
            {
               gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka = (short)(GXutil.lval( oReader.getValue())) ;
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
         sName = "B705_SD04_EXPRESSION.B705_SD04_EXPRESSIONItem" ;
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
      oWriter.writeElement("UNION_COND", GXutil.rtrim( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("GROUP_ID", GXutil.trim( GXutil.str( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRF_VALUE", GXutil.rtrim( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("COND", GXutil.rtrim( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CHK_VAL", GXutil.rtrim( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KEKKA", GXutil.trim( GXutil.str( gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("UNION_COND", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond);
      AddObjectProperty("GROUP_ID", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id);
      AddObjectProperty("CRF_ITEM_CD", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd);
      AddObjectProperty("CRF_VALUE", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value);
      AddObjectProperty("COND", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond);
      AddObjectProperty("CHK_VAL", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val);
      AddObjectProperty("KEKKA", gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka);
   }

   public String getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( String value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond = "" ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id( long value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id = 0 ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd( String value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd = "" ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value( String value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value = "" ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond( String value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond = "" ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val( String value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val = "" ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( )
   {
      return gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka( short value )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka = value ;
   }

   public void setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka_SetNull( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka = (short)(0) ;
   }

   public boolean getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond = "" ;
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd = "" ;
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value = "" ;
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond = "" ;
      gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val = "" ;
      sTagName = "" ;
   }

   public SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem Clone( )
   {
      return (SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)(clone()) ;
   }

   public void setStruct( StructSdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem struct )
   {
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond(struct.getUnion_cond());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id(struct.getGroup_id());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd(struct.getCrf_item_cd());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value(struct.getCrf_value());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond(struct.getCond());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val(struct.getChk_val());
      setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka(struct.getKekka());
   }

   public StructSdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem getStruct( )
   {
      StructSdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem struct = new StructSdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem ();
      struct.setUnion_cond(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond());
      struct.setGroup_id(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id());
      struct.setCrf_item_cd(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd());
      struct.setCrf_value(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value());
      struct.setCond(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond());
      struct.setChk_val(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val());
      struct.setKekka(getgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka());
      return struct ;
   }

   protected short gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Kekka ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected long gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id ;
   protected String sTagName ;
   protected String gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond ;
   protected String gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd ;
   protected String gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_value ;
   protected String gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond ;
   protected String gxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val ;
}

