/*
               File: B712_WP03_CRF_FILTER_LIST
        Description: CRFフィルタ編集（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:47.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp03_crf_filter_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp03_crf_filter_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFフィルタ編集（一覧）";
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

