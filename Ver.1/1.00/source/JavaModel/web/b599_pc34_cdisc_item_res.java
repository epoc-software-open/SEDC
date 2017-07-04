/*
               File: B599_PC34_CDISC_ITEM_RES
        Description: CDISCçÄñ⁄É}ÉXÉ^éÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:59.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc34_cdisc_item_res extends GXProcedure
{
   public b599_pc34_cdisc_item_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc34_cdisc_item_res.class ), "" );
   }

   public b599_pc34_cdisc_item_res( int remoteHandle ,
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
      b599_pc34_cdisc_item_res.this.AV19P_STUDY_ID = aP0;
      b599_pc34_cdisc_item_res.this.AV9P_DOM_CD = aP1;
      b599_pc34_cdisc_item_res.this.AV10P_DOM_VAR_NM = aP2;
      b599_pc34_cdisc_item_res.this.AV16W_RTN_CSV = aP3[0];
      b599_pc34_cdisc_item_res.this.aP5 = new String[] {""};
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
      b599_pc34_cdisc_item_res.this.AV19P_STUDY_ID = aP0;
      b599_pc34_cdisc_item_res.this.AV9P_DOM_CD = aP1;
      b599_pc34_cdisc_item_res.this.AV10P_DOM_VAR_NM = aP2;
      b599_pc34_cdisc_item_res.this.AV16W_RTN_CSV = aP3[0];
      this.aP3 = aP3;
      b599_pc34_cdisc_item_res.this.aP4 = aP4;
      b599_pc34_cdisc_item_res.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B599" ;
      AV15W_RTN_CD = (short)(0) ;
      AV17W_RTN_MSG = "" ;
      AV11W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV11W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      /* Execute user subroutine: S1153 */
      S1153 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22GXLvl32 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           new Long(AV19P_STUDY_ID) ,
                                           AV9P_DOM_CD ,
                                           AV10P_DOM_VAR_NM ,
                                           new Long(A894TBM43_STUDY_ID) ,
                                           A895TBM43_DOM_CD ,
                                           A896TBM43_DOM_VAR_NM ,
                                           A906TBM43_DEL_FLG },
                                           new int[] {
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TBM43_STUDY_CDISC_ITEM" ;
      /* Using cursor P00262 */
      pr_default.execute(0, new Object[] {new Long(AV19P_STUDY_ID), AV9P_DOM_CD, AV10P_DOM_VAR_NM});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A906TBM43_DEL_FLG = P00262_A906TBM43_DEL_FLG[0] ;
         n906TBM43_DEL_FLG = P00262_n906TBM43_DEL_FLG[0] ;
         A896TBM43_DOM_VAR_NM = P00262_A896TBM43_DOM_VAR_NM[0] ;
         A895TBM43_DOM_CD = P00262_A895TBM43_DOM_CD[0] ;
         A894TBM43_STUDY_ID = P00262_A894TBM43_STUDY_ID[0] ;
         A897TBM43_VAR_DESC = P00262_A897TBM43_VAR_DESC[0] ;
         n897TBM43_VAR_DESC = P00262_n897TBM43_VAR_DESC[0] ;
         AV22GXLvl32 = (byte)(1) ;
         GXt_char1 = AV18W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A895TBM43_DOM_CD, GXv_char2) ;
         b599_pc34_cdisc_item_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV18W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A896TBM43_DOM_VAR_NM, GXv_char4) ;
         b599_pc34_cdisc_item_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV18W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A897TBM43_VAR_DESC, GXv_char6) ;
         b599_pc34_cdisc_item_res.this.GXt_char5 = GXv_char6[0] ;
         AV18W_STR = GXt_char1 + "," + GXt_char3 + "," + GXt_char5 ;
         AV16W_RTN_CSV.add(AV18W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV22GXLvl32 == 0 )
      {
         AV15W_RTN_CD = (short)(1) ;
         GXt_char5 = AV17W_RTN_MSG ;
         GXv_char6[0] = GXt_char5 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char6) ;
         b599_pc34_cdisc_item_res.this.GXt_char5 = GXv_char6[0] ;
         AV17W_RTN_MSG = GXt_char5 ;
      }
      cleanup();
   }

   public void S1153( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV14W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV19P_STUDY_ID, 10, 0)) );
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV14W_PARMS_ITEM, 0);
      AV14W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DOM_CD" );
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DOM_CD );
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV14W_PARMS_ITEM, 0);
      AV14W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DOM_VAR_NM" );
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_DOM_VAR_NM );
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV14W_PARMS_ITEM, 0);
      AV13W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV11W_EXTRA_INFO;
      GXv_int8[0] = AV15W_RTN_CD ;
      GXv_char6[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(1), AV13W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int8, GXv_char6) ;
      AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b599_pc34_cdisc_item_res.this.AV15W_RTN_CD = GXv_int8[0] ;
      b599_pc34_cdisc_item_res.this.AV17W_RTN_MSG = GXv_char6[0] ;
   }

   public void S1281( )
   {
      /* 'SUB_ERROR' Routine */
      AV13W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO7[0] = AV11W_EXTRA_INFO;
      GXv_int8[0] = AV15W_RTN_CD ;
      GXv_char6[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV23Pgmname, (short)(0), AV13W_MSG, GXv_SdtB808_SD01_EXTRA_INFO7, GXv_int8, GXv_char6) ;
      AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO7[0] ;
      b599_pc34_cdisc_item_res.this.AV15W_RTN_CD = GXv_int8[0] ;
      b599_pc34_cdisc_item_res.this.AV17W_RTN_MSG = GXv_char6[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b599_pc34_cdisc_item_res.this.AV16W_RTN_CSV;
      this.aP4[0] = b599_pc34_cdisc_item_res.this.AV15W_RTN_CD;
      this.aP5[0] = b599_pc34_cdisc_item_res.this.AV17W_RTN_MSG;
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
                  /* Execute user subroutine: S1281 */
                  S1281 ();
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
      AV17W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV11W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A895TBM43_DOM_CD = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      A906TBM43_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00262_A906TBM43_DEL_FLG = new String[] {""} ;
      P00262_n906TBM43_DEL_FLG = new boolean[] {false} ;
      P00262_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      P00262_A895TBM43_DOM_CD = new String[] {""} ;
      P00262_A894TBM43_STUDY_ID = new long[1] ;
      P00262_A897TBM43_VAR_DESC = new String[] {""} ;
      P00262_n897TBM43_VAR_DESC = new boolean[] {false} ;
      A897TBM43_VAR_DESC = "" ;
      AV18W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      AV14W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV13W_MSG = "" ;
      AV23Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO7 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int8 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc34_cdisc_item_res__default(),
         new Object[] {
             new Object[] {
            P00262_A906TBM43_DEL_FLG, P00262_n906TBM43_DEL_FLG, P00262_A896TBM43_DOM_VAR_NM, P00262_A895TBM43_DOM_CD, P00262_A894TBM43_STUDY_ID, P00262_A897TBM43_VAR_DESC, P00262_n897TBM43_VAR_DESC
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV23Pgmname = "B599_PC34_CDISC_ITEM_RES" ;
      /* GeneXus formulas. */
      AV23Pgmname = "B599_PC34_CDISC_ITEM_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV22GXLvl32 ;
   private short AV15W_RTN_CD ;
   private short GXv_int8[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV19P_STUDY_ID ;
   private long A894TBM43_STUDY_ID ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String AV23Pgmname ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean n897TBM43_VAR_DESC ;
   private String AV9P_DOM_CD ;
   private String AV10P_DOM_VAR_NM ;
   private String AV17W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String A895TBM43_DOM_CD ;
   private String A896TBM43_DOM_VAR_NM ;
   private String A906TBM43_DEL_FLG ;
   private String A897TBM43_VAR_DESC ;
   private String AV18W_STR ;
   private String AV13W_MSG ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00262_A906TBM43_DEL_FLG ;
   private boolean[] P00262_n906TBM43_DEL_FLG ;
   private String[] P00262_A896TBM43_DOM_VAR_NM ;
   private String[] P00262_A895TBM43_DOM_CD ;
   private long[] P00262_A894TBM43_STUDY_ID ;
   private String[] P00262_A897TBM43_VAR_DESC ;
   private boolean[] P00262_n897TBM43_VAR_DESC ;
   private GxObjectCollection AV16W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV11W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO7[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV14W_PARMS_ITEM ;
}

final  class b599_pc34_cdisc_item_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00262( com.genexus.internet.HttpContext httpContext ,
                                          long AV19P_STUDY_ID ,
                                          String AV9P_DOM_CD ,
                                          String AV10P_DOM_VAR_NM ,
                                          long A894TBM43_STUDY_ID ,
                                          String A895TBM43_DOM_CD ,
                                          String A896TBM43_DOM_VAR_NM ,
                                          String A906TBM43_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int9 ;
      GXv_int9 = new byte [3] ;
      Object[] GXv_Object10 ;
      GXv_Object10 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TBM43_STUDY_CDISC_ITEM" ;
      scmdbuf = "SELECT `TBM43_DEL_FLG`, `TBM43_DOM_VAR_NM`, `TBM43_DOM_CD`, `TBM43_STUDY_ID`, `TBM43_VAR_DESC`" ;
      scmdbuf = scmdbuf + " FROM `TBM43_STUDY_CDISC_ITEM`" ;
      scmdbuf = scmdbuf + " WHERE (`TBM43_DEL_FLG` = '0')" ;
      if ( ! (0==AV19P_STUDY_ID) )
      {
         sWhereString = sWhereString + " and (`TBM43_STUDY_ID` = ?)" ;
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV9P_DOM_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_CD` = ?)" ;
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV10P_DOM_VAR_NM)==0) )
      {
         sWhereString = sWhereString + " and (`TBM43_DOM_VAR_NM` = ?)" ;
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBM43_DOM_CD`, `TBM43_DOM_VAR_NM`" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P00262(httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).longValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00262", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               break;
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
                  stmt.setLong(sIdx, ((Number) parms[3]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[4], 2);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[5], 50);
               }
               break;
      }
   }

}

