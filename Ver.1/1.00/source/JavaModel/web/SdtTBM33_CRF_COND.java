import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtTBM33_CRF_COND extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM33_CRF_COND( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM33_CRF_COND.class));
   }

   public SdtTBM33_CRF_COND( int remoteHandle ,
                             ModelContext context )
   {
      super( context, "SdtTBM33_CRF_COND");
      initialize( remoteHandle) ;
   }

   public SdtTBM33_CRF_COND( int remoteHandle ,
                             StructSdtTBM33_CRF_COND struct )
   {
      this(remoteHandle);
      setStruct(struct);
   }

   public void Load( long AV246TBM33_STUDY_ID ,
                     short AV247TBM33_CRF_ID ,
                     short AV248TBM33_COND_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV246TBM33_STUDY_ID),new Short(AV247TBM33_CRF_ID),new Short(AV248TBM33_COND_NO)});
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_STUDY_ID") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ID") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NO") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NM") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_EXPRESSION") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_expression = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_DIV") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ITEM_CD") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_PRIOR_NO") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_DIV") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_MSG") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ENABLED_FLG") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_REQUIRED_INPUT_FLG") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_NUMERIC_RANGE_FLG") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_DEL_FLG") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_USER_ID") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_PROG_NM") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_USER_ID") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_PROG_NM") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_CNT") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM33_CRF_COND_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM33_CRF_COND_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_STUDY_ID_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ID_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NO_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NM_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_EXPRESSION_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_DIV_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ITEM_CD_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_PRIOR_NO_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_DIV_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_MSG_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ENABLED_FLG_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_REQUIRED_INPUT_FLG_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_NUMERIC_RANGE_FLG_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_DEL_FLG_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_CNT_Z") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_NM_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_EXPRESSION_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_COND_DIV_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRF_ITEM_CD_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_PRIOR_NO_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_DIV_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ERR_MSG_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_ENABLED_FLG_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_REQUIRED_INPUT_FLG_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_NUMERIC_RANGE_FLG_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_DEL_FLG_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM33_UPD_CNT_N") )
            {
               gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM33_CRF_COND" ;
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
      oWriter.writeElement("TBM33_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_NO", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_NM", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_EXPRESSION", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_expression));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_DIV", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRF_ITEM_CD", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_PRIOR_NO", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_DIV", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_err_div));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_MSG", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ENABLED_FLG", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_REQUIRED_INPUT_FLG", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_NUMERIC_RANGE_FLG", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime) )
      {
         oWriter.writeStartElement("TBM33_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM33_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime) )
      {
         oWriter.writeStartElement("TBM33_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM33_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Mode));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Initialized, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_NM_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_EXPRESSION_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_DIV_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRF_ITEM_CD_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_PRIOR_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_DIV_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_MSG_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ENABLED_FLG_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_REQUIRED_INPUT_FLG_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_NUMERIC_RANGE_FLG_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z) )
      {
         oWriter.writeStartElement("TBM33_CRT_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_CRT_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM33_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z) )
      {
         oWriter.writeStartElement("TBM33_UPD_DATETIME_Z");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM33_UPD_DATETIME_Z", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
         {
            oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
         }
      }
      oWriter.writeElement("TBM33_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_EXPRESSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_COND_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRF_ITEM_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_PRIOR_NO_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ERR_MSG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_ENABLED_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_REQUIRED_INPUT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_NUMERIC_RANGE_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeElement("TBM33_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "SmartEDC_SHIZUOKA") != 0 )
      {
         oWriter.writeAttribute("xmlns", "SmartEDC_SHIZUOKA");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      AddObjectProperty("TBM33_STUDY_ID", gxTv_SdtTBM33_CRF_COND_Tbm33_study_id);
      AddObjectProperty("TBM33_CRF_ID", gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id);
      AddObjectProperty("TBM33_COND_NO", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no);
      AddObjectProperty("TBM33_COND_NM", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm);
      AddObjectProperty("TBM33_EXPRESSION", gxTv_SdtTBM33_CRF_COND_Tbm33_expression);
      AddObjectProperty("TBM33_COND_DIV", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div);
      AddObjectProperty("TBM33_CRF_ITEM_CD", gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd);
      AddObjectProperty("TBM33_PRIOR_NO", gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no);
      AddObjectProperty("TBM33_ERR_DIV", gxTv_SdtTBM33_CRF_COND_Tbm33_err_div);
      AddObjectProperty("TBM33_ERR_MSG", gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg);
      AddObjectProperty("TBM33_ENABLED_FLG", gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg);
      AddObjectProperty("TBM33_REQUIRED_INPUT_FLG", gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg);
      AddObjectProperty("TBM33_NUMERIC_RANGE_FLG", gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg);
      AddObjectProperty("TBM33_DEL_FLG", gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM33_CRT_DATETIME", sDateCnv);
      AddObjectProperty("TBM33_CRT_USER_ID", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id);
      AddObjectProperty("TBM33_CRT_PROG_NM", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM33_UPD_DATETIME", sDateCnv);
      AddObjectProperty("TBM33_UPD_USER_ID", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id);
      AddObjectProperty("TBM33_UPD_PROG_NM", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm);
      AddObjectProperty("TBM33_UPD_CNT", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt);
      AddObjectProperty("Mode", gxTv_SdtTBM33_CRF_COND_Mode);
      AddObjectProperty("Initialized", gxTv_SdtTBM33_CRF_COND_Initialized);
      AddObjectProperty("TBM33_STUDY_ID_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z);
      AddObjectProperty("TBM33_CRF_ID_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z);
      AddObjectProperty("TBM33_COND_NO_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z);
      AddObjectProperty("TBM33_COND_NM_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z);
      AddObjectProperty("TBM33_EXPRESSION_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z);
      AddObjectProperty("TBM33_COND_DIV_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z);
      AddObjectProperty("TBM33_CRF_ITEM_CD_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z);
      AddObjectProperty("TBM33_PRIOR_NO_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z);
      AddObjectProperty("TBM33_ERR_DIV_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z);
      AddObjectProperty("TBM33_ERR_MSG_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z);
      AddObjectProperty("TBM33_ENABLED_FLG_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z);
      AddObjectProperty("TBM33_REQUIRED_INPUT_FLG_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z);
      AddObjectProperty("TBM33_NUMERIC_RANGE_FLG_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z);
      AddObjectProperty("TBM33_DEL_FLG_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM33_CRT_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM33_CRT_USER_ID_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z);
      AddObjectProperty("TBM33_CRT_PROG_NM_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z);
      sDateCnv = "" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "-" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + "T" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      sDateCnv = sDateCnv + ":" ;
      sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z), 10, 0)) ;
      sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
      AddObjectProperty("TBM33_UPD_DATETIME_Z", sDateCnv);
      AddObjectProperty("TBM33_UPD_USER_ID_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z);
      AddObjectProperty("TBM33_UPD_PROG_NM_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z);
      AddObjectProperty("TBM33_UPD_CNT_Z", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z);
      AddObjectProperty("TBM33_COND_NM_N", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N);
      AddObjectProperty("TBM33_EXPRESSION_N", gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N);
      AddObjectProperty("TBM33_COND_DIV_N", gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N);
      AddObjectProperty("TBM33_CRF_ITEM_CD_N", gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N);
      AddObjectProperty("TBM33_PRIOR_NO_N", gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N);
      AddObjectProperty("TBM33_ERR_DIV_N", gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N);
      AddObjectProperty("TBM33_ERR_MSG_N", gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N);
      AddObjectProperty("TBM33_ENABLED_FLG_N", gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N);
      AddObjectProperty("TBM33_REQUIRED_INPUT_FLG_N", gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N);
      AddObjectProperty("TBM33_NUMERIC_RANGE_FLG_N", gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N);
      AddObjectProperty("TBM33_DEL_FLG_N", gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N);
      AddObjectProperty("TBM33_CRT_DATETIME_N", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N);
      AddObjectProperty("TBM33_CRT_USER_ID_N", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N);
      AddObjectProperty("TBM33_CRT_PROG_NM_N", gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N);
      AddObjectProperty("TBM33_UPD_DATETIME_N", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N);
      AddObjectProperty("TBM33_UPD_USER_ID_N", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N);
      AddObjectProperty("TBM33_UPD_PROG_NM_N", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N);
      AddObjectProperty("TBM33_UPD_CNT_N", gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N);
   }

   public long getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_study_id ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id( long value )
   {
      if ( gxTv_SdtTBM33_CRF_COND_Tbm33_study_id != value )
      {
         gxTv_SdtTBM33_CRF_COND_Mode = "INS" ;
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM33_CRF_COND_Tbm33_study_id = value ;
   }

   public short getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id( short value )
   {
      if ( gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id != value )
      {
         gxTv_SdtTBM33_CRF_COND_Mode = "INS" ;
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id = value ;
   }

   public short getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no( short value )
   {
      if ( gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no != value )
      {
         gxTv_SdtTBM33_CRF_COND_Mode = "INS" ;
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no = value ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_expression( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_expression ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_div ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt( long value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Mode( )
   {
      return gxTv_SdtTBM33_CRF_COND_Mode ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Mode( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Mode = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Mode_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM33_CRF_COND_Initialized( )
   {
      return gxTv_SdtTBM33_CRF_COND_Initialized ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Initialized( short value )
   {
      gxTv_SdtTBM33_CRF_COND_Initialized = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Initialized_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z( long value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z( short value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z( short value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N( )
   {
      return gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm33_crf_cond_bc obj ;
      obj = new tbm33_crf_cond_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm = "" ;
      gxTv_SdtTBM33_CRF_COND_Mode = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z = "" ;
      gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
   }

   public SdtTBM33_CRF_COND Clone( )
   {
      SdtTBM33_CRF_COND sdt ;
      tbm33_crf_cond_bc obj ;
      sdt = (SdtTBM33_CRF_COND)(clone()) ;
      obj = (tbm33_crf_cond_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM33_CRF_COND struct )
   {
      setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(struct.getTbm33_study_id());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id(struct.getTbm33_crf_id());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no(struct.getTbm33_cond_no());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm(struct.getTbm33_cond_nm());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_expression(struct.getTbm33_expression());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div(struct.getTbm33_cond_div());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd(struct.getTbm33_crf_item_cd());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no(struct.getTbm33_prior_no());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div(struct.getTbm33_err_div());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg(struct.getTbm33_err_msg());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg(struct.getTbm33_enabled_flg());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg(struct.getTbm33_required_input_flg());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg(struct.getTbm33_numeric_range_flg());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg(struct.getTbm33_del_flg());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime(struct.getTbm33_crt_datetime());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id(struct.getTbm33_crt_user_id());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm(struct.getTbm33_crt_prog_nm());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime(struct.getTbm33_upd_datetime());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id(struct.getTbm33_upd_user_id());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm(struct.getTbm33_upd_prog_nm());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt(struct.getTbm33_upd_cnt());
      setgxTv_SdtTBM33_CRF_COND_Mode(struct.getMode());
      setgxTv_SdtTBM33_CRF_COND_Initialized(struct.getInitialized());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z(struct.getTbm33_study_id_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z(struct.getTbm33_crf_id_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z(struct.getTbm33_cond_no_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z(struct.getTbm33_cond_nm_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z(struct.getTbm33_expression_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z(struct.getTbm33_cond_div_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z(struct.getTbm33_crf_item_cd_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z(struct.getTbm33_prior_no_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z(struct.getTbm33_err_div_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z(struct.getTbm33_err_msg_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z(struct.getTbm33_enabled_flg_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z(struct.getTbm33_required_input_flg_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z(struct.getTbm33_numeric_range_flg_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z(struct.getTbm33_del_flg_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z(struct.getTbm33_crt_datetime_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z(struct.getTbm33_crt_user_id_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z(struct.getTbm33_crt_prog_nm_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z(struct.getTbm33_upd_datetime_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z(struct.getTbm33_upd_user_id_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z(struct.getTbm33_upd_prog_nm_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z(struct.getTbm33_upd_cnt_Z());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N(struct.getTbm33_cond_nm_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N(struct.getTbm33_expression_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N(struct.getTbm33_cond_div_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N(struct.getTbm33_crf_item_cd_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N(struct.getTbm33_prior_no_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N(struct.getTbm33_err_div_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N(struct.getTbm33_err_msg_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N(struct.getTbm33_enabled_flg_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N(struct.getTbm33_required_input_flg_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N(struct.getTbm33_numeric_range_flg_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N(struct.getTbm33_del_flg_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N(struct.getTbm33_crt_datetime_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N(struct.getTbm33_crt_user_id_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N(struct.getTbm33_crt_prog_nm_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N(struct.getTbm33_upd_datetime_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N(struct.getTbm33_upd_user_id_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N(struct.getTbm33_upd_prog_nm_N());
      setgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N(struct.getTbm33_upd_cnt_N());
   }

   public StructSdtTBM33_CRF_COND getStruct( )
   {
      StructSdtTBM33_CRF_COND struct = new StructSdtTBM33_CRF_COND ();
      struct.setTbm33_study_id(getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id());
      struct.setTbm33_crf_id(getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id());
      struct.setTbm33_cond_no(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no());
      struct.setTbm33_cond_nm(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm());
      struct.setTbm33_expression(getgxTv_SdtTBM33_CRF_COND_Tbm33_expression());
      struct.setTbm33_cond_div(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div());
      struct.setTbm33_crf_item_cd(getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd());
      struct.setTbm33_prior_no(getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no());
      struct.setTbm33_err_div(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div());
      struct.setTbm33_err_msg(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg());
      struct.setTbm33_enabled_flg(getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg());
      struct.setTbm33_required_input_flg(getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg());
      struct.setTbm33_numeric_range_flg(getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg());
      struct.setTbm33_del_flg(getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg());
      struct.setTbm33_crt_datetime(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime());
      struct.setTbm33_crt_user_id(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id());
      struct.setTbm33_crt_prog_nm(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm());
      struct.setTbm33_upd_datetime(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime());
      struct.setTbm33_upd_user_id(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id());
      struct.setTbm33_upd_prog_nm(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm());
      struct.setTbm33_upd_cnt(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt());
      struct.setMode(getgxTv_SdtTBM33_CRF_COND_Mode());
      struct.setInitialized(getgxTv_SdtTBM33_CRF_COND_Initialized());
      struct.setTbm33_study_id_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z());
      struct.setTbm33_crf_id_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z());
      struct.setTbm33_cond_no_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z());
      struct.setTbm33_cond_nm_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z());
      struct.setTbm33_expression_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z());
      struct.setTbm33_cond_div_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z());
      struct.setTbm33_crf_item_cd_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z());
      struct.setTbm33_prior_no_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z());
      struct.setTbm33_err_div_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z());
      struct.setTbm33_err_msg_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z());
      struct.setTbm33_enabled_flg_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z());
      struct.setTbm33_required_input_flg_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z());
      struct.setTbm33_numeric_range_flg_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z());
      struct.setTbm33_del_flg_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z());
      struct.setTbm33_crt_datetime_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z());
      struct.setTbm33_crt_user_id_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z());
      struct.setTbm33_crt_prog_nm_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z());
      struct.setTbm33_upd_datetime_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z());
      struct.setTbm33_upd_user_id_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z());
      struct.setTbm33_upd_prog_nm_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z());
      struct.setTbm33_upd_cnt_Z(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z());
      struct.setTbm33_cond_nm_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N());
      struct.setTbm33_expression_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_expression_N());
      struct.setTbm33_cond_div_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N());
      struct.setTbm33_crf_item_cd_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N());
      struct.setTbm33_prior_no_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N());
      struct.setTbm33_err_div_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N());
      struct.setTbm33_err_msg_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N());
      struct.setTbm33_enabled_flg_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N());
      struct.setTbm33_required_input_flg_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N());
      struct.setTbm33_numeric_range_flg_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N());
      struct.setTbm33_del_flg_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N());
      struct.setTbm33_crt_datetime_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N());
      struct.setTbm33_crt_user_id_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N());
      struct.setTbm33_crt_prog_nm_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N());
      struct.setTbm33_upd_datetime_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N());
      struct.setTbm33_upd_user_id_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N());
      struct.setTbm33_upd_prog_nm_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N());
      struct.setTbm33_upd_cnt_N(getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_Z ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_expression_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_prior_no_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_N ;
   private byte gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_N ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no ;
   private short gxTv_SdtTBM33_CRF_COND_Initialized ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_crf_id_Z ;
   private short gxTv_SdtTBM33_CRF_COND_Tbm33_cond_no_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_study_id ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_study_id_Z ;
   private long gxTv_SdtTBM33_CRF_COND_Tbm33_upd_cnt_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_expression ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_div ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_expression_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_cond_div_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crf_item_cd_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_div_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_err_msg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_enabled_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_required_input_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_numeric_range_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_del_flg_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_user_id_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_crt_prog_nm_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_user_id_Z ;
   private String gxTv_SdtTBM33_CRF_COND_Tbm33_upd_prog_nm_Z ;
}

