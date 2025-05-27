package Data_Structures_Algorithms.Greedy_Algorithm.Easy;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String[] args) {
        // Example input
        int[] Student = {1, 2};
        int[] Cookie = {1, 2, 3};

        // Create a Solution object
        AssignCookies solution = new AssignCookies();

        // Call the findMaximumCookieStudents function
        int result = solution.findMaximumCookieStudents(Student, Cookie);

        // Output the result
        System.out.println("Number of students satisfied: " + result);
    }

    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
           
           Arrays.sort(Student);
           Arrays.sort(Cookie);
           int answer = 0;
           int cookiePointer = 0;

           for(int i=0;i<Student.length && cookiePointer < Cookie.length;i++){
                while(cookiePointer<Cookie.length){
                    if(Student[i]<=Cookie[cookiePointer]){
                        answer++;
                        cookiePointer++;
                        break;
                    }
                    cookiePointer++;  
                }
           }
           return answer;
    }
}
