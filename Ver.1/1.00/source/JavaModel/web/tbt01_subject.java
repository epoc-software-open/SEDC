/*
               File: TBT01_SUBJECT
        Description: 患者テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:14.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt01_subject extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt01_subject_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "患者テーブル";
   }

}

