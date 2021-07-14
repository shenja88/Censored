import java.util.ArrayList;
import java.util.List;

public class Censor {
    private List<String> text;
    private List<String> censor;
    private int numLineForCensor = 0;

    public Censor(List<String> text, List<String> censor) {
        this.text = text;
        this.censor = censor;
    }

    public Censor() {
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<String> getCensor() {
        return censor;
    }

    public void setCensor(List<String> censor) {
        this.censor = censor;
    }

    public void viewText() {
        System.out.println("Text for censored:");
        for (String strings : text) {
            System.out.println(strings);
        }
    }

    public void viewBlacklist() {
        System.out.println();
        System.out.println("Blacklist: ");
        for (String strings : censor) {
            System.out.print(strings + " ");
        }
        System.out.println();
    }

    public void checkCens(List<String> str, List<String> cens) {
        List<String> forCensor = new ArrayList<>();
        for (String s : str) {
            String[] line = s.split(" ");
            for (String value : line) {
                for (String cen : cens) {
                    if (value.equalsIgnoreCase(cen)) {
                        numLineForCensor++;
                        forCensor.add(s);
                        break;
                    }
                }
            }
        }
        if (forCensor.isEmpty()) {
            System.out.println("\nThe text was successfully censored.");
        } else {
            System.out.println("\nThe text was not censored.");
            System.out.println("The number of lines that were not censored: " + numLineForCensor + "\nStrings:");
            for (String s : forCensor) {
                System.out.println(s);

            }
        }
    }
}
