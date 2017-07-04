/*
               File: TBW13_CSV_RECORD
        Description: CSVレコードワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:19.27
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw13_csv_record extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw13_csv_record_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CSVレコードワーク";
   }

}

