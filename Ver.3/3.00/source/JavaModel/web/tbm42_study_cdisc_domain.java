/*
               File: TBM42_STUDY_CDISC_DOMAIN
        Description: ������CDISC�h���C���}�X�^
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:9.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm42_study_cdisc_domain extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm42_study_cdisc_domain_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "������CDISC�h���C���}�X�^";
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

