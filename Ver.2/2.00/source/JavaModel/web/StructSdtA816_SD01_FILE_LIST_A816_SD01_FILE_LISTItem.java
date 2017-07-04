/*
               File: StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem
        Description: A816_SD01_FILE_LIST
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:20:55.49
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;

public final  class StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem implements Cloneable, java.io.Serializable
{
   public StructSdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem( )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name = "" ;
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getFile_name( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name ;
   }

   public void setFile_name( String value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name = value ;
   }

   public long getFile_size( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size ;
   }

   public void setFile_size( long value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size = value ;
   }

   public String getFile_type( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type ;
   }

   public void setFile_type( String value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type = value ;
   }

   public byte getFile_dir_kb( )
   {
      return gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb ;
   }

   public void setFile_dir_kb( byte value )
   {
      gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb = value ;
   }

   protected byte gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_dir_kb ;
   protected long gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_size ;
   protected String gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_name ;
   protected String gxTv_SdtA816_SD01_FILE_LIST_A816_SD01_FILE_LISTItem_File_type ;
}

