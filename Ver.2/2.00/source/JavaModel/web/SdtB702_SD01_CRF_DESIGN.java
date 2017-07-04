/*
               File: SdtB702_SD01_CRF_DESIGN
        Description: B702_SD01_CRF_DESIGN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtB702_SD01_CRF_DESIGN extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB702_SD01_CRF_DESIGN( )
   {
      this(  new ModelContext(SdtB702_SD01_CRF_DESIGN.class));
   }

   public SdtB702_SD01_CRF_DESIGN( ModelContext context )
   {
      super( context, "SdtB702_SD01_CRF_DESIGN");
   }

   public SdtB702_SD01_CRF_DESIGN( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle, context, "SdtB702_SD01_CRF_DESIGN");
   }

   public SdtB702_SD01_CRF_DESIGN( StructSdtB702_SD01_CRF_DESIGN struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_CD") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "SAVE_DISP_FLG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_DISP_FLG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DEL_DISP_FLG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MOVE_VALUE") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Move_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_PRESENT_FLG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "STUDY_NM") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_NM") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "USER_INFO") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_User_info = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MAP_DISP_FLG") )
            {
               gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRF_ITEMS") )
            {
               if ( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items == null )
               {
                  gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = new GxObjectCollection(SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem.class, "B702_SD02_CRF_ITEM_DESIGN.B702_SD02_CRF_ITEM_DESIGNItem", "tablet-EDC_GXXEV3U3", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items.readxml(oReader, "CRF_ITEMS") ;
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
         sName = "B702_SD01_CRF_DESIGN" ;
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
      oWriter.writeElement("RESULT_CD", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("SAVE_DISP_FLG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MEMO_DISP_FLG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("DEL_DISP_FLG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MOVE_VALUE", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Move_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_PRESENT_FLG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("STUDY_NM", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("CRF_NM", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("USER_INFO", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_User_info));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("MAP_DISP_FLG", GXutil.rtrim( gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "tablet-EDC_GXXEV3U3" ;
         }
         else
         {
            sNameSpace1 = "tablet-EDC_GXXEV3U3" ;
         }
         gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items.writexml(oWriter, "CRF_ITEMS", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("RESULT_CD", gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd, false);
      AddObjectProperty("ERR_MSG", gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg, false);
      AddObjectProperty("SAVE_DISP_FLG", gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg, false);
      AddObjectProperty("MEMO_DISP_FLG", gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg, false);
      AddObjectProperty("DEL_DISP_FLG", gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg, false);
      AddObjectProperty("MOVE_VALUE", gxTv_SdtB702_SD01_CRF_DESIGN_Move_value, false);
      AddObjectProperty("CRF_PRESENT_FLG", gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg, false);
      AddObjectProperty("STUDY_NM", gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm, false);
      AddObjectProperty("CRF_NM", gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm, false);
      AddObjectProperty("USER_INFO", gxTv_SdtB702_SD01_CRF_DESIGN_User_info, false);
      AddObjectProperty("MAP_DISP_FLG", gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg, false);
      if ( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items != null )
      {
         AddObjectProperty("CRF_ITEMS", gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items, false);
      }
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Move_value ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Move_value = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_User_info( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_User_info ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_User_info( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_User_info = value ;
   }

   public String getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( )
   {
      return gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg( String value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg = value ;
   }

   public GxObjectCollection getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items( )
   {
      if ( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items == null )
      {
         gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = new GxObjectCollection(SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem.class, "B702_SD02_CRF_ITEM_DESIGN.B702_SD02_CRF_ITEM_DESIGNItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      }
      return gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items( GxObjectCollection value )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = value ;
   }

   public void setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_SetNull( )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = null ;
   }

   public boolean getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_IsNull( )
   {
      if ( gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items == null )
      {
         return true ;
      }
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Move_value = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_User_info = "" ;
      gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg = "" ;
      sTagName = "" ;
   }

   public SdtB702_SD01_CRF_DESIGN Clone( )
   {
      return (SdtB702_SD01_CRF_DESIGN)(clone()) ;
   }

   public void setStruct( StructSdtB702_SD01_CRF_DESIGN struct )
   {
      setgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd(struct.getResult_cd());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg(struct.getErr_msg());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg(struct.getSave_disp_flg());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg(struct.getMemo_disp_flg());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg(struct.getDel_disp_flg());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Move_value(struct.getMove_value());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg(struct.getCrf_present_flg());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm(struct.getStudy_nm());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm(struct.getCrf_nm());
      setgxTv_SdtB702_SD01_CRF_DESIGN_User_info(struct.getUser_info());
      setgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg(struct.getMap_disp_flg());
      GxObjectCollection gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux = new GxObjectCollection();
      GxObjectCollection gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux1 = new GxObjectCollection();
      gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux1.setStruct(struct.getCrf_items());
      for (int i = 0; i < gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux1.size(); i++)
      {
         gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux.add(new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem((StructSdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux1.elementAt(i)));
      }
      setgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items(gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items_aux);
   }

   public StructSdtB702_SD01_CRF_DESIGN getStruct( )
   {
      StructSdtB702_SD01_CRF_DESIGN struct = new StructSdtB702_SD01_CRF_DESIGN ();
      struct.setResult_cd(getgxTv_SdtB702_SD01_CRF_DESIGN_Result_cd());
      struct.setErr_msg(getgxTv_SdtB702_SD01_CRF_DESIGN_Err_msg());
      struct.setSave_disp_flg(getgxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg());
      struct.setMemo_disp_flg(getgxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg());
      struct.setDel_disp_flg(getgxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg());
      struct.setMove_value(getgxTv_SdtB702_SD01_CRF_DESIGN_Move_value());
      struct.setCrf_present_flg(getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg());
      struct.setStudy_nm(getgxTv_SdtB702_SD01_CRF_DESIGN_Study_nm());
      struct.setCrf_nm(getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm());
      struct.setUser_info(getgxTv_SdtB702_SD01_CRF_DESIGN_User_info());
      struct.setMap_disp_flg(getgxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg());
      Vector aux_vectorgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = getgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items().getStruct();
      Vector aux_vector1gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items = new Vector();
      for (int i = 0; i < aux_vectorgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items.size(); i++)
      {
         aux_vector1gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items.addElement(((SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem)aux_vectorgxTv_SdtB702_SD01_CRF_DESIGN_Crf_items.elementAt(i)).getStruct());
      }
      struct.setCrf_items(aux_vector1gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items);
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Result_cd ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Err_msg ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Save_disp_flg ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Memo_disp_flg ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Del_disp_flg ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Move_value ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Crf_present_flg ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Study_nm ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Crf_nm ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_User_info ;
   protected String gxTv_SdtB702_SD01_CRF_DESIGN_Map_disp_flg ;
   protected GxObjectCollection gxTv_SdtB702_SD01_CRF_DESIGN_Crf_items=null ;
}

