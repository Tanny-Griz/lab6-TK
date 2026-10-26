package week_6;

/**
 *
 * Read the following, and answer the questions by filling in the Strings in the code.
 
 Java doesn't make you deal with possible NullPointerException, or ArrayIndexOutOfBoundsException in your code.
 If these exceptions happen, and are not caught, your program crashes.
 NullPointerException, ArrayIndexOutOfBoundsException, and several other exceptions, are called unchecked exceptions.
 
 It's possible to add try-catch blocks for NullPointerException, and other unchecked exceptions.
 You can also declare that a method throws NullPointerException, or any other unchecked exception
 
 But, Java insists that you deal with IOException – which is a checked exception - in some way.
 The compiler checks that you have indeed done something about code that can throw IOException.
 You either have to surround your file IO code with a try-catch block, or declare that the method throws IOException.
 If your method throws IOException, then a method that calls this method also has to add a try-catch block, or declare that it also throws IOException.
 
 There are other checked exceptions, for example SQLException, which you'll see when we work with databases.
 
 Java's decision to implement two types of exceptions (checked and unchecked) is unusual.
 Other languages like C#, Python, JavaScript... have exceptions, but it's always up to you how to deal with them.
 You are never required to add try-catch blocks or declare that a method throws a particular exception;
 the responsibility is left to the programmer to implement whatever exception/error handling mechanism is appropriate.

 Questions:
 
 Considering many other languages don't require you to deal with exceptions,
 think about why Java does make you handle with at least some exceptions.
 
 1. List at least 1 benefit of checked exceptions
 2. List at least 2 negative consequences of checked exceptions
 3. What is your opinion on Java's decision to use checked exceptions?
 
 Usually, it's better to anticipate and try to prevent errors. Almost all unchecked exceptions can be
 prevented (in theory) by careful programming.  And many checked exceptions can also be prevented with careful coding.
 
 It's more common for programmers to try to prevent unchecked exceptions (e.g. NullPointerException)
 than to write a try-catch block for code that may throw that type of exception.
 
 4. For unchecked exceptions, why is it usually better to anticipate and avoid errors when possible,
 instead of using try-catch blocks? At least 2 reasons.
 
 
 Questions on this subject are common in Java job interviews so your answers should
 be in the form of an interview question answer.

 */
public class Question_4_Exception_Handling_Questions {
    
    // TODO answer in the form of an interview question. Write as much as you need in each String
    
    // TODO include your sources in comments.
    
    // This question will be graded manually. All the test does is check that you wrote something.
    
    String q1_pros_of_checked_exceptions = "One benefit of checked exceptions is that Java requires programmers to consider possible errors. For example when reading a file, the file might not exist. This helps us write more reliable programs and handle problems instead of letting the program crash.";   //TODO Fill this in with your answer
    String q2_cons_of_checked_exceptions = "One disadvantage is that checked exceptions require extra code, such as try-catch blocks, which can make programs longer and harder to read. Another disadvantage is that sometimes we have to handle or declare exceptions in methods that cannot actually solve the problem";   //TODO Fill this in with your answer, at least 2 reasons
    String q3_your_opinion_on_java_having_checked_and_unchecked_exceptions = "I think checked exceptions are very useful because they remind us to think about possible errors. They are important when working with files or databases. However, I also think they can make code more complicated. Overall, I think the benefits are worth it."; // TODO fill this in with your opinion
    
    
    // Why is it often better to anticipate and try to prevent errors, vs. letting exceptions be thrown and then catch them?
    
    String[] q4_why_is_it_better_to_anticipate_and_prevent_errors = { "Preventing errors makes code more reliable and easier to maintain because we fix potential problems before they happen instead of just handling the consequences. For example, we can check if an object is null before calling its methods, verify that an array index is valid, or check if a number is greater than zero before using it as a divisor. This also makes debugging easier because we can identify and fix the actual cause of an error rather than repeatedly catching the same exception.", "Preventing errors can improve performance because creating and handling exceptions takes extra time and uses additional resources. For example, checking if a variable is null or if an array index is valid is usually faster than allowing an exception to occur and then catching it. This is especially important in loops or methods that run frequently, where repeated exceptions can slow down the program. However, if checking for an error is complicated or expensive, using exception handling may sometimes be more practical." };  // TODO fill this in. At least 2 reasons.
    
}
