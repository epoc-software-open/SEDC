/*
               File: TAM07_USER
        Description: ���[�U�[�}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:43.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam07_user extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam07_user_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���[�U�[�}�X�^";
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

