package RebuildSequence115;

public class Test {
    public static void main(String[] args) {
        int []nums = {1, 2, 3};
        int [][]sequence = {{1, 2}, {1, 3}};
        boolean isok = Solution.sequenceReconstruction(nums, sequence);
        System.out.println(isok);
    }
}
