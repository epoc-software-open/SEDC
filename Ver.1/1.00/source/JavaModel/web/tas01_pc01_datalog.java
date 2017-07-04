/*
               File: TAS01_PC01_DATALOG
        Description: 項目名称マスタデータログ出力
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:43.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tas01_pc01_datalog extends GXProcedure
{
   public tas01_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tas01_pc01_datalog.class ), "" );
   }

   public tas01_pc01_datalog( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
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
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
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
      tas01_pc01_datalog.this.AV9P_PGNAME = aP0;
      tas01_pc01_datalog.this.AV8P_MODE = aP1;
      tas01_pc01_datalog.this.AV15P_TAS01_DATA_KIND = aP2;
      tas01_pc01_datalog.this.AV16P_TAS01_ITEM_CD = aP3;
      tas01_pc01_datalog.this.AV17P_TAS01_ITEM_NM = aP4;
      tas01_pc01_datalog.this.AV18P_TAS01_ITEM_RYAK = aP5;
      tas01_pc01_datalog.this.AV19P_TAS01_DEL_FLG = aP6;
      tas01_pc01_datalog.this.AV20P_TAS01_CRT_DATETIME = aP7;
      tas01_pc01_datalog.this.AV21P_TAS01_CRT_USER_ID = aP8;
      tas01_pc01_datalog.this.AV22P_TAS01_CRT_PROG_NM = aP9;
      tas01_pc01_datalog.this.AV23P_TAS01_UPD_DATETIME = aP10;
      tas01_pc01_datalog.this.AV24P_TAS01_UPD_USER_ID = aP11;
      tas01_pc01_datalog.this.AV25P_TAS01_UPD_PROG_NM = aP12;
      tas01_pc01_datalog.this.AV26P_TAS01_UPD_CNT = aP13;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "データ種類:" + AV15P_TAS01_DATA_KIND + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + "項目コード:" + AV16P_TAS01_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV17P_TAS01_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV18P_TAS01_ITEM_RYAK + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAS01_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV20P_TAS01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tas01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV21P_TAS01_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV22P_TAS01_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV23P_TAS01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tas01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV24P_TAS01_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV25P_TAS01_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV26P_TAS01_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV26P_TAS01_UPD_CNT ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private java.util.Date AV20P_TAS01_CRT_DATETIME ;
   private java.util.Date AV23P_TAS01_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAS01_DATA_KIND ;
   private String AV16P_TAS01_ITEM_CD ;
   private String AV17P_TAS01_ITEM_NM ;
   private String AV18P_TAS01_ITEM_RYAK ;
   private String AV19P_TAS01_DEL_FLG ;
   private String AV21P_TAS01_CRT_USER_ID ;
   private String AV22P_TAS01_CRT_PROG_NM ;
   private String AV24P_TAS01_UPD_USER_ID ;
   private String AV25P_TAS01_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

