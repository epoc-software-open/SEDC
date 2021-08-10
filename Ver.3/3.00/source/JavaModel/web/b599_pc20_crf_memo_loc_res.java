/*
               File: B599_PC20_CRF_MEMO_LOC_RES
        Description: CRFメモ位置テーブル取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:40.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc20_crf_memo_loc_res extends GXProcedure
{
   public b599_pc20_crf_memo_loc_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc20_crf_memo_loc_res.class ), "" );
   }

   public b599_pc20_crf_memo_loc_res( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             GxObjectCollection[] aP7 ,
                             short[] aP8 )
   {
      b599_pc20_crf_memo_loc_res.this.AV11P_STUDY_ID = aP0;
      b599_pc20_crf_memo_loc_res.this.AV12P_SUBJECT_ID = aP1;
      b599_pc20_crf_memo_loc_res.this.AV10P_INS_NO = aP2;
      b599_pc20_crf_memo_loc_res.this.AV8P_CRF_ID = aP3;
      b599_pc20_crf_memo_loc_res.this.AV9P_CRF_VERSION = aP4;
      b599_pc20_crf_memo_loc_res.this.AV13P_X = aP5;
      b599_pc20_crf_memo_loc_res.this.AV14P_Y = aP6;
      b599_pc20_crf_memo_loc_res.this.AV19W_RTN_CSV = aP7[0];
      this.aP7 = aP7;
      b599_pc20_crf_memo_loc_res.this.aP8 = aP8;
      b599_pc20_crf_memo_loc_res.this.aP9 = aP9;
      b599_pc20_crf_memo_loc_res.this.aP9 = new String[] {""};
      initialize();
      privateExecute();
      return aP9[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String aP6 ,
                        GxObjectCollection[] aP7 ,
                        short[] aP8 ,
                        String[] aP9 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7, aP8, aP9);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String aP6 ,
                             GxObjectCollection[] aP7 ,
                             short[] aP8 ,
                             String[] aP9 )
   {
      b599_pc20_crf_memo_loc_res.this.AV11P_STUDY_ID = aP0;
      b599_pc20_crf_memo_loc_res.this.AV12P_SUBJECT_ID = aP1;
      b599_pc20_crf_memo_loc_res.this.AV10P_INS_NO = aP2;
      b599_pc20_crf_memo_loc_res.this.AV8P_CRF_ID = aP3;
      b599_pc20_crf_memo_loc_res.this.AV9P_CRF_VERSION = aP4;
      b599_pc20_crf_memo_loc_res.this.AV13P_X = aP5;
      b599_pc20_crf_memo_loc_res.this.AV14P_Y = aP6;
      b599_pc20_crf_memo_loc_res.this.AV19W_RTN_CSV = aP7[0];
      this.aP7 = aP7;
      b599_pc20_crf_memo_loc_res.this.aP8 = aP8;
      b599_pc20_crf_memo_loc_res.this.aP9 = aP9;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV25C_APP_ID = "B599" ;
      AV18W_RTN_CD = (short)(0) ;
      AV20W_RTN_MSG = "" ;
      AV26W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV25C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_SUBJECT_ID = (int)(GXutil.lval( AV12P_SUBJECT_ID)) ;
      AV17W_INS_NO = (short)(GXutil.lval( AV10P_INS_NO)) ;
      AV15W_CRF_ID = (short)(GXutil.lval( AV8P_CRF_ID)) ;
      AV16W_CRF_VERSION = (short)(GXutil.lval( AV9P_CRF_VERSION)) ;
      AV23W_X = (short)(GXutil.lval( AV13P_X)) ;
      AV24W_Y = (short)(GXutil.lval( AV14P_Y)) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_SUBJECT_ID );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_INS_NO" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_INS_NO );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_ID" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CRF_VERSION" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF_VERSION );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_X" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_X );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV27W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_Y" );
      AV27W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_Y );
      AV26W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV27W_PARMS_ITEM, 0);
      AV28W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV26W_EXTRA_INFO;
      GXv_int2[0] = AV18W_RTN_CD ;
      GXv_char3[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV31Pgmname, (short)(1), AV28W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b599_pc20_crf_memo_loc_res.this.AV18W_RTN_CD = GXv_int2[0] ;
      b599_pc20_crf_memo_loc_res.this.AV20W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV28W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV26W_EXTRA_INFO;
      GXv_int2[0] = AV18W_RTN_CD ;
      GXv_char3[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV31Pgmname, (short)(0), AV28W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV26W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b599_pc20_crf_memo_loc_res.this.AV18W_RTN_CD = GXv_int2[0] ;
      b599_pc20_crf_memo_loc_res.this.AV20W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP7[0] = b599_pc20_crf_memo_loc_res.this.AV19W_RTN_CSV;
      this.aP8[0] = b599_pc20_crf_memo_loc_res.this.AV18W_RTN_CD;
      this.aP9[0] = b599_pc20_crf_memo_loc_res.this.AV20W_RTN_MSG;
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
      AV20W_RTN_MSG = "" ;
      AV25C_APP_ID = "" ;
      AV26W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_MSG = "" ;
      AV31Pgmname = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV31Pgmname = "B599_PC20_CRF_MEMO_LOC_RES" ;
      /* GeneXus formulas. */
      AV31Pgmname = "B599_PC20_CRF_MEMO_LOC_RES" ;
      Gx_err = (short)(0) ;
   }

   private short AV18W_RTN_CD ;
   private short AV17W_INS_NO ;
   private short AV15W_CRF_ID ;
   private short AV16W_CRF_VERSION ;
   private short AV23W_X ;
   private short AV24W_Y ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV22W_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private String AV31Pgmname ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV12P_SUBJECT_ID ;
   private String AV10P_INS_NO ;
   private String AV8P_CRF_ID ;
   private String AV9P_CRF_VERSION ;
   private String AV13P_X ;
   private String AV14P_Y ;
   private String AV20W_RTN_MSG ;
   private String AV25C_APP_ID ;
   private String AV28W_MSG ;
   private GxObjectCollection[] aP7 ;
   private short[] aP8 ;
   private String[] aP9 ;
   private GxObjectCollection AV19W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV26W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV27W_PARMS_ITEM ;
}

