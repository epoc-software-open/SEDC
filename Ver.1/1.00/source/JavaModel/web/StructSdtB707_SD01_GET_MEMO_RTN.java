import com.genexus.*;

public final  class StructSdtB707_SD01_GET_MEMO_RTN implements Cloneable, java.io.Serializable
{
   public StructSdtB707_SD01_GET_MEMO_RTN( )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = "" ;
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = "" ;
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

   public String getResult_cd( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd ;
   }

   public void setResult_cd( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg = value ;
   }

   public String getMemo_kbn( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn ;
   }

   public void setMemo_kbn( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn = value ;
   }

   public short getMemo_no( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no ;
   }

   public void setMemo_no( short value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no = value ;
   }

   public String getMemo( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo ;
   }

   public void setMemo( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo = value ;
   }

   public String getKakunin_comment( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment ;
   }

   public void setKakunin_comment( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment = value ;
   }

   public String getCrt_user_nm( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm ;
   }

   public void setCrt_user_nm( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm = value ;
   }

   public String getRnrk_site_nm( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm ;
   }

   public void setRnrk_site_nm( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm = value ;
   }

   public String getRnrk_user_id( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id ;
   }

   public void setRnrk_user_id( String value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id = value ;
   }

   public java.util.Vector getRnrk_users( )
   {
      return gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users ;
   }

   public void setRnrk_users( java.util.Vector value )
   {
      gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users = value ;
   }

   protected short gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_no ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Result_cd ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Err_msg ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo_kbn ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Memo ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Kakunin_comment ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Crt_user_nm ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_site_nm ;
   protected String gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_user_id ;
   protected java.util.Vector gxTv_SdtB707_SD01_GET_MEMO_RTN_Rnrk_users=null ;
}

