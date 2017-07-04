import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtB707_SD01_GET_MEMO_RTN extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtB707_SD01_GET_MEMO_RTN( )
   {
      this(  new ModelContext(SdtB707_SD01_GET_MEMO_RTN.class));
   }

   public SdtB707_SD01_GET_MEMO_RTN( ModelContext context )
   {
      super( context, "SdtB707_SD01_GET_MEMO_RTN");
   }

   public SdtB707_SD01_GET_MEMO_RTN( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle, context, "SdtB707_SD01_GET_MEMO_RTN");
   }

   public SdtB707_SD01_GET_MEMO_RTN( StructSdtB707_SD01_GET_MEMO_RTN struct )
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "RESULT_CD") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "ERR_MSG") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_KBN") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO_NO") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "MEMO") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "KAKUNIN_COMMENT") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "CRT_USER_NM") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_SITE_NM") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_USER_ID") )
            {
               gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "RNRK_USERS") )
            {
               if ( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users == null )
               {
                  gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users = new GxObjectCollection(SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem.class, "B707_SD03_SEL_LIST_ITEM.B707_SD03_SEL_LIST_ITEMItem", "SmartEDC_SHIZUOKA", remoteHandle);
               }
               if ( ( oReader.getIsSimple() == 0 ) || ( oReader.getAttributeCount() > 0 ) )
               {
                  GXSoapError = gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users.readxml(oReader, "RNRK_USERS") ;
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
         sName = "B707_SD01_GET_MEMO_RTN" ;
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
      oWriter.writeElement("RESULT_CD", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("ERR_MSG", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO_KBN", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("MEMO", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("KAKUNIN_COMMENT", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("CRT_USER_NM", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("RNRK_SITE_NM", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("RNRK_USER_ID", GXutil.rtrim( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users != null )
      {
         String sNameSpace1 ;
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") == 0 )
         {
            sNameSpace1 = "[*:nosend]" + "SmartEDC_SHIZUOKA" ;
         }
         else
         {
            sNameSpace1 = "SmartEDC_SHIZUOKA" ;
         }
         gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users.writexml(oWriter, "RNRK_USERS", sNameSpace1);
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("RESULT_CD", gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd);
      AddObjectProperty("ERR_MSG", gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg);
      AddObjectProperty("MEMO_KBN", gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn);
      AddObjectProperty("MEMO_NO", gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no);
      AddObjectProperty("MEMO", gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo);
      AddObjectProperty("KAKUNIN_COMMENT", gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment);
      AddObjectProperty("CRT_USER_NM", gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm);
      AddObjectProperty("RNRK_SITE_NM", gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm);
      AddObjectProperty("RNRK_USER_ID", gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id);
      if ( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users != null )
      {
         AddObjectProperty("RNRK_USERS", gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users);
      }
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no( short value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no = (short)(0) ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = "" ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id_IsNull( )
   {
      return false ;
   }

   public GxObjectCollection getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users( )
   {
      if ( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users == null )
      {
         gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users = new GxObjectCollection(SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem.class, "B707_SD03_SEL_LIST_ITEM.B707_SD03_SEL_LIST_ITEMItem", "SmartEDC_SHIZUOKA", remoteHandle);
      }
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users( GxObjectCollection value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users = value ;
   }

   public void setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users_SetNull( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users = null ;
   }

   public boolean getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users_IsNull( )
   {
      if ( gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users == null )
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
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = "" ;
      sTagName = "" ;
   }

   public SdtB707_SD01_GET_MEMO_RTN Clone( )
   {
      return (SdtB707_SD01_GET_MEMO_RTN)(clone()) ;
   }

   public void setStruct( StructSdtB707_SD01_GET_MEMO_RTN struct )
   {
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd(struct.getResult_cd());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg(struct.getErr_msg());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn(struct.getMemo_kbn());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no(struct.getMemo_no());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo(struct.getMemo());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment(struct.getKakunin_comment());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm(struct.getCrt_user_nm());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm(struct.getRnrk_site_nm());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id(struct.getRnrk_user_id());
      setgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users(new GxObjectCollection(SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem.class, "B707_SD03_SEL_LIST_ITEM.B707_SD03_SEL_LIST_ITEMItem", "SmartEDC_SHIZUOKA", struct.getRnrk_users(), remoteHandle));
   }

   public StructSdtB707_SD01_GET_MEMO_RTN getStruct( )
   {
      StructSdtB707_SD01_GET_MEMO_RTN struct = new StructSdtB707_SD01_GET_MEMO_RTN ();
      struct.setResult_cd(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd());
      struct.setErr_msg(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg());
      struct.setMemo_kbn(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn());
      struct.setMemo_no(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no());
      struct.setMemo(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Memo());
      struct.setKakunin_comment(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment());
      struct.setCrt_user_nm(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm());
      struct.setRnrk_site_nm(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm());
      struct.setRnrk_user_id(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id());
      struct.setRnrk_users(getgxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users().getStruct());
      return struct ;
   }

   protected short gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no ;
   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id ;
   protected GxObjectCollection gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users=null ;
}

