/*
               File: B404_PC01_TBM36_REG
        Description: CRFëIëèåèìoò^âÊñ ópÅECRFëIëÉ}ÉXÉ^ìoò^èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:51.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b404_pc01_tbm36_reg extends GXProcedure
{
   public b404_pc01_tbm36_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b404_pc01_tbm36_reg.class ), "" );
   }

   public b404_pc01_tbm36_reg( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             SdtTBM33_CRF_COND aP1 ,
                             GxObjectCollection aP2 ,
                             String aP3 )
   {
      b404_pc01_tbm36_reg.this.AV12P_MODE = aP0;
      b404_pc01_tbm36_reg.this.AV11P_BC_CRF_COND = aP1;
      b404_pc01_tbm36_reg.this.AV10P_B404_SD02_CRFCOND_REG = aP2;
      b404_pc01_tbm36_reg.this.AV13P_SYS_CRFID = aP3;
      b404_pc01_tbm36_reg.this.aP4 = aP4;
      b404_pc01_tbm36_reg.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        SdtTBM33_CRF_COND aP1 ,
                        GxObjectCollection aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             SdtTBM33_CRF_COND aP1 ,
                             GxObjectCollection aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      b404_pc01_tbm36_reg.this.AV12P_MODE = aP0;
      b404_pc01_tbm36_reg.this.AV11P_BC_CRF_COND = aP1;
      b404_pc01_tbm36_reg.this.AV10P_B404_SD02_CRFCOND_REG = aP2;
      b404_pc01_tbm36_reg.this.AV13P_SYS_CRFID = aP3;
      b404_pc01_tbm36_reg.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16C_APP_ID = "B402" ;
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P004H2 */
      pr_default.execute(0, new Object[] {new Long(AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id()), AV13P_SYS_CRFID, new Short(AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no())});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A37TBM36_COND_NO = P004H2_A37TBM36_COND_NO[0] ;
         A36TBM36_CRF_ID = P004H2_A36TBM36_CRF_ID[0] ;
         A35TBM36_STUDY_ID = P004H2_A35TBM36_STUDY_ID[0] ;
         A38TBM36_SELECT_CRF_ID = P004H2_A38TBM36_SELECT_CRF_ID[0] ;
         AV15WK_TBM36_SELECT_CRF_ID = A38TBM36_SELECT_CRF_ID ;
         AV9BC_TBM36_CRF_SELECT.Load(AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id(), (short)(GXutil.val( AV13P_SYS_CRFID, ".")), AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no(), AV15WK_TBM36_SELECT_CRF_ID);
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9BC_TBM36_CRF_SELECT.Delete();
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( ((GXutil.strcmp(AV12P_MODE, "0")==0)||(GXutil.strcmp(AV12P_MODE, "1")==0)) )
      {
         AV20GXV1 = 1 ;
         while ( AV20GXV1 <= AV10P_B404_SD02_CRFCOND_REG.size() )
         {
            AV8B404_SD02_CRFCOND_REG_ITEM = (SdtB404_SD02_CRFCOND_REG_Item)((SdtB404_SD02_CRFCOND_REG_Item)AV10P_B404_SD02_CRFCOND_REG.elementAt(-1+AV20GXV1));
            if ( AV8B404_SD02_CRFCOND_REG_ITEM.getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Check() )
            {
               AV9BC_TBM36_CRF_SELECT = (SdtTBM36_CRF_SELECT)new SdtTBM36_CRF_SELECT( remoteHandle, context);
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_study_id( AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_study_id() );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crf_id( (short)(GXutil.lval( AV13P_SYS_CRFID)) );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_cond_no( AV11P_BC_CRF_COND.getgxTv_SdtTBM33_CRF_COND_Tbm33_cond_no() );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_select_crf_id( AV8B404_SD02_CRFCOND_REG_ITEM.getgxTv_SdtB404_SD02_CRFCOND_REG_Item_Tbm31_crf_id() );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_del_flg( "0" );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_crt_prog_nm( AV21Pgmname );
               AV9BC_TBM36_CRF_SELECT.setgxTv_SdtTBM36_CRF_SELECT_Tbm36_upd_prog_nm( AV21Pgmname );
               AV9BC_TBM36_CRF_SELECT.Save();
               /* Execute user subroutine: S111 */
               S111 ();
               if ( returnInSub )
               {
                  returnInSub = true;
                  cleanup();
                  if (true) return;
               }
            }
            AV20GXV1 = (int)(AV20GXV1+1) ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CHECK_ERROR' Routine */
      if ( AV9BC_TBM36_CRF_SELECT.Fail() )
      {
         GXt_char1 = AV14WK_ERRMSG ;
         GXv_char2[0] = GXt_char1 ;
         new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9BC_TBM36_CRF_SELECT.GetMessages(), (byte)(0), GXv_char2) ;
         b404_pc01_tbm36_reg.this.GXt_char1 = GXv_char2[0] ;
         AV14WK_ERRMSG = GXt_char1 ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV21Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b404_pc01_tbm36_reg");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b404_pc01_tbm36_reg.this.AV14WK_ERRMSG;
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
                  /* Execute user subroutine: S131 */
                  S131 ();
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
      AV14WK_ERRMSG = "" ;
      AV16C_APP_ID = "" ;
      scmdbuf = "" ;
      P004H2_A37TBM36_COND_NO = new short[1] ;
      P004H2_A36TBM36_CRF_ID = new short[1] ;
      P004H2_A35TBM36_STUDY_ID = new long[1] ;
      P004H2_A38TBM36_SELECT_CRF_ID = new short[1] ;
      AV9BC_TBM36_CRF_SELECT = new SdtTBM36_CRF_SELECT(remoteHandle);
      AV8B404_SD02_CRFCOND_REG_ITEM = new SdtB404_SD02_CRFCOND_REG_Item(remoteHandle, context);
      AV21Pgmname = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b404_pc01_tbm36_reg__default(),
         new Object[] {
             new Object[] {
            P004H2_A37TBM36_COND_NO, P004H2_A36TBM36_CRF_ID, P004H2_A35TBM36_STUDY_ID, P004H2_A38TBM36_SELECT_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV21Pgmname = "B404_PC01_TBM36_REG" ;
      /* GeneXus formulas. */
      AV21Pgmname = "B404_PC01_TBM36_REG" ;
      Gx_err = (short)(0) ;
   }

   private short A37TBM36_COND_NO ;
   private short A36TBM36_CRF_ID ;
   private short A38TBM36_SELECT_CRF_ID ;
   private short AV15WK_TBM36_SELECT_CRF_ID ;
   private short Gx_err ;
   private int AV20GXV1 ;
   private int GXActiveErrHndl ;
   private long A35TBM36_STUDY_ID ;
   private String scmdbuf ;
   private String AV21Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV12P_MODE ;
   private String AV13P_SYS_CRFID ;
   private String AV14WK_ERRMSG ;
   private String AV16C_APP_ID ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P004H2_A37TBM36_COND_NO ;
   private short[] P004H2_A36TBM36_CRF_ID ;
   private long[] P004H2_A35TBM36_STUDY_ID ;
   private short[] P004H2_A38TBM36_SELECT_CRF_ID ;
   private GxObjectCollection AV10P_B404_SD02_CRFCOND_REG ;
   private SdtB404_SD02_CRFCOND_REG_Item AV8B404_SD02_CRFCOND_REG_ITEM ;
   private SdtTBM36_CRF_SELECT AV9BC_TBM36_CRF_SELECT ;
   private SdtTBM33_CRF_COND AV11P_BC_CRF_COND ;
}

final  class b404_pc01_tbm36_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004H2", "SELECT `TBM36_COND_NO`, `TBM36_CRF_ID`, `TBM36_STUDY_ID`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE (`TBM36_STUDY_ID` = ?) AND (`TBM36_CRF_ID` = ?) AND (`TBM36_COND_NO` = ?) ORDER BY `TBM36_STUDY_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 100);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

