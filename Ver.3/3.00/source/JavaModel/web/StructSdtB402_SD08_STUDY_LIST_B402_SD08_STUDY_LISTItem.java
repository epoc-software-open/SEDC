/*
               File: StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem
        Description: B402_SD08_STUDY_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem( )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm = "" ;
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status = "" ;
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg = "" ;
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
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id ;
   }

   public void setTbm21_study_id( long value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id = value ;
   }

   public String getTbm21_study_nm( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm ;
   }

   public void setTbm21_study_nm( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm = value ;
   }

   public String getTbm21_status( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status ;
   }

   public void setTbm21_status( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status = value ;
   }

   public String getTbm21_del_flg( )
   {
      return gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg ;
   }

   public void setTbm21_del_flg( String value )
   {
      gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg = value ;
   }

   protected long gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_id ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_study_nm ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_status ;
   protected String gxTv_SdtB402_SD08_STUDY_LIST_B402_SD08_STUDY_LISTItem_Tbm21_del_flg ;
}

