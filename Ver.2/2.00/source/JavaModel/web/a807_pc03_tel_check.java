/*
               File: A807_PC03_TEL_CHECK
        Description: 電話番号チェック処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:45.37
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a807_pc03_tel_check extends GXProcedure
{
   public a807_pc03_tel_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a807_pc03_tel_check.class ), "" );
   }

   public a807_pc03_tel_check( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 )
   {
      a807_pc03_tel_check.this.AV13P_CHAR = aP0;
      a807_pc03_tel_check.this.aP1 = aP1;
      a807_pc03_tel_check.this.aP1 = new byte[] {0};
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
      a807_pc03_tel_check.this.AV13P_CHAR = aP0;
      a807_pc03_tel_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14W_RTN_CD = (byte)(9) ;
      if ( GxRegex.IsMatch(AV13P_CHAR,"[0-9]{2,4}-[0-9]{2,4}-[0-9]{4}") )
      {
         AV14W_RTN_CD = (byte)(0) ;
      }
      else
      {
         AV14W_RTN_CD = (byte)(9) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a807_pc03_tel_check.this.AV14W_RTN_CD;
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

   private byte AV14W_RTN_CD ;
   private short Gx_err ;
   private String AV13P_CHAR ;
   private byte[] aP1 ;
}

