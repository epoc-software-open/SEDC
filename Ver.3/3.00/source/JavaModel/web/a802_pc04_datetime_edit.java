/*
               File: A802_PC04_DATETIME_EDIT
        Description: ì˙ïtï“èWèàóùÇSÅiï∂éöå^Å®ì˙éûå^Ç÷Åj
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:13.62
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a802_pc04_datetime_edit extends GXProcedure
{
   public a802_pc04_datetime_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a802_pc04_datetime_edit.class ), "" );
   }

   public a802_pc04_datetime_edit( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public java.util.Date executeUdp( String aP0 )
   {
      a802_pc04_datetime_edit.this.AV12P_DATE_TIME_CHR = aP0;
      a802_pc04_datetime_edit.this.aP1 = aP1;
      a802_pc04_datetime_edit.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             java.util.Date[] aP1 )
   {
      a802_pc04_datetime_edit.this.AV12P_DATE_TIME_CHR = aP0;
      a802_pc04_datetime_edit.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (GXutil.strcmp("", AV12P_DATE_TIME_CHR)==0) )
      {
         AV10W_NOW_DATE = GXutil.resetTime(GXutil.now( )) ;
         AV15W_YMD_YEAR = (short)(GXutil.year( AV10W_NOW_DATE)) ;
         AV14W_YMD_MONTH = (byte)(GXutil.month( AV10W_NOW_DATE)) ;
         AV13W_YMD_DAY = (byte)(GXutil.day( AV10W_NOW_DATE)) ;
         AV9W_LEN = (byte)(GXutil.len( AV12P_DATE_TIME_CHR)) ;
         if ( AV9W_LEN == 4 )
         {
            if ( GXutil.strcmp(AV12P_DATE_TIME_CHR, "0000") != 0 )
            {
               AV8W_DATE_TIME = GXutil.substring( AV12P_DATE_TIME_CHR, 1, 2) + ":" + GXutil.substring( AV12P_DATE_TIME_CHR, 3, 2) ;
               AV11W_DATE_TIME_TIME = localUtil.ctot( AV8W_DATE_TIME, 6) ;
            }
            else
            {
               AV11W_DATE_TIME_TIME = localUtil.ymdhmsToT( AV15W_YMD_YEAR, AV14W_YMD_MONTH, AV13W_YMD_DAY, (byte)(0), (byte)(0), (byte)(0)) ;
            }
         }
         else if ( AV9W_LEN == 6 )
         {
            if ( GXutil.strcmp(AV12P_DATE_TIME_CHR, "000000") != 0 )
            {
               AV8W_DATE_TIME = GXutil.substring( AV12P_DATE_TIME_CHR, 1, 2) + ":" + GXutil.substring( AV12P_DATE_TIME_CHR, 3, 2) + ":" + GXutil.substring( AV12P_DATE_TIME_CHR, 5, 2) ;
               AV11W_DATE_TIME_TIME = localUtil.ctot( AV8W_DATE_TIME, 6) ;
            }
            else
            {
               AV11W_DATE_TIME_TIME = localUtil.ymdhmsToT( AV15W_YMD_YEAR, AV14W_YMD_MONTH, AV13W_YMD_DAY, (byte)(0), (byte)(0), (byte)(0)) ;
            }
         }
      }
      else
      {
         AV11W_DATE_TIME_TIME = GXutil.resetTime( GXutil.nullDate() );
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a802_pc04_datetime_edit.this.AV11W_DATE_TIME_TIME;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_DATE_TIME_TIME = GXutil.resetTime( GXutil.nullDate() );
      AV10W_NOW_DATE = GXutil.nullDate() ;
      AV8W_DATE_TIME = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV14W_YMD_MONTH ;
   private byte AV13W_YMD_DAY ;
   private byte AV9W_LEN ;
   private short AV15W_YMD_YEAR ;
   private short Gx_err ;
   private java.util.Date AV11W_DATE_TIME_TIME ;
   private java.util.Date AV10W_NOW_DATE ;
   private String AV12P_DATE_TIME_CHR ;
   private String AV8W_DATE_TIME ;
   private java.util.Date[] aP1 ;
}

