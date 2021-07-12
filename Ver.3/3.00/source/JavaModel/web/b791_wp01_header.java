/*
               File: B791_WP01_HEADER
        Description: ヘッダー
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: March 3, 2021 14:42:17.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b791_wp01_header extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b791_wp01_header_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ヘッダー";
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

