#Лабораторная работа по ЯПИС ст.группы 721702 Войтеховского Евгения, вариант 8.

# Использованные инструменты:
- Модуль ANTLR для создания грамматики язык, генерации лексем и парсера.
- Файл с грамматикой setCompiler.g4, который находится в корне проекта. 

# Описание работы программы

Входной аргумент - название файла с языком, в данном случае test_1.set
При выполнении программы, создается дерево, узлы которого мы посещаем через визитор. Визитор при обходе дерева разбора, посещает узлы дерева разбора и преобразует информацию в строку на языке программирования java
Код визитора можно посмотреть по пути:

```
./src/java/implemented/Visitor.java
```

В приложении происходит парсинг файлов с расширением .set, в которых прописан код на языке множеств, соответствующего свойствам варианта 8
При выполнении данной программы будут сгенерированны Main.java со сгенерированным кодом и исполняемый setCompiler.jar файл. 

# Тестирование программы


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
## Сгенерированный Main.class: 
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
Для быстрой и удобной проверки можно запустить файл testCompiled.jar и сравнить результат выполнения с результатом выполнения сгенерированного Main.java. 
# Вывод: В результате выполнения лабораторной работы была реализована программа, которая компилирует код, написанный на псевдоязыке множеств в .jar файл
