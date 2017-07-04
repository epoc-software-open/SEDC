/*
               File: B506_PC01_DOWN_CRF_VAL
        Description: CRF入力データダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:15.65
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc01_down_crf_val extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab506_pc01_down_crf_val_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力データダウンロード";
   }

}

