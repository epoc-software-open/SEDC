/*
               File: TBW01_FREE_WORK
        Description: 汎用ワークテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:39.60
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw01_free_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw01_free_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "汎用ワークテーブル";
   }

}

