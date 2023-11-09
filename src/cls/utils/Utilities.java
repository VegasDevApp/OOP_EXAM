package cls.utils;

public class Utilities {

    /**
     * Will return index if string appears in thr Array
     * Otherwise will return -1
     *
     * @param arr array of strings
     * @param target string to find
     * @return index or -1
     */
    public static int findInArray(String[] arr, String target){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equalsIgnoreCase(target.toLowerCase())){
                return i;
            }
        }
        return -1;
    }

}
