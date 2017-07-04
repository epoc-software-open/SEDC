/*
               File: B402_WP03_STUDY_SITE_REG
        Description: ééå±ìoò^Åié{ê›ëIëÅj
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:19.91
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp03_study_site_reg")
public final  class b402_wp03_study_site_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp03_study_site_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ééå±ìoò^Åié{ê›ëIëÅj";
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

