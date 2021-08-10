/*
               File: B403_WP01_IMPORT_CONFINFO
        Description: 患者・適格性確認情報取込
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:25:7.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b403_wp01_import_confinfo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b403_wp01_import_confinfo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者・適格性確認情報取込";
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

