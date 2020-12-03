import java.util.Arrays;

public class code13 {
    public boolean isEven(int num){
        if(num % 2 == 0)
            return true;
        else
            return false;
    }

    public void reOrder(int[] array){
        if(array == null || array.length == 0)
            return;
        int begin = 0;
        int end = array.length - 1;
        while (begin <= end){
            while (!isEven(array[begin]))
                begin ++;
            while (isEven(array[end]))
                end --;
            if(begin < end) {
                int temp = array[begin];
                array[begin] = array[end];
                array[end] = temp;
            }
        }
    }

    public static void main(String[] args){
        int[] array  ={3, 4, 6, 5, 2, 7, 8, 11, 10};
        System.out.println(Arrays.toString(array));
        code13 code13 = new code13();
        code13.reOrder(array);
        System.out.println(Arrays.toString(array));

    }
}
