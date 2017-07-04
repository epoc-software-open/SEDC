/*
               File: B514_PC04_GET_DOM
        Description: ÉhÉÅÉCÉìèÓïÒéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:41.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b514_pc04_get_dom extends GXProcedure
{
   public b514_pc04_get_dom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b514_pc04_get_dom.class ), "" );
   }

   public b514_pc04_get_dom( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           GxObjectCollection[] aP1 )
   {
      b514_pc04_get_dom.this.AV11w_dom_cd = aP0;
      b514_pc04_get_dom.this.aP2 = new byte[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection[] aP1 ,
                             byte[] aP2 )
   {
      b514_pc04_get_dom.this.AV11w_dom_cd = aP0;
      b514_pc04_get_dom.this.aP1 = aP1;
      b514_pc04_get_dom.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8sdt_CSV_DOM_C.clear();
      /* Execute user subroutine: S1142 */
      S1142 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14GXLvl23 = (byte)(0) ;
      /* Using cursor P004Q2 */
      pr_default.execute(0, new Object[] {AV11w_dom_cd});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A178TBM03_DEL_FLG = P004Q2_A178TBM03_DEL_FLG[0] ;
         n178TBM03_DEL_FLG = P004Q2_n178TBM03_DEL_FLG[0] ;
         A162TBM03_DOM_CD = P004Q2_A162TBM03_DOM_CD[0] ;
         A163TBM03_DOM_VAR_NM = P004Q2_A163TBM03_DOM_VAR_NM[0] ;
         A169TBM03_ORDER = P004Q2_A169TBM03_ORDER[0] ;
         n169TBM03_ORDER = P004Q2_n169TBM03_ORDER[0] ;
         AV14GXLvl23 = (byte)(1) ;
         AV9sdt_CSV_DOM_I = (SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem)new SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem(remoteHandle, context);
         AV9sdt_CSV_DOM_I.setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_cd( AV11w_dom_cd );
         AV9sdt_CSV_DOM_I.setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Dom_var_nm( A163TBM03_DOM_VAR_NM );
         AV9sdt_CSV_DOM_I.setgxTv_SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem_Order( A169TBM03_ORDER );
         AV8sdt_CSV_DOM_C.add(AV9sdt_CSV_DOM_I, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV14GXLvl23 == 0 )
      {
         AV10W_RTN_CD = (byte)(1) ;
      }
      cleanup();
   }

   public void S1142( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1252( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV15Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV10W_RTN_CD = (byte)(9) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP1[0] = b514_pc04_get_dom.this.AV8sdt_CSV_DOM_C;
      this.aP2[0] = b514_pc04_get_dom.this.AV10W_RTN_CD;
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
                  /* Execute user subroutine: S1252 */
                  S1252 ();
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
      AV8sdt_CSV_DOM_C = new GxObjectCollection(SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem.class, "B514_SD01_CSV_DOM.B514_SD01_CSV_DOMItem", "SmartEDC_SHIZUOKA", remoteHandle);
      scmdbuf = "" ;
      P004Q2_A178TBM03_DEL_FLG = new String[] {""} ;
      P004Q2_n178TBM03_DEL_FLG = new boolean[] {false} ;
      P004Q2_A162TBM03_DOM_CD = new String[] {""} ;
      P004Q2_A163TBM03_DOM_VAR_NM = new String[] {""} ;
      P004Q2_A169TBM03_ORDER = new int[1] ;
      P004Q2_n169TBM03_ORDER = new boolean[] {false} ;
      A178TBM03_DEL_FLG = "" ;
      A162TBM03_DOM_CD = "" ;
      A163TBM03_DOM_VAR_NM = "" ;
      AV9sdt_CSV_DOM_I = new SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem(remoteHandle, context);
      AV15Pgmname = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b514_pc04_get_dom__default(),
         new Object[] {
             new Object[] {
            P004Q2_A178TBM03_DEL_FLG, P004Q2_n178TBM03_DEL_FLG, P004Q2_A162TBM03_DOM_CD, P004Q2_A163TBM03_DOM_VAR_NM, P004Q2_A169TBM03_ORDER, P004Q2_n169TBM03_ORDER
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV15Pgmname = "B514_PC04_GET_DOM" ;
      /* GeneXus formulas. */
      AV15Pgmname = "B514_PC04_GET_DOM" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10W_RTN_CD ;
   private byte AV14GXLvl23 ;
   private short Gx_err ;
   private int A169TBM03_ORDER ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV15Pgmname ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n178TBM03_DEL_FLG ;
   private boolean n169TBM03_ORDER ;
   private String AV11w_dom_cd ;
   private String A178TBM03_DEL_FLG ;
   private String A162TBM03_DOM_CD ;
   private String A163TBM03_DOM_VAR_NM ;
   private GxObjectCollection[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P004Q2_A178TBM03_DEL_FLG ;
   private boolean[] P004Q2_n178TBM03_DEL_FLG ;
   private String[] P004Q2_A162TBM03_DOM_CD ;
   private String[] P004Q2_A163TBM03_DOM_VAR_NM ;
   private int[] P004Q2_A169TBM03_ORDER ;
   private boolean[] P004Q2_n169TBM03_ORDER ;
   private GxObjectCollection AV8sdt_CSV_DOM_C ;
   private SdtB514_SD01_CSV_DOM_B514_SD01_CSV_DOMItem AV9sdt_CSV_DOM_I ;
}

final  class b514_pc04_get_dom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P004Q2", "SELECT `TBM03_DEL_FLG`, `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM`, `TBM03_ORDER` FROM `TBM03_CDISC_ITEM` WHERE (`TBM03_DOM_CD` = ?) AND (`TBM03_DEL_FLG` = '0') ORDER BY `TBM03_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
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
               ((int[]) buf[4])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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

