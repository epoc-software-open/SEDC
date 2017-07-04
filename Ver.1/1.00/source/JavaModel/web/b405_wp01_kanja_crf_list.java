/*
               File: B405_WP01_KANJA_CRF_LIST
        Description: 患者別使用CRF選択
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:4:24.14
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b405_wp01_kanja_crf_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b405_wp01_kanja_crf_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者別使用CRF選択";
   }

}

