/*
               File: A209_WP01_DOMAIN_MST
        Description: ドメインマスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:27.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a209_wp01_domain_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a209_wp01_domain_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメインマスタメンテナンス（入力）";
   }

}

