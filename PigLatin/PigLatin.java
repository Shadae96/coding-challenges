package PigLatin;


public class PigLatin {

    public static void main(String[] args) {

      /*here we are calling the function and giving it a word then printing out the piglatin word */

      convertToPigLatin("Kevin");
      System.out.println(convertToPigLatin("Kevin"));

    }




  public static String convertToPigLatin (String word){

// 1st solution without stringbuilder

  
  // Creating a new substring from the word that was inputed and removing the first character

      String temp = word.substring(1);

  // setting our variable temp equal to the variable then adding the removed character to end of the word.
      temp = temp + word.charAt(0);

  // setting the variable equal to the variable then adding ay

      temp = temp + "ay";

  // return our variable

      return temp;


  }







  /* second solution using Stringbuilder - Stringbuilder allows us to manipulate the current String w/0 creating an entirely new String */

    // public static String convertToPigLatin (String word){
    //     StringBuilder sb = new StringBuilder(word);

  //   /*delete the first character */
  //     sb.deleteCharAt(0);

  //     // append the first character to the end of the word
  //     sb.append(word.charAt(0));

  //     /*add an ay to the end of the word */
  //     sb.append("ay");

  //     /*after all the manipulation the input is no longer a string so we have to use the toString method to return a string because this method is expecting a String to be returned.  */

  //     return sb.toString();

  //   }
   
}

