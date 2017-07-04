/*
               File: StructSdtB705_SD01_ERRCHK_RES
        Description: B705_SD01_ERRCHK_RES
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:57.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB705_SD01_ERRCHK_RES implements Cloneable, java.io.Serializable
{
   public StructSdtB705_SD01_ERRCHK_RES( )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = "" ;
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
      return gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd ;
   }

   public void setResult_cd( String value )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd = value ;
   }

   public java.util.Vector getErr_items( )
   {
      return gxTv_SdtB705_SD01_ERRCHK_RES_Err_items ;
   }

   public void setErr_items( java.util.Vector value )
   {
      gxTv_SdtB705_SD01_ERRCHK_RES_Err_items = value ;
   }

   protected String gxTv_SdtB705_SD01_ERRCHK_RES_Result_cd ;
   protected java.util.Vector gxTv_SdtB705_SD01_ERRCHK_RES_Err_items=null ;
}

