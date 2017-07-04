/*
               File: RwdMasterPage
        Description: Responsive Master Page
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:43.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/rwdmasterpage")
public final  class rwdmasterpage extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rwdmasterpage_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "Responsive Master Page";
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

