/*
               File: A802_PC03_DATE_EDIT
        Description: ì˙ïtï“èWèàóùÇRÅiï∂éöå^Å®ì˙ïtå^Ç÷Åj
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a802_pc03_date_edit extends GXProcedure
{
   public a802_pc03_date_edit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a802_pc03_date_edit.class ), "" );
   }

   public a802_pc03_date_edit( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public java.util.Date executeUdp( String aP0 )
   {
      a802_pc03_date_edit.this.AV8P_DATE_CHR = aP0;
      a802_pc03_date_edit.this.aP1 = aP1;
      a802_pc03_date_edit.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
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
      a802_pc03_date_edit.this.AV8P_DATE_CHR = aP0;
      a802_pc03_date_edit.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      if ( ! (GXutil.strcmp("", AV8P_DATE_CHR)==0) )
      {
         AV9W_DATE_DATE = localUtil.ymdtod( (int)(GXutil.val( GXutil.substring( AV8P_DATE_CHR, 1, 4), ".")), (int)(GXutil.val( GXutil.substring( AV8P_DATE_CHR, 5, 2), ".")), (int)(GXutil.val( GXutil.substring( AV8P_DATE_CHR, 7, 2), "."))) ;
      }
      else
      {
         AV9W_DATE_DATE = GXutil.nullDate() ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = a802_pc03_date_edit.this.AV9W_DATE_DATE;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_DATE_DATE = GXutil.nullDate() ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private java.util.Date AV9W_DATE_DATE ;
   private String AV8P_DATE_CHR ;
   private java.util.Date[] aP1 ;
}

