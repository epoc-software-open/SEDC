/*
               File: StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem
        Description: B407_SD01_IMPORT_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem( )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id = "" ;
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm = "" ;
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

   public boolean getCheck( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check = value ;
   }

   public boolean getCheck_enabled( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled ;
   }

   public void setCheck_enabled( boolean value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled = value ;
   }

   public String getTbm31_crf_id( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( String value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_nm( )
   {
      return gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm ;
   }

   public void setTbm31_crf_nm( String value )
   {
      gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm = value ;
   }

   protected boolean gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check ;
   protected boolean gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Check_enabled ;
   protected String gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_id ;
   protected String gxTv_SdtB407_SD01_IMPORT_LIST_B407_SD01_IMPORT_LISTItem_Tbm31_crf_nm ;
}

