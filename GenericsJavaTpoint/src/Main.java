import java.util.*;
public class Main {
}


//class TestGenerics1{
//    public static void main(String args[]){
//        ArrayList<String> list=new ArrayList<String>();
//        list.add("rahul");
//        list.add("jai");
////        list.add(32);//compile time error
//
//        String s=list.get(1);//type casting is not required
//        System.out.println("element is: "+s);
//
//        Iterator<String> itr=list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
//    }
//}

//type safe обжект дамжуулах зорилготой, Мөн кодыг илүү алдаа илрүүлэхэд амар хялбар болгож өгдөг. Эмхэтгэх үеийн алдааг шууд буцаадаг.

class TestGenerics2{
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"vijay");
        map.put(4,"umesh");
        map.put(2,"ankit");

//Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e=itr.next();//no need to typecast
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }}

class MyGen<T>{
    T obj;
    void add(T obj){this.obj=obj;}
    T get(){return obj;}
}

class TestGenerics3{
    public static void main(String args[]){
        MyGen<Double> m=new MyGen<Double>();
        m.add(22.1);
//m.add("vivek");//Compile time error
        System.out.println(m.get());
    }}

