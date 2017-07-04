/*
               File: TBM02_CDISC_DOMAIN
        Description: CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:32.6
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm02_cdisc_domain extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm02_cdisc_domain_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CDISCドメインマスタ";
   }

}

