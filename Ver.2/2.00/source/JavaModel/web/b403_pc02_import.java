/*
               File: B403_PC02_IMPORT
        Description: 患者・適格性確認情報取込
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:45.92
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b403_pc02_import extends GXProcedure
{
   public b403_pc02_import( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b403_pc02_import.class ), "" );
   }

   public b403_pc02_import( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 )
   {
      b403_pc02_import.this.AV16P_USER_ID = aP0;
      b403_pc02_import.this.AV14P_PWD = aP1;
      b403_pc02_import.this.AV15P_STUDY_ID = aP2;
      b403_pc02_import.this.aP3 = aP3;
      b403_pc02_import.this.aP3 = new String[] {""};
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
      b403_pc02_import.this.AV16P_USER_ID = aP0;
      b403_pc02_import.this.AV14P_PWD = aP1;
      b403_pc02_import.this.AV15P_STUDY_ID = aP2;
      b403_pc02_import.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13C_APP_ID = "B403" ;
      /* Execute user subroutine: S151 */
      S151 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV30W_RTN_CD = (byte)(0) ;
      AV31W_RTN_MSG = "" ;
      GXt_char1 = AV34W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char2) ;
      b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
      AV34W_SYS_VALUE = GXt_char1 ;
      if ( GxRegex.IsMatch(AV34W_SYS_VALUE,"^\\d{1,4}$") )
      {
         AV19W_CRF_ID = (short)(GXutil.lval( AV34W_SYS_VALUE)) ;
      }
      else
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00080", gxdomainct_ctrl_val.getDescription(httpContext,(String)"004"), "", "", "", "", GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 ;
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      GXv_SdtB602_SD04_CONTENT_LIST3[0] = AV18W_CONTENT_LIST;
      GXv_int4[0] = AV30W_RTN_CD ;
      GXv_char2[0] = AV31W_RTN_MSG ;
      new b602_pc04_crfif_view_contentlist(remoteHandle, context).execute( AV16P_USER_ID, AV14P_PWD, AV15P_STUDY_ID, GXv_SdtB602_SD04_CONTENT_LIST3, GXv_int4, GXv_char2) ;
      AV18W_CONTENT_LIST = GXv_SdtB602_SD04_CONTENT_LIST3[0] ;
      b403_pc02_import.this.AV30W_RTN_CD = (byte)((byte)(GXv_int4[0])) ;
      b403_pc02_import.this.AV31W_RTN_MSG = GXv_char2[0] ;
      if ( AV30W_RTN_CD != 0 )
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
      if ( AV18W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Content().size() <= 0 )
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00079", "", "", "", "", "", GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 ;
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      AV35W_UNREGISTERED_FLG = false ;
      AV39GXV1 = 1 ;
      while ( AV39GXV1 <= AV18W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Content().size() )
      {
         AV17W_CONTENT_ITEM = (SdtB602_SD04_CONTENT_LIST_CONTENTItem)((SdtB602_SD04_CONTENT_LIST_CONTENTItem)AV18W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Content().elementAt(-1+AV39GXV1));
         AV40GXLvl60 = (byte)(0) ;
         /* Using cursor P004Q2 */
         pr_default.execute(0, new Object[] {new Long(AV15P_STUDY_ID), new Long(AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no())});
         if ( Gx_err != 0 )
         {
            AV40GXLvl60 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A88TBT01_SUBJECT_ID = P004Q2_A88TBT01_SUBJECT_ID[0] ;
            A87TBT01_STUDY_ID = P004Q2_A87TBT01_STUDY_ID[0] ;
            AV40GXLvl60 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV40GXLvl60 == 0 )
         {
            AV35W_UNREGISTERED_FLG = true ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV39GXV1 = (int)(AV39GXV1+1) ;
      }
      if ( AV35W_UNREGISTERED_FLG )
      {
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AX00015", "", "", "", "", "", GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 ;
      }
      else
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00081", "", "", "", "", "", GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 ;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_REG' Routine */
      GXv_SdtB602_SD05_METACONTENT_LIST5[0] = AV25W_METACONTENT_LIST;
      GXv_int4[0] = AV30W_RTN_CD ;
      GXv_char2[0] = AV31W_RTN_MSG ;
      new b602_pc05_crfif_view_metacontentlist(remoteHandle, context).execute( AV16P_USER_ID, AV14P_PWD, AV15P_STUDY_ID, AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id(), "0", GXv_SdtB602_SD05_METACONTENT_LIST5, GXv_int4, GXv_char2) ;
      AV25W_METACONTENT_LIST = GXv_SdtB602_SD05_METACONTENT_LIST5[0] ;
      b403_pc02_import.this.AV30W_RTN_CD = (byte)((byte)(GXv_int4[0])) ;
      b403_pc02_import.this.AV31W_RTN_MSG = GXv_char2[0] ;
      if ( AV30W_RTN_CD != 0 )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
      }
      AV32W_SITE_ID = "" ;
      AV36W_CNT = 1 ;
      while ( AV36W_CNT <= AV25W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().size() )
      {
         if ( GxRegex.IsMatch(((SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)AV25W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().elementAt(-1+(int)(AV36W_CNT))).getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name(),"^.*@hospital$") )
         {
            AV22W_HOSPITAL = ((SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)AV25W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().elementAt(-1+(int)(AV36W_CNT))).getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content() ;
            /* Execute user subroutine: S131 */
            S131 ();
            if (returnInSub) return;
         }
         AV36W_CNT = (long)(AV36W_CNT+1) ;
      }
      AV12BC_SUBJECT = (SdtTBT01_SUBJECT)new SdtTBT01_SUBJECT( remoteHandle, context);
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_study_id( AV15P_STUDY_ID );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_subject_id( (int)(AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no()) );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_outer_subject_id( GXutil.trim( GXutil.str( AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no(), 10, 0)) );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_site_id( AV32W_SITE_ID );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_del_flg( "0" );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_crt_prog_nm( AV41Pgmname );
      AV12BC_SUBJECT.setgxTv_SdtTBT01_SUBJECT_Tbt01_upd_prog_nm( AV41Pgmname );
      AV12BC_SUBJECT.Save();
      if ( AV12BC_SUBJECT.Fail() )
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV12BC_SUBJECT.GetMessages(), (byte)(0), GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 + "TBT01_SUBJECT" ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
      }
      AV8BC_CRF = (SdtTBT02_CRF)new SdtTBT02_CRF( remoteHandle, context);
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_study_id( AV15P_STUDY_ID );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_subject_id( (int)(AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no()) );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_id( AV19W_CRF_ID );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no( (byte)(1) );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version( (short)(1) );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crf_input_level( (byte)(4) );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg( "1" );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime( GXutil.now( ) );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_approval_flg( "0" );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_input_end_flg( "0" );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_del_flg( "0" );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_crt_prog_nm( AV41Pgmname );
      AV8BC_CRF.setgxTv_SdtTBT02_CRF_Tbt02_upd_prog_nm( AV41Pgmname );
      AV8BC_CRF.Save();
      if ( AV8BC_CRF.Fail() )
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV8BC_CRF.GetMessages(), (byte)(0), GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 + "TBT02_CRF" ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
      }
      AV9BC_CRF_HISTORY = (SdtTBT11_CRF_HISTORY)new SdtTBT11_CRF_HISTORY( remoteHandle, context);
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_study_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_study_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_subject_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_subject_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_eda_no( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_eda_no() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_version( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crf_input_level( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_input_level() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_datetime( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_datetime() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_user_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_user_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upload_auth_cd( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_upload_auth_cd() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_flg( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_flg() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_dm_arrival_datetime( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_dm_arrival_datetime() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_flg( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_approval_flg() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_datetime( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_approval_datetime() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_user_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_approval_user_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_approval_auth_cd( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_approval_auth_cd() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_flg( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_flg() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_datetime( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_datetime() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_user_id( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_user_id() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_input_end_auth_cd( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_input_end_auth_cd() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_del_flg( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_del_flg() );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_crt_prog_nm( AV41Pgmname );
      AV9BC_CRF_HISTORY.setgxTv_SdtTBT11_CRF_HISTORY_Tbt11_upd_prog_nm( AV41Pgmname );
      AV9BC_CRF_HISTORY.Save();
      if ( AV9BC_CRF_HISTORY.Fail() )
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_CRF_HISTORY.GetMessages(), (byte)(0), GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 + "TBT11_CRF_HISTORY" ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
      }
      /* Using cursor P004Q3 */
      pr_default.execute(1, new Object[] {new Long(AV15P_STUDY_ID), new Short(AV19W_CRF_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A424TBM41_NCM_METADATA_ID = P004Q3_A424TBM41_NCM_METADATA_ID[0] ;
         n424TBM41_NCM_METADATA_ID = P004Q3_n424TBM41_NCM_METADATA_ID[0] ;
         A425TBM41_DEL_FLG = P004Q3_A425TBM41_DEL_FLG[0] ;
         n425TBM41_DEL_FLG = P004Q3_n425TBM41_DEL_FLG[0] ;
         A20TBM41_CRF_ID = P004Q3_A20TBM41_CRF_ID[0] ;
         A19TBM41_STUDY_ID = P004Q3_A19TBM41_STUDY_ID[0] ;
         A22TBM41_CRF_ITEM_GRP_CD = P004Q3_A22TBM41_CRF_ITEM_GRP_CD[0] ;
         A21TBM41_CRF_ITEM_GRP_DIV = P004Q3_A21TBM41_CRF_ITEM_GRP_DIV[0] ;
         AV23W_META_EXISTS_FLG = false ;
         AV43GXV2 = 1 ;
         while ( AV43GXV2 <= AV25W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().size() )
         {
            AV24W_METACONTENT_ITEM = (SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)((SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)AV25W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().elementAt(-1+AV43GXV2));
            if ( GXutil.val( A424TBM41_NCM_METADATA_ID, ".") == AV24W_METACONTENT_ITEM.getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id() )
            {
               AV20W_CRF_VALUE = AV24W_METACONTENT_ITEM.getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content() ;
               if ( ! (GXutil.strcmp("", AV24W_METACONTENT_ITEM.getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content())==0) )
               {
                  AV29W_NC_STUDY_ID = A19TBM41_STUDY_ID ;
                  AV27W_NC_CRF_ID = A20TBM41_CRF_ID ;
                  AV28W_NC_CRF_ITEM_GRP_CD = A22TBM41_CRF_ITEM_GRP_CD ;
                  /* Execute user subroutine: S143 */
                  S143 ();
                  if ( returnInSub )
                  {
                     pr_default.close(1);
                     returnInSub = true;
                     if (true) return;
                  }
               }
               AV23W_META_EXISTS_FLG = true ;
               if (true) break;
            }
            AV43GXV2 = (int)(AV43GXV2+1) ;
         }
         if ( AV23W_META_EXISTS_FLG )
         {
            AV11BC_CRF_RESULT = (SdtTBT12_CRF_RESULT)new SdtTBT12_CRF_RESULT( remoteHandle, context);
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id( AV15P_STUDY_ID );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id( (int)(AV17W_CONTENT_ITEM.getgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no()) );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id( AV19W_CRF_ID );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no( (byte)(1) );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div( A21TBM41_CRF_ITEM_GRP_DIV );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd( A22TBM41_CRF_ITEM_GRP_CD );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value( AV20W_CRF_VALUE );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg( "0" );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg( "0" );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_crt_prog_nm( AV41Pgmname );
            AV11BC_CRF_RESULT.setgxTv_SdtTBT12_CRF_RESULT_Tbt12_upd_prog_nm( AV41Pgmname );
            AV11BC_CRF_RESULT.Save();
            if ( AV11BC_CRF_RESULT.Fail() )
            {
               AV30W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV31W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV11BC_CRF_RESULT.GetMessages(), (byte)(0), GXv_char2) ;
               b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
               AV31W_RTN_MSG = GXt_char1 + "TBT12_CRF_RESULT" ;
               /* Execute user subroutine: S121 */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
            }
            AV10BC_CRF_RES_HIS = (SdtTBT13_CRF_RES_HIS)new SdtTBT13_CRF_RES_HIS( remoteHandle, context);
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_study_id( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_study_id() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_subject_id( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_subject_id() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_id( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_id() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_eda_no( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_eda_no() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_version( AV8BC_CRF.getgxTv_SdtTBT02_CRF_Tbt02_crf_latest_version() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_div( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_div() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_item_grp_cd( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_item_grp_cd() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crf_value( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_crf_value() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_edit_flg( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_edit_flg() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_del_flg( AV11BC_CRF_RESULT.getgxTv_SdtTBT12_CRF_RESULT_Tbt12_del_flg() );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_crt_prog_nm( AV41Pgmname );
            AV10BC_CRF_RES_HIS.setgxTv_SdtTBT13_CRF_RES_HIS_Tbt13_upd_prog_nm( AV41Pgmname );
            AV10BC_CRF_RES_HIS.Save();
            if ( AV10BC_CRF_RES_HIS.Fail() )
            {
               AV30W_RTN_CD = (byte)(1) ;
               GXt_char1 = AV31W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV10BC_CRF_RES_HIS.GetMessages(), (byte)(0), GXv_char2) ;
               b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
               AV31W_RTN_MSG = GXt_char1 + "TBT13_CRF_RES_HIS" ;
               /* Execute user subroutine: S121 */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(1);
                  returnInSub = true;
                  if (true) return;
               }
            }
         }
         else
         {
            AV30W_RTN_CD = (byte)(1) ;
            GXt_char1 = AV31W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00062", "CRF-NetCommonsマッピングマスタに定義情報", "", "", "", "", GXv_char2) ;
            b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
            AV31W_RTN_MSG = GXt_char1 ;
            /* Execute user subroutine: S121 */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S143( )
   {
      /* 'SUB_LIST_CHECK' Routine */
      /* Using cursor P004Q4 */
      pr_default.execute(2, new Object[] {new Long(AV29W_NC_STUDY_ID), new Short(AV27W_NC_CRF_ID), AV28W_NC_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A525TBM32_LIST_CD = P004Q4_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P004Q4_n525TBM32_LIST_CD[0] ;
         A70TBM32_STUDY_ID = P004Q4_A70TBM32_STUDY_ID[0] ;
         A75TBM32_DEL_FLG = P004Q4_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P004Q4_n75TBM32_DEL_FLG[0] ;
         A72TBM32_CRF_ITEM_CD = P004Q4_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P004Q4_A71TBM32_CRF_ID[0] ;
         GXv_char2[0] = AV33W_STR_SUBSTR ;
         GXv_int6[0] = (byte)(AV21W_ERR_CD) ;
         new a822_pc01_str_token(remoteHandle, context).execute( AV24W_METACONTENT_ITEM.getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content(), "@", (short)(2), GXv_char2, GXv_int6) ;
         b403_pc02_import.this.AV33W_STR_SUBSTR = GXv_char2[0] ;
         b403_pc02_import.this.AV21W_ERR_CD = GXv_int6[0] ;
         AV20W_CRF_VALUE = AV33W_STR_SUBSTR ;
         AV45GXLvl283 = (byte)(0) ;
         /* Using cursor P004Q5 */
         pr_default.execute(3, new Object[] {new Long(A70TBM32_STUDY_ID), new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, AV33W_STR_SUBSTR});
         if ( Gx_err != 0 )
         {
            AV45GXLvl283 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(3) != 101) )
         {
            A25TBM26_STUDY_ID = P004Q5_A25TBM26_STUDY_ID[0] ;
            A26TBM26_LIST_CD = P004Q5_A26TBM26_LIST_CD[0] ;
            A563TBM26_DEL_FLG = P004Q5_A563TBM26_DEL_FLG[0] ;
            n563TBM26_DEL_FLG = P004Q5_n563TBM26_DEL_FLG[0] ;
            A562TBM26_INNER_VALUE = P004Q5_A562TBM26_INNER_VALUE[0] ;
            n562TBM26_INNER_VALUE = P004Q5_n562TBM26_INNER_VALUE[0] ;
            A27TBM26_LIST_ITEM_NO = P004Q5_A27TBM26_LIST_ITEM_NO[0] ;
            AV45GXLvl283 = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(3);
         }
         pr_default.close(3);
         if ( AV45GXLvl283 == 0 )
         {
            AV30W_RTN_CD = (byte)(1) ;
            AV26W_MSG = "CRFID[" + GXutil.trim( GXutil.str( AV19W_CRF_ID, 4, 0)) + "].メタデータID[" + GXutil.trim( GXutil.str( AV24W_METACONTENT_ITEM.getgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id(), 10, 0)) + "]臨床試験支援システム側に対象のメタデータ" ;
            GXt_char1 = AV31W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00077", AV26W_MSG, "選択肢の値", "", "", "", GXv_char2) ;
            b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
            AV31W_RTN_MSG = GXt_char1 ;
            /* Execute user subroutine: S121 */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   public void S131( )
   {
      /* 'SUB_SITE' Routine */
      GXv_char2[0] = AV32W_SITE_ID ;
      GXv_int6[0] = (byte)(AV21W_ERR_CD) ;
      new a822_pc01_str_token(remoteHandle, context).execute( AV22W_HOSPITAL, "@", (short)(2), GXv_char2, GXv_int6) ;
      b403_pc02_import.this.AV32W_SITE_ID = GXv_char2[0] ;
      b403_pc02_import.this.AV21W_ERR_CD = GXv_int6[0] ;
      AV46GXLvl309 = (byte)(0) ;
      /* Using cursor P004Q6 */
      pr_default.execute(4, new Object[] {AV32W_SITE_ID});
      if ( Gx_err != 0 )
      {
         AV46GXLvl309 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(4) != 101) )
      {
         A325TAM08_DEL_FLG = P004Q6_A325TAM08_DEL_FLG[0] ;
         n325TAM08_DEL_FLG = P004Q6_n325TAM08_DEL_FLG[0] ;
         A57TAM08_SITE_ID = P004Q6_A57TAM08_SITE_ID[0] ;
         AV46GXLvl309 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV46GXLvl309 == 0 )
      {
         AV30W_RTN_CD = (byte)(1) ;
         GXt_char1 = AV31W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00038", "施設ID:"+AV32W_SITE_ID, "存在しない", "登録", "", "", GXv_char2) ;
         b403_pc02_import.this.GXt_char1 = GXv_char2[0] ;
         AV31W_RTN_MSG = GXt_char1 ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
      }
   }

   public void S151( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV30W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b403_pc02_import");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc02_import");
         returnInSub = true;
         if (true) return;
      }
   }

   public void S161( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV41Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b403_pc02_import");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b403_pc02_import.this.AV31W_RTN_MSG;
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
      AV31W_RTN_MSG = "" ;
      AV13C_APP_ID = "" ;
      AV34W_SYS_VALUE = "" ;
      AV18W_CONTENT_LIST = new SdtB602_SD04_CONTENT_LIST(remoteHandle, context);
      GXv_SdtB602_SD04_CONTENT_LIST3 = new SdtB602_SD04_CONTENT_LIST [1] ;
      AV17W_CONTENT_ITEM = new SdtB602_SD04_CONTENT_LIST_CONTENTItem(remoteHandle, context);
      scmdbuf = "" ;
      P004Q2_A88TBT01_SUBJECT_ID = new int[1] ;
      P004Q2_A87TBT01_STUDY_ID = new long[1] ;
      AV25W_METACONTENT_LIST = new SdtB602_SD05_METACONTENT_LIST(remoteHandle, context);
      GXv_SdtB602_SD05_METACONTENT_LIST5 = new SdtB602_SD05_METACONTENT_LIST [1] ;
      GXv_int4 = new short [1] ;
      AV32W_SITE_ID = "" ;
      AV22W_HOSPITAL = "" ;
      AV12BC_SUBJECT = new SdtTBT01_SUBJECT(remoteHandle);
      AV41Pgmname = "" ;
      AV8BC_CRF = new SdtTBT02_CRF(remoteHandle);
      AV9BC_CRF_HISTORY = new SdtTBT11_CRF_HISTORY(remoteHandle);
      P004Q3_A424TBM41_NCM_METADATA_ID = new String[] {""} ;
      P004Q3_n424TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      P004Q3_A425TBM41_DEL_FLG = new String[] {""} ;
      P004Q3_n425TBM41_DEL_FLG = new boolean[] {false} ;
      P004Q3_A20TBM41_CRF_ID = new short[1] ;
      P004Q3_A19TBM41_STUDY_ID = new long[1] ;
      P004Q3_A22TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      P004Q3_A21TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A424TBM41_NCM_METADATA_ID = "" ;
      A425TBM41_DEL_FLG = "" ;
      A22TBM41_CRF_ITEM_GRP_CD = "" ;
      A21TBM41_CRF_ITEM_GRP_DIV = "" ;
      AV24W_METACONTENT_ITEM = new SdtB602_SD05_METACONTENT_LIST_METACONTENTItem(remoteHandle, context);
      AV20W_CRF_VALUE = "" ;
      AV28W_NC_CRF_ITEM_GRP_CD = "" ;
      AV11BC_CRF_RESULT = new SdtTBT12_CRF_RESULT(remoteHandle);
      AV10BC_CRF_RES_HIS = new SdtTBT13_CRF_RES_HIS(remoteHandle);
      P004Q4_A525TBM32_LIST_CD = new String[] {""} ;
      P004Q4_n525TBM32_LIST_CD = new boolean[] {false} ;
      P004Q4_A70TBM32_STUDY_ID = new long[1] ;
      P004Q4_A75TBM32_DEL_FLG = new String[] {""} ;
      P004Q4_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P004Q4_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P004Q4_A71TBM32_CRF_ID = new short[1] ;
      A525TBM32_LIST_CD = "" ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      AV33W_STR_SUBSTR = "" ;
      P004Q5_A25TBM26_STUDY_ID = new long[1] ;
      P004Q5_A26TBM26_LIST_CD = new String[] {""} ;
      P004Q5_A563TBM26_DEL_FLG = new String[] {""} ;
      P004Q5_n563TBM26_DEL_FLG = new boolean[] {false} ;
      P004Q5_A562TBM26_INNER_VALUE = new String[] {""} ;
      P004Q5_n562TBM26_INNER_VALUE = new boolean[] {false} ;
      P004Q5_A27TBM26_LIST_ITEM_NO = new short[1] ;
      A26TBM26_LIST_CD = "" ;
      A563TBM26_DEL_FLG = "" ;
      A562TBM26_INNER_VALUE = "" ;
      AV26W_MSG = "" ;
      GXv_int6 = new byte [1] ;
      P004Q6_A325TAM08_DEL_FLG = new String[] {""} ;
      P004Q6_n325TAM08_DEL_FLG = new boolean[] {false} ;
      P004Q6_A57TAM08_SITE_ID = new String[] {""} ;
      A325TAM08_DEL_FLG = "" ;
      A57TAM08_SITE_ID = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b403_pc02_import__default(),
         new Object[] {
             new Object[] {
            P004Q2_A88TBT01_SUBJECT_ID, P004Q2_A87TBT01_STUDY_ID
            }
            , new Object[] {
            P004Q3_A424TBM41_NCM_METADATA_ID, P004Q3_n424TBM41_NCM_METADATA_ID, P004Q3_A425TBM41_DEL_FLG, P004Q3_n425TBM41_DEL_FLG, P004Q3_A20TBM41_CRF_ID, P004Q3_A19TBM41_STUDY_ID, P004Q3_A22TBM41_CRF_ITEM_GRP_CD, P004Q3_A21TBM41_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P004Q4_A525TBM32_LIST_CD, P004Q4_n525TBM32_LIST_CD, P004Q4_A70TBM32_STUDY_ID, P004Q4_A75TBM32_DEL_FLG, P004Q4_n75TBM32_DEL_FLG, P004Q4_A72TBM32_CRF_ITEM_CD, P004Q4_A71TBM32_CRF_ID
            }
            , new Object[] {
            P004Q5_A25TBM26_STUDY_ID, P004Q5_A26TBM26_LIST_CD, P004Q5_A563TBM26_DEL_FLG, P004Q5_n563TBM26_DEL_FLG, P004Q5_A562TBM26_INNER_VALUE, P004Q5_n562TBM26_INNER_VALUE, P004Q5_A27TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            P004Q6_A325TAM08_DEL_FLG, P004Q6_n325TAM08_DEL_FLG, P004Q6_A57TAM08_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV41Pgmname = "B403_PC02_IMPORT" ;
      /* GeneXus formulas. */
      AV41Pgmname = "B403_PC02_IMPORT" ;
      Gx_err = (short)(0) ;
   }

   private byte AV30W_RTN_CD ;
   private byte AV40GXLvl60 ;
   private byte AV45GXLvl283 ;
   private byte GXv_int6[] ;
   private byte AV46GXLvl309 ;
   private short AV19W_CRF_ID ;
   private short Gx_err ;
   private short GXv_int4[] ;
   private short A20TBM41_CRF_ID ;
   private short AV27W_NC_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short AV21W_ERR_CD ;
   private short A27TBM26_LIST_ITEM_NO ;
   private int AV39GXV1 ;
   private int A88TBT01_SUBJECT_ID ;
   private int AV43GXV2 ;
   private int GXActiveErrHndl ;
   private long AV15P_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private long AV36W_CNT ;
   private long A19TBM41_STUDY_ID ;
   private long AV29W_NC_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A25TBM26_STUDY_ID ;
   private String scmdbuf ;
   private String AV41Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean AV35W_UNREGISTERED_FLG ;
   private boolean n424TBM41_NCM_METADATA_ID ;
   private boolean n425TBM41_DEL_FLG ;
   private boolean AV23W_META_EXISTS_FLG ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n563TBM26_DEL_FLG ;
   private boolean n562TBM26_INNER_VALUE ;
   private boolean n325TAM08_DEL_FLG ;
   private String AV16P_USER_ID ;
   private String AV14P_PWD ;
   private String AV31W_RTN_MSG ;
   private String AV13C_APP_ID ;
   private String AV34W_SYS_VALUE ;
   private String AV32W_SITE_ID ;
   private String AV22W_HOSPITAL ;
   private String A424TBM41_NCM_METADATA_ID ;
   private String A425TBM41_DEL_FLG ;
   private String A22TBM41_CRF_ITEM_GRP_CD ;
   private String A21TBM41_CRF_ITEM_GRP_DIV ;
   private String AV20W_CRF_VALUE ;
   private String AV28W_NC_CRF_ITEM_GRP_CD ;
   private String A525TBM32_LIST_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV33W_STR_SUBSTR ;
   private String A26TBM26_LIST_CD ;
   private String A563TBM26_DEL_FLG ;
   private String A562TBM26_INNER_VALUE ;
   private String AV26W_MSG ;
   private String A325TAM08_DEL_FLG ;
   private String A57TAM08_SITE_ID ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private int[] P004Q2_A88TBT01_SUBJECT_ID ;
   private long[] P004Q2_A87TBT01_STUDY_ID ;
   private String[] P004Q3_A424TBM41_NCM_METADATA_ID ;
   private boolean[] P004Q3_n424TBM41_NCM_METADATA_ID ;
   private String[] P004Q3_A425TBM41_DEL_FLG ;
   private boolean[] P004Q3_n425TBM41_DEL_FLG ;
   private short[] P004Q3_A20TBM41_CRF_ID ;
   private long[] P004Q3_A19TBM41_STUDY_ID ;
   private String[] P004Q3_A22TBM41_CRF_ITEM_GRP_CD ;
   private String[] P004Q3_A21TBM41_CRF_ITEM_GRP_DIV ;
   private String[] P004Q4_A525TBM32_LIST_CD ;
   private boolean[] P004Q4_n525TBM32_LIST_CD ;
   private long[] P004Q4_A70TBM32_STUDY_ID ;
   private String[] P004Q4_A75TBM32_DEL_FLG ;
   private boolean[] P004Q4_n75TBM32_DEL_FLG ;
   private String[] P004Q4_A72TBM32_CRF_ITEM_CD ;
   private short[] P004Q4_A71TBM32_CRF_ID ;
   private long[] P004Q5_A25TBM26_STUDY_ID ;
   private String[] P004Q5_A26TBM26_LIST_CD ;
   private String[] P004Q5_A563TBM26_DEL_FLG ;
   private boolean[] P004Q5_n563TBM26_DEL_FLG ;
   private String[] P004Q5_A562TBM26_INNER_VALUE ;
   private boolean[] P004Q5_n562TBM26_INNER_VALUE ;
   private short[] P004Q5_A27TBM26_LIST_ITEM_NO ;
   private String[] P004Q6_A325TAM08_DEL_FLG ;
   private boolean[] P004Q6_n325TAM08_DEL_FLG ;
   private String[] P004Q6_A57TAM08_SITE_ID ;
   private SdtTBT02_CRF AV8BC_CRF ;
   private SdtTBT11_CRF_HISTORY AV9BC_CRF_HISTORY ;
   private SdtTBT13_CRF_RES_HIS AV10BC_CRF_RES_HIS ;
   private SdtTBT12_CRF_RESULT AV11BC_CRF_RESULT ;
   private SdtTBT01_SUBJECT AV12BC_SUBJECT ;
   private SdtB602_SD04_CONTENT_LIST AV18W_CONTENT_LIST ;
   private SdtB602_SD04_CONTENT_LIST GXv_SdtB602_SD04_CONTENT_LIST3[] ;
   private SdtB602_SD04_CONTENT_LIST_CONTENTItem AV17W_CONTENT_ITEM ;
   private SdtB602_SD05_METACONTENT_LIST AV25W_METACONTENT_LIST ;
   private SdtB602_SD05_METACONTENT_LIST GXv_SdtB602_SD05_METACONTENT_LIST5[] ;
   private SdtB602_SD05_METACONTENT_LIST_METACONTENTItem AV24W_METACONTENT_ITEM ;
}

final  class b403_pc02_import__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Q2", "SELECT `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ? ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004Q3", "SELECT `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRF_ID`, `TBM41_STUDY_ID`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRF_ITEM_GRP_DIV` FROM `TBM41_CRF_NCM_MAP` WHERE (`TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` = ?) AND (Not (LENGTH(TRIM(`TBM41_NCM_METADATA_ID`))=0)) AND (Not `TBM41_NCM_METADATA_ID` IS NULL) AND (`TBM41_DEL_FLG` = '0') ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P004Q4", "SELECT `TBM32_LIST_CD`, `TBM32_STUDY_ID`, `TBM32_DEL_FLG`, `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ?) AND (Not (LENGTH(TRIM(`TBM32_LIST_CD`))=0)) AND (Not `TBM32_LIST_CD` IS NULL) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004Q5", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_DEL_FLG`, `TBM26_INNER_VALUE`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE (`TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` = ?) AND (`TBM26_INNER_VALUE` = ?) AND (`TBM26_DEL_FLG` = '0') ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P004Q6", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 20);
               }
               stmt.setVarchar(3, (String)parms[3], 1000);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
      }
   }

}

