/*
               File: B790_WP02_ERROR_HTML
        Description: 共通エラー画面（HTML5連携）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:29:50.26
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b790_wp02_error_html extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b790_wp02_error_html_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "共通エラー画面（HTML5連携）";
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

