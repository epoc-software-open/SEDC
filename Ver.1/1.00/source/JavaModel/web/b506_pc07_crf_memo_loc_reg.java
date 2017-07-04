/*
               File: B506_PC07_CRF_MEMO_LOC_REG
        Description: CRFメモ位置テーブルワーク登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:26.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b506_pc07_crf_memo_loc_reg extends GXProcedure
{
   public b506_pc07_crf_memo_loc_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b506_pc07_crf_memo_loc_reg.class ), "" );
   }

   public b506_pc07_crf_memo_loc_reg( int remoteHandle ,
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
      b506_pc07_crf_memo_loc_reg.this.AV10P_CSV = aP0;
      b506_pc07_crf_memo_loc_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc07_crf_memo_loc_reg.this.AV9P_APP_ID = aP2;
      b506_pc07_crf_memo_loc_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc07_crf_memo_loc_reg.this.aP5 = new String[] {""};
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
      b506_pc07_crf_memo_loc_reg.this.AV10P_CSV = aP0;
      b506_pc07_crf_memo_loc_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc07_crf_memo_loc_reg.this.AV9P_APP_ID = aP2;
      b506_pc07_crf_memo_loc_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc07_crf_memo_loc_reg.this.aP4 = aP4;
      b506_pc07_crf_memo_loc_reg.this.aP5 = aP5;
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
      b506_pc07_crf_memo_loc_reg.this.GXt_char1 = GXv_char2[0] ;
      AV16W_NEWLINE = GXt_char1 ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV19C_APP_ID );
      /* Execute user subroutine: S1165 */
      S1165 ();
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
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV13W_CNT)), 9, "CRFメモ位置テーブル", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b506_pc07_crf_memo_loc_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
         b506_pc07_crf_memo_loc_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
         if ( AV17W_RTN_CD != 0 )
         {
            if (true) break;
         }
         /*
            INSERT RECORD ON TABLE TBW07_CRF_MEMO_LOC

         */
         A714TBW07_SESSION_ID = AV12P_SESSION_ID ;
         A715TBW07_APP_ID = AV9P_APP_ID ;
         A716TBW07_DISP_DATETIME = AV11P_DISP_DATETIME ;
         A717TBW07_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A718TBW07_SUBJECT_ID = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A719TBW07_INS_NO = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+3))) ;
         A720TBW07_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+4))) ;
         A721TBW07_CRF_VERSION = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
         A722TBW07_X = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+6))) ;
         A723TBW07_Y = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+7))) ;
         A724TBW07_EDIT_REQUEST_FLG = (String)AV14W_CSV_COL.elementAt(-1+8) ;
         n724TBW07_EDIT_REQUEST_FLG = false ;
         A725TBW07_COLOR_DIV = (String)AV14W_CSV_COL.elementAt(-1+9) ;
         n725TBW07_COLOR_DIV = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBW07_CRF_MEMO_LOC" ;
         /* Using cursor P00352 */
         pr_default.execute(0, new Object[] {A714TBW07_SESSION_ID, A715TBW07_APP_ID, A716TBW07_DISP_DATETIME, new Long(A717TBW07_STUDY_ID), new Integer(A718TBW07_SUBJECT_ID), new Short(A719TBW07_INS_NO), new Short(A720TBW07_CRF_ID), new Short(A721TBW07_CRF_VERSION), new Short(A722TBW07_X), new Short(A723TBW07_Y), new Boolean(n724TBW07_EDIT_REQUEST_FLG), A724TBW07_EDIT_REQUEST_FLG, new Boolean(n725TBW07_COLOR_DIV), A725TBW07_COLOR_DIV});
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

   public void S1165( )
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
      b506_pc07_crf_memo_loc_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc07_crf_memo_loc_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
   }

   public void S1297( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV20W_EXTRA_INFO;
      GXv_int5[0] = AV17W_RTN_CD ;
      GXv_char2[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b506_pc07_crf_memo_loc_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc07_crf_memo_loc_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b506_pc07_crf_memo_loc_reg.this.AV17W_RTN_CD;
      this.aP5[0] = b506_pc07_crf_memo_loc_reg.this.AV18W_RTN_MSG;
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
                  /* Execute user subroutine: S1297 */
                  S1297 ();
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
      A714TBW07_SESSION_ID = "" ;
      A715TBW07_APP_ID = "" ;
      A716TBW07_DISP_DATETIME = "" ;
      A724TBW07_EDIT_REQUEST_FLG = "" ;
      A725TBW07_COLOR_DIV = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      Gx_emsg = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV25Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b506_pc07_crf_memo_loc_reg__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B506_PC07_CRF_MEMO_LOC_REG" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B506_PC07_CRF_MEMO_LOC_REG" ;
      Gx_err = (short)(0) ;
   }

   private short AV17W_RTN_CD ;
   private short A719TBW07_INS_NO ;
   private short A720TBW07_CRF_ID ;
   private short A721TBW07_CRF_VERSION ;
   private short A722TBW07_X ;
   private short A723TBW07_Y ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS45 ;
   private int A718TBW07_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private long A717TBW07_STUDY_ID ;
   private String GXt_char1 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String AV25Pgmname ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private boolean n724TBW07_EDIT_REQUEST_FLG ;
   private boolean n725TBW07_COLOR_DIV ;
   private String AV10P_CSV ;
   private String AV12P_SESSION_ID ;
   private String AV9P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV18W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String AV16W_NEWLINE ;
   private String A714TBW07_SESSION_ID ;
   private String A715TBW07_APP_ID ;
   private String A716TBW07_DISP_DATETIME ;
   private String A724TBW07_EDIT_REQUEST_FLG ;
   private String A725TBW07_COLOR_DIV ;
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

final  class b506_pc07_crf_memo_loc_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00352", "INSERT INTO `TBW07_CRF_MEMO_LOC` (`TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[13], 2);
               }
               break;
      }
   }

}

