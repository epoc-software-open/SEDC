/*
               File: B704_PC01_SET_CRF_VAL
        Description: CRF入力データ保存処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: March 3, 2021 14:42:18.30
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

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

