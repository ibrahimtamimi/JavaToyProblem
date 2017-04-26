// one class needs to have a main() method
public class HelloWorld {


    // Method for getting the minimum value
    public static int[] getMin(int[] inputArray){
      int temp;
      for(int i=0; i<inputArray.length; i++){
        for (int j =0; j<inputArray.length; j++ ) {
            if(inputArray[i] < inputArray[j]){
                temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
            }
        }
      }
      return inputArray;
    }


  // arguments are passed using the text field below this editor
  public static void main(String[] args){
   int array[] = new int[]{10, 11, 88, 2, 12, 120};
   int res[] = getMin(array);
   String intArrayString = Arrays.toString(res);
   System.out.println(intArrayString);
  }

}
