/*
               File: B510_PC01_DOWN_CDNM
        Description: 項目名称マスタダウンロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:5.24
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab510_pc01_down_cdnm")
public final  class ab510_pc01_down_cdnm extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab510_pc01_down_cdnm_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "項目名称マスタダウンロード";
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

