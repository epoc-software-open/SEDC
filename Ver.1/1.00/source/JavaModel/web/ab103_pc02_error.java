/*
               File: B103_PC02_ERROR
        Description: エラー処理（DB停止中）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:52.20
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab103_pc02_error extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab103_pc02_error_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "エラー処理（DB停止中）";
   }

}

