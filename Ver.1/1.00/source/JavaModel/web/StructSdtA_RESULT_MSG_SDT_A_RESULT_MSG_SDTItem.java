import com.genexus.*;

public final  class StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem( )
   {
      gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg = "" ;
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

   public String getResult_msg( )
   {
      return gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg ;
   }

   public void setResult_msg( String value )
   {
      gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg = value ;
   }

   protected String gxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg ;
}

