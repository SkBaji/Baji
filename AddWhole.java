import java.util.*;
class AddWhole{
public static void main(String args[]){
	AddWhole s=new AddWhole();
	String[] a={"a","b","c"};
	String[] b={"X","Y","Z"};
	//List Interface
	List<String> list=new ArrayList<String>(Arrays.asList(a));
list.addAll(Arrays.asList(b));
Object[] c=list.toArray();
System.out.println(Arrays.toString(c));
}
}
	
