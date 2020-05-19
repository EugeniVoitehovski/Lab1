#������������ ������ �� ���� ��.������ 721702 ������������� �������, ������� 8.

# �������������� �����������:
- ������ ANTLR ��� �������� ���������� ����, ��������� ������ � �������.
- ���� � ����������� setCompiler.g4, ������� ��������� � ����� �������. 

# �������� ������ ���������

������� �������� - �������� ����� � ������, � ������ ������ test_1.set
��� ���������� ���������, ��������� ������, ���� �������� �� �������� ����� �������. ������� ��� ������ ������ �������, �������� ���� ������ ������� � ����������� ���������� � ������ �� ����� ���������������� java
��� �������� ����� ���������� �� ����:

```
./src/java/implemented/Visitor.java
```

� ���������� ���������� ������� ������ � ����������� .set, � ������� �������� ��� �� ����� ��������, ���������������� ��������� �������� 8
��� ���������� ������ ��������� ����� �������������� Main.java �� ��������������� ����� � ����������� setCompiler.jar ����. 

# ������������ ���������


## Test_1.set: 
```
global int d = 5;

func int addInt(int p)
    {
        p = p + 2;
        return p;
    }

program
   {
        print("Test");
        int a = 2;
        call show(a);
        int test = call addInt(a);
        if (a == 3)
            {
                print("3, hi");
            }
        else
            {
                print("Its not 3!")
            }
        call show(test);
        element v = "abc";
        set c = {v};
        set h = c * c;
        for (element e : h)
            {
                print(e);
            }
        while (a < 3)
            {
            a = a + 1;
            }
   }
func show(int k)
   {
       print(k);
   }
```
## ��������������� Main.class: 
```java
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

```
��� ������� � ������� �������� ����� ��������� ���� testCompiled.jar � �������� ��������� ���������� � ����������� ���������� ���������������� Main.java. 
# �����: � ���������� ���������� ������������ ������ ���� ����������� ���������, ������� ����������� ���, ���������� �� ����������� �������� � .jar ����
