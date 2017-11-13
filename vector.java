package Vector;

public class vector extends DynVec {
    /**
     * The constructor to initialize the array to a list of integers
     * @param n -> The series of integers
     */
    vector(int ... n) {
        array = n;
    }

    /**
     * The constructor to initialize a value the given times.
     * @param n -> the value of initialization
     * @param times -> the number of times n should be initialized
     */
    vector(int n, int times) {
        array = new int[times];
        for(int y = 0; y < times; y++)
            array[y] = n;
    }

    /**
     * @return the vector as an array of integers
     */
    public int[] ArrType() {
        return array;
    }
}