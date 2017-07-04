/*
               File: A211_PC01_CDISC_ITEM_REG
        Description: CDISCçÄñ⁄É}ÉXÉ^ìoò^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:40.27
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a211_pc01_cdisc_item_reg extends GXProcedure
{
   public a211_pc01_cdisc_item_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a211_pc01_cdisc_item_reg.class ), "" );
   }

   public a211_pc01_cdisc_item_reg( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 ,
                                         GxObjectCollection aP1 ,
                                         short[] aP2 )
   {
      a211_pc01_cdisc_item_reg.this.AV12P_VERSION = aP0;
      a211_pc01_cdisc_item_reg.this.AV8A211_SD01_IMPORT_C = aP1;
      a211_pc01_cdisc_item_reg.this.aP2 = aP2;
      a211_pc01_cdisc_item_reg.this.aP3 = aP3;
      a211_pc01_cdisc_item_reg.this.aP3 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection aP1 ,
                        short[] aP2 ,
                        GxObjectCollection[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection aP1 ,
                             short[] aP2 ,
                             GxObjectCollection[] aP3 )
   {
      a211_pc01_cdisc_item_reg.this.AV12P_VERSION = aP0;
      a211_pc01_cdisc_item_reg.this.AV8A211_SD01_IMPORT_C = aP1;
      a211_pc01_cdisc_item_reg.this.aP2 = aP2;
      a211_pc01_cdisc_item_reg.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "A211" ;
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_RTN_CD = (short)(0) ;
      AV21W_RTN_MSG.clear();
      if ( AV20W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S131 */
         S131 ();
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
      /* 'SUB_REG' Routine */
      AV11C_DATETIME = GXutil.now( ) ;
      AV22W_SAVE_DOM_CD = "" ;
      /* Execute user subroutine: S121 */
      S121 ();
      if (returnInSub) return;
      AV26GXV1 = 1 ;
      while ( AV26GXV1 <= AV8A211_SD01_IMPORT_C.size() )
      {
         AV9A211_SD01_IMPORT_I = (SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem)((SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem)AV8A211_SD01_IMPORT_C.elementAt(-1+AV26GXV1));
         if ( GXutil.strcmp(AV22W_SAVE_DOM_CD, AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd()) != 0 )
         {
            AV27GXLvl53 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TBM02_CDISC_DOMAIN" ;
            /* Using cursor P006J2 */
            pr_default.execute(0, new Object[] {AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd()});
            if ( Gx_err != 0 )
            {
               AV27GXLvl53 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(0) != 101) )
            {
               A49TBM02_DOM_CD = P006J2_A49TBM02_DOM_CD[0] ;
               AV27GXLvl53 = (byte)(1) ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            if ( AV27GXLvl53 == 0 )
            {
               AV23W_TBM02_ORDER = (int)(AV23W_TBM02_ORDER+1) ;
               /*
                  INSERT RECORD ON TABLE TBM02_CDISC_DOMAIN

               */
               A49TBM02_DOM_CD = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               A610TBM02_DOM_ENM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               n610TBM02_DOM_ENM = false ;
               A611TBM02_DOM_JNM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               n611TBM02_DOM_JNM = false ;
               A612TBM02_DOM_GRP_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm() ;
               n612TBM02_DOM_GRP_NM = false ;
               A614TBM02_ORDER = AV23W_TBM02_ORDER ;
               n614TBM02_ORDER = false ;
               A615TBM02_DEL_FLG = "0" ;
               n615TBM02_DEL_FLG = false ;
               A616TBM02_CRT_DATETIME = AV11C_DATETIME ;
               n616TBM02_CRT_DATETIME = false ;
               A617TBM02_CRT_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n617TBM02_CRT_USER_ID = false ;
               A618TBM02_CRT_PROG_NM = AV28Pgmname ;
               n618TBM02_CRT_PROG_NM = false ;
               A619TBM02_UPD_DATETIME = AV11C_DATETIME ;
               n619TBM02_UPD_DATETIME = false ;
               A620TBM02_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n620TBM02_UPD_USER_ID = false ;
               A621TBM02_UPD_PROG_NM = AV28Pgmname ;
               n621TBM02_UPD_PROG_NM = false ;
               A622TBM02_UPD_CNT = 1 ;
               n622TBM02_UPD_CNT = false ;
               Gx_ope = "Insert" ;
               Gx_etb = "TBM02_CDISC_DOMAIN" ;
               /* Using cursor P006J3 */
               pr_default.execute(1, new Object[] {A49TBM02_DOM_CD, new Boolean(n610TBM02_DOM_ENM), A610TBM02_DOM_ENM, new Boolean(n611TBM02_DOM_JNM), A611TBM02_DOM_JNM, new Boolean(n612TBM02_DOM_GRP_NM), A612TBM02_DOM_GRP_NM, new Boolean(n614TBM02_ORDER), new Integer(A614TBM02_ORDER), new Boolean(n615TBM02_DEL_FLG), A615TBM02_DEL_FLG, new Boolean(n616TBM02_CRT_DATETIME), A616TBM02_CRT_DATETIME, new Boolean(n617TBM02_CRT_USER_ID), A617TBM02_CRT_USER_ID, new Boolean(n618TBM02_CRT_PROG_NM), A618TBM02_CRT_PROG_NM, new Boolean(n619TBM02_UPD_DATETIME), A619TBM02_UPD_DATETIME, new Boolean(n620TBM02_UPD_USER_ID), A620TBM02_UPD_USER_ID, new Boolean(n621TBM02_UPD_PROG_NM), A621TBM02_UPD_PROG_NM, new Boolean(n622TBM02_UPD_CNT), new Long(A622TBM02_UPD_CNT)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
               if ( (pr_default.getStatus(1) == 1) )
               {
                  Gx_err = (short)(1) ;
                  Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
               }
               else
               {
                  Gx_err = (short)(0) ;
                  Gx_emsg = "" ;
               }
               /* End Insert */
            }
         }
         AV22W_SAVE_DOM_CD = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
         AV29GXLvl82 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM03_CDISC_ITEM" ;
         /* Using cursor P006J4 */
         pr_default.execute(2, new Object[] {AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd(), AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm()});
         if ( Gx_err != 0 )
         {
            AV29GXLvl82 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(2) != 101) )
         {
            A60TBM03_DOM_VAR_NM = P006J4_A60TBM03_DOM_VAR_NM[0] ;
            A59TBM03_DOM_CD = P006J4_A59TBM03_DOM_CD[0] ;
            A346TBM03_VAR_DESC = P006J4_A346TBM03_VAR_DESC[0] ;
            n346TBM03_VAR_DESC = P006J4_n346TBM03_VAR_DESC[0] ;
            A347TBM03_SDTM_FLG = P006J4_A347TBM03_SDTM_FLG[0] ;
            n347TBM03_SDTM_FLG = P006J4_n347TBM03_SDTM_FLG[0] ;
            A348TBM03_CDASH_FLG = P006J4_A348TBM03_CDASH_FLG[0] ;
            n348TBM03_CDASH_FLG = P006J4_n348TBM03_CDASH_FLG[0] ;
            A532TBM03_INPUT_TYPE_DIV = P006J4_A532TBM03_INPUT_TYPE_DIV[0] ;
            n532TBM03_INPUT_TYPE_DIV = P006J4_n532TBM03_INPUT_TYPE_DIV[0] ;
            A349TBM03_REQUIRED_FLG = P006J4_A349TBM03_REQUIRED_FLG[0] ;
            n349TBM03_REQUIRED_FLG = P006J4_n349TBM03_REQUIRED_FLG[0] ;
            A688TBM03_SAS_FIELD_NM = P006J4_A688TBM03_SAS_FIELD_NM[0] ;
            n688TBM03_SAS_FIELD_NM = P006J4_n688TBM03_SAS_FIELD_NM[0] ;
            A709TBM03_ODM_DATA_TYPE = P006J4_A709TBM03_ODM_DATA_TYPE[0] ;
            n709TBM03_ODM_DATA_TYPE = P006J4_n709TBM03_ODM_DATA_TYPE[0] ;
            A350TBM03_NOTE = P006J4_A350TBM03_NOTE[0] ;
            n350TBM03_NOTE = P006J4_n350TBM03_NOTE[0] ;
            A61TBM03_ORDER = P006J4_A61TBM03_ORDER[0] ;
            n61TBM03_ORDER = P006J4_n61TBM03_ORDER[0] ;
            A932TBM03_VERSION = P006J4_A932TBM03_VERSION[0] ;
            n932TBM03_VERSION = P006J4_n932TBM03_VERSION[0] ;
            A359TBM03_DEL_FLG = P006J4_A359TBM03_DEL_FLG[0] ;
            n359TBM03_DEL_FLG = P006J4_n359TBM03_DEL_FLG[0] ;
            A363TBM03_UPD_DATETIME = P006J4_A363TBM03_UPD_DATETIME[0] ;
            n363TBM03_UPD_DATETIME = P006J4_n363TBM03_UPD_DATETIME[0] ;
            A364TBM03_UPD_USER_ID = P006J4_A364TBM03_UPD_USER_ID[0] ;
            n364TBM03_UPD_USER_ID = P006J4_n364TBM03_UPD_USER_ID[0] ;
            A365TBM03_UPD_PROG_NM = P006J4_A365TBM03_UPD_PROG_NM[0] ;
            n365TBM03_UPD_PROG_NM = P006J4_n365TBM03_UPD_PROG_NM[0] ;
            A366TBM03_UPD_CNT = P006J4_A366TBM03_UPD_CNT[0] ;
            n366TBM03_UPD_CNT = P006J4_n366TBM03_UPD_CNT[0] ;
            AV29GXLvl82 = (byte)(1) ;
            if ( (GXutil.strcmp("", A346TBM03_VAR_DESC)==0) )
            {
               A346TBM03_VAR_DESC = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc() ;
               n346TBM03_VAR_DESC = false ;
            }
            A347TBM03_SDTM_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg() ;
            n347TBM03_SDTM_FLG = false ;
            A348TBM03_CDASH_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg() ;
            n348TBM03_CDASH_FLG = false ;
            A532TBM03_INPUT_TYPE_DIV = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div() ;
            n532TBM03_INPUT_TYPE_DIV = false ;
            A349TBM03_REQUIRED_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg() ;
            n349TBM03_REQUIRED_FLG = false ;
            A688TBM03_SAS_FIELD_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm() ;
            n688TBM03_SAS_FIELD_NM = false ;
            A709TBM03_ODM_DATA_TYPE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type() ;
            n709TBM03_ODM_DATA_TYPE = false ;
            if ( (GXutil.strcmp("", A350TBM03_NOTE)==0) )
            {
               A350TBM03_NOTE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note() ;
               n350TBM03_NOTE = false ;
            }
            A61TBM03_ORDER = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order() ;
            n61TBM03_ORDER = false ;
            A932TBM03_VERSION = AV12P_VERSION ;
            n932TBM03_VERSION = false ;
            A359TBM03_DEL_FLG = "0" ;
            n359TBM03_DEL_FLG = false ;
            A363TBM03_UPD_DATETIME = AV11C_DATETIME ;
            n363TBM03_UPD_DATETIME = false ;
            A364TBM03_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n364TBM03_UPD_USER_ID = false ;
            A365TBM03_UPD_PROG_NM = AV28Pgmname ;
            n365TBM03_UPD_PROG_NM = false ;
            A366TBM03_UPD_CNT = (long)(A366TBM03_UPD_CNT+1) ;
            n366TBM03_UPD_CNT = false ;
            Gx_ope = "Update" ;
            Gx_etb = "TBM03_CDISC_ITEM" ;
            /* Using cursor P006J5 */
            pr_default.execute(3, new Object[] {new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT), A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV29GXLvl82 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TBM03_CDISC_ITEM

            */
            A59TBM03_DOM_CD = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
            A60TBM03_DOM_VAR_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm() ;
            A346TBM03_VAR_DESC = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc() ;
            n346TBM03_VAR_DESC = false ;
            A347TBM03_SDTM_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg() ;
            n347TBM03_SDTM_FLG = false ;
            A348TBM03_CDASH_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg() ;
            n348TBM03_CDASH_FLG = false ;
            A532TBM03_INPUT_TYPE_DIV = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div() ;
            n532TBM03_INPUT_TYPE_DIV = false ;
            A349TBM03_REQUIRED_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg() ;
            n349TBM03_REQUIRED_FLG = false ;
            A688TBM03_SAS_FIELD_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm() ;
            n688TBM03_SAS_FIELD_NM = false ;
            A709TBM03_ODM_DATA_TYPE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type() ;
            n709TBM03_ODM_DATA_TYPE = false ;
            A350TBM03_NOTE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note() ;
            n350TBM03_NOTE = false ;
            A61TBM03_ORDER = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order() ;
            n61TBM03_ORDER = false ;
            A932TBM03_VERSION = AV12P_VERSION ;
            n932TBM03_VERSION = false ;
            A359TBM03_DEL_FLG = "0" ;
            n359TBM03_DEL_FLG = false ;
            A360TBM03_CRT_DATETIME = AV11C_DATETIME ;
            n360TBM03_CRT_DATETIME = false ;
            A361TBM03_CRT_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n361TBM03_CRT_USER_ID = false ;
            A362TBM03_CRT_PROG_NM = AV28Pgmname ;
            n362TBM03_CRT_PROG_NM = false ;
            A363TBM03_UPD_DATETIME = AV11C_DATETIME ;
            n363TBM03_UPD_DATETIME = false ;
            A364TBM03_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n364TBM03_UPD_USER_ID = false ;
            A365TBM03_UPD_PROG_NM = AV28Pgmname ;
            n365TBM03_UPD_PROG_NM = false ;
            A366TBM03_UPD_CNT = 1 ;
            n366TBM03_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM03_CDISC_ITEM" ;
            /* Using cursor P006J6 */
            pr_default.execute(4, new Object[] {A59TBM03_DOM_CD, A60TBM03_DOM_VAR_NM, new Boolean(n346TBM03_VAR_DESC), A346TBM03_VAR_DESC, new Boolean(n347TBM03_SDTM_FLG), A347TBM03_SDTM_FLG, new Boolean(n348TBM03_CDASH_FLG), A348TBM03_CDASH_FLG, new Boolean(n532TBM03_INPUT_TYPE_DIV), A532TBM03_INPUT_TYPE_DIV, new Boolean(n349TBM03_REQUIRED_FLG), A349TBM03_REQUIRED_FLG, new Boolean(n688TBM03_SAS_FIELD_NM), A688TBM03_SAS_FIELD_NM, new Boolean(n709TBM03_ODM_DATA_TYPE), A709TBM03_ODM_DATA_TYPE, new Boolean(n350TBM03_NOTE), A350TBM03_NOTE, new Boolean(n61TBM03_ORDER), new Integer(A61TBM03_ORDER), new Boolean(n932TBM03_VERSION), A932TBM03_VERSION, new Boolean(n359TBM03_DEL_FLG), A359TBM03_DEL_FLG, new Boolean(n360TBM03_CRT_DATETIME), A360TBM03_CRT_DATETIME, new Boolean(n361TBM03_CRT_USER_ID), A361TBM03_CRT_USER_ID, new Boolean(n362TBM03_CRT_PROG_NM), A362TBM03_CRT_PROG_NM, new Boolean(n363TBM03_UPD_DATETIME), A363TBM03_UPD_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), A364TBM03_UPD_USER_ID, new Boolean(n365TBM03_UPD_PROG_NM), A365TBM03_UPD_PROG_NM, new Boolean(n366TBM03_UPD_CNT), new Long(A366TBM03_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
         }
         AV26GXV1 = (int)(AV26GXV1+1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_TBM02_ORDER_MAX' Routine */
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM02_CDISC_DOMAIN" ;
      /* Using cursor P006J7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A615TBM02_DEL_FLG = P006J7_A615TBM02_DEL_FLG[0] ;
         n615TBM02_DEL_FLG = P006J7_n615TBM02_DEL_FLG[0] ;
         A614TBM02_ORDER = P006J7_A614TBM02_ORDER[0] ;
         n614TBM02_ORDER = P006J7_n614TBM02_ORDER[0] ;
         A49TBM02_DOM_CD = P006J7_A49TBM02_DOM_CD[0] ;
         AV23W_TBM02_ORDER = A614TBM02_ORDER ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S131( )
   {
      /* 'SUB_NOUPD_DEL' Routine */
      /* Optimized UPDATE. */
      Gx_ope = "Update" ;
      Gx_etb = "TBM03_CDISC_ITEM" ;
      /* Using cursor P006J8 */
      String AV28Pgmname365Aux ;
      AV28Pgmname365Aux = AV28Pgmname ;
      pr_default.execute(6, new Object[] {new Boolean(n363TBM03_UPD_DATETIME), AV11C_DATETIME, new Boolean(n364TBM03_UPD_USER_ID), AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), new Boolean(n365TBM03_UPD_PROG_NM), AV28Pgmname365Aux, AV11C_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM03_CDISC_ITEM") ;
      /* End optimized UPDATE. */
   }

   public void S141( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV13W_A_LOGIN_SDT;
      GXv_char2[0] = AV17W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV13W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      a211_pc01_cdisc_item_reg.this.AV17W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV17W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S151( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV10C_APP_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO3[0] = AV18W_EXTRA_INFO;
      GXv_int4[0] = AV15W_ERR_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO3, GXv_int4, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO3[0] ;
      a211_pc01_cdisc_item_reg.this.AV15W_ERR_CD = GXv_int4[0] ;
      a211_pc01_cdisc_item_reg.this.AV16W_ERR_MSG = GXv_char2[0] ;
      AV21W_RTN_MSG.add(AV16W_ERR_MSG, 0);
      Application.rollback(context, remoteHandle, "DEFAULT", "a211_pc01_cdisc_item_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = a211_pc01_cdisc_item_reg.this.AV20W_RTN_CD;
      this.aP3[0] = a211_pc01_cdisc_item_reg.this.AV21W_RTN_MSG;
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
      AV21W_RTN_MSG = new GxObjectCollection(String.class, "internal", "");
      AV10C_APP_ID = "" ;
      A346TBM03_VAR_DESC = "" ;
      A350TBM03_NOTE = "" ;
      A347TBM03_SDTM_FLG = "" ;
      A348TBM03_CDASH_FLG = "" ;
      A532TBM03_INPUT_TYPE_DIV = "" ;
      A349TBM03_REQUIRED_FLG = "" ;
      A688TBM03_SAS_FIELD_NM = "" ;
      A709TBM03_ODM_DATA_TYPE = "" ;
      A932TBM03_VERSION = "" ;
      A359TBM03_DEL_FLG = "" ;
      A363TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A364TBM03_UPD_USER_ID = "" ;
      A365TBM03_UPD_PROG_NM = "" ;
      A59TBM03_DOM_CD = "" ;
      A60TBM03_DOM_VAR_NM = "" ;
      A360TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A361TBM03_CRT_USER_ID = "" ;
      A362TBM03_CRT_PROG_NM = "" ;
      AV11C_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV22W_SAVE_DOM_CD = "" ;
      AV9A211_SD01_IMPORT_I = new SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem(remoteHandle, context);
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P006J2_A49TBM02_DOM_CD = new String[] {""} ;
      A49TBM02_DOM_CD = "" ;
      A610TBM02_DOM_ENM = "" ;
      A611TBM02_DOM_JNM = "" ;
      A612TBM02_DOM_GRP_NM = "" ;
      A615TBM02_DEL_FLG = "" ;
      A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A617TBM02_CRT_USER_ID = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A618TBM02_CRT_PROG_NM = "" ;
      AV28Pgmname = "" ;
      A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A620TBM02_UPD_USER_ID = "" ;
      A621TBM02_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      P006J4_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      P006J4_A59TBM03_DOM_CD = new String[] {""} ;
      P006J4_A346TBM03_VAR_DESC = new String[] {""} ;
      P006J4_n346TBM03_VAR_DESC = new boolean[] {false} ;
      P006J4_A347TBM03_SDTM_FLG = new String[] {""} ;
      P006J4_n347TBM03_SDTM_FLG = new boolean[] {false} ;
      P006J4_A348TBM03_CDASH_FLG = new String[] {""} ;
      P006J4_n348TBM03_CDASH_FLG = new boolean[] {false} ;
      P006J4_A532TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      P006J4_n532TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      P006J4_A349TBM03_REQUIRED_FLG = new String[] {""} ;
      P006J4_n349TBM03_REQUIRED_FLG = new boolean[] {false} ;
      P006J4_A688TBM03_SAS_FIELD_NM = new String[] {""} ;
      P006J4_n688TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      P006J4_A709TBM03_ODM_DATA_TYPE = new String[] {""} ;
      P006J4_n709TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      P006J4_A350TBM03_NOTE = new String[] {""} ;
      P006J4_n350TBM03_NOTE = new boolean[] {false} ;
      P006J4_A61TBM03_ORDER = new int[1] ;
      P006J4_n61TBM03_ORDER = new boolean[] {false} ;
      P006J4_A932TBM03_VERSION = new String[] {""} ;
      P006J4_n932TBM03_VERSION = new boolean[] {false} ;
      P006J4_A359TBM03_DEL_FLG = new String[] {""} ;
      P006J4_n359TBM03_DEL_FLG = new boolean[] {false} ;
      P006J4_A363TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006J4_n363TBM03_UPD_DATETIME = new boolean[] {false} ;
      P006J4_A364TBM03_UPD_USER_ID = new String[] {""} ;
      P006J4_n364TBM03_UPD_USER_ID = new boolean[] {false} ;
      P006J4_A365TBM03_UPD_PROG_NM = new String[] {""} ;
      P006J4_n365TBM03_UPD_PROG_NM = new boolean[] {false} ;
      P006J4_A366TBM03_UPD_CNT = new long[1] ;
      P006J4_n366TBM03_UPD_CNT = new boolean[] {false} ;
      P006J7_A615TBM02_DEL_FLG = new String[] {""} ;
      P006J7_n615TBM02_DEL_FLG = new boolean[] {false} ;
      P006J7_A614TBM02_ORDER = new int[1] ;
      P006J7_n614TBM02_ORDER = new boolean[] {false} ;
      P006J7_A49TBM02_DOM_CD = new String[] {""} ;
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV17W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO3 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      AV16W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a211_pc01_cdisc_item_reg__default(),
         new Object[] {
             new Object[] {
            P006J2_A49TBM02_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            P006J4_A60TBM03_DOM_VAR_NM, P006J4_A59TBM03_DOM_CD, P006J4_A346TBM03_VAR_DESC, P006J4_n346TBM03_VAR_DESC, P006J4_A347TBM03_SDTM_FLG, P006J4_n347TBM03_SDTM_FLG, P006J4_A348TBM03_CDASH_FLG, P006J4_n348TBM03_CDASH_FLG, P006J4_A532TBM03_INPUT_TYPE_DIV, P006J4_n532TBM03_INPUT_TYPE_DIV,
            P006J4_A349TBM03_REQUIRED_FLG, P006J4_n349TBM03_REQUIRED_FLG, P006J4_A688TBM03_SAS_FIELD_NM, P006J4_n688TBM03_SAS_FIELD_NM, P006J4_A709TBM03_ODM_DATA_TYPE, P006J4_n709TBM03_ODM_DATA_TYPE, P006J4_A350TBM03_NOTE, P006J4_n350TBM03_NOTE, P006J4_A61TBM03_ORDER, P006J4_n61TBM03_ORDER,
            P006J4_A932TBM03_VERSION, P006J4_n932TBM03_VERSION, P006J4_A359TBM03_DEL_FLG, P006J4_n359TBM03_DEL_FLG, P006J4_A363TBM03_UPD_DATETIME, P006J4_n363TBM03_UPD_DATETIME, P006J4_A364TBM03_UPD_USER_ID, P006J4_n364TBM03_UPD_USER_ID, P006J4_A365TBM03_UPD_PROG_NM, P006J4_n365TBM03_UPD_PROG_NM,
            P006J4_A366TBM03_UPD_CNT, P006J4_n366TBM03_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006J7_A615TBM02_DEL_FLG, P006J7_n615TBM02_DEL_FLG, P006J7_A614TBM02_ORDER, P006J7_n614TBM02_ORDER, P006J7_A49TBM02_DOM_CD
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "A211_PC01_CDISC_ITEM_REG" ;
      /* GeneXus formulas. */
      AV28Pgmname = "A211_PC01_CDISC_ITEM_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte AV27GXLvl53 ;
   private byte AV29GXLvl82 ;
   private short AV20W_RTN_CD ;
   private short Gx_err ;
   private short AV15W_ERR_CD ;
   private short GXv_int4[] ;
   private int A61TBM03_ORDER ;
   private int AV26GXV1 ;
   private int AV23W_TBM02_ORDER ;
   private int GX_INS38 ;
   private int A614TBM02_ORDER ;
   private int GX_INS14 ;
   private int GXActiveErrHndl ;
   private long A366TBM03_UPD_CNT ;
   private long A622TBM02_UPD_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String AV28Pgmname ;
   private String Gx_emsg ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private java.util.Date A363TBM03_UPD_DATETIME ;
   private java.util.Date A360TBM03_CRT_DATETIME ;
   private java.util.Date AV11C_DATETIME ;
   private java.util.Date A616TBM02_CRT_DATETIME ;
   private java.util.Date A619TBM02_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n610TBM02_DOM_ENM ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n612TBM02_DOM_GRP_NM ;
   private boolean n614TBM02_ORDER ;
   private boolean n615TBM02_DEL_FLG ;
   private boolean n616TBM02_CRT_DATETIME ;
   private boolean n617TBM02_CRT_USER_ID ;
   private boolean n618TBM02_CRT_PROG_NM ;
   private boolean n619TBM02_UPD_DATETIME ;
   private boolean n620TBM02_UPD_USER_ID ;
   private boolean n621TBM02_UPD_PROG_NM ;
   private boolean n622TBM02_UPD_CNT ;
   private boolean n346TBM03_VAR_DESC ;
   private boolean n347TBM03_SDTM_FLG ;
   private boolean n348TBM03_CDASH_FLG ;
   private boolean n532TBM03_INPUT_TYPE_DIV ;
   private boolean n349TBM03_REQUIRED_FLG ;
   private boolean n688TBM03_SAS_FIELD_NM ;
   private boolean n709TBM03_ODM_DATA_TYPE ;
   private boolean n350TBM03_NOTE ;
   private boolean n61TBM03_ORDER ;
   private boolean n932TBM03_VERSION ;
   private boolean n359TBM03_DEL_FLG ;
   private boolean n363TBM03_UPD_DATETIME ;
   private boolean n364TBM03_UPD_USER_ID ;
   private boolean n365TBM03_UPD_PROG_NM ;
   private boolean n366TBM03_UPD_CNT ;
   private boolean n360TBM03_CRT_DATETIME ;
   private boolean n361TBM03_CRT_USER_ID ;
   private boolean n362TBM03_CRT_PROG_NM ;
   private String AV12P_VERSION ;
   private String AV10C_APP_ID ;
   private String A346TBM03_VAR_DESC ;
   private String A350TBM03_NOTE ;
   private String A347TBM03_SDTM_FLG ;
   private String A348TBM03_CDASH_FLG ;
   private String A532TBM03_INPUT_TYPE_DIV ;
   private String A349TBM03_REQUIRED_FLG ;
   private String A688TBM03_SAS_FIELD_NM ;
   private String A709TBM03_ODM_DATA_TYPE ;
   private String A932TBM03_VERSION ;
   private String A359TBM03_DEL_FLG ;
   private String A364TBM03_UPD_USER_ID ;
   private String A365TBM03_UPD_PROG_NM ;
   private String A59TBM03_DOM_CD ;
   private String A60TBM03_DOM_VAR_NM ;
   private String A361TBM03_CRT_USER_ID ;
   private String A362TBM03_CRT_PROG_NM ;
   private String AV22W_SAVE_DOM_CD ;
   private String A49TBM02_DOM_CD ;
   private String A610TBM02_DOM_ENM ;
   private String A611TBM02_DOM_JNM ;
   private String A612TBM02_DOM_GRP_NM ;
   private String A615TBM02_DEL_FLG ;
   private String A617TBM02_CRT_USER_ID ;
   private String A618TBM02_CRT_PROG_NM ;
   private String A620TBM02_UPD_USER_ID ;
   private String A621TBM02_UPD_PROG_NM ;
   private String AV17W_ERRCD ;
   private String AV19W_MSG ;
   private String AV16W_ERR_MSG ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P006J2_A49TBM02_DOM_CD ;
   private String[] P006J4_A60TBM03_DOM_VAR_NM ;
   private String[] P006J4_A59TBM03_DOM_CD ;
   private String[] P006J4_A346TBM03_VAR_DESC ;
   private boolean[] P006J4_n346TBM03_VAR_DESC ;
   private String[] P006J4_A347TBM03_SDTM_FLG ;
   private boolean[] P006J4_n347TBM03_SDTM_FLG ;
   private String[] P006J4_A348TBM03_CDASH_FLG ;
   private boolean[] P006J4_n348TBM03_CDASH_FLG ;
   private String[] P006J4_A532TBM03_INPUT_TYPE_DIV ;
   private boolean[] P006J4_n532TBM03_INPUT_TYPE_DIV ;
   private String[] P006J4_A349TBM03_REQUIRED_FLG ;
   private boolean[] P006J4_n349TBM03_REQUIRED_FLG ;
   private String[] P006J4_A688TBM03_SAS_FIELD_NM ;
   private boolean[] P006J4_n688TBM03_SAS_FIELD_NM ;
   private String[] P006J4_A709TBM03_ODM_DATA_TYPE ;
   private boolean[] P006J4_n709TBM03_ODM_DATA_TYPE ;
   private String[] P006J4_A350TBM03_NOTE ;
   private boolean[] P006J4_n350TBM03_NOTE ;
   private int[] P006J4_A61TBM03_ORDER ;
   private boolean[] P006J4_n61TBM03_ORDER ;
   private String[] P006J4_A932TBM03_VERSION ;
   private boolean[] P006J4_n932TBM03_VERSION ;
   private String[] P006J4_A359TBM03_DEL_FLG ;
   private boolean[] P006J4_n359TBM03_DEL_FLG ;
   private java.util.Date[] P006J4_A363TBM03_UPD_DATETIME ;
   private boolean[] P006J4_n363TBM03_UPD_DATETIME ;
   private String[] P006J4_A364TBM03_UPD_USER_ID ;
   private boolean[] P006J4_n364TBM03_UPD_USER_ID ;
   private String[] P006J4_A365TBM03_UPD_PROG_NM ;
   private boolean[] P006J4_n365TBM03_UPD_PROG_NM ;
   private long[] P006J4_A366TBM03_UPD_CNT ;
   private boolean[] P006J4_n366TBM03_UPD_CNT ;
   private String[] P006J7_A615TBM02_DEL_FLG ;
   private boolean[] P006J7_n615TBM02_DEL_FLG ;
   private int[] P006J7_A614TBM02_ORDER ;
   private boolean[] P006J7_n614TBM02_ORDER ;
   private String[] P006J7_A49TBM02_DOM_CD ;
   private GxObjectCollection AV8A211_SD01_IMPORT_C ;
   private GxObjectCollection AV21W_RTN_MSG ;
   private SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem AV9A211_SD01_IMPORT_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO3[] ;
}

final  class a211_pc01_cdisc_item_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006J2", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ORDER BY `TBM02_DOM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006J3", "INSERT INTO `TBM02_CDISC_DOMAIN`(`TBM02_DOM_CD`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_PROG_NM`, `TBM02_UPD_CNT`, `TBM02_NOTE`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006J4", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_PROG_NM`, `TBM03_UPD_CNT` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` = ? ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006J5", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_PROG_NM`=?, `TBM03_UPD_CNT`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006J6", "INSERT INTO `TBM03_CDISC_ITEM`(`TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_PROG_NM`, `TBM03_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006J7", "SELECT `TBM02_DEL_FLG`, `TBM02_ORDER`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` ORDER BY `TBM02_ORDER` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006J8", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_DEL_FLG`='1', `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_PROG_NM`=?, `TBM03_UPD_CNT`=`TBM03_UPD_CNT` + 1  WHERE ( `TBM03_UPD_DATETIME` IS NULL or `TBM03_UPD_DATETIME` <> ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((long[]) buf[30])[0] = rslt.getLong(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 50);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 50);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 50);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[8]).intValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[12], false);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 128);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 128);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(13, ((Number) parms[24]).longValue());
               }
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 50);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 50);
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
                  stmt.setVarchar(8, (String)parms[15], 1000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 20);
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
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 128);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 40);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(15, ((Number) parms[29]).longValue());
               }
               stmt.setVarchar(16, (String)parms[30], 2, false);
               stmt.setVarchar(17, (String)parms[31], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 2);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[19]).intValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[35], 40);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(20, ((Number) parms[37]).longValue());
               }
               return;
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 40);
               }
               stmt.setDateTime(4, (java.util.Date)parms[6], false);
               return;
      }
   }

}

