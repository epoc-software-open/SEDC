/*
               File: A202_WP01_KNGN_PTN_REG
        Description: 権限パターンマスタメンテナンス（権限）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:58:17.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a202_wp01_kngn_ptn_reg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a202_wp01_kngn_ptn_reg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限パターンマスタメンテナンス（権限）";
   }

}

