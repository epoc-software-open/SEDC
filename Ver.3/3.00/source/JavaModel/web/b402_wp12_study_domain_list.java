/*
               File: B402_WP12_STUDY_DOMAIN_LIST
        Description: 試験登録（ドメイン選択）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:23:49.86
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp12_study_domain_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp12_study_domain_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（ドメイン選択）";
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

