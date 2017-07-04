/*
               File: B808_PC02_DATA_LOG
        Description: データログ出力
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:54.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b808_pc02_data_log extends GXProcedure
{
   public b808_pc02_data_log( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b808_pc02_data_log.class ), "" );
   }

   public b808_pc02_data_log( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection aP3 ,
                        java.util.Date aP4 ,
                        String aP5 ,
                        String aP6 ,
                        java.util.Date aP7 ,
                        String aP8 ,
                        String aP9 ,
                        long aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection aP3 ,
                             java.util.Date aP4 ,
                             String aP5 ,
                             String aP6 ,
                             java.util.Date aP7 ,
                             String aP8 ,
                             String aP9 ,
                             long aP10 )
   {
      b808_pc02_data_log.this.AV8P_Pgmname = aP0;
      b808_pc02_data_log.this.AV13P_LOGKBN = aP1;
      b808_pc02_data_log.this.AV14P_TABLE_NAME = aP2;
      b808_pc02_data_log.this.AV12P_ITEMS = aP3;
      b808_pc02_data_log.this.AV15P_CRT_DATETIME = aP4;
      b808_pc02_data_log.this.AV16P_CRT_USER_ID = aP5;
      b808_pc02_data_log.this.AV17P_CRT_PROG_NM = aP6;
      b808_pc02_data_log.this.AV18P_UPD_DATETIME = aP7;
      b808_pc02_data_log.this.AV19P_UPD_USER_ID = aP8;
      b808_pc02_data_log.this.AV20P_UPD_PROG_NM = aP9;
      b808_pc02_data_log.this.AV10P_UPD_CNT = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV23Pgmname) ;
      AV11W_LOG_TXT = AV14P_TABLE_NAME ;
      AV9W_CNT = 1 ;
      while ( AV9W_CNT <= AV12P_ITEMS.size() )
      {
         AV11W_LOG_TXT = AV11W_LOG_TXT + GXutil.chr( (short)(9)) + (String)AV12P_ITEMS.elementAt(-1+(int)(AV9W_CNT)) ;
         AV9W_CNT = (long)(AV9W_CNT+1) ;
      }
      GXt_char1 = AV11W_LOG_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV15P_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      b808_pc02_data_log.this.GXt_char1 = GXv_char2[0] ;
      GXt_char3 = AV11W_LOG_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV18P_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      b808_pc02_data_log.this.GXt_char3 = GXv_char4[0] ;
      AV11W_LOG_TXT = AV11W_LOG_TXT + GXutil.chr( (short)(9)) + GXt_char1 + GXutil.chr( (short)(9)) + AV16P_CRT_USER_ID + GXutil.chr( (short)(9)) + AV17P_CRT_PROG_NM + GXutil.chr( (short)(9)) + GXt_char3 + GXutil.chr( (short)(9)) + AV19P_UPD_USER_ID + GXutil.chr( (short)(9)) + AV20P_UPD_PROG_NM + GXutil.chr( (short)(9)) + GXutil.trim( GXutil.str( AV10P_UPD_CNT, 10, 0)) ;
      GXt_char3 = AV11W_LOG_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(3), GXv_char4) ;
      b808_pc02_data_log.this.GXt_char3 = GXv_char4[0] ;
      AV11W_LOG_TXT = GXutil.strReplace( AV11W_LOG_TXT, GXt_char3, "@br@") ;
      GXt_char3 = AV11W_LOG_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(2), GXv_char4) ;
      b808_pc02_data_log.this.GXt_char3 = GXv_char4[0] ;
      AV11W_LOG_TXT = GXutil.strReplace( AV11W_LOG_TXT, GXt_char3, "@br@") ;
      GXt_char3 = AV11W_LOG_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char4) ;
      b808_pc02_data_log.this.GXt_char3 = GXv_char4[0] ;
      AV11W_LOG_TXT = GXutil.strReplace( AV11W_LOG_TXT, GXt_char3, "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV8P_Pgmname, AV13P_LOGKBN, AV11W_LOG_TXT) ;
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
      AV23Pgmname = "" ;
      AV11W_LOG_TXT = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      AV23Pgmname = "B808_PC02_DATA_LOG" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B808_PC02_DATA_LOG" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long AV10P_UPD_CNT ;
   private long AV9W_CNT ;
   private String AV8P_Pgmname ;
   private String AV23Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private java.util.Date AV15P_CRT_DATETIME ;
   private java.util.Date AV18P_UPD_DATETIME ;
   private String AV13P_LOGKBN ;
   private String AV14P_TABLE_NAME ;
   private String AV16P_CRT_USER_ID ;
   private String AV17P_CRT_PROG_NM ;
   private String AV19P_UPD_USER_ID ;
   private String AV20P_UPD_PROG_NM ;
   private String AV11W_LOG_TXT ;
   private GxObjectCollection AV12P_ITEMS ;
}

