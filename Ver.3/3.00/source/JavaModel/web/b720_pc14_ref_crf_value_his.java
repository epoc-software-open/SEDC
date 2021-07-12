/*
               File: B720_PC14_REF_CRF_VALUE_HIS
        Description: éQè∆CRFçÄñ⁄íléÊìæèàóù_óöó
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:20.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc14_ref_crf_value_his extends GXProcedure
{
   public b720_pc14_ref_crf_value_his( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc14_ref_crf_value_his.class ), "" );
   }

   public b720_pc14_ref_crf_value_his( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             long aP1 ,
                             int aP2 ,
                             short aP3 ,
                             String aP4 )
   {
      b720_pc14_ref_crf_value_his.this.AV9P_CRF_VERSION = aP0;
      b720_pc14_ref_crf_value_his.this.AV10P_STUDY_ID = aP1;
      b720_pc14_ref_crf_value_his.this.AV11P_SUBJECT_ID = aP2;
      b720_pc14_ref_crf_value_his.this.AV12P_TBM32_REF_CRF_ID = aP3;
      b720_pc14_ref_crf_value_his.this.AV13P_TBM32_REF_CRF_ITEM_CD = aP4;
      b720_pc14_ref_crf_value_his.this.aP5 = aP5;
      b720_pc14_ref_crf_value_his.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( short aP0 ,
                        long aP1 ,
                        int aP2 ,
                        short aP3 ,
                        String aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( short aP0 ,
                             long aP1 ,
                             int aP2 ,
                             short aP3 ,
                             String aP4 ,
                             String[] aP5 )
   {
      b720_pc14_ref_crf_value_his.this.AV9P_CRF_VERSION = aP0;
      b720_pc14_ref_crf_value_his.this.AV10P_STUDY_ID = aP1;
      b720_pc14_ref_crf_value_his.this.AV11P_SUBJECT_ID = aP2;
      b720_pc14_ref_crf_value_his.this.AV12P_TBM32_REF_CRF_ID = aP3;
      b720_pc14_ref_crf_value_his.this.AV13P_TBM32_REF_CRF_ITEM_CD = aP4;
      b720_pc14_ref_crf_value_his.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8P_CRF_VALUE = "" ;
      /* Using cursor P007M2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV13P_TBM32_REF_CRF_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A72TBM32_CRF_ITEM_CD = P007M2_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P007M2_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P007M2_A70TBM32_STUDY_ID[0] ;
         A74TBM32_CRF_ITEM_DIV = P007M2_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P007M2_n74TBM32_CRF_ITEM_DIV[0] ;
         A527TBM32_FIXED_VALUE = P007M2_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P007M2_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P007M2_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P007M2_n525TBM32_LIST_CD[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P007M2_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P007M2_n73TBM32_CRF_ITEM_GRP_CD[0] ;
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
               GXv_char1[0] = AV16W_TBM26_LIST_ITEM_NAME ;
               new b799_pc10_sel_list_item_get(remoteHandle, context).execute( AV10P_STUDY_ID, A525TBM32_LIST_CD, AV14W_CRF_VALUE, GXv_char1) ;
               b720_pc14_ref_crf_value_his.this.AV16W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
               AV8P_CRF_VALUE = AV16W_TBM26_LIST_ITEM_NAME ;
            }
            else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") == 0 )
            {
               AV17W_TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
               /* Execute user subroutine: S121 */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ! (GXutil.strcmp("", AV18W_TBM32_TEXT)==0) )
               {
                  AV8P_CRF_VALUE = AV18W_TBM32_TEXT ;
               }
               else
               {
                  GXv_char1[0] = AV14W_CRF_VALUE ;
                  new b720_pc15_ref_crf_value_his(remoteHandle, context).execute( AV9P_CRF_VERSION, AV10P_STUDY_ID, AV11P_SUBJECT_ID, AV12P_TBM32_REF_CRF_ID, A73TBM32_CRF_ITEM_GRP_CD, GXv_char1) ;
                  b720_pc14_ref_crf_value_his.this.AV14W_CRF_VALUE = GXv_char1[0] ;
                  AV8P_CRF_VALUE = AV14W_CRF_VALUE ;
               }
            }
            else
            {
               AV8P_CRF_VALUE = AV14W_CRF_VALUE ;
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
      AV14W_CRF_VALUE = "" ;
      if ( GXutil.strcmp(AV15W_FLG, "0") == 0 )
      {
         /* Using cursor P007M3 */
         pr_default.execute(1, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV12P_TBM32_REF_CRF_ID), new Short(AV9P_CRF_VERSION), AV13P_TBM32_REF_CRF_ITEM_CD});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A106TBT13_CRF_ITEM_GRP_CD = P007M3_A106TBT13_CRF_ITEM_GRP_CD[0] ;
            A104TBT13_CRF_VERSION = P007M3_A104TBT13_CRF_VERSION[0] ;
            A938TBT13_CRF_EDA_NO = P007M3_A938TBT13_CRF_EDA_NO[0] ;
            A103TBT13_CRF_ID = P007M3_A103TBT13_CRF_ID[0] ;
            A102TBT13_SUBJECT_ID = P007M3_A102TBT13_SUBJECT_ID[0] ;
            A101TBT13_STUDY_ID = P007M3_A101TBT13_STUDY_ID[0] ;
            A597TBT13_CRF_VALUE = P007M3_A597TBT13_CRF_VALUE[0] ;
            n597TBT13_CRF_VALUE = P007M3_n597TBT13_CRF_VALUE[0] ;
            A105TBT13_CRF_ITEM_GRP_DIV = P007M3_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
            AV14W_CRF_VALUE = A597TBT13_CRF_VALUE ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
   }

   public void S121( )
   {
      /* 'SUB_RADIO_TEXT_GET' Routine */
      /* Using cursor P007M4 */
      pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV17W_TBM32_CRF_ITEM_GRP_CD, AV14W_CRF_VALUE});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A522TBM32_CHK_TRUE_INNER_VALUE = P007M4_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P007M4_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P007M4_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P007M4_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A71TBM32_CRF_ID = P007M4_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P007M4_A70TBM32_STUDY_ID[0] ;
         A524TBM32_TEXT = P007M4_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P007M4_n524TBM32_TEXT[0] ;
         A72TBM32_CRF_ITEM_CD = P007M4_A72TBM32_CRF_ITEM_CD[0] ;
         AV18W_TBM32_TEXT = A524TBM32_TEXT ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP5[0] = b720_pc14_ref_crf_value_his.this.AV8P_CRF_VALUE;
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
      P007M2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P007M2_A71TBM32_CRF_ID = new short[1] ;
      P007M2_A70TBM32_STUDY_ID = new long[1] ;
      P007M2_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P007M2_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P007M2_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P007M2_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P007M2_A525TBM32_LIST_CD = new String[] {""} ;
      P007M2_n525TBM32_LIST_CD = new boolean[] {false} ;
      P007M2_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007M2_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      AV14W_CRF_VALUE = "" ;
      AV16W_TBM26_LIST_ITEM_NAME = "" ;
      AV17W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV18W_TBM32_TEXT = "" ;
      GXv_char1 = new String [1] ;
      AV15W_FLG = "" ;
      P007M3_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007M3_A104TBT13_CRF_VERSION = new short[1] ;
      P007M3_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007M3_A103TBT13_CRF_ID = new short[1] ;
      P007M3_A102TBT13_SUBJECT_ID = new int[1] ;
      P007M3_A101TBT13_STUDY_ID = new long[1] ;
      P007M3_A597TBT13_CRF_VALUE = new String[] {""} ;
      P007M3_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P007M3_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      P007M4_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P007M4_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P007M4_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007M4_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P007M4_A71TBM32_CRF_ID = new short[1] ;
      P007M4_A70TBM32_STUDY_ID = new long[1] ;
      P007M4_A524TBM32_TEXT = new String[] {""} ;
      P007M4_n524TBM32_TEXT = new boolean[] {false} ;
      P007M4_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A524TBM32_TEXT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc14_ref_crf_value_his__default(),
         new Object[] {
             new Object[] {
            P007M2_A72TBM32_CRF_ITEM_CD, P007M2_A71TBM32_CRF_ID, P007M2_A70TBM32_STUDY_ID, P007M2_A74TBM32_CRF_ITEM_DIV, P007M2_n74TBM32_CRF_ITEM_DIV, P007M2_A527TBM32_FIXED_VALUE, P007M2_n527TBM32_FIXED_VALUE, P007M2_A525TBM32_LIST_CD, P007M2_n525TBM32_LIST_CD, P007M2_A73TBM32_CRF_ITEM_GRP_CD,
            P007M2_n73TBM32_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P007M3_A106TBT13_CRF_ITEM_GRP_CD, P007M3_A104TBT13_CRF_VERSION, P007M3_A938TBT13_CRF_EDA_NO, P007M3_A103TBT13_CRF_ID, P007M3_A102TBT13_SUBJECT_ID, P007M3_A101TBT13_STUDY_ID, P007M3_A597TBT13_CRF_VALUE, P007M3_n597TBT13_CRF_VALUE, P007M3_A105TBT13_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P007M4_A522TBM32_CHK_TRUE_INNER_VALUE, P007M4_n522TBM32_CHK_TRUE_INNER_VALUE, P007M4_A73TBM32_CRF_ITEM_GRP_CD, P007M4_n73TBM32_CRF_ITEM_GRP_CD, P007M4_A71TBM32_CRF_ID, P007M4_A70TBM32_STUDY_ID, P007M4_A524TBM32_TEXT, P007M4_n524TBM32_TEXT, P007M4_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A938TBT13_CRF_EDA_NO ;
   private short AV9P_CRF_VERSION ;
   private short AV12P_TBM32_REF_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short A103TBT13_CRF_ID ;
   private short Gx_err ;
   private int AV11P_SUBJECT_ID ;
   private int A102TBT13_SUBJECT_ID ;
   private long AV10P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean returnInSub ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n524TBM32_TEXT ;
   private String AV13P_TBM32_REF_CRF_ITEM_CD ;
   private String AV8P_CRF_VALUE ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String AV14W_CRF_VALUE ;
   private String AV16W_TBM26_LIST_ITEM_NAME ;
   private String AV17W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV18W_TBM32_TEXT ;
   private String AV15W_FLG ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A524TBM32_TEXT ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P007M2_A72TBM32_CRF_ITEM_CD ;
   private short[] P007M2_A71TBM32_CRF_ID ;
   private long[] P007M2_A70TBM32_STUDY_ID ;
   private String[] P007M2_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P007M2_n74TBM32_CRF_ITEM_DIV ;
   private String[] P007M2_A527TBM32_FIXED_VALUE ;
   private boolean[] P007M2_n527TBM32_FIXED_VALUE ;
   private String[] P007M2_A525TBM32_LIST_CD ;
   private boolean[] P007M2_n525TBM32_LIST_CD ;
   private String[] P007M2_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P007M2_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P007M3_A106TBT13_CRF_ITEM_GRP_CD ;
   private short[] P007M3_A104TBT13_CRF_VERSION ;
   private byte[] P007M3_A938TBT13_CRF_EDA_NO ;
   private short[] P007M3_A103TBT13_CRF_ID ;
   private int[] P007M3_A102TBT13_SUBJECT_ID ;
   private long[] P007M3_A101TBT13_STUDY_ID ;
   private String[] P007M3_A597TBT13_CRF_VALUE ;
   private boolean[] P007M3_n597TBT13_CRF_VALUE ;
   private String[] P007M3_A105TBT13_CRF_ITEM_GRP_DIV ;
   private String[] P007M4_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P007M4_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P007M4_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P007M4_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P007M4_A71TBM32_CRF_ID ;
   private long[] P007M4_A70TBM32_STUDY_ID ;
   private String[] P007M4_A524TBM32_TEXT ;
   private boolean[] P007M4_n524TBM32_TEXT ;
   private String[] P007M4_A72TBM32_CRF_ITEM_CD ;
}

final  class b720_pc14_ref_crf_value_his__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007M2", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_DIV`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_CRF_ITEM_GRP_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007M3", "SELECT `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VERSION`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_VALUE`, `TBT13_CRF_ITEM_GRP_DIV` FROM `TBT13_CRF_RES_HIS` WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = 1 and `TBT13_CRF_VERSION` = ?) AND (`TBT13_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007M4", "SELECT `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_TEXT`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_GRP_CD` = ?) AND (`TBM32_CHK_TRUE_INNER_VALUE` = ?) ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_GRP_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((byte[]) buf[2])[0] = rslt.getByte(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((long[]) buf[5])[0] = rslt.getLong(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               return;
            case 2 :
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setVarchar(5, (String)parms[4], 50);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               stmt.setVarchar(4, (String)parms[3], 2000);
               return;
      }
   }

}

