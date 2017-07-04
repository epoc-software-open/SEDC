/*
               File: TAM02_PC01_DATALOG
        Description: メニューIDマスタデータログ出力
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:42.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tam02_pc01_datalog extends GXProcedure
{
   public tam02_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam02_pc01_datalog.class ), "" );
   }

   public tam02_pc01_datalog( int remoteHandle ,
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
                        String aP8 ,
                        java.util.Date aP9 ,
                        String aP10 ,
                        String aP11 ,
                        java.util.Date aP12 ,
                        String aP13 ,
                        String aP14 ,
                        long aP15 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             java.util.Date aP9 ,
                             String aP10 ,
                             String aP11 ,
                             java.util.Date aP12 ,
                             String aP13 ,
                             String aP14 ,
                             long aP15 )
   {
      tam02_pc01_datalog.this.AV9P_PGNAME = aP0;
      tam02_pc01_datalog.this.AV8P_MODE = aP1;
      tam02_pc01_datalog.this.AV15P_TAM01_SYS_ID = aP2;
      tam02_pc01_datalog.this.AV16P_TAM02_MENU_ID_TREE_1 = aP3;
      tam02_pc01_datalog.this.AV17P_TAM02_MENU_ID_TREE_2 = aP4;
      tam02_pc01_datalog.this.AV18P_TAM02_MENU_ID_TREE_3 = aP5;
      tam02_pc01_datalog.this.AV19P_TAM02_MENU_NM = aP6;
      tam02_pc01_datalog.this.AV20P_TAM02_APP_ID = aP7;
      tam02_pc01_datalog.this.AV21P_TAM02_DEL_FLG = aP8;
      tam02_pc01_datalog.this.AV22P_TAM02_CRT_DATETIME = aP9;
      tam02_pc01_datalog.this.AV23P_TAM02_CRT_USER_ID = aP10;
      tam02_pc01_datalog.this.AV24P_TAM02_CRT_PROG_NM = aP11;
      tam02_pc01_datalog.this.AV25P_TAM02_UPD_DATETIME = aP12;
      tam02_pc01_datalog.this.AV26P_TAM02_UPD_USER_ID = aP13;
      tam02_pc01_datalog.this.AV27P_TAM02_UPD_PROG_NM = aP14;
      tam02_pc01_datalog.this.AV28P_TAM02_UPD_CNT = aP15;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "システムID:" + AV15P_TAM01_SYS_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + "メニューID（階層１）:" + AV16P_TAM02_MENU_ID_TREE_1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + "メニューID（階層２）:" + AV17P_TAM02_MENU_ID_TREE_2 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + "メニューID（階層３）:" + AV18P_TAM02_MENU_ID_TREE_3 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAM02_MENU_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV20P_TAM02_APP_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV21P_TAM02_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV22P_TAM02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam02_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV23P_TAM02_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV24P_TAM02_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV25P_TAM02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam02_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV26P_TAM02_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV27P_TAM02_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV28P_TAM02_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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
   private long AV28P_TAM02_UPD_CNT ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private java.util.Date AV22P_TAM02_CRT_DATETIME ;
   private java.util.Date AV25P_TAM02_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAM01_SYS_ID ;
   private String AV16P_TAM02_MENU_ID_TREE_1 ;
   private String AV17P_TAM02_MENU_ID_TREE_2 ;
   private String AV18P_TAM02_MENU_ID_TREE_3 ;
   private String AV19P_TAM02_MENU_NM ;
   private String AV20P_TAM02_APP_ID ;
   private String AV21P_TAM02_DEL_FLG ;
   private String AV23P_TAM02_CRT_USER_ID ;
   private String AV24P_TAM02_CRT_PROG_NM ;
   private String AV26P_TAM02_UPD_USER_ID ;
   private String AV27P_TAM02_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

