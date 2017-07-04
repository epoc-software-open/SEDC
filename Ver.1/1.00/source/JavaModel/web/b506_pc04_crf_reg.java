/*
               File: B506_PC04_CRF_REG
        Description: CRFテーブルワーク登録
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:25.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b506_pc04_crf_reg extends GXProcedure
{
   public b506_pc04_crf_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b506_pc04_crf_reg.class ), "" );
   }

   public b506_pc04_crf_reg( int remoteHandle ,
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
      b506_pc04_crf_reg.this.AV10P_CSV = aP0;
      b506_pc04_crf_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc04_crf_reg.this.AV9P_APP_ID = aP2;
      b506_pc04_crf_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc04_crf_reg.this.aP5 = new String[] {""};
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
      b506_pc04_crf_reg.this.AV10P_CSV = aP0;
      b506_pc04_crf_reg.this.AV12P_SESSION_ID = aP1;
      b506_pc04_crf_reg.this.AV9P_APP_ID = aP2;
      b506_pc04_crf_reg.this.AV11P_DISP_DATETIME = aP3;
      b506_pc04_crf_reg.this.aP4 = aP4;
      b506_pc04_crf_reg.this.aP5 = aP5;
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
      b506_pc04_crf_reg.this.GXt_char1 = GXv_char2[0] ;
      AV16W_NEWLINE = GXt_char1 ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV19C_APP_ID );
      /* Execute user subroutine: S1180 */
      S1180 ();
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
         new b807_pc02_csv_col_parse_air(remoteHandle, context).execute( (String)AV15W_CSV_ROW.elementAt(-1+(int)(AV13W_CNT)), 24, "CRFテーブル", GXv_objcol_char4, GXv_int5, GXv_char2) ;
         AV14W_CSV_COL = GXv_objcol_char4[0] ;
         b506_pc04_crf_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
         b506_pc04_crf_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
         if ( AV17W_RTN_CD != 0 )
         {
            if (true) break;
         }
         /*
            INSERT RECORD ON TABLE TBW04_CRF

         */
         A661TBW04_SESSION_ID = AV12P_SESSION_ID ;
         A662TBW04_APP_ID = AV9P_APP_ID ;
         A663TBW04_DISP_DATETIME = AV11P_DISP_DATETIME ;
         A664TBW04_STUDY_ID = GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+1)) ;
         A665TBW04_SUBJECT_ID = (int)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+2))) ;
         A666TBW04_CRF_ID = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+3))) ;
         A667TBW04_CRF_LATEST_VERSION = (short)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+4))) ;
         n667TBW04_CRF_LATEST_VERSION = false ;
         A668TBW04_CRF_INPUT_LEVEL = (byte)(GXutil.lval( (String)AV14W_CSV_COL.elementAt(-1+5))) ;
         n668TBW04_CRF_INPUT_LEVEL = false ;
         A669TBW04_LOCK_FLG = (String)AV14W_CSV_COL.elementAt(-1+6) ;
         n669TBW04_LOCK_FLG = false ;
         A670TBW04_LOCK_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+7), 6) ;
         n670TBW04_LOCK_DATETIME = false ;
         A671TBW04_LOCK_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+8) ;
         n671TBW04_LOCK_USER_ID = false ;
         A672TBW04_LOCK_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+9) ;
         n672TBW04_LOCK_AUTH_CD = false ;
         A673TBW04_UPLOAD_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+10), 6) ;
         n673TBW04_UPLOAD_DATETIME = false ;
         A674TBW04_UPLOAD_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+11) ;
         n674TBW04_UPLOAD_USER_ID = false ;
         A675TBW04_UPLOAD_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+12) ;
         n675TBW04_UPLOAD_AUTH_CD = false ;
         A676TBW04_DM_ARRIVAL_FLG = (String)AV14W_CSV_COL.elementAt(-1+13) ;
         n676TBW04_DM_ARRIVAL_FLG = false ;
         A677TBW04_DM_ARRIVAL_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+14), 6) ;
         n677TBW04_DM_ARRIVAL_DATETIME = false ;
         A678TBW04_APPROVAL_FLG = (String)AV14W_CSV_COL.elementAt(-1+15) ;
         n678TBW04_APPROVAL_FLG = false ;
         A679TBW04_APPROVAL_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+16), 6) ;
         n679TBW04_APPROVAL_DATETIME = false ;
         A680TBW04_APPROVAL_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+17) ;
         n680TBW04_APPROVAL_USER_ID = false ;
         A681TBW04_APPROVAL_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+18) ;
         n681TBW04_APPROVAL_AUTH_CD = false ;
         A682TBW04_INPUT_END_FLG = (String)AV14W_CSV_COL.elementAt(-1+19) ;
         n682TBW04_INPUT_END_FLG = false ;
         A683TBW04_INPUT_END_DATETIME = localUtil.ctot( (String)AV14W_CSV_COL.elementAt(-1+20), 6) ;
         n683TBW04_INPUT_END_DATETIME = false ;
         A684TBW04_INPUT_END_USER_ID = (String)AV14W_CSV_COL.elementAt(-1+21) ;
         n684TBW04_INPUT_END_USER_ID = false ;
         A685TBW04_INPUT_END_AUTH_CD = (String)AV14W_CSV_COL.elementAt(-1+22) ;
         n685TBW04_INPUT_END_AUTH_CD = false ;
         A686TBW04_COMPLETION_FLG = (String)AV14W_CSV_COL.elementAt(-1+23) ;
         n686TBW04_COMPLETION_FLG = false ;
         A687TBW04_EDIT_FLG = (String)AV14W_CSV_COL.elementAt(-1+24) ;
         n687TBW04_EDIT_FLG = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBW04_CRF" ;
         /* Using cursor P00322 */
         pr_default.execute(0, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID), new Boolean(n667TBW04_CRF_LATEST_VERSION), new Short(A667TBW04_CRF_LATEST_VERSION), new Boolean(n668TBW04_CRF_INPUT_LEVEL), new Byte(A668TBW04_CRF_INPUT_LEVEL), new Boolean(n669TBW04_LOCK_FLG), A669TBW04_LOCK_FLG, new Boolean(n670TBW04_LOCK_DATETIME), A670TBW04_LOCK_DATETIME, new Boolean(n671TBW04_LOCK_USER_ID), A671TBW04_LOCK_USER_ID, new Boolean(n672TBW04_LOCK_AUTH_CD), A672TBW04_LOCK_AUTH_CD, new Boolean(n673TBW04_UPLOAD_DATETIME), A673TBW04_UPLOAD_DATETIME, new Boolean(n674TBW04_UPLOAD_USER_ID), A674TBW04_UPLOAD_USER_ID, new Boolean(n675TBW04_UPLOAD_AUTH_CD), A675TBW04_UPLOAD_AUTH_CD, new Boolean(n676TBW04_DM_ARRIVAL_FLG), A676TBW04_DM_ARRIVAL_FLG, new Boolean(n677TBW04_DM_ARRIVAL_DATETIME), A677TBW04_DM_ARRIVAL_DATETIME, new Boolean(n678TBW04_APPROVAL_FLG), A678TBW04_APPROVAL_FLG, new Boolean(n679TBW04_APPROVAL_DATETIME), A679TBW04_APPROVAL_DATETIME, new Boolean(n680TBW04_APPROVAL_USER_ID), A680TBW04_APPROVAL_USER_ID, new Boolean(n681TBW04_APPROVAL_AUTH_CD), A681TBW04_APPROVAL_AUTH_CD, new Boolean(n682TBW04_INPUT_END_FLG), A682TBW04_INPUT_END_FLG, new Boolean(n683TBW04_INPUT_END_DATETIME), A683TBW04_INPUT_END_DATETIME, new Boolean(n684TBW04_INPUT_END_USER_ID), A684TBW04_INPUT_END_USER_ID, new Boolean(n685TBW04_INPUT_END_AUTH_CD), A685TBW04_INPUT_END_AUTH_CD, new Boolean(n686TBW04_COMPLETION_FLG), A686TBW04_COMPLETION_FLG, new Boolean(n687TBW04_EDIT_FLG), A687TBW04_EDIT_FLG});
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

   public void S1180( )
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
      b506_pc04_crf_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc04_crf_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
   }

   public void S12112( )
   {
      /* 'SUB_ERROR' Routine */
      AV22W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV20W_EXTRA_INFO;
      GXv_int5[0] = AV17W_RTN_CD ;
      GXv_char2[0] = AV18W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV22W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b506_pc04_crf_reg.this.AV17W_RTN_CD = GXv_int5[0] ;
      b506_pc04_crf_reg.this.AV18W_RTN_MSG = GXv_char2[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b506_pc04_crf_reg.this.AV17W_RTN_CD;
      this.aP5[0] = b506_pc04_crf_reg.this.AV18W_RTN_MSG;
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
                  /* Execute user subroutine: S12112 */
                  S12112 ();
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
      A661TBW04_SESSION_ID = "" ;
      A662TBW04_APP_ID = "" ;
      A663TBW04_DISP_DATETIME = "" ;
      A669TBW04_LOCK_FLG = "" ;
      A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A671TBW04_LOCK_USER_ID = "" ;
      A672TBW04_LOCK_AUTH_CD = "" ;
      A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A674TBW04_UPLOAD_USER_ID = "" ;
      A675TBW04_UPLOAD_AUTH_CD = "" ;
      A676TBW04_DM_ARRIVAL_FLG = "" ;
      A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A678TBW04_APPROVAL_FLG = "" ;
      A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A680TBW04_APPROVAL_USER_ID = "" ;
      A681TBW04_APPROVAL_AUTH_CD = "" ;
      A682TBW04_INPUT_END_FLG = "" ;
      A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A684TBW04_INPUT_END_USER_ID = "" ;
      A685TBW04_INPUT_END_AUTH_CD = "" ;
      A686TBW04_COMPLETION_FLG = "" ;
      A687TBW04_EDIT_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      Gx_emsg = "" ;
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_MSG = "" ;
      AV25Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b506_pc04_crf_reg__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV25Pgmname = "B506_PC04_CRF_REG" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B506_PC04_CRF_REG" ;
      Gx_err = (short)(0) ;
   }

   private byte A668TBW04_CRF_INPUT_LEVEL ;
   private short AV17W_RTN_CD ;
   private short A666TBW04_CRF_ID ;
   private short A667TBW04_CRF_LATEST_VERSION ;
   private short Gx_err ;
   private short GXv_int5[] ;
   private int GX_INS42 ;
   private int A665TBW04_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV13W_CNT ;
   private long A664TBW04_STUDY_ID ;
   private String GXt_char1 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String AV25Pgmname ;
   private String GXv_char2[] ;
   private java.util.Date A670TBW04_LOCK_DATETIME ;
   private java.util.Date A673TBW04_UPLOAD_DATETIME ;
   private java.util.Date A677TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date A679TBW04_APPROVAL_DATETIME ;
   private java.util.Date A683TBW04_INPUT_END_DATETIME ;
   private boolean returnInSub ;
   private boolean n667TBW04_CRF_LATEST_VERSION ;
   private boolean n668TBW04_CRF_INPUT_LEVEL ;
   private boolean n669TBW04_LOCK_FLG ;
   private boolean n670TBW04_LOCK_DATETIME ;
   private boolean n671TBW04_LOCK_USER_ID ;
   private boolean n672TBW04_LOCK_AUTH_CD ;
   private boolean n673TBW04_UPLOAD_DATETIME ;
   private boolean n674TBW04_UPLOAD_USER_ID ;
   private boolean n675TBW04_UPLOAD_AUTH_CD ;
   private boolean n676TBW04_DM_ARRIVAL_FLG ;
   private boolean n677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean n678TBW04_APPROVAL_FLG ;
   private boolean n679TBW04_APPROVAL_DATETIME ;
   private boolean n680TBW04_APPROVAL_USER_ID ;
   private boolean n681TBW04_APPROVAL_AUTH_CD ;
   private boolean n682TBW04_INPUT_END_FLG ;
   private boolean n683TBW04_INPUT_END_DATETIME ;
   private boolean n684TBW04_INPUT_END_USER_ID ;
   private boolean n685TBW04_INPUT_END_AUTH_CD ;
   private boolean n686TBW04_COMPLETION_FLG ;
   private boolean n687TBW04_EDIT_FLG ;
   private String AV10P_CSV ;
   private String AV12P_SESSION_ID ;
   private String AV9P_APP_ID ;
   private String AV11P_DISP_DATETIME ;
   private String AV18W_RTN_MSG ;
   private String AV19C_APP_ID ;
   private String AV16W_NEWLINE ;
   private String A661TBW04_SESSION_ID ;
   private String A662TBW04_APP_ID ;
   private String A663TBW04_DISP_DATETIME ;
   private String A669TBW04_LOCK_FLG ;
   private String A671TBW04_LOCK_USER_ID ;
   private String A672TBW04_LOCK_AUTH_CD ;
   private String A674TBW04_UPLOAD_USER_ID ;
   private String A675TBW04_UPLOAD_AUTH_CD ;
   private String A676TBW04_DM_ARRIVAL_FLG ;
   private String A678TBW04_APPROVAL_FLG ;
   private String A680TBW04_APPROVAL_USER_ID ;
   private String A681TBW04_APPROVAL_AUTH_CD ;
   private String A682TBW04_INPUT_END_FLG ;
   private String A684TBW04_INPUT_END_USER_ID ;
   private String A685TBW04_INPUT_END_AUTH_CD ;
   private String A686TBW04_COMPLETION_FLG ;
   private String A687TBW04_EDIT_FLG ;
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

final  class b506_pc04_crf_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00322", "INSERT INTO `TBW04_CRF` (`TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
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
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
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
                  stmt.setVarchar(12, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[41], 128);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[47], 1);
               }
               break;
      }
   }

}

