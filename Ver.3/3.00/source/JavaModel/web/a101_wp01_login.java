/*
               File: A101_WP01_LOGIN
        Description: ログイン
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:27.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a101_wp01_login extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a101_wp01_login_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ログイン";
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

