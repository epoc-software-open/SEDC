/*
               File: B802_PC01_NEW_LINE
        Description: â¸çséÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:0.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b802_pc01_new_line extends GXProcedure
{
   public b802_pc01_new_line( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b802_pc01_new_line.class ), "" );
   }

   public b802_pc01_new_line( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( byte aP0 )
   {
      b802_pc01_new_line.this.AV10P_NL = aP0;
      b802_pc01_new_line.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( byte aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( byte aP0 ,
                             String[] aP1 )
   {
      b802_pc01_new_line.this.AV10P_NL = aP0;
      b802_pc01_new_line.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B802" ;
      AV9W_NEW_LINE = "" ;
      if ( AV10P_NL == 0 )
      {
         AV9W_NEW_LINE = GXutil.newLine( ) ;
      }
      else if ( AV10P_NL == 1 )
      {
         AV9W_NEW_LINE = GXutil.chr( (short)(13)) ;
      }
      else if ( AV10P_NL == 2 )
      {
         AV9W_NEW_LINE = GXutil.chr( (short)(10)) ;
      }
      else if ( AV10P_NL == 3 )
      {
         AV9W_NEW_LINE = GXutil.chr( (short)(13)) + GXutil.chr( (short)(10)) ;
      }
      else
      {
         AV9W_NEW_LINE = GXutil.newLine( ) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b802_pc01_new_line.this.AV9W_NEW_LINE;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_NEW_LINE = "" ;
      AV8C_TAM02_APP_ID = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10P_NL ;
   private short Gx_err ;
   private String AV9W_NEW_LINE ;
   private String AV8C_TAM02_APP_ID ;
   private String[] aP1 ;
}

