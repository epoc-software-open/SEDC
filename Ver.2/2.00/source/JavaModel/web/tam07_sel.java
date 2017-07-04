/*
               File: TAM07_SEL
        Description: ユーザマスタ検索プロンプト
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:50.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tam07_sel")
public final  class tam07_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam07_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ユーザマスタ検索プロンプト";
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

