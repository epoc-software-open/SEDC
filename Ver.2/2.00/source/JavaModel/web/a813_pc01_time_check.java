/*
               File: A813_PC01_TIME_CHECK
        Description: 時刻チェック処理（文字型）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.67
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a813_pc01_time_check extends GXProcedure
{
   public a813_pc01_time_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a813_pc01_time_check.class ), "" );
   }

   public a813_pc01_time_check( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           String[] aP1 )
   {
      a813_pc01_time_check.this.AV9P_IN_TIME = aP0;
      a813_pc01_time_check.this.aP1 = aP1;
      a813_pc01_time_check.this.aP2 = aP2;
      a813_pc01_time_check.this.aP2 = new byte[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             byte[] aP2 )
   {
      a813_pc01_time_check.this.AV9P_IN_TIME = aP0;
      a813_pc01_time_check.this.aP1 = aP1;
      a813_pc01_time_check.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11W_OUT_TIME = GXutil.trim( AV9P_IN_TIME) ;
      AV10W_OUT_RTN_CD = (byte)(0) ;
      if ( (GXutil.strcmp("", AV11W_OUT_TIME)==0) )
      {
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV8W_IX1 = GXutil.byteCount( AV11W_OUT_TIME, "SHIFT-JIS") ;
      if ( AV8W_IX1 == 4 )
      {
         AV13W_TIME_HH = GXutil.substring( AV11W_OUT_TIME, 1, 2) ;
         AV12W_TIME_COL = ":" ;
         AV14W_TIME_MM = GXutil.substring( AV11W_OUT_TIME, 3, 2) ;
      }
      else if ( AV8W_IX1 == 5 )
      {
         AV13W_TIME_HH = GXutil.substring( AV11W_OUT_TIME, 1, 2) ;
         AV12W_TIME_COL = GXutil.substring( AV11W_OUT_TIME, 3, 1) ;
         AV14W_TIME_MM = GXutil.substring( AV11W_OUT_TIME, 4, 2) ;
      }
      else
      {
         AV10W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strcmp(AV13W_TIME_HH, "00") < 0 ) || ( GXutil.strcmp(AV13W_TIME_HH, "23") > 0 ) )
      {
         AV10W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( GXutil.strcmp(AV12W_TIME_COL, ":") != 0 )
      {
         AV10W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      if ( ( GXutil.strcmp(AV14W_TIME_MM, "00") < 0 ) || ( GXutil.strcmp(AV14W_TIME_MM, "59") > 0 ) )
      {
         AV10W_OUT_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV11W_OUT_TIME = AV13W_TIME_HH + AV12W_TIME_COL + AV14W_TIME_MM ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a813_pc01_time_check.this.AV11W_OUT_TIME;
      this.aP2[0] = a813_pc01_time_check.this.AV10W_OUT_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_OUT_TIME = "" ;
      AV13W_TIME_HH = "" ;
      AV12W_TIME_COL = "" ;
      AV14W_TIME_MM = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10W_OUT_RTN_CD ;
   private short Gx_err ;
   private int AV8W_IX1 ;
   private boolean returnInSub ;
   private String AV9P_IN_TIME ;
   private String AV11W_OUT_TIME ;
   private String AV13W_TIME_HH ;
   private String AV12W_TIME_COL ;
   private String AV14W_TIME_MM ;
   private String[] aP1 ;
   private byte[] aP2 ;
}

