/*
               File: TBW12_CRF_ERR_MSG
        Description: CRF整合性エラーチェックメッセージワークテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:18.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw12_crf_err_msg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw12_crf_err_msg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF整合性エラーチェックメッセージワークテーブル";
   }

}

