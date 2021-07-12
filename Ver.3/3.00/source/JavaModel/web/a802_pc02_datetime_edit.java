/*
               File: A802_PC02_DATETIME_EDIT
        Description: 日付編集処理２（日時→指定形式へ）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:12.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a802_pc02_datetime_edit extends GXProcedure
{
   public a802_pc02_datetime_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a802_pc02_datetime_edit.class ), "" );
   }

   public a802_pc02_datetime_edit( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( java.util.Date aP0 ,
                             String aP1 )
   {
      a802_pc02_datetime_edit.this.AV13P_DATETIME = aP0;
      a802_pc02_datetime_edit.this.AV14P_STYLE = aP1;
      a802_pc02_datetime_edit.this.aP2 = aP2;
      a802_pc02_datetime_edit.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( java.util.Date aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( java.util.Date aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a802_pc02_datetime_edit.this.AV13P_DATETIME = aP0;
      a802_pc02_datetime_edit.this.AV14P_STYLE = aP1;
      a802_pc02_datetime_edit.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV12W_CNV_DATETIME = "" ;
      if ( ! GXutil.nullDate().equals(AV13P_DATETIME) )
      {
         AV16W_YY = GXutil.trim( GXutil.str( GXutil.year( AV13P_DATETIME), 10, 0)) ;
         AV11W_MM = GXutil.trim( GXutil.str( GXutil.month( AV13P_DATETIME), 10, 0)) ;
         AV8W_DD = GXutil.trim( GXutil.str( GXutil.day( AV13P_DATETIME), 10, 0)) ;
         AV9W_HH = GXutil.trim( GXutil.str( GXutil.hour( AV13P_DATETIME), 10, 0)) ;
         AV10W_MI = GXutil.trim( GXutil.str( GXutil.minute( AV13P_DATETIME), 10, 0)) ;
         AV15W_SS = GXutil.trim( GXutil.str( GXutil.second( AV13P_DATETIME), 10, 0)) ;
         if ( GXutil.len( GXutil.trim( AV16W_YY)) == 1 )
         {
            AV16W_YY = GXutil.padl( AV16W_YY, (short)(4), "0") ;
         }
         if ( GXutil.len( GXutil.trim( AV11W_MM)) == 1 )
         {
            AV11W_MM = GXutil.padl( AV11W_MM, (short)(2), "0") ;
         }
         if ( GXutil.len( GXutil.trim( AV8W_DD)) == 1 )
         {
            AV8W_DD = GXutil.padl( AV8W_DD, (short)(2), "0") ;
         }
         if ( GXutil.len( GXutil.trim( AV9W_HH)) == 1 )
         {
            AV9W_HH = GXutil.padl( AV9W_HH, (short)(2), "0") ;
         }
         if ( GXutil.len( GXutil.trim( AV10W_MI)) == 1 )
         {
            AV10W_MI = GXutil.padl( AV10W_MI, (short)(2), "0") ;
         }
         if ( GXutil.len( GXutil.trim( AV15W_SS)) == 1 )
         {
            AV15W_SS = GXutil.padl( AV15W_SS, (short)(2), "0") ;
         }
         if ( GXutil.strcmp(AV14P_STYLE, "YYYY/MM/DD HH:MI:SS") == 0 )
         {
            AV12W_CNV_DATETIME = AV16W_YY + "/" + AV11W_MM + "/" + AV8W_DD + " " + AV9W_HH + ":" + AV10W_MI + ":" + AV15W_SS ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "YYYYMMDDHHMISS") == 0 )
         {
            AV12W_CNV_DATETIME = AV16W_YY + AV11W_MM + AV8W_DD + AV9W_HH + AV10W_MI + AV15W_SS ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "YYYYMMDD") == 0 )
         {
            AV12W_CNV_DATETIME = AV16W_YY + AV11W_MM + AV8W_DD ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HHMISS") == 0 )
         {
            AV12W_CNV_DATETIME = AV9W_HH + AV10W_MI + AV15W_SS ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HHMI") == 0 )
         {
            AV12W_CNV_DATETIME = AV9W_HH + AV10W_MI ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HH:MI:SS") == 0 )
         {
            AV12W_CNV_DATETIME = AV9W_HH + ":" + AV10W_MI + ":" + AV15W_SS ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HH:MI") == 0 )
         {
            AV12W_CNV_DATETIME = AV9W_HH + ":" + AV10W_MI ;
         }
      }
      else
      {
         if ( GXutil.strcmp(AV14P_STYLE, "HHMISS") == 0 )
         {
            AV12W_CNV_DATETIME = "000000" ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HHMI") == 0 )
         {
            AV12W_CNV_DATETIME = "0000" ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HH:MI:SS") == 0 )
         {
            AV12W_CNV_DATETIME = "00:00:00" ;
         }
         else if ( GXutil.strcmp(AV14P_STYLE, "HH:MI") == 0 )
         {
            AV12W_CNV_DATETIME = "00:00" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a802_pc02_datetime_edit.this.AV12W_CNV_DATETIME;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12W_CNV_DATETIME = "" ;
      AV16W_YY = "" ;
      AV11W_MM = "" ;
      AV8W_DD = "" ;
      AV9W_HH = "" ;
      AV10W_MI = "" ;
      AV15W_SS = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV16W_YY ;
   private String AV11W_MM ;
   private String AV8W_DD ;
   private String AV9W_HH ;
   private String AV10W_MI ;
   private String AV15W_SS ;
   private java.util.Date AV13P_DATETIME ;
   private String AV14P_STYLE ;
   private String AV12W_CNV_DATETIME ;
   private String[] aP2 ;
}

