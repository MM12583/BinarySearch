package method;

import java.util.Scanner;

public class BinarySearch{

	public static void main(String[] args){
		
		System.out.print("Enter element to search : ");
		double[]list = {2, 4, 5, 7, 8, 11, 13, 18, 20} ;
		
		Scanner input = new Scanner(System.in) ;
		int s =input.nextInt() ;
		
		search(s, list) ;
		
		input.close();
	}
	
	public static void search(int s, double[]list){
		
		// �]�C��d��
		int low = 0 ;
		int high = list.length-1 ;
		int pos = 0 ;
		
		while(low <= high){             // �_�ƭӤ����ݭn�[ = , �γ�2�Ӥ�����
			int mid = (low + high)/2 ;  // �j�餺�~�|����
			if (s == list[mid]){
				pos = mid ;
				break ;
			}else if(s > list[mid]){    
				low = mid + 1 ;
			}else{
				high = mid -1 ;
			}
		}
		
		if (pos == 0){
			System.out.println("Can not find the element");
		}else{
			System.out.println("Element is on " + pos );
		}
	}

}
