/*
               File: B505_PC03_ERR_CHK
        Description: エラーチェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:23.88
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b505_pc03_err_chk extends GXProcedure
{
   public b505_pc03_err_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b505_pc03_err_chk.class ), "" );
   }

   public b505_pc03_err_chk( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( short[] aP0 ,
                        String[] aP1 ,
                        int aP2 ,
                        String aP3 ,
                        long aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( short[] aP0 ,
                             String[] aP1 ,
                             int aP2 ,
                             String aP3 ,
                             long aP4 )
   {
      b505_pc03_err_chk.this.aP0 = aP0;
      b505_pc03_err_chk.this.aP1 = aP1;
      b505_pc03_err_chk.this.AV11P_SUBJECT_NO = aP2;
      b505_pc03_err_chk.this.AV10P_SUBJECT_ID = aP3;
      b505_pc03_err_chk.this.AV9P_STUDY_ID = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B505" ;
      AV12W_ERR_CD = (short)(0) ;
      AV13W_ERR_MSG = "" ;
      AV15W_SUBJECT_ID = AV10P_SUBJECT_ID ;
      /* Execute user subroutine: S1180 */
      S1180 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "INFO", "患者新規登録エラーチェック") ;
      if ( AV12W_ERR_CD == 0 )
      {
         if ( GXutil.strcmp(AV15W_SUBJECT_ID, "") == 0 )
         {
            AV15W_SUBJECT_ID = GXutil.trim( GXutil.str( AV11P_SUBJECT_NO, 10, 0)) ;
            AV14W_FLG = (byte)(1) ;
         }
      }
      /* Using cursor P003C2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A282TBT01_STUDY_ID = P003C2_A282TBT01_STUDY_ID[0] ;
         A283TBT01_SUBJECT_ID = P003C2_A283TBT01_SUBJECT_ID[0] ;
         A555TBT01_OUTER_SUBJECT_ID = P003C2_A555TBT01_OUTER_SUBJECT_ID[0] ;
         n555TBT01_OUTER_SUBJECT_ID = P003C2_n555TBT01_OUTER_SUBJECT_ID[0] ;
         if ( A283TBT01_SUBJECT_ID == AV11P_SUBJECT_NO )
         {
            AV12W_ERR_CD = (short)(1) ;
            GXt_char1 = AV13W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00006", "患者NO", "", "", "", "", GXv_char2) ;
            b505_pc03_err_chk.this.GXt_char1 = GXv_char2[0] ;
            AV13W_ERR_MSG = GXt_char1 ;
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         if ( GXutil.strcmp(A555TBT01_OUTER_SUBJECT_ID, AV15W_SUBJECT_ID) == 0 )
         {
            if ( AV14W_FLG == 0 )
            {
               AV12W_ERR_CD = (short)(1) ;
               GXt_char1 = AV13W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00006", "患者ID", "", "", "", "", GXv_char2) ;
               b505_pc03_err_chk.this.GXt_char1 = GXv_char2[0] ;
               AV13W_ERR_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            else
            {
               AV12W_ERR_CD = (short)(1) ;
               GXt_char1 = AV13W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00057", "患者IDが未入力の為、患者Noと同じ値をセットしましたが、患者ID:"+AV15W_SUBJECT_ID, "", "", "", "", GXv_char2) ;
               b505_pc03_err_chk.this.GXt_char1 = GXv_char2[0] ;
               AV13W_ERR_MSG = GXt_char1 ;
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1180( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1290( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV12W_ERR_CD = (short)(9) ;
      GXt_char3 = AV13W_ERR_MSG ;
      GXv_char2[0] = GXt_char3 ;
      new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
      b505_pc03_err_chk.this.GXt_char3 = GXv_char2[0] ;
      AV13W_ERR_MSG = GXt_char3 ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = b505_pc03_err_chk.this.AV12W_ERR_CD;
      this.aP1[0] = b505_pc03_err_chk.this.AV13W_ERR_MSG;
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
                  /* Execute user subroutine: S1290 */
                  S1290 ();
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
      AV13W_ERR_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV15W_SUBJECT_ID = "" ;
      AV18Pgmname = "" ;
      scmdbuf = "" ;
      P003C2_A282TBT01_STUDY_ID = new long[1] ;
      P003C2_A283TBT01_SUBJECT_ID = new int[1] ;
      P003C2_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      P003C2_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b505_pc03_err_chk__default(),
         new Object[] {
             new Object[] {
            P003C2_A282TBT01_STUDY_ID, P003C2_A283TBT01_SUBJECT_ID, P003C2_A555TBT01_OUTER_SUBJECT_ID, P003C2_n555TBT01_OUTER_SUBJECT_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV18Pgmname = "B505_PC03_ERR_CHK" ;
      /* GeneXus formulas. */
      AV18Pgmname = "B505_PC03_ERR_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV14W_FLG ;
   private short AV12W_ERR_CD ;
   private short Gx_err ;
   private int AV11P_SUBJECT_NO ;
   private int A283TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private String AV18Pgmname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n555TBT01_OUTER_SUBJECT_ID ;
   private String AV13W_ERR_MSG ;
   private String AV10P_SUBJECT_ID ;
   private String AV8C_TAM02_APP_ID ;
   private String AV15W_SUBJECT_ID ;
   private String A555TBT01_OUTER_SUBJECT_ID ;
   private short[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private long[] P003C2_A282TBT01_STUDY_ID ;
   private int[] P003C2_A283TBT01_SUBJECT_ID ;
   private String[] P003C2_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] P003C2_n555TBT01_OUTER_SUBJECT_ID ;
}

final  class b505_pc03_err_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003C2", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_OUTER_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? ORDER BY `TBT01_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

