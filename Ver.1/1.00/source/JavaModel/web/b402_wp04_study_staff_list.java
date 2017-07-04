/*
               File: B402_WP04_STUDY_STAFF_LIST
        Description: 試験登録（参加スタッフ一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:59:57.81
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp04_study_staff_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp04_study_staff_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（参加スタッフ一覧）";
   }

}

