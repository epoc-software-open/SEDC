/*
               File: TBM25_SEL_LIST
        Description: 選択リストマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:36.32
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm25_sel_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm25_sel_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "選択リストマスタ";
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

