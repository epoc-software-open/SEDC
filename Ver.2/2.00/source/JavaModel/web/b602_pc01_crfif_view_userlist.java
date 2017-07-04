/*
               File: B602_PC01_CRFIF_VIEW_USERLIST
        Description: NetCommonsユーザデータ連携インターフェース
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:0.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b602_pc01_crfif_view_userlist extends GXProcedure
{
   public b602_pc01_crfif_view_userlist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b602_pc01_crfif_view_userlist.class ), "" );
   }

   public b602_pc01_crfif_view_userlist( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             SdtB602_SD01_USER_LIST[] aP2 ,
                             short[] aP3 )
   {
      b602_pc01_crfif_view_userlist.this.AV10P_USER_ID = aP0;
      b602_pc01_crfif_view_userlist.this.AV9P_PWD = aP1;
      b602_pc01_crfif_view_userlist.this.aP2 = aP2;
      b602_pc01_crfif_view_userlist.this.aP3 = aP3;
      b602_pc01_crfif_view_userlist.this.aP4 = aP4;
      b602_pc01_crfif_view_userlist.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        SdtB602_SD01_USER_LIST[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             SdtB602_SD01_USER_LIST[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b602_pc01_crfif_view_userlist.this.AV10P_USER_ID = aP0;
      b602_pc01_crfif_view_userlist.this.AV9P_PWD = aP1;
      b602_pc01_crfif_view_userlist.this.aP2 = aP2;
      b602_pc01_crfif_view_userlist.this.aP3 = aP3;
      b602_pc01_crfif_view_userlist.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B602" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_RTN_CD = (short)(0) ;
      AV16W_RTN_MSG = "" ;
      AV19W_USER_LIST = (SdtB602_SD01_USER_LIST)new SdtB602_SD01_USER_LIST(remoteHandle, context);
      AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_User().clear();
      AV11W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV11W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV11W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc01_crfif_view_userlist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc01_crfif_view_userlist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b602_pc01_crfif_view_userlist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_URL = "/?action=" + "crfif_view_userlist" + "&loginid=" + AV10P_USER_ID + "&password=" + AV9P_PWD ;
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b602_pc01_crfif_view_userlist.this.GXt_char4 = GXv_char3[0] ;
      AV12W_HTTP_CLIENT.setHost( GXt_char4 );
      AV12W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV12W_HTTP_CLIENT.setPort( 443 );
      AV12W_HTTP_CLIENT.execute("GET", AV17W_URL);
      if ( ( AV12W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV12W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV13W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV12W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV12W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV11W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV13W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc01_crfif_view_userlist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc01_crfif_view_userlist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc01_crfif_view_userlist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_XML_READER.openResponse(AV12W_HTTP_CLIENT);
      AV20W_XML_READER.readType(AV20W_XML_READER.getElementType(), "userlist");
      AV20W_XML_READER.readType(AV20W_XML_READER.getElementType(), "result_code");
      while ( ! AV20W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV20W_XML_READER.getName(), "code") == 0 )
         {
            AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_Result().setgxTv_SdtB602_SD01_USER_LIST_RESULT_Code( (byte)(GXutil.lval( AV20W_XML_READER.getValue())) );
            if ( AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_Result().getgxTv_SdtB602_SD01_USER_LIST_RESULT_Code() != 1 )
            {
               AV15W_RTN_CD = (short)(1) ;
            }
         }
         else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "error_message") == 0 )
         {
            AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_Result().setgxTv_SdtB602_SD01_USER_LIST_RESULT_Err_msg( AV20W_XML_READER.getValue() );
            AV16W_RTN_MSG = AV20W_XML_READER.getValue() ;
         }
         else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "result_code") == 0 )
         {
            if ( AV20W_XML_READER.getNodeType() == AV20W_XML_READER.getEndTagType() )
            {
               if (true) break;
            }
         }
         AV20W_XML_READER.read();
      }
      if ( AV15W_RTN_CD != 0 )
      {
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc01_crfif_view_userlist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 + "(" + AV16W_RTN_MSG + ")" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_XML_READER.readType(AV20W_XML_READER.getElementType(), "users");
      while ( ! AV20W_XML_READER.getEof() )
      {
         AV20W_XML_READER.readType(AV20W_XML_READER.getElementType(), "user");
         AV18W_USER_ITEM = (SdtB602_SD01_USER_LIST_USERItem)new SdtB602_SD01_USER_LIST_USERItem(remoteHandle, context);
         while ( ! AV20W_XML_READER.getEof() )
         {
            if ( GXutil.strcmp(AV20W_XML_READER.getName(), "login_id") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id( AV20W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "password") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Password( AV20W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "handle") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle( AV20W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "role_authority_id") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id( GXutil.lval( AV20W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "belong") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong( AV20W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "email") == 0 )
            {
               AV18W_USER_ITEM.setgxTv_SdtB602_SD01_USER_LIST_USERItem_Email( AV20W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV20W_XML_READER.getName(), "user") == 0 )
            {
               if ( AV20W_XML_READER.getNodeType() == AV20W_XML_READER.getEndTagType() )
               {
                  AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_User().add(AV18W_USER_ITEM, 0);
                  if (true) break;
               }
            }
            AV20W_XML_READER.read();
         }
      }
      AV20W_XML_READER.close();
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV14W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV14W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      AV11W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV14W_PARMS_ITEM, 0);
      AV13W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV11W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(1), AV13W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc01_crfif_view_userlist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc01_crfif_view_userlist.this.AV16W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV13W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV11W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV13W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV11W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc01_crfif_view_userlist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc01_crfif_view_userlist.this.AV16W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b602_pc01_crfif_view_userlist.this.AV19W_USER_LIST;
      this.aP3[0] = b602_pc01_crfif_view_userlist.this.AV15W_RTN_CD;
      this.aP4[0] = b602_pc01_crfif_view_userlist.this.AV16W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   /* Error handler code */
   public void handleError( )
   {
      if ( context.globals.getErr( ) != 0 )
      {
         Gx_err = context.globals.getErr( ) ;
         Gx_emsg = context.globals.getErrMsg( ) ;
         switch ( GXActiveErrHndl )
         {
               case 1 :
                  /* Execute user subroutine: S121 */
                  S121 ();
                  if ( returnInSub )
                  {
                     returnInSub = true;
                     cleanup();
                     if (true) return;
                  }
                  break;
         }
      }
   }

   public void initialize( )
   {
      AV19W_USER_LIST = new SdtB602_SD01_USER_LIST(remoteHandle, context);
      AV16W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV11W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25Pgmname = "" ;
      AV17W_URL = "" ;
      AV12W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV13W_MSG = "" ;
      AV20W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV18W_USER_ITEM = new SdtB602_SD01_USER_LIST_USERItem(remoteHandle, context);
      AV14W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV25Pgmname = "B602_PC01_CRFIF_VIEW_USERLIST" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B602_PC01_CRFIF_VIEW_USERLIST" ;
      Gx_err = (short)(0) ;
   }

   private short AV15W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV25Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10P_USER_ID ;
   private String AV9P_PWD ;
   private String AV16W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String AV17W_URL ;
   private String AV13W_MSG ;
   private com.genexus.internet.HttpClient AV12W_HTTP_CLIENT ;
   private SdtB602_SD01_USER_LIST[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private com.genexus.xml.XMLReader AV20W_XML_READER ;
   private SdtB808_SD01_EXTRA_INFO AV11W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV14W_PARMS_ITEM ;
   private SdtB602_SD01_USER_LIST AV19W_USER_LIST ;
   private SdtB602_SD01_USER_LIST_USERItem AV18W_USER_ITEM ;
}

