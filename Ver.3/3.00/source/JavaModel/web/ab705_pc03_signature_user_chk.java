/*
               File: B705_PC03_SIGNATURE_USER_CHK
        Description: CRF署名ユーザチェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:32.31
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab705_pc03_signature_user_chk extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab705_pc03_signature_user_chk_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF署名ユーザチェック";
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

