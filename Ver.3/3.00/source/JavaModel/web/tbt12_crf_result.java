/*
               File: TBT12_CRF_RESULT
        Description: CRF���͌��ʃe�[�u��
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:10.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt12_crf_result extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt12_crf_result_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRF���͌��ʃe�[�u��";
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

