package src;

public class FileClass {
	
    private static  String fullPath;
    private static char pathSeparator,extensionSeparator;

    public FileClass(String str, char sep, char ext) {
       this.fullPath = str;//  "/home/user/index.html"
       this.pathSeparator = sep;//  "/"
       this.extensionSeparator = ext;//  "."
    }

    public String extension() {
    	
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // gets filename without extension
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }
    
    

}