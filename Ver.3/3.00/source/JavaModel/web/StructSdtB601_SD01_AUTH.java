/*
               File: StructSdtB601_SD01_AUTH
        Description: B601_SD01_AUTH
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB601_SD01_AUTH implements Cloneable, java.io.Serializable
{
   public StructSdtB601_SD01_AUTH( )
   {
      gxTv_SdtB601_SD01_AUTH_Handle = "" ;
      gxTv_SdtB601_SD01_AUTH_Belong = "" ;
      gxTv_SdtB601_SD01_AUTH_Email = "" ;
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

   public byte getAuth_result( )
   {
      return gxTv_SdtB601_SD01_AUTH_Auth_result ;
   }

   public void setAuth_result( byte value )
   {
      gxTv_SdtB601_SD01_AUTH_Auth_result = value ;
   }

   public String getHandle( )
   {
      return gxTv_SdtB601_SD01_AUTH_Handle ;
   }

   public void setHandle( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Handle = value ;
   }

   public long getRole_authority_id( )
   {
      return gxTv_SdtB601_SD01_AUTH_Role_authority_id ;
   }

   public void setRole_authority_id( long value )
   {
      gxTv_SdtB601_SD01_AUTH_Role_authority_id = value ;
   }

   public String getBelong( )
   {
      return gxTv_SdtB601_SD01_AUTH_Belong ;
   }

   public void setBelong( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Belong = value ;
   }

   public String getEmail( )
   {
      return gxTv_SdtB601_SD01_AUTH_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtB601_SD01_AUTH_Email = value ;
   }

   protected byte gxTv_SdtB601_SD01_AUTH_Auth_result ;
   protected long gxTv_SdtB601_SD01_AUTH_Role_authority_id ;
   protected String gxTv_SdtB601_SD01_AUTH_Handle ;
   protected String gxTv_SdtB601_SD01_AUTH_Belong ;
   protected String gxTv_SdtB601_SD01_AUTH_Email ;
}

