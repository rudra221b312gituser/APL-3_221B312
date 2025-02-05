abstract class Bharatvanshi {
    abstract void fight();
    abstract void obey();
    abstract void kind();
}

class Pandav extends Bharatvanshi {
    void fight() {
        System.out.println("Pandav fights with skills.");
    }

    void obey() {
        System.out.println("Pandav is obedient.");
    }

    void kind() {
        System.out.println("Pandav is kind.");
    }
}

class Kaurav extends Bharatvanshi {
    void fight() {
        System.out.println("Kaurav fights with skills.");
    }

    void obey() {
        System.out.println("Kaurav disobeys.");
    }

    void kind() {
        System.out.println("Kaurav is cruel.");
    }
}

class Arjun extends Pandav {}

class Bheem extends Pandav {
    void kind() {
        System.out.println("Bheem is less kind.");
    }
}

class Duryodhan extends Kaurav {}

class Vikarn extends Kaurav {
    void obey() {
        System.out.println("Vikarn is obedient.");
    }

    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

public class TestInheritance {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
