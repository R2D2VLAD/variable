public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double dog=8;
        System.out.println(dog);
        var cat=3.6;
        System.out.println(cat);
        var paper=763789;
        System.out.println(paper);
        dog=dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var fighter1= 78.2;
        System.out.println(fighter1);
        var fighter2= 82.7;
        System.out.println(fighter2);
        var totalWeight =fighter1+fighter2;
        System.out.println("Общий вес двух бойцов="+totalWeight+"кг");
        var weightDifference1=fighter2-fighter1;
        System.out.println("Разница между весами бойцов="+weightDifference1+"кг");
        var weightDifference2= (fighter1+fighter2) % fighter1;
        System.out.println("Разница между весами бойцов на "+weightDifference2+"кг");

        var openingHours= 640;
        System.out.println("Общее количество часов="+openingHours);
        var employeeTime=8;
        System.out.println("Каждый сотрудник посвящает работе по "+employeeTime+" часов");
        var totalEmployees= openingHours/employeeTime;
        System.out.println("Всего работников в компании - "+totalEmployees+" человек");
        totalEmployees=totalEmployees+94;
        System.out.println(totalEmployees);
        var watch = openingHours/totalEmployees;
        System.out.println("Если в компании работает 174 человек, то всего по "+watch+" часа работы может быть поделено между сотрудниками");

    }
}