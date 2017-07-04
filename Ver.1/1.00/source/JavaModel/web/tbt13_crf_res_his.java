/*
               File: TBT13_CRF_RES_HIS
        Description: CRF入力結果履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:24.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt13_crf_res_his extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt13_crf_res_his_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力結果履歴テーブル";
   }

}

