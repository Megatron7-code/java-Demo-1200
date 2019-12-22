package com.vm323.d122;

public class MaxMin {
    public static class Result{
        private double max;
        private double min;

        public Result(double max, double min) {
            this.max = max;
            this.min = min;
        }

        public double getMax() {
            return max;
        }

        public double getMin() {
            return min;
        }
    }

    public static Result getResult(double[] array){
        double max = Double.MAX_VALUE;
        double min = Double.MIN_VALUE;
        for(double i : array){
            if(i > max){
                max = i;
            }
            if(i< min){
                min=i;
            }
        }
        return new Result(max, min);
    }
}
