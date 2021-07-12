/*
               File: B799_PC02_IMAGE_URL_GET
        Description: âÊëúURLéÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:19.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc02_image_url_get extends GXProcedure
{
   public b799_pc02_image_url_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc02_image_url_get.class ), "" );
   }

   public b799_pc02_image_url_get( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      b799_pc02_image_url_get.this.AV8P_IMAGE_CD = aP0;
      b799_pc02_image_url_get.this.aP1 = aP1;
      b799_pc02_image_url_get.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      b799_pc02_image_url_get.this.AV8P_IMAGE_CD = aP0;
      b799_pc02_image_url_get.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_IMAGE_URL = "" ;
      AV9W_FLG = "0" ;
      /* Using cursor P005N2 */
      pr_default.execute(0, new Object[] {AV8P_IMAGE_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A535TBM11_DEL_FLG = P005N2_A535TBM11_DEL_FLG[0] ;
         n535TBM11_DEL_FLG = P005N2_n535TBM11_DEL_FLG[0] ;
         A62TBM11_IMAGE_CD = P005N2_A62TBM11_IMAGE_CD[0] ;
         A533TBM11_IMAGE = P005N2_A533TBM11_IMAGE[0] ;
         n533TBM11_IMAGE = P005N2_n533TBM11_IMAGE[0] ;
         AV11W_TBM11_IMAGE = A533TBM11_IMAGE ;
         AV9W_FLG = "1" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV9W_FLG, "1") == 0 )
      {
         AV10W_IMAGE_URL = httpContext.getResource(AV11W_TBM11_IMAGE) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b799_pc02_image_url_get.this.AV10W_IMAGE_URL;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_IMAGE_URL = "" ;
      AV9W_FLG = "" ;
      scmdbuf = "" ;
      P005N2_A535TBM11_DEL_FLG = new String[] {""} ;
      P005N2_n535TBM11_DEL_FLG = new boolean[] {false} ;
      P005N2_A62TBM11_IMAGE_CD = new String[] {""} ;
      P005N2_A533TBM11_IMAGE = new String[] {""} ;
      P005N2_n533TBM11_IMAGE = new boolean[] {false} ;
      A535TBM11_DEL_FLG = "" ;
      A62TBM11_IMAGE_CD = "" ;
      A533TBM11_IMAGE = "" ;
      AV11W_TBM11_IMAGE = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc02_image_url_get__default(),
         new Object[] {
             new Object[] {
            P005N2_A535TBM11_DEL_FLG, P005N2_n535TBM11_DEL_FLG, P005N2_A62TBM11_IMAGE_CD, P005N2_A533TBM11_IMAGE, P005N2_n533TBM11_IMAGE
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String scmdbuf ;
   private boolean n535TBM11_DEL_FLG ;
   private boolean n533TBM11_IMAGE ;
   private String A533TBM11_IMAGE ;
   private String AV11W_TBM11_IMAGE ;
   private String AV8P_IMAGE_CD ;
   private String AV10W_IMAGE_URL ;
   private String AV9W_FLG ;
   private String A535TBM11_DEL_FLG ;
   private String A62TBM11_IMAGE_CD ;
   private String[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P005N2_A535TBM11_DEL_FLG ;
   private boolean[] P005N2_n535TBM11_DEL_FLG ;
   private String[] P005N2_A62TBM11_IMAGE_CD ;
   private String[] P005N2_A533TBM11_IMAGE ;
   private boolean[] P005N2_n533TBM11_IMAGE ;
}

final  class b799_pc02_image_url_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005N2", "SELECT `TBM11_DEL_FLG`, `TBM11_IMAGE_CD`, `TBM11_IMAGE` FROM `TBM11_IMAGE` WHERE (`TBM11_IMAGE_CD` = ?) AND (`TBM11_DEL_FLG` = '0') ORDER BY `TBM11_IMAGE_CD`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[3])[0] = rslt.getBLOBFile(3, "tmp", "") ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setVarchar(1, (String)parms[0], 50);
               return;
      }
   }

}

