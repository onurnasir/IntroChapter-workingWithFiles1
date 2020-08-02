import java.io.File;
import java.io.IOException;
// bu çalışmamızda dosya oluşturduk.
public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\ONUR\\Desktop\\JavaWorks\\files\\students.txt");//Koduzu yazdığımız yere bir "files" olupturup uzaltısını fonsiyonumuza ekledik.
        try { //Bu blok file içinde students.txt oluşturur ve bunun yanında true yada false döndürür.
            //file.createNewFile(); //İlgili uzantıya file oluştur diyoruz. Bu checked exception olduğundan ampulden altındaki satırları otomatik oluşturduk.
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut."); //Kodu ikinciye run yaptığımızda ilkinde oluşturulduğundan else düşüp  dosya zaten mevcut yazdıracaktır.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
