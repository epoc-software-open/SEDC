/*
               File: TAM04BC_KNGN
        Description: 権限パターンマスタ（ビジネスコンポーネント）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:6.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam04bc_kngn extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tam04bc_kngn_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタ（ビジネスコンポーネント）";
   }

}

