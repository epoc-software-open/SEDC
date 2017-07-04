/*
               File: TBT11_CRF_HISTORY
        Description: CRF修正履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:26.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt11_crf_history extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt11_crf_history_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF修正履歴テーブル";
   }

}

