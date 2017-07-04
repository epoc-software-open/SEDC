/*
               File: B401_WP01_IMPORT_USERLIST
        Description: 臨床試験支援システムユーザ一覧取込
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:4:0.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b401_wp01_import_userlist extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b401_wp01_import_userlist_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "臨床試験支援システムユーザ一覧取込";
   }

}

