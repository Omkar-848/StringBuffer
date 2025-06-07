package stringbuffer;

public class StringBufferClass {
	
	
	
	    public static void main(String[] args) {
	        // Create a StringBuffer with default capacity
	        StringBuffer sb = new StringBuffer();

	        // Print the default capacity (16)
	        System.out.println("Default capacity: " + sb.capacity()); // Output: 16

	        // Append "Hello" to the StringBuffer
	        sb.append("Hello");

	        // Capacity remains 16 since "Hello" (5 characters) fits within the default capacity
	        System.out.println("Capacity after appending 'Hello': " + sb.capacity()); // Output: 16

	        // Append a longer string to exceed the default capacity
	        sb.append("Java is my favourite language");

	        // Capacity increases as per the formula: (old capacity * 2) + 2
	        System.out.println("Capacity after appending longer string: " + sb.capacity()); // Output: 34

	        // Forcefully increase capacity using ensureCapacity()
	        sb.ensureCapacity(50); // Now (34*2)+2 = 70 if required
	        System.out.println(sb.capacity()); // Output: 70
	    }
	}