package ch004.the_final.final_overriding;

import ch004.protected_access.Orc;

class WithFinals {
    //Identical to private alone:
    private final void f() {
        System.out.println("WithFinals.f()");
    }

    //Also automaticcally final:
    private void g() {
        System.out.println("WithFinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    private final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverriding {


    public static void main(String[] args) {
        OverridingPrivate2 overridingPrivate2 = new OverridingPrivate2();
        overridingPrivate2.f();

        overridingPrivate2.g();

        OverridingPrivate o1 = overridingPrivate2;

        o1.f();
        o1.g();

        WithFinals withFinals = overridingPrivate2;
        withFinals.f();
        withFinals.g();
    }
}
