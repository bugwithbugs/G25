class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        int maxArrValue = 100001;
        int[] freqArr = new int[maxArrValue];
        for(int i = 0; i < n; i++)
        freqArr[arr[i]]++;

        Arrays.sort(freqArr);

        int sum = 0;
        for(int i = maxArrValue - 1; i >= 0; i--){
            if(sum>=n/2)
            return maxArrValue - i;
        }

        return 1;
    }
}