/*
               File: B506_PC03_UPDATE_CRF_LOCK
        Description: CRF入力データロック切替
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:39.46
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc03_update_crf_lock extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab506_pc03_update_crf_lock_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力データロック切替";
   }

}

