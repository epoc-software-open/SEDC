/*
               File: B712_WP04_CRF_FILTER_EDIT
        Description: CRFフィルタ編集（入力）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:21.51
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp04_crf_filter_edit extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp04_crf_filter_edit_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFフィルタ編集（入力）";
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

