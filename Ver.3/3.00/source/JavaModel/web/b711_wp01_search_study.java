/*
               File: B711_WP01_SEARCH_STUDY
        Description: ���������E�����I�����
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:25:8.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b711_wp01_search_study extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b711_wp01_search_study_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���������E�����I�����";
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

