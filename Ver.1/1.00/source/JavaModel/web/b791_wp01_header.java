/*
               File: B791_WP01_HEADER
        Description: ヘッダー
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:40.90
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

}

