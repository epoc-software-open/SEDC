/*
               File: A103_WP01_SYSTEM_MENU
        Description: システムメニュー
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:44.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a103_wp01_system_menu")
public final  class a103_wp01_system_menu extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a103_wp01_system_menu_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "システムメニュー";
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

