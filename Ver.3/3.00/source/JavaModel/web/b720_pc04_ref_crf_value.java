/*
               File: B720_PC04_REF_CRF_VALUE
        Description: éQè∆CRFçÄñ⁄íléÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:35.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc04_ref_crf_value extends GXProcedure
{
   public b720_pc04_ref_crf_value( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc04_ref_crf_value.class ), "" );
   }

   public b720_pc04_ref_crf_value( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 )
   {
      b720_pc04_ref_crf_value.this.AV9P_STUDY_ID = aP0;
      b720_pc04_ref_crf_value.this.AV10P_SUBJECT_ID = aP1;
      b720_pc04_ref_crf_value.this.AV11P_TBM32_REF_CRF_ID = aP2;
      b720_pc04_ref_crf_value.this.AV12P_TBM32_REF_CRF_ITEM_CD = aP3;
      b720_pc04_ref_crf_value.this.aP4 = aP4;
      b720_pc04_ref_crf_value.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      b720_pc04_ref_crf_value.this.AV9P_STUDY_ID = aP0;
      b720_pc04_ref_crf_value.this.AV10P_SUBJECT_ID = aP1;
      b720_pc04_ref_crf_value.this.AV11P_TBM32_REF_CRF_ID = aP2;
      b720_pc04_ref_crf_value.this.AV12P_TBM32_REF_CRF_ITEM_CD = aP3;
      b720_pc04_ref_crf_value.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8P_CRF_VALUE = "" ;
      /* Using cursor P00772 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV11P_TBM32_REF_CRF_ID), AV12P_TBM32_REF_CRF_ITEM_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A72TBM32_CRF_ITEM_CD = P00772_A72TBM32_CRF_ITEM_CD[0] ;
         A71TBM32_CRF_ID = P00772_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P00772_A70TBM32_STUDY_ID[0] ;
         A74TBM32_CRF_ITEM_DIV = P00772_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P00772_n74TBM32_CRF_ITEM_DIV[0] ;
         A527TBM32_FIXED_VALUE = P00772_A527TBM32_FIXED_VALUE[0] ;
         n527TBM32_FIXED_VALUE = P00772_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = P00772_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P00772_n525TBM32_LIST_CD[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P00772_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P00772_n73TBM32_CRF_ITEM_GRP_CD[0] ;
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
               GXv_char1[0] = AV14W_TBM26_LIST_ITEM_NAME ;
               new b799_pc10_sel_list_item_get(remoteHandle, context).execute( AV9P_STUDY_ID, A525TBM32_LIST_CD, AV17W_TBT12_CRF_VALUE, GXv_char1) ;
               b720_pc04_ref_crf_value.this.AV14W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
               AV8P_CRF_VALUE = AV14W_TBM26_LIST_ITEM_NAME ;
            }
            else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") == 0 )
            {
               AV15W_TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
               /* Execute user subroutine: S121 */
               S121 ();
               if ( returnInSub )
               {
                  pr_default.close(0);
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
               if ( ! (GXutil.strcmp("", AV16W_TBM32_TEXT)==0) )
               {
                  AV8P_CRF_VALUE = AV16W_TBM32_TEXT ;
               }
               else
               {
                  GXv_char1[0] = AV17W_TBT12_CRF_VALUE ;
                  new b720_pc05_ref_crf_value(remoteHandle, context).execute( AV9P_STUDY_ID, AV10P_SUBJECT_ID, AV11P_TBM32_REF_CRF_ID, A73TBM32_CRF_ITEM_GRP_CD, GXv_char1) ;
                  b720_pc04_ref_crf_value.this.AV17W_TBT12_CRF_VALUE = GXv_char1[0] ;
                  AV8P_CRF_VALUE = AV17W_TBT12_CRF_VALUE ;
               }
            }
            else
            {
               AV8P_CRF_VALUE = AV17W_TBT12_CRF_VALUE ;
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
      AV17W_TBT12_CRF_VALUE = "" ;
      if ( GXutil.strcmp(AV13W_FLG, "0") == 0 )
      {
         /* Using cursor P00773 */
         pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID), new Short(AV11P_TBM32_REF_CRF_ID), AV12P_TBM32_REF_CRF_ITEM_CD});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A100TBT12_CRF_ITEM_GRP_CD = P00773_A100TBT12_CRF_ITEM_GRP_CD[0] ;
            A937TBT12_CRF_EDA_NO = P00773_A937TBT12_CRF_EDA_NO[0] ;
            A98TBT12_CRF_ID = P00773_A98TBT12_CRF_ID[0] ;
            A97TBT12_SUBJECT_ID = P00773_A97TBT12_SUBJECT_ID[0] ;
            A96TBT12_STUDY_ID = P00773_A96TBT12_STUDY_ID[0] ;
            A465TBT12_CRF_VALUE = P00773_A465TBT12_CRF_VALUE[0] ;
            n465TBT12_CRF_VALUE = P00773_n465TBT12_CRF_VALUE[0] ;
            A99TBT12_CRF_ITEM_GRP_DIV = P00773_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
            AV17W_TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
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
      /* Using cursor P00774 */
      pr_default.execute(2, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV11P_TBM32_REF_CRF_ID), AV15W_TBM32_CRF_ITEM_GRP_CD, AV17W_TBT12_CRF_VALUE});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A522TBM32_CHK_TRUE_INNER_VALUE = P00774_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P00774_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P00774_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P00774_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A71TBM32_CRF_ID = P00774_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P00774_A70TBM32_STUDY_ID[0] ;
         A524TBM32_TEXT = P00774_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P00774_n524TBM32_TEXT[0] ;
         A72TBM32_CRF_ITEM_CD = P00774_A72TBM32_CRF_ITEM_CD[0] ;
         AV16W_TBM32_TEXT = A524TBM32_TEXT ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP4[0] = b720_pc04_ref_crf_value.this.AV8P_CRF_VALUE;
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
      P00772_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P00772_A71TBM32_CRF_ID = new short[1] ;
      P00772_A70TBM32_STUDY_ID = new long[1] ;
      P00772_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P00772_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P00772_A527TBM32_FIXED_VALUE = new String[] {""} ;
      P00772_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      P00772_A525TBM32_LIST_CD = new String[] {""} ;
      P00772_n525TBM32_LIST_CD = new boolean[] {false} ;
      P00772_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00772_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      A525TBM32_LIST_CD = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      AV17W_TBT12_CRF_VALUE = "" ;
      AV14W_TBM26_LIST_ITEM_NAME = "" ;
      AV15W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV16W_TBM32_TEXT = "" ;
      GXv_char1 = new String [1] ;
      AV13W_FLG = "" ;
      P00773_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00773_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P00773_A98TBT12_CRF_ID = new short[1] ;
      P00773_A97TBT12_SUBJECT_ID = new int[1] ;
      P00773_A96TBT12_STUDY_ID = new long[1] ;
      P00773_A465TBT12_CRF_VALUE = new String[] {""} ;
      P00773_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P00773_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      P00774_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P00774_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P00774_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00774_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P00774_A71TBM32_CRF_ID = new short[1] ;
      P00774_A70TBM32_STUDY_ID = new long[1] ;
      P00774_A524TBM32_TEXT = new String[] {""} ;
      P00774_n524TBM32_TEXT = new boolean[] {false} ;
      P00774_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A524TBM32_TEXT = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc04_ref_crf_value__default(),
         new Object[] {
             new Object[] {
            P00772_A72TBM32_CRF_ITEM_CD, P00772_A71TBM32_CRF_ID, P00772_A70TBM32_STUDY_ID, P00772_A74TBM32_CRF_ITEM_DIV, P00772_n74TBM32_CRF_ITEM_DIV, P00772_A527TBM32_FIXED_VALUE, P00772_n527TBM32_FIXED_VALUE, P00772_A525TBM32_LIST_CD, P00772_n525TBM32_LIST_CD, P00772_A73TBM32_CRF_ITEM_GRP_CD,
            P00772_n73TBM32_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P00773_A100TBT12_CRF_ITEM_GRP_CD, P00773_A937TBT12_CRF_EDA_NO, P00773_A98TBT12_CRF_ID, P00773_A97TBT12_SUBJECT_ID, P00773_A96TBT12_STUDY_ID, P00773_A465TBT12_CRF_VALUE, P00773_n465TBT12_CRF_VALUE, P00773_A99TBT12_CRF_ITEM_GRP_DIV
            }
            , new Object[] {
            P00774_A522TBM32_CHK_TRUE_INNER_VALUE, P00774_n522TBM32_CHK_TRUE_INNER_VALUE, P00774_A73TBM32_CRF_ITEM_GRP_CD, P00774_n73TBM32_CRF_ITEM_GRP_CD, P00774_A71TBM32_CRF_ID, P00774_A70TBM32_STUDY_ID, P00774_A524TBM32_TEXT, P00774_n524TBM32_TEXT, P00774_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A937TBT12_CRF_EDA_NO ;
   private short AV11P_TBM32_REF_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short A98TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV10P_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private long AV9P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A96TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean returnInSub ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n524TBM32_TEXT ;
   private String AV12P_TBM32_REF_CRF_ITEM_CD ;
   private String AV8P_CRF_VALUE ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String AV17W_TBT12_CRF_VALUE ;
   private String AV14W_TBM26_LIST_ITEM_NAME ;
   private String AV15W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV16W_TBM32_TEXT ;
   private String AV13W_FLG ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A524TBM32_TEXT ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00772_A72TBM32_CRF_ITEM_CD ;
   private short[] P00772_A71TBM32_CRF_ID ;
   private long[] P00772_A70TBM32_STUDY_ID ;
   private String[] P00772_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P00772_n74TBM32_CRF_ITEM_DIV ;
   private String[] P00772_A527TBM32_FIXED_VALUE ;
   private boolean[] P00772_n527TBM32_FIXED_VALUE ;
   private String[] P00772_A525TBM32_LIST_CD ;
   private boolean[] P00772_n525TBM32_LIST_CD ;
   private String[] P00772_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00772_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P00773_A100TBT12_CRF_ITEM_GRP_CD ;
   private byte[] P00773_A937TBT12_CRF_EDA_NO ;
   private short[] P00773_A98TBT12_CRF_ID ;
   private int[] P00773_A97TBT12_SUBJECT_ID ;
   private long[] P00773_A96TBT12_STUDY_ID ;
   private String[] P00773_A465TBT12_CRF_VALUE ;
   private boolean[] P00773_n465TBT12_CRF_VALUE ;
   private String[] P00773_A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] P00774_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P00774_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] P00774_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00774_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] P00774_A71TBM32_CRF_ID ;
   private long[] P00774_A70TBM32_STUDY_ID ;
   private String[] P00774_A524TBM32_TEXT ;
   private boolean[] P00774_n524TBM32_TEXT ;
   private String[] P00774_A72TBM32_CRF_ITEM_CD ;
}

final  class b720_pc04_ref_crf_value__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00772", "SELECT `TBM32_CRF_ITEM_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_DIV`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_CRF_ITEM_GRP_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_CD` = ? ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00773", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = 1) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00774", "SELECT `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_TEXT`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ? and `TBM32_CRF_ITEM_GRP_CD` = ?) AND (`TBM32_CHK_TRUE_INNER_VALUE` = ?) ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_GRP_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
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
               stmt.setVarchar(4, (String)parms[3], 50);
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

