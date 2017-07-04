/*
               File: A206_WP01_USER_MST_LIST
        Description: ユーザーマスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:58:51.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a206_wp01_user_mst_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a206_wp01_user_mst_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ユーザーマスタメンテナンス（一覧）";
   }

}

