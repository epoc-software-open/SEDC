/*
               File: TBM08_AUTH_INP_LVL
        Description: 権限別入力制御マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:23.58
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm08_auth_inp_lvl extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm08_auth_inp_lvl_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "権限別入力制御マスタ";
   }

}

