/*
               File: B799_PC12_CRF_ID_EDA_SPLIT
        Description: CRFID+CRFé}î‘ï™äÑèàóù
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:42.83
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b799_pc12_crf_id_eda_split extends GXProcedure
{
   public b799_pc12_crf_id_eda_split( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b799_pc12_crf_id_eda_split.class ), "" );
   }

   public b799_pc12_crf_id_eda_split( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public byte executeUdp( String aP0 ,
                           short[] aP1 )
   {
      b799_pc12_crf_id_eda_split.this.AV8P_CRF_ID_EDA_NO = aP0;
      b799_pc12_crf_id_eda_split.this.aP1 = aP1;
      b799_pc12_crf_id_eda_split.this.aP2 = aP2;
      b799_pc12_crf_id_eda_split.this.aP2 = new byte[] {0};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        short[] aP1 ,
                        byte[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             short[] aP1 ,
                             byte[] aP2 )
   {
      b799_pc12_crf_id_eda_split.this.AV8P_CRF_ID_EDA_NO = aP0;
      b799_pc12_crf_id_eda_split.this.aP1 = aP1;
      b799_pc12_crf_id_eda_split.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9W_CRF_ID = (short)(0) ;
      AV10W_CRF_EDA_NO = (byte)(0) ;
      AV11W_STR = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV8P_CRF_ID_EDA_NO,"_")) ;
      if ( AV11W_STR.size() == 2 )
      {
         AV9W_CRF_ID = (short)(GXutil.lval( GXutil.trim( (String)AV11W_STR.elementAt(-1+1)))) ;
         AV10W_CRF_EDA_NO = (byte)(GXutil.lval( GXutil.trim( (String)AV11W_STR.elementAt(-1+2)))) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b799_pc12_crf_id_eda_split.this.AV9W_CRF_ID;
      this.aP2[0] = b799_pc12_crf_id_eda_split.this.AV10W_CRF_EDA_NO;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11W_STR = new GxObjectCollection(String.class, "internal", "");
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV10W_CRF_EDA_NO ;
   private short AV9W_CRF_ID ;
   private short Gx_err ;
   private String AV8P_CRF_ID_EDA_NO ;
   private short[] aP1 ;
   private byte[] aP2 ;
   private GxObjectCollection AV11W_STR ;
}

