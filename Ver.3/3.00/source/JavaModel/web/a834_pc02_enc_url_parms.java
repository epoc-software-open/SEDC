/*
               File: A834_PC02_ENC_URL_PARMS
        Description: URLÉpÉâÉÅÅ[É^à√çÜâªèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:31.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a834_pc02_enc_url_parms extends GXProcedure
{
   public a834_pc02_enc_url_parms( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a834_pc02_enc_url_parms.class ), "" );
   }

   public a834_pc02_enc_url_parms( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             GxObjectCollection aP1 )
   {
      a834_pc02_enc_url_parms.this.AV8P_PG = aP0;
      a834_pc02_enc_url_parms.this.AV9P_URL_PARMS = aP1;
      a834_pc02_enc_url_parms.this.aP2 = aP2;
      a834_pc02_enc_url_parms.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection aP1 ,
                             String[] aP2 )
   {
      a834_pc02_enc_url_parms.this.AV8P_PG = aP0;
      a834_pc02_enc_url_parms.this.AV9P_URL_PARMS = aP1;
      a834_pc02_enc_url_parms.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13W_IS_FIRST = true ;
      AV12W_URL_PARMS_STR = "" ;
      AV16GXV1 = 1 ;
      while ( AV16GXV1 <= AV9P_URL_PARMS.size() )
      {
         AV11W_URL_PARM = (String)AV9P_URL_PARMS.elementAt(-1+AV16GXV1) ;
         if ( ! AV13W_IS_FIRST )
         {
            AV12W_URL_PARMS_STR = AV12W_URL_PARMS_STR + "," ;
         }
         AV13W_IS_FIRST = false ;
         AV12W_URL_PARMS_STR = AV12W_URL_PARMS_STR + PrivateUtilities.encodeURL( AV11W_URL_PARM) ;
         AV16GXV1 = (int)(AV16GXV1+1) ;
      }
      GXt_char1 = AV10W_ENC_URL_PARMS ;
      GXv_char2[0] = GXt_char1 ;
      new a834_pc01_enc_url_parms_str(remoteHandle, context).execute( AV8P_PG, AV12W_URL_PARMS_STR, GXv_char2) ;
      a834_pc02_enc_url_parms.this.GXt_char1 = GXv_char2[0] ;
      AV10W_ENC_URL_PARMS = GXt_char1 ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a834_pc02_enc_url_parms.this.AV10W_ENC_URL_PARMS;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_ENC_URL_PARMS = "" ;
      AV12W_URL_PARMS_STR = "" ;
      AV11W_URL_PARM = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV16GXV1 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean AV13W_IS_FIRST ;
   private String AV8P_PG ;
   private String AV10W_ENC_URL_PARMS ;
   private String AV12W_URL_PARMS_STR ;
   private String AV11W_URL_PARM ;
   private String[] aP2 ;
   private GxObjectCollection AV9P_URL_PARMS ;
}

