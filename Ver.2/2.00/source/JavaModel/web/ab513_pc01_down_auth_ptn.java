/*
               File: B513_PC01_DOWN_AUTH_PTN
        Description: 権限パターンマスタダウンロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:8.41
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab513_pc01_down_auth_ptn")
public final  class ab513_pc01_down_auth_ptn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab513_pc01_down_auth_ptn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタダウンロード";
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

