/*
               File: B803_PC02_GET_BCMSG_AIRRES
        Description: AIRインタフェース BCメッセージ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:1.58
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b803_pc02_get_bcmsg_airres extends GXProcedure
{
   public b803_pc02_get_bcmsg_airres( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b803_pc02_get_bcmsg_airres.class ), "" );
   }

   public b803_pc02_get_bcmsg_airres( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( GxObjectCollection aP0 )
   {
      b803_pc02_get_bcmsg_airres.this.AV9P_BCMSGS = aP0;
      b803_pc02_get_bcmsg_airres.this.aP1 = aP1;
      b803_pc02_get_bcmsg_airres.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( GxObjectCollection aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( GxObjectCollection aP0 ,
                             String[] aP1 )
   {
      b803_pc02_get_bcmsg_airres.this.AV9P_BCMSGS = aP0;
      b803_pc02_get_bcmsg_airres.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B803" ;
      AV11W_RTN_MSG = "" ;
      GXv_char1[0] = AV11W_RTN_MSG ;
      new b803_pc01_get_bcmsg(remoteHandle, context).execute( AV9P_BCMSGS, (byte)(1), GXv_char1) ;
      b803_pc02_get_bcmsg_airres.this.AV11W_RTN_MSG = GXv_char1[0] ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b803_pc02_get_bcmsg_airres.this.AV11W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_RTN_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      GXv_char1 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXv_char1[] ;
   private String AV11W_RTN_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String[] aP1 ;
   private GxObjectCollection AV9P_BCMSGS ;
}

