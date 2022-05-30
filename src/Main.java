public class Main {

    /*
    Jenkins configuration

    Repository URL:
    https://<access token>@github.com/<userName>/<repository>.git

    Build step:
    cd src
    javac Main.java
    java Main

    Note: The build step will
    1 Go to src directory
    2 Compile Main.java and generate Main.class
    3 Execute Main class
    See print lines in Jenkins logs
     */

    public static void main(String[] args) {
        System.out.println("Fist line from app");
        System.out.println("Second line from app");
        System.out.println("Third line from app");
    }
}
