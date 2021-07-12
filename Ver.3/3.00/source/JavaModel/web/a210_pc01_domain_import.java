/*
               File: A210_PC01_DOMAIN_IMPORT
        Description: ドメインマスタCSVインポート
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:24.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a210_pc01_domain_import extends GXProcedure
{
   public a210_pc01_domain_import( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a210_pc01_domain_import.class ), "" );
   }

   public a210_pc01_domain_import( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         String aP1 ,
                                         short[] aP2 )
   {
      a210_pc01_domain_import.this.AV11P_FILE_NAME = aP0;
      a210_pc01_domain_import.this.AV12P_MOJI_CD = aP1;
      a210_pc01_domain_import.this.aP2 = aP2;
      a210_pc01_domain_import.this.aP3 = aP3;
      a210_pc01_domain_import.this.aP3 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short[] aP2 ,
                        GxObjectCollection[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short[] aP2 ,
                             GxObjectCollection[] aP3 )
   {
      a210_pc01_domain_import.this.AV11P_FILE_NAME = aP0;
      a210_pc01_domain_import.this.AV12P_MOJI_CD = aP1;
      a210_pc01_domain_import.this.aP2 = aP2;
      a210_pc01_domain_import.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "A210" ;
      /* Execute user subroutine: S191 */
      S191 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV37W_RTN_CD = (short)(0) ;
      AV38W_RTN_MSG.clear();
      if ( AV37W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV37W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV37W_RTN_CD == 0 )
      {
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
      /* 'SUB_SETTING' Routine */
      AV16W_CNT = 0 ;
      AV9BC_CDISC_DOMAIN_C.clear();
      /* Optimized DELETE. */
      cmdBuffer = " LOCK TABLES `TBM02_CDISC_DOMAIN` WRITE ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      cmdBuffer = " UNLOCK TABLES ";
      ExecuteDirectSQL.execute(context, remoteHandle, "DEFAULT", cmdBuffer) ;
      Gx_ope = "Delete" ;
      Gx_etb = "TBM02_CDISC_DOMAIN" ;
      /* Using cursor P006S2 */
      pr_default.execute(0);
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
      /* End optimized DELETE. */
      AV26W_FILE.setSource( AV11P_FILE_NAME );
      if ( ! AV26W_FILE.exists() || ( AV26W_FILE.getLength() == 0 ) )
      {
         AV37W_RTN_CD = (short)(1) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00011", "", "", "", "", "", GXv_char2) ;
         a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV38W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
      GXt_char1 = AV40W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "015", GXv_char2) ;
      a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
      AV40W_SYS_VALUE = GXt_char1 ;
      if ( GxRegex.IsMatch(AV40W_SYS_VALUE,"^\\d+$") )
      {
         AV33W_MAX_ERROR_COUNT = GXutil.lval( AV40W_SYS_VALUE) ;
      }
      else
      {
         AV33W_MAX_ERROR_COUNT = 100 ;
      }
   }

   public void S121( )
   {
      /* 'SUB_READ_FILE' Routine */
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfropen( AV11P_FILE_NAME, 4096, "", "", AV12P_MOJI_CD) ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrnext( ) ;
      GXv_char2[0] = AV18W_CSV_DATA ;
      GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
      AV18W_CSV_DATA = GXv_char2[0] ;
      AV27W_FILE_HANDLE = GXt_int3 ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
      {
         AV16W_CNT = (long)(AV16W_CNT+1) ;
         AV31W_LINE_MSG = GXutil.trim( GXutil.str( AV16W_CNT, 10, 0)) + "行目：" ;
         GXv_char2[0] = AV18W_CSV_DATA ;
         GXt_int3 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char2, (short)(1000000)) ;
         AV18W_CSV_DATA = GXv_char2[0] ;
         AV27W_FILE_HANDLE = GXt_int3 ;
         if ( AV27W_FILE_HANDLE == -5 )
         {
            AV37W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "CSV", "", "", "", "", GXv_char2) ;
            a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = AV31W_LINE_MSG + GXt_char1 ;
            AV38W_RTN_MSG.add(AV34W_MSG, 0);
         }
         else
         {
            /* Execute user subroutine: S131 */
            S131 ();
            if (returnInSub) return;
         }
         if ( AV27W_FILE_HANDLE == 0 )
         {
            GXv_objcol_svchar4[0] = AV36W_ROW_STR ;
            GXv_int5[0] = AV21W_ERR_CD ;
            GXv_char2[0] = AV34W_MSG ;
            new b807_pc03_csv_col_parse(remoteHandle, context).execute( AV18W_CSV_DATA, 7, "CSV", GXv_objcol_svchar4, GXv_int5, GXv_char2) ;
            AV36W_ROW_STR = GXv_objcol_svchar4[0] ;
            a210_pc01_domain_import.this.AV21W_ERR_CD = GXv_int5[0] ;
            a210_pc01_domain_import.this.AV34W_MSG = GXv_char2[0] ;
            if ( AV21W_ERR_CD != 0 )
            {
               AV37W_RTN_CD = (short)(1) ;
               AV34W_MSG = AV31W_LINE_MSG + AV34W_MSG ;
               AV38W_RTN_MSG.add(AV34W_MSG, 0);
            }
            else
            {
               AV17W_CSV_COL.clear();
               AV29W_ITEM_CNT = (short)(1) ;
               while ( AV29W_ITEM_CNT <= 7 )
               {
                  AV39W_STR = (String)AV36W_ROW_STR.elementAt(-1+AV29W_ITEM_CNT) ;
                  AV30W_LEN = GXutil.len( AV39W_STR) ;
                  if ( AV30W_LEN > 1 )
                  {
                     if ( ( GXutil.strcmp(GXutil.substring( AV39W_STR, 1, 1), "\"") == 0 ) && ( GXutil.strcmp(GXutil.substring( AV39W_STR, (int)(AV30W_LEN), 1), "\"") == 0 ) )
                     {
                        AV30W_LEN = (long)(AV30W_LEN-2) ;
                        AV39W_STR = GXutil.substring( AV39W_STR, 2, (int)(AV30W_LEN)) ;
                     }
                  }
                  AV17W_CSV_COL.add(AV39W_STR, 0);
                  AV29W_ITEM_CNT = (short)(AV29W_ITEM_CNT+1) ;
               }
               AV36W_ROW_STR.clear();
               /* Execute user subroutine: S141 */
               S141 ();
               if (returnInSub) return;
            }
         }
         if ( AV38W_RTN_MSG.size() > AV33W_MAX_ERROR_COUNT )
         {
            AV37W_RTN_CD = (short)(1) ;
            GXt_char1 = AV34W_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00044", GXutil.trim( GXutil.str( AV33W_MAX_ERROR_COUNT, 10, 0)), "", "", "", "", GXv_char2) ;
            a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
            AV34W_MSG = GXt_char1 ;
            AV38W_RTN_MSG.add(AV34W_MSG, 0);
            if (true) break;
         }
      }
      AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
   }

   public void S151( )
   {
      /* 'SUB_REG' Routine */
      if ( AV37W_RTN_CD == 0 )
      {
         AV44GXV1 = 1 ;
         while ( AV44GXV1 <= AV9BC_CDISC_DOMAIN_C.size() )
         {
            AV8BC_CDISC_DOMAIN = (SdtTBM02_CDISC_DOMAIN)((SdtTBM02_CDISC_DOMAIN)AV9BC_CDISC_DOMAIN_C.elementAt(-1+AV44GXV1));
            AV8BC_CDISC_DOMAIN.Save();
            if ( AV8BC_CDISC_DOMAIN.Success() )
            {
            }
            else
            {
               AV37W_RTN_CD = (short)(1) ;
               GXt_char1 = AV34W_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV8BC_CDISC_DOMAIN.GetMessages(), GXv_char2) ;
               a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
               AV34W_MSG = GXt_char1 ;
               if ( (GXutil.strcmp("", AV34W_MSG)==0) )
               {
                  GXt_char1 = AV34W_MSG ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AX00107", "", "", "", "", "", GXv_char2) ;
                  a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
                  AV34W_MSG = GXt_char1 ;
               }
               AV38W_RTN_MSG.add(AV34W_MSG, 0);
               if (true) break;
            }
            AV44GXV1 = (int)(AV44GXV1+1) ;
         }
      }
   }

   public void S131( )
   {
      /* 'SUB_FILE_HANDLE_CHECK' Routine */
      if ( AV27W_FILE_HANDLE != 0 )
      {
         AV37W_RTN_CD = (short)(1) ;
         AV27W_FILE_HANDLE = context.getSessionInstances().getDelimitedFiles().dfrclose( ) ;
         GXt_char1 = AV34W_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
         a210_pc01_domain_import.this.GXt_char1 = GXv_char2[0] ;
         AV34W_MSG = GXt_char1 ;
         AV38W_RTN_MSG.add(AV34W_MSG, 0);
         returnInSub = true;
         if (true) return;
      }
   }

   public void S141( )
   {
      /* 'SUB_DATA_CHECK' Routine */
      /* Execute user subroutine: S161 */
      S161 ();
      if (returnInSub) return;
      if ( AV37W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S171 */
         S171 ();
         if (returnInSub) return;
      }
   }

   public void S161( )
   {
      /* 'SUB_ATTRIBUTE_CHK' Routine */
      AV13W_A_CHK_INFO_SDT.clear();
      /* Execute user subroutine: S181 */
      S181 ();
      if (returnInSub) return;
      GXv_objcol_svchar4[0] = AV13W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_svchar4) ;
      AV13W_A_CHK_INFO_SDT = GXv_objcol_svchar4[0] ;
      AV45GXV2 = 1 ;
      while ( AV45GXV2 <= AV13W_A_CHK_INFO_SDT.size() )
      {
         AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV13W_A_CHK_INFO_SDT.elementAt(-1+AV45GXV2));
         if ( AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV37W_RTN_CD = (short)(1) ;
            AV34W_MSG = AV31W_LINE_MSG + AV14W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() ;
            AV38W_RTN_MSG.add(AV34W_MSG, 0);
         }
         AV45GXV2 = (int)(AV45GXV2+1) ;
      }
   }

   public void S181( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメインコード"+GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+1)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+1)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM_UD_HF" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(16) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half( (byte)(1) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン英語名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+2)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイン日本語名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+3)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ドメイングループ名" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+4)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(50) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "備考" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+5)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1000) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "表示順" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+6)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_NUM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(5) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
      AV14W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "削除フラグ" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXutil.trim( (String)AV17W_CSV_COL.elementAt(-1+7)) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_NUM" );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
      AV14W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(1) );
      AV13W_A_CHK_INFO_SDT.add(AV14W_A_CHK_INFO_SDT_ITEM, 0);
   }

   public void S171( )
   {
      /* 'SUB_SET_DATA' Routine */
      AV8BC_CDISC_DOMAIN = (SdtTBM02_CDISC_DOMAIN)new SdtTBM02_CDISC_DOMAIN( remoteHandle, context);
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_cd( (String)AV17W_CSV_COL.elementAt(-1+1) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_enm( (String)AV17W_CSV_COL.elementAt(-1+2) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_jnm( (String)AV17W_CSV_COL.elementAt(-1+3) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_dom_grp_nm( (String)AV17W_CSV_COL.elementAt(-1+4) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_note( (String)AV17W_CSV_COL.elementAt(-1+5) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_order( (int)(GXutil.lval( (String)AV17W_CSV_COL.elementAt(-1+6))) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_del_flg( (String)AV17W_CSV_COL.elementAt(-1+7) );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_crt_prog_nm( AV46Pgmname );
      AV8BC_CDISC_DOMAIN.setgxTv_SdtTBM02_CDISC_DOMAIN_Tbm02_upd_prog_nm( AV46Pgmname );
      AV9BC_CDISC_DOMAIN_C.add(AV8BC_CDISC_DOMAIN, 0);
   }

   public void S191( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT6[0] = AV15W_A_LOGIN_SDT;
      GXv_char2[0] = AV23W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT6, GXv_char2) ;
      AV15W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT6[0] ;
      a210_pc01_domain_import.this.AV23W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV23W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S201( )
   {
      /* 'SUB_ERROR' Routine */
      AV25W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV10C_APP_ID );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV35W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_FILE_NAME" );
      AV35W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_FILE_NAME );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV35W_PARMS_ITEM, 0);
      AV34W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV25W_EXTRA_INFO;
      GXv_int5[0] = AV21W_ERR_CD ;
      GXv_char2[0] = AV22W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV46Pgmname, (short)(0), AV34W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int5, GXv_char2) ;
      AV25W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      a210_pc01_domain_import.this.AV21W_ERR_CD = GXv_int5[0] ;
      a210_pc01_domain_import.this.AV22W_ERR_MSG = GXv_char2[0] ;
      AV38W_RTN_MSG.add(AV22W_ERR_MSG, 0);
      Application.rollback(context, remoteHandle, "DEFAULT", "a210_pc01_domain_import");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = a210_pc01_domain_import.this.AV37W_RTN_CD;
      this.aP3[0] = a210_pc01_domain_import.this.AV38W_RTN_MSG;
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
                  /* Execute user subroutine: S201 */
                  S201 ();
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
      AV38W_RTN_MSG = new GxObjectCollection(String.class, "internal", "");
      AV10C_APP_ID = "" ;
      AV9BC_CDISC_DOMAIN_C = new GxObjectCollection(SdtTBM02_CDISC_DOMAIN.class, "TBM02_CDISC_DOMAIN", "tablet-EDC_GXXEV3U3", remoteHandle);
      cmdBuffer = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV26W_FILE = new com.genexus.util.GXFile();
      AV34W_MSG = "" ;
      AV40W_SYS_VALUE = "" ;
      AV18W_CSV_DATA = "" ;
      AV31W_LINE_MSG = "" ;
      AV36W_ROW_STR = new GxObjectCollection(String.class, "internal", "");
      AV17W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      AV39W_STR = "" ;
      AV8BC_CDISC_DOMAIN = new SdtTBM02_CDISC_DOMAIN(remoteHandle);
      GXt_char1 = "" ;
      AV13W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_svchar4 = new GxObjectCollection [1] ;
      AV14W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV46Pgmname = "" ;
      AV15W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT6 = new SdtA_LOGIN_SDT [1] ;
      AV23W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV25W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV35W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV22W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a210_pc01_domain_import__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV46Pgmname = "A210_PC01_DOMAIN_IMPORT" ;
      /* GeneXus formulas. */
      AV46Pgmname = "A210_PC01_DOMAIN_IMPORT" ;
      Gx_err = (short)(0) ;
   }

   private short AV37W_RTN_CD ;
   private short AV27W_FILE_HANDLE ;
   private short GXt_int3 ;
   private short AV21W_ERR_CD ;
   private short AV29W_ITEM_CNT ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int AV44GXV1 ;
   private int AV45GXV2 ;
   private int GXActiveErrHndl ;
   private long AV16W_CNT ;
   private long AV33W_MAX_ERROR_COUNT ;
   private long AV30W_LEN ;
   private String cmdBuffer ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String AV46Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV11P_FILE_NAME ;
   private String AV12P_MOJI_CD ;
   private String AV10C_APP_ID ;
   private String AV34W_MSG ;
   private String AV40W_SYS_VALUE ;
   private String AV18W_CSV_DATA ;
   private String AV31W_LINE_MSG ;
   private String AV39W_STR ;
   private String AV23W_ERRCD ;
   private String AV22W_ERR_MSG ;
   private com.genexus.util.GXFile AV26W_FILE ;
   private short[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV38W_RTN_MSG ;
   private GxObjectCollection AV9BC_CDISC_DOMAIN_C ;
   private GxObjectCollection AV36W_ROW_STR ;
   private GxObjectCollection AV17W_CSV_COL ;
   private GxObjectCollection AV13W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_svchar4[] ;
   private SdtTBM02_CDISC_DOMAIN AV8BC_CDISC_DOMAIN ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV14W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV15W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT6[] ;
   private SdtB808_SD01_EXTRA_INFO AV25W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV35W_PARMS_ITEM ;
}

final  class a210_pc01_domain_import__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P006S2", "DELETE FROM `TBM02_CDISC_DOMAIN` ", GX_NOMASK + GX_MASKLOOPLOCK)
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
      }
   }

}

