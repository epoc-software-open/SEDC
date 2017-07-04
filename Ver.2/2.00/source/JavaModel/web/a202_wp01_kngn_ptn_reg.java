/*
               File: A202_WP01_KNGN_PTN_REG
        Description: 権限パターンマスタメンテナンス（権限）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:53.68
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/a202_wp01_kngn_ptn_reg")
public final  class a202_wp01_kngn_ptn_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a202_wp01_kngn_ptn_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタメンテナンス（権限）";
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

