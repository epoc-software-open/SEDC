/*
               File: B202_WP01_IMAGE_MST
        Description: 画像マスタメンテナンス（入力）
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 15:3:56.46
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class b202_wp01_image_mst extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new b202_wp01_image_mst_impl(context).doExecute();
   }

   public String getServletInfo( )
   {
      return "画像マスタメンテナンス（入力）";
   }

}

