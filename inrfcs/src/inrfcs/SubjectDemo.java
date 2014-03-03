package inrfcs;

/* пример # 6 : создание объекта, доступ к полям и
методам объекта : SubjectDemo.java */



public class SubjectDemo {
public static void main(String[] args) {
Subject ob = new Subject ("Балаганов");
ob.name = "Шура Балаганов";
//ob.age = 19;// поле недоступно
ob.setAge(19);
ob.show();
}
}