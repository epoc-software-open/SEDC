/*
               File: TBW16_DOM_MAP_VISIT
        Description: CRFドメインマッピングVISIT番号参照ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:41.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw16_dom_map_visit")
public final  class tbw16_dom_map_visit extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw16_dom_map_visit_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFドメインマッピングVISIT番号参照ワーク";
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

