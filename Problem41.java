public class Problem41 {

    public int firstMissingPositive(int[] nums) {

        //// use merge sort algo ? this way the values are ordered and easier to run
        //// through ---check
        /// check value of lowest positive int ---check
        //// either move up or down the scale from there to find missing number
        //// consider there may be dupe ints
        //// move down the scale as fast as possible
        //// what if negative numbers skip

        ms(nums);

        if (nums[nums.length - 1] < 1)
            return 1;

        if (nums[0] > 1)
            return 1;

        int index = 0;
        while (nums[index] < 1 && index < nums.length) /// takes care of negative numbers
        {
            index++;
        }

        if (nums[index] != 1)
            return 1;

        int con = nums[index];

        System.out.println("this is the number for constant pointer " + con);

        for (int i = index; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i])
                con--;

            if (i == nums.length - 1 && nums[i] == con)
                return con + 1;

            if (con != nums[i])
                return con;

            con++;
        }

        return nums[nums.length] + 1;

    }

    public void ms(int[] test) {
        mergeSort(test, 0, test.length);
    }

    public void mergeSort(int[] test, int start, int end) {

        if ((end - start) > 1) {
            int middle = (start + end) / 2;
            mergeSort(test, start, middle); ///// goes to the left
            mergeSort(test, middle, end); //// goes to the right
            merge(test, start, end); //// merge!

        }

        //// what do i do after they are broken up into lil bits

    }

    public void merge(int[] a, int start, int end) {
        int[] merger = new int[end - start];

        int pointLeft = start;
        int pointRight = (start + end) / 2;
        int index = 0;

        while (pointLeft < (start + end) / 2 && pointRight < end) ///// comparing while both sides are in bounds
        {
            if (a[pointLeft] < a[pointRight])
                merger[index++] = a[pointLeft++];

            else
                merger[index++] = a[pointRight++];
        }

        while (pointLeft >= (start + end) / 2 && index < merger.length) /// when the left is out of bounds dump all
                                                                        /// right values until copy is full
        {
            merger[index++] = a[pointRight++];
        }
        while (pointRight >= end && index < merger.length) /// when the right is out of bounds dump left values until
                                                           /// copy is full
        {
            merger[index++] = a[pointLeft++];
        }

        ////// how do I copy the new Array into the old one?
        index = 0;
        for (int i = start; i < end; i++)
            a[i] = merger[index++];

    }

}
