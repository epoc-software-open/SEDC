/*
               File: B506_PC06_CRF_MEMO_REG
        Description: CRFメモテーブルワーク登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:26.34
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b506_pc06_crf_memo_reg extends GXProcedure
{
   public b506_pc06_crf_memo_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b506_pc06_crf_memo_reg.class ), "" );
   }

   public b506_pc06_crf_memo_reg( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             short[] aP4 )
   {
      b506_pc06_crf_memo_reg.this.AV10P_CSV = aP0;
      b506_pc06_crf_memo_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc06_crf_memo_reg.this.AV9P_APP_ID = aP2;
      b506_pc06_crf_memo_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc06_crf_memo_reg.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b506_pc06_crf_memo_reg.this.AV10P_CSV = aP0;
      b506_pc06_crf_memo_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc06_crf_memo_reg.this.AV9P_APP_ID = aP2;
      b506_pc06_crf_memo_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc06_crf_memo_reg.this.aP4 = aP4;
      b506_pc06_crf_memo_reg.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV19C_APP_ID = "B506" ;
      AV17W_RTN_CD = (short)(0) ;
      AV18W_RTN_MSG = "" ;
      GXt_char1 = AV16W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      b506_pc06_crf_memo_reg.this.GXt_char1 = GXv_char2[0] ;
      AV16W_NEWLINE = GXt_char1 ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV19C_APP_ID );
      /* Execute user subroutine: S1169 */
      S1169 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXt_objcol_char3 = AV15W_CSV_ROW ;
      GXv_objcol_char4[0] = GXt_objcol_char3 ;
      new b807_pc01_csv_row_parse(remoteHandle, context).execute( AV10P_CSV, GXv_objcol_char4) ;
      GXt_objcol_char3 = GXv_objcol_char4[0] ;
      AV15W_CSV_ROW = GXt_objcol_char3 ;
      AV13W_CNT = 1 ;
      while ( AV13W_CNT <= AV15W_CSV_ROW.size() )
      {
         GXv_objcol_char4[0] = AV14W_CSV_COL ;
         GXv_int5[0] = AV17W_RTN_CD ;
         GXv_char2[0] = AV18W_RTN_MSG ;
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV13W_CNT)), 13, "CRFメモテーブル", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b506_pc06_crf_memo_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
         b506_pc06_crf_memo_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
         if ( AV17W_RTN_CD != 0 )
         {
            if (true) break;
         }
         /*
            INSERT RECORD ON TABLE TBW06_CRF_MEMO

         */
         A698TBW06_SESSION_ID = AV12P_SESSION_ID ;
         A699TBW06_APP_ID = AV9P_APP_ID ;
         A700TBW06_DISP_DATETIME = AV11P_DISP_DATETIME ;
         A701TBW06_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A702TBW06_SUBJECT_ID = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A703TBW06_INS_NO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+3))) ;
         A704TBW06_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+4))) ;
         n704TBW06_CRF_ID = false ;
         A705TBW06_CRF_VERSION = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
         n705TBW06_CRF_VERSION = false ;
         A706TBW06_MEMO = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n706TBW06_MEMO = false ;
         A707TBW06_STYDY_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+7) ;
         n707TBW06_STYDY_AUTH_CD = false ;
         A708TBW06_REQUEST_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
         n708TBW06_REQUEST_USER_ID = false ;
         A709TBW06_EDIT_REQUEST_FLG = (String)AV14W_CSV_COL.elementAt(-1+9) ;
         n709TBW06_EDIT_REQUEST_FLG = false ;
         A710TBW06_EDIT_REQUEST_END_FLG = (String)AV14W_CSV_COL.elementAt(-1+10) ;
         n710TBW06_EDIT_REQUEST_END_FLG = false ;
         A711TBW06_EDIT_REQ_END_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+11), 6) ;
         n711TBW06_EDIT_REQ_END_DATETIME = false ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+12) ;
         n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
         A713TBW06_PROC_DIV = (String)AV14W_CSV_COL.elementAt(-1+13) ;
         n713TBW06_PROC_DIV = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBW06_CRF_MEMO" ;
         /* Using cursor P00342 */
         pr_default.execute(0, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO), new Boolean(n704TBW06_CRF_ID), new Short(A704TBW06_CRF_ID), new Boolean(n705TBW06_CRF_VERSION), new Short(A705TBW06_CRF_VERSION), new Boolean(n706TBW06_MEMO), A706TBW06_MEMO, new Boolean(n707TBW06_STYDY_AUTH_CD), A707TBW06_STYDY_AUTH_CD, new Boolean(n708TBW06_REQUEST_USER_ID), A708TBW06_REQUEST_USER_ID, new Boolean(n709TBW06_EDIT_REQUEST_FLG), A709TBW06_EDIT_REQUEST_FLG, new Boolean(n710TBW06_EDIT_REQUEST_END_FLG), A710TBW06_EDIT_REQUEST_END_FLG, new Boolean(n711TBW06_EDIT_REQ_END_DATETIME), A711TBW06_EDIT_REQ_END_DATETIME, new Boolean(n712TBW06_EDIT_REQUEST_END_USER_ID), A712TBW06_EDIT_REQUEST_END_USER_ID, new Boolean(n713TBW06_PROC_DIV), A713TBW06_PROC_DIV});
         if ( (pr_default.getStatus(0) == 1) )
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
         if ( AV17W_RTN_CD != 0 )
         {
            if (true) break;
         }
         AV13W_CNT = (long)(AV13W_CNT+1) ;
      }
      cleanup();
   }

   public void S1169( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CSV" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CSV );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SESSION_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_SESSION_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_APP_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_APP_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DISP_DATETIME" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_DISP_DATETIME );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV22W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV20W_EXTRA_INFO;
      GXv_int5[0] = AV17W_RTN_CD ;
      GXv_char2[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(1), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b506_pc06_crf_memo_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc06_crf_memo_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
   }

   public void S12101( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV20W_EXTRA_INFO;
      GXv_int5[0] = AV17W_RTN_CD ;
      GXv_char2[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b506_pc06_crf_memo_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc06_crf_memo_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b506_pc06_crf_memo_reg.this.AV17W_RTN_CD;
      this.aP5[0] = b506_pc06_crf_memo_reg.this.AV18W_RTN_MSG;
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
                  /* Execute user subroutine: S12101 */
                  S12101 ();
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
      AV18W_RTN_MSG = "" ;
      AV19C_APP_ID = "" ;
      AV16W_NEWLINE = "" ;
      GXt_char1 = "" ;
      AV20W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV15W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      GXt_objcol_char3 = new GxObjectCollection(String.class, "internal", "");
      AV14W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      GXv_objcol_char4 = new GxObjectCollection [1] ;
      A698TBW06_SESSION_ID = "" ;
      A699TBW06_APP_ID = "" ;
      A700TBW06_DISP_DATETIME = "" ;
      A706TBW06_MEMO = "" ;
      A707TBW06_STYDY_AUTH_CD = "" ;
      A708TBW06_REQUEST_USER_ID = "" ;
      A709TBW06_EDIT_REQUEST_FLG = "" ;
      A710TBW06_EDIT_REQUEST_END_FLG = "" ;
      A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      A713TBW06_PROC_DIV = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      Gx_emsg = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV25Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b506_pc06_crf_memo_reg__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B506_PC06_CRF_MEMO_REG" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B506_PC06_CRF_MEMO_REG" ;
      Gx_err = (short)(0) ;
   }

   private short AV17W_RTN_CD ;
   private short A703TBW06_INS_NO ;
   private short A704TBW06_CRF_ID ;
   private short A705TBW06_CRF_VERSION ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS44 ;
   private int A702TBW06_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private long A701TBW06_STUDY_ID ;
   private String GXt_char1 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String AV25Pgmname ;
   private String GXv_char2[] ;
   private java.util.Date A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean returnInSub ;
   private boolean n704TBW06_CRF_ID ;
   private boolean n705TBW06_CRF_VERSION ;
   private boolean n706TBW06_MEMO ;
   private boolean n707TBW06_STYDY_AUTH_CD ;
   private boolean n708TBW06_REQUEST_USER_ID ;
   private boolean n709TBW06_EDIT_REQUEST_FLG ;
   private boolean n710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean n711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean n713TBW06_PROC_DIV ;
   private String AV10P_CSV ;
   private String AV12P_SESSION_ID ;
   private String AV9P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV18W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String AV16W_NEWLINE ;
   private String A698TBW06_SESSION_ID ;
   private String A699TBW06_APP_ID ;
   private String A700TBW06_DISP_DATETIME ;
   private String A706TBW06_MEMO ;
   private String A707TBW06_STYDY_AUTH_CD ;
   private String A708TBW06_REQUEST_USER_ID ;
   private String A709TBW06_EDIT_REQUEST_FLG ;
   private String A710TBW06_EDIT_REQUEST_END_FLG ;
   private String A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String A713TBW06_PROC_DIV ;
   private String AV22W_MSG ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private GxObjectCollection AV15W_CSV_ROW ;
   private GxObjectCollection GXt_objcol_char3 ;
   private GxObjectCollection AV14W_CSV_COL ;
   private GxObjectCollection GXv_objcol_char4[] ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

final  class b506_pc06_crf_memo_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00342", "INSERT INTO `TBW06_CRF_MEMO` (`TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 128);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               break;
      }
   }

}

