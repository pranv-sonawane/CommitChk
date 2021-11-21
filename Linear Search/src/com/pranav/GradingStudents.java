package com.pranav;

//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//public class GradingStudents {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine().replaceAll("\\s+$", "");
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .map(String::trim)
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = Result.gradingStudents(grades);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//
//}
//class Result {
//
//    /*
//     * Complete the 'gradingStudents' function below.
//     *
//     * The function is expected to return an INTEGER_ARRAY.
//     * The function accepts INTEGER_ARRAY grades as parameter.
//     */
//
//    public static List<Integer> gradingStudents(List<Integer> grades) {
//        int multiple;
//        for (int i = 0; i < grades.size(); i++) {
//            multiple = 0;       //Resetting the variable for next element
//            multiple = (grades.get(i) / 5) * 5 + 5;
//            if (multiple - grades.get(i) < 3){
//                if (multiple > 40){     //Minimum passing marks should be around 40
//                        grades.set(i, multiple);
//                }
//            }
//        }
//        return grades;
//    }
//
//}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class gradingStudents{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(i, in.nextInt());
        }
        ArrayList<Integer> ans = gradingStudents(list);
        for (int i = 0; i < n; i++) {
            System.out.println(ans.get(i));
        }
    }

//    static ArrayList<Integer> roundUPGrades(ArrayList<Integer> list, int n) {
//        //checking if the list[i] is close to which multiple of 5
//        int multiple, temp;
//
//        for (int i = 0; i < n; i++) {
//            multiple = 0;
//            multiple = list.get(i) / 5;
//            multiple = (multiple * 5) + 5;
//            temp = multiple;
//            if ((temp - list.get(i)) < 3){
//                if (multiple >= 40){
//                    list.set(i, multiple);
//                }
//            }
//        }
//        return list;
//    }
    public static ArrayList<Integer> gradingStudents(ArrayList<Integer> grades) {
        int multiple;
        for (int i = 0; i < grades.size(); i++) {
            multiple = 0;       //Resetting the variable for next element
            if (grades.get(i) >= 0 && grades.get(i) <= 100) { //corner case (grades[i] >= 0 and grades[i] <= 100)
                multiple = (grades.get(i) / 5) * 5 + 5;
                if ((multiple - grades.get(i)) < 3) {
                    if (multiple >= 40) {     //Minimum passing marks should be around 40
                        grades.set(i, multiple);
                    }
                }
            }
            else return null;      //return null if the condition dosen't match
        }
        return grades;      //finally return the arayList
    }
}