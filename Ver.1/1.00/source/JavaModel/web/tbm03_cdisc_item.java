/*
               File: TBM03_CDISC_ITEM
        Description: CDISC項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:19.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm03_cdisc_item extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm03_cdisc_item_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CDISC項目マスタ";
   }

}

