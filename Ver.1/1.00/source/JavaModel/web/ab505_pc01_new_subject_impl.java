/*
               File: ab505_pc01_new_subject_impl
        Description: ä≥é“êVãK
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:23.60
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab505_pc01_new_subject_impl extends GXWebProcedure
{
   public ab505_pc01_new_subject_impl( com.genexus.internet.HttpContext context )
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
      AV8C_TAM02_APP_ID = "B505" ;
      AV18W_ERR_CD = (short)(0) ;
      AV19W_ERR_MSG = "" ;
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV20W_EXTRA_INFO", AV20W_EXTRA_INFO);
      AV25W_UPDATE_TIME = GXutil.now( ) ;
      /* Execute user subroutine: S1197 */
      S1197 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S12142 */
      S12142 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV28Pgmname, "INFO", "ä≥é“êVãK") ;
      if ( AV18W_ERR_CD == 0 )
      {
         GXv_int1[0] = AV18W_ERR_CD ;
         GXv_char2[0] = AV19W_ERR_MSG ;
         new b505_pc03_err_chk(remoteHandle, context).execute( GXv_int1, GXv_char2, AV14P_SUBJECT_NO, AV13P_SUBJECT_ID, AV12P_STUDY_ID) ;
         ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
         ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char2[0] ;
      }
      if ( AV18W_ERR_CD == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBT01_SUBJECT

         */
         A282TBT01_STUDY_ID = AV12P_STUDY_ID ;
         A283TBT01_SUBJECT_ID = AV14P_SUBJECT_NO ;
         A555TBT01_OUTER_SUBJECT_ID = AV13P_SUBJECT_ID ;
         n555TBT01_OUTER_SUBJECT_ID = false ;
         A613TBT01_SITE_ID = AV11P_SITE_ID ;
         n613TBT01_SITE_ID = false ;
         A284TBT01_DEL_FLG = "0" ;
         n284TBT01_DEL_FLG = false ;
         A285TBT01_CRT_DATETIME = AV25W_UPDATE_TIME ;
         n285TBT01_CRT_DATETIME = false ;
         A286TBT01_CRT_USER_ID = AV15P_USER_ID ;
         n286TBT01_CRT_USER_ID = false ;
         A287TBT01_CRT_PROG_NM = AV28Pgmname ;
         n287TBT01_CRT_PROG_NM = false ;
         A288TBT01_UPD_DATETIME = AV25W_UPDATE_TIME ;
         n288TBT01_UPD_DATETIME = false ;
         A289TBT01_UPD_USER_ID = AV15P_USER_ID ;
         n289TBT01_UPD_USER_ID = false ;
         A290TBT01_UPD_PROG_NM = AV28Pgmname ;
         n290TBT01_UPD_PROG_NM = false ;
         Gx_ope = "Insert" ;
         Gx_etb = "TBT01_SUBJECT" ;
         /* Using cursor P003B2 */
         pr_default.execute(0, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID), new Boolean(n555TBT01_OUTER_SUBJECT_ID), A555TBT01_OUTER_SUBJECT_ID, new Boolean(n613TBT01_SITE_ID), A613TBT01_SITE_ID, new Boolean(n284TBT01_DEL_FLG), A284TBT01_DEL_FLG, new Boolean(n285TBT01_CRT_DATETIME), A285TBT01_CRT_DATETIME, new Boolean(n286TBT01_CRT_USER_ID), A286TBT01_CRT_USER_ID, new Boolean(n287TBT01_CRT_PROG_NM), A287TBT01_CRT_PROG_NM, new Boolean(n288TBT01_UPD_DATETIME), A288TBT01_UPD_DATETIME, new Boolean(n289TBT01_UPD_USER_ID), A289TBT01_UPD_USER_ID, new Boolean(n290TBT01_UPD_PROG_NM), A290TBT01_UPD_PROG_NM});
         if ( (pr_default.getStatus(0) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      if ( AV18W_ERR_CD == 0 )
      {
         AV16W_CHR = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV9P_CRF,",")) ;
         AV17W_CNT = 1 ;
         while ( AV17W_CNT <= AV16W_CHR.size() )
         {
            /*
               INSERT RECORD ON TABLE TBT02_CRF

            */
            A292TBT02_STUDY_ID = AV12P_STUDY_ID ;
            A293TBT02_SUBJECT_ID = AV14P_SUBJECT_NO ;
            A294TBT02_CRF_ID = (short)(GXutil.lval( (String)AV16W_CHR.elementAt(-1+(int)(AV17W_CNT)))) ;
            A370TBT02_CRF_LATEST_VERSION = (short)(0) ;
            n370TBT02_CRF_LATEST_VERSION = false ;
            A371TBT02_CRF_INPUT_LEVEL = (byte)(1) ;
            n371TBT02_CRF_INPUT_LEVEL = false ;
            A556TBT02_LOCK_FLG = "0" ;
            n556TBT02_LOCK_FLG = false ;
            A563TBT02_DM_ARRIVAL_FLG = "0" ;
            n563TBT02_DM_ARRIVAL_FLG = false ;
            A565TBT02_APPROVAL_FLG = "0" ;
            n565TBT02_APPROVAL_FLG = false ;
            A569TBT02_INPUT_END_FLG = "0" ;
            n569TBT02_INPUT_END_FLG = false ;
            A295TBT02_DEL_FLG = "0" ;
            n295TBT02_DEL_FLG = false ;
            A297TBT02_CRT_USER_ID = AV15P_USER_ID ;
            n297TBT02_CRT_USER_ID = false ;
            A298TBT02_CRT_PROG_NM = AV28Pgmname ;
            n298TBT02_CRT_PROG_NM = false ;
            A300TBT02_UPD_USER_ID = AV15P_USER_ID ;
            n300TBT02_UPD_USER_ID = false ;
            A301TBT02_UPD_PROG_NM = AV28Pgmname ;
            n301TBT02_UPD_PROG_NM = false ;
            Gx_ope = "Insert" ;
            Gx_etb = "TBT02_CRF" ;
            /* Using cursor P003B3 */
            pr_default.execute(1, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID), new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n565TBT02_APPROVAL_FLG), A565TBT02_APPROVAL_FLG, new Boolean(n569TBT02_INPUT_END_FLG), A569TBT02_INPUT_END_FLG, new Boolean(n295TBT02_DEL_FLG), A295TBT02_DEL_FLG, new Boolean(n297TBT02_CRT_USER_ID), A297TBT02_CRT_USER_ID, new Boolean(n298TBT02_CRT_PROG_NM), A298TBT02_CRT_PROG_NM, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM});
            if ( (pr_default.getStatus(1) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            AV17W_CNT = (long)(AV17W_CNT+1) ;
         }
      }
      AV22W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV18W_ERR_CD, 10, 0))+new b802_pc02_nl_airres(remoteHandle, context).executeUdp( ));
      AV22W_HTTP_RES.addString(AV19W_ERR_MSG);
      /* Execute user subroutine: S13158 */
      S13158 ();
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

   public void S1197( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV15P_USER_ID = AV21W_HTTP_REQ.getVariable("USER_ID") ;
      AV10P_PWD = AV21W_HTTP_REQ.getVariable("PW") ;
      AV12P_STUDY_ID = GXutil.lval( AV21W_HTTP_REQ.getVariable("STUDY_ID")) ;
      AV14P_SUBJECT_NO = (int)(GXutil.lval( AV21W_HTTP_REQ.getVariable("SUBJECT_NO"))) ;
      AV13P_SUBJECT_ID = AV21W_HTTP_REQ.getVariable("SUBJECT_ID") ;
      AV11P_SITE_ID = AV21W_HTTP_REQ.getVariable("SITE_ID") ;
      AV9P_CRF = AV21W_HTTP_REQ.getVariable("CRF") ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV12P_STUDY_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_NO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV14P_SUBJECT_NO, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_SUBJECT_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SITE_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_SITE_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV24W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV24W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_CRF );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV24W_PARMS_ITEM", AV24W_PARMS_ITEM);
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV24W_PARMS_ITEM, 0);
      AV23W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV20W_EXTRA_INFO;
      GXv_int1[0] = AV18W_ERR_CD ;
      GXv_char2[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(1), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int1, GXv_char2) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
      ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
      ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char2[0] ;
   }

   public void S12142( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV22W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV15P_USER_ID ;
      GXv_int1[0] = AV18W_ERR_CD ;
      GXv_char5[0] = AV19W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV10P_PWD, GXv_int1, GXv_char5) ;
      ab505_pc01_new_subject_impl.this.AV15P_USER_ID = GXv_char2[0] ;
      ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
      ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char5[0] ;
   }

   public void S13158( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV18W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab505_pc01_new_subject");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab505_pc01_new_subject");
      }
      AV23W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV18W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV19W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV20W_EXTRA_INFO;
      GXv_int1[0] = AV18W_ERR_CD ;
      GXv_char5[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(1), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int1, GXv_char5) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
      ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
      ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char5[0] ;
      GXv_int1[0] = AV18W_ERR_CD ;
      GXv_char5[0] = AV19W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int1, GXv_char5) ;
      ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
      ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char5[0] ;
   }

   public void S14177( )
   {
      /* 'SUB_ERROR' Routine */
      AV23W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV20W_EXTRA_INFO;
      GXv_int1[0] = AV18W_ERR_CD ;
      GXv_char5[0] = AV19W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV28Pgmname, (short)(0), AV23W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int1, GXv_char5) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
      ab505_pc01_new_subject_impl.this.AV18W_ERR_CD = GXv_int1[0] ;
      ab505_pc01_new_subject_impl.this.AV19W_ERR_MSG = GXv_char5[0] ;
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
                  /* Execute user subroutine: S14177 */
                  S14177 ();
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
      AV8C_TAM02_APP_ID = "" ;
      AV19W_ERR_MSG = "" ;
      AV20W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25W_UPDATE_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV28Pgmname = "" ;
      AV13P_SUBJECT_ID = "" ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
      A613TBT01_SITE_ID = "" ;
      AV11P_SITE_ID = "" ;
      A284TBT01_DEL_FLG = "" ;
      A285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A286TBT01_CRT_USER_ID = "" ;
      AV15P_USER_ID = "" ;
      A287TBT01_CRT_PROG_NM = "" ;
      A288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A289TBT01_UPD_USER_ID = "" ;
      A290TBT01_UPD_PROG_NM = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      Gx_emsg = "" ;
      AV16W_CHR = new GxObjectCollection(String.class, "internal", "");
      AV9P_CRF = "" ;
      A556TBT02_LOCK_FLG = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      A565TBT02_APPROVAL_FLG = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      A295TBT02_DEL_FLG = "" ;
      A297TBT02_CRT_USER_ID = "" ;
      A298TBT02_CRT_PROG_NM = "" ;
      A300TBT02_UPD_USER_ID = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
      AV22W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char3 = "" ;
      AV21W_HTTP_REQ = httpContext.getHttpRequest();
      AV10P_PWD = "" ;
      AV24W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_MSG = "" ;
      GXv_char2 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO4 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int1 = new short [1] ;
      GXv_char5 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab505_pc01_new_subject__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV28Pgmname = "AB505_PC01_NEW_SUBJECT" ;
      /* GeneXus formulas. */
      AV28Pgmname = "AB505_PC01_NEW_SUBJECT" ;
      Gx_err = (short)(0) ;
   }

   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private short AV18W_ERR_CD ;
   private short Gx_err ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short GXv_int1[] ;
   private int AV14P_SUBJECT_NO ;
   private int GX_INS23 ;
   private int A283TBT01_SUBJECT_ID ;
   private int GX_INS24 ;
   private int A293TBT02_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A282TBT01_STUDY_ID ;
   private long AV17W_CNT ;
   private long A292TBT02_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV28Pgmname ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String Gx_emsg ;
   private String GXt_char3 ;
   private String GXv_char2[] ;
   private String GXv_char5[] ;
   private java.util.Date AV25W_UPDATE_TIME ;
   private java.util.Date A285TBT01_CRT_DATETIME ;
   private java.util.Date A288TBT01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private boolean n555TBT01_OUTER_SUBJECT_ID ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n285TBT01_CRT_DATETIME ;
   private boolean n286TBT01_CRT_USER_ID ;
   private boolean n287TBT01_CRT_PROG_NM ;
   private boolean n288TBT01_UPD_DATETIME ;
   private boolean n289TBT01_UPD_USER_ID ;
   private boolean n290TBT01_UPD_PROG_NM ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n297TBT02_CRT_USER_ID ;
   private boolean n298TBT02_CRT_PROG_NM ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private String AV8C_TAM02_APP_ID ;
   private String AV19W_ERR_MSG ;
   private String AV13P_SUBJECT_ID ;
   private String A555TBT01_OUTER_SUBJECT_ID ;
   private String A613TBT01_SITE_ID ;
   private String AV11P_SITE_ID ;
   private String A284TBT01_DEL_FLG ;
   private String A286TBT01_CRT_USER_ID ;
   private String AV15P_USER_ID ;
   private String A287TBT01_CRT_PROG_NM ;
   private String A289TBT01_UPD_USER_ID ;
   private String A290TBT01_UPD_PROG_NM ;
   private String AV9P_CRF ;
   private String A556TBT02_LOCK_FLG ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A295TBT02_DEL_FLG ;
   private String A297TBT02_CRT_USER_ID ;
   private String A298TBT02_CRT_PROG_NM ;
   private String A300TBT02_UPD_USER_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String AV10P_PWD ;
   private String AV23W_MSG ;
   private com.genexus.internet.HttpRequest AV21W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV22W_HTTP_RES ;
   private GxObjectCollection AV16W_CHR ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO4[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV24W_PARMS_ITEM ;
}

final  class ab505_pc01_new_subject__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P003B2", "INSERT INTO `TBT01_SUBJECT` (`TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_PROG_NM`, `TBT01_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003B3", "INSERT INTO `TBT02_CRF` (`TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_APPROVAL_FLG`, `TBT02_INPUT_END_FLG`, `TBT02_DEL_FLG`, `TBT02_CRT_USER_ID`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_USER_ID`, `TBT02_UPD_PROG_NM`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_CRT_DATETIME`, `TBT02_UPD_DATETIME`, `TBT02_UPD_CNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, '1000-01-01', '', '', '1000-01-01', '', '', '1000-01-01', '1000-01-01', '', '', '1000-01-01', '', '', '1000-01-01', '1000-01-01', 0)", GX_NOMASK + GX_MASKLOOPLOCK)
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
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 6);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[6]).byteValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 128);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 40);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[22], 128);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 40);
               }
               break;
      }
   }

}

