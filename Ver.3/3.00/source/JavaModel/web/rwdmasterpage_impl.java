/*
               File: rwdmasterpage_impl
        Description: Responsive Master Page
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:26.3
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class rwdmasterpage_impl extends GXMasterPage
{
   public rwdmasterpage_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public rwdmasterpage_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rwdmasterpage_impl.class ));
   }

   public rwdmasterpage_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa042( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws042( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we042( ) ;
            }
         }
      }
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      getDataAreaObject().renderHtmlHeaders();
   }

   public void renderHtmlOpenForm( )
   {
      getDataAreaObject().renderHtmlOpenForm();
   }

   public void renderHtmlCloseForm042( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "FORM_MPAGE_Caption", GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption()));
      getDataAreaObject().renderHtmlCloseForm();
      if ( ! ( WebComp_Wcrecentlinks == null ) )
      {
         WebComp_Wcrecentlinks.componentjscripts();
      }
      httpContext.AddJavascriptSource("rwdmasterpage.js", "?20207151322264");
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "RwdMasterPage" ;
   }

   public String getPgmdesc( )
   {
      return "Responsive Master Page" ;
   }

   public void wb040( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         renderHtmlHeaders( ) ;
         renderHtmlOpenForm( ) ;
         if ( ! ShowMPWhenPopUp( ) && httpContext.isPopUpObject( ) )
         {
            /* Content placeholder */
            httpContext.writeText( "<div") ;
            GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
            httpContext.writeText( ">") ;
            getDataAreaObject().renderHtmlContent();
            httpContext.writeText( "</div>") ;
            return  ;
         }
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", " "+"data-abstract-form"+" ");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "MainContainer", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divHeader_Internalname, 1, 0, "px", 0, "px", "ContainerFluid HeaderContainer", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-10", "");
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblApplicationheader_Internalname, "Application Name", "", "", lblApplicationheader_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockHeader", 0, "", 1, 1, (short)(0), "HLP_RwdMasterPage.htm");
         httpContext.writeText( "</div>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-2", "");
         /* Static images/pictures */
         ClassString = "PoweredBy" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "d4b5891b-4373-4ea4-8a97-68b77a0ce14c", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_RwdMasterPage.htm");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divRecent_Internalname, 1, 0, "px", 0, "px", "ContainerFluid RecentLinksContainer", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-12", "");
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "MPW0017"+"", GXutil.rtrim( WebComp_Wcrecentlinks_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpMPW0017"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpMPW0017"+"");
            }
            WebComp_Wcrecentlinks.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divContent_Internalname, 1, 0, "px", 0, "px", "BodyContainer", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "");
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-12", "");
         /* Content placeholder */
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
         httpContext.writeText( ">") ;
         getDataAreaObject().renderHtmlContent();
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</div>") ;
      }
      wbLoad = true ;
   }

   public void start042( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         OldWcrecentlinks = httpContext.cgiGet( "MPW0017") ;
         if ( (GXutil.strcmp("", WebComp_Wcrecentlinks_Component)==0) && ! (GXutil.strcmp("", OldWcrecentlinks)==0) )
         {
            WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
            WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
            WebComp_Wcrecentlinks.componentrestorestate("MPW0017", "");
         }
      }
      wbErr = false ;
      strup040( ) ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( getDataAreaObject().executeStartEvent() != 0 )
         {
            httpContext.setAjaxCallMode();
         }
      }
   }

   public void ws042( )
   {
      start042( ) ;
      evt042( ) ;
   }

   public void evt042( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            sEvt = httpContext.cgiGet( "_EventName") ;
            EvtGridId = httpContext.cgiGet( "_EventGridId") ;
            EvtRowId = httpContext.cgiGet( "_EventRowId") ;
            if ( GXutil.len( sEvt) > 0 )
            {
               sEvtType = GXutil.left( sEvt, 1) ;
               sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "RFR_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "START_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e11042 */
                        e11042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12042 */
                        e12042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13042 */
                        e13042 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        if ( ! wbErr )
                        {
                           Rfr0gs = false ;
                           if ( ! Rfr0gs )
                           {
                           }
                           dynload_actions( ) ;
                        }
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        dynload_actions( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               else if ( GXutil.strcmp(sEvtType, "M") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, GXutil.len( sEvt)-2) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-6) ;
                  nCmpId = (short)(GXutil.lval( sEvtType)) ;
                  if ( nCmpId == 17 )
                  {
                     OldWcrecentlinks = httpContext.cgiGet( "MPW0017") ;
                     if ( ( GXutil.len( OldWcrecentlinks) == 0 ) || ( GXutil.strcmp(OldWcrecentlinks, WebComp_Wcrecentlinks_Component) != 0 ) )
                     {
                        WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
                        WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
                     }
                     if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
                     {
                        WebComp_Wcrecentlinks.componentprocess("MPW0017", "", sEvt);
                     }
                     WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
                  }
               }
               if ( httpContext.wbHandled == 0 )
               {
                  getDataAreaObject().dispatchEvents();
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void we042( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm042( ) ;
         }
      }
   }

   public void pa042( )
   {
      if ( nDonePA == 0 )
      {
         GXKey = context.getSiteKey( ) ;
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void refresh( )
   {
      rf042( ) ;
      /* End function Refresh */
   }

   public void rf042( )
   {
      /* Execute user event: e12042 */
      e12042 ();
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
            {
               WebComp_Wcrecentlinks.componentstart();
            }
         }
      }
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: e13042 */
         e13042 ();
         wb040( ) ;
      }
   }

   public void strup040( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11042 */
      e11042 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         OldWcrecentlinks = httpContext.cgiGet( "MPW0017") ;
         if ( (GXutil.strcmp("", WebComp_Wcrecentlinks_Component)==0) && ! (GXutil.strcmp("", OldWcrecentlinks)==0) )
         {
            WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
            WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
            WebComp_Wcrecentlinks.componentrestorestate("MPW0017", "");
         }
         (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setCaption( httpContext.cgiGet( "FORM_MPAGE_Caption") );
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = context.getSiteKey( ) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: e11042 */
      e11042 ();
      if (returnInSub) return;
   }

   public void e11042( )
   {
      /* Start Routine */
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("viewport", "width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;", (short)(0)) ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getMeta().addItem("apple-mobile-web-app-capable", "yes", (short)(0)) ;
   }

   public void e12042( )
   {
      /* Refresh Routine */
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecentlinks_Component), GXutil.lower( "RwdRecentLinks")) != 0 )
      {
         WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "rwdrecentlinks_impl", remoteHandle, context);
         WebComp_Wcrecentlinks_Component = "RwdRecentLinks" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
      {
         WebComp_Wcrecentlinks.setjustcreated();
      }
      if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
      {
         WebComp_Wcrecentlinks.componentprepare(new Object[] {"MPW0017","",(getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption(),Contentholder.getPgmname()});
         WebComp_Wcrecentlinks.componentbind(new Object[] {"",""});
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e13042( )
   {
      /* Load Routine */
   }

   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      pa042( ) ;
      ws042( ) ;
      we042( ) ;
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      return ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString();
   }

   public void responsestatic( String sGXDynURL )
   {
   }

   public void master_styles( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      if ( ! ( WebComp_Wcrecentlinks == null ) )
      {
         if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
         {
            WebComp_Wcrecentlinks.componentthemes();
         }
      }
      idxLst = 1 ;
      while ( idxLst <= (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?202071513222614");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("rwdmasterpage.js", "?202071513222614");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblApplicationheader_Internalname = "APPLICATIONHEADER_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      imgImage1_Internalname = "IMAGE1_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      divHeader_Internalname = "HEADER_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      divRecent_Internalname = "RECENT_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      divContent_Internalname = "CONTENT_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      divMaintable_Internalname = "MAINTABLE_MPAGE" ;
      div_Internalname = "_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      Contentholder.setDataArea(getDataAreaObject());
   }

   protected boolean isSpaSupported( )
   {
      return false ;
   }

   public void initializeDynEvents( )
   {
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Contentholder = new com.genexus.webpanels.GXDataAreaControl();
      Form = new com.genexus.webpanels.GXWebForm();
      sPrefix = "" ;
      lblApplicationheader_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      WebComp_Wcrecentlinks_Component = "" ;
      OldWcrecentlinks = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXKey = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sDynURL = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wcrecentlinks = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GxWebError ;
   private byte nDonePA ;
   private byte nGotPars ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short nCmpId ;
   private short Gx_err ;
   private int idxLst ;
   private String sPrefix ;
   private String divMaintable_Internalname ;
   private String divHeader_Internalname ;
   private String lblApplicationheader_Internalname ;
   private String lblApplicationheader_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String imgImage1_Internalname ;
   private String divRecent_Internalname ;
   private String WebComp_Wcrecentlinks_Component ;
   private String OldWcrecentlinks ;
   private String divContent_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXKey ;
   private String sDynURL ;
   private String div_Internalname ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean returnInSub ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcrecentlinks ;
   private com.genexus.webpanels.GXDataAreaControl Contentholder ;
   private com.genexus.webpanels.GXWebForm Form ;
}

