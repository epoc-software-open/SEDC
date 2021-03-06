/*
               File: B712_PC02_CRF_PRESENT_CHK
        Description: CRF提出エラーチェック
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:17.20
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b712_pc02_crf_present_chk extends GXProcedure
{
   public b712_pc02_crf_present_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_pc02_crf_present_chk.class ), "" );
   }

   public b712_pc02_crf_present_chk( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String[] aP5 )
   {
      b712_pc02_crf_present_chk.this.AV10P_TBT12_STUDY_ID = aP0;
      b712_pc02_crf_present_chk.this.AV11P_TBT12_SUBJECT_ID = aP1;
      b712_pc02_crf_present_chk.this.AV9P_TBT12_CRF_ID = aP2;
      b712_pc02_crf_present_chk.this.AV19P_TBM31_CRF_SNM = aP3;
      b712_pc02_crf_present_chk.this.AV8P_AUTH_CD = aP4;
      b712_pc02_crf_present_chk.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String[] aP5 ,
                             String[] aP6 )
   {
      b712_pc02_crf_present_chk.this.AV10P_TBT12_STUDY_ID = aP0;
      b712_pc02_crf_present_chk.this.AV11P_TBT12_SUBJECT_ID = aP1;
      b712_pc02_crf_present_chk.this.AV9P_TBT12_CRF_ID = aP2;
      b712_pc02_crf_present_chk.this.AV19P_TBM31_CRF_SNM = aP3;
      b712_pc02_crf_present_chk.this.AV8P_AUTH_CD = aP4;
      b712_pc02_crf_present_chk.this.aP5 = aP5;
      b712_pc02_crf_present_chk.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16W_MSG = "" ;
      AV17W_RTN_CD = "0" ;
      AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().clear();
      /* Using cursor P006B2 */
      pr_default.execute(0, new Object[] {new Long(AV10P_TBT12_STUDY_ID), new Integer(AV11P_TBT12_SUBJECT_ID), new Short(AV9P_TBT12_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A328TBT12_DEL_FLG = P006B2_A328TBT12_DEL_FLG[0] ;
         n328TBT12_DEL_FLG = P006B2_n328TBT12_DEL_FLG[0] ;
         A317TBT12_CRF_ID = P006B2_A317TBT12_CRF_ID[0] ;
         A316TBT12_SUBJECT_ID = P006B2_A316TBT12_SUBJECT_ID[0] ;
         A315TBT12_STUDY_ID = P006B2_A315TBT12_STUDY_ID[0] ;
         A319TBT12_CRF_ITEM_GRP_CD = P006B2_A319TBT12_CRF_ITEM_GRP_CD[0] ;
         A320TBT12_CRF_VALUE = P006B2_A320TBT12_CRF_VALUE[0] ;
         n320TBT12_CRF_VALUE = P006B2_n320TBT12_CRF_VALUE[0] ;
         A318TBT12_CRF_ITEM_GRP_DIV = P006B2_A318TBT12_CRF_ITEM_GRP_DIV[0] ;
         AV15SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
         AV15SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A319TBT12_CRF_ITEM_GRP_CD );
         AV15SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( A320TBT12_CRF_VALUE );
         AV14SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().add(AV15SD_B792_SD02_CRF_RESULT_I, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXv_SdtB705_SD01_ERRCHK_RES1[0] = AV12SD_B705_SD01_ERRCHK_RES;
      GXv_char2[0] = AV18W_RETCD ;
      new b705_pc02_crf_value_chk(remoteHandle, context).execute( AV10P_TBT12_STUDY_ID, AV11P_TBT12_SUBJECT_ID, AV9P_TBT12_CRF_ID, AV8P_AUTH_CD, AV14SD_B792_SD01_CRF, GXv_SdtB705_SD01_ERRCHK_RES1, GXv_char2) ;
      AV12SD_B705_SD01_ERRCHK_RES = GXv_SdtB705_SD01_ERRCHK_RES1[0] ;
      b712_pc02_crf_present_chk.this.AV18W_RETCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV18W_RETCD, "0") != 0 )
      {
         AV17W_RTN_CD = "1" ;
         AV20W_ERR_CRF = GXutil.trim( GXutil.str( AV9P_TBT12_CRF_ID, 4, 0)) + " " + AV19P_TBM31_CRF_SNM ;
         GXt_char3 = AV16W_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new a805_pc02_msg_get(remoteHandle, context).execute( "AE00091", GXutil.trim( GXutil.str( AV11P_TBT12_SUBJECT_ID, 6, 0)), AV20W_ERR_CRF, "", "", "", GXv_char2) ;
         b712_pc02_crf_present_chk.this.GXt_char3 = GXv_char2[0] ;
         AV16W_MSG = GXt_char3 ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = b712_pc02_crf_present_chk.this.AV16W_MSG;
      this.aP6[0] = b712_pc02_crf_present_chk.this.AV17W_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV16W_MSG = "" ;
      AV17W_RTN_CD = "" ;
      AV14SD_B792_SD01_CRF = new SdtB792_SD01_CRF(remoteHandle, context);
      scmdbuf = "" ;
      P006B2_A328TBT12_DEL_FLG = new String[] {""} ;
      P006B2_n328TBT12_DEL_FLG = new boolean[] {false} ;
      P006B2_A317TBT12_CRF_ID = new short[1] ;
      P006B2_A316TBT12_SUBJECT_ID = new int[1] ;
      P006B2_A315TBT12_STUDY_ID = new long[1] ;
      P006B2_A319TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P006B2_A320TBT12_CRF_VALUE = new String[] {""} ;
      P006B2_n320TBT12_CRF_VALUE = new boolean[] {false} ;
      P006B2_A318TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A328TBT12_DEL_FLG = "" ;
      A319TBT12_CRF_ITEM_GRP_CD = "" ;
      A320TBT12_CRF_VALUE = "" ;
      A318TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV15SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV12SD_B705_SD01_ERRCHK_RES = new SdtB705_SD01_ERRCHK_RES(remoteHandle, context);
      GXv_SdtB705_SD01_ERRCHK_RES1 = new SdtB705_SD01_ERRCHK_RES [1] ;
      AV18W_RETCD = "" ;
      AV20W_ERR_CRF = "" ;
      GXt_char3 = "" ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_pc02_crf_present_chk__default(),
         new Object[] {
             new Object[] {
            P006B2_A328TBT12_DEL_FLG, P006B2_n328TBT12_DEL_FLG, P006B2_A317TBT12_CRF_ID, P006B2_A316TBT12_SUBJECT_ID, P006B2_A315TBT12_STUDY_ID, P006B2_A319TBT12_CRF_ITEM_GRP_CD, P006B2_A320TBT12_CRF_VALUE, P006B2_n320TBT12_CRF_VALUE, P006B2_A318TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9P_TBT12_CRF_ID ;
   private short A317TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV11P_TBT12_SUBJECT_ID ;
   private int A316TBT12_SUBJECT_ID ;
   private long AV10P_TBT12_STUDY_ID ;
   private long A315TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private boolean n328TBT12_DEL_FLG ;
   private boolean n320TBT12_CRF_VALUE ;
   private String AV19P_TBM31_CRF_SNM ;
   private String AV8P_AUTH_CD ;
   private String AV16W_MSG ;
   private String AV17W_RTN_CD ;
   private String A328TBT12_DEL_FLG ;
   private String A319TBT12_CRF_ITEM_GRP_CD ;
   private String A320TBT12_CRF_VALUE ;
   private String A318TBT12_CRF_ITEM_GRP_DIV ;
   private String AV18W_RETCD ;
   private String AV20W_ERR_CRF ;
   private String[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P006B2_A328TBT12_DEL_FLG ;
   private boolean[] P006B2_n328TBT12_DEL_FLG ;
   private short[] P006B2_A317TBT12_CRF_ID ;
   private int[] P006B2_A316TBT12_SUBJECT_ID ;
   private long[] P006B2_A315TBT12_STUDY_ID ;
   private String[] P006B2_A319TBT12_CRF_ITEM_GRP_CD ;
   private String[] P006B2_A320TBT12_CRF_VALUE ;
   private boolean[] P006B2_n320TBT12_CRF_VALUE ;
   private String[] P006B2_A318TBT12_CRF_ITEM_GRP_DIV ;
   private SdtB705_SD01_ERRCHK_RES AV12SD_B705_SD01_ERRCHK_RES ;
   private SdtB705_SD01_ERRCHK_RES GXv_SdtB705_SD01_ERRCHK_RES1[] ;
   private SdtB792_SD01_CRF AV14SD_B792_SD01_CRF ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV15SD_B792_SD02_CRF_RESULT_I ;
}

final  class b712_pc02_crf_present_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006B2", "SELECT `TBT12_DEL_FLG`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ?) AND (`TBT12_DEL_FLG` = '0') ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((int[]) buf[3])[0] = rslt.getInt(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

