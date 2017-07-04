/*
               File: B401_PC01_IMPORT_USERLIST
        Description: 臨床試験支援システムユーザー一覧取込（リクエスト実行）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:12.79
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab401_pc01_import_userlist")
public final  class ab401_pc01_import_userlist extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab401_pc01_import_userlist_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "臨床試験支援システムユーザー一覧取込（リクエスト実行）";
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

