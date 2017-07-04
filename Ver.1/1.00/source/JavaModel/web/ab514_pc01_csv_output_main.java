/*
               File: B514_PC01_CSV_OUTPUT_MAIN
        Description: CSV出力メイン処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.3
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab514_pc01_csv_output_main extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab514_pc01_csv_output_main_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CSV出力メイン処理";
   }

}

