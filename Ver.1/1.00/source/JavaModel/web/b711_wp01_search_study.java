/*
               File: B711_WP01_SEARCH_STUDY
        Description: 試験検索・権限選択画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:5:19.16
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
      return "試験検索・権限選択画面";
   }

}

