/*
               File: B501_PC01_LOGIN
        Description: ログイン認証
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.90
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab501_pc01_login extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab501_pc01_login_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ログイン認証";
   }

}

