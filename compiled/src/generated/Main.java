package generated; 

public class Main {
public static void main (String args[]){
try{
program();} catch (Exception ex){ex.printStackTrace();}
}

private static int d=5;
private static int addInt(int p){
p=p+2;
return p;
}
private static void show(int k){
System.out.println(String.valueOf(k));
}
private static void program () {
System.out.println(String.valueOf("Test"));
System.out.println(String.valueOf("Test"));
System.out.println(String.valueOf("Test"));
System.out.println(String.valueOf("Test"));
int a=2;
show (a);
int test=addInt (a);
if (a==3) {
System.out.println(String.valueOf("3, hi"));
}
 else {
System.out.println(String.valueOf("Its not 3!"));
}
show (test);
Element v=new Element("abc");
Set c=new Set();
c.add(v);
Set h=Set.union(c,c);
for (Element e:h){
System.out.println(String.valueOf(e));
}
while (a<3){
a=a+1;
}
}

}
