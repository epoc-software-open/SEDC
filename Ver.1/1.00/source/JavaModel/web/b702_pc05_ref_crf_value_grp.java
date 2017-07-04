/*
               File: B702_PC05_REF_CRF_VALUE_GRP
        Description: 参照CRF項目値グループ取得処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:6.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc05_ref_crf_value_grp extends GXProcedure
{
   public b702_pc05_ref_crf_value_grp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc05_ref_crf_value_grp.class ), "" );
   }

   public b702_pc05_ref_crf_value_grp( int remoteHandle ,
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
      b702_pc05_ref_crf_value_grp.this.AV10P_STUDY_ID = aP0;
      b702_pc05_ref_crf_value_grp.this.AV11P_SUBJECT_ID = aP1;
      b702_pc05_ref_crf_value_grp.this.AV13P_TBM32_REF_CRF_ID = aP2;
      b702_pc05_ref_crf_value_grp.this.AV12P_TBM32_CRF_ITEM_GRP_CD = aP3;
      b702_pc05_ref_crf_value_grp.this.AV14SD_B792_SD01_CRF = aP4;
      b702_pc05_ref_crf_value_grp.this.AV9P_EXEC_DATETIME = aP5;
      b702_pc05_ref_crf_value_grp.this.aP6 = new String[] {""};
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
      b702_pc05_ref_crf_value_grp.this.AV10P_STUDY_ID = aP0;
      b702_pc05_ref_crf_value_grp.this.AV11P_SUBJECT_ID = aP1;
      b702_pc05_ref_crf_value_grp.this.AV13P_TBM32_REF_CRF_ID = aP2;
      b702_pc05_ref_crf_value_grp.this.AV12P_TBM32_CRF_ITEM_GRP_CD = aP3;
      b702_pc05_ref_crf_value_grp.this.AV14SD_B792_SD01_CRF = aP4;
      b702_pc05_ref_crf_value_grp.this.AV9P_EXEC_DATETIME = aP5;
      b702_pc05_ref_crf_value_grp.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8P_CRF_VALUE = "" ;
      /* Using cursor P005S2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV13P_TBM32_REF_CRF_ID), AV12P_TBM32_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A231TBM32_STUDY_ID = P005S2_A231TBM32_STUDY_ID[0] ;
         A232TBM32_CRF_ID = P005S2_A232TBM32_CRF_ID[0] ;
         A236TBM32_CRF_ITEM_GRP_CD = P005S2_A236TBM32_CRF_ITEM_GRP_CD[0] ;
         n236TBM32_CRF_ITEM_GRP_CD = P005S2_n236TBM32_CRF_ITEM_GRP_CD[0] ;
         A235TBM32_CRF_ITEM_DIV = P005S2_A235TBM32_CRF_ITEM_DIV[0] ;
         n235TBM32_CRF_ITEM_DIV = P005S2_n235TBM32_CRF_ITEM_DIV[0] ;
         A233TBM32_CRF_ITEM_CD = P005S2_A233TBM32_CRF_ITEM_CD[0] ;
         A402TBM32_LIST_CD = P005S2_A402TBM32_LIST_CD[0] ;
         n402TBM32_LIST_CD = P005S2_n402TBM32_LIST_CD[0] ;
         A401TBM32_TEXT = P005S2_A401TBM32_TEXT[0] ;
         n401TBM32_TEXT = P005S2_n401TBM32_TEXT[0] ;
         A386TBM32_LOCATION_Y = P005S2_A386TBM32_LOCATION_Y[0] ;
         n386TBM32_LOCATION_Y = P005S2_n386TBM32_LOCATION_Y[0] ;
         A385TBM32_LOCATION_X = P005S2_A385TBM32_LOCATION_X[0] ;
         n385TBM32_LOCATION_X = P005S2_n385TBM32_LOCATION_X[0] ;
         if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "SelectBox") == 0 )
         {
            AV22W_TBM32_REF_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S1167 */
            S1167 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char1[0] = AV25W_TBM26_LIST_ITEM_NAME ;
            new b799_pc10_sel_list_item_get(remoteHandle, context).execute( AV10P_STUDY_ID, A402TBM32_LIST_CD, AV23W_TBT12_CRF_VALUE, GXv_char1) ;
            b702_pc05_ref_crf_value_grp.this.AV25W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + AV25W_TBM26_LIST_ITEM_NAME ;
         }
         else if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "CheckBox") == 0 )
         {
            AV22W_TBM32_REF_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S1167 */
            S1167 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ! (GXutil.strcmp("", AV23W_TBT12_CRF_VALUE)==0) )
            {
               AV8P_CRF_VALUE = AV8P_CRF_VALUE + A401TBM32_TEXT ;
            }
         }
         else if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Group") == 0 )
         {
         }
         else if ( GXutil.strcmp(A235TBM32_CRF_ITEM_DIV, "Label") == 0 )
         {
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + A401TBM32_TEXT ;
         }
         else
         {
            AV22W_TBM32_REF_CRF_ITEM_CD = A233TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S1167 */
            S1167 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + AV23W_TBT12_CRF_VALUE ;
         }
         AV8P_CRF_VALUE = AV8P_CRF_VALUE + " " ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S1167( )
   {
      /* 'SUB_CRF_VALUE_GET' Routine */
      AV23W_TBT12_CRF_VALUE = "" ;
      if ( AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() == AV13P_TBM32_REF_CRF_ID )
      {
         AV29GXV1 = 1 ;
         while ( AV29GXV1 <= AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
         {
            AV15SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV29GXV1));
            if ( GXutil.strcmp(AV15SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), AV22W_TBM32_REF_CRF_ITEM_CD) == 0 )
            {
               AV23W_TBT12_CRF_VALUE = AV15SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
               if (true) break;
            }
            AV29GXV1 = (int)(AV29GXV1+1) ;
         }
      }
      else
      {
         GXt_char2 = AV24W_TBW01_DISP_DATETIME ;
         GXv_char1[0] = GXt_char2 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( AV9P_EXEC_DATETIME, "YYYYMMDDHHMISS", GXv_char1) ;
         b702_pc05_ref_crf_value_grp.this.GXt_char2 = GXv_char1[0] ;
         AV24W_TBW01_DISP_DATETIME = GXt_char2 ;
         AV18W_FLG = "0" ;
         /* Using cursor P005S3 */
         pr_default.execute(1, new Object[] {AV19W_SESSION.getId(), AV24W_TBW01_DISP_DATETIME, new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV13P_TBM32_REF_CRF_ID)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A880TBW14_CRF_ID = P005S3_A880TBW14_CRF_ID[0] ;
            A883TBW14_SUBJECT_ID = P005S3_A883TBW14_SUBJECT_ID[0] ;
            A878TBW14_STUDY_ID = P005S3_A878TBW14_STUDY_ID[0] ;
            A876TBW14_DISP_DATETIME = P005S3_A876TBW14_DISP_DATETIME[0] ;
            A875TBW14_SESSION_ID = P005S3_A875TBW14_SESSION_ID[0] ;
            A882TBW14_SDT_SAVE = P005S3_A882TBW14_SDT_SAVE[0] ;
            n882TBW14_SDT_SAVE = P005S3_n882TBW14_SDT_SAVE[0] ;
            A881TBW14_CRF_LATEST_VERSION = P005S3_A881TBW14_CRF_LATEST_VERSION[0] ;
            AV16W_B792_SD01_CRF.fromxml(A882TBW14_SDT_SAVE, "");
            AV31GXV2 = 1 ;
            while ( AV31GXV2 <= AV16W_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
            {
               AV17W_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV16W_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV31GXV2));
               if ( GXutil.strcmp(AV17W_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), AV22W_TBM32_REF_CRF_ITEM_CD) == 0 )
               {
                  AV23W_TBT12_CRF_VALUE = AV17W_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value() ;
                  AV18W_FLG = "1" ;
                  if (true) break;
               }
               AV31GXV2 = (int)(AV31GXV2+1) ;
            }
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( GXutil.strcmp(AV18W_FLG, "0") == 0 )
         {
            /* Using cursor P005S4 */
            pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV13P_TBM32_REF_CRF_ID), AV22W_TBM32_REF_CRF_ITEM_CD});
            while ( (pr_default.getStatus(2) != 101) )
            {
               A319TBT12_CRF_ITEM_GRP_CD = P005S4_A319TBT12_CRF_ITEM_GRP_CD[0] ;
               A317TBT12_CRF_ID = P005S4_A317TBT12_CRF_ID[0] ;
               A316TBT12_SUBJECT_ID = P005S4_A316TBT12_SUBJECT_ID[0] ;
               A315TBT12_STUDY_ID = P005S4_A315TBT12_STUDY_ID[0] ;
               A320TBT12_CRF_VALUE = P005S4_A320TBT12_CRF_VALUE[0] ;
               n320TBT12_CRF_VALUE = P005S4_n320TBT12_CRF_VALUE[0] ;
               A318TBT12_CRF_ITEM_GRP_DIV = P005S4_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
               AV23W_TBT12_CRF_VALUE = A320TBT12_CRF_VALUE ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(2);
            }
            pr_default.close(2);
         }
      }
   }

   protected void cleanup( )
   {
      this.aP6[0] = b702_pc05_ref_crf_value_grp.this.AV8P_CRF_VALUE;
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
      P005S2_A231TBM32_STUDY_ID = new long[1] ;
      P005S2_A232TBM32_CRF_ID = new short[1] ;
      P005S2_A236TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005S2_n236TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P005S2_A235TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P005S2_n235TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P005S2_A233TBM32_CRF_ITEM_CD = new String[] {""} ;
      P005S2_A402TBM32_LIST_CD = new String[] {""} ;
      P005S2_n402TBM32_LIST_CD = new boolean[] {false} ;
      P005S2_A401TBM32_TEXT = new String[] {""} ;
      P005S2_n401TBM32_TEXT = new boolean[] {false} ;
      P005S2_A386TBM32_LOCATION_Y = new short[1] ;
      P005S2_n386TBM32_LOCATION_Y = new boolean[] {false} ;
      P005S2_A385TBM32_LOCATION_X = new short[1] ;
      P005S2_n385TBM32_LOCATION_X = new boolean[] {false} ;
      A236TBM32_CRF_ITEM_GRP_CD = "" ;
      A235TBM32_CRF_ITEM_DIV = "" ;
      A233TBM32_CRF_ITEM_CD = "" ;
      A402TBM32_LIST_CD = "" ;
      A401TBM32_TEXT = "" ;
      AV22W_TBM32_REF_CRF_ITEM_CD = "" ;
      AV23W_TBT12_CRF_VALUE = "" ;
      AV25W_TBM26_LIST_ITEM_NAME = "" ;
      AV15SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV24W_TBW01_DISP_DATETIME = "" ;
      GXt_char2 = "" ;
      GXv_char1 = new String [1] ;
      AV18W_FLG = "" ;
      AV19W_SESSION = httpContext.getWebSession();
      P005S3_A880TBW14_CRF_ID = new short[1] ;
      P005S3_A883TBW14_SUBJECT_ID = new int[1] ;
      P005S3_A878TBW14_STUDY_ID = new long[1] ;
      P005S3_A876TBW14_DISP_DATETIME = new String[] {""} ;
      P005S3_A875TBW14_SESSION_ID = new String[] {""} ;
      P005S3_A882TBW14_SDT_SAVE = new String[] {""} ;
      P005S3_n882TBW14_SDT_SAVE = new boolean[] {false} ;
      P005S3_A881TBW14_CRF_LATEST_VERSION = new short[1] ;
      A876TBW14_DISP_DATETIME = "" ;
      A875TBW14_SESSION_ID = "" ;
      A882TBW14_SDT_SAVE = "" ;
      AV16W_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      AV17W_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      P005S4_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005S4_A317TBT12_CRF_ID = new short[1] ;
      P005S4_A316TBT12_SUBJECT_ID = new int[1] ;
      P005S4_A315TBT12_STUDY_ID = new long[1] ;
      P005S4_A320TBT12_CRF_VALUE = new String[] {""} ;
      P005S4_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P005S4_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b702_pc05_ref_crf_value_grp__default(),
         new Object[] {
             new Object[] {
            P005S2_A231TBM32_STUDY_ID, P005S2_A232TBM32_CRF_ID, P005S2_A236TBM32_CRF_ITEM_GRP_CD, P005S2_n236TBM32_CRF_ITEM_GRP_CD, P005S2_A235TBM32_CRF_ITEM_DIV, P005S2_n235TBM32_CRF_ITEM_DIV, P005S2_A233TBM32_CRF_ITEM_CD, P005S2_A402TBM32_LIST_CD, P005S2_n402TBM32_LIST_CD, P005S2_A401TBM32_TEXT,
            P005S2_n401TBM32_TEXT, P005S2_A386TBM32_LOCATION_Y, P005S2_n386TBM32_LOCATION_Y, P005S2_A385TBM32_LOCATION_X, P005S2_n385TBM32_LOCATION_X
            }
            , new Object[] {
            P005S3_A880TBW14_CRF_ID, P005S3_A883TBW14_SUBJECT_ID, P005S3_A878TBW14_STUDY_ID, P005S3_A876TBW14_DISP_DATETIME, P005S3_A875TBW14_SESSION_ID, P005S3_A882TBW14_SDT_SAVE, P005S3_n882TBW14_SDT_SAVE, P005S3_A881TBW14_CRF_LATEST_VERSION
            }
            , new Object[] {
            P005S4_A319TBT12_CRF_ITEM_GRP_CD, P005S4_A317TBT12_CRF_ID, P005S4_A316TBT12_SUBJECT_ID, P005S4_A315TBT12_STUDY_ID, P005S4_A320TBT12_CRF_VALUE, P005S4_n320TBT12_CRF_VALUE, P005S4_A318TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13P_TBM32_REF_CRF_ID ;
   private short A232TBM32_CRF_ID ;
   private short A386TBM32_LOCATION_Y ;
   private short A385TBM32_LOCATION_X ;
   private short A880TBW14_CRF_ID ;
   private short A881TBW14_CRF_LATEST_VERSION ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV11P_SUBJECT_ID ;
   private int AV29GXV1 ;
   private int A883TBW14_SUBJECT_ID ;
   private int AV31GXV2 ;
   private int A316TBT12_SUBJECT_ID ;
   private long AV10P_STUDY_ID ;
   private long A231TBM32_STUDY_ID ;
   private long A878TBW14_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char2 ;
   private String GXv_char1[] ;
   private java.util.Date AV9P_EXEC_DATETIME ;
   private boolean n236TBM32_CRF_ITEM_GRP_CD ;
   private boolean n235TBM32_CRF_ITEM_DIV ;
   private boolean n402TBM32_LIST_CD ;
   private boolean n401TBM32_TEXT ;
   private boolean n386TBM32_LOCATION_Y ;
   private boolean n385TBM32_LOCATION_X ;
   private boolean returnInSub ;
   private boolean n882TBW14_SDT_SAVE ;
   private boolean n320TBT12_CRF_VALUE ;
   private String A882TBW14_SDT_SAVE ;
   private String AV12P_TBM32_CRF_ITEM_GRP_CD ;
   private String AV8P_CRF_VALUE ;
   private String A236TBM32_CRF_ITEM_GRP_CD ;
   private String A235TBM32_CRF_ITEM_DIV ;
   private String A233TBM32_CRF_ITEM_CD ;
   private String A402TBM32_LIST_CD ;
   private String A401TBM32_TEXT ;
   private String AV22W_TBM32_REF_CRF_ITEM_CD ;
   private String AV23W_TBT12_CRF_VALUE ;
   private String AV25W_TBM26_LIST_ITEM_NAME ;
   private String AV24W_TBW01_DISP_DATETIME ;
   private String AV18W_FLG ;
   private String A876TBW14_DISP_DATETIME ;
   private String A875TBW14_SESSION_ID ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private com.genexus.webpanels.WebSession AV19W_SESSION ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private long[] P005S2_A231TBM32_STUDY_ID ;
   private short[] P005S2_A232TBM32_CRF_ID ;
   private String[] P005S2_A236TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P005S2_n236TBM32_CRF_ITEM_GRP_CD ;
   private String[] P005S2_A235TBM32_CRF_ITEM_DIV ;
   private boolean[] P005S2_n235TBM32_CRF_ITEM_DIV ;
   private String[] P005S2_A233TBM32_CRF_ITEM_CD ;
   private String[] P005S2_A402TBM32_LIST_CD ;
   private boolean[] P005S2_n402TBM32_LIST_CD ;
   private String[] P005S2_A401TBM32_TEXT ;
   private boolean[] P005S2_n401TBM32_TEXT ;
   private short[] P005S2_A386TBM32_LOCATION_Y ;
   private boolean[] P005S2_n386TBM32_LOCATION_Y ;
   private short[] P005S2_A385TBM32_LOCATION_X ;
   private boolean[] P005S2_n385TBM32_LOCATION_X ;
   private short[] P005S3_A880TBW14_CRF_ID ;
   private int[] P005S3_A883TBW14_SUBJECT_ID ;
   private long[] P005S3_A878TBW14_STUDY_ID ;
   private String[] P005S3_A876TBW14_DISP_DATETIME ;
   private String[] P005S3_A875TBW14_SESSION_ID ;
   private String[] P005S3_A882TBW14_SDT_SAVE ;
   private boolean[] P005S3_n882TBW14_SDT_SAVE ;
   private short[] P005S3_A881TBW14_CRF_LATEST_VERSION ;
   private String[] P005S4_A319TBT12_CRF_ITEM_GRP_CD ;
   private short[] P005S4_A317TBT12_CRF_ID ;
   private int[] P005S4_A316TBT12_SUBJECT_ID ;
   private long[] P005S4_A315TBT12_STUDY_ID ;
   private String[] P005S4_A320TBT12_CRF_VALUE ;
   private boolean[] P005S4_n320TBT12_CRF_VALUE ;
   private String[] P005S4_A318TBT12_CRF_ITEM_GRP_DIV ;
   private SdtB792_SD01_CRF AV14SD_B792_SD01_CRF ;
   private SdtB792_SD01_CRF AV16W_B792_SD01_CRF ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV15SD_B792_SD02_CRF_RESULT_I ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV17W_B792_SD02_CRF_RESULT_I ;
}

final  class b702_pc05_ref_crf_value_grp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005S2", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_CD`, `TBM32_LIST_CD`, `TBM32_TEXT`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ?) AND (`TBM32_CRF_ID` = ?) AND (`TBM32_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBM32_LOCATION_X`, `TBM32_LOCATION_Y` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P005S3", "SELECT `TBW14_CRF_ID`, `TBW14_SUBJECT_ID`, `TBW14_STUDY_ID`, `TBW14_DISP_DATETIME`, `TBW14_SESSION_ID`, `TBW14_SDT_SAVE`, `TBW14_CRF_LATEST_VERSION` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_STUDY_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_CRF_ID` = ? ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005S4", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               break;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[5])[0] = rslt.getLongVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(7) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               break;
            case 1 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 14);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 50);
               break;
      }
   }

}

