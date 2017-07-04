/*
               File: A212_WP01_CDISC_ITEM_LIST
        Description: ドメイン変数マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:26.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a212_wp01_cdisc_item_list")
public final  class a212_wp01_cdisc_item_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a212_wp01_cdisc_item_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン変数マスタメンテナンス（一覧）";
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

