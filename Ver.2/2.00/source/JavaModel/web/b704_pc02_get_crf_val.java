/*
               File: B704_PC02_GET_CRF_VAL
        Description: CRF入力データ取得処理（セッションGET）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:13.83
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b704_pc02_get_crf_val extends GXProcedure
{
   public b704_pc02_get_crf_val( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b704_pc02_get_crf_val.class ), "" );
   }

   public b704_pc02_get_crf_val( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtB792_SD01_CRF[] aP0 )
   {
      b704_pc02_get_crf_val.this.AV8SD_B792_SD01_CRF = aP0[0];
      this.aP0 = aP0;
      b704_pc02_get_crf_val.this.aP1 = aP1;
      b704_pc02_get_crf_val.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( SdtB792_SD01_CRF[] aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( SdtB792_SD01_CRF[] aP0 ,
                             String[] aP1 )
   {
      b704_pc02_get_crf_val.this.AV8SD_B792_SD01_CRF = aP0[0];
      this.aP0 = aP0;
      b704_pc02_get_crf_val.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV13W_RTN_CD = "0" ;
      GXt_char1 = AV15W_SESSION_KEY ;
      GXv_char2[0] = GXt_char1 ;
      new b799_pc01_get_session_key(remoteHandle, context).execute( (short)(2), AV10W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Tam07_user_id(), GXv_char2) ;
      b704_pc02_get_crf_val.this.GXt_char1 = GXv_char2[0] ;
      AV15W_SESSION_KEY = GXt_char1 ;
      if ( (GXutil.strcmp("", AV14W_SESSION.getValue(AV15W_SESSION_KEY))==0) )
      {
         AV13W_RTN_CD = "1" ;
      }
      else
      {
         AV8SD_B792_SD01_CRF.fromxml(AV14W_SESSION.getValue(AV15W_SESSION_KEY), "");
         /* Using cursor P005H2 */
         pr_default.execute(0, new Object[] {new Long(AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id()), new Short(AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id())});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A75TBM32_DEL_FLG = P005H2_A75TBM32_DEL_FLG[0] ;
            n75TBM32_DEL_FLG = P005H2_n75TBM32_DEL_FLG[0] ;
            A71TBM32_CRF_ID = P005H2_A71TBM32_CRF_ID[0] ;
            A70TBM32_STUDY_ID = P005H2_A70TBM32_STUDY_ID[0] ;
            A72TBM32_CRF_ITEM_CD = P005H2_A72TBM32_CRF_ITEM_CD[0] ;
            AV16W_SESSION_KEY_ITEM = "html5rk" + "_" ;
            AV16W_SESSION_KEY_ITEM = AV16W_SESSION_KEY_ITEM + GXutil.trim( GXutil.str( AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id(), 10, 0)) + "_" ;
            AV16W_SESSION_KEY_ITEM = AV16W_SESSION_KEY_ITEM + GXutil.trim( GXutil.str( AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id(), 6, 0)) + "_" ;
            AV16W_SESSION_KEY_ITEM = AV16W_SESSION_KEY_ITEM + GXutil.trim( GXutil.str( AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id(), 4, 0)) + "_" ;
            AV16W_SESSION_KEY_ITEM = AV16W_SESSION_KEY_ITEM + GXutil.trim( GXutil.str( AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no(), 2, 0)) + "_" ;
            AV16W_SESSION_KEY_ITEM = AV16W_SESSION_KEY_ITEM + A72TBM32_CRF_ITEM_CD ;
            if ( (GXutil.strcmp("", AV14W_SESSION.getValue(AV16W_SESSION_KEY_ITEM))==0) )
            {
            }
            else
            {
               AV12W_FLG = "0" ;
               AV21GXV1 = 1 ;
               while ( AV21GXV1 <= AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().size() )
               {
                  AV9SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)((SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().elementAt(-1+AV21GXV1));
                  if ( GXutil.strcmp(AV9SD_B792_SD02_CRF_RESULT_I.getgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd(), A72TBM32_CRF_ITEM_CD) == 0 )
                  {
                     AV17W_TBT12_CRF_VALUE = AV14W_SESSION.getValue(AV16W_SESSION_KEY_ITEM) ;
                     if ( GXutil.strcmp(AV17W_TBT12_CRF_VALUE, "GXXEV1_NULL") == 0 )
                     {
                        AV9SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( "" );
                     }
                     else
                     {
                        AV9SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( AV17W_TBT12_CRF_VALUE );
                     }
                     AV12W_FLG = "1" ;
                  }
                  AV21GXV1 = (int)(AV21GXV1+1) ;
               }
               if ( GXutil.strcmp(AV12W_FLG, "0") == 0 )
               {
                  AV9SD_B792_SD02_CRF_RESULT_I = (SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem)new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
                  AV9SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_div( "0" );
                  AV9SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_item_grp_cd( A72TBM32_CRF_ITEM_CD );
                  AV9SD_B792_SD02_CRF_RESULT_I.setgxTv_SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem_Tbt12_crf_value( AV14W_SESSION.getValue(AV16W_SESSION_KEY_ITEM) );
                  AV8SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Crf_results().add(AV9SD_B792_SD02_CRF_RESULT_I, 0);
               }
               AV14W_SESSION.remove(AV16W_SESSION_KEY_ITEM);
            }
            pr_default.readNext(0);
         }
         pr_default.close(0);
         AV14W_SESSION.setValue(AV15W_SESSION_KEY, AV8SD_B792_SD01_CRF.toxml(false, true, "B792_SD01_CRF", "tablet-EDC_GXXEV3U3"));
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV10W_A_LOGIN_SDT;
      GXv_char2[0] = AV11W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV10W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b704_pc02_get_crf_val.this.AV11W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV11W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = b704_pc02_get_crf_val.this.AV8SD_B792_SD01_CRF;
      this.aP1[0] = b704_pc02_get_crf_val.this.AV13W_RTN_CD;
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
      AV13W_RTN_CD = "" ;
      AV15W_SESSION_KEY = "" ;
      GXt_char1 = "" ;
      AV10W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV14W_SESSION = httpContext.getWebSession();
      scmdbuf = "" ;
      P005H2_A75TBM32_DEL_FLG = new String[] {""} ;
      P005H2_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P005H2_A71TBM32_CRF_ID = new short[1] ;
      P005H2_A70TBM32_STUDY_ID = new long[1] ;
      P005H2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      AV16W_SESSION_KEY_ITEM = "" ;
      AV12W_FLG = "" ;
      AV9SD_B792_SD02_CRF_RESULT_I = new SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem(remoteHandle, context);
      AV17W_TBT12_CRF_VALUE = "" ;
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV11W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV22Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b704_pc02_get_crf_val__default(),
         new Object[] {
             new Object[] {
            P005H2_A75TBM32_DEL_FLG, P005H2_n75TBM32_DEL_FLG, P005H2_A71TBM32_CRF_ID, P005H2_A70TBM32_STUDY_ID, P005H2_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B704_PC02_GET_CRF_VAL" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B704_PC02_GET_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private short A71TBM32_CRF_ID ;
   private short Gx_err ;
   private int AV21GXV1 ;
   private int GXActiveErrHndl ;
   private long A70TBM32_STUDY_ID ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV22Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n75TBM32_DEL_FLG ;
   private String AV13W_RTN_CD ;
   private String AV15W_SESSION_KEY ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV16W_SESSION_KEY_ITEM ;
   private String AV12W_FLG ;
   private String AV17W_TBT12_CRF_VALUE ;
   private String AV11W_ERRCD ;
   private com.genexus.webpanels.WebSession AV14W_SESSION ;
   private SdtA_LOGIN_SDT AV10W_A_LOGIN_SDT ;
   private SdtB792_SD01_CRF[] aP0 ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P005H2_A75TBM32_DEL_FLG ;
   private boolean[] P005H2_n75TBM32_DEL_FLG ;
   private short[] P005H2_A71TBM32_CRF_ID ;
   private long[] P005H2_A70TBM32_STUDY_ID ;
   private String[] P005H2_A72TBM32_CRF_ITEM_CD ;
   private SdtB792_SD01_CRF AV8SD_B792_SD01_CRF ;
   private SdtB792_SD02_CRF_RESULT_B792_SD02_CRF_RESULTItem AV9SD_B792_SD02_CRF_RESULT_I ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

final  class b704_pc02_get_crf_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005H2", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

