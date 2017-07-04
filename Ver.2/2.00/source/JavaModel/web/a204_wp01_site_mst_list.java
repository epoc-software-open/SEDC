/*
               File: A204_WP01_SITE_MST_LIST
        Description: 施設マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:50.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a204_wp01_site_mst_list")
public final  class a204_wp01_site_mst_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a204_wp01_site_mst_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "施設マスタメンテナンス（一覧）";
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

