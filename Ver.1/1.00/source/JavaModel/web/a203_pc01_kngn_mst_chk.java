/*
               File: A203_PC01_KNGN_MST_CHK
        Description: 権限パターンマスタ入力チェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:40.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a203_pc01_kngn_mst_chk extends GXProcedure
{
   public a203_pc01_kngn_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a203_pc01_kngn_mst_chk.class ), "" );
   }

   public a203_pc01_kngn_mst_chk( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTAM04_KNGN aP0 ,
                                         GxObjectCollection[] aP1 )
   {
      a203_pc01_kngn_mst_chk.this.AV13P_BC_TAM04_KNGN = aP0;
      a203_pc01_kngn_mst_chk.this.aP2 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( SdtTAM04_KNGN aP0 ,
                        GxObjectCollection[] aP1 ,
                        GxObjectCollection[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( SdtTAM04_KNGN aP0 ,
                             GxObjectCollection[] aP1 ,
                             GxObjectCollection[] aP2 )
   {
      a203_pc01_kngn_mst_chk.this.AV13P_BC_TAM04_KNGN = aP0;
      a203_pc01_kngn_mst_chk.this.aP1 = aP1;
      a203_pc01_kngn_mst_chk.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM020_APP_ID = "A203" ;
      /* Execute user subroutine: S15130 */
      S15130 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_A_CHK_INFO_SDT.clear();
      AV11P_A_CHK_RESULT_SDT.clear();
      AV12P_A_RESULT_MSG_SDT.clear();
      AV22W_FOCUS_FLG = true ;
      /* Execute user subroutine: S1172 */
      S1172 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] = AV14W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1) ;
      AV14W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] ;
      AV27GXV1 = 1 ;
      while ( AV27GXV1 <= AV14W_A_CHK_INFO_SDT.size() )
      {
         AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV14W_A_CHK_INFO_SDT.elementAt(-1+AV27GXV1));
         if ( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV16W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV16W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV22W_FOCUS_FLG );
            AV11P_A_CHK_RESULT_SDT.add(AV16W_A_CHK_RESULT_SDT_ITEM, 0);
            AV18W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV18W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV15W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV12P_A_RESULT_MSG_SDT.add(AV18W_A_RESULT_MSG_SDT_ITEM, 0);
            AV22W_FOCUS_FLG = false ;
         }
         AV27GXV1 = (int)(AV27GXV1+1) ;
      }
      /* Execute user subroutine: S13116 */
      S13116 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S14123 */
      S14123 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S1172( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV19W_CHK_NO = (short)(1) ;
      while ( AV19W_CHK_NO <= 4 )
      {
         AV15W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
         if ( AV19W_CHK_NO == 1 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM04_KNGN_PTN_KBN" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "権限パターンコード" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_cd() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(2) );
         }
         else if ( AV19W_CHK_NO == 2 )
         {
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM04_KNGN_PTN_NM" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "権限パターン名" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_TAM04_KNGN.getgxTv_SdtTAM04_KNGN_Tam04_auth_nm() );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            AV15W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(40) );
         }
         AV14W_A_CHK_INFO_SDT.add(AV15W_A_CHK_INFO_SDT_ITEM, 0);
         AV19W_CHK_NO = (short)(AV19W_CHK_NO+1) ;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'SUB_CHK_INFO_DTLS' Routine */
   }

   public void S13116( )
   {
      /* 'SUB_MSTR_CHK' Routine */
   }

   public void S14123( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
   }

   public void S15130( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT2[0] = AV17W_A_LOGIN_SDT;
      GXv_char3[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT2, GXv_char3) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT2[0] ;
      a203_pc01_kngn_mst_chk.this.AV21W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S16148( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = a203_pc01_kngn_mst_chk.this.AV11P_A_CHK_RESULT_SDT;
      this.aP2[0] = a203_pc01_kngn_mst_chk.this.AV12P_A_RESULT_MSG_SDT;
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
                  /* Execute user subroutine: S16148 */
                  S16148 ();
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
      AV11P_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV12P_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV10C_TAM020_APP_ID = "" ;
      AV14W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1 = new GxObjectCollection [1] ;
      AV15W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV16W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV18W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT2 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV28Pgmname = "" ;
      GXt_char4 = "" ;
      Gx_emsg = "" ;
      AV28Pgmname = "A203_PC01_KNGN_MST_CHK" ;
      /* GeneXus formulas. */
      AV28Pgmname = "A203_PC01_KNGN_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private short AV19W_CHK_NO ;
   private short Gx_err ;
   private int AV27GXV1 ;
   private int GXActiveErrHndl ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV28Pgmname ;
   private String GXt_char4 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV22W_FOCUS_FLG ;
   private String AV10C_TAM020_APP_ID ;
   private String AV21W_ERRCD ;
   private GxObjectCollection[] aP1 ;
   private GxObjectCollection[] aP2 ;
   private GxObjectCollection AV11P_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV12P_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV14W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV16W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV18W_A_RESULT_MSG_SDT_ITEM ;
   private SdtTAM04_KNGN AV13P_BC_TAM04_KNGN ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV15W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT2[] ;
}

