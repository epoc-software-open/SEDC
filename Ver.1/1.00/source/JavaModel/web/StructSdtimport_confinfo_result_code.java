import com.genexus.*;

public final  class StructSdtimport_confinfo_result_code implements Cloneable, java.io.Serializable
{
   public StructSdtimport_confinfo_result_code( )
   {
      gxTv_Sdtimport_confinfo_result_code_Code = "" ;
      gxTv_Sdtimport_confinfo_result_code_Error_message = "" ;
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

   public String getCode( )
   {
      return gxTv_Sdtimport_confinfo_result_code_Code ;
   }

   public void setCode( String value )
   {
      gxTv_Sdtimport_confinfo_result_code_Code = value ;
   }

   public String getError_message( )
   {
      return gxTv_Sdtimport_confinfo_result_code_Error_message ;
   }

   public void setError_message( String value )
   {
      gxTv_Sdtimport_confinfo_result_code_Error_message = value ;
   }

   protected String gxTv_Sdtimport_confinfo_result_code_Code ;
   protected String gxTv_Sdtimport_confinfo_result_code_Error_message ;
}

