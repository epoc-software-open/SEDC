/*
               File: TBW05_CRF_RESULT
        Description: CRF入力結果テーブルワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:4.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw05_crf_result extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw05_crf_result_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力結果テーブルワーク";
   }

}

