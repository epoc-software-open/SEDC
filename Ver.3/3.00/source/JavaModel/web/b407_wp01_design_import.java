/*
               File: B407_WP01_DESIGN_IMPORT
        Description: 試験情報インポート
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:29.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b407_wp01_design_import extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b407_wp01_design_import_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験情報インポート";
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

