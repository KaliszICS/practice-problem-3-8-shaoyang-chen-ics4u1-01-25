import java.util.Arrays;

public class PracticeProblem {

    public static void main(String args[]) {

    }

    public static int fib(int num) {
        if (num < 0) {
            return 0;
        }
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int[] knownFibs = new int[num];
        knownFibs[0] = 0;
        knownFibs[1] = 1;
        return fibHelper(num - 1, knownFibs) + fibHelper(num - 2, knownFibs);
    }

    public static int fibHelper(int num, int[] knownFibs) {
        if (knownFibs[num] != 0 || num == 0) {
            return knownFibs[num];
        }
        if (num == 1) {
            return 1;
        }
        if (num < 0) {
            return -1;
        }
        return fibHelper(num - 1, knownFibs) + fibHelper(num - 2, knownFibs);

    }
    public static int[] minimumCost;
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        minimumCost = new int[n + 1];
        Arrays.fill(minimumCost, -1);
        return Math.min(helperMCCS(0, cost), helperMCCS(1, cost));
    }
    public static int helperMCCS(int i1, int[] cost) {
        int n = cost.length;
        if (n == 1) {
            return cost[0];
        }
        if (i1 >= n) {
            return 0;
        }
        if (minimumCost[i1] != -1) {
            return minimumCost[i1];
        }
        minimumCost[i1] = cost[i1] + Math.min(helperMCCS(i1 + 1, cost), helperMCCS(i1 + 2, cost));
        return minimumCost[i1];
    }




}
