/*
               File: A212_WP01_CDISC_ITEM_LIST
        Description: ドメイン変数マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:33.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a212_wp01_cdisc_item_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a212_wp01_cdisc_item_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン変数マスタメンテナンス（一覧）";
   }

}

