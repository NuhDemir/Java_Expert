package ch004.the_final.final_arguments;

import ch004.the_final.final_data.FinalData;

class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(Gizmo g) {
        g = new Gizmo();//g-> not final!!!
        g.spin();
    }

    void without(final Gizmo g) {
//    g=new Gizmo();//Illegal g is final
    }

    int g(final int i) {
        return i + 1;
    }

    void f(final int i) {
//        i++;
        //Can^t change
    }

    //sadece final primitive ise okunur.
    public static void main(String[] args) {
        FinalArguments arguments = new FinalArguments();
        arguments.with(null);
        arguments.without(null);
    }
}


