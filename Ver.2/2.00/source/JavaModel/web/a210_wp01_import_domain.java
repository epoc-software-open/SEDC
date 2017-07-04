/*
               File: A210_WP01_IMPORT_DOMAIN
        Description: ドメイン取込画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:23.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a210_wp01_import_domain")
public final  class a210_wp01_import_domain extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a210_wp01_import_domain_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン取込画面";
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

