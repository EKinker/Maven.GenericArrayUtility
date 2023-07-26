package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T> {


    private T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {


        return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        int numOfOcc = 0;
        for (T t : inputArray) {
            if (t.equals(valueToEvaluate)) {
                numOfOcc++;
            }
        }
        return numOfOcc;
    }

    public T[] removeValue(T valueToRemove) {
        int counter = 0;
        T[] newArray = (T[]) Array.newInstance(valueToRemove.getClass(), inputArray.length - getNumberOfOccurrences(valueToRemove));
        for (T thing : inputArray) {
            if (!thing.equals(valueToRemove)) {
                newArray[counter] = thing;
                counter++;
            }
        }
        return newArray;
    }
}
