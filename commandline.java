class CommandLine {
    public static void main(String args[]) {
        // Loop through each argument passed to the program
        for(int i = 0; i < args.length; i++) {
            // Print the index of the argument and its value
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
