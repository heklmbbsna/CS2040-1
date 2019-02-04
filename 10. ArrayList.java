class myArrayList <T> {
    /* ArrayList.class overrides java.util.ArrayList
     * hence TestArrayList.java will look at ArrayList.class
     * to find the add() method (which does not exist, resulting
     * in compilation error).
     *
     * solution is to rename class name in ArrayList.java, delete
     * ArrayList.class and recompile ArrayList.java to create 
     * myArrayList.class that does not override java.util.ArrayList.
     */
}
