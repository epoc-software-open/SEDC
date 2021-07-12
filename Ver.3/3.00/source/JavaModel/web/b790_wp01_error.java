/*
               File: B790_WP01_ERROR
        Description: 共通エラー画面（タブレット）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:26.79
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b790_wp01_error extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b790_wp01_error_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "共通エラー画面（タブレット）";
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

