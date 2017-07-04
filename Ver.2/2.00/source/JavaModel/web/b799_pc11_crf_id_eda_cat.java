/*
               File: B799_PC11_CRF_ID_EDA_CAT
        Description: CRFID+CRFé}î‘åãçáèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:42.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc11_crf_id_eda_cat extends GXProcedure
{
   public b799_pc11_crf_id_eda_cat( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc11_crf_id_eda_cat.class ), "" );
   }

   public b799_pc11_crf_id_eda_cat( int remoteHandle ,
                                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( short aP0 ,
                             byte aP1 )
   {
      b799_pc11_crf_id_eda_cat.this.AV9P_CRF_ID = aP0;
      b799_pc11_crf_id_eda_cat.this.AV10P_CRF_EDA_NO = aP1;
      b799_pc11_crf_id_eda_cat.this.aP2 = aP2;
      b799_pc11_crf_id_eda_cat.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( short aP0 ,
                        byte aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( short aP0 ,
                             byte aP1 ,
                             String[] aP2 )
   {
      b799_pc11_crf_id_eda_cat.this.AV9P_CRF_ID = aP0;
      b799_pc11_crf_id_eda_cat.this.AV10P_CRF_EDA_NO = aP1;
      b799_pc11_crf_id_eda_cat.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8W_CRF_ID_EDA_NO = "" ;
      AV8W_CRF_ID_EDA_NO = GXutil.trim( GXutil.str( AV9P_CRF_ID, 10, 0)) + "_" + GXutil.trim( GXutil.str( AV10P_CRF_EDA_NO, 10, 0)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = b799_pc11_crf_id_eda_cat.this.AV8W_CRF_ID_EDA_NO;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8W_CRF_ID_EDA_NO = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10P_CRF_EDA_NO ;
   private short AV9P_CRF_ID ;
   private short Gx_err ;
   private String AV8W_CRF_ID_EDA_NO ;
   private String[] aP2 ;
}

