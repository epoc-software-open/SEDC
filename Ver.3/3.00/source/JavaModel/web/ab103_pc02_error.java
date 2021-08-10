/*
               File: B103_PC02_ERROR
        Description: エラー処理（DB停止中）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:2.68
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab103_pc02_error extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab103_pc02_error_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "エラー処理（DB停止中）";
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

