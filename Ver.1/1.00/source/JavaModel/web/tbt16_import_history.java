/*
               File: TBT16_IMPORT_HISTORY
        Description: 選択一覧取込履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:20.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt16_import_history extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt16_import_history_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "選択一覧取込履歴テーブル";
   }

}

