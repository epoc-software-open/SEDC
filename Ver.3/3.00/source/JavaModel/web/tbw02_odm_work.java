/*
               File: TBW02_ODM_WORK
        Description: ODM�o�͗p���[�N
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:22.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw02_odm_work extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw02_odm_work_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ODM�o�͗p���[�N";
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

