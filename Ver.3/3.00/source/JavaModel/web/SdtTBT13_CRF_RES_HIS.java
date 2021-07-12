/*
               File: SdtTBT13_CRF_RES_HIS
        Description: CRFì¸óÕåãâ óöóÉeÅ[ÉuÉã
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:6.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtTBT13_CRF_RES_HIS extends GxSilentTrnSdt implements Cloneable, java.io.Serializable
{
   public SdtTBT13_CRF_RES_HIS( int remoteHandle )
   {
      this( remoteHandle,  new ModelContext(SdtTBT13_CRF_RES_HIS.class));
   }

   public SdtTBT13_CRF_RES_HIS( int remoteHandle ,
                                ModelContext context )
   {
      super( context, "SdtTBT13_CRF_RES_HIS");
      initialize( remoteHandle) ;
   }

   public SdtTBT13_CRF_RES_HIS( int remoteHandle ,
                                StructSdtTBT13_CRF_RES_HIS struct )
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

   public void Load( long AV101TBT13_STUDY_ID ,
                     int AV102TBT13_SUBJECT_ID ,
                     short AV103TBT13_CRF_ID ,
                     byte AV938TBT13_CRF_EDA_NO ,
                     short AV104TBT13_CRF_VERSION ,
                     String AV105TBT13_CRF_ITEM_GRP_DIV ,
                     String AV106TBT13_CRF_ITEM_GRP_CD )
   {
      IGxSilentTrn obj ;
      obj = getTransaction() ;
      obj.LoadKey(new Object[] {new Long(AV101TBT13_STUDY_ID),new Integer(AV102TBT13_SUBJECT_ID),new Short(AV103TBT13_CRF_ID),new Byte(AV938TBT13_CRF_EDA_NO),new Short(AV104TBT13_CRF_VERSION),AV105TBT13_CRF_ITEM_GRP_DIV,AV106TBT13_CRF_ITEM_GRP_CD});
   }

   public Object[][] GetBCKey( )
   {
      return (Object[][])(new Object[][]{new Object[]{"TBT13_STUDY_ID", long.class}, new Object[]{"TBT13_SUBJECT_ID", int.class}, new Object[]{"TBT13_CRF_ID", short.class}, new Object[]{"TBT13_CRF_EDA_NO", byte.class}, new Object[]{"TBT13_CRF_VERSION", short.class}, new Object[]{"TBT13_CRF_ITEM_GRP_DIV", String.class}, new Object[]{"TBT13_CRF_ITEM_GRP_CD", String.class}}) ;
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
      metadata.set("Name", "TBT13_CRF_RES_HIS");
      metadata.set("BT", "TBT13_CRF_RES_HIS");
      metadata.set("PK", "[ \"TBT13_STUDY_ID\",\"TBT13_SUBJECT_ID\",\"TBT13_CRF_ID\",\"TBT13_CRF_EDA_NO\",\"TBT13_CRF_VERSION\",\"TBT13_CRF_ITEM_GRP_DIV\",\"TBT13_CRF_ITEM_GRP_CD\" ]");
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
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_STUDY_ID") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_SUBJECT_ID") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ID") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_EDA_NO") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_VERSION") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ITEM_GRP_DIV") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ITEM_GRP_CD") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_VALUE") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_EDIT_FLG") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_DEL_FLG") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_USER_ID") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_PROG_NM") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_DATETIME") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_USER_ID") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_PROG_NM") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_CNT") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Mode") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Mode = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "Initialized") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Initialized = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_STUDY_ID_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_SUBJECT_ID_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z = (int)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ID_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_EDA_NO_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_VERSION_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z = (short)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ITEM_GRP_DIV_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_ITEM_GRP_CD_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_VALUE_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_EDIT_FLG_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_DEL_FLG_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_USER_ID_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_PROG_NM_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_DATETIME_Z") )
            {
               if ( ( GXutil.strcmp(oReader.getValue(), "0000-00-00T00:00:00") == 0 ) || ( oReader.existsAttribute("xsi:nil") == 1 ) )
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
               }
               else
               {
                  gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = localUtil.ymdhmsToT( (short)(GXutil.val( GXutil.substring( oReader.getValue(), 1, 4), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 6, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 9, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 12, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 15, 2), ".")), (byte)(GXutil.val( GXutil.substring( oReader.getValue(), 18, 2), "."))) ;
               }
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_USER_ID_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_PROG_NM_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_CNT_Z") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z = GXutil.lval( oReader.getValue()) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRF_VALUE_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_EDIT_FLG_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_DEL_FLG_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_DATETIME_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_USER_ID_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_CRT_PROG_NM_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_DATETIME_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_USER_ID_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_PROG_NM_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = (byte)(GXutil.lval( oReader.getValue())) ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "TBT13_UPD_CNT_N") )
            {
               gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = (byte)(GXutil.lval( oReader.getValue())) ;
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
         sName = "TBT13_CRF_RES_HIS" ;
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
      oWriter.writeElement("TBT13_STUDY_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_SUBJECT_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id, 6, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_ID", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_EDA_NO", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no, 2, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_VERSION", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version, 4, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_ITEM_GRP_DIV", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_ITEM_GRP_CD", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRF_VALUE", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_EDIT_FLG", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_DEL_FLG", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime) )
      {
         oWriter.writeStartElement("TBT13_CRT_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT13_CRT_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT13_CRT_USER_ID", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_CRT_PROG_NM", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( GXutil.nullDate().equals(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime) )
      {
         oWriter.writeStartElement("TBT13_UPD_DATETIME");
         oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         oWriter.writeAttribute("xsi:nil", "true");
         oWriter.writeEndElement();
      }
      else
      {
         sDateCnv = "" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "-" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + "T" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         sDateCnv = sDateCnv + ":" ;
         sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime), 10, 0)) ;
         sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
         oWriter.writeElement("TBT13_UPD_DATETIME", sDateCnv);
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
      }
      oWriter.writeElement("TBT13_UPD_USER_ID", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_UPD_PROG_NM", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      oWriter.writeElement("TBT13_UPD_CNT", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt, 10, 0)));
      if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
      {
         oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
      }
      if ( sIncludeState )
      {
         oWriter.writeElement("Mode", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Mode));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("Initialized", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Initialized, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_STUDY_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_SUBJECT_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z, 6, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_ID_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_EDA_NO_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z, 2, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_VERSION_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z, 4, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_ITEM_GRP_DIV_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_ITEM_GRP_CD_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_VALUE_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_EDIT_FLG_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_DEL_FLG_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z) )
         {
            oWriter.writeStartElement("TBT13_CRT_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT13_CRT_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT13_CRT_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRT_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         if ( GXutil.nullDate().equals(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z) )
         {
            oWriter.writeStartElement("TBT13_UPD_DATETIME_Z");
            oWriter.writeAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            oWriter.writeAttribute("xsi:nil", "true");
            oWriter.writeEndElement();
         }
         else
         {
            sDateCnv = "" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.year( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "0000", 1, 4-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.month( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "-" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.day( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + "T" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.hour( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.minute( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            sDateCnv = sDateCnv + ":" ;
            sNumToPad = GXutil.trim( GXutil.str( GXutil.second( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z), 10, 0)) ;
            sDateCnv = sDateCnv + GXutil.substring( "00", 1, 2-GXutil.len( sNumToPad)) + sNumToPad ;
            oWriter.writeElement("TBT13_UPD_DATETIME_Z", sDateCnv);
            if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
            {
               oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
            }
         }
         oWriter.writeElement("TBT13_UPD_USER_ID_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_PROG_NM_Z", GXutil.rtrim( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_CNT_Z", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z, 10, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRF_VALUE_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_EDIT_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_DEL_FLG_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRT_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRT_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_CRT_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_DATETIME_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_USER_ID_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_PROG_NM_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N, 1, 0)));
         if ( GXutil.strcmp(sNameSpace, "tablet-EDC_GXXEV3U3") != 0 )
         {
            oWriter.writeAttribute("xmlns", "tablet-EDC_GXXEV3U3");
         }
         oWriter.writeElement("TBT13_UPD_CNT_N", GXutil.trim( GXutil.str( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N, 1, 0)));
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
      AddObjectProperty("TBT13_STUDY_ID", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id, false);
      AddObjectProperty("TBT13_SUBJECT_ID", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id, false);
      AddObjectProperty("TBT13_CRF_ID", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id, false);
      AddObjectProperty("TBT13_CRF_EDA_NO", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no, false);
      AddObjectProperty("TBT13_CRF_VERSION", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version, false);
      AddObjectProperty("TBT13_CRF_ITEM_GRP_DIV", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div, false);
      AddObjectProperty("TBT13_CRF_ITEM_GRP_CD", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd, false);
      AddObjectProperty("TBT13_CRF_VALUE", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value, false);
      AddObjectProperty("TBT13_EDIT_FLG", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg, false);
      AddObjectProperty("TBT13_DEL_FLG", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg, false);
      datetime_STZ = gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime ;
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
      AddObjectProperty("TBT13_CRT_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT13_CRT_USER_ID", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id, false);
      AddObjectProperty("TBT13_CRT_PROG_NM", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm, false);
      datetime_STZ = gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime ;
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
      AddObjectProperty("TBT13_UPD_DATETIME", sDateCnv, false);
      AddObjectProperty("TBT13_UPD_USER_ID", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id, false);
      AddObjectProperty("TBT13_UPD_PROG_NM", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm, false);
      AddObjectProperty("TBT13_UPD_CNT", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt, false);
      if ( includeState )
      {
         AddObjectProperty("Mode", gxTv_SdtTBT13_CRF_RES_HIS_Mode, false);
         AddObjectProperty("Initialized", gxTv_SdtTBT13_CRF_RES_HIS_Initialized, false);
         AddObjectProperty("TBT13_STUDY_ID_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z, false);
         AddObjectProperty("TBT13_SUBJECT_ID_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z, false);
         AddObjectProperty("TBT13_CRF_ID_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z, false);
         AddObjectProperty("TBT13_CRF_EDA_NO_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z, false);
         AddObjectProperty("TBT13_CRF_VERSION_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z, false);
         AddObjectProperty("TBT13_CRF_ITEM_GRP_DIV_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z, false);
         AddObjectProperty("TBT13_CRF_ITEM_GRP_CD_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z, false);
         AddObjectProperty("TBT13_CRF_VALUE_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z, false);
         AddObjectProperty("TBT13_EDIT_FLG_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z, false);
         AddObjectProperty("TBT13_DEL_FLG_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z, false);
         datetime_STZ = gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
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
         AddObjectProperty("TBT13_CRT_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT13_CRT_USER_ID_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z, false);
         AddObjectProperty("TBT13_CRT_PROG_NM_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z, false);
         datetime_STZ = gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
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
         AddObjectProperty("TBT13_UPD_DATETIME_Z", sDateCnv, false);
         AddObjectProperty("TBT13_UPD_USER_ID_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z, false);
         AddObjectProperty("TBT13_UPD_PROG_NM_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z, false);
         AddObjectProperty("TBT13_UPD_CNT_Z", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z, false);
         AddObjectProperty("TBT13_CRF_VALUE_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N, false);
         AddObjectProperty("TBT13_EDIT_FLG_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N, false);
         AddObjectProperty("TBT13_DEL_FLG_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N, false);
         AddObjectProperty("TBT13_CRT_DATETIME_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N, false);
         AddObjectProperty("TBT13_CRT_USER_ID_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N, false);
         AddObjectProperty("TBT13_CRT_PROG_NM_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N, false);
         AddObjectProperty("TBT13_UPD_DATETIME_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N, false);
         AddObjectProperty("TBT13_UPD_USER_ID_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N, false);
         AddObjectProperty("TBT13_UPD_PROG_NM_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N, false);
         AddObjectProperty("TBT13_UPD_CNT_N", gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N, false);
      }
   }

   public long getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( long value )
   {
      if ( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id != value )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id = value ;
   }

   public int getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( int value )
   {
      if ( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id != value )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id = value ;
   }

   public short getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( short value )
   {
      if ( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id != value )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id = value ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( byte value )
   {
      if ( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no != value )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no = value ;
   }

   public short getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( short value )
   {
      if ( gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version != value )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version = value ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div, value) != 0 )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div = value ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( String value )
   {
      if ( GXutil.strcmp(gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd, value) != 0 )
      {
         gxTv_SdtTBT13_CRF_RES_HIS_Mode = "INS" ;
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( );
         this.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( );
      }
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd = value ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = (byte)(0) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = (byte)(1) ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt = 0 ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Mode( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Mode ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Mode( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Mode = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Mode_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Mode = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Mode_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT13_CRF_RES_HIS_Initialized( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Initialized ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Initialized( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Initialized = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Initialized_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Initialized = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Initialized_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z_IsNull( )
   {
      return false ;
   }

   public int getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z( int value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z_IsNull( )
   {
      return false ;
   }

   public short getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z( short value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z = (short)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public java.util.Date getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z( java.util.Date value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z_IsNull( )
   {
      return false ;
   }

   public String getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z( String value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = "" ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z_IsNull( )
   {
      return false ;
   }

   public long getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z( long value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z = 0 ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N_IsNull( )
   {
      return false ;
   }

   public byte getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N( )
   {
      return gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N( byte value )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = value ;
   }

   public void setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N_SetNull( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N = (byte)(0) ;
   }

   public boolean getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N_IsNull( )
   {
      return false ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
      tbt13_crf_res_his_bc obj ;
      obj = new tbt13_crf_res_his_bc( remoteHandle, context) ;
      obj.initialize();
      obj.SetSDT(this, (byte)(1));
      setTransaction( obj) ;
      obj.SetMode("INS");
   }

   public void initialize( )
   {
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Mode = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z = "" ;
      gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z = "" ;
      sTagName = "" ;
      sDateCnv = "" ;
      sNumToPad = "" ;
      datetime_STZ = GXutil.resetTime( GXutil.nullDate() );
   }

   public SdtTBT13_CRF_RES_HIS Clone( )
   {
      SdtTBT13_CRF_RES_HIS sdt ;
      tbt13_crf_res_his_bc obj ;
      sdt = (SdtTBT13_CRF_RES_HIS)(clone()) ;
      obj = (tbt13_crf_res_his_bc)(sdt.getTransaction()) ;
      obj.SetSDT(sdt, (byte)(0));
      return sdt ;
   }

   public void setStruct( StructSdtTBT13_CRF_RES_HIS struct )
   {
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id(struct.getTbt13_study_id());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id(struct.getTbt13_subject_id());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id(struct.getTbt13_crf_id());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no(struct.getTbt13_crf_eda_no());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version(struct.getTbt13_crf_version());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div(struct.getTbt13_crf_item_grp_div());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd(struct.getTbt13_crf_item_grp_cd());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value(struct.getTbt13_crf_value());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg(struct.getTbt13_edit_flg());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg(struct.getTbt13_del_flg());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime(struct.getTbt13_crt_datetime());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id(struct.getTbt13_crt_user_id());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm(struct.getTbt13_crt_prog_nm());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime(struct.getTbt13_upd_datetime());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id(struct.getTbt13_upd_user_id());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm(struct.getTbt13_upd_prog_nm());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt(struct.getTbt13_upd_cnt());
      setgxTv_SdtTBT13_CRF_RES_HIS_Mode(struct.getMode());
      setgxTv_SdtTBT13_CRF_RES_HIS_Initialized(struct.getInitialized());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z(struct.getTbt13_study_id_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z(struct.getTbt13_subject_id_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z(struct.getTbt13_crf_id_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z(struct.getTbt13_crf_eda_no_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z(struct.getTbt13_crf_version_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z(struct.getTbt13_crf_item_grp_div_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z(struct.getTbt13_crf_item_grp_cd_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z(struct.getTbt13_crf_value_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z(struct.getTbt13_edit_flg_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z(struct.getTbt13_del_flg_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z(struct.getTbt13_crt_datetime_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z(struct.getTbt13_crt_user_id_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z(struct.getTbt13_crt_prog_nm_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z(struct.getTbt13_upd_datetime_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z(struct.getTbt13_upd_user_id_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z(struct.getTbt13_upd_prog_nm_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z(struct.getTbt13_upd_cnt_Z());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N(struct.getTbt13_crf_value_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N(struct.getTbt13_edit_flg_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N(struct.getTbt13_del_flg_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N(struct.getTbt13_crt_datetime_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N(struct.getTbt13_crt_user_id_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N(struct.getTbt13_crt_prog_nm_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N(struct.getTbt13_upd_datetime_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N(struct.getTbt13_upd_user_id_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N(struct.getTbt13_upd_prog_nm_N());
      setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N(struct.getTbt13_upd_cnt_N());
   }

   public StructSdtTBT13_CRF_RES_HIS getStruct( )
   {
      StructSdtTBT13_CRF_RES_HIS struct = new StructSdtTBT13_CRF_RES_HIS ();
      struct.setTbt13_study_id(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id());
      struct.setTbt13_subject_id(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id());
      struct.setTbt13_crf_id(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id());
      struct.setTbt13_crf_eda_no(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no());
      struct.setTbt13_crf_version(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version());
      struct.setTbt13_crf_item_grp_div(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div());
      struct.setTbt13_crf_item_grp_cd(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd());
      struct.setTbt13_crf_value(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value());
      struct.setTbt13_edit_flg(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg());
      struct.setTbt13_del_flg(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg());
      struct.setTbt13_crt_datetime(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime());
      struct.setTbt13_crt_user_id(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id());
      struct.setTbt13_crt_prog_nm(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm());
      struct.setTbt13_upd_datetime(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime());
      struct.setTbt13_upd_user_id(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id());
      struct.setTbt13_upd_prog_nm(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm());
      struct.setTbt13_upd_cnt(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt());
      struct.setMode(getgxTv_SdtTBT13_CRF_RES_HIS_Mode());
      struct.setInitialized(getgxTv_SdtTBT13_CRF_RES_HIS_Initialized());
      struct.setTbt13_study_id_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z());
      struct.setTbt13_subject_id_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z());
      struct.setTbt13_crf_id_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z());
      struct.setTbt13_crf_eda_no_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z());
      struct.setTbt13_crf_version_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z());
      struct.setTbt13_crf_item_grp_div_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z());
      struct.setTbt13_crf_item_grp_cd_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z());
      struct.setTbt13_crf_value_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z());
      struct.setTbt13_edit_flg_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z());
      struct.setTbt13_del_flg_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z());
      struct.setTbt13_crt_datetime_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z());
      struct.setTbt13_crt_user_id_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z());
      struct.setTbt13_crt_prog_nm_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z());
      struct.setTbt13_upd_datetime_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z());
      struct.setTbt13_upd_user_id_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z());
      struct.setTbt13_upd_prog_nm_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z());
      struct.setTbt13_upd_cnt_Z(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z());
      struct.setTbt13_crf_value_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N());
      struct.setTbt13_edit_flg_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N());
      struct.setTbt13_del_flg_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N());
      struct.setTbt13_crt_datetime_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N());
      struct.setTbt13_crt_user_id_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N());
      struct.setTbt13_crt_prog_nm_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N());
      struct.setTbt13_upd_datetime_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N());
      struct.setTbt13_upd_user_id_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N());
      struct.setTbt13_upd_prog_nm_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N());
      struct.setTbt13_upd_cnt_N(getgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N());
      return struct ;
   }

   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no_Z ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_N ;
   private byte gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_N ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Initialized ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id_Z ;
   private short gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version_Z ;
   private short readOk ;
   private short nOutParmCount ;
   private int gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id ;
   private int gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id_Z ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id_Z ;
   private long gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_cnt_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Mode ;
   private String sTagName ;
   private String sDateCnv ;
   private String sNumToPad ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_datetime_Z ;
   private java.util.Date datetime_STZ ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_user_id_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_user_id_Z ;
   private String gxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm_Z ;
}

