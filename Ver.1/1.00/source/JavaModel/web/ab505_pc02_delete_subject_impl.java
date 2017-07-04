/*
               File: ab505_pc02_delete_subject_impl
        Description: ä≥é“çÌèú
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:52:25.25
       Program type: Main program
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ab505_pc02_delete_subject_impl extends GXWebProcedure
{
   public ab505_pc02_delete_subject_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public void webExecute( )
   {
      GXKey = context.getSiteKey( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B505" ;
      AV13W_ERR_CD = (short)(0) ;
      AV14W_ERR_MSG = "" ;
      AV18W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV18W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV18W_EXTRA_INFO", AV18W_EXTRA_INFO);
      /* Execute user subroutine: S11117 */
      S11117 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S12147 */
      S12147 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "INFO", "ä≥é“çÌèú") ;
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT11_CRF_HISTORY" ;
         /* Using cursor P003D2 */
         pr_default.execute(0, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT12_CRF_RESULT" ;
         /* Using cursor P003D3 */
         pr_default.execute(1, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT13_CRF_RES_HIS" ;
         /* Using cursor P003D4 */
         pr_default.execute(2, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT15_CRF_MEMO_LOC" ;
         /* Using cursor P003D5 */
         pr_default.execute(3, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT14_CRF_MEMO" ;
         /* Using cursor P003D6 */
         pr_default.execute(4, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT02_CRF" ;
         /* Using cursor P003D7 */
         pr_default.execute(5, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      if ( AV13W_ERR_CD == 0 )
      {
         /* Optimized DELETE. */
         Gx_ope = "Delete" ;
         Gx_etb = "TBT01_SUBJECT" ;
         /* Using cursor P003D8 */
         pr_default.execute(6, new Object[] {new Long(AV10P_STUDY_ID), new Integer(AV11P_SUBJECT_NO)});
         /* End optimized DELETE. */
      }
      AV16W_HTTP_RES.addString(GXutil.trim( GXutil.str( AV13W_ERR_CD, 10, 0))+new b802_pc02_nl_airres(remoteHandle, context).executeUdp( ));
      AV16W_HTTP_RES.addString(AV14W_ERR_MSG);
      /* Execute user subroutine: S13163 */
      S13163 ();
      if ( returnInSub )
      {
      }
      if ( ! (GXutil.strcmp("", httpContext.wjLoc)==0) )
      {
         httpContext.redirect( httpContext.wjLoc );
         httpContext.wjLoc = "" ;
      }
      cleanup();
   }

   public void S11117( )
   {
      /* 'SUB_GET_PARM' Routine */
      AV12P_USER_ID = AV15W_HTTP_REQ.getVariable("USER_ID") ;
      AV9P_PWD = AV15W_HTTP_REQ.getVariable("PW") ;
      AV11P_SUBJECT_NO = (int)(GXutil.lval( AV15W_HTTP_REQ.getVariable("SUBJECT_NO"))) ;
      AV10P_STUDY_ID = GXutil.lval( AV15W_HTTP_REQ.getVariable("STUDY_ID")) ;
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().clear();
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "USER_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( AV12P_USER_ID );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "SUBJECT_NO" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV11P_SUBJECT_NO, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV19W_PARMS_ITEM = (SdtB808_SD01_EXTRA_INFO_PARMSItem)new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Name( "STUDY_ID" );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV19W_PARMS_ITEM.setgxTv_SdtB808_SD01_EXTRA_INFO_PARMSItem_Value( GXutil.trim( GXutil.str( AV10P_STUDY_ID, 10, 0)) );
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19W_PARMS_ITEM", AV19W_PARMS_ITEM);
      AV18W_EXTRA_INFO.getgxTv_SdtB808_SD01_EXTRA_INFO_Parms().add(AV19W_PARMS_ITEM, 0);
      AV17W_MSG = "SUB_GET_PARM" ;
      GXv_SdtB808_SD01_EXTRA_INFO2[0] = AV18W_EXTRA_INFO;
      GXv_int3[0] = AV13W_ERR_CD ;
      GXv_char4[0] = AV14W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO2, GXv_int3, GXv_char4) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO2[0] ;
      ab505_pc02_delete_subject_impl.this.AV13W_ERR_CD = GXv_int3[0] ;
      ab505_pc02_delete_subject_impl.this.AV14W_ERR_MSG = GXv_char4[0] ;
   }

   public void S12147( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      if ( ! httpContext.isAjaxRequest( ) )
      {
         AV16W_HTTP_RES.addHeader("Content-Type", "text/plain; charset=UTF-8");
      }
      GXv_char4[0] = AV12P_USER_ID ;
      GXv_int3[0] = AV13W_ERR_CD ;
      GXv_char5[0] = AV14W_ERR_MSG ;
      new b101_pc01_login(remoteHandle, context).execute( GXv_char4, AV9P_PWD, GXv_int3, GXv_char5) ;
      ab505_pc02_delete_subject_impl.this.AV12P_USER_ID = GXv_char4[0] ;
      ab505_pc02_delete_subject_impl.this.AV13W_ERR_CD = GXv_int3[0] ;
      ab505_pc02_delete_subject_impl.this.AV14W_ERR_MSG = GXv_char5[0] ;
   }

   public void S13163( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV13W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "ab505_pc02_delete_subject");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "ab505_pc02_delete_subject");
      }
      AV17W_MSG = "Error Result" + GXutil.chr( (short)(9)) + " Code:" + GXutil.trim( GXutil.str( AV13W_ERR_CD, 10, 0)) + GXutil.chr( (short)(9)) + "Message:" + AV14W_ERR_MSG ;
      GXv_SdtB808_SD01_EXTRA_INFO2[0] = AV18W_EXTRA_INFO;
      GXv_int3[0] = AV13W_ERR_CD ;
      GXv_char5[0] = AV14W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(1), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO2, GXv_int3, GXv_char5) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO2[0] ;
      ab505_pc02_delete_subject_impl.this.AV13W_ERR_CD = GXv_int3[0] ;
      ab505_pc02_delete_subject_impl.this.AV14W_ERR_MSG = GXv_char5[0] ;
      GXv_int3[0] = AV13W_ERR_CD ;
      GXv_char5[0] = AV14W_ERR_MSG ;
      new b101_pc02_logout(remoteHandle, context).execute( GXv_int3, GXv_char5) ;
      ab505_pc02_delete_subject_impl.this.AV13W_ERR_CD = GXv_int3[0] ;
      ab505_pc02_delete_subject_impl.this.AV14W_ERR_MSG = GXv_char5[0] ;
   }

   public void S14182( )
   {
      /* 'SUB_ERROR' Routine */
      AV17W_MSG = GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0)) + ":" + context.globals.Gx_dbt + ":" + Gx_ope + ":" + Gx_etb ;
      GXv_SdtB808_SD01_EXTRA_INFO2[0] = AV18W_EXTRA_INFO;
      GXv_int3[0] = AV13W_ERR_CD ;
      GXv_char5[0] = AV14W_ERR_MSG ;
      new b808_pc01_dbg_log(remoteHandle, context).execute( AV22Pgmname, (short)(0), AV17W_MSG, GXv_SdtB808_SD01_EXTRA_INFO2, GXv_int3, GXv_char5) ;
      AV18W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO2[0] ;
      ab505_pc02_delete_subject_impl.this.AV13W_ERR_CD = GXv_int3[0] ;
      ab505_pc02_delete_subject_impl.this.AV14W_ERR_MSG = GXv_char5[0] ;
      context.globals.Gx_eop = (byte)(0) ;
   }

   protected void cleanup( )
   {
      CloseOpenCursors();
      super.cleanup();
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
                  /* Execute user subroutine: S14182 */
                  S14182 ();
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
      GXKey = "" ;
      gxfirstwebparm = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV14W_ERR_MSG = "" ;
      AV18W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV22Pgmname = "" ;
      Gx_ope = "" ;
      Gx_etb = "" ;
      AV16W_HTTP_RES = httpContext.getHttpResponse();
      GXt_char1 = "" ;
      AV12P_USER_ID = "" ;
      AV15W_HTTP_REQ = httpContext.getHttpRequest();
      AV9P_PWD = "" ;
      AV19W_PARMS_ITEM = new SdtB808_SD01_EXTRA_INFO_PARMSItem(remoteHandle, context);
      AV17W_MSG = "" ;
      GXv_char4 = new String [1] ;
      GXv_SdtB808_SD01_EXTRA_INFO2 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int3 = new short [1] ;
      GXv_char5 = new String [1] ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new ab505_pc02_delete_subject__default(),
         new Object[] {
             new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "AB505_PC02_DELETE_SUBJECT" ;
      /* GeneXus formulas. */
      AV22Pgmname = "AB505_PC02_DELETE_SUBJECT" ;
      Gx_err = (short)(0) ;
   }

   private short AV13W_ERR_CD ;
   private short GXv_int3[] ;
   private short Gx_err ;
   private int AV11P_SUBJECT_NO ;
   private int GXActiveErrHndl ;
   private long AV10P_STUDY_ID ;
   private String GXKey ;
   private String gxfirstwebparm ;
   private String AV22Pgmname ;
   private String Gx_ope ;
   private String Gx_etb ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char5[] ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean returnInSub ;
   private String AV8C_TAM02_APP_ID ;
   private String AV14W_ERR_MSG ;
   private String AV12P_USER_ID ;
   private String AV9P_PWD ;
   private String AV17W_MSG ;
   private com.genexus.internet.HttpRequest AV15W_HTTP_REQ ;
   private IDataStoreProvider pr_default ;
   private com.genexus.internet.HttpResponse AV16W_HTTP_RES ;
   private SdtB808_SD01_EXTRA_INFO AV18W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO2[] ;
   private SdtB808_SD01_EXTRA_INFO_PARMSItem AV19W_PARMS_ITEM ;
}

final  class ab505_pc02_delete_subject__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P003D2", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D3", "DELETE FROM `TBT12_CRF_RESULT`  WHERE `TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D4", "DELETE FROM `TBT13_CRF_RES_HIS`  WHERE `TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D5", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D6", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D7", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P003D8", "DELETE FROM `TBT01_SUBJECT`  WHERE `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

