/*
               File: TBT15_CRF_MEMO_LOC
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:42.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt15_crf_memo_loc extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tbt15_crf_memo_loc_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "CRFメモ位置テーブル";
   }

}

