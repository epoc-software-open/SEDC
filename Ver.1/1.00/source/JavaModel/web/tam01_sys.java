/*
               File: TAM01_SYS
        Description: システムIDマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:30.91
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam01_sys extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam01_sys_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "システムIDマスタ";
   }

}

