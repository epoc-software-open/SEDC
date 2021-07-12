/*
               File: B402_PC27_STUDY_CDISC_ITEM_CSV
        Description: 試験別ドメイン変数マスタCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:31.25
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab402_pc27_study_cdisc_item_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab402_pc27_study_cdisc_item_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験別ドメイン変数マスタCSV出力処理";
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

