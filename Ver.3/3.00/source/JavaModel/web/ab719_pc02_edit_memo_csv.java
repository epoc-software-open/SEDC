/*
               File: B719_PC02_EDIT_MEMO_CSV
        Description: �쐬����CSV�o�͏���
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:29.65
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab719_pc02_edit_memo_csv extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab719_pc02_edit_memo_csv_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "�쐬����CSV�o�͏���";
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

