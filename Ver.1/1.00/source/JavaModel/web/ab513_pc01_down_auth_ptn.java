/*
               File: B513_PC01_DOWN_AUTH_PTN
        Description: 権限パターンマスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:37.60
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab513_pc01_down_auth_ptn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab513_pc01_down_auth_ptn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタダウンロード";
   }

}

