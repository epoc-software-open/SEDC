/*
               File: B602_PC02_CRFIF_VIEW_DATABASELIST
        Description: NetCommons汎用データベース一覧連携インターフェース
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:27.38
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b602_pc02_crfif_view_databaselist extends GXProcedure
{
   public b602_pc02_crfif_view_databaselist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b602_pc02_crfif_view_databaselist.class ), "" );
   }

   public b602_pc02_crfif_view_databaselist( int remoteHandle ,
                                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             SdtB602_SD02_DB_LIST[] aP2 ,
                             short[] aP3 )
   {
      b602_pc02_crfif_view_databaselist.this.AV9P_USER_ID = aP0;
      b602_pc02_crfif_view_databaselist.this.AV8P_PWD = aP1;
      b602_pc02_crfif_view_databaselist.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        SdtB602_SD02_DB_LIST[] aP2 ,
                        short[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             SdtB602_SD02_DB_LIST[] aP2 ,
                             short[] aP3 ,
                             String[] aP4 )
   {
      b602_pc02_crfif_view_databaselist.this.AV9P_USER_ID = aP0;
      b602_pc02_crfif_view_databaselist.this.AV8P_PWD = aP1;
      b602_pc02_crfif_view_databaselist.this.aP2 = aP2;
      b602_pc02_crfif_view_databaselist.this.aP3 = aP3;
      b602_pc02_crfif_view_databaselist.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22C_APP_ID = "B602" ;
      /* Execute user subroutine: S11131 */
      S11131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV15W_RTN_CD = (short)(0) ;
      AV16W_RTN_MSG = "" ;
      AV11W_DB_LIST = (SdtB602_SD02_DB_LIST)new SdtB602_SD02_DB_LIST(remoteHandle, context);
      AV11W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Db().clear();
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV22C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc02_crfif_view_databaselist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc02_crfif_view_databaselist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b602_pc02_crfif_view_databaselist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_URL = "/?action=" + "crfif_view_databaselist" + "&loginid=" + AV9P_USER_ID + "&password=" + AV8P_PWD ;
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b602_pc02_crfif_view_databaselist.this.GXt_char4 = GXv_char3[0] ;
      AV12W_HTTP_CLIENT.setHost( GXt_char4 );
      AV12W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV12W_HTTP_CLIENT.setPort( 443 );
      AV12W_HTTP_CLIENT.execute("GET", AV18W_URL);
      if ( ( AV12W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV12W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV21W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV12W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV12W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc02_crfif_view_databaselist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc02_crfif_view_databaselist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc02_crfif_view_databaselist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_XML_READER.openResponse(AV12W_HTTP_CLIENT);
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "databaselist");
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "result_code");
      while ( ! AV19W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV19W_XML_READER.getName(), "code") == 0 )
         {
            AV11W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Result().setgxTv_SdtB602_SD02_DB_LIST_RESULT_Code( (byte)(GXutil.lval( AV19W_XML_READER.getValue())) );
            if ( AV11W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Result().getgxTv_SdtB602_SD02_DB_LIST_RESULT_Code() != 1 )
            {
               AV15W_RTN_CD = (short)(1) ;
            }
         }
         else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "error_message") == 0 )
         {
            AV11W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Result().setgxTv_SdtB602_SD02_DB_LIST_RESULT_Err_msg( AV19W_XML_READER.getValue() );
            AV16W_RTN_MSG = AV19W_XML_READER.getValue() ;
         }
         else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "result_code") == 0 )
         {
            if ( AV19W_XML_READER.getNodeType() == AV19W_XML_READER.getEndTagType() )
            {
               if (true) break;
            }
         }
         AV19W_XML_READER.read();
      }
      if ( AV15W_RTN_CD != 0 )
      {
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc02_crfif_view_databaselist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 + "(" + AV16W_RTN_MSG + ")" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "databases");
      while ( ! AV19W_XML_READER.getEof() )
      {
         AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "database");
         AV10W_DB_ITEM = (SdtB602_SD02_DB_LIST_DBItem)new SdtB602_SD02_DB_LIST_DBItem(remoteHandle, context);
         while ( ! AV19W_XML_READER.getEof() )
         {
            if ( GXutil.strcmp(AV19W_XML_READER.getName(), "multidatabase_id") == 0 )
            {
               AV10W_DB_ITEM.setgxTv_SdtB602_SD02_DB_LIST_DBItem_Id( GXutil.lval( AV19W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "multidatabase_name") == 0 )
            {
               AV10W_DB_ITEM.setgxTv_SdtB602_SD02_DB_LIST_DBItem_Name( AV19W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "database") == 0 )
            {
               if ( AV19W_XML_READER.getNodeType() == AV19W_XML_READER.getEndTagType() )
               {
                  AV11W_DB_LIST.getgxTv_SdtB602_SD02_DB_LIST_Db().add(AV10W_DB_ITEM, 0);
                  if (true) break;
               }
            }
            AV19W_XML_READER.read();
         }
      }
      AV19W_XML_READER.close();
      cleanup();
   }

   public void S11131( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_USER_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV21W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc02_crfif_view_databaselist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc02_crfif_view_databaselist.this.AV16W_RTN_MSG = GXv_char3[0] ;
   }

   public void S12151( )
   {
      /* 'SUB_ERROR' Routine */
      AV21W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc02_crfif_view_databaselist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc02_crfif_view_databaselist.this.AV16W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b602_pc02_crfif_view_databaselist.this.AV11W_DB_LIST;
      this.aP3[0] = b602_pc02_crfif_view_databaselist.this.AV15W_RTN_CD;
      this.aP4[0] = b602_pc02_crfif_view_databaselist.this.AV16W_RTN_MSG;
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
                  /* Execute user subroutine: S12151 */
                  S12151 ();
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
      AV11W_DB_LIST = new SdtB602_SD02_DB_LIST(remoteHandle, context);
      AV16W_RTN_MSG = "" ;
      AV22C_APP_ID = "" ;
      AV20W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26Pgmname = "" ;
      AV18W_URL = "" ;
      AV12W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV21W_MSG = "" ;
      AV19W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV10W_DB_ITEM = new SdtB602_SD02_DB_LIST_DBItem(remoteHandle, context);
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV26Pgmname = "B602_PC02_CRFIF_VIEW_DATABASELIST" ;
      /* GeneXus formulas. */
      AV26Pgmname = "B602_PC02_CRFIF_VIEW_DATABASELIST" ;
      Gx_err = (short)(0) ;
   }

   private short AV15W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private String AV26Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV9P_USER_ID ;
   private String AV8P_PWD ;
   private String AV16W_RTN_MSG ;
   private String AV22C_APP_ID ;
   private String AV18W_URL ;
   private String AV21W_MSG ;
   private com.genexus.internet.HttpClient AV12W_HTTP_CLIENT ;
   private SdtB602_SD02_DB_LIST[] aP2 ;
   private short[] aP3 ;
   private String[] aP4 ;
   private com.genexus.xml.XMLReader AV19W_XML_READER ;
   private SdtB602_SD02_DB_LIST AV11W_DB_LIST ;
   private SdtB602_SD02_DB_LIST_DBItem AV10W_DB_ITEM ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

