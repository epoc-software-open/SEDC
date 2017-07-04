/*
               File: A804_PC01_SYSLOG
        Description: システムログ出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:42.50
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a804_pc01_syslog extends GXProcedure
{
   public a804_pc01_syslog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a804_pc01_syslog.class ), "" );
   }

   public a804_pc01_syslog( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      a804_pc01_syslog.this.AV11P_PG_ID = aP0;
      a804_pc01_syslog.this.AV9P_LOGKBN = aP1;
      a804_pc01_syslog.this.AV10P_LOGTEXT = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19W_PATH = "" ;
      AV14W_FILE = "" ;
      AV15W_FILE_PATH = "" ;
      /* User Code */
      	AV17W_LANG = "JAVA";
      if ( GXutil.strcmp(AV17W_LANG, "JAVA") == 0 )
      {
         AV18W_MOJI_CD = "MS932" ;
      }
      else
      {
         AV18W_MOJI_CD = "Shift-JIS" ;
      }
      if ( ! (GXutil.strcmp("", AV21W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV8W_A_LOGIN_SDT.fromxml(AV21W_SESSION.getValue("Com_Login_Info"), "");
      }
      GXt_char1 = AV19W_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV8W_A_LOGIN_SDT, AV12P_SYS_ID, "LOGFILE_PATH", GXv_char2) ;
      a804_pc01_syslog.this.GXt_char1 = GXv_char2[0] ;
      AV19W_PATH = GXt_char1 ;
      GXt_char1 = AV14W_FILE ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV8W_A_LOGIN_SDT, AV12P_SYS_ID, "LOGFILE_NAME", GXv_char2) ;
      a804_pc01_syslog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_FILE = GXt_char1 ;
      if ( ! (GXutil.strcmp("", AV19W_PATH)==0) && ! (GXutil.strcmp("", AV14W_FILE)==0) )
      {
         GXt_char1 = AV15W_FILE_PATH ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc01_date_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDD", GXv_char2) ;
         a804_pc01_syslog.this.GXt_char1 = GXv_char2[0] ;
         AV15W_FILE_PATH = GXutil.trim( AV19W_PATH) + GXt_char1 + GXutil.trim( AV14W_FILE) ;
      }
      if ( ! (GXutil.strcmp("", AV15W_FILE_PATH)==0) )
      {
         AV13W_DIRECTORY.setSource( AV19W_PATH );
         if ( AV13W_DIRECTORY.exists() )
         {
            AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwopen( AV15W_FILE_PATH, "", "", (byte)(1), AV18W_MOJI_CD)) ;
            AV20W_REC = AV21W_SESSION.getId() ;
            GXt_char1 = AV20W_REC ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc01_date_edit(remoteHandle, context).execute( GXutil.today( ), "YYYY/MM/DD", GXv_char2) ;
            a804_pc01_syslog.this.GXt_char1 = GXv_char2[0] ;
            GXt_char3 = AV20W_REC ;
            GXv_char4[0] = GXt_char3 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "HH:MI:SS", GXv_char4) ;
            a804_pc01_syslog.this.GXt_char3 = GXv_char4[0] ;
            AV20W_REC = AV20W_REC + "," + GXt_char1 + "," + GXt_char3 + "," + AV8W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + "," + AV11P_PG_ID + "," + AV9P_LOGKBN + "," + AV10P_LOGTEXT ;
            AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwptxt( AV20W_REC, (short)(GXutil.byteCount( AV20W_REC, AV18W_MOJI_CD)))) ;
            AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwnext( )) ;
            AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfwclose( )) ;
         }
      }
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
      AV19W_PATH = "" ;
      AV14W_FILE = "" ;
      AV15W_FILE_PATH = "" ;
      AV17W_LANG = "" ;
      AV18W_MOJI_CD = "" ;
      AV21W_SESSION = httpContext.getWebSession();
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV12P_SYS_ID = "" ;
      AV13W_DIRECTORY = new com.genexus.util.GXDirectory();
      AV20W_REC = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16W_HANDLE ;
   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV11P_PG_ID ;
   private String AV9P_LOGKBN ;
   private String AV10P_LOGTEXT ;
   private String AV19W_PATH ;
   private String AV14W_FILE ;
   private String AV15W_FILE_PATH ;
   private String AV17W_LANG ;
   private String AV18W_MOJI_CD ;
   private String AV12P_SYS_ID ;
   private String AV20W_REC ;
   private com.genexus.webpanels.WebSession AV21W_SESSION ;
   private com.genexus.util.GXDirectory AV13W_DIRECTORY ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
}

