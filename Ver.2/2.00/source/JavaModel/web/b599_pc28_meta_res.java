/*
               File: B599_PC28_META_RES
        Description: NetCommonsメタデータ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:8.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b599_pc28_meta_res extends GXProcedure
{
   public b599_pc28_meta_res( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b599_pc28_meta_res.class ), "" );
   }

   public b599_pc28_meta_res( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             long aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 )
   {
      b599_pc28_meta_res.this.AV11P_USER_ID = aP0;
      b599_pc28_meta_res.this.AV10P_STUDY_ID = aP1;
      b599_pc28_meta_res.this.AV19W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc28_meta_res.this.aP3 = aP3;
      b599_pc28_meta_res.this.aP4 = aP4;
      b599_pc28_meta_res.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        GxObjectCollection[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             GxObjectCollection[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b599_pc28_meta_res.this.AV11P_USER_ID = aP0;
      b599_pc28_meta_res.this.AV10P_STUDY_ID = aP1;
      b599_pc28_meta_res.this.AV19W_RTN_CSV = aP2[0];
      this.aP2 = aP2;
      b599_pc28_meta_res.this.aP3 = aP3;
      b599_pc28_meta_res.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22C_APP_ID = "B599" ;
      AV18W_RTN_CD = (short)(0) ;
      AV20W_RTN_MSG = "" ;
      AV23W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV23W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV22C_APP_ID );
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_SdtA_LOGIN_SDT1[0] = AV12W_A_LOGIN_SDT;
      GXv_char2[0] = AV14W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV12W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      b599_pc28_meta_res.this.AV14W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV14W_ERRCD, "0") != 0 )
      {
         AV18W_RTN_CD = (short)(1) ;
         GXt_char3 = AV20W_RTN_MSG ;
         GXv_char2[0] = GXt_char3 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00047", "", "", "", "", "", GXv_char2) ;
         b599_pc28_meta_res.this.GXt_char3 = GXv_char2[0] ;
         AV20W_RTN_MSG = GXt_char3 ;
      }
      if ( AV18W_RTN_CD == 0 )
      {
         AV17W_PWD = "" ;
         Gx_ope = "Fetch" ;
         Gx_etb = "TAM07_USER" ;
         /* Using cursor P004L2 */
         pr_default.execute(0, new Object[] {AV11P_USER_ID});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A214TAM07_DEL_FLG = P004L2_A214TAM07_DEL_FLG[0] ;
            n214TAM07_DEL_FLG = P004L2_n214TAM07_DEL_FLG[0] ;
            A55TAM07_USER_ID = P004L2_A55TAM07_USER_ID[0] ;
            A210TAM07_PWD = P004L2_A210TAM07_PWD[0] ;
            n210TAM07_PWD = P004L2_n210TAM07_PWD[0] ;
            AV17W_PWD = A210TAM07_PWD ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         GXv_SdtB602_SD03_META_LIST4[0] = AV15W_META_LIST;
         GXv_int5[0] = AV18W_RTN_CD ;
         GXv_char2[0] = AV20W_RTN_MSG ;
         new b602_pc03_crfif_view_metalist(remoteHandle, context).execute( AV11P_USER_ID, AV17W_PWD, AV10P_STUDY_ID, GXv_SdtB602_SD03_META_LIST4, GXv_int5, GXv_char2) ;
         AV15W_META_LIST = GXv_SdtB602_SD03_META_LIST4[0] ;
         b599_pc28_meta_res.this.AV18W_RTN_CD = GXv_int5[0] ;
         b599_pc28_meta_res.this.AV20W_RTN_MSG = GXv_char2[0] ;
         AV17W_PWD = "" ;
      }
      if ( AV18W_RTN_CD == 0 )
      {
         AV15W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().sort("DISPLAY_POS, DISPLAY_SEQUENCE") ;
         AV13W_CNT = 1 ;
         while ( AV13W_CNT <= AV15W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().size() )
         {
            GXt_char3 = AV21W_STR ;
            GXv_char2[0] = GXt_char3 ;
            new b804_pc01_esc_airres(remoteHandle, context).execute( ((SdtB602_SD03_META_LIST_META_DATAItem)AV15W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name(), GXv_char2) ;
            b599_pc28_meta_res.this.GXt_char3 = GXv_char2[0] ;
            AV21W_STR = GXutil.trim( GXutil.str( ((SdtB602_SD03_META_LIST_META_DATAItem)AV15W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().elementAt(-1+(int)(AV13W_CNT))).getgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id(), 10, 0)) + "," + GXt_char3 ;
            AV19W_RTN_CSV.add(AV21W_STR, 0);
            AV13W_CNT = (long)(AV13W_CNT+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV23W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_USER_ID" );
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_USER_ID );
      AV23W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      AV23W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV16W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV23W_EXTRA_INFO;
      GXv_int5[0] = AV18W_RTN_CD ;
      GXv_char2[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV29Pgmname, (short)(1), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV23W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b599_pc28_meta_res.this.AV18W_RTN_CD = GXv_int5[0] ;
      b599_pc28_meta_res.this.AV20W_RTN_MSG = GXv_char2[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV16W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO6[0] = AV23W_EXTRA_INFO;
      GXv_int5[0] = AV18W_RTN_CD ;
      GXv_char2[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV29Pgmname, (short)(0), AV16W_MSG, GXv_SdtB808_SD01_EXTRA_INFO6, GXv_int5, GXv_char2) ;
      AV23W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO6[0] ;
      b599_pc28_meta_res.this.AV18W_RTN_CD = GXv_int5[0] ;
      b599_pc28_meta_res.this.AV20W_RTN_MSG = GXv_char2[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b599_pc28_meta_res.this.AV19W_RTN_CSV;
      this.aP3[0] = b599_pc28_meta_res.this.AV18W_RTN_CD;
      this.aP4[0] = b599_pc28_meta_res.this.AV20W_RTN_MSG;
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
      AV22C_APP_ID = "" ;
      AV23W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV12W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV14W_ERRCD = "" ;
      AV17W_PWD = "" ;
      scmdbuf = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      P004L2_A214TAM07_DEL_FLG = new String[] {""} ;
      P004L2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      P004L2_A55TAM07_USER_ID = new String[] {""} ;
      P004L2_A210TAM07_PWD = new String[] {""} ;
      P004L2_n210TAM07_PWD = new boolean[] {false} ;
      A214TAM07_DEL_FLG = "" ;
      A55TAM07_USER_ID = "" ;
      A210TAM07_PWD = "" ;
      AV15W_META_LIST = new SdtB602_SD03_META_LIST(remoteHandle, context);
      GXv_SdtB602_SD03_META_LIST4 = new SdtB602_SD03_META_LIST [1] ;
      AV21W_STR = "" ;
      GXt_char3 = "" ;
      AV24W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV16W_MSG = "" ;
      AV29Pgmname = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO6 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b599_pc28_meta_res__default(),
         new Object[] {
             new Object[] {
            P004L2_A214TAM07_DEL_FLG, P004L2_n214TAM07_DEL_FLG, P004L2_A55TAM07_USER_ID, P004L2_A210TAM07_PWD, P004L2_n210TAM07_PWD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV29Pgmname = "B599_PC28_META_RES" ;
      /* GeneXus formulas. */
      AV29Pgmname = "B599_PC28_META_RES" ;
      Gx_err = (short)(0) ;
   }

   private short AV18W_RTN_CD ;
   private short GXv_int5[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private long AV13W_CNT ;
   private String scmdbuf ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char3 ;
   private String AV29Pgmname ;
   private String GXv_char2[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n210TAM07_PWD ;
   private String AV11P_USER_ID ;
   private String AV20W_RTN_MSG ;
   private String AV22C_APP_ID ;
   private String AV14W_ERRCD ;
   private String AV17W_PWD ;
   private String A214TAM07_DEL_FLG ;
   private String A55TAM07_USER_ID ;
   private String A210TAM07_PWD ;
   private String AV21W_STR ;
   private String AV16W_MSG ;
   private GxObjectCollection[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P004L2_A214TAM07_DEL_FLG ;
   private boolean[] P004L2_n214TAM07_DEL_FLG ;
   private String[] P004L2_A55TAM07_USER_ID ;
   private String[] P004L2_A210TAM07_PWD ;
   private boolean[] P004L2_n210TAM07_PWD ;
   private GxObjectCollection AV19W_RTN_CSV ;
   private SdtA_LOGIN_SDT AV12W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
   private SdtB602_SD03_META_LIST AV15W_META_LIST ;
   private SdtB602_SD03_META_LIST GXv_SdtB602_SD03_META_LIST4[] ;
   private SdtB808_SD01_EXTRA_INFO AV23W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO6[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV24W_PARMS_ITEM ;
}

final  class b599_pc28_meta_res__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004L2", "SELECT `TAM07_DEL_FLG`, `TAM07_USER_ID`, `TAM07_PWD` FROM `TAM07_USER` WHERE (`TAM07_USER_ID` = ?) AND (`TAM07_DEL_FLG` = '0') ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

