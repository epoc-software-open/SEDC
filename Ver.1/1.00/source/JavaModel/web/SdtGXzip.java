import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;

public final  class SdtGXzip extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtGXzip( )
   {
      this(  new ModelContext(SdtGXzip.class));
   }

   public SdtGXzip( ModelContext context )
   {
      super( context, "SdtGXzip");
   }

   public SdtGXzip( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle, context, "SdtGXzip");
   }

   public SdtGXzip( StructSdtGXzip struct )
   {
      this();
      setStruct(struct);
   }

   public String uncompress( String gxTp_fileName ,
                             String gxTp_writeDir )
   {
      String returnuncompress ;
      returnuncompress = "";
      returnuncompress = GXzip.GXzip.Uncompress(gxTp_fileName, gxTp_writeDir) ;
      return returnuncompress ;
   }

   public void compress( GxObjectCollection gxTp_filesToCompress ,
                         String gxTp_zipFileName ,
                         int gxTp_compressionLevel )
   {
      GXzip.GXzip.Compress(gxTp_filesToCompress, gxTp_zipFileName, gxTp_compressionLevel) ;
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
   }

   public void tojson( )
   {
   }

   public GXzip.GXzip getExternalInstance( )
   {
      return GXzip_externalReference ;
   }

   public void setExternalInstance( GXzip.GXzip value )
   {
      GXzip_externalReference = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
   }

   public SdtGXzip Clone( )
   {
      return (SdtGXzip)(clone()) ;
   }

   public void setStruct( StructSdtGXzip struct )
   {
   }

   public StructSdtGXzip getStruct( )
   {
      StructSdtGXzip struct = new StructSdtGXzip ();
      return struct ;
   }

   protected GXzip.GXzip GXzip_externalReference=null ;
}

