/*
               File: SdtTAM05_APPLI_KNGN
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:1.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTAM05_APPLI_KNGN extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTAM05_APPLI_KNGN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTAM05_APPLI_KNGN.class));
   }

   public SdtTAM05_APPLI_KNGN( int remoteHandle ,
                               ModelContext context )
   {
      super( context, "SdtTAM05_APPLI_KNGN");
      initialize( remoteHandle) ;
   }

   public SdtTAM05_APPLI_KNGN( int remoteHandle ,
                               StructSdtTAM05_APPLI_KNGN struct )
   {
      this(remoteHandle);
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

   public void Load( String AV13TAM04_AUTH_CD ,
                     String AV12TAM03_APP_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {AV13TAM04_AUTH_CD,AV12TAM03_APP_ID});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TAM04_AUTH_CD", String.class}, new Object[]{"TAM03_APP_ID", String.class}}) ;
   }

   public GxObjectCollection GetMessages( )
   {
      short item = 1 ;
      GxObjectCollection msgs = new GxObjectCollection(SdtMessages_Message.class, "Messages.Message", "Genexus", remoteHandle) ;
      SdtMessages_Message m1 ;
      IGxSilentTrn trn = getTransaction() ;
      com.genexus.internet.MsgList msgList = trn.GetMessages() ;
      while ( item <= msgList.getItemCount() )
      {
         m1 = new SdtMessages_Message(remoteHandle, context) ;
         m1.setgxTv_SdtMessages_Message_Id( msgList.getItemValue(item) );
         m1.setgxTv_SdtMessages_Message_Description( msgList.getItemText(item) );
         m1.setgxTv_SdtMessages_Message_Type( (byte)(msgList.getItemType(item)) );
         msgs.add(m1, 0);
         item = (short)(item+1) ;
      }
      return msgs ;
   }

   public com.genexus.util.GXProperties getMetadata( )
   {
      com.genexus.util.GXProperties metadata = new com.genexus.util.GXProperties() ;
      metadata.set("Name", "TAM05_APPLI_KNGN");
      metadata.set("BT", "TAM05_APPLI_KNGN");
      metadata.set("PK", "[ \"TAM04_AUTH_CD\",\"TAM03_APP_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TAM03_APP_ID\" ],\"FKMap\":[  ] },{ \"FK\":[ \"TAM04_AUTH_CD\" ],\"FKMap\":[  ] } ]");
      metadata.set("AllowInsert", "True");
      metadata.set("AllowUpdate", "True");
      metadata.set("AllowDelete", "True");
      return metadata ;
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_CD") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM03_APP_ID") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_KNGN_FLG") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_DEL_FLG") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_USER_ID") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_PROG_NM") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_USER_ID") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_PROG_NM") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_CNT") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM04_AUTH_CD_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM03_APP_ID_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_KNGN_FLG_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_DEL_FLG_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_USER_ID_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_USER_ID_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_CNT_Z") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_KNGN_FLG_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_DEL_FLG_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_DATETIME_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_USER_ID_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_CRT_PROG_NM_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_DATETIME_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_USER_ID_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_PROG_NM_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TAM05_UPD_CNT_N") )
            {
               gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TAM05_APPLI_KNGN" ;
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
      oWriter.writeElement("TAM04_AUTH_CD", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM03_APP_ID", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_KNGN_FLG", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_DEL_FLG", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime) )
      {
         oWriter.writeStartElement("TAM05_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM05_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TAM05_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime) )
      {
         oWriter.writeStartElement("TAM05_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TAM05_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TAM05_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TAM05_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM04_AUTH_CD_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM03_APP_ID_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_KNGN_FLG_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TAM05_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TAM05_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TAM05_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TAM05_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TAM05_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TAM05_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_KNGN_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TAM05_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      AddObjectProperty("TAM04_AUTH_CD", gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd, false);
      AddObjectProperty("TAM03_APP_ID", gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id, false);
      AddObjectProperty("TAM05_KNGN_FLG", gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg, false);
      AddObjectProperty("TAM05_DEL_FLG", gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg, false);
      datetime_STZ = gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime ;
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
      AddObjectProperty("TAM05_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TAM05_CRT_USER_ID", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id, false);
      AddObjectProperty("TAM05_CRT_PROG_NM", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime ;
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
      AddObjectProperty("TAM05_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TAM05_UPD_USER_ID", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id, false);
      AddObjectProperty("TAM05_UPD_PROG_NM", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm, false);
      AddObjectProperty("TAM05_UPD_CNT", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTAM05_APPLI_KNGN_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTAM05_APPLI_KNGN_Initialized, false);
         AddObjectProperty("TAM04_AUTH_CD_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z, false);
         AddObjectProperty("TAM03_APP_ID_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z, false);
         AddObjectProperty("TAM05_KNGN_FLG_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z, false);
         AddObjectProperty("TAM05_DEL_FLG_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
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
         AddObjectProperty("TAM05_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TAM05_CRT_USER_ID_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z, false);
         AddObjectProperty("TAM05_CRT_PROG_NM_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
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
         AddObjectProperty("TAM05_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TAM05_UPD_USER_ID_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z, false);
         AddObjectProperty("TAM05_UPD_PROG_NM_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z, false);
         AddObjectProperty("TAM05_UPD_CNT_Z", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z, false);
         AddObjectProperty("TAM05_KNGN_FLG_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N, false);
         AddObjectProperty("TAM05_DEL_FLG_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N, false);
         AddObjectProperty("TAM05_CRT_DATETIME_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N, false);
         AddObjectProperty("TAM05_CRT_USER_ID_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N, false);
         AddObjectProperty("TAM05_CRT_PROG_NM_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N, false);
         AddObjectProperty("TAM05_UPD_DATETIME_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N, false);
         AddObjectProperty("TAM05_UPD_USER_ID_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N, false);
         AddObjectProperty("TAM05_UPD_PROG_NM_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N, false);
         AddObjectProperty("TAM05_UPD_CNT_N", gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N, false);
      }
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd, value) != 0 )
      {
         gxTv_SdtTAM05_APPLI_KNGN_Mode = "INS" ;
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd = value ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id, value) != 0 )
      {
         gxTv_SdtTAM05_APPLI_KNGN_Mode = "INS" ;
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id = value ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt( long value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Mode( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Mode ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Mode( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Mode = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Mode_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Mode = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTAM05_APPLI_KNGN_Initialized( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Initialized ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Initialized( short value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Initialized = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Initialized_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Initialized_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z( long value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N( )
   {
      return gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N( byte value )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tam05_appli_kngn_bc obj ;
      obj = new tam05_appli_kngn_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Mode = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z = "" ;
      gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTAM05_APPLI_KNGN Clone( )
   {
      SdtTAM05_APPLI_KNGN sdt ;
      tam05_appli_kngn_bc obj ;
      sdt = (SdtTAM05_APPLI_KNGN)(clone()) ;
      obj = (tam05_appli_kngn_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTAM05_APPLI_KNGN struct )
   {
      setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd(struct.getTam04_auth_cd());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id(struct.getTam03_app_id());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg(struct.getTam05_kngn_flg());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg(struct.getTam05_del_flg());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime(struct.getTam05_crt_datetime());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id(struct.getTam05_crt_user_id());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm(struct.getTam05_crt_prog_nm());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime(struct.getTam05_upd_datetime());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id(struct.getTam05_upd_user_id());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm(struct.getTam05_upd_prog_nm());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt(struct.getTam05_upd_cnt());
      setgxTv_SdtTAM05_APPLI_KNGN_Mode(struct.getMode());
      setgxTv_SdtTAM05_APPLI_KNGN_Initialized(struct.getInitialized());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z(struct.getTam04_auth_cd_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z(struct.getTam03_app_id_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z(struct.getTam05_kngn_flg_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z(struct.getTam05_del_flg_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z(struct.getTam05_crt_datetime_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z(struct.getTam05_crt_user_id_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z(struct.getTam05_crt_prog_nm_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z(struct.getTam05_upd_datetime_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z(struct.getTam05_upd_user_id_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z(struct.getTam05_upd_prog_nm_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z(struct.getTam05_upd_cnt_Z());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N(struct.getTam05_kngn_flg_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N(struct.getTam05_del_flg_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N(struct.getTam05_crt_datetime_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N(struct.getTam05_crt_user_id_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N(struct.getTam05_crt_prog_nm_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N(struct.getTam05_upd_datetime_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N(struct.getTam05_upd_user_id_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N(struct.getTam05_upd_prog_nm_N());
      setgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N(struct.getTam05_upd_cnt_N());
   }

   public StructSdtTAM05_APPLI_KNGN getStruct( )
   {
      StructSdtTAM05_APPLI_KNGN struct = new StructSdtTAM05_APPLI_KNGN ();
      struct.setTam04_auth_cd(getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd());
      struct.setTam03_app_id(getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id());
      struct.setTam05_kngn_flg(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg());
      struct.setTam05_del_flg(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg());
      struct.setTam05_crt_datetime(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime());
      struct.setTam05_crt_user_id(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id());
      struct.setTam05_crt_prog_nm(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm());
      struct.setTam05_upd_datetime(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime());
      struct.setTam05_upd_user_id(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id());
      struct.setTam05_upd_prog_nm(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm());
      struct.setTam05_upd_cnt(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt());
      struct.setMode(getgxTv_SdtTAM05_APPLI_KNGN_Mode());
      struct.setInitialized(getgxTv_SdtTAM05_APPLI_KNGN_Initialized());
      struct.setTam04_auth_cd_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z());
      struct.setTam03_app_id_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z());
      struct.setTam05_kngn_flg_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z());
      struct.setTam05_del_flg_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z());
      struct.setTam05_crt_datetime_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z());
      struct.setTam05_crt_user_id_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z());
      struct.setTam05_crt_prog_nm_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z());
      struct.setTam05_upd_datetime_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z());
      struct.setTam05_upd_user_id_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z());
      struct.setTam05_upd_prog_nm_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z());
      struct.setTam05_upd_cnt_Z(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z());
      struct.setTam05_kngn_flg_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N());
      struct.setTam05_del_flg_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N());
      struct.setTam05_crt_datetime_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N());
      struct.setTam05_crt_user_id_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N());
      struct.setTam05_crt_prog_nm_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N());
      struct.setTam05_upd_datetime_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N());
      struct.setTam05_upd_user_id_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N());
      struct.setTam05_upd_prog_nm_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N());
      struct.setTam05_upd_cnt_N(getgxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_N ;
   private byte gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_N ;
   private short gxTv_SdtTAM05_APPLI_KNGN_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt ;
   private long gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_cnt_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam04_auth_cd_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam03_app_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_kngn_flg_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_del_flg_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_user_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_crt_prog_nm_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_user_id_Z ;
   private String gxTv_SdtTAM05_APPLI_KNGN_Tam05_upd_prog_nm_Z ;
}

