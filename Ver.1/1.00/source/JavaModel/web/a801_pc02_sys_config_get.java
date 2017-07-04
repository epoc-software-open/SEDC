/*
               File: A801_PC02_SYS_CONFIG_GET
        Description: ÉVÉXÉeÉÄä¬ã´èÓïÒéÊìæ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:43.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a801_pc02_sys_config_get extends GXProcedure
{
   public a801_pc02_sys_config_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a801_pc02_sys_config_get.class ), "" );
   }

   public a801_pc02_sys_config_get( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             String aP2 )
   {
      a801_pc02_sys_config_get.this.AV8P_A_LOGIN_SDT = aP0;
      a801_pc02_sys_config_get.this.AV10P_SYS_ID = aP1;
      a801_pc02_sys_config_get.this.AV9P_KEY_NAME = aP2;
      a801_pc02_sys_config_get.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( SdtA_LOGIN_SDT aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      a801_pc02_sys_config_get.this.AV8P_A_LOGIN_SDT = aP0;
      a801_pc02_sys_config_get.this.AV10P_SYS_ID = aP1;
      a801_pc02_sys_config_get.this.AV9P_KEY_NAME = aP2;
      a801_pc02_sys_config_get.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14W_KEY_VALUE = "" ;
      if ( ! (GXutil.strcmp("", AV9P_KEY_NAME)==0) )
      {
         AV11W_A801_SD01_SYS_CONFIG = AV8P_A_LOGIN_SDT.getgxTv_SdtA_LOGIN_SDT_A801_sys_config() ;
         if ( AV11W_A801_SD01_SYS_CONFIG.size() <= 0 )
         {
            /* Execute user subroutine: S1156 */
            S1156 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( (GXutil.strcmp("", AV10P_SYS_ID)==0) )
         {
            AV15W_SECTION = "COMMON" ;
         }
         else
         {
            AV15W_SECTION = AV10P_SYS_ID ;
         }
         AV18GXV1 = 1 ;
         while ( AV18GXV1 <= AV11W_A801_SD01_SYS_CONFIG.size() )
         {
            AV12W_A801_SD01_SYS_CONFIG_ITEM = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)((SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)AV11W_A801_SD01_SYS_CONFIG.elementAt(-1+AV18GXV1));
            if ( GXutil.strcmp(AV12W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section(), AV15W_SECTION) == 0 )
            {
               AV19GXV2 = 1 ;
               while ( AV19GXV2 <= AV12W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().size() )
               {
                  AV13W_A801_SD01_SYS_CONFIG_ITEM_KEY = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)((SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)AV12W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().elementAt(-1+AV19GXV2));
                  if ( GXutil.strcmp(AV13W_A801_SD01_SYS_CONFIG_ITEM_KEY.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name(), AV9P_KEY_NAME) == 0 )
                  {
                     AV14W_KEY_VALUE = AV13W_A801_SD01_SYS_CONFIG_ITEM_KEY.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value() ;
                     if (true) break;
                  }
                  AV19GXV2 = (int)(AV19GXV2+1) ;
               }
               if (true) break;
            }
            AV18GXV1 = (int)(AV18GXV1+1) ;
         }
      }
      cleanup();
   }

   public void S1156( )
   {
      /* 'SUB_GET_SYS_CONFIG' Routine */
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 = AV11W_A801_SD01_SYS_CONFIG ;
      GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem2[0] = GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 ;
      new a801_pc01_sys_config_init(remoteHandle, context).execute( GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem2) ;
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 = GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem2[0] ;
      AV11W_A801_SD01_SYS_CONFIG = GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = a801_pc02_sys_config_get.this.AV14W_KEY_VALUE;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14W_KEY_VALUE = "" ;
      AV11W_A801_SD01_SYS_CONFIG = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", remoteHandle);
      AV15W_SECTION = "" ;
      AV12W_A801_SD01_SYS_CONFIG_ITEM = new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem(remoteHandle, context);
      AV13W_A801_SD01_SYS_CONFIG_ITEM_KEY = new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem(remoteHandle, context);
      GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "SmartEDC_SHIZUOKA", remoteHandle);
      GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem2 = new GxObjectCollection [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV18GXV1 ;
   private int AV19GXV2 ;
   private boolean returnInSub ;
   private String AV10P_SYS_ID ;
   private String AV9P_KEY_NAME ;
   private String AV14W_KEY_VALUE ;
   private String AV15W_SECTION ;
   private String[] aP3 ;
   private GxObjectCollection AV11W_A801_SD01_SYS_CONFIG ;
   private GxObjectCollection GXt_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem1 ;
   private GxObjectCollection GXv_objcol_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem2[] ;
   private SdtA_LOGIN_SDT AV8P_A_LOGIN_SDT ;
   private SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem AV12W_A801_SD01_SYS_CONFIG_ITEM ;
   private SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem AV13W_A801_SD01_SYS_CONFIG_ITEM_KEY ;
}

