
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoFeb28{
	

		public static void main(String args[])
		{


	    Set<Integer> set=new HashSet<Integer>();
	    
	    Integer[] setarray=new Integer[7];
	    setarray[0]=new Integer(101);
	    setarray[1]=new Integer(102);
	    setarray[2]=new Integer(103);
	    setarray[3]=new Integer(107);
	    setarray[4]=new Integer(105);
	    System.out.println();
	    set.add(setarray[0]);
	    set.add(setarray[1]);
	    set.add(setarray[2]);
	    set.add(setarray[3]);
	    set.add(setarray[4]);
	    System.out.println(set.size());
	    List<Integer> sortlist=new ArrayList<Integer>(set);
	    Collections.sort(sortlist);
	    
	    System.out.println(sortlist);


	}

	}





