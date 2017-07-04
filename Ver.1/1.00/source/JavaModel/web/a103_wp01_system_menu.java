/*
               File: A103_WP01_SYSTEM_MENU
        Description: システムメニュー
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:39.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a103_wp01_system_menu extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a103_wp01_system_menu_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "システムメニュー";
   }

}

