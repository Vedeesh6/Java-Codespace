class LC_smallestmissnonnegintafterop {
    public int findSmallestInteger(int[] nums, int value) {
        int[] modularDivisionRes = new int[value];
        for (int n : nums) {
            int modDivValue = n % value;
            if (modDivValue < 0) {
                modDivValue += value;
            }
            modularDivisionRes[modDivValue]++;
        }

        int min = modularDivisionRes[0];
        int position = 0;
        for (int i = 0; i < value; i++) {
            if (modularDivisionRes[i] < min) {
                position = i;
                min = modularDivisionRes[i];
            }
        }
        return value * min + position;
    }

    static {
        LC_smallestmissnonnegintafterop s = new LC_smallestmissnonnegintafterop();
        int[] arr = new int[1];
        for (int i = 0; i < 250; i++){
            s.findSmallestInteger(arr, 1);
        }

    }
}
