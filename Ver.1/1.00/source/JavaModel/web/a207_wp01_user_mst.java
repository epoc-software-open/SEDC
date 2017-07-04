/*
               File: A207_WP01_USER_MST
        Description: ユーザーマスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:59:16.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a207_wp01_user_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a207_wp01_user_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ユーザーマスタメンテナンス（入力）";
   }

}

