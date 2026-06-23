package org.devworks.exceptionHandling;

public class tryCatchBlock {
  public static void main(String[] args) {
    int arr[] = new int[5];
    //        try{
    //            int result = 5/0;
    //            System.out.println(arr[8]);
    //        }catch(ArrayIndexOutOfBoundsException e){
    //            System.out.println("Exception occured");
    //        }catch(ArithmeticException e){
    //            System.out.println("Arithmetic exception");
    //            System.out.println(e.getMessage());
    //            System.out.println(e.getStackTrace());
    //            System.out.println(e);
    //        }

    try {
      int result = 5 / 0;
      System.out.println(arr[8]);
    } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
      System.out.println("Handling exceptions");
    } catch (RuntimeException e) {
      System.out.println("Runtime exception handles");
    } catch (Exception e) {
      System.out.println("All exception handles");
    }
  }
}
