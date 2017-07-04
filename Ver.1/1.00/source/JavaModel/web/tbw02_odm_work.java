/*
               File: TBW02_ODM_WORK
        Description: ODM出力用ワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:46.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw02_odm_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw02_odm_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ODM出力用ワーク";
   }

}

