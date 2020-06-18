package day17;

import java.util.Comparator;

public class SortByAge implements Comparator<ApplicationMain> {

	@Override
	public int compare(ApplicationMain o1, ApplicationMain o2) {
		// TODO Auto-generated method stub
		if(o1.getAge()==o2.getAge())
			return 0;
			else if(o1.getAge()>o2.getAge())
				return 1;
			else 
				return -1;
	}

}
