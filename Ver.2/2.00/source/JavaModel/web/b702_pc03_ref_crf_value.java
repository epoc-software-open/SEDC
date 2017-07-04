/*
               File: B702_PC03_REF_CRF_VALUE
        Description: éQè∆CRFçÄñ⁄íléÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:18.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc03_ref_crf_value extends GXProcedure
{
   public b702_pc03_ref_crf_value( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc03_ref_crf_value.class ), "" );
   }

   public b702_pc03_ref_crf_value( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             SdtB792_SD01_CRF aP4 ,
                             java.util.Date aP5 )
   {
      b702_pc03_ref_crf_value.this.AV10P_STUDY_ID = aP0;
      b702_pc03_ref_crf_value.this.AV11P_SUBJECT_ID = aP1;
      b702_pc03_ref_crf_value.this.AV12P_TBM32_REF_CRF_ID = aP2;
      b702_pc03_ref_crf_value.this.AV13P_TBM32_REF_CRF_ITEM_CD = aP3;
      b702_pc03_ref_crf_value.this.AV14SD_B792_SD01_CRF = aP4;
      b702_pc03_ref_crf_value.this.AV9P_EXEC_DATETIME = aP5;
      b702_pc03_ref_crf_value.this.aP6 = aP6;
      b702_pc03_ref_crf_value.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        SdtB792_SD01_CRF aP4 ,
                        java.util.Date aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             SdtB792_SD01_CRF aP4 ,
                             java.util.Date aP5 ,
                             String[] aP6 )
   {
      b702_pc03_ref_crf_value.this.AV10P_STUDY_ID = aP0;
      b702_pc03_ref_crf_value.this.AV11P_SUBJECT_ID = aP1;
      b702_pc03_ref_crf_value.this.AV12P_TBM32_REF_CRF_ID = aP2;
      b702_pc03_ref_crf_value.this.AV13P_TBM32_REF_CRF_ITEM_CD = aP3;
      b702_pc03_ref_crf_value.this.AV14SD_B792_SD01_CRF = aP4;
      b702_pc03_ref_crf_value.this.AV9P_EXEC_DATETIME = aP5;
      b702_pc03_ref_crf_value.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8P_CRF_VALUE = "" ;
      /* Using cursor P005P2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV13P_TBM32_REF_CRF_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A72TBM32_CRF_ITEM_CD = P005P2_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P005P2_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P005P2_A70TBM32_STUDY_ID[0] ;
         A74TBM32_CRF_ITEM_DIV = P005P2_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P005P2_n74TBM32_CRF_ITEM_DIV[0] ;
         A527TBM32_FIXED_VALUE = P005P2_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P005P2_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P005P2_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P005P2_n525TBM32_LIST_CD[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P005P2_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P005P2_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") == 0 )
         {
            AV8P_CRF_VALUE = A527TBM32_FIXED_VALUE ;
         }
         else
         {
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "SelectBox") == 0 )
            {
               GXv_char1[0] = AV20W_TBM26_LIST_ITEM_NAME ;
               new b799_pc10_sel_list_item_get(remoteHandle, context).execute( AV10P_STUDY_ID, A525TBM32_LIST_CD, AV22W_TBT12_CRF_VALUE, GXv_char1) ;
               b702_pc03_ref_crf_value.this.AV20W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
               AV8P_CRF_VALUE = AV20W_TBM26_LIST_ITEM_NAME ;
            }
            else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") == 0 )
            {
               AV21W_TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
               /* Execute user subroutine: S121 */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ! (GXutil.strcmp("", AV24W_TBM32_TEXT)==0) )
               {
                  AV8P_CRF_VALUE = AV24W_TBM32_TEXT ;
               }
               else
               {
                  GXv_char1[0] = AV22W_TBT12_CRF_VALUE ;
                  new b702_pc05_ref_crf_value_grp(remoteHandle, context).execute( AV10P_STUDY_ID, AV11P_SUBJECT_ID, AV12P_TBM32_REF_CRF_ID, A73TBM32_CRF_ITEM_GRP_CD, AV14SD_B792_SD01_CRF, AV9P_EXEC_DATETIME, GXv_char1) ;
                  b702_pc03_ref_crf_value.this.AV22W_TBT12_CRF_VALUE = GXv_char1[0] ;
                  AV8P_CRF_VALUE = AV22W_TBT12_CRF_VALUE ;
               }
            }
            else
            {
               AV8P_CRF_VALUE = AV22W_TBT12_CRF_VALUE ;
            }
         }
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CRF_VALUE_GET' Routine */
      AV22W_TBT12_CRF_VALUE = "" ;
      if ( ( AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV12P_TBM32_REF_CRF_ID ) && ( AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no() == 1 ) )
      {
         AV28GXV1 = 1 ;
         while ( AV28GXV1 <= AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
         {
            AV15SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV28GXV1));
            if ( GXutil.strcmp(AV15SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), AV13P_TBM32_REF_CRF_ITEM_CD) == 0 )
            {
               AV22W_TBT12_CRF_VALUE = AV15SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               if (true) break;
            }
            AV28GXV1 = (int)(AV28GXV1+1) ;
         }
      }
      else
      {
         GXt_char2 = AV23W_TBW01_DISP_DATETIME ;
         GXv_char1[0] = GXt_char2 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( AV9P_EXEC_DATETIME, "YYYYMMDDHHMISS", GXv_char1) ;
         b702_pc03_ref_crf_value.this.GXt_char2 = GXv_char1[0] ;
         AV23W_TBW01_DISP_DATETIME = GXt_char2 ;
         AV18W_FLG = "0" ;
         /* Using cursor P005P3 */
         pr_default.execute(1, new Object[] {AV19W_SESSION.getId(), AV23W_TBW01_DISP_DATETIME, new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV12P_TBM32_REF_CRF_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A940TBW14_CRF_EDA_NO = P005P3_A940TBW14_CRF_EDA_NO[0] ;
            A196TBW14_CRF_ID = P005P3_A196TBW14_CRF_ID[0] ;
            A195TBW14_SUBJECT_ID = P005P3_A195TBW14_SUBJECT_ID[0] ;
            A194TBW14_STUDY_ID = P005P3_A194TBW14_STUDY_ID[0] ;
            A193TBW14_DISP_DATETIME = P005P3_A193TBW14_DISP_DATETIME[0] ;
            A192TBW14_SESSION_ID = P005P3_A192TBW14_SESSION_ID[0] ;
            A890TBW14_SDT_SAVE = P005P3_A890TBW14_SDT_SAVE[0] ;
            n890TBW14_SDT_SAVE = P005P3_n890TBW14_SDT_SAVE[0] ;
            A197TBW14_CRF_LATEST_VERSION = P005P3_A197TBW14_CRF_LATEST_VERSION[0] ;
            AV16W_B792_SD01_CRF.fromxml(A890TBW14_SDT_SAVE, "");
            AV30GXV2 = 1 ;
            while ( AV30GXV2 <= AV16W_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
            {
               AV17W_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV16W_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV30GXV2));
               if ( GXutil.strcmp(AV17W_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), AV13P_TBM32_REF_CRF_ITEM_CD) == 0 )
               {
                  AV22W_TBT12_CRF_VALUE = AV17W_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
                  AV18W_FLG = "1" ;
                  if (true) break;
               }
               AV30GXV2 = (int)(AV30GXV2+1) ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.strcmp(AV18W_FLG, "0") == 0 )
         {
            /* Using cursor P005P4 */
            pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV13P_TBM32_REF_CRF_ITEM_CD});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A100TBT12_CRF_ITEM_GRP_CD = P005P4_A100TBT12_CRF_ITEM_GRP_CD[0] ;
               A937TBT12_CRF_EDA_NO = P005P4_A937TBT12_CRF_EDA_NO[0] ;
               A98TBT12_CRF_ID = P005P4_A98TBT12_CRF_ID[0] ;
               A97TBT12_SUBJECT_ID = P005P4_A97TBT12_SUBJECT_ID[0] ;
               A96TBT12_STUDY_ID = P005P4_A96TBT12_STUDY_ID[0] ;
               A465TBT12_CRF_VALUE = P005P4_A465TBT12_CRF_VALUE[0] ;
               n465TBT12_CRF_VALUE = P005P4_n465TBT12_CRF_VALUE[0] ;
               A99TBT12_CRF_ITEM_GRP_DIV = P005P4_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
               AV22W_TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_RADIO_TEXT_GET' Routine */
      /* Using cursor P005P5 */
      pr_default.execute(3, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV21W_TBM32_CRF_ITEM_GRP_CD, AV22W_TBT12_CRF_VALUE});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A522TBM32_CHK_TRUE_INNER_VALUE = P005P5_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P005P5_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P005P5_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P005P5_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A71TBM32_CRF_ID = P005P5_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P005P5_A70TBM32_STUDY_ID[0] ;
         A524TBM32_TEXT = P005P5_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P005P5_n524TBM32_TEXT[0] ;
         A72TBM32_CRF_ITEM_CD = P005P5_A72TBM32_CRF_ITEM_CD[0] ;
         AV24W_TBM32_TEXT = A524TBM32_TEXT ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   protected void cleanup( )
   {
      this.aP6[0] = b702_pc03_ref_crf_value.this.AV8P_CRF_VALUE;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8P_CRF_VALUE = "" ;
      scmdbuf = "" ;
      P005P2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005P2_A71TBM32_CRF_ID = new short[1] ;
      P005P2_A70TBM32_STUDY_ID = new long[1] ;
      P005P2_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005P2_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005P2_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P005P2_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P005P2_A525TBM32_LIST_CD = new String[] {""} ;
      P005P2_n525TBM32_LIST_CD = new boolean[] {false} ;
      P005P2_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005P2_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      AV22W_TBT12_CRF_VALUE = "" ;
      AV20W_TBM26_LIST_ITEM_NAME = "" ;
      AV21W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV24W_TBM32_TEXT = "" ;
      AV15SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV23W_TBW01_DISP_DATETIME = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String [1] ;
      AV18W_FLG = "" ;
      AV19W_SESSION = httpContext.getWebSession();
      P005P3_A940TBW14_CRF_EDA_NO = new byte[1] ;
      P005P3_A196TBW14_CRF_ID = new short[1] ;
      P005P3_A195TBW14_SUBJECT_ID = new int[1] ;
      P005P3_A194TBW14_STUDY_ID = new long[1] ;
      P005P3_A193TBW14_DISP_DATETIME = new String[] {""} ;
      P005P3_A192TBW14_SESSION_ID = new String[] {""} ;
      P005P3_A890TBW14_SDT_SAVE = new String[] {""} ;
      P005P3_n890TBW14_SDT_SAVE = new boolean[] {false} ;
      P005P3_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      A193TBW14_DISP_DATETIME = "" ;
      A192TBW14_SESSION_ID = "" ;
      A890TBW14_SDT_SAVE = "" ;
      AV16W_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV17W_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      P005P4_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005P4_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P005P4_A98TBT12_CRF_ID = new short[1] ;
      P005P4_A97TBT12_SUBJECT_ID = new int[1] ;
      P005P4_A96TBT12_STUDY_ID = new long[1] ;
      P005P4_A465TBT12_CRF_VALUE = new String[] {""} ;
      P005P4_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P005P4_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      P005P5_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P005P5_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P005P5_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005P5_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005P5_A71TBM32_CRF_ID = new short[1] ;
      P005P5_A70TBM32_STUDY_ID = new long[1] ;
      P005P5_A524TBM32_TEXT = new String[] {""} ;
      P005P5_n524TBM32_TEXT = new boolean[] {false} ;
      P005P5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A524TBM32_TEXT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b702_pc03_ref_crf_value__default(),
         new Object[] {
             new Object[] {
            P005P2_A72TBM32_CRF_ITEM_CD, P005P2_A71TBM32_CRF_ID, P005P2_A70TBM32_STUDY_ID, P005P2_A74TBM32_CRF_ITEM_DIV, P005P2_n74TBM32_CRF_ITEM_DIV, P005P2_A527TBM32_FIXED_VALUE, P005P2_n527TBM32_FIXED_VALUE, P005P2_A525TBM32_LIST_CD, P005P2_n525TBM32_LIST_CD, P005P2_A73TBM32_CRF_ITEM_GRP_CD,
            P005P2_n73TBM32_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P005P3_A940TBW14_CRF_EDA_NO, P005P3_A196TBW14_CRF_ID, P005P3_A195TBW14_SUBJECT_ID, P005P3_A194TBW14_STUDY_ID, P005P3_A193TBW14_DISP_DATETIME, P005P3_A192TBW14_SESSION_ID, P005P3_A890TBW14_SDT_SAVE, P005P3_n890TBW14_SDT_SAVE, P005P3_A197TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            P005P4_A100TBT12_CRF_ITEM_GRP_CD, P005P4_A937TBT12_CRF_EDA_NO, P005P4_A98TBT12_CRF_ID, P005P4_A97TBT12_SUBJECT_ID, P005P4_A96TBT12_STUDY_ID, P005P4_A465TBT12_CRF_VALUE, P005P4_n465TBT12_CRF_VALUE, P005P4_A99TBT12_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P005P5_A522TBM32_CHK_TRUE_INNER_VALUE, P005P5_n522TBM32_CHK_TRUE_INNER_VALUE, P005P5_A73TBM32_CRF_ITEM_GRP_CD, P005P5_n73TBM32_CRF_ITEM_GRP_CD, P005P5_A71TBM32_CRF_ID, P005P5_A70TBM32_STUDY_ID, P005P5_A524TBM32_TEXT, P005P5_n524TBM32_TEXT, P005P5_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A940TBW14_CRF_EDA_NO ;
   private byte A937TBT12_CRF_EDA_NO ;
   private short AV12P_TBM32_REF_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short A196TBW14_CRF_ID ;
   private short A197TBW14_CRF_LATEST_VERSION ;
   private short A98TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV11P_SUBJECT_ID ;
   private int AV28GXV1 ;
   private int A195TBW14_SUBJECT_ID ;
   private int AV30GXV2 ;
   private int A97TBT12_SUBJECT_ID ;
   private long AV10P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A194TBW14_STUDY_ID ;
   private long A96TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private java.util.Date AV9P_EXEC_DATETIME ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean returnInSub ;
   private boolean n890TBW14_SDT_SAVE ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n524TBM32_TEXT ;
   private String A890TBW14_SDT_SAVE ;
   private String AV13P_TBM32_REF_CRF_ITEM_CD ;
   private String AV8P_CRF_VALUE ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String AV22W_TBT12_CRF_VALUE ;
   private String AV20W_TBM26_LIST_ITEM_NAME ;
   private String AV21W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV24W_TBM32_TEXT ;
   private String AV23W_TBW01_DISP_DATETIME ;
   private String AV18W_FLG ;
   private String A193TBW14_DISP_DATETIME ;
   private String A192TBW14_SESSION_ID ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A524TBM32_TEXT ;
   private com.genexus.webpanels.WebSession AV19W_SESSION ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P005P2_A72TBM32_CRF_ITEM_CD ;
   private short[] P005P2_A71TBM32_CRF_ID ;
   private long[] P005P2_A70TBM32_STUDY_ID ;
   private String[] P005P2_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P005P2_n74TBM32_CRF_ITEM_DIV ;
   private String[] P005P2_A527TBM32_FIXED_VALUE ;
   private boolean[] P005P2_n527TBM32_FIXED_VALUE ;
   private String[] P005P2_A525TBM32_LIST_CD ;
   private boolean[] P005P2_n525TBM32_LIST_CD ;
   private String[] P005P2_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005P2_n73TBM32_CRF_ITEM_GRP_CD ;
   private byte[] P005P3_A940TBW14_CRF_EDA_NO ;
   private short[] P005P3_A196TBW14_CRF_ID ;
   private int[] P005P3_A195TBW14_SUBJECT_ID ;
   private long[] P005P3_A194TBW14_STUDY_ID ;
   private String[] P005P3_A193TBW14_DISP_DATETIME ;
   private String[] P005P3_A192TBW14_SESSION_ID ;
   private String[] P005P3_A890TBW14_SDT_SAVE ;
   private boolean[] P005P3_n890TBW14_SDT_SAVE ;
   private short[] P005P3_A197TBW14_CRF_LATEST_VERSION ;
   private String[] P005P4_A100TBT12_CRF_ITEM_GRP_CD ;
   private byte[] P005P4_A937TBT12_CRF_EDA_NO ;
   private short[] P005P4_A98TBT12_CRF_ID ;
   private int[] P005P4_A97TBT12_SUBJECT_ID ;
   private long[] P005P4_A96TBT12_STUDY_ID ;
   private String[] P005P4_A465TBT12_CRF_VALUE ;
   private boolean[] P005P4_n465TBT12_CRF_VALUE ;
   private String[] P005P4_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P005P5_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P005P5_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P005P5_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005P5_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P005P5_A71TBM32_CRF_ID ;
   private long[] P005P5_A70TBM32_STUDY_ID ;
   private String[] P005P5_A524TBM32_TEXT ;
   private boolean[] P005P5_n524TBM32_TEXT ;
   private String[] P005P5_A72TBM32_CRF_ITEM_CD ;
   private SdtB792_SD01_CRF AV14SD_B792_SD01_CRF ;
   private SdtB792_SD01_CRF AV16W_B792_SD01_CRF ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV15SD_B792_SD02_CRF_RESULT_I ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV17W_B792_SD02_CRF_RESULT_I ;
}

final  class b702_pc03_ref_crf_value__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005P2", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_DIV`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_CRF_ITEM_GRP_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005P3", "SELECT `TBW14_CRF_EDA_NO`, `TBW14_CRF_ID`, `TBW14_SUBJECT_ID`, `TBW14_STUDY_ID`, `TBW14_DISP_DATETIME`, `TBW14_SESSION_ID`, `TBW14_SDT_SAVE`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_STUDY_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_CRF_ID` = ? and `TBW14_CRF_EDA_NO` = 1 ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005P4", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = 1) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005P5", "SELECT `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_TEXT`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_GRP_CD` = ?) AND (`TBM32_CHK_TRUE_INNER_VALUE` = ?) ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_GRP_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getLongVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(3) ;
               ((long[]) buf[5])[0] = rslt.getLong(4) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 14);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 50);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               stmt.setVarchar(4, (String)parms[3], 2000);
               return;
      }
   }

}

