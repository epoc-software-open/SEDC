import com.genexus.*;

public final  class StructSdtB602_SD04_CONTENT_LIST_RESULT implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD04_CONTENT_LIST_RESULT( )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Err_msg = "" ;
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

   public byte getCode( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Code ;
   }

   public void setCode( byte value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Code = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Err_msg = value ;
   }

   protected byte gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Code ;
   protected String gxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Err_msg ;
}

