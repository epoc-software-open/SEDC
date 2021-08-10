/*
               File: B720_RP02_REKIINFO_CRF_PDF
        Description: CRFïœçXóöóàÍóóPDFèoóÕ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:17.42
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.reports.*;
import com.genexus.*;
import com.genexus.ui.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.uifactory.*;
import com.genexus.search.*;
import java.sql.*;

public final  class ab720_rp02_rekiinfo_crf_pdf extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      ab720_rp02_rekiinfo_crf_pdf pgm = new ab720_rp02_rekiinfo_crf_pdf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      long aP1 = 0;
      int aP2 = 0;
      short aP3 = 0;
      byte aP4 = 0;

      try
      {
         aP0 = (String) args[0];
         aP1 = (long) GXutil.val( args[1], ".");
         aP2 = (int) GXutil.val( args[2], ".");
         aP3 = (short) GXutil.val( args[3], ".");
         aP4 = (byte) GXutil.val( args[4], ".");
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4);
   }

   public ab720_rp02_rekiinfo_crf_pdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ab720_rp02_rekiinfo_crf_pdf.class ), "" );
   }

   public ab720_rp02_rekiinfo_crf_pdf( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        int aP2 ,
                        short aP3 ,
                        byte aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             int aP2 ,
                             short aP3 ,
                             byte aP4 )
   {
      ab720_rp02_rekiinfo_crf_pdf.this.AV32W_OUT_FILE_NM = aP0;
      ab720_rp02_rekiinfo_crf_pdf.this.AV27P_STUDY_ID = aP1;
      ab720_rp02_rekiinfo_crf_pdf.this.AV28P_SUBJECT_ID = aP2;
      ab720_rp02_rekiinfo_crf_pdf.this.AV26P_CRF_ID = aP3;
      ab720_rp02_rekiinfo_crf_pdf.this.AV25P_CRF_EDA_NO = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      httpContext.setDefaultTheme("Style2");
      M_top = 0 ;
      M_bot = 6 ;
      P_lines = (int)(66-M_bot) ;
      getPrinter().GxClearAttris() ;
      add_metrics( ) ;
      lineHeight = 15 ;
      PrtOffset = 0 ;
      gxXPage = 100 ;
      gxYPage = 100 ;
      getPrinter().GxSetDocName(AV32W_OUT_FILE_NM) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 2, 256, 11909, 18720, 0, 1, 1, 0, 1, 1) )
         {
            cleanup();
            return;
         }
         getPrinter().setModal(true) ;
         P_lines = (int)(gxYPage-(lineHeight*6)) ;
         Gx_line = (int)(P_lines+1) ;
         getPrinter().setPageLines(P_lines);
         getPrinter().setLineHeight(lineHeight);
         getPrinter().setM_top(M_top);
         getPrinter().setM_bot(M_bot);
         /* Execute user subroutine: S171 */
         S171 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV10D_DATETIME_VC = "" ;
         GXt_char1 = AV10D_DATETIME_VC ;
         GXv_char2[0] = GXt_char1 ;
         new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
         ab720_rp02_rekiinfo_crf_pdf.this.GXt_char1 = GXv_char2[0] ;
         AV10D_DATETIME_VC = GXt_char1 ;
         /* Execute user subroutine: S111 */
         S111 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S121 */
         S121 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S141 */
         S141 ();
         if ( returnInSub )
         {
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S161 */
         S161 ();
         if ( returnInSub )
         {
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h7J0( true, 0) ;
         /* Close printer file */
         getPrinter().GxEndDocument() ;
         endPrinter();
      }
      catch ( ProcessInterruptedException e )
      {
      }
      cleanup();
   }

   public void S111( ) throws ProcessInterruptedException
   {
      /* 'PRINTMAINTITLE' Routine */
      h7J0( false, 32) ;
      getPrinter().GxAttris("ÇlÇr ñæí©", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV10D_DATETIME_VC, "")), 1125, Gx_line+0, 1283, Gx_line+15, 2, 0, 0, 0) ;
      getPrinter().GxDrawText("èoóÕì˙éûÅF", 1077, Gx_line+0, 1151, Gx_line+14, 0+256, 0, 0, 0) ;
      getPrinter().GxAttris("ÇlÇr ñæí©", 16, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("CRFïœçXóöó", 9, Gx_line+0, 576, Gx_line+23, 0, 0, 0, 1) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+32) ;
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'PRINTHEADER' Routine */
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      h7J0( false, 143) ;
      getPrinter().GxDrawRect(9, Gx_line+88, 1285, Gx_line+143, 0, 0, 0, 0, 1, 224, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(551, Gx_line+28, 634, Gx_line+78, 0, 0, 0, 0, 1, 224, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(9, Gx_line+3, 92, Gx_line+78, 0, 0, 0, 0, 1, 224, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(66, Gx_line+88, 66, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(858, Gx_line+88, 858, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(127, Gx_line+107, 127, Gx_line+142, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(190, Gx_line+107, 190, Gx_line+142, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(9, Gx_line+88, 1285, Gx_line+143, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(256, Gx_line+88, 256, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(697, Gx_line+88, 697, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(555, Gx_line+88, 555, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(397, Gx_line+88, 397, Gx_line+143, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(551, Gx_line+28, 551, Gx_line+78, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(93, Gx_line+3, 93, Gx_line+78, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(634, Gx_line+28, 634, Gx_line+78, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(9, Gx_line+53, 1134, Gx_line+53, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(9, Gx_line+53, 1134, Gx_line+53, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(9, Gx_line+28, 1134, Gx_line+28, 1, 0, 0, 0, 0) ;
      getPrinter().GxDrawRect(9, Gx_line+3, 1135, Gx_line+78, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      getPrinter().GxDrawLine(67, Gx_line+107, 256, Gx_line+107, 1, 0, 0, 0, 0) ;
      getPrinter().GxAttris("ÇlÇr ñæí©", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("ééå±ñº", 18, Gx_line+7, 68, Gx_line+21, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("CRFñº", 18, Gx_line+57, 55, Gx_line+71, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText("VISTî‘çÜ", 559, Gx_line+57, 618, Gx_line+71, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText("é{ê›ñº", 559, Gx_line+32, 604, Gx_line+46, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText("çXêV", 12, Gx_line+98, 62, Gx_line+115, 1+16, 0, 0, 2) ;
      getPrinter().GxDrawText("DM", 72, Gx_line+108, 122, Gx_line+125, 1+16, 0, 0, 2) ;
      getPrinter().GxDrawText("èêñº", 132, Gx_line+108, 182, Gx_line+141, 1, 0, 0, 1) ;
      getPrinter().GxDrawText("ìûíÖ", 72, Gx_line+124, 122, Gx_line+141, 1+16, 0, 0, 0) ;
      getPrinter().GxDrawText("ÉfÅ[É^", 190, Gx_line+108, 257, Gx_line+125, 1+16, 0, 0, 2) ;
      getPrinter().GxDrawText("çXêVé“", 264, Gx_line+98, 389, Gx_line+131, 1, 0, 0, 1) ;
      getPrinter().GxDrawText("çXêVì˙éû", 405, Gx_line+98, 547, Gx_line+131, 1, 0, 0, 1) ;
      getPrinter().GxDrawText("èêñºé“", 564, Gx_line+98, 689, Gx_line+131, 1, 0, 0, 1) ;
      getPrinter().GxDrawText("èêñºì˙éû", 699, Gx_line+98, 857, Gx_line+131, 1, 0, 0, 1) ;
      getPrinter().GxDrawText("å≈íË", 198, Gx_line+124, 248, Gx_line+141, 1+16, 0, 0, 0) ;
      getPrinter().GxDrawText("ïœçXóùóR", 865, Gx_line+98, 1284, Gx_line+131, 1, 0, 0, 1) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV13D_STUDY_NM, "")), 101, Gx_line+7, 1126, Gx_line+24, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV8D_CRF_NM, "")), 101, Gx_line+57, 543, Gx_line+72, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15D_VISIT_NO), "ZZZZZ9")), 643, Gx_line+57, 701, Gx_line+72, 0, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12D_SITE_NM, "")), 643, Gx_line+32, 1132, Gx_line+47, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("CRFï€ë∂éûÇÃèÛë‘", 73, Gx_line+90, 253, Gx_line+104, 1, 0, 0, 0) ;
      getPrinter().GxDrawText("Ver", 12, Gx_line+114, 62, Gx_line+131, 1+16, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14D_SUBJECT_ID), "ZZZZZ9")), 101, Gx_line+32, 209, Gx_line+47, 0, 0, 0, 0) ;
      getPrinter().GxDrawText("ä≥é“No", 18, Gx_line+32, 63, Gx_line+46, 0+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+143) ;
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'PRINTDATA' Routine */
      AV29W_B717_SD01_REKIINFO_CRF_LIST.clear();
      /* Using cursor P007J2 */
      pr_default.execute(0, new Object[] {new Long(AV27P_STUDY_ID), new Integer(AV28P_SUBJECT_ID), new Short(AV26P_CRF_ID), new Byte(AV25P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A92TBT11_STUDY_ID = P007J2_A92TBT11_STUDY_ID[0] ;
         A93TBT11_SUBJECT_ID = P007J2_A93TBT11_SUBJECT_ID[0] ;
         A94TBT11_CRF_ID = P007J2_A94TBT11_CRF_ID[0] ;
         A936TBT11_CRF_EDA_NO = P007J2_A936TBT11_CRF_EDA_NO[0] ;
         A457TBT11_DEL_FLG = P007J2_A457TBT11_DEL_FLG[0] ;
         n457TBT11_DEL_FLG = P007J2_n457TBT11_DEL_FLG[0] ;
         A670TBT11_DM_ARRIVAL_DATETIME = P007J2_A670TBT11_DM_ARRIVAL_DATETIME[0] ;
         n670TBT11_DM_ARRIVAL_DATETIME = P007J2_n670TBT11_DM_ARRIVAL_DATETIME[0] ;
         A669TBT11_DM_ARRIVAL_FLG = P007J2_A669TBT11_DM_ARRIVAL_FLG[0] ;
         n669TBT11_DM_ARRIVAL_FLG = P007J2_n669TBT11_DM_ARRIVAL_FLG[0] ;
         A993TBT11_SIGNATURE_FLG = P007J2_A993TBT11_SIGNATURE_FLG[0] ;
         n993TBT11_SIGNATURE_FLG = P007J2_n993TBT11_SIGNATURE_FLG[0] ;
         A675TBT11_INPUT_END_FLG = P007J2_A675TBT11_INPUT_END_FLG[0] ;
         n675TBT11_INPUT_END_FLG = P007J2_n675TBT11_INPUT_END_FLG[0] ;
         A667TBT11_UPLOAD_USER_ID = P007J2_A667TBT11_UPLOAD_USER_ID[0] ;
         n667TBT11_UPLOAD_USER_ID = P007J2_n667TBT11_UPLOAD_USER_ID[0] ;
         A666TBT11_UPLOAD_DATETIME = P007J2_A666TBT11_UPLOAD_DATETIME[0] ;
         n666TBT11_UPLOAD_DATETIME = P007J2_n666TBT11_UPLOAD_DATETIME[0] ;
         A995TBT11_SIGNATURE_USER_ID = P007J2_A995TBT11_SIGNATURE_USER_ID[0] ;
         n995TBT11_SIGNATURE_USER_ID = P007J2_n995TBT11_SIGNATURE_USER_ID[0] ;
         A994TBT11_SIGNATURE_DATETIME = P007J2_A994TBT11_SIGNATURE_DATETIME[0] ;
         n994TBT11_SIGNATURE_DATETIME = P007J2_n994TBT11_SIGNATURE_DATETIME[0] ;
         A891TBT11_UPD_RIYU = P007J2_A891TBT11_UPD_RIYU[0] ;
         n891TBT11_UPD_RIYU = P007J2_n891TBT11_UPD_RIYU[0] ;
         A95TBT11_CRF_VERSION = P007J2_A95TBT11_CRF_VERSION[0] ;
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( A95TBT11_CRF_VERSION );
         if ( GXutil.strcmp(A669TBT11_DM_ARRIVAL_FLG, "1") == 0 )
         {
            AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( "çœ" );
         }
         else
         {
            AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival( "ç∑ñﬂ" );
         }
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg( A993TBT11_SIGNATURE_FLG );
         if ( GXutil.strcmp(A675TBT11_INPUT_END_FLG, "1") == 0 )
         {
            AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( "çœ" );
         }
         else
         {
            AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end( "ñ¢" );
         }
         AV35W_TAM07_USER_ID = "" ;
         AV35W_TAM07_USER_ID = A667TBT11_UPLOAD_USER_ID ;
         /* Execute user subroutine: S152 */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm( AV36W_TAM07_USER_NM );
         AV31W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         AV31W_DATETIME = A666TBT11_UPLOAD_DATETIME ;
         if ( ! GXutil.nullDate().equals(AV31W_DATETIME) )
         {
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV31W_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
            ab720_rp02_rekiinfo_crf_pdf.this.GXt_char1 = GXv_char2[0] ;
            AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc( GXt_char1 );
         }
         AV35W_TAM07_USER_ID = "" ;
         AV35W_TAM07_USER_ID = A995TBT11_SIGNATURE_USER_ID ;
         /* Execute user subroutine: S152 */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            getPrinter().GxEndPage() ;
            /* Close printer file */
            getPrinter().GxEndDocument() ;
            endPrinter();
            returnInSub = true;
            if (true) return;
         }
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm( AV36W_TAM07_USER_NM );
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime( A994TBT11_SIGNATURE_DATETIME );
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu( A891TBT11_UPD_RIYU );
         AV29W_B717_SD01_REKIINFO_CRF_LIST.add(AV30W_B717_SD01_REKIINFO_CRF_LIST_Item, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV37W_TBT11_CRF_VERSION = (short)(AV29W_B717_SD01_REKIINFO_CRF_LIST.size()) ;
      AV41GXV1 = 1 ;
      while ( AV41GXV1 <= AV29W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV29W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV41GXV1));
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.setgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version( AV37W_TBT11_CRF_VERSION );
         AV37W_TBT11_CRF_VERSION = (short)(AV37W_TBT11_CRF_VERSION-1) ;
         AV41GXV1 = (int)(AV41GXV1+1) ;
      }
      AV42GXV2 = 1 ;
      while ( AV42GXV2 <= AV29W_B717_SD01_REKIINFO_CRF_LIST.size() )
      {
         AV30W_B717_SD01_REKIINFO_CRF_LIST_Item = (SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)((SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem)AV29W_B717_SD01_REKIINFO_CRF_LIST.elementAt(-1+AV42GXV2));
         AV21DATA_TBT11_CRF_VERSION = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_crf_version() ;
         AV16DATA_DM_ARRIVAL = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Dm_arrival() ;
         AV17DATA_INPUT_END = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Input_end() ;
         AV20DATA_TAM07_USER_NM = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tam07_user_nm() ;
         AV24DATA_TBT11_UPLOAD_DATETIME_VC = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upload_datetime_vc() ;
         AV19DATA_SIGNATURE_USER_NM = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Signature_user_nm() ;
         AV23DATA_TBT11_UPD_RIYU = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_upd_riyu() ;
         if ( GXutil.strcmp(AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_flg(), "1") == 0 )
         {
            AV18DATA_SIGNATURE = "çœ" ;
         }
         else
         {
            AV18DATA_SIGNATURE = "ñ¢" ;
         }
         AV31W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         AV31W_DATETIME = AV30W_B717_SD01_REKIINFO_CRF_LIST_Item.getgxTv_SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem_Tbt11_signature_datetime() ;
         if ( ! GXutil.nullDate().equals(AV31W_DATETIME) )
         {
            GXt_char1 = AV22DATA_TBT11_SIGNATURE_DATETIME_VC ;
            GXv_char2[0] = GXt_char1 ;
            new a802_pc02_datetime_edit(remoteHandle, context).execute( AV31W_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
            ab720_rp02_rekiinfo_crf_pdf.this.GXt_char1 = GXv_char2[0] ;
            AV22DATA_TBT11_SIGNATURE_DATETIME_VC = GXt_char1 ;
         }
         else
         {
            AV22DATA_TBT11_SIGNATURE_DATETIME_VC = "" ;
         }
         h7J0( false, 25) ;
         getPrinter().GxDrawRect(9, Gx_line+0, 1285, Gx_line+25, 1, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(66, Gx_line+0, 66, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(127, Gx_line+0, 127, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(190, Gx_line+0, 190, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(256, Gx_line+0, 256, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(397, Gx_line+0, 397, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(555, Gx_line+0, 555, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(697, Gx_line+0, 697, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxDrawLine(858, Gx_line+0, 858, Gx_line+25, 1, 0, 0, 0, 0) ;
         getPrinter().GxAttris("ÇlÇr ñæí©", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV24DATA_TBT11_UPLOAD_DATETIME_VC, "")), 397, Gx_line+3, 555, Gx_line+18, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV21DATA_TBT11_CRF_VERSION), "ZZZ9")), 12, Gx_line+3, 62, Gx_line+18, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16DATA_DM_ARRIVAL, "")), 72, Gx_line+3, 122, Gx_line+18, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17DATA_INPUT_END, "")), 198, Gx_line+3, 248, Gx_line+18, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20DATA_TAM07_USER_NM, "")), 264, Gx_line+3, 389, Gx_line+18, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV23DATA_TBT11_UPD_RIYU, "")), 865, Gx_line+3, 1284, Gx_line+18, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV19DATA_SIGNATURE_USER_NM, "")), 564, Gx_line+3, 689, Gx_line+18, 0, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV22DATA_TBT11_SIGNATURE_DATETIME_VC, "")), 699, Gx_line+3, 857, Gx_line+18, 1, 0, 0, 0) ;
         getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV18DATA_SIGNATURE, "")), 132, Gx_line+3, 182, Gx_line+18, 1, 0, 0, 0) ;
         Gx_OldLine = Gx_line ;
         Gx_line = (int)(Gx_line+25) ;
         AV42GXV2 = (int)(AV42GXV2+1) ;
      }
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'PRINTFOOTER' Routine */
      AV11D_REC_CNT = (short)(0) ;
      AV11D_REC_CNT = (short)(AV29W_B717_SD01_REKIINFO_CRF_LIST.size()) ;
      h7J0( false, 23) ;
      getPrinter().GxAttris("ÇlÇr ñæí©", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
      getPrinter().GxDrawText("(ëS", 12, Gx_line+9, 35, Gx_line+23, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText("åè)", 71, Gx_line+9, 94, Gx_line+23, 0+256, 0, 0, 0) ;
      getPrinter().GxDrawText(GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11D_REC_CNT), "ZZZ9")), 33, Gx_line+8, 63, Gx_line+23, 2+256, 0, 0, 0) ;
      Gx_OldLine = Gx_line ;
      Gx_line = (int)(Gx_line+23) ;
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'SUB_GET_HEADER_DATA' Routine */
      /* Using cursor P007J3 */
      pr_default.execute(1, new Object[] {new Long(AV27P_STUDY_ID)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A369TBM21_DEL_FLG = P007J3_A369TBM21_DEL_FLG[0] ;
         n369TBM21_DEL_FLG = P007J3_n369TBM21_DEL_FLG[0] ;
         A63TBM21_STUDY_ID = P007J3_A63TBM21_STUDY_ID[0] ;
         A367TBM21_STUDY_NM = P007J3_A367TBM21_STUDY_NM[0] ;
         n367TBM21_STUDY_NM = P007J3_n367TBM21_STUDY_NM[0] ;
         AV13D_STUDY_NM = A367TBM21_STUDY_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      AV14D_SUBJECT_ID = AV28P_SUBJECT_ID ;
      /* Using cursor P007J4 */
      pr_default.execute(2, new Object[] {new Long(AV27P_STUDY_ID), new Short(AV26P_CRF_ID)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A397TBM31_DEL_FLG = P007J4_A397TBM31_DEL_FLG[0] ;
         n397TBM31_DEL_FLG = P007J4_n397TBM31_DEL_FLG[0] ;
         A69TBM31_CRF_ID = P007J4_A69TBM31_CRF_ID[0] ;
         A68TBM31_STUDY_ID = P007J4_A68TBM31_STUDY_ID[0] ;
         A393TBM31_CRF_NM = P007J4_A393TBM31_CRF_NM[0] ;
         n393TBM31_CRF_NM = P007J4_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = P007J4_A642TBM31_CRF_SNM[0] ;
         n642TBM31_CRF_SNM = P007J4_n642TBM31_CRF_SNM[0] ;
         AV8D_CRF_NM = A393TBM31_CRF_NM ;
         AV9D_CRF_SNM = A642TBM31_CRF_SNM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Using cursor P007J5 */
      pr_default.execute(3, new Object[] {new Long(AV27P_STUDY_ID), new Short(AV26P_CRF_ID), new Byte(AV25P_CRF_EDA_NO)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A947TBM44_CRF_EDA_NO = P007J5_A947TBM44_CRF_EDA_NO[0] ;
         A946TBM44_CRF_ID = P007J5_A946TBM44_CRF_ID[0] ;
         A945TBM44_STUDY_ID = P007J5_A945TBM44_STUDY_ID[0] ;
         A948TBM44_VISIT_NO = P007J5_A948TBM44_VISIT_NO[0] ;
         n948TBM44_VISIT_NO = P007J5_n948TBM44_VISIT_NO[0] ;
         AV15D_VISIT_NO = A948TBM44_VISIT_NO ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      /* Using cursor P007J6 */
      pr_default.execute(4, new Object[] {new Long(AV27P_STUDY_ID), new Integer(AV28P_SUBJECT_ID)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A441TBT01_DEL_FLG = P007J6_A441TBT01_DEL_FLG[0] ;
         n441TBT01_DEL_FLG = P007J6_n441TBT01_DEL_FLG[0] ;
         A88TBT01_SUBJECT_ID = P007J6_A88TBT01_SUBJECT_ID[0] ;
         A87TBT01_STUDY_ID = P007J6_A87TBT01_STUDY_ID[0] ;
         A698TBT01_SITE_ID = P007J6_A698TBT01_SITE_ID[0] ;
         n698TBT01_SITE_ID = P007J6_n698TBT01_SITE_ID[0] ;
         AV34W_SITE_ID = A698TBT01_SITE_ID ;
         /* Using cursor P007J7 */
         pr_default.execute(5, new Object[] {AV34W_SITE_ID});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A325TAM08_DEL_FLG = P007J7_A325TAM08_DEL_FLG[0] ;
            n325TAM08_DEL_FLG = P007J7_n325TAM08_DEL_FLG[0] ;
            A57TAM08_SITE_ID = P007J7_A57TAM08_SITE_ID[0] ;
            A319TAM08_SITE_NM = P007J7_A319TAM08_SITE_NM[0] ;
            n319TAM08_SITE_NM = P007J7_n319TAM08_SITE_NM[0] ;
            AV12D_SITE_NM = A319TAM08_SITE_NM ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S152( ) throws ProcessInterruptedException
   {
      /* 'SUB_USER_NM_GET' Routine */
      AV36W_TAM07_USER_NM = "" ;
      /* Using cursor P007J8 */
      pr_default.execute(6, new Object[] {AV35W_TAM07_USER_ID});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A55TAM07_USER_ID = P007J8_A55TAM07_USER_ID[0] ;
         A205TAM07_USER_NM = P007J8_A205TAM07_USER_NM[0] ;
         n205TAM07_USER_NM = P007J8_n205TAM07_USER_NM[0] ;
         AV36W_TAM07_USER_NM = A205TAM07_USER_NM ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(6);
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV49Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      getPrinter().GxEndPage() ;
      /* Close printer file */
      getPrinter().GxEndDocument() ;
      endPrinter();
      returnInSub = true;
      if (true) return;
   }

   public void h7J0( boolean bFoot ,
                     int Inc )
   {
      /* Skip the required number of lines */
      while ( ( ToSkip > 0 ) || ( Gx_line + Inc > P_lines ) )
      {
         if ( Gx_line + Inc >= P_lines )
         {
            if ( Gx_page > 0 )
            {
               /* Print footers */
               Gx_line = P_lines ;
               getPrinter().GxEndPage() ;
               if ( bFoot )
               {
                  return  ;
               }
            }
            ToSkip = 0 ;
            Gx_line = 0 ;
            Gx_page = (int)(Gx_page+1) ;
            /* Skip Margin Top Lines */
            Gx_line = (int)(Gx_line+(M_top*lineHeight)) ;
            /* Print headers */
            getPrinter().GxStartPage() ;
            getPrinter().setPage(Gx_page);
            if (true) break;
         }
         else
         {
            PrtOffset = 0 ;
            Gx_line = (int)(Gx_line+1) ;
         }
         ToSkip = (int)(ToSkip-1) ;
      }
      getPrinter().setPage(Gx_page);
   }

   public void add_metrics( )
   {
      add_metrics0( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("ÇlÇr ñæí©", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 36, 48, 14, 36, 21, 64, 36, 36, 21, 64, 43, 21, 64, 48, 39, 48, 48, 14, 14, 21, 21, 22, 36, 64, 20, 64, 32, 21, 60, 48, 31, 43, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(b720_rp02_rekiinfo_crf_pdf.class);
      return new GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      if (Application.realMainProgram == this)	waitPrinterEnd();
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
                  /* Execute user subroutine: S181 */
                  S181 ();
                  if ( returnInSub )
                  {
                     getPrinter().GxEndPage() ;
                     /* Close printer file */
                     getPrinter().GxEndDocument() ;
                     endPrinter();
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
      AV10D_DATETIME_VC = "" ;
      AV13D_STUDY_NM = "" ;
      AV8D_CRF_NM = "" ;
      AV12D_SITE_NM = "" ;
      AV29W_B717_SD01_REKIINFO_CRF_LIST = new GxObjectCollection(SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem.class, "B717_SD01_REKIINFO_CRF_LIST.B717_SD01_REKIINFO_CRF_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      scmdbuf = "" ;
      P007J2_A92TBT11_STUDY_ID = new long[1] ;
      P007J2_A93TBT11_SUBJECT_ID = new int[1] ;
      P007J2_A94TBT11_CRF_ID = new short[1] ;
      P007J2_A936TBT11_CRF_EDA_NO = new byte[1] ;
      P007J2_A457TBT11_DEL_FLG = new String[] {""} ;
      P007J2_n457TBT11_DEL_FLG = new boolean[] {false} ;
      P007J2_A670TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007J2_n670TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      P007J2_A669TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      P007J2_n669TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      P007J2_A993TBT11_SIGNATURE_FLG = new String[] {""} ;
      P007J2_n993TBT11_SIGNATURE_FLG = new boolean[] {false} ;
      P007J2_A675TBT11_INPUT_END_FLG = new String[] {""} ;
      P007J2_n675TBT11_INPUT_END_FLG = new boolean[] {false} ;
      P007J2_A667TBT11_UPLOAD_USER_ID = new String[] {""} ;
      P007J2_n667TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      P007J2_A666TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007J2_n666TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      P007J2_A995TBT11_SIGNATURE_USER_ID = new String[] {""} ;
      P007J2_n995TBT11_SIGNATURE_USER_ID = new boolean[] {false} ;
      P007J2_A994TBT11_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P007J2_n994TBT11_SIGNATURE_DATETIME = new boolean[] {false} ;
      P007J2_A891TBT11_UPD_RIYU = new String[] {""} ;
      P007J2_n891TBT11_UPD_RIYU = new boolean[] {false} ;
      P007J2_A95TBT11_CRF_VERSION = new short[1] ;
      A457TBT11_DEL_FLG = "" ;
      A670TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A669TBT11_DM_ARRIVAL_FLG = "" ;
      A993TBT11_SIGNATURE_FLG = "" ;
      A675TBT11_INPUT_END_FLG = "" ;
      A667TBT11_UPLOAD_USER_ID = "" ;
      A666TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A995TBT11_SIGNATURE_USER_ID = "" ;
      A994TBT11_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A891TBT11_UPD_RIYU = "" ;
      AV30W_B717_SD01_REKIINFO_CRF_LIST_Item = new SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem(remoteHandle, context);
      AV35W_TAM07_USER_ID = "" ;
      AV36W_TAM07_USER_NM = "" ;
      AV31W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV16DATA_DM_ARRIVAL = "" ;
      AV17DATA_INPUT_END = "" ;
      AV20DATA_TAM07_USER_NM = "" ;
      AV24DATA_TBT11_UPLOAD_DATETIME_VC = "" ;
      AV19DATA_SIGNATURE_USER_NM = "" ;
      AV23DATA_TBT11_UPD_RIYU = "" ;
      AV18DATA_SIGNATURE = "" ;
      AV22DATA_TBT11_SIGNATURE_DATETIME_VC = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      P007J3_A369TBM21_DEL_FLG = new String[] {""} ;
      P007J3_n369TBM21_DEL_FLG = new boolean[] {false} ;
      P007J3_A63TBM21_STUDY_ID = new long[1] ;
      P007J3_A367TBM21_STUDY_NM = new String[] {""} ;
      P007J3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      A369TBM21_DEL_FLG = "" ;
      A367TBM21_STUDY_NM = "" ;
      P007J4_A397TBM31_DEL_FLG = new String[] {""} ;
      P007J4_n397TBM31_DEL_FLG = new boolean[] {false} ;
      P007J4_A69TBM31_CRF_ID = new short[1] ;
      P007J4_A68TBM31_STUDY_ID = new long[1] ;
      P007J4_A393TBM31_CRF_NM = new String[] {""} ;
      P007J4_n393TBM31_CRF_NM = new boolean[] {false} ;
      P007J4_A642TBM31_CRF_SNM = new String[] {""} ;
      P007J4_n642TBM31_CRF_SNM = new boolean[] {false} ;
      A397TBM31_DEL_FLG = "" ;
      A393TBM31_CRF_NM = "" ;
      A642TBM31_CRF_SNM = "" ;
      AV9D_CRF_SNM = "" ;
      P007J5_A947TBM44_CRF_EDA_NO = new byte[1] ;
      P007J5_A946TBM44_CRF_ID = new short[1] ;
      P007J5_A945TBM44_STUDY_ID = new long[1] ;
      P007J5_A948TBM44_VISIT_NO = new int[1] ;
      P007J5_n948TBM44_VISIT_NO = new boolean[] {false} ;
      P007J6_A441TBT01_DEL_FLG = new String[] {""} ;
      P007J6_n441TBT01_DEL_FLG = new boolean[] {false} ;
      P007J6_A88TBT01_SUBJECT_ID = new int[1] ;
      P007J6_A87TBT01_STUDY_ID = new long[1] ;
      P007J6_A698TBT01_SITE_ID = new String[] {""} ;
      P007J6_n698TBT01_SITE_ID = new boolean[] {false} ;
      A441TBT01_DEL_FLG = "" ;
      A698TBT01_SITE_ID = "" ;
      AV34W_SITE_ID = "" ;
      P007J7_A325TAM08_DEL_FLG = new String[] {""} ;
      P007J7_n325TAM08_DEL_FLG = new boolean[] {false} ;
      P007J7_A57TAM08_SITE_ID = new String[] {""} ;
      P007J7_A319TAM08_SITE_NM = new String[] {""} ;
      P007J7_n319TAM08_SITE_NM = new boolean[] {false} ;
      A325TAM08_DEL_FLG = "" ;
      A57TAM08_SITE_ID = "" ;
      A319TAM08_SITE_NM = "" ;
      P007J8_A55TAM07_USER_ID = new String[] {""} ;
      P007J8_A205TAM07_USER_NM = new String[] {""} ;
      P007J8_n205TAM07_USER_NM = new boolean[] {false} ;
      A55TAM07_USER_ID = "" ;
      A205TAM07_USER_NM = "" ;
      AV49Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab720_rp02_rekiinfo_crf_pdf__default(),
         new Object[] {
             new Object[] {
            P007J2_A92TBT11_STUDY_ID, P007J2_A93TBT11_SUBJECT_ID, P007J2_A94TBT11_CRF_ID, P007J2_A936TBT11_CRF_EDA_NO, P007J2_A457TBT11_DEL_FLG, P007J2_n457TBT11_DEL_FLG, P007J2_A670TBT11_DM_ARRIVAL_DATETIME, P007J2_n670TBT11_DM_ARRIVAL_DATETIME, P007J2_A669TBT11_DM_ARRIVAL_FLG, P007J2_n669TBT11_DM_ARRIVAL_FLG,
            P007J2_A993TBT11_SIGNATURE_FLG, P007J2_n993TBT11_SIGNATURE_FLG, P007J2_A675TBT11_INPUT_END_FLG, P007J2_n675TBT11_INPUT_END_FLG, P007J2_A667TBT11_UPLOAD_USER_ID, P007J2_n667TBT11_UPLOAD_USER_ID, P007J2_A666TBT11_UPLOAD_DATETIME, P007J2_n666TBT11_UPLOAD_DATETIME, P007J2_A995TBT11_SIGNATURE_USER_ID, P007J2_n995TBT11_SIGNATURE_USER_ID,
            P007J2_A994TBT11_SIGNATURE_DATETIME, P007J2_n994TBT11_SIGNATURE_DATETIME, P007J2_A891TBT11_UPD_RIYU, P007J2_n891TBT11_UPD_RIYU, P007J2_A95TBT11_CRF_VERSION
            }
            , new Object[] {
            P007J3_A369TBM21_DEL_FLG, P007J3_n369TBM21_DEL_FLG, P007J3_A63TBM21_STUDY_ID, P007J3_A367TBM21_STUDY_NM, P007J3_n367TBM21_STUDY_NM
            }
            , new Object[] {
            P007J4_A397TBM31_DEL_FLG, P007J4_n397TBM31_DEL_FLG, P007J4_A69TBM31_CRF_ID, P007J4_A68TBM31_STUDY_ID, P007J4_A393TBM31_CRF_NM, P007J4_n393TBM31_CRF_NM, P007J4_A642TBM31_CRF_SNM, P007J4_n642TBM31_CRF_SNM
            }
            , new Object[] {
            P007J5_A947TBM44_CRF_EDA_NO, P007J5_A946TBM44_CRF_ID, P007J5_A945TBM44_STUDY_ID, P007J5_A948TBM44_VISIT_NO, P007J5_n948TBM44_VISIT_NO
            }
            , new Object[] {
            P007J6_A441TBT01_DEL_FLG, P007J6_n441TBT01_DEL_FLG, P007J6_A88TBT01_SUBJECT_ID, P007J6_A87TBT01_STUDY_ID, P007J6_A698TBT01_SITE_ID, P007J6_n698TBT01_SITE_ID
            }
            , new Object[] {
            P007J7_A325TAM08_DEL_FLG, P007J7_n325TAM08_DEL_FLG, P007J7_A57TAM08_SITE_ID, P007J7_A319TAM08_SITE_NM, P007J7_n319TAM08_SITE_NM
            }
            , new Object[] {
            P007J8_A55TAM07_USER_ID, P007J8_A205TAM07_USER_NM, P007J8_n205TAM07_USER_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV49Pgmname = "AB720_RP02_REKIINFO_CRF_PDF" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV49Pgmname = "AB720_RP02_REKIINFO_CRF_PDF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV25P_CRF_EDA_NO ;
   private byte A936TBT11_CRF_EDA_NO ;
   private byte A947TBM44_CRF_EDA_NO ;
   private short AV26P_CRF_ID ;
   private short A94TBT11_CRF_ID ;
   private short A95TBT11_CRF_VERSION ;
   private short AV37W_TBT11_CRF_VERSION ;
   private short AV21DATA_TBT11_CRF_VERSION ;
   private short AV11D_REC_CNT ;
   private short A69TBM31_CRF_ID ;
   private short A946TBM44_CRF_ID ;
   private short Gx_err ;
   private int AV28P_SUBJECT_ID ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int Gx_OldLine ;
   private int AV15D_VISIT_NO ;
   private int AV14D_SUBJECT_ID ;
   private int A93TBT11_SUBJECT_ID ;
   private int AV41GXV1 ;
   private int AV42GXV2 ;
   private int A948TBM44_VISIT_NO ;
   private int A88TBT01_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV27P_STUDY_ID ;
   private long A92TBT11_STUDY_ID ;
   private long A63TBM21_STUDY_ID ;
   private long A68TBM31_STUDY_ID ;
   private long A945TBM44_STUDY_ID ;
   private long A87TBT01_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV49Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private java.util.Date A670TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A666TBT11_UPLOAD_DATETIME ;
   private java.util.Date A994TBT11_SIGNATURE_DATETIME ;
   private java.util.Date AV31W_DATETIME ;
   private boolean returnInSub ;
   private boolean n457TBT11_DEL_FLG ;
   private boolean n670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n669TBT11_DM_ARRIVAL_FLG ;
   private boolean n993TBT11_SIGNATURE_FLG ;
   private boolean n675TBT11_INPUT_END_FLG ;
   private boolean n667TBT11_UPLOAD_USER_ID ;
   private boolean n666TBT11_UPLOAD_DATETIME ;
   private boolean n995TBT11_SIGNATURE_USER_ID ;
   private boolean n994TBT11_SIGNATURE_DATETIME ;
   private boolean n891TBT11_UPD_RIYU ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n948TBM44_VISIT_NO ;
   private boolean n441TBT01_DEL_FLG ;
   private boolean n698TBT01_SITE_ID ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n205TAM07_USER_NM ;
   private String AV32W_OUT_FILE_NM ;
   private String AV10D_DATETIME_VC ;
   private String AV13D_STUDY_NM ;
   private String AV8D_CRF_NM ;
   private String AV12D_SITE_NM ;
   private String A457TBT11_DEL_FLG ;
   private String A669TBT11_DM_ARRIVAL_FLG ;
   private String A993TBT11_SIGNATURE_FLG ;
   private String A675TBT11_INPUT_END_FLG ;
   private String A667TBT11_UPLOAD_USER_ID ;
   private String A995TBT11_SIGNATURE_USER_ID ;
   private String A891TBT11_UPD_RIYU ;
   private String AV35W_TAM07_USER_ID ;
   private String AV36W_TAM07_USER_NM ;
   private String AV16DATA_DM_ARRIVAL ;
   private String AV17DATA_INPUT_END ;
   private String AV20DATA_TAM07_USER_NM ;
   private String AV24DATA_TBT11_UPLOAD_DATETIME_VC ;
   private String AV19DATA_SIGNATURE_USER_NM ;
   private String AV23DATA_TBT11_UPD_RIYU ;
   private String AV18DATA_SIGNATURE ;
   private String AV22DATA_TBT11_SIGNATURE_DATETIME_VC ;
   private String A369TBM21_DEL_FLG ;
   private String A367TBM21_STUDY_NM ;
   private String A397TBM31_DEL_FLG ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String AV9D_CRF_SNM ;
   private String A441TBT01_DEL_FLG ;
   private String A698TBT01_SITE_ID ;
   private String AV34W_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private IDataStoreProvider pr_default ;
   private long[] P007J2_A92TBT11_STUDY_ID ;
   private int[] P007J2_A93TBT11_SUBJECT_ID ;
   private short[] P007J2_A94TBT11_CRF_ID ;
   private byte[] P007J2_A936TBT11_CRF_EDA_NO ;
   private String[] P007J2_A457TBT11_DEL_FLG ;
   private boolean[] P007J2_n457TBT11_DEL_FLG ;
   private java.util.Date[] P007J2_A670TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] P007J2_n670TBT11_DM_ARRIVAL_DATETIME ;
   private String[] P007J2_A669TBT11_DM_ARRIVAL_FLG ;
   private boolean[] P007J2_n669TBT11_DM_ARRIVAL_FLG ;
   private String[] P007J2_A993TBT11_SIGNATURE_FLG ;
   private boolean[] P007J2_n993TBT11_SIGNATURE_FLG ;
   private String[] P007J2_A675TBT11_INPUT_END_FLG ;
   private boolean[] P007J2_n675TBT11_INPUT_END_FLG ;
   private String[] P007J2_A667TBT11_UPLOAD_USER_ID ;
   private boolean[] P007J2_n667TBT11_UPLOAD_USER_ID ;
   private java.util.Date[] P007J2_A666TBT11_UPLOAD_DATETIME ;
   private boolean[] P007J2_n666TBT11_UPLOAD_DATETIME ;
   private String[] P007J2_A995TBT11_SIGNATURE_USER_ID ;
   private boolean[] P007J2_n995TBT11_SIGNATURE_USER_ID ;
   private java.util.Date[] P007J2_A994TBT11_SIGNATURE_DATETIME ;
   private boolean[] P007J2_n994TBT11_SIGNATURE_DATETIME ;
   private String[] P007J2_A891TBT11_UPD_RIYU ;
   private boolean[] P007J2_n891TBT11_UPD_RIYU ;
   private short[] P007J2_A95TBT11_CRF_VERSION ;
   private String[] P007J3_A369TBM21_DEL_FLG ;
   private boolean[] P007J3_n369TBM21_DEL_FLG ;
   private long[] P007J3_A63TBM21_STUDY_ID ;
   private String[] P007J3_A367TBM21_STUDY_NM ;
   private boolean[] P007J3_n367TBM21_STUDY_NM ;
   private String[] P007J4_A397TBM31_DEL_FLG ;
   private boolean[] P007J4_n397TBM31_DEL_FLG ;
   private short[] P007J4_A69TBM31_CRF_ID ;
   private long[] P007J4_A68TBM31_STUDY_ID ;
   private String[] P007J4_A393TBM31_CRF_NM ;
   private boolean[] P007J4_n393TBM31_CRF_NM ;
   private String[] P007J4_A642TBM31_CRF_SNM ;
   private boolean[] P007J4_n642TBM31_CRF_SNM ;
   private byte[] P007J5_A947TBM44_CRF_EDA_NO ;
   private short[] P007J5_A946TBM44_CRF_ID ;
   private long[] P007J5_A945TBM44_STUDY_ID ;
   private int[] P007J5_A948TBM44_VISIT_NO ;
   private boolean[] P007J5_n948TBM44_VISIT_NO ;
   private String[] P007J6_A441TBT01_DEL_FLG ;
   private boolean[] P007J6_n441TBT01_DEL_FLG ;
   private int[] P007J6_A88TBT01_SUBJECT_ID ;
   private long[] P007J6_A87TBT01_STUDY_ID ;
   private String[] P007J6_A698TBT01_SITE_ID ;
   private boolean[] P007J6_n698TBT01_SITE_ID ;
   private String[] P007J7_A325TAM08_DEL_FLG ;
   private boolean[] P007J7_n325TAM08_DEL_FLG ;
   private String[] P007J7_A57TAM08_SITE_ID ;
   private String[] P007J7_A319TAM08_SITE_NM ;
   private boolean[] P007J7_n319TAM08_SITE_NM ;
   private String[] P007J8_A55TAM07_USER_ID ;
   private String[] P007J8_A205TAM07_USER_NM ;
   private boolean[] P007J8_n205TAM07_USER_NM ;
   private GxObjectCollection AV29W_B717_SD01_REKIINFO_CRF_LIST ;
   private SdtB717_SD01_REKIINFO_CRF_LIST_B717_SD01_REKIINFO_CRF_LISTItem AV30W_B717_SD01_REKIINFO_CRF_LIST_Item ;
}

final  class ab720_rp02_rekiinfo_crf_pdf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007J2", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_EDA_NO`, `TBT11_DEL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_SIGNATURE_FLG`, `TBT11_INPUT_END_FLG`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_DATETIME`, `TBT11_SIGNATURE_USER_ID`, `TBT11_SIGNATURE_DATETIME`, `TBT11_UPD_RIYU`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE (`TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_CRF_ID` = ?) AND (Not (`TBT11_DM_ARRIVAL_DATETIME` = '1000-01-01')) AND (`TBT11_CRF_EDA_NO` = ?) AND (`TBT11_DEL_FLG` = '0') ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` DESC ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P007J3", "SELECT `TBM21_DEL_FLG`, `TBM21_STUDY_ID`, `TBM21_STUDY_NM` FROM `TBM21_STUDY` WHERE (`TBM21_STUDY_ID` = ?) AND (`TBM21_DEL_FLG` = '0') ORDER BY `TBM21_STUDY_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007J4", "SELECT `TBM31_DEL_FLG`, `TBM31_CRF_ID`, `TBM31_STUDY_ID`, `TBM31_CRF_NM`, `TBM31_CRF_SNM` FROM `TBM31_CRF` WHERE (`TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` = ?) AND (`TBM31_DEL_FLG` = '0') ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007J5", "SELECT `TBM44_CRF_EDA_NO`, `TBM44_CRF_ID`, `TBM44_STUDY_ID`, `TBM44_VISIT_NO` FROM `TBM44_CRF_VISIT` WHERE `TBM44_STUDY_ID` = ? and `TBM44_CRF_ID` = ? and `TBM44_CRF_EDA_NO` = ? ORDER BY `TBM44_STUDY_ID`, `TBM44_CRF_ID`, `TBM44_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007J6", "SELECT `TBT01_DEL_FLG`, `TBT01_SUBJECT_ID`, `TBT01_STUDY_ID`, `TBT01_SITE_ID` FROM `TBT01_SUBJECT` WHERE (`TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?) AND (`TBT01_DEL_FLG` = '0') ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007J7", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID`, `TAM08_SITE_NM` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P007J8", "SELECT `TAM07_USER_ID`, `TAM07_USER_NM` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ORDER BY `TAM07_USER_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((short[]) buf[24])[0] = rslt.getShort(15) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 3 :
               ((byte[]) buf[0])[0] = rslt.getByte(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2) ;
               ((long[]) buf[3])[0] = rslt.getLong(3) ;
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
      }
   }

}

