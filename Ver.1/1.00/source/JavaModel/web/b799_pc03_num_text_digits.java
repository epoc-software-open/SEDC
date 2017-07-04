/*
               File: B799_PC03_NUM_TEXT_DIGITS
        Description: êîílï∂éöóÒåÖêîéÊìæèàóù
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:12.31
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc03_num_text_digits extends GXProcedure
{
   public b799_pc03_num_text_digits( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc03_num_text_digits.class ), "" );
   }

   public b799_pc03_num_text_digits( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( String aP0 ,
                            short[] aP1 )
   {
      b799_pc03_num_text_digits.this.AV8P_NUM_STR = aP0;
      b799_pc03_num_text_digits.this.aP2 = new short[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short[] aP1 ,
                        short[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short[] aP1 ,
                             short[] aP2 )
   {
      b799_pc03_num_text_digits.this.AV8P_NUM_STR = aP0;
      b799_pc03_num_text_digits.this.aP1 = aP1;
      b799_pc03_num_text_digits.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_POSTIVE_DIGITS = (short)(0) ;
      AV9W_DECIMAL_DIGITS = (short)(0) ;
      AV11W_NUM_STR = GXutil.strReplace( AV8P_NUM_STR, ",", "") ;
      if ( ! (GXutil.strcmp("", AV11W_NUM_STR)==0) )
      {
         AV12W_LNG = GXutil.len( AV11W_NUM_STR) ;
         AV13W_POS = GXutil.strSearch( AV11W_NUM_STR, ".", 1) ;
         if ( AV13W_POS == 0 )
         {
            AV10W_POSTIVE_DIGITS = (short)(AV12W_LNG) ;
            AV9W_DECIMAL_DIGITS = (short)(0) ;
         }
         else
         {
            AV10W_POSTIVE_DIGITS = (short)(AV13W_POS-1) ;
            AV9W_DECIMAL_DIGITS = (short)(AV12W_LNG-AV13W_POS) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b799_pc03_num_text_digits.this.AV10W_POSTIVE_DIGITS;
      this.aP2[0] = b799_pc03_num_text_digits.this.AV9W_DECIMAL_DIGITS;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_NUM_STR = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10W_POSTIVE_DIGITS ;
   private short AV9W_DECIMAL_DIGITS ;
   private short Gx_err ;
   private long AV12W_LNG ;
   private long AV13W_POS ;
   private String AV8P_NUM_STR ;
   private String AV11W_NUM_STR ;
   private short[] aP1 ;
   private short[] aP2 ;
}

