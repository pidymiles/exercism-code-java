import java.lang.Math;
class DifferenceOfSquaresCalculator {
    
    int computeSquareOfSumTo(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += i;
        }
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sum = 0;
        for (int i = 0; i <= input; i++) {
            sum += (i * i);
        }
        return sum;
    }

    int computeDifferenceOfSquares(int input) {
        //Always return positive integer
        return Math.abs((computeSumOfSquaresTo(input) - computeSquareOfSumTo(input)));
    }
}
