/*
               File: B406_WP01_DESIGN_EXPORT
        Description: 試験情報エクスポート
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:23.98
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b406_wp01_design_export extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b406_wp01_design_export_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験情報エクスポート";
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

