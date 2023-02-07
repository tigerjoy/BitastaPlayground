import java.util.Scanner;
class DecimalToRomanNumeral
{
  void convert(int num)
  {
    int temp = num;
    // String symbols[] = {"I", "II", "III", "IV", "V", "VI", "VII", 
    //                     "VIII", "IX", "X", "XL", "L", "XC", "C", 
    //                     "CD", "D", "CM", "M"};
    String symbols[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", 
                        "CD", "D", "CM", "M"};
    int values[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 
                    400, 500, 900, 1000};
    String romanNumeral = "";
    for(int i = values.length - 1; i >= 0; i--){
      int quotient = num / values[i];
      for(int ctr = 1; ctr <= quotient; ctr++){
        romanNumeral += symbols[i];
      }
      num %= values[i];
    }
    System.out.println(temp + " = " + romanNumeral);
  }
  public static void main(String args[]){
    DecimalToRomanNumeral obj = new DecimalToRomanNumeral();
    for(int i = 1; i <= 3999; i++){
      obj.convert(i);
    }
  }
}