package com.spring;

public class RemoveDuplicateStringFromArray {

	public static void main(String[] args) {
		String arr[]= {"shahrukh","abid","farid","abid","rehan","rehan"};
		String newArr[]= new String[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			boolean isDuplicate= false;
			
			for(int j=0;j<index;j++)
			{
				if(arr[i]==newArr[j])
				{
					isDuplicate=true;
					break;
				}
			}
			if(!isDuplicate)
			{
				newArr[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<index;i++)
		{
			System.out.println(newArr[i]);
		}
		

	}

}
