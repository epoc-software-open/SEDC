/*
               File: TAM07_PC01_DATALOG
        Description: ユーザーマスタデータログ出力
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:43.99
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tam07_pc01_datalog extends GXProcedure
{
   public tam07_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam07_pc01_datalog.class ), "" );
   }

   public tam07_pc01_datalog( int remoteHandle ,
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
                        String aP7 ,
                        java.util.Date aP8 ,
                        String aP9 ,
                        String aP10 ,
                        java.util.Date aP11 ,
                        String aP12 ,
                        String aP13 ,
                        long aP14 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             java.util.Date aP8 ,
                             String aP9 ,
                             String aP10 ,
                             java.util.Date aP11 ,
                             String aP12 ,
                             String aP13 ,
                             long aP14 )
   {
      tam07_pc01_datalog.this.AV9P_PGNAME = aP0;
      tam07_pc01_datalog.this.AV8P_MODE = aP1;
      tam07_pc01_datalog.this.AV15P_TAM07_USER_ID = aP2;
      tam07_pc01_datalog.this.AV16P_TAM07_USER_NM = aP3;
      tam07_pc01_datalog.this.AV17P_TAM07_USER_KANA_NM = aP4;
      tam07_pc01_datalog.this.AV18P_TAM07_PWD = aP5;
      tam07_pc01_datalog.this.AV19P_TAM07_KNGN_PTN_KBN = aP6;
      tam07_pc01_datalog.this.AV20P_TAM07_DEL_FLG = aP7;
      tam07_pc01_datalog.this.AV21P_TAM07_CRT_DATETIME = aP8;
      tam07_pc01_datalog.this.AV22P_TAM07_CRT_USER_ID = aP9;
      tam07_pc01_datalog.this.AV23P_TAM07_CRT_PROG_NM = aP10;
      tam07_pc01_datalog.this.AV24P_TAM07_UPD_DATETIME = aP11;
      tam07_pc01_datalog.this.AV25P_TAM07_UPD_USER_ID = aP12;
      tam07_pc01_datalog.this.AV26P_TAM07_UPD_PROG_NM = aP13;
      tam07_pc01_datalog.this.AV27P_TAM07_UPD_CNT = aP14;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "ユーザーID:" + AV15P_TAM07_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV16P_TAM07_USER_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV17P_TAM07_USER_KANA_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV18P_TAM07_PWD + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAM07_KNGN_PTN_KBN + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV20P_TAM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV21P_TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV22P_TAM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV23P_TAM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV24P_TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV25P_TAM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV26P_TAM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV27P_TAM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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
   private long AV27P_TAM07_UPD_CNT ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private java.util.Date AV21P_TAM07_CRT_DATETIME ;
   private java.util.Date AV24P_TAM07_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAM07_USER_ID ;
   private String AV16P_TAM07_USER_NM ;
   private String AV17P_TAM07_USER_KANA_NM ;
   private String AV18P_TAM07_PWD ;
   private String AV19P_TAM07_KNGN_PTN_KBN ;
   private String AV20P_TAM07_DEL_FLG ;
   private String AV22P_TAM07_CRT_USER_ID ;
   private String AV23P_TAM07_CRT_PROG_NM ;
   private String AV25P_TAM07_UPD_USER_ID ;
   private String AV26P_TAM07_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

