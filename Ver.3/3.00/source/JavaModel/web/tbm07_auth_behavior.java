/*
               File: TBM07_AUTH_BEHAVIOR
        Description: �����ʐU���}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:25.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm07_auth_behavior extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm07_auth_behavior_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�����ʐU���}�X�^";
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

