/*
               File: TBM23_STUDY_STAFF
        Description: 試験参加スタッフマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:37.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm23_study_staff extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbm23_study_staff_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "試験参加スタッフマスタ";
   }

}

