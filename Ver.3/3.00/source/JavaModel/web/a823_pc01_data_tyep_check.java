/*
               File: A823_PC01_DATA_TYEP_CHECK
        Description: 項目属性チェック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:17.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a823_pc01_data_tyep_check extends GXProcedure
{
   public a823_pc01_data_tyep_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a823_pc01_data_tyep_check.class ), "" );
   }

   public a823_pc01_data_tyep_check( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( )
   {
      a823_pc01_data_tyep_check.this.AV8P_A_CHK_INFO_SDT = aP0[0];
      this.aP0 = aP0;
      a823_pc01_data_tyep_check.this.aP0 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP0[0];
   }

   public void execute( GxObjectCollection[] aP0 )
   {
      execute_int(aP0);
   }

   private void execute_int( GxObjectCollection[] aP0 )
   {
      a823_pc01_data_tyep_check.this.AV8P_A_CHK_INFO_SDT = aP0[0];
      this.aP0 = aP0;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV27GXV1 = 1 ;
      while ( AV27GXV1 <= AV8P_A_CHK_INFO_SDT.size() )
      {
         AV9W_A_CHK_INFO_SDT_ITEM = (SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)((SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem)AV8P_A_CHK_INFO_SDT.elementAt(-1+AV27GXV1));
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(0) );
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( "" );
         if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR") == 0 )
         {
            /* Execute user subroutine: S111 */
            S111 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_NUM") == 0 )
         {
            /* Execute user subroutine: S141 */
            S141 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_ALPNUM") == 0 )
         {
            AV24W_HF_UD_OK_FLG = false ;
            /* Execute user subroutine: S151 */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_ALPNUM_UD_HF") == 0 )
         {
            AV24W_HF_UD_OK_FLG = true ;
            /* Execute user subroutine: S151 */
            S151 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_ALPNUMSIG") == 0 )
         {
            /* Execute user subroutine: S161 */
            S161 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_ZENKAKU") == 0 )
         {
            /* Execute user subroutine: S171 */
            S171 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_YMD") == 0 )
         {
            /* Execute user subroutine: S181 */
            S181 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "STR_YM") == 0 )
         {
            /* Execute user subroutine: S191 */
            S191 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "NUM") == 0 )
         {
            /* Execute user subroutine: S201 */
            S201 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "DATE") == 0 )
         {
            /* Execute user subroutine: S211 */
            S211 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else if ( GXutil.strcmp(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_kbn(), "DATETIME") == 0 )
         {
            /* Execute user subroutine: S221 */
            S221 ();
            if ( returnInSub )
            {
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         AV27GXV1 = (int)(AV27GXV1+1) ;
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_CHK_STR' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() > 0 )
         {
            /* Execute user subroutine: S121 */
            S121 ();
            if (returnInSub) return;
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_half() == 1 )
         {
            /* Execute user subroutine: S131 */
            S131 ();
            if (returnInSub) return;
         }
      }
   }

   public void S141( )
   {
      /* 'SUB_CHK_STR_NUM' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( GxRegex.IsMatch(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(),"[^0-9.]") )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( ! (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV14W_LEN = (short)(GXutil.len( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())) ;
            if ( ( GXutil.strcmp(GXutil.substring( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), 1, 1), ".") == 0 ) || ( GXutil.strcmp(GXutil.substring( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), AV14W_LEN, 1), ".") == 0 ) )
            {
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
               a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
            }
            else
            {
               AV20W_STR = GXutil.strReplace( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), ".", "") ;
               if ( AV14W_LEN <= GXutil.len( AV20W_STR) + 1 )
               {
               }
               else
               {
                  AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
                  a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
                  AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
               }
            }
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() > 0 )
         {
            if ( GXutil.val( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), ".") > 0 )
            {
               AV18W_POS = (short)(GXutil.strSearch( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), ".", 1)) ;
               if ( AV18W_POS == 0 )
               {
                  AV15W_LEN_DEC = (short)(0) ;
                  AV14W_LEN = (short)(GXutil.len( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())) ;
               }
               else
               {
                  AV15W_LEN_DEC = (short)(GXutil.len( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())-AV18W_POS) ;
                  AV14W_LEN = (short)(AV18W_POS-1) ;
               }
               if ( ( AV14W_LEN > AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() ) || ( AV15W_LEN_DEC > AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte_dec() ) )
               {
                  AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
                  GXt_char1 = "" ;
                  GXv_char2[0] = GXt_char1 ;
                  new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
                  a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
                  AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
               }
            }
         }
      }
   }

   public void S151( )
   {
      /* 'SUB_CHK_STR_ALPNUM' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( ! AV24W_HF_UD_OK_FLG )
         {
            if ( GxRegex.IsMatch(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(),"[^a-zA-Z0-9]") )
            {
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00021", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
               a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
            }
         }
         else
         {
            AV23W_CHK_STR = GXutil.strReplace( GXutil.strReplace( GXutil.strReplace( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), "-", ""), "_", ""), ".", "") ;
            if ( GxRegex.IsMatch(AV23W_CHK_STR,"[^a-zA-Z0-9]") )
            {
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00094", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
               a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
            }
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() > 0 )
         {
            /* Execute user subroutine: S121 */
            S121 ();
            if (returnInSub) return;
         }
      }
   }

   public void S161( )
   {
      /* 'SUB_CHK_STR_ALPNUMSIG' Routine */
      GXt_int3 = AV19W_RET ;
      GXv_int4[0] = GXt_int3 ;
      new a807_pc02_1byte_check(remoteHandle, context).execute( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), GXv_int4) ;
      a823_pc01_data_tyep_check.this.GXt_int3 = GXv_int4[0] ;
      AV19W_RET = GXt_int3 ;
      if ( GxRegex.IsMatch(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(),"[ｱ-ﾝ]") || ( AV19W_RET != 0 ) )
      {
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "ZE00032", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
         a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
      }
   }

   public void S171( )
   {
      /* 'SUB_CHK_STR_ZENKAKU' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( ! (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            if ( ! GxRegex.IsMatch(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(),"^[^ -~｡-ﾟ]*$") )
            {
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00042", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
               a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
            }
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() > 0 )
         {
            /* Execute user subroutine: S121 */
            S121 ();
            if (returnInSub) return;
         }
      }
   }

   public void S181( )
   {
      /* 'SUB_CHK_STR_YMD' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         GXt_int3 = AV12W_ERR_FLG ;
         GXv_char2[0] = AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str() ;
         GXv_int4[0] = GXt_int3 ;
         new a813_pc03_date_check(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXv_char2[0] );
         a823_pc01_data_tyep_check.this.GXt_int3 = GXv_int4[0] ;
         AV12W_ERR_FLG = GXt_int3 ;
         if ( AV12W_ERR_FLG != 0 )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
   }

   public void S191( )
   {
      /* 'SUB_CHK_STR_YM' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (GXutil.strcmp("", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())==0) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         AV20W_STR = AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str() + "01" ;
         GXt_int3 = AV12W_ERR_FLG ;
         GXv_char2[0] = AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str() ;
         GXv_int4[0] = GXt_int3 ;
         new a813_pc03_date_check(remoteHandle, context).execute( GXv_char2, GXv_int4) ;
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str( GXv_char2[0] );
         a823_pc01_data_tyep_check.this.GXt_int3 = GXv_int4[0] ;
         AV12W_ERR_FLG = GXt_int3 ;
         if ( AV12W_ERR_FLG != 0 )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
   }

   public void S201( )
   {
      /* 'SUB_CHK_NUM' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( (DecimalUtil.ZERO.compareTo(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num())==0) || ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num().doubleValue() == 0 ) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result() == 0 )
      {
         if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit().doubleValue() != 0 )
         {
            AV21W_VAL_NUM = (long)(DecimalUtil.decToDouble(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_num().multiply(DecimalUtil.doubleToDec(1000)))) ;
            AV22W_CHK_UNIT = (long)(DecimalUtil.decToDouble(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit().multiply(DecimalUtil.doubleToDec(1000)))) ;
            if ( ((int)((AV21W_VAL_NUM) % (AV22W_CHK_UNIT))) != 0 )
            {
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
               AV20W_STR = GXutil.trim( GXutil.str( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_unit(), 15, 3)) ;
               AV20W_STR = GxRegex.Replace(AV20W_STR,"\\.0+$|0+$","") ;
               GXt_char1 = "" ;
               GXv_char2[0] = GXt_char1 ;
               new a805_pc01_msg_get(remoteHandle, context).execute( "AE00035", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), AV20W_STR, "", "", "", GXv_char2) ;
               a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
               AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
            }
         }
      }
   }

   public void S211( )
   {
      /* 'SUB_CHK_DATE' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         AV11W_DATE = GXutil.resetTime(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date()) ;
         if ( GXutil.nullDate().equals(AV11W_DATE) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
   }

   public void S221( )
   {
      /* 'SUB_CHK_DATETIME' Routine */
      if ( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_nulls() == 1 )
      {
         if ( GXutil.nullDate().equals(AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_date()) )
         {
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
            GXt_char1 = "" ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00001", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), "", "", "", "", GXv_char2) ;
            a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
            AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
         }
      }
   }

   public void S121( )
   {
      /* 'SUB_CHK_BYTE' Routine */
      AV10W_BYTE_CNT = (short)(GXutil.len( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())) ;
      if ( AV10W_BYTE_CNT > AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte() )
      {
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00027", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), GXutil.trim( GXutil.str( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte(), 10, 0)), "", "", "", GXv_char2) ;
         a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
      }
   }

   public void S131( )
   {
      /* 'SUB_CHK_HALF' Routine */
      AV14W_LEN = (short)(GXutil.len( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str())) ;
      AV10W_BYTE_CNT = (short)(GXutil.byteCount( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Val_str(), "Shift-JIS")) ;
      if ( AV14W_LEN != AV10W_BYTE_CNT )
      {
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result( (byte)(1) );
         GXt_char1 = "" ;
         GXv_char2[0] = GXt_char1 ;
         new a805_pc01_msg_get(remoteHandle, context).execute( "AE00020", AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Item_nm(), GXutil.trim( GXutil.str( AV9W_A_CHK_INFO_SDT_ITEM.getgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Chk_byte(), 10, 0)), "", "", "", GXv_char2) ;
         a823_pc01_data_tyep_check.this.GXt_char1 = GXv_char2[0] ;
         AV9W_A_CHK_INFO_SDT_ITEM.setgxTv_SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem_Result_msg( GXt_char1 );
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = a823_pc01_data_tyep_check.this.AV8P_A_CHK_INFO_SDT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_A_CHK_INFO_SDT_ITEM = new SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem(remoteHandle, context);
      AV20W_STR = "" ;
      AV23W_CHK_STR = "" ;
      GXv_int4 = new byte [1] ;
      AV11W_DATE = GXutil.nullDate() ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19W_RET ;
   private byte AV12W_ERR_FLG ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private short AV14W_LEN ;
   private short AV18W_POS ;
   private short AV15W_LEN_DEC ;
   private short AV10W_BYTE_CNT ;
   private short Gx_err ;
   private int AV27GXV1 ;
   private long AV21W_VAL_NUM ;
   private long AV22W_CHK_UNIT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date AV11W_DATE ;
   private boolean returnInSub ;
   private boolean AV24W_HF_UD_OK_FLG ;
   private String AV20W_STR ;
   private String AV23W_CHK_STR ;
   private GxObjectCollection[] aP0 ;
   private GxObjectCollection AV8P_A_CHK_INFO_SDT ;
   private SdtA_CHK_INFO_SDT_A_CHK_INFO_SDTItem AV9W_A_CHK_INFO_SDT_ITEM ;
}

