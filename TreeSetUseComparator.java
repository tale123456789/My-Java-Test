import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetUseComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {3, 1, 2, 1, 5, 7, 9, 3, 4, 2};
        
        TreeSet<Integer> treeSet1 = new TreeSet<Integer>(new MyComp() );
        
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return (o1-o2);
			}
        });
        
        for(int i=0; i<arr.length; i++) {
        	treeSet1.add(arr[i]);
        	treeSet2.add(arr[i]);
        }
                
        System.out.println(treeSet1.toString() );
                
        System.out.println(treeSet2.toString() );
	}

}

class MyComp implements Comparator<Integer>{

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return -(arg0-arg1);
	}
	
}
