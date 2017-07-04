/*
               File: StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem
        Description: A_CHK_INFO_SDT
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem( )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num = new java.math.BigDecimal(0) ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = cal.getTime() ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn = "" ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit = new java.math.BigDecimal(0) ;
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg = "" ;
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
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id ;
   }

   public void setId( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id = value ;
   }

   public String getItem_nm( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm ;
   }

   public void setItem_nm( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm = value ;
   }

   public String getVal_str( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str ;
   }

   public void setVal_str( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str = value ;
   }

   public java.math.BigDecimal getVal_num( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num ;
   }

   public void setVal_num( java.math.BigDecimal value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num = value ;
   }

   public java.util.Date getVal_date( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date ;
   }

   public void setVal_date( java.util.Date value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date = value ;
   }

   public String getChk_kbn( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn ;
   }

   public void setChk_kbn( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn = value ;
   }

   public byte getChk_nulls( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls ;
   }

   public void setChk_nulls( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls = value ;
   }

   public short getChk_byte( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte ;
   }

   public void setChk_byte( short value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte = value ;
   }

   public byte getChk_byte_dec( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec ;
   }

   public void setChk_byte_dec( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec = value ;
   }

   public byte getChk_half( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half ;
   }

   public void setChk_half( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half = value ;
   }

   public java.math.BigDecimal getChk_unit( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit ;
   }

   public void setChk_unit( java.math.BigDecimal value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit = value ;
   }

   public byte getResult( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result ;
   }

   public void setResult( byte value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result = value ;
   }

   public String getResult_msg( )
   {
      return gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg ;
   }

   public void setResult_msg( String value )
   {
      gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg = value ;
   }

   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half ;
   protected byte gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result ;
   protected short gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn ;
   protected String gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg ;
   protected java.math.BigDecimal gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num ;
   protected java.util.Date gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date ;
   protected java.math.BigDecimal gxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit ;
}

