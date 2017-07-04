/*
               File: B799_PC05_INPUT_LEVEL_GET
        Description: ì¸óÕå†å¿éÊìæã§í èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:32.5
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc05_input_level_get extends GXProcedure
{
   public b799_pc05_input_level_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc05_input_level_get.class ), "" );
   }

   public b799_pc05_input_level_get( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 )
   {
      b799_pc05_input_level_get.this.AV10P_STUDY_ID = aP0;
      b799_pc05_input_level_get.this.AV11P_SUBJECT_ID = aP1;
      b799_pc05_input_level_get.this.AV9P_CRF_ID = aP2;
      b799_pc05_input_level_get.this.AV8P_AUTH_CD = aP3;
      b799_pc05_input_level_get.this.aP4 = aP4;
      b799_pc05_input_level_get.this.aP5 = aP5;
      b799_pc05_input_level_get.this.aP6 = aP6;
      b799_pc05_input_level_get.this.aP7 = aP7;
      b799_pc05_input_level_get.this.aP8 = aP8;
      b799_pc05_input_level_get.this.aP8 = new String[] {""};
      initialize();
      privateExecute();
      return aP8[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 ,
                        String[] aP6 ,
                        String[] aP7 ,
                        String[] aP8 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 ,
                             String[] aP6 ,
                             String[] aP7 ,
                             String[] aP8 )
   {
      b799_pc05_input_level_get.this.AV10P_STUDY_ID = aP0;
      b799_pc05_input_level_get.this.AV11P_SUBJECT_ID = aP1;
      b799_pc05_input_level_get.this.AV9P_CRF_ID = aP2;
      b799_pc05_input_level_get.this.AV8P_AUTH_CD = aP3;
      b799_pc05_input_level_get.this.aP4 = aP4;
      b799_pc05_input_level_get.this.aP5 = aP5;
      b799_pc05_input_level_get.this.aP6 = aP6;
      b799_pc05_input_level_get.this.aP7 = aP7;
      b799_pc05_input_level_get.this.aP8 = aP8;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17W_ERR_FLG = "0" ;
      AV19W_MSG = "" ;
      GXv_char1[0] = AV15W_DM_AUTH_CD ;
      GXv_int2[0] = AV16W_DM_AUTH_LVL ;
      new b799_pc06_dm_info_get(remoteHandle, context).execute( GXv_char1, GXv_int2) ;
      b799_pc05_input_level_get.this.AV15W_DM_AUTH_CD = GXv_char1[0] ;
      b799_pc05_input_level_get.this.AV16W_DM_AUTH_LVL = GXv_int2[0] ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV17W_ERR_FLG, "0") == 0 )
      {
         /* Using cursor P005Y2 */
         pr_default.execute(0, new Object[] {AV8P_AUTH_CD});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A687TAM04_AUTH_LVL = P005Y2_A687TAM04_AUTH_LVL[0] ;
            n687TAM04_AUTH_LVL = P005Y2_n687TAM04_AUTH_LVL[0] ;
            A13TAM04_AUTH_CD = P005Y2_A13TAM04_AUTH_CD[0] ;
            /* Using cursor P005Y3 */
            pr_default.execute(1);
            while ( (pr_default.getStatus(1) != 101) )
            {
               A8TAS01_ITEM_CD = P005Y3_A8TAS01_ITEM_CD[0] ;
               A7TAS01_DATA_KIND = P005Y3_A7TAS01_DATA_KIND[0] ;
               A336TAS01_CHAR_1 = P005Y3_A336TAS01_CHAR_1[0] ;
               n336TAS01_CHAR_1 = P005Y3_n336TAS01_CHAR_1[0] ;
               A337TAS01_CHAR_2 = P005Y3_A337TAS01_CHAR_2[0] ;
               n337TAS01_CHAR_2 = P005Y3_n337TAS01_CHAR_2[0] ;
               A338TAS01_CHAR_3 = P005Y3_A338TAS01_CHAR_3[0] ;
               n338TAS01_CHAR_3 = P005Y3_n338TAS01_CHAR_3[0] ;
               if ( GXutil.strcmp(A8TAS01_ITEM_CD, GXutil.trim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0))) == 0 )
               {
                  if ( GXutil.strcmp(AV14W_DM_ARRIVAL_JYOTAI, "0") == 0 )
                  {
                     AV22W_TAS01_CHAR = A336TAS01_CHAR_1 ;
                  }
                  else if ( GXutil.strcmp(AV14W_DM_ARRIVAL_JYOTAI, "1") == 0 )
                  {
                     AV22W_TAS01_CHAR = A337TAS01_CHAR_2 ;
                  }
                  else if ( GXutil.strcmp(AV14W_DM_ARRIVAL_JYOTAI, "2") == 0 )
                  {
                     AV22W_TAS01_CHAR = A338TAS01_CHAR_3 ;
                  }
                  /* Exit For each command. Update data (if necessary), close cursors & exit. */
                  if (true) break;
               }
               pr_default.readNext(1);
            }
            pr_default.close(1);
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( (GXutil.strcmp("", AV22W_TAS01_CHAR)==0) )
         {
            AV22W_TAS01_CHAR = "000" ;
         }
         AV12W_CRF_INPUT_FLG = GXutil.substring( AV22W_TAS01_CHAR, 1, 1) ;
         AV18W_MEMO_INPU_FLG = GXutil.substring( AV22W_TAS01_CHAR, 2, 1) ;
         AV13W_CRF_KANRI_FLG = GXutil.substring( AV22W_TAS01_CHAR, 3, 1) ;
      }
      if ( GXutil.strcmp(AV17W_ERR_FLG, "0") == 0 )
      {
         AV20W_RTN_CD = "0" ;
      }
      else
      {
         AV20W_RTN_CD = "1" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_DM_ARRI_JYOTAI' Routine */
      AV27GXLvl84 = (byte)(0) ;
      /* Using cursor P005Y4 */
      pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_ID), new Short(AV9P_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A449TBT02_DEL_FLG = P005Y4_A449TBT02_DEL_FLG[0] ;
         n449TBT02_DEL_FLG = P005Y4_n449TBT02_DEL_FLG[0] ;
         A91TBT02_CRF_ID = P005Y4_A91TBT02_CRF_ID[0] ;
         A90TBT02_SUBJECT_ID = P005Y4_A90TBT02_SUBJECT_ID[0] ;
         A89TBT02_STUDY_ID = P005Y4_A89TBT02_STUDY_ID[0] ;
         A655TBT02_DM_ARRIVAL_FLG = P005Y4_A655TBT02_DM_ARRIVAL_FLG[0] ;
         n655TBT02_DM_ARRIVAL_FLG = P005Y4_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = P005Y4_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         n656TBT02_DM_ARRIVAL_DATETIME = P005Y4_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A935TBT02_CRF_EDA_NO = P005Y4_A935TBT02_CRF_EDA_NO[0] ;
         AV27GXLvl84 = (byte)(1) ;
         if ( GXutil.strcmp(A655TBT02_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV14W_DM_ARRIVAL_JYOTAI = "1" ;
         }
         else
         {
            if ( GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) )
            {
               AV14W_DM_ARRIVAL_JYOTAI = "0" ;
            }
            else
            {
               AV14W_DM_ARRIVAL_JYOTAI = "2" ;
            }
         }
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      if ( AV27GXLvl84 == 0 )
      {
         AV17W_ERR_FLG = "1" ;
         GXt_char3 = AV19W_MSG ;
         GXv_char1[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char1) ;
         b799_pc05_input_level_get.this.GXt_char3 = GXv_char1[0] ;
         AV19W_MSG = GXt_char3 ;
      }
   }

   protected void cleanup( )
   {
      this.aP4[0] = b799_pc05_input_level_get.this.AV12W_CRF_INPUT_FLG;
      this.aP5[0] = b799_pc05_input_level_get.this.AV18W_MEMO_INPU_FLG;
      this.aP6[0] = b799_pc05_input_level_get.this.AV13W_CRF_KANRI_FLG;
      this.aP7[0] = b799_pc05_input_level_get.this.AV20W_RTN_CD;
      this.aP8[0] = b799_pc05_input_level_get.this.AV19W_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_CRF_INPUT_FLG = "" ;
      AV18W_MEMO_INPU_FLG = "" ;
      AV13W_CRF_KANRI_FLG = "" ;
      AV20W_RTN_CD = "" ;
      AV19W_MSG = "" ;
      AV17W_ERR_FLG = "" ;
      AV15W_DM_AUTH_CD = "" ;
      GXv_int2 = new byte [1] ;
      scmdbuf = "" ;
      P005Y2_A687TAM04_AUTH_LVL = new byte[1] ;
      P005Y2_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      P005Y2_A13TAM04_AUTH_CD = new String[] {""} ;
      A13TAM04_AUTH_CD = "" ;
      P005Y3_A8TAS01_ITEM_CD = new String[] {""} ;
      P005Y3_A7TAS01_DATA_KIND = new String[] {""} ;
      P005Y3_A336TAS01_CHAR_1 = new String[] {""} ;
      P005Y3_n336TAS01_CHAR_1 = new boolean[] {false} ;
      P005Y3_A337TAS01_CHAR_2 = new String[] {""} ;
      P005Y3_n337TAS01_CHAR_2 = new boolean[] {false} ;
      P005Y3_A338TAS01_CHAR_3 = new String[] {""} ;
      P005Y3_n338TAS01_CHAR_3 = new boolean[] {false} ;
      A8TAS01_ITEM_CD = "" ;
      A7TAS01_DATA_KIND = "" ;
      A336TAS01_CHAR_1 = "" ;
      A337TAS01_CHAR_2 = "" ;
      A338TAS01_CHAR_3 = "" ;
      AV14W_DM_ARRIVAL_JYOTAI = "" ;
      AV22W_TAS01_CHAR = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P005Y4_A449TBT02_DEL_FLG = new String[] {""} ;
      P005Y4_n449TBT02_DEL_FLG = new boolean[] {false} ;
      P005Y4_A91TBT02_CRF_ID = new short[1] ;
      P005Y4_A90TBT02_SUBJECT_ID = new int[1] ;
      P005Y4_A89TBT02_STUDY_ID = new long[1] ;
      P005Y4_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      P005Y4_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P005Y4_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P005Y4_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P005Y4_A935TBT02_CRF_EDA_NO = new byte[1] ;
      A449TBT02_DEL_FLG = "" ;
      GXt_char3 = "" ;
      GXv_char1 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc05_input_level_get__default(),
         new Object[] {
             new Object[] {
            P005Y2_A687TAM04_AUTH_LVL, P005Y2_n687TAM04_AUTH_LVL, P005Y2_A13TAM04_AUTH_CD
            }
            , new Object[] {
            P005Y3_A8TAS01_ITEM_CD, P005Y3_A7TAS01_DATA_KIND, P005Y3_A336TAS01_CHAR_1, P005Y3_n336TAS01_CHAR_1, P005Y3_A337TAS01_CHAR_2, P005Y3_n337TAS01_CHAR_2, P005Y3_A338TAS01_CHAR_3, P005Y3_n338TAS01_CHAR_3
            }
            , new Object[] {
            P005Y4_A449TBT02_DEL_FLG, P005Y4_n449TBT02_DEL_FLG, P005Y4_A91TBT02_CRF_ID, P005Y4_A90TBT02_SUBJECT_ID, P005Y4_A89TBT02_STUDY_ID, P005Y4_A655TBT02_DM_ARRIVAL_FLG, P005Y4_n655TBT02_DM_ARRIVAL_FLG, P005Y4_A656TBT02_DM_ARRIVAL_DATETIME, P005Y4_n656TBT02_DM_ARRIVAL_DATETIME, P005Y4_A935TBT02_CRF_EDA_NO
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16W_DM_AUTH_LVL ;
   private byte GXv_int2[] ;
   private byte A687TAM04_AUTH_LVL ;
   private byte AV27GXLvl84 ;
   private byte A935TBT02_CRF_EDA_NO ;
   private short AV9P_CRF_ID ;
   private short A91TBT02_CRF_ID ;
   private short Gx_err ;
   private int AV11P_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private long AV10P_STUDY_ID ;
   private long A89TBT02_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char1[] ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean returnInSub ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n336TAS01_CHAR_1 ;
   private boolean n337TAS01_CHAR_2 ;
   private boolean n338TAS01_CHAR_3 ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private String AV8P_AUTH_CD ;
   private String AV12W_CRF_INPUT_FLG ;
   private String AV18W_MEMO_INPU_FLG ;
   private String AV13W_CRF_KANRI_FLG ;
   private String AV20W_RTN_CD ;
   private String AV19W_MSG ;
   private String AV17W_ERR_FLG ;
   private String AV15W_DM_AUTH_CD ;
   private String A13TAM04_AUTH_CD ;
   private String A8TAS01_ITEM_CD ;
   private String A7TAS01_DATA_KIND ;
   private String A336TAS01_CHAR_1 ;
   private String A337TAS01_CHAR_2 ;
   private String A338TAS01_CHAR_3 ;
   private String AV14W_DM_ARRIVAL_JYOTAI ;
   private String AV22W_TAS01_CHAR ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A449TBT02_DEL_FLG ;
   private String[] aP4 ;
   private String[] aP5 ;
   private String[] aP6 ;
   private String[] aP7 ;
   private String[] aP8 ;
   private IDataStoreProvider pr_default ;
   private byte[] P005Y2_A687TAM04_AUTH_LVL ;
   private boolean[] P005Y2_n687TAM04_AUTH_LVL ;
   private String[] P005Y2_A13TAM04_AUTH_CD ;
   private String[] P005Y3_A8TAS01_ITEM_CD ;
   private String[] P005Y3_A7TAS01_DATA_KIND ;
   private String[] P005Y3_A336TAS01_CHAR_1 ;
   private boolean[] P005Y3_n336TAS01_CHAR_1 ;
   private String[] P005Y3_A337TAS01_CHAR_2 ;
   private boolean[] P005Y3_n337TAS01_CHAR_2 ;
   private String[] P005Y3_A338TAS01_CHAR_3 ;
   private boolean[] P005Y3_n338TAS01_CHAR_3 ;
   private String[] P005Y4_A449TBT02_DEL_FLG ;
   private boolean[] P005Y4_n449TBT02_DEL_FLG ;
   private short[] P005Y4_A91TBT02_CRF_ID ;
   private int[] P005Y4_A90TBT02_SUBJECT_ID ;
   private long[] P005Y4_A89TBT02_STUDY_ID ;
   private String[] P005Y4_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] P005Y4_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] P005Y4_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] P005Y4_n656TBT02_DM_ARRIVAL_DATETIME ;
   private byte[] P005Y4_A935TBT02_CRF_EDA_NO ;
}

final  class b799_pc05_input_level_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005Y2", "SELECT `TAM04_AUTH_LVL`, `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P005Y3", "SELECT `TAS01_ITEM_CD`, `TAS01_DATA_KIND`, `TAS01_CHAR_1`, `TAS01_CHAR_2`, `TAS01_CHAR_3` FROM `TAS01_CDNM` WHERE `TAS01_DATA_KIND` = 'B01' ORDER BY `TAS01_DATA_KIND` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P005Y4", "SELECT `TBT02_DEL_FLG`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ?) AND (`TBT02_DEL_FLG` = '0') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(7) ;
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
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

