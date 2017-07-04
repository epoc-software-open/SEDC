import com.genexus.*;

public final  class StructSdtB602_SD01_USER_LIST_USERItem implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD01_USER_LIST_USERItem( )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Password = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong = "" ;
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Email = "" ;
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

   public String getLogin_id( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id ;
   }

   public void setLogin_id( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id = value ;
   }

   public String getPassword( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Password ;
   }

   public void setPassword( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Password = value ;
   }

   public String getHandle( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle ;
   }

   public void setHandle( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle = value ;
   }

   public long getRole_authority_id( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id ;
   }

   public void setRole_authority_id( long value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id = value ;
   }

   public String getBelong( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong ;
   }

   public void setBelong( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong = value ;
   }

   public String getEmail( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_USERItem_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtB602_SD01_USER_LIST_USERItem_Email = value ;
   }

   protected long gxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Password ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Handle ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Belong ;
   protected String gxTv_SdtB602_SD01_USER_LIST_USERItem_Email ;
}

