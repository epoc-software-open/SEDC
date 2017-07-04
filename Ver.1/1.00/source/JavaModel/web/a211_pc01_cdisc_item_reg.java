/*
               File: A211_PC01_CDISC_ITEM_REG
        Description: CDISCçÄñ⁄É}ÉXÉ^ìoò^
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:19.15
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
      /* Execute user subroutine: S14170 */
      S14170 ();
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
         /* Execute user subroutine: S1140 */
         S1140 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S13151 */
         S13151 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      cleanup();
   }

   public void S1140( )
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
            /* Using cursor P006G2 */
            pr_default.execute(0, new Object[] {AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A516TBM02_DOM_CD = P006G2_A516TBM02_DOM_CD[0] ;
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
               A516TBM02_DOM_CD = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               A517TBM02_DOM_ENM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               n517TBM02_DOM_ENM = false ;
               A518TBM02_DOM_JNM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
               n518TBM02_DOM_JNM = false ;
               A519TBM02_DOM_GRP_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm02_dom_grp_nm() ;
               n519TBM02_DOM_GRP_NM = false ;
               A521TBM02_ORDER = AV23W_TBM02_ORDER ;
               n521TBM02_ORDER = false ;
               A522TBM02_DEL_FLG = "0" ;
               n522TBM02_DEL_FLG = false ;
               A523TBM02_CRT_DATETIME = AV11C_DATETIME ;
               n523TBM02_CRT_DATETIME = false ;
               A524TBM02_CRT_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n524TBM02_CRT_USER_ID = false ;
               A525TBM02_CRT_PROG_NM = AV28Pgmname ;
               n525TBM02_CRT_PROG_NM = false ;
               A526TBM02_UPD_DATETIME = AV11C_DATETIME ;
               n526TBM02_UPD_DATETIME = false ;
               A527TBM02_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
               n527TBM02_UPD_USER_ID = false ;
               A528TBM02_UPD_PROG_NM = AV28Pgmname ;
               n528TBM02_UPD_PROG_NM = false ;
               A529TBM02_UPD_CNT = 1 ;
               n529TBM02_UPD_CNT = false ;
               Gx_ope = "Insert" ;
               Gx_etb = "TBM02_CDISC_DOMAIN" ;
               /* Using cursor P006G3 */
               pr_default.execute(1, new Object[] {A516TBM02_DOM_CD, new Boolean(n517TBM02_DOM_ENM), A517TBM02_DOM_ENM, new Boolean(n518TBM02_DOM_JNM), A518TBM02_DOM_JNM, new Boolean(n519TBM02_DOM_GRP_NM), A519TBM02_DOM_GRP_NM, new Boolean(n521TBM02_ORDER), new Integer(A521TBM02_ORDER), new Boolean(n522TBM02_DEL_FLG), A522TBM02_DEL_FLG, new Boolean(n523TBM02_CRT_DATETIME), A523TBM02_CRT_DATETIME, new Boolean(n524TBM02_CRT_USER_ID), A524TBM02_CRT_USER_ID, new Boolean(n525TBM02_CRT_PROG_NM), A525TBM02_CRT_PROG_NM, new Boolean(n526TBM02_UPD_DATETIME), A526TBM02_UPD_DATETIME, new Boolean(n527TBM02_UPD_USER_ID), A527TBM02_UPD_USER_ID, new Boolean(n528TBM02_UPD_PROG_NM), A528TBM02_UPD_PROG_NM, new Boolean(n529TBM02_UPD_CNT), new Long(A529TBM02_UPD_CNT)});
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
         /* Using cursor P006G4 */
         pr_default.execute(2, new Object[] {AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd(), AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm()});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A163TBM03_DOM_VAR_NM = P006G4_A163TBM03_DOM_VAR_NM[0] ;
            A162TBM03_DOM_CD = P006G4_A162TBM03_DOM_CD[0] ;
            A164TBM03_VAR_DESC = P006G4_A164TBM03_VAR_DESC[0] ;
            n164TBM03_VAR_DESC = P006G4_n164TBM03_VAR_DESC[0] ;
            A165TBM03_SDTM_FLG = P006G4_A165TBM03_SDTM_FLG[0] ;
            n165TBM03_SDTM_FLG = P006G4_n165TBM03_SDTM_FLG[0] ;
            A166TBM03_CDASH_FLG = P006G4_A166TBM03_CDASH_FLG[0] ;
            n166TBM03_CDASH_FLG = P006G4_n166TBM03_CDASH_FLG[0] ;
            A410TBM03_INPUT_TYPE_DIV = P006G4_A410TBM03_INPUT_TYPE_DIV[0] ;
            n410TBM03_INPUT_TYPE_DIV = P006G4_n410TBM03_INPUT_TYPE_DIV[0] ;
            A167TBM03_REQUIRED_FLG = P006G4_A167TBM03_REQUIRED_FLG[0] ;
            n167TBM03_REQUIRED_FLG = P006G4_n167TBM03_REQUIRED_FLG[0] ;
            A602TBM03_SAS_FIELD_NM = P006G4_A602TBM03_SAS_FIELD_NM[0] ;
            n602TBM03_SAS_FIELD_NM = P006G4_n602TBM03_SAS_FIELD_NM[0] ;
            A624TBM03_ODM_DATA_TYPE = P006G4_A624TBM03_ODM_DATA_TYPE[0] ;
            n624TBM03_ODM_DATA_TYPE = P006G4_n624TBM03_ODM_DATA_TYPE[0] ;
            A168TBM03_NOTE = P006G4_A168TBM03_NOTE[0] ;
            n168TBM03_NOTE = P006G4_n168TBM03_NOTE[0] ;
            A169TBM03_ORDER = P006G4_A169TBM03_ORDER[0] ;
            n169TBM03_ORDER = P006G4_n169TBM03_ORDER[0] ;
            A885TBM03_VERSION = P006G4_A885TBM03_VERSION[0] ;
            n885TBM03_VERSION = P006G4_n885TBM03_VERSION[0] ;
            A178TBM03_DEL_FLG = P006G4_A178TBM03_DEL_FLG[0] ;
            n178TBM03_DEL_FLG = P006G4_n178TBM03_DEL_FLG[0] ;
            A182TBM03_UPD_DATETIME = P006G4_A182TBM03_UPD_DATETIME[0] ;
            n182TBM03_UPD_DATETIME = P006G4_n182TBM03_UPD_DATETIME[0] ;
            A183TBM03_UPD_USER_ID = P006G4_A183TBM03_UPD_USER_ID[0] ;
            n183TBM03_UPD_USER_ID = P006G4_n183TBM03_UPD_USER_ID[0] ;
            A184TBM03_UPD_PROG_NM = P006G4_A184TBM03_UPD_PROG_NM[0] ;
            n184TBM03_UPD_PROG_NM = P006G4_n184TBM03_UPD_PROG_NM[0] ;
            A185TBM03_UPD_CNT = P006G4_A185TBM03_UPD_CNT[0] ;
            n185TBM03_UPD_CNT = P006G4_n185TBM03_UPD_CNT[0] ;
            AV29GXLvl82 = (byte)(1) ;
            if ( (GXutil.strcmp("", A164TBM03_VAR_DESC)==0) )
            {
               A164TBM03_VAR_DESC = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc() ;
               n164TBM03_VAR_DESC = false ;
            }
            A165TBM03_SDTM_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg() ;
            n165TBM03_SDTM_FLG = false ;
            A166TBM03_CDASH_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg() ;
            n166TBM03_CDASH_FLG = false ;
            A410TBM03_INPUT_TYPE_DIV = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div() ;
            n410TBM03_INPUT_TYPE_DIV = false ;
            A167TBM03_REQUIRED_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg() ;
            n167TBM03_REQUIRED_FLG = false ;
            A602TBM03_SAS_FIELD_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm() ;
            n602TBM03_SAS_FIELD_NM = false ;
            A624TBM03_ODM_DATA_TYPE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type() ;
            n624TBM03_ODM_DATA_TYPE = false ;
            if ( (GXutil.strcmp("", A168TBM03_NOTE)==0) )
            {
               A168TBM03_NOTE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note() ;
               n168TBM03_NOTE = false ;
            }
            A169TBM03_ORDER = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order() ;
            n169TBM03_ORDER = false ;
            A885TBM03_VERSION = AV12P_VERSION ;
            n885TBM03_VERSION = false ;
            A178TBM03_DEL_FLG = "0" ;
            n178TBM03_DEL_FLG = false ;
            A182TBM03_UPD_DATETIME = AV11C_DATETIME ;
            n182TBM03_UPD_DATETIME = false ;
            A183TBM03_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n183TBM03_UPD_USER_ID = false ;
            A184TBM03_UPD_PROG_NM = AV28Pgmname ;
            n184TBM03_UPD_PROG_NM = false ;
            A185TBM03_UPD_CNT = (long)(A185TBM03_UPD_CNT+1) ;
            n185TBM03_UPD_CNT = false ;
            Gx_ope = "Update" ;
            Gx_etb = "TBM03_CDISC_ITEM" ;
            /* Using cursor P006G5 */
            pr_default.execute(3, new Object[] {new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT), A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM});
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
         if ( AV29GXLvl82 == 0 )
         {
            /*
               INSERT RECORD ON TABLE TBM03_CDISC_ITEM

            */
            A162TBM03_DOM_CD = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_cd() ;
            A163TBM03_DOM_VAR_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_dom_var_nm() ;
            A164TBM03_VAR_DESC = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_var_desc() ;
            n164TBM03_VAR_DESC = false ;
            A165TBM03_SDTM_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sdtm_flg() ;
            n165TBM03_SDTM_FLG = false ;
            A166TBM03_CDASH_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_cdash_flg() ;
            n166TBM03_CDASH_FLG = false ;
            A410TBM03_INPUT_TYPE_DIV = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_input_type_div() ;
            n410TBM03_INPUT_TYPE_DIV = false ;
            A167TBM03_REQUIRED_FLG = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_required_flg() ;
            n167TBM03_REQUIRED_FLG = false ;
            A602TBM03_SAS_FIELD_NM = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_sas_field_nm() ;
            n602TBM03_SAS_FIELD_NM = false ;
            A624TBM03_ODM_DATA_TYPE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_odm_data_type() ;
            n624TBM03_ODM_DATA_TYPE = false ;
            A168TBM03_NOTE = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_note() ;
            n168TBM03_NOTE = false ;
            A169TBM03_ORDER = AV9A211_SD01_IMPORT_I.getgxTv_SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem_Tbm03_order() ;
            n169TBM03_ORDER = false ;
            A885TBM03_VERSION = AV12P_VERSION ;
            n885TBM03_VERSION = false ;
            A178TBM03_DEL_FLG = "0" ;
            n178TBM03_DEL_FLG = false ;
            A179TBM03_CRT_DATETIME = AV11C_DATETIME ;
            n179TBM03_CRT_DATETIME = false ;
            A180TBM03_CRT_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n180TBM03_CRT_USER_ID = false ;
            A181TBM03_CRT_PROG_NM = AV28Pgmname ;
            n181TBM03_CRT_PROG_NM = false ;
            A182TBM03_UPD_DATETIME = AV11C_DATETIME ;
            n182TBM03_UPD_DATETIME = false ;
            A183TBM03_UPD_USER_ID = AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id() ;
            n183TBM03_UPD_USER_ID = false ;
            A184TBM03_UPD_PROG_NM = AV28Pgmname ;
            n184TBM03_UPD_PROG_NM = false ;
            A185TBM03_UPD_CNT = 1 ;
            n185TBM03_UPD_CNT = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBM03_CDISC_ITEM" ;
            /* Using cursor P006G6 */
            pr_default.execute(4, new Object[] {A162TBM03_DOM_CD, A163TBM03_DOM_VAR_NM, new Boolean(n164TBM03_VAR_DESC), A164TBM03_VAR_DESC, new Boolean(n165TBM03_SDTM_FLG), A165TBM03_SDTM_FLG, new Boolean(n166TBM03_CDASH_FLG), A166TBM03_CDASH_FLG, new Boolean(n410TBM03_INPUT_TYPE_DIV), A410TBM03_INPUT_TYPE_DIV, new Boolean(n167TBM03_REQUIRED_FLG), A167TBM03_REQUIRED_FLG, new Boolean(n602TBM03_SAS_FIELD_NM), A602TBM03_SAS_FIELD_NM, new Boolean(n624TBM03_ODM_DATA_TYPE), A624TBM03_ODM_DATA_TYPE, new Boolean(n168TBM03_NOTE), A168TBM03_NOTE, new Boolean(n169TBM03_ORDER), new Integer(A169TBM03_ORDER), new Boolean(n885TBM03_VERSION), A885TBM03_VERSION, new Boolean(n178TBM03_DEL_FLG), A178TBM03_DEL_FLG, new Boolean(n179TBM03_CRT_DATETIME), A179TBM03_CRT_DATETIME, new Boolean(n180TBM03_CRT_USER_ID), A180TBM03_CRT_USER_ID, new Boolean(n181TBM03_CRT_PROG_NM), A181TBM03_CRT_PROG_NM, new Boolean(n182TBM03_UPD_DATETIME), A182TBM03_UPD_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), A183TBM03_UPD_USER_ID, new Boolean(n184TBM03_UPD_PROG_NM), A184TBM03_UPD_PROG_NM, new Boolean(n185TBM03_UPD_CNT), new Long(A185TBM03_UPD_CNT)});
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
      /* Using cursor P006G7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A522TBM02_DEL_FLG = P006G7_A522TBM02_DEL_FLG[0] ;
         n522TBM02_DEL_FLG = P006G7_n522TBM02_DEL_FLG[0] ;
         A521TBM02_ORDER = P006G7_A521TBM02_ORDER[0] ;
         n521TBM02_ORDER = P006G7_n521TBM02_ORDER[0] ;
         A516TBM02_DOM_CD = P006G7_A516TBM02_DOM_CD[0] ;
         AV23W_TBM02_ORDER = A521TBM02_ORDER ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S13151( )
   {
      /* 'SUB_NOUPD_DEL' Routine */
      /* Optimized UPDATE. */
      Gx_ope = "Update" ;
      Gx_etb = "TBM03_CDISC_ITEM" ;
      /* Using cursor P006G8 */
      String AV28Pgmname184Aux ;
      AV28Pgmname184Aux = AV28Pgmname ;
      pr_default.execute(6, new Object[] {new Boolean(n182TBM03_UPD_DATETIME), AV11C_DATETIME, new Boolean(n183TBM03_UPD_USER_ID), AV13W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), new Boolean(n184TBM03_UPD_PROG_NM), AV28Pgmname184Aux, AV11C_DATETIME});
      /* End optimized UPDATE. */
   }

   public void S14170( )
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S15188( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV10C_APP_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV18W_EXTRA_INFO;
      GXv_int5[0] = AV15W_ERR_CD ;
      GXv_char2[0] = AV16W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int5, GXv_char2) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
      a211_pc01_cdisc_item_reg.this.AV15W_ERR_CD = GXv_int5[0] ;
      a211_pc01_cdisc_item_reg.this.AV16W_ERR_MSG = GXv_char2[0] ;
      AV21W_RTN_MSG.add(AV16W_ERR_MSG, 0);
      Application.rollback(context, remoteHandle, "DEFAULT", "a211_pc01_cdisc_item_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
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
                  /* Execute user subroutine: S15188 */
                  S15188 ();
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
      AV11C_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV22W_SAVE_DOM_CD = "" ;
      AV9A211_SD01_IMPORT_I = new SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem(remoteHandle, context);
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P006G2_A516TBM02_DOM_CD = new String[] {""} ;
      A516TBM02_DOM_CD = "" ;
      A517TBM02_DOM_ENM = "" ;
      A518TBM02_DOM_JNM = "" ;
      A519TBM02_DOM_GRP_NM = "" ;
      A522TBM02_DEL_FLG = "" ;
      A523TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A524TBM02_CRT_USER_ID = "" ;
      AV13W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      A525TBM02_CRT_PROG_NM = "" ;
      AV28Pgmname = "" ;
      A526TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A527TBM02_UPD_USER_ID = "" ;
      A528TBM02_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      P006G4_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      P006G4_A162TBM03_DOM_CD = new String[] {""} ;
      P006G4_A164TBM03_VAR_DESC = new String[] {""} ;
      P006G4_n164TBM03_VAR_DESC = new boolean[] {false} ;
      P006G4_A165TBM03_SDTM_FLG = new String[] {""} ;
      P006G4_n165TBM03_SDTM_FLG = new boolean[] {false} ;
      P006G4_A166TBM03_CDASH_FLG = new String[] {""} ;
      P006G4_n166TBM03_CDASH_FLG = new boolean[] {false} ;
      P006G4_A410TBM03_INPUT_TYPE_DIV = new String[] {""} ;
      P006G4_n410TBM03_INPUT_TYPE_DIV = new boolean[] {false} ;
      P006G4_A167TBM03_REQUIRED_FLG = new String[] {""} ;
      P006G4_n167TBM03_REQUIRED_FLG = new boolean[] {false} ;
      P006G4_A602TBM03_SAS_FIELD_NM = new String[] {""} ;
      P006G4_n602TBM03_SAS_FIELD_NM = new boolean[] {false} ;
      P006G4_A624TBM03_ODM_DATA_TYPE = new String[] {""} ;
      P006G4_n624TBM03_ODM_DATA_TYPE = new boolean[] {false} ;
      P006G4_A168TBM03_NOTE = new String[] {""} ;
      P006G4_n168TBM03_NOTE = new boolean[] {false} ;
      P006G4_A169TBM03_ORDER = new int[1] ;
      P006G4_n169TBM03_ORDER = new boolean[] {false} ;
      P006G4_A885TBM03_VERSION = new String[] {""} ;
      P006G4_n885TBM03_VERSION = new boolean[] {false} ;
      P006G4_A178TBM03_DEL_FLG = new String[] {""} ;
      P006G4_n178TBM03_DEL_FLG = new boolean[] {false} ;
      P006G4_A182TBM03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P006G4_n182TBM03_UPD_DATETIME = new boolean[] {false} ;
      P006G4_A183TBM03_UPD_USER_ID = new String[] {""} ;
      P006G4_n183TBM03_UPD_USER_ID = new boolean[] {false} ;
      P006G4_A184TBM03_UPD_PROG_NM = new String[] {""} ;
      P006G4_n184TBM03_UPD_PROG_NM = new boolean[] {false} ;
      P006G4_A185TBM03_UPD_CNT = new long[1] ;
      P006G4_n185TBM03_UPD_CNT = new boolean[] {false} ;
      A163TBM03_DOM_VAR_NM = "" ;
      A162TBM03_DOM_CD = "" ;
      A164TBM03_VAR_DESC = "" ;
      A165TBM03_SDTM_FLG = "" ;
      A166TBM03_CDASH_FLG = "" ;
      A410TBM03_INPUT_TYPE_DIV = "" ;
      A167TBM03_REQUIRED_FLG = "" ;
      A602TBM03_SAS_FIELD_NM = "" ;
      A624TBM03_ODM_DATA_TYPE = "" ;
      A168TBM03_NOTE = "" ;
      A885TBM03_VERSION = "" ;
      A178TBM03_DEL_FLG = "" ;
      A182TBM03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A183TBM03_UPD_USER_ID = "" ;
      A184TBM03_UPD_PROG_NM = "" ;
      A179TBM03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A180TBM03_CRT_USER_ID = "" ;
      A181TBM03_CRT_PROG_NM = "" ;
      P006G7_A522TBM02_DEL_FLG = new String[] {""} ;
      P006G7_n522TBM02_DEL_FLG = new boolean[] {false} ;
      P006G7_A521TBM02_ORDER = new int[1] ;
      P006G7_n521TBM02_ORDER = new boolean[] {false} ;
      P006G7_A516TBM02_DOM_CD = new String[] {""} ;
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV17W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO4 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      AV16W_ERR_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a211_pc01_cdisc_item_reg__default(),
         new Object[] {
             new Object[] {
            P006G2_A516TBM02_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            P006G4_A163TBM03_DOM_VAR_NM, P006G4_A162TBM03_DOM_CD, P006G4_A164TBM03_VAR_DESC, P006G4_n164TBM03_VAR_DESC, P006G4_A165TBM03_SDTM_FLG, P006G4_n165TBM03_SDTM_FLG, P006G4_A166TBM03_CDASH_FLG, P006G4_n166TBM03_CDASH_FLG, P006G4_A410TBM03_INPUT_TYPE_DIV, P006G4_n410TBM03_INPUT_TYPE_DIV,
            P006G4_A167TBM03_REQUIRED_FLG, P006G4_n167TBM03_REQUIRED_FLG, P006G4_A602TBM03_SAS_FIELD_NM, P006G4_n602TBM03_SAS_FIELD_NM, P006G4_A624TBM03_ODM_DATA_TYPE, P006G4_n624TBM03_ODM_DATA_TYPE, P006G4_A168TBM03_NOTE, P006G4_n168TBM03_NOTE, P006G4_A169TBM03_ORDER, P006G4_n169TBM03_ORDER,
            P006G4_A885TBM03_VERSION, P006G4_n885TBM03_VERSION, P006G4_A178TBM03_DEL_FLG, P006G4_n178TBM03_DEL_FLG, P006G4_A182TBM03_UPD_DATETIME, P006G4_n182TBM03_UPD_DATETIME, P006G4_A183TBM03_UPD_USER_ID, P006G4_n183TBM03_UPD_USER_ID, P006G4_A184TBM03_UPD_PROG_NM, P006G4_n184TBM03_UPD_PROG_NM,
            P006G4_A185TBM03_UPD_CNT, P006G4_n185TBM03_UPD_CNT
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P006G7_A522TBM02_DEL_FLG, P006G7_n522TBM02_DEL_FLG, P006G7_A521TBM02_ORDER, P006G7_n521TBM02_ORDER, P006G7_A516TBM02_DOM_CD
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
   private short GXv_int5[] ;
   private int AV26GXV1 ;
   private int AV23W_TBM02_ORDER ;
   private int GX_INS38 ;
   private int A521TBM02_ORDER ;
   private int A169TBM03_ORDER ;
   private int GX_INS14 ;
   private int GXActiveErrHndl ;
   private long A529TBM02_UPD_CNT ;
   private long A185TBM03_UPD_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String AV28Pgmname ;
   private String Gx_emsg ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private java.util.Date AV11C_DATETIME ;
   private java.util.Date A523TBM02_CRT_DATETIME ;
   private java.util.Date A526TBM02_UPD_DATETIME ;
   private java.util.Date A182TBM03_UPD_DATETIME ;
   private java.util.Date A179TBM03_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n517TBM02_DOM_ENM ;
   private boolean n518TBM02_DOM_JNM ;
   private boolean n519TBM02_DOM_GRP_NM ;
   private boolean n521TBM02_ORDER ;
   private boolean n522TBM02_DEL_FLG ;
   private boolean n523TBM02_CRT_DATETIME ;
   private boolean n524TBM02_CRT_USER_ID ;
   private boolean n525TBM02_CRT_PROG_NM ;
   private boolean n526TBM02_UPD_DATETIME ;
   private boolean n527TBM02_UPD_USER_ID ;
   private boolean n528TBM02_UPD_PROG_NM ;
   private boolean n529TBM02_UPD_CNT ;
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
   private boolean n182TBM03_UPD_DATETIME ;
   private boolean n183TBM03_UPD_USER_ID ;
   private boolean n184TBM03_UPD_PROG_NM ;
   private boolean n185TBM03_UPD_CNT ;
   private boolean n179TBM03_CRT_DATETIME ;
   private boolean n180TBM03_CRT_USER_ID ;
   private boolean n181TBM03_CRT_PROG_NM ;
   private String AV12P_VERSION ;
   private String AV10C_APP_ID ;
   private String AV22W_SAVE_DOM_CD ;
   private String A516TBM02_DOM_CD ;
   private String A517TBM02_DOM_ENM ;
   private String A518TBM02_DOM_JNM ;
   private String A519TBM02_DOM_GRP_NM ;
   private String A522TBM02_DEL_FLG ;
   private String A524TBM02_CRT_USER_ID ;
   private String A525TBM02_CRT_PROG_NM ;
   private String A527TBM02_UPD_USER_ID ;
   private String A528TBM02_UPD_PROG_NM ;
   private String A163TBM03_DOM_VAR_NM ;
   private String A162TBM03_DOM_CD ;
   private String A164TBM03_VAR_DESC ;
   private String A165TBM03_SDTM_FLG ;
   private String A166TBM03_CDASH_FLG ;
   private String A410TBM03_INPUT_TYPE_DIV ;
   private String A167TBM03_REQUIRED_FLG ;
   private String A602TBM03_SAS_FIELD_NM ;
   private String A624TBM03_ODM_DATA_TYPE ;
   private String A168TBM03_NOTE ;
   private String A885TBM03_VERSION ;
   private String A178TBM03_DEL_FLG ;
   private String A183TBM03_UPD_USER_ID ;
   private String A184TBM03_UPD_PROG_NM ;
   private String A180TBM03_CRT_USER_ID ;
   private String A181TBM03_CRT_PROG_NM ;
   private String AV17W_ERRCD ;
   private String AV19W_MSG ;
   private String AV16W_ERR_MSG ;
   private SdtA_LOGIN_SDT AV13W_A_LOGIN_SDT ;
   private short[] aP2 ;
   private GxObjectCollection[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P006G2_A516TBM02_DOM_CD ;
   private String[] P006G4_A163TBM03_DOM_VAR_NM ;
   private String[] P006G4_A162TBM03_DOM_CD ;
   private String[] P006G4_A164TBM03_VAR_DESC ;
   private boolean[] P006G4_n164TBM03_VAR_DESC ;
   private String[] P006G4_A165TBM03_SDTM_FLG ;
   private boolean[] P006G4_n165TBM03_SDTM_FLG ;
   private String[] P006G4_A166TBM03_CDASH_FLG ;
   private boolean[] P006G4_n166TBM03_CDASH_FLG ;
   private String[] P006G4_A410TBM03_INPUT_TYPE_DIV ;
   private boolean[] P006G4_n410TBM03_INPUT_TYPE_DIV ;
   private String[] P006G4_A167TBM03_REQUIRED_FLG ;
   private boolean[] P006G4_n167TBM03_REQUIRED_FLG ;
   private String[] P006G4_A602TBM03_SAS_FIELD_NM ;
   private boolean[] P006G4_n602TBM03_SAS_FIELD_NM ;
   private String[] P006G4_A624TBM03_ODM_DATA_TYPE ;
   private boolean[] P006G4_n624TBM03_ODM_DATA_TYPE ;
   private String[] P006G4_A168TBM03_NOTE ;
   private boolean[] P006G4_n168TBM03_NOTE ;
   private int[] P006G4_A169TBM03_ORDER ;
   private boolean[] P006G4_n169TBM03_ORDER ;
   private String[] P006G4_A885TBM03_VERSION ;
   private boolean[] P006G4_n885TBM03_VERSION ;
   private String[] P006G4_A178TBM03_DEL_FLG ;
   private boolean[] P006G4_n178TBM03_DEL_FLG ;
   private java.util.Date[] P006G4_A182TBM03_UPD_DATETIME ;
   private boolean[] P006G4_n182TBM03_UPD_DATETIME ;
   private String[] P006G4_A183TBM03_UPD_USER_ID ;
   private boolean[] P006G4_n183TBM03_UPD_USER_ID ;
   private String[] P006G4_A184TBM03_UPD_PROG_NM ;
   private boolean[] P006G4_n184TBM03_UPD_PROG_NM ;
   private long[] P006G4_A185TBM03_UPD_CNT ;
   private boolean[] P006G4_n185TBM03_UPD_CNT ;
   private String[] P006G7_A522TBM02_DEL_FLG ;
   private boolean[] P006G7_n522TBM02_DEL_FLG ;
   private int[] P006G7_A521TBM02_ORDER ;
   private boolean[] P006G7_n521TBM02_ORDER ;
   private String[] P006G7_A516TBM02_DOM_CD ;
   private GxObjectCollection AV8A211_SD01_IMPORT_C ;
   private GxObjectCollection AV21W_RTN_MSG ;
   private SdtA211_SD01_IMPORT_A211_SD01_IMPORTItem AV9A211_SD01_IMPORT_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO4[] ;
}

final  class a211_pc01_cdisc_item_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006G2", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ORDER BY `TBM02_DOM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006G3", "INSERT INTO `TBM02_CDISC_DOMAIN` (`TBM02_DOM_CD`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_PROG_NM`, `TBM02_UPD_CNT`, `TBM02_NOTE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '')", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006G4", "SELECT `TBM03_DOM_VAR_NM`, `TBM03_DOM_CD`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_PROG_NM`, `TBM03_UPD_CNT` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ? and `TBM03_DOM_VAR_NM` = ? ORDER BY `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006G5", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_VAR_DESC`=?, `TBM03_SDTM_FLG`=?, `TBM03_CDASH_FLG`=?, `TBM03_INPUT_TYPE_DIV`=?, `TBM03_REQUIRED_FLG`=?, `TBM03_SAS_FIELD_NM`=?, `TBM03_ODM_DATA_TYPE`=?, `TBM03_NOTE`=?, `TBM03_ORDER`=?, `TBM03_VERSION`=?, `TBM03_DEL_FLG`=?, `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_PROG_NM`=?, `TBM03_UPD_CNT`=?  WHERE `TBM03_DOM_CD` = ? AND `TBM03_DOM_VAR_NM` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006G6", "INSERT INTO `TBM03_CDISC_ITEM` (`TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`, `TBM03_VAR_DESC`, `TBM03_SDTM_FLG`, `TBM03_CDASH_FLG`, `TBM03_INPUT_TYPE_DIV`, `TBM03_REQUIRED_FLG`, `TBM03_SAS_FIELD_NM`, `TBM03_ODM_DATA_TYPE`, `TBM03_NOTE`, `TBM03_ORDER`, `TBM03_VERSION`, `TBM03_DEL_FLG`, `TBM03_CRT_DATETIME`, `TBM03_CRT_USER_ID`, `TBM03_CRT_PROG_NM`, `TBM03_UPD_DATETIME`, `TBM03_UPD_USER_ID`, `TBM03_UPD_PROG_NM`, `TBM03_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P006G7", "SELECT `TBM02_DEL_FLG`, `TBM02_ORDER`, `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` ORDER BY `TBM02_ORDER` DESC  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P006G8", "UPDATE `TBM03_CDISC_ITEM` SET `TBM03_DEL_FLG`='1', `TBM03_UPD_DATETIME`=?, `TBM03_UPD_USER_ID`=?, `TBM03_UPD_PROG_NM`=?, `TBM03_UPD_CNT`=`TBM03_UPD_CNT` + 1  WHERE ( `TBM03_UPD_DATETIME` IS NULL or `TBM03_UPD_DATETIME` <> ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               break;
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
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
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
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setVarchar(2, (String)parms[1], 50);
               break;
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
               break;
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
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 40);
               }
               stmt.setDateTime(4, (java.util.Date)parms[6], false);
               break;
      }
   }

}

