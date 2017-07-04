/*
               File: B404_WP02_CRFCOND_REG
        Description: CRF‘I‘ğğŒ“o˜^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:43.57
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b404_wp02_crfcond_reg")
public final  class b404_wp02_crfcond_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b404_wp02_crfcond_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF‘I‘ğğŒ“o˜^";
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

