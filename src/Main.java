public class Main {
    public static void main(String[] args)
    {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper += 4;
        System.out.println(paper);
        dog -= 3.5;
        System.out.println(dog);
        cat -= 1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        if (boxer2 >= boxer1) {
            System.out.println(boxer2 - boxer1);
            System.out.println(boxer2 % boxer1);
        } else {
            System.out.println(boxer1 - boxer2);
            System.out.println(boxer1 % boxer2);
        }
        var time = 640;
        var people = time / 8;
        System.out.println("Всего работников в компании — " + people +" человек");
        people += 94;
        System.out.println("Если в компании работает " + people + " человек, то всего " + time / people + " часов работы может быть поделено между сотрудниками");

    }
}