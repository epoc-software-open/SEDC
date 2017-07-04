/*
               File: B802_PC02_NL_AIRRES
        Description: AIRインタフェース レスポンス時改行取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:48.73
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b802_pc02_nl_airres extends GXProcedure
{
   public b802_pc02_nl_airres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b802_pc02_nl_airres.class ), "" );
   }

   public b802_pc02_nl_airres( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      b802_pc02_nl_airres.this.aP0 = aP0;
      b802_pc02_nl_airres.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      b802_pc02_nl_airres.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B510" ;
      AV9W_NEW_LINE = "" ;
      GXt_char1 = AV9W_NEW_LINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char2) ;
      b802_pc02_nl_airres.this.GXt_char1 = GXv_char2[0] ;
      AV9W_NEW_LINE = GXt_char1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = b802_pc02_nl_airres.this.AV9W_NEW_LINE;
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
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9W_NEW_LINE ;
   private String AV8C_TAM02_APP_ID ;
   private String[] aP0 ;
}

