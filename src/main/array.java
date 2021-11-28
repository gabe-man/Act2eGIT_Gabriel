package main;

public class array {

	public static void main(String[] args) {
		int[] array=new int[20];
		int cont=0;
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)((Math.random()*10)+1);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 1; i < 11; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[j]==i)
				{
					cont++;
				}
			}
			System.out.println(i + " sale " + cont + " veces.");
			cont=0;
		}
	}

}
