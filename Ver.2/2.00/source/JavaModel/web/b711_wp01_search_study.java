/*
               File: B711_WP01_SEARCH_STUDY
        Description: 試験検索・権限選択画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:9.41
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b711_wp01_search_study")
public final  class b711_wp01_search_study extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b711_wp01_search_study_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験検索・権限選択画面";
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

