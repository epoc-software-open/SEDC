/*
               File: B704_PC01_SET_CRF_VAL
        Description: CRF入力データ保存処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:7.36
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab704_pc01_set_crf_val extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab704_pc01_set_crf_val_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF入力データ保存処理";
   }

}

