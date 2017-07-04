/*
               File: A818_PC01_KINGAKU_VC_TO_NM
        Description: 金額文字⇒数値変換処理（カンマ付き文字列⇒数値）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:45.15
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a818_pc01_kingaku_vc_to_nm extends GXProcedure
{
   public a818_pc01_kingaku_vc_to_nm( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a818_pc01_kingaku_vc_to_nm.class ), "" );
   }

   public a818_pc01_kingaku_vc_to_nm( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             java.math.BigDecimal[] aP2 )
   {
      a818_pc01_kingaku_vc_to_nm.this.AV9P_DETL_TRN000_SINSEI_TUKA_GAKU_VC = aP0;
      a818_pc01_kingaku_vc_to_nm.this.AV14P_MST000_KETASU = aP1;
      a818_pc01_kingaku_vc_to_nm.this.aP2 = aP2;
      a818_pc01_kingaku_vc_to_nm.this.aP3 = aP3;
      a818_pc01_kingaku_vc_to_nm.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        java.math.BigDecimal[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             java.math.BigDecimal[] aP2 ,
                             String[] aP3 )
   {
      a818_pc01_kingaku_vc_to_nm.this.AV9P_DETL_TRN000_SINSEI_TUKA_GAKU_VC = aP0;
      a818_pc01_kingaku_vc_to_nm.this.AV14P_MST000_KETASU = aP1;
      a818_pc01_kingaku_vc_to_nm.this.aP2 = aP2;
      a818_pc01_kingaku_vc_to_nm.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13W_MSG = "" ;
      AV8W_DETL_TRN000_SINSEI_TUKA_GAKU = DecimalUtil.doubleToDec(0) ;
      AV17W_VC_NUM = GXutil.trim( GXutil.strReplace( AV9P_DETL_TRN000_SINSEI_TUKA_GAKU_VC, ",", "")) ;
      if ( GXutil.strSearch( AV17W_VC_NUM, "-", 1) != GXutil.strSearchRev( AV17W_VC_NUM, "-", -1) )
      {
         AV13W_MSG = "-符号が複数存在するエラーです。" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strSearch( AV17W_VC_NUM, "-", 1) != 0 ) && ( GXutil.strSearch( AV17W_VC_NUM, "-", 1) != 1 ) )
      {
         AV13W_MSG = "-符号の位置のエラーです。" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strSearch( AV17W_VC_NUM, ".", 1) != GXutil.strSearchRev( AV17W_VC_NUM, ".", -1) )
      {
         AV13W_MSG = ".符号が複数存在するエラーです。" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV14P_MST000_KETASU > 4 )
      {
         AV13W_MSG = "小数部桁数指定が４を超えているエラーです。" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_SYOSU_CNT = (short)(0) ;
      AV16W_SYOSYU_FLG = (byte)(0) ;
      AV18W_VC_SYOSU = "" ;
      AV12W_LEN = (short)(GXutil.len( AV17W_VC_NUM)) ;
      AV11W_IX1 = (short)(1) ;
      while ( AV11W_IX1 <= AV12W_LEN )
      {
         AV10W_EDIT_1VC = GXutil.substring( AV17W_VC_NUM, AV11W_IX1, 1) ;
         if ( GXutil.strcmp(AV10W_EDIT_1VC, ".") == 0 )
         {
            AV16W_SYOSYU_FLG = (byte)(1) ;
         }
         if ( AV16W_SYOSYU_FLG == 1 )
         {
            AV15W_SYOSU_CNT = (short)(AV15W_SYOSU_CNT+1) ;
         }
         if ( ( AV15W_SYOSU_CNT == 0 ) || ( AV15W_SYOSU_CNT == 1 ) )
         {
            AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
         }
         else if ( AV15W_SYOSU_CNT == 2 )
         {
            if ( AV14P_MST000_KETASU == 0 )
            {
               if (true) break;
            }
            else
            {
               AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
            }
         }
         else if ( AV15W_SYOSU_CNT == 3 )
         {
            if ( AV14P_MST000_KETASU == 1 )
            {
               if (true) break;
            }
            else
            {
               AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
            }
         }
         else if ( AV15W_SYOSU_CNT == 4 )
         {
            if ( AV14P_MST000_KETASU == 2 )
            {
               if (true) break;
            }
            else
            {
               AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
            }
         }
         else if ( AV15W_SYOSU_CNT == 5 )
         {
            if ( AV14P_MST000_KETASU == 3 )
            {
               if (true) break;
            }
            else
            {
               AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
            }
         }
         else if ( AV15W_SYOSU_CNT == 6 )
         {
            if ( AV14P_MST000_KETASU == 4 )
            {
               if (true) break;
            }
            else
            {
               AV18W_VC_SYOSU = AV18W_VC_SYOSU + AV10W_EDIT_1VC ;
            }
         }
         AV11W_IX1 = (short)(AV11W_IX1+1) ;
      }
      AV17W_VC_NUM = AV18W_VC_SYOSU ;
      AV8W_DETL_TRN000_SINSEI_TUKA_GAKU = DecimalUtil.doubleToDec(GXutil.val( AV18W_VC_SYOSU, ".")) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a818_pc01_kingaku_vc_to_nm.this.AV8W_DETL_TRN000_SINSEI_TUKA_GAKU;
      this.aP3[0] = a818_pc01_kingaku_vc_to_nm.this.AV13W_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_DETL_TRN000_SINSEI_TUKA_GAKU = DecimalUtil.ZERO ;
      AV13W_MSG = "" ;
      AV17W_VC_NUM = "" ;
      AV18W_VC_SYOSU = "" ;
      AV10W_EDIT_1VC = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14P_MST000_KETASU ;
   private byte AV16W_SYOSYU_FLG ;
   private short AV15W_SYOSU_CNT ;
   private short AV12W_LEN ;
   private short AV11W_IX1 ;
   private short Gx_err ;
   private java.math.BigDecimal AV8W_DETL_TRN000_SINSEI_TUKA_GAKU ;
   private boolean returnInSub ;
   private String AV9P_DETL_TRN000_SINSEI_TUKA_GAKU_VC ;
   private String AV13W_MSG ;
   private String AV17W_VC_NUM ;
   private String AV18W_VC_SYOSU ;
   private String AV10W_EDIT_1VC ;
   private java.math.BigDecimal[] aP2 ;
   private String[] aP3 ;
}

