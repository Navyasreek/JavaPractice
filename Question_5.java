package com.test;

public class Ques_5 {

	public static void main(String[] args) {
		
		
		String a[] = { "a", "a", "b", "b" };
		String b[] = { "a", "c", "b", "c" };
		System.out.println(new Ques_5().scoreUp(a, b));
	}

	public int scoreUp(String first[], String second[]) {
int result=0;
if(first.length==second.length)
{
		for(int i=0;i<first.length;i++)
		{
			if(first[i]==second[i])
			{
				result=result+4;
				
			}
			else {
				result--;
			}
		}
}
else
{
	System.out.println("Both arrays should have same length");
}
		
		
		return result;

	}
}
