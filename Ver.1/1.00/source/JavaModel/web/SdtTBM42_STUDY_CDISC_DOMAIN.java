import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBM42_STUDY_CDISC_DOMAIN extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM42_STUDY_CDISC_DOMAIN( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM42_STUDY_CDISC_DOMAIN.class));
   }

   public SdtTBM42_STUDY_CDISC_DOMAIN( int remoteHandle ,
                                       ModelContext context )
   {
      super( context, "SdtTBM42_STUDY_CDISC_DOMAIN");
      initialize( remoteHandle) ;
   }

   public SdtTBM42_STUDY_CDISC_DOMAIN( int remoteHandle ,
                                       StructSdtTBM42_STUDY_CDISC_DOMAIN struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( long AV886TBM42_STUDY_ID ,
                     String AV893TBM42_DOM_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV886TBM42_STUDY_ID),AV893TBM42_DOM_CD});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_STUDY_ID") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_CD") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_ENM") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_JNM") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_GRP_NM") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_NOTE") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_ORDER") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DEL_FLG") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_USER_ID") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_PROG_NM") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_USER_ID") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_PROG_NM") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_CNT") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_STUDY_ID_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_CD_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_ENM_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_JNM_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_GRP_NM_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_NOTE_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_ORDER_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DEL_FLG_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_CNT_Z") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_ENM_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_JNM_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DOM_GRP_NM_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_NOTE_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_ORDER_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_DEL_FLG_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM42_UPD_CNT_N") )
            {
               gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM42_STUDY_CDISC_DOMAIN" ;
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
      oWriter.writeElement("TBM42_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_CD", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_ENM", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_JNM", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_GRP_NM", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_NOTE", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime) )
      {
         oWriter.writeStartElement("TBM42_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM42_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM42_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime) )
      {
         oWriter.writeStartElement("TBM42_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM42_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM42_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_CD_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_ENM_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_JNM_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_GRP_NM_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_NOTE_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TBM42_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM42_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM42_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TBM42_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM42_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM42_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_ENM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_JNM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DOM_GRP_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_NOTE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM42_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM42_STUDY_ID", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id);
      AddObjectProperty("TBM42_DOM_CD", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd);
      AddObjectProperty("TBM42_DOM_ENM", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm);
      AddObjectProperty("TBM42_DOM_JNM", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm);
      AddObjectProperty("TBM42_DOM_GRP_NM", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm);
      AddObjectProperty("TBM42_NOTE", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note);
      AddObjectProperty("TBM42_ORDER", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order);
      AddObjectProperty("TBM42_DEL_FLG", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM42_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TBM42_CRT_USER_ID", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id);
      AddObjectProperty("TBM42_CRT_PROG_NM", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM42_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBM42_UPD_USER_ID", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id);
      AddObjectProperty("TBM42_UPD_PROG_NM", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm);
      AddObjectProperty("TBM42_UPD_CNT", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized);
      AddObjectProperty("TBM42_STUDY_ID_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z);
      AddObjectProperty("TBM42_DOM_CD_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z);
      AddObjectProperty("TBM42_DOM_ENM_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z);
      AddObjectProperty("TBM42_DOM_JNM_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z);
      AddObjectProperty("TBM42_DOM_GRP_NM_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z);
      AddObjectProperty("TBM42_NOTE_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z);
      AddObjectProperty("TBM42_ORDER_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z);
      AddObjectProperty("TBM42_DEL_FLG_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM42_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM42_CRT_USER_ID_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z);
      AddObjectProperty("TBM42_CRT_PROG_NM_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM42_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM42_UPD_USER_ID_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z);
      AddObjectProperty("TBM42_UPD_PROG_NM_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z);
      AddObjectProperty("TBM42_UPD_CNT_Z", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z);
      AddObjectProperty("TBM42_DOM_ENM_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N);
      AddObjectProperty("TBM42_DOM_JNM_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N);
      AddObjectProperty("TBM42_DOM_GRP_NM_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N);
      AddObjectProperty("TBM42_NOTE_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N);
      AddObjectProperty("TBM42_ORDER_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N);
      AddObjectProperty("TBM42_DEL_FLG_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N);
      AddObjectProperty("TBM42_CRT_DATETIME_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N);
      AddObjectProperty("TBM42_CRT_USER_ID_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N);
      AddObjectProperty("TBM42_CRT_PROG_NM_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N);
      AddObjectProperty("TBM42_UPD_DATETIME_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N);
      AddObjectProperty("TBM42_UPD_USER_ID_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N);
      AddObjectProperty("TBM42_UPD_PROG_NM_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N);
      AddObjectProperty("TBM42_UPD_CNT_N", gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N);
   }

   public long getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id( long value )
   {
      if ( gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id != value )
      {
         gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = "INS" ;
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id = value ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd, value) != 0 )
      {
         gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = "INS" ;
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd = value ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order( int value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order = 0 ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized( short value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z( int value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N( )
   {
      return gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm42_study_cdisc_domain_bc obj ;
      obj = new tbm42_study_cdisc_domain_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z = "" ;
      gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTBM42_STUDY_CDISC_DOMAIN Clone( )
   {
      SdtTBM42_STUDY_CDISC_DOMAIN sdt ;
      tbm42_study_cdisc_domain_bc obj ;
      sdt = (SdtTBM42_STUDY_CDISC_DOMAIN)(clone()) ;
      obj = (tbm42_study_cdisc_domain_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM42_STUDY_CDISC_DOMAIN struct )
   {
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id(struct.getTbm42_study_id());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd(struct.getTbm42_dom_cd());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm(struct.getTbm42_dom_enm());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm(struct.getTbm42_dom_jnm());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm(struct.getTbm42_dom_grp_nm());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note(struct.getTbm42_note());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order(struct.getTbm42_order());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg(struct.getTbm42_del_flg());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime(struct.getTbm42_crt_datetime());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id(struct.getTbm42_crt_user_id());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm(struct.getTbm42_crt_prog_nm());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime(struct.getTbm42_upd_datetime());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id(struct.getTbm42_upd_user_id());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm(struct.getTbm42_upd_prog_nm());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt(struct.getTbm42_upd_cnt());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode(struct.getMode());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized(struct.getInitialized());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z(struct.getTbm42_study_id_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z(struct.getTbm42_dom_cd_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z(struct.getTbm42_dom_enm_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z(struct.getTbm42_dom_jnm_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z(struct.getTbm42_dom_grp_nm_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z(struct.getTbm42_note_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z(struct.getTbm42_order_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z(struct.getTbm42_del_flg_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z(struct.getTbm42_crt_datetime_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z(struct.getTbm42_crt_user_id_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z(struct.getTbm42_crt_prog_nm_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z(struct.getTbm42_upd_datetime_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z(struct.getTbm42_upd_user_id_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z(struct.getTbm42_upd_prog_nm_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z(struct.getTbm42_upd_cnt_Z());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N(struct.getTbm42_dom_enm_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N(struct.getTbm42_dom_jnm_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N(struct.getTbm42_dom_grp_nm_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N(struct.getTbm42_note_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N(struct.getTbm42_order_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N(struct.getTbm42_del_flg_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N(struct.getTbm42_crt_datetime_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N(struct.getTbm42_crt_user_id_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N(struct.getTbm42_crt_prog_nm_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N(struct.getTbm42_upd_datetime_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N(struct.getTbm42_upd_user_id_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N(struct.getTbm42_upd_prog_nm_N());
      setgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N(struct.getTbm42_upd_cnt_N());
   }

   public StructSdtTBM42_STUDY_CDISC_DOMAIN getStruct( )
   {
      StructSdtTBM42_STUDY_CDISC_DOMAIN struct = new StructSdtTBM42_STUDY_CDISC_DOMAIN ();
      struct.setTbm42_study_id(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id());
      struct.setTbm42_dom_cd(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd());
      struct.setTbm42_dom_enm(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm());
      struct.setTbm42_dom_jnm(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm());
      struct.setTbm42_dom_grp_nm(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm());
      struct.setTbm42_note(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note());
      struct.setTbm42_order(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order());
      struct.setTbm42_del_flg(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg());
      struct.setTbm42_crt_datetime(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime());
      struct.setTbm42_crt_user_id(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id());
      struct.setTbm42_crt_prog_nm(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm());
      struct.setTbm42_upd_datetime(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime());
      struct.setTbm42_upd_user_id(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id());
      struct.setTbm42_upd_prog_nm(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm());
      struct.setTbm42_upd_cnt(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt());
      struct.setMode(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode());
      struct.setInitialized(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized());
      struct.setTbm42_study_id_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z());
      struct.setTbm42_dom_cd_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z());
      struct.setTbm42_dom_enm_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z());
      struct.setTbm42_dom_jnm_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z());
      struct.setTbm42_dom_grp_nm_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z());
      struct.setTbm42_note_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z());
      struct.setTbm42_order_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z());
      struct.setTbm42_del_flg_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z());
      struct.setTbm42_crt_datetime_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z());
      struct.setTbm42_crt_user_id_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z());
      struct.setTbm42_crt_prog_nm_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z());
      struct.setTbm42_upd_datetime_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z());
      struct.setTbm42_upd_user_id_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z());
      struct.setTbm42_upd_prog_nm_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z());
      struct.setTbm42_upd_cnt_Z(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z());
      struct.setTbm42_dom_enm_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N());
      struct.setTbm42_dom_jnm_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N());
      struct.setTbm42_dom_grp_nm_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N());
      struct.setTbm42_note_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N());
      struct.setTbm42_order_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N());
      struct.setTbm42_del_flg_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N());
      struct.setTbm42_crt_datetime_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N());
      struct.setTbm42_crt_user_id_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N());
      struct.setTbm42_crt_prog_nm_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N());
      struct.setTbm42_upd_datetime_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N());
      struct.setTbm42_upd_user_id_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N());
      struct.setTbm42_upd_prog_nm_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N());
      struct.setTbm42_upd_cnt_N(getgxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_N ;
   private byte gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_N ;
   private short gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Initialized ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order ;
   private int gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_order_Z ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_study_id_Z ;
   private long gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_cnt_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_datetime_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_cd_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_enm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_jnm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_dom_grp_nm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_note_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_del_flg_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_user_id_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_crt_prog_nm_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_user_id_Z ;
   private String gxTv_SdtTBM42_STUDY_CDISC_DOMAIN_Tbm42_upd_prog_nm_Z ;
}

