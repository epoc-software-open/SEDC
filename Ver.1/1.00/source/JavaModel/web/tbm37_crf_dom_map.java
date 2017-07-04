/*
               File: TBM37_CRF_DOM_MAP
        Description: CRF-ドメインマッピングマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:10.18
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm37_crf_dom_map extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm37_crf_dom_map_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF-ドメインマッピングマスタ";
   }

}

