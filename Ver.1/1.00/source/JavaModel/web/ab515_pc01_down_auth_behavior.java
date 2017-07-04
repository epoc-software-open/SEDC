/*
               File: B515_PC01_DOWN_AUTH_BEHAVIOR
        Description: 権限別振舞マスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:43.79
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab515_pc01_down_auth_behavior extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab515_pc01_down_auth_behavior_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限別振舞マスタダウンロード";
   }

}

