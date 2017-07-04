/*
               File: B803_PC01_GET_BCMSG
        Description: BCメッセージ取得
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:2.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b803_pc01_get_bcmsg extends GXProcedure
{
   public b803_pc01_get_bcmsg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b803_pc01_get_bcmsg.class ), "" );
   }

   public b803_pc01_get_bcmsg( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( GxObjectCollection aP0 ,
                             byte aP1 )
   {
      b803_pc01_get_bcmsg.this.AV11P_BCMSGS = aP0;
      b803_pc01_get_bcmsg.this.AV13P_NL = aP1;
      b803_pc01_get_bcmsg.this.aP2 = aP2;
      b803_pc01_get_bcmsg.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( GxObjectCollection aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GxObjectCollection aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      b803_pc01_get_bcmsg.this.AV11P_BCMSGS = aP0;
      b803_pc01_get_bcmsg.this.AV13P_NL = aP1;
      b803_pc01_get_bcmsg.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B803" ;
      AV9W_RTN_MSG = "" ;
      GXt_char1 = AV12W_NEWLINE ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( AV13P_NL, GXv_char2) ;
      b803_pc01_get_bcmsg.this.GXt_char1 = GXv_char2[0] ;
      AV12W_NEWLINE = GXt_char1 ;
      AV16GXV1 = 1 ;
      while ( AV16GXV1 <= AV11P_BCMSGS.size() )
      {
         AV10W_BCMSG = (SdtMessages_Message)((SdtMessages_Message)AV11P_BCMSGS.elementAt(-1+AV16GXV1));
         if ( ! (GXutil.strcmp("", AV9W_RTN_MSG)==0) )
         {
            AV9W_RTN_MSG = AV9W_RTN_MSG + AV12W_NEWLINE ;
         }
         if ( GXutil.strcmp(AV10W_BCMSG.getgxTv_SdtMessages_Message_Id(), "DuplicatePrimaryKey") == 0 )
         {
            GXt_char1 = AV9W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00100", "", "", "", "", "", GXv_char2) ;
            b803_pc01_get_bcmsg.this.GXt_char1 = GXv_char2[0] ;
            AV9W_RTN_MSG = AV9W_RTN_MSG + GXt_char1 ;
         }
         else if ( GXutil.strcmp(AV10W_BCMSG.getgxTv_SdtMessages_Message_Id(), "RecordWasChanged") == 0 )
         {
            GXt_char1 = AV9W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00007", "", "", "", "", "", GXv_char2) ;
            b803_pc01_get_bcmsg.this.GXt_char1 = GXv_char2[0] ;
            AV9W_RTN_MSG = AV9W_RTN_MSG + GXt_char1 ;
         }
         else if ( GXutil.strcmp(AV10W_BCMSG.getgxTv_SdtMessages_Message_Id(), "CandidateKeyNotFound") == 0 )
         {
            GXt_char1 = AV9W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00102", "", "", "", "", "", GXv_char2) ;
            b803_pc01_get_bcmsg.this.GXt_char1 = GXv_char2[0] ;
            AV9W_RTN_MSG = AV9W_RTN_MSG + GXt_char1 ;
         }
         else
         {
            AV9W_RTN_MSG = AV9W_RTN_MSG + AV10W_BCMSG.getgxTv_SdtMessages_Message_Id() + ":" + AV10W_BCMSG.getgxTv_SdtMessages_Message_Description() ;
         }
         AV16GXV1 = (int)(AV16GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = b803_pc01_get_bcmsg.this.AV9W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_RTN_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV12W_NEWLINE = "" ;
      AV10W_BCMSG = new SdtMessages_Message(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13P_NL ;
   private short Gx_err ;
   private int AV16GXV1 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV9W_RTN_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV12W_NEWLINE ;
   private String[] aP2 ;
   private GxObjectCollection AV11P_BCMSGS ;
   private SdtMessages_Message AV10W_BCMSG ;
}

