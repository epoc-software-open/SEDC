/*
               File: B402_WP11_CRF_DESIGNER
        Description: CRF�f�U�C���ҏW���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:29.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp11_crf_designer extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp11_crf_designer_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF�f�U�C���ҏW���";
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

