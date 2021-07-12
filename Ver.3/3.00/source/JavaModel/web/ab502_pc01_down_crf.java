/*
               File: B502_PC01_DOWN_CRF
        Description: CRFダウンロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:20.45
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab502_pc01_down_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab502_pc01_down_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFダウンロード";
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

