/*
               File: B516_PC01_DOWN_APPLI_KNGN
        Description: アプリケーション権限マスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:44.48
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab516_pc01_down_appli_kngn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab516_pc01_down_appli_kngn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "アプリケーション権限マスタダウンロード";
   }

}

