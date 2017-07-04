/*
               File: tam07_user_bc
        Description: ユーザーマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:2.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam07_user_bc extends GXWebPanel implements IGxSilentTrn
{
   public tam07_user_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam07_user_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam07_user_bc.class ));
   }

   public tam07_user_bc( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void inittrn( )
   {
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         /* Execute user event: e120A2 */
         e120A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z8TAM07_USER_ID = A8TAM07_USER_ID ;
            SetMode( "UPD") ;
         }
      }
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public boolean Reindex( )
   {
      return true ;
   }

   public void confirm_0A0( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0A10( ) ;
         }
         else
         {
            checkExtendedTable0A10( ) ;
            if ( AnyError == 0 )
            {
               zm0A10( 9) ;
            }
            closeExtendedTableCursors0A10( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110A2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      AV8W_BC_FLG = "1" ;
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120A2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ユーザーID:" + A8TAM07_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A2TAM07_USER_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A126TAM07_USER_KANA_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A7TAM07_PWD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A14TAM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A147TAM07_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A16TAM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A35TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A76TAM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A36TAM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A37TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A77TAM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A38TAM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1167( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0A10( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z35TAM07_CRT_DATETIME = A35TAM07_CRT_DATETIME ;
         Z76TAM07_CRT_USER_ID = A76TAM07_CRT_USER_ID ;
         Z37TAM07_UPD_DATETIME = A37TAM07_UPD_DATETIME ;
         Z77TAM07_UPD_USER_ID = A77TAM07_UPD_USER_ID ;
         Z112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         Z2TAM07_USER_NM = A2TAM07_USER_NM ;
         Z126TAM07_USER_KANA_NM = A126TAM07_USER_KANA_NM ;
         Z7TAM07_PWD = A7TAM07_PWD ;
         Z147TAM07_SITE_ID = A147TAM07_SITE_ID ;
         Z593TAM07_EMAIL = A593TAM07_EMAIL ;
         Z16TAM07_DEL_FLG = A16TAM07_DEL_FLG ;
         Z36TAM07_CRT_PROG_NM = A36TAM07_CRT_PROG_NM ;
         Z38TAM07_UPD_PROG_NM = A38TAM07_UPD_PROG_NM ;
         Z14TAM07_AUTH_CD = A14TAM07_AUTH_CD ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z8TAM07_USER_ID = A8TAM07_USER_ID ;
         Z35TAM07_CRT_DATETIME = A35TAM07_CRT_DATETIME ;
         Z76TAM07_CRT_USER_ID = A76TAM07_CRT_USER_ID ;
         Z37TAM07_UPD_DATETIME = A37TAM07_UPD_DATETIME ;
         Z77TAM07_UPD_USER_ID = A77TAM07_UPD_USER_ID ;
         Z112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         Z2TAM07_USER_NM = A2TAM07_USER_NM ;
         Z126TAM07_USER_KANA_NM = A126TAM07_USER_KANA_NM ;
         Z7TAM07_PWD = A7TAM07_PWD ;
         Z147TAM07_SITE_ID = A147TAM07_SITE_ID ;
         Z593TAM07_EMAIL = A593TAM07_EMAIL ;
         Z16TAM07_DEL_FLG = A16TAM07_DEL_FLG ;
         Z36TAM07_CRT_PROG_NM = A36TAM07_CRT_PROG_NM ;
         Z38TAM07_UPD_PROG_NM = A38TAM07_UPD_PROG_NM ;
         Z14TAM07_AUTH_CD = A14TAM07_AUTH_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0A10( )
   {
      /* Using cursor BC000A5 */
      pr_default.execute(3, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A35TAM07_CRT_DATETIME = BC000A5_A35TAM07_CRT_DATETIME[0] ;
         n35TAM07_CRT_DATETIME = BC000A5_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = BC000A5_A76TAM07_CRT_USER_ID[0] ;
         n76TAM07_CRT_USER_ID = BC000A5_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = BC000A5_A37TAM07_UPD_DATETIME[0] ;
         n37TAM07_UPD_DATETIME = BC000A5_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = BC000A5_A77TAM07_UPD_USER_ID[0] ;
         n77TAM07_UPD_USER_ID = BC000A5_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = BC000A5_A112TAM07_UPD_CNT[0] ;
         n112TAM07_UPD_CNT = BC000A5_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = BC000A5_A2TAM07_USER_NM[0] ;
         n2TAM07_USER_NM = BC000A5_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = BC000A5_A126TAM07_USER_KANA_NM[0] ;
         n126TAM07_USER_KANA_NM = BC000A5_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = BC000A5_A7TAM07_PWD[0] ;
         n7TAM07_PWD = BC000A5_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = BC000A5_A147TAM07_SITE_ID[0] ;
         n147TAM07_SITE_ID = BC000A5_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = BC000A5_A593TAM07_EMAIL[0] ;
         n593TAM07_EMAIL = BC000A5_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = BC000A5_A16TAM07_DEL_FLG[0] ;
         n16TAM07_DEL_FLG = BC000A5_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = BC000A5_A36TAM07_CRT_PROG_NM[0] ;
         n36TAM07_CRT_PROG_NM = BC000A5_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = BC000A5_A38TAM07_UPD_PROG_NM[0] ;
         n38TAM07_UPD_PROG_NM = BC000A5_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = BC000A5_A14TAM07_AUTH_CD[0] ;
         n14TAM07_AUTH_CD = BC000A5_n14TAM07_AUTH_CD[0] ;
         zm0A10( -8) ;
      }
      pr_default.close(3);
      onLoadActions0A10( ) ;
   }

   public void onLoadActions0A10( )
   {
      AV9Pgmname = "TAM07_USER_BC" ;
   }

   public void checkExtendedTable0A10( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TAM07_USER_BC" ;
      /* Using cursor BC000A4 */
      pr_default.execute(2, new Object[] {new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ) )
         {
            AnyError14 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'ユーザーマスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
         }
      }
      if ( AnyError14 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A35TAM07_CRT_DATETIME) || (( A35TAM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A35TAM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A37TAM07_UPD_DATETIME) || (( A37TAM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A37TAM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0A10( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0A10( )
   {
      /* Using cursor BC000A6 */
      pr_default.execute(4, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000A3 */
      pr_default.execute(1, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A10( 8) ;
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = BC000A3_A8TAM07_USER_ID[0] ;
         A35TAM07_CRT_DATETIME = BC000A3_A35TAM07_CRT_DATETIME[0] ;
         n35TAM07_CRT_DATETIME = BC000A3_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = BC000A3_A76TAM07_CRT_USER_ID[0] ;
         n76TAM07_CRT_USER_ID = BC000A3_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = BC000A3_A37TAM07_UPD_DATETIME[0] ;
         n37TAM07_UPD_DATETIME = BC000A3_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = BC000A3_A77TAM07_UPD_USER_ID[0] ;
         n77TAM07_UPD_USER_ID = BC000A3_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = BC000A3_A112TAM07_UPD_CNT[0] ;
         n112TAM07_UPD_CNT = BC000A3_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = BC000A3_A2TAM07_USER_NM[0] ;
         n2TAM07_USER_NM = BC000A3_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = BC000A3_A126TAM07_USER_KANA_NM[0] ;
         n126TAM07_USER_KANA_NM = BC000A3_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = BC000A3_A7TAM07_PWD[0] ;
         n7TAM07_PWD = BC000A3_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = BC000A3_A147TAM07_SITE_ID[0] ;
         n147TAM07_SITE_ID = BC000A3_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = BC000A3_A593TAM07_EMAIL[0] ;
         n593TAM07_EMAIL = BC000A3_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = BC000A3_A16TAM07_DEL_FLG[0] ;
         n16TAM07_DEL_FLG = BC000A3_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = BC000A3_A36TAM07_CRT_PROG_NM[0] ;
         n36TAM07_CRT_PROG_NM = BC000A3_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = BC000A3_A38TAM07_UPD_PROG_NM[0] ;
         n38TAM07_UPD_PROG_NM = BC000A3_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = BC000A3_A14TAM07_AUTH_CD[0] ;
         n14TAM07_AUTH_CD = BC000A3_n14TAM07_AUTH_CD[0] ;
         O112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         n112TAM07_UPD_CNT = false ;
         Z8TAM07_USER_ID = A8TAM07_USER_ID ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0A10( ) ;
         Gx_mode = sMode10 ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0A10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
      }
      getByPrimaryKey( ) ;
   }

   public void insert_check( )
   {
      confirm_0A0( ) ;
      IsConfirmed = (short)(0) ;
   }

   public void update_check( )
   {
      insert_check( ) ;
   }

   public void delete_check( )
   {
      insert_check( ) ;
   }

   public void checkOptimisticConcurrency0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000A2 */
         pr_default.execute(0, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z35TAM07_CRT_DATETIME.equals( BC000A2_A35TAM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z76TAM07_CRT_USER_ID, BC000A2_A76TAM07_CRT_USER_ID[0]) != 0 ) || !( Z37TAM07_UPD_DATETIME.equals( BC000A2_A37TAM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z77TAM07_UPD_USER_ID, BC000A2_A77TAM07_UPD_USER_ID[0]) != 0 ) || ( Z112TAM07_UPD_CNT != BC000A2_A112TAM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2TAM07_USER_NM, BC000A2_A2TAM07_USER_NM[0]) != 0 ) || ( GXutil.strcmp(Z126TAM07_USER_KANA_NM, BC000A2_A126TAM07_USER_KANA_NM[0]) != 0 ) || ( GXutil.strcmp(Z7TAM07_PWD, BC000A2_A7TAM07_PWD[0]) != 0 ) || ( GXutil.strcmp(Z147TAM07_SITE_ID, BC000A2_A147TAM07_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z593TAM07_EMAIL, BC000A2_A593TAM07_EMAIL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z16TAM07_DEL_FLG, BC000A2_A16TAM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z36TAM07_CRT_PROG_NM, BC000A2_A36TAM07_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z38TAM07_UPD_PROG_NM, BC000A2_A38TAM07_UPD_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z14TAM07_AUTH_CD, BC000A2_A14TAM07_AUTH_CD[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM07_USER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A10( 0) ;
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A7 */
                  pr_default.execute(5, new Object[] {A8TAM07_USER_ID, new Boolean(n35TAM07_CRT_DATETIME), A35TAM07_CRT_DATETIME, new Boolean(n76TAM07_CRT_USER_ID), A76TAM07_CRT_USER_ID, new Boolean(n37TAM07_UPD_DATETIME), A37TAM07_UPD_DATETIME, new Boolean(n77TAM07_UPD_USER_ID), A77TAM07_UPD_USER_ID, new Boolean(n112TAM07_UPD_CNT), new Long(A112TAM07_UPD_CNT), new Boolean(n2TAM07_USER_NM), A2TAM07_USER_NM, new Boolean(n126TAM07_USER_KANA_NM), A126TAM07_USER_KANA_NM, new Boolean(n7TAM07_PWD), A7TAM07_PWD, new Boolean(n147TAM07_SITE_ID), A147TAM07_SITE_ID, new Boolean(n593TAM07_EMAIL), A593TAM07_EMAIL, new Boolean(n16TAM07_DEL_FLG), A16TAM07_DEL_FLG, new Boolean(n36TAM07_CRT_PROG_NM), A36TAM07_CRT_PROG_NM, new Boolean(n38TAM07_UPD_PROG_NM), A38TAM07_UPD_PROG_NM, new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
                  if ( (pr_default.getStatus(5) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "");
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load0A10( ) ;
         }
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void update0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000A8 */
                  pr_default.execute(6, new Object[] {new Boolean(n35TAM07_CRT_DATETIME), A35TAM07_CRT_DATETIME, new Boolean(n76TAM07_CRT_USER_ID), A76TAM07_CRT_USER_ID, new Boolean(n37TAM07_UPD_DATETIME), A37TAM07_UPD_DATETIME, new Boolean(n77TAM07_UPD_USER_ID), A77TAM07_UPD_USER_ID, new Boolean(n112TAM07_UPD_CNT), new Long(A112TAM07_UPD_CNT), new Boolean(n2TAM07_USER_NM), A2TAM07_USER_NM, new Boolean(n126TAM07_USER_KANA_NM), A126TAM07_USER_KANA_NM, new Boolean(n7TAM07_PWD), A7TAM07_PWD, new Boolean(n147TAM07_SITE_ID), A147TAM07_SITE_ID, new Boolean(n593TAM07_EMAIL), A593TAM07_EMAIL, new Boolean(n16TAM07_DEL_FLG), A16TAM07_DEL_FLG, new Boolean(n36TAM07_CRT_PROG_NM), A36TAM07_CRT_PROG_NM, new Boolean(n38TAM07_UPD_PROG_NM), A38TAM07_UPD_PROG_NM, new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD, A8TAM07_USER_ID});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A10( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void deferredUpdate0A10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A10( ) ;
         afterConfirm0A10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000A9 */
               pr_default.execute(7, new Object[] {A8TAM07_USER_ID});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0A10( ) ;
      Gx_mode = sMode10 ;
   }

   public void onDeleteControls0A10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TAM07_USER_BC" ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor BC000A10 */
         pr_default.execute(8, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(8) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(8);
         /* Using cursor BC000A11 */
         pr_default.execute(9, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor BC000A12 */
         pr_default.execute(10, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor BC000A13 */
         pr_default.execute(11, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor BC000A14 */
         pr_default.execute(12, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor BC000A15 */
         pr_default.execute(13, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor BC000A16 */
         pr_default.execute(14, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
      }
   }

   public void endLevel0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanKeyStart0A10( )
   {
      /* Using cursor BC000A17 */
      pr_default.execute(15, new Object[] {A8TAM07_USER_ID});
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = BC000A17_A8TAM07_USER_ID[0] ;
         A35TAM07_CRT_DATETIME = BC000A17_A35TAM07_CRT_DATETIME[0] ;
         n35TAM07_CRT_DATETIME = BC000A17_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = BC000A17_A76TAM07_CRT_USER_ID[0] ;
         n76TAM07_CRT_USER_ID = BC000A17_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = BC000A17_A37TAM07_UPD_DATETIME[0] ;
         n37TAM07_UPD_DATETIME = BC000A17_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = BC000A17_A77TAM07_UPD_USER_ID[0] ;
         n77TAM07_UPD_USER_ID = BC000A17_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = BC000A17_A112TAM07_UPD_CNT[0] ;
         n112TAM07_UPD_CNT = BC000A17_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = BC000A17_A2TAM07_USER_NM[0] ;
         n2TAM07_USER_NM = BC000A17_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = BC000A17_A126TAM07_USER_KANA_NM[0] ;
         n126TAM07_USER_KANA_NM = BC000A17_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = BC000A17_A7TAM07_PWD[0] ;
         n7TAM07_PWD = BC000A17_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = BC000A17_A147TAM07_SITE_ID[0] ;
         n147TAM07_SITE_ID = BC000A17_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = BC000A17_A593TAM07_EMAIL[0] ;
         n593TAM07_EMAIL = BC000A17_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = BC000A17_A16TAM07_DEL_FLG[0] ;
         n16TAM07_DEL_FLG = BC000A17_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = BC000A17_A36TAM07_CRT_PROG_NM[0] ;
         n36TAM07_CRT_PROG_NM = BC000A17_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = BC000A17_A38TAM07_UPD_PROG_NM[0] ;
         n38TAM07_UPD_PROG_NM = BC000A17_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = BC000A17_A14TAM07_AUTH_CD[0] ;
         n14TAM07_AUTH_CD = BC000A17_n14TAM07_AUTH_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0A10( )
   {
      pr_default.readNext(15);
      RcdFound10 = (short)(0) ;
      scanKeyLoad0A10( ) ;
   }

   public void scanKeyLoad0A10( )
   {
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = BC000A17_A8TAM07_USER_ID[0] ;
         A35TAM07_CRT_DATETIME = BC000A17_A35TAM07_CRT_DATETIME[0] ;
         n35TAM07_CRT_DATETIME = BC000A17_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = BC000A17_A76TAM07_CRT_USER_ID[0] ;
         n76TAM07_CRT_USER_ID = BC000A17_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = BC000A17_A37TAM07_UPD_DATETIME[0] ;
         n37TAM07_UPD_DATETIME = BC000A17_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = BC000A17_A77TAM07_UPD_USER_ID[0] ;
         n77TAM07_UPD_USER_ID = BC000A17_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = BC000A17_A112TAM07_UPD_CNT[0] ;
         n112TAM07_UPD_CNT = BC000A17_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = BC000A17_A2TAM07_USER_NM[0] ;
         n2TAM07_USER_NM = BC000A17_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = BC000A17_A126TAM07_USER_KANA_NM[0] ;
         n126TAM07_USER_KANA_NM = BC000A17_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = BC000A17_A7TAM07_PWD[0] ;
         n7TAM07_PWD = BC000A17_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = BC000A17_A147TAM07_SITE_ID[0] ;
         n147TAM07_SITE_ID = BC000A17_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = BC000A17_A593TAM07_EMAIL[0] ;
         n593TAM07_EMAIL = BC000A17_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = BC000A17_A16TAM07_DEL_FLG[0] ;
         n16TAM07_DEL_FLG = BC000A17_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = BC000A17_A36TAM07_CRT_PROG_NM[0] ;
         n36TAM07_CRT_PROG_NM = BC000A17_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = BC000A17_A38TAM07_UPD_PROG_NM[0] ;
         n38TAM07_UPD_PROG_NM = BC000A17_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = BC000A17_A14TAM07_AUTH_CD[0] ;
         n14TAM07_AUTH_CD = BC000A17_n14TAM07_AUTH_CD[0] ;
      }
      Gx_mode = sMode10 ;
   }

   public void scanKeyEnd0A10( )
   {
      pr_default.close(15);
   }

   public void afterConfirm0A10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A10( )
   {
      /* Before Insert Rules */
      A35TAM07_CRT_DATETIME = GXutil.now( ) ;
      n35TAM07_CRT_DATETIME = false ;
      GXt_char1 = A76TAM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A76TAM07_CRT_USER_ID = GXt_char1 ;
      n76TAM07_CRT_USER_ID = false ;
      A37TAM07_UPD_DATETIME = GXutil.now( ) ;
      n37TAM07_UPD_DATETIME = false ;
      GXt_char1 = A77TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A77TAM07_UPD_USER_ID = GXt_char1 ;
      n77TAM07_UPD_USER_ID = false ;
      A112TAM07_UPD_CNT = (long)(O112TAM07_UPD_CNT+1) ;
      n112TAM07_UPD_CNT = false ;
   }

   public void beforeUpdate0A10( )
   {
      /* Before Update Rules */
      A37TAM07_UPD_DATETIME = GXutil.now( ) ;
      n37TAM07_UPD_DATETIME = false ;
      GXt_char1 = A77TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_bc.this.GXt_char1 = GXv_char2[0] ;
      A77TAM07_UPD_USER_ID = GXt_char1 ;
      n77TAM07_UPD_USER_ID = false ;
      A112TAM07_UPD_CNT = (long)(O112TAM07_UPD_CNT+1) ;
      n112TAM07_UPD_CNT = false ;
   }

   public void beforeDelete0A10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A10( )
   {
   }

   public void addRow0A10( )
   {
      VarsToRow10( bcTAM07_USER) ;
   }

   public void readRow0A10( )
   {
      RowToVars10( bcTAM07_USER, 1) ;
   }

   public void initializeNonKey0A10( )
   {
      A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n35TAM07_CRT_DATETIME = false ;
      A76TAM07_CRT_USER_ID = "" ;
      n76TAM07_CRT_USER_ID = false ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n37TAM07_UPD_DATETIME = false ;
      A77TAM07_UPD_USER_ID = "" ;
      n77TAM07_UPD_USER_ID = false ;
      A112TAM07_UPD_CNT = 0 ;
      n112TAM07_UPD_CNT = false ;
      A2TAM07_USER_NM = "" ;
      n2TAM07_USER_NM = false ;
      A126TAM07_USER_KANA_NM = "" ;
      n126TAM07_USER_KANA_NM = false ;
      A7TAM07_PWD = "" ;
      n7TAM07_PWD = false ;
      A14TAM07_AUTH_CD = "" ;
      n14TAM07_AUTH_CD = false ;
      A147TAM07_SITE_ID = "" ;
      n147TAM07_SITE_ID = false ;
      A593TAM07_EMAIL = "" ;
      n593TAM07_EMAIL = false ;
      A16TAM07_DEL_FLG = "" ;
      n16TAM07_DEL_FLG = false ;
      A36TAM07_CRT_PROG_NM = "" ;
      n36TAM07_CRT_PROG_NM = false ;
      A38TAM07_UPD_PROG_NM = "" ;
      n38TAM07_UPD_PROG_NM = false ;
      O112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
      n112TAM07_UPD_CNT = false ;
   }

   public void initAll0A10( )
   {
      A8TAM07_USER_ID = "" ;
      initializeNonKey0A10( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow10( SdtTAM07_USER obj10 )
   {
      obj10.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime( A35TAM07_CRT_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id( A76TAM07_CRT_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime( A37TAM07_UPD_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id( A77TAM07_UPD_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt( A112TAM07_UPD_CNT );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm( A2TAM07_USER_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm( A126TAM07_USER_KANA_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd( A7TAM07_PWD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd( A14TAM07_AUTH_CD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id( A147TAM07_SITE_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email( A593TAM07_EMAIL );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg( A16TAM07_DEL_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( A36TAM07_CRT_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( A38TAM07_UPD_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_id( A8TAM07_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_id_Z( Z8TAM07_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm_Z( Z2TAM07_USER_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z( Z126TAM07_USER_KANA_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd_Z( Z7TAM07_PWD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd_Z( Z14TAM07_AUTH_CD );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id_Z( Z147TAM07_SITE_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email_Z( Z593TAM07_EMAIL );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg_Z( Z16TAM07_DEL_FLG );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z( Z35TAM07_CRT_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z( Z76TAM07_CRT_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z( Z36TAM07_CRT_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z( Z37TAM07_UPD_DATETIME );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z( Z77TAM07_UPD_USER_ID );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z( Z38TAM07_UPD_PROG_NM );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z( Z112TAM07_UPD_CNT );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_nm_N( (byte)((byte)((n2TAM07_USER_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N( (byte)((byte)((n126TAM07_USER_KANA_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_pwd_N( (byte)((byte)((n7TAM07_PWD)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_auth_cd_N( (byte)((byte)((n14TAM07_AUTH_CD)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_site_id_N( (byte)((byte)((n147TAM07_SITE_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_email_N( (byte)((byte)((n593TAM07_EMAIL)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_del_flg_N( (byte)((byte)((n16TAM07_DEL_FLG)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_datetime_N( (byte)((byte)((n35TAM07_CRT_DATETIME)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_user_id_N( (byte)((byte)((n76TAM07_CRT_USER_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N( (byte)((byte)((n36TAM07_CRT_PROG_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_datetime_N( (byte)((byte)((n37TAM07_UPD_DATETIME)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_user_id_N( (byte)((byte)((n77TAM07_UPD_USER_ID)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N( (byte)((byte)((n38TAM07_UPD_PROG_NM)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Tam07_upd_cnt_N( (byte)((byte)((n112TAM07_UPD_CNT)?1:0)) );
      obj10.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
   }

   public void RowToVars10( SdtTAM07_USER obj10 ,
                            int forceLoad )
   {
      Gx_mode = obj10.getgxTv_SdtTAM07_USER_Mode() ;
      A35TAM07_CRT_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime() ;
      n35TAM07_CRT_DATETIME = false ;
      A76TAM07_CRT_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id() ;
      n76TAM07_CRT_USER_ID = false ;
      A37TAM07_UPD_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime() ;
      n37TAM07_UPD_DATETIME = false ;
      A77TAM07_UPD_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id() ;
      n77TAM07_UPD_USER_ID = false ;
      A112TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt() ;
      n112TAM07_UPD_CNT = false ;
      A2TAM07_USER_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm() ;
      n2TAM07_USER_NM = false ;
      A126TAM07_USER_KANA_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm() ;
      n126TAM07_USER_KANA_NM = false ;
      A7TAM07_PWD = obj10.getgxTv_SdtTAM07_USER_Tam07_pwd() ;
      n7TAM07_PWD = false ;
      A14TAM07_AUTH_CD = obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd() ;
      n14TAM07_AUTH_CD = false ;
      A147TAM07_SITE_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_site_id() ;
      n147TAM07_SITE_ID = false ;
      A593TAM07_EMAIL = obj10.getgxTv_SdtTAM07_USER_Tam07_email() ;
      n593TAM07_EMAIL = false ;
      A16TAM07_DEL_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg() ;
      n16TAM07_DEL_FLG = false ;
      A36TAM07_CRT_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm() ;
      n36TAM07_CRT_PROG_NM = false ;
      A38TAM07_UPD_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm() ;
      n38TAM07_UPD_PROG_NM = false ;
      A8TAM07_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_user_id() ;
      Z8TAM07_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_user_id_Z() ;
      Z2TAM07_USER_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm_Z() ;
      Z126TAM07_USER_KANA_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z() ;
      Z7TAM07_PWD = obj10.getgxTv_SdtTAM07_USER_Tam07_pwd_Z() ;
      Z14TAM07_AUTH_CD = obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd_Z() ;
      Z147TAM07_SITE_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_site_id_Z() ;
      Z593TAM07_EMAIL = obj10.getgxTv_SdtTAM07_USER_Tam07_email_Z() ;
      Z16TAM07_DEL_FLG = obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg_Z() ;
      Z35TAM07_CRT_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime_Z() ;
      Z76TAM07_CRT_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id_Z() ;
      Z36TAM07_CRT_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z() ;
      Z37TAM07_UPD_DATETIME = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime_Z() ;
      Z77TAM07_UPD_USER_ID = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id_Z() ;
      Z38TAM07_UPD_PROG_NM = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z() ;
      Z112TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z() ;
      O112TAM07_UPD_CNT = obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_Z() ;
      n2TAM07_USER_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_user_nm_N()==0)?false:true) ;
      n126TAM07_USER_KANA_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_user_kana_nm_N()==0)?false:true) ;
      n7TAM07_PWD = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_pwd_N()==0)?false:true) ;
      n14TAM07_AUTH_CD = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_auth_cd_N()==0)?false:true) ;
      n147TAM07_SITE_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_site_id_N()==0)?false:true) ;
      n593TAM07_EMAIL = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_email_N()==0)?false:true) ;
      n16TAM07_DEL_FLG = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_del_flg_N()==0)?false:true) ;
      n35TAM07_CRT_DATETIME = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_datetime_N()==0)?false:true) ;
      n76TAM07_CRT_USER_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_user_id_N()==0)?false:true) ;
      n36TAM07_CRT_PROG_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N()==0)?false:true) ;
      n37TAM07_UPD_DATETIME = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_datetime_N()==0)?false:true) ;
      n77TAM07_UPD_USER_ID = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_user_id_N()==0)?false:true) ;
      n38TAM07_UPD_PROG_NM = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N()==0)?false:true) ;
      n112TAM07_UPD_CNT = (boolean)((obj10.getgxTv_SdtTAM07_USER_Tam07_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj10.getgxTv_SdtTAM07_USER_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A8TAM07_USER_ID = (String)getParm(obj,0) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0A10( ) ;
      scanKeyStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         Gx_mode = "INS" ;
      }
      else
      {
         Gx_mode = "UPD" ;
         Z8TAM07_USER_ID = A8TAM07_USER_ID ;
         O112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         n112TAM07_UPD_CNT = false ;
      }
      zm0A10( -8) ;
      sMode10 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0A10( ) ;
      Gx_mode = sMode10 ;
      addRow0A10( ) ;
      scanKeyEnd0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "");
         AnyError = (short)(1) ;
      }
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Save( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      IsConfirmed = (short)(1) ;
      RowToVars10( bcTAM07_USER, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0A10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
         {
            A8TAM07_USER_ID = Z8TAM07_USER_ID ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            /* Update record */
            update0A10( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "");
            AnyError = (short)(1) ;
         }
         else
         {
            if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  Gx_mode = "INS" ;
                  /* Insert record */
                  insert0A10( ) ;
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                  AnyError = (short)(1) ;
               }
               else
               {
                  Gx_mode = "INS" ;
                  /* Insert record */
                  insert0A10( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow10( bcTAM07_USER) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars10( bcTAM07_USER, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0A10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
         {
            A8TAM07_USER_ID = Z8TAM07_USER_ID ;
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete_check( ) ;
         }
         else
         {
            Gx_mode = "UPD" ;
            update_check( ) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
         {
            Gx_mode = "INS" ;
            insert_check( ) ;
         }
         else
         {
            if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
               AnyError = (short)(1) ;
            }
            else
            {
               Gx_mode = "INS" ;
               insert_check( ) ;
            }
         }
      }
      Application.rollback(context, remoteHandle, "DEFAULT", "tam07_user_bc");
      VarsToRow10( bcTAM07_USER) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public int Errors( )
   {
      if ( AnyError == 0 )
      {
         return 0 ;
      }
      return 1 ;
   }

   public com.genexus.internet.MsgList GetMessages( )
   {
      return LclMsgLst ;
   }

   public String GetMode( )
   {
      Gx_mode = bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( Gx_mode );
   }

   public void SetSDT( SdtTAM07_USER sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTAM07_USER )
      {
         bcTAM07_USER = sdt ;
         if ( GXutil.strcmp(bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode(), "") == 0 )
         {
            bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow10( bcTAM07_USER) ;
         }
         else
         {
            RowToVars10( bcTAM07_USER, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTAM07_USER.getgxTv_SdtTAM07_USER_Mode(), "") == 0 )
         {
            bcTAM07_USER.setgxTv_SdtTAM07_USER_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars10( bcTAM07_USER, 1) ;
   }

   public SdtTAM07_USER getTAM07_USER_BC( )
   {
      return bcTAM07_USER ;
   }


   public void webExecute( )
   {
   }

   protected void createObjects( )
   {
   }

   protected void Process( )
   {
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
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
               default:
                  /* Execute user subroutine: S1167 */
                  S1167 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      scmdbuf = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Gx_mode = "" ;
      Z8TAM07_USER_ID = "" ;
      A8TAM07_USER_ID = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A2TAM07_USER_NM = "" ;
      A126TAM07_USER_KANA_NM = "" ;
      A7TAM07_PWD = "" ;
      A14TAM07_AUTH_CD = "" ;
      A147TAM07_SITE_ID = "" ;
      A16TAM07_DEL_FLG = "" ;
      A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A76TAM07_CRT_USER_ID = "" ;
      A36TAM07_CRT_PROG_NM = "" ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A77TAM07_UPD_USER_ID = "" ;
      A38TAM07_UPD_PROG_NM = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_pwd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_auth_cd_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_site_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_email_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_del_flg_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z = "" ;
      gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z = "" ;
      Z35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z76TAM07_CRT_USER_ID = "" ;
      Z37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z77TAM07_UPD_USER_ID = "" ;
      Z2TAM07_USER_NM = "" ;
      Z126TAM07_USER_KANA_NM = "" ;
      Z7TAM07_PWD = "" ;
      Z147TAM07_SITE_ID = "" ;
      Z593TAM07_EMAIL = "" ;
      A593TAM07_EMAIL = "" ;
      Z16TAM07_DEL_FLG = "" ;
      Z36TAM07_CRT_PROG_NM = "" ;
      Z38TAM07_UPD_PROG_NM = "" ;
      Z14TAM07_AUTH_CD = "" ;
      BC000A5_A8TAM07_USER_ID = new String[] {""} ;
      BC000A5_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A5_A76TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A5_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A5_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A5_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A5_A77TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A5_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A5_A112TAM07_UPD_CNT = new long[1] ;
      BC000A5_n112TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A5_A2TAM07_USER_NM = new String[] {""} ;
      BC000A5_n2TAM07_USER_NM = new boolean[] {false} ;
      BC000A5_A126TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A5_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A5_A7TAM07_PWD = new String[] {""} ;
      BC000A5_n7TAM07_PWD = new boolean[] {false} ;
      BC000A5_A147TAM07_SITE_ID = new String[] {""} ;
      BC000A5_n147TAM07_SITE_ID = new boolean[] {false} ;
      BC000A5_A593TAM07_EMAIL = new String[] {""} ;
      BC000A5_n593TAM07_EMAIL = new boolean[] {false} ;
      BC000A5_A16TAM07_DEL_FLG = new String[] {""} ;
      BC000A5_n16TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A5_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A5_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A5_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A5_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A5_A14TAM07_AUTH_CD = new String[] {""} ;
      BC000A5_n14TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A4_A14TAM07_AUTH_CD = new String[] {""} ;
      BC000A4_n14TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A6_A8TAM07_USER_ID = new String[] {""} ;
      BC000A3_A8TAM07_USER_ID = new String[] {""} ;
      BC000A3_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A3_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A3_A76TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A3_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A3_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A3_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A3_A77TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A3_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A3_A112TAM07_UPD_CNT = new long[1] ;
      BC000A3_n112TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A3_A2TAM07_USER_NM = new String[] {""} ;
      BC000A3_n2TAM07_USER_NM = new boolean[] {false} ;
      BC000A3_A126TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A3_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A3_A7TAM07_PWD = new String[] {""} ;
      BC000A3_n7TAM07_PWD = new boolean[] {false} ;
      BC000A3_A147TAM07_SITE_ID = new String[] {""} ;
      BC000A3_n147TAM07_SITE_ID = new boolean[] {false} ;
      BC000A3_A593TAM07_EMAIL = new String[] {""} ;
      BC000A3_n593TAM07_EMAIL = new boolean[] {false} ;
      BC000A3_A16TAM07_DEL_FLG = new String[] {""} ;
      BC000A3_n16TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A3_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A3_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A3_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A3_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A3_A14TAM07_AUTH_CD = new String[] {""} ;
      BC000A3_n14TAM07_AUTH_CD = new boolean[] {false} ;
      sMode10 = "" ;
      BC000A2_A8TAM07_USER_ID = new String[] {""} ;
      BC000A2_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A2_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A2_A76TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A2_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A2_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A2_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A2_A77TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A2_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A2_A112TAM07_UPD_CNT = new long[1] ;
      BC000A2_n112TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A2_A2TAM07_USER_NM = new String[] {""} ;
      BC000A2_n2TAM07_USER_NM = new boolean[] {false} ;
      BC000A2_A126TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A2_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A2_A7TAM07_PWD = new String[] {""} ;
      BC000A2_n7TAM07_PWD = new boolean[] {false} ;
      BC000A2_A147TAM07_SITE_ID = new String[] {""} ;
      BC000A2_n147TAM07_SITE_ID = new boolean[] {false} ;
      BC000A2_A593TAM07_EMAIL = new String[] {""} ;
      BC000A2_n593TAM07_EMAIL = new boolean[] {false} ;
      BC000A2_A16TAM07_DEL_FLG = new String[] {""} ;
      BC000A2_n16TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A2_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A2_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A2_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A2_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A2_A14TAM07_AUTH_CD = new String[] {""} ;
      BC000A2_n14TAM07_AUTH_CD = new boolean[] {false} ;
      BC000A10_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A10_A626TBW03_APP_ID = new String[] {""} ;
      BC000A10_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A10_A628TBW03_STUDY_ID = new long[1] ;
      BC000A10_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A10_A630TBW03_CRF_ID = new short[1] ;
      BC000A11_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A11_A626TBW03_APP_ID = new String[] {""} ;
      BC000A11_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A11_A628TBW03_STUDY_ID = new long[1] ;
      BC000A11_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A11_A630TBW03_CRF_ID = new short[1] ;
      BC000A12_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A12_A626TBW03_APP_ID = new String[] {""} ;
      BC000A12_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A12_A628TBW03_STUDY_ID = new long[1] ;
      BC000A12_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A12_A630TBW03_CRF_ID = new short[1] ;
      BC000A13_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A13_A626TBW03_APP_ID = new String[] {""} ;
      BC000A13_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A13_A628TBW03_STUDY_ID = new long[1] ;
      BC000A13_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A13_A630TBW03_CRF_ID = new short[1] ;
      BC000A14_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A14_A626TBW03_APP_ID = new String[] {""} ;
      BC000A14_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A14_A628TBW03_STUDY_ID = new long[1] ;
      BC000A14_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A14_A630TBW03_CRF_ID = new short[1] ;
      BC000A15_A625TBW03_SESSION_ID = new String[] {""} ;
      BC000A15_A626TBW03_APP_ID = new String[] {""} ;
      BC000A15_A627TBW03_DISP_DATETIME = new String[] {""} ;
      BC000A15_A628TBW03_STUDY_ID = new long[1] ;
      BC000A15_A629TBW03_SUBJECT_ID = new int[1] ;
      BC000A15_A630TBW03_CRF_ID = new short[1] ;
      BC000A16_A207TBM23_STUDY_ID = new long[1] ;
      BC000A16_A208TBM23_USER_ID = new String[] {""} ;
      BC000A16_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      BC000A17_A8TAM07_USER_ID = new String[] {""} ;
      BC000A17_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A17_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      BC000A17_A76TAM07_CRT_USER_ID = new String[] {""} ;
      BC000A17_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      BC000A17_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000A17_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      BC000A17_A77TAM07_UPD_USER_ID = new String[] {""} ;
      BC000A17_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      BC000A17_A112TAM07_UPD_CNT = new long[1] ;
      BC000A17_n112TAM07_UPD_CNT = new boolean[] {false} ;
      BC000A17_A2TAM07_USER_NM = new String[] {""} ;
      BC000A17_n2TAM07_USER_NM = new boolean[] {false} ;
      BC000A17_A126TAM07_USER_KANA_NM = new String[] {""} ;
      BC000A17_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      BC000A17_A7TAM07_PWD = new String[] {""} ;
      BC000A17_n7TAM07_PWD = new boolean[] {false} ;
      BC000A17_A147TAM07_SITE_ID = new String[] {""} ;
      BC000A17_n147TAM07_SITE_ID = new boolean[] {false} ;
      BC000A17_A593TAM07_EMAIL = new String[] {""} ;
      BC000A17_n593TAM07_EMAIL = new boolean[] {false} ;
      BC000A17_A16TAM07_DEL_FLG = new String[] {""} ;
      BC000A17_n16TAM07_DEL_FLG = new boolean[] {false} ;
      BC000A17_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      BC000A17_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      BC000A17_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      BC000A17_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      BC000A17_A14TAM07_AUTH_CD = new String[] {""} ;
      BC000A17_n14TAM07_AUTH_CD = new boolean[] {false} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam07_user_bc__default(),
         new Object[] {
             new Object[] {
            BC000A2_A8TAM07_USER_ID, BC000A2_A35TAM07_CRT_DATETIME, BC000A2_n35TAM07_CRT_DATETIME, BC000A2_A76TAM07_CRT_USER_ID, BC000A2_n76TAM07_CRT_USER_ID, BC000A2_A37TAM07_UPD_DATETIME, BC000A2_n37TAM07_UPD_DATETIME, BC000A2_A77TAM07_UPD_USER_ID, BC000A2_n77TAM07_UPD_USER_ID, BC000A2_A112TAM07_UPD_CNT,
            BC000A2_n112TAM07_UPD_CNT, BC000A2_A2TAM07_USER_NM, BC000A2_n2TAM07_USER_NM, BC000A2_A126TAM07_USER_KANA_NM, BC000A2_n126TAM07_USER_KANA_NM, BC000A2_A7TAM07_PWD, BC000A2_n7TAM07_PWD, BC000A2_A147TAM07_SITE_ID, BC000A2_n147TAM07_SITE_ID, BC000A2_A593TAM07_EMAIL,
            BC000A2_n593TAM07_EMAIL, BC000A2_A16TAM07_DEL_FLG, BC000A2_n16TAM07_DEL_FLG, BC000A2_A36TAM07_CRT_PROG_NM, BC000A2_n36TAM07_CRT_PROG_NM, BC000A2_A38TAM07_UPD_PROG_NM, BC000A2_n38TAM07_UPD_PROG_NM, BC000A2_A14TAM07_AUTH_CD, BC000A2_n14TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A3_A8TAM07_USER_ID, BC000A3_A35TAM07_CRT_DATETIME, BC000A3_n35TAM07_CRT_DATETIME, BC000A3_A76TAM07_CRT_USER_ID, BC000A3_n76TAM07_CRT_USER_ID, BC000A3_A37TAM07_UPD_DATETIME, BC000A3_n37TAM07_UPD_DATETIME, BC000A3_A77TAM07_UPD_USER_ID, BC000A3_n77TAM07_UPD_USER_ID, BC000A3_A112TAM07_UPD_CNT,
            BC000A3_n112TAM07_UPD_CNT, BC000A3_A2TAM07_USER_NM, BC000A3_n2TAM07_USER_NM, BC000A3_A126TAM07_USER_KANA_NM, BC000A3_n126TAM07_USER_KANA_NM, BC000A3_A7TAM07_PWD, BC000A3_n7TAM07_PWD, BC000A3_A147TAM07_SITE_ID, BC000A3_n147TAM07_SITE_ID, BC000A3_A593TAM07_EMAIL,
            BC000A3_n593TAM07_EMAIL, BC000A3_A16TAM07_DEL_FLG, BC000A3_n16TAM07_DEL_FLG, BC000A3_A36TAM07_CRT_PROG_NM, BC000A3_n36TAM07_CRT_PROG_NM, BC000A3_A38TAM07_UPD_PROG_NM, BC000A3_n38TAM07_UPD_PROG_NM, BC000A3_A14TAM07_AUTH_CD, BC000A3_n14TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A4_A14TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A5_A8TAM07_USER_ID, BC000A5_A35TAM07_CRT_DATETIME, BC000A5_n35TAM07_CRT_DATETIME, BC000A5_A76TAM07_CRT_USER_ID, BC000A5_n76TAM07_CRT_USER_ID, BC000A5_A37TAM07_UPD_DATETIME, BC000A5_n37TAM07_UPD_DATETIME, BC000A5_A77TAM07_UPD_USER_ID, BC000A5_n77TAM07_UPD_USER_ID, BC000A5_A112TAM07_UPD_CNT,
            BC000A5_n112TAM07_UPD_CNT, BC000A5_A2TAM07_USER_NM, BC000A5_n2TAM07_USER_NM, BC000A5_A126TAM07_USER_KANA_NM, BC000A5_n126TAM07_USER_KANA_NM, BC000A5_A7TAM07_PWD, BC000A5_n7TAM07_PWD, BC000A5_A147TAM07_SITE_ID, BC000A5_n147TAM07_SITE_ID, BC000A5_A593TAM07_EMAIL,
            BC000A5_n593TAM07_EMAIL, BC000A5_A16TAM07_DEL_FLG, BC000A5_n16TAM07_DEL_FLG, BC000A5_A36TAM07_CRT_PROG_NM, BC000A5_n36TAM07_CRT_PROG_NM, BC000A5_A38TAM07_UPD_PROG_NM, BC000A5_n38TAM07_UPD_PROG_NM, BC000A5_A14TAM07_AUTH_CD, BC000A5_n14TAM07_AUTH_CD
            }
            , new Object[] {
            BC000A6_A8TAM07_USER_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000A10_A625TBW03_SESSION_ID, BC000A10_A626TBW03_APP_ID, BC000A10_A627TBW03_DISP_DATETIME, BC000A10_A628TBW03_STUDY_ID, BC000A10_A629TBW03_SUBJECT_ID, BC000A10_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A11_A625TBW03_SESSION_ID, BC000A11_A626TBW03_APP_ID, BC000A11_A627TBW03_DISP_DATETIME, BC000A11_A628TBW03_STUDY_ID, BC000A11_A629TBW03_SUBJECT_ID, BC000A11_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A12_A625TBW03_SESSION_ID, BC000A12_A626TBW03_APP_ID, BC000A12_A627TBW03_DISP_DATETIME, BC000A12_A628TBW03_STUDY_ID, BC000A12_A629TBW03_SUBJECT_ID, BC000A12_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A13_A625TBW03_SESSION_ID, BC000A13_A626TBW03_APP_ID, BC000A13_A627TBW03_DISP_DATETIME, BC000A13_A628TBW03_STUDY_ID, BC000A13_A629TBW03_SUBJECT_ID, BC000A13_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A14_A625TBW03_SESSION_ID, BC000A14_A626TBW03_APP_ID, BC000A14_A627TBW03_DISP_DATETIME, BC000A14_A628TBW03_STUDY_ID, BC000A14_A629TBW03_SUBJECT_ID, BC000A14_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A15_A625TBW03_SESSION_ID, BC000A15_A626TBW03_APP_ID, BC000A15_A627TBW03_DISP_DATETIME, BC000A15_A628TBW03_STUDY_ID, BC000A15_A629TBW03_SUBJECT_ID, BC000A15_A630TBW03_CRF_ID
            }
            , new Object[] {
            BC000A16_A207TBM23_STUDY_ID, BC000A16_A208TBM23_USER_ID, BC000A16_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            BC000A17_A8TAM07_USER_ID, BC000A17_A35TAM07_CRT_DATETIME, BC000A17_n35TAM07_CRT_DATETIME, BC000A17_A76TAM07_CRT_USER_ID, BC000A17_n76TAM07_CRT_USER_ID, BC000A17_A37TAM07_UPD_DATETIME, BC000A17_n37TAM07_UPD_DATETIME, BC000A17_A77TAM07_UPD_USER_ID, BC000A17_n77TAM07_UPD_USER_ID, BC000A17_A112TAM07_UPD_CNT,
            BC000A17_n112TAM07_UPD_CNT, BC000A17_A2TAM07_USER_NM, BC000A17_n2TAM07_USER_NM, BC000A17_A126TAM07_USER_KANA_NM, BC000A17_n126TAM07_USER_KANA_NM, BC000A17_A7TAM07_PWD, BC000A17_n7TAM07_PWD, BC000A17_A147TAM07_SITE_ID, BC000A17_n147TAM07_SITE_ID, BC000A17_A593TAM07_EMAIL,
            BC000A17_n593TAM07_EMAIL, BC000A17_A16TAM07_DEL_FLG, BC000A17_n16TAM07_DEL_FLG, BC000A17_A36TAM07_CRT_PROG_NM, BC000A17_n36TAM07_CRT_PROG_NM, BC000A17_A38TAM07_UPD_PROG_NM, BC000A17_n38TAM07_UPD_PROG_NM, BC000A17_A14TAM07_AUTH_CD, BC000A17_n14TAM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TAM07_USER_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110A2 */
      e110A2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTAM07_USER_Tam07_user_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_user_kana_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_pwd_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_auth_cd_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_site_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_email_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_del_flg_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_datetime_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_user_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_datetime_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_user_id_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_N ;
   private byte gxTv_SdtTAM07_USER_Tam07_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound10 ;
   private short Gx_err ;
   private int trnEnded ;
   private int GX_JID ;
   private int AnyError14 ;
   private int GXActiveErrHndl ;
   private long A112TAM07_UPD_CNT ;
   private long gxTv_SdtTAM07_USER_Tam07_upd_cnt_Z ;
   private long Z112TAM07_UPD_CNT ;
   private long O112TAM07_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode10 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A35TAM07_CRT_DATETIME ;
   private java.util.Date A37TAM07_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTAM07_USER_Tam07_upd_datetime_Z ;
   private java.util.Date Z35TAM07_CRT_DATETIME ;
   private java.util.Date Z37TAM07_UPD_DATETIME ;
   private boolean n35TAM07_CRT_DATETIME ;
   private boolean n76TAM07_CRT_USER_ID ;
   private boolean n37TAM07_UPD_DATETIME ;
   private boolean n77TAM07_UPD_USER_ID ;
   private boolean n112TAM07_UPD_CNT ;
   private boolean n2TAM07_USER_NM ;
   private boolean n126TAM07_USER_KANA_NM ;
   private boolean n7TAM07_PWD ;
   private boolean n147TAM07_SITE_ID ;
   private boolean n593TAM07_EMAIL ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n36TAM07_CRT_PROG_NM ;
   private boolean n38TAM07_UPD_PROG_NM ;
   private boolean n14TAM07_AUTH_CD ;
   private boolean Gx_longc ;
   private String Z8TAM07_USER_ID ;
   private String A8TAM07_USER_ID ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A2TAM07_USER_NM ;
   private String A126TAM07_USER_KANA_NM ;
   private String A7TAM07_PWD ;
   private String A14TAM07_AUTH_CD ;
   private String A147TAM07_SITE_ID ;
   private String A16TAM07_DEL_FLG ;
   private String A76TAM07_CRT_USER_ID ;
   private String A36TAM07_CRT_PROG_NM ;
   private String A77TAM07_UPD_USER_ID ;
   private String A38TAM07_UPD_PROG_NM ;
   private String gxTv_SdtTAM07_USER_Tam07_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_user_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_user_kana_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_pwd_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_auth_cd_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_site_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_email_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_del_flg_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_crt_prog_nm_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_user_id_Z ;
   private String gxTv_SdtTAM07_USER_Tam07_upd_prog_nm_Z ;
   private String Z76TAM07_CRT_USER_ID ;
   private String Z77TAM07_UPD_USER_ID ;
   private String Z2TAM07_USER_NM ;
   private String Z126TAM07_USER_KANA_NM ;
   private String Z7TAM07_PWD ;
   private String Z147TAM07_SITE_ID ;
   private String Z593TAM07_EMAIL ;
   private String A593TAM07_EMAIL ;
   private String Z16TAM07_DEL_FLG ;
   private String Z36TAM07_CRT_PROG_NM ;
   private String Z38TAM07_UPD_PROG_NM ;
   private String Z14TAM07_AUTH_CD ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTAM07_USER bcTAM07_USER ;
   private IDataStoreProvider pr_default ;
   private String[] BC000A5_A8TAM07_USER_ID ;
   private java.util.Date[] BC000A5_A35TAM07_CRT_DATETIME ;
   private boolean[] BC000A5_n35TAM07_CRT_DATETIME ;
   private String[] BC000A5_A76TAM07_CRT_USER_ID ;
   private boolean[] BC000A5_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A5_A37TAM07_UPD_DATETIME ;
   private boolean[] BC000A5_n37TAM07_UPD_DATETIME ;
   private String[] BC000A5_A77TAM07_UPD_USER_ID ;
   private boolean[] BC000A5_n77TAM07_UPD_USER_ID ;
   private long[] BC000A5_A112TAM07_UPD_CNT ;
   private boolean[] BC000A5_n112TAM07_UPD_CNT ;
   private String[] BC000A5_A2TAM07_USER_NM ;
   private boolean[] BC000A5_n2TAM07_USER_NM ;
   private String[] BC000A5_A126TAM07_USER_KANA_NM ;
   private boolean[] BC000A5_n126TAM07_USER_KANA_NM ;
   private String[] BC000A5_A7TAM07_PWD ;
   private boolean[] BC000A5_n7TAM07_PWD ;
   private String[] BC000A5_A147TAM07_SITE_ID ;
   private boolean[] BC000A5_n147TAM07_SITE_ID ;
   private String[] BC000A5_A593TAM07_EMAIL ;
   private boolean[] BC000A5_n593TAM07_EMAIL ;
   private String[] BC000A5_A16TAM07_DEL_FLG ;
   private boolean[] BC000A5_n16TAM07_DEL_FLG ;
   private String[] BC000A5_A36TAM07_CRT_PROG_NM ;
   private boolean[] BC000A5_n36TAM07_CRT_PROG_NM ;
   private String[] BC000A5_A38TAM07_UPD_PROG_NM ;
   private boolean[] BC000A5_n38TAM07_UPD_PROG_NM ;
   private String[] BC000A5_A14TAM07_AUTH_CD ;
   private boolean[] BC000A5_n14TAM07_AUTH_CD ;
   private String[] BC000A4_A14TAM07_AUTH_CD ;
   private boolean[] BC000A4_n14TAM07_AUTH_CD ;
   private String[] BC000A6_A8TAM07_USER_ID ;
   private String[] BC000A3_A8TAM07_USER_ID ;
   private java.util.Date[] BC000A3_A35TAM07_CRT_DATETIME ;
   private boolean[] BC000A3_n35TAM07_CRT_DATETIME ;
   private String[] BC000A3_A76TAM07_CRT_USER_ID ;
   private boolean[] BC000A3_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A3_A37TAM07_UPD_DATETIME ;
   private boolean[] BC000A3_n37TAM07_UPD_DATETIME ;
   private String[] BC000A3_A77TAM07_UPD_USER_ID ;
   private boolean[] BC000A3_n77TAM07_UPD_USER_ID ;
   private long[] BC000A3_A112TAM07_UPD_CNT ;
   private boolean[] BC000A3_n112TAM07_UPD_CNT ;
   private String[] BC000A3_A2TAM07_USER_NM ;
   private boolean[] BC000A3_n2TAM07_USER_NM ;
   private String[] BC000A3_A126TAM07_USER_KANA_NM ;
   private boolean[] BC000A3_n126TAM07_USER_KANA_NM ;
   private String[] BC000A3_A7TAM07_PWD ;
   private boolean[] BC000A3_n7TAM07_PWD ;
   private String[] BC000A3_A147TAM07_SITE_ID ;
   private boolean[] BC000A3_n147TAM07_SITE_ID ;
   private String[] BC000A3_A593TAM07_EMAIL ;
   private boolean[] BC000A3_n593TAM07_EMAIL ;
   private String[] BC000A3_A16TAM07_DEL_FLG ;
   private boolean[] BC000A3_n16TAM07_DEL_FLG ;
   private String[] BC000A3_A36TAM07_CRT_PROG_NM ;
   private boolean[] BC000A3_n36TAM07_CRT_PROG_NM ;
   private String[] BC000A3_A38TAM07_UPD_PROG_NM ;
   private boolean[] BC000A3_n38TAM07_UPD_PROG_NM ;
   private String[] BC000A3_A14TAM07_AUTH_CD ;
   private boolean[] BC000A3_n14TAM07_AUTH_CD ;
   private String[] BC000A2_A8TAM07_USER_ID ;
   private java.util.Date[] BC000A2_A35TAM07_CRT_DATETIME ;
   private boolean[] BC000A2_n35TAM07_CRT_DATETIME ;
   private String[] BC000A2_A76TAM07_CRT_USER_ID ;
   private boolean[] BC000A2_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A2_A37TAM07_UPD_DATETIME ;
   private boolean[] BC000A2_n37TAM07_UPD_DATETIME ;
   private String[] BC000A2_A77TAM07_UPD_USER_ID ;
   private boolean[] BC000A2_n77TAM07_UPD_USER_ID ;
   private long[] BC000A2_A112TAM07_UPD_CNT ;
   private boolean[] BC000A2_n112TAM07_UPD_CNT ;
   private String[] BC000A2_A2TAM07_USER_NM ;
   private boolean[] BC000A2_n2TAM07_USER_NM ;
   private String[] BC000A2_A126TAM07_USER_KANA_NM ;
   private boolean[] BC000A2_n126TAM07_USER_KANA_NM ;
   private String[] BC000A2_A7TAM07_PWD ;
   private boolean[] BC000A2_n7TAM07_PWD ;
   private String[] BC000A2_A147TAM07_SITE_ID ;
   private boolean[] BC000A2_n147TAM07_SITE_ID ;
   private String[] BC000A2_A593TAM07_EMAIL ;
   private boolean[] BC000A2_n593TAM07_EMAIL ;
   private String[] BC000A2_A16TAM07_DEL_FLG ;
   private boolean[] BC000A2_n16TAM07_DEL_FLG ;
   private String[] BC000A2_A36TAM07_CRT_PROG_NM ;
   private boolean[] BC000A2_n36TAM07_CRT_PROG_NM ;
   private String[] BC000A2_A38TAM07_UPD_PROG_NM ;
   private boolean[] BC000A2_n38TAM07_UPD_PROG_NM ;
   private String[] BC000A2_A14TAM07_AUTH_CD ;
   private boolean[] BC000A2_n14TAM07_AUTH_CD ;
   private String[] BC000A10_A625TBW03_SESSION_ID ;
   private String[] BC000A10_A626TBW03_APP_ID ;
   private String[] BC000A10_A627TBW03_DISP_DATETIME ;
   private long[] BC000A10_A628TBW03_STUDY_ID ;
   private int[] BC000A10_A629TBW03_SUBJECT_ID ;
   private short[] BC000A10_A630TBW03_CRF_ID ;
   private String[] BC000A11_A625TBW03_SESSION_ID ;
   private String[] BC000A11_A626TBW03_APP_ID ;
   private String[] BC000A11_A627TBW03_DISP_DATETIME ;
   private long[] BC000A11_A628TBW03_STUDY_ID ;
   private int[] BC000A11_A629TBW03_SUBJECT_ID ;
   private short[] BC000A11_A630TBW03_CRF_ID ;
   private String[] BC000A12_A625TBW03_SESSION_ID ;
   private String[] BC000A12_A626TBW03_APP_ID ;
   private String[] BC000A12_A627TBW03_DISP_DATETIME ;
   private long[] BC000A12_A628TBW03_STUDY_ID ;
   private int[] BC000A12_A629TBW03_SUBJECT_ID ;
   private short[] BC000A12_A630TBW03_CRF_ID ;
   private String[] BC000A13_A625TBW03_SESSION_ID ;
   private String[] BC000A13_A626TBW03_APP_ID ;
   private String[] BC000A13_A627TBW03_DISP_DATETIME ;
   private long[] BC000A13_A628TBW03_STUDY_ID ;
   private int[] BC000A13_A629TBW03_SUBJECT_ID ;
   private short[] BC000A13_A630TBW03_CRF_ID ;
   private String[] BC000A14_A625TBW03_SESSION_ID ;
   private String[] BC000A14_A626TBW03_APP_ID ;
   private String[] BC000A14_A627TBW03_DISP_DATETIME ;
   private long[] BC000A14_A628TBW03_STUDY_ID ;
   private int[] BC000A14_A629TBW03_SUBJECT_ID ;
   private short[] BC000A14_A630TBW03_CRF_ID ;
   private String[] BC000A15_A625TBW03_SESSION_ID ;
   private String[] BC000A15_A626TBW03_APP_ID ;
   private String[] BC000A15_A627TBW03_DISP_DATETIME ;
   private long[] BC000A15_A628TBW03_STUDY_ID ;
   private int[] BC000A15_A629TBW03_SUBJECT_ID ;
   private short[] BC000A15_A630TBW03_CRF_ID ;
   private long[] BC000A16_A207TBM23_STUDY_ID ;
   private String[] BC000A16_A208TBM23_USER_ID ;
   private String[] BC000A16_A407TBM23_STYDY_AUTH_CD ;
   private String[] BC000A17_A8TAM07_USER_ID ;
   private java.util.Date[] BC000A17_A35TAM07_CRT_DATETIME ;
   private boolean[] BC000A17_n35TAM07_CRT_DATETIME ;
   private String[] BC000A17_A76TAM07_CRT_USER_ID ;
   private boolean[] BC000A17_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] BC000A17_A37TAM07_UPD_DATETIME ;
   private boolean[] BC000A17_n37TAM07_UPD_DATETIME ;
   private String[] BC000A17_A77TAM07_UPD_USER_ID ;
   private boolean[] BC000A17_n77TAM07_UPD_USER_ID ;
   private long[] BC000A17_A112TAM07_UPD_CNT ;
   private boolean[] BC000A17_n112TAM07_UPD_CNT ;
   private String[] BC000A17_A2TAM07_USER_NM ;
   private boolean[] BC000A17_n2TAM07_USER_NM ;
   private String[] BC000A17_A126TAM07_USER_KANA_NM ;
   private boolean[] BC000A17_n126TAM07_USER_KANA_NM ;
   private String[] BC000A17_A7TAM07_PWD ;
   private boolean[] BC000A17_n7TAM07_PWD ;
   private String[] BC000A17_A147TAM07_SITE_ID ;
   private boolean[] BC000A17_n147TAM07_SITE_ID ;
   private String[] BC000A17_A593TAM07_EMAIL ;
   private boolean[] BC000A17_n593TAM07_EMAIL ;
   private String[] BC000A17_A16TAM07_DEL_FLG ;
   private boolean[] BC000A17_n16TAM07_DEL_FLG ;
   private String[] BC000A17_A36TAM07_CRT_PROG_NM ;
   private boolean[] BC000A17_n36TAM07_CRT_PROG_NM ;
   private String[] BC000A17_A38TAM07_UPD_PROG_NM ;
   private boolean[] BC000A17_n38TAM07_UPD_PROG_NM ;
   private String[] BC000A17_A14TAM07_AUTH_CD ;
   private boolean[] BC000A17_n14TAM07_AUTH_CD ;
}

final  class tam07_user_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000A2", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A3", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A4", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000A5", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000A6", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000A7", "INSERT INTO `TAM07_USER` (`TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000A8", "UPDATE `TAM07_USER` SET `TAM07_CRT_DATETIME`=?, `TAM07_CRT_USER_ID`=?, `TAM07_UPD_DATETIME`=?, `TAM07_UPD_USER_ID`=?, `TAM07_UPD_CNT`=?, `TAM07_USER_NM`=?, `TAM07_USER_KANA_NM`=?, `TAM07_PWD`=?, `TAM07_SITE_ID`=?, `TAM07_EMAIL`=?, `TAM07_DEL_FLG`=?, `TAM07_CRT_PROG_NM`=?, `TAM07_UPD_PROG_NM`=?, `TAM07_AUTH_CD`=?  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000A9", "DELETE FROM `TAM07_USER`  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000A10", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A11", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_CRT_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A12", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_INPUT_END_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A13", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_APPROVAL_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A14", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPLOAD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A15", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_LOCK_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A16", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("BC000A17", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 30);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 256);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 2);
               }
               break;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(1, (java.util.Date)parms[1], false);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 128);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(5, ((Number) parms[9]).longValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 30);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 256);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 2);
               }
               stmt.setVarchar(15, (String)parms[28], 128, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
      }
   }

}

