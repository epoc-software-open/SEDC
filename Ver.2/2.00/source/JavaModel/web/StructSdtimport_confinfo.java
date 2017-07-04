/*
               File: StructSdtimport_confinfo
        Description: import_confinfo
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:21:0.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtimport_confinfo implements Cloneable, java.io.Serializable
{
   public StructSdtimport_confinfo( )
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

   public StructSdtimport_confinfo_result_code getResult_code( )
   {
      return gxTv_Sdtimport_confinfo_Result_code ;
   }

   public void setResult_code( StructSdtimport_confinfo_result_code value )
   {
      gxTv_Sdtimport_confinfo_Result_code = value;
   }

   protected StructSdtimport_confinfo_result_code gxTv_Sdtimport_confinfo_Result_code=null ;
}

