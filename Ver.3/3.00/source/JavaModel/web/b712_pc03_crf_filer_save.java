/*
               File: B712_PC03_CRF_FILER_SAVE
        Description: CRFƒtƒBƒ‹ƒ^DB“o˜^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b712_pc03_crf_filer_save extends GXProcedure
{
   public b712_pc03_crf_filer_save( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_pc03_crf_filer_save.class ), "" );
   }

   public b712_pc03_crf_filer_save( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( byte aP0 ,
                             long aP1 ,
                             short aP2 ,
                             String aP3 ,
                             GxObjectCollection aP4 )
   {
      b712_pc03_crf_filer_save.this.AV15P_DEL_KBN = aP0;
      b712_pc03_crf_filer_save.this.AV11P_STUDY_ID = aP1;
      b712_pc03_crf_filer_save.this.AV12P_FILTER_NO = aP2;
      b712_pc03_crf_filer_save.this.AV13P_FILETR_NM = aP3;
      b712_pc03_crf_filer_save.this.AV8SD_C712_SD10_C = aP4;
      b712_pc03_crf_filer_save.this.aP5 = aP5;
      b712_pc03_crf_filer_save.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( byte aP0 ,
                        long aP1 ,
                        short aP2 ,
                        String aP3 ,
                        GxObjectCollection aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( byte aP0 ,
                             long aP1 ,
                             short aP2 ,
                             String aP3 ,
                             GxObjectCollection aP4 ,
                             String[] aP5 )
   {
      b712_pc03_crf_filer_save.this.AV15P_DEL_KBN = aP0;
      b712_pc03_crf_filer_save.this.AV11P_STUDY_ID = aP1;
      b712_pc03_crf_filer_save.this.AV12P_FILTER_NO = aP2;
      b712_pc03_crf_filer_save.this.AV13P_FILETR_NM = aP3;
      b712_pc03_crf_filer_save.this.AV8SD_C712_SD10_C = aP4;
      b712_pc03_crf_filer_save.this.aP5 = aP5;
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
      AV16C_APP_ID = GXutil.upper( AV19Pgmname) ;
      AV10P_OUT_MSG = "" ;
      if ( ( AV15P_DEL_KBN == 0 ) && ( AV12P_FILTER_NO == 0 ) )
      {
         AV14W_FILTER_NO = (short)(0) ;
         /* Using cursor P006Z2 */
         pr_default.execute(0, new Object[] {new Long(AV11P_STUDY_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A977TBM45_STUDY_ID = P006Z2_A977TBM45_STUDY_ID[0] ;
            A978TBM45_FILTER_NO = P006Z2_A978TBM45_FILTER_NO[0] ;
            AV14W_FILTER_NO = A978TBM45_FILTER_NO ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV14W_FILTER_NO = (short)(AV14W_FILTER_NO+1) ;
      }
      else
      {
         AV14W_FILTER_NO = AV12P_FILTER_NO ;
      }
      AV21GXLvl56 = (byte)(0) ;
      /* Using cursor P006Z3 */
      pr_default.execute(1, new Object[] {new Long(AV11P_STUDY_ID), new Short(AV14W_FILTER_NO)});
      if ( Gx_err != 0 )
      {
         AV21GXLvl56 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(1) != 101) )
      {
         A978TBM45_FILTER_NO = P006Z3_A978TBM45_FILTER_NO[0] ;
         A977TBM45_STUDY_ID = P006Z3_A977TBM45_STUDY_ID[0] ;
         A980TBM45_FILETR_NM = P006Z3_A980TBM45_FILETR_NM[0] ;
         n980TBM45_FILETR_NM = P006Z3_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = P006Z3_A981TBM45_IN_CRF_ID[0] ;
         n981TBM45_IN_CRF_ID = P006Z3_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = P006Z3_A982TBM45_DEL_FLG[0] ;
         n982TBM45_DEL_FLG = P006Z3_n982TBM45_DEL_FLG[0] ;
         A986TBM45_UPD_DATETIME = P006Z3_A986TBM45_UPD_DATETIME[0] ;
         n986TBM45_UPD_DATETIME = P006Z3_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = P006Z3_A987TBM45_UPD_USER_ID[0] ;
         n987TBM45_UPD_USER_ID = P006Z3_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = P006Z3_A988TBM45_UPD_PROG_NM[0] ;
         n988TBM45_UPD_PROG_NM = P006Z3_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = P006Z3_A989TBM45_UPD_CNT[0] ;
         n989TBM45_UPD_CNT = P006Z3_n989TBM45_UPD_CNT[0] ;
         AV21GXLvl56 = (byte)(1) ;
         if ( AV15P_DEL_KBN == 1 )
         {
            /* Using cursor P006Z4 */
            pr_default.execute(2, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
         }
         else
         {
            A980TBM45_FILETR_NM = AV13P_FILETR_NM ;
            n980TBM45_FILETR_NM = false ;
            A981TBM45_IN_CRF_ID = AV8SD_C712_SD10_C.toJSonString(false) ;
            n981TBM45_IN_CRF_ID = false ;
            A982TBM45_DEL_FLG = "0" ;
            n982TBM45_DEL_FLG = false ;
            A986TBM45_UPD_DATETIME = GXutil.now( ) ;
            n986TBM45_UPD_DATETIME = false ;
            GXt_char1 = A987TBM45_UPD_USER_ID ;
            GXv_char2[0] = GXt_char1 ;
            new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
            b712_pc03_crf_filer_save.this.GXt_char1 = GXv_char2[0] ;
            A987TBM45_UPD_USER_ID = GXt_char1 ;
            n987TBM45_UPD_USER_ID = false ;
            A988TBM45_UPD_PROG_NM = AV16C_APP_ID ;
            n988TBM45_UPD_PROG_NM = false ;
            A989TBM45_UPD_CNT = (long)(A989TBM45_UPD_CNT+1) ;
            n989TBM45_UPD_CNT = false ;
         }
         /* Using cursor P006Z5 */
         pr_default.execute(3, new Object[] {new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT), new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV21GXLvl56 == 0 )
      {
         if ( AV15P_DEL_KBN == 0 )
         {
            /*
               INSERT RECORD ON TABLE TBM45_CRF_FILETR

            */
            A977TBM45_STUDY_ID = AV11P_STUDY_ID ;
            A978TBM45_FILTER_NO = AV14W_FILTER_NO ;
            A980TBM45_FILETR_NM = AV13P_FILETR_NM ;
            n980TBM45_FILETR_NM = false ;
            A981TBM45_IN_CRF_ID = AV8SD_C712_SD10_C.toJSonString(false) ;
            n981TBM45_IN_CRF_ID = false ;
            A982TBM45_DEL_FLG = "0" ;
            n982TBM45_DEL_FLG = false ;
            A983TBM45_CRT_DATETIME = GXutil.now( ) ;
            n983TBM45_CRT_DATETIME = false ;
            GXt_char1 = A984TBM45_CRT_USER_ID ;
            GXv_char2[0] = GXt_char1 ;
            new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
            b712_pc03_crf_filer_save.this.GXt_char1 = GXv_char2[0] ;
            A984TBM45_CRT_USER_ID = GXt_char1 ;
            n984TBM45_CRT_USER_ID = false ;
            A985TBM45_CRT_PROG_NM = AV16C_APP_ID ;
            n985TBM45_CRT_PROG_NM = false ;
            A986TBM45_UPD_DATETIME = GXutil.now( ) ;
            n986TBM45_UPD_DATETIME = false ;
            GXt_char1 = A987TBM45_UPD_USER_ID ;
            GXv_char2[0] = GXt_char1 ;
            new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
            b712_pc03_crf_filer_save.this.GXt_char1 = GXv_char2[0] ;
            A987TBM45_UPD_USER_ID = GXt_char1 ;
            n987TBM45_UPD_USER_ID = false ;
            A988TBM45_UPD_PROG_NM = AV16C_APP_ID ;
            n988TBM45_UPD_PROG_NM = false ;
            A989TBM45_UPD_CNT = (long)(A989TBM45_UPD_CNT+1) ;
            n989TBM45_UPD_CNT = false ;
            /* Using cursor P006Z6 */
            pr_default.execute(4, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO), new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
      }
      if ( (GXutil.strcmp("", AV10P_OUT_MSG)==0) )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b712_pc03_crf_filer_save");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b712_pc03_crf_filer_save");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV10P_OUT_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b712_pc03_crf_filer_save");
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b712_pc03_crf_filer_save.this.AV10P_OUT_MSG;
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
      AV10P_OUT_MSG = "" ;
      AV16C_APP_ID = "" ;
      AV19Pgmname = "" ;
      scmdbuf = "" ;
      P006Z2_A977TBM45_STUDY_ID = new long[1] ;
      P006Z2_A978TBM45_FILTER_NO = new short[1] ;
      P006Z3_A978TBM45_FILTER_NO = new short[1] ;
      P006Z3_A977TBM45_STUDY_ID = new long[1] ;
      P006Z3_A980TBM45_FILETR_NM = new String[] {""} ;
      P006Z3_n980TBM45_FILETR_NM = new boolean[] {false} ;
      P006Z3_A981TBM45_IN_CRF_ID = new String[] {""} ;
      P006Z3_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      P006Z3_A982TBM45_DEL_FLG = new String[] {""} ;
      P006Z3_n982TBM45_DEL_FLG = new boolean[] {false} ;
      P006Z3_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006Z3_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      P006Z3_A987TBM45_UPD_USER_ID = new String[] {""} ;
      P006Z3_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      P006Z3_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      P006Z3_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      P006Z3_A989TBM45_UPD_CNT = new long[1] ;
      P006Z3_n989TBM45_UPD_CNT = new boolean[] {false} ;
      A980TBM45_FILETR_NM = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      A982TBM45_DEL_FLG = "" ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A987TBM45_UPD_USER_ID = "" ;
      A988TBM45_UPD_PROG_NM = "" ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A984TBM45_CRT_USER_ID = "" ;
      A985TBM45_CRT_PROG_NM = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_pc03_crf_filer_save__default(),
         new Object[] {
             new Object[] {
            P006Z2_A977TBM45_STUDY_ID, P006Z2_A978TBM45_FILTER_NO
            }
            , new Object[] {
            P006Z3_A978TBM45_FILTER_NO, P006Z3_A977TBM45_STUDY_ID, P006Z3_A980TBM45_FILETR_NM, P006Z3_n980TBM45_FILETR_NM, P006Z3_A981TBM45_IN_CRF_ID, P006Z3_n981TBM45_IN_CRF_ID, P006Z3_A982TBM45_DEL_FLG, P006Z3_n982TBM45_DEL_FLG, P006Z3_A986TBM45_UPD_DATETIME, P006Z3_n986TBM45_UPD_DATETIME,
            P006Z3_A987TBM45_UPD_USER_ID, P006Z3_n987TBM45_UPD_USER_ID, P006Z3_A988TBM45_UPD_PROG_NM, P006Z3_n988TBM45_UPD_PROG_NM, P006Z3_A989TBM45_UPD_CNT, P006Z3_n989TBM45_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV19Pgmname = "B712_PC03_CRF_FILER_SAVE" ;
      /* GeneXus formulas. */
      AV19Pgmname = "B712_PC03_CRF_FILER_SAVE" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15P_DEL_KBN ;
   private byte AV21GXLvl56 ;
   private short AV12P_FILTER_NO ;
   private short AV14W_FILTER_NO ;
   private short A978TBM45_FILTER_NO ;
   private short Gx_err ;
   private int GX_INS65 ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long A977TBM45_STUDY_ID ;
   private long A989TBM45_UPD_CNT ;
   private String AV19Pgmname ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A986TBM45_UPD_DATETIME ;
   private java.util.Date A983TBM45_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n986TBM45_UPD_DATETIME ;
   private boolean n987TBM45_UPD_USER_ID ;
   private boolean n988TBM45_UPD_PROG_NM ;
   private boolean n989TBM45_UPD_CNT ;
   private boolean n983TBM45_CRT_DATETIME ;
   private boolean n984TBM45_CRT_USER_ID ;
   private boolean n985TBM45_CRT_PROG_NM ;
   private String AV13P_FILETR_NM ;
   private String AV10P_OUT_MSG ;
   private String AV16C_APP_ID ;
   private String A980TBM45_FILETR_NM ;
   private String A981TBM45_IN_CRF_ID ;
   private String A982TBM45_DEL_FLG ;
   private String A987TBM45_UPD_USER_ID ;
   private String A988TBM45_UPD_PROG_NM ;
   private String A984TBM45_CRT_USER_ID ;
   private String A985TBM45_CRT_PROG_NM ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P006Z2_A977TBM45_STUDY_ID ;
   private short[] P006Z2_A978TBM45_FILTER_NO ;
   private short[] P006Z3_A978TBM45_FILTER_NO ;
   private long[] P006Z3_A977TBM45_STUDY_ID ;
   private String[] P006Z3_A980TBM45_FILETR_NM ;
   private boolean[] P006Z3_n980TBM45_FILETR_NM ;
   private String[] P006Z3_A981TBM45_IN_CRF_ID ;
   private boolean[] P006Z3_n981TBM45_IN_CRF_ID ;
   private String[] P006Z3_A982TBM45_DEL_FLG ;
   private boolean[] P006Z3_n982TBM45_DEL_FLG ;
   private java.util.Date[] P006Z3_A986TBM45_UPD_DATETIME ;
   private boolean[] P006Z3_n986TBM45_UPD_DATETIME ;
   private String[] P006Z3_A987TBM45_UPD_USER_ID ;
   private boolean[] P006Z3_n987TBM45_UPD_USER_ID ;
   private String[] P006Z3_A988TBM45_UPD_PROG_NM ;
   private boolean[] P006Z3_n988TBM45_UPD_PROG_NM ;
   private long[] P006Z3_A989TBM45_UPD_CNT ;
   private boolean[] P006Z3_n989TBM45_UPD_CNT ;
   private GxObjectCollection AV8SD_C712_SD10_C ;
}

final  class b712_pc03_crf_filer_save__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006Z2", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? ORDER BY `TBM45_FILTER_NO` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P006Z3", "SELECT `TBM45_FILTER_NO`, `TBM45_STUDY_ID`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` = ? ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006Z4", "DELETE FROM `TBM45_CRF_FILETR`  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006Z5", "UPDATE `TBM45_CRF_FILETR` SET `TBM45_FILETR_NM`=?, `TBM45_IN_CRF_ID`=?, `TBM45_DEL_FLG`=?, `TBM45_UPD_DATETIME`=?, `TBM45_UPD_USER_ID`=?, `TBM45_UPD_PROG_NM`=?, `TBM45_UPD_CNT`=?  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006Z6", "INSERT INTO `TBM45_CRF_FILETR`(`TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[13]).longValue());
               }
               stmt.setLong(8, ((Number) parms[14]).longValue());
               stmt.setShort(9, ((Number) parms[15]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[21]).longValue());
               }
               return;
      }
   }

}

