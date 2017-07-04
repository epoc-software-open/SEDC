/*
               File: TBM07_AUTH_BEHAVIOR
        Description: 権限別振舞マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:36.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm07_auth_behavior extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm07_auth_behavior_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限別振舞マスタ";
   }

}

