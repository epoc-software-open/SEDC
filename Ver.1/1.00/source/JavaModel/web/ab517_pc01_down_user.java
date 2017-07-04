/*
               File: B517_PC01_DOWN_USER
        Description: ユーザーマスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:45.19
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab517_pc01_down_user extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab517_pc01_down_user_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "ユーザーマスタダウンロード";
   }

}

