/*
               File: B601_PC01_CRFIF_VIEW_AUTH
        Description: NetCommonsログイン連携インターフェース
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:59.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b601_pc01_crfif_view_auth extends GXProcedure
{
   public b601_pc01_crfif_view_auth( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b601_pc01_crfif_view_auth.class ), "" );
   }

   public b601_pc01_crfif_view_auth( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             SdtB601_SD01_AUTH[] aP2 ,
                             short[] aP3 )
   {
      b601_pc01_crfif_view_auth.this.AV10P_USER_ID = aP0;
      b601_pc01_crfif_view_auth.this.AV9P_PWD = aP1;
      b601_pc01_crfif_view_auth.this.aP2 = aP2;
      b601_pc01_crfif_view_auth.this.aP3 = aP3;
      b601_pc01_crfif_view_auth.this.aP4 = aP4;
      b601_pc01_crfif_view_auth.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        SdtB601_SD01_AUTH[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             SdtB601_SD01_AUTH[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b601_pc01_crfif_view_auth.this.AV10P_USER_ID = aP0;
      b601_pc01_crfif_view_auth.this.AV9P_PWD = aP1;
      b601_pc01_crfif_view_auth.this.aP2 = aP2;
      b601_pc01_crfif_view_auth.this.aP3 = aP3;
      b601_pc01_crfif_view_auth.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B601" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_RTN_CD = (short)(0) ;
      AV20W_RTN_MSG = "" ;
      AV12W_AUTH = (SdtB601_SD01_AUTH)new SdtB601_SD01_AUTH(remoteHandle, context);
      AV13W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV13W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV13W_EXTRA_INFO;
         GXv_int2[0] = AV19W_RTN_CD ;
         GXv_char3[0] = AV20W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b601_pc01_crfif_view_auth.this.AV19W_RTN_CD = GXv_int2[0] ;
         b601_pc01_crfif_view_auth.this.AV20W_RTN_MSG = GXv_char3[0] ;
         AV19W_RTN_CD = (short)(1) ;
         GXt_char4 = AV20W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b601_pc01_crfif_view_auth.this.GXt_char4 = GXv_char3[0] ;
         AV20W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_URL = "/?action=" + "crfif_view_auth" + "&loginid=" + AV10P_USER_ID + "&password=" + AV9P_PWD ;
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b601_pc01_crfif_view_auth.this.GXt_char4 = GXv_char3[0] ;
      AV14W_HTTP_CLIENT.setHost( GXt_char4 );
      AV14W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV14W_HTTP_CLIENT.setPort( 443 );
      AV14W_HTTP_CLIENT.execute("GET", AV22W_URL);
      if ( ( AV14W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV14W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV17W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV14W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV14W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV14W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV14W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV13W_EXTRA_INFO;
         GXv_int2[0] = AV19W_RTN_CD ;
         GXv_char3[0] = AV20W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b601_pc01_crfif_view_auth.this.AV19W_RTN_CD = GXv_int2[0] ;
         b601_pc01_crfif_view_auth.this.AV20W_RTN_MSG = GXv_char3[0] ;
         AV19W_RTN_CD = (short)(1) ;
         GXt_char4 = AV20W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b601_pc01_crfif_view_auth.this.GXt_char4 = GXv_char3[0] ;
         AV20W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV23W_XML_READER.openResponse(AV14W_HTTP_CLIENT);
      AV23W_XML_READER.readType(AV23W_XML_READER.getElementType(), "auth");
      while ( ! AV23W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV23W_XML_READER.getName(), "auth_result") == 0 )
         {
            AV12W_AUTH.setgxTv_SdtB601_SD01_AUTH_Auth_result( (byte)(GXutil.lval( AV23W_XML_READER.getValue())) );
            if ( AV12W_AUTH.getgxTv_SdtB601_SD01_AUTH_Auth_result() != 1 )
            {
               AV19W_RTN_CD = (short)(1) ;
               GXt_char4 = AV20W_RTN_MSG ;
               GXv_char3[0] = GXt_char4 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00029", "", "", "", "", "", GXv_char3) ;
               b601_pc01_crfif_view_auth.this.GXt_char4 = GXv_char3[0] ;
               AV20W_RTN_MSG = GXt_char4 ;
               if (true) break;
            }
         }
         else if ( GXutil.strcmp(AV23W_XML_READER.getName(), "handle") == 0 )
         {
            AV12W_AUTH.setgxTv_SdtB601_SD01_AUTH_Handle( AV23W_XML_READER.getValue() );
         }
         else if ( GXutil.strcmp(AV23W_XML_READER.getName(), "role_authority_id") == 0 )
         {
            AV12W_AUTH.setgxTv_SdtB601_SD01_AUTH_Role_authority_id( GXutil.lval( AV23W_XML_READER.getValue()) );
         }
         else if ( GXutil.strcmp(AV23W_XML_READER.getName(), "belong") == 0 )
         {
            AV12W_AUTH.setgxTv_SdtB601_SD01_AUTH_Belong( AV23W_XML_READER.getValue() );
         }
         else if ( GXutil.strcmp(AV23W_XML_READER.getName(), "email") == 0 )
         {
            AV12W_AUTH.setgxTv_SdtB601_SD01_AUTH_Email( AV23W_XML_READER.getValue() );
         }
         AV23W_XML_READER.read();
      }
      AV23W_XML_READER.close();
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV13W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      AV13W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV13W_EXTRA_INFO;
      GXv_int2[0] = AV19W_RTN_CD ;
      GXv_char3[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b601_pc01_crfif_view_auth.this.AV19W_RTN_CD = GXv_int2[0] ;
      b601_pc01_crfif_view_auth.this.AV20W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV13W_EXTRA_INFO;
      GXv_int2[0] = AV19W_RTN_CD ;
      GXv_char3[0] = AV20W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV27Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV13W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b601_pc01_crfif_view_auth.this.AV19W_RTN_CD = GXv_int2[0] ;
      b601_pc01_crfif_view_auth.this.AV20W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b601_pc01_crfif_view_auth.this.AV12W_AUTH;
      this.aP3[0] = b601_pc01_crfif_view_auth.this.AV19W_RTN_CD;
      this.aP4[0] = b601_pc01_crfif_view_auth.this.AV20W_RTN_MSG;
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
                  /* Execute user subroutine: S121 */
                  S121 ();
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
      AV12W_AUTH = new SdtB601_SD01_AUTH(remoteHandle, context);
      AV20W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV13W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV27Pgmname = "" ;
      AV22W_URL = "" ;
      AV14W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV17W_MSG = "" ;
      AV23W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV24W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV27Pgmname = "B601_PC01_CRFIF_VIEW_AUTH" ;
      /* GeneXus formulas. */
      AV27Pgmname = "B601_PC01_CRFIF_VIEW_AUTH" ;
      Gx_err = (short)(0) ;
   }

   private short AV19W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV27Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV20W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String AV22W_URL ;
   private String AV17W_MSG ;
   private com.genexus.internet.HttpClient AV14W_HTTP_CLIENT ;
   private SdtB601_SD01_AUTH[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private com.genexus.xml.XMLReader AV23W_XML_READER ;
   private SdtB601_SD01_AUTH AV12W_AUTH ;
   private SdtB808_SD01_EXTRA_INFO AV13W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV24W_PARMS_ITEM ;
}

