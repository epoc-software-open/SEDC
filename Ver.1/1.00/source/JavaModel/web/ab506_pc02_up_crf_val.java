/*
               File: B506_PC02_UP_CRF_VAL
        Description: CRF入力データアップロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:19.48
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab506_pc02_up_crf_val extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab506_pc02_up_crf_val_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力データアップロード";
   }

}

