/*
               File: B799_PC13_GET_USER_STUDY
        Description: ÉÜÅ[ÉUéQâ¡ééå±éÊìæ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc13_get_user_study extends GXProcedure
{
   public b799_pc13_get_user_study( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc13_get_user_study.class ), "" );
   }

   public b799_pc13_get_user_study( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public SdtA_USER_STUDY_SDT executeUdp( String aP0 )
   {
      b799_pc13_get_user_study.this.AV8P_USER_ID = aP0;
      b799_pc13_get_user_study.this.aP1 = aP1;
      b799_pc13_get_user_study.this.aP1 = new SdtA_USER_STUDY_SDT[] {new SdtA_USER_STUDY_SDT()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        SdtA_USER_STUDY_SDT[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             SdtA_USER_STUDY_SDT[] aP1 )
   {
      b799_pc13_get_user_study.this.AV8P_USER_ID = aP0;
      b799_pc13_get_user_study.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9B_USER_STUDY_SDT.getgxTv_SdtA_USER_STUDY_SDT_Study_id().clear();
      GXt_char1 = AV10C_DM_AUTH_CD ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "008", GXv_char2) ;
      b799_pc13_get_user_study.this.GXt_char1 = GXv_char2[0] ;
      AV10C_DM_AUTH_CD = GXt_char1 ;
      /* Using cursor P00712 */
      pr_default.execute(0, new Object[] {AV8P_USER_ID, AV10C_DM_AUTH_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A385TBM23_DEL_FLG = P00712_A385TBM23_DEL_FLG[0] ;
         n385TBM23_DEL_FLG = P00712_n385TBM23_DEL_FLG[0] ;
         A109TBM23_STYDY_AUTH_CD = P00712_A109TBM23_STYDY_AUTH_CD[0] ;
         A108TBM23_USER_ID = P00712_A108TBM23_USER_ID[0] ;
         A107TBM23_STUDY_ID = P00712_A107TBM23_STUDY_ID[0] ;
         AV9B_USER_STUDY_SDT.getgxTv_SdtA_USER_STUDY_SDT_Study_id().add(A107TBM23_STUDY_ID, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b799_pc13_get_user_study.this.AV9B_USER_STUDY_SDT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9B_USER_STUDY_SDT = new SdtA_USER_STUDY_SDT(remoteHandle, context);
      AV10C_DM_AUTH_CD = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      scmdbuf = "" ;
      P00712_A385TBM23_DEL_FLG = new String[] {""} ;
      P00712_n385TBM23_DEL_FLG = new boolean[] {false} ;
      P00712_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      P00712_A108TBM23_USER_ID = new String[] {""} ;
      P00712_A107TBM23_STUDY_ID = new long[1] ;
      A385TBM23_DEL_FLG = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      A108TBM23_USER_ID = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc13_get_user_study__default(),
         new Object[] {
             new Object[] {
            P00712_A385TBM23_DEL_FLG, P00712_n385TBM23_DEL_FLG, P00712_A109TBM23_STYDY_AUTH_CD, P00712_A108TBM23_USER_ID, P00712_A107TBM23_STUDY_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A107TBM23_STUDY_ID ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private boolean n385TBM23_DEL_FLG ;
   private String AV8P_USER_ID ;
   private String AV10C_DM_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A108TBM23_USER_ID ;
   private SdtA_USER_STUDY_SDT[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P00712_A385TBM23_DEL_FLG ;
   private boolean[] P00712_n385TBM23_DEL_FLG ;
   private String[] P00712_A109TBM23_STYDY_AUTH_CD ;
   private String[] P00712_A108TBM23_USER_ID ;
   private long[] P00712_A107TBM23_STUDY_ID ;
   private SdtA_USER_STUDY_SDT AV9B_USER_STUDY_SDT ;
}

final  class b799_pc13_get_user_study__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00712", "SELECT `TBM23_DEL_FLG`, `TBM23_STYDY_AUTH_CD`, `TBM23_USER_ID`, `TBM23_STUDY_ID` FROM `TBM23_STUDY_STAFF` WHERE (`TBM23_USER_ID` = ?) AND (`TBM23_STYDY_AUTH_CD` = ?) AND (`TBM23_DEL_FLG` = '0') ORDER BY `TBM23_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               stmt.setVarchar(2, (String)parms[1], 2);
               return;
      }
   }

}

