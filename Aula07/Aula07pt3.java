public class Aula07pt3 {
    public static void main(String[] args) {
        int nums[] = new int[3];
        int nums2[] = {1,2,3};
        int nums3[] = new int[]{1,2,3,4,5};

        for(int i = 0; i < nums3.length; i++){
            System.out.println(nums3[i]);
        }

        for (int i : nums3) {
            System.out.println(i);
        }
    }
}
