/*
               File: TAT01_PC01_DATALOG
        Description: お知らせ情報テーブルデータログ出力
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:12.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tat01_pc01_datalog extends GXProcedure
{
   public tat01_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tat01_pc01_datalog.class ), "" );
   }

   public tat01_pc01_datalog( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        int aP2 ,
                        java.util.Date aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        String aP8 ,
                        String aP9 ,
                        java.util.Date aP10 ,
                        String aP11 ,
                        String aP12 ,
                        long aP13 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             int aP2 ,
                             java.util.Date aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             String aP8 ,
                             String aP9 ,
                             java.util.Date aP10 ,
                             String aP11 ,
                             String aP12 ,
                             long aP13 )
   {
      tat01_pc01_datalog.this.AV9P_PGNAME = aP0;
      tat01_pc01_datalog.this.AV8P_MODE = aP1;
      tat01_pc01_datalog.this.AV15P_TAT01_INFO_NO = aP2;
      tat01_pc01_datalog.this.AV16P_TAT01_DATE_START = aP3;
      tat01_pc01_datalog.this.AV17P_TAT01_DATE_END = aP4;
      tat01_pc01_datalog.this.AV18P_TAT01_INFO = aP5;
      tat01_pc01_datalog.this.AV19P_TAT01_DEL_FLG = aP6;
      tat01_pc01_datalog.this.AV20P_TAT01_CRT_DATETIME = aP7;
      tat01_pc01_datalog.this.AV21P_TAT01_CRT_USER_ID = aP8;
      tat01_pc01_datalog.this.AV22P_TAT01_CRT_PROG_NM = aP9;
      tat01_pc01_datalog.this.AV23P_TAT01_UPD_DATETIME = aP10;
      tat01_pc01_datalog.this.AV24P_TAT01_UPD_USER_ID = aP11;
      tat01_pc01_datalog.this.AV25P_TAT01_UPD_PROG_NM = aP12;
      tat01_pc01_datalog.this.AV26P_TAT01_UPD_CNT = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "お知らせ情報番号:" + GXutil.trim( GXutil.str( AV15P_TAT01_INFO_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc01_date_edit(remoteHandle, context).execute( AV16P_TAT01_DATE_START, "YYYY/MM/DD", GXv_char2) ;
      tat01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc01_date_edit(remoteHandle, context).execute( AV17P_TAT01_DATE_END, "YYYY/MM/DD", GXv_char2) ;
      tat01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV18P_TAT01_INFO + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAT01_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV20P_TAT01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tat01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV21P_TAT01_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV22P_TAT01_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV23P_TAT01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tat01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV24P_TAT01_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV25P_TAT01_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV26P_TAT01_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV14W_TXT = GXutil.strReplace( AV14W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9P_PGNAME, AV8P_MODE, AV14W_TXT) ;
      cleanup();
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14W_TXT = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV15P_TAT01_INFO_NO ;
   private long AV26P_TAT01_UPD_CNT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV20P_TAT01_CRT_DATETIME ;
   private java.util.Date AV23P_TAT01_UPD_DATETIME ;
   private java.util.Date AV16P_TAT01_DATE_START ;
   private java.util.Date AV17P_TAT01_DATE_END ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV18P_TAT01_INFO ;
   private String AV19P_TAT01_DEL_FLG ;
   private String AV21P_TAT01_CRT_USER_ID ;
   private String AV22P_TAT01_CRT_PROG_NM ;
   private String AV24P_TAT01_UPD_USER_ID ;
   private String AV25P_TAT01_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

