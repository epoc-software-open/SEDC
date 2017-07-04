/*
               File: TBW03_CRF_SEARCH
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:42.96
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw03_crf_search extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw03_crf_search_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF検索ワーク";
   }

}

