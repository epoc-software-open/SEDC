/*
               File: B807_PC03_CSV_COL_PARSE
        Description: CSVƒJƒ‰ƒ€•ª‰ð
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:6.80
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b807_pc03_csv_col_parse extends GXProcedure
{
   public b807_pc03_csv_col_parse( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b807_pc03_csv_col_parse.class ), "" );
   }

   public b807_pc03_csv_col_parse( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 )
   {
      b807_pc03_csv_col_parse.this.AV10P_CSV = aP0;
      b807_pc03_csv_col_parse.this.AV9P_COL_NUM = aP1;
      b807_pc03_csv_col_parse.this.AV11P_CSV_NAME = aP2;
      b807_pc03_csv_col_parse.this.aP3 = aP3;
      b807_pc03_csv_col_parse.this.aP4 = aP4;
      b807_pc03_csv_col_parse.this.aP5 = aP5;
      b807_pc03_csv_col_parse.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        long aP1 ,
                        String aP2 ,
                        GxObjectCollection[] aP3 ,
                        short[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             long aP1 ,
                             String aP2 ,
                             GxObjectCollection[] aP3 ,
                             short[] aP4 ,
                             String[] aP5 )
   {
      b807_pc03_csv_col_parse.this.AV10P_CSV = aP0;
      b807_pc03_csv_col_parse.this.AV9P_COL_NUM = aP1;
      b807_pc03_csv_col_parse.this.AV11P_CSV_NAME = aP2;
      b807_pc03_csv_col_parse.this.aP3 = aP3;
      b807_pc03_csv_col_parse.this.aP4 = aP4;
      b807_pc03_csv_col_parse.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_APP_ID = "B807" ;
      AV15W_RTN_CD = (short)(0) ;
      AV16W_RTN_MSG = "" ;
      AV12W_CSV = AV10P_CSV + " " ;
      AV13W_CSV_COL = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV12W_CSV,",")) ;
      AV14W_RAW_STR.clear();
      AV20GXV1 = 1 ;
      while ( AV20GXV1 <= AV13W_CSV_COL.size() )
      {
         AV17W_STR = (String)AV13W_CSV_COL.elementAt(-1+AV20GXV1) ;
         AV14W_RAW_STR.add(GXutil.trim( AV17W_STR), 0);
         AV20GXV1 = (int)(AV20GXV1+1) ;
      }
      if ( AV9P_COL_NUM > 0 )
      {
         if ( AV14W_RAW_STR.size() != AV9P_COL_NUM )
         {
            AV15W_RTN_CD = (short)(1) ;
            GXt_char1 = AV16W_RTN_MSG ;
            GXv_char2[0] = GXt_char1 ;
            new a805_pc01_msg_get(remoteHandle, context).execute( "AE00026", AV11P_CSV_NAME, "", "", "", "", GXv_char2) ;
            b807_pc03_csv_col_parse.this.GXt_char1 = GXv_char2[0] ;
            AV16W_RTN_MSG = GXt_char1 ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = b807_pc03_csv_col_parse.this.AV14W_RAW_STR;
      this.aP4[0] = b807_pc03_csv_col_parse.this.AV15W_RTN_CD;
      this.aP5[0] = b807_pc03_csv_col_parse.this.AV16W_RTN_MSG;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV14W_RAW_STR = new GxObjectCollection(String.class, "internal", "");
      AV16W_RTN_MSG = "" ;
      AV8C_APP_ID = "" ;
      AV12W_CSV = "" ;
      AV13W_CSV_COL = new GxObjectCollection(String.class, "internal", "");
      AV17W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV15W_RTN_CD ;
   private short Gx_err ;
   private int AV20GXV1 ;
   private long AV9P_COL_NUM ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV10P_CSV ;
   private String AV11P_CSV_NAME ;
   private String AV16W_RTN_MSG ;
   private String AV8C_APP_ID ;
   private String AV12W_CSV ;
   private String AV17W_STR ;
   private GxObjectCollection[] aP3 ;
   private short[] aP4 ;
   private String[] aP5 ;
   private GxObjectCollection AV14W_RAW_STR ;
   private GxObjectCollection AV13W_CSV_COL ;
}

