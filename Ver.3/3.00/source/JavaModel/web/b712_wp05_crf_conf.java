/*
               File: B712_WP05_CRF_CONF
        Description: CRF保存・提出確認ポップアップ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:23.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp05_crf_conf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp05_crf_conf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF保存・提出確認ポップアップ";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

