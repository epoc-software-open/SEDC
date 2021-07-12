/*
               File: TBM01_PC01_DATALOG
        Description: システム規定値マスタデータログ出力
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tbm01_pc01_datalog extends GXProcedure
{
   public tbm01_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm01_pc01_datalog.class ), "" );
   }

   public tbm01_pc01_datalog( int remoteHandle ,
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
                        java.util.Date aP6 ,
                        String aP7 ,
                        String aP8 ,
                        java.util.Date aP9 ,
                        String aP10 ,
                        String aP11 ,
                        long aP12 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             java.util.Date aP6 ,
                             String aP7 ,
                             String aP8 ,
                             java.util.Date aP9 ,
                             String aP10 ,
                             String aP11 ,
                             long aP12 )
   {
      tbm01_pc01_datalog.this.AV9P_PGNAME = aP0;
      tbm01_pc01_datalog.this.AV8P_MODE = aP1;
      tbm01_pc01_datalog.this.AV15P_TBM01_SYS_ID = aP2;
      tbm01_pc01_datalog.this.AV16P_TBM01_SYS_VALUE = aP3;
      tbm01_pc01_datalog.this.AV17P_TBM01_NOTE = aP4;
      tbm01_pc01_datalog.this.AV18P_TBM01_DEL_FLG = aP5;
      tbm01_pc01_datalog.this.AV19P_TBM01_CRT_DATETIME = aP6;
      tbm01_pc01_datalog.this.AV20P_TBM01_CRT_USER_ID = aP7;
      tbm01_pc01_datalog.this.AV21P_TBM01_CRT_PROG_NM = aP8;
      tbm01_pc01_datalog.this.AV22P_TBM01_UPD_DATETIME = aP9;
      tbm01_pc01_datalog.this.AV23P_TBM01_UPD_USER_ID = aP10;
      tbm01_pc01_datalog.this.AV24P_TBM01_UPD_PROG_NM = aP11;
      tbm01_pc01_datalog.this.AV25P_TBM01_UPD_CNT = aP12;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "規定値キーワード:" + AV15P_TBM01_SYS_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV16P_TBM01_SYS_VALUE + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV17P_TBM01_NOTE + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV18P_TBM01_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV19P_TBM01_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV20P_TBM01_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV21P_TBM01_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV22P_TBM01_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm01_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV23P_TBM01_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV24P_TBM01_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV25P_TBM01_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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
   private long AV25P_TBM01_UPD_CNT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV19P_TBM01_CRT_DATETIME ;
   private java.util.Date AV22P_TBM01_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TBM01_SYS_ID ;
   private String AV16P_TBM01_SYS_VALUE ;
   private String AV17P_TBM01_NOTE ;
   private String AV18P_TBM01_DEL_FLG ;
   private String AV20P_TBM01_CRT_USER_ID ;
   private String AV21P_TBM01_CRT_PROG_NM ;
   private String AV23P_TBM01_UPD_USER_ID ;
   private String AV24P_TBM01_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

