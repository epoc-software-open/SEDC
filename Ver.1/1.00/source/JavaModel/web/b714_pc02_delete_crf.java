/*
               File: B714_PC02_DELETE_CRF
        Description: CRF削除
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:29.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b714_pc02_delete_crf extends GXProcedure
{
   public b714_pc02_delete_crf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b714_pc02_delete_crf.class ), "" );
   }

   public b714_pc02_delete_crf( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte[] aP3 )
   {
      b714_pc02_delete_crf.this.AV12P_STUDY_ID = aP0;
      b714_pc02_delete_crf.this.AV13P_SUBJECT_ID = aP1;
      b714_pc02_delete_crf.this.AV11P_CRF_ID = aP2;
      b714_pc02_delete_crf.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte[] aP3 ,
                             String[] aP4 )
   {
      b714_pc02_delete_crf.this.AV12P_STUDY_ID = aP0;
      b714_pc02_delete_crf.this.AV13P_SUBJECT_ID = aP1;
      b714_pc02_delete_crf.this.AV11P_CRF_ID = aP2;
      b714_pc02_delete_crf.this.aP3 = aP3;
      b714_pc02_delete_crf.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM02_APP_ID = "B714" ;
      /* Execute user subroutine: S11166 */
      S11166 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_RTN_CD = (byte)(0) ;
      AV17W_RTN_MSG = "" ;
      /* Execute user subroutine: S12189 */
      S12189 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV16W_RTN_CD == 0 )
      {
         /* Using cursor P00622 */
         pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A294TBT02_CRF_ID = P00622_A294TBT02_CRF_ID[0] ;
            A293TBT02_SUBJECT_ID = P00622_A293TBT02_SUBJECT_ID[0] ;
            A292TBT02_STUDY_ID = P00622_A292TBT02_STUDY_ID[0] ;
            A569TBT02_INPUT_END_FLG = P00622_A569TBT02_INPUT_END_FLG[0] ;
            n569TBT02_INPUT_END_FLG = P00622_n569TBT02_INPUT_END_FLG[0] ;
            if ( GXutil.strcmp(A569TBT02_INPUT_END_FLG, "1") == 0 )
            {
               AV16W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV17W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc02_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
               b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
               AV17W_RTN_MSG = GXt_char1 ;
            }
            else
            {
               /* Using cursor P00623 */
               pr_default.execute(1, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV16W_RTN_CD == 0 )
         {
            /* Using cursor P00624 */
            pr_default.execute(2, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A305TBT11_CRF_ID = P00624_A305TBT11_CRF_ID[0] ;
               A304TBT11_SUBJECT_ID = P00624_A304TBT11_SUBJECT_ID[0] ;
               A303TBT11_STUDY_ID = P00624_A303TBT11_STUDY_ID[0] ;
               A306TBT11_CRF_VERSION = P00624_A306TBT11_CRF_VERSION[0] ;
               AV8BC_TBT11_CRF_HISTORY.Load(AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV11P_CRF_ID, A306TBT11_CRF_VERSION);
               /* Execute user subroutine: S13216 */
               S13216 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV16W_RTN_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV8BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( "1" );
               AV8BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV23Pgmname );
               AV8BC_TBT11_CRF_HISTORY.Save();
               /* Execute user subroutine: S13216 */
               S13216 ();
               if ( returnInSub )
               {
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV16W_RTN_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(2);
            }
            pr_default.close(2);
            /* Optimized DELETE. */
            /* Using cursor P00625 */
            pr_default.execute(3, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
            /* End optimized DELETE. */
            /* Using cursor P00626 */
            pr_default.execute(4, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A498TBT13_CRF_ID = P00626_A498TBT13_CRF_ID[0] ;
               A497TBT13_SUBJECT_ID = P00626_A497TBT13_SUBJECT_ID[0] ;
               A496TBT13_STUDY_ID = P00626_A496TBT13_STUDY_ID[0] ;
               A501TBT13_CRF_ITEM_GRP_CD = P00626_A501TBT13_CRF_ITEM_GRP_CD[0] ;
               A500TBT13_CRF_ITEM_GRP_DIV = P00626_A500TBT13_CRF_ITEM_GRP_DIV[0] ;
               A499TBT13_CRF_VERSION = P00626_A499TBT13_CRF_VERSION[0] ;
               AV9BC_TBT13_CRF_RES_HIS.Load(AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV11P_CRF_ID, A499TBT13_CRF_VERSION, A500TBT13_CRF_ITEM_GRP_DIV, A501TBT13_CRF_ITEM_GRP_CD);
               /* Execute user subroutine: S14228 */
               S14228 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV16W_RTN_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               AV9BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( "1" );
               AV9BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV23Pgmname );
               AV9BC_TBT13_CRF_RES_HIS.Save();
               /* Execute user subroutine: S14228 */
               S14228 ();
               if ( returnInSub )
               {
                  pr_default.close(4);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( AV16W_RTN_CD != 0 )
               {
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(4);
            }
            pr_default.close(4);
            /* Optimized DELETE. */
            /* Using cursor P00627 */
            pr_default.execute(5, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00628 */
            pr_default.execute(6, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID)});
            /* End optimized DELETE. */
         }
         if ( AV16W_RTN_CD == 0 )
         {
            AV18W_LOGTEXT = "" ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV13P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV11P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "DM_ARRIVAL_FLG:" + "0" + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "UPD_RIYU:" + "CRF削除" + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = GXutil.strReplace( AV18W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
            new a804_pc03_datalog(remoteHandle, context).execute( AV23Pgmname, "DEL", AV18W_LOGTEXT) ;
         }
      }
      /* Execute user subroutine: S16255 */
      S16255 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S11166( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV14W_A_LOGIN_SDT;
      GXv_char2[0] = AV15W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV14W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b714_pc02_delete_crf.this.AV15W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV15W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
      new a804_pc02_log_start(remoteHandle, context).execute( AV23Pgmname) ;
   }

   public void S12189( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV28GXLvl192 = (byte)(0) ;
      /* Using cursor P00629 */
      pr_default.execute(7, new Object[] {new Long(AV12P_STUDY_ID)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A189TBM21_DEL_FLG = P00629_A189TBM21_DEL_FLG[0] ;
         n189TBM21_DEL_FLG = P00629_n189TBM21_DEL_FLG[0] ;
         A186TBM21_STUDY_ID = P00629_A186TBM21_STUDY_ID[0] ;
         A513TBM21_STATUS = P00629_A513TBM21_STATUS[0] ;
         n513TBM21_STATUS = P00629_n513TBM21_STATUS[0] ;
         AV28GXLvl192 = (byte)(1) ;
         if ( GXutil.strcmp(A513TBM21_STATUS, "2") == 0 )
         {
            AV16W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV17W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "削除", "", "", GXv_char2) ;
            b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
            AV17W_RTN_MSG = GXt_char1 ;
         }
         else if ( GXutil.strcmp(A513TBM21_STATUS, "9") == 0 )
         {
            AV16W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV17W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「中止」", "削除", "", "", GXv_char2) ;
            b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
            AV17W_RTN_MSG = GXt_char1 ;
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
      if ( AV28GXLvl192 == 0 )
      {
         AV16W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV17W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "削除", "", "", GXv_char2) ;
         b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
         AV17W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S13216( )
   {
      /* 'SUB_TBT11_CHECK_ERROR' Routine */
      if ( AV8BC_TBT11_CRF_HISTORY.Fail() )
      {
         AV16W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV17W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_TBT11_CRF_HISTORY.GetMessages(), (byte)(0), GXv_char2) ;
         b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
         AV17W_RTN_MSG = GXt_char1 + " (TBT11)" ;
      }
   }

   public void S14228( )
   {
      /* 'SUB_TBT13_CHECK_ERROR' Routine */
      if ( AV9BC_TBT13_CRF_RES_HIS.Fail() )
      {
         AV16W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV17W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_TBT13_CRF_RES_HIS.GetMessages(), (byte)(0), GXv_char2) ;
         b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
         AV17W_RTN_MSG = GXt_char1 + " (TBT13)" ;
      }
   }

   public void S15240( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV23Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   public void S16255( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV16W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b714_pc02_delete_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b714_pc02_delete_crf");
      }
   }

   protected void cleanup( )
   {
      this.aP3[0] = b714_pc02_delete_crf.this.AV16W_RTN_CD;
      this.aP4[0] = b714_pc02_delete_crf.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S15240 */
                  S15240 ();
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
      AV17W_RTN_MSG = "" ;
      AV10C_TAM02_APP_ID = "" ;
      scmdbuf = "" ;
      P00622_A294TBT02_CRF_ID = new short[1] ;
      P00622_A293TBT02_SUBJECT_ID = new int[1] ;
      P00622_A292TBT02_STUDY_ID = new long[1] ;
      P00622_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      P00622_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      A569TBT02_INPUT_END_FLG = "" ;
      P00624_A305TBT11_CRF_ID = new short[1] ;
      P00624_A304TBT11_SUBJECT_ID = new int[1] ;
      P00624_A303TBT11_STUDY_ID = new long[1] ;
      P00624_A306TBT11_CRF_VERSION = new short[1] ;
      AV8BC_TBT11_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      AV23Pgmname = "" ;
      P00626_A498TBT13_CRF_ID = new short[1] ;
      P00626_A497TBT13_SUBJECT_ID = new int[1] ;
      P00626_A496TBT13_STUDY_ID = new long[1] ;
      P00626_A501TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00626_A500TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00626_A499TBT13_CRF_VERSION = new short[1] ;
      A501TBT13_CRF_ITEM_GRP_CD = "" ;
      A500TBT13_CRF_ITEM_GRP_DIV = "" ;
      AV9BC_TBT13_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      AV18W_LOGTEXT = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      P00629_A189TBM21_DEL_FLG = new String[] {""} ;
      P00629_n189TBM21_DEL_FLG = new boolean[] {false} ;
      P00629_A186TBM21_STUDY_ID = new long[1] ;
      P00629_A513TBM21_STATUS = new String[] {""} ;
      P00629_n513TBM21_STATUS = new boolean[] {false} ;
      A189TBM21_DEL_FLG = "" ;
      A513TBM21_STATUS = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_pc02_delete_crf__default(),
         new Object[] {
             new Object[] {
            P00622_A294TBT02_CRF_ID, P00622_A293TBT02_SUBJECT_ID, P00622_A292TBT02_STUDY_ID, P00622_A569TBT02_INPUT_END_FLG, P00622_n569TBT02_INPUT_END_FLG
            }
            , new Object[] {
            }
            , new Object[] {
            P00624_A305TBT11_CRF_ID, P00624_A304TBT11_SUBJECT_ID, P00624_A303TBT11_STUDY_ID, P00624_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            P00626_A498TBT13_CRF_ID, P00626_A497TBT13_SUBJECT_ID, P00626_A496TBT13_STUDY_ID, P00626_A501TBT13_CRF_ITEM_GRP_CD, P00626_A500TBT13_CRF_ITEM_GRP_DIV, P00626_A499TBT13_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00629_A189TBM21_DEL_FLG, P00629_n189TBM21_DEL_FLG, P00629_A186TBM21_STUDY_ID, P00629_A513TBM21_STATUS, P00629_n513TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B714_PC02_DELETE_CRF" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B714_PC02_DELETE_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16W_RTN_CD ;
   private byte AV28GXLvl192 ;
   private short AV11P_CRF_ID ;
   private short A294TBT02_CRF_ID ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short A498TBT13_CRF_ID ;
   private short A499TBT13_CRF_VERSION ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int A293TBT02_SUBJECT_ID ;
   private int A304TBT11_SUBJECT_ID ;
   private int A497TBT13_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A292TBT02_STUDY_ID ;
   private long A303TBT11_STUDY_ID ;
   private long A496TBT13_STUDY_ID ;
   private long A186TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String AV23Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n513TBM21_STATUS ;
   private String AV17W_RTN_MSG ;
   private String AV10C_TAM02_APP_ID ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A501TBT13_CRF_ITEM_GRP_CD ;
   private String A500TBT13_CRF_ITEM_GRP_DIV ;
   private String AV18W_LOGTEXT ;
   private String AV15W_ERRCD ;
   private String A189TBM21_DEL_FLG ;
   private String A513TBM21_STATUS ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P00622_A294TBT02_CRF_ID ;
   private int[] P00622_A293TBT02_SUBJECT_ID ;
   private long[] P00622_A292TBT02_STUDY_ID ;
   private String[] P00622_A569TBT02_INPUT_END_FLG ;
   private boolean[] P00622_n569TBT02_INPUT_END_FLG ;
   private short[] P00624_A305TBT11_CRF_ID ;
   private int[] P00624_A304TBT11_SUBJECT_ID ;
   private long[] P00624_A303TBT11_STUDY_ID ;
   private short[] P00624_A306TBT11_CRF_VERSION ;
   private short[] P00626_A498TBT13_CRF_ID ;
   private int[] P00626_A497TBT13_SUBJECT_ID ;
   private long[] P00626_A496TBT13_STUDY_ID ;
   private String[] P00626_A501TBT13_CRF_ITEM_GRP_CD ;
   private String[] P00626_A500TBT13_CRF_ITEM_GRP_DIV ;
   private short[] P00626_A499TBT13_CRF_VERSION ;
   private String[] P00629_A189TBM21_DEL_FLG ;
   private boolean[] P00629_n189TBM21_DEL_FLG ;
   private long[] P00629_A186TBM21_STUDY_ID ;
   private String[] P00629_A513TBM21_STATUS ;
   private boolean[] P00629_n513TBM21_STATUS ;
   private SdtTBT11_CRF_HISTORY AV8BC_TBT11_CRF_HISTORY ;
   private SdtTBT13_CRF_RES_HIS AV9BC_TBT13_CRF_RES_HIS ;
   private SdtA_LOGIN_SDT AV14W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b714_pc02_delete_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00622", "SELECT `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_INPUT_END_FLG` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00623", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00624", "SELECT `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new UpdateCursor("P00625", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00626", "SELECT `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_VERSION` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new UpdateCursor("P00627", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE (`TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ?) AND (`TBT15_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00628", "DELETE FROM `TBT14_CRF_MEMO`  WHERE (`TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?) AND (`TBT14_CRF_ID` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00629", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               break;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

