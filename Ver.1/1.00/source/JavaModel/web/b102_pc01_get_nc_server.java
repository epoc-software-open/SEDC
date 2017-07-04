/*
               File: B102_PC01_GET_NC_SERVER
        Description: NetCommonsâ“ìÆÉTÅ[ÉoéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:26.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b102_pc01_get_nc_server extends GXProcedure
{
   public b102_pc01_get_nc_server( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b102_pc01_get_nc_server.class ), "" );
   }

   public b102_pc01_get_nc_server( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      b102_pc01_get_nc_server.this.aP0 = new String[] {""};
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
      b102_pc01_get_nc_server.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B102" ;
      /* Execute user subroutine: S1133 */
      S1133 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_NC_PATH = "" ;
      GXt_char1 = AV11W_NC_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "017", GXv_char2) ;
      b102_pc01_get_nc_server.this.GXt_char1 = GXv_char2[0] ;
      AV11W_NC_PATH = GXt_char1 ;
      cleanup();
   }

   public void S1133( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S1243( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV14Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP0[0] = b102_pc01_get_nc_server.this.AV11W_NC_PATH;
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
                  /* Execute user subroutine: S1243 */
                  S1243 ();
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
      AV11W_NC_PATH = "" ;
      AV8C_TAM02_APP_ID = "" ;
      GXv_char2 = new String [1] ;
      AV14Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char1 = "" ;
      Gx_emsg = "" ;
      AV14Pgmname = "B102_PC01_GET_NC_SERVER" ;
      /* GeneXus formulas. */
      AV14Pgmname = "B102_PC01_GET_NC_SERVER" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String GXv_char2[] ;
   private String AV14Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char1 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV11W_NC_PATH ;
   private String AV8C_TAM02_APP_ID ;
   private String[] aP0 ;
}

