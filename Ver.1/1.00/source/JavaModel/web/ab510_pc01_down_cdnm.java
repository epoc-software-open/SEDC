/*
               File: B510_PC01_DOWN_CDNM
        Description: 項目名称マスタダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:32.31
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab510_pc01_down_cdnm extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab510_pc01_down_cdnm_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "項目名称マスタダウンロード";
   }

}

