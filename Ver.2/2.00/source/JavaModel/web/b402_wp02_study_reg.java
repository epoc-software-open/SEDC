/*
               File: B402_WP02_STUDY_REG
        Description: �����o�^�i���́j
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:11.81
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp02_study_reg")
public final  class b402_wp02_study_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp02_study_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�����o�^�i���́j";
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
