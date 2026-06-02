void main() {
    int val[] = {1, 2, 3, 4, 5};
    Ex ex = new Ex(val);

    ex.printData(); // Output: Data: [1, 2, 3, 4, 5]

    val[0] = 10; 
    ex.printData(); // Output: Data: [10, 2, 3, 4, 5]


    byte n = 10;

    IO.println(~n);

    int[][] grid = {{1, 2}};
    List<int[]> list = Arrays.asList(grid);
    System.out.println(list.size());

}