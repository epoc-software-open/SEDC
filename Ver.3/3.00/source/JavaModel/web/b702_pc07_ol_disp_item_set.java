/*
               File: B702_PC07_OL_DISP_ITEM_SET
        Description: Overlayï\é¶çÄñ⁄ê›íËèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:19.17
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b702_pc07_ol_disp_item_set extends GXProcedure
{
   public b702_pc07_ol_disp_item_set( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b702_pc07_ol_disp_item_set.class ), "" );
   }

   public b702_pc07_ol_disp_item_set( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem executeUdp( GxObjectCollection aP0 ,
                                                                                 GxObjectCollection aP1 )
   {
      b702_pc07_ol_disp_item_set.this.AV10SD_B792_SD03_OL_DISP_INFO = aP0;
      b702_pc07_ol_disp_item_set.this.AV13SD_B702_SD05_DOMAIN_INFO = aP1;
      b702_pc07_ol_disp_item_set.this.AV8SD_B702_SD02_CRF_ITEM_DESIGN_I = aP2[0];
      this.aP2 = aP2;
      b702_pc07_ol_disp_item_set.this.aP2 = new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem[] {new SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem()};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( GxObjectCollection aP0 ,
                        GxObjectCollection aP1 ,
                        SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( GxObjectCollection aP0 ,
                             GxObjectCollection aP1 ,
                             SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem[] aP2 )
   {
      b702_pc07_ol_disp_item_set.this.AV10SD_B792_SD03_OL_DISP_INFO = aP0;
      b702_pc07_ol_disp_item_set.this.AV13SD_B702_SD05_DOMAIN_INFO = aP1;
      b702_pc07_ol_disp_item_set.this.AV8SD_B702_SD02_CRF_ITEM_DESIGN_I = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17GXV1 = 1 ;
      while ( AV17GXV1 <= AV10SD_B792_SD03_OL_DISP_INFO.size() )
      {
         AV11SD_B792_SD03_OL_DISP_INFO_I = (SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)((SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem)AV10SD_B792_SD03_OL_DISP_INFO.elementAt(-1+AV17GXV1));
         if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "CRF_ITEM_CD") == 0 )
         {
            if ( ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "TextArea") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "NumericTextBox") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "SelectBox") == 0 ) )
            {
               AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd() );
            }
            else if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") == 0 )
            {
               if ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value())==0) || ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) ) )
               {
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd() );
               }
            }
            else if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 )
            {
               if ( ( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().size() > 0 ) || ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) ) )
               {
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd() );
               }
            }
            else if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") == 0 )
            {
               if ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value())==0) )
               {
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd() );
               }
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "DOM") == 0 )
         {
            if ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) )
            {
               if ( ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "TextArea") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "NumericTextBox") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "CheckBox") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "SelectBox") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Group") == 0 ) )
               {
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd()+"."+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm() );
               }
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "REF") == 0 )
         {
            if ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd())==0) )
            {
               if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") == 0 )
               {
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+GXutil.trim( GXutil.str( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_id(), 4, 0))+"_"+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ref_crf_item_cd() );
               }
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "SELECT") == 0 )
         {
            if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "SelectBox") == 0 )
            {
               AV12W_CNT = 0 ;
               AV18GXV2 = 1 ;
               while ( AV18GXV2 <= AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().size() )
               {
                  AV9SD_B702_SD03_SEL_LIST_ITEM_I = (SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)((SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem)AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_List_items().elementAt(-1+AV18GXV2));
                  if ( AV12W_CNT != 0 )
                  {
                     AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+"," );
                  }
                  AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV9SD_B702_SD03_SEL_LIST_ITEM_I.getgxTv_SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem_Inner_value() );
                  AV12W_CNT = (long)(AV12W_CNT+1) ;
                  AV18GXV2 = (int)(AV18GXV2+1) ;
               }
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "RADIO") == 0 )
         {
            if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "RadioBox") == 0 )
            {
               AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value() );
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "CHECK") == 0 )
         {
            if ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "CheckBox") == 0 )
            {
               AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_true_inner_value()+","+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Chk_false_inner_value() );
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "FIXED") == 0 )
         {
            if ( ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Label") == 0 ) || ( GXutil.strcmp(AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_div(), "Image") == 0 ) )
            {
               AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Fixed_value() );
            }
         }
         else if ( GXutil.strcmp(AV11SD_B792_SD03_OL_DISP_INFO_I.getgxTv_SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem_Ol_disp_item_kbn(), "OID_ROWNO") == 0 )
         {
            if ( ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_cd())==0) && ! (GXutil.strcmp("", AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Dom_var_nm())==0) )
            {
               AV19GXV3 = 1 ;
               while ( AV19GXV3 <= AV13SD_B702_SD05_DOMAIN_INFO.size() )
               {
                  AV14SD_B702_SD05_DOMAIN_INFO_I = (SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)((SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem)AV13SD_B702_SD05_DOMAIN_INFO.elementAt(-1+AV19GXV3));
                  if ( GXutil.strcmp(AV14SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_crf_item_grp_cd(), AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Crf_item_cd()) == 0 )
                  {
                     AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+AV14SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_oid()+" "+GXutil.trim( GXutil.str( AV14SD_B702_SD05_DOMAIN_INFO_I.getgxTv_SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem_Tbm37_dom_itm_grp_rowno(), 4, 0)) );
                     if (true) break;
                  }
                  AV19GXV3 = (int)(AV19GXV3+1) ;
               }
            }
         }
         AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.setgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item( AV8SD_B702_SD02_CRF_ITEM_DESIGN_I.getgxTv_SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem_Ol_disp_item()+" " );
         AV17GXV1 = (int)(AV17GXV1+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = b702_pc07_ol_disp_item_set.this.AV8SD_B702_SD02_CRF_ITEM_DESIGN_I;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11SD_B792_SD03_OL_DISP_INFO_I = new SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem(remoteHandle, context);
      AV9SD_B702_SD03_SEL_LIST_ITEM_I = new SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem(remoteHandle, context);
      AV14SD_B702_SD05_DOMAIN_INFO_I = new SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV17GXV1 ;
   private int AV18GXV2 ;
   private int AV19GXV3 ;
   private long AV12W_CNT ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem[] aP2 ;
   private GxObjectCollection AV10SD_B792_SD03_OL_DISP_INFO ;
   private GxObjectCollection AV13SD_B702_SD05_DOMAIN_INFO ;
   private SdtB702_SD02_CRF_ITEM_DESIGN_B702_SD02_CRF_ITEM_DESIGNItem AV8SD_B702_SD02_CRF_ITEM_DESIGN_I ;
   private SdtB702_SD03_SEL_LIST_ITEM_B702_SD03_SEL_LIST_ITEMItem AV9SD_B702_SD03_SEL_LIST_ITEM_I ;
   private SdtB792_SD03_OL_DISP_INFO_B792_SD03_OL_DISP_INFOItem AV11SD_B792_SD03_OL_DISP_INFO_I ;
   private SdtB702_SD05_DOMAIN_INFO_B702_SD05_DOMAIN_INFOItem AV14SD_B702_SD05_DOMAIN_INFO_I ;
}

