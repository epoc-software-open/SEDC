/*
               File: A105_WP03_ERROR
        Description: 共通エラー画面（DB停止中）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:36.88
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a105_wp03_error extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a105_wp03_error_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "共通エラー画面（DB停止中）";
   }

}

