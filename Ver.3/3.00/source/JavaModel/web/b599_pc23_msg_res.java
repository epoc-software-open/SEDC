/*
               File: B599_PC23_MSG_RES
        Description: メッセージマスタ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:48.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc23_msg_res extends GXProcedure
{
   public b599_pc23_msg_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc23_msg_res.class ), "" );
   }

   public b599_pc23_msg_res( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 )
   {
      b599_pc23_msg_res.this.AV9P_MSG_CD = aP0;
      b599_pc23_msg_res.this.AV12W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc23_msg_res.this.aP2 = aP2;
      b599_pc23_msg_res.this.aP3 = aP3;
      b599_pc23_msg_res.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      b599_pc23_msg_res.this.AV9P_MSG_CD = aP0;
      b599_pc23_msg_res.this.AV12W_RTN_CSV = aP1[0];
      this.aP1 = aP1;
      b599_pc23_msg_res.this.aP2 = aP2;
      b599_pc23_msg_res.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15C_APP_ID = "B599" ;
      AV11W_RTN_CD = (short)(0) ;
      AV13W_RTN_MSG = "" ;
      AV16W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV16W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV15C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV21GXLvl31 = (byte)(0) ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_MSG_CD ,
                                           A6TAM06_MSG_CD ,
                                           A297TAM06_DEL_FLG },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN
                                           }
      });
      Gx_ope = "Fetch" ;
      Gx_etb = "TAM06_MSG" ;
      /* Using cursor P00492 */
      pr_default.execute(0, new Object[] {AV9P_MSG_CD});
      if ( Gx_err != 0 )
      {
         AV21GXLvl31 = (byte)(1) ;
      }
      while ( (pr_default.getStatus(0) != 101) )
      {
         A297TAM06_DEL_FLG = P00492_A297TAM06_DEL_FLG[0] ;
         n297TAM06_DEL_FLG = P00492_n297TAM06_DEL_FLG[0] ;
         A6TAM06_MSG_CD = P00492_A6TAM06_MSG_CD[0] ;
         A298TAM06_UPD_CNT = P00492_A298TAM06_UPD_CNT[0] ;
         n298TAM06_UPD_CNT = P00492_n298TAM06_UPD_CNT[0] ;
         A240TAM06_UPD_PROG_NM = P00492_A240TAM06_UPD_PROG_NM[0] ;
         n240TAM06_UPD_PROG_NM = P00492_n240TAM06_UPD_PROG_NM[0] ;
         A268TAM06_UPD_USER_ID = P00492_A268TAM06_UPD_USER_ID[0] ;
         n268TAM06_UPD_USER_ID = P00492_n268TAM06_UPD_USER_ID[0] ;
         A239TAM06_UPD_DATETIME = P00492_A239TAM06_UPD_DATETIME[0] ;
         n239TAM06_UPD_DATETIME = P00492_n239TAM06_UPD_DATETIME[0] ;
         A238TAM06_CRT_PROG_NM = P00492_A238TAM06_CRT_PROG_NM[0] ;
         n238TAM06_CRT_PROG_NM = P00492_n238TAM06_CRT_PROG_NM[0] ;
         A312TAM06_CRT_USER_ID = P00492_A312TAM06_CRT_USER_ID[0] ;
         n312TAM06_CRT_USER_ID = P00492_n312TAM06_CRT_USER_ID[0] ;
         A237TAM06_CRT_DATETIME = P00492_A237TAM06_CRT_DATETIME[0] ;
         n237TAM06_CRT_DATETIME = P00492_n237TAM06_CRT_DATETIME[0] ;
         A216TAM06_MSG = P00492_A216TAM06_MSG[0] ;
         n216TAM06_MSG = P00492_n216TAM06_MSG[0] ;
         AV21GXLvl31 = (byte)(1) ;
         GXt_char1 = AV14W_STR ;
         GXv_char2[0] = GXt_char1 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A6TAM06_MSG_CD, GXv_char2) ;
         b599_pc23_msg_res.this.GXt_char1 = GXv_char2[0] ;
         GXt_char3 = AV14W_STR ;
         GXv_char4[0] = GXt_char3 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A216TAM06_MSG, GXv_char4) ;
         b599_pc23_msg_res.this.GXt_char3 = GXv_char4[0] ;
         GXt_char5 = AV14W_STR ;
         GXv_char6[0] = GXt_char5 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A237TAM06_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char6) ;
         b599_pc23_msg_res.this.GXt_char5 = GXv_char6[0] ;
         GXt_char7 = AV14W_STR ;
         GXv_char8[0] = GXt_char7 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A312TAM06_CRT_USER_ID, GXv_char8) ;
         b599_pc23_msg_res.this.GXt_char7 = GXv_char8[0] ;
         GXt_char9 = AV14W_STR ;
         GXv_char10[0] = GXt_char9 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A238TAM06_CRT_PROG_NM, GXv_char10) ;
         b599_pc23_msg_res.this.GXt_char9 = GXv_char10[0] ;
         GXt_char11 = AV14W_STR ;
         GXv_char12[0] = GXt_char11 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A239TAM06_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char12) ;
         b599_pc23_msg_res.this.GXt_char11 = GXv_char12[0] ;
         GXt_char13 = AV14W_STR ;
         GXv_char14[0] = GXt_char13 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A268TAM06_UPD_USER_ID, GXv_char14) ;
         b599_pc23_msg_res.this.GXt_char13 = GXv_char14[0] ;
         GXt_char15 = AV14W_STR ;
         GXv_char16[0] = GXt_char15 ;
         new b804_pc01_esc_airres(remoteHandle, context).execute( A240TAM06_UPD_PROG_NM, GXv_char16) ;
         b599_pc23_msg_res.this.GXt_char15 = GXv_char16[0] ;
         AV14W_STR = GXt_char1 + "," + GXt_char3 + "," + A297TAM06_DEL_FLG + "," + GXt_char5 + "," + GXt_char7 + "," + GXt_char9 + "," + GXt_char11 + "," + GXt_char13 + "," + GXt_char15 + "," + GXutil.trim( GXutil.str( A298TAM06_UPD_CNT, 10, 0)) ;
         AV12W_RTN_CSV.add(AV14W_STR, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV21GXLvl31 == 0 )
      {
         AV11W_RTN_CD = (short)(1) ;
         GXt_char15 = AV13W_RTN_MSG ;
         GXv_char16[0] = GXt_char15 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00024", "", "", "", "", "", GXv_char16) ;
         b599_pc23_msg_res.this.GXt_char15 = GXv_char16[0] ;
         AV13W_RTN_MSG = GXt_char15 ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV17W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_MSG_CD" );
      AV17W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_MSG_CD );
      AV16W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV17W_PARMS_ITEM, 0);
      AV18W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV16W_EXTRA_INFO;
      GXv_int18[0] = AV11W_RTN_CD ;
      GXv_char16[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(1), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc23_msg_res.this.AV11W_RTN_CD = GXv_int18[0] ;
      b599_pc23_msg_res.this.AV13W_RTN_MSG = GXv_char16[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV18W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO17[0] = AV16W_EXTRA_INFO;
      GXv_int18[0] = AV11W_RTN_CD ;
      GXv_char16[0] = AV13W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV18W_MSG, GXv_SdtB808_SD01_EXTRA_INFO17, GXv_int18, GXv_char16) ;
      AV16W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO17[0] ;
      b599_pc23_msg_res.this.AV11W_RTN_CD = GXv_int18[0] ;
      b599_pc23_msg_res.this.AV13W_RTN_MSG = GXv_char16[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b599_pc23_msg_res.this.AV12W_RTN_CSV;
      this.aP2[0] = b599_pc23_msg_res.this.AV11W_RTN_CD;
      this.aP3[0] = b599_pc23_msg_res.this.AV13W_RTN_MSG;
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
      AV13W_RTN_MSG = "" ;
      AV15C_APP_ID = "" ;
      AV16W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      scmdbuf = "" ;
      A6TAM06_MSG_CD = "" ;
      A297TAM06_DEL_FLG = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P00492_A297TAM06_DEL_FLG = new String[] {""} ;
      P00492_n297TAM06_DEL_FLG = new boolean[] {false} ;
      P00492_A6TAM06_MSG_CD = new String[] {""} ;
      P00492_A298TAM06_UPD_CNT = new long[1] ;
      P00492_n298TAM06_UPD_CNT = new boolean[] {false} ;
      P00492_A240TAM06_UPD_PROG_NM = new String[] {""} ;
      P00492_n240TAM06_UPD_PROG_NM = new boolean[] {false} ;
      P00492_A268TAM06_UPD_USER_ID = new String[] {""} ;
      P00492_n268TAM06_UPD_USER_ID = new boolean[] {false} ;
      P00492_A239TAM06_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_n239TAM06_UPD_DATETIME = new boolean[] {false} ;
      P00492_A238TAM06_CRT_PROG_NM = new String[] {""} ;
      P00492_n238TAM06_CRT_PROG_NM = new boolean[] {false} ;
      P00492_A312TAM06_CRT_USER_ID = new String[] {""} ;
      P00492_n312TAM06_CRT_USER_ID = new boolean[] {false} ;
      P00492_A237TAM06_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00492_n237TAM06_CRT_DATETIME = new boolean[] {false} ;
      P00492_A216TAM06_MSG = new String[] {""} ;
      P00492_n216TAM06_MSG = new boolean[] {false} ;
      A240TAM06_UPD_PROG_NM = "" ;
      A268TAM06_UPD_USER_ID = "" ;
      A239TAM06_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A238TAM06_CRT_PROG_NM = "" ;
      A312TAM06_CRT_USER_ID = "" ;
      A237TAM06_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A216TAM06_MSG = "" ;
      AV14W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String [1] ;
      GXt_char7 = "" ;
      GXv_char8 = new String [1] ;
      GXt_char9 = "" ;
      GXv_char10 = new String [1] ;
      GXt_char11 = "" ;
      GXv_char12 = new String [1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String [1] ;
      GXt_char15 = "" ;
      AV17W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV18W_MSG = "" ;
      AV22Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO17 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int18 = new short [1] ;
      GXv_char16 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc23_msg_res__default(),
         new Object[] {
             new Object[] {
            P00492_A297TAM06_DEL_FLG, P00492_n297TAM06_DEL_FLG, P00492_A6TAM06_MSG_CD, P00492_A298TAM06_UPD_CNT, P00492_n298TAM06_UPD_CNT, P00492_A240TAM06_UPD_PROG_NM, P00492_n240TAM06_UPD_PROG_NM, P00492_A268TAM06_UPD_USER_ID, P00492_n268TAM06_UPD_USER_ID, P00492_A239TAM06_UPD_DATETIME,
            P00492_n239TAM06_UPD_DATETIME, P00492_A238TAM06_CRT_PROG_NM, P00492_n238TAM06_CRT_PROG_NM, P00492_A312TAM06_CRT_USER_ID, P00492_n312TAM06_CRT_USER_ID, P00492_A237TAM06_CRT_DATETIME, P00492_n237TAM06_CRT_DATETIME, P00492_A216TAM06_MSG, P00492_n216TAM06_MSG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B599_PC23_MSG_RES" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B599_PC23_MSG_RES" ;
      Gx_err = (short)(0) ;
   }

   private byte AV21GXLvl31 ;
   private short AV11W_RTN_CD ;
   private short Gx_err ;
   private short GXv_int18[] ;
   private int GXActiveErrHndl ;
   private long A298TAM06_UPD_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String GXt_char7 ;
   private String GXv_char8[] ;
   private String GXt_char9 ;
   private String GXv_char10[] ;
   private String GXt_char11 ;
   private String GXv_char12[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char15 ;
   private String AV22Pgmname ;
   private String GXv_char16[] ;
   private String Gx_emsg ;
   private java.util.Date A239TAM06_UPD_DATETIME ;
   private java.util.Date A237TAM06_CRT_DATETIME ;
   private boolean returnInSub ;
   private boolean n297TAM06_DEL_FLG ;
   private boolean n298TAM06_UPD_CNT ;
   private boolean n240TAM06_UPD_PROG_NM ;
   private boolean n268TAM06_UPD_USER_ID ;
   private boolean n239TAM06_UPD_DATETIME ;
   private boolean n238TAM06_CRT_PROG_NM ;
   private boolean n312TAM06_CRT_USER_ID ;
   private boolean n237TAM06_CRT_DATETIME ;
   private boolean n216TAM06_MSG ;
   private String AV9P_MSG_CD ;
   private String AV13W_RTN_MSG ;
   private String AV15C_APP_ID ;
   private String A6TAM06_MSG_CD ;
   private String A297TAM06_DEL_FLG ;
   private String A240TAM06_UPD_PROG_NM ;
   private String A268TAM06_UPD_USER_ID ;
   private String A238TAM06_CRT_PROG_NM ;
   private String A312TAM06_CRT_USER_ID ;
   private String A216TAM06_MSG ;
   private String AV14W_STR ;
   private String AV18W_MSG ;
   private GxObjectCollection[] aP1 ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P00492_A297TAM06_DEL_FLG ;
   private boolean[] P00492_n297TAM06_DEL_FLG ;
   private String[] P00492_A6TAM06_MSG_CD ;
   private long[] P00492_A298TAM06_UPD_CNT ;
   private boolean[] P00492_n298TAM06_UPD_CNT ;
   private String[] P00492_A240TAM06_UPD_PROG_NM ;
   private boolean[] P00492_n240TAM06_UPD_PROG_NM ;
   private String[] P00492_A268TAM06_UPD_USER_ID ;
   private boolean[] P00492_n268TAM06_UPD_USER_ID ;
   private java.util.Date[] P00492_A239TAM06_UPD_DATETIME ;
   private boolean[] P00492_n239TAM06_UPD_DATETIME ;
   private String[] P00492_A238TAM06_CRT_PROG_NM ;
   private boolean[] P00492_n238TAM06_CRT_PROG_NM ;
   private String[] P00492_A312TAM06_CRT_USER_ID ;
   private boolean[] P00492_n312TAM06_CRT_USER_ID ;
   private java.util.Date[] P00492_A237TAM06_CRT_DATETIME ;
   private boolean[] P00492_n237TAM06_CRT_DATETIME ;
   private String[] P00492_A216TAM06_MSG ;
   private boolean[] P00492_n216TAM06_MSG ;
   private GxObjectCollection AV12W_RTN_CSV ;
   private SdtB808_SD01_EXTRA_INFO AV16W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO17[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV17W_PARMS_ITEM ;
}

final  class b599_pc23_msg_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00492( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_MSG_CD ,
                                          String A6TAM06_MSG_CD ,
                                          String A297TAM06_DEL_FLG )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int19 ;
      GXv_int19 = new byte [1] ;
      Object[] GXv_Object20 ;
      GXv_Object20 = new Object [2] ;
      Gx_ope = "Declare" ;
      Gx_etb = "TAM06_MSG" ;
      scmdbuf = "SELECT `TAM06_DEL_FLG`, `TAM06_MSG_CD`, `TAM06_UPD_CNT`, `TAM06_UPD_PROG_NM`, `TAM06_UPD_USER_ID`," ;
      scmdbuf = scmdbuf + " `TAM06_UPD_DATETIME`, `TAM06_CRT_PROG_NM`, `TAM06_CRT_USER_ID`, `TAM06_CRT_DATETIME`," ;
      scmdbuf = scmdbuf + " `TAM06_MSG` FROM `TAM06_MSG`" ;
      scmdbuf = scmdbuf + " WHERE (`TAM06_DEL_FLG` = '0')" ;
      if ( ! (GXutil.strcmp("", AV9P_MSG_CD)==0) )
      {
         sWhereString = sWhereString + " and (`TAM06_MSG_CD` = ?)" ;
      }
      else
      {
         GXv_int19[0] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TAM06_MSG_CD`" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_P00492(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00492", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
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
                  stmt.setVarchar(sIdx, (String)parms[1], 7);
               }
               return;
      }
   }

}

