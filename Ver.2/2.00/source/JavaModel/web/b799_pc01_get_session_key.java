/*
               File: B799_PC01_GET_SESSION_KEY
        Description: セッションキー取得処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:13.80
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc01_get_session_key extends GXProcedure
{
   public b799_pc01_get_session_key( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc01_get_session_key.class ), "" );
   }

   public b799_pc01_get_session_key( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             String aP1 )
   {
      b799_pc01_get_session_key.this.AV8P_KEY_KBN = aP0;
      b799_pc01_get_session_key.this.AV10P_USER_ID = aP1;
      b799_pc01_get_session_key.this.aP2 = aP2;
      b799_pc01_get_session_key.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( short aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      b799_pc01_get_session_key.this.AV8P_KEY_KBN = aP0;
      b799_pc01_get_session_key.this.AV10P_USER_ID = aP1;
      b799_pc01_get_session_key.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9W_SESSION_KEY = "" ;
      if ( AV8P_KEY_KBN == 1 )
      {
         AV9W_SESSION_KEY = "Html5_Exec_Info_" ;
      }
      else if ( AV8P_KEY_KBN == 2 )
      {
         AV9W_SESSION_KEY = "Open_CRF_Info_" ;
      }
      AV9W_SESSION_KEY = AV9W_SESSION_KEY + GXutil.trim( AV10P_USER_ID) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = b799_pc01_get_session_key.this.AV9W_SESSION_KEY;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_SESSION_KEY = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8P_KEY_KBN ;
   private short Gx_err ;
   private String AV10P_USER_ID ;
   private String AV9W_SESSION_KEY ;
   private String[] aP2 ;
}

