package Tool;

import java.io.*; 
import java.util.*; 
  
public class LineCounter 
{ 
    
    List<File> list = new ArrayList<File>(); 
    int linenumber = 0; 
      
    FileReader fr = null; 
    BufferedReader br = null; 
  
    public void counter(String projectName,String currentName) 
    { 
   //   String path = System.getProperty("user.dir"); 
    	int length=currentName.length()+5;
  
        String path = LineCounter.class.getResource("/").getPath();  
        System.out.println(path); //
        
        path = path.substring(0, path.length()- length) + projectName + "/src"; 
        System.out.println(path); //
        File file = new File(path); 
        File files[] = null; 
        files = file.listFiles(); 
        addFile(files); 
        isDirectory(files); 
        readLinePerFile(); 
        System.out.println("Totle:" + linenumber + "��"); 
    } 
  
    public void isDirectory(File[] files) { 
        for (File s : files) { 
            if (s.isDirectory()) { 
                File file[] = s.listFiles(); 
                addFile(file); 
                isDirectory(file); 
                continue; 
            } 
        } 
    } 
  
   
    public void addFile(File file[]) { 
        for (int index = 0; index < file.length; index++) { 
            list.add(file[index]); 
            // System.out.println(list.size()); 
        } 
    } 
      
 
    public void readLinePerFile() { 
        try { 
            for (File s : list) { 
                int yuan = linenumber; 
                if (s.isDirectory()) { 
                    continue; 
                } 
                fr = new FileReader(s); 
                br = new BufferedReader(fr); 
                String i = ""; 
                while ((i = br.readLine()) != null) { 
                    if (isBlankLine(i)) 
                        linenumber++; 
                } 
                System.out.print(s.getName()); 
                System.out.println("\t\t��" + (linenumber - yuan) + "��"); 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } finally { 
            if (br != null) { 
                try { 
                    br.close(); 
                } catch (Exception e) { 
                } 
            } 
            if (fr != null) { 
                try { 
                    fr.close(); 
                } catch (Exception e) { 
                } 
            } 
        } 
    } 
  
   
    public boolean isBlankLine(String i) { 
        if (i.trim().length() == 0) { 
            return false; 
        } else { 
            return true; 
        } 
    } 
     
}
