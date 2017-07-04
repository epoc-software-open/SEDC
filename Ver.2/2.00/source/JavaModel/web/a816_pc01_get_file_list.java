/*
               File: A816_PC01_GET_FILE_LIST
        Description: ÉtÉ@ÉCÉãñºàÍóóéÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:45.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a816_pc01_get_file_list extends GXProcedure
{
   public a816_pc01_get_file_list( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a816_pc01_get_file_list.class ), "" );
   }

   public a816_pc01_get_file_list( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           GxObjectCollection[] aP2 )
   {
      a816_pc01_get_file_list.this.AV8P_FILE_PATH = aP0;
      a816_pc01_get_file_list.this.AV9P_KBN = aP1;
      a816_pc01_get_file_list.this.aP2 = aP2;
      a816_pc01_get_file_list.this.aP3 = aP3;
      a816_pc01_get_file_list.this.aP3 = new byte[] {0};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        GxObjectCollection[] aP2 ,
                        byte[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             GxObjectCollection[] aP2 ,
                             byte[] aP3 )
   {
      a816_pc01_get_file_list.this.AV8P_FILE_PATH = aP0;
      a816_pc01_get_file_list.this.AV9P_KBN = aP1;
      a816_pc01_get_file_list.this.aP2 = aP2;
      a816_pc01_get_file_list.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV24W_RTN = (byte)(0) ;
      AV22W_PATH.setSource( AV8P_FILE_PATH );
      AV15W_DIR_CNT = AV22W_PATH.getDirectories().getItemCount() ;
      AV14W_CNT = (short)(1) ;
      while ( AV14W_CNT <= AV15W_DIR_CNT )
      {
         AV11W_SD_FILE_LIST_I = (SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)new SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem(remoteHandle, context);
         AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name( AV22W_PATH.getDirectories().item(AV14W_CNT).getAbsoluteName() );
         AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type( "directory" );
         if ( GXutil.strcmp(AV11W_SD_FILE_LIST_I.getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type(), "directory") == 0 )
         {
            AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( (byte)(1) );
         }
         else
         {
            AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( (byte)(0) );
         }
         AV10W_SD_FILE_LIST.add(AV11W_SD_FILE_LIST_I, 0);
         if ( GXutil.strcmp(AV9P_KBN, "1") == 0 )
         {
            AV16W_DIR_NAME = AV22W_PATH.getDirectories().item(AV14W_CNT).getAbsoluteName() ;
            GXv_objcol_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem1[0] = AV13W_SD_FILE_LIST2 ;
            GXv_int2[0] = AV24W_RTN ;
            new a816_pc01_get_file_list(remoteHandle, context).execute( AV16W_DIR_NAME, AV9P_KBN, GXv_objcol_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem1, GXv_int2) ;
            AV13W_SD_FILE_LIST2 = GXv_objcol_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem1[0] ;
            a816_pc01_get_file_list.this.AV24W_RTN = GXv_int2[0] ;
            if ( AV24W_RTN == 0 )
            {
               AV28GXV1 = 1 ;
               while ( AV28GXV1 <= AV13W_SD_FILE_LIST2.size() )
               {
                  AV12W_SD_FILE_LIST_I2 = (SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)((SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)AV13W_SD_FILE_LIST2.elementAt(-1+AV28GXV1));
                  AV11W_SD_FILE_LIST_I = (SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)new SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem(remoteHandle, context);
                  AV11W_SD_FILE_LIST_I = AV12W_SD_FILE_LIST_I2;
                  AV10W_SD_FILE_LIST.add(AV11W_SD_FILE_LIST_I, 0);
                  AV28GXV1 = (int)(AV28GXV1+1) ;
               }
            }
            else
            {
               if (true) break;
            }
         }
         AV14W_CNT = (short)(AV14W_CNT+1) ;
      }
      if ( AV24W_RTN == 0 )
      {
         AV20W_FILE_NUM = AV22W_PATH.getFiles("").getItemCount() ;
         AV14W_CNT = (short)(1) ;
         while ( AV14W_CNT <= AV20W_FILE_NUM )
         {
            AV11W_SD_FILE_LIST_I = (SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem)new SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem(remoteHandle, context);
            AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name( AV22W_PATH.getFiles("").item(AV14W_CNT).getAbsoluteName() );
            AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size( AV22W_PATH.getFiles("").item(AV14W_CNT).getLength() );
            AV23W_POS = (byte)(GXutil.strSearchRev( AV11W_SD_FILE_LIST_I.getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name(), ".", -1)) ;
            AV21W_LEN = (byte)(GXutil.len( AV11W_SD_FILE_LIST_I.getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name())-AV23W_POS) ;
            AV23W_POS = (byte)(AV23W_POS+1) ;
            AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type( GXutil.substring( AV11W_SD_FILE_LIST_I.getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name(), AV23W_POS, AV21W_LEN) );
            if ( GXutil.strcmp(AV11W_SD_FILE_LIST_I.getgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type(), "directory") == 0 )
            {
               AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( (byte)(1) );
            }
            else
            {
               AV11W_SD_FILE_LIST_I.setgxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb( (byte)(0) );
            }
            AV10W_SD_FILE_LIST.add(AV11W_SD_FILE_LIST_I, 0);
            AV14W_CNT = (short)(AV14W_CNT+1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a816_pc01_get_file_list.this.AV10W_SD_FILE_LIST;
      this.aP3[0] = a816_pc01_get_file_list.this.AV24W_RTN;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_SD_FILE_LIST = new GxObjectCollection(SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem.class, "A816_SD01_FILE_LIST.A816_SD01_FILE_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV22W_PATH = new com.genexus.util.GXDirectory();
      AV11W_SD_FILE_LIST_I = new SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem(remoteHandle, context);
      AV16W_DIR_NAME = "" ;
      AV13W_SD_FILE_LIST2 = new GxObjectCollection(SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem.class, "A816_SD01_FILE_LIST.A816_SD01_FILE_LISTItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      GXv_objcol_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem1 = new GxObjectCollection [1] ;
      GXv_int2 = new byte [1] ;
      AV12W_SD_FILE_LIST_I2 = new SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV24W_RTN ;
   private byte GXv_int2[] ;
   private byte AV23W_POS ;
   private byte AV21W_LEN ;
   private short AV14W_CNT ;
   private short Gx_err ;
   private int AV28GXV1 ;
   private long AV15W_DIR_CNT ;
   private long AV20W_FILE_NUM ;
   private String AV8P_FILE_PATH ;
   private String AV9P_KBN ;
   private String AV16W_DIR_NAME ;
   private com.genexus.util.GXDirectory AV22W_PATH ;
   private GxObjectCollection[] aP2 ;
   private byte[] aP3 ;
   private GxObjectCollection AV10W_SD_FILE_LIST ;
   private GxObjectCollection AV13W_SD_FILE_LIST2 ;
   private GxObjectCollection GXv_objcol_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem1[] ;
   private SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem AV11W_SD_FILE_LIST_I ;
   private SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem AV12W_SD_FILE_LIST_I2 ;
}

