/*
               File: A801_PC01_SYS_CONFIG_INIT
        Description: ƒVƒXƒeƒ€ŠÂ‹«î•ñ‰Šú‰»
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a801_pc01_sys_config_init extends GXProcedure
{
   public a801_pc01_sys_config_init( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a801_pc01_sys_config_init.class ), "" );
   }

   public a801_pc01_sys_config_init( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( )
   {
      a801_pc01_sys_config_init.this.aP0 = aP0;
      a801_pc01_sys_config_init.this.aP0 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GxObjectCollection[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GxObjectCollection[] aP0 )
   {
      a801_pc01_sys_config_init.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV13W_DEL_CHR = ":" ;
      AV8W_A801_SD01_SYS_CONFIG.clear();
      AV9W_A801_SD01_SYS_CONFIG_ITEM = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem(remoteHandle, context);
      AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem(remoteHandle, context);
      AV23W_MOJI_CD = "MS932" ;
      AV15W_DIR.setSource( "." );
      AV24W_NUM = (short)(GXutil.strSearch( AV17W_HTTPREQUEST.getScriptPath(), "/", 2)-2) ;
      AV26W_SCRIPTPATH = GXutil.substring( AV17W_HTTPREQUEST.getScriptPath(), 2, AV24W_NUM) ;
      AV24W_NUM = (short)(GXutil.len( AV15W_DIR.getAbsoluteName())-2) ;
      /* User Code */
       AV28W_DIRPATH = System.getProperty("catalina.base");
      AV25W_READ_FILE = AV28W_DIRPATH + "/webapps/" + AV26W_SCRIPTPATH + "/static" + "/ini/GXX_SYS_CONFIG.INI" ;
      AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfropen( AV25W_READ_FILE, 1024, "", "", AV23W_MOJI_CD)) ;
      if ( AV16W_HANDLE == 0 )
      {
         while ( context.getSessionInstances().getDelimitedFiles().dfrnext( ) == 0 )
         {
            GXv_char1[0] = AV22W_LINE ;
            GXt_int2 = context.getSessionInstances().getDelimitedFiles().dfrgtxt( GXv_char1, (short)(500)) ;
            AV22W_LINE = GXv_char1[0] ;
            AV16W_HANDLE = (byte)(GXt_int2) ;
            if ( AV16W_HANDLE != 0 )
            {
               if (true) break;
            }
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         if ( ! (GXutil.strcmp("", AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section())==0) && ( AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().size() > 0 ) )
         {
            AV8W_A801_SD01_SYS_CONFIG.add(AV9W_A801_SD01_SYS_CONFIG_ITEM, 0);
         }
      }
      AV16W_HANDLE = (byte)(context.getSessionInstances().getDelimitedFiles().dfrclose( )) ;
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_LINE_EDIT' Routine */
      if ( ( GXutil.strcmp(GXutil.substring( AV22W_LINE, 1, 1), ";") != 0 ) && ( GXutil.strcmp(GXutil.substring( AV22W_LINE, 1, 1), "#") != 0 ) && ( GXutil.strcmp(GXutil.substring( AV22W_LINE, 1, 1), AV13W_DEL_CHR) != 0 ) )
      {
         if ( GxRegex.IsMatch(AV22W_LINE,"^\\[.+\\]$") )
         {
            if ( ! (GXutil.strcmp("", AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section())==0) && ( AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().size() > 0 ) )
            {
               AV8W_A801_SD01_SYS_CONFIG.add(AV9W_A801_SD01_SYS_CONFIG_ITEM, 0);
            }
            AV9W_A801_SD01_SYS_CONFIG_ITEM = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem)new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem(remoteHandle, context);
            AV9W_A801_SD01_SYS_CONFIG_ITEM.setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Section( GXutil.substring( AV22W_LINE, 2, GXutil.len( AV22W_LINE)-2) );
         }
         else
         {
            AV14W_DEL_INDEX = (short)(GXutil.strSearch( AV22W_LINE, AV13W_DEL_CHR, 1)) ;
            if ( AV14W_DEL_INDEX > 1 )
            {
               AV12W_ADD_KEY_FLG = true ;
               AV31GXV1 = 1 ;
               while ( AV31GXV1 <= AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().size() )
               {
                  AV11W_A801_SD01_SYS_CONFIG_ITEM_KEY_CHK = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)((SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().elementAt(-1+AV31GXV1));
                  if ( GXutil.strcmp(AV11W_A801_SD01_SYS_CONFIG_ITEM_KEY_CHK.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name(), GXutil.substring( AV22W_LINE, 1, AV14W_DEL_INDEX-1)) == 0 )
                  {
                     AV12W_ADD_KEY_FLG = false ;
                     if (true) break;
                  }
                  AV31GXV1 = (int)(AV31GXV1+1) ;
               }
               if ( AV12W_ADD_KEY_FLG )
               {
                  AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY = (SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem)new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem(remoteHandle, context);
                  AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY.setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Name( GXutil.substring( AV22W_LINE, 1, AV14W_DEL_INDEX-1) );
                  AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY.setgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem_Value( GXutil.substring( AV22W_LINE, AV14W_DEL_INDEX+1, GXutil.len( AV22W_LINE)-AV14W_DEL_INDEX) );
                  AV9W_A801_SD01_SYS_CONFIG_ITEM.getgxTv_SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_Key().add(AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY, 0);
               }
            }
         }
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = a801_pc01_sys_config_init.this.AV8W_A801_SD01_SYS_CONFIG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_A801_SD01_SYS_CONFIG = new GxObjectCollection(SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem.class, "A801_SD01_SYS_CONFIG.A801_SD01_SYS_CONFIGItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV13W_DEL_CHR = "" ;
      AV9W_A801_SD01_SYS_CONFIG_ITEM = new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem(remoteHandle, context);
      AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY = new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem(remoteHandle, context);
      AV23W_MOJI_CD = "" ;
      AV15W_DIR = new com.genexus.util.GXDirectory();
      AV17W_HTTPREQUEST = httpContext.getHttpRequest();
      AV26W_SCRIPTPATH = "" ;
      AV28W_DIRPATH = "" ;
      AV25W_READ_FILE = "" ;
      AV22W_LINE = "" ;
      GXv_char1 = new String [1] ;
      AV11W_A801_SD01_SYS_CONFIG_ITEM_KEY_CHK = new SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16W_HANDLE ;
   private short AV24W_NUM ;
   private short GXt_int2 ;
   private short AV14W_DEL_INDEX ;
   private short Gx_err ;
   private int AV31GXV1 ;
   private String GXv_char1[] ;
   private boolean returnInSub ;
   private boolean AV12W_ADD_KEY_FLG ;
   private String AV13W_DEL_CHR ;
   private String AV23W_MOJI_CD ;
   private String AV26W_SCRIPTPATH ;
   private String AV28W_DIRPATH ;
   private String AV25W_READ_FILE ;
   private String AV22W_LINE ;
   private com.genexus.internet.HttpRequest AV17W_HTTPREQUEST ;
   private com.genexus.util.GXDirectory AV15W_DIR ;
   private GxObjectCollection[] aP0 ;
   private GxObjectCollection AV8W_A801_SD01_SYS_CONFIG ;
   private SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem AV9W_A801_SD01_SYS_CONFIG_ITEM ;
   private SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem AV10W_A801_SD01_SYS_CONFIG_ITEM_KEY ;
   private SdtA801_SD01_SYS_CONFIG_A801_SD01_SYS_CONFIGItem_KEYItem AV11W_A801_SD01_SYS_CONFIG_ITEM_KEY_CHK ;
}

