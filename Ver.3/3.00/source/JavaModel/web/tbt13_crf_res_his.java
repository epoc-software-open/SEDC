/*
               File: TBT13_CRF_RES_HIS
        Description: CRF���͌��ʗ����e�[�u��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:4.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt13_crf_res_his extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt13_crf_res_his_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF���͌��ʗ����e�[�u��";
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

