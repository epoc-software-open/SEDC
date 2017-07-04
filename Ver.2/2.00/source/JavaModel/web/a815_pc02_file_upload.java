/*
               File: A815_PC02_FILE_UPLOAD
        Description: ファイルアップロード処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.90
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a815_pc02_file_upload extends GXProcedure
{
   public a815_pc02_file_upload( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a815_pc02_file_upload.class ), "" );
   }

   public a815_pc02_file_upload( int remoteHandle ,
                                 ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      a815_pc02_file_upload.this.AV21P_A_LOGIN_SDT = aP0;
      a815_pc02_file_upload.this.AV15P_SYS_ID = aP1;
      a815_pc02_file_upload.this.AV14P_KINOU_ID_SEQ = aP2;
      a815_pc02_file_upload.this.AV13P_EXTN = aP3;
      a815_pc02_file_upload.this.aP4 = aP4;
      a815_pc02_file_upload.this.aP5 = aP5;
      a815_pc02_file_upload.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( SdtA_LOGIN_SDT aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( SdtA_LOGIN_SDT aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      a815_pc02_file_upload.this.AV21P_A_LOGIN_SDT = aP0;
      a815_pc02_file_upload.this.AV15P_SYS_ID = aP1;
      a815_pc02_file_upload.this.AV14P_KINOU_ID_SEQ = aP2;
      a815_pc02_file_upload.this.AV13P_EXTN = aP3;
      a815_pc02_file_upload.this.aP4 = aP4;
      a815_pc02_file_upload.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = a815_pc02_file_upload.this.AV20W_UPLOAD_PATH_FILE;
      this.aP5[0] = a815_pc02_file_upload.this.AV17W_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV20W_UPLOAD_PATH_FILE = "" ;
      AV17W_MSG = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV15P_SYS_ID ;
   private String AV14P_KINOU_ID_SEQ ;
   private String AV13P_EXTN ;
   private String AV20W_UPLOAD_PATH_FILE ;
   private String AV17W_MSG ;
   private String[] aP4 ;
   private String[] aP5 ;
   private SdtA_LOGIN_SDT AV21P_A_LOGIN_SDT ;
}

