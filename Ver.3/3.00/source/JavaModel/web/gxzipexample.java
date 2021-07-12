/*
               File: GXzipExample
        Description: GXzip Example
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:30:32.51
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class gxzipexample extends GXWebObjectStub
{
   public static void main( String args[] )
   {
      ApplicationContext.getInstance().setCurrentLocation( "" );
      Application.init(GXcfg.class);
      gxzipexample_impl pgm = new gxzipexample_impl (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXStaticWebPanel.copyFiles();
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new gxzipexample_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "GXzip Example";
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

