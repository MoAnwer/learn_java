void main() {
/*
	String[] stringArray = new String[10];

	for(int i = 0; i < stringArray.length; i++) {
	    stringArray[i] = "String No " + i;
	}

	for(int i = 0; i < stringArray.length; i++) {
	    System.out.println( stringArray[i] );
	}



int[][] intArrays = new int[10][20];

for(int i=0; i < intArrays.length; i++){
    for(int j=0; j < intArrays[i].length; j++){
        System.out.println("i: " + i + ", j: " + j);
    }
}


int[] ints   = new int[20];

int insertIndex = 10;
int newValue    = 123;

//move elements below insertion point.
//for(int i=ints.length-1; i > insertIndex; i--){
  //  ints[i] = ints[i-1];
//}

//insert new value
ints[insertIndex] = newValue;

System.out.println(Arrays.toString(ints));


	int[] ints = {2,4,6,8,10, -3, -10, -100};

	int minVal = Integer.MAX_VALUE;

	for (int i = 0; i < ints.length; i++) {
		if (ints[i] < minVal) {
			minVal = ints[i];
		}
	}

	IO.println("minVal = " + minVal);
*/






	int[] source = new int[10];

	for (int i = 0; i < source.length; i++) {
		source[i] = i;
	}

	int[] dest = Arrays.copyOfRange(source, 8, source.length);

	IO.println("Copy: " + Arrays.toString(dest));


	String[] ints = {"m", "a", "d", "w", "r", "v", "b"};

	int index = Arrays.binarySearch(ints, "m");

	IO.println(index);


}
