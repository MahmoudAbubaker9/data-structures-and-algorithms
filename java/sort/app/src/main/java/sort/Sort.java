package sort;

public class Sort {

  /////// insertion Sort

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

  ////// Merge Sort

  public void mergeSort (int arr[], int l, int m, int r){
    int i, j, k;

    m = l + (r - l) / 2;

    int n1 = m - l + 1;
    int n2 = r - m;
    int[] L=new int[n1];
    int[] R=new int[n2];

    for (i = 0; i < n1; i++)
      L[i] = arr[l + i];
    for (j = 0; j < n2; j++)
      R[j] = arr[m + 1 + j];

    i = j = 0;
    k = l;

    while (i < n1 && j < n2)
    {
      if (L[i] <= R[j])
      {
        arr[k] = L[i];
        i++;
      }
      else
      {
        arr[k] = R[j];
        j++;
      }
      k++;
    }

    while (i < n1)
    {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2)
    {
      arr[k] = R[j];
      j++;
      k++;
    }
  }

  public int[] merge(int[] arr, int l, int r)
  {
    if (l < r)
    {
      int m = l + (r - l) / 2;
      merge(arr, l, m);
      merge(arr, m + 1, r);
      mergeSort(arr, l, m, r);
    }
    return arr;
  }

  /// Quick Sort

  private static int partition(int[] arr, int left, int right){
    int pivot = arr[right];
    int low = left - 1;
    for (int i = left ; i < right ; i++){
      if (arr[i] <= pivot){
        low++;
        swap(arr, i, low);
      }
    }
    swap(arr, right, low+1);
    return low+1;
  }

  private static void swap(int[] arr, int i, int low){
    int temp = arr[i];
    arr[i] = arr[low];
    arr[low] = temp;
  }



  int[] quick(int[] arr, int left, int right){
    if(left < right){
      int position = partition(arr, left, right);

      quick(arr, left, position - 1);

      quick(arr, position + 1 , right);
    }
    return arr;
  }

}
