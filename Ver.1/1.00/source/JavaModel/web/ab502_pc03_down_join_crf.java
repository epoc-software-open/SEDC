/*
               File: B502_PC03_DOWN_JOIN_CRF
        Description: CRF結合ダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:35.9
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc03_down_join_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc03_down_join_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF結合ダウンロード";
   }

}

