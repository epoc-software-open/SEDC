/*
               File: ab502_pc01_down_crf_impl
        Description: CRFダウンロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:20.45
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc01_down_crf_impl extends GXWebProcedure
{
   public ab502_pc01_down_crf_impl( com.genexus.internet.HttpContext context )
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
      AV8C_APP_ID = "B502" ;
      AV23W_ERR_CD = (short)(0) ;
      AV24W_ERR_MSG = "" ;
      GXt_char1 = AV29W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc02_nl_airres(remoteHandle, context).execute( GXv_char2) ;
      ab502_pc01_down_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29W_NEWLINE = GXt_char1 ;
      AV25W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S141 */
      S141 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV35Pgmname, "INFO", AV36Pgmdesc) ;
      AV31W_RTN_CSV.clear();
      if ( AV23W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV23W_ERR_CD == 0 )
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
      AV27W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV23W_ERR_CD, 10, 0))+AV29W_NEWLINE);
      AV27W_HTTP_RES.addString(AV24W_ERR_MSG);
      if ( AV23W_ERR_CD == 0 )
      {
         AV22W_CNT = 1 ;
         while ( AV22W_CNT <= AV31W_RTN_CSV.size() )
         {
            AV27W_HTTP_RES.addString(AV29W_NEWLINE+(String)AV31W_RTN_CSV.elementAt(-1+(int)(AV22W_CNT)));
            AV22W_CNT = (long)(AV22W_CNT+1) ;
         }
      }
      /* Execute user subroutine: S151 */
      S151 ();
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

   public void S111( )
   {
      /* 'SUB_CHECK_PARM' Routine */
      if ( AV23W_ERR_CD == 0 )
      {
         if ( ! ((GXutil.strcmp(AV13P_DIV, "1")==0)||(GXutil.strcmp(AV13P_DIV, "2")==0)||(GXutil.strcmp(AV13P_DIV, "3")==0)||(GXutil.strcmp(AV13P_DIV, "4")==0)||(GXutil.strcmp(AV13P_DIV, "5")==0)||(GXutil.strcmp(AV13P_DIV, "6")==0)||(GXutil.strcmp(AV13P_DIV, "7")==0)||(GXutil.strcmp(AV13P_DIV, "8")==0)||(GXutil.strcmp(AV13P_DIV, "9")==0)||(GXutil.strcmp(AV13P_DIV, "10")==0)||(GXutil.strcmp(AV13P_DIV, "11")==0)||(GXutil.strcmp(AV13P_DIV, "12")==0)) )
         {
            AV23W_ERR_CD = (short)(1) ;
            GXt_char1 = AV24W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", "処理区分", "", "", "", "", GXv_char2) ;
            ab502_pc01_down_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_ERR_MSG = GXt_char1 ;
         }
      }
      if ( AV23W_ERR_CD == 0 )
      {
         if ( (GXutil.strcmp("", AV19P_STUDY_ID)==0) )
         {
            AV23W_ERR_CD = (short)(1) ;
            GXt_char1 = AV24W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", "試験ID", "", "", "", "", GXv_char2) ;
            ab502_pc01_down_crf_impl.this.GXt_char1 = GXv_char2[0] ;
            AV24W_ERR_MSG = GXt_char1 ;
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_GET_RES_DATA' Routine */
      AV32W_STUDY_ID = GXutil.lval( AV19P_STUDY_ID) ;
      if ( GXutil.strcmp(AV13P_DIV, "1") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc01_crf_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "2") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc02_crf_item_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV11P_CRF_ITEM_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "3") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc03_crf_cond_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV9P_COND_NO, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "4") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc04_crf_auth_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV20P_STYDY_AUTH_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "5") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc05_crf_item_auth_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV11P_CRF_ITEM_CD, AV20P_STYDY_AUTH_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "6") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc06_crf_dom_map_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV11P_CRF_ITEM_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "7") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc07_crf_ncm_map_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV10P_CRF_ID, AV11P_CRF_ITEM_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "8") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc08_map_item_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV14P_DOM_CD, AV15P_DOM_VAR_NM, AV12P_CRF_ITEM_DIV, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "9") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc09_sel_list_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV16P_LIST_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "10") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc10_sel_list_item_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV16P_LIST_CD, AV17P_LIST_ITEM_NO, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "11") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc33_cdisc_domain_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV14P_DOM_CD, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
      else if ( GXutil.strcmp(AV13P_DIV, "12") == 0 )
      {
         GXv_objcol_svchar3[0] = AV31W_RTN_CSV ;
         GXv_int4[0] = AV23W_ERR_CD ;
         GXv_char2[0] = AV24W_ERR_MSG ;
         new b599_pc34_cdisc_item_res(remoteHandle, context).execute( AV32W_STUDY_ID, AV14P_DOM_CD, AV15P_DOM_VAR_NM, GXv_objcol_svchar3, GXv_int4, GXv_char2) ;
         AV31W_RTN_CSV = GXv_objcol_svchar3[0] ;
         ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
         ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
      }
   }

   public void S131( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV21P_USER_ID = AV26W_HTTP_REQ.getVariable("USER_ID") ;
      AV18P_PWD = AV26W_HTTP_REQ.getVariable("PW") ;
      AV19P_STUDY_ID = AV26W_HTTP_REQ.getVariable("STUDY_ID") ;
      AV10P_CRF_ID = AV26W_HTTP_REQ.getVariable("CRF_ID") ;
      AV11P_CRF_ITEM_CD = AV26W_HTTP_REQ.getVariable("CRF_ITEM_CD") ;
      AV9P_COND_NO = AV26W_HTTP_REQ.getVariable("COND_NO") ;
      AV20P_STYDY_AUTH_CD = AV26W_HTTP_REQ.getVariable("STYDY_AUTH_CD") ;
      AV14P_DOM_CD = AV26W_HTTP_REQ.getVariable("DOM_CD") ;
      AV15P_DOM_VAR_NM = AV26W_HTTP_REQ.getVariable("DOM_VAR_NM") ;
      AV12P_CRF_ITEM_DIV = AV26W_HTTP_REQ.getVariable("CRF_ITEM_DIV") ;
      AV16P_LIST_CD = AV26W_HTTP_REQ.getVariable("LIST_CD") ;
      AV17P_LIST_ITEM_NO = AV26W_HTTP_REQ.getVariable("LIST_ITEM_NO") ;
      AV13P_DIV = AV26W_HTTP_REQ.getVariable("PROC_DIV") ;
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV21P_USER_ID );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV19P_STUDY_ID );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ID" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_CRF_ID );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM_CD" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV11P_CRF_ITEM_CD );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "COND_NO" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_COND_NO );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STYDY_AUTH_CD" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV20P_STYDY_AUTH_CD );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "DOM_CD" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV14P_DOM_CD );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "DOM_VAR_NM" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV15P_DOM_VAR_NM );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "CRF_ITEM_DIV" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_CRF_ITEM_DIV );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "LIST_CD" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV16P_LIST_CD );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "LIST_ITEM_NO" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV17P_LIST_ITEM_NO );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV30W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "PROC_DIV" );
      AV30W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV13P_DIV );
      AV25W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV30W_PARMS_ITEM, 0);
      AV28W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV25W_EXTRA_INFO;
      GXv_int4[0] = AV23W_ERR_CD ;
      GXv_char2[0] = AV24W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV35Pgmname, (short)(1), AV28W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char2) ;
      AV25W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
      ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char2[0] ;
   }

   public void S141( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV27W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char2[0] = AV21P_USER_ID ;
      GXv_int4[0] = AV23W_ERR_CD ;
      GXv_char6[0] = AV24W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char2, AV18P_PWD, GXv_int4, GXv_char6) ;
      ab502_pc01_down_crf_impl.this.AV21P_USER_ID = GXv_char2[0] ;
      ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
      ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char6[0] ;
   }

   public void S151( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV23W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab502_pc01_down_crf");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab502_pc01_down_crf");
      }
      AV28W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV23W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV24W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV25W_EXTRA_INFO;
      GXv_int4[0] = AV23W_ERR_CD ;
      GXv_char6[0] = AV24W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV35Pgmname, (short)(1), AV28W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV25W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
      ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char6[0] ;
      GXv_int4[0] = AV23W_ERR_CD ;
      GXv_char6[0] = AV24W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int4, GXv_char6) ;
      ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
      ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char6[0] ;
   }

   public void S161( )
   {
      /* 'SUB_ERROR' Routine */
      AV28W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO5[0] = AV25W_EXTRA_INFO;
      GXv_int4[0] = AV23W_ERR_CD ;
      GXv_char6[0] = AV24W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV35Pgmname, (short)(0), AV28W_MSG, GXv_SdtB808_SD01_EXTRA_INFO5, GXv_int4, GXv_char6) ;
      AV25W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO5[0] ;
      ab502_pc01_down_crf_impl.this.AV23W_ERR_CD = GXv_int4[0] ;
      ab502_pc01_down_crf_impl.this.AV24W_ERR_MSG = GXv_char6[0] ;
      context.globals.Gx_eop = (byte)(0) ;
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
                  /* Execute user subroutine: S161 */
                  S161 ();
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
      AV8C_APP_ID = "" ;
      AV24W_ERR_MSG = "" ;
      AV29W_NEWLINE = "" ;
      AV25W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV35Pgmname = "" ;
      AV36Pgmdesc = "" ;
      AV31W_RTN_CSV = new GxObjectCollection(String.class, "internal", "");
      AV27W_HTTP_RES = httpContext.getHttpResponse();
      AV13P_DIV = "" ;
      AV19P_STUDY_ID = "" ;
      GXt_char1 = "" ;
      AV10P_CRF_ID = "" ;
      AV11P_CRF_ITEM_CD = "" ;
      AV9P_COND_NO = "" ;
      AV20P_STYDY_AUTH_CD = "" ;
      AV14P_DOM_CD = "" ;
      AV15P_DOM_VAR_NM = "" ;
      AV12P_CRF_ITEM_DIV = "" ;
      AV16P_LIST_CD = "" ;
      AV17P_LIST_ITEM_NO = "" ;
      GXv_objcol_svchar3 = new GxObjectCollection [1] ;
      AV21P_USER_ID = "" ;
      AV26W_HTTP_REQ = httpContext.getHttpRequest();
      AV18P_PWD = "" ;
      AV30W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV28W_MSG = "" ;
      GXv_char2 = new String [1] ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO5 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int4 = new short [1] ;
      GXv_char6 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab502_pc01_down_crf__default(),
         new Object[] {
         }
      );
      pr_default.setErrorHandler(this);
      AV36Pgmdesc = "CRFダウンロード" ;
      AV35Pgmname = "AB502_PC01_DOWN_CRF" ;
      /* GeneXus formulas. */
      AV36Pgmdesc = "CRFダウンロード" ;
      AV35Pgmname = "AB502_PC01_DOWN_CRF" ;
      Gx_err = (short)(0) ;
   }

   private short AV23W_ERR_CD ;
   private short GXv_int4[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV22W_CNT ;
   private long AV32W_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV35Pgmname ;
   private String AV36Pgmdesc ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char6[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV8C_APP_ID ;
   private String AV24W_ERR_MSG ;
   private String AV29W_NEWLINE ;
   private String AV13P_DIV ;
   private String AV19P_STUDY_ID ;
   private String AV10P_CRF_ID ;
   private String AV11P_CRF_ITEM_CD ;
   private String AV9P_COND_NO ;
   private String AV20P_STYDY_AUTH_CD ;
   private String AV14P_DOM_CD ;
   private String AV15P_DOM_VAR_NM ;
   private String AV12P_CRF_ITEM_DIV ;
   private String AV16P_LIST_CD ;
   private String AV17P_LIST_ITEM_NO ;
   private String AV21P_USER_ID ;
   private String AV18P_PWD ;
   private String AV28W_MSG ;
   private com.genexus.internet.HttpRequest AV26W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV27W_HTTP_RES ;
   private GxObjectCollection AV31W_RTN_CSV ;
   private GxObjectCollection GXv_objcol_svchar3[] ;
   private SdtB808_SD01_EXTRA_INFO AV25W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO5[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV30W_PARMS_ITEM ;
}

final  class ab502_pc01_down_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
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

