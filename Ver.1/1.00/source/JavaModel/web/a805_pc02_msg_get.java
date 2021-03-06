/*
               File: A805_PC02_MSG_GET
        Description: メッセージ取得処理（メッセージコード無し）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:46.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a805_pc02_msg_get extends GXProcedure
{
   public a805_pc02_msg_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a805_pc02_msg_get.class ), "" );
   }

   public a805_pc02_msg_get( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      a805_pc02_msg_get.this.AV13P_TAM06_MSG_CD = aP0;
      a805_pc02_msg_get.this.AV8P_REP_1 = aP1;
      a805_pc02_msg_get.this.AV9P_REP_2 = aP2;
      a805_pc02_msg_get.this.AV10P_REP_3 = aP3;
      a805_pc02_msg_get.this.AV11P_REP_4 = aP4;
      a805_pc02_msg_get.this.AV12P_REP_5 = aP5;
      a805_pc02_msg_get.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String[] aP6 )
   {
      a805_pc02_msg_get.this.AV13P_TAM06_MSG_CD = aP0;
      a805_pc02_msg_get.this.AV8P_REP_1 = aP1;
      a805_pc02_msg_get.this.AV9P_REP_2 = aP2;
      a805_pc02_msg_get.this.AV10P_REP_3 = aP3;
      a805_pc02_msg_get.this.AV11P_REP_4 = aP4;
      a805_pc02_msg_get.this.AV12P_REP_5 = aP5;
      a805_pc02_msg_get.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S1164 */
      S1164 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! (GXutil.strcmp("", AV13P_TAM06_MSG_CD)==0) )
      {
         AV17GXLvl26 = (byte)(0) ;
         /* Using cursor P001G2 */
         pr_default.execute(0, new Object[] {AV13P_TAM06_MSG_CD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A110TAM06_DEL_FLG = P001G2_A110TAM06_DEL_FLG[0] ;
            n110TAM06_DEL_FLG = P001G2_n110TAM06_DEL_FLG[0] ;
            A21TAM06_MSG_CD = P001G2_A21TAM06_MSG_CD[0] ;
            A20TAM06_MSG = P001G2_A20TAM06_MSG[0] ;
            n20TAM06_MSG = P001G2_n20TAM06_MSG[0] ;
            AV17GXLvl26 = (byte)(1) ;
            AV14W_MSG = A20TAM06_MSG ;
            if ( ! (GXutil.strcmp("", AV8P_REP_1)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$1$", AV8P_REP_1) ;
            }
            if ( ! (GXutil.strcmp("", AV9P_REP_2)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$2$", AV9P_REP_2) ;
            }
            if ( ! (GXutil.strcmp("", AV10P_REP_3)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$3$", AV10P_REP_3) ;
            }
            if ( ! (GXutil.strcmp("", AV11P_REP_4)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$4$", AV11P_REP_4) ;
            }
            if ( ! (GXutil.strcmp("", AV12P_REP_5)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$5$", AV12P_REP_5) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV17GXLvl26 == 0 )
         {
            AV14W_MSG = "メッセージマスタに該当データなし" ;
         }
      }
      cleanup();
   }

   public void S1164( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1274( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP6[0] = a805_pc02_msg_get.this.AV14W_MSG;
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
                  /* Execute user subroutine: S1274 */
                  S1274 ();
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
      AV14W_MSG = "" ;
      scmdbuf = "" ;
      P001G2_A110TAM06_DEL_FLG = new String[] {""} ;
      P001G2_n110TAM06_DEL_FLG = new boolean[] {false} ;
      P001G2_A21TAM06_MSG_CD = new String[] {""} ;
      P001G2_A20TAM06_MSG = new String[] {""} ;
      P001G2_n20TAM06_MSG = new boolean[] {false} ;
      A110TAM06_DEL_FLG = "" ;
      A21TAM06_MSG_CD = "" ;
      A20TAM06_MSG = "" ;
      AV18Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a805_pc02_msg_get__default(),
         new Object[] {
             new Object[] {
            P001G2_A110TAM06_DEL_FLG, P001G2_n110TAM06_DEL_FLG, P001G2_A21TAM06_MSG_CD, P001G2_A20TAM06_MSG, P001G2_n20TAM06_MSG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV18Pgmname = "A805_PC02_MSG_GET" ;
      /* GeneXus formulas. */
      AV18Pgmname = "A805_PC02_MSG_GET" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl26 ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n110TAM06_DEL_FLG ;
   private boolean n20TAM06_MSG ;
   private String AV13P_TAM06_MSG_CD ;
   private String AV8P_REP_1 ;
   private String AV9P_REP_2 ;
   private String AV10P_REP_3 ;
   private String AV11P_REP_4 ;
   private String AV12P_REP_5 ;
   private String AV14W_MSG ;
   private String A110TAM06_DEL_FLG ;
   private String A21TAM06_MSG_CD ;
   private String A20TAM06_MSG ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P001G2_A110TAM06_DEL_FLG ;
   private boolean[] P001G2_n110TAM06_DEL_FLG ;
   private String[] P001G2_A21TAM06_MSG_CD ;
   private String[] P001G2_A20TAM06_MSG ;
   private boolean[] P001G2_n20TAM06_MSG ;
}

final  class a805_pc02_msg_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P001G2", "SELECT `TAM06_DEL_FLG`, `TAM06_MSG_CD`, `TAM06_MSG` FROM `TAM06_MSG` WHERE (`TAM06_MSG_CD` = ?) AND (`TAM06_DEL_FLG` = '0') ORDER BY `TAM06_MSG_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 7);
               break;
      }
   }

}

