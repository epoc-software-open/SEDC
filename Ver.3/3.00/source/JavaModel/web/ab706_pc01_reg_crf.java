/*
               File: B706_PC01_REG_CRF
        Description: CRF���̓f�[�^�o�^����
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:23.71
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab706_pc01_reg_crf extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab706_pc01_reg_crf_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF���̓f�[�^�o�^����";
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

