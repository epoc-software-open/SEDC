/*
               File: A835_PC01_FILENM_PROHIBITION
        Description: ファイル名禁止文字置換処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:35.64
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a835_pc01_filenm_prohibition extends GXProcedure
{
   public a835_pc01_filenm_prohibition( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a835_pc01_filenm_prohibition.class ), "" );
   }

   public a835_pc01_filenm_prohibition( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      a835_pc01_filenm_prohibition.this.AV8P_Char = aP0;
      a835_pc01_filenm_prohibition.this.aP1 = aP1;
      a835_pc01_filenm_prohibition.this.aP1 = new String[] {""};
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
      a835_pc01_filenm_prohibition.this.AV8P_Char = aP0;
      a835_pc01_filenm_prohibition.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9W_RetChar = AV8P_Char ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "\\", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "/", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, ":", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "*", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "?", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "\"", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, ">", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "<", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, "|", "_") ;
      AV9W_RetChar = GXutil.strReplace( AV9W_RetChar, " ", "_") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a835_pc01_filenm_prohibition.this.AV9W_RetChar;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_RetChar = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8P_Char ;
   private String AV9W_RetChar ;
   private String[] aP1 ;
}

