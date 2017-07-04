/*
               File: B201_WP01_IMAGE_MST_LIST
        Description: 画像マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:3:30.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b201_wp01_image_mst_list extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b201_wp01_image_mst_list_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "画像マスタメンテナンス（一覧）";
   }

}

