/*
               File: A820_PC01_PAGING
        Description: ページング制御処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:46.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a820_pc01_paging extends GXProcedure
{
   public a820_pc01_paging( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a820_pc01_paging.class ), "" );
   }

   public a820_pc01_paging( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public SdtA_PAGING_SDT executeUdp( )
   {
      a820_pc01_paging.this.AV8P_A_PAGING_SDT = aP0[0];
      this.aP0 = aP0;
      a820_pc01_paging.this.aP0 = new SdtA_PAGING_SDT[] {new SdtA_PAGING_SDT()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( SdtA_PAGING_SDT[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( SdtA_PAGING_SDT[] aP0 )
   {
      a820_pc01_paging.this.AV8P_A_PAGING_SDT = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt() > 0 )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(DecimalUtil.decToDouble(GXutil.truncDecimal( DecimalUtil.doubleToDec(AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt()/ (double) (AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_row())).add(DecimalUtil.doubleToDec(0.9999,6,4)), 0))) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Max_page( (short)(0) );
      }
      if ( ! (0==AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()) )
      {
         if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
         {
            AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() );
         }
         if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() <= 10 )
         {
            AV9W_MIN_CURRENT_PAGE = (short)(0) ;
         }
         else
         {
            if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() - 4 )
            {
               AV9W_MIN_CURRENT_PAGE = (short)(AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page()-10) ;
            }
            else
            {
               if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < 6 )
               {
                  AV9W_MIN_CURRENT_PAGE = (short)(0) ;
               }
               else
               {
                  AV9W_MIN_CURRENT_PAGE = (short)(AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no()-6) ;
               }
            }
         }
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(AV9W_MIN_CURRENT_PAGE+1) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(AV9W_MIN_CURRENT_PAGE+2) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(AV9W_MIN_CURRENT_PAGE+3) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(AV9W_MIN_CURRENT_PAGE+4) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(AV9W_MIN_CURRENT_PAGE+5) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(AV9W_MIN_CURRENT_PAGE+6) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(AV9W_MIN_CURRENT_PAGE+7) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(AV9W_MIN_CURRENT_PAGE+8) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(AV9W_MIN_CURRENT_PAGE+9) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(AV9W_MIN_CURRENT_PAGE+10) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_no( (short)(1) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page01( (short)(1) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page02( (short)(2) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page03( (short)(3) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page04( (short)(4) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page05( (short)(5) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page06( (short)(6) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page07( (short)(7) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page08( (short)(8) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page09( (short)(9) );
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page10( (short)(10) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page01() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp01( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page02() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp02( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page03() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp03( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page04() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp04( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page05() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp05( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page06() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp06( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page07() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp07( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page08() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp08( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page09() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp09( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() >= AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page10() > 0 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp10( (byte)(0) );
      }
      if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_back( (byte)(0) );
      }
      if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_next( (byte)(0) );
      }
      if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() > 1 )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_first( (byte)(0) );
      }
      if ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Page_no() < AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_last( (byte)(0) );
      }
      if ( ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Rec_cnt() > 0 ) && ( AV8P_A_PAGING_SDT.getgxTv_SdtA_PAGING_SDT_Max_page() > 1 ) )
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(1) );
      }
      else
      {
         AV8P_A_PAGING_SDT.setgxTv_SdtA_PAGING_SDT_Page_disp_area( (byte)(0) );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = a820_pc01_paging.this.AV8P_A_PAGING_SDT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV9W_MIN_CURRENT_PAGE ;
   private short Gx_err ;
   private SdtA_PAGING_SDT[] aP0 ;
   private SdtA_PAGING_SDT AV8P_A_PAGING_SDT ;
}

