/*
               File: B712_WP06_PDF_SELECT
        Description: PDF選択ポップアップ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:37.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b712_wp06_pdf_select extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b712_wp06_pdf_select_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "PDF選択ポップアップ";
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

