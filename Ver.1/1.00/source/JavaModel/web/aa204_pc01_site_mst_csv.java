/*
               File: A204_PC01_SITE_MST_CSV
        Description: 施設マスタCSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:49.35
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa204_pc01_site_mst_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa204_pc01_site_mst_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "施設マスタCSV出力処理";
   }

}

