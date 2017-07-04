/*
               File: B602_PC04_CRFIF_VIEW_CONTENTLIST
        Description: NetCommons 汎用データベース・メタコンテンツ一覧連携インターフェース
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:28.28
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b602_pc04_crfif_view_contentlist extends GXProcedure
{
   public b602_pc04_crfif_view_contentlist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b602_pc04_crfif_view_contentlist.class ), "" );
   }

   public b602_pc04_crfif_view_contentlist( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB602_SD04_CONTENT_LIST[] aP3 ,
                             short[] aP4 )
   {
      b602_pc04_crfif_view_contentlist.this.AV10P_USER_ID = aP0;
      b602_pc04_crfif_view_contentlist.this.AV8P_PWD = aP1;
      b602_pc04_crfif_view_contentlist.this.AV9P_STUDY_ID = aP2;
      b602_pc04_crfif_view_contentlist.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        SdtB602_SD04_CONTENT_LIST[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB602_SD04_CONTENT_LIST[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b602_pc04_crfif_view_contentlist.this.AV10P_USER_ID = aP0;
      b602_pc04_crfif_view_contentlist.this.AV8P_PWD = aP1;
      b602_pc04_crfif_view_contentlist.this.AV9P_STUDY_ID = aP2;
      b602_pc04_crfif_view_contentlist.this.aP3 = aP3;
      b602_pc04_crfif_view_contentlist.this.aP4 = aP4;
      b602_pc04_crfif_view_contentlist.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20C_APP_ID = "B602" ;
      /* Execute user subroutine: S11140 */
      S11140 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      AV12W_CONTENT_LIST = (SdtB602_SD04_CONTENT_LIST)new SdtB602_SD04_CONTENT_LIST(remoteHandle, context);
      AV12W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Content().clear();
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV20C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
         GXv_int2[0] = AV14W_RTN_CD ;
         GXv_char3[0] = AV15W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc04_crfif_view_contentlist.this.AV14W_RTN_CD = GXv_int2[0] ;
         b602_pc04_crfif_view_contentlist.this.AV15W_RTN_MSG = GXv_char3[0] ;
         AV14W_RTN_CD = (short)(1) ;
         GXt_char4 = AV15W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b602_pc04_crfif_view_contentlist.this.GXt_char4 = GXv_char3[0] ;
         AV15W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_URL = "/?action=" + "crfif_view_contentlist" + "&loginid=" + AV10P_USER_ID + "&password=" + AV8P_PWD + "&multidatabase_id=" + GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) ;
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b602_pc04_crfif_view_contentlist.this.GXt_char4 = GXv_char3[0] ;
      AV13W_HTTP_CLIENT.setHost( GXt_char4 );
      AV13W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV13W_HTTP_CLIENT.setPort( 443 );
      AV13W_HTTP_CLIENT.execute("GET", AV16W_URL);
      if ( ( AV13W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV13W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV19W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV13W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV13W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV13W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV13W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
         GXv_int2[0] = AV14W_RTN_CD ;
         GXv_char3[0] = AV15W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc04_crfif_view_contentlist.this.AV14W_RTN_CD = GXv_int2[0] ;
         b602_pc04_crfif_view_contentlist.this.AV15W_RTN_MSG = GXv_char3[0] ;
         AV14W_RTN_CD = (short)(1) ;
         GXt_char4 = AV15W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc04_crfif_view_contentlist.this.GXt_char4 = GXv_char3[0] ;
         AV15W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_XML_READER.openResponse(AV13W_HTTP_CLIENT);
      AV17W_XML_READER.readType(AV17W_XML_READER.getElementType(), "contentlist");
      AV17W_XML_READER.readType(AV17W_XML_READER.getElementType(), "result_code");
      while ( ! AV17W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV17W_XML_READER.getName(), "code") == 0 )
         {
            AV12W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Result().setgxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Code( (byte)(GXutil.lval( AV17W_XML_READER.getValue())) );
            if ( AV12W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Result().getgxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Code() != 1 )
            {
               AV14W_RTN_CD = (short)(1) ;
            }
         }
         else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "error_message") == 0 )
         {
            AV12W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Result().setgxTv_SdtB602_SD04_CONTENT_LIST_RESULT_Err_msg( AV17W_XML_READER.getValue() );
            AV15W_RTN_MSG = AV17W_XML_READER.getValue() ;
         }
         else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "result_code") == 0 )
         {
            if ( AV17W_XML_READER.getNodeType() == AV17W_XML_READER.getEndTagType() )
            {
               if (true) break;
            }
         }
         AV17W_XML_READER.read();
      }
      if ( AV14W_RTN_CD != 0 )
      {
         GXt_char4 = AV15W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc04_crfif_view_contentlist.this.GXt_char4 = GXv_char3[0] ;
         AV15W_RTN_MSG = GXt_char4 + "(" + AV15W_RTN_MSG + ")" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_XML_READER.readType(AV17W_XML_READER.getElementType(), "contents");
      while ( ! AV17W_XML_READER.getEof() )
      {
         AV17W_XML_READER.readType(AV17W_XML_READER.getElementType(), "content");
         AV11W_CONTENT_ITEM = (SdtB602_SD04_CONTENT_LIST_CONTENTItem)new SdtB602_SD04_CONTENT_LIST_CONTENTItem(remoteHandle, context);
         while ( ! AV17W_XML_READER.getEof() )
         {
            if ( GXutil.strcmp(AV17W_XML_READER.getName(), "content_id") == 0 )
            {
               AV11W_CONTENT_ITEM.setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_id( GXutil.lval( AV17W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "display_sequence") == 0 )
            {
               AV11W_CONTENT_ITEM.setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Display_sequence( GXutil.lval( AV17W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "insert_time") == 0 )
            {
               AV11W_CONTENT_ITEM.setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Insert_time( AV17W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "update_time") == 0 )
            {
               AV11W_CONTENT_ITEM.setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Update_time( AV17W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "content_no") == 0 )
            {
               AV11W_CONTENT_ITEM.setgxTv_SdtB602_SD04_CONTENT_LIST_CONTENTItem_Content_no( GXutil.lval( AV17W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV17W_XML_READER.getName(), "content") == 0 )
            {
               if ( AV17W_XML_READER.getNodeType() == AV17W_XML_READER.getEndTagType() )
               {
                  AV12W_CONTENT_LIST.getgxTv_SdtB602_SD04_CONTENT_LIST_Content().add(AV11W_CONTENT_ITEM, 0);
                  if (true) break;
               }
            }
            AV17W_XML_READER.read();
         }
      }
      AV17W_XML_READER.close();
      cleanup();
   }

   public void S11140( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV21W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV21W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV21W_PARMS_ITEM, 0);
      AV19W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
      GXv_int2[0] = AV14W_RTN_CD ;
      GXv_char3[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(1), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc04_crfif_view_contentlist.this.AV14W_RTN_CD = GXv_int2[0] ;
      b602_pc04_crfif_view_contentlist.this.AV15W_RTN_MSG = GXv_char3[0] ;
   }

   public void S12164( )
   {
      /* 'SUB_ERROR' Routine */
      AV19W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV18W_EXTRA_INFO;
      GXv_int2[0] = AV14W_RTN_CD ;
      GXv_char3[0] = AV15W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV24Pgmname, (short)(0), AV19W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc04_crfif_view_contentlist.this.AV14W_RTN_CD = GXv_int2[0] ;
      b602_pc04_crfif_view_contentlist.this.AV15W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b602_pc04_crfif_view_contentlist.this.AV12W_CONTENT_LIST;
      this.aP4[0] = b602_pc04_crfif_view_contentlist.this.AV14W_RTN_CD;
      this.aP5[0] = b602_pc04_crfif_view_contentlist.this.AV15W_RTN_MSG;
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
                  /* Execute user subroutine: S12164 */
                  S12164 ();
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
      AV12W_CONTENT_LIST = new SdtB602_SD04_CONTENT_LIST(remoteHandle, context);
      AV15W_RTN_MSG = "" ;
      AV20C_APP_ID = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV24Pgmname = "" ;
      AV16W_URL = "" ;
      AV13W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV19W_MSG = "" ;
      AV17W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV11W_CONTENT_ITEM = new SdtB602_SD04_CONTENT_LIST_CONTENTItem(remoteHandle, context);
      AV21W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV24Pgmname = "B602_PC04_CRFIF_VIEW_CONTENTLIST" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B602_PC04_CRFIF_VIEW_CONTENTLIST" ;
      Gx_err = (short)(0) ;
   }

   private short AV14W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private String AV24Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10P_USER_ID ;
   private String AV8P_PWD ;
   private String AV15W_RTN_MSG ;
   private String AV20C_APP_ID ;
   private String AV16W_URL ;
   private String AV19W_MSG ;
   private com.genexus.internet.HttpClient AV13W_HTTP_CLIENT ;
   private SdtB602_SD04_CONTENT_LIST[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private com.genexus.xml.XMLReader AV17W_XML_READER ;
   private SdtB602_SD04_CONTENT_LIST AV12W_CONTENT_LIST ;
   private SdtB602_SD04_CONTENT_LIST_CONTENTItem AV11W_CONTENT_ITEM ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV21W_PARMS_ITEM ;
}

