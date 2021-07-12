/*
               File: A214_WP01_SEND_MAIL_INFO
        Description: 送信メール情報編集
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:31:36.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class a214_wp01_send_mail_info extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new a214_wp01_send_mail_info_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "送信メール情報編集";
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

