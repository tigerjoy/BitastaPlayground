import java.util.Scanner;
import java.util.StringTokenizer;

class CommonWordsInSentence {
  String sentences[];
  String wordArray[][];
  String paragraph;
  final String SENTENCE_DELIMETERS = ".?!";
  final String WORD_DELIMETERS = " ";
  final int MAX_ALLOWED_SENTENCES = 2;

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("INPUT: ");
    paragraph = sc.nextLine();
  }

  void displaySentences() {
    StringTokenizer strTok = new 
      StringTokenizer(paragraph, SENTENCE_DELIMETERS, true);
    while (strTok.hasMoreTokens()) {
      String sentence = strTok.nextToken();
      String delimeter = strTok.nextToken();
      sentence += delimeter;
      System.out.println(sentence.trim());
    }
  }

  int countFrequency(String word, String wordArray[]) {
    int count = 0;
    for (int i = 0; i <= wordArray.length - 1; i++) {
      if (wordArray[i].length() != 0 &&
          word.equals(wordArray[i])) {
        count++;
        wordArray[i] = "";
      }
    }
    return count;
  }

  void displayCommonWordFrequency() {
    // Extract the sentences
    StringTokenizer strTok = new 
      StringTokenizer(paragraph, SENTENCE_DELIMETERS);
    sentences = new String[strTok.countTokens()];
    int index = 0;
    while (strTok.hasMoreTokens()) {
      String sentence = strTok.nextToken();
      sentences[index] = sentence;
      index++;
    }

    // Extract the words for each sentence
    wordArray = new String[sentences.length][];
    for (int i = 0; i <= sentences.length - 1; i++) {
      StringTokenizer wordTok = new 
        StringTokenizer(sentences[i], WORD_DELIMETERS);
      wordArray[i] = new String[wordTok.countTokens()];
      index = 0;
      while (wordTok.hasMoreTokens()) {
        wordArray[i][index] = wordTok.nextToken();
        index++;
      }
    }

    // Find and display the common words
    boolean commonWordsFound = false;
    for (int i = 0; i <= wordArray[0].length - 1; i++) {
      int countCommonOccurences = 0;
      String word = wordArray[0][i];
      if (word.length() != 0) {
        for (int j = 1; j <= wordArray.length - 1; j++) {
          countCommonOccurences += 
            countFrequency(word, wordArray[j]);
        }
        if (countCommonOccurences > 0) {
          if (!commonWordsFound) {
            System.out.printf("%-12s\t\t%-9s\n", 
              "COMMON WORDS", "FREQUENCY");
          }
          commonWordsFound = true;
          countCommonOccurences += 
            countFrequency(word, wordArray[0]);
          System.out.printf("%-12s\t\t%-9d\n", 
            word, countCommonOccurences);
        }
      }
    }

    if (!commonWordsFound) {
      System.out.println("NO COMMON WORDS");
    }
  }

  boolean isValidInput() {
    StringTokenizer strTok = new 
      StringTokenizer(paragraph, SENTENCE_DELIMETERS);
    return strTok.countTokens() == MAX_ALLOWED_SENTENCES;
  }

  public static void main(String args[]) {
    CommonWordsInSentence obj = new CommonWordsInSentence();
    obj.input();
    if (obj.isValidInput()) {
      obj.displaySentences();
      obj.displayCommonWordFrequency();
    } else {
      System.out.println("INVALID INPUT");
    }
  }
}