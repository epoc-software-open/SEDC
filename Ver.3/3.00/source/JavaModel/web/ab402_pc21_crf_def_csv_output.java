/*
               File: B402_PC21_CRF_DEF_CSV_OUTPUT
        Description: CRF��`��CSV�o��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:56.70
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab402_pc21_crf_def_csv_output extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab402_pc21_crf_def_csv_output_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF��`��CSV�o��";
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

