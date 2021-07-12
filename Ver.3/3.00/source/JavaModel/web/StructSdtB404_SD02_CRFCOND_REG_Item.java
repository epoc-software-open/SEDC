/*
               File: StructSdtB404_SD02_CRFCOND_REG_Item
        Description: B404_SD02_CRFCOND_REG
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB404_SD02_CRFCOND_REG_Item implements Cloneable, java.io.Serializable
{
   public StructSdtB404_SD02_CRFCOND_REG_Item( )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm = "" ;
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
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check ;
   }

   public void setCheck( boolean value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check = value ;
   }

   public short getTbm31_crf_id( )
   {
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id ;
   }

   public void setTbm31_crf_id( short value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id = value ;
   }

   public String getTbm31_crf_nm( )
   {
      return gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm ;
   }

   public void setTbm31_crf_nm( String value )
   {
      gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm = value ;
   }

   protected short gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id ;
   protected boolean gxTv_SdtB404_SD02_CRFCOND_REG_Item_Check ;
   protected String gxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_nm ;
}

