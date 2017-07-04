/*
               File: B402_WP14_STUDY_CDISC_ITEM_LIST
        Description: 試験登録（ドメイン変数一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:4.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp14_study_cdisc_item_list")
public final  class b402_wp14_study_cdisc_item_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp14_study_cdisc_item_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（ドメイン変数一覧）";
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

