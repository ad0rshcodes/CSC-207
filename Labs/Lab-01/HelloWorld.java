public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello, World!");

    }
    private static int sum (int a, int b){
        return a+b;
    }
    
}
/*
1. Yes, it is complusory to use .java extension. If not used, it gives "error: Class names, <filename>, are only accepted if annotation processing is explicitly requested".

2. It gives an error called file not found 

3. If you run java with .java file, it also does the step of javac and gives the final output. 

4. Yes, java is case-sensitive. "Main" is different than "main". Also, java is not whitespace sensitive. 

5. Yes, each part of the main function declaration is important. It doesn't work if you change public to private, void to int, string[] to int[], etc. 

6. It gives an error stating that a class is expected. 

7. Static is the key. You can't call the function in main if its not declared as static. Contrary to that, public is not crucial. It works if its declared as both public or private. 

8. 
*/