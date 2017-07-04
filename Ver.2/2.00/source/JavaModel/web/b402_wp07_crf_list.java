/*
               File: B402_WP07_CRF_LIST
        Description: Œ±“o˜^iCRFˆê——j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:24.87
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp07_crf_list")
public final  class b402_wp07_crf_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp07_crf_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "Œ±“o˜^iCRFˆê——j";
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

