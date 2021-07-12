/*
               File: TAT01_SEL
        Description: お知らせ情報テーブル検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:44.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tat01_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tat01_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "お知らせ情報テーブル検索プロンプト";
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

