/*
               File: TAM02_MENU
        Description: メニューIDマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:43.66
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tam02_menu")
public final  class tam02_menu extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam02_menu_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "メニューIDマスタ";
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

