
public class Downcasting {
	public static void main(String args[]) {
	      double d = 30.0;
	      
	      float f = (float) d;
	      long l = (long) f;
	      int i = (int) l;
	      short s = (short) i;
	      byte b = (byte) s;
	      System.out.println("Given double value : "+d);
	      System.out.println("\nfloat value : "+f);
	      System.out.println("long value : "+l);
	      System.out.println("int value : "+i);
	      System.out.println("short value : "+s);
	      System.out.println("byte value : "+b);
	   }

}
