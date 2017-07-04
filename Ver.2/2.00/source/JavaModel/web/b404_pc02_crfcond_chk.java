/*
               File: B404_PC02_CRFCOND_CHK
        Description: CRF選択条件入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:39.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b404_pc02_crfcond_chk extends GXProcedure
{
   public b404_pc02_crfcond_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b404_pc02_crfcond_chk.class ), "" );
   }

   public b404_pc02_crfcond_chk( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTBM33_CRF_COND aP0 ,
                                         boolean aP1 ,
                                         byte[] aP2 ,
                                         GxObjectCollection[] aP3 )
   {
      b404_pc02_crfcond_chk.this.AV26BC_CRF_COND = aP0;
      b404_pc02_crfcond_chk.this.AV11P_DEL_FLG = aP1;
      b404_pc02_crfcond_chk.this.aP2 = aP2;
      b404_pc02_crfcond_chk.this.aP3 = aP3;
      b404_pc02_crfcond_chk.this.aP4 = aP4;
      b404_pc02_crfcond_chk.this.aP4 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( SdtTBM33_CRF_COND aP0 ,
                        boolean aP1 ,
                        byte[] aP2 ,
                        GxObjectCollection[] aP3 ,
                        GxObjectCollection[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( SdtTBM33_CRF_COND aP0 ,
                             boolean aP1 ,
                             byte[] aP2 ,
                             GxObjectCollection[] aP3 ,
                             GxObjectCollection[] aP4 )
   {
      b404_pc02_crfcond_chk.this.AV26BC_CRF_COND = aP0;
      b404_pc02_crfcond_chk.this.AV11P_DEL_FLG = aP1;
      b404_pc02_crfcond_chk.this.aP2 = aP2;
      b404_pc02_crfcond_chk.this.aP3 = aP3;
      b404_pc02_crfcond_chk.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B404" ;
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_A_CHK_INFO_SDT.clear();
      AV16W_A_CHK_RESULT_SDT.clear();
      AV19W_A_RESULT_MSG_SDT.clear();
      AV23W_FOCUS_FLG = true ;
      AV24W_RTN_CD = (byte)(0) ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ! AV11P_DEL_FLG )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S141 */
         S141 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S151 */
         S151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_MST_CHK' Routine */
      if ( ! (0==AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()) )
      {
         if ( GXutil.strcmp(AV26BC_CRF_COND.GetMode(), "INS") == 0 )
         {
         }
         else
         {
            AV30GXLvl58 = (byte)(0) ;
            /* Using cursor P005D2 */
            pr_default.execute(0, new Object[] {new Long(AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), new Short(AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_crf_id()), new Short(AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no())});
            if ( Gx_err != 0 )
            {
               AV30GXLvl58 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(0) != 101) )
            {
               A78TBM33_COND_NO = P005D2_A78TBM33_COND_NO[0] ;
               A77TBM33_CRF_ID = P005D2_A77TBM33_CRF_ID[0] ;
               A76TBM33_STUDY_ID = P005D2_A76TBM33_STUDY_ID[0] ;
               A420TBM33_UPD_DATETIME = P005D2_A420TBM33_UPD_DATETIME[0] ;
               n420TBM33_UPD_DATETIME = P005D2_n420TBM33_UPD_DATETIME[0] ;
               AV30GXLvl58 = (byte)(1) ;
               if ( !( AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_upd_datetime().equals( A420TBM33_UPD_DATETIME ) ) )
               {
                  AV17W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
                  AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM33_STUDY_ID" );
                  AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
                  AV16W_A_CHK_RESULT_SDT.add(AV17W_A_CHK_RESULT_SDT_ITEM, 0);
                  AV20W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
                  b404_pc02_crfcond_chk.this.GXt_char1 = GXv_char2[0] ;
                  AV20W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
                  AV19W_A_RESULT_MSG_SDT.add(AV20W_A_RESULT_MSG_SDT_ITEM, 0);
                  AV24W_RTN_CD = (byte)(1) ;
               }
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV30GXLvl58 == 0 )
            {
               AV17W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
               AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM33_STUDY_ID" );
               AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( false );
               AV16W_A_CHK_RESULT_SDT.add(AV17W_A_CHK_RESULT_SDT_ITEM, 0);
               AV20W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
               b404_pc02_crfcond_chk.this.GXt_char1 = GXv_char2[0] ;
               AV20W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
               AV19W_A_RESULT_MSG_SDT.add(AV20W_A_RESULT_MSG_SDT_ITEM, 0);
               AV24W_RTN_CD = (byte)(1) ;
            }
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] = AV14W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3) ;
      AV14W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[0] ;
      AV31GXV1 = 1 ;
      while ( AV31GXV1 <= AV14W_A_CHK_INFO_SDT.size() )
      {
         AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV14W_A_CHK_INFO_SDT.elementAt(-1+AV31GXV1));
         if ( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV17W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV23W_FOCUS_FLG );
            AV16W_A_CHK_RESULT_SDT.add(AV17W_A_CHK_RESULT_SDT_ITEM, 0);
            AV20W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV20W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV19W_A_RESULT_MSG_SDT.add(AV20W_A_RESULT_MSG_SDT_ITEM, 0);
            AV23W_FOCUS_FLG = false ;
            AV24W_RTN_CD = (byte)(1) ;
         }
         AV31GXV1 = (int)(AV31GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM33_STUDY_ID" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "試験ID" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
      AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM33_COND_NM" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "条件名" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_nm() );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(100) );
      AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
      AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM33_PRIOR_NO" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "優先順" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num( DecimalUtil.doubleToDec(AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_prior_no()) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "NUM" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit( DecimalUtil.doubleToDec(0) );
      AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
      AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TBM33_EXPRESSION" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "判定ロジック" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression() );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1000) );
      AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S141( )
   {
      /* 'SUB_ITEM_CHK' Routine */
   }

   public void S151( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
      if ( ! (GXutil.strcmp("", AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression())==0) )
      {
         GXv_int4[0] = (short)(0) ;
         GXv_char2[0] = AV27W_MSG ;
         new b405_pc01_cond_hyoka(remoteHandle, context).execute( AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(), 0, AV26BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_expression(), GXv_int4, GXv_char2) ;
         b404_pc02_crfcond_chk.this.AV27W_MSG = GXv_char2[0] ;
         if ( ! (GXutil.strcmp("", AV27W_MSG)==0) )
         {
            AV17W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( "TBM33_EXPRESSION" );
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV23W_FOCUS_FLG );
            AV16W_A_CHK_RESULT_SDT.add(AV17W_A_CHK_RESULT_SDT_ITEM, 0);
            AV20W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV20W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV27W_MSG );
            AV19W_A_RESULT_MSG_SDT.add(AV20W_A_RESULT_MSG_SDT_ITEM, 0);
            AV23W_FOCUS_FLG = false ;
            AV24W_RTN_CD = (byte)(1) ;
         }
      }
   }

   public void S161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT5[0] = AV18W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT5, GXv_char2) ;
      AV18W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT5[0] ;
      b404_pc02_crfcond_chk.this.AV22W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV32Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b404_pc02_crfcond_chk.this.AV24W_RTN_CD;
      this.aP3[0] = b404_pc02_crfcond_chk.this.AV16W_A_CHK_RESULT_SDT;
      this.aP4[0] = b404_pc02_crfcond_chk.this.AV19W_A_RESULT_MSG_SDT;
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
                  /* Execute user subroutine: S171 */
                  S171 ();
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
      AV16W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV19W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV8C_APP_ID = "" ;
      AV14W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      A420TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      P005D2_A78TBM33_COND_NO = new short[1] ;
      P005D2_A77TBM33_CRF_ID = new short[1] ;
      P005D2_A76TBM33_STUDY_ID = new long[1] ;
      P005D2_A420TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005D2_n420TBM33_UPD_DATETIME = new boolean[] {false} ;
      AV17W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV20W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3 = new GxObjectCollection [1] ;
      AV15W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      GXv_int4 = new short [1] ;
      AV27W_MSG = "" ;
      AV18W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT5 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV32Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b404_pc02_crfcond_chk__default(),
         new Object[] {
             new Object[] {
            P005D2_A78TBM33_COND_NO, P005D2_A77TBM33_CRF_ID, P005D2_A76TBM33_STUDY_ID, P005D2_A420TBM33_UPD_DATETIME, P005D2_n420TBM33_UPD_DATETIME
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV32Pgmname = "B404_PC02_CRFCOND_CHK" ;
      /* GeneXus formulas. */
      AV32Pgmname = "B404_PC02_CRFCOND_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV24W_RTN_CD ;
   private byte AV30GXLvl58 ;
   private short Gx_err ;
   private short A78TBM33_COND_NO ;
   private short A77TBM33_CRF_ID ;
   private short GXv_int4[] ;
   private int AV31GXV1 ;
   private int GXActiveErrHndl ;
   private long A76TBM33_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV32Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A420TBM33_UPD_DATETIME ;
   private boolean AV11P_DEL_FLG ;
   private boolean returnInSub ;
   private boolean AV23W_FOCUS_FLG ;
   private boolean n420TBM33_UPD_DATETIME ;
   private String AV8C_APP_ID ;
   private String AV27W_MSG ;
   private String AV22W_ERRCD ;
   private byte[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private GxObjectCollection[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P005D2_A78TBM33_COND_NO ;
   private short[] P005D2_A77TBM33_CRF_ID ;
   private long[] P005D2_A76TBM33_STUDY_ID ;
   private java.util.Date[] P005D2_A420TBM33_UPD_DATETIME ;
   private boolean[] P005D2_n420TBM33_UPD_DATETIME ;
   private GxObjectCollection AV16W_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV19W_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV14W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem3[] ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV15W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV17W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV18W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT5[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV20W_A_RESULT_MSG_SDT_ITEM ;
   private SdtTBM33_CRF_COND AV26BC_CRF_COND ;
}

final  class b404_pc02_crfcond_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005D2", "SELECT `TBM33_COND_NO`, `TBM33_CRF_ID`, `TBM33_STUDY_ID`, `TBM33_UPD_DATETIME` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` = ? and `TBM33_COND_NO` = ? ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

