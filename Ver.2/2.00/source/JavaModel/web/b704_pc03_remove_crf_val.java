/*
               File: B704_PC03_REMOVE_CRF_VAL
        Description: CRF入力データ削除処理（セッションREMOVE）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:15.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b704_pc03_remove_crf_val extends GXProcedure
{
   public b704_pc03_remove_crf_val( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b704_pc03_remove_crf_val.class ), "" );
   }

   public b704_pc03_remove_crf_val( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        byte aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             byte aP3 )
   {
      b704_pc03_remove_crf_val.this.AV9P_STUDY_ID = aP0;
      b704_pc03_remove_crf_val.this.AV10P_SUBJECT_ID = aP1;
      b704_pc03_remove_crf_val.this.AV8P_CRF_ID = aP2;
      b704_pc03_remove_crf_val.this.AV13P_CRF_EDA_NO = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P005K2 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV8P_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A75TBM32_DEL_FLG = P005K2_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P005K2_n75TBM32_DEL_FLG[0] ;
         A71TBM32_CRF_ID = P005K2_A71TBM32_CRF_ID[0] ;
         A70TBM32_STUDY_ID = P005K2_A70TBM32_STUDY_ID[0] ;
         A72TBM32_CRF_ITEM_CD = P005K2_A72TBM32_CRF_ITEM_CD[0] ;
         AV12W_SESSION_KEY = "html5rk" + "_" ;
         AV12W_SESSION_KEY = AV12W_SESSION_KEY + GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) + "_" ;
         AV12W_SESSION_KEY = AV12W_SESSION_KEY + GXutil.trim( GXutil.str( AV10P_SUBJECT_ID, 6, 0)) + "_" ;
         AV12W_SESSION_KEY = AV12W_SESSION_KEY + GXutil.trim( GXutil.str( AV8P_CRF_ID, 4, 0)) + "_" ;
         AV12W_SESSION_KEY = AV12W_SESSION_KEY + GXutil.trim( GXutil.str( AV13P_CRF_EDA_NO, 2, 0)) + "_" ;
         AV12W_SESSION_KEY = AV12W_SESSION_KEY + A72TBM32_CRF_ITEM_CD ;
         AV11W_SESSION.remove(AV12W_SESSION_KEY);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
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
   public void initialize( )
   {
      scmdbuf = "" ;
      P005K2_A75TBM32_DEL_FLG = new String[] {""} ;
      P005K2_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P005K2_A71TBM32_CRF_ID = new short[1] ;
      P005K2_A70TBM32_STUDY_ID = new long[1] ;
      P005K2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      AV12W_SESSION_KEY = "" ;
      AV11W_SESSION = httpContext.getWebSession();
      pr_default = new DataStoreProvider(context, remoteHandle, new b704_pc03_remove_crf_val__default(),
         new Object[] {
             new Object[] {
            P005K2_A75TBM32_DEL_FLG, P005K2_n75TBM32_DEL_FLG, P005K2_A71TBM32_CRF_ID, P005K2_A70TBM32_STUDY_ID, P005K2_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13P_CRF_EDA_NO ;
   private short AV8P_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short Gx_err ;
   private int AV10P_SUBJECT_ID ;
   private long AV9P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private String scmdbuf ;
   private boolean n75TBM32_DEL_FLG ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String AV12W_SESSION_KEY ;
   private IDataStoreProvider pr_default ;
   private String[] P005K2_A75TBM32_DEL_FLG ;
   private boolean[] P005K2_n75TBM32_DEL_FLG ;
   private short[] P005K2_A71TBM32_CRF_ID ;
   private long[] P005K2_A70TBM32_STUDY_ID ;
   private String[] P005K2_A72TBM32_CRF_ITEM_CD ;
   private com.genexus.webpanels.WebSession AV11W_SESSION ;
}

final  class b704_pc03_remove_crf_val__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005K2", "SELECT `TBM32_DEL_FLG`, `TBM32_CRF_ID`, `TBM32_STUDY_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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

