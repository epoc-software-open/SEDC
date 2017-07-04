/*
               File: TAM06_PC01_DATALOG
        Description: メッセージマスタデータログ出力
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:41.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tam06_pc01_datalog extends GXProcedure
{
   public tam06_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam06_pc01_datalog.class ), "" );
   }

   public tam06_pc01_datalog( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        java.util.Date aP5 ,
                        String aP6 ,
                        String aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        String aP10 ,
                        long aP11 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             java.util.Date aP5 ,
                             String aP6 ,
                             String aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             String aP10 ,
                             long aP11 )
   {
      tam06_pc01_datalog.this.AV9P_PGNAME = aP0;
      tam06_pc01_datalog.this.AV8P_MODE = aP1;
      tam06_pc01_datalog.this.AV15P_TAM06_MSG_CD = aP2;
      tam06_pc01_datalog.this.AV16P_TAM06_MSG = aP3;
      tam06_pc01_datalog.this.AV17P_TAM06_DEL_FLG = aP4;
      tam06_pc01_datalog.this.AV18P_TAM06_CRT_DATETIME = aP5;
      tam06_pc01_datalog.this.AV19P_TAM06_CRT_USER_ID = aP6;
      tam06_pc01_datalog.this.AV20P_TAM06_CRT_PROG_NM = aP7;
      tam06_pc01_datalog.this.AV21P_TAM06_UPD_DATETIME = aP8;
      tam06_pc01_datalog.this.AV22P_TAM06_UPD_USER_ID = aP9;
      tam06_pc01_datalog.this.AV23P_TAM06_UPD_PROG_NM = aP10;
      tam06_pc01_datalog.this.AV24P_TAM06_UPD_CNT = aP11;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "メッセージコード:" + AV15P_TAM06_MSG_CD + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV16P_TAM06_MSG + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV17P_TAM06_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV18P_TAM06_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam06_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAM06_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV20P_TAM06_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV21P_TAM06_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam06_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV22P_TAM06_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV23P_TAM06_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV24P_TAM06_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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
   private long AV24P_TAM06_UPD_CNT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV18P_TAM06_CRT_DATETIME ;
   private java.util.Date AV21P_TAM06_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAM06_MSG_CD ;
   private String AV16P_TAM06_MSG ;
   private String AV17P_TAM06_DEL_FLG ;
   private String AV19P_TAM06_CRT_USER_ID ;
   private String AV20P_TAM06_CRT_PROG_NM ;
   private String AV22P_TAM06_UPD_USER_ID ;
   private String AV23P_TAM06_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

