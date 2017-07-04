/*
               File: ab704_pc01_set_crf_val_impl
        Description: CRFì¸óÕÉfÅ[É^ï€ë∂èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:20.36
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab704_pc01_set_crf_val_impl extends GXWebProcedure
{
   public ab704_pc01_set_crf_val_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", com.genexus.util.Encryption.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = com.genexus.util.Encryption.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV12P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV13P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV30P_CRF_ID_EDA_NO = httpContext.GetNextPar( ) ;
            AV28P_CRF_LATEST_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV10P_CRF_ITEM_CD = httpContext.GetNextPar( ) ;
            AV11P_INP_VALUE = httpContext.GetNextPar( ) ;
         }
      }
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      GXv_int1[0] = AV9P_CRF_ID ;
      GXv_int2[0] = AV29P_CRF_EDA_NO ;
      new b799_pc12_crf_id_eda_split(remoteHandle, context).execute( AV30P_CRF_ID_EDA_NO, GXv_int1, GXv_int2) ;
      ab704_pc01_set_crf_val_impl.this.AV9P_CRF_ID = GXv_int1[0] ;
      ab704_pc01_set_crf_val_impl.this.AV29P_CRF_EDA_NO = GXv_int2[0] ;
      AV23W_SESSION_KEY = "html5rk" + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV13P_SUBJECT_ID, 6, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV9P_CRF_ID, 4, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV29P_CRF_EDA_NO, 2, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + AV10P_CRF_ITEM_CD ;
      if ( (GXutil.strcmp("", AV11P_INP_VALUE)==0) )
      {
         AV22W_SESSION.setValue(AV23W_SESSION_KEY, "GXXEV1_NULL");
      }
      else
      {
         AV22W_SESSION.setValue(AV23W_SESSION_KEY, AV11P_INP_VALUE);
      }
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "0" );
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString(false));
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV17W_A_LOGIN_SDT;
      GXv_char4[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char4) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      ab704_pc01_set_crf_val_impl.this.AV21W_ERRCD = GXv_char4[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
         AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
         AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString(false));
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV33Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString(false));
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV30P_CRF_ID_EDA_NO = "" ;
      AV10P_CRF_ITEM_CD = "" ;
      AV11P_INP_VALUE = "" ;
      GXv_int1 = new short [1] ;
      GXv_int2 = new byte [1] ;
      AV23W_SESSION_KEY = "" ;
      AV22W_SESSION = httpContext.getWebSession();
      AV14SD_B704_SD01_CRF_VAL_RTN = new SdtB704_SD01_CRF_VAL_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char4 = new String [1] ;
      AV33Pgmname = "" ;
      Gx_emsg = "" ;
      AV33Pgmname = "AB704_PC01_SET_CRF_VAL" ;
      /* GeneXus formulas. */
      AV33Pgmname = "AB704_PC01_SET_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private byte AV29P_CRF_EDA_NO ;
   private byte GXv_int2[] ;
   private short gxcookieaux ;
   private short AV28P_CRF_LATEST_VERSION ;
   private short AV9P_CRF_ID ;
   private short GXv_int1[] ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String GXv_char4[] ;
   private String AV33Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV30P_CRF_ID_EDA_NO ;
   private String AV10P_CRF_ITEM_CD ;
   private String AV11P_INP_VALUE ;
   private String AV23W_SESSION_KEY ;
   private String AV21W_ERRCD ;
   private SdtB704_SD01_CRF_VAL_RTN AV14SD_B704_SD01_CRF_VAL_RTN ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private com.genexus.webpanels.WebSession AV22W_SESSION ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
}

