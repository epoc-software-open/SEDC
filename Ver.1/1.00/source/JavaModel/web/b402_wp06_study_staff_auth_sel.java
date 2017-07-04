/*
               File: B402_WP06_STUDY_STAFF_AUTH_SEL
        Description: 試験登録（参加スタッフ権限選択）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:4:0.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp06_study_staff_auth_sel extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp06_study_staff_auth_sel_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（参加スタッフ権限選択）";
   }

}

