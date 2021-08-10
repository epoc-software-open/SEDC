/*
               File: B720_RP01_PDF
        Description: PDFo—Í
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.96
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

public final  class ab720_rp01_pdf extends GXReport
{
   public static void main( String args[] )
   {
      Application.init(GXcfg.class);
      ab720_rp01_pdf pgm = new ab720_rp01_pdf (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
   }

   public void executeCmdLine( String args[] )
   {
      String aP0 = "";
      String aP1 = "";
      String aP2 = "";
      int aP3 = 0;
      String aP4 = "";
      GxObjectCollection aP5 = new GxObjectCollection();
      GxObjectCollection aP6 = new GxObjectCollection();
      String[] aP7 = new String[] {""};

      try
      {
         aP0 = (String) args[0];
         aP1 = (String) args[1];
         aP2 = (String) args[2];
         aP3 = (int) GXutil.val( args[3], ".");
         aP4 = (String) args[4];
         aP7[0] = (String) args[7];
      }
      catch ( ArrayIndexOutOfBoundsException e )
      {
      }

      execute(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   public ab720_rp01_pdf( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ab720_rp01_pdf.class ), "" );
   }

   public ab720_rp01_pdf( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             GxObjectCollection aP5 ,
                             GxObjectCollection aP6 )
   {
      ab720_rp01_pdf.this.AV41W_OUT_FILE_NM = aP0;
      ab720_rp01_pdf.this.AV21P_STUDY_NM = aP1;
      ab720_rp01_pdf.this.AV19P_CRF_NM = aP2;
      ab720_rp01_pdf.this.AV22P_SUBJECT_ID = aP3;
      ab720_rp01_pdf.this.AV20P_SIGNER_INFO = aP4;
      ab720_rp01_pdf.this.AV8B720_SD01_DESIGN_C = aP5;
      ab720_rp01_pdf.this.AV68B720_SD04_MARK_DISP_C = aP6;
      ab720_rp01_pdf.this.aP7 = aP7;
      ab720_rp01_pdf.this.aP7 = new String[] {""};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        int aP3 ,
                        String aP4 ,
                        GxObjectCollection aP5 ,
                        GxObjectCollection aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             int aP3 ,
                             String aP4 ,
                             GxObjectCollection aP5 ,
                             GxObjectCollection aP6 ,
                             String[] aP7 )
   {
      ab720_rp01_pdf.this.AV41W_OUT_FILE_NM = aP0;
      ab720_rp01_pdf.this.AV21P_STUDY_NM = aP1;
      ab720_rp01_pdf.this.AV19P_CRF_NM = aP2;
      ab720_rp01_pdf.this.AV22P_SUBJECT_ID = aP3;
      ab720_rp01_pdf.this.AV20P_SIGNER_INFO = aP4;
      ab720_rp01_pdf.this.AV8B720_SD01_DESIGN_C = aP5;
      ab720_rp01_pdf.this.AV68B720_SD04_MARK_DISP_C = aP6;
      ab720_rp01_pdf.this.aP7 = aP7;
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
      getPrinter().GxSetDocName(AV41W_OUT_FILE_NM) ;
      getPrinter().GxSetDocFormat("PDF") ;
      try
      {
         Gx_out = "FIL" ;
         if (!initPrinter (Gx_out, gxXPage, gxYPage, "GXPRN.INI", "", "", 2, 1, 256, 21557, 14688, 0, 1, 1, 0, 1, 1) )
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
         /* Execute user subroutine: S241 */
         S241 ();
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
         AV10C_ADD_HEIGHT_P1 = (short)(28) ;
         AV11C_ADD_HEIGHT_P2 = (short)(23) ;
         GXv_char1[0] = AV39W_OUT_CHAR1 ;
         GXv_char2[0] = AV40W_OUT_CHAR2 ;
         new a810_pc02_convert_cut_byte(remoteHandle, context).execute( 87, AV21P_STUDY_NM, GXv_char1, GXv_char2) ;
         ab720_rp01_pdf.this.AV39W_OUT_CHAR1 = GXv_char1[0] ;
         ab720_rp01_pdf.this.AV40W_OUT_CHAR2 = GXv_char2[0] ;
         AV14D_OUT_STUDY_NM1 = AV39W_OUT_CHAR1 ;
         AV15D_OUT_STUDY_NM2 = AV40W_OUT_CHAR2 ;
         AV12D_OUT_CRF_NM = AV19P_CRF_NM ;
         AV16D_OUT_SUJECT_ID = GXutil.trim( GXutil.str( AV22P_SUBJECT_ID, 6, 0)) ;
         if ( AV8B720_SD01_DESIGN_C.size() > 0 )
         {
            AV28W_CNT = (short)(AV8B720_SD01_DESIGN_C.size()) ;
            AV44W_PAGE_NO_MAX = ((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV28W_CNT)).getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no() ;
         }
         else
         {
            AV44W_PAGE_NO_MAX = (short)(1) ;
         }
         AV42W_PAGE_CNT = (short)(1) ;
         while ( AV42W_PAGE_CNT <= AV44W_PAGE_NO_MAX )
         {
            /* User Code */
             h720( false, 1480) ;
            /* User Code */
             getPrinter().GxAttris("‚l‚r –¾’©", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            /* User Code */
             getPrinter().GxDrawText("ŽŽŒ±–¼F", 8, Gx_line+1, 53, Gx_line+14, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText("CRF–¼F", 602, Gx_line+1, 646, Gx_line+14, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText("Š³ŽÒNoF", 905, Gx_line+1, 952, Gx_line+14, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14D_OUT_STUDY_NM1, "")), 55, Gx_line+0, 573, Gx_line+14, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15D_OUT_STUDY_NM2, "")), 55, Gx_line+14, 573, Gx_line+28, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12D_OUT_CRF_NM, "")), 645, Gx_line+0, 892, Gx_line+14, 0, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16D_OUT_SUJECT_ID, "")), 952, Gx_line+0, 1005, Gx_line+14, 0+256, 0, 0, 0) ;
            /* User Code */
             getPrinter().GxDrawRect(0, Gx_line+30, 1000, Gx_line+1447, 3, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            if ( ( AV42W_PAGE_CNT == 1 ) && ! (GXutil.strcmp("", AV20P_SIGNER_INFO)==0) )
            {
               if ( AV68B720_SD04_MARK_DISP_C.size() == 0 )
               {
                  /* User Code */
                   getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "be5af9bd-ff16-4172-af72-79e2fb082f6b", "", context.getHttpContext().getTheme( )), 682, Gx_line+38, 727, Gx_line+55) ;
                  /* User Code */
                   getPrinter().GxAttris("‚l‚r –¾’©", 10, false, false, false, false, 0, 17, 138, 37, 0, 255, 255, 255) ;
                  /* User Code */
                   getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20P_SIGNER_INFO, "")), 732, Gx_line+40, 997, Gx_line+55, 0, 0, 0, 0) ;
               }
            }
            /* User Code */
             getPrinter().GxAttris("‚l‚r –¾’©", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            AV31W_FONT_SIZE_SV = (byte)(0) ;
            AV30W_FONT_COLOR_DIV_SV = 0 ;
            AV72GXV1 = 1 ;
            while ( AV72GXV1 <= AV8B720_SD01_DESIGN_C.size() )
            {
               AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV72GXV1));
               AV50W_TBM32_LOCATION_X = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x() ;
               AV52W_TBM32_LOCATION_Y = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+((AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no()==1) ? AV10C_ADD_HEIGHT_P1 : AV11C_ADD_HEIGHT_P2)) ;
               AV51W_TBM32_LOCATION_X2 = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2() ;
               AV53W_TBM32_LOCATION_Y2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2()+((AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no()==1) ? AV10C_ADD_HEIGHT_P1 : AV11C_ADD_HEIGHT_P2)) ;
               if ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no() == AV42W_PAGE_CNT )
               {
                  if ( ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size() > 0 ) && ( ( AV31W_FONT_SIZE_SV != AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size() ) || ( AV30W_FONT_COLOR_DIV_SV != AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div() ) ) )
                  {
                     AV31W_FONT_SIZE_SV = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size() ;
                     AV30W_FONT_COLOR_DIV_SV = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div() ;
                     AV18OUT_FONT_SIZE = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(AV31W_FONT_SIZE_SV).multiply(DecimalUtil.doubleToDec(0.72,4,2)), 0))) ;
                     AV29W_COLOR_DIV = AV30W_FONT_COLOR_DIV_SV ;
                     /* Execute user subroutine: S131 */
                     S131 ();
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
                     /* User Code */
                      getPrinter().GxAttris("‚l‚r –¾’©", AV18OUT_FONT_SIZE, false, false, false, false, 0, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0, 255, 255, 255) ;
                  }
                  if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div(), "center") == 0 )
                  {
                     AV54W_TEXT_ALIGN = (byte)(1) ;
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div(), "right") == 0 )
                  {
                     AV54W_TEXT_ALIGN = (byte)(2) ;
                  }
                  else
                  {
                     AV54W_TEXT_ALIGN = (byte)(0) ;
                  }
                  if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Label") == 0 )
                  {
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Line") == 0 )
                  {
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Rect") == 0 )
                  {
                     /* Execute user subroutine: S151 */
                     S151 ();
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Paren") == 0 )
                  {
                     /* Execute user subroutine: S161 */
                     S161 ();
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "TextArea") == 0 )
                  {
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "NumericTextBox") == 0 )
                  {
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox") == 0 )
                  {
                     /* Execute user subroutine: S191 */
                     S191 ();
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                  {
                     /* Execute user subroutine: S201 */
                     S201 ();
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox") == 0 )
                  {
                     /* Execute user subroutine: S211 */
                     S211 ();
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
                  }
                  else if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Image") == 0 )
                  {
                     /* Execute user subroutine: S221 */
                     S221 ();
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
                  }
               }
               AV72GXV1 = (int)(AV72GXV1+1) ;
            }
            AV73GXV2 = 1 ;
            while ( AV73GXV2 <= AV68B720_SD04_MARK_DISP_C.size() )
            {
               AV69B720_SD04_MARK_DISP_I = (SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem)((SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem)AV68B720_SD04_MARK_DISP_C.elementAt(-1+AV73GXV2));
               if ( AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no() == AV42W_PAGE_CNT )
               {
                  /* Execute user subroutine: S231 */
                  S231 ();
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
               }
               AV73GXV2 = (int)(AV73GXV2+1) ;
            }
            h720( false, 1480) ;
            getPrinter().GxDrawRect(6, Gx_line+30, 1004, Gx_line+1445, 3, 0, 0, 0, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "be5af9bd-ff16-4172-af72-79e2fb082f6b", "", context.getHttpContext().getTheme( )), 692, Gx_line+50, 737, Gx_line+67) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "9c0d87c6-eab3-4c6e-b3a4-22cf0af54226", "", context.getHttpContext().getTheme( )), 583, Gx_line+117, 598, Gx_line+132) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "1044b82e-a7b5-45bf-a2c7-84f568526d28", "", context.getHttpContext().getTheme( )), 567, Gx_line+117, 582, Gx_line+133) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "d3d107bc-3668-4b9f-b642-6d49c285f059", "", context.getHttpContext().getTheme( )), 300, Gx_line+117, 316, Gx_line+132) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "71dc9ea9-c357-45fc-9d08-9dba9b3359af", "", context.getHttpContext().getTheme( )), 317, Gx_line+117, 332, Gx_line+132) ;
            getPrinter().GxDrawLine(100, Gx_line+183, 200, Gx_line+183, 1, 255, 0, 0, 0) ;
            getPrinter().GxDrawLine(100, Gx_line+184, 200, Gx_line+184, 2, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "14aabfcf-2d92-40ff-83c7-b4f2f3fcb7e7", "", context.getHttpContext().getTheme( )), 625, Gx_line+150, 646, Gx_line+171) ;
            getPrinter().GxAttris("‚l‚r ‚oƒSƒVƒbƒN", 9, false, false, false, false, 0, 0, 0, 255, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("ŽŽŒ±–¼F", 8, Gx_line+0, 53, Gx_line+13, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("CRF–¼F", 600, Gx_line+0, 644, Gx_line+13, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("Š³ŽÒNoF", 905, Gx_line+0, 952, Gx_line+13, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV16D_OUT_SUJECT_ID, "")), 952, Gx_line+0, 1005, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV12D_OUT_CRF_NM, "")), 642, Gx_line+0, 892, Gx_line+14, 0, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV14D_OUT_STUDY_NM1, "")), 50, Gx_line+0, 572, Gx_line+14, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV15D_OUT_STUDY_NM2, "")), 51, Gx_line+14, 573, Gx_line+28, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("‚l‚r ‚oƒSƒVƒbƒN", 10, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText("ƒ`ƒFƒbƒNƒ{ƒbƒNON", 600, Gx_line+117, 694, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxDrawText("ƒ‰ƒWƒIƒ{ƒ^ƒ“OFF", 333, Gx_line+117, 428, Gx_line+131, 0+256, 0, 0, 0) ;
            getPrinter().GxAttris("‚l‚r –¾’©", 11, false, false, false, false, 0, 0, 0, 0, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), 17, Gx_line+50, 917, Gx_line+67, 0, 0, 0, 0) ;
            getPrinter().GxAttris("‚l‚r –¾’©", 11, false, false, false, false, 0, 17, 138, 37, 0, 255, 255, 255) ;
            getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV20P_SIGNER_INFO, "")), 742, Gx_line+50, 997, Gx_line+67, 0, 0, 0, 0) ;
            getPrinter().GxDrawBitMap(AV13D_OUT_IMAGE, 17, Gx_line+83, 60, Gx_line+100) ;
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(Gx_line+1480) ;
            /* Eject command */
            Gx_OldLine = Gx_line ;
            Gx_line = (int)(P_lines+1) ;
            AV42W_PAGE_CNT = (short)(AV42W_PAGE_CNT+1) ;
         }
         /* Print footer for last page */
         ToSkip = (int)(P_lines+1) ;
         h720( true, 0) ;
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
      /* 'SUB_PRINT_LABEL' Routine */
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
   }

   public void S121( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_LINE' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      AV29W_COLOR_DIV = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div() ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV32W_LINE_SIZE = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div() ;
      if ( AV52W_TBM32_LOCATION_Y != AV53W_TBM32_LOCATION_Y2 )
      {
         AV36W_LY = AV53W_TBM32_LOCATION_Y2 ;
         AV37W_LY2 = AV52W_TBM32_LOCATION_Y ;
      }
      if ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle() > 0 )
      {
         AV60W_ANGLE = (int)(360-AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle()) ;
         if ( AV50W_TBM32_LOCATION_X < AV51W_TBM32_LOCATION_X2 )
         {
            AV65W_WIDTH = (short)(AV35W_LX2-AV34W_LX) ;
            AV66W_HEIGHT = (short)(AV37W_LY2-AV36W_LY) ;
            /* Execute user subroutine: S141 */
            S141 ();
            if (returnInSub) return;
            AV35W_LX2 = (short)(AV34W_LX+AV62W_ANGLE_X) ;
            AV37W_LY2 = (short)(AV36W_LY+AV63W_ANGLE_Y) ;
         }
         else
         {
            AV65W_WIDTH = (short)(AV34W_LX-AV35W_LX2) ;
            AV66W_HEIGHT = (short)(AV36W_LY-AV37W_LY2) ;
            /* Execute user subroutine: S141 */
            S141 ();
            if (returnInSub) return;
            AV35W_LX2 = (short)(AV34W_LX-AV62W_ANGLE_X) ;
            AV37W_LY2 = (short)(AV37W_LY2+AV63W_ANGLE_Y) ;
         }
         if ( AV37W_LY2 > AV36W_LY )
         {
            AV64W_RES = DecimalUtil.doubleToDec(AV36W_LY) ;
            AV36W_LY = AV37W_LY2 ;
            AV37W_LY2 = (short)(DecimalUtil.decToDouble(AV64W_RES)) ;
         }
      }
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div(), "1") == 0 )
      {
         if ( AV50W_TBM32_LOCATION_X < AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = (short)(AV34W_LX+AV32W_LINE_SIZE) ;
         }
         else if ( AV50W_TBM32_LOCATION_X > AV51W_TBM32_LOCATION_X2 )
         {
            AV35W_LX2 = (short)(AV35W_LX2+AV32W_LINE_SIZE) ;
         }
         else if ( AV52W_TBM32_LOCATION_Y < AV53W_TBM32_LOCATION_Y2 )
         {
            AV36W_LY = (short)(AV36W_LY+AV32W_LINE_SIZE) ;
         }
         else if ( AV52W_TBM32_LOCATION_Y > AV53W_TBM32_LOCATION_Y2 )
         {
            AV37W_LY2 = (short)(AV37W_LY2+AV32W_LINE_SIZE) ;
         }
      }
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div(), "1") == 0 )
      {
         if ( AV50W_TBM32_LOCATION_X < AV51W_TBM32_LOCATION_X2 )
         {
            AV35W_LX2 = (short)(AV35W_LX2-AV32W_LINE_SIZE) ;
         }
         else if ( AV50W_TBM32_LOCATION_X > AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = (short)(AV34W_LX-AV32W_LINE_SIZE) ;
         }
         else if ( AV52W_TBM32_LOCATION_Y < AV53W_TBM32_LOCATION_Y2 )
         {
            AV37W_LY2 = (short)(AV37W_LY2-AV32W_LINE_SIZE) ;
         }
         else if ( AV52W_TBM32_LOCATION_Y > AV53W_TBM32_LOCATION_Y2 )
         {
            AV36W_LY = (short)(AV36W_LY-AV32W_LINE_SIZE) ;
         }
      }
      /* User Code */
       getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, AV32W_LINE_SIZE, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div(), "1") == 0 )
      {
         AV23W_ARROW_SIZE = (short)(AV32W_LINE_SIZE+4) ;
         if ( AV50W_TBM32_LOCATION_X < AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = AV50W_TBM32_LOCATION_X ;
            AV35W_LX2 = (short)(AV50W_TBM32_LOCATION_X+AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV52W_TBM32_LOCATION_Y ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV50W_TBM32_LOCATION_X > AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = AV51W_TBM32_LOCATION_X2 ;
            AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2+AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV36W_LY = (short)(AV53W_TBM32_LOCATION_Y2+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV36W_LY = (short)(AV53W_TBM32_LOCATION_Y2-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV52W_TBM32_LOCATION_Y < AV53W_TBM32_LOCATION_Y2 )
         {
            AV36W_LY = AV52W_TBM32_LOCATION_Y ;
            AV35W_LX2 = AV50W_TBM32_LOCATION_X ;
            AV37W_LY2 = (short)(AV52W_TBM32_LOCATION_Y+AV23W_ARROW_SIZE) ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV34W_LX = (short)(AV50W_TBM32_LOCATION_X+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV34W_LX = (short)(AV50W_TBM32_LOCATION_X-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV52W_TBM32_LOCATION_Y > AV53W_TBM32_LOCATION_Y2 )
         {
            AV36W_LY = AV53W_TBM32_LOCATION_Y2 ;
            AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
            AV37W_LY2 = (short)(AV53W_TBM32_LOCATION_Y2+AV23W_ARROW_SIZE) ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV34W_LX = (short)(AV51W_TBM32_LOCATION_X2+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV34W_LX = (short)(AV51W_TBM32_LOCATION_X2-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
      }
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div(), "1") == 0 )
      {
         AV23W_ARROW_SIZE = (short)(AV32W_LINE_SIZE+4) ;
         if ( AV50W_TBM32_LOCATION_X < AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = AV51W_TBM32_LOCATION_X2 ;
            AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2-AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV36W_LY = (short)(AV53W_TBM32_LOCATION_Y2+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV36W_LY = (short)(AV53W_TBM32_LOCATION_Y2-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV50W_TBM32_LOCATION_X > AV51W_TBM32_LOCATION_X2 )
         {
            AV34W_LX = AV50W_TBM32_LOCATION_X ;
            AV35W_LX2 = (short)(AV50W_TBM32_LOCATION_X-AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV52W_TBM32_LOCATION_Y ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV52W_TBM32_LOCATION_Y < AV53W_TBM32_LOCATION_Y2 )
         {
            AV34W_LX = AV51W_TBM32_LOCATION_X2 ;
            AV36W_LY = (short)(AV53W_TBM32_LOCATION_Y2-AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else if ( AV52W_TBM32_LOCATION_Y > AV53W_TBM32_LOCATION_Y2 )
         {
            AV34W_LX = AV50W_TBM32_LOCATION_X ;
            AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y-AV23W_ARROW_SIZE) ;
            AV37W_LY2 = AV52W_TBM32_LOCATION_Y ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV23W_ARROW_SIZE )
            {
               AV35W_LX2 = (short)(AV50W_TBM32_LOCATION_X-AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV35W_LX2 = (short)(AV50W_TBM32_LOCATION_X+AV33W_LOOP_CNT) ;
               /* User Code */
                getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
      }
   }

   public void S141( ) throws ProcessInterruptedException
   {
      /* 'SUB_GET_ANGLE_LOCATION' Routine */
      AV61W_ANGLE_CALC.setExpression( "(a*cos(c))-(b*sin(c))" );
      AV61W_ANGLE_CALC.getVariables().set("a", GXutil.str( AV65W_WIDTH, 4, 0));
      AV61W_ANGLE_CALC.getVariables().set("b", GXutil.str( AV66W_HEIGHT, 4, 0));
      AV61W_ANGLE_CALC.getVariables().set("c", GXutil.str( AV60W_ANGLE, 5, 0));
      AV64W_RES = AV61W_ANGLE_CALC.evaluate() ;
      if ( AV61W_ANGLE_CALC.getErrCode() == 0 )
      {
         AV62W_ANGLE_X = (int)(DecimalUtil.decToDouble(AV64W_RES)) ;
      }
      AV61W_ANGLE_CALC.setExpression( "a*sin(c)+b*cos(c)" );
      AV61W_ANGLE_CALC.getVariables().set("a", GXutil.str( AV65W_WIDTH, 4, 0));
      AV61W_ANGLE_CALC.getVariables().set("b", GXutil.str( AV66W_HEIGHT, 4, 0));
      AV61W_ANGLE_CALC.getVariables().set("c", GXutil.str( AV60W_ANGLE, 5, 0));
      AV64W_RES = AV61W_ANGLE_CALC.evaluate() ;
      if ( AV61W_ANGLE_CALC.getErrCode() == 0 )
      {
         AV63W_ANGLE_Y = (int)(DecimalUtil.decToDouble(AV64W_RES)) ;
      }
   }

   public void S151( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_RECT' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      AV29W_COLOR_DIV = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div() ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV32W_LINE_SIZE = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div() ;
      /* User Code */
       getPrinter().GxDrawRect(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, AV32W_LINE_SIZE, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
   }

   public void S161( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_PAREN' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      AV29W_COLOR_DIV = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div() ;
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV32W_LINE_SIZE = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div() ;
      if ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle() == 0 )
      {
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV36W_LY, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV37W_LY2, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV34W_LX, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
      }
      else if ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle() == 180 )
      {
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV36W_LY, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV37W_LY2, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
         /* User Code */
          getPrinter().GxDrawLine(AV35W_LX2, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0) ;
      }
   }

   public void S171( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_TEXT' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawRect(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, 169, 169, 169, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV55W_TEXT_LX = (short)(AV34W_LX+3) ;
      AV57W_TEXT_LY = AV36W_LY ;
      AV56W_TEXT_LX2 = (short)(AV35W_LX2-3) ;
      AV58W_TEXT_LY2 = AV37W_LY2 ;
      if ( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows() == 1 )
      {
         /* User Code */
          getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV55W_TEXT_LX, AV57W_TEXT_LY, AV56W_TEXT_LX2, AV58W_TEXT_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
      }
      else
      {
         if ( GXutil.strSearch( AV17D_OUT_TEXT, GXutil.chr( (short)(10)), 1) > 0 )
         {
            AV58W_TEXT_LY2 = AV57W_TEXT_LY ;
            AV67W_TEXT_SPLIT = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV17D_OUT_TEXT,GXutil.chr( (short)(10)))) ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV67W_TEXT_SPLIT.size() )
            {
               AV39W_OUT_CHAR1 = (String)AV67W_TEXT_SPLIT.elementAt(-1+AV33W_LOOP_CNT) ;
               AV58W_TEXT_LY2 = (short)(AV58W_TEXT_LY2+32) ;
               /* User Code */
                getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39W_OUT_CHAR1, "")), AV55W_TEXT_LX, AV57W_TEXT_LY, AV56W_TEXT_LX2, AV58W_TEXT_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
               if ( AV33W_LOOP_CNT >= AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows() )
               {
                  if (true) break;
               }
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
         else
         {
            AV59W_LINE_LNG = (long)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec((AV56W_TEXT_LX2-AV55W_TEXT_LX)).divide(DecimalUtil.doubleToDec(6.4,3,1), 18, java.math.BigDecimal.ROUND_DOWN), 0))) ;
            AV58W_TEXT_LY2 = AV57W_TEXT_LY ;
            AV33W_LOOP_CNT = (short)(1) ;
            while ( AV33W_LOOP_CNT <= AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows() )
            {
               GXv_char2[0] = AV39W_OUT_CHAR1 ;
               GXv_char1[0] = AV40W_OUT_CHAR2 ;
               new a810_pc02_convert_cut_byte(remoteHandle, context).execute( (int)(AV59W_LINE_LNG), AV17D_OUT_TEXT, GXv_char2, GXv_char1) ;
               ab720_rp01_pdf.this.AV39W_OUT_CHAR1 = GXv_char2[0] ;
               ab720_rp01_pdf.this.AV40W_OUT_CHAR2 = GXv_char1[0] ;
               if ( (GXutil.strcmp("", AV39W_OUT_CHAR1)==0) )
               {
                  if (true) break;
               }
               else
               {
                  AV58W_TEXT_LY2 = (short)(AV58W_TEXT_LY2+32) ;
                  /* User Code */
                   getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV39W_OUT_CHAR1, "")), AV55W_TEXT_LX, AV57W_TEXT_LY, AV56W_TEXT_LX2, AV58W_TEXT_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
                  AV17D_OUT_TEXT = GXutil.strReplace( AV17D_OUT_TEXT, AV39W_OUT_CHAR1, "") ;
               }
               AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
            }
         }
      }
   }

   public void S181( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_NUMTEXT' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawRect(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, 169, 169, 169, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV55W_TEXT_LX = (short)(AV34W_LX+3) ;
      AV57W_TEXT_LY = AV36W_LY ;
      AV56W_TEXT_LX2 = (short)(AV35W_LX2-3) ;
      AV58W_TEXT_LY2 = AV37W_LY2 ;
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV55W_TEXT_LX, AV57W_TEXT_LY, AV56W_TEXT_LX2, AV58W_TEXT_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
   }

   public void S191( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_SELECT' Routine */
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawRect(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, 169, 169, 169, 0, 255, 255, 255, 0, 0, 0, 0, 0, 0, 0, 0) ;
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV55W_TEXT_LX = (short)(AV34W_LX+3) ;
      AV57W_TEXT_LY = AV36W_LY ;
      AV56W_TEXT_LX2 = (short)(AV35W_LX2-3) ;
      AV58W_TEXT_LY2 = AV37W_LY2 ;
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV55W_TEXT_LX, AV57W_TEXT_LY, AV56W_TEXT_LX2, AV58W_TEXT_LY2, AV54W_TEXT_ALIGN, 0, 0, 1);
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox") == 0 )
      {
         AV34W_LX = (short)(AV51W_TBM32_LOCATION_X2-8) ;
         AV36W_LY = (short)(AV52W_TBM32_LOCATION_Y+13) ;
         AV37W_LY2 = (short)(AV53W_TBM32_LOCATION_Y2-14) ;
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV34W_LX, AV37W_LY2, 1, 0, 0, 0, 0) ;
         AV37W_LY2 = (short)(AV53W_TBM32_LOCATION_Y2-13) ;
         AV33W_LOOP_CNT = (short)(1) ;
         while ( AV33W_LOOP_CNT <= 3 )
         {
            AV35W_LX2 = (short)(AV34W_LX-AV33W_LOOP_CNT) ;
            /* User Code */
             getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, 0, 0, 0, 0) ;
            AV35W_LX2 = (short)(AV34W_LX+AV33W_LOOP_CNT) ;
            /* User Code */
             getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 1, 0, 0, 0, 0) ;
            AV33W_LOOP_CNT = (short)(AV33W_LOOP_CNT+1) ;
         }
         AV34W_LX = (short)(AV51W_TBM32_LOCATION_X2-10) ;
         AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2-6) ;
         /* User Code */
          getPrinter().GxDrawLine(AV34W_LX, AV36W_LY, AV35W_LX2, AV36W_LY, 1, 0, 0, 0, 0) ;
      }
   }

   public void S201( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_RADIO' Routine */
      AV24W_BTN_LX = AV50W_TBM32_LOCATION_X ;
      AV26W_BTN_LY = (short)(AV52W_TBM32_LOCATION_Y+8) ;
      AV25W_BTN_LX2 = (short)(AV24W_BTN_LX+15) ;
      AV27W_BTN_LY2 = (short)(AV26W_BTN_LY+15) ;
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg(), "1") == 0 )
      {
         /* User Code */
          getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "d3d107bc-3668-4b9f-b642-6d49c285f059", "", context.getHttpContext().getTheme( )), AV24W_BTN_LX, AV26W_BTN_LY, AV25W_BTN_LX2, AV27W_BTN_LY2) ;
      }
      else
      {
         /* User Code */
          getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "71dc9ea9-c357-45fc-9d08-9dba9b3359af", "", context.getHttpContext().getTheme( )), AV24W_BTN_LX, AV26W_BTN_LY, AV25W_BTN_LX2, AV27W_BTN_LY2) ;
      }
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV34W_LX = (short)(AV50W_TBM32_LOCATION_X+18) ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2-18) ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 0, 0, 0, 1);
   }

   public void S211( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_CHECK' Routine */
      AV24W_BTN_LX = AV50W_TBM32_LOCATION_X ;
      AV26W_BTN_LY = (short)(AV52W_TBM32_LOCATION_Y+8) ;
      AV25W_BTN_LX2 = (short)(AV24W_BTN_LX+15) ;
      AV27W_BTN_LY2 = (short)(AV26W_BTN_LY+15) ;
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg(), "1") == 0 )
      {
         /* User Code */
          getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "9c0d87c6-eab3-4c6e-b3a4-22cf0af54226", "", context.getHttpContext().getTheme( )), AV24W_BTN_LX, AV26W_BTN_LY, AV25W_BTN_LX2, AV27W_BTN_LY2) ;
      }
      else
      {
         /* User Code */
          getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "1044b82e-a7b5-45bf-a2c7-84f568526d28", "", context.getHttpContext().getTheme( )), AV24W_BTN_LX, AV26W_BTN_LY, AV25W_BTN_LX2, AV27W_BTN_LY2) ;
      }
      AV17D_OUT_TEXT = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text() ;
      AV34W_LX = (short)(AV50W_TBM32_LOCATION_X+18) ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = (short)(AV51W_TBM32_LOCATION_X2-18) ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 0, 0, 0, 1);
   }

   public void S221( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_IMAGE' Routine */
      AV13D_OUT_IMAGE = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url() ;
      A40000D_OUT_IMAGE_GXI = GXDbFile.pathToUrl( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url(), context.getHttpContext()) ;
      AV34W_LX = AV50W_TBM32_LOCATION_X ;
      AV36W_LY = AV52W_TBM32_LOCATION_Y ;
      AV35W_LX2 = AV51W_TBM32_LOCATION_X2 ;
      AV37W_LY2 = AV53W_TBM32_LOCATION_Y2 ;
      /* User Code */
       getPrinter().GxDrawBitMap(AV13D_OUT_IMAGE, AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2) ;
   }

   public void S231( ) throws ProcessInterruptedException
   {
      /* 'SUB_PRINT_MARK' Routine */
      AV24W_BTN_LX = AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x() ;
      AV26W_BTN_LY = (short)(AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_y()+((AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Page_no()==1) ? AV10C_ADD_HEIGHT_P1 : AV11C_ADD_HEIGHT_P2)) ;
      AV25W_BTN_LX2 = (short)(AV24W_BTN_LX+21) ;
      AV27W_BTN_LY2 = (short)(AV26W_BTN_LY+21) ;
      /* User Code */
       getPrinter().GxDrawBitMap(context.getHttpContext().getImagePath( "14aabfcf-2d92-40ff-83c7-b4f2f3fcb7e7", "", context.getHttpContext().getTheme( )), AV24W_BTN_LX, AV26W_BTN_LY, AV25W_BTN_LX2, AV27W_BTN_LY2) ;
      if ( ! (GXutil.strcmp("", AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text())==0) )
      {
         AV18OUT_FONT_SIZE = (byte)(DecimalUtil.decToDouble(GXutil.roundDecimal( DecimalUtil.doubleToDec(14).multiply(DecimalUtil.doubleToDec(0.72,4,2)), 0))) ;
         AV48W_RGB_R = (short)(255) ;
         AV47W_RGB_G = (short)(140) ;
         AV46W_RGB_B = (short)(0) ;
         /* User Code */
          getPrinter().GxAttris("‚l‚r –¾’©", AV18OUT_FONT_SIZE, false, false, false, false, 0, AV48W_RGB_R, AV47W_RGB_G, AV46W_RGB_B, 0, 255, 255, 255) ;
         AV17D_OUT_TEXT = AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_text() ;
         AV34W_LX = (short)(AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x()+21) ;
         AV36W_LY = AV26W_BTN_LY ;
         AV35W_LX2 = AV69B720_SD04_MARK_DISP_I.getgxTv_SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem_Tbm32_location_x2() ;
         AV37W_LY2 = AV27W_BTN_LY2 ;
      }
      /* User Code */
       getPrinter().GxDrawText(GXutil.rtrim( localUtil.format( AV17D_OUT_TEXT, "")), AV34W_LX, AV36W_LY, AV35W_LX2, AV37W_LY2, 0, 0, 0, 1);
   }

   public void S131( ) throws ProcessInterruptedException
   {
      /* 'SUB_GET_RGB_COLOR' Routine */
      if ( AV29W_COLOR_DIV == 0 )
      {
         AV48W_RGB_R = (short)(0) ;
         AV47W_RGB_G = (short)(0) ;
         AV46W_RGB_B = (short)(0) ;
      }
      else if ( AV29W_COLOR_DIV == 16711680 )
      {
         AV48W_RGB_R = (short)(255) ;
         AV47W_RGB_G = (short)(0) ;
         AV46W_RGB_B = (short)(0) ;
      }
      else if ( AV29W_COLOR_DIV == 255 )
      {
         AV48W_RGB_R = (short)(0) ;
         AV47W_RGB_G = (short)(0) ;
         AV46W_RGB_B = (short)(255) ;
      }
      else if ( AV29W_COLOR_DIV == 16776960 )
      {
         AV48W_RGB_R = (short)(255) ;
         AV47W_RGB_G = (short)(255) ;
         AV46W_RGB_B = (short)(0) ;
      }
      else if ( AV29W_COLOR_DIV == 45419 )
      {
         AV48W_RGB_R = (short)(0) ;
         AV47W_RGB_G = (short)(128) ;
         AV46W_RGB_B = (short)(0) ;
      }
      else if ( AV29W_COLOR_DIV == 10066329 )
      {
         AV48W_RGB_R = (short)(128) ;
         AV47W_RGB_G = (short)(128) ;
         AV46W_RGB_B = (short)(128) ;
      }
      else if ( AV29W_COLOR_DIV == 16777215 )
      {
         AV48W_RGB_R = (short)(255) ;
         AV47W_RGB_G = (short)(255) ;
         AV46W_RGB_B = (short)(255) ;
      }
      else if ( AV29W_COLOR_DIV == 16761035 )
      {
         AV48W_RGB_R = (short)(255) ;
         AV47W_RGB_G = (short)(192) ;
         AV46W_RGB_B = (short)(203) ;
      }
      else if ( AV29W_COLOR_DIV == 11526116 )
      {
         AV48W_RGB_R = (short)(135) ;
         AV47W_RGB_G = (short)(206) ;
         AV46W_RGB_B = (short)(235) ;
      }
   }

   public void S241( ) throws ProcessInterruptedException
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S251( ) throws ProcessInterruptedException
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV74Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
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

   public void h720( boolean bFoot ,
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
      add_metrics1( ) ;
   }

   public void add_metrics0( )
   {
      getPrinter().setMetrics("‚l‚r ‚oƒSƒVƒbƒN", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 36, 48, 14, 36, 21, 64, 36, 36, 21, 64, 43, 21, 64, 48, 39, 48, 48, 14, 14, 21, 21, 22, 36, 64, 20, 64, 32, 21, 60, 48, 31, 43, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public void add_metrics1( )
   {
      getPrinter().setMetrics("‚l‚r –¾’©", false, false, 58, 14, 72, 171,  new int[] {48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 48, 18, 20, 23, 36, 36, 57, 43, 12, 21, 21, 25, 37, 18, 21, 18, 18, 36, 36, 36, 36, 36, 36, 36, 36, 36, 36, 18, 18, 37, 37, 37, 36, 65, 43, 43, 46, 46, 43, 39, 50, 46, 18, 32, 43, 36, 53, 46, 50, 43, 50, 46, 43, 40, 46, 43, 64, 41, 42, 39, 18, 18, 18, 27, 36, 21, 36, 36, 32, 36, 36, 18, 36, 36, 14, 15, 33, 14, 55, 36, 36, 36, 36, 21, 32, 18, 36, 33, 47, 31, 31, 31, 21, 17, 21, 37, 48, 36, 48, 14, 36, 21, 64, 36, 36, 21, 64, 43, 21, 64, 48, 39, 48, 48, 14, 14, 21, 21, 22, 36, 64, 20, 64, 32, 21, 60, 48, 31, 43, 18, 20, 36, 36, 36, 36, 17, 36, 21, 47, 24, 36, 37, 21, 47, 35, 26, 35, 21, 21, 21, 37, 34, 21, 21, 21, 23, 36, 53, 53, 53, 39, 43, 43, 43, 43, 43, 43, 64, 46, 43, 43, 43, 43, 18, 18, 18, 18, 46, 46, 50, 50, 50, 50, 50, 37, 50, 46, 46, 46, 46, 43, 43, 39, 36, 36, 36, 36, 36, 36, 57, 32, 36, 36, 36, 36, 18, 18, 18, 18, 36, 36, 36, 36, 36, 36, 36, 35, 39, 36, 36, 36, 36, 32, 36, 32}) ;
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(b720_rp01_pdf.class);
      return new GXcfg();
   }

   protected int getOutputType( )
   {
      return OUTPUT_PDF;
   }

   protected void cleanup( )
   {
      this.aP7[0] = ab720_rp01_pdf.this.AV38W_MSG;
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
                  /* Execute user subroutine: S251 */
                  S251 ();
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
      AV38W_MSG = "" ;
      AV39W_OUT_CHAR1 = "" ;
      AV40W_OUT_CHAR2 = "" ;
      AV14D_OUT_STUDY_NM1 = "" ;
      AV15D_OUT_STUDY_NM2 = "" ;
      AV12D_OUT_CRF_NM = "" ;
      AV16D_OUT_SUJECT_ID = "" ;
      AV9B720_SD01_DESIGN_I = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      AV69B720_SD04_MARK_DISP_I = new SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem(remoteHandle, context);
      AV17D_OUT_TEXT = "" ;
      AV13D_OUT_IMAGE = "" ;
      AV64W_RES = DecimalUtil.ZERO ;
      AV61W_ANGLE_CALC = new com.genexus.util.ExpressionEvaluator(context, remoteHandle);
      AV67W_TEXT_SPLIT = new GxObjectCollection(String.class, "internal", "");
      GXv_char2 = new String [1] ;
      GXv_char1 = new String [1] ;
      AV13D_OUT_IMAGE = "" ;
      A40000D_OUT_IMAGE_GXI = "" ;
      AV74Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      AV74Pgmname = "AB720_RP01_PDF" ;
      /* GeneXus formulas. */
      Gx_line = 0 ;
      AV74Pgmname = "AB720_RP01_PDF" ;
      Gx_err = (short)(0) ;
   }

   private byte AV31W_FONT_SIZE_SV ;
   private byte AV18OUT_FONT_SIZE ;
   private byte AV54W_TEXT_ALIGN ;
   private byte AV32W_LINE_SIZE ;
   private short AV10C_ADD_HEIGHT_P1 ;
   private short AV11C_ADD_HEIGHT_P2 ;
   private short AV28W_CNT ;
   private short AV44W_PAGE_NO_MAX ;
   private short AV42W_PAGE_CNT ;
   private short AV50W_TBM32_LOCATION_X ;
   private short AV52W_TBM32_LOCATION_Y ;
   private short AV51W_TBM32_LOCATION_X2 ;
   private short AV53W_TBM32_LOCATION_Y2 ;
   private short AV48W_RGB_R ;
   private short AV47W_RGB_G ;
   private short AV46W_RGB_B ;
   private short AV34W_LX ;
   private short AV36W_LY ;
   private short AV35W_LX2 ;
   private short AV37W_LY2 ;
   private short AV65W_WIDTH ;
   private short AV66W_HEIGHT ;
   private short AV23W_ARROW_SIZE ;
   private short AV33W_LOOP_CNT ;
   private short AV55W_TEXT_LX ;
   private short AV57W_TEXT_LY ;
   private short AV56W_TEXT_LX2 ;
   private short AV58W_TEXT_LY2 ;
   private short AV24W_BTN_LX ;
   private short AV26W_BTN_LY ;
   private short AV25W_BTN_LX2 ;
   private short AV27W_BTN_LY2 ;
   private short Gx_err ;
   private int AV22P_SUBJECT_ID ;
   private int M_top ;
   private int M_bot ;
   private int Line ;
   private int ToSkip ;
   private int PrtOffset ;
   private int AV72GXV1 ;
   private int AV73GXV2 ;
   private int Gx_OldLine ;
   private int AV60W_ANGLE ;
   private int AV62W_ANGLE_X ;
   private int AV63W_ANGLE_Y ;
   private int GXActiveErrHndl ;
   private long AV30W_FONT_COLOR_DIV_SV ;
   private long AV29W_COLOR_DIV ;
   private long AV59W_LINE_LNG ;
   private java.math.BigDecimal AV64W_RES ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private String AV74Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV41W_OUT_FILE_NM ;
   private String AV21P_STUDY_NM ;
   private String AV19P_CRF_NM ;
   private String AV20P_SIGNER_INFO ;
   private String AV38W_MSG ;
   private String AV39W_OUT_CHAR1 ;
   private String AV40W_OUT_CHAR2 ;
   private String AV14D_OUT_STUDY_NM1 ;
   private String AV15D_OUT_STUDY_NM2 ;
   private String AV12D_OUT_CRF_NM ;
   private String AV16D_OUT_SUJECT_ID ;
   private String AV17D_OUT_TEXT ;
   private String A40000D_OUT_IMAGE_GXI ;
   private String D_out_image ;
   private String AV13D_OUT_IMAGE ;
   private com.genexus.util.ExpressionEvaluator AV61W_ANGLE_CALC ;
   private String[] aP7 ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private GxObjectCollection AV68B720_SD04_MARK_DISP_C ;
   private GxObjectCollection AV67W_TEXT_SPLIT ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV9B720_SD01_DESIGN_I ;
   private SdtB720_SD04_MARK_DISP_B720_SD04_MARK_DISPItem AV69B720_SD04_MARK_DISP_I ;
}

