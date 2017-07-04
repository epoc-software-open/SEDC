/*
               File: A813_PC02_DATE_CHECK
        Description: 日付チェック処理（文字型）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a813_pc02_date_check extends GXProcedure
{
   public a813_pc02_date_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a813_pc02_date_check.class ), "" );
   }

   public a813_pc02_date_check( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           String aP2 )
   {
      a813_pc02_date_check.this.AV18P_DATE_YEAR = aP0;
      a813_pc02_date_check.this.AV17P_DATE_MONTH = aP1;
      a813_pc02_date_check.this.AV16P_DATE_DAY = aP2;
      a813_pc02_date_check.this.aP3 = new byte[] {0};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             byte[] aP3 )
   {
      a813_pc02_date_check.this.AV18P_DATE_YEAR = aP0;
      a813_pc02_date_check.this.AV17P_DATE_MONTH = aP1;
      a813_pc02_date_check.this.AV16P_DATE_DAY = aP2;
      a813_pc02_date_check.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19W_OUT_RTN_CD = (byte)(0) ;
      AV10W_DATE_YEAR = GXutil.trim( AV18P_DATE_YEAR) ;
      AV9W_DATE_MONTH = GXutil.trim( AV17P_DATE_MONTH) ;
      AV8W_DATE_DAY = GXutil.trim( AV16P_DATE_DAY) ;
      if ( (GXutil.strcmp("", AV10W_DATE_YEAR)==0) || (GXutil.strcmp("", AV9W_DATE_MONTH)==0) || (GXutil.strcmp("", AV8W_DATE_DAY)==0) )
      {
         AV19W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_DATE_YEAR = GXutil.strReplace( AV10W_DATE_YEAR, " ", "A") ;
      AV9W_DATE_MONTH = GXutil.strReplace( AV9W_DATE_MONTH, " ", "A") ;
      AV8W_DATE_DAY = GXutil.strReplace( AV8W_DATE_DAY, " ", "A") ;
      AV15W_NUM_YEAR = (short)(GXutil.lval( AV10W_DATE_YEAR)) ;
      AV14W_NUM_MONTH = (byte)(GXutil.lval( AV9W_DATE_MONTH)) ;
      AV13W_NUM_DAY = (byte)(GXutil.lval( AV8W_DATE_DAY)) ;
      AV11W_DATE_YMD = localUtil.ymdtod( AV15W_NUM_YEAR, AV14W_NUM_MONTH, AV13W_NUM_DAY) ;
      if ( GXutil.nullDate().equals(AV11W_DATE_YMD) )
      {
         AV19W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = a813_pc02_date_check.this.AV19W_OUT_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_DATE_YEAR = "" ;
      AV9W_DATE_MONTH = "" ;
      AV8W_DATE_DAY = "" ;
      AV11W_DATE_YMD = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19W_OUT_RTN_CD ;
   private byte AV14W_NUM_MONTH ;
   private byte AV13W_NUM_DAY ;
   private short AV15W_NUM_YEAR ;
   private short Gx_err ;
   private java.util.Date AV11W_DATE_YMD ;
   private boolean returnInSub ;
   private String AV18P_DATE_YEAR ;
   private String AV17P_DATE_MONTH ;
   private String AV16P_DATE_DAY ;
   private String AV10W_DATE_YEAR ;
   private String AV9W_DATE_MONTH ;
   private String AV8W_DATE_DAY ;
   private byte[] aP3 ;
}

