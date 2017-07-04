/*
               File: TBM35_CRF_ITEM_AUTH
        Description: CRF項目権限マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:12.28
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm35_crf_item_auth extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm35_crf_item_auth_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF項目権限マスタ";
   }

}

