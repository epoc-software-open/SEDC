/*
               File: StructSdtA212_SD01_LIST_A212_SD01_LISTItem
        Description: A212_SD01_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.35
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA212_SD01_LIST_A212_SD01_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA212_SD01_LIST_A212_SD01_LISTItem( )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version = "" ;
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg = "" ;
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

   public long getRow_no( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no ;
   }

   public void setRow_no( long value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no = value ;
   }

   public String getTbm03_dom_cd( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd ;
   }

   public void setTbm03_dom_cd( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd = value ;
   }

   public String getTbm03_dom_var_nm( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm ;
   }

   public void setTbm03_dom_var_nm( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm = value ;
   }

   public String getTbm03_var_desc( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc ;
   }

   public void setTbm03_var_desc( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc = value ;
   }

   public int getTbm03_order( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order ;
   }

   public void setTbm03_order( int value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order = value ;
   }

   public String getTbm03_version( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version ;
   }

   public void setTbm03_version( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version = value ;
   }

   public String getTbm03_del_flg( )
   {
      return gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg ;
   }

   public void setTbm03_del_flg( String value )
   {
      gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg = value ;
   }

   protected int gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_order ;
   protected long gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Row_no ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_cd ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_dom_var_nm ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_var_desc ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_version ;
   protected String gxTv_SdtA212_SD01_LIST_A212_SD01_LISTItem_Tbm03_del_flg ;
}

