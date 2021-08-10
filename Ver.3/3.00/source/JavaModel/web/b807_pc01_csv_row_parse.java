/*
               File: B807_PC01_CSV_ROW_PARSE
        Description: CSVÉåÉRÅ[Éhï™â
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:29.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class b807_pc01_csv_row_parse extends GXProcedure
{
   public b807_pc01_csv_row_parse( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( b807_pc01_csv_row_parse.class ), "" );
   }

   public b807_pc01_csv_row_parse( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public GxObjectCollection executeUdp( String aP0 )
   {
      b807_pc01_csv_row_parse.this.AV9P_CSV = aP0;
      b807_pc01_csv_row_parse.this.aP1 = aP1;
      b807_pc01_csv_row_parse.this.aP1 = new GxObjectCollection[] {new GxObjectCollection()};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        GxObjectCollection[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             GxObjectCollection[] aP1 )
   {
      b807_pc01_csv_row_parse.this.AV9P_CSV = aP0;
      b807_pc01_csv_row_parse.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8C_TAM02_APP_ID = "B807" ;
      GXt_char1 = AV11W_STR ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(3), GXv_char2) ;
      b807_pc01_csv_row_parse.this.GXt_char1 = GXv_char2[0] ;
      GXt_char3 = AV11W_STR ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char4) ;
      b807_pc01_csv_row_parse.this.GXt_char3 = GXv_char4[0] ;
      AV11W_STR = GXutil.strReplace( AV9P_CSV, GXt_char1, GXt_char3) ;
      GXt_char3 = AV11W_STR ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(2), GXv_char4) ;
      b807_pc01_csv_row_parse.this.GXt_char3 = GXv_char4[0] ;
      GXt_char1 = AV11W_STR ;
      GXv_char2[0] = GXt_char1 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char2) ;
      b807_pc01_csv_row_parse.this.GXt_char1 = GXv_char2[0] ;
      AV11W_STR = GXutil.strReplace( AV11W_STR, GXt_char3, GXt_char1) ;
      GXt_char3 = "" ;
      GXv_char4[0] = GXt_char3 ;
      new b802_pc01_new_line(remoteHandle, context).execute( (byte)(1), GXv_char4) ;
      b807_pc01_csv_row_parse.this.GXt_char3 = GXv_char4[0] ;
      AV10W_CSV_ROW = new GxObjectCollection(String.class, "internal", "", GxRegex.Split(AV11W_STR,GXt_char3)) ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = b807_pc01_csv_row_parse.this.AV10W_CSV_ROW;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_CSV_ROW = new GxObjectCollection(String.class, "internal", "");
      AV8C_TAM02_APP_ID = "" ;
      AV11W_STR = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      GXt_char3 = "" ;
      GXv_char4 = new String [1] ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV9P_CSV ;
   private String AV8C_TAM02_APP_ID ;
   private String AV11W_STR ;
   private GxObjectCollection[] aP1 ;
   private GxObjectCollection AV10W_CSV_ROW ;
}

