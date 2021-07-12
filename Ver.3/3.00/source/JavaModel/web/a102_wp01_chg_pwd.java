/*
               File: A102_WP01_CHG_PWD
        Description: パスワード変更
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:31.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a102_wp01_chg_pwd extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a102_wp01_chg_pwd_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "パスワード変更";
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

