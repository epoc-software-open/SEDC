/*
               File: B712_WP02_RESULT_CRF
        Description: CRF��������
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: May 7, 2021 9:57:11.97
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp02_result_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp02_result_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF��������";
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

