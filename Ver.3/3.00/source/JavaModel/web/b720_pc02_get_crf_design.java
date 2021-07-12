/*
               File: B720_PC02_GET_CRF_DESIGN
        Description: CRFデザインデータ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:34.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc02_get_crf_design extends GXProcedure
{
   public b720_pc02_get_crf_design( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc02_get_crf_design.class ), "" );
   }

   public b720_pc02_get_crf_design( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             short aP1 ,
                             byte aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b720_pc02_get_crf_design.this.AV17P_STUDY_ID = aP0;
      b720_pc02_get_crf_design.this.AV16P_CRF_ID = aP1;
      b720_pc02_get_crf_design.this.AV15P_CRF_EDA_NO = aP2;
      b720_pc02_get_crf_design.this.aP3 = aP3;
      b720_pc02_get_crf_design.this.aP4 = aP4;
      b720_pc02_get_crf_design.this.aP5 = aP5;
      b720_pc02_get_crf_design.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        byte aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             byte aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b720_pc02_get_crf_design.this.AV17P_STUDY_ID = aP0;
      b720_pc02_get_crf_design.this.AV16P_CRF_ID = aP1;
      b720_pc02_get_crf_design.this.AV15P_CRF_EDA_NO = aP2;
      b720_pc02_get_crf_design.this.aP3 = aP3;
      b720_pc02_get_crf_design.this.aP4 = aP4;
      b720_pc02_get_crf_design.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S161 */
      S161 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV22W_ERR_FLG = "0" ;
      AV23W_ERR_MSG = "" ;
      AV11C_PAGE_CHOSEI = (short)(30) ;
      AV12C_PAGE_LOCATION_X_MAX = (short)(1000) ;
      AV13C_PAGE_LOCATION_Y_MAX = (short)(1414) ;
      AV14C_PAGE_LOCATION_Y2_MAX = (short)(2834+AV11C_PAGE_CHOSEI) ;
      AV10C_COLOR_WHITE = 16777215 ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_GET_CRF_DESIGN' Routine */
      AV8B720_SD01_DESIGN_C.clear();
      AV27W_GRP_CRF_ITEM_GRP_CD = "" ;
      AV56W_GRP_OUT_FLG = "1" ;
      AV36W_OUT_FLG = "1" ;
      AV37W_PAGE_NO = (short)(1) ;
      /* Using cursor P00742 */
      pr_default.execute(0, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A70TBM32_STUDY_ID = P00742_A70TBM32_STUDY_ID[0] ;
         A71TBM32_CRF_ID = P00742_A71TBM32_CRF_ID[0] ;
         A75TBM32_DEL_FLG = P00742_A75TBM32_DEL_FLG[0] ;
         n75TBM32_DEL_FLG = P00742_n75TBM32_DEL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = P00742_A515TBM32_FONT_COLOR_DIV[0] ;
         n515TBM32_FONT_COLOR_DIV = P00742_n515TBM32_FONT_COLOR_DIV[0] ;
         A72TBM32_CRF_ITEM_CD = P00742_A72TBM32_CRF_ITEM_CD[0] ;
         A508TBM32_LOCATION_X = P00742_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P00742_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = P00742_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P00742_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = P00742_A510TBM32_LOCATION_X2[0] ;
         n510TBM32_LOCATION_X2 = P00742_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = P00742_A511TBM32_LOCATION_Y2[0] ;
         n511TBM32_LOCATION_Y2 = P00742_n511TBM32_LOCATION_Y2[0] ;
         A516TBM32_TEXT_MAXROWS = P00742_A516TBM32_TEXT_MAXROWS[0] ;
         n516TBM32_TEXT_MAXROWS = P00742_n516TBM32_TEXT_MAXROWS[0] ;
         A512TBM32_TEXT_ALIGN_DIV = P00742_A512TBM32_TEXT_ALIGN_DIV[0] ;
         n512TBM32_TEXT_ALIGN_DIV = P00742_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A524TBM32_TEXT = P00742_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P00742_n524TBM32_TEXT[0] ;
         A521TBM32_LINE_SIZE_DIV = P00742_A521TBM32_LINE_SIZE_DIV[0] ;
         n521TBM32_LINE_SIZE_DIV = P00742_n521TBM32_LINE_SIZE_DIV[0] ;
         A513TBM32_FONT_SIZE = P00742_A513TBM32_FONT_SIZE[0] ;
         n513TBM32_FONT_SIZE = P00742_n513TBM32_FONT_SIZE[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = P00742_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         n693TBM32_REQUIRED_INPUT_FLG = P00742_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A689TBM32_LINE_COLOR_DIV = P00742_A689TBM32_LINE_COLOR_DIV[0] ;
         n689TBM32_LINE_COLOR_DIV = P00742_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = P00742_A519TBM32_LINE_START_POINT_DIV[0] ;
         n519TBM32_LINE_START_POINT_DIV = P00742_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = P00742_A520TBM32_LINE_END_POINT_DIV[0] ;
         n520TBM32_LINE_END_POINT_DIV = P00742_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = P00742_A690TBM32_LINE_ANGLE[0] ;
         n690TBM32_LINE_ANGLE = P00742_n690TBM32_LINE_ANGLE[0] ;
         A525TBM32_LIST_CD = P00742_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P00742_n525TBM32_LIST_CD[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = P00742_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         n522TBM32_CHK_TRUE_INNER_VALUE = P00742_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A774TBM32_REF_CRF_ID = P00742_A774TBM32_REF_CRF_ID[0] ;
         n774TBM32_REF_CRF_ID = P00742_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = P00742_A775TBM32_REF_CRF_ITEM_CD[0] ;
         n775TBM32_REF_CRF_ITEM_CD = P00742_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A526TBM32_IMAGE_CD = P00742_A526TBM32_IMAGE_CD[0] ;
         n526TBM32_IMAGE_CD = P00742_n526TBM32_IMAGE_CD[0] ;
         A74TBM32_CRF_ITEM_DIV = P00742_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P00742_n74TBM32_CRF_ITEM_DIV[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = P00742_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         n507TBM32_CRF_ITEM_GRP_ORDER = P00742_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P00742_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P00742_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         AV44W_TBM32_CRF_ITEM_DIV = A74TBM32_CRF_ITEM_DIV ;
         AV46W_TBM32_FONT_COLOR_DIV = A515TBM32_FONT_COLOR_DIV ;
         AV43W_TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         AV45W_TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
         /* Execute user subroutine: S122 */
         S122 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         if ( GXutil.strcmp(AV36W_OUT_FLG, "1") == 0 )
         {
            AV37W_PAGE_NO = (short)(1) ;
            AV50W_TBM32_LOCATION_X = A508TBM32_LOCATION_X ;
            AV52W_TBM32_LOCATION_Y = A509TBM32_LOCATION_Y ;
            AV51W_TBM32_LOCATION_X2 = A510TBM32_LOCATION_X2 ;
            AV53W_TBM32_LOCATION_Y2 = A511TBM32_LOCATION_Y2 ;
            if ( ! (GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) )
            {
               if ( ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") == 0 ) && ( A507TBM32_CRF_ITEM_GRP_ORDER == 0 ) )
               {
                  AV26W_GRP_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
                  AV28W_GRP_LOCATION_X = A508TBM32_LOCATION_X ;
                  AV29W_GRP_LOCATION_Y = A509TBM32_LOCATION_Y ;
               }
               else
               {
                  AV50W_TBM32_LOCATION_X = (short)(AV50W_TBM32_LOCATION_X+AV28W_GRP_LOCATION_X) ;
                  AV52W_TBM32_LOCATION_Y = (short)(AV52W_TBM32_LOCATION_Y+AV29W_GRP_LOCATION_Y) ;
                  AV51W_TBM32_LOCATION_X2 = (short)(AV51W_TBM32_LOCATION_X2+AV28W_GRP_LOCATION_X) ;
                  AV53W_TBM32_LOCATION_Y2 = (short)(AV53W_TBM32_LOCATION_Y2+AV29W_GRP_LOCATION_Y) ;
               }
            }
            if ( AV52W_TBM32_LOCATION_Y > AV13C_PAGE_LOCATION_Y_MAX )
            {
               AV37W_PAGE_NO = (short)(2) ;
               AV52W_TBM32_LOCATION_Y = (short)(AV52W_TBM32_LOCATION_Y-AV13C_PAGE_LOCATION_Y_MAX) ;
               AV53W_TBM32_LOCATION_Y2 = (short)(AV53W_TBM32_LOCATION_Y2-AV13C_PAGE_LOCATION_Y_MAX) ;
            }
            if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Image") == 0 )
            {
               if ( AV51W_TBM32_LOCATION_X2 > AV12C_PAGE_LOCATION_X_MAX )
               {
                  AV51W_TBM32_LOCATION_X2 = (short)(AV50W_TBM32_LOCATION_X+80) ;
               }
               if ( AV53W_TBM32_LOCATION_Y2 > AV14C_PAGE_LOCATION_Y2_MAX )
               {
                  AV53W_TBM32_LOCATION_Y2 = (short)(AV52W_TBM32_LOCATION_Y+20) ;
               }
            }
            else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "TextArea") == 0 )
            {
               if ( A516TBM32_TEXT_MAXROWS > 1 )
               {
                  AV30W_HEIGHT = (long)(30*(A516TBM32_TEXT_MAXROWS-1)) ;
                  AV53W_TBM32_LOCATION_Y2 = (short)(AV53W_TBM32_LOCATION_Y2+AV30W_HEIGHT) ;
               }
            }
            else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") == 0 )
            {
               if ( GXutil.strcmp(A512TBM32_TEXT_ALIGN_DIV, "left") == 0 )
               {
                  AV62W_TEXT_LNG = GXutil.byteCount( A524TBM32_TEXT, "UTF8") ;
                  AV62W_TEXT_LNG = (long)(AV62W_TEXT_LNG*10) ;
                  if ( AV51W_TBM32_LOCATION_X2 > AV50W_TBM32_LOCATION_X )
                  {
                     AV63W_WIDTH = (short)(AV51W_TBM32_LOCATION_X2-AV50W_TBM32_LOCATION_X) ;
                  }
                  else
                  {
                     AV63W_WIDTH = (short)(AV50W_TBM32_LOCATION_X-AV51W_TBM32_LOCATION_X2) ;
                  }
                  if ( AV62W_TEXT_LNG > AV63W_WIDTH )
                  {
                     GXt_int1 = AV62W_TEXT_LNG ;
                     GXv_int2[0] = GXt_int1 ;
                     new a809_pc01_hasu_comp(remoteHandle, context).execute( (byte)(3), DecimalUtil.doubleToDec((AV62W_TEXT_LNG/ (double) (10))), DecimalUtil.doubleToDec(0), GXv_int2) ;
                     b720_pc02_get_crf_design.this.GXt_int1 = GXv_int2[0] ;
                     AV62W_TEXT_LNG = GXt_int1 ;
                     AV62W_TEXT_LNG = (long)(AV62W_TEXT_LNG*10) ;
                     if ( GXutil.strcmp(A512TBM32_TEXT_ALIGN_DIV, "left") == 0 )
                     {
                        if ( AV51W_TBM32_LOCATION_X2 > AV50W_TBM32_LOCATION_X )
                        {
                           AV51W_TBM32_LOCATION_X2 = (short)(AV50W_TBM32_LOCATION_X+AV62W_TEXT_LNG) ;
                        }
                        else
                        {
                           AV50W_TBM32_LOCATION_X = (short)(AV51W_TBM32_LOCATION_X2+AV62W_TEXT_LNG) ;
                        }
                     }
                     else if ( GXutil.strcmp(A512TBM32_TEXT_ALIGN_DIV, "right") == 0 )
                     {
                        if ( AV51W_TBM32_LOCATION_X2 > AV50W_TBM32_LOCATION_X )
                        {
                           AV50W_TBM32_LOCATION_X = (short)(AV50W_TBM32_LOCATION_X-AV62W_TEXT_LNG) ;
                        }
                        else
                        {
                           AV51W_TBM32_LOCATION_X2 = (short)(AV51W_TBM32_LOCATION_X2-AV62W_TEXT_LNG) ;
                        }
                     }
                     else if ( GXutil.strcmp(A512TBM32_TEXT_ALIGN_DIV, "center") == 0 )
                     {
                        AV62W_TEXT_LNG = (long)(AV62W_TEXT_LNG-AV63W_WIDTH) ;
                        GXt_int1 = AV62W_TEXT_LNG ;
                        GXv_int2[0] = GXt_int1 ;
                        new a809_pc01_hasu_comp(remoteHandle, context).execute( (byte)(3), DecimalUtil.doubleToDec((AV62W_TEXT_LNG/ (double) (20))), DecimalUtil.doubleToDec(0), GXv_int2) ;
                        b720_pc02_get_crf_design.this.GXt_int1 = GXv_int2[0] ;
                        AV62W_TEXT_LNG = GXt_int1 ;
                        AV62W_TEXT_LNG = (long)(AV62W_TEXT_LNG*10) ;
                        if ( AV51W_TBM32_LOCATION_X2 > AV50W_TBM32_LOCATION_X )
                        {
                           AV50W_TBM32_LOCATION_X = (short)(AV50W_TBM32_LOCATION_X-AV62W_TEXT_LNG) ;
                           AV51W_TBM32_LOCATION_X2 = (short)(AV51W_TBM32_LOCATION_X2+AV62W_TEXT_LNG) ;
                        }
                        else
                        {
                           AV50W_TBM32_LOCATION_X = (short)(AV50W_TBM32_LOCATION_X+AV62W_TEXT_LNG) ;
                           AV51W_TBM32_LOCATION_X2 = (short)(AV51W_TBM32_LOCATION_X2-AV62W_TEXT_LNG) ;
                        }
                     }
                  }
               }
            }
            if ( AV50W_TBM32_LOCATION_X < 0 )
            {
               AV50W_TBM32_LOCATION_X = (short)(0) ;
            }
            if ( AV51W_TBM32_LOCATION_X2 < 0 )
            {
               AV51W_TBM32_LOCATION_X2 = (short)(0) ;
            }
            if ( AV52W_TBM32_LOCATION_Y < 0 )
            {
               AV52W_TBM32_LOCATION_Y = (short)(0) ;
            }
            if ( AV53W_TBM32_LOCATION_Y2 < 0 )
            {
               AV53W_TBM32_LOCATION_Y2 = (short)(0) ;
            }
            if ( AV51W_TBM32_LOCATION_X2 > AV12C_PAGE_LOCATION_X_MAX )
            {
               AV51W_TBM32_LOCATION_X2 = AV12C_PAGE_LOCATION_X_MAX ;
            }
            if ( AV53W_TBM32_LOCATION_Y2 > AV14C_PAGE_LOCATION_Y2_MAX )
            {
               AV53W_TBM32_LOCATION_Y2 = AV14C_PAGE_LOCATION_Y2_MAX ;
            }
            AV48W_TBM32_LINE_SIZE_DIV = A521TBM32_LINE_SIZE_DIV ;
            if ( ((GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Line")==0)||(GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Rect")==0)||(GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Paren")==0)) )
            {
               if ( A521TBM32_LINE_SIZE_DIV == 0 )
               {
                  AV48W_TBM32_LINE_SIZE_DIV = (byte)(1) ;
               }
            }
            AV47W_TBM32_FONT_SIZE = (byte)(((0==A513TBM32_FONT_SIZE) ? 12 : A513TBM32_FONT_SIZE)) ;
            if ( A513TBM32_FONT_SIZE >= 18 )
            {
               AV47W_TBM32_FONT_SIZE = (byte)(AV47W_TBM32_FONT_SIZE-1) ;
            }
            AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no( AV37W_PAGE_NO );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x( AV50W_TBM32_LOCATION_X );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y( AV52W_TBM32_LOCATION_Y );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2( AV51W_TBM32_LOCATION_X2 );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2( AV53W_TBM32_LOCATION_Y2 );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd( A72TBM32_CRF_ITEM_CD );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd( A73TBM32_CRF_ITEM_GRP_CD );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div( A74TBM32_CRF_ITEM_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg( A693TBM32_REQUIRED_INPUT_FLG );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( GXutil.trim( A524TBM32_TEXT) );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div( A512TBM32_TEXT_ALIGN_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_maxrows( A516TBM32_TEXT_MAXROWS );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size( AV47W_TBM32_FONT_SIZE );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div( A515TBM32_FONT_COLOR_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_size_div( AV48W_TBM32_LINE_SIZE_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_color_div( A689TBM32_LINE_COLOR_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_start_point_div( A519TBM32_LINE_START_POINT_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_end_point_div( A520TBM32_LINE_END_POINT_DIV );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Line_angle( A690TBM32_LINE_ANGLE );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd( A525TBM32_LIST_CD );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value( A522TBM32_CHK_TRUE_INNER_VALUE );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id( A774TBM32_REF_CRF_ID );
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd( A775TBM32_REF_CRF_ITEM_CD );
            if ( ! (GXutil.strcmp("", GXutil.trim( A73TBM32_CRF_ITEM_GRP_CD))==0) )
            {
               AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd( AV26W_GRP_CRF_ITEM_CD );
            }
            if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Image") == 0 )
            {
               GXt_char3 = "" ;
               GXv_char4[0] = GXt_char3 ;
               new b799_pc02_image_url_get(remoteHandle, context).execute( A526TBM32_IMAGE_CD, GXv_char4) ;
               b720_pc02_get_crf_design.this.GXt_char3 = GXv_char4[0] ;
               AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Image_url( GXt_char3 );
            }
            AV8B720_SD01_DESIGN_C.add(AV9B720_SD01_DESIGN_I, 0);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /* Execute user subroutine: S131 */
      S131 ();
      if (returnInSub) return;
      AV8B720_SD01_DESIGN_C.sort("PAGE_NO, FONT_SIZE, FONT_COLOR_DIV");
   }

   public void S131( )
   {
      /* 'SUB_REQ_MARK_EDIT' Routine */
      AV45W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV59W_GRP_PAGE_NO = (short)(0) ;
      AV28W_GRP_LOCATION_X = (short)(0) ;
      AV29W_GRP_LOCATION_Y = (short)(0) ;
      AV60W_GRP_LOCATION_X2 = (short)(0) ;
      AV61W_GRP_LOCATION_Y2 = (short)(0) ;
      AV67GXV1 = 1 ;
      while ( AV67GXV1 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV67GXV1));
         if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Required_input_flg(), "1") == 0 )
         {
            if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Group") == 0 )
            {
               if ( ! (GXutil.strcmp("", AV45W_TBM32_CRF_ITEM_GRP_CD)==0) )
               {
                  /* Execute user subroutine: S141 */
                  S141 ();
                  if (returnInSub) return;
               }
               AV45W_TBM32_CRF_ITEM_GRP_CD = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd() ;
            }
            else
            {
               AV37W_PAGE_NO = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no() ;
               AV50W_TBM32_LOCATION_X = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()+1) ;
               AV52W_TBM32_LOCATION_Y = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+4) ;
               AV51W_TBM32_LOCATION_X2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()+11) ;
               AV53W_TBM32_LOCATION_Y2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+4) ;
               /* Execute user subroutine: S151 */
               S151 ();
               if (returnInSub) return;
            }
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV45W_TBM32_CRF_ITEM_GRP_CD)==0) )
            {
               if ( GXutil.strcmp(AV45W_TBM32_CRF_ITEM_GRP_CD, AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_grp_cd()) == 0 )
               {
                  if ( ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Label") != 0 ) && ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Image") != 0 ) && ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Line") != 0 ) && ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Rect") != 0 ) && ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "Paren") != 0 ) )
                  {
                     AV59W_GRP_PAGE_NO = AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no() ;
                     if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
                     {
                        AV34W_LEN = (short)(GXutil.byteCount( AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text(), "UTF-8")*9) ;
                        AV28W_GRP_LOCATION_X = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x()+AV34W_LEN+1) ;
                        AV29W_GRP_LOCATION_Y = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+12) ;
                        AV60W_GRP_LOCATION_X2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x()+AV34W_LEN+11) ;
                        AV61W_GRP_LOCATION_Y2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+12) ;
                     }
                     else
                     {
                        AV28W_GRP_LOCATION_X = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()+1) ;
                        AV29W_GRP_LOCATION_Y = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+4) ;
                        AV60W_GRP_LOCATION_X2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2()+11) ;
                        AV61W_GRP_LOCATION_Y2 = (short)(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y()+4) ;
                     }
                  }
               }
               else
               {
                  /* Execute user subroutine: S141 */
                  S141 ();
                  if (returnInSub) return;
                  AV45W_TBM32_CRF_ITEM_GRP_CD = "" ;
               }
            }
         }
         AV67GXV1 = (int)(AV67GXV1+1) ;
      }
      if ( ! (GXutil.strcmp("", AV45W_TBM32_CRF_ITEM_GRP_CD)==0) )
      {
         /* Execute user subroutine: S141 */
         S141 ();
         if (returnInSub) return;
      }
   }

   public void S141( )
   {
      /* 'SUB_GRP_REQ_MARK_SET' Routine */
      AV37W_PAGE_NO = AV59W_GRP_PAGE_NO ;
      AV50W_TBM32_LOCATION_X = AV28W_GRP_LOCATION_X ;
      AV52W_TBM32_LOCATION_Y = AV29W_GRP_LOCATION_Y ;
      AV51W_TBM32_LOCATION_X2 = AV60W_GRP_LOCATION_X2 ;
      AV53W_TBM32_LOCATION_Y2 = AV61W_GRP_LOCATION_Y2 ;
      /* Execute user subroutine: S151 */
      S151 ();
      if (returnInSub) return;
   }

   public void S151( )
   {
      /* 'SUB_REQ_MARK_SET' Routine */
      AV57B720_SD01_DESIGN_MARK = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Page_no( AV37W_PAGE_NO );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div( "Label" );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x( AV50W_TBM32_LOCATION_X );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y( AV52W_TBM32_LOCATION_Y );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_x2( AV51W_TBM32_LOCATION_X2 );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Location_y2( AV53W_TBM32_LOCATION_Y2 );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text_align_div( "left" );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( "*" );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_size( (byte)(12) );
      AV57B720_SD01_DESIGN_MARK.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Font_color_div( 16711680 );
      AV8B720_SD01_DESIGN_C.add(AV57B720_SD01_DESIGN_MARK, 0);
   }

   public void S122( )
   {
      /* 'SUB_ITEM_OUT_CHK' Routine */
      AV19W_CHK_FLG = "1" ;
      if ( ! (GXutil.strcmp("", AV45W_TBM32_CRF_ITEM_GRP_CD)==0) )
      {
         if ( ( GXutil.strcmp(AV27W_GRP_CRF_ITEM_GRP_CD, AV45W_TBM32_CRF_ITEM_GRP_CD) == 0 ) && ( GXutil.strcmp(AV56W_GRP_OUT_FLG, "0") == 0 ) )
         {
            AV36W_OUT_FLG = "0" ;
            AV19W_CHK_FLG = "0" ;
         }
         AV27W_GRP_CRF_ITEM_GRP_CD = AV45W_TBM32_CRF_ITEM_GRP_CD ;
      }
      if ( GXutil.strcmp(AV19W_CHK_FLG, "1") == 0 )
      {
         AV36W_OUT_FLG = "1" ;
         if ( ( GXutil.strcmp(AV44W_TBM32_CRF_ITEM_DIV, "Label") == 0 ) && ( AV46W_TBM32_FONT_COLOR_DIV == AV10C_COLOR_WHITE ) )
         {
            AV36W_OUT_FLG = "0" ;
         }
         else
         {
            if ( ! (GXutil.strcmp("", AV45W_TBM32_CRF_ITEM_GRP_CD)==0) && ( GXutil.strcmp(AV44W_TBM32_CRF_ITEM_DIV, "Group") != 0 ) )
            {
               AV43W_TBM32_CRF_ITEM_CD = AV43W_TBM32_CRF_ITEM_CD + "_Child" ;
            }
            /* Using cursor P00743 */
            pr_default.execute(1, new Object[] {new Long(AV17P_STUDY_ID), new Short(AV16P_CRF_ID), AV43W_TBM32_CRF_ITEM_CD});
            while ( (pr_default.getStatus(1) != 101) )
            {
               A581TBM35_DEL_FLG = P00743_A581TBM35_DEL_FLG[0] ;
               n581TBM35_DEL_FLG = P00743_n581TBM35_DEL_FLG[0] ;
               A33TBM35_CRF_ITEM_CD = P00743_A33TBM35_CRF_ITEM_CD[0] ;
               A32TBM35_CRF_ID = P00743_A32TBM35_CRF_ID[0] ;
               A31TBM35_STUDY_ID = P00743_A31TBM35_STUDY_ID[0] ;
               A580TBM35_DISPLAY_FLG = P00743_A580TBM35_DISPLAY_FLG[0] ;
               n580TBM35_DISPLAY_FLG = P00743_n580TBM35_DISPLAY_FLG[0] ;
               A34TBM35_STUDY_AUTH_CD = P00743_A34TBM35_STUDY_AUTH_CD[0] ;
               if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "0") == 0 )
               {
                  AV36W_OUT_FLG = "1" ;
               }
               else if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "1") == 0 )
               {
                  AV36W_OUT_FLG = "1" ;
               }
               else if ( GXutil.strcmp(A580TBM35_DISPLAY_FLG, "2") == 0 )
               {
                  AV36W_OUT_FLG = "0" ;
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(1);
            }
            pr_default.close(1);
            if ( GXutil.strcmp(AV44W_TBM32_CRF_ITEM_DIV, "Group") == 0 )
            {
               AV56W_GRP_OUT_FLG = AV36W_OUT_FLG ;
            }
         }
      }
   }

   public void S161( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV69Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b720_pc02_get_crf_design.this.AV8B720_SD01_DESIGN_C;
      this.aP4[0] = b720_pc02_get_crf_design.this.AV21W_ERR_CD;
      this.aP5[0] = b720_pc02_get_crf_design.this.AV23W_ERR_MSG;
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
                  /* Execute user subroutine: S171 */
                  S171 ();
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
      AV8B720_SD01_DESIGN_C = new GxObjectCollection(SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem.class, "B720_SD01_DESIGN.B720_SD01_DESIGNItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV23W_ERR_MSG = "" ;
      AV22W_ERR_FLG = "" ;
      AV27W_GRP_CRF_ITEM_GRP_CD = "" ;
      AV56W_GRP_OUT_FLG = "" ;
      AV36W_OUT_FLG = "" ;
      scmdbuf = "" ;
      P00742_A70TBM32_STUDY_ID = new long[1] ;
      P00742_A71TBM32_CRF_ID = new short[1] ;
      P00742_A75TBM32_DEL_FLG = new String[] {""} ;
      P00742_n75TBM32_DEL_FLG = new boolean[] {false} ;
      P00742_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      P00742_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      P00742_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P00742_A508TBM32_LOCATION_X = new short[1] ;
      P00742_n508TBM32_LOCATION_X = new boolean[] {false} ;
      P00742_A509TBM32_LOCATION_Y = new short[1] ;
      P00742_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P00742_A510TBM32_LOCATION_X2 = new short[1] ;
      P00742_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      P00742_A511TBM32_LOCATION_Y2 = new short[1] ;
      P00742_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      P00742_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      P00742_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      P00742_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      P00742_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      P00742_A524TBM32_TEXT = new String[] {""} ;
      P00742_n524TBM32_TEXT = new boolean[] {false} ;
      P00742_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      P00742_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      P00742_A513TBM32_FONT_SIZE = new byte[1] ;
      P00742_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      P00742_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      P00742_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      P00742_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      P00742_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      P00742_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      P00742_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      P00742_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      P00742_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      P00742_A690TBM32_LINE_ANGLE = new short[1] ;
      P00742_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      P00742_A525TBM32_LIST_CD = new String[] {""} ;
      P00742_n525TBM32_LIST_CD = new boolean[] {false} ;
      P00742_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      P00742_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      P00742_A774TBM32_REF_CRF_ID = new short[1] ;
      P00742_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      P00742_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      P00742_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      P00742_A526TBM32_IMAGE_CD = new String[] {""} ;
      P00742_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      P00742_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P00742_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P00742_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      P00742_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      P00742_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00742_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      A75TBM32_DEL_FLG = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      A524TBM32_TEXT = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      A525TBM32_LIST_CD = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      A526TBM32_IMAGE_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      AV44W_TBM32_CRF_ITEM_DIV = "" ;
      AV43W_TBM32_CRF_ITEM_CD = "" ;
      AV45W_TBM32_CRF_ITEM_GRP_CD = "" ;
      AV26W_GRP_CRF_ITEM_CD = "" ;
      GXv_int2 = new long [1] ;
      AV9B720_SD01_DESIGN_I = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      AV57B720_SD01_DESIGN_MARK = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      AV19W_CHK_FLG = "" ;
      P00743_A581TBM35_DEL_FLG = new String[] {""} ;
      P00743_n581TBM35_DEL_FLG = new boolean[] {false} ;
      P00743_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      P00743_A32TBM35_CRF_ID = new short[1] ;
      P00743_A31TBM35_STUDY_ID = new long[1] ;
      P00743_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      P00743_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      P00743_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      A581TBM35_DEL_FLG = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      AV69Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc02_get_crf_design__default(),
         new Object[] {
             new Object[] {
            P00742_A70TBM32_STUDY_ID, P00742_A71TBM32_CRF_ID, P00742_A75TBM32_DEL_FLG, P00742_n75TBM32_DEL_FLG, P00742_A515TBM32_FONT_COLOR_DIV, P00742_n515TBM32_FONT_COLOR_DIV, P00742_A72TBM32_CRF_ITEM_CD, P00742_A508TBM32_LOCATION_X, P00742_n508TBM32_LOCATION_X, P00742_A509TBM32_LOCATION_Y,
            P00742_n509TBM32_LOCATION_Y, P00742_A510TBM32_LOCATION_X2, P00742_n510TBM32_LOCATION_X2, P00742_A511TBM32_LOCATION_Y2, P00742_n511TBM32_LOCATION_Y2, P00742_A516TBM32_TEXT_MAXROWS, P00742_n516TBM32_TEXT_MAXROWS, P00742_A512TBM32_TEXT_ALIGN_DIV, P00742_n512TBM32_TEXT_ALIGN_DIV, P00742_A524TBM32_TEXT,
            P00742_n524TBM32_TEXT, P00742_A521TBM32_LINE_SIZE_DIV, P00742_n521TBM32_LINE_SIZE_DIV, P00742_A513TBM32_FONT_SIZE, P00742_n513TBM32_FONT_SIZE, P00742_A693TBM32_REQUIRED_INPUT_FLG, P00742_n693TBM32_REQUIRED_INPUT_FLG, P00742_A689TBM32_LINE_COLOR_DIV, P00742_n689TBM32_LINE_COLOR_DIV, P00742_A519TBM32_LINE_START_POINT_DIV,
            P00742_n519TBM32_LINE_START_POINT_DIV, P00742_A520TBM32_LINE_END_POINT_DIV, P00742_n520TBM32_LINE_END_POINT_DIV, P00742_A690TBM32_LINE_ANGLE, P00742_n690TBM32_LINE_ANGLE, P00742_A525TBM32_LIST_CD, P00742_n525TBM32_LIST_CD, P00742_A522TBM32_CHK_TRUE_INNER_VALUE, P00742_n522TBM32_CHK_TRUE_INNER_VALUE, P00742_A774TBM32_REF_CRF_ID,
            P00742_n774TBM32_REF_CRF_ID, P00742_A775TBM32_REF_CRF_ITEM_CD, P00742_n775TBM32_REF_CRF_ITEM_CD, P00742_A526TBM32_IMAGE_CD, P00742_n526TBM32_IMAGE_CD, P00742_A74TBM32_CRF_ITEM_DIV, P00742_n74TBM32_CRF_ITEM_DIV, P00742_A507TBM32_CRF_ITEM_GRP_ORDER, P00742_n507TBM32_CRF_ITEM_GRP_ORDER, P00742_A73TBM32_CRF_ITEM_GRP_CD,
            P00742_n73TBM32_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            P00743_A581TBM35_DEL_FLG, P00743_n581TBM35_DEL_FLG, P00743_A33TBM35_CRF_ITEM_CD, P00743_A32TBM35_CRF_ID, P00743_A31TBM35_STUDY_ID, P00743_A580TBM35_DISPLAY_FLG, P00743_n580TBM35_DISPLAY_FLG, P00743_A34TBM35_STUDY_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV69Pgmname = "B720_PC02_GET_CRF_DESIGN" ;
      /* GeneXus formulas. */
      AV69Pgmname = "B720_PC02_GET_CRF_DESIGN" ;
      Gx_err = (short)(0) ;
   }

   private byte AV15P_CRF_EDA_NO ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A513TBM32_FONT_SIZE ;
   private byte AV48W_TBM32_LINE_SIZE_DIV ;
   private byte AV47W_TBM32_FONT_SIZE ;
   private short AV16P_CRF_ID ;
   private short AV21W_ERR_CD ;
   private short AV11C_PAGE_CHOSEI ;
   private short AV12C_PAGE_LOCATION_X_MAX ;
   private short AV13C_PAGE_LOCATION_Y_MAX ;
   private short AV14C_PAGE_LOCATION_Y2_MAX ;
   private short AV37W_PAGE_NO ;
   private short A71TBM32_CRF_ID ;
   private short A508TBM32_LOCATION_X ;
   private short A509TBM32_LOCATION_Y ;
   private short A510TBM32_LOCATION_X2 ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A690TBM32_LINE_ANGLE ;
   private short A774TBM32_REF_CRF_ID ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short AV50W_TBM32_LOCATION_X ;
   private short AV52W_TBM32_LOCATION_Y ;
   private short AV51W_TBM32_LOCATION_X2 ;
   private short AV53W_TBM32_LOCATION_Y2 ;
   private short AV28W_GRP_LOCATION_X ;
   private short AV29W_GRP_LOCATION_Y ;
   private short AV63W_WIDTH ;
   private short AV59W_GRP_PAGE_NO ;
   private short AV60W_GRP_LOCATION_X2 ;
   private short AV61W_GRP_LOCATION_Y2 ;
   private short AV34W_LEN ;
   private short A32TBM35_CRF_ID ;
   private short Gx_err ;
   private int AV67GXV1 ;
   private int GXActiveErrHndl ;
   private long AV17P_STUDY_ID ;
   private long AV10C_COLOR_WHITE ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long AV46W_TBM32_FONT_COLOR_DIV ;
   private long AV30W_HEIGHT ;
   private long AV62W_TEXT_LNG ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long A31TBM35_STUDY_ID ;
   private String scmdbuf ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV69Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n524TBM32_TEXT ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private String AV23W_ERR_MSG ;
   private String AV22W_ERR_FLG ;
   private String AV27W_GRP_CRF_ITEM_GRP_CD ;
   private String AV56W_GRP_OUT_FLG ;
   private String AV36W_OUT_FLG ;
   private String A75TBM32_DEL_FLG ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A524TBM32_TEXT ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A525TBM32_LIST_CD ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A526TBM32_IMAGE_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String AV44W_TBM32_CRF_ITEM_DIV ;
   private String AV43W_TBM32_CRF_ITEM_CD ;
   private String AV45W_TBM32_CRF_ITEM_GRP_CD ;
   private String AV26W_GRP_CRF_ITEM_CD ;
   private String AV19W_CHK_FLG ;
   private String A581TBM35_DEL_FLG ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private long[] P00742_A70TBM32_STUDY_ID ;
   private short[] P00742_A71TBM32_CRF_ID ;
   private String[] P00742_A75TBM32_DEL_FLG ;
   private boolean[] P00742_n75TBM32_DEL_FLG ;
   private long[] P00742_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] P00742_n515TBM32_FONT_COLOR_DIV ;
   private String[] P00742_A72TBM32_CRF_ITEM_CD ;
   private short[] P00742_A508TBM32_LOCATION_X ;
   private boolean[] P00742_n508TBM32_LOCATION_X ;
   private short[] P00742_A509TBM32_LOCATION_Y ;
   private boolean[] P00742_n509TBM32_LOCATION_Y ;
   private short[] P00742_A510TBM32_LOCATION_X2 ;
   private boolean[] P00742_n510TBM32_LOCATION_X2 ;
   private short[] P00742_A511TBM32_LOCATION_Y2 ;
   private boolean[] P00742_n511TBM32_LOCATION_Y2 ;
   private byte[] P00742_A516TBM32_TEXT_MAXROWS ;
   private boolean[] P00742_n516TBM32_TEXT_MAXROWS ;
   private String[] P00742_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] P00742_n512TBM32_TEXT_ALIGN_DIV ;
   private String[] P00742_A524TBM32_TEXT ;
   private boolean[] P00742_n524TBM32_TEXT ;
   private byte[] P00742_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] P00742_n521TBM32_LINE_SIZE_DIV ;
   private byte[] P00742_A513TBM32_FONT_SIZE ;
   private boolean[] P00742_n513TBM32_FONT_SIZE ;
   private String[] P00742_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] P00742_n693TBM32_REQUIRED_INPUT_FLG ;
   private long[] P00742_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] P00742_n689TBM32_LINE_COLOR_DIV ;
   private String[] P00742_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] P00742_n519TBM32_LINE_START_POINT_DIV ;
   private String[] P00742_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] P00742_n520TBM32_LINE_END_POINT_DIV ;
   private short[] P00742_A690TBM32_LINE_ANGLE ;
   private boolean[] P00742_n690TBM32_LINE_ANGLE ;
   private String[] P00742_A525TBM32_LIST_CD ;
   private boolean[] P00742_n525TBM32_LIST_CD ;
   private String[] P00742_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] P00742_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private short[] P00742_A774TBM32_REF_CRF_ID ;
   private boolean[] P00742_n774TBM32_REF_CRF_ID ;
   private String[] P00742_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] P00742_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] P00742_A526TBM32_IMAGE_CD ;
   private boolean[] P00742_n526TBM32_IMAGE_CD ;
   private String[] P00742_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P00742_n74TBM32_CRF_ITEM_DIV ;
   private short[] P00742_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] P00742_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private String[] P00742_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00742_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P00743_A581TBM35_DEL_FLG ;
   private boolean[] P00743_n581TBM35_DEL_FLG ;
   private String[] P00743_A33TBM35_CRF_ITEM_CD ;
   private short[] P00743_A32TBM35_CRF_ID ;
   private long[] P00743_A31TBM35_STUDY_ID ;
   private String[] P00743_A580TBM35_DISPLAY_FLG ;
   private boolean[] P00743_n580TBM35_DISPLAY_FLG ;
   private String[] P00743_A34TBM35_STUDY_AUTH_CD ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV9B720_SD01_DESIGN_I ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV57B720_SD01_DESIGN_MARK ;
}

final  class b720_pc02_get_crf_design__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00742", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_DEL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_CRF_ITEM_CD`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT`, `TBM32_LINE_SIZE_DIV`, `TBM32_FONT_SIZE`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_LIST_CD`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_IMAGE_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_CRF_ITEM_GRP_CD` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ?) AND (`TBM32_CRF_ID` = ?) AND (`TBM32_DEL_FLG` = '0') ORDER BY `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_CRF_ITEM_DIV` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00743", "SELECT `TBM35_DEL_FLG`, `TBM35_CRF_ITEM_CD`, `TBM35_CRF_ID`, `TBM35_STUDY_ID`, `TBM35_DISPLAY_FLG`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE (`TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` = ? and `TBM35_CRF_ITEM_CD` = ?) AND (`TBM35_DEL_FLG` = '0') ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((long[]) buf[27])[0] = rslt.getLong(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((short[]) buf[39])[0] = rslt.getShort(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((short[]) buf[47])[0] = rslt.getShort(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[3])[0] = rslt.getShort(3) ;
               ((long[]) buf[4])[0] = rslt.getLong(4) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
      }
   }

}

