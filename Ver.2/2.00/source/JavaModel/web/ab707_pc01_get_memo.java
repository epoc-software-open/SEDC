/*
               File: B707_PC01_GET_MEMO
        Description: ƒƒ‚î•ñæ“¾ˆ—
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:37.60
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab707_pc01_get_memo")
public final  class ab707_pc01_get_memo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab707_pc01_get_memo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ƒƒ‚î•ñæ“¾ˆ—";
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

