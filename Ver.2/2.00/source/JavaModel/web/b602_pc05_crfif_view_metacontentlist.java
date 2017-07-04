/*
               File: B602_PC05_CRFIF_VIEW_METACONTENTLIST
        Description: NetCommons 汎用データベース・レコード一覧連携インターフェース
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:3.94
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b602_pc05_crfif_view_metacontentlist extends GXProcedure
{
   public b602_pc05_crfif_view_metacontentlist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b602_pc05_crfif_view_metacontentlist.class ), "" );
   }

   public b602_pc05_crfif_view_metacontentlist( int remoteHandle ,
                                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             long aP3 ,
                             String aP4 ,
                             SdtB602_SD05_METACONTENT_LIST[] aP5 ,
                             short[] aP6 )
   {
      b602_pc05_crfif_view_metacontentlist.this.AV12P_USER_ID = aP0;
      b602_pc05_crfif_view_metacontentlist.this.AV10P_PWD = aP1;
      b602_pc05_crfif_view_metacontentlist.this.AV11P_STUDY_ID = aP2;
      b602_pc05_crfif_view_metacontentlist.this.AV8P_CONTENT_ID = aP3;
      b602_pc05_crfif_view_metacontentlist.this.AV9P_DATA_MIN_FLG = aP4;
      b602_pc05_crfif_view_metacontentlist.this.aP5 = aP5;
      b602_pc05_crfif_view_metacontentlist.this.aP6 = aP6;
      b602_pc05_crfif_view_metacontentlist.this.aP7 = aP7;
      b602_pc05_crfif_view_metacontentlist.this.aP7 = new String[] {""};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        long aP2 ,
                        long aP3 ,
                        String aP4 ,
                        SdtB602_SD05_METACONTENT_LIST[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             long aP2 ,
                             long aP3 ,
                             String aP4 ,
                             SdtB602_SD05_METACONTENT_LIST[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      b602_pc05_crfif_view_metacontentlist.this.AV12P_USER_ID = aP0;
      b602_pc05_crfif_view_metacontentlist.this.AV10P_PWD = aP1;
      b602_pc05_crfif_view_metacontentlist.this.AV11P_STUDY_ID = aP2;
      b602_pc05_crfif_view_metacontentlist.this.AV8P_CONTENT_ID = aP3;
      b602_pc05_crfif_view_metacontentlist.this.AV9P_DATA_MIN_FLG = aP4;
      b602_pc05_crfif_view_metacontentlist.this.aP5 = aP5;
      b602_pc05_crfif_view_metacontentlist.this.aP6 = aP6;
      b602_pc05_crfif_view_metacontentlist.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22C_APP_ID = "B602" ;
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV16W_RTN_CD = (short)(0) ;
      AV17W_RTN_MSG = "" ;
      AV15W_METACONTENT_LIST = (SdtB602_SD05_METACONTENT_LIST)new SdtB602_SD05_METACONTENT_LIST(remoteHandle, context);
      AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().clear();
      AV20W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV20W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV22C_APP_ID );
      if ( GXutil.strcmp(new b806_pc01_get_ctrl_val(remoteHandle, context).executeUdp( "001"), "1") != 0 )
      {
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
         GXv_int2[0] = AV16W_RTN_CD ;
         GXv_char3[0] = AV17W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), "臨床試験支援システム無効", GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc05_crfif_view_metacontentlist.this.AV16W_RTN_CD = GXv_int2[0] ;
         b602_pc05_crfif_view_metacontentlist.this.AV17W_RTN_MSG = GXv_char3[0] ;
         AV16W_RTN_CD = (short)(1) ;
         GXt_char4 = AV17W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00078", "", "", "", "", "", GXv_char3) ;
         b602_pc05_crfif_view_metacontentlist.this.GXt_char4 = GXv_char3[0] ;
         AV17W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV18W_URL = "/?action=" + "crfif_view_metacontentlist" + "&loginid=" + AV12P_USER_ID + "&password=" + AV10P_PWD + "&multidatabase_id=" + GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) + "&content_id=" + GXutil.trim( GXutil.str( AV8P_CONTENT_ID, 10, 0)) ;
      if ( GXutil.strcmp(AV9P_DATA_MIN_FLG, "1") == 0 )
      {
         AV18W_URL = AV18W_URL + "data=min" ;
      }
      GXt_char4 = "" ;
      GXv_char3[0] = GXt_char4 ;
      new b102_pc01_get_nc_server(remoteHandle, context).execute( GXv_char3) ;
      b602_pc05_crfif_view_metacontentlist.this.GXt_char4 = GXv_char3[0] ;
      AV13W_HTTP_CLIENT.setHost( GXt_char4 );
      AV13W_HTTP_CLIENT.setSecure( (byte)(1) );
      AV13W_HTTP_CLIENT.setPort( 443 );
      AV13W_HTTP_CLIENT.execute("GET", AV18W_URL);
      if ( ( AV13W_HTTP_CLIENT.getErrCode() != 0 ) || ( AV13W_HTTP_CLIENT.getStatusCode() != 200 ) )
      {
         AV21W_MSG = "ErrCode:" + GXutil.trim( GXutil.str( AV13W_HTTP_CLIENT.getErrCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ErrDescription:" + AV13W_HTTP_CLIENT.getErrDescription() + GXutil.chr( (short)(9)) + "StatusCode:" + GXutil.trim( GXutil.str( AV13W_HTTP_CLIENT.getStatusCode(), 10, 0)) + GXutil.chr( (short)(9)) + "ReasonLine:" + AV13W_HTTP_CLIENT.getReasonLine() ;
         GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
         GXv_int2[0] = AV16W_RTN_CD ;
         GXv_char3[0] = AV17W_RTN_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
         AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
         b602_pc05_crfif_view_metacontentlist.this.AV16W_RTN_CD = GXv_int2[0] ;
         b602_pc05_crfif_view_metacontentlist.this.AV17W_RTN_MSG = GXv_char3[0] ;
         AV16W_RTN_CD = (short)(1) ;
         GXt_char4 = AV17W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc05_crfif_view_metacontentlist.this.GXt_char4 = GXv_char3[0] ;
         AV17W_RTN_MSG = GXt_char4 ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_XML_READER.openResponse(AV13W_HTTP_CLIENT);
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "metacontentlist");
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "result_code");
      while ( ! AV19W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV19W_XML_READER.getName(), "code") == 0 )
         {
            AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Result().setgxTv_SdtB602_SD05_METACONTENT_LIST_RESULT_Code( (byte)(GXutil.lval( AV19W_XML_READER.getValue())) );
            if ( AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Result().getgxTv_SdtB602_SD05_METACONTENT_LIST_RESULT_Code() != 1 )
            {
               AV16W_RTN_CD = (short)(1) ;
            }
         }
         else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "error_message") == 0 )
         {
            AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Result().setgxTv_SdtB602_SD05_METACONTENT_LIST_RESULT_Err_msg( AV19W_XML_READER.getValue() );
            AV17W_RTN_MSG = AV19W_XML_READER.getValue() ;
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
      if ( AV16W_RTN_CD != 0 )
      {
         GXt_char4 = AV17W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00066", "", "", "", "", "", GXv_char3) ;
         b602_pc05_crfif_view_metacontentlist.this.GXt_char4 = GXv_char3[0] ;
         AV17W_RTN_MSG = GXt_char4 + "(" + AV17W_RTN_MSG + ")" ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "content_header");
      while ( ! AV19W_XML_READER.getEof() )
      {
         if ( GXutil.strcmp(AV19W_XML_READER.getName(), "hospital") == 0 )
         {
            AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header().setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Hospital( AV19W_XML_READER.getValue() );
         }
         else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "content_no") == 0 )
         {
            AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Content_header().setgxTv_SdtB602_SD05_METACONTENT_LIST_CONTENT_HEADER_Content_no( GXutil.lval( AV19W_XML_READER.getValue()) );
         }
         else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "content_header") == 0 )
         {
            if ( AV19W_XML_READER.getNodeType() == AV19W_XML_READER.getEndTagType() )
            {
               if (true) break;
            }
         }
         AV19W_XML_READER.read();
      }
      if ( GXutil.strcmp(AV9P_DATA_MIN_FLG, "1") == 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "metacontents");
      while ( ! AV19W_XML_READER.getEof() )
      {
         AV19W_XML_READER.readType(AV19W_XML_READER.getElementType(), "metacontent");
         AV14W_METACONTENT_ITEM = (SdtB602_SD05_METACONTENT_LIST_METACONTENTItem)new SdtB602_SD05_METACONTENT_LIST_METACONTENTItem(remoteHandle, context);
         while ( ! AV19W_XML_READER.getEof() )
         {
            if ( GXutil.strcmp(AV19W_XML_READER.getName(), "metadata_content_id") == 0 )
            {
               AV14W_METACONTENT_ITEM.setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_content_id( GXutil.lval( AV19W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "content") == 0 )
            {
               AV14W_METACONTENT_ITEM.setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Content( AV19W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "metadata_id") == 0 )
            {
               AV14W_METACONTENT_ITEM.setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_id( GXutil.lval( AV19W_XML_READER.getValue()) );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "metadata_name") == 0 )
            {
               AV14W_METACONTENT_ITEM.setgxTv_SdtB602_SD05_METACONTENT_LIST_METACONTENTItem_Metadata_name( AV19W_XML_READER.getValue() );
            }
            else if ( GXutil.strcmp(AV19W_XML_READER.getName(), "metacontent") == 0 )
            {
               if ( AV19W_XML_READER.getNodeType() == AV19W_XML_READER.getEndTagType() )
               {
                  AV15W_METACONTENT_LIST.getgxTv_SdtB602_SD05_METACONTENT_LIST_Metacontent().add(AV14W_METACONTENT_ITEM, 0);
                  if (true) break;
               }
            }
            AV19W_XML_READER.read();
         }
      }
      AV19W_XML_READER.close();
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_USER_ID );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_STUDY_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_STUDY_ID, 10, 0)) );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_CONTENT_ID" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV8P_CONTENT_ID, 10, 0)) );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV23W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "P_DATA_MIN_FLG" );
      AV23W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV9P_DATA_MIN_FLG );
      AV20W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV23W_PARMS_ITEM, 0);
      AV21W_MSG = "SUB_INIT" ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
      GXv_int2[0] = AV16W_RTN_CD ;
      GXv_char3[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(1), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc05_crfif_view_metacontentlist.this.AV16W_RTN_CD = GXv_int2[0] ;
      b602_pc05_crfif_view_metacontentlist.this.AV17W_RTN_MSG = GXv_char3[0] ;
   }

   public void S121( )
   {
      /* 'SUB_ERROR' Routine */
      AV21W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO1[0] = AV20W_EXTRA_INFO;
      GXv_int2[0] = AV16W_RTN_CD ;
      GXv_char3[0] = AV17W_RTN_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV26Pgmname, (short)(0), AV21W_MSG, GXv_SdtB808_SD01_EXTRA_INFO1, GXv_int2, GXv_char3) ;
      AV20W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO1[0] ;
      b602_pc05_crfif_view_metacontentlist.this.AV16W_RTN_CD = GXv_int2[0] ;
      b602_pc05_crfif_view_metacontentlist.this.AV17W_RTN_MSG = GXv_char3[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b602_pc05_crfif_view_metacontentlist.this.AV15W_METACONTENT_LIST;
      this.aP6[0] = b602_pc05_crfif_view_metacontentlist.this.AV16W_RTN_CD;
      this.aP7[0] = b602_pc05_crfif_view_metacontentlist.this.AV17W_RTN_MSG;
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
      AV15W_METACONTENT_LIST = new SdtB602_SD05_METACONTENT_LIST(remoteHandle, context);
      AV17W_RTN_MSG = "" ;
      AV22C_APP_ID = "" ;
      AV20W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV26Pgmname = "" ;
      AV18W_URL = "" ;
      AV13W_HTTP_CLIENT = new com.genexus.internet.HttpClient();
      AV21W_MSG = "" ;
      AV19W_XML_READER = new com.genexus.xml.XMLReader();
      GXt_char4 = "" ;
      AV14W_METACONTENT_ITEM = new SdtB602_SD05_METACONTENT_LIST_METACONTENTItem(remoteHandle, context);
      AV23W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      Gx_ope = "" ;
      Gx_etb = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO1 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int2 = new short [1] ;
      GXv_char3 = new String [1] ;
      Gx_emsg = "" ;
      AV26Pgmname = "B602_PC05_CRFIF_VIEW_METACONTENTLIST" ;
      /* GeneXus formulas. */
      AV26Pgmname = "B602_PC05_CRFIF_VIEW_METACONTENTLIST" ;
      Gx_err = (short)(0) ;
   }

   private short AV16W_RTN_CD ;
   private short GXv_int2[] ;
   private short Gx_err ;
   private int GXActiveErrHndl ;
   private long AV11P_STUDY_ID ;
   private long AV8P_CONTENT_ID ;
   private String AV26Pgmname ;
   private String GXt_char4 ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXv_char3[] ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private String AV12P_USER_ID ;
   private String AV10P_PWD ;
   private String AV9P_DATA_MIN_FLG ;
   private String AV17W_RTN_MSG ;
   private String AV22C_APP_ID ;
   private String AV18W_URL ;
   private String AV21W_MSG ;
   private com.genexus.internet.HttpClient AV13W_HTTP_CLIENT ;
   private SdtB602_SD05_METACONTENT_LIST[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private com.genexus.xml.XMLReader AV19W_XML_READER ;
   private SdtB602_SD05_METACONTENT_LIST AV15W_METACONTENT_LIST ;
   private SdtB602_SD05_METACONTENT_LIST_METACONTENTItem AV14W_METACONTENT_ITEM ;
   private SdtB808_SD01_EXTRA_INFO AV20W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO1[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV23W_PARMS_ITEM ;
}

