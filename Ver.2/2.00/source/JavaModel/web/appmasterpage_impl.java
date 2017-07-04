/*
               File: appmasterpage_impl
        Description: Application Master Page
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:42.73
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class appmasterpage_impl extends GXMasterPage
{
   public appmasterpage_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public appmasterpage_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( appmasterpage_impl.class ));
   }

   public appmasterpage_impl( int remoteHandle ,
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
         pa012( ) ;
         if ( ! isAjaxCallMode( ) )
         {
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            ws012( ) ;
            if ( ! isAjaxCallMode( ) )
            {
               we012( ) ;
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

   public void renderHtmlCloseForm012( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "FORM_MPAGE_Caption", GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption()));
      getDataAreaObject().renderHtmlCloseForm();
      if ( ! ( WebComp_Wcrecentlinks == null ) )
      {
         WebComp_Wcrecentlinks.componentjscripts();
      }
      httpContext.AddJavascriptSource("appmasterpage.js", "?20177317164273");
      httpContext.writeTextNL( "</body>") ;
      httpContext.writeTextNL( "</html>") ;
   }

   public String getPgmname( )
   {
      return "AppMasterPage" ;
   }

   public String getPgmdesc( )
   {
      return "Application Master Page " ;
   }

   public void wb010( )
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
         wb_table1_2_012( true) ;
      }
      else
      {
         wb_table1_2_012( false) ;
      }
      return  ;
   }

   public void wb_table1_2_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "<p></p>") ;
      }
      wbLoad = true ;
   }

   public void start012( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         OldWcrecentlinks = httpContext.cgiGet( "MPW0034") ;
         if ( (GXutil.strcmp("", WebComp_Wcrecentlinks_Component)==0) && ! (GXutil.strcmp("", OldWcrecentlinks)==0) )
         {
            WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
            WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
            WebComp_Wcrecentlinks.componentrestorestate("MPW0034", "");
         }
      }
      wbErr = false ;
      strup010( ) ;
      if ( (GXutil.strcmp("", httpContext.wjLoc)==0) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( getDataAreaObject().executeStartEvent() != 0 )
         {
            httpContext.setAjaxCallMode();
         }
      }
   }

   public void ws012( )
   {
      start012( ) ;
      evt012( ) ;
   }

   public void evt012( )
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
                        /* Execute user event: e11012 */
                        e11012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "REFRESH_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e12012 */
                        e12012 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "LOAD_MPAGE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: e13012 */
                        e13012 ();
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
                  if ( nCmpId == 34 )
                  {
                     OldWcrecentlinks = httpContext.cgiGet( "MPW0034") ;
                     if ( ( GXutil.len( OldWcrecentlinks) == 0 ) || ( GXutil.strcmp(OldWcrecentlinks, WebComp_Wcrecentlinks_Component) != 0 ) )
                     {
                        WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
                        WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
                     }
                     if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
                     {
                        WebComp_Wcrecentlinks.componentprocess("MPW0034", "", sEvt);
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

   public void we012( )
   {
      if ( ! GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm012( ) ;
         }
      }
   }

   public void pa012( )
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
      rf012( ) ;
      /* End function Refresh */
   }

   public void rf012( )
   {
      /* Execute user event: e12012 */
      e12012 ();
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
         /* Execute user event: e13012 */
         e13012 ();
         wb010( ) ;
      }
   }

   public void strup010( )
   {
      /* Before Start, stand alone formulas. */
      Gx_err = (short)(0) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: e11012 */
      e11012 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read variables values. */
         /* Read saved values. */
         OldWcrecentlinks = httpContext.cgiGet( "MPW0034") ;
         if ( (GXutil.strcmp("", WebComp_Wcrecentlinks_Component)==0) && ! (GXutil.strcmp("", OldWcrecentlinks)==0) )
         {
            WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "" + OldWcrecentlinks + "_impl", remoteHandle, context);
            WebComp_Wcrecentlinks_Component = OldWcrecentlinks ;
            WebComp_Wcrecentlinks.componentrestorestate("MPW0034", "");
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
      /* Execute user event: e11012 */
      e11012 ();
      if (returnInSub) return;
   }

   public void e11012( )
   {
      /* Start Routine */
      tblTable2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, tblTable2_Internalname, "Visible", GXutil.ltrim( GXutil.str( tblTable2_Visible, 5, 0)));
      lblHome_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblHome_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblHome_Visible, 5, 0)));
      lblFirsttext_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblFirsttext_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblFirsttext_Visible, 5, 0)));
      lblSecondtext_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblSecondtext_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblSecondtext_Visible, 5, 0)));
      lblThirdtext_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblThirdtext_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblThirdtext_Visible, 5, 0)));
      lblFourthtext_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblFourthtext_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblFourthtext_Visible, 5, 0)));
      lblFifthtext_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", true, lblFifthtext_Internalname, "Visible", GXutil.ltrim( GXutil.str( lblFifthtext_Visible, 5, 0)));
   }

   public void e12012( )
   {
      /* Refresh Routine */
      /* Object Property */
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcrecentlinks_Component), GXutil.lower( "RecentLinks")) != 0 )
      {
         WebComp_Wcrecentlinks = WebUtils.getWebComponent(getClass(), "recentlinks_impl", remoteHandle, context);
         WebComp_Wcrecentlinks_Component = "RecentLinks" ;
      }
      if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
      {
         WebComp_Wcrecentlinks.setjustcreated();
      }
      if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
      {
         WebComp_Wcrecentlinks.componentprepare(new Object[] {"MPW0034","",(getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getCaption(),Contentholder.getPgmname()});
         WebComp_Wcrecentlinks.componentbind(new Object[] {"",""});
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e13012( )
   {
      /* Load Routine */
   }

   public void wb_table1_2_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable4_Internalname, tblTable4_Internalname, "", "Table95", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table2_5_012( true) ;
      }
      else
      {
         wb_table2_5_012( false) ;
      }
      return  ;
   }

   public void wb_table2_5_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_18_012( true) ;
      }
      else
      {
         wb_table3_18_012( false) ;
      }
      return  ;
   }

   public void wb_table3_18_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         /* WebComponent */
         GxWebStd.gx_hidden_field( httpContext, "MPW0034"+"", GXutil.rtrim( WebComp_Wcrecentlinks_Component));
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gxwebcomponent");
         httpContext.writeText( " id=\""+"gxHTMLWrpMPW0034"+""+"\""+"") ;
         httpContext.writeText( ">") ;
         if ( GXutil.len( WebComp_Wcrecentlinks_Component) != 0 )
         {
            if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
            {
               httpContext.ajax_rspStartCmp("gxHTMLWrpMPW0034"+"");
            }
            WebComp_Wcrecentlinks.componentdraw();
            if ( GXutil.strcmp(GXutil.lower( OldWcrecentlinks), GXutil.lower( WebComp_Wcrecentlinks_Component)) != 0 )
            {
               httpContext.ajax_rspEndCmp();
            }
         }
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td style=\"width:0px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:100%\">") ;
         wb_table4_38_012( true) ;
      }
      else
      {
         wb_table4_38_012( false) ;
      }
      return  ;
   }

   public void wb_table4_38_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td style=\"width:0px\">") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"3\" >") ;
         wb_table5_45_012( true) ;
      }
      else
      {
         wb_table5_45_012( false) ;
      }
      return  ;
   }

   public void wb_table5_45_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_48_012( true) ;
      }
      else
      {
         wb_table6_48_012( false) ;
      }
      return  ;
   }

   public void wb_table6_48_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_51_012( true) ;
      }
      else
      {
         wb_table7_51_012( false) ;
      }
      return  ;
   }

   public void wb_table7_51_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_54_012( true) ;
      }
      else
      {
         wb_table8_54_012( false) ;
      }
      return  ;
   }

   public void wb_table8_54_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table9_58_012( true) ;
      }
      else
      {
         wb_table9_58_012( false) ;
      }
      return  ;
   }

   public void wb_table9_58_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table10_61_012( true) ;
      }
      else
      {
         wb_table10_61_012( false) ;
      }
      return  ;
   }

   public void wb_table10_61_012e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_012e( true) ;
      }
      else
      {
         wb_table1_2_012e( false) ;
      }
   }

   public void wb_table10_61_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable10_Internalname, tblTable10_Internalname, "", "TableHorizontalLine", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table10_61_012e( true) ;
      }
      else
      {
         wb_table10_61_012e( false) ;
      }
   }

   public void wb_table9_58_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable9_Internalname, tblTable9_Internalname, "", "HorizontalSpace", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table9_58_012e( true) ;
      }
      else
      {
         wb_table9_58_012e( false) ;
      }
   }

   public void wb_table8_54_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "TableBottom", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr style=\"text-align:left\">") ;
         httpContext.writeText( "<td align=\"center\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, "Footer Info", "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "SmallText", 0, "", 1, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table8_54_012e( true) ;
      }
      else
      {
         wb_table8_54_012e( false) ;
      }
   }

   public void wb_table7_51_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable8_Internalname, tblTable8_Internalname, "", "HorizontalSpace", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table7_51_012e( true) ;
      }
      else
      {
         wb_table7_51_012e( false) ;
      }
   }

   public void wb_table6_48_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable7_Internalname, tblTable7_Internalname, "", "TableHorizontalLine", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table6_48_012e( true) ;
      }
      else
      {
         wb_table6_48_012e( false) ;
      }
   }

   public void wb_table5_45_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable6_Internalname, tblTable6_Internalname, "", "HorizontalSpace", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_45_012e( true) ;
      }
      else
      {
         wb_table5_45_012e( false) ;
      }
   }

   public void wb_table4_38_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable5_Internalname, tblTable5_Internalname, "", "ViewTable", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Content placeholder */
         httpContext.writeText( "<div") ;
         GxWebStd.classAttribute( httpContext, "gx-content-placeholder");
         httpContext.writeText( ">") ;
         getDataAreaObject().renderHtmlContent();
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_38_012e( true) ;
      }
      else
      {
         wb_table4_38_012e( false) ;
      }
   }

   public void wb_table3_18_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         if ( tblTable2_Visible == 0 )
         {
            sStyleString = sStyleString + "display:none;" ;
         }
         sStyleString = sStyleString + " width: " + GXutil.ltrim( GXutil.str( 100, 10, 0)) + "%" + ";" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "TableTopMenu", 0, "", "", 1, 2, sStyleString, "none", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblHome_Internalname, "Home", "", "", lblHome_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblHome_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "&nbsp; ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblFirsttext_Internalname, "First Option", "", "", lblFirsttext_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblFirsttext_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "&nbsp; ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblSecondtext_Internalname, "Second Option", "", "", lblSecondtext_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblSecondtext_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblThirdtext_Internalname, "Third Option", "", "", lblThirdtext_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblThirdtext_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "&nbsp; ") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblFourthtext_Internalname, "Fourth Option", "", "", lblFourthtext_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblFourthtext_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblFifthtext_Internalname, "Last One", "", "", lblFifthtext_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlock", 0, "", lblFifthtext_Visible, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_18_012e( true) ;
      }
      else
      {
         wb_table3_18_012e( false) ;
      }
   }

   public void wb_table2_5_012( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "TableTop", 0, "", "", 0, 0, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td10px\" >") ;
         /* Static images/pictures */
         ClassString = "ImageTopHeader" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_topl_Internalname, context.getHttpContext().getImagePath( "caf107ad-650e-4e3c-a4ba-1196d220603b", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class=\"td10px\" >") ;
         /* Static images/pictures */
         ClassString = "ImageTopHeader" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_topr_Internalname, context.getHttpContext().getImagePath( "c7e6c81f-bebf-4d28-b5cd-decdcb627b0a", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "&nbsp; ") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblockheader1_Internalname, "Application Header", "", "", lblTextblockheader1_Jsonclick, "'"+""+"'"+",true,"+"'"+"E_MPAGE."+"'", "", "TextBlockHeader", 0, "", 1, 1, (short)(0), "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td align=\"right\" >") ;
         /* Static images/pictures */
         ClassString = "HeaderImage1" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgImage1_Internalname, context.getHttpContext().getImagePath( "7326b96a-20b7-4973-8d71-35094049767d", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", "", "", 1, false, false, "HLP_AppMasterPage.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_5_012e( true) ;
      }
      else
      {
         wb_table2_5_012e( false) ;
      }
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
      pa012( ) ;
      ws012( ) ;
      we012( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122712");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).getJscriptsrc().item(idxLst)), "?20177317164297");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("appmasterpage.js", "?20177317164297");
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      imgBtn_topl_Internalname = "BTN_TOPL_MPAGE" ;
      imgBtn_topr_Internalname = "BTN_TOPR_MPAGE" ;
      lblTextblockheader1_Internalname = "TEXTBLOCKHEADER1_MPAGE" ;
      imgImage1_Internalname = "IMAGE1_MPAGE" ;
      tblTable1_Internalname = "TABLE1_MPAGE" ;
      lblHome_Internalname = "HOME_MPAGE" ;
      lblFirsttext_Internalname = "FIRSTTEXT_MPAGE" ;
      lblSecondtext_Internalname = "SECONDTEXT_MPAGE" ;
      lblThirdtext_Internalname = "THIRDTEXT_MPAGE" ;
      lblFourthtext_Internalname = "FOURTHTEXT_MPAGE" ;
      lblFifthtext_Internalname = "FIFTHTEXT_MPAGE" ;
      tblTable2_Internalname = "TABLE2_MPAGE" ;
      tblTable5_Internalname = "TABLE5_MPAGE" ;
      tblTable6_Internalname = "TABLE6_MPAGE" ;
      tblTable7_Internalname = "TABLE7_MPAGE" ;
      tblTable8_Internalname = "TABLE8_MPAGE" ;
      lblTextblock1_Internalname = "TEXTBLOCK1_MPAGE" ;
      tblTable3_Internalname = "TABLE3_MPAGE" ;
      tblTable9_Internalname = "TABLE9_MPAGE" ;
      tblTable10_Internalname = "TABLE10_MPAGE" ;
      tblTable4_Internalname = "TABLE4_MPAGE" ;
      (getDataAreaObject() == null ? Form : getDataAreaObject().getForm()).setInternalname( "FORM_MPAGE" );
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      lblFifthtext_Visible = 1 ;
      lblFourthtext_Visible = 1 ;
      lblThirdtext_Visible = 1 ;
      lblSecondtext_Visible = 1 ;
      lblFirsttext_Visible = 1 ;
      lblHome_Jsonclick = "" ;
      lblHome_Visible = 1 ;
      tblTable2_Visible = 1 ;
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
      OldWcrecentlinks = "" ;
      WebComp_Wcrecentlinks_Component = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXKey = "" ;
      sStyleString = "" ;
      lblTextblock1_Jsonclick = "" ;
      lblFirsttext_Jsonclick = "" ;
      lblSecondtext_Jsonclick = "" ;
      lblThirdtext_Jsonclick = "" ;
      lblFourthtext_Jsonclick = "" ;
      lblFifthtext_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTextblockheader1_Jsonclick = "" ;
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
   private int tblTable2_Visible ;
   private int lblHome_Visible ;
   private int lblFirsttext_Visible ;
   private int lblSecondtext_Visible ;
   private int lblThirdtext_Visible ;
   private int lblFourthtext_Visible ;
   private int lblFifthtext_Visible ;
   private int idxLst ;
   private String sPrefix ;
   private String OldWcrecentlinks ;
   private String WebComp_Wcrecentlinks_Component ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXKey ;
   private String tblTable2_Internalname ;
   private String lblHome_Internalname ;
   private String lblFirsttext_Internalname ;
   private String lblSecondtext_Internalname ;
   private String lblThirdtext_Internalname ;
   private String lblFourthtext_Internalname ;
   private String lblFifthtext_Internalname ;
   private String sStyleString ;
   private String tblTable4_Internalname ;
   private String tblTable10_Internalname ;
   private String tblTable9_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String tblTable8_Internalname ;
   private String tblTable7_Internalname ;
   private String tblTable6_Internalname ;
   private String tblTable5_Internalname ;
   private String lblHome_Jsonclick ;
   private String lblFirsttext_Jsonclick ;
   private String lblSecondtext_Jsonclick ;
   private String lblThirdtext_Jsonclick ;
   private String lblFourthtext_Jsonclick ;
   private String lblFifthtext_Jsonclick ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String imgBtn_topl_Internalname ;
   private String imgBtn_topr_Internalname ;
   private String lblTextblockheader1_Internalname ;
   private String lblTextblockheader1_Jsonclick ;
   private String imgImage1_Internalname ;
   private String sDynURL ;
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

