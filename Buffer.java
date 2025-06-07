package stringbuffer;

public class Buffer {
	
	
	    public static void main(String[] args) {
	        // Create a StringBuffer
	        StringBuffer buffer = new StringBuffer("Hello");

	        // Append a string
	        buffer.append(" World");         // "Hello World"

	        // Insert a string at a specific position
	        buffer.insert(5, ",");           // "Hello, World"

	        // Replace part of the string
	        buffer.replace(7, 12, "Java");   // replace "World" with "Java"

	        // Reverse the buffer
	        buffer.reverse();                // "avaJ ,olleH"

	        // Print the final result
	        System.out.println("Result: " + buffer);
	    }
	}



