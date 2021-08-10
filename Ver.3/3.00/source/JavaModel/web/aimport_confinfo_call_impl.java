/*
               File: aimport_confinfo_call_impl
        Description: 患者・適格性確認情報取込呼出し（NetCommons連携）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:27.42
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aimport_confinfo_call_impl extends GXWebProcedure
{
   public aimport_confinfo_call_impl( com.genexus.internet.HttpContext context )
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
         AV12P_GET_PARM = gxfirstwebparm ;
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "INFO", "連携処理起動") ;
      AV15W_USER_ID = "" ;
      AV16W_PWD = "" ;
      AV17W_STUDY_ID = 0 ;
      AV11W_MSG = "" ;
      AV18W_ERR_FLG = false ;
      AV14W_PARM = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV12P_GET_PARM,"[&]")) ;
      if ( AV14W_PARM.size() == 3 )
      {
         if ( GXutil.strSearch( (String)AV14W_PARM.elementAt(-1+1), "loginid=", 1) == 1 )
         {
            AV19W_LEN = (long)(GXutil.len( (String)AV14W_PARM.elementAt(-1+1))-8) ;
            AV15W_USER_ID = GXutil.substring( (String)AV14W_PARM.elementAt(-1+1), 9, (int)(AV19W_LEN)) ;
            AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Error_message( AV15W_USER_ID );
         }
         if ( GXutil.strSearch( (String)AV14W_PARM.elementAt(-1+2), "password=", 1) == 1 )
         {
            AV19W_LEN = (long)(GXutil.len( (String)AV14W_PARM.elementAt(-1+2))-9) ;
            AV16W_PWD = GXutil.substring( (String)AV14W_PARM.elementAt(-1+2), 10, (int)(AV19W_LEN)) ;
            AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Error_message( AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().getgxTv_Sdtimport_confinfo_result_code_Error_message()+":"+AV16W_PWD );
         }
         if ( GXutil.strSearch( (String)AV14W_PARM.elementAt(-1+3), "studyid=", 1) == 1 )
         {
            AV19W_LEN = (long)(GXutil.len( (String)AV14W_PARM.elementAt(-1+3))-8) ;
            AV17W_STUDY_ID = GXutil.lval( GXutil.substring( (String)AV14W_PARM.elementAt(-1+3), 9, (int)(AV19W_LEN))) ;
            AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Error_message( AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().getgxTv_Sdtimport_confinfo_result_code_Error_message()+":"+GXutil.trim( GXutil.str( AV17W_STUDY_ID, 10, 0)) );
         }
         if ( (GXutil.strcmp("", AV15W_USER_ID)==0) || (GXutil.strcmp("", AV16W_PWD)==0) || (0==AV17W_STUDY_ID) )
         {
            AV18W_ERR_FLG = true ;
         }
      }
      else
      {
         AV18W_ERR_FLG = true ;
      }
      if ( AV18W_ERR_FLG )
      {
         GXt_char1 = AV11W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00002", "パラメータの指定", "", "", "", "", GXv_char2) ;
         aimport_confinfo_call_impl.this.GXt_char1 = GXv_char2[0] ;
         AV11W_MSG = GXt_char1 ;
      }
      if ( ! AV18W_ERR_FLG )
      {
         GXv_char2[0] = AV11W_MSG ;
         new b403_pc02_import(remoteHandle, context).execute( AV15W_USER_ID, AV16W_PWD, AV17W_STUDY_ID, GXv_char2) ;
         aimport_confinfo_call_impl.this.AV11W_MSG = GXv_char2[0] ;
      }
      if ( (GXutil.strcmp("", AV11W_MSG)==0) )
      {
         AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Code( "1" );
         AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Error_message( "" );
      }
      else
      {
         AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Code( "0" );
         AV8import_confinfo.getgxTv_Sdtimport_confinfo_Result_code().setgxTv_Sdtimport_confinfo_result_code_Error_message( AV11W_MSG );
      }
      AV13W_RTN_MSG = AV8import_confinfo.toxml(false, true, "import_confinfo", "tablet-EDC_GXXEV3U3") ;
      AV13W_RTN_MSG = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + AV13W_RTN_MSG ;
      AV10HTTP_RESPONSE.addString(AV13W_RTN_MSG);
      if ( (GXutil.strcmp("", AV11W_MSG)==0) )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "INFO", "連携処理終了") ;
      }
      else
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", AV11W_MSG) ;
      }
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
      AV12P_GET_PARM = "" ;
      AV22Pgmname = "" ;
      AV15W_USER_ID = "" ;
      AV16W_PWD = "" ;
      AV11W_MSG = "" ;
      AV14W_PARM = new GxObjectCollection(String.class, "internal", "");
      AV8import_confinfo = new Sdtimport_confinfo(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV13W_RTN_MSG = "" ;
      AV10HTTP_RESPONSE = httpContext.getHttpResponse();
      AV22Pgmname = "AIMPORT_CONFINFO_CALL" ;
      /* GeneXus formulas. */
      AV22Pgmname = "AIMPORT_CONFINFO_CALL" ;
      Gx_err = (short)(0) ;
   }

   private short gxcookieaux ;
   private short Gx_err ;
   private long AV17W_STUDY_ID ;
   private long AV19W_LEN ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean entryPointCalled ;
   private boolean AV18W_ERR_FLG ;
   private String AV12P_GET_PARM ;
   private String AV15W_USER_ID ;
   private String AV16W_PWD ;
   private String AV11W_MSG ;
   private String AV13W_RTN_MSG ;
   private com.genexus.internet.HttpResponse AV10HTTP_RESPONSE ;
   private GxObjectCollection AV14W_PARM ;
   private Sdtimport_confinfo AV8import_confinfo ;
}

