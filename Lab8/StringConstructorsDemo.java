public class StringConstructorsDemo{
    public static void main(String[] args){
        char[] a={'M','a','r','y',' ','h','a','d',' ','a',' ','l','i','t','t','l','e',' ','l','a','m','b'};
        String s1=new String(a);
        String s2="little lambs, little lambs";
        String s3=new String("Mary had a little lamb");
        String s4="it's fleece was white as snow";
        String s5=new String(s4);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s5);
        int len=s1.length()+s2.length()+s3.length()+s5.length();
        System.out.println("Length of string = "+len);
    }
}
