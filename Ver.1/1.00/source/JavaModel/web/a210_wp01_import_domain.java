/*
               File: A210_WP01_IMPORT_DOMAIN
        Description: ドメイン取込画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:32.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a210_wp01_import_domain extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a210_wp01_import_domain_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン取込画面";
   }

}

