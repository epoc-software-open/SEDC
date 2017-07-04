/*
               File: B713_WP01_SUBJECT_SINK
        Description: ä≥é“êVãKìoò^âÊñ 
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:56.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b713_wp01_subject_sink")
public final  class b713_wp01_subject_sink extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b713_wp01_subject_sink_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ä≥é“êVãKìoò^âÊñ ";
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

