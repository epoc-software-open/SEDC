/*
               File: A836_PC01_SEND_MAIL
        Description: ÉÅÅ[ÉãëóêM
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:42.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a836_pc01_send_mail extends GXProcedure
{
   public a836_pc01_send_mail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a836_pc01_send_mail.class ), "" );
   }

   public a836_pc01_send_mail( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( com.genexus.internet.GXMailMessage[] aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a836_pc01_send_mail.this.AV9PI_MAIL_MESSAGE = aP0[0];
      this.aP0 = aP0;
      a836_pc01_send_mail.this.AV10PI_SOFUZUMI_FLG = aP1;
      a836_pc01_send_mail.this.aP2 = aP2;
      a836_pc01_send_mail.this.aP3 = aP3;
      a836_pc01_send_mail.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( com.genexus.internet.GXMailMessage[] aP0 ,
                        String aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( com.genexus.internet.GXMailMessage[] aP0 ,
                             String aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      a836_pc01_send_mail.this.AV9PI_MAIL_MESSAGE = aP0[0];
      this.aP0 = aP0;
      a836_pc01_send_mail.this.AV10PI_SOFUZUMI_FLG = aP1;
      a836_pc01_send_mail.this.aP2 = aP2;
      a836_pc01_send_mail.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM020_APP_ID = "A836" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV10PI_SOFUZUMI_FLG, "0") == 0 )
      {
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "906", GXv_char2) ;
         a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
         AV9PI_MAIL_MESSAGE.getFrom().setAddress( GXt_char1 );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "907", GXv_char2) ;
         a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
         AV9PI_MAIL_MESSAGE.getFrom().setName( GXt_char1 );
      }
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "900", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV14W_SMTP.setHost( GXt_char1 );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "901", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV14W_SMTP.setPort( (int)(GXutil.lval( GXt_char1)) );
      AV14W_SMTP.getSender().setAddress( AV9PI_MAIL_MESSAGE.getFrom().getAddress() );
      AV14W_SMTP.getSender().setName( AV9PI_MAIL_MESSAGE.getFrom().getName() );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "902", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV14W_SMTP.setAuthentication( (short)(GXutil.lval( GXt_char1)) );
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "903", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV14W_SMTP.setUserName( GXt_char1 );
      GXt_char1 = AV15W_AUTH_PWD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "904", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV15W_AUTH_PWD = GXt_char1 ;
      GXt_char1 = AV16W_AUTH_EKEY ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "905", GXv_char2) ;
      a836_pc01_send_mail.this.GXt_char1 = GXv_char2[0] ;
      AV16W_AUTH_EKEY = GXt_char1 ;
      if ( ! (GXutil.strcmp("", AV15W_AUTH_PWD)==0) && ! (GXutil.strcmp("", AV16W_AUTH_EKEY)==0) )
      {
         AV14W_SMTP.setPassword( com.genexus.util.Encryption.decrypt64( AV15W_AUTH_PWD, AV16W_AUTH_EKEY) );
      }
      else
      {
         AV14W_SMTP.setPassword( AV15W_AUTH_PWD );
      }
      AV14W_SMTP.login();
      if ( AV14W_SMTP.getErrCode() != 0 )
      {
         AV11PO_ERRCD = "1" ;
         AV12PO_ERRMSG = AV14W_SMTP.getErrDescription() ;
      }
      if ( GXutil.strcmp(AV11PO_ERRCD, "0") == 0 )
      {
         AV14W_SMTP.send(AV9PI_MAIL_MESSAGE);
         if ( AV14W_SMTP.getErrCode() != 0 )
         {
            AV11PO_ERRCD = "1" ;
            AV12PO_ERRMSG = AV14W_SMTP.getErrDescription() ;
         }
         if ( GXutil.strcmp(AV11PO_ERRCD, "0") == 0 )
         {
            AV14W_SMTP.logout();
            if ( AV14W_SMTP.getErrCode() != 0 )
            {
               AV11PO_ERRCD = "1" ;
               AV12PO_ERRMSG = AV14W_SMTP.getErrDescription() ;
            }
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV11PO_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      a836_pc01_send_mail.this.AV11PO_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV11PO_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP0[0] = a836_pc01_send_mail.this.AV9PI_MAIL_MESSAGE;
      this.aP2[0] = a836_pc01_send_mail.this.AV11PO_ERRCD;
      this.aP3[0] = a836_pc01_send_mail.this.AV12PO_ERRMSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   /* Error handler code */
   public void handleError( )
   {
      if ( context.globals.getErr( ) != 0 )
      {
         Gx_err = context.globals.getErr( ) ;
         Gx_emsg = context.globals.getErrMsg( ) ;
         switch ( GXActiveErrHndl )
         {
               case 1 :
                  /* Execute user subroutine: S121 */
                  S121 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV11PO_ERRCD = "" ;
      AV12PO_ERRMSG = "" ;
      AV8C_TAM020_APP_ID = "" ;
      AV14W_SMTP = new com.genexus.internet.GXSMTPSession();
      AV15W_AUTH_PWD = "" ;
      AV16W_AUTH_EKEY = "" ;
      GXt_char1 = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV19Pgmname = "" ;
      Gx_emsg = "" ;
      AV19Pgmname = "A836_PC01_SEND_MAIL" ;
      /* GeneXus formulas. */
      AV19Pgmname = "A836_PC01_SEND_MAIL" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV19Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10PI_SOFUZUMI_FLG ;
   private String AV11PO_ERRCD ;
   private String AV12PO_ERRMSG ;
   private String AV8C_TAM020_APP_ID ;
   private String AV15W_AUTH_PWD ;
   private String AV16W_AUTH_EKEY ;
   private com.genexus.internet.GXSMTPSession AV14W_SMTP ;
   private com.genexus.internet.GXMailMessage[] aP0 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private com.genexus.internet.GXMailMessage AV9PI_MAIL_MESSAGE ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

