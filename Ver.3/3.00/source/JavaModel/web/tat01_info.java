/*
               File: TAT01_INFO
        Description: お知らせ情報テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:35.34
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tat01_info extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tat01_info_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "お知らせ情報テーブル";
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

