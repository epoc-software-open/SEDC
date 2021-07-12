/*
               File: A834_PC01_ENC_URL_PARMS_STR
        Description: URLパラメータ暗号化処理（文字列）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:31.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a834_pc01_enc_url_parms_str extends GXProcedure
{
   public a834_pc01_enc_url_parms_str( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a834_pc01_enc_url_parms_str.class ), "" );
   }

   public a834_pc01_enc_url_parms_str( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      a834_pc01_enc_url_parms_str.this.AV8P_PG = aP0;
      a834_pc01_enc_url_parms_str.this.AV9P_URL_PARMS = aP1;
      a834_pc01_enc_url_parms_str.this.aP2 = aP2;
      a834_pc01_enc_url_parms_str.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a834_pc01_enc_url_parms_str.this.AV8P_PG = aP0;
      a834_pc01_enc_url_parms_str.this.AV9P_URL_PARMS = aP1;
      a834_pc01_enc_url_parms_str.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15W_USE_ENCRYPTION = "" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_TEMP_KEY = "" ;
      if ( GXutil.strcmp(AV15W_USE_ENCRYPTION, "SESSION") == 0 )
      {
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else if ( GXutil.strcmp(AV15W_USE_ENCRYPTION, "SITE") == 0 )
      {
         /* Execute user subroutine: S131 */
         S131 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      else
      {
         AV12W_ENC_URL_PARMS = AV9P_URL_PARMS ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV10W_BEFORE_ENC_PARMS = AV8P_PG + AV9P_URL_PARMS ;
      AV11W_CHECK_SUM = "" ;
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV12W_ENC_URL_PARMS = com.genexus.util.Encryption.encrypt64( AV10W_BEFORE_ENC_PARMS+AV11W_CHECK_SUM, AV14W_TEMP_KEY) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_GET_USE_ENCRYPTION' Routine */
      /* User Code */
      	AV15W_USE_ENCRYPTION = context.getClientPreferences().getUSE_ENCRYPTION();
   }

   public void S121( )
   {
      /* 'SUB_GET_SESSION_ENCRYPT_KEY' Routine */
      /* User Code */
      	if ((GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID")) == 0)) {
      /* User Code */
      		AV13W_GXCOOKIEAUX = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      /* User Code */
      	}
      /* User Code */
      	AV14W_TEMP_KEY = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void S131( )
   {
      /* 'SUB_GET_SITE_ENCRYPT_KEY' Routine */
      /* User Code */
      	AV14W_TEMP_KEY = context.getSiteKey();
   }

   public void S141( )
   {
      /* 'SUB_CHECK_SUM' Routine */
      /* User Code */
      	AV11W_CHECK_SUM = com.genexus.util.Encryption.checksum(AV10W_BEFORE_ENC_PARMS, 6);
   }

   protected void cleanup( )
   {
      this.aP2[0] = a834_pc01_enc_url_parms_str.this.AV12W_ENC_URL_PARMS;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_ENC_URL_PARMS = "" ;
      AV15W_USE_ENCRYPTION = "" ;
      AV14W_TEMP_KEY = "" ;
      AV10W_BEFORE_ENC_PARMS = "" ;
      AV11W_CHECK_SUM = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV13W_GXCOOKIEAUX ;
   private short Gx_err ;
   private boolean returnInSub ;
   private String AV8P_PG ;
   private String AV9P_URL_PARMS ;
   private String AV12W_ENC_URL_PARMS ;
   private String AV15W_USE_ENCRYPTION ;
   private String AV14W_TEMP_KEY ;
   private String AV10W_BEFORE_ENC_PARMS ;
   private String AV11W_CHECK_SUM ;
   private String[] aP2 ;
}

