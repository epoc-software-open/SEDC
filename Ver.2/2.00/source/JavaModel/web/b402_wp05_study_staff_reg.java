/*
               File: B402_WP05_STUDY_STAFF_REG
        Description: 試験登録（参加スタッフ選択）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:17:42.25
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/b402_wp05_study_staff_reg")
public final  class b402_wp05_study_staff_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp05_study_staff_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（参加スタッフ選択）";
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

