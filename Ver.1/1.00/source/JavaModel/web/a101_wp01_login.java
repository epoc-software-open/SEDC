/*
               File: A101_WP01_LOGIN
        Description: ログイン
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:37.27
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

}

