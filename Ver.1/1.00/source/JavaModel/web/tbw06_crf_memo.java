/*
               File: TBW06_CRF_MEMO
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:7.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw06_crf_memo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw06_crf_memo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFメモテーブル";
   }

}

