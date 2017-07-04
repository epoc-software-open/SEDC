/*
               File: B707_PC03_KANRYO_MEMO
        Description: メモ確認完了処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:22.40
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab707_pc03_kanryo_memo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab707_pc03_kanryo_memo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "メモ確認完了処理";
   }

}

