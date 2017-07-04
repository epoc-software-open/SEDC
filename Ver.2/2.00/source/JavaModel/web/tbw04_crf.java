/*
               File: TBW04_CRF
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:10.54
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw04_crf")
public final  class tbw04_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw04_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFテーブルワーク";
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

