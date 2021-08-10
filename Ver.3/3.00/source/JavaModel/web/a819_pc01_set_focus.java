/*
               File: A819_PC01_SET_FOCUS
        Description: フォーカスセット処理
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:16:15.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a819_pc01_set_focus extends GXProcedure
{
   public a819_pc01_set_focus( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a819_pc01_set_focus.class ), "" );
   }

   public a819_pc01_set_focus( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 )
   {
      a819_pc01_set_focus.this.AV8P_INTERNAL_NM = aP0;
      a819_pc01_set_focus.this.AV10P_TYPE = aP1;
      a819_pc01_set_focus.this.aP2 = aP2;
      a819_pc01_set_focus.this.aP2 = new String[] {""};
      initialize();
      privateExecute();
      return aP2[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String[] aP2 )
   {
      a819_pc01_set_focus.this.AV8P_INTERNAL_NM = aP0;
      a819_pc01_set_focus.this.AV10P_TYPE = aP1;
      a819_pc01_set_focus.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9W_JS = "" ;
      if ( ! (GXutil.strcmp("", AV8P_INTERNAL_NM)==0) )
      {
         if ( GXutil.strcmp(AV10P_TYPE, "0") == 0 )
         {
            AV9W_JS = "document.getElementById('" + GXutil.trim( AV8P_INTERNAL_NM) + "').focus();" ;
         }
         else if ( GXutil.strcmp(AV10P_TYPE, "1") == 0 )
         {
            AV9W_JS = "document.getElementById('" + GXutil.trim( AV8P_INTERNAL_NM) + "').firstChild.focus();" ;
         }
         else
         {
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = a819_pc01_set_focus.this.AV9W_JS;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9W_JS = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8P_INTERNAL_NM ;
   private String AV10P_TYPE ;
   private String AV9W_JS ;
   private String[] aP2 ;
}

