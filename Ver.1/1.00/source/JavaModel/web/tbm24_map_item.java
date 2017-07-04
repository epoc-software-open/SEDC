/*
               File: TBM24_MAP_ITEM
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:53.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm24_map_item extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm24_map_item_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "マッピング済部品マスタ";
   }

}

