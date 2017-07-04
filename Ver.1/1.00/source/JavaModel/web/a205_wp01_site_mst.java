/*
               File: A205_WP01_SITE_MST
        Description: 施設マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:58:47.69
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

}

