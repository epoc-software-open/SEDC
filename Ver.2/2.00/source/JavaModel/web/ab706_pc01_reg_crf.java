/*
               File: B706_PC01_REG_CRF
        Description: CRF“ü—Íƒf[ƒ^“o˜^ˆ—
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:24.79
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab706_pc01_reg_crf")
public final  class ab706_pc01_reg_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab706_pc01_reg_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF“ü—Íƒf[ƒ^“o˜^ˆ—";
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

