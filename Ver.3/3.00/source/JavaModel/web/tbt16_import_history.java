/*
               File: TBT16_IMPORT_HISTORY
        Description: �I���ꗗ�捞�����e�[�u��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:3.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt16_import_history extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt16_import_history_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�I���ꗗ�捞�����e�[�u��";
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

