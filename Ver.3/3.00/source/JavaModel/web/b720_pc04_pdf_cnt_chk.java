/*
               File: B720_PC04_PDF_CNT_CHK
        Description: PDF出力件数チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:21.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc04_pdf_cnt_chk extends GXProcedure
{
   public b720_pc04_pdf_cnt_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc04_pdf_cnt_chk.class ), "" );
   }

   public b720_pc04_pdf_cnt_chk( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( byte aP0 ,
                             long aP1 ,
                             GxObjectCollection aP2 ,
                             long[] aP3 ,
                             byte[] aP4 )
   {
      b720_pc04_pdf_cnt_chk.this.AV9P_SEL_PDF = aP0;
      b720_pc04_pdf_cnt_chk.this.AV10P_STUDY_ID = aP1;
      b720_pc04_pdf_cnt_chk.this.AV11SD_B720_SD02_CRF_INFO_C = aP2;
      b720_pc04_pdf_cnt_chk.this.aP3 = aP3;
      b720_pc04_pdf_cnt_chk.this.aP4 = aP4;
      b720_pc04_pdf_cnt_chk.this.aP5 = aP5;
      b720_pc04_pdf_cnt_chk.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( byte aP0 ,
                        long aP1 ,
                        GxObjectCollection aP2 ,
                        long[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( byte aP0 ,
                             long aP1 ,
                             GxObjectCollection aP2 ,
                             long[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      b720_pc04_pdf_cnt_chk.this.AV9P_SEL_PDF = aP0;
      b720_pc04_pdf_cnt_chk.this.AV10P_STUDY_ID = aP1;
      b720_pc04_pdf_cnt_chk.this.AV11SD_B720_SD02_CRF_INFO_C = aP2;
      b720_pc04_pdf_cnt_chk.this.aP3 = aP3;
      b720_pc04_pdf_cnt_chk.this.aP4 = aP4;
      b720_pc04_pdf_cnt_chk.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_MSG = "" ;
      AV14W_RTN_CD = (byte)(0) ;
      AV17W_PDF_CNT = 0 ;
      if ( AV9P_SEL_PDF == 1 )
      {
         AV17W_PDF_CNT = 0 ;
         AV20GXV1 = 1 ;
         while ( AV20GXV1 <= AV11SD_B720_SD02_CRF_INFO_C.size() )
         {
            AV12SD_B720_SD02_CRF_INFO_I = (SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)((SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem)AV11SD_B720_SD02_CRF_INFO_C.elementAt(-1+AV20GXV1));
            /* Using cursor P007O2 */
            pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A661TBT02_INPUT_END_FLG = P007O2_A661TBT02_INPUT_END_FLG[0] ;
               n661TBT02_INPUT_END_FLG = P007O2_n661TBT02_INPUT_END_FLG[0] ;
               A935TBT02_CRF_EDA_NO = P007O2_A935TBT02_CRF_EDA_NO[0] ;
               A91TBT02_CRF_ID = P007O2_A91TBT02_CRF_ID[0] ;
               A90TBT02_SUBJECT_ID = P007O2_A90TBT02_SUBJECT_ID[0] ;
               A89TBT02_STUDY_ID = P007O2_A89TBT02_STUDY_ID[0] ;
               /* Using cursor P007O3 */
               pr_default.execute(1, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt01_subject_id()), new Short(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_id()), new Byte(AV12SD_B720_SD02_CRF_INFO_I.getgxTv_SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem_Tbt02_crf_eda_no())});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  brk7O3 = false ;
                  A936TBT11_CRF_EDA_NO = P007O3_A936TBT11_CRF_EDA_NO[0] ;
                  A94TBT11_CRF_ID = P007O3_A94TBT11_CRF_ID[0] ;
                  A93TBT11_SUBJECT_ID = P007O3_A93TBT11_SUBJECT_ID[0] ;
                  A92TBT11_STUDY_ID = P007O3_A92TBT11_STUDY_ID[0] ;
                  A669TBT11_DM_ARRIVAL_FLG = P007O3_A669TBT11_DM_ARRIVAL_FLG[0] ;
                  n669TBT11_DM_ARRIVAL_FLG = P007O3_n669TBT11_DM_ARRIVAL_FLG[0] ;
                  A95TBT11_CRF_VERSION = P007O3_A95TBT11_CRF_VERSION[0] ;
                  A457TBT11_DEL_FLG = P007O3_A457TBT11_DEL_FLG[0] ;
                  n457TBT11_DEL_FLG = P007O3_n457TBT11_DEL_FLG[0] ;
                  AV16W_TBT11_CRF_VERSION = (short)(0) ;
                  while ( (pr_default.getStatus(1) != 101) && ( P007O3_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( P007O3_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( P007O3_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( P007O3_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) )
                  {
                     brk7O3 = false ;
                     A669TBT11_DM_ARRIVAL_FLG = P007O3_A669TBT11_DM_ARRIVAL_FLG[0] ;
                     n669TBT11_DM_ARRIVAL_FLG = P007O3_n669TBT11_DM_ARRIVAL_FLG[0] ;
                     A95TBT11_CRF_VERSION = P007O3_A95TBT11_CRF_VERSION[0] ;
                     if ( GXutil.strcmp(A669TBT11_DM_ARRIVAL_FLG, "1") == 0 )
                     {
                        AV16W_TBT11_CRF_VERSION = A95TBT11_CRF_VERSION ;
                        AV17W_PDF_CNT = (long)(AV17W_PDF_CNT+1) ;
                        /* Exit For each command. Update data (if necessary), close cursors & exit. */
                        if (true) break;
                     }
                     brk7O3 = true ;
                     pr_default.readNext(1);
                  }
                  while ( (pr_default.getStatus(1) != 101) && ( P007O3_A92TBT11_STUDY_ID[0] == A92TBT11_STUDY_ID ) && ( P007O3_A93TBT11_SUBJECT_ID[0] == A93TBT11_SUBJECT_ID ) && ( P007O3_A94TBT11_CRF_ID[0] == A94TBT11_CRF_ID ) && ( P007O3_A936TBT11_CRF_EDA_NO[0] == A936TBT11_CRF_EDA_NO ) )
                  {
                     brk7O3 = false ;
                     A95TBT11_CRF_VERSION = P007O3_A95TBT11_CRF_VERSION[0] ;
                     if ( A95TBT11_CRF_VERSION >= AV16W_TBT11_CRF_VERSION )
                     {
                        AV17W_PDF_CNT = (long)(AV17W_PDF_CNT+1) ;
                     }
                     brk7O3 = true ;
                     pr_default.readNext(1);
                  }
                  if ( ! brk7O3 )
                  {
                     brk7O3 = true ;
                     pr_default.readNext(1);
                  }
               }
               pr_default.close(1);
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            AV20GXV1 = (int)(AV20GXV1+1) ;
         }
      }
      else
      {
         AV17W_PDF_CNT = AV11SD_B720_SD02_CRF_INFO_C.size() ;
      }
      GXt_char1 = AV15W_SYS_VALUE ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "025", GXv_char2) ;
      b720_pc04_pdf_cnt_chk.this.GXt_char1 = GXv_char2[0] ;
      AV15W_SYS_VALUE = GXt_char1 ;
      if ( GXutil.val( AV15W_SYS_VALUE, ".") > 0 )
      {
         if ( AV17W_PDF_CNT > GXutil.val( AV15W_SYS_VALUE, ".") )
         {
            if ( AV9P_SEL_PDF == 1 )
            {
               AV13W_MSG = "「PDF出力」は最大" + AV15W_SYS_VALUE + "件までのため、実行ができません。（現在の選択での出力件数：" + GXutil.trim( GXutil.str( AV17W_PDF_CNT, 10, 0)) + ")" ;
            }
            else
            {
               AV13W_MSG = "「PDF出力」は最大" + AV15W_SYS_VALUE + "件までのため、実行ができません。（現在の選択件数：" + GXutil.trim( GXutil.str( AV17W_PDF_CNT, 10, 0)) + ")" ;
            }
            AV14W_RTN_CD = (byte)(1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV8C_APP_ID = "B720" ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV25Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b720_pc04_pdf_cnt_chk.this.AV17W_PDF_CNT;
      this.aP4[0] = b720_pc04_pdf_cnt_chk.this.AV14W_RTN_CD;
      this.aP5[0] = b720_pc04_pdf_cnt_chk.this.AV13W_MSG;
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      AV13W_MSG = "" ;
      AV12SD_B720_SD02_CRF_INFO_I = new SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem(remoteHandle, context);
      scmdbuf = "" ;
      P007O2_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      P007O2_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      P007O2_A935TBT02_CRF_EDA_NO = new byte[1] ;
      P007O2_A91TBT02_CRF_ID = new short[1] ;
      P007O2_A90TBT02_SUBJECT_ID = new int[1] ;
      P007O2_A89TBT02_STUDY_ID = new long[1] ;
      A661TBT02_INPUT_END_FLG = "" ;
      P007O3_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007O3_A94TBT11_CRF_ID = new short[1] ;
      P007O3_A93TBT11_SUBJECT_ID = new int[1] ;
      P007O3_A92TBT11_STUDY_ID = new long[1] ;
      P007O3_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P007O3_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007O3_A95TBT11_CRF_VERSION = new short[1] ;
      P007O3_A457TBT11_DEL_FLG = new String[] {""} ;
      P007O3_n457TBT11_DEL_FLG = new boolean[] {false} ;
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A457TBT11_DEL_FLG = "" ;
      AV15W_SYS_VALUE = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV8C_APP_ID = "" ;
      AV25Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc04_pdf_cnt_chk__default(),
         new Object[] {
             new Object[] {
            P007O2_A661TBT02_INPUT_END_FLG, P007O2_n661TBT02_INPUT_END_FLG, P007O2_A935TBT02_CRF_EDA_NO, P007O2_A91TBT02_CRF_ID, P007O2_A90TBT02_SUBJECT_ID, P007O2_A89TBT02_STUDY_ID
            }
            , new Object[] {
            P007O3_A936TBT11_CRF_EDA_NO, P007O3_A94TBT11_CRF_ID, P007O3_A93TBT11_SUBJECT_ID, P007O3_A92TBT11_STUDY_ID, P007O3_A669TBT11_DM_ARRIVAL_FLG, P007O3_n669TBT11_DM_ARRIVAL_FLG, P007O3_A95TBT11_CRF_VERSION, P007O3_A457TBT11_DEL_FLG, P007O3_n457TBT11_DEL_FLG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B720_PC04_PDF_CNT_CHK" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B720_PC04_PDF_CNT_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV9P_SEL_PDF ;
   private byte AV14W_RTN_CD ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A936TBT11_CRF_EDA_NO ;
   private short A91TBT02_CRF_ID ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short AV16W_TBT11_CRF_VERSION ;
   private short Gx_err ;
   private int AV20GXV1 ;
   private int A90TBT02_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long AV17W_PDF_CNT ;
   private long A89TBT02_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV25Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean brk7O3 ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n457TBT11_DEL_FLG ;
   private String AV13W_MSG ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A457TBT11_DEL_FLG ;
   private String AV15W_SYS_VALUE ;
   private String AV8C_APP_ID ;
   private long[] aP3 ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P007O2_A661TBT02_INPUT_END_FLG ;
   private boolean[] P007O2_n661TBT02_INPUT_END_FLG ;
   private byte[] P007O2_A935TBT02_CRF_EDA_NO ;
   private short[] P007O2_A91TBT02_CRF_ID ;
   private int[] P007O2_A90TBT02_SUBJECT_ID ;
   private long[] P007O2_A89TBT02_STUDY_ID ;
   private byte[] P007O3_A936TBT11_CRF_EDA_NO ;
   private short[] P007O3_A94TBT11_CRF_ID ;
   private int[] P007O3_A93TBT11_SUBJECT_ID ;
   private long[] P007O3_A92TBT11_STUDY_ID ;
   private String[] P007O3_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P007O3_n669TBT11_DM_ARRIVAL_FLG ;
   private short[] P007O3_A95TBT11_CRF_VERSION ;
   private String[] P007O3_A457TBT11_DEL_FLG ;
   private boolean[] P007O3_n457TBT11_DEL_FLG ;
   private GxObjectCollection AV11SD_B720_SD02_CRF_INFO_C ;
   private SdtB720_SD02_CRF_INFO_B720_SD02_CRF_INFOItem AV12SD_B720_SD02_CRF_INFO_I ;
}

final  class b720_pc04_pdf_cnt_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007O2", "SELECT `TBT02_INPUT_END_FLG`, `TBT02_CRF_EDA_NO`, `TBT02_CRF_ID`, `TBT02_SUBJECT_ID`, `TBT02_STUDY_ID` FROM `TBT02_CRF` WHERE (`TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_CRF_ID` = ? and `TBT02_CRF_EDA_NO` = ?) AND (`TBT02_INPUT_END_FLG` = '1') ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007O3", "SELECT `TBT11_CRF_EDA_NO`, `TBT11_CRF_ID`, `TBT11_SUBJECT_ID`, `TBT11_STUDY_ID`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_CRF_VERSION`, `TBT11_DEL_FLG` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((long[]) buf[5])[0] = rslt.getLong(5) ;
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((int[]) buf[2])[0] = rslt.getInt(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

