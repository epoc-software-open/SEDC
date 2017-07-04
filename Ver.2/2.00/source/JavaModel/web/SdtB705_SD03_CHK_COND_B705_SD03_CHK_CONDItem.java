/*
               File: SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem
        Description: B705_SD03_CHK_COND
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem( )
   {
      this(  new ModelContext(SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem.class));
   }

   public SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem( ModelContext context )
   {
      super( context, "SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem");
   }

   public SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem( int remoteHandle ,
                                                        ModelContext context )
   {
      super( remoteHandle, context, "SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem");
   }

   public SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem( StructSdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "PRIOR_NO") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "COND_DIV") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "EXPRESSION") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_CD") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_NM") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_DIV") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TEXT_MAXLENGTH") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DECIMAL_DIGITS") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ENABLED_FLG") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "NUMERIC_RANGE_FLG") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAX_VALUE") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MIN_VALUE") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_DIV") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg = oReader.getValue() ;
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
         sName = "B705_SD03_CHK_COND.B705_SD03_CHK_CONDItem" ;
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
      oWriter.writeElement("PRIOR_NO", GXutil.trim( GXutil.str( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("COND_DIV", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("EXPRESSION", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_NM", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_DIV", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TEXT_MAXLENGTH", GXutil.trim( GXutil.str( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DECIMAL_DIGITS", GXutil.trim( GXutil.str( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ENABLED_FLG", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("NUMERIC_RANGE_FLG", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MAX_VALUE", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MIN_VALUE", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_DIV", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg));
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
      AddObjectProperty("PRIOR_NO", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no, false);
      AddObjectProperty("COND_DIV", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div, false);
      AddObjectProperty("EXPRESSION", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression, false);
      AddObjectProperty("CRF_ITEM_CD", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd, false);
      AddObjectProperty("CRF_ITEM_NM", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm, false);
      AddObjectProperty("CRF_ITEM_DIV", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div, false);
      AddObjectProperty("CRF_ITEM_GRP_CD", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd, false);
      AddObjectProperty("REQUIRED_INPUT_FLG", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg, false);
      AddObjectProperty("TEXT_MAXLENGTH", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength, false);
      AddObjectProperty("DECIMAL_DIGITS", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits, false);
      AddObjectProperty("ENABLED_FLG", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg, false);
      AddObjectProperty("NUMERIC_RANGE_FLG", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg, false);
      AddObjectProperty("MAX_VALUE", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value, false);
      AddObjectProperty("MIN_VALUE", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value, false);
      AddObjectProperty("ERR_DIV", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div, false);
      AddObjectProperty("ERR_MSG", gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg, false);
   }

   public byte getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no( byte value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg = value ;
   }

   public short getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength( short value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength = value ;
   }

   public byte getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits( byte value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div = value ;
   }

   public String getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg( )
   {
      return gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg ;
   }

   public void setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg( String value )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div = "" ;
      gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg = "" ;
      sTagName = "" ;
   }

   public SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem Clone( )
   {
      return (SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem)(clone()) ;
   }

   public void setStruct( StructSdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem struct )
   {
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no(struct.getPrior_no());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div(struct.getCond_div());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression(struct.getExpression());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd(struct.getCrf_item_cd());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm(struct.getCrf_item_nm());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div(struct.getCrf_item_div());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd(struct.getCrf_item_grp_cd());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg(struct.getRequired_input_flg());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength(struct.getText_maxlength());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits(struct.getDecimal_digits());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg(struct.getEnabled_flg());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg(struct.getNumeric_range_flg());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value(struct.getMax_value());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value(struct.getMin_value());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div(struct.getErr_div());
      setgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg(struct.getErr_msg());
   }

   public StructSdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem getStruct( )
   {
      StructSdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem struct = new StructSdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem ();
      struct.setPrior_no(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no());
      struct.setCond_div(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div());
      struct.setExpression(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression());
      struct.setCrf_item_cd(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd());
      struct.setCrf_item_nm(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm());
      struct.setCrf_item_div(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div());
      struct.setCrf_item_grp_cd(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd());
      struct.setRequired_input_flg(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg());
      struct.setText_maxlength(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength());
      struct.setDecimal_digits(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits());
      struct.setEnabled_flg(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg());
      struct.setNumeric_range_flg(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg());
      struct.setMax_value(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value());
      struct.setMin_value(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value());
      struct.setErr_div(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div());
      struct.setErr_msg(getgxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg());
      return struct ;
   }

   protected byte gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Prior_no ;
   protected byte gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Decimal_digits ;
   protected short gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Text_maxlength ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Cond_div ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Expression ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_cd ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_nm ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_div ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Required_input_flg ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Enabled_flg ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Numeric_range_flg ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Max_value ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Min_value ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_div ;
   protected String gxTv_SdtB705_SD03_CHK_COND_B705_SD03_CHK_CONDItem_Err_msg ;
}

