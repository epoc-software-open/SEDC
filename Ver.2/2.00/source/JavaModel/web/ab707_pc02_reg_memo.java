/*
               File: B707_PC02_REG_MEMO
        Description: ÉÅÉÇìoò^èàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:36.44
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab707_pc02_reg_memo")
public final  class ab707_pc02_reg_memo extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab707_pc02_reg_memo_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ÉÅÉÇìoò^èàóù";
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

