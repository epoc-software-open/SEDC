/*
               File: SdtTBM31_CRF
        Description: CRFÉ}ÉXÉ^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:25.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBM31_CRF extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBM31_CRF( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBM31_CRF.class));
   }

   public SdtTBM31_CRF( int remoteHandle ,
                        ModelContext context )
   {
      super( context, "SdtTBM31_CRF");
      initialize( remoteHandle) ;
   }

   public SdtTBM31_CRF( int remoteHandle ,
                        StructSdtTBM31_CRF struct )
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

   public void Load( long AV68TBM31_STUDY_ID ,
                     short AV69TBM31_CRF_ID )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV68TBM31_STUDY_ID),new Short(AV69TBM31_CRF_ID)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBM31_STUDY_ID", long.class}, new Object[]{"TBM31_CRF_ID", short.class}}) ;
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
      metadata.set("Name", "TBM31_CRF");
      metadata.set("BT", "TBM31_CRF");
      metadata.set("PK", "[ \"TBM31_STUDY_ID\",\"TBM31_CRF_ID\" ]");
      metadata.set("PKAssigned", "[ \"TBM31_STUDY_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TBM21_STUDY_ID\" ],\"FKMap\":[ \"TBM31_STUDY_ID-TBM21_STUDY_ID\" ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STUDY_ID") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_snm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_GRID_SIZE") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_grid_size = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_ORDER") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_order = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_VISIT_NO") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_visit_no = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_DOMAIN_CD") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STATUS") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_status = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_NOTE") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_note = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_FLG") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_flg = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_MAX") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_max = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DM_EXCP_NO_DISP_FLG") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEL_FLG") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_USER_ID") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_PROG_NM") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_USER_ID") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_PROG_NM") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_CNT") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBM31_CRF_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBM31_CRF_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STUDY_ID_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_ID_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_GRID_SIZE_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_ORDER_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_order_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_VISIT_NO_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_DOMAIN_CD_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STATUS_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_status_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_NOTE_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_note_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_FLG_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_MAX_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DM_EXCP_NO_DISP_FLG_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEL_FLG_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_CNT_Z") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_NM_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRF_SNM_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_GRID_SIZE_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_ORDER_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_order_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_VISIT_NO_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEF_DOMAIN_CD_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_STATUS_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_status_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_NOTE_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_note_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_FLG_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_REPEAT_MAX_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DM_EXCP_NO_DISP_FLG_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_DEL_FLG_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_DATETIME_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_USER_ID_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_DATETIME_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_USER_ID_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBM31_UPD_CNT_N") )
            {
               gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBM31_CRF" ;
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
      oWriter.writeElement("TBM31_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_NM", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crf_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRF_SNM", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crf_snm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_GRID_SIZE", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_grid_size, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_ORDER", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_order, 5, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_DEF_VISIT_NO", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_def_visit_no, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_DEF_DOMAIN_CD", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_STATUS", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_status));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_NOTE", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_note));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_REPEAT_FLG", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_flg, 1, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_REPEAT_MAX", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_max, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_DM_EXCP_NO_DISP_FLG", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_DEL_FLG", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM31_CRF_Tbm31_crt_datetime) )
      {
         oWriter.writeStartElement("TBM31_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM31_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM31_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBM31_CRF_Tbm31_upd_datetime) )
      {
         oWriter.writeStartElement("TBM31_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBM31_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBM31_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBM31_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBM31_CRF_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRF_NM_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRF_SNM_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_GRID_SIZE_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_ORDER_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_order_Z, 5, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEF_VISIT_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEF_DOMAIN_CD_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_STATUS_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_status_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_NOTE_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_note_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_REPEAT_FLG_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_REPEAT_MAX_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DM_EXCP_NO_DISP_FLG_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBM31_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM31_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM31_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBM31_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBM31_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBM31_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRF_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRF_SNM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_GRID_SIZE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_grid_size_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_ORDER_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_order_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEF_VISIT_NO_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEF_DOMAIN_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_STATUS_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_status_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_NOTE_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_note_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_REPEAT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_REPEAT_MAX_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DM_EXCP_NO_DISP_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBM31_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBM31_STUDY_ID", gxTv_SdtTBM31_CRF_Tbm31_study_id, false);
      AddObjectProperty("TBM31_CRF_ID", gxTv_SdtTBM31_CRF_Tbm31_crf_id, false);
      AddObjectProperty("TBM31_CRF_NM", gxTv_SdtTBM31_CRF_Tbm31_crf_nm, false);
      AddObjectProperty("TBM31_CRF_SNM", gxTv_SdtTBM31_CRF_Tbm31_crf_snm, false);
      AddObjectProperty("TBM31_GRID_SIZE", gxTv_SdtTBM31_CRF_Tbm31_grid_size, false);
      AddObjectProperty("TBM31_ORDER", gxTv_SdtTBM31_CRF_Tbm31_order, false);
      AddObjectProperty("TBM31_DEF_VISIT_NO", gxTv_SdtTBM31_CRF_Tbm31_def_visit_no, false);
      AddObjectProperty("TBM31_DEF_DOMAIN_CD", gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd, false);
      AddObjectProperty("TBM31_STATUS", gxTv_SdtTBM31_CRF_Tbm31_status, false);
      AddObjectProperty("TBM31_NOTE", gxTv_SdtTBM31_CRF_Tbm31_note, false);
      AddObjectProperty("TBM31_REPEAT_FLG", gxTv_SdtTBM31_CRF_Tbm31_repeat_flg, false);
      AddObjectProperty("TBM31_REPEAT_MAX", gxTv_SdtTBM31_CRF_Tbm31_repeat_max, false);
      AddObjectProperty("TBM31_DM_EXCP_NO_DISP_FLG", gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg, false);
      AddObjectProperty("TBM31_DEL_FLG", gxTv_SdtTBM31_CRF_Tbm31_del_flg, false);
      datetime_STZ = gxTv_SdtTBM31_CRF_Tbm31_crt_datetime ;
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
      AddObjectProperty("TBM31_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM31_CRT_USER_ID", gxTv_SdtTBM31_CRF_Tbm31_crt_user_id, false);
      AddObjectProperty("TBM31_CRT_PROG_NM", gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBM31_CRF_Tbm31_upd_datetime ;
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
      AddObjectProperty("TBM31_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBM31_UPD_USER_ID", gxTv_SdtTBM31_CRF_Tbm31_upd_user_id, false);
      AddObjectProperty("TBM31_UPD_PROG_NM", gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm, false);
      AddObjectProperty("TBM31_UPD_CNT", gxTv_SdtTBM31_CRF_Tbm31_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBM31_CRF_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBM31_CRF_Initialized, false);
         AddObjectProperty("TBM31_STUDY_ID_Z", gxTv_SdtTBM31_CRF_Tbm31_study_id_Z, false);
         AddObjectProperty("TBM31_CRF_ID_Z", gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z, false);
         AddObjectProperty("TBM31_CRF_NM_Z", gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z, false);
         AddObjectProperty("TBM31_CRF_SNM_Z", gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z, false);
         AddObjectProperty("TBM31_GRID_SIZE_Z", gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z, false);
         AddObjectProperty("TBM31_ORDER_Z", gxTv_SdtTBM31_CRF_Tbm31_order_Z, false);
         AddObjectProperty("TBM31_DEF_VISIT_NO_Z", gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z, false);
         AddObjectProperty("TBM31_DEF_DOMAIN_CD_Z", gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z, false);
         AddObjectProperty("TBM31_STATUS_Z", gxTv_SdtTBM31_CRF_Tbm31_status_Z, false);
         AddObjectProperty("TBM31_NOTE_Z", gxTv_SdtTBM31_CRF_Tbm31_note_Z, false);
         AddObjectProperty("TBM31_REPEAT_FLG_Z", gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z, false);
         AddObjectProperty("TBM31_REPEAT_MAX_Z", gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z, false);
         AddObjectProperty("TBM31_DM_EXCP_NO_DISP_FLG_Z", gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z, false);
         AddObjectProperty("TBM31_DEL_FLG_Z", gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
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
         AddObjectProperty("TBM31_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM31_CRT_USER_ID_Z", gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z, false);
         AddObjectProperty("TBM31_CRT_PROG_NM_Z", gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
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
         AddObjectProperty("TBM31_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBM31_UPD_USER_ID_Z", gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z, false);
         AddObjectProperty("TBM31_UPD_PROG_NM_Z", gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z, false);
         AddObjectProperty("TBM31_UPD_CNT_Z", gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z, false);
         AddObjectProperty("TBM31_CRF_NM_N", gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N, false);
         AddObjectProperty("TBM31_CRF_SNM_N", gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N, false);
         AddObjectProperty("TBM31_GRID_SIZE_N", gxTv_SdtTBM31_CRF_Tbm31_grid_size_N, false);
         AddObjectProperty("TBM31_ORDER_N", gxTv_SdtTBM31_CRF_Tbm31_order_N, false);
         AddObjectProperty("TBM31_DEF_VISIT_NO_N", gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N, false);
         AddObjectProperty("TBM31_DEF_DOMAIN_CD_N", gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N, false);
         AddObjectProperty("TBM31_STATUS_N", gxTv_SdtTBM31_CRF_Tbm31_status_N, false);
         AddObjectProperty("TBM31_NOTE_N", gxTv_SdtTBM31_CRF_Tbm31_note_N, false);
         AddObjectProperty("TBM31_REPEAT_FLG_N", gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N, false);
         AddObjectProperty("TBM31_REPEAT_MAX_N", gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N, false);
         AddObjectProperty("TBM31_DM_EXCP_NO_DISP_FLG_N", gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N, false);
         AddObjectProperty("TBM31_DEL_FLG_N", gxTv_SdtTBM31_CRF_Tbm31_del_flg_N, false);
         AddObjectProperty("TBM31_CRT_DATETIME_N", gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N, false);
         AddObjectProperty("TBM31_CRT_USER_ID_N", gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N, false);
         AddObjectProperty("TBM31_CRT_PROG_NM_N", gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N, false);
         AddObjectProperty("TBM31_UPD_DATETIME_N", gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N, false);
         AddObjectProperty("TBM31_UPD_USER_ID_N", gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N, false);
         AddObjectProperty("TBM31_UPD_PROG_NM_N", gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N, false);
         AddObjectProperty("TBM31_UPD_CNT_N", gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBM31_CRF_Tbm31_study_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_study_id ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_study_id( long value )
   {
      if ( gxTv_SdtTBM31_CRF_Tbm31_study_id != value )
      {
         gxTv_SdtTBM31_CRF_Mode = "INS" ;
         this.setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_order_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_status_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_note_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM31_CRF_Tbm31_study_id = value ;
   }

   public short getgxTv_SdtTBM31_CRF_Tbm31_crf_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_id ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_id( short value )
   {
      if ( gxTv_SdtTBM31_CRF_Tbm31_crf_id != value )
      {
         gxTv_SdtTBM31_CRF_Mode = "INS" ;
         this.setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_order_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_status_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_note_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBM31_CRF_Tbm31_crf_id = value ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crf_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crf_snm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM31_CRF_Tbm31_grid_size( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_grid_size = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_grid_size = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_grid_size_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM31_CRF_Tbm31_order( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_order = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_order = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_order_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_status( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_status = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_status = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_status_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_note( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_note = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_note = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_note_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_max( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_del_flg( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Mode( )
   {
      return gxTv_SdtTBM31_CRF_Mode ;
   }

   public void setgxTv_SdtTBM31_CRF_Mode( String value )
   {
      gxTv_SdtTBM31_CRF_Mode = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Mode_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Mode = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM31_CRF_Initialized( )
   {
      return gxTv_SdtTBM31_CRF_Initialized ;
   }

   public void setgxTv_SdtTBM31_CRF_Initialized( short value )
   {
      gxTv_SdtTBM31_CRF_Initialized = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Initialized_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM31_CRF_Tbm31_study_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_study_id_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_study_id_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_study_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z( short value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM31_CRF_Tbm31_order_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order_Z( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_order_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z( int value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_status_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_status_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_note_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_note_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z( long value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_grid_size_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_grid_size_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_grid_size_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_grid_size_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_grid_size_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_order_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_order_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_order_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_order_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_order_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_status_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_status_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_status_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_status_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_status_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_note_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_note_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_note_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_note_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_note_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_del_flg_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_del_flg_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_del_flg_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N( )
   {
      return gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N( byte value )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbm31_crf_bc obj ;
      obj = new tbm31_crf_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_status = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_note = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm = "" ;
      gxTv_SdtTBM31_CRF_Mode = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_status_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_note_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z = "" ;
      gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBM31_CRF Clone( )
   {
      SdtTBM31_CRF sdt ;
      tbm31_crf_bc obj ;
      sdt = (SdtTBM31_CRF)(clone()) ;
      obj = (tbm31_crf_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBM31_CRF struct )
   {
      setgxTv_SdtTBM31_CRF_Tbm31_study_id(struct.getTbm31_study_id());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_id(struct.getTbm31_crf_id());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_nm(struct.getTbm31_crf_nm());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_snm(struct.getTbm31_crf_snm());
      setgxTv_SdtTBM31_CRF_Tbm31_grid_size(struct.getTbm31_grid_size());
      setgxTv_SdtTBM31_CRF_Tbm31_order(struct.getTbm31_order());
      setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no(struct.getTbm31_def_visit_no());
      setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd(struct.getTbm31_def_domain_cd());
      setgxTv_SdtTBM31_CRF_Tbm31_status(struct.getTbm31_status());
      setgxTv_SdtTBM31_CRF_Tbm31_note(struct.getTbm31_note());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg(struct.getTbm31_repeat_flg());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_max(struct.getTbm31_repeat_max());
      setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg(struct.getTbm31_dm_excp_no_disp_flg());
      setgxTv_SdtTBM31_CRF_Tbm31_del_flg(struct.getTbm31_del_flg());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime(struct.getTbm31_crt_datetime());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id(struct.getTbm31_crt_user_id());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm(struct.getTbm31_crt_prog_nm());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime(struct.getTbm31_upd_datetime());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id(struct.getTbm31_upd_user_id());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm(struct.getTbm31_upd_prog_nm());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt(struct.getTbm31_upd_cnt());
      setgxTv_SdtTBM31_CRF_Mode(struct.getMode());
      setgxTv_SdtTBM31_CRF_Initialized(struct.getInitialized());
      setgxTv_SdtTBM31_CRF_Tbm31_study_id_Z(struct.getTbm31_study_id_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z(struct.getTbm31_crf_id_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z(struct.getTbm31_crf_nm_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z(struct.getTbm31_crf_snm_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z(struct.getTbm31_grid_size_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_order_Z(struct.getTbm31_order_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z(struct.getTbm31_def_visit_no_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z(struct.getTbm31_def_domain_cd_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_status_Z(struct.getTbm31_status_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_note_Z(struct.getTbm31_note_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z(struct.getTbm31_repeat_flg_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z(struct.getTbm31_repeat_max_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z(struct.getTbm31_dm_excp_no_disp_flg_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z(struct.getTbm31_del_flg_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z(struct.getTbm31_crt_datetime_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z(struct.getTbm31_crt_user_id_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z(struct.getTbm31_crt_prog_nm_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z(struct.getTbm31_upd_datetime_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z(struct.getTbm31_upd_user_id_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z(struct.getTbm31_upd_prog_nm_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z(struct.getTbm31_upd_cnt_Z());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N(struct.getTbm31_crf_nm_N());
      setgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N(struct.getTbm31_crf_snm_N());
      setgxTv_SdtTBM31_CRF_Tbm31_grid_size_N(struct.getTbm31_grid_size_N());
      setgxTv_SdtTBM31_CRF_Tbm31_order_N(struct.getTbm31_order_N());
      setgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N(struct.getTbm31_def_visit_no_N());
      setgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N(struct.getTbm31_def_domain_cd_N());
      setgxTv_SdtTBM31_CRF_Tbm31_status_N(struct.getTbm31_status_N());
      setgxTv_SdtTBM31_CRF_Tbm31_note_N(struct.getTbm31_note_N());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N(struct.getTbm31_repeat_flg_N());
      setgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N(struct.getTbm31_repeat_max_N());
      setgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N(struct.getTbm31_dm_excp_no_disp_flg_N());
      setgxTv_SdtTBM31_CRF_Tbm31_del_flg_N(struct.getTbm31_del_flg_N());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N(struct.getTbm31_crt_datetime_N());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N(struct.getTbm31_crt_user_id_N());
      setgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N(struct.getTbm31_crt_prog_nm_N());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N(struct.getTbm31_upd_datetime_N());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N(struct.getTbm31_upd_user_id_N());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N(struct.getTbm31_upd_prog_nm_N());
      setgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N(struct.getTbm31_upd_cnt_N());
   }

   public StructSdtTBM31_CRF getStruct( )
   {
      StructSdtTBM31_CRF struct = new StructSdtTBM31_CRF ();
      struct.setTbm31_study_id(getgxTv_SdtTBM31_CRF_Tbm31_study_id());
      struct.setTbm31_crf_id(getgxTv_SdtTBM31_CRF_Tbm31_crf_id());
      struct.setTbm31_crf_nm(getgxTv_SdtTBM31_CRF_Tbm31_crf_nm());
      struct.setTbm31_crf_snm(getgxTv_SdtTBM31_CRF_Tbm31_crf_snm());
      struct.setTbm31_grid_size(getgxTv_SdtTBM31_CRF_Tbm31_grid_size());
      struct.setTbm31_order(getgxTv_SdtTBM31_CRF_Tbm31_order());
      struct.setTbm31_def_visit_no(getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no());
      struct.setTbm31_def_domain_cd(getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd());
      struct.setTbm31_status(getgxTv_SdtTBM31_CRF_Tbm31_status());
      struct.setTbm31_note(getgxTv_SdtTBM31_CRF_Tbm31_note());
      struct.setTbm31_repeat_flg(getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg());
      struct.setTbm31_repeat_max(getgxTv_SdtTBM31_CRF_Tbm31_repeat_max());
      struct.setTbm31_dm_excp_no_disp_flg(getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg());
      struct.setTbm31_del_flg(getgxTv_SdtTBM31_CRF_Tbm31_del_flg());
      struct.setTbm31_crt_datetime(getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime());
      struct.setTbm31_crt_user_id(getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id());
      struct.setTbm31_crt_prog_nm(getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm());
      struct.setTbm31_upd_datetime(getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime());
      struct.setTbm31_upd_user_id(getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id());
      struct.setTbm31_upd_prog_nm(getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm());
      struct.setTbm31_upd_cnt(getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt());
      struct.setMode(getgxTv_SdtTBM31_CRF_Mode());
      struct.setInitialized(getgxTv_SdtTBM31_CRF_Initialized());
      struct.setTbm31_study_id_Z(getgxTv_SdtTBM31_CRF_Tbm31_study_id_Z());
      struct.setTbm31_crf_id_Z(getgxTv_SdtTBM31_CRF_Tbm31_crf_id_Z());
      struct.setTbm31_crf_nm_Z(getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z());
      struct.setTbm31_crf_snm_Z(getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z());
      struct.setTbm31_grid_size_Z(getgxTv_SdtTBM31_CRF_Tbm31_grid_size_Z());
      struct.setTbm31_order_Z(getgxTv_SdtTBM31_CRF_Tbm31_order_Z());
      struct.setTbm31_def_visit_no_Z(getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z());
      struct.setTbm31_def_domain_cd_Z(getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z());
      struct.setTbm31_status_Z(getgxTv_SdtTBM31_CRF_Tbm31_status_Z());
      struct.setTbm31_note_Z(getgxTv_SdtTBM31_CRF_Tbm31_note_Z());
      struct.setTbm31_repeat_flg_Z(getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z());
      struct.setTbm31_repeat_max_Z(getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z());
      struct.setTbm31_dm_excp_no_disp_flg_Z(getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z());
      struct.setTbm31_del_flg_Z(getgxTv_SdtTBM31_CRF_Tbm31_del_flg_Z());
      struct.setTbm31_crt_datetime_Z(getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z());
      struct.setTbm31_crt_user_id_Z(getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z());
      struct.setTbm31_crt_prog_nm_Z(getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z());
      struct.setTbm31_upd_datetime_Z(getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z());
      struct.setTbm31_upd_user_id_Z(getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z());
      struct.setTbm31_upd_prog_nm_Z(getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z());
      struct.setTbm31_upd_cnt_Z(getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z());
      struct.setTbm31_crf_nm_N(getgxTv_SdtTBM31_CRF_Tbm31_crf_nm_N());
      struct.setTbm31_crf_snm_N(getgxTv_SdtTBM31_CRF_Tbm31_crf_snm_N());
      struct.setTbm31_grid_size_N(getgxTv_SdtTBM31_CRF_Tbm31_grid_size_N());
      struct.setTbm31_order_N(getgxTv_SdtTBM31_CRF_Tbm31_order_N());
      struct.setTbm31_def_visit_no_N(getgxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N());
      struct.setTbm31_def_domain_cd_N(getgxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N());
      struct.setTbm31_status_N(getgxTv_SdtTBM31_CRF_Tbm31_status_N());
      struct.setTbm31_note_N(getgxTv_SdtTBM31_CRF_Tbm31_note_N());
      struct.setTbm31_repeat_flg_N(getgxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N());
      struct.setTbm31_repeat_max_N(getgxTv_SdtTBM31_CRF_Tbm31_repeat_max_N());
      struct.setTbm31_dm_excp_no_disp_flg_N(getgxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N());
      struct.setTbm31_del_flg_N(getgxTv_SdtTBM31_CRF_Tbm31_del_flg_N());
      struct.setTbm31_crt_datetime_N(getgxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N());
      struct.setTbm31_crt_user_id_N(getgxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N());
      struct.setTbm31_crt_prog_nm_N(getgxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N());
      struct.setTbm31_upd_datetime_N(getgxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N());
      struct.setTbm31_upd_user_id_N(getgxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N());
      struct.setTbm31_upd_prog_nm_N(getgxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N());
      struct.setTbm31_upd_cnt_N(getgxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_Z ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max_Z ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crf_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crf_snm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_grid_size_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_order_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_status_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_note_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_flg_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_repeat_max_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_del_flg_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_N ;
   private byte gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_N ;
   private short gxTv_SdtTBM31_CRF_Tbm31_crf_id ;
   private short gxTv_SdtTBM31_CRF_Tbm31_grid_size ;
   private short gxTv_SdtTBM31_CRF_Initialized ;
   private short gxTv_SdtTBM31_CRF_Tbm31_crf_id_Z ;
   private short gxTv_SdtTBM31_CRF_Tbm31_grid_size_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBM31_CRF_Tbm31_order ;
   private int gxTv_SdtTBM31_CRF_Tbm31_def_visit_no ;
   private int gxTv_SdtTBM31_CRF_Tbm31_order_Z ;
   private int gxTv_SdtTBM31_CRF_Tbm31_def_visit_no_Z ;
   private long gxTv_SdtTBM31_CRF_Tbm31_study_id ;
   private long gxTv_SdtTBM31_CRF_Tbm31_upd_cnt ;
   private long gxTv_SdtTBM31_CRF_Tbm31_study_id_Z ;
   private long gxTv_SdtTBM31_CRF_Tbm31_upd_cnt_Z ;
   private String gxTv_SdtTBM31_CRF_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_crt_datetime ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_upd_datetime ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM31_CRF_Tbm31_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_nm ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_snm ;
   private String gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd ;
   private String gxTv_SdtTBM31_CRF_Tbm31_status ;
   private String gxTv_SdtTBM31_CRF_Tbm31_note ;
   private String gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg ;
   private String gxTv_SdtTBM31_CRF_Tbm31_del_flg ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_user_id ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_user_id ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_nm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crf_snm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_def_domain_cd_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_status_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_note_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_dm_excp_no_disp_flg_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_del_flg_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_user_id_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_crt_prog_nm_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_user_id_Z ;
   private String gxTv_SdtTBM31_CRF_Tbm31_upd_prog_nm_Z ;
}

