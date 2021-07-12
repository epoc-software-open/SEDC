/*
               File: B719_WP01_MEMO_INFO
        Description: ƒƒ‚î•ñ‰æ–Ê
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:29:13.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b719_wp01_memo_info extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b719_wp01_memo_info_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ƒƒ‚î•ñ‰æ–Ê";
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

