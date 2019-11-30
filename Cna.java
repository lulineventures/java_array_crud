
package cna;
import java.util.*;


public class Cna {

 // list itself. null values at the end 
int capacity; // maximum capacity of the list 
int num; // current size of the list
static final int DEFAULT_CAPACITY = 10;
int [] data = new int [DEFAULT_CAPACITY];
Scanner input = new Scanner(System.in);

public void add(int value)  {
	 	 if (DEFAULT_CAPACITY <= num) {
			 System.out.print("list capacity exceeded");
	 	 } else {
	 	 data[num] = value;
                 num++;
	 	 capacity++;
                 System.out.println(value + " added.");
                 System.out.print("capacity: "+ capacity + "/"+ DEFAULT_CAPACITY);
                 }
}

public boolean search(int value) {
boolean found = false;
       
       // Checks for an empty storage
            for(int i=0; i < data.length; i++) {
                     if (data[i] == value) {
                        found = true;
                    }                 
                }
            
            if (found) {
                    System.out.print(value + " found.");
                } else {
                    System.out.print(value + " doesn't exist.");
                }
             return found;
    }


public void delete(int value) 
    { 
        // Search x in array 
        int i; 
        for (i=0; i<num; i++) 
            if (data[i] == value) {
              break;
            }    
   
        // If x found in array 
        if (i < num) 
        { 
            // reduce size of array and move all 
            // elements on space ahead 
            num = num - 1; 
            for (int j=i; j<num; j++) 
                data[j] = data[j+1]; 
            System.out.print(value + " deleted.");
            capacity--;
            System.out.print("capacity: "+ capacity + "/" + DEFAULT_CAPACITY);
        } else {
            System.out.print(value + " doesn't exist.");
        }
   
        
    } 


public void edit(int value) 
    { 
        // Search x in array 
        int i; 
        for (i=0; i<=num; i++) {
            if (data[i] == value) {
            
                System.out.print("NEW NUMBER: ");
                int replace = input.nextInt();
                data[i] = replace;
                System.out.print(value + " updated to " + replace);
                break;   
            } 
               
        }
       
    } 

public void display()  {
  
        if (data.length == -1) {
            System.out.print("list is empty.");
        } else {  
            for (int j=0; j < num ; j++){
                System.out.print(data[j] + " ");
            }
        }
    
}
 
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Cna p = new Cna();
        int x= 0;
		do {
			try {	
				System.out.println("\n\n    ====== Menu ======");
		    System.out.println("    [1] Add number   .");
		    System.out.println("    [2] Edit number  .");
		    System.out.println("    [3] Search number.");
		    System.out.println("    [4] Delete number.");
		    System.out.println("    [5] Display all  .");
		    System.out.println("    [0] Exit         .");
		    System.out.println("    ------------------");
		    System.out.print("\nYour choice: ");
				 x = input.nextInt();
				int value;
			
				switch (x) {
				case 0:
					System.out.println("Goodbye.\n\n");
                                        System.exit(0);
					break;
				case 1:
					System.out.println("add selected");
					System.out.print("INPUT NUMBER: ");
					value = input.nextInt();
					p.add(value);
                                        break;
			case 2:
					System.out.println("edit selected.");
					System.out.print("EDIT NUMBER: ");
					value = input.nextInt();
					p.edit(value);
					break;
				case 3:
					System.out.println("search selected.");
					System.out.print("SEARCH NUMBER: ");
					value = input.nextInt();
					p.search(value);
                                        break;
				case 4:
					System.out.println("delete selected.");
					System.out.print("DELETE NUMBER: ");
					value = input.nextInt();
					p.delete(value);
					break;
				case 5:
					System.out.println("display selected.");
					p.display();
					break;
				default:
					break;
				}
				if(x==0) {
					break;
				}
				
			} catch (Exception e) {
				input.next();
				System.out.println("Something went wrong!");
			}
		} while (x != 0);
	} //driver
    } //Cna class
    

