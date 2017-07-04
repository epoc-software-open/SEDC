/*
               File: B403_PC01_CHECK
        Description: 患者・適格性確認情報取込前チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:51.52
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b403_pc01_check extends GXProcedure
{
   public b403_pc01_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b403_pc01_check.class ), "" );
   }

   public b403_pc01_check( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 )
   {
      b403_pc01_check.this.AV13P_USER_ID = aP0;
      b403_pc01_check.this.AV11P_PWD = aP1;
      b403_pc01_check.this.AV12P_STUDY_ID = aP2;
      b403_pc01_check.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             String[] aP3 )
   {
      b403_pc01_check.this.AV13P_USER_ID = aP0;
      b403_pc01_check.this.AV11P_PWD = aP1;
      b403_pc01_check.this.AV12P_STUDY_ID = aP2;
      b403_pc01_check.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV33C_APP_ID = "B403" ;
      /* Execute user subroutine: S11238 */
      S11238 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8C_NUM = "@num" ;
      AV10C_SEPARATOR = "\\|" ;
      AV21W_ITEM_DIV_LIST.clear();
      /* Using cursor P005A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A113TAS01_DEL_FLG = P005A2_A113TAS01_DEL_FLG[0] ;
         n113TAS01_DEL_FLG = P005A2_n113TAS01_DEL_FLG[0] ;
         A54TAS01_DATA_KIND = P005A2_A54TAS01_DATA_KIND[0] ;
         A19TAS01_ITEM_NM = P005A2_A19TAS01_ITEM_NM[0] ;
         n19TAS01_ITEM_NM = P005A2_n19TAS01_ITEM_NM[0] ;
         A151TAS01_CHAR_2 = P005A2_A151TAS01_CHAR_2[0] ;
         n151TAS01_CHAR_2 = P005A2_n151TAS01_CHAR_2[0] ;
         A55TAS01_ITEM_CD = P005A2_A55TAS01_ITEM_CD[0] ;
         if ( GxRegex.IsMatch(A151TAS01_CHAR_2,"^.1...1.*$") )
         {
            AV20W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
            AV20W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( A19TAS01_ITEM_NM );
            AV20W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( A151TAS01_CHAR_2 );
            AV21W_ITEM_DIV_LIST.add(AV20W_ITEM_DIV, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21W_ITEM_DIV_LIST.size() < 1 )
      {
         GXt_char1 = AV17W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00075", "B06", "", "", "", "", GXv_char2) ;
         b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
         AV17W_ERR_MSG = GXt_char1 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char2) ;
      b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
      AV29W_SYS_CRFID = (short)(GXutil.lval( GXt_char1)) ;
      if ( (0==AV12P_STUDY_ID) )
      {
         AV16W_ERR_CD = (byte)(1) ;
         GXt_char1 = AV17W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00007", "試験", "", "", "", "", GXv_char2) ;
         b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
         AV17W_ERR_MSG = GXt_char1 ;
         httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV37GXLvl69 = (byte)(0) ;
      /* Using cursor P005A3 */
      pr_default.execute(1, new Object[] {new Long(AV12P_STUDY_ID), new Short(AV29W_SYS_CRFID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A223TBM31_DEL_FLG = P005A3_A223TBM31_DEL_FLG[0] ;
         n223TBM31_DEL_FLG = P005A3_n223TBM31_DEL_FLG[0] ;
         A218TBM31_CRF_ID = P005A3_A218TBM31_CRF_ID[0] ;
         A217TBM31_STUDY_ID = P005A3_A217TBM31_STUDY_ID[0] ;
         AV37GXLvl69 = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV37GXLvl69 == 0 )
      {
         AV16W_ERR_CD = (byte)(1) ;
         GXt_char1 = AV17W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", "適格性確認票", "", "", "", "", GXv_char2) ;
         b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
         AV17W_ERR_MSG = GXt_char1 ;
         httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtB602_SD03_META_LIST3[0] = AV23W_META_LIST;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b602_pc03_crfif_view_metalist(remoteHandle, context).execute( AV13P_USER_ID, AV11P_PWD, AV12P_STUDY_ID, GXv_SdtB602_SD03_META_LIST3, GXv_int4, GXv_char2) ;
      AV23W_META_LIST = GXv_SdtB602_SD03_META_LIST3[0] ;
      b403_pc01_check.this.AV16W_ERR_CD = (byte)((byte)(GXv_int4[0])) ;
      b403_pc01_check.this.AV17W_ERR_MSG = GXv_char2[0] ;
      AV38GXLvl88 = (byte)(0) ;
      /* Using cursor P005A4 */
      pr_default.execute(2, new Object[] {new Long(AV12P_STUDY_ID), new Short(AV29W_SYS_CRFID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A261TBM41_CRF_ITEM_GRP_CD = P005A4_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         A260TBM41_CRF_ID = P005A4_A260TBM41_CRF_ID[0] ;
         A259TBM41_STUDY_ID = P005A4_A259TBM41_STUDY_ID[0] ;
         A262TBM41_NCM_METADATA_ID = P005A4_A262TBM41_NCM_METADATA_ID[0] ;
         n262TBM41_NCM_METADATA_ID = P005A4_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = P005A4_A263TBM41_DEL_FLG[0] ;
         n263TBM41_DEL_FLG = P005A4_n263TBM41_DEL_FLG[0] ;
         A378TBM41_CRF_ITEM_GRP_DIV = P005A4_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         AV38GXLvl88 = (byte)(1) ;
         AV32W_TBM41_NCM_METADATA_ID = A262TBM41_NCM_METADATA_ID ;
         AV18W_EXIST_FLG = "0" ;
         AV39GXV1 = 1 ;
         while ( AV39GXV1 <= AV23W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().size() )
         {
            AV22W_META_ITEM = (SdtB602_SD03_META_LIST_META_DATAItem)((SdtB602_SD03_META_LIST_META_DATAItem)AV23W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().elementAt(-1+AV39GXV1));
            if ( GXutil.strcmp(GXutil.trim( GXutil.str( AV22W_META_ITEM.getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id(), 10, 0)), A262TBM41_NCM_METADATA_ID) == 0 )
            {
               AV18W_EXIST_FLG = "1" ;
               AV40GXLvl107 = (byte)(0) ;
               /* Using cursor P005A5 */
               pr_default.execute(3, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A261TBM41_CRF_ITEM_GRP_CD});
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A231TBM32_STUDY_ID = P005A5_A231TBM32_STUDY_ID[0] ;
                  A232TBM32_CRF_ID = P005A5_A232TBM32_CRF_ID[0] ;
                  A233TBM32_CRF_ITEM_CD = P005A5_A233TBM32_CRF_ITEM_CD[0] ;
                  A402TBM32_LIST_CD = P005A5_A402TBM32_LIST_CD[0] ;
                  n402TBM32_LIST_CD = P005A5_n402TBM32_LIST_CD[0] ;
                  A238TBM32_DEL_FLG = P005A5_A238TBM32_DEL_FLG[0] ;
                  n238TBM32_DEL_FLG = P005A5_n238TBM32_DEL_FLG[0] ;
                  A235TBM32_CRF_ITEM_DIV = P005A5_A235TBM32_CRF_ITEM_DIV[0] ;
                  n235TBM32_CRF_ITEM_DIV = P005A5_n235TBM32_CRF_ITEM_DIV[0] ;
                  AV40GXLvl107 = (byte)(1) ;
                  AV41GXV2 = 1 ;
                  while ( AV41GXV2 <= AV21W_ITEM_DIV_LIST.size() )
                  {
                     AV20W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)((SdtB402_SD04_ITEM_DIV)AV21W_ITEM_DIV_LIST.elementAt(-1+AV41GXV2));
                     if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, AV20W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div()) == 0 )
                     {
                        if ( GXutil.strSearch( AV22W_META_ITEM.getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name(), AV8C_NUM, 1) > 0 )
                        {
                        }
                        else
                        {
                           AV16W_ERR_CD = (byte)(1) ;
                           AV24W_MSG = "CRFID[" + GXutil.trim( GXutil.str( AV29W_SYS_CRFID, 10, 0)) + "].メタデータID[" + AV32W_TBM41_NCM_METADATA_ID + "]" ;
                           GXt_char1 = AV17W_ERR_MSG ;
                           GXv_char2[0] = GXt_char1 ;
                           new a805_pc01_msg_get(remoteHandle, context).execute( "AE00074", AV24W_MSG, "", "", "", "", GXv_char2) ;
                           b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
                           AV17W_ERR_MSG = GXt_char1 ;
                           httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
                        }
                        if (true) break;
                     }
                     AV41GXV2 = (int)(AV41GXV2+1) ;
                  }
                  if ( ! (GXutil.strcmp("", A402TBM32_LIST_CD)==0) || ( GXutil.strcmp(GXutil.trim( A402TBM32_LIST_CD), "") != 0 ) )
                  {
                     AV15W_CNT = (short)(0) ;
                     AV31W_TBM26_INNER_VALUE_COL.clear();
                     AV42GXLvl142 = (byte)(0) ;
                     /* Using cursor P005A6 */
                     pr_default.execute(4, new Object[] {new Long(A231TBM32_STUDY_ID), new Boolean(n402TBM32_LIST_CD), A402TBM32_LIST_CD});
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A446TBM26_STUDY_ID = P005A6_A446TBM26_STUDY_ID[0] ;
                        A447TBM26_LIST_CD = P005A6_A447TBM26_LIST_CD[0] ;
                        A451TBM26_DEL_FLG = P005A6_A451TBM26_DEL_FLG[0] ;
                        n451TBM26_DEL_FLG = P005A6_n451TBM26_DEL_FLG[0] ;
                        A450TBM26_INNER_VALUE = P005A6_A450TBM26_INNER_VALUE[0] ;
                        n450TBM26_INNER_VALUE = P005A6_n450TBM26_INNER_VALUE[0] ;
                        A448TBM26_LIST_ITEM_NO = P005A6_A448TBM26_LIST_ITEM_NO[0] ;
                        AV42GXLvl142 = (byte)(1) ;
                        AV15W_CNT = (short)(AV15W_CNT+1) ;
                        AV31W_TBM26_INNER_VALUE_COL.add(A450TBM26_INNER_VALUE, 0);
                        pr_default.readNext(4);
                     }
                     pr_default.close(4);
                     if ( AV42GXLvl142 == 0 )
                     {
                        AV16W_ERR_CD = (byte)(9) ;
                        GXt_char1 = AV17W_ERR_MSG ;
                        GXv_char2[0] = GXt_char1 ;
                        new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
                        b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
                        AV17W_ERR_MSG = GXt_char1 ;
                        httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
                        Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc01_check");
                        pr_default.close(3);
                        pr_default.close(2);
                        returnInSub = true;
                        cleanup();
                        if (true) return;
                     }
                     AV25W_SELECT_CONTENT = AV22W_META_ITEM.getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content() ;
                     AV26W_SELECT_CONTENT_COL = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV25W_SELECT_CONTENT,AV10C_SEPARATOR)) ;
                     if ( AV15W_CNT == AV26W_SELECT_CONTENT_COL.size() )
                     {
                        AV43GXV3 = 1 ;
                        while ( AV43GXV3 <= AV26W_SELECT_CONTENT_COL.size() )
                        {
                           AV27W_STR = (String)AV26W_SELECT_CONTENT_COL.elementAt(-1+AV43GXV3) ;
                           AV14W_CHAR_POS = (short)(GXutil.strSearch( AV27W_STR, "@", 1)+1) ;
                           AV28W_STR_SUBSTR = GXutil.substring( AV27W_STR, AV14W_CHAR_POS, GXutil.len( AV27W_STR)) ;
                           AV19W_FLG = "0" ;
                           AV44GXV4 = 1 ;
                           while ( AV44GXV4 <= AV31W_TBM26_INNER_VALUE_COL.size() )
                           {
                              AV30W_TBM26_INNER_VALUE = (String)AV31W_TBM26_INNER_VALUE_COL.elementAt(-1+AV44GXV4) ;
                              if ( GXutil.strcmp(AV28W_STR_SUBSTR, AV30W_TBM26_INNER_VALUE) == 0 )
                              {
                                 AV19W_FLG = "1" ;
                                 if (true) break;
                              }
                              AV44GXV4 = (int)(AV44GXV4+1) ;
                           }
                           if ( GXutil.strcmp(AV19W_FLG, "0") == 0 )
                           {
                              AV16W_ERR_CD = (byte)(1) ;
                              AV24W_MSG = "CRFID[" + GXutil.trim( GXutil.str( AV29W_SYS_CRFID, 10, 0)) + "].メタデータID[" + AV32W_TBM41_NCM_METADATA_ID + "]" ;
                              GXt_char1 = AV17W_ERR_MSG ;
                              GXv_char2[0] = GXt_char1 ;
                              new a805_pc01_msg_get(remoteHandle, context).execute( "AE00077", AV24W_MSG, "選択肢の値", "", "", "", GXv_char2) ;
                              b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
                              AV17W_ERR_MSG = GXt_char1 ;
                              httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
                              if (true) break;
                           }
                           AV43GXV3 = (int)(AV43GXV3+1) ;
                        }
                     }
                     else
                     {
                        AV16W_ERR_CD = (byte)(1) ;
                        AV24W_MSG = "CRFID[" + GXutil.trim( GXutil.str( AV29W_SYS_CRFID, 10, 0)) + "].メタデータID[" + AV32W_TBM41_NCM_METADATA_ID + "]" ;
                        GXt_char1 = AV17W_ERR_MSG ;
                        GXv_char2[0] = GXt_char1 ;
                        new a805_pc01_msg_get(remoteHandle, context).execute( "AE00077", AV24W_MSG, "選択肢の数", "", "", "", GXv_char2) ;
                        b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
                        AV17W_ERR_MSG = GXt_char1 ;
                        httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
                     }
                  }
                  /* Exiting from a For First loop. */
                  if (true) break;
               }
               pr_default.close(3);
               if ( AV40GXLvl107 == 0 )
               {
                  AV16W_ERR_CD = (byte)(9) ;
                  GXt_char1 = AV17W_ERR_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
                  b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
                  AV17W_ERR_MSG = GXt_char1 ;
                  httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
                  Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc01_check");
                  pr_default.close(2);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if (true) break;
            }
            AV39GXV1 = (int)(AV39GXV1+1) ;
         }
         if ( GXutil.strcmp(AV18W_EXIST_FLG, "0") == 0 )
         {
            AV16W_ERR_CD = (byte)(1) ;
            AV24W_MSG = "CRFID[" + GXutil.trim( GXutil.str( AV29W_SYS_CRFID, 10, 0)) + "].メタデータID[" + AV32W_TBM41_NCM_METADATA_ID + "]臨床試験支援システム側に対象のメタデータ" ;
            GXt_char1 = AV17W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", AV24W_MSG, "", "", "", "", GXv_char2) ;
            b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
            AV17W_ERR_MSG = GXt_char1 ;
            httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV38GXLvl88 == 0 )
      {
         AV16W_ERR_CD = (byte)(1) ;
         GXt_char1 = AV17W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", "CRF-NetCommonsマッピングマスタに定義情報", "", "", "", "", GXv_char2) ;
         b403_pc01_check.this.GXt_char1 = GXv_char2[0] ;
         AV17W_ERR_MSG = GXt_char1 ;
         httpContext.GX_msglist.addItem(AV17W_ERR_MSG);
      }
      cleanup();
   }

   public void S11238( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S12248( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc01_check");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b403_pc01_check.this.AV17W_ERR_MSG;
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
                  /* Execute user subroutine: S12248 */
                  S12248 ();
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
      AV17W_ERR_MSG = "" ;
      AV33C_APP_ID = "" ;
      AV8C_NUM = "" ;
      AV10C_SEPARATOR = "" ;
      AV21W_ITEM_DIV_LIST = new GxObjectCollection(SdtB402_SD04_ITEM_DIV.class, "B402_SD04_ITEM_DIV", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P005A2_A113TAS01_DEL_FLG = new String[] {""} ;
      P005A2_n113TAS01_DEL_FLG = new boolean[] {false} ;
      P005A2_A54TAS01_DATA_KIND = new String[] {""} ;
      P005A2_A19TAS01_ITEM_NM = new String[] {""} ;
      P005A2_n19TAS01_ITEM_NM = new boolean[] {false} ;
      P005A2_A151TAS01_CHAR_2 = new String[] {""} ;
      P005A2_n151TAS01_CHAR_2 = new boolean[] {false} ;
      P005A2_A55TAS01_ITEM_CD = new String[] {""} ;
      A113TAS01_DEL_FLG = "" ;
      A54TAS01_DATA_KIND = "" ;
      A19TAS01_ITEM_NM = "" ;
      A151TAS01_CHAR_2 = "" ;
      A55TAS01_ITEM_CD = "" ;
      AV20W_ITEM_DIV = new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
      P005A3_A223TBM31_DEL_FLG = new String[] {""} ;
      P005A3_n223TBM31_DEL_FLG = new boolean[] {false} ;
      P005A3_A218TBM31_CRF_ID = new short[1] ;
      P005A3_A217TBM31_STUDY_ID = new long[1] ;
      A223TBM31_DEL_FLG = "" ;
      AV23W_META_LIST = new SdtB602_SD03_META_LIST(remoteHandle, context);
      GXv_SdtB602_SD03_META_LIST3 = new SdtB602_SD03_META_LIST [1] ;
      GXv_int4 = new short [1] ;
      P005A4_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005A4_A260TBM41_CRF_ID = new short[1] ;
      P005A4_A259TBM41_STUDY_ID = new long[1] ;
      P005A4_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      P005A4_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P005A4_A263TBM41_DEL_FLG = new String[] {""} ;
      P005A4_n263TBM41_DEL_FLG = new boolean[] {false} ;
      P005A4_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      A263TBM41_DEL_FLG = "" ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      AV32W_TBM41_NCM_METADATA_ID = "" ;
      AV18W_EXIST_FLG = "" ;
      AV22W_META_ITEM = new SdtB602_SD03_META_LIST_META_DATAItem(remoteHandle, context);
      P005A5_A231TBM32_STUDY_ID = new long[1] ;
      P005A5_A232TBM32_CRF_ID = new short[1] ;
      P005A5_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005A5_A402TBM32_LIST_CD = new String[] {""} ;
      P005A5_n402TBM32_LIST_CD = new boolean[] {false} ;
      P005A5_A238TBM32_DEL_FLG = new String[] {""} ;
      P005A5_n238TBM32_DEL_FLG = new boolean[] {false} ;
      P005A5_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005A5_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A402TBM32_LIST_CD = "" ;
      A238TBM32_DEL_FLG = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      AV24W_MSG = "" ;
      AV31W_TBM26_INNER_VALUE_COL = new GxObjectCollection(String.class, "internal", "");
      P005A6_A446TBM26_STUDY_ID = new long[1] ;
      P005A6_A447TBM26_LIST_CD = new String[] {""} ;
      P005A6_A451TBM26_DEL_FLG = new String[] {""} ;
      P005A6_n451TBM26_DEL_FLG = new boolean[] {false} ;
      P005A6_A450TBM26_INNER_VALUE = new String[] {""} ;
      P005A6_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      P005A6_A448TBM26_LIST_ITEM_NO = new short[1] ;
      A447TBM26_LIST_CD = "" ;
      A451TBM26_DEL_FLG = "" ;
      A450TBM26_INNER_VALUE = "" ;
      AV25W_SELECT_CONTENT = "" ;
      AV26W_SELECT_CONTENT_COL = new GxObjectCollection(String.class, "internal", "");
      AV27W_STR = "" ;
      AV28W_STR_SUBSTR = "" ;
      AV19W_FLG = "" ;
      AV30W_TBM26_INNER_VALUE = "" ;
      GXv_char2 = new String [1] ;
      AV45Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b403_pc01_check__default(),
         new Object[] {
             new Object[] {
            P005A2_A113TAS01_DEL_FLG, P005A2_n113TAS01_DEL_FLG, P005A2_A54TAS01_DATA_KIND, P005A2_A19TAS01_ITEM_NM, P005A2_n19TAS01_ITEM_NM, P005A2_A151TAS01_CHAR_2, P005A2_n151TAS01_CHAR_2, P005A2_A55TAS01_ITEM_CD
            }
            , new Object[] {
            P005A3_A223TBM31_DEL_FLG, P005A3_n223TBM31_DEL_FLG, P005A3_A218TBM31_CRF_ID, P005A3_A217TBM31_STUDY_ID
            }
            , new Object[] {
            P005A4_A261TBM41_CRF_ITEM_GRP_CD, P005A4_A260TBM41_CRF_ID, P005A4_A259TBM41_STUDY_ID, P005A4_A262TBM41_NCM_METADATA_ID, P005A4_n262TBM41_NCM_METADATA_ID, P005A4_A263TBM41_DEL_FLG, P005A4_n263TBM41_DEL_FLG, P005A4_A378TBM41_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P005A5_A231TBM32_STUDY_ID, P005A5_A232TBM32_CRF_ID, P005A5_A233TBM32_CRF_ITEM_CD, P005A5_A402TBM32_LIST_CD, P005A5_n402TBM32_LIST_CD, P005A5_A238TBM32_DEL_FLG, P005A5_n238TBM32_DEL_FLG, P005A5_A235TBM32_CRF_ITEM_DIV, P005A5_n235TBM32_CRF_ITEM_DIV
            }
            , new Object[] {
            P005A6_A446TBM26_STUDY_ID, P005A6_A447TBM26_LIST_CD, P005A6_A451TBM26_DEL_FLG, P005A6_n451TBM26_DEL_FLG, P005A6_A450TBM26_INNER_VALUE, P005A6_n450TBM26_INNER_VALUE, P005A6_A448TBM26_LIST_ITEM_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV45Pgmname = "B403_PC01_CHECK" ;
      /* GeneXus formulas. */
      AV45Pgmname = "B403_PC01_CHECK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV16W_ERR_CD ;
   private byte AV37GXLvl69 ;
   private byte AV38GXLvl88 ;
   private byte AV40GXLvl107 ;
   private byte AV42GXLvl142 ;
   private short AV29W_SYS_CRFID ;
   private short A218TBM31_CRF_ID ;
   private short GXv_int4[] ;
   private short A260TBM41_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short AV15W_CNT ;
   private short A448TBM26_LIST_ITEM_NO ;
   private short AV14W_CHAR_POS ;
   private short Gx_err ;
   private int AV39GXV1 ;
   private int AV41GXV2 ;
   private int AV43GXV3 ;
   private int AV44GXV4 ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A217TBM31_STUDY_ID ;
   private long A259TBM41_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A446TBM26_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String AV45Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n113TAS01_DEL_FLG ;
   private boolean n19TAS01_ITEM_NM ;
   private boolean n151TAS01_CHAR_2 ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n238TBM32_DEL_FLG ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n451TBM26_DEL_FLG ;
   private boolean n450TBM26_INNER_VALUE ;
   private String AV13P_USER_ID ;
   private String AV11P_PWD ;
   private String AV17W_ERR_MSG ;
   private String AV33C_APP_ID ;
   private String AV8C_NUM ;
   private String AV10C_SEPARATOR ;
   private String A113TAS01_DEL_FLG ;
   private String A54TAS01_DATA_KIND ;
   private String A19TAS01_ITEM_NM ;
   private String A151TAS01_CHAR_2 ;
   private String A55TAS01_ITEM_CD ;
   private String A223TBM31_DEL_FLG ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A263TBM41_DEL_FLG ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String AV32W_TBM41_NCM_METADATA_ID ;
   private String AV18W_EXIST_FLG ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A402TBM32_LIST_CD ;
   private String A238TBM32_DEL_FLG ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String AV24W_MSG ;
   private String A447TBM26_LIST_CD ;
   private String A451TBM26_DEL_FLG ;
   private String A450TBM26_INNER_VALUE ;
   private String AV25W_SELECT_CONTENT ;
   private String AV27W_STR ;
   private String AV28W_STR_SUBSTR ;
   private String AV19W_FLG ;
   private String AV30W_TBM26_INNER_VALUE ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P005A2_A113TAS01_DEL_FLG ;
   private boolean[] P005A2_n113TAS01_DEL_FLG ;
   private String[] P005A2_A54TAS01_DATA_KIND ;
   private String[] P005A2_A19TAS01_ITEM_NM ;
   private boolean[] P005A2_n19TAS01_ITEM_NM ;
   private String[] P005A2_A151TAS01_CHAR_2 ;
   private boolean[] P005A2_n151TAS01_CHAR_2 ;
   private String[] P005A2_A55TAS01_ITEM_CD ;
   private String[] P005A3_A223TBM31_DEL_FLG ;
   private boolean[] P005A3_n223TBM31_DEL_FLG ;
   private short[] P005A3_A218TBM31_CRF_ID ;
   private long[] P005A3_A217TBM31_STUDY_ID ;
   private String[] P005A4_A261TBM41_CRF_ITEM_GRP_CD ;
   private short[] P005A4_A260TBM41_CRF_ID ;
   private long[] P005A4_A259TBM41_STUDY_ID ;
   private String[] P005A4_A262TBM41_NCM_METADATA_ID ;
   private boolean[] P005A4_n262TBM41_NCM_METADATA_ID ;
   private String[] P005A4_A263TBM41_DEL_FLG ;
   private boolean[] P005A4_n263TBM41_DEL_FLG ;
   private String[] P005A4_A378TBM41_CRF_ITEM_GRP_DIV ;
   private long[] P005A5_A231TBM32_STUDY_ID ;
   private short[] P005A5_A232TBM32_CRF_ID ;
   private String[] P005A5_A233TBM32_CRF_ITEM_CD ;
   private String[] P005A5_A402TBM32_LIST_CD ;
   private boolean[] P005A5_n402TBM32_LIST_CD ;
   private String[] P005A5_A238TBM32_DEL_FLG ;
   private boolean[] P005A5_n238TBM32_DEL_FLG ;
   private String[] P005A5_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005A5_n235TBM32_CRF_ITEM_DIV ;
   private long[] P005A6_A446TBM26_STUDY_ID ;
   private String[] P005A6_A447TBM26_LIST_CD ;
   private String[] P005A6_A451TBM26_DEL_FLG ;
   private boolean[] P005A6_n451TBM26_DEL_FLG ;
   private String[] P005A6_A450TBM26_INNER_VALUE ;
   private boolean[] P005A6_n450TBM26_INNER_VALUE ;
   private short[] P005A6_A448TBM26_LIST_ITEM_NO ;
   private GxObjectCollection AV21W_ITEM_DIV_LIST ;
   private GxObjectCollection AV31W_TBM26_INNER_VALUE_COL ;
   private GxObjectCollection AV26W_SELECT_CONTENT_COL ;
   private SdtB402_SD04_ITEM_DIV AV20W_ITEM_DIV ;
   private SdtB602_SD03_META_LIST AV23W_META_LIST ;
   private SdtB602_SD03_META_LIST GXv_SdtB602_SD03_META_LIST3[] ;
   private SdtB602_SD03_META_LIST_META_DATAItem AV22W_META_ITEM ;
}

final  class b403_pc01_check__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005A2", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_CHAR_2`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B06') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005A3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005A4", "SELECT `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRF_ITEM_GRP_DIV` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (`TBM41_NCM_METADATA_ID` <> '') AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005A5", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_LIST_CD`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_DIV` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005A6", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_DEL_FLG`, `TBM26_INNER_VALUE`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ?) AND (`TBM26_DEL_FLG` = '0') ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               break;
      }
   }

}

