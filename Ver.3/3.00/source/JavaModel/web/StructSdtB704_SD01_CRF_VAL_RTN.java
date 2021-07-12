/*
               File: StructSdtB704_SD01_CRF_VAL_RTN
        Description: B704_SD01_CRF_VAL_RTN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:44.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB704_SD01_CRF_VAL_RTN implements Cloneable, java.io.Serializable
{
   public StructSdtB704_SD01_CRF_VAL_RTN( )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd = "" ;
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg = "" ;
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

   public String getResult_cd( )
   {
      return gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd ;
   }

   public void setResult_cd( String value )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg = value ;
   }

   protected String gxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd ;
   protected String gxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg ;
}

