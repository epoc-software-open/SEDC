/*
               File: B518_PC01_DOWN_SITE
        Description: 施設マスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:45.83
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab518_pc01_down_site extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab518_pc01_down_site_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "施設マスタダウンロード";
   }

}

