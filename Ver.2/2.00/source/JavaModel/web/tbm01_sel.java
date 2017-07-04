/*
               File: TBM01_SEL
        Description: Selection List システム規定値マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:51.16
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbm01_sel")
public final  class tbm01_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm01_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "Selection List システム規定値マスタ";
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

