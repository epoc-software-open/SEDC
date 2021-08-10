/*
               File: B720_PC13_GET_CRF_VALUE_HIS
        Description: CRF“ü—Í’lŽæ“¾_—š—ð—p
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:20.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc13_get_crf_value_his extends GXProcedure
{
   public b720_pc13_get_crf_value_his( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc13_get_crf_value_his.class ), "" );
   }

   public b720_pc13_get_crf_value_his( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             long aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             int aP4 ,
                             GxObjectCollection[] aP5 ,
                             short[] aP6 )
   {
      b720_pc13_get_crf_value_his.this.AV18P_CRF_VERSION = aP0;
      b720_pc13_get_crf_value_his.this.AV12P_STUDY_ID = aP1;
      b720_pc13_get_crf_value_his.this.AV11P_CRF_ID = aP2;
      b720_pc13_get_crf_value_his.this.AV10P_CRF_EDA_NO = aP3;
      b720_pc13_get_crf_value_his.this.AV13P_SUBJECT_ID = aP4;
      b720_pc13_get_crf_value_his.this.AV8B720_SD01_DESIGN_C = aP5[0];
      this.aP5 = aP5;
      b720_pc13_get_crf_value_his.this.aP6 = aP6;
      b720_pc13_get_crf_value_his.this.aP7 = aP7;
      b720_pc13_get_crf_value_his.this.aP7 = new String[] {""};
      initialize();
      privateExecute();
      return aP7[0];
   }

   public void execute( short aP0 ,
                        long aP1 ,
                        short aP2 ,
                        byte aP3 ,
                        int aP4 ,
                        GxObjectCollection[] aP5 ,
                        short[] aP6 ,
                        String[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( short aP0 ,
                             long aP1 ,
                             short aP2 ,
                             byte aP3 ,
                             int aP4 ,
                             GxObjectCollection[] aP5 ,
                             short[] aP6 ,
                             String[] aP7 )
   {
      b720_pc13_get_crf_value_his.this.AV18P_CRF_VERSION = aP0;
      b720_pc13_get_crf_value_his.this.AV12P_STUDY_ID = aP1;
      b720_pc13_get_crf_value_his.this.AV11P_CRF_ID = aP2;
      b720_pc13_get_crf_value_his.this.AV10P_CRF_EDA_NO = aP3;
      b720_pc13_get_crf_value_his.this.AV13P_SUBJECT_ID = aP4;
      b720_pc13_get_crf_value_his.this.AV8B720_SD01_DESIGN_C = aP5[0];
      this.aP5 = aP5;
      b720_pc13_get_crf_value_his.this.aP6 = aP6;
      b720_pc13_get_crf_value_his.this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Execute user subroutine: S131 */
      S131 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV20W_ERR_FLG = "0" ;
      AV21W_ERR_MSG = "" ;
      AV33GXV1 = 1 ;
      while ( AV33GXV1 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV33GXV1));
         if ( ((GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "TextArea")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "NumericTextBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox")==0)) || ! (GXutil.strcmp("", AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd())==0) )
         {
            if ( ((GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox")==0)) )
            {
               AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg( "0" );
            }
            else
            {
               AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( "" );
            }
         }
         AV33GXV1 = (int)(AV33GXV1+1) ;
      }
      /* Execute user subroutine: S111 */
      S111 ();
      if ( returnInSub )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      /* Execute user subroutine: S121 */
      S121 ();
      if ( returnInSub )
      {
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_GET_CRF_VALUE' Routine */
      AV34GXV2 = 1 ;
      while ( AV34GXV2 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV34GXV2));
         if ( ((GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "TextArea")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "NumericTextBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox")==0)) )
         {
            pr_default.dynParam(0, new Object[]{ new Object[]{
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div() ,
                                                 A106TBT13_CRF_ITEM_GRP_CD ,
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd() ,
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd() ,
                                                 A597TBT13_CRF_VALUE ,
                                                 A598TBT13_DEL_FLG ,
                                                 new Long(AV12P_STUDY_ID) ,
                                                 new Integer(AV13P_SUBJECT_ID) ,
                                                 new Short(AV11P_CRF_ID) ,
                                                 new Byte(AV10P_CRF_EDA_NO) ,
                                                 new Short(AV18P_CRF_VERSION) ,
                                                 new Long(A101TBT13_STUDY_ID) ,
                                                 new Integer(A102TBT13_SUBJECT_ID) ,
                                                 new Short(A103TBT13_CRF_ID) ,
                                                 new Byte(A938TBT13_CRF_EDA_NO) ,
                                                 new Short(A104TBT13_CRF_VERSION) },
                                                 new int[] {
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.INT,
                                                 TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.SHORT
                                                 }
            });
            /* Using cursor P007L2 */
            pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV10P_CRF_EDA_NO), new Short(AV18P_CRF_VERSION), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd(), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A106TBT13_CRF_ITEM_GRP_CD = P007L2_A106TBT13_CRF_ITEM_GRP_CD[0] ;
               A597TBT13_CRF_VALUE = P007L2_A597TBT13_CRF_VALUE[0] ;
               n597TBT13_CRF_VALUE = P007L2_n597TBT13_CRF_VALUE[0] ;
               A598TBT13_DEL_FLG = P007L2_A598TBT13_DEL_FLG[0] ;
               n598TBT13_DEL_FLG = P007L2_n598TBT13_DEL_FLG[0] ;
               A104TBT13_CRF_VERSION = P007L2_A104TBT13_CRF_VERSION[0] ;
               A938TBT13_CRF_EDA_NO = P007L2_A938TBT13_CRF_EDA_NO[0] ;
               A103TBT13_CRF_ID = P007L2_A103TBT13_CRF_ID[0] ;
               A102TBT13_SUBJECT_ID = P007L2_A102TBT13_SUBJECT_ID[0] ;
               A101TBT13_STUDY_ID = P007L2_A101TBT13_STUDY_ID[0] ;
               A105TBT13_CRF_ITEM_GRP_DIV = P007L2_A105TBT13_CRF_ITEM_GRP_DIV[0] ;
               if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox") == 0 )
               {
                  GXv_char1[0] = AV30W_TBM26_LIST_ITEM_NAME ;
                  new b799_pc10_sel_list_item_get(remoteHandle, context).execute( A101TBT13_STUDY_ID, AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd(), A597TBT13_CRF_VALUE, GXv_char1) ;
                  b720_pc13_get_crf_value_his.this.AV30W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
                  AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( AV30W_TBM26_LIST_ITEM_NAME );
               }
               else if ( ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox") == 0 ) )
               {
                  if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value(), A597TBT13_CRF_VALUE) == 0 )
                  {
                     AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg( "1" );
                  }
                  else
                  {
                     AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_ture_flg( "0" );
                  }
               }
               else
               {
                  AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( A597TBT13_CRF_VALUE );
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(0);
            }
            pr_default.close(0);
         }
         AV34GXV2 = (int)(AV34GXV2+1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_GET_REF_VALUE' Routine */
      AV36GXV3 = 1 ;
      while ( AV36GXV3 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV36GXV3));
         if ( ! (GXutil.strcmp("", AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd())==0) )
         {
            GXv_char1[0] = AV17W_CRF_VALUE ;
            new b720_pc14_ref_crf_value_his(remoteHandle, context).execute( AV18P_CRF_VERSION, AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id(), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd(), GXv_char1) ;
            b720_pc13_get_crf_value_his.this.AV17W_CRF_VALUE = GXv_char1[0] ;
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( AV17W_CRF_VALUE );
         }
         AV36GXV3 = (int)(AV36GXV3+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_INIT' Routine */
      GXActiveErrHndl = 1 ;
   }

   public void S141( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV37Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP5[0] = b720_pc13_get_crf_value_his.this.AV8B720_SD01_DESIGN_C;
      this.aP6[0] = b720_pc13_get_crf_value_his.this.AV19W_ERR_CD;
      this.aP7[0] = b720_pc13_get_crf_value_his.this.AV21W_ERR_MSG;
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
                  /* Execute user subroutine: S141 */
                  S141 ();
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
      AV21W_ERR_MSG = "" ;
      AV20W_ERR_FLG = "" ;
      AV9B720_SD01_DESIGN_I = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      scmdbuf = "" ;
      A106TBT13_CRF_ITEM_GRP_CD = "" ;
      A597TBT13_CRF_VALUE = "" ;
      A598TBT13_DEL_FLG = "" ;
      P007L2_A106TBT13_CRF_ITEM_GRP_CD = new String[] {""} ;
      P007L2_A597TBT13_CRF_VALUE = new String[] {""} ;
      P007L2_n597TBT13_CRF_VALUE = new boolean[] {false} ;
      P007L2_A598TBT13_DEL_FLG = new String[] {""} ;
      P007L2_n598TBT13_DEL_FLG = new boolean[] {false} ;
      P007L2_A104TBT13_CRF_VERSION = new short[1] ;
      P007L2_A938TBT13_CRF_EDA_NO = new byte[1] ;
      P007L2_A103TBT13_CRF_ID = new short[1] ;
      P007L2_A102TBT13_SUBJECT_ID = new int[1] ;
      P007L2_A101TBT13_STUDY_ID = new long[1] ;
      P007L2_A105TBT13_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A105TBT13_CRF_ITEM_GRP_DIV = "" ;
      AV30W_TBM26_LIST_ITEM_NAME = "" ;
      AV17W_CRF_VALUE = "" ;
      GXv_char1 = new String [1] ;
      AV37Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc13_get_crf_value_his__default(),
         new Object[] {
             new Object[] {
            P007L2_A106TBT13_CRF_ITEM_GRP_CD, P007L2_A597TBT13_CRF_VALUE, P007L2_n597TBT13_CRF_VALUE, P007L2_A598TBT13_DEL_FLG, P007L2_n598TBT13_DEL_FLG, P007L2_A104TBT13_CRF_VERSION, P007L2_A938TBT13_CRF_EDA_NO, P007L2_A103TBT13_CRF_ID, P007L2_A102TBT13_SUBJECT_ID, P007L2_A101TBT13_STUDY_ID,
            P007L2_A105TBT13_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV37Pgmname = "B720_PC13_GET_CRF_VALUE_HIS" ;
      /* GeneXus formulas. */
      AV37Pgmname = "B720_PC13_GET_CRF_VALUE_HIS" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10P_CRF_EDA_NO ;
   private byte A938TBT13_CRF_EDA_NO ;
   private short AV18P_CRF_VERSION ;
   private short AV11P_CRF_ID ;
   private short AV19W_ERR_CD ;
   private short A103TBT13_CRF_ID ;
   private short A104TBT13_CRF_VERSION ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int AV33GXV1 ;
   private int AV34GXV2 ;
   private int A102TBT13_SUBJECT_ID ;
   private int AV36GXV3 ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A101TBT13_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String AV37Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n597TBT13_CRF_VALUE ;
   private boolean n598TBT13_DEL_FLG ;
   private String AV21W_ERR_MSG ;
   private String AV20W_ERR_FLG ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ;
   private String A106TBT13_CRF_ITEM_GRP_CD ;
   private String A597TBT13_CRF_VALUE ;
   private String A598TBT13_DEL_FLG ;
   private String A105TBT13_CRF_ITEM_GRP_DIV ;
   private String AV30W_TBM26_LIST_ITEM_NAME ;
   private String AV17W_CRF_VALUE ;
   private GxObjectCollection[] aP5 ;
   private short[] aP6 ;
   private String[] aP7 ;
   private IDataStoreProvider pr_default ;
   private String[] P007L2_A106TBT13_CRF_ITEM_GRP_CD ;
   private String[] P007L2_A597TBT13_CRF_VALUE ;
   private boolean[] P007L2_n597TBT13_CRF_VALUE ;
   private String[] P007L2_A598TBT13_DEL_FLG ;
   private boolean[] P007L2_n598TBT13_DEL_FLG ;
   private short[] P007L2_A104TBT13_CRF_VERSION ;
   private byte[] P007L2_A938TBT13_CRF_EDA_NO ;
   private short[] P007L2_A103TBT13_CRF_ID ;
   private int[] P007L2_A102TBT13_SUBJECT_ID ;
   private long[] P007L2_A101TBT13_STUDY_ID ;
   private String[] P007L2_A105TBT13_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV9B720_SD01_DESIGN_I ;
}

final  class b720_pc13_get_crf_value_his__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P007L2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ,
                                          String A106TBT13_CRF_ITEM_GRP_CD ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ,
                                          String A597TBT13_CRF_VALUE ,
                                          String A598TBT13_DEL_FLG ,
                                          long AV12P_STUDY_ID ,
                                          int AV13P_SUBJECT_ID ,
                                          short AV11P_CRF_ID ,
                                          byte AV10P_CRF_EDA_NO ,
                                          short AV18P_CRF_VERSION ,
                                          long A101TBT13_STUDY_ID ,
                                          int A102TBT13_SUBJECT_ID ,
                                          short A103TBT13_CRF_ID ,
                                          byte A938TBT13_CRF_EDA_NO ,
                                          short A104TBT13_CRF_VERSION )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int2 ;
      GXv_int2 = new byte [7] ;
      Object[] GXv_Object3 ;
      GXv_Object3 = new Object [2] ;
      scmdbuf = "SELECT `TBT13_CRF_ITEM_GRP_CD`, `TBT13_CRF_VALUE`, `TBT13_DEL_FLG`, `TBT13_CRF_VERSION`," ;
      scmdbuf = scmdbuf + " `TBT13_CRF_EDA_NO`, `TBT13_CRF_ID`, `TBT13_SUBJECT_ID`, `TBT13_STUDY_ID`, `TBT13_CRF_ITEM_GRP_DIV`" ;
      scmdbuf = scmdbuf + " FROM `TBT13_CRF_RES_HIS`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT13_STUDY_ID` = ? and `TBT13_SUBJECT_ID` = ? and `TBT13_CRF_ID` = ? and `TBT13_CRF_EDA_NO` = ? and `TBT13_CRF_VERSION` = ?)" ;
      scmdbuf = scmdbuf + " and (Not (LENGTH(TRIM(`TBT13_CRF_VALUE`))=0))" ;
      scmdbuf = scmdbuf + " and (`TBT13_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div, "RadioBox") != 0 )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div, "RadioBox") == 0 )
      {
         sWhereString = sWhereString + " and (`TBT13_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int2[6] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT13_STUDY_ID`, `TBT13_SUBJECT_ID`, `TBT13_CRF_ID`, `TBT13_CRF_EDA_NO`, `TBT13_CRF_VERSION`" ;
      GXv_Object3[0] = scmdbuf ;
      GXv_Object3[1] = GXv_int2 ;
      return GXv_Object3 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.internet.HttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_P007L2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).shortValue() , ((Number) dynConstraints[11]).longValue() , ((Number) dynConstraints[12]).intValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).byteValue() , ((Number) dynConstraints[15]).shortValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P007L2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4) ;
               ((byte[]) buf[6])[0] = rslt.getByte(5) ;
               ((short[]) buf[7])[0] = rslt.getShort(6) ;
               ((int[]) buf[8])[0] = rslt.getInt(7) ;
               ((long[]) buf[9])[0] = rslt.getLong(8) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx ;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[7]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[8]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[9]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[10]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[11]).shortValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[12], 50);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 50);
               }
               return;
      }
   }

}

