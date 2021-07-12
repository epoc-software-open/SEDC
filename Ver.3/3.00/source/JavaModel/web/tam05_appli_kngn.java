/*
               File: TAM05_APPLI_KNGN
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:40.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam05_appli_kngn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam05_appli_kngn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "アプリケーション権限マスタ";
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

