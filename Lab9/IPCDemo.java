import java.io.*;
class Sender extends Thread{
    PipedOutputStream pout;
    Sender(PipedOutputStream pout){
        this.pout=pout;
    }
    public void run(){
        try{
            String msg="Hello from Sender";
            pout.write(msg.getBytes());
            pout.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
class Receiver extends Thread{
    PipedInputStream pin;
    Receiver(PipedInputStream pin){
        this.pin=pin;
    }
    public void run(){
        try{
            int ch;
            while((ch=pin.read())!=-1){
                System.out.print((char) ch);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
public class IPCDemo{
    public static void main(String[] args) throws IOException{
        PipedOutputStream pout=new PipedOutputStream();
        PipedInputStream pin=new PipedInputStream(pout);
        Sender s=new Sender(pout);
        Receiver r=new Receiver(pin);
        s.start();
        r.start();
    }
}
