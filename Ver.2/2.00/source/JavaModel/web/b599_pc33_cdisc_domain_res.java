/*
               File: B599_PC33_CDISC_DOMAIN_RES
        Description: CDISCドメインマスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:51.34
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc33_cdisc_domain_res extends GXProcedure
{
   public b599_pc33_cdisc_domain_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc33_cdisc_domain_res.class ), "" );
   }

   public b599_pc33_cdisc_domain_res( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc33_cdisc_domain_res.this.AV17P_STUDY_ID = aP0;
      b599_pc33_cdisc_domain_res.this.AV9P_DOM_CD = aP1;
      b599_pc33_cdisc_domain_res.this.AV14W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc33_cdisc_domain_res.this.aP3 = aP3;
      b599_pc33_cdisc_domain_res.this.aP4 = aP4;
      b599_pc33_cdisc_domain_res.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b599_pc33_cdisc_domain_res.this.AV17P_STUDY_ID = aP0;
      b599_pc33_cdisc_domain_res.this.AV9P_DOM_CD = aP1;
      b599_pc33_cdisc_domain_res.this.AV14W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc33_cdisc_domain_res.this.aP3 = aP3;
      b599_pc33_cdisc_domain_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B599" ;
      AV13W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      AV10W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV10W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20GXLvl32 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           new Long(AV17P_STUDY_ID) ,
                                           AV9P_DOM_CD ,
                                           new Long(A203TBM42_STUDY_ID) ,
                                           A204TBM42_DOM_CD ,
                                           A893TBM42_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM42_STUDY_CDISC_DOMAIN" ;
      /* Using cursor P00262 */
      pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), AV9P_DOM_CD});
      if ( Gx_err != 0 )
      {
         AV20GXLvl32 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A893TBM42_DEL_FLG = P00262_A893TBM42_DEL_FLG[0] ;
         n893TBM42_DEL_FLG = P00262_n893TBM42_DEL_FLG[0] ;
         A204TBM42_DOM_CD = P00262_A204TBM42_DOM_CD[0] ;
         A203TBM42_STUDY_ID = P00262_A203TBM42_STUDY_ID[0] ;
         A906TBM42_DOM_JNM = P00262_A906TBM42_DOM_JNM[0] ;
         n906TBM42_DOM_JNM = P00262_n906TBM42_DOM_JNM[0] ;
         AV20GXLvl32 = (byte)(1) ;
         GXt_char1 = AV16W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A204TBM42_DOM_CD, GXv_char2) ;
         b599_pc33_cdisc_domain_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV16W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A906TBM42_DOM_JNM, GXv_char4) ;
         b599_pc33_cdisc_domain_res.this.GXt_char3 = GXv_char4[0] ;
         AV16W_STR = GXt_char1 + "," + GXt_char3 ;
         AV14W_RTN_CSV.add(AV16W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV20GXLvl32 == 0 )
      {
         AV13W_RTN_CD = (short)(1) ;
         GXt_char3 = AV15W_RTN_MSG ;
         GXv_char4[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char4) ;
         b599_pc33_cdisc_domain_res.this.GXt_char3 = GXv_char4[0] ;
         AV15W_RTN_MSG = GXt_char3 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV10W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV12W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV12W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV12W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV17P_STUDY_ID, 10, 0)) );
      AV10W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV12W_PARMS_ITEM, 0);
      AV12W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV12W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DOM_CD" );
      AV12W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DOM_CD );
      AV10W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV12W_PARMS_ITEM, 0);
      AV11W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV10W_EXTRA_INFO;
      GXv_int6[0] = AV13W_RTN_CD ;
      GXv_char4[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(1), AV11W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int6, GXv_char4) ;
      AV10W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      b599_pc33_cdisc_domain_res.this.AV13W_RTN_CD = GXv_int6[0] ;
      b599_pc33_cdisc_domain_res.this.AV15W_RTN_MSG = GXv_char4[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV11W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV10W_EXTRA_INFO;
      GXv_int6[0] = AV13W_RTN_CD ;
      GXv_char4[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV21Pgmname, (short)(0), AV11W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int6, GXv_char4) ;
      AV10W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      b599_pc33_cdisc_domain_res.this.AV13W_RTN_CD = GXv_int6[0] ;
      b599_pc33_cdisc_domain_res.this.AV15W_RTN_MSG = GXv_char4[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc33_cdisc_domain_res.this.AV14W_RTN_CSV;
      this.aP3[0] = b599_pc33_cdisc_domain_res.this.AV13W_RTN_CD;
      this.aP4[0] = b599_pc33_cdisc_domain_res.this.AV15W_RTN_MSG;
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
      AV15W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV10W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A204TBM42_DOM_CD = "" ;
      A893TBM42_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00262_A893TBM42_DEL_FLG = new String[] {""} ;
      P00262_n893TBM42_DEL_FLG = new boolean[] {false} ;
      P00262_A204TBM42_DOM_CD = new String[] {""} ;
      P00262_A203TBM42_STUDY_ID = new long[1] ;
      P00262_A906TBM42_DOM_JNM = new String[] {""} ;
      P00262_n906TBM42_DOM_JNM = new boolean[] {false} ;
      A906TBM42_DOM_JNM = "" ;
      AV16W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      AV12W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV11W_MSG = "" ;
      AV21Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int6 = new short [1] ;
      GXv_char4 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc33_cdisc_domain_res__default(),
         new Object[] {
             new Object[] {
            P00262_A893TBM42_DEL_FLG, P00262_n893TBM42_DEL_FLG, P00262_A204TBM42_DOM_CD, P00262_A203TBM42_STUDY_ID, P00262_A906TBM42_DOM_JNM, P00262_n906TBM42_DOM_JNM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B599_PC33_CDISC_DOMAIN_RES" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B599_PC33_CDISC_DOMAIN_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl32 ;
   private short AV13W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int6[] ;
   private int GXActiveErrHndl ;
   private long AV17P_STUDY_ID ;
   private long A203TBM42_STUDY_ID ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String AV21Pgmname ;
   private String GXv_char4[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n906TBM42_DOM_JNM ;
   private String AV9P_DOM_CD ;
   private String AV15W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A204TBM42_DOM_CD ;
   private String A893TBM42_DEL_FLG ;
   private String A906TBM42_DOM_JNM ;
   private String AV16W_STR ;
   private String AV11W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P00262_A893TBM42_DEL_FLG ;
   private boolean[] P00262_n893TBM42_DEL_FLG ;
   private String[] P00262_A204TBM42_DOM_CD ;
   private long[] P00262_A203TBM42_STUDY_ID ;
   private String[] P00262_A906TBM42_DOM_JNM ;
   private boolean[] P00262_n906TBM42_DOM_JNM ;
   private GxObjectCollection AV14W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV10W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV12W_PARMS_ITEM ;
}

final  class b599_pc33_cdisc_domain_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00262( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          long AV17P_STUDY_ID ,
                                          String AV9P_DOM_CD ,
                                          long A203TBM42_STUDY_ID ,
                                          String A204TBM42_DOM_CD ,
                                          String A893TBM42_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int7 ;
      GXv_int7 = new byte [2] ;
      Object[] GXv_Object8 ;
      GXv_Object8 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM42_STUDY_CDISC_DOMAIN" ;
      scmdbuf = "SELECT `TBM42_DEL_FLG`, `TBM42_DOM_CD`, `TBM42_STUDY_ID`, `TBM42_DOM_JNM` FROM `TBM42_STUDY_CDISC_DOMAIN`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM42_DEL_FLG` = '0')" ;
      if ( ! (0==AV17P_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM42_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int7[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM42_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int7[1] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM42_DOM_CD`" ;
      GXv_Object8[0] = scmdbuf ;
      GXv_Object8[1] = GXv_int7 ;
      return GXv_Object8 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00262(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , (String)dynConstraints[4] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00262", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[2]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[3], 2);
               }
               return;
      }
   }

}

