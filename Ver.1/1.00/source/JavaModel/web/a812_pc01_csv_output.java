/*
               File: A812_PC01_CSV_OUTPUT
        Description: CSVファイル出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.5
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a812_pc01_csv_output extends GXProcedure
{
   public a812_pc01_csv_output( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a812_pc01_csv_output.class ), "" );
   }

   public a812_pc01_csv_output( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             GxObjectCollection aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      a812_pc01_csv_output.this.AV9P_A_LOGIN_SDT = aP0;
      a812_pc01_csv_output.this.AV12P_SYS_ID = aP1;
      a812_pc01_csv_output.this.AV10P_A812_SD01_CSV_OUTPUT = aP2;
      a812_pc01_csv_output.this.AV11P_FILE_NAME = aP3;
      a812_pc01_csv_output.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( SdtA_LOGIN_SDT aP0 ,
                        String aP1 ,
                        GxObjectCollection aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             GxObjectCollection aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      a812_pc01_csv_output.this.AV9P_A_LOGIN_SDT = aP0;
      a812_pc01_csv_output.this.AV12P_SYS_ID = aP1;
      a812_pc01_csv_output.this.AV10P_A812_SD01_CSV_OUTPUT = aP2;
      a812_pc01_csv_output.this.AV11P_FILE_NAME = aP3;
      a812_pc01_csv_output.this.aP4 = aP4;
      a812_pc01_csv_output.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23W_PARM_MSG = "" ;
      AV17W_CSV_SDEL = "\"" ;
      AV16W_CSV_FDEL = "," ;
      /* User Code */
      	AV8W_LANG = "JAVA";
      if ( GXutil.strcmp(AV8W_LANG, "JAVA") == 0 )
      {
         AV22W_MOJI_CD = "MS932" ;
      }
      else
      {
         AV22W_MOJI_CD = "Shift-JIS" ;
      }
      /* Execute user subroutine: S12128 */
      S12128 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_FILE_PATH_FILE = GXutil.trim( AV18W_FILE_PATH) + GXutil.trim( AV11P_FILE_NAME) ;
      AV20W_HANDLE = GXutil.deleteFile( AV19W_FILE_PATH_FILE) ;
      AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwopen( AV19W_FILE_PATH_FILE, "", "", (byte)(0), AV22W_MOJI_CD)) ;
      if ( AV20W_HANDLE != 0 )
      {
         AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         GXt_char1 = AV23W_PARM_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         a812_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
         AV23W_PARM_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV26GXV1 = 1 ;
      while ( AV26GXV1 <= AV10P_A812_SD01_CSV_OUTPUT.size() )
      {
         AV13W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)((SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)AV10P_A812_SD01_CSV_OUTPUT.elementAt(-1+AV26GXV1));
         AV14W_CSV_DATA = "" ;
         AV21W_INIT_FLG = false ;
         AV27GXV2 = 1 ;
         while ( AV27GXV2 <= AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().size() )
         {
            AV15W_CSV_DATA_ITEM = (String)AV13W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().elementAt(-1+AV27GXV2) ;
            if ( ! AV21W_INIT_FLG )
            {
               AV21W_INIT_FLG = true ;
            }
            else
            {
               AV14W_CSV_DATA = AV14W_CSV_DATA + AV16W_CSV_FDEL ;
            }
            AV14W_CSV_DATA = AV14W_CSV_DATA + AV17W_CSV_SDEL ;
            AV14W_CSV_DATA = AV14W_CSV_DATA + AV15W_CSV_DATA_ITEM ;
            AV14W_CSV_DATA = AV14W_CSV_DATA + AV17W_CSV_SDEL ;
            AV27GXV2 = (int)(AV27GXV2+1) ;
         }
         AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV14W_CSV_DATA, (short)(GXutil.byteCount( AV14W_CSV_DATA, AV22W_MOJI_CD)))) ;
         /* Execute user subroutine: S11114 */
         S11114 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwnext( )) ;
         /* Execute user subroutine: S11114 */
         S11114 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV26GXV1 = (int)(AV26GXV1+1) ;
      }
      AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
      cleanup();
   }

   public void S11114( )
   {
      /* 'SUB_CSV_ERROR_CHECK' Routine */
      if ( AV20W_HANDLE != 0 )
      {
         AV20W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         GXt_char1 = AV23W_PARM_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
         a812_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
         AV23W_PARM_MSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S12128( )
   {
      /* 'SUB_GET_CSV_SAVE_AREA' Routine */
      GXt_char1 = AV18W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV9P_A_LOGIN_SDT, AV12P_SYS_ID, "CSV_DOWNLOAD_PATH", GXv_char2) ;
      a812_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV18W_FILE_PATH = GXt_char1 ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = a812_pc01_csv_output.this.AV18W_FILE_PATH;
      this.aP5[0] = a812_pc01_csv_output.this.AV23W_PARM_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18W_FILE_PATH = "" ;
      AV23W_PARM_MSG = "" ;
      AV17W_CSV_SDEL = "" ;
      AV16W_CSV_FDEL = "" ;
      AV8W_LANG = "" ;
      AV22W_MOJI_CD = "" ;
      AV19W_FILE_PATH_FILE = "" ;
      AV13W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV14W_CSV_DATA = "" ;
      AV15W_CSV_DATA_ITEM = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20W_HANDLE ;
   private short Gx_err ;
   private int AV26GXV1 ;
   private int AV27GXV2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private boolean AV21W_INIT_FLG ;
   private String AV12P_SYS_ID ;
   private String AV11P_FILE_NAME ;
   private String AV18W_FILE_PATH ;
   private String AV23W_PARM_MSG ;
   private String AV17W_CSV_SDEL ;
   private String AV16W_CSV_FDEL ;
   private String AV8W_LANG ;
   private String AV22W_MOJI_CD ;
   private String AV19W_FILE_PATH_FILE ;
   private String AV14W_CSV_DATA ;
   private String AV15W_CSV_DATA_ITEM ;
   private String[] aP4 ;
   private String[] aP5 ;
   private GxObjectCollection AV10P_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT AV9P_A_LOGIN_SDT ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV13W_A812_SD01_CSV_OUTPUT_ITEM ;
}

