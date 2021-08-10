/*
               File: A807_PC04_POSTAL_CHECK
        Description: �X�֔ԍ��`�F�b�N����
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:15.23
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a807_pc04_postal_check extends GXProcedure
{
   public a807_pc04_postal_check( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a807_pc04_postal_check.class ), "" );
   }

   public a807_pc04_postal_check( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 )
   {
      a807_pc04_postal_check.this.AV8P_CHAR = aP0;
      a807_pc04_postal_check.this.aP1 = aP1;
      a807_pc04_postal_check.this.aP1 = new byte[] {0};
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
      a807_pc04_postal_check.this.AV8P_CHAR = aP0;
      a807_pc04_postal_check.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV14W_RTN_CD = (byte)(9) ;
      if ( GxRegex.IsMatch(AV8P_CHAR,"[0-9]{3}-[0-9]{4}") )
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
      this.aP1[0] = a807_pc04_postal_check.this.AV14W_RTN_CD;
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
   private String AV8P_CHAR ;
   private byte[] aP1 ;
}

