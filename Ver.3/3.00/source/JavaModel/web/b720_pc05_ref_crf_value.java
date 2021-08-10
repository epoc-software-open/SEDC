/*
               File: B720_PC05_REF_CRF_VALUE
        Description: 参照CRF項目グループ値取得処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:35.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc05_ref_crf_value extends GXProcedure
{
   public b720_pc05_ref_crf_value( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc05_ref_crf_value.class ), "" );
   }

   public b720_pc05_ref_crf_value( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 )
   {
      b720_pc05_ref_crf_value.this.AV9P_STUDY_ID = aP0;
      b720_pc05_ref_crf_value.this.AV10P_SUBJECT_ID = aP1;
      b720_pc05_ref_crf_value.this.AV12P_TBM32_REF_CRF_ID = aP2;
      b720_pc05_ref_crf_value.this.AV11P_TBM32_CRF_ITEM_GRP_CD = aP3;
      b720_pc05_ref_crf_value.this.aP4 = aP4;
      b720_pc05_ref_crf_value.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( long aP0 ,
                        int aP1 ,
                        short aP2 ,
                        String aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( long aP0 ,
                             int aP1 ,
                             short aP2 ,
                             String aP3 ,
                             String[] aP4 )
   {
      b720_pc05_ref_crf_value.this.AV9P_STUDY_ID = aP0;
      b720_pc05_ref_crf_value.this.AV10P_SUBJECT_ID = aP1;
      b720_pc05_ref_crf_value.this.AV12P_TBM32_REF_CRF_ID = aP2;
      b720_pc05_ref_crf_value.this.AV11P_TBM32_CRF_ITEM_GRP_CD = aP3;
      b720_pc05_ref_crf_value.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8P_CRF_VALUE = "" ;
      /* Using cursor P00782 */
      pr_default.execute(0, new Object[] {new Long(AV9P_STUDY_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV11P_TBM32_CRF_ITEM_GRP_CD});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A70TBM32_STUDY_ID = P00782_A70TBM32_STUDY_ID[0] ;
         A71TBM32_CRF_ID = P00782_A71TBM32_CRF_ID[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = P00782_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         n73TBM32_CRF_ITEM_GRP_CD = P00782_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A74TBM32_CRF_ITEM_DIV = P00782_A74TBM32_CRF_ITEM_DIV[0] ;
         n74TBM32_CRF_ITEM_DIV = P00782_n74TBM32_CRF_ITEM_DIV[0] ;
         A72TBM32_CRF_ITEM_CD = P00782_A72TBM32_CRF_ITEM_CD[0] ;
         A525TBM32_LIST_CD = P00782_A525TBM32_LIST_CD[0] ;
         n525TBM32_LIST_CD = P00782_n525TBM32_LIST_CD[0] ;
         A524TBM32_TEXT = P00782_A524TBM32_TEXT[0] ;
         n524TBM32_TEXT = P00782_n524TBM32_TEXT[0] ;
         A509TBM32_LOCATION_Y = P00782_A509TBM32_LOCATION_Y[0] ;
         n509TBM32_LOCATION_Y = P00782_n509TBM32_LOCATION_Y[0] ;
         A508TBM32_LOCATION_X = P00782_A508TBM32_LOCATION_X[0] ;
         n508TBM32_LOCATION_X = P00782_n508TBM32_LOCATION_X[0] ;
         if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "SelectBox") == 0 )
         {
            AV16W_TBM32_REF_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            GXv_char1[0] = AV14W_TBM26_LIST_ITEM_NAME ;
            new b799_pc10_sel_list_item_get(remoteHandle, context).execute( AV9P_STUDY_ID, A525TBM32_LIST_CD, AV17W_TBT12_CRF_VALUE, GXv_char1) ;
            b720_pc05_ref_crf_value.this.AV14W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + AV14W_TBM26_LIST_ITEM_NAME ;
         }
         else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "CheckBox") == 0 )
         {
            AV16W_TBM32_REF_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( ! (GXutil.strcmp("", AV17W_TBT12_CRF_VALUE)==0) )
            {
               AV8P_CRF_VALUE = AV8P_CRF_VALUE + A524TBM32_TEXT ;
            }
         }
         else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Group") == 0 )
         {
         }
         else if ( GXutil.strcmp(A74TBM32_CRF_ITEM_DIV, "Label") == 0 )
         {
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + A524TBM32_TEXT ;
         }
         else
         {
            AV16W_TBM32_REF_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            AV8P_CRF_VALUE = AV8P_CRF_VALUE + AV17W_TBT12_CRF_VALUE ;
         }
         AV8P_CRF_VALUE = AV8P_CRF_VALUE + " " ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CRF_VALUE_GET' Routine */
      AV17W_TBT12_CRF_VALUE = "" ;
      /* Using cursor P00783 */
      pr_default.execute(1, new Object[] {new Long(AV9P_STUDY_ID), new Integer(AV10P_SUBJECT_ID), new Short(AV12P_TBM32_REF_CRF_ID), AV16W_TBM32_REF_CRF_ITEM_CD});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A100TBT12_CRF_ITEM_GRP_CD = P00783_A100TBT12_CRF_ITEM_GRP_CD[0] ;
         A937TBT12_CRF_EDA_NO = P00783_A937TBT12_CRF_EDA_NO[0] ;
         A98TBT12_CRF_ID = P00783_A98TBT12_CRF_ID[0] ;
         A97TBT12_SUBJECT_ID = P00783_A97TBT12_SUBJECT_ID[0] ;
         A96TBT12_STUDY_ID = P00783_A96TBT12_STUDY_ID[0] ;
         A465TBT12_CRF_VALUE = P00783_A465TBT12_CRF_VALUE[0] ;
         n465TBT12_CRF_VALUE = P00783_n465TBT12_CRF_VALUE[0] ;
         A99TBT12_CRF_ITEM_GRP_DIV = P00783_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
         AV17W_TBT12_CRF_VALUE = A465TBT12_CRF_VALUE ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S131( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV22Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b720_pc05_ref_crf_value.this.AV8P_CRF_VALUE;
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
                  /* Execute user subroutine: S131 */
                  S131 ();
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
      AV8P_CRF_VALUE = "" ;
      scmdbuf = "" ;
      P00782_A70TBM32_STUDY_ID = new long[1] ;
      P00782_A71TBM32_CRF_ID = new short[1] ;
      P00782_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00782_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      P00782_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      P00782_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      P00782_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      P00782_A525TBM32_LIST_CD = new String[] {""} ;
      P00782_n525TBM32_LIST_CD = new boolean[] {false} ;
      P00782_A524TBM32_TEXT = new String[] {""} ;
      P00782_n524TBM32_TEXT = new boolean[] {false} ;
      P00782_A509TBM32_LOCATION_Y = new short[1] ;
      P00782_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      P00782_A508TBM32_LOCATION_X = new short[1] ;
      P00782_n508TBM32_LOCATION_X = new boolean[] {false} ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      A525TBM32_LIST_CD = "" ;
      A524TBM32_TEXT = "" ;
      AV16W_TBM32_REF_CRF_ITEM_CD = "" ;
      AV17W_TBT12_CRF_VALUE = "" ;
      AV14W_TBM26_LIST_ITEM_NAME = "" ;
      GXv_char1 = new String [1] ;
      P00783_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00783_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P00783_A98TBT12_CRF_ID = new short[1] ;
      P00783_A97TBT12_SUBJECT_ID = new int[1] ;
      P00783_A96TBT12_STUDY_ID = new long[1] ;
      P00783_A465TBT12_CRF_VALUE = new String[] {""} ;
      P00783_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P00783_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV22Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc05_ref_crf_value__default(),
         new Object[] {
             new Object[] {
            P00782_A70TBM32_STUDY_ID, P00782_A71TBM32_CRF_ID, P00782_A73TBM32_CRF_ITEM_GRP_CD, P00782_n73TBM32_CRF_ITEM_GRP_CD, P00782_A74TBM32_CRF_ITEM_DIV, P00782_n74TBM32_CRF_ITEM_DIV, P00782_A72TBM32_CRF_ITEM_CD, P00782_A525TBM32_LIST_CD, P00782_n525TBM32_LIST_CD, P00782_A524TBM32_TEXT,
            P00782_n524TBM32_TEXT, P00782_A509TBM32_LOCATION_Y, P00782_n509TBM32_LOCATION_Y, P00782_A508TBM32_LOCATION_X, P00782_n508TBM32_LOCATION_X
            }
            , new Object[] {
            P00783_A100TBT12_CRF_ITEM_GRP_CD, P00783_A937TBT12_CRF_EDA_NO, P00783_A98TBT12_CRF_ID, P00783_A97TBT12_SUBJECT_ID, P00783_A96TBT12_STUDY_ID, P00783_A465TBT12_CRF_VALUE, P00783_n465TBT12_CRF_VALUE, P00783_A99TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV22Pgmname = "B720_PC05_REF_CRF_VALUE" ;
      /* GeneXus formulas. */
      AV22Pgmname = "B720_PC05_REF_CRF_VALUE" ;
      Gx_err = (short)(0) ;
   }

   private byte A937TBT12_CRF_EDA_NO ;
   private short AV12P_TBM32_REF_CRF_ID ;
   private short A71TBM32_CRF_ID ;
   private short A509TBM32_LOCATION_Y ;
   private short A508TBM32_LOCATION_X ;
   private short A98TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV10P_SUBJECT_ID ;
   private int A97TBT12_SUBJECT_ID ;
   private int GXActiveErrHndl ;
   private long AV9P_STUDY_ID ;
   private long A70TBM32_STUDY_ID ;
   private long A96TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String AV22Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n524TBM32_TEXT ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n465TBT12_CRF_VALUE ;
   private String AV11P_TBM32_CRF_ITEM_GRP_CD ;
   private String AV8P_CRF_VALUE ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A525TBM32_LIST_CD ;
   private String A524TBM32_TEXT ;
   private String AV16W_TBM32_REF_CRF_ITEM_CD ;
   private String AV17W_TBT12_CRF_VALUE ;
   private String AV14W_TBM26_LIST_ITEM_NAME ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private long[] P00782_A70TBM32_STUDY_ID ;
   private short[] P00782_A71TBM32_CRF_ID ;
   private String[] P00782_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] P00782_n73TBM32_CRF_ITEM_GRP_CD ;
   private String[] P00782_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] P00782_n74TBM32_CRF_ITEM_DIV ;
   private String[] P00782_A72TBM32_CRF_ITEM_CD ;
   private String[] P00782_A525TBM32_LIST_CD ;
   private boolean[] P00782_n525TBM32_LIST_CD ;
   private String[] P00782_A524TBM32_TEXT ;
   private boolean[] P00782_n524TBM32_TEXT ;
   private short[] P00782_A509TBM32_LOCATION_Y ;
   private boolean[] P00782_n509TBM32_LOCATION_Y ;
   private short[] P00782_A508TBM32_LOCATION_X ;
   private boolean[] P00782_n508TBM32_LOCATION_X ;
   private String[] P00783_A100TBT12_CRF_ITEM_GRP_CD ;
   private byte[] P00783_A937TBT12_CRF_EDA_NO ;
   private short[] P00783_A98TBT12_CRF_ID ;
   private int[] P00783_A97TBT12_SUBJECT_ID ;
   private long[] P00783_A96TBT12_STUDY_ID ;
   private String[] P00783_A465TBT12_CRF_VALUE ;
   private boolean[] P00783_n465TBT12_CRF_VALUE ;
   private String[] P00783_A99TBT12_CRF_ITEM_GRP_DIV ;
}

final  class b720_pc05_ref_crf_value__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00782", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_CD`, `TBM32_LIST_CD`, `TBM32_TEXT`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X` FROM `TBM32_CRF_ITEM` WHERE (`TBM32_STUDY_ID` = ?) AND (`TBM32_CRF_ID` = ?) AND (`TBM32_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBM32_LOCATION_X`, `TBM32_LOCATION_Y` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
         ,new ForEachCursor("P00783", "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_EDA_NO`, `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_VALUE`, `TBT12_CRF_ITEM_GRP_DIV` FROM `TBT12_CRF_RESULT` WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = 1) AND (`TBT12_CRF_ITEM_GRP_CD` = ?) ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               return;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setVarchar(4, (String)parms[3], 50);
               return;
      }
   }

}

