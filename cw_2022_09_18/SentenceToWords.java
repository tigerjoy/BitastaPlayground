class SentenceToWords{
  public static void main(String[]args){
    // #1
    // String input = "APPLE BANANA ORANGE";
    // String words[] = input.split(" ");
    // for(String word: words)
    // {
    //   System.out.println(word);
    // }















    // #2
    // String input = " APPLE  BANANA  ORANGE";
    // String words[] = input.split(" ");
    // for(int i = 0; i < words.length; i++)
    // {
    //   System.out.println((i+1) + ": " +  words[i]);
    // }























    // #3
    String input = " APPLE  BANANA  ORANGE";
    System.out.println("ORIGINAL: #" + input + "#");
    input = input.trim();
    input = input.replaceAll("\\s+", " ");
    System.out.println("MODIFIED: #" + input + "#");
    String words[] = input.split(" ");
    for(int i = 0; i < words.length; i++)
    {
      System.out.println((i+1) + ": " +  words[i]);
    }
  }
}