/*
               File: TBM26_SEL_LIST_ITEM
        Description: 選択リスト項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:4.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm26_sel_list_item extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm26_sel_list_item_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "選択リスト項目マスタ";
   }

}

