/*
               File: B713_WP02_SUBJECT_SITE_CHG
        Description: ���Ҏ{�ݕύX���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:40.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b713_wp02_subject_site_chg extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b713_wp02_subject_site_chg_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "���Ҏ{�ݕύX���";
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

