/*
               File: B712_PC01_DISP_INFO_GET
        Description: データ表示制御情報取得処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:33.30
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b712_pc01_disp_info_get extends GXProcedure
{
   public b712_pc01_disp_info_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b712_pc01_disp_info_get.class ), "" );
   }

   public b712_pc01_disp_info_get( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( GxObjectCollection[] aP0 )
   {
      b712_pc01_disp_info_get.this.AV8SD_B712_SD07_INPUT_DISP = aP0[0];
      this.aP0 = aP0;
      b712_pc01_disp_info_get.this.AV11SD_B712_SD08_ICON_INFO = aP1[0];
      this.aP1 = aP1;
      b712_pc01_disp_info_get.this.aP1 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( GxObjectCollection[] aP0 ,
                        GxObjectCollection[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GxObjectCollection[] aP0 ,
                             GxObjectCollection[] aP1 )
   {
      b712_pc01_disp_info_get.this.AV8SD_B712_SD07_INPUT_DISP = aP0[0];
      this.aP0 = aP0;
      b712_pc01_disp_info_get.this.AV11SD_B712_SD08_ICON_INFO = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8SD_B712_SD07_INPUT_DISP.clear();
      AV11SD_B712_SD08_ICON_INFO.clear();
      AV9SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV9SD_B712_SD07_INPUT_DISP_I.setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( "0" );
      AV8SD_B712_SD07_INPUT_DISP.add(AV9SD_B712_SD07_INPUT_DISP_I, 0);
      AV9SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV9SD_B712_SD07_INPUT_DISP_I.setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( "1" );
      AV8SD_B712_SD07_INPUT_DISP.add(AV9SD_B712_SD07_INPUT_DISP_I, 0);
      AV9SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV9SD_B712_SD07_INPUT_DISP_I.setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( "2" );
      AV8SD_B712_SD07_INPUT_DISP.add(AV9SD_B712_SD07_INPUT_DISP_I, 0);
      AV9SD_B712_SD07_INPUT_DISP_I = (SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      AV9SD_B712_SD07_INPUT_DISP_I.setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Data_kbn( "3" );
      AV8SD_B712_SD07_INPUT_DISP.add(AV9SD_B712_SD07_INPUT_DISP_I, 0);
      AV10W_IDX = (short)(0) ;
      /* Using cursor P006A2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A191TBM08_AUTH_CD = P006A2_A191TBM08_AUTH_CD[0] ;
         A872TBM08_DEL_FLG = P006A2_A872TBM08_DEL_FLG[0] ;
         n872TBM08_DEL_FLG = P006A2_n872TBM08_DEL_FLG[0] ;
         A863TBM08_DM_MICHAKU_CRF_FLG = P006A2_A863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         n863TBM08_DM_MICHAKU_CRF_FLG = P006A2_n863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A866TBM08_DM_ARRI_CRF_FLG = P006A2_A866TBM08_DM_ARRI_CRF_FLG[0] ;
         n866TBM08_DM_ARRI_CRF_FLG = P006A2_n866TBM08_DM_ARRI_CRF_FLG[0] ;
         A869TBM08_DM_KAIJO_CRF_FLG = P006A2_A869TBM08_DM_KAIJO_CRF_FLG[0] ;
         n869TBM08_DM_KAIJO_CRF_FLG = P006A2_n869TBM08_DM_KAIJO_CRF_FLG[0] ;
         A881TBM08_ICON_CAPTION = P006A2_A881TBM08_ICON_CAPTION[0] ;
         n881TBM08_ICON_CAPTION = P006A2_n881TBM08_ICON_CAPTION[0] ;
         A885TBM08_ICON_R = P006A2_A885TBM08_ICON_R[0] ;
         n885TBM08_ICON_R = P006A2_n885TBM08_ICON_R[0] ;
         A886TBM08_ICON_G = P006A2_A886TBM08_ICON_G[0] ;
         n886TBM08_ICON_G = P006A2_n886TBM08_ICON_G[0] ;
         A887TBM08_ICON_B = P006A2_A887TBM08_ICON_B[0] ;
         n887TBM08_ICON_B = P006A2_n887TBM08_ICON_B[0] ;
         AV10W_IDX = (short)(AV10W_IDX+1) ;
         if ( AV10W_IDX == 1 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn01_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 2 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn02_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 3 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn03_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 4 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn04_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 5 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn05_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 6 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn06_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 7 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn07_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 8 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn08_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 9 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn09_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         else if ( AV10W_IDX == 10 )
         {
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+1)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible( (short)(GXutil.lval( A863TBM08_DM_MICHAKU_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+2)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible( (short)(GXutil.lval( A866TBM08_DM_ARRI_CRF_FLG)) );
            ((SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem)AV8SD_B712_SD07_INPUT_DISP.elementAt(-1+3)).setgxTv_SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem_Kngn10_visible( (short)(GXutil.lval( A869TBM08_DM_KAIJO_CRF_FLG)) );
         }
         AV12SD_B712_SD08_ICON_INFO_I = (SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem)new SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem(remoteHandle, context);
         AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_cd( A191TBM08_AUTH_CD );
         /* Using cursor P006A3 */
         pr_default.execute(1, new Object[] {A191TBM08_AUTH_CD});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A13TAM04_AUTH_CD = P006A3_A13TAM04_AUTH_CD[0] ;
            A285TAM04_AUTH_NM = P006A3_A285TAM04_AUTH_NM[0] ;
            n285TAM04_AUTH_NM = P006A3_n285TAM04_AUTH_NM[0] ;
            AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Auth_nm( A285TAM04_AUTH_NM );
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_caption( A881TBM08_ICON_CAPTION );
         AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_r( A885TBM08_ICON_R );
         AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_g( A886TBM08_ICON_G );
         AV12SD_B712_SD08_ICON_INFO_I.setgxTv_SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem_Icon_b( A887TBM08_ICON_B );
         AV11SD_B712_SD08_ICON_INFO.add(AV12SD_B712_SD08_ICON_INFO_I, 0);
         if ( AV10W_IDX == 10 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = b712_pc01_disp_info_get.this.AV8SD_B712_SD07_INPUT_DISP;
      this.aP1[0] = b712_pc01_disp_info_get.this.AV11SD_B712_SD08_ICON_INFO;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SD_B712_SD07_INPUT_DISP_I = new SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem(remoteHandle, context);
      scmdbuf = "" ;
      P006A2_A191TBM08_AUTH_CD = new String[] {""} ;
      P006A2_A872TBM08_DEL_FLG = new String[] {""} ;
      P006A2_n872TBM08_DEL_FLG = new boolean[] {false} ;
      P006A2_A863TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      P006A2_n863TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      P006A2_A866TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      P006A2_n866TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      P006A2_A869TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      P006A2_n869TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      P006A2_A881TBM08_ICON_CAPTION = new String[] {""} ;
      P006A2_n881TBM08_ICON_CAPTION = new boolean[] {false} ;
      P006A2_A885TBM08_ICON_R = new short[1] ;
      P006A2_n885TBM08_ICON_R = new boolean[] {false} ;
      P006A2_A886TBM08_ICON_G = new short[1] ;
      P006A2_n886TBM08_ICON_G = new boolean[] {false} ;
      P006A2_A887TBM08_ICON_B = new short[1] ;
      P006A2_n887TBM08_ICON_B = new boolean[] {false} ;
      A191TBM08_AUTH_CD = "" ;
      A872TBM08_DEL_FLG = "" ;
      A863TBM08_DM_MICHAKU_CRF_FLG = "" ;
      A866TBM08_DM_ARRI_CRF_FLG = "" ;
      A869TBM08_DM_KAIJO_CRF_FLG = "" ;
      A881TBM08_ICON_CAPTION = "" ;
      AV12SD_B712_SD08_ICON_INFO_I = new SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem(remoteHandle, context);
      P006A3_A13TAM04_AUTH_CD = new String[] {""} ;
      P006A3_A285TAM04_AUTH_NM = new String[] {""} ;
      P006A3_n285TAM04_AUTH_NM = new boolean[] {false} ;
      A13TAM04_AUTH_CD = "" ;
      A285TAM04_AUTH_NM = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b712_pc01_disp_info_get__default(),
         new Object[] {
             new Object[] {
            P006A2_A191TBM08_AUTH_CD, P006A2_A872TBM08_DEL_FLG, P006A2_n872TBM08_DEL_FLG, P006A2_A863TBM08_DM_MICHAKU_CRF_FLG, P006A2_n863TBM08_DM_MICHAKU_CRF_FLG, P006A2_A866TBM08_DM_ARRI_CRF_FLG, P006A2_n866TBM08_DM_ARRI_CRF_FLG, P006A2_A869TBM08_DM_KAIJO_CRF_FLG, P006A2_n869TBM08_DM_KAIJO_CRF_FLG, P006A2_A881TBM08_ICON_CAPTION,
            P006A2_n881TBM08_ICON_CAPTION, P006A2_A885TBM08_ICON_R, P006A2_n885TBM08_ICON_R, P006A2_A886TBM08_ICON_G, P006A2_n886TBM08_ICON_G, P006A2_A887TBM08_ICON_B, P006A2_n887TBM08_ICON_B
            }
            , new Object[] {
            P006A3_A13TAM04_AUTH_CD, P006A3_A285TAM04_AUTH_NM, P006A3_n285TAM04_AUTH_NM
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10W_IDX ;
   private short A885TBM08_ICON_R ;
   private short A886TBM08_ICON_G ;
   private short A887TBM08_ICON_B ;
   private short Gx_err ;
   private String scmdbuf ;
   private boolean n872TBM08_DEL_FLG ;
   private boolean n863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean n866TBM08_DM_ARRI_CRF_FLG ;
   private boolean n869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean n881TBM08_ICON_CAPTION ;
   private boolean n885TBM08_ICON_R ;
   private boolean n886TBM08_ICON_G ;
   private boolean n887TBM08_ICON_B ;
   private boolean n285TAM04_AUTH_NM ;
   private String A191TBM08_AUTH_CD ;
   private String A872TBM08_DEL_FLG ;
   private String A863TBM08_DM_MICHAKU_CRF_FLG ;
   private String A866TBM08_DM_ARRI_CRF_FLG ;
   private String A869TBM08_DM_KAIJO_CRF_FLG ;
   private String A881TBM08_ICON_CAPTION ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private GxObjectCollection[] aP0 ;
   private GxObjectCollection[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P006A2_A191TBM08_AUTH_CD ;
   private String[] P006A2_A872TBM08_DEL_FLG ;
   private boolean[] P006A2_n872TBM08_DEL_FLG ;
   private String[] P006A2_A863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] P006A2_n863TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] P006A2_A866TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] P006A2_n866TBM08_DM_ARRI_CRF_FLG ;
   private String[] P006A2_A869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] P006A2_n869TBM08_DM_KAIJO_CRF_FLG ;
   private String[] P006A2_A881TBM08_ICON_CAPTION ;
   private boolean[] P006A2_n881TBM08_ICON_CAPTION ;
   private short[] P006A2_A885TBM08_ICON_R ;
   private boolean[] P006A2_n885TBM08_ICON_R ;
   private short[] P006A2_A886TBM08_ICON_G ;
   private boolean[] P006A2_n886TBM08_ICON_G ;
   private short[] P006A2_A887TBM08_ICON_B ;
   private boolean[] P006A2_n887TBM08_ICON_B ;
   private String[] P006A3_A13TAM04_AUTH_CD ;
   private String[] P006A3_A285TAM04_AUTH_NM ;
   private boolean[] P006A3_n285TAM04_AUTH_NM ;
   private GxObjectCollection AV8SD_B712_SD07_INPUT_DISP ;
   private GxObjectCollection AV11SD_B712_SD08_ICON_INFO ;
   private SdtB712_SD07_INPUT_DISP_B712_SD07_INPUT_DISPItem AV9SD_B712_SD07_INPUT_DISP_I ;
   private SdtB712_SD08_ICON_INFO_B712_SD08_ICON_INFOItem AV12SD_B712_SD08_ICON_INFO_I ;
}

final  class b712_pc01_disp_info_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P006A2", "SELECT `TBM08_AUTH_CD`, `TBM08_DEL_FLG`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_DEL_FLG` = '0' ORDER BY `TBM08_AUTH_CD` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P006A3", "SELECT `TAM04_AUTH_CD`, `TAM04_AUTH_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
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
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
      }
   }

}

