import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "ver12 nika 43 2 !23 0";
        System.out.println(Arrays.toString(numberFromString(s)));
        System.out.println(Arrays.toString(numberFromString("ver12 nika 43 2 !23 0 qenfj &iqef483 wwir2")));
        System.out.println(Arrays.toString(numberFromString("dnjfbn3431 rignwrin>sfjgj21wgr /e4in44oewfm")));

    }

    static int[] numberFromString(String str){
        String numStr = "";
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = str.length()-1; i >= 0; i--){

            if (Character.isDigit(str.charAt(i))){
                numStr = str.charAt(i) + numStr;

                if(!Character.isDigit(str.charAt(i-1))){
                    int a = Integer.parseInt(numStr);
                    numStr = "";
                    arr.add(a*2);
                }

            }
        }
        int[] array = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            array[i] = arr.get(i);
        }

        return sort(array);


    }

    static int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int value = arr[i];
            int j = i - 1;
            for (;j >= 0; j--){
                if(value < arr[j]){
                    arr[j+1] = arr[j];
                }
                else {
                    break;
                }
            }
            arr[j+1] = value;
        }
        return arr;
    }

}