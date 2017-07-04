/*
               File: A402_PC01_KENGEN_CHECK
        Description: 権限チェック処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:41.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a402_pc01_kengen_check extends GXProcedure
{
   public a402_pc01_kengen_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a402_pc01_kengen_check.class ), "" );
   }

   public a402_pc01_kengen_check( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String[] aP1 )
   {
      a402_pc01_kengen_check.this.AV9P_TAM02_APP_ID = aP0;
      a402_pc01_kengen_check.this.aP1 = aP1;
      a402_pc01_kengen_check.this.aP2 = aP2;
      a402_pc01_kengen_check.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      a402_pc01_kengen_check.this.AV9P_TAM02_APP_ID = aP0;
      a402_pc01_kengen_check.this.aP1 = aP1;
      a402_pc01_kengen_check.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_ERRCD = "9" ;
      AV15GXLvl24 = (byte)(0) ;
      /* Using cursor P00062 */
      pr_default.execute(0, new Object[] {AV8W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_kngn_ptn_kbn(), AV9P_TAM02_APP_ID});
      if ( Gx_err != 0 )
      {
         AV15GXLvl24 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A215TAM04_DEL_FLG = P00062_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P00062_n215TAM04_DEL_FLG[0] ;
         A288TAM05_KNGN_FLG = P00062_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = P00062_n288TAM05_KNGN_FLG[0] ;
         A13TAM04_AUTH_CD = P00062_A13TAM04_AUTH_CD[0] ;
         A12TAM03_APP_ID = P00062_A12TAM03_APP_ID[0] ;
         A215TAM04_DEL_FLG = P00062_A215TAM04_DEL_FLG[0] ;
         n215TAM04_DEL_FLG = P00062_n215TAM04_DEL_FLG[0] ;
         AV15GXLvl24 = (byte)(1) ;
         AV11W_KNGN_FLG = A288TAM05_KNGN_FLG ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV15GXLvl24 == 0 )
      {
         AV10W_ERRCD = "1" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_ERRCD = "0" ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! (GXutil.strcmp("", AV12W_SESSION.getValue("Com_Login_Info"))==0) )
      {
         AV8W_A_LOGIN_SDT.fromxml(AV12W_SESSION.getValue("Com_Login_Info"), "");
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV16Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV10W_ERRCD = "9" ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = a402_pc01_kengen_check.this.AV11W_KNGN_FLG;
      this.aP2[0] = a402_pc01_kengen_check.this.AV10W_ERRCD;
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
      AV11W_KNGN_FLG = "" ;
      AV10W_ERRCD = "" ;
      AV8W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      scmdbuf = "" ;
      P00062_A215TAM04_DEL_FLG = new String[] {""} ;
      P00062_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P00062_A288TAM05_KNGN_FLG = new String[] {""} ;
      P00062_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      P00062_A13TAM04_AUTH_CD = new String[] {""} ;
      P00062_A12TAM03_APP_ID = new String[] {""} ;
      A215TAM04_DEL_FLG = "" ;
      A288TAM05_KNGN_FLG = "" ;
      A13TAM04_AUTH_CD = "" ;
      A12TAM03_APP_ID = "" ;
      AV12W_SESSION = httpContext.getWebSession();
      AV16Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a402_pc01_kengen_check__default(),
         new Object[] {
             new Object[] {
            P00062_A215TAM04_DEL_FLG, P00062_n215TAM04_DEL_FLG, P00062_A288TAM05_KNGN_FLG, P00062_n288TAM05_KNGN_FLG, P00062_A13TAM04_AUTH_CD, P00062_A12TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV16Pgmname = "A402_PC01_KENGEN_CHECK" ;
      /* GeneXus formulas. */
      AV16Pgmname = "A402_PC01_KENGEN_CHECK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15GXLvl24 ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV16Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n288TAM05_KNGN_FLG ;
   private String AV9P_TAM02_APP_ID ;
   private String AV11W_KNGN_FLG ;
   private String AV10W_ERRCD ;
   private String A215TAM04_DEL_FLG ;
   private String A288TAM05_KNGN_FLG ;
   private String A13TAM04_AUTH_CD ;
   private String A12TAM03_APP_ID ;
   private com.genexus.webpanels.WebSession AV12W_SESSION ;
   private SdtA_LOGIN_SDT AV8W_A_LOGIN_SDT ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00062_A215TAM04_DEL_FLG ;
   private boolean[] P00062_n215TAM04_DEL_FLG ;
   private String[] P00062_A288TAM05_KNGN_FLG ;
   private boolean[] P00062_n288TAM05_KNGN_FLG ;
   private String[] P00062_A13TAM04_AUTH_CD ;
   private String[] P00062_A12TAM03_APP_ID ;
}

final  class a402_pc01_kengen_check__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00062", "SELECT T2.`TAM04_DEL_FLG`, T1.`TAM05_KNGN_FLG`, T1.`TAM04_AUTH_CD`, T1.`TAM03_APP_ID` FROM (`TAM05_APPLI_KNGN` T1 INNER JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TAM04_AUTH_CD`) WHERE (T1.`TAM04_AUTH_CD` = ? and T1.`TAM03_APP_ID` = ?) AND (T1.`TAM05_KNGN_FLG` IN ('1','2')) AND (T2.`TAM04_DEL_FLG` = '0') ORDER BY T1.`TAM04_AUTH_CD`, T1.`TAM03_APP_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 7);
               return;
      }
   }

}

