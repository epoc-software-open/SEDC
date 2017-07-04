/*
               File: B404_WP01_CRFCOND_LIST
        Description: CRF‘I‘ğğŒˆê——
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:22.8
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b404_wp01_crfcond_list")
public final  class b404_wp01_crfcond_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b404_wp01_crfcond_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF‘I‘ğğŒˆê——";
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

