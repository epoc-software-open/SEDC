/*
               File: B403_PC01_CHECK
        Description: 患者・適格性確認情報取込前チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:12.16
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
      b403_pc01_check.this.aP3 = aP3;
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
      /* Execute user subroutine: S111 */
      S111 ();
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
         A300TAS01_DEL_FLG = P005A2_A300TAS01_DEL_FLG[0] ;
         n300TAS01_DEL_FLG = P005A2_n300TAS01_DEL_FLG[0] ;
         A7TAS01_DATA_KIND = P005A2_A7TAS01_DATA_KIND[0] ;
         A9TAS01_ITEM_NM = P005A2_A9TAS01_ITEM_NM[0] ;
         n9TAS01_ITEM_NM = P005A2_n9TAS01_ITEM_NM[0] ;
         A337TAS01_CHAR_2 = P005A2_A337TAS01_CHAR_2[0] ;
         n337TAS01_CHAR_2 = P005A2_n337TAS01_CHAR_2[0] ;
         A8TAS01_ITEM_CD = P005A2_A8TAS01_ITEM_CD[0] ;
         if ( GxRegex.IsMatch(A337TAS01_CHAR_2,"^.1...1.*$") )
         {
            AV20W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
            AV20W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div( A9TAS01_ITEM_NM );
            AV20W_ITEM_DIV.setgxTv_SdtB402_SD04_ITEM_DIV_Use_confing( A337TAS01_CHAR_2 );
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
      if ( Gx_err != 0 )
      {
         AV37GXLvl69 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(1) != 101) )
      {
         A397TBM31_DEL_FLG = P005A3_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P005A3_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = P005A3_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P005A3_A68TBM31_STUDY_ID[0] ;
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
      if ( Gx_err != 0 )
      {
         AV38GXLvl88 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A22TBM41_CRF_ITEM_GRP_CD = P005A4_A22TBM41_CRF_ITEM_GRP_CD[0] ;
         A20TBM41_CRF_ID = P005A4_A20TBM41_CRF_ID[0] ;
         A19TBM41_STUDY_ID = P005A4_A19TBM41_STUDY_ID[0] ;
         A424TBM41_NCM_METADATA_ID = P005A4_A424TBM41_NCM_METADATA_ID[0] ;
         n424TBM41_NCM_METADATA_ID = P005A4_n424TBM41_NCM_METADATA_ID[0] ;
         A425TBM41_DEL_FLG = P005A4_A425TBM41_DEL_FLG[0] ;
         n425TBM41_DEL_FLG = P005A4_n425TBM41_DEL_FLG[0] ;
         A21TBM41_CRF_ITEM_GRP_DIV = P005A4_A21TBM41_CRF_ITEM_GRP_DIV[0] ;
         AV38GXLvl88 = (byte)(1) ;
         AV32W_TBM41_NCM_METADATA_ID = A424TBM41_NCM_METADATA_ID ;
         AV18W_EXIST_FLG = "0" ;
         AV39GXV1 = 1 ;
         while ( AV39GXV1 <= AV23W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().size() )
         {
            AV22W_META_ITEM = (SdtB602_SD03_META_LIST_META_DATAItem)((SdtB602_SD03_META_LIST_META_DATAItem)AV23W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().elementAt(-1+AV39GXV1));
            if ( GXutil.strcmp(GXutil.trim( GXutil.str( AV22W_META_ITEM.getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id(), 10, 0)), A424TBM41_NCM_METADATA_ID) == 0 )
            {
               AV18W_EXIST_FLG = "1" ;
               AV40GXLvl107 = (byte)(0) ;
               /* Using cursor P005A5 */
               pr_default.execute(3, new Object[] {new Long(A19TBM41_STUDY_ID), new Short(A20TBM41_CRF_ID), A22TBM41_CRF_ITEM_GRP_CD});
               if ( Gx_err != 0 )
               {
                  AV40GXLvl107 = (byte)(1) ;
               }
               while ( (pr_default.getStatus(3) != 101) )
               {
                  A70TBM32_STUDY_ID = P005A5_A70TBM32_STUDY_ID[0] ;
                  A71TBM32_CRF_ID = P005A5_A71TBM32_CRF_ID[0] ;
                  A72TBM32_CRF_ITEM_CD = P005A5_A72TBM32_CRF_ITEM_CD[0] ;
                  A525TBM32_LIST_CD = P005A5_A525TBM32_LIST_CD[0] ;
                  n525TBM32_LIST_CD = P005A5_n525TBM32_LIST_CD[0] ;
                  A75TBM32_DEL_FLG = P005A5_A75TBM32_DEL_FLG[0] ;
                  n75TBM32_DEL_FLG = P005A5_n75TBM32_DEL_FLG[0] ;
                  A74TBM32_CRF_ITEM_DIV = P005A5_A74TBM32_CRF_ITEM_DIV[0] ;
                  n74TBM32_CRF_ITEM_DIV = P005A5_n74TBM32_CRF_ITEM_DIV[0] ;
                  AV40GXLvl107 = (byte)(1) ;
                  AV41GXV2 = 1 ;
                  while ( AV41GXV2 <= AV21W_ITEM_DIV_LIST.size() )
                  {
                     AV20W_ITEM_DIV = (SdtB402_SD04_ITEM_DIV)((SdtB402_SD04_ITEM_DIV)AV21W_ITEM_DIV_LIST.elementAt(-1+AV41GXV2));
                     if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, AV20W_ITEM_DIV.getgxTv_SdtB402_SD04_ITEM_DIV_Crf_imte_div()) == 0 )
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
                  if ( ! (GXutil.strcmp("", A525TBM32_LIST_CD)==0) || ( GXutil.strcmp(GXutil.trim( A525TBM32_LIST_CD), "") != 0 ) )
                  {
                     AV15W_CNT = (short)(0) ;
                     AV31W_TBM26_INNER_VALUE_COL.clear();
                     AV42GXLvl142 = (byte)(0) ;
                     /* Using cursor P005A6 */
                     pr_default.execute(4, new Object[] {new Long(A70TBM32_STUDY_ID), new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD});
                     if ( Gx_err != 0 )
                     {
                        AV42GXLvl142 = (byte)(1) ;
                     }
                     while ( (pr_default.getStatus(4) != 101) )
                     {
                        A25TBM26_STUDY_ID = P005A6_A25TBM26_STUDY_ID[0] ;
                        A26TBM26_LIST_CD = P005A6_A26TBM26_LIST_CD[0] ;
                        A563TBM26_DEL_FLG = P005A6_A563TBM26_DEL_FLG[0] ;
                        n563TBM26_DEL_FLG = P005A6_n563TBM26_DEL_FLG[0] ;
                        A562TBM26_INNER_VALUE = P005A6_A562TBM26_INNER_VALUE[0] ;
                        n562TBM26_INNER_VALUE = P005A6_n562TBM26_INNER_VALUE[0] ;
                        A27TBM26_LIST_ITEM_NO = P005A6_A27TBM26_LIST_ITEM_NO[0] ;
                        AV42GXLvl142 = (byte)(1) ;
                        AV15W_CNT = (short)(AV15W_CNT+1) ;
                        AV31W_TBM26_INNER_VALUE_COL.add(A562TBM26_INNER_VALUE, 0);
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

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV45Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc01_check");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
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
      AV17W_ERR_MSG = "" ;
      AV33C_APP_ID = "" ;
      AV8C_NUM = "" ;
      AV10C_SEPARATOR = "" ;
      AV21W_ITEM_DIV_LIST = new GxObjectCollection(SdtB402_SD04_ITEM_DIV.class, "B402_SD04_ITEM_DIV", "tablet-EDC_GXXEV3U3", remoteHandle);
      scmdbuf = "" ;
      P005A2_A300TAS01_DEL_FLG = new String[] {""} ;
      P005A2_n300TAS01_DEL_FLG = new boolean[] {false} ;
      P005A2_A7TAS01_DATA_KIND = new String[] {""} ;
      P005A2_A9TAS01_ITEM_NM = new String[] {""} ;
      P005A2_n9TAS01_ITEM_NM = new boolean[] {false} ;
      P005A2_A337TAS01_CHAR_2 = new String[] {""} ;
      P005A2_n337TAS01_CHAR_2 = new boolean[] {false} ;
      P005A2_A8TAS01_ITEM_CD = new String[] {""} ;
      A300TAS01_DEL_FLG = "" ;
      A7TAS01_DATA_KIND = "" ;
      A9TAS01_ITEM_NM = "" ;
      A337TAS01_CHAR_2 = "" ;
      A8TAS01_ITEM_CD = "" ;
      AV20W_ITEM_DIV = new SdtB402_SD04_ITEM_DIV(remoteHandle, context);
      P005A3_A397TBM31_DEL_FLG = new String[] {""} ;
      P005A3_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P005A3_A69TBM31_CRF_ID = new short[1] ;
      P005A3_A68TBM31_STUDY_ID = new long[1] ;
      A397TBM31_DEL_FLG = "" ;
      AV23W_META_LIST = new SdtB602_SD03_META_LIST(remoteHandle, context);
      GXv_SdtB602_SD03_META_LIST3 = new SdtB602_SD03_META_LIST [1] ;
      GXv_int4 = new short [1] ;
      P005A4_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005A4_A20TBM41_CRF_ID = new short[1] ;
      P005A4_A19TBM41_STUDY_ID = new long[1] ;
      P005A4_A424TBM41_NCM_METADATA_ID = new String[] {""} ;
      P005A4_n424TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P005A4_A425TBM41_DEL_FLG = new String[] {""} ;
      P005A4_n425TBM41_DEL_FLG = new boolean[] {false} ;
      P005A4_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A22TBM41_CRF_ITEM_GRP_CD = "" ;
      A424TBM41_NCM_METADATA_ID = "" ;
      A425TBM41_DEL_FLG = "" ;
      A21TBM41_CRF_ITEM_GRP_DIV = "" ;
      AV32W_TBM41_NCM_METADATA_ID = "" ;
      AV18W_EXIST_FLG = "" ;
      AV22W_META_ITEM = new SdtB602_SD03_META_LIST_META_DATAItem(remoteHandle, context);
      P005A5_A70TBM32_STUDY_ID = new long[1] ;
      P005A5_A71TBM32_CRF_ID = new short[1] ;
      P005A5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005A5_A525TBM32_LIST_CD = new String[] {""} ;
      P005A5_n525TBM32_LIST_CD = new boolean[] {false} ;
      P005A5_A75TBM32_DEL_FLG = new String[] {""} ;
      P005A5_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P005A5_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005A5_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A525TBM32_LIST_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      AV24W_MSG = "" ;
      AV31W_TBM26_INNER_VALUE_COL = new GxObjectCollection(String.class, "internal", "");
      P005A6_A25TBM26_STUDY_ID = new long[1] ;
      P005A6_A26TBM26_LIST_CD = new String[] {""} ;
      P005A6_A563TBM26_DEL_FLG = new String[] {""} ;
      P005A6_n563TBM26_DEL_FLG = new boolean[] {false} ;
      P005A6_A562TBM26_INNER_VALUE = new String[] {""} ;
      P005A6_n562TBM26_INNER_VALUE = new boolean[] {false} ;
      P005A6_A27TBM26_LIST_ITEM_NO = new short[1] ;
      A26TBM26_LIST_CD = "" ;
      A563TBM26_DEL_FLG = "" ;
      A562TBM26_INNER_VALUE = "" ;
      AV25W_SELECT_CONTENT = "" ;
      AV26W_SELECT_CONTENT_COL = new GxObjectCollection(String.class, "internal", "");
      AV27W_STR = "" ;
      AV28W_STR_SUBSTR = "" ;
      AV19W_FLG = "" ;
      AV30W_TBM26_INNER_VALUE = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV45Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b403_pc01_check__default(),
         new Object[] {
             new Object[] {
            P005A2_A300TAS01_DEL_FLG, P005A2_n300TAS01_DEL_FLG, P005A2_A7TAS01_DATA_KIND, P005A2_A9TAS01_ITEM_NM, P005A2_n9TAS01_ITEM_NM, P005A2_A337TAS01_CHAR_2, P005A2_n337TAS01_CHAR_2, P005A2_A8TAS01_ITEM_CD
            }
            , new Object[] {
            P005A3_A397TBM31_DEL_FLG, P005A3_n397TBM31_DEL_FLG, P005A3_A69TBM31_CRF_ID, P005A3_A68TBM31_STUDY_ID
            }
            , new Object[] {
            P005A4_A22TBM41_CRF_ITEM_GRP_CD, P005A4_A20TBM41_CRF_ID, P005A4_A19TBM41_STUDY_ID, P005A4_A424TBM41_NCM_METADATA_ID, P005A4_n424TBM41_NCM_METADATA_ID, P005A4_A425TBM41_DEL_FLG, P005A4_n425TBM41_DEL_FLG, P005A4_A21TBM41_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P005A5_A70TBM32_STUDY_ID, P005A5_A71TBM32_CRF_ID, P005A5_A72TBM32_CRF_ITEM_CD, P005A5_A525TBM32_LIST_CD, P005A5_n525TBM32_LIST_CD, P005A5_A75TBM32_DEL_FLG, P005A5_n75TBM32_DEL_FLG, P005A5_A74TBM32_CRF_ITEM_DIV, P005A5_n74TBM32_CRF_ITEM_DIV
            }
            , new Object[] {
            P005A6_A25TBM26_STUDY_ID, P005A6_A26TBM26_LIST_CD, P005A6_A563TBM26_DEL_FLG, P005A6_n563TBM26_DEL_FLG, P005A6_A562TBM26_INNER_VALUE, P005A6_n562TBM26_INNER_VALUE, P005A6_A27TBM26_LIST_ITEM_NO
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
   private short Gx_err ;
   private short A69TBM31_CRF_ID ;
   private short GXv_int4[] ;
   private short A20TBM41_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short AV15W_CNT ;
   private short A27TBM26_LIST_ITEM_NO ;
   private short AV14W_CHAR_POS ;
   private int AV39GXV1 ;
   private int AV41GXV2 ;
   private int AV43GXV3 ;
   private int AV44GXV4 ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A19TBM41_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A25TBM26_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV45Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n300TAS01_DEL_FLG ;
   private boolean n9TAS01_ITEM_NM ;
   private boolean n337TAS01_CHAR_2 ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n563TBM26_DEL_FLG ;
   private boolean n562TBM26_INNER_VALUE ;
   private String AV13P_USER_ID ;
   private String AV11P_PWD ;
   private String AV17W_ERR_MSG ;
   private String AV33C_APP_ID ;
   private String AV8C_NUM ;
   private String AV10C_SEPARATOR ;
   private String A300TAS01_DEL_FLG ;
   private String A7TAS01_DATA_KIND ;
   private String A9TAS01_ITEM_NM ;
   private String A337TAS01_CHAR_2 ;
   private String A8TAS01_ITEM_CD ;
   private String A397TBM31_DEL_FLG ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A425TBM41_DEL_FLG ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String AV32W_TBM41_NCM_METADATA_ID ;
   private String AV18W_EXIST_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A525TBM32_LIST_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String AV24W_MSG ;
   private String A26TBM26_LIST_CD ;
   private String A563TBM26_DEL_FLG ;
   private String A562TBM26_INNER_VALUE ;
   private String AV25W_SELECT_CONTENT ;
   private String AV27W_STR ;
   private String AV28W_STR_SUBSTR ;
   private String AV19W_FLG ;
   private String AV30W_TBM26_INNER_VALUE ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P005A2_A300TAS01_DEL_FLG ;
   private boolean[] P005A2_n300TAS01_DEL_FLG ;
   private String[] P005A2_A7TAS01_DATA_KIND ;
   private String[] P005A2_A9TAS01_ITEM_NM ;
   private boolean[] P005A2_n9TAS01_ITEM_NM ;
   private String[] P005A2_A337TAS01_CHAR_2 ;
   private boolean[] P005A2_n337TAS01_CHAR_2 ;
   private String[] P005A2_A8TAS01_ITEM_CD ;
   private String[] P005A3_A397TBM31_DEL_FLG ;
   private boolean[] P005A3_n397TBM31_DEL_FLG ;
   private short[] P005A3_A69TBM31_CRF_ID ;
   private long[] P005A3_A68TBM31_STUDY_ID ;
   private String[] P005A4_A22TBM41_CRF_ITEM_GRP_CD ;
   private short[] P005A4_A20TBM41_CRF_ID ;
   private long[] P005A4_A19TBM41_STUDY_ID ;
   private String[] P005A4_A424TBM41_NCM_METADATA_ID ;
   private boolean[] P005A4_n424TBM41_NCM_METADATA_ID ;
   private String[] P005A4_A425TBM41_DEL_FLG ;
   private boolean[] P005A4_n425TBM41_DEL_FLG ;
   private String[] P005A4_A21TBM41_CRF_ITEM_GRP_DIV ;
   private long[] P005A5_A70TBM32_STUDY_ID ;
   private short[] P005A5_A71TBM32_CRF_ID ;
   private String[] P005A5_A72TBM32_CRF_ITEM_CD ;
   private String[] P005A5_A525TBM32_LIST_CD ;
   private boolean[] P005A5_n525TBM32_LIST_CD ;
   private String[] P005A5_A75TBM32_DEL_FLG ;
   private boolean[] P005A5_n75TBM32_DEL_FLG ;
   private String[] P005A5_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P005A5_n74TBM32_CRF_ITEM_DIV ;
   private long[] P005A6_A25TBM26_STUDY_ID ;
   private String[] P005A6_A26TBM26_LIST_CD ;
   private String[] P005A6_A563TBM26_DEL_FLG ;
   private boolean[] P005A6_n563TBM26_DEL_FLG ;
   private String[] P005A6_A562TBM26_INNER_VALUE ;
   private boolean[] P005A6_n562TBM26_INNER_VALUE ;
   private short[] P005A6_A27TBM26_LIST_ITEM_NO ;
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
          new ForEachCursor("P005A2", "SELECT `TAS01_DEL_FLG`, `TAS01_DATA_KIND`, `TAS01_ITEM_NM`, `TAS01_CHAR_2`, `TAS01_ITEM_CD` FROM `TAS01_CDNM` WHERE (`TAS01_DATA_KIND` = 'B06') AND (`TAS01_DEL_FLG` = '0') ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005A3", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005A4", "SELECT `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRF_ITEM_GRP_DIV` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (`TBM41_NCM_METADATA_ID` <> '') AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005A5", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_LIST_CD`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_DIV` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005A6", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_DEL_FLG`, `TBM26_INNER_VALUE`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ?) AND (`TBM26_DEL_FLG` = '0') ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               return;
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
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               return;
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
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
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
               return;
      }
   }

}

