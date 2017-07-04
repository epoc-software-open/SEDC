/*
               File: StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem
        Description: B713_SD01_SUBJECT_SINK_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.77
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem( )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm = "" ;
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
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg ;
   }

   public void setSel_flg( boolean value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg = value ;
   }

   public short getTbm31_crf_id( )
   {
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( short value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_snm( )
   {
      return gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm ;
   }

   public void setTbm31_crf_snm( String value )
   {
      gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm = value ;
   }

   protected short gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_id ;
   protected boolean gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Sel_flg ;
   protected String gxTv_SdtB713_SD01_SUBJECT_SINK_LIST_B713_SD01_SUBJECT_SINK_LISTItem_Tbm31_crf_snm ;
}

