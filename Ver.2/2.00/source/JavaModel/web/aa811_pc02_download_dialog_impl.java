/*
               File: aa811_pc02_download_dialog_impl
        Description: ダウンロードダイアログ表示処理（実ファイル名指定）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:32.61
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa811_pc02_download_dialog_impl extends GXWebProcedure
{
   public aa811_pc02_download_dialog_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      if ( GxWebError == 0 )
      {
         GXDecQS = com.genexus.util.Encryption.uridecrypt64( httpContext.getQueryString( ), GXKey) ;
         if ( ( GXutil.strcmp(GXutil.right( GXDecQS, 6), com.genexus.util.Encryption.checksum( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), 6)) == 0 ) && ( GXutil.strcmp(GXutil.substring( GXDecQS, 1, GXutil.len( "aa811_pc02_download_dialog")), "aa811_pc02_download_dialog") == 0 ) )
         {
            httpContext.setQueryString( GXutil.right( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6), GXutil.len( GXutil.left( GXDecQS, GXutil.len( GXDecQS)-6))-GXutil.len( "aa811_pc02_download_dialog"))) ;
         }
         else
         {
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
         }
      }
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV9P_FILE_PATH = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV8P_FILE_NAME = httpContext.GetNextPar( ) ;
            AV12P_IMPORT_FILE_NAME = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_FILE_PATH_FILE = GXutil.trim( AV9P_FILE_PATH) + GXutil.trim( AV8P_FILE_NAME) ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV11W_HRESPONSE.addHeader("Content-Type", "application/download");
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV11W_HRESPONSE.addHeader("Content-Disposition", "attachment;filename="+AV12P_IMPORT_FILE_NAME);
      }
      AV11W_HRESPONSE.addFile(AV10W_FILE_PATH_FILE);
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXKey = "" ;
      GXDecQS = "" ;
      gxfirstwebparm = "" ;
      AV9P_FILE_PATH = "" ;
      AV8P_FILE_NAME = "" ;
      AV12P_IMPORT_FILE_NAME = "" ;
      AV10W_FILE_PATH_FILE = "" ;
      AV11W_HRESPONSE = httpContext.getHttpResponse();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte GxWebError ;
   private short Gx_err ;
   private String GXKey ;
   private String GXDecQS ;
   private String gxfirstwebparm ;
   private boolean entryPointCalled ;
   private String AV9P_FILE_PATH ;
   private String AV8P_FILE_NAME ;
   private String AV12P_IMPORT_FILE_NAME ;
   private String AV10W_FILE_PATH_FILE ;
   private com.genexus.internet.HttpResponse AV11W_HRESPONSE ;
}

