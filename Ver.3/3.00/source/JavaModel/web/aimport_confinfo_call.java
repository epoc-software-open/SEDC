/*
               File: IMPORT_CONFINFO_CALL
        Description: ���ҁE�K�i���m�F���捞�ďo���iNetCommons�A�g�j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:27.42
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aimport_confinfo_call extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aimport_confinfo_call_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���ҁE�K�i���m�F���捞�ďo���iNetCommons�A�g�j";
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

