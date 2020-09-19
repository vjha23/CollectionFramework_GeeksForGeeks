/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsgeeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * In this question we will be implementing various operations on ArrayList. There will be different type of queries.
A query can be of five types:
1. a x (Adds an element x to the ArrayList A at the end )
2. b (Sorts the ArrayList A in ascending order )
3. c (Reverses the ArrayList A)
4. d (prints the size of the ArrayList)
5. e (prints space separated values of the ArrayList)
5. f  (Sorts the ArrayList A in descending order)

Example 1:

Input:
6
a 4 a 6 a 7 b c e

Output:
7 6 4

Explanation :
There are six queries. Queries are performed in this order
1. a 4 { ArrayList has 4  }
2. a 7 {ArrayList has 7 }
3. a 6 {ArrayList has 6}
4. b {sorts the ArrayList in ascending order, ArrayList now is 5 6 7}
5. c {reverse the ArrayList}
6. e {prints the element of the ArrayList 7 6 4}
Example 2:

Input:
4
a 55 a 11 d e

Output:
2 55 11

Explanation :
There are four queries. Queries are performed in this order
1. a 55  (ArrayList A has 55}
2. a 11  (ArrayList A has 55 ,11}
3. d     (prints the size of the ArrayList A ie. 2 )
4. e     (prints the elements of the ArrayList A ie 55 1
 * 
 * 
 * 
 */
/**
 *
 * @author Vijay Jha
 */
public class CollectionsGeeks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            ArrayList<Integer>A=new ArrayList<Integer>();
            int q=sc.nextInt();
            while(q>0)
            {
                char c=sc.next().charAt(0);
                if(c=='a')
                {
                    int x=sc.nextInt();
                    add_to_ArrayList(A,x);
                }
                if(c=='b')
                {
                    sort_ArrayList_Asc(A);
                }
                if(c=='c')
                {
                    reverse_ArrayList(A);
                }
                if(c=='d')
                {
                    System.out.println("Size of Array is "+size_Of_ArrayList(A));
                    
                }
                if(c=='e')
                {
                    print_ArrayList(A);
                }
                
                if(c=='f')
                {
                    sort_ArrayList_Desc(A);
                }
                
                
                
            }
        }
        
    }
    
    public static void add_to_ArrayList(ArrayList<Integer> A, int x)
{
	A.add(x);
}	

public static void sort_ArrayList_Asc(ArrayList<Integer> A)
{
	//Your code here
	//Just sort, don't print anything
	Collections.sort(A);
}

public static void reverse_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Just reverse, don't print anything
	Collections.reverse(A);
}

public static int size_Of_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Return the size of ArrayList
	return A.size();
	
}

public static void sort_ArrayList_Desc(ArrayList<Integer> A)
{
	//Your code here
	//Just sort in desc order, don't print anything
	Collections.sort(A,Collections.reverseOrder());
}

public static void print_ArrayList(ArrayList<Integer> A)
{
	//Your code here
	//Print the elements of A, don't add new line
	Iterator it=A.iterator();
	while(it.hasNext())
	{
	    System.out.print(it.next()+" ");
	}
    
}
    
}
