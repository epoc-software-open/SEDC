/*
               File: B714_WP01_CRF_REPEAT
        Description: 次入力用CRF追加画面
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:43.66
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b714_wp01_crf_repeat")
public final  class b714_wp01_crf_repeat extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b714_wp01_crf_repeat_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "次入力用CRF追加画面";
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

