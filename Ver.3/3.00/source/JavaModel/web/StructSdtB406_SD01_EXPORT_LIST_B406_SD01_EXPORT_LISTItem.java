/*
               File: StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem
        Description: B406_SD01_EXPORT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem( )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm = "" ;
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm = "" ;
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

   public short getTbm31_crf_id( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( short value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_nm( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm ;
   }

   public void setTbm31_crf_nm( String value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm = value ;
   }

   public String getTbm21_study_nm( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm ;
   }

   public void setTbm21_study_nm( String value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm = value ;
   }

   public long getTbm31_study_id( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ;
   }

   public void setTbm31_study_id( long value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id = value ;
   }

   public boolean getCheck( )
   {
      return gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check = value ;
   }

   protected short gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_id ;
   protected long gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_study_id ;
   protected boolean gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Check ;
   protected String gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm31_crf_nm ;
   protected String gxTv_SdtB406_SD01_EXPORT_LIST_B406_SD01_EXPORT_LISTItem_Tbm21_study_nm ;
}

