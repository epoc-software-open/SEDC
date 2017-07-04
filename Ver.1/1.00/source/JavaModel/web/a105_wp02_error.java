/*
               File: A105_WP02_ERROR
        Description: 共通エラー画面（プロンプト）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:43.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a105_wp02_error extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a105_wp02_error_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "共通エラー画面（プロンプト）";
   }

}

