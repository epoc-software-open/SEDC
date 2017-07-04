/*
               File: TBM33_CRF_COND
        Description: CRF条件マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:1.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm33_crf_cond extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm33_crf_cond_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF条件マスタ";
   }

}

