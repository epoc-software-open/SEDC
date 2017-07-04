/*
               File: ab504_pc01_init_crf_impl
        Description: CRFåüçıèåèèâä˙ï\é¶
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:9.17
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab504_pc01_init_crf_impl extends GXWebProcedure
{
   public ab504_pc01_init_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV23C_APP_ID = "B504" ;
      AV16W_ERR_CD = (short)(0) ;
      AV17W_ERR_MSG = "" ;
      GXt_char1 = AV20W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab504_pc01_init_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV20W_NEWLINE = GXt_char1 ;
      AV24W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV23C_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_EXTRA_INFO", AV24W_EXTRA_INFO);
      /* Execute user subroutine: S12102 */
      S12102 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S13147 */
      S13147 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV29Pgmname, "INFO", AV30Pgmdesc) ;
      AV21W_RTN_CSV.clear();
      if ( AV16W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1174 */
         S1174 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV16W_ERR_CD == 0 )
      {
         AV22W_STUDY_ID = GXutil.lval( AV12P_STUDY_ID) ;
         if ( GXutil.strcmp(AV9P_DIV, "1") == 0 )
         {
            GXv_objcol_svchar3[0] = AV21W_RTN_CSV ;
            GXv_int4[0] = AV16W_ERR_CD ;
            GXv_char2[0] = AV17W_ERR_MSG ;
            new b599_pc12_study_site_res(remoteHandle, context).execute( AV22W_STUDY_ID, AV11P_SITE_ID, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
            AV21W_RTN_CSV = GXv_objcol_svchar3[0] ;
            ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
            ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV9P_DIV, "2") == 0 )
         {
            GXv_objcol_svchar3[0] = AV21W_RTN_CSV ;
            GXv_int4[0] = AV16W_ERR_CD ;
            GXv_char2[0] = AV17W_ERR_MSG ;
            new b599_pc14_subject_res(remoteHandle, context).execute( AV22W_STUDY_ID, AV13P_SUBJECT_ID, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
            AV21W_RTN_CSV = GXv_objcol_svchar3[0] ;
            ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
            ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char2[0] ;
         }
         else if ( GXutil.strcmp(AV9P_DIV, "3") == 0 )
         {
            GXv_objcol_svchar3[0] = AV21W_RTN_CSV ;
            GXv_int4[0] = AV16W_ERR_CD ;
            GXv_char2[0] = AV17W_ERR_MSG ;
            new b599_pc01_crf_res(remoteHandle, context).execute( AV22W_STUDY_ID, AV8P_CRF_ID, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
            AV21W_RTN_CSV = GXv_objcol_svchar3[0] ;
            ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
            ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char2[0] ;
         }
      }
      AV19W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV16W_ERR_CD, 10, 0))+AV20W_NEWLINE);
      AV19W_HTTP_RES.addString(AV17W_ERR_MSG);
      if ( AV16W_ERR_CD == 0 )
      {
         AV15W_CNT = 1 ;
         while ( AV15W_CNT <= AV21W_RTN_CSV.size() )
         {
            AV19W_HTTP_RES.addString(AV20W_NEWLINE+(String)AV21W_RTN_CSV.elementAt(-1+(int)(AV15W_CNT)));
            AV15W_CNT = (long)(AV15W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S14163 */
      S14163 ();
      if ( returnInSub )
      {
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S1174( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV16W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV9P_DIV)==0) )
         {
            AV16W_ERR_CD = (short)(1) ;
            GXt_char1 = AV17W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "èàóùãÊï™", "", "", "", "", GXv_char2) ;
            ab504_pc01_init_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV17W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV16W_ERR_CD == 0 )
      {
         if ( ! ((GXutil.strcmp(AV9P_DIV, "1")==0)||(GXutil.strcmp(AV9P_DIV, "2")==0)||(GXutil.strcmp(AV9P_DIV, "3")==0)) )
         {
            AV16W_ERR_CD = (short)(1) ;
            GXt_char1 = AV17W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "èàóùãÊï™", "", "", "", "", GXv_char2) ;
            ab504_pc01_init_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV17W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV16W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV12P_STUDY_ID)==0) )
         {
            AV16W_ERR_CD = (short)(1) ;
            GXt_char1 = AV17W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "ééå±ID", "", "", "", "", GXv_char2) ;
            ab504_pc01_init_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV17W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S12102( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV14P_USER_ID = AV18W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV18W_HTTP_REQ.getVariable("PW") ;
      AV12P_STUDY_ID = AV18W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV8P_CRF_ID = AV18W_HTTP_REQ.getVariable("CRF_ID") ;
      AV11P_SITE_ID = AV18W_HTTP_REQ.getVariable("SITE_ID") ;
      AV13P_SUBJECT_ID = AV18W_HTTP_REQ.getVariable("SUBJECT_ID") ;
      AV9P_DIV = AV18W_HTTP_REQ.getVariable("PROC_DIV") ;
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_STUDY_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV8P_CRF_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SITE_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_SITE_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_SUBJECT_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV26W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "PROC_DIV" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV26W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DIV );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV26W_PARMS_ITEM", AV26W_PARMS_ITEM);
      AV24W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV26W_PARMS_ITEM, 0);
      AV25W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV24W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char2[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV29Pgmname, (short)(1), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV24W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char2[0] ;
   }

   public void S13147( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV19W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV14P_USER_ID ;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char6[0] = AV17W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV10P_PWD, GXv_int4, GXv_char6) ;
      ab504_pc01_init_crf_impl.this.AV14P_USER_ID = GXv_char2[0] ;
      ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char6[0] ;
   }

   public void S14163( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV16W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab504_pc01_init_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab504_pc01_init_crf");
      }
      AV25W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV16W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV17W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV24W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char6[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV29Pgmname, (short)(1), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV24W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char6[0] = AV17W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char6[0] ;
   }

   public void S15182( )
   {
      /* 'SUB_ERROR' Routine */
      AV25W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV24W_EXTRA_INFO;
      GXv_int4[0] = AV16W_ERR_CD ;
      GXv_char6[0] = AV17W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV29Pgmname, (short)(0), AV25W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV24W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab504_pc01_init_crf_impl.this.AV16W_ERR_CD = GXv_int4[0] ;
      ab504_pc01_init_crf_impl.this.AV17W_ERR_MSG = GXv_char6[0] ;
      context.globals.Gx_eop = (byte)(0) ;
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
                  /* Execute user subroutine: S15182 */
                  S15182 ();
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
      AV23C_APP_ID = "" ;
      AV17W_ERR_MSG = "" ;
      AV20W_NEWLINE = "" ;
      AV24W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV29Pgmname = "" ;
      AV30Pgmdesc = "" ;
      AV21W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV12P_STUDY_ID = "" ;
      AV9P_DIV = "" ;
      AV11P_SITE_ID = "" ;
      AV13P_SUBJECT_ID = "" ;
      AV8P_CRF_ID = "" ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV19W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV14P_USER_ID = "" ;
      AV18W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV26W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV25W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab504_pc01_init_crf__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV30Pgmdesc = "CRFåüçıèåèèâä˙ï\é¶" ;
      AV29Pgmname = "AB504_PC01_INIT_CRF" ;
      /* GeneXus formulas. */
      AV30Pgmdesc = "CRFåüçıèåèèâä˙ï\é¶" ;
      AV29Pgmname = "AB504_PC01_INIT_CRF" ;
      Gx_err = (short)(0) ;
   }

   private short AV16W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV22W_STUDY_ID ;
   private long AV15W_CNT ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV29Pgmname ;
   private String AV30Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV23C_APP_ID ;
   private String AV17W_ERR_MSG ;
   private String AV20W_NEWLINE ;
   private String AV12P_STUDY_ID ;
   private String AV9P_DIV ;
   private String AV11P_SITE_ID ;
   private String AV13P_SUBJECT_ID ;
   private String AV8P_CRF_ID ;
   private String AV14P_USER_ID ;
   private String AV10P_PWD ;
   private String AV25W_MSG ;
   private com.genexus.internet.HttpRequest AV18W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV19W_HTTP_RES ;
   private GxObjectCollection AV21W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV24W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV26W_PARMS_ITEM ;
}

final  class ab504_pc01_init_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

