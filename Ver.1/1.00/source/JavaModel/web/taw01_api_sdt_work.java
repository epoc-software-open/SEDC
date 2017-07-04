/*
               File: TAW01_API_SDT_WORK
        Description: アプリケーションSDTテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:4.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class taw01_api_sdt_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new taw01_api_sdt_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "アプリケーションSDTテーブル";
   }

}

