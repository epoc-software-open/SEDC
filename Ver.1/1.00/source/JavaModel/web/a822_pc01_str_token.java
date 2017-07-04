/*
               File: A822_PC01_STR_TOKEN
        Description: トークン切り出し処理
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:48.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a822_pc01_str_token extends GXProcedure
{
   public a822_pc01_str_token( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a822_pc01_str_token.class ), "" );
   }

   public a822_pc01_str_token( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           String aP1 ,
                           short aP2 ,
                           String[] aP3 )
   {
      a822_pc01_str_token.this.AV11P_STRING = aP0;
      a822_pc01_str_token.this.AV8P_DELIMIT = aP1;
      a822_pc01_str_token.this.AV10P_POS = aP2;
      a822_pc01_str_token.this.aP4 = new byte[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short aP2 ,
                        String[] aP3 ,
                        byte[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      a822_pc01_str_token.this.AV11P_STRING = aP0;
      a822_pc01_str_token.this.AV8P_DELIMIT = aP1;
      a822_pc01_str_token.this.AV10P_POS = aP2;
      a822_pc01_str_token.this.aP3 = aP3;
      a822_pc01_str_token.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9P_OUT_STRING = "" ;
      AV16W_RTN_CD = (byte)(0) ;
      AV18W_DELIMIT_LEN = (short)(GXutil.len( AV8P_DELIMIT)) ;
      if ( GXutil.strcmp(AV11P_STRING, "") == 0 )
      {
         AV16W_RTN_CD = (byte)(9) ;
         returnInSub = true;
         cleanup();
         if (true) return;
      }
      AV17W_START_POS = (short)(1) ;
      AV13W_END_CNT = (short)(AV10P_POS-1) ;
      AV13W_END_CNT = (short)(AV10P_POS-1) ;
      AV12W_CNT = (short)(1) ;
      while ( AV12W_CNT <= AV13W_END_CNT )
      {
         if ( GXutil.strcmp(GXutil.substring( AV11P_STRING, AV17W_START_POS, 1), AV8P_DELIMIT) == 0 )
         {
            AV17W_START_POS = (short)(AV17W_START_POS+1) ;
         }
         else
         {
            AV17W_START_POS = (short)(GXutil.strSearch( AV11P_STRING, AV8P_DELIMIT, AV17W_START_POS)) ;
            if ( AV17W_START_POS == 0 )
            {
               if (true) break;
            }
            AV17W_START_POS = (short)(AV17W_START_POS+AV18W_DELIMIT_LEN) ;
         }
         AV12W_CNT = (short)(AV12W_CNT+1) ;
      }
      if ( AV17W_START_POS == 0 )
      {
         AV16W_RTN_CD = (byte)(9) ;
      }
      else
      {
         if ( GXutil.strcmp(GXutil.substring( AV11P_STRING, AV17W_START_POS, 1), AV8P_DELIMIT) == 0 )
         {
            AV9P_OUT_STRING = "" ;
         }
         else
         {
            AV14W_END_POS = (short)(GXutil.strSearch( AV11P_STRING, AV8P_DELIMIT, AV17W_START_POS)) ;
            if ( AV14W_END_POS == 0 )
            {
               AV15W_LEN = (short)((GXutil.len( AV11P_STRING)-AV17W_START_POS)+1) ;
               AV16W_RTN_CD = (byte)(1) ;
            }
            else
            {
               AV15W_LEN = (short)(AV14W_END_POS-AV17W_START_POS) ;
            }
            AV9P_OUT_STRING = GXutil.substring( AV11P_STRING, AV17W_START_POS, AV15W_LEN) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = a822_pc01_str_token.this.AV9P_OUT_STRING;
      this.aP4[0] = a822_pc01_str_token.this.AV16W_RTN_CD;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9P_OUT_STRING = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV16W_RTN_CD ;
   private short AV10P_POS ;
   private short AV18W_DELIMIT_LEN ;
   private short AV17W_START_POS ;
   private short AV13W_END_CNT ;
   private short AV12W_CNT ;
   private short AV14W_END_POS ;
   private short AV15W_LEN ;
   private short Gx_err ;
   private boolean returnInSub ;
   private String AV11P_STRING ;
   private String AV8P_DELIMIT ;
   private String AV9P_OUT_STRING ;
   private String[] aP3 ;
   private byte[] aP4 ;
}

