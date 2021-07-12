/*
               File: StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem
        Description: B720_SD03_CRF_ORDER
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: December 24, 2020 16:51:17.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem implements Cloneable, java.io.Serializable
{
   public StructSdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem( )
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

   public short getCrf_id( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id ;
   }

   public void setCrf_id( short value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id = value ;
   }

   public int getVisit_no( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no ;
   }

   public void setVisit_no( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no = value ;
   }

   public int getCrf_order( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order ;
   }

   public void setCrf_order( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order = value ;
   }

   public int getFile_no( )
   {
      return gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no ;
   }

   public void setFile_no( int value )
   {
      gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no = value ;
   }

   protected short gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_id ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Visit_no ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_Crf_order ;
   protected int gxTv_SdtB720_SD03_CRF_ORDER_B720_SD03_CRF_ORDERItem_File_no ;
}

