/*
               File: IMPORT_CONFINFO_CALL
        Description: 患者・適格性確認情報取込呼出し（NetCommons連携）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:28.65
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class aimport_confinfo_call extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new aimport_confinfo_call_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者・適格性確認情報取込呼出し（NetCommons連携）";
   }

}

