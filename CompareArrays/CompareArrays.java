
public class CompareArrays {

	public static void main(String[] args) {
		int []nums1 = {3,4,5,9,12};
		int []nums2 = {3,4,5,6,12};

		boolean arrayEqual = true;
		int i = 0;
		
		if (nums1.length != nums2.length) {
			arrayEqual = false;
		}
		
		while (arrayEqual && i < nums1.length) {
			if (nums1[i] != nums2[i]) {
				arrayEqual = false;
			}
			i++;
		}
		
		if (arrayEqual) {
			System.out.println("Arrays are the same");
		}
		else {
			System.out.println("Arrays are not the same");
		}		
	}

}
