/*
               File: TAS02_PC01_DATALOG
        Description: 和暦元号マスタデータログ出力
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:12.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tas02_pc01_datalog extends GXProcedure
{
   public tas02_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tas02_pc01_datalog.class ), "" );
   }

   public tas02_pc01_datalog( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        short aP5 ,
                        String aP6 ,
                        String aP7 ,
                        String aP8 ,
                        String aP9 ,
                        String aP10 ,
                        java.util.Date aP11 ,
                        String aP12 ,
                        String aP13 ,
                        java.util.Date aP14 ,
                        String aP15 ,
                        String aP16 ,
                        long aP17 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10, aP11, aP12, aP13, aP14, aP15, aP16, aP17);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             short aP5 ,
                             String aP6 ,
                             String aP7 ,
                             String aP8 ,
                             String aP9 ,
                             String aP10 ,
                             java.util.Date aP11 ,
                             String aP12 ,
                             String aP13 ,
                             java.util.Date aP14 ,
                             String aP15 ,
                             String aP16 ,
                             long aP17 )
   {
      tas02_pc01_datalog.this.AV9P_PGNAME = aP0;
      tas02_pc01_datalog.this.AV8P_MODE = aP1;
      tas02_pc01_datalog.this.AV15P_TAS02_GNGO_KBN = aP2;
      tas02_pc01_datalog.this.AV16P_TAS02_GNGO_NM = aP3;
      tas02_pc01_datalog.this.AV17P_TAS02_GNGO_RYAK_NM = aP4;
      tas02_pc01_datalog.this.AV18P_TAS02_HNKAN_NEN = aP5;
      tas02_pc01_datalog.this.AV19P_TAS02_DATE_START = aP6;
      tas02_pc01_datalog.this.AV20P_TAS02_DATE_END = aP7;
      tas02_pc01_datalog.this.AV21P_TAS02_DATE_W_START = aP8;
      tas02_pc01_datalog.this.AV22P_TAS02_DATE_W_END = aP9;
      tas02_pc01_datalog.this.AV23P_TAS02_DEL_FLG = aP10;
      tas02_pc01_datalog.this.AV24P_TAS02_CRT_DATETIME = aP11;
      tas02_pc01_datalog.this.AV25P_TAS02_CRT_USER_ID = aP12;
      tas02_pc01_datalog.this.AV26P_TAS02_CRT_PROG_NM = aP13;
      tas02_pc01_datalog.this.AV27P_TAS02_UPD_DATETIME = aP14;
      tas02_pc01_datalog.this.AV28P_TAS02_UPD_USER_ID = aP15;
      tas02_pc01_datalog.this.AV29P_TAS02_UPD_PROG_NM = aP16;
      tas02_pc01_datalog.this.AV30P_TAS02_UPD_CNT = aP17;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      AV14W_TXT = "" ;
      AV14W_TXT = AV14W_TXT + "元号区分:" + AV15P_TAS02_GNGO_KBN + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV16P_TAS02_GNGO_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV17P_TAS02_GNGO_RYAK_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV18P_TAS02_HNKAN_NEN, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV19P_TAS02_DATE_START + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV20P_TAS02_DATE_END + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV21P_TAS02_DATE_W_START + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV22P_TAS02_DATE_W_END + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV23P_TAS02_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV24P_TAS02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tas02_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV25P_TAS02_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV26P_TAS02_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV14W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV27P_TAS02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tas02_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV28P_TAS02_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + AV29P_TAS02_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( AV30P_TAS02_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   private short AV18P_TAS02_HNKAN_NEN ;
   private short Gx_err ;
   private long AV30P_TAS02_UPD_CNT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV24P_TAS02_CRT_DATETIME ;
   private java.util.Date AV27P_TAS02_UPD_DATETIME ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAS02_GNGO_KBN ;
   private String AV16P_TAS02_GNGO_NM ;
   private String AV17P_TAS02_GNGO_RYAK_NM ;
   private String AV19P_TAS02_DATE_START ;
   private String AV20P_TAS02_DATE_END ;
   private String AV21P_TAS02_DATE_W_START ;
   private String AV22P_TAS02_DATE_W_END ;
   private String AV23P_TAS02_DEL_FLG ;
   private String AV25P_TAS02_CRT_USER_ID ;
   private String AV26P_TAS02_CRT_PROG_NM ;
   private String AV28P_TAS02_UPD_USER_ID ;
   private String AV29P_TAS02_UPD_PROG_NM ;
   private String AV14W_TXT ;
}

