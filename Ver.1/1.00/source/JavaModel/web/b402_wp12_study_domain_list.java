/*
               File: B402_WP12_STUDY_DOMAIN_LIST
        Description: 試験登録（ドメイン選択）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:1:59.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp12_study_domain_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp12_study_domain_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験登録（ドメイン選択）";
   }

}

