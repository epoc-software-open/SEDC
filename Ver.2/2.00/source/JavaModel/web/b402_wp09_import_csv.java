/*
               File: B402_WP09_IMPORT_CSV
        Description: CSVéÊçûâÊñ 
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:54.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp09_import_csv")
public final  class b402_wp09_import_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp09_import_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CSVéÊçûâÊñ ";
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

