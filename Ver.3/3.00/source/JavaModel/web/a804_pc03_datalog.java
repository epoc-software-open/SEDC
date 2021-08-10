/*
               File: A804_PC03_DATALOG
        Description: データ変更履歴ログ出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:12.43
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a804_pc03_datalog extends GXProcedure
{
   public a804_pc03_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a804_pc03_datalog.class ), "" );
   }

   public a804_pc03_datalog( int remoteHandle ,
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
      a804_pc03_datalog.this.AV11P_PG_ID = aP0;
      a804_pc03_datalog.this.AV9P_LOGKBN = aP1;
      a804_pc03_datalog.this.AV10P_LOGTEXT = aP2;
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
      AV18W_MOJI_CD = "MS932" ;
      if ( ! (GXutil.strcmp("", AV21W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV8W_A_LOGIN_SDT.fromxml(AV21W_SESSION.getValue("Com_Login_Info"), "");
      }
      GXt_char1 = AV19W_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV8W_A_LOGIN_SDT, AV12P_SYS_ID, "DATALOGFILE_PATH", GXv_char2) ;
      a804_pc03_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV19W_PATH = GXt_char1 ;
      GXt_char1 = AV14W_FILE ;
      GXv_char2[0] = GXt_char1 ;
      new a801_pc02_sys_config_get(remoteHandle, context).execute( AV8W_A_LOGIN_SDT, AV12P_SYS_ID, "DATALOGFILE_NAME", GXv_char2) ;
      a804_pc03_datalog.this.GXt_char1 = GXv_char2[0] ;
      AV14W_FILE = GXt_char1 ;
      if ( ! (GXutil.strcmp("", AV19W_PATH)==0) && ! (GXutil.strcmp("", AV14W_FILE)==0) )
      {
         GXt_char1 = AV15W_FILE_PATH ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc01_date_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDD", GXv_char2) ;
         a804_pc03_datalog.this.GXt_char1 = GXv_char2[0] ;
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
            a804_pc03_datalog.this.GXt_char1 = GXv_char2[0] ;
            GXt_char3 = AV20W_REC ;
            GXv_char4[0] = GXt_char3 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "HH:MI:SS", GXv_char4) ;
            a804_pc03_datalog.this.GXt_char3 = GXv_char4[0] ;
            AV20W_REC = AV20W_REC + GXutil.chr( (short)(9)) + GXt_char1 + GXutil.chr( (short)(9)) + GXt_char3 + GXutil.chr( (short)(9)) + AV8W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() + GXutil.chr( (short)(9)) + AV11P_PG_ID + GXutil.chr( (short)(9)) + AV9P_LOGKBN + GXutil.chr( (short)(9)) + AV10P_LOGTEXT ;
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
   private String AV18W_MOJI_CD ;
   private String AV12P_SYS_ID ;
   private String AV20W_REC ;
   private com.genexus.webpanels.WebSession AV21W_SESSION ;
   private com.genexus.util.GXDirectory AV13W_DIRECTORY ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
}

