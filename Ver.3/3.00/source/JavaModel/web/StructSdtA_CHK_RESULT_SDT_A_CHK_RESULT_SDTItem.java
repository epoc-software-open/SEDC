/*
               File: StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem
        Description: A_CHK_RESULT_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:41.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem( )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = "" ;
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

   public String getId( )
   {
      return gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id ;
   }

   public void setId( String value )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id = value ;
   }

   public boolean getFocus( )
   {
      return gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus ;
   }

   public void setFocus( boolean value )
   {
      gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus = value ;
   }

   protected boolean gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus ;
   protected String gxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id ;
}

