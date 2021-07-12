/*
               File: SdtWeZipFile
        Description: WeZipFile
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: December 24, 2020 16:51:17.20
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtWeZipFile extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtWeZipFile( )
   {
      this(  new ModelContext(SdtWeZipFile.class));
   }

   public SdtWeZipFile( ModelContext context )
   {
      super( context, "SdtWeZipFile");
   }

   public SdtWeZipFile( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle, context, "SdtWeZipFile");
   }

   public SdtWeZipFile( StructSdtWeZipFile struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public void close( )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      try
      {
         WeZipFile_externalReference.close();
      }
      catch(Exception e)
      {
         throw new RuntimeException("The external object throws an exception.", e);
      }
   }

   public void addfile( String gxTp_param0 )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      WeZipFile_externalReference.addFile(gxTp_param0);
   }

   public void compress( String gxTp_param0 ,
                         String gxTp_param1 ,
                         String gxTp_param2 )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      WeZipFile_externalReference.Compress(gxTp_param0, gxTp_param1, gxTp_param2);
   }

   public boolean unzip( String gxTp_param0 ,
                         String gxTp_param1 )
   {
      boolean returnunzip ;
      returnunzip = false;
      returnunzip = WeZipFile.unzip(gxTp_param0, gxTp_param1) ;
      return returnunzip ;
   }

   public void openfile( String gxTp_param0 )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      try
      {
         WeZipFile_externalReference.openFile(gxTp_param0);
      }
      catch(Exception e)
      {
         throw new RuntimeException("The external object throws an exception.", e);
      }
   }

   public void build( String gxTp_param0 )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      WeZipFile_externalReference.build(gxTp_param0);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1 ;
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
   }

   public WeZipFile getExternalInstance( )
   {
      if ( WeZipFile_externalReference == null )
      {
         WeZipFile_externalReference = new WeZipFile() ;
      }
      return WeZipFile_externalReference ;
   }

   public void setExternalInstance( WeZipFile value )
   {
      WeZipFile_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public SdtWeZipFile Clone( )
   {
      return (SdtWeZipFile)(clone()) ;
   }

   public void setStruct( StructSdtWeZipFile struct )
   {
   }

   public StructSdtWeZipFile getStruct( )
   {
      StructSdtWeZipFile struct = new StructSdtWeZipFile ();
      return struct ;
   }

   protected WeZipFile WeZipFile_externalReference=null ;
}

