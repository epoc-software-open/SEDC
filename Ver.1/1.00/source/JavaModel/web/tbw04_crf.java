/*
               File: TBW04_CRF
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:58.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw04_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw04_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFテーブルワーク";
   }

}

