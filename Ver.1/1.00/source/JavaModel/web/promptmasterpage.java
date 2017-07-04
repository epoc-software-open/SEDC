/*
               File: PromptMasterPage
        Description: Prompt Master Page
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:36.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class promptmasterpage extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new promptmasterpage_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "Prompt Master Page ";
   }

}

