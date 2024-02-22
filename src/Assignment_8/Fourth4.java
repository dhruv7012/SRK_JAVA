package Assignment_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Fourth4 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();

        l.add("Dhruv");
        l.add("AntiMehar");
        l.add("AncljeetShree");
        l.add("AntiSolOngstringdoenstmeanuanyrhing");
        l.add("");
        l.add("");
        l.add("");

        System.out.print("Before :: ");
        System.out.println(l);

        RemoveEmpties c = lst -> {
            while (lst.contains("")) {
                lst.remove("");
            }
        };

        c.RemoveE(l);

        System.out.print("After :: ");
        System.out.println(l);
    }
}

interface RemoveEmpties {

    public void RemoveE(List<String> lst);

}
