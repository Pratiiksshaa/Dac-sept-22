/*23. How to convert ArrayList to String Array in java ?*/
import java.util.*;

class Array23 
{
    public static void main(String args[]) 
	{
      // Creating and initializing ArrayList
      ArrayList<String> list = new ArrayList<>();
      list.add("Pratiksha");
      list.add("Sarvesh");
      list.add("Sayali");
      
      // ArrayList to String array conversion
      String[] str = new String[list.size()];
      for(int i=0;i<list.size();i++) 
	  {
          str[i]=list.get(i);
      }
      
      // Print elements using for-each loop
      for(String s : str) 
	  {
        System.out.println(s);      
      }
    }
}

/* OUTPUT=
Pratiksha
Sarvesh
Sayali
*/
/*
  ArrayList<String> list = new ArrayList<>();
  list.add("Pratiksha");
      list.add("Sarvesh");
      list.add("Sayali");

  // ArrayList to String array conversion using toArray()
  String citinames[]=list.toArray(new String[list.size()]);

  // Printing elements using for-each loop
  for(String str : citinames) 
  {
	System.out.println(str);      
  }
*/