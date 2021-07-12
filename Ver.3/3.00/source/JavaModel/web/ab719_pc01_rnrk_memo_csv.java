/*
               File: B719_PC01_RNRK_MEMO_CSV
        Description: 連絡メモCSV出力処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:29.28
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab719_pc01_rnrk_memo_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab719_pc01_rnrk_memo_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "連絡メモCSV出力処理";
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

