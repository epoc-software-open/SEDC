/*
               File: B402_WP09_IMPORT_CSV
        Description: CSV�捞���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:43.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp09_import_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp09_import_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CSV�捞���";
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

