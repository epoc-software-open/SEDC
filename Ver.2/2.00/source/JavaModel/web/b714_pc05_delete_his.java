/*
               File: B714_PC05_DELETE_HIS
        Description: CRFóöóçÌèú
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:42.88
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b714_pc05_delete_his extends GXProcedure
{
   public b714_pc05_delete_his( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b714_pc05_delete_his.class ), "" );
   }

   public b714_pc05_delete_his( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             byte[] aP4 )
   {
      b714_pc05_delete_his.this.AV12P_STUDY_ID = aP0;
      b714_pc05_delete_his.this.AV13P_SUBJECT_ID = aP1;
      b714_pc05_delete_his.this.AV11P_CRF_ID = aP2;
      b714_pc05_delete_his.this.AV19P_CRF_EDA_NO = aP3;
      b714_pc05_delete_his.this.aP4 = aP4;
      b714_pc05_delete_his.this.aP5 = aP5;
      b714_pc05_delete_his.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      b714_pc05_delete_his.this.AV12P_STUDY_ID = aP0;
      b714_pc05_delete_his.this.AV13P_SUBJECT_ID = aP1;
      b714_pc05_delete_his.this.AV11P_CRF_ID = aP2;
      b714_pc05_delete_his.this.AV19P_CRF_EDA_NO = aP3;
      b714_pc05_delete_his.this.aP4 = aP4;
      b714_pc05_delete_his.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_TAM02_APP_ID = "B714" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_RTN_CD = (byte)(0) ;
      AV18W_RTN_MSG = "" ;
      /* Optimized DELETE. */
      /* Using cursor P006Y2 */
      pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT11_CRF_HISTORY") ;
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P006Y3 */
      pr_default.execute(1, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV19P_CRF_EDA_NO)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT13_CRF_RES_HIS") ;
      /* End optimized DELETE. */
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      new a804_pc02_log_start(remoteHandle, context).execute( AV24Pgmname) ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      Application.rollback(context, remoteHandle, "DEFAULT", "b714_pc05_delete_his");
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b714_pc05_delete_his.this.AV17W_RTN_CD;
      this.aP5[0] = b714_pc05_delete_his.this.AV18W_RTN_MSG;
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
      AV18W_RTN_MSG = "" ;
      AV10C_TAM02_APP_ID = "" ;
      AV24Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b714_pc05_delete_his__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B714_PC05_DELETE_HIS" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B714_PC05_DELETE_HIS" ;
      Gx_err = (short)(0) ;
   }

   private byte AV19P_CRF_EDA_NO ;
   private byte AV17W_RTN_CD ;
   private short AV11P_CRF_ID ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private String AV24Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV18W_RTN_MSG ;
   private String AV10C_TAM02_APP_ID ;
   private byte[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class b714_pc05_delete_his__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P006Y2", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ? and `TBT11_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P006Y3", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
      }
   }

}

