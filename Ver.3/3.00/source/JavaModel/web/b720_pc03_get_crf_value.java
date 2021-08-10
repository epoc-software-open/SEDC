/*
               File: B720_PC03_GET_CRF_VALUE
        Description: CRF“ü—Í’lŽæ“¾
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:35.40
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b720_pc03_get_crf_value extends GXProcedure
{
   public b720_pc03_get_crf_value( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b720_pc03_get_crf_value.class ), "" );
   }

   public b720_pc03_get_crf_value( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 ,
                             short aP1 ,
                             byte aP2 ,
                             int aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 )
   {
      b720_pc03_get_crf_value.this.AV12P_STUDY_ID = aP0;
      b720_pc03_get_crf_value.this.AV11P_CRF_ID = aP1;
      b720_pc03_get_crf_value.this.AV10P_CRF_EDA_NO = aP2;
      b720_pc03_get_crf_value.this.AV13P_SUBJECT_ID = aP3;
      b720_pc03_get_crf_value.this.AV8B720_SD01_DESIGN_C = aP4[0];
      this.aP4 = aP4;
      b720_pc03_get_crf_value.this.aP5 = aP5;
      b720_pc03_get_crf_value.this.aP6 = aP6;
      b720_pc03_get_crf_value.this.aP6 = new String[] {""};
      initialize();
      privateExecute();
      return aP6[0];
   }

   public void execute( long aP0 ,
                        short aP1 ,
                        byte aP2 ,
                        int aP3 ,
                        GxObjectCollection[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( long aP0 ,
                             short aP1 ,
                             byte aP2 ,
                             int aP3 ,
                             GxObjectCollection[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      b720_pc03_get_crf_value.this.AV12P_STUDY_ID = aP0;
      b720_pc03_get_crf_value.this.AV11P_CRF_ID = aP1;
      b720_pc03_get_crf_value.this.AV10P_CRF_EDA_NO = aP2;
      b720_pc03_get_crf_value.this.AV13P_SUBJECT_ID = aP3;
      b720_pc03_get_crf_value.this.AV8B720_SD01_DESIGN_C = aP4[0];
      this.aP4 = aP4;
      b720_pc03_get_crf_value.this.aP5 = aP5;
      b720_pc03_get_crf_value.this.aP6 = aP6;
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
      AV19W_ERR_FLG = "0" ;
      AV20W_ERR_MSG = "" ;
      AV32GXV1 = 1 ;
      while ( AV32GXV1 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV32GXV1));
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
         AV32GXV1 = (int)(AV32GXV1+1) ;
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
      AV33GXV2 = 1 ;
      while ( AV33GXV2 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV33GXV2));
         if ( ((GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "TextArea")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "NumericTextBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox")==0)||(GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox")==0)) )
         {
            pr_default.dynParam(0, new Object[]{ new Object[]{
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div() ,
                                                 A100TBT12_CRF_ITEM_GRP_CD ,
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd() ,
                                                 AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd() ,
                                                 A465TBT12_CRF_VALUE ,
                                                 A473TBT12_DEL_FLG ,
                                                 new Long(AV12P_STUDY_ID) ,
                                                 new Integer(AV13P_SUBJECT_ID) ,
                                                 new Short(AV11P_CRF_ID) ,
                                                 new Byte(AV10P_CRF_EDA_NO) ,
                                                 new Long(A96TBT12_STUDY_ID) ,
                                                 new Integer(A97TBT12_SUBJECT_ID) ,
                                                 new Short(A98TBT12_CRF_ID) ,
                                                 new Byte(A937TBT12_CRF_EDA_NO) },
                                                 new int[] {
                                                 TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.INT,
                                                 TypeConstants.SHORT, TypeConstants.BYTE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BYTE
                                                 }
            });
            /* Using cursor P00752 */
            pr_default.execute(0, new Object[] {new Long(AV12P_STUDY_ID), new Integer(AV13P_SUBJECT_ID), new Short(AV11P_CRF_ID), new Byte(AV10P_CRF_EDA_NO), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd(), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A100TBT12_CRF_ITEM_GRP_CD = P00752_A100TBT12_CRF_ITEM_GRP_CD[0] ;
               A465TBT12_CRF_VALUE = P00752_A465TBT12_CRF_VALUE[0] ;
               n465TBT12_CRF_VALUE = P00752_n465TBT12_CRF_VALUE[0] ;
               A473TBT12_DEL_FLG = P00752_A473TBT12_DEL_FLG[0] ;
               n473TBT12_DEL_FLG = P00752_n473TBT12_DEL_FLG[0] ;
               A937TBT12_CRF_EDA_NO = P00752_A937TBT12_CRF_EDA_NO[0] ;
               A98TBT12_CRF_ID = P00752_A98TBT12_CRF_ID[0] ;
               A97TBT12_SUBJECT_ID = P00752_A97TBT12_SUBJECT_ID[0] ;
               A96TBT12_STUDY_ID = P00752_A96TBT12_STUDY_ID[0] ;
               A99TBT12_CRF_ITEM_GRP_DIV = P00752_A99TBT12_CRF_ITEM_GRP_DIV[0] ;
               if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "SelectBox") == 0 )
               {
                  GXv_char1[0] = AV29W_TBM26_LIST_ITEM_NAME ;
                  new b799_pc10_sel_list_item_get(remoteHandle, context).execute( A96TBT12_STUDY_ID, AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_List_cd(), A465TBT12_CRF_VALUE, GXv_char1) ;
                  b720_pc03_get_crf_value.this.AV29W_TBM26_LIST_ITEM_NAME = GXv_char1[0] ;
                  AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( AV29W_TBM26_LIST_ITEM_NAME );
               }
               else if ( ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div(), "RadioBox") == 0 ) )
               {
                  if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Chk_true_inner_value(), A465TBT12_CRF_VALUE) == 0 )
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
                  AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( A465TBT12_CRF_VALUE );
               }
               /* Exit For each command. Update data (if necessary), close cursors & exit. */
               if (true) break;
               pr_default.readNext(0);
            }
            pr_default.close(0);
         }
         AV33GXV2 = (int)(AV33GXV2+1) ;
      }
   }

   public void S121( )
   {
      /* 'SUB_GET_REF_VALUE' Routine */
      AV35GXV3 = 1 ;
      while ( AV35GXV3 <= AV8B720_SD01_DESIGN_C.size() )
      {
         AV9B720_SD01_DESIGN_I = (SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)((SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem)AV8B720_SD01_DESIGN_C.elementAt(-1+AV35GXV3));
         if ( ! (GXutil.strcmp("", AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd())==0) )
         {
            GXv_char1[0] = AV17W_CRF_VALUE ;
            new b720_pc04_ref_crf_value(remoteHandle, context).execute( AV12P_STUDY_ID, AV13P_SUBJECT_ID, AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_id(), AV9B720_SD01_DESIGN_I.getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Ref_crf_item_cd(), GXv_char1) ;
            b720_pc03_get_crf_value.this.AV17W_CRF_VALUE = GXv_char1[0] ;
            AV9B720_SD01_DESIGN_I.setgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Text( AV17W_CRF_VALUE );
         }
         AV35GXV3 = (int)(AV35GXV3+1) ;
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
      new a804_pc01_syslog(remoteHandle, context).execute( AV36Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "b790_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("b790_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void cleanup( )
   {
      this.aP4[0] = b720_pc03_get_crf_value.this.AV8B720_SD01_DESIGN_C;
      this.aP5[0] = b720_pc03_get_crf_value.this.AV18W_ERR_CD;
      this.aP6[0] = b720_pc03_get_crf_value.this.AV20W_ERR_MSG;
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
      AV20W_ERR_MSG = "" ;
      AV19W_ERR_FLG = "" ;
      AV9B720_SD01_DESIGN_I = new SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem(remoteHandle, context);
      scmdbuf = "" ;
      A100TBT12_CRF_ITEM_GRP_CD = "" ;
      A465TBT12_CRF_VALUE = "" ;
      A473TBT12_DEL_FLG = "" ;
      P00752_A100TBT12_CRF_ITEM_GRP_CD = new String[] {""} ;
      P00752_A465TBT12_CRF_VALUE = new String[] {""} ;
      P00752_n465TBT12_CRF_VALUE = new boolean[] {false} ;
      P00752_A473TBT12_DEL_FLG = new String[] {""} ;
      P00752_n473TBT12_DEL_FLG = new boolean[] {false} ;
      P00752_A937TBT12_CRF_EDA_NO = new byte[1] ;
      P00752_A98TBT12_CRF_ID = new short[1] ;
      P00752_A97TBT12_SUBJECT_ID = new int[1] ;
      P00752_A96TBT12_STUDY_ID = new long[1] ;
      P00752_A99TBT12_CRF_ITEM_GRP_DIV = new String[] {""} ;
      A99TBT12_CRF_ITEM_GRP_DIV = "" ;
      AV29W_TBM26_LIST_ITEM_NAME = "" ;
      AV17W_CRF_VALUE = "" ;
      GXv_char1 = new String [1] ;
      AV36Pgmname = "" ;
      GXKey = "" ;
      GXEncryptionTmp = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new b720_pc03_get_crf_value__default(),
         new Object[] {
             new Object[] {
            P00752_A100TBT12_CRF_ITEM_GRP_CD, P00752_A465TBT12_CRF_VALUE, P00752_n465TBT12_CRF_VALUE, P00752_A473TBT12_DEL_FLG, P00752_n473TBT12_DEL_FLG, P00752_A937TBT12_CRF_EDA_NO, P00752_A98TBT12_CRF_ID, P00752_A97TBT12_SUBJECT_ID, P00752_A96TBT12_STUDY_ID, P00752_A99TBT12_CRF_ITEM_GRP_DIV
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV36Pgmname = "B720_PC03_GET_CRF_VALUE" ;
      /* GeneXus formulas. */
      AV36Pgmname = "B720_PC03_GET_CRF_VALUE" ;
      Gx_err = (short)(0) ;
   }

   private byte AV10P_CRF_EDA_NO ;
   private byte A937TBT12_CRF_EDA_NO ;
   private short AV11P_CRF_ID ;
   private short AV18W_ERR_CD ;
   private short A98TBT12_CRF_ID ;
   private short Gx_err ;
   private int AV13P_SUBJECT_ID ;
   private int AV32GXV1 ;
   private int AV33GXV2 ;
   private int A97TBT12_SUBJECT_ID ;
   private int AV35GXV3 ;
   private int GXActiveErrHndl ;
   private long AV12P_STUDY_ID ;
   private long A96TBT12_STUDY_ID ;
   private String scmdbuf ;
   private String GXv_char1[] ;
   private String AV36Pgmname ;
   private String GXKey ;
   private String GXEncryptionTmp ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private boolean n465TBT12_CRF_VALUE ;
   private boolean n473TBT12_DEL_FLG ;
   private String AV20W_ERR_MSG ;
   private String AV19W_ERR_FLG ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ;
   private String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ;
   private String A100TBT12_CRF_ITEM_GRP_CD ;
   private String A465TBT12_CRF_VALUE ;
   private String A473TBT12_DEL_FLG ;
   private String A99TBT12_CRF_ITEM_GRP_DIV ;
   private String AV29W_TBM26_LIST_ITEM_NAME ;
   private String AV17W_CRF_VALUE ;
   private GxObjectCollection[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P00752_A100TBT12_CRF_ITEM_GRP_CD ;
   private String[] P00752_A465TBT12_CRF_VALUE ;
   private boolean[] P00752_n465TBT12_CRF_VALUE ;
   private String[] P00752_A473TBT12_DEL_FLG ;
   private boolean[] P00752_n473TBT12_DEL_FLG ;
   private byte[] P00752_A937TBT12_CRF_EDA_NO ;
   private short[] P00752_A98TBT12_CRF_ID ;
   private int[] P00752_A97TBT12_SUBJECT_ID ;
   private long[] P00752_A96TBT12_STUDY_ID ;
   private String[] P00752_A99TBT12_CRF_ITEM_GRP_DIV ;
   private GxObjectCollection AV8B720_SD01_DESIGN_C ;
   private SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem AV9B720_SD01_DESIGN_I ;
}

final  class b720_pc03_get_crf_value__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_P00752( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.internet.HttpContext httpContext ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div ,
                                          String A100TBT12_CRF_ITEM_GRP_CD ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_cd ,
                                          String AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Grp_crf_item_cd ,
                                          String A465TBT12_CRF_VALUE ,
                                          String A473TBT12_DEL_FLG ,
                                          long AV12P_STUDY_ID ,
                                          int AV13P_SUBJECT_ID ,
                                          short AV11P_CRF_ID ,
                                          byte AV10P_CRF_EDA_NO ,
                                          long A96TBT12_STUDY_ID ,
                                          int A97TBT12_SUBJECT_ID ,
                                          short A98TBT12_CRF_ID ,
                                          byte A937TBT12_CRF_EDA_NO )
   {
      String sWhereString = "" ;
      String scmdbuf ;
      byte[] GXv_int2 ;
      GXv_int2 = new byte [6] ;
      Object[] GXv_Object3 ;
      GXv_Object3 = new Object [2] ;
      scmdbuf = "SELECT `TBT12_CRF_ITEM_GRP_CD`, `TBT12_CRF_VALUE`, `TBT12_DEL_FLG`, `TBT12_CRF_EDA_NO`," ;
      scmdbuf = scmdbuf + " `TBT12_CRF_ID`, `TBT12_SUBJECT_ID`, `TBT12_STUDY_ID`, `TBT12_CRF_ITEM_GRP_DIV` FROM" ;
      scmdbuf = scmdbuf + " `TBT12_CRF_RESULT`" ;
      scmdbuf = scmdbuf + " WHERE (`TBT12_STUDY_ID` = ? and `TBT12_SUBJECT_ID` = ? and `TBT12_CRF_ID` = ? and `TBT12_CRF_EDA_NO` = ?)" ;
      scmdbuf = scmdbuf + " and (Not (LENGTH(TRIM(`TBT12_CRF_VALUE`))=0))" ;
      scmdbuf = scmdbuf + " and (`TBT12_DEL_FLG` = '0')" ;
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div, "RadioBox") != 0 )
      {
         sWhereString = sWhereString + " and (`TBT12_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int2[4] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV9B720_SD01_DESIGN_I_getgxTv_SdtB720_SD01_DESIGN_B720_SD01_DESIGNItem_Crf_item_div, "RadioBox") == 0 )
      {
         sWhereString = sWhereString + " and (`TBT12_CRF_ITEM_GRP_CD` = ?)" ;
      }
      else
      {
         GXv_int2[5] = (byte)(1) ;
      }
      scmdbuf = scmdbuf + sWhereString ;
      scmdbuf = scmdbuf + " ORDER BY `TBT12_STUDY_ID`, `TBT12_SUBJECT_ID`, `TBT12_CRF_ID`, `TBT12_CRF_EDA_NO`" ;
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
                  return conditional_P00752(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).byteValue() , ((Number) dynConstraints[10]).longValue() , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00752", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1,0,true )
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
               ((byte[]) buf[5])[0] = rslt.getByte(4) ;
               ((short[]) buf[6])[0] = rslt.getShort(5) ;
               ((int[]) buf[7])[0] = rslt.getInt(6) ;
               ((long[]) buf[8])[0] = rslt.getLong(7) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(8) ;
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
                  stmt.setLong(sIdx, ((Number) parms[6]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[7]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[8]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[9]).byteValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[10], 50);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[11], 50);
               }
               return;
      }
   }

}

