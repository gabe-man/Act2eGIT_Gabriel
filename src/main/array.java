package main;

public class array {

	public static void main(String[] args) {
		int[] array=new int[30];
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)((Math.random()*10)+1);
		}
	}

}
