/*
               File: B716_PC01_CSV_OUTPUT
        Description: CSV出力処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:15.81
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b716_pc01_csv_output extends GXProcedure
{
   public b716_pc01_csv_output( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b716_pc01_csv_output.class ), "" );
   }

   public b716_pc01_csv_output( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             GxObjectCollection aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 )
   {
      b716_pc01_csv_output.this.AV20P_STUDY_ID = aP0;
      b716_pc01_csv_output.this.AV18P_B716_SD1_CRF_INFO = aP1;
      b716_pc01_csv_output.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( long aP0 ,
                        GxObjectCollection aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( long aP0 ,
                             GxObjectCollection aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b716_pc01_csv_output.this.AV20P_STUDY_ID = aP0;
      b716_pc01_csv_output.this.AV18P_B716_SD1_CRF_INFO = aP1;
      b716_pc01_csv_output.this.aP2 = aP2;
      b716_pc01_csv_output.this.aP3 = aP3;
      b716_pc01_csv_output.this.aP4 = aP4;
      b716_pc01_csv_output.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B716" ;
      AV29W_ERR_CD = (short)(0) ;
      AV30W_ERR_MSG = "" ;
      AV40W_SESSION_ID = "" ;
      AV26W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_EXTRA_INFO = (SdtB808_SD01_EXTRA_INFO)new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV32W_EXTRA_INFO.setgxTv_SdtB808_SD01_EXTRA_INFO_App_id( AV8C_TAM02_APP_ID );
      AV42W_ZIP_FILE_PATH = "" ;
      AV43W_ZIP_FILENAME = "" ;
      AV40W_SESSION_ID = AV21SESSION.getId() ;
      AV26W_DATETIME = GXutil.now( ) ;
      /* Execute user subroutine: S17358 */
      S17358 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S1191 */
         S1191 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S12109 */
         S12109 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Using cursor P00662 */
         pr_default.execute(0, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME, new Short(AV29W_ERR_CD)});
         AV40W_SESSION_ID = P00662_AV40W_SESSION_ID[0] ;
         AV26W_DATETIME = P00662_AV26W_DATETIME[0] ;
         AV29W_ERR_CD = P00662_AV29W_ERR_CD[0] ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00051", "ストアドプロシージャの", GXutil.str( AV29W_ERR_CD, 4, 0), "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            AV29W_ERR_CD = (short)(1) ;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S13155 */
         S13155 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S14202 */
         S14202 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S15300 */
         S15300 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      if ( AV29W_ERR_CD == 0 )
      {
         /* Execute user subroutine: S16327 */
         S16327 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
      }
      /* Execute user subroutine: S19392 */
      S19392 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S1191( )
   {
      /* 'SUB_SET_PARM' Routine */
      AV47GXV1 = 1 ;
      while ( AV47GXV1 <= AV18P_B716_SD1_CRF_INFO.size() )
      {
         AV23W_B716_SD1_CRF_INFO_Item = (SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)((SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem)AV18P_B716_SD1_CRF_INFO.elementAt(-1+AV47GXV1));
         /*
            INSERT RECORD ON TABLE TBW11_COND_WORK

         */
         A741TBW11_SESSION_ID = AV40W_SESSION_ID ;
         A742TBW11_DATETIME = AV26W_DATETIME ;
         A743TBW11_STUDY_ID = AV20P_STUDY_ID ;
         A744TBW11_SUBJECT_ID = AV23W_B716_SD1_CRF_INFO_Item.getgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_subject_id() ;
         A745TBW11_CRF_ID = AV23W_B716_SD1_CRF_INFO_Item.getgxTv_SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem_Tbt02_crf_id() ;
         /* Using cursor P00663 */
         pr_default.execute(1, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
         if ( (pr_default.getStatus(1) == 1) )
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
         AV47GXV1 = (int)(AV47GXV1+1) ;
      }
   }

   public void S12109( )
   {
      /* 'SUB_ERR_CHK_CSV' Routine */
   }

   public void S13155( )
   {
      /* 'SUB_INIT_CSV_CONF' Routine */
      GXt_char1 = AV38W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "007", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV38W_OUTPUT_PATH = GXt_char1 ;
      if ( GXutil.strcmp(GXutil.substring( AV38W_OUTPUT_PATH, GXutil.len( AV38W_OUTPUT_PATH), 1), AV33W_FILE.getSeparator()) != 0 )
      {
         AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + AV33W_FILE.getSeparator() ;
      }
      /* Using cursor P00664 */
      pr_default.execute(2, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A814TBW13_DATETIME = P00664_A814TBW13_DATETIME[0] ;
         A813TBW13_SESSION_ID = P00664_A813TBW13_SESSION_ID[0] ;
         A815TBW13_STUDY_ID = P00664_A815TBW13_STUDY_ID[0] ;
         A816TBW13_SUBJECT_ID = P00664_A816TBW13_SUBJECT_ID[0] ;
         A817TBW13_VISIT_NO = P00664_A817TBW13_VISIT_NO[0] ;
         A818TBW13_DOM_CD = P00664_A818TBW13_DOM_CD[0] ;
         A819TBW13_DOM_ITM_GRP_OID = P00664_A819TBW13_DOM_ITM_GRP_OID[0] ;
         A820TBW13_DOM_ITM_GRP_ROWNO = P00664_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + GXutil.trim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)) + "_" ;
         AV43W_ZIP_FILENAME = GXutil.trim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)) + "_" ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      GXt_char1 = AV38W_OUTPUT_PATH ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + GXt_char1 ;
      GXt_char1 = AV43W_ZIP_FILENAME ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( GXutil.now( ), "YYYYMMDDHHMISS", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV43W_ZIP_FILENAME = AV43W_ZIP_FILENAME + GXt_char1 + ".zip" ;
      AV27W_DIR.setSource( AV38W_OUTPUT_PATH );
      if ( ! AV27W_DIR.exists() )
      {
         AV27W_DIR.create();
      }
      AV44W_ZIP_PATH = AV38W_OUTPUT_PATH ;
      AV38W_OUTPUT_PATH = AV38W_OUTPUT_PATH + AV33W_FILE.getSeparator() ;
      GXt_char1 = AV25W_CSV_SEP ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "019", GXv_char2) ;
      b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
      AV25W_CSV_SEP = GXt_char1 ;
      if ( (GXutil.strcmp("", AV25W_CSV_SEP)==0) )
      {
         AV25W_CSV_SEP = "," ;
      }
      AV24W_CHAR_SET = "UTF8" ;
   }

   public void S14202( )
   {
      /* 'SUB_OUT_CSV' Routine */
      /* Using cursor P00665 */
      pr_default.execute(3, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      while ( (pr_default.getStatus(3) != 101) )
      {
         brk664 = false ;
         A821TBW13_VALUE = P00665_A821TBW13_VALUE[0] ;
         n821TBW13_VALUE = P00665_n821TBW13_VALUE[0] ;
         A820TBW13_DOM_ITM_GRP_ROWNO = P00665_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         A819TBW13_DOM_ITM_GRP_OID = P00665_A819TBW13_DOM_ITM_GRP_OID[0] ;
         A817TBW13_VISIT_NO = P00665_A817TBW13_VISIT_NO[0] ;
         A816TBW13_SUBJECT_ID = P00665_A816TBW13_SUBJECT_ID[0] ;
         A815TBW13_STUDY_ID = P00665_A815TBW13_STUDY_ID[0] ;
         A818TBW13_DOM_CD = P00665_A818TBW13_DOM_CD[0] ;
         A814TBW13_DATETIME = P00665_A814TBW13_DATETIME[0] ;
         A813TBW13_SESSION_ID = P00665_A813TBW13_SESSION_ID[0] ;
         if ( AV29W_ERR_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV34W_FILE_PATH = AV38W_OUTPUT_PATH + A818TBW13_DOM_CD + ".csv" ;
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwopen( AV34W_FILE_PATH, "", "", (byte)(0), AV24W_CHAR_SET) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00003", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         /* User Code */
          try {
         /* User Code */
          byte [] bb={ (byte)0xEF, (byte)0xBB, (byte)0xBF};
         /* User Code */
          AV41W_TEST=new String(bb,"UTF-8");
         /* User Code */
          } catch (java.io.UnsupportedEncodingException e) {
         /* User Code */
          }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV41W_TEST, (short)(GXutil.byteCount( AV41W_TEST, AV24W_CHAR_SET))) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV36W_HEADER_INIT = true ;
         /* Using cursor P00666 */
         pr_default.execute(4, new Object[] {A818TBW13_DOM_CD, new Long(AV20P_STUDY_ID)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A895TBM43_DOM_CD = P00666_A895TBM43_DOM_CD[0] ;
            A894TBM43_STUDY_ID = P00666_A894TBM43_STUDY_ID[0] ;
            A906TBM43_DEL_FLG = P00666_A906TBM43_DEL_FLG[0] ;
            n906TBM43_DEL_FLG = P00666_n906TBM43_DEL_FLG[0] ;
            A896TBM43_DOM_VAR_NM = P00666_A896TBM43_DOM_VAR_NM[0] ;
            A905TBM43_ORDER = P00666_A905TBM43_ORDER[0] ;
            n905TBM43_ORDER = P00666_n905TBM43_ORDER[0] ;
            if ( AV29W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            if ( AV36W_HEADER_INIT )
            {
               AV36W_HEADER_INIT = false ;
               AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( A896TBM43_DOM_VAR_NM, (short)(GXutil.byteCount( A896TBM43_DOM_VAR_NM, AV24W_CHAR_SET))) ;
            }
            else
            {
               AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( AV25W_CSV_SEP+A896TBM43_DOM_VAR_NM, (short)(GXutil.byteCount( AV25W_CSV_SEP, AV24W_CHAR_SET)+GXutil.byteCount( A896TBM43_DOM_VAR_NM, AV24W_CHAR_SET))) ;
            }
            if ( AV29W_ERR_CD != 0 )
            {
               GXt_char1 = AV30W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
               b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
               AV30W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            pr_default.readNext(4);
         }
         pr_default.close(4);
         if ( AV29W_ERR_CD != 0 )
         {
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         while ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(P00665_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) )
         {
            brk664 = false ;
            A821TBW13_VALUE = P00665_A821TBW13_VALUE[0] ;
            n821TBW13_VALUE = P00665_n821TBW13_VALUE[0] ;
            A820TBW13_DOM_ITM_GRP_ROWNO = P00665_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
            A819TBW13_DOM_ITM_GRP_OID = P00665_A819TBW13_DOM_ITM_GRP_OID[0] ;
            A817TBW13_VISIT_NO = P00665_A817TBW13_VISIT_NO[0] ;
            A816TBW13_SUBJECT_ID = P00665_A816TBW13_SUBJECT_ID[0] ;
            A815TBW13_STUDY_ID = P00665_A815TBW13_STUDY_ID[0] ;
            A814TBW13_DATETIME = P00665_A814TBW13_DATETIME[0] ;
            A813TBW13_SESSION_ID = P00665_A813TBW13_SESSION_ID[0] ;
            if ( AV29W_ERR_CD != 0 )
            {
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwptxt( A821TBW13_VALUE, (short)(GXutil.byteCount( A821TBW13_VALUE, AV24W_CHAR_SET))) ;
            AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwnext( ) ;
            if ( AV29W_ERR_CD != 0 )
            {
               GXt_char1 = AV30W_ERR_MSG ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
               b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
               AV30W_ERR_MSG = GXt_char1 ;
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
            }
            brk664 = true ;
            pr_default.readNext(3);
         }
         AV29W_ERR_CD = context.getSessionInstances().getDelimitedFiles().dfwclose( ) ;
         if ( AV29W_ERR_CD != 0 )
         {
            GXt_char1 = AV30W_ERR_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AX00004", "", "", "", "", "", GXv_char2) ;
            b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
            AV30W_ERR_MSG = GXt_char1 ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
         }
         if ( ! brk664 )
         {
            brk664 = true ;
            pr_default.readNext(3);
         }
      }
      pr_default.close(3);
   }

   public void S15300( )
   {
      /* 'SUB_ZIP' Routine */
      AV27W_DIR.setSource( AV44W_ZIP_PATH );
      AV53GXV3 = 1 ;
      AV52GXV2 = (com.genexus.util.GXFileCollection)AV27W_DIR.getFiles("");
      while ( AV53GXV3 <= AV52GXV2.getItemCount() )
      {
         AV33W_FILE = (com.genexus.util.GXFile)AV52GXV2.item((short)(AV53GXV3));
         AV35W_FILES.add(AV33W_FILE.getAbsoluteName(), 0);
         AV53GXV3 = (int)(AV53GXV3+1) ;
      }
      if ( AV35W_FILES.size() > 0 )
      {
         GXt_char1 = AV42W_ZIP_FILE_PATH ;
         GXv_char2[0] = GXt_char1 ;
         new a801_pc02_sys_config_get(remoteHandle, context).execute( AV22W_A_LOGIN_SDT, "", "CSV_DOWNLOAD_PATH", GXv_char2) ;
         b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
         AV42W_ZIP_FILE_PATH = GXt_char1 ;
         AV34W_FILE_PATH = AV42W_ZIP_FILE_PATH + AV43W_ZIP_FILENAME ;
         new SdtGXzip(remoteHandle, context).compress(AV35W_FILES, AV34W_FILE_PATH, 9) ;
      }
      else
      {
         GXt_char1 = AV30W_ERR_MSG ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00004", "", "", "", "", "", GXv_char2) ;
         b716_pc01_csv_output.this.GXt_char1 = GXv_char2[0] ;
         AV30W_ERR_MSG = GXt_char1 ;
         AV29W_ERR_CD = (short)(1) ;
      }
   }

   public void S16327( )
   {
      /* 'SUB_DEL_WORK' Routine */
      /* Optimized DELETE. */
      /* Using cursor P00667 */
      pr_default.execute(5, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00668 */
      pr_default.execute(6, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      /* End optimized DELETE. */
      /* Optimized DELETE. */
      /* Using cursor P00669 */
      pr_default.execute(7, new Object[] {AV40W_SESSION_ID, AV26W_DATETIME});
      /* End optimized DELETE. */
   }

   public void S17358( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
      GXv_SdtA_LOGIN_SDT3[0] = AV22W_A_LOGIN_SDT;
      GXv_char2[0] = AV31W_ERRCD ;
      new a401_pc01_login_check(remoteHandle, context).execute( GXv_SdtA_LOGIN_SDT3, GXv_char2) ;
      AV22W_A_LOGIN_SDT = GXv_SdtA_LOGIN_SDT3[0] ;
      b716_pc01_csv_output.this.AV31W_ERRCD = GXv_char2[0] ;
      if ( GXutil.strcmp(AV31W_ERRCD, "0") != 0 )
      {
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("1")) ;
         httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         AV29W_ERR_CD = (short)(1) ;
      }
   }

   public void S18377( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV57Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      returnInSub = true;
      if (true) return;
   }

   public void S19392( )
   {
      /* 'SUB_TERMINATE' Routine */
      if ( AV29W_ERR_CD == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "b716_pc01_csv_output");
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "b716_pc01_csv_output");
         GXv_SdtB808_SD01_EXTRA_INFO4[0] = AV32W_EXTRA_INFO;
         GXv_int5[0] = AV29W_ERR_CD ;
         GXv_char2[0] = AV30W_ERR_MSG ;
         new b808_pc01_dbg_log(remoteHandle, context).execute( AV57Pgmname, (short)(1), AV37W_MSG, GXv_SdtB808_SD01_EXTRA_INFO4, GXv_int5, GXv_char2) ;
         AV32W_EXTRA_INFO = GXv_SdtB808_SD01_EXTRA_INFO4[0] ;
         b716_pc01_csv_output.this.AV29W_ERR_CD = GXv_int5[0] ;
         b716_pc01_csv_output.this.AV30W_ERR_MSG = GXv_char2[0] ;
      }
   }

   protected void cleanup( )
   {
      this.aP2[0] = b716_pc01_csv_output.this.AV42W_ZIP_FILE_PATH;
      this.aP3[0] = b716_pc01_csv_output.this.AV43W_ZIP_FILENAME;
      this.aP4[0] = b716_pc01_csv_output.this.AV29W_ERR_CD;
      this.aP5[0] = b716_pc01_csv_output.this.AV30W_ERR_MSG;
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
                  /* Execute user subroutine: S18377 */
                  S18377 ();
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
      AV42W_ZIP_FILE_PATH = "" ;
      AV43W_ZIP_FILENAME = "" ;
      AV30W_ERR_MSG = "" ;
      AV8C_TAM02_APP_ID = "" ;
      AV40W_SESSION_ID = "" ;
      AV26W_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      AV32W_EXTRA_INFO = new SdtB808_SD01_EXTRA_INFO(remoteHandle, context);
      AV21SESSION = httpContext.getWebSession();
      P00662_AV40W_SESSION_ID = new String[] {""} ;
      P00662_AV26W_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00662_AV29W_ERR_CD = new short[1] ;
      AV23W_B716_SD1_CRF_INFO_Item = new SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem(remoteHandle, context);
      A741TBW11_SESSION_ID = "" ;
      A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Gx_emsg = "" ;
      AV38W_OUTPUT_PATH = "" ;
      AV33W_FILE = new com.genexus.util.GXFile();
      scmdbuf = "" ;
      P00664_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00664_A813TBW13_SESSION_ID = new String[] {""} ;
      P00664_A815TBW13_STUDY_ID = new long[1] ;
      P00664_A816TBW13_SUBJECT_ID = new int[1] ;
      P00664_A817TBW13_VISIT_NO = new short[1] ;
      P00664_A818TBW13_DOM_CD = new String[] {""} ;
      P00664_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P00664_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      A814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A813TBW13_SESSION_ID = "" ;
      A818TBW13_DOM_CD = "" ;
      A819TBW13_DOM_ITM_GRP_OID = "" ;
      AV27W_DIR = new com.genexus.util.GXDirectory();
      AV44W_ZIP_PATH = "" ;
      AV25W_CSV_SEP = "" ;
      AV24W_CHAR_SET = "" ;
      P00665_A821TBW13_VALUE = new String[] {""} ;
      P00665_n821TBW13_VALUE = new boolean[] {false} ;
      P00665_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      P00665_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      P00665_A817TBW13_VISIT_NO = new short[1] ;
      P00665_A816TBW13_SUBJECT_ID = new int[1] ;
      P00665_A815TBW13_STUDY_ID = new long[1] ;
      P00665_A818TBW13_DOM_CD = new String[] {""} ;
      P00665_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      P00665_A813TBW13_SESSION_ID = new String[] {""} ;
      A821TBW13_VALUE = "" ;
      AV34W_FILE_PATH = "" ;
      AV41W_TEST = "" ;
      P00666_A895TBM43_DOM_CD = new String[] {""} ;
      P00666_A894TBM43_STUDY_ID = new long[1] ;
      P00666_A906TBM43_DEL_FLG = new String[] {""} ;
      P00666_n906TBM43_DEL_FLG = new boolean[] {false} ;
      P00666_A896TBM43_DOM_VAR_NM = new String[] {""} ;
      P00666_A905TBM43_ORDER = new int[1] ;
      P00666_n905TBM43_ORDER = new boolean[] {false} ;
      A895TBM43_DOM_CD = "" ;
      A906TBM43_DEL_FLG = "" ;
      A896TBM43_DOM_VAR_NM = "" ;
      AV52GXV2 = new com.genexus.util.GXFileCollection();
      AV35W_FILES = new GxObjectCollection(String.class, "internal", "");
      AV22W_A_LOGIN_SDT = new SdtA_LOGIN_SDT(remoteHandle, context);
      GXv_SdtA_LOGIN_SDT3 = new SdtA_LOGIN_SDT [1] ;
      AV31W_ERRCD = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      AV57Pgmname = "" ;
      GXt_char1 = "" ;
      AV37W_MSG = "" ;
      GXv_SdtB808_SD01_EXTRA_INFO4 = new SdtB808_SD01_EXTRA_INFO [1] ;
      GXv_int5 = new short [1] ;
      GXv_char2 = new String [1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b716_pc01_csv_output__default(),
         new Object[] {
             new Object[] {
            P00662_AV40W_SESSION_ID, P00662_AV26W_DATETIME, P00662_AV29W_ERR_CD
            }
            , new Object[] {
            }
            , new Object[] {
            P00664_A814TBW13_DATETIME, P00664_A813TBW13_SESSION_ID, P00664_A815TBW13_STUDY_ID, P00664_A816TBW13_SUBJECT_ID, P00664_A817TBW13_VISIT_NO, P00664_A818TBW13_DOM_CD, P00664_A819TBW13_DOM_ITM_GRP_OID, P00664_A820TBW13_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            P00665_A821TBW13_VALUE, P00665_n821TBW13_VALUE, P00665_A820TBW13_DOM_ITM_GRP_ROWNO, P00665_A819TBW13_DOM_ITM_GRP_OID, P00665_A817TBW13_VISIT_NO, P00665_A816TBW13_SUBJECT_ID, P00665_A815TBW13_STUDY_ID, P00665_A818TBW13_DOM_CD, P00665_A814TBW13_DATETIME, P00665_A813TBW13_SESSION_ID
            }
            , new Object[] {
            P00666_A895TBM43_DOM_CD, P00666_A894TBM43_STUDY_ID, P00666_A906TBM43_DEL_FLG, P00666_n906TBM43_DEL_FLG, P00666_A896TBM43_DOM_VAR_NM, P00666_A905TBM43_ORDER, P00666_n905TBM43_ORDER
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
      AV57Pgmname = "B716_PC01_CSV_OUTPUT" ;
      /* GeneXus formulas. */
      AV57Pgmname = "B716_PC01_CSV_OUTPUT" ;
      Gx_err = (short)(0) ;
   }

   private short AV29W_ERR_CD ;
   private short A745TBW11_CRF_ID ;
   private short Gx_err ;
   private short A817TBW13_VISIT_NO ;
   private short A820TBW13_DOM_ITM_GRP_ROWNO ;
   private short GXv_int5[] ;
   private int AV47GXV1 ;
   private int GX_INS47 ;
   private int A744TBW11_SUBJECT_ID ;
   private int A816TBW13_SUBJECT_ID ;
   private int A905TBM43_ORDER ;
   private int AV53GXV3 ;
   private int GXActiveErrHndl ;
   private long AV20P_STUDY_ID ;
   private long A743TBW11_STUDY_ID ;
   private long A815TBW13_STUDY_ID ;
   private long A894TBM43_STUDY_ID ;
   private String Gx_emsg ;
   private String scmdbuf ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String AV57Pgmname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV26W_DATETIME ;
   private java.util.Date A742TBW11_DATETIME ;
   private java.util.Date A814TBW13_DATETIME ;
   private boolean returnInSub ;
   private boolean brk664 ;
   private boolean n821TBW13_VALUE ;
   private boolean AV36W_HEADER_INIT ;
   private boolean n906TBM43_DEL_FLG ;
   private boolean n905TBM43_ORDER ;
   private String A821TBW13_VALUE ;
   private String AV42W_ZIP_FILE_PATH ;
   private String AV43W_ZIP_FILENAME ;
   private String AV30W_ERR_MSG ;
   private String AV8C_TAM02_APP_ID ;
   private String AV40W_SESSION_ID ;
   private String A741TBW11_SESSION_ID ;
   private String AV38W_OUTPUT_PATH ;
   private String A813TBW13_SESSION_ID ;
   private String A818TBW13_DOM_CD ;
   private String A819TBW13_DOM_ITM_GRP_OID ;
   private String AV44W_ZIP_PATH ;
   private String AV25W_CSV_SEP ;
   private String AV24W_CHAR_SET ;
   private String AV34W_FILE_PATH ;
   private String AV41W_TEST ;
   private String A895TBM43_DOM_CD ;
   private String A906TBM43_DEL_FLG ;
   private String A896TBM43_DOM_VAR_NM ;
   private String AV31W_ERRCD ;
   private String AV37W_MSG ;
   private com.genexus.webpanels.WebSession AV21SESSION ;
   private com.genexus.util.GXFile AV33W_FILE ;
   private com.genexus.util.GXDirectory AV27W_DIR ;
   private String[] aP2 ;
   private String[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P00662_AV40W_SESSION_ID ;
   private java.util.Date[] P00662_AV26W_DATETIME ;
   private short[] P00662_AV29W_ERR_CD ;
   private java.util.Date[] P00664_A814TBW13_DATETIME ;
   private String[] P00664_A813TBW13_SESSION_ID ;
   private long[] P00664_A815TBW13_STUDY_ID ;
   private int[] P00664_A816TBW13_SUBJECT_ID ;
   private short[] P00664_A817TBW13_VISIT_NO ;
   private String[] P00664_A818TBW13_DOM_CD ;
   private String[] P00664_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] P00664_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] P00665_A821TBW13_VALUE ;
   private boolean[] P00665_n821TBW13_VALUE ;
   private short[] P00665_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] P00665_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] P00665_A817TBW13_VISIT_NO ;
   private int[] P00665_A816TBW13_SUBJECT_ID ;
   private long[] P00665_A815TBW13_STUDY_ID ;
   private String[] P00665_A818TBW13_DOM_CD ;
   private java.util.Date[] P00665_A814TBW13_DATETIME ;
   private String[] P00665_A813TBW13_SESSION_ID ;
   private String[] P00666_A895TBM43_DOM_CD ;
   private long[] P00666_A894TBM43_STUDY_ID ;
   private String[] P00666_A906TBM43_DEL_FLG ;
   private boolean[] P00666_n906TBM43_DEL_FLG ;
   private String[] P00666_A896TBM43_DOM_VAR_NM ;
   private int[] P00666_A905TBM43_ORDER ;
   private boolean[] P00666_n905TBM43_ORDER ;
   private com.genexus.util.GXFileCollection AV52GXV2 ;
   private GxObjectCollection AV18P_B716_SD1_CRF_INFO ;
   private GxObjectCollection AV35W_FILES ;
   private SdtB716_SD1_CRF_INFO_B716_SD1_CRF_INFOItem AV23W_B716_SD1_CRF_INFO_Item ;
   private SdtA_LOGIN_SDT AV22W_A_LOGIN_SDT ;
   private SdtA_LOGIN_SDT GXv_SdtA_LOGIN_SDT3[] ;
   private SdtB808_SD01_EXTRA_INFO AV32W_EXTRA_INFO ;
   private SdtB808_SD01_EXTRA_INFO GXv_SdtB808_SD01_EXTRA_INFO4[] ;
}

final  class b716_pc01_csv_output__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new CallCursor("P00662", "CALL PROC_MASTER_CSV ( ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK,0)
         ,new UpdateCursor("P00663", "INSERT INTO `TBW11_COND_WORK` (`TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID`) VALUES (?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new ForEachCursor("P00664", "SELECT `TBW13_DATETIME`, `TBW13_SESSION_ID`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ? ORDER BY `TBW13_SESSION_ID`, `TBW13_DATETIME`  LIMIT 1",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
         ,new ForEachCursor("P00665", "SELECT `TBW13_VALUE`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_VISIT_NO`, `TBW13_SUBJECT_ID`, `TBW13_STUDY_ID`, `TBW13_DOM_CD`, `TBW13_DATETIME`, `TBW13_SESSION_ID` FROM `TBW13_CSV_RECORD` WHERE (`TBW13_SESSION_ID` = ?) AND (`TBW13_DATETIME` = ?) ORDER BY `TBW13_DOM_CD`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new ForEachCursor("P00666", "SELECT `TBM43_DOM_CD`, `TBM43_STUDY_ID`, `TBM43_DEL_FLG`, `TBM43_DOM_VAR_NM`, `TBM43_ORDER` FROM `TBM43_STUDY_CDISC_ITEM` WHERE (`TBM43_DOM_CD` = ?) AND (`TBM43_STUDY_ID` = ?) AND (`TBM43_DEL_FLG` = '0') ORDER BY `TBM43_ORDER` ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,10,0,false )
         ,new UpdateCursor("P00667", "DELETE FROM `TBW10_CSV_WORK`  WHERE `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00668", "DELETE FROM `TBW11_COND_WORK`  WHERE `TBW11_SESSION_ID` = ? and `TBW11_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
         ,new UpdateCursor("P00669", "DELETE FROM `TBW13_CSV_RECORD`  WHERE `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` = ?", GX_NOMASK + GX_MASKLOOPLOCK)
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((short[]) buf[4])[0] = rslt.getShort(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((long[]) buf[6])[0] = rslt.getLong(6) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(7) ;
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(8) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(9) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((long[]) buf[1])[0] = rslt.getLong(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((int[]) buf[5])[0] = rslt.getInt(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               break;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 1 , Types.VARCHAR );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 2 , Types.TIMESTAMP );
               ((com.genexus.db.driver.GXCallableStatement) stmt).registerOutParameter( 3 , Types.NUMERIC, 0 );
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               break;
      }
   }

}

