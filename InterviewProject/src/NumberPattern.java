


		import java.util.*;
		public class NumberPattern {
		    public static void main(String[] args) {
		      //create an object for scanner class
		      Scanner scan=new Scanner(System.in);
		      //Taking a number of rows from user
		      System.out.println("Enter number of rows");
		      int rows=scan.nextInt();
		      //taking a number of columns from user
		      System.out.println("Enter number of columns");
		      int columns=scan.nextInt();
		      //Creating an array
		      int[][]arr=new int[rows][columns];
		      //storing element inside an array
		      for(int i=0;i<=arr.length-1;i++) {
		    	    
		    	    for(int j=0;j<=arr[i].length-1;j++) {
		    	    	
		    	    	arr[i][j]=scan.nextInt();
		    	    }
		    	
		    	
		       }
		      for(int i=0;i<=arr.length-1;i++) {
		    	  for(int j=0;j<=arr[i].length-1;j++) {
		    		  //when i value match with with j //indesx of rows match with index of column
		    		  if(i==j) {
		    			  arr[i][j]=0;
		    		  }
		    	  }
		      }
		      //displaying the data
		      for(int i=0;i<=arr.length-1;i++) {
		    	  for(int j=0;j<=arr[i].length-1;j++) {
		    		  System.out.print(arr[i][j]+" ");
		    	  }
		    	  System.out.println();
		      }
		      
		      
		      
		      
		    }
		}

		



