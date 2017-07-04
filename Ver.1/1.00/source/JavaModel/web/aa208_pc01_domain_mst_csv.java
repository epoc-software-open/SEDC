/*
               File: A208_PC01_DOMAIN_MST_CSV
        Description: ドメインマスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:18.7
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa208_pc01_domain_mst_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa208_pc01_domain_mst_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメインマスタCSV出力処理";
   }

}

