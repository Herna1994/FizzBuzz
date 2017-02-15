public class FizzBuzzTest {

 @Test
 public void makeFizzbuzz() {
  FizzBuzz instancia=new FizzBuzz();
  int rightValues[]={0,1,3,5,10,11,15,19,20,23,30,100,101};
  String rightResults[]={"","one","Fizz","Buzz","Fizz","eleven","Fizzbuzz","nineteen","twenty","twenty three","Fizzbuzz",
    "one hundred",""};
  for (int i = 0; i < rightResults.length; i++) {
   assertEquals(rightResults[i], instancia.makeFizzBuzz(rightValues[i]));
  }
  int wrongValues[]={3,15,30};
  String wrongResults[]={"three","five","thirty"};
  for (int i = 0; i < wrongResults.length; i++) {
   assertEquals(wrongResults, instancia.makeFizzBuzz(wrongValues[i]));
  }
 }
}
