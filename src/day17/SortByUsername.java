package day17;

import java.util.Comparator;

public class SortByUsername implements Comparator<ApplicationMain> {

	@Override
	public int compare(ApplicationMain o1, ApplicationMain o2) {
		// TODO Auto-generated method stub
		if(o1.getUsername()==o2.getUsername())
			return 1;
			
			else 
				return -1;

	}

}
