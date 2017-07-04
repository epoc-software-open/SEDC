/*
               File: B702_PC06_DOMAIN_INFO_GET
        Description: ÉhÉÅÉCÉìèÓïÒéÊìæèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:16.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc06_domain_info_get extends GXProcedure
{
   public b702_pc06_domain_info_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc06_domain_info_get.class ), "" );
   }

   public b702_pc06_domain_info_get( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( long aP0 ,
                                         short aP1 )
   {
      b702_pc06_domain_info_get.this.AV8P_STUDY_ID = aP0;
      b702_pc06_domain_info_get.this.AV11P_CRF_ID = aP1;
      b702_pc06_domain_info_get.this.aP2 = aP2;
      b702_pc06_domain_info_get.this.aP2 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        GxObjectCollection[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             GxObjectCollection[] aP2 )
   {
      b702_pc06_domain_info_get.this.AV8P_STUDY_ID = aP0;
      b702_pc06_domain_info_get.this.AV11P_CRF_ID = aP1;
      b702_pc06_domain_info_get.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9SD_B702_SD05_DOMAIN_INFO.clear();
      /* Using cursor P005M2 */
      pr_default.execute(0, new Object[] {new Short(AV11P_CRF_ID), new Long(AV8P_STUDY_ID)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A79TBM37_STUDY_ID = P005M2_A79TBM37_STUDY_ID[0] ;
         A80TBM37_CRF_ID = P005M2_A80TBM37_CRF_ID[0] ;
         A433TBM37_DEL_FLG = P005M2_A433TBM37_DEL_FLG[0] ;
         n433TBM37_DEL_FLG = P005M2_n433TBM37_DEL_FLG[0] ;
         A500TBM37_DOM_VAR_NM = P005M2_A500TBM37_DOM_VAR_NM[0] ;
         n500TBM37_DOM_VAR_NM = P005M2_n500TBM37_DOM_VAR_NM[0] ;
         A84TBM37_DOM_CD = P005M2_A84TBM37_DOM_CD[0] ;
         n84TBM37_DOM_CD = P005M2_n84TBM37_DOM_CD[0] ;
         A82TBM37_CRF_ITEM_GRP_CD = P005M2_A82TBM37_CRF_ITEM_GRP_CD[0] ;
         A85TBM37_DOM_ITM_GRP_OID = P005M2_A85TBM37_DOM_ITM_GRP_OID[0] ;
         n85TBM37_DOM_ITM_GRP_OID = P005M2_n85TBM37_DOM_ITM_GRP_OID[0] ;
         A86TBM37_DOM_ITM_GRP_ROWNO = P005M2_A86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         n86TBM37_DOM_ITM_GRP_ROWNO = P005M2_n86TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A81TBM37_CRF_ITEM_GRP_DIV = P005M2_A81TBM37_CRF_ITEM_GRP_DIV[0] ;
         AV10SD_B702_SD05_DOMAIN_INFO_I = (SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)new SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem(remoteHandle, context);
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_id( A80TBM37_CRF_ID );
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd( A82TBM37_CRF_ITEM_GRP_CD );
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_cd( A84TBM37_DOM_CD );
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_var_nm( A500TBM37_DOM_VAR_NM );
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid( A85TBM37_DOM_ITM_GRP_OID );
         AV10SD_B702_SD05_DOMAIN_INFO_I.setgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno( A86TBM37_DOM_ITM_GRP_ROWNO );
         AV9SD_B702_SD05_DOMAIN_INFO.add(AV10SD_B702_SD05_DOMAIN_INFO_I, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = b702_pc06_domain_info_get.this.AV9SD_B702_SD05_DOMAIN_INFO;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SD_B702_SD05_DOMAIN_INFO = new GxObjectCollection(SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem.class, "B702_SD05_DOMAIN_INFO.B702_SD05_DOMAIN_INFOItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      scmdbuf = "" ;
      P005M2_A79TBM37_STUDY_ID = new long[1] ;
      P005M2_A80TBM37_CRF_ID = new short[1] ;
      P005M2_A433TBM37_DEL_FLG = new String[] {""} ;
      P005M2_n433TBM37_DEL_FLG = new boolean[] {false} ;
      P005M2_A500TBM37_DOM_VAR_NM = new String[] {""} ;
      P005M2_n500TBM37_DOM_VAR_NM = new boolean[] {false} ;
      P005M2_A84TBM37_DOM_CD = new String[] {""} ;
      P005M2_n84TBM37_DOM_CD = new boolean[] {false} ;
      P005M2_A82TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      P005M2_A85TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      P005M2_n85TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      P005M2_A86TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      P005M2_n86TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      P005M2_A81TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A433TBM37_DEL_FLG = "" ;
      A500TBM37_DOM_VAR_NM = "" ;
      A84TBM37_DOM_CD = "" ;
      A82TBM37_CRF_ITEM_GRP_CD = "" ;
      A85TBM37_DOM_ITM_GRP_OID = "" ;
      A81TBM37_CRF_ITEM_GRP_DIV = "" ;
      AV10SD_B702_SD05_DOMAIN_INFO_I = new SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem(remoteHandle, context);
      pr_default = new DataStoreProvider(context, remoteHandle, new b702_pc06_domain_info_get__default(),
         new Object[] {
             new Object[] {
            P005M2_A79TBM37_STUDY_ID, P005M2_A80TBM37_CRF_ID, P005M2_A433TBM37_DEL_FLG, P005M2_n433TBM37_DEL_FLG, P005M2_A500TBM37_DOM_VAR_NM, P005M2_n500TBM37_DOM_VAR_NM, P005M2_A84TBM37_DOM_CD, P005M2_n84TBM37_DOM_CD, P005M2_A82TBM37_CRF_ITEM_GRP_CD, P005M2_A85TBM37_DOM_ITM_GRP_OID,
            P005M2_n85TBM37_DOM_ITM_GRP_OID, P005M2_A86TBM37_DOM_ITM_GRP_ROWNO, P005M2_n86TBM37_DOM_ITM_GRP_ROWNO, P005M2_A81TBM37_CRF_ITEM_GRP_DIV
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11P_CRF_ID ;
   private short A80TBM37_CRF_ID ;
   private short A86TBM37_DOM_ITM_GRP_ROWNO ;
   private short Gx_err ;
   private long AV8P_STUDY_ID ;
   private long A79TBM37_STUDY_ID ;
   private String scmdbuf ;
   private boolean n433TBM37_DEL_FLG ;
   private boolean n500TBM37_DOM_VAR_NM ;
   private boolean n84TBM37_DOM_CD ;
   private boolean n85TBM37_DOM_ITM_GRP_OID ;
   private boolean n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String A433TBM37_DEL_FLG ;
   private String A500TBM37_DOM_VAR_NM ;
   private String A84TBM37_DOM_CD ;
   private String A82TBM37_CRF_ITEM_GRP_CD ;
   private String A85TBM37_DOM_ITM_GRP_OID ;
   private String A81TBM37_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection[] aP2 ;
   private IDataStoreProvider pr_default ;
   private long[] P005M2_A79TBM37_STUDY_ID ;
   private short[] P005M2_A80TBM37_CRF_ID ;
   private String[] P005M2_A433TBM37_DEL_FLG ;
   private boolean[] P005M2_n433TBM37_DEL_FLG ;
   private String[] P005M2_A500TBM37_DOM_VAR_NM ;
   private boolean[] P005M2_n500TBM37_DOM_VAR_NM ;
   private String[] P005M2_A84TBM37_DOM_CD ;
   private boolean[] P005M2_n84TBM37_DOM_CD ;
   private String[] P005M2_A82TBM37_CRF_ITEM_GRP_CD ;
   private String[] P005M2_A85TBM37_DOM_ITM_GRP_OID ;
   private boolean[] P005M2_n85TBM37_DOM_ITM_GRP_OID ;
   private short[] P005M2_A86TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] P005M2_n86TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] P005M2_A81TBM37_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV9SD_B702_SD05_DOMAIN_INFO ;
   private SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem AV10SD_B702_SD05_DOMAIN_INFO_I ;
}

final  class b702_pc06_domain_info_get__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005M2", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_DEL_FLG`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_CD`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_CRF_ITEM_GRP_DIV` FROM `TBM37_CRF_DOM_MAP` WHERE (`TBM37_CRF_ID` = ?) AND (Not (LENGTH(TRIM(`TBM37_DOM_CD`))=0)) AND (Not (LENGTH(TRIM(`TBM37_DOM_VAR_NM`))=0)) AND (`TBM37_STUDY_ID` = ?) AND (`TBM37_DEL_FLG` = '0') ORDER BY `TBM37_CRF_ID`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100,0,false )
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
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
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
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

