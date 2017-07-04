/*
               File: TAS01_CDNM
        Description: 項目名称マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:42.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tas01_cdnm extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tas01_cdnm_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "項目名称マスタ";
   }

}

