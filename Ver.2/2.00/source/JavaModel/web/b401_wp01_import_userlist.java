/*
               File: B401_WP01_IMPORT_USERLIST
        Description: 臨床試験支援システムユーザ一覧取込
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:36.81
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b401_wp01_import_userlist")
public final  class b401_wp01_import_userlist extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b401_wp01_import_userlist_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "臨床試験支援システムユーザ一覧取込";
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

