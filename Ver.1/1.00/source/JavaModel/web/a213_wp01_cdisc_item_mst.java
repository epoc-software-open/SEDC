/*
               File: A213_WP01_CDISC_ITEM_MST
        Description: ドメイン変数マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:9:39.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a213_wp01_cdisc_item_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a213_wp01_cdisc_item_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン変数マスタメンテナンス（入力）";
   }

}

