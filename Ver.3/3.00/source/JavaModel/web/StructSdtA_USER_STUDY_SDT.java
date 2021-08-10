/*
               File: StructSdtA_USER_STUDY_SDT
        Description: A_USER_STUDY_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:31:55.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA_USER_STUDY_SDT implements Cloneable, java.io.Serializable
{
   public StructSdtA_USER_STUDY_SDT( )
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

   public java.util.Vector getStudy_id( )
   {
      return gxTv_SdtA_USER_STUDY_SDT_Study_id ;
   }

   public void setStudy_id( java.util.Vector value )
   {
      gxTv_SdtA_USER_STUDY_SDT_Study_id = value ;
   }

   protected java.util.Vector gxTv_SdtA_USER_STUDY_SDT_Study_id=null ;
}

