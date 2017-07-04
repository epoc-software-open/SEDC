/*
               File: B509_PC01_DOWN_IMAGE
        Description: 画像ダウンロード
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:29.51
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

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

}

