/*
               File: TBM11_IMAGE
        Description: 画像マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:21.55
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/tbm11_image")
public final  class tbm11_image extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm11_image_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "画像マスタ";
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

