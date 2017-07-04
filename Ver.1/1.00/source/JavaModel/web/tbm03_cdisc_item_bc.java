/*
               File: tbm03_cdisc_item_bc
        Description: CDISC項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:22.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm03_cdisc_item_bc extends GXWebPanel implements IGxSilentTrn
{
   public tbm03_cdisc_item_bc( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm03_cdisc_item_bc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm03_cdisc_item_bc.class ));
   }

   public tbm03_cdisc_item_bc( int remoteHandle ,
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
         /* Execute user event: e120F2 */
         e120F2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
            Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
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

   public void confirm_0F0( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            onDeleteControls0F14( ) ;
         }
         else
         {
            checkExtendedTable0F14( ) ;
            if ( AnyError == 0 )
            {
               zm0F14( 9) ;
            }
            closeExtendedTableCursors0F14( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
      }
   }

   public void e110F2( )
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

   public void e120F2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A162TBM03_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A163TBM03_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A164TBM03_VAR_DESC + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A165TBM03_SDTM_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A166TBM03_CDASH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A410TBM03_INPUT_TYPE_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A167TBM03_REQUIRED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A602TBM03_SAS_FIELD_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A168TBM03_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A169TBM03_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A178TBM03_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A179TBM03_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A180TBM03_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A181TBM03_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A182TBM03_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A183TBM03_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A184TBM03_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A185TBM03_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
   }

   public void S1171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0F14( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         Z179TBM03_CRT_DATETIME = A179TBM03_CRT_DATETIME ;
         Z180TBM03_CRT_USER_ID = A180TBM03_CRT_USER_ID ;
         Z182TBM03_UPD_DATETIME = A182TBM03_UPD_DATETIME ;
         Z183TBM03_UPD_USER_ID = A183TBM03_UPD_USER_ID ;
         Z185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         Z164TBM03_VAR_DESC = A164TBM03_VAR_DESC ;
         Z165TBM03_SDTM_FLG = A165TBM03_SDTM_FLG ;
         Z166TBM03_CDASH_FLG = A166TBM03_CDASH_FLG ;
         Z410TBM03_INPUT_TYPE_DIV = A410TBM03_INPUT_TYPE_DIV ;
         Z167TBM03_REQUIRED_FLG = A167TBM03_REQUIRED_FLG ;
         Z602TBM03_SAS_FIELD_NM = A602TBM03_SAS_FIELD_NM ;
         Z624TBM03_ODM_DATA_TYPE = A624TBM03_ODM_DATA_TYPE ;
         Z168TBM03_NOTE = A168TBM03_NOTE ;
         Z169TBM03_ORDER = A169TBM03_ORDER ;
         Z885TBM03_VERSION = A885TBM03_VERSION ;
         Z178TBM03_DEL_FLG = A178TBM03_DEL_FLG ;
         Z181TBM03_CRT_PROG_NM = A181TBM03_CRT_PROG_NM ;
         Z184TBM03_UPD_PROG_NM = A184TBM03_UPD_PROG_NM ;
      }
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
      }
      if ( GX_JID == -8 )
      {
         Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
         Z179TBM03_CRT_DATETIME = A179TBM03_CRT_DATETIME ;
         Z180TBM03_CRT_USER_ID = A180TBM03_CRT_USER_ID ;
         Z182TBM03_UPD_DATETIME = A182TBM03_UPD_DATETIME ;
         Z183TBM03_UPD_USER_ID = A183TBM03_UPD_USER_ID ;
         Z185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         Z164TBM03_VAR_DESC = A164TBM03_VAR_DESC ;
         Z165TBM03_SDTM_FLG = A165TBM03_SDTM_FLG ;
         Z166TBM03_CDASH_FLG = A166TBM03_CDASH_FLG ;
         Z410TBM03_INPUT_TYPE_DIV = A410TBM03_INPUT_TYPE_DIV ;
         Z167TBM03_REQUIRED_FLG = A167TBM03_REQUIRED_FLG ;
         Z602TBM03_SAS_FIELD_NM = A602TBM03_SAS_FIELD_NM ;
         Z624TBM03_ODM_DATA_TYPE = A624TBM03_ODM_DATA_TYPE ;
         Z168TBM03_NOTE = A168TBM03_NOTE ;
         Z169TBM03_ORDER = A169TBM03_ORDER ;
         Z885TBM03_VERSION = A885TBM03_VERSION ;
         Z178TBM03_DEL_FLG = A178TBM03_DEL_FLG ;
         Z181TBM03_CRT_PROG_NM = A181TBM03_CRT_PROG_NM ;
         Z184TBM03_UPD_PROG_NM = A184TBM03_UPD_PROG_NM ;
         Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
   }

   public void load0F14( )
   {
      /* Using cursor BC000F5 */
      pr_default.execute(3, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A179TBM03_CRT_DATETIME = BC000F5_A179TBM03_CRT_DATETIME[0] ;
         n179TBM03_CRT_DATETIME = BC000F5_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = BC000F5_A180TBM03_CRT_USER_ID[0] ;
         n180TBM03_CRT_USER_ID = BC000F5_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = BC000F5_A182TBM03_UPD_DATETIME[0] ;
         n182TBM03_UPD_DATETIME = BC000F5_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = BC000F5_A183TBM03_UPD_USER_ID[0] ;
         n183TBM03_UPD_USER_ID = BC000F5_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = BC000F5_A185TBM03_UPD_CNT[0] ;
         n185TBM03_UPD_CNT = BC000F5_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = BC000F5_A164TBM03_VAR_DESC[0] ;
         n164TBM03_VAR_DESC = BC000F5_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = BC000F5_A165TBM03_SDTM_FLG[0] ;
         n165TBM03_SDTM_FLG = BC000F5_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = BC000F5_A166TBM03_CDASH_FLG[0] ;
         n166TBM03_CDASH_FLG = BC000F5_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = BC000F5_A410TBM03_INPUT_TYPE_DIV[0] ;
         n410TBM03_INPUT_TYPE_DIV = BC000F5_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = BC000F5_A167TBM03_REQUIRED_FLG[0] ;
         n167TBM03_REQUIRED_FLG = BC000F5_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = BC000F5_A602TBM03_SAS_FIELD_NM[0] ;
         n602TBM03_SAS_FIELD_NM = BC000F5_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = BC000F5_A624TBM03_ODM_DATA_TYPE[0] ;
         n624TBM03_ODM_DATA_TYPE = BC000F5_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = BC000F5_A168TBM03_NOTE[0] ;
         n168TBM03_NOTE = BC000F5_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = BC000F5_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = BC000F5_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = BC000F5_A885TBM03_VERSION[0] ;
         n885TBM03_VERSION = BC000F5_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = BC000F5_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = BC000F5_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = BC000F5_A181TBM03_CRT_PROG_NM[0] ;
         n181TBM03_CRT_PROG_NM = BC000F5_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = BC000F5_A184TBM03_UPD_PROG_NM[0] ;
         n184TBM03_UPD_PROG_NM = BC000F5_n184TBM03_UPD_PROG_NM[0] ;
         zm0F14( -8) ;
      }
      pr_default.close(3);
      onLoadActions0F14( ) ;
   }

   public void onLoadActions0F14( )
   {
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
   }

   public void checkExtendedTable0F14( )
   {
      standaloneModal( ) ;
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      /* Using cursor BC000F4 */
      pr_default.execute(2, new Object[] {A162TBM03_DOM_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError162 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
         AnyError = (short)(1) ;
      }
      if ( AnyError162 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A179TBM03_CRT_DATETIME) || (( A179TBM03_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A179TBM03_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A182TBM03_UPD_DATETIME) || (( A182TBM03_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A182TBM03_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0F14( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void getKey0F14( )
   {
      /* Using cursor BC000F6 */
      pr_default.execute(4, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound14 = (short)(1) ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor BC000F3 */
      pr_default.execute(1, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0F14( 8) ;
         RcdFound14 = (short)(1) ;
         A163TBM03_DOM_VAR_NM = BC000F3_A163TBM03_DOM_VAR_NM[0] ;
         A179TBM03_CRT_DATETIME = BC000F3_A179TBM03_CRT_DATETIME[0] ;
         n179TBM03_CRT_DATETIME = BC000F3_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = BC000F3_A180TBM03_CRT_USER_ID[0] ;
         n180TBM03_CRT_USER_ID = BC000F3_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = BC000F3_A182TBM03_UPD_DATETIME[0] ;
         n182TBM03_UPD_DATETIME = BC000F3_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = BC000F3_A183TBM03_UPD_USER_ID[0] ;
         n183TBM03_UPD_USER_ID = BC000F3_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = BC000F3_A185TBM03_UPD_CNT[0] ;
         n185TBM03_UPD_CNT = BC000F3_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = BC000F3_A164TBM03_VAR_DESC[0] ;
         n164TBM03_VAR_DESC = BC000F3_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = BC000F3_A165TBM03_SDTM_FLG[0] ;
         n165TBM03_SDTM_FLG = BC000F3_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = BC000F3_A166TBM03_CDASH_FLG[0] ;
         n166TBM03_CDASH_FLG = BC000F3_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = BC000F3_A410TBM03_INPUT_TYPE_DIV[0] ;
         n410TBM03_INPUT_TYPE_DIV = BC000F3_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = BC000F3_A167TBM03_REQUIRED_FLG[0] ;
         n167TBM03_REQUIRED_FLG = BC000F3_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = BC000F3_A602TBM03_SAS_FIELD_NM[0] ;
         n602TBM03_SAS_FIELD_NM = BC000F3_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = BC000F3_A624TBM03_ODM_DATA_TYPE[0] ;
         n624TBM03_ODM_DATA_TYPE = BC000F3_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = BC000F3_A168TBM03_NOTE[0] ;
         n168TBM03_NOTE = BC000F3_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = BC000F3_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = BC000F3_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = BC000F3_A885TBM03_VERSION[0] ;
         n885TBM03_VERSION = BC000F3_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = BC000F3_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = BC000F3_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = BC000F3_A181TBM03_CRT_PROG_NM[0] ;
         n181TBM03_CRT_PROG_NM = BC000F3_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = BC000F3_A184TBM03_UPD_PROG_NM[0] ;
         n184TBM03_UPD_PROG_NM = BC000F3_n184TBM03_UPD_PROG_NM[0] ;
         A162TBM03_DOM_CD = BC000F3_A162TBM03_DOM_CD[0] ;
         O185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         n185TBM03_UPD_CNT = false ;
         Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
         Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         load0F14( ) ;
         Gx_mode = sMode14 ;
      }
      else
      {
         RcdFound14 = (short)(0) ;
         initializeNonKey0F14( ) ;
         sMode14 = Gx_mode ;
         Gx_mode = "DSP" ;
         standaloneModal( ) ;
         Gx_mode = sMode14 ;
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0F14( ) ;
      if ( RcdFound14 == 0 )
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
      confirm_0F0( ) ;
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

   public void checkOptimisticConcurrency0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor BC000F2 */
         pr_default.execute(0, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z179TBM03_CRT_DATETIME.equals( BC000F2_A179TBM03_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z180TBM03_CRT_USER_ID, BC000F2_A180TBM03_CRT_USER_ID[0]) != 0 ) || !( Z182TBM03_UPD_DATETIME.equals( BC000F2_A182TBM03_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z183TBM03_UPD_USER_ID, BC000F2_A183TBM03_UPD_USER_ID[0]) != 0 ) || ( Z185TBM03_UPD_CNT != BC000F2_A185TBM03_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z164TBM03_VAR_DESC, BC000F2_A164TBM03_VAR_DESC[0]) != 0 ) || ( GXutil.strcmp(Z165TBM03_SDTM_FLG, BC000F2_A165TBM03_SDTM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z166TBM03_CDASH_FLG, BC000F2_A166TBM03_CDASH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z410TBM03_INPUT_TYPE_DIV, BC000F2_A410TBM03_INPUT_TYPE_DIV[0]) != 0 ) || ( GXutil.strcmp(Z167TBM03_REQUIRED_FLG, BC000F2_A167TBM03_REQUIRED_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z602TBM03_SAS_FIELD_NM, BC000F2_A602TBM03_SAS_FIELD_NM[0]) != 0 ) || ( GXutil.strcmp(Z624TBM03_ODM_DATA_TYPE, BC000F2_A624TBM03_ODM_DATA_TYPE[0]) != 0 ) || ( GXutil.strcmp(Z168TBM03_NOTE, BC000F2_A168TBM03_NOTE[0]) != 0 ) || ( Z169TBM03_ORDER != BC000F2_A169TBM03_ORDER[0] ) || ( GXutil.strcmp(Z885TBM03_VERSION, BC000F2_A885TBM03_VERSION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z178TBM03_DEL_FLG, BC000F2_A178TBM03_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z181TBM03_CRT_PROG_NM, BC000F2_A181TBM03_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z184TBM03_UPD_PROG_NM, BC000F2_A184TBM03_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM03_CDISC_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0F14( 0) ;
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000F7 */
                  pr_default.execute(5, new Object[] {A163TBM03_DOM_VAR_NM, new Boolean(n179TBM03_CRT_DATETIME), A179TBM03_CRT_DATETIME, new Boolean(n180TBM03_CRT_USER_ID), A180TBM03_CRT_USER_ID, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT), new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n181TBM03_CRT_PROG_NM), A181TBM03_CRT_PROG_NM, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, A162TBM03_DOM_CD});
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
            load0F14( ) ;
         }
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void update0F14( )
   {
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0F14( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0F14( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor BC000F8 */
                  pr_default.execute(6, new Object[] {new Boolean(n179TBM03_CRT_DATETIME), A179TBM03_CRT_DATETIME, new Boolean(n180TBM03_CRT_USER_ID), A180TBM03_CRT_USER_ID, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT), new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n181TBM03_CRT_PROG_NM), A181TBM03_CRT_PROG_NM, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
                  if ( (pr_default.getStatus(6) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM03_CDISC_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0F14( ) ;
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
         endLevel0F14( ) ;
      }
      closeExtendedTableCursors0F14( ) ;
   }

   public void deferredUpdate0F14( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      beforeValidate0F14( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0F14( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0F14( ) ;
         afterConfirm0F14( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0F14( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor BC000F9 */
               pr_default.execute(7, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
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
      sMode14 = Gx_mode ;
      Gx_mode = "DLT" ;
      endLevel0F14( ) ;
      Gx_mode = sMode14 ;
   }

   public void onDeleteControls0F14( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      }
   }

   public void endLevel0F14( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0F14( ) ;
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

   public void scanKeyStart0F14( )
   {
      /* Using cursor BC000F10 */
      pr_default.execute(8, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
      RcdFound14 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A163TBM03_DOM_VAR_NM = BC000F10_A163TBM03_DOM_VAR_NM[0] ;
         A179TBM03_CRT_DATETIME = BC000F10_A179TBM03_CRT_DATETIME[0] ;
         n179TBM03_CRT_DATETIME = BC000F10_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = BC000F10_A180TBM03_CRT_USER_ID[0] ;
         n180TBM03_CRT_USER_ID = BC000F10_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = BC000F10_A182TBM03_UPD_DATETIME[0] ;
         n182TBM03_UPD_DATETIME = BC000F10_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = BC000F10_A183TBM03_UPD_USER_ID[0] ;
         n183TBM03_UPD_USER_ID = BC000F10_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = BC000F10_A185TBM03_UPD_CNT[0] ;
         n185TBM03_UPD_CNT = BC000F10_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = BC000F10_A164TBM03_VAR_DESC[0] ;
         n164TBM03_VAR_DESC = BC000F10_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = BC000F10_A165TBM03_SDTM_FLG[0] ;
         n165TBM03_SDTM_FLG = BC000F10_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = BC000F10_A166TBM03_CDASH_FLG[0] ;
         n166TBM03_CDASH_FLG = BC000F10_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = BC000F10_A410TBM03_INPUT_TYPE_DIV[0] ;
         n410TBM03_INPUT_TYPE_DIV = BC000F10_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = BC000F10_A167TBM03_REQUIRED_FLG[0] ;
         n167TBM03_REQUIRED_FLG = BC000F10_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = BC000F10_A602TBM03_SAS_FIELD_NM[0] ;
         n602TBM03_SAS_FIELD_NM = BC000F10_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = BC000F10_A624TBM03_ODM_DATA_TYPE[0] ;
         n624TBM03_ODM_DATA_TYPE = BC000F10_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = BC000F10_A168TBM03_NOTE[0] ;
         n168TBM03_NOTE = BC000F10_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = BC000F10_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = BC000F10_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = BC000F10_A885TBM03_VERSION[0] ;
         n885TBM03_VERSION = BC000F10_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = BC000F10_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = BC000F10_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = BC000F10_A181TBM03_CRT_PROG_NM[0] ;
         n181TBM03_CRT_PROG_NM = BC000F10_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = BC000F10_A184TBM03_UPD_PROG_NM[0] ;
         n184TBM03_UPD_PROG_NM = BC000F10_n184TBM03_UPD_PROG_NM[0] ;
         A162TBM03_DOM_CD = BC000F10_A162TBM03_DOM_CD[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanKeyNext0F14( )
   {
      pr_default.readNext(8);
      RcdFound14 = (short)(0) ;
      scanKeyLoad0F14( ) ;
   }

   public void scanKeyLoad0F14( )
   {
      sMode14 = Gx_mode ;
      Gx_mode = "DSP" ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound14 = (short)(1) ;
         A163TBM03_DOM_VAR_NM = BC000F10_A163TBM03_DOM_VAR_NM[0] ;
         A179TBM03_CRT_DATETIME = BC000F10_A179TBM03_CRT_DATETIME[0] ;
         n179TBM03_CRT_DATETIME = BC000F10_n179TBM03_CRT_DATETIME[0] ;
         A180TBM03_CRT_USER_ID = BC000F10_A180TBM03_CRT_USER_ID[0] ;
         n180TBM03_CRT_USER_ID = BC000F10_n180TBM03_CRT_USER_ID[0] ;
         A182TBM03_UPD_DATETIME = BC000F10_A182TBM03_UPD_DATETIME[0] ;
         n182TBM03_UPD_DATETIME = BC000F10_n182TBM03_UPD_DATETIME[0] ;
         A183TBM03_UPD_USER_ID = BC000F10_A183TBM03_UPD_USER_ID[0] ;
         n183TBM03_UPD_USER_ID = BC000F10_n183TBM03_UPD_USER_ID[0] ;
         A185TBM03_UPD_CNT = BC000F10_A185TBM03_UPD_CNT[0] ;
         n185TBM03_UPD_CNT = BC000F10_n185TBM03_UPD_CNT[0] ;
         A164TBM03_VAR_DESC = BC000F10_A164TBM03_VAR_DESC[0] ;
         n164TBM03_VAR_DESC = BC000F10_n164TBM03_VAR_DESC[0] ;
         A165TBM03_SDTM_FLG = BC000F10_A165TBM03_SDTM_FLG[0] ;
         n165TBM03_SDTM_FLG = BC000F10_n165TBM03_SDTM_FLG[0] ;
         A166TBM03_CDASH_FLG = BC000F10_A166TBM03_CDASH_FLG[0] ;
         n166TBM03_CDASH_FLG = BC000F10_n166TBM03_CDASH_FLG[0] ;
         A410TBM03_INPUT_TYPE_DIV = BC000F10_A410TBM03_INPUT_TYPE_DIV[0] ;
         n410TBM03_INPUT_TYPE_DIV = BC000F10_n410TBM03_INPUT_TYPE_DIV[0] ;
         A167TBM03_REQUIRED_FLG = BC000F10_A167TBM03_REQUIRED_FLG[0] ;
         n167TBM03_REQUIRED_FLG = BC000F10_n167TBM03_REQUIRED_FLG[0] ;
         A602TBM03_SAS_FIELD_NM = BC000F10_A602TBM03_SAS_FIELD_NM[0] ;
         n602TBM03_SAS_FIELD_NM = BC000F10_n602TBM03_SAS_FIELD_NM[0] ;
         A624TBM03_ODM_DATA_TYPE = BC000F10_A624TBM03_ODM_DATA_TYPE[0] ;
         n624TBM03_ODM_DATA_TYPE = BC000F10_n624TBM03_ODM_DATA_TYPE[0] ;
         A168TBM03_NOTE = BC000F10_A168TBM03_NOTE[0] ;
         n168TBM03_NOTE = BC000F10_n168TBM03_NOTE[0] ;
         A169TBM03_ORDER = BC000F10_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = BC000F10_n169TBM03_ORDER[0] ;
         A885TBM03_VERSION = BC000F10_A885TBM03_VERSION[0] ;
         n885TBM03_VERSION = BC000F10_n885TBM03_VERSION[0] ;
         A178TBM03_DEL_FLG = BC000F10_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = BC000F10_n178TBM03_DEL_FLG[0] ;
         A181TBM03_CRT_PROG_NM = BC000F10_A181TBM03_CRT_PROG_NM[0] ;
         n181TBM03_CRT_PROG_NM = BC000F10_n181TBM03_CRT_PROG_NM[0] ;
         A184TBM03_UPD_PROG_NM = BC000F10_A184TBM03_UPD_PROG_NM[0] ;
         n184TBM03_UPD_PROG_NM = BC000F10_n184TBM03_UPD_PROG_NM[0] ;
         A162TBM03_DOM_CD = BC000F10_A162TBM03_DOM_CD[0] ;
      }
      Gx_mode = sMode14 ;
   }

   public void scanKeyEnd0F14( )
   {
      pr_default.close(8);
   }

   public void afterConfirm0F14( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0F14( )
   {
      /* Before Insert Rules */
      A179TBM03_CRT_DATETIME = GXutil.now( ) ;
      n179TBM03_CRT_DATETIME = false ;
      GXt_char1 = A180TBM03_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A180TBM03_CRT_USER_ID = GXt_char1 ;
      n180TBM03_CRT_USER_ID = false ;
      A182TBM03_UPD_DATETIME = GXutil.now( ) ;
      n182TBM03_UPD_DATETIME = false ;
      GXt_char1 = A183TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A183TBM03_UPD_USER_ID = GXt_char1 ;
      n183TBM03_UPD_USER_ID = false ;
      A185TBM03_UPD_CNT = (long)(O185TBM03_UPD_CNT+1) ;
      n185TBM03_UPD_CNT = false ;
   }

   public void beforeUpdate0F14( )
   {
      /* Before Update Rules */
      A182TBM03_UPD_DATETIME = GXutil.now( ) ;
      n182TBM03_UPD_DATETIME = false ;
      GXt_char1 = A183TBM03_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm03_cdisc_item_bc.this.GXt_char1 = GXv_char2[0] ;
      A183TBM03_UPD_USER_ID = GXt_char1 ;
      n183TBM03_UPD_USER_ID = false ;
      A185TBM03_UPD_CNT = (long)(O185TBM03_UPD_CNT+1) ;
      n185TBM03_UPD_CNT = false ;
   }

   public void beforeDelete0F14( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0F14( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0F14( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0F14( )
   {
   }

   public void addRow0F14( )
   {
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
   }

   public void readRow0F14( )
   {
      RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
   }

   public void initializeNonKey0F14( )
   {
      A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n179TBM03_CRT_DATETIME = false ;
      A180TBM03_CRT_USER_ID = "" ;
      n180TBM03_CRT_USER_ID = false ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n182TBM03_UPD_DATETIME = false ;
      A183TBM03_UPD_USER_ID = "" ;
      n183TBM03_UPD_USER_ID = false ;
      A185TBM03_UPD_CNT = 0 ;
      n185TBM03_UPD_CNT = false ;
      A164TBM03_VAR_DESC = "" ;
      n164TBM03_VAR_DESC = false ;
      A165TBM03_SDTM_FLG = "" ;
      n165TBM03_SDTM_FLG = false ;
      A166TBM03_CDASH_FLG = "" ;
      n166TBM03_CDASH_FLG = false ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      n410TBM03_INPUT_TYPE_DIV = false ;
      A167TBM03_REQUIRED_FLG = "" ;
      n167TBM03_REQUIRED_FLG = false ;
      A602TBM03_SAS_FIELD_NM = "" ;
      n602TBM03_SAS_FIELD_NM = false ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      n624TBM03_ODM_DATA_TYPE = false ;
      A168TBM03_NOTE = "" ;
      n168TBM03_NOTE = false ;
      A169TBM03_ORDER = 0 ;
      n169TBM03_ORDER = false ;
      A885TBM03_VERSION = "" ;
      n885TBM03_VERSION = false ;
      A178TBM03_DEL_FLG = "" ;
      n178TBM03_DEL_FLG = false ;
      A181TBM03_CRT_PROG_NM = "" ;
      n181TBM03_CRT_PROG_NM = false ;
      A184TBM03_UPD_PROG_NM = "" ;
      n184TBM03_UPD_PROG_NM = false ;
      O185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
      n185TBM03_UPD_CNT = false ;
   }

   public void initAll0F14( )
   {
      A162TBM03_DOM_CD = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      initializeNonKey0F14( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void VarsToRow14( SdtTBM03_CDISC_ITEM obj14 )
   {
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime( A179TBM03_CRT_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id( A180TBM03_CRT_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime( A182TBM03_UPD_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id( A183TBM03_UPD_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt( A185TBM03_UPD_CNT );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc( A164TBM03_VAR_DESC );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg( A165TBM03_SDTM_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg( A166TBM03_CDASH_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div( A410TBM03_INPUT_TYPE_DIV );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg( A167TBM03_REQUIRED_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm( A602TBM03_SAS_FIELD_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type( A624TBM03_ODM_DATA_TYPE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note( A168TBM03_NOTE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order( A169TBM03_ORDER );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version( A885TBM03_VERSION );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg( A178TBM03_DEL_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm( A181TBM03_CRT_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm( A184TBM03_UPD_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd( A162TBM03_DOM_CD );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm( A163TBM03_DOM_VAR_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z( Z162TBM03_DOM_CD );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z( Z163TBM03_DOM_VAR_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z( Z164TBM03_VAR_DESC );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z( Z165TBM03_SDTM_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z( Z166TBM03_CDASH_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z( Z410TBM03_INPUT_TYPE_DIV );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z( Z167TBM03_REQUIRED_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z( Z602TBM03_SAS_FIELD_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z( Z624TBM03_ODM_DATA_TYPE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z( Z168TBM03_NOTE );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z( Z169TBM03_ORDER );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z( Z885TBM03_VERSION );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z( Z178TBM03_DEL_FLG );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z( Z179TBM03_CRT_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z( Z180TBM03_CRT_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z( Z181TBM03_CRT_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z( Z182TBM03_UPD_DATETIME );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z( Z183TBM03_UPD_USER_ID );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z( Z184TBM03_UPD_PROG_NM );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z( Z185TBM03_UPD_CNT );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N( (byte)((byte)((n164TBM03_VAR_DESC)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N( (byte)((byte)((n165TBM03_SDTM_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N( (byte)((byte)((n166TBM03_CDASH_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N( (byte)((byte)((n410TBM03_INPUT_TYPE_DIV)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N( (byte)((byte)((n167TBM03_REQUIRED_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N( (byte)((byte)((n602TBM03_SAS_FIELD_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N( (byte)((byte)((n624TBM03_ODM_DATA_TYPE)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N( (byte)((byte)((n168TBM03_NOTE)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N( (byte)((byte)((n169TBM03_ORDER)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N( (byte)((byte)((n885TBM03_VERSION)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N( (byte)((byte)((n178TBM03_DEL_FLG)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N( (byte)((byte)((n179TBM03_CRT_DATETIME)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N( (byte)((byte)((n180TBM03_CRT_USER_ID)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N( (byte)((byte)((n181TBM03_CRT_PROG_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N( (byte)((byte)((n182TBM03_UPD_DATETIME)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N( (byte)((byte)((n183TBM03_UPD_USER_ID)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N( (byte)((byte)((n184TBM03_UPD_PROG_NM)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N( (byte)((byte)((n185TBM03_UPD_CNT)?1:0)) );
      obj14.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
   }

   public void RowToVars14( SdtTBM03_CDISC_ITEM obj14 ,
                            int forceLoad )
   {
      Gx_mode = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
      A179TBM03_CRT_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime() ;
      n179TBM03_CRT_DATETIME = false ;
      A180TBM03_CRT_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id() ;
      n180TBM03_CRT_USER_ID = false ;
      A182TBM03_UPD_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime() ;
      n182TBM03_UPD_DATETIME = false ;
      A183TBM03_UPD_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id() ;
      n183TBM03_UPD_USER_ID = false ;
      A185TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt() ;
      n185TBM03_UPD_CNT = false ;
      A164TBM03_VAR_DESC = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc() ;
      n164TBM03_VAR_DESC = false ;
      A165TBM03_SDTM_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg() ;
      n165TBM03_SDTM_FLG = false ;
      A166TBM03_CDASH_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg() ;
      n166TBM03_CDASH_FLG = false ;
      A410TBM03_INPUT_TYPE_DIV = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div() ;
      n410TBM03_INPUT_TYPE_DIV = false ;
      A167TBM03_REQUIRED_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg() ;
      n167TBM03_REQUIRED_FLG = false ;
      A602TBM03_SAS_FIELD_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm() ;
      n602TBM03_SAS_FIELD_NM = false ;
      A624TBM03_ODM_DATA_TYPE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type() ;
      n624TBM03_ODM_DATA_TYPE = false ;
      A168TBM03_NOTE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note() ;
      n168TBM03_NOTE = false ;
      A169TBM03_ORDER = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order() ;
      n169TBM03_ORDER = false ;
      A885TBM03_VERSION = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version() ;
      n885TBM03_VERSION = false ;
      A178TBM03_DEL_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg() ;
      n178TBM03_DEL_FLG = false ;
      A181TBM03_CRT_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm() ;
      n181TBM03_CRT_PROG_NM = false ;
      A184TBM03_UPD_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm() ;
      n184TBM03_UPD_PROG_NM = false ;
      A162TBM03_DOM_CD = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd() ;
      A163TBM03_DOM_VAR_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm() ;
      Z162TBM03_DOM_CD = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z() ;
      Z163TBM03_DOM_VAR_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z() ;
      Z164TBM03_VAR_DESC = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z() ;
      Z165TBM03_SDTM_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z() ;
      Z166TBM03_CDASH_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z() ;
      Z410TBM03_INPUT_TYPE_DIV = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z() ;
      Z167TBM03_REQUIRED_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z() ;
      Z602TBM03_SAS_FIELD_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z() ;
      Z624TBM03_ODM_DATA_TYPE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z() ;
      Z168TBM03_NOTE = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z() ;
      Z169TBM03_ORDER = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z() ;
      Z885TBM03_VERSION = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z() ;
      Z178TBM03_DEL_FLG = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z() ;
      Z179TBM03_CRT_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z() ;
      Z180TBM03_CRT_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z() ;
      Z181TBM03_CRT_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z() ;
      Z182TBM03_UPD_DATETIME = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z() ;
      Z183TBM03_UPD_USER_ID = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z() ;
      Z184TBM03_UPD_PROG_NM = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z() ;
      Z185TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z() ;
      O185TBM03_UPD_CNT = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z() ;
      n164TBM03_VAR_DESC = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N()==0)?false:true) ;
      n165TBM03_SDTM_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N()==0)?false:true) ;
      n166TBM03_CDASH_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N()==0)?false:true) ;
      n410TBM03_INPUT_TYPE_DIV = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N()==0)?false:true) ;
      n167TBM03_REQUIRED_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N()==0)?false:true) ;
      n602TBM03_SAS_FIELD_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N()==0)?false:true) ;
      n624TBM03_ODM_DATA_TYPE = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N()==0)?false:true) ;
      n168TBM03_NOTE = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N()==0)?false:true) ;
      n169TBM03_ORDER = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N()==0)?false:true) ;
      n885TBM03_VERSION = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N()==0)?false:true) ;
      n178TBM03_DEL_FLG = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N()==0)?false:true) ;
      n179TBM03_CRT_DATETIME = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N()==0)?false:true) ;
      n180TBM03_CRT_USER_ID = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N()==0)?false:true) ;
      n181TBM03_CRT_PROG_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N()==0)?false:true) ;
      n182TBM03_UPD_DATETIME = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N()==0)?false:true) ;
      n183TBM03_UPD_USER_ID = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N()==0)?false:true) ;
      n184TBM03_UPD_PROG_NM = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N()==0)?false:true) ;
      n185TBM03_UPD_CNT = (boolean)((obj14.getgxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N()==0)?false:true) ;
      Gx_mode = obj14.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
   }

   public void LoadKey( Object[] obj )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      A162TBM03_DOM_CD = (String)getParm(obj,0) ;
      A163TBM03_DOM_VAR_NM = (String)getParm(obj,1) ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      initializeNonKey0F14( ) ;
      scanKeyStart0F14( ) ;
      if ( RcdFound14 == 0 )
      {
         Gx_mode = "INS" ;
         /* Using cursor BC000F11 */
         pr_default.execute(9, new Object[] {A162TBM03_DOM_CD});
         if ( (pr_default.getStatus(9) == 101) )
         {
            AnyError162 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'CDISC項目マスタ・ドメインサブタイプ'", "ForeignKeyNotFound", 1, "TBM03_DOM_CD");
            AnyError = (short)(1) ;
         }
         if ( AnyError162 == 0 )
         {
         }
         pr_default.close(9);
      }
      else
      {
         Gx_mode = "UPD" ;
         Z162TBM03_DOM_CD = A162TBM03_DOM_CD ;
         Z163TBM03_DOM_VAR_NM = A163TBM03_DOM_VAR_NM ;
         O185TBM03_UPD_CNT = A185TBM03_UPD_CNT ;
         n185TBM03_UPD_CNT = false ;
      }
      zm0F14( -8) ;
      sMode14 = Gx_mode ;
      Gx_mode = "DSP" ;
      onLoadActions0F14( ) ;
      Gx_mode = sMode14 ;
      addRow0F14( ) ;
      scanKeyEnd0F14( ) ;
      if ( RcdFound14 == 0 )
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
      RowToVars14( bcTBM03_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(1) ;
      getKey0F14( ) ;
      if ( RcdFound14 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
         {
            A162TBM03_DOM_CD = Z162TBM03_DOM_CD ;
            A163TBM03_DOM_VAR_NM = Z163TBM03_DOM_VAR_NM ;
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
            update0F14( ) ;
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
            if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
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
                  insert0F14( ) ;
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
                  insert0F14( ) ;
               }
            }
         }
      }
      afterTrn( ) ;
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void Check( )
   {
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      AnyError = (short)(0) ;
      httpContext.GX_msglist.removeAllItems();
      RowToVars14( bcTBM03_CDISC_ITEM, 0) ;
      nKeyPressed = (byte)(3) ;
      IsConfirmed = (short)(0) ;
      getKey0F14( ) ;
      if ( RcdFound14 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
            AnyError = (short)(1) ;
         }
         else if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
         {
            A162TBM03_DOM_CD = Z162TBM03_DOM_CD ;
            A163TBM03_DOM_VAR_NM = Z163TBM03_DOM_VAR_NM ;
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
         if ( ( GXutil.strcmp(A162TBM03_DOM_CD, Z162TBM03_DOM_CD) != 0 ) || ( GXutil.strcmp(A163TBM03_DOM_VAR_NM, Z163TBM03_DOM_VAR_NM) != 0 ) )
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
      Application.rollback(context, remoteHandle, "DEFAULT", "tbm03_cdisc_item_bc");
      VarsToRow14( bcTBM03_CDISC_ITEM) ;
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
      Gx_mode = bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode() ;
      return Gx_mode ;
   }

   public void SetMode( String lMode )
   {
      Gx_mode = lMode ;
      bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( Gx_mode );
   }

   public void SetSDT( SdtTBM03_CDISC_ITEM sdt ,
                       byte sdtToBc )
   {
      if ( sdt != bcTBM03_CDISC_ITEM )
      {
         bcTBM03_CDISC_ITEM = sdt ;
         if ( GXutil.strcmp(bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( "INS" );
         }
         if ( sdtToBc == 1 )
         {
            VarsToRow14( bcTBM03_CDISC_ITEM) ;
         }
         else
         {
            RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
         }
      }
      else
      {
         if ( GXutil.strcmp(bcTBM03_CDISC_ITEM.getgxTv_SdtTBM03_CDISC_ITEM_Mode(), "") == 0 )
         {
            bcTBM03_CDISC_ITEM.setgxTv_SdtTBM03_CDISC_ITEM_Mode( "INS" );
         }
      }
   }

   public void ReloadFromSDT( )
   {
      RowToVars14( bcTBM03_CDISC_ITEM, 1) ;
   }

   public SdtTBM03_CDISC_ITEM getTBM03_CDISC_ITEM_BC( )
   {
      return bcTBM03_CDISC_ITEM ;
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
      pr_default.close(9);
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
                  /* Execute user subroutine: S1171 */
                  S1171 ();
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
      Z162TBM03_DOM_CD = "" ;
      A162TBM03_DOM_CD = "" ;
      Z163TBM03_DOM_VAR_NM = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      AV8W_BC_FLG = "" ;
      AV9Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      A164TBM03_VAR_DESC = "" ;
      A165TBM03_SDTM_FLG = "" ;
      A166TBM03_CDASH_FLG = "" ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      A167TBM03_REQUIRED_FLG = "" ;
      A602TBM03_SAS_FIELD_NM = "" ;
      A168TBM03_NOTE = "" ;
      A178TBM03_DEL_FLG = "" ;
      A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A180TBM03_CRT_USER_ID = "" ;
      A181TBM03_CRT_PROG_NM = "" ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A183TBM03_UPD_USER_ID = "" ;
      A184TBM03_UPD_PROG_NM = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z = GXutil.resetTime( GXutil.nullDate() );
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z = "" ;
      gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z = "" ;
      Z179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z180TBM03_CRT_USER_ID = "" ;
      Z182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z183TBM03_UPD_USER_ID = "" ;
      Z164TBM03_VAR_DESC = "" ;
      Z165TBM03_SDTM_FLG = "" ;
      Z166TBM03_CDASH_FLG = "" ;
      Z410TBM03_INPUT_TYPE_DIV = "" ;
      Z167TBM03_REQUIRED_FLG = "" ;
      Z602TBM03_SAS_FIELD_NM = "" ;
      Z624TBM03_ODM_DATA_TYPE = "" ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      Z168TBM03_NOTE = "" ;
      Z885TBM03_VERSION = "" ;
      A885TBM03_VERSION = "" ;
      Z178TBM03_DEL_FLG = "" ;
      Z181TBM03_CRT_PROG_NM = "" ;
      Z184TBM03_UPD_PROG_NM = "" ;
      BC000F5_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F5_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F5_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F5_A180TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F5_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F5_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F5_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F5_A183TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F5_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F5_A185TBM03_UPD_CNT = new long[1] ;
      BC000F5_n185TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F5_A164TBM03_VAR_DESC = new String[] {""} ;
      BC000F5_n164TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F5_A165TBM03_SDTM_FLG = new String[] {""} ;
      BC000F5_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F5_A166TBM03_CDASH_FLG = new String[] {""} ;
      BC000F5_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F5_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F5_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F5_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F5_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F5_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F5_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F5_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F5_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F5_A168TBM03_NOTE = new String[] {""} ;
      BC000F5_n168TBM03_NOTE = new boolean[] {false} ;
      BC000F5_A169TBM03_ORDER = new int[1] ;
      BC000F5_n169TBM03_ORDER = new boolean[] {false} ;
      BC000F5_A885TBM03_VERSION = new String[] {""} ;
      BC000F5_n885TBM03_VERSION = new boolean[] {false} ;
      BC000F5_A178TBM03_DEL_FLG = new String[] {""} ;
      BC000F5_n178TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F5_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F5_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F5_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F5_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F5_A162TBM03_DOM_CD = new String[] {""} ;
      BC000F4_A162TBM03_DOM_CD = new String[] {""} ;
      BC000F6_A162TBM03_DOM_CD = new String[] {""} ;
      BC000F6_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F3_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F3_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F3_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F3_A180TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F3_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F3_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F3_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F3_A183TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F3_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F3_A185TBM03_UPD_CNT = new long[1] ;
      BC000F3_n185TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F3_A164TBM03_VAR_DESC = new String[] {""} ;
      BC000F3_n164TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F3_A165TBM03_SDTM_FLG = new String[] {""} ;
      BC000F3_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F3_A166TBM03_CDASH_FLG = new String[] {""} ;
      BC000F3_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F3_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F3_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F3_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F3_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F3_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F3_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F3_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F3_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F3_A168TBM03_NOTE = new String[] {""} ;
      BC000F3_n168TBM03_NOTE = new boolean[] {false} ;
      BC000F3_A169TBM03_ORDER = new int[1] ;
      BC000F3_n169TBM03_ORDER = new boolean[] {false} ;
      BC000F3_A885TBM03_VERSION = new String[] {""} ;
      BC000F3_n885TBM03_VERSION = new boolean[] {false} ;
      BC000F3_A178TBM03_DEL_FLG = new String[] {""} ;
      BC000F3_n178TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F3_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F3_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F3_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F3_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F3_A162TBM03_DOM_CD = new String[] {""} ;
      sMode14 = "" ;
      BC000F2_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F2_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F2_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F2_A180TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F2_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F2_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F2_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F2_A183TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F2_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F2_A185TBM03_UPD_CNT = new long[1] ;
      BC000F2_n185TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F2_A164TBM03_VAR_DESC = new String[] {""} ;
      BC000F2_n164TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F2_A165TBM03_SDTM_FLG = new String[] {""} ;
      BC000F2_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F2_A166TBM03_CDASH_FLG = new String[] {""} ;
      BC000F2_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F2_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F2_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F2_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F2_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F2_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F2_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F2_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F2_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F2_A168TBM03_NOTE = new String[] {""} ;
      BC000F2_n168TBM03_NOTE = new boolean[] {false} ;
      BC000F2_A169TBM03_ORDER = new int[1] ;
      BC000F2_n169TBM03_ORDER = new boolean[] {false} ;
      BC000F2_A885TBM03_VERSION = new String[] {""} ;
      BC000F2_n885TBM03_VERSION = new boolean[] {false} ;
      BC000F2_A178TBM03_DEL_FLG = new String[] {""} ;
      BC000F2_n178TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F2_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F2_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F2_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F2_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F2_A162TBM03_DOM_CD = new String[] {""} ;
      BC000F10_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      BC000F10_A179TBM03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F10_n179TBM03_CRT_DATETIME = new boolean[] {false} ;
      BC000F10_A180TBM03_CRT_USER_ID = new String[] {""} ;
      BC000F10_n180TBM03_CRT_USER_ID = new boolean[] {false} ;
      BC000F10_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      BC000F10_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      BC000F10_A183TBM03_UPD_USER_ID = new String[] {""} ;
      BC000F10_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      BC000F10_A185TBM03_UPD_CNT = new long[1] ;
      BC000F10_n185TBM03_UPD_CNT = new boolean[] {false} ;
      BC000F10_A164TBM03_VAR_DESC = new String[] {""} ;
      BC000F10_n164TBM03_VAR_DESC = new boolean[] {false} ;
      BC000F10_A165TBM03_SDTM_FLG = new String[] {""} ;
      BC000F10_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      BC000F10_A166TBM03_CDASH_FLG = new String[] {""} ;
      BC000F10_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      BC000F10_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      BC000F10_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      BC000F10_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      BC000F10_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      BC000F10_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      BC000F10_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      BC000F10_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      BC000F10_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      BC000F10_A168TBM03_NOTE = new String[] {""} ;
      BC000F10_n168TBM03_NOTE = new boolean[] {false} ;
      BC000F10_A169TBM03_ORDER = new int[1] ;
      BC000F10_n169TBM03_ORDER = new boolean[] {false} ;
      BC000F10_A885TBM03_VERSION = new String[] {""} ;
      BC000F10_n885TBM03_VERSION = new boolean[] {false} ;
      BC000F10_A178TBM03_DEL_FLG = new String[] {""} ;
      BC000F10_n178TBM03_DEL_FLG = new boolean[] {false} ;
      BC000F10_A181TBM03_CRT_PROG_NM = new String[] {""} ;
      BC000F10_n181TBM03_CRT_PROG_NM = new boolean[] {false} ;
      BC000F10_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      BC000F10_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      BC000F10_A162TBM03_DOM_CD = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      BC000F11_A162TBM03_DOM_CD = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm03_cdisc_item_bc__default(),
         new Object[] {
             new Object[] {
            BC000F2_A163TBM03_DOM_VAR_NM, BC000F2_A179TBM03_CRT_DATETIME, BC000F2_n179TBM03_CRT_DATETIME, BC000F2_A180TBM03_CRT_USER_ID, BC000F2_n180TBM03_CRT_USER_ID, BC000F2_A182TBM03_UPD_DATETIME, BC000F2_n182TBM03_UPD_DATETIME, BC000F2_A183TBM03_UPD_USER_ID, BC000F2_n183TBM03_UPD_USER_ID, BC000F2_A185TBM03_UPD_CNT,
            BC000F2_n185TBM03_UPD_CNT, BC000F2_A164TBM03_VAR_DESC, BC000F2_n164TBM03_VAR_DESC, BC000F2_A165TBM03_SDTM_FLG, BC000F2_n165TBM03_SDTM_FLG, BC000F2_A166TBM03_CDASH_FLG, BC000F2_n166TBM03_CDASH_FLG, BC000F2_A410TBM03_INPUT_TYPE_DIV, BC000F2_n410TBM03_INPUT_TYPE_DIV, BC000F2_A167TBM03_REQUIRED_FLG,
            BC000F2_n167TBM03_REQUIRED_FLG, BC000F2_A602TBM03_SAS_FIELD_NM, BC000F2_n602TBM03_SAS_FIELD_NM, BC000F2_A624TBM03_ODM_DATA_TYPE, BC000F2_n624TBM03_ODM_DATA_TYPE, BC000F2_A168TBM03_NOTE, BC000F2_n168TBM03_NOTE, BC000F2_A169TBM03_ORDER, BC000F2_n169TBM03_ORDER, BC000F2_A885TBM03_VERSION,
            BC000F2_n885TBM03_VERSION, BC000F2_A178TBM03_DEL_FLG, BC000F2_n178TBM03_DEL_FLG, BC000F2_A181TBM03_CRT_PROG_NM, BC000F2_n181TBM03_CRT_PROG_NM, BC000F2_A184TBM03_UPD_PROG_NM, BC000F2_n184TBM03_UPD_PROG_NM, BC000F2_A162TBM03_DOM_CD
            }
            , new Object[] {
            BC000F3_A163TBM03_DOM_VAR_NM, BC000F3_A179TBM03_CRT_DATETIME, BC000F3_n179TBM03_CRT_DATETIME, BC000F3_A180TBM03_CRT_USER_ID, BC000F3_n180TBM03_CRT_USER_ID, BC000F3_A182TBM03_UPD_DATETIME, BC000F3_n182TBM03_UPD_DATETIME, BC000F3_A183TBM03_UPD_USER_ID, BC000F3_n183TBM03_UPD_USER_ID, BC000F3_A185TBM03_UPD_CNT,
            BC000F3_n185TBM03_UPD_CNT, BC000F3_A164TBM03_VAR_DESC, BC000F3_n164TBM03_VAR_DESC, BC000F3_A165TBM03_SDTM_FLG, BC000F3_n165TBM03_SDTM_FLG, BC000F3_A166TBM03_CDASH_FLG, BC000F3_n166TBM03_CDASH_FLG, BC000F3_A410TBM03_INPUT_TYPE_DIV, BC000F3_n410TBM03_INPUT_TYPE_DIV, BC000F3_A167TBM03_REQUIRED_FLG,
            BC000F3_n167TBM03_REQUIRED_FLG, BC000F3_A602TBM03_SAS_FIELD_NM, BC000F3_n602TBM03_SAS_FIELD_NM, BC000F3_A624TBM03_ODM_DATA_TYPE, BC000F3_n624TBM03_ODM_DATA_TYPE, BC000F3_A168TBM03_NOTE, BC000F3_n168TBM03_NOTE, BC000F3_A169TBM03_ORDER, BC000F3_n169TBM03_ORDER, BC000F3_A885TBM03_VERSION,
            BC000F3_n885TBM03_VERSION, BC000F3_A178TBM03_DEL_FLG, BC000F3_n178TBM03_DEL_FLG, BC000F3_A181TBM03_CRT_PROG_NM, BC000F3_n181TBM03_CRT_PROG_NM, BC000F3_A184TBM03_UPD_PROG_NM, BC000F3_n184TBM03_UPD_PROG_NM, BC000F3_A162TBM03_DOM_CD
            }
            , new Object[] {
            BC000F4_A162TBM03_DOM_CD
            }
            , new Object[] {
            BC000F5_A163TBM03_DOM_VAR_NM, BC000F5_A179TBM03_CRT_DATETIME, BC000F5_n179TBM03_CRT_DATETIME, BC000F5_A180TBM03_CRT_USER_ID, BC000F5_n180TBM03_CRT_USER_ID, BC000F5_A182TBM03_UPD_DATETIME, BC000F5_n182TBM03_UPD_DATETIME, BC000F5_A183TBM03_UPD_USER_ID, BC000F5_n183TBM03_UPD_USER_ID, BC000F5_A185TBM03_UPD_CNT,
            BC000F5_n185TBM03_UPD_CNT, BC000F5_A164TBM03_VAR_DESC, BC000F5_n164TBM03_VAR_DESC, BC000F5_A165TBM03_SDTM_FLG, BC000F5_n165TBM03_SDTM_FLG, BC000F5_A166TBM03_CDASH_FLG, BC000F5_n166TBM03_CDASH_FLG, BC000F5_A410TBM03_INPUT_TYPE_DIV, BC000F5_n410TBM03_INPUT_TYPE_DIV, BC000F5_A167TBM03_REQUIRED_FLG,
            BC000F5_n167TBM03_REQUIRED_FLG, BC000F5_A602TBM03_SAS_FIELD_NM, BC000F5_n602TBM03_SAS_FIELD_NM, BC000F5_A624TBM03_ODM_DATA_TYPE, BC000F5_n624TBM03_ODM_DATA_TYPE, BC000F5_A168TBM03_NOTE, BC000F5_n168TBM03_NOTE, BC000F5_A169TBM03_ORDER, BC000F5_n169TBM03_ORDER, BC000F5_A885TBM03_VERSION,
            BC000F5_n885TBM03_VERSION, BC000F5_A178TBM03_DEL_FLG, BC000F5_n178TBM03_DEL_FLG, BC000F5_A181TBM03_CRT_PROG_NM, BC000F5_n181TBM03_CRT_PROG_NM, BC000F5_A184TBM03_UPD_PROG_NM, BC000F5_n184TBM03_UPD_PROG_NM, BC000F5_A162TBM03_DOM_CD
            }
            , new Object[] {
            BC000F6_A162TBM03_DOM_CD, BC000F6_A163TBM03_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            BC000F10_A163TBM03_DOM_VAR_NM, BC000F10_A179TBM03_CRT_DATETIME, BC000F10_n179TBM03_CRT_DATETIME, BC000F10_A180TBM03_CRT_USER_ID, BC000F10_n180TBM03_CRT_USER_ID, BC000F10_A182TBM03_UPD_DATETIME, BC000F10_n182TBM03_UPD_DATETIME, BC000F10_A183TBM03_UPD_USER_ID, BC000F10_n183TBM03_UPD_USER_ID, BC000F10_A185TBM03_UPD_CNT,
            BC000F10_n185TBM03_UPD_CNT, BC000F10_A164TBM03_VAR_DESC, BC000F10_n164TBM03_VAR_DESC, BC000F10_A165TBM03_SDTM_FLG, BC000F10_n165TBM03_SDTM_FLG, BC000F10_A166TBM03_CDASH_FLG, BC000F10_n166TBM03_CDASH_FLG, BC000F10_A410TBM03_INPUT_TYPE_DIV, BC000F10_n410TBM03_INPUT_TYPE_DIV, BC000F10_A167TBM03_REQUIRED_FLG,
            BC000F10_n167TBM03_REQUIRED_FLG, BC000F10_A602TBM03_SAS_FIELD_NM, BC000F10_n602TBM03_SAS_FIELD_NM, BC000F10_A624TBM03_ODM_DATA_TYPE, BC000F10_n624TBM03_ODM_DATA_TYPE, BC000F10_A168TBM03_NOTE, BC000F10_n168TBM03_NOTE, BC000F10_A169TBM03_ORDER, BC000F10_n169TBM03_ORDER, BC000F10_A885TBM03_VERSION,
            BC000F10_n885TBM03_VERSION, BC000F10_A178TBM03_DEL_FLG, BC000F10_n178TBM03_DEL_FLG, BC000F10_A181TBM03_CRT_PROG_NM, BC000F10_n181TBM03_CRT_PROG_NM, BC000F10_A184TBM03_UPD_PROG_NM, BC000F10_n184TBM03_UPD_PROG_NM, BC000F10_A162TBM03_DOM_CD
            }
            , new Object[] {
            BC000F11_A162TBM03_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM03_CDISC_ITEM_BC" ;
      /* Execute Start event if defined. */
      /* Execute user event: e110F2 */
      e110F2 ();
   }

   private byte nKeyPressed ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_N ;
   private byte gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_N ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound14 ;
   private short Gx_err ;
   private int trnEnded ;
   private int A169TBM03_ORDER ;
   private int gxTv_SdtTBM03_CDISC_ITEM_Tbm03_order_Z ;
   private int GX_JID ;
   private int Z169TBM03_ORDER ;
   private int AnyError162 ;
   private int GXActiveErrHndl ;
   private long A185TBM03_UPD_CNT ;
   private long gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_cnt_Z ;
   private long Z185TBM03_UPD_CNT ;
   private long O185TBM03_UPD_CNT ;
   private String scmdbuf ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String Gx_mode ;
   private String AV9Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String sMode14 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private java.util.Date A179TBM03_CRT_DATETIME ;
   private java.util.Date A182TBM03_UPD_DATETIME ;
   private java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_datetime_Z ;
   private java.util.Date gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_datetime_Z ;
   private java.util.Date Z179TBM03_CRT_DATETIME ;
   private java.util.Date Z182TBM03_UPD_DATETIME ;
   private boolean n179TBM03_CRT_DATETIME ;
   private boolean n180TBM03_CRT_USER_ID ;
   private boolean n182TBM03_UPD_DATETIME ;
   private boolean n183TBM03_UPD_USER_ID ;
   private boolean n185TBM03_UPD_CNT ;
   private boolean n164TBM03_VAR_DESC ;
   private boolean n165TBM03_SDTM_FLG ;
   private boolean n166TBM03_CDASH_FLG ;
   private boolean n410TBM03_INPUT_TYPE_DIV ;
   private boolean n167TBM03_REQUIRED_FLG ;
   private boolean n602TBM03_SAS_FIELD_NM ;
   private boolean n624TBM03_ODM_DATA_TYPE ;
   private boolean n168TBM03_NOTE ;
   private boolean n169TBM03_ORDER ;
   private boolean n885TBM03_VERSION ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n181TBM03_CRT_PROG_NM ;
   private boolean n184TBM03_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private String Z162TBM03_DOM_CD ;
   private String A162TBM03_DOM_CD ;
   private String Z163TBM03_DOM_VAR_NM ;
   private String A163TBM03_DOM_VAR_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private String A164TBM03_VAR_DESC ;
   private String A165TBM03_SDTM_FLG ;
   private String A166TBM03_CDASH_FLG ;
   private String A410TBM03_INPUT_TYPE_DIV ;
   private String A167TBM03_REQUIRED_FLG ;
   private String A602TBM03_SAS_FIELD_NM ;
   private String A168TBM03_NOTE ;
   private String A178TBM03_DEL_FLG ;
   private String A180TBM03_CRT_USER_ID ;
   private String A181TBM03_CRT_PROG_NM ;
   private String A183TBM03_UPD_USER_ID ;
   private String A184TBM03_UPD_PROG_NM ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_cd_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_dom_var_nm_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_var_desc_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sdtm_flg_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_cdash_flg_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_input_type_div_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_required_flg_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_sas_field_nm_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_odm_data_type_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_note_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_version_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_del_flg_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_user_id_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_crt_prog_nm_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_user_id_Z ;
   private String gxTv_SdtTBM03_CDISC_ITEM_Tbm03_upd_prog_nm_Z ;
   private String Z180TBM03_CRT_USER_ID ;
   private String Z183TBM03_UPD_USER_ID ;
   private String Z164TBM03_VAR_DESC ;
   private String Z165TBM03_SDTM_FLG ;
   private String Z166TBM03_CDASH_FLG ;
   private String Z410TBM03_INPUT_TYPE_DIV ;
   private String Z167TBM03_REQUIRED_FLG ;
   private String Z602TBM03_SAS_FIELD_NM ;
   private String Z624TBM03_ODM_DATA_TYPE ;
   private String A624TBM03_ODM_DATA_TYPE ;
   private String Z168TBM03_NOTE ;
   private String Z885TBM03_VERSION ;
   private String A885TBM03_VERSION ;
   private String Z178TBM03_DEL_FLG ;
   private String Z181TBM03_CRT_PROG_NM ;
   private String Z184TBM03_UPD_PROG_NM ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private SdtTBM03_CDISC_ITEM bcTBM03_CDISC_ITEM ;
   private IDataStoreProvider pr_default ;
   private String[] BC000F5_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F5_A179TBM03_CRT_DATETIME ;
   private boolean[] BC000F5_n179TBM03_CRT_DATETIME ;
   private String[] BC000F5_A180TBM03_CRT_USER_ID ;
   private boolean[] BC000F5_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F5_A182TBM03_UPD_DATETIME ;
   private boolean[] BC000F5_n182TBM03_UPD_DATETIME ;
   private String[] BC000F5_A183TBM03_UPD_USER_ID ;
   private boolean[] BC000F5_n183TBM03_UPD_USER_ID ;
   private long[] BC000F5_A185TBM03_UPD_CNT ;
   private boolean[] BC000F5_n185TBM03_UPD_CNT ;
   private String[] BC000F5_A164TBM03_VAR_DESC ;
   private boolean[] BC000F5_n164TBM03_VAR_DESC ;
   private String[] BC000F5_A165TBM03_SDTM_FLG ;
   private boolean[] BC000F5_n165TBM03_SDTM_FLG ;
   private String[] BC000F5_A166TBM03_CDASH_FLG ;
   private boolean[] BC000F5_n166TBM03_CDASH_FLG ;
   private String[] BC000F5_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F5_n410TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F5_A167TBM03_REQUIRED_FLG ;
   private boolean[] BC000F5_n167TBM03_REQUIRED_FLG ;
   private String[] BC000F5_A602TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F5_n602TBM03_SAS_FIELD_NM ;
   private String[] BC000F5_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F5_n624TBM03_ODM_DATA_TYPE ;
   private String[] BC000F5_A168TBM03_NOTE ;
   private boolean[] BC000F5_n168TBM03_NOTE ;
   private int[] BC000F5_A169TBM03_ORDER ;
   private boolean[] BC000F5_n169TBM03_ORDER ;
   private String[] BC000F5_A885TBM03_VERSION ;
   private boolean[] BC000F5_n885TBM03_VERSION ;
   private String[] BC000F5_A178TBM03_DEL_FLG ;
   private boolean[] BC000F5_n178TBM03_DEL_FLG ;
   private String[] BC000F5_A181TBM03_CRT_PROG_NM ;
   private boolean[] BC000F5_n181TBM03_CRT_PROG_NM ;
   private String[] BC000F5_A184TBM03_UPD_PROG_NM ;
   private boolean[] BC000F5_n184TBM03_UPD_PROG_NM ;
   private String[] BC000F5_A162TBM03_DOM_CD ;
   private String[] BC000F4_A162TBM03_DOM_CD ;
   private String[] BC000F6_A162TBM03_DOM_CD ;
   private String[] BC000F6_A163TBM03_DOM_VAR_NM ;
   private String[] BC000F3_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F3_A179TBM03_CRT_DATETIME ;
   private boolean[] BC000F3_n179TBM03_CRT_DATETIME ;
   private String[] BC000F3_A180TBM03_CRT_USER_ID ;
   private boolean[] BC000F3_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F3_A182TBM03_UPD_DATETIME ;
   private boolean[] BC000F3_n182TBM03_UPD_DATETIME ;
   private String[] BC000F3_A183TBM03_UPD_USER_ID ;
   private boolean[] BC000F3_n183TBM03_UPD_USER_ID ;
   private long[] BC000F3_A185TBM03_UPD_CNT ;
   private boolean[] BC000F3_n185TBM03_UPD_CNT ;
   private String[] BC000F3_A164TBM03_VAR_DESC ;
   private boolean[] BC000F3_n164TBM03_VAR_DESC ;
   private String[] BC000F3_A165TBM03_SDTM_FLG ;
   private boolean[] BC000F3_n165TBM03_SDTM_FLG ;
   private String[] BC000F3_A166TBM03_CDASH_FLG ;
   private boolean[] BC000F3_n166TBM03_CDASH_FLG ;
   private String[] BC000F3_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F3_n410TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F3_A167TBM03_REQUIRED_FLG ;
   private boolean[] BC000F3_n167TBM03_REQUIRED_FLG ;
   private String[] BC000F3_A602TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F3_n602TBM03_SAS_FIELD_NM ;
   private String[] BC000F3_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F3_n624TBM03_ODM_DATA_TYPE ;
   private String[] BC000F3_A168TBM03_NOTE ;
   private boolean[] BC000F3_n168TBM03_NOTE ;
   private int[] BC000F3_A169TBM03_ORDER ;
   private boolean[] BC000F3_n169TBM03_ORDER ;
   private String[] BC000F3_A885TBM03_VERSION ;
   private boolean[] BC000F3_n885TBM03_VERSION ;
   private String[] BC000F3_A178TBM03_DEL_FLG ;
   private boolean[] BC000F3_n178TBM03_DEL_FLG ;
   private String[] BC000F3_A181TBM03_CRT_PROG_NM ;
   private boolean[] BC000F3_n181TBM03_CRT_PROG_NM ;
   private String[] BC000F3_A184TBM03_UPD_PROG_NM ;
   private boolean[] BC000F3_n184TBM03_UPD_PROG_NM ;
   private String[] BC000F3_A162TBM03_DOM_CD ;
   private String[] BC000F2_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F2_A179TBM03_CRT_DATETIME ;
   private boolean[] BC000F2_n179TBM03_CRT_DATETIME ;
   private String[] BC000F2_A180TBM03_CRT_USER_ID ;
   private boolean[] BC000F2_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F2_A182TBM03_UPD_DATETIME ;
   private boolean[] BC000F2_n182TBM03_UPD_DATETIME ;
   private String[] BC000F2_A183TBM03_UPD_USER_ID ;
   private boolean[] BC000F2_n183TBM03_UPD_USER_ID ;
   private long[] BC000F2_A185TBM03_UPD_CNT ;
   private boolean[] BC000F2_n185TBM03_UPD_CNT ;
   private String[] BC000F2_A164TBM03_VAR_DESC ;
   private boolean[] BC000F2_n164TBM03_VAR_DESC ;
   private String[] BC000F2_A165TBM03_SDTM_FLG ;
   private boolean[] BC000F2_n165TBM03_SDTM_FLG ;
   private String[] BC000F2_A166TBM03_CDASH_FLG ;
   private boolean[] BC000F2_n166TBM03_CDASH_FLG ;
   private String[] BC000F2_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F2_n410TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F2_A167TBM03_REQUIRED_FLG ;
   private boolean[] BC000F2_n167TBM03_REQUIRED_FLG ;
   private String[] BC000F2_A602TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F2_n602TBM03_SAS_FIELD_NM ;
   private String[] BC000F2_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F2_n624TBM03_ODM_DATA_TYPE ;
   private String[] BC000F2_A168TBM03_NOTE ;
   private boolean[] BC000F2_n168TBM03_NOTE ;
   private int[] BC000F2_A169TBM03_ORDER ;
   private boolean[] BC000F2_n169TBM03_ORDER ;
   private String[] BC000F2_A885TBM03_VERSION ;
   private boolean[] BC000F2_n885TBM03_VERSION ;
   private String[] BC000F2_A178TBM03_DEL_FLG ;
   private boolean[] BC000F2_n178TBM03_DEL_FLG ;
   private String[] BC000F2_A181TBM03_CRT_PROG_NM ;
   private boolean[] BC000F2_n181TBM03_CRT_PROG_NM ;
   private String[] BC000F2_A184TBM03_UPD_PROG_NM ;
   private boolean[] BC000F2_n184TBM03_UPD_PROG_NM ;
   private String[] BC000F2_A162TBM03_DOM_CD ;
   private String[] BC000F10_A163TBM03_DOM_VAR_NM ;
   private java.util.Date[] BC000F10_A179TBM03_CRT_DATETIME ;
   private boolean[] BC000F10_n179TBM03_CRT_DATETIME ;
   private String[] BC000F10_A180TBM03_CRT_USER_ID ;
   private boolean[] BC000F10_n180TBM03_CRT_USER_ID ;
   private java.util.Date[] BC000F10_A182TBM03_UPD_DATETIME ;
   private boolean[] BC000F10_n182TBM03_UPD_DATETIME ;
   private String[] BC000F10_A183TBM03_UPD_USER_ID ;
   private boolean[] BC000F10_n183TBM03_UPD_USER_ID ;
   private long[] BC000F10_A185TBM03_UPD_CNT ;
   private boolean[] BC000F10_n185TBM03_UPD_CNT ;
   private String[] BC000F10_A164TBM03_VAR_DESC ;
   private boolean[] BC000F10_n164TBM03_VAR_DESC ;
   private String[] BC000F10_A165TBM03_SDTM_FLG ;
   private boolean[] BC000F10_n165TBM03_SDTM_FLG ;
   private String[] BC000F10_A166TBM03_CDASH_FLG ;
   private boolean[] BC000F10_n166TBM03_CDASH_FLG ;
   private String[] BC000F10_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] BC000F10_n410TBM03_INPUT_TYPE_DIV ;
   private String[] BC000F10_A167TBM03_REQUIRED_FLG ;
   private boolean[] BC000F10_n167TBM03_REQUIRED_FLG ;
   private String[] BC000F10_A602TBM03_SAS_FIELD_NM ;
   private boolean[] BC000F10_n602TBM03_SAS_FIELD_NM ;
   private String[] BC000F10_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] BC000F10_n624TBM03_ODM_DATA_TYPE ;
   private String[] BC000F10_A168TBM03_NOTE ;
   private boolean[] BC000F10_n168TBM03_NOTE ;
   private int[] BC000F10_A169TBM03_ORDER ;
   private boolean[] BC000F10_n169TBM03_ORDER ;
   private String[] BC000F10_A885TBM03_VERSION ;
   private boolean[] BC000F10_n885TBM03_VERSION ;
   private String[] BC000F10_A178TBM03_DEL_FLG ;
   private boolean[] BC000F10_n178TBM03_DEL_FLG ;
   private String[] BC000F10_A181TBM03_CRT_PROG_NM ;
   private boolean[] BC000F10_n181TBM03_CRT_PROG_NM ;
   private String[] BC000F10_A184TBM03_UPD_PROG_NM ;
   private boolean[] BC000F10_n184TBM03_UPD_PROG_NM ;
   private String[] BC000F10_A162TBM03_DOM_CD ;
   private String[] BC000F11_A162TBM03_DOM_CD ;
}

final  class tbm03_cdisc_item_bc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("BC000F2", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F3", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F4", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("BC000F5", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000F6", "SELECT `TBM03_DOM_CD` AS TBM03_DOM_CD, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("BC000F7", "INSERT INTO `TBM03_CDISC_ITEM` (`TBM03_DOM_VAR_NM`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_CNT`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_PROG_NM`, `TBM03_DOM_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("BC000F8", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_CRT_DATETIME`=?, `TBM03_CRT_USER_ID`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_CNT`=?, `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_CRT_PROG_NM`=?, `TBM03_UPD_PROG_NM`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("BC000F9", "DELETE FROM `TBM03_CDISC_ITEM`  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("BC000F10", "SELECT TM1.`TBM03_DOM_VAR_NM`, TM1.`TBM03_CRT_DATETIME`, TM1.`TBM03_CRT_USER_ID`, TM1.`TBM03_UPD_DATETIME`, TM1.`TBM03_UPD_USER_ID`, TM1.`TBM03_UPD_CNT`, TM1.`TBM03_VAR_DESC`, TM1.`TBM03_SDTM_FLG`, TM1.`TBM03_CDASH_FLG`, TM1.`TBM03_INPUT_TYPE_DIV`, TM1.`TBM03_REQUIRED_FLG`, TM1.`TBM03_SAS_FIELD_NM`, TM1.`TBM03_ODM_DATA_TYPE`, TM1.`TBM03_NOTE`, TM1.`TBM03_ORDER`, TM1.`TBM03_VERSION`, TM1.`TBM03_DEL_FLG`, TM1.`TBM03_CRT_PROG_NM`, TM1.`TBM03_UPD_PROG_NM`, TM1.`TBM03_DOM_CD` AS TBM03_DOM_CD FROM `TBM03_CDISC_ITEM` TM1 WHERE TM1.`TBM03_DOM_CD` = ? and TM1.`TBM03_DOM_VAR_NM` = ? ORDER BY TM1.`TBM03_DOM_CD`, TM1.`TBM03_DOM_VAR_NM` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("BC000F11", "SELECT `TBM02_DOM_CD` AS TBM03_DOM_CD FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
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
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
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
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 8 :
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
               ((int[]) buf[27])[0] = rslt.getInt(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 2);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 50);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 20);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[28]).intValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 20);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               stmt.setVarchar(20, (String)parms[37], 2, false);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 50);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 20);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 20);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setVarchar(19, (String)parms[36], 2, false);
               stmt.setVarchar(20, (String)parms[37], 50, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

