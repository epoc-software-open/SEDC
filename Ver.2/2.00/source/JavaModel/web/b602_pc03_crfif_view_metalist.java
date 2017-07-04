/*
               File: B602_PC03_CRFIF_VIEW_METALIST
        Description: NetCommons汎用データベース・メタデータ一覧連携インターフェース
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:1.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b602_pc03_crfif_view_metalist extends GXProcedure
{
   public b602_pc03_crfif_view_metalist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b602_pc03_crfif_view_metalist.class ), "" );
   }

   public b602_pc03_crfif_view_metalist( int remoteHandle ,
                                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB602_SD03_META_LIST[] aP3 ,
                             short[] aP4 )
   {
      b602_pc03_crfif_view_metalist.this.AV10P_USER_ID = aP0;
      b602_pc03_crfif_view_metalist.this.AV8P_PWD = aP1;
      b602_pc03_crfif_view_metalist.this.AV9P_STUDY_ID = aP2;
      b602_pc03_crfif_view_metalist.this.aP3 = aP3;
      b602_pc03_crfif_view_metalist.this.aP4 = aP4;
      b602_pc03_crfif_view_metalist.this.aP5 = aP5;
      b602_pc03_crfif_view_metalist.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        SdtB602_SD03_META_LIST[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             SdtB602_SD03_META_LIST[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b602_pc03_crfif_view_metalist.this.AV10P_USER_ID = aP0;
      b602_pc03_crfif_view_metalist.this.AV8P_PWD = aP1;
      b602_pc03_crfif_view_metalist.this.AV9P_STUDY_ID = aP2;
      b602_pc03_crfif_view_metalist.this.aP3 = aP3;
      b602_pc03_crfif_view_metalist.this.aP4 = aP4;
      b602_pc03_crfif_view_metalist.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV21C_APP_ID = "B602" ;
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
      AV14W_META_LIST = (SdtB602_SD03_META_LIST)new SdtB602_SD03_META_LIST(remoteHandle, context);
      AV14W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().clear();
      AV19W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV19W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV21C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV19W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc03_crfif_view_metalist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc03_crfif_view_metalist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b602_pc03_crfif_view_metalist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_URL = "/?action=" + "crfif_view_metalist" + "&loginid=" + AV10P_USER_ID + "&password=" + AV8P_PWD + "&multidatabase_id=" + GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) ;
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b602_pc03_crfif_view_metalist.this.GXt_char4 = GXv_char3[0] ;
      AV12W_HTTP_CLIENT.setHost( GXt_char4 );
      AV12W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV12W_HTTP_CLIENT.setPort( 443 );
      AV12W_HTTP_CLIENT.execute("GET", AV17W_URL);
      if ( ( AV12W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV12W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV20W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV12W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV12W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV12W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV19W_EXTRA_INFO;
         GXv_int2[0] = AV15W_RTN_CD ;
         GXv_char3[0] = AV16W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc03_crfif_view_metalist.this.AV15W_RTN_CD = GXv_int2[0] ;
         b602_pc03_crfif_view_metalist.this.AV16W_RTN_MSG = GXv_char3[0] ;
         AV15W_RTN_CD = (short)(1) ;
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc03_crfif_view_metalist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_XML_READER.openResponse(AV12W_HTTP_CLIENT);
      AV18W_XML_READER.readType(AV18W_XML_READER.getElementType(), "metalist");
      AV18W_XML_READER.readType(AV18W_XML_READER.getElementType(), "result_code");
      while ( ! AV18W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV18W_XML_READER.getName(), "code") == 0 )
         {
            AV14W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Result().setgxTv_SdtB602_SD03_META_LIST_RESULT_Code( (byte)(GXutil.lval( AV18W_XML_READER.getValue())) );
            if ( AV14W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Result().getgxTv_SdtB602_SD03_META_LIST_RESULT_Code() != 1 )
            {
               AV15W_RTN_CD = (short)(1) ;
            }
         }
         else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "error_message") == 0 )
         {
            AV14W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Result().setgxTv_SdtB602_SD03_META_LIST_RESULT_Err_msg( AV18W_XML_READER.getValue() );
            AV16W_RTN_MSG = AV18W_XML_READER.getValue() ;
         }
         else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "result_code") == 0 )
         {
            if ( AV18W_XML_READER.getNodeType() == AV18W_XML_READER.getEndTagType() )
            {
               if (true) break;
            }
         }
         AV18W_XML_READER.read();
      }
      if ( AV15W_RTN_CD != 0 )
      {
         GXt_char4 = AV16W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc03_crfif_view_metalist.this.GXt_char4 = GXv_char3[0] ;
         AV16W_RTN_MSG = GXt_char4 + "(" + AV16W_RTN_MSG + ")" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_XML_READER.readType(AV18W_XML_READER.getElementType(), "metas");
      while ( ! AV18W_XML_READER.getEof() )
      {
         AV18W_XML_READER.readType(AV18W_XML_READER.getElementType(), "meta");
         AV13W_META_ITEM = (SdtB602_SD03_META_LIST_META_DATAItem)new SdtB602_SD03_META_LIST_META_DATAItem(remoteHandle, context);
         while ( ! AV18W_XML_READER.getEof() )
         {
            if ( GXutil.strcmp(AV18W_XML_READER.getName(), "metadata_id") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Metadata_id( GXutil.lval( AV18W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "name") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Name( AV18W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "type") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Type( AV18W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "display_pos") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_pos( AV18W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "select_content") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Select_content( AV18W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "require_flag") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Require_flag( AV18W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "display_sequence") == 0 )
            {
               AV13W_META_ITEM.setgxTv_SdtB602_SD03_META_LIST_META_DATAItem_Display_sequence( GXutil.lval( AV18W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV18W_XML_READER.getName(), "meta") == 0 )
            {
               if ( AV18W_XML_READER.getNodeType() == AV18W_XML_READER.getEndTagType() )
               {
                  AV14W_META_LIST.getgxTv_SdtB602_SD03_META_LIST_Meta_data().add(AV13W_META_ITEM, 0);
                  if (true) break;
               }
            }
            AV18W_XML_READER.read();
         }
      }
      AV18W_XML_READER.close();
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV10P_USER_ID );
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV22W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV22W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV9P_STUDY_ID, 10, 0)) );
      AV19W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV22W_PARMS_ITEM, 0);
      AV20W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV19W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(1), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc03_crfif_view_metalist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc03_crfif_view_metalist.this.AV16W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV20W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV19W_EXTRA_INFO;
      GXv_int2[0] = AV15W_RTN_CD ;
      GXv_char3[0] = AV16W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV25Pgmname, (short)(0), AV20W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV19W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc03_crfif_view_metalist.this.AV15W_RTN_CD = GXv_int2[0] ;
      b602_pc03_crfif_view_metalist.this.AV16W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP3[0] = b602_pc03_crfif_view_metalist.this.AV14W_META_LIST;
      this.aP4[0] = b602_pc03_crfif_view_metalist.this.AV15W_RTN_CD;
      this.aP5[0] = b602_pc03_crfif_view_metalist.this.AV16W_RTN_MSG;
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
      AV14W_META_LIST = new SdtB602_SD03_META_LIST(remoteHandle, context);
      AV16W_RTN_MSG = "" ;
      AV21C_APP_ID = "" ;
      AV19W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV25Pgmname = "" ;
      AV17W_URL = "" ;
      AV12W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV20W_MSG = "" ;
      AV18W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV13W_META_ITEM = new SdtB602_SD03_META_LIST_META_DATAItem(remoteHandle, context);
      AV22W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV25Pgmname = "B602_PC03_CRFIF_VIEW_METALIST" ;
      /* GeneXus formulas. */
      AV25Pgmname = "B602_PC03_CRFIF_VIEW_METALIST" ;
      Gx_err = (short)(0) ;
   }

   private short AV15W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private String AV25Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV10P_USER_ID ;
   private String AV8P_PWD ;
   private String AV16W_RTN_MSG ;
   private String AV21C_APP_ID ;
   private String AV17W_URL ;
   private String AV20W_MSG ;
   private com.genexus.internet.HttpClient AV12W_HTTP_CLIENT ;
   private SdtB602_SD03_META_LIST[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private com.genexus.xml.XMLReader AV18W_XML_READER ;
   private SdtB602_SD03_META_LIST AV14W_META_LIST ;
   private SdtB602_SD03_META_LIST_META_DATAItem AV13W_META_ITEM ;
   private SdtB808_SD01_EXTRA_INFO AV19W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV22W_PARMS_ITEM ;
}

