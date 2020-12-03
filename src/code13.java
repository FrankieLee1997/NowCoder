import java.util.Arrays;

// 扫描数组，若发现偶数在奇数前面，则交换它们的位置。使用两个指针，第一个
// 指针从数组第一个元素开始向后扫描，第二个指针从数组最后一个元素开始向前
// 扫描。若第一个指针指向偶数，第二个指针指向奇数，则交换它们的顺序，如此
// 循环，直到第一个指针和第二个指针相遇，或者在第二指针的后面。
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
