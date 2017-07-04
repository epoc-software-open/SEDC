/*
               File: A203_WP01_KNGN_MST
        Description: 権限パターンマスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:58:12.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a203_wp01_kngn_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a203_wp01_kngn_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタメンテナンス（入力）";
   }

}

