/*
               File: B402_WP11_CRF_DESIGNER
        Description: CRFデザイン編集画面
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:2:54.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b402_wp11_crf_designer extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b402_wp11_crf_designer_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFデザイン編集画面";
   }

}

