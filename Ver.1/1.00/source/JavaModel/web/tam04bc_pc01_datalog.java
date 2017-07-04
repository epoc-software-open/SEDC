/*
               File: TAM04BC_PC01_DATALOG
        Description: 権限パターンマスタデータログ出力
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:43.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class tam04bc_pc01_datalog extends GXProcedure
{
   public tam04bc_pc01_datalog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam04bc_pc01_datalog.class ), "" );
   }

   public tam04bc_pc01_datalog( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      tam04bc_pc01_datalog.this.AV9P_PGNAME = aP0;
      tam04bc_pc01_datalog.this.AV8P_MODE = aP1;
      tam04bc_pc01_datalog.this.AV15P_TAM04_KNGN_PTN_KBN = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new a804_pc02_log_start(remoteHandle, context).execute( AV9P_PGNAME) ;
      /* Using cursor P000G2 */
      pr_default.execute(0, new Object[] {AV15P_TAM04_KNGN_PTN_KBN});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A17TAM04_AUTH_CD = P000G2_A17TAM04_AUTH_CD[0] ;
         A101TAM05_KNGN_FLG = P000G2_A101TAM05_KNGN_FLG[0] ;
         n101TAM05_KNGN_FLG = P000G2_n101TAM05_KNGN_FLG[0] ;
         A102TAM05_DEL_FLG = P000G2_A102TAM05_DEL_FLG[0] ;
         n102TAM05_DEL_FLG = P000G2_n102TAM05_DEL_FLG[0] ;
         A103TAM05_CRT_DATETIME = P000G2_A103TAM05_CRT_DATETIME[0] ;
         n103TAM05_CRT_DATETIME = P000G2_n103TAM05_CRT_DATETIME[0] ;
         A104TAM05_CRT_USER_ID = P000G2_A104TAM05_CRT_USER_ID[0] ;
         n104TAM05_CRT_USER_ID = P000G2_n104TAM05_CRT_USER_ID[0] ;
         A105TAM05_CRT_PROG_NM = P000G2_A105TAM05_CRT_PROG_NM[0] ;
         n105TAM05_CRT_PROG_NM = P000G2_n105TAM05_CRT_PROG_NM[0] ;
         A106TAM05_UPD_DATETIME = P000G2_A106TAM05_UPD_DATETIME[0] ;
         n106TAM05_UPD_DATETIME = P000G2_n106TAM05_UPD_DATETIME[0] ;
         A107TAM05_UPD_USER_ID = P000G2_A107TAM05_UPD_USER_ID[0] ;
         n107TAM05_UPD_USER_ID = P000G2_n107TAM05_UPD_USER_ID[0] ;
         A108TAM05_UPD_PROG_NM = P000G2_A108TAM05_UPD_PROG_NM[0] ;
         n108TAM05_UPD_PROG_NM = P000G2_n108TAM05_UPD_PROG_NM[0] ;
         A109TAM05_UPD_CNT = P000G2_A109TAM05_UPD_CNT[0] ;
         n109TAM05_UPD_CNT = P000G2_n109TAM05_UPD_CNT[0] ;
         A88TAM03_APP_ID = P000G2_A88TAM03_APP_ID[0] ;
         AV14W_TXT = "" ;
         AV14W_TXT = AV14W_TXT + "権限パターン区分:" + A17TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + "アプリケーションID:" + A88TAM03_APP_ID + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A101TAM05_KNGN_FLG + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A102TAM05_DEL_FLG + GXutil.chr( (short)(9)) ;
         GXt_char1 = AV14W_TXT ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A103TAM05_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         tam04bc_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
         AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A104TAM05_CRT_USER_ID + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A105TAM05_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
         GXt_char1 = AV14W_TXT ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( A106TAM05_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         tam04bc_pc01_datalog.this.GXt_char1 = GXv_char2[0] ;
         AV14W_TXT = AV14W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A107TAM05_UPD_USER_ID + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + A108TAM05_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
         AV14W_TXT = AV14W_TXT + GXutil.trim( GXutil.str( A109TAM05_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
         AV14W_TXT = GXutil.strReplace( AV14W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
         new a804_pc03_datalog(remoteHandle, context).execute( AV9P_PGNAME, AV8P_MODE, AV14W_TXT) ;
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
      P000G2_A17TAM04_AUTH_CD = new String[] {""} ;
      P000G2_A101TAM05_KNGN_FLG = new String[] {""} ;
      P000G2_n101TAM05_KNGN_FLG = new boolean[] {false} ;
      P000G2_A102TAM05_DEL_FLG = new String[] {""} ;
      P000G2_n102TAM05_DEL_FLG = new boolean[] {false} ;
      P000G2_A103TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P000G2_n103TAM05_CRT_DATETIME = new boolean[] {false} ;
      P000G2_A104TAM05_CRT_USER_ID = new String[] {""} ;
      P000G2_n104TAM05_CRT_USER_ID = new boolean[] {false} ;
      P000G2_A105TAM05_CRT_PROG_NM = new String[] {""} ;
      P000G2_n105TAM05_CRT_PROG_NM = new boolean[] {false} ;
      P000G2_A106TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P000G2_n106TAM05_UPD_DATETIME = new boolean[] {false} ;
      P000G2_A107TAM05_UPD_USER_ID = new String[] {""} ;
      P000G2_n107TAM05_UPD_USER_ID = new boolean[] {false} ;
      P000G2_A108TAM05_UPD_PROG_NM = new String[] {""} ;
      P000G2_n108TAM05_UPD_PROG_NM = new boolean[] {false} ;
      P000G2_A109TAM05_UPD_CNT = new long[1] ;
      P000G2_n109TAM05_UPD_CNT = new boolean[] {false} ;
      P000G2_A88TAM03_APP_ID = new String[] {""} ;
      A17TAM04_AUTH_CD = "" ;
      A101TAM05_KNGN_FLG = "" ;
      A102TAM05_DEL_FLG = "" ;
      A103TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A104TAM05_CRT_USER_ID = "" ;
      A105TAM05_CRT_PROG_NM = "" ;
      A106TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A107TAM05_UPD_USER_ID = "" ;
      A108TAM05_UPD_PROG_NM = "" ;
      A88TAM03_APP_ID = "" ;
      AV14W_TXT = "" ;
      GXv_char2 = new String [1] ;
      GXt_char1 = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04bc_pc01_datalog__default(),
         new Object[] {
             new Object[] {
            P000G2_A17TAM04_AUTH_CD, P000G2_A101TAM05_KNGN_FLG, P000G2_n101TAM05_KNGN_FLG, P000G2_A102TAM05_DEL_FLG, P000G2_n102TAM05_DEL_FLG, P000G2_A103TAM05_CRT_DATETIME, P000G2_n103TAM05_CRT_DATETIME, P000G2_A104TAM05_CRT_USER_ID, P000G2_n104TAM05_CRT_USER_ID, P000G2_A105TAM05_CRT_PROG_NM,
            P000G2_n105TAM05_CRT_PROG_NM, P000G2_A106TAM05_UPD_DATETIME, P000G2_n106TAM05_UPD_DATETIME, P000G2_A107TAM05_UPD_USER_ID, P000G2_n107TAM05_UPD_USER_ID, P000G2_A108TAM05_UPD_PROG_NM, P000G2_n108TAM05_UPD_PROG_NM, P000G2_A109TAM05_UPD_CNT, P000G2_n109TAM05_UPD_CNT, P000G2_A88TAM03_APP_ID
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private long A109TAM05_UPD_CNT ;
   private String scmdbuf ;
   private String GXv_char2[] ;
   private String GXt_char1 ;
   private java.util.Date A103TAM05_CRT_DATETIME ;
   private java.util.Date A106TAM05_UPD_DATETIME ;
   private boolean n101TAM05_KNGN_FLG ;
   private boolean n102TAM05_DEL_FLG ;
   private boolean n103TAM05_CRT_DATETIME ;
   private boolean n104TAM05_CRT_USER_ID ;
   private boolean n105TAM05_CRT_PROG_NM ;
   private boolean n106TAM05_UPD_DATETIME ;
   private boolean n107TAM05_UPD_USER_ID ;
   private boolean n108TAM05_UPD_PROG_NM ;
   private boolean n109TAM05_UPD_CNT ;
   private String AV9P_PGNAME ;
   private String AV8P_MODE ;
   private String AV15P_TAM04_KNGN_PTN_KBN ;
   private String A17TAM04_AUTH_CD ;
   private String A101TAM05_KNGN_FLG ;
   private String A102TAM05_DEL_FLG ;
   private String A104TAM05_CRT_USER_ID ;
   private String A105TAM05_CRT_PROG_NM ;
   private String A107TAM05_UPD_USER_ID ;
   private String A108TAM05_UPD_PROG_NM ;
   private String A88TAM03_APP_ID ;
   private String AV14W_TXT ;
   private IDataStoreProvider pr_default ;
   private String[] P000G2_A17TAM04_AUTH_CD ;
   private String[] P000G2_A101TAM05_KNGN_FLG ;
   private boolean[] P000G2_n101TAM05_KNGN_FLG ;
   private String[] P000G2_A102TAM05_DEL_FLG ;
   private boolean[] P000G2_n102TAM05_DEL_FLG ;
   private java.util.Date[] P000G2_A103TAM05_CRT_DATETIME ;
   private boolean[] P000G2_n103TAM05_CRT_DATETIME ;
   private String[] P000G2_A104TAM05_CRT_USER_ID ;
   private boolean[] P000G2_n104TAM05_CRT_USER_ID ;
   private String[] P000G2_A105TAM05_CRT_PROG_NM ;
   private boolean[] P000G2_n105TAM05_CRT_PROG_NM ;
   private java.util.Date[] P000G2_A106TAM05_UPD_DATETIME ;
   private boolean[] P000G2_n106TAM05_UPD_DATETIME ;
   private String[] P000G2_A107TAM05_UPD_USER_ID ;
   private boolean[] P000G2_n107TAM05_UPD_USER_ID ;
   private String[] P000G2_A108TAM05_UPD_PROG_NM ;
   private boolean[] P000G2_n108TAM05_UPD_PROG_NM ;
   private long[] P000G2_A109TAM05_UPD_CNT ;
   private boolean[] P000G2_n109TAM05_UPD_CNT ;
   private String[] P000G2_A88TAM03_APP_ID ;
}

final  class tam04bc_pc01_datalog__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000G2", "SELECT `TAM04_AUTH_CD`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_PROG_NM`, `TAM05_UPD_CNT`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 2);
               break;
      }
   }

}

