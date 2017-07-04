/*
               File: A808_PC01_PAGE_COMP
        Description: ページ計算処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:12:44.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a808_pc01_page_comp extends GXProcedure
{
   public a808_pc01_page_comp( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a808_pc01_page_comp.class ), "" );
   }

   public a808_pc01_page_comp( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public short executeUdp( short aP0 ,
                            short aP1 ,
                            int aP2 ,
                            short aP3 )
   {
      a808_pc01_page_comp.this.AV8P_PAGE_COUNT = aP0;
      a808_pc01_page_comp.this.AV9P_PAGE_MAX = aP1;
      a808_pc01_page_comp.this.AV10P_REC_COUNT = aP2;
      a808_pc01_page_comp.this.AV12P_ROW_MAX = aP3;
      a808_pc01_page_comp.this.aP4 = aP4;
      a808_pc01_page_comp.this.aP4 = new short[] {0};
      initialize();
      privateExecute();
      return aP4[0];
   }

   public void execute( short aP0 ,
                        short aP1 ,
                        int aP2 ,
                        short aP3 ,
                        short[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( short aP0 ,
                             short aP1 ,
                             int aP2 ,
                             short aP3 ,
                             short[] aP4 )
   {
      a808_pc01_page_comp.this.AV8P_PAGE_COUNT = aP0;
      a808_pc01_page_comp.this.AV9P_PAGE_MAX = aP1;
      a808_pc01_page_comp.this.AV10P_REC_COUNT = aP2;
      a808_pc01_page_comp.this.AV12P_ROW_MAX = aP3;
      a808_pc01_page_comp.this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV11W_ROW_COUNT = (short)(0) ;
      if ( AV8P_PAGE_COUNT == AV9P_PAGE_MAX )
      {
         AV11W_ROW_COUNT = (short)(AV10P_REC_COUNT-(AV8P_PAGE_COUNT-1)*AV12P_ROW_MAX) ;
      }
      else
      {
         AV11W_ROW_COUNT = AV12P_ROW_MAX ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP4[0] = a808_pc01_page_comp.this.AV11W_ROW_COUNT;
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

   private short AV8P_PAGE_COUNT ;
   private short AV9P_PAGE_MAX ;
   private short AV12P_ROW_MAX ;
   private short AV11W_ROW_COUNT ;
   private short Gx_err ;
   private int AV10P_REC_COUNT ;
   private short[] aP4 ;
}

