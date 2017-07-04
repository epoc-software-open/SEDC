/*
               File: B502_PC02_UP_CRF
        Description: CRFアップロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:2.47
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc02_up_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc02_up_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFアップロード";
   }

}

