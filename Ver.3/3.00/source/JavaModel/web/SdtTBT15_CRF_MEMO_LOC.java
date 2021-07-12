/*
               File: SdtTBT15_CRF_MEMO_LOC
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:21.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT15_CRF_MEMO_LOC extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT15_CRF_MEMO_LOC( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT15_CRF_MEMO_LOC.class));
   }

   public SdtTBT15_CRF_MEMO_LOC( int remoteHandle ,
                                 ModelContext context )
   {
      super( context, "SdtTBT15_CRF_MEMO_LOC");
      initialize( remoteHandle) ;
   }

   public SdtTBT15_CRF_MEMO_LOC( int remoteHandle ,
                                 StructSdtTBT15_CRF_MEMO_LOC struct )
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

   public void Load( long AV149TBT15_STUDY_ID ,
                     int AV151TBT15_SUBJECT_ID ,
                     short AV199TBT15_MEMO_NO )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV149TBT15_STUDY_ID),new Integer(AV151TBT15_SUBJECT_ID),new Short(AV199TBT15_MEMO_NO)});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT15_STUDY_ID", long.class}, new Object[]{"TBT15_SUBJECT_ID", int.class}, new Object[]{"TBT15_MEMO_NO", short.class}}) ;
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
      metadata.set("Name", "TBT15_CRF_MEMO_LOC");
      metadata.set("BT", "TBT15_CRF_MEMO_LOC");
      metadata.set("PK", "[ \"TBT15_STUDY_ID\",\"TBT15_SUBJECT_ID\",\"TBT15_MEMO_NO\" ]");
      metadata.set("PKAssigned", "[ \"TBT15_MEMO_NO\",\"TBT15_STUDY_ID\",\"TBT15_SUBJECT_ID\" ]");
      metadata.set("FKList", "[ { \"FK\":[ \"TBT14_STUDY_ID\",\"TBT14_SUBJECT_ID\",\"TBT14_MEMO_NO\" ],\"FKMap\":[ \"TBT15_STUDY_ID-TBT14_STUDY_ID\",\"TBT15_SUBJECT_ID-TBT14_SUBJECT_ID\",\"TBT15_MEMO_NO-TBT14_MEMO_NO\" ] } ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_STUDY_ID") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_SUBJECT_ID") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_MEMO_NO") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ID") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_EDA_NO") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_VERSION") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_DIV") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_DEL_FLG") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_USER_ID") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_PROG_NM") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_USER_ID") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_PROG_NM") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_CNT") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_STUDY_ID_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_MEMO_NO_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ID_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_EDA_NO_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_VERSION_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_DIV_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_CD_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_DEL_FLG_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_CNT_Z") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ID_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_EDA_NO_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_VERSION_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_DIV_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRF_ITEM_GRP_CD_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_DEL_FLG_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT15_UPD_CNT_N") )
            {
               gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT15_CRF_MEMO_LOC" ;
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
      oWriter.writeElement("TBT15_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_MEMO_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no, 3, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRF_ITEM_GRP_DIV", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime) )
      {
         oWriter.writeStartElement("TBT15_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT15_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT15_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime) )
      {
         oWriter.writeStartElement("TBT15_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT15_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT15_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT15_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_MEMO_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z, 3, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_EDA_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ITEM_GRP_DIV_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ITEM_GRP_CD_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT15_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT15_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT15_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT15_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT15_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT15_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_EDA_NO_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_VERSION_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ITEM_GRP_DIV_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRF_ITEM_GRP_CD_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT15_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT15_STUDY_ID", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id, false);
      AddObjectProperty("TBT15_SUBJECT_ID", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id, false);
      AddObjectProperty("TBT15_MEMO_NO", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no, false);
      AddObjectProperty("TBT15_CRF_ID", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id, false);
      AddObjectProperty("TBT15_CRF_EDA_NO", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no, false);
      AddObjectProperty("TBT15_CRF_VERSION", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version, false);
      AddObjectProperty("TBT15_CRF_ITEM_GRP_DIV", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div, false);
      AddObjectProperty("TBT15_CRF_ITEM_GRP_CD", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd, false);
      AddObjectProperty("TBT15_DEL_FLG", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg, false);
      datetime_STZ = gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime ;
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
      AddObjectProperty("TBT15_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT15_CRT_USER_ID", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id, false);
      AddObjectProperty("TBT15_CRT_PROG_NM", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime ;
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
      AddObjectProperty("TBT15_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT15_UPD_USER_ID", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id, false);
      AddObjectProperty("TBT15_UPD_PROG_NM", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm, false);
      AddObjectProperty("TBT15_UPD_CNT", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT15_CRF_MEMO_LOC_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized, false);
         AddObjectProperty("TBT15_STUDY_ID_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z, false);
         AddObjectProperty("TBT15_SUBJECT_ID_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z, false);
         AddObjectProperty("TBT15_MEMO_NO_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z, false);
         AddObjectProperty("TBT15_CRF_ID_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z, false);
         AddObjectProperty("TBT15_CRF_EDA_NO_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z, false);
         AddObjectProperty("TBT15_CRF_VERSION_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z, false);
         AddObjectProperty("TBT15_CRF_ITEM_GRP_DIV_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z, false);
         AddObjectProperty("TBT15_CRF_ITEM_GRP_CD_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z, false);
         AddObjectProperty("TBT15_DEL_FLG_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
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
         AddObjectProperty("TBT15_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT15_CRT_USER_ID_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z, false);
         AddObjectProperty("TBT15_CRT_PROG_NM_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
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
         AddObjectProperty("TBT15_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT15_UPD_USER_ID_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z, false);
         AddObjectProperty("TBT15_UPD_PROG_NM_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z, false);
         AddObjectProperty("TBT15_UPD_CNT_Z", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z, false);
         AddObjectProperty("TBT15_CRF_ID_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N, false);
         AddObjectProperty("TBT15_CRF_EDA_NO_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N, false);
         AddObjectProperty("TBT15_CRF_VERSION_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N, false);
         AddObjectProperty("TBT15_CRF_ITEM_GRP_DIV_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N, false);
         AddObjectProperty("TBT15_CRF_ITEM_GRP_CD_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N, false);
         AddObjectProperty("TBT15_DEL_FLG_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N, false);
         AddObjectProperty("TBT15_CRT_DATETIME_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N, false);
         AddObjectProperty("TBT15_CRT_USER_ID_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N, false);
         AddObjectProperty("TBT15_CRT_PROG_NM_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N, false);
         AddObjectProperty("TBT15_UPD_DATETIME_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N, false);
         AddObjectProperty("TBT15_UPD_USER_ID_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N, false);
         AddObjectProperty("TBT15_UPD_PROG_NM_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N, false);
         AddObjectProperty("TBT15_UPD_CNT_N", gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id( long value )
   {
      if ( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id != value )
      {
         gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id = value ;
   }

   public int getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id( int value )
   {
      if ( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id != value )
      {
         gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id = value ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no( short value )
   {
      if ( gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no != value )
      {
         gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "INS" ;
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no = value ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Mode ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z( int value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z( short value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N( )
   {
      return gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt15_crf_memo_loc_bc obj ;
      obj = new tbt15_crf_memo_loc_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Mode = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z = "" ;
      gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT15_CRF_MEMO_LOC Clone( )
   {
      SdtTBT15_CRF_MEMO_LOC sdt ;
      tbt15_crf_memo_loc_bc obj ;
      sdt = (SdtTBT15_CRF_MEMO_LOC)(clone()) ;
      obj = (tbt15_crf_memo_loc_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT15_CRF_MEMO_LOC struct )
   {
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id(struct.getTbt15_study_id());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id(struct.getTbt15_subject_id());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no(struct.getTbt15_memo_no());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id(struct.getTbt15_crf_id());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no(struct.getTbt15_crf_eda_no());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version(struct.getTbt15_crf_version());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div(struct.getTbt15_crf_item_grp_div());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd(struct.getTbt15_crf_item_grp_cd());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg(struct.getTbt15_del_flg());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime(struct.getTbt15_crt_datetime());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id(struct.getTbt15_crt_user_id());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm(struct.getTbt15_crt_prog_nm());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime(struct.getTbt15_upd_datetime());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id(struct.getTbt15_upd_user_id());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm(struct.getTbt15_upd_prog_nm());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt(struct.getTbt15_upd_cnt());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Mode(struct.getMode());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized(struct.getInitialized());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z(struct.getTbt15_study_id_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z(struct.getTbt15_subject_id_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z(struct.getTbt15_memo_no_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z(struct.getTbt15_crf_id_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z(struct.getTbt15_crf_eda_no_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z(struct.getTbt15_crf_version_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z(struct.getTbt15_crf_item_grp_div_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z(struct.getTbt15_crf_item_grp_cd_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z(struct.getTbt15_del_flg_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z(struct.getTbt15_crt_datetime_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z(struct.getTbt15_crt_user_id_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z(struct.getTbt15_crt_prog_nm_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z(struct.getTbt15_upd_datetime_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z(struct.getTbt15_upd_user_id_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z(struct.getTbt15_upd_prog_nm_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z(struct.getTbt15_upd_cnt_Z());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N(struct.getTbt15_crf_id_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N(struct.getTbt15_crf_eda_no_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N(struct.getTbt15_crf_version_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N(struct.getTbt15_crf_item_grp_div_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N(struct.getTbt15_crf_item_grp_cd_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N(struct.getTbt15_del_flg_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N(struct.getTbt15_crt_datetime_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N(struct.getTbt15_crt_user_id_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N(struct.getTbt15_crt_prog_nm_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N(struct.getTbt15_upd_datetime_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N(struct.getTbt15_upd_user_id_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N(struct.getTbt15_upd_prog_nm_N());
      setgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N(struct.getTbt15_upd_cnt_N());
   }

   public StructSdtTBT15_CRF_MEMO_LOC getStruct( )
   {
      StructSdtTBT15_CRF_MEMO_LOC struct = new StructSdtTBT15_CRF_MEMO_LOC ();
      struct.setTbt15_study_id(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id());
      struct.setTbt15_subject_id(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id());
      struct.setTbt15_memo_no(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no());
      struct.setTbt15_crf_id(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id());
      struct.setTbt15_crf_eda_no(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no());
      struct.setTbt15_crf_version(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version());
      struct.setTbt15_crf_item_grp_div(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div());
      struct.setTbt15_crf_item_grp_cd(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd());
      struct.setTbt15_del_flg(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg());
      struct.setTbt15_crt_datetime(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime());
      struct.setTbt15_crt_user_id(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id());
      struct.setTbt15_crt_prog_nm(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm());
      struct.setTbt15_upd_datetime(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime());
      struct.setTbt15_upd_user_id(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id());
      struct.setTbt15_upd_prog_nm(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm());
      struct.setTbt15_upd_cnt(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt());
      struct.setMode(getgxTv_SdtTBT15_CRF_MEMO_LOC_Mode());
      struct.setInitialized(getgxTv_SdtTBT15_CRF_MEMO_LOC_Initialized());
      struct.setTbt15_study_id_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z());
      struct.setTbt15_subject_id_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z());
      struct.setTbt15_memo_no_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z());
      struct.setTbt15_crf_id_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z());
      struct.setTbt15_crf_eda_no_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z());
      struct.setTbt15_crf_version_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z());
      struct.setTbt15_crf_item_grp_div_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z());
      struct.setTbt15_crf_item_grp_cd_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z());
      struct.setTbt15_del_flg_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z());
      struct.setTbt15_crt_datetime_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z());
      struct.setTbt15_crt_user_id_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z());
      struct.setTbt15_crt_prog_nm_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z());
      struct.setTbt15_upd_datetime_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z());
      struct.setTbt15_upd_user_id_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z());
      struct.setTbt15_upd_prog_nm_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z());
      struct.setTbt15_upd_cnt_Z(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z());
      struct.setTbt15_crf_id_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N());
      struct.setTbt15_crf_eda_no_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N());
      struct.setTbt15_crf_version_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N());
      struct.setTbt15_crf_item_grp_div_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N());
      struct.setTbt15_crf_item_grp_cd_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N());
      struct.setTbt15_del_flg_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N());
      struct.setTbt15_crt_datetime_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N());
      struct.setTbt15_crt_user_id_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N());
      struct.setTbt15_crt_prog_nm_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N());
      struct.setTbt15_upd_datetime_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N());
      struct.setTbt15_upd_user_id_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N());
      struct.setTbt15_upd_prog_nm_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N());
      struct.setTbt15_upd_cnt_N(getgxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_Z ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_eda_no_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_N ;
   private byte gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_N ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Initialized ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_memo_no_Z ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_id_Z ;
   private short gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id ;
   private int gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_subject_id_Z ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_study_id_Z ;
   private long gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_cnt_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_del_flg_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_user_id_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_crt_prog_nm_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_user_id_Z ;
   private String gxTv_SdtTBT15_CRF_MEMO_LOC_Tbt15_upd_prog_nm_Z ;
}

