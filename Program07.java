
public class Program07 {
 
    String str1 = "Java";
    String str2 = "Graphics";
     
    Thread t1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(str1){
                    synchronized(str2){
                        System.out.println(str1 + str2);
                    }
                }
            }
        }
    };
     
    Thread t2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(str2){
                    synchronized(str1){
                        System.out.println(str2 + str1);
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        Program07 mdl = new Program07();
        mdl.t1.start();
        mdl.t2.start();
    }
}