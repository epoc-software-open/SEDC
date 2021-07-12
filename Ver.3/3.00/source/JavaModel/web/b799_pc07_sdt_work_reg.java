/*
               File: B799_PC07_SDT_WORK_REG
        Description: SDTワークテーブル登録・更新処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:18.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc07_sdt_work_reg extends GXProcedure
{
   public b799_pc07_sdt_work_reg( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc07_sdt_work_reg.class ), "" );
   }

   public b799_pc07_sdt_work_reg( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             java.util.Date aP1 ,
                             SdtB792_SD01_CRF aP2 ,
                             String[] aP3 )
   {
      b799_pc07_sdt_work_reg.this.AV9P_SESSION_ID = aP0;
      b799_pc07_sdt_work_reg.this.AV8P_DISP_DATETIME = aP1;
      b799_pc07_sdt_work_reg.this.AV10SD_B792_SD01_CRF = aP2;
      b799_pc07_sdt_work_reg.this.aP3 = aP3;
      b799_pc07_sdt_work_reg.this.aP4 = aP4;
      b799_pc07_sdt_work_reg.this.aP4 = new String[] {""};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        SdtB792_SD01_CRF aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             SdtB792_SD01_CRF aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      b799_pc07_sdt_work_reg.this.AV9P_SESSION_ID = aP0;
      b799_pc07_sdt_work_reg.this.AV8P_DISP_DATETIME = aP1;
      b799_pc07_sdt_work_reg.this.AV10SD_B792_SD01_CRF = aP2;
      b799_pc07_sdt_work_reg.this.aP3 = aP3;
      b799_pc07_sdt_work_reg.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12W_RTN_CD = "0" ;
      AV11W_MSG = "" ;
      GXt_char1 = AV13W_TBW01_DISP_DATETIME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( AV8P_DISP_DATETIME, "YYYYMMDDHHMISS", GXv_char2) ;
      b799_pc07_sdt_work_reg.this.GXt_char1 = GXv_char2[0] ;
      AV13W_TBW01_DISP_DATETIME = GXt_char1 ;
      AV16GXLvl24 = (byte)(0) ;
      /* Using cursor P005I2 */
      pr_default.execute(0, new Object[] {AV9P_SESSION_ID, AV13W_TBW01_DISP_DATETIME, new Long(AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id()), new Integer(AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id()), new Short(AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id()), new Byte(AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no()), new Short(AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version())});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A197TBW14_CRF_LATEST_VERSION = P005I2_A197TBW14_CRF_LATEST_VERSION[0] ;
         A940TBW14_CRF_EDA_NO = P005I2_A940TBW14_CRF_EDA_NO[0] ;
         A196TBW14_CRF_ID = P005I2_A196TBW14_CRF_ID[0] ;
         A195TBW14_SUBJECT_ID = P005I2_A195TBW14_SUBJECT_ID[0] ;
         A194TBW14_STUDY_ID = P005I2_A194TBW14_STUDY_ID[0] ;
         A193TBW14_DISP_DATETIME = P005I2_A193TBW14_DISP_DATETIME[0] ;
         A192TBW14_SESSION_ID = P005I2_A192TBW14_SESSION_ID[0] ;
         A890TBW14_SDT_SAVE = P005I2_A890TBW14_SDT_SAVE[0] ;
         n890TBW14_SDT_SAVE = P005I2_n890TBW14_SDT_SAVE[0] ;
         AV16GXLvl24 = (byte)(1) ;
         A890TBW14_SDT_SAVE = AV10SD_B792_SD01_CRF.toxml(false, true, "B792_SD01_CRF", "tablet-EDC_GXXEV3U3") ;
         n890TBW14_SDT_SAVE = false ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         /* Using cursor P005I3 */
         pr_default.execute(1, new Object[] {new Boolean(n890TBW14_SDT_SAVE), A890TBW14_SDT_SAVE, A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
         if (true) break;
         /* Using cursor P005I4 */
         pr_default.execute(2, new Object[] {new Boolean(n890TBW14_SDT_SAVE), A890TBW14_SDT_SAVE, A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV16GXLvl24 == 0 )
      {
         /*
            INSERT RECORD ON TABLE TBW14_CRF_SDT_WORK

         */
         A192TBW14_SESSION_ID = AV9P_SESSION_ID ;
         A193TBW14_DISP_DATETIME = AV13W_TBW01_DISP_DATETIME ;
         A194TBW14_STUDY_ID = AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_study_id() ;
         A195TBW14_SUBJECT_ID = AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_subject_id() ;
         A196TBW14_CRF_ID = AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_id() ;
         A940TBW14_CRF_EDA_NO = AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_eda_no() ;
         A197TBW14_CRF_LATEST_VERSION = AV10SD_B792_SD01_CRF.getgxTv_SdtB792_SD01_CRF_Tbt02_crf_latest_version() ;
         A890TBW14_SDT_SAVE = AV10SD_B792_SD01_CRF.toxml(false, true, "B792_SD01_CRF", "tablet-EDC_GXXEV3U3") ;
         n890TBW14_SDT_SAVE = false ;
         /* Using cursor P005I5 */
         pr_default.execute(3, new Object[] {A192TBW14_SESSION_ID, A193TBW14_DISP_DATETIME, new Long(A194TBW14_STUDY_ID), new Integer(A195TBW14_SUBJECT_ID), new Short(A196TBW14_CRF_ID), new Byte(A940TBW14_CRF_EDA_NO), new Short(A197TBW14_CRF_LATEST_VERSION), new Boolean(n890TBW14_SDT_SAVE), A890TBW14_SDT_SAVE});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW14_CRF_SDT_WORK") ;
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
      }
      Application.commit(context, remoteHandle, "DEFAULT", "b799_pc07_sdt_work_reg");
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = b799_pc07_sdt_work_reg.this.AV12W_RTN_CD;
      this.aP4[0] = b799_pc07_sdt_work_reg.this.AV11W_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_RTN_CD = "" ;
      AV11W_MSG = "" ;
      AV13W_TBW01_DISP_DATETIME = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      scmdbuf = "" ;
      P005I2_A197TBW14_CRF_LATEST_VERSION = new short[1] ;
      P005I2_A940TBW14_CRF_EDA_NO = new byte[1] ;
      P005I2_A196TBW14_CRF_ID = new short[1] ;
      P005I2_A195TBW14_SUBJECT_ID = new int[1] ;
      P005I2_A194TBW14_STUDY_ID = new long[1] ;
      P005I2_A193TBW14_DISP_DATETIME = new String[] {""} ;
      P005I2_A192TBW14_SESSION_ID = new String[] {""} ;
      P005I2_A890TBW14_SDT_SAVE = new String[] {""} ;
      P005I2_n890TBW14_SDT_SAVE = new boolean[] {false} ;
      A193TBW14_DISP_DATETIME = "" ;
      A192TBW14_SESSION_ID = "" ;
      A890TBW14_SDT_SAVE = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b799_pc07_sdt_work_reg__default(),
         new Object[] {
             new Object[] {
            P005I2_A197TBW14_CRF_LATEST_VERSION, P005I2_A940TBW14_CRF_EDA_NO, P005I2_A196TBW14_CRF_ID, P005I2_A195TBW14_SUBJECT_ID, P005I2_A194TBW14_STUDY_ID, P005I2_A193TBW14_DISP_DATETIME, P005I2_A192TBW14_SESSION_ID, P005I2_A890TBW14_SDT_SAVE, P005I2_n890TBW14_SDT_SAVE
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16GXLvl24 ;
   private byte A940TBW14_CRF_EDA_NO ;
   private short A197TBW14_CRF_LATEST_VERSION ;
   private short A196TBW14_CRF_ID ;
   private short Gx_err ;
   private int A195TBW14_SUBJECT_ID ;
   private int GX_INS60 ;
   private long A194TBW14_STUDY_ID ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private java.util.Date AV8P_DISP_DATETIME ;
   private boolean n890TBW14_SDT_SAVE ;
   private String A890TBW14_SDT_SAVE ;
   private String AV9P_SESSION_ID ;
   private String AV12W_RTN_CD ;
   private String AV11W_MSG ;
   private String AV13W_TBW01_DISP_DATETIME ;
   private String A193TBW14_DISP_DATETIME ;
   private String A192TBW14_SESSION_ID ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private short[] P005I2_A197TBW14_CRF_LATEST_VERSION ;
   private byte[] P005I2_A940TBW14_CRF_EDA_NO ;
   private short[] P005I2_A196TBW14_CRF_ID ;
   private int[] P005I2_A195TBW14_SUBJECT_ID ;
   private long[] P005I2_A194TBW14_STUDY_ID ;
   private String[] P005I2_A193TBW14_DISP_DATETIME ;
   private String[] P005I2_A192TBW14_SESSION_ID ;
   private String[] P005I2_A890TBW14_SDT_SAVE ;
   private boolean[] P005I2_n890TBW14_SDT_SAVE ;
   private SdtB792_SD01_CRF AV10SD_B792_SD01_CRF ;
}

final  class b799_pc07_sdt_work_reg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P005I2", "SELECT `TBW14_CRF_LATEST_VERSION`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_ID`, `TBW14_SUBJECT_ID`, `TBW14_STUDY_ID`, `TBW14_DISP_DATETIME`, `TBW14_SESSION_ID`, `TBW14_SDT_SAVE` FROM `TBW14_CRF_SDT_WORK` WHERE `TBW14_SESSION_ID` = ? and `TBW14_DISP_DATETIME` = ? and `TBW14_STUDY_ID` = ? and `TBW14_SUBJECT_ID` = ? and `TBW14_CRF_ID` = ? and `TBW14_CRF_EDA_NO` = ? and `TBW14_CRF_LATEST_VERSION` = ? ORDER BY `TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`  LIMIT 1 FOR UPDATE ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new UpdateCursor("P005I3", "UPDATE `TBW14_CRF_SDT_WORK` SET `TBW14_SDT_SAVE`=?  WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005I4", "UPDATE `TBW14_CRF_SDT_WORK` SET `TBW14_SDT_SAVE`=?  WHERE `TBW14_SESSION_ID` = ? AND `TBW14_DISP_DATETIME` = ? AND `TBW14_STUDY_ID` = ? AND `TBW14_SUBJECT_ID` = ? AND `TBW14_CRF_ID` = ? AND `TBW14_CRF_EDA_NO` = ? AND `TBW14_CRF_LATEST_VERSION` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P005I5", "INSERT INTO `TBW14_CRF_SDT_WORK`(`TBW14_SESSION_ID`, `TBW14_DISP_DATETIME`, `TBW14_STUDY_ID`, `TBW14_SUBJECT_ID`, `TBW14_CRF_ID`, `TBW14_CRF_EDA_NO`, `TBW14_CRF_LATEST_VERSION`, `TBW14_SDT_SAVE`) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((long[]) buf[4])[0] = rslt.getLong(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getLongVarchar(8) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
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
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setVarchar(2, (String)parms[1], 14);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               stmt.setVarchar(3, (String)parms[3], 14, false);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               stmt.setVarchar(3, (String)parms[3], 14, false);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setByte(7, ((Number) parms[7]).byteValue());
               stmt.setShort(8, ((Number) parms[8]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 14, false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setNLongVarchar(8, (String)parms[8]);
               }
               return;
      }
   }

}

