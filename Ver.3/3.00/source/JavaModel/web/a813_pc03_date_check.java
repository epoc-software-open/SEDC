/*
               File: A813_PC03_DATE_CHECK
        Description: 日付チェック処理（文字型・１項目形式）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:14.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a813_pc03_date_check extends GXProcedure
{
   public a813_pc03_date_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a813_pc03_date_check.class ), "" );
   }

   public a813_pc03_date_check( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String[] aP0 )
   {
      a813_pc03_date_check.this.AV22P_DATE_IO = aP0[0];
      this.aP0 = aP0;
      a813_pc03_date_check.this.aP1 = aP1;
      a813_pc03_date_check.this.aP1 = new byte[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             byte[] aP1 )
   {
      a813_pc03_date_check.this.AV22P_DATE_IO = aP0[0];
      this.aP0 = aP0;
      a813_pc03_date_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25W_OUT_RTN_CD = (byte)(0) ;
      if ( (GXutil.strcmp("", AV22P_DATE_IO)==0) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9W_CHECK_DATE = AV22P_DATE_IO ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "1", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "2", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "3", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "4", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "5", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "6", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "7", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "8", "0")) ;
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV9W_CHECK_DATE, "9", "0")) ;
      if ( ( GXutil.strcmp(AV9W_CHECK_DATE, "0000/00/00") != 0 ) && ( GXutil.strcmp(AV9W_CHECK_DATE, "00/00/00") != 0 ) && ( GXutil.strcmp(AV9W_CHECK_DATE, "00000000") != 0 ) && ( GXutil.strcmp(AV9W_CHECK_DATE, "000000") != 0 ) )
      {
         AV25W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV9W_CHECK_DATE = GXutil.trim( GXutil.strReplace( AV22P_DATE_IO, "/", "")) ;
      AV8W_BYTE_CNT = (byte)(GXutil.byteCount( AV9W_CHECK_DATE, "SHIFT-JIS")) ;
      if ( ( AV8W_BYTE_CNT != 6 ) && ( AV8W_BYTE_CNT != 8 ) )
      {
         AV25W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV8W_BYTE_CNT == 6 )
      {
         AV12W_CHECK_DATE_YYYY = "20" + GXutil.substring( AV9W_CHECK_DATE, 1, 2) ;
         AV11W_CHECK_DATE_MM = GXutil.substring( AV9W_CHECK_DATE, 3, 2) ;
         AV10W_CHECK_DATE_DD = GXutil.substring( AV9W_CHECK_DATE, 5, 2) ;
      }
      else
      {
         AV12W_CHECK_DATE_YYYY = GXutil.substring( AV9W_CHECK_DATE, 1, 4) ;
         AV11W_CHECK_DATE_MM = GXutil.substring( AV9W_CHECK_DATE, 5, 2) ;
         AV10W_CHECK_DATE_DD = GXutil.substring( AV9W_CHECK_DATE, 7, 2) ;
      }
      GXv_int1[0] = AV25W_OUT_RTN_CD ;
      new a813_pc02_date_check(remoteHandle, context).execute( AV12W_CHECK_DATE_YYYY, AV11W_CHECK_DATE_MM, AV10W_CHECK_DATE_DD, GXv_int1) ;
      a813_pc03_date_check.this.AV25W_OUT_RTN_CD = GXv_int1[0] ;
      if ( AV25W_OUT_RTN_CD == 9 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22P_DATE_IO = AV12W_CHECK_DATE_YYYY + "/" + AV11W_CHECK_DATE_MM + "/" + AV10W_CHECK_DATE_DD ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = a813_pc03_date_check.this.AV22P_DATE_IO;
      this.aP1[0] = a813_pc03_date_check.this.AV25W_OUT_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_CHECK_DATE = "" ;
      AV12W_CHECK_DATE_YYYY = "" ;
      AV11W_CHECK_DATE_MM = "" ;
      AV10W_CHECK_DATE_DD = "" ;
      GXv_int1 = new byte [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV25W_OUT_RTN_CD ;
   private byte AV8W_BYTE_CNT ;
   private byte GXv_int1[] ;
   private short Gx_err ;
   private boolean returnInSub ;
   private String AV22P_DATE_IO ;
   private String AV9W_CHECK_DATE ;
   private String AV12W_CHECK_DATE_YYYY ;
   private String AV11W_CHECK_DATE_MM ;
   private String AV10W_CHECK_DATE_DD ;
   private String[] aP0 ;
   private byte[] aP1 ;
}

