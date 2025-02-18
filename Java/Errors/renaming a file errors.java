import java.io.File;
class Main {
  public static void main(String[] args) {

    // create a file object
    File file = new File("oldName");
      
    // create a file
    try {
      file.createNewFile();
    }
    
    
    catch(Exception e) {
      e.getStackTrace();
    }

    // create an object that contains the new name of file
    File newFile = new File("oldName");

    // change the name of file
    boolean value = file.renameTo(newFile);

    if(value == true) {
      System.out.println("The name of the file is changed.");
    }
    else {
      System.out.println("The name cannot be changed.");
    }
  }
}
