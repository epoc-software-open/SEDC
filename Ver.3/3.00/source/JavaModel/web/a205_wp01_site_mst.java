/*
               File: A205_WP01_SITE_MST
        Description: 施設マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:52.42
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a205_wp01_site_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a205_wp01_site_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "施設マスタメンテナンス（入力）";
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

