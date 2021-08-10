/*
               File: A806_PC02_WINDOW_OPEN
        Description: ウィンドウ形式カスタマイズスクリプト生成処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.78
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a806_pc02_window_open extends GXProcedure
{
   public a806_pc02_window_open( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a806_pc02_window_open.class ), "" );
   }

   public a806_pc02_window_open( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             byte aP1 ,
                             String aP2 )
   {
      a806_pc02_window_open.this.AV8P_FUNC_NAME = aP0;
      a806_pc02_window_open.this.AV9P_OPEN_MODE = aP1;
      a806_pc02_window_open.this.AV10P_OPEN_URL = aP2;
      a806_pc02_window_open.this.aP3 = aP3;
      a806_pc02_window_open.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        byte aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             byte aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      a806_pc02_window_open.this.AV8P_FUNC_NAME = aP0;
      a806_pc02_window_open.this.AV9P_OPEN_MODE = aP1;
      a806_pc02_window_open.this.AV10P_OPEN_URL = aP2;
      a806_pc02_window_open.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11W_SCRIPT = "" ;
      AV11W_SCRIPT = AV11W_SCRIPT + " function " + AV8P_FUNC_NAME + "(pgid,CODEURL,CODEKEY){" ;
      AV11W_SCRIPT = AV11W_SCRIPT + " CODEURL = encodeURIComponent(CODEURL);" ;
      AV11W_SCRIPT = AV11W_SCRIPT + " CODEKEY = encodeURIComponent(CODEKEY);" ;
      AV11W_SCRIPT = AV11W_SCRIPT + "  parm  = \"top=0, left=0, resizable=1, status=1\";" ;
      AV11W_SCRIPT = AV11W_SCRIPT + "  page  = \"" + GXutil.trim( AV10P_OPEN_URL) + "\" + pgid;" ;
      if ( AV9P_OPEN_MODE == 0 )
      {
         AV11W_SCRIPT = AV11W_SCRIPT + "  win = window.open(page + \"?\" + CODEURL + \",\" + CODEKEY , \"\" , parm);" ;
         AV11W_SCRIPT = AV11W_SCRIPT + "  (window.open('', '_self').opener = window).close();" ;
      }
      else if ( AV9P_OPEN_MODE == 1 )
      {
         AV11W_SCRIPT = AV11W_SCRIPT + " nwin = window.open(page + \"?\" + CODEURL + \",\" + CODEKEY , \"\" , parm);" ;
      }
      AV11W_SCRIPT = AV11W_SCRIPT + " }" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = a806_pc02_window_open.this.AV11W_SCRIPT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_SCRIPT = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9P_OPEN_MODE ;
   private short Gx_err ;
   private String AV8P_FUNC_NAME ;
   private String AV10P_OPEN_URL ;
   private String AV11W_SCRIPT ;
   private String[] aP3 ;
}

