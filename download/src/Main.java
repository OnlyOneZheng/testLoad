import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    teststst
     */

    public static void main(String[] args) {

        String str="http://media.febcchinese.org/streaming/vfs/mavdp001.mp3";
        String substring2 = str.substring(0, str.length() - 4);
        writeWeb(substring2);
        //System.out.println("Hello World!");
    }

    public static void  writeWeb(String str1){
        int numb = Integer.parseInt((str1.substring(str1.length() - 3, str1.length())));
        System.out.println(numb);



        for (int i = 0;i<31;i++ ) {

            DecimalFormat df=new DecimalFormat("000");
            String str2=df.format(numb+i);
            String str=str1.substring(0 , str1.length()-3)+(str2)+".mp3";
            System.out.println(str);
        }
    }
}
