import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem( )
   {
      this(  new ModelContext(SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem.class));
   }

   public SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem( ModelContext context )
   {
      super( context, "SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem");
   }

   public SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem( int remoteHandle ,
                                                                ModelContext context )
   {
      super( remoteHandle, context, "SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem");
   }

   public SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem( StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "CHECK") )
            {
               gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_CD") )
            {
               gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DOM_JNM") )
            {
               gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "DEL_FLG") )
            {
               gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "BTN_DISP_FLG") )
            {
               gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg = (boolean)((((GXutil.strcmp(oReader.getValue(), "true")==0)||(GXutil.strcmp(oReader.getValue(), "1")==0) ? 1 : 0)==0)?false:true) ;
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
         sName = "B402_SD06_STUDY_DOMAIN.B402_SD06_STUDY_DOMAINItem" ;
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
      oWriter.writeElement("CHECK", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DOM_CD", GXutil.rtrim( gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DOM_JNM", GXutil.rtrim( gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("DEL_FLG", GXutil.rtrim( gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("BTN_DISP_FLG", GXutil.rtrim( GXutil.booltostr( gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("CHECK", gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check);
      AddObjectProperty("DOM_CD", gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd);
      AddObjectProperty("DOM_JNM", gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm);
      AddObjectProperty("DEL_FLG", gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg);
      AddObjectProperty("BTN_DISP_FLG", gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg);
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check( boolean value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check = value ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check_SetNull( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check = false ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = value ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd_SetNull( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = "" ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = value ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm_SetNull( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = "" ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg( String value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = value ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg_SetNull( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = "" ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg_IsNull( )
   {
      return false ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg( )
   {
      return gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg( boolean value )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg = value ;
   }

   public void setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg_SetNull( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg = false ;
   }

   public boolean getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd = "" ;
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm = "" ;
      gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg = "" ;
      sTagName = "" ;
   }

   public SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem Clone( )
   {
      return (SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem)(clone()) ;
   }

   public void setStruct( StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem struct )
   {
      setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check(struct.getCheck());
      setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd(struct.getDom_cd());
      setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm(struct.getDom_jnm());
      setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg(struct.getDel_flg());
      setgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg(struct.getBtn_disp_flg());
   }

   public StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem getStruct( )
   {
      StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem struct = new StructSdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem ();
      struct.setCheck(getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check());
      struct.setDom_cd(getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd());
      struct.setDom_jnm(getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm());
      struct.setDel_flg(getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg());
      struct.setBtn_disp_flg(getgxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Check ;
   protected boolean gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Btn_disp_flg ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_cd ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Dom_jnm ;
   protected String gxTv_SdtB402_SD06_STUDY_DOMAIN_B402_SD06_STUDY_DOMAINItem_Del_flg ;
}

