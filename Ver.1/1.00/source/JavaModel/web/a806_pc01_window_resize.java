/*
               File: A806_PC01_WINDOW_RESIZE
        Description: ウィンドウサイズ指定スクリプト生成処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a806_pc01_window_resize extends GXProcedure
{
   public a806_pc01_window_resize( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a806_pc01_window_resize.class ), "" );
   }

   public a806_pc01_window_resize( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             short aP1 )
   {
      a806_pc01_window_resize.this.AV8P_H_SIZE = aP0;
      a806_pc01_window_resize.this.AV9P_V_SIZE = aP1;
      a806_pc01_window_resize.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( short aP0 ,
                        short aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             short aP1 ,
                             String[] aP2 )
   {
      a806_pc01_window_resize.this.AV8P_H_SIZE = aP0;
      a806_pc01_window_resize.this.AV9P_V_SIZE = aP1;
      a806_pc01_window_resize.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_SCRIPT = " function Z9120_PC01() {" + " window.resizeTo(" + GXutil.str( AV8P_H_SIZE, 10, 0) + "," + GXutil.str( AV9P_V_SIZE, 10, 0) + ");" + " }" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a806_pc01_window_resize.this.AV10W_SCRIPT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_SCRIPT = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8P_H_SIZE ;
   private short AV9P_V_SIZE ;
   private short Gx_err ;
   private String AV10W_SCRIPT ;
   private String[] aP2 ;
}

