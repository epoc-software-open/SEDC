/*
               File: A211_WP01_IMPORT_CDISC_ITEM
        Description: ドメイン変数取込画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:46.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a211_wp01_import_cdisc_item extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a211_wp01_import_cdisc_item_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン変数取込画面";
   }

}

