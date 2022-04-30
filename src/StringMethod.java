import java.util.Locale;

public class StringMethod {
    /*
        Penggunaan metode/fungsi pada string
     */
    public static void main(String[] args) {
        String a = "Cornelius ";
        String b = "Linux";

//        concat() 	Appends a string to the end of another string
        System.out.println(a + b);
        System.out.println(a.concat(b));

//        contains() 	Checks whether a string contains a sequence of characters
        // case-sensitive!! artinya huruf besar/kecil diperhatikan
        a = "Garland";

        // is garland contains land?
        if(a.contains("lad")) {
            System.out.println("a terdapat kata lad");
        } else {
            System.out.println("a tidak terdapat kata lad");
        }

        String database = "Garland Linux Marchel Rel Cindy Dadang Michael";
        String expectedData = "rel";

//        toLowerCase() 	Converts a string to lower case letters 	String
        if(database.toLowerCase().contains(expectedData)) {
            System.out.printf("%s terdaftar di database!\n", expectedData);
        }

        System.out.println(a.indexOf('l'));
    }
}
