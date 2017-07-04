/*
               File: B402_WP05_STUDY_STAFF_REG
        Description: 試験登録（参加スタッフ選択）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:2:30.36
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

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

}

