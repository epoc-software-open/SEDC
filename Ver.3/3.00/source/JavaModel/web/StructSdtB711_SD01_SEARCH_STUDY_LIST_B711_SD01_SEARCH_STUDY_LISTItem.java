/*
               File: StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem
        Description: B711_SD01_SEARCH_STUDY_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem( )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = "" ;
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

   public long getTbm21_study_id( )
   {
      return gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id ;
   }

   public void setTbm21_study_id( long value )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id = value ;
   }

   public String getTbm21_study_nm( )
   {
      return gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm ;
   }

   public void setTbm21_study_nm( String value )
   {
      gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm = value ;
   }

   protected long gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_id ;
   protected String gxTv_SdtB711_SD01_SEARCH_STUDY_LIST_B711_SD01_SEARCH_STUDY_LISTItem_Tbm21_study_nm ;
}

