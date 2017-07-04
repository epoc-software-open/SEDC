/*
               File: B403_WP01_IMPORT_CONFINFO
        Description: 患者・適格性確認情報取込
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:5:18.45
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

}

