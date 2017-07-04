import com.genexus.*;

public final  class StructSdtB706_SD01_CRF_REG_RTN implements Cloneable, java.io.Serializable
{
   public StructSdtB706_SD01_CRF_REG_RTN( )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = "" ;
      gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = "" ;
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
      return gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd ;
   }

   public void setResult_cd( String value )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg = value ;
   }

   protected String gxTv_SdtB706_SD01_CRF_REG_RTN_Result_cd ;
   protected String gxTv_SdtB706_SD01_CRF_REG_RTN_Err_msg ;
}

