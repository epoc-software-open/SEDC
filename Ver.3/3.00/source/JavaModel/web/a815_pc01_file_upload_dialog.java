/*
               File: A815_PC01_FILE_UPLOAD_DIALOG
        Description: ファイルアップロードダイアログ表示処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:14.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a815_pc01_file_upload_dialog extends GXProcedure
{
   public a815_pc01_file_upload_dialog( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a815_pc01_file_upload_dialog.class ), "" );
   }

   public a815_pc01_file_upload_dialog( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( )
   {
      a815_pc01_file_upload_dialog.this.aP0 = aP0;
      a815_pc01_file_upload_dialog.this.aP0 = new String[] {""};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( String[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( String[] aP0 )
   {
      a815_pc01_file_upload_dialog.this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8W_SCRIPT = "<INPUT id=\"UPFILE\" name=\"UPFILE\" type=\"file\" class=\"Edit\" size=\"80\">" + "<script language=\"javascript\">" + "document.forms[" + "0" + "].encoding = \"multipart/form-data\"</script>" ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = a815_pc01_file_upload_dialog.this.AV8W_SCRIPT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_SCRIPT = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8W_SCRIPT ;
   private String[] aP0 ;
}

