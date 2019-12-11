package arrayDemo;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrayDemo());

	}
//this funcion state  there are min 3 variable are even then it return true.
	private static boolean arrayDemo() {
		// TODO Auto-generated method stub
		int myList[] = { 1, 2, 3, 4, 5, 6 };
		int flag = 0;
		for (int i = 0; i < myList.length; i++) {
			if (myList[i] % 2 == 0) {
				flag += 1;
			}
			if (flag == 3) {
				return true;
			}
		}
		return false;
	}

}
