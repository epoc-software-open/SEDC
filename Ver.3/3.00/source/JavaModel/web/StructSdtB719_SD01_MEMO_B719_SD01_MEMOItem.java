/*
               File: StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem
        Description: B719_SD01_MEMO
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:45.90
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem implements Cloneable, java.io.Serializable
{
   public StructSdtB719_SD01_MEMO_B719_SD01_MEMOItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = "" ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = cal.getTime() ;
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public boolean getSel_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg = value ;
   }

   public int getSubject_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   }

   public void setSubject_id( int value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id = value ;
   }

   public short getMemo_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   }

   public void setMemo_no( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no = value ;
   }

   public short getCrf_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   }

   public void setCrf_id( short value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id = value ;
   }

   public byte getCrf_eda_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no ;
   }

   public void setCrf_eda_no( byte value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no = value ;
   }

   public int getVisit_no( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no ;
   }

   public void setVisit_no( int value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no = value ;
   }

   public String getCrf_item_grp_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd ;
   }

   public void setCrf_item_grp_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd = value ;
   }

   public String getMemo_kbn( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn ;
   }

   public void setMemo_kbn( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn = value ;
   }

   public String getMemo( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo ;
   }

   public void setMemo( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo = value ;
   }

   public String getRequest_site_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id ;
   }

   public void setRequest_site_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id = value ;
   }

   public String getRequest_auth_cd( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd ;
   }

   public void setRequest_auth_cd( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd = value ;
   }

   public String getKakunin_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg ;
   }

   public void setKakunin_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg = value ;
   }

   public String getKakunin_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id ;
   }

   public void setKakunin_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id = value ;
   }

   public String getKanryo_flg( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg ;
   }

   public void setKanryo_flg( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg = value ;
   }

   public java.util.Date getCrt_datetime( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
   }

   public void setCrt_datetime( java.util.Date value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime = value ;
   }

   public String getCrt_user_id( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id ;
   }

   public void setCrt_user_id( String value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id = value ;
   }

   public long getUpd_cnt( )
   {
      return gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   }

   public void setUpd_cnt( long value )
   {
      gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt = value ;
   }

   protected byte gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_eda_no ;
   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_no ;
   protected short gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_id ;
   protected int gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Subject_id ;
   protected int gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Visit_no ;
   protected long gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Upd_cnt ;
   protected boolean gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Sel_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crf_item_grp_cd ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo_kbn ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Memo ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_site_id ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Request_auth_cd ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kakunin_user_id ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Kanryo_flg ;
   protected String gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_user_id ;
   protected java.util.Date gxTv_SdtB719_SD01_MEMO_B719_SD01_MEMOItem_Crt_datetime ;
}

