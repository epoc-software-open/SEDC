/*
               File: A212_PC01_CDISC_ITEM_CSV
        Description: ドメイン変数マスタCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:30.81
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aa212_pc01_cdisc_item_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aa212_pc01_cdisc_item_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ドメイン変数マスタCSV出力処理";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

