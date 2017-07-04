/*
               File: B808_PC01_DBG_LOG
        Description: デバッグログ出力
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:0.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b808_pc01_dbg_log extends GXProcedure
{
   public b808_pc01_dbg_log( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b808_pc01_dbg_log.class ), "" );
   }

   public b808_pc01_dbg_log( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             short aP1 ,
                             String aP2 ,
                             SdtB808_SD01_EXTRA_INFO[] aP3 ,
                             short[] aP4 )
   {
      b808_pc01_dbg_log.this.AV10P_Pgmname = aP0;
      b808_pc01_dbg_log.this.AV27P_ERR_LV = aP1;
      b808_pc01_dbg_log.this.AV8P_ERR_MSG = aP2;
      b808_pc01_dbg_log.this.AV9P_EXTRA_INFO = aP3[0];
      b808_pc01_dbg_log.this.AV23W_RTN_CD = aP4[0];
      b808_pc01_dbg_log.this.AV24W_RTN_MSG = aP5[0];
      b808_pc01_dbg_log.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        short aP1 ,
                        String aP2 ,
                        SdtB808_SD01_EXTRA_INFO[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             short aP1 ,
                             String aP2 ,
                             SdtB808_SD01_EXTRA_INFO[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b808_pc01_dbg_log.this.AV10P_Pgmname = aP0;
      b808_pc01_dbg_log.this.AV27P_ERR_LV = aP1;
      b808_pc01_dbg_log.this.AV8P_ERR_MSG = aP2;
      b808_pc01_dbg_log.this.AV9P_EXTRA_INFO = aP3[0];
      this.aP3 = aP3;
      b808_pc01_dbg_log.this.AV23W_RTN_CD = aP4[0];
      this.aP4 = aP4;
      b808_pc01_dbg_log.this.AV24W_RTN_MSG = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21W_OUTPUT_PATH = "" ;
      AV20W_OUTPUT_FILE = "" ;
      AV19W_OUTPUT_DIR = "" ;
      GXt_char1 = AV18W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(0), GXv_char2) ;
      b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
      AV18W_NEWLINE = GXt_char1 ;
      AV16W_INDENT = GXutil.chr( (short)(9)) ;
      AV31W_ERR_CD = (short)(0) ;
      /* User Code */
      	AV17W_LANG = "JAVA";
      if ( GXutil.strcmp(AV17W_LANG, "JAVA") == 0 )
      {
         AV12W_CHARSET = "MS932" ;
      }
      else
      {
         AV12W_CHARSET = "Shift-JIS" ;
      }
      if ( ! (GXutil.strcmp("", AV25W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV11W_A_LOGIN_SDT.fromxml(AV25W_SESSION.getValue("Com_Login_Info"), "");
      }
      GXt_char1 = AV29W_DEBUG ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV11W_A_LOGIN_SDT, "", "DEBUG", GXv_char2) ;
      b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
      AV29W_DEBUG = GXt_char1 ;
      AV30W_DBG_LV = (short)((GxRegex.IsMatch(AV29W_DEBUG,"^\\d$") ? GXutil.val( AV29W_DEBUG, ".") : 0)) ;
      if ( AV30W_DBG_LV < AV27P_ERR_LV )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = AV19W_OUTPUT_DIR ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV11W_A_LOGIN_SDT, "", "ERRLOGFILE_PATH", GXv_char2) ;
      b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
      AV19W_OUTPUT_DIR = GXt_char1 ;
      GXt_char1 = AV20W_OUTPUT_FILE ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV11W_A_LOGIN_SDT, "", "ERRLOGFILE_NAME", GXv_char2) ;
      b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
      AV20W_OUTPUT_FILE = GXt_char1 ;
      if ( ! (GXutil.strcmp("", AV19W_OUTPUT_DIR)==0) && ! (GXutil.strcmp("", AV20W_OUTPUT_FILE)==0) )
      {
         GXt_char1 = AV20W_OUTPUT_FILE ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc01_date_edit(remoteHandle, context).execute( GXutil.today( ), "YYYYMMDD", GXv_char2) ;
         b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
         AV20W_OUTPUT_FILE = GXt_char1 + GXutil.trim( AV20W_OUTPUT_FILE) ;
         AV21W_OUTPUT_PATH = GXutil.trim( AV19W_OUTPUT_DIR) + GXutil.trim( AV20W_OUTPUT_FILE) ;
      }
      if ( ! (GXutil.strcmp("", AV21W_OUTPUT_PATH)==0) )
      {
         AV14W_DIRECTORY.setSource( AV19W_OUTPUT_DIR );
         if ( AV14W_DIRECTORY.exists() )
         {
            /* Execute user subroutine: S1173 */
            S1173 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
      }
      if ( AV27P_ERR_LV == 0 )
      {
         AV23W_RTN_CD = (short)(9) ;
         GXt_char1 = AV24W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
         b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
         AV24W_RTN_MSG = GXt_char1 ;
      }
      cleanup();
   }

   public void S1173( )
   {
      /* 'SUB_OUTPUT_LOG' Routine */
      AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwopen( AV21W_OUTPUT_PATH, "", "", (byte)(1), AV12W_CHARSET)) ;
      if ( AV15W_HANDLE == 0 )
      {
         AV28W_ERR_DIV = gxdomainct_err_lv.getDescription((short)AV27P_ERR_LV) ;
         if ( (GXutil.strcmp("", AV28W_ERR_DIV)==0) )
         {
            AV28W_ERR_DIV = "UNKNOWN" ;
         }
         GXt_char1 = AV22W_REC ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
         AV22W_REC = AV25W_SESSION.getId() + GXutil.chr( (short)(9)) + GXt_char1 + GXutil.chr( (short)(9)) + AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + GXutil.chr( (short)(9)) + AV10P_Pgmname + GXutil.chr( (short)(9)) + AV28W_ERR_DIV + GXutil.chr( (short)(9)) + AV8P_ERR_MSG ;
         AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV22W_REC, (short)(GXutil.byteCount( AV22W_REC, AV12W_CHARSET)))) ;
         AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwnext( )) ;
      }
      if ( AV15W_HANDLE == 0 )
      {
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV9P_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().size() )
         {
            AV26W_STR = ((SdtB808_SD01_EXTRA_INFO_PARMSItem)AV9P_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value() ;
            GXt_char1 = AV26W_STR ;
            GXv_char2[0] = GXt_char1 ;
            new b802_pc01_new_line(remoteHandle, context).execute( (byte)(3), GXv_char2) ;
            b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
            GXt_char3 = AV26W_STR ;
            GXv_char4[0] = GXt_char3 ;
            new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char4) ;
            b808_pc01_dbg_log.this.GXt_char3 = GXv_char4[0] ;
            AV26W_STR = GXutil.strReplace( AV26W_STR, GXt_char1, GXt_char3) ;
            GXt_char3 = AV26W_STR ;
            GXv_char4[0] = GXt_char3 ;
            new b802_pc01_new_line(remoteHandle, context).execute( (byte)(2), GXv_char4) ;
            b808_pc01_dbg_log.this.GXt_char3 = GXv_char4[0] ;
            GXt_char1 = AV26W_STR ;
            GXv_char2[0] = GXt_char1 ;
            new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char2) ;
            b808_pc01_dbg_log.this.GXt_char1 = GXv_char2[0] ;
            AV26W_STR = GXutil.strReplace( AV26W_STR, GXt_char3, GXt_char1) ;
            GXt_char3 = AV26W_STR ;
            GXv_char4[0] = GXt_char3 ;
            new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char4) ;
            b808_pc01_dbg_log.this.GXt_char3 = GXv_char4[0] ;
            AV26W_STR = GXutil.strReplace( AV26W_STR, GXt_char3, AV18W_NEWLINE+AV16W_INDENT+AV16W_INDENT) ;
            AV22W_REC = AV16W_INDENT + ((SdtB808_SD01_EXTRA_INFO_PARMSItem)AV9P_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name() + AV18W_NEWLINE + AV16W_INDENT + AV16W_INDENT + AV26W_STR ;
            AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV22W_REC, (short)(GXutil.byteCount( AV22W_REC, AV12W_CHARSET)))) ;
            AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwnext( )) ;
            if ( AV15W_HANDLE != 0 )
            {
               if (true) break;
            }
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
         AV9P_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      }
      AV15W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b808_pc01_dbg_log.this.AV9P_EXTRA_INFO;
      this.aP4[0] = b808_pc01_dbg_log.this.AV23W_RTN_CD;
      this.aP5[0] = b808_pc01_dbg_log.this.AV24W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV21W_OUTPUT_PATH = "" ;
      AV20W_OUTPUT_FILE = "" ;
      AV19W_OUTPUT_DIR = "" ;
      AV18W_NEWLINE = "" ;
      AV16W_INDENT = "" ;
      AV17W_LANG = "" ;
      AV12W_CHARSET = "" ;
      AV25W_SESSION = httpContext.getWebSession();
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV29W_DEBUG = "" ;
      AV14W_DIRECTORY = new com.genexus.util.GXDirectory();
      AV28W_ERR_DIV = "" ;
      AV22W_REC = "" ;
      AV26W_STR = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char1 = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV15W_HANDLE ;
   private short AV27P_ERR_LV ;
   private short AV23W_RTN_CD ;
   private short AV31W_ERR_CD ;
   private short AV30W_DBG_LV ;
   private short Gx_err ;
   private long AV13W_CNT ;
   private String AV10P_Pgmname ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char1 ;
   private boolean returnInSub ;
   private String AV8P_ERR_MSG ;
   private String AV24W_RTN_MSG ;
   private String AV21W_OUTPUT_PATH ;
   private String AV20W_OUTPUT_FILE ;
   private String AV19W_OUTPUT_DIR ;
   private String AV18W_NEWLINE ;
   private String AV16W_INDENT ;
   private String AV17W_LANG ;
   private String AV12W_CHARSET ;
   private String AV29W_DEBUG ;
   private String AV28W_ERR_DIV ;
   private String AV22W_REC ;
   private String AV26W_STR ;
   private com.genexus.webpanels.WebSession AV25W_SESSION ;
   private com.genexus.util.GXDirectory AV14W_DIRECTORY ;
   private SdtB808_SD01_EXTRA_INFO[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private SdtB808_SD01_EXTRA_INFO AV9P_EXTRA_INFO ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
}

