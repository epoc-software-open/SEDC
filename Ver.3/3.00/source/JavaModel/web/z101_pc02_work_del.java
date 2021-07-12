/*
               File: Z101_PC02_WORK_DEL
        Description: ワークテーブル削除処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:19.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class z101_pc02_work_del extends GXProcedure
{
   public z101_pc02_work_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( z101_pc02_work_del.class ), "" );
   }

   public z101_pc02_work_del( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        java.util.Date aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             java.util.Date aP2 )
   {
      z101_pc02_work_del.this.AV11P_PROG_NM = aP0;
      z101_pc02_work_del.this.AV8P_TAW01_DISP_DATETIME = aP1;
      z101_pc02_work_del.this.AV10P_CRT_DATE = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9C_TAM02_APP_ID = "Z101" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_MSG = "" ;
      if ( ! (GXutil.strcmp("", AV11P_PROG_NM)==0) )
      {
         AV12W_SESSION_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() ;
         /* Optimized DELETE. */
         /* Using cursor P001Q2 */
         pr_default.execute(0, new Object[] {AV12W_SESSION_ID, AV11P_PROG_NM, AV8P_TAW01_DISP_DATETIME});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TAW01_API_SDT_WORK") ;
         /* End optimized DELETE. */
      }
      else
      {
         /* Optimized DELETE. */
         /* Using cursor P001Q3 */
         pr_default.execute(1, new Object[] {AV10P_CRT_DATE});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TAW01_API_SDT_WORK") ;
         /* End optimized DELETE. */
      }
      Application.commit(context, remoteHandle, "DEFAULT", "z101_pc02_work_del");
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      z101_pc02_work_del.this.AV15W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
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
      AV9C_TAM02_APP_ID = "" ;
      AV16W_MSG = "" ;
      AV12W_SESSION_ID = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV25Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new z101_pc02_work_del__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "Z101_PC02_WORK_DEL" ;
      /* GeneXus formulas. */
      AV25Pgmname = "Z101_PC02_WORK_DEL" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV25Pgmname ;
   private String Gx_emsg ;
   private java.util.Date AV10P_CRT_DATE ;
   private boolean returnInSub ;
   private String AV11P_PROG_NM ;
   private String AV8P_TAW01_DISP_DATETIME ;
   private String AV9C_TAM02_APP_ID ;
   private String AV16W_MSG ;
   private String AV12W_SESSION_ID ;
   private String AV15W_ERRCD ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class z101_pc02_work_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P001Q2", "DELETE FROM `TAW01_API_SDT_WORK`  WHERE `TAW01_SESSION_ID` = ? and `TAW01_APP_ID` = ? and `TAW01_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P001Q3", "DELETE FROM `TAW01_API_SDT_WORK`  WHERE `TAW01_CRT_DATE` <= ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 30);
               stmt.setVarchar(3, (String)parms[2], 14);
               return;
            case 1 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               return;
      }
   }

}

