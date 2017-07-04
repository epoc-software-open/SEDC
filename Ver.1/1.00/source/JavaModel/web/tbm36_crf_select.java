/*
               File: TBM36_CRF_SELECT
        Description: CRF選択マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:16.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm36_crf_select extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm36_crf_select_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF選択マスタ";
   }

}

