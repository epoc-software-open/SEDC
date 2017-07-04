/*
               File: B502_PC04_DOWN_META
        Description: NetCommonsメタデータダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:37.29
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc04_down_meta extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc04_down_meta_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "NetCommonsメタデータダウンロード";
   }

}

