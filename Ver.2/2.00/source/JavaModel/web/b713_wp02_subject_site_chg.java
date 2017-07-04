/*
               File: B713_WP02_SUBJECT_SITE_CHG
        Description: ä≥é“é{ê›ïœçXâÊñ 
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:41.7
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b713_wp02_subject_site_chg")
public final  class b713_wp02_subject_site_chg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b713_wp02_subject_site_chg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ä≥é“é{ê›ïœçXâÊñ ";
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

