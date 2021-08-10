/*
               File: B805_PC01_WORK_DEL
        Description: 汎用ワークテーブル削除
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:46.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b805_pc01_work_del extends GXProcedure
{
   public b805_pc01_work_del( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b805_pc01_work_del.class ), "" );
   }

   public b805_pc01_work_del( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String aP1 )
   {
      b805_pc01_work_del.this.AV9P_APP_ID = aP0;
      b805_pc01_work_del.this.AV10P_DISP_DATETIME = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B805" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_MSG = "" ;
      AV15W_SESSION_ID = AV11W_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_Session_id() ;
      GXt_char1 = AV12W_DISP_DATETIME ;
      GXt_dtime2 = GXutil.resetTime( GXutil.dadd( GXutil.today( ) , - ( 1 )) );
      GXv_char3[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXt_dtime2, "YYYYMMDDHHMISS", GXv_char3) ;
      b805_pc01_work_del.this.GXt_char1 = GXv_char3[0] ;
      AV12W_DISP_DATETIME = GXt_char1 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV9P_APP_ID ,
                                           A53TBW01_DISP_DATETIME ,
                                           AV12W_DISP_DATETIME ,
                                           A51TBW01_SESSION_ID ,
                                           AV15W_SESSION_ID ,
                                           A52TBW01_APP_ID ,
                                           AV10P_DISP_DATETIME },
                                           new int[] {
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor P003S2 */
      pr_default.execute(0, new Object[] {AV12W_DISP_DATETIME, AV15W_SESSION_ID, AV15W_SESSION_ID, AV9P_APP_ID, AV10P_DISP_DATETIME});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A52TBW01_APP_ID = P003S2_A52TBW01_APP_ID[0] ;
         A51TBW01_SESSION_ID = P003S2_A51TBW01_SESSION_ID[0] ;
         A53TBW01_DISP_DATETIME = P003S2_A53TBW01_DISP_DATETIME[0] ;
         A54TBW01_LINE_NO = P003S2_A54TBW01_LINE_NO[0] ;
         /* Using cursor P003S3 */
         pr_default.execute(1, new Object[] {A51TBW01_SESSION_ID, A52TBW01_APP_ID, A53TBW01_DISP_DATETIME, new Long(A54TBW01_LINE_NO)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW01_FREE_WORK") ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Application.commit(context, remoteHandle, "DEFAULT", "b805_pc01_work_del");
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT4[0] = AV11W_A_LOGIN_SDT;
      GXv_char3[0] = AV13W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT4, GXv_char3) ;
      AV11W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT4[0] ;
      b805_pc01_work_del.this.AV13W_ERRCD = GXv_char3[0] ;
      if ( GXutil.strcmp(AV13W_ERRCD, "0") != 0 )
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV19Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b805_pc01_work_del");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   protected void cleanup( )
   {
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
      AV8C_TAM02_APP_ID = "" ;
      AV14W_MSG = "" ;
      AV15W_SESSION_ID = "" ;
      AV11W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      AV12W_DISP_DATETIME = "" ;
      GXt_char1 = "" ;
      GXt_dtime2 = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      A53TBW01_DISP_DATETIME = "" ;
      A51TBW01_SESSION_ID = "" ;
      A52TBW01_APP_ID = "" ;
      P003S2_A52TBW01_APP_ID = new String[] {""} ;
      P003S2_A51TBW01_SESSION_ID = new String[] {""} ;
      P003S2_A53TBW01_DISP_DATETIME = new String[] {""} ;
      P003S2_A54TBW01_LINE_NO = new long[1] ;
      GXv_SdtA_LOGIN_SDT4 = new SdtA_LOGIN_SDT [1] ;
      AV13W_ERRCD = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV19Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b805_pc01_work_del__default(),
         new Object[] {
             new Object[] {
            P003S2_A52TBW01_APP_ID, P003S2_A51TBW01_SESSION_ID, P003S2_A53TBW01_DISP_DATETIME, P003S2_A54TBW01_LINE_NO
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV19Pgmname = "B805_PC01_WORK_DEL" ;
      /* GeneXus formulas. */
      AV19Pgmname = "B805_PC01_WORK_DEL" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long A54TBW01_LINE_NO ;
   private String GXt_char1 ;
   private String scmdbuf ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV19Pgmname ;
   private String Gx_emsg ;
   private java.util.Date GXt_dtime2 ;
   private boolean returnInSub ;
   private String AV9P_APP_ID ;
   private String AV10P_DISP_DATETIME ;
   private String AV8C_TAM02_APP_ID ;
   private String AV14W_MSG ;
   private String AV15W_SESSION_ID ;
   private String AV12W_DISP_DATETIME ;
   private String A53TBW01_DISP_DATETIME ;
   private String A51TBW01_SESSION_ID ;
   private String A52TBW01_APP_ID ;
   private String AV13W_ERRCD ;
   private SdtA_LOGIN_SDT AV11W_A_LOGIN_SDT ;
   private IDataStoreProvider pr_default ;
   private String[] P003S2_A52TBW01_APP_ID ;
   private String[] P003S2_A51TBW01_SESSION_ID ;
   private String[] P003S2_A53TBW01_DISP_DATETIME ;
   private long[] P003S2_A54TBW01_LINE_NO ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT4[] ;
}

final  class b805_pc01_work_del__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P003S2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9P_APP_ID ,
                                          String A53TBW01_DISP_DATETIME ,
                                          String AV12W_DISP_DATETIME ,
                                          String A51TBW01_SESSION_ID ,
                                          String AV15W_SESSION_ID ,
                                          String A52TBW01_APP_ID ,
                                          String AV10P_DISP_DATETIME )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int5 ;
      GXv_int5 = new byte [5] ;
      Object[] GXv_Object6 ;
      GXv_Object6 = new Object [2] ;
      scmdbuf = "SELECT `TBW01_APP_ID`, `TBW01_SESSION_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`" ;
      scmdbuf = scmdbuf + " FROM `TBW01_FREE_WORK`" ;
      if ( GXutil.strcmp(AV9P_APP_ID, "A101") == 0 )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBW01_DISP_DATETIME` < ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBW01_DISP_DATETIME` < ?)" ;
         }
      }
      else
      {
         GXv_int5[0] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV9P_APP_ID, "A103") == 0 )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBW01_SESSION_ID` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBW01_SESSION_ID` = ?)" ;
         }
      }
      else
      {
         GXv_int5[1] = (byte)(1) ;
      }
      if ( ! ((GXutil.strcmp(AV9P_APP_ID, "A101")==0)||(GXutil.strcmp(AV9P_APP_ID, "A103")==0)) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBW01_SESSION_ID` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBW01_SESSION_ID` = ?)" ;
         }
      }
      else
      {
         GXv_int5[2] = (byte)(1) ;
      }
      if ( ! ((GXutil.strcmp(AV9P_APP_ID, "A101")==0)||(GXutil.strcmp(AV9P_APP_ID, "A103")==0)) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBW01_APP_ID` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBW01_APP_ID` = ?)" ;
         }
      }
      else
      {
         GXv_int5[3] = (byte)(1) ;
      }
      if ( ! ((GXutil.strcmp(AV9P_APP_ID, "A101")==0)||(GXutil.strcmp(AV9P_APP_ID, "A103")==0)) )
      {
         if ( GXutil.strcmp("", sWhereString) != 0 )
         {
            sWhereString = sWhereString + " and (`TBW01_DISP_DATETIME` = ?)" ;
         }
         else
         {
            sWhereString = sWhereString + " (`TBW01_DISP_DATETIME` = ?)" ;
         }
      }
      else
      {
         GXv_int5[4] = (byte)(1) ;
      }
      if ( GXutil.strcmp("", sWhereString) != 0 )
      {
         scmdbuf = scmdbuf + " WHERE" + sWhereString ;
      }
      scmdbuf = scmdbuf + " ORDER BY `TBW01_SESSION_ID`, `TBW01_APP_ID`, `TBW01_DISP_DATETIME`, `TBW01_LINE_NO`" ;
      scmdbuf = scmdbuf + " FOR UPDATE " ;
      GXv_Object6[0] = scmdbuf ;
      GXv_Object6[1] = GXv_int5 ;
      return GXv_Object6 ;
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
                  return conditional_P003S2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003S2", "scmdbuf",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new UpdateCursor("P003S3", "DELETE FROM `TBW01_FREE_WORK`  WHERE `TBW01_SESSION_ID` = ? AND `TBW01_APP_ID` = ? AND `TBW01_DISP_DATETIME` = ? AND `TBW01_LINE_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
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
                  stmt.setVarchar(sIdx, (String)parms[5], 14);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[6], 50);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[7], 50);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[8], 7);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[9], 14);
               }
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
      }
   }

}

