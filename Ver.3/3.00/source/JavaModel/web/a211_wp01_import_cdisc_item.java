/*
               File: A211_WP01_IMPORT_CDISC_ITEM
        Description: �h���C���ϐ��捞���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:23.98
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
      return "�h���C���ϐ��捞���";
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

