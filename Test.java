/**
 * Created by Ayush on 07-09-2016.
 */
import loging.Level;
import loging.Loger;
import loging.FileController;
import loging.SocketController;

public class Test {

    static Loger loger = Loger.getLoger(Test.class.getName());
    static Loger loger1 = Loger.getLoger("mylog");



    public static void main(String[] args) {

        System.out.println(loger+""+loger1+""+loger1.getLogerName());

        //loger.addController(fc);
        //loger.log(Level.WARNING,"warning message");
        SocketController sc = new SocketController(5000,"localhost");
        loger.addController(sc);

        FileController fc = new FileController("C:\\Users\\AyushN\\IdeaProjects\\Project1\\file1.txt");
        loger1.addController(fc);

        System.out.println(loger.controller+""+loger1.controller);

        loger.log(Level.WARNING,"warning");

        loger1.log(Level.SEVERE,"severe");



    }
}
