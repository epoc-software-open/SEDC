/*
               File: B799_PC04_COND_GET
        Description: 条件式取得ロジック
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:17:25.43
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc04_cond_get extends GXProcedure
{
   public b799_pc04_cond_get( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc04_cond_get.class ), "" );
   }

   public b799_pc04_cond_get( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 )
   {
      b799_pc04_cond_get.this.AV8P_EXPRESSION = aP0;
      b799_pc04_cond_get.this.aP1 = aP1;
      b799_pc04_cond_get.this.aP1 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection[] aP1 )
   {
      b799_pc04_cond_get.this.AV8P_EXPRESSION = aP0;
      b799_pc04_cond_get.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV51W_SYS_CRF_ID ;
      GXv_char2[0] = GXt_char1 ;
      new b806_pc01_get_ctrl_val(remoteHandle, context).execute( "004", GXv_char2) ;
      b799_pc04_cond_get.this.GXt_char1 = GXv_char2[0] ;
      AV51W_SYS_CRF_ID = GXt_char1 ;
      AV28W_EnzansiAry.add("==", 0);
      AV28W_EnzansiAry.add("<=", 0);
      AV28W_EnzansiAry.add(">=", 0);
      AV28W_EnzansiAry.add(">", 0);
      AV28W_EnzansiAry.add("<", 0);
      AV28W_EnzansiAry.add("!=", 0);
      AV38W_KAKKO_IN = AV8P_EXPRESSION ;
      AV38W_KAKKO_IN = GxRegex.Replace(AV38W_KAKKO_IN,"　","") ;
      AV38W_KAKKO_IN = GxRegex.Replace(AV38W_KAKKO_IN," ","") ;
      AV38W_KAKKO_IN = GxRegex.Replace(AV38W_KAKKO_IN,"\\n","") ;
      AV38W_KAKKO_IN = GxRegex.Replace(AV38W_KAKKO_IN,"\\r","") ;
      AV38W_KAKKO_IN = GxRegex.Replace(AV38W_KAKKO_IN,"\\t","") ;
      if ( (GXutil.strcmp("", AV38W_KAKKO_IN)==0) )
      {
         AV49W_RES = (short)(1) ;
      }
      else
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
      cleanup();
   }

   public void S111( )
   {
      /* 'SUB_KAKKO' Routine */
      AV39W_KAKKO_index1 = (short)(GXutil.strSearch( AV38W_KAKKO_IN, "(", 1)) ;
      AV39W_KAKKO_index1 = (short)(AV39W_KAKKO_index1+(GXutil.strSearch( AV38W_KAKKO_IN, ")", 1))) ;
      if ( AV39W_KAKKO_index1 == 0 )
      {
         AV31W_GROUP_ID = (short)(0) ;
         AV18W_BUNKATU_IN = AV38W_KAKKO_IN ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
         AV49W_RES = AV19W_BUNKATU_OUT ;
      }
      else
      {
         AV36W_KAKKO_from = (short)(1) ;
         AV37W_KAKKO_hidari = (short)(0) ;
         AV41W_KAKKO_LAry.clear();
         AV32W_Index = (short)(1) ;
         while ( AV32W_Index <= GXutil.len( AV38W_KAKKO_IN) )
         {
            AV36W_KAKKO_from = (short)(GXutil.strSearch( AV38W_KAKKO_IN, "(", AV36W_KAKKO_from)) ;
            if ( AV36W_KAKKO_from > 0 )
            {
               AV41W_KAKKO_LAry.add((short)(AV36W_KAKKO_from), 0);
               AV36W_KAKKO_from = (short)(AV36W_KAKKO_from+1) ;
               AV37W_KAKKO_hidari = (short)(AV37W_KAKKO_hidari+1) ;
            }
            else
            {
               if (true) break;
            }
            AV32W_Index = (short)(AV32W_Index+1) ;
         }
         AV36W_KAKKO_from = (short)(1) ;
         AV42W_KAKKO_migi = (short)(0) ;
         AV44W_KAKKO_RAry.clear();
         AV32W_Index = (short)(1) ;
         while ( AV32W_Index <= GXutil.len( AV38W_KAKKO_IN) )
         {
            AV36W_KAKKO_from = (short)(GXutil.strSearch( AV38W_KAKKO_IN, ")", AV36W_KAKKO_from)) ;
            if ( AV36W_KAKKO_from > 0 )
            {
               AV44W_KAKKO_RAry.add((short)(AV36W_KAKKO_from), 0);
               AV36W_KAKKO_from = (short)(AV36W_KAKKO_from+1) ;
               AV42W_KAKKO_migi = (short)(AV42W_KAKKO_migi+1) ;
            }
            else
            {
               if (true) break;
            }
            AV32W_Index = (short)(AV32W_Index+1) ;
         }
         AV40W_KAKKO_kaisi = ((Number) AV41W_KAKKO_LAry.elementAt(-1+AV41W_KAKKO_LAry.size())).shortValue() ;
         AV32W_Index = (short)(1) ;
         while ( AV32W_Index <= AV44W_KAKKO_RAry.size() )
         {
            if ( AV40W_KAKKO_kaisi < ((Number) AV44W_KAKKO_RAry.elementAt(-1+AV32W_Index)).shortValue() )
            {
               AV43W_KAKKO_owari = ((Number) AV44W_KAKKO_RAry.elementAt(-1+AV32W_Index)).shortValue() ;
               if (true) break;
            }
            AV32W_Index = (short)(AV32W_Index+1) ;
         }
         AV45W_KAKKO_t1 = GXutil.substring( AV38W_KAKKO_IN, 1, AV40W_KAKKO_kaisi-1) ;
         AV46W_KAKKO_t2 = GXutil.substring( AV38W_KAKKO_IN, AV40W_KAKKO_kaisi+1, AV43W_KAKKO_owari-AV40W_KAKKO_kaisi-1) ;
         AV47W_KAKKO_t3 = GXutil.substring( AV38W_KAKKO_IN, AV43W_KAKKO_owari+1, GXutil.len( AV38W_KAKKO_IN)-AV43W_KAKKO_owari) ;
         AV18W_BUNKATU_IN = AV46W_KAKKO_t2 ;
         AV31W_GROUP_ID = (short)(AV31W_GROUP_ID+1) ;
         /* Execute user subroutine: S121 */
         S121 ();
         if (returnInSub) return;
         AV46W_KAKKO_t2 = GXutil.trim( GXutil.str( AV19W_BUNKATU_OUT, 10, 0)) ;
         AV38W_KAKKO_IN = AV45W_KAKKO_t1 + AV46W_KAKKO_t2 + AV47W_KAKKO_t3 ;
         /* Execute user subroutine: S111 */
         S111 ();
         if (returnInSub) return;
      }
   }

   public void S121( )
   {
      /* 'SUB_BUNKATU' Routine */
      AV19W_BUNKATU_OUT = (byte)(0) ;
      if ( ( GXutil.strcmp(AV18W_BUNKATU_IN, "0|and|0") == 0 ) || ( GXutil.strcmp(AV18W_BUNKATU_IN, "0|or|0") == 0 ) )
      {
         AV52W_CNT = AV9SD_B705_SD04_EXPRESSION.size() ;
         if ( AV52W_CNT > 2 )
         {
            AV52W_CNT = (long)(AV52W_CNT-1) ;
            if ( GXutil.strcmp(AV18W_BUNKATU_IN, "0|and|0") == 0 )
            {
               ((SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)AV9SD_B705_SD04_EXPRESSION.elementAt(-1+(int)(AV52W_CNT))).setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "and" );
            }
            else
            {
               ((SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)AV9SD_B705_SD04_EXPRESSION.elementAt(-1+(int)(AV52W_CNT))).setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "or" );
            }
         }
      }
      AV12W_BUNKATU_Ary0 = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV18W_BUNKATU_IN,"\\|or\\|")) ;
      AV13W_BUNKATU_Ary0_INDEX = (short)(0) ;
      AV55GXV1 = 1 ;
      while ( AV55GXV1 <= AV12W_BUNKATU_Ary0.size() )
      {
         AV14W_BUNKATU_Ary0_ITEM = (String)AV12W_BUNKATU_Ary0.elementAt(-1+AV55GXV1) ;
         AV13W_BUNKATU_Ary0_INDEX = (short)(AV13W_BUNKATU_Ary0_INDEX+1) ;
         AV15W_BUNKATU_Ary1 = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV14W_BUNKATU_Ary0_ITEM,"\\|and\\|")) ;
         if ( AV19W_BUNKATU_OUT != -1 )
         {
            AV16W_BUNKATU_Ary1_INDEX = (short)(0) ;
            AV56GXV2 = 1 ;
            while ( AV56GXV2 <= AV15W_BUNKATU_Ary1.size() )
            {
               AV17W_BUNKATU_Ary1_ITEM = (String)AV15W_BUNKATU_Ary1.elementAt(-1+AV56GXV2) ;
               AV16W_BUNKATU_Ary1_INDEX = (short)(AV16W_BUNKATU_Ary1_INDEX+1) ;
               AV24W_Decision_IN = AV17W_BUNKATU_Ary1_ITEM ;
               /* Execute user subroutine: S131 */
               S131 ();
               if (returnInSub) return;
               if ( AV25W_Decision_OUT == -1 )
               {
                  AV19W_BUNKATU_OUT = (byte)(-1) ;
                  if (true) break;
               }
               if ( AV16W_BUNKATU_Ary1_INDEX == 1 )
               {
                  AV20W_BUNKATU_tmp = AV25W_Decision_OUT ;
               }
               else
               {
                  AV20W_BUNKATU_tmp = (int)(AV25W_Decision_OUT*AV20W_BUNKATU_tmp) ;
               }
               AV56GXV2 = (int)(AV56GXV2+1) ;
            }
         }
         AV19W_BUNKATU_OUT = (byte)(AV19W_BUNKATU_OUT+AV20W_BUNKATU_tmp) ;
         AV55GXV1 = (int)(AV55GXV1+1) ;
      }
   }

   public void S131( )
   {
      /* 'SUB_DECISION' Routine */
      AV25W_Decision_OUT = (byte)(0) ;
      if ( GxRegex.IsMatch(AV24W_Decision_IN,"^[-+]?\\d+$") )
      {
         AV25W_Decision_OUT = (byte)(GXutil.lval( AV24W_Decision_IN)) ;
      }
      else
      {
         AV26W_Enzansi = "" ;
         AV57GXV3 = 1 ;
         while ( AV57GXV3 <= AV28W_EnzansiAry.size() )
         {
            AV27W_Enzansi_ITEM = (String)AV28W_EnzansiAry.elementAt(-1+AV57GXV3) ;
            AV33W_index1 = (short)(GXutil.strSearch( AV24W_Decision_IN, AV27W_Enzansi_ITEM, 1)) ;
            if ( AV33W_index1 > 0 )
            {
               AV26W_Enzansi = AV27W_Enzansi_ITEM ;
               if (true) break;
            }
            AV57GXV3 = (int)(AV57GXV3+1) ;
         }
         AV11W_Ary = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV24W_Decision_IN,AV26W_Enzansi)) ;
         AV10SD_B705_SD04_EXPRESSION_I = (SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem)new SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem(remoteHandle, context);
         AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Crf_item_cd( GXutil.strReplace( (String)AV11W_Ary.elementAt(-1+1), "@", "") );
         AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Cond( AV26W_Enzansi );
         AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Chk_val( (String)AV11W_Ary.elementAt(-1+2) );
         if ( AV16W_BUNKATU_Ary1_INDEX == 1 )
         {
            if ( AV13W_BUNKATU_Ary0_INDEX > 1 )
            {
               AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "or" );
            }
            else
            {
               if ( AV9SD_B705_SD04_EXPRESSION.size() > 0 )
               {
                  if ( AV16W_BUNKATU_Ary1_INDEX > 1 )
                  {
                     AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "and" );
                  }
                  else
                  {
                     if ( GXutil.strSearch( AV14W_BUNKATU_Ary0_ITEM, "|and|0", 1) > 1 )
                     {
                        AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "and" );
                     }
                     else
                     {
                        AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "or" );
                     }
                  }
               }
            }
         }
         else
         {
            AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Union_cond( "and" );
         }
         AV10SD_B705_SD04_EXPRESSION_I.setgxTv_SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem_Group_id( AV31W_GROUP_ID );
         AV9SD_B705_SD04_EXPRESSION.add(AV10SD_B705_SD04_EXPRESSION_I, 0);
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = b799_pc04_cond_get.this.AV9SD_B705_SD04_EXPRESSION;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9SD_B705_SD04_EXPRESSION = new GxObjectCollection(SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem.class, "B705_SD04_EXPRESSION.B705_SD04_EXPRESSIONItem", "tablet-EDC_GXXEV3U3", remoteHandle);
      AV51W_SYS_CRF_ID = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      AV28W_EnzansiAry = new GxObjectCollection(String.class, "internal", "");
      AV38W_KAKKO_IN = "" ;
      AV18W_BUNKATU_IN = "" ;
      AV41W_KAKKO_LAry = new GxObjectCollection(Short.class, "internal", "");
      AV44W_KAKKO_RAry = new GxObjectCollection(Short.class, "internal", "");
      AV45W_KAKKO_t1 = "" ;
      AV46W_KAKKO_t2 = "" ;
      AV47W_KAKKO_t3 = "" ;
      AV12W_BUNKATU_Ary0 = new GxObjectCollection(String.class, "internal", "");
      AV14W_BUNKATU_Ary0_ITEM = "" ;
      AV15W_BUNKATU_Ary1 = new GxObjectCollection(String.class, "internal", "");
      AV17W_BUNKATU_Ary1_ITEM = "" ;
      AV24W_Decision_IN = "" ;
      AV26W_Enzansi = "" ;
      AV27W_Enzansi_ITEM = "" ;
      AV11W_Ary = new GxObjectCollection(String.class, "internal", "");
      AV10SD_B705_SD04_EXPRESSION_I = new SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV19W_BUNKATU_OUT ;
   private byte AV25W_Decision_OUT ;
   private short AV49W_RES ;
   private short AV39W_KAKKO_index1 ;
   private short AV31W_GROUP_ID ;
   private short AV36W_KAKKO_from ;
   private short AV37W_KAKKO_hidari ;
   private short AV32W_Index ;
   private short AV42W_KAKKO_migi ;
   private short AV40W_KAKKO_kaisi ;
   private short AV43W_KAKKO_owari ;
   private short AV13W_BUNKATU_Ary0_INDEX ;
   private short AV16W_BUNKATU_Ary1_INDEX ;
   private short AV33W_index1 ;
   private short Gx_err ;
   private int AV55GXV1 ;
   private int AV56GXV2 ;
   private int AV20W_BUNKATU_tmp ;
   private int AV57GXV3 ;
   private long AV52W_CNT ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private boolean returnInSub ;
   private String AV8P_EXPRESSION ;
   private String AV51W_SYS_CRF_ID ;
   private String AV38W_KAKKO_IN ;
   private String AV18W_BUNKATU_IN ;
   private String AV45W_KAKKO_t1 ;
   private String AV46W_KAKKO_t2 ;
   private String AV47W_KAKKO_t3 ;
   private String AV14W_BUNKATU_Ary0_ITEM ;
   private String AV17W_BUNKATU_Ary1_ITEM ;
   private String AV24W_Decision_IN ;
   private String AV26W_Enzansi ;
   private String AV27W_Enzansi_ITEM ;
   private GxObjectCollection[] aP1 ;
   private GxObjectCollection AV9SD_B705_SD04_EXPRESSION ;
   private GxObjectCollection AV28W_EnzansiAry ;
   private GxObjectCollection AV41W_KAKKO_LAry ;
   private GxObjectCollection AV44W_KAKKO_RAry ;
   private GxObjectCollection AV12W_BUNKATU_Ary0 ;
   private GxObjectCollection AV15W_BUNKATU_Ary1 ;
   private GxObjectCollection AV11W_Ary ;
   private SdtB705_SD04_EXPRESSION_B705_SD04_EXPRESSIONItem AV10SD_B705_SD04_EXPRESSION_I ;
}

