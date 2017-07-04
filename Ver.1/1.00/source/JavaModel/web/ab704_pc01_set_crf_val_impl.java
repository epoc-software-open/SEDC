/*
               File: ab704_pc01_set_crf_val_impl
        Description: CRFì¸óÕÉfÅ[É^ï€ë∂èàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:7.36
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
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      if ( ! entryPointCalled )
      {
         AV12P_STUDY_ID = GXutil.lval( gxfirstwebparm) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV13P_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
            AV9P_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
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
      /* Execute user subroutine: S1145 */
      S1145 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV23W_SESSION_KEY = "html5rk" + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV13P_SUBJECT_ID, 6, 0)) + "_" ;
      AV23W_SESSION_KEY = AV23W_SESSION_KEY + GXutil.trim( GXutil.str( AV9P_CRF_ID, 4, 0)) + "_" ;
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
      AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString());
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1145( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT1[0] = AV17W_A_LOGIN_SDT;
      GXv_char2[0] = AV21W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT1, GXv_char2) ;
      AV17W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT1[0] ;
      ab704_pc01_set_crf_val_impl.this.AV21W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV21W_ERRCD, "0") != 0 )
      {
         AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
         AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
         AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString());
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S1266( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV31Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Result_cd( "9" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
      AV14SD_B704_SD01_CRF_VAL_RTN.setgxTv_SdtB704_SD01_CRF_VAL_RTN_Err_msg( "" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SD_B704_SD01_CRF_VAL_RTN", AV14SD_B704_SD01_CRF_VAL_RTN);
      AV8HttpResponse.addString(AV14SD_B704_SD01_CRF_VAL_RTN.toJSonString());
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
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
                  /* Execute user subroutine: S1266 */
                  S1266 ();
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
      gxfirstwebparm = "" ;
      AV10P_CRF_ITEM_CD = "" ;
      AV11P_INP_VALUE = "" ;
      AV23W_SESSION_KEY = "" ;
      AV22W_SESSION = httpContext.getWebSession();
      AV14SD_B704_SD01_CRF_VAL_RTN = new SdtB704_SD01_CRF_VAL_RTN(remoteHandle, context);
      AV8HttpResponse = httpContext.getHttpResponse();
      AV17W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT1 = new SdtA_LOGIN_SDT [1] ;
      AV21W_ERRCD = "" ;
      GXv_char2 = new String [1] ;
      AV31Pgmname = "" ;
      GXt_char3 = "" ;
      Gx_emsg = "" ;
      AV31Pgmname = "AB704_PC01_SET_CRF_VAL" ;
      /* GeneXus formulas. */
      AV31Pgmname = "AB704_PC01_SET_CRF_VAL" ;
      Gx_err = (short)(0) ;
   }

   private short AV9P_CRF_ID ;
   private short AV28P_CRF_LATEST_VERSION ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private String gxfirstwebparm ;
   private String GXv_char2[] ;
   private String AV31Pgmname ;
   private String GXt_char3 ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV10P_CRF_ITEM_CD ;
   private String AV11P_INP_VALUE ;
   private String AV23W_SESSION_KEY ;
   private String AV21W_ERRCD ;
   private SdtB704_SD01_CRF_VAL_RTN AV14SD_B704_SD01_CRF_VAL_RTN ;
   private com.genexus.internet.HttpResponse AV8HttpResponse ;
   private com.genexus.webpanels.WebSession AV22W_SESSION ;
   private SdtA_LOGIN_SDT AV17W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT1[] ;
}

