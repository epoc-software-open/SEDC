/*
               File: A814_PC01_KIN_COM_EDIT
        Description: 金額カンマ編集処理（数値型⇒文字型）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.75
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a814_pc01_kin_com_edit extends GXProcedure
{
   public a814_pc01_kin_com_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a814_pc01_kin_com_edit.class ), "" );
   }

   public a814_pc01_kin_com_edit( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( long aP0 )
   {
      a814_pc01_kin_com_edit.this.AV16P_KINGAKU = aP0;
      a814_pc01_kin_com_edit.this.aP1 = aP1;
      a814_pc01_kin_com_edit.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( long aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( long aP0 ,
                             String[] aP1 )
   {
      a814_pc01_kin_com_edit.this.AV16P_KINGAKU = aP0;
      a814_pc01_kin_com_edit.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV17W_KINGAKU_OUT = "" ;
      if ( AV16P_KINGAKU != 0 )
      {
         if ( AV16P_KINGAKU < 0 )
         {
            AV11W_KINGAKU_PLUS = (long)(AV16P_KINGAKU*-1) ;
         }
         else
         {
            AV11W_KINGAKU_PLUS = AV16P_KINGAKU ;
         }
         AV12W_KINGAKU_VC = GXutil.trim( GXutil.str( AV11W_KINGAKU_PLUS, 18, 0)) ;
         AV14W_LEN = (byte)(GXutil.len( AV12W_KINGAKU_VC)) ;
         AV13W_KINGAKU2_VC = "" ;
         AV15W_NOT_ZERO_FLG = (byte)(0) ;
         AV10W_IX1 = 1 ;
         while ( AV10W_IX1 <= AV14W_LEN )
         {
            AV8W_EDIT_1VC = GXutil.substring( AV12W_KINGAKU_VC, AV10W_IX1, 1) ;
            if ( ( GXutil.strcmp(AV8W_EDIT_1VC, "0") != 0 ) && ( AV15W_NOT_ZERO_FLG == 0 ) )
            {
               AV15W_NOT_ZERO_FLG = (byte)(1) ;
            }
            if ( AV15W_NOT_ZERO_FLG == 1 )
            {
               AV13W_KINGAKU2_VC = AV13W_KINGAKU2_VC + AV8W_EDIT_1VC ;
            }
            AV10W_IX1 = (int)(AV10W_IX1+1) ;
         }
         AV12W_KINGAKU_VC = AV13W_KINGAKU2_VC ;
         AV14W_LEN = (byte)(GXutil.len( AV12W_KINGAKU_VC)) ;
         AV13W_KINGAKU2_VC = "" ;
         AV9W_EDIT_CNT = (short)(0) ;
         AV10W_IX1 = AV14W_LEN ;
         while ( AV10W_IX1 >= 1 )
         {
            AV8W_EDIT_1VC = GXutil.substring( AV12W_KINGAKU_VC, AV10W_IX1, 1) ;
            AV9W_EDIT_CNT = (short)(AV9W_EDIT_CNT+1) ;
            if ( ( AV9W_EDIT_CNT == 4 ) || ( AV9W_EDIT_CNT == 7 ) || ( AV9W_EDIT_CNT == 10 ) || ( AV9W_EDIT_CNT == 13 ) || ( AV9W_EDIT_CNT == 16 ) )
            {
               AV13W_KINGAKU2_VC = AV8W_EDIT_1VC + "," + AV13W_KINGAKU2_VC ;
            }
            else
            {
               AV13W_KINGAKU2_VC = AV8W_EDIT_1VC + AV13W_KINGAKU2_VC ;
            }
            AV10W_IX1 = (int)(AV10W_IX1+-1) ;
         }
         if ( AV16P_KINGAKU < 0 )
         {
            AV17W_KINGAKU_OUT = "-" + AV13W_KINGAKU2_VC ;
         }
         else
         {
            AV17W_KINGAKU_OUT = AV13W_KINGAKU2_VC ;
         }
      }
      else
      {
         AV17W_KINGAKU_OUT = "0" ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a814_pc01_kin_com_edit.this.AV17W_KINGAKU_OUT;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17W_KINGAKU_OUT = "" ;
      AV12W_KINGAKU_VC = "" ;
      AV13W_KINGAKU2_VC = "" ;
      AV8W_EDIT_1VC = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14W_LEN ;
   private byte AV15W_NOT_ZERO_FLG ;
   private short AV9W_EDIT_CNT ;
   private short Gx_err ;
   private int AV10W_IX1 ;
   private long AV16P_KINGAKU ;
   private long AV11W_KINGAKU_PLUS ;
   private String AV17W_KINGAKU_OUT ;
   private String AV12W_KINGAKU_VC ;
   private String AV13W_KINGAKU2_VC ;
   private String AV8W_EDIT_1VC ;
   private String[] aP1 ;
}

