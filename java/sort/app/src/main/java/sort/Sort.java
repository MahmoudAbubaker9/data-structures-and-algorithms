package sort;

public class Sort {

  public int[] insertionSort(int[] array){
    int n = array.length;

    if(n <= 1){
      return array;
    }
    int j;
    for(int i = 1 ; i< n; i++){
      int key = array[i];
      j = i-1;
      while ( j>=0 && key < array[j]){
        array[j+1] = array[j];
        j = j-1;
      }
      array[j+1] = key;
    }
    return array;
  }

}
