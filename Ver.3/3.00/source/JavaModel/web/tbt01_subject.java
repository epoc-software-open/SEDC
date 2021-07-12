/*
               File: TBT01_SUBJECT
        Description: 患者テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:52.95
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt01_subject extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt01_subject_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者テーブル";
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

