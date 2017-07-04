/*
               File: TBW10_CSV_WORK
        Description: TBW10_CSV_WORK
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:28.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw10_csv_work")
public final  class tbw10_csv_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw10_csv_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "TBW10_CSV_WORK";
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

