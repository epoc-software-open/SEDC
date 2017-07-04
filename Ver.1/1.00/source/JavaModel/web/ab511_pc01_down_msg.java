/*
               File: B511_PC01_DOWN_MSG
        Description: メッセージマスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:33.26
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab511_pc01_down_msg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab511_pc01_down_msg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "メッセージマスタダウンロード";
   }

}

