/*
               File: A811_PC01_DOWNLOAD_DIALOG
        Description: ダウンロードダイアログ表示処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.10
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/aa811_pc01_download_dialog")
public final  class aa811_pc01_download_dialog extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa811_pc01_download_dialog_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ダウンロードダイアログ表示処理";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

