package com.pranav;

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        for (int i = 0; i < image.length; i++) {
//            System.out.println(Arrays.toString(flipAndInvertImage(image[i])));
        }
    }


    static int[][] flipAndInvertImage(int[][] image) {
        int start, end, temp;
        for (int i = 0; i < image.length; i++) {
            start = 0;
            end = image[i].length -1;
            //reversing the array using swapping last and first elements (two pointer method)
            while (start<end){
                temp = image[i][start];
                image[i][start++] = image[i][end];
                image[i][end--] = temp;
            }
            //flipping the 1's and 0's over
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1){
                    image[i][j] = 0;
                }else if (image[i][j] == 0){
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

}
//the upper function works fine just needs to look at the main correctly