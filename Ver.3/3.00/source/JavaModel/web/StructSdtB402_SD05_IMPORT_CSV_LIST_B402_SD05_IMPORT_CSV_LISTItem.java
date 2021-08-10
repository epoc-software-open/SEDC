/*
               File: StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem
        Description: B402_SD05_IMPORT_CSV_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:41.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm = "" ;
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm = "" ;
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = cal.getTime() ;
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg = "" ;
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

   public long getTbt16_import_no( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no ;
   }

   public void setTbt16_import_no( long value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no = value ;
   }

   public String getTbt16_import_file_nm( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm ;
   }

   public void setTbt16_import_file_nm( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm = value ;
   }

   public String getTbt16_file_nm( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm ;
   }

   public void setTbt16_file_nm( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm = value ;
   }

   public java.util.Date getTbt16_import_datetime( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime ;
   }

   public void setTbt16_import_datetime( java.util.Date value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime = value ;
   }

   public String getTbt16_del_flg( )
   {
      return gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg ;
   }

   public void setTbt16_del_flg( String value )
   {
      gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg = value ;
   }

   protected long gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_no ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_file_nm ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_file_nm ;
   protected String gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_del_flg ;
   protected java.util.Date gxTv_SdtB402_SD05_IMPORT_CSV_LIST_B402_SD05_IMPORT_CSV_LISTItem_Tbt16_import_datetime ;
}

