/*
               File: TAM02_SEL
        Description: メニューIDマスタ検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:46.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tam02_sel")
public final  class tam02_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam02_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "メニューIDマスタ検索プロンプト";
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

