/*
               File: A812_PC03_CSV_OUTPUT_UTF8B
        Description: CSVファイル出力処理(BOM付UTF8)
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:50.28
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a812_pc03_csv_output_utf8b extends GXProcedure
{
   public a812_pc03_csv_output_utf8b( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a812_pc03_csv_output_utf8b.class ), "" );
   }

   public a812_pc03_csv_output_utf8b( int remoteHandle ,
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
      a812_pc03_csv_output_utf8b.this.AV8P_A_LOGIN_SDT = aP0;
      a812_pc03_csv_output_utf8b.this.AV11P_SYS_ID = aP1;
      a812_pc03_csv_output_utf8b.this.AV9P_A812_SD01_CSV_OUTPUT = aP2;
      a812_pc03_csv_output_utf8b.this.AV10P_FILE_NAME = aP3;
      a812_pc03_csv_output_utf8b.this.aP5 = new String[] {""};
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
      a812_pc03_csv_output_utf8b.this.AV8P_A_LOGIN_SDT = aP0;
      a812_pc03_csv_output_utf8b.this.AV11P_SYS_ID = aP1;
      a812_pc03_csv_output_utf8b.this.AV9P_A812_SD01_CSV_OUTPUT = aP2;
      a812_pc03_csv_output_utf8b.this.AV10P_FILE_NAME = aP3;
      a812_pc03_csv_output_utf8b.this.aP4 = aP4;
      a812_pc03_csv_output_utf8b.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23W_PARM_MSG = "" ;
      AV16W_CSV_SDEL = "\"" ;
      AV15W_CSV_FDEL = "," ;
      AV22W_MOJI_CD = "UTF-8" ;
      /* Execute user subroutine: S12134 */
      S12134 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_FILE_PATH_FILE = GXutil.trim( AV17W_FILE_PATH) + GXutil.trim( AV10P_FILE_NAME) ;
      AV19W_HANDLE = GXutil.deleteFile( AV18W_FILE_PATH_FILE) ;
      AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwopen( AV18W_FILE_PATH_FILE, "", "", (byte)(0), AV22W_MOJI_CD)) ;
      if ( AV19W_HANDLE != 0 )
      {
         AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         GXt_char1 = AV23W_PARM_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         a812_pc03_csv_output_utf8b.this.GXt_char1 = GXv_char2[0] ;
         AV23W_PARM_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* User Code */
       try {
      /* User Code */
       byte [] bb={ (byte)0xEF, (byte)0xBB, (byte)0xBF};
      /* User Code */
       AV24W_BOM=new String(bb,"UTF-8");
      /* User Code */
       } catch (java.io.UnsupportedEncodingException e) {
      /* User Code */
       }
      AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV24W_BOM, (short)(GXutil.byteCount( AV24W_BOM, AV22W_MOJI_CD)))) ;
      if ( AV19W_HANDLE != 0 )
      {
         AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         GXt_char1 = AV23W_PARM_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
         a812_pc03_csv_output_utf8b.this.GXt_char1 = GXv_char2[0] ;
         AV23W_PARM_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV27GXV1 = 1 ;
      while ( AV27GXV1 <= AV9P_A812_SD01_CSV_OUTPUT.size() )
      {
         AV12W_A812_SD01_CSV_OUTPUT_ITEM = (SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)((SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem)AV9P_A812_SD01_CSV_OUTPUT.elementAt(-1+AV27GXV1));
         AV13W_CSV_DATA = "" ;
         AV20W_INIT_FLG = false ;
         AV28GXV2 = 1 ;
         while ( AV28GXV2 <= AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().size() )
         {
            AV14W_CSV_DATA_ITEM = (String)AV12W_A812_SD01_CSV_OUTPUT_ITEM.getgxTv_SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem_Csv_data().elementAt(-1+AV28GXV2) ;
            if ( ! AV20W_INIT_FLG )
            {
               AV20W_INIT_FLG = true ;
            }
            else
            {
               AV13W_CSV_DATA = AV13W_CSV_DATA + AV15W_CSV_FDEL ;
            }
            AV13W_CSV_DATA = AV13W_CSV_DATA + AV16W_CSV_SDEL ;
            AV13W_CSV_DATA = AV13W_CSV_DATA + AV14W_CSV_DATA_ITEM ;
            AV13W_CSV_DATA = AV13W_CSV_DATA + AV16W_CSV_SDEL ;
            AV28GXV2 = (int)(AV28GXV2+1) ;
         }
         AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV13W_CSV_DATA, (short)(GXutil.byteCount( AV13W_CSV_DATA, AV22W_MOJI_CD)))) ;
         /* Execute user subroutine: S11120 */
         S11120 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwnext( )) ;
         /* Execute user subroutine: S11120 */
         S11120 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV27GXV1 = (int)(AV27GXV1+1) ;
      }
      AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
      cleanup();
   }

   public void S11120( )
   {
      /* 'SUB_CSV_ERROR_CHECK' Routine */
      if ( AV19W_HANDLE != 0 )
      {
         AV19W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         GXt_char1 = AV23W_PARM_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
         a812_pc03_csv_output_utf8b.this.GXt_char1 = GXv_char2[0] ;
         AV23W_PARM_MSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S12134( )
   {
      /* 'SUB_GET_CSV_SAVE_AREA' Routine */
      GXt_char1 = AV17W_FILE_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV8P_A_LOGIN_SDT, AV11P_SYS_ID, "CSV_DOWNLOAD_PATH", GXv_char2) ;
      a812_pc03_csv_output_utf8b.this.GXt_char1 = GXv_char2[0] ;
      AV17W_FILE_PATH = GXt_char1 ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = a812_pc03_csv_output_utf8b.this.AV17W_FILE_PATH;
      this.aP5[0] = a812_pc03_csv_output_utf8b.this.AV23W_PARM_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17W_FILE_PATH = "" ;
      AV23W_PARM_MSG = "" ;
      AV16W_CSV_SDEL = "" ;
      AV15W_CSV_FDEL = "" ;
      AV22W_MOJI_CD = "" ;
      AV18W_FILE_PATH_FILE = "" ;
      AV24W_BOM = "" ;
      AV12W_A812_SD01_CSV_OUTPUT_ITEM = new SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem(remoteHandle, context);
      AV13W_CSV_DATA = "" ;
      AV14W_CSV_DATA_ITEM = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19W_HANDLE ;
   private short Gx_err ;
   private int AV27GXV1 ;
   private int AV28GXV2 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private boolean AV20W_INIT_FLG ;
   private String AV11P_SYS_ID ;
   private String AV10P_FILE_NAME ;
   private String AV17W_FILE_PATH ;
   private String AV23W_PARM_MSG ;
   private String AV16W_CSV_SDEL ;
   private String AV15W_CSV_FDEL ;
   private String AV22W_MOJI_CD ;
   private String AV18W_FILE_PATH_FILE ;
   private String AV24W_BOM ;
   private String AV13W_CSV_DATA ;
   private String AV14W_CSV_DATA_ITEM ;
   private String[] aP4 ;
   private String[] aP5 ;
   private GxObjectCollection AV9P_A812_SD01_CSV_OUTPUT ;
   private SdtA_LOGIN_SDT AV8P_A_LOGIN_SDT ;
   private SdtA812_SD01_CSV_OUTPUT_A812_SD01_CSV_OUTPUTItem AV12W_A812_SD01_CSV_OUTPUT_ITEM ;
}

