/*
               File: TBW15_TBM37REFMIN
        Description: CRFドメインマッピング参照ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:40.22
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw15_tbm37refmin")
public final  class tbw15_tbm37refmin extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw15_tbm37refmin_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFドメインマッピング参照ワーク";
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

