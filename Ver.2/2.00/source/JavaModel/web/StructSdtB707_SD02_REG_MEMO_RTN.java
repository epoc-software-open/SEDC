/*
               File: StructSdtB707_SD02_REG_MEMO_RTN
        Description: B707_SD02_REG_MEMO_RTN
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:58.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtB707_SD02_REG_MEMO_RTN implements Cloneable, java.io.Serializable
{
   public StructSdtB707_SD02_REG_MEMO_RTN( )
   {
      gxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd = "" ;
      gxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg = "" ;
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
      return gxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd ;
   }

   public void setResult_cd( String value )
   {
      gxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd = value ;
   }

   public String getErr_msg( )
   {
      return gxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg ;
   }

   public void setErr_msg( String value )
   {
      gxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg = value ;
   }

   public short getMemo_no( )
   {
      return gxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no ;
   }

   public void setMemo_no( short value )
   {
      gxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no = value ;
   }

   protected short gxTv_SdtB707_SD02_REG_MEMO_RTN_Memo_no ;
   protected String gxTv_SdtB707_SD02_REG_MEMO_RTN_Result_cd ;
   protected String gxTv_SdtB707_SD02_REG_MEMO_RTN_Err_msg ;
}

