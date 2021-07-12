/*
               File: A805_PC01_MSG_GET
        Description: メッセージ取得処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:11.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a805_pc01_msg_get extends GXProcedure
{
   public a805_pc01_msg_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a805_pc01_msg_get.class ), "" );
   }

   public a805_pc01_msg_get( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 )
   {
      a805_pc01_msg_get.this.AV13P_TAM06_MSG_CD = aP0;
      a805_pc01_msg_get.this.AV8P_REP_1 = aP1;
      a805_pc01_msg_get.this.AV9P_REP_2 = aP2;
      a805_pc01_msg_get.this.AV10P_REP_3 = aP3;
      a805_pc01_msg_get.this.AV11P_REP_4 = aP4;
      a805_pc01_msg_get.this.AV12P_REP_5 = aP5;
      a805_pc01_msg_get.this.aP6 = aP6;
      a805_pc01_msg_get.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String aP5 ,
                             String[] aP6 )
   {
      a805_pc01_msg_get.this.AV13P_TAM06_MSG_CD = aP0;
      a805_pc01_msg_get.this.AV8P_REP_1 = aP1;
      a805_pc01_msg_get.this.AV9P_REP_2 = aP2;
      a805_pc01_msg_get.this.AV10P_REP_3 = aP3;
      a805_pc01_msg_get.this.AV11P_REP_4 = aP4;
      a805_pc01_msg_get.this.AV12P_REP_5 = aP5;
      a805_pc01_msg_get.this.aP6 = aP6;
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
      if ( ! (GXutil.strcmp("", AV13P_TAM06_MSG_CD)==0) )
      {
         AV17GXLvl26 = (byte)(0) ;
         /* Using cursor P00042 */
         pr_default.execute(0, new Object[] {AV13P_TAM06_MSG_CD});
         if ( Gx_err != 0 )
         {
            AV17GXLvl26 = (byte)(1) ;
         }
         while ( (pr_default.getStatus(0) != 101) )
         {
            A297TAM06_DEL_FLG = P00042_A297TAM06_DEL_FLG[0] ;
            n297TAM06_DEL_FLG = P00042_n297TAM06_DEL_FLG[0] ;
            A6TAM06_MSG_CD = P00042_A6TAM06_MSG_CD[0] ;
            A216TAM06_MSG = P00042_A216TAM06_MSG[0] ;
            n216TAM06_MSG = P00042_n216TAM06_MSG[0] ;
            AV17GXLvl26 = (byte)(1) ;
            AV14W_MSG = AV13P_TAM06_MSG_CD + "：" + ((GXutil.strcmp("", A216TAM06_MSG)==0) ? "メッセージマスタに該当データなし" : A216TAM06_MSG) ;
            if ( ! (GXutil.strcmp("", AV8P_REP_1)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$1$", AV8P_REP_1) ;
            }
            if ( ! (GXutil.strcmp("", AV9P_REP_2)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$2$", AV9P_REP_2) ;
            }
            if ( ! (GXutil.strcmp("", AV10P_REP_3)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$3$", AV10P_REP_3) ;
            }
            if ( ! (GXutil.strcmp("", AV11P_REP_4)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$4$", AV11P_REP_4) ;
            }
            if ( ! (GXutil.strcmp("", AV12P_REP_5)==0) )
            {
               AV14W_MSG = GXutil.strReplace( AV14W_MSG, "$5$", AV12P_REP_5) ;
            }
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         if ( AV17GXLvl26 == 0 )
         {
            AV14W_MSG = AV13P_TAM06_MSG_CD + "：" + "メッセージマスタに該当データなし" ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV18Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV14W_MSG = AV13P_TAM06_MSG_CD + "：" + "メッセージマスタに該当データなし" ;
      context.globals.Gx_eop = (byte)(0) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "a805_pc01_msg_get");
   }

   protected void cleanup( )
   {
      this.aP6[0] = a805_pc01_msg_get.this.AV14W_MSG;
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
      AV14W_MSG = "" ;
      scmdbuf = "" ;
      P00042_A297TAM06_DEL_FLG = new String[] {""} ;
      P00042_n297TAM06_DEL_FLG = new boolean[] {false} ;
      P00042_A6TAM06_MSG_CD = new String[] {""} ;
      P00042_A216TAM06_MSG = new String[] {""} ;
      P00042_n216TAM06_MSG = new boolean[] {false} ;
      A297TAM06_DEL_FLG = "" ;
      A6TAM06_MSG_CD = "" ;
      A216TAM06_MSG = "" ;
      AV18Pgmname = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new a805_pc01_msg_get__default(),
         new Object[] {
             new Object[] {
            P00042_A297TAM06_DEL_FLG, P00042_n297TAM06_DEL_FLG, P00042_A6TAM06_MSG_CD, P00042_A216TAM06_MSG, P00042_n216TAM06_MSG
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV18Pgmname = "A805_PC01_MSG_GET" ;
      /* GeneXus formulas. */
      AV18Pgmname = "A805_PC01_MSG_GET" ;
      Gx_err = (short)(0) ;
   }

   private byte AV17GXLvl26 ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV18Pgmname ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n297TAM06_DEL_FLG ;
   private boolean n216TAM06_MSG ;
   private String AV13P_TAM06_MSG_CD ;
   private String AV8P_REP_1 ;
   private String AV9P_REP_2 ;
   private String AV10P_REP_3 ;
   private String AV11P_REP_4 ;
   private String AV12P_REP_5 ;
   private String AV14W_MSG ;
   private String A297TAM06_DEL_FLG ;
   private String A6TAM06_MSG_CD ;
   private String A216TAM06_MSG ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00042_A297TAM06_DEL_FLG ;
   private boolean[] P00042_n297TAM06_DEL_FLG ;
   private String[] P00042_A6TAM06_MSG_CD ;
   private String[] P00042_A216TAM06_MSG ;
   private boolean[] P00042_n216TAM06_MSG ;
}

final  class a805_pc01_msg_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00042", "SELECT `TAM06_DEL_FLG`, `TAM06_MSG_CD`, `TAM06_MSG` FROM `TAM06_MSG` WHERE (`TAM06_MSG_CD` = ?) AND (`TAM06_DEL_FLG` = '0') ORDER BY `TAM06_MSG_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               stmt.setVarchar(1, (String)parms[0], 7);
               return;
      }
   }

}

