/*
               File: TBW07_CRF_MEMO_LOC
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:23.97
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbw07_crf_memo_loc")
public final  class tbw07_crf_memo_loc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbw07_crf_memo_loc_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFメモ位置テーブル";
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

