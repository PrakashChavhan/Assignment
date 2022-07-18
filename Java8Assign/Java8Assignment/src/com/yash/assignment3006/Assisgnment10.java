package com.yash.assignment3006;




import java.util.*;
import java.util.stream.Collectors;
class Emp1
{
String name;
int id;
public Emp1(String name, int id) {

this.name = name;
this.id = id;

}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}

}
public class Assisgnment10 {



public static void main(String[] args) {
// TODO Auto-generated method stub
ArrayList<Emp1> I=new ArrayList<Emp1>();
I.add(new Emp1("harish",1));
I.add(new Emp1("abhi",2));
I.add(new Emp1("namdev",3));




Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
System.out.println(empMap);

Set<String> nameSet = I.stream().map(e->e.name).collect(Collectors.toSet());

System.out.println(nameSet);






}



}