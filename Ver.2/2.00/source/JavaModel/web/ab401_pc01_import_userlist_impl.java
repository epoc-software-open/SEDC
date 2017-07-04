/*
               File: ab401_pc01_import_userlist_impl
        Description: 臨床試験支援システムユーザー一覧取込（リクエスト実行）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:12.79
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab401_pc01_import_userlist_impl extends GXWebProcedure
{
   public ab401_pc01_import_userlist_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV10P_USER_ID = gxfirstwebparm ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV9P_PWD = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B401" ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", AV19Pgmdesc+","+AV15W_HTTP_REQ.getRemoteAddress()) ;
      if ( GxRegex.IsMatch(AV15W_HTTP_REQ.getRemoteAddress(),"^127(\\.\\d{1,3}){3}$") )
      {
         GXt_char1 = AV12W_PWD ;
         GXv_char2[0] = GXt_char1 ;
         new b801_pc01_md5(remoteHandle, context).execute( AV9P_PWD, GXv_char2) ;
         ab401_pc01_import_userlist_impl.this.GXt_char1 = GXv_char2[0] ;
         AV12W_PWD = GXt_char1 ;
         GXv_int3[0] = AV13W_RTN_CD ;
         GXv_char2[0] = AV14W_RTN_MSG ;
         new b603_pc01_import_usrelist(remoteHandle, context).execute( AV10P_USER_ID, AV12W_PWD, GXv_int3, GXv_char2) ;
         ab401_pc01_import_userlist_impl.this.AV13W_RTN_CD = GXv_int3[0] ;
         ab401_pc01_import_userlist_impl.this.AV14W_RTN_MSG = GXv_char2[0] ;
      }
      else
      {
         AV13W_RTN_CD = (short)(1) ;
         GXt_char1 = AV14W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00009", "", "", "", "", "", GXv_char2) ;
         ab401_pc01_import_userlist_impl.this.GXt_char1 = GXv_char2[0] ;
         AV14W_RTN_MSG = GXt_char1 ;
      }
      AV11W_MSG = "ResultCode:" + GXutil.trim( GXutil.str( AV13W_RTN_CD, 4, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV14W_RTN_MSG ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", AV11W_MSG) ;
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
      gxfirstwebparm = "" ;
      AV10P_USER_ID = "" ;
      AV9P_PWD = "" ;
      AV8C_APP_ID = "" ;
      AV18Pgmname = "" ;
      AV19Pgmdesc = "" ;
      AV15W_HTTP_REQ = httpContext.getHttpRequest();
      AV12W_PWD = "" ;
      GXv_int3 = new short [1] ;
      AV14W_RTN_MSG = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV11W_MSG = "" ;
      AV19Pgmdesc = "臨床試験支援システムユーザー一覧取込（リクエスト実行）" ;
      AV18Pgmname = "AB401_PC01_IMPORT_USERLIST" ;
      /* GeneXus formulas. */
      AV19Pgmdesc = "臨床試験支援システムユーザー一覧取込（リクエスト実行）" ;
      AV18Pgmname = "AB401_PC01_IMPORT_USERLIST" ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short AV13W_RTN_CD ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV18Pgmname ;
   private String AV19Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV8C_APP_ID ;
   private String AV12W_PWD ;
   private String AV14W_RTN_MSG ;
   private String AV11W_MSG ;
   private com.genexus.internet.HttpRequest AV15W_HTTP_REQ ;
}

