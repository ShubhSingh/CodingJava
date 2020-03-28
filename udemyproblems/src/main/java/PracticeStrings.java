public class PracticeStrings {

  public static void main(String[] args) {
    String s = "Happy";
    System.out.println(s.charAt(1));

    if(s.equalsIgnoreCase("happy")) {
      System.out.println("Happy match happy");
    }

    s="Today Happy looks Happy.";
    System.out.println(s.indexOf("Happy"));
    System.out.println(s.indexOf("Happy", 0));
    System.out.println(s.indexOf("Happy", 7));

    System.out.println(s.lastIndexOf("Happy"));
    System.out.println(s.lastIndexOf("Happy", 6));
  }
}
