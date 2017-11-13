package Vector;
/**
 * The interface for the necessary operations regarding the vector itself,
 * such as returning the vector and its elements as an array of integers.
 */
interface arrOp {
    int[] ArrType();
}
/**
 * The interface regarding the addition and removal of elements from the
 * vector itself. The push method() allows the addition of elements wheras
 * the pop() method allows the removal of elements based on the concept of
 * array index.
 */
interface def {
    void push(int var);
    void pop(int index);
}

/**
 * The DynVec class declares and implements the two interfaces namely def and
 * arrOp. The implementation is completed by the vector class.
 */
abstract class DynVec implements def, arrOp {
    int[] array = new int[1];
    private int counter = 0;

    /**
     * The private extend() method serves to extend the limit of the array of
     * integers by one. This is further utilized by the pop() method.
     * @return the new extended array. The added field is not initialized as
     *         it is meant to be initialized immediately by the calling method.
     */
    private int[] extend() {
        int[] xarray = new int[array.length + 1];
        for(int i = 0; i < xarray.length; i++)
            xarray[i] = 0;
        for(int i = 0; i < array.length; i++)
            xarray[i] = array[i];
        return xarray;
    }

    /**
     * The push() method adds a new element to the vector at its end, as in a
     * stack.
     * @param var -> the element to be added at the end of the vector
     */
    public void push(int var) {
        if(counter != array.length) {
            array[counter] = var;
            ++counter;
        } else {
            array = extend();
            array[counter] = var;
            ++counter;
        }
    }

    /**
     * The pop() method exists to remove an element from the existing vector
     * @param index -> the index of the element to be removed
     */
    public void pop(int index) {
        int xarray[] = new int[array.length - 1];
        for(int i = 0, count = (-1); i < array.length; i++)
            if(i != index)
                xarray[++count] = array[i];
        array = xarray;
    }
}
