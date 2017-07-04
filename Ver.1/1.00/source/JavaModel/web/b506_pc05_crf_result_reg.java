/*
               File: B506_PC05_CRF_RESULT_REG
        Description: CRF入力結果テーブルワーク登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:26.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b506_pc05_crf_result_reg extends GXProcedure
{
   public b506_pc05_crf_result_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b506_pc05_crf_result_reg.class ), "" );
   }

   public b506_pc05_crf_result_reg( int remoteHandle ,
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
      b506_pc05_crf_result_reg.this.AV10P_CSV = aP0;
      b506_pc05_crf_result_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc05_crf_result_reg.this.AV9P_APP_ID = aP2;
      b506_pc05_crf_result_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc05_crf_result_reg.this.aP5 = new String[] {""};
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
      b506_pc05_crf_result_reg.this.AV10P_CSV = aP0;
      b506_pc05_crf_result_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc05_crf_result_reg.this.AV9P_APP_ID = aP2;
      b506_pc05_crf_result_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc05_crf_result_reg.this.aP4 = aP4;
      b506_pc05_crf_result_reg.this.aP5 = aP5;
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
      b506_pc05_crf_result_reg.this.GXt_char1 = GXv_char2[0] ;
      AV16W_NEWLINE = GXt_char1 ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV19C_APP_ID );
      /* Execute user subroutine: S1163 */
      S1163 ();
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
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV13W_CNT)), 7, "CRF入力結果テーブル", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b506_pc05_crf_result_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
         b506_pc05_crf_result_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
         if ( AV17W_RTN_CD != 0 )
         {
            if (true) break;
         }
         /*
            INSERT RECORD ON TABLE TBW05_CRF_RESULT

         */
         A688TBW05_SESSION_ID = AV12P_SESSION_ID ;
         A689TBW05_APP_ID = AV9P_APP_ID ;
         A690TBW05_DISP_DATETIME = AV11P_DISP_DATETIME ;
         A691TBW05_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A692TBW05_SUBJECT_ID = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A693TBW05_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+3))) ;
         A694TBW05_CRF_ITEM_GRP_DIV = (String)AV14W_CSV_COL.elementAt(-1+4) ;
         A695TBW05_CRF_ITEM_GRP_CD = (String)AV14W_CSV_COL.elementAt(-1+5) ;
         A696TBW05_CRF_VALUE = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n696TBW05_CRF_VALUE = false ;
         A697TBW05_EDIT_FLG = (String)AV14W_CSV_COL.elementAt(-1+7) ;
         n697TBW05_EDIT_FLG = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBW05_CRF_RESULT" ;
         /* Using cursor P00332 */
         pr_default.execute(0, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD, new Boolean(n696TBW05_CRF_VALUE), A696TBW05_CRF_VALUE, new Boolean(n697TBW05_EDIT_FLG), A697TBW05_EDIT_FLG});
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

   public void S1163( )
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
      b506_pc05_crf_result_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc05_crf_result_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
   }

   public void S1295( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV20W_EXTRA_INFO;
      GXv_int5[0] = AV17W_RTN_CD ;
      GXv_char2[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b506_pc05_crf_result_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc05_crf_result_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b506_pc05_crf_result_reg.this.AV17W_RTN_CD;
      this.aP5[0] = b506_pc05_crf_result_reg.this.AV18W_RTN_MSG;
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
                  /* Execute user subroutine: S1295 */
                  S1295 ();
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
      A688TBW05_SESSION_ID = "" ;
      A689TBW05_APP_ID = "" ;
      A690TBW05_DISP_DATETIME = "" ;
      A694TBW05_CRF_ITEM_GRP_DIV = "" ;
      A695TBW05_CRF_ITEM_GRP_CD = "" ;
      A696TBW05_CRF_VALUE = "" ;
      A697TBW05_EDIT_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      Gx_emsg = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV25Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b506_pc05_crf_result_reg__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B506_PC05_CRF_RESULT_REG" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B506_PC05_CRF_RESULT_REG" ;
      Gx_err = (short)(0) ;
   }

   private short AV17W_RTN_CD ;
   private short A693TBW05_CRF_ID ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS43 ;
   private int A692TBW05_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private long A691TBW05_STUDY_ID ;
   private String GXt_char1 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String AV25Pgmname ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private boolean n696TBW05_CRF_VALUE ;
   private boolean n697TBW05_EDIT_FLG ;
   private String AV10P_CSV ;
   private String AV12P_SESSION_ID ;
   private String AV9P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV18W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String AV16W_NEWLINE ;
   private String A688TBW05_SESSION_ID ;
   private String A689TBW05_APP_ID ;
   private String A690TBW05_DISP_DATETIME ;
   private String A694TBW05_CRF_ITEM_GRP_DIV ;
   private String A695TBW05_CRF_ITEM_GRP_CD ;
   private String A696TBW05_CRF_VALUE ;
   private String A697TBW05_EDIT_FLG ;
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

final  class b506_pc05_crf_result_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00332", "INSERT INTO `TBW05_CRF_RESULT` (`TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[9], 2000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[11], 1);
               }
               break;
      }
   }

}

