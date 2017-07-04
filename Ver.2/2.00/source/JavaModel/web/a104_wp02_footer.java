/*
               File: A104_WP02_FOOTER
        Description: フッター
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:38.28
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a104_wp02_footer")
public final  class a104_wp02_footer extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a104_wp02_footer_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "フッター";
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

