/*
               File: A821_PC01_MSGBOX
        Description: 確認メッセージScript生成
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:51:45.60
       Program type: Callable routine
          Main DBMS: mysql
*/
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.distributed.*;
import com.genexus.search.*;

public final  class a821_pc01_msgbox extends GXProcedure
{
   public a821_pc01_msgbox( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( a821_pc01_msgbox.class ), "" );
   }

   public a821_pc01_msgbox( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 )
   {
      a821_pc01_msgbox.this.AV8P_BOXTYPE = aP0;
      a821_pc01_msgbox.this.AV11P_MSG = aP1;
      a821_pc01_msgbox.this.AV9P_FORCUS_ITEM = aP2;
      a821_pc01_msgbox.this.AV13P_OK_EVENT = aP3;
      a821_pc01_msgbox.this.AV12P_NG_EVENT = aP4;
      a821_pc01_msgbox.this.aP5 = new String[] {""};
      initialize();
      privateExecute();
      return aP5[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        String aP2 ,
                        String aP3 ,
                        String aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             String aP2 ,
                             String aP3 ,
                             String aP4 ,
                             String[] aP5 )
   {
      a821_pc01_msgbox.this.AV8P_BOXTYPE = aP0;
      a821_pc01_msgbox.this.AV11P_MSG = aP1;
      a821_pc01_msgbox.this.AV9P_FORCUS_ITEM = aP2;
      a821_pc01_msgbox.this.AV13P_OK_EVENT = aP3;
      a821_pc01_msgbox.this.AV12P_NG_EVENT = aP4;
      a821_pc01_msgbox.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10W_JS = "" ;
      if ( GXutil.strcmp(AV8P_BOXTYPE, "OK") == 0 )
      {
         if ( ! (GXutil.strcmp("", AV9P_FORCUS_ITEM)==0) )
         {
            AV10W_JS = AV10W_JS + " document.MAINFORM." ;
            AV10W_JS = AV10W_JS + AV9P_FORCUS_ITEM ;
            AV10W_JS = AV10W_JS + ".focus();" ;
         }
         AV10W_JS = AV10W_JS + " alert('" + GXutil.trim( AV11P_MSG) + "');" ;
         if ( ! (GXutil.strcmp("", AV13P_OK_EVENT)==0) )
         {
            AV10W_JS = AV10W_JS + " gx.evt.execEvt('E\\'" + GXutil.trim( AV13P_OK_EVENT) + "\\'.',this);" ;
         }
      }
      else if ( GXutil.strcmp(AV8P_BOXTYPE, "OK_CANCEL") == 0 )
      {
         if ( ! (GXutil.strcmp("", AV9P_FORCUS_ITEM)==0) )
         {
            AV10W_JS = AV10W_JS + " document.MAINFORM." ;
            AV10W_JS = AV10W_JS + AV9P_FORCUS_ITEM ;
            AV10W_JS = AV10W_JS + ".focus();" ;
         }
         AV10W_JS = AV10W_JS + " if(confirm('" + GXutil.trim( AV11P_MSG) + "')){" ;
         if ( ! (GXutil.strcmp("", AV13P_OK_EVENT)==0) )
         {
            AV10W_JS = AV10W_JS + " gx.evt.execEvt('E\\'" + GXutil.trim( AV13P_OK_EVENT) + "\\'.',this);" ;
         }
         AV10W_JS = AV10W_JS + " }" ;
         if ( ! (GXutil.strcmp("", AV12P_NG_EVENT)==0) )
         {
            AV10W_JS = AV10W_JS + " else{" ;
            AV10W_JS = AV10W_JS + " gx.evt.execEvt('E\\'" + GXutil.trim( AV12P_NG_EVENT) + "\\'.',this);" ;
            AV10W_JS = AV10W_JS + " }" ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP5[0] = a821_pc01_msgbox.this.AV10W_JS;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV10W_JS = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV8P_BOXTYPE ;
   private String AV11P_MSG ;
   private String AV9P_FORCUS_ITEM ;
   private String AV13P_OK_EVENT ;
   private String AV12P_NG_EVENT ;
   private String AV10W_JS ;
   private String[] aP5 ;
}

