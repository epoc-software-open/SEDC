/*
               File: B402_PC16_CRF_REF_CHK
        Description: CRF整合性チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: March 3, 2021 14:42:18.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b402_pc16_crf_ref_chk extends GXProcedure
{
   public b402_pc16_crf_ref_chk( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b402_pc16_crf_ref_chk.class ), "" );
   }

   public b402_pc16_crf_ref_chk( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( long aP0 ,
                                         GxObjectCollection[] aP1 )
   {
      b402_pc16_crf_ref_chk.this.AV11P_STUDY_ID = aP0;
      b402_pc16_crf_ref_chk.this.aP1 = aP1;
      b402_pc16_crf_ref_chk.this.aP2 = aP2;
      b402_pc16_crf_ref_chk.this.aP2 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        GxObjectCollection[] aP1 ,
                        GxObjectCollection[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             GxObjectCollection[] aP1 ,
                             GxObjectCollection[] aP2 )
   {
      b402_pc16_crf_ref_chk.this.AV11P_STUDY_ID = aP0;
      b402_pc16_crf_ref_chk.this.aP1 = aP1;
      b402_pc16_crf_ref_chk.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM020_APP_ID = "B402" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_A_CHK_INFO_SDT.clear();
      AV15W_A_CHK_RESULT_SDT.clear();
      AV18W_A_RESULT_MSG_SDT.clear();
      AV23W_FOCUS_FLG = true ;
      new a804_pc01_syslog(remoteHandle, context).execute( AV30Pgmname, "INFO", "CRF整合性チェック") ;
      AV10P_SESSION_ID = AV12SESSION.getId() ;
      AV9P_DATETIME = GXutil.now( ) ;
      /* Using cursor P004D2 */
      pr_default.execute(0, new Object[] {new Byte(AV26W_RTN_CD), new Long(AV11P_STUDY_ID), AV10P_SESSION_ID, AV9P_DATETIME});
      AV26W_RTN_CD = P004D2_AV26W_RTN_CD[0] ;
      AV11P_STUDY_ID = P004D2_AV11P_STUDY_ID[0] ;
      AV10P_SESSION_ID = P004D2_AV10P_SESSION_ID[0] ;
      AV9P_DATETIME = P004D2_AV9P_DATETIME[0] ;
      if ( AV26W_RTN_CD == 0 )
      {
         AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AG00024", "", "", "", "", "", GXv_char2) ;
         b402_pc16_crf_ref_chk.this.GXt_char1 = GXv_char2[0] ;
         AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( GXt_char1 );
         AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
      }
      else
      {
         /* Using cursor P004D3 */
         pr_default.execute(1, new Object[] {AV10P_SESSION_ID, AV9P_DATETIME});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A180TBW12_DATETIME = P004D3_A180TBW12_DATETIME[0] ;
            A179TBW12_SESSION_ID = P004D3_A179TBW12_SESSION_ID[0] ;
            A777TBW12_ERR_MSG = P004D3_A777TBW12_ERR_MSG[0] ;
            n777TBW12_ERR_MSG = P004D3_n777TBW12_ERR_MSG[0] ;
            A181TBW12_SEQ = P004D3_A181TBW12_SEQ[0] ;
            AV19W_A_RESULT_MSG_SDT_ITEM = (SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem)new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
            AV19W_A_RESULT_MSG_SDT_ITEM.setgxTv_SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem_Result_msg( A777TBW12_ERR_MSG );
            AV18W_A_RESULT_MSG_SDT.add(AV19W_A_RESULT_MSG_SDT_ITEM, 0);
            /* Using cursor P004D4 */
            pr_default.execute(2, new Object[] {A179TBW12_SESSION_ID, A180TBW12_DATETIME, new Short(A181TBW12_SEQ)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW12_CRF_ERR_MSG") ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         Application.commit(context, remoteHandle, "DEFAULT", "b402_pc16_crf_ref_chk");
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV22W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b402_pc16_crf_ref_chk.this.AV22W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV22W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV30Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b402_pc16_crf_ref_chk.this.AV15W_A_CHK_RESULT_SDT;
      this.aP2[0] = b402_pc16_crf_ref_chk.this.AV18W_A_RESULT_MSG_SDT;
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
      AV15W_A_CHK_RESULT_SDT = new GxObjectCollection(SdtA_CHK_RESULT_SDT_A_CHK_RESULT_SDTItem.class, "A_CHK_RESULT_SDT.A_CHK_RESULT_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV18W_A_RESULT_MSG_SDT = new GxObjectCollection(SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem.class, "A_RESULT_MSG_SDT.A_RESULT_MSG_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV8C_TAM020_APP_ID = "" ;
      AV13W_A_CHK_INFO_SDT = new GxObjectCollection(SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem.class, "A_CHK_INFO_SDT.A_CHK_INFO_SDTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV30Pgmname = "" ;
      AV10P_SESSION_ID = "" ;
      AV12SESSION = httpContext.getWebSession();
      AV9P_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      P004D2_AV26W_RTN_CD = new byte[1] ;
      P004D2_AV11P_STUDY_ID = new long[1] ;
      P004D2_AV10P_SESSION_ID = new String[] {""} ;
      P004D2_AV9P_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      AV19W_A_RESULT_MSG_SDT_ITEM = new SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem(remoteHandle, context);
      GXt_char1 = "" ;
      scmdbuf = "" ;
      P004D3_A180TBW12_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P004D3_A179TBW12_SESSION_ID = new String[] {""} ;
      P004D3_A777TBW12_ERR_MSG = new String[] {""} ;
      P004D3_n777TBW12_ERR_MSG = new boolean[] {false} ;
      P004D3_A181TBW12_SEQ = new short[1] ;
      A180TBW12_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A179TBW12_SESSION_ID = "" ;
      A777TBW12_ERR_MSG = "" ;
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV22W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b402_pc16_crf_ref_chk__default(),
         new Object[] {
             new Object[] {
            P004D2_AV26W_RTN_CD, P004D2_AV11P_STUDY_ID, P004D2_AV10P_SESSION_ID, P004D2_AV9P_DATETIME
            }
            , new Object[] {
            P004D3_A180TBW12_DATETIME, P004D3_A179TBW12_SESSION_ID, P004D3_A777TBW12_ERR_MSG, P004D3_n777TBW12_ERR_MSG, P004D3_A181TBW12_SEQ
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV30Pgmname = "B402_PC16_CRF_REF_CHK" ;
      /* GeneXus formulas. */
      AV30Pgmname = "B402_PC16_CRF_REF_CHK" ;
      Gx_err = (short)(0) ;
   }

   private byte AV26W_RTN_CD ;
   private short A181TBW12_SEQ ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private String AV30Pgmname ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private java.util.Date AV9P_DATETIME ;
   private java.util.Date A180TBW12_DATETIME ;
   private boolean returnInSub ;
   private boolean AV23W_FOCUS_FLG ;
   private boolean n777TBW12_ERR_MSG ;
   private String AV8C_TAM020_APP_ID ;
   private String AV10P_SESSION_ID ;
   private String A179TBW12_SESSION_ID ;
   private String A777TBW12_ERR_MSG ;
   private String AV22W_ERRCD ;
   private com.genexus.webpanels.WebSession AV12SESSION ;
   private GxObjectCollection[] aP1 ;
   private GxObjectCollection[] aP2 ;
   private IDataStoreProvider pr_default ;
   private byte[] P004D2_AV26W_RTN_CD ;
   private long[] P004D2_AV11P_STUDY_ID ;
   private String[] P004D2_AV10P_SESSION_ID ;
   private java.util.Date[] P004D2_AV9P_DATETIME ;
   private java.util.Date[] P004D3_A180TBW12_DATETIME ;
   private String[] P004D3_A179TBW12_SESSION_ID ;
   private String[] P004D3_A777TBW12_ERR_MSG ;
   private boolean[] P004D3_n777TBW12_ERR_MSG ;
   private short[] P004D3_A181TBW12_SEQ ;
   private GxObjectCollection AV15W_A_CHK_RESULT_SDT ;
   private GxObjectCollection AV18W_A_RESULT_MSG_SDT ;
   private GxObjectCollection AV13W_A_CHK_INFO_SDT ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtA_RESULT_MSG_SDT_A_RESULT_MSG_SDTItem AV19W_A_RESULT_MSG_SDT_ITEM ;
}

final  class b402_pc16_crf_ref_chk__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new CallCursor("P004D2", "CALL PROC_CHK_CRF ( ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new ForEachCursor("P004D3", "SELECT `TBW12_DATETIME`, `TBW12_SESSION_ID`, `TBW12_ERR_MSG`, `TBW12_SEQ` FROM `TBW12_CRF_ERR_MSG` WHERE `TBW12_SESSION_ID` = ? and `TBW12_DATETIME` = ? ORDER BY `TBW12_SESSION_ID`, `TBW12_DATETIME`  FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,false )
         ,new UpdateCursor("P004D4", "DELETE FROM `TBW12_CRF_ERR_MSG`  WHERE `TBW12_SESSION_ID` = ? AND `TBW12_DATETIME` = ? AND `TBW12_SEQ` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
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
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.NUMERIC, 0 );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 4 , Types.TIMESTAMP );
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

