class Solution {
    public int maximumGroups(int[] grades) {
        int n = grades.length;
        int groups = 0;
        int studentsNeeded = 1;

        while (n >= studentsNeeded) {
            groups++;
            n -= studentsNeeded;
            studentsNeeded++;
        }

        return groups;
    }
}
