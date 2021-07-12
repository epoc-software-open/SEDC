/*
               File: A207_PC02_USER_SEND_MAIL
        Description: ユーザー登録メール送信
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:47.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a207_pc02_user_send_mail extends GXProcedure
{
   public a207_pc02_user_send_mail( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a207_pc02_user_send_mail.class ), "" );
   }

   public a207_pc02_user_send_mail( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtTAM07_USER aP0 ,
                             String[] aP1 )
   {
      a207_pc02_user_send_mail.this.AV8P_BC_USER_MST = aP0;
      a207_pc02_user_send_mail.this.aP1 = aP1;
      a207_pc02_user_send_mail.this.aP2 = aP2;
      a207_pc02_user_send_mail.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( SdtTAM07_USER aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtTAM07_USER aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      a207_pc02_user_send_mail.this.AV8P_BC_USER_MST = aP0;
      a207_pc02_user_send_mail.this.aP1 = aP1;
      a207_pc02_user_send_mail.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14C_TAM020_APP_ID = "A207" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_MAIL_MESSAGE.clear();
      AV12W_MAIL_RECIPIENT.setName( AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_nm() );
      AV12W_MAIL_RECIPIENT.setAddress( AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_email() );
      AV11W_MAIL_MESSAGE.getTo().add(AV12W_MAIL_RECIPIENT) ;
      AV11W_MAIL_MESSAGE.setText( "" );
      /* Using cursor P007A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A351TBM01_DEL_FLG = P007A2_A351TBM01_DEL_FLG[0] ;
         n351TBM01_DEL_FLG = P007A2_n351TBM01_DEL_FLG[0] ;
         A58TBM01_SYS_ID = P007A2_A58TBM01_SYS_ID[0] ;
         A609TBM01_NOTE = P007A2_A609TBM01_NOTE[0] ;
         n609TBM01_NOTE = P007A2_n609TBM01_NOTE[0] ;
         if ( GXutil.strcmp(A58TBM01_SYS_ID, "908") == 0 )
         {
            AV11W_MAIL_MESSAGE.setSubject( A609TBM01_NOTE );
         }
         else if ( GXutil.strcmp(A58TBM01_SYS_ID, "909") == 0 )
         {
            AV11W_MAIL_MESSAGE.setText( A609TBM01_NOTE );
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV16W_TAM08_SITE_NM = "" ;
      /* Using cursor P007A3 */
      pr_default.execute(1, new Object[] {AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_site_id()});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A325TAM08_DEL_FLG = P007A3_A325TAM08_DEL_FLG[0] ;
         n325TAM08_DEL_FLG = P007A3_n325TAM08_DEL_FLG[0] ;
         A57TAM08_SITE_ID = P007A3_A57TAM08_SITE_ID[0] ;
         A319TAM08_SITE_NM = P007A3_A319TAM08_SITE_NM[0] ;
         n319TAM08_SITE_NM = P007A3_n319TAM08_SITE_NM[0] ;
         AV16W_TAM08_SITE_NM = A319TAM08_SITE_NM ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV15W_TAM04_AUTH_NM = "" ;
      /* Using cursor P007A4 */
      pr_default.execute(2, new Object[] {AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_auth_cd()});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A215TAM04_DEL_FLG = P007A4_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P007A4_n215TAM04_DEL_FLG[0] ;
         A13TAM04_AUTH_CD = P007A4_A13TAM04_AUTH_CD[0] ;
         A285TAM04_AUTH_NM = P007A4_A285TAM04_AUTH_NM[0] ;
         n285TAM04_AUTH_NM = P007A4_n285TAM04_AUTH_NM[0] ;
         AV15W_TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         if ( GXutil.strcmp(AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_admin_auth_flg(), "1") == 0 )
         {
            AV15W_TAM04_AUTH_NM = AV15W_TAM04_AUTH_NM + "(全ての試験に権限を付与する)" ;
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[USER_ID]", AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_id()) );
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[USER_NM]", AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_nm()) );
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[USER_KANA_NM]", AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm()) );
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[SITE_NM]", AV16W_TAM08_SITE_NM) );
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[KNGN_PTN]", AV15W_TAM04_AUTH_NM) );
      AV11W_MAIL_MESSAGE.setText( GXutil.strReplace( AV11W_MAIL_MESSAGE.getText(), "[BIKO]", AV8P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_note()) );
      GXv_mailmessage1[0] = AV11W_MAIL_MESSAGE ;
      GXv_char2[0] = AV9PO_ERRCD ;
      GXv_char3[0] = AV10PO_ERRMSG ;
      new a836_pc01_send_mail(remoteHandle, context).execute( GXv_mailmessage1, "0", GXv_char2, GXv_char3) ;
      AV11W_MAIL_MESSAGE = GXv_mailmessage1[0] ;
      a207_pc02_user_send_mail.this.AV9PO_ERRCD = GXv_char2[0] ;
      a207_pc02_user_send_mail.this.AV10PO_ERRMSG = GXv_char3[0] ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV13W_A_LOGIN_SDT;
      GXv_char3[0] = AV9PO_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      a207_pc02_user_send_mail.this.AV9PO_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV9PO_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = a207_pc02_user_send_mail.this.AV9PO_ERRCD;
      this.aP2[0] = a207_pc02_user_send_mail.this.AV10PO_ERRMSG;
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
      AV9PO_ERRCD = "" ;
      AV10PO_ERRMSG = "" ;
      AV14C_TAM020_APP_ID = "" ;
      AV11W_MAIL_MESSAGE = new com.genexus.internet.GXMailMessage();
      AV12W_MAIL_RECIPIENT = new com.genexus.internet.MailRecipient();
      scmdbuf = "" ;
      P007A2_A351TBM01_DEL_FLG = new String[] {""} ;
      P007A2_n351TBM01_DEL_FLG = new boolean[] {false} ;
      P007A2_A58TBM01_SYS_ID = new String[] {""} ;
      P007A2_A609TBM01_NOTE = new String[] {""} ;
      P007A2_n609TBM01_NOTE = new boolean[] {false} ;
      A351TBM01_DEL_FLG = "" ;
      A58TBM01_SYS_ID = "" ;
      A609TBM01_NOTE = "" ;
      AV16W_TAM08_SITE_NM = "" ;
      P007A3_A325TAM08_DEL_FLG = new String[] {""} ;
      P007A3_n325TAM08_DEL_FLG = new boolean[] {false} ;
      P007A3_A57TAM08_SITE_ID = new String[] {""} ;
      P007A3_A319TAM08_SITE_NM = new String[] {""} ;
      P007A3_n319TAM08_SITE_NM = new boolean[] {false} ;
      A325TAM08_DEL_FLG = "" ;
      A57TAM08_SITE_ID = "" ;
      A319TAM08_SITE_NM = "" ;
      AV15W_TAM04_AUTH_NM = "" ;
      P007A4_A215TAM04_DEL_FLG = new String[] {""} ;
      P007A4_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P007A4_A13TAM04_AUTH_CD = new String[] {""} ;
      P007A4_A285TAM04_AUTH_NM = new String[] {""} ;
      P007A4_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A215TAM04_DEL_FLG = "" ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      GXv_mailmessage1 = new com.genexus.internet.GXMailMessage [1] ;
      GXv_char2 = new String [1] ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV22Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a207_pc02_user_send_mail__default(),
         new Object[] {
             new Object[] {
            P007A2_A351TBM01_DEL_FLG, P007A2_n351TBM01_DEL_FLG, P007A2_A58TBM01_SYS_ID, P007A2_A609TBM01_NOTE, P007A2_n609TBM01_NOTE
            }
            , new Object[] {
            P007A3_A325TAM08_DEL_FLG, P007A3_n325TAM08_DEL_FLG, P007A3_A57TAM08_SITE_ID, P007A3_A319TAM08_SITE_NM, P007A3_n319TAM08_SITE_NM
            }
            , new Object[] {
            P007A4_A215TAM04_DEL_FLG, P007A4_n215TAM04_DEL_FLG, P007A4_A13TAM04_AUTH_CD, P007A4_A285TAM04_AUTH_NM, P007A4_n285TAM04_AUTH_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "A207_PC02_USER_SEND_MAIL" ;
      /* GeneXus formulas. */
      AV22Pgmname = "A207_PC02_USER_SEND_MAIL" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV22Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n351TBM01_DEL_FLG ;
   private boolean n609TBM01_NOTE ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n285TAM04_AUTH_NM ;
   private String AV9PO_ERRCD ;
   private String AV10PO_ERRMSG ;
   private String AV14C_TAM020_APP_ID ;
   private String A351TBM01_DEL_FLG ;
   private String A58TBM01_SYS_ID ;
   private String A609TBM01_NOTE ;
   private String AV16W_TAM08_SITE_NM ;
   private String A325TAM08_DEL_FLG ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String AV15W_TAM04_AUTH_NM ;
   private String A215TAM04_DEL_FLG ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private com.genexus.internet.MailRecipient AV12W_MAIL_RECIPIENT ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P007A2_A351TBM01_DEL_FLG ;
   private boolean[] P007A2_n351TBM01_DEL_FLG ;
   private String[] P007A2_A58TBM01_SYS_ID ;
   private String[] P007A2_A609TBM01_NOTE ;
   private boolean[] P007A2_n609TBM01_NOTE ;
   private String[] P007A3_A325TAM08_DEL_FLG ;
   private boolean[] P007A3_n325TAM08_DEL_FLG ;
   private String[] P007A3_A57TAM08_SITE_ID ;
   private String[] P007A3_A319TAM08_SITE_NM ;
   private boolean[] P007A3_n319TAM08_SITE_NM ;
   private String[] P007A4_A215TAM04_DEL_FLG ;
   private boolean[] P007A4_n215TAM04_DEL_FLG ;
   private String[] P007A4_A13TAM04_AUTH_CD ;
   private String[] P007A4_A285TAM04_AUTH_NM ;
   private boolean[] P007A4_n285TAM04_AUTH_NM ;
   private com.genexus.internet.GXMailMessage AV11W_MAIL_MESSAGE ;
   private com.genexus.internet.GXMailMessage GXv_mailmessage1[] ;
   private SdtTAM07_USER AV8P_BC_USER_MST ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class a207_pc02_user_send_mail__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007A2", "SELECT `TBM01_DEL_FLG`, `TBM01_SYS_ID`, `TBM01_NOTE` FROM `TBM01_SYSTEM` WHERE (`TBM01_SYS_ID` IN ('908','909')) AND (`TBM01_DEL_FLG` = '0') ORDER BY `TBM01_SYS_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007A3", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007A4", "SELECT `TAM04_DEL_FLG`, `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE (`TAM04_AUTH_CD` = ?) AND (`TAM04_DEL_FLG` = '0') ORDER BY `TAM04_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
      }
   }

}

