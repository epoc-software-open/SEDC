/*
               File: B702_PC01_GET_CRF_DESIGN
        Description: CRFデザイン情報取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:20.46
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab702_pc01_get_crf_design")
public final  class ab702_pc01_get_crf_design extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab702_pc01_get_crf_design_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFデザイン情報取得";
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

