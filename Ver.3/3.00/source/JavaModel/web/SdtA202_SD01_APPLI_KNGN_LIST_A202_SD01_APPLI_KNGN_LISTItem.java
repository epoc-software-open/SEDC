/*
               File: SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem
        Description: A202_SD01_APPLI_KNGN_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:40.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem( )
   {
      this(  new ModelContext(SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem.class));
   }

   public SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem( ModelContext context )
   {
      super( context, "SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem");
   }

   public SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem( int remoteHandle ,
                                                                      ModelContext context )
   {
      super( remoteHandle, context, "SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem");
   }

   public SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem( StructSdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM03_APP_ID") )
            {
               gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM03_APP_NM") )
            {
               gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM03_SUB_MENU_FLG") )
            {
               gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_KNGN_FLG") )
            {
               gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DSP_FLG") )
            {
               gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg = oReader.getValue() ;
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
         sName = "A202_SD01_APPLI_KNGN_LIST.A202_SD01_APPLI_KNGN_LISTItem" ;
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
      oWriter.writeElement("TAM03_APP_ID", GXutil.rtrim( gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM03_APP_NM", GXutil.rtrim( gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM03_SUB_MENU_FLG", GXutil.rtrim( gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_KNGN_FLG", GXutil.rtrim( gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DSP_FLG", GXutil.rtrim( gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg));
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
      AddObjectProperty("TAM03_APP_ID", gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id, false);
      AddObjectProperty("TAM03_APP_NM", gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm, false);
      AddObjectProperty("TAM03_SUB_MENU_FLG", gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg, false);
      AddObjectProperty("TAM05_KNGN_FLG", gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg, false);
      AddObjectProperty("DSP_FLG", gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg, false);
   }

   public String getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id( )
   {
      return gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id ;
   }

   public void setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id( String value )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id = value ;
   }

   public String getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm( )
   {
      return gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm ;
   }

   public void setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm( String value )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm = value ;
   }

   public String getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg( )
   {
      return gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg ;
   }

   public void setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg( String value )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg = value ;
   }

   public String getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( )
   {
      return gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg ;
   }

   public void setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg( String value )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg = value ;
   }

   public String getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg( )
   {
      return gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg ;
   }

   public void setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg( String value )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id = "" ;
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm = "" ;
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg = "" ;
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg = "" ;
      gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg = "" ;
      sTagName = "" ;
   }

   public SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem Clone( )
   {
      return (SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem)(clone()) ;
   }

   public void setStruct( StructSdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem struct )
   {
      setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id(struct.getTam03_app_id());
      setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm(struct.getTam03_app_nm());
      setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg(struct.getTam03_sub_menu_flg());
      setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg(struct.getTam05_kngn_flg());
      setgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg(struct.getDsp_flg());
   }

   public StructSdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem getStruct( )
   {
      StructSdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem struct = new StructSdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem ();
      struct.setTam03_app_id(getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id());
      struct.setTam03_app_nm(getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm());
      struct.setTam03_sub_menu_flg(getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg());
      struct.setTam05_kngn_flg(getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg());
      struct.setDsp_flg(getgxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_id ;
   protected String gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_app_nm ;
   protected String gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam03_sub_menu_flg ;
   protected String gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Tam05_kngn_flg ;
   protected String gxTv_SdtA202_SD01_APPLI_KNGN_LIST_A202_SD01_APPLI_KNGN_LISTItem_Dsp_flg ;
}

