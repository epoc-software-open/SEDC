/*
               File: SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem
        Description: A_CHK_INFO_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem( )
   {
      this(  new ModelContext(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class));
   }

   public SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem( ModelContext context )
   {
      super( context, "SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem");
   }

   public SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem");
   }

   public SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem( StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "ID") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ITEM_NM") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VAL_STR") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VAL_NUM") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "VAL_DATE") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_KBN") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_NULLS") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_BYTE") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_BYTE_DEC") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_HALF") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHK_UNIT") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit = DecimalUtil.stringToDec( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_MSG") )
            {
               gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg = oReader.getValue() ;
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
         sName = "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem" ;
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
      oWriter.writeElement("ID", GXutil.rtrim( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ITEM_NM", GXutil.rtrim( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VAL_STR", GXutil.rtrim( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("VAL_NUM", GXutil.trim( GXutil.strNoRound( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num, 15, 3)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date) )
      {
         oWriter.writeStartElement("VAL_DATE");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("VAL_DATE", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("CHK_KBN", GXutil.rtrim( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_NULLS", GXutil.trim( GXutil.str( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_BYTE", GXutil.trim( GXutil.str( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_BYTE_DEC", GXutil.trim( GXutil.str( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_HALF", GXutil.trim( GXutil.str( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CHK_UNIT", GXutil.trim( GXutil.strNoRound( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit, 15, 3)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("RESULT", GXutil.trim( GXutil.str( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("RESULT_MSG", GXutil.rtrim( gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg));
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
      AddObjectProperty("ID", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id, false);
      AddObjectProperty("ITEM_NM", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm, false);
      AddObjectProperty("VAL_STR", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str, false);
      AddObjectProperty("VAL_NUM", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num, false);
      datetime_STZ = gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date ;
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
      AddObjectProperty("VAL_DATE", sDateCnv, false);
      AddObjectProperty("CHK_KBN", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn, false);
      AddObjectProperty("CHK_NULLS", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls, false);
      AddObjectProperty("CHK_BYTE", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte, false);
      AddObjectProperty("CHK_BYTE_DEC", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec, false);
      AddObjectProperty("CHK_HALF", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half, false);
      AddObjectProperty("CHK_UNIT", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit, false);
      AddObjectProperty("RESULT", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result, false);
      AddObjectProperty("RESULT_MSG", gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg, false);
   }

   public String getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id = value ;
   }

   public String getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm = value ;
   }

   public String getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str = value ;
   }

   public java.math.BigDecimal getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( java.math.BigDecimal value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num = value ;
   }

   public java.util.Date getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date( java.util.Date value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = value ;
   }

   public String getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn = value ;
   }

   public byte getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls = value ;
   }

   public short getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( short value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte = value ;
   }

   public byte getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec = value ;
   }

   public byte getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half = value ;
   }

   public java.math.BigDecimal getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( java.math.BigDecimal value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit = value ;
   }

   public byte getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result = value ;
   }

   public String getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg ;
   }

   public void setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num = DecimalUtil.ZERO ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit = DecimalUtil.ZERO ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem Clone( )
   {
      return (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)(clone()) ;
   }

   public void setStruct( StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem struct )
   {
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id(struct.getId());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(struct.getItem_nm());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(struct.getVal_str());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num(struct.getVal_num());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date(struct.getVal_date());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(struct.getChk_kbn());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls(struct.getChk_nulls());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte(struct.getChk_byte());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec(struct.getChk_byte_dec());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half(struct.getChk_half());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit(struct.getChk_unit());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result(struct.getResult());
      setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg(struct.getResult_msg());
   }

   public StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem getStruct( )
   {
      StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem struct = new StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem ();
      struct.setId(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id());
      struct.setItem_nm(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm());
      struct.setVal_str(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str());
      struct.setVal_num(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num());
      struct.setVal_date(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date());
      struct.setChk_kbn(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn());
      struct.setChk_nulls(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls());
      struct.setChk_byte(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte());
      struct.setChk_byte_dec(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec());
      struct.setChk_half(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half());
      struct.setChk_unit(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit());
      struct.setResult(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result());
      struct.setResult_msg(getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg());
      return struct ;
   }

   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result ;
   protected short gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected java.math.BigDecimal gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num ;
   protected java.math.BigDecimal gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit ;
   protected String sTagName ;
   protected String sDateCnv ;
   protected String sNumToPad ;
   protected java.util.Date gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date ;
   protected java.util.Date datetime_STZ ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg ;
}

