/*
               File: A201_WP01_KNGN_PTN_LIST
        Description: 権限パターンマスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:47.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a201_wp01_kngn_ptn_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a201_wp01_kngn_ptn_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタメンテナンス（一覧）";
   }

}

