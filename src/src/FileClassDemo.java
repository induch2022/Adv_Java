package src;

public class FileClassDemo {
	
    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileClass myHomePage = new FileClass(FPATH, '/', '.');
        System.out.println("Extension = " + myHomePage.extension());
        System.out.println("Filename = " + myHomePage.filename());
        System.out.println("Path = " + myHomePage.path());
    }
}