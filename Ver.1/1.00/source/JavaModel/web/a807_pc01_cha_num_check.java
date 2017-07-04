/*
               File: A807_PC01_CHA_NUM_CHECK
        Description: îºäpâpêîéöÉ`ÉFÉbÉNèàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:44.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a807_pc01_cha_num_check extends GXProcedure
{
   public a807_pc01_cha_num_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a807_pc01_cha_num_check.class ), "" );
   }

   public a807_pc01_cha_num_check( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 )
   {
      a807_pc01_cha_num_check.this.AV8P_CHAR = aP0;
      a807_pc01_cha_num_check.this.aP1 = new byte[] {0};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        byte[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             byte[] aP1 )
   {
      a807_pc01_cha_num_check.this.AV8P_CHAR = aP0;
      a807_pc01_cha_num_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_RTN_CD = (byte)(9) ;
      AV9W_FLG_NUM = (byte)(0) ;
      if ( GxRegex.IsMatch(AV8P_CHAR,"[^a-zA-Z0-9]") )
      {
         AV10W_RTN_CD = (byte)(9) ;
      }
      else
      {
         AV10W_RTN_CD = (byte)(0) ;
      }
      if ( AV10W_RTN_CD == 0 )
      {
         if ( GxRegex.IsMatch(AV8P_CHAR,"[^0-9]") )
         {
            AV10W_RTN_CD = (byte)(0) ;
         }
         else
         {
            AV9W_FLG_NUM = (byte)(1) ;
         }
      }
      if ( ( AV10W_RTN_CD == 0 ) && ( AV9W_FLG_NUM == 1 ) )
      {
         AV10W_RTN_CD = (byte)(1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a807_pc01_cha_num_check.this.AV10W_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10W_RTN_CD ;
   private byte AV9W_FLG_NUM ;
   private short Gx_err ;
   private String AV8P_CHAR ;
   private byte[] aP1 ;
}

