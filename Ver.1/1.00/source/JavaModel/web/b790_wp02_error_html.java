/*
               File: B790_WP02_ERROR_HTML
        Description: 共通エラー画面（HTML5連携）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:22.21
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

}

