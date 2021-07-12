/*
               File: TBW03_CRF_SEARCH
        Description: CRF検索ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:31.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw03_crf_search extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw03_crf_search_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF検索ワーク";
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

