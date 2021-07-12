/*
               File: B201_WP01_IMAGE_MST_LIST
        Description: 画像マスタメンテナンス（一覧）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:24:0.25
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

