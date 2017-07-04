/*
               File: A206_PC01_USER_MST_CSV
        Description: ユーザーマスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:50.17
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa206_pc01_user_mst_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa206_pc01_user_mst_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ユーザーマスタCSV出力処理";
   }

}

