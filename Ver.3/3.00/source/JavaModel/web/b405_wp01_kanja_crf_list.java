/*
               File: B405_WP01_KANJA_CRF_LIST
        Description: ���ҕʎg�pCRF�I��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:50.45
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b405_wp01_kanja_crf_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b405_wp01_kanja_crf_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���ҕʎg�pCRF�I��";
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

