/*
               File: A207_PC01_USER_MST_CHK
        Description: ユーザーマスタ入力チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:47.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a207_pc01_user_mst_chk extends GXProcedure
{
   public a207_pc01_user_mst_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a207_pc01_user_mst_chk.class ), "" );
   }

   public a207_pc01_user_mst_chk( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( SdtTAM07_USER aP0 ,
                                         String aP1 ,
                                         GxObjectCollection[] aP2 )
   {
      a207_pc01_user_mst_chk.this.AV13P_BC_USER_MST = aP0;
      a207_pc01_user_mst_chk.this.AV14P_TAM07_PWD = aP1;
      a207_pc01_user_mst_chk.this.aP2 = aP2;
      a207_pc01_user_mst_chk.this.aP3 = aP3;
      a207_pc01_user_mst_chk.this.aP3 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( SdtTAM07_USER aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        GxObjectCollection[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( SdtTAM07_USER aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             GxObjectCollection[] aP3 )
   {
      a207_pc01_user_mst_chk.this.AV13P_BC_USER_MST = aP0;
      a207_pc01_user_mst_chk.this.AV14P_TAM07_PWD = aP1;
      a207_pc01_user_mst_chk.this.aP2 = aP2;
      a207_pc01_user_mst_chk.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM020_APP_ID = "A204" ;
      /* Execute user subroutine: S151 */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_A_CHK_INFO_SDT.clear();
      AV11P_A_CHK_RESULT_SDT.clear();
      AV12P_A_RESULT_MSG_SDT.clear();
      AV23W_FOCUS_FLG = true ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] = AV15W_A_CHK_INFO_SDT ;
      new a823_pc01_data_tyep_check(remoteHandle, context).execute( GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1) ;
      AV15W_A_CHK_INFO_SDT = GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[0] ;
      AV28GXV1 = 1 ;
      while ( AV28GXV1 <= AV15W_A_CHK_INFO_SDT.size() )
      {
         AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV15W_A_CHK_INFO_SDT.elementAt(-1+AV28GXV1));
         if ( AV16W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() != 0 )
         {
            AV17W_A_CHK_RESULT_SDT_ITEM = (SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem)new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Id( AV16W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id() );
            AV17W_A_CHK_RESULT_SDT_ITEM.setgxTv_SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem_Focus( AV23W_FOCUS_FLG );
            AV11P_A_CHK_RESULT_SDT.add(AV17W_A_CHK_RESULT_SDT_ITEM, 0);
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( AV16W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg() );
            AV12P_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
            AV23W_FOCUS_FLG = false ;
         }
         AV28GXV1 = (int)(AV28GXV1+1) ;
      }
      /* Execute user subroutine: S131 */
      S131 ();
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
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CHK_INFO_SET' Routine */
      AV20W_CHK_NO = (short)(1) ;
      while ( AV20W_CHK_NO <= 5 )
      {
         AV16W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
         if ( AV20W_CHK_NO == 1 )
         {
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM07_USER_ID" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "ユーザーID" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_id() );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( ((GXutil.strcmp(AV13P_BC_USER_MST.GetMode(), "INS")==0) ? "STR_ALPNUMSIG" : "STR") );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(128) );
         }
         else if ( AV20W_CHK_NO == 2 )
         {
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM07_PWD" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "パスワード" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV14P_TAM07_PWD );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR_ALPNUMSIG" );
            if ( (GXutil.strcmp("", AV13P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_pwd())==0) )
            {
               AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            }
            else
            {
               AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            }
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(128) );
         }
         else if ( AV20W_CHK_NO == 3 )
         {
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM07_USER_NM" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "氏名" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_nm() );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(1) );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(30) );
         }
         else if ( AV20W_CHK_NO == 4 )
         {
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM07_USER_KANA_NM" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "氏名(カナ)" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm() );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(20) );
         }
         else if ( AV20W_CHK_NO == 5 )
         {
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Id( "TAM07_EMAIL" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm( "メールアドレス" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( AV13P_BC_USER_MST.getgxTv_SdtTAM07_USER_Tam07_email() );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn( "STR" );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls( (byte)(0) );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte( (short)(256) );
            AV16W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half( (byte)(1) );
         }
         AV15W_A_CHK_INFO_SDT.add(AV16W_A_CHK_INFO_SDT_ITEM, 0);
         AV20W_CHK_NO = (short)(AV20W_CHK_NO+1) ;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
   }

   public void S121( )
   {
      /* 'SUB_CHK_INFO_DTLS' Routine */
   }

   public void S131( )
   {
      /* 'SUB_MSTR_CHK' Routine */
   }

   public void S141( )
   {
      /* 'SUB_SPECIAL_CHK' Routine */
   }

   public void S151( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT2[0] = AV18W_A_LOGIN_SDT;
      GXv_char3[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT2, GXv_char3) ;
      AV18W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT2[0] ;
      a207_pc01_user_mst_chk.this.AV22W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S161( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV29Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP2[0] = a207_pc01_user_mst_chk.this.AV11P_A_CHK_RESULT_SDT;
      this.aP3[0] = a207_pc01_user_mst_chk.this.AV12P_A_RESULT_MSG_SDT;
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
                  /* Execute user subroutine: S161 */
                  S161 ();
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
      AV11P_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV12P_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV10C_TAM020_APP_ID = "" ;
      AV15W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1 = new GxObjectCollection [1] ;
      AV16W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV17W_A_CHK_RESULT_SDT_ITEM = new SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem(remoteHandle, context);
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      AV18W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT2 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV29Pgmname = "" ;
      Gx_emsg = "" ;
      AV29Pgmname = "A207_PC01_USER_MST_CHK" ;
      /* GeneXus formulas. */
      AV29Pgmname = "A207_PC01_USER_MST_CHK" ;
      Gx_err = (short)(0) ;
   }

   private short AV20W_CHK_NO ;
   private short Gx_err ;
   private int AV28GXV1 ;
   private int GXActiveErrHndl ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV29Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV23W_FOCUS_FLG ;
   private String AV14P_TAM07_PWD ;
   private String AV10C_TAM020_APP_ID ;
   private String AV22W_ERRCD ;
   private GxObjectCollection[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private GxObjectCollection AV11P_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV12P_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV15W_A_CHK_INFO_SDT ;
   private GxObjectCollection GXv_objcol_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem1[] ;
   private SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem AV17W_A_CHK_RESULT_SDT_ITEM ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
   private SdtTAM07_USER AV13P_BC_USER_MST ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV16W_A_CHK_INFO_SDT_ITEM ;
   private SdtA_LOGIN_SDT AV18W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT2[] ;
}

