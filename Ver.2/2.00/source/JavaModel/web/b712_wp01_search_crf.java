/*
               File: B712_WP01_SEARCH_CRF
        Description: CRFõð
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:16.66
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b712_wp01_search_crf")
public final  class b712_wp01_search_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp01_search_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFõð";
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

