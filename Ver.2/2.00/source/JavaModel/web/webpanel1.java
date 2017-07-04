/*
               File: WebPanel1
        Description: Web Panel1
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:51.80
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/webpanel1")
public final  class webpanel1 extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webpanel1_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "Web Panel1";
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

