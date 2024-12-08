package week04CodingAssignment;

import java.util.Arrays;

public class Week04CodingAssignment {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
			//Programmatically subtract the value of the first element in the array from the value in the last 
			//element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
				//In order to find the last number in the array without using ages[7], I used the
				//.length method to find the size of the array. Since the index starts at 0, I have to add the
				//-1 after the length method to identify the last index in the array:
		
		System.out.println(ages[ages.length - 1] - ages[0]);
		
			//Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).
		
		int[] ages2 = new int[9];
			ages2[0] = 2;
			ages2[1] = 4;
			ages2[2] = 6;
			ages2[3] = 8;
			ages2[4] = 10;
			ages2[5] = 12;
			ages2[6] = 14;
			ages2[7] = 16;
			ages2[8] = 18;
					
			
			//i. Make sure that there are 9 elements of type int in this new array. 
				//I know there are 9 elements in the array ages2, since I put "9" in the brackets ([9]) and the last index is 8
			//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of the first element in the new array ages2 
			//from the last element of ages2). 
				// I am repeating the same equation I wrote above without printing directly. I then print out the output of this
			
		int difference = (ages2[ages2.length - 1] - ages2[0]);
		System.out.println(difference);					
	
			//iii. Show that using the index values for the elements is dynamic (works for arrays of different lengths).
				//I am able to use the same equation for the two different arrays, even though they are different in length, by using the .length - 1
				//method. The first number of an array will always have the index of 0, but you may not always know the last index number of your array.
				//The .length method finds the length of the array (8 in the first one, and 9 in the second one). The - 1 allows the program to pull
				//the correct index of that array (7 in the first one, and 9 in the second one)
			
			//Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
			
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
			//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
				//in my loop, I used the .length method to ask the program to count the letters in each name (i.e. Bob = 3)
				// the count tells the program to add the next name in the loop to the last name in the loop (could also be written as
					// count = count + next name length. I used double instead of int since the average does not come out to a whole number
				//in order to print the average
		
		double count = 0;
		for(int i = 0; i < names.length; i++) {
			count += names[i].length();
		}
		System.out.println(count / names.length);
		
			//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result 
			//to the console.
				//I wrote a loop that lists all names in the array, with space adding the comma and space between the concatenated
				// string of names, since there would be no spaces by default. The if statement stops adding the comma and space if it is the
				//last element in the loop.
		
		String space = " ";
		for (int index = 0; index < names.length; index++) {
			space += names[index];
			if(index < names.length - 1) {
				space += ", ";
			}
		}
		System.out.println(space);
		
			//3. How do you access the last element of any array?
				// You can access the last element of an array by using the .length method, which will identify how many elements are in the array,
				// and subtracting that number by one, as the index you identify. This is because arrays start at 0 for each item's index. 
				//If there are 5 items, the index list would be 0, 1, 2, 3, 4. The last number is 4, even though there are five items, 
				//because the index starts at 0. Example below:
		
		int[] example = {1, 2, 3, 4, 5};
		System.out.println(example[example.length - 1]);
		//is the same as
		System.out.println(example[4]);
		
			//4. How do you access the first element of any array?
				//Since we know arrays begin at 0, you can simply identify the first index, 0, to get the first array item
		
		System.out.println(example[0]);
		
			//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length 
			//of each name to the nameLengths array.
				//I initialized the new int array with the same length as the names array, and the for loop iterates over each element in the 
				//names array. The loop calculates the length of each name with the names[j].length() method. I then printed with the toString method
				//to print the lengths in a readable format. 
		
		int[] nameLengths = new int[names.length];
		for(int j = 0; j < names.length; j++) {
			nameLengths[j] = names[j].length();
		}
		System.out.println(Arrays.toString(nameLengths));
		
			//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the 
			//console.
				//since I have already identified the length of each name in my earlier array, I use that and write a loop to find the sum of each
				//of those numbers. 
				//The sum += nameLengths[s] is basically saying: 0+3=3, then 3+5=8, and so on until we reach the end of the loop.
		
		int sum = 0;
		for(int s = 0; s < names.length; s++) {
			sum += nameLengths[s];
		}
		System.out.println(sum);
		
			//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
			//(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
				//My loop tells the program to print "word" - which I have identified as Wow - "n" number of times, and to stop printing word once
				//I have reached the number n. The new compiled word, for which that loop created, is stored under the element I defined as 
				//newString7, which is what I printed to the console.
		
		String word = "Wow";
		int n = 10;
		
		String newString7 = "";
		for(int q = 0; q < n; q++) {
			newString7 += word;
		}
		System.out.println(newString7);
		
	
		
			//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the 
			//last name as a String separated by a space).
		
		String firstName = "Marci";
		String lastName = "Long";
	}
				//The method I'm trying to attempt goes as follows:
	
		static String createFullName(String firstName, String lastName){
		String fullName = firstName + " " + lastName;
		return fullName; 
		 }
		
		
	
		
					//or//		 		
		
		//public static String createFullName(String firstName, String lastName) {
		// 		return firstName + " " + lastName;
		// }
		
			//However, I can't seem to figure out how to print anything to the console, as a System.out.println is unreachable if after the return 
			// and nothing prints if before the return. A return is required, so I can't 
		
	
		
			//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
				//The for loop will first find the sum of all numbers in the array SumTo
				//I then wrote an if statement in the method to identify if the sum is over 100, return true. Otherwise, return false. 
				//sumTo is the name of the int array

		static boolean isGreater(int sum) {		
		int[] sumTo = {40, 60, 30, 80};
		for(int w = 0; w < sumTo.length; w++) {
			int sum1 = 0;
			sum1 += sumTo[w];
			} 
		if(sum > 100) {
			return true;
		} else {
			return false;
			}
		}
		
		

				
			//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		// I used an advanced loop to add each number to itself, in order to find the sum of all the doubles in the array.
		// I then returned the sum of those numbers to the length of the array to return the average.
		//findIt is the array name of doubles
		
	
		static double findAverage(double[] findIt) {
			double sum = 0;
			for(double number : findIt) {
				sum += number;
		}
			return sum / findIt.length;
		}
		
		

			//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first 
			//array is greater than the average of the elements in the second array.
		//arr1 is the first array of doubles, while arr2 is the second array of doubles
		//
		
		double[] arr1 = {18.52, 19.53, 18.5};
		int sum1 = 0;{
		for(int a = 0; a < arr1.length; a++) {
			sum1 += arr1[a];
			System.out.println(sum1);
		}
		}
		
		//double[] arr2 = {99.8, 88.56, 18.5};

		
		static boolean findBothAverages(double[] arr1, double[] arr2) {
			double average1 = calculateAverage(arr1);
			double average2 = calculateAverage(arr2);
			
			return average1 > average2;
			
}
		private static double calculateAverage(double[] arr1) {
			if(arr1.length == 0) {
				return 0;
				}
			
			int sum = 0;
			for(double num : arr1) {
			sum += num;
		}
			
			return sum / arr1.length;
		}
			
			
		static void main2(String[] args) {
			double[] arr1 = {18.52, 19.53, 18.5};
			double[] arr2 = {99.8, 88.56, 18.5};

			boolean result = findBothAverages(arr1, arr2);
			System.out.println(result);
		}
	
		
			//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
			//if it is hot outside and if moneyInPocket is greater than 10.50.

		boolean isHotOutside = true;
		double moneyInPocket = 12.00;

		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if(isHotOutside && moneyInPocket > 10.50) {
				return true;
			} else {
				return false;
			}
			
		}

		
			//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
	// I want to find the total sum of my cat's Christmas gifts, including a local tax rate of .07. I will create a method that finds this total
	// of all my individual items, and incorporates the tax rate for a true total of the gifts.

		static double orderTotal(double item1, double item2, double item3, double taxRate) {
			double sum = item1 + item2 + item3;
			return (sum * taxRate) + sum;
		}
}

		


	
		
		
		
		

		
		
		
				
			
		
		
		

		
		
		
			
			

		
		
		
		
	

	
	

