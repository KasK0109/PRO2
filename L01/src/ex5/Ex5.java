package ex5;

import java.io.File;

public class Ex5 {
    public static void main(String[] args) {
        scanDir("C:\\Users\\kaare\\IdeaProjects\\PRO1");
    }

    public static void scanDir(String path) {
        scanDir(path, 0);
    }

    private static void scanDir(String path, int level) {
        File f = new File(path);
        if (f.isFile() && f.getName().charAt(0) != '.') {
            System.out.println(fill(level) + "File: " + f.getName());
        } else if (f.isDirectory()) {
            String absPath = f.getAbsolutePath();
            System.out.println(fill(level) + "Directory: " + absPath);
            for (String s : f.list()) {
                scanDir(absPath + "/" + s, level + 1);
            }
        }
    }

    private static String fill(int level) {
        String s = "";
        for (int i = 0; i < level; i++) {
            s += "    ";
        }
        s += "" + level + " ";
        return s;
    }
}
