class Solution {
    public int maximumPopulation(int[][] logs) {
        int minYear = Integer.MAX_VALUE;
        int maxYear = Integer.MIN_VALUE;

        for (int[] log : logs) {
            minYear = Math.min(minYear, log[0]);
            maxYear = Math.max(maxYear, log[1]);
        }

        int maxPopulation = 0;
        int earliestYear = minYear;

        for (int year = minYear; year < maxYear; year++) {
            int population = 0;
            for (int[] log : logs) {
               
                if (year >= log[0] && year < log[1]) {
                    population++;
                }
            }
        
            if (population > maxPopulation) {
                maxPopulation = population;
                earliestYear = year;
            }
        }
        return earliestYear;
    }
}
