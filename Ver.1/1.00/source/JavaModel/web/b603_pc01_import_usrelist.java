/*
               File: B603_PC01_IMPORT_USRELIST
        Description: 臨床試験支援システムユーザ一覧取込処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:17.9
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b603_pc01_import_usrelist extends GXProcedure
{
   public b603_pc01_import_usrelist( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b603_pc01_import_usrelist.class ), "" );
   }

   public b603_pc01_import_usrelist( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      b603_pc01_import_usrelist.this.AV12P_USER_ID = aP0;
      b603_pc01_import_usrelist.this.AV11P_PWD = aP1;
      b603_pc01_import_usrelist.this.aP3 = new String[] {""};
      initialize();
      privateExecute();
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      b603_pc01_import_usrelist.this.AV12P_USER_ID = aP0;
      b603_pc01_import_usrelist.this.AV11P_PWD = aP1;
      b603_pc01_import_usrelist.this.aP2 = aP2;
      b603_pc01_import_usrelist.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10C_APP_ID = "B604" ;
      /* Execute user subroutine: S14132 */
      S14132 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV14W_RTN_CD = (short)(0) ;
      AV15W_RTN_MSG = "" ;
      GXv_SdtB602_SD01_USER_LIST1[0] = AV19W_USER_LIST;
      GXv_int2[0] = AV14W_RTN_CD ;
      GXv_char3[0] = AV15W_RTN_MSG ;
      new b602_pc01_crfif_view_userlist(remoteHandle, context).execute( AV12P_USER_ID, AV11P_PWD, GXv_SdtB602_SD01_USER_LIST1, GXv_int2, GXv_char3) ;
      AV19W_USER_LIST = GXv_SdtB602_SD01_USER_LIST1[0] ;
      b603_pc01_import_usrelist.this.AV14W_RTN_CD = GXv_int2[0] ;
      b603_pc01_import_usrelist.this.AV15W_RTN_MSG = GXv_char3[0] ;
      if ( AV14W_RTN_CD != 0 )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Using cursor P003M2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8TAM07_USER_ID = P003M2_A8TAM07_USER_ID[0] ;
         AV9BC_USER.Load(A8TAM07_USER_ID);
         if ( AV9BC_USER.Fail() )
         {
            AV14W_RTN_CD = (short)(1) ;
            GXt_char4 = AV15W_RTN_MSG ;
            GXv_char3[0] = GXt_char4 ;
            new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV9BC_USER.GetMessages(), GXv_char3) ;
            b603_pc01_import_usrelist.this.GXt_char4 = GXv_char3[0] ;
            AV15W_RTN_MSG = GXt_char4 ;
            /* Execute user subroutine: S131 */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_del_flg( "1" );
         AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( AV24Pgmname );
         AV9BC_USER.Save();
         if ( AV9BC_USER.Fail() )
         {
            AV14W_RTN_CD = (short)(1) ;
            GXt_char4 = AV15W_RTN_MSG ;
            GXv_char3[0] = GXt_char4 ;
            new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV9BC_USER.GetMessages(), GXv_char3) ;
            b603_pc01_import_usrelist.this.GXt_char4 = GXv_char3[0] ;
            AV15W_RTN_MSG = GXt_char4 ;
            /* Execute user subroutine: S131 */
            S131 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      GXt_char4 = AV20W_SYS_VALUE ;
      GXv_char3[0] = GXt_char4 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "013", GXv_char3) ;
      b603_pc01_import_usrelist.this.GXt_char4 = GXv_char3[0] ;
      AV20W_SYS_VALUE = GXt_char4 ;
      AV25GXV1 = 1 ;
      while ( AV25GXV1 <= AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_User().size() )
      {
         AV18W_USER_ITEM = (SdtB602_SD01_USER_LIST_USERItem)((SdtB602_SD01_USER_LIST_USERItem)AV19W_USER_LIST.getgxTv_SdtB602_SD01_USER_LIST_User().elementAt(-1+AV25GXV1));
         /* Execute user subroutine: S1179 */
         S1179 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         /* Execute user subroutine: S12100 */
         S12100 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV25GXV1 = (int)(AV25GXV1+1) ;
      }
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S1179( )
   {
      /* 'SUB_SITE' Routine */
      GXv_char3[0] = AV17W_SITE_NM ;
      GXv_int5[0] = (byte)(AV13W_ERR_CD) ;
      new a822_pc01_str_token(remoteHandle, context).execute( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong(), "@", (short)(1), GXv_char3, GXv_int5) ;
      b603_pc01_import_usrelist.this.AV17W_SITE_NM = GXv_char3[0] ;
      b603_pc01_import_usrelist.this.AV13W_ERR_CD = GXv_int5[0] ;
      GXv_char3[0] = AV16W_SITE_ID ;
      GXv_int5[0] = (byte)(AV13W_ERR_CD) ;
      new a822_pc01_str_token(remoteHandle, context).execute( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Belong(), "@", (short)(2), GXv_char3, GXv_int5) ;
      b603_pc01_import_usrelist.this.AV16W_SITE_ID = GXv_char3[0] ;
      b603_pc01_import_usrelist.this.AV13W_ERR_CD = GXv_int5[0] ;
      AV26GXLvl86 = (byte)(0) ;
      /* Using cursor P003M3 */
      pr_default.execute(1, new Object[] {AV16W_SITE_ID});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A139TAM08_DEL_FLG = P003M3_A139TAM08_DEL_FLG[0] ;
         n139TAM08_DEL_FLG = P003M3_n139TAM08_DEL_FLG[0] ;
         A132TAM08_SITE_ID = P003M3_A132TAM08_SITE_ID[0] ;
         AV26GXLvl86 = (byte)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      if ( AV26GXLvl86 == 0 )
      {
         AV16W_SITE_ID = AV20W_SYS_VALUE ;
      }
   }

   public void S12100( )
   {
      /* 'SUB_USER' Routine */
      AV9BC_USER.Load(AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id());
      if ( AV9BC_USER.Fail() )
      {
         AV9BC_USER = (SdtTAM07_USER)new SdtTAM07_USER( remoteHandle, context);
         AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_user_id( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Login_id() );
         AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_crt_prog_nm( AV24Pgmname );
      }
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_user_nm( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Handle() );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_pwd( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Password() );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_auth_cd( GXutil.padl( GXutil.trim( GXutil.str( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Role_authority_id(), 10, 0)), (short)(2), "0") );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_site_id( AV16W_SITE_ID );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_email( AV18W_USER_ITEM.getgxTv_SdtB602_SD01_USER_LIST_USERItem_Email() );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_del_flg( "0" );
      AV9BC_USER.setgxTv_SdtTAM07_USER_Tam07_upd_prog_nm( AV24Pgmname );
      AV9BC_USER.Save();
      if ( AV9BC_USER.Fail() )
      {
         AV14W_RTN_CD = (short)(1) ;
         GXt_char4 = AV15W_RTN_MSG ;
         GXv_char3[0] = GXt_char4 ;
         new b803_pc02_get_bcmsg_airres(remoteHandle, context).execute( AV9BC_USER.GetMessages(), GXv_char3) ;
         b603_pc01_import_usrelist.this.GXt_char4 = GXv_char3[0] ;
         AV15W_RTN_MSG = GXt_char4 ;
         /* Execute user subroutine: S131 */
         S131 ();
         if (returnInSub) return;
         returnInSub = true;
         if (true) return;
      }
   }

   public void S14132( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S131( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV14W_RTN_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b603_pc01_import_usrelist");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b603_pc01_import_usrelist");
      }
   }

   public void S15155( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV24Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      Application.rollback(context, remoteHandle, "DEFAULT", "b603_pc01_import_usrelist");
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   protected void cleanup( )
   {
      this.aP2[0] = b603_pc01_import_usrelist.this.AV14W_RTN_CD;
      this.aP3[0] = b603_pc01_import_usrelist.this.AV15W_RTN_MSG;
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
                  /* Execute user subroutine: S15155 */
                  S15155 ();
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
      AV15W_RTN_MSG = "" ;
      AV10C_APP_ID = "" ;
      AV19W_USER_LIST = new SdtB602_SD01_USER_LIST(remoteHandle, context);
      GXv_SdtB602_SD01_USER_LIST1 = new SdtB602_SD01_USER_LIST [1] ;
      GXv_int2 = new short [1] ;
      scmdbuf = "" ;
      P003M2_A8TAM07_USER_ID = new String[] {""} ;
      A8TAM07_USER_ID = "" ;
      AV9BC_USER = new SdtTAM07_USER(remoteHandle);
      AV24Pgmname = "" ;
      AV20W_SYS_VALUE = "" ;
      AV18W_USER_ITEM = new SdtB602_SD01_USER_LIST_USERItem(remoteHandle, context);
      AV17W_SITE_NM = "" ;
      AV16W_SITE_ID = "" ;
      GXv_int5 = new byte [1] ;
      P003M3_A139TAM08_DEL_FLG = new String[] {""} ;
      P003M3_n139TAM08_DEL_FLG = new boolean[] {false} ;
      P003M3_A132TAM08_SITE_ID = new String[] {""} ;
      A139TAM08_DEL_FLG = "" ;
      A132TAM08_SITE_ID = "" ;
      GXv_char3 = new String [1] ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      GXt_char4 = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b603_pc01_import_usrelist__default(),
         new Object[] {
             new Object[] {
            P003M2_A8TAM07_USER_ID
            }
            , new Object[] {
            P003M3_A139TAM08_DEL_FLG, P003M3_n139TAM08_DEL_FLG, P003M3_A132TAM08_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV24Pgmname = "B603_PC01_IMPORT_USRELIST" ;
      /* GeneXus formulas. */
      AV24Pgmname = "B603_PC01_IMPORT_USRELIST" ;
      Gx_err = (short)(0) ;
   }

   private byte GXv_int5[] ;
   private byte AV26GXLvl86 ;
   private short AV14W_RTN_CD ;
   private short GXv_int2[] ;
   private short AV13W_ERR_CD ;
   private short Gx_err ;
   private int AV25GXV1 ;
   private int GXActiveErrHndl ;
   private String scmdbuf ;
   private String AV24Pgmname ;
   private String GXv_char3[] ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String GXt_char4 ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n139TAM08_DEL_FLG ;
   private String AV12P_USER_ID ;
   private String AV11P_PWD ;
   private String AV15W_RTN_MSG ;
   private String AV10C_APP_ID ;
   private String A8TAM07_USER_ID ;
   private String AV20W_SYS_VALUE ;
   private String AV17W_SITE_NM ;
   private String AV16W_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A132TAM08_SITE_ID ;
   private short[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P003M2_A8TAM07_USER_ID ;
   private String[] P003M3_A139TAM08_DEL_FLG ;
   private boolean[] P003M3_n139TAM08_DEL_FLG ;
   private String[] P003M3_A132TAM08_SITE_ID ;
   private SdtTAM07_USER AV9BC_USER ;
   private SdtB602_SD01_USER_LIST AV19W_USER_LIST ;
   private SdtB602_SD01_USER_LIST GXv_SdtB602_SD01_USER_LIST1[] ;
   private SdtB602_SD01_USER_LIST_USERItem AV18W_USER_ITEM ;
}

final  class b603_pc01_import_usrelist__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003M2", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` ORDER BY `TAM07_USER_ID` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P003M3", "SELECT `TAM08_DEL_FLG`, `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE (`TAM08_SITE_ID` = ?) AND (`TAM08_DEL_FLG` = '0') ORDER BY `TAM08_SITE_ID`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
      }
   }

}

