/*
               File: B405_WP01_KANJA_CRF_LIST
        Description: 患者別使用CRF選択
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:18:7.21
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b405_wp01_kanja_crf_list")
public final  class b405_wp01_kanja_crf_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b405_wp01_kanja_crf_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者別使用CRF選択";
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

