/*
               File: StructSdtB602_SD01_USER_LIST
        Description: B602_SD01_USER_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:42.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB602_SD01_USER_LIST implements Cloneable, java.io.Serializable
{
   public StructSdtB602_SD01_USER_LIST( )
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

   public StructSdtB602_SD01_USER_LIST_RESULT getResult( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_Result ;
   }

   public void setResult( StructSdtB602_SD01_USER_LIST_RESULT value )
   {
      gxTv_SdtB602_SD01_USER_LIST_Result = value;
   }

   public java.util.Vector getUser( )
   {
      return gxTv_SdtB602_SD01_USER_LIST_User ;
   }

   public void setUser( java.util.Vector value )
   {
      gxTv_SdtB602_SD01_USER_LIST_User = value ;
   }

   protected StructSdtB602_SD01_USER_LIST_RESULT gxTv_SdtB602_SD01_USER_LIST_Result=null ;
   protected java.util.Vector gxTv_SdtB602_SD01_USER_LIST_User=null ;
}

