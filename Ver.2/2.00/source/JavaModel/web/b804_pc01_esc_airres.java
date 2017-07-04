/*
               File: B804_PC01_ESC_AIRRES
        Description: AIR用レスポンスエスケープ処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:3.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b804_pc01_esc_airres extends GXProcedure
{
   public b804_pc01_esc_airres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b804_pc01_esc_airres.class ), "" );
   }

   public b804_pc01_esc_airres( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      b804_pc01_esc_airres.this.AV9P_STR = aP0;
      b804_pc01_esc_airres.this.aP1 = aP1;
      b804_pc01_esc_airres.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      b804_pc01_esc_airres.this.AV9P_STR = aP0;
      b804_pc01_esc_airres.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B804" ;
      AV10W_ESC_STR = "" ;
      GXt_char1 = AV10W_ESC_STR ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(3), GXv_char2) ;
      b804_pc01_esc_airres.this.GXt_char1 = GXv_char2[0] ;
      AV10W_ESC_STR = GXutil.strReplace( AV9P_STR, GXt_char1, "!n!") ;
      GXt_char1 = AV10W_ESC_STR ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(2), GXv_char2) ;
      b804_pc01_esc_airres.this.GXt_char1 = GXv_char2[0] ;
      AV10W_ESC_STR = GXutil.strReplace( AV10W_ESC_STR, GXt_char1, "!n!") ;
      GXt_char1 = AV10W_ESC_STR ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char2) ;
      b804_pc01_esc_airres.this.GXt_char1 = GXv_char2[0] ;
      AV10W_ESC_STR = GXutil.strReplace( AV10W_ESC_STR, GXt_char1, "!n!") ;
      AV10W_ESC_STR = GXutil.strReplace( AV10W_ESC_STR, ",", "!c!") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b804_pc01_esc_airres.this.AV10W_ESC_STR;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_ESC_STR = "" ;
      AV8C_TAM02_APP_ID = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9P_STR ;
   private String AV10W_ESC_STR ;
   private String AV8C_TAM02_APP_ID ;
   private String[] aP1 ;
}

