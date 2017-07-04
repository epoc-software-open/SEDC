/*
               File: B713_PC02_SUBJECT_DELETE
        Description: 患者削除
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:23.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b713_pc02_subject_delete extends GXProcedure
{
   public b713_pc02_subject_delete( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b713_pc02_subject_delete.class ), "" );
   }

   public b713_pc02_subject_delete( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             byte[] aP2 )
   {
      b713_pc02_subject_delete.this.AV9P_STUDY_ID = aP0;
      b713_pc02_subject_delete.this.AV10P_SUBJECT_ID = aP1;
      b713_pc02_subject_delete.this.aP2 = aP2;
      b713_pc02_subject_delete.this.aP3 = aP3;
      b713_pc02_subject_delete.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        byte[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             byte[] aP2 ,
                             String[] aP3 )
   {
      b713_pc02_subject_delete.this.AV9P_STUDY_ID = aP0;
      b713_pc02_subject_delete.this.AV10P_SUBJECT_ID = aP1;
      b713_pc02_subject_delete.this.aP2 = aP2;
      b713_pc02_subject_delete.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B713" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12W_RTN_CD = (byte)(0) ;
      AV13W_RTN_MSG = "" ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV12W_RTN_CD == 0 )
      {
         /* Optimized DELETE. */
         /* Using cursor P005R2 */
         pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R3 */
         pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R4 */
         pr_default.execute(2, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R5 */
         pr_default.execute(3, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R6 */
         pr_default.execute(4, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R7 */
         pr_default.execute(5, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
         /* End optimized DELETE. */
         /* Optimized DELETE. */
         /* Using cursor P005R8 */
         pr_default.execute(6, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT01_SUBJECT") ;
         /* End optimized DELETE. */
      }
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      b713_pc02_subject_delete.this.AV11W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV24GXLvl124 = (byte)(0) ;
      /* Using cursor P005R9 */
      pr_default.execute(7, new Object[] {new Long(AV9P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV24GXLvl124 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(7) != 101) )
      {
         A369TBM21_DEL_FLG = P005R9_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P005R9_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = P005R9_A63TBM21_STUDY_ID[0] ;
         A607TBM21_STATUS = P005R9_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P005R9_n607TBM21_STATUS[0] ;
         AV24GXLvl124 = (byte)(1) ;
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            AV12W_RTN_CD = (byte)(1) ;
            GXt_char3 = AV13W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "削除", "", "", GXv_char2) ;
            b713_pc02_subject_delete.this.GXt_char3 = GXv_char2[0] ;
            AV13W_RTN_MSG = GXt_char3 ;
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
         {
            AV12W_RTN_CD = (byte)(1) ;
            GXt_char3 = AV13W_RTN_MSG ;
            GXv_char2[0] = GXt_char3 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "削除", "", "", GXv_char2) ;
            b713_pc02_subject_delete.this.GXt_char3 = GXv_char2[0] ;
            AV13W_RTN_MSG = GXt_char3 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      if ( AV24GXLvl124 == 0 )
      {
         AV12W_RTN_CD = (byte)(1) ;
         GXt_char3 = AV13W_RTN_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "削除", "", "", GXv_char2) ;
         b713_pc02_subject_delete.this.GXt_char3 = GXv_char2[0] ;
         AV13W_RTN_MSG = GXt_char3 ;
      }
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S141( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV12W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b713_pc02_subject_delete");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b713_pc02_subject_delete");
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = b713_pc02_subject_delete.this.AV12W_RTN_CD;
      this.aP3[0] = b713_pc02_subject_delete.this.AV13W_RTN_MSG;
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
                  /* Execute user subroutine: S131 */
                  S131 ();
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
      AV13W_RTN_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV11W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      A607TBM21_STATUS = "" ;
      scmdbuf = "" ;
      P005R9_A369TBM21_DEL_FLG = new String[] {""} ;
      P005R9_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P005R9_A63TBM21_STUDY_ID = new long[1] ;
      P005R9_A607TBM21_STATUS = new String[] {""} ;
      P005R9_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      GXt_char3 = "" ;
      GXv_char2 = new String [1] ;
      AV25Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b713_pc02_subject_delete__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P005R9_A369TBM21_DEL_FLG, P005R9_n369TBM21_DEL_FLG, P005R9_A63TBM21_STUDY_ID, P005R9_A607TBM21_STATUS, P005R9_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B713_PC02_SUBJECT_DELETE" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B713_PC02_SUBJECT_DELETE" ;
      Gx_err = (short)(0) ;
   }

   private byte AV12W_RTN_CD ;
   private byte AV24GXLvl124 ;
   private short Gx_err ;
   private int AV10P_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String AV25Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV13W_RTN_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV11W_ERRCD ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P005R9_A369TBM21_DEL_FLG ;
   private boolean[] P005R9_n369TBM21_DEL_FLG ;
   private long[] P005R9_A63TBM21_STUDY_ID ;
   private String[] P005R9_A607TBM21_STATUS ;
   private boolean[] P005R9_n607TBM21_STATUS ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

final  class b713_pc02_subject_delete__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P005R2", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R3", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R4", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R5", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R6", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R7", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005R8", "DELETE FROM `TBT01_SUBJECT`  WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P005R9", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
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
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

