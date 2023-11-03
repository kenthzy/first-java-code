public class ere {
    public static void main (String[]args) {

        ereByJK("Tatlong bilyon, ikaw lamang ang aking gusto\n" +
              "Pasensya na kung ngayon ako'y 'di para sa'yo\n" +
              "Tayo ay papunta na sa'ting bagong yugto\n" +
              "'Yokong mabuhay sa isang mundong walang tayo\n" +
              "\n" +
              "'Di ba? Nakakaputangina\n" +
              "Tayo'y lumilipad, at ako'y iniwan mo\n" +
              "Oh, 'di ba? 'Di ba? 'Di ba? Pinagmukha mo 'kong tanga\n" +
              "Tayo'y lumilipad, at ako'y iniwan mo\n" +
              "Sa ere, ere, ere");
    }
    public static void ereByJK(String song) {

        for (int i = 0; i < song.length(); i++) {
            System.out.print(song.charAt(i));


            try {
                // Add a delay of 50 milliseconds between each letter
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
