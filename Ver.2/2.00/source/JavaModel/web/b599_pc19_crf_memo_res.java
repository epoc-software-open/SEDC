/*
               File: B599_PC19_CRF_MEMO_RES
        Description: CRFÉÅÉÇÉeÅ[ÉuÉãéÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:57.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc19_crf_memo_res extends GXProcedure
{
   public b599_pc19_crf_memo_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc19_crf_memo_res.class ), "" );
   }

   public b599_pc19_crf_memo_res( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b599_pc19_crf_memo_res.this.AV9P_STUDY_ID = aP0;
      b599_pc19_crf_memo_res.this.AV10P_SUBJECT_ID = aP1;
      b599_pc19_crf_memo_res.this.AV8P_INS_NO = aP2;
      b599_pc19_crf_memo_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc19_crf_memo_res.this.aP4 = aP4;
      b599_pc19_crf_memo_res.this.aP5 = aP5;
      b599_pc19_crf_memo_res.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b599_pc19_crf_memo_res.this.AV9P_STUDY_ID = aP0;
      b599_pc19_crf_memo_res.this.AV10P_SUBJECT_ID = aP1;
      b599_pc19_crf_memo_res.this.AV8P_INS_NO = aP2;
      b599_pc19_crf_memo_res.this.AV13W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc19_crf_memo_res.this.aP4 = aP4;
      b599_pc19_crf_memo_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17C_APP_ID = "B599" ;
      AV12W_RTN_CD = (short)(0) ;
      AV14W_RTN_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV17C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_SUBJECT_ID = (int)(GXutil.lval( AV10P_SUBJECT_ID)) ;
      AV11W_INS_NO = (short)(GXutil.lval( AV8P_INS_NO)) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_SUBJECT_ID" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_SUBJECT_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_INS_NO" );
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_INS_NO );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
      GXv_int2[0] = AV12W_RTN_CD ;
      GXv_char3[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b599_pc19_crf_memo_res.this.AV12W_RTN_CD = GXv_int2[0] ;
      b599_pc19_crf_memo_res.this.AV14W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
      GXv_int2[0] = AV12W_RTN_CD ;
      GXv_char3[0] = AV14W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b599_pc19_crf_memo_res.this.AV12W_RTN_CD = GXv_int2[0] ;
      b599_pc19_crf_memo_res.this.AV14W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc19_crf_memo_res.this.AV13W_RTN_CSV;
      this.aP4[0] = b599_pc19_crf_memo_res.this.AV12W_RTN_CD;
      this.aP5[0] = b599_pc19_crf_memo_res.this.AV14W_RTN_MSG;
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
      AV14W_RTN_MSG = "" ;
      AV17C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV20W_MSG = "" ;
      AV23Pgmname = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV23Pgmname = "B599_PC19_CRF_MEMO_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC19_CRF_MEMO_RES" ;
      Gx_err = (short)(0) ;
   }

   private short AV12W_RTN_CD ;
   private short AV11W_INS_NO ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int AV16W_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private String AV23Pgmname ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10P_SUBJECT_ID ;
   private String AV8P_INS_NO ;
   private String AV14W_RTN_MSG ;
   private String AV17C_APP_ID ;
   private String AV20W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private GxObjectCollection AV13W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

