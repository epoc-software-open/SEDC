/*
               File: B599_PC27_SEARCH_CRF_RES
        Description: CRF�������ʎ擾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:36.89
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc27_search_crf_res extends GXProcedure
{
   public b599_pc27_search_crf_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc27_search_crf_res.class ), "" );
   }

   public b599_pc27_search_crf_res( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             GxObjectCollection[] aP8 ,
                             short[] aP9 )
   {
      b599_pc27_search_crf_res.this.AV17P_USER_ID = aP0;
      b599_pc27_search_crf_res.this.AV15P_STUDY_ID = aP1;
      b599_pc27_search_crf_res.this.AV10P_AUTH_CD = aP2;
      b599_pc27_search_crf_res.this.AV13P_SITE = aP3;
      b599_pc27_search_crf_res.this.AV16P_SUBJECT = aP4;
      b599_pc27_search_crf_res.this.AV11P_CRF = aP5;
      b599_pc27_search_crf_res.this.AV12P_QUICK_SEARCH = aP6;
      b599_pc27_search_crf_res.this.AV14P_SORT = aP7;
      b599_pc27_search_crf_res.this.AV32W_RTN_CSV = aP8[0];
      this.aP8 = aP8;
      b599_pc27_search_crf_res.this.aP9 = aP9;
      b599_pc27_search_crf_res.this.aP10 = aP10;
      b599_pc27_search_crf_res.this.aP10 = new String[] {""};
      initialize();
      privateExecute();
      return aP10[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        String aP7 ,
                        GxObjectCollection[] aP8 ,
                        short[] aP9 ,
                        String[] aP10 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9, aP10);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             String aP7 ,
                             GxObjectCollection[] aP8 ,
                             short[] aP9 ,
                             String[] aP10 )
   {
      b599_pc27_search_crf_res.this.AV17P_USER_ID = aP0;
      b599_pc27_search_crf_res.this.AV15P_STUDY_ID = aP1;
      b599_pc27_search_crf_res.this.AV10P_AUTH_CD = aP2;
      b599_pc27_search_crf_res.this.AV13P_SITE = aP3;
      b599_pc27_search_crf_res.this.AV16P_SUBJECT = aP4;
      b599_pc27_search_crf_res.this.AV11P_CRF = aP5;
      b599_pc27_search_crf_res.this.AV12P_QUICK_SEARCH = aP6;
      b599_pc27_search_crf_res.this.AV14P_SORT = aP7;
      b599_pc27_search_crf_res.this.AV32W_RTN_CSV = aP8[0];
      this.aP8 = aP8;
      b599_pc27_search_crf_res.this.aP9 = aP9;
      b599_pc27_search_crf_res.this.aP10 = aP10;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B599" ;
      AV31W_RTN_CD = (short)(0) ;
      AV33W_RTN_MSG = "" ;
      AV26W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      /* Execute user subroutine: S151 */
      S151 ();
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
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV37W_STUDY_ID = GXutil.lval( AV15P_STUDY_ID) ;
      GXt_char1 = AV24W_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b599_pc27_search_crf_res.this.GXt_char1 = GXv_char2[0] ;
      AV24W_DISP_DATETIME = GXt_char1 ;
      if ( AV31W_RTN_CD == 0 )
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
      if ( AV31W_RTN_CD == 0 )
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
      if ( AV31W_RTN_CD == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
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
      /* 'SUB_GET_CONDITION' Routine */
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "1") == 0 )
      {
         AV43GXLvl58 = (byte)(0) ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TBM07_AUTH_BEHAVIOR" ;
         /* Using cursor P002Q2 */
         pr_default.execute(0, new Object[] {AV10P_AUTH_CD});
         if ( Gx_err != 0 )
         {
            AV43GXLvl58 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A215TAM04_DEL_FLG = P002Q2_A215TAM04_DEL_FLG[0] ;
            n215TAM04_DEL_FLG = P002Q2_n215TAM04_DEL_FLG[0] ;
            A626TBM07_DEL_FLG = P002Q2_A626TBM07_DEL_FLG[0] ;
            n626TBM07_DEL_FLG = P002Q2_n626TBM07_DEL_FLG[0] ;
            A50TBM07_AUTH_CD = P002Q2_A50TBM07_AUTH_CD[0] ;
            A687TAM04_AUTH_LVL = P002Q2_A687TAM04_AUTH_LVL[0] ;
            n687TAM04_AUTH_LVL = P002Q2_n687TAM04_AUTH_LVL[0] ;
            A623TBM07_CRF_INP_AUTH_FLG = P002Q2_A623TBM07_CRF_INP_AUTH_FLG[0] ;
            n623TBM07_CRF_INP_AUTH_FLG = P002Q2_n623TBM07_CRF_INP_AUTH_FLG[0] ;
            A624TBM07_CRF_EDIT_AUTH_FLG = P002Q2_A624TBM07_CRF_EDIT_AUTH_FLG[0] ;
            n624TBM07_CRF_EDIT_AUTH_FLG = P002Q2_n624TBM07_CRF_EDIT_AUTH_FLG[0] ;
            A215TAM04_DEL_FLG = P002Q2_A215TAM04_DEL_FLG[0] ;
            n215TAM04_DEL_FLG = P002Q2_n215TAM04_DEL_FLG[0] ;
            A687TAM04_AUTH_LVL = P002Q2_A687TAM04_AUTH_LVL[0] ;
            n687TAM04_AUTH_LVL = P002Q2_n687TAM04_AUTH_LVL[0] ;
            AV43GXLvl58 = (byte)(1) ;
            AV19W_AUTH_LVL = A687TAM04_AUTH_LVL ;
            AV39W_CRF_INP_AUTH_FLG = A623TBM07_CRF_INP_AUTH_FLG ;
            AV40W_CRF_EDIT_AUTH_FLG = A624TBM07_CRF_EDIT_AUTH_FLG ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV43GXLvl58 == 0 )
         {
            AV31W_RTN_CD = (short)(1) ;
            GXt_char1 = AV33W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "����", "", "", "", "", GXv_char2) ;
            b599_pc27_search_crf_res.this.GXt_char1 = GXv_char2[0] ;
            AV33W_RTN_MSG = GXt_char1 ;
         }
         if ( AV31W_RTN_CD == 0 )
         {
            AV38W_SITE_ID = "" ;
            AV44GXLvl75 = (byte)(0) ;
            Gx_ope = "Fetch" ;
            Gx_etb = "TAM07_USER" ;
            /* Using cursor P002Q3 */
            pr_default.execute(1, new Object[] {AV17P_USER_ID});
            if ( Gx_err != 0 )
            {
               AV44GXLvl75 = (byte)(1) ;
            }
            while ( (pr_default.getStatus(1) != 101) )
            {
               A214TAM07_DEL_FLG = P002Q3_A214TAM07_DEL_FLG[0] ;
               n214TAM07_DEL_FLG = P002Q3_n214TAM07_DEL_FLG[0] ;
               A55TAM07_USER_ID = P002Q3_A55TAM07_USER_ID[0] ;
               A333TAM07_SITE_ID = P002Q3_A333TAM07_SITE_ID[0] ;
               n333TAM07_SITE_ID = P002Q3_n333TAM07_SITE_ID[0] ;
               AV44GXLvl75 = (byte)(1) ;
               AV38W_SITE_ID = A333TAM07_SITE_ID ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(1);
            if ( AV44GXLvl75 == 0 )
            {
               AV31W_RTN_CD = (short)(1) ;
               GXt_char1 = AV33W_RTN_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00003", "���[�U�[", "", "", "", "", GXv_char2) ;
               b599_pc27_search_crf_res.this.GXt_char1 = GXv_char2[0] ;
               AV33W_RTN_MSG = GXt_char1 ;
            }
         }
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "4") == 0 )
      {
         AV18W_AUTH_CD.clear();
         AV18W_AUTH_CD.add(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "018"), 0);
         AV18W_AUTH_CD.add(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "008"), 0);
      }
   }

   public void S121( )
   {
      /* 'SUB_SEARCH' Routine */
      AV29W_OUTER_SUBJECT_ID_C = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV16P_SUBJECT,",")) ;
      AV35W_SITE_ID_C = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV13P_SITE,",")) ;
      AV23W_CSV_C = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV11P_CRF,",")) ;
      AV22W_CRF_ID_C.clear();
      AV20W_CNT = (short)(1) ;
      while ( AV20W_CNT <= AV23W_CSV_C.size() )
      {
         AV22W_CRF_ID_C.add((short)(GXutil.val( (String)AV23W_CSV_C.elementAt(-1+AV20W_CNT), ".")), 0);
         AV20W_CNT = (short)(AV20W_CNT+1) ;
      }
      AV45GXLvl121 = (byte)(0) ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           A647TBT01_OUTER_SUBJECT_ID ,
                                           AV29W_OUTER_SUBJECT_ID_C ,
                                           A698TBT01_SITE_ID ,
                                           AV35W_SITE_ID_C ,
                                           new Short(A91TBT02_CRF_ID) ,
                                           AV22W_CRF_ID_C ,
                                           A654TBT02_UPLOAD_AUTH_CD ,
                                           AV18W_AUTH_CD ,
                                           AV16P_SUBJECT ,
                                           AV13P_SITE ,
                                           AV11P_CRF ,
                                           AV12P_QUICK_SEARCH ,
                                           AV39W_CRF_INP_AUTH_FLG ,
                                           AV40W_CRF_EDIT_AUTH_FLG ,
                                           new Byte(A499TBT02_CRF_INPUT_LEVEL) ,
                                           new Byte(AV19W_AUTH_LVL) ,
                                           AV38W_SITE_ID ,
                                           A655TBT02_DM_ARRIVAL_FLG ,
                                           A657TBT02_APPROVAL_FLG ,
                                           A661TBT02_INPUT_END_FLG ,
                                           new Long(AV37W_STUDY_ID) ,
                                           new Long(A89TBT02_STUDY_ID) },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.OBJECT_COLLECTION, TypeConstants.SHORT, TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.OBJECT_COLLECTION, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BOOLEAN, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.LONG
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBT02_CRF" ;
      /* Using cursor P002Q4 */
      pr_default.execute(2, new Object[] {new Long(AV37W_STUDY_ID), new Byte(AV19W_AUTH_LVL), AV38W_SITE_ID});
      if ( Gx_err != 0 )
      {
         AV45GXLvl121 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(2) != 101) )
      {
         A89TBT02_STUDY_ID = P002Q4_A89TBT02_STUDY_ID[0] ;
         A90TBT02_SUBJECT_ID = P002Q4_A90TBT02_SUBJECT_ID[0] ;
         A91TBT02_CRF_ID = P002Q4_A91TBT02_CRF_ID[0] ;
         A698TBT01_SITE_ID = P002Q4_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P002Q4_n698TBT01_SITE_ID[0] ;
         A647TBT01_OUTER_SUBJECT_ID = P002Q4_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = P002Q4_n647TBT01_OUTER_SUBJECT_ID[0] ;
         A498TBT02_CRF_LATEST_VERSION = P002Q4_A498TBT02_CRF_LATEST_VERSION[0] ;
         n498TBT02_CRF_LATEST_VERSION = P002Q4_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = P002Q4_A499TBT02_CRF_INPUT_LEVEL[0] ;
         n499TBT02_CRF_INPUT_LEVEL = P002Q4_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = P002Q4_A648TBT02_LOCK_FLG[0] ;
         n648TBT02_LOCK_FLG = P002Q4_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = P002Q4_A649TBT02_LOCK_DATETIME[0] ;
         n649TBT02_LOCK_DATETIME = P002Q4_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = P002Q4_A650TBT02_LOCK_USER_ID[0] ;
         n650TBT02_LOCK_USER_ID = P002Q4_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = P002Q4_A651TBT02_LOCK_AUTH_CD[0] ;
         n651TBT02_LOCK_AUTH_CD = P002Q4_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = P002Q4_A652TBT02_UPLOAD_DATETIME[0] ;
         n652TBT02_UPLOAD_DATETIME = P002Q4_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = P002Q4_A653TBT02_UPLOAD_USER_ID[0] ;
         n653TBT02_UPLOAD_USER_ID = P002Q4_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = P002Q4_A654TBT02_UPLOAD_AUTH_CD[0] ;
         n654TBT02_UPLOAD_AUTH_CD = P002Q4_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P002Q4_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P002Q4_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P002Q4_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P002Q4_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = P002Q4_A657TBT02_APPROVAL_FLG[0] ;
         n657TBT02_APPROVAL_FLG = P002Q4_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = P002Q4_A658TBT02_APPROVAL_DATETIME[0] ;
         n658TBT02_APPROVAL_DATETIME = P002Q4_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = P002Q4_A659TBT02_APPROVAL_USER_ID[0] ;
         n659TBT02_APPROVAL_USER_ID = P002Q4_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = P002Q4_A660TBT02_APPROVAL_AUTH_CD[0] ;
         n660TBT02_APPROVAL_AUTH_CD = P002Q4_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A661TBT02_INPUT_END_FLG = P002Q4_A661TBT02_INPUT_END_FLG[0] ;
         n661TBT02_INPUT_END_FLG = P002Q4_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = P002Q4_A662TBT02_INPUT_END_DATETIME[0] ;
         n662TBT02_INPUT_END_DATETIME = P002Q4_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = P002Q4_A663TBT02_INPUT_END_USER_ID[0] ;
         n663TBT02_INPUT_END_USER_ID = P002Q4_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = P002Q4_A664TBT02_INPUT_END_AUTH_CD[0] ;
         n664TBT02_INPUT_END_AUTH_CD = P002Q4_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = P002Q4_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P002Q4_n449TBT02_DEL_FLG[0] ;
         A450TBT02_CRT_DATETIME = P002Q4_A450TBT02_CRT_DATETIME[0] ;
         n450TBT02_CRT_DATETIME = P002Q4_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = P002Q4_A451TBT02_CRT_USER_ID[0] ;
         n451TBT02_CRT_USER_ID = P002Q4_n451TBT02_CRT_USER_ID[0] ;
         A452TBT02_CRT_PROG_NM = P002Q4_A452TBT02_CRT_PROG_NM[0] ;
         n452TBT02_CRT_PROG_NM = P002Q4_n452TBT02_CRT_PROG_NM[0] ;
         A453TBT02_UPD_DATETIME = P002Q4_A453TBT02_UPD_DATETIME[0] ;
         n453TBT02_UPD_DATETIME = P002Q4_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = P002Q4_A454TBT02_UPD_USER_ID[0] ;
         n454TBT02_UPD_USER_ID = P002Q4_n454TBT02_UPD_USER_ID[0] ;
         A455TBT02_UPD_PROG_NM = P002Q4_A455TBT02_UPD_PROG_NM[0] ;
         n455TBT02_UPD_PROG_NM = P002Q4_n455TBT02_UPD_PROG_NM[0] ;
         A456TBT02_UPD_CNT = P002Q4_A456TBT02_UPD_CNT[0] ;
         n456TBT02_UPD_CNT = P002Q4_n456TBT02_UPD_CNT[0] ;
         A935TBT02_CRF_EDA_NO = P002Q4_A935TBT02_CRF_EDA_NO[0] ;
         A698TBT01_SITE_ID = P002Q4_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P002Q4_n698TBT01_SITE_ID[0] ;
         A647TBT01_OUTER_SUBJECT_ID = P002Q4_A647TBT01_OUTER_SUBJECT_ID[0] ;
         n647TBT01_OUTER_SUBJECT_ID = P002Q4_n647TBT01_OUTER_SUBJECT_ID[0] ;
         AV45GXLvl121 = (byte)(1) ;
         AV25W_EXIST = true ;
         if ( ((GXutil.strcmp(AV12P_QUICK_SEARCH, "2")==0)||(GXutil.strcmp(AV12P_QUICK_SEARCH, "3")==0)) )
         {
         }
         if ( AV25W_EXIST )
         {
            /*
               INSERT RECORD ON TABLE TBW03_CRF_SEARCH

            */
            A110TBW03_SESSION_ID = AV34W_SESSION.getId() ;
            A111TBW03_APP_ID = AV9C_TAM02_APP_ID ;
            A112TBW03_DISP_DATETIME = AV24W_DISP_DATETIME ;
            A113TBW03_STUDY_ID = A89TBT02_STUDY_ID ;
            A114TBW03_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
            A115TBW03_CRF_ID = A91TBT02_CRF_ID ;
            A120TBW03_SITE_ID = A698TBT01_SITE_ID ;
            n120TBW03_SITE_ID = false ;
            A715TBW03_OUTER_SUBJECT_ID = A647TBT01_OUTER_SUBJECT_ID ;
            n715TBW03_OUTER_SUBJECT_ID = false ;
            A716TBW03_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
            n716TBW03_CRF_LATEST_VERSION = false ;
            A717TBW03_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
            n717TBW03_CRF_INPUT_LEVEL = false ;
            A718TBW03_LOCK_FLG = A648TBT02_LOCK_FLG ;
            n718TBW03_LOCK_FLG = false ;
            A719TBW03_LOCK_DATETIME = A649TBT02_LOCK_DATETIME ;
            n719TBW03_LOCK_DATETIME = false ;
            A116TBW03_LOCK_USER_ID = A650TBT02_LOCK_USER_ID ;
            n116TBW03_LOCK_USER_ID = false ;
            A721TBW03_LOCK_AUTH_CD = A651TBT02_LOCK_AUTH_CD ;
            n721TBW03_LOCK_AUTH_CD = false ;
            A722TBW03_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
            n722TBW03_UPLOAD_DATETIME = false ;
            A117TBW03_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
            n117TBW03_UPLOAD_USER_ID = false ;
            A724TBW03_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
            n724TBW03_UPLOAD_AUTH_CD = false ;
            A725TBW03_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
            n725TBW03_DM_ARRIVAL_FLG = false ;
            A726TBW03_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
            n726TBW03_DM_ARRIVAL_DATETIME = false ;
            A727TBW03_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
            n727TBW03_APPROVAL_FLG = false ;
            A728TBW03_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
            n728TBW03_APPROVAL_DATETIME = false ;
            A118TBW03_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
            n118TBW03_APPROVAL_USER_ID = false ;
            A730TBW03_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
            n730TBW03_APPROVAL_AUTH_CD = false ;
            A731TBW03_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
            n731TBW03_INPUT_END_FLG = false ;
            A732TBW03_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
            n732TBW03_INPUT_END_DATETIME = false ;
            A119TBW03_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
            n119TBW03_INPUT_END_USER_ID = false ;
            A734TBW03_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
            n734TBW03_INPUT_END_AUTH_CD = false ;
            A780TBW03_DEL_FLG = A449TBT02_DEL_FLG ;
            n780TBW03_DEL_FLG = false ;
            A781TBW03_CRT_DATETIME = A450TBT02_CRT_DATETIME ;
            n781TBW03_CRT_DATETIME = false ;
            A121TBW03_CRT_USER_ID = A451TBT02_CRT_USER_ID ;
            n121TBW03_CRT_USER_ID = false ;
            A783TBW03_CRT_PROG_NM = A452TBT02_CRT_PROG_NM ;
            n783TBW03_CRT_PROG_NM = false ;
            A784TBW03_UPD_DATETIME = A453TBT02_UPD_DATETIME ;
            n784TBW03_UPD_DATETIME = false ;
            A122TBW03_UPD_USER_ID = A454TBT02_UPD_USER_ID ;
            n122TBW03_UPD_USER_ID = false ;
            A786TBW03_UPD_PROG_NM = A455TBT02_UPD_PROG_NM ;
            n786TBW03_UPD_PROG_NM = false ;
            A787TBW03_UPD_CNT = A456TBT02_UPD_CNT ;
            n787TBW03_UPD_CNT = false ;
            if ( (GXutil.strcmp("", A116TBW03_LOCK_USER_ID)==0) )
            {
               A116TBW03_LOCK_USER_ID = "" ;
               n116TBW03_LOCK_USER_ID = false ;
               n116TBW03_LOCK_USER_ID = true ;
            }
            if ( (GXutil.strcmp("", A117TBW03_UPLOAD_USER_ID)==0) )
            {
               A117TBW03_UPLOAD_USER_ID = "" ;
               n117TBW03_UPLOAD_USER_ID = false ;
               n117TBW03_UPLOAD_USER_ID = true ;
            }
            if ( (GXutil.strcmp("", A118TBW03_APPROVAL_USER_ID)==0) )
            {
               A118TBW03_APPROVAL_USER_ID = "" ;
               n118TBW03_APPROVAL_USER_ID = false ;
               n118TBW03_APPROVAL_USER_ID = true ;
            }
            if ( (GXutil.strcmp("", A119TBW03_INPUT_END_USER_ID)==0) )
            {
               A119TBW03_INPUT_END_USER_ID = "" ;
               n119TBW03_INPUT_END_USER_ID = false ;
               n119TBW03_INPUT_END_USER_ID = true ;
            }
            if ( (GXutil.strcmp("", A121TBW03_CRT_USER_ID)==0) )
            {
               A121TBW03_CRT_USER_ID = "" ;
               n121TBW03_CRT_USER_ID = false ;
               n121TBW03_CRT_USER_ID = true ;
            }
            if ( (GXutil.strcmp("", A122TBW03_UPD_USER_ID)==0) )
            {
               A122TBW03_UPD_USER_ID = "" ;
               n122TBW03_UPD_USER_ID = false ;
               n122TBW03_UPD_USER_ID = true ;
            }
            Gx_ope = "Insert" ;
            Gx_etb = "TBW03_CRF_SEARCH" ;
            /* Using cursor P002Q5 */
            pr_default.execute(3, new Object[] {A110TBW03_SESSION_ID, A111TBW03_APP_ID, A112TBW03_DISP_DATETIME, new Long(A113TBW03_STUDY_ID), new Integer(A114TBW03_SUBJECT_ID), new Short(A115TBW03_CRF_ID), new Boolean(n120TBW03_SITE_ID), A120TBW03_SITE_ID, new Boolean(n715TBW03_OUTER_SUBJECT_ID), A715TBW03_OUTER_SUBJECT_ID, new Boolean(n716TBW03_CRF_LATEST_VERSION), new Short(A716TBW03_CRF_LATEST_VERSION), new Boolean(n717TBW03_CRF_INPUT_LEVEL), new Byte(A717TBW03_CRF_INPUT_LEVEL), new Boolean(n718TBW03_LOCK_FLG), A718TBW03_LOCK_FLG, new Boolean(n719TBW03_LOCK_DATETIME), A719TBW03_LOCK_DATETIME, new Boolean(n116TBW03_LOCK_USER_ID), A116TBW03_LOCK_USER_ID, new Boolean(n721TBW03_LOCK_AUTH_CD), A721TBW03_LOCK_AUTH_CD, new Boolean(n722TBW03_UPLOAD_DATETIME), A722TBW03_UPLOAD_DATETIME, new Boolean(n117TBW03_UPLOAD_USER_ID), A117TBW03_UPLOAD_USER_ID, new Boolean(n724TBW03_UPLOAD_AUTH_CD), A724TBW03_UPLOAD_AUTH_CD, new Boolean(n725TBW03_DM_ARRIVAL_FLG), A725TBW03_DM_ARRIVAL_FLG, new Boolean(n726TBW03_DM_ARRIVAL_DATETIME), A726TBW03_DM_ARRIVAL_DATETIME, new Boolean(n727TBW03_APPROVAL_FLG), A727TBW03_APPROVAL_FLG, new Boolean(n728TBW03_APPROVAL_DATETIME), A728TBW03_APPROVAL_DATETIME, new Boolean(n118TBW03_APPROVAL_USER_ID), A118TBW03_APPROVAL_USER_ID, new Boolean(n730TBW03_APPROVAL_AUTH_CD), A730TBW03_APPROVAL_AUTH_CD, new Boolean(n731TBW03_INPUT_END_FLG), A731TBW03_INPUT_END_FLG, new Boolean(n732TBW03_INPUT_END_DATETIME), A732TBW03_INPUT_END_DATETIME, new Boolean(n119TBW03_INPUT_END_USER_ID), A119TBW03_INPUT_END_USER_ID, new Boolean(n734TBW03_INPUT_END_AUTH_CD), A734TBW03_INPUT_END_AUTH_CD, new Boolean(n780TBW03_DEL_FLG), A780TBW03_DEL_FLG, new Boolean(n781TBW03_CRT_DATETIME), A781TBW03_CRT_DATETIME, new Boolean(n121TBW03_CRT_USER_ID), A121TBW03_CRT_USER_ID, new Boolean(n783TBW03_CRT_PROG_NM), A783TBW03_CRT_PROG_NM, new Boolean(n784TBW03_UPD_DATETIME), A784TBW03_UPD_DATETIME, new Boolean(n122TBW03_UPD_USER_ID), A122TBW03_UPD_USER_ID, new Boolean(n786TBW03_UPD_PROG_NM), A786TBW03_UPD_PROG_NM, new Boolean(n787TBW03_UPD_CNT), new Long(A787TBW03_UPD_CNT)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
            if ( (pr_default.getStatus(3) == 1) )
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
         if ( AV31W_RTN_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV45GXLvl121 == 0 )
      {
         AV31W_RTN_CD = (short)(1) ;
         GXt_char1 = AV33W_RTN_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char2) ;
         b599_pc27_search_crf_res.this.GXt_char1 = GXv_char2[0] ;
         AV33W_RTN_MSG = GXt_char1 ;
      }
   }

   public void S131( )
   {
      /* 'SUB_CREATE_RES_CSV' Routine */
      AV46GXLvl254 = (byte)(0) ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           AV14P_SORT ,
                                           A110TBW03_SESSION_ID ,
                                           AV34W_SESSION.getId() ,
                                           A111TBW03_APP_ID ,
                                           AV9C_TAM02_APP_ID ,
                                           A112TBW03_DISP_DATETIME ,
                                           AV24W_DISP_DATETIME },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBW03_CRF_SEARCH" ;
      /* Using cursor P002Q6 */
      pr_default.execute(4, new Object[] {AV34W_SESSION.getId(), AV9C_TAM02_APP_ID, AV24W_DISP_DATETIME});
      if ( Gx_err != 0 )
      {
         AV46GXLvl254 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(4) != 101) )
      {
         A112TBW03_DISP_DATETIME = P002Q6_A112TBW03_DISP_DATETIME[0] ;
         A111TBW03_APP_ID = P002Q6_A111TBW03_APP_ID[0] ;
         A110TBW03_SESSION_ID = P002Q6_A110TBW03_SESSION_ID[0] ;
         A787TBW03_UPD_CNT = P002Q6_A787TBW03_UPD_CNT[0] ;
         n787TBW03_UPD_CNT = P002Q6_n787TBW03_UPD_CNT[0] ;
         A786TBW03_UPD_PROG_NM = P002Q6_A786TBW03_UPD_PROG_NM[0] ;
         n786TBW03_UPD_PROG_NM = P002Q6_n786TBW03_UPD_PROG_NM[0] ;
         A785TBW03_UPD_USER_NM = P002Q6_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = P002Q6_n785TBW03_UPD_USER_NM[0] ;
         A122TBW03_UPD_USER_ID = P002Q6_A122TBW03_UPD_USER_ID[0] ;
         n122TBW03_UPD_USER_ID = P002Q6_n122TBW03_UPD_USER_ID[0] ;
         A784TBW03_UPD_DATETIME = P002Q6_A784TBW03_UPD_DATETIME[0] ;
         n784TBW03_UPD_DATETIME = P002Q6_n784TBW03_UPD_DATETIME[0] ;
         A783TBW03_CRT_PROG_NM = P002Q6_A783TBW03_CRT_PROG_NM[0] ;
         n783TBW03_CRT_PROG_NM = P002Q6_n783TBW03_CRT_PROG_NM[0] ;
         A782TBW03_CRT_USER_NM = P002Q6_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = P002Q6_n782TBW03_CRT_USER_NM[0] ;
         A121TBW03_CRT_USER_ID = P002Q6_A121TBW03_CRT_USER_ID[0] ;
         n121TBW03_CRT_USER_ID = P002Q6_n121TBW03_CRT_USER_ID[0] ;
         A781TBW03_CRT_DATETIME = P002Q6_A781TBW03_CRT_DATETIME[0] ;
         n781TBW03_CRT_DATETIME = P002Q6_n781TBW03_CRT_DATETIME[0] ;
         A780TBW03_DEL_FLG = P002Q6_A780TBW03_DEL_FLG[0] ;
         n780TBW03_DEL_FLG = P002Q6_n780TBW03_DEL_FLG[0] ;
         A734TBW03_INPUT_END_AUTH_CD = P002Q6_A734TBW03_INPUT_END_AUTH_CD[0] ;
         n734TBW03_INPUT_END_AUTH_CD = P002Q6_n734TBW03_INPUT_END_AUTH_CD[0] ;
         A733TBW03_INPUT_END_USER_NM = P002Q6_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = P002Q6_n733TBW03_INPUT_END_USER_NM[0] ;
         A119TBW03_INPUT_END_USER_ID = P002Q6_A119TBW03_INPUT_END_USER_ID[0] ;
         n119TBW03_INPUT_END_USER_ID = P002Q6_n119TBW03_INPUT_END_USER_ID[0] ;
         A732TBW03_INPUT_END_DATETIME = P002Q6_A732TBW03_INPUT_END_DATETIME[0] ;
         n732TBW03_INPUT_END_DATETIME = P002Q6_n732TBW03_INPUT_END_DATETIME[0] ;
         A730TBW03_APPROVAL_AUTH_CD = P002Q6_A730TBW03_APPROVAL_AUTH_CD[0] ;
         n730TBW03_APPROVAL_AUTH_CD = P002Q6_n730TBW03_APPROVAL_AUTH_CD[0] ;
         A729TBW03_APPROVAL_USER_NM = P002Q6_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = P002Q6_n729TBW03_APPROVAL_USER_NM[0] ;
         A118TBW03_APPROVAL_USER_ID = P002Q6_A118TBW03_APPROVAL_USER_ID[0] ;
         n118TBW03_APPROVAL_USER_ID = P002Q6_n118TBW03_APPROVAL_USER_ID[0] ;
         A728TBW03_APPROVAL_DATETIME = P002Q6_A728TBW03_APPROVAL_DATETIME[0] ;
         n728TBW03_APPROVAL_DATETIME = P002Q6_n728TBW03_APPROVAL_DATETIME[0] ;
         A727TBW03_APPROVAL_FLG = P002Q6_A727TBW03_APPROVAL_FLG[0] ;
         n727TBW03_APPROVAL_FLG = P002Q6_n727TBW03_APPROVAL_FLG[0] ;
         A726TBW03_DM_ARRIVAL_DATETIME = P002Q6_A726TBW03_DM_ARRIVAL_DATETIME[0] ;
         n726TBW03_DM_ARRIVAL_DATETIME = P002Q6_n726TBW03_DM_ARRIVAL_DATETIME[0] ;
         A724TBW03_UPLOAD_AUTH_CD = P002Q6_A724TBW03_UPLOAD_AUTH_CD[0] ;
         n724TBW03_UPLOAD_AUTH_CD = P002Q6_n724TBW03_UPLOAD_AUTH_CD[0] ;
         A723TBW03_UPLOAD_USER_NM = P002Q6_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = P002Q6_n723TBW03_UPLOAD_USER_NM[0] ;
         A117TBW03_UPLOAD_USER_ID = P002Q6_A117TBW03_UPLOAD_USER_ID[0] ;
         n117TBW03_UPLOAD_USER_ID = P002Q6_n117TBW03_UPLOAD_USER_ID[0] ;
         A722TBW03_UPLOAD_DATETIME = P002Q6_A722TBW03_UPLOAD_DATETIME[0] ;
         n722TBW03_UPLOAD_DATETIME = P002Q6_n722TBW03_UPLOAD_DATETIME[0] ;
         A721TBW03_LOCK_AUTH_CD = P002Q6_A721TBW03_LOCK_AUTH_CD[0] ;
         n721TBW03_LOCK_AUTH_CD = P002Q6_n721TBW03_LOCK_AUTH_CD[0] ;
         A720TBW03_LOCK_USER_NM = P002Q6_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = P002Q6_n720TBW03_LOCK_USER_NM[0] ;
         A116TBW03_LOCK_USER_ID = P002Q6_A116TBW03_LOCK_USER_ID[0] ;
         n116TBW03_LOCK_USER_ID = P002Q6_n116TBW03_LOCK_USER_ID[0] ;
         A719TBW03_LOCK_DATETIME = P002Q6_A719TBW03_LOCK_DATETIME[0] ;
         n719TBW03_LOCK_DATETIME = P002Q6_n719TBW03_LOCK_DATETIME[0] ;
         A718TBW03_LOCK_FLG = P002Q6_A718TBW03_LOCK_FLG[0] ;
         n718TBW03_LOCK_FLG = P002Q6_n718TBW03_LOCK_FLG[0] ;
         A716TBW03_CRF_LATEST_VERSION = P002Q6_A716TBW03_CRF_LATEST_VERSION[0] ;
         n716TBW03_CRF_LATEST_VERSION = P002Q6_n716TBW03_CRF_LATEST_VERSION[0] ;
         A715TBW03_OUTER_SUBJECT_ID = P002Q6_A715TBW03_OUTER_SUBJECT_ID[0] ;
         n715TBW03_OUTER_SUBJECT_ID = P002Q6_n715TBW03_OUTER_SUBJECT_ID[0] ;
         A714TBW03_SITE_RYAK_NM = P002Q6_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = P002Q6_n714TBW03_SITE_RYAK_NM[0] ;
         A713TBW03_SITE_NM = P002Q6_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = P002Q6_n713TBW03_SITE_NM[0] ;
         A120TBW03_SITE_ID = P002Q6_A120TBW03_SITE_ID[0] ;
         n120TBW03_SITE_ID = P002Q6_n120TBW03_SITE_ID[0] ;
         A711TBW03_CRF_SNM = P002Q6_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = P002Q6_n711TBW03_CRF_SNM[0] ;
         A710TBW03_CRF_NM = P002Q6_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = P002Q6_n710TBW03_CRF_NM[0] ;
         A115TBW03_CRF_ID = P002Q6_A115TBW03_CRF_ID[0] ;
         A113TBW03_STUDY_ID = P002Q6_A113TBW03_STUDY_ID[0] ;
         A712TBW03_CRF_ORDER = P002Q6_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = P002Q6_n712TBW03_CRF_ORDER[0] ;
         A114TBW03_SUBJECT_ID = P002Q6_A114TBW03_SUBJECT_ID[0] ;
         A731TBW03_INPUT_END_FLG = P002Q6_A731TBW03_INPUT_END_FLG[0] ;
         n731TBW03_INPUT_END_FLG = P002Q6_n731TBW03_INPUT_END_FLG[0] ;
         A725TBW03_DM_ARRIVAL_FLG = P002Q6_A725TBW03_DM_ARRIVAL_FLG[0] ;
         n725TBW03_DM_ARRIVAL_FLG = P002Q6_n725TBW03_DM_ARRIVAL_FLG[0] ;
         A717TBW03_CRF_INPUT_LEVEL = P002Q6_A717TBW03_CRF_INPUT_LEVEL[0] ;
         n717TBW03_CRF_INPUT_LEVEL = P002Q6_n717TBW03_CRF_INPUT_LEVEL[0] ;
         A785TBW03_UPD_USER_NM = P002Q6_A785TBW03_UPD_USER_NM[0] ;
         n785TBW03_UPD_USER_NM = P002Q6_n785TBW03_UPD_USER_NM[0] ;
         A782TBW03_CRT_USER_NM = P002Q6_A782TBW03_CRT_USER_NM[0] ;
         n782TBW03_CRT_USER_NM = P002Q6_n782TBW03_CRT_USER_NM[0] ;
         A733TBW03_INPUT_END_USER_NM = P002Q6_A733TBW03_INPUT_END_USER_NM[0] ;
         n733TBW03_INPUT_END_USER_NM = P002Q6_n733TBW03_INPUT_END_USER_NM[0] ;
         A729TBW03_APPROVAL_USER_NM = P002Q6_A729TBW03_APPROVAL_USER_NM[0] ;
         n729TBW03_APPROVAL_USER_NM = P002Q6_n729TBW03_APPROVAL_USER_NM[0] ;
         A723TBW03_UPLOAD_USER_NM = P002Q6_A723TBW03_UPLOAD_USER_NM[0] ;
         n723TBW03_UPLOAD_USER_NM = P002Q6_n723TBW03_UPLOAD_USER_NM[0] ;
         A720TBW03_LOCK_USER_NM = P002Q6_A720TBW03_LOCK_USER_NM[0] ;
         n720TBW03_LOCK_USER_NM = P002Q6_n720TBW03_LOCK_USER_NM[0] ;
         A714TBW03_SITE_RYAK_NM = P002Q6_A714TBW03_SITE_RYAK_NM[0] ;
         n714TBW03_SITE_RYAK_NM = P002Q6_n714TBW03_SITE_RYAK_NM[0] ;
         A713TBW03_SITE_NM = P002Q6_A713TBW03_SITE_NM[0] ;
         n713TBW03_SITE_NM = P002Q6_n713TBW03_SITE_NM[0] ;
         A711TBW03_CRF_SNM = P002Q6_A711TBW03_CRF_SNM[0] ;
         n711TBW03_CRF_SNM = P002Q6_n711TBW03_CRF_SNM[0] ;
         A710TBW03_CRF_NM = P002Q6_A710TBW03_CRF_NM[0] ;
         n710TBW03_CRF_NM = P002Q6_n710TBW03_CRF_NM[0] ;
         A712TBW03_CRF_ORDER = P002Q6_A712TBW03_CRF_ORDER[0] ;
         n712TBW03_CRF_ORDER = P002Q6_n712TBW03_CRF_ORDER[0] ;
         AV46GXLvl254 = (byte)(1) ;
         GXt_char1 = AV36W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A710TBW03_CRF_NM, GXv_char2) ;
         b599_pc27_search_crf_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV36W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A711TBW03_CRF_SNM, GXv_char4) ;
         b599_pc27_search_crf_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV36W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A120TBW03_SITE_ID, GXv_char6) ;
         b599_pc27_search_crf_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV36W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A713TBW03_SITE_NM, GXv_char8) ;
         b599_pc27_search_crf_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV36W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A714TBW03_SITE_RYAK_NM, GXv_char10) ;
         b599_pc27_search_crf_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV36W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A715TBW03_OUTER_SUBJECT_ID, GXv_char12) ;
         b599_pc27_search_crf_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV36W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A718TBW03_LOCK_FLG, GXv_char14) ;
         b599_pc27_search_crf_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV36W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A719TBW03_LOCK_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char16) ;
         b599_pc27_search_crf_res.this.GXt_char15 = GXv_char16[0] ;
         GXt_char17 = AV36W_STR ;
         GXv_char18[0] = GXt_char17 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A116TBW03_LOCK_USER_ID, GXv_char18) ;
         b599_pc27_search_crf_res.this.GXt_char17 = GXv_char18[0] ;
         GXt_char19 = AV36W_STR ;
         GXv_char20[0] = GXt_char19 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A720TBW03_LOCK_USER_NM, GXv_char20) ;
         b599_pc27_search_crf_res.this.GXt_char19 = GXv_char20[0] ;
         GXt_char21 = AV36W_STR ;
         GXv_char22[0] = GXt_char21 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A721TBW03_LOCK_AUTH_CD, GXv_char22) ;
         b599_pc27_search_crf_res.this.GXt_char21 = GXv_char22[0] ;
         GXt_char23 = AV36W_STR ;
         GXv_char24[0] = GXt_char23 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A722TBW03_UPLOAD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char24) ;
         b599_pc27_search_crf_res.this.GXt_char23 = GXv_char24[0] ;
         GXt_char25 = AV36W_STR ;
         GXv_char26[0] = GXt_char25 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A117TBW03_UPLOAD_USER_ID, GXv_char26) ;
         b599_pc27_search_crf_res.this.GXt_char25 = GXv_char26[0] ;
         GXt_char27 = AV36W_STR ;
         GXv_char28[0] = GXt_char27 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A723TBW03_UPLOAD_USER_NM, GXv_char28) ;
         b599_pc27_search_crf_res.this.GXt_char27 = GXv_char28[0] ;
         GXt_char29 = AV36W_STR ;
         GXv_char30[0] = GXt_char29 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A724TBW03_UPLOAD_AUTH_CD, GXv_char30) ;
         b599_pc27_search_crf_res.this.GXt_char29 = GXv_char30[0] ;
         GXt_char31 = AV36W_STR ;
         GXv_char32[0] = GXt_char31 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A725TBW03_DM_ARRIVAL_FLG, GXv_char32) ;
         b599_pc27_search_crf_res.this.GXt_char31 = GXv_char32[0] ;
         GXt_char33 = AV36W_STR ;
         GXv_char34[0] = GXt_char33 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A726TBW03_DM_ARRIVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char34) ;
         b599_pc27_search_crf_res.this.GXt_char33 = GXv_char34[0] ;
         GXt_char35 = AV36W_STR ;
         GXv_char36[0] = GXt_char35 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A727TBW03_APPROVAL_FLG, GXv_char36) ;
         b599_pc27_search_crf_res.this.GXt_char35 = GXv_char36[0] ;
         GXt_char37 = AV36W_STR ;
         GXv_char38[0] = GXt_char37 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A728TBW03_APPROVAL_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char38) ;
         b599_pc27_search_crf_res.this.GXt_char37 = GXv_char38[0] ;
         GXt_char39 = AV36W_STR ;
         GXv_char40[0] = GXt_char39 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A118TBW03_APPROVAL_USER_ID, GXv_char40) ;
         b599_pc27_search_crf_res.this.GXt_char39 = GXv_char40[0] ;
         GXt_char41 = AV36W_STR ;
         GXv_char42[0] = GXt_char41 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A729TBW03_APPROVAL_USER_NM, GXv_char42) ;
         b599_pc27_search_crf_res.this.GXt_char41 = GXv_char42[0] ;
         GXt_char43 = AV36W_STR ;
         GXv_char44[0] = GXt_char43 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A730TBW03_APPROVAL_AUTH_CD, GXv_char44) ;
         b599_pc27_search_crf_res.this.GXt_char43 = GXv_char44[0] ;
         GXt_char45 = AV36W_STR ;
         GXv_char46[0] = GXt_char45 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A731TBW03_INPUT_END_FLG, GXv_char46) ;
         b599_pc27_search_crf_res.this.GXt_char45 = GXv_char46[0] ;
         GXt_char47 = AV36W_STR ;
         GXv_char48[0] = GXt_char47 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A732TBW03_INPUT_END_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char48) ;
         b599_pc27_search_crf_res.this.GXt_char47 = GXv_char48[0] ;
         GXt_char49 = AV36W_STR ;
         GXv_char50[0] = GXt_char49 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A119TBW03_INPUT_END_USER_ID, GXv_char50) ;
         b599_pc27_search_crf_res.this.GXt_char49 = GXv_char50[0] ;
         GXt_char51 = AV36W_STR ;
         GXv_char52[0] = GXt_char51 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A733TBW03_INPUT_END_USER_NM, GXv_char52) ;
         b599_pc27_search_crf_res.this.GXt_char51 = GXv_char52[0] ;
         GXt_char53 = AV36W_STR ;
         GXv_char54[0] = GXt_char53 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A734TBW03_INPUT_END_AUTH_CD, GXv_char54) ;
         b599_pc27_search_crf_res.this.GXt_char53 = GXv_char54[0] ;
         GXt_char55 = AV36W_STR ;
         GXv_char56[0] = GXt_char55 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A780TBW03_DEL_FLG, GXv_char56) ;
         b599_pc27_search_crf_res.this.GXt_char55 = GXv_char56[0] ;
         GXt_char57 = AV36W_STR ;
         GXv_char58[0] = GXt_char57 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A781TBW03_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char58) ;
         b599_pc27_search_crf_res.this.GXt_char57 = GXv_char58[0] ;
         GXt_char59 = AV36W_STR ;
         GXv_char60[0] = GXt_char59 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A121TBW03_CRT_USER_ID, GXv_char60) ;
         b599_pc27_search_crf_res.this.GXt_char59 = GXv_char60[0] ;
         GXt_char61 = AV36W_STR ;
         GXv_char62[0] = GXt_char61 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A782TBW03_CRT_USER_NM, GXv_char62) ;
         b599_pc27_search_crf_res.this.GXt_char61 = GXv_char62[0] ;
         GXt_char63 = AV36W_STR ;
         GXv_char64[0] = GXt_char63 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A783TBW03_CRT_PROG_NM, GXv_char64) ;
         b599_pc27_search_crf_res.this.GXt_char63 = GXv_char64[0] ;
         GXt_char65 = AV36W_STR ;
         GXv_char66[0] = GXt_char65 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A784TBW03_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char66) ;
         b599_pc27_search_crf_res.this.GXt_char65 = GXv_char66[0] ;
         GXt_char67 = AV36W_STR ;
         GXv_char68[0] = GXt_char67 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A122TBW03_UPD_USER_ID, GXv_char68) ;
         b599_pc27_search_crf_res.this.GXt_char67 = GXv_char68[0] ;
         GXt_char69 = AV36W_STR ;
         GXv_char70[0] = GXt_char69 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A785TBW03_UPD_USER_NM, GXv_char70) ;
         b599_pc27_search_crf_res.this.GXt_char69 = GXv_char70[0] ;
         GXt_char71 = AV36W_STR ;
         GXv_char72[0] = GXt_char71 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A786TBW03_UPD_PROG_NM, GXv_char72) ;
         b599_pc27_search_crf_res.this.GXt_char71 = GXv_char72[0] ;
         AV36W_STR = GXutil.trim( GXutil.str( A113TBW03_STUDY_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A114TBW03_SUBJECT_ID, 10, 0)) + "," + GXutil.trim( GXutil.str( A115TBW03_CRF_ID, 10, 0)) + "," + GXt_char1 + "," + GXt_char3 + "," + GXutil.trim( GXutil.str( A712TBW03_CRF_ORDER, 10, 0)) + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXutil.trim( GXutil.str( A716TBW03_CRF_LATEST_VERSION, 10, 0)) + "," + GXutil.trim( GXutil.str( A717TBW03_CRF_INPUT_LEVEL, 10, 0)) + "," + GXt_char13 + "," + GXt_char15 + "," + GXt_char17 + "," + GXt_char19 + "," + GXt_char21 + "," + GXt_char23 + "," + GXt_char25 + "," + GXt_char27 + "," + GXt_char29 + "," + GXt_char31 + "," + GXt_char33 + "," + GXt_char35 + "," + GXt_char37 + "," + GXt_char39 + "," + GXt_char41 + "," + GXt_char43 + "," + GXt_char45 + "," + GXt_char47 + "," + GXt_char49 + "," + GXt_char51 + "," + GXt_char53 + "," + GXt_char55 + "," + GXt_char57 + "," + GXt_char59 + "," + GXt_char61 + "," + GXt_char63 + "," + GXt_char65 + "," + GXt_char67 + "," + GXt_char69 + "," + GXt_char71 + "," + GXutil.trim( GXutil.str( A787TBW03_UPD_CNT, 10, 0)) ;
         AV32W_RTN_CSV.add(AV36W_STR, 0);
         if ( AV31W_RTN_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV46GXLvl254 == 0 )
      {
         AV31W_RTN_CD = (short)(1) ;
         GXt_char71 = AV33W_RTN_MSG ;
         GXv_char72[0] = GXt_char71 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char72) ;
         b599_pc27_search_crf_res.this.GXt_char71 = GXv_char72[0] ;
         AV33W_RTN_MSG = GXt_char71 ;
      }
   }

   public void S141( )
   {
      /* 'SUB_DELETE_WORK' Routine */
      /* Optimized DELETE. */
      Gx_ope = "Delete" ;
      Gx_etb = "TBW03_CRF_SEARCH" ;
      /* Using cursor P002Q7 */
      pr_default.execute(5, new Object[] {AV34W_SESSION.getId(), AV9C_TAM02_APP_ID, AV24W_DISP_DATETIME});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW03_CRF_SEARCH") ;
      /* End optimized DELETE. */
   }

   public void S151( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_USER_ID" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV17P_USER_ID );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_STUDY_ID );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_AUTH_CD" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_AUTH_CD );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SITE" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_SITE );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_SUBJECT );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_QUICK_SEARCH" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_QUICK_SEARCH );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SORT" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_SORT );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV27W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO73[0] = AV26W_EXTRA_INFO;
      GXv_int74[0] = AV31W_RTN_CD ;
      GXv_char72[0] = AV33W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV48Pgmname, (short)(1), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO73, GXv_int74, GXv_char72) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO73[0] ;
      b599_pc27_search_crf_res.this.AV31W_RTN_CD = GXv_int74[0] ;
      b599_pc27_search_crf_res.this.AV33W_RTN_MSG = GXv_char72[0] ;
   }

   public void S161( )
   {
      /* 'SUB_ERROR' Routine */
      AV27W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO73[0] = AV26W_EXTRA_INFO;
      GXv_int74[0] = AV31W_RTN_CD ;
      GXv_char72[0] = AV33W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV48Pgmname, (short)(0), AV27W_MSG, GXv_SdtB808_SD01_EXTRA_INFO73, GXv_int74, GXv_char72) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO73[0] ;
      b599_pc27_search_crf_res.this.AV31W_RTN_CD = GXv_int74[0] ;
      b599_pc27_search_crf_res.this.AV33W_RTN_MSG = GXv_char72[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP8[0] = b599_pc27_search_crf_res.this.AV32W_RTN_CSV;
      this.aP9[0] = b599_pc27_search_crf_res.this.AV31W_RTN_CD;
      this.aP10[0] = b599_pc27_search_crf_res.this.AV33W_RTN_MSG;
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
      AV33W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV26W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24W_DISP_DATETIME = "" ;
      A623TBM07_CRF_INP_AUTH_FLG = "" ;
      A624TBM07_CRF_EDIT_AUTH_FLG = "" ;
      A333TAM07_SITE_ID = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P002Q2_A215TAM04_DEL_FLG = new String[] {""} ;
      P002Q2_n215TAM04_DEL_FLG = new boolean[] {false} ;
      P002Q2_A626TBM07_DEL_FLG = new String[] {""} ;
      P002Q2_n626TBM07_DEL_FLG = new boolean[] {false} ;
      P002Q2_A50TBM07_AUTH_CD = new String[] {""} ;
      P002Q2_A687TAM04_AUTH_LVL = new byte[1] ;
      P002Q2_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      P002Q2_A623TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      P002Q2_n623TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      P002Q2_A624TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      P002Q2_n624TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      A215TAM04_DEL_FLG = "" ;
      A626TBM07_DEL_FLG = "" ;
      A50TBM07_AUTH_CD = "" ;
      AV39W_CRF_INP_AUTH_FLG = "" ;
      AV40W_CRF_EDIT_AUTH_FLG = "" ;
      AV38W_SITE_ID = "" ;
      P002Q3_A214TAM07_DEL_FLG = new String[] {""} ;
      P002Q3_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P002Q3_A55TAM07_USER_ID = new String[] {""} ;
      P002Q3_A333TAM07_SITE_ID = new String[] {""} ;
      P002Q3_n333TAM07_SITE_ID = new boolean[] {false} ;
      A214TAM07_DEL_FLG = "" ;
      A55TAM07_USER_ID = "" ;
      AV18W_AUTH_CD = new GxObjectCollection(String.class, "internal", "");
      A116TBW03_LOCK_USER_ID = "" ;
      A117TBW03_UPLOAD_USER_ID = "" ;
      A118TBW03_APPROVAL_USER_ID = "" ;
      A119TBW03_INPUT_END_USER_ID = "" ;
      A121TBW03_CRT_USER_ID = "" ;
      A122TBW03_UPD_USER_ID = "" ;
      AV29W_OUTER_SUBJECT_ID_C = new GxObjectCollection(String.class, "internal", "");
      AV35W_SITE_ID_C = new GxObjectCollection(String.class, "internal", "");
      AV23W_CSV_C = new GxObjectCollection(String.class, "internal", "");
      AV22W_CRF_ID_C = new GxObjectCollection(Short.class, "internal", "");
      A647TBT01_OUTER_SUBJECT_ID = "" ;
      A698TBT01_SITE_ID = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A657TBT02_APPROVAL_FLG = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      P002Q4_A89TBT02_STUDY_ID = new long[1] ;
      P002Q4_A90TBT02_SUBJECT_ID = new int[1] ;
      P002Q4_A91TBT02_CRF_ID = new short[1] ;
      P002Q4_A698TBT01_SITE_ID = new String[] {""} ;
      P002Q4_n698TBT01_SITE_ID = new boolean[] {false} ;
      P002Q4_A647TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      P002Q4_n647TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      P002Q4_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      P002Q4_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      P002Q4_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      P002Q4_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      P002Q4_A648TBT02_LOCK_FLG = new String[] {""} ;
      P002Q4_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      P002Q4_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      P002Q4_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      P002Q4_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      P002Q4_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      P002Q4_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      P002Q4_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      P002Q4_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      P002Q4_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      P002Q4_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      P002Q4_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P002Q4_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P002Q4_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P002Q4_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P002Q4_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      P002Q4_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      P002Q4_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      P002Q4_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      P002Q4_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      P002Q4_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      P002Q4_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P002Q4_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P002Q4_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P002Q4_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      P002Q4_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      P002Q4_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      P002Q4_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      P002Q4_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P002Q4_A449TBT02_DEL_FLG = new String[] {""} ;
      P002Q4_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P002Q4_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      P002Q4_A451TBT02_CRT_USER_ID = new String[] {""} ;
      P002Q4_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      P002Q4_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      P002Q4_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      P002Q4_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q4_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      P002Q4_A454TBT02_UPD_USER_ID = new String[] {""} ;
      P002Q4_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      P002Q4_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      P002Q4_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      P002Q4_A456TBT02_UPD_CNT = new long[1] ;
      P002Q4_n456TBT02_UPD_CNT = new boolean[] {false} ;
      P002Q4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      A648TBT02_LOCK_FLG = "" ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A650TBT02_LOCK_USER_ID = "" ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A653TBT02_UPLOAD_USER_ID = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A659TBT02_APPROVAL_USER_ID = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A663TBT02_INPUT_END_USER_ID = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      A449TBT02_DEL_FLG = "" ;
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A451TBT02_CRT_USER_ID = "" ;
      A452TBT02_CRT_PROG_NM = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A454TBT02_UPD_USER_ID = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      A110TBW03_SESSION_ID = "" ;
      AV34W_SESSION = httpContext.getWebSession();
      A111TBW03_APP_ID = "" ;
      AV9C_TAM02_APP_ID = "" ;
      A112TBW03_DISP_DATETIME = "" ;
      A120TBW03_SITE_ID = "" ;
      A715TBW03_OUTER_SUBJECT_ID = "" ;
      A718TBW03_LOCK_FLG = "" ;
      A719TBW03_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A721TBW03_LOCK_AUTH_CD = "" ;
      A722TBW03_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A724TBW03_UPLOAD_AUTH_CD = "" ;
      A725TBW03_DM_ARRIVAL_FLG = "" ;
      A726TBW03_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A727TBW03_APPROVAL_FLG = "" ;
      A728TBW03_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A730TBW03_APPROVAL_AUTH_CD = "" ;
      A731TBW03_INPUT_END_FLG = "" ;
      A732TBW03_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A734TBW03_INPUT_END_AUTH_CD = "" ;
      A780TBW03_DEL_FLG = "" ;
      A781TBW03_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A783TBW03_CRT_PROG_NM = "" ;
      A784TBW03_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A786TBW03_UPD_PROG_NM = "" ;
      Gx_emsg = "" ;
      A710TBW03_CRF_NM = "" ;
      A711TBW03_CRF_SNM = "" ;
      A713TBW03_SITE_NM = "" ;
      A714TBW03_SITE_RYAK_NM = "" ;
      A720TBW03_LOCK_USER_NM = "" ;
      A723TBW03_UPLOAD_USER_NM = "" ;
      A729TBW03_APPROVAL_USER_NM = "" ;
      A733TBW03_INPUT_END_USER_NM = "" ;
      A782TBW03_CRT_USER_NM = "" ;
      A785TBW03_UPD_USER_NM = "" ;
      P002Q6_A112TBW03_DISP_DATETIME = new String[] {""} ;
      P002Q6_A111TBW03_APP_ID = new String[] {""} ;
      P002Q6_A110TBW03_SESSION_ID = new String[] {""} ;
      P002Q6_A787TBW03_UPD_CNT = new long[1] ;
      P002Q6_n787TBW03_UPD_CNT = new boolean[] {false} ;
      P002Q6_A786TBW03_UPD_PROG_NM = new String[] {""} ;
      P002Q6_n786TBW03_UPD_PROG_NM = new boolean[] {false} ;
      P002Q6_A785TBW03_UPD_USER_NM = new String[] {""} ;
      P002Q6_n785TBW03_UPD_USER_NM = new boolean[] {false} ;
      P002Q6_A122TBW03_UPD_USER_ID = new String[] {""} ;
      P002Q6_n122TBW03_UPD_USER_ID = new boolean[] {false} ;
      P002Q6_A784TBW03_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n784TBW03_UPD_DATETIME = new boolean[] {false} ;
      P002Q6_A783TBW03_CRT_PROG_NM = new String[] {""} ;
      P002Q6_n783TBW03_CRT_PROG_NM = new boolean[] {false} ;
      P002Q6_A782TBW03_CRT_USER_NM = new String[] {""} ;
      P002Q6_n782TBW03_CRT_USER_NM = new boolean[] {false} ;
      P002Q6_A121TBW03_CRT_USER_ID = new String[] {""} ;
      P002Q6_n121TBW03_CRT_USER_ID = new boolean[] {false} ;
      P002Q6_A781TBW03_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n781TBW03_CRT_DATETIME = new boolean[] {false} ;
      P002Q6_A780TBW03_DEL_FLG = new String[] {""} ;
      P002Q6_n780TBW03_DEL_FLG = new boolean[] {false} ;
      P002Q6_A734TBW03_INPUT_END_AUTH_CD = new String[] {""} ;
      P002Q6_n734TBW03_INPUT_END_AUTH_CD = new boolean[] {false} ;
      P002Q6_A733TBW03_INPUT_END_USER_NM = new String[] {""} ;
      P002Q6_n733TBW03_INPUT_END_USER_NM = new boolean[] {false} ;
      P002Q6_A119TBW03_INPUT_END_USER_ID = new String[] {""} ;
      P002Q6_n119TBW03_INPUT_END_USER_ID = new boolean[] {false} ;
      P002Q6_A732TBW03_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n732TBW03_INPUT_END_DATETIME = new boolean[] {false} ;
      P002Q6_A730TBW03_APPROVAL_AUTH_CD = new String[] {""} ;
      P002Q6_n730TBW03_APPROVAL_AUTH_CD = new boolean[] {false} ;
      P002Q6_A729TBW03_APPROVAL_USER_NM = new String[] {""} ;
      P002Q6_n729TBW03_APPROVAL_USER_NM = new boolean[] {false} ;
      P002Q6_A118TBW03_APPROVAL_USER_ID = new String[] {""} ;
      P002Q6_n118TBW03_APPROVAL_USER_ID = new boolean[] {false} ;
      P002Q6_A728TBW03_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n728TBW03_APPROVAL_DATETIME = new boolean[] {false} ;
      P002Q6_A727TBW03_APPROVAL_FLG = new String[] {""} ;
      P002Q6_n727TBW03_APPROVAL_FLG = new boolean[] {false} ;
      P002Q6_A726TBW03_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n726TBW03_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P002Q6_A724TBW03_UPLOAD_AUTH_CD = new String[] {""} ;
      P002Q6_n724TBW03_UPLOAD_AUTH_CD = new boolean[] {false} ;
      P002Q6_A723TBW03_UPLOAD_USER_NM = new String[] {""} ;
      P002Q6_n723TBW03_UPLOAD_USER_NM = new boolean[] {false} ;
      P002Q6_A117TBW03_UPLOAD_USER_ID = new String[] {""} ;
      P002Q6_n117TBW03_UPLOAD_USER_ID = new boolean[] {false} ;
      P002Q6_A722TBW03_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n722TBW03_UPLOAD_DATETIME = new boolean[] {false} ;
      P002Q6_A721TBW03_LOCK_AUTH_CD = new String[] {""} ;
      P002Q6_n721TBW03_LOCK_AUTH_CD = new boolean[] {false} ;
      P002Q6_A720TBW03_LOCK_USER_NM = new String[] {""} ;
      P002Q6_n720TBW03_LOCK_USER_NM = new boolean[] {false} ;
      P002Q6_A116TBW03_LOCK_USER_ID = new String[] {""} ;
      P002Q6_n116TBW03_LOCK_USER_ID = new boolean[] {false} ;
      P002Q6_A719TBW03_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P002Q6_n719TBW03_LOCK_DATETIME = new boolean[] {false} ;
      P002Q6_A718TBW03_LOCK_FLG = new String[] {""} ;
      P002Q6_n718TBW03_LOCK_FLG = new boolean[] {false} ;
      P002Q6_A716TBW03_CRF_LATEST_VERSION = new short[1] ;
      P002Q6_n716TBW03_CRF_LATEST_VERSION = new boolean[] {false} ;
      P002Q6_A715TBW03_OUTER_SUBJECT_ID = new String[] {""} ;
      P002Q6_n715TBW03_OUTER_SUBJECT_ID = new boolean[] {false} ;
      P002Q6_A714TBW03_SITE_RYAK_NM = new String[] {""} ;
      P002Q6_n714TBW03_SITE_RYAK_NM = new boolean[] {false} ;
      P002Q6_A713TBW03_SITE_NM = new String[] {""} ;
      P002Q6_n713TBW03_SITE_NM = new boolean[] {false} ;
      P002Q6_A120TBW03_SITE_ID = new String[] {""} ;
      P002Q6_n120TBW03_SITE_ID = new boolean[] {false} ;
      P002Q6_A711TBW03_CRF_SNM = new String[] {""} ;
      P002Q6_n711TBW03_CRF_SNM = new boolean[] {false} ;
      P002Q6_A710TBW03_CRF_NM = new String[] {""} ;
      P002Q6_n710TBW03_CRF_NM = new boolean[] {false} ;
      P002Q6_A115TBW03_CRF_ID = new short[1] ;
      P002Q6_A113TBW03_STUDY_ID = new long[1] ;
      P002Q6_A712TBW03_CRF_ORDER = new int[1] ;
      P002Q6_n712TBW03_CRF_ORDER = new boolean[] {false} ;
      P002Q6_A114TBW03_SUBJECT_ID = new int[1] ;
      P002Q6_A731TBW03_INPUT_END_FLG = new String[] {""} ;
      P002Q6_n731TBW03_INPUT_END_FLG = new boolean[] {false} ;
      P002Q6_A725TBW03_DM_ARRIVAL_FLG = new String[] {""} ;
      P002Q6_n725TBW03_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P002Q6_A717TBW03_CRF_INPUT_LEVEL = new byte[1] ;
      P002Q6_n717TBW03_CRF_INPUT_LEVEL = new boolean[] {false} ;
      AV36W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String [1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String [1] ;
      GXt_char9 = "" ;
      GXv_char10 = new String [1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String [1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String [1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String [1] ;
      GXt_char17 = "" ;
      GXv_char18 = new String [1] ;
      GXt_char19 = "" ;
      GXv_char20 = new String [1] ;
      GXt_char21 = "" ;
      GXv_char22 = new String [1] ;
      GXt_char23 = "" ;
      GXv_char24 = new String [1] ;
      GXt_char25 = "" ;
      GXv_char26 = new String [1] ;
      GXt_char27 = "" ;
      GXv_char28 = new String [1] ;
      GXt_char29 = "" ;
      GXv_char30 = new String [1] ;
      GXt_char31 = "" ;
      GXv_char32 = new String [1] ;
      GXt_char33 = "" ;
      GXv_char34 = new String [1] ;
      GXt_char35 = "" ;
      GXv_char36 = new String [1] ;
      GXt_char37 = "" ;
      GXv_char38 = new String [1] ;
      GXt_char39 = "" ;
      GXv_char40 = new String [1] ;
      GXt_char41 = "" ;
      GXv_char42 = new String [1] ;
      GXt_char43 = "" ;
      GXv_char44 = new String [1] ;
      GXt_char45 = "" ;
      GXv_char46 = new String [1] ;
      GXt_char47 = "" ;
      GXv_char48 = new String [1] ;
      GXt_char49 = "" ;
      GXv_char50 = new String [1] ;
      GXt_char51 = "" ;
      GXv_char52 = new String [1] ;
      GXt_char53 = "" ;
      GXv_char54 = new String [1] ;
      GXt_char55 = "" ;
      GXv_char56 = new String [1] ;
      GXt_char57 = "" ;
      GXv_char58 = new String [1] ;
      GXt_char59 = "" ;
      GXv_char60 = new String [1] ;
      GXt_char61 = "" ;
      GXv_char62 = new String [1] ;
      GXt_char63 = "" ;
      GXv_char64 = new String [1] ;
      GXt_char65 = "" ;
      GXv_char66 = new String [1] ;
      GXt_char67 = "" ;
      GXv_char68 = new String [1] ;
      GXt_char69 = "" ;
      GXv_char70 = new String [1] ;
      GXt_char71 = "" ;
      AV30W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_MSG = "" ;
      AV48Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO73 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int74 = new short [1] ;
      GXv_char72 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc27_search_crf_res__default(),
         new Object[] {
             new Object[] {
            P002Q2_A215TAM04_DEL_FLG, P002Q2_n215TAM04_DEL_FLG, P002Q2_A626TBM07_DEL_FLG, P002Q2_n626TBM07_DEL_FLG, P002Q2_A50TBM07_AUTH_CD, P002Q2_A687TAM04_AUTH_LVL, P002Q2_n687TAM04_AUTH_LVL, P002Q2_A623TBM07_CRF_INP_AUTH_FLG, P002Q2_n623TBM07_CRF_INP_AUTH_FLG, P002Q2_A624TBM07_CRF_EDIT_AUTH_FLG,
            P002Q2_n624TBM07_CRF_EDIT_AUTH_FLG
            }
            , new Object[] {
            P002Q3_A214TAM07_DEL_FLG, P002Q3_n214TAM07_DEL_FLG, P002Q3_A55TAM07_USER_ID, P002Q3_A333TAM07_SITE_ID, P002Q3_n333TAM07_SITE_ID
            }
            , new Object[] {
            P002Q4_A89TBT02_STUDY_ID, P002Q4_A90TBT02_SUBJECT_ID, P002Q4_A91TBT02_CRF_ID, P002Q4_A698TBT01_SITE_ID, P002Q4_n698TBT01_SITE_ID, P002Q4_A647TBT01_OUTER_SUBJECT_ID, P002Q4_n647TBT01_OUTER_SUBJECT_ID, P002Q4_A498TBT02_CRF_LATEST_VERSION, P002Q4_n498TBT02_CRF_LATEST_VERSION, P002Q4_A499TBT02_CRF_INPUT_LEVEL,
            P002Q4_n499TBT02_CRF_INPUT_LEVEL, P002Q4_A648TBT02_LOCK_FLG, P002Q4_n648TBT02_LOCK_FLG, P002Q4_A649TBT02_LOCK_DATETIME, P002Q4_n649TBT02_LOCK_DATETIME, P002Q4_A650TBT02_LOCK_USER_ID, P002Q4_n650TBT02_LOCK_USER_ID, P002Q4_A651TBT02_LOCK_AUTH_CD, P002Q4_n651TBT02_LOCK_AUTH_CD, P002Q4_A652TBT02_UPLOAD_DATETIME,
            P002Q4_n652TBT02_UPLOAD_DATETIME, P002Q4_A653TBT02_UPLOAD_USER_ID, P002Q4_n653TBT02_UPLOAD_USER_ID, P002Q4_A654TBT02_UPLOAD_AUTH_CD, P002Q4_n654TBT02_UPLOAD_AUTH_CD, P002Q4_A655TBT02_DM_ARRIVAL_FLG, P002Q4_n655TBT02_DM_ARRIVAL_FLG, P002Q4_A656TBT02_DM_ARRIVAL_DATETIME, P002Q4_n656TBT02_DM_ARRIVAL_DATETIME, P002Q4_A657TBT02_APPROVAL_FLG,
            P002Q4_n657TBT02_APPROVAL_FLG, P002Q4_A658TBT02_APPROVAL_DATETIME, P002Q4_n658TBT02_APPROVAL_DATETIME, P002Q4_A659TBT02_APPROVAL_USER_ID, P002Q4_n659TBT02_APPROVAL_USER_ID, P002Q4_A660TBT02_APPROVAL_AUTH_CD, P002Q4_n660TBT02_APPROVAL_AUTH_CD, P002Q4_A661TBT02_INPUT_END_FLG, P002Q4_n661TBT02_INPUT_END_FLG, P002Q4_A662TBT02_INPUT_END_DATETIME,
            P002Q4_n662TBT02_INPUT_END_DATETIME, P002Q4_A663TBT02_INPUT_END_USER_ID, P002Q4_n663TBT02_INPUT_END_USER_ID, P002Q4_A664TBT02_INPUT_END_AUTH_CD, P002Q4_n664TBT02_INPUT_END_AUTH_CD, P002Q4_A449TBT02_DEL_FLG, P002Q4_n449TBT02_DEL_FLG, P002Q4_A450TBT02_CRT_DATETIME, P002Q4_n450TBT02_CRT_DATETIME, P002Q4_A451TBT02_CRT_USER_ID,
            P002Q4_n451TBT02_CRT_USER_ID, P002Q4_A452TBT02_CRT_PROG_NM, P002Q4_n452TBT02_CRT_PROG_NM, P002Q4_A453TBT02_UPD_DATETIME, P002Q4_n453TBT02_UPD_DATETIME, P002Q4_A454TBT02_UPD_USER_ID, P002Q4_n454TBT02_UPD_USER_ID, P002Q4_A455TBT02_UPD_PROG_NM, P002Q4_n455TBT02_UPD_PROG_NM, P002Q4_A456TBT02_UPD_CNT,
            P002Q4_n456TBT02_UPD_CNT, P002Q4_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            }
            , new Object[] {
            P002Q6_A112TBW03_DISP_DATETIME, P002Q6_A111TBW03_APP_ID, P002Q6_A110TBW03_SESSION_ID, P002Q6_A787TBW03_UPD_CNT, P002Q6_n787TBW03_UPD_CNT, P002Q6_A786TBW03_UPD_PROG_NM, P002Q6_n786TBW03_UPD_PROG_NM, P002Q6_A785TBW03_UPD_USER_NM, P002Q6_n785TBW03_UPD_USER_NM, P002Q6_A122TBW03_UPD_USER_ID,
            P002Q6_n122TBW03_UPD_USER_ID, P002Q6_A784TBW03_UPD_DATETIME, P002Q6_n784TBW03_UPD_DATETIME, P002Q6_A783TBW03_CRT_PROG_NM, P002Q6_n783TBW03_CRT_PROG_NM, P002Q6_A782TBW03_CRT_USER_NM, P002Q6_n782TBW03_CRT_USER_NM, P002Q6_A121TBW03_CRT_USER_ID, P002Q6_n121TBW03_CRT_USER_ID, P002Q6_A781TBW03_CRT_DATETIME,
            P002Q6_n781TBW03_CRT_DATETIME, P002Q6_A780TBW03_DEL_FLG, P002Q6_n780TBW03_DEL_FLG, P002Q6_A734TBW03_INPUT_END_AUTH_CD, P002Q6_n734TBW03_INPUT_END_AUTH_CD, P002Q6_A733TBW03_INPUT_END_USER_NM, P002Q6_n733TBW03_INPUT_END_USER_NM, P002Q6_A119TBW03_INPUT_END_USER_ID, P002Q6_n119TBW03_INPUT_END_USER_ID, P002Q6_A732TBW03_INPUT_END_DATETIME,
            P002Q6_n732TBW03_INPUT_END_DATETIME, P002Q6_A730TBW03_APPROVAL_AUTH_CD, P002Q6_n730TBW03_APPROVAL_AUTH_CD, P002Q6_A729TBW03_APPROVAL_USER_NM, P002Q6_n729TBW03_APPROVAL_USER_NM, P002Q6_A118TBW03_APPROVAL_USER_ID, P002Q6_n118TBW03_APPROVAL_USER_ID, P002Q6_A728TBW03_APPROVAL_DATETIME, P002Q6_n728TBW03_APPROVAL_DATETIME, P002Q6_A727TBW03_APPROVAL_FLG,
            P002Q6_n727TBW03_APPROVAL_FLG, P002Q6_A726TBW03_DM_ARRIVAL_DATETIME, P002Q6_n726TBW03_DM_ARRIVAL_DATETIME, P002Q6_A724TBW03_UPLOAD_AUTH_CD, P002Q6_n724TBW03_UPLOAD_AUTH_CD, P002Q6_A723TBW03_UPLOAD_USER_NM, P002Q6_n723TBW03_UPLOAD_USER_NM, P002Q6_A117TBW03_UPLOAD_USER_ID, P002Q6_n117TBW03_UPLOAD_USER_ID, P002Q6_A722TBW03_UPLOAD_DATETIME,
            P002Q6_n722TBW03_UPLOAD_DATETIME, P002Q6_A721TBW03_LOCK_AUTH_CD, P002Q6_n721TBW03_LOCK_AUTH_CD, P002Q6_A720TBW03_LOCK_USER_NM, P002Q6_n720TBW03_LOCK_USER_NM, P002Q6_A116TBW03_LOCK_USER_ID, P002Q6_n116TBW03_LOCK_USER_ID, P002Q6_A719TBW03_LOCK_DATETIME, P002Q6_n719TBW03_LOCK_DATETIME, P002Q6_A718TBW03_LOCK_FLG,
            P002Q6_n718TBW03_LOCK_FLG, P002Q6_A716TBW03_CRF_LATEST_VERSION, P002Q6_n716TBW03_CRF_LATEST_VERSION, P002Q6_A715TBW03_OUTER_SUBJECT_ID, P002Q6_n715TBW03_OUTER_SUBJECT_ID, P002Q6_A714TBW03_SITE_RYAK_NM, P002Q6_n714TBW03_SITE_RYAK_NM, P002Q6_A713TBW03_SITE_NM, P002Q6_n713TBW03_SITE_NM, P002Q6_A120TBW03_SITE_ID,
            P002Q6_n120TBW03_SITE_ID, P002Q6_A711TBW03_CRF_SNM, P002Q6_n711TBW03_CRF_SNM, P002Q6_A710TBW03_CRF_NM, P002Q6_n710TBW03_CRF_NM, P002Q6_A115TBW03_CRF_ID, P002Q6_A113TBW03_STUDY_ID, P002Q6_A712TBW03_CRF_ORDER, P002Q6_n712TBW03_CRF_ORDER, P002Q6_A114TBW03_SUBJECT_ID,
            P002Q6_A731TBW03_INPUT_END_FLG, P002Q6_n731TBW03_INPUT_END_FLG, P002Q6_A725TBW03_DM_ARRIVAL_FLG, P002Q6_n725TBW03_DM_ARRIVAL_FLG, P002Q6_A717TBW03_CRF_INPUT_LEVEL, P002Q6_n717TBW03_CRF_INPUT_LEVEL
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV48Pgmname = "B599_PC27_SEARCH_CRF_RES" ;
      /* GeneXus formulas. */
      AV48Pgmname = "B599_PC27_SEARCH_CRF_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte A687TAM04_AUTH_LVL ;
   private byte AV43GXLvl58 ;
   private byte AV19W_AUTH_LVL ;
   private byte AV44GXLvl75 ;
   private byte AV45GXLvl121 ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A717TBW03_CRF_INPUT_LEVEL ;
   private byte AV46GXLvl254 ;
   private short AV31W_RTN_CD ;
   private short Gx_err ;
   private short AV20W_CNT ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short A115TBW03_CRF_ID ;
   private short A716TBW03_CRF_LATEST_VERSION ;
   private short GXv_int74[] ;
   private int A90TBT02_SUBJECT_ID ;
   private int GX_INS41 ;
   private int A114TBW03_SUBJECT_ID ;
   private int A712TBW03_CRF_ORDER ;
   private int GXActiveErrHndl ;
   private long AV37W_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private long A113TBW03_STUDY_ID ;
   private long A787TBW03_UPD_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String AV34W_SESSION_getId ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXt_char9 ;
   private String GXv_char10[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char17 ;
   private String GXv_char18[] ;
   private String GXt_char19 ;
   private String GXv_char20[] ;
   private String GXt_char21 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char24[] ;
   private String GXt_char25 ;
   private String GXv_char26[] ;
   private String GXt_char27 ;
   private String GXv_char28[] ;
   private String GXt_char29 ;
   private String GXv_char30[] ;
   private String GXt_char31 ;
   private String GXv_char32[] ;
   private String GXt_char33 ;
   private String GXv_char34[] ;
   private String GXt_char35 ;
   private String GXv_char36[] ;
   private String GXt_char37 ;
   private String GXv_char38[] ;
   private String GXt_char39 ;
   private String GXv_char40[] ;
   private String GXt_char41 ;
   private String GXv_char42[] ;
   private String GXt_char43 ;
   private String GXv_char44[] ;
   private String GXt_char45 ;
   private String GXv_char46[] ;
   private String GXt_char47 ;
   private String GXv_char48[] ;
   private String GXt_char49 ;
   private String GXv_char50[] ;
   private String GXt_char51 ;
   private String GXv_char52[] ;
   private String GXt_char53 ;
   private String GXv_char54[] ;
   private String GXt_char55 ;
   private String GXv_char56[] ;
   private String GXt_char57 ;
   private String GXv_char58[] ;
   private String GXt_char59 ;
   private String GXv_char60[] ;
   private String GXt_char61 ;
   private String GXv_char62[] ;
   private String GXt_char63 ;
   private String GXv_char64[] ;
   private String GXt_char65 ;
   private String GXv_char66[] ;
   private String GXt_char67 ;
   private String GXv_char68[] ;
   private String GXt_char69 ;
   private String GXv_char70[] ;
   private String GXt_char71 ;
   private String AV48Pgmname ;
   private String GXv_char72[] ;
   private java.util.Date A649TBT02_LOCK_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A450TBT02_CRT_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private java.util.Date A719TBW03_LOCK_DATETIME ;
   private java.util.Date A722TBW03_UPLOAD_DATETIME ;
   private java.util.Date A726TBW03_DM_ARRIVAL_DATETIME ;
   private java.util.Date A728TBW03_APPROVAL_DATETIME ;
   private java.util.Date A732TBW03_INPUT_END_DATETIME ;
   private java.util.Date A781TBW03_CRT_DATETIME ;
   private java.util.Date A784TBW03_UPD_DATETIME ;
   private boolean returnInSub ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n626TBM07_DEL_FLG ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n623TBM07_CRF_INP_AUTH_FLG ;
   private boolean n624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n647TBT01_OUTER_SUBJECT_ID ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n648TBT02_LOCK_FLG ;
   private boolean n649TBT02_LOCK_DATETIME ;
   private boolean n650TBT02_LOCK_USER_ID ;
   private boolean n651TBT02_LOCK_AUTH_CD ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n450TBT02_CRT_DATETIME ;
   private boolean n451TBT02_CRT_USER_ID ;
   private boolean n452TBT02_CRT_PROG_NM ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n455TBT02_UPD_PROG_NM ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean AV25W_EXIST ;
   private boolean n120TBW03_SITE_ID ;
   private boolean n715TBW03_OUTER_SUBJECT_ID ;
   private boolean n716TBW03_CRF_LATEST_VERSION ;
   private boolean n717TBW03_CRF_INPUT_LEVEL ;
   private boolean n718TBW03_LOCK_FLG ;
   private boolean n719TBW03_LOCK_DATETIME ;
   private boolean n116TBW03_LOCK_USER_ID ;
   private boolean n721TBW03_LOCK_AUTH_CD ;
   private boolean n722TBW03_UPLOAD_DATETIME ;
   private boolean n117TBW03_UPLOAD_USER_ID ;
   private boolean n724TBW03_UPLOAD_AUTH_CD ;
   private boolean n725TBW03_DM_ARRIVAL_FLG ;
   private boolean n726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean n727TBW03_APPROVAL_FLG ;
   private boolean n728TBW03_APPROVAL_DATETIME ;
   private boolean n118TBW03_APPROVAL_USER_ID ;
   private boolean n730TBW03_APPROVAL_AUTH_CD ;
   private boolean n731TBW03_INPUT_END_FLG ;
   private boolean n732TBW03_INPUT_END_DATETIME ;
   private boolean n119TBW03_INPUT_END_USER_ID ;
   private boolean n734TBW03_INPUT_END_AUTH_CD ;
   private boolean n780TBW03_DEL_FLG ;
   private boolean n781TBW03_CRT_DATETIME ;
   private boolean n121TBW03_CRT_USER_ID ;
   private boolean n783TBW03_CRT_PROG_NM ;
   private boolean n784TBW03_UPD_DATETIME ;
   private boolean n122TBW03_UPD_USER_ID ;
   private boolean n786TBW03_UPD_PROG_NM ;
   private boolean n787TBW03_UPD_CNT ;
   private boolean n785TBW03_UPD_USER_NM ;
   private boolean n782TBW03_CRT_USER_NM ;
   private boolean n733TBW03_INPUT_END_USER_NM ;
   private boolean n729TBW03_APPROVAL_USER_NM ;
   private boolean n723TBW03_UPLOAD_USER_NM ;
   private boolean n720TBW03_LOCK_USER_NM ;
   private boolean n714TBW03_SITE_RYAK_NM ;
   private boolean n713TBW03_SITE_NM ;
   private boolean n711TBW03_CRF_SNM ;
   private boolean n710TBW03_CRF_NM ;
   private boolean n712TBW03_CRF_ORDER ;
   private String AV17P_USER_ID ;
   private String AV15P_STUDY_ID ;
   private String AV10P_AUTH_CD ;
   private String AV13P_SITE ;
   private String AV16P_SUBJECT ;
   private String AV11P_CRF ;
   private String AV12P_QUICK_SEARCH ;
   private String AV14P_SORT ;
   private String AV33W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String AV24W_DISP_DATETIME ;
   private String A623TBM07_CRF_INP_AUTH_FLG ;
   private String A624TBM07_CRF_EDIT_AUTH_FLG ;
   private String A333TAM07_SITE_ID ;
   private String A215TAM04_DEL_FLG ;
   private String A626TBM07_DEL_FLG ;
   private String A50TBM07_AUTH_CD ;
   private String AV39W_CRF_INP_AUTH_FLG ;
   private String AV40W_CRF_EDIT_AUTH_FLG ;
   private String AV38W_SITE_ID ;
   private String A214TAM07_DEL_FLG ;
   private String A55TAM07_USER_ID ;
   private String A116TBW03_LOCK_USER_ID ;
   private String A117TBW03_UPLOAD_USER_ID ;
   private String A118TBW03_APPROVAL_USER_ID ;
   private String A119TBW03_INPUT_END_USER_ID ;
   private String A121TBW03_CRT_USER_ID ;
   private String A122TBW03_UPD_USER_ID ;
   private String A647TBT01_OUTER_SUBJECT_ID ;
   private String A698TBT01_SITE_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A648TBT02_LOCK_FLG ;
   private String A650TBT02_LOCK_USER_ID ;
   private String A651TBT02_LOCK_AUTH_CD ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String A449TBT02_DEL_FLG ;
   private String A451TBT02_CRT_USER_ID ;
   private String A452TBT02_CRT_PROG_NM ;
   private String A454TBT02_UPD_USER_ID ;
   private String A455TBT02_UPD_PROG_NM ;
   private String A110TBW03_SESSION_ID ;
   private String A111TBW03_APP_ID ;
   private String AV9C_TAM02_APP_ID ;
   private String A112TBW03_DISP_DATETIME ;
   private String A120TBW03_SITE_ID ;
   private String A715TBW03_OUTER_SUBJECT_ID ;
   private String A718TBW03_LOCK_FLG ;
   private String A721TBW03_LOCK_AUTH_CD ;
   private String A724TBW03_UPLOAD_AUTH_CD ;
   private String A725TBW03_DM_ARRIVAL_FLG ;
   private String A727TBW03_APPROVAL_FLG ;
   private String A730TBW03_APPROVAL_AUTH_CD ;
   private String A731TBW03_INPUT_END_FLG ;
   private String A734TBW03_INPUT_END_AUTH_CD ;
   private String A780TBW03_DEL_FLG ;
   private String A783TBW03_CRT_PROG_NM ;
   private String A786TBW03_UPD_PROG_NM ;
   private String A710TBW03_CRF_NM ;
   private String A711TBW03_CRF_SNM ;
   private String A713TBW03_SITE_NM ;
   private String A714TBW03_SITE_RYAK_NM ;
   private String A720TBW03_LOCK_USER_NM ;
   private String A723TBW03_UPLOAD_USER_NM ;
   private String A729TBW03_APPROVAL_USER_NM ;
   private String A733TBW03_INPUT_END_USER_NM ;
   private String A782TBW03_CRT_USER_NM ;
   private String A785TBW03_UPD_USER_NM ;
   private String AV36W_STR ;
   private String AV27W_MSG ;
   private com.genexus.webpanels.WebSession AV34W_SESSION ;
   private GxObjectCollection[] aP8 ;
   private short[] aP9 ;
   private String[] aP10 ;
   private IDataStoreProvider pr_default ;
   private String[] P002Q2_A215TAM04_DEL_FLG ;
   private boolean[] P002Q2_n215TAM04_DEL_FLG ;
   private String[] P002Q2_A626TBM07_DEL_FLG ;
   private boolean[] P002Q2_n626TBM07_DEL_FLG ;
   private String[] P002Q2_A50TBM07_AUTH_CD ;
   private byte[] P002Q2_A687TAM04_AUTH_LVL ;
   private boolean[] P002Q2_n687TAM04_AUTH_LVL ;
   private String[] P002Q2_A623TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] P002Q2_n623TBM07_CRF_INP_AUTH_FLG ;
   private String[] P002Q2_A624TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] P002Q2_n624TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] P002Q3_A214TAM07_DEL_FLG ;
   private boolean[] P002Q3_n214TAM07_DEL_FLG ;
   private String[] P002Q3_A55TAM07_USER_ID ;
   private String[] P002Q3_A333TAM07_SITE_ID ;
   private boolean[] P002Q3_n333TAM07_SITE_ID ;
   private long[] P002Q4_A89TBT02_STUDY_ID ;
   private int[] P002Q4_A90TBT02_SUBJECT_ID ;
   private short[] P002Q4_A91TBT02_CRF_ID ;
   private String[] P002Q4_A698TBT01_SITE_ID ;
   private boolean[] P002Q4_n698TBT01_SITE_ID ;
   private String[] P002Q4_A647TBT01_OUTER_SUBJECT_ID ;
   private boolean[] P002Q4_n647TBT01_OUTER_SUBJECT_ID ;
   private short[] P002Q4_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] P002Q4_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] P002Q4_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] P002Q4_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] P002Q4_A648TBT02_LOCK_FLG ;
   private boolean[] P002Q4_n648TBT02_LOCK_FLG ;
   private java.util.Date[] P002Q4_A649TBT02_LOCK_DATETIME ;
   private boolean[] P002Q4_n649TBT02_LOCK_DATETIME ;
   private String[] P002Q4_A650TBT02_LOCK_USER_ID ;
   private boolean[] P002Q4_n650TBT02_LOCK_USER_ID ;
   private String[] P002Q4_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] P002Q4_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] P002Q4_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] P002Q4_n652TBT02_UPLOAD_DATETIME ;
   private String[] P002Q4_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] P002Q4_n653TBT02_UPLOAD_USER_ID ;
   private String[] P002Q4_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] P002Q4_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] P002Q4_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P002Q4_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P002Q4_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P002Q4_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] P002Q4_A657TBT02_APPROVAL_FLG ;
   private boolean[] P002Q4_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] P002Q4_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] P002Q4_n658TBT02_APPROVAL_DATETIME ;
   private String[] P002Q4_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] P002Q4_n659TBT02_APPROVAL_USER_ID ;
   private String[] P002Q4_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] P002Q4_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] P002Q4_A661TBT02_INPUT_END_FLG ;
   private boolean[] P002Q4_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] P002Q4_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] P002Q4_n662TBT02_INPUT_END_DATETIME ;
   private String[] P002Q4_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] P002Q4_n663TBT02_INPUT_END_USER_ID ;
   private String[] P002Q4_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] P002Q4_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] P002Q4_A449TBT02_DEL_FLG ;
   private boolean[] P002Q4_n449TBT02_DEL_FLG ;
   private java.util.Date[] P002Q4_A450TBT02_CRT_DATETIME ;
   private boolean[] P002Q4_n450TBT02_CRT_DATETIME ;
   private String[] P002Q4_A451TBT02_CRT_USER_ID ;
   private boolean[] P002Q4_n451TBT02_CRT_USER_ID ;
   private String[] P002Q4_A452TBT02_CRT_PROG_NM ;
   private boolean[] P002Q4_n452TBT02_CRT_PROG_NM ;
   private java.util.Date[] P002Q4_A453TBT02_UPD_DATETIME ;
   private boolean[] P002Q4_n453TBT02_UPD_DATETIME ;
   private String[] P002Q4_A454TBT02_UPD_USER_ID ;
   private boolean[] P002Q4_n454TBT02_UPD_USER_ID ;
   private String[] P002Q4_A455TBT02_UPD_PROG_NM ;
   private boolean[] P002Q4_n455TBT02_UPD_PROG_NM ;
   private long[] P002Q4_A456TBT02_UPD_CNT ;
   private boolean[] P002Q4_n456TBT02_UPD_CNT ;
   private byte[] P002Q4_A935TBT02_CRF_EDA_NO ;
   private String[] P002Q6_A112TBW03_DISP_DATETIME ;
   private String[] P002Q6_A111TBW03_APP_ID ;
   private String[] P002Q6_A110TBW03_SESSION_ID ;
   private long[] P002Q6_A787TBW03_UPD_CNT ;
   private boolean[] P002Q6_n787TBW03_UPD_CNT ;
   private String[] P002Q6_A786TBW03_UPD_PROG_NM ;
   private boolean[] P002Q6_n786TBW03_UPD_PROG_NM ;
   private String[] P002Q6_A785TBW03_UPD_USER_NM ;
   private boolean[] P002Q6_n785TBW03_UPD_USER_NM ;
   private String[] P002Q6_A122TBW03_UPD_USER_ID ;
   private boolean[] P002Q6_n122TBW03_UPD_USER_ID ;
   private java.util.Date[] P002Q6_A784TBW03_UPD_DATETIME ;
   private boolean[] P002Q6_n784TBW03_UPD_DATETIME ;
   private String[] P002Q6_A783TBW03_CRT_PROG_NM ;
   private boolean[] P002Q6_n783TBW03_CRT_PROG_NM ;
   private String[] P002Q6_A782TBW03_CRT_USER_NM ;
   private boolean[] P002Q6_n782TBW03_CRT_USER_NM ;
   private String[] P002Q6_A121TBW03_CRT_USER_ID ;
   private boolean[] P002Q6_n121TBW03_CRT_USER_ID ;
   private java.util.Date[] P002Q6_A781TBW03_CRT_DATETIME ;
   private boolean[] P002Q6_n781TBW03_CRT_DATETIME ;
   private String[] P002Q6_A780TBW03_DEL_FLG ;
   private boolean[] P002Q6_n780TBW03_DEL_FLG ;
   private String[] P002Q6_A734TBW03_INPUT_END_AUTH_CD ;
   private boolean[] P002Q6_n734TBW03_INPUT_END_AUTH_CD ;
   private String[] P002Q6_A733TBW03_INPUT_END_USER_NM ;
   private boolean[] P002Q6_n733TBW03_INPUT_END_USER_NM ;
   private String[] P002Q6_A119TBW03_INPUT_END_USER_ID ;
   private boolean[] P002Q6_n119TBW03_INPUT_END_USER_ID ;
   private java.util.Date[] P002Q6_A732TBW03_INPUT_END_DATETIME ;
   private boolean[] P002Q6_n732TBW03_INPUT_END_DATETIME ;
   private String[] P002Q6_A730TBW03_APPROVAL_AUTH_CD ;
   private boolean[] P002Q6_n730TBW03_APPROVAL_AUTH_CD ;
   private String[] P002Q6_A729TBW03_APPROVAL_USER_NM ;
   private boolean[] P002Q6_n729TBW03_APPROVAL_USER_NM ;
   private String[] P002Q6_A118TBW03_APPROVAL_USER_ID ;
   private boolean[] P002Q6_n118TBW03_APPROVAL_USER_ID ;
   private java.util.Date[] P002Q6_A728TBW03_APPROVAL_DATETIME ;
   private boolean[] P002Q6_n728TBW03_APPROVAL_DATETIME ;
   private String[] P002Q6_A727TBW03_APPROVAL_FLG ;
   private boolean[] P002Q6_n727TBW03_APPROVAL_FLG ;
   private java.util.Date[] P002Q6_A726TBW03_DM_ARRIVAL_DATETIME ;
   private boolean[] P002Q6_n726TBW03_DM_ARRIVAL_DATETIME ;
   private String[] P002Q6_A724TBW03_UPLOAD_AUTH_CD ;
   private boolean[] P002Q6_n724TBW03_UPLOAD_AUTH_CD ;
   private String[] P002Q6_A723TBW03_UPLOAD_USER_NM ;
   private boolean[] P002Q6_n723TBW03_UPLOAD_USER_NM ;
   private String[] P002Q6_A117TBW03_UPLOAD_USER_ID ;
   private boolean[] P002Q6_n117TBW03_UPLOAD_USER_ID ;
   private java.util.Date[] P002Q6_A722TBW03_UPLOAD_DATETIME ;
   private boolean[] P002Q6_n722TBW03_UPLOAD_DATETIME ;
   private String[] P002Q6_A721TBW03_LOCK_AUTH_CD ;
   private boolean[] P002Q6_n721TBW03_LOCK_AUTH_CD ;
   private String[] P002Q6_A720TBW03_LOCK_USER_NM ;
   private boolean[] P002Q6_n720TBW03_LOCK_USER_NM ;
   private String[] P002Q6_A116TBW03_LOCK_USER_ID ;
   private boolean[] P002Q6_n116TBW03_LOCK_USER_ID ;
   private java.util.Date[] P002Q6_A719TBW03_LOCK_DATETIME ;
   private boolean[] P002Q6_n719TBW03_LOCK_DATETIME ;
   private String[] P002Q6_A718TBW03_LOCK_FLG ;
   private boolean[] P002Q6_n718TBW03_LOCK_FLG ;
   private short[] P002Q6_A716TBW03_CRF_LATEST_VERSION ;
   private boolean[] P002Q6_n716TBW03_CRF_LATEST_VERSION ;
   private String[] P002Q6_A715TBW03_OUTER_SUBJECT_ID ;
   private boolean[] P002Q6_n715TBW03_OUTER_SUBJECT_ID ;
   private String[] P002Q6_A714TBW03_SITE_RYAK_NM ;
   private boolean[] P002Q6_n714TBW03_SITE_RYAK_NM ;
   private String[] P002Q6_A713TBW03_SITE_NM ;
   private boolean[] P002Q6_n713TBW03_SITE_NM ;
   private String[] P002Q6_A120TBW03_SITE_ID ;
   private boolean[] P002Q6_n120TBW03_SITE_ID ;
   private String[] P002Q6_A711TBW03_CRF_SNM ;
   private boolean[] P002Q6_n711TBW03_CRF_SNM ;
   private String[] P002Q6_A710TBW03_CRF_NM ;
   private boolean[] P002Q6_n710TBW03_CRF_NM ;
   private short[] P002Q6_A115TBW03_CRF_ID ;
   private long[] P002Q6_A113TBW03_STUDY_ID ;
   private int[] P002Q6_A712TBW03_CRF_ORDER ;
   private boolean[] P002Q6_n712TBW03_CRF_ORDER ;
   private int[] P002Q6_A114TBW03_SUBJECT_ID ;
   private String[] P002Q6_A731TBW03_INPUT_END_FLG ;
   private boolean[] P002Q6_n731TBW03_INPUT_END_FLG ;
   private String[] P002Q6_A725TBW03_DM_ARRIVAL_FLG ;
   private boolean[] P002Q6_n725TBW03_DM_ARRIVAL_FLG ;
   private byte[] P002Q6_A717TBW03_CRF_INPUT_LEVEL ;
   private boolean[] P002Q6_n717TBW03_CRF_INPUT_LEVEL ;
   private GxObjectCollection AV32W_RTN_CSV ;
   private GxObjectCollection AV18W_AUTH_CD ;
   private GxObjectCollection AV29W_OUTER_SUBJECT_ID_C ;
   private GxObjectCollection AV35W_SITE_ID_C ;
   private GxObjectCollection AV23W_CSV_C ;
   private GxObjectCollection AV22W_CRF_ID_C ;
   private SdtB808_SD01_EXTRA_INFO AV26W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO73[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV30W_PARMS_ITEM ;
}

final  class b599_pc27_search_crf_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P002Q4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String A647TBT01_OUTER_SUBJECT_ID ,
                                          GxObjectCollection AV29W_OUTER_SUBJECT_ID_C ,
                                          String A698TBT01_SITE_ID ,
                                          GxObjectCollection AV35W_SITE_ID_C ,
                                          short A91TBT02_CRF_ID ,
                                          GxObjectCollection AV22W_CRF_ID_C ,
                                          String A654TBT02_UPLOAD_AUTH_CD ,
                                          GxObjectCollection AV18W_AUTH_CD ,
                                          String AV16P_SUBJECT ,
                                          String AV13P_SITE ,
                                          String AV11P_CRF ,
                                          String AV12P_QUICK_SEARCH ,
                                          String AV39W_CRF_INP_AUTH_FLG ,
                                          String AV40W_CRF_EDIT_AUTH_FLG ,
                                          byte A499TBT02_CRF_INPUT_LEVEL ,
                                          byte AV19W_AUTH_LVL ,
                                          String AV38W_SITE_ID ,
                                          String A655TBT02_DM_ARRIVAL_FLG ,
                                          String A657TBT02_APPROVAL_FLG ,
                                          String A661TBT02_INPUT_END_FLG ,
                                          long AV37W_STUDY_ID ,
                                          long A89TBT02_STUDY_ID )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int75 ;
      GXv_int75 = new byte [3] ;
      Object[] GXv_Object76 ;
      GXv_Object76 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBT02_CRF" ;
      scmdbuf = "SELECT T1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, T1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID," ;
      scmdbuf = scmdbuf + " T1.`TBT02_CRF_ID`, T2.`TBT01_SITE_ID`, T2.`TBT01_OUTER_SUBJECT_ID`, T1.`TBT02_CRF_LATEST_VERSION`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_CRF_INPUT_LEVEL`, T1.`TBT02_LOCK_FLG`, T1.`TBT02_LOCK_DATETIME`, T1.`TBT02_LOCK_USER_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_LOCK_AUTH_CD`, T1.`TBT02_UPLOAD_DATETIME`, T1.`TBT02_UPLOAD_USER_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_UPLOAD_AUTH_CD`, T1.`TBT02_DM_ARRIVAL_FLG`, T1.`TBT02_DM_ARRIVAL_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_APPROVAL_FLG`, T1.`TBT02_APPROVAL_DATETIME`, T1.`TBT02_APPROVAL_USER_ID`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_APPROVAL_AUTH_CD`, T1.`TBT02_INPUT_END_FLG`, T1.`TBT02_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_INPUT_END_USER_ID`, T1.`TBT02_INPUT_END_AUTH_CD`, T1.`TBT02_DEL_FLG`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_CRT_DATETIME`, T1.`TBT02_CRT_USER_ID`, T1.`TBT02_CRT_PROG_NM`, T1.`TBT02_UPD_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBT02_UPD_USER_ID`, T1.`TBT02_UPD_PROG_NM`, T1.`TBT02_UPD_CNT`, T1.`TBT02_CRF_EDA_NO`" ;
      scmdbuf = scmdbuf + " FROM (`TBT02_CRF` T1 INNER JOIN `TBT01_SUBJECT` T2 ON T2.`TBT01_STUDY_ID` = T1.`TBT02_STUDY_ID`" ;
      scmdbuf = scmdbuf + " AND T2.`TBT01_SUBJECT_ID` = T1.`TBT02_SUBJECT_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBT02_STUDY_ID` = ?)" ;
      if ( ! (GXutil.strcmp("", AV16P_SUBJECT)==0) )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV29W_OUTER_SUBJECT_ID_C, "T2.`TBT01_OUTER_SUBJECT_ID` IN (", ")") + ")" ;
      }
      if ( ! (GXutil.strcmp("", AV13P_SITE)==0) )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV35W_SITE_ID_C, "T2.`TBT01_SITE_ID` IN (", ")") + ")" ;
      }
      if ( ! (GXutil.strcmp("", AV11P_CRF)==0) )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV22W_CRF_ID_C, "T1.`TBT02_CRF_ID` IN (", ")") + ")" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "1") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_CRF_INPUT_LEVEL` <= ?)" ;
      }
      else
      {
         GXv_int75[1] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "1") == 0 )
      {
         sWhereString = sWhereString + " and (T2.`TBT01_SITE_ID` = ?)" ;
      }
      else
      {
         GXv_int75[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV12P_QUICK_SEARCH, "1") == 0 ) && ( GXutil.strcmp(AV39W_CRF_INP_AUTH_FLG, "0") == 0 ) )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = '1')" ;
      }
      if ( ( GXutil.strcmp(AV12P_QUICK_SEARCH, "1") == 0 ) && ( GXutil.strcmp(AV40W_CRF_EDIT_AUTH_FLG, "0") == 0 ) )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = '0')" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "4") == 0 )
      {
         sWhereString = sWhereString + " and (" + GXutil.toValueList("mysql", AV18W_AUTH_CD, "T1.`TBT02_UPLOAD_AUTH_CD` IN (", ")") + ")" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "4") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_APPROVAL_FLG` = '0')" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "4") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_DM_ARRIVAL_FLG` = '1')" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "5") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_INPUT_END_FLG` = '1')" ;
      }
      if ( GXutil.strcmp(AV12P_QUICK_SEARCH, "6") == 0 )
      {
         sWhereString = sWhereString + " and (T1.`TBT02_INPUT_END_FLG` = '0')" ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY T1.`TBT02_STUDY_ID`" ;
      GXv_Object76[0] = scmdbuf ;
      GXv_Object76[1] = GXv_int75 ;
      return GXv_Object76 ;
   }

   protected Object[] conditional_P002Q6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV14P_SORT ,
                                          String A110TBW03_SESSION_ID ,
                                          String AV34W_SESSION_getId ,
                                          String A111TBW03_APP_ID ,
                                          String AV9C_TAM02_APP_ID ,
                                          String A112TBW03_DISP_DATETIME ,
                                          String AV24W_DISP_DATETIME )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int78 ;
      GXv_int78 = new byte [3] ;
      Object[] GXv_Object79 ;
      GXv_Object79 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBW03_CRF_SEARCH" ;
      scmdbuf = "SELECT T1.`TBW03_DISP_DATETIME`, T1.`TBW03_APP_ID`, T1.`TBW03_SESSION_ID`, T1.`TBW03_UPD_CNT`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_UPD_PROG_NM`, T2.`TAM07_USER_NM` AS TBW03_UPD_USER_NM, T1.`TBW03_UPD_USER_ID`" ;
      scmdbuf = scmdbuf + " AS TBW03_UPD_USER_ID, T1.`TBW03_UPD_DATETIME`, T1.`TBW03_CRT_PROG_NM`, T3.`TAM07_USER_NM`" ;
      scmdbuf = scmdbuf + " AS TBW03_CRT_USER_NM, T1.`TBW03_CRT_USER_ID` AS TBW03_CRT_USER_ID, T1.`TBW03_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_DEL_FLG`, T1.`TBW03_INPUT_END_AUTH_CD`, T4.`TAM07_USER_NM` AS TBW03_INPUT_END_USER_NM," ;
      scmdbuf = scmdbuf + " T1.`TBW03_INPUT_END_USER_ID` AS TBW03_INPUT_END_USER_ID, T1.`TBW03_INPUT_END_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_APPROVAL_AUTH_CD`, T5.`TAM07_USER_NM` AS TBW03_APPROVAL_USER_NM, T1.`TBW03_APPROVAL_USER_ID`" ;
      scmdbuf = scmdbuf + " AS TBW03_APPROVAL_USER_ID, T1.`TBW03_APPROVAL_DATETIME`, T1.`TBW03_APPROVAL_FLG`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_DM_ARRIVAL_DATETIME`, T1.`TBW03_UPLOAD_AUTH_CD`, T6.`TAM07_USER_NM` AS" ;
      scmdbuf = scmdbuf + " TBW03_UPLOAD_USER_NM, T1.`TBW03_UPLOAD_USER_ID` AS TBW03_UPLOAD_USER_ID, T1.`TBW03_UPLOAD_DATETIME`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_LOCK_AUTH_CD`, T7.`TAM07_USER_NM` AS TBW03_LOCK_USER_NM, T1.`TBW03_LOCK_USER_ID`" ;
      scmdbuf = scmdbuf + " AS TBW03_LOCK_USER_ID, T1.`TBW03_LOCK_DATETIME`, T1.`TBW03_LOCK_FLG`, T1.`TBW03_CRF_LATEST_VERSION`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_OUTER_SUBJECT_ID`, T8.`TAM08_SITE_SNM` AS TBW03_SITE_RYAK_NM, T8.`TAM08_SITE_NM`" ;
      scmdbuf = scmdbuf + " AS TBW03_SITE_NM, T1.`TBW03_SITE_ID` AS TBW03_SITE_ID, T9.`TBM31_CRF_SNM` AS TBW03_CRF_SNM," ;
      scmdbuf = scmdbuf + " T9.`TBM31_CRF_NM` AS TBW03_CRF_NM, T1.`TBW03_CRF_ID` AS TBW03_CRF_ID, T1.`TBW03_STUDY_ID`" ;
      scmdbuf = scmdbuf + " AS TBW03_STUDY_ID, T9.`TBM31_ORDER` AS TBW03_CRF_ORDER, T1.`TBW03_SUBJECT_ID`, T1.`TBW03_INPUT_END_FLG`," ;
      scmdbuf = scmdbuf + " T1.`TBW03_DM_ARRIVAL_FLG`, T1.`TBW03_CRF_INPUT_LEVEL` FROM ((((((((`TBW03_CRF_SEARCH`" ;
      scmdbuf = scmdbuf + " T1 LEFT JOIN `TAM07_USER` T2 ON T2.`TAM07_USER_ID` = T1.`TBW03_UPD_USER_ID`) LEFT" ;
      scmdbuf = scmdbuf + " JOIN `TAM07_USER` T3 ON T3.`TAM07_USER_ID` = T1.`TBW03_CRT_USER_ID`) LEFT JOIN `TAM07_USER`" ;
      scmdbuf = scmdbuf + " T4 ON T4.`TAM07_USER_ID` = T1.`TBW03_INPUT_END_USER_ID`) LEFT JOIN `TAM07_USER`" ;
      scmdbuf = scmdbuf + " T5 ON T5.`TAM07_USER_ID` = T1.`TBW03_APPROVAL_USER_ID`) LEFT JOIN `TAM07_USER` T6" ;
      scmdbuf = scmdbuf + " ON T6.`TAM07_USER_ID` = T1.`TBW03_UPLOAD_USER_ID`) LEFT JOIN `TAM07_USER` T7 ON" ;
      scmdbuf = scmdbuf + " T7.`TAM07_USER_ID` = T1.`TBW03_LOCK_USER_ID`) LEFT JOIN `TAM08_SITE` T8 ON T8.`TAM08_SITE_ID`" ;
      scmdbuf = scmdbuf + " = T1.`TBW03_SITE_ID`) INNER JOIN `TBM31_CRF` T9 ON T9.`TBM31_STUDY_ID` = T1.`TBW03_STUDY_ID`" ;
      scmdbuf = scmdbuf + " AND T9.`TBM31_CRF_ID` = T1.`TBW03_CRF_ID`)" ;
      scmdbuf = scmdbuf + " WHERE (T1.`TBW03_SESSION_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T1.`TBW03_APP_ID` = ?)" ;
      scmdbuf = scmdbuf + " and (T1.`TBW03_DISP_DATETIME` = ?)" ;
      if ( (GXutil.strcmp("", AV14P_SORT)==0) )
      {
         scmdbuf = scmdbuf + " ORDER BY T1.`TBW03_SUBJECT_ID`, T9.`TBM31_ORDER`" ;
      }
      else if ( GXutil.strcmp(AV14P_SORT, "1") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY T1.`TBW03_SUBJECT_ID`, T9.`TBM31_ORDER`" ;
      }
      else if ( GXutil.strcmp(AV14P_SORT, "2") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY T9.`TBM31_ORDER`, T1.`TBW03_SUBJECT_ID`" ;
      }
      else if ( GXutil.strcmp(AV14P_SORT, "3") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY T1.`TBW03_CRF_INPUT_LEVEL`, T9.`TBM31_ORDER`, T1.`TBW03_SUBJECT_ID`" ;
      }
      else if ( GXutil.strcmp(AV14P_SORT, "4") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY T1.`TBW03_DM_ARRIVAL_FLG` DESC, T1.`TBW03_SUBJECT_ID`, T9.`TBM31_ORDER`" ;
      }
      else if ( GXutil.strcmp(AV14P_SORT, "5") == 0 )
      {
         scmdbuf = scmdbuf + " ORDER BY T1.`TBW03_INPUT_END_FLG` DESC, T1.`TBW03_SUBJECT_ID`, T9.`TBM31_ORDER`" ;
      }
      GXv_Object79[0] = scmdbuf ;
      GXv_Object79[1] = GXv_int78 ;
      return GXv_Object79 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 2 :
                  return conditional_P002Q4(context, remoteHandle, httpContext, (String)dynConstraints[0] , (GxObjectCollection)dynConstraints[1] , (String)dynConstraints[2] , (GxObjectCollection)dynConstraints[3] , ((Number) dynConstraints[4]).shortValue() , (GxObjectCollection)dynConstraints[5] , (String)dynConstraints[6] , (GxObjectCollection)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).longValue() , ((Number) dynConstraints[21]).longValue() );
            case 4 :
                  return conditional_P002Q6(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P002Q2", "SELECT T2.`TAM04_DEL_FLG`, T1.`TBM07_DEL_FLG`, T1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD, T2.`TAM04_AUTH_LVL`, T1.`TBM07_CRF_INP_AUTH_FLG`, T1.`TBM07_CRF_EDIT_AUTH_FLG` FROM (`TBM07_AUTH_BEHAVIOR` T1 INNER JOIN `TAM04_KNGN` T2 ON T2.`TAM04_AUTH_CD` = T1.`TBM07_AUTH_CD`) WHERE (T1.`TBM07_AUTH_CD` = ?) AND (T1.`TBM07_DEL_FLG` = '0') AND (T2.`TAM04_DEL_FLG` = '0') ORDER BY T1.`TBM07_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002Q3", "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_SITE_ID` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P002Q4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P002Q5", "INSERT INTO `TBW03_CRF_SEARCH`(`TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID`, `TBW03_SITE_ID`, `TBW03_OUTER_SUBJECT_ID`, `TBW03_CRF_LATEST_VERSION`, `TBW03_CRF_INPUT_LEVEL`, `TBW03_LOCK_FLG`, `TBW03_LOCK_DATETIME`, `TBW03_LOCK_USER_ID`, `TBW03_LOCK_AUTH_CD`, `TBW03_UPLOAD_DATETIME`, `TBW03_UPLOAD_USER_ID`, `TBW03_UPLOAD_AUTH_CD`, `TBW03_DM_ARRIVAL_FLG`, `TBW03_DM_ARRIVAL_DATETIME`, `TBW03_APPROVAL_FLG`, `TBW03_APPROVAL_DATETIME`, `TBW03_APPROVAL_USER_ID`, `TBW03_APPROVAL_AUTH_CD`, `TBW03_INPUT_END_FLG`, `TBW03_INPUT_END_DATETIME`, `TBW03_INPUT_END_USER_ID`, `TBW03_INPUT_END_AUTH_CD`, `TBW03_DEL_FLG`, `TBW03_CRT_DATETIME`, `TBW03_CRT_USER_ID`, `TBW03_CRT_PROG_NM`, `TBW03_UPD_DATETIME`, `TBW03_UPD_USER_ID`, `TBW03_UPD_PROG_NM`, `TBW03_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P002Q6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P002Q7", "DELETE FROM `TBW03_CRF_SEARCH`  WHERE `TBW03_SESSION_ID` = ? and `TBW03_APP_ID` = ? and `TBW03_DISP_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3) ;
               ((byte[]) buf[5])[0] = rslt.getByte(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[39])[0] = rslt.getGXDateTime(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDateTime(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[53])[0] = rslt.getGXDateTime(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((long[]) buf[59])[0] = rslt.getLong(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(33) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[57])[0] = rslt.getGXDateTime(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((short[]) buf[61])[0] = rslt.getShort(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getVarchar(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getVarchar(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getVarchar(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getVarchar(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((short[]) buf[75])[0] = rslt.getShort(40) ;
               ((long[]) buf[76])[0] = rslt.getLong(41) ;
               ((int[]) buf[77])[0] = rslt.getInt(42) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((int[]) buf[79])[0] = rslt.getInt(43) ;
               ((String[]) buf[80])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[81])[0] = rslt.wasNull();
               ((String[]) buf[82])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[83])[0] = rslt.wasNull();
               ((byte[]) buf[84])[0] = rslt.getByte(46) ;
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[4]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 20);
               }
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[7], 20);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 6);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 128);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 128);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[39], 2);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[45], 128);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(29, (java.util.Date)parms[51], false);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[55], 40);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(32, (java.util.Date)parms[57], false);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[59], 128);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(34, (String)parms[61], 40);
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(35, ((Number) parms[63]).longValue());
               }
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[3], 50);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 7);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 14);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 7);
               stmt.setVarchar(3, (String)parms[2], 14);
               return;
      }
   }

}

