import com.genexus.*;

public final  class StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem( )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm = "" ;
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status = "" ;
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
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg = value ;
   }

   public short getTbm31_crf_id( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( short value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_snm( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm ;
   }

   public void setTbm31_crf_snm( String value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm = value ;
   }

   public String getTbm31_status( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status ;
   }

   public void setTbm31_status( String value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status = value ;
   }

   public int getTbm31_order( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order ;
   }

   public void setTbm31_order( int value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order = value ;
   }

   public long getTbm31_study_id( )
   {
      return gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id ;
   }

   public void setTbm31_study_id( long value )
   {
      gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id = value ;
   }

   protected short gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_id ;
   protected int gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_order ;
   protected long gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_study_id ;
   protected boolean gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Sel_flg ;
   protected String gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_crf_snm ;
   protected String gxTv_SdtB712_SD03_CRF_LIST_B712_SD03_CRF_LISTItem_Tbm31_status ;
}

