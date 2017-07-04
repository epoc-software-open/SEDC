import com.genexus.*;

public final  class StructSdtGXzip implements Cloneable, java.io.Serializable
{
   public StructSdtGXzip( )
   {
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

}

