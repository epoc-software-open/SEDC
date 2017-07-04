/*
               File: B714_PC02_DELETE_CRF
        Description: CRF削除
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:47.45
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
                             byte aP3 ,
                             byte[] aP4 )
   {
      b714_pc02_delete_crf.this.AV12P_STUDY_ID = aP0;
      b714_pc02_delete_crf.this.AV13P_SUBJECT_ID = aP1;
      b714_pc02_delete_crf.this.AV11P_CRF_ID = aP2;
      b714_pc02_delete_crf.this.AV19P_CRF_EDA_NO = aP3;
      b714_pc02_delete_crf.this.aP4 = aP4;
      b714_pc02_delete_crf.this.aP5 = aP5;
      b714_pc02_delete_crf.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      b714_pc02_delete_crf.this.AV12P_STUDY_ID = aP0;
      b714_pc02_delete_crf.this.AV13P_SUBJECT_ID = aP1;
      b714_pc02_delete_crf.this.AV11P_CRF_ID = aP2;
      b714_pc02_delete_crf.this.AV19P_CRF_EDA_NO = aP3;
      b714_pc02_delete_crf.this.aP4 = aP4;
      b714_pc02_delete_crf.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM02_APP_ID = "B714" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_RTN_CD = (byte)(0) ;
      AV17W_RTN_MSG = "" ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV16W_RTN_CD == 0 )
      {
         /* Using cursor P00602 */
         pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A935TBT02_CRF_EDA_NO = P00602_A935TBT02_CRF_EDA_NO[0] ;
            A91TBT02_CRF_ID = P00602_A91TBT02_CRF_ID[0] ;
            A90TBT02_SUBJECT_ID = P00602_A90TBT02_SUBJECT_ID[0] ;
            A89TBT02_STUDY_ID = P00602_A89TBT02_STUDY_ID[0] ;
            A661TBT02_INPUT_END_FLG = P00602_A661TBT02_INPUT_END_FLG[0] ;
            n661TBT02_INPUT_END_FLG = P00602_n661TBT02_INPUT_END_FLG[0] ;
            if ( GXutil.strcmp(A661TBT02_INPUT_END_FLG, "1") == 0 )
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
               /* Using cursor P00603 */
               pr_default.execute(1, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV16W_RTN_CD == 0 )
         {
            /* Using cursor P00604 */
            pr_default.execute(2, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A936TBT11_CRF_EDA_NO = P00604_A936TBT11_CRF_EDA_NO[0] ;
               A94TBT11_CRF_ID = P00604_A94TBT11_CRF_ID[0] ;
               A93TBT11_SUBJECT_ID = P00604_A93TBT11_SUBJECT_ID[0] ;
               A92TBT11_STUDY_ID = P00604_A92TBT11_STUDY_ID[0] ;
               A95TBT11_CRF_VERSION = P00604_A95TBT11_CRF_VERSION[0] ;
               AV8BC_TBT11_CRF_HISTORY.Load(AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV11P_CRF_ID, AV19P_CRF_EDA_NO, A95TBT11_CRF_VERSION);
               /* Execute user subroutine: S131 */
               S131 ();
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
               AV8BC_TBT11_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV24Pgmname );
               AV8BC_TBT11_CRF_HISTORY.Save();
               /* Execute user subroutine: S131 */
               S131 ();
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
            /* Using cursor P00605 */
            pr_default.execute(3, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT12_CRF_RESULT") ;
            /* End optimized DELETE. */
            /* Using cursor P00606 */
            pr_default.execute(4, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
            while ( (pr_default.getStatus(4) != 101) )
            {
               A938TBT13_CRF_EDA_NO = P00606_A938TBT13_CRF_EDA_NO[0] ;
               A103TBT13_CRF_ID = P00606_A103TBT13_CRF_ID[0] ;
               A102TBT13_SUBJECT_ID = P00606_A102TBT13_SUBJECT_ID[0] ;
               A101TBT13_STUDY_ID = P00606_A101TBT13_STUDY_ID[0] ;
               A106TBT13_CRF_ITEM_GRP_CD = P00606_A106TBT13_CRF_ITEM_GRP_CD[0] ;
               A105TBT13_CRF_ITEM_GRP_DIV = P00606_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
               A104TBT13_CRF_VERSION = P00606_A104TBT13_CRF_VERSION[0] ;
               AV9BC_TBT13_CRF_RES_HIS.Load(AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV11P_CRF_ID, AV19P_CRF_EDA_NO, A104TBT13_CRF_VERSION, A105TBT13_CRF_ITEM_GRP_DIV, A106TBT13_CRF_ITEM_GRP_CD);
               /* Execute user subroutine: S141 */
               S141 ();
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
               AV9BC_TBT13_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV24Pgmname );
               AV9BC_TBT13_CRF_RES_HIS.Save();
               /* Execute user subroutine: S141 */
               S141 ();
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
            /* Using cursor P00607 */
            pr_default.execute(5, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT15_CRF_MEMO_LOC") ;
            /* End optimized DELETE. */
            /* Optimized DELETE. */
            /* Using cursor P00608 */
            pr_default.execute(6, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
            /* End optimized DELETE. */
         }
         if ( AV16W_RTN_CD == 0 )
         {
            AV18W_LOGTEXT = "" ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "STUDY_ID:" + GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "SUBJECT_ID:" + GXutil.trim( GXutil.str( AV13P_SUBJECT_ID, 6, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "CRF_ID:" + GXutil.trim( GXutil.str( AV11P_CRF_ID, 4, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "CRF_EDA_NO:" + GXutil.trim( GXutil.str( AV19P_CRF_EDA_NO, 2, 0)) + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "DM_ARRIVAL_FLG:" + "0" + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = AV18W_LOGTEXT + "UPD_RIYU:" + "CRF削除" + GXutil.chr( (short)(9)) ;
            AV18W_LOGTEXT = GXutil.strReplace( AV18W_LOGTEXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
            new a804_pc03_datalog(remoteHandle, context).execute( AV24Pgmname, "DEL", AV18W_LOGTEXT) ;
         }
      }
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
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
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      new a804_pc02_log_start(remoteHandle, context).execute( AV24Pgmname) ;
   }

   public void S121( )
   {
      /* 'SUB_MAST_CHK' Routine */
      AV29GXLvl199 = (byte)(0) ;
      /* Using cursor P00609 */
      pr_default.execute(7, new Object[] {new Long(AV12P_STUDY_ID)});
      if ( Gx_err != 0 )
      {
         AV29GXLvl199 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(7) != 101) )
      {
         A369TBM21_DEL_FLG = P00609_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P00609_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = P00609_A63TBM21_STUDY_ID[0] ;
         A607TBM21_STATUS = P00609_A607TBM21_STATUS[0] ;
         n607TBM21_STATUS = P00609_n607TBM21_STATUS[0] ;
         AV29GXLvl199 = (byte)(1) ;
         if ( GXutil.strcmp(A607TBM21_STATUS, "2") == 0 )
         {
            AV16W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV17W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "試験の状態", "「終了」", "削除", "", "", GXv_char2) ;
            b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
            AV17W_RTN_MSG = GXt_char1 ;
         }
         else if ( GXutil.strcmp(A607TBM21_STATUS, "9") == 0 )
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
      if ( AV29GXLvl199 == 0 )
      {
         AV16W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV17W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00038", "選択された試験", "利用不可", "削除", "", "", GXv_char2) ;
         b714_pc02_delete_crf.this.GXt_char1 = GXv_char2[0] ;
         AV17W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S131( )
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

   public void S141( )
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

   public void S151( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S161( )
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
      this.aP4[0] = b714_pc02_delete_crf.this.AV16W_RTN_CD;
      this.aP5[0] = b714_pc02_delete_crf.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S151 */
                  S151 ();
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
      P00602_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P00602_A91TBT02_CRF_ID = new short[1] ;
      P00602_A90TBT02_SUBJECT_ID = new int[1] ;
      P00602_A89TBT02_STUDY_ID = new long[1] ;
      P00602_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P00602_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      A661TBT02_INPUT_END_FLG = "" ;
      P00604_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P00604_A94TBT11_CRF_ID = new short[1] ;
      P00604_A93TBT11_SUBJECT_ID = new int[1] ;
      P00604_A92TBT11_STUDY_ID = new long[1] ;
      P00604_A95TBT11_CRF_VERSION = new short[1] ;
      AV8BC_TBT11_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      AV24Pgmname = "" ;
      P00606_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P00606_A103TBT13_CRF_ID = new short[1] ;
      P00606_A102TBT13_SUBJECT_ID = new int[1] ;
      P00606_A101TBT13_STUDY_ID = new long[1] ;
      P00606_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00606_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      P00606_A104TBT13_CRF_VERSION = new short[1] ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      AV9BC_TBT13_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      AV18W_LOGTEXT = "" ;
      AV14W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV15W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      A607TBM21_STATUS = "" ;
      P00609_A369TBM21_DEL_FLG = new String[] {""} ;
      P00609_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P00609_A63TBM21_STUDY_ID = new long[1] ;
      P00609_A607TBM21_STATUS = new String[] {""} ;
      P00609_n607TBM21_STATUS = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_pc02_delete_crf__default(),
         new Object[] {
             new Object[] {
            P00602_A935TBT02_CRF_EDA_NO, P00602_A91TBT02_CRF_ID, P00602_A90TBT02_SUBJECT_ID, P00602_A89TBT02_STUDY_ID, P00602_A661TBT02_INPUT_END_FLG, P00602_n661TBT02_INPUT_END_FLG
            }
            , new Object[] {
            }
            , new Object[] {
            P00604_A936TBT11_CRF_EDA_NO, P00604_A94TBT11_CRF_ID, P00604_A93TBT11_SUBJECT_ID, P00604_A92TBT11_STUDY_ID, P00604_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            P00606_A938TBT13_CRF_EDA_NO, P00606_A103TBT13_CRF_ID, P00606_A102TBT13_SUBJECT_ID, P00606_A101TBT13_STUDY_ID, P00606_A106TBT13_CRF_ITEM_GRP_CD, P00606_A105TBT13_CRF_ITEM_GRP_DIV, P00606_A104TBT13_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P00609_A369TBM21_DEL_FLG, P00609_n369TBM21_DEL_FLG, P00609_A63TBM21_STUDY_ID, P00609_A607TBM21_STATUS, P00609_n607TBM21_STATUS
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B714_PC02_DELETE_CRF" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B714_PC02_DELETE_CRF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19P_CRF_EDA_NO ;
   private byte AV16W_RTN_CD ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private byte AV29GXLvl199 ;
   private short AV11P_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int A102TBT13_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private String scmdbuf ;
   private String AV24Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n607TBM21_STATUS ;
   private String AV17W_RTN_MSG ;
   private String AV10C_TAM02_APP_ID ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String AV18W_LOGTEXT ;
   private String AV15W_ERRCD ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private byte[] P00602_A935TBT02_CRF_EDA_NO ;
   private short[] P00602_A91TBT02_CRF_ID ;
   private int[] P00602_A90TBT02_SUBJECT_ID ;
   private long[] P00602_A89TBT02_STUDY_ID ;
   private String[] P00602_A661TBT02_INPUT_END_FLG ;
   private boolean[] P00602_n661TBT02_INPUT_END_FLG ;
   private byte[] P00604_A936TBT11_CRF_EDA_NO ;
   private short[] P00604_A94TBT11_CRF_ID ;
   private int[] P00604_A93TBT11_SUBJECT_ID ;
   private long[] P00604_A92TBT11_STUDY_ID ;
   private short[] P00604_A95TBT11_CRF_VERSION ;
   private byte[] P00606_A938TBT13_CRF_EDA_NO ;
   private short[] P00606_A103TBT13_CRF_ID ;
   private int[] P00606_A102TBT13_SUBJECT_ID ;
   private long[] P00606_A101TBT13_STUDY_ID ;
   private String[] P00606_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P00606_A105TBT13_CRF_ITEM_GRP_DIV ;
   private short[] P00606_A104TBT13_CRF_VERSION ;
   private String[] P00609_A369TBM21_DEL_FLG ;
   private boolean[] P00609_n369TBM21_DEL_FLG ;
   private long[] P00609_A63TBM21_STUDY_ID ;
   private String[] P00609_A607TBM21_STATUS ;
   private boolean[] P00609_n607TBM21_STATUS ;
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
          new ForEachCursor("P00602", "SELECT `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_INPUT_END_FLG` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ? ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P00603", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00604", "SELECT `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ? ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00605", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00606", "SELECT `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_ITEM_GRP_DIV`, `TBT13_CRF_VERSION` FROM `TBT13_CRF_RES_HIS` WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ? ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P00607", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE (`TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ?) AND (`TBT15_CRF_ID` = ?) AND (`TBT15_CRF_EDA_NO` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00608", "DELETE FROM `TBT14_CRF_MEMO`  WHERE (`TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?) AND (`TBT14_CRF_ID` = ?) AND (`TBT14_CRF_EDA_NO` = ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00609", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STATUS` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 2 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               return;
            case 4 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               return;
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

