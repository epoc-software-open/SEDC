/*
               File: B509_PC01_DOWN_IMAGE
        Description: 画像ダウンロード
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:2.88
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(value ="/servlet/ab509_pc01_down_image")
public final  class ab509_pc01_down_image extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new ab509_pc01_down_image_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "画像ダウンロード";
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

