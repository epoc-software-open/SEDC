/*
               File: B702_PC01_GET_CRF_DESIGN
        Description: CRFデザイン情報取得
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:59.22
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab702_pc01_get_crf_design extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab702_pc01_get_crf_design_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFデザイン情報取得";
   }

}

