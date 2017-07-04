import com.genexus.*;

public final  class StructSdtB602_SD02_DB_LIST implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD02_DB_LIST( )
   {
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

   public StructSdtB602_SD02_DB_LIST_RESULT getResult( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_Result ;
   }

   public void setResult( StructSdtB602_SD02_DB_LIST_RESULT value )
   {
      gxTv_SdtB602_SD02_DB_LIST_Result = value;
   }

   public java.util.Vector getDb( )
   {
      return gxTv_SdtB602_SD02_DB_LIST_Db ;
   }

   public void setDb( java.util.Vector value )
   {
      gxTv_SdtB602_SD02_DB_LIST_Db = value ;
   }

   protected StructSdtB602_SD02_DB_LIST_RESULT gxTv_SdtB602_SD02_DB_LIST_Result=null ;
   protected java.util.Vector gxTv_SdtB602_SD02_DB_LIST_Db=null ;
}

