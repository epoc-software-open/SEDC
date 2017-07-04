import com.genexus.*;

public final  class StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem implements Cloneable, java.io.Serializable
{
   public StructSdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem( )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id = "" ;
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm = "" ;
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

   public long getRnrk_no( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no ;
   }

   public void setRnrk_no( long value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no = value ;
   }

   public String getRnrk_user_id( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id ;
   }

   public void setRnrk_user_id( String value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id = value ;
   }

   public String getRnrk_user_nm( )
   {
      return gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm ;
   }

   public void setRnrk_user_nm( String value )
   {
      gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm = value ;
   }

   protected long gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_no ;
   protected String gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_id ;
   protected String gxTv_SdtB707_SD03_SEL_LIST_ITEM_B707_SD03_SEL_LIST_ITEMItem_Rnrk_user_nm ;
}

