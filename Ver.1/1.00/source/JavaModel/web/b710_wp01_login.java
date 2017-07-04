/*
               File: B710_WP01_LOGIN
        Description: ログイン
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:38.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b710_wp01_login extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b710_wp01_login_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ログイン";
   }

}

