import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem( )
   {
      this(  new ModelContext(SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem.class));
   }

   public SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem( ModelContext context )
   {
      super( context, "SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem");
   }

   public SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle, context, "SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem");
   }

   public SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem( StructSdtA211_SD01_IMPORT_A211_SD01_IMPORTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_DOM_CD") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_DOM_VAR_NM") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_VAR_DESC") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_SDTM_FLG") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_CDASH_FLG") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_INPUT_TYPE_DIV") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_REQUIRED_FLG") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_SAS_FIELD_NM") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_ODM_DATA_TYPE") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_NOTE") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM03_ORDER") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM02_DOM_GRP_NM") )
            {
               gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm = oReader.getValue() ;
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
         sName = "A211_SD01_IMPORT.A211_SD01_IMPORTItem" ;
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
      oWriter.writeElement("TBM03_DOM_CD", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_DOM_VAR_NM", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_VAR_DESC", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_SDTM_FLG", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_CDASH_FLG", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_INPUT_TYPE_DIV", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_REQUIRED_FLG", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_SAS_FIELD_NM", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_ODM_DATA_TYPE", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_NOTE", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM03_ORDER", GXutil.trim( GXutil.str( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM02_DOM_GRP_NM", GXutil.rtrim( gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM03_DOM_CD", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd);
      AddObjectProperty("TBM03_DOM_VAR_NM", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm);
      AddObjectProperty("TBM03_VAR_DESC", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc);
      AddObjectProperty("TBM03_SDTM_FLG", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg);
      AddObjectProperty("TBM03_CDASH_FLG", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg);
      AddObjectProperty("TBM03_INPUT_TYPE_DIV", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div);
      AddObjectProperty("TBM03_REQUIRED_FLG", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg);
      AddObjectProperty("TBM03_SAS_FIELD_NM", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm);
      AddObjectProperty("TBM03_ODM_DATA_TYPE", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type);
      AddObjectProperty("TBM03_NOTE", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note);
      AddObjectProperty("TBM03_ORDER", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order);
      AddObjectProperty("TBM02_DOM_GRP_NM", gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm);
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order( int value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order = 0 ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm( )
   {
      return gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm( String value )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm = value ;
   }

   public void setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm_SetNull( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm = "" ;
   }

   public boolean getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note = "" ;
      gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm = "" ;
      sTagName = "" ;
   }

   public SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem Clone( )
   {
      return (SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem)(clone()) ;
   }

   public void setStruct( StructSdtA211_SD01_IMPORT_A211_SD01_IMPORTItem struct )
   {
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd(struct.getTbm03_dom_cd());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm(struct.getTbm03_dom_var_nm());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc(struct.getTbm03_var_desc());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg(struct.getTbm03_sdtm_flg());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg(struct.getTbm03_cdash_flg());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div(struct.getTbm03_input_type_div());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg(struct.getTbm03_required_flg());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm(struct.getTbm03_sas_field_nm());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type(struct.getTbm03_odm_data_type());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note(struct.getTbm03_note());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order(struct.getTbm03_order());
      setgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm(struct.getTbm02_dom_grp_nm());
   }

   public StructSdtA211_SD01_IMPORT_A211_SD01_IMPORTItem getStruct( )
   {
      StructSdtA211_SD01_IMPORT_A211_SD01_IMPORTItem struct = new StructSdtA211_SD01_IMPORT_A211_SD01_IMPORTItem ();
      struct.setTbm03_dom_cd(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd());
      struct.setTbm03_dom_var_nm(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm());
      struct.setTbm03_var_desc(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc());
      struct.setTbm03_sdtm_flg(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg());
      struct.setTbm03_cdash_flg(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg());
      struct.setTbm03_input_type_div(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div());
      struct.setTbm03_required_flg(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg());
      struct.setTbm03_sas_field_nm(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm());
      struct.setTbm03_odm_data_type(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type());
      struct.setTbm03_note(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note());
      struct.setTbm03_order(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order());
      struct.setTbm02_dom_grp_nm(getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected int gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order ;
   protected String sTagName ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note ;
   protected String gxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm ;
}

